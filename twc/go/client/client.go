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

// 签字人
type ContractFlowSigner struct {
	// 签署顺序
	SignOrder *int64 `json:"sign_order,omitempty" xml:"sign_order,omitempty"`
	// 签署状态, 0-待签, 1-未签, 2-已签 3-待审批 4-拒签
	SignStatus *int64 `json:"sign_status,omitempty" xml:"sign_status,omitempty"`
	// 签署人账号id
	SignerAccountId *string `json:"signer_account_id,omitempty" xml:"signer_account_id,omitempty"`
	// 签署人名称
	SignerName *string `json:"signer_name,omitempty" xml:"signer_name,omitempty"`
	// 签署人是否已实名
	SignerRealName *bool `json:"signer_real_name,omitempty" xml:"signer_real_name,omitempty"`
	// 签约主体的账号id（个人/企业）；如签署人本签署，则返回签署人账号id；如签署人代机构签署，则返回机构账号id
	SignerAuthorizedAccountId *string `json:"signer_authorized_account_id,omitempty" xml:"signer_authorized_account_id,omitempty"`
	// 签约主体名称
	SignerAuthorizedAccountName *string `json:"signer_authorized_account_name,omitempty" xml:"signer_authorized_account_name,omitempty"`
	// 签署主体是否已实名
	SignerAuthorizedAccountRealName *bool `json:"signer_authorized_account_real_name,omitempty" xml:"signer_authorized_account_real_name,omitempty"`
	// 签署主体类型, 0-个人, 1-机构
	SignerAuthorizedAccountType *int64 `json:"signer_authorized_account_type,omitempty" xml:"signer_authorized_account_type,omitempty"`
	// 本次签署任务对应指定的第三方业务流水号id，当存在多个第三方业务流水号id时，返回多个，并逗号隔开
	ThirdOrderNo *string `json:"third_order_no,omitempty" xml:"third_order_no,omitempty"`
}

func (s ContractFlowSigner) String() string {
	return tea.Prettify(s)
}

func (s ContractFlowSigner) GoString() string {
	return s.String()
}

func (s *ContractFlowSigner) SetSignOrder(v int64) *ContractFlowSigner {
	s.SignOrder = &v
	return s
}

func (s *ContractFlowSigner) SetSignStatus(v int64) *ContractFlowSigner {
	s.SignStatus = &v
	return s
}

func (s *ContractFlowSigner) SetSignerAccountId(v string) *ContractFlowSigner {
	s.SignerAccountId = &v
	return s
}

func (s *ContractFlowSigner) SetSignerName(v string) *ContractFlowSigner {
	s.SignerName = &v
	return s
}

func (s *ContractFlowSigner) SetSignerRealName(v bool) *ContractFlowSigner {
	s.SignerRealName = &v
	return s
}

func (s *ContractFlowSigner) SetSignerAuthorizedAccountId(v string) *ContractFlowSigner {
	s.SignerAuthorizedAccountId = &v
	return s
}

func (s *ContractFlowSigner) SetSignerAuthorizedAccountName(v string) *ContractFlowSigner {
	s.SignerAuthorizedAccountName = &v
	return s
}

func (s *ContractFlowSigner) SetSignerAuthorizedAccountRealName(v bool) *ContractFlowSigner {
	s.SignerAuthorizedAccountRealName = &v
	return s
}

func (s *ContractFlowSigner) SetSignerAuthorizedAccountType(v int64) *ContractFlowSigner {
	s.SignerAuthorizedAccountType = &v
	return s
}

func (s *ContractFlowSigner) SetThirdOrderNo(v string) *ContractFlowSigner {
	s.ThirdOrderNo = &v
	return s
}

// 核验请求时对应的存证元数据
type NotaryCheckMeta struct {
	// 对应的法院编号
	AgencyCode *string `json:"agency_code,omitempty" xml:"agency_code,omitempty"`
	// 哈希算法, notary_type 为 HASH 时此参数必填
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty"`
	// 存证内容
	NotaryContent *string `json:"notary_content,omitempty" xml:"notary_content,omitempty" require:"true"`
	// 交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 应用ID
	ApplicationCode *string `json:"application_code,omitempty" xml:"application_code,omitempty"`
}

func (s NotaryCheckMeta) String() string {
	return tea.Prettify(s)
}

func (s NotaryCheckMeta) GoString() string {
	return s.String()
}

func (s *NotaryCheckMeta) SetAgencyCode(v string) *NotaryCheckMeta {
	s.AgencyCode = &v
	return s
}

func (s *NotaryCheckMeta) SetHashAlgorithm(v string) *NotaryCheckMeta {
	s.HashAlgorithm = &v
	return s
}

func (s *NotaryCheckMeta) SetNotaryContent(v string) *NotaryCheckMeta {
	s.NotaryContent = &v
	return s
}

func (s *NotaryCheckMeta) SetTxHash(v string) *NotaryCheckMeta {
	s.TxHash = &v
	return s
}

func (s *NotaryCheckMeta) SetApplicationCode(v string) *NotaryCheckMeta {
	s.ApplicationCode = &v
	return s
}

// 供应商对应的产品详细信息
type SupplierProductInfo struct {
	// 产品额外信息
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 产品id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty" require:"true"`
	// 电子商品唯一标识码
	ProductImeiId *string `json:"product_imei_id,omitempty" xml:"product_imei_id,omitempty" require:"true"`
	// 产品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 采购产品的个数
	ProductNumber *int64 `json:"product_number,omitempty" xml:"product_number,omitempty" require:"true"`
	// 采购产品的价格，精确到毫厘，如12.34元表示为123400
	ProductPrice *int64 `json:"product_price,omitempty" xml:"product_price,omitempty" require:"true"`
	// 产品版本
	SupplierVersion *string `json:"supplier_version,omitempty" xml:"supplier_version,omitempty"`
}

func (s SupplierProductInfo) String() string {
	return tea.Prettify(s)
}

func (s SupplierProductInfo) GoString() string {
	return s.String()
}

func (s *SupplierProductInfo) SetExtraInfo(v string) *SupplierProductInfo {
	s.ExtraInfo = &v
	return s
}

func (s *SupplierProductInfo) SetProductId(v string) *SupplierProductInfo {
	s.ProductId = &v
	return s
}

func (s *SupplierProductInfo) SetProductImeiId(v string) *SupplierProductInfo {
	s.ProductImeiId = &v
	return s
}

func (s *SupplierProductInfo) SetProductName(v string) *SupplierProductInfo {
	s.ProductName = &v
	return s
}

func (s *SupplierProductInfo) SetProductNumber(v int64) *SupplierProductInfo {
	s.ProductNumber = &v
	return s
}

func (s *SupplierProductInfo) SetProductPrice(v int64) *SupplierProductInfo {
	s.ProductPrice = &v
	return s
}

func (s *SupplierProductInfo) SetSupplierVersion(v string) *SupplierProductInfo {
	s.SupplierVersion = &v
	return s
}

// 可信存证身份识别信息
type Identity struct {
	// 经办人姓名，企业认证选填
	Agent *string `json:"agent,omitempty" xml:"agent,omitempty"`
	// 经办人身份证，企业认证选填
	AgentId *string `json:"agent_id,omitempty" xml:"agent_id,omitempty"`
	// 用户名称
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 证件号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 证件类型，个人只支持身份证IDENTITY_CARD，企业支持UNIFIED_SOCIAL_CREDIT_CODE（统一社会信用代码）和ENTERPRISE_REGISTERED_NUMBER（企业工商注册号）
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 法人姓名，企业认证必选
	LegalPerson *string `json:"legal_person,omitempty" xml:"legal_person,omitempty"`
	// 法人身份证，企业认证必选
	LegalPersonId *string `json:"legal_person_id,omitempty" xml:"legal_person_id,omitempty"`
	// 用户手机号码
	MobileNo *string `json:"mobile_no,omitempty" xml:"mobile_no,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 用户类型，PERSON或者ENTERPRISE
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty" require:"true"`
	// 经办人证件类型，企业认证选填
	AgentCertType *string `json:"agent_cert_type,omitempty" xml:"agent_cert_type,omitempty"`
	// 法人证件类型，企业认证必选
	LegalPersonCertType *string `json:"legal_person_cert_type,omitempty" xml:"legal_person_cert_type,omitempty"`
}

func (s Identity) String() string {
	return tea.Prettify(s)
}

func (s Identity) GoString() string {
	return s.String()
}

func (s *Identity) SetAgent(v string) *Identity {
	s.Agent = &v
	return s
}

func (s *Identity) SetAgentId(v string) *Identity {
	s.AgentId = &v
	return s
}

func (s *Identity) SetCertName(v string) *Identity {
	s.CertName = &v
	return s
}

func (s *Identity) SetCertNo(v string) *Identity {
	s.CertNo = &v
	return s
}

func (s *Identity) SetCertType(v string) *Identity {
	s.CertType = &v
	return s
}

func (s *Identity) SetLegalPerson(v string) *Identity {
	s.LegalPerson = &v
	return s
}

func (s *Identity) SetLegalPersonId(v string) *Identity {
	s.LegalPersonId = &v
	return s
}

func (s *Identity) SetMobileNo(v string) *Identity {
	s.MobileNo = &v
	return s
}

func (s *Identity) SetProperties(v string) *Identity {
	s.Properties = &v
	return s
}

func (s *Identity) SetUserType(v string) *Identity {
	s.UserType = &v
	return s
}

func (s *Identity) SetAgentCertType(v string) *Identity {
	s.AgentCertType = &v
	return s
}

func (s *Identity) SetLegalPersonCertType(v string) *Identity {
	s.LegalPersonCertType = &v
	return s
}

// 电子合同文档的下载地址
type ContractDocAddress struct {
	// 电子合同文档ID
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 电子合同文档名称，默认文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 电子合同下载文档地址, 有效时间1小时
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty" require:"true"`
	// 合同文件的存证地址
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s ContractDocAddress) String() string {
	return tea.Prettify(s)
}

func (s ContractDocAddress) GoString() string {
	return s.String()
}

func (s *ContractDocAddress) SetFileId(v string) *ContractDocAddress {
	s.FileId = &v
	return s
}

func (s *ContractDocAddress) SetFileName(v string) *ContractDocAddress {
	s.FileName = &v
	return s
}

func (s *ContractDocAddress) SetFileUrl(v string) *ContractDocAddress {
	s.FileUrl = &v
	return s
}

func (s *ContractDocAddress) SetTxHash(v string) *ContractDocAddress {
	s.TxHash = &v
	return s
}

// 融资租赁订单额外信息
type LeaseOrderExtra struct {
	// 额外信息的主键
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// 额外信息的值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s LeaseOrderExtra) String() string {
	return tea.Prettify(s)
}

func (s LeaseOrderExtra) GoString() string {
	return s.String()
}

func (s *LeaseOrderExtra) SetKey(v string) *LeaseOrderExtra {
	s.Key = &v
	return s
}

func (s *LeaseOrderExtra) SetValue(v string) *LeaseOrderExtra {
	s.Value = &v
	return s
}

// 平台方自动签署区信息
type ContractPlatformSignField struct {
	// 是否添加签署时间戳，默认不添加，时间格式如"2019-03-11 10:12:12"
	AddSignTime *bool `json:"add_sign_time,omitempty" xml:"add_sign_time,omitempty"`
	// 签署区顺序，默认1,且不小于1，顺序越小越先处理
	Order *int64 `json:"order,omitempty" xml:"order,omitempty"`
	// 页码信息，当签署区signType为2时, 页码可以'-'分割, 其他情况只能是数字
	PosPage *string `json:"pos_page,omitempty" xml:"pos_page,omitempty" require:"true"`
	// x坐标转为字符串的值，默认空
	PosX *string `json:"pos_x,omitempty" xml:"pos_x,omitempty"`
	// y坐标转为字符串的值
	PosY *string `json:"pos_y,omitempty" xml:"pos_y,omitempty" require:"true"`
	// 印章id ，如不传，则采用账号下的默认印章
	SealId *string `json:"seal_id,omitempty" xml:"seal_id,omitempty"`
	// 第三方业务流水号id，保证相同签署人、相同签约主体、相同签署顺序的任务，对应的第三方业务流水id唯一，默认空
	ThirdOrderNo *string `json:"third_order_no,omitempty" xml:"third_order_no,omitempty"`
	// 签署区宽，默认印章宽度
	Width *string `json:"width,omitempty" xml:"width,omitempty"`
}

func (s ContractPlatformSignField) String() string {
	return tea.Prettify(s)
}

func (s ContractPlatformSignField) GoString() string {
	return s.String()
}

func (s *ContractPlatformSignField) SetAddSignTime(v bool) *ContractPlatformSignField {
	s.AddSignTime = &v
	return s
}

func (s *ContractPlatformSignField) SetOrder(v int64) *ContractPlatformSignField {
	s.Order = &v
	return s
}

func (s *ContractPlatformSignField) SetPosPage(v string) *ContractPlatformSignField {
	s.PosPage = &v
	return s
}

func (s *ContractPlatformSignField) SetPosX(v string) *ContractPlatformSignField {
	s.PosX = &v
	return s
}

func (s *ContractPlatformSignField) SetPosY(v string) *ContractPlatformSignField {
	s.PosY = &v
	return s
}

func (s *ContractPlatformSignField) SetSealId(v string) *ContractPlatformSignField {
	s.SealId = &v
	return s
}

func (s *ContractPlatformSignField) SetThirdOrderNo(v string) *ContractPlatformSignField {
	s.ThirdOrderNo = &v
	return s
}

func (s *ContractPlatformSignField) SetWidth(v string) *ContractPlatformSignField {
	s.Width = &v
	return s
}

// 核验结果
type NotaryCheckResult struct {
	// 存证所在区块高度
	BlockHeight *int64 `json:"block_height,omitempty" xml:"block_height,omitempty" require:"true" minimum:"0"`
	// 核验结果错误码
	ErrorCode *int64 `json:"error_code,omitempty" xml:"error_code,omitempty" require:"true"`
	// 错误信息
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty" require:"true"`
	// 存证时间
	NotaryTime *string `json:"notary_time,omitempty" xml:"notary_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 存证类型
	NotaryType *string `json:"notary_type,omitempty" xml:"notary_type,omitempty" require:"true"`
	// 核验是否成功
	Result *bool `json:"result,omitempty" xml:"result,omitempty" require:"true"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty" require:"true"`
	// 交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 区块哈希
	BlockHash *string `json:"block_hash,omitempty" xml:"block_hash,omitempty" require:"true"`
	// 存证阶段
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty" require:"true"`
}

func (s NotaryCheckResult) String() string {
	return tea.Prettify(s)
}

func (s NotaryCheckResult) GoString() string {
	return s.String()
}

func (s *NotaryCheckResult) SetBlockHeight(v int64) *NotaryCheckResult {
	s.BlockHeight = &v
	return s
}

func (s *NotaryCheckResult) SetErrorCode(v int64) *NotaryCheckResult {
	s.ErrorCode = &v
	return s
}

func (s *NotaryCheckResult) SetErrorMessage(v string) *NotaryCheckResult {
	s.ErrorMessage = &v
	return s
}

func (s *NotaryCheckResult) SetNotaryTime(v string) *NotaryCheckResult {
	s.NotaryTime = &v
	return s
}

func (s *NotaryCheckResult) SetNotaryType(v string) *NotaryCheckResult {
	s.NotaryType = &v
	return s
}

func (s *NotaryCheckResult) SetResult(v bool) *NotaryCheckResult {
	s.Result = &v
	return s
}

func (s *NotaryCheckResult) SetTransactionId(v string) *NotaryCheckResult {
	s.TransactionId = &v
	return s
}

func (s *NotaryCheckResult) SetTxHash(v string) *NotaryCheckResult {
	s.TxHash = &v
	return s
}

func (s *NotaryCheckResult) SetBlockHash(v string) *NotaryCheckResult {
	s.BlockHash = &v
	return s
}

func (s *NotaryCheckResult) SetPhase(v string) *NotaryCheckResult {
	s.Phase = &v
	return s
}

// 电子合同存证合同文档信息
type ContractNotaryDocumentInfo struct {
	// 签署完成的合同hash
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 签署人ID（支持多个，不同ID间用“,”分隔开）
	Signatories *string `json:"signatories,omitempty" xml:"signatories,omitempty" require:"true"`
	// 存证结束时间，UNIX时间戳(毫秒)
	Timestamp *string `json:"timestamp,omitempty" xml:"timestamp,omitempty" require:"true"`
	// 存证凭据，仅在批量核验时需要填写
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 签署的文件ID
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s ContractNotaryDocumentInfo) String() string {
	return tea.Prettify(s)
}

func (s ContractNotaryDocumentInfo) GoString() string {
	return s.String()
}

func (s *ContractNotaryDocumentInfo) SetContent(v string) *ContractNotaryDocumentInfo {
	s.Content = &v
	return s
}

func (s *ContractNotaryDocumentInfo) SetSignatories(v string) *ContractNotaryDocumentInfo {
	s.Signatories = &v
	return s
}

func (s *ContractNotaryDocumentInfo) SetTimestamp(v string) *ContractNotaryDocumentInfo {
	s.Timestamp = &v
	return s
}

func (s *ContractNotaryDocumentInfo) SetTxHash(v string) *ContractNotaryDocumentInfo {
	s.TxHash = &v
	return s
}

func (s *ContractNotaryDocumentInfo) SetFileId(v string) *ContractNotaryDocumentInfo {
	s.FileId = &v
	return s
}

// 电子合同签署盖章区
type ContractSignField struct {
	// 电子合同用户ID
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// 电子合同文档ID
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 电子合同签署区id
	SignfieldId *string `json:"signfield_id,omitempty" xml:"signfield_id,omitempty" require:"true"`
}

func (s ContractSignField) String() string {
	return tea.Prettify(s)
}

func (s ContractSignField) GoString() string {
	return s.String()
}

func (s *ContractSignField) SetAccountId(v string) *ContractSignField {
	s.AccountId = &v
	return s
}

func (s *ContractSignField) SetFileId(v string) *ContractSignField {
	s.FileId = &v
	return s
}

func (s *ContractSignField) SetSignfieldId(v string) *ContractSignField {
	s.SignfieldId = &v
	return s
}

// 智能合同个人账号信息
type ContractAccount struct {
}

func (s ContractAccount) String() string {
	return tea.Prettify(s)
}

func (s ContractAccount) GoString() string {
	return s.String()
}

// 电子合同存证签署信息
type ContractNotarySignInfo struct {
	// 本阶段存证内容哈希值
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 电子合同文件hash，可能一次性签署多个文件，不同文件的hash间用“,”分隔开
	ContractHash *string `json:"contract_hash,omitempty" xml:"contract_hash,omitempty" require:"true"`
	// 签署人ID
	Signatory *string `json:"signatory,omitempty" xml:"signatory,omitempty" require:"true"`
	// 存证阶段发生时间，UNIX时间戳(毫秒)
	Timestamp *string `json:"timestamp,omitempty" xml:"timestamp,omitempty" require:"true"`
	// 存证凭据，仅在批量核验时需要填写
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s ContractNotarySignInfo) String() string {
	return tea.Prettify(s)
}

func (s ContractNotarySignInfo) GoString() string {
	return s.String()
}

func (s *ContractNotarySignInfo) SetContent(v string) *ContractNotarySignInfo {
	s.Content = &v
	return s
}

func (s *ContractNotarySignInfo) SetContractHash(v string) *ContractNotarySignInfo {
	s.ContractHash = &v
	return s
}

func (s *ContractNotarySignInfo) SetSignatory(v string) *ContractNotarySignInfo {
	s.Signatory = &v
	return s
}

func (s *ContractNotarySignInfo) SetTimestamp(v string) *ContractNotarySignInfo {
	s.Timestamp = &v
	return s
}

func (s *ContractNotarySignInfo) SetTxHash(v string) *ContractNotarySignInfo {
	s.TxHash = &v
	return s
}

// 见证流程文档确认数据
type WitnessConfirmData struct {
	// 文档fileKey
	DocFileKey *string `json:"doc_file_key,omitempty" xml:"doc_file_key,omitempty"`
	// 文档摘要算法，SHA256
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty" require:"true"`
	// 签署后文档摘要值
	SignedHash *string `json:"signed_hash,omitempty" xml:"signed_hash,omitempty" require:"true"`
	// 第三方文档id
	ThirdDocId *string `json:"third_doc_id,omitempty" xml:"third_doc_id,omitempty" require:"true"`
}

func (s WitnessConfirmData) String() string {
	return tea.Prettify(s)
}

func (s WitnessConfirmData) GoString() string {
	return s.String()
}

func (s *WitnessConfirmData) SetDocFileKey(v string) *WitnessConfirmData {
	s.DocFileKey = &v
	return s
}

func (s *WitnessConfirmData) SetHashAlgorithm(v string) *WitnessConfirmData {
	s.HashAlgorithm = &v
	return s
}

func (s *WitnessConfirmData) SetSignedHash(v string) *WitnessConfirmData {
	s.SignedHash = &v
	return s
}

func (s *WitnessConfirmData) SetThirdDocId(v string) *WitnessConfirmData {
	s.ThirdDocId = &v
	return s
}

// 智能合同机构账户创建申请信息
type ContractOrganizationApplication struct {
	// 证件号
	IdNumber *string `json:"id_number,omitempty" xml:"id_number,omitempty" require:"true"`
	// 证件类型，默认CRED_ORG_USCC，详见机构证件类型说明 （https://tech.antfin.com/docs/2/155166）
	IdType *string `json:"id_type,omitempty" xml:"id_type,omitempty" require:"true"`
	// 企业法人名称
	LegalPerson *string `json:"legal_person,omitempty" xml:"legal_person,omitempty"`
	// 企业法人证件号
	LegalPersonId *string `json:"legal_person_id,omitempty" xml:"legal_person_id,omitempty"`
	// 机构名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 机构唯一标识，可传入第三方平台的机构用户id等
	OrganizationId *string `json:"organization_id,omitempty" xml:"organization_id,omitempty"`
}

func (s ContractOrganizationApplication) String() string {
	return tea.Prettify(s)
}

func (s ContractOrganizationApplication) GoString() string {
	return s.String()
}

func (s *ContractOrganizationApplication) SetIdNumber(v string) *ContractOrganizationApplication {
	s.IdNumber = &v
	return s
}

func (s *ContractOrganizationApplication) SetIdType(v string) *ContractOrganizationApplication {
	s.IdType = &v
	return s
}

func (s *ContractOrganizationApplication) SetLegalPerson(v string) *ContractOrganizationApplication {
	s.LegalPerson = &v
	return s
}

func (s *ContractOrganizationApplication) SetLegalPersonId(v string) *ContractOrganizationApplication {
	s.LegalPersonId = &v
	return s
}

func (s *ContractOrganizationApplication) SetName(v string) *ContractOrganizationApplication {
	s.Name = &v
	return s
}

func (s *ContractOrganizationApplication) SetOrganizationId(v string) *ContractOrganizationApplication {
	s.OrganizationId = &v
	return s
}

// 可信存证存证地点信息
type Location struct {
	// 所在城市
	City *string `json:"city,omitempty" xml:"city,omitempty"`
	// 使用设备的IMEI号
	Imei *string `json:"imei,omitempty" xml:"imei,omitempty"`
	// 使用设备的IMSI号
	Imsi *string `json:"imsi,omitempty" xml:"imsi,omitempty"`
	// 使用设备的IP地址
	Ip *string `json:"ip,omitempty" xml:"ip,omitempty"`
	// 纬度
	Latitude *string `json:"latitude,omitempty" xml:"latitude,omitempty"`
	// 经度
	Longitude *string `json:"longitude,omitempty" xml:"longitude,omitempty"`
	// 使用设备的Wi-Fi物理地址
	MacAddr *string `json:"mac_addr,omitempty" xml:"mac_addr,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
}

func (s Location) String() string {
	return tea.Prettify(s)
}

func (s Location) GoString() string {
	return s.String()
}

func (s *Location) SetCity(v string) *Location {
	s.City = &v
	return s
}

func (s *Location) SetImei(v string) *Location {
	s.Imei = &v
	return s
}

func (s *Location) SetImsi(v string) *Location {
	s.Imsi = &v
	return s
}

func (s *Location) SetIp(v string) *Location {
	s.Ip = &v
	return s
}

func (s *Location) SetLatitude(v string) *Location {
	s.Latitude = &v
	return s
}

func (s *Location) SetLongitude(v string) *Location {
	s.Longitude = &v
	return s
}

func (s *Location) SetMacAddr(v string) *Location {
	s.MacAddr = &v
	return s
}

func (s *Location) SetProperties(v string) *Location {
	s.Properties = &v
	return s
}

// 电子合同存证结束信息
type ContractNotaryFinishInfo struct {
	// 本阶段存证内容哈希值
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 签署文件份数
	FileNum *int64 `json:"file_num,omitempty" xml:"file_num,omitempty" require:"true"`
	// 发起人ID
	Initiator *string `json:"initiator,omitempty" xml:"initiator,omitempty" require:"true"`
	// 签署人ID（支持多个，不同ID间用“,”分隔开）
	Signatories *string `json:"signatories,omitempty" xml:"signatories,omitempty" require:"true"`
	// 存证阶段发生时间，UNIX时间戳(毫秒)
	Timestamp *string `json:"timestamp,omitempty" xml:"timestamp,omitempty" require:"true"`
	// 存证凭据，仅在批量核验时需要填写
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// signatories对应的用户类型
	UserTypes *string `json:"user_types,omitempty" xml:"user_types,omitempty"`
	// 签署合同所属行业
	BusinessType *string `json:"business_type,omitempty" xml:"business_type,omitempty"`
	// 合同对应的金额，如果不涉及金额，填充为0，个数与file_num对应
	Amounts *string `json:"amounts,omitempty" xml:"amounts,omitempty"`
}

func (s ContractNotaryFinishInfo) String() string {
	return tea.Prettify(s)
}

func (s ContractNotaryFinishInfo) GoString() string {
	return s.String()
}

func (s *ContractNotaryFinishInfo) SetContent(v string) *ContractNotaryFinishInfo {
	s.Content = &v
	return s
}

func (s *ContractNotaryFinishInfo) SetFileNum(v int64) *ContractNotaryFinishInfo {
	s.FileNum = &v
	return s
}

func (s *ContractNotaryFinishInfo) SetInitiator(v string) *ContractNotaryFinishInfo {
	s.Initiator = &v
	return s
}

func (s *ContractNotaryFinishInfo) SetSignatories(v string) *ContractNotaryFinishInfo {
	s.Signatories = &v
	return s
}

func (s *ContractNotaryFinishInfo) SetTimestamp(v string) *ContractNotaryFinishInfo {
	s.Timestamp = &v
	return s
}

func (s *ContractNotaryFinishInfo) SetTxHash(v string) *ContractNotaryFinishInfo {
	s.TxHash = &v
	return s
}

func (s *ContractNotaryFinishInfo) SetUserTypes(v string) *ContractNotaryFinishInfo {
	s.UserTypes = &v
	return s
}

func (s *ContractNotaryFinishInfo) SetBusinessType(v string) *ContractNotaryFinishInfo {
	s.BusinessType = &v
	return s
}

func (s *ContractNotaryFinishInfo) SetAmounts(v string) *ContractNotaryFinishInfo {
	s.Amounts = &v
	return s
}

// 合同存证信息
type ContractNotaryInfo struct {
	// 存证地址
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 存证相关联的文档ID
	DocId *string `json:"doc_id,omitempty" xml:"doc_id,omitempty"`
	// 存证的内容哈希值
	ContentHash *string `json:"content_hash,omitempty" xml:"content_hash,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty" require:"true"`
}

func (s ContractNotaryInfo) String() string {
	return tea.Prettify(s)
}

func (s ContractNotaryInfo) GoString() string {
	return s.String()
}

func (s *ContractNotaryInfo) SetTxHash(v string) *ContractNotaryInfo {
	s.TxHash = &v
	return s
}

func (s *ContractNotaryInfo) SetDocId(v string) *ContractNotaryInfo {
	s.DocId = &v
	return s
}

func (s *ContractNotaryInfo) SetContentHash(v string) *ContractNotaryInfo {
	s.ContentHash = &v
	return s
}

func (s *ContractNotaryInfo) SetTransactionId(v string) *ContractNotaryInfo {
	s.TransactionId = &v
	return s
}

// 创建电子合同签署盖章区时的申请信息
type ContractSignFieldApplication struct {
	// 是否添加签署时间戳，默认不添加，时间格式如"2019-03-11 10:12:12"
	AddSignTime *bool `json:"add_sign_time,omitempty" xml:"add_sign_time,omitempty"`
	// 签约主体账号标识， 将使用该主体账号对应的数字证书完成本次签署，如：当存在签署操作人代某机构签署时，需要传入该机构的账号id
	AuthorizedAccountId *string `json:"authorized_account_id,omitempty" xml:"authorized_account_id,omitempty" require:"true"`
	// 电子合同文件ID
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 签署区顺序，默认1,且不小于1，顺序越小越先处理
	Order *int64 `json:"order,omitempty" xml:"order,omitempty"`
	// 页码信息
	PosPage *string `json:"pos_page,omitempty" xml:"pos_page,omitempty"`
	// x坐标转为字符串的值，默认空，页面签章必填，骑缝签章不填写
	PosX *string `json:"pos_x,omitempty" xml:"pos_x,omitempty"`
	// y坐标转为字符串的值
	PosY *string `json:"pos_y,omitempty" xml:"pos_y,omitempty" require:"true"`
	// 印章id ，如不传，则采用账号下的默认印章
	SealId *string `json:"seal_id,omitempty" xml:"seal_id,omitempty"`
	// 第三方业务流水号id，保证相同签署人、相同签约主体、相同签署顺序的任务，对应的第三方业务流水id唯一，默认空
	ThirdOrderNo *string `json:"third_order_no,omitempty" xml:"third_order_no,omitempty"`
	// 签署区宽，默认印章宽度
	Width *string `json:"width,omitempty" xml:"width,omitempty"`
	// 签署类型，0-不限，1-单页签署，2-骑缝签署，默认1
	SignType *int64 `json:"sign_type,omitempty" xml:"sign_type,omitempty"`
}

func (s ContractSignFieldApplication) String() string {
	return tea.Prettify(s)
}

func (s ContractSignFieldApplication) GoString() string {
	return s.String()
}

func (s *ContractSignFieldApplication) SetAddSignTime(v bool) *ContractSignFieldApplication {
	s.AddSignTime = &v
	return s
}

func (s *ContractSignFieldApplication) SetAuthorizedAccountId(v string) *ContractSignFieldApplication {
	s.AuthorizedAccountId = &v
	return s
}

func (s *ContractSignFieldApplication) SetFileId(v string) *ContractSignFieldApplication {
	s.FileId = &v
	return s
}

func (s *ContractSignFieldApplication) SetOrder(v int64) *ContractSignFieldApplication {
	s.Order = &v
	return s
}

func (s *ContractSignFieldApplication) SetPosPage(v string) *ContractSignFieldApplication {
	s.PosPage = &v
	return s
}

func (s *ContractSignFieldApplication) SetPosX(v string) *ContractSignFieldApplication {
	s.PosX = &v
	return s
}

func (s *ContractSignFieldApplication) SetPosY(v string) *ContractSignFieldApplication {
	s.PosY = &v
	return s
}

func (s *ContractSignFieldApplication) SetSealId(v string) *ContractSignFieldApplication {
	s.SealId = &v
	return s
}

func (s *ContractSignFieldApplication) SetThirdOrderNo(v string) *ContractSignFieldApplication {
	s.ThirdOrderNo = &v
	return s
}

func (s *ContractSignFieldApplication) SetWidth(v string) *ContractSignFieldApplication {
	s.Width = &v
	return s
}

func (s *ContractSignFieldApplication) SetSignType(v int64) *ContractSignFieldApplication {
	s.SignType = &v
	return s
}

// 创建电子合同手动签署盖章区时的申请信息
type ContractHandSignFieldApplication struct {
	// 签署操作人个人账号标识，即操作本次签署的个人，如需通知用户签署，则系统向该账号下绑定的手机、邮箱发送签署链接
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// 电子合同文件ID
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 签署区顺序，默认1,且不小于1，顺序越小越先处理
	Order *int64 `json:"order,omitempty" xml:"order,omitempty"`
	// 页码信息，当签署区signType为2时, 页码可以'-'分割, 其他情况只能是数字
	PosPage *string `json:"pos_page,omitempty" xml:"pos_page,omitempty" require:"true"`
	// x坐标，页面签章必填，骑缝签章不填写
	PosX *string `json:"pos_x,omitempty" xml:"pos_x,omitempty"`
	// y坐标
	PosY *string `json:"pos_y,omitempty" xml:"pos_y,omitempty" require:"true"`
	// 印章id
	SealId *string `json:"seal_id,omitempty" xml:"seal_id,omitempty"`
	// 是否需要添加签署日期，0-禁止 1-必须 2-不限制，默认0
	SignDateBeanType *int64 `json:"sign_date_bean_type,omitempty" xml:"sign_date_bean_type,omitempty"`
	// 签章日期字体大小,默认12
	SignDateFontSize *int64 `json:"sign_date_font_size,omitempty" xml:"sign_date_font_size,omitempty"`
	// 签章日期格式，yyyy年MM月dd日
	SignDateFormat *string `json:"sign_date_format,omitempty" xml:"sign_date_format,omitempty"`
	// 页码信息，当signDateBeanType为1时，代表签署的印章必须展示签署日期，默认放在印章正下方，签署人可拖拽日期到当前页面的其他位置，如果发起方指定签署位置的同时，需要同时指定日期盖章位置，则需传入日期盖章页码（与印章页码相同），在传入X\Y坐标即可。
	SignDatePosPage *int64 `json:"sign_date_pos_page,omitempty" xml:"sign_date_pos_page,omitempty"`
	// 签章日期x坐标，默认0
	SignDatePosX *string `json:"sign_date_pos_x,omitempty" xml:"sign_date_pos_x,omitempty"`
	// 签章日期y坐标，默认0
	SignDatePosY *string `json:"sign_date_pos_y,omitempty" xml:"sign_date_pos_y,omitempty"`
	// 签署类型，0-不限，1-单页签署，2-骑缝签署，默认1
	SignType *int64 `json:"sign_type,omitempty" xml:"sign_type,omitempty"`
	// 第三方业务流水号id，保证相同签署人、相同签约主体、相同签署顺序的任务，对应的第三方业务流水id唯一，默认空
	ThirdOrderNo *string `json:"third_order_no,omitempty" xml:"third_order_no,omitempty"`
	// 签署区宽，默认印章宽度
	Width *string `json:"width,omitempty" xml:"width,omitempty"`
	// 印章ids，只支持企业用户进行印章ID列表的设置；用于手动签署时，指定企业印章进行展示，实现手动选择印章进行签署。
	SealIds []*string `json:"seal_ids,omitempty" xml:"seal_ids,omitempty" type:"Repeated"`
}

func (s ContractHandSignFieldApplication) String() string {
	return tea.Prettify(s)
}

func (s ContractHandSignFieldApplication) GoString() string {
	return s.String()
}

func (s *ContractHandSignFieldApplication) SetAccountId(v string) *ContractHandSignFieldApplication {
	s.AccountId = &v
	return s
}

func (s *ContractHandSignFieldApplication) SetFileId(v string) *ContractHandSignFieldApplication {
	s.FileId = &v
	return s
}

func (s *ContractHandSignFieldApplication) SetOrder(v int64) *ContractHandSignFieldApplication {
	s.Order = &v
	return s
}

func (s *ContractHandSignFieldApplication) SetPosPage(v string) *ContractHandSignFieldApplication {
	s.PosPage = &v
	return s
}

func (s *ContractHandSignFieldApplication) SetPosX(v string) *ContractHandSignFieldApplication {
	s.PosX = &v
	return s
}

func (s *ContractHandSignFieldApplication) SetPosY(v string) *ContractHandSignFieldApplication {
	s.PosY = &v
	return s
}

func (s *ContractHandSignFieldApplication) SetSealId(v string) *ContractHandSignFieldApplication {
	s.SealId = &v
	return s
}

func (s *ContractHandSignFieldApplication) SetSignDateBeanType(v int64) *ContractHandSignFieldApplication {
	s.SignDateBeanType = &v
	return s
}

func (s *ContractHandSignFieldApplication) SetSignDateFontSize(v int64) *ContractHandSignFieldApplication {
	s.SignDateFontSize = &v
	return s
}

func (s *ContractHandSignFieldApplication) SetSignDateFormat(v string) *ContractHandSignFieldApplication {
	s.SignDateFormat = &v
	return s
}

func (s *ContractHandSignFieldApplication) SetSignDatePosPage(v int64) *ContractHandSignFieldApplication {
	s.SignDatePosPage = &v
	return s
}

func (s *ContractHandSignFieldApplication) SetSignDatePosX(v string) *ContractHandSignFieldApplication {
	s.SignDatePosX = &v
	return s
}

func (s *ContractHandSignFieldApplication) SetSignDatePosY(v string) *ContractHandSignFieldApplication {
	s.SignDatePosY = &v
	return s
}

func (s *ContractHandSignFieldApplication) SetSignType(v int64) *ContractHandSignFieldApplication {
	s.SignType = &v
	return s
}

func (s *ContractHandSignFieldApplication) SetThirdOrderNo(v string) *ContractHandSignFieldApplication {
	s.ThirdOrderNo = &v
	return s
}

func (s *ContractHandSignFieldApplication) SetWidth(v string) *ContractHandSignFieldApplication {
	s.Width = &v
	return s
}

func (s *ContractHandSignFieldApplication) SetSealIds(v []*string) *ContractHandSignFieldApplication {
	s.SealIds = v
	return s
}

// 见证流程审批数据
type WitnessApprovalData struct {
	// 审批流程id
	ApprovalFlowId *string `json:"approval_flow_id,omitempty" xml:"approval_flow_id,omitempty"`
	// 印章id列表
	SealIds []*string `json:"seal_ids,omitempty" xml:"seal_ids,omitempty" type:"Repeated"`
}

func (s WitnessApprovalData) String() string {
	return tea.Prettify(s)
}

func (s WitnessApprovalData) GoString() string {
	return s.String()
}

func (s *WitnessApprovalData) SetApprovalFlowId(v string) *WitnessApprovalData {
	s.ApprovalFlowId = &v
	return s
}

func (s *WitnessApprovalData) SetSealIds(v []*string) *WitnessApprovalData {
	s.SealIds = v
	return s
}

// 融资租赁商品出租详细信息
type RentInfo struct {
	// 租金
	RentPrice *int64 `json:"rent_price,omitempty" xml:"rent_price,omitempty" require:"true"`
	// 租期
	RentTerm *int64 `json:"rent_term,omitempty" xml:"rent_term,omitempty" require:"true"`
	// 手续费
	Commission *int64 `json:"commission,omitempty" xml:"commission,omitempty" require:"true"`
	// 买断价
	BuyoutPrice *int64 `json:"buyout_price,omitempty" xml:"buyout_price,omitempty" require:"true"`
	// 留购价
	RetainedPrice *int64 `json:"retained_price,omitempty" xml:"retained_price,omitempty" require:"true"`
}

func (s RentInfo) String() string {
	return tea.Prettify(s)
}

func (s RentInfo) GoString() string {
	return s.String()
}

func (s *RentInfo) SetRentPrice(v int64) *RentInfo {
	s.RentPrice = &v
	return s
}

func (s *RentInfo) SetRentTerm(v int64) *RentInfo {
	s.RentTerm = &v
	return s
}

func (s *RentInfo) SetCommission(v int64) *RentInfo {
	s.Commission = &v
	return s
}

func (s *RentInfo) SetBuyoutPrice(v int64) *RentInfo {
	s.BuyoutPrice = &v
	return s
}

func (s *RentInfo) SetRetainedPrice(v int64) *RentInfo {
	s.RetainedPrice = &v
	return s
}

// 存证信息说明
type NotaryInfo struct {
	// 存证内容的哈希值，默认采用SHA256算法
	ContentHash *string `json:"content_hash,omitempty" xml:"content_hash,omitempty" require:"true"`
	// 合作人（版权存证函专用），会展示在存证证明中
	Cooperation *string `json:"cooperation,omitempty" xml:"cooperation,omitempty"`
	// 作品名称类型（版权存证函使用），会展示在存证证明中
	CreationType *string `json:"creation_type,omitempty" xml:"creation_type,omitempty"`
	// 如果是文件存证，可填写文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// 计算content_hash的哈希算法，目前只支持SHA256
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty"`
	// 申请平台名，用于在存证函上显示用名称
	Platform *string `json:"platform,omitempty" xml:"platform,omitempty"`
	// 文件容量，默认为0
	Size *int64 `json:"size,omitempty" xml:"size,omitempty"`
	// 发起存证成功后，返回的存证凭据
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty" require:"true"`
}

func (s NotaryInfo) String() string {
	return tea.Prettify(s)
}

func (s NotaryInfo) GoString() string {
	return s.String()
}

func (s *NotaryInfo) SetContentHash(v string) *NotaryInfo {
	s.ContentHash = &v
	return s
}

func (s *NotaryInfo) SetCooperation(v string) *NotaryInfo {
	s.Cooperation = &v
	return s
}

func (s *NotaryInfo) SetCreationType(v string) *NotaryInfo {
	s.CreationType = &v
	return s
}

func (s *NotaryInfo) SetFileName(v string) *NotaryInfo {
	s.FileName = &v
	return s
}

func (s *NotaryInfo) SetHashAlgorithm(v string) *NotaryInfo {
	s.HashAlgorithm = &v
	return s
}

func (s *NotaryInfo) SetPlatform(v string) *NotaryInfo {
	s.Platform = &v
	return s
}

func (s *NotaryInfo) SetSize(v int64) *NotaryInfo {
	s.Size = &v
	return s
}

func (s *NotaryInfo) SetTxHash(v string) *NotaryInfo {
	s.TxHash = &v
	return s
}

func (s *NotaryInfo) SetTransactionId(v string) *NotaryInfo {
	s.TransactionId = &v
	return s
}

// 融资租赁里的产品详细信息
type ProductInfo struct {
	// 是否需要创建did
	NeedDid *bool `json:"need_did,omitempty" xml:"need_did,omitempty"`
	// 产品品牌，长度不超过50
	ProductBrand *string `json:"product_brand,omitempty" xml:"product_brand,omitempty"`
	// 产品Id，长度不超过50
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty" require:"true"`
	// 唯一标识码，imeiID，长度不超过50
	ProductImeiId *string `json:"product_imei_id,omitempty" xml:"product_imei_id,omitempty"`
	// 产品规格型号，长度不超过255
	ProductModel *string `json:"product_model,omitempty" xml:"product_model,omitempty"`
	// 产品名称，长度不超过50
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true"`
	// 产品数量
	ProductNumber *int64 `json:"product_number,omitempty" xml:"product_number,omitempty" require:"true"`
	// 产品采购含税价 精确到毫厘，即123400表示12.34元
	ProductPrice *int64 `json:"product_price,omitempty" xml:"product_price,omitempty" require:"true"`
	// 供应商id
	SupplierId *string `json:"supplier_id,omitempty" xml:"supplier_id,omitempty"`
	// 供应商对应的产品版本，每个版本可以对应一个价格
	SupplierVersion *string `json:"supplier_version,omitempty" xml:"supplier_version,omitempty"`
	// 额外字段
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
}

func (s ProductInfo) String() string {
	return tea.Prettify(s)
}

func (s ProductInfo) GoString() string {
	return s.String()
}

func (s *ProductInfo) SetNeedDid(v bool) *ProductInfo {
	s.NeedDid = &v
	return s
}

func (s *ProductInfo) SetProductBrand(v string) *ProductInfo {
	s.ProductBrand = &v
	return s
}

func (s *ProductInfo) SetProductId(v string) *ProductInfo {
	s.ProductId = &v
	return s
}

func (s *ProductInfo) SetProductImeiId(v string) *ProductInfo {
	s.ProductImeiId = &v
	return s
}

func (s *ProductInfo) SetProductModel(v string) *ProductInfo {
	s.ProductModel = &v
	return s
}

func (s *ProductInfo) SetProductName(v string) *ProductInfo {
	s.ProductName = &v
	return s
}

func (s *ProductInfo) SetProductNumber(v int64) *ProductInfo {
	s.ProductNumber = &v
	return s
}

func (s *ProductInfo) SetProductPrice(v int64) *ProductInfo {
	s.ProductPrice = &v
	return s
}

func (s *ProductInfo) SetSupplierId(v string) *ProductInfo {
	s.SupplierId = &v
	return s
}

func (s *ProductInfo) SetSupplierVersion(v string) *ProductInfo {
	s.SupplierVersion = &v
	return s
}

func (s *ProductInfo) SetExtraInfo(v string) *ProductInfo {
	s.ExtraInfo = &v
	return s
}

// 电子合同文档
type ContractDoc struct {
	// 是否加密，0-不加密，1-加，默认0
	Encryption *int64 `json:"encryption,omitempty" xml:"encryption,omitempty"`
	// 电子合同文档的ID
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 电子合同文档名称，默认文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// 电子合同文档密码, 如果encryption值为1, 文档密码不能为空，默认没有密码
	FilePassword *string `json:"file_password,omitempty" xml:"file_password,omitempty"`
}

func (s ContractDoc) String() string {
	return tea.Prettify(s)
}

func (s ContractDoc) GoString() string {
	return s.String()
}

func (s *ContractDoc) SetEncryption(v int64) *ContractDoc {
	s.Encryption = &v
	return s
}

func (s *ContractDoc) SetFileId(v string) *ContractDoc {
	s.FileId = &v
	return s
}

func (s *ContractDoc) SetFileName(v string) *ContractDoc {
	s.FileName = &v
	return s
}

func (s *ContractDoc) SetFilePassword(v string) *ContractDoc {
	s.FilePassword = &v
	return s
}

// 租赁业务存证信息记录
type LeaseNotaryRecord struct {
	// 存证阶段
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty" require:"true"`
	// 交易哈希，存证记录唯一标识
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
}

func (s LeaseNotaryRecord) String() string {
	return tea.Prettify(s)
}

func (s LeaseNotaryRecord) GoString() string {
	return s.String()
}

func (s *LeaseNotaryRecord) SetPhase(v string) *LeaseNotaryRecord {
	s.Phase = &v
	return s
}

func (s *LeaseNotaryRecord) SetTxHash(v string) *LeaseNotaryRecord {
	s.TxHash = &v
	return s
}

// 签署区详情
type ContractSignFieldDetail struct {
	// 签约主体类别，0-个人，1-机构，默认0,2 是不限
	ActorIndentityType *int64 `json:"actor_indentity_type,omitempty" xml:"actor_indentity_type,omitempty"`
	// 添加时间
	AddTime *int64 `json:"add_time,omitempty" xml:"add_time,omitempty"`
	// 是否指定位置，TRUE表示不允许更新位置，配置项，无默认值
	AssignedPosbean *bool `json:"assigned_posbean,omitempty" xml:"assigned_posbean,omitempty"`
	// 是否指定印章数据，TRUE表示不允许更新印章，配置项，无默认值
	AssignedSeal *bool `json:"assigned_seal,omitempty" xml:"assigned_seal,omitempty"`
	// 签约主体账号标识，将使用该主体账号对应的数字证书完成本次签署，如：当存在签署操作人代某机构签署时，需要传入该机构的账号id
	AuthorizedAccountId *string `json:"authorized_account_id,omitempty" xml:"authorized_account_id,omitempty"`
	// 是否自动执行，TRUE需要静默授权，配置项，无默认值
	AutoExecute *bool `json:"auto_execute,omitempty" xml:"auto_execute,omitempty"`
	// 执行失败原因
	ExecuteFailedReason *string `json:"execute_failed_reason,omitempty" xml:"execute_failed_reason,omitempty"`
	// 文件file id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 流程id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 签署区顺序，默认1,且不小于1，顺序越小越先处理
	Order *int64 `json:"order,omitempty" xml:"order,omitempty"`
	// 页码信息，可以','或'-'分割
	PosPage *string `json:"pos_page,omitempty" xml:"pos_page,omitempty"`
	// x坐标
	PosX *string `json:"pos_x,omitempty" xml:"pos_x,omitempty"`
	// y坐标
	PosY *string `json:"pos_y,omitempty" xml:"pos_y,omitempty"`
	// 印章文件file key
	SealFileKey *string `json:"seal_file_key,omitempty" xml:"seal_file_key,omitempty"`
	// 印章id
	SealId *string `json:"seal_id,omitempty" xml:"seal_id,omitempty"`
	// 印章类型，支持多种类型时逗号分割，0-手绘印章，1-模版印章，为空不限制
	SealType *string `json:"seal_type,omitempty" xml:"seal_type,omitempty"`
	// 签署操作人个人账号标识，即操作本次签署的个人，如需e签宝通知用户签署，则系统向该账号下绑定的手机、邮箱发送签署链接
	SignerAccountId *string `json:"signer_account_id,omitempty" xml:"signer_account_id,omitempty"`
	// 签署区Id
	SignfieldId *string `json:"signfield_id,omitempty" xml:"signfield_id,omitempty"`
	// 签署类型，0-不限，1-单页签署，2-骑缝签署,4-关键字签署，默认1
	SignType *int64 `json:"sign_type,omitempty" xml:"sign_type,omitempty"`
	// 签署区状态（0："等待执行，1："执行中"，2："执行失败"，3："审批中"，4： "执行完成"）
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
	// 状态描述
	StatusDescription *string `json:"status_description,omitempty" xml:"status_description,omitempty"`
	// 签署区宽
	Width *string `json:"width,omitempty" xml:"width,omitempty"`
}

func (s ContractSignFieldDetail) String() string {
	return tea.Prettify(s)
}

func (s ContractSignFieldDetail) GoString() string {
	return s.String()
}

func (s *ContractSignFieldDetail) SetActorIndentityType(v int64) *ContractSignFieldDetail {
	s.ActorIndentityType = &v
	return s
}

func (s *ContractSignFieldDetail) SetAddTime(v int64) *ContractSignFieldDetail {
	s.AddTime = &v
	return s
}

func (s *ContractSignFieldDetail) SetAssignedPosbean(v bool) *ContractSignFieldDetail {
	s.AssignedPosbean = &v
	return s
}

func (s *ContractSignFieldDetail) SetAssignedSeal(v bool) *ContractSignFieldDetail {
	s.AssignedSeal = &v
	return s
}

func (s *ContractSignFieldDetail) SetAuthorizedAccountId(v string) *ContractSignFieldDetail {
	s.AuthorizedAccountId = &v
	return s
}

func (s *ContractSignFieldDetail) SetAutoExecute(v bool) *ContractSignFieldDetail {
	s.AutoExecute = &v
	return s
}

func (s *ContractSignFieldDetail) SetExecuteFailedReason(v string) *ContractSignFieldDetail {
	s.ExecuteFailedReason = &v
	return s
}

func (s *ContractSignFieldDetail) SetFileId(v string) *ContractSignFieldDetail {
	s.FileId = &v
	return s
}

func (s *ContractSignFieldDetail) SetFlowId(v string) *ContractSignFieldDetail {
	s.FlowId = &v
	return s
}

func (s *ContractSignFieldDetail) SetOrder(v int64) *ContractSignFieldDetail {
	s.Order = &v
	return s
}

func (s *ContractSignFieldDetail) SetPosPage(v string) *ContractSignFieldDetail {
	s.PosPage = &v
	return s
}

func (s *ContractSignFieldDetail) SetPosX(v string) *ContractSignFieldDetail {
	s.PosX = &v
	return s
}

func (s *ContractSignFieldDetail) SetPosY(v string) *ContractSignFieldDetail {
	s.PosY = &v
	return s
}

func (s *ContractSignFieldDetail) SetSealFileKey(v string) *ContractSignFieldDetail {
	s.SealFileKey = &v
	return s
}

func (s *ContractSignFieldDetail) SetSealId(v string) *ContractSignFieldDetail {
	s.SealId = &v
	return s
}

func (s *ContractSignFieldDetail) SetSealType(v string) *ContractSignFieldDetail {
	s.SealType = &v
	return s
}

func (s *ContractSignFieldDetail) SetSignerAccountId(v string) *ContractSignFieldDetail {
	s.SignerAccountId = &v
	return s
}

func (s *ContractSignFieldDetail) SetSignfieldId(v string) *ContractSignFieldDetail {
	s.SignfieldId = &v
	return s
}

func (s *ContractSignFieldDetail) SetSignType(v int64) *ContractSignFieldDetail {
	s.SignType = &v
	return s
}

func (s *ContractSignFieldDetail) SetStatus(v int64) *ContractSignFieldDetail {
	s.Status = &v
	return s
}

func (s *ContractSignFieldDetail) SetStatusDescription(v string) *ContractSignFieldDetail {
	s.StatusDescription = &v
	return s
}

func (s *ContractSignFieldDetail) SetWidth(v string) *ContractSignFieldDetail {
	s.Width = &v
	return s
}

// 智能合同个人账户创建申请信息
type ContractAccountApplication struct {
	// 邮箱地址，默认空
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 证件号
	IdNumber *string `json:"id_number,omitempty" xml:"id_number,omitempty" require:"true"`
	// 目前仅支持CRED_PSN_CH_IDCARD，即身份证号码
	IdType *string `json:"id_type,omitempty" xml:"id_type,omitempty" require:"true"`
	// 手机号码，默认空
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 用户唯一标识，可传入第三方平台的个人用户id等
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s ContractAccountApplication) String() string {
	return tea.Prettify(s)
}

func (s ContractAccountApplication) GoString() string {
	return s.String()
}

func (s *ContractAccountApplication) SetEmail(v string) *ContractAccountApplication {
	s.Email = &v
	return s
}

func (s *ContractAccountApplication) SetIdNumber(v string) *ContractAccountApplication {
	s.IdNumber = &v
	return s
}

func (s *ContractAccountApplication) SetIdType(v string) *ContractAccountApplication {
	s.IdType = &v
	return s
}

func (s *ContractAccountApplication) SetMobile(v string) *ContractAccountApplication {
	s.Mobile = &v
	return s
}

func (s *ContractAccountApplication) SetName(v string) *ContractAccountApplication {
	s.Name = &v
	return s
}

func (s *ContractAccountApplication) SetUserId(v string) *ContractAccountApplication {
	s.UserId = &v
	return s
}

// 电子合同签署流程的配置信息
type ContractSignFlowConfig struct {
	// 回调通知地址 ,默认取项目配置通知地址
	NoticeDeveloperUrl *string `json:"notice_developer_url,omitempty" xml:"notice_developer_url,omitempty"`
	// 通知方式，逗号分割，1-短信，2-邮件 。默认值1，请务必请选择一个通知方式，否则客户将接收不到流程的签署通知和审批通知，如果流程需要审批，将导致审批无法完成；如果客户需要不通知，可以设置notice_type为""
	NoticeType *string `json:"notice_type,omitempty" xml:"notice_type,omitempty" require:"true"`
	// 签署成功或者流程结束后的默认重定向地址，默认签署完成停在当前页面
	RedirectUrl *string `json:"redirect_url,omitempty" xml:"redirect_url,omitempty"`
	// 签署平台，逗号分割，1-开放服务h5，2-支付宝签 ，默认值1
	SignPlatform *string `json:"sign_platform,omitempty" xml:"sign_platform,omitempty"`
	// 签署失败时的跳转地址，如果不做单独配置，默认与redirect_url一致（配合twc.notary.contract.signflow.create接口使用）
	RedirectUrlOnFailure *string `json:"redirect_url_on_failure,omitempty" xml:"redirect_url_on_failure,omitempty"`
	// 是否允许自由签署，默认false（配合twc.notary.contract.signflow.create接口使用）
	FreeSignature *bool `json:"free_signature,omitempty" xml:"free_signature,omitempty"`
}

func (s ContractSignFlowConfig) String() string {
	return tea.Prettify(s)
}

func (s ContractSignFlowConfig) GoString() string {
	return s.String()
}

func (s *ContractSignFlowConfig) SetNoticeDeveloperUrl(v string) *ContractSignFlowConfig {
	s.NoticeDeveloperUrl = &v
	return s
}

func (s *ContractSignFlowConfig) SetNoticeType(v string) *ContractSignFlowConfig {
	s.NoticeType = &v
	return s
}

func (s *ContractSignFlowConfig) SetRedirectUrl(v string) *ContractSignFlowConfig {
	s.RedirectUrl = &v
	return s
}

func (s *ContractSignFlowConfig) SetSignPlatform(v string) *ContractSignFlowConfig {
	s.SignPlatform = &v
	return s
}

func (s *ContractSignFlowConfig) SetRedirectUrlOnFailure(v string) *ContractSignFlowConfig {
	s.RedirectUrlOnFailure = &v
	return s
}

func (s *ContractSignFlowConfig) SetFreeSignature(v bool) *ContractSignFlowConfig {
	s.FreeSignature = &v
	return s
}

// 融资租赁中IOT设备详情
type LeaseIotItemInfo struct {
	// 证据的时间
	Date *string `json:"date,omitempty" xml:"date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 证据的txHash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 证据的原始数据，默认为空或加密状态，除非调用方为授权用户（如出资方等
	RawData *string `json:"raw_data,omitempty" xml:"raw_data,omitempty" require:"true"`
}

func (s LeaseIotItemInfo) String() string {
	return tea.Prettify(s)
}

func (s LeaseIotItemInfo) GoString() string {
	return s.String()
}

func (s *LeaseIotItemInfo) SetDate(v string) *LeaseIotItemInfo {
	s.Date = &v
	return s
}

func (s *LeaseIotItemInfo) SetTxHash(v string) *LeaseIotItemInfo {
	s.TxHash = &v
	return s
}

func (s *LeaseIotItemInfo) SetRawData(v string) *LeaseIotItemInfo {
	s.RawData = &v
	return s
}

// 存证证明的证书信息
type CertificateInfo struct {
	// 存证证明的证书内容的SHA256哈希值
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty" require:"true"`
	// 存证证明的证书文件名
	ResourceName *string `json:"resource_name,omitempty" xml:"resource_name,omitempty" require:"true"`
	// 存证证明的证书下载地址
	ResourceUrl *string `json:"resource_url,omitempty" xml:"resource_url,omitempty" require:"true"`
}

func (s CertificateInfo) String() string {
	return tea.Prettify(s)
}

func (s CertificateInfo) GoString() string {
	return s.String()
}

func (s *CertificateInfo) SetHash(v string) *CertificateInfo {
	s.Hash = &v
	return s
}

func (s *CertificateInfo) SetResourceName(v string) *CertificateInfo {
	s.ResourceName = &v
	return s
}

func (s *CertificateInfo) SetResourceUrl(v string) *CertificateInfo {
	s.ResourceUrl = &v
	return s
}

// 一步创建签署流程的签署区信息
type OneStepSignField struct {
	// 签署操作人个人账号标识，即操作本次签署的个人
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// 电子合同文件ID
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 签署区顺序，默认1,且不小于1，顺序越小越先处理
	Order *int64 `json:"order,omitempty" xml:"order,omitempty"`
	// 页码信息，当签署区signType为2时, 页码可以'-'分割, 其他情况只能是数字
	PosPage *string `json:"pos_page,omitempty" xml:"pos_page,omitempty" require:"true"`
	// x坐标
	PosX *string `json:"pos_x,omitempty" xml:"pos_x,omitempty" require:"true"`
	// y坐标
	PosY *string `json:"pos_y,omitempty" xml:"pos_y,omitempty" require:"true"`
	// 印章id
	SealId *string `json:"seal_id,omitempty" xml:"seal_id,omitempty"`
	// 是否需要添加签署日期，0-禁止 1-必须 2-不限制，默认0
	SignDateBeanType *int64 `json:"sign_date_bean_type,omitempty" xml:"sign_date_bean_type,omitempty"`
	// 签章日期字体大小,默认12
	SignDateFontSize *int64 `json:"sign_date_font_size,omitempty" xml:"sign_date_font_size,omitempty"`
	// 签章日期格式，yyyy年MM月dd日
	SignDateFormat *string `json:"sign_date_format,omitempty" xml:"sign_date_format,omitempty"`
	// 页码信息，当signDateBeanType为1时，代表签署的印章必须展示签署日期，默认放在印章正下方，签署人可拖拽日期到当前页面的其他位置，如果发起方指定签署位置的同时，需要同时指定日期盖章位置，则需传入日期盖章页码（与印章页码相同），在传入X\Y坐标即可。
	SignDatePosPage *int64 `json:"sign_date_pos_page,omitempty" xml:"sign_date_pos_page,omitempty"`
	// 签章日期x坐标，默认0
	SignDatePosX *string `json:"sign_date_pos_x,omitempty" xml:"sign_date_pos_x,omitempty"`
	// 签章日期y坐标，默认0
	SignDatePosY *string `json:"sign_date_pos_y,omitempty" xml:"sign_date_pos_y,omitempty"`
	// 签署类型，0-不限，1-单页签署，2-骑缝签署，默认1
	SignType *int64 `json:"sign_type,omitempty" xml:"sign_type,omitempty"`
	// 第三方业务流水号id，保证相同签署人、相同签约主体、相同签署顺序的任务，对应的第三方业务流水id唯一，默认空
	ThirdOrderNo *string `json:"third_order_no,omitempty" xml:"third_order_no,omitempty"`
	// 签署区宽，默认印章宽度
	Width *string `json:"width,omitempty" xml:"width,omitempty"`
	// 是否自动执行签署，默认false，false-手动签署，true-自动签署
	AutoExecute *bool `json:"auto_execute,omitempty" xml:"auto_execute,omitempty"`
}

func (s OneStepSignField) String() string {
	return tea.Prettify(s)
}

func (s OneStepSignField) GoString() string {
	return s.String()
}

func (s *OneStepSignField) SetAccountId(v string) *OneStepSignField {
	s.AccountId = &v
	return s
}

func (s *OneStepSignField) SetFileId(v string) *OneStepSignField {
	s.FileId = &v
	return s
}

func (s *OneStepSignField) SetOrder(v int64) *OneStepSignField {
	s.Order = &v
	return s
}

func (s *OneStepSignField) SetPosPage(v string) *OneStepSignField {
	s.PosPage = &v
	return s
}

func (s *OneStepSignField) SetPosX(v string) *OneStepSignField {
	s.PosX = &v
	return s
}

func (s *OneStepSignField) SetPosY(v string) *OneStepSignField {
	s.PosY = &v
	return s
}

func (s *OneStepSignField) SetSealId(v string) *OneStepSignField {
	s.SealId = &v
	return s
}

func (s *OneStepSignField) SetSignDateBeanType(v int64) *OneStepSignField {
	s.SignDateBeanType = &v
	return s
}

func (s *OneStepSignField) SetSignDateFontSize(v int64) *OneStepSignField {
	s.SignDateFontSize = &v
	return s
}

func (s *OneStepSignField) SetSignDateFormat(v string) *OneStepSignField {
	s.SignDateFormat = &v
	return s
}

func (s *OneStepSignField) SetSignDatePosPage(v int64) *OneStepSignField {
	s.SignDatePosPage = &v
	return s
}

func (s *OneStepSignField) SetSignDatePosX(v string) *OneStepSignField {
	s.SignDatePosX = &v
	return s
}

func (s *OneStepSignField) SetSignDatePosY(v string) *OneStepSignField {
	s.SignDatePosY = &v
	return s
}

func (s *OneStepSignField) SetSignType(v int64) *OneStepSignField {
	s.SignType = &v
	return s
}

func (s *OneStepSignField) SetThirdOrderNo(v string) *OneStepSignField {
	s.ThirdOrderNo = &v
	return s
}

func (s *OneStepSignField) SetWidth(v string) *OneStepSignField {
	s.Width = &v
	return s
}

func (s *OneStepSignField) SetAutoExecute(v bool) *OneStepSignField {
	s.AutoExecute = &v
	return s
}

// 见证流程签署结果数据
type WitnessSignResult struct {
	// 签名结果，外部用户签署返回
	SignResult *string `json:"sign_result,omitempty" xml:"sign_result,omitempty"`
	// 签署日志id，外部用户签署返回
	SignlogId *string `json:"signlog_id,omitempty" xml:"signlog_id,omitempty"`
	// 第三方文档id
	ThirdDocId *string `json:"third_doc_id,omitempty" xml:"third_doc_id,omitempty"`
}

func (s WitnessSignResult) String() string {
	return tea.Prettify(s)
}

func (s WitnessSignResult) GoString() string {
	return s.String()
}

func (s *WitnessSignResult) SetSignResult(v string) *WitnessSignResult {
	s.SignResult = &v
	return s
}

func (s *WitnessSignResult) SetSignlogId(v string) *WitnessSignResult {
	s.SignlogId = &v
	return s
}

func (s *WitnessSignResult) SetThirdDocId(v string) *WitnessSignResult {
	s.ThirdDocId = &v
	return s
}

// 案件进度查询返回结果
type MediationCaseDetailInfo struct {
	// 案件编码
	CaseNumber *string `json:"case_number,omitempty" xml:"case_number,omitempty" require:"true"`
	// 案号
	CaseCode *string `json:"case_code,omitempty" xml:"case_code,omitempty" require:"true"`
	// 案由
	CauseActionName *string `json:"cause_action_name,omitempty" xml:"cause_action_name,omitempty" require:"true"`
	// 案件状态
	CaseTatus *string `json:"case_tatus,omitempty" xml:"case_tatus,omitempty" require:"true"`
	// 调解平台
	MediationPlatform *string `json:"mediation_platform,omitempty" xml:"mediation_platform,omitempty" require:"true"`
	// 调解机构
	MediationOrg *string `json:"mediation_org,omitempty" xml:"mediation_org,omitempty" require:"true"`
	// 调解员
	Mediator *string `json:"mediator,omitempty" xml:"mediator,omitempty" require:"true"`
	// 申请时间
	ApplyTime *int64 `json:"apply_time,omitempty" xml:"apply_time,omitempty" require:"true"`
	// 调解结果
	MediationResult *string `json:"mediation_result,omitempty" xml:"mediation_result,omitempty" require:"true"`
	// 申请人意向金额
	AccuserIntentAmount *int64 `json:"accuser_intent_amount,omitempty" xml:"accuser_intent_amount,omitempty" require:"true"`
	// 被申请人意向金额
	AccusedIntentAmount *int64 `json:"accused_intent_amount,omitempty" xml:"accused_intent_amount,omitempty" require:"true"`
	// 和解金额
	MediationAmount *int64 `json:"mediation_amount,omitempty" xml:"mediation_amount,omitempty" require:"true"`
	// 已确认事实
	ConfirmFact *string `json:"confirm_fact,omitempty" xml:"confirm_fact,omitempty" require:"true"`
	// 调解协议（已达成调解协议或未达成原因）
	MediationAgreement *string `json:"mediation_agreement,omitempty" xml:"mediation_agreement,omitempty" require:"true"`
}

func (s MediationCaseDetailInfo) String() string {
	return tea.Prettify(s)
}

func (s MediationCaseDetailInfo) GoString() string {
	return s.String()
}

func (s *MediationCaseDetailInfo) SetCaseNumber(v string) *MediationCaseDetailInfo {
	s.CaseNumber = &v
	return s
}

func (s *MediationCaseDetailInfo) SetCaseCode(v string) *MediationCaseDetailInfo {
	s.CaseCode = &v
	return s
}

func (s *MediationCaseDetailInfo) SetCauseActionName(v string) *MediationCaseDetailInfo {
	s.CauseActionName = &v
	return s
}

func (s *MediationCaseDetailInfo) SetCaseTatus(v string) *MediationCaseDetailInfo {
	s.CaseTatus = &v
	return s
}

func (s *MediationCaseDetailInfo) SetMediationPlatform(v string) *MediationCaseDetailInfo {
	s.MediationPlatform = &v
	return s
}

func (s *MediationCaseDetailInfo) SetMediationOrg(v string) *MediationCaseDetailInfo {
	s.MediationOrg = &v
	return s
}

func (s *MediationCaseDetailInfo) SetMediator(v string) *MediationCaseDetailInfo {
	s.Mediator = &v
	return s
}

func (s *MediationCaseDetailInfo) SetApplyTime(v int64) *MediationCaseDetailInfo {
	s.ApplyTime = &v
	return s
}

func (s *MediationCaseDetailInfo) SetMediationResult(v string) *MediationCaseDetailInfo {
	s.MediationResult = &v
	return s
}

func (s *MediationCaseDetailInfo) SetAccuserIntentAmount(v int64) *MediationCaseDetailInfo {
	s.AccuserIntentAmount = &v
	return s
}

func (s *MediationCaseDetailInfo) SetAccusedIntentAmount(v int64) *MediationCaseDetailInfo {
	s.AccusedIntentAmount = &v
	return s
}

func (s *MediationCaseDetailInfo) SetMediationAmount(v int64) *MediationCaseDetailInfo {
	s.MediationAmount = &v
	return s
}

func (s *MediationCaseDetailInfo) SetConfirmFact(v string) *MediationCaseDetailInfo {
	s.ConfirmFact = &v
	return s
}

func (s *MediationCaseDetailInfo) SetMediationAgreement(v string) *MediationCaseDetailInfo {
	s.MediationAgreement = &v
	return s
}

// 电子合同存证初始化信息
type ContractNotaryInitInfo struct {
	// 本阶段存证内容哈希值
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 签署文件份数
	FileNum *int64 `json:"file_num,omitempty" xml:"file_num,omitempty" require:"true"`
	// 签署流程发起人ID
	Initiator *string `json:"initiator,omitempty" xml:"initiator,omitempty" require:"true"`
	// 签署人ID（支持多个，不同ID间用“,”分隔开），由于流程中签署人可后续追加，最终以ContractNotaryFinishInfo中的singatories信息为准。
	Signatories *string `json:"signatories,omitempty" xml:"signatories,omitempty"`
	// 存证阶段发生时间，UNIX时间戳(毫秒)
	Timestamp *string `json:"timestamp,omitempty" xml:"timestamp,omitempty" require:"true"`
	// 存证凭据，仅在批量核验时需要填写
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s ContractNotaryInitInfo) String() string {
	return tea.Prettify(s)
}

func (s ContractNotaryInitInfo) GoString() string {
	return s.String()
}

func (s *ContractNotaryInitInfo) SetContent(v string) *ContractNotaryInitInfo {
	s.Content = &v
	return s
}

func (s *ContractNotaryInitInfo) SetFileNum(v int64) *ContractNotaryInitInfo {
	s.FileNum = &v
	return s
}

func (s *ContractNotaryInitInfo) SetInitiator(v string) *ContractNotaryInitInfo {
	s.Initiator = &v
	return s
}

func (s *ContractNotaryInitInfo) SetSignatories(v string) *ContractNotaryInitInfo {
	s.Signatories = &v
	return s
}

func (s *ContractNotaryInitInfo) SetTimestamp(v string) *ContractNotaryInitInfo {
	s.Timestamp = &v
	return s
}

func (s *ContractNotaryInitInfo) SetTxHash(v string) *ContractNotaryInitInfo {
	s.TxHash = &v
	return s
}

// 文件模板中的输入项组件
type ContractTemplateStructComponent struct {
	// 填充字体,默认1，1-宋体，2-新宋体,4-黑体，5-楷体
	Font *int64 `json:"font,omitempty" xml:"font,omitempty"`
	// 填充字体大小,默认12
	FontSize *string `json:"font_size,omitempty" xml:"font_size,omitempty"`
	// 输入项组件高度
	Height *string `json:"height,omitempty" xml:"height,omitempty"`
	// 输入项组件id，使用时可用id填充，为空时表示添加，不为空时表示修改
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 模板下输入项组件唯一标识，使用模板时也可用根据key值填充
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// 输入项组件显示名称
	Label *string `json:"label,omitempty" xml:"label,omitempty"`
	// 输入项组件type=2,type=3时填充格式校验规则;数字格式如：#,#00.0# 日期格式如： yyyy-MM-dd
	Limit *string `json:"limit,omitempty" xml:"limit,omitempty"`
	// 页码
	Page *int64 `json:"page,omitempty" xml:"page,omitempty"`
	// 是否必填，默认true
	Required *bool `json:"required,omitempty" xml:"required,omitempty"`
	// 字体颜色，默认#000000黑色
	TextColor *string `json:"text_color,omitempty" xml:"text_color,omitempty"`
	// 输入项组件类型，1-文本，2-数字,3-日期，6-签约区
	Type *int64 `json:"type,omitempty" xml:"type,omitempty"`
	// 输入项组件宽度
	Width *string `json:"width,omitempty" xml:"width,omitempty"`
	// x轴坐标，左下角为原点
	X *string `json:"x,omitempty" xml:"x,omitempty"`
	// y轴坐标，左下角为原点
	Y *string `json:"y,omitempty" xml:"y,omitempty"`
}

func (s ContractTemplateStructComponent) String() string {
	return tea.Prettify(s)
}

func (s ContractTemplateStructComponent) GoString() string {
	return s.String()
}

func (s *ContractTemplateStructComponent) SetFont(v int64) *ContractTemplateStructComponent {
	s.Font = &v
	return s
}

func (s *ContractTemplateStructComponent) SetFontSize(v string) *ContractTemplateStructComponent {
	s.FontSize = &v
	return s
}

func (s *ContractTemplateStructComponent) SetHeight(v string) *ContractTemplateStructComponent {
	s.Height = &v
	return s
}

func (s *ContractTemplateStructComponent) SetId(v string) *ContractTemplateStructComponent {
	s.Id = &v
	return s
}

func (s *ContractTemplateStructComponent) SetKey(v string) *ContractTemplateStructComponent {
	s.Key = &v
	return s
}

func (s *ContractTemplateStructComponent) SetLabel(v string) *ContractTemplateStructComponent {
	s.Label = &v
	return s
}

func (s *ContractTemplateStructComponent) SetLimit(v string) *ContractTemplateStructComponent {
	s.Limit = &v
	return s
}

func (s *ContractTemplateStructComponent) SetPage(v int64) *ContractTemplateStructComponent {
	s.Page = &v
	return s
}

func (s *ContractTemplateStructComponent) SetRequired(v bool) *ContractTemplateStructComponent {
	s.Required = &v
	return s
}

func (s *ContractTemplateStructComponent) SetTextColor(v string) *ContractTemplateStructComponent {
	s.TextColor = &v
	return s
}

func (s *ContractTemplateStructComponent) SetType(v int64) *ContractTemplateStructComponent {
	s.Type = &v
	return s
}

func (s *ContractTemplateStructComponent) SetWidth(v string) *ContractTemplateStructComponent {
	s.Width = &v
	return s
}

func (s *ContractTemplateStructComponent) SetX(v string) *ContractTemplateStructComponent {
	s.X = &v
	return s
}

func (s *ContractTemplateStructComponent) SetY(v string) *ContractTemplateStructComponent {
	s.Y = &v
	return s
}

// 见证流程创建响应数据
type WitnessFlowConfig struct {
	// 企业实名认证方式,对公打款：1；企业芝麻认证：3；法定代表授权：4；
	OrganRealnameTypes []*int64 `json:"organ_realname_types,omitempty" xml:"organ_realname_types,omitempty" type:"Repeated"`
	// 个人实名认证方式, 银行四要素：2；芝麻认证-人脸识别：3；微众-人脸识别：4；
	PersonRealnameTypes []*int64 `json:"person_realname_types,omitempty" xml:"person_realname_types,omitempty" type:"Repeated"`
	// 是否需要实名认证
	RealNameCert *bool `json:"real_name_cert,omitempty" xml:"real_name_cert,omitempty"`
	// 意愿认证方式, 芝麻认证-人脸识别：2；短信验证码：3；微众-人脸识别：4；ukey认证：5；签署密码认证：6；
	WillingnessTypes []*int64 `json:"willingness_types,omitempty" xml:"willingness_types,omitempty" type:"Repeated"`
}

func (s WitnessFlowConfig) String() string {
	return tea.Prettify(s)
}

func (s WitnessFlowConfig) GoString() string {
	return s.String()
}

func (s *WitnessFlowConfig) SetOrganRealnameTypes(v []*int64) *WitnessFlowConfig {
	s.OrganRealnameTypes = v
	return s
}

func (s *WitnessFlowConfig) SetPersonRealnameTypes(v []*int64) *WitnessFlowConfig {
	s.PersonRealnameTypes = v
	return s
}

func (s *WitnessFlowConfig) SetRealNameCert(v bool) *WitnessFlowConfig {
	s.RealNameCert = &v
	return s
}

func (s *WitnessFlowConfig) SetWillingnessTypes(v []*int64) *WitnessFlowConfig {
	s.WillingnessTypes = v
	return s
}

// 合同印章
type ContractSeal struct {
	// 印章别名
	Alias *string `json:"alias,omitempty" xml:"alias,omitempty"`
	// 印章创建时间
	CreateDate *int64 `json:"create_date,omitempty" xml:"create_date,omitempty"`
	// 默认印章标识
	DefaultFlag *bool `json:"default_flag,omitempty" xml:"default_flag,omitempty"`
	// 印章fileKey
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty"`
	// 印章高度
	Height *int64 `json:"height,omitempty" xml:"height,omitempty"`
	// 印章宽度
	Width *int64 `json:"width,omitempty" xml:"width,omitempty"`
	// 印章id
	SealId *string `json:"seal_id,omitempty" xml:"seal_id,omitempty"`
	// 印章类型，1-机构模板章，2-个人模板章，3-自定义印章，4-手绘章
	SealType *int64 `json:"seal_type,omitempty" xml:"seal_type,omitempty"`
	// 印章下载地址, 有效时间1小时
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 印章业务类型，CANCELLATION-作废章，COMMON-其它
	SealBizType *string `json:"seal_biz_type,omitempty" xml:"seal_biz_type,omitempty"`
}

func (s ContractSeal) String() string {
	return tea.Prettify(s)
}

func (s ContractSeal) GoString() string {
	return s.String()
}

func (s *ContractSeal) SetAlias(v string) *ContractSeal {
	s.Alias = &v
	return s
}

func (s *ContractSeal) SetCreateDate(v int64) *ContractSeal {
	s.CreateDate = &v
	return s
}

func (s *ContractSeal) SetDefaultFlag(v bool) *ContractSeal {
	s.DefaultFlag = &v
	return s
}

func (s *ContractSeal) SetFileKey(v string) *ContractSeal {
	s.FileKey = &v
	return s
}

func (s *ContractSeal) SetHeight(v int64) *ContractSeal {
	s.Height = &v
	return s
}

func (s *ContractSeal) SetWidth(v int64) *ContractSeal {
	s.Width = &v
	return s
}

func (s *ContractSeal) SetSealId(v string) *ContractSeal {
	s.SealId = &v
	return s
}

func (s *ContractSeal) SetSealType(v int64) *ContractSeal {
	s.SealType = &v
	return s
}

func (s *ContractSeal) SetUrl(v string) *ContractSeal {
	s.Url = &v
	return s
}

func (s *ContractSeal) SetSealBizType(v string) *ContractSeal {
	s.SealBizType = &v
	return s
}

// 见证流程签署数据
type WitnessSignData struct {
	// 印章图片fileKey列表
	SealFileKeys []*string `json:"seal_file_keys,omitempty" xml:"seal_file_keys,omitempty" type:"Repeated"`
	// 印章id列表
	SealIds []*string `json:"seal_ids,omitempty" xml:"seal_ids,omitempty" type:"Repeated"`
	// 待签署文档摘要值，批量签时必传
	SignHash *string `json:"sign_hash,omitempty" xml:"sign_hash,omitempty"`
	// 签署位置信息
	SignPosData *string `json:"sign_pos_data,omitempty" xml:"sign_pos_data,omitempty"`
	// 第三方文档id，批量签时必传
	ThirdDocId *string `json:"third_doc_id,omitempty" xml:"third_doc_id,omitempty"`
}

func (s WitnessSignData) String() string {
	return tea.Prettify(s)
}

func (s WitnessSignData) GoString() string {
	return s.String()
}

func (s *WitnessSignData) SetSealFileKeys(v []*string) *WitnessSignData {
	s.SealFileKeys = v
	return s
}

func (s *WitnessSignData) SetSealIds(v []*string) *WitnessSignData {
	s.SealIds = v
	return s
}

func (s *WitnessSignData) SetSignHash(v string) *WitnessSignData {
	s.SignHash = &v
	return s
}

func (s *WitnessSignData) SetSignPosData(v string) *WitnessSignData {
	s.SignPosData = &v
	return s
}

func (s *WitnessSignData) SetThirdDocId(v string) *WitnessSignData {
	s.ThirdDocId = &v
	return s
}

// 签署区列表数据
type ContractPlatformSignFieldApplication struct {
	// 文件file id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 签署顺序，默认1,且不小于1，顺序越小越先处理
	Order *int64 `json:"order,omitempty" xml:"order,omitempty"`
	// 印章id， 仅限企业公章，暂不支持指定企业法定代表人印章 ，如不传，则采用账号下的默认印章
	SealId *string `json:"seal_id,omitempty" xml:"seal_id,omitempty"`
	// 第三方业务流水号id，保证相同签署人、相同签约主体、相同签署顺序的任务，对应的第三方业务流水id唯一，默认空
	ThirdOrderNo *string `json:"third_order_no,omitempty" xml:"third_order_no,omitempty"`
	// 页码信息，当签署区signType为2时, 页码可以'-'分割, 其他情况只能是数字
	PosPage *string `json:"pos_page,omitempty" xml:"pos_page,omitempty" require:"true"`
	// x坐标，默认空
	PosX *string `json:"pos_x,omitempty" xml:"pos_x,omitempty"`
	// y坐标
	PosY *string `json:"pos_y,omitempty" xml:"pos_y,omitempty" require:"true"`
	// 签署区宽，默认印章宽度
	Width *string `json:"width,omitempty" xml:"width,omitempty"`
	// 是否添加签署时间戳， 默认不添加，默认格式 yyyy-MM-dd HH : mm : ss
	AddSignTime *bool `json:"add_sign_time,omitempty" xml:"add_sign_time,omitempty"`
	// 签署类型， 1-单页签署，2-骑缝签署，默认1
	SignType *int64 `json:"sign_type,omitempty" xml:"sign_type,omitempty"`
}

func (s ContractPlatformSignFieldApplication) String() string {
	return tea.Prettify(s)
}

func (s ContractPlatformSignFieldApplication) GoString() string {
	return s.String()
}

func (s *ContractPlatformSignFieldApplication) SetFileId(v string) *ContractPlatformSignFieldApplication {
	s.FileId = &v
	return s
}

func (s *ContractPlatformSignFieldApplication) SetOrder(v int64) *ContractPlatformSignFieldApplication {
	s.Order = &v
	return s
}

func (s *ContractPlatformSignFieldApplication) SetSealId(v string) *ContractPlatformSignFieldApplication {
	s.SealId = &v
	return s
}

func (s *ContractPlatformSignFieldApplication) SetThirdOrderNo(v string) *ContractPlatformSignFieldApplication {
	s.ThirdOrderNo = &v
	return s
}

func (s *ContractPlatformSignFieldApplication) SetPosPage(v string) *ContractPlatformSignFieldApplication {
	s.PosPage = &v
	return s
}

func (s *ContractPlatformSignFieldApplication) SetPosX(v string) *ContractPlatformSignFieldApplication {
	s.PosX = &v
	return s
}

func (s *ContractPlatformSignFieldApplication) SetPosY(v string) *ContractPlatformSignFieldApplication {
	s.PosY = &v
	return s
}

func (s *ContractPlatformSignFieldApplication) SetWidth(v string) *ContractPlatformSignFieldApplication {
	s.Width = &v
	return s
}

func (s *ContractPlatformSignFieldApplication) SetAddSignTime(v bool) *ContractPlatformSignFieldApplication {
	s.AddSignTime = &v
	return s
}

func (s *ContractPlatformSignFieldApplication) SetSignType(v int64) *ContractPlatformSignFieldApplication {
	s.SignType = &v
	return s
}

// 关键字位置列表
type KeywordsPosition struct {
	// 关键字
	Keyword *string `json:"keyword,omitempty" xml:"keyword,omitempty" require:"true"`
	// 页码
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
	// x坐标
	PosX *string `json:"pos_x,omitempty" xml:"pos_x,omitempty" require:"true"`
	// y坐标
	PosY *string `json:"pos_y,omitempty" xml:"pos_y,omitempty" require:"true"`
}

func (s KeywordsPosition) String() string {
	return tea.Prettify(s)
}

func (s KeywordsPosition) GoString() string {
	return s.String()
}

func (s *KeywordsPosition) SetKeyword(v string) *KeywordsPosition {
	s.Keyword = &v
	return s
}

func (s *KeywordsPosition) SetPageIndex(v int64) *KeywordsPosition {
	s.PageIndex = &v
	return s
}

func (s *KeywordsPosition) SetPosX(v string) *KeywordsPosition {
	s.PosX = &v
	return s
}

func (s *KeywordsPosition) SetPosY(v string) *KeywordsPosition {
	s.PosY = &v
	return s
}

// 见证流程文档检验数据
type WitnessDocs struct {
	// 文档摘要值
	DocHash *string `json:"doc_hash,omitempty" xml:"doc_hash,omitempty" require:"true"`
	// 第三方文档id
	ThirdDocId *string `json:"third_doc_id,omitempty" xml:"third_doc_id,omitempty" require:"true"`
}

func (s WitnessDocs) String() string {
	return tea.Prettify(s)
}

func (s WitnessDocs) GoString() string {
	return s.String()
}

func (s *WitnessDocs) SetDocHash(v string) *WitnessDocs {
	s.DocHash = &v
	return s
}

func (s *WitnessDocs) SetThirdDocId(v string) *WitnessDocs {
	s.ThirdDocId = &v
	return s
}

// 普通代扣规则
type RepaymentOrderRequest struct {
	// 代扣触发时间，精确到毫秒
	// java.lang.System#currentTimeMillis()
	PayDate *int64 `json:"pay_date,omitempty" xml:"pay_date,omitempty" require:"true"`
	// 代扣金额，整数 精确到分
	PayMoney *int64 `json:"pay_money,omitempty" xml:"pay_money,omitempty" require:"true"`
	// 是否用户签署成功后立即触发第一期代扣
	TriggerImmediately *int64 `json:"trigger_immediately,omitempty" xml:"trigger_immediately,omitempty"`
}

func (s RepaymentOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s RepaymentOrderRequest) GoString() string {
	return s.String()
}

func (s *RepaymentOrderRequest) SetPayDate(v int64) *RepaymentOrderRequest {
	s.PayDate = &v
	return s
}

func (s *RepaymentOrderRequest) SetPayMoney(v int64) *RepaymentOrderRequest {
	s.PayMoney = &v
	return s
}

func (s *RepaymentOrderRequest) SetTriggerImmediately(v int64) *RepaymentOrderRequest {
	s.TriggerImmediately = &v
	return s
}

// 可信时间信息结构
type TsrResponse struct {
	// 可信时间请求结果状态吗
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// hash后的信息
	HashedMessage *string `json:"hashed_message,omitempty" xml:"hashed_message,omitempty" require:"true"`
	// 哈希算法
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty" require:"true"`
	// 请求失败时候的错误信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 时间
	Ts *string `json:"ts,omitempty" xml:"ts,omitempty" require:"true"`
	// 精简后的时间戳完整编码（在校验时需要提交）
	Ctsr *string `json:"ctsr,omitempty" xml:"ctsr,omitempty" require:"true"`
	// 凭证序列号 （在校验的时需要先填写凭证编号）
	//
	Sn *string `json:"sn,omitempty" xml:"sn,omitempty" require:"true"`
}

func (s TsrResponse) String() string {
	return tea.Prettify(s)
}

func (s TsrResponse) GoString() string {
	return s.String()
}

func (s *TsrResponse) SetCode(v string) *TsrResponse {
	s.Code = &v
	return s
}

func (s *TsrResponse) SetHashedMessage(v string) *TsrResponse {
	s.HashedMessage = &v
	return s
}

func (s *TsrResponse) SetHashAlgorithm(v string) *TsrResponse {
	s.HashAlgorithm = &v
	return s
}

func (s *TsrResponse) SetMessage(v string) *TsrResponse {
	s.Message = &v
	return s
}

func (s *TsrResponse) SetTs(v string) *TsrResponse {
	s.Ts = &v
	return s
}

func (s *TsrResponse) SetCtsr(v string) *TsrResponse {
	s.Ctsr = &v
	return s
}

func (s *TsrResponse) SetSn(v string) *TsrResponse {
	s.Sn = &v
	return s
}

type CallbackArbitrationStatusRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 案件文书号
	AcceptanceNumber *string `json:"acceptance_number,omitempty" xml:"acceptance_number,omitempty"`
	// 案件编号
	CaseNo *string `json:"case_no,omitempty" xml:"case_no,omitempty" require:"true"`
	// 确认时间时间戳
	ConfirmTime *int64 `json:"confirm_time,omitempty" xml:"confirm_time,omitempty"`
	// 预处理案号
	PreacceptanceNumber *string `json:"preacceptance_number,omitempty" xml:"preacceptance_number,omitempty"`
	// 发送时间时间戳
	SendTime *int64 `json:"send_time,omitempty" xml:"send_time,omitempty"`
	// 案件状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s CallbackArbitrationStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackArbitrationStatusRequest) GoString() string {
	return s.String()
}

func (s *CallbackArbitrationStatusRequest) SetAuthToken(v string) *CallbackArbitrationStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackArbitrationStatusRequest) SetProductInstanceId(v string) *CallbackArbitrationStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackArbitrationStatusRequest) SetAcceptanceNumber(v string) *CallbackArbitrationStatusRequest {
	s.AcceptanceNumber = &v
	return s
}

func (s *CallbackArbitrationStatusRequest) SetCaseNo(v string) *CallbackArbitrationStatusRequest {
	s.CaseNo = &v
	return s
}

func (s *CallbackArbitrationStatusRequest) SetConfirmTime(v int64) *CallbackArbitrationStatusRequest {
	s.ConfirmTime = &v
	return s
}

func (s *CallbackArbitrationStatusRequest) SetPreacceptanceNumber(v string) *CallbackArbitrationStatusRequest {
	s.PreacceptanceNumber = &v
	return s
}

func (s *CallbackArbitrationStatusRequest) SetSendTime(v int64) *CallbackArbitrationStatusRequest {
	s.SendTime = &v
	return s
}

func (s *CallbackArbitrationStatusRequest) SetStatus(v string) *CallbackArbitrationStatusRequest {
	s.Status = &v
	return s
}

type CallbackArbitrationStatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CallbackArbitrationStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackArbitrationStatusResponse) GoString() string {
	return s.String()
}

func (s *CallbackArbitrationStatusResponse) SetReqMsgId(v string) *CallbackArbitrationStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackArbitrationStatusResponse) SetResultCode(v string) *CallbackArbitrationStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackArbitrationStatusResponse) SetResultMsg(v string) *CallbackArbitrationStatusResponse {
	s.ResultMsg = &v
	return s
}

type CreateContractAccountRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 邮箱地址，默认空
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 证件号
	IdNumber *string `json:"id_number,omitempty" xml:"id_number,omitempty" require:"true"`
	// 证件类型，默认CRED_PSN_CH_IDCARD，详见个人证件类型说明文档（https://tech.antfin.com/docs/2/155166）
	IdType *string `json:"id_type,omitempty" xml:"id_type,omitempty" require:"true"`
	// 手机号码，默认空
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 用户唯一标识，可传入第三方平台的个人用户id、证件号、手机号、邮箱等，如果设置则作为账号唯一性字段，相同信息不可重复创建。（个人用户与机构的唯一标识不可重复）
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s CreateContractAccountRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateContractAccountRequest) GoString() string {
	return s.String()
}

func (s *CreateContractAccountRequest) SetAuthToken(v string) *CreateContractAccountRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateContractAccountRequest) SetProductInstanceId(v string) *CreateContractAccountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateContractAccountRequest) SetEmail(v string) *CreateContractAccountRequest {
	s.Email = &v
	return s
}

func (s *CreateContractAccountRequest) SetIdNumber(v string) *CreateContractAccountRequest {
	s.IdNumber = &v
	return s
}

func (s *CreateContractAccountRequest) SetIdType(v string) *CreateContractAccountRequest {
	s.IdType = &v
	return s
}

func (s *CreateContractAccountRequest) SetMobile(v string) *CreateContractAccountRequest {
	s.Mobile = &v
	return s
}

func (s *CreateContractAccountRequest) SetName(v string) *CreateContractAccountRequest {
	s.Name = &v
	return s
}

func (s *CreateContractAccountRequest) SetUserId(v string) *CreateContractAccountRequest {
	s.UserId = &v
	return s
}

type CreateContractAccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 个人账号ID
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s CreateContractAccountResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateContractAccountResponse) GoString() string {
	return s.String()
}

func (s *CreateContractAccountResponse) SetReqMsgId(v string) *CreateContractAccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateContractAccountResponse) SetResultCode(v string) *CreateContractAccountResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateContractAccountResponse) SetResultMsg(v string) *CreateContractAccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateContractAccountResponse) SetAccountId(v string) *CreateContractAccountResponse {
	s.AccountId = &v
	return s
}

func (s *CreateContractAccountResponse) SetCode(v int64) *CreateContractAccountResponse {
	s.Code = &v
	return s
}

func (s *CreateContractAccountResponse) SetMessage(v string) *CreateContractAccountResponse {
	s.Message = &v
	return s
}

type CreateContractAccountsealRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 电子合同用户ID（在twc.notary.contract.account.create接口中创建）
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// 印章别名
	Alias *string `json:"alias,omitempty" xml:"alias,omitempty"`
	// 印章颜色，RED-红色， BLUE-蓝色，BLACK-黑色
	Color *string `json:"color,omitempty" xml:"color,omitempty" require:"true"`
	// 印章高度, 默认95px
	Height *int64 `json:"height,omitempty" xml:"height,omitempty"`
	// 印章宽度, 默认95px
	Width *int64 `json:"width,omitempty" xml:"width,omitempty"`
	// 模板类型, 详见个人印章样式说明 SQUARE, BORDERLESS, FZKC, HWLS, HWXK, HWXKBORDER, HYLSF, RECTANGLE, YGYJFCS, YGYMBXS, YYGXSF
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s CreateContractAccountsealRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateContractAccountsealRequest) GoString() string {
	return s.String()
}

func (s *CreateContractAccountsealRequest) SetAuthToken(v string) *CreateContractAccountsealRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateContractAccountsealRequest) SetProductInstanceId(v string) *CreateContractAccountsealRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateContractAccountsealRequest) SetAccountId(v string) *CreateContractAccountsealRequest {
	s.AccountId = &v
	return s
}

func (s *CreateContractAccountsealRequest) SetAlias(v string) *CreateContractAccountsealRequest {
	s.Alias = &v
	return s
}

func (s *CreateContractAccountsealRequest) SetColor(v string) *CreateContractAccountsealRequest {
	s.Color = &v
	return s
}

func (s *CreateContractAccountsealRequest) SetHeight(v int64) *CreateContractAccountsealRequest {
	s.Height = &v
	return s
}

func (s *CreateContractAccountsealRequest) SetWidth(v int64) *CreateContractAccountsealRequest {
	s.Width = &v
	return s
}

func (s *CreateContractAccountsealRequest) SetType(v string) *CreateContractAccountsealRequest {
	s.Type = &v
	return s
}

type CreateContractAccountsealResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 印章fileKey
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty"`
	// 印章id
	SealId *string `json:"seal_id,omitempty" xml:"seal_id,omitempty"`
	// 印章下载地址, 有效时间1小时
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s CreateContractAccountsealResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateContractAccountsealResponse) GoString() string {
	return s.String()
}

func (s *CreateContractAccountsealResponse) SetReqMsgId(v string) *CreateContractAccountsealResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateContractAccountsealResponse) SetResultCode(v string) *CreateContractAccountsealResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateContractAccountsealResponse) SetResultMsg(v string) *CreateContractAccountsealResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateContractAccountsealResponse) SetCode(v int64) *CreateContractAccountsealResponse {
	s.Code = &v
	return s
}

func (s *CreateContractAccountsealResponse) SetMessage(v string) *CreateContractAccountsealResponse {
	s.Message = &v
	return s
}

func (s *CreateContractAccountsealResponse) SetFileKey(v string) *CreateContractAccountsealResponse {
	s.FileKey = &v
	return s
}

func (s *CreateContractAccountsealResponse) SetSealId(v string) *CreateContractAccountsealResponse {
	s.SealId = &v
	return s
}

func (s *CreateContractAccountsealResponse) SetUrl(v string) *CreateContractAccountsealResponse {
	s.Url = &v
	return s
}

type CreateContractOrganizationRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 创建人个人账号ID，也就是调用个人账号创建接口（twc.notary.contract.account.create
	// ）返回的accountId
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty" require:"true"`
	// 证件号
	IdNumber *string `json:"id_number,omitempty" xml:"id_number,omitempty" require:"true"`
	// 证件类型，默认CRED_ORG_USCC，详见机构证件类型说明 （https://tech.antfin.com/docs/2/155166）
	IdType *string `json:"id_type,omitempty" xml:"id_type,omitempty" require:"true"`
	// 企业法人名称
	LegalPerson *string `json:"legal_person,omitempty" xml:"legal_person,omitempty"`
	// 企业法人证件号
	LegalPersonId *string `json:"legal_person_id,omitempty" xml:"legal_person_id,omitempty"`
	// 机构名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 机构唯一标识，可传入第三方平台机构id、企业证件号、企业邮箱等如果设置则作为账号唯一性字段，相同id不可重复创建。（个人用户与机构的唯一标识不可重复）
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s CreateContractOrganizationRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateContractOrganizationRequest) GoString() string {
	return s.String()
}

func (s *CreateContractOrganizationRequest) SetAuthToken(v string) *CreateContractOrganizationRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateContractOrganizationRequest) SetProductInstanceId(v string) *CreateContractOrganizationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateContractOrganizationRequest) SetCreator(v string) *CreateContractOrganizationRequest {
	s.Creator = &v
	return s
}

func (s *CreateContractOrganizationRequest) SetIdNumber(v string) *CreateContractOrganizationRequest {
	s.IdNumber = &v
	return s
}

func (s *CreateContractOrganizationRequest) SetIdType(v string) *CreateContractOrganizationRequest {
	s.IdType = &v
	return s
}

func (s *CreateContractOrganizationRequest) SetLegalPerson(v string) *CreateContractOrganizationRequest {
	s.LegalPerson = &v
	return s
}

func (s *CreateContractOrganizationRequest) SetLegalPersonId(v string) *CreateContractOrganizationRequest {
	s.LegalPersonId = &v
	return s
}

func (s *CreateContractOrganizationRequest) SetName(v string) *CreateContractOrganizationRequest {
	s.Name = &v
	return s
}

func (s *CreateContractOrganizationRequest) SetUserId(v string) *CreateContractOrganizationRequest {
	s.UserId = &v
	return s
}

type CreateContractOrganizationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 机构账号ID
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty"`
}

func (s CreateContractOrganizationResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateContractOrganizationResponse) GoString() string {
	return s.String()
}

func (s *CreateContractOrganizationResponse) SetReqMsgId(v string) *CreateContractOrganizationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateContractOrganizationResponse) SetResultCode(v string) *CreateContractOrganizationResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateContractOrganizationResponse) SetResultMsg(v string) *CreateContractOrganizationResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateContractOrganizationResponse) SetCode(v int64) *CreateContractOrganizationResponse {
	s.Code = &v
	return s
}

func (s *CreateContractOrganizationResponse) SetMessage(v string) *CreateContractOrganizationResponse {
	s.Message = &v
	return s
}

func (s *CreateContractOrganizationResponse) SetOrgId(v string) *CreateContractOrganizationResponse {
	s.OrgId = &v
	return s
}

type CreateContractOrgsealRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 印章别名
	Alias *string `json:"alias,omitempty" xml:"alias,omitempty"`
	// 中心图案类型，STAR-圆形有五角星，NONE-圆形无五角星， 详见机构印章样式说明
	Central *string `json:"central,omitempty" xml:"central,omitempty" require:"true"`
	// 印章颜色，RED-红色，BLUE-蓝色，BLACK-黑色
	Color *string `json:"color,omitempty" xml:"color,omitempty" require:"true"`
	// 印章高度，默认159px
	Height *int64 `json:"height,omitempty" xml:"height,omitempty"`
	// 横向文，可设置0-8个字，企业名称超出25个字后，不支持设置横向文
	Htext *string `json:"htext,omitempty" xml:"htext,omitempty"`
	// 机构ID
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty" require:"true"`
	// 下弦文，可设置0-20个字，企业企业名称超出25个字后，不支持设置下弦文
	Qtext *string `json:"qtext,omitempty" xml:"qtext,omitempty"`
	// 模板类型，TEMPLATE_ROUND-圆章，TEMPLATE_OVAL-椭圆章， 详见机构印章样式说明
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 印章宽度，默认159px
	Width *int64 `json:"width,omitempty" xml:"width,omitempty"`
}

func (s CreateContractOrgsealRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateContractOrgsealRequest) GoString() string {
	return s.String()
}

func (s *CreateContractOrgsealRequest) SetAuthToken(v string) *CreateContractOrgsealRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateContractOrgsealRequest) SetProductInstanceId(v string) *CreateContractOrgsealRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateContractOrgsealRequest) SetAlias(v string) *CreateContractOrgsealRequest {
	s.Alias = &v
	return s
}

func (s *CreateContractOrgsealRequest) SetCentral(v string) *CreateContractOrgsealRequest {
	s.Central = &v
	return s
}

func (s *CreateContractOrgsealRequest) SetColor(v string) *CreateContractOrgsealRequest {
	s.Color = &v
	return s
}

func (s *CreateContractOrgsealRequest) SetHeight(v int64) *CreateContractOrgsealRequest {
	s.Height = &v
	return s
}

func (s *CreateContractOrgsealRequest) SetHtext(v string) *CreateContractOrgsealRequest {
	s.Htext = &v
	return s
}

func (s *CreateContractOrgsealRequest) SetOrgId(v string) *CreateContractOrgsealRequest {
	s.OrgId = &v
	return s
}

func (s *CreateContractOrgsealRequest) SetQtext(v string) *CreateContractOrgsealRequest {
	s.Qtext = &v
	return s
}

func (s *CreateContractOrgsealRequest) SetType(v string) *CreateContractOrgsealRequest {
	s.Type = &v
	return s
}

func (s *CreateContractOrgsealRequest) SetWidth(v int64) *CreateContractOrgsealRequest {
	s.Width = &v
	return s
}

type CreateContractOrgsealResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 印章fileKey
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 印章ID
	SealId *string `json:"seal_id,omitempty" xml:"seal_id,omitempty"`
	// 印章下载地址, 有效时间1小时
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s CreateContractOrgsealResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateContractOrgsealResponse) GoString() string {
	return s.String()
}

func (s *CreateContractOrgsealResponse) SetReqMsgId(v string) *CreateContractOrgsealResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateContractOrgsealResponse) SetResultCode(v string) *CreateContractOrgsealResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateContractOrgsealResponse) SetResultMsg(v string) *CreateContractOrgsealResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateContractOrgsealResponse) SetCode(v int64) *CreateContractOrgsealResponse {
	s.Code = &v
	return s
}

func (s *CreateContractOrgsealResponse) SetFileKey(v string) *CreateContractOrgsealResponse {
	s.FileKey = &v
	return s
}

func (s *CreateContractOrgsealResponse) SetMessage(v string) *CreateContractOrgsealResponse {
	s.Message = &v
	return s
}

func (s *CreateContractOrgsealResponse) SetSealId(v string) *CreateContractOrgsealResponse {
	s.SealId = &v
	return s
}

func (s *CreateContractOrgsealResponse) SetUrl(v string) *CreateContractOrgsealResponse {
	s.Url = &v
	return s
}

type AuthContractSignRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授权人ID，即个人账号ID或机构账号ID
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// 授权截止时间, 格式为yyyy-MM-dd HH:mm:ss，默认无限期
	Deadline *string `json:"deadline,omitempty" xml:"deadline,omitempty"`
}

func (s AuthContractSignRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthContractSignRequest) GoString() string {
	return s.String()
}

func (s *AuthContractSignRequest) SetAuthToken(v string) *AuthContractSignRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthContractSignRequest) SetProductInstanceId(v string) *AuthContractSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthContractSignRequest) SetAccountId(v string) *AuthContractSignRequest {
	s.AccountId = &v
	return s
}

func (s *AuthContractSignRequest) SetDeadline(v string) *AuthContractSignRequest {
	s.Deadline = &v
	return s
}

type AuthContractSignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 业务数据, 是否授权成功
	Accepted *bool `json:"accepted,omitempty" xml:"accepted,omitempty"`
}

func (s AuthContractSignResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthContractSignResponse) GoString() string {
	return s.String()
}

func (s *AuthContractSignResponse) SetReqMsgId(v string) *AuthContractSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthContractSignResponse) SetResultCode(v string) *AuthContractSignResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthContractSignResponse) SetResultMsg(v string) *AuthContractSignResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthContractSignResponse) SetCode(v int64) *AuthContractSignResponse {
	s.Code = &v
	return s
}

func (s *AuthContractSignResponse) SetMessage(v string) *AuthContractSignResponse {
	s.Message = &v
	return s
}

func (s *AuthContractSignResponse) SetAccepted(v bool) *AuthContractSignResponse {
	s.Accepted = &v
	return s
}

type CreateContractTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 模板文件md5值，再做base64编码
	ContentMd5 *string `json:"content_md5,omitempty" xml:"content_md5,omitempty" require:"true"`
	// 目标文件的MIME类型
	ContentType *string `json:"content_type,omitempty" xml:"content_type,omitempty" require:"true"`
	// 是否需要转成pdf，如果模板文件为.doc/.docx 传true，为pdf传false
	Convert2Pdf *bool `json:"convert2_pdf,omitempty" xml:"convert2_pdf,omitempty" require:"true"`
	// 文件名称，必须带扩展名如:.pdf,.doc,.docx
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
}

func (s CreateContractTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateContractTemplateRequest) GoString() string {
	return s.String()
}

func (s *CreateContractTemplateRequest) SetAuthToken(v string) *CreateContractTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateContractTemplateRequest) SetProductInstanceId(v string) *CreateContractTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateContractTemplateRequest) SetContentMd5(v string) *CreateContractTemplateRequest {
	s.ContentMd5 = &v
	return s
}

func (s *CreateContractTemplateRequest) SetContentType(v string) *CreateContractTemplateRequest {
	s.ContentType = &v
	return s
}

func (s *CreateContractTemplateRequest) SetConvert2Pdf(v bool) *CreateContractTemplateRequest {
	s.Convert2Pdf = &v
	return s
}

func (s *CreateContractTemplateRequest) SetFileName(v string) *CreateContractTemplateRequest {
	s.FileName = &v
	return s
}

type CreateContractTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 模板ID
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty"`
	// 文件直传地址，需要用此上传地址使用put方式上传文件，只有文件上传后模板才可用
	UploadUrl *string `json:"upload_url,omitempty" xml:"upload_url,omitempty"`
}

func (s CreateContractTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateContractTemplateResponse) GoString() string {
	return s.String()
}

func (s *CreateContractTemplateResponse) SetReqMsgId(v string) *CreateContractTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateContractTemplateResponse) SetResultCode(v string) *CreateContractTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateContractTemplateResponse) SetResultMsg(v string) *CreateContractTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateContractTemplateResponse) SetCode(v int64) *CreateContractTemplateResponse {
	s.Code = &v
	return s
}

func (s *CreateContractTemplateResponse) SetMessage(v string) *CreateContractTemplateResponse {
	s.Message = &v
	return s
}

func (s *CreateContractTemplateResponse) SetTemplateId(v string) *CreateContractTemplateResponse {
	s.TemplateId = &v
	return s
}

func (s *CreateContractTemplateResponse) SetUploadUrl(v string) *CreateContractTemplateResponse {
	s.UploadUrl = &v
	return s
}

type CreateContractFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 是否自动归档，默认false。如设置为true，则在调用签署流程开启(twc.notary.contract.flow.start)后，当所有签署人签署完毕，系统自动将流程归档，状态变为“已完成”状态，在流程状态为“已完成”前，可随时添加签署人；如设置为false，则在调用签署流程开启后，需主动调用签署流程归档接口，将流程状态变更为“已完成”，归档前可随时添加签署人；已完成的流程才可下载签署后的文件
	AutoArchive *bool `json:"auto_archive,omitempty" xml:"auto_archive,omitempty"`
	// 文件主题
	BusinessScene *string `json:"business_scene,omitempty" xml:"business_scene,omitempty" require:"true"`
	// 任务配置信息
	ConfigInfo *ContractSignFlowConfig `json:"config_info,omitempty" xml:"config_info,omitempty"`
	// 文件到期前，提前多久回调提醒续签，单位为小时，时间区间：1小时——15天（360小时），默认不提醒
	ContractRemind *int64 `json:"contract_remind,omitempty" xml:"contract_remind,omitempty"`
	// 文件有效截止日期,毫秒，默认不失效
	ContractValidity *int64 `json:"contract_validity,omitempty" xml:"contract_validity,omitempty"`
	// 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
	InitiatorAccountId *string `json:"initiator_account_id,omitempty" xml:"initiator_account_id,omitempty"`
	// 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
	InitiatorAuthorizedAccountId *string `json:"initiator_authorized_account_id,omitempty" xml:"initiator_authorized_account_id,omitempty"`
	// 签署有效截止日期,毫秒，默认不失效
	SignValidity *int64 `json:"sign_validity,omitempty" xml:"sign_validity,omitempty"`
}

func (s CreateContractFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateContractFlowRequest) GoString() string {
	return s.String()
}

func (s *CreateContractFlowRequest) SetAuthToken(v string) *CreateContractFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateContractFlowRequest) SetProductInstanceId(v string) *CreateContractFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateContractFlowRequest) SetAutoArchive(v bool) *CreateContractFlowRequest {
	s.AutoArchive = &v
	return s
}

func (s *CreateContractFlowRequest) SetBusinessScene(v string) *CreateContractFlowRequest {
	s.BusinessScene = &v
	return s
}

func (s *CreateContractFlowRequest) SetConfigInfo(v *ContractSignFlowConfig) *CreateContractFlowRequest {
	s.ConfigInfo = v
	return s
}

func (s *CreateContractFlowRequest) SetContractRemind(v int64) *CreateContractFlowRequest {
	s.ContractRemind = &v
	return s
}

func (s *CreateContractFlowRequest) SetContractValidity(v int64) *CreateContractFlowRequest {
	s.ContractValidity = &v
	return s
}

func (s *CreateContractFlowRequest) SetInitiatorAccountId(v string) *CreateContractFlowRequest {
	s.InitiatorAccountId = &v
	return s
}

func (s *CreateContractFlowRequest) SetInitiatorAuthorizedAccountId(v string) *CreateContractFlowRequest {
	s.InitiatorAuthorizedAccountId = &v
	return s
}

func (s *CreateContractFlowRequest) SetSignValidity(v int64) *CreateContractFlowRequest {
	s.SignValidity = &v
	return s
}

type CreateContractFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
}

func (s CreateContractFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateContractFlowResponse) GoString() string {
	return s.String()
}

func (s *CreateContractFlowResponse) SetReqMsgId(v string) *CreateContractFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateContractFlowResponse) SetResultCode(v string) *CreateContractFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateContractFlowResponse) SetResultMsg(v string) *CreateContractFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateContractFlowResponse) SetCode(v int64) *CreateContractFlowResponse {
	s.Code = &v
	return s
}

func (s *CreateContractFlowResponse) SetMessage(v string) *CreateContractFlowResponse {
	s.Message = &v
	return s
}

func (s *CreateContractFlowResponse) SetFlowId(v string) *CreateContractFlowResponse {
	s.FlowId = &v
	return s
}

type AddContractDocumentRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	// 文档列表数据
	Docs []*ContractDoc `json:"docs,omitempty" xml:"docs,omitempty" require:"true" type:"Repeated"`
}

func (s AddContractDocumentRequest) String() string {
	return tea.Prettify(s)
}

func (s AddContractDocumentRequest) GoString() string {
	return s.String()
}

func (s *AddContractDocumentRequest) SetAuthToken(v string) *AddContractDocumentRequest {
	s.AuthToken = &v
	return s
}

func (s *AddContractDocumentRequest) SetProductInstanceId(v string) *AddContractDocumentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddContractDocumentRequest) SetFlowId(v string) *AddContractDocumentRequest {
	s.FlowId = &v
	return s
}

func (s *AddContractDocumentRequest) SetDocs(v []*ContractDoc) *AddContractDocumentRequest {
	s.Docs = v
	return s
}

type AddContractDocumentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s AddContractDocumentResponse) String() string {
	return tea.Prettify(s)
}

func (s AddContractDocumentResponse) GoString() string {
	return s.String()
}

func (s *AddContractDocumentResponse) SetReqMsgId(v string) *AddContractDocumentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddContractDocumentResponse) SetResultCode(v string) *AddContractDocumentResponse {
	s.ResultCode = &v
	return s
}

func (s *AddContractDocumentResponse) SetResultMsg(v string) *AddContractDocumentResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddContractDocumentResponse) SetCode(v int64) *AddContractDocumentResponse {
	s.Code = &v
	return s
}

func (s *AddContractDocumentResponse) SetMessage(v string) *AddContractDocumentResponse {
	s.Message = &v
	return s
}

type AddContractSignfieldRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	// 签署区列表数据
	Signfields []*ContractSignFieldApplication `json:"signfields,omitempty" xml:"signfields,omitempty" require:"true" type:"Repeated"`
}

func (s AddContractSignfieldRequest) String() string {
	return tea.Prettify(s)
}

func (s AddContractSignfieldRequest) GoString() string {
	return s.String()
}

func (s *AddContractSignfieldRequest) SetAuthToken(v string) *AddContractSignfieldRequest {
	s.AuthToken = &v
	return s
}

func (s *AddContractSignfieldRequest) SetProductInstanceId(v string) *AddContractSignfieldRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddContractSignfieldRequest) SetFlowId(v string) *AddContractSignfieldRequest {
	s.FlowId = &v
	return s
}

func (s *AddContractSignfieldRequest) SetSignfields(v []*ContractSignFieldApplication) *AddContractSignfieldRequest {
	s.Signfields = v
	return s
}

type AddContractSignfieldResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 签署区列表数据
	Signfields []*ContractSignField `json:"signfields,omitempty" xml:"signfields,omitempty" type:"Repeated"`
}

func (s AddContractSignfieldResponse) String() string {
	return tea.Prettify(s)
}

func (s AddContractSignfieldResponse) GoString() string {
	return s.String()
}

func (s *AddContractSignfieldResponse) SetReqMsgId(v string) *AddContractSignfieldResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddContractSignfieldResponse) SetResultCode(v string) *AddContractSignfieldResponse {
	s.ResultCode = &v
	return s
}

func (s *AddContractSignfieldResponse) SetResultMsg(v string) *AddContractSignfieldResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddContractSignfieldResponse) SetCode(v int64) *AddContractSignfieldResponse {
	s.Code = &v
	return s
}

func (s *AddContractSignfieldResponse) SetMessage(v string) *AddContractSignfieldResponse {
	s.Message = &v
	return s
}

func (s *AddContractSignfieldResponse) SetSignfields(v []*ContractSignField) *AddContractSignfieldResponse {
	s.Signfields = v
	return s
}

type StartContractFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
}

func (s StartContractFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s StartContractFlowRequest) GoString() string {
	return s.String()
}

func (s *StartContractFlowRequest) SetAuthToken(v string) *StartContractFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *StartContractFlowRequest) SetProductInstanceId(v string) *StartContractFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartContractFlowRequest) SetFlowId(v string) *StartContractFlowRequest {
	s.FlowId = &v
	return s
}

type StartContractFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s StartContractFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s StartContractFlowResponse) GoString() string {
	return s.String()
}

func (s *StartContractFlowResponse) SetReqMsgId(v string) *StartContractFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartContractFlowResponse) SetResultCode(v string) *StartContractFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *StartContractFlowResponse) SetResultMsg(v string) *StartContractFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartContractFlowResponse) SetCode(v int64) *StartContractFlowResponse {
	s.Code = &v
	return s
}

func (s *StartContractFlowResponse) SetMessage(v string) *StartContractFlowResponse {
	s.Message = &v
	return s
}

type SaveContractFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
}

func (s SaveContractFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveContractFlowRequest) GoString() string {
	return s.String()
}

func (s *SaveContractFlowRequest) SetAuthToken(v string) *SaveContractFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveContractFlowRequest) SetProductInstanceId(v string) *SaveContractFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveContractFlowRequest) SetFlowId(v string) *SaveContractFlowRequest {
	s.FlowId = &v
	return s
}

type SaveContractFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s SaveContractFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveContractFlowResponse) GoString() string {
	return s.String()
}

func (s *SaveContractFlowResponse) SetReqMsgId(v string) *SaveContractFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveContractFlowResponse) SetResultCode(v string) *SaveContractFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveContractFlowResponse) SetResultMsg(v string) *SaveContractFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveContractFlowResponse) SetCode(v int64) *SaveContractFlowResponse {
	s.Code = &v
	return s
}

func (s *SaveContractFlowResponse) SetMessage(v string) *SaveContractFlowResponse {
	s.Message = &v
	return s
}

type DownloadContractDocumentRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
}

func (s DownloadContractDocumentRequest) String() string {
	return tea.Prettify(s)
}

func (s DownloadContractDocumentRequest) GoString() string {
	return s.String()
}

func (s *DownloadContractDocumentRequest) SetAuthToken(v string) *DownloadContractDocumentRequest {
	s.AuthToken = &v
	return s
}

func (s *DownloadContractDocumentRequest) SetProductInstanceId(v string) *DownloadContractDocumentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DownloadContractDocumentRequest) SetFlowId(v string) *DownloadContractDocumentRequest {
	s.FlowId = &v
	return s
}

type DownloadContractDocumentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 文档下载地址信息列表
	Docs []*ContractDocAddress `json:"docs,omitempty" xml:"docs,omitempty" type:"Repeated"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s DownloadContractDocumentResponse) String() string {
	return tea.Prettify(s)
}

func (s DownloadContractDocumentResponse) GoString() string {
	return s.String()
}

func (s *DownloadContractDocumentResponse) SetReqMsgId(v string) *DownloadContractDocumentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DownloadContractDocumentResponse) SetResultCode(v string) *DownloadContractDocumentResponse {
	s.ResultCode = &v
	return s
}

func (s *DownloadContractDocumentResponse) SetResultMsg(v string) *DownloadContractDocumentResponse {
	s.ResultMsg = &v
	return s
}

func (s *DownloadContractDocumentResponse) SetCode(v int64) *DownloadContractDocumentResponse {
	s.Code = &v
	return s
}

func (s *DownloadContractDocumentResponse) SetDocs(v []*ContractDocAddress) *DownloadContractDocumentResponse {
	s.Docs = v
	return s
}

func (s *DownloadContractDocumentResponse) SetMessage(v string) *DownloadContractDocumentResponse {
	s.Message = &v
	return s
}

type AddContractFileRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 模板编号
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 输入项填充内容，以key:value传入
	SimpleFormFields *string `json:"simple_form_fields,omitempty" xml:"simple_form_fields,omitempty" require:"true"`
}

func (s AddContractFileRequest) String() string {
	return tea.Prettify(s)
}

func (s AddContractFileRequest) GoString() string {
	return s.String()
}

func (s *AddContractFileRequest) SetAuthToken(v string) *AddContractFileRequest {
	s.AuthToken = &v
	return s
}

func (s *AddContractFileRequest) SetProductInstanceId(v string) *AddContractFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddContractFileRequest) SetName(v string) *AddContractFileRequest {
	s.Name = &v
	return s
}

func (s *AddContractFileRequest) SetTemplateId(v string) *AddContractFileRequest {
	s.TemplateId = &v
	return s
}

func (s *AddContractFileRequest) SetSimpleFormFields(v string) *AddContractFileRequest {
	s.SimpleFormFields = &v
	return s
}

type AddContractFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件下载地址，有效期一小时
	DownloadUrl *string `json:"download_url,omitempty" xml:"download_url,omitempty"`
	// 文件id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s AddContractFileResponse) String() string {
	return tea.Prettify(s)
}

func (s AddContractFileResponse) GoString() string {
	return s.String()
}

func (s *AddContractFileResponse) SetReqMsgId(v string) *AddContractFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddContractFileResponse) SetResultCode(v string) *AddContractFileResponse {
	s.ResultCode = &v
	return s
}

func (s *AddContractFileResponse) SetResultMsg(v string) *AddContractFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddContractFileResponse) SetDownloadUrl(v string) *AddContractFileResponse {
	s.DownloadUrl = &v
	return s
}

func (s *AddContractFileResponse) SetFileId(v string) *AddContractFileResponse {
	s.FileId = &v
	return s
}

func (s *AddContractFileResponse) SetFileName(v string) *AddContractFileResponse {
	s.FileName = &v
	return s
}

func (s *AddContractFileResponse) SetCode(v int64) *AddContractFileResponse {
	s.Code = &v
	return s
}

func (s *AddContractFileResponse) SetMessage(v string) *AddContractFileResponse {
	s.Message = &v
	return s
}

type CreateContractPlatformRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 平台方经办人信息
	Creator *ContractAccountApplication `json:"creator,omitempty" xml:"creator,omitempty" require:"true"`
	// 平台机构信息
	Platform *ContractOrganizationApplication `json:"platform,omitempty" xml:"platform,omitempty" require:"true"`
}

func (s CreateContractPlatformRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateContractPlatformRequest) GoString() string {
	return s.String()
}

func (s *CreateContractPlatformRequest) SetAuthToken(v string) *CreateContractPlatformRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateContractPlatformRequest) SetProductInstanceId(v string) *CreateContractPlatformRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateContractPlatformRequest) SetCreator(v *ContractAccountApplication) *CreateContractPlatformRequest {
	s.Creator = v
	return s
}

func (s *CreateContractPlatformRequest) SetPlatform(v *ContractOrganizationApplication) *CreateContractPlatformRequest {
	s.Platform = v
	return s
}

type CreateContractPlatformResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 创建人ID
	CreatorId *string `json:"creator_id,omitempty" xml:"creator_id,omitempty"`
	// 平台方ID
	PlatformId *string `json:"platform_id,omitempty" xml:"platform_id,omitempty"`
	// 平台用户与智能合同服务间鉴权使用的密钥
	Secret *string `json:"secret,omitempty" xml:"secret,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s CreateContractPlatformResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateContractPlatformResponse) GoString() string {
	return s.String()
}

func (s *CreateContractPlatformResponse) SetReqMsgId(v string) *CreateContractPlatformResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateContractPlatformResponse) SetResultCode(v string) *CreateContractPlatformResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateContractPlatformResponse) SetResultMsg(v string) *CreateContractPlatformResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateContractPlatformResponse) SetCreatorId(v string) *CreateContractPlatformResponse {
	s.CreatorId = &v
	return s
}

func (s *CreateContractPlatformResponse) SetPlatformId(v string) *CreateContractPlatformResponse {
	s.PlatformId = &v
	return s
}

func (s *CreateContractPlatformResponse) SetSecret(v string) *CreateContractPlatformResponse {
	s.Secret = &v
	return s
}

func (s *CreateContractPlatformResponse) SetCode(v int64) *CreateContractPlatformResponse {
	s.Code = &v
	return s
}

func (s *CreateContractPlatformResponse) SetMessage(v string) *CreateContractPlatformResponse {
	s.Message = &v
	return s
}

type CreateContractUserRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户类型为机构时，填写机构信息
	Organization *ContractOrganizationApplication `json:"organization,omitempty" xml:"organization,omitempty"`
	// 用户类型为个人时，则为个人用户信息；用户类型为机构时，则为机构账号经办人信息
	User *ContractAccountApplication `json:"user,omitempty" xml:"user,omitempty" require:"true"`
	// 用户类型，个人（PERSON）或机构（ORGANIZATION）
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty" require:"true"`
}

func (s CreateContractUserRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateContractUserRequest) GoString() string {
	return s.String()
}

func (s *CreateContractUserRequest) SetAuthToken(v string) *CreateContractUserRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateContractUserRequest) SetProductInstanceId(v string) *CreateContractUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateContractUserRequest) SetOrganization(v *ContractOrganizationApplication) *CreateContractUserRequest {
	s.Organization = v
	return s
}

func (s *CreateContractUserRequest) SetUser(v *ContractAccountApplication) *CreateContractUserRequest {
	s.User = v
	return s
}

func (s *CreateContractUserRequest) SetUserType(v string) *CreateContractUserRequest {
	s.UserType = &v
	return s
}

type CreateContractUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 机构账号
	OrganizationId *string `json:"organization_id,omitempty" xml:"organization_id,omitempty"`
	// 用户类型为个人时返回用户账号；用户类型为机构时返回经办人账号
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s CreateContractUserResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateContractUserResponse) GoString() string {
	return s.String()
}

func (s *CreateContractUserResponse) SetReqMsgId(v string) *CreateContractUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateContractUserResponse) SetResultCode(v string) *CreateContractUserResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateContractUserResponse) SetResultMsg(v string) *CreateContractUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateContractUserResponse) SetOrganizationId(v string) *CreateContractUserResponse {
	s.OrganizationId = &v
	return s
}

func (s *CreateContractUserResponse) SetUserId(v string) *CreateContractUserResponse {
	s.UserId = &v
	return s
}

func (s *CreateContractUserResponse) SetCode(v int64) *CreateContractUserResponse {
	s.Code = &v
	return s
}

func (s *CreateContractUserResponse) SetMessage(v string) *CreateContractUserResponse {
	s.Message = &v
	return s
}

type StartContractHandsignRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 代理商户账户
	AgentAccountId *string `json:"agent_account_id,omitempty" xml:"agent_account_id,omitempty"`
	// 是否自动归档，默认为true
	AutoArchive *bool `json:"auto_archive,omitempty" xml:"auto_archive,omitempty"`
	// 合同文件主题
	BusinessScene *string `json:"business_scene,omitempty" xml:"business_scene,omitempty" require:"true"`
	// 文件到期前，提前多少小时回调提醒续签，小时（时间区间：1小时——15天），默认不提醒
	ContractRemind *int64 `json:"contract_remind,omitempty" xml:"contract_remind,omitempty"`
	// 签署流程任务配置信息
	ContractSignFlowConfig *ContractSignFlowConfig `json:"contract_sign_flow_config,omitempty" xml:"contract_sign_flow_config,omitempty"`
	// 文件有效截止日期,毫秒，默认不失效
	ContractValidity *int64 `json:"contract_validity,omitempty" xml:"contract_validity,omitempty"`
	// 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
	InitiatorAccountId *string `json:"initiator_account_id,omitempty" xml:"initiator_account_id,omitempty"`
	// 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
	//
	//
	InitiatorAuthorizedAccountId *string `json:"initiator_authorized_account_id,omitempty" xml:"initiator_authorized_account_id,omitempty"`
	// 代扣规则详情，不可为空
	RepaymentOrderInfo []*RepaymentOrderRequest `json:"repayment_order_info,omitempty" xml:"repayment_order_info,omitempty" type:"Repeated"`
	// 签署平台，ALIPAY（支付宝小程序）或H5，默认H5
	SignPlatform *string `json:"sign_platform,omitempty" xml:"sign_platform,omitempty"`
	// 签署有效截止日期,毫秒，默认不失效
	SignValidity *string `json:"sign_validity,omitempty" xml:"sign_validity,omitempty"`
	// 输入项填充内容，以key:value传入
	SimpleFormFields *string `json:"simple_form_fields,omitempty" xml:"simple_form_fields,omitempty" require:"true"`
	// 待签署的智能合同模板ID
	Template *string `json:"template,omitempty" xml:"template,omitempty" require:"true"`
	// 待签署客户的账户ID
	UserAccount *string `json:"user_account,omitempty" xml:"user_account,omitempty" require:"true"`
	// 是否需要短网址
	ShortUrl *bool `json:"short_url,omitempty" xml:"short_url,omitempty"`
}

func (s StartContractHandsignRequest) String() string {
	return tea.Prettify(s)
}

func (s StartContractHandsignRequest) GoString() string {
	return s.String()
}

func (s *StartContractHandsignRequest) SetAuthToken(v string) *StartContractHandsignRequest {
	s.AuthToken = &v
	return s
}

func (s *StartContractHandsignRequest) SetProductInstanceId(v string) *StartContractHandsignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartContractHandsignRequest) SetAgentAccountId(v string) *StartContractHandsignRequest {
	s.AgentAccountId = &v
	return s
}

func (s *StartContractHandsignRequest) SetAutoArchive(v bool) *StartContractHandsignRequest {
	s.AutoArchive = &v
	return s
}

func (s *StartContractHandsignRequest) SetBusinessScene(v string) *StartContractHandsignRequest {
	s.BusinessScene = &v
	return s
}

func (s *StartContractHandsignRequest) SetContractRemind(v int64) *StartContractHandsignRequest {
	s.ContractRemind = &v
	return s
}

func (s *StartContractHandsignRequest) SetContractSignFlowConfig(v *ContractSignFlowConfig) *StartContractHandsignRequest {
	s.ContractSignFlowConfig = v
	return s
}

func (s *StartContractHandsignRequest) SetContractValidity(v int64) *StartContractHandsignRequest {
	s.ContractValidity = &v
	return s
}

func (s *StartContractHandsignRequest) SetInitiatorAccountId(v string) *StartContractHandsignRequest {
	s.InitiatorAccountId = &v
	return s
}

func (s *StartContractHandsignRequest) SetInitiatorAuthorizedAccountId(v string) *StartContractHandsignRequest {
	s.InitiatorAuthorizedAccountId = &v
	return s
}

func (s *StartContractHandsignRequest) SetRepaymentOrderInfo(v []*RepaymentOrderRequest) *StartContractHandsignRequest {
	s.RepaymentOrderInfo = v
	return s
}

func (s *StartContractHandsignRequest) SetSignPlatform(v string) *StartContractHandsignRequest {
	s.SignPlatform = &v
	return s
}

func (s *StartContractHandsignRequest) SetSignValidity(v string) *StartContractHandsignRequest {
	s.SignValidity = &v
	return s
}

func (s *StartContractHandsignRequest) SetSimpleFormFields(v string) *StartContractHandsignRequest {
	s.SimpleFormFields = &v
	return s
}

func (s *StartContractHandsignRequest) SetTemplate(v string) *StartContractHandsignRequest {
	s.Template = &v
	return s
}

func (s *StartContractHandsignRequest) SetUserAccount(v string) *StartContractHandsignRequest {
	s.UserAccount = &v
	return s
}

func (s *StartContractHandsignRequest) SetShortUrl(v bool) *StartContractHandsignRequest {
	s.ShortUrl = &v
	return s
}

type StartContractHandsignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 签署流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 手动签约唤起地址
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 唤起签约地址短网址
	ShortUrl *string `json:"short_url,omitempty" xml:"short_url,omitempty"`
}

func (s StartContractHandsignResponse) String() string {
	return tea.Prettify(s)
}

func (s StartContractHandsignResponse) GoString() string {
	return s.String()
}

func (s *StartContractHandsignResponse) SetReqMsgId(v string) *StartContractHandsignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartContractHandsignResponse) SetResultCode(v string) *StartContractHandsignResponse {
	s.ResultCode = &v
	return s
}

func (s *StartContractHandsignResponse) SetResultMsg(v string) *StartContractHandsignResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartContractHandsignResponse) SetCode(v int64) *StartContractHandsignResponse {
	s.Code = &v
	return s
}

func (s *StartContractHandsignResponse) SetFlowId(v string) *StartContractHandsignResponse {
	s.FlowId = &v
	return s
}

func (s *StartContractHandsignResponse) SetMessage(v string) *StartContractHandsignResponse {
	s.Message = &v
	return s
}

func (s *StartContractHandsignResponse) SetUrl(v string) *StartContractHandsignResponse {
	s.Url = &v
	return s
}

func (s *StartContractHandsignResponse) SetShortUrl(v string) *StartContractHandsignResponse {
	s.ShortUrl = &v
	return s
}

type QueryContractFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 流程id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
}

func (s QueryContractFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryContractFlowRequest) GoString() string {
	return s.String()
}

func (s *QueryContractFlowRequest) SetAuthToken(v string) *QueryContractFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryContractFlowRequest) SetProductInstanceId(v string) *QueryContractFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryContractFlowRequest) SetFlowId(v string) *QueryContractFlowRequest {
	s.FlowId = &v
	return s
}

type QueryContractFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否自动归档
	AutoArchive *bool `json:"auto_archive,omitempty" xml:"auto_archive,omitempty"`
	// 文件主题
	BusinessScene *string `json:"business_scene,omitempty" xml:"business_scene,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 流程配置信息
	ConfigInfo *ContractSignFlowConfig `json:"config_info,omitempty" xml:"config_info,omitempty"`
	// 文件到期前，提前多少小时提醒续签
	ContractRemind *int64 `json:"contract_remind,omitempty" xml:"contract_remind,omitempty"`
	// 文件有效截止日期
	ContractValidity *int64 `json:"contract_validity,omitempty" xml:"contract_validity,omitempty"`
	// 流程描述, 如果流程已拒签或已撤回, 并且存在拒签或撤回原因, 流程描述显示为原因, 否则默认为流程状态描述
	FlowDesc *string `json:"flow_desc,omitempty" xml:"flow_desc,omitempty"`
	// 流程结束时间
	FlowEndTime *string `json:"flow_end_time,omitempty" xml:"flow_end_time,omitempty"`
	// 流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 流程开始时间
	FlowStartTime *string `json:"flow_start_time,omitempty" xml:"flow_start_time,omitempty"`
	// 流程状态,0-草稿 1-签署中 2-完成 3-撤销 4-终止 5-过期 6-删除 7-拒签
	FlowStatus *int64 `json:"flow_status,omitempty" xml:"flow_status,omitempty"`
	// 发起人账户id
	InitiatorAccountId *string `json:"initiator_account_id,omitempty" xml:"initiator_account_id,omitempty"`
	// 发起方主体id
	InitiatorAuthorizedAccountId *string `json:"initiator_authorized_account_id,omitempty" xml:"initiator_authorized_account_id,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 签署有效截止日期
	SignValidity *string `json:"sign_validity,omitempty" xml:"sign_validity,omitempty"`
}

func (s QueryContractFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryContractFlowResponse) GoString() string {
	return s.String()
}

func (s *QueryContractFlowResponse) SetReqMsgId(v string) *QueryContractFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryContractFlowResponse) SetResultCode(v string) *QueryContractFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryContractFlowResponse) SetResultMsg(v string) *QueryContractFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryContractFlowResponse) SetAutoArchive(v bool) *QueryContractFlowResponse {
	s.AutoArchive = &v
	return s
}

func (s *QueryContractFlowResponse) SetBusinessScene(v string) *QueryContractFlowResponse {
	s.BusinessScene = &v
	return s
}

func (s *QueryContractFlowResponse) SetCode(v int64) *QueryContractFlowResponse {
	s.Code = &v
	return s
}

func (s *QueryContractFlowResponse) SetConfigInfo(v *ContractSignFlowConfig) *QueryContractFlowResponse {
	s.ConfigInfo = v
	return s
}

func (s *QueryContractFlowResponse) SetContractRemind(v int64) *QueryContractFlowResponse {
	s.ContractRemind = &v
	return s
}

func (s *QueryContractFlowResponse) SetContractValidity(v int64) *QueryContractFlowResponse {
	s.ContractValidity = &v
	return s
}

func (s *QueryContractFlowResponse) SetFlowDesc(v string) *QueryContractFlowResponse {
	s.FlowDesc = &v
	return s
}

func (s *QueryContractFlowResponse) SetFlowEndTime(v string) *QueryContractFlowResponse {
	s.FlowEndTime = &v
	return s
}

func (s *QueryContractFlowResponse) SetFlowId(v string) *QueryContractFlowResponse {
	s.FlowId = &v
	return s
}

func (s *QueryContractFlowResponse) SetFlowStartTime(v string) *QueryContractFlowResponse {
	s.FlowStartTime = &v
	return s
}

func (s *QueryContractFlowResponse) SetFlowStatus(v int64) *QueryContractFlowResponse {
	s.FlowStatus = &v
	return s
}

func (s *QueryContractFlowResponse) SetInitiatorAccountId(v string) *QueryContractFlowResponse {
	s.InitiatorAccountId = &v
	return s
}

func (s *QueryContractFlowResponse) SetInitiatorAuthorizedAccountId(v string) *QueryContractFlowResponse {
	s.InitiatorAuthorizedAccountId = &v
	return s
}

func (s *QueryContractFlowResponse) SetMessage(v string) *QueryContractFlowResponse {
	s.Message = &v
	return s
}

func (s *QueryContractFlowResponse) SetSignValidity(v string) *QueryContractFlowResponse {
	s.SignValidity = &v
	return s
}

type CreateContractAccountsealimageRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// 印章别名
	Alias *string `json:"alias,omitempty" xml:"alias,omitempty"`
	// 印章高度, 个人默认95px, 机构默认159px
	Height *int64 `json:"height,omitempty" xml:"height,omitempty"`
	// 印章宽度, 个人默认95px, 机构默认159px
	Width *int64 `json:"width,omitempty" xml:"width,omitempty"`
	// 印章数据类型，BASE64：base64格式
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 印章数据，base64格式字符串，不包含格式前缀
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
	// 是否对图片进行透明化处理，默认false。仅对图片整体做透明化处理，无法去除图片背景
	TransparentFlag *bool `json:"transparent_flag,omitempty" xml:"transparent_flag,omitempty"`
}

func (s CreateContractAccountsealimageRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateContractAccountsealimageRequest) GoString() string {
	return s.String()
}

func (s *CreateContractAccountsealimageRequest) SetAuthToken(v string) *CreateContractAccountsealimageRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateContractAccountsealimageRequest) SetProductInstanceId(v string) *CreateContractAccountsealimageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateContractAccountsealimageRequest) SetAccountId(v string) *CreateContractAccountsealimageRequest {
	s.AccountId = &v
	return s
}

func (s *CreateContractAccountsealimageRequest) SetAlias(v string) *CreateContractAccountsealimageRequest {
	s.Alias = &v
	return s
}

func (s *CreateContractAccountsealimageRequest) SetHeight(v int64) *CreateContractAccountsealimageRequest {
	s.Height = &v
	return s
}

func (s *CreateContractAccountsealimageRequest) SetWidth(v int64) *CreateContractAccountsealimageRequest {
	s.Width = &v
	return s
}

func (s *CreateContractAccountsealimageRequest) SetType(v string) *CreateContractAccountsealimageRequest {
	s.Type = &v
	return s
}

func (s *CreateContractAccountsealimageRequest) SetData(v string) *CreateContractAccountsealimageRequest {
	s.Data = &v
	return s
}

func (s *CreateContractAccountsealimageRequest) SetTransparentFlag(v bool) *CreateContractAccountsealimageRequest {
	s.TransparentFlag = &v
	return s
}

type CreateContractAccountsealimageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 印章fileKey
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty"`
	// 印章id
	SealId *string `json:"seal_id,omitempty" xml:"seal_id,omitempty"`
	// 印章下载地址, 有效时间1小时
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 印章高度
	Height *int64 `json:"height,omitempty" xml:"height,omitempty"`
	// 印章宽度
	Width *int64 `json:"width,omitempty" xml:"width,omitempty"`
}

func (s CreateContractAccountsealimageResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateContractAccountsealimageResponse) GoString() string {
	return s.String()
}

func (s *CreateContractAccountsealimageResponse) SetReqMsgId(v string) *CreateContractAccountsealimageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateContractAccountsealimageResponse) SetResultCode(v string) *CreateContractAccountsealimageResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateContractAccountsealimageResponse) SetResultMsg(v string) *CreateContractAccountsealimageResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateContractAccountsealimageResponse) SetCode(v int64) *CreateContractAccountsealimageResponse {
	s.Code = &v
	return s
}

func (s *CreateContractAccountsealimageResponse) SetMessage(v string) *CreateContractAccountsealimageResponse {
	s.Message = &v
	return s
}

func (s *CreateContractAccountsealimageResponse) SetFileKey(v string) *CreateContractAccountsealimageResponse {
	s.FileKey = &v
	return s
}

func (s *CreateContractAccountsealimageResponse) SetSealId(v string) *CreateContractAccountsealimageResponse {
	s.SealId = &v
	return s
}

func (s *CreateContractAccountsealimageResponse) SetUrl(v string) *CreateContractAccountsealimageResponse {
	s.Url = &v
	return s
}

func (s *CreateContractAccountsealimageResponse) SetHeight(v int64) *CreateContractAccountsealimageResponse {
	s.Height = &v
	return s
}

func (s *CreateContractAccountsealimageResponse) SetWidth(v int64) *CreateContractAccountsealimageResponse {
	s.Width = &v
	return s
}

type GetContractFileuploadurlRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 所属账号id，即个人账号id或机构账号id，如不传，则默认属于对接平台
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 先计算文件md5值，在对该md5值进行base64编码
	ContentMd5 *string `json:"content_md5,omitempty" xml:"content_md5,omitempty" require:"true"`
	// 目标文件的MIME类型
	ContentType *string `json:"content_type,omitempty" xml:"content_type,omitempty" require:"true"`
	// 是否转换成pdf文档，默认false，代表不做转换。转换是异步行为，如果指定要转换，需要调用查询文件信息接口查询状态，转换完成后才可使用。
	Convert2Pdf *string `json:"convert_2_pdf,omitempty" xml:"convert_2_pdf,omitempty" require:"true"`
	// 文件大小，单位byte
	FileSize *int64 `json:"file_size,omitempty" xml:"file_size,omitempty" require:"true"`
	// 文件名称（必须带上文件扩展名，不然会导致后续发起流程校验过不去 示例：合同.pdf ）
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
}

func (s GetContractFileuploadurlRequest) String() string {
	return tea.Prettify(s)
}

func (s GetContractFileuploadurlRequest) GoString() string {
	return s.String()
}

func (s *GetContractFileuploadurlRequest) SetAuthToken(v string) *GetContractFileuploadurlRequest {
	s.AuthToken = &v
	return s
}

func (s *GetContractFileuploadurlRequest) SetProductInstanceId(v string) *GetContractFileuploadurlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetContractFileuploadurlRequest) SetAccountId(v string) *GetContractFileuploadurlRequest {
	s.AccountId = &v
	return s
}

func (s *GetContractFileuploadurlRequest) SetContentMd5(v string) *GetContractFileuploadurlRequest {
	s.ContentMd5 = &v
	return s
}

func (s *GetContractFileuploadurlRequest) SetContentType(v string) *GetContractFileuploadurlRequest {
	s.ContentType = &v
	return s
}

func (s *GetContractFileuploadurlRequest) SetConvert2Pdf(v string) *GetContractFileuploadurlRequest {
	s.Convert2Pdf = &v
	return s
}

func (s *GetContractFileuploadurlRequest) SetFileSize(v int64) *GetContractFileuploadurlRequest {
	s.FileSize = &v
	return s
}

func (s *GetContractFileuploadurlRequest) SetFileName(v string) *GetContractFileuploadurlRequest {
	s.FileName = &v
	return s
}

type GetContractFileuploadurlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 文件Id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 文件直传地址, 可以重复使用，但是只能传一样的文件，有效期一小时
	UploadUrl *string `json:"upload_url,omitempty" xml:"upload_url,omitempty"`
}

func (s GetContractFileuploadurlResponse) String() string {
	return tea.Prettify(s)
}

func (s GetContractFileuploadurlResponse) GoString() string {
	return s.String()
}

func (s *GetContractFileuploadurlResponse) SetReqMsgId(v string) *GetContractFileuploadurlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetContractFileuploadurlResponse) SetResultCode(v string) *GetContractFileuploadurlResponse {
	s.ResultCode = &v
	return s
}

func (s *GetContractFileuploadurlResponse) SetResultMsg(v string) *GetContractFileuploadurlResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetContractFileuploadurlResponse) SetCode(v int64) *GetContractFileuploadurlResponse {
	s.Code = &v
	return s
}

func (s *GetContractFileuploadurlResponse) SetFileId(v string) *GetContractFileuploadurlResponse {
	s.FileId = &v
	return s
}

func (s *GetContractFileuploadurlResponse) SetMessage(v string) *GetContractFileuploadurlResponse {
	s.Message = &v
	return s
}

func (s *GetContractFileuploadurlResponse) SetUploadUrl(v string) *GetContractFileuploadurlResponse {
	s.UploadUrl = &v
	return s
}

type AddContractPlatformsignfieldsRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 流程id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	// 签署区列表数据
	Signfields *ContractPlatformSignFieldApplication `json:"signfields,omitempty" xml:"signfields,omitempty" require:"true"`
}

func (s AddContractPlatformsignfieldsRequest) String() string {
	return tea.Prettify(s)
}

func (s AddContractPlatformsignfieldsRequest) GoString() string {
	return s.String()
}

func (s *AddContractPlatformsignfieldsRequest) SetAuthToken(v string) *AddContractPlatformsignfieldsRequest {
	s.AuthToken = &v
	return s
}

func (s *AddContractPlatformsignfieldsRequest) SetProductInstanceId(v string) *AddContractPlatformsignfieldsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddContractPlatformsignfieldsRequest) SetFlowId(v string) *AddContractPlatformsignfieldsRequest {
	s.FlowId = &v
	return s
}

func (s *AddContractPlatformsignfieldsRequest) SetSignfields(v *ContractPlatformSignFieldApplication) *AddContractPlatformsignfieldsRequest {
	s.Signfields = v
	return s
}

type AddContractPlatformsignfieldsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 签署区列表数据
	Signfields []*ContractSignField `json:"signfields,omitempty" xml:"signfields,omitempty" type:"Repeated"`
}

func (s AddContractPlatformsignfieldsResponse) String() string {
	return tea.Prettify(s)
}

func (s AddContractPlatformsignfieldsResponse) GoString() string {
	return s.String()
}

func (s *AddContractPlatformsignfieldsResponse) SetReqMsgId(v string) *AddContractPlatformsignfieldsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddContractPlatformsignfieldsResponse) SetResultCode(v string) *AddContractPlatformsignfieldsResponse {
	s.ResultCode = &v
	return s
}

func (s *AddContractPlatformsignfieldsResponse) SetResultMsg(v string) *AddContractPlatformsignfieldsResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddContractPlatformsignfieldsResponse) SetCode(v int64) *AddContractPlatformsignfieldsResponse {
	s.Code = &v
	return s
}

func (s *AddContractPlatformsignfieldsResponse) SetMessage(v string) *AddContractPlatformsignfieldsResponse {
	s.Message = &v
	return s
}

func (s *AddContractPlatformsignfieldsResponse) SetSignfields(v []*ContractSignField) *AddContractPlatformsignfieldsResponse {
	s.Signfields = v
	return s
}

type GetContractFileRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s GetContractFileRequest) String() string {
	return tea.Prettify(s)
}

func (s GetContractFileRequest) GoString() string {
	return s.String()
}

func (s *GetContractFileRequest) SetAuthToken(v string) *GetContractFileRequest {
	s.AuthToken = &v
	return s
}

func (s *GetContractFileRequest) SetProductInstanceId(v string) *GetContractFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetContractFileRequest) SetFileId(v string) *GetContractFileRequest {
	s.FileId = &v
	return s
}

type GetContractFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 文件id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 文件名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 下载地址
	DownloadUrl *string `json:"download_url,omitempty" xml:"download_url,omitempty"`
	// 文件大小，单位byte
	Size *int64 `json:"size,omitempty" xml:"size,omitempty"`
	// 文件状态, 0:文件未上传；1:文件上传中 ；2：文件上传已完成,；3：文件上传失败 ；4：文件等待转pdf ；5：文件已转换pdf 。
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
	// pdf文件总页数,仅当文件类型为pdf时有值
	PdfTotalPages *int64 `json:"pdf_total_pages,omitempty" xml:"pdf_total_pages,omitempty"`
}

func (s GetContractFileResponse) String() string {
	return tea.Prettify(s)
}

func (s GetContractFileResponse) GoString() string {
	return s.String()
}

func (s *GetContractFileResponse) SetReqMsgId(v string) *GetContractFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetContractFileResponse) SetResultCode(v string) *GetContractFileResponse {
	s.ResultCode = &v
	return s
}

func (s *GetContractFileResponse) SetResultMsg(v string) *GetContractFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetContractFileResponse) SetCode(v int64) *GetContractFileResponse {
	s.Code = &v
	return s
}

func (s *GetContractFileResponse) SetMessage(v string) *GetContractFileResponse {
	s.Message = &v
	return s
}

func (s *GetContractFileResponse) SetFileId(v string) *GetContractFileResponse {
	s.FileId = &v
	return s
}

func (s *GetContractFileResponse) SetName(v string) *GetContractFileResponse {
	s.Name = &v
	return s
}

func (s *GetContractFileResponse) SetDownloadUrl(v string) *GetContractFileResponse {
	s.DownloadUrl = &v
	return s
}

func (s *GetContractFileResponse) SetSize(v int64) *GetContractFileResponse {
	s.Size = &v
	return s
}

func (s *GetContractFileResponse) SetStatus(v int64) *GetContractFileResponse {
	s.Status = &v
	return s
}

func (s *GetContractFileResponse) SetPdfTotalPages(v int64) *GetContractFileResponse {
	s.PdfTotalPages = &v
	return s
}

type QueryContractAccountsealsRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// 分页起始位置
	Offset *int64 `json:"offset,omitempty" xml:"offset,omitempty" require:"true"`
	// 单页数量
	Size *int64 `json:"size,omitempty" xml:"size,omitempty" require:"true"`
}

func (s QueryContractAccountsealsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryContractAccountsealsRequest) GoString() string {
	return s.String()
}

func (s *QueryContractAccountsealsRequest) SetAuthToken(v string) *QueryContractAccountsealsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryContractAccountsealsRequest) SetProductInstanceId(v string) *QueryContractAccountsealsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryContractAccountsealsRequest) SetAccountId(v string) *QueryContractAccountsealsRequest {
	s.AccountId = &v
	return s
}

func (s *QueryContractAccountsealsRequest) SetOffset(v int64) *QueryContractAccountsealsRequest {
	s.Offset = &v
	return s
}

func (s *QueryContractAccountsealsRequest) SetSize(v int64) *QueryContractAccountsealsRequest {
	s.Size = &v
	return s
}

type QueryContractAccountsealsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 查询总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 印章列表
	Seals []*ContractSeal `json:"seals,omitempty" xml:"seals,omitempty" type:"Repeated"`
}

func (s QueryContractAccountsealsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryContractAccountsealsResponse) GoString() string {
	return s.String()
}

func (s *QueryContractAccountsealsResponse) SetReqMsgId(v string) *QueryContractAccountsealsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryContractAccountsealsResponse) SetResultCode(v string) *QueryContractAccountsealsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryContractAccountsealsResponse) SetResultMsg(v string) *QueryContractAccountsealsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryContractAccountsealsResponse) SetCode(v int64) *QueryContractAccountsealsResponse {
	s.Code = &v
	return s
}

func (s *QueryContractAccountsealsResponse) SetMessage(v string) *QueryContractAccountsealsResponse {
	s.Message = &v
	return s
}

func (s *QueryContractAccountsealsResponse) SetTotal(v int64) *QueryContractAccountsealsResponse {
	s.Total = &v
	return s
}

func (s *QueryContractAccountsealsResponse) SetSeals(v []*ContractSeal) *QueryContractAccountsealsResponse {
	s.Seals = v
	return s
}

type QueryContractOrganizationsealsRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 机构id
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty" require:"true"`
	// 分页起始位置
	Offset *int64 `json:"offset,omitempty" xml:"offset,omitempty" require:"true"`
	// 单页数量
	Size *int64 `json:"size,omitempty" xml:"size,omitempty" require:"true"`
}

func (s QueryContractOrganizationsealsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryContractOrganizationsealsRequest) GoString() string {
	return s.String()
}

func (s *QueryContractOrganizationsealsRequest) SetAuthToken(v string) *QueryContractOrganizationsealsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryContractOrganizationsealsRequest) SetProductInstanceId(v string) *QueryContractOrganizationsealsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryContractOrganizationsealsRequest) SetOrgId(v string) *QueryContractOrganizationsealsRequest {
	s.OrgId = &v
	return s
}

func (s *QueryContractOrganizationsealsRequest) SetOffset(v int64) *QueryContractOrganizationsealsRequest {
	s.Offset = &v
	return s
}

func (s *QueryContractOrganizationsealsRequest) SetSize(v int64) *QueryContractOrganizationsealsRequest {
	s.Size = &v
	return s
}

type QueryContractOrganizationsealsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 查询总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 印章列表
	Seals []*ContractSeal `json:"seals,omitempty" xml:"seals,omitempty" type:"Repeated"`
}

func (s QueryContractOrganizationsealsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryContractOrganizationsealsResponse) GoString() string {
	return s.String()
}

func (s *QueryContractOrganizationsealsResponse) SetReqMsgId(v string) *QueryContractOrganizationsealsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryContractOrganizationsealsResponse) SetResultCode(v string) *QueryContractOrganizationsealsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryContractOrganizationsealsResponse) SetResultMsg(v string) *QueryContractOrganizationsealsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryContractOrganizationsealsResponse) SetCode(v int64) *QueryContractOrganizationsealsResponse {
	s.Code = &v
	return s
}

func (s *QueryContractOrganizationsealsResponse) SetMessage(v string) *QueryContractOrganizationsealsResponse {
	s.Message = &v
	return s
}

func (s *QueryContractOrganizationsealsResponse) SetTotal(v int64) *QueryContractOrganizationsealsResponse {
	s.Total = &v
	return s
}

func (s *QueryContractOrganizationsealsResponse) SetSeals(v []*ContractSeal) *QueryContractOrganizationsealsResponse {
	s.Seals = v
	return s
}

type QueryContractFlowsignerRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 流程id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
}

func (s QueryContractFlowsignerRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryContractFlowsignerRequest) GoString() string {
	return s.String()
}

func (s *QueryContractFlowsignerRequest) SetAuthToken(v string) *QueryContractFlowsignerRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryContractFlowsignerRequest) SetProductInstanceId(v string) *QueryContractFlowsignerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryContractFlowsignerRequest) SetFlowId(v string) *QueryContractFlowsignerRequest {
	s.FlowId = &v
	return s
}

type QueryContractFlowsignerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 签字人列表
	Signers []*ContractFlowSigner `json:"signers,omitempty" xml:"signers,omitempty" type:"Repeated"`
}

func (s QueryContractFlowsignerResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryContractFlowsignerResponse) GoString() string {
	return s.String()
}

func (s *QueryContractFlowsignerResponse) SetReqMsgId(v string) *QueryContractFlowsignerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryContractFlowsignerResponse) SetResultCode(v string) *QueryContractFlowsignerResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryContractFlowsignerResponse) SetResultMsg(v string) *QueryContractFlowsignerResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryContractFlowsignerResponse) SetCode(v int64) *QueryContractFlowsignerResponse {
	s.Code = &v
	return s
}

func (s *QueryContractFlowsignerResponse) SetMessage(v string) *QueryContractFlowsignerResponse {
	s.Message = &v
	return s
}

func (s *QueryContractFlowsignerResponse) SetSigners(v []*ContractFlowSigner) *QueryContractFlowsignerResponse {
	s.Signers = v
	return s
}

type QueryContractSignfieldsRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 流程id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	// 账号id，默认所有签署人
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 指定签署区id列表，逗号分割，默认所有签署区
	SignfieldIds *string `json:"signfield_ids,omitempty" xml:"signfield_ids,omitempty"`
}

func (s QueryContractSignfieldsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryContractSignfieldsRequest) GoString() string {
	return s.String()
}

func (s *QueryContractSignfieldsRequest) SetAuthToken(v string) *QueryContractSignfieldsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryContractSignfieldsRequest) SetProductInstanceId(v string) *QueryContractSignfieldsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryContractSignfieldsRequest) SetFlowId(v string) *QueryContractSignfieldsRequest {
	s.FlowId = &v
	return s
}

func (s *QueryContractSignfieldsRequest) SetAccountId(v string) *QueryContractSignfieldsRequest {
	s.AccountId = &v
	return s
}

func (s *QueryContractSignfieldsRequest) SetSignfieldIds(v string) *QueryContractSignfieldsRequest {
	s.SignfieldIds = &v
	return s
}

type QueryContractSignfieldsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 签署区列表数据
	Signfields []*ContractSignFieldDetail `json:"signfields,omitempty" xml:"signfields,omitempty" type:"Repeated"`
}

func (s QueryContractSignfieldsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryContractSignfieldsResponse) GoString() string {
	return s.String()
}

func (s *QueryContractSignfieldsResponse) SetReqMsgId(v string) *QueryContractSignfieldsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryContractSignfieldsResponse) SetResultCode(v string) *QueryContractSignfieldsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryContractSignfieldsResponse) SetResultMsg(v string) *QueryContractSignfieldsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryContractSignfieldsResponse) SetCode(v int64) *QueryContractSignfieldsResponse {
	s.Code = &v
	return s
}

func (s *QueryContractSignfieldsResponse) SetMessage(v string) *QueryContractSignfieldsResponse {
	s.Message = &v
	return s
}

func (s *QueryContractSignfieldsResponse) SetSignfields(v []*ContractSignFieldDetail) *QueryContractSignfieldsResponse {
	s.Signfields = v
	return s
}

type QueryContractAccountRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 个人账号id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
}

func (s QueryContractAccountRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryContractAccountRequest) GoString() string {
	return s.String()
}

func (s *QueryContractAccountRequest) SetAuthToken(v string) *QueryContractAccountRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryContractAccountRequest) SetProductInstanceId(v string) *QueryContractAccountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryContractAccountRequest) SetAccountId(v string) *QueryContractAccountRequest {
	s.AccountId = &v
	return s
}

type QueryContractAccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 个人账号id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 证件类型，详见个人证件类型说明
	IdType *string `json:"id_type,omitempty" xml:"id_type,omitempty"`
	// 证件号
	IdNumber *string `json:"id_number,omitempty" xml:"id_number,omitempty"`
	// 联系方式，手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 联系方式，邮箱地址
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 第三方平台的用户id
	ThirdPartyUserId *string `json:"third_party_user_id,omitempty" xml:"third_party_user_id,omitempty"`
}

func (s QueryContractAccountResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryContractAccountResponse) GoString() string {
	return s.String()
}

func (s *QueryContractAccountResponse) SetReqMsgId(v string) *QueryContractAccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryContractAccountResponse) SetResultCode(v string) *QueryContractAccountResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryContractAccountResponse) SetResultMsg(v string) *QueryContractAccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryContractAccountResponse) SetCode(v int64) *QueryContractAccountResponse {
	s.Code = &v
	return s
}

func (s *QueryContractAccountResponse) SetMessage(v string) *QueryContractAccountResponse {
	s.Message = &v
	return s
}

func (s *QueryContractAccountResponse) SetAccountId(v string) *QueryContractAccountResponse {
	s.AccountId = &v
	return s
}

func (s *QueryContractAccountResponse) SetName(v string) *QueryContractAccountResponse {
	s.Name = &v
	return s
}

func (s *QueryContractAccountResponse) SetIdType(v string) *QueryContractAccountResponse {
	s.IdType = &v
	return s
}

func (s *QueryContractAccountResponse) SetIdNumber(v string) *QueryContractAccountResponse {
	s.IdNumber = &v
	return s
}

func (s *QueryContractAccountResponse) SetMobile(v string) *QueryContractAccountResponse {
	s.Mobile = &v
	return s
}

func (s *QueryContractAccountResponse) SetEmail(v string) *QueryContractAccountResponse {
	s.Email = &v
	return s
}

func (s *QueryContractAccountResponse) SetThirdPartyUserId(v string) *QueryContractAccountResponse {
	s.ThirdPartyUserId = &v
	return s
}

type QueryContractOrganizationRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 机构账号id
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty" require:"true"`
}

func (s QueryContractOrganizationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryContractOrganizationRequest) GoString() string {
	return s.String()
}

func (s *QueryContractOrganizationRequest) SetAuthToken(v string) *QueryContractOrganizationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryContractOrganizationRequest) SetProductInstanceId(v string) *QueryContractOrganizationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryContractOrganizationRequest) SetOrgId(v string) *QueryContractOrganizationRequest {
	s.OrgId = &v
	return s
}

type QueryContractOrganizationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 机构账号Id
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty"`
	// 机构名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 证件类型，详见机构证件类型说明
	IdType *string `json:"id_type,omitempty" xml:"id_type,omitempty"`
	// 证件号
	IdNumber *string `json:"id_number,omitempty" xml:"id_number,omitempty"`
	// 企业法人证件号
	OrgLegalIdNumber *string `json:"org_legal_id_number,omitempty" xml:"org_legal_id_number,omitempty"`
	// 企业法人名称
	OrgLegalName *string `json:"org_legal_name,omitempty" xml:"org_legal_name,omitempty"`
	// 第三方平台的机构id
	ThirdPartyUserId *string `json:"third_party_user_id,omitempty" xml:"third_party_user_id,omitempty"`
}

func (s QueryContractOrganizationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryContractOrganizationResponse) GoString() string {
	return s.String()
}

func (s *QueryContractOrganizationResponse) SetReqMsgId(v string) *QueryContractOrganizationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryContractOrganizationResponse) SetResultCode(v string) *QueryContractOrganizationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryContractOrganizationResponse) SetResultMsg(v string) *QueryContractOrganizationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryContractOrganizationResponse) SetCode(v int64) *QueryContractOrganizationResponse {
	s.Code = &v
	return s
}

func (s *QueryContractOrganizationResponse) SetMessage(v string) *QueryContractOrganizationResponse {
	s.Message = &v
	return s
}

func (s *QueryContractOrganizationResponse) SetOrgId(v string) *QueryContractOrganizationResponse {
	s.OrgId = &v
	return s
}

func (s *QueryContractOrganizationResponse) SetName(v string) *QueryContractOrganizationResponse {
	s.Name = &v
	return s
}

func (s *QueryContractOrganizationResponse) SetIdType(v string) *QueryContractOrganizationResponse {
	s.IdType = &v
	return s
}

func (s *QueryContractOrganizationResponse) SetIdNumber(v string) *QueryContractOrganizationResponse {
	s.IdNumber = &v
	return s
}

func (s *QueryContractOrganizationResponse) SetOrgLegalIdNumber(v string) *QueryContractOrganizationResponse {
	s.OrgLegalIdNumber = &v
	return s
}

func (s *QueryContractOrganizationResponse) SetOrgLegalName(v string) *QueryContractOrganizationResponse {
	s.OrgLegalName = &v
	return s
}

func (s *QueryContractOrganizationResponse) SetThirdPartyUserId(v string) *QueryContractOrganizationResponse {
	s.ThirdPartyUserId = &v
	return s
}

type QueryContractTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 模板id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
}

func (s QueryContractTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryContractTemplateRequest) GoString() string {
	return s.String()
}

func (s *QueryContractTemplateRequest) SetAuthToken(v string) *QueryContractTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryContractTemplateRequest) SetProductInstanceId(v string) *QueryContractTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryContractTemplateRequest) SetTemplateId(v string) *QueryContractTemplateRequest {
	s.TemplateId = &v
	return s
}

type QueryContractTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 创建时间
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 模板文件下载地址
	DownloadUrl *string `json:"download_url,omitempty" xml:"download_url,omitempty"`
	// 模板文件大小
	FileSize *int64 `json:"file_size,omitempty" xml:"file_size,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 文件模板中的输入项组件列表
	StructComponents []*ContractTemplateStructComponent `json:"struct_components,omitempty" xml:"struct_components,omitempty" type:"Repeated"`
	// 模板id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty"`
	// 模板名称
	TemplateName *string `json:"template_name,omitempty" xml:"template_name,omitempty"`
	// 更新时间
	UpdateTime *int64 `json:"update_time,omitempty" xml:"update_time,omitempty"`
}

func (s QueryContractTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryContractTemplateResponse) GoString() string {
	return s.String()
}

func (s *QueryContractTemplateResponse) SetReqMsgId(v string) *QueryContractTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryContractTemplateResponse) SetResultCode(v string) *QueryContractTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryContractTemplateResponse) SetResultMsg(v string) *QueryContractTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryContractTemplateResponse) SetCode(v int64) *QueryContractTemplateResponse {
	s.Code = &v
	return s
}

func (s *QueryContractTemplateResponse) SetCreateTime(v int64) *QueryContractTemplateResponse {
	s.CreateTime = &v
	return s
}

func (s *QueryContractTemplateResponse) SetDownloadUrl(v string) *QueryContractTemplateResponse {
	s.DownloadUrl = &v
	return s
}

func (s *QueryContractTemplateResponse) SetFileSize(v int64) *QueryContractTemplateResponse {
	s.FileSize = &v
	return s
}

func (s *QueryContractTemplateResponse) SetMessage(v string) *QueryContractTemplateResponse {
	s.Message = &v
	return s
}

func (s *QueryContractTemplateResponse) SetStructComponents(v []*ContractTemplateStructComponent) *QueryContractTemplateResponse {
	s.StructComponents = v
	return s
}

func (s *QueryContractTemplateResponse) SetTemplateId(v string) *QueryContractTemplateResponse {
	s.TemplateId = &v
	return s
}

func (s *QueryContractTemplateResponse) SetTemplateName(v string) *QueryContractTemplateResponse {
	s.TemplateName = &v
	return s
}

func (s *QueryContractTemplateResponse) SetUpdateTime(v int64) *QueryContractTemplateResponse {
	s.UpdateTime = &v
	return s
}

type CreateContractSignflowRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 是否自动归档，默认false 如设置为true，则在流程开启后，当所有签署人签署完毕，系统自动将流程归档，状态变为“已完成”状态，在流程状态为“已完成”前，可随时添加签署人；如设置为false，则在调用流程开启后，需主动调用签署流程归档接口，将流程状态变更为“已完成”，归档前可随时添加签署人；已完成的流程才可下载签署后的文件
	AutoArchive *bool `json:"auto_archive,omitempty" xml:"auto_archive,omitempty"`
	// 是否强制代扣
	AutoDeductionForce *bool `json:"auto_deduction_force,omitempty" xml:"auto_deduction_force,omitempty"`
	// 文件主题
	BusinessScene *string `json:"business_scene,omitempty" xml:"business_scene,omitempty" require:"true"`
	// 任务配置信息
	ContractSignFlowConfig *ContractSignFlowConfig `json:"contract_sign_flow_config,omitempty" xml:"contract_sign_flow_config,omitempty"`
	// 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
	InitiatorAccountId *string `json:"initiator_account_id,omitempty" xml:"initiator_account_id,omitempty"`
	// 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
	InitiatorAuthorizedAccountId *string `json:"initiator_authorized_account_id,omitempty" xml:"initiator_authorized_account_id,omitempty"`
	// 代扣规则详情
	RepaymentOrderInfo []*RepaymentOrderRequest `json:"repayment_order_info,omitempty" xml:"repayment_order_info,omitempty" type:"Repeated"`
	// 签署平台，ALIPAY（支付宝小程序）或H5
	SignPlatform *string `json:"sign_platform,omitempty" xml:"sign_platform,omitempty"`
	// 签署有效截止日期，毫秒，默认3天失效
	SignValidity *int64 `json:"sign_validity,omitempty" xml:"sign_validity,omitempty"`
	//  付款方ID（个人）
	PayerTuid *string `json:"payer_tuid,omitempty" xml:"payer_tuid,omitempty"`
	// 收款方ID(机构)
	PayeeTuid *string `json:"payee_tuid,omitempty" xml:"payee_tuid,omitempty"`
}

func (s CreateContractSignflowRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateContractSignflowRequest) GoString() string {
	return s.String()
}

func (s *CreateContractSignflowRequest) SetAuthToken(v string) *CreateContractSignflowRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateContractSignflowRequest) SetProductInstanceId(v string) *CreateContractSignflowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateContractSignflowRequest) SetAutoArchive(v bool) *CreateContractSignflowRequest {
	s.AutoArchive = &v
	return s
}

func (s *CreateContractSignflowRequest) SetAutoDeductionForce(v bool) *CreateContractSignflowRequest {
	s.AutoDeductionForce = &v
	return s
}

func (s *CreateContractSignflowRequest) SetBusinessScene(v string) *CreateContractSignflowRequest {
	s.BusinessScene = &v
	return s
}

func (s *CreateContractSignflowRequest) SetContractSignFlowConfig(v *ContractSignFlowConfig) *CreateContractSignflowRequest {
	s.ContractSignFlowConfig = v
	return s
}

func (s *CreateContractSignflowRequest) SetInitiatorAccountId(v string) *CreateContractSignflowRequest {
	s.InitiatorAccountId = &v
	return s
}

func (s *CreateContractSignflowRequest) SetInitiatorAuthorizedAccountId(v string) *CreateContractSignflowRequest {
	s.InitiatorAuthorizedAccountId = &v
	return s
}

func (s *CreateContractSignflowRequest) SetRepaymentOrderInfo(v []*RepaymentOrderRequest) *CreateContractSignflowRequest {
	s.RepaymentOrderInfo = v
	return s
}

func (s *CreateContractSignflowRequest) SetSignPlatform(v string) *CreateContractSignflowRequest {
	s.SignPlatform = &v
	return s
}

func (s *CreateContractSignflowRequest) SetSignValidity(v int64) *CreateContractSignflowRequest {
	s.SignValidity = &v
	return s
}

func (s *CreateContractSignflowRequest) SetPayerTuid(v string) *CreateContractSignflowRequest {
	s.PayerTuid = &v
	return s
}

func (s *CreateContractSignflowRequest) SetPayeeTuid(v string) *CreateContractSignflowRequest {
	s.PayeeTuid = &v
	return s
}

type CreateContractSignflowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 签约流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s CreateContractSignflowResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateContractSignflowResponse) GoString() string {
	return s.String()
}

func (s *CreateContractSignflowResponse) SetReqMsgId(v string) *CreateContractSignflowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateContractSignflowResponse) SetResultCode(v string) *CreateContractSignflowResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateContractSignflowResponse) SetResultMsg(v string) *CreateContractSignflowResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateContractSignflowResponse) SetCode(v int64) *CreateContractSignflowResponse {
	s.Code = &v
	return s
}

func (s *CreateContractSignflowResponse) SetFlowId(v string) *CreateContractSignflowResponse {
	s.FlowId = &v
	return s
}

func (s *CreateContractSignflowResponse) SetMessage(v string) *CreateContractSignflowResponse {
	s.Message = &v
	return s
}

type CreateContractRegisterzftRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 地址。商户详细经营地址或人员所在地点
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true"`
	// 代理商户的账户
	AgentAccountId *string `json:"agent_account_id,omitempty" xml:"agent_account_id,omitempty"`
	// 商户别名
	AliasName *string `json:"alias_name,omitempty" xml:"alias_name,omitempty" require:"true"`
	// 商户支付宝账户
	AlipayLogonId *string `json:"alipay_logon_id,omitempty" xml:"alipay_logon_id,omitempty" require:"true"`
	// 申请时间
	ApplyTime *string `json:"apply_time,omitempty" xml:"apply_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 二级商户支付宝账户，用于协议确认。目前商业场景（除医疗、中小学教育等）下必填。本字段要求与商户名称name同名，且是实名认证支付宝账户
	BindingAlipayLogonId *string `json:"binding_alipay_logon_id,omitempty" xml:"binding_alipay_logon_id,omitempty" require:"true"`
	// 结算卡id
	CardAliasNo *string `json:"card_alias_no,omitempty" xml:"card_alias_no,omitempty"`
	// 营业执照图片url，本业务接口中，如果是特殊行业必填。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	CertImage *string `json:"cert_image,omitempty" xml:"cert_image,omitempty" require:"true"`
	// 商户社会信用码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 商户证件类型，取值范围：201：营业执照；2011:营业执照(统一社会信用代码)；204：民办非企业登记证书；206：社会团体法人登记证书；218：事业单位法人证书；219：党政机关批准设立文件/行政执法主体资格证；100：个人商户身份证
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 城市编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。
	// （参考资料：
	// http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
	CityCode *string `json:"city_code,omitempty" xml:"city_code,omitempty" require:"true"`
	// 电子邮箱
	ContactEmail *string `json:"contact_email,omitempty" xml:"contact_email,omitempty" require:"true"`
	// 商户联系人信息
	ContactMobile *string `json:"contact_mobile,omitempty" xml:"contact_mobile,omitempty" require:"true"`
	// 联系人名字
	ContactName *string `json:"contact_name,omitempty" xml:"contact_name,omitempty" require:"true"`
	// 商户联系人电话信息
	ContactPhone *string `json:"contact_phone,omitempty" xml:"contact_phone,omitempty" require:"true"`
	// 商户联系人业务标识枚举，表示商户联系人的职责。异议处理接口人:02;商户关键联系人:06;数据反馈接口人:11;服务联动接口人:08
	ContactTag *string `json:"contact_tag,omitempty" xml:"contact_tag,omitempty" require:"true"`
	// 联系人类型，取值范围：LEGAL_PERSON：法人；CONTROLLER：实际控制人；AGENT：代理人；OTHER：其他
	ContactType *string `json:"contact_type,omitempty" xml:"contact_type,omitempty" require:"true"`
	// 区县编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。
	// （参考资料：
	// http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
	DistrictCode *string `json:"district_code,omitempty" xml:"district_code,omitempty" require:"true"`
	// 返回申请单相关参数。当前返回内容有cardAliasNo，smid
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty" require:"true"`
	// 商户角色id。审核通过后生成。间连商户或平台商二级商户业务中，本字段表示smid
	IpRoleId *string `json:"ip_role_id,omitempty" xml:"ip_role_id,omitempty" require:"true"`
	// 法人身份证反面url，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。本业务接口中，如果是特殊行业必填
	LegalCertBackImage *string `json:"legal_cert_back_image,omitempty" xml:"legal_cert_back_image,omitempty" require:"true"`
	// 法人身份证正面url，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。本业务接口中，如果是特殊行业必填
	LegalCertFrontImage *string `json:"legal_cert_front_image,omitempty" xml:"legal_cert_front_image,omitempty" require:"true"`
	// 法人身份证号
	LegalCertNo *string `json:"legal_cert_no,omitempty" xml:"legal_cert_no,omitempty" require:"true"`
	// 法人名称
	LegalName *string `json:"legal_name,omitempty" xml:"legal_name,omitempty" require:"true"`
	// 商户类别码mcc，参见附件描述中的“类目code” https://gw.alipayobjects.com/os/basement_prod/82cb70f7-abbd-417a-91ba-73c1849f07ea.xlsx 如果要求资质一栏不为空，表明是特殊行业，会有人工审核。注：文档更新可能有滞后性，以实际为准
	Mcc *string `json:"mcc,omitempty" xml:"mcc,omitempty" require:"true"`
	// 蚂蚁金服（杭*****术有限公司
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty" require:"true"`
	// 商家类型：01：企业；02：事业单位；03：民办非企业组织；04：社会团体；05：党政及国家机关；06：个人商户；07：个体工商户
	MerchantType *string `json:"merchant_type,omitempty" xml:"merchant_type,omitempty" require:"true"`
	// 商户名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 申请单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 外部业务号。比如某种业务标准外部订单号,比如交易外部订单号，代表服务商端自己订单号。用于做并发控制，防止一笔外部订单发起两次进件。非必要场景禁止传入本字段，如要使用务必理清场景及字段生成规则，与蚂蚁金服对接人咨询。
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty" require:"true"`
	// 门头照，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。如果使用当面付服务则必填
	OutDoorImage *string `json:"out_door_image,omitempty" xml:"out_door_image,omitempty" require:"true"`
	// 商户在智能合同平台唯一id
	PlatformTuid *string `json:"platform_tuid,omitempty" xml:"platform_tuid,omitempty" require:"true"`
	// 省份编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。
	// （参考资料：
	// http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
	ProvinceCode *string `json:"province_code,omitempty" xml:"province_code,omitempty" require:"true"`
	// 商户使用服务，可选值有：当面付、app支付、wap支付、电脑支付
	Service *string `json:"service,omitempty" xml:"service,omitempty" require:"true"`
	// 客服电话
	ServicePhone *string `json:"service_phone,omitempty" xml:"service_phone,omitempty" require:"true"`
	// 二级商户与服务商的签约时间
	SignTimeWithIsv *string `json:"sign_time_with_isv,omitempty" xml:"sign_time_with_isv,omitempty" require:"true"`
	// 站点名称
	SiteName *string `json:"site_name,omitempty" xml:"site_name,omitempty" require:"true"`
	// 网站：01
	// APP : 02
	// 服务窗:03
	// 公众号:04
	// 其他:05
	// 支付宝小程序:06
	SiteType *string `json:"site_type,omitempty" xml:"site_type,omitempty" require:"true"`
	// 站点地址
	SiteUrl *string `json:"site_url,omitempty" xml:"site_url,omitempty" require:"true"`
	// 二级商户id
	Smid *string `json:"smid,omitempty" xml:"smid,omitempty" require:"true"`
	// 申请单状态。99:已完结;-1:失败;031:已提交审核
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 0表示不更新，1表示强制更新
	Update *int64 `json:"update,omitempty" xml:"update,omitempty" require:"true"`
}

func (s CreateContractRegisterzftRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateContractRegisterzftRequest) GoString() string {
	return s.String()
}

func (s *CreateContractRegisterzftRequest) SetAuthToken(v string) *CreateContractRegisterzftRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetProductInstanceId(v string) *CreateContractRegisterzftRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetAddress(v string) *CreateContractRegisterzftRequest {
	s.Address = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetAgentAccountId(v string) *CreateContractRegisterzftRequest {
	s.AgentAccountId = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetAliasName(v string) *CreateContractRegisterzftRequest {
	s.AliasName = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetAlipayLogonId(v string) *CreateContractRegisterzftRequest {
	s.AlipayLogonId = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetApplyTime(v string) *CreateContractRegisterzftRequest {
	s.ApplyTime = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetBindingAlipayLogonId(v string) *CreateContractRegisterzftRequest {
	s.BindingAlipayLogonId = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetCardAliasNo(v string) *CreateContractRegisterzftRequest {
	s.CardAliasNo = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetCertImage(v string) *CreateContractRegisterzftRequest {
	s.CertImage = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetCertNo(v string) *CreateContractRegisterzftRequest {
	s.CertNo = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetCertType(v string) *CreateContractRegisterzftRequest {
	s.CertType = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetCityCode(v string) *CreateContractRegisterzftRequest {
	s.CityCode = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetContactEmail(v string) *CreateContractRegisterzftRequest {
	s.ContactEmail = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetContactMobile(v string) *CreateContractRegisterzftRequest {
	s.ContactMobile = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetContactName(v string) *CreateContractRegisterzftRequest {
	s.ContactName = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetContactPhone(v string) *CreateContractRegisterzftRequest {
	s.ContactPhone = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetContactTag(v string) *CreateContractRegisterzftRequest {
	s.ContactTag = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetContactType(v string) *CreateContractRegisterzftRequest {
	s.ContactType = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetDistrictCode(v string) *CreateContractRegisterzftRequest {
	s.DistrictCode = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetExtInfo(v string) *CreateContractRegisterzftRequest {
	s.ExtInfo = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetIpRoleId(v string) *CreateContractRegisterzftRequest {
	s.IpRoleId = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetLegalCertBackImage(v string) *CreateContractRegisterzftRequest {
	s.LegalCertBackImage = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetLegalCertFrontImage(v string) *CreateContractRegisterzftRequest {
	s.LegalCertFrontImage = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetLegalCertNo(v string) *CreateContractRegisterzftRequest {
	s.LegalCertNo = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetLegalName(v string) *CreateContractRegisterzftRequest {
	s.LegalName = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetMcc(v string) *CreateContractRegisterzftRequest {
	s.Mcc = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetMerchantName(v string) *CreateContractRegisterzftRequest {
	s.MerchantName = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetMerchantType(v string) *CreateContractRegisterzftRequest {
	s.MerchantType = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetName(v string) *CreateContractRegisterzftRequest {
	s.Name = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetOrderId(v string) *CreateContractRegisterzftRequest {
	s.OrderId = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetOutBizNo(v string) *CreateContractRegisterzftRequest {
	s.OutBizNo = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetOutDoorImage(v string) *CreateContractRegisterzftRequest {
	s.OutDoorImage = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetPlatformTuid(v string) *CreateContractRegisterzftRequest {
	s.PlatformTuid = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetProvinceCode(v string) *CreateContractRegisterzftRequest {
	s.ProvinceCode = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetService(v string) *CreateContractRegisterzftRequest {
	s.Service = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetServicePhone(v string) *CreateContractRegisterzftRequest {
	s.ServicePhone = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetSignTimeWithIsv(v string) *CreateContractRegisterzftRequest {
	s.SignTimeWithIsv = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetSiteName(v string) *CreateContractRegisterzftRequest {
	s.SiteName = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetSiteType(v string) *CreateContractRegisterzftRequest {
	s.SiteType = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetSiteUrl(v string) *CreateContractRegisterzftRequest {
	s.SiteUrl = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetSmid(v string) *CreateContractRegisterzftRequest {
	s.Smid = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetStatus(v string) *CreateContractRegisterzftRequest {
	s.Status = &v
	return s
}

func (s *CreateContractRegisterzftRequest) SetUpdate(v int64) *CreateContractRegisterzftRequest {
	s.Update = &v
	return s
}

type CreateContractRegisterzftResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
}

func (s CreateContractRegisterzftResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateContractRegisterzftResponse) GoString() string {
	return s.String()
}

func (s *CreateContractRegisterzftResponse) SetReqMsgId(v string) *CreateContractRegisterzftResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateContractRegisterzftResponse) SetResultCode(v string) *CreateContractRegisterzftResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateContractRegisterzftResponse) SetResultMsg(v string) *CreateContractRegisterzftResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateContractRegisterzftResponse) SetCode(v string) *CreateContractRegisterzftResponse {
	s.Code = &v
	return s
}

type CreateContractPlatformtemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 是否包含代扣规则，如果设置为true，则在创建手动签署流程时，必须传入代扣规则。默认为false
	AutoDeduction *bool `json:"auto_deduction,omitempty" xml:"auto_deduction,omitempty"`
	// Base64编码的模板文件的MD5值
	ContentMd5 *string `json:"content_md5,omitempty" xml:"content_md5,omitempty" require:"true"`
	// 目标文件的MIME类型
	ContentType *string `json:"content_type,omitempty" xml:"content_type,omitempty" require:"true"`
	// 是否需要转成pdf，如果模板文件为.doc/.docx 传true，为pdf传false
	Convert2Pdf *bool `json:"convert2_pdf,omitempty" xml:"convert2_pdf,omitempty" require:"true"`
	// 文件名称，必须带扩展名如:.pdf,.doc,.docx
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 平台方的签署信息列表
	SignFields []*ContractPlatformSignField `json:"sign_fields,omitempty" xml:"sign_fields,omitempty" require:"true" type:"Repeated"`
	// 用户需要签章的页面列表（默认为最后一页）
	UserSignPages []*int64 `json:"user_sign_pages,omitempty" xml:"user_sign_pages,omitempty" type:"Repeated"`
	// 是否强制用户选择代扣
	AutoDeductionForce *bool `json:"auto_deduction_force,omitempty" xml:"auto_deduction_force,omitempty"`
}

func (s CreateContractPlatformtemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateContractPlatformtemplateRequest) GoString() string {
	return s.String()
}

func (s *CreateContractPlatformtemplateRequest) SetAuthToken(v string) *CreateContractPlatformtemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateContractPlatformtemplateRequest) SetProductInstanceId(v string) *CreateContractPlatformtemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateContractPlatformtemplateRequest) SetAutoDeduction(v bool) *CreateContractPlatformtemplateRequest {
	s.AutoDeduction = &v
	return s
}

func (s *CreateContractPlatformtemplateRequest) SetContentMd5(v string) *CreateContractPlatformtemplateRequest {
	s.ContentMd5 = &v
	return s
}

func (s *CreateContractPlatformtemplateRequest) SetContentType(v string) *CreateContractPlatformtemplateRequest {
	s.ContentType = &v
	return s
}

func (s *CreateContractPlatformtemplateRequest) SetConvert2Pdf(v bool) *CreateContractPlatformtemplateRequest {
	s.Convert2Pdf = &v
	return s
}

func (s *CreateContractPlatformtemplateRequest) SetFileName(v string) *CreateContractPlatformtemplateRequest {
	s.FileName = &v
	return s
}

func (s *CreateContractPlatformtemplateRequest) SetSignFields(v []*ContractPlatformSignField) *CreateContractPlatformtemplateRequest {
	s.SignFields = v
	return s
}

func (s *CreateContractPlatformtemplateRequest) SetUserSignPages(v []*int64) *CreateContractPlatformtemplateRequest {
	s.UserSignPages = v
	return s
}

func (s *CreateContractPlatformtemplateRequest) SetAutoDeductionForce(v bool) *CreateContractPlatformtemplateRequest {
	s.AutoDeductionForce = &v
	return s
}

type CreateContractPlatformtemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 模板ID
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty"`
	// 文件直传地址，需要用此上传地址使用put方式上传文件，只有文件上传后模板才可用
	UploadUrl *string `json:"upload_url,omitempty" xml:"upload_url,omitempty"`
}

func (s CreateContractPlatformtemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateContractPlatformtemplateResponse) GoString() string {
	return s.String()
}

func (s *CreateContractPlatformtemplateResponse) SetReqMsgId(v string) *CreateContractPlatformtemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateContractPlatformtemplateResponse) SetResultCode(v string) *CreateContractPlatformtemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateContractPlatformtemplateResponse) SetResultMsg(v string) *CreateContractPlatformtemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateContractPlatformtemplateResponse) SetCode(v int64) *CreateContractPlatformtemplateResponse {
	s.Code = &v
	return s
}

func (s *CreateContractPlatformtemplateResponse) SetMessage(v string) *CreateContractPlatformtemplateResponse {
	s.Message = &v
	return s
}

func (s *CreateContractPlatformtemplateResponse) SetTemplateId(v string) *CreateContractPlatformtemplateResponse {
	s.TemplateId = &v
	return s
}

func (s *CreateContractPlatformtemplateResponse) SetUploadUrl(v string) *CreateContractPlatformtemplateResponse {
	s.UploadUrl = &v
	return s
}

type QueryContractMerchantzftRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 代理商户账户
	AgentAccountId *string `json:"agent_account_id,omitempty" xml:"agent_account_id,omitempty"`
}

func (s QueryContractMerchantzftRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryContractMerchantzftRequest) GoString() string {
	return s.String()
}

func (s *QueryContractMerchantzftRequest) SetAuthToken(v string) *QueryContractMerchantzftRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryContractMerchantzftRequest) SetProductInstanceId(v string) *QueryContractMerchantzftRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryContractMerchantzftRequest) SetAgentAccountId(v string) *QueryContractMerchantzftRequest {
	s.AgentAccountId = &v
	return s
}

type QueryContractMerchantzftResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 0表示成功，其他为失败
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 商户入驻查询信息
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 错误信息描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
}

func (s QueryContractMerchantzftResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryContractMerchantzftResponse) GoString() string {
	return s.String()
}

func (s *QueryContractMerchantzftResponse) SetReqMsgId(v string) *QueryContractMerchantzftResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryContractMerchantzftResponse) SetResultCode(v string) *QueryContractMerchantzftResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryContractMerchantzftResponse) SetResultMsg(v string) *QueryContractMerchantzftResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryContractMerchantzftResponse) SetCode(v int64) *QueryContractMerchantzftResponse {
	s.Code = &v
	return s
}

func (s *QueryContractMerchantzftResponse) SetData(v string) *QueryContractMerchantzftResponse {
	s.Data = &v
	return s
}

func (s *QueryContractMerchantzftResponse) SetErrMessage(v string) *QueryContractMerchantzftResponse {
	s.ErrMessage = &v
	return s
}

type ListContractOuttradeidRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合同id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	// 分页第几页
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
	// 每页的大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s ListContractOuttradeidRequest) String() string {
	return tea.Prettify(s)
}

func (s ListContractOuttradeidRequest) GoString() string {
	return s.String()
}

func (s *ListContractOuttradeidRequest) SetAuthToken(v string) *ListContractOuttradeidRequest {
	s.AuthToken = &v
	return s
}

func (s *ListContractOuttradeidRequest) SetProductInstanceId(v string) *ListContractOuttradeidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListContractOuttradeidRequest) SetFlowId(v string) *ListContractOuttradeidRequest {
	s.FlowId = &v
	return s
}

func (s *ListContractOuttradeidRequest) SetPageIndex(v int64) *ListContractOuttradeidRequest {
	s.PageIndex = &v
	return s
}

func (s *ListContractOuttradeidRequest) SetPageSize(v int64) *ListContractOuttradeidRequest {
	s.PageSize = &v
	return s
}

type ListContractOuttradeidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 总符合条件的交易个数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 所有符合条件交易相关的id
	OutTradeNo []*string `json:"out_trade_no,omitempty" xml:"out_trade_no,omitempty" type:"Repeated"`
}

func (s ListContractOuttradeidResponse) String() string {
	return tea.Prettify(s)
}

func (s ListContractOuttradeidResponse) GoString() string {
	return s.String()
}

func (s *ListContractOuttradeidResponse) SetReqMsgId(v string) *ListContractOuttradeidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListContractOuttradeidResponse) SetResultCode(v string) *ListContractOuttradeidResponse {
	s.ResultCode = &v
	return s
}

func (s *ListContractOuttradeidResponse) SetResultMsg(v string) *ListContractOuttradeidResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListContractOuttradeidResponse) SetCode(v int64) *ListContractOuttradeidResponse {
	s.Code = &v
	return s
}

func (s *ListContractOuttradeidResponse) SetErrMessage(v string) *ListContractOuttradeidResponse {
	s.ErrMessage = &v
	return s
}

func (s *ListContractOuttradeidResponse) SetTotal(v int64) *ListContractOuttradeidResponse {
	s.Total = &v
	return s
}

func (s *ListContractOuttradeidResponse) SetOutTradeNo(v []*string) *ListContractOuttradeidResponse {
	s.OutTradeNo = v
	return s
}

type QueryContractTradedetailRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合同id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	// out_trade_no
	OutTradeNo *string `json:"out_trade_no,omitempty" xml:"out_trade_no,omitempty" require:"true"`
}

func (s QueryContractTradedetailRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryContractTradedetailRequest) GoString() string {
	return s.String()
}

func (s *QueryContractTradedetailRequest) SetAuthToken(v string) *QueryContractTradedetailRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryContractTradedetailRequest) SetProductInstanceId(v string) *QueryContractTradedetailRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryContractTradedetailRequest) SetFlowId(v string) *QueryContractTradedetailRequest {
	s.FlowId = &v
	return s
}

func (s *QueryContractTradedetailRequest) SetOutTradeNo(v string) *QueryContractTradedetailRequest {
	s.OutTradeNo = &v
	return s
}

type QueryContractTradedetailResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 订单详情
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 错误信息描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
}

func (s QueryContractTradedetailResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryContractTradedetailResponse) GoString() string {
	return s.String()
}

func (s *QueryContractTradedetailResponse) SetReqMsgId(v string) *QueryContractTradedetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryContractTradedetailResponse) SetResultCode(v string) *QueryContractTradedetailResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryContractTradedetailResponse) SetResultMsg(v string) *QueryContractTradedetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryContractTradedetailResponse) SetCode(v int64) *QueryContractTradedetailResponse {
	s.Code = &v
	return s
}

func (s *QueryContractTradedetailResponse) SetData(v string) *QueryContractTradedetailResponse {
	s.Data = &v
	return s
}

func (s *QueryContractTradedetailResponse) SetErrMessage(v string) *QueryContractTradedetailResponse {
	s.ErrMessage = &v
	return s
}

type CreateContractMerchantrefundRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合同id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	// 退款请求对应的码
	OutRequestNo *string `json:"out_request_no,omitempty" xml:"out_request_no,omitempty" require:"true"`
	// 订单id
	OutTradeNo *string `json:"out_trade_no,omitempty" xml:"out_trade_no,omitempty" require:"true"`
	// 退款金额
	RefundAmount *int64 `json:"refund_amount,omitempty" xml:"refund_amount,omitempty" require:"true"`
}

func (s CreateContractMerchantrefundRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateContractMerchantrefundRequest) GoString() string {
	return s.String()
}

func (s *CreateContractMerchantrefundRequest) SetAuthToken(v string) *CreateContractMerchantrefundRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateContractMerchantrefundRequest) SetProductInstanceId(v string) *CreateContractMerchantrefundRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateContractMerchantrefundRequest) SetFlowId(v string) *CreateContractMerchantrefundRequest {
	s.FlowId = &v
	return s
}

func (s *CreateContractMerchantrefundRequest) SetOutRequestNo(v string) *CreateContractMerchantrefundRequest {
	s.OutRequestNo = &v
	return s
}

func (s *CreateContractMerchantrefundRequest) SetOutTradeNo(v string) *CreateContractMerchantrefundRequest {
	s.OutTradeNo = &v
	return s
}

func (s *CreateContractMerchantrefundRequest) SetRefundAmount(v int64) *CreateContractMerchantrefundRequest {
	s.RefundAmount = &v
	return s
}

type CreateContractMerchantrefundResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息描述
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 本次请求对应的操作单号
	OutRequestNo *string `json:"out_request_no,omitempty" xml:"out_request_no,omitempty"`
	// 订单id
	OutTradeNo *string `json:"out_trade_no,omitempty" xml:"out_trade_no,omitempty"`
}

func (s CreateContractMerchantrefundResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateContractMerchantrefundResponse) GoString() string {
	return s.String()
}

func (s *CreateContractMerchantrefundResponse) SetReqMsgId(v string) *CreateContractMerchantrefundResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateContractMerchantrefundResponse) SetResultCode(v string) *CreateContractMerchantrefundResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateContractMerchantrefundResponse) SetResultMsg(v string) *CreateContractMerchantrefundResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateContractMerchantrefundResponse) SetCode(v int64) *CreateContractMerchantrefundResponse {
	s.Code = &v
	return s
}

func (s *CreateContractMerchantrefundResponse) SetMessage(v string) *CreateContractMerchantrefundResponse {
	s.Message = &v
	return s
}

func (s *CreateContractMerchantrefundResponse) SetOutRequestNo(v string) *CreateContractMerchantrefundResponse {
	s.OutRequestNo = &v
	return s
}

func (s *CreateContractMerchantrefundResponse) SetOutTradeNo(v string) *CreateContractMerchantrefundResponse {
	s.OutTradeNo = &v
	return s
}

type CreateContractAdminaccountRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s CreateContractAdminaccountRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateContractAdminaccountRequest) GoString() string {
	return s.String()
}

func (s *CreateContractAdminaccountRequest) SetAuthToken(v string) *CreateContractAdminaccountRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateContractAdminaccountRequest) SetProductInstanceId(v string) *CreateContractAdminaccountRequest {
	s.ProductInstanceId = &v
	return s
}

type CreateContractAdminaccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
}

func (s CreateContractAdminaccountResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateContractAdminaccountResponse) GoString() string {
	return s.String()
}

func (s *CreateContractAdminaccountResponse) SetReqMsgId(v string) *CreateContractAdminaccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateContractAdminaccountResponse) SetResultCode(v string) *CreateContractAdminaccountResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateContractAdminaccountResponse) SetResultMsg(v string) *CreateContractAdminaccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateContractAdminaccountResponse) SetCode(v int64) *CreateContractAdminaccountResponse {
	s.Code = &v
	return s
}

func (s *CreateContractAdminaccountResponse) SetErrMessage(v string) *CreateContractAdminaccountResponse {
	s.ErrMessage = &v
	return s
}

type ListContractTradeidsRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合同id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	// 1
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
	// 页面大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s ListContractTradeidsRequest) String() string {
	return tea.Prettify(s)
}

func (s ListContractTradeidsRequest) GoString() string {
	return s.String()
}

func (s *ListContractTradeidsRequest) SetAuthToken(v string) *ListContractTradeidsRequest {
	s.AuthToken = &v
	return s
}

func (s *ListContractTradeidsRequest) SetProductInstanceId(v string) *ListContractTradeidsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListContractTradeidsRequest) SetFlowId(v string) *ListContractTradeidsRequest {
	s.FlowId = &v
	return s
}

func (s *ListContractTradeidsRequest) SetPageIndex(v int64) *ListContractTradeidsRequest {
	s.PageIndex = &v
	return s
}

func (s *ListContractTradeidsRequest) SetPageSize(v int64) *ListContractTradeidsRequest {
	s.PageSize = &v
	return s
}

type ListContractTradeidsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 所有item的个数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 所有满足条件的订单
	OutTradeNo []*string `json:"out_trade_no,omitempty" xml:"out_trade_no,omitempty" type:"Repeated"`
}

func (s ListContractTradeidsResponse) String() string {
	return tea.Prettify(s)
}

func (s ListContractTradeidsResponse) GoString() string {
	return s.String()
}

func (s *ListContractTradeidsResponse) SetReqMsgId(v string) *ListContractTradeidsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListContractTradeidsResponse) SetResultCode(v string) *ListContractTradeidsResponse {
	s.ResultCode = &v
	return s
}

func (s *ListContractTradeidsResponse) SetResultMsg(v string) *ListContractTradeidsResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListContractTradeidsResponse) SetCode(v int64) *ListContractTradeidsResponse {
	s.Code = &v
	return s
}

func (s *ListContractTradeidsResponse) SetErrMessage(v string) *ListContractTradeidsResponse {
	s.ErrMessage = &v
	return s
}

func (s *ListContractTradeidsResponse) SetTotal(v int64) *ListContractTradeidsResponse {
	s.Total = &v
	return s
}

func (s *ListContractTradeidsResponse) SetOutTradeNo(v []*string) *ListContractTradeidsResponse {
	s.OutTradeNo = v
	return s
}

type CreateContractCommontriggerRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 代扣规则详情
	RepaymentOrderInfo []*RepaymentOrderRequest `json:"repayment_order_info,omitempty" xml:"repayment_order_info,omitempty" require:"true" type:"Repeated"`
	// 合同id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	// 用户在智能合同平台的身份
	UserTuid *string `json:"user_tuid,omitempty" xml:"user_tuid,omitempty" require:"true"`
}

func (s CreateContractCommontriggerRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateContractCommontriggerRequest) GoString() string {
	return s.String()
}

func (s *CreateContractCommontriggerRequest) SetAuthToken(v string) *CreateContractCommontriggerRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateContractCommontriggerRequest) SetProductInstanceId(v string) *CreateContractCommontriggerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateContractCommontriggerRequest) SetRepaymentOrderInfo(v []*RepaymentOrderRequest) *CreateContractCommontriggerRequest {
	s.RepaymentOrderInfo = v
	return s
}

func (s *CreateContractCommontriggerRequest) SetFlowId(v string) *CreateContractCommontriggerRequest {
	s.FlowId = &v
	return s
}

func (s *CreateContractCommontriggerRequest) SetUserTuid(v string) *CreateContractCommontriggerRequest {
	s.UserTuid = &v
	return s
}

type CreateContractCommontriggerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 合同id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 商户在智能合同平台id
	PlatformTuid *string `json:"platform_tuid,omitempty" xml:"platform_tuid,omitempty"`
	// 用户在智能合同平台的id
	UserTuid *string `json:"user_tuid,omitempty" xml:"user_tuid,omitempty"`
}

func (s CreateContractCommontriggerResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateContractCommontriggerResponse) GoString() string {
	return s.String()
}

func (s *CreateContractCommontriggerResponse) SetReqMsgId(v string) *CreateContractCommontriggerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateContractCommontriggerResponse) SetResultCode(v string) *CreateContractCommontriggerResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateContractCommontriggerResponse) SetResultMsg(v string) *CreateContractCommontriggerResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateContractCommontriggerResponse) SetCode(v int64) *CreateContractCommontriggerResponse {
	s.Code = &v
	return s
}

func (s *CreateContractCommontriggerResponse) SetErrMessage(v string) *CreateContractCommontriggerResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateContractCommontriggerResponse) SetFlowId(v string) *CreateContractCommontriggerResponse {
	s.FlowId = &v
	return s
}

func (s *CreateContractCommontriggerResponse) SetPlatformTuid(v string) *CreateContractCommontriggerResponse {
	s.PlatformTuid = &v
	return s
}

func (s *CreateContractCommontriggerResponse) SetUserTuid(v string) *CreateContractCommontriggerResponse {
	s.UserTuid = &v
	return s
}

type CreateContractMerchantindirectzftRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 入驻材料
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s CreateContractMerchantindirectzftRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateContractMerchantindirectzftRequest) GoString() string {
	return s.String()
}

func (s *CreateContractMerchantindirectzftRequest) SetAuthToken(v string) *CreateContractMerchantindirectzftRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateContractMerchantindirectzftRequest) SetProductInstanceId(v string) *CreateContractMerchantindirectzftRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateContractMerchantindirectzftRequest) SetBizContent(v string) *CreateContractMerchantindirectzftRequest {
	s.BizContent = &v
	return s
}

type CreateContractMerchantindirectzftResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 传入参数内容
	Body *string `json:"body,omitempty" xml:"body,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息描述
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 支付宝返回的二级错误信息
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 支付宝返回的二级错误信息描述
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
}

func (s CreateContractMerchantindirectzftResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateContractMerchantindirectzftResponse) GoString() string {
	return s.String()
}

func (s *CreateContractMerchantindirectzftResponse) SetReqMsgId(v string) *CreateContractMerchantindirectzftResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateContractMerchantindirectzftResponse) SetResultCode(v string) *CreateContractMerchantindirectzftResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateContractMerchantindirectzftResponse) SetResultMsg(v string) *CreateContractMerchantindirectzftResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateContractMerchantindirectzftResponse) SetBody(v string) *CreateContractMerchantindirectzftResponse {
	s.Body = &v
	return s
}

func (s *CreateContractMerchantindirectzftResponse) SetCode(v int64) *CreateContractMerchantindirectzftResponse {
	s.Code = &v
	return s
}

func (s *CreateContractMerchantindirectzftResponse) SetMessage(v string) *CreateContractMerchantindirectzftResponse {
	s.Message = &v
	return s
}

func (s *CreateContractMerchantindirectzftResponse) SetOrderId(v string) *CreateContractMerchantindirectzftResponse {
	s.OrderId = &v
	return s
}

func (s *CreateContractMerchantindirectzftResponse) SetSubCode(v string) *CreateContractMerchantindirectzftResponse {
	s.SubCode = &v
	return s
}

func (s *CreateContractMerchantindirectzftResponse) SetSubMsg(v string) *CreateContractMerchantindirectzftResponse {
	s.SubMsg = &v
	return s
}

type QueryContractMerchantindirectzftRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户入驻查询订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s QueryContractMerchantindirectzftRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryContractMerchantindirectzftRequest) GoString() string {
	return s.String()
}

func (s *QueryContractMerchantindirectzftRequest) SetAuthToken(v string) *QueryContractMerchantindirectzftRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryContractMerchantindirectzftRequest) SetProductInstanceId(v string) *QueryContractMerchantindirectzftRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryContractMerchantindirectzftRequest) SetOrderId(v string) *QueryContractMerchantindirectzftRequest {
	s.OrderId = &v
	return s
}

type QueryContractMerchantindirectzftResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误状态码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息描述
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 额外信息，包含smid
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	// 支付宝的ipRoleId
	IpRoleId []*string `json:"ip_role_id,omitempty" xml:"ip_role_id,omitempty" type:"Repeated"`
	// 申请时间
	ApplyId *string `json:"apply_id,omitempty" xml:"apply_id,omitempty"`
	// 商户名称
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty"`
	// 直付通商户进件的状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 支付宝返回的错误状态码
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 支付宝返回的错误信息描述
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
}

func (s QueryContractMerchantindirectzftResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryContractMerchantindirectzftResponse) GoString() string {
	return s.String()
}

func (s *QueryContractMerchantindirectzftResponse) SetReqMsgId(v string) *QueryContractMerchantindirectzftResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryContractMerchantindirectzftResponse) SetResultCode(v string) *QueryContractMerchantindirectzftResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryContractMerchantindirectzftResponse) SetResultMsg(v string) *QueryContractMerchantindirectzftResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryContractMerchantindirectzftResponse) SetCode(v int64) *QueryContractMerchantindirectzftResponse {
	s.Code = &v
	return s
}

func (s *QueryContractMerchantindirectzftResponse) SetMessage(v string) *QueryContractMerchantindirectzftResponse {
	s.Message = &v
	return s
}

func (s *QueryContractMerchantindirectzftResponse) SetExtInfo(v string) *QueryContractMerchantindirectzftResponse {
	s.ExtInfo = &v
	return s
}

func (s *QueryContractMerchantindirectzftResponse) SetIpRoleId(v []*string) *QueryContractMerchantindirectzftResponse {
	s.IpRoleId = v
	return s
}

func (s *QueryContractMerchantindirectzftResponse) SetApplyId(v string) *QueryContractMerchantindirectzftResponse {
	s.ApplyId = &v
	return s
}

func (s *QueryContractMerchantindirectzftResponse) SetMerchantName(v string) *QueryContractMerchantindirectzftResponse {
	s.MerchantName = &v
	return s
}

func (s *QueryContractMerchantindirectzftResponse) SetStatus(v string) *QueryContractMerchantindirectzftResponse {
	s.Status = &v
	return s
}

func (s *QueryContractMerchantindirectzftResponse) SetSubCode(v string) *QueryContractMerchantindirectzftResponse {
	s.SubCode = &v
	return s
}

func (s *QueryContractMerchantindirectzftResponse) SetSubMsg(v string) *QueryContractMerchantindirectzftResponse {
	s.SubMsg = &v
	return s
}

type QueryPayresultfileurlRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 对账日期
	BillDate *string `json:"bill_date,omitempty" xml:"bill_date,omitempty" require:"true"`
	// 交易类型
	BillType *string `json:"bill_type,omitempty" xml:"bill_type,omitempty" require:"true"`
}

func (s QueryPayresultfileurlRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryPayresultfileurlRequest) GoString() string {
	return s.String()
}

func (s *QueryPayresultfileurlRequest) SetAuthToken(v string) *QueryPayresultfileurlRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryPayresultfileurlRequest) SetProductInstanceId(v string) *QueryPayresultfileurlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryPayresultfileurlRequest) SetBillDate(v string) *QueryPayresultfileurlRequest {
	s.BillDate = &v
	return s
}

func (s *QueryPayresultfileurlRequest) SetBillType(v string) *QueryPayresultfileurlRequest {
	s.BillType = &v
	return s
}

type QueryPayresultfileurlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 对账文件的下载地址
	PayUrl *string `json:"pay_url,omitempty" xml:"pay_url,omitempty"`
}

func (s QueryPayresultfileurlResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryPayresultfileurlResponse) GoString() string {
	return s.String()
}

func (s *QueryPayresultfileurlResponse) SetReqMsgId(v string) *QueryPayresultfileurlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryPayresultfileurlResponse) SetResultCode(v string) *QueryPayresultfileurlResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryPayresultfileurlResponse) SetResultMsg(v string) *QueryPayresultfileurlResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryPayresultfileurlResponse) SetPayUrl(v string) *QueryPayresultfileurlResponse {
	s.PayUrl = &v
	return s
}

type CreateContractMerchantimageRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 图片内容，base64
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 图片名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
}

func (s CreateContractMerchantimageRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateContractMerchantimageRequest) GoString() string {
	return s.String()
}

func (s *CreateContractMerchantimageRequest) SetAuthToken(v string) *CreateContractMerchantimageRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateContractMerchantimageRequest) SetProductInstanceId(v string) *CreateContractMerchantimageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateContractMerchantimageRequest) SetContent(v string) *CreateContractMerchantimageRequest {
	s.Content = &v
	return s
}

func (s *CreateContractMerchantimageRequest) SetFileName(v string) *CreateContractMerchantimageRequest {
	s.FileName = &v
	return s
}

type CreateContractMerchantimageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 图片在oss上的id
	ImageId *string `json:"image_id,omitempty" xml:"image_id,omitempty"`
}

func (s CreateContractMerchantimageResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateContractMerchantimageResponse) GoString() string {
	return s.String()
}

func (s *CreateContractMerchantimageResponse) SetReqMsgId(v string) *CreateContractMerchantimageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateContractMerchantimageResponse) SetResultCode(v string) *CreateContractMerchantimageResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateContractMerchantimageResponse) SetResultMsg(v string) *CreateContractMerchantimageResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateContractMerchantimageResponse) SetImageId(v string) *CreateContractMerchantimageResponse {
	s.ImageId = &v
	return s
}

type CancelContractPaytradeRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 智能合同id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
}

func (s CancelContractPaytradeRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelContractPaytradeRequest) GoString() string {
	return s.String()
}

func (s *CancelContractPaytradeRequest) SetAuthToken(v string) *CancelContractPaytradeRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelContractPaytradeRequest) SetProductInstanceId(v string) *CancelContractPaytradeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelContractPaytradeRequest) SetFlowId(v string) *CancelContractPaytradeRequest {
	s.FlowId = &v
	return s
}

type CancelContractPaytradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 取消的代扣条目
	CanceledOutTradeNo []*string `json:"canceled_out_trade_no,omitempty" xml:"canceled_out_trade_no,omitempty" type:"Repeated"`
}

func (s CancelContractPaytradeResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelContractPaytradeResponse) GoString() string {
	return s.String()
}

func (s *CancelContractPaytradeResponse) SetReqMsgId(v string) *CancelContractPaytradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelContractPaytradeResponse) SetResultCode(v string) *CancelContractPaytradeResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelContractPaytradeResponse) SetResultMsg(v string) *CancelContractPaytradeResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelContractPaytradeResponse) SetCode(v int64) *CancelContractPaytradeResponse {
	s.Code = &v
	return s
}

func (s *CancelContractPaytradeResponse) SetErrMessage(v string) *CancelContractPaytradeResponse {
	s.ErrMessage = &v
	return s
}

func (s *CancelContractPaytradeResponse) SetCanceledOutTradeNo(v []*string) *CancelContractPaytradeResponse {
	s.CanceledOutTradeNo = v
	return s
}

type CreateContractHandsignflowRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 是否自动归档，默认false。如设置为true，当所有签署人签署完毕，系统自动将流程归档，状态变为“已完成”状态，在流程状态为“已完成”前，可随时添加签署人；如设置为false，则在调用签署流程开启后，需主动调用签署流程归档接口，将流程状态变更为“已完成”，归档前可随时添加签署人；已完成的流程才可下载签署后的文件。
	AutoArchive *bool `json:"auto_archive,omitempty" xml:"auto_archive,omitempty"`
	// 文件主题
	BusinessScene *string `json:"business_scene,omitempty" xml:"business_scene,omitempty" require:"true"`
	// 任务配置信息
	ConfigInfo *ContractSignFlowConfig `json:"config_info,omitempty" xml:"config_info,omitempty"`
	// 文件到期前，提前多久回调提醒续签，单位为小时，时间区间：1小时——15天（360小时），默认不提醒
	ContractRemind *int64 `json:"contract_remind,omitempty" xml:"contract_remind,omitempty"`
	// 文件有效截止日期,毫秒，默认不失效
	ContractValidity *int64 `json:"contract_validity,omitempty" xml:"contract_validity,omitempty"`
	// 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
	InitiatorAccountId *string `json:"initiator_account_id,omitempty" xml:"initiator_account_id,omitempty"`
	// 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
	InitiatorAuthorizedAccountId *string `json:"initiator_authorized_account_id,omitempty" xml:"initiator_authorized_account_id,omitempty"`
	// 签署有效截止日期,毫秒，默认不失效
	SignValidity *int64 `json:"sign_validity,omitempty" xml:"sign_validity,omitempty"`
}

func (s CreateContractHandsignflowRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateContractHandsignflowRequest) GoString() string {
	return s.String()
}

func (s *CreateContractHandsignflowRequest) SetAuthToken(v string) *CreateContractHandsignflowRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateContractHandsignflowRequest) SetProductInstanceId(v string) *CreateContractHandsignflowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateContractHandsignflowRequest) SetAutoArchive(v bool) *CreateContractHandsignflowRequest {
	s.AutoArchive = &v
	return s
}

func (s *CreateContractHandsignflowRequest) SetBusinessScene(v string) *CreateContractHandsignflowRequest {
	s.BusinessScene = &v
	return s
}

func (s *CreateContractHandsignflowRequest) SetConfigInfo(v *ContractSignFlowConfig) *CreateContractHandsignflowRequest {
	s.ConfigInfo = v
	return s
}

func (s *CreateContractHandsignflowRequest) SetContractRemind(v int64) *CreateContractHandsignflowRequest {
	s.ContractRemind = &v
	return s
}

func (s *CreateContractHandsignflowRequest) SetContractValidity(v int64) *CreateContractHandsignflowRequest {
	s.ContractValidity = &v
	return s
}

func (s *CreateContractHandsignflowRequest) SetInitiatorAccountId(v string) *CreateContractHandsignflowRequest {
	s.InitiatorAccountId = &v
	return s
}

func (s *CreateContractHandsignflowRequest) SetInitiatorAuthorizedAccountId(v string) *CreateContractHandsignflowRequest {
	s.InitiatorAuthorizedAccountId = &v
	return s
}

func (s *CreateContractHandsignflowRequest) SetSignValidity(v int64) *CreateContractHandsignflowRequest {
	s.SignValidity = &v
	return s
}

type CreateContractHandsignflowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s CreateContractHandsignflowResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateContractHandsignflowResponse) GoString() string {
	return s.String()
}

func (s *CreateContractHandsignflowResponse) SetReqMsgId(v string) *CreateContractHandsignflowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateContractHandsignflowResponse) SetResultCode(v string) *CreateContractHandsignflowResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateContractHandsignflowResponse) SetResultMsg(v string) *CreateContractHandsignflowResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateContractHandsignflowResponse) SetCode(v int64) *CreateContractHandsignflowResponse {
	s.Code = &v
	return s
}

func (s *CreateContractHandsignflowResponse) SetFlowId(v string) *CreateContractHandsignflowResponse {
	s.FlowId = &v
	return s
}

func (s *CreateContractHandsignflowResponse) SetMessage(v string) *CreateContractHandsignflowResponse {
	s.Message = &v
	return s
}

type CreateContractHandsignfieldRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 流程id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	// 签署区列表数据
	SignFields []*ContractHandSignFieldApplication `json:"sign_fields,omitempty" xml:"sign_fields,omitempty" require:"true" type:"Repeated"`
}

func (s CreateContractHandsignfieldRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateContractHandsignfieldRequest) GoString() string {
	return s.String()
}

func (s *CreateContractHandsignfieldRequest) SetAuthToken(v string) *CreateContractHandsignfieldRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateContractHandsignfieldRequest) SetProductInstanceId(v string) *CreateContractHandsignfieldRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateContractHandsignfieldRequest) SetFlowId(v string) *CreateContractHandsignfieldRequest {
	s.FlowId = &v
	return s
}

func (s *CreateContractHandsignfieldRequest) SetSignFields(v []*ContractHandSignFieldApplication) *CreateContractHandsignfieldRequest {
	s.SignFields = v
	return s
}

type CreateContractHandsignfieldResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 签署区列表数据
	Signfields []*ContractSignField `json:"signfields,omitempty" xml:"signfields,omitempty" type:"Repeated"`
}

func (s CreateContractHandsignfieldResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateContractHandsignfieldResponse) GoString() string {
	return s.String()
}

func (s *CreateContractHandsignfieldResponse) SetReqMsgId(v string) *CreateContractHandsignfieldResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateContractHandsignfieldResponse) SetResultCode(v string) *CreateContractHandsignfieldResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateContractHandsignfieldResponse) SetResultMsg(v string) *CreateContractHandsignfieldResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateContractHandsignfieldResponse) SetCode(v int64) *CreateContractHandsignfieldResponse {
	s.Code = &v
	return s
}

func (s *CreateContractHandsignfieldResponse) SetMessage(v string) *CreateContractHandsignfieldResponse {
	s.Message = &v
	return s
}

func (s *CreateContractHandsignfieldResponse) SetSignfields(v []*ContractSignField) *CreateContractHandsignfieldResponse {
	s.Signfields = v
	return s
}

type GetContractSignurlRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署人账号id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// 流程id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	// 默认为空，返回的任务链接仅包含签署人本人需要签署的任务； 传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务； 传入指定机构id，则返回的任务链接包含签署人“本人+指定代签机构”的签署任务
	OrganizeId *string `json:"organize_id,omitempty" xml:"organize_id,omitempty"`
	// 是否需要同时返回短链接，默认为false
	ShortUrl *bool `json:"short_url,omitempty" xml:"short_url,omitempty"`
}

func (s GetContractSignurlRequest) String() string {
	return tea.Prettify(s)
}

func (s GetContractSignurlRequest) GoString() string {
	return s.String()
}

func (s *GetContractSignurlRequest) SetAuthToken(v string) *GetContractSignurlRequest {
	s.AuthToken = &v
	return s
}

func (s *GetContractSignurlRequest) SetProductInstanceId(v string) *GetContractSignurlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetContractSignurlRequest) SetAccountId(v string) *GetContractSignurlRequest {
	s.AccountId = &v
	return s
}

func (s *GetContractSignurlRequest) SetFlowId(v string) *GetContractSignurlRequest {
	s.FlowId = &v
	return s
}

func (s *GetContractSignurlRequest) SetOrganizeId(v string) *GetContractSignurlRequest {
	s.OrganizeId = &v
	return s
}

func (s *GetContractSignurlRequest) SetShortUrl(v bool) *GetContractSignurlRequest {
	s.ShortUrl = &v
	return s
}

type GetContractSignurlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 长链地址
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 短链地址
	ShortUrl *string `json:"short_url,omitempty" xml:"short_url,omitempty"`
}

func (s GetContractSignurlResponse) String() string {
	return tea.Prettify(s)
}

func (s GetContractSignurlResponse) GoString() string {
	return s.String()
}

func (s *GetContractSignurlResponse) SetReqMsgId(v string) *GetContractSignurlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetContractSignurlResponse) SetResultCode(v string) *GetContractSignurlResponse {
	s.ResultCode = &v
	return s
}

func (s *GetContractSignurlResponse) SetResultMsg(v string) *GetContractSignurlResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetContractSignurlResponse) SetCode(v int64) *GetContractSignurlResponse {
	s.Code = &v
	return s
}

func (s *GetContractSignurlResponse) SetMessage(v string) *GetContractSignurlResponse {
	s.Message = &v
	return s
}

func (s *GetContractSignurlResponse) SetUrl(v string) *GetContractSignurlResponse {
	s.Url = &v
	return s
}

func (s *GetContractSignurlResponse) SetShortUrl(v string) *GetContractSignurlResponse {
	s.ShortUrl = &v
	return s
}

type CreateWithholdAgreementRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授信总金额，单位元
	CreditAmount *string `json:"credit_amount,omitempty" xml:"credit_amount,omitempty" require:"true"`
	// 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
	ExternalAgreementNo *string `json:"external_agreement_no,omitempty" xml:"external_agreement_no,omitempty" require:"true"`
	// 收款方账号类型，可取值：ALIPAY_USER_ID（支付宝uid);商户id，2088123412341234
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 商户名称
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty" require:"true"`
	// 对服务产品的描述
	MerchantServiceDescription *string `json:"merchant_service_description,omitempty" xml:"merchant_service_description,omitempty"`
	// 商户的服务名称，滴滴出行免密支付
	MerchantServiceName *string `json:"merchant_service_name,omitempty" xml:"merchant_service_name,omitempty" require:"true"`
	// 姓名和身份证号拼接sha256的hash
	NameCertHash *string `json:"name_cert_hash,omitempty" xml:"name_cert_hash,omitempty" require:"true"`
	// 还款计划的链接
	RepaymentUrl *string `json:"repayment_url,omitempty" xml:"repayment_url,omitempty" require:"true"`
	// 签约成功后回调的地址
	ReturnUrl *string `json:"return_url,omitempty" xml:"return_url,omitempty"`
	// 第三方用户id
	ThirdPartyId *string `json:"third_party_id,omitempty" xml:"third_party_id,omitempty" require:"true"`
}

func (s CreateWithholdAgreementRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateWithholdAgreementRequest) GoString() string {
	return s.String()
}

func (s *CreateWithholdAgreementRequest) SetAuthToken(v string) *CreateWithholdAgreementRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateWithholdAgreementRequest) SetProductInstanceId(v string) *CreateWithholdAgreementRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateWithholdAgreementRequest) SetCreditAmount(v string) *CreateWithholdAgreementRequest {
	s.CreditAmount = &v
	return s
}

func (s *CreateWithholdAgreementRequest) SetExternalAgreementNo(v string) *CreateWithholdAgreementRequest {
	s.ExternalAgreementNo = &v
	return s
}

func (s *CreateWithholdAgreementRequest) SetMerchantId(v string) *CreateWithholdAgreementRequest {
	s.MerchantId = &v
	return s
}

func (s *CreateWithholdAgreementRequest) SetMerchantName(v string) *CreateWithholdAgreementRequest {
	s.MerchantName = &v
	return s
}

func (s *CreateWithholdAgreementRequest) SetMerchantServiceDescription(v string) *CreateWithholdAgreementRequest {
	s.MerchantServiceDescription = &v
	return s
}

func (s *CreateWithholdAgreementRequest) SetMerchantServiceName(v string) *CreateWithholdAgreementRequest {
	s.MerchantServiceName = &v
	return s
}

func (s *CreateWithholdAgreementRequest) SetNameCertHash(v string) *CreateWithholdAgreementRequest {
	s.NameCertHash = &v
	return s
}

func (s *CreateWithholdAgreementRequest) SetRepaymentUrl(v string) *CreateWithholdAgreementRequest {
	s.RepaymentUrl = &v
	return s
}

func (s *CreateWithholdAgreementRequest) SetReturnUrl(v string) *CreateWithholdAgreementRequest {
	s.ReturnUrl = &v
	return s
}

func (s *CreateWithholdAgreementRequest) SetThirdPartyId(v string) *CreateWithholdAgreementRequest {
	s.ThirdPartyId = &v
	return s
}

type CreateWithholdAgreementResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateWithholdAgreementResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateWithholdAgreementResponse) GoString() string {
	return s.String()
}

func (s *CreateWithholdAgreementResponse) SetReqMsgId(v string) *CreateWithholdAgreementResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateWithholdAgreementResponse) SetResultCode(v string) *CreateWithholdAgreementResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateWithholdAgreementResponse) SetResultMsg(v string) *CreateWithholdAgreementResponse {
	s.ResultMsg = &v
	return s
}

type QueryWithholdAgreementRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
	ExternalAgreementNo *string `json:"external_agreement_no,omitempty" xml:"external_agreement_no,omitempty" require:"true"`
	// 第三方用户id
	ThirdPartyId *string `json:"third_party_id,omitempty" xml:"third_party_id,omitempty" require:"true"`
}

func (s QueryWithholdAgreementRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryWithholdAgreementRequest) GoString() string {
	return s.String()
}

func (s *QueryWithholdAgreementRequest) SetAuthToken(v string) *QueryWithholdAgreementRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryWithholdAgreementRequest) SetProductInstanceId(v string) *QueryWithholdAgreementRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryWithholdAgreementRequest) SetExternalAgreementNo(v string) *QueryWithholdAgreementRequest {
	s.ExternalAgreementNo = &v
	return s
}

func (s *QueryWithholdAgreementRequest) SetThirdPartyId(v string) *QueryWithholdAgreementRequest {
	s.ThirdPartyId = &v
	return s
}

type QueryWithholdAgreementResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总授信金额
	CreditAmount *string `json:"credit_amount,omitempty" xml:"credit_amount,omitempty"`
	// 商家的支付宝uid
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// 商户名称
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty"`
	// 商户的服务名称
	MerchantServiceName *string `json:"merchant_service_name,omitempty" xml:"merchant_service_name,omitempty"`
	// 姓名身份证号拼接后的hash
	NameCertHash *string `json:"name_cert_hash,omitempty" xml:"name_cert_hash,omitempty"`
	// 还款计划的超链接
	RepaymentUrl *string `json:"repayment_url,omitempty" xml:"repayment_url,omitempty"`
	// 协议的状态，如果签署成功返回success,未签是空
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 第三方的用户id
	ThirdPartyId *string `json:"third_party_id,omitempty" xml:"third_party_id,omitempty"`
	// 商家请求的协议号
	ExternalAgreementNo *string `json:"external_agreement_no,omitempty" xml:"external_agreement_no,omitempty"`
}

func (s QueryWithholdAgreementResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryWithholdAgreementResponse) GoString() string {
	return s.String()
}

func (s *QueryWithholdAgreementResponse) SetReqMsgId(v string) *QueryWithholdAgreementResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryWithholdAgreementResponse) SetResultCode(v string) *QueryWithholdAgreementResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryWithholdAgreementResponse) SetResultMsg(v string) *QueryWithholdAgreementResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryWithholdAgreementResponse) SetCreditAmount(v string) *QueryWithholdAgreementResponse {
	s.CreditAmount = &v
	return s
}

func (s *QueryWithholdAgreementResponse) SetMerchantId(v string) *QueryWithholdAgreementResponse {
	s.MerchantId = &v
	return s
}

func (s *QueryWithholdAgreementResponse) SetMerchantName(v string) *QueryWithholdAgreementResponse {
	s.MerchantName = &v
	return s
}

func (s *QueryWithholdAgreementResponse) SetMerchantServiceName(v string) *QueryWithholdAgreementResponse {
	s.MerchantServiceName = &v
	return s
}

func (s *QueryWithholdAgreementResponse) SetNameCertHash(v string) *QueryWithholdAgreementResponse {
	s.NameCertHash = &v
	return s
}

func (s *QueryWithholdAgreementResponse) SetRepaymentUrl(v string) *QueryWithholdAgreementResponse {
	s.RepaymentUrl = &v
	return s
}

func (s *QueryWithholdAgreementResponse) SetStatus(v string) *QueryWithholdAgreementResponse {
	s.Status = &v
	return s
}

func (s *QueryWithholdAgreementResponse) SetThirdPartyId(v string) *QueryWithholdAgreementResponse {
	s.ThirdPartyId = &v
	return s
}

func (s *QueryWithholdAgreementResponse) SetExternalAgreementNo(v string) *QueryWithholdAgreementResponse {
	s.ExternalAgreementNo = &v
	return s
}

type QueryWithholdAgreementurlRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
	ExternalAgreementNo *string `json:"external_agreement_no,omitempty" xml:"external_agreement_no,omitempty" require:"true"`
	// 第三方用户id
	ThirdPartyId *string `json:"third_party_id,omitempty" xml:"third_party_id,omitempty" require:"true"`
}

func (s QueryWithholdAgreementurlRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryWithholdAgreementurlRequest) GoString() string {
	return s.String()
}

func (s *QueryWithholdAgreementurlRequest) SetAuthToken(v string) *QueryWithholdAgreementurlRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryWithholdAgreementurlRequest) SetProductInstanceId(v string) *QueryWithholdAgreementurlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryWithholdAgreementurlRequest) SetExternalAgreementNo(v string) *QueryWithholdAgreementurlRequest {
	s.ExternalAgreementNo = &v
	return s
}

func (s *QueryWithholdAgreementurlRequest) SetThirdPartyId(v string) *QueryWithholdAgreementurlRequest {
	s.ThirdPartyId = &v
	return s
}

type QueryWithholdAgreementurlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 成功
	ResultMessage *string `json:"result_message,omitempty" xml:"result_message,omitempty"`
	// 代扣协议签署的入口
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s QueryWithholdAgreementurlResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryWithholdAgreementurlResponse) GoString() string {
	return s.String()
}

func (s *QueryWithholdAgreementurlResponse) SetReqMsgId(v string) *QueryWithholdAgreementurlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryWithholdAgreementurlResponse) SetResultCode(v string) *QueryWithholdAgreementurlResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryWithholdAgreementurlResponse) SetResultMsg(v string) *QueryWithholdAgreementurlResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryWithholdAgreementurlResponse) SetResultMessage(v string) *QueryWithholdAgreementurlResponse {
	s.ResultMessage = &v
	return s
}

func (s *QueryWithholdAgreementurlResponse) SetUrl(v string) *QueryWithholdAgreementurlResponse {
	s.Url = &v
	return s
}

type CreateWithholdOverduetimeRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 首款方id
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 商家名称
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty" require:"true"`
	// 商家提供的产品名称
	MerchantServiceName *string `json:"merchant_service_name,omitempty" xml:"merchant_service_name,omitempty" require:"true"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
}

func (s CreateWithholdOverduetimeRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateWithholdOverduetimeRequest) GoString() string {
	return s.String()
}

func (s *CreateWithholdOverduetimeRequest) SetAuthToken(v string) *CreateWithholdOverduetimeRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateWithholdOverduetimeRequest) SetProductInstanceId(v string) *CreateWithholdOverduetimeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateWithholdOverduetimeRequest) SetMerchantId(v string) *CreateWithholdOverduetimeRequest {
	s.MerchantId = &v
	return s
}

func (s *CreateWithholdOverduetimeRequest) SetMerchantName(v string) *CreateWithholdOverduetimeRequest {
	s.MerchantName = &v
	return s
}

func (s *CreateWithholdOverduetimeRequest) SetMerchantServiceName(v string) *CreateWithholdOverduetimeRequest {
	s.MerchantServiceName = &v
	return s
}

func (s *CreateWithholdOverduetimeRequest) SetTenantId(v string) *CreateWithholdOverduetimeRequest {
	s.TenantId = &v
	return s
}

type CreateWithholdOverduetimeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateWithholdOverduetimeResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateWithholdOverduetimeResponse) GoString() string {
	return s.String()
}

func (s *CreateWithholdOverduetimeResponse) SetReqMsgId(v string) *CreateWithholdOverduetimeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateWithholdOverduetimeResponse) SetResultCode(v string) *CreateWithholdOverduetimeResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateWithholdOverduetimeResponse) SetResultMsg(v string) *CreateWithholdOverduetimeResponse {
	s.ResultMsg = &v
	return s
}

type SendWithholdDeductRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 委托支付订单总金额，单位为元，精确到小数点后两位
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
	// JSON格式，传递业务扩展参数
	BusinessParams *string `json:"business_params,omitempty" xml:"business_params,omitempty"`
	// 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
	ExternalAgreementNo *string `json:"external_agreement_no,omitempty" xml:"external_agreement_no,omitempty" require:"true"`
	// 订单标题信息
	OrderTitle *string `json:"order_title,omitempty" xml:"order_title,omitempty"`
	// 外部订单号,请求方保证唯一性
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty" require:"true"`
	// 备注
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
	// 第三方的用户id
	ThirdPartyId *string `json:"third_party_id,omitempty" xml:"third_party_id,omitempty" require:"true"`
}

func (s SendWithholdDeductRequest) String() string {
	return tea.Prettify(s)
}

func (s SendWithholdDeductRequest) GoString() string {
	return s.String()
}

func (s *SendWithholdDeductRequest) SetAuthToken(v string) *SendWithholdDeductRequest {
	s.AuthToken = &v
	return s
}

func (s *SendWithholdDeductRequest) SetProductInstanceId(v string) *SendWithholdDeductRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendWithholdDeductRequest) SetAmount(v string) *SendWithholdDeductRequest {
	s.Amount = &v
	return s
}

func (s *SendWithholdDeductRequest) SetBusinessParams(v string) *SendWithholdDeductRequest {
	s.BusinessParams = &v
	return s
}

func (s *SendWithholdDeductRequest) SetExternalAgreementNo(v string) *SendWithholdDeductRequest {
	s.ExternalAgreementNo = &v
	return s
}

func (s *SendWithholdDeductRequest) SetOrderTitle(v string) *SendWithholdDeductRequest {
	s.OrderTitle = &v
	return s
}

func (s *SendWithholdDeductRequest) SetOutBizNo(v string) *SendWithholdDeductRequest {
	s.OutBizNo = &v
	return s
}

func (s *SendWithholdDeductRequest) SetRemark(v string) *SendWithholdDeductRequest {
	s.Remark = &v
	return s
}

func (s *SendWithholdDeductRequest) SetThirdPartyId(v string) *SendWithholdDeductRequest {
	s.ThirdPartyId = &v
	return s
}

type SendWithholdDeductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 该笔转账在支付宝系统内部的单据ID
	EntrustOrderId *string `json:"entrust_order_id,omitempty" xml:"entrust_order_id,omitempty"`
	// INIT：受理成功，扣款中
	// FINISHED：扣款成功
	// CLOSED：商户已关单
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s SendWithholdDeductResponse) String() string {
	return tea.Prettify(s)
}

func (s SendWithholdDeductResponse) GoString() string {
	return s.String()
}

func (s *SendWithholdDeductResponse) SetReqMsgId(v string) *SendWithholdDeductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendWithholdDeductResponse) SetResultCode(v string) *SendWithholdDeductResponse {
	s.ResultCode = &v
	return s
}

func (s *SendWithholdDeductResponse) SetResultMsg(v string) *SendWithholdDeductResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendWithholdDeductResponse) SetEntrustOrderId(v string) *SendWithholdDeductResponse {
	s.EntrustOrderId = &v
	return s
}

func (s *SendWithholdDeductResponse) SetStatus(v string) *SendWithholdDeductResponse {
	s.Status = &v
	return s
}

type QueryWithholdPayresultRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求扣款时，返回的委托单号,该笔转账在支付宝系统内部的单据ID
	EntrustOrderId *string `json:"entrust_order_id,omitempty" xml:"entrust_order_id,omitempty" require:"true"`
	// 外部订单号,请求方保证唯一性
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty" require:"true"`
}

func (s QueryWithholdPayresultRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryWithholdPayresultRequest) GoString() string {
	return s.String()
}

func (s *QueryWithholdPayresultRequest) SetAuthToken(v string) *QueryWithholdPayresultRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryWithholdPayresultRequest) SetProductInstanceId(v string) *QueryWithholdPayresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryWithholdPayresultRequest) SetEntrustOrderId(v string) *QueryWithholdPayresultRequest {
	s.EntrustOrderId = &v
	return s
}

func (s *QueryWithholdPayresultRequest) SetOutBizNo(v string) *QueryWithholdPayresultRequest {
	s.OutBizNo = &v
	return s
}

type QueryWithholdPayresultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 支付完成日期
	PayDate *string `json:"pay_date,omitempty" xml:"pay_date,omitempty"`
	// 支付宝支付单据号
	PayOrderId *string `json:"pay_order_id,omitempty" xml:"pay_order_id,omitempty"`
	// INIT：受理成功，扣款中
	// FINISHED：扣款成功
	// CLOSED：商户已关单
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 扣款金额
	TransAmount *string `json:"trans_amount,omitempty" xml:"trans_amount,omitempty"`
}

func (s QueryWithholdPayresultResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryWithholdPayresultResponse) GoString() string {
	return s.String()
}

func (s *QueryWithholdPayresultResponse) SetReqMsgId(v string) *QueryWithholdPayresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryWithholdPayresultResponse) SetResultCode(v string) *QueryWithholdPayresultResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryWithholdPayresultResponse) SetResultMsg(v string) *QueryWithholdPayresultResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryWithholdPayresultResponse) SetPayDate(v string) *QueryWithholdPayresultResponse {
	s.PayDate = &v
	return s
}

func (s *QueryWithholdPayresultResponse) SetPayOrderId(v string) *QueryWithholdPayresultResponse {
	s.PayOrderId = &v
	return s
}

func (s *QueryWithholdPayresultResponse) SetStatus(v string) *QueryWithholdPayresultResponse {
	s.Status = &v
	return s
}

func (s *QueryWithholdPayresultResponse) SetTransAmount(v string) *QueryWithholdPayresultResponse {
	s.TransAmount = &v
	return s
}

type SendWithholdRefundRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 支付宝支付单据号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 外部订单号,请求方保证唯一性
	OutRequestNo *string `json:"out_request_no,omitempty" xml:"out_request_no,omitempty" require:"true"`
	// 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
	RefundAmount *string `json:"refund_amount,omitempty" xml:"refund_amount,omitempty" require:"true"`
	// 退款备注
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty" require:"true"`
}

func (s SendWithholdRefundRequest) String() string {
	return tea.Prettify(s)
}

func (s SendWithholdRefundRequest) GoString() string {
	return s.String()
}

func (s *SendWithholdRefundRequest) SetAuthToken(v string) *SendWithholdRefundRequest {
	s.AuthToken = &v
	return s
}

func (s *SendWithholdRefundRequest) SetProductInstanceId(v string) *SendWithholdRefundRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendWithholdRefundRequest) SetOrderId(v string) *SendWithholdRefundRequest {
	s.OrderId = &v
	return s
}

func (s *SendWithholdRefundRequest) SetOutRequestNo(v string) *SendWithholdRefundRequest {
	s.OutRequestNo = &v
	return s
}

func (s *SendWithholdRefundRequest) SetRefundAmount(v string) *SendWithholdRefundRequest {
	s.RefundAmount = &v
	return s
}

func (s *SendWithholdRefundRequest) SetRemark(v string) *SendWithholdRefundRequest {
	s.Remark = &v
	return s
}

type SendWithholdRefundResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
	RefundAmount *string `json:"refund_amount,omitempty" xml:"refund_amount,omitempty"`
	// 退款成功的日期
	RefundDate *string `json:"refund_date,omitempty" xml:"refund_date,omitempty"`
	// 退款的支付宝系统内部单据id
	RefundOrderId *string `json:"refund_order_id,omitempty" xml:"refund_order_id,omitempty"`
	// FINISHED,退款成功的状态值
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s SendWithholdRefundResponse) String() string {
	return tea.Prettify(s)
}

func (s SendWithholdRefundResponse) GoString() string {
	return s.String()
}

func (s *SendWithholdRefundResponse) SetReqMsgId(v string) *SendWithholdRefundResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendWithholdRefundResponse) SetResultCode(v string) *SendWithholdRefundResponse {
	s.ResultCode = &v
	return s
}

func (s *SendWithholdRefundResponse) SetResultMsg(v string) *SendWithholdRefundResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendWithholdRefundResponse) SetRefundAmount(v string) *SendWithholdRefundResponse {
	s.RefundAmount = &v
	return s
}

func (s *SendWithholdRefundResponse) SetRefundDate(v string) *SendWithholdRefundResponse {
	s.RefundDate = &v
	return s
}

func (s *SendWithholdRefundResponse) SetRefundOrderId(v string) *SendWithholdRefundResponse {
	s.RefundOrderId = &v
	return s
}

func (s *SendWithholdRefundResponse) SetStatus(v string) *SendWithholdRefundResponse {
	s.Status = &v
	return s
}

type SendContractInvitationRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务方id，重定向和回调时都回传这个id
	BizProcessId *string `json:"biz_process_id,omitempty" xml:"biz_process_id,omitempty"`
	// 回调接口地址，默认为空，不回调
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 被邀请人邮箱，若手机号和邮箱都传入，则仅手机号有效
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 被邀请人证件号
	IdNumber *string `json:"id_number,omitempty" xml:"id_number,omitempty"`
	// 被邀请人证件类型，详见个人证件类型说明 ，默认CRED_PSN_CH_IDCARD
	InviteeCertType *string `json:"invitee_cert_type,omitempty" xml:"invitee_cert_type,omitempty"`
	// 邀请个人实名为PERSON，邀请企业为ORGAN
	InviteType *string `json:"invite_type,omitempty" xml:"invite_type,omitempty" require:"true"`
	// 企业法定代表人证件类型，详见个人证件类型说明 ，默认CRED_PSN_CH_IDCARD
	LegalCertType *string `json:"legal_cert_type,omitempty" xml:"legal_cert_type,omitempty"`
	// 企业法定代表人姓名
	LegalName *string `json:"legal_name,omitempty" xml:"legal_name,omitempty"`
	// 企业法定代表人证件号
	LegalNo *string `json:"legal_no,omitempty" xml:"legal_no,omitempty"`
	// 被邀请人手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 被邀请人姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 默认为空，传入“sms”表示短信，“email”表示邮件，若两者都传入，则只发送短信
	NotifyType *string `json:"notify_type,omitempty" xml:"notify_type,omitempty"`
	// 企业证件号
	OrganCertNo *string `json:"organ_cert_no,omitempty" xml:"organ_cert_no,omitempty"`
	// 企业证件类型，详见机构证件类型说明 ，默认CRED_ORG_USCC
	OrganCertType *string `json:"organ_cert_type,omitempty" xml:"organ_cert_type,omitempty"`
	// 企业名称
	OrganName *string `json:"organ_name,omitempty" xml:"organ_name,omitempty"`
	// 结束后重定向地址（需加前缀https:// 或 http:// ），默认停留在当前页面
	RedirectUrl *string `json:"redirect_url,omitempty" xml:"redirect_url,omitempty"`
}

func (s SendContractInvitationRequest) String() string {
	return tea.Prettify(s)
}

func (s SendContractInvitationRequest) GoString() string {
	return s.String()
}

func (s *SendContractInvitationRequest) SetAuthToken(v string) *SendContractInvitationRequest {
	s.AuthToken = &v
	return s
}

func (s *SendContractInvitationRequest) SetProductInstanceId(v string) *SendContractInvitationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendContractInvitationRequest) SetBizProcessId(v string) *SendContractInvitationRequest {
	s.BizProcessId = &v
	return s
}

func (s *SendContractInvitationRequest) SetCallbackUrl(v string) *SendContractInvitationRequest {
	s.CallbackUrl = &v
	return s
}

func (s *SendContractInvitationRequest) SetEmail(v string) *SendContractInvitationRequest {
	s.Email = &v
	return s
}

func (s *SendContractInvitationRequest) SetIdNumber(v string) *SendContractInvitationRequest {
	s.IdNumber = &v
	return s
}

func (s *SendContractInvitationRequest) SetInviteeCertType(v string) *SendContractInvitationRequest {
	s.InviteeCertType = &v
	return s
}

func (s *SendContractInvitationRequest) SetInviteType(v string) *SendContractInvitationRequest {
	s.InviteType = &v
	return s
}

func (s *SendContractInvitationRequest) SetLegalCertType(v string) *SendContractInvitationRequest {
	s.LegalCertType = &v
	return s
}

func (s *SendContractInvitationRequest) SetLegalName(v string) *SendContractInvitationRequest {
	s.LegalName = &v
	return s
}

func (s *SendContractInvitationRequest) SetLegalNo(v string) *SendContractInvitationRequest {
	s.LegalNo = &v
	return s
}

func (s *SendContractInvitationRequest) SetMobile(v string) *SendContractInvitationRequest {
	s.Mobile = &v
	return s
}

func (s *SendContractInvitationRequest) SetName(v string) *SendContractInvitationRequest {
	s.Name = &v
	return s
}

func (s *SendContractInvitationRequest) SetNotifyType(v string) *SendContractInvitationRequest {
	s.NotifyType = &v
	return s
}

func (s *SendContractInvitationRequest) SetOrganCertNo(v string) *SendContractInvitationRequest {
	s.OrganCertNo = &v
	return s
}

func (s *SendContractInvitationRequest) SetOrganCertType(v string) *SendContractInvitationRequest {
	s.OrganCertType = &v
	return s
}

func (s *SendContractInvitationRequest) SetOrganName(v string) *SendContractInvitationRequest {
	s.OrganName = &v
	return s
}

func (s *SendContractInvitationRequest) SetRedirectUrl(v string) *SendContractInvitationRequest {
	s.RedirectUrl = &v
	return s
}

type SendContractInvitationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 邀请任务id
	InvitationId *string `json:"invitation_id,omitempty" xml:"invitation_id,omitempty"`
	// 邀请链接
	InvitationUrl *string `json:"invitation_url,omitempty" xml:"invitation_url,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s SendContractInvitationResponse) String() string {
	return tea.Prettify(s)
}

func (s SendContractInvitationResponse) GoString() string {
	return s.String()
}

func (s *SendContractInvitationResponse) SetReqMsgId(v string) *SendContractInvitationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendContractInvitationResponse) SetResultCode(v string) *SendContractInvitationResponse {
	s.ResultCode = &v
	return s
}

func (s *SendContractInvitationResponse) SetResultMsg(v string) *SendContractInvitationResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendContractInvitationResponse) SetCode(v int64) *SendContractInvitationResponse {
	s.Code = &v
	return s
}

func (s *SendContractInvitationResponse) SetInvitationId(v string) *SendContractInvitationResponse {
	s.InvitationId = &v
	return s
}

func (s *SendContractInvitationResponse) SetInvitationUrl(v string) *SendContractInvitationResponse {
	s.InvitationUrl = &v
	return s
}

func (s *SendContractInvitationResponse) SetMessage(v string) *SendContractInvitationResponse {
	s.Message = &v
	return s
}

type ListContractPayruleRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// flowId
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
}

func (s ListContractPayruleRequest) String() string {
	return tea.Prettify(s)
}

func (s ListContractPayruleRequest) GoString() string {
	return s.String()
}

func (s *ListContractPayruleRequest) SetAuthToken(v string) *ListContractPayruleRequest {
	s.AuthToken = &v
	return s
}

func (s *ListContractPayruleRequest) SetProductInstanceId(v string) *ListContractPayruleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListContractPayruleRequest) SetFlowId(v string) *ListContractPayruleRequest {
	s.FlowId = &v
	return s
}

type ListContractPayruleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// ""
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 代扣规则描述json表示
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s ListContractPayruleResponse) String() string {
	return tea.Prettify(s)
}

func (s ListContractPayruleResponse) GoString() string {
	return s.String()
}

func (s *ListContractPayruleResponse) SetReqMsgId(v string) *ListContractPayruleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListContractPayruleResponse) SetResultCode(v string) *ListContractPayruleResponse {
	s.ResultCode = &v
	return s
}

func (s *ListContractPayruleResponse) SetResultMsg(v string) *ListContractPayruleResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListContractPayruleResponse) SetCode(v int64) *ListContractPayruleResponse {
	s.Code = &v
	return s
}

func (s *ListContractPayruleResponse) SetErrMessage(v string) *ListContractPayruleResponse {
	s.ErrMessage = &v
	return s
}

func (s *ListContractPayruleResponse) SetResponseData(v string) *ListContractPayruleResponse {
	s.ResponseData = &v
	return s
}

type CreateWithholdQrcodeRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 第三方的用户id
	ThirdPartyId *string `json:"third_party_id,omitempty" xml:"third_party_id,omitempty" require:"true"`
	// 请求签约的协议号
	ExternalAgreementNo *string `json:"external_agreement_no,omitempty" xml:"external_agreement_no,omitempty" require:"true"`
}

func (s CreateWithholdQrcodeRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateWithholdQrcodeRequest) GoString() string {
	return s.String()
}

func (s *CreateWithholdQrcodeRequest) SetAuthToken(v string) *CreateWithholdQrcodeRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateWithholdQrcodeRequest) SetProductInstanceId(v string) *CreateWithholdQrcodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateWithholdQrcodeRequest) SetThirdPartyId(v string) *CreateWithholdQrcodeRequest {
	s.ThirdPartyId = &v
	return s
}

func (s *CreateWithholdQrcodeRequest) SetExternalAgreementNo(v string) *CreateWithholdQrcodeRequest {
	s.ExternalAgreementNo = &v
	return s
}

type CreateWithholdQrcodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 二维码图片链接地址
	QrCodeUrl *string `json:"qr_code_url,omitempty" xml:"qr_code_url,omitempty"`
}

func (s CreateWithholdQrcodeResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateWithholdQrcodeResponse) GoString() string {
	return s.String()
}

func (s *CreateWithholdQrcodeResponse) SetReqMsgId(v string) *CreateWithholdQrcodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateWithholdQrcodeResponse) SetResultCode(v string) *CreateWithholdQrcodeResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateWithholdQrcodeResponse) SetResultMsg(v string) *CreateWithholdQrcodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateWithholdQrcodeResponse) SetQrCodeUrl(v string) *CreateWithholdQrcodeResponse {
	s.QrCodeUrl = &v
	return s
}

type CancelContractPaysingletradeRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 智能合同id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	// 被取消的某一期的代扣id
	CancelOutOrderNo *string `json:"cancel_out_order_no,omitempty" xml:"cancel_out_order_no,omitempty" require:"true"`
}

func (s CancelContractPaysingletradeRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelContractPaysingletradeRequest) GoString() string {
	return s.String()
}

func (s *CancelContractPaysingletradeRequest) SetAuthToken(v string) *CancelContractPaysingletradeRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelContractPaysingletradeRequest) SetProductInstanceId(v string) *CancelContractPaysingletradeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelContractPaysingletradeRequest) SetFlowId(v string) *CancelContractPaysingletradeRequest {
	s.FlowId = &v
	return s
}

func (s *CancelContractPaysingletradeRequest) SetCancelOutOrderNo(v string) *CancelContractPaysingletradeRequest {
	s.CancelOutOrderNo = &v
	return s
}

type CancelContractPaysingletradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 被取消的某一期代扣订单id
	CanceledOutTradeNo *string `json:"canceled_out_trade_no,omitempty" xml:"canceled_out_trade_no,omitempty"`
}

func (s CancelContractPaysingletradeResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelContractPaysingletradeResponse) GoString() string {
	return s.String()
}

func (s *CancelContractPaysingletradeResponse) SetReqMsgId(v string) *CancelContractPaysingletradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelContractPaysingletradeResponse) SetResultCode(v string) *CancelContractPaysingletradeResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelContractPaysingletradeResponse) SetResultMsg(v string) *CancelContractPaysingletradeResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelContractPaysingletradeResponse) SetCode(v int64) *CancelContractPaysingletradeResponse {
	s.Code = &v
	return s
}

func (s *CancelContractPaysingletradeResponse) SetErrMessage(v string) *CancelContractPaysingletradeResponse {
	s.ErrMessage = &v
	return s
}

func (s *CancelContractPaysingletradeResponse) SetCanceledOutTradeNo(v string) *CancelContractPaysingletradeResponse {
	s.CanceledOutTradeNo = &v
	return s
}

type ApplyContractCallbackkeyRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s ApplyContractCallbackkeyRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyContractCallbackkeyRequest) GoString() string {
	return s.String()
}

func (s *ApplyContractCallbackkeyRequest) SetAuthToken(v string) *ApplyContractCallbackkeyRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyContractCallbackkeyRequest) SetProductInstanceId(v string) *ApplyContractCallbackkeyRequest {
	s.ProductInstanceId = &v
	return s
}

type ApplyContractCallbackkeyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 加签使用的key
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s ApplyContractCallbackkeyResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyContractCallbackkeyResponse) GoString() string {
	return s.String()
}

func (s *ApplyContractCallbackkeyResponse) SetReqMsgId(v string) *ApplyContractCallbackkeyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyContractCallbackkeyResponse) SetResultCode(v string) *ApplyContractCallbackkeyResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyContractCallbackkeyResponse) SetResultMsg(v string) *ApplyContractCallbackkeyResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyContractCallbackkeyResponse) SetKey(v string) *ApplyContractCallbackkeyResponse {
	s.Key = &v
	return s
}

func (s *ApplyContractCallbackkeyResponse) SetCode(v int64) *ApplyContractCallbackkeyResponse {
	s.Code = &v
	return s
}

func (s *ApplyContractCallbackkeyResponse) SetMessage(v string) *ApplyContractCallbackkeyResponse {
	s.Message = &v
	return s
}

type CreateContractOnestepflowRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 是否自动归档，默认false。
	AutoArchive *bool `json:"auto_archive,omitempty" xml:"auto_archive,omitempty"`
	// 是否自动开启，默认false。
	AutoInitiate *bool `json:"auto_initiate,omitempty" xml:"auto_initiate,omitempty"`
	// 文件主题
	BusinessScene *string `json:"business_scene,omitempty" xml:"business_scene,omitempty" require:"true"`
	// 流程备注
	Comment *string `json:"comment,omitempty" xml:"comment,omitempty"`
	// 任务配置信息
	ContractSignFlowConfig *ContractSignFlowConfig `json:"contract_sign_flow_config,omitempty" xml:"contract_sign_flow_config,omitempty"`
	// 待签文档信息
	Docs []*ContractDoc `json:"docs,omitempty" xml:"docs,omitempty" type:"Repeated"`
	// 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
	InitiatorAccountId *string `json:"initiator_account_id,omitempty" xml:"initiator_account_id,omitempty"`
	// 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
	InitiatorAuthorizedAccountId *string `json:"initiator_authorized_account_id,omitempty" xml:"initiator_authorized_account_id,omitempty"`
	// 流程中的签署区信息
	SignFields []*OneStepSignField `json:"sign_fields,omitempty" xml:"sign_fields,omitempty" type:"Repeated"`
	// 签署平台，ALIPAY（支付宝小程序）或H5，默认H5
	SignPlatform *string `json:"sign_platform,omitempty" xml:"sign_platform,omitempty"`
	// 签署有效截止日期，毫秒，默认3天失效
	SignValidity *int64 `json:"sign_validity,omitempty" xml:"sign_validity,omitempty"`
}

func (s CreateContractOnestepflowRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateContractOnestepflowRequest) GoString() string {
	return s.String()
}

func (s *CreateContractOnestepflowRequest) SetAuthToken(v string) *CreateContractOnestepflowRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateContractOnestepflowRequest) SetProductInstanceId(v string) *CreateContractOnestepflowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateContractOnestepflowRequest) SetAutoArchive(v bool) *CreateContractOnestepflowRequest {
	s.AutoArchive = &v
	return s
}

func (s *CreateContractOnestepflowRequest) SetAutoInitiate(v bool) *CreateContractOnestepflowRequest {
	s.AutoInitiate = &v
	return s
}

func (s *CreateContractOnestepflowRequest) SetBusinessScene(v string) *CreateContractOnestepflowRequest {
	s.BusinessScene = &v
	return s
}

func (s *CreateContractOnestepflowRequest) SetComment(v string) *CreateContractOnestepflowRequest {
	s.Comment = &v
	return s
}

func (s *CreateContractOnestepflowRequest) SetContractSignFlowConfig(v *ContractSignFlowConfig) *CreateContractOnestepflowRequest {
	s.ContractSignFlowConfig = v
	return s
}

func (s *CreateContractOnestepflowRequest) SetDocs(v []*ContractDoc) *CreateContractOnestepflowRequest {
	s.Docs = v
	return s
}

func (s *CreateContractOnestepflowRequest) SetInitiatorAccountId(v string) *CreateContractOnestepflowRequest {
	s.InitiatorAccountId = &v
	return s
}

func (s *CreateContractOnestepflowRequest) SetInitiatorAuthorizedAccountId(v string) *CreateContractOnestepflowRequest {
	s.InitiatorAuthorizedAccountId = &v
	return s
}

func (s *CreateContractOnestepflowRequest) SetSignFields(v []*OneStepSignField) *CreateContractOnestepflowRequest {
	s.SignFields = v
	return s
}

func (s *CreateContractOnestepflowRequest) SetSignPlatform(v string) *CreateContractOnestepflowRequest {
	s.SignPlatform = &v
	return s
}

func (s *CreateContractOnestepflowRequest) SetSignValidity(v int64) *CreateContractOnestepflowRequest {
	s.SignValidity = &v
	return s
}

type CreateContractOnestepflowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s CreateContractOnestepflowResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateContractOnestepflowResponse) GoString() string {
	return s.String()
}

func (s *CreateContractOnestepflowResponse) SetReqMsgId(v string) *CreateContractOnestepflowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateContractOnestepflowResponse) SetResultCode(v string) *CreateContractOnestepflowResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateContractOnestepflowResponse) SetResultMsg(v string) *CreateContractOnestepflowResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateContractOnestepflowResponse) SetCode(v int64) *CreateContractOnestepflowResponse {
	s.Code = &v
	return s
}

func (s *CreateContractOnestepflowResponse) SetFlowId(v string) *CreateContractOnestepflowResponse {
	s.FlowId = &v
	return s
}

func (s *CreateContractOnestepflowResponse) SetMessage(v string) *CreateContractOnestepflowResponse {
	s.Message = &v
	return s
}

type QueryContractNotaryRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
}

func (s QueryContractNotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryContractNotaryRequest) GoString() string {
	return s.String()
}

func (s *QueryContractNotaryRequest) SetAuthToken(v string) *QueryContractNotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryContractNotaryRequest) SetProductInstanceId(v string) *QueryContractNotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryContractNotaryRequest) SetFlowId(v string) *QueryContractNotaryRequest {
	s.FlowId = &v
	return s
}

type QueryContractNotaryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 存证信息列表
	Notaries []*ContractNotaryInfo `json:"notaries,omitempty" xml:"notaries,omitempty" type:"Repeated"`
}

func (s QueryContractNotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryContractNotaryResponse) GoString() string {
	return s.String()
}

func (s *QueryContractNotaryResponse) SetReqMsgId(v string) *QueryContractNotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryContractNotaryResponse) SetResultCode(v string) *QueryContractNotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryContractNotaryResponse) SetResultMsg(v string) *QueryContractNotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryContractNotaryResponse) SetCode(v int64) *QueryContractNotaryResponse {
	s.Code = &v
	return s
}

func (s *QueryContractNotaryResponse) SetMessage(v string) *QueryContractNotaryResponse {
	s.Message = &v
	return s
}

func (s *QueryContractNotaryResponse) SetNotaries(v []*ContractNotaryInfo) *QueryContractNotaryResponse {
	s.Notaries = v
	return s
}

type CreateEcocontractTransRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 存证关联实体（个人/企业）的身份识别信息
	Customer *Identity `json:"customer,omitempty" xml:"customer,omitempty" require:"true"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 业务子类型标识
	SubBizId *string `json:"sub_biz_id,omitempty" xml:"sub_biz_id,omitempty"`
	// 是否使用可信时间戳，默认为false
	Tsr *bool `json:"tsr,omitempty" xml:"tsr,omitempty"`
}

func (s CreateEcocontractTransRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateEcocontractTransRequest) GoString() string {
	return s.String()
}

func (s *CreateEcocontractTransRequest) SetAuthToken(v string) *CreateEcocontractTransRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateEcocontractTransRequest) SetProductInstanceId(v string) *CreateEcocontractTransRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateEcocontractTransRequest) SetCustomer(v *Identity) *CreateEcocontractTransRequest {
	s.Customer = v
	return s
}

func (s *CreateEcocontractTransRequest) SetProperties(v string) *CreateEcocontractTransRequest {
	s.Properties = &v
	return s
}

func (s *CreateEcocontractTransRequest) SetSubBizId(v string) *CreateEcocontractTransRequest {
	s.SubBizId = &v
	return s
}

func (s *CreateEcocontractTransRequest) SetTsr(v bool) *CreateEcocontractTransRequest {
	s.Tsr = &v
	return s
}

type CreateEcocontractTransResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回事务ID，全局唯一
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 可信时间信息
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
}

func (s CreateEcocontractTransResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateEcocontractTransResponse) GoString() string {
	return s.String()
}

func (s *CreateEcocontractTransResponse) SetReqMsgId(v string) *CreateEcocontractTransResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateEcocontractTransResponse) SetResultCode(v string) *CreateEcocontractTransResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateEcocontractTransResponse) SetResultMsg(v string) *CreateEcocontractTransResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateEcocontractTransResponse) SetTransactionId(v string) *CreateEcocontractTransResponse {
	s.TransactionId = &v
	return s
}

func (s *CreateEcocontractTransResponse) SetTsr(v *TsrResponse) *CreateEcocontractTransResponse {
	s.Tsr = v
	return s
}

type CreateEcocontractTextRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署结束信息，phase为FINISH时必选
	FinishInfo *ContractNotaryFinishInfo `json:"finish_info,omitempty" xml:"finish_info,omitempty"`
	// 签署流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	// 签署发起信息，phase为INIT时必选
	InitInfo *ContractNotaryInitInfo `json:"init_info,omitempty" xml:"init_info,omitempty"`
	// 存证阶段，分为INIT(发起)，SIGN(签署)，FINISH(结束)
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty" require:"true"`
	// 签署过程信息，phase为SIGN时必选
	SignInfo *ContractNotarySignInfo `json:"sign_info,omitempty" xml:"sign_info,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty" require:"true"`
	// 签署文件存档阶段存证核验信息
	DocumentInfo *ContractNotaryDocumentInfo `json:"document_info,omitempty" xml:"document_info,omitempty"`
}

func (s CreateEcocontractTextRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateEcocontractTextRequest) GoString() string {
	return s.String()
}

func (s *CreateEcocontractTextRequest) SetAuthToken(v string) *CreateEcocontractTextRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateEcocontractTextRequest) SetProductInstanceId(v string) *CreateEcocontractTextRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateEcocontractTextRequest) SetFinishInfo(v *ContractNotaryFinishInfo) *CreateEcocontractTextRequest {
	s.FinishInfo = v
	return s
}

func (s *CreateEcocontractTextRequest) SetFlowId(v string) *CreateEcocontractTextRequest {
	s.FlowId = &v
	return s
}

func (s *CreateEcocontractTextRequest) SetInitInfo(v *ContractNotaryInitInfo) *CreateEcocontractTextRequest {
	s.InitInfo = v
	return s
}

func (s *CreateEcocontractTextRequest) SetPhase(v string) *CreateEcocontractTextRequest {
	s.Phase = &v
	return s
}

func (s *CreateEcocontractTextRequest) SetSignInfo(v *ContractNotarySignInfo) *CreateEcocontractTextRequest {
	s.SignInfo = v
	return s
}

func (s *CreateEcocontractTextRequest) SetTransactionId(v string) *CreateEcocontractTextRequest {
	s.TransactionId = &v
	return s
}

func (s *CreateEcocontractTextRequest) SetDocumentInfo(v *ContractNotaryDocumentInfo) *CreateEcocontractTextRequest {
	s.DocumentInfo = v
	return s
}

type CreateEcocontractTextResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证凭据,
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateEcocontractTextResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateEcocontractTextResponse) GoString() string {
	return s.String()
}

func (s *CreateEcocontractTextResponse) SetReqMsgId(v string) *CreateEcocontractTextResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateEcocontractTextResponse) SetResultCode(v string) *CreateEcocontractTextResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateEcocontractTextResponse) SetResultMsg(v string) *CreateEcocontractTextResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateEcocontractTextResponse) SetTxHash(v string) *CreateEcocontractTextResponse {
	s.TxHash = &v
	return s
}

type QueryContractWordspositionRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文档id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 关键字列表，逗号分割；注意要英文的逗号，不能中文逗号；关键字建议不要设置特殊字符，因Adobe无法识别部分符号，某些特殊字符会因解析失败从而导致搜索不到
	Keywords *string `json:"keywords,omitempty" xml:"keywords,omitempty" require:"true"`
}

func (s QueryContractWordspositionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryContractWordspositionRequest) GoString() string {
	return s.String()
}

func (s *QueryContractWordspositionRequest) SetAuthToken(v string) *QueryContractWordspositionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryContractWordspositionRequest) SetProductInstanceId(v string) *QueryContractWordspositionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryContractWordspositionRequest) SetFileId(v string) *QueryContractWordspositionRequest {
	s.FileId = &v
	return s
}

func (s *QueryContractWordspositionRequest) SetKeywords(v string) *QueryContractWordspositionRequest {
	s.Keywords = &v
	return s
}

type QueryContractWordspositionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 文档id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 关键字位置列表
	Data []*KeywordsPosition `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryContractWordspositionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryContractWordspositionResponse) GoString() string {
	return s.String()
}

func (s *QueryContractWordspositionResponse) SetReqMsgId(v string) *QueryContractWordspositionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryContractWordspositionResponse) SetResultCode(v string) *QueryContractWordspositionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryContractWordspositionResponse) SetResultMsg(v string) *QueryContractWordspositionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryContractWordspositionResponse) SetCode(v int64) *QueryContractWordspositionResponse {
	s.Code = &v
	return s
}

func (s *QueryContractWordspositionResponse) SetMessage(v string) *QueryContractWordspositionResponse {
	s.Message = &v
	return s
}

func (s *QueryContractWordspositionResponse) SetFileId(v string) *QueryContractWordspositionResponse {
	s.FileId = &v
	return s
}

func (s *QueryContractWordspositionResponse) SetData(v []*KeywordsPosition) *QueryContractWordspositionResponse {
	s.Data = v
	return s
}

type DeleteContractSignerRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	// 签署人ID
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
}

func (s DeleteContractSignerRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteContractSignerRequest) GoString() string {
	return s.String()
}

func (s *DeleteContractSignerRequest) SetAuthToken(v string) *DeleteContractSignerRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteContractSignerRequest) SetProductInstanceId(v string) *DeleteContractSignerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteContractSignerRequest) SetFlowId(v string) *DeleteContractSignerRequest {
	s.FlowId = &v
	return s
}

func (s *DeleteContractSignerRequest) SetAccountId(v string) *DeleteContractSignerRequest {
	s.AccountId = &v
	return s
}

type DeleteContractSignerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s DeleteContractSignerResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteContractSignerResponse) GoString() string {
	return s.String()
}

func (s *DeleteContractSignerResponse) SetReqMsgId(v string) *DeleteContractSignerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteContractSignerResponse) SetResultCode(v string) *DeleteContractSignerResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteContractSignerResponse) SetResultMsg(v string) *DeleteContractSignerResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteContractSignerResponse) SetCode(v int64) *DeleteContractSignerResponse {
	s.Code = &v
	return s
}

func (s *DeleteContractSignerResponse) SetMessage(v string) *DeleteContractSignerResponse {
	s.Message = &v
	return s
}

type CheckEpidentityTwometaRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 认证企业名称。
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty" require:"true"`
	// 企业证件号码。
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
}

func (s CheckEpidentityTwometaRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckEpidentityTwometaRequest) GoString() string {
	return s.String()
}

func (s *CheckEpidentityTwometaRequest) SetAuthToken(v string) *CheckEpidentityTwometaRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckEpidentityTwometaRequest) SetProductInstanceId(v string) *CheckEpidentityTwometaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckEpidentityTwometaRequest) SetEpCertName(v string) *CheckEpidentityTwometaRequest {
	s.EpCertName = &v
	return s
}

func (s *CheckEpidentityTwometaRequest) SetEpCertNo(v string) *CheckEpidentityTwometaRequest {
	s.EpCertNo = &v
	return s
}

type CheckEpidentityTwometaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业状态。
	EnterpriseStatus *string `json:"enterprise_status,omitempty" xml:"enterprise_status,omitempty"`
	// 营业期限。
	OpenTime *string `json:"open_time,omitempty" xml:"open_time,omitempty"`
	// 核验是否通过。
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
	// 0:核验成功 1:企业信息有误 2:企业非正常营业
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
}

func (s CheckEpidentityTwometaResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckEpidentityTwometaResponse) GoString() string {
	return s.String()
}

func (s *CheckEpidentityTwometaResponse) SetReqMsgId(v string) *CheckEpidentityTwometaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckEpidentityTwometaResponse) SetResultCode(v string) *CheckEpidentityTwometaResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckEpidentityTwometaResponse) SetResultMsg(v string) *CheckEpidentityTwometaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckEpidentityTwometaResponse) SetEnterpriseStatus(v string) *CheckEpidentityTwometaResponse {
	s.EnterpriseStatus = &v
	return s
}

func (s *CheckEpidentityTwometaResponse) SetOpenTime(v string) *CheckEpidentityTwometaResponse {
	s.OpenTime = &v
	return s
}

func (s *CheckEpidentityTwometaResponse) SetPassed(v bool) *CheckEpidentityTwometaResponse {
	s.Passed = &v
	return s
}

func (s *CheckEpidentityTwometaResponse) SetCode(v string) *CheckEpidentityTwometaResponse {
	s.Code = &v
	return s
}

type CheckEpidentityThreemetaRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 认证企业名称。
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty" require:"true"`
	// 企业证件号码。
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
	// 企业法人姓名。
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty" require:"true"`
}

func (s CheckEpidentityThreemetaRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckEpidentityThreemetaRequest) GoString() string {
	return s.String()
}

func (s *CheckEpidentityThreemetaRequest) SetAuthToken(v string) *CheckEpidentityThreemetaRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckEpidentityThreemetaRequest) SetProductInstanceId(v string) *CheckEpidentityThreemetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckEpidentityThreemetaRequest) SetEpCertName(v string) *CheckEpidentityThreemetaRequest {
	s.EpCertName = &v
	return s
}

func (s *CheckEpidentityThreemetaRequest) SetEpCertNo(v string) *CheckEpidentityThreemetaRequest {
	s.EpCertNo = &v
	return s
}

func (s *CheckEpidentityThreemetaRequest) SetLegalPersonCertName(v string) *CheckEpidentityThreemetaRequest {
	s.LegalPersonCertName = &v
	return s
}

type CheckEpidentityThreemetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业状态。
	EnterpriseStatus *string `json:"enterprise_status,omitempty" xml:"enterprise_status,omitempty"`
	// 营业期限。
	OpenTime *string `json:"open_time,omitempty" xml:"open_time,omitempty"`
	// 核验是否通过。
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
	// 0:核验成功 1:企业信息有误 2:企业非正常营业
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
}

func (s CheckEpidentityThreemetaResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckEpidentityThreemetaResponse) GoString() string {
	return s.String()
}

func (s *CheckEpidentityThreemetaResponse) SetReqMsgId(v string) *CheckEpidentityThreemetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckEpidentityThreemetaResponse) SetResultCode(v string) *CheckEpidentityThreemetaResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckEpidentityThreemetaResponse) SetResultMsg(v string) *CheckEpidentityThreemetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckEpidentityThreemetaResponse) SetEnterpriseStatus(v string) *CheckEpidentityThreemetaResponse {
	s.EnterpriseStatus = &v
	return s
}

func (s *CheckEpidentityThreemetaResponse) SetOpenTime(v string) *CheckEpidentityThreemetaResponse {
	s.OpenTime = &v
	return s
}

func (s *CheckEpidentityThreemetaResponse) SetPassed(v bool) *CheckEpidentityThreemetaResponse {
	s.Passed = &v
	return s
}

func (s *CheckEpidentityThreemetaResponse) SetCode(v string) *CheckEpidentityThreemetaResponse {
	s.Code = &v
	return s
}

type CheckEpidentityFourmetaRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 认证企业名称。
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty" require:"true"`
	// 企业证件号码。
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
	// 企业法人姓名。
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty" require:"true"`
	// 企业法人身份证号码。
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty" require:"true"`
}

func (s CheckEpidentityFourmetaRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckEpidentityFourmetaRequest) GoString() string {
	return s.String()
}

func (s *CheckEpidentityFourmetaRequest) SetAuthToken(v string) *CheckEpidentityFourmetaRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckEpidentityFourmetaRequest) SetProductInstanceId(v string) *CheckEpidentityFourmetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckEpidentityFourmetaRequest) SetEpCertName(v string) *CheckEpidentityFourmetaRequest {
	s.EpCertName = &v
	return s
}

func (s *CheckEpidentityFourmetaRequest) SetEpCertNo(v string) *CheckEpidentityFourmetaRequest {
	s.EpCertNo = &v
	return s
}

func (s *CheckEpidentityFourmetaRequest) SetLegalPersonCertName(v string) *CheckEpidentityFourmetaRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *CheckEpidentityFourmetaRequest) SetLegalPersonCertNo(v string) *CheckEpidentityFourmetaRequest {
	s.LegalPersonCertNo = &v
	return s
}

type CheckEpidentityFourmetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业状态。
	EnterpriseStatus *string `json:"enterprise_status,omitempty" xml:"enterprise_status,omitempty"`
	// 营业期限。
	OpenTime *string `json:"open_time,omitempty" xml:"open_time,omitempty"`
	// 核验是否通过。
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
	// 0:核验成功 1:企业信息有误 2:企业非正常营业
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
}

func (s CheckEpidentityFourmetaResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckEpidentityFourmetaResponse) GoString() string {
	return s.String()
}

func (s *CheckEpidentityFourmetaResponse) SetReqMsgId(v string) *CheckEpidentityFourmetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckEpidentityFourmetaResponse) SetResultCode(v string) *CheckEpidentityFourmetaResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckEpidentityFourmetaResponse) SetResultMsg(v string) *CheckEpidentityFourmetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckEpidentityFourmetaResponse) SetEnterpriseStatus(v string) *CheckEpidentityFourmetaResponse {
	s.EnterpriseStatus = &v
	return s
}

func (s *CheckEpidentityFourmetaResponse) SetOpenTime(v string) *CheckEpidentityFourmetaResponse {
	s.OpenTime = &v
	return s
}

func (s *CheckEpidentityFourmetaResponse) SetPassed(v bool) *CheckEpidentityFourmetaResponse {
	s.Passed = &v
	return s
}

func (s *CheckEpidentityFourmetaResponse) SetCode(v string) *CheckEpidentityFourmetaResponse {
	s.Code = &v
	return s
}

type CheckNotarizationOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 公证订单ID号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s CheckNotarizationOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckNotarizationOrderRequest) GoString() string {
	return s.String()
}

func (s *CheckNotarizationOrderRequest) SetAuthToken(v string) *CheckNotarizationOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckNotarizationOrderRequest) SetProductInstanceId(v string) *CheckNotarizationOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckNotarizationOrderRequest) SetOrderId(v string) *CheckNotarizationOrderRequest {
	s.OrderId = &v
	return s
}

type CheckNotarizationOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 下单的业务类型ID列表
	BizId []*string `json:"biz_id,omitempty" xml:"biz_id,omitempty" type:"Repeated"`
	// 实人认证接口调用授权码，与公证订单一一对应，有效次数默认为3次，超过调用次数则失效
	FaceAuthCode *string `json:"face_auth_code,omitempty" xml:"face_auth_code,omitempty"`
	// 下单客户的账号ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 是否为合法订单
	Valid *bool `json:"valid,omitempty" xml:"valid,omitempty"`
	// 平台公证机构ID
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty"`
}

func (s CheckNotarizationOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckNotarizationOrderResponse) GoString() string {
	return s.String()
}

func (s *CheckNotarizationOrderResponse) SetReqMsgId(v string) *CheckNotarizationOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckNotarizationOrderResponse) SetResultCode(v string) *CheckNotarizationOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckNotarizationOrderResponse) SetResultMsg(v string) *CheckNotarizationOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckNotarizationOrderResponse) SetBizId(v []*string) *CheckNotarizationOrderResponse {
	s.BizId = v
	return s
}

func (s *CheckNotarizationOrderResponse) SetFaceAuthCode(v string) *CheckNotarizationOrderResponse {
	s.FaceAuthCode = &v
	return s
}

func (s *CheckNotarizationOrderResponse) SetUserId(v string) *CheckNotarizationOrderResponse {
	s.UserId = &v
	return s
}

func (s *CheckNotarizationOrderResponse) SetValid(v bool) *CheckNotarizationOrderResponse {
	s.Valid = &v
	return s
}

func (s *CheckNotarizationOrderResponse) SetOrgId(v string) *CheckNotarizationOrderResponse {
	s.OrgId = &v
	return s
}

type UpdateNotarizationOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 公证订单ID
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 如果出证失败，需要给出失败原因
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty"`
	// 出证状态的枚举值
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s UpdateNotarizationOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateNotarizationOrderRequest) GoString() string {
	return s.String()
}

func (s *UpdateNotarizationOrderRequest) SetAuthToken(v string) *UpdateNotarizationOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateNotarizationOrderRequest) SetProductInstanceId(v string) *UpdateNotarizationOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateNotarizationOrderRequest) SetOrderId(v string) *UpdateNotarizationOrderRequest {
	s.OrderId = &v
	return s
}

func (s *UpdateNotarizationOrderRequest) SetReason(v string) *UpdateNotarizationOrderRequest {
	s.Reason = &v
	return s
}

func (s *UpdateNotarizationOrderRequest) SetStatus(v string) *UpdateNotarizationOrderRequest {
	s.Status = &v
	return s
}

type UpdateNotarizationOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态是否更新成功
	Accepted *bool `json:"accepted,omitempty" xml:"accepted,omitempty"`
	// 如更新失败，返回失败原因
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty"`
}

func (s UpdateNotarizationOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateNotarizationOrderResponse) GoString() string {
	return s.String()
}

func (s *UpdateNotarizationOrderResponse) SetReqMsgId(v string) *UpdateNotarizationOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateNotarizationOrderResponse) SetResultCode(v string) *UpdateNotarizationOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateNotarizationOrderResponse) SetResultMsg(v string) *UpdateNotarizationOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateNotarizationOrderResponse) SetAccepted(v bool) *UpdateNotarizationOrderResponse {
	s.Accepted = &v
	return s
}

func (s *UpdateNotarizationOrderResponse) SetReason(v string) *UpdateNotarizationOrderResponse {
	s.Reason = &v
	return s
}

type SetNotarizationOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 公证事项ID
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 需设置的属性名称
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// 公证订单ID
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 被设置字段的值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s SetNotarizationOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s SetNotarizationOrderRequest) GoString() string {
	return s.String()
}

func (s *SetNotarizationOrderRequest) SetAuthToken(v string) *SetNotarizationOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *SetNotarizationOrderRequest) SetProductInstanceId(v string) *SetNotarizationOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SetNotarizationOrderRequest) SetBizCode(v string) *SetNotarizationOrderRequest {
	s.BizCode = &v
	return s
}

func (s *SetNotarizationOrderRequest) SetKey(v string) *SetNotarizationOrderRequest {
	s.Key = &v
	return s
}

func (s *SetNotarizationOrderRequest) SetOrderId(v string) *SetNotarizationOrderRequest {
	s.OrderId = &v
	return s
}

func (s *SetNotarizationOrderRequest) SetValue(v string) *SetNotarizationOrderRequest {
	s.Value = &v
	return s
}

type SetNotarizationOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否设置成功
	Accepted *bool `json:"accepted,omitempty" xml:"accepted,omitempty"`
	// 如设置失败，返回失败原因
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty"`
}

func (s SetNotarizationOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s SetNotarizationOrderResponse) GoString() string {
	return s.String()
}

func (s *SetNotarizationOrderResponse) SetReqMsgId(v string) *SetNotarizationOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SetNotarizationOrderResponse) SetResultCode(v string) *SetNotarizationOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *SetNotarizationOrderResponse) SetResultMsg(v string) *SetNotarizationOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *SetNotarizationOrderResponse) SetAccepted(v bool) *SetNotarizationOrderResponse {
	s.Accepted = &v
	return s
}

func (s *SetNotarizationOrderResponse) SetReason(v string) *SetNotarizationOrderResponse {
	s.Reason = &v
	return s
}

type InitIdentificationFaceauthRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 认证人的姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 被验证者的身份证号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 授权码，针对某些特定场景使用，非必填
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty"`
}

func (s InitIdentificationFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s InitIdentificationFaceauthRequest) GoString() string {
	return s.String()
}

func (s *InitIdentificationFaceauthRequest) SetAuthToken(v string) *InitIdentificationFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *InitIdentificationFaceauthRequest) SetProductInstanceId(v string) *InitIdentificationFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitIdentificationFaceauthRequest) SetCertName(v string) *InitIdentificationFaceauthRequest {
	s.CertName = &v
	return s
}

func (s *InitIdentificationFaceauthRequest) SetCertNo(v string) *InitIdentificationFaceauthRequest {
	s.CertNo = &v
	return s
}

func (s *InitIdentificationFaceauthRequest) SetAuthCode(v string) *InitIdentificationFaceauthRequest {
	s.AuthCode = &v
	return s
}

type InitIdentificationFaceauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发起一个实人认证流程，获取到流程ID
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
}

func (s InitIdentificationFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s InitIdentificationFaceauthResponse) GoString() string {
	return s.String()
}

func (s *InitIdentificationFaceauthResponse) SetReqMsgId(v string) *InitIdentificationFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitIdentificationFaceauthResponse) SetResultCode(v string) *InitIdentificationFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *InitIdentificationFaceauthResponse) SetResultMsg(v string) *InitIdentificationFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitIdentificationFaceauthResponse) SetCertifyId(v string) *InitIdentificationFaceauthResponse {
	s.CertifyId = &v
	return s
}

type CertifyIdentificationFaceauthRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 实人认证流程ID
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
	// 认证流程结束回调通知地址，非必传
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 认证结束后跳转地址，非必填
	RedirectUrl *string `json:"redirect_url,omitempty" xml:"redirect_url,omitempty"`
	// 授权码，针对某些特定场景使用，非必填
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty"`
}

func (s CertifyIdentificationFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s CertifyIdentificationFaceauthRequest) GoString() string {
	return s.String()
}

func (s *CertifyIdentificationFaceauthRequest) SetAuthToken(v string) *CertifyIdentificationFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *CertifyIdentificationFaceauthRequest) SetProductInstanceId(v string) *CertifyIdentificationFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CertifyIdentificationFaceauthRequest) SetCertifyId(v string) *CertifyIdentificationFaceauthRequest {
	s.CertifyId = &v
	return s
}

func (s *CertifyIdentificationFaceauthRequest) SetCallbackUrl(v string) *CertifyIdentificationFaceauthRequest {
	s.CallbackUrl = &v
	return s
}

func (s *CertifyIdentificationFaceauthRequest) SetRedirectUrl(v string) *CertifyIdentificationFaceauthRequest {
	s.RedirectUrl = &v
	return s
}

func (s *CertifyIdentificationFaceauthRequest) SetAuthCode(v string) *CertifyIdentificationFaceauthRequest {
	s.AuthCode = &v
	return s
}

type CertifyIdentificationFaceauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实人认证流程ID
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 发起实人认证的地址
	VerifyUrl *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
}

func (s CertifyIdentificationFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s CertifyIdentificationFaceauthResponse) GoString() string {
	return s.String()
}

func (s *CertifyIdentificationFaceauthResponse) SetReqMsgId(v string) *CertifyIdentificationFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CertifyIdentificationFaceauthResponse) SetResultCode(v string) *CertifyIdentificationFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *CertifyIdentificationFaceauthResponse) SetResultMsg(v string) *CertifyIdentificationFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *CertifyIdentificationFaceauthResponse) SetCertifyId(v string) *CertifyIdentificationFaceauthResponse {
	s.CertifyId = &v
	return s
}

func (s *CertifyIdentificationFaceauthResponse) SetVerifyUrl(v string) *CertifyIdentificationFaceauthResponse {
	s.VerifyUrl = &v
	return s
}

type QueryIdentificationFaceauthRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 实人认证流程ID
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
	// 授权码，针对某些特定场景使用，非必填
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty"`
}

func (s QueryIdentificationFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIdentificationFaceauthRequest) GoString() string {
	return s.String()
}

func (s *QueryIdentificationFaceauthRequest) SetAuthToken(v string) *QueryIdentificationFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIdentificationFaceauthRequest) SetProductInstanceId(v string) *QueryIdentificationFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIdentificationFaceauthRequest) SetCertifyId(v string) *QueryIdentificationFaceauthRequest {
	s.CertifyId = &v
	return s
}

func (s *QueryIdentificationFaceauthRequest) SetAuthCode(v string) *QueryIdentificationFaceauthRequest {
	s.AuthCode = &v
	return s
}

type QueryIdentificationFaceauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实人认证流程ID
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 是否通过实人认证
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
}

func (s QueryIdentificationFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIdentificationFaceauthResponse) GoString() string {
	return s.String()
}

func (s *QueryIdentificationFaceauthResponse) SetReqMsgId(v string) *QueryIdentificationFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIdentificationFaceauthResponse) SetResultCode(v string) *QueryIdentificationFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIdentificationFaceauthResponse) SetResultMsg(v string) *QueryIdentificationFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIdentificationFaceauthResponse) SetCertifyId(v string) *QueryIdentificationFaceauthResponse {
	s.CertifyId = &v
	return s
}

func (s *QueryIdentificationFaceauthResponse) SetPassed(v bool) *QueryIdentificationFaceauthResponse {
	s.Passed = &v
	return s
}

type QueryEnterpriseFaceauthRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业法人认证查询
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
}

func (s QueryEnterpriseFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEnterpriseFaceauthRequest) GoString() string {
	return s.String()
}

func (s *QueryEnterpriseFaceauthRequest) SetAuthToken(v string) *QueryEnterpriseFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEnterpriseFaceauthRequest) SetProductInstanceId(v string) *QueryEnterpriseFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEnterpriseFaceauthRequest) SetBizNo(v string) *QueryEnterpriseFaceauthRequest {
	s.BizNo = &v
	return s
}

type QueryEnterpriseFaceauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证唯一性标识
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 认证失败错误码
	FailedCode *string `json:"failed_code,omitempty" xml:"failed_code,omitempty"`
	// 认证是否通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
}

func (s QueryEnterpriseFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEnterpriseFaceauthResponse) GoString() string {
	return s.String()
}

func (s *QueryEnterpriseFaceauthResponse) SetReqMsgId(v string) *QueryEnterpriseFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEnterpriseFaceauthResponse) SetResultCode(v string) *QueryEnterpriseFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEnterpriseFaceauthResponse) SetResultMsg(v string) *QueryEnterpriseFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEnterpriseFaceauthResponse) SetBizNo(v string) *QueryEnterpriseFaceauthResponse {
	s.BizNo = &v
	return s
}

func (s *QueryEnterpriseFaceauthResponse) SetFailedCode(v string) *QueryEnterpriseFaceauthResponse {
	s.FailedCode = &v
	return s
}

func (s *QueryEnterpriseFaceauthResponse) SetPassed(v bool) *QueryEnterpriseFaceauthResponse {
	s.Passed = &v
	return s
}

type InitEnterpriseFaceauthRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty" require:"true"`
	// 企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
	// 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
	EpCertType *string `json:"ep_cert_type,omitempty" xml:"ep_cert_type,omitempty" require:"true"`
	// 企业法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty" require:"true"`
	// 企业法人身份证号（目前仅支持身份证号）
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty" require:"true"`
}

func (s InitEnterpriseFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s InitEnterpriseFaceauthRequest) GoString() string {
	return s.String()
}

func (s *InitEnterpriseFaceauthRequest) SetAuthToken(v string) *InitEnterpriseFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *InitEnterpriseFaceauthRequest) SetProductInstanceId(v string) *InitEnterpriseFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitEnterpriseFaceauthRequest) SetEpCertName(v string) *InitEnterpriseFaceauthRequest {
	s.EpCertName = &v
	return s
}

func (s *InitEnterpriseFaceauthRequest) SetEpCertNo(v string) *InitEnterpriseFaceauthRequest {
	s.EpCertNo = &v
	return s
}

func (s *InitEnterpriseFaceauthRequest) SetEpCertType(v string) *InitEnterpriseFaceauthRequest {
	s.EpCertType = &v
	return s
}

func (s *InitEnterpriseFaceauthRequest) SetLegalPersonCertName(v string) *InitEnterpriseFaceauthRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *InitEnterpriseFaceauthRequest) SetLegalPersonCertNo(v string) *InitEnterpriseFaceauthRequest {
	s.LegalPersonCertNo = &v
	return s
}

type InitEnterpriseFaceauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 本次认证的业务唯一性标示
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
}

func (s InitEnterpriseFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s InitEnterpriseFaceauthResponse) GoString() string {
	return s.String()
}

func (s *InitEnterpriseFaceauthResponse) SetReqMsgId(v string) *InitEnterpriseFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitEnterpriseFaceauthResponse) SetResultCode(v string) *InitEnterpriseFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *InitEnterpriseFaceauthResponse) SetResultMsg(v string) *InitEnterpriseFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitEnterpriseFaceauthResponse) SetBizNo(v string) *InitEnterpriseFaceauthResponse {
	s.BizNo = &v
	return s
}

type CertifyEnterpriseFaceauthRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务唯一性标识
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// 回调通知地址
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 认证完成后回跳地址
	RedirectUrl *string `json:"redirect_url,omitempty" xml:"redirect_url,omitempty"`
}

func (s CertifyEnterpriseFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s CertifyEnterpriseFaceauthRequest) GoString() string {
	return s.String()
}

func (s *CertifyEnterpriseFaceauthRequest) SetAuthToken(v string) *CertifyEnterpriseFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *CertifyEnterpriseFaceauthRequest) SetProductInstanceId(v string) *CertifyEnterpriseFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CertifyEnterpriseFaceauthRequest) SetBizNo(v string) *CertifyEnterpriseFaceauthRequest {
	s.BizNo = &v
	return s
}

func (s *CertifyEnterpriseFaceauthRequest) SetCallbackUrl(v string) *CertifyEnterpriseFaceauthRequest {
	s.CallbackUrl = &v
	return s
}

func (s *CertifyEnterpriseFaceauthRequest) SetRedirectUrl(v string) *CertifyEnterpriseFaceauthRequest {
	s.RedirectUrl = &v
	return s
}

type CertifyEnterpriseFaceauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务唯一性标识
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 认证 url
	VerifyUrl *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
}

func (s CertifyEnterpriseFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s CertifyEnterpriseFaceauthResponse) GoString() string {
	return s.String()
}

func (s *CertifyEnterpriseFaceauthResponse) SetReqMsgId(v string) *CertifyEnterpriseFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CertifyEnterpriseFaceauthResponse) SetResultCode(v string) *CertifyEnterpriseFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *CertifyEnterpriseFaceauthResponse) SetResultMsg(v string) *CertifyEnterpriseFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *CertifyEnterpriseFaceauthResponse) SetBizNo(v string) *CertifyEnterpriseFaceauthResponse {
	s.BizNo = &v
	return s
}

func (s *CertifyEnterpriseFaceauthResponse) SetVerifyUrl(v string) *CertifyEnterpriseFaceauthResponse {
	s.VerifyUrl = &v
	return s
}

type CreateLeaseOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 账号标识，可弃用
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 支付宝交易金额
	AlipayOrderAmount *int64 `json:"alipay_order_amount,omitempty" xml:"alipay_order_amount,omitempty" require:"true" minimum:"0"`
	// 支付宝订单号
	AlipayOrderNo *string `json:"alipay_order_no,omitempty" xml:"alipay_order_no,omitempty" require:"true"`
	// 支付宝交易总金额
	AlipayOrderTotalAmount *int64 `json:"alipay_order_total_amount,omitempty" xml:"alipay_order_total_amount,omitempty" require:"true" minimum:"0"`
	// 免押金额
	DepositWaiveAmount *int64 `json:"deposit_waive_amount,omitempty" xml:"deposit_waive_amount,omitempty" require:"true" minimum:"0"`
	// 订单总保额，单位分，insured为True时必填
	InsuranceCoverage *int64 `json:"insurance_coverage,omitempty" xml:"insurance_coverage,omitempty" minimum:"0"`
	// 保单号，insured为True时必填，仅支持数字和字母
	InsuranceOrderNo *string `json:"insurance_order_no,omitempty" xml:"insurance_order_no,omitempty"`
	// 商品名称
	ItemName *string `json:"item_name,omitempty" xml:"item_name,omitempty" require:"true"`
	// 商品市场价格
	ItemPrice *int64 `json:"item_price,omitempty" xml:"item_price,omitempty" require:"true" minimum:"0"`
	// 商品类目
	ItemType *string `json:"item_type,omitempty" xml:"item_type,omitempty" require:"true"`
	// 商户支付宝账号
	MerchantAlipayAccount *string `json:"merchant_alipay_account,omitempty" xml:"merchant_alipay_account,omitempty" require:"true"`
	// 商户支付宝ID
	MerchantAlipayId *string `json:"merchant_alipay_id,omitempty" xml:"merchant_alipay_id,omitempty" require:"true"`
	// 商户名称
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty" require:"true"`
	// 商户单号
	MerchantOrderNo *string `json:"merchant_order_no,omitempty" xml:"merchant_order_no,omitempty"`
	// 支付渠道，包括支付宝（Alipay）、第三方收单机构（ThirdParty）、信用卡（CreditCard）、银行转账（BankTransfer）、微信（WeChatPay）、其他（Other）
	PaymentChannel *string `json:"payment_channel,omitempty" xml:"payment_channel,omitempty"`
	// 租约结束日期
	TenancyTermEnd *int64 `json:"tenancy_term_end,omitempty" xml:"tenancy_term_end,omitempty" require:"true" minimum:"0"`
	// 租约起始日期
	TenancyTermStart *int64 `json:"tenancy_term_start,omitempty" xml:"tenancy_term_start,omitempty" require:"true" minimum:"0"`
	// 是否投保，默认为True
	Insured *bool `json:"insured,omitempty" xml:"insured,omitempty"`
	// 保单查询地址，insured为True时必填
	InsuranceOrderUrl *string `json:"insurance_order_url,omitempty" xml:"insurance_order_url,omitempty"`
	// 保险缴费单号，insured为True时必填，仅支持数字和字母，长度20
	InsuranceBillNo *string `json:"insurance_bill_no,omitempty" xml:"insurance_bill_no,omitempty"`
	// 保险缴费北京时间，格式为"YYYYMMDDHHMISS"，时区为UTC+8
	InsuranceBillTime *string `json:"insurance_bill_time,omitempty" xml:"insurance_bill_time,omitempty"`
	// 保险缴费金额，单位分
	InsuranceBillAmount *int64 `json:"insurance_bill_amount,omitempty" xml:"insurance_bill_amount,omitempty"`
	// 订单产品保额，单位分，insured为True时必填
	InsuranceProductCoverage *int64 `json:"insurance_product_coverage,omitempty" xml:"insurance_product_coverage,omitempty"`
}

func (s CreateLeaseOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseOrderRequest) GoString() string {
	return s.String()
}

func (s *CreateLeaseOrderRequest) SetAuthToken(v string) *CreateLeaseOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeaseOrderRequest) SetProductInstanceId(v string) *CreateLeaseOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeaseOrderRequest) SetAccountId(v string) *CreateLeaseOrderRequest {
	s.AccountId = &v
	return s
}

func (s *CreateLeaseOrderRequest) SetAlipayOrderAmount(v int64) *CreateLeaseOrderRequest {
	s.AlipayOrderAmount = &v
	return s
}

func (s *CreateLeaseOrderRequest) SetAlipayOrderNo(v string) *CreateLeaseOrderRequest {
	s.AlipayOrderNo = &v
	return s
}

func (s *CreateLeaseOrderRequest) SetAlipayOrderTotalAmount(v int64) *CreateLeaseOrderRequest {
	s.AlipayOrderTotalAmount = &v
	return s
}

func (s *CreateLeaseOrderRequest) SetDepositWaiveAmount(v int64) *CreateLeaseOrderRequest {
	s.DepositWaiveAmount = &v
	return s
}

func (s *CreateLeaseOrderRequest) SetInsuranceCoverage(v int64) *CreateLeaseOrderRequest {
	s.InsuranceCoverage = &v
	return s
}

func (s *CreateLeaseOrderRequest) SetInsuranceOrderNo(v string) *CreateLeaseOrderRequest {
	s.InsuranceOrderNo = &v
	return s
}

func (s *CreateLeaseOrderRequest) SetItemName(v string) *CreateLeaseOrderRequest {
	s.ItemName = &v
	return s
}

func (s *CreateLeaseOrderRequest) SetItemPrice(v int64) *CreateLeaseOrderRequest {
	s.ItemPrice = &v
	return s
}

func (s *CreateLeaseOrderRequest) SetItemType(v string) *CreateLeaseOrderRequest {
	s.ItemType = &v
	return s
}

func (s *CreateLeaseOrderRequest) SetMerchantAlipayAccount(v string) *CreateLeaseOrderRequest {
	s.MerchantAlipayAccount = &v
	return s
}

func (s *CreateLeaseOrderRequest) SetMerchantAlipayId(v string) *CreateLeaseOrderRequest {
	s.MerchantAlipayId = &v
	return s
}

func (s *CreateLeaseOrderRequest) SetMerchantName(v string) *CreateLeaseOrderRequest {
	s.MerchantName = &v
	return s
}

func (s *CreateLeaseOrderRequest) SetMerchantOrderNo(v string) *CreateLeaseOrderRequest {
	s.MerchantOrderNo = &v
	return s
}

func (s *CreateLeaseOrderRequest) SetPaymentChannel(v string) *CreateLeaseOrderRequest {
	s.PaymentChannel = &v
	return s
}

func (s *CreateLeaseOrderRequest) SetTenancyTermEnd(v int64) *CreateLeaseOrderRequest {
	s.TenancyTermEnd = &v
	return s
}

func (s *CreateLeaseOrderRequest) SetTenancyTermStart(v int64) *CreateLeaseOrderRequest {
	s.TenancyTermStart = &v
	return s
}

func (s *CreateLeaseOrderRequest) SetInsured(v bool) *CreateLeaseOrderRequest {
	s.Insured = &v
	return s
}

func (s *CreateLeaseOrderRequest) SetInsuranceOrderUrl(v string) *CreateLeaseOrderRequest {
	s.InsuranceOrderUrl = &v
	return s
}

func (s *CreateLeaseOrderRequest) SetInsuranceBillNo(v string) *CreateLeaseOrderRequest {
	s.InsuranceBillNo = &v
	return s
}

func (s *CreateLeaseOrderRequest) SetInsuranceBillTime(v string) *CreateLeaseOrderRequest {
	s.InsuranceBillTime = &v
	return s
}

func (s *CreateLeaseOrderRequest) SetInsuranceBillAmount(v int64) *CreateLeaseOrderRequest {
	s.InsuranceBillAmount = &v
	return s
}

func (s *CreateLeaseOrderRequest) SetInsuranceProductCoverage(v int64) *CreateLeaseOrderRequest {
	s.InsuranceProductCoverage = &v
	return s
}

type CreateLeaseOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s CreateLeaseOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseOrderResponse) GoString() string {
	return s.String()
}

func (s *CreateLeaseOrderResponse) SetReqMsgId(v string) *CreateLeaseOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeaseOrderResponse) SetResultCode(v string) *CreateLeaseOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeaseOrderResponse) SetResultMsg(v string) *CreateLeaseOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeaseOrderResponse) SetSuccess(v bool) *CreateLeaseOrderResponse {
	s.Success = &v
	return s
}

type CreateNotarizationBillRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 支付宝交易订单号
	AlipayOrderNo *string `json:"alipay_order_no,omitempty" xml:"alipay_order_no,omitempty"`
	// 支付宝用户ID
	AlipayUid *string `json:"alipay_uid,omitempty" xml:"alipay_uid,omitempty"`
	// 申请者名称
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 申请者证件号码：身份证号码（个人用户）或企业统一社会信用代码（企业用户）
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 电子公证书业务细项，如“200”对应出生公证
	ENotarizationBiz *string `json:"e_notarization_biz,omitempty" xml:"e_notarization_biz,omitempty"`
	// 电子公证书下载地址
	ENotarizationDownloadUrl *string `json:"e_notarization_download_url,omitempty" xml:"e_notarization_download_url,omitempty"`
	// 电子公证书编号
	ENotarizationNo *string `json:"e_notarization_no,omitempty" xml:"e_notarization_no,omitempty"`
	// 电子公证书页数
	ENotarizationPageNo *string `json:"e_notarization_page_no,omitempty" xml:"e_notarization_page_no,omitempty"`
	// 电子公证书状态码
	ENotarizationStatus *string `json:"e_notarization_status,omitempty" xml:"e_notarization_status,omitempty"`
	// 电子公证书业务用途
	ENotarizationUsage *string `json:"e_notarization_usage,omitempty" xml:"e_notarization_usage,omitempty"`
	// 电子公证书有效期
	ENotarizationValidDate *string `json:"e_notarization_valid_date,omitempty" xml:"e_notarization_valid_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 企业法人姓名（企业用户必填）
	LegalPersonName *string `json:"legal_person_name,omitempty" xml:"legal_person_name,omitempty"`
	// 出证订单ID
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 出证机构ID
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty"`
	// 支付宝交易订单支付金额（人民币），单位为分
	PaymentAmount *int64 `json:"payment_amount,omitempty" xml:"payment_amount,omitempty"`
	// 联系电话
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty"`
	// 场景枚举：E_NOTARIZATION（电子公证），NOTARY_CERTIFICATION（存证证明）
	Scenario *string `json:"scenario,omitempty" xml:"scenario,omitempty" require:"true"`
	// 申请者身份类型，1个人，2企业
	UserType *int64 `json:"user_type,omitempty" xml:"user_type,omitempty"`
	// 是否为酬金分润方式，是则按照订金额一定比例分润，否则直接支付订单金额
	FeeSplitting *bool `json:"fee_splitting,omitempty" xml:"fee_splitting,omitempty" require:"true"`
}

func (s CreateNotarizationBillRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateNotarizationBillRequest) GoString() string {
	return s.String()
}

func (s *CreateNotarizationBillRequest) SetAuthToken(v string) *CreateNotarizationBillRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateNotarizationBillRequest) SetProductInstanceId(v string) *CreateNotarizationBillRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateNotarizationBillRequest) SetAlipayOrderNo(v string) *CreateNotarizationBillRequest {
	s.AlipayOrderNo = &v
	return s
}

func (s *CreateNotarizationBillRequest) SetAlipayUid(v string) *CreateNotarizationBillRequest {
	s.AlipayUid = &v
	return s
}

func (s *CreateNotarizationBillRequest) SetCertName(v string) *CreateNotarizationBillRequest {
	s.CertName = &v
	return s
}

func (s *CreateNotarizationBillRequest) SetCertNo(v string) *CreateNotarizationBillRequest {
	s.CertNo = &v
	return s
}

func (s *CreateNotarizationBillRequest) SetENotarizationBiz(v string) *CreateNotarizationBillRequest {
	s.ENotarizationBiz = &v
	return s
}

func (s *CreateNotarizationBillRequest) SetENotarizationDownloadUrl(v string) *CreateNotarizationBillRequest {
	s.ENotarizationDownloadUrl = &v
	return s
}

func (s *CreateNotarizationBillRequest) SetENotarizationNo(v string) *CreateNotarizationBillRequest {
	s.ENotarizationNo = &v
	return s
}

func (s *CreateNotarizationBillRequest) SetENotarizationPageNo(v string) *CreateNotarizationBillRequest {
	s.ENotarizationPageNo = &v
	return s
}

func (s *CreateNotarizationBillRequest) SetENotarizationStatus(v string) *CreateNotarizationBillRequest {
	s.ENotarizationStatus = &v
	return s
}

func (s *CreateNotarizationBillRequest) SetENotarizationUsage(v string) *CreateNotarizationBillRequest {
	s.ENotarizationUsage = &v
	return s
}

func (s *CreateNotarizationBillRequest) SetENotarizationValidDate(v string) *CreateNotarizationBillRequest {
	s.ENotarizationValidDate = &v
	return s
}

func (s *CreateNotarizationBillRequest) SetLegalPersonName(v string) *CreateNotarizationBillRequest {
	s.LegalPersonName = &v
	return s
}

func (s *CreateNotarizationBillRequest) SetOrderId(v string) *CreateNotarizationBillRequest {
	s.OrderId = &v
	return s
}

func (s *CreateNotarizationBillRequest) SetOrgId(v string) *CreateNotarizationBillRequest {
	s.OrgId = &v
	return s
}

func (s *CreateNotarizationBillRequest) SetPaymentAmount(v int64) *CreateNotarizationBillRequest {
	s.PaymentAmount = &v
	return s
}

func (s *CreateNotarizationBillRequest) SetPhone(v string) *CreateNotarizationBillRequest {
	s.Phone = &v
	return s
}

func (s *CreateNotarizationBillRequest) SetScenario(v string) *CreateNotarizationBillRequest {
	s.Scenario = &v
	return s
}

func (s *CreateNotarizationBillRequest) SetUserType(v int64) *CreateNotarizationBillRequest {
	s.UserType = &v
	return s
}

func (s *CreateNotarizationBillRequest) SetFeeSplitting(v bool) *CreateNotarizationBillRequest {
	s.FeeSplitting = &v
	return s
}

type CreateNotarizationBillResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 计费订单是否创建成功
	Accepted *bool `json:"accepted,omitempty" xml:"accepted,omitempty"`
}

func (s CreateNotarizationBillResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateNotarizationBillResponse) GoString() string {
	return s.String()
}

func (s *CreateNotarizationBillResponse) SetReqMsgId(v string) *CreateNotarizationBillResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateNotarizationBillResponse) SetResultCode(v string) *CreateNotarizationBillResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateNotarizationBillResponse) SetResultMsg(v string) *CreateNotarizationBillResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateNotarizationBillResponse) SetAccepted(v bool) *CreateNotarizationBillResponse {
	s.Accepted = &v
	return s
}

type InitCertificationRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 申请人的身份信息
	Applier *Identity `json:"applier,omitempty" xml:"applier,omitempty" require:"true"`
	// 存证证明所要展示的存证信息，可填多个
	NotaryInfo []*NotaryInfo `json:"notary_info,omitempty" xml:"notary_info,omitempty" require:"true" type:"Repeated"`
	// 存证证明的类型：STANDARD（标准存证证明）或COPYRIGHT（版权存证证明），默认为COPYRIGHT
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s InitCertificationRequest) String() string {
	return tea.Prettify(s)
}

func (s InitCertificationRequest) GoString() string {
	return s.String()
}

func (s *InitCertificationRequest) SetAuthToken(v string) *InitCertificationRequest {
	s.AuthToken = &v
	return s
}

func (s *InitCertificationRequest) SetProductInstanceId(v string) *InitCertificationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitCertificationRequest) SetApplier(v *Identity) *InitCertificationRequest {
	s.Applier = v
	return s
}

func (s *InitCertificationRequest) SetNotaryInfo(v []*NotaryInfo) *InitCertificationRequest {
	s.NotaryInfo = v
	return s
}

func (s *InitCertificationRequest) SetType(v string) *InitCertificationRequest {
	s.Type = &v
	return s
}

type InitCertificationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回值状态码，0000则为成功
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 异常状态时的错误信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 后端生成的存证证明申请订单ID
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 如果是记账模式则为空，其余情况返回支付宝SDK生成的支付内容信息
	PayContent *string `json:"pay_content,omitempty" xml:"pay_content,omitempty"`
}

func (s InitCertificationResponse) String() string {
	return tea.Prettify(s)
}

func (s InitCertificationResponse) GoString() string {
	return s.String()
}

func (s *InitCertificationResponse) SetReqMsgId(v string) *InitCertificationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitCertificationResponse) SetResultCode(v string) *InitCertificationResponse {
	s.ResultCode = &v
	return s
}

func (s *InitCertificationResponse) SetResultMsg(v string) *InitCertificationResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitCertificationResponse) SetCode(v string) *InitCertificationResponse {
	s.Code = &v
	return s
}

func (s *InitCertificationResponse) SetMessage(v string) *InitCertificationResponse {
	s.Message = &v
	return s
}

func (s *InitCertificationResponse) SetOrderId(v string) *InitCertificationResponse {
	s.OrderId = &v
	return s
}

func (s *InitCertificationResponse) SetPayContent(v string) *InitCertificationResponse {
	s.PayContent = &v
	return s
}

type QueryCertificationRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 存证证明申请的订单ID
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s QueryCertificationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCertificationRequest) GoString() string {
	return s.String()
}

func (s *QueryCertificationRequest) SetAuthToken(v string) *QueryCertificationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCertificationRequest) SetProductInstanceId(v string) *QueryCertificationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCertificationRequest) SetOrderId(v string) *QueryCertificationRequest {
	s.OrderId = &v
	return s
}

type QueryCertificationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证证明的证书信息列表
	CertificateInfo []*CertificateInfo `json:"certificate_info,omitempty" xml:"certificate_info,omitempty" type:"Repeated"`
	// 返回值状态码，0000则为成功
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 异常状态时的错误信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s QueryCertificationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCertificationResponse) GoString() string {
	return s.String()
}

func (s *QueryCertificationResponse) SetReqMsgId(v string) *QueryCertificationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCertificationResponse) SetResultCode(v string) *QueryCertificationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCertificationResponse) SetResultMsg(v string) *QueryCertificationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCertificationResponse) SetCertificateInfo(v []*CertificateInfo) *QueryCertificationResponse {
	s.CertificateInfo = v
	return s
}

func (s *QueryCertificationResponse) SetCode(v string) *QueryCertificationResponse {
	s.Code = &v
	return s
}

func (s *QueryCertificationResponse) SetMessage(v string) *QueryCertificationResponse {
	s.Message = &v
	return s
}

type GetTsrCertificateRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s GetTsrCertificateRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTsrCertificateRequest) GoString() string {
	return s.String()
}

func (s *GetTsrCertificateRequest) SetAuthToken(v string) *GetTsrCertificateRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTsrCertificateRequest) SetProductInstanceId(v string) *GetTsrCertificateRequest {
	s.ProductInstanceId = &v
	return s
}

type GetTsrCertificateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s GetTsrCertificateResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTsrCertificateResponse) GoString() string {
	return s.String()
}

func (s *GetTsrCertificateResponse) SetReqMsgId(v string) *GetTsrCertificateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTsrCertificateResponse) SetResultCode(v string) *GetTsrCertificateResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTsrCertificateResponse) SetResultMsg(v string) *GetTsrCertificateResponse {
	s.ResultMsg = &v
	return s
}

type SaveJointconstraintRecordRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 收款账户
	BeneficiaryAccountCode *string `json:"beneficiary_account_code,omitempty" xml:"beneficiary_account_code,omitempty"`
	// 收款账户类型
	//
	// 1：支付宝
	BeneficiaryAccountType *int64 `json:"beneficiary_account_type,omitempty" xml:"beneficiary_account_type,omitempty"`
	// 应收方证件号码
	//
	//
	BeneficiaryCertNumber *string `json:"beneficiary_cert_number,omitempty" xml:"beneficiary_cert_number,omitempty" require:"true"`
	// 应收方证件类型
	//
	// 0：统一社会信用代码
	//
	// 1：身份证号码
	BeneficiaryCertType *int64 `json:"beneficiary_cert_type,omitempty" xml:"beneficiary_cert_type,omitempty" require:"true"`
	//
	// 应收方类型
	//
	// 0：企业
	//
	// 1：个人
	BeneficiaryType *int64 `json:"beneficiary_type,omitempty" xml:"beneficiary_type,omitempty" require:"true"`
	// 合同编号
	ContractCode *string `json:"contract_code,omitempty" xml:"contract_code,omitempty" require:"true"`
	// 合同履行记录标签
	ContractFulfillmentCode *string `json:"contract_fulfillment_code,omitempty" xml:"contract_fulfillment_code,omitempty" require:"true"`
	// 合同名称
	ContractName *string `json:"contract_name,omitempty" xml:"contract_name,omitempty" require:"true"`
	// 合同存证哈希
	ContractTxhash *string `json:"contract_txhash,omitempty" xml:"contract_txhash,omitempty" require:"true"`
	// 商户端合同链接
	//
	// 从智能合同小程序中跳转至商户端查看合同内容链接
	ExternalUrl *string `json:"external_url,omitempty" xml:"external_url,omitempty"`
	// 所属行业，来自合同
	//
	//
	IndustryCode *string `json:"industry_code,omitempty" xml:"industry_code,omitempty"`
	// 已付金额
	//
	//
	PaidAmount *string `json:"paid_amount,omitempty" xml:"paid_amount,omitempty"`
	// 支付凭据
	//
	//
	PaidProof *string `json:"paid_proof,omitempty" xml:"paid_proof,omitempty"`
	// 付款时间
	//
	//
	PaidTime *string `json:"paid_time,omitempty" xml:"paid_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 付款账户
	//
	//
	PayerAccountCode *string `json:"payer_account_code,omitempty" xml:"payer_account_code,omitempty"`
	//
	// 付款账户类型
	//
	// 1：支付宝
	PayerAccountType *int64 `json:"payer_account_type,omitempty" xml:"payer_account_type,omitempty"`
	// 应付方证件号码
	//
	//
	PayerCertNumber *string `json:"payer_cert_number,omitempty" xml:"payer_cert_number,omitempty" require:"true"`
	// 应付方证件类型
	//
	// 0：统一社会信用代码
	//
	// 1：身份证号码
	PayerCertType *int64 `json:"payer_cert_type,omitempty" xml:"payer_cert_type,omitempty" require:"true"`
	// 应付方类型
	//
	// 0：企业
	//
	// 1：个人
	PayerType *int64 `json:"payer_type,omitempty" xml:"payer_type,omitempty" require:"true"`
	// 履约标的金额
	//
	//
	PaymentAmount *string `json:"payment_amount,omitempty" xml:"payment_amount,omitempty" require:"true"`
	// 履约宽限期，单位：天
	//
	//
	PaymentDateBuffer *int64 `json:"payment_date_buffer,omitempty" xml:"payment_date_buffer,omitempty"`
	// 目标履约日期
	//
	//
	PaymentDeadline *string `json:"payment_deadline,omitempty" xml:"payment_deadline,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s SaveJointconstraintRecordRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveJointconstraintRecordRequest) GoString() string {
	return s.String()
}

func (s *SaveJointconstraintRecordRequest) SetAuthToken(v string) *SaveJointconstraintRecordRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveJointconstraintRecordRequest) SetProductInstanceId(v string) *SaveJointconstraintRecordRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveJointconstraintRecordRequest) SetBeneficiaryAccountCode(v string) *SaveJointconstraintRecordRequest {
	s.BeneficiaryAccountCode = &v
	return s
}

func (s *SaveJointconstraintRecordRequest) SetBeneficiaryAccountType(v int64) *SaveJointconstraintRecordRequest {
	s.BeneficiaryAccountType = &v
	return s
}

func (s *SaveJointconstraintRecordRequest) SetBeneficiaryCertNumber(v string) *SaveJointconstraintRecordRequest {
	s.BeneficiaryCertNumber = &v
	return s
}

func (s *SaveJointconstraintRecordRequest) SetBeneficiaryCertType(v int64) *SaveJointconstraintRecordRequest {
	s.BeneficiaryCertType = &v
	return s
}

func (s *SaveJointconstraintRecordRequest) SetBeneficiaryType(v int64) *SaveJointconstraintRecordRequest {
	s.BeneficiaryType = &v
	return s
}

func (s *SaveJointconstraintRecordRequest) SetContractCode(v string) *SaveJointconstraintRecordRequest {
	s.ContractCode = &v
	return s
}

func (s *SaveJointconstraintRecordRequest) SetContractFulfillmentCode(v string) *SaveJointconstraintRecordRequest {
	s.ContractFulfillmentCode = &v
	return s
}

func (s *SaveJointconstraintRecordRequest) SetContractName(v string) *SaveJointconstraintRecordRequest {
	s.ContractName = &v
	return s
}

func (s *SaveJointconstraintRecordRequest) SetContractTxhash(v string) *SaveJointconstraintRecordRequest {
	s.ContractTxhash = &v
	return s
}

func (s *SaveJointconstraintRecordRequest) SetExternalUrl(v string) *SaveJointconstraintRecordRequest {
	s.ExternalUrl = &v
	return s
}

func (s *SaveJointconstraintRecordRequest) SetIndustryCode(v string) *SaveJointconstraintRecordRequest {
	s.IndustryCode = &v
	return s
}

func (s *SaveJointconstraintRecordRequest) SetPaidAmount(v string) *SaveJointconstraintRecordRequest {
	s.PaidAmount = &v
	return s
}

func (s *SaveJointconstraintRecordRequest) SetPaidProof(v string) *SaveJointconstraintRecordRequest {
	s.PaidProof = &v
	return s
}

func (s *SaveJointconstraintRecordRequest) SetPaidTime(v string) *SaveJointconstraintRecordRequest {
	s.PaidTime = &v
	return s
}

func (s *SaveJointconstraintRecordRequest) SetPayerAccountCode(v string) *SaveJointconstraintRecordRequest {
	s.PayerAccountCode = &v
	return s
}

func (s *SaveJointconstraintRecordRequest) SetPayerAccountType(v int64) *SaveJointconstraintRecordRequest {
	s.PayerAccountType = &v
	return s
}

func (s *SaveJointconstraintRecordRequest) SetPayerCertNumber(v string) *SaveJointconstraintRecordRequest {
	s.PayerCertNumber = &v
	return s
}

func (s *SaveJointconstraintRecordRequest) SetPayerCertType(v int64) *SaveJointconstraintRecordRequest {
	s.PayerCertType = &v
	return s
}

func (s *SaveJointconstraintRecordRequest) SetPayerType(v int64) *SaveJointconstraintRecordRequest {
	s.PayerType = &v
	return s
}

func (s *SaveJointconstraintRecordRequest) SetPaymentAmount(v string) *SaveJointconstraintRecordRequest {
	s.PaymentAmount = &v
	return s
}

func (s *SaveJointconstraintRecordRequest) SetPaymentDateBuffer(v int64) *SaveJointconstraintRecordRequest {
	s.PaymentDateBuffer = &v
	return s
}

func (s *SaveJointconstraintRecordRequest) SetPaymentDeadline(v string) *SaveJointconstraintRecordRequest {
	s.PaymentDeadline = &v
	return s
}

type SaveJointconstraintRecordResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SaveJointconstraintRecordResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveJointconstraintRecordResponse) GoString() string {
	return s.String()
}

func (s *SaveJointconstraintRecordResponse) SetReqMsgId(v string) *SaveJointconstraintRecordResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveJointconstraintRecordResponse) SetResultCode(v string) *SaveJointconstraintRecordResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveJointconstraintRecordResponse) SetResultMsg(v string) *SaveJointconstraintRecordResponse {
	s.ResultMsg = &v
	return s
}

type DeleteJointconstraintRecordRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合同编号
	//
	//
	ContractCode *string `json:"contract_code,omitempty" xml:"contract_code,omitempty" require:"true"`
	// 合同履行记录标签
	//
	//
	ContractFulfillmentCode *string `json:"contract_fulfillment_code,omitempty" xml:"contract_fulfillment_code,omitempty" require:"true"`
	// 应付方证件号码
	//
	//
	PayerCertNumber *string `json:"payer_cert_number,omitempty" xml:"payer_cert_number,omitempty" require:"true"`
	// 应付方证件类型
	//
	// 0：统一社会信用代码
	//
	// 1：身份证号码
	PayerCertType *int64 `json:"payer_cert_type,omitempty" xml:"payer_cert_type,omitempty" require:"true"`
	// 应付方类型
	//
	// 0：企业
	//
	// 1：个人
	PayerType *int64 `json:"payer_type,omitempty" xml:"payer_type,omitempty" require:"true"`
}

func (s DeleteJointconstraintRecordRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteJointconstraintRecordRequest) GoString() string {
	return s.String()
}

func (s *DeleteJointconstraintRecordRequest) SetAuthToken(v string) *DeleteJointconstraintRecordRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteJointconstraintRecordRequest) SetProductInstanceId(v string) *DeleteJointconstraintRecordRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteJointconstraintRecordRequest) SetContractCode(v string) *DeleteJointconstraintRecordRequest {
	s.ContractCode = &v
	return s
}

func (s *DeleteJointconstraintRecordRequest) SetContractFulfillmentCode(v string) *DeleteJointconstraintRecordRequest {
	s.ContractFulfillmentCode = &v
	return s
}

func (s *DeleteJointconstraintRecordRequest) SetPayerCertNumber(v string) *DeleteJointconstraintRecordRequest {
	s.PayerCertNumber = &v
	return s
}

func (s *DeleteJointconstraintRecordRequest) SetPayerCertType(v int64) *DeleteJointconstraintRecordRequest {
	s.PayerCertType = &v
	return s
}

func (s *DeleteJointconstraintRecordRequest) SetPayerType(v int64) *DeleteJointconstraintRecordRequest {
	s.PayerType = &v
	return s
}

type DeleteJointconstraintRecordResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteJointconstraintRecordResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteJointconstraintRecordResponse) GoString() string {
	return s.String()
}

func (s *DeleteJointconstraintRecordResponse) SetReqMsgId(v string) *DeleteJointconstraintRecordResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteJointconstraintRecordResponse) SetResultCode(v string) *DeleteJointconstraintRecordResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteJointconstraintRecordResponse) SetResultMsg(v string) *DeleteJointconstraintRecordResponse {
	s.ResultMsg = &v
	return s
}

type QueryJointconstraintBreachrecordRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询对象实体类型
	//
	// 0：企业
	//
	// 1：个人
	EntityType *int64 `json:"entity_type,omitempty" xml:"entity_type,omitempty" require:"true"`
	// 对象实体证件类型
	//
	// 0：统一社会信用代码
	//
	// 1：身份证号码
	CertType *int64 `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 对象实体证件号码
	//
	//
	CertNumber *string `json:"cert_number,omitempty" xml:"cert_number,omitempty" require:"true"`
}

func (s QueryJointconstraintBreachrecordRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryJointconstraintBreachrecordRequest) GoString() string {
	return s.String()
}

func (s *QueryJointconstraintBreachrecordRequest) SetAuthToken(v string) *QueryJointconstraintBreachrecordRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryJointconstraintBreachrecordRequest) SetProductInstanceId(v string) *QueryJointconstraintBreachrecordRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryJointconstraintBreachrecordRequest) SetEntityType(v int64) *QueryJointconstraintBreachrecordRequest {
	s.EntityType = &v
	return s
}

func (s *QueryJointconstraintBreachrecordRequest) SetCertType(v int64) *QueryJointconstraintBreachrecordRequest {
	s.CertType = &v
	return s
}

func (s *QueryJointconstraintBreachrecordRequest) SetCertNumber(v string) *QueryJointconstraintBreachrecordRequest {
	s.CertNumber = &v
	return s
}

type QueryJointconstraintBreachrecordResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否存在履行记录
	//
	//
	HasRecord *bool `json:"has_record,omitempty" xml:"has_record,omitempty"`
	// 违约次数
	//
	//
	BreachCount *int64 `json:"breach_count,omitempty" xml:"breach_count,omitempty"`
}

func (s QueryJointconstraintBreachrecordResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryJointconstraintBreachrecordResponse) GoString() string {
	return s.String()
}

func (s *QueryJointconstraintBreachrecordResponse) SetReqMsgId(v string) *QueryJointconstraintBreachrecordResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryJointconstraintBreachrecordResponse) SetResultCode(v string) *QueryJointconstraintBreachrecordResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryJointconstraintBreachrecordResponse) SetResultMsg(v string) *QueryJointconstraintBreachrecordResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryJointconstraintBreachrecordResponse) SetHasRecord(v bool) *QueryJointconstraintBreachrecordResponse {
	s.HasRecord = &v
	return s
}

func (s *QueryJointconstraintBreachrecordResponse) SetBreachCount(v int64) *QueryJointconstraintBreachrecordResponse {
	s.BreachCount = &v
	return s
}

type ApplyJusticeMediationRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 机构码 由蚂蚁分配
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 法院代码 由蚂蚁提供
	CourtCode *string `json:"court_code,omitempty" xml:"court_code,omitempty" require:"true"`
	// 案件内容 JsonString 格式{"agencyRelations":[],"agents":[],"caseInfo":{},"litigants":{}}
	CaseBody *string `json:"case_body,omitempty" xml:"case_body,omitempty" require:"true"`
}

func (s ApplyJusticeMediationRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyJusticeMediationRequest) GoString() string {
	return s.String()
}

func (s *ApplyJusticeMediationRequest) SetAuthToken(v string) *ApplyJusticeMediationRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyJusticeMediationRequest) SetProductInstanceId(v string) *ApplyJusticeMediationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyJusticeMediationRequest) SetProductCode(v string) *ApplyJusticeMediationRequest {
	s.ProductCode = &v
	return s
}

func (s *ApplyJusticeMediationRequest) SetCourtCode(v string) *ApplyJusticeMediationRequest {
	s.CourtCode = &v
	return s
}

func (s *ApplyJusticeMediationRequest) SetCaseBody(v string) *ApplyJusticeMediationRequest {
	s.CaseBody = &v
	return s
}

type ApplyJusticeMediationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s ApplyJusticeMediationResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyJusticeMediationResponse) GoString() string {
	return s.String()
}

func (s *ApplyJusticeMediationResponse) SetReqMsgId(v string) *ApplyJusticeMediationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyJusticeMediationResponse) SetResultCode(v string) *ApplyJusticeMediationResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyJusticeMediationResponse) SetResultMsg(v string) *ApplyJusticeMediationResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyJusticeMediationResponse) SetCode(v int64) *ApplyJusticeMediationResponse {
	s.Code = &v
	return s
}

func (s *ApplyJusticeMediationResponse) SetMessage(v string) *ApplyJusticeMediationResponse {
	s.Message = &v
	return s
}

type QueryJusticeMediationRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 产品码 由蚂蚁分配
	//
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 案件编号
	CaseNumber *string `json:"case_number,omitempty" xml:"case_number,omitempty" require:"true"`
}

func (s QueryJusticeMediationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryJusticeMediationRequest) GoString() string {
	return s.String()
}

func (s *QueryJusticeMediationRequest) SetAuthToken(v string) *QueryJusticeMediationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryJusticeMediationRequest) SetProductInstanceId(v string) *QueryJusticeMediationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryJusticeMediationRequest) SetProductCode(v string) *QueryJusticeMediationRequest {
	s.ProductCode = &v
	return s
}

func (s *QueryJusticeMediationRequest) SetCaseNumber(v string) *QueryJusticeMediationRequest {
	s.CaseNumber = &v
	return s
}

type QueryJusticeMediationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 	业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 案件处理进度信息对象
	MediationCaseDetailInfo *string `json:"mediation_case_detail_info,omitempty" xml:"mediation_case_detail_info,omitempty"`
}

func (s QueryJusticeMediationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryJusticeMediationResponse) GoString() string {
	return s.String()
}

func (s *QueryJusticeMediationResponse) SetReqMsgId(v string) *QueryJusticeMediationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryJusticeMediationResponse) SetResultCode(v string) *QueryJusticeMediationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryJusticeMediationResponse) SetResultMsg(v string) *QueryJusticeMediationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryJusticeMediationResponse) SetCode(v int64) *QueryJusticeMediationResponse {
	s.Code = &v
	return s
}

func (s *QueryJusticeMediationResponse) SetMessage(v string) *QueryJusticeMediationResponse {
	s.Message = &v
	return s
}

func (s *QueryJusticeMediationResponse) SetMediationCaseDetailInfo(v string) *QueryJusticeMediationResponse {
	s.MediationCaseDetailInfo = &v
	return s
}

type CreateWitnessFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务场景，最大255长度
	BusinessScene *string `json:"business_scene,omitempty" xml:"business_scene,omitempty" require:"true"`
	// 客户端名称，比如签章客户端，最长长度50
	ClientName *string `json:"client_name,omitempty" xml:"client_name,omitempty"`
	// 客户端版本
	ClientVersion *string `json:"client_version,omitempty" xml:"client_version,omitempty"`
	// 合同有效截止时间，时间戳
	ContractValidity *string `json:"contract_validity,omitempty" xml:"contract_validity,omitempty"`
	// 流程id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 发起方账号id
	InitiatorAccountId *string `json:"initiator_account_id,omitempty" xml:"initiator_account_id,omitempty"`
	// 发起端，TIANYIN_H5 - H5端，TIANYIN_WEB - WEB端，TIANYIN_API - API
	LaunchEndpoint *string `json:"launch_endpoint,omitempty" xml:"launch_endpoint,omitempty" require:"true"`
	// 发起ip
	LaunchIp *string `json:"launch_ip,omitempty" xml:"launch_ip,omitempty" require:"true"`
	// 手机盾逻辑版本，0-不支持用印审批、需要扣费，1-支持用印审批、无需扣费，默认0
	MobileShieldVersion *int64 `json:"mobile_shield_version,omitempty" xml:"mobile_shield_version,omitempty"`
	// 扣费方账号id
	PayerAccountId *string `json:"payer_account_id,omitempty" xml:"payer_account_id,omitempty"`
	// 签署截止时间，时间戳
	SignDeadline *string `json:"sign_deadline,omitempty" xml:"sign_deadline,omitempty"`
	// 签署顺序，SIGN_SEQUENCE-顺序签署，SIGN_NON_SEQUENCE-无序签署
	SignOrder *string `json:"sign_order,omitempty" xml:"sign_order,omitempty" require:"true"`
	// 流程类型，0-签署流程，1-作废流程，默认0
	Type *int64 `json:"type,omitempty" xml:"type,omitempty"`
	// 发起请求的实例应用ID
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 发起请求的鉴权token
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
}

func (s CreateWitnessFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateWitnessFlowRequest) GoString() string {
	return s.String()
}

func (s *CreateWitnessFlowRequest) SetAuthToken(v string) *CreateWitnessFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateWitnessFlowRequest) SetProductInstanceId(v string) *CreateWitnessFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateWitnessFlowRequest) SetBusinessScene(v string) *CreateWitnessFlowRequest {
	s.BusinessScene = &v
	return s
}

func (s *CreateWitnessFlowRequest) SetClientName(v string) *CreateWitnessFlowRequest {
	s.ClientName = &v
	return s
}

func (s *CreateWitnessFlowRequest) SetClientVersion(v string) *CreateWitnessFlowRequest {
	s.ClientVersion = &v
	return s
}

func (s *CreateWitnessFlowRequest) SetContractValidity(v string) *CreateWitnessFlowRequest {
	s.ContractValidity = &v
	return s
}

func (s *CreateWitnessFlowRequest) SetFlowId(v string) *CreateWitnessFlowRequest {
	s.FlowId = &v
	return s
}

func (s *CreateWitnessFlowRequest) SetInitiatorAccountId(v string) *CreateWitnessFlowRequest {
	s.InitiatorAccountId = &v
	return s
}

func (s *CreateWitnessFlowRequest) SetLaunchEndpoint(v string) *CreateWitnessFlowRequest {
	s.LaunchEndpoint = &v
	return s
}

func (s *CreateWitnessFlowRequest) SetLaunchIp(v string) *CreateWitnessFlowRequest {
	s.LaunchIp = &v
	return s
}

func (s *CreateWitnessFlowRequest) SetMobileShieldVersion(v int64) *CreateWitnessFlowRequest {
	s.MobileShieldVersion = &v
	return s
}

func (s *CreateWitnessFlowRequest) SetPayerAccountId(v string) *CreateWitnessFlowRequest {
	s.PayerAccountId = &v
	return s
}

func (s *CreateWitnessFlowRequest) SetSignDeadline(v string) *CreateWitnessFlowRequest {
	s.SignDeadline = &v
	return s
}

func (s *CreateWitnessFlowRequest) SetSignOrder(v string) *CreateWitnessFlowRequest {
	s.SignOrder = &v
	return s
}

func (s *CreateWitnessFlowRequest) SetType(v int64) *CreateWitnessFlowRequest {
	s.Type = &v
	return s
}

func (s *CreateWitnessFlowRequest) SetAppId(v string) *CreateWitnessFlowRequest {
	s.AppId = &v
	return s
}

func (s *CreateWitnessFlowRequest) SetToken(v string) *CreateWitnessFlowRequest {
	s.Token = &v
	return s
}

type CreateWitnessFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 流程配置
	FlowConfig *WitnessFlowConfig `json:"flow_config,omitempty" xml:"flow_config,omitempty"`
	// 流程创建响应数据
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 见证流程
	WitnessFlowId *string `json:"witness_flow_id,omitempty" xml:"witness_flow_id,omitempty"`
}

func (s CreateWitnessFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateWitnessFlowResponse) GoString() string {
	return s.String()
}

func (s *CreateWitnessFlowResponse) SetReqMsgId(v string) *CreateWitnessFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateWitnessFlowResponse) SetResultCode(v string) *CreateWitnessFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateWitnessFlowResponse) SetResultMsg(v string) *CreateWitnessFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateWitnessFlowResponse) SetCode(v int64) *CreateWitnessFlowResponse {
	s.Code = &v
	return s
}

func (s *CreateWitnessFlowResponse) SetFlowConfig(v *WitnessFlowConfig) *CreateWitnessFlowResponse {
	s.FlowConfig = v
	return s
}

func (s *CreateWitnessFlowResponse) SetMessage(v string) *CreateWitnessFlowResponse {
	s.Message = &v
	return s
}

func (s *CreateWitnessFlowResponse) SetWitnessFlowId(v string) *CreateWitnessFlowResponse {
	s.WitnessFlowId = &v
	return s
}

type SaveWitnessSnapshotRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 快照数据
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
	// 快照步骤，最大20长度，START-开始，UPDATE-更新，FINISH-结束，允许自定义
	Step *string `json:"step,omitempty" xml:"step,omitempty" require:"true"`
	// 快照步骤描述，最大40长度
	StepDescription *string `json:"step_description,omitempty" xml:"step_description,omitempty" require:"true"`
	// 见证流程id
	WitnessFlowId *string `json:"witness_flow_id,omitempty" xml:"witness_flow_id,omitempty" require:"true"`
	// 发起请求的实例应用ID
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 发起请求的鉴权token
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
}

func (s SaveWitnessSnapshotRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveWitnessSnapshotRequest) GoString() string {
	return s.String()
}

func (s *SaveWitnessSnapshotRequest) SetAuthToken(v string) *SaveWitnessSnapshotRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveWitnessSnapshotRequest) SetProductInstanceId(v string) *SaveWitnessSnapshotRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveWitnessSnapshotRequest) SetData(v string) *SaveWitnessSnapshotRequest {
	s.Data = &v
	return s
}

func (s *SaveWitnessSnapshotRequest) SetStep(v string) *SaveWitnessSnapshotRequest {
	s.Step = &v
	return s
}

func (s *SaveWitnessSnapshotRequest) SetStepDescription(v string) *SaveWitnessSnapshotRequest {
	s.StepDescription = &v
	return s
}

func (s *SaveWitnessSnapshotRequest) SetWitnessFlowId(v string) *SaveWitnessSnapshotRequest {
	s.WitnessFlowId = &v
	return s
}

func (s *SaveWitnessSnapshotRequest) SetAppId(v string) *SaveWitnessSnapshotRequest {
	s.AppId = &v
	return s
}

func (s *SaveWitnessSnapshotRequest) SetToken(v string) *SaveWitnessSnapshotRequest {
	s.Token = &v
	return s
}

type SaveWitnessSnapshotResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s SaveWitnessSnapshotResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveWitnessSnapshotResponse) GoString() string {
	return s.String()
}

func (s *SaveWitnessSnapshotResponse) SetReqMsgId(v string) *SaveWitnessSnapshotResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveWitnessSnapshotResponse) SetResultCode(v string) *SaveWitnessSnapshotResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveWitnessSnapshotResponse) SetResultMsg(v string) *SaveWitnessSnapshotResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveWitnessSnapshotResponse) SetCode(v int64) *SaveWitnessSnapshotResponse {
	s.Code = &v
	return s
}

func (s *SaveWitnessSnapshotResponse) SetMessage(v string) *SaveWitnessSnapshotResponse {
	s.Message = &v
	return s
}

type CheckWitnessSignaccessRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 审批流程id
	ApprovalFlowId *string `json:"approval_flow_id,omitempty" xml:"approval_flow_id,omitempty"`
	// 审批结果通知
	ApprovalNotifyUrl *string `json:"approval_notify_url,omitempty" xml:"approval_notify_url,omitempty"`
	// 签署文档信息
	Docs []*WitnessDocs `json:"docs,omitempty" xml:"docs,omitempty" require:"true" type:"Repeated"`
	// 签署端，TIANYIN_H5 - H5端，TIANYIN_WEB - WEB端，TIANYIN_API - API
	Endpoint *string `json:"endpoint,omitempty" xml:"endpoint,omitempty" require:"true"`
	// 是否发起审批，默认TRUE
	LaunchApproval *bool `json:"launch_approval,omitempty" xml:"launch_approval,omitempty"`
	// 手机盾任务id，用于手机盾审批场景
	MobileShieldTaskId *string `json:"mobile_shield_task_id,omitempty" xml:"mobile_shield_task_id,omitempty"`
	// 实名认证凭证
	RealnameAuthCode *string `json:"realname_auth_code,omitempty" xml:"realname_auth_code,omitempty"`
	// 印章id列表
	SealIds []*string `json:"seal_ids,omitempty" xml:"seal_ids,omitempty" type:"Repeated"`
	// 签署人账号id
	SignerAccountId *string `json:"signer_account_id,omitempty" xml:"signer_account_id,omitempty" require:"true"`
	// 签署人ip
	SignerIp *string `json:"signer_ip,omitempty" xml:"signer_ip,omitempty" require:"true"`
	// 签署人类型，1-私有云用户，2-公有云用户，3-手机盾用户
	SignerType *int64 `json:"signer_type,omitempty" xml:"signer_type,omitempty" require:"true"`
	// 签署预览地址
	SignPreviewUrl *string `json:"sign_preview_url,omitempty" xml:"sign_preview_url,omitempty"`
	// 意愿认证凭证
	WillAuthCode *string `json:"will_auth_code,omitempty" xml:"will_auth_code,omitempty"`
	// 见证流程id
	WitnessFlowId *string `json:"witness_flow_id,omitempty" xml:"witness_flow_id,omitempty" require:"true"`
	// 发起请求的实例应用ID
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 发起请求的鉴权token
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
}

func (s CheckWitnessSignaccessRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckWitnessSignaccessRequest) GoString() string {
	return s.String()
}

func (s *CheckWitnessSignaccessRequest) SetAuthToken(v string) *CheckWitnessSignaccessRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckWitnessSignaccessRequest) SetProductInstanceId(v string) *CheckWitnessSignaccessRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckWitnessSignaccessRequest) SetApprovalFlowId(v string) *CheckWitnessSignaccessRequest {
	s.ApprovalFlowId = &v
	return s
}

func (s *CheckWitnessSignaccessRequest) SetApprovalNotifyUrl(v string) *CheckWitnessSignaccessRequest {
	s.ApprovalNotifyUrl = &v
	return s
}

func (s *CheckWitnessSignaccessRequest) SetDocs(v []*WitnessDocs) *CheckWitnessSignaccessRequest {
	s.Docs = v
	return s
}

func (s *CheckWitnessSignaccessRequest) SetEndpoint(v string) *CheckWitnessSignaccessRequest {
	s.Endpoint = &v
	return s
}

func (s *CheckWitnessSignaccessRequest) SetLaunchApproval(v bool) *CheckWitnessSignaccessRequest {
	s.LaunchApproval = &v
	return s
}

func (s *CheckWitnessSignaccessRequest) SetMobileShieldTaskId(v string) *CheckWitnessSignaccessRequest {
	s.MobileShieldTaskId = &v
	return s
}

func (s *CheckWitnessSignaccessRequest) SetRealnameAuthCode(v string) *CheckWitnessSignaccessRequest {
	s.RealnameAuthCode = &v
	return s
}

func (s *CheckWitnessSignaccessRequest) SetSealIds(v []*string) *CheckWitnessSignaccessRequest {
	s.SealIds = v
	return s
}

func (s *CheckWitnessSignaccessRequest) SetSignerAccountId(v string) *CheckWitnessSignaccessRequest {
	s.SignerAccountId = &v
	return s
}

func (s *CheckWitnessSignaccessRequest) SetSignerIp(v string) *CheckWitnessSignaccessRequest {
	s.SignerIp = &v
	return s
}

func (s *CheckWitnessSignaccessRequest) SetSignerType(v int64) *CheckWitnessSignaccessRequest {
	s.SignerType = &v
	return s
}

func (s *CheckWitnessSignaccessRequest) SetSignPreviewUrl(v string) *CheckWitnessSignaccessRequest {
	s.SignPreviewUrl = &v
	return s
}

func (s *CheckWitnessSignaccessRequest) SetWillAuthCode(v string) *CheckWitnessSignaccessRequest {
	s.WillAuthCode = &v
	return s
}

func (s *CheckWitnessSignaccessRequest) SetWitnessFlowId(v string) *CheckWitnessSignaccessRequest {
	s.WitnessFlowId = &v
	return s
}

func (s *CheckWitnessSignaccessRequest) SetAppId(v string) *CheckWitnessSignaccessRequest {
	s.AppId = &v
	return s
}

func (s *CheckWitnessSignaccessRequest) SetToken(v string) *CheckWitnessSignaccessRequest {
	s.Token = &v
	return s
}

type CheckWitnessSignaccessResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 有权限的印章id列表
	AccessSealIds []*string `json:"access_seal_ids,omitempty" xml:"access_seal_ids,omitempty" type:"Repeated"`
	// 审批数据
	ApprovalDatas []*WitnessApprovalData `json:"approval_datas,omitempty" xml:"approval_datas,omitempty" type:"Repeated"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 签署票证
	SignTicket *string `json:"sign_ticket,omitempty" xml:"sign_ticket,omitempty"`
}

func (s CheckWitnessSignaccessResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckWitnessSignaccessResponse) GoString() string {
	return s.String()
}

func (s *CheckWitnessSignaccessResponse) SetReqMsgId(v string) *CheckWitnessSignaccessResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckWitnessSignaccessResponse) SetResultCode(v string) *CheckWitnessSignaccessResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckWitnessSignaccessResponse) SetResultMsg(v string) *CheckWitnessSignaccessResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckWitnessSignaccessResponse) SetAccessSealIds(v []*string) *CheckWitnessSignaccessResponse {
	s.AccessSealIds = v
	return s
}

func (s *CheckWitnessSignaccessResponse) SetApprovalDatas(v []*WitnessApprovalData) *CheckWitnessSignaccessResponse {
	s.ApprovalDatas = v
	return s
}

func (s *CheckWitnessSignaccessResponse) SetCode(v int64) *CheckWitnessSignaccessResponse {
	s.Code = &v
	return s
}

func (s *CheckWitnessSignaccessResponse) SetMessage(v string) *CheckWitnessSignaccessResponse {
	s.Message = &v
	return s
}

func (s *CheckWitnessSignaccessResponse) SetSignTicket(v string) *CheckWitnessSignaccessResponse {
	s.SignTicket = &v
	return s
}

type AuthWitnessFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 发起请求的实例应用ID
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 证书id
	CertId *string `json:"cert_id,omitempty" xml:"cert_id,omitempty"`
	// 签署页码，单个签时必传
	Page *string `json:"page,omitempty" xml:"page,omitempty"`
	// 签署x坐标，单个签时必传
	PosX *string `json:"pos_x,omitempty" xml:"pos_x,omitempty"`
	// 签署y坐标，单个签时必传
	PosY *string `json:"pos_y,omitempty" xml:"pos_y,omitempty"`
	// 印章图片key
	SealFileKey *string `json:"seal_file_key,omitempty" xml:"seal_file_key,omitempty"`
	// 印章id
	SealId *string `json:"seal_id,omitempty" xml:"seal_id,omitempty"`
	// 印章类型，1-模板，2-手绘
	SealType *int64 `json:"seal_type,omitempty" xml:"seal_type,omitempty" require:"true"`
	// 签署类型，单个签时必传
	SignatureType *string `json:"signature_type,omitempty" xml:"signature_type,omitempty"`
	// 批量签署信息，批量签时必传
	SignDatas *string `json:"sign_datas,omitempty" xml:"sign_datas,omitempty"`
	// 待签署文档摘要值，单个签时必传
	SignHash *string `json:"sign_hash,omitempty" xml:"sign_hash,omitempty"`
	// 签署票证
	SignTicket *string `json:"sign_ticket,omitempty" xml:"sign_ticket,omitempty" require:"true"`
	// 签署主体账号id
	SubjectAccountId *string `json:"subject_account_id,omitempty" xml:"subject_account_id,omitempty"`
	// 第三方文档id，单个签时必传
	ThirdDocId *string `json:"third_doc_id,omitempty" xml:"third_doc_id,omitempty"`
	// 发起请求的鉴权token
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
	// 见证流程id
	WitnessFlowId *string `json:"witness_flow_id,omitempty" xml:"witness_flow_id,omitempty" require:"true"`
}

func (s AuthWitnessFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthWitnessFlowRequest) GoString() string {
	return s.String()
}

func (s *AuthWitnessFlowRequest) SetAuthToken(v string) *AuthWitnessFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthWitnessFlowRequest) SetProductInstanceId(v string) *AuthWitnessFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthWitnessFlowRequest) SetAppId(v string) *AuthWitnessFlowRequest {
	s.AppId = &v
	return s
}

func (s *AuthWitnessFlowRequest) SetCertId(v string) *AuthWitnessFlowRequest {
	s.CertId = &v
	return s
}

func (s *AuthWitnessFlowRequest) SetPage(v string) *AuthWitnessFlowRequest {
	s.Page = &v
	return s
}

func (s *AuthWitnessFlowRequest) SetPosX(v string) *AuthWitnessFlowRequest {
	s.PosX = &v
	return s
}

func (s *AuthWitnessFlowRequest) SetPosY(v string) *AuthWitnessFlowRequest {
	s.PosY = &v
	return s
}

func (s *AuthWitnessFlowRequest) SetSealFileKey(v string) *AuthWitnessFlowRequest {
	s.SealFileKey = &v
	return s
}

func (s *AuthWitnessFlowRequest) SetSealId(v string) *AuthWitnessFlowRequest {
	s.SealId = &v
	return s
}

func (s *AuthWitnessFlowRequest) SetSealType(v int64) *AuthWitnessFlowRequest {
	s.SealType = &v
	return s
}

func (s *AuthWitnessFlowRequest) SetSignatureType(v string) *AuthWitnessFlowRequest {
	s.SignatureType = &v
	return s
}

func (s *AuthWitnessFlowRequest) SetSignDatas(v string) *AuthWitnessFlowRequest {
	s.SignDatas = &v
	return s
}

func (s *AuthWitnessFlowRequest) SetSignHash(v string) *AuthWitnessFlowRequest {
	s.SignHash = &v
	return s
}

func (s *AuthWitnessFlowRequest) SetSignTicket(v string) *AuthWitnessFlowRequest {
	s.SignTicket = &v
	return s
}

func (s *AuthWitnessFlowRequest) SetSubjectAccountId(v string) *AuthWitnessFlowRequest {
	s.SubjectAccountId = &v
	return s
}

func (s *AuthWitnessFlowRequest) SetThirdDocId(v string) *AuthWitnessFlowRequest {
	s.ThirdDocId = &v
	return s
}

func (s *AuthWitnessFlowRequest) SetToken(v string) *AuthWitnessFlowRequest {
	s.Token = &v
	return s
}

func (s *AuthWitnessFlowRequest) SetWitnessFlowId(v string) *AuthWitnessFlowRequest {
	s.WitnessFlowId = &v
	return s
}

type AuthWitnessFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 二维码内容
	QrcodeContent *string `json:"qrcode_content,omitempty" xml:"qrcode_content,omitempty"`
	// 签署日志id，外部用户签署返回
	SignlogId *string `json:"signlog_id,omitempty" xml:"signlog_id,omitempty"`
	// 签名结果，外部用户签署返回
	SignResult *string `json:"sign_result,omitempty" xml:"sign_result,omitempty"`
	// 签署结果，批量签署返回
	SignResults []*WitnessSignResult `json:"sign_results,omitempty" xml:"sign_results,omitempty" type:"Repeated"`
	// 签署方式，1-单个签署，2-批量签署
	SignWay *int64 `json:"sign_way,omitempty" xml:"sign_way,omitempty"`
	// 手机盾用户签署返回
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
}

func (s AuthWitnessFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthWitnessFlowResponse) GoString() string {
	return s.String()
}

func (s *AuthWitnessFlowResponse) SetReqMsgId(v string) *AuthWitnessFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthWitnessFlowResponse) SetResultCode(v string) *AuthWitnessFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthWitnessFlowResponse) SetResultMsg(v string) *AuthWitnessFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthWitnessFlowResponse) SetCode(v int64) *AuthWitnessFlowResponse {
	s.Code = &v
	return s
}

func (s *AuthWitnessFlowResponse) SetMessage(v string) *AuthWitnessFlowResponse {
	s.Message = &v
	return s
}

func (s *AuthWitnessFlowResponse) SetQrcodeContent(v string) *AuthWitnessFlowResponse {
	s.QrcodeContent = &v
	return s
}

func (s *AuthWitnessFlowResponse) SetSignlogId(v string) *AuthWitnessFlowResponse {
	s.SignlogId = &v
	return s
}

func (s *AuthWitnessFlowResponse) SetSignResult(v string) *AuthWitnessFlowResponse {
	s.SignResult = &v
	return s
}

func (s *AuthWitnessFlowResponse) SetSignResults(v []*WitnessSignResult) *AuthWitnessFlowResponse {
	s.SignResults = v
	return s
}

func (s *AuthWitnessFlowResponse) SetSignWay(v int64) *AuthWitnessFlowResponse {
	s.SignWay = &v
	return s
}

func (s *AuthWitnessFlowResponse) SetTaskId(v string) *AuthWitnessFlowResponse {
	s.TaskId = &v
	return s
}

type ConfirmWitnessFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署确认数据
	ConfirmDatas []*WitnessConfirmData `json:"confirm_datas,omitempty" xml:"confirm_datas,omitempty" require:"true" type:"Repeated"`
	// 证据id列表，内部用户必传
	EvidenceIds []*string `json:"evidence_ids,omitempty" xml:"evidence_ids,omitempty" type:"Repeated"`
	// 签署记录id列表，外部用户必传
	SignlogIds []*string `json:"signlog_ids,omitempty" xml:"signlog_ids,omitempty" type:"Repeated"`
	// 签署票证
	SignTicket *string `json:"sign_ticket,omitempty" xml:"sign_ticket,omitempty" require:"true"`
	// 见证流程id
	WitnessFlowId *string `json:"witness_flow_id,omitempty" xml:"witness_flow_id,omitempty" require:"true"`
	// 发起请求的实例应用ID
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 发起请求的鉴权token
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
}

func (s ConfirmWitnessFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmWitnessFlowRequest) GoString() string {
	return s.String()
}

func (s *ConfirmWitnessFlowRequest) SetAuthToken(v string) *ConfirmWitnessFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmWitnessFlowRequest) SetProductInstanceId(v string) *ConfirmWitnessFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ConfirmWitnessFlowRequest) SetConfirmDatas(v []*WitnessConfirmData) *ConfirmWitnessFlowRequest {
	s.ConfirmDatas = v
	return s
}

func (s *ConfirmWitnessFlowRequest) SetEvidenceIds(v []*string) *ConfirmWitnessFlowRequest {
	s.EvidenceIds = v
	return s
}

func (s *ConfirmWitnessFlowRequest) SetSignlogIds(v []*string) *ConfirmWitnessFlowRequest {
	s.SignlogIds = v
	return s
}

func (s *ConfirmWitnessFlowRequest) SetSignTicket(v string) *ConfirmWitnessFlowRequest {
	s.SignTicket = &v
	return s
}

func (s *ConfirmWitnessFlowRequest) SetWitnessFlowId(v string) *ConfirmWitnessFlowRequest {
	s.WitnessFlowId = &v
	return s
}

func (s *ConfirmWitnessFlowRequest) SetAppId(v string) *ConfirmWitnessFlowRequest {
	s.AppId = &v
	return s
}

func (s *ConfirmWitnessFlowRequest) SetToken(v string) *ConfirmWitnessFlowRequest {
	s.Token = &v
	return s
}

type ConfirmWitnessFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s ConfirmWitnessFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmWitnessFlowResponse) GoString() string {
	return s.String()
}

func (s *ConfirmWitnessFlowResponse) SetReqMsgId(v string) *ConfirmWitnessFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmWitnessFlowResponse) SetResultCode(v string) *ConfirmWitnessFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmWitnessFlowResponse) SetResultMsg(v string) *ConfirmWitnessFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *ConfirmWitnessFlowResponse) SetCode(v int64) *ConfirmWitnessFlowResponse {
	s.Code = &v
	return s
}

func (s *ConfirmWitnessFlowResponse) SetMessage(v string) *ConfirmWitnessFlowResponse {
	s.Message = &v
	return s
}

type CreateTransRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 存证关联实体（个人/企业）的身份识别信息
	Customer *Identity `json:"customer,omitempty" xml:"customer,omitempty" require:"true"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 业务子类型标识
	SubBizId *string `json:"sub_biz_id,omitempty" xml:"sub_biz_id,omitempty"`
	// 是否使用可信时间戳，默认为false
	Tsr *bool `json:"tsr,omitempty" xml:"tsr,omitempty"`
}

func (s CreateTransRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTransRequest) GoString() string {
	return s.String()
}

func (s *CreateTransRequest) SetAuthToken(v string) *CreateTransRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTransRequest) SetProductInstanceId(v string) *CreateTransRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTransRequest) SetCustomer(v *Identity) *CreateTransRequest {
	s.Customer = v
	return s
}

func (s *CreateTransRequest) SetProperties(v string) *CreateTransRequest {
	s.Properties = &v
	return s
}

func (s *CreateTransRequest) SetSubBizId(v string) *CreateTransRequest {
	s.SubBizId = &v
	return s
}

func (s *CreateTransRequest) SetTsr(v bool) *CreateTransRequest {
	s.Tsr = &v
	return s
}

type CreateTransResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回事务ID，全局唯一
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 可信时间信息
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
}

func (s CreateTransResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTransResponse) GoString() string {
	return s.String()
}

func (s *CreateTransResponse) SetReqMsgId(v string) *CreateTransResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTransResponse) SetResultCode(v string) *CreateTransResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTransResponse) SetResultMsg(v string) *CreateTransResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTransResponse) SetTransactionId(v string) *CreateTransResponse {
	s.TransactionId = &v
	return s
}

func (s *CreateTransResponse) SetTsr(v *TsrResponse) *CreateTransResponse {
	s.Tsr = v
	return s
}

type GetTransRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty" require:"true"`
}

func (s GetTransRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTransRequest) GoString() string {
	return s.String()
}

func (s *GetTransRequest) SetAuthToken(v string) *GetTransRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTransRequest) SetProductInstanceId(v string) *GetTransRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTransRequest) SetTransactionId(v string) *GetTransRequest {
	s.TransactionId = &v
	return s
}

type GetTransResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回文件下载路径列表
	FileUrl []*string `json:"file_url,omitempty" xml:"file_url,omitempty" type:"Repeated"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
}

func (s GetTransResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTransResponse) GoString() string {
	return s.String()
}

func (s *GetTransResponse) SetReqMsgId(v string) *GetTransResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTransResponse) SetResultCode(v string) *GetTransResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTransResponse) SetResultMsg(v string) *GetTransResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTransResponse) SetFileUrl(v []*string) *GetTransResponse {
	s.FileUrl = v
	return s
}

func (s *GetTransResponse) SetTransactionId(v string) *GetTransResponse {
	s.TransactionId = &v
	return s
}

type CreateTextRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 存证内容
	NotaryContent *string `json:"notary_content,omitempty" xml:"notary_content,omitempty" require:"true"`
	// 描述本条存证在存证事务中的阶段，用户可自行维护
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty" require:"true"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 存证事务id
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty" require:"true"`
	// 是否使用可信时间戳，默认为false
	Tsr *bool `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 文本存证类型，支持源文本/文本哈希
	TextNotaryType *string `json:"text_notary_type,omitempty" xml:"text_notary_type,omitempty"`
	// 哈希算法，目前仅支持 SHA256
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty"`
}

func (s CreateTextRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTextRequest) GoString() string {
	return s.String()
}

func (s *CreateTextRequest) SetAuthToken(v string) *CreateTextRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTextRequest) SetProductInstanceId(v string) *CreateTextRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTextRequest) SetLocation(v *Location) *CreateTextRequest {
	s.Location = v
	return s
}

func (s *CreateTextRequest) SetNotaryContent(v string) *CreateTextRequest {
	s.NotaryContent = &v
	return s
}

func (s *CreateTextRequest) SetPhase(v string) *CreateTextRequest {
	s.Phase = &v
	return s
}

func (s *CreateTextRequest) SetProperties(v string) *CreateTextRequest {
	s.Properties = &v
	return s
}

func (s *CreateTextRequest) SetTransactionId(v string) *CreateTextRequest {
	s.TransactionId = &v
	return s
}

func (s *CreateTextRequest) SetTsr(v bool) *CreateTextRequest {
	s.Tsr = &v
	return s
}

func (s *CreateTextRequest) SetTextNotaryType(v string) *CreateTextRequest {
	s.TextNotaryType = &v
	return s
}

func (s *CreateTextRequest) SetHashAlgorithm(v string) *CreateTextRequest {
	s.HashAlgorithm = &v
	return s
}

type CreateTextResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 可信时间信息
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 存证凭据
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateTextResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTextResponse) GoString() string {
	return s.String()
}

func (s *CreateTextResponse) SetReqMsgId(v string) *CreateTextResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTextResponse) SetResultCode(v string) *CreateTextResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTextResponse) SetResultMsg(v string) *CreateTextResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTextResponse) SetTsr(v *TsrResponse) *CreateTextResponse {
	s.Tsr = v
	return s
}

func (s *CreateTextResponse) SetTxHash(v string) *CreateTextResponse {
	s.TxHash = &v
	return s
}

type GetTextRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 描述本条存证在存证事务中的阶段，用户可自行维护
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 存证事务id
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 存证凭据
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
}

func (s GetTextRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTextRequest) GoString() string {
	return s.String()
}

func (s *GetTextRequest) SetAuthToken(v string) *GetTextRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTextRequest) SetProductInstanceId(v string) *GetTextRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTextRequest) SetLocation(v *Location) *GetTextRequest {
	s.Location = v
	return s
}

func (s *GetTextRequest) SetPhase(v string) *GetTextRequest {
	s.Phase = &v
	return s
}

func (s *GetTextRequest) SetProperties(v string) *GetTextRequest {
	s.Properties = &v
	return s
}

func (s *GetTextRequest) SetTransactionId(v string) *GetTextRequest {
	s.TransactionId = &v
	return s
}

func (s *GetTextRequest) SetTxHash(v string) *GetTextRequest {
	s.TxHash = &v
	return s
}

type GetTextResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证信息
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 可信信息
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 文本存证类型
	TextNotaryType *string `json:"text_notary_type,omitempty" xml:"text_notary_type,omitempty"`
	// 哈希算法
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty"`
}

func (s GetTextResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTextResponse) GoString() string {
	return s.String()
}

func (s *GetTextResponse) SetReqMsgId(v string) *GetTextResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTextResponse) SetResultCode(v string) *GetTextResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTextResponse) SetResultMsg(v string) *GetTextResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTextResponse) SetContent(v string) *GetTextResponse {
	s.Content = &v
	return s
}

func (s *GetTextResponse) SetTsr(v *TsrResponse) *GetTextResponse {
	s.Tsr = v
	return s
}

func (s *GetTextResponse) SetTextNotaryType(v string) *GetTextResponse {
	s.TextNotaryType = &v
	return s
}

func (s *GetTextResponse) SetHashAlgorithm(v string) *GetTextResponse {
	s.HashAlgorithm = &v
	return s
}

type CreateFileRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件存证模式，目前仅支持 FILE_RAW 和 FILE_HASH
	FileNotaryType *string `json:"file_notary_type,omitempty" xml:"file_notary_type,omitempty"`
	// 当文件存证模式为FILE_HASH时，用户可以指定该参数。当前服务仅支持 SHA256，若不填写，则默认值为 SHA256。
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty"`
	// 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 存证文件内容，对文件内容做base64编码后得到。例如FILE_RAW模式下，文件内容为“test”，那么base64编码后的结果则为“dGVzdA==”。如果是FILE_HASh模式，则该字段直接为文件hash。
	NotaryFile *string `json:"notary_file,omitempty" xml:"notary_file,omitempty" require:"true"`
	// 存证文件名称
	NotaryName *string `json:"notary_name,omitempty" xml:"notary_name,omitempty" require:"true"`
	// 描述本条存证在存证事务中的阶段，用户可自行维护
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty" require:"true"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty" require:"true"`
	// 是否使用可信时间戳，默认为false
	Tsr *bool `json:"tsr,omitempty" xml:"tsr,omitempty"`
}

func (s CreateFileRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateFileRequest) GoString() string {
	return s.String()
}

func (s *CreateFileRequest) SetAuthToken(v string) *CreateFileRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateFileRequest) SetProductInstanceId(v string) *CreateFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateFileRequest) SetFileNotaryType(v string) *CreateFileRequest {
	s.FileNotaryType = &v
	return s
}

func (s *CreateFileRequest) SetHashAlgorithm(v string) *CreateFileRequest {
	s.HashAlgorithm = &v
	return s
}

func (s *CreateFileRequest) SetLocation(v *Location) *CreateFileRequest {
	s.Location = v
	return s
}

func (s *CreateFileRequest) SetNotaryFile(v string) *CreateFileRequest {
	s.NotaryFile = &v
	return s
}

func (s *CreateFileRequest) SetNotaryName(v string) *CreateFileRequest {
	s.NotaryName = &v
	return s
}

func (s *CreateFileRequest) SetPhase(v string) *CreateFileRequest {
	s.Phase = &v
	return s
}

func (s *CreateFileRequest) SetProperties(v string) *CreateFileRequest {
	s.Properties = &v
	return s
}

func (s *CreateFileRequest) SetTransactionId(v string) *CreateFileRequest {
	s.TransactionId = &v
	return s
}

func (s *CreateFileRequest) SetTsr(v bool) *CreateFileRequest {
	s.Tsr = &v
	return s
}

type CreateFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 可信时间信息
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 存证凭证
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateFileResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateFileResponse) GoString() string {
	return s.String()
}

func (s *CreateFileResponse) SetReqMsgId(v string) *CreateFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateFileResponse) SetResultCode(v string) *CreateFileResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateFileResponse) SetResultMsg(v string) *CreateFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateFileResponse) SetTsr(v *TsrResponse) *CreateFileResponse {
	s.Tsr = v
	return s
}

func (s *CreateFileResponse) SetTxHash(v string) *CreateFileResponse {
	s.TxHash = &v
	return s
}

type GetFileRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 描述本条存证在存证事务中的阶段，用户可自行维护
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 存证凭据
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
}

func (s GetFileRequest) String() string {
	return tea.Prettify(s)
}

func (s GetFileRequest) GoString() string {
	return s.String()
}

func (s *GetFileRequest) SetAuthToken(v string) *GetFileRequest {
	s.AuthToken = &v
	return s
}

func (s *GetFileRequest) SetProductInstanceId(v string) *GetFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetFileRequest) SetLocation(v *Location) *GetFileRequest {
	s.Location = v
	return s
}

func (s *GetFileRequest) SetPhase(v string) *GetFileRequest {
	s.Phase = &v
	return s
}

func (s *GetFileRequest) SetProperties(v string) *GetFileRequest {
	s.Properties = &v
	return s
}

func (s *GetFileRequest) SetTransactionId(v string) *GetFileRequest {
	s.TransactionId = &v
	return s
}

func (s *GetFileRequest) SetTxHash(v string) *GetFileRequest {
	s.TxHash = &v
	return s
}

type GetFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件哈希，当 file_notary_type 为 FILE_HASH 时才有此值。
	FileHash *string `json:"file_hash,omitempty" xml:"file_hash,omitempty"`
	// 文件存证模式，有 FILE_RAW 和 FILE_HASH 两种可能值。
	FileNotaryType *string `json:"file_notary_type,omitempty" xml:"file_notary_type,omitempty"`
	// 哈希算法，当 file_notary_type 为 FILE_HASH 时，此返回值才有效。
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty"`
	// 文件下载地址，当 file_notary_type 为 FILE_RAW 时才有此值。
	OssPath *string `json:"oss_path,omitempty" xml:"oss_path,omitempty"`
}

func (s GetFileResponse) String() string {
	return tea.Prettify(s)
}

func (s GetFileResponse) GoString() string {
	return s.String()
}

func (s *GetFileResponse) SetReqMsgId(v string) *GetFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetFileResponse) SetResultCode(v string) *GetFileResponse {
	s.ResultCode = &v
	return s
}

func (s *GetFileResponse) SetResultMsg(v string) *GetFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetFileResponse) SetFileHash(v string) *GetFileResponse {
	s.FileHash = &v
	return s
}

func (s *GetFileResponse) SetFileNotaryType(v string) *GetFileResponse {
	s.FileNotaryType = &v
	return s
}

func (s *GetFileResponse) SetHashAlgorithm(v string) *GetFileResponse {
	s.HashAlgorithm = &v
	return s
}

func (s *GetFileResponse) SetOssPath(v string) *GetFileResponse {
	s.OssPath = &v
	return s
}

type CreateSourceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 描述本条存证在存证事务中的阶段，用户可自行维护
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty" require:"true"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 原文文件描述
	SourceDesc *string `json:"source_desc,omitempty" xml:"source_desc,omitempty" require:"true"`
	// 存证文件内容，对文件内容做base64编码后得到。例如文件内容为“test”，那么base64编码后的结果则为“dGVzdA==”
	SourceFile *string `json:"source_file,omitempty" xml:"source_file,omitempty" require:"true"`
	// 存证原文名称
	SourceName *string `json:"source_name,omitempty" xml:"source_name,omitempty" require:"true"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty" require:"true"`
	// 是否使用可信时间戳，默认为false
	Tsr *bool `json:"tsr,omitempty" xml:"tsr,omitempty"`
}

func (s CreateSourceRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateSourceRequest) GoString() string {
	return s.String()
}

func (s *CreateSourceRequest) SetAuthToken(v string) *CreateSourceRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateSourceRequest) SetProductInstanceId(v string) *CreateSourceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateSourceRequest) SetLocation(v *Location) *CreateSourceRequest {
	s.Location = v
	return s
}

func (s *CreateSourceRequest) SetPhase(v string) *CreateSourceRequest {
	s.Phase = &v
	return s
}

func (s *CreateSourceRequest) SetProperties(v string) *CreateSourceRequest {
	s.Properties = &v
	return s
}

func (s *CreateSourceRequest) SetSourceDesc(v string) *CreateSourceRequest {
	s.SourceDesc = &v
	return s
}

func (s *CreateSourceRequest) SetSourceFile(v string) *CreateSourceRequest {
	s.SourceFile = &v
	return s
}

func (s *CreateSourceRequest) SetSourceName(v string) *CreateSourceRequest {
	s.SourceName = &v
	return s
}

func (s *CreateSourceRequest) SetTransactionId(v string) *CreateSourceRequest {
	s.TransactionId = &v
	return s
}

func (s *CreateSourceRequest) SetTsr(v bool) *CreateSourceRequest {
	s.Tsr = &v
	return s
}

type CreateSourceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 可信时间信息
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 存证凭据
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateSourceResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateSourceResponse) GoString() string {
	return s.String()
}

func (s *CreateSourceResponse) SetReqMsgId(v string) *CreateSourceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateSourceResponse) SetResultCode(v string) *CreateSourceResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateSourceResponse) SetResultMsg(v string) *CreateSourceResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateSourceResponse) SetTsr(v *TsrResponse) *CreateSourceResponse {
	s.Tsr = v
	return s
}

func (s *CreateSourceResponse) SetTxHash(v string) *CreateSourceResponse {
	s.TxHash = &v
	return s
}

type GetSourceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 描述本条存证在存证事务中的阶段，用户可自行维护
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 存证事务id
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 存证凭据
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
}

func (s GetSourceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetSourceRequest) GoString() string {
	return s.String()
}

func (s *GetSourceRequest) SetAuthToken(v string) *GetSourceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetSourceRequest) SetProductInstanceId(v string) *GetSourceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetSourceRequest) SetLocation(v *Location) *GetSourceRequest {
	s.Location = v
	return s
}

func (s *GetSourceRequest) SetPhase(v string) *GetSourceRequest {
	s.Phase = &v
	return s
}

func (s *GetSourceRequest) SetProperties(v string) *GetSourceRequest {
	s.Properties = &v
	return s
}

func (s *GetSourceRequest) SetTransactionId(v string) *GetSourceRequest {
	s.TransactionId = &v
	return s
}

func (s *GetSourceRequest) SetTxHash(v string) *GetSourceRequest {
	s.TxHash = &v
	return s
}

type GetSourceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件下载地址
	OssPath *string `json:"oss_path,omitempty" xml:"oss_path,omitempty"`
}

func (s GetSourceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetSourceResponse) GoString() string {
	return s.String()
}

func (s *GetSourceResponse) SetReqMsgId(v string) *GetSourceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetSourceResponse) SetResultCode(v string) *GetSourceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetSourceResponse) SetResultMsg(v string) *GetSourceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetSourceResponse) SetOssPath(v string) *GetSourceResponse {
	s.OssPath = &v
	return s
}

type CheckStatusRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 存证核验数据组
	NotaryCheckMetaList []*NotaryCheckMeta `json:"notary_check_meta_list,omitempty" xml:"notary_check_meta_list,omitempty" require:"true" type:"Repeated"`
}

func (s CheckStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckStatusRequest) GoString() string {
	return s.String()
}

func (s *CheckStatusRequest) SetAuthToken(v string) *CheckStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckStatusRequest) SetProductInstanceId(v string) *CheckStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckStatusRequest) SetNotaryCheckMetaList(v []*NotaryCheckMeta) *CheckStatusRequest {
	s.NotaryCheckMetaList = v
	return s
}

type CheckStatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证核验结果
	NotaryCheckResults []*NotaryCheckResult `json:"notary_check_results,omitempty" xml:"notary_check_results,omitempty" type:"Repeated"`
}

func (s CheckStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckStatusResponse) GoString() string {
	return s.String()
}

func (s *CheckStatusResponse) SetReqMsgId(v string) *CheckStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckStatusResponse) SetResultCode(v string) *CheckStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckStatusResponse) SetResultMsg(v string) *CheckStatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckStatusResponse) SetNotaryCheckResults(v []*NotaryCheckResult) *CheckStatusResponse {
	s.NotaryCheckResults = v
	return s
}

type DeployLeaseContractRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租赁服务平台对应的合约ID
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty" require:"true"`
}

func (s DeployLeaseContractRequest) String() string {
	return tea.Prettify(s)
}

func (s DeployLeaseContractRequest) GoString() string {
	return s.String()
}

func (s *DeployLeaseContractRequest) SetAuthToken(v string) *DeployLeaseContractRequest {
	s.AuthToken = &v
	return s
}

func (s *DeployLeaseContractRequest) SetProductInstanceId(v string) *DeployLeaseContractRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeployLeaseContractRequest) SetContractId(v string) *DeployLeaseContractRequest {
	s.ContractId = &v
	return s
}

type DeployLeaseContractResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码
	// 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 合约部署成功的交易哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s DeployLeaseContractResponse) String() string {
	return tea.Prettify(s)
}

func (s DeployLeaseContractResponse) GoString() string {
	return s.String()
}

func (s *DeployLeaseContractResponse) SetReqMsgId(v string) *DeployLeaseContractResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeployLeaseContractResponse) SetResultCode(v string) *DeployLeaseContractResponse {
	s.ResultCode = &v
	return s
}

func (s *DeployLeaseContractResponse) SetResultMsg(v string) *DeployLeaseContractResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeployLeaseContractResponse) SetCode(v int64) *DeployLeaseContractResponse {
	s.Code = &v
	return s
}

func (s *DeployLeaseContractResponse) SetErrMessage(v string) *DeployLeaseContractResponse {
	s.ErrMessage = &v
	return s
}

func (s *DeployLeaseContractResponse) SetResponseData(v string) *DeployLeaseContractResponse {
	s.ResponseData = &v
	return s
}

type CreateLeaseProductinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合约id
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 保证金  精确到毫厘，即123400表示12.34元
	DepositPrice *int64 `json:"deposit_price,omitempty" xml:"deposit_price,omitempty" require:"true"`
	// 安装拆卸费 精确到毫厘，即123400表示12.34元
	InstallPrice *int64 `json:"install_price,omitempty" xml:"install_price,omitempty" require:"true"`
	// 租赁服务平台id
	LeaseId *string `json:"lease_id,omitempty" xml:"lease_id,omitempty" require:"true"`
	// 一级分类
	MainClass *string `json:"main_class,omitempty" xml:"main_class,omitempty" require:"true"`
	// 商品编码 长度不可超过50
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty" require:"true"`
	// 商品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true"`
	// 采购价  精确到毫厘，即123400表示12.34元
	ProductPrice *int64 `json:"product_price,omitempty" xml:"product_price,omitempty" require:"true"`
	// 出租详细信息
	Rentinfos []*RentInfo `json:"rentinfos,omitempty" xml:"rentinfos,omitempty" require:"true" type:"Repeated"`
	// 二级分类
	SubClass *string `json:"sub_class,omitempty" xml:"sub_class,omitempty" require:"true"`
	// 供应商id
	SupplierId *string `json:"supplier_id,omitempty" xml:"supplier_id,omitempty"`
	// 供应商
	SupplierName *string `json:"supplier_name,omitempty" xml:"supplier_name,omitempty" require:"true"`
	// 供应商对该产品版本
	SupplierVersion *string `json:"supplier_version,omitempty" xml:"supplier_version,omitempty"`
	// 商品目录额外信息
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
}

func (s CreateLeaseProductinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseProductinfoRequest) GoString() string {
	return s.String()
}

func (s *CreateLeaseProductinfoRequest) SetAuthToken(v string) *CreateLeaseProductinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeaseProductinfoRequest) SetProductInstanceId(v string) *CreateLeaseProductinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeaseProductinfoRequest) SetApplicationId(v string) *CreateLeaseProductinfoRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateLeaseProductinfoRequest) SetDepositPrice(v int64) *CreateLeaseProductinfoRequest {
	s.DepositPrice = &v
	return s
}

func (s *CreateLeaseProductinfoRequest) SetInstallPrice(v int64) *CreateLeaseProductinfoRequest {
	s.InstallPrice = &v
	return s
}

func (s *CreateLeaseProductinfoRequest) SetLeaseId(v string) *CreateLeaseProductinfoRequest {
	s.LeaseId = &v
	return s
}

func (s *CreateLeaseProductinfoRequest) SetMainClass(v string) *CreateLeaseProductinfoRequest {
	s.MainClass = &v
	return s
}

func (s *CreateLeaseProductinfoRequest) SetProductId(v string) *CreateLeaseProductinfoRequest {
	s.ProductId = &v
	return s
}

func (s *CreateLeaseProductinfoRequest) SetProductName(v string) *CreateLeaseProductinfoRequest {
	s.ProductName = &v
	return s
}

func (s *CreateLeaseProductinfoRequest) SetProductPrice(v int64) *CreateLeaseProductinfoRequest {
	s.ProductPrice = &v
	return s
}

func (s *CreateLeaseProductinfoRequest) SetRentinfos(v []*RentInfo) *CreateLeaseProductinfoRequest {
	s.Rentinfos = v
	return s
}

func (s *CreateLeaseProductinfoRequest) SetSubClass(v string) *CreateLeaseProductinfoRequest {
	s.SubClass = &v
	return s
}

func (s *CreateLeaseProductinfoRequest) SetSupplierId(v string) *CreateLeaseProductinfoRequest {
	s.SupplierId = &v
	return s
}

func (s *CreateLeaseProductinfoRequest) SetSupplierName(v string) *CreateLeaseProductinfoRequest {
	s.SupplierName = &v
	return s
}

func (s *CreateLeaseProductinfoRequest) SetSupplierVersion(v string) *CreateLeaseProductinfoRequest {
	s.SupplierVersion = &v
	return s
}

func (s *CreateLeaseProductinfoRequest) SetExtraInfo(v string) *CreateLeaseProductinfoRequest {
	s.ExtraInfo = &v
	return s
}

type CreateLeaseProductinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 用户信息存储到合约中对应的区块链交易哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s CreateLeaseProductinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseProductinfoResponse) GoString() string {
	return s.String()
}

func (s *CreateLeaseProductinfoResponse) SetReqMsgId(v string) *CreateLeaseProductinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeaseProductinfoResponse) SetResultCode(v string) *CreateLeaseProductinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeaseProductinfoResponse) SetResultMsg(v string) *CreateLeaseProductinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeaseProductinfoResponse) SetCode(v int64) *CreateLeaseProductinfoResponse {
	s.Code = &v
	return s
}

func (s *CreateLeaseProductinfoResponse) SetErrMessage(v string) *CreateLeaseProductinfoResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateLeaseProductinfoResponse) SetResponseData(v string) *CreateLeaseProductinfoResponse {
	s.ResponseData = &v
	return s
}

type AuthLeaseContractRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 融资服务平台ID 长度不可超过50
	CreditId *string `json:"credit_id,omitempty" xml:"credit_id,omitempty" require:"true"`
}

func (s AuthLeaseContractRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthLeaseContractRequest) GoString() string {
	return s.String()
}

func (s *AuthLeaseContractRequest) SetAuthToken(v string) *AuthLeaseContractRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthLeaseContractRequest) SetProductInstanceId(v string) *AuthLeaseContractRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthLeaseContractRequest) SetCreditId(v string) *AuthLeaseContractRequest {
	s.CreditId = &v
	return s
}

type AuthLeaseContractResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码
	// 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 授权信息存储到合约中对应的区块链交易哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s AuthLeaseContractResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthLeaseContractResponse) GoString() string {
	return s.String()
}

func (s *AuthLeaseContractResponse) SetReqMsgId(v string) *AuthLeaseContractResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthLeaseContractResponse) SetResultCode(v string) *AuthLeaseContractResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthLeaseContractResponse) SetResultMsg(v string) *AuthLeaseContractResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthLeaseContractResponse) SetCode(v int64) *AuthLeaseContractResponse {
	s.Code = &v
	return s
}

func (s *AuthLeaseContractResponse) SetErrMessage(v string) *AuthLeaseContractResponse {
	s.ErrMessage = &v
	return s
}

func (s *AuthLeaseContractResponse) SetResponseData(v string) *AuthLeaseContractResponse {
	s.ResponseData = &v
	return s
}

type CreateLeaseUserinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 支付宝账号信息
	AlipayUid *string `json:"alipay_uid,omitempty" xml:"alipay_uid,omitempty" require:"true"`
	// 融资租赁业务id，由资方控制台生成返回
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 是否启动异步
	Async *int64 `json:"async,omitempty" xml:"async,omitempty"`
	// 融资租赁用户信息额外字段
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 承租企业统一社会信用代码 长度不可超过50
	LeaseCorpId *string `json:"lease_corp_id,omitempty" xml:"lease_corp_id,omitempty" require:"true"`
	// 承租企业名称 长度不可超过50
	LeaseCorpName *string `json:"lease_corp_name,omitempty" xml:"lease_corp_name,omitempty" require:"true"`
	// 承租法定代表人姓名 长度不可超过50
	LeaseCorpOwnerName *string `json:"lease_corp_owner_name,omitempty" xml:"lease_corp_owner_name,omitempty" require:"true"`
	// 用户登录名，租赁平台会员ID/支付宝ID 长度不可超过50
	LoginId *string `json:"login_id,omitempty" xml:"login_id,omitempty" require:"true"`
	// 用户登录时间 格式为2019-8-31 12:00:00
	LoginTime *string `json:"login_time,omitempty" xml:"login_time,omitempty" require:"true"`
	// 用户登录名类型 1.商户会员2.支付宝3.其他
	LoginType *int64 `json:"login_type,omitempty" xml:"login_type,omitempty" require:"true"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 区块链认证Hash，若为支付宝实人，必填
	UserBlockchainVerifyHash *string `json:"user_blockchain_verify_hash,omitempty" xml:"user_blockchain_verify_hash,omitempty"`
	// 承租人电子邮件，法院/仲裁电子送达必填项，长度不超过5
	UserEmail *string `json:"user_email,omitempty" xml:"user_email,omitempty"`
	// 承租人身份证
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 承租人身份证照片哈希
	UserImageHash *string `json:"user_image_hash,omitempty" xml:"user_image_hash,omitempty" require:"true"`
	// 承租人身份证照片存证交易哈希
	UserImageTxHash *string `json:"user_image_tx_hash,omitempty" xml:"user_image_tx_hash,omitempty" require:"true"`
	// 承租人姓名 长度不可超过10
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 承租人手机号
	UserPhoneNumber *string `json:"user_phone_number,omitempty" xml:"user_phone_number,omitempty" require:"true"`
	// 身份认证类型 1支付宝实人，2芝麻实人，3非蚂蚁实人
	UserType *int64 `json:"user_type,omitempty" xml:"user_type,omitempty" require:"true"`
	// 额外通知第三方，如果需要通知相关方外的第三方，需要在此设置关联方的租户id，若不设置则只通知资方
	RelatedNotify []*string `json:"related_notify,omitempty" xml:"related_notify,omitempty" type:"Repeated"`
}

func (s CreateLeaseUserinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseUserinfoRequest) GoString() string {
	return s.String()
}

func (s *CreateLeaseUserinfoRequest) SetAuthToken(v string) *CreateLeaseUserinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeaseUserinfoRequest) SetProductInstanceId(v string) *CreateLeaseUserinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeaseUserinfoRequest) SetAlipayUid(v string) *CreateLeaseUserinfoRequest {
	s.AlipayUid = &v
	return s
}

func (s *CreateLeaseUserinfoRequest) SetApplicationId(v string) *CreateLeaseUserinfoRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateLeaseUserinfoRequest) SetAsync(v int64) *CreateLeaseUserinfoRequest {
	s.Async = &v
	return s
}

func (s *CreateLeaseUserinfoRequest) SetExtraInfo(v string) *CreateLeaseUserinfoRequest {
	s.ExtraInfo = &v
	return s
}

func (s *CreateLeaseUserinfoRequest) SetLeaseCorpId(v string) *CreateLeaseUserinfoRequest {
	s.LeaseCorpId = &v
	return s
}

func (s *CreateLeaseUserinfoRequest) SetLeaseCorpName(v string) *CreateLeaseUserinfoRequest {
	s.LeaseCorpName = &v
	return s
}

func (s *CreateLeaseUserinfoRequest) SetLeaseCorpOwnerName(v string) *CreateLeaseUserinfoRequest {
	s.LeaseCorpOwnerName = &v
	return s
}

func (s *CreateLeaseUserinfoRequest) SetLoginId(v string) *CreateLeaseUserinfoRequest {
	s.LoginId = &v
	return s
}

func (s *CreateLeaseUserinfoRequest) SetLoginTime(v string) *CreateLeaseUserinfoRequest {
	s.LoginTime = &v
	return s
}

func (s *CreateLeaseUserinfoRequest) SetLoginType(v int64) *CreateLeaseUserinfoRequest {
	s.LoginType = &v
	return s
}

func (s *CreateLeaseUserinfoRequest) SetOrderId(v string) *CreateLeaseUserinfoRequest {
	s.OrderId = &v
	return s
}

func (s *CreateLeaseUserinfoRequest) SetUserBlockchainVerifyHash(v string) *CreateLeaseUserinfoRequest {
	s.UserBlockchainVerifyHash = &v
	return s
}

func (s *CreateLeaseUserinfoRequest) SetUserEmail(v string) *CreateLeaseUserinfoRequest {
	s.UserEmail = &v
	return s
}

func (s *CreateLeaseUserinfoRequest) SetUserId(v string) *CreateLeaseUserinfoRequest {
	s.UserId = &v
	return s
}

func (s *CreateLeaseUserinfoRequest) SetUserImageHash(v string) *CreateLeaseUserinfoRequest {
	s.UserImageHash = &v
	return s
}

func (s *CreateLeaseUserinfoRequest) SetUserImageTxHash(v string) *CreateLeaseUserinfoRequest {
	s.UserImageTxHash = &v
	return s
}

func (s *CreateLeaseUserinfoRequest) SetUserName(v string) *CreateLeaseUserinfoRequest {
	s.UserName = &v
	return s
}

func (s *CreateLeaseUserinfoRequest) SetUserPhoneNumber(v string) *CreateLeaseUserinfoRequest {
	s.UserPhoneNumber = &v
	return s
}

func (s *CreateLeaseUserinfoRequest) SetUserType(v int64) *CreateLeaseUserinfoRequest {
	s.UserType = &v
	return s
}

func (s *CreateLeaseUserinfoRequest) SetRelatedNotify(v []*string) *CreateLeaseUserinfoRequest {
	s.RelatedNotify = v
	return s
}

type CreateLeaseUserinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 用户信息存储到合约中对应的区块链交易哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s CreateLeaseUserinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseUserinfoResponse) GoString() string {
	return s.String()
}

func (s *CreateLeaseUserinfoResponse) SetReqMsgId(v string) *CreateLeaseUserinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeaseUserinfoResponse) SetResultCode(v string) *CreateLeaseUserinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeaseUserinfoResponse) SetResultMsg(v string) *CreateLeaseUserinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeaseUserinfoResponse) SetCode(v int64) *CreateLeaseUserinfoResponse {
	s.Code = &v
	return s
}

func (s *CreateLeaseUserinfoResponse) SetErrMessage(v string) *CreateLeaseUserinfoResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateLeaseUserinfoResponse) SetResponseData(v string) *CreateLeaseUserinfoResponse {
	s.ResponseData = &v
	return s
}

type CreateLeaseOrderinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 实际预授权金额，芝麻信用免押金额 精确到毫厘，即123400表示12.34元
	AcutalPreAuthFree *int64 `json:"acutal_pre_auth_free,omitempty" xml:"acutal_pre_auth_free,omitempty" require:"true"`
	// 融资租赁业务id，由资方控制台创建返回
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 是否启动异步处理订单
	Async *int64 `json:"async,omitempty" xml:"async,omitempty"`
	// 采购发票地址
	BillUrl *string `json:"bill_url,omitempty" xml:"bill_url,omitempty"`
	// 到期买断价 精确到毫厘，即123400表示12.34元
	BuyOutPrice *int64 `json:"buy_out_price,omitempty" xml:"buy_out_price,omitempty" require:"true"`
	// 市编码
	CityCode *string `json:"city_code,omitempty" xml:"city_code,omitempty"`
	// 免押金额 精确到毫厘，即123400表示12.34元
	DepositFree *int64 `json:"deposit_free,omitempty" xml:"deposit_free,omitempty" require:"true"`
	// 区编码
	DistrictCode *string `json:"district_code,omitempty" xml:"district_code,omitempty"`
	// 融资租赁额外字段
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 安装服务记录哈希
	InstallHash *string `json:"install_hash,omitempty" xml:"install_hash,omitempty"`
	// 安装拆卸费 精确到毫厘，即123400表示12.34元
	InstallPrice *int64 `json:"install_price,omitempty" xml:"install_price,omitempty"`
	// 安装服务记录链上存证交易哈希
	InstallTxHash *string `json:"install_tx_hash,omitempty" xml:"install_tx_hash,omitempty"`
	// 保险单号
	InsuranceNumber *string `json:"insurance_number,omitempty" xml:"insurance_number,omitempty"`
	// 保险链接
	InsuranceUrl *string `json:"insurance_url,omitempty" xml:"insurance_url,omitempty"`
	// 租赁物入库日  格式为2019-8-31 12:00:00
	InStoreTime *string `json:"in_store_time,omitempty" xml:"in_store_time,omitempty"`
	// 订单额外信息
	LeaseOrderExtra []*LeaseOrderExtra `json:"lease_order_extra,omitempty" xml:"lease_order_extra,omitempty" type:"Repeated"`
	// 融资租赁及服务协议之补充协议文件
	LeaseServiceAdditionalFileHash *string `json:"lease_service_additional_file_hash,omitempty" xml:"lease_service_additional_file_hash,omitempty"`
	// 融资租赁及服务协议之补充协议文件链上存证交易哈希
	LeaseServiceAdditionalFileTxHash *string `json:"lease_service_additional_file_tx_hash,omitempty" xml:"lease_service_additional_file_tx_hash,omitempty"`
	// 融资租赁及服务协议文件hash，三方协议
	LeaseServiceFileHash *string `json:"lease_service_file_hash,omitempty" xml:"lease_service_file_hash,omitempty" require:"true"`
	// 融资租赁及服务协议文件链上存证交易哈希
	LeaseServiceFileTxHash *string `json:"lease_service_file_tx_hash,omitempty" xml:"lease_service_file_tx_hash,omitempty" require:"true"`
	// 订单创建时间 格式为2019-8-31 12:00:00
	OrderCreateTime *string `json:"order_create_time,omitempty" xml:"order_create_time,omitempty" require:"true"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 支付订单ID
	OrderPayId *string `json:"order_pay_id,omitempty" xml:"order_pay_id,omitempty"`
	// 订单支付时间 格式为2019-8-31 12:00:00
	OrderPayTime *string `json:"order_pay_time,omitempty" xml:"order_pay_time,omitempty" require:"true"`
	// 订单支付类型 1 预授权，2信用套餐，3支付宝代扣，4其他
	OrderPayType *int64 `json:"order_pay_type,omitempty" xml:"order_pay_type,omitempty"`
	// 租赁物出库物流编号
	OutStoreDeliverNumber *string `json:"out_store_deliver_number,omitempty" xml:"out_store_deliver_number,omitempty"`
	// 租赁物出库日  格式为2019-8-31 12:00:00
	OutStoreTime *string `json:"out_store_time,omitempty" xml:"out_store_time,omitempty"`
	// 支付凭证地址
	PayProofUrl *string `json:"pay_proof_url,omitempty" xml:"pay_proof_url,omitempty"`
	// 预授权支付订单ID
	PreAuthPayOrderId *string `json:"pre_auth_pay_order_id,omitempty" xml:"pre_auth_pay_order_id,omitempty"`
	// 产品详细信息
	ProductInfo []*ProductInfo `json:"product_info,omitempty" xml:"product_info,omitempty" require:"true" type:"Repeated"`
	// 省编码
	ProvinceCode *string `json:"province_code,omitempty" xml:"province_code,omitempty"`
	// 采购发票文件哈希
	PurchaseContractBillHash *string `json:"purchase_contract_bill_hash,omitempty" xml:"purchase_contract_bill_hash,omitempty"`
	// 采购发票文件链上存证交易哈希
	PurchaseContractBillTxHash *string `json:"purchase_contract_bill_tx_hash,omitempty" xml:"purchase_contract_bill_tx_hash,omitempty"`
	// 采购合同文件哈希
	PurchaseContractHash *string `json:"purchase_contract_hash,omitempty" xml:"purchase_contract_hash,omitempty"`
	// 采购合同文件链上存证交易哈希
	PurchaseContractTxHash *string `json:"purchase_contract_tx_hash,omitempty" xml:"purchase_contract_tx_hash,omitempty"`
	// 采购合同地址
	PurchaseContractUrl *string `json:"purchase_contract_url,omitempty" xml:"purchase_contract_url,omitempty"`
	// 额外通知第三方，如果需要通知相关方外的第三方，需要在此设置关联方的租户id，若不设置则只通知资方
	//
	RelatedNotify []*string `json:"related_notify,omitempty" xml:"related_notify,omitempty" type:"Repeated"`
	// 租赁合同地址
	RentContractUrl *string `json:"rent_contract_url,omitempty" xml:"rent_contract_url,omitempty"`
	// 月租金 精确到毫厘，即123400表示12.34元
	RentPricePerMonth *int64 `json:"rent_price_per_month,omitempty" xml:"rent_price_per_month,omitempty" require:"true"`
	// 租期
	RentTerm *int64 `json:"rent_term,omitempty" xml:"rent_term,omitempty" require:"true"`
	// 承租人签收记录哈希
	SignHash *string `json:"sign_hash,omitempty" xml:"sign_hash,omitempty"`
	// 承租人签收时间  格式为2019-8-31 12:00:00
	SignTime *string `json:"sign_time,omitempty" xml:"sign_time,omitempty"`
	// 承租人签收记录链上存证哈希
	SignTxHash *string `json:"sign_tx_hash,omitempty" xml:"sign_tx_hash,omitempty"`
	// 仓库类型 1实体仓 2虚拟仓
	StoreType *int64 `json:"store_type,omitempty" xml:"store_type,omitempty"`
	// 补充协议地址
	SupplementProtocolUrl *string `json:"supplement_protocol_url,omitempty" xml:"supplement_protocol_url,omitempty"`
	// 供应商对应的金融科技租户id，若有此字段，则会授权相应的供应商上传采购等相关信息
	SupplierIsvAccount *string `json:"supplier_isv_account,omitempty" xml:"supplier_isv_account,omitempty"`
	// 承租人收货地址
	UserAddress *string `json:"user_address,omitempty" xml:"user_address,omitempty" require:"true"`
	// 智能合同的合同id
	LeaseServiceContractId *string `json:"lease_service_contract_id,omitempty" xml:"lease_service_contract_id,omitempty"`
	// 网商直付通模式的代扣协议号
	AgreementNo *string `json:"agreement_no,omitempty" xml:"agreement_no,omitempty"`
	// 直付通代扣受理订单号
	AgreementOrderId *string `json:"agreement_order_id,omitempty" xml:"agreement_order_id,omitempty"`
	// 单位是毫厘，123400
	DownPayment *int64 `json:"down_payment,omitempty" xml:"down_payment,omitempty"`
}

func (s CreateLeaseOrderinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseOrderinfoRequest) GoString() string {
	return s.String()
}

func (s *CreateLeaseOrderinfoRequest) SetAuthToken(v string) *CreateLeaseOrderinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetProductInstanceId(v string) *CreateLeaseOrderinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetAcutalPreAuthFree(v int64) *CreateLeaseOrderinfoRequest {
	s.AcutalPreAuthFree = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetApplicationId(v string) *CreateLeaseOrderinfoRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetAsync(v int64) *CreateLeaseOrderinfoRequest {
	s.Async = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetBillUrl(v string) *CreateLeaseOrderinfoRequest {
	s.BillUrl = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetBuyOutPrice(v int64) *CreateLeaseOrderinfoRequest {
	s.BuyOutPrice = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetCityCode(v string) *CreateLeaseOrderinfoRequest {
	s.CityCode = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetDepositFree(v int64) *CreateLeaseOrderinfoRequest {
	s.DepositFree = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetDistrictCode(v string) *CreateLeaseOrderinfoRequest {
	s.DistrictCode = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetExtraInfo(v string) *CreateLeaseOrderinfoRequest {
	s.ExtraInfo = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetInstallHash(v string) *CreateLeaseOrderinfoRequest {
	s.InstallHash = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetInstallPrice(v int64) *CreateLeaseOrderinfoRequest {
	s.InstallPrice = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetInstallTxHash(v string) *CreateLeaseOrderinfoRequest {
	s.InstallTxHash = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetInsuranceNumber(v string) *CreateLeaseOrderinfoRequest {
	s.InsuranceNumber = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetInsuranceUrl(v string) *CreateLeaseOrderinfoRequest {
	s.InsuranceUrl = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetInStoreTime(v string) *CreateLeaseOrderinfoRequest {
	s.InStoreTime = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetLeaseOrderExtra(v []*LeaseOrderExtra) *CreateLeaseOrderinfoRequest {
	s.LeaseOrderExtra = v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetLeaseServiceAdditionalFileHash(v string) *CreateLeaseOrderinfoRequest {
	s.LeaseServiceAdditionalFileHash = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetLeaseServiceAdditionalFileTxHash(v string) *CreateLeaseOrderinfoRequest {
	s.LeaseServiceAdditionalFileTxHash = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetLeaseServiceFileHash(v string) *CreateLeaseOrderinfoRequest {
	s.LeaseServiceFileHash = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetLeaseServiceFileTxHash(v string) *CreateLeaseOrderinfoRequest {
	s.LeaseServiceFileTxHash = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetOrderCreateTime(v string) *CreateLeaseOrderinfoRequest {
	s.OrderCreateTime = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetOrderId(v string) *CreateLeaseOrderinfoRequest {
	s.OrderId = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetOrderPayId(v string) *CreateLeaseOrderinfoRequest {
	s.OrderPayId = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetOrderPayTime(v string) *CreateLeaseOrderinfoRequest {
	s.OrderPayTime = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetOrderPayType(v int64) *CreateLeaseOrderinfoRequest {
	s.OrderPayType = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetOutStoreDeliverNumber(v string) *CreateLeaseOrderinfoRequest {
	s.OutStoreDeliverNumber = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetOutStoreTime(v string) *CreateLeaseOrderinfoRequest {
	s.OutStoreTime = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetPayProofUrl(v string) *CreateLeaseOrderinfoRequest {
	s.PayProofUrl = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetPreAuthPayOrderId(v string) *CreateLeaseOrderinfoRequest {
	s.PreAuthPayOrderId = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetProductInfo(v []*ProductInfo) *CreateLeaseOrderinfoRequest {
	s.ProductInfo = v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetProvinceCode(v string) *CreateLeaseOrderinfoRequest {
	s.ProvinceCode = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetPurchaseContractBillHash(v string) *CreateLeaseOrderinfoRequest {
	s.PurchaseContractBillHash = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetPurchaseContractBillTxHash(v string) *CreateLeaseOrderinfoRequest {
	s.PurchaseContractBillTxHash = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetPurchaseContractHash(v string) *CreateLeaseOrderinfoRequest {
	s.PurchaseContractHash = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetPurchaseContractTxHash(v string) *CreateLeaseOrderinfoRequest {
	s.PurchaseContractTxHash = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetPurchaseContractUrl(v string) *CreateLeaseOrderinfoRequest {
	s.PurchaseContractUrl = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetRelatedNotify(v []*string) *CreateLeaseOrderinfoRequest {
	s.RelatedNotify = v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetRentContractUrl(v string) *CreateLeaseOrderinfoRequest {
	s.RentContractUrl = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetRentPricePerMonth(v int64) *CreateLeaseOrderinfoRequest {
	s.RentPricePerMonth = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetRentTerm(v int64) *CreateLeaseOrderinfoRequest {
	s.RentTerm = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetSignHash(v string) *CreateLeaseOrderinfoRequest {
	s.SignHash = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetSignTime(v string) *CreateLeaseOrderinfoRequest {
	s.SignTime = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetSignTxHash(v string) *CreateLeaseOrderinfoRequest {
	s.SignTxHash = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetStoreType(v int64) *CreateLeaseOrderinfoRequest {
	s.StoreType = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetSupplementProtocolUrl(v string) *CreateLeaseOrderinfoRequest {
	s.SupplementProtocolUrl = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetSupplierIsvAccount(v string) *CreateLeaseOrderinfoRequest {
	s.SupplierIsvAccount = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetUserAddress(v string) *CreateLeaseOrderinfoRequest {
	s.UserAddress = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetLeaseServiceContractId(v string) *CreateLeaseOrderinfoRequest {
	s.LeaseServiceContractId = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetAgreementNo(v string) *CreateLeaseOrderinfoRequest {
	s.AgreementNo = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetAgreementOrderId(v string) *CreateLeaseOrderinfoRequest {
	s.AgreementOrderId = &v
	return s
}

func (s *CreateLeaseOrderinfoRequest) SetDownPayment(v int64) *CreateLeaseOrderinfoRequest {
	s.DownPayment = &v
	return s
}

type CreateLeaseOrderinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码
	// 0 表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 订单产品/服务信息存储到合约中对应的区块链交易哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s CreateLeaseOrderinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseOrderinfoResponse) GoString() string {
	return s.String()
}

func (s *CreateLeaseOrderinfoResponse) SetReqMsgId(v string) *CreateLeaseOrderinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeaseOrderinfoResponse) SetResultCode(v string) *CreateLeaseOrderinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeaseOrderinfoResponse) SetResultMsg(v string) *CreateLeaseOrderinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeaseOrderinfoResponse) SetCode(v int64) *CreateLeaseOrderinfoResponse {
	s.Code = &v
	return s
}

func (s *CreateLeaseOrderinfoResponse) SetErrMessage(v string) *CreateLeaseOrderinfoResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateLeaseOrderinfoResponse) SetResponseData(v string) *CreateLeaseOrderinfoResponse {
	s.ResponseData = &v
	return s
}

type CreateLeasePromiseRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 融资租赁业务id，由资方控制台生成返回
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 审核方式,0为系统自动审核，1为人工审核
	AuditMode *int64 `json:"audit_mode,omitempty" xml:"audit_mode,omitempty" require:"true"`
	// 清分机构金融科技租户ID
	ClearingOrg *string `json:"clearing_org,omitempty" xml:"clearing_org,omitempty" require:"true"`
	// 放款机构金融科技租户ID
	CreditOrg *string `json:"credit_org,omitempty" xml:"credit_org,omitempty" require:"true"`
	// 第一次还款时的日期
	FirstPayDate *string `json:"first_pay_date,omitempty" xml:"first_pay_date,omitempty"`
	// 融资机构的阿里uid
	LeaseAlipayUid *string `json:"lease_alipay_uid,omitempty" xml:"lease_alipay_uid,omitempty" require:"true"`
	// 宽限期，精确到毫秒
	Limit *int64 `json:"limit,omitempty" xml:"limit,omitempty" require:"true"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 应付租金，精确到毫厘，即123400表示12.34元
	PayDateList []*string `json:"pay_date_list,omitempty" xml:"pay_date_list,omitempty" require:"true" type:"Repeated"`
	// 租赁方承诺额外字段
	PayExtraInfoList []*string `json:"pay_extra_info_list,omitempty" xml:"pay_extra_info_list,omitempty" type:"Repeated"`
	// 应付租金 精确到毫厘，即123400表示12.34元
	//
	PayMoney *int64 `json:"pay_money,omitempty" xml:"pay_money,omitempty"`
	// 应付租金 精确到毫厘，即123400表示12.34元
	PayMoneyList []*int64 `json:"pay_money_list,omitempty" xml:"pay_money_list,omitempty" require:"true" type:"Repeated"`
	// 应付租金的期数
	PayPeriod *int64 `json:"pay_period,omitempty" xml:"pay_period,omitempty" require:"true"`
	// 是否启动异步订单处理
	Async *int64 `json:"async,omitempty" xml:"async,omitempty"`
	// 首付款代扣流水号，最大长度是128
	DownPaymentSerialNumber *string `json:"down_payment_serial_number,omitempty" xml:"down_payment_serial_number,omitempty" maxLength:"128" minLength:"0"`
}

func (s CreateLeasePromiseRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeasePromiseRequest) GoString() string {
	return s.String()
}

func (s *CreateLeasePromiseRequest) SetAuthToken(v string) *CreateLeasePromiseRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeasePromiseRequest) SetProductInstanceId(v string) *CreateLeasePromiseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeasePromiseRequest) SetApplicationId(v string) *CreateLeasePromiseRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateLeasePromiseRequest) SetAuditMode(v int64) *CreateLeasePromiseRequest {
	s.AuditMode = &v
	return s
}

func (s *CreateLeasePromiseRequest) SetClearingOrg(v string) *CreateLeasePromiseRequest {
	s.ClearingOrg = &v
	return s
}

func (s *CreateLeasePromiseRequest) SetCreditOrg(v string) *CreateLeasePromiseRequest {
	s.CreditOrg = &v
	return s
}

func (s *CreateLeasePromiseRequest) SetFirstPayDate(v string) *CreateLeasePromiseRequest {
	s.FirstPayDate = &v
	return s
}

func (s *CreateLeasePromiseRequest) SetLeaseAlipayUid(v string) *CreateLeasePromiseRequest {
	s.LeaseAlipayUid = &v
	return s
}

func (s *CreateLeasePromiseRequest) SetLimit(v int64) *CreateLeasePromiseRequest {
	s.Limit = &v
	return s
}

func (s *CreateLeasePromiseRequest) SetOrderId(v string) *CreateLeasePromiseRequest {
	s.OrderId = &v
	return s
}

func (s *CreateLeasePromiseRequest) SetPayDateList(v []*string) *CreateLeasePromiseRequest {
	s.PayDateList = v
	return s
}

func (s *CreateLeasePromiseRequest) SetPayExtraInfoList(v []*string) *CreateLeasePromiseRequest {
	s.PayExtraInfoList = v
	return s
}

func (s *CreateLeasePromiseRequest) SetPayMoney(v int64) *CreateLeasePromiseRequest {
	s.PayMoney = &v
	return s
}

func (s *CreateLeasePromiseRequest) SetPayMoneyList(v []*int64) *CreateLeasePromiseRequest {
	s.PayMoneyList = v
	return s
}

func (s *CreateLeasePromiseRequest) SetPayPeriod(v int64) *CreateLeasePromiseRequest {
	s.PayPeriod = &v
	return s
}

func (s *CreateLeasePromiseRequest) SetAsync(v int64) *CreateLeasePromiseRequest {
	s.Async = &v
	return s
}

func (s *CreateLeasePromiseRequest) SetDownPaymentSerialNumber(v string) *CreateLeasePromiseRequest {
	s.DownPaymentSerialNumber = &v
	return s
}

type CreateLeasePromiseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 租方承诺信息存储到合约中对应的区块链交易哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s CreateLeasePromiseResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeasePromiseResponse) GoString() string {
	return s.String()
}

func (s *CreateLeasePromiseResponse) SetReqMsgId(v string) *CreateLeasePromiseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeasePromiseResponse) SetResultCode(v string) *CreateLeasePromiseResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeasePromiseResponse) SetResultMsg(v string) *CreateLeasePromiseResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeasePromiseResponse) SetCode(v int64) *CreateLeasePromiseResponse {
	s.Code = &v
	return s
}

func (s *CreateLeasePromiseResponse) SetErrMessage(v string) *CreateLeasePromiseResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateLeasePromiseResponse) SetResponseData(v string) *CreateLeasePromiseResponse {
	s.ResponseData = &v
	return s
}

type CreateLeaseVerifyinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 融资租赁业务id，由资方控制台生成返回
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 是否启动订单的异步处理
	Async *int64 `json:"async,omitempty" xml:"async,omitempty"`
	// 放款账户
	CardNumber *string `json:"card_number,omitempty" xml:"card_number,omitempty"`
	// 授信终止时间，格式为"2019-07-31 12:00:00"
	CreditEndTime *string `json:"credit_end_time,omitempty" xml:"credit_end_time,omitempty"`
	// 授信额度，精确到毫厘，即123400表示12.34元
	CreditLimit *int64 `json:"credit_limit,omitempty" xml:"credit_limit,omitempty"`
	// 授信起始时间，格式为"2019-07-31 12:00:00"
	CreditStartTime *string `json:"credit_start_time,omitempty" xml:"credit_start_time,omitempty"`
	// 融资租赁审贷信息额外字段
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 承租企业统一社会信用代码 长度不可超过50
	LeaseCorpId *string `json:"lease_corp_id,omitempty" xml:"lease_corp_id,omitempty"`
	// 承租企业名称 长度不可超过50
	LeaseCorpName *string `json:"lease_corp_name,omitempty" xml:"lease_corp_name,omitempty"`
	// 承租法定代表人姓名 长度不可超过50
	LeaseCorpOwnerName *string `json:"lease_corp_owner_name,omitempty" xml:"lease_corp_owner_name,omitempty"`
	// 租赁服务平台id
	LeaseId *string `json:"lease_id,omitempty" xml:"lease_id,omitempty" require:"true"`
	// 放款流水单号
	Loan *string `json:"loan,omitempty" xml:"loan,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 还款计划文件哈希
	PayBackHash *string `json:"pay_back_hash,omitempty" xml:"pay_back_hash,omitempty"`
	// 还款计划文件存证交易哈希
	PayBackTxHash *string `json:"pay_back_tx_hash,omitempty" xml:"pay_back_tx_hash,omitempty"`
	// 承租人身份证
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 承租人姓名 长度不可超过10
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
	// 承租人手机号
	UserPhoneNumber *string `json:"user_phone_number,omitempty" xml:"user_phone_number,omitempty"`
	// 是否通过，0表示不通过，1表示通过
	VerifyResult *int64 `json:"verify_result,omitempty" xml:"verify_result,omitempty" require:"true"`
	// 付款汇款凭证 民盛转账成功后上传
	Voucher *string `json:"voucher,omitempty" xml:"voucher,omitempty"`
	// 拒绝的理由
	VerifyRefuseDesc *string `json:"verify_refuse_desc,omitempty" xml:"verify_refuse_desc,omitempty"`
}

func (s CreateLeaseVerifyinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseVerifyinfoRequest) GoString() string {
	return s.String()
}

func (s *CreateLeaseVerifyinfoRequest) SetAuthToken(v string) *CreateLeaseVerifyinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeaseVerifyinfoRequest) SetProductInstanceId(v string) *CreateLeaseVerifyinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeaseVerifyinfoRequest) SetApplicationId(v string) *CreateLeaseVerifyinfoRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateLeaseVerifyinfoRequest) SetAsync(v int64) *CreateLeaseVerifyinfoRequest {
	s.Async = &v
	return s
}

func (s *CreateLeaseVerifyinfoRequest) SetCardNumber(v string) *CreateLeaseVerifyinfoRequest {
	s.CardNumber = &v
	return s
}

func (s *CreateLeaseVerifyinfoRequest) SetCreditEndTime(v string) *CreateLeaseVerifyinfoRequest {
	s.CreditEndTime = &v
	return s
}

func (s *CreateLeaseVerifyinfoRequest) SetCreditLimit(v int64) *CreateLeaseVerifyinfoRequest {
	s.CreditLimit = &v
	return s
}

func (s *CreateLeaseVerifyinfoRequest) SetCreditStartTime(v string) *CreateLeaseVerifyinfoRequest {
	s.CreditStartTime = &v
	return s
}

func (s *CreateLeaseVerifyinfoRequest) SetExtraInfo(v string) *CreateLeaseVerifyinfoRequest {
	s.ExtraInfo = &v
	return s
}

func (s *CreateLeaseVerifyinfoRequest) SetLeaseCorpId(v string) *CreateLeaseVerifyinfoRequest {
	s.LeaseCorpId = &v
	return s
}

func (s *CreateLeaseVerifyinfoRequest) SetLeaseCorpName(v string) *CreateLeaseVerifyinfoRequest {
	s.LeaseCorpName = &v
	return s
}

func (s *CreateLeaseVerifyinfoRequest) SetLeaseCorpOwnerName(v string) *CreateLeaseVerifyinfoRequest {
	s.LeaseCorpOwnerName = &v
	return s
}

func (s *CreateLeaseVerifyinfoRequest) SetLeaseId(v string) *CreateLeaseVerifyinfoRequest {
	s.LeaseId = &v
	return s
}

func (s *CreateLeaseVerifyinfoRequest) SetLoan(v string) *CreateLeaseVerifyinfoRequest {
	s.Loan = &v
	return s
}

func (s *CreateLeaseVerifyinfoRequest) SetOrderId(v string) *CreateLeaseVerifyinfoRequest {
	s.OrderId = &v
	return s
}

func (s *CreateLeaseVerifyinfoRequest) SetPayBackHash(v string) *CreateLeaseVerifyinfoRequest {
	s.PayBackHash = &v
	return s
}

func (s *CreateLeaseVerifyinfoRequest) SetPayBackTxHash(v string) *CreateLeaseVerifyinfoRequest {
	s.PayBackTxHash = &v
	return s
}

func (s *CreateLeaseVerifyinfoRequest) SetUserId(v string) *CreateLeaseVerifyinfoRequest {
	s.UserId = &v
	return s
}

func (s *CreateLeaseVerifyinfoRequest) SetUserName(v string) *CreateLeaseVerifyinfoRequest {
	s.UserName = &v
	return s
}

func (s *CreateLeaseVerifyinfoRequest) SetUserPhoneNumber(v string) *CreateLeaseVerifyinfoRequest {
	s.UserPhoneNumber = &v
	return s
}

func (s *CreateLeaseVerifyinfoRequest) SetVerifyResult(v int64) *CreateLeaseVerifyinfoRequest {
	s.VerifyResult = &v
	return s
}

func (s *CreateLeaseVerifyinfoRequest) SetVoucher(v string) *CreateLeaseVerifyinfoRequest {
	s.Voucher = &v
	return s
}

func (s *CreateLeaseVerifyinfoRequest) SetVerifyRefuseDesc(v string) *CreateLeaseVerifyinfoRequest {
	s.VerifyRefuseDesc = &v
	return s
}

type CreateLeaseVerifyinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码
	// 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 审贷信息存储到合约中对应的区块链交易哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s CreateLeaseVerifyinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseVerifyinfoResponse) GoString() string {
	return s.String()
}

func (s *CreateLeaseVerifyinfoResponse) SetReqMsgId(v string) *CreateLeaseVerifyinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeaseVerifyinfoResponse) SetResultCode(v string) *CreateLeaseVerifyinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeaseVerifyinfoResponse) SetResultMsg(v string) *CreateLeaseVerifyinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeaseVerifyinfoResponse) SetCode(v int64) *CreateLeaseVerifyinfoResponse {
	s.Code = &v
	return s
}

func (s *CreateLeaseVerifyinfoResponse) SetErrMessage(v string) *CreateLeaseVerifyinfoResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateLeaseVerifyinfoResponse) SetResponseData(v string) *CreateLeaseVerifyinfoResponse {
	s.ResponseData = &v
	return s
}

type CreateLeaseCreditpromiseRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 融资租赁业务id，由资方控制台创建返回
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 融资租赁承诺额外字段
	CreditPromiseExtraInfoList []*string `json:"credit_promise_extra_info_list,omitempty" xml:"credit_promise_extra_info_list,omitempty" type:"Repeated"`
	// 租赁平台金融科技id
	LeaseId *string `json:"lease_id,omitempty" xml:"lease_id,omitempty" require:"true"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 垫付金额
	PayInAdvanceMoney *int64 `json:"pay_in_advance_money,omitempty" xml:"pay_in_advance_money,omitempty"`
	// 垫付金额，精确到毫厘，即123400表示12.34元
	PayInAdvanceMoneyList []*int64 `json:"pay_in_advance_money_list,omitempty" xml:"pay_in_advance_money_list,omitempty" type:"Repeated"`
	// 垫付日期
	PayInAdvanceTime *string `json:"pay_in_advance_time,omitempty" xml:"pay_in_advance_time,omitempty"`
	// 垫付日  格式为2019-8-31 12:00:00
	PayInAdvanceTimeList []*string `json:"pay_in_advance_time_list,omitempty" xml:"pay_in_advance_time_list,omitempty" require:"true" type:"Repeated"`
	// 根据融资租赁合同及其补充协议哈希
	PromiseHash *string `json:"promise_hash,omitempty" xml:"promise_hash,omitempty" require:"true"`
	// 根据融资租赁合同及其补充协议存证交易hash
	PromiseTxHash *string `json:"promise_tx_hash,omitempty" xml:"promise_tx_hash,omitempty" require:"true"`
	// 归还金额
	ReturnMoney *int64 `json:"return_money,omitempty" xml:"return_money,omitempty"`
	// 还款金额，精确到毫厘，即123400表示12.34元
	ReturnMoneyList []*int64 `json:"return_money_list,omitempty" xml:"return_money_list,omitempty" require:"true" type:"Repeated"`
	// 还款比例，精确到小数点后四位 12.34% 表示为1234
	ReturnRate *int64 `json:"return_rate,omitempty" xml:"return_rate,omitempty"`
	// 归还日，格式为"2019-07-31 12:00:00"
	ReturnTime *string `json:"return_time,omitempty" xml:"return_time,omitempty"`
	// 归还日，格式为"2019-07-31 12:00:00"
	ReturnTimeList []*string `json:"return_time_list,omitempty" xml:"return_time_list,omitempty" require:"true" type:"Repeated"`
	// 是否启动异步订单处理
	Async *int64 `json:"async,omitempty" xml:"async,omitempty"`
}

func (s CreateLeaseCreditpromiseRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseCreditpromiseRequest) GoString() string {
	return s.String()
}

func (s *CreateLeaseCreditpromiseRequest) SetAuthToken(v string) *CreateLeaseCreditpromiseRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeaseCreditpromiseRequest) SetProductInstanceId(v string) *CreateLeaseCreditpromiseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeaseCreditpromiseRequest) SetApplicationId(v string) *CreateLeaseCreditpromiseRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateLeaseCreditpromiseRequest) SetCreditPromiseExtraInfoList(v []*string) *CreateLeaseCreditpromiseRequest {
	s.CreditPromiseExtraInfoList = v
	return s
}

func (s *CreateLeaseCreditpromiseRequest) SetLeaseId(v string) *CreateLeaseCreditpromiseRequest {
	s.LeaseId = &v
	return s
}

func (s *CreateLeaseCreditpromiseRequest) SetOrderId(v string) *CreateLeaseCreditpromiseRequest {
	s.OrderId = &v
	return s
}

func (s *CreateLeaseCreditpromiseRequest) SetPayInAdvanceMoney(v int64) *CreateLeaseCreditpromiseRequest {
	s.PayInAdvanceMoney = &v
	return s
}

func (s *CreateLeaseCreditpromiseRequest) SetPayInAdvanceMoneyList(v []*int64) *CreateLeaseCreditpromiseRequest {
	s.PayInAdvanceMoneyList = v
	return s
}

func (s *CreateLeaseCreditpromiseRequest) SetPayInAdvanceTime(v string) *CreateLeaseCreditpromiseRequest {
	s.PayInAdvanceTime = &v
	return s
}

func (s *CreateLeaseCreditpromiseRequest) SetPayInAdvanceTimeList(v []*string) *CreateLeaseCreditpromiseRequest {
	s.PayInAdvanceTimeList = v
	return s
}

func (s *CreateLeaseCreditpromiseRequest) SetPromiseHash(v string) *CreateLeaseCreditpromiseRequest {
	s.PromiseHash = &v
	return s
}

func (s *CreateLeaseCreditpromiseRequest) SetPromiseTxHash(v string) *CreateLeaseCreditpromiseRequest {
	s.PromiseTxHash = &v
	return s
}

func (s *CreateLeaseCreditpromiseRequest) SetReturnMoney(v int64) *CreateLeaseCreditpromiseRequest {
	s.ReturnMoney = &v
	return s
}

func (s *CreateLeaseCreditpromiseRequest) SetReturnMoneyList(v []*int64) *CreateLeaseCreditpromiseRequest {
	s.ReturnMoneyList = v
	return s
}

func (s *CreateLeaseCreditpromiseRequest) SetReturnRate(v int64) *CreateLeaseCreditpromiseRequest {
	s.ReturnRate = &v
	return s
}

func (s *CreateLeaseCreditpromiseRequest) SetReturnTime(v string) *CreateLeaseCreditpromiseRequest {
	s.ReturnTime = &v
	return s
}

func (s *CreateLeaseCreditpromiseRequest) SetReturnTimeList(v []*string) *CreateLeaseCreditpromiseRequest {
	s.ReturnTimeList = v
	return s
}

func (s *CreateLeaseCreditpromiseRequest) SetAsync(v int64) *CreateLeaseCreditpromiseRequest {
	s.Async = &v
	return s
}

type CreateLeaseCreditpromiseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码
	// 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 资方承诺信息存储到合约中对应的区块链交易哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s CreateLeaseCreditpromiseResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseCreditpromiseResponse) GoString() string {
	return s.String()
}

func (s *CreateLeaseCreditpromiseResponse) SetReqMsgId(v string) *CreateLeaseCreditpromiseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeaseCreditpromiseResponse) SetResultCode(v string) *CreateLeaseCreditpromiseResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeaseCreditpromiseResponse) SetResultMsg(v string) *CreateLeaseCreditpromiseResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeaseCreditpromiseResponse) SetCode(v int64) *CreateLeaseCreditpromiseResponse {
	s.Code = &v
	return s
}

func (s *CreateLeaseCreditpromiseResponse) SetErrMessage(v string) *CreateLeaseCreditpromiseResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateLeaseCreditpromiseResponse) SetResponseData(v string) *CreateLeaseCreditpromiseResponse {
	s.ResponseData = &v
	return s
}

type CreateLeaseDisburseinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 共管账户，网商清分
	ActiveAccount *string `json:"active_account,omitempty" xml:"active_account,omitempty" require:"true"`
	// 对结果的简要描述信息
	ActiveResultDesc *string `json:"active_result_desc,omitempty" xml:"active_result_desc,omitempty" require:"true"`
	// 成功/失败 0表示失败，1表示成功
	ActiveResultStatus *int64 `json:"active_result_status,omitempty" xml:"active_result_status,omitempty" require:"true"`
	// 授信成功日期，格式为"2019-07-31 12:00:00"
	ActiveReturnDate *string `json:"active_return_date,omitempty" xml:"active_return_date,omitempty" require:"true"`
	// 本金+利息，精确到毫厘，即123400表示12.34元
	ActiveReturnMoney *int64 `json:"active_return_money,omitempty" xml:"active_return_money,omitempty" require:"true"`
	// 支用期限，精确到毫秒
	DisburseLimit *int64 `json:"disburse_limit,omitempty" xml:"disburse_limit,omitempty" require:"true"`
	// 支用金额，精确到毫厘，即123400表示12.34元
	DisburseMoney *int64 `json:"disburse_money,omitempty" xml:"disburse_money,omitempty" require:"true"`
	// 支用科目，服务费/租金，精确到毫厘，即123400表示12.34元
	DisburseService *int64 `json:"disburse_service,omitempty" xml:"disburse_service,omitempty" require:"true"`
	// 逾期天数，支用到期日开始计算，天数为单位
	ExceedDuration *int64 `json:"exceed_duration,omitempty" xml:"exceed_duration,omitempty" require:"true"`
	// 1未还款，2已还款
	ExceedPayBackStatus *int64 `json:"exceed_pay_back_status,omitempty" xml:"exceed_pay_back_status,omitempty" require:"true"`
	// 逾期利率，精确到小数点后四位 12.34% 表示为1234
	ExceedRate *int64 `json:"exceed_rate,omitempty" xml:"exceed_rate,omitempty" require:"true"`
	// 逾期应还款总额，本金+利息+逾期利息，精确到毫厘，即123400表示12.34元
	ExceedReturnMoney *int64 `json:"exceed_return_money,omitempty" xml:"exceed_return_money,omitempty" require:"true"`
	// 贷款利率,银行同步利率，年化8%-15%,精确到小数点后四位 12.34% 表示为1234
	LoanRate *int64 `json:"loan_rate,omitempty" xml:"loan_rate,omitempty" require:"true"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 到期还款日，T+支用期限，节假日顺延至第一个工作日，格式为"2019-07-31 12:00:00"
	PayBackDate *string `json:"pay_back_date,omitempty" xml:"pay_back_date,omitempty" require:"true"`
	// 到期还款金额，本金+利息，精确到毫厘，即123400表示12.34元
	PayBackMoney *int64 `json:"pay_back_money,omitempty" xml:"pay_back_money,omitempty" require:"true"`
	// 应还利息，系统自动计算当日应还利息（T+1），精确到毫厘，即123400表示12.34元
	ReturnInterest *int64 `json:"return_interest,omitempty" xml:"return_interest,omitempty" require:"true"`
}

func (s CreateLeaseDisburseinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseDisburseinfoRequest) GoString() string {
	return s.String()
}

func (s *CreateLeaseDisburseinfoRequest) SetAuthToken(v string) *CreateLeaseDisburseinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeaseDisburseinfoRequest) SetProductInstanceId(v string) *CreateLeaseDisburseinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeaseDisburseinfoRequest) SetActiveAccount(v string) *CreateLeaseDisburseinfoRequest {
	s.ActiveAccount = &v
	return s
}

func (s *CreateLeaseDisburseinfoRequest) SetActiveResultDesc(v string) *CreateLeaseDisburseinfoRequest {
	s.ActiveResultDesc = &v
	return s
}

func (s *CreateLeaseDisburseinfoRequest) SetActiveResultStatus(v int64) *CreateLeaseDisburseinfoRequest {
	s.ActiveResultStatus = &v
	return s
}

func (s *CreateLeaseDisburseinfoRequest) SetActiveReturnDate(v string) *CreateLeaseDisburseinfoRequest {
	s.ActiveReturnDate = &v
	return s
}

func (s *CreateLeaseDisburseinfoRequest) SetActiveReturnMoney(v int64) *CreateLeaseDisburseinfoRequest {
	s.ActiveReturnMoney = &v
	return s
}

func (s *CreateLeaseDisburseinfoRequest) SetDisburseLimit(v int64) *CreateLeaseDisburseinfoRequest {
	s.DisburseLimit = &v
	return s
}

func (s *CreateLeaseDisburseinfoRequest) SetDisburseMoney(v int64) *CreateLeaseDisburseinfoRequest {
	s.DisburseMoney = &v
	return s
}

func (s *CreateLeaseDisburseinfoRequest) SetDisburseService(v int64) *CreateLeaseDisburseinfoRequest {
	s.DisburseService = &v
	return s
}

func (s *CreateLeaseDisburseinfoRequest) SetExceedDuration(v int64) *CreateLeaseDisburseinfoRequest {
	s.ExceedDuration = &v
	return s
}

func (s *CreateLeaseDisburseinfoRequest) SetExceedPayBackStatus(v int64) *CreateLeaseDisburseinfoRequest {
	s.ExceedPayBackStatus = &v
	return s
}

func (s *CreateLeaseDisburseinfoRequest) SetExceedRate(v int64) *CreateLeaseDisburseinfoRequest {
	s.ExceedRate = &v
	return s
}

func (s *CreateLeaseDisburseinfoRequest) SetExceedReturnMoney(v int64) *CreateLeaseDisburseinfoRequest {
	s.ExceedReturnMoney = &v
	return s
}

func (s *CreateLeaseDisburseinfoRequest) SetLoanRate(v int64) *CreateLeaseDisburseinfoRequest {
	s.LoanRate = &v
	return s
}

func (s *CreateLeaseDisburseinfoRequest) SetOrderId(v string) *CreateLeaseDisburseinfoRequest {
	s.OrderId = &v
	return s
}

func (s *CreateLeaseDisburseinfoRequest) SetPayBackDate(v string) *CreateLeaseDisburseinfoRequest {
	s.PayBackDate = &v
	return s
}

func (s *CreateLeaseDisburseinfoRequest) SetPayBackMoney(v int64) *CreateLeaseDisburseinfoRequest {
	s.PayBackMoney = &v
	return s
}

func (s *CreateLeaseDisburseinfoRequest) SetReturnInterest(v int64) *CreateLeaseDisburseinfoRequest {
	s.ReturnInterest = &v
	return s
}

type CreateLeaseDisburseinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码
	// 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 贷后字段存储到合约中对应的区块链交易哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s CreateLeaseDisburseinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseDisburseinfoResponse) GoString() string {
	return s.String()
}

func (s *CreateLeaseDisburseinfoResponse) SetReqMsgId(v string) *CreateLeaseDisburseinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeaseDisburseinfoResponse) SetResultCode(v string) *CreateLeaseDisburseinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeaseDisburseinfoResponse) SetResultMsg(v string) *CreateLeaseDisburseinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeaseDisburseinfoResponse) SetCode(v int64) *CreateLeaseDisburseinfoResponse {
	s.Code = &v
	return s
}

func (s *CreateLeaseDisburseinfoResponse) SetErrMessage(v string) *CreateLeaseDisburseinfoResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateLeaseDisburseinfoResponse) SetResponseData(v string) *CreateLeaseDisburseinfoResponse {
	s.ResponseData = &v
	return s
}

type QueryLeaseOrderinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 融资租赁业务id，由资方控制台生成返回
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 租赁平台金融科技租户id
	LeaseId *string `json:"lease_id,omitempty" xml:"lease_id,omitempty" require:"true"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 阶段描述
	PhaseInfo *string `json:"phase_info,omitempty" xml:"phase_info,omitempty"`
}

func (s QueryLeaseOrderinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryLeaseOrderinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryLeaseOrderinfoRequest) SetAuthToken(v string) *QueryLeaseOrderinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryLeaseOrderinfoRequest) SetProductInstanceId(v string) *QueryLeaseOrderinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryLeaseOrderinfoRequest) SetApplicationId(v string) *QueryLeaseOrderinfoRequest {
	s.ApplicationId = &v
	return s
}

func (s *QueryLeaseOrderinfoRequest) SetLeaseId(v string) *QueryLeaseOrderinfoRequest {
	s.LeaseId = &v
	return s
}

func (s *QueryLeaseOrderinfoRequest) SetOrderId(v string) *QueryLeaseOrderinfoRequest {
	s.OrderId = &v
	return s
}

func (s *QueryLeaseOrderinfoRequest) SetPhaseInfo(v string) *QueryLeaseOrderinfoRequest {
	s.PhaseInfo = &v
	return s
}

type QueryLeaseOrderinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码
	// 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 订单详细信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s QueryLeaseOrderinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryLeaseOrderinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryLeaseOrderinfoResponse) SetReqMsgId(v string) *QueryLeaseOrderinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryLeaseOrderinfoResponse) SetResultCode(v string) *QueryLeaseOrderinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryLeaseOrderinfoResponse) SetResultMsg(v string) *QueryLeaseOrderinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryLeaseOrderinfoResponse) SetCode(v int64) *QueryLeaseOrderinfoResponse {
	s.Code = &v
	return s
}

func (s *QueryLeaseOrderinfoResponse) SetErrMessage(v string) *QueryLeaseOrderinfoResponse {
	s.ErrMessage = &v
	return s
}

func (s *QueryLeaseOrderinfoResponse) SetResponseData(v string) *QueryLeaseOrderinfoResponse {
	s.ResponseData = &v
	return s
}

type CreateFinanceTextnotaryRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 反欺诈查询对应的身份证号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 哈希算法
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty" require:"true"`
	// 位置描述信息
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 反欺诈查询需要的手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 存证阶段，用户可自行维护
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty" require:"true"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 文本哈希
	TextHash *string `json:"text_hash,omitempty" xml:"text_hash,omitempty" require:"true"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty" require:"true"`
	// 是否使用可信时间戳
	Tsr *bool `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 反欺诈查询需要的姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
	// 本次请求的唯一id
	ThirdMessageId *string `json:"third_message_id,omitempty" xml:"third_message_id,omitempty"`
}

func (s CreateFinanceTextnotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateFinanceTextnotaryRequest) GoString() string {
	return s.String()
}

func (s *CreateFinanceTextnotaryRequest) SetAuthToken(v string) *CreateFinanceTextnotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateFinanceTextnotaryRequest) SetProductInstanceId(v string) *CreateFinanceTextnotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateFinanceTextnotaryRequest) SetCertNo(v string) *CreateFinanceTextnotaryRequest {
	s.CertNo = &v
	return s
}

func (s *CreateFinanceTextnotaryRequest) SetHashAlgorithm(v string) *CreateFinanceTextnotaryRequest {
	s.HashAlgorithm = &v
	return s
}

func (s *CreateFinanceTextnotaryRequest) SetLocation(v *Location) *CreateFinanceTextnotaryRequest {
	s.Location = v
	return s
}

func (s *CreateFinanceTextnotaryRequest) SetMobile(v string) *CreateFinanceTextnotaryRequest {
	s.Mobile = &v
	return s
}

func (s *CreateFinanceTextnotaryRequest) SetPhase(v string) *CreateFinanceTextnotaryRequest {
	s.Phase = &v
	return s
}

func (s *CreateFinanceTextnotaryRequest) SetProperties(v string) *CreateFinanceTextnotaryRequest {
	s.Properties = &v
	return s
}

func (s *CreateFinanceTextnotaryRequest) SetTextHash(v string) *CreateFinanceTextnotaryRequest {
	s.TextHash = &v
	return s
}

func (s *CreateFinanceTextnotaryRequest) SetTransactionId(v string) *CreateFinanceTextnotaryRequest {
	s.TransactionId = &v
	return s
}

func (s *CreateFinanceTextnotaryRequest) SetTsr(v bool) *CreateFinanceTextnotaryRequest {
	s.Tsr = &v
	return s
}

func (s *CreateFinanceTextnotaryRequest) SetUserName(v string) *CreateFinanceTextnotaryRequest {
	s.UserName = &v
	return s
}

func (s *CreateFinanceTextnotaryRequest) SetThirdMessageId(v string) *CreateFinanceTextnotaryRequest {
	s.ThirdMessageId = &v
	return s
}

type CreateFinanceTextnotaryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 反欺诈对应的信用值
	CreditRiskScore *string `json:"credit_risk_score,omitempty" xml:"credit_risk_score,omitempty"`
	// 可信时间戳
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateFinanceTextnotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateFinanceTextnotaryResponse) GoString() string {
	return s.String()
}

func (s *CreateFinanceTextnotaryResponse) SetReqMsgId(v string) *CreateFinanceTextnotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateFinanceTextnotaryResponse) SetResultCode(v string) *CreateFinanceTextnotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateFinanceTextnotaryResponse) SetResultMsg(v string) *CreateFinanceTextnotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateFinanceTextnotaryResponse) SetCreditRiskScore(v string) *CreateFinanceTextnotaryResponse {
	s.CreditRiskScore = &v
	return s
}

func (s *CreateFinanceTextnotaryResponse) SetTsr(v *TsrResponse) *CreateFinanceTextnotaryResponse {
	s.Tsr = v
	return s
}

func (s *CreateFinanceTextnotaryResponse) SetTxHash(v string) *CreateFinanceTextnotaryResponse {
	s.TxHash = &v
	return s
}

type GetFinanceTextnotaryRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 位置信息
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 存证阶段
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性，用户可自行维护
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
}

func (s GetFinanceTextnotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s GetFinanceTextnotaryRequest) GoString() string {
	return s.String()
}

func (s *GetFinanceTextnotaryRequest) SetAuthToken(v string) *GetFinanceTextnotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *GetFinanceTextnotaryRequest) SetProductInstanceId(v string) *GetFinanceTextnotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetFinanceTextnotaryRequest) SetLocation(v *Location) *GetFinanceTextnotaryRequest {
	s.Location = v
	return s
}

func (s *GetFinanceTextnotaryRequest) SetPhase(v string) *GetFinanceTextnotaryRequest {
	s.Phase = &v
	return s
}

func (s *GetFinanceTextnotaryRequest) SetProperties(v string) *GetFinanceTextnotaryRequest {
	s.Properties = &v
	return s
}

func (s *GetFinanceTextnotaryRequest) SetTransactionId(v string) *GetFinanceTextnotaryRequest {
	s.TransactionId = &v
	return s
}

func (s *GetFinanceTextnotaryRequest) SetTxHash(v string) *GetFinanceTextnotaryRequest {
	s.TxHash = &v
	return s
}

type GetFinanceTextnotaryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 哈希算法
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty"`
	// 文本哈希
	TextHash *string `json:"text_hash,omitempty" xml:"text_hash,omitempty"`
	// 可信时间戳
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 存证阶段
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
}

func (s GetFinanceTextnotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s GetFinanceTextnotaryResponse) GoString() string {
	return s.String()
}

func (s *GetFinanceTextnotaryResponse) SetReqMsgId(v string) *GetFinanceTextnotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetFinanceTextnotaryResponse) SetResultCode(v string) *GetFinanceTextnotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *GetFinanceTextnotaryResponse) SetResultMsg(v string) *GetFinanceTextnotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetFinanceTextnotaryResponse) SetHashAlgorithm(v string) *GetFinanceTextnotaryResponse {
	s.HashAlgorithm = &v
	return s
}

func (s *GetFinanceTextnotaryResponse) SetTextHash(v string) *GetFinanceTextnotaryResponse {
	s.TextHash = &v
	return s
}

func (s *GetFinanceTextnotaryResponse) SetTsr(v *TsrResponse) *GetFinanceTextnotaryResponse {
	s.Tsr = v
	return s
}

func (s *GetFinanceTextnotaryResponse) SetPhase(v string) *GetFinanceTextnotaryResponse {
	s.Phase = &v
	return s
}

func (s *GetFinanceTextnotaryResponse) SetProperties(v string) *GetFinanceTextnotaryResponse {
	s.Properties = &v
	return s
}

type CreateFinanceFilenotaryRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 反欺诈需要的证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 创建日期，时间戳类型，单位毫秒
	CreatedDate *int64 `json:"created_date,omitempty" xml:"created_date,omitempty" require:"true"`
	// 存证文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 文件存证类型，支持小于 1M 源文件或者文件哈希
	FileNotaryType *string `json:"file_notary_type,omitempty" xml:"file_notary_type,omitempty" require:"true"`
	// 文件大小，单位 Bytes
	FileSize *int64 `json:"file_size,omitempty" xml:"file_size,omitempty"`
	// 文件类型
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// 文件地址
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty"`
	// 哈希算法
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty"`
	// 位置信息
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 反欺诈查询需要的手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 文件存证内容
	NotaryContent *string `json:"notary_content,omitempty" xml:"notary_content,omitempty" require:"true"`
	// 存证阶段
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty" require:"true"`
	// 扩展属性，用户可自行维护
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty" require:"true"`
	// 是否使用可信时间戳
	Tsr *bool `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 反欺诈查询需要的证件上的姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
	// 本次请求的唯一ID
	ThirdMessageId *string `json:"third_message_id,omitempty" xml:"third_message_id,omitempty"`
}

func (s CreateFinanceFilenotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateFinanceFilenotaryRequest) GoString() string {
	return s.String()
}

func (s *CreateFinanceFilenotaryRequest) SetAuthToken(v string) *CreateFinanceFilenotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateFinanceFilenotaryRequest) SetProductInstanceId(v string) *CreateFinanceFilenotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateFinanceFilenotaryRequest) SetCertNo(v string) *CreateFinanceFilenotaryRequest {
	s.CertNo = &v
	return s
}

func (s *CreateFinanceFilenotaryRequest) SetCreatedDate(v int64) *CreateFinanceFilenotaryRequest {
	s.CreatedDate = &v
	return s
}

func (s *CreateFinanceFilenotaryRequest) SetFileName(v string) *CreateFinanceFilenotaryRequest {
	s.FileName = &v
	return s
}

func (s *CreateFinanceFilenotaryRequest) SetFileNotaryType(v string) *CreateFinanceFilenotaryRequest {
	s.FileNotaryType = &v
	return s
}

func (s *CreateFinanceFilenotaryRequest) SetFileSize(v int64) *CreateFinanceFilenotaryRequest {
	s.FileSize = &v
	return s
}

func (s *CreateFinanceFilenotaryRequest) SetFileType(v string) *CreateFinanceFilenotaryRequest {
	s.FileType = &v
	return s
}

func (s *CreateFinanceFilenotaryRequest) SetFileUrl(v string) *CreateFinanceFilenotaryRequest {
	s.FileUrl = &v
	return s
}

func (s *CreateFinanceFilenotaryRequest) SetHashAlgorithm(v string) *CreateFinanceFilenotaryRequest {
	s.HashAlgorithm = &v
	return s
}

func (s *CreateFinanceFilenotaryRequest) SetLocation(v *Location) *CreateFinanceFilenotaryRequest {
	s.Location = v
	return s
}

func (s *CreateFinanceFilenotaryRequest) SetMobile(v string) *CreateFinanceFilenotaryRequest {
	s.Mobile = &v
	return s
}

func (s *CreateFinanceFilenotaryRequest) SetNotaryContent(v string) *CreateFinanceFilenotaryRequest {
	s.NotaryContent = &v
	return s
}

func (s *CreateFinanceFilenotaryRequest) SetPhase(v string) *CreateFinanceFilenotaryRequest {
	s.Phase = &v
	return s
}

func (s *CreateFinanceFilenotaryRequest) SetProperties(v string) *CreateFinanceFilenotaryRequest {
	s.Properties = &v
	return s
}

func (s *CreateFinanceFilenotaryRequest) SetTransactionId(v string) *CreateFinanceFilenotaryRequest {
	s.TransactionId = &v
	return s
}

func (s *CreateFinanceFilenotaryRequest) SetTsr(v bool) *CreateFinanceFilenotaryRequest {
	s.Tsr = &v
	return s
}

func (s *CreateFinanceFilenotaryRequest) SetUserName(v string) *CreateFinanceFilenotaryRequest {
	s.UserName = &v
	return s
}

func (s *CreateFinanceFilenotaryRequest) SetThirdMessageId(v string) *CreateFinanceFilenotaryRequest {
	s.ThirdMessageId = &v
	return s
}

type CreateFinanceFilenotaryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 反欺诈查询返回的信用值
	CreditRiskScore *string `json:"credit_risk_score,omitempty" xml:"credit_risk_score,omitempty"`
	// 可信时间戳
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateFinanceFilenotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateFinanceFilenotaryResponse) GoString() string {
	return s.String()
}

func (s *CreateFinanceFilenotaryResponse) SetReqMsgId(v string) *CreateFinanceFilenotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateFinanceFilenotaryResponse) SetResultCode(v string) *CreateFinanceFilenotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateFinanceFilenotaryResponse) SetResultMsg(v string) *CreateFinanceFilenotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateFinanceFilenotaryResponse) SetCreditRiskScore(v string) *CreateFinanceFilenotaryResponse {
	s.CreditRiskScore = &v
	return s
}

func (s *CreateFinanceFilenotaryResponse) SetTsr(v *TsrResponse) *CreateFinanceFilenotaryResponse {
	s.Tsr = v
	return s
}

func (s *CreateFinanceFilenotaryResponse) SetTxHash(v string) *CreateFinanceFilenotaryResponse {
	s.TxHash = &v
	return s
}

type GetFinanceFilenotaryRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 位置信息
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 存证状态
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性，用户自行维护
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
}

func (s GetFinanceFilenotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s GetFinanceFilenotaryRequest) GoString() string {
	return s.String()
}

func (s *GetFinanceFilenotaryRequest) SetAuthToken(v string) *GetFinanceFilenotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *GetFinanceFilenotaryRequest) SetProductInstanceId(v string) *GetFinanceFilenotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetFinanceFilenotaryRequest) SetLocation(v *Location) *GetFinanceFilenotaryRequest {
	s.Location = v
	return s
}

func (s *GetFinanceFilenotaryRequest) SetPhase(v string) *GetFinanceFilenotaryRequest {
	s.Phase = &v
	return s
}

func (s *GetFinanceFilenotaryRequest) SetProperties(v string) *GetFinanceFilenotaryRequest {
	s.Properties = &v
	return s
}

func (s *GetFinanceFilenotaryRequest) SetTransactionId(v string) *GetFinanceFilenotaryRequest {
	s.TransactionId = &v
	return s
}

func (s *GetFinanceFilenotaryRequest) SetTxHash(v string) *GetFinanceFilenotaryRequest {
	s.TxHash = &v
	return s
}

type GetFinanceFilenotaryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// 文件存证类型
	FileNotaryType *string `json:"file_notary_type,omitempty" xml:"file_notary_type,omitempty"`
	// 哈希算法
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty"`
	// FILE_HASH 模式时该值为文件哈希；FILE_RAW 模式时该值为临时 oss 下载地址
	NotaryContent *string `json:"notary_content,omitempty" xml:"notary_content,omitempty"`
	// 存证阶段
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 可信时间戳
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
}

func (s GetFinanceFilenotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s GetFinanceFilenotaryResponse) GoString() string {
	return s.String()
}

func (s *GetFinanceFilenotaryResponse) SetReqMsgId(v string) *GetFinanceFilenotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetFinanceFilenotaryResponse) SetResultCode(v string) *GetFinanceFilenotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *GetFinanceFilenotaryResponse) SetResultMsg(v string) *GetFinanceFilenotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetFinanceFilenotaryResponse) SetFileName(v string) *GetFinanceFilenotaryResponse {
	s.FileName = &v
	return s
}

func (s *GetFinanceFilenotaryResponse) SetFileNotaryType(v string) *GetFinanceFilenotaryResponse {
	s.FileNotaryType = &v
	return s
}

func (s *GetFinanceFilenotaryResponse) SetHashAlgorithm(v string) *GetFinanceFilenotaryResponse {
	s.HashAlgorithm = &v
	return s
}

func (s *GetFinanceFilenotaryResponse) SetNotaryContent(v string) *GetFinanceFilenotaryResponse {
	s.NotaryContent = &v
	return s
}

func (s *GetFinanceFilenotaryResponse) SetPhase(v string) *GetFinanceFilenotaryResponse {
	s.Phase = &v
	return s
}

func (s *GetFinanceFilenotaryResponse) SetProperties(v string) *GetFinanceFilenotaryResponse {
	s.Properties = &v
	return s
}

func (s *GetFinanceFilenotaryResponse) SetTsr(v *TsrResponse) *GetFinanceFilenotaryResponse {
	s.Tsr = v
	return s
}

type CheckIndustryNotaryRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 行业类型
	IndustryType *string `json:"industry_type,omitempty" xml:"industry_type,omitempty" require:"true"`
	// 核验数据列表
	NotaryCheckMetaList []*NotaryCheckMeta `json:"notary_check_meta_list,omitempty" xml:"notary_check_meta_list,omitempty" require:"true" type:"Repeated"`
}

func (s CheckIndustryNotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckIndustryNotaryRequest) GoString() string {
	return s.String()
}

func (s *CheckIndustryNotaryRequest) SetAuthToken(v string) *CheckIndustryNotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckIndustryNotaryRequest) SetProductInstanceId(v string) *CheckIndustryNotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckIndustryNotaryRequest) SetIndustryType(v string) *CheckIndustryNotaryRequest {
	s.IndustryType = &v
	return s
}

func (s *CheckIndustryNotaryRequest) SetNotaryCheckMetaList(v []*NotaryCheckMeta) *CheckIndustryNotaryRequest {
	s.NotaryCheckMetaList = v
	return s
}

type CheckIndustryNotaryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 核验结果数组
	NotaryCheckResults []*NotaryCheckResult `json:"notary_check_results,omitempty" xml:"notary_check_results,omitempty" type:"Repeated"`
}

func (s CheckIndustryNotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckIndustryNotaryResponse) GoString() string {
	return s.String()
}

func (s *CheckIndustryNotaryResponse) SetReqMsgId(v string) *CheckIndustryNotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckIndustryNotaryResponse) SetResultCode(v string) *CheckIndustryNotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckIndustryNotaryResponse) SetResultMsg(v string) *CheckIndustryNotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckIndustryNotaryResponse) SetNotaryCheckResults(v []*NotaryCheckResult) *CheckIndustryNotaryResponse {
	s.NotaryCheckResults = v
	return s
}

type UpdateLeaseContractRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 被升级的合约名称
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty" require:"true"`
	// 合约业务层id
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
}

func (s UpdateLeaseContractRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateLeaseContractRequest) GoString() string {
	return s.String()
}

func (s *UpdateLeaseContractRequest) SetAuthToken(v string) *UpdateLeaseContractRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateLeaseContractRequest) SetProductInstanceId(v string) *UpdateLeaseContractRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateLeaseContractRequest) SetContractId(v string) *UpdateLeaseContractRequest {
	s.ContractId = &v
	return s
}

func (s *UpdateLeaseContractRequest) SetApplicationId(v string) *UpdateLeaseContractRequest {
	s.ApplicationId = &v
	return s
}

type UpdateLeaseContractResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	//
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 升级合约所在的区块链交易哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s UpdateLeaseContractResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateLeaseContractResponse) GoString() string {
	return s.String()
}

func (s *UpdateLeaseContractResponse) SetReqMsgId(v string) *UpdateLeaseContractResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateLeaseContractResponse) SetResultCode(v string) *UpdateLeaseContractResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateLeaseContractResponse) SetResultMsg(v string) *UpdateLeaseContractResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateLeaseContractResponse) SetCode(v int64) *UpdateLeaseContractResponse {
	s.Code = &v
	return s
}

func (s *UpdateLeaseContractResponse) SetErrMessage(v string) *UpdateLeaseContractResponse {
	s.ErrMessage = &v
	return s
}

func (s *UpdateLeaseContractResponse) SetResponseData(v string) *UpdateLeaseContractResponse {
	s.ResponseData = &v
	return s
}

type CreateSueBreakpromiseinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合同唯一标识
	//
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 当事人身份证号
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 当事人姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 当事人手机号
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty" require:"true"`
	// 当事人邮箱地址
	Email *string `json:"email,omitempty" xml:"email,omitempty" require:"true"`
	// 诉前Id
	PreSueId *string `json:"pre_sue_id,omitempty" xml:"pre_sue_id,omitempty" require:"true"`
	// 应履约日期，格式为"2019-07-31 12:00:00"
	PromiseDate *string `json:"promise_date,omitempty" xml:"promise_date,omitempty" require:"true"`
	// 宽限期(天数，从应履约日期到进行诉前违约惩戒的自然日数）
	PromiseLimit *int64 `json:"promise_limit,omitempty" xml:"promise_limit,omitempty" require:"true"`
	// 起诉期，格式为"2019-07-31 12:00:00"
	//
	SueDate *string `json:"sue_date,omitempty" xml:"sue_date,omitempty" require:"true"`
	// 商户统一社会信用代码或个人身份证
	InitiatorId *string `json:"initiator_id,omitempty" xml:"initiator_id,omitempty" require:"true"`
	// 商户或个人名称
	//
	InitiatorName *string `json:"initiator_name,omitempty" xml:"initiator_name,omitempty" require:"true"`
	// 管辖法院名称
	CourtName *string `json:"court_name,omitempty" xml:"court_name,omitempty" require:"true"`
	// 法院唯一标识
	CourtId *string `json:"court_id,omitempty" xml:"court_id,omitempty" require:"true"`
	// 违约金额，精确到毫厘，即123400表示12.34元
	BreakPromiseMoney *int64 `json:"break_promise_money,omitempty" xml:"break_promise_money,omitempty" require:"true"`
	// 所属行业
	BusinessClass *string `json:"business_class,omitempty" xml:"business_class,omitempty" require:"true"`
}

func (s CreateSueBreakpromiseinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateSueBreakpromiseinfoRequest) GoString() string {
	return s.String()
}

func (s *CreateSueBreakpromiseinfoRequest) SetAuthToken(v string) *CreateSueBreakpromiseinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateSueBreakpromiseinfoRequest) SetProductInstanceId(v string) *CreateSueBreakpromiseinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateSueBreakpromiseinfoRequest) SetOrderId(v string) *CreateSueBreakpromiseinfoRequest {
	s.OrderId = &v
	return s
}

func (s *CreateSueBreakpromiseinfoRequest) SetUserId(v string) *CreateSueBreakpromiseinfoRequest {
	s.UserId = &v
	return s
}

func (s *CreateSueBreakpromiseinfoRequest) SetUserName(v string) *CreateSueBreakpromiseinfoRequest {
	s.UserName = &v
	return s
}

func (s *CreateSueBreakpromiseinfoRequest) SetPhoneNumber(v string) *CreateSueBreakpromiseinfoRequest {
	s.PhoneNumber = &v
	return s
}

func (s *CreateSueBreakpromiseinfoRequest) SetEmail(v string) *CreateSueBreakpromiseinfoRequest {
	s.Email = &v
	return s
}

func (s *CreateSueBreakpromiseinfoRequest) SetPreSueId(v string) *CreateSueBreakpromiseinfoRequest {
	s.PreSueId = &v
	return s
}

func (s *CreateSueBreakpromiseinfoRequest) SetPromiseDate(v string) *CreateSueBreakpromiseinfoRequest {
	s.PromiseDate = &v
	return s
}

func (s *CreateSueBreakpromiseinfoRequest) SetPromiseLimit(v int64) *CreateSueBreakpromiseinfoRequest {
	s.PromiseLimit = &v
	return s
}

func (s *CreateSueBreakpromiseinfoRequest) SetSueDate(v string) *CreateSueBreakpromiseinfoRequest {
	s.SueDate = &v
	return s
}

func (s *CreateSueBreakpromiseinfoRequest) SetInitiatorId(v string) *CreateSueBreakpromiseinfoRequest {
	s.InitiatorId = &v
	return s
}

func (s *CreateSueBreakpromiseinfoRequest) SetInitiatorName(v string) *CreateSueBreakpromiseinfoRequest {
	s.InitiatorName = &v
	return s
}

func (s *CreateSueBreakpromiseinfoRequest) SetCourtName(v string) *CreateSueBreakpromiseinfoRequest {
	s.CourtName = &v
	return s
}

func (s *CreateSueBreakpromiseinfoRequest) SetCourtId(v string) *CreateSueBreakpromiseinfoRequest {
	s.CourtId = &v
	return s
}

func (s *CreateSueBreakpromiseinfoRequest) SetBreakPromiseMoney(v int64) *CreateSueBreakpromiseinfoRequest {
	s.BreakPromiseMoney = &v
	return s
}

func (s *CreateSueBreakpromiseinfoRequest) SetBusinessClass(v string) *CreateSueBreakpromiseinfoRequest {
	s.BusinessClass = &v
	return s
}

type CreateSueBreakpromiseinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 成功插入违约数据到区块链的交易哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
	// 状态码,0表示成功
	//
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
}

func (s CreateSueBreakpromiseinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateSueBreakpromiseinfoResponse) GoString() string {
	return s.String()
}

func (s *CreateSueBreakpromiseinfoResponse) SetReqMsgId(v string) *CreateSueBreakpromiseinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateSueBreakpromiseinfoResponse) SetResultCode(v string) *CreateSueBreakpromiseinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateSueBreakpromiseinfoResponse) SetResultMsg(v string) *CreateSueBreakpromiseinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateSueBreakpromiseinfoResponse) SetResponseData(v string) *CreateSueBreakpromiseinfoResponse {
	s.ResponseData = &v
	return s
}

func (s *CreateSueBreakpromiseinfoResponse) SetCode(v string) *CreateSueBreakpromiseinfoResponse {
	s.Code = &v
	return s
}

func (s *CreateSueBreakpromiseinfoResponse) SetErrMessage(v string) *CreateSueBreakpromiseinfoResponse {
	s.ErrMessage = &v
	return s
}

type UpdateSueBreakpromiseinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合同唯一标识，不可更新
	//
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 当事人手机号
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty" require:"true"`
	// 当事人电子邮箱地址
	Email *string `json:"email,omitempty" xml:"email,omitempty" require:"true"`
	// 诉前Id，不可更新
	//
	PreSueId *string `json:"pre_sue_id,omitempty" xml:"pre_sue_id,omitempty" require:"true"`
	// 应履约日期，格式为"2019-07-31 12:00:00"
	PromiseDate *string `json:"promise_date,omitempty" xml:"promise_date,omitempty" require:"true"`
	// 宽限期(天数，从应履约日期到进行诉前违约惩戒的自然日数）
	PromiseLimit *int64 `json:"promise_limit,omitempty" xml:"promise_limit,omitempty" require:"true"`
	// 起诉期，格式为"2019-07-31 12:00:00"
	SueDate *string `json:"sue_date,omitempty" xml:"sue_date,omitempty" require:"true"`
	// 违约金额，精确到毫厘，即123400表示12.34元
	BreakPromiseMoney *int64 `json:"break_promise_money,omitempty" xml:"break_promise_money,omitempty" require:"true"`
	// 所属行业
	//
	BusinessClass *string `json:"business_class,omitempty" xml:"business_class,omitempty" require:"true"`
}

func (s UpdateSueBreakpromiseinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateSueBreakpromiseinfoRequest) GoString() string {
	return s.String()
}

func (s *UpdateSueBreakpromiseinfoRequest) SetAuthToken(v string) *UpdateSueBreakpromiseinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateSueBreakpromiseinfoRequest) SetProductInstanceId(v string) *UpdateSueBreakpromiseinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateSueBreakpromiseinfoRequest) SetOrderId(v string) *UpdateSueBreakpromiseinfoRequest {
	s.OrderId = &v
	return s
}

func (s *UpdateSueBreakpromiseinfoRequest) SetPhoneNumber(v string) *UpdateSueBreakpromiseinfoRequest {
	s.PhoneNumber = &v
	return s
}

func (s *UpdateSueBreakpromiseinfoRequest) SetEmail(v string) *UpdateSueBreakpromiseinfoRequest {
	s.Email = &v
	return s
}

func (s *UpdateSueBreakpromiseinfoRequest) SetPreSueId(v string) *UpdateSueBreakpromiseinfoRequest {
	s.PreSueId = &v
	return s
}

func (s *UpdateSueBreakpromiseinfoRequest) SetPromiseDate(v string) *UpdateSueBreakpromiseinfoRequest {
	s.PromiseDate = &v
	return s
}

func (s *UpdateSueBreakpromiseinfoRequest) SetPromiseLimit(v int64) *UpdateSueBreakpromiseinfoRequest {
	s.PromiseLimit = &v
	return s
}

func (s *UpdateSueBreakpromiseinfoRequest) SetSueDate(v string) *UpdateSueBreakpromiseinfoRequest {
	s.SueDate = &v
	return s
}

func (s *UpdateSueBreakpromiseinfoRequest) SetBreakPromiseMoney(v int64) *UpdateSueBreakpromiseinfoRequest {
	s.BreakPromiseMoney = &v
	return s
}

func (s *UpdateSueBreakpromiseinfoRequest) SetBusinessClass(v string) *UpdateSueBreakpromiseinfoRequest {
	s.BusinessClass = &v
	return s
}

type UpdateSueBreakpromiseinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 违约案件信息提交对应的区块链交易哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
	// 状态码,0表示成功
	//
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
}

func (s UpdateSueBreakpromiseinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateSueBreakpromiseinfoResponse) GoString() string {
	return s.String()
}

func (s *UpdateSueBreakpromiseinfoResponse) SetReqMsgId(v string) *UpdateSueBreakpromiseinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateSueBreakpromiseinfoResponse) SetResultCode(v string) *UpdateSueBreakpromiseinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateSueBreakpromiseinfoResponse) SetResultMsg(v string) *UpdateSueBreakpromiseinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateSueBreakpromiseinfoResponse) SetResponseData(v string) *UpdateSueBreakpromiseinfoResponse {
	s.ResponseData = &v
	return s
}

func (s *UpdateSueBreakpromiseinfoResponse) SetCode(v int64) *UpdateSueBreakpromiseinfoResponse {
	s.Code = &v
	return s
}

func (s *UpdateSueBreakpromiseinfoResponse) SetErrMessage(v string) *UpdateSueBreakpromiseinfoResponse {
	s.ErrMessage = &v
	return s
}

type DeleteSueBreakpromiseinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合同唯一标识，不可更新
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 诉前id，不可更新
	PreSueId *string `json:"pre_sue_id,omitempty" xml:"pre_sue_id,omitempty" require:"true"`
}

func (s DeleteSueBreakpromiseinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteSueBreakpromiseinfoRequest) GoString() string {
	return s.String()
}

func (s *DeleteSueBreakpromiseinfoRequest) SetAuthToken(v string) *DeleteSueBreakpromiseinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteSueBreakpromiseinfoRequest) SetProductInstanceId(v string) *DeleteSueBreakpromiseinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteSueBreakpromiseinfoRequest) SetOrderId(v string) *DeleteSueBreakpromiseinfoRequest {
	s.OrderId = &v
	return s
}

func (s *DeleteSueBreakpromiseinfoRequest) SetPreSueId(v string) *DeleteSueBreakpromiseinfoRequest {
	s.PreSueId = &v
	return s
}

type DeleteSueBreakpromiseinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 违约案件信息提交对应的区块链交易哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
	// 状态码 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
}

func (s DeleteSueBreakpromiseinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteSueBreakpromiseinfoResponse) GoString() string {
	return s.String()
}

func (s *DeleteSueBreakpromiseinfoResponse) SetReqMsgId(v string) *DeleteSueBreakpromiseinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteSueBreakpromiseinfoResponse) SetResultCode(v string) *DeleteSueBreakpromiseinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteSueBreakpromiseinfoResponse) SetResultMsg(v string) *DeleteSueBreakpromiseinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteSueBreakpromiseinfoResponse) SetResponseData(v string) *DeleteSueBreakpromiseinfoResponse {
	s.ResponseData = &v
	return s
}

func (s *DeleteSueBreakpromiseinfoResponse) SetCode(v int64) *DeleteSueBreakpromiseinfoResponse {
	s.Code = &v
	return s
}

func (s *DeleteSueBreakpromiseinfoResponse) SetErrMessage(v string) *DeleteSueBreakpromiseinfoResponse {
	s.ErrMessage = &v
	return s
}

type QuerySueUserinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 被查者身份证号
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s QuerySueUserinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySueUserinfoRequest) GoString() string {
	return s.String()
}

func (s *QuerySueUserinfoRequest) SetAuthToken(v string) *QuerySueUserinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySueUserinfoRequest) SetProductInstanceId(v string) *QuerySueUserinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySueUserinfoRequest) SetUserId(v string) *QuerySueUserinfoRequest {
	s.UserId = &v
	return s
}

type QuerySueUserinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 用户违约个数
	ResponseData *int64 `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s QuerySueUserinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySueUserinfoResponse) GoString() string {
	return s.String()
}

func (s *QuerySueUserinfoResponse) SetReqMsgId(v string) *QuerySueUserinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySueUserinfoResponse) SetResultCode(v string) *QuerySueUserinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySueUserinfoResponse) SetResultMsg(v string) *QuerySueUserinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySueUserinfoResponse) SetCode(v int64) *QuerySueUserinfoResponse {
	s.Code = &v
	return s
}

func (s *QuerySueUserinfoResponse) SetErrMessage(v string) *QuerySueUserinfoResponse {
	s.ErrMessage = &v
	return s
}

func (s *QuerySueUserinfoResponse) SetResponseData(v int64) *QuerySueUserinfoResponse {
	s.ResponseData = &v
	return s
}

type UpdateSueExeplarycontractRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合约名称
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty" require:"true"`
}

func (s UpdateSueExeplarycontractRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateSueExeplarycontractRequest) GoString() string {
	return s.String()
}

func (s *UpdateSueExeplarycontractRequest) SetAuthToken(v string) *UpdateSueExeplarycontractRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateSueExeplarycontractRequest) SetProductInstanceId(v string) *UpdateSueExeplarycontractRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateSueExeplarycontractRequest) SetContractId(v string) *UpdateSueExeplarycontractRequest {
	s.ContractId = &v
	return s
}

type UpdateSueExeplarycontractResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 0xabcdef123324234
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
	// 状态码 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
}

func (s UpdateSueExeplarycontractResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateSueExeplarycontractResponse) GoString() string {
	return s.String()
}

func (s *UpdateSueExeplarycontractResponse) SetReqMsgId(v string) *UpdateSueExeplarycontractResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateSueExeplarycontractResponse) SetResultCode(v string) *UpdateSueExeplarycontractResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateSueExeplarycontractResponse) SetResultMsg(v string) *UpdateSueExeplarycontractResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateSueExeplarycontractResponse) SetResponseData(v string) *UpdateSueExeplarycontractResponse {
	s.ResponseData = &v
	return s
}

func (s *UpdateSueExeplarycontractResponse) SetCode(v int64) *UpdateSueExeplarycontractResponse {
	s.Code = &v
	return s
}

func (s *UpdateSueExeplarycontractResponse) SetErrMessage(v string) *UpdateSueExeplarycontractResponse {
	s.ErrMessage = &v
	return s
}

type UpdateSueExemplaryrevertRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户管理合约id
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty" require:"true"`
}

func (s UpdateSueExemplaryrevertRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateSueExemplaryrevertRequest) GoString() string {
	return s.String()
}

func (s *UpdateSueExemplaryrevertRequest) SetAuthToken(v string) *UpdateSueExemplaryrevertRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateSueExemplaryrevertRequest) SetProductInstanceId(v string) *UpdateSueExemplaryrevertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateSueExemplaryrevertRequest) SetContractId(v string) *UpdateSueExemplaryrevertRequest {
	s.ContractId = &v
	return s
}

type UpdateSueExemplaryrevertResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 回退合约所对应的区块链交易哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
	// 错误码 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
}

func (s UpdateSueExemplaryrevertResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateSueExemplaryrevertResponse) GoString() string {
	return s.String()
}

func (s *UpdateSueExemplaryrevertResponse) SetReqMsgId(v string) *UpdateSueExemplaryrevertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateSueExemplaryrevertResponse) SetResultCode(v string) *UpdateSueExemplaryrevertResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateSueExemplaryrevertResponse) SetResultMsg(v string) *UpdateSueExemplaryrevertResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateSueExemplaryrevertResponse) SetResponseData(v string) *UpdateSueExemplaryrevertResponse {
	s.ResponseData = &v
	return s
}

func (s *UpdateSueExemplaryrevertResponse) SetCode(v int64) *UpdateSueExemplaryrevertResponse {
	s.Code = &v
	return s
}

func (s *UpdateSueExemplaryrevertResponse) SetErrMessage(v string) *UpdateSueExemplaryrevertResponse {
	s.ErrMessage = &v
	return s
}

type CreateLeaseAuditRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 融资租赁业务id，由资方控制台创建返回
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 是否启动订单的异步处理
	Async *int64 `json:"async,omitempty" xml:"async,omitempty"`
	// 融资机构审核批次
	//
	BatchIndex *string `json:"batch_index,omitempty" xml:"batch_index,omitempty"`
	// 当前订单处于本批次中的index
	CurrentAuditIndex *int64 `json:"current_audit_index,omitempty" xml:"current_audit_index,omitempty"`
	// 融资租赁额外字段
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 租赁服务平台ID 长度不可超过50
	LeaseId *string `json:"lease_id,omitempty" xml:"lease_id,omitempty" require:"true"`
	// 融资机构审核状态，0.审核中1.审核失败2.审核成功
	ManualAudit *int64 `json:"manual_audit,omitempty" xml:"manual_audit,omitempty" require:"true"`
	// 融资结构审核说明，非必填，审核失败必填失败原因
	ManualAuditComments *string `json:"manual_audit_comments,omitempty" xml:"manual_audit_comments,omitempty"`
	// 订单id 长度不可超过50
	//
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 总审核的个数
	TotalAuditNumber *int64 `json:"total_audit_number,omitempty" xml:"total_audit_number,omitempty"`
	// 额外通知第三方，如果需要通知相关方外的第三方，需要在此设置关联方的租户id，若不设置则只通知资方
	//
	RelatedNotify []*string `json:"related_notify,omitempty" xml:"related_notify,omitempty" type:"Repeated"`
}

func (s CreateLeaseAuditRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseAuditRequest) GoString() string {
	return s.String()
}

func (s *CreateLeaseAuditRequest) SetAuthToken(v string) *CreateLeaseAuditRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeaseAuditRequest) SetProductInstanceId(v string) *CreateLeaseAuditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeaseAuditRequest) SetApplicationId(v string) *CreateLeaseAuditRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateLeaseAuditRequest) SetAsync(v int64) *CreateLeaseAuditRequest {
	s.Async = &v
	return s
}

func (s *CreateLeaseAuditRequest) SetBatchIndex(v string) *CreateLeaseAuditRequest {
	s.BatchIndex = &v
	return s
}

func (s *CreateLeaseAuditRequest) SetCurrentAuditIndex(v int64) *CreateLeaseAuditRequest {
	s.CurrentAuditIndex = &v
	return s
}

func (s *CreateLeaseAuditRequest) SetExtraInfo(v string) *CreateLeaseAuditRequest {
	s.ExtraInfo = &v
	return s
}

func (s *CreateLeaseAuditRequest) SetLeaseId(v string) *CreateLeaseAuditRequest {
	s.LeaseId = &v
	return s
}

func (s *CreateLeaseAuditRequest) SetManualAudit(v int64) *CreateLeaseAuditRequest {
	s.ManualAudit = &v
	return s
}

func (s *CreateLeaseAuditRequest) SetManualAuditComments(v string) *CreateLeaseAuditRequest {
	s.ManualAuditComments = &v
	return s
}

func (s *CreateLeaseAuditRequest) SetOrderId(v string) *CreateLeaseAuditRequest {
	s.OrderId = &v
	return s
}

func (s *CreateLeaseAuditRequest) SetTotalAuditNumber(v int64) *CreateLeaseAuditRequest {
	s.TotalAuditNumber = &v
	return s
}

func (s *CreateLeaseAuditRequest) SetRelatedNotify(v []*string) *CreateLeaseAuditRequest {
	s.RelatedNotify = v
	return s
}

type CreateLeaseAuditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	//
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 融资平台审核订单信息存储到合约中对应的区块链交易哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s CreateLeaseAuditResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseAuditResponse) GoString() string {
	return s.String()
}

func (s *CreateLeaseAuditResponse) SetReqMsgId(v string) *CreateLeaseAuditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeaseAuditResponse) SetResultCode(v string) *CreateLeaseAuditResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeaseAuditResponse) SetResultMsg(v string) *CreateLeaseAuditResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeaseAuditResponse) SetCode(v int64) *CreateLeaseAuditResponse {
	s.Code = &v
	return s
}

func (s *CreateLeaseAuditResponse) SetErrMessage(v string) *CreateLeaseAuditResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateLeaseAuditResponse) SetResponseData(v string) *CreateLeaseAuditResponse {
	s.ResponseData = &v
	return s
}

type CreateLeasePaymentfileRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 融资租赁业务id，由资方控制台生成
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 是否启动订单的异步处理
	Async *int64 `json:"async,omitempty" xml:"async,omitempty"`
	// 融资租赁额外字段
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 租赁服务平台ID 长度不可超过50
	LeaseId *string `json:"lease_id,omitempty" xml:"lease_id,omitempty" require:"true"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 付款通知书加签完电子签名后，PDF文件hash
	PaymentFileHash *string `json:"payment_file_hash,omitempty" xml:"payment_file_hash,omitempty"`
	// 付款通知书存证交易哈希
	PaymentFileTxHash *string `json:"payment_file_tx_hash,omitempty" xml:"payment_file_tx_hash,omitempty"`
	// 付款通知所在路径
	PaymentUrl *string `json:"payment_url,omitempty" xml:"payment_url,omitempty"`
	// 额外通知第三方，如果需要通知相关方外的第三方，需要在此设置关联方的租户id，若不设置则只通知资方
	//
	RelatedNotify []*string `json:"related_notify,omitempty" xml:"related_notify,omitempty" type:"Repeated"`
}

func (s CreateLeasePaymentfileRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeasePaymentfileRequest) GoString() string {
	return s.String()
}

func (s *CreateLeasePaymentfileRequest) SetAuthToken(v string) *CreateLeasePaymentfileRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeasePaymentfileRequest) SetProductInstanceId(v string) *CreateLeasePaymentfileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeasePaymentfileRequest) SetApplicationId(v string) *CreateLeasePaymentfileRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateLeasePaymentfileRequest) SetAsync(v int64) *CreateLeasePaymentfileRequest {
	s.Async = &v
	return s
}

func (s *CreateLeasePaymentfileRequest) SetExtraInfo(v string) *CreateLeasePaymentfileRequest {
	s.ExtraInfo = &v
	return s
}

func (s *CreateLeasePaymentfileRequest) SetLeaseId(v string) *CreateLeasePaymentfileRequest {
	s.LeaseId = &v
	return s
}

func (s *CreateLeasePaymentfileRequest) SetOrderId(v string) *CreateLeasePaymentfileRequest {
	s.OrderId = &v
	return s
}

func (s *CreateLeasePaymentfileRequest) SetPaymentFileHash(v string) *CreateLeasePaymentfileRequest {
	s.PaymentFileHash = &v
	return s
}

func (s *CreateLeasePaymentfileRequest) SetPaymentFileTxHash(v string) *CreateLeasePaymentfileRequest {
	s.PaymentFileTxHash = &v
	return s
}

func (s *CreateLeasePaymentfileRequest) SetPaymentUrl(v string) *CreateLeasePaymentfileRequest {
	s.PaymentUrl = &v
	return s
}

func (s *CreateLeasePaymentfileRequest) SetRelatedNotify(v []*string) *CreateLeasePaymentfileRequest {
	s.RelatedNotify = v
	return s
}

type CreateLeasePaymentfileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码 0表示成功
	//
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	//
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 租赁平台上传付款通知到合约中对应
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s CreateLeasePaymentfileResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeasePaymentfileResponse) GoString() string {
	return s.String()
}

func (s *CreateLeasePaymentfileResponse) SetReqMsgId(v string) *CreateLeasePaymentfileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeasePaymentfileResponse) SetResultCode(v string) *CreateLeasePaymentfileResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeasePaymentfileResponse) SetResultMsg(v string) *CreateLeasePaymentfileResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeasePaymentfileResponse) SetCode(v int64) *CreateLeasePaymentfileResponse {
	s.Code = &v
	return s
}

func (s *CreateLeasePaymentfileResponse) SetErrMessage(v string) *CreateLeasePaymentfileResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateLeasePaymentfileResponse) SetResponseData(v string) *CreateLeasePaymentfileResponse {
	s.ResponseData = &v
	return s
}

type CreateLeaseRentalRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 融资租赁业务id，由资方控制台生成返回
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 手续费，如通过预授权、代扣的方式规划，必填
	Charge *int64 `json:"charge,omitempty" xml:"charge,omitempty" require:"true"`
	// 融资租赁用户还款额外字段
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 是否本订单所有租金还款状态结束
	IsFinish *bool `json:"is_finish,omitempty" xml:"is_finish,omitempty" require:"true"`
	// 租期编号，从1开始
	LeaseTermIndex *int64 `json:"lease_term_index,omitempty" xml:"lease_term_index,omitempty" require:"true"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 剩余租金总数,会核验剩余租金与承诺等额
	RemainRental *int64 `json:"remain_rental,omitempty" xml:"remain_rental,omitempty" require:"true"`
	// 剩余归还期数
	RemainTerm *int64 `json:"remain_term,omitempty" xml:"remain_term,omitempty" require:"true"`
	// 租金归还金额,精确到毫厘，即123400表示12.34元
	RentalMoney *int64 `json:"rental_money,omitempty" xml:"rental_money,omitempty" require:"true"`
	// 租金归还状态，1.足额归还2.部分归还3.未归还
	RentalReturnState *int64 `json:"rental_return_state,omitempty" xml:"rental_return_state,omitempty" require:"true"`
	// 归还时间，格式为"2019-07-31 12:00:00"
	ReturnTime *string `json:"return_time,omitempty" xml:"return_time,omitempty" require:"true"`
	// 还款凭证编号，不超过128字符，1.支付宝流水号
	ReturnVoucherSerial *string `json:"return_voucher_serial,omitempty" xml:"return_voucher_serial,omitempty" require:"true"`
	// 还款凭证类型，1.支付宝2.平台代收（客户主动还款）3.其他
	ReturnVoucherType *int64 `json:"return_voucher_type,omitempty" xml:"return_voucher_type,omitempty" require:"true"`
	// 归还方式，1.预授权代扣2.支付宝代扣3.主动还款4.其他
	ReturnWay *int64 `json:"return_way,omitempty" xml:"return_way,omitempty" require:"true"`
	// 是否启动订单的异步处理
	Async *int64 `json:"async,omitempty" xml:"async,omitempty"`
}

func (s CreateLeaseRentalRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseRentalRequest) GoString() string {
	return s.String()
}

func (s *CreateLeaseRentalRequest) SetAuthToken(v string) *CreateLeaseRentalRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeaseRentalRequest) SetProductInstanceId(v string) *CreateLeaseRentalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeaseRentalRequest) SetApplicationId(v string) *CreateLeaseRentalRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateLeaseRentalRequest) SetCharge(v int64) *CreateLeaseRentalRequest {
	s.Charge = &v
	return s
}

func (s *CreateLeaseRentalRequest) SetExtraInfo(v string) *CreateLeaseRentalRequest {
	s.ExtraInfo = &v
	return s
}

func (s *CreateLeaseRentalRequest) SetIsFinish(v bool) *CreateLeaseRentalRequest {
	s.IsFinish = &v
	return s
}

func (s *CreateLeaseRentalRequest) SetLeaseTermIndex(v int64) *CreateLeaseRentalRequest {
	s.LeaseTermIndex = &v
	return s
}

func (s *CreateLeaseRentalRequest) SetOrderId(v string) *CreateLeaseRentalRequest {
	s.OrderId = &v
	return s
}

func (s *CreateLeaseRentalRequest) SetRemainRental(v int64) *CreateLeaseRentalRequest {
	s.RemainRental = &v
	return s
}

func (s *CreateLeaseRentalRequest) SetRemainTerm(v int64) *CreateLeaseRentalRequest {
	s.RemainTerm = &v
	return s
}

func (s *CreateLeaseRentalRequest) SetRentalMoney(v int64) *CreateLeaseRentalRequest {
	s.RentalMoney = &v
	return s
}

func (s *CreateLeaseRentalRequest) SetRentalReturnState(v int64) *CreateLeaseRentalRequest {
	s.RentalReturnState = &v
	return s
}

func (s *CreateLeaseRentalRequest) SetReturnTime(v string) *CreateLeaseRentalRequest {
	s.ReturnTime = &v
	return s
}

func (s *CreateLeaseRentalRequest) SetReturnVoucherSerial(v string) *CreateLeaseRentalRequest {
	s.ReturnVoucherSerial = &v
	return s
}

func (s *CreateLeaseRentalRequest) SetReturnVoucherType(v int64) *CreateLeaseRentalRequest {
	s.ReturnVoucherType = &v
	return s
}

func (s *CreateLeaseRentalRequest) SetReturnWay(v int64) *CreateLeaseRentalRequest {
	s.ReturnWay = &v
	return s
}

func (s *CreateLeaseRentalRequest) SetAsync(v int64) *CreateLeaseRentalRequest {
	s.Async = &v
	return s
}

type CreateLeaseRentalResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	//
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 租金归还记录上传到链上的哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s CreateLeaseRentalResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseRentalResponse) GoString() string {
	return s.String()
}

func (s *CreateLeaseRentalResponse) SetReqMsgId(v string) *CreateLeaseRentalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeaseRentalResponse) SetResultCode(v string) *CreateLeaseRentalResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeaseRentalResponse) SetResultMsg(v string) *CreateLeaseRentalResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeaseRentalResponse) SetCode(v int64) *CreateLeaseRentalResponse {
	s.Code = &v
	return s
}

func (s *CreateLeaseRentalResponse) SetErrMessage(v string) *CreateLeaseRentalResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateLeaseRentalResponse) SetResponseData(v string) *CreateLeaseRentalResponse {
	s.ResponseData = &v
	return s
}

type CreateLeaseClearingRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 融资租赁业务id，由资方控制台创建返回
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 清分收款账号 长度不超过64
	ClearingAccount *string `json:"clearing_account,omitempty" xml:"clearing_account,omitempty" require:"true"`
	// 清分金额,精确到毫厘，即123400表示12.34元
	ClearingMoney *int64 `json:"clearing_money,omitempty" xml:"clearing_money,omitempty" require:"true"`
	// 清分订单号 长度不超过128
	ClearingOrderIds []*string `json:"clearing_order_ids,omitempty" xml:"clearing_order_ids,omitempty" require:"true" type:"Repeated"`
	// 清分状态,1.足额2.部分3.零
	ClearingState *int64 `json:"clearing_state,omitempty" xml:"clearing_state,omitempty"`
	// 结束时间，格式为"2019-07-31 12:00:00"
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true"`
	// 融资租赁额外字段
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 租赁平台商户Id 长度不可超过50
	LeaseId *string `json:"lease_id,omitempty" xml:"lease_id,omitempty" require:"true"`
	// 订单id 长度不可超过50
	//
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 还款批次
	ReturnIndex *int64 `json:"return_index,omitempty" xml:"return_index,omitempty" require:"true"`
	// 开始时间，格式为"2019-07-31 12:00:00"
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true"`
	// 是否启动订单的异步处理
	Async *int64 `json:"async,omitempty" xml:"async,omitempty"`
	// 清分资金的来源，比如用户xx元，商家yy元
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
}

func (s CreateLeaseClearingRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseClearingRequest) GoString() string {
	return s.String()
}

func (s *CreateLeaseClearingRequest) SetAuthToken(v string) *CreateLeaseClearingRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeaseClearingRequest) SetProductInstanceId(v string) *CreateLeaseClearingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeaseClearingRequest) SetApplicationId(v string) *CreateLeaseClearingRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateLeaseClearingRequest) SetClearingAccount(v string) *CreateLeaseClearingRequest {
	s.ClearingAccount = &v
	return s
}

func (s *CreateLeaseClearingRequest) SetClearingMoney(v int64) *CreateLeaseClearingRequest {
	s.ClearingMoney = &v
	return s
}

func (s *CreateLeaseClearingRequest) SetClearingOrderIds(v []*string) *CreateLeaseClearingRequest {
	s.ClearingOrderIds = v
	return s
}

func (s *CreateLeaseClearingRequest) SetClearingState(v int64) *CreateLeaseClearingRequest {
	s.ClearingState = &v
	return s
}

func (s *CreateLeaseClearingRequest) SetEndTime(v string) *CreateLeaseClearingRequest {
	s.EndTime = &v
	return s
}

func (s *CreateLeaseClearingRequest) SetExtraInfo(v string) *CreateLeaseClearingRequest {
	s.ExtraInfo = &v
	return s
}

func (s *CreateLeaseClearingRequest) SetLeaseId(v string) *CreateLeaseClearingRequest {
	s.LeaseId = &v
	return s
}

func (s *CreateLeaseClearingRequest) SetOrderId(v string) *CreateLeaseClearingRequest {
	s.OrderId = &v
	return s
}

func (s *CreateLeaseClearingRequest) SetReturnIndex(v int64) *CreateLeaseClearingRequest {
	s.ReturnIndex = &v
	return s
}

func (s *CreateLeaseClearingRequest) SetStartTime(v string) *CreateLeaseClearingRequest {
	s.StartTime = &v
	return s
}

func (s *CreateLeaseClearingRequest) SetAsync(v int64) *CreateLeaseClearingRequest {
	s.Async = &v
	return s
}

func (s *CreateLeaseClearingRequest) SetMemo(v string) *CreateLeaseClearingRequest {
	s.Memo = &v
	return s
}

type CreateLeaseClearingResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	//
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 清分信息链上交易哈希
	//
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s CreateLeaseClearingResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseClearingResponse) GoString() string {
	return s.String()
}

func (s *CreateLeaseClearingResponse) SetReqMsgId(v string) *CreateLeaseClearingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeaseClearingResponse) SetResultCode(v string) *CreateLeaseClearingResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeaseClearingResponse) SetResultMsg(v string) *CreateLeaseClearingResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeaseClearingResponse) SetCode(v int64) *CreateLeaseClearingResponse {
	s.Code = &v
	return s
}

func (s *CreateLeaseClearingResponse) SetErrMessage(v string) *CreateLeaseClearingResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateLeaseClearingResponse) SetResponseData(v string) *CreateLeaseClearingResponse {
	s.ResponseData = &v
	return s
}

type CreateLeaseRepaymentRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 融资租赁业务id，由资方控制台生成返回
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 融资租赁租户还款额外字段
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 是否最终订单还款结束
	IsFinish *bool `json:"is_finish,omitempty" xml:"is_finish,omitempty" require:"true"`
	// 租赁平台商户Id 长度不可超过50
	LeaseId *string `json:"lease_id,omitempty" xml:"lease_id,omitempty" require:"true"`
	// 订单id 长度不可超过50
	//
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 逾期天数,支用到期日开始计算
	OverdueDay *int64 `json:"overdue_day,omitempty" xml:"overdue_day,omitempty"`
	// 逾期应还款总额,本金+利息+逾期利息,精确到毫厘，即123400表示12.34元
	OverdueMoney *int64 `json:"overdue_money,omitempty" xml:"overdue_money,omitempty"`
	// 逾期利率（日利率）,精确到小数点后四位 12.34% 表示为1234
	OverdueRate *int64 `json:"overdue_rate,omitempty" xml:"overdue_rate,omitempty"`
	// 逾期状态,暂时都以0处理，目前不处理
	OverdueStatus *int64 `json:"overdue_status,omitempty" xml:"overdue_status,omitempty"`
	// 剩余应还金额，精确到毫厘，即123400表示12.34元
	RemainReturnMoney *int64 `json:"remain_return_money,omitempty" xml:"remain_return_money,omitempty" require:"true"`
	// 剩余应还期数
	//
	RemainReturnTerm *int64 `json:"remain_return_term,omitempty" xml:"remain_return_term,omitempty" require:"true"`
	// 每次还款流水凭证，需要融资方确认，id一样则不处理
	RepaymentUniqueId *string `json:"repayment_unique_id,omitempty" xml:"repayment_unique_id,omitempty" require:"true"`
	// 还款结果简要描述,长度不超过256
	ReturnDescription *string `json:"return_description,omitempty" xml:"return_description,omitempty" require:"true"`
	// 还款批次
	//
	ReturnIndex *int64 `json:"return_index,omitempty" xml:"return_index,omitempty" require:"true"`
	// 还款总额,本金+利息，精确到毫厘，即123400表示12.34元
	ReturnMoney *int64 `json:"return_money,omitempty" xml:"return_money,omitempty" require:"true"`
	// 还款结果状态,1.成功 2.失败
	ReturnStatus *int64 `json:"return_status,omitempty" xml:"return_status,omitempty" require:"true"`
	// 还款日期，格式为"2019-07-31 12:00:00"
	ReturnTime *string `json:"return_time,omitempty" xml:"return_time,omitempty" require:"true"`
	// 还款来源,1.共管账号，2.网商清分
	Source *int64 `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 逾期后还款状态,1未还款,2已还款
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
	// 是否启动订单的异步处理
	Async *int64 `json:"async,omitempty" xml:"async,omitempty"`
}

func (s CreateLeaseRepaymentRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseRepaymentRequest) GoString() string {
	return s.String()
}

func (s *CreateLeaseRepaymentRequest) SetAuthToken(v string) *CreateLeaseRepaymentRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeaseRepaymentRequest) SetProductInstanceId(v string) *CreateLeaseRepaymentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeaseRepaymentRequest) SetApplicationId(v string) *CreateLeaseRepaymentRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateLeaseRepaymentRequest) SetExtraInfo(v string) *CreateLeaseRepaymentRequest {
	s.ExtraInfo = &v
	return s
}

func (s *CreateLeaseRepaymentRequest) SetIsFinish(v bool) *CreateLeaseRepaymentRequest {
	s.IsFinish = &v
	return s
}

func (s *CreateLeaseRepaymentRequest) SetLeaseId(v string) *CreateLeaseRepaymentRequest {
	s.LeaseId = &v
	return s
}

func (s *CreateLeaseRepaymentRequest) SetOrderId(v string) *CreateLeaseRepaymentRequest {
	s.OrderId = &v
	return s
}

func (s *CreateLeaseRepaymentRequest) SetOverdueDay(v int64) *CreateLeaseRepaymentRequest {
	s.OverdueDay = &v
	return s
}

func (s *CreateLeaseRepaymentRequest) SetOverdueMoney(v int64) *CreateLeaseRepaymentRequest {
	s.OverdueMoney = &v
	return s
}

func (s *CreateLeaseRepaymentRequest) SetOverdueRate(v int64) *CreateLeaseRepaymentRequest {
	s.OverdueRate = &v
	return s
}

func (s *CreateLeaseRepaymentRequest) SetOverdueStatus(v int64) *CreateLeaseRepaymentRequest {
	s.OverdueStatus = &v
	return s
}

func (s *CreateLeaseRepaymentRequest) SetRemainReturnMoney(v int64) *CreateLeaseRepaymentRequest {
	s.RemainReturnMoney = &v
	return s
}

func (s *CreateLeaseRepaymentRequest) SetRemainReturnTerm(v int64) *CreateLeaseRepaymentRequest {
	s.RemainReturnTerm = &v
	return s
}

func (s *CreateLeaseRepaymentRequest) SetRepaymentUniqueId(v string) *CreateLeaseRepaymentRequest {
	s.RepaymentUniqueId = &v
	return s
}

func (s *CreateLeaseRepaymentRequest) SetReturnDescription(v string) *CreateLeaseRepaymentRequest {
	s.ReturnDescription = &v
	return s
}

func (s *CreateLeaseRepaymentRequest) SetReturnIndex(v int64) *CreateLeaseRepaymentRequest {
	s.ReturnIndex = &v
	return s
}

func (s *CreateLeaseRepaymentRequest) SetReturnMoney(v int64) *CreateLeaseRepaymentRequest {
	s.ReturnMoney = &v
	return s
}

func (s *CreateLeaseRepaymentRequest) SetReturnStatus(v int64) *CreateLeaseRepaymentRequest {
	s.ReturnStatus = &v
	return s
}

func (s *CreateLeaseRepaymentRequest) SetReturnTime(v string) *CreateLeaseRepaymentRequest {
	s.ReturnTime = &v
	return s
}

func (s *CreateLeaseRepaymentRequest) SetSource(v int64) *CreateLeaseRepaymentRequest {
	s.Source = &v
	return s
}

func (s *CreateLeaseRepaymentRequest) SetStatus(v int64) *CreateLeaseRepaymentRequest {
	s.Status = &v
	return s
}

func (s *CreateLeaseRepaymentRequest) SetAsync(v int64) *CreateLeaseRepaymentRequest {
	s.Async = &v
	return s
}

type CreateLeaseRepaymentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 融资租赁金融机构上传还款信息链上交易哈希值
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s CreateLeaseRepaymentResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseRepaymentResponse) GoString() string {
	return s.String()
}

func (s *CreateLeaseRepaymentResponse) SetReqMsgId(v string) *CreateLeaseRepaymentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeaseRepaymentResponse) SetResultCode(v string) *CreateLeaseRepaymentResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeaseRepaymentResponse) SetResultMsg(v string) *CreateLeaseRepaymentResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeaseRepaymentResponse) SetCode(v int64) *CreateLeaseRepaymentResponse {
	s.Code = &v
	return s
}

func (s *CreateLeaseRepaymentResponse) SetErrMessage(v string) *CreateLeaseRepaymentResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateLeaseRepaymentResponse) SetResponseData(v string) *CreateLeaseRepaymentResponse {
	s.ResponseData = &v
	return s
}

type CreateLeaseNotifyregisterRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s CreateLeaseNotifyregisterRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseNotifyregisterRequest) GoString() string {
	return s.String()
}

func (s *CreateLeaseNotifyregisterRequest) SetAuthToken(v string) *CreateLeaseNotifyregisterRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeaseNotifyregisterRequest) SetProductInstanceId(v string) *CreateLeaseNotifyregisterRequest {
	s.ProductInstanceId = &v
	return s
}

type CreateLeaseNotifyregisterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
}

func (s CreateLeaseNotifyregisterResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseNotifyregisterResponse) GoString() string {
	return s.String()
}

func (s *CreateLeaseNotifyregisterResponse) SetReqMsgId(v string) *CreateLeaseNotifyregisterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeaseNotifyregisterResponse) SetResultCode(v string) *CreateLeaseNotifyregisterResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeaseNotifyregisterResponse) SetResultMsg(v string) *CreateLeaseNotifyregisterResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeaseNotifyregisterResponse) SetCode(v int64) *CreateLeaseNotifyregisterResponse {
	s.Code = &v
	return s
}

func (s *CreateLeaseNotifyregisterResponse) SetErrMessage(v string) *CreateLeaseNotifyregisterResponse {
	s.ErrMessage = &v
	return s
}

type QueryLeaseIotinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询截止时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true"`
	// 设备唯一id imei id
	ProductImeiId *string `json:"product_imei_id,omitempty" xml:"product_imei_id,omitempty" require:"true"`
	// 查询开启时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true"`
}

func (s QueryLeaseIotinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryLeaseIotinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryLeaseIotinfoRequest) SetAuthToken(v string) *QueryLeaseIotinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryLeaseIotinfoRequest) SetProductInstanceId(v string) *QueryLeaseIotinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryLeaseIotinfoRequest) SetEndTime(v string) *QueryLeaseIotinfoRequest {
	s.EndTime = &v
	return s
}

func (s *QueryLeaseIotinfoRequest) SetProductImeiId(v string) *QueryLeaseIotinfoRequest {
	s.ProductImeiId = &v
	return s
}

func (s *QueryLeaseIotinfoRequest) SetStartTime(v string) *QueryLeaseIotinfoRequest {
	s.StartTime = &v
	return s
}

type QueryLeaseIotinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// ""
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 设备详情
	LeaseIotItemInfo []*LeaseIotItemInfo `json:"lease_iot_item_info,omitempty" xml:"lease_iot_item_info,omitempty" type:"Repeated"`
}

func (s QueryLeaseIotinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryLeaseIotinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryLeaseIotinfoResponse) SetReqMsgId(v string) *QueryLeaseIotinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryLeaseIotinfoResponse) SetResultCode(v string) *QueryLeaseIotinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryLeaseIotinfoResponse) SetResultMsg(v string) *QueryLeaseIotinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryLeaseIotinfoResponse) SetCode(v int64) *QueryLeaseIotinfoResponse {
	s.Code = &v
	return s
}

func (s *QueryLeaseIotinfoResponse) SetErrMessage(v string) *QueryLeaseIotinfoResponse {
	s.ErrMessage = &v
	return s
}

func (s *QueryLeaseIotinfoResponse) SetLeaseIotItemInfo(v []*LeaseIotItemInfo) *QueryLeaseIotinfoResponse {
	s.LeaseIotItemInfo = v
	return s
}

type CreateCourtTextnotaryRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 对应的法院编号
	AgencyCode *string `json:"agency_code,omitempty" xml:"agency_code,omitempty"`
	// 对应的法院应用ID
	ApplicationCode *string `json:"application_code,omitempty" xml:"application_code,omitempty"`
	// 业务类型标识
	BusinessType *string `json:"business_type,omitempty" xml:"business_type,omitempty"`
	// 数据类型标识
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty"`
	// 地理位置信息
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 存证阶段
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty" require:"true"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 文本数据
	TextContent *string `json:"text_content,omitempty" xml:"text_content,omitempty" require:"true"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty" require:"true"`
	// 是否使用可信时间戳
	Tsr *bool `json:"tsr,omitempty" xml:"tsr,omitempty"`
}

func (s CreateCourtTextnotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateCourtTextnotaryRequest) GoString() string {
	return s.String()
}

func (s *CreateCourtTextnotaryRequest) SetAuthToken(v string) *CreateCourtTextnotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateCourtTextnotaryRequest) SetProductInstanceId(v string) *CreateCourtTextnotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateCourtTextnotaryRequest) SetAgencyCode(v string) *CreateCourtTextnotaryRequest {
	s.AgencyCode = &v
	return s
}

func (s *CreateCourtTextnotaryRequest) SetApplicationCode(v string) *CreateCourtTextnotaryRequest {
	s.ApplicationCode = &v
	return s
}

func (s *CreateCourtTextnotaryRequest) SetBusinessType(v string) *CreateCourtTextnotaryRequest {
	s.BusinessType = &v
	return s
}

func (s *CreateCourtTextnotaryRequest) SetDataType(v string) *CreateCourtTextnotaryRequest {
	s.DataType = &v
	return s
}

func (s *CreateCourtTextnotaryRequest) SetLocation(v *Location) *CreateCourtTextnotaryRequest {
	s.Location = v
	return s
}

func (s *CreateCourtTextnotaryRequest) SetPhase(v string) *CreateCourtTextnotaryRequest {
	s.Phase = &v
	return s
}

func (s *CreateCourtTextnotaryRequest) SetProperties(v string) *CreateCourtTextnotaryRequest {
	s.Properties = &v
	return s
}

func (s *CreateCourtTextnotaryRequest) SetTextContent(v string) *CreateCourtTextnotaryRequest {
	s.TextContent = &v
	return s
}

func (s *CreateCourtTextnotaryRequest) SetTransactionId(v string) *CreateCourtTextnotaryRequest {
	s.TransactionId = &v
	return s
}

func (s *CreateCourtTextnotaryRequest) SetTsr(v bool) *CreateCourtTextnotaryRequest {
	s.Tsr = &v
	return s
}

type CreateCourtTextnotaryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 可信时间戳
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateCourtTextnotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateCourtTextnotaryResponse) GoString() string {
	return s.String()
}

func (s *CreateCourtTextnotaryResponse) SetReqMsgId(v string) *CreateCourtTextnotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateCourtTextnotaryResponse) SetResultCode(v string) *CreateCourtTextnotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateCourtTextnotaryResponse) SetResultMsg(v string) *CreateCourtTextnotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateCourtTextnotaryResponse) SetTsr(v *TsrResponse) *CreateCourtTextnotaryResponse {
	s.Tsr = v
	return s
}

func (s *CreateCourtTextnotaryResponse) SetTxHash(v string) *CreateCourtTextnotaryResponse {
	s.TxHash = &v
	return s
}

type GetCourtTextnotaryRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 地理位置信息
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 存证阶段
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
}

func (s GetCourtTextnotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s GetCourtTextnotaryRequest) GoString() string {
	return s.String()
}

func (s *GetCourtTextnotaryRequest) SetAuthToken(v string) *GetCourtTextnotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *GetCourtTextnotaryRequest) SetProductInstanceId(v string) *GetCourtTextnotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetCourtTextnotaryRequest) SetLocation(v *Location) *GetCourtTextnotaryRequest {
	s.Location = v
	return s
}

func (s *GetCourtTextnotaryRequest) SetPhase(v string) *GetCourtTextnotaryRequest {
	s.Phase = &v
	return s
}

func (s *GetCourtTextnotaryRequest) SetProperties(v string) *GetCourtTextnotaryRequest {
	s.Properties = &v
	return s
}

func (s *GetCourtTextnotaryRequest) SetTransactionId(v string) *GetCourtTextnotaryRequest {
	s.TransactionId = &v
	return s
}

func (s *GetCourtTextnotaryRequest) SetTxHash(v string) *GetCourtTextnotaryRequest {
	s.TxHash = &v
	return s
}

type GetCourtTextnotaryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务类型标识
	BusinessType *string `json:"business_type,omitempty" xml:"business_type,omitempty"`
	// 数据类型标识
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty"`
	// 文本数据
	TextContent *string `json:"text_content,omitempty" xml:"text_content,omitempty"`
	// 可信时间戳
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 对应的法院编号
	AgencyCode *string `json:"agency_code,omitempty" xml:"agency_code,omitempty"`
	// 对应的法院应用ID
	ApplicationCode *string `json:"application_code,omitempty" xml:"application_code,omitempty"`
}

func (s GetCourtTextnotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s GetCourtTextnotaryResponse) GoString() string {
	return s.String()
}

func (s *GetCourtTextnotaryResponse) SetReqMsgId(v string) *GetCourtTextnotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetCourtTextnotaryResponse) SetResultCode(v string) *GetCourtTextnotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *GetCourtTextnotaryResponse) SetResultMsg(v string) *GetCourtTextnotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetCourtTextnotaryResponse) SetBusinessType(v string) *GetCourtTextnotaryResponse {
	s.BusinessType = &v
	return s
}

func (s *GetCourtTextnotaryResponse) SetDataType(v string) *GetCourtTextnotaryResponse {
	s.DataType = &v
	return s
}

func (s *GetCourtTextnotaryResponse) SetTextContent(v string) *GetCourtTextnotaryResponse {
	s.TextContent = &v
	return s
}

func (s *GetCourtTextnotaryResponse) SetTsr(v *TsrResponse) *GetCourtTextnotaryResponse {
	s.Tsr = v
	return s
}

func (s *GetCourtTextnotaryResponse) SetAgencyCode(v string) *GetCourtTextnotaryResponse {
	s.AgencyCode = &v
	return s
}

func (s *GetCourtTextnotaryResponse) SetApplicationCode(v string) *GetCourtTextnotaryResponse {
	s.ApplicationCode = &v
	return s
}

type CreateCourtFilenotaryRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 对应的法院编号
	AgencyCode *string `json:"agency_code,omitempty" xml:"agency_code,omitempty"`
	// 对应的法院应用ID
	ApplicationCode *string `json:"application_code,omitempty" xml:"application_code,omitempty"`
	// 业务类型标识
	BusinessType *string `json:"business_type,omitempty" xml:"business_type,omitempty"`
	// 数据类型标识
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty"`
	// 文件哈希
	FileHash *string `json:"file_hash,omitempty" xml:"file_hash,omitempty" require:"true"`
	// 文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 哈希算法，目前仅支持SHA256
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty" require:"true"`
	// 地理位置信息
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 存证阶段
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty" require:"true"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty" require:"true"`
	// 是否使用可信时间戳
	Tsr *bool `json:"tsr,omitempty" xml:"tsr,omitempty"`
}

func (s CreateCourtFilenotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateCourtFilenotaryRequest) GoString() string {
	return s.String()
}

func (s *CreateCourtFilenotaryRequest) SetAuthToken(v string) *CreateCourtFilenotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateCourtFilenotaryRequest) SetProductInstanceId(v string) *CreateCourtFilenotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateCourtFilenotaryRequest) SetAgencyCode(v string) *CreateCourtFilenotaryRequest {
	s.AgencyCode = &v
	return s
}

func (s *CreateCourtFilenotaryRequest) SetApplicationCode(v string) *CreateCourtFilenotaryRequest {
	s.ApplicationCode = &v
	return s
}

func (s *CreateCourtFilenotaryRequest) SetBusinessType(v string) *CreateCourtFilenotaryRequest {
	s.BusinessType = &v
	return s
}

func (s *CreateCourtFilenotaryRequest) SetDataType(v string) *CreateCourtFilenotaryRequest {
	s.DataType = &v
	return s
}

func (s *CreateCourtFilenotaryRequest) SetFileHash(v string) *CreateCourtFilenotaryRequest {
	s.FileHash = &v
	return s
}

func (s *CreateCourtFilenotaryRequest) SetFileName(v string) *CreateCourtFilenotaryRequest {
	s.FileName = &v
	return s
}

func (s *CreateCourtFilenotaryRequest) SetHashAlgorithm(v string) *CreateCourtFilenotaryRequest {
	s.HashAlgorithm = &v
	return s
}

func (s *CreateCourtFilenotaryRequest) SetLocation(v *Location) *CreateCourtFilenotaryRequest {
	s.Location = v
	return s
}

func (s *CreateCourtFilenotaryRequest) SetPhase(v string) *CreateCourtFilenotaryRequest {
	s.Phase = &v
	return s
}

func (s *CreateCourtFilenotaryRequest) SetProperties(v string) *CreateCourtFilenotaryRequest {
	s.Properties = &v
	return s
}

func (s *CreateCourtFilenotaryRequest) SetTransactionId(v string) *CreateCourtFilenotaryRequest {
	s.TransactionId = &v
	return s
}

func (s *CreateCourtFilenotaryRequest) SetTsr(v bool) *CreateCourtFilenotaryRequest {
	s.Tsr = &v
	return s
}

type CreateCourtFilenotaryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 可信时间戳
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateCourtFilenotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateCourtFilenotaryResponse) GoString() string {
	return s.String()
}

func (s *CreateCourtFilenotaryResponse) SetReqMsgId(v string) *CreateCourtFilenotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateCourtFilenotaryResponse) SetResultCode(v string) *CreateCourtFilenotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateCourtFilenotaryResponse) SetResultMsg(v string) *CreateCourtFilenotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateCourtFilenotaryResponse) SetTsr(v *TsrResponse) *CreateCourtFilenotaryResponse {
	s.Tsr = v
	return s
}

func (s *CreateCourtFilenotaryResponse) SetTxHash(v string) *CreateCourtFilenotaryResponse {
	s.TxHash = &v
	return s
}

type GetCourtFilenotaryRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 地理位置信息
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 存证阶段
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
}

func (s GetCourtFilenotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s GetCourtFilenotaryRequest) GoString() string {
	return s.String()
}

func (s *GetCourtFilenotaryRequest) SetAuthToken(v string) *GetCourtFilenotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *GetCourtFilenotaryRequest) SetProductInstanceId(v string) *GetCourtFilenotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetCourtFilenotaryRequest) SetLocation(v *Location) *GetCourtFilenotaryRequest {
	s.Location = v
	return s
}

func (s *GetCourtFilenotaryRequest) SetPhase(v string) *GetCourtFilenotaryRequest {
	s.Phase = &v
	return s
}

func (s *GetCourtFilenotaryRequest) SetProperties(v string) *GetCourtFilenotaryRequest {
	s.Properties = &v
	return s
}

func (s *GetCourtFilenotaryRequest) SetTransactionId(v string) *GetCourtFilenotaryRequest {
	s.TransactionId = &v
	return s
}

func (s *GetCourtFilenotaryRequest) SetTxHash(v string) *GetCourtFilenotaryRequest {
	s.TxHash = &v
	return s
}

type GetCourtFilenotaryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务类型标识
	BusinessType *string `json:"business_type,omitempty" xml:"business_type,omitempty"`
	// 数据类型标识
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty"`
	// 文件哈希
	FileHash *string `json:"file_hash,omitempty" xml:"file_hash,omitempty"`
	// 文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// 可信时间戳
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 对应的法院编号
	AgencyCode *string `json:"agency_code,omitempty" xml:"agency_code,omitempty"`
	// 对应的法院应用ID
	ApplicationCode *string `json:"application_code,omitempty" xml:"application_code,omitempty"`
}

func (s GetCourtFilenotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s GetCourtFilenotaryResponse) GoString() string {
	return s.String()
}

func (s *GetCourtFilenotaryResponse) SetReqMsgId(v string) *GetCourtFilenotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetCourtFilenotaryResponse) SetResultCode(v string) *GetCourtFilenotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *GetCourtFilenotaryResponse) SetResultMsg(v string) *GetCourtFilenotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetCourtFilenotaryResponse) SetBusinessType(v string) *GetCourtFilenotaryResponse {
	s.BusinessType = &v
	return s
}

func (s *GetCourtFilenotaryResponse) SetDataType(v string) *GetCourtFilenotaryResponse {
	s.DataType = &v
	return s
}

func (s *GetCourtFilenotaryResponse) SetFileHash(v string) *GetCourtFilenotaryResponse {
	s.FileHash = &v
	return s
}

func (s *GetCourtFilenotaryResponse) SetFileName(v string) *GetCourtFilenotaryResponse {
	s.FileName = &v
	return s
}

func (s *GetCourtFilenotaryResponse) SetTsr(v *TsrResponse) *GetCourtFilenotaryResponse {
	s.Tsr = v
	return s
}

func (s *GetCourtFilenotaryResponse) SetAgencyCode(v string) *GetCourtFilenotaryResponse {
	s.AgencyCode = &v
	return s
}

func (s *GetCourtFilenotaryResponse) SetApplicationCode(v string) *GetCourtFilenotaryResponse {
	s.ApplicationCode = &v
	return s
}

type CreateLeaseRouteRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 方法名
	Route *string `json:"route,omitempty" xml:"route,omitempty" require:"true"`
	// 具体业务字段，json形式
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s CreateLeaseRouteRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseRouteRequest) GoString() string {
	return s.String()
}

func (s *CreateLeaseRouteRequest) SetAuthToken(v string) *CreateLeaseRouteRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeaseRouteRequest) SetProductInstanceId(v string) *CreateLeaseRouteRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeaseRouteRequest) SetRoute(v string) *CreateLeaseRouteRequest {
	s.Route = &v
	return s
}

func (s *CreateLeaseRouteRequest) SetBizContent(v string) *CreateLeaseRouteRequest {
	s.BizContent = &v
	return s
}

type CreateLeaseRouteResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码
	//
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	//
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 租方承诺信息存储到合约中对应的区块链交易哈希
	//
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s CreateLeaseRouteResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseRouteResponse) GoString() string {
	return s.String()
}

func (s *CreateLeaseRouteResponse) SetReqMsgId(v string) *CreateLeaseRouteResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeaseRouteResponse) SetResultCode(v string) *CreateLeaseRouteResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeaseRouteResponse) SetResultMsg(v string) *CreateLeaseRouteResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeaseRouteResponse) SetCode(v int64) *CreateLeaseRouteResponse {
	s.Code = &v
	return s
}

func (s *CreateLeaseRouteResponse) SetErrMessage(v string) *CreateLeaseRouteResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateLeaseRouteResponse) SetResponseData(v string) *CreateLeaseRouteResponse {
	s.ResponseData = &v
	return s
}

type QueryLeaseEncryptedinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 被查询的租赁公司对应的租户ID
	LeaseId *string `json:"lease_id,omitempty" xml:"lease_id,omitempty" require:"true"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 融资租赁业务id，由资方控制台创建返回
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
}

func (s QueryLeaseEncryptedinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryLeaseEncryptedinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryLeaseEncryptedinfoRequest) SetAuthToken(v string) *QueryLeaseEncryptedinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryLeaseEncryptedinfoRequest) SetProductInstanceId(v string) *QueryLeaseEncryptedinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryLeaseEncryptedinfoRequest) SetLeaseId(v string) *QueryLeaseEncryptedinfoRequest {
	s.LeaseId = &v
	return s
}

func (s *QueryLeaseEncryptedinfoRequest) SetOrderId(v string) *QueryLeaseEncryptedinfoRequest {
	s.OrderId = &v
	return s
}

func (s *QueryLeaseEncryptedinfoRequest) SetApplicationId(v string) *QueryLeaseEncryptedinfoRequest {
	s.ApplicationId = &v
	return s
}

type QueryLeaseEncryptedinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误描述信息
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 对应的加密后的具体信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s QueryLeaseEncryptedinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryLeaseEncryptedinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryLeaseEncryptedinfoResponse) SetReqMsgId(v string) *QueryLeaseEncryptedinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryLeaseEncryptedinfoResponse) SetResultCode(v string) *QueryLeaseEncryptedinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryLeaseEncryptedinfoResponse) SetResultMsg(v string) *QueryLeaseEncryptedinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryLeaseEncryptedinfoResponse) SetCode(v int64) *QueryLeaseEncryptedinfoResponse {
	s.Code = &v
	return s
}

func (s *QueryLeaseEncryptedinfoResponse) SetErrMessage(v string) *QueryLeaseEncryptedinfoResponse {
	s.ErrMessage = &v
	return s
}

func (s *QueryLeaseEncryptedinfoResponse) SetResponseData(v string) *QueryLeaseEncryptedinfoResponse {
	s.ResponseData = &v
	return s
}

type CreateContractTextRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署结束信息，phase为FINISH时必选
	FinishInfo *ContractNotaryFinishInfo `json:"finish_info,omitempty" xml:"finish_info,omitempty"`
	// 签署流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	// 签署发起信息，phase为INIT时必选
	InitInfo *ContractNotaryInitInfo `json:"init_info,omitempty" xml:"init_info,omitempty"`
	// 存证阶段，分为INIT(发起)，SIGN(签署)，FINISH(结束)
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty" require:"true"`
	// 签署过程信息，phase为SIGN时必选
	SignInfo *ContractNotarySignInfo `json:"sign_info,omitempty" xml:"sign_info,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty" require:"true"`
	// 签署文件存档阶段存证核验信息
	DocumentInfo *ContractNotaryDocumentInfo `json:"document_info,omitempty" xml:"document_info,omitempty"`
}

func (s CreateContractTextRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateContractTextRequest) GoString() string {
	return s.String()
}

func (s *CreateContractTextRequest) SetAuthToken(v string) *CreateContractTextRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateContractTextRequest) SetProductInstanceId(v string) *CreateContractTextRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateContractTextRequest) SetFinishInfo(v *ContractNotaryFinishInfo) *CreateContractTextRequest {
	s.FinishInfo = v
	return s
}

func (s *CreateContractTextRequest) SetFlowId(v string) *CreateContractTextRequest {
	s.FlowId = &v
	return s
}

func (s *CreateContractTextRequest) SetInitInfo(v *ContractNotaryInitInfo) *CreateContractTextRequest {
	s.InitInfo = v
	return s
}

func (s *CreateContractTextRequest) SetPhase(v string) *CreateContractTextRequest {
	s.Phase = &v
	return s
}

func (s *CreateContractTextRequest) SetSignInfo(v *ContractNotarySignInfo) *CreateContractTextRequest {
	s.SignInfo = v
	return s
}

func (s *CreateContractTextRequest) SetTransactionId(v string) *CreateContractTextRequest {
	s.TransactionId = &v
	return s
}

func (s *CreateContractTextRequest) SetDocumentInfo(v *ContractNotaryDocumentInfo) *CreateContractTextRequest {
	s.DocumentInfo = v
	return s
}

type CreateContractTextResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证凭据
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateContractTextResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateContractTextResponse) GoString() string {
	return s.String()
}

func (s *CreateContractTextResponse) SetReqMsgId(v string) *CreateContractTextResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateContractTextResponse) SetResultCode(v string) *CreateContractTextResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateContractTextResponse) SetResultMsg(v string) *CreateContractTextResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateContractTextResponse) SetTxHash(v string) *CreateContractTextResponse {
	s.TxHash = &v
	return s
}

type ApplyContractReportRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署文件存档阶段存证核验信息
	DocumentInfo []*ContractNotaryDocumentInfo `json:"document_info,omitempty" xml:"document_info,omitempty" type:"Repeated"`
	// 签署结束阶段存证核验信息
	FinishInfo *ContractNotaryFinishInfo `json:"finish_info,omitempty" xml:"finish_info,omitempty" require:"true"`
	// 签署流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	// 签署发起阶段存证核验信息
	InitInfo *ContractNotaryInitInfo `json:"init_info,omitempty" xml:"init_info,omitempty" require:"true"`
	// 签署过程阶段存证核验信息
	SignInfo []*ContractNotarySignInfo `json:"sign_info,omitempty" xml:"sign_info,omitempty" require:"true" type:"Repeated"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty" require:"true"`
}

func (s ApplyContractReportRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyContractReportRequest) GoString() string {
	return s.String()
}

func (s *ApplyContractReportRequest) SetAuthToken(v string) *ApplyContractReportRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyContractReportRequest) SetProductInstanceId(v string) *ApplyContractReportRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyContractReportRequest) SetDocumentInfo(v []*ContractNotaryDocumentInfo) *ApplyContractReportRequest {
	s.DocumentInfo = v
	return s
}

func (s *ApplyContractReportRequest) SetFinishInfo(v *ContractNotaryFinishInfo) *ApplyContractReportRequest {
	s.FinishInfo = v
	return s
}

func (s *ApplyContractReportRequest) SetFlowId(v string) *ApplyContractReportRequest {
	s.FlowId = &v
	return s
}

func (s *ApplyContractReportRequest) SetInitInfo(v *ContractNotaryInitInfo) *ApplyContractReportRequest {
	s.InitInfo = v
	return s
}

func (s *ApplyContractReportRequest) SetSignInfo(v []*ContractNotarySignInfo) *ApplyContractReportRequest {
	s.SignInfo = v
	return s
}

func (s *ApplyContractReportRequest) SetTransactionId(v string) *ApplyContractReportRequest {
	s.TransactionId = &v
	return s
}

type ApplyContractReportResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 出证报告授权码，通过核验后获得
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty"`
}

func (s ApplyContractReportResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyContractReportResponse) GoString() string {
	return s.String()
}

func (s *ApplyContractReportResponse) SetReqMsgId(v string) *ApplyContractReportResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyContractReportResponse) SetResultCode(v string) *ApplyContractReportResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyContractReportResponse) SetResultMsg(v string) *ApplyContractReportResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyContractReportResponse) SetAuthCode(v string) *ApplyContractReportResponse {
	s.AuthCode = &v
	return s
}

type GetContractTextRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 存证凭据
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
}

func (s GetContractTextRequest) String() string {
	return tea.Prettify(s)
}

func (s GetContractTextRequest) GoString() string {
	return s.String()
}

func (s *GetContractTextRequest) SetAuthToken(v string) *GetContractTextRequest {
	s.AuthToken = &v
	return s
}

func (s *GetContractTextRequest) SetProductInstanceId(v string) *GetContractTextRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetContractTextRequest) SetTxHash(v string) *GetContractTextRequest {
	s.TxHash = &v
	return s
}

type GetContractTextResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证信息对象的JSON序列化形式
	NotaryData *string `json:"notary_data,omitempty" xml:"notary_data,omitempty"`
}

func (s GetContractTextResponse) String() string {
	return tea.Prettify(s)
}

func (s GetContractTextResponse) GoString() string {
	return s.String()
}

func (s *GetContractTextResponse) SetReqMsgId(v string) *GetContractTextResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetContractTextResponse) SetResultCode(v string) *GetContractTextResponse {
	s.ResultCode = &v
	return s
}

func (s *GetContractTextResponse) SetResultMsg(v string) *GetContractTextResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetContractTextResponse) SetNotaryData(v string) *GetContractTextResponse {
	s.NotaryData = &v
	return s
}

type CreateInternalTransRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 存证关联实体（个人/企业）的身份识别信息
	Customer *Identity `json:"customer,omitempty" xml:"customer,omitempty" require:"true"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 业务子类型标识
	SubBizId *string `json:"sub_biz_id,omitempty" xml:"sub_biz_id,omitempty"`
	// 是否使用可信时间戳，默认为false
	Tsr *bool `json:"tsr,omitempty" xml:"tsr,omitempty"`
}

func (s CreateInternalTransRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateInternalTransRequest) GoString() string {
	return s.String()
}

func (s *CreateInternalTransRequest) SetAuthToken(v string) *CreateInternalTransRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateInternalTransRequest) SetProductInstanceId(v string) *CreateInternalTransRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateInternalTransRequest) SetCustomer(v *Identity) *CreateInternalTransRequest {
	s.Customer = v
	return s
}

func (s *CreateInternalTransRequest) SetProperties(v string) *CreateInternalTransRequest {
	s.Properties = &v
	return s
}

func (s *CreateInternalTransRequest) SetSubBizId(v string) *CreateInternalTransRequest {
	s.SubBizId = &v
	return s
}

func (s *CreateInternalTransRequest) SetTsr(v bool) *CreateInternalTransRequest {
	s.Tsr = &v
	return s
}

type CreateInternalTransResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回事务ID，全局唯一
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 可信时间信息
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
}

func (s CreateInternalTransResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateInternalTransResponse) GoString() string {
	return s.String()
}

func (s *CreateInternalTransResponse) SetReqMsgId(v string) *CreateInternalTransResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateInternalTransResponse) SetResultCode(v string) *CreateInternalTransResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateInternalTransResponse) SetResultMsg(v string) *CreateInternalTransResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateInternalTransResponse) SetTransactionId(v string) *CreateInternalTransResponse {
	s.TransactionId = &v
	return s
}

func (s *CreateInternalTransResponse) SetTsr(v *TsrResponse) *CreateInternalTransResponse {
	s.Tsr = v
	return s
}

type CreateInternalTextRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 哈希算法，目前仅支持 SHA256
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty"`
	// 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 存证内容
	NotaryContent *string `json:"notary_content,omitempty" xml:"notary_content,omitempty" require:"true"`
	// 描述本条存证在存证事务中的阶段，用户可自行维护
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty" require:"true"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 文本存证类型，支持源文本/文本哈希
	TextNotaryType *string `json:"text_notary_type,omitempty" xml:"text_notary_type,omitempty"`
	// 存证事务id
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty" require:"true"`
	// 是否使用可信时间戳，默认为false
	Tsr *bool `json:"tsr,omitempty" xml:"tsr,omitempty"`
}

func (s CreateInternalTextRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateInternalTextRequest) GoString() string {
	return s.String()
}

func (s *CreateInternalTextRequest) SetAuthToken(v string) *CreateInternalTextRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateInternalTextRequest) SetProductInstanceId(v string) *CreateInternalTextRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateInternalTextRequest) SetHashAlgorithm(v string) *CreateInternalTextRequest {
	s.HashAlgorithm = &v
	return s
}

func (s *CreateInternalTextRequest) SetLocation(v *Location) *CreateInternalTextRequest {
	s.Location = v
	return s
}

func (s *CreateInternalTextRequest) SetNotaryContent(v string) *CreateInternalTextRequest {
	s.NotaryContent = &v
	return s
}

func (s *CreateInternalTextRequest) SetPhase(v string) *CreateInternalTextRequest {
	s.Phase = &v
	return s
}

func (s *CreateInternalTextRequest) SetProperties(v string) *CreateInternalTextRequest {
	s.Properties = &v
	return s
}

func (s *CreateInternalTextRequest) SetTextNotaryType(v string) *CreateInternalTextRequest {
	s.TextNotaryType = &v
	return s
}

func (s *CreateInternalTextRequest) SetTransactionId(v string) *CreateInternalTextRequest {
	s.TransactionId = &v
	return s
}

func (s *CreateInternalTextRequest) SetTsr(v bool) *CreateInternalTextRequest {
	s.Tsr = &v
	return s
}

type CreateInternalTextResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 可信时间信息
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 存证凭据
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateInternalTextResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateInternalTextResponse) GoString() string {
	return s.String()
}

func (s *CreateInternalTextResponse) SetReqMsgId(v string) *CreateInternalTextResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateInternalTextResponse) SetResultCode(v string) *CreateInternalTextResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateInternalTextResponse) SetResultMsg(v string) *CreateInternalTextResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateInternalTextResponse) SetTsr(v *TsrResponse) *CreateInternalTextResponse {
	s.Tsr = v
	return s
}

func (s *CreateInternalTextResponse) SetTxHash(v string) *CreateInternalTextResponse {
	s.TxHash = &v
	return s
}

type CreateLeaseTextRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 哈希算法，目前仅支持 SHA256
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty"`
	// 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 存证内容
	NotaryContent *string `json:"notary_content,omitempty" xml:"notary_content,omitempty" require:"true"`
	// 描述本条存证在存证事务中的阶段，用户可自行维护
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty" require:"true"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 文本存证类型，支持源文本/文本哈希
	TextNotaryType *string `json:"text_notary_type,omitempty" xml:"text_notary_type,omitempty"`
	// 存证事务id
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty" require:"true"`
}

func (s CreateLeaseTextRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseTextRequest) GoString() string {
	return s.String()
}

func (s *CreateLeaseTextRequest) SetAuthToken(v string) *CreateLeaseTextRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeaseTextRequest) SetProductInstanceId(v string) *CreateLeaseTextRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeaseTextRequest) SetHashAlgorithm(v string) *CreateLeaseTextRequest {
	s.HashAlgorithm = &v
	return s
}

func (s *CreateLeaseTextRequest) SetLocation(v *Location) *CreateLeaseTextRequest {
	s.Location = v
	return s
}

func (s *CreateLeaseTextRequest) SetNotaryContent(v string) *CreateLeaseTextRequest {
	s.NotaryContent = &v
	return s
}

func (s *CreateLeaseTextRequest) SetPhase(v string) *CreateLeaseTextRequest {
	s.Phase = &v
	return s
}

func (s *CreateLeaseTextRequest) SetProperties(v string) *CreateLeaseTextRequest {
	s.Properties = &v
	return s
}

func (s *CreateLeaseTextRequest) SetTextNotaryType(v string) *CreateLeaseTextRequest {
	s.TextNotaryType = &v
	return s
}

func (s *CreateLeaseTextRequest) SetTransactionId(v string) *CreateLeaseTextRequest {
	s.TransactionId = &v
	return s
}

type CreateLeaseTextResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 入参中传入的存证阶段，可同用于租赁存证列表(twc.notary.lease.notary.list)的记录对账
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
}

func (s CreateLeaseTextResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseTextResponse) GoString() string {
	return s.String()
}

func (s *CreateLeaseTextResponse) SetReqMsgId(v string) *CreateLeaseTextResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeaseTextResponse) SetResultCode(v string) *CreateLeaseTextResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeaseTextResponse) SetResultMsg(v string) *CreateLeaseTextResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeaseTextResponse) SetPhase(v string) *CreateLeaseTextResponse {
	s.Phase = &v
	return s
}

type CreateLeaseFileRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件存证模式，目前仅支持 FILE_RAW 和 FILE_HASH
	FileNotaryType *string `json:"file_notary_type,omitempty" xml:"file_notary_type,omitempty"`
	// 当文件存证模式为FILE_HASH时，用户可以指定该参数。当前服务仅支持 SHA256，若不填写，则默认值为 SHA256。
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty"`
	// 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 存证文件内容，对文件内容做base64编码后得到。例如FILE_RAW模式下，文件内容为“test”，那么base64编码后的结果则为“dGVzdA==”。如果是FILE_HASh模式，则该字段直接为文件hash。
	NotaryFile *string `json:"notary_file,omitempty" xml:"notary_file,omitempty" require:"true"`
	// 存证文件名称
	NotaryName *string `json:"notary_name,omitempty" xml:"notary_name,omitempty" require:"true"`
	// 描述本条存证在存证事务中的阶段，用户可自行维护
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty" require:"true"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty" require:"true"`
}

func (s CreateLeaseFileRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseFileRequest) GoString() string {
	return s.String()
}

func (s *CreateLeaseFileRequest) SetAuthToken(v string) *CreateLeaseFileRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeaseFileRequest) SetProductInstanceId(v string) *CreateLeaseFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeaseFileRequest) SetFileNotaryType(v string) *CreateLeaseFileRequest {
	s.FileNotaryType = &v
	return s
}

func (s *CreateLeaseFileRequest) SetHashAlgorithm(v string) *CreateLeaseFileRequest {
	s.HashAlgorithm = &v
	return s
}

func (s *CreateLeaseFileRequest) SetLocation(v *Location) *CreateLeaseFileRequest {
	s.Location = v
	return s
}

func (s *CreateLeaseFileRequest) SetNotaryFile(v string) *CreateLeaseFileRequest {
	s.NotaryFile = &v
	return s
}

func (s *CreateLeaseFileRequest) SetNotaryName(v string) *CreateLeaseFileRequest {
	s.NotaryName = &v
	return s
}

func (s *CreateLeaseFileRequest) SetPhase(v string) *CreateLeaseFileRequest {
	s.Phase = &v
	return s
}

func (s *CreateLeaseFileRequest) SetProperties(v string) *CreateLeaseFileRequest {
	s.Properties = &v
	return s
}

func (s *CreateLeaseFileRequest) SetTransactionId(v string) *CreateLeaseFileRequest {
	s.TransactionId = &v
	return s
}

type CreateLeaseFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 入参中的存证阶段信息，可同用于租赁存证列表(twc.notary.lease.notary.list)的记录对账
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
}

func (s CreateLeaseFileResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseFileResponse) GoString() string {
	return s.String()
}

func (s *CreateLeaseFileResponse) SetReqMsgId(v string) *CreateLeaseFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeaseFileResponse) SetResultCode(v string) *CreateLeaseFileResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeaseFileResponse) SetResultMsg(v string) *CreateLeaseFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeaseFileResponse) SetPhase(v string) *CreateLeaseFileResponse {
	s.Phase = &v
	return s
}

type ListLeaseNotaryRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户订单号，需要同twc.notary.lease.order.create接口的传参一致
	MerchantOrderNo *string `json:"merchant_order_no,omitempty" xml:"merchant_order_no,omitempty"`
	// 接口订单号，需要同twc.notary.lease.order.create接口的传参一致
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 支付渠道，默认支持Alipay|ThirdParty|CreditCard|BankTransfer|WeChatPay|Other，需要同twc.notary.lease.order.create接口的传参一致
	PaymentChannel *string `json:"payment_channel,omitempty" xml:"payment_channel,omitempty"`
}

func (s ListLeaseNotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s ListLeaseNotaryRequest) GoString() string {
	return s.String()
}

func (s *ListLeaseNotaryRequest) SetAuthToken(v string) *ListLeaseNotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *ListLeaseNotaryRequest) SetProductInstanceId(v string) *ListLeaseNotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListLeaseNotaryRequest) SetMerchantOrderNo(v string) *ListLeaseNotaryRequest {
	s.MerchantOrderNo = &v
	return s
}

func (s *ListLeaseNotaryRequest) SetOrderNo(v string) *ListLeaseNotaryRequest {
	s.OrderNo = &v
	return s
}

func (s *ListLeaseNotaryRequest) SetPaymentChannel(v string) *ListLeaseNotaryRequest {
	s.PaymentChannel = &v
	return s
}

type ListLeaseNotaryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证记录列表
	Records []*LeaseNotaryRecord `json:"records,omitempty" xml:"records,omitempty" type:"Repeated"`
}

func (s ListLeaseNotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s ListLeaseNotaryResponse) GoString() string {
	return s.String()
}

func (s *ListLeaseNotaryResponse) SetReqMsgId(v string) *ListLeaseNotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListLeaseNotaryResponse) SetResultCode(v string) *ListLeaseNotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *ListLeaseNotaryResponse) SetResultMsg(v string) *ListLeaseNotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListLeaseNotaryResponse) SetRecords(v []*LeaseNotaryRecord) *ListLeaseNotaryResponse {
	s.Records = v
	return s
}

type QueryLeaseApplicationRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 每页的大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 起始id
	StartId *int64 `json:"start_id,omitempty" xml:"start_id,omitempty" require:"true"`
}

func (s QueryLeaseApplicationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryLeaseApplicationRequest) GoString() string {
	return s.String()
}

func (s *QueryLeaseApplicationRequest) SetAuthToken(v string) *QueryLeaseApplicationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryLeaseApplicationRequest) SetProductInstanceId(v string) *QueryLeaseApplicationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryLeaseApplicationRequest) SetPageSize(v int64) *QueryLeaseApplicationRequest {
	s.PageSize = &v
	return s
}

func (s *QueryLeaseApplicationRequest) SetStartId(v int64) *QueryLeaseApplicationRequest {
	s.StartId = &v
	return s
}

type QueryLeaseApplicationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 返回值
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s QueryLeaseApplicationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryLeaseApplicationResponse) GoString() string {
	return s.String()
}

func (s *QueryLeaseApplicationResponse) SetReqMsgId(v string) *QueryLeaseApplicationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryLeaseApplicationResponse) SetResultCode(v string) *QueryLeaseApplicationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryLeaseApplicationResponse) SetResultMsg(v string) *QueryLeaseApplicationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryLeaseApplicationResponse) SetCode(v int64) *QueryLeaseApplicationResponse {
	s.Code = &v
	return s
}

func (s *QueryLeaseApplicationResponse) SetErrMessage(v string) *QueryLeaseApplicationResponse {
	s.ErrMessage = &v
	return s
}

func (s *QueryLeaseApplicationResponse) SetResponseData(v string) *QueryLeaseApplicationResponse {
	s.ResponseData = &v
	return s
}

type QueryLeaseApplicationdetailinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合约id
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty" require:"true"`
}

func (s QueryLeaseApplicationdetailinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryLeaseApplicationdetailinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryLeaseApplicationdetailinfoRequest) SetAuthToken(v string) *QueryLeaseApplicationdetailinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryLeaseApplicationdetailinfoRequest) SetProductInstanceId(v string) *QueryLeaseApplicationdetailinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryLeaseApplicationdetailinfoRequest) SetApplicationId(v string) *QueryLeaseApplicationdetailinfoRequest {
	s.ApplicationId = &v
	return s
}

type QueryLeaseApplicationdetailinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 合约定义详情
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s QueryLeaseApplicationdetailinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryLeaseApplicationdetailinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryLeaseApplicationdetailinfoResponse) SetReqMsgId(v string) *QueryLeaseApplicationdetailinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryLeaseApplicationdetailinfoResponse) SetResultCode(v string) *QueryLeaseApplicationdetailinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryLeaseApplicationdetailinfoResponse) SetResultMsg(v string) *QueryLeaseApplicationdetailinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryLeaseApplicationdetailinfoResponse) SetCode(v int64) *QueryLeaseApplicationdetailinfoResponse {
	s.Code = &v
	return s
}

func (s *QueryLeaseApplicationdetailinfoResponse) SetErrMessage(v string) *QueryLeaseApplicationdetailinfoResponse {
	s.ErrMessage = &v
	return s
}

func (s *QueryLeaseApplicationdetailinfoResponse) SetResponseData(v string) *QueryLeaseApplicationdetailinfoResponse {
	s.ResponseData = &v
	return s
}

type SetLeaseRepaymentstatusRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租赁机构金融科技租户Id
	LeaseId *string `json:"lease_id,omitempty" xml:"lease_id,omitempty" require:"true"`
	// 融资租赁对应的合约id
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 融资租赁对应的订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// finish只能为0或1，0表示订单重置此状态下订单可以被再次操作【如清分记录上传、还款记录上传等】，1表示订单结束，在1的状态下不会再进行清分、还款记录上传等操作
	Finish *int64 `json:"finish,omitempty" xml:"finish,omitempty" require:"true"`
}

func (s SetLeaseRepaymentstatusRequest) String() string {
	return tea.Prettify(s)
}

func (s SetLeaseRepaymentstatusRequest) GoString() string {
	return s.String()
}

func (s *SetLeaseRepaymentstatusRequest) SetAuthToken(v string) *SetLeaseRepaymentstatusRequest {
	s.AuthToken = &v
	return s
}

func (s *SetLeaseRepaymentstatusRequest) SetProductInstanceId(v string) *SetLeaseRepaymentstatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SetLeaseRepaymentstatusRequest) SetLeaseId(v string) *SetLeaseRepaymentstatusRequest {
	s.LeaseId = &v
	return s
}

func (s *SetLeaseRepaymentstatusRequest) SetApplicationId(v string) *SetLeaseRepaymentstatusRequest {
	s.ApplicationId = &v
	return s
}

func (s *SetLeaseRepaymentstatusRequest) SetOrderId(v string) *SetLeaseRepaymentstatusRequest {
	s.OrderId = &v
	return s
}

func (s *SetLeaseRepaymentstatusRequest) SetFinish(v int64) *SetLeaseRepaymentstatusRequest {
	s.Finish = &v
	return s
}

type SetLeaseRepaymentstatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态重置对应的链上交易哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
	// 状态码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
}

func (s SetLeaseRepaymentstatusResponse) String() string {
	return tea.Prettify(s)
}

func (s SetLeaseRepaymentstatusResponse) GoString() string {
	return s.String()
}

func (s *SetLeaseRepaymentstatusResponse) SetReqMsgId(v string) *SetLeaseRepaymentstatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SetLeaseRepaymentstatusResponse) SetResultCode(v string) *SetLeaseRepaymentstatusResponse {
	s.ResultCode = &v
	return s
}

func (s *SetLeaseRepaymentstatusResponse) SetResultMsg(v string) *SetLeaseRepaymentstatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *SetLeaseRepaymentstatusResponse) SetResponseData(v string) *SetLeaseRepaymentstatusResponse {
	s.ResponseData = &v
	return s
}

func (s *SetLeaseRepaymentstatusResponse) SetCode(v int64) *SetLeaseRepaymentstatusResponse {
	s.Code = &v
	return s
}

func (s *SetLeaseRepaymentstatusResponse) SetErrMessage(v string) *SetLeaseRepaymentstatusResponse {
	s.ErrMessage = &v
	return s
}

type CreateLeaseSupplierinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租赁方及资方定义的合约id
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty" require:"true"`
	// 额外字段定义
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 供应商发货的物流单号
	LogisticsOrderId *string `json:"logistics_order_id,omitempty" xml:"logistics_order_id,omitempty" require:"true"`
	// 用户的租赁订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 额外字段定义对应的阶段，请咨询对应的资方
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty" require:"true"`
	// 采购订单id
	PurchaseOrderId *string `json:"purchase_order_id,omitempty" xml:"purchase_order_id,omitempty" require:"true"`
	// 产品详细信息
	SupplierProductList []*SupplierProductInfo `json:"supplier_product_list,omitempty" xml:"supplier_product_list,omitempty" require:"true" type:"Repeated"`
	// 1自有物流 2顺丰
	MaintainedBySupplier *int64 `json:"maintained_by_supplier,omitempty" xml:"maintained_by_supplier,omitempty" require:"true"`
	// 发货时间
	DeliverTime *string `json:"deliver_time,omitempty" xml:"deliver_time,omitempty" require:"true"`
}

func (s CreateLeaseSupplierinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseSupplierinfoRequest) GoString() string {
	return s.String()
}

func (s *CreateLeaseSupplierinfoRequest) SetAuthToken(v string) *CreateLeaseSupplierinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeaseSupplierinfoRequest) SetProductInstanceId(v string) *CreateLeaseSupplierinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeaseSupplierinfoRequest) SetApplicationId(v string) *CreateLeaseSupplierinfoRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateLeaseSupplierinfoRequest) SetExtraInfo(v string) *CreateLeaseSupplierinfoRequest {
	s.ExtraInfo = &v
	return s
}

func (s *CreateLeaseSupplierinfoRequest) SetLogisticsOrderId(v string) *CreateLeaseSupplierinfoRequest {
	s.LogisticsOrderId = &v
	return s
}

func (s *CreateLeaseSupplierinfoRequest) SetOrderId(v string) *CreateLeaseSupplierinfoRequest {
	s.OrderId = &v
	return s
}

func (s *CreateLeaseSupplierinfoRequest) SetPhase(v string) *CreateLeaseSupplierinfoRequest {
	s.Phase = &v
	return s
}

func (s *CreateLeaseSupplierinfoRequest) SetPurchaseOrderId(v string) *CreateLeaseSupplierinfoRequest {
	s.PurchaseOrderId = &v
	return s
}

func (s *CreateLeaseSupplierinfoRequest) SetSupplierProductList(v []*SupplierProductInfo) *CreateLeaseSupplierinfoRequest {
	s.SupplierProductList = v
	return s
}

func (s *CreateLeaseSupplierinfoRequest) SetMaintainedBySupplier(v int64) *CreateLeaseSupplierinfoRequest {
	s.MaintainedBySupplier = &v
	return s
}

func (s *CreateLeaseSupplierinfoRequest) SetDeliverTime(v string) *CreateLeaseSupplierinfoRequest {
	s.DeliverTime = &v
	return s
}

type CreateLeaseSupplierinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 供应商上传采购等相关信息对应的链上哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s CreateLeaseSupplierinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseSupplierinfoResponse) GoString() string {
	return s.String()
}

func (s *CreateLeaseSupplierinfoResponse) SetReqMsgId(v string) *CreateLeaseSupplierinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeaseSupplierinfoResponse) SetResultCode(v string) *CreateLeaseSupplierinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeaseSupplierinfoResponse) SetResultMsg(v string) *CreateLeaseSupplierinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeaseSupplierinfoResponse) SetCode(v int64) *CreateLeaseSupplierinfoResponse {
	s.Code = &v
	return s
}

func (s *CreateLeaseSupplierinfoResponse) SetErrMessage(v string) *CreateLeaseSupplierinfoResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateLeaseSupplierinfoResponse) SetResponseData(v string) *CreateLeaseSupplierinfoResponse {
	s.ResponseData = &v
	return s
}

type DeployMytfTappRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// tappId
	TappId *string `json:"tapp_id,omitempty" xml:"tapp_id,omitempty" require:"true"`
}

func (s DeployMytfTappRequest) String() string {
	return tea.Prettify(s)
}

func (s DeployMytfTappRequest) GoString() string {
	return s.String()
}

func (s *DeployMytfTappRequest) SetAuthToken(v string) *DeployMytfTappRequest {
	s.AuthToken = &v
	return s
}

func (s *DeployMytfTappRequest) SetProductInstanceId(v string) *DeployMytfTappRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeployMytfTappRequest) SetTappId(v string) *DeployMytfTappRequest {
	s.TappId = &v
	return s
}

type DeployMytfTappResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeployMytfTappResponse) String() string {
	return tea.Prettify(s)
}

func (s DeployMytfTappResponse) GoString() string {
	return s.String()
}

func (s *DeployMytfTappResponse) SetReqMsgId(v string) *DeployMytfTappResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeployMytfTappResponse) SetResultCode(v string) *DeployMytfTappResponse {
	s.ResultCode = &v
	return s
}

func (s *DeployMytfTappResponse) SetResultMsg(v string) *DeployMytfTappResponse {
	s.ResultMsg = &v
	return s
}

type CreateLeaseSupplierdynamicinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合约id
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty" require:"true"`
	// 签收记录哈希，已签收需要必填
	ArriveConfirmHash *string `json:"arrive_confirm_hash,omitempty" xml:"arrive_confirm_hash,omitempty"`
	// 用户签收时间，格式为2019-8-31 12:00:00，已签收需要必填
	ArriveConfirmTime *string `json:"arrive_confirm_time,omitempty" xml:"arrive_confirm_time,omitempty"`
	// 签收记录存证哈希，已签收需要必填
	ArriveConfirmTxHash *string `json:"arrive_confirm_tx_hash,omitempty" xml:"arrive_confirm_tx_hash,omitempty"`
	// 签收记录对应的url，已签收需要必填
	ArriveConfirmUrl *string `json:"arrive_confirm_url,omitempty" xml:"arrive_confirm_url,omitempty"`
	// 物流状态额外信息
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 物流状态，1.已发货 2运输中 3已签收 0其他
	LogisticStatus *string `json:"logistic_status,omitempty" xml:"logistic_status,omitempty" require:"true"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 阶段名称
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty" require:"true"`
}

func (s CreateLeaseSupplierdynamicinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseSupplierdynamicinfoRequest) GoString() string {
	return s.String()
}

func (s *CreateLeaseSupplierdynamicinfoRequest) SetAuthToken(v string) *CreateLeaseSupplierdynamicinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeaseSupplierdynamicinfoRequest) SetProductInstanceId(v string) *CreateLeaseSupplierdynamicinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeaseSupplierdynamicinfoRequest) SetApplicationId(v string) *CreateLeaseSupplierdynamicinfoRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateLeaseSupplierdynamicinfoRequest) SetArriveConfirmHash(v string) *CreateLeaseSupplierdynamicinfoRequest {
	s.ArriveConfirmHash = &v
	return s
}

func (s *CreateLeaseSupplierdynamicinfoRequest) SetArriveConfirmTime(v string) *CreateLeaseSupplierdynamicinfoRequest {
	s.ArriveConfirmTime = &v
	return s
}

func (s *CreateLeaseSupplierdynamicinfoRequest) SetArriveConfirmTxHash(v string) *CreateLeaseSupplierdynamicinfoRequest {
	s.ArriveConfirmTxHash = &v
	return s
}

func (s *CreateLeaseSupplierdynamicinfoRequest) SetArriveConfirmUrl(v string) *CreateLeaseSupplierdynamicinfoRequest {
	s.ArriveConfirmUrl = &v
	return s
}

func (s *CreateLeaseSupplierdynamicinfoRequest) SetExtraInfo(v string) *CreateLeaseSupplierdynamicinfoRequest {
	s.ExtraInfo = &v
	return s
}

func (s *CreateLeaseSupplierdynamicinfoRequest) SetLogisticStatus(v string) *CreateLeaseSupplierdynamicinfoRequest {
	s.LogisticStatus = &v
	return s
}

func (s *CreateLeaseSupplierdynamicinfoRequest) SetOrderId(v string) *CreateLeaseSupplierdynamicinfoRequest {
	s.OrderId = &v
	return s
}

func (s *CreateLeaseSupplierdynamicinfoRequest) SetPhase(v string) *CreateLeaseSupplierdynamicinfoRequest {
	s.Phase = &v
	return s
}

type CreateLeaseSupplierdynamicinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 链上哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s CreateLeaseSupplierdynamicinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseSupplierdynamicinfoResponse) GoString() string {
	return s.String()
}

func (s *CreateLeaseSupplierdynamicinfoResponse) SetReqMsgId(v string) *CreateLeaseSupplierdynamicinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeaseSupplierdynamicinfoResponse) SetResultCode(v string) *CreateLeaseSupplierdynamicinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeaseSupplierdynamicinfoResponse) SetResultMsg(v string) *CreateLeaseSupplierdynamicinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeaseSupplierdynamicinfoResponse) SetCode(v int64) *CreateLeaseSupplierdynamicinfoResponse {
	s.Code = &v
	return s
}

func (s *CreateLeaseSupplierdynamicinfoResponse) SetErrMessage(v string) *CreateLeaseSupplierdynamicinfoResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateLeaseSupplierdynamicinfoResponse) SetResponseData(v string) *CreateLeaseSupplierdynamicinfoResponse {
	s.ResponseData = &v
	return s
}

type CreateLeaseBizRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租赁订单相关内容，以json形式发送
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 租赁订单所属阶段
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s CreateLeaseBizRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseBizRequest) GoString() string {
	return s.String()
}

func (s *CreateLeaseBizRequest) SetAuthToken(v string) *CreateLeaseBizRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeaseBizRequest) SetProductInstanceId(v string) *CreateLeaseBizRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeaseBizRequest) SetBizContent(v string) *CreateLeaseBizRequest {
	s.BizContent = &v
	return s
}

func (s *CreateLeaseBizRequest) SetType(v string) *CreateLeaseBizRequest {
	s.Type = &v
	return s
}

type CreateLeaseBizResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 租赁信息上链后，链上对应的txHash
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
	// 错误码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
}

func (s CreateLeaseBizResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseBizResponse) GoString() string {
	return s.String()
}

func (s *CreateLeaseBizResponse) SetReqMsgId(v string) *CreateLeaseBizResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeaseBizResponse) SetResultCode(v string) *CreateLeaseBizResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeaseBizResponse) SetResultMsg(v string) *CreateLeaseBizResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeaseBizResponse) SetResponseData(v string) *CreateLeaseBizResponse {
	s.ResponseData = &v
	return s
}

func (s *CreateLeaseBizResponse) SetCode(v string) *CreateLeaseBizResponse {
	s.Code = &v
	return s
}

func (s *CreateLeaseBizResponse) SetErrMessage(v string) *CreateLeaseBizResponse {
	s.ErrMessage = &v
	return s
}

type QueryLeaseProofRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务逻辑的订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 2020
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty" require:"true"`
}

func (s QueryLeaseProofRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryLeaseProofRequest) GoString() string {
	return s.String()
}

func (s *QueryLeaseProofRequest) SetAuthToken(v string) *QueryLeaseProofRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryLeaseProofRequest) SetProductInstanceId(v string) *QueryLeaseProofRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryLeaseProofRequest) SetOrderId(v string) *QueryLeaseProofRequest {
	s.OrderId = &v
	return s
}

func (s *QueryLeaseProofRequest) SetApplicationId(v string) *QueryLeaseProofRequest {
	s.ApplicationId = &v
	return s
}

type QueryLeaseProofResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 核验结果数据
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s QueryLeaseProofResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryLeaseProofResponse) GoString() string {
	return s.String()
}

func (s *QueryLeaseProofResponse) SetReqMsgId(v string) *QueryLeaseProofResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryLeaseProofResponse) SetResultCode(v string) *QueryLeaseProofResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryLeaseProofResponse) SetResultMsg(v string) *QueryLeaseProofResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryLeaseProofResponse) SetResponseData(v string) *QueryLeaseProofResponse {
	s.ResponseData = &v
	return s
}

type CreateLargefileRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 上传至中枢文件扩展服务后得到的文件ID
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty" require:"true"`
	// 是否使用可信时间戳，默认为false
	Tsr *bool `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 存证文件名称
	NotaryName *string `json:"notary_name,omitempty" xml:"notary_name,omitempty" require:"true"`
	// 描述本条存证在存证事务中的阶段，用户可自行维护
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty" require:"true"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
}

func (s CreateLargefileRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLargefileRequest) GoString() string {
	return s.String()
}

func (s *CreateLargefileRequest) SetAuthToken(v string) *CreateLargefileRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLargefileRequest) SetProductInstanceId(v string) *CreateLargefileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLargefileRequest) SetFileId(v string) *CreateLargefileRequest {
	s.FileId = &v
	return s
}

func (s *CreateLargefileRequest) SetLocation(v *Location) *CreateLargefileRequest {
	s.Location = v
	return s
}

func (s *CreateLargefileRequest) SetTransactionId(v string) *CreateLargefileRequest {
	s.TransactionId = &v
	return s
}

func (s *CreateLargefileRequest) SetTsr(v bool) *CreateLargefileRequest {
	s.Tsr = &v
	return s
}

func (s *CreateLargefileRequest) SetNotaryName(v string) *CreateLargefileRequest {
	s.NotaryName = &v
	return s
}

func (s *CreateLargefileRequest) SetPhase(v string) *CreateLargefileRequest {
	s.Phase = &v
	return s
}

func (s *CreateLargefileRequest) SetProperties(v string) *CreateLargefileRequest {
	s.Properties = &v
	return s
}

type CreateLargefileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 可信时间信息
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 存证凭证
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateLargefileResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLargefileResponse) GoString() string {
	return s.String()
}

func (s *CreateLargefileResponse) SetReqMsgId(v string) *CreateLargefileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLargefileResponse) SetResultCode(v string) *CreateLargefileResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLargefileResponse) SetResultMsg(v string) *CreateLargefileResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLargefileResponse) SetTsr(v *TsrResponse) *CreateLargefileResponse {
	s.Tsr = v
	return s
}

func (s *CreateLargefileResponse) SetTxHash(v string) *CreateLargefileResponse {
	s.TxHash = &v
	return s
}

type QueryLeaseBizRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租赁订单相关内容，以json形式发送
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 租赁订单所属阶段
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s QueryLeaseBizRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryLeaseBizRequest) GoString() string {
	return s.String()
}

func (s *QueryLeaseBizRequest) SetAuthToken(v string) *QueryLeaseBizRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryLeaseBizRequest) SetProductInstanceId(v string) *QueryLeaseBizRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryLeaseBizRequest) SetBizContent(v string) *QueryLeaseBizRequest {
	s.BizContent = &v
	return s
}

func (s *QueryLeaseBizRequest) SetType(v string) *QueryLeaseBizRequest {
	s.Type = &v
	return s
}

type QueryLeaseBizResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回的查询值
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s QueryLeaseBizResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryLeaseBizResponse) GoString() string {
	return s.String()
}

func (s *QueryLeaseBizResponse) SetReqMsgId(v string) *QueryLeaseBizResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryLeaseBizResponse) SetResultCode(v string) *QueryLeaseBizResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryLeaseBizResponse) SetResultMsg(v string) *QueryLeaseBizResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryLeaseBizResponse) SetResponseData(v string) *QueryLeaseBizResponse {
	s.ResponseData = &v
	return s
}

type CreateLeaseBiznotaryRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 要存证的文件哈希
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty" require:"true"`
	// 租赁机构社会统一信用码
	LeaseCorpId *string `json:"lease_corp_id,omitempty" xml:"lease_corp_id,omitempty" require:"true"`
	// 租赁机构公司名称
	LeaseCorpName *string `json:"lease_corp_name,omitempty" xml:"lease_corp_name,omitempty" require:"true"`
	// 租赁机构法人姓名
	LeaseCorpOwnerName *string `json:"lease_corp_owner_name,omitempty" xml:"lease_corp_owner_name,omitempty" require:"true"`
}

func (s CreateLeaseBiznotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseBiznotaryRequest) GoString() string {
	return s.String()
}

func (s *CreateLeaseBiznotaryRequest) SetAuthToken(v string) *CreateLeaseBiznotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeaseBiznotaryRequest) SetProductInstanceId(v string) *CreateLeaseBiznotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeaseBiznotaryRequest) SetHash(v string) *CreateLeaseBiznotaryRequest {
	s.Hash = &v
	return s
}

func (s *CreateLeaseBiznotaryRequest) SetLeaseCorpId(v string) *CreateLeaseBiznotaryRequest {
	s.LeaseCorpId = &v
	return s
}

func (s *CreateLeaseBiznotaryRequest) SetLeaseCorpName(v string) *CreateLeaseBiznotaryRequest {
	s.LeaseCorpName = &v
	return s
}

func (s *CreateLeaseBiznotaryRequest) SetLeaseCorpOwnerName(v string) *CreateLeaseBiznotaryRequest {
	s.LeaseCorpOwnerName = &v
	return s
}

type CreateLeaseBiznotaryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否租赁宝存证哈希成功，成功则为0，否则不为0
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误码具体详情
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
}

func (s CreateLeaseBiznotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseBiznotaryResponse) GoString() string {
	return s.String()
}

func (s *CreateLeaseBiznotaryResponse) SetReqMsgId(v string) *CreateLeaseBiznotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeaseBiznotaryResponse) SetResultCode(v string) *CreateLeaseBiznotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeaseBiznotaryResponse) SetResultMsg(v string) *CreateLeaseBiznotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeaseBiznotaryResponse) SetCode(v int64) *CreateLeaseBiznotaryResponse {
	s.Code = &v
	return s
}

func (s *CreateLeaseBiznotaryResponse) SetErrMessage(v string) *CreateLeaseBiznotaryResponse {
	s.ErrMessage = &v
	return s
}

type CreateInternalContractRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署结束信息，phase为FINISH时必选
	FinishInfo *ContractNotaryFinishInfo `json:"finish_info,omitempty" xml:"finish_info,omitempty"`
	// 签署流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	// 签署发起信息，phase为INIT时必选
	InitInfo *ContractNotaryInitInfo `json:"init_info,omitempty" xml:"init_info,omitempty"`
	// 存证阶段，分为INIT(发起)，SIGN(签署)，FINISH(结束)
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty" require:"true"`
	// 签署过程信息，phase为SIGN时必选
	SignInfo *ContractNotarySignInfo `json:"sign_info,omitempty" xml:"sign_info,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty" require:"true"`
	// 签署文件存档阶段存证核验信息
	DocumentInfo *ContractNotaryDocumentInfo `json:"document_info,omitempty" xml:"document_info,omitempty"`
}

func (s CreateInternalContractRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateInternalContractRequest) GoString() string {
	return s.String()
}

func (s *CreateInternalContractRequest) SetAuthToken(v string) *CreateInternalContractRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateInternalContractRequest) SetProductInstanceId(v string) *CreateInternalContractRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateInternalContractRequest) SetFinishInfo(v *ContractNotaryFinishInfo) *CreateInternalContractRequest {
	s.FinishInfo = v
	return s
}

func (s *CreateInternalContractRequest) SetFlowId(v string) *CreateInternalContractRequest {
	s.FlowId = &v
	return s
}

func (s *CreateInternalContractRequest) SetInitInfo(v *ContractNotaryInitInfo) *CreateInternalContractRequest {
	s.InitInfo = v
	return s
}

func (s *CreateInternalContractRequest) SetPhase(v string) *CreateInternalContractRequest {
	s.Phase = &v
	return s
}

func (s *CreateInternalContractRequest) SetSignInfo(v *ContractNotarySignInfo) *CreateInternalContractRequest {
	s.SignInfo = v
	return s
}

func (s *CreateInternalContractRequest) SetTransactionId(v string) *CreateInternalContractRequest {
	s.TransactionId = &v
	return s
}

func (s *CreateInternalContractRequest) SetDocumentInfo(v *ContractNotaryDocumentInfo) *CreateInternalContractRequest {
	s.DocumentInfo = v
	return s
}

type CreateInternalContractResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证凭据
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateInternalContractResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateInternalContractResponse) GoString() string {
	return s.String()
}

func (s *CreateInternalContractResponse) SetReqMsgId(v string) *CreateInternalContractResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateInternalContractResponse) SetResultCode(v string) *CreateInternalContractResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateInternalContractResponse) SetResultMsg(v string) *CreateInternalContractResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateInternalContractResponse) SetTxHash(v string) *CreateInternalContractResponse {
	s.TxHash = &v
	return s
}

type CreateLeaseZftagreementsignRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 合约id
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty" require:"true"`
	// 网商直付通代扣协议号
	AgreementNo *string `json:"agreement_no,omitempty" xml:"agreement_no,omitempty" require:"true"`
	// 实际签署协议的用户支付宝uid
	AlipayUserId *string `json:"alipay_user_id,omitempty" xml:"alipay_user_id,omitempty"`
	// 签署时间
	SignTime *string `json:"sign_time,omitempty" xml:"sign_time,omitempty"`
	// 协议生效时间
	ValidTime *string `json:"valid_time,omitempty" xml:"valid_time,omitempty"`
	// 协议失效时间
	InvalidTime *string `json:"invalid_time,omitempty" xml:"invalid_time,omitempty"`
	// 租赁方金融科技租户id
	LeaseId *string `json:"lease_id,omitempty" xml:"lease_id,omitempty" require:"true"`
	// 核验结果，1表示通过，-1表示不通过
	AgreementStatus *int64 `json:"agreement_status,omitempty" xml:"agreement_status,omitempty" require:"true"`
}

func (s CreateLeaseZftagreementsignRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseZftagreementsignRequest) GoString() string {
	return s.String()
}

func (s *CreateLeaseZftagreementsignRequest) SetAuthToken(v string) *CreateLeaseZftagreementsignRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeaseZftagreementsignRequest) SetProductInstanceId(v string) *CreateLeaseZftagreementsignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeaseZftagreementsignRequest) SetOrderId(v string) *CreateLeaseZftagreementsignRequest {
	s.OrderId = &v
	return s
}

func (s *CreateLeaseZftagreementsignRequest) SetApplicationId(v string) *CreateLeaseZftagreementsignRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateLeaseZftagreementsignRequest) SetAgreementNo(v string) *CreateLeaseZftagreementsignRequest {
	s.AgreementNo = &v
	return s
}

func (s *CreateLeaseZftagreementsignRequest) SetAlipayUserId(v string) *CreateLeaseZftagreementsignRequest {
	s.AlipayUserId = &v
	return s
}

func (s *CreateLeaseZftagreementsignRequest) SetSignTime(v string) *CreateLeaseZftagreementsignRequest {
	s.SignTime = &v
	return s
}

func (s *CreateLeaseZftagreementsignRequest) SetValidTime(v string) *CreateLeaseZftagreementsignRequest {
	s.ValidTime = &v
	return s
}

func (s *CreateLeaseZftagreementsignRequest) SetInvalidTime(v string) *CreateLeaseZftagreementsignRequest {
	s.InvalidTime = &v
	return s
}

func (s *CreateLeaseZftagreementsignRequest) SetLeaseId(v string) *CreateLeaseZftagreementsignRequest {
	s.LeaseId = &v
	return s
}

func (s *CreateLeaseZftagreementsignRequest) SetAgreementStatus(v int64) *CreateLeaseZftagreementsignRequest {
	s.AgreementStatus = &v
	return s
}

type CreateLeaseZftagreementsignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 协议上链哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s CreateLeaseZftagreementsignResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseZftagreementsignResponse) GoString() string {
	return s.String()
}

func (s *CreateLeaseZftagreementsignResponse) SetReqMsgId(v string) *CreateLeaseZftagreementsignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeaseZftagreementsignResponse) SetResultCode(v string) *CreateLeaseZftagreementsignResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeaseZftagreementsignResponse) SetResultMsg(v string) *CreateLeaseZftagreementsignResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeaseZftagreementsignResponse) SetErrMessage(v string) *CreateLeaseZftagreementsignResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateLeaseZftagreementsignResponse) SetCode(v int64) *CreateLeaseZftagreementsignResponse {
	s.Code = &v
	return s
}

func (s *CreateLeaseZftagreementsignResponse) SetResponseData(v string) *CreateLeaseZftagreementsignResponse {
	s.ResponseData = &v
	return s
}

type CreateLeaseZftagreementunsignRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 合约id
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty" require:"true"`
	// 租赁方金融科技租户id
	LeaseId *string `json:"lease_id,omitempty" xml:"lease_id,omitempty" require:"true"`
	// 直付通网商模式代扣协议号
	AgreementNo *string `json:"agreement_no,omitempty" xml:"agreement_no,omitempty" require:"true"`
	// 直付通代扣协议解约时间
	UnsignTime *string `json:"unsign_time,omitempty" xml:"unsign_time,omitempty" require:"true"`
}

func (s CreateLeaseZftagreementunsignRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseZftagreementunsignRequest) GoString() string {
	return s.String()
}

func (s *CreateLeaseZftagreementunsignRequest) SetAuthToken(v string) *CreateLeaseZftagreementunsignRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeaseZftagreementunsignRequest) SetProductInstanceId(v string) *CreateLeaseZftagreementunsignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeaseZftagreementunsignRequest) SetOrderId(v string) *CreateLeaseZftagreementunsignRequest {
	s.OrderId = &v
	return s
}

func (s *CreateLeaseZftagreementunsignRequest) SetApplicationId(v string) *CreateLeaseZftagreementunsignRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateLeaseZftagreementunsignRequest) SetLeaseId(v string) *CreateLeaseZftagreementunsignRequest {
	s.LeaseId = &v
	return s
}

func (s *CreateLeaseZftagreementunsignRequest) SetAgreementNo(v string) *CreateLeaseZftagreementunsignRequest {
	s.AgreementNo = &v
	return s
}

func (s *CreateLeaseZftagreementunsignRequest) SetUnsignTime(v string) *CreateLeaseZftagreementunsignRequest {
	s.UnsignTime = &v
	return s
}

type CreateLeaseZftagreementunsignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码描述信息
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 网商直付通解约链上哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s CreateLeaseZftagreementunsignResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseZftagreementunsignResponse) GoString() string {
	return s.String()
}

func (s *CreateLeaseZftagreementunsignResponse) SetReqMsgId(v string) *CreateLeaseZftagreementunsignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeaseZftagreementunsignResponse) SetResultCode(v string) *CreateLeaseZftagreementunsignResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeaseZftagreementunsignResponse) SetResultMsg(v string) *CreateLeaseZftagreementunsignResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeaseZftagreementunsignResponse) SetErrMessage(v string) *CreateLeaseZftagreementunsignResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateLeaseZftagreementunsignResponse) SetCode(v int64) *CreateLeaseZftagreementunsignResponse {
	s.Code = &v
	return s
}

func (s *CreateLeaseZftagreementunsignResponse) SetResponseData(v string) *CreateLeaseZftagreementunsignResponse {
	s.ResponseData = &v
	return s
}

type GetContractCertificateRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
}

func (s GetContractCertificateRequest) String() string {
	return tea.Prettify(s)
}

func (s GetContractCertificateRequest) GoString() string {
	return s.String()
}

func (s *GetContractCertificateRequest) SetAuthToken(v string) *GetContractCertificateRequest {
	s.AuthToken = &v
	return s
}

func (s *GetContractCertificateRequest) SetProductInstanceId(v string) *GetContractCertificateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetContractCertificateRequest) SetFlowId(v string) *GetContractCertificateRequest {
	s.FlowId = &v
	return s
}

type GetContractCertificateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 下载文件地址(一小时内有效)
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 状态值
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 	状态信息描述
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s GetContractCertificateResponse) String() string {
	return tea.Prettify(s)
}

func (s GetContractCertificateResponse) GoString() string {
	return s.String()
}

func (s *GetContractCertificateResponse) SetReqMsgId(v string) *GetContractCertificateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetContractCertificateResponse) SetResultCode(v string) *GetContractCertificateResponse {
	s.ResultCode = &v
	return s
}

func (s *GetContractCertificateResponse) SetResultMsg(v string) *GetContractCertificateResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetContractCertificateResponse) SetUrl(v string) *GetContractCertificateResponse {
	s.Url = &v
	return s
}

func (s *GetContractCertificateResponse) SetCode(v int64) *GetContractCertificateResponse {
	s.Code = &v
	return s
}

func (s *GetContractCertificateResponse) SetMessage(v string) *GetContractCertificateResponse {
	s.Message = &v
	return s
}

type GetCertificateDetailRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 存证哈希地址
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
}

func (s GetCertificateDetailRequest) String() string {
	return tea.Prettify(s)
}

func (s GetCertificateDetailRequest) GoString() string {
	return s.String()
}

func (s *GetCertificateDetailRequest) SetAuthToken(v string) *GetCertificateDetailRequest {
	s.AuthToken = &v
	return s
}

func (s *GetCertificateDetailRequest) SetProductInstanceId(v string) *GetCertificateDetailRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetCertificateDetailRequest) SetTxHash(v string) *GetCertificateDetailRequest {
	s.TxHash = &v
	return s
}

type GetCertificateDetailResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证证明下载地址
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 状态值
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 状态信息描述
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s GetCertificateDetailResponse) String() string {
	return tea.Prettify(s)
}

func (s GetCertificateDetailResponse) GoString() string {
	return s.String()
}

func (s *GetCertificateDetailResponse) SetReqMsgId(v string) *GetCertificateDetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetCertificateDetailResponse) SetResultCode(v string) *GetCertificateDetailResponse {
	s.ResultCode = &v
	return s
}

func (s *GetCertificateDetailResponse) SetResultMsg(v string) *GetCertificateDetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetCertificateDetailResponse) SetUrl(v string) *GetCertificateDetailResponse {
	s.Url = &v
	return s
}

func (s *GetCertificateDetailResponse) SetCode(v int64) *GetCertificateDetailResponse {
	s.Code = &v
	return s
}

func (s *GetCertificateDetailResponse) SetMessage(v string) *GetCertificateDetailResponse {
	s.Message = &v
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
				"sdk_version":      tea.String("1.4.140"),
			}
			if !tea.BoolValue(util.Empty(client.SecurityToken)) {
				request_.Query["security_token"] = client.SecurityToken
			}

			request_.Headers = tea.Merge(map[string]*string{
				"host":       util.DefaultString(client.Endpoint, tea.String("twc-openapi.antchain.antgroup.com")),
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
 * Description: 提供给第三方仲裁isv的仲裁申请状态变化回调接口
 * Summary: 仲裁状态信息变更回调接口
 */
func (client *Client) CallbackArbitrationStatus(request *CallbackArbitrationStatusRequest) (_result *CallbackArbitrationStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackArbitrationStatusResponse{}
	_body, _err := client.CallbackArbitrationStatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提供给第三方仲裁isv的仲裁申请状态变化回调接口
 * Summary: 仲裁状态信息变更回调接口
 */
func (client *Client) CallbackArbitrationStatusEx(request *CallbackArbitrationStatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackArbitrationStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackArbitrationStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.arbitration.status.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 调用本接口创建个人账号，后续有关该用户的所有操作都需使用该用户的accountId。如提供用户证件信息，则将根据提供的用户证件信息申请数字证书。
 * Summary: 创建电子合同签署个人帐户
 */
func (client *Client) CreateContractAccount(request *CreateContractAccountRequest) (_result *CreateContractAccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateContractAccountResponse{}
	_body, _err := client.CreateContractAccountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 调用本接口创建个人账号，后续有关该用户的所有操作都需使用该用户的accountId。如提供用户证件信息，则将根据提供的用户证件信息申请数字证书。
 * Summary: 创建电子合同签署个人帐户
 */
func (client *Client) CreateContractAccountEx(request *CreateContractAccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateContractAccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateContractAccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.account.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过模版参数，创建个人印章
 * Summary: 创建电子合同个人帐户印章
 */
func (client *Client) CreateContractAccountseal(request *CreateContractAccountsealRequest) (_result *CreateContractAccountsealResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateContractAccountsealResponse{}
	_body, _err := client.CreateContractAccountsealEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过模版参数，创建个人印章
 * Summary: 创建电子合同个人帐户印章
 */
func (client *Client) CreateContractAccountsealEx(request *CreateContractAccountsealRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateContractAccountsealResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateContractAccountsealResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.accountseal.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 对接方调用本接口创建机构账号，后续有关该机构的所有操作都需使用该机构的orgId。如提供机构证件信息，则将根据提供的机构证件信息申请数字证书。
创建机构账号前需要先创建一个个人账号并通过本接口传给服务器，该个人账号将作为该机构签署的经办人，代表企业完成实名认证和意愿认证，并完成签署操作。
 * Summary: 创建电子合同签署机构帐户
*/
func (client *Client) CreateContractOrganization(request *CreateContractOrganizationRequest) (_result *CreateContractOrganizationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateContractOrganizationResponse{}
	_body, _err := client.CreateContractOrganizationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 对接方调用本接口创建机构账号，后续有关该机构的所有操作都需使用该机构的orgId。如提供机构证件信息，则将根据提供的机构证件信息申请数字证书。
创建机构账号前需要先创建一个个人账号并通过本接口传给服务器，该个人账号将作为该机构签署的经办人，代表企业完成实名认证和意愿认证，并完成签署操作。
 * Summary: 创建电子合同签署机构帐户
*/
func (client *Client) CreateContractOrganizationEx(request *CreateContractOrganizationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateContractOrganizationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateContractOrganizationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.organization.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过模版参数，创建机构印章
 * Summary: 创建电子合同机构帐户印章
 */
func (client *Client) CreateContractOrgseal(request *CreateContractOrgsealRequest) (_result *CreateContractOrgsealResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateContractOrgsealResponse{}
	_body, _err := client.CreateContractOrgsealEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过模版参数，创建机构印章
 * Summary: 创建电子合同机构帐户印章
 */
func (client *Client) CreateContractOrgsealEx(request *CreateContractOrgsealRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateContractOrgsealResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateContractOrgsealResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.orgseal.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 静默签署授权
 * Summary: 静默签署授权
 */
func (client *Client) AuthContractSign(request *AuthContractSignRequest) (_result *AuthContractSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthContractSignResponse{}
	_body, _err := client.AuthContractSignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 静默签署授权
 * Summary: 静默签署授权
 */
func (client *Client) AuthContractSignEx(request *AuthContractSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthContractSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthContractSignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.sign.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
 * Summary: 通过文件上传方式创建电子合同签署模板
 */
func (client *Client) CreateContractTemplate(request *CreateContractTemplateRequest) (_result *CreateContractTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateContractTemplateResponse{}
	_body, _err := client.CreateContractTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
 * Summary: 通过文件上传方式创建电子合同签署模板
 */
func (client *Client) CreateContractTemplateEx(request *CreateContractTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateContractTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateContractTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.template.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建签署流程
 * Summary: 创建电子合同签署流程
 */
func (client *Client) CreateContractFlow(request *CreateContractFlowRequest) (_result *CreateContractFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateContractFlowResponse{}
	_body, _err := client.CreateContractFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建签署流程
 * Summary: 创建电子合同签署流程
 */
func (client *Client) CreateContractFlowEx(request *CreateContractFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateContractFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateContractFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.flow.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
 * Summary: 向电子合同签署流程中添加待签署文档
 */
func (client *Client) AddContractDocument(request *AddContractDocumentRequest) (_result *AddContractDocumentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddContractDocumentResponse{}
	_body, _err := client.AddContractDocumentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
 * Summary: 向电子合同签署流程中添加待签署文档
 */
func (client *Client) AddContractDocumentEx(request *AddContractDocumentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddContractDocumentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddContractDocumentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.document.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
 * Summary: 添加电子合同签署方自动盖章签署区
 */
func (client *Client) AddContractSignfield(request *AddContractSignfieldRequest) (_result *AddContractSignfieldResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddContractSignfieldResponse{}
	_body, _err := client.AddContractSignfieldEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
 * Summary: 添加电子合同签署方自动盖章签署区
 */
func (client *Client) AddContractSignfieldEx(request *AddContractSignfieldRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddContractSignfieldResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddContractSignfieldResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.signfield.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
 * Summary: 电子合同签署流程开启
 */
func (client *Client) StartContractFlow(request *StartContractFlowRequest) (_result *StartContractFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartContractFlowResponse{}
	_body, _err := client.StartContractFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
 * Summary: 电子合同签署流程开启
 */
func (client *Client) StartContractFlowEx(request *StartContractFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartContractFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartContractFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.flow.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
 * Summary: 电子合同签署流程归档
 */
func (client *Client) SaveContractFlow(request *SaveContractFlowRequest) (_result *SaveContractFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveContractFlowResponse{}
	_body, _err := client.SaveContractFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
 * Summary: 电子合同签署流程归档
 */
func (client *Client) SaveContractFlowEx(request *SaveContractFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveContractFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveContractFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.flow.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 流程归档后，查询和下载签署后的文件
 * Summary: 电子合同流程文档下载
 */
func (client *Client) DownloadContractDocument(request *DownloadContractDocumentRequest) (_result *DownloadContractDocumentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DownloadContractDocumentResponse{}
	_body, _err := client.DownloadContractDocumentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 流程归档后，查询和下载签署后的文件
 * Summary: 电子合同流程文档下载
 */
func (client *Client) DownloadContractDocumentEx(request *DownloadContractDocumentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DownloadContractDocumentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DownloadContractDocumentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.document.download"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
 * Summary: 通过电子合同模板添加文档
 */
func (client *Client) AddContractFile(request *AddContractFileRequest) (_result *AddContractFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddContractFileResponse{}
	_body, _err := client.AddContractFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
 * Summary: 通过电子合同模板添加文档
 */
func (client *Client) AddContractFileEx(request *AddContractFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddContractFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddContractFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.file.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
 * Summary: 电子合同平台方注册
 */
func (client *Client) CreateContractPlatform(request *CreateContractPlatformRequest) (_result *CreateContractPlatformResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateContractPlatformResponse{}
	_body, _err := client.CreateContractPlatformEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
 * Summary: 电子合同平台方注册
 */
func (client *Client) CreateContractPlatformEx(request *CreateContractPlatformRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateContractPlatformResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateContractPlatformResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.platform.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 电子合同平台方提供用户信息，注册成为平台用户
 * Summary: 电子合同平台方的用户注册
 */
func (client *Client) CreateContractUser(request *CreateContractUserRequest) (_result *CreateContractUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateContractUserResponse{}
	_body, _err := client.CreateContractUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 电子合同平台方提供用户信息，注册成为平台用户
 * Summary: 电子合同平台方的用户注册
 */
func (client *Client) CreateContractUserEx(request *CreateContractUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateContractUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateContractUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.user.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 电子合同平台方发起签署流程，用户在H5页面完成手动签署
 * Summary: 电子合同平台方发起手动签署流程
 */
func (client *Client) StartContractHandsign(request *StartContractHandsignRequest) (_result *StartContractHandsignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartContractHandsignResponse{}
	_body, _err := client.StartContractHandsignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 电子合同平台方发起签署流程，用户在H5页面完成手动签署
 * Summary: 电子合同平台方发起手动签署流程
 */
func (client *Client) StartContractHandsignEx(request *StartContractHandsignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartContractHandsignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartContractHandsignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.handsign.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询签署流程的详细信息，包括流程配置、签署状态等
 * Summary: 签署流程查询
 */
func (client *Client) QueryContractFlow(request *QueryContractFlowRequest) (_result *QueryContractFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryContractFlowResponse{}
	_body, _err := client.QueryContractFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询签署流程的详细信息，包括流程配置、签署状态等
 * Summary: 签署流程查询
 */
func (client *Client) QueryContractFlowEx(request *QueryContractFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryContractFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryContractFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.flow.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建个人/机构图片印章
 * Summary: 创建个人/机构图片印章
 */
func (client *Client) CreateContractAccountsealimage(request *CreateContractAccountsealimageRequest) (_result *CreateContractAccountsealimageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateContractAccountsealimageResponse{}
	_body, _err := client.CreateContractAccountsealimageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建个人/机构图片印章
 * Summary: 创建个人/机构图片印章
 */
func (client *Client) CreateContractAccountsealimageEx(request *CreateContractAccountsealimageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateContractAccountsealimageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateContractAccountsealimageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.accountsealimage.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
 * Summary: 通过上传方式创建文件
 */
func (client *Client) GetContractFileuploadurl(request *GetContractFileuploadurlRequest) (_result *GetContractFileuploadurlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetContractFileuploadurlResponse{}
	_body, _err := client.GetContractFileuploadurlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
 * Summary: 通过上传方式创建文件
 */
func (client *Client) GetContractFileuploadurlEx(request *GetContractFileuploadurlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetContractFileuploadurlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetContractFileuploadurlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.fileuploadurl.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息（平台自动签无需指定签署人信息，默认签署人是对接的企业）。
签署区创建完成，流程开启后，系统将自动完成“对接平台自动盖章签署区”的盖章，对接平台可全程无感完成本次签署。
 * Summary: 添加平台自动盖章签署区
*/
func (client *Client) AddContractPlatformsignfields(request *AddContractPlatformsignfieldsRequest) (_result *AddContractPlatformsignfieldsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddContractPlatformsignfieldsResponse{}
	_body, _err := client.AddContractPlatformsignfieldsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息（平台自动签无需指定签署人信息，默认签署人是对接的企业）。
签署区创建完成，流程开启后，系统将自动完成“对接平台自动盖章签署区”的盖章，对接平台可全程无感完成本次签署。
 * Summary: 添加平台自动盖章签署区
*/
func (client *Client) AddContractPlatformsignfieldsEx(request *AddContractPlatformsignfieldsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddContractPlatformsignfieldsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddContractPlatformsignfieldsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.platformsignfields.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询文件详情，包括文件名称、大小、下载地址等
 * Summary: 查询文件详情
 */
func (client *Client) GetContractFile(request *GetContractFileRequest) (_result *GetContractFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetContractFileResponse{}
	_body, _err := client.GetContractFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询文件详情，包括文件名称、大小、下载地址等
 * Summary: 查询文件详情
 */
func (client *Client) GetContractFileEx(request *GetContractFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetContractFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetContractFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.file.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询个人所有印章
 * Summary: 查询个人印章
 */
func (client *Client) QueryContractAccountseals(request *QueryContractAccountsealsRequest) (_result *QueryContractAccountsealsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryContractAccountsealsResponse{}
	_body, _err := client.QueryContractAccountsealsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询个人所有印章
 * Summary: 查询个人印章
 */
func (client *Client) QueryContractAccountsealsEx(request *QueryContractAccountsealsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryContractAccountsealsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryContractAccountsealsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.accountseals.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询机构所有印章
 * Summary: 查询机构印章
 */
func (client *Client) QueryContractOrganizationseals(request *QueryContractOrganizationsealsRequest) (_result *QueryContractOrganizationsealsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryContractOrganizationsealsResponse{}
	_body, _err := client.QueryContractOrganizationsealsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询机构所有印章
 * Summary: 查询机构印章
 */
func (client *Client) QueryContractOrganizationsealsEx(request *QueryContractOrganizationsealsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryContractOrganizationsealsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryContractOrganizationsealsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.organizationseals.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询流程所有签署人列表。
 * Summary: 查询流程签署人列表
 */
func (client *Client) QueryContractFlowsigner(request *QueryContractFlowsignerRequest) (_result *QueryContractFlowsignerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryContractFlowsignerResponse{}
	_body, _err := client.QueryContractFlowsignerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询流程所有签署人列表。
 * Summary: 查询流程签署人列表
 */
func (client *Client) QueryContractFlowsignerEx(request *QueryContractFlowsignerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryContractFlowsignerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryContractFlowsignerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.flowsigner.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
 * Summary: 查询签署区列表
 */
func (client *Client) QueryContractSignfields(request *QueryContractSignfieldsRequest) (_result *QueryContractSignfieldsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryContractSignfieldsResponse{}
	_body, _err := client.QueryContractSignfieldsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
 * Summary: 查询签署区列表
 */
func (client *Client) QueryContractSignfieldsEx(request *QueryContractSignfieldsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryContractSignfieldsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryContractSignfieldsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.signfields.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 使用创建账号返回的账号id查询用户的账号。
 * Summary: 查询个人账号
 */
func (client *Client) QueryContractAccount(request *QueryContractAccountRequest) (_result *QueryContractAccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryContractAccountResponse{}
	_body, _err := client.QueryContractAccountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 使用创建账号返回的账号id查询用户的账号。
 * Summary: 查询个人账号
 */
func (client *Client) QueryContractAccountEx(request *QueryContractAccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryContractAccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryContractAccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.account.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 使用创建账号返回的账号id查询机构账号。
 * Summary: 查询机构账号
 */
func (client *Client) QueryContractOrganization(request *QueryContractOrganizationRequest) (_result *QueryContractOrganizationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryContractOrganizationResponse{}
	_body, _err := client.QueryContractOrganizationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 使用创建账号返回的账号id查询机构账号。
 * Summary: 查询机构账号
 */
func (client *Client) QueryContractOrganizationEx(request *QueryContractOrganizationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryContractOrganizationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryContractOrganizationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.organization.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询模板详情，包括文件模板基本信息和输入项组件信息
 * Summary: 查询模板详情详情
 */
func (client *Client) QueryContractTemplate(request *QueryContractTemplateRequest) (_result *QueryContractTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryContractTemplateResponse{}
	_body, _err := client.QueryContractTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询模板详情，包括文件模板基本信息和输入项组件信息
 * Summary: 查询模板详情详情
 */
func (client *Client) QueryContractTemplateEx(request *QueryContractTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryContractTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryContractTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.template.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
 * Summary: 创建签署流程
 */
func (client *Client) CreateContractSignflow(request *CreateContractSignflowRequest) (_result *CreateContractSignflowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateContractSignflowResponse{}
	_body, _err := client.CreateContractSignflowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
 * Summary: 创建签署流程
 */
func (client *Client) CreateContractSignflowEx(request *CreateContractSignflowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateContractSignflowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateContractSignflowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.signflow.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户签署直付通协议
 * Summary: 商户签署直付通协议
 */
func (client *Client) CreateContractRegisterzft(request *CreateContractRegisterzftRequest) (_result *CreateContractRegisterzftResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateContractRegisterzftResponse{}
	_body, _err := client.CreateContractRegisterzftEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户签署直付通协议
 * Summary: 商户签署直付通协议
 */
func (client *Client) CreateContractRegisterzftEx(request *CreateContractRegisterzftRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateContractRegisterzftResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateContractRegisterzftResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.registerzft.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建模板的同时，指定平台方签署信息，完成智能合同模板创建
 * Summary: 创建智能合同模板
 */
func (client *Client) CreateContractPlatformtemplate(request *CreateContractPlatformtemplateRequest) (_result *CreateContractPlatformtemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateContractPlatformtemplateResponse{}
	_body, _err := client.CreateContractPlatformtemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建模板的同时，指定平台方签署信息，完成智能合同模板创建
 * Summary: 创建智能合同模板
 */
func (client *Client) CreateContractPlatformtemplateEx(request *CreateContractPlatformtemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateContractPlatformtemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateContractPlatformtemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.platformtemplate.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询商户直付通入驻信息
 * Summary: 查询商户直付通入驻信息
 */
func (client *Client) QueryContractMerchantzft(request *QueryContractMerchantzftRequest) (_result *QueryContractMerchantzftResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryContractMerchantzftResponse{}
	_body, _err := client.QueryContractMerchantzftEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询商户直付通入驻信息
 * Summary: 查询商户直付通入驻信息
 */
func (client *Client) QueryContractMerchantzftEx(request *QueryContractMerchantzftRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryContractMerchantzftResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryContractMerchantzftResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.merchantzft.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 列举本租户合同相关交易
 * Summary: 列举本租户合同相关交易
 */
func (client *Client) ListContractOuttradeid(request *ListContractOuttradeidRequest) (_result *ListContractOuttradeidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListContractOuttradeidResponse{}
	_body, _err := client.ListContractOuttradeidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 列举本租户合同相关交易
 * Summary: 列举本租户合同相关交易
 */
func (client *Client) ListContractOuttradeidEx(request *ListContractOuttradeidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListContractOuttradeidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListContractOuttradeidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.outtradeid.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据订单id查询订单代扣详情
 * Summary: 根据订单id查询订单代扣详情
 */
func (client *Client) QueryContractTradedetail(request *QueryContractTradedetailRequest) (_result *QueryContractTradedetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryContractTradedetailResponse{}
	_body, _err := client.QueryContractTradedetailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据订单id查询订单代扣详情
 * Summary: 根据订单id查询订单代扣详情
 */
func (client *Client) QueryContractTradedetailEx(request *QueryContractTradedetailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryContractTradedetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryContractTradedetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.tradedetail.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户根据订单id退款
 * Summary: 商户根据订单id退款
 */
func (client *Client) CreateContractMerchantrefund(request *CreateContractMerchantrefundRequest) (_result *CreateContractMerchantrefundResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateContractMerchantrefundResponse{}
	_body, _err := client.CreateContractMerchantrefundEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户根据订单id退款
 * Summary: 商户根据订单id退款
 */
func (client *Client) CreateContractMerchantrefundEx(request *CreateContractMerchantrefundRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateContractMerchantrefundResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateContractMerchantrefundResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.merchantrefund.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建蚂蚁区块链账户
 * Summary: 创建蚂蚁区块链账户
 */
func (client *Client) CreateContractAdminaccount(request *CreateContractAdminaccountRequest) (_result *CreateContractAdminaccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateContractAdminaccountResponse{}
	_body, _err := client.CreateContractAdminaccountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建蚂蚁区块链账户
 * Summary: 创建蚂蚁区块链账户
 */
func (client *Client) CreateContractAdminaccountEx(request *CreateContractAdminaccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateContractAdminaccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateContractAdminaccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.adminaccount.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户根据合同id列举所有的tradeId
 * Summary: 商户根据合同id列举所有的tradeId
 */
func (client *Client) ListContractTradeids(request *ListContractTradeidsRequest) (_result *ListContractTradeidsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListContractTradeidsResponse{}
	_body, _err := client.ListContractTradeidsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户根据合同id列举所有的tradeId
 * Summary: 商户根据合同id列举所有的tradeId
 */
func (client *Client) ListContractTradeidsEx(request *ListContractTradeidsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListContractTradeidsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListContractTradeidsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.tradeids.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户上传代扣规则
 * Summary: 商户上传代扣规则
 */
func (client *Client) CreateContractCommontrigger(request *CreateContractCommontriggerRequest) (_result *CreateContractCommontriggerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateContractCommontriggerResponse{}
	_body, _err := client.CreateContractCommontriggerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户上传代扣规则
 * Summary: 商户上传代扣规则
 */
func (client *Client) CreateContractCommontriggerEx(request *CreateContractCommontriggerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateContractCommontriggerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateContractCommontriggerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.commontrigger.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户入驻直付通
 * Summary: 商户入驻直付通
 */
func (client *Client) CreateContractMerchantindirectzft(request *CreateContractMerchantindirectzftRequest) (_result *CreateContractMerchantindirectzftResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateContractMerchantindirectzftResponse{}
	_body, _err := client.CreateContractMerchantindirectzftEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户入驻直付通
 * Summary: 商户入驻直付通
 */
func (client *Client) CreateContractMerchantindirectzftEx(request *CreateContractMerchantindirectzftRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateContractMerchantindirectzftResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateContractMerchantindirectzftResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.merchantindirectzft.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据订单id查询直付通商户入驻信息
 * Summary: 根据订单id查询直付通商户入驻信息
 */
func (client *Client) QueryContractMerchantindirectzft(request *QueryContractMerchantindirectzftRequest) (_result *QueryContractMerchantindirectzftResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryContractMerchantindirectzftResponse{}
	_body, _err := client.QueryContractMerchantindirectzftEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据订单id查询直付通商户入驻信息
 * Summary: 根据订单id查询直付通商户入驻信息
 */
func (client *Client) QueryContractMerchantindirectzftEx(request *QueryContractMerchantindirectzftRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryContractMerchantindirectzftResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryContractMerchantindirectzftResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.merchantindirectzft.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取支付对账文件的url
 * Summary: 获取支付对账文件的url
 */
func (client *Client) QueryPayresultfileurl(request *QueryPayresultfileurlRequest) (_result *QueryPayresultfileurlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryPayresultfileurlResponse{}
	_body, _err := client.QueryPayresultfileurlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取支付对账文件的url
 * Summary: 获取支付对账文件的url
 */
func (client *Client) QueryPayresultfileurlEx(request *QueryPayresultfileurlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryPayresultfileurlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryPayresultfileurlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.payresultfileurl.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 智能合同图片上传
 * Summary: 智能合同图片上传
 */
func (client *Client) CreateContractMerchantimage(request *CreateContractMerchantimageRequest) (_result *CreateContractMerchantimageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateContractMerchantimageResponse{}
	_body, _err := client.CreateContractMerchantimageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 智能合同图片上传
 * Summary: 智能合同图片上传
 */
func (client *Client) CreateContractMerchantimageEx(request *CreateContractMerchantimageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateContractMerchantimageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateContractMerchantimageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.merchantimage.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 取消智能合同剩余代扣条目
 * Summary: 取消智能合同剩余代扣条目
 */
func (client *Client) CancelContractPaytrade(request *CancelContractPaytradeRequest) (_result *CancelContractPaytradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelContractPaytradeResponse{}
	_body, _err := client.CancelContractPaytradeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 取消智能合同剩余代扣条目
 * Summary: 取消智能合同剩余代扣条目
 */
func (client *Client) CancelContractPaytradeEx(request *CancelContractPaytradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelContractPaytradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelContractPaytradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.paytrade.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建手动签署流程
 * Summary: 创建手动签署流程
 */
func (client *Client) CreateContractHandsignflow(request *CreateContractHandsignflowRequest) (_result *CreateContractHandsignflowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateContractHandsignflowResponse{}
	_body, _err := client.CreateContractHandsignflowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建手动签署流程
 * Summary: 创建手动签署流程
 */
func (client *Client) CreateContractHandsignflowEx(request *CreateContractHandsignflowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateContractHandsignflowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateContractHandsignflowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.handsignflow.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
 * Summary: 添加电子合同签署方手动盖章签署区
 */
func (client *Client) CreateContractHandsignfield(request *CreateContractHandsignfieldRequest) (_result *CreateContractHandsignfieldResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateContractHandsignfieldResponse{}
	_body, _err := client.CreateContractHandsignfieldEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
 * Summary: 添加电子合同签署方手动盖章签署区
 */
func (client *Client) CreateContractHandsignfieldEx(request *CreateContractHandsignfieldRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateContractHandsignfieldResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateContractHandsignfieldResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.handsignfield.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
 * Summary: 获取签署地址
 */
func (client *Client) GetContractSignurl(request *GetContractSignurlRequest) (_result *GetContractSignurlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetContractSignurlResponse{}
	_body, _err := client.GetContractSignurlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
 * Summary: 获取签署地址
 */
func (client *Client) GetContractSignurlEx(request *GetContractSignurlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetContractSignurlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetContractSignurlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.signurl.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 可信付代扣规则内容创建
 * Summary: 可信付代扣规则内容创建
 */
func (client *Client) CreateWithholdAgreement(request *CreateWithholdAgreementRequest) (_result *CreateWithholdAgreementResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateWithholdAgreementResponse{}
	_body, _err := client.CreateWithholdAgreementEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 可信付代扣规则内容创建
 * Summary: 可信付代扣规则内容创建
 */
func (client *Client) CreateWithholdAgreementEx(request *CreateWithholdAgreementRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateWithholdAgreementResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateWithholdAgreementResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.withhold.agreement.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询消金代扣协议
 * Summary: 查询可信付代扣协议内容
 */
func (client *Client) QueryWithholdAgreement(request *QueryWithholdAgreementRequest) (_result *QueryWithholdAgreementResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryWithholdAgreementResponse{}
	_body, _err := client.QueryWithholdAgreementEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询消金代扣协议
 * Summary: 查询可信付代扣协议内容
 */
func (client *Client) QueryWithholdAgreementEx(request *QueryWithholdAgreementRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryWithholdAgreementResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryWithholdAgreementResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.withhold.agreement.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询可信付协议的入口
 * Summary: 查询可信付协议的入口
 */
func (client *Client) QueryWithholdAgreementurl(request *QueryWithholdAgreementurlRequest) (_result *QueryWithholdAgreementurlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryWithholdAgreementurlResponse{}
	_body, _err := client.QueryWithholdAgreementurlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询可信付协议的入口
 * Summary: 查询可信付协议的入口
 */
func (client *Client) QueryWithholdAgreementurlEx(request *QueryWithholdAgreementurlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryWithholdAgreementurlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryWithholdAgreementurlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.withhold.agreementurl.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 后台录入商家的产品的逾期日
 * Summary: 后台录入商家的产品的逾期日
 */
func (client *Client) CreateWithholdOverduetime(request *CreateWithholdOverduetimeRequest) (_result *CreateWithholdOverduetimeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateWithholdOverduetimeResponse{}
	_body, _err := client.CreateWithholdOverduetimeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 后台录入商家的产品的逾期日
 * Summary: 后台录入商家的产品的逾期日
 */
func (client *Client) CreateWithholdOverduetimeEx(request *CreateWithholdOverduetimeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateWithholdOverduetimeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateWithholdOverduetimeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.withhold.overduetime.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 可信付代扣的扣费请求
 * Summary: 发送代扣请求
 */
func (client *Client) SendWithholdDeduct(request *SendWithholdDeductRequest) (_result *SendWithholdDeductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendWithholdDeductResponse{}
	_body, _err := client.SendWithholdDeductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 可信付代扣的扣费请求
 * Summary: 发送代扣请求
 */
func (client *Client) SendWithholdDeductEx(request *SendWithholdDeductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendWithholdDeductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendWithholdDeductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.withhold.deduct.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 可信付代扣结果查询
 * Summary: 可信付代扣结果查询
 */
func (client *Client) QueryWithholdPayresult(request *QueryWithholdPayresultRequest) (_result *QueryWithholdPayresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryWithholdPayresultResponse{}
	_body, _err := client.QueryWithholdPayresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 可信付代扣结果查询
 * Summary: 可信付代扣结果查询
 */
func (client *Client) QueryWithholdPayresultEx(request *QueryWithholdPayresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryWithholdPayresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryWithholdPayresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.withhold.payresult.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 可信付退款请求
 * Summary: 可信付退款请求
 */
func (client *Client) SendWithholdRefund(request *SendWithholdRefundRequest) (_result *SendWithholdRefundResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendWithholdRefundResponse{}
	_body, _err := client.SendWithholdRefundEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 可信付退款请求
 * Summary: 可信付退款请求
 */
func (client *Client) SendWithholdRefundEx(request *SendWithholdRefundRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendWithholdRefundResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendWithholdRefundResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.withhold.refund.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建邀请任务，被邀请人收到通知后需要注册并完成实名认证方可开通电子签名服务。
 * Summary: 创建注册邀请任务
 */
func (client *Client) SendContractInvitation(request *SendContractInvitationRequest) (_result *SendContractInvitationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendContractInvitationResponse{}
	_body, _err := client.SendContractInvitationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建邀请任务，被邀请人收到通知后需要注册并完成实名认证方可开通电子签名服务。
 * Summary: 创建注册邀请任务
 */
func (client *Client) SendContractInvitationEx(request *SendContractInvitationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendContractInvitationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendContractInvitationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.invitation.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询代扣规则
 * Summary: 查询代扣规则
 */
func (client *Client) ListContractPayrule(request *ListContractPayruleRequest) (_result *ListContractPayruleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListContractPayruleResponse{}
	_body, _err := client.ListContractPayruleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询代扣规则
 * Summary: 查询代扣规则
 */
func (client *Client) ListContractPayruleEx(request *ListContractPayruleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListContractPayruleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListContractPayruleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.payrule.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取可信付免签协议的二维码
 * Summary: 获取可信付免签协议的二维码
 */
func (client *Client) CreateWithholdQrcode(request *CreateWithholdQrcodeRequest) (_result *CreateWithholdQrcodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateWithholdQrcodeResponse{}
	_body, _err := client.CreateWithholdQrcodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取可信付免签协议的二维码
 * Summary: 获取可信付免签协议的二维码
 */
func (client *Client) CreateWithholdQrcodeEx(request *CreateWithholdQrcodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateWithholdQrcodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateWithholdQrcodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.withhold.qrcode.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 取消某一期的代扣规则
 * Summary: 取消某一期的代扣规则
 */
func (client *Client) CancelContractPaysingletrade(request *CancelContractPaysingletradeRequest) (_result *CancelContractPaysingletradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelContractPaysingletradeResponse{}
	_body, _err := client.CancelContractPaysingletradeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 取消某一期的代扣规则
 * Summary: 取消某一期的代扣规则
 */
func (client *Client) CancelContractPaysingletradeEx(request *CancelContractPaysingletradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelContractPaysingletradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelContractPaysingletradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.paysingletrade.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
 * Summary: 申请区块链合同回调加签key
 */
func (client *Client) ApplyContractCallbackkey(request *ApplyContractCallbackkeyRequest) (_result *ApplyContractCallbackkeyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyContractCallbackkeyResponse{}
	_body, _err := client.ApplyContractCallbackkeyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
 * Summary: 申请区块链合同回调加签key
 */
func (client *Client) ApplyContractCallbackkeyEx(request *ApplyContractCallbackkeyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyContractCallbackkeyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyContractCallbackkeyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.callbackkey.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
 * Summary: 一步创建签署流程接口
 */
func (client *Client) CreateContractOnestepflow(request *CreateContractOnestepflowRequest) (_result *CreateContractOnestepflowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateContractOnestepflowResponse{}
	_body, _err := client.CreateContractOnestepflowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
 * Summary: 一步创建签署流程接口
 */
func (client *Client) CreateContractOnestepflowEx(request *CreateContractOnestepflowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateContractOnestepflowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateContractOnestepflowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.onestepflow.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过流程ID查询合同存证信息
 * Summary: 查询合同存证信息
 */
func (client *Client) QueryContractNotary(request *QueryContractNotaryRequest) (_result *QueryContractNotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryContractNotaryResponse{}
	_body, _err := client.QueryContractNotaryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过流程ID查询合同存证信息
 * Summary: 查询合同存证信息
 */
func (client *Client) QueryContractNotaryEx(request *QueryContractNotaryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryContractNotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryContractNotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.notary.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取合同存证事务ID
 * Summary: 获取合同存证事务ID
 */
func (client *Client) CreateEcocontractTrans(request *CreateEcocontractTransRequest) (_result *CreateEcocontractTransResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateEcocontractTransResponse{}
	_body, _err := client.CreateEcocontractTransEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取合同存证事务ID
 * Summary: 获取合同存证事务ID
 */
func (client *Client) CreateEcocontractTransEx(request *CreateEcocontractTransRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateEcocontractTransResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateEcocontractTransResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.ecocontract.trans.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 合同文本存证
 * Summary: 合同文本存证
 */
func (client *Client) CreateEcocontractText(request *CreateEcocontractTextRequest) (_result *CreateEcocontractTextResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateEcocontractTextResponse{}
	_body, _err := client.CreateEcocontractTextEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 合同文本存证
 * Summary: 合同文本存证
 */
func (client *Client) CreateEcocontractTextEx(request *CreateEcocontractTextRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateEcocontractTextResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateEcocontractTextResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.ecocontract.text.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 搜索关键字坐标，以关键字左下角为原点去查询坐标
 * Summary: 搜索关键字坐标
 */
func (client *Client) QueryContractWordsposition(request *QueryContractWordspositionRequest) (_result *QueryContractWordspositionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryContractWordspositionResponse{}
	_body, _err := client.QueryContractWordspositionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 搜索关键字坐标，以关键字左下角为原点去查询坐标
 * Summary: 搜索关键字坐标
 */
func (client *Client) QueryContractWordspositionEx(request *QueryContractWordspositionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryContractWordspositionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryContractWordspositionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.wordsposition.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 执行签署人删除逻辑
 * Summary: 删除签署人
 */
func (client *Client) DeleteContractSigner(request *DeleteContractSignerRequest) (_result *DeleteContractSignerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteContractSignerResponse{}
	_body, _err := client.DeleteContractSignerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 执行签署人删除逻辑
 * Summary: 删除签署人
 */
func (client *Client) DeleteContractSignerEx(request *DeleteContractSignerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteContractSignerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteContractSignerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.signer.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 输入企业名+证件号，发起企业二要素认证请求。
 * Summary: 企业二要素认证
 */
func (client *Client) CheckEpidentityTwometa(request *CheckEpidentityTwometaRequest) (_result *CheckEpidentityTwometaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckEpidentityTwometaResponse{}
	_body, _err := client.CheckEpidentityTwometaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 输入企业名+证件号，发起企业二要素认证请求。
 * Summary: 企业二要素认证
 */
func (client *Client) CheckEpidentityTwometaEx(request *CheckEpidentityTwometaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckEpidentityTwometaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckEpidentityTwometaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.epidentity.twometa.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 输入企业名+证件号+企业法人姓名，发起企业三要素认证请求。
 * Summary: 企业三要素认证
 */
func (client *Client) CheckEpidentityThreemeta(request *CheckEpidentityThreemetaRequest) (_result *CheckEpidentityThreemetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckEpidentityThreemetaResponse{}
	_body, _err := client.CheckEpidentityThreemetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 输入企业名+证件号+企业法人姓名，发起企业三要素认证请求。
 * Summary: 企业三要素认证
 */
func (client *Client) CheckEpidentityThreemetaEx(request *CheckEpidentityThreemetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckEpidentityThreemetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckEpidentityThreemetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.epidentity.threemeta.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 输入企业名+证件号+企业法人姓+法人证件号，发起企业四要素认证请求。
 * Summary: 企业四要素认证
 */
func (client *Client) CheckEpidentityFourmeta(request *CheckEpidentityFourmetaRequest) (_result *CheckEpidentityFourmetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckEpidentityFourmetaResponse{}
	_body, _err := client.CheckEpidentityFourmetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 输入企业名+证件号+企业法人姓+法人证件号，发起企业四要素认证请求。
 * Summary: 企业四要素认证
 */
func (client *Client) CheckEpidentityFourmetaEx(request *CheckEpidentityFourmetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckEpidentityFourmetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckEpidentityFourmetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.epidentity.fourmeta.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询公证订单的有效性
 * Summary: 查询公证订单的有效性
 */
func (client *Client) CheckNotarizationOrder(request *CheckNotarizationOrderRequest) (_result *CheckNotarizationOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckNotarizationOrderResponse{}
	_body, _err := client.CheckNotarizationOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询公证订单的有效性
 * Summary: 查询公证订单的有效性
 */
func (client *Client) CheckNotarizationOrderEx(request *CheckNotarizationOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckNotarizationOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckNotarizationOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.notarization.order.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新公证订单状态
 * Summary: 更新公证订单状态
 */
func (client *Client) UpdateNotarizationOrder(request *UpdateNotarizationOrderRequest) (_result *UpdateNotarizationOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateNotarizationOrderResponse{}
	_body, _err := client.UpdateNotarizationOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新公证订单状态
 * Summary: 更新公证订单状态
 */
func (client *Client) UpdateNotarizationOrderEx(request *UpdateNotarizationOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateNotarizationOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateNotarizationOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.notarization.order.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 设置订单属性
 * Summary: 设置订单属性
 */
func (client *Client) SetNotarizationOrder(request *SetNotarizationOrderRequest) (_result *SetNotarizationOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SetNotarizationOrderResponse{}
	_body, _err := client.SetNotarizationOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 设置订单属性
 * Summary: 设置订单属性
 */
func (client *Client) SetNotarizationOrderEx(request *SetNotarizationOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SetNotarizationOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SetNotarizationOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.notarization.order.set"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 实人认证初始化
 * Summary: 实人认证初始化
 */
func (client *Client) InitIdentificationFaceauth(request *InitIdentificationFaceauthRequest) (_result *InitIdentificationFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitIdentificationFaceauthResponse{}
	_body, _err := client.InitIdentificationFaceauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 实人认证初始化
 * Summary: 实人认证初始化
 */
func (client *Client) InitIdentificationFaceauthEx(request *InitIdentificationFaceauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitIdentificationFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitIdentificationFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.identification.faceauth.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发起实人认证
 * Summary: 发起实人认证
 */
func (client *Client) CertifyIdentificationFaceauth(request *CertifyIdentificationFaceauthRequest) (_result *CertifyIdentificationFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CertifyIdentificationFaceauthResponse{}
	_body, _err := client.CertifyIdentificationFaceauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发起实人认证
 * Summary: 发起实人认证
 */
func (client *Client) CertifyIdentificationFaceauthEx(request *CertifyIdentificationFaceauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CertifyIdentificationFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CertifyIdentificationFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.identification.faceauth.certify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询实人认证结果
 * Summary: 查询实人认证结果
 */
func (client *Client) QueryIdentificationFaceauth(request *QueryIdentificationFaceauthRequest) (_result *QueryIdentificationFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIdentificationFaceauthResponse{}
	_body, _err := client.QueryIdentificationFaceauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询实人认证结果
 * Summary: 查询实人认证结果
 */
func (client *Client) QueryIdentificationFaceauthEx(request *QueryIdentificationFaceauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIdentificationFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIdentificationFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.identification.faceauth.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业法人认证查询结果接口
 * Summary: 企业法人认证查询
 */
func (client *Client) QueryEnterpriseFaceauth(request *QueryEnterpriseFaceauthRequest) (_result *QueryEnterpriseFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEnterpriseFaceauthResponse{}
	_body, _err := client.QueryEnterpriseFaceauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业法人认证查询结果接口
 * Summary: 企业法人认证查询
 */
func (client *Client) QueryEnterpriseFaceauthEx(request *QueryEnterpriseFaceauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEnterpriseFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEnterpriseFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.enterprise.faceauth.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业法人认证初始化接口
 * Summary: 企业法人认证初始化
 */
func (client *Client) InitEnterpriseFaceauth(request *InitEnterpriseFaceauthRequest) (_result *InitEnterpriseFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitEnterpriseFaceauthResponse{}
	_body, _err := client.InitEnterpriseFaceauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业法人认证初始化接口
 * Summary: 企业法人认证初始化
 */
func (client *Client) InitEnterpriseFaceauthEx(request *InitEnterpriseFaceauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitEnterpriseFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitEnterpriseFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.enterprise.faceauth.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业法人认证开始接口
 * Summary: 企业法人认证开始
 */
func (client *Client) CertifyEnterpriseFaceauth(request *CertifyEnterpriseFaceauthRequest) (_result *CertifyEnterpriseFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CertifyEnterpriseFaceauthResponse{}
	_body, _err := client.CertifyEnterpriseFaceauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业法人认证开始接口
 * Summary: 企业法人认证开始
 */
func (client *Client) CertifyEnterpriseFaceauthEx(request *CertifyEnterpriseFaceauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CertifyEnterpriseFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CertifyEnterpriseFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.enterprise.faceauth.certify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建租赁订单
 * Summary: 租赁订单创建
 */
func (client *Client) CreateLeaseOrder(request *CreateLeaseOrderRequest) (_result *CreateLeaseOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeaseOrderResponse{}
	_body, _err := client.CreateLeaseOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建租赁订单
 * Summary: 租赁订单创建
 */
func (client *Client) CreateLeaseOrderEx(request *CreateLeaseOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeaseOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeaseOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.order.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 电子公证或存证证明场景中，用户通过回传相关信息创建收费订单。
 * Summary: 公证场景创建收费订单
 */
func (client *Client) CreateNotarizationBill(request *CreateNotarizationBillRequest) (_result *CreateNotarizationBillResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateNotarizationBillResponse{}
	_body, _err := client.CreateNotarizationBillEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 电子公证或存证证明场景中，用户通过回传相关信息创建收费订单。
 * Summary: 公证场景创建收费订单
 */
func (client *Client) CreateNotarizationBillEx(request *CreateNotarizationBillRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateNotarizationBillResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateNotarizationBillResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.notarization.bill.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提供必要的存证信息，初始化一个存证证明的订单，提交公证处审核，并返回订单号
 * Summary: 初始化存证证明订单
 */
func (client *Client) InitCertification(request *InitCertificationRequest) (_result *InitCertificationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitCertificationResponse{}
	_body, _err := client.InitCertificationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提供必要的存证信息，初始化一个存证证明的订单，提交公证处审核，并返回订单号
 * Summary: 初始化存证证明订单
 */
func (client *Client) InitCertificationEx(request *InitCertificationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitCertificationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitCertificationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.certification.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 输入申请ID，查询存证证明申请状态，成功后返回下载地址等信息
 * Summary: 查询存证证明申请状态
 */
func (client *Client) QueryCertification(request *QueryCertificationRequest) (_result *QueryCertificationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCertificationResponse{}
	_body, _err := client.QueryCertificationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 输入申请ID，查询存证证明申请状态，成功后返回下载地址等信息
 * Summary: 查询存证证明申请状态
 */
func (client *Client) QueryCertificationEx(request *QueryCertificationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCertificationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCertificationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.certification.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 可以根据存证过程中获得当可信时间戳凭证，获取国家授时中心颁发的PDF格式可信时间证书
 * Summary: 可信时间凭证服务 - 获取时间凭证证书
 */
func (client *Client) GetTsrCertificate(request *GetTsrCertificateRequest) (_result *GetTsrCertificateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTsrCertificateResponse{}
	_body, _err := client.GetTsrCertificateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 可以根据存证过程中获得当可信时间戳凭证，获取国家授时中心颁发的PDF格式可信时间证书
 * Summary: 可信时间凭证服务 - 获取时间凭证证书
 */
func (client *Client) GetTsrCertificateEx(request *GetTsrCertificateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTsrCertificateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTsrCertificateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.tsr.certificate.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新增/修改履行记录，依据contractCode与contractFulfillmentCode判断唯一性
 * Summary: 联合执行履行记录新增/修改接口
 */
func (client *Client) SaveJointconstraintRecord(request *SaveJointconstraintRecordRequest) (_result *SaveJointconstraintRecordResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveJointconstraintRecordResponse{}
	_body, _err := client.SaveJointconstraintRecordEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新增/修改履行记录，依据contractCode与contractFulfillmentCode判断唯一性
 * Summary: 联合执行履行记录新增/修改接口
 */
func (client *Client) SaveJointconstraintRecordEx(request *SaveJointconstraintRecordRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveJointconstraintRecordResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveJointconstraintRecordResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.jointconstraint.record.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除履行记录
 * Summary: 履行记录删除接口
 */
func (client *Client) DeleteJointconstraintRecord(request *DeleteJointconstraintRecordRequest) (_result *DeleteJointconstraintRecordResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteJointconstraintRecordResponse{}
	_body, _err := client.DeleteJointconstraintRecordEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除履行记录
 * Summary: 履行记录删除接口
 */
func (client *Client) DeleteJointconstraintRecordEx(request *DeleteJointconstraintRecordRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteJointconstraintRecordResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteJointconstraintRecordResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.jointconstraint.record.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询违约记录
 * Summary: 违约记录查询接口
 */
func (client *Client) QueryJointconstraintBreachrecord(request *QueryJointconstraintBreachrecordRequest) (_result *QueryJointconstraintBreachrecordResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryJointconstraintBreachrecordResponse{}
	_body, _err := client.QueryJointconstraintBreachrecordEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询违约记录
 * Summary: 违约记录查询接口
 */
func (client *Client) QueryJointconstraintBreachrecordEx(request *QueryJointconstraintBreachrecordRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryJointconstraintBreachrecordResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryJointconstraintBreachrecordResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.jointconstraint.breachrecord.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提供给第三方调解申请提交
 * Summary: 调解申请
 */
func (client *Client) ApplyJusticeMediation(request *ApplyJusticeMediationRequest) (_result *ApplyJusticeMediationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyJusticeMediationResponse{}
	_body, _err := client.ApplyJusticeMediationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提供给第三方调解申请提交
 * Summary: 调解申请
 */
func (client *Client) ApplyJusticeMediationEx(request *ApplyJusticeMediationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyJusticeMediationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyJusticeMediationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.justice.mediation.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 调解申请进度查询
 * Summary: 调解申请进度查询
 */
func (client *Client) QueryJusticeMediation(request *QueryJusticeMediationRequest) (_result *QueryJusticeMediationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryJusticeMediationResponse{}
	_body, _err := client.QueryJusticeMediationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 调解申请进度查询
 * Summary: 调解申请进度查询
 */
func (client *Client) QueryJusticeMediationEx(request *QueryJusticeMediationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryJusticeMediationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryJusticeMediationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.justice.mediation.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建签署见证流程
 * Summary: 创建见证流程
 */
func (client *Client) CreateWitnessFlow(request *CreateWitnessFlowRequest) (_result *CreateWitnessFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateWitnessFlowResponse{}
	_body, _err := client.CreateWitnessFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建签署见证流程
 * Summary: 创建见证流程
 */
func (client *Client) CreateWitnessFlowEx(request *CreateWitnessFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateWitnessFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateWitnessFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.witness.flow.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保存见证流程快照数据
 * Summary: 保存见证流程快照数据
 */
func (client *Client) SaveWitnessSnapshot(request *SaveWitnessSnapshotRequest) (_result *SaveWitnessSnapshotResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveWitnessSnapshotResponse{}
	_body, _err := client.SaveWitnessSnapshotEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保存见证流程快照数据
 * Summary: 保存见证流程快照数据
 */
func (client *Client) SaveWitnessSnapshotEx(request *SaveWitnessSnapshotRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveWitnessSnapshotResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveWitnessSnapshotResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.witness.snapshot.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 见证流程签署权限校验
 * Summary: 见证流程签署权限校验
 */
func (client *Client) CheckWitnessSignaccess(request *CheckWitnessSignaccessRequest) (_result *CheckWitnessSignaccessResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckWitnessSignaccessResponse{}
	_body, _err := client.CheckWitnessSignaccessEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 见证流程签署权限校验
 * Summary: 见证流程签署权限校验
 */
func (client *Client) CheckWitnessSignaccessEx(request *CheckWitnessSignaccessRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckWitnessSignaccessResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckWitnessSignaccessResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.witness.signaccess.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 见证流程签署
 * Summary: 见证流程签署
 */
func (client *Client) AuthWitnessFlow(request *AuthWitnessFlowRequest) (_result *AuthWitnessFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthWitnessFlowResponse{}
	_body, _err := client.AuthWitnessFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 见证流程签署
 * Summary: 见证流程签署
 */
func (client *Client) AuthWitnessFlowEx(request *AuthWitnessFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthWitnessFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthWitnessFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.witness.flow.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 见证流程签署确认
 * Summary: 见证流程签署确认
 */
func (client *Client) ConfirmWitnessFlow(request *ConfirmWitnessFlowRequest) (_result *ConfirmWitnessFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ConfirmWitnessFlowResponse{}
	_body, _err := client.ConfirmWitnessFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 见证流程签署确认
 * Summary: 见证流程签署确认
 */
func (client *Client) ConfirmWitnessFlowEx(request *ConfirmWitnessFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ConfirmWitnessFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmWitnessFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.witness.flow.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取存证事务ID
 * Summary: 获取存证事务ID
 */
func (client *Client) CreateTrans(request *CreateTransRequest) (_result *CreateTransResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateTransResponse{}
	_body, _err := client.CreateTransEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取存证事务ID
 * Summary: 获取存证事务ID
 */
func (client *Client) CreateTransEx(request *CreateTransRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateTransResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTransResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.trans.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过存证事务Token，获取事务中所有的存证信息
 * Summary: 获取事务中所有的存证信息
 */
func (client *Client) GetTrans(request *GetTransRequest) (_result *GetTransResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTransResponse{}
	_body, _err := client.GetTransEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过存证事务Token，获取事务中所有的存证信息
 * Summary: 获取事务中所有的存证信息
 */
func (client *Client) GetTransEx(request *GetTransRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTransResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTransResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.trans.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发起文本存证，将文本内容存证上链
 * Summary: 文本存证，将文本内容存证上链
 */
func (client *Client) CreateText(request *CreateTextRequest) (_result *CreateTextResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateTextResponse{}
	_body, _err := client.CreateTextEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发起文本存证，将文本内容存证上链
 * Summary: 文本存证，将文本内容存证上链
 */
func (client *Client) CreateTextEx(request *CreateTextRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateTextResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTextResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.text.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户通过交易哈希获取自己上传的文本存证内容
 * Summary: 获取文本存证内容
 */
func (client *Client) GetText(request *GetTextRequest) (_result *GetTextResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTextResponse{}
	_body, _err := client.GetTextEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户通过交易哈希获取自己上传的文本存证内容
 * Summary: 获取文本存证内容
 */
func (client *Client) GetTextEx(request *GetTextRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTextResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTextResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.text.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发起文件存证，将文件内容存证上链
 * Summary: 文件内容存证上链
 */
func (client *Client) CreateFile(request *CreateFileRequest) (_result *CreateFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateFileResponse{}
	_body, _err := client.CreateFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发起文件存证，将文件内容存证上链
 * Summary: 文件内容存证上链
 */
func (client *Client) CreateFileEx(request *CreateFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.file.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户通过交易哈希获取自己上传的文件存证oss下载地址
 * Summary: 获取文件存证oss下载地址
 */
func (client *Client) GetFile(request *GetFileRequest) (_result *GetFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetFileResponse{}
	_body, _err := client.GetFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户通过交易哈希获取自己上传的文件存证oss下载地址
 * Summary: 获取文件存证oss下载地址
 */
func (client *Client) GetFileEx(request *GetFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.file.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发起原文存证，将原文内容存证上链
 * Summary: 原文内容存证
 */
func (client *Client) CreateSource(request *CreateSourceRequest) (_result *CreateSourceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateSourceResponse{}
	_body, _err := client.CreateSourceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发起原文存证，将原文内容存证上链
 * Summary: 原文内容存证
 */
func (client *Client) CreateSourceEx(request *CreateSourceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateSourceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateSourceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.source.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户通过交易哈希获取自己上传的原文存证oss下载地址
 * Summary: 获取原文存证oss下载地址
 */
func (client *Client) GetSource(request *GetSourceRequest) (_result *GetSourceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetSourceResponse{}
	_body, _err := client.GetSourceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户通过交易哈希获取自己上传的原文存证oss下载地址
 * Summary: 获取原文存证oss下载地址
 */
func (client *Client) GetSourceEx(request *GetSourceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetSourceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetSourceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.source.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建存证后，使用存证凭据核验存证状态。
 * Summary: 存证内容核验
 */
func (client *Client) CheckStatus(request *CheckStatusRequest) (_result *CheckStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckStatusResponse{}
	_body, _err := client.CheckStatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建存证后，使用存证凭据核验存证状态。
 * Summary: 存证内容核验
 */
func (client *Client) CheckStatusEx(request *CheckStatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.status.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 融资服务平台部署合约
 * Summary: 融资服务平台部署合约
 */
func (client *Client) DeployLeaseContract(request *DeployLeaseContractRequest) (_result *DeployLeaseContractResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeployLeaseContractResponse{}
	_body, _err := client.DeployLeaseContractEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 融资服务平台部署合约
 * Summary: 融资服务平台部署合约
 */
func (client *Client) DeployLeaseContractEx(request *DeployLeaseContractRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeployLeaseContractResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeployLeaseContractResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.contract.deploy"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 融资服务平台上传商品类别信息
 * Summary: 融资服务平台上传商品类别信息
 */
func (client *Client) CreateLeaseProductinfo(request *CreateLeaseProductinfoRequest) (_result *CreateLeaseProductinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeaseProductinfoResponse{}
	_body, _err := client.CreateLeaseProductinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 融资服务平台上传商品类别信息
 * Summary: 融资服务平台上传商品类别信息
 */
func (client *Client) CreateLeaseProductinfoEx(request *CreateLeaseProductinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeaseProductinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeaseProductinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.productinfo.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 租赁服务平台授权融资服务平台
 * Summary: 租赁服务平台授权融资服务平台
 */
func (client *Client) AuthLeaseContract(request *AuthLeaseContractRequest) (_result *AuthLeaseContractResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthLeaseContractResponse{}
	_body, _err := client.AuthLeaseContractEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 租赁服务平台授权融资服务平台
 * Summary: 租赁服务平台授权融资服务平台
 */
func (client *Client) AuthLeaseContractEx(request *AuthLeaseContractRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthLeaseContractResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthLeaseContractResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.contract.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 租赁服务平台上传用户信息
 * Summary: 租赁服务平台上传用户信息
 */
func (client *Client) CreateLeaseUserinfo(request *CreateLeaseUserinfoRequest) (_result *CreateLeaseUserinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeaseUserinfoResponse{}
	_body, _err := client.CreateLeaseUserinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 租赁服务平台上传用户信息
 * Summary: 租赁服务平台上传用户信息
 */
func (client *Client) CreateLeaseUserinfoEx(request *CreateLeaseUserinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeaseUserinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeaseUserinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.userinfo.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 租赁服务平台上传订单产品/服务信息
 * Summary: 租赁服务平台上传订单产品/服务信息
 */
func (client *Client) CreateLeaseOrderinfo(request *CreateLeaseOrderinfoRequest) (_result *CreateLeaseOrderinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeaseOrderinfoResponse{}
	_body, _err := client.CreateLeaseOrderinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 租赁服务平台上传订单产品/服务信息
 * Summary: 租赁服务平台上传订单产品/服务信息
 */
func (client *Client) CreateLeaseOrderinfoEx(request *CreateLeaseOrderinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeaseOrderinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeaseOrderinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.orderinfo.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 租赁服务平台上传承诺信息
 * Summary: 租赁服务平台上传承诺信息
 */
func (client *Client) CreateLeasePromise(request *CreateLeasePromiseRequest) (_result *CreateLeasePromiseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeasePromiseResponse{}
	_body, _err := client.CreateLeasePromiseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 租赁服务平台上传承诺信息
 * Summary: 租赁服务平台上传承诺信息
 */
func (client *Client) CreateLeasePromiseEx(request *CreateLeasePromiseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeasePromiseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeasePromiseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.promise.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 融资平台上传租赁物购买贷款订单信息
 * Summary: 融资平台上传租赁物购买贷款订单信息
 */
func (client *Client) CreateLeaseVerifyinfo(request *CreateLeaseVerifyinfoRequest) (_result *CreateLeaseVerifyinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeaseVerifyinfoResponse{}
	_body, _err := client.CreateLeaseVerifyinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 融资平台上传租赁物购买贷款订单信息
 * Summary: 融资平台上传租赁物购买贷款订单信息
 */
func (client *Client) CreateLeaseVerifyinfoEx(request *CreateLeaseVerifyinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeaseVerifyinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeaseVerifyinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.verifyinfo.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 融资方上传承诺信息
 * Summary: 融资方上传承诺信息
 */
func (client *Client) CreateLeaseCreditpromise(request *CreateLeaseCreditpromiseRequest) (_result *CreateLeaseCreditpromiseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeaseCreditpromiseResponse{}
	_body, _err := client.CreateLeaseCreditpromiseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 融资方上传承诺信息
 * Summary: 融资方上传承诺信息
 */
func (client *Client) CreateLeaseCreditpromiseEx(request *CreateLeaseCreditpromiseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeaseCreditpromiseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeaseCreditpromiseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.creditpromise.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 租赁平台上传支用/还款信息
 * Summary: 租赁平台上传支用/还款信息
 */
func (client *Client) CreateLeaseDisburseinfo(request *CreateLeaseDisburseinfoRequest) (_result *CreateLeaseDisburseinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeaseDisburseinfoResponse{}
	_body, _err := client.CreateLeaseDisburseinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 租赁平台上传支用/还款信息
 * Summary: 租赁平台上传支用/还款信息
 */
func (client *Client) CreateLeaseDisburseinfoEx(request *CreateLeaseDisburseinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeaseDisburseinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeaseDisburseinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.disburseinfo.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description:  查询订单详细信息
 * Summary:  查询订单详细信息
 */
func (client *Client) QueryLeaseOrderinfo(request *QueryLeaseOrderinfoRequest) (_result *QueryLeaseOrderinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryLeaseOrderinfoResponse{}
	_body, _err := client.QueryLeaseOrderinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description:  查询订单详细信息
 * Summary:  查询订单详细信息
 */
func (client *Client) QueryLeaseOrderinfoEx(request *QueryLeaseOrderinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryLeaseOrderinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryLeaseOrderinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.orderinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建金融行业标准文本存证
 * Summary: 创建金融行业文本存证
 */
func (client *Client) CreateFinanceTextnotary(request *CreateFinanceTextnotaryRequest) (_result *CreateFinanceTextnotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateFinanceTextnotaryResponse{}
	_body, _err := client.CreateFinanceTextnotaryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建金融行业标准文本存证
 * Summary: 创建金融行业文本存证
 */
func (client *Client) CreateFinanceTextnotaryEx(request *CreateFinanceTextnotaryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateFinanceTextnotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateFinanceTextnotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.finance.textnotary.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取金融行业文本存证接口描述
 * Summary: 获取金融行业文本存证
 */
func (client *Client) GetFinanceTextnotary(request *GetFinanceTextnotaryRequest) (_result *GetFinanceTextnotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetFinanceTextnotaryResponse{}
	_body, _err := client.GetFinanceTextnotaryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取金融行业文本存证接口描述
 * Summary: 获取金融行业文本存证
 */
func (client *Client) GetFinanceTextnotaryEx(request *GetFinanceTextnotaryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetFinanceTextnotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetFinanceTextnotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.finance.textnotary.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建金融行业文件存证接口描述
 * Summary: 创建金融行业文件存证
 */
func (client *Client) CreateFinanceFilenotary(request *CreateFinanceFilenotaryRequest) (_result *CreateFinanceFilenotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateFinanceFilenotaryResponse{}
	_body, _err := client.CreateFinanceFilenotaryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建金融行业文件存证接口描述
 * Summary: 创建金融行业文件存证
 */
func (client *Client) CreateFinanceFilenotaryEx(request *CreateFinanceFilenotaryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateFinanceFilenotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateFinanceFilenotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.finance.filenotary.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取金融行业文件存证接口描述
 * Summary: 获取金融行业文件存证
 */
func (client *Client) GetFinanceFilenotary(request *GetFinanceFilenotaryRequest) (_result *GetFinanceFilenotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetFinanceFilenotaryResponse{}
	_body, _err := client.GetFinanceFilenotaryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取金融行业文件存证接口描述
 * Summary: 获取金融行业文件存证
 */
func (client *Client) GetFinanceFilenotaryEx(request *GetFinanceFilenotaryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetFinanceFilenotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetFinanceFilenotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.finance.filenotary.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 统一存证核验接口
 * Summary: 统一存证核验接口（已下架）
 */
func (client *Client) CheckIndustryNotary(request *CheckIndustryNotaryRequest) (_result *CheckIndustryNotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckIndustryNotaryResponse{}
	_body, _err := client.CheckIndustryNotaryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 统一存证核验接口
 * Summary: 统一存证核验接口（已下架）
 */
func (client *Client) CheckIndustryNotaryEx(request *CheckIndustryNotaryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckIndustryNotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckIndustryNotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.industry.notary.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 升级融资租赁合约
 * Summary: 升级融资租赁合约
 */
func (client *Client) UpdateLeaseContract(request *UpdateLeaseContractRequest) (_result *UpdateLeaseContractResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateLeaseContractResponse{}
	_body, _err := client.UpdateLeaseContractEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 升级融资租赁合约
 * Summary: 升级融资租赁合约
 */
func (client *Client) UpdateLeaseContractEx(request *UpdateLeaseContractRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateLeaseContractResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateLeaseContractResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.contract.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 违约案件信息提交服务
 * Summary: 违约案件信息提交服务
 */
func (client *Client) CreateSueBreakpromiseinfo(request *CreateSueBreakpromiseinfoRequest) (_result *CreateSueBreakpromiseinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateSueBreakpromiseinfoResponse{}
	_body, _err := client.CreateSueBreakpromiseinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 违约案件信息提交服务
 * Summary: 违约案件信息提交服务
 */
func (client *Client) CreateSueBreakpromiseinfoEx(request *CreateSueBreakpromiseinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateSueBreakpromiseinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateSueBreakpromiseinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.sue.breakpromiseinfo.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 违约案件信息修改服务
 * Summary: 违约案件信息修改服务
 */
func (client *Client) UpdateSueBreakpromiseinfo(request *UpdateSueBreakpromiseinfoRequest) (_result *UpdateSueBreakpromiseinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateSueBreakpromiseinfoResponse{}
	_body, _err := client.UpdateSueBreakpromiseinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 违约案件信息修改服务
 * Summary: 违约案件信息修改服务
 */
func (client *Client) UpdateSueBreakpromiseinfoEx(request *UpdateSueBreakpromiseinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateSueBreakpromiseinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateSueBreakpromiseinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.sue.breakpromiseinfo.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 违约案件信息删除服务
 * Summary: 违约案件信息删除服务
 */
func (client *Client) DeleteSueBreakpromiseinfo(request *DeleteSueBreakpromiseinfoRequest) (_result *DeleteSueBreakpromiseinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteSueBreakpromiseinfoResponse{}
	_body, _err := client.DeleteSueBreakpromiseinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 违约案件信息删除服务
 * Summary: 违约案件信息删除服务
 */
func (client *Client) DeleteSueBreakpromiseinfoEx(request *DeleteSueBreakpromiseinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteSueBreakpromiseinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteSueBreakpromiseinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.sue.breakpromiseinfo.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询惩戒信息
 * Summary: 查询惩戒信息
 */
func (client *Client) QuerySueUserinfo(request *QuerySueUserinfoRequest) (_result *QuerySueUserinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySueUserinfoResponse{}
	_body, _err := client.QuerySueUserinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询惩戒信息
 * Summary: 查询惩戒信息
 */
func (client *Client) QuerySueUserinfoEx(request *QuerySueUserinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySueUserinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySueUserinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.sue.userinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 升级用户管理合约
 * Summary: 升级用户管理合约
 */
func (client *Client) UpdateSueExeplarycontract(request *UpdateSueExeplarycontractRequest) (_result *UpdateSueExeplarycontractResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateSueExeplarycontractResponse{}
	_body, _err := client.UpdateSueExeplarycontractEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 升级用户管理合约
 * Summary: 升级用户管理合约
 */
func (client *Client) UpdateSueExeplarycontractEx(request *UpdateSueExeplarycontractRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateSueExeplarycontractResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateSueExeplarycontractResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.sue.exeplarycontract.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 回退用户管理合约
 * Summary: 回退用户管理合约
 */
func (client *Client) UpdateSueExemplaryrevert(request *UpdateSueExemplaryrevertRequest) (_result *UpdateSueExemplaryrevertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateSueExemplaryrevertResponse{}
	_body, _err := client.UpdateSueExemplaryrevertEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 回退用户管理合约
 * Summary: 回退用户管理合约
 */
func (client *Client) UpdateSueExemplaryrevertEx(request *UpdateSueExemplaryrevertRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateSueExemplaryrevertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateSueExemplaryrevertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.sue.exemplaryrevert.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 融资平台审核订单信息
 * Summary: 融资平台审核订单信息
 */
func (client *Client) CreateLeaseAudit(request *CreateLeaseAuditRequest) (_result *CreateLeaseAuditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeaseAuditResponse{}
	_body, _err := client.CreateLeaseAuditEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 融资平台审核订单信息
 * Summary: 融资平台审核订单信息
 */
func (client *Client) CreateLeaseAuditEx(request *CreateLeaseAuditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeaseAuditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeaseAuditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.audit.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 租赁平台上传付款通知信息
 * Summary: 租赁平台上传付款通知信息
 */
func (client *Client) CreateLeasePaymentfile(request *CreateLeasePaymentfileRequest) (_result *CreateLeasePaymentfileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeasePaymentfileResponse{}
	_body, _err := client.CreateLeasePaymentfileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 租赁平台上传付款通知信息
 * Summary: 租赁平台上传付款通知信息
 */
func (client *Client) CreateLeasePaymentfileEx(request *CreateLeasePaymentfileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeasePaymentfileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeasePaymentfileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.paymentfile.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 租赁系统上传租金归还记录 分期调用
 * Summary: 租赁系统上传租金归还记录 分期调用
 */
func (client *Client) CreateLeaseRental(request *CreateLeaseRentalRequest) (_result *CreateLeaseRentalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeaseRentalResponse{}
	_body, _err := client.CreateLeaseRentalEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 租赁系统上传租金归还记录 分期调用
 * Summary: 租赁系统上传租金归还记录 分期调用
 */
func (client *Client) CreateLeaseRentalEx(request *CreateLeaseRentalRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeaseRentalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeaseRentalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.rental.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 清分服务机构上传资金清算记录，分期
 * Summary: 清分服务机构上传资金清算记录，分期
 */
func (client *Client) CreateLeaseClearing(request *CreateLeaseClearingRequest) (_result *CreateLeaseClearingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeaseClearingResponse{}
	_body, _err := client.CreateLeaseClearingEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 清分服务机构上传资金清算记录，分期
 * Summary: 清分服务机构上传资金清算记录，分期
 */
func (client *Client) CreateLeaseClearingEx(request *CreateLeaseClearingRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeaseClearingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeaseClearingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.clearing.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 融资金融机构上传还款信息 每期
 * Summary: 融资金融机构上传还款信息 每期
 */
func (client *Client) CreateLeaseRepayment(request *CreateLeaseRepaymentRequest) (_result *CreateLeaseRepaymentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeaseRepaymentResponse{}
	_body, _err := client.CreateLeaseRepaymentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 融资金融机构上传还款信息 每期
 * Summary: 融资金融机构上传还款信息 每期
 */
func (client *Client) CreateLeaseRepaymentEx(request *CreateLeaseRepaymentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeaseRepaymentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeaseRepaymentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.repayment.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 融资租赁通知系统注册
 * Summary: 融资租赁通知系统注册
 */
func (client *Client) CreateLeaseNotifyregister(request *CreateLeaseNotifyregisterRequest) (_result *CreateLeaseNotifyregisterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeaseNotifyregisterResponse{}
	_body, _err := client.CreateLeaseNotifyregisterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 融资租赁通知系统注册
 * Summary: 融资租赁通知系统注册
 */
func (client *Client) CreateLeaseNotifyregisterEx(request *CreateLeaseNotifyregisterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeaseNotifyregisterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeaseNotifyregisterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.notifyregister.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据imeiID查询iot设备的详情
 * Summary: 根据imeiID查询iot设备的详情
 */
func (client *Client) QueryLeaseIotinfo(request *QueryLeaseIotinfoRequest) (_result *QueryLeaseIotinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryLeaseIotinfoResponse{}
	_body, _err := client.QueryLeaseIotinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据imeiID查询iot设备的详情
 * Summary: 根据imeiID查询iot设备的详情
 */
func (client *Client) QueryLeaseIotinfoEx(request *QueryLeaseIotinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryLeaseIotinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryLeaseIotinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.iotinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建法院通用文本存证
 * Summary: 法院通用文本存证创建接口
 */
func (client *Client) CreateCourtTextnotary(request *CreateCourtTextnotaryRequest) (_result *CreateCourtTextnotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateCourtTextnotaryResponse{}
	_body, _err := client.CreateCourtTextnotaryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建法院通用文本存证
 * Summary: 法院通用文本存证创建接口
 */
func (client *Client) CreateCourtTextnotaryEx(request *CreateCourtTextnotaryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateCourtTextnotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateCourtTextnotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.court.textnotary.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取法院通用文本存证
 * Summary: 法院通用文本存证获取接口
 */
func (client *Client) GetCourtTextnotary(request *GetCourtTextnotaryRequest) (_result *GetCourtTextnotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetCourtTextnotaryResponse{}
	_body, _err := client.GetCourtTextnotaryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取法院通用文本存证
 * Summary: 法院通用文本存证获取接口
 */
func (client *Client) GetCourtTextnotaryEx(request *GetCourtTextnotaryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetCourtTextnotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetCourtTextnotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.court.textnotary.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建法院通用文件存证接口
 * Summary: 法院通用文件存证创建接口
 */
func (client *Client) CreateCourtFilenotary(request *CreateCourtFilenotaryRequest) (_result *CreateCourtFilenotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateCourtFilenotaryResponse{}
	_body, _err := client.CreateCourtFilenotaryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建法院通用文件存证接口
 * Summary: 法院通用文件存证创建接口
 */
func (client *Client) CreateCourtFilenotaryEx(request *CreateCourtFilenotaryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateCourtFilenotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateCourtFilenotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.court.filenotary.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取法院通用文件存证
 * Summary: 法院通用文件存证获取接口
 */
func (client *Client) GetCourtFilenotary(request *GetCourtFilenotaryRequest) (_result *GetCourtFilenotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetCourtFilenotaryResponse{}
	_body, _err := client.GetCourtFilenotaryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取法院通用文件存证
 * Summary: 法院通用文件存证获取接口
 */
func (client *Client) GetCourtFilenotaryEx(request *GetCourtFilenotaryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetCourtFilenotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetCourtFilenotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.court.filenotary.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 融资租赁定制化统一入口
 * Summary: 融资租赁定制化统一入口
 */
func (client *Client) CreateLeaseRoute(request *CreateLeaseRouteRequest) (_result *CreateLeaseRouteResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeaseRouteResponse{}
	_body, _err := client.CreateLeaseRouteEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 融资租赁定制化统一入口
 * Summary: 融资租赁定制化统一入口
 */
func (client *Client) CreateLeaseRouteEx(request *CreateLeaseRouteRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeaseRouteResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeaseRouteResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.route.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密
 * Summary: 查询用户等加密信息
 */
func (client *Client) QueryLeaseEncryptedinfo(request *QueryLeaseEncryptedinfoRequest) (_result *QueryLeaseEncryptedinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryLeaseEncryptedinfoResponse{}
	_body, _err := client.QueryLeaseEncryptedinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密
 * Summary: 查询用户等加密信息
 */
func (client *Client) QueryLeaseEncryptedinfoEx(request *QueryLeaseEncryptedinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryLeaseEncryptedinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryLeaseEncryptedinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.encryptedinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 电子合同文本存证
 * Summary: 电子合同文本存证
 */
func (client *Client) CreateContractText(request *CreateContractTextRequest) (_result *CreateContractTextResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateContractTextResponse{}
	_body, _err := client.CreateContractTextEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 电子合同文本存证
 * Summary: 电子合同文本存证
 */
func (client *Client) CreateContractTextEx(request *CreateContractTextRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateContractTextResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateContractTextResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.text.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 全流程存证后，批量提交全流程核验信息，申请出证报告授权码。成功后可生成全流程上链报告
 * Summary: 申请电子合同存证报告
 */
func (client *Client) ApplyContractReport(request *ApplyContractReportRequest) (_result *ApplyContractReportResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyContractReportResponse{}
	_body, _err := client.ApplyContractReportEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 全流程存证后，批量提交全流程核验信息，申请出证报告授权码。成功后可生成全流程上链报告
 * Summary: 申请电子合同存证报告
 */
func (client *Client) ApplyContractReportEx(request *ApplyContractReportRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyContractReportResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyContractReportResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.report.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 下载合同存证某个环节的内容，得到存证信息对象最终上链的JSON序列化形式，该内容可用于统一核验
 * Summary: 下载合同存证
 */
func (client *Client) GetContractText(request *GetContractTextRequest) (_result *GetContractTextResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetContractTextResponse{}
	_body, _err := client.GetContractTextEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 下载合同存证某个环节的内容，得到存证信息对象最终上链的JSON序列化形式，该内容可用于统一核验
 * Summary: 下载合同存证
 */
func (client *Client) GetContractTextEx(request *GetContractTextRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetContractTextResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetContractTextResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.text.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取存证事务ID内部接口
 * Summary: 获取存证事务ID内部接口
 */
func (client *Client) CreateInternalTrans(request *CreateInternalTransRequest) (_result *CreateInternalTransResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateInternalTransResponse{}
	_body, _err := client.CreateInternalTransEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取存证事务ID内部接口
 * Summary: 获取存证事务ID内部接口
 */
func (client *Client) CreateInternalTransEx(request *CreateInternalTransRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateInternalTransResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateInternalTransResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.internal.trans.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 文本存证内部接口，将文本内容存证上链
 * Summary: 文本存证内部接口，将文本内容存证上链
 */
func (client *Client) CreateInternalText(request *CreateInternalTextRequest) (_result *CreateInternalTextResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateInternalTextResponse{}
	_body, _err := client.CreateInternalTextEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 文本存证内部接口，将文本内容存证上链
 * Summary: 文本存证内部接口，将文本内容存证上链
 */
func (client *Client) CreateInternalTextEx(request *CreateInternalTextRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateInternalTextResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateInternalTextResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.internal.text.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发起文本存证，将文本内容存证上链，租赁业务专用。
 * Summary: 租赁业务文本存证，将文本内容存证上链
 */
func (client *Client) CreateLeaseText(request *CreateLeaseTextRequest) (_result *CreateLeaseTextResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeaseTextResponse{}
	_body, _err := client.CreateLeaseTextEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发起文本存证，将文本内容存证上链，租赁业务专用。
 * Summary: 租赁业务文本存证，将文本内容存证上链
 */
func (client *Client) CreateLeaseTextEx(request *CreateLeaseTextRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeaseTextResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeaseTextResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.text.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发起文件存证，将文件内容存证上链，租赁业务专用。
 * Summary: 租赁业务文件内容存证上链
 */
func (client *Client) CreateLeaseFile(request *CreateLeaseFileRequest) (_result *CreateLeaseFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeaseFileResponse{}
	_body, _err := client.CreateLeaseFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发起文件存证，将文件内容存证上链，租赁业务专用。
 * Summary: 租赁业务文件内容存证上链
 */
func (client *Client) CreateLeaseFileEx(request *CreateLeaseFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeaseFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeaseFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.file.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 使用接口查询订单存证的信息，需要在完成订单回传后才可返回。获取到txhash后，用户可使用 获取文本存证、存证核验 等存证服务功能。
 * Summary: 租赁业务获取订单存证列表
 */
func (client *Client) ListLeaseNotary(request *ListLeaseNotaryRequest) (_result *ListLeaseNotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListLeaseNotaryResponse{}
	_body, _err := client.ListLeaseNotaryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 使用接口查询订单存证的信息，需要在完成订单回传后才可返回。获取到txhash后，用户可使用 获取文本存证、存证核验 等存证服务功能。
 * Summary: 租赁业务获取订单存证列表
 */
func (client *Client) ListLeaseNotaryEx(request *ListLeaseNotaryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListLeaseNotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListLeaseNotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.notary.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询融资租赁application
 * Summary: 查询融资租赁application
 */
func (client *Client) QueryLeaseApplication(request *QueryLeaseApplicationRequest) (_result *QueryLeaseApplicationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryLeaseApplicationResponse{}
	_body, _err := client.QueryLeaseApplicationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询融资租赁application
 * Summary: 查询融资租赁application
 */
func (client *Client) QueryLeaseApplicationEx(request *QueryLeaseApplicationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryLeaseApplicationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryLeaseApplicationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.application.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询融资租赁application的定义详情
 * Summary: 查询application的定义详情
 */
func (client *Client) QueryLeaseApplicationdetailinfo(request *QueryLeaseApplicationdetailinfoRequest) (_result *QueryLeaseApplicationdetailinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryLeaseApplicationdetailinfoResponse{}
	_body, _err := client.QueryLeaseApplicationdetailinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询融资租赁application的定义详情
 * Summary: 查询application的定义详情
 */
func (client *Client) QueryLeaseApplicationdetailinfoEx(request *QueryLeaseApplicationdetailinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryLeaseApplicationdetailinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryLeaseApplicationdetailinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.applicationdetailinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 融资租赁资方重置订单状态
 * Summary: 融资租赁资方重置订单状态
 */
func (client *Client) SetLeaseRepaymentstatus(request *SetLeaseRepaymentstatusRequest) (_result *SetLeaseRepaymentstatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SetLeaseRepaymentstatusResponse{}
	_body, _err := client.SetLeaseRepaymentstatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 融资租赁资方重置订单状态
 * Summary: 融资租赁资方重置订单状态
 */
func (client *Client) SetLeaseRepaymentstatusEx(request *SetLeaseRepaymentstatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SetLeaseRepaymentstatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SetLeaseRepaymentstatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.repaymentstatus.set"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 供应商上传采购等相关信息
 * Summary: 供应商上传采购等相关信息
 */
func (client *Client) CreateLeaseSupplierinfo(request *CreateLeaseSupplierinfoRequest) (_result *CreateLeaseSupplierinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeaseSupplierinfoResponse{}
	_body, _err := client.CreateLeaseSupplierinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 供应商上传采购等相关信息
 * Summary: 供应商上传采购等相关信息
 */
func (client *Client) CreateLeaseSupplierinfoEx(request *CreateLeaseSupplierinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeaseSupplierinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeaseSupplierinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.supplierinfo.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: mytf的tapp部署
 * Summary: mytf的tapp部署
 */
func (client *Client) DeployMytfTapp(request *DeployMytfTappRequest) (_result *DeployMytfTappResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeployMytfTappResponse{}
	_body, _err := client.DeployMytfTappEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: mytf的tapp部署
 * Summary: mytf的tapp部署
 */
func (client *Client) DeployMytfTappEx(request *DeployMytfTappRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeployMytfTappResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeployMytfTappResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.mytf.tapp.deploy"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 供应商更新物流状态、签收记录等信息
 * Summary: 供应商更新物流状态、签收记录等信息
 */
func (client *Client) CreateLeaseSupplierdynamicinfo(request *CreateLeaseSupplierdynamicinfoRequest) (_result *CreateLeaseSupplierdynamicinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeaseSupplierdynamicinfoResponse{}
	_body, _err := client.CreateLeaseSupplierdynamicinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 供应商更新物流状态、签收记录等信息
 * Summary: 供应商更新物流状态、签收记录等信息
 */
func (client *Client) CreateLeaseSupplierdynamicinfoEx(request *CreateLeaseSupplierdynamicinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeaseSupplierdynamicinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeaseSupplierdynamicinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.supplierdynamicinfo.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建租赁订单相关信息，融资租赁的前置条件
 * Summary: 创建租赁订单相关信息，融资租赁的前置条件
 */
func (client *Client) CreateLeaseBiz(request *CreateLeaseBizRequest) (_result *CreateLeaseBizResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeaseBizResponse{}
	_body, _err := client.CreateLeaseBizEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建租赁订单相关信息，融资租赁的前置条件
 * Summary: 创建租赁订单相关信息，融资租赁的前置条件
 */
func (client *Client) CreateLeaseBizEx(request *CreateLeaseBizRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeaseBizResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeaseBizResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.biz.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询核验结果
 * Summary: 查询核验结果
 */
func (client *Client) QueryLeaseProof(request *QueryLeaseProofRequest) (_result *QueryLeaseProofResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryLeaseProofResponse{}
	_body, _err := client.QueryLeaseProofEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询核验结果
 * Summary: 查询核验结果
 */
func (client *Client) QueryLeaseProofEx(request *QueryLeaseProofRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryLeaseProofResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryLeaseProofResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.proof.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发起文件存证，将文件内容存证上链，可存证10M以内的文件
 * Summary: 大文件内容存证接口
 */
func (client *Client) CreateLargefile(request *CreateLargefileRequest) (_result *CreateLargefileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLargefileResponse{}
	_body, _err := client.CreateLargefileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发起文件存证，将文件内容存证上链，可存证10M以内的文件
 * Summary: 大文件内容存证接口
 */
func (client *Client) CreateLargefileEx(request *CreateLargefileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLargefileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLargefileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.largefile.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 租赁平台查询接口
 * Summary: 租赁平台查询接口
 */
func (client *Client) QueryLeaseBiz(request *QueryLeaseBizRequest) (_result *QueryLeaseBizResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryLeaseBizResponse{}
	_body, _err := client.QueryLeaseBizEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 租赁平台查询接口
 * Summary: 租赁平台查询接口
 */
func (client *Client) QueryLeaseBizEx(request *QueryLeaseBizRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryLeaseBizResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryLeaseBizResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.biz.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 租赁宝哈希存证
 * Summary: 租赁宝哈希存证
 */
func (client *Client) CreateLeaseBiznotary(request *CreateLeaseBiznotaryRequest) (_result *CreateLeaseBiznotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeaseBiznotaryResponse{}
	_body, _err := client.CreateLeaseBiznotaryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 租赁宝哈希存证
 * Summary: 租赁宝哈希存证
 */
func (client *Client) CreateLeaseBiznotaryEx(request *CreateLeaseBiznotaryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeaseBiznotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeaseBiznotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.biznotary.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 合同内部文本存证
 * Summary: 合同内部文本存证
 */
func (client *Client) CreateInternalContract(request *CreateInternalContractRequest) (_result *CreateInternalContractResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateInternalContractResponse{}
	_body, _err := client.CreateInternalContractEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 合同内部文本存证
 * Summary: 合同内部文本存证
 */
func (client *Client) CreateInternalContractEx(request *CreateInternalContractRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateInternalContractResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateInternalContractResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.internal.contract.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资方上传网商直付通代扣协议核验结果
 * Summary: 资方上传网商直付通代扣协议核验结果
 */
func (client *Client) CreateLeaseZftagreementsign(request *CreateLeaseZftagreementsignRequest) (_result *CreateLeaseZftagreementsignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeaseZftagreementsignResponse{}
	_body, _err := client.CreateLeaseZftagreementsignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资方上传网商直付通代扣协议核验结果
 * Summary: 资方上传网商直付通代扣协议核验结果
 */
func (client *Client) CreateLeaseZftagreementsignEx(request *CreateLeaseZftagreementsignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeaseZftagreementsignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeaseZftagreementsignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.zftagreementsign.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资方上传网商直付通代扣协议解约相关信息
 * Summary: 资方上传网商直付通代扣协议解约相关信息
 */
func (client *Client) CreateLeaseZftagreementunsign(request *CreateLeaseZftagreementunsignRequest) (_result *CreateLeaseZftagreementunsignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeaseZftagreementunsignResponse{}
	_body, _err := client.CreateLeaseZftagreementunsignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资方上传网商直付通代扣协议解约相关信息
 * Summary: 资方上传网商直付通代扣协议解约相关信息
 */
func (client *Client) CreateLeaseZftagreementunsignEx(request *CreateLeaseZftagreementunsignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeaseZftagreementunsignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeaseZftagreementunsignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.zftagreementunsign.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取区块链合同存证证明
 * Summary: 获取区块链合同存证证明
 */
func (client *Client) GetContractCertificate(request *GetContractCertificateRequest) (_result *GetContractCertificateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetContractCertificateResponse{}
	_body, _err := client.GetContractCertificateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取区块链合同存证证明
 * Summary: 获取区块链合同存证证明
 */
func (client *Client) GetContractCertificateEx(request *GetContractCertificateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetContractCertificateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetContractCertificateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.certificate.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取蚂蚁链版存证证明
 * Summary: 获取蚂蚁链版存证证明
 */
func (client *Client) GetCertificateDetail(request *GetCertificateDetailRequest) (_result *GetCertificateDetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetCertificateDetailResponse{}
	_body, _err := client.GetCertificateDetailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取蚂蚁链版存证证明
 * Summary: 获取蚂蚁链版存证证明
 */
func (client *Client) GetCertificateDetailEx(request *GetCertificateDetailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetCertificateDetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetCertificateDetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.certificate.detail.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
