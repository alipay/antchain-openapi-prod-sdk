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

// 签字人
type ContractFlowSigner struct {
	// 签署人账号id
	SignerAccountId *string `json:"signer_account_id,omitempty" xml:"signer_account_id,omitempty"`
	// 签约主体的账号id（个人/企业）；如签署人本签署，则返回签署人账号id；如签署人代机构签署，则返回机构账号id
	SignerAuthorizedAccountId *string `json:"signer_authorized_account_id,omitempty" xml:"signer_authorized_account_id,omitempty"`
	// 签约主体名称
	SignerAuthorizedAccountName *string `json:"signer_authorized_account_name,omitempty" xml:"signer_authorized_account_name,omitempty"`
	// 签署主体是否已实名
	SignerAuthorizedAccountRealName *bool `json:"signer_authorized_account_real_name,omitempty" xml:"signer_authorized_account_real_name,omitempty"`
	// 签署主体类型, 0-个人, 1-机构
	SignerAuthorizedAccountType *int64 `json:"signer_authorized_account_type,omitempty" xml:"signer_authorized_account_type,omitempty"`
	// 签署人名称
	SignerName *string `json:"signer_name,omitempty" xml:"signer_name,omitempty"`
	// 签署人是否已实名
	SignerRealName *bool `json:"signer_real_name,omitempty" xml:"signer_real_name,omitempty"`
	// 签署顺序
	SignOrder *int64 `json:"sign_order,omitempty" xml:"sign_order,omitempty"`
	// 签署状态, 0-待签, 1-未签, 2-已签 3-待审批 4-拒签
	SignStatus *int64 `json:"sign_status,omitempty" xml:"sign_status,omitempty"`
	// 本次签署任务对应指定的第三方业务流水号id，当存在多个第三方业务流水号id时，返回多个，并逗号隔开
	ThirdOrderNo *string `json:"third_order_no,omitempty" xml:"third_order_no,omitempty"`
}

func (s ContractFlowSigner) String() string {
	return tea.Prettify(s)
}

func (s ContractFlowSigner) GoString() string {
	return s.String()
}

func (s *ContractFlowSigner) SetSignerAccountId(v string) *ContractFlowSigner {
	s.SignerAccountId = &v
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

func (s *ContractFlowSigner) SetSignerName(v string) *ContractFlowSigner {
	s.SignerName = &v
	return s
}

func (s *ContractFlowSigner) SetSignerRealName(v bool) *ContractFlowSigner {
	s.SignerRealName = &v
	return s
}

func (s *ContractFlowSigner) SetSignOrder(v int64) *ContractFlowSigner {
	s.SignOrder = &v
	return s
}

func (s *ContractFlowSigner) SetSignStatus(v int64) *ContractFlowSigner {
	s.SignStatus = &v
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
	// 应用ID
	ApplicationCode *string `json:"application_code,omitempty" xml:"application_code,omitempty"`
	// 哈希算法, notary_type 为 HASH 时此参数必填
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty"`
	// 存证内容
	NotaryContent *string `json:"notary_content,omitempty" xml:"notary_content,omitempty"`
	// 交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
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

func (s *NotaryCheckMeta) SetApplicationCode(v string) *NotaryCheckMeta {
	s.ApplicationCode = &v
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

// 供应商对应的产品详细信息
type SupplierProductInfo struct {
	// 产品额外信息
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 产品id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
	// 电子商品唯一标识码
	ProductImeiId *string `json:"product_imei_id,omitempty" xml:"product_imei_id,omitempty"`
	// 产品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" maxLength:"50" minLength:"1"`
	// 采购产品的个数
	ProductNumber *int64 `json:"product_number,omitempty" xml:"product_number,omitempty"`
	// 采购产品的价格，精确到毫厘，如12.34元表示为123400
	ProductPrice *int64 `json:"product_price,omitempty" xml:"product_price,omitempty"`
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
	// 经办人证件类型，企业认证选填
	AgentCertType *string `json:"agent_cert_type,omitempty" xml:"agent_cert_type,omitempty"`
	// 经办人身份证，企业认证选填
	AgentId *string `json:"agent_id,omitempty" xml:"agent_id,omitempty"`
	// 用户名称
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 证件号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 证件类型，个人只支持身份证IDENTITY_CARD，企业支持UNIFIED_SOCIAL_CREDIT_CODE（统一社会信用代码）和ENTERPRISE_REGISTERED_NUMBER（企业工商注册号）
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty"`
	// 法人姓名，企业认证必选
	LegalPerson *string `json:"legal_person,omitempty" xml:"legal_person,omitempty"`
	// 法人证件类型，企业认证必选
	LegalPersonCertType *string `json:"legal_person_cert_type,omitempty" xml:"legal_person_cert_type,omitempty"`
	// 法人身份证，企业认证必选
	LegalPersonId *string `json:"legal_person_id,omitempty" xml:"legal_person_id,omitempty"`
	// 用户手机号码
	MobileNo *string `json:"mobile_no,omitempty" xml:"mobile_no,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 用户类型，PERSON或者ENTERPRISE
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty"`
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

func (s *Identity) SetAgentCertType(v string) *Identity {
	s.AgentCertType = &v
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

func (s *Identity) SetLegalPersonCertType(v string) *Identity {
	s.LegalPersonCertType = &v
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

// 电子合同文档的下载地址
type ContractDocAddress struct {
	// 电子合同文档ID
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 电子合同文档名称，默认文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// 电子合同下载文档地址, 有效时间1小时
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty"`
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

// 融资租赁订单额外信息
type LeaseOrderExtra struct {
	// 额外信息的主键
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// 额外信息的值
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
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
	PosPage *string `json:"pos_page,omitempty" xml:"pos_page,omitempty"`
	// x坐标转为字符串的值，默认空
	PosX *string `json:"pos_x,omitempty" xml:"pos_x,omitempty"`
	// y坐标转为字符串的值
	PosY *string `json:"pos_y,omitempty" xml:"pos_y,omitempty"`
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
	// 区块哈希
	BlockHash *string `json:"block_hash,omitempty" xml:"block_hash,omitempty"`
	// 存证所在区块高度
	BlockHeight *int64 `json:"block_height,omitempty" xml:"block_height,omitempty" minimum:"undefined"`
	// 核验结果错误码
	ErrorCode *int64 `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 错误信息
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// 存证时间
	NotaryTime *string `json:"notary_time,omitempty" xml:"notary_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 存证类型
	NotaryType *string `json:"notary_type,omitempty" xml:"notary_type,omitempty"`
	// 存证阶段
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 核验是否成功
	Result *bool `json:"result,omitempty" xml:"result,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s NotaryCheckResult) String() string {
	return tea.Prettify(s)
}

func (s NotaryCheckResult) GoString() string {
	return s.String()
}

func (s *NotaryCheckResult) SetBlockHash(v string) *NotaryCheckResult {
	s.BlockHash = &v
	return s
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

func (s *NotaryCheckResult) SetPhase(v string) *NotaryCheckResult {
	s.Phase = &v
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

// 电子合同签署盖章区
type ContractSignField struct {
	// 电子合同用户ID
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 电子合同文档ID
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 电子合同签署区id
	SignfieldId *string `json:"signfield_id,omitempty" xml:"signfield_id,omitempty"`
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
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 电子合同文件hash，可能一次性签署多个文件，不同文件的hash间用“,”分隔开
	ContractHash *string `json:"contract_hash,omitempty" xml:"contract_hash,omitempty"`
	// 签署人ID
	Signatory *string `json:"signatory,omitempty" xml:"signatory,omitempty"`
	// 存证阶段发生时间，UNIX时间戳(毫秒)
	Timestamp *string `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
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

// 智能合同机构账户创建申请信息
type ContractOrganizationApplication struct {
	// 证件号
	IdNumber *string `json:"id_number,omitempty" xml:"id_number,omitempty"`
	// 证件类型，默认CRED_ORG_USCC，详见机构证件类型说明 （https://tech.antfin.com/docs/2/155166）
	IdType *string `json:"id_type,omitempty" xml:"id_type,omitempty"`
	// 企业法人名称
	LegalPerson *string `json:"legal_person,omitempty" xml:"legal_person,omitempty"`
	// 企业法人证件号
	LegalPersonId *string `json:"legal_person_id,omitempty" xml:"legal_person_id,omitempty"`
	// 机构名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
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
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 签署文件份数
	FileNum *int64 `json:"file_num,omitempty" xml:"file_num,omitempty"`
	// 发起人ID
	Initiator *string `json:"initiator,omitempty" xml:"initiator,omitempty"`
	// 签署人ID（支持多个，不同ID间用“,”分隔开）
	Signatories *string `json:"signatories,omitempty" xml:"signatories,omitempty"`
	// 存证阶段发生时间，UNIX时间戳(毫秒)
	Timestamp *string `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
	// 存证凭据，仅在批量核验时需要填写
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
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

// 创建电子合同签署盖章区时的申请信息
type ContractSignFieldApplication struct {
	// 是否添加签署时间戳，默认不添加，时间格式如"2019-03-11 10:12:12"
	AddSignTime *bool `json:"add_sign_time,omitempty" xml:"add_sign_time,omitempty"`
	// 签约主体账号标识， 将使用该主体账号对应的数字证书完成本次签署，如：当存在签署操作人代某机构签署时，需要传入该机构的账号id
	AuthorizedAccountId *string `json:"authorized_account_id,omitempty" xml:"authorized_account_id,omitempty"`
	// 电子合同文件ID
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 签署区顺序，默认1,且不小于1，顺序越小越先处理
	Order *int64 `json:"order,omitempty" xml:"order,omitempty"`
	// 页码信息
	PosPage *string `json:"pos_page,omitempty" xml:"pos_page,omitempty"`
	// x坐标转为字符串的值，默认空
	PosX *string `json:"pos_x,omitempty" xml:"pos_x,omitempty"`
	// y坐标转为字符串的值
	PosY *string `json:"pos_y,omitempty" xml:"pos_y,omitempty"`
	// 印章id ，如不传，则采用账号下的默认印章
	SealId *string `json:"seal_id,omitempty" xml:"seal_id,omitempty"`
	// 第三方业务流水号id，保证相同签署人、相同签约主体、相同签署顺序的任务，对应的第三方业务流水id唯一，默认空
	ThirdOrderNo *string `json:"third_order_no,omitempty" xml:"third_order_no,omitempty"`
	// 签署区宽，默认印章宽度
	Width *string `json:"width,omitempty" xml:"width,omitempty"`
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

// 创建电子合同手动签署盖章区时的申请信息
type ContractHandSignFieldApplication struct {
	// 签署操作人个人账号标识，即操作本次签署的个人，如需通知用户签署，则系统向该账号下绑定的手机、邮箱发送签署链接
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 电子合同文件ID
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 签署区顺序，默认1,且不小于1，顺序越小越先处理
	Order *int64 `json:"order,omitempty" xml:"order,omitempty"`
	// 页码信息，当签署区signType为2时, 页码可以'-'分割, 其他情况只能是数字
	PosPage *string `json:"pos_page,omitempty" xml:"pos_page,omitempty"`
	// x坐标
	PosX *string `json:"pos_x,omitempty" xml:"pos_x,omitempty"`
	// y坐标
	PosY *string `json:"pos_y,omitempty" xml:"pos_y,omitempty"`
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

// 融资租赁商品出租详细信息
type RentInfo struct {
	// 买断价
	BuyoutPrice *int64 `json:"buyout_price,omitempty" xml:"buyout_price,omitempty"`
	// 手续费
	Commission *int64 `json:"commission,omitempty" xml:"commission,omitempty"`
	// 租金
	RentPrice *int64 `json:"rent_price,omitempty" xml:"rent_price,omitempty"`
	// 租期
	RentTerm *int64 `json:"rent_term,omitempty" xml:"rent_term,omitempty"`
	// 留购价
	RetainedPrice *int64 `json:"retained_price,omitempty" xml:"retained_price,omitempty"`
}

func (s RentInfo) String() string {
	return tea.Prettify(s)
}

func (s RentInfo) GoString() string {
	return s.String()
}

func (s *RentInfo) SetBuyoutPrice(v int64) *RentInfo {
	s.BuyoutPrice = &v
	return s
}

func (s *RentInfo) SetCommission(v int64) *RentInfo {
	s.Commission = &v
	return s
}

func (s *RentInfo) SetRentPrice(v int64) *RentInfo {
	s.RentPrice = &v
	return s
}

func (s *RentInfo) SetRentTerm(v int64) *RentInfo {
	s.RentTerm = &v
	return s
}

func (s *RentInfo) SetRetainedPrice(v int64) *RentInfo {
	s.RetainedPrice = &v
	return s
}

// 存证信息说明
type NotaryInfo struct {
	// 存证内容的哈希值，默认采用SHA256算法
	ContentHash *string `json:"content_hash,omitempty" xml:"content_hash,omitempty"`
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
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 发起存证成功后，返回的存证凭据
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
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

func (s *NotaryInfo) SetTransactionId(v string) *NotaryInfo {
	s.TransactionId = &v
	return s
}

func (s *NotaryInfo) SetTxHash(v string) *NotaryInfo {
	s.TxHash = &v
	return s
}

// 融资租赁里的产品详细信息
type ProductInfo struct {
	// 额外字段
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 是否需要创建did
	NeedDid *bool `json:"need_did,omitempty" xml:"need_did,omitempty"`
	// 产品品牌，长度不超过50
	ProductBrand *string `json:"product_brand,omitempty" xml:"product_brand,omitempty"`
	// 产品Id，长度不超过50
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
	// 唯一标识码，imeiID，长度不超过50
	ProductImeiId *string `json:"product_imei_id,omitempty" xml:"product_imei_id,omitempty"`
	// 产品规格型号，长度不超过255
	ProductModel *string `json:"product_model,omitempty" xml:"product_model,omitempty"`
	// 产品名称，长度不超过50
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty"`
	// 产品数量
	ProductNumber *int64 `json:"product_number,omitempty" xml:"product_number,omitempty"`
	// 产品采购含税价 精确到毫厘，即123400表示12.34元
	ProductPrice *int64 `json:"product_price,omitempty" xml:"product_price,omitempty"`
	// 供应商id
	SupplierId *string `json:"supplier_id,omitempty" xml:"supplier_id,omitempty"`
	// 供应商对应的产品版本，每个版本可以对应一个价格
	SupplierVersion *string `json:"supplier_version,omitempty" xml:"supplier_version,omitempty"`
}

func (s ProductInfo) String() string {
	return tea.Prettify(s)
}

func (s ProductInfo) GoString() string {
	return s.String()
}

func (s *ProductInfo) SetExtraInfo(v string) *ProductInfo {
	s.ExtraInfo = &v
	return s
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

// 电子合同文档
type ContractDoc struct {
	// 是否加密，0-不加密，1-加，默认0
	Encryption *int64 `json:"encryption,omitempty" xml:"encryption,omitempty"`
	// 电子合同文档的ID
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
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
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 交易哈希，存证记录唯一标识
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
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
	IdNumber *string `json:"id_number,omitempty" xml:"id_number,omitempty"`
	// 目前仅支持CRED_PSN_CH_IDCARD，即身份证号码
	IdType *string `json:"id_type,omitempty" xml:"id_type,omitempty"`
	// 手机号码，默认空
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 用户唯一标识，可传入第三方平台的个人用户id等
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
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
	NoticeType *string `json:"notice_type,omitempty" xml:"notice_type,omitempty"`
	// 签署完成重定向地址,默认签署完成停在当前页面
	RedirectUrl *string `json:"redirect_url,omitempty" xml:"redirect_url,omitempty"`
	// 签署平台，逗号分割，1-开放服务h5，2-支付宝签 ，默认值1
	SignPlatform *string `json:"sign_platform,omitempty" xml:"sign_platform,omitempty"`
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

// 融资租赁中IOT设备详情
type LeaseIotItemInfo struct {
	// 证据的时间
	Date *string `json:"date,omitempty" xml:"date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 证据的原始数据，默认为空或加密状态，除非调用方为授权用户（如出资方等
	RawData *string `json:"raw_data,omitempty" xml:"raw_data,omitempty"`
	// 证据的txHash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
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

func (s *LeaseIotItemInfo) SetRawData(v string) *LeaseIotItemInfo {
	s.RawData = &v
	return s
}

func (s *LeaseIotItemInfo) SetTxHash(v string) *LeaseIotItemInfo {
	s.TxHash = &v
	return s
}

// 存证证明的证书信息
type CertificateInfo struct {
	// 存证证明的证书内容的SHA256哈希值
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
	// 存证证明的证书文件名
	ResourceName *string `json:"resource_name,omitempty" xml:"resource_name,omitempty"`
	// 存证证明的证书下载地址
	ResourceUrl *string `json:"resource_url,omitempty" xml:"resource_url,omitempty"`
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

// 电子合同存证初始化信息
type ContractNotaryInitInfo struct {
	// 本阶段存证内容哈希值
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 签署文件份数
	FileNum *int64 `json:"file_num,omitempty" xml:"file_num,omitempty"`
	// 签署流程发起人ID
	Initiator *string `json:"initiator,omitempty" xml:"initiator,omitempty"`
	// 签署人ID（支持多个，不同ID间用“,”分隔开），由于流程中签署人可后续追加，最终以ContractNotaryFinishInfo中的singatories信息为准。
	Signatories *string `json:"signatories,omitempty" xml:"signatories,omitempty"`
	// 存证阶段发生时间，UNIX时间戳(毫秒)
	Timestamp *string `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
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
	// 印章业务类型，CANCELLATION-作废章，COMMON-其它
	SealBizType *string `json:"seal_biz_type,omitempty" xml:"seal_biz_type,omitempty"`
	// 印章id
	SealId *string `json:"seal_id,omitempty" xml:"seal_id,omitempty"`
	// 印章类型，1-机构模板章，2-个人模板章，3-自定义印章，4-手绘章
	SealType *int64 `json:"seal_type,omitempty" xml:"seal_type,omitempty"`
	// 印章下载地址, 有效时间1小时
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 印章宽度
	Width *int64 `json:"width,omitempty" xml:"width,omitempty"`
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

func (s *ContractSeal) SetSealBizType(v string) *ContractSeal {
	s.SealBizType = &v
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

func (s *ContractSeal) SetWidth(v int64) *ContractSeal {
	s.Width = &v
	return s
}

// 签署区列表数据
type ContractPlatformSignFieldApplication struct {
	// 是否添加签署时间戳， 默认不添加，默认格式 yyyy-MM-dd HH : mm : ss
	AddSignTime *bool `json:"add_sign_time,omitempty" xml:"add_sign_time,omitempty"`
	// 文件file id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 签署顺序，默认1,且不小于1，顺序越小越先处理
	Order *int64 `json:"order,omitempty" xml:"order,omitempty"`
	// 页码信息，当签署区signType为2时, 页码可以'-'分割, 其他情况只能是数字
	PosPage *string `json:"pos_page,omitempty" xml:"pos_page,omitempty"`
	// x坐标，默认空
	PosX *string `json:"pos_x,omitempty" xml:"pos_x,omitempty"`
	// y坐标
	PosY *string `json:"pos_y,omitempty" xml:"pos_y,omitempty"`
	// 印章id， 仅限企业公章，暂不支持指定企业法定代表人印章 ，如不传，则采用账号下的默认印章
	SealId *string `json:"seal_id,omitempty" xml:"seal_id,omitempty"`
	// 签署类型， 1-单页签署，2-骑缝签署，默认1
	SignType *int64 `json:"sign_type,omitempty" xml:"sign_type,omitempty"`
	// 第三方业务流水号id，保证相同签署人、相同签约主体、相同签署顺序的任务，对应的第三方业务流水id唯一，默认空
	ThirdOrderNo *string `json:"third_order_no,omitempty" xml:"third_order_no,omitempty"`
	// 签署区宽，默认印章宽度
	Width *string `json:"width,omitempty" xml:"width,omitempty"`
}

func (s ContractPlatformSignFieldApplication) String() string {
	return tea.Prettify(s)
}

func (s ContractPlatformSignFieldApplication) GoString() string {
	return s.String()
}

func (s *ContractPlatformSignFieldApplication) SetAddSignTime(v bool) *ContractPlatformSignFieldApplication {
	s.AddSignTime = &v
	return s
}

func (s *ContractPlatformSignFieldApplication) SetFileId(v string) *ContractPlatformSignFieldApplication {
	s.FileId = &v
	return s
}

func (s *ContractPlatformSignFieldApplication) SetOrder(v int64) *ContractPlatformSignFieldApplication {
	s.Order = &v
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

func (s *ContractPlatformSignFieldApplication) SetSealId(v string) *ContractPlatformSignFieldApplication {
	s.SealId = &v
	return s
}

func (s *ContractPlatformSignFieldApplication) SetSignType(v int64) *ContractPlatformSignFieldApplication {
	s.SignType = &v
	return s
}

func (s *ContractPlatformSignFieldApplication) SetThirdOrderNo(v string) *ContractPlatformSignFieldApplication {
	s.ThirdOrderNo = &v
	return s
}

func (s *ContractPlatformSignFieldApplication) SetWidth(v string) *ContractPlatformSignFieldApplication {
	s.Width = &v
	return s
}

// 普通代扣规则
type RepaymentOrderRequest struct {
	// 代扣触发时间，精确到毫秒
	// java.lang.System#currentTimeMillis()
	PayDate *int64 `json:"pay_date,omitempty" xml:"pay_date,omitempty"`
	// 代扣金额，整数 精确到分
	PayMoney *int64 `json:"pay_money,omitempty" xml:"pay_money,omitempty"`
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

// 可信时间信息结构
type TsrResponse struct {
	// 可信时间请求结果状态吗
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 精简后的时间戳完整编码（在校验时需要提交）
	Ctsr *string `json:"ctsr,omitempty" xml:"ctsr,omitempty"`
	// hash后的信息
	HashedMessage *string `json:"hashed_message,omitempty" xml:"hashed_message,omitempty"`
	// 哈希算法
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty"`
	// 请求失败时候的错误信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 凭证序列号 （在校验的时需要先填写凭证编号）
	//
	Sn *string `json:"sn,omitempty" xml:"sn,omitempty"`
	// 时间
	Ts *string `json:"ts,omitempty" xml:"ts,omitempty"`
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

func (s *TsrResponse) SetCtsr(v string) *TsrResponse {
	s.Ctsr = &v
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

func (s *TsrResponse) SetSn(v string) *TsrResponse {
	s.Sn = &v
	return s
}

func (s *TsrResponse) SetTs(v string) *TsrResponse {
	s.Ts = &v
	return s
}

type CallbackTwcNotaryArbitrationStatusRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 案件文书号
	AcceptanceNumber *string `json:"acceptance_number,omitempty" xml:"acceptance_number,omitempty"`
	// 案件编号
	CaseNo *string `json:"case_no,omitempty" xml:"case_no,omitempty"`
	// 确认时间时间戳
	ConfirmTime *int64 `json:"confirm_time,omitempty" xml:"confirm_time,omitempty"`
	// 预处理案号
	PreacceptanceNumber *string `json:"preacceptance_number,omitempty" xml:"preacceptance_number,omitempty"`
	// 发送时间时间戳
	SendTime *int64 `json:"send_time,omitempty" xml:"send_time,omitempty"`
	// 案件状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s CallbackTwcNotaryArbitrationStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackTwcNotaryArbitrationStatusRequest) GoString() string {
	return s.String()
}

func (s *CallbackTwcNotaryArbitrationStatusRequest) SetAuthToken(v string) *CallbackTwcNotaryArbitrationStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackTwcNotaryArbitrationStatusRequest) SetProductInstanceId(v string) *CallbackTwcNotaryArbitrationStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackTwcNotaryArbitrationStatusRequest) SetRegionName(v string) *CallbackTwcNotaryArbitrationStatusRequest {
	s.RegionName = &v
	return s
}

func (s *CallbackTwcNotaryArbitrationStatusRequest) SetAcceptanceNumber(v string) *CallbackTwcNotaryArbitrationStatusRequest {
	s.AcceptanceNumber = &v
	return s
}

func (s *CallbackTwcNotaryArbitrationStatusRequest) SetCaseNo(v string) *CallbackTwcNotaryArbitrationStatusRequest {
	s.CaseNo = &v
	return s
}

func (s *CallbackTwcNotaryArbitrationStatusRequest) SetConfirmTime(v int64) *CallbackTwcNotaryArbitrationStatusRequest {
	s.ConfirmTime = &v
	return s
}

func (s *CallbackTwcNotaryArbitrationStatusRequest) SetPreacceptanceNumber(v string) *CallbackTwcNotaryArbitrationStatusRequest {
	s.PreacceptanceNumber = &v
	return s
}

func (s *CallbackTwcNotaryArbitrationStatusRequest) SetSendTime(v int64) *CallbackTwcNotaryArbitrationStatusRequest {
	s.SendTime = &v
	return s
}

func (s *CallbackTwcNotaryArbitrationStatusRequest) SetStatus(v string) *CallbackTwcNotaryArbitrationStatusRequest {
	s.Status = &v
	return s
}

type CallbackTwcNotaryArbitrationStatusResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CallbackTwcNotaryArbitrationStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackTwcNotaryArbitrationStatusResponse) GoString() string {
	return s.String()
}

func (s *CallbackTwcNotaryArbitrationStatusResponse) SetReqMsgId(v string) *CallbackTwcNotaryArbitrationStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackTwcNotaryArbitrationStatusResponse) SetResultCode(v string) *CallbackTwcNotaryArbitrationStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackTwcNotaryArbitrationStatusResponse) SetResultMsg(v string) *CallbackTwcNotaryArbitrationStatusResponse {
	s.ResultMsg = &v
	return s
}

type CreateTwcNotaryContractAccountRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 邮箱地址，默认空
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 证件号
	IdNumber *string `json:"id_number,omitempty" xml:"id_number,omitempty"`
	// 证件类型，默认CRED_PSN_CH_IDCARD，详见个人证件类型说明文档（https://tech.antfin.com/docs/2/155166）
	IdType *string `json:"id_type,omitempty" xml:"id_type,omitempty"`
	// 手机号码，默认空
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 用户唯一标识，可传入第三方平台的个人用户id、证件号、手机号、邮箱等，如果设置则作为账号唯一性字段，相同信息不可重复创建。（个人用户与机构的唯一标识不可重复）
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s CreateTwcNotaryContractAccountRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractAccountRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractAccountRequest) SetAuthToken(v string) *CreateTwcNotaryContractAccountRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryContractAccountRequest) SetProductInstanceId(v string) *CreateTwcNotaryContractAccountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryContractAccountRequest) SetRegionName(v string) *CreateTwcNotaryContractAccountRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryContractAccountRequest) SetEmail(v string) *CreateTwcNotaryContractAccountRequest {
	s.Email = &v
	return s
}

func (s *CreateTwcNotaryContractAccountRequest) SetIdNumber(v string) *CreateTwcNotaryContractAccountRequest {
	s.IdNumber = &v
	return s
}

func (s *CreateTwcNotaryContractAccountRequest) SetIdType(v string) *CreateTwcNotaryContractAccountRequest {
	s.IdType = &v
	return s
}

func (s *CreateTwcNotaryContractAccountRequest) SetMobile(v string) *CreateTwcNotaryContractAccountRequest {
	s.Mobile = &v
	return s
}

func (s *CreateTwcNotaryContractAccountRequest) SetName(v string) *CreateTwcNotaryContractAccountRequest {
	s.Name = &v
	return s
}

func (s *CreateTwcNotaryContractAccountRequest) SetUserId(v string) *CreateTwcNotaryContractAccountRequest {
	s.UserId = &v
	return s
}

type CreateTwcNotaryContractAccountResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 个人账号ID
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s CreateTwcNotaryContractAccountResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractAccountResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractAccountResponse) SetReqMsgId(v string) *CreateTwcNotaryContractAccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryContractAccountResponse) SetResultCode(v string) *CreateTwcNotaryContractAccountResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryContractAccountResponse) SetResultMsg(v string) *CreateTwcNotaryContractAccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryContractAccountResponse) SetAccountId(v string) *CreateTwcNotaryContractAccountResponse {
	s.AccountId = &v
	return s
}

func (s *CreateTwcNotaryContractAccountResponse) SetCode(v int64) *CreateTwcNotaryContractAccountResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryContractAccountResponse) SetMessage(v string) *CreateTwcNotaryContractAccountResponse {
	s.Message = &v
	return s
}

type CreateTwcNotaryContractAccountsealRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 电子合同用户ID（在twc.notary.contract.account.create接口中创建）
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 印章别名
	Alias *string `json:"alias,omitempty" xml:"alias,omitempty"`
	// 印章颜色，RED-红色， BLUE-蓝色，BLACK-黑色
	Color *string `json:"color,omitempty" xml:"color,omitempty"`
	// 印章高度, 默认95px
	Height *int64 `json:"height,omitempty" xml:"height,omitempty"`
	// 模板类型, 详见个人印章样式说明 SQUARE, BORDERLESS, FZKC, HWLS, HWXK, HWXKBORDER, HYLSF, RECTANGLE, YGYJFCS, YGYMBXS, YYGXSF
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 印章宽度, 默认95px
	Width *int64 `json:"width,omitempty" xml:"width,omitempty"`
}

func (s CreateTwcNotaryContractAccountsealRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractAccountsealRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractAccountsealRequest) SetAuthToken(v string) *CreateTwcNotaryContractAccountsealRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealRequest) SetProductInstanceId(v string) *CreateTwcNotaryContractAccountsealRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealRequest) SetRegionName(v string) *CreateTwcNotaryContractAccountsealRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealRequest) SetAccountId(v string) *CreateTwcNotaryContractAccountsealRequest {
	s.AccountId = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealRequest) SetAlias(v string) *CreateTwcNotaryContractAccountsealRequest {
	s.Alias = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealRequest) SetColor(v string) *CreateTwcNotaryContractAccountsealRequest {
	s.Color = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealRequest) SetHeight(v int64) *CreateTwcNotaryContractAccountsealRequest {
	s.Height = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealRequest) SetType(v string) *CreateTwcNotaryContractAccountsealRequest {
	s.Type = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealRequest) SetWidth(v int64) *CreateTwcNotaryContractAccountsealRequest {
	s.Width = &v
	return s
}

type CreateTwcNotaryContractAccountsealResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 印章fileKey
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 印章id
	SealId *string `json:"seal_id,omitempty" xml:"seal_id,omitempty"`
	// 印章下载地址, 有效时间1小时
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s CreateTwcNotaryContractAccountsealResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractAccountsealResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractAccountsealResponse) SetReqMsgId(v string) *CreateTwcNotaryContractAccountsealResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealResponse) SetResultCode(v string) *CreateTwcNotaryContractAccountsealResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealResponse) SetResultMsg(v string) *CreateTwcNotaryContractAccountsealResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealResponse) SetCode(v int64) *CreateTwcNotaryContractAccountsealResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealResponse) SetFileKey(v string) *CreateTwcNotaryContractAccountsealResponse {
	s.FileKey = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealResponse) SetMessage(v string) *CreateTwcNotaryContractAccountsealResponse {
	s.Message = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealResponse) SetSealId(v string) *CreateTwcNotaryContractAccountsealResponse {
	s.SealId = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealResponse) SetUrl(v string) *CreateTwcNotaryContractAccountsealResponse {
	s.Url = &v
	return s
}

type CreateTwcNotaryContractOrganizationRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 创建人个人账号ID，也就是调用个人账号创建接口（twc.notary.contract.account.create
	// ）返回的accountId
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty"`
	// 证件号
	IdNumber *string `json:"id_number,omitempty" xml:"id_number,omitempty"`
	// 证件类型，默认CRED_ORG_USCC，详见机构证件类型说明 （https://tech.antfin.com/docs/2/155166）
	IdType *string `json:"id_type,omitempty" xml:"id_type,omitempty"`
	// 企业法人名称
	LegalPerson *string `json:"legal_person,omitempty" xml:"legal_person,omitempty"`
	// 企业法人证件号
	LegalPersonId *string `json:"legal_person_id,omitempty" xml:"legal_person_id,omitempty"`
	// 机构名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 机构唯一标识，可传入第三方平台机构id、企业证件号、企业邮箱等如果设置则作为账号唯一性字段，相同id不可重复创建。（个人用户与机构的唯一标识不可重复）
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s CreateTwcNotaryContractOrganizationRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractOrganizationRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractOrganizationRequest) SetAuthToken(v string) *CreateTwcNotaryContractOrganizationRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryContractOrganizationRequest) SetProductInstanceId(v string) *CreateTwcNotaryContractOrganizationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryContractOrganizationRequest) SetRegionName(v string) *CreateTwcNotaryContractOrganizationRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryContractOrganizationRequest) SetCreator(v string) *CreateTwcNotaryContractOrganizationRequest {
	s.Creator = &v
	return s
}

func (s *CreateTwcNotaryContractOrganizationRequest) SetIdNumber(v string) *CreateTwcNotaryContractOrganizationRequest {
	s.IdNumber = &v
	return s
}

func (s *CreateTwcNotaryContractOrganizationRequest) SetIdType(v string) *CreateTwcNotaryContractOrganizationRequest {
	s.IdType = &v
	return s
}

func (s *CreateTwcNotaryContractOrganizationRequest) SetLegalPerson(v string) *CreateTwcNotaryContractOrganizationRequest {
	s.LegalPerson = &v
	return s
}

func (s *CreateTwcNotaryContractOrganizationRequest) SetLegalPersonId(v string) *CreateTwcNotaryContractOrganizationRequest {
	s.LegalPersonId = &v
	return s
}

func (s *CreateTwcNotaryContractOrganizationRequest) SetName(v string) *CreateTwcNotaryContractOrganizationRequest {
	s.Name = &v
	return s
}

func (s *CreateTwcNotaryContractOrganizationRequest) SetUserId(v string) *CreateTwcNotaryContractOrganizationRequest {
	s.UserId = &v
	return s
}

type CreateTwcNotaryContractOrganizationResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 机构账号ID
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty"`
}

func (s CreateTwcNotaryContractOrganizationResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractOrganizationResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractOrganizationResponse) SetReqMsgId(v string) *CreateTwcNotaryContractOrganizationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryContractOrganizationResponse) SetResultCode(v string) *CreateTwcNotaryContractOrganizationResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryContractOrganizationResponse) SetResultMsg(v string) *CreateTwcNotaryContractOrganizationResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryContractOrganizationResponse) SetCode(v int64) *CreateTwcNotaryContractOrganizationResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryContractOrganizationResponse) SetMessage(v string) *CreateTwcNotaryContractOrganizationResponse {
	s.Message = &v
	return s
}

func (s *CreateTwcNotaryContractOrganizationResponse) SetOrgId(v string) *CreateTwcNotaryContractOrganizationResponse {
	s.OrgId = &v
	return s
}

type CreateTwcNotaryContractOrgsealRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 印章别名
	Alias *string `json:"alias,omitempty" xml:"alias,omitempty"`
	// 中心图案类型，STAR-圆形有五角星，NONE-圆形无五角星， 详见机构印章样式说明
	Central *string `json:"central,omitempty" xml:"central,omitempty"`
	// 印章颜色，RED-红色，BLUE-蓝色，BLACK-黑色
	Color *string `json:"color,omitempty" xml:"color,omitempty"`
	// 印章高度，默认159px
	Height *int64 `json:"height,omitempty" xml:"height,omitempty"`
	// 横向文，可设置0-8个字，企业名称超出25个字后，不支持设置横向文
	Htext *string `json:"htext,omitempty" xml:"htext,omitempty"`
	// 机构ID
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty"`
	// 下弦文，可设置0-20个字，企业企业名称超出25个字后，不支持设置下弦文
	Qtext *string `json:"qtext,omitempty" xml:"qtext,omitempty"`
	// 模板类型，TEMPLATE_ROUND-圆章，TEMPLATE_OVAL-椭圆章， 详见机构印章样式说明
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 印章宽度，默认159px
	Width *int64 `json:"width,omitempty" xml:"width,omitempty"`
}

func (s CreateTwcNotaryContractOrgsealRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractOrgsealRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractOrgsealRequest) SetAuthToken(v string) *CreateTwcNotaryContractOrgsealRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryContractOrgsealRequest) SetProductInstanceId(v string) *CreateTwcNotaryContractOrgsealRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryContractOrgsealRequest) SetRegionName(v string) *CreateTwcNotaryContractOrgsealRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryContractOrgsealRequest) SetAlias(v string) *CreateTwcNotaryContractOrgsealRequest {
	s.Alias = &v
	return s
}

func (s *CreateTwcNotaryContractOrgsealRequest) SetCentral(v string) *CreateTwcNotaryContractOrgsealRequest {
	s.Central = &v
	return s
}

func (s *CreateTwcNotaryContractOrgsealRequest) SetColor(v string) *CreateTwcNotaryContractOrgsealRequest {
	s.Color = &v
	return s
}

func (s *CreateTwcNotaryContractOrgsealRequest) SetHeight(v int64) *CreateTwcNotaryContractOrgsealRequest {
	s.Height = &v
	return s
}

func (s *CreateTwcNotaryContractOrgsealRequest) SetHtext(v string) *CreateTwcNotaryContractOrgsealRequest {
	s.Htext = &v
	return s
}

func (s *CreateTwcNotaryContractOrgsealRequest) SetOrgId(v string) *CreateTwcNotaryContractOrgsealRequest {
	s.OrgId = &v
	return s
}

func (s *CreateTwcNotaryContractOrgsealRequest) SetQtext(v string) *CreateTwcNotaryContractOrgsealRequest {
	s.Qtext = &v
	return s
}

func (s *CreateTwcNotaryContractOrgsealRequest) SetType(v string) *CreateTwcNotaryContractOrgsealRequest {
	s.Type = &v
	return s
}

func (s *CreateTwcNotaryContractOrgsealRequest) SetWidth(v int64) *CreateTwcNotaryContractOrgsealRequest {
	s.Width = &v
	return s
}

type CreateTwcNotaryContractOrgsealResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s CreateTwcNotaryContractOrgsealResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractOrgsealResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractOrgsealResponse) SetReqMsgId(v string) *CreateTwcNotaryContractOrgsealResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryContractOrgsealResponse) SetResultCode(v string) *CreateTwcNotaryContractOrgsealResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryContractOrgsealResponse) SetResultMsg(v string) *CreateTwcNotaryContractOrgsealResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryContractOrgsealResponse) SetCode(v int64) *CreateTwcNotaryContractOrgsealResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryContractOrgsealResponse) SetFileKey(v string) *CreateTwcNotaryContractOrgsealResponse {
	s.FileKey = &v
	return s
}

func (s *CreateTwcNotaryContractOrgsealResponse) SetMessage(v string) *CreateTwcNotaryContractOrgsealResponse {
	s.Message = &v
	return s
}

func (s *CreateTwcNotaryContractOrgsealResponse) SetSealId(v string) *CreateTwcNotaryContractOrgsealResponse {
	s.SealId = &v
	return s
}

func (s *CreateTwcNotaryContractOrgsealResponse) SetUrl(v string) *CreateTwcNotaryContractOrgsealResponse {
	s.Url = &v
	return s
}

type AuthTwcNotaryContractSignRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 授权人ID，即个人账号ID或机构账号ID
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 授权截止时间, 格式为yyyy-MM-dd HH:mm:ss，默认无限期
	Deadline *string `json:"deadline,omitempty" xml:"deadline,omitempty"`
}

func (s AuthTwcNotaryContractSignRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthTwcNotaryContractSignRequest) GoString() string {
	return s.String()
}

func (s *AuthTwcNotaryContractSignRequest) SetAuthToken(v string) *AuthTwcNotaryContractSignRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthTwcNotaryContractSignRequest) SetProductInstanceId(v string) *AuthTwcNotaryContractSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthTwcNotaryContractSignRequest) SetRegionName(v string) *AuthTwcNotaryContractSignRequest {
	s.RegionName = &v
	return s
}

func (s *AuthTwcNotaryContractSignRequest) SetAccountId(v string) *AuthTwcNotaryContractSignRequest {
	s.AccountId = &v
	return s
}

func (s *AuthTwcNotaryContractSignRequest) SetDeadline(v string) *AuthTwcNotaryContractSignRequest {
	s.Deadline = &v
	return s
}

type AuthTwcNotaryContractSignResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务数据, 是否授权成功
	Accepted *bool `json:"accepted,omitempty" xml:"accepted,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s AuthTwcNotaryContractSignResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthTwcNotaryContractSignResponse) GoString() string {
	return s.String()
}

func (s *AuthTwcNotaryContractSignResponse) SetReqMsgId(v string) *AuthTwcNotaryContractSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthTwcNotaryContractSignResponse) SetResultCode(v string) *AuthTwcNotaryContractSignResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthTwcNotaryContractSignResponse) SetResultMsg(v string) *AuthTwcNotaryContractSignResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthTwcNotaryContractSignResponse) SetAccepted(v bool) *AuthTwcNotaryContractSignResponse {
	s.Accepted = &v
	return s
}

func (s *AuthTwcNotaryContractSignResponse) SetCode(v int64) *AuthTwcNotaryContractSignResponse {
	s.Code = &v
	return s
}

func (s *AuthTwcNotaryContractSignResponse) SetMessage(v string) *AuthTwcNotaryContractSignResponse {
	s.Message = &v
	return s
}

type CreateTwcNotaryContractTemplateRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 模板文件md5值，再做base64编码
	ContentMd5 *string `json:"content_md5,omitempty" xml:"content_md5,omitempty"`
	// 目标文件的MIME类型
	ContentType *string `json:"content_type,omitempty" xml:"content_type,omitempty"`
	// 是否需要转成pdf，如果模板文件为.doc/.docx 传true，为pdf传false
	Convert2Pdf *bool `json:"convert2_pdf,omitempty" xml:"convert2_pdf,omitempty"`
	// 文件名称，必须带扩展名如:.pdf,.doc,.docx
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
}

func (s CreateTwcNotaryContractTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractTemplateRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractTemplateRequest) SetAuthToken(v string) *CreateTwcNotaryContractTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryContractTemplateRequest) SetProductInstanceId(v string) *CreateTwcNotaryContractTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryContractTemplateRequest) SetRegionName(v string) *CreateTwcNotaryContractTemplateRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryContractTemplateRequest) SetContentMd5(v string) *CreateTwcNotaryContractTemplateRequest {
	s.ContentMd5 = &v
	return s
}

func (s *CreateTwcNotaryContractTemplateRequest) SetContentType(v string) *CreateTwcNotaryContractTemplateRequest {
	s.ContentType = &v
	return s
}

func (s *CreateTwcNotaryContractTemplateRequest) SetConvert2Pdf(v bool) *CreateTwcNotaryContractTemplateRequest {
	s.Convert2Pdf = &v
	return s
}

func (s *CreateTwcNotaryContractTemplateRequest) SetFileName(v string) *CreateTwcNotaryContractTemplateRequest {
	s.FileName = &v
	return s
}

type CreateTwcNotaryContractTemplateResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s CreateTwcNotaryContractTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractTemplateResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractTemplateResponse) SetReqMsgId(v string) *CreateTwcNotaryContractTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryContractTemplateResponse) SetResultCode(v string) *CreateTwcNotaryContractTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryContractTemplateResponse) SetResultMsg(v string) *CreateTwcNotaryContractTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryContractTemplateResponse) SetCode(v int64) *CreateTwcNotaryContractTemplateResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryContractTemplateResponse) SetMessage(v string) *CreateTwcNotaryContractTemplateResponse {
	s.Message = &v
	return s
}

func (s *CreateTwcNotaryContractTemplateResponse) SetTemplateId(v string) *CreateTwcNotaryContractTemplateResponse {
	s.TemplateId = &v
	return s
}

func (s *CreateTwcNotaryContractTemplateResponse) SetUploadUrl(v string) *CreateTwcNotaryContractTemplateResponse {
	s.UploadUrl = &v
	return s
}

type CreateTwcNotaryContractFlowRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 是否自动归档，默认false。如设置为true，则在调用签署流程开启(twc.notary.contract.flow.start)后，当所有签署人签署完毕，系统自动将流程归档，状态变为“已完成”状态，在流程状态为“已完成”前，可随时添加签署人；如设置为false，则在调用签署流程开启后，需主动调用签署流程归档接口，将流程状态变更为“已完成”，归档前可随时添加签署人；已完成的流程才可下载签署后的文件
	AutoArchive *bool `json:"auto_archive,omitempty" xml:"auto_archive,omitempty"`
	// 文件主题
	BusinessScene *string `json:"business_scene,omitempty" xml:"business_scene,omitempty"`
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

func (s CreateTwcNotaryContractFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractFlowRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractFlowRequest) SetAuthToken(v string) *CreateTwcNotaryContractFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryContractFlowRequest) SetProductInstanceId(v string) *CreateTwcNotaryContractFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryContractFlowRequest) SetRegionName(v string) *CreateTwcNotaryContractFlowRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryContractFlowRequest) SetAutoArchive(v bool) *CreateTwcNotaryContractFlowRequest {
	s.AutoArchive = &v
	return s
}

func (s *CreateTwcNotaryContractFlowRequest) SetBusinessScene(v string) *CreateTwcNotaryContractFlowRequest {
	s.BusinessScene = &v
	return s
}

func (s *CreateTwcNotaryContractFlowRequest) SetConfigInfo(v *ContractSignFlowConfig) *CreateTwcNotaryContractFlowRequest {
	s.ConfigInfo = v
	return s
}

func (s *CreateTwcNotaryContractFlowRequest) SetContractRemind(v int64) *CreateTwcNotaryContractFlowRequest {
	s.ContractRemind = &v
	return s
}

func (s *CreateTwcNotaryContractFlowRequest) SetContractValidity(v int64) *CreateTwcNotaryContractFlowRequest {
	s.ContractValidity = &v
	return s
}

func (s *CreateTwcNotaryContractFlowRequest) SetInitiatorAccountId(v string) *CreateTwcNotaryContractFlowRequest {
	s.InitiatorAccountId = &v
	return s
}

func (s *CreateTwcNotaryContractFlowRequest) SetInitiatorAuthorizedAccountId(v string) *CreateTwcNotaryContractFlowRequest {
	s.InitiatorAuthorizedAccountId = &v
	return s
}

func (s *CreateTwcNotaryContractFlowRequest) SetSignValidity(v int64) *CreateTwcNotaryContractFlowRequest {
	s.SignValidity = &v
	return s
}

type CreateTwcNotaryContractFlowResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s CreateTwcNotaryContractFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractFlowResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractFlowResponse) SetReqMsgId(v string) *CreateTwcNotaryContractFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryContractFlowResponse) SetResultCode(v string) *CreateTwcNotaryContractFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryContractFlowResponse) SetResultMsg(v string) *CreateTwcNotaryContractFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryContractFlowResponse) SetCode(v int64) *CreateTwcNotaryContractFlowResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryContractFlowResponse) SetFlowId(v string) *CreateTwcNotaryContractFlowResponse {
	s.FlowId = &v
	return s
}

func (s *CreateTwcNotaryContractFlowResponse) SetMessage(v string) *CreateTwcNotaryContractFlowResponse {
	s.Message = &v
	return s
}

type AddTwcNotaryContractDocumentRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 文档列表数据
	Docs []*ContractDoc `json:"docs,omitempty" xml:"docs,omitempty" type:"Repeated"`
	// 流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
}

func (s AddTwcNotaryContractDocumentRequest) String() string {
	return tea.Prettify(s)
}

func (s AddTwcNotaryContractDocumentRequest) GoString() string {
	return s.String()
}

func (s *AddTwcNotaryContractDocumentRequest) SetAuthToken(v string) *AddTwcNotaryContractDocumentRequest {
	s.AuthToken = &v
	return s
}

func (s *AddTwcNotaryContractDocumentRequest) SetProductInstanceId(v string) *AddTwcNotaryContractDocumentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddTwcNotaryContractDocumentRequest) SetRegionName(v string) *AddTwcNotaryContractDocumentRequest {
	s.RegionName = &v
	return s
}

func (s *AddTwcNotaryContractDocumentRequest) SetDocs(v []*ContractDoc) *AddTwcNotaryContractDocumentRequest {
	s.Docs = v
	return s
}

func (s *AddTwcNotaryContractDocumentRequest) SetFlowId(v string) *AddTwcNotaryContractDocumentRequest {
	s.FlowId = &v
	return s
}

type AddTwcNotaryContractDocumentResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s AddTwcNotaryContractDocumentResponse) String() string {
	return tea.Prettify(s)
}

func (s AddTwcNotaryContractDocumentResponse) GoString() string {
	return s.String()
}

func (s *AddTwcNotaryContractDocumentResponse) SetReqMsgId(v string) *AddTwcNotaryContractDocumentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddTwcNotaryContractDocumentResponse) SetResultCode(v string) *AddTwcNotaryContractDocumentResponse {
	s.ResultCode = &v
	return s
}

func (s *AddTwcNotaryContractDocumentResponse) SetResultMsg(v string) *AddTwcNotaryContractDocumentResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddTwcNotaryContractDocumentResponse) SetCode(v int64) *AddTwcNotaryContractDocumentResponse {
	s.Code = &v
	return s
}

func (s *AddTwcNotaryContractDocumentResponse) SetMessage(v string) *AddTwcNotaryContractDocumentResponse {
	s.Message = &v
	return s
}

type AddTwcNotaryContractSignfieldRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 签署流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 签署区列表数据
	Signfields []*ContractSignFieldApplication `json:"signfields,omitempty" xml:"signfields,omitempty" type:"Repeated"`
}

func (s AddTwcNotaryContractSignfieldRequest) String() string {
	return tea.Prettify(s)
}

func (s AddTwcNotaryContractSignfieldRequest) GoString() string {
	return s.String()
}

func (s *AddTwcNotaryContractSignfieldRequest) SetAuthToken(v string) *AddTwcNotaryContractSignfieldRequest {
	s.AuthToken = &v
	return s
}

func (s *AddTwcNotaryContractSignfieldRequest) SetProductInstanceId(v string) *AddTwcNotaryContractSignfieldRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddTwcNotaryContractSignfieldRequest) SetRegionName(v string) *AddTwcNotaryContractSignfieldRequest {
	s.RegionName = &v
	return s
}

func (s *AddTwcNotaryContractSignfieldRequest) SetFlowId(v string) *AddTwcNotaryContractSignfieldRequest {
	s.FlowId = &v
	return s
}

func (s *AddTwcNotaryContractSignfieldRequest) SetSignfields(v []*ContractSignFieldApplication) *AddTwcNotaryContractSignfieldRequest {
	s.Signfields = v
	return s
}

type AddTwcNotaryContractSignfieldResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 签署区列表数据
	Signfields []*ContractSignField `json:"signfields,omitempty" xml:"signfields,omitempty" type:"Repeated"`
}

func (s AddTwcNotaryContractSignfieldResponse) String() string {
	return tea.Prettify(s)
}

func (s AddTwcNotaryContractSignfieldResponse) GoString() string {
	return s.String()
}

func (s *AddTwcNotaryContractSignfieldResponse) SetReqMsgId(v string) *AddTwcNotaryContractSignfieldResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddTwcNotaryContractSignfieldResponse) SetResultCode(v string) *AddTwcNotaryContractSignfieldResponse {
	s.ResultCode = &v
	return s
}

func (s *AddTwcNotaryContractSignfieldResponse) SetResultMsg(v string) *AddTwcNotaryContractSignfieldResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddTwcNotaryContractSignfieldResponse) SetCode(v int64) *AddTwcNotaryContractSignfieldResponse {
	s.Code = &v
	return s
}

func (s *AddTwcNotaryContractSignfieldResponse) SetMessage(v string) *AddTwcNotaryContractSignfieldResponse {
	s.Message = &v
	return s
}

func (s *AddTwcNotaryContractSignfieldResponse) SetSignfields(v []*ContractSignField) *AddTwcNotaryContractSignfieldResponse {
	s.Signfields = v
	return s
}

type StartTwcNotaryContractFlowRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
}

func (s StartTwcNotaryContractFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s StartTwcNotaryContractFlowRequest) GoString() string {
	return s.String()
}

func (s *StartTwcNotaryContractFlowRequest) SetAuthToken(v string) *StartTwcNotaryContractFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *StartTwcNotaryContractFlowRequest) SetProductInstanceId(v string) *StartTwcNotaryContractFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartTwcNotaryContractFlowRequest) SetRegionName(v string) *StartTwcNotaryContractFlowRequest {
	s.RegionName = &v
	return s
}

func (s *StartTwcNotaryContractFlowRequest) SetFlowId(v string) *StartTwcNotaryContractFlowRequest {
	s.FlowId = &v
	return s
}

type StartTwcNotaryContractFlowResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s StartTwcNotaryContractFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s StartTwcNotaryContractFlowResponse) GoString() string {
	return s.String()
}

func (s *StartTwcNotaryContractFlowResponse) SetReqMsgId(v string) *StartTwcNotaryContractFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartTwcNotaryContractFlowResponse) SetResultCode(v string) *StartTwcNotaryContractFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *StartTwcNotaryContractFlowResponse) SetResultMsg(v string) *StartTwcNotaryContractFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartTwcNotaryContractFlowResponse) SetCode(v int64) *StartTwcNotaryContractFlowResponse {
	s.Code = &v
	return s
}

func (s *StartTwcNotaryContractFlowResponse) SetMessage(v string) *StartTwcNotaryContractFlowResponse {
	s.Message = &v
	return s
}

type SaveTwcNotaryContractFlowRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
}

func (s SaveTwcNotaryContractFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveTwcNotaryContractFlowRequest) GoString() string {
	return s.String()
}

func (s *SaveTwcNotaryContractFlowRequest) SetAuthToken(v string) *SaveTwcNotaryContractFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveTwcNotaryContractFlowRequest) SetProductInstanceId(v string) *SaveTwcNotaryContractFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveTwcNotaryContractFlowRequest) SetRegionName(v string) *SaveTwcNotaryContractFlowRequest {
	s.RegionName = &v
	return s
}

func (s *SaveTwcNotaryContractFlowRequest) SetFlowId(v string) *SaveTwcNotaryContractFlowRequest {
	s.FlowId = &v
	return s
}

type SaveTwcNotaryContractFlowResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s SaveTwcNotaryContractFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveTwcNotaryContractFlowResponse) GoString() string {
	return s.String()
}

func (s *SaveTwcNotaryContractFlowResponse) SetReqMsgId(v string) *SaveTwcNotaryContractFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveTwcNotaryContractFlowResponse) SetResultCode(v string) *SaveTwcNotaryContractFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveTwcNotaryContractFlowResponse) SetResultMsg(v string) *SaveTwcNotaryContractFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveTwcNotaryContractFlowResponse) SetCode(v int64) *SaveTwcNotaryContractFlowResponse {
	s.Code = &v
	return s
}

func (s *SaveTwcNotaryContractFlowResponse) SetMessage(v string) *SaveTwcNotaryContractFlowResponse {
	s.Message = &v
	return s
}

type DownloadTwcNotaryContractDocumentRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
}

func (s DownloadTwcNotaryContractDocumentRequest) String() string {
	return tea.Prettify(s)
}

func (s DownloadTwcNotaryContractDocumentRequest) GoString() string {
	return s.String()
}

func (s *DownloadTwcNotaryContractDocumentRequest) SetAuthToken(v string) *DownloadTwcNotaryContractDocumentRequest {
	s.AuthToken = &v
	return s
}

func (s *DownloadTwcNotaryContractDocumentRequest) SetProductInstanceId(v string) *DownloadTwcNotaryContractDocumentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DownloadTwcNotaryContractDocumentRequest) SetRegionName(v string) *DownloadTwcNotaryContractDocumentRequest {
	s.RegionName = &v
	return s
}

func (s *DownloadTwcNotaryContractDocumentRequest) SetFlowId(v string) *DownloadTwcNotaryContractDocumentRequest {
	s.FlowId = &v
	return s
}

type DownloadTwcNotaryContractDocumentResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 文档下载地址信息列表
	Docs []*ContractDocAddress `json:"docs,omitempty" xml:"docs,omitempty" type:"Repeated"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s DownloadTwcNotaryContractDocumentResponse) String() string {
	return tea.Prettify(s)
}

func (s DownloadTwcNotaryContractDocumentResponse) GoString() string {
	return s.String()
}

func (s *DownloadTwcNotaryContractDocumentResponse) SetReqMsgId(v string) *DownloadTwcNotaryContractDocumentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DownloadTwcNotaryContractDocumentResponse) SetResultCode(v string) *DownloadTwcNotaryContractDocumentResponse {
	s.ResultCode = &v
	return s
}

func (s *DownloadTwcNotaryContractDocumentResponse) SetResultMsg(v string) *DownloadTwcNotaryContractDocumentResponse {
	s.ResultMsg = &v
	return s
}

func (s *DownloadTwcNotaryContractDocumentResponse) SetCode(v int64) *DownloadTwcNotaryContractDocumentResponse {
	s.Code = &v
	return s
}

func (s *DownloadTwcNotaryContractDocumentResponse) SetDocs(v []*ContractDocAddress) *DownloadTwcNotaryContractDocumentResponse {
	s.Docs = v
	return s
}

func (s *DownloadTwcNotaryContractDocumentResponse) SetMessage(v string) *DownloadTwcNotaryContractDocumentResponse {
	s.Message = &v
	return s
}

type AddTwcNotaryContractFileRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 文件名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 输入项填充内容，以key:value传入
	SimpleFormFields *string `json:"simple_form_fields,omitempty" xml:"simple_form_fields,omitempty"`
	// 模板编号
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty"`
}

func (s AddTwcNotaryContractFileRequest) String() string {
	return tea.Prettify(s)
}

func (s AddTwcNotaryContractFileRequest) GoString() string {
	return s.String()
}

func (s *AddTwcNotaryContractFileRequest) SetAuthToken(v string) *AddTwcNotaryContractFileRequest {
	s.AuthToken = &v
	return s
}

func (s *AddTwcNotaryContractFileRequest) SetProductInstanceId(v string) *AddTwcNotaryContractFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddTwcNotaryContractFileRequest) SetRegionName(v string) *AddTwcNotaryContractFileRequest {
	s.RegionName = &v
	return s
}

func (s *AddTwcNotaryContractFileRequest) SetName(v string) *AddTwcNotaryContractFileRequest {
	s.Name = &v
	return s
}

func (s *AddTwcNotaryContractFileRequest) SetSimpleFormFields(v string) *AddTwcNotaryContractFileRequest {
	s.SimpleFormFields = &v
	return s
}

func (s *AddTwcNotaryContractFileRequest) SetTemplateId(v string) *AddTwcNotaryContractFileRequest {
	s.TemplateId = &v
	return s
}

type AddTwcNotaryContractFileResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 文件下载地址，有效期一小时
	DownloadUrl *string `json:"download_url,omitempty" xml:"download_url,omitempty"`
	// 文件id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s AddTwcNotaryContractFileResponse) String() string {
	return tea.Prettify(s)
}

func (s AddTwcNotaryContractFileResponse) GoString() string {
	return s.String()
}

func (s *AddTwcNotaryContractFileResponse) SetReqMsgId(v string) *AddTwcNotaryContractFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddTwcNotaryContractFileResponse) SetResultCode(v string) *AddTwcNotaryContractFileResponse {
	s.ResultCode = &v
	return s
}

func (s *AddTwcNotaryContractFileResponse) SetResultMsg(v string) *AddTwcNotaryContractFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddTwcNotaryContractFileResponse) SetCode(v int64) *AddTwcNotaryContractFileResponse {
	s.Code = &v
	return s
}

func (s *AddTwcNotaryContractFileResponse) SetDownloadUrl(v string) *AddTwcNotaryContractFileResponse {
	s.DownloadUrl = &v
	return s
}

func (s *AddTwcNotaryContractFileResponse) SetFileId(v string) *AddTwcNotaryContractFileResponse {
	s.FileId = &v
	return s
}

func (s *AddTwcNotaryContractFileResponse) SetFileName(v string) *AddTwcNotaryContractFileResponse {
	s.FileName = &v
	return s
}

func (s *AddTwcNotaryContractFileResponse) SetMessage(v string) *AddTwcNotaryContractFileResponse {
	s.Message = &v
	return s
}

type CreateTwcNotaryContractPlatformRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 平台方经办人信息
	Creator *ContractAccountApplication `json:"creator,omitempty" xml:"creator,omitempty"`
	// 平台机构信息
	Platform *ContractOrganizationApplication `json:"platform,omitempty" xml:"platform,omitempty"`
}

func (s CreateTwcNotaryContractPlatformRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractPlatformRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractPlatformRequest) SetAuthToken(v string) *CreateTwcNotaryContractPlatformRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryContractPlatformRequest) SetProductInstanceId(v string) *CreateTwcNotaryContractPlatformRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryContractPlatformRequest) SetRegionName(v string) *CreateTwcNotaryContractPlatformRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryContractPlatformRequest) SetCreator(v *ContractAccountApplication) *CreateTwcNotaryContractPlatformRequest {
	s.Creator = v
	return s
}

func (s *CreateTwcNotaryContractPlatformRequest) SetPlatform(v *ContractOrganizationApplication) *CreateTwcNotaryContractPlatformRequest {
	s.Platform = v
	return s
}

type CreateTwcNotaryContractPlatformResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 创建人ID
	CreatorId *string `json:"creator_id,omitempty" xml:"creator_id,omitempty"`
	// 平台方ID
	PlatformId *string `json:"platform_id,omitempty" xml:"platform_id,omitempty"`
	// 平台用户与智能合同服务间鉴权使用的密钥
	Secret *string `json:"secret,omitempty" xml:"secret,omitempty"`
}

func (s CreateTwcNotaryContractPlatformResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractPlatformResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractPlatformResponse) SetReqMsgId(v string) *CreateTwcNotaryContractPlatformResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryContractPlatformResponse) SetResultCode(v string) *CreateTwcNotaryContractPlatformResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryContractPlatformResponse) SetResultMsg(v string) *CreateTwcNotaryContractPlatformResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryContractPlatformResponse) SetCreatorId(v string) *CreateTwcNotaryContractPlatformResponse {
	s.CreatorId = &v
	return s
}

func (s *CreateTwcNotaryContractPlatformResponse) SetPlatformId(v string) *CreateTwcNotaryContractPlatformResponse {
	s.PlatformId = &v
	return s
}

func (s *CreateTwcNotaryContractPlatformResponse) SetSecret(v string) *CreateTwcNotaryContractPlatformResponse {
	s.Secret = &v
	return s
}

type CreateTwcNotaryContractUserRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 用户类型为机构时，填写机构信息
	Organization *ContractOrganizationApplication `json:"organization,omitempty" xml:"organization,omitempty"`
	// 用户类型为个人时，则为个人用户信息；用户类型为机构时，则为机构账号经办人信息
	User *ContractAccountApplication `json:"user,omitempty" xml:"user,omitempty"`
	// 用户类型，个人（PERSON）或机构（ORGANIZATION）
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty"`
}

func (s CreateTwcNotaryContractUserRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractUserRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractUserRequest) SetAuthToken(v string) *CreateTwcNotaryContractUserRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryContractUserRequest) SetProductInstanceId(v string) *CreateTwcNotaryContractUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryContractUserRequest) SetRegionName(v string) *CreateTwcNotaryContractUserRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryContractUserRequest) SetOrganization(v *ContractOrganizationApplication) *CreateTwcNotaryContractUserRequest {
	s.Organization = v
	return s
}

func (s *CreateTwcNotaryContractUserRequest) SetUser(v *ContractAccountApplication) *CreateTwcNotaryContractUserRequest {
	s.User = v
	return s
}

func (s *CreateTwcNotaryContractUserRequest) SetUserType(v string) *CreateTwcNotaryContractUserRequest {
	s.UserType = &v
	return s
}

type CreateTwcNotaryContractUserResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 机构账号
	OrganizationId *string `json:"organization_id,omitempty" xml:"organization_id,omitempty"`
	// 用户类型为个人时返回用户账号；用户类型为机构时返回经办人账号
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s CreateTwcNotaryContractUserResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractUserResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractUserResponse) SetReqMsgId(v string) *CreateTwcNotaryContractUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryContractUserResponse) SetResultCode(v string) *CreateTwcNotaryContractUserResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryContractUserResponse) SetResultMsg(v string) *CreateTwcNotaryContractUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryContractUserResponse) SetOrganizationId(v string) *CreateTwcNotaryContractUserResponse {
	s.OrganizationId = &v
	return s
}

func (s *CreateTwcNotaryContractUserResponse) SetUserId(v string) *CreateTwcNotaryContractUserResponse {
	s.UserId = &v
	return s
}

type StartTwcNotaryContractHandsignRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 代理商户账户
	AgentAccountId *string `json:"agent_account_id,omitempty" xml:"agent_account_id,omitempty"`
	// 是否自动归档，默认为true
	AutoArchive *bool `json:"auto_archive,omitempty" xml:"auto_archive,omitempty"`
	// 合同文件主题
	BusinessScene *string `json:"business_scene,omitempty" xml:"business_scene,omitempty"`
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
	SimpleFormFields *string `json:"simple_form_fields,omitempty" xml:"simple_form_fields,omitempty"`
	// 待签署的智能合同模板ID
	Template *string `json:"template,omitempty" xml:"template,omitempty"`
	// 待签署客户的账户ID
	UserAccount *string `json:"user_account,omitempty" xml:"user_account,omitempty"`
}

func (s StartTwcNotaryContractHandsignRequest) String() string {
	return tea.Prettify(s)
}

func (s StartTwcNotaryContractHandsignRequest) GoString() string {
	return s.String()
}

func (s *StartTwcNotaryContractHandsignRequest) SetAuthToken(v string) *StartTwcNotaryContractHandsignRequest {
	s.AuthToken = &v
	return s
}

func (s *StartTwcNotaryContractHandsignRequest) SetProductInstanceId(v string) *StartTwcNotaryContractHandsignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartTwcNotaryContractHandsignRequest) SetRegionName(v string) *StartTwcNotaryContractHandsignRequest {
	s.RegionName = &v
	return s
}

func (s *StartTwcNotaryContractHandsignRequest) SetAgentAccountId(v string) *StartTwcNotaryContractHandsignRequest {
	s.AgentAccountId = &v
	return s
}

func (s *StartTwcNotaryContractHandsignRequest) SetAutoArchive(v bool) *StartTwcNotaryContractHandsignRequest {
	s.AutoArchive = &v
	return s
}

func (s *StartTwcNotaryContractHandsignRequest) SetBusinessScene(v string) *StartTwcNotaryContractHandsignRequest {
	s.BusinessScene = &v
	return s
}

func (s *StartTwcNotaryContractHandsignRequest) SetContractRemind(v int64) *StartTwcNotaryContractHandsignRequest {
	s.ContractRemind = &v
	return s
}

func (s *StartTwcNotaryContractHandsignRequest) SetContractSignFlowConfig(v *ContractSignFlowConfig) *StartTwcNotaryContractHandsignRequest {
	s.ContractSignFlowConfig = v
	return s
}

func (s *StartTwcNotaryContractHandsignRequest) SetContractValidity(v int64) *StartTwcNotaryContractHandsignRequest {
	s.ContractValidity = &v
	return s
}

func (s *StartTwcNotaryContractHandsignRequest) SetInitiatorAccountId(v string) *StartTwcNotaryContractHandsignRequest {
	s.InitiatorAccountId = &v
	return s
}

func (s *StartTwcNotaryContractHandsignRequest) SetInitiatorAuthorizedAccountId(v string) *StartTwcNotaryContractHandsignRequest {
	s.InitiatorAuthorizedAccountId = &v
	return s
}

func (s *StartTwcNotaryContractHandsignRequest) SetRepaymentOrderInfo(v []*RepaymentOrderRequest) *StartTwcNotaryContractHandsignRequest {
	s.RepaymentOrderInfo = v
	return s
}

func (s *StartTwcNotaryContractHandsignRequest) SetSignPlatform(v string) *StartTwcNotaryContractHandsignRequest {
	s.SignPlatform = &v
	return s
}

func (s *StartTwcNotaryContractHandsignRequest) SetSignValidity(v string) *StartTwcNotaryContractHandsignRequest {
	s.SignValidity = &v
	return s
}

func (s *StartTwcNotaryContractHandsignRequest) SetSimpleFormFields(v string) *StartTwcNotaryContractHandsignRequest {
	s.SimpleFormFields = &v
	return s
}

func (s *StartTwcNotaryContractHandsignRequest) SetTemplate(v string) *StartTwcNotaryContractHandsignRequest {
	s.Template = &v
	return s
}

func (s *StartTwcNotaryContractHandsignRequest) SetUserAccount(v string) *StartTwcNotaryContractHandsignRequest {
	s.UserAccount = &v
	return s
}

type StartTwcNotaryContractHandsignResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 手动签约唤起地址
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s StartTwcNotaryContractHandsignResponse) String() string {
	return tea.Prettify(s)
}

func (s StartTwcNotaryContractHandsignResponse) GoString() string {
	return s.String()
}

func (s *StartTwcNotaryContractHandsignResponse) SetReqMsgId(v string) *StartTwcNotaryContractHandsignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartTwcNotaryContractHandsignResponse) SetResultCode(v string) *StartTwcNotaryContractHandsignResponse {
	s.ResultCode = &v
	return s
}

func (s *StartTwcNotaryContractHandsignResponse) SetResultMsg(v string) *StartTwcNotaryContractHandsignResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartTwcNotaryContractHandsignResponse) SetFlowId(v string) *StartTwcNotaryContractHandsignResponse {
	s.FlowId = &v
	return s
}

func (s *StartTwcNotaryContractHandsignResponse) SetUrl(v string) *StartTwcNotaryContractHandsignResponse {
	s.Url = &v
	return s
}

type QueryTwcNotaryContractFlowRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 流程id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
}

func (s QueryTwcNotaryContractFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryContractFlowRequest) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryContractFlowRequest) SetAuthToken(v string) *QueryTwcNotaryContractFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwcNotaryContractFlowRequest) SetProductInstanceId(v string) *QueryTwcNotaryContractFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwcNotaryContractFlowRequest) SetRegionName(v string) *QueryTwcNotaryContractFlowRequest {
	s.RegionName = &v
	return s
}

func (s *QueryTwcNotaryContractFlowRequest) SetFlowId(v string) *QueryTwcNotaryContractFlowRequest {
	s.FlowId = &v
	return s
}

type QueryTwcNotaryContractFlowResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s QueryTwcNotaryContractFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryContractFlowResponse) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryContractFlowResponse) SetReqMsgId(v string) *QueryTwcNotaryContractFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwcNotaryContractFlowResponse) SetResultCode(v string) *QueryTwcNotaryContractFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwcNotaryContractFlowResponse) SetResultMsg(v string) *QueryTwcNotaryContractFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwcNotaryContractFlowResponse) SetAutoArchive(v bool) *QueryTwcNotaryContractFlowResponse {
	s.AutoArchive = &v
	return s
}

func (s *QueryTwcNotaryContractFlowResponse) SetBusinessScene(v string) *QueryTwcNotaryContractFlowResponse {
	s.BusinessScene = &v
	return s
}

func (s *QueryTwcNotaryContractFlowResponse) SetCode(v int64) *QueryTwcNotaryContractFlowResponse {
	s.Code = &v
	return s
}

func (s *QueryTwcNotaryContractFlowResponse) SetConfigInfo(v *ContractSignFlowConfig) *QueryTwcNotaryContractFlowResponse {
	s.ConfigInfo = v
	return s
}

func (s *QueryTwcNotaryContractFlowResponse) SetContractRemind(v int64) *QueryTwcNotaryContractFlowResponse {
	s.ContractRemind = &v
	return s
}

func (s *QueryTwcNotaryContractFlowResponse) SetContractValidity(v int64) *QueryTwcNotaryContractFlowResponse {
	s.ContractValidity = &v
	return s
}

func (s *QueryTwcNotaryContractFlowResponse) SetFlowDesc(v string) *QueryTwcNotaryContractFlowResponse {
	s.FlowDesc = &v
	return s
}

func (s *QueryTwcNotaryContractFlowResponse) SetFlowEndTime(v string) *QueryTwcNotaryContractFlowResponse {
	s.FlowEndTime = &v
	return s
}

func (s *QueryTwcNotaryContractFlowResponse) SetFlowId(v string) *QueryTwcNotaryContractFlowResponse {
	s.FlowId = &v
	return s
}

func (s *QueryTwcNotaryContractFlowResponse) SetFlowStartTime(v string) *QueryTwcNotaryContractFlowResponse {
	s.FlowStartTime = &v
	return s
}

func (s *QueryTwcNotaryContractFlowResponse) SetFlowStatus(v int64) *QueryTwcNotaryContractFlowResponse {
	s.FlowStatus = &v
	return s
}

func (s *QueryTwcNotaryContractFlowResponse) SetInitiatorAccountId(v string) *QueryTwcNotaryContractFlowResponse {
	s.InitiatorAccountId = &v
	return s
}

func (s *QueryTwcNotaryContractFlowResponse) SetInitiatorAuthorizedAccountId(v string) *QueryTwcNotaryContractFlowResponse {
	s.InitiatorAuthorizedAccountId = &v
	return s
}

func (s *QueryTwcNotaryContractFlowResponse) SetMessage(v string) *QueryTwcNotaryContractFlowResponse {
	s.Message = &v
	return s
}

func (s *QueryTwcNotaryContractFlowResponse) SetSignValidity(v string) *QueryTwcNotaryContractFlowResponse {
	s.SignValidity = &v
	return s
}

type CreateTwcNotaryContractAccountsealimageRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 用户id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 印章别名
	Alias *string `json:"alias,omitempty" xml:"alias,omitempty"`
	// 印章数据，base64格式字符串，不包含格式前缀
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 印章高度, 个人默认95px, 机构默认159px
	Height *int64 `json:"height,omitempty" xml:"height,omitempty"`
	// 是否对图片进行透明化处理，默认false。仅对图片整体做透明化处理，无法去除图片背景
	TransparentFlag *bool `json:"transparent_flag,omitempty" xml:"transparent_flag,omitempty"`
	// 印章数据类型，BASE64：base64格式
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 印章宽度, 个人默认95px, 机构默认159px
	Width *int64 `json:"width,omitempty" xml:"width,omitempty"`
}

func (s CreateTwcNotaryContractAccountsealimageRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractAccountsealimageRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractAccountsealimageRequest) SetAuthToken(v string) *CreateTwcNotaryContractAccountsealimageRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealimageRequest) SetProductInstanceId(v string) *CreateTwcNotaryContractAccountsealimageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealimageRequest) SetRegionName(v string) *CreateTwcNotaryContractAccountsealimageRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealimageRequest) SetAccountId(v string) *CreateTwcNotaryContractAccountsealimageRequest {
	s.AccountId = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealimageRequest) SetAlias(v string) *CreateTwcNotaryContractAccountsealimageRequest {
	s.Alias = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealimageRequest) SetData(v string) *CreateTwcNotaryContractAccountsealimageRequest {
	s.Data = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealimageRequest) SetHeight(v int64) *CreateTwcNotaryContractAccountsealimageRequest {
	s.Height = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealimageRequest) SetTransparentFlag(v bool) *CreateTwcNotaryContractAccountsealimageRequest {
	s.TransparentFlag = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealimageRequest) SetType(v string) *CreateTwcNotaryContractAccountsealimageRequest {
	s.Type = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealimageRequest) SetWidth(v int64) *CreateTwcNotaryContractAccountsealimageRequest {
	s.Width = &v
	return s
}

type CreateTwcNotaryContractAccountsealimageResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 印章fileKey
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty"`
	// 印章高度
	Height *int64 `json:"height,omitempty" xml:"height,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 印章id
	SealId *string `json:"seal_id,omitempty" xml:"seal_id,omitempty"`
	// 印章下载地址, 有效时间1小时
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 印章宽度
	Width *int64 `json:"width,omitempty" xml:"width,omitempty"`
}

func (s CreateTwcNotaryContractAccountsealimageResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractAccountsealimageResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractAccountsealimageResponse) SetReqMsgId(v string) *CreateTwcNotaryContractAccountsealimageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealimageResponse) SetResultCode(v string) *CreateTwcNotaryContractAccountsealimageResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealimageResponse) SetResultMsg(v string) *CreateTwcNotaryContractAccountsealimageResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealimageResponse) SetCode(v int64) *CreateTwcNotaryContractAccountsealimageResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealimageResponse) SetFileKey(v string) *CreateTwcNotaryContractAccountsealimageResponse {
	s.FileKey = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealimageResponse) SetHeight(v int64) *CreateTwcNotaryContractAccountsealimageResponse {
	s.Height = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealimageResponse) SetMessage(v string) *CreateTwcNotaryContractAccountsealimageResponse {
	s.Message = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealimageResponse) SetSealId(v string) *CreateTwcNotaryContractAccountsealimageResponse {
	s.SealId = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealimageResponse) SetUrl(v string) *CreateTwcNotaryContractAccountsealimageResponse {
	s.Url = &v
	return s
}

func (s *CreateTwcNotaryContractAccountsealimageResponse) SetWidth(v int64) *CreateTwcNotaryContractAccountsealimageResponse {
	s.Width = &v
	return s
}

type GetTwcNotaryContractFileuploadurlRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 所属账号id，即个人账号id或机构账号id，如不传，则默认属于对接平台
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 先计算文件md5值，在对该md5值进行base64编码
	ContentMd5 *string `json:"content_md5,omitempty" xml:"content_md5,omitempty"`
	// 目标文件的MIME类型
	ContentType *string `json:"content_type,omitempty" xml:"content_type,omitempty"`
	// 是否转换成pdf文档，默认false，代表不做转换。转换是异步行为，如果指定要转换，需要调用查询文件信息接口查询状态，转换完成后才可使用。
	Convert2Pdf *string `json:"convert_2_pdf,omitempty" xml:"convert_2_pdf,omitempty"`
	// 文件名称（必须带上文件扩展名，不然会导致后续发起流程校验过不去 示例：合同.pdf ）
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// 文件大小，单位byte
	FileSize *int64 `json:"file_size,omitempty" xml:"file_size,omitempty"`
}

func (s GetTwcNotaryContractFileuploadurlRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTwcNotaryContractFileuploadurlRequest) GoString() string {
	return s.String()
}

func (s *GetTwcNotaryContractFileuploadurlRequest) SetAuthToken(v string) *GetTwcNotaryContractFileuploadurlRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTwcNotaryContractFileuploadurlRequest) SetProductInstanceId(v string) *GetTwcNotaryContractFileuploadurlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTwcNotaryContractFileuploadurlRequest) SetRegionName(v string) *GetTwcNotaryContractFileuploadurlRequest {
	s.RegionName = &v
	return s
}

func (s *GetTwcNotaryContractFileuploadurlRequest) SetAccountId(v string) *GetTwcNotaryContractFileuploadurlRequest {
	s.AccountId = &v
	return s
}

func (s *GetTwcNotaryContractFileuploadurlRequest) SetContentMd5(v string) *GetTwcNotaryContractFileuploadurlRequest {
	s.ContentMd5 = &v
	return s
}

func (s *GetTwcNotaryContractFileuploadurlRequest) SetContentType(v string) *GetTwcNotaryContractFileuploadurlRequest {
	s.ContentType = &v
	return s
}

func (s *GetTwcNotaryContractFileuploadurlRequest) SetConvert2Pdf(v string) *GetTwcNotaryContractFileuploadurlRequest {
	s.Convert2Pdf = &v
	return s
}

func (s *GetTwcNotaryContractFileuploadurlRequest) SetFileName(v string) *GetTwcNotaryContractFileuploadurlRequest {
	s.FileName = &v
	return s
}

func (s *GetTwcNotaryContractFileuploadurlRequest) SetFileSize(v int64) *GetTwcNotaryContractFileuploadurlRequest {
	s.FileSize = &v
	return s
}

type GetTwcNotaryContractFileuploadurlResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s GetTwcNotaryContractFileuploadurlResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTwcNotaryContractFileuploadurlResponse) GoString() string {
	return s.String()
}

func (s *GetTwcNotaryContractFileuploadurlResponse) SetReqMsgId(v string) *GetTwcNotaryContractFileuploadurlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTwcNotaryContractFileuploadurlResponse) SetResultCode(v string) *GetTwcNotaryContractFileuploadurlResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTwcNotaryContractFileuploadurlResponse) SetResultMsg(v string) *GetTwcNotaryContractFileuploadurlResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTwcNotaryContractFileuploadurlResponse) SetCode(v int64) *GetTwcNotaryContractFileuploadurlResponse {
	s.Code = &v
	return s
}

func (s *GetTwcNotaryContractFileuploadurlResponse) SetFileId(v string) *GetTwcNotaryContractFileuploadurlResponse {
	s.FileId = &v
	return s
}

func (s *GetTwcNotaryContractFileuploadurlResponse) SetMessage(v string) *GetTwcNotaryContractFileuploadurlResponse {
	s.Message = &v
	return s
}

func (s *GetTwcNotaryContractFileuploadurlResponse) SetUploadUrl(v string) *GetTwcNotaryContractFileuploadurlResponse {
	s.UploadUrl = &v
	return s
}

type AddTwcNotaryContractPlatformsignfieldsRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 流程id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 签署区列表数据
	Signfields *ContractPlatformSignFieldApplication `json:"signfields,omitempty" xml:"signfields,omitempty"`
}

func (s AddTwcNotaryContractPlatformsignfieldsRequest) String() string {
	return tea.Prettify(s)
}

func (s AddTwcNotaryContractPlatformsignfieldsRequest) GoString() string {
	return s.String()
}

func (s *AddTwcNotaryContractPlatformsignfieldsRequest) SetAuthToken(v string) *AddTwcNotaryContractPlatformsignfieldsRequest {
	s.AuthToken = &v
	return s
}

func (s *AddTwcNotaryContractPlatformsignfieldsRequest) SetProductInstanceId(v string) *AddTwcNotaryContractPlatformsignfieldsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddTwcNotaryContractPlatformsignfieldsRequest) SetRegionName(v string) *AddTwcNotaryContractPlatformsignfieldsRequest {
	s.RegionName = &v
	return s
}

func (s *AddTwcNotaryContractPlatformsignfieldsRequest) SetFlowId(v string) *AddTwcNotaryContractPlatformsignfieldsRequest {
	s.FlowId = &v
	return s
}

func (s *AddTwcNotaryContractPlatformsignfieldsRequest) SetSignfields(v *ContractPlatformSignFieldApplication) *AddTwcNotaryContractPlatformsignfieldsRequest {
	s.Signfields = v
	return s
}

type AddTwcNotaryContractPlatformsignfieldsResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 签署区列表数据
	Signfields []*ContractSignField `json:"signfields,omitempty" xml:"signfields,omitempty" type:"Repeated"`
}

func (s AddTwcNotaryContractPlatformsignfieldsResponse) String() string {
	return tea.Prettify(s)
}

func (s AddTwcNotaryContractPlatformsignfieldsResponse) GoString() string {
	return s.String()
}

func (s *AddTwcNotaryContractPlatformsignfieldsResponse) SetReqMsgId(v string) *AddTwcNotaryContractPlatformsignfieldsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddTwcNotaryContractPlatformsignfieldsResponse) SetResultCode(v string) *AddTwcNotaryContractPlatformsignfieldsResponse {
	s.ResultCode = &v
	return s
}

func (s *AddTwcNotaryContractPlatformsignfieldsResponse) SetResultMsg(v string) *AddTwcNotaryContractPlatformsignfieldsResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddTwcNotaryContractPlatformsignfieldsResponse) SetCode(v int64) *AddTwcNotaryContractPlatformsignfieldsResponse {
	s.Code = &v
	return s
}

func (s *AddTwcNotaryContractPlatformsignfieldsResponse) SetMessage(v string) *AddTwcNotaryContractPlatformsignfieldsResponse {
	s.Message = &v
	return s
}

func (s *AddTwcNotaryContractPlatformsignfieldsResponse) SetSignfields(v []*ContractSignField) *AddTwcNotaryContractPlatformsignfieldsResponse {
	s.Signfields = v
	return s
}

type GetTwcNotaryContractFileRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 文件id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
}

func (s GetTwcNotaryContractFileRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTwcNotaryContractFileRequest) GoString() string {
	return s.String()
}

func (s *GetTwcNotaryContractFileRequest) SetAuthToken(v string) *GetTwcNotaryContractFileRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTwcNotaryContractFileRequest) SetProductInstanceId(v string) *GetTwcNotaryContractFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTwcNotaryContractFileRequest) SetRegionName(v string) *GetTwcNotaryContractFileRequest {
	s.RegionName = &v
	return s
}

func (s *GetTwcNotaryContractFileRequest) SetFileId(v string) *GetTwcNotaryContractFileRequest {
	s.FileId = &v
	return s
}

type GetTwcNotaryContractFileResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 下载地址
	DownloadUrl *string `json:"download_url,omitempty" xml:"download_url,omitempty"`
	// 文件id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 文件名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// pdf文件总页数,仅当文件类型为pdf时有值
	PdfTotalPages *int64 `json:"pdf_total_pages,omitempty" xml:"pdf_total_pages,omitempty"`
	// 文件大小，单位byte
	Size *int64 `json:"size,omitempty" xml:"size,omitempty"`
	// 文件状态, 0:文件未上传；1:文件上传中 ；2：文件上传已完成,；3：文件上传失败 ；4：文件等待转pdf ；5：文件已转换pdf 。
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
}

func (s GetTwcNotaryContractFileResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTwcNotaryContractFileResponse) GoString() string {
	return s.String()
}

func (s *GetTwcNotaryContractFileResponse) SetReqMsgId(v string) *GetTwcNotaryContractFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTwcNotaryContractFileResponse) SetResultCode(v string) *GetTwcNotaryContractFileResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTwcNotaryContractFileResponse) SetResultMsg(v string) *GetTwcNotaryContractFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTwcNotaryContractFileResponse) SetCode(v int64) *GetTwcNotaryContractFileResponse {
	s.Code = &v
	return s
}

func (s *GetTwcNotaryContractFileResponse) SetDownloadUrl(v string) *GetTwcNotaryContractFileResponse {
	s.DownloadUrl = &v
	return s
}

func (s *GetTwcNotaryContractFileResponse) SetFileId(v string) *GetTwcNotaryContractFileResponse {
	s.FileId = &v
	return s
}

func (s *GetTwcNotaryContractFileResponse) SetMessage(v string) *GetTwcNotaryContractFileResponse {
	s.Message = &v
	return s
}

func (s *GetTwcNotaryContractFileResponse) SetName(v string) *GetTwcNotaryContractFileResponse {
	s.Name = &v
	return s
}

func (s *GetTwcNotaryContractFileResponse) SetPdfTotalPages(v int64) *GetTwcNotaryContractFileResponse {
	s.PdfTotalPages = &v
	return s
}

func (s *GetTwcNotaryContractFileResponse) SetSize(v int64) *GetTwcNotaryContractFileResponse {
	s.Size = &v
	return s
}

func (s *GetTwcNotaryContractFileResponse) SetStatus(v int64) *GetTwcNotaryContractFileResponse {
	s.Status = &v
	return s
}

type QueryTwcNotaryContractAccountsealsRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 用户id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 分页起始位置
	Offset *int64 `json:"offset,omitempty" xml:"offset,omitempty"`
	// 单页数量
	Size *int64 `json:"size,omitempty" xml:"size,omitempty"`
}

func (s QueryTwcNotaryContractAccountsealsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryContractAccountsealsRequest) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryContractAccountsealsRequest) SetAuthToken(v string) *QueryTwcNotaryContractAccountsealsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwcNotaryContractAccountsealsRequest) SetProductInstanceId(v string) *QueryTwcNotaryContractAccountsealsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwcNotaryContractAccountsealsRequest) SetRegionName(v string) *QueryTwcNotaryContractAccountsealsRequest {
	s.RegionName = &v
	return s
}

func (s *QueryTwcNotaryContractAccountsealsRequest) SetAccountId(v string) *QueryTwcNotaryContractAccountsealsRequest {
	s.AccountId = &v
	return s
}

func (s *QueryTwcNotaryContractAccountsealsRequest) SetOffset(v int64) *QueryTwcNotaryContractAccountsealsRequest {
	s.Offset = &v
	return s
}

func (s *QueryTwcNotaryContractAccountsealsRequest) SetSize(v int64) *QueryTwcNotaryContractAccountsealsRequest {
	s.Size = &v
	return s
}

type QueryTwcNotaryContractAccountsealsResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 印章列表
	Seals []*ContractSeal `json:"seals,omitempty" xml:"seals,omitempty" type:"Repeated"`
	// 查询总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s QueryTwcNotaryContractAccountsealsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryContractAccountsealsResponse) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryContractAccountsealsResponse) SetReqMsgId(v string) *QueryTwcNotaryContractAccountsealsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwcNotaryContractAccountsealsResponse) SetResultCode(v string) *QueryTwcNotaryContractAccountsealsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwcNotaryContractAccountsealsResponse) SetResultMsg(v string) *QueryTwcNotaryContractAccountsealsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwcNotaryContractAccountsealsResponse) SetCode(v int64) *QueryTwcNotaryContractAccountsealsResponse {
	s.Code = &v
	return s
}

func (s *QueryTwcNotaryContractAccountsealsResponse) SetMessage(v string) *QueryTwcNotaryContractAccountsealsResponse {
	s.Message = &v
	return s
}

func (s *QueryTwcNotaryContractAccountsealsResponse) SetSeals(v []*ContractSeal) *QueryTwcNotaryContractAccountsealsResponse {
	s.Seals = v
	return s
}

func (s *QueryTwcNotaryContractAccountsealsResponse) SetTotal(v int64) *QueryTwcNotaryContractAccountsealsResponse {
	s.Total = &v
	return s
}

type QueryTwcNotaryContractOrganizationsealsRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 分页起始位置
	Offset *int64 `json:"offset,omitempty" xml:"offset,omitempty"`
	// 机构id
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty"`
	// 单页数量
	Size *int64 `json:"size,omitempty" xml:"size,omitempty"`
}

func (s QueryTwcNotaryContractOrganizationsealsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryContractOrganizationsealsRequest) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryContractOrganizationsealsRequest) SetAuthToken(v string) *QueryTwcNotaryContractOrganizationsealsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwcNotaryContractOrganizationsealsRequest) SetProductInstanceId(v string) *QueryTwcNotaryContractOrganizationsealsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwcNotaryContractOrganizationsealsRequest) SetRegionName(v string) *QueryTwcNotaryContractOrganizationsealsRequest {
	s.RegionName = &v
	return s
}

func (s *QueryTwcNotaryContractOrganizationsealsRequest) SetOffset(v int64) *QueryTwcNotaryContractOrganizationsealsRequest {
	s.Offset = &v
	return s
}

func (s *QueryTwcNotaryContractOrganizationsealsRequest) SetOrgId(v string) *QueryTwcNotaryContractOrganizationsealsRequest {
	s.OrgId = &v
	return s
}

func (s *QueryTwcNotaryContractOrganizationsealsRequest) SetSize(v int64) *QueryTwcNotaryContractOrganizationsealsRequest {
	s.Size = &v
	return s
}

type QueryTwcNotaryContractOrganizationsealsResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 印章列表
	Seals []*ContractSeal `json:"seals,omitempty" xml:"seals,omitempty" type:"Repeated"`
	// 查询总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s QueryTwcNotaryContractOrganizationsealsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryContractOrganizationsealsResponse) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryContractOrganizationsealsResponse) SetReqMsgId(v string) *QueryTwcNotaryContractOrganizationsealsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwcNotaryContractOrganizationsealsResponse) SetResultCode(v string) *QueryTwcNotaryContractOrganizationsealsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwcNotaryContractOrganizationsealsResponse) SetResultMsg(v string) *QueryTwcNotaryContractOrganizationsealsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwcNotaryContractOrganizationsealsResponse) SetCode(v int64) *QueryTwcNotaryContractOrganizationsealsResponse {
	s.Code = &v
	return s
}

func (s *QueryTwcNotaryContractOrganizationsealsResponse) SetMessage(v string) *QueryTwcNotaryContractOrganizationsealsResponse {
	s.Message = &v
	return s
}

func (s *QueryTwcNotaryContractOrganizationsealsResponse) SetSeals(v []*ContractSeal) *QueryTwcNotaryContractOrganizationsealsResponse {
	s.Seals = v
	return s
}

func (s *QueryTwcNotaryContractOrganizationsealsResponse) SetTotal(v int64) *QueryTwcNotaryContractOrganizationsealsResponse {
	s.Total = &v
	return s
}

type QueryTwcNotaryContractFlowsignerRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 流程id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
}

func (s QueryTwcNotaryContractFlowsignerRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryContractFlowsignerRequest) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryContractFlowsignerRequest) SetAuthToken(v string) *QueryTwcNotaryContractFlowsignerRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwcNotaryContractFlowsignerRequest) SetProductInstanceId(v string) *QueryTwcNotaryContractFlowsignerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwcNotaryContractFlowsignerRequest) SetRegionName(v string) *QueryTwcNotaryContractFlowsignerRequest {
	s.RegionName = &v
	return s
}

func (s *QueryTwcNotaryContractFlowsignerRequest) SetFlowId(v string) *QueryTwcNotaryContractFlowsignerRequest {
	s.FlowId = &v
	return s
}

type QueryTwcNotaryContractFlowsignerResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 签字人列表
	Signers []*ContractFlowSigner `json:"signers,omitempty" xml:"signers,omitempty" type:"Repeated"`
}

func (s QueryTwcNotaryContractFlowsignerResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryContractFlowsignerResponse) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryContractFlowsignerResponse) SetReqMsgId(v string) *QueryTwcNotaryContractFlowsignerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwcNotaryContractFlowsignerResponse) SetResultCode(v string) *QueryTwcNotaryContractFlowsignerResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwcNotaryContractFlowsignerResponse) SetResultMsg(v string) *QueryTwcNotaryContractFlowsignerResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwcNotaryContractFlowsignerResponse) SetCode(v int64) *QueryTwcNotaryContractFlowsignerResponse {
	s.Code = &v
	return s
}

func (s *QueryTwcNotaryContractFlowsignerResponse) SetMessage(v string) *QueryTwcNotaryContractFlowsignerResponse {
	s.Message = &v
	return s
}

func (s *QueryTwcNotaryContractFlowsignerResponse) SetSigners(v []*ContractFlowSigner) *QueryTwcNotaryContractFlowsignerResponse {
	s.Signers = v
	return s
}

type QueryTwcNotaryContractSignfieldsRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 账号id，默认所有签署人
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 流程id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 指定签署区id列表，逗号分割，默认所有签署区
	SignfieldIds *string `json:"signfield_ids,omitempty" xml:"signfield_ids,omitempty"`
}

func (s QueryTwcNotaryContractSignfieldsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryContractSignfieldsRequest) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryContractSignfieldsRequest) SetAuthToken(v string) *QueryTwcNotaryContractSignfieldsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwcNotaryContractSignfieldsRequest) SetProductInstanceId(v string) *QueryTwcNotaryContractSignfieldsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwcNotaryContractSignfieldsRequest) SetRegionName(v string) *QueryTwcNotaryContractSignfieldsRequest {
	s.RegionName = &v
	return s
}

func (s *QueryTwcNotaryContractSignfieldsRequest) SetAccountId(v string) *QueryTwcNotaryContractSignfieldsRequest {
	s.AccountId = &v
	return s
}

func (s *QueryTwcNotaryContractSignfieldsRequest) SetFlowId(v string) *QueryTwcNotaryContractSignfieldsRequest {
	s.FlowId = &v
	return s
}

func (s *QueryTwcNotaryContractSignfieldsRequest) SetSignfieldIds(v string) *QueryTwcNotaryContractSignfieldsRequest {
	s.SignfieldIds = &v
	return s
}

type QueryTwcNotaryContractSignfieldsResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 签署区列表数据
	Signfields []*ContractSignFieldDetail `json:"signfields,omitempty" xml:"signfields,omitempty" type:"Repeated"`
}

func (s QueryTwcNotaryContractSignfieldsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryContractSignfieldsResponse) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryContractSignfieldsResponse) SetReqMsgId(v string) *QueryTwcNotaryContractSignfieldsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwcNotaryContractSignfieldsResponse) SetResultCode(v string) *QueryTwcNotaryContractSignfieldsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwcNotaryContractSignfieldsResponse) SetResultMsg(v string) *QueryTwcNotaryContractSignfieldsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwcNotaryContractSignfieldsResponse) SetCode(v int64) *QueryTwcNotaryContractSignfieldsResponse {
	s.Code = &v
	return s
}

func (s *QueryTwcNotaryContractSignfieldsResponse) SetMessage(v string) *QueryTwcNotaryContractSignfieldsResponse {
	s.Message = &v
	return s
}

func (s *QueryTwcNotaryContractSignfieldsResponse) SetSignfields(v []*ContractSignFieldDetail) *QueryTwcNotaryContractSignfieldsResponse {
	s.Signfields = v
	return s
}

type QueryTwcNotaryContractAccountRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 个人账号id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
}

func (s QueryTwcNotaryContractAccountRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryContractAccountRequest) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryContractAccountRequest) SetAuthToken(v string) *QueryTwcNotaryContractAccountRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwcNotaryContractAccountRequest) SetProductInstanceId(v string) *QueryTwcNotaryContractAccountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwcNotaryContractAccountRequest) SetRegionName(v string) *QueryTwcNotaryContractAccountRequest {
	s.RegionName = &v
	return s
}

func (s *QueryTwcNotaryContractAccountRequest) SetAccountId(v string) *QueryTwcNotaryContractAccountRequest {
	s.AccountId = &v
	return s
}

type QueryTwcNotaryContractAccountResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 个人账号id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 联系方式，邮箱地址
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 证件号
	IdNumber *string `json:"id_number,omitempty" xml:"id_number,omitempty"`
	// 证件类型，详见个人证件类型说明
	IdType *string `json:"id_type,omitempty" xml:"id_type,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 联系方式，手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 第三方平台的用户id
	ThirdPartyUserId *string `json:"third_party_user_id,omitempty" xml:"third_party_user_id,omitempty"`
}

func (s QueryTwcNotaryContractAccountResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryContractAccountResponse) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryContractAccountResponse) SetReqMsgId(v string) *QueryTwcNotaryContractAccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwcNotaryContractAccountResponse) SetResultCode(v string) *QueryTwcNotaryContractAccountResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwcNotaryContractAccountResponse) SetResultMsg(v string) *QueryTwcNotaryContractAccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwcNotaryContractAccountResponse) SetAccountId(v string) *QueryTwcNotaryContractAccountResponse {
	s.AccountId = &v
	return s
}

func (s *QueryTwcNotaryContractAccountResponse) SetCode(v int64) *QueryTwcNotaryContractAccountResponse {
	s.Code = &v
	return s
}

func (s *QueryTwcNotaryContractAccountResponse) SetEmail(v string) *QueryTwcNotaryContractAccountResponse {
	s.Email = &v
	return s
}

func (s *QueryTwcNotaryContractAccountResponse) SetIdNumber(v string) *QueryTwcNotaryContractAccountResponse {
	s.IdNumber = &v
	return s
}

func (s *QueryTwcNotaryContractAccountResponse) SetIdType(v string) *QueryTwcNotaryContractAccountResponse {
	s.IdType = &v
	return s
}

func (s *QueryTwcNotaryContractAccountResponse) SetMessage(v string) *QueryTwcNotaryContractAccountResponse {
	s.Message = &v
	return s
}

func (s *QueryTwcNotaryContractAccountResponse) SetMobile(v string) *QueryTwcNotaryContractAccountResponse {
	s.Mobile = &v
	return s
}

func (s *QueryTwcNotaryContractAccountResponse) SetName(v string) *QueryTwcNotaryContractAccountResponse {
	s.Name = &v
	return s
}

func (s *QueryTwcNotaryContractAccountResponse) SetThirdPartyUserId(v string) *QueryTwcNotaryContractAccountResponse {
	s.ThirdPartyUserId = &v
	return s
}

type QueryTwcNotaryContractOrganizationRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 机构账号id
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty"`
}

func (s QueryTwcNotaryContractOrganizationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryContractOrganizationRequest) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryContractOrganizationRequest) SetAuthToken(v string) *QueryTwcNotaryContractOrganizationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwcNotaryContractOrganizationRequest) SetProductInstanceId(v string) *QueryTwcNotaryContractOrganizationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwcNotaryContractOrganizationRequest) SetRegionName(v string) *QueryTwcNotaryContractOrganizationRequest {
	s.RegionName = &v
	return s
}

func (s *QueryTwcNotaryContractOrganizationRequest) SetOrgId(v string) *QueryTwcNotaryContractOrganizationRequest {
	s.OrgId = &v
	return s
}

type QueryTwcNotaryContractOrganizationResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 证件号
	IdNumber *string `json:"id_number,omitempty" xml:"id_number,omitempty"`
	// 证件类型，详见机构证件类型说明
	IdType *string `json:"id_type,omitempty" xml:"id_type,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 机构名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 机构账号Id
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty"`
	// 企业法人证件号
	OrgLegalIdNumber *string `json:"org_legal_id_number,omitempty" xml:"org_legal_id_number,omitempty"`
	// 企业法人名称
	OrgLegalName *string `json:"org_legal_name,omitempty" xml:"org_legal_name,omitempty"`
	// 第三方平台的机构id
	ThirdPartyUserId *string `json:"third_party_user_id,omitempty" xml:"third_party_user_id,omitempty"`
}

func (s QueryTwcNotaryContractOrganizationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryContractOrganizationResponse) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryContractOrganizationResponse) SetReqMsgId(v string) *QueryTwcNotaryContractOrganizationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwcNotaryContractOrganizationResponse) SetResultCode(v string) *QueryTwcNotaryContractOrganizationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwcNotaryContractOrganizationResponse) SetResultMsg(v string) *QueryTwcNotaryContractOrganizationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwcNotaryContractOrganizationResponse) SetCode(v int64) *QueryTwcNotaryContractOrganizationResponse {
	s.Code = &v
	return s
}

func (s *QueryTwcNotaryContractOrganizationResponse) SetIdNumber(v string) *QueryTwcNotaryContractOrganizationResponse {
	s.IdNumber = &v
	return s
}

func (s *QueryTwcNotaryContractOrganizationResponse) SetIdType(v string) *QueryTwcNotaryContractOrganizationResponse {
	s.IdType = &v
	return s
}

func (s *QueryTwcNotaryContractOrganizationResponse) SetMessage(v string) *QueryTwcNotaryContractOrganizationResponse {
	s.Message = &v
	return s
}

func (s *QueryTwcNotaryContractOrganizationResponse) SetName(v string) *QueryTwcNotaryContractOrganizationResponse {
	s.Name = &v
	return s
}

func (s *QueryTwcNotaryContractOrganizationResponse) SetOrgId(v string) *QueryTwcNotaryContractOrganizationResponse {
	s.OrgId = &v
	return s
}

func (s *QueryTwcNotaryContractOrganizationResponse) SetOrgLegalIdNumber(v string) *QueryTwcNotaryContractOrganizationResponse {
	s.OrgLegalIdNumber = &v
	return s
}

func (s *QueryTwcNotaryContractOrganizationResponse) SetOrgLegalName(v string) *QueryTwcNotaryContractOrganizationResponse {
	s.OrgLegalName = &v
	return s
}

func (s *QueryTwcNotaryContractOrganizationResponse) SetThirdPartyUserId(v string) *QueryTwcNotaryContractOrganizationResponse {
	s.ThirdPartyUserId = &v
	return s
}

type QueryTwcNotaryContractTemplateRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 模板id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty"`
}

func (s QueryTwcNotaryContractTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryContractTemplateRequest) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryContractTemplateRequest) SetAuthToken(v string) *QueryTwcNotaryContractTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwcNotaryContractTemplateRequest) SetProductInstanceId(v string) *QueryTwcNotaryContractTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwcNotaryContractTemplateRequest) SetRegionName(v string) *QueryTwcNotaryContractTemplateRequest {
	s.RegionName = &v
	return s
}

func (s *QueryTwcNotaryContractTemplateRequest) SetTemplateId(v string) *QueryTwcNotaryContractTemplateRequest {
	s.TemplateId = &v
	return s
}

type QueryTwcNotaryContractTemplateResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s QueryTwcNotaryContractTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryContractTemplateResponse) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryContractTemplateResponse) SetReqMsgId(v string) *QueryTwcNotaryContractTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwcNotaryContractTemplateResponse) SetResultCode(v string) *QueryTwcNotaryContractTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwcNotaryContractTemplateResponse) SetResultMsg(v string) *QueryTwcNotaryContractTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwcNotaryContractTemplateResponse) SetCode(v int64) *QueryTwcNotaryContractTemplateResponse {
	s.Code = &v
	return s
}

func (s *QueryTwcNotaryContractTemplateResponse) SetCreateTime(v int64) *QueryTwcNotaryContractTemplateResponse {
	s.CreateTime = &v
	return s
}

func (s *QueryTwcNotaryContractTemplateResponse) SetDownloadUrl(v string) *QueryTwcNotaryContractTemplateResponse {
	s.DownloadUrl = &v
	return s
}

func (s *QueryTwcNotaryContractTemplateResponse) SetFileSize(v int64) *QueryTwcNotaryContractTemplateResponse {
	s.FileSize = &v
	return s
}

func (s *QueryTwcNotaryContractTemplateResponse) SetMessage(v string) *QueryTwcNotaryContractTemplateResponse {
	s.Message = &v
	return s
}

func (s *QueryTwcNotaryContractTemplateResponse) SetStructComponents(v []*ContractTemplateStructComponent) *QueryTwcNotaryContractTemplateResponse {
	s.StructComponents = v
	return s
}

func (s *QueryTwcNotaryContractTemplateResponse) SetTemplateId(v string) *QueryTwcNotaryContractTemplateResponse {
	s.TemplateId = &v
	return s
}

func (s *QueryTwcNotaryContractTemplateResponse) SetTemplateName(v string) *QueryTwcNotaryContractTemplateResponse {
	s.TemplateName = &v
	return s
}

func (s *QueryTwcNotaryContractTemplateResponse) SetUpdateTime(v int64) *QueryTwcNotaryContractTemplateResponse {
	s.UpdateTime = &v
	return s
}

type CreateTwcNotaryContractSignflowRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 是否自动归档，默认false 如设置为true，则在流程开启后，当所有签署人签署完毕，系统自动将流程归档，状态变为“已完成”状态，在流程状态为“已完成”前，可随时添加签署人；如设置为false，则在调用流程开启后，需主动调用签署流程归档接口，将流程状态变更为“已完成”，归档前可随时添加签署人；已完成的流程才可下载签署后的文件
	AutoArchive *bool `json:"auto_archive,omitempty" xml:"auto_archive,omitempty"`
	// 文件主题
	BusinessScene *string `json:"business_scene,omitempty" xml:"business_scene,omitempty"`
	// 任务配置信息
	ContractSignFlowConfig *ContractSignFlowConfig `json:"contract_sign_flow_config,omitempty" xml:"contract_sign_flow_config,omitempty"`
	// 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
	InitiatorAccountId *string `json:"initiator_account_id,omitempty" xml:"initiator_account_id,omitempty"`
	// 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
	InitiatorAuthorizedAccountId *string `json:"initiator_authorized_account_id,omitempty" xml:"initiator_authorized_account_id,omitempty"`
	// 签署平台，ALIPAY（支付宝小程序）或H5
	SignPlatform *string `json:"sign_platform,omitempty" xml:"sign_platform,omitempty"`
	// 签署有效截止日期，毫秒，默认3天失效
	SignValidity *int64 `json:"sign_validity,omitempty" xml:"sign_validity,omitempty"`
}

func (s CreateTwcNotaryContractSignflowRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractSignflowRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractSignflowRequest) SetAuthToken(v string) *CreateTwcNotaryContractSignflowRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryContractSignflowRequest) SetProductInstanceId(v string) *CreateTwcNotaryContractSignflowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryContractSignflowRequest) SetRegionName(v string) *CreateTwcNotaryContractSignflowRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryContractSignflowRequest) SetAutoArchive(v bool) *CreateTwcNotaryContractSignflowRequest {
	s.AutoArchive = &v
	return s
}

func (s *CreateTwcNotaryContractSignflowRequest) SetBusinessScene(v string) *CreateTwcNotaryContractSignflowRequest {
	s.BusinessScene = &v
	return s
}

func (s *CreateTwcNotaryContractSignflowRequest) SetContractSignFlowConfig(v *ContractSignFlowConfig) *CreateTwcNotaryContractSignflowRequest {
	s.ContractSignFlowConfig = v
	return s
}

func (s *CreateTwcNotaryContractSignflowRequest) SetInitiatorAccountId(v string) *CreateTwcNotaryContractSignflowRequest {
	s.InitiatorAccountId = &v
	return s
}

func (s *CreateTwcNotaryContractSignflowRequest) SetInitiatorAuthorizedAccountId(v string) *CreateTwcNotaryContractSignflowRequest {
	s.InitiatorAuthorizedAccountId = &v
	return s
}

func (s *CreateTwcNotaryContractSignflowRequest) SetSignPlatform(v string) *CreateTwcNotaryContractSignflowRequest {
	s.SignPlatform = &v
	return s
}

func (s *CreateTwcNotaryContractSignflowRequest) SetSignValidity(v int64) *CreateTwcNotaryContractSignflowRequest {
	s.SignValidity = &v
	return s
}

type CreateTwcNotaryContractSignflowResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 签约流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s CreateTwcNotaryContractSignflowResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractSignflowResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractSignflowResponse) SetReqMsgId(v string) *CreateTwcNotaryContractSignflowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryContractSignflowResponse) SetResultCode(v string) *CreateTwcNotaryContractSignflowResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryContractSignflowResponse) SetResultMsg(v string) *CreateTwcNotaryContractSignflowResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryContractSignflowResponse) SetCode(v int64) *CreateTwcNotaryContractSignflowResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryContractSignflowResponse) SetFlowId(v string) *CreateTwcNotaryContractSignflowResponse {
	s.FlowId = &v
	return s
}

func (s *CreateTwcNotaryContractSignflowResponse) SetMessage(v string) *CreateTwcNotaryContractSignflowResponse {
	s.Message = &v
	return s
}

type CreateTwcNotaryContractRegisterzftRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 地址。商户详细经营地址或人员所在地点
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 代理商户的账户
	AgentAccountId *string `json:"agent_account_id,omitempty" xml:"agent_account_id,omitempty"`
	// 商户别名
	AliasName *string `json:"alias_name,omitempty" xml:"alias_name,omitempty"`
	// 商户支付宝账户
	AlipayLogonId *string `json:"alipay_logon_id,omitempty" xml:"alipay_logon_id,omitempty"`
	// 申请时间
	ApplyTime *string `json:"apply_time,omitempty" xml:"apply_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 二级商户支付宝账户，用于协议确认。目前商业场景（除医疗、中小学教育等）下必填。本字段要求与商户名称name同名，且是实名认证支付宝账户
	BindingAlipayLogonId *string `json:"binding_alipay_logon_id,omitempty" xml:"binding_alipay_logon_id,omitempty"`
	// 结算卡id
	CardAliasNo *string `json:"card_alias_no,omitempty" xml:"card_alias_no,omitempty"`
	// 营业执照图片url，本业务接口中，如果是特殊行业必填。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	CertImage *string `json:"cert_image,omitempty" xml:"cert_image,omitempty"`
	// 商户社会信用码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 商户证件类型，取值范围：201：营业执照；2011:营业执照(统一社会信用代码)；204：民办非企业登记证书；206：社会团体法人登记证书；218：事业单位法人证书；219：党政机关批准设立文件/行政执法主体资格证；100：个人商户身份证
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty"`
	// 城市编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。
	// （参考资料：
	// http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
	CityCode *string `json:"city_code,omitempty" xml:"city_code,omitempty"`
	// 电子邮箱
	ContactEmail *string `json:"contact_email,omitempty" xml:"contact_email,omitempty"`
	// 商户联系人信息
	ContactMobile *string `json:"contact_mobile,omitempty" xml:"contact_mobile,omitempty"`
	// 联系人名字
	ContactName *string `json:"contact_name,omitempty" xml:"contact_name,omitempty"`
	// 商户联系人电话信息
	ContactPhone *string `json:"contact_phone,omitempty" xml:"contact_phone,omitempty"`
	// 商户联系人业务标识枚举，表示商户联系人的职责。异议处理接口人:02;商户关键联系人:06;数据反馈接口人:11;服务联动接口人:08
	ContactTag *string `json:"contact_tag,omitempty" xml:"contact_tag,omitempty"`
	// 联系人类型，取值范围：LEGAL_PERSON：法人；CONTROLLER：实际控制人；AGENT：代理人；OTHER：其他
	ContactType *string `json:"contact_type,omitempty" xml:"contact_type,omitempty"`
	// 区县编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。
	// （参考资料：
	// http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
	DistrictCode *string `json:"district_code,omitempty" xml:"district_code,omitempty"`
	// 返回申请单相关参数。当前返回内容有cardAliasNo，smid
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	// 商户角色id。审核通过后生成。间连商户或平台商二级商户业务中，本字段表示smid
	IpRoleId *string `json:"ip_role_id,omitempty" xml:"ip_role_id,omitempty"`
	// 法人身份证反面url，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。本业务接口中，如果是特殊行业必填
	LegalCertBackImage *string `json:"legal_cert_back_image,omitempty" xml:"legal_cert_back_image,omitempty"`
	// 法人身份证正面url，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。本业务接口中，如果是特殊行业必填
	LegalCertFrontImage *string `json:"legal_cert_front_image,omitempty" xml:"legal_cert_front_image,omitempty"`
	// 法人身份证号
	LegalCertNo *string `json:"legal_cert_no,omitempty" xml:"legal_cert_no,omitempty"`
	// 法人名称
	LegalName *string `json:"legal_name,omitempty" xml:"legal_name,omitempty"`
	// 商户类别码mcc，参见附件描述中的“类目code” https://gw.alipayobjects.com/os/basement_prod/82cb70f7-abbd-417a-91ba-73c1849f07ea.xlsx 如果要求资质一栏不为空，表明是特殊行业，会有人工审核。注：文档更新可能有滞后性，以实际为准
	Mcc *string `json:"mcc,omitempty" xml:"mcc,omitempty"`
	// 蚂蚁金服（杭*****术有限公司
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty"`
	// 商家类型：01：企业；02：事业单位；03：民办非企业组织；04：社会团体；05：党政及国家机关；06：个人商户；07：个体工商户
	MerchantType *string `json:"merchant_type,omitempty" xml:"merchant_type,omitempty"`
	// 商户名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 申请单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 外部业务号。比如某种业务标准外部订单号,比如交易外部订单号，代表服务商端自己订单号。用于做并发控制，防止一笔外部订单发起两次进件。非必要场景禁止传入本字段，如要使用务必理清场景及字段生成规则，与蚂蚁金服对接人咨询。
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 门头照，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。如果使用当面付服务则必填
	OutDoorImage *string `json:"out_door_image,omitempty" xml:"out_door_image,omitempty"`
	// 商户在智能合同平台唯一id
	PlatformTuid *string `json:"platform_tuid,omitempty" xml:"platform_tuid,omitempty"`
	// 省份编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。
	// （参考资料：
	// http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
	ProvinceCode *string `json:"province_code,omitempty" xml:"province_code,omitempty"`
	// 商户使用服务，可选值有：当面付、app支付、wap支付、电脑支付
	Service *string `json:"service,omitempty" xml:"service,omitempty"`
	// 客服电话
	ServicePhone *string `json:"service_phone,omitempty" xml:"service_phone,omitempty"`
	// 二级商户与服务商的签约时间
	SignTimeWithIsv *string `json:"sign_time_with_isv,omitempty" xml:"sign_time_with_isv,omitempty"`
	// 站点名称
	SiteName *string `json:"site_name,omitempty" xml:"site_name,omitempty"`
	// 网站：01
	// APP : 02
	// 服务窗:03
	// 公众号:04
	// 其他:05
	// 支付宝小程序:06
	SiteType *string `json:"site_type,omitempty" xml:"site_type,omitempty"`
	// 站点地址
	SiteUrl *string `json:"site_url,omitempty" xml:"site_url,omitempty"`
	// 二级商户id
	Smid *string `json:"smid,omitempty" xml:"smid,omitempty"`
	// 申请单状态。99:已完结;-1:失败;031:已提交审核
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 0表示不更新，1表示强制更新
	Update *int64 `json:"update,omitempty" xml:"update,omitempty"`
}

func (s CreateTwcNotaryContractRegisterzftRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractRegisterzftRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetAuthToken(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetProductInstanceId(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetRegionName(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetAddress(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.Address = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetAgentAccountId(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.AgentAccountId = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetAliasName(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.AliasName = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetAlipayLogonId(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.AlipayLogonId = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetApplyTime(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.ApplyTime = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetBindingAlipayLogonId(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.BindingAlipayLogonId = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetCardAliasNo(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.CardAliasNo = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetCertImage(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.CertImage = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetCertNo(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.CertNo = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetCertType(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.CertType = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetCityCode(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.CityCode = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetContactEmail(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.ContactEmail = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetContactMobile(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.ContactMobile = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetContactName(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.ContactName = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetContactPhone(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.ContactPhone = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetContactTag(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.ContactTag = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetContactType(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.ContactType = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetDistrictCode(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.DistrictCode = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetExtInfo(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.ExtInfo = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetIpRoleId(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.IpRoleId = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetLegalCertBackImage(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.LegalCertBackImage = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetLegalCertFrontImage(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.LegalCertFrontImage = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetLegalCertNo(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.LegalCertNo = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetLegalName(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.LegalName = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetMcc(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.Mcc = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetMerchantName(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.MerchantName = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetMerchantType(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.MerchantType = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetName(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.Name = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetOrderId(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.OrderId = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetOutBizNo(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.OutBizNo = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetOutDoorImage(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.OutDoorImage = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetPlatformTuid(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.PlatformTuid = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetProvinceCode(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.ProvinceCode = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetService(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.Service = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetServicePhone(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.ServicePhone = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetSignTimeWithIsv(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.SignTimeWithIsv = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetSiteName(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.SiteName = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetSiteType(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.SiteType = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetSiteUrl(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.SiteUrl = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetSmid(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.Smid = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetStatus(v string) *CreateTwcNotaryContractRegisterzftRequest {
	s.Status = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftRequest) SetUpdate(v int64) *CreateTwcNotaryContractRegisterzftRequest {
	s.Update = &v
	return s
}

type CreateTwcNotaryContractRegisterzftResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
}

func (s CreateTwcNotaryContractRegisterzftResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractRegisterzftResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractRegisterzftResponse) SetReqMsgId(v string) *CreateTwcNotaryContractRegisterzftResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftResponse) SetResultCode(v string) *CreateTwcNotaryContractRegisterzftResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftResponse) SetResultMsg(v string) *CreateTwcNotaryContractRegisterzftResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryContractRegisterzftResponse) SetCode(v string) *CreateTwcNotaryContractRegisterzftResponse {
	s.Code = &v
	return s
}

type CreateTwcNotaryContractPlatformtemplateRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 是否包含代扣规则，如果设置为true，则在创建手动签署流程时，必须传入代扣规则。默认为false
	AutoDeduction *bool `json:"auto_deduction,omitempty" xml:"auto_deduction,omitempty"`
	// 是否强制用户选择代扣
	AutoDeductionForce *bool `json:"auto_deduction_force,omitempty" xml:"auto_deduction_force,omitempty"`
	// Base64编码的模板文件的MD5值
	ContentMd5 *string `json:"content_md5,omitempty" xml:"content_md5,omitempty"`
	// 目标文件的MIME类型
	ContentType *string `json:"content_type,omitempty" xml:"content_type,omitempty"`
	// 是否需要转成pdf，如果模板文件为.doc/.docx 传true，为pdf传false
	Convert2Pdf *bool `json:"convert2_pdf,omitempty" xml:"convert2_pdf,omitempty"`
	// 文件名称，必须带扩展名如:.pdf,.doc,.docx
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// 平台方的签署信息列表
	SignFields []*ContractPlatformSignField `json:"sign_fields,omitempty" xml:"sign_fields,omitempty" type:"Repeated"`
	// 用户需要签章的页面列表（默认为最后一页）
	UserSignPages []*int64 `json:"user_sign_pages,omitempty" xml:"user_sign_pages,omitempty" type:"Repeated"`
}

func (s CreateTwcNotaryContractPlatformtemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractPlatformtemplateRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractPlatformtemplateRequest) SetAuthToken(v string) *CreateTwcNotaryContractPlatformtemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryContractPlatformtemplateRequest) SetProductInstanceId(v string) *CreateTwcNotaryContractPlatformtemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryContractPlatformtemplateRequest) SetRegionName(v string) *CreateTwcNotaryContractPlatformtemplateRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryContractPlatformtemplateRequest) SetAutoDeduction(v bool) *CreateTwcNotaryContractPlatformtemplateRequest {
	s.AutoDeduction = &v
	return s
}

func (s *CreateTwcNotaryContractPlatformtemplateRequest) SetAutoDeductionForce(v bool) *CreateTwcNotaryContractPlatformtemplateRequest {
	s.AutoDeductionForce = &v
	return s
}

func (s *CreateTwcNotaryContractPlatformtemplateRequest) SetContentMd5(v string) *CreateTwcNotaryContractPlatformtemplateRequest {
	s.ContentMd5 = &v
	return s
}

func (s *CreateTwcNotaryContractPlatformtemplateRequest) SetContentType(v string) *CreateTwcNotaryContractPlatformtemplateRequest {
	s.ContentType = &v
	return s
}

func (s *CreateTwcNotaryContractPlatformtemplateRequest) SetConvert2Pdf(v bool) *CreateTwcNotaryContractPlatformtemplateRequest {
	s.Convert2Pdf = &v
	return s
}

func (s *CreateTwcNotaryContractPlatformtemplateRequest) SetFileName(v string) *CreateTwcNotaryContractPlatformtemplateRequest {
	s.FileName = &v
	return s
}

func (s *CreateTwcNotaryContractPlatformtemplateRequest) SetSignFields(v []*ContractPlatformSignField) *CreateTwcNotaryContractPlatformtemplateRequest {
	s.SignFields = v
	return s
}

func (s *CreateTwcNotaryContractPlatformtemplateRequest) SetUserSignPages(v []*int64) *CreateTwcNotaryContractPlatformtemplateRequest {
	s.UserSignPages = v
	return s
}

type CreateTwcNotaryContractPlatformtemplateResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s CreateTwcNotaryContractPlatformtemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractPlatformtemplateResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractPlatformtemplateResponse) SetReqMsgId(v string) *CreateTwcNotaryContractPlatformtemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryContractPlatformtemplateResponse) SetResultCode(v string) *CreateTwcNotaryContractPlatformtemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryContractPlatformtemplateResponse) SetResultMsg(v string) *CreateTwcNotaryContractPlatformtemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryContractPlatformtemplateResponse) SetCode(v int64) *CreateTwcNotaryContractPlatformtemplateResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryContractPlatformtemplateResponse) SetMessage(v string) *CreateTwcNotaryContractPlatformtemplateResponse {
	s.Message = &v
	return s
}

func (s *CreateTwcNotaryContractPlatformtemplateResponse) SetTemplateId(v string) *CreateTwcNotaryContractPlatformtemplateResponse {
	s.TemplateId = &v
	return s
}

func (s *CreateTwcNotaryContractPlatformtemplateResponse) SetUploadUrl(v string) *CreateTwcNotaryContractPlatformtemplateResponse {
	s.UploadUrl = &v
	return s
}

type QueryTwcNotaryContractMerchantzftRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 代理商户账户
	AgentAccountId *string `json:"agent_account_id,omitempty" xml:"agent_account_id,omitempty"`
}

func (s QueryTwcNotaryContractMerchantzftRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryContractMerchantzftRequest) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryContractMerchantzftRequest) SetAuthToken(v string) *QueryTwcNotaryContractMerchantzftRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwcNotaryContractMerchantzftRequest) SetProductInstanceId(v string) *QueryTwcNotaryContractMerchantzftRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwcNotaryContractMerchantzftRequest) SetRegionName(v string) *QueryTwcNotaryContractMerchantzftRequest {
	s.RegionName = &v
	return s
}

func (s *QueryTwcNotaryContractMerchantzftRequest) SetAgentAccountId(v string) *QueryTwcNotaryContractMerchantzftRequest {
	s.AgentAccountId = &v
	return s
}

type QueryTwcNotaryContractMerchantzftResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 0表示成功，其他为失败
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 商户入驻查询信息
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 错误信息描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
}

func (s QueryTwcNotaryContractMerchantzftResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryContractMerchantzftResponse) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryContractMerchantzftResponse) SetReqMsgId(v string) *QueryTwcNotaryContractMerchantzftResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwcNotaryContractMerchantzftResponse) SetResultCode(v string) *QueryTwcNotaryContractMerchantzftResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwcNotaryContractMerchantzftResponse) SetResultMsg(v string) *QueryTwcNotaryContractMerchantzftResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwcNotaryContractMerchantzftResponse) SetCode(v int64) *QueryTwcNotaryContractMerchantzftResponse {
	s.Code = &v
	return s
}

func (s *QueryTwcNotaryContractMerchantzftResponse) SetData(v string) *QueryTwcNotaryContractMerchantzftResponse {
	s.Data = &v
	return s
}

func (s *QueryTwcNotaryContractMerchantzftResponse) SetErrMessage(v string) *QueryTwcNotaryContractMerchantzftResponse {
	s.ErrMessage = &v
	return s
}

type ListTwcNotaryContractOuttradeidRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 合同id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 分页第几页
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty"`
	// 每页的大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s ListTwcNotaryContractOuttradeidRequest) String() string {
	return tea.Prettify(s)
}

func (s ListTwcNotaryContractOuttradeidRequest) GoString() string {
	return s.String()
}

func (s *ListTwcNotaryContractOuttradeidRequest) SetAuthToken(v string) *ListTwcNotaryContractOuttradeidRequest {
	s.AuthToken = &v
	return s
}

func (s *ListTwcNotaryContractOuttradeidRequest) SetProductInstanceId(v string) *ListTwcNotaryContractOuttradeidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListTwcNotaryContractOuttradeidRequest) SetRegionName(v string) *ListTwcNotaryContractOuttradeidRequest {
	s.RegionName = &v
	return s
}

func (s *ListTwcNotaryContractOuttradeidRequest) SetFlowId(v string) *ListTwcNotaryContractOuttradeidRequest {
	s.FlowId = &v
	return s
}

func (s *ListTwcNotaryContractOuttradeidRequest) SetPageIndex(v int64) *ListTwcNotaryContractOuttradeidRequest {
	s.PageIndex = &v
	return s
}

func (s *ListTwcNotaryContractOuttradeidRequest) SetPageSize(v int64) *ListTwcNotaryContractOuttradeidRequest {
	s.PageSize = &v
	return s
}

type ListTwcNotaryContractOuttradeidResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 所有符合条件交易相关的id
	OutTradeNo []*string `json:"out_trade_no,omitempty" xml:"out_trade_no,omitempty" type:"Repeated"`
	// 总符合条件的交易个数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s ListTwcNotaryContractOuttradeidResponse) String() string {
	return tea.Prettify(s)
}

func (s ListTwcNotaryContractOuttradeidResponse) GoString() string {
	return s.String()
}

func (s *ListTwcNotaryContractOuttradeidResponse) SetReqMsgId(v string) *ListTwcNotaryContractOuttradeidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListTwcNotaryContractOuttradeidResponse) SetResultCode(v string) *ListTwcNotaryContractOuttradeidResponse {
	s.ResultCode = &v
	return s
}

func (s *ListTwcNotaryContractOuttradeidResponse) SetResultMsg(v string) *ListTwcNotaryContractOuttradeidResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListTwcNotaryContractOuttradeidResponse) SetCode(v int64) *ListTwcNotaryContractOuttradeidResponse {
	s.Code = &v
	return s
}

func (s *ListTwcNotaryContractOuttradeidResponse) SetErrMessage(v string) *ListTwcNotaryContractOuttradeidResponse {
	s.ErrMessage = &v
	return s
}

func (s *ListTwcNotaryContractOuttradeidResponse) SetOutTradeNo(v []*string) *ListTwcNotaryContractOuttradeidResponse {
	s.OutTradeNo = v
	return s
}

func (s *ListTwcNotaryContractOuttradeidResponse) SetTotal(v int64) *ListTwcNotaryContractOuttradeidResponse {
	s.Total = &v
	return s
}

type QueryTwcNotaryContractTradedetailRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 合同id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// out_trade_no
	OutTradeNo *string `json:"out_trade_no,omitempty" xml:"out_trade_no,omitempty"`
}

func (s QueryTwcNotaryContractTradedetailRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryContractTradedetailRequest) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryContractTradedetailRequest) SetAuthToken(v string) *QueryTwcNotaryContractTradedetailRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwcNotaryContractTradedetailRequest) SetProductInstanceId(v string) *QueryTwcNotaryContractTradedetailRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwcNotaryContractTradedetailRequest) SetRegionName(v string) *QueryTwcNotaryContractTradedetailRequest {
	s.RegionName = &v
	return s
}

func (s *QueryTwcNotaryContractTradedetailRequest) SetFlowId(v string) *QueryTwcNotaryContractTradedetailRequest {
	s.FlowId = &v
	return s
}

func (s *QueryTwcNotaryContractTradedetailRequest) SetOutTradeNo(v string) *QueryTwcNotaryContractTradedetailRequest {
	s.OutTradeNo = &v
	return s
}

type QueryTwcNotaryContractTradedetailResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 订单详情
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 错误信息描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
}

func (s QueryTwcNotaryContractTradedetailResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryContractTradedetailResponse) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryContractTradedetailResponse) SetReqMsgId(v string) *QueryTwcNotaryContractTradedetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwcNotaryContractTradedetailResponse) SetResultCode(v string) *QueryTwcNotaryContractTradedetailResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwcNotaryContractTradedetailResponse) SetResultMsg(v string) *QueryTwcNotaryContractTradedetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwcNotaryContractTradedetailResponse) SetCode(v int64) *QueryTwcNotaryContractTradedetailResponse {
	s.Code = &v
	return s
}

func (s *QueryTwcNotaryContractTradedetailResponse) SetData(v string) *QueryTwcNotaryContractTradedetailResponse {
	s.Data = &v
	return s
}

func (s *QueryTwcNotaryContractTradedetailResponse) SetErrMessage(v string) *QueryTwcNotaryContractTradedetailResponse {
	s.ErrMessage = &v
	return s
}

type CreateTwcNotaryContractMerchantrefundRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 合同id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 退款请求对应的码
	OutRequestNo *string `json:"out_request_no,omitempty" xml:"out_request_no,omitempty"`
	// 订单id
	OutTradeNo *string `json:"out_trade_no,omitempty" xml:"out_trade_no,omitempty"`
	// 退款金额
	RefundAmount *int64 `json:"refund_amount,omitempty" xml:"refund_amount,omitempty"`
}

func (s CreateTwcNotaryContractMerchantrefundRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractMerchantrefundRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractMerchantrefundRequest) SetAuthToken(v string) *CreateTwcNotaryContractMerchantrefundRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantrefundRequest) SetProductInstanceId(v string) *CreateTwcNotaryContractMerchantrefundRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantrefundRequest) SetRegionName(v string) *CreateTwcNotaryContractMerchantrefundRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantrefundRequest) SetFlowId(v string) *CreateTwcNotaryContractMerchantrefundRequest {
	s.FlowId = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantrefundRequest) SetOutRequestNo(v string) *CreateTwcNotaryContractMerchantrefundRequest {
	s.OutRequestNo = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantrefundRequest) SetOutTradeNo(v string) *CreateTwcNotaryContractMerchantrefundRequest {
	s.OutTradeNo = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantrefundRequest) SetRefundAmount(v int64) *CreateTwcNotaryContractMerchantrefundRequest {
	s.RefundAmount = &v
	return s
}

type CreateTwcNotaryContractMerchantrefundResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s CreateTwcNotaryContractMerchantrefundResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractMerchantrefundResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractMerchantrefundResponse) SetReqMsgId(v string) *CreateTwcNotaryContractMerchantrefundResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantrefundResponse) SetResultCode(v string) *CreateTwcNotaryContractMerchantrefundResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantrefundResponse) SetResultMsg(v string) *CreateTwcNotaryContractMerchantrefundResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantrefundResponse) SetCode(v int64) *CreateTwcNotaryContractMerchantrefundResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantrefundResponse) SetMessage(v string) *CreateTwcNotaryContractMerchantrefundResponse {
	s.Message = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantrefundResponse) SetOutRequestNo(v string) *CreateTwcNotaryContractMerchantrefundResponse {
	s.OutRequestNo = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantrefundResponse) SetOutTradeNo(v string) *CreateTwcNotaryContractMerchantrefundResponse {
	s.OutTradeNo = &v
	return s
}

type CreateTwcNotaryContractAdminaccountRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
}

func (s CreateTwcNotaryContractAdminaccountRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractAdminaccountRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractAdminaccountRequest) SetAuthToken(v string) *CreateTwcNotaryContractAdminaccountRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryContractAdminaccountRequest) SetProductInstanceId(v string) *CreateTwcNotaryContractAdminaccountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryContractAdminaccountRequest) SetRegionName(v string) *CreateTwcNotaryContractAdminaccountRequest {
	s.RegionName = &v
	return s
}

type CreateTwcNotaryContractAdminaccountResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
}

func (s CreateTwcNotaryContractAdminaccountResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractAdminaccountResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractAdminaccountResponse) SetReqMsgId(v string) *CreateTwcNotaryContractAdminaccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryContractAdminaccountResponse) SetResultCode(v string) *CreateTwcNotaryContractAdminaccountResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryContractAdminaccountResponse) SetResultMsg(v string) *CreateTwcNotaryContractAdminaccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryContractAdminaccountResponse) SetCode(v int64) *CreateTwcNotaryContractAdminaccountResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryContractAdminaccountResponse) SetErrMessage(v string) *CreateTwcNotaryContractAdminaccountResponse {
	s.ErrMessage = &v
	return s
}

type ListTwcNotaryContractTradeidsRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 合同id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 1
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty"`
	// 页面大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s ListTwcNotaryContractTradeidsRequest) String() string {
	return tea.Prettify(s)
}

func (s ListTwcNotaryContractTradeidsRequest) GoString() string {
	return s.String()
}

func (s *ListTwcNotaryContractTradeidsRequest) SetAuthToken(v string) *ListTwcNotaryContractTradeidsRequest {
	s.AuthToken = &v
	return s
}

func (s *ListTwcNotaryContractTradeidsRequest) SetProductInstanceId(v string) *ListTwcNotaryContractTradeidsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListTwcNotaryContractTradeidsRequest) SetRegionName(v string) *ListTwcNotaryContractTradeidsRequest {
	s.RegionName = &v
	return s
}

func (s *ListTwcNotaryContractTradeidsRequest) SetFlowId(v string) *ListTwcNotaryContractTradeidsRequest {
	s.FlowId = &v
	return s
}

func (s *ListTwcNotaryContractTradeidsRequest) SetPageIndex(v int64) *ListTwcNotaryContractTradeidsRequest {
	s.PageIndex = &v
	return s
}

func (s *ListTwcNotaryContractTradeidsRequest) SetPageSize(v int64) *ListTwcNotaryContractTradeidsRequest {
	s.PageSize = &v
	return s
}

type ListTwcNotaryContractTradeidsResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 所有满足条件的订单
	OutTradeNo []*string `json:"out_trade_no,omitempty" xml:"out_trade_no,omitempty" type:"Repeated"`
	// 所有item的个数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s ListTwcNotaryContractTradeidsResponse) String() string {
	return tea.Prettify(s)
}

func (s ListTwcNotaryContractTradeidsResponse) GoString() string {
	return s.String()
}

func (s *ListTwcNotaryContractTradeidsResponse) SetReqMsgId(v string) *ListTwcNotaryContractTradeidsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListTwcNotaryContractTradeidsResponse) SetResultCode(v string) *ListTwcNotaryContractTradeidsResponse {
	s.ResultCode = &v
	return s
}

func (s *ListTwcNotaryContractTradeidsResponse) SetResultMsg(v string) *ListTwcNotaryContractTradeidsResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListTwcNotaryContractTradeidsResponse) SetCode(v int64) *ListTwcNotaryContractTradeidsResponse {
	s.Code = &v
	return s
}

func (s *ListTwcNotaryContractTradeidsResponse) SetErrMessage(v string) *ListTwcNotaryContractTradeidsResponse {
	s.ErrMessage = &v
	return s
}

func (s *ListTwcNotaryContractTradeidsResponse) SetOutTradeNo(v []*string) *ListTwcNotaryContractTradeidsResponse {
	s.OutTradeNo = v
	return s
}

func (s *ListTwcNotaryContractTradeidsResponse) SetTotal(v int64) *ListTwcNotaryContractTradeidsResponse {
	s.Total = &v
	return s
}

type CreateTwcNotaryContractCommontriggerRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 合同id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 代扣规则详情
	RepaymentOrderInfo []*RepaymentOrderRequest `json:"repayment_order_info,omitempty" xml:"repayment_order_info,omitempty" type:"Repeated"`
	// 用户在智能合同平台的身份
	UserTuid *string `json:"user_tuid,omitempty" xml:"user_tuid,omitempty"`
}

func (s CreateTwcNotaryContractCommontriggerRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractCommontriggerRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractCommontriggerRequest) SetAuthToken(v string) *CreateTwcNotaryContractCommontriggerRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryContractCommontriggerRequest) SetProductInstanceId(v string) *CreateTwcNotaryContractCommontriggerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryContractCommontriggerRequest) SetRegionName(v string) *CreateTwcNotaryContractCommontriggerRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryContractCommontriggerRequest) SetFlowId(v string) *CreateTwcNotaryContractCommontriggerRequest {
	s.FlowId = &v
	return s
}

func (s *CreateTwcNotaryContractCommontriggerRequest) SetRepaymentOrderInfo(v []*RepaymentOrderRequest) *CreateTwcNotaryContractCommontriggerRequest {
	s.RepaymentOrderInfo = v
	return s
}

func (s *CreateTwcNotaryContractCommontriggerRequest) SetUserTuid(v string) *CreateTwcNotaryContractCommontriggerRequest {
	s.UserTuid = &v
	return s
}

type CreateTwcNotaryContractCommontriggerResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s CreateTwcNotaryContractCommontriggerResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractCommontriggerResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractCommontriggerResponse) SetReqMsgId(v string) *CreateTwcNotaryContractCommontriggerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryContractCommontriggerResponse) SetResultCode(v string) *CreateTwcNotaryContractCommontriggerResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryContractCommontriggerResponse) SetResultMsg(v string) *CreateTwcNotaryContractCommontriggerResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryContractCommontriggerResponse) SetCode(v int64) *CreateTwcNotaryContractCommontriggerResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryContractCommontriggerResponse) SetErrMessage(v string) *CreateTwcNotaryContractCommontriggerResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateTwcNotaryContractCommontriggerResponse) SetFlowId(v string) *CreateTwcNotaryContractCommontriggerResponse {
	s.FlowId = &v
	return s
}

func (s *CreateTwcNotaryContractCommontriggerResponse) SetPlatformTuid(v string) *CreateTwcNotaryContractCommontriggerResponse {
	s.PlatformTuid = &v
	return s
}

func (s *CreateTwcNotaryContractCommontriggerResponse) SetUserTuid(v string) *CreateTwcNotaryContractCommontriggerResponse {
	s.UserTuid = &v
	return s
}

type CreateTwcNotaryContractMerchantindirectzftRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 入驻材料
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
}

func (s CreateTwcNotaryContractMerchantindirectzftRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractMerchantindirectzftRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractMerchantindirectzftRequest) SetAuthToken(v string) *CreateTwcNotaryContractMerchantindirectzftRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantindirectzftRequest) SetProductInstanceId(v string) *CreateTwcNotaryContractMerchantindirectzftRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantindirectzftRequest) SetRegionName(v string) *CreateTwcNotaryContractMerchantindirectzftRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantindirectzftRequest) SetBizContent(v string) *CreateTwcNotaryContractMerchantindirectzftRequest {
	s.BizContent = &v
	return s
}

type CreateTwcNotaryContractMerchantindirectzftResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s CreateTwcNotaryContractMerchantindirectzftResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractMerchantindirectzftResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractMerchantindirectzftResponse) SetReqMsgId(v string) *CreateTwcNotaryContractMerchantindirectzftResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantindirectzftResponse) SetResultCode(v string) *CreateTwcNotaryContractMerchantindirectzftResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantindirectzftResponse) SetResultMsg(v string) *CreateTwcNotaryContractMerchantindirectzftResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantindirectzftResponse) SetBody(v string) *CreateTwcNotaryContractMerchantindirectzftResponse {
	s.Body = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantindirectzftResponse) SetCode(v int64) *CreateTwcNotaryContractMerchantindirectzftResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantindirectzftResponse) SetMessage(v string) *CreateTwcNotaryContractMerchantindirectzftResponse {
	s.Message = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantindirectzftResponse) SetOrderId(v string) *CreateTwcNotaryContractMerchantindirectzftResponse {
	s.OrderId = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantindirectzftResponse) SetSubCode(v string) *CreateTwcNotaryContractMerchantindirectzftResponse {
	s.SubCode = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantindirectzftResponse) SetSubMsg(v string) *CreateTwcNotaryContractMerchantindirectzftResponse {
	s.SubMsg = &v
	return s
}

type QueryTwcNotaryContractMerchantindirectzftRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 商户入驻查询订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
}

func (s QueryTwcNotaryContractMerchantindirectzftRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryContractMerchantindirectzftRequest) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryContractMerchantindirectzftRequest) SetAuthToken(v string) *QueryTwcNotaryContractMerchantindirectzftRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwcNotaryContractMerchantindirectzftRequest) SetProductInstanceId(v string) *QueryTwcNotaryContractMerchantindirectzftRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwcNotaryContractMerchantindirectzftRequest) SetRegionName(v string) *QueryTwcNotaryContractMerchantindirectzftRequest {
	s.RegionName = &v
	return s
}

func (s *QueryTwcNotaryContractMerchantindirectzftRequest) SetOrderId(v string) *QueryTwcNotaryContractMerchantindirectzftRequest {
	s.OrderId = &v
	return s
}

type QueryTwcNotaryContractMerchantindirectzftResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 申请时间
	ApplyId *string `json:"apply_id,omitempty" xml:"apply_id,omitempty"`
	// 错误状态码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 额外信息，包含smid
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	// 支付宝的ipRoleId
	IpRoleId []*string `json:"ip_role_id,omitempty" xml:"ip_role_id,omitempty" type:"Repeated"`
	// 商户名称
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty"`
	// 错误信息描述
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 直付通商户进件的状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 支付宝返回的错误状态码
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 支付宝返回的错误信息描述
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
}

func (s QueryTwcNotaryContractMerchantindirectzftResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryContractMerchantindirectzftResponse) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryContractMerchantindirectzftResponse) SetReqMsgId(v string) *QueryTwcNotaryContractMerchantindirectzftResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwcNotaryContractMerchantindirectzftResponse) SetResultCode(v string) *QueryTwcNotaryContractMerchantindirectzftResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwcNotaryContractMerchantindirectzftResponse) SetResultMsg(v string) *QueryTwcNotaryContractMerchantindirectzftResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwcNotaryContractMerchantindirectzftResponse) SetApplyId(v string) *QueryTwcNotaryContractMerchantindirectzftResponse {
	s.ApplyId = &v
	return s
}

func (s *QueryTwcNotaryContractMerchantindirectzftResponse) SetCode(v int64) *QueryTwcNotaryContractMerchantindirectzftResponse {
	s.Code = &v
	return s
}

func (s *QueryTwcNotaryContractMerchantindirectzftResponse) SetExtInfo(v string) *QueryTwcNotaryContractMerchantindirectzftResponse {
	s.ExtInfo = &v
	return s
}

func (s *QueryTwcNotaryContractMerchantindirectzftResponse) SetIpRoleId(v []*string) *QueryTwcNotaryContractMerchantindirectzftResponse {
	s.IpRoleId = v
	return s
}

func (s *QueryTwcNotaryContractMerchantindirectzftResponse) SetMerchantName(v string) *QueryTwcNotaryContractMerchantindirectzftResponse {
	s.MerchantName = &v
	return s
}

func (s *QueryTwcNotaryContractMerchantindirectzftResponse) SetMessage(v string) *QueryTwcNotaryContractMerchantindirectzftResponse {
	s.Message = &v
	return s
}

func (s *QueryTwcNotaryContractMerchantindirectzftResponse) SetStatus(v string) *QueryTwcNotaryContractMerchantindirectzftResponse {
	s.Status = &v
	return s
}

func (s *QueryTwcNotaryContractMerchantindirectzftResponse) SetSubCode(v string) *QueryTwcNotaryContractMerchantindirectzftResponse {
	s.SubCode = &v
	return s
}

func (s *QueryTwcNotaryContractMerchantindirectzftResponse) SetSubMsg(v string) *QueryTwcNotaryContractMerchantindirectzftResponse {
	s.SubMsg = &v
	return s
}

type QueryTwcNotaryPayresultfileurlRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 对账日期
	BillDate *string `json:"bill_date,omitempty" xml:"bill_date,omitempty"`
	// 交易类型
	BillType *string `json:"bill_type,omitempty" xml:"bill_type,omitempty"`
}

func (s QueryTwcNotaryPayresultfileurlRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryPayresultfileurlRequest) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryPayresultfileurlRequest) SetAuthToken(v string) *QueryTwcNotaryPayresultfileurlRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwcNotaryPayresultfileurlRequest) SetProductInstanceId(v string) *QueryTwcNotaryPayresultfileurlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwcNotaryPayresultfileurlRequest) SetRegionName(v string) *QueryTwcNotaryPayresultfileurlRequest {
	s.RegionName = &v
	return s
}

func (s *QueryTwcNotaryPayresultfileurlRequest) SetBillDate(v string) *QueryTwcNotaryPayresultfileurlRequest {
	s.BillDate = &v
	return s
}

func (s *QueryTwcNotaryPayresultfileurlRequest) SetBillType(v string) *QueryTwcNotaryPayresultfileurlRequest {
	s.BillType = &v
	return s
}

type QueryTwcNotaryPayresultfileurlResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 对账文件的下载地址
	PayUrl *string `json:"pay_url,omitempty" xml:"pay_url,omitempty"`
}

func (s QueryTwcNotaryPayresultfileurlResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryPayresultfileurlResponse) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryPayresultfileurlResponse) SetReqMsgId(v string) *QueryTwcNotaryPayresultfileurlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwcNotaryPayresultfileurlResponse) SetResultCode(v string) *QueryTwcNotaryPayresultfileurlResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwcNotaryPayresultfileurlResponse) SetResultMsg(v string) *QueryTwcNotaryPayresultfileurlResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwcNotaryPayresultfileurlResponse) SetPayUrl(v string) *QueryTwcNotaryPayresultfileurlResponse {
	s.PayUrl = &v
	return s
}

type CreateTwcNotaryContractMerchantimageRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 图片内容，base64
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 图片名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
}

func (s CreateTwcNotaryContractMerchantimageRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractMerchantimageRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractMerchantimageRequest) SetAuthToken(v string) *CreateTwcNotaryContractMerchantimageRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantimageRequest) SetProductInstanceId(v string) *CreateTwcNotaryContractMerchantimageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantimageRequest) SetRegionName(v string) *CreateTwcNotaryContractMerchantimageRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantimageRequest) SetContent(v string) *CreateTwcNotaryContractMerchantimageRequest {
	s.Content = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantimageRequest) SetFileName(v string) *CreateTwcNotaryContractMerchantimageRequest {
	s.FileName = &v
	return s
}

type CreateTwcNotaryContractMerchantimageResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 图片在oss上的id
	ImageId *string `json:"image_id,omitempty" xml:"image_id,omitempty"`
}

func (s CreateTwcNotaryContractMerchantimageResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractMerchantimageResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractMerchantimageResponse) SetReqMsgId(v string) *CreateTwcNotaryContractMerchantimageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantimageResponse) SetResultCode(v string) *CreateTwcNotaryContractMerchantimageResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantimageResponse) SetResultMsg(v string) *CreateTwcNotaryContractMerchantimageResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryContractMerchantimageResponse) SetImageId(v string) *CreateTwcNotaryContractMerchantimageResponse {
	s.ImageId = &v
	return s
}

type CancelTwcNotaryContractPaytradeRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 智能合同id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
}

func (s CancelTwcNotaryContractPaytradeRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelTwcNotaryContractPaytradeRequest) GoString() string {
	return s.String()
}

func (s *CancelTwcNotaryContractPaytradeRequest) SetAuthToken(v string) *CancelTwcNotaryContractPaytradeRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelTwcNotaryContractPaytradeRequest) SetProductInstanceId(v string) *CancelTwcNotaryContractPaytradeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelTwcNotaryContractPaytradeRequest) SetRegionName(v string) *CancelTwcNotaryContractPaytradeRequest {
	s.RegionName = &v
	return s
}

func (s *CancelTwcNotaryContractPaytradeRequest) SetFlowId(v string) *CancelTwcNotaryContractPaytradeRequest {
	s.FlowId = &v
	return s
}

type CancelTwcNotaryContractPaytradeResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 取消的代扣条目
	CanceledOutTradeNo []*string `json:"canceled_out_trade_no,omitempty" xml:"canceled_out_trade_no,omitempty" type:"Repeated"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
}

func (s CancelTwcNotaryContractPaytradeResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelTwcNotaryContractPaytradeResponse) GoString() string {
	return s.String()
}

func (s *CancelTwcNotaryContractPaytradeResponse) SetReqMsgId(v string) *CancelTwcNotaryContractPaytradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelTwcNotaryContractPaytradeResponse) SetResultCode(v string) *CancelTwcNotaryContractPaytradeResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelTwcNotaryContractPaytradeResponse) SetResultMsg(v string) *CancelTwcNotaryContractPaytradeResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelTwcNotaryContractPaytradeResponse) SetCanceledOutTradeNo(v []*string) *CancelTwcNotaryContractPaytradeResponse {
	s.CanceledOutTradeNo = v
	return s
}

func (s *CancelTwcNotaryContractPaytradeResponse) SetCode(v int64) *CancelTwcNotaryContractPaytradeResponse {
	s.Code = &v
	return s
}

func (s *CancelTwcNotaryContractPaytradeResponse) SetErrMessage(v string) *CancelTwcNotaryContractPaytradeResponse {
	s.ErrMessage = &v
	return s
}

type CreateTwcNotaryContractHandsignflowRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 是否自动归档，默认false。如设置为true，当所有签署人签署完毕，系统自动将流程归档，状态变为“已完成”状态，在流程状态为“已完成”前，可随时添加签署人；如设置为false，则在调用签署流程开启后，需主动调用签署流程归档接口，将流程状态变更为“已完成”，归档前可随时添加签署人；已完成的流程才可下载签署后的文件。
	AutoArchive *bool `json:"auto_archive,omitempty" xml:"auto_archive,omitempty"`
	// 文件主题
	BusinessScene *string `json:"business_scene,omitempty" xml:"business_scene,omitempty"`
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

func (s CreateTwcNotaryContractHandsignflowRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractHandsignflowRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractHandsignflowRequest) SetAuthToken(v string) *CreateTwcNotaryContractHandsignflowRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryContractHandsignflowRequest) SetProductInstanceId(v string) *CreateTwcNotaryContractHandsignflowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryContractHandsignflowRequest) SetRegionName(v string) *CreateTwcNotaryContractHandsignflowRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryContractHandsignflowRequest) SetAutoArchive(v bool) *CreateTwcNotaryContractHandsignflowRequest {
	s.AutoArchive = &v
	return s
}

func (s *CreateTwcNotaryContractHandsignflowRequest) SetBusinessScene(v string) *CreateTwcNotaryContractHandsignflowRequest {
	s.BusinessScene = &v
	return s
}

func (s *CreateTwcNotaryContractHandsignflowRequest) SetConfigInfo(v *ContractSignFlowConfig) *CreateTwcNotaryContractHandsignflowRequest {
	s.ConfigInfo = v
	return s
}

func (s *CreateTwcNotaryContractHandsignflowRequest) SetContractRemind(v int64) *CreateTwcNotaryContractHandsignflowRequest {
	s.ContractRemind = &v
	return s
}

func (s *CreateTwcNotaryContractHandsignflowRequest) SetContractValidity(v int64) *CreateTwcNotaryContractHandsignflowRequest {
	s.ContractValidity = &v
	return s
}

func (s *CreateTwcNotaryContractHandsignflowRequest) SetInitiatorAccountId(v string) *CreateTwcNotaryContractHandsignflowRequest {
	s.InitiatorAccountId = &v
	return s
}

func (s *CreateTwcNotaryContractHandsignflowRequest) SetInitiatorAuthorizedAccountId(v string) *CreateTwcNotaryContractHandsignflowRequest {
	s.InitiatorAuthorizedAccountId = &v
	return s
}

func (s *CreateTwcNotaryContractHandsignflowRequest) SetSignValidity(v int64) *CreateTwcNotaryContractHandsignflowRequest {
	s.SignValidity = &v
	return s
}

type CreateTwcNotaryContractHandsignflowResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s CreateTwcNotaryContractHandsignflowResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractHandsignflowResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractHandsignflowResponse) SetReqMsgId(v string) *CreateTwcNotaryContractHandsignflowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryContractHandsignflowResponse) SetResultCode(v string) *CreateTwcNotaryContractHandsignflowResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryContractHandsignflowResponse) SetResultMsg(v string) *CreateTwcNotaryContractHandsignflowResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryContractHandsignflowResponse) SetCode(v int64) *CreateTwcNotaryContractHandsignflowResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryContractHandsignflowResponse) SetFlowId(v string) *CreateTwcNotaryContractHandsignflowResponse {
	s.FlowId = &v
	return s
}

func (s *CreateTwcNotaryContractHandsignflowResponse) SetMessage(v string) *CreateTwcNotaryContractHandsignflowResponse {
	s.Message = &v
	return s
}

type CreateTwcNotaryContractHandsignfieldRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 流程id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 签署区列表数据
	SignFields []*ContractHandSignFieldApplication `json:"sign_fields,omitempty" xml:"sign_fields,omitempty" type:"Repeated"`
}

func (s CreateTwcNotaryContractHandsignfieldRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractHandsignfieldRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractHandsignfieldRequest) SetAuthToken(v string) *CreateTwcNotaryContractHandsignfieldRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryContractHandsignfieldRequest) SetProductInstanceId(v string) *CreateTwcNotaryContractHandsignfieldRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryContractHandsignfieldRequest) SetRegionName(v string) *CreateTwcNotaryContractHandsignfieldRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryContractHandsignfieldRequest) SetFlowId(v string) *CreateTwcNotaryContractHandsignfieldRequest {
	s.FlowId = &v
	return s
}

func (s *CreateTwcNotaryContractHandsignfieldRequest) SetSignFields(v []*ContractHandSignFieldApplication) *CreateTwcNotaryContractHandsignfieldRequest {
	s.SignFields = v
	return s
}

type CreateTwcNotaryContractHandsignfieldResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 签署区列表数据
	Signfields []*ContractSignField `json:"signfields,omitempty" xml:"signfields,omitempty" type:"Repeated"`
}

func (s CreateTwcNotaryContractHandsignfieldResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractHandsignfieldResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractHandsignfieldResponse) SetReqMsgId(v string) *CreateTwcNotaryContractHandsignfieldResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryContractHandsignfieldResponse) SetResultCode(v string) *CreateTwcNotaryContractHandsignfieldResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryContractHandsignfieldResponse) SetResultMsg(v string) *CreateTwcNotaryContractHandsignfieldResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryContractHandsignfieldResponse) SetCode(v int64) *CreateTwcNotaryContractHandsignfieldResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryContractHandsignfieldResponse) SetMessage(v string) *CreateTwcNotaryContractHandsignfieldResponse {
	s.Message = &v
	return s
}

func (s *CreateTwcNotaryContractHandsignfieldResponse) SetSignfields(v []*ContractSignField) *CreateTwcNotaryContractHandsignfieldResponse {
	s.Signfields = v
	return s
}

type GetTwcNotaryContractSignurlRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 签署人账号id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 流程id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 默认为空，返回的任务链接仅包含签署人本人需要签署的任务； 传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务； 传入指定机构id，则返回的任务链接包含签署人“本人+指定代签机构”的签署任务
	OrganizeId *string `json:"organize_id,omitempty" xml:"organize_id,omitempty"`
}

func (s GetTwcNotaryContractSignurlRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTwcNotaryContractSignurlRequest) GoString() string {
	return s.String()
}

func (s *GetTwcNotaryContractSignurlRequest) SetAuthToken(v string) *GetTwcNotaryContractSignurlRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTwcNotaryContractSignurlRequest) SetProductInstanceId(v string) *GetTwcNotaryContractSignurlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTwcNotaryContractSignurlRequest) SetRegionName(v string) *GetTwcNotaryContractSignurlRequest {
	s.RegionName = &v
	return s
}

func (s *GetTwcNotaryContractSignurlRequest) SetAccountId(v string) *GetTwcNotaryContractSignurlRequest {
	s.AccountId = &v
	return s
}

func (s *GetTwcNotaryContractSignurlRequest) SetFlowId(v string) *GetTwcNotaryContractSignurlRequest {
	s.FlowId = &v
	return s
}

func (s *GetTwcNotaryContractSignurlRequest) SetOrganizeId(v string) *GetTwcNotaryContractSignurlRequest {
	s.OrganizeId = &v
	return s
}

type GetTwcNotaryContractSignurlResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 短链地址（30天有效）
	ShortUrl *string `json:"short_url,omitempty" xml:"short_url,omitempty"`
	// 长链地址(永久有效)
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s GetTwcNotaryContractSignurlResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTwcNotaryContractSignurlResponse) GoString() string {
	return s.String()
}

func (s *GetTwcNotaryContractSignurlResponse) SetReqMsgId(v string) *GetTwcNotaryContractSignurlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTwcNotaryContractSignurlResponse) SetResultCode(v string) *GetTwcNotaryContractSignurlResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTwcNotaryContractSignurlResponse) SetResultMsg(v string) *GetTwcNotaryContractSignurlResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTwcNotaryContractSignurlResponse) SetCode(v int64) *GetTwcNotaryContractSignurlResponse {
	s.Code = &v
	return s
}

func (s *GetTwcNotaryContractSignurlResponse) SetMessage(v string) *GetTwcNotaryContractSignurlResponse {
	s.Message = &v
	return s
}

func (s *GetTwcNotaryContractSignurlResponse) SetShortUrl(v string) *GetTwcNotaryContractSignurlResponse {
	s.ShortUrl = &v
	return s
}

func (s *GetTwcNotaryContractSignurlResponse) SetUrl(v string) *GetTwcNotaryContractSignurlResponse {
	s.Url = &v
	return s
}

type CreateTwcNotaryWithholdAgreementRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 授信总金额，单位元
	CreditAmount *string `json:"credit_amount,omitempty" xml:"credit_amount,omitempty"`
	// 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
	ExternalAgreementNo *string `json:"external_agreement_no,omitempty" xml:"external_agreement_no,omitempty"`
	// 收款方账号类型，可取值：ALIPAY_USER_ID（支付宝uid);商户id，2088123412341234
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// 商户名称
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty"`
	// 对服务产品的描述
	MerchantServiceDescription *string `json:"merchant_service_description,omitempty" xml:"merchant_service_description,omitempty"`
	// 商户的服务名称，滴滴出行免密支付
	MerchantServiceName *string `json:"merchant_service_name,omitempty" xml:"merchant_service_name,omitempty"`
	// 姓名和身份证号拼接sha256的hash
	NameCertHash *string `json:"name_cert_hash,omitempty" xml:"name_cert_hash,omitempty"`
	// 还款计划的链接
	RepaymentUrl *string `json:"repayment_url,omitempty" xml:"repayment_url,omitempty"`
	// 签约成功后回调的地址
	ReturnUrl *string `json:"return_url,omitempty" xml:"return_url,omitempty"`
	// 第三方用户id
	ThirdPartyId *string `json:"third_party_id,omitempty" xml:"third_party_id,omitempty"`
}

func (s CreateTwcNotaryWithholdAgreementRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryWithholdAgreementRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryWithholdAgreementRequest) SetAuthToken(v string) *CreateTwcNotaryWithholdAgreementRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryWithholdAgreementRequest) SetProductInstanceId(v string) *CreateTwcNotaryWithholdAgreementRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryWithholdAgreementRequest) SetRegionName(v string) *CreateTwcNotaryWithholdAgreementRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryWithholdAgreementRequest) SetCreditAmount(v string) *CreateTwcNotaryWithholdAgreementRequest {
	s.CreditAmount = &v
	return s
}

func (s *CreateTwcNotaryWithholdAgreementRequest) SetExternalAgreementNo(v string) *CreateTwcNotaryWithholdAgreementRequest {
	s.ExternalAgreementNo = &v
	return s
}

func (s *CreateTwcNotaryWithholdAgreementRequest) SetMerchantId(v string) *CreateTwcNotaryWithholdAgreementRequest {
	s.MerchantId = &v
	return s
}

func (s *CreateTwcNotaryWithholdAgreementRequest) SetMerchantName(v string) *CreateTwcNotaryWithholdAgreementRequest {
	s.MerchantName = &v
	return s
}

func (s *CreateTwcNotaryWithholdAgreementRequest) SetMerchantServiceDescription(v string) *CreateTwcNotaryWithholdAgreementRequest {
	s.MerchantServiceDescription = &v
	return s
}

func (s *CreateTwcNotaryWithholdAgreementRequest) SetMerchantServiceName(v string) *CreateTwcNotaryWithholdAgreementRequest {
	s.MerchantServiceName = &v
	return s
}

func (s *CreateTwcNotaryWithholdAgreementRequest) SetNameCertHash(v string) *CreateTwcNotaryWithholdAgreementRequest {
	s.NameCertHash = &v
	return s
}

func (s *CreateTwcNotaryWithholdAgreementRequest) SetRepaymentUrl(v string) *CreateTwcNotaryWithholdAgreementRequest {
	s.RepaymentUrl = &v
	return s
}

func (s *CreateTwcNotaryWithholdAgreementRequest) SetReturnUrl(v string) *CreateTwcNotaryWithholdAgreementRequest {
	s.ReturnUrl = &v
	return s
}

func (s *CreateTwcNotaryWithholdAgreementRequest) SetThirdPartyId(v string) *CreateTwcNotaryWithholdAgreementRequest {
	s.ThirdPartyId = &v
	return s
}

type CreateTwcNotaryWithholdAgreementResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateTwcNotaryWithholdAgreementResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryWithholdAgreementResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryWithholdAgreementResponse) SetReqMsgId(v string) *CreateTwcNotaryWithholdAgreementResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryWithholdAgreementResponse) SetResultCode(v string) *CreateTwcNotaryWithholdAgreementResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryWithholdAgreementResponse) SetResultMsg(v string) *CreateTwcNotaryWithholdAgreementResponse {
	s.ResultMsg = &v
	return s
}

type QueryTwcNotaryWithholdAgreementRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
	ExternalAgreementNo *string `json:"external_agreement_no,omitempty" xml:"external_agreement_no,omitempty"`
	// 第三方用户id
	ThirdPartyId *string `json:"third_party_id,omitempty" xml:"third_party_id,omitempty"`
}

func (s QueryTwcNotaryWithholdAgreementRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryWithholdAgreementRequest) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryWithholdAgreementRequest) SetAuthToken(v string) *QueryTwcNotaryWithholdAgreementRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwcNotaryWithholdAgreementRequest) SetProductInstanceId(v string) *QueryTwcNotaryWithholdAgreementRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwcNotaryWithholdAgreementRequest) SetRegionName(v string) *QueryTwcNotaryWithholdAgreementRequest {
	s.RegionName = &v
	return s
}

func (s *QueryTwcNotaryWithholdAgreementRequest) SetExternalAgreementNo(v string) *QueryTwcNotaryWithholdAgreementRequest {
	s.ExternalAgreementNo = &v
	return s
}

func (s *QueryTwcNotaryWithholdAgreementRequest) SetThirdPartyId(v string) *QueryTwcNotaryWithholdAgreementRequest {
	s.ThirdPartyId = &v
	return s
}

type QueryTwcNotaryWithholdAgreementResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总授信金额
	CreditAmount *string `json:"credit_amount,omitempty" xml:"credit_amount,omitempty"`
	// 商家请求的协议号
	ExternalAgreementNo *string `json:"external_agreement_no,omitempty" xml:"external_agreement_no,omitempty"`
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
}

func (s QueryTwcNotaryWithholdAgreementResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryWithholdAgreementResponse) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryWithholdAgreementResponse) SetReqMsgId(v string) *QueryTwcNotaryWithholdAgreementResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwcNotaryWithholdAgreementResponse) SetResultCode(v string) *QueryTwcNotaryWithholdAgreementResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwcNotaryWithholdAgreementResponse) SetResultMsg(v string) *QueryTwcNotaryWithholdAgreementResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwcNotaryWithholdAgreementResponse) SetCreditAmount(v string) *QueryTwcNotaryWithholdAgreementResponse {
	s.CreditAmount = &v
	return s
}

func (s *QueryTwcNotaryWithholdAgreementResponse) SetExternalAgreementNo(v string) *QueryTwcNotaryWithholdAgreementResponse {
	s.ExternalAgreementNo = &v
	return s
}

func (s *QueryTwcNotaryWithholdAgreementResponse) SetMerchantId(v string) *QueryTwcNotaryWithholdAgreementResponse {
	s.MerchantId = &v
	return s
}

func (s *QueryTwcNotaryWithholdAgreementResponse) SetMerchantName(v string) *QueryTwcNotaryWithholdAgreementResponse {
	s.MerchantName = &v
	return s
}

func (s *QueryTwcNotaryWithholdAgreementResponse) SetMerchantServiceName(v string) *QueryTwcNotaryWithholdAgreementResponse {
	s.MerchantServiceName = &v
	return s
}

func (s *QueryTwcNotaryWithholdAgreementResponse) SetNameCertHash(v string) *QueryTwcNotaryWithholdAgreementResponse {
	s.NameCertHash = &v
	return s
}

func (s *QueryTwcNotaryWithholdAgreementResponse) SetRepaymentUrl(v string) *QueryTwcNotaryWithholdAgreementResponse {
	s.RepaymentUrl = &v
	return s
}

func (s *QueryTwcNotaryWithholdAgreementResponse) SetStatus(v string) *QueryTwcNotaryWithholdAgreementResponse {
	s.Status = &v
	return s
}

func (s *QueryTwcNotaryWithholdAgreementResponse) SetThirdPartyId(v string) *QueryTwcNotaryWithholdAgreementResponse {
	s.ThirdPartyId = &v
	return s
}

type QueryTwcNotaryWithholdAgreementurlRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
	ExternalAgreementNo *string `json:"external_agreement_no,omitempty" xml:"external_agreement_no,omitempty"`
	// 第三方用户id
	ThirdPartyId *string `json:"third_party_id,omitempty" xml:"third_party_id,omitempty"`
}

func (s QueryTwcNotaryWithholdAgreementurlRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryWithholdAgreementurlRequest) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryWithholdAgreementurlRequest) SetAuthToken(v string) *QueryTwcNotaryWithholdAgreementurlRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwcNotaryWithholdAgreementurlRequest) SetProductInstanceId(v string) *QueryTwcNotaryWithholdAgreementurlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwcNotaryWithholdAgreementurlRequest) SetRegionName(v string) *QueryTwcNotaryWithholdAgreementurlRequest {
	s.RegionName = &v
	return s
}

func (s *QueryTwcNotaryWithholdAgreementurlRequest) SetExternalAgreementNo(v string) *QueryTwcNotaryWithholdAgreementurlRequest {
	s.ExternalAgreementNo = &v
	return s
}

func (s *QueryTwcNotaryWithholdAgreementurlRequest) SetThirdPartyId(v string) *QueryTwcNotaryWithholdAgreementurlRequest {
	s.ThirdPartyId = &v
	return s
}

type QueryTwcNotaryWithholdAgreementurlResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 成功
	ResultMessage *string `json:"result_message,omitempty" xml:"result_message,omitempty"`
	// 代扣协议签署的入口
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s QueryTwcNotaryWithholdAgreementurlResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryWithholdAgreementurlResponse) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryWithholdAgreementurlResponse) SetReqMsgId(v string) *QueryTwcNotaryWithholdAgreementurlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwcNotaryWithholdAgreementurlResponse) SetResultCode(v string) *QueryTwcNotaryWithholdAgreementurlResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwcNotaryWithholdAgreementurlResponse) SetResultMsg(v string) *QueryTwcNotaryWithholdAgreementurlResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwcNotaryWithholdAgreementurlResponse) SetResultMessage(v string) *QueryTwcNotaryWithholdAgreementurlResponse {
	s.ResultMessage = &v
	return s
}

func (s *QueryTwcNotaryWithholdAgreementurlResponse) SetUrl(v string) *QueryTwcNotaryWithholdAgreementurlResponse {
	s.Url = &v
	return s
}

type CreateTwcNotaryWithholdOverduetimeRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 首款方id
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// 商家名称
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty"`
	// 商家提供的产品名称
	MerchantServiceName *string `json:"merchant_service_name,omitempty" xml:"merchant_service_name,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s CreateTwcNotaryWithholdOverduetimeRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryWithholdOverduetimeRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryWithholdOverduetimeRequest) SetAuthToken(v string) *CreateTwcNotaryWithholdOverduetimeRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryWithholdOverduetimeRequest) SetProductInstanceId(v string) *CreateTwcNotaryWithholdOverduetimeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryWithholdOverduetimeRequest) SetRegionName(v string) *CreateTwcNotaryWithholdOverduetimeRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryWithholdOverduetimeRequest) SetMerchantId(v string) *CreateTwcNotaryWithholdOverduetimeRequest {
	s.MerchantId = &v
	return s
}

func (s *CreateTwcNotaryWithholdOverduetimeRequest) SetMerchantName(v string) *CreateTwcNotaryWithholdOverduetimeRequest {
	s.MerchantName = &v
	return s
}

func (s *CreateTwcNotaryWithholdOverduetimeRequest) SetMerchantServiceName(v string) *CreateTwcNotaryWithholdOverduetimeRequest {
	s.MerchantServiceName = &v
	return s
}

func (s *CreateTwcNotaryWithholdOverduetimeRequest) SetTenantId(v string) *CreateTwcNotaryWithholdOverduetimeRequest {
	s.TenantId = &v
	return s
}

type CreateTwcNotaryWithholdOverduetimeResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateTwcNotaryWithholdOverduetimeResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryWithholdOverduetimeResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryWithholdOverduetimeResponse) SetReqMsgId(v string) *CreateTwcNotaryWithholdOverduetimeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryWithholdOverduetimeResponse) SetResultCode(v string) *CreateTwcNotaryWithholdOverduetimeResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryWithholdOverduetimeResponse) SetResultMsg(v string) *CreateTwcNotaryWithholdOverduetimeResponse {
	s.ResultMsg = &v
	return s
}

type SendTwcNotaryWithholdDeductRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 委托支付订单总金额，单位为元，精确到小数点后两位
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty"`
	// JSON格式，传递业务扩展参数
	BusinessParams *string `json:"business_params,omitempty" xml:"business_params,omitempty"`
	// 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
	ExternalAgreementNo *string `json:"external_agreement_no,omitempty" xml:"external_agreement_no,omitempty"`
	// 订单标题信息
	OrderTitle *string `json:"order_title,omitempty" xml:"order_title,omitempty"`
	// 外部订单号,请求方保证唯一性
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 备注
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
	// 第三方的用户id
	ThirdPartyId *string `json:"third_party_id,omitempty" xml:"third_party_id,omitempty"`
}

func (s SendTwcNotaryWithholdDeductRequest) String() string {
	return tea.Prettify(s)
}

func (s SendTwcNotaryWithholdDeductRequest) GoString() string {
	return s.String()
}

func (s *SendTwcNotaryWithholdDeductRequest) SetAuthToken(v string) *SendTwcNotaryWithholdDeductRequest {
	s.AuthToken = &v
	return s
}

func (s *SendTwcNotaryWithholdDeductRequest) SetProductInstanceId(v string) *SendTwcNotaryWithholdDeductRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendTwcNotaryWithholdDeductRequest) SetRegionName(v string) *SendTwcNotaryWithholdDeductRequest {
	s.RegionName = &v
	return s
}

func (s *SendTwcNotaryWithholdDeductRequest) SetAmount(v string) *SendTwcNotaryWithholdDeductRequest {
	s.Amount = &v
	return s
}

func (s *SendTwcNotaryWithholdDeductRequest) SetBusinessParams(v string) *SendTwcNotaryWithholdDeductRequest {
	s.BusinessParams = &v
	return s
}

func (s *SendTwcNotaryWithholdDeductRequest) SetExternalAgreementNo(v string) *SendTwcNotaryWithholdDeductRequest {
	s.ExternalAgreementNo = &v
	return s
}

func (s *SendTwcNotaryWithholdDeductRequest) SetOrderTitle(v string) *SendTwcNotaryWithholdDeductRequest {
	s.OrderTitle = &v
	return s
}

func (s *SendTwcNotaryWithholdDeductRequest) SetOutBizNo(v string) *SendTwcNotaryWithholdDeductRequest {
	s.OutBizNo = &v
	return s
}

func (s *SendTwcNotaryWithholdDeductRequest) SetRemark(v string) *SendTwcNotaryWithholdDeductRequest {
	s.Remark = &v
	return s
}

func (s *SendTwcNotaryWithholdDeductRequest) SetThirdPartyId(v string) *SendTwcNotaryWithholdDeductRequest {
	s.ThirdPartyId = &v
	return s
}

type SendTwcNotaryWithholdDeductResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 该笔转账在支付宝系统内部的单据ID
	EntrustOrderId *string `json:"entrust_order_id,omitempty" xml:"entrust_order_id,omitempty"`
	// INIT：受理成功，扣款中
	// FINISHED：扣款成功
	// CLOSED：商户已关单
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s SendTwcNotaryWithholdDeductResponse) String() string {
	return tea.Prettify(s)
}

func (s SendTwcNotaryWithholdDeductResponse) GoString() string {
	return s.String()
}

func (s *SendTwcNotaryWithholdDeductResponse) SetReqMsgId(v string) *SendTwcNotaryWithholdDeductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendTwcNotaryWithholdDeductResponse) SetResultCode(v string) *SendTwcNotaryWithholdDeductResponse {
	s.ResultCode = &v
	return s
}

func (s *SendTwcNotaryWithholdDeductResponse) SetResultMsg(v string) *SendTwcNotaryWithholdDeductResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendTwcNotaryWithholdDeductResponse) SetEntrustOrderId(v string) *SendTwcNotaryWithholdDeductResponse {
	s.EntrustOrderId = &v
	return s
}

func (s *SendTwcNotaryWithholdDeductResponse) SetStatus(v string) *SendTwcNotaryWithholdDeductResponse {
	s.Status = &v
	return s
}

type QueryTwcNotaryWithholdPayresultRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 请求扣款时，返回的委托单号,该笔转账在支付宝系统内部的单据ID
	EntrustOrderId *string `json:"entrust_order_id,omitempty" xml:"entrust_order_id,omitempty"`
	// 外部订单号,请求方保证唯一性
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
}

func (s QueryTwcNotaryWithholdPayresultRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryWithholdPayresultRequest) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryWithholdPayresultRequest) SetAuthToken(v string) *QueryTwcNotaryWithholdPayresultRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwcNotaryWithholdPayresultRequest) SetProductInstanceId(v string) *QueryTwcNotaryWithholdPayresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwcNotaryWithholdPayresultRequest) SetRegionName(v string) *QueryTwcNotaryWithholdPayresultRequest {
	s.RegionName = &v
	return s
}

func (s *QueryTwcNotaryWithholdPayresultRequest) SetEntrustOrderId(v string) *QueryTwcNotaryWithholdPayresultRequest {
	s.EntrustOrderId = &v
	return s
}

func (s *QueryTwcNotaryWithholdPayresultRequest) SetOutBizNo(v string) *QueryTwcNotaryWithholdPayresultRequest {
	s.OutBizNo = &v
	return s
}

type QueryTwcNotaryWithholdPayresultResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s QueryTwcNotaryWithholdPayresultResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryWithholdPayresultResponse) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryWithholdPayresultResponse) SetReqMsgId(v string) *QueryTwcNotaryWithholdPayresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwcNotaryWithholdPayresultResponse) SetResultCode(v string) *QueryTwcNotaryWithholdPayresultResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwcNotaryWithholdPayresultResponse) SetResultMsg(v string) *QueryTwcNotaryWithholdPayresultResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwcNotaryWithholdPayresultResponse) SetPayDate(v string) *QueryTwcNotaryWithholdPayresultResponse {
	s.PayDate = &v
	return s
}

func (s *QueryTwcNotaryWithholdPayresultResponse) SetPayOrderId(v string) *QueryTwcNotaryWithholdPayresultResponse {
	s.PayOrderId = &v
	return s
}

func (s *QueryTwcNotaryWithholdPayresultResponse) SetStatus(v string) *QueryTwcNotaryWithholdPayresultResponse {
	s.Status = &v
	return s
}

func (s *QueryTwcNotaryWithholdPayresultResponse) SetTransAmount(v string) *QueryTwcNotaryWithholdPayresultResponse {
	s.TransAmount = &v
	return s
}

type SendTwcNotaryWithholdRefundRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 支付宝支付单据号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 外部订单号,请求方保证唯一性
	OutRequestNo *string `json:"out_request_no,omitempty" xml:"out_request_no,omitempty"`
	// 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
	RefundAmount *string `json:"refund_amount,omitempty" xml:"refund_amount,omitempty"`
	// 退款备注
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
}

func (s SendTwcNotaryWithholdRefundRequest) String() string {
	return tea.Prettify(s)
}

func (s SendTwcNotaryWithholdRefundRequest) GoString() string {
	return s.String()
}

func (s *SendTwcNotaryWithholdRefundRequest) SetAuthToken(v string) *SendTwcNotaryWithholdRefundRequest {
	s.AuthToken = &v
	return s
}

func (s *SendTwcNotaryWithholdRefundRequest) SetProductInstanceId(v string) *SendTwcNotaryWithholdRefundRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendTwcNotaryWithholdRefundRequest) SetRegionName(v string) *SendTwcNotaryWithholdRefundRequest {
	s.RegionName = &v
	return s
}

func (s *SendTwcNotaryWithholdRefundRequest) SetOrderId(v string) *SendTwcNotaryWithholdRefundRequest {
	s.OrderId = &v
	return s
}

func (s *SendTwcNotaryWithholdRefundRequest) SetOutRequestNo(v string) *SendTwcNotaryWithholdRefundRequest {
	s.OutRequestNo = &v
	return s
}

func (s *SendTwcNotaryWithholdRefundRequest) SetRefundAmount(v string) *SendTwcNotaryWithholdRefundRequest {
	s.RefundAmount = &v
	return s
}

func (s *SendTwcNotaryWithholdRefundRequest) SetRemark(v string) *SendTwcNotaryWithholdRefundRequest {
	s.Remark = &v
	return s
}

type SendTwcNotaryWithholdRefundResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s SendTwcNotaryWithholdRefundResponse) String() string {
	return tea.Prettify(s)
}

func (s SendTwcNotaryWithholdRefundResponse) GoString() string {
	return s.String()
}

func (s *SendTwcNotaryWithholdRefundResponse) SetReqMsgId(v string) *SendTwcNotaryWithholdRefundResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendTwcNotaryWithholdRefundResponse) SetResultCode(v string) *SendTwcNotaryWithholdRefundResponse {
	s.ResultCode = &v
	return s
}

func (s *SendTwcNotaryWithholdRefundResponse) SetResultMsg(v string) *SendTwcNotaryWithholdRefundResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendTwcNotaryWithholdRefundResponse) SetRefundAmount(v string) *SendTwcNotaryWithholdRefundResponse {
	s.RefundAmount = &v
	return s
}

func (s *SendTwcNotaryWithholdRefundResponse) SetRefundDate(v string) *SendTwcNotaryWithholdRefundResponse {
	s.RefundDate = &v
	return s
}

func (s *SendTwcNotaryWithholdRefundResponse) SetRefundOrderId(v string) *SendTwcNotaryWithholdRefundResponse {
	s.RefundOrderId = &v
	return s
}

func (s *SendTwcNotaryWithholdRefundResponse) SetStatus(v string) *SendTwcNotaryWithholdRefundResponse {
	s.Status = &v
	return s
}

type SendTwcNotaryContractInvitationRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
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
	InviteType *string `json:"invite_type,omitempty" xml:"invite_type,omitempty"`
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

func (s SendTwcNotaryContractInvitationRequest) String() string {
	return tea.Prettify(s)
}

func (s SendTwcNotaryContractInvitationRequest) GoString() string {
	return s.String()
}

func (s *SendTwcNotaryContractInvitationRequest) SetAuthToken(v string) *SendTwcNotaryContractInvitationRequest {
	s.AuthToken = &v
	return s
}

func (s *SendTwcNotaryContractInvitationRequest) SetProductInstanceId(v string) *SendTwcNotaryContractInvitationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendTwcNotaryContractInvitationRequest) SetRegionName(v string) *SendTwcNotaryContractInvitationRequest {
	s.RegionName = &v
	return s
}

func (s *SendTwcNotaryContractInvitationRequest) SetBizProcessId(v string) *SendTwcNotaryContractInvitationRequest {
	s.BizProcessId = &v
	return s
}

func (s *SendTwcNotaryContractInvitationRequest) SetCallbackUrl(v string) *SendTwcNotaryContractInvitationRequest {
	s.CallbackUrl = &v
	return s
}

func (s *SendTwcNotaryContractInvitationRequest) SetEmail(v string) *SendTwcNotaryContractInvitationRequest {
	s.Email = &v
	return s
}

func (s *SendTwcNotaryContractInvitationRequest) SetIdNumber(v string) *SendTwcNotaryContractInvitationRequest {
	s.IdNumber = &v
	return s
}

func (s *SendTwcNotaryContractInvitationRequest) SetInviteeCertType(v string) *SendTwcNotaryContractInvitationRequest {
	s.InviteeCertType = &v
	return s
}

func (s *SendTwcNotaryContractInvitationRequest) SetInviteType(v string) *SendTwcNotaryContractInvitationRequest {
	s.InviteType = &v
	return s
}

func (s *SendTwcNotaryContractInvitationRequest) SetLegalCertType(v string) *SendTwcNotaryContractInvitationRequest {
	s.LegalCertType = &v
	return s
}

func (s *SendTwcNotaryContractInvitationRequest) SetLegalName(v string) *SendTwcNotaryContractInvitationRequest {
	s.LegalName = &v
	return s
}

func (s *SendTwcNotaryContractInvitationRequest) SetLegalNo(v string) *SendTwcNotaryContractInvitationRequest {
	s.LegalNo = &v
	return s
}

func (s *SendTwcNotaryContractInvitationRequest) SetMobile(v string) *SendTwcNotaryContractInvitationRequest {
	s.Mobile = &v
	return s
}

func (s *SendTwcNotaryContractInvitationRequest) SetName(v string) *SendTwcNotaryContractInvitationRequest {
	s.Name = &v
	return s
}

func (s *SendTwcNotaryContractInvitationRequest) SetNotifyType(v string) *SendTwcNotaryContractInvitationRequest {
	s.NotifyType = &v
	return s
}

func (s *SendTwcNotaryContractInvitationRequest) SetOrganCertNo(v string) *SendTwcNotaryContractInvitationRequest {
	s.OrganCertNo = &v
	return s
}

func (s *SendTwcNotaryContractInvitationRequest) SetOrganCertType(v string) *SendTwcNotaryContractInvitationRequest {
	s.OrganCertType = &v
	return s
}

func (s *SendTwcNotaryContractInvitationRequest) SetOrganName(v string) *SendTwcNotaryContractInvitationRequest {
	s.OrganName = &v
	return s
}

func (s *SendTwcNotaryContractInvitationRequest) SetRedirectUrl(v string) *SendTwcNotaryContractInvitationRequest {
	s.RedirectUrl = &v
	return s
}

type SendTwcNotaryContractInvitationResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s SendTwcNotaryContractInvitationResponse) String() string {
	return tea.Prettify(s)
}

func (s SendTwcNotaryContractInvitationResponse) GoString() string {
	return s.String()
}

func (s *SendTwcNotaryContractInvitationResponse) SetReqMsgId(v string) *SendTwcNotaryContractInvitationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendTwcNotaryContractInvitationResponse) SetResultCode(v string) *SendTwcNotaryContractInvitationResponse {
	s.ResultCode = &v
	return s
}

func (s *SendTwcNotaryContractInvitationResponse) SetResultMsg(v string) *SendTwcNotaryContractInvitationResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendTwcNotaryContractInvitationResponse) SetCode(v int64) *SendTwcNotaryContractInvitationResponse {
	s.Code = &v
	return s
}

func (s *SendTwcNotaryContractInvitationResponse) SetInvitationId(v string) *SendTwcNotaryContractInvitationResponse {
	s.InvitationId = &v
	return s
}

func (s *SendTwcNotaryContractInvitationResponse) SetInvitationUrl(v string) *SendTwcNotaryContractInvitationResponse {
	s.InvitationUrl = &v
	return s
}

func (s *SendTwcNotaryContractInvitationResponse) SetMessage(v string) *SendTwcNotaryContractInvitationResponse {
	s.Message = &v
	return s
}

type ListTwcNotaryContractPayruleRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// flowId
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
}

func (s ListTwcNotaryContractPayruleRequest) String() string {
	return tea.Prettify(s)
}

func (s ListTwcNotaryContractPayruleRequest) GoString() string {
	return s.String()
}

func (s *ListTwcNotaryContractPayruleRequest) SetAuthToken(v string) *ListTwcNotaryContractPayruleRequest {
	s.AuthToken = &v
	return s
}

func (s *ListTwcNotaryContractPayruleRequest) SetProductInstanceId(v string) *ListTwcNotaryContractPayruleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListTwcNotaryContractPayruleRequest) SetRegionName(v string) *ListTwcNotaryContractPayruleRequest {
	s.RegionName = &v
	return s
}

func (s *ListTwcNotaryContractPayruleRequest) SetFlowId(v string) *ListTwcNotaryContractPayruleRequest {
	s.FlowId = &v
	return s
}

type ListTwcNotaryContractPayruleResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// ""
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 代扣规则描述json表示
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s ListTwcNotaryContractPayruleResponse) String() string {
	return tea.Prettify(s)
}

func (s ListTwcNotaryContractPayruleResponse) GoString() string {
	return s.String()
}

func (s *ListTwcNotaryContractPayruleResponse) SetReqMsgId(v string) *ListTwcNotaryContractPayruleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListTwcNotaryContractPayruleResponse) SetResultCode(v string) *ListTwcNotaryContractPayruleResponse {
	s.ResultCode = &v
	return s
}

func (s *ListTwcNotaryContractPayruleResponse) SetResultMsg(v string) *ListTwcNotaryContractPayruleResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListTwcNotaryContractPayruleResponse) SetCode(v int64) *ListTwcNotaryContractPayruleResponse {
	s.Code = &v
	return s
}

func (s *ListTwcNotaryContractPayruleResponse) SetErrMessage(v string) *ListTwcNotaryContractPayruleResponse {
	s.ErrMessage = &v
	return s
}

func (s *ListTwcNotaryContractPayruleResponse) SetResponseData(v string) *ListTwcNotaryContractPayruleResponse {
	s.ResponseData = &v
	return s
}

type CreateTwcNotaryWithholdQrcodeRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 请求签约的协议号
	ExternalAgreementNo *string `json:"external_agreement_no,omitempty" xml:"external_agreement_no,omitempty"`
	// 第三方的用户id
	ThirdPartyId *string `json:"third_party_id,omitempty" xml:"third_party_id,omitempty"`
}

func (s CreateTwcNotaryWithholdQrcodeRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryWithholdQrcodeRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryWithholdQrcodeRequest) SetAuthToken(v string) *CreateTwcNotaryWithholdQrcodeRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryWithholdQrcodeRequest) SetProductInstanceId(v string) *CreateTwcNotaryWithholdQrcodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryWithholdQrcodeRequest) SetRegionName(v string) *CreateTwcNotaryWithholdQrcodeRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryWithholdQrcodeRequest) SetExternalAgreementNo(v string) *CreateTwcNotaryWithholdQrcodeRequest {
	s.ExternalAgreementNo = &v
	return s
}

func (s *CreateTwcNotaryWithholdQrcodeRequest) SetThirdPartyId(v string) *CreateTwcNotaryWithholdQrcodeRequest {
	s.ThirdPartyId = &v
	return s
}

type CreateTwcNotaryWithholdQrcodeResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 二维码图片链接地址
	QrCodeUrl *string `json:"qr_code_url,omitempty" xml:"qr_code_url,omitempty"`
}

func (s CreateTwcNotaryWithholdQrcodeResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryWithholdQrcodeResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryWithholdQrcodeResponse) SetReqMsgId(v string) *CreateTwcNotaryWithholdQrcodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryWithholdQrcodeResponse) SetResultCode(v string) *CreateTwcNotaryWithholdQrcodeResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryWithholdQrcodeResponse) SetResultMsg(v string) *CreateTwcNotaryWithholdQrcodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryWithholdQrcodeResponse) SetQrCodeUrl(v string) *CreateTwcNotaryWithholdQrcodeResponse {
	s.QrCodeUrl = &v
	return s
}

type CancelTwcNotaryContractPaysingletradeRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 被取消的某一期的代扣id
	CancelOutOrderNo *string `json:"cancel_out_order_no,omitempty" xml:"cancel_out_order_no,omitempty"`
	// 智能合同id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
}

func (s CancelTwcNotaryContractPaysingletradeRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelTwcNotaryContractPaysingletradeRequest) GoString() string {
	return s.String()
}

func (s *CancelTwcNotaryContractPaysingletradeRequest) SetAuthToken(v string) *CancelTwcNotaryContractPaysingletradeRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelTwcNotaryContractPaysingletradeRequest) SetProductInstanceId(v string) *CancelTwcNotaryContractPaysingletradeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelTwcNotaryContractPaysingletradeRequest) SetRegionName(v string) *CancelTwcNotaryContractPaysingletradeRequest {
	s.RegionName = &v
	return s
}

func (s *CancelTwcNotaryContractPaysingletradeRequest) SetCancelOutOrderNo(v string) *CancelTwcNotaryContractPaysingletradeRequest {
	s.CancelOutOrderNo = &v
	return s
}

func (s *CancelTwcNotaryContractPaysingletradeRequest) SetFlowId(v string) *CancelTwcNotaryContractPaysingletradeRequest {
	s.FlowId = &v
	return s
}

type CancelTwcNotaryContractPaysingletradeResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 被取消的某一期代扣订单id
	CanceledOutTradeNo *string `json:"canceled_out_trade_no,omitempty" xml:"canceled_out_trade_no,omitempty"`
	// 错误码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
}

func (s CancelTwcNotaryContractPaysingletradeResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelTwcNotaryContractPaysingletradeResponse) GoString() string {
	return s.String()
}

func (s *CancelTwcNotaryContractPaysingletradeResponse) SetReqMsgId(v string) *CancelTwcNotaryContractPaysingletradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelTwcNotaryContractPaysingletradeResponse) SetResultCode(v string) *CancelTwcNotaryContractPaysingletradeResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelTwcNotaryContractPaysingletradeResponse) SetResultMsg(v string) *CancelTwcNotaryContractPaysingletradeResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelTwcNotaryContractPaysingletradeResponse) SetCanceledOutTradeNo(v string) *CancelTwcNotaryContractPaysingletradeResponse {
	s.CanceledOutTradeNo = &v
	return s
}

func (s *CancelTwcNotaryContractPaysingletradeResponse) SetCode(v int64) *CancelTwcNotaryContractPaysingletradeResponse {
	s.Code = &v
	return s
}

func (s *CancelTwcNotaryContractPaysingletradeResponse) SetErrMessage(v string) *CancelTwcNotaryContractPaysingletradeResponse {
	s.ErrMessage = &v
	return s
}

type ApplyTwcNotaryContractCallbackkeyRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
}

func (s ApplyTwcNotaryContractCallbackkeyRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyTwcNotaryContractCallbackkeyRequest) GoString() string {
	return s.String()
}

func (s *ApplyTwcNotaryContractCallbackkeyRequest) SetAuthToken(v string) *ApplyTwcNotaryContractCallbackkeyRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyTwcNotaryContractCallbackkeyRequest) SetProductInstanceId(v string) *ApplyTwcNotaryContractCallbackkeyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyTwcNotaryContractCallbackkeyRequest) SetRegionName(v string) *ApplyTwcNotaryContractCallbackkeyRequest {
	s.RegionName = &v
	return s
}

type ApplyTwcNotaryContractCallbackkeyResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 加签使用的key
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s ApplyTwcNotaryContractCallbackkeyResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyTwcNotaryContractCallbackkeyResponse) GoString() string {
	return s.String()
}

func (s *ApplyTwcNotaryContractCallbackkeyResponse) SetReqMsgId(v string) *ApplyTwcNotaryContractCallbackkeyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyTwcNotaryContractCallbackkeyResponse) SetResultCode(v string) *ApplyTwcNotaryContractCallbackkeyResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyTwcNotaryContractCallbackkeyResponse) SetResultMsg(v string) *ApplyTwcNotaryContractCallbackkeyResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyTwcNotaryContractCallbackkeyResponse) SetCode(v int64) *ApplyTwcNotaryContractCallbackkeyResponse {
	s.Code = &v
	return s
}

func (s *ApplyTwcNotaryContractCallbackkeyResponse) SetKey(v string) *ApplyTwcNotaryContractCallbackkeyResponse {
	s.Key = &v
	return s
}

func (s *ApplyTwcNotaryContractCallbackkeyResponse) SetMessage(v string) *ApplyTwcNotaryContractCallbackkeyResponse {
	s.Message = &v
	return s
}

type CheckTwcNotaryEpidentityTwometaRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 认证企业名称。
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty"`
	// 企业证件号码。
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
}

func (s CheckTwcNotaryEpidentityTwometaRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckTwcNotaryEpidentityTwometaRequest) GoString() string {
	return s.String()
}

func (s *CheckTwcNotaryEpidentityTwometaRequest) SetAuthToken(v string) *CheckTwcNotaryEpidentityTwometaRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckTwcNotaryEpidentityTwometaRequest) SetProductInstanceId(v string) *CheckTwcNotaryEpidentityTwometaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckTwcNotaryEpidentityTwometaRequest) SetRegionName(v string) *CheckTwcNotaryEpidentityTwometaRequest {
	s.RegionName = &v
	return s
}

func (s *CheckTwcNotaryEpidentityTwometaRequest) SetEpCertName(v string) *CheckTwcNotaryEpidentityTwometaRequest {
	s.EpCertName = &v
	return s
}

func (s *CheckTwcNotaryEpidentityTwometaRequest) SetEpCertNo(v string) *CheckTwcNotaryEpidentityTwometaRequest {
	s.EpCertNo = &v
	return s
}

type CheckTwcNotaryEpidentityTwometaResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 0:核验成功 1:企业信息有误 2:企业非正常营业
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 企业状态。
	EnterpriseStatus *string `json:"enterprise_status,omitempty" xml:"enterprise_status,omitempty"`
	// 营业期限。
	OpenTime *string `json:"open_time,omitempty" xml:"open_time,omitempty"`
	// 核验是否通过。
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
}

func (s CheckTwcNotaryEpidentityTwometaResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckTwcNotaryEpidentityTwometaResponse) GoString() string {
	return s.String()
}

func (s *CheckTwcNotaryEpidentityTwometaResponse) SetReqMsgId(v string) *CheckTwcNotaryEpidentityTwometaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckTwcNotaryEpidentityTwometaResponse) SetResultCode(v string) *CheckTwcNotaryEpidentityTwometaResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckTwcNotaryEpidentityTwometaResponse) SetResultMsg(v string) *CheckTwcNotaryEpidentityTwometaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckTwcNotaryEpidentityTwometaResponse) SetCode(v string) *CheckTwcNotaryEpidentityTwometaResponse {
	s.Code = &v
	return s
}

func (s *CheckTwcNotaryEpidentityTwometaResponse) SetEnterpriseStatus(v string) *CheckTwcNotaryEpidentityTwometaResponse {
	s.EnterpriseStatus = &v
	return s
}

func (s *CheckTwcNotaryEpidentityTwometaResponse) SetOpenTime(v string) *CheckTwcNotaryEpidentityTwometaResponse {
	s.OpenTime = &v
	return s
}

func (s *CheckTwcNotaryEpidentityTwometaResponse) SetPassed(v bool) *CheckTwcNotaryEpidentityTwometaResponse {
	s.Passed = &v
	return s
}

type CheckTwcNotaryEpidentityThreemetaRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 认证企业名称。
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty"`
	// 企业证件号码。
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
	// 企业法人姓名。
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
}

func (s CheckTwcNotaryEpidentityThreemetaRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckTwcNotaryEpidentityThreemetaRequest) GoString() string {
	return s.String()
}

func (s *CheckTwcNotaryEpidentityThreemetaRequest) SetAuthToken(v string) *CheckTwcNotaryEpidentityThreemetaRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckTwcNotaryEpidentityThreemetaRequest) SetProductInstanceId(v string) *CheckTwcNotaryEpidentityThreemetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckTwcNotaryEpidentityThreemetaRequest) SetRegionName(v string) *CheckTwcNotaryEpidentityThreemetaRequest {
	s.RegionName = &v
	return s
}

func (s *CheckTwcNotaryEpidentityThreemetaRequest) SetEpCertName(v string) *CheckTwcNotaryEpidentityThreemetaRequest {
	s.EpCertName = &v
	return s
}

func (s *CheckTwcNotaryEpidentityThreemetaRequest) SetEpCertNo(v string) *CheckTwcNotaryEpidentityThreemetaRequest {
	s.EpCertNo = &v
	return s
}

func (s *CheckTwcNotaryEpidentityThreemetaRequest) SetLegalPersonCertName(v string) *CheckTwcNotaryEpidentityThreemetaRequest {
	s.LegalPersonCertName = &v
	return s
}

type CheckTwcNotaryEpidentityThreemetaResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 0:核验成功 1:企业信息有误 2:企业非正常营业
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 企业状态。
	EnterpriseStatus *string `json:"enterprise_status,omitempty" xml:"enterprise_status,omitempty"`
	// 营业期限。
	OpenTime *string `json:"open_time,omitempty" xml:"open_time,omitempty"`
	// 核验是否通过。
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
}

func (s CheckTwcNotaryEpidentityThreemetaResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckTwcNotaryEpidentityThreemetaResponse) GoString() string {
	return s.String()
}

func (s *CheckTwcNotaryEpidentityThreemetaResponse) SetReqMsgId(v string) *CheckTwcNotaryEpidentityThreemetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckTwcNotaryEpidentityThreemetaResponse) SetResultCode(v string) *CheckTwcNotaryEpidentityThreemetaResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckTwcNotaryEpidentityThreemetaResponse) SetResultMsg(v string) *CheckTwcNotaryEpidentityThreemetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckTwcNotaryEpidentityThreemetaResponse) SetCode(v string) *CheckTwcNotaryEpidentityThreemetaResponse {
	s.Code = &v
	return s
}

func (s *CheckTwcNotaryEpidentityThreemetaResponse) SetEnterpriseStatus(v string) *CheckTwcNotaryEpidentityThreemetaResponse {
	s.EnterpriseStatus = &v
	return s
}

func (s *CheckTwcNotaryEpidentityThreemetaResponse) SetOpenTime(v string) *CheckTwcNotaryEpidentityThreemetaResponse {
	s.OpenTime = &v
	return s
}

func (s *CheckTwcNotaryEpidentityThreemetaResponse) SetPassed(v bool) *CheckTwcNotaryEpidentityThreemetaResponse {
	s.Passed = &v
	return s
}

type CheckTwcNotaryEpidentityFourmetaRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 认证企业名称。
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty"`
	// 企业证件号码。
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
	// 企业法人姓名。
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
	// 企业法人身份证号码。
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
}

func (s CheckTwcNotaryEpidentityFourmetaRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckTwcNotaryEpidentityFourmetaRequest) GoString() string {
	return s.String()
}

func (s *CheckTwcNotaryEpidentityFourmetaRequest) SetAuthToken(v string) *CheckTwcNotaryEpidentityFourmetaRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckTwcNotaryEpidentityFourmetaRequest) SetProductInstanceId(v string) *CheckTwcNotaryEpidentityFourmetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckTwcNotaryEpidentityFourmetaRequest) SetRegionName(v string) *CheckTwcNotaryEpidentityFourmetaRequest {
	s.RegionName = &v
	return s
}

func (s *CheckTwcNotaryEpidentityFourmetaRequest) SetEpCertName(v string) *CheckTwcNotaryEpidentityFourmetaRequest {
	s.EpCertName = &v
	return s
}

func (s *CheckTwcNotaryEpidentityFourmetaRequest) SetEpCertNo(v string) *CheckTwcNotaryEpidentityFourmetaRequest {
	s.EpCertNo = &v
	return s
}

func (s *CheckTwcNotaryEpidentityFourmetaRequest) SetLegalPersonCertName(v string) *CheckTwcNotaryEpidentityFourmetaRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *CheckTwcNotaryEpidentityFourmetaRequest) SetLegalPersonCertNo(v string) *CheckTwcNotaryEpidentityFourmetaRequest {
	s.LegalPersonCertNo = &v
	return s
}

type CheckTwcNotaryEpidentityFourmetaResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 0:核验成功 1:企业信息有误 2:企业非正常营业
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 企业状态。
	EnterpriseStatus *string `json:"enterprise_status,omitempty" xml:"enterprise_status,omitempty"`
	// 营业期限。
	OpenTime *string `json:"open_time,omitempty" xml:"open_time,omitempty"`
	// 核验是否通过。
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
}

func (s CheckTwcNotaryEpidentityFourmetaResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckTwcNotaryEpidentityFourmetaResponse) GoString() string {
	return s.String()
}

func (s *CheckTwcNotaryEpidentityFourmetaResponse) SetReqMsgId(v string) *CheckTwcNotaryEpidentityFourmetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckTwcNotaryEpidentityFourmetaResponse) SetResultCode(v string) *CheckTwcNotaryEpidentityFourmetaResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckTwcNotaryEpidentityFourmetaResponse) SetResultMsg(v string) *CheckTwcNotaryEpidentityFourmetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckTwcNotaryEpidentityFourmetaResponse) SetCode(v string) *CheckTwcNotaryEpidentityFourmetaResponse {
	s.Code = &v
	return s
}

func (s *CheckTwcNotaryEpidentityFourmetaResponse) SetEnterpriseStatus(v string) *CheckTwcNotaryEpidentityFourmetaResponse {
	s.EnterpriseStatus = &v
	return s
}

func (s *CheckTwcNotaryEpidentityFourmetaResponse) SetOpenTime(v string) *CheckTwcNotaryEpidentityFourmetaResponse {
	s.OpenTime = &v
	return s
}

func (s *CheckTwcNotaryEpidentityFourmetaResponse) SetPassed(v bool) *CheckTwcNotaryEpidentityFourmetaResponse {
	s.Passed = &v
	return s
}

type CheckTwcNotaryNotarizationOrderRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 公证订单ID号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
}

func (s CheckTwcNotaryNotarizationOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckTwcNotaryNotarizationOrderRequest) GoString() string {
	return s.String()
}

func (s *CheckTwcNotaryNotarizationOrderRequest) SetAuthToken(v string) *CheckTwcNotaryNotarizationOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckTwcNotaryNotarizationOrderRequest) SetProductInstanceId(v string) *CheckTwcNotaryNotarizationOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckTwcNotaryNotarizationOrderRequest) SetRegionName(v string) *CheckTwcNotaryNotarizationOrderRequest {
	s.RegionName = &v
	return s
}

func (s *CheckTwcNotaryNotarizationOrderRequest) SetOrderId(v string) *CheckTwcNotaryNotarizationOrderRequest {
	s.OrderId = &v
	return s
}

type CheckTwcNotaryNotarizationOrderResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 下单的业务类型ID列表
	BizId []*string `json:"biz_id,omitempty" xml:"biz_id,omitempty" type:"Repeated"`
	// 实人认证接口调用授权码，与公证订单一一对应，有效次数默认为3次，超过调用次数则失效
	FaceAuthCode *string `json:"face_auth_code,omitempty" xml:"face_auth_code,omitempty"`
	// 平台公证机构ID
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty"`
	// 下单客户的账号ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 是否为合法订单
	Valid *bool `json:"valid,omitempty" xml:"valid,omitempty"`
}

func (s CheckTwcNotaryNotarizationOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckTwcNotaryNotarizationOrderResponse) GoString() string {
	return s.String()
}

func (s *CheckTwcNotaryNotarizationOrderResponse) SetReqMsgId(v string) *CheckTwcNotaryNotarizationOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckTwcNotaryNotarizationOrderResponse) SetResultCode(v string) *CheckTwcNotaryNotarizationOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckTwcNotaryNotarizationOrderResponse) SetResultMsg(v string) *CheckTwcNotaryNotarizationOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckTwcNotaryNotarizationOrderResponse) SetBizId(v []*string) *CheckTwcNotaryNotarizationOrderResponse {
	s.BizId = v
	return s
}

func (s *CheckTwcNotaryNotarizationOrderResponse) SetFaceAuthCode(v string) *CheckTwcNotaryNotarizationOrderResponse {
	s.FaceAuthCode = &v
	return s
}

func (s *CheckTwcNotaryNotarizationOrderResponse) SetOrgId(v string) *CheckTwcNotaryNotarizationOrderResponse {
	s.OrgId = &v
	return s
}

func (s *CheckTwcNotaryNotarizationOrderResponse) SetUserId(v string) *CheckTwcNotaryNotarizationOrderResponse {
	s.UserId = &v
	return s
}

func (s *CheckTwcNotaryNotarizationOrderResponse) SetValid(v bool) *CheckTwcNotaryNotarizationOrderResponse {
	s.Valid = &v
	return s
}

type UpdateTwcNotaryNotarizationOrderRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 公证订单ID
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 如果出证失败，需要给出失败原因
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty"`
	// 出证状态的枚举值
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s UpdateTwcNotaryNotarizationOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateTwcNotaryNotarizationOrderRequest) GoString() string {
	return s.String()
}

func (s *UpdateTwcNotaryNotarizationOrderRequest) SetAuthToken(v string) *UpdateTwcNotaryNotarizationOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateTwcNotaryNotarizationOrderRequest) SetProductInstanceId(v string) *UpdateTwcNotaryNotarizationOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateTwcNotaryNotarizationOrderRequest) SetRegionName(v string) *UpdateTwcNotaryNotarizationOrderRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateTwcNotaryNotarizationOrderRequest) SetOrderId(v string) *UpdateTwcNotaryNotarizationOrderRequest {
	s.OrderId = &v
	return s
}

func (s *UpdateTwcNotaryNotarizationOrderRequest) SetReason(v string) *UpdateTwcNotaryNotarizationOrderRequest {
	s.Reason = &v
	return s
}

func (s *UpdateTwcNotaryNotarizationOrderRequest) SetStatus(v string) *UpdateTwcNotaryNotarizationOrderRequest {
	s.Status = &v
	return s
}

type UpdateTwcNotaryNotarizationOrderResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态是否更新成功
	Accepted *bool `json:"accepted,omitempty" xml:"accepted,omitempty"`
	// 如更新失败，返回失败原因
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty"`
}

func (s UpdateTwcNotaryNotarizationOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateTwcNotaryNotarizationOrderResponse) GoString() string {
	return s.String()
}

func (s *UpdateTwcNotaryNotarizationOrderResponse) SetReqMsgId(v string) *UpdateTwcNotaryNotarizationOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateTwcNotaryNotarizationOrderResponse) SetResultCode(v string) *UpdateTwcNotaryNotarizationOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateTwcNotaryNotarizationOrderResponse) SetResultMsg(v string) *UpdateTwcNotaryNotarizationOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateTwcNotaryNotarizationOrderResponse) SetAccepted(v bool) *UpdateTwcNotaryNotarizationOrderResponse {
	s.Accepted = &v
	return s
}

func (s *UpdateTwcNotaryNotarizationOrderResponse) SetReason(v string) *UpdateTwcNotaryNotarizationOrderResponse {
	s.Reason = &v
	return s
}

type SetTwcNotaryNotarizationOrderRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 公证事项ID
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 需设置的属性名称
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// 公证订单ID
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 被设置字段的值
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s SetTwcNotaryNotarizationOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s SetTwcNotaryNotarizationOrderRequest) GoString() string {
	return s.String()
}

func (s *SetTwcNotaryNotarizationOrderRequest) SetAuthToken(v string) *SetTwcNotaryNotarizationOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *SetTwcNotaryNotarizationOrderRequest) SetProductInstanceId(v string) *SetTwcNotaryNotarizationOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SetTwcNotaryNotarizationOrderRequest) SetRegionName(v string) *SetTwcNotaryNotarizationOrderRequest {
	s.RegionName = &v
	return s
}

func (s *SetTwcNotaryNotarizationOrderRequest) SetBizCode(v string) *SetTwcNotaryNotarizationOrderRequest {
	s.BizCode = &v
	return s
}

func (s *SetTwcNotaryNotarizationOrderRequest) SetKey(v string) *SetTwcNotaryNotarizationOrderRequest {
	s.Key = &v
	return s
}

func (s *SetTwcNotaryNotarizationOrderRequest) SetOrderId(v string) *SetTwcNotaryNotarizationOrderRequest {
	s.OrderId = &v
	return s
}

func (s *SetTwcNotaryNotarizationOrderRequest) SetValue(v string) *SetTwcNotaryNotarizationOrderRequest {
	s.Value = &v
	return s
}

type SetTwcNotaryNotarizationOrderResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否设置成功
	Accepted *bool `json:"accepted,omitempty" xml:"accepted,omitempty"`
	// 如设置失败，返回失败原因
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty"`
}

func (s SetTwcNotaryNotarizationOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s SetTwcNotaryNotarizationOrderResponse) GoString() string {
	return s.String()
}

func (s *SetTwcNotaryNotarizationOrderResponse) SetReqMsgId(v string) *SetTwcNotaryNotarizationOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SetTwcNotaryNotarizationOrderResponse) SetResultCode(v string) *SetTwcNotaryNotarizationOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *SetTwcNotaryNotarizationOrderResponse) SetResultMsg(v string) *SetTwcNotaryNotarizationOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *SetTwcNotaryNotarizationOrderResponse) SetAccepted(v bool) *SetTwcNotaryNotarizationOrderResponse {
	s.Accepted = &v
	return s
}

func (s *SetTwcNotaryNotarizationOrderResponse) SetReason(v string) *SetTwcNotaryNotarizationOrderResponse {
	s.Reason = &v
	return s
}

type InitTwcNotaryIdentificationFaceauthRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 授权码，针对某些特定场景使用，非必填
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty"`
	// 认证人的姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 被验证者的身份证号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
}

func (s InitTwcNotaryIdentificationFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s InitTwcNotaryIdentificationFaceauthRequest) GoString() string {
	return s.String()
}

func (s *InitTwcNotaryIdentificationFaceauthRequest) SetAuthToken(v string) *InitTwcNotaryIdentificationFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *InitTwcNotaryIdentificationFaceauthRequest) SetProductInstanceId(v string) *InitTwcNotaryIdentificationFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitTwcNotaryIdentificationFaceauthRequest) SetRegionName(v string) *InitTwcNotaryIdentificationFaceauthRequest {
	s.RegionName = &v
	return s
}

func (s *InitTwcNotaryIdentificationFaceauthRequest) SetAuthCode(v string) *InitTwcNotaryIdentificationFaceauthRequest {
	s.AuthCode = &v
	return s
}

func (s *InitTwcNotaryIdentificationFaceauthRequest) SetCertName(v string) *InitTwcNotaryIdentificationFaceauthRequest {
	s.CertName = &v
	return s
}

func (s *InitTwcNotaryIdentificationFaceauthRequest) SetCertNo(v string) *InitTwcNotaryIdentificationFaceauthRequest {
	s.CertNo = &v
	return s
}

type InitTwcNotaryIdentificationFaceauthResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发起一个实人认证流程，获取到流程ID
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
}

func (s InitTwcNotaryIdentificationFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s InitTwcNotaryIdentificationFaceauthResponse) GoString() string {
	return s.String()
}

func (s *InitTwcNotaryIdentificationFaceauthResponse) SetReqMsgId(v string) *InitTwcNotaryIdentificationFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitTwcNotaryIdentificationFaceauthResponse) SetResultCode(v string) *InitTwcNotaryIdentificationFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *InitTwcNotaryIdentificationFaceauthResponse) SetResultMsg(v string) *InitTwcNotaryIdentificationFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitTwcNotaryIdentificationFaceauthResponse) SetCertifyId(v string) *InitTwcNotaryIdentificationFaceauthResponse {
	s.CertifyId = &v
	return s
}

type CertifyTwcNotaryIdentificationFaceauthRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 授权码，针对某些特定场景使用，非必填
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty"`
	// 认证流程结束回调通知地址，非必传
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 实人认证流程ID
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 认证结束后跳转地址，非必填
	RedirectUrl *string `json:"redirect_url,omitempty" xml:"redirect_url,omitempty"`
}

func (s CertifyTwcNotaryIdentificationFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s CertifyTwcNotaryIdentificationFaceauthRequest) GoString() string {
	return s.String()
}

func (s *CertifyTwcNotaryIdentificationFaceauthRequest) SetAuthToken(v string) *CertifyTwcNotaryIdentificationFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *CertifyTwcNotaryIdentificationFaceauthRequest) SetProductInstanceId(v string) *CertifyTwcNotaryIdentificationFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CertifyTwcNotaryIdentificationFaceauthRequest) SetRegionName(v string) *CertifyTwcNotaryIdentificationFaceauthRequest {
	s.RegionName = &v
	return s
}

func (s *CertifyTwcNotaryIdentificationFaceauthRequest) SetAuthCode(v string) *CertifyTwcNotaryIdentificationFaceauthRequest {
	s.AuthCode = &v
	return s
}

func (s *CertifyTwcNotaryIdentificationFaceauthRequest) SetCallbackUrl(v string) *CertifyTwcNotaryIdentificationFaceauthRequest {
	s.CallbackUrl = &v
	return s
}

func (s *CertifyTwcNotaryIdentificationFaceauthRequest) SetCertifyId(v string) *CertifyTwcNotaryIdentificationFaceauthRequest {
	s.CertifyId = &v
	return s
}

func (s *CertifyTwcNotaryIdentificationFaceauthRequest) SetRedirectUrl(v string) *CertifyTwcNotaryIdentificationFaceauthRequest {
	s.RedirectUrl = &v
	return s
}

type CertifyTwcNotaryIdentificationFaceauthResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实人认证流程ID
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 发起实人认证的地址
	VerifyUrl *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
}

func (s CertifyTwcNotaryIdentificationFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s CertifyTwcNotaryIdentificationFaceauthResponse) GoString() string {
	return s.String()
}

func (s *CertifyTwcNotaryIdentificationFaceauthResponse) SetReqMsgId(v string) *CertifyTwcNotaryIdentificationFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CertifyTwcNotaryIdentificationFaceauthResponse) SetResultCode(v string) *CertifyTwcNotaryIdentificationFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *CertifyTwcNotaryIdentificationFaceauthResponse) SetResultMsg(v string) *CertifyTwcNotaryIdentificationFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *CertifyTwcNotaryIdentificationFaceauthResponse) SetCertifyId(v string) *CertifyTwcNotaryIdentificationFaceauthResponse {
	s.CertifyId = &v
	return s
}

func (s *CertifyTwcNotaryIdentificationFaceauthResponse) SetVerifyUrl(v string) *CertifyTwcNotaryIdentificationFaceauthResponse {
	s.VerifyUrl = &v
	return s
}

type QueryTwcNotaryIdentificationFaceauthRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 授权码，针对某些特定场景使用，非必填
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty"`
	// 实人认证流程ID
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
}

func (s QueryTwcNotaryIdentificationFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryIdentificationFaceauthRequest) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryIdentificationFaceauthRequest) SetAuthToken(v string) *QueryTwcNotaryIdentificationFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwcNotaryIdentificationFaceauthRequest) SetProductInstanceId(v string) *QueryTwcNotaryIdentificationFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwcNotaryIdentificationFaceauthRequest) SetRegionName(v string) *QueryTwcNotaryIdentificationFaceauthRequest {
	s.RegionName = &v
	return s
}

func (s *QueryTwcNotaryIdentificationFaceauthRequest) SetAuthCode(v string) *QueryTwcNotaryIdentificationFaceauthRequest {
	s.AuthCode = &v
	return s
}

func (s *QueryTwcNotaryIdentificationFaceauthRequest) SetCertifyId(v string) *QueryTwcNotaryIdentificationFaceauthRequest {
	s.CertifyId = &v
	return s
}

type QueryTwcNotaryIdentificationFaceauthResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实人认证流程ID
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 是否通过实人认证
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
}

func (s QueryTwcNotaryIdentificationFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryIdentificationFaceauthResponse) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryIdentificationFaceauthResponse) SetReqMsgId(v string) *QueryTwcNotaryIdentificationFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwcNotaryIdentificationFaceauthResponse) SetResultCode(v string) *QueryTwcNotaryIdentificationFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwcNotaryIdentificationFaceauthResponse) SetResultMsg(v string) *QueryTwcNotaryIdentificationFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwcNotaryIdentificationFaceauthResponse) SetCertifyId(v string) *QueryTwcNotaryIdentificationFaceauthResponse {
	s.CertifyId = &v
	return s
}

func (s *QueryTwcNotaryIdentificationFaceauthResponse) SetPassed(v bool) *QueryTwcNotaryIdentificationFaceauthResponse {
	s.Passed = &v
	return s
}

type QueryTwcNotaryEnterpriseFaceauthRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 企业法人认证查询
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
}

func (s QueryTwcNotaryEnterpriseFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryEnterpriseFaceauthRequest) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryEnterpriseFaceauthRequest) SetAuthToken(v string) *QueryTwcNotaryEnterpriseFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwcNotaryEnterpriseFaceauthRequest) SetProductInstanceId(v string) *QueryTwcNotaryEnterpriseFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwcNotaryEnterpriseFaceauthRequest) SetRegionName(v string) *QueryTwcNotaryEnterpriseFaceauthRequest {
	s.RegionName = &v
	return s
}

func (s *QueryTwcNotaryEnterpriseFaceauthRequest) SetBizNo(v string) *QueryTwcNotaryEnterpriseFaceauthRequest {
	s.BizNo = &v
	return s
}

type QueryTwcNotaryEnterpriseFaceauthResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证唯一性标识
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 认证失败错误码
	FailedCode *string `json:"failed_code,omitempty" xml:"failed_code,omitempty"`
	// 认证是否通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
}

func (s QueryTwcNotaryEnterpriseFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryEnterpriseFaceauthResponse) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryEnterpriseFaceauthResponse) SetReqMsgId(v string) *QueryTwcNotaryEnterpriseFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwcNotaryEnterpriseFaceauthResponse) SetResultCode(v string) *QueryTwcNotaryEnterpriseFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwcNotaryEnterpriseFaceauthResponse) SetResultMsg(v string) *QueryTwcNotaryEnterpriseFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwcNotaryEnterpriseFaceauthResponse) SetBizNo(v string) *QueryTwcNotaryEnterpriseFaceauthResponse {
	s.BizNo = &v
	return s
}

func (s *QueryTwcNotaryEnterpriseFaceauthResponse) SetFailedCode(v string) *QueryTwcNotaryEnterpriseFaceauthResponse {
	s.FailedCode = &v
	return s
}

func (s *QueryTwcNotaryEnterpriseFaceauthResponse) SetPassed(v bool) *QueryTwcNotaryEnterpriseFaceauthResponse {
	s.Passed = &v
	return s
}

type InitTwcNotaryEnterpriseFaceauthRequest struct {
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
	// 企业法人身份证号（目前仅支持身份证号）
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
}

func (s InitTwcNotaryEnterpriseFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s InitTwcNotaryEnterpriseFaceauthRequest) GoString() string {
	return s.String()
}

func (s *InitTwcNotaryEnterpriseFaceauthRequest) SetAuthToken(v string) *InitTwcNotaryEnterpriseFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *InitTwcNotaryEnterpriseFaceauthRequest) SetProductInstanceId(v string) *InitTwcNotaryEnterpriseFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitTwcNotaryEnterpriseFaceauthRequest) SetRegionName(v string) *InitTwcNotaryEnterpriseFaceauthRequest {
	s.RegionName = &v
	return s
}

func (s *InitTwcNotaryEnterpriseFaceauthRequest) SetEpCertName(v string) *InitTwcNotaryEnterpriseFaceauthRequest {
	s.EpCertName = &v
	return s
}

func (s *InitTwcNotaryEnterpriseFaceauthRequest) SetEpCertNo(v string) *InitTwcNotaryEnterpriseFaceauthRequest {
	s.EpCertNo = &v
	return s
}

func (s *InitTwcNotaryEnterpriseFaceauthRequest) SetEpCertType(v string) *InitTwcNotaryEnterpriseFaceauthRequest {
	s.EpCertType = &v
	return s
}

func (s *InitTwcNotaryEnterpriseFaceauthRequest) SetLegalPersonCertName(v string) *InitTwcNotaryEnterpriseFaceauthRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *InitTwcNotaryEnterpriseFaceauthRequest) SetLegalPersonCertNo(v string) *InitTwcNotaryEnterpriseFaceauthRequest {
	s.LegalPersonCertNo = &v
	return s
}

type InitTwcNotaryEnterpriseFaceauthResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 本次认证的业务唯一性标示
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
}

func (s InitTwcNotaryEnterpriseFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s InitTwcNotaryEnterpriseFaceauthResponse) GoString() string {
	return s.String()
}

func (s *InitTwcNotaryEnterpriseFaceauthResponse) SetReqMsgId(v string) *InitTwcNotaryEnterpriseFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitTwcNotaryEnterpriseFaceauthResponse) SetResultCode(v string) *InitTwcNotaryEnterpriseFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *InitTwcNotaryEnterpriseFaceauthResponse) SetResultMsg(v string) *InitTwcNotaryEnterpriseFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitTwcNotaryEnterpriseFaceauthResponse) SetBizNo(v string) *InitTwcNotaryEnterpriseFaceauthResponse {
	s.BizNo = &v
	return s
}

type CertifyTwcNotaryEnterpriseFaceauthRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 业务唯一性标识
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 回调通知地址
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 认证完成后回跳地址
	RedirectUrl *string `json:"redirect_url,omitempty" xml:"redirect_url,omitempty"`
}

func (s CertifyTwcNotaryEnterpriseFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s CertifyTwcNotaryEnterpriseFaceauthRequest) GoString() string {
	return s.String()
}

func (s *CertifyTwcNotaryEnterpriseFaceauthRequest) SetAuthToken(v string) *CertifyTwcNotaryEnterpriseFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *CertifyTwcNotaryEnterpriseFaceauthRequest) SetProductInstanceId(v string) *CertifyTwcNotaryEnterpriseFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CertifyTwcNotaryEnterpriseFaceauthRequest) SetRegionName(v string) *CertifyTwcNotaryEnterpriseFaceauthRequest {
	s.RegionName = &v
	return s
}

func (s *CertifyTwcNotaryEnterpriseFaceauthRequest) SetBizNo(v string) *CertifyTwcNotaryEnterpriseFaceauthRequest {
	s.BizNo = &v
	return s
}

func (s *CertifyTwcNotaryEnterpriseFaceauthRequest) SetCallbackUrl(v string) *CertifyTwcNotaryEnterpriseFaceauthRequest {
	s.CallbackUrl = &v
	return s
}

func (s *CertifyTwcNotaryEnterpriseFaceauthRequest) SetRedirectUrl(v string) *CertifyTwcNotaryEnterpriseFaceauthRequest {
	s.RedirectUrl = &v
	return s
}

type CertifyTwcNotaryEnterpriseFaceauthResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务唯一性标识
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 认证 url
	VerifyUrl *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
}

func (s CertifyTwcNotaryEnterpriseFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s CertifyTwcNotaryEnterpriseFaceauthResponse) GoString() string {
	return s.String()
}

func (s *CertifyTwcNotaryEnterpriseFaceauthResponse) SetReqMsgId(v string) *CertifyTwcNotaryEnterpriseFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CertifyTwcNotaryEnterpriseFaceauthResponse) SetResultCode(v string) *CertifyTwcNotaryEnterpriseFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *CertifyTwcNotaryEnterpriseFaceauthResponse) SetResultMsg(v string) *CertifyTwcNotaryEnterpriseFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *CertifyTwcNotaryEnterpriseFaceauthResponse) SetBizNo(v string) *CertifyTwcNotaryEnterpriseFaceauthResponse {
	s.BizNo = &v
	return s
}

func (s *CertifyTwcNotaryEnterpriseFaceauthResponse) SetVerifyUrl(v string) *CertifyTwcNotaryEnterpriseFaceauthResponse {
	s.VerifyUrl = &v
	return s
}

type CreateTwcNotaryLeaseOrderRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 账号标识，可弃用
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 支付宝交易金额
	AlipayOrderAmount *int64 `json:"alipay_order_amount,omitempty" xml:"alipay_order_amount,omitempty" minimum:"undefined"`
	// 支付宝订单号
	AlipayOrderNo *string `json:"alipay_order_no,omitempty" xml:"alipay_order_no,omitempty"`
	// 支付宝交易总金额
	AlipayOrderTotalAmount *int64 `json:"alipay_order_total_amount,omitempty" xml:"alipay_order_total_amount,omitempty" minimum:"undefined"`
	// 免押金额
	DepositWaiveAmount *int64 `json:"deposit_waive_amount,omitempty" xml:"deposit_waive_amount,omitempty" minimum:"undefined"`
	// 保险缴费金额，单位分
	InsuranceBillAmount *int64 `json:"insurance_bill_amount,omitempty" xml:"insurance_bill_amount,omitempty"`
	// 保险缴费单号，insured为True时必填，仅支持数字和字母，长度20
	InsuranceBillNo *string `json:"insurance_bill_no,omitempty" xml:"insurance_bill_no,omitempty"`
	// 保险缴费北京时间，格式为"YYYYMMDDHHMISS"，时区为UTC+8
	InsuranceBillTime *string `json:"insurance_bill_time,omitempty" xml:"insurance_bill_time,omitempty"`
	// 订单总保额，单位分，insured为True时必填
	InsuranceCoverage *int64 `json:"insurance_coverage,omitempty" xml:"insurance_coverage,omitempty" minimum:"undefined"`
	// 保单号，insured为True时必填，仅支持数字和字母
	InsuranceOrderNo *string `json:"insurance_order_no,omitempty" xml:"insurance_order_no,omitempty"`
	// 保单查询地址，insured为True时必填
	InsuranceOrderUrl *string `json:"insurance_order_url,omitempty" xml:"insurance_order_url,omitempty"`
	// 订单产品保额，单位分，insured为True时必填
	InsuranceProductCoverage *int64 `json:"insurance_product_coverage,omitempty" xml:"insurance_product_coverage,omitempty"`
	// 是否投保，默认为True
	Insured *bool `json:"insured,omitempty" xml:"insured,omitempty"`
	// 商品名称
	ItemName *string `json:"item_name,omitempty" xml:"item_name,omitempty"`
	// 商品市场价格
	ItemPrice *int64 `json:"item_price,omitempty" xml:"item_price,omitempty" minimum:"undefined"`
	// 商品类目
	ItemType *string `json:"item_type,omitempty" xml:"item_type,omitempty"`
	// 商户支付宝账号
	MerchantAlipayAccount *string `json:"merchant_alipay_account,omitempty" xml:"merchant_alipay_account,omitempty"`
	// 商户支付宝ID
	MerchantAlipayId *string `json:"merchant_alipay_id,omitempty" xml:"merchant_alipay_id,omitempty"`
	// 商户名称
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty"`
	// 商户单号
	MerchantOrderNo *string `json:"merchant_order_no,omitempty" xml:"merchant_order_no,omitempty"`
	// 支付渠道，包括支付宝（Alipay）、第三方收单机构（ThirdParty）、信用卡（CreditCard）、银行转账（BankTransfer）、微信（WeChatPay）、其他（Other）
	PaymentChannel *string `json:"payment_channel,omitempty" xml:"payment_channel,omitempty"`
	// 租约结束日期
	TenancyTermEnd *int64 `json:"tenancy_term_end,omitempty" xml:"tenancy_term_end,omitempty" minimum:"undefined"`
	// 租约起始日期
	TenancyTermStart *int64 `json:"tenancy_term_start,omitempty" xml:"tenancy_term_start,omitempty" minimum:"undefined"`
}

func (s CreateTwcNotaryLeaseOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseOrderRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseOrderRequest) SetAuthToken(v string) *CreateTwcNotaryLeaseOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderRequest) SetProductInstanceId(v string) *CreateTwcNotaryLeaseOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderRequest) SetRegionName(v string) *CreateTwcNotaryLeaseOrderRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderRequest) SetAccountId(v string) *CreateTwcNotaryLeaseOrderRequest {
	s.AccountId = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderRequest) SetAlipayOrderAmount(v int64) *CreateTwcNotaryLeaseOrderRequest {
	s.AlipayOrderAmount = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderRequest) SetAlipayOrderNo(v string) *CreateTwcNotaryLeaseOrderRequest {
	s.AlipayOrderNo = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderRequest) SetAlipayOrderTotalAmount(v int64) *CreateTwcNotaryLeaseOrderRequest {
	s.AlipayOrderTotalAmount = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderRequest) SetDepositWaiveAmount(v int64) *CreateTwcNotaryLeaseOrderRequest {
	s.DepositWaiveAmount = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderRequest) SetInsuranceBillAmount(v int64) *CreateTwcNotaryLeaseOrderRequest {
	s.InsuranceBillAmount = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderRequest) SetInsuranceBillNo(v string) *CreateTwcNotaryLeaseOrderRequest {
	s.InsuranceBillNo = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderRequest) SetInsuranceBillTime(v string) *CreateTwcNotaryLeaseOrderRequest {
	s.InsuranceBillTime = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderRequest) SetInsuranceCoverage(v int64) *CreateTwcNotaryLeaseOrderRequest {
	s.InsuranceCoverage = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderRequest) SetInsuranceOrderNo(v string) *CreateTwcNotaryLeaseOrderRequest {
	s.InsuranceOrderNo = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderRequest) SetInsuranceOrderUrl(v string) *CreateTwcNotaryLeaseOrderRequest {
	s.InsuranceOrderUrl = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderRequest) SetInsuranceProductCoverage(v int64) *CreateTwcNotaryLeaseOrderRequest {
	s.InsuranceProductCoverage = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderRequest) SetInsured(v bool) *CreateTwcNotaryLeaseOrderRequest {
	s.Insured = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderRequest) SetItemName(v string) *CreateTwcNotaryLeaseOrderRequest {
	s.ItemName = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderRequest) SetItemPrice(v int64) *CreateTwcNotaryLeaseOrderRequest {
	s.ItemPrice = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderRequest) SetItemType(v string) *CreateTwcNotaryLeaseOrderRequest {
	s.ItemType = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderRequest) SetMerchantAlipayAccount(v string) *CreateTwcNotaryLeaseOrderRequest {
	s.MerchantAlipayAccount = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderRequest) SetMerchantAlipayId(v string) *CreateTwcNotaryLeaseOrderRequest {
	s.MerchantAlipayId = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderRequest) SetMerchantName(v string) *CreateTwcNotaryLeaseOrderRequest {
	s.MerchantName = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderRequest) SetMerchantOrderNo(v string) *CreateTwcNotaryLeaseOrderRequest {
	s.MerchantOrderNo = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderRequest) SetPaymentChannel(v string) *CreateTwcNotaryLeaseOrderRequest {
	s.PaymentChannel = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderRequest) SetTenancyTermEnd(v int64) *CreateTwcNotaryLeaseOrderRequest {
	s.TenancyTermEnd = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderRequest) SetTenancyTermStart(v int64) *CreateTwcNotaryLeaseOrderRequest {
	s.TenancyTermStart = &v
	return s
}

type CreateTwcNotaryLeaseOrderResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s CreateTwcNotaryLeaseOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseOrderResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseOrderResponse) SetReqMsgId(v string) *CreateTwcNotaryLeaseOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderResponse) SetResultCode(v string) *CreateTwcNotaryLeaseOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderResponse) SetResultMsg(v string) *CreateTwcNotaryLeaseOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderResponse) SetSuccess(v bool) *CreateTwcNotaryLeaseOrderResponse {
	s.Success = &v
	return s
}

type CreateTwcNotaryNotarizationBillRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
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
	ENotarizationValidDate *string `json:"e_notarization_valid_date,omitempty" xml:"e_notarization_valid_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 是否为酬金分润方式，是则按照订金额一定比例分润，否则直接支付订单金额
	FeeSplitting *bool `json:"fee_splitting,omitempty" xml:"fee_splitting,omitempty"`
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
	Scenario *string `json:"scenario,omitempty" xml:"scenario,omitempty"`
	// 申请者身份类型，1个人，2企业
	UserType *int64 `json:"user_type,omitempty" xml:"user_type,omitempty"`
}

func (s CreateTwcNotaryNotarizationBillRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryNotarizationBillRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryNotarizationBillRequest) SetAuthToken(v string) *CreateTwcNotaryNotarizationBillRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryNotarizationBillRequest) SetProductInstanceId(v string) *CreateTwcNotaryNotarizationBillRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryNotarizationBillRequest) SetRegionName(v string) *CreateTwcNotaryNotarizationBillRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryNotarizationBillRequest) SetAlipayOrderNo(v string) *CreateTwcNotaryNotarizationBillRequest {
	s.AlipayOrderNo = &v
	return s
}

func (s *CreateTwcNotaryNotarizationBillRequest) SetAlipayUid(v string) *CreateTwcNotaryNotarizationBillRequest {
	s.AlipayUid = &v
	return s
}

func (s *CreateTwcNotaryNotarizationBillRequest) SetCertName(v string) *CreateTwcNotaryNotarizationBillRequest {
	s.CertName = &v
	return s
}

func (s *CreateTwcNotaryNotarizationBillRequest) SetCertNo(v string) *CreateTwcNotaryNotarizationBillRequest {
	s.CertNo = &v
	return s
}

func (s *CreateTwcNotaryNotarizationBillRequest) SetENotarizationBiz(v string) *CreateTwcNotaryNotarizationBillRequest {
	s.ENotarizationBiz = &v
	return s
}

func (s *CreateTwcNotaryNotarizationBillRequest) SetENotarizationDownloadUrl(v string) *CreateTwcNotaryNotarizationBillRequest {
	s.ENotarizationDownloadUrl = &v
	return s
}

func (s *CreateTwcNotaryNotarizationBillRequest) SetENotarizationNo(v string) *CreateTwcNotaryNotarizationBillRequest {
	s.ENotarizationNo = &v
	return s
}

func (s *CreateTwcNotaryNotarizationBillRequest) SetENotarizationPageNo(v string) *CreateTwcNotaryNotarizationBillRequest {
	s.ENotarizationPageNo = &v
	return s
}

func (s *CreateTwcNotaryNotarizationBillRequest) SetENotarizationStatus(v string) *CreateTwcNotaryNotarizationBillRequest {
	s.ENotarizationStatus = &v
	return s
}

func (s *CreateTwcNotaryNotarizationBillRequest) SetENotarizationUsage(v string) *CreateTwcNotaryNotarizationBillRequest {
	s.ENotarizationUsage = &v
	return s
}

func (s *CreateTwcNotaryNotarizationBillRequest) SetENotarizationValidDate(v string) *CreateTwcNotaryNotarizationBillRequest {
	s.ENotarizationValidDate = &v
	return s
}

func (s *CreateTwcNotaryNotarizationBillRequest) SetFeeSplitting(v bool) *CreateTwcNotaryNotarizationBillRequest {
	s.FeeSplitting = &v
	return s
}

func (s *CreateTwcNotaryNotarizationBillRequest) SetLegalPersonName(v string) *CreateTwcNotaryNotarizationBillRequest {
	s.LegalPersonName = &v
	return s
}

func (s *CreateTwcNotaryNotarizationBillRequest) SetOrderId(v string) *CreateTwcNotaryNotarizationBillRequest {
	s.OrderId = &v
	return s
}

func (s *CreateTwcNotaryNotarizationBillRequest) SetOrgId(v string) *CreateTwcNotaryNotarizationBillRequest {
	s.OrgId = &v
	return s
}

func (s *CreateTwcNotaryNotarizationBillRequest) SetPaymentAmount(v int64) *CreateTwcNotaryNotarizationBillRequest {
	s.PaymentAmount = &v
	return s
}

func (s *CreateTwcNotaryNotarizationBillRequest) SetPhone(v string) *CreateTwcNotaryNotarizationBillRequest {
	s.Phone = &v
	return s
}

func (s *CreateTwcNotaryNotarizationBillRequest) SetScenario(v string) *CreateTwcNotaryNotarizationBillRequest {
	s.Scenario = &v
	return s
}

func (s *CreateTwcNotaryNotarizationBillRequest) SetUserType(v int64) *CreateTwcNotaryNotarizationBillRequest {
	s.UserType = &v
	return s
}

type CreateTwcNotaryNotarizationBillResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 计费订单是否创建成功
	Accepted *bool `json:"accepted,omitempty" xml:"accepted,omitempty"`
}

func (s CreateTwcNotaryNotarizationBillResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryNotarizationBillResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryNotarizationBillResponse) SetReqMsgId(v string) *CreateTwcNotaryNotarizationBillResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryNotarizationBillResponse) SetResultCode(v string) *CreateTwcNotaryNotarizationBillResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryNotarizationBillResponse) SetResultMsg(v string) *CreateTwcNotaryNotarizationBillResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryNotarizationBillResponse) SetAccepted(v bool) *CreateTwcNotaryNotarizationBillResponse {
	s.Accepted = &v
	return s
}

type InitTwcNotaryCertificationRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 申请人的身份信息
	Applier *Identity `json:"applier,omitempty" xml:"applier,omitempty"`
	// 存证证明所要展示的存证信息，可填多个
	NotaryInfo []*NotaryInfo `json:"notary_info,omitempty" xml:"notary_info,omitempty" type:"Repeated"`
	// 存证证明的类型：STANDARD（标准存证证明）或COPYRIGHT（版权存证证明），默认为COPYRIGHT
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s InitTwcNotaryCertificationRequest) String() string {
	return tea.Prettify(s)
}

func (s InitTwcNotaryCertificationRequest) GoString() string {
	return s.String()
}

func (s *InitTwcNotaryCertificationRequest) SetAuthToken(v string) *InitTwcNotaryCertificationRequest {
	s.AuthToken = &v
	return s
}

func (s *InitTwcNotaryCertificationRequest) SetProductInstanceId(v string) *InitTwcNotaryCertificationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitTwcNotaryCertificationRequest) SetRegionName(v string) *InitTwcNotaryCertificationRequest {
	s.RegionName = &v
	return s
}

func (s *InitTwcNotaryCertificationRequest) SetApplier(v *Identity) *InitTwcNotaryCertificationRequest {
	s.Applier = v
	return s
}

func (s *InitTwcNotaryCertificationRequest) SetNotaryInfo(v []*NotaryInfo) *InitTwcNotaryCertificationRequest {
	s.NotaryInfo = v
	return s
}

func (s *InitTwcNotaryCertificationRequest) SetType(v string) *InitTwcNotaryCertificationRequest {
	s.Type = &v
	return s
}

type InitTwcNotaryCertificationResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s InitTwcNotaryCertificationResponse) String() string {
	return tea.Prettify(s)
}

func (s InitTwcNotaryCertificationResponse) GoString() string {
	return s.String()
}

func (s *InitTwcNotaryCertificationResponse) SetReqMsgId(v string) *InitTwcNotaryCertificationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitTwcNotaryCertificationResponse) SetResultCode(v string) *InitTwcNotaryCertificationResponse {
	s.ResultCode = &v
	return s
}

func (s *InitTwcNotaryCertificationResponse) SetResultMsg(v string) *InitTwcNotaryCertificationResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitTwcNotaryCertificationResponse) SetCode(v string) *InitTwcNotaryCertificationResponse {
	s.Code = &v
	return s
}

func (s *InitTwcNotaryCertificationResponse) SetMessage(v string) *InitTwcNotaryCertificationResponse {
	s.Message = &v
	return s
}

func (s *InitTwcNotaryCertificationResponse) SetOrderId(v string) *InitTwcNotaryCertificationResponse {
	s.OrderId = &v
	return s
}

func (s *InitTwcNotaryCertificationResponse) SetPayContent(v string) *InitTwcNotaryCertificationResponse {
	s.PayContent = &v
	return s
}

type QueryTwcNotaryCertificationRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 存证证明申请的订单ID
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
}

func (s QueryTwcNotaryCertificationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryCertificationRequest) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryCertificationRequest) SetAuthToken(v string) *QueryTwcNotaryCertificationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwcNotaryCertificationRequest) SetProductInstanceId(v string) *QueryTwcNotaryCertificationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwcNotaryCertificationRequest) SetRegionName(v string) *QueryTwcNotaryCertificationRequest {
	s.RegionName = &v
	return s
}

func (s *QueryTwcNotaryCertificationRequest) SetOrderId(v string) *QueryTwcNotaryCertificationRequest {
	s.OrderId = &v
	return s
}

type QueryTwcNotaryCertificationResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证证明的证书信息列表
	CertificateInfo []*CertificateInfo `json:"certificate_info,omitempty" xml:"certificate_info,omitempty" type:"Repeated"`
	// 返回值状态码，0000则为成功
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 异常状态时的错误信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s QueryTwcNotaryCertificationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryCertificationResponse) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryCertificationResponse) SetReqMsgId(v string) *QueryTwcNotaryCertificationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwcNotaryCertificationResponse) SetResultCode(v string) *QueryTwcNotaryCertificationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwcNotaryCertificationResponse) SetResultMsg(v string) *QueryTwcNotaryCertificationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwcNotaryCertificationResponse) SetCertificateInfo(v []*CertificateInfo) *QueryTwcNotaryCertificationResponse {
	s.CertificateInfo = v
	return s
}

func (s *QueryTwcNotaryCertificationResponse) SetCode(v string) *QueryTwcNotaryCertificationResponse {
	s.Code = &v
	return s
}

func (s *QueryTwcNotaryCertificationResponse) SetMessage(v string) *QueryTwcNotaryCertificationResponse {
	s.Message = &v
	return s
}

type GetTwcNotaryTsrCertificateRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
}

func (s GetTwcNotaryTsrCertificateRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTwcNotaryTsrCertificateRequest) GoString() string {
	return s.String()
}

func (s *GetTwcNotaryTsrCertificateRequest) SetAuthToken(v string) *GetTwcNotaryTsrCertificateRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTwcNotaryTsrCertificateRequest) SetProductInstanceId(v string) *GetTwcNotaryTsrCertificateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTwcNotaryTsrCertificateRequest) SetRegionName(v string) *GetTwcNotaryTsrCertificateRequest {
	s.RegionName = &v
	return s
}

type GetTwcNotaryTsrCertificateResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s GetTwcNotaryTsrCertificateResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTwcNotaryTsrCertificateResponse) GoString() string {
	return s.String()
}

func (s *GetTwcNotaryTsrCertificateResponse) SetReqMsgId(v string) *GetTwcNotaryTsrCertificateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTwcNotaryTsrCertificateResponse) SetResultCode(v string) *GetTwcNotaryTsrCertificateResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTwcNotaryTsrCertificateResponse) SetResultMsg(v string) *GetTwcNotaryTsrCertificateResponse {
	s.ResultMsg = &v
	return s
}

type SaveTwcNotaryJointconstraintRecordRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 收款账户
	BeneficiaryAccountCode *string `json:"beneficiary_account_code,omitempty" xml:"beneficiary_account_code,omitempty"`
	// 收款账户类型
	//
	// 1：支付宝
	BeneficiaryAccountType *int64 `json:"beneficiary_account_type,omitempty" xml:"beneficiary_account_type,omitempty"`
	// 应收方证件号码
	//
	//
	BeneficiaryCertNumber *string `json:"beneficiary_cert_number,omitempty" xml:"beneficiary_cert_number,omitempty"`
	// 应收方证件类型
	//
	// 0：统一社会信用代码
	//
	// 1：身份证号码
	BeneficiaryCertType *int64 `json:"beneficiary_cert_type,omitempty" xml:"beneficiary_cert_type,omitempty"`
	//
	// 应收方类型
	//
	// 0：企业
	//
	// 1：个人
	BeneficiaryType *int64 `json:"beneficiary_type,omitempty" xml:"beneficiary_type,omitempty"`
	// 合同编号
	ContractCode *string `json:"contract_code,omitempty" xml:"contract_code,omitempty"`
	// 合同履行记录标签
	ContractFulfillmentCode *string `json:"contract_fulfillment_code,omitempty" xml:"contract_fulfillment_code,omitempty"`
	// 合同名称
	ContractName *string `json:"contract_name,omitempty" xml:"contract_name,omitempty"`
	// 合同存证哈希
	ContractTxhash *string `json:"contract_txhash,omitempty" xml:"contract_txhash,omitempty"`
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
	PaidTime *string `json:"paid_time,omitempty" xml:"paid_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
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
	PayerCertNumber *string `json:"payer_cert_number,omitempty" xml:"payer_cert_number,omitempty"`
	// 应付方证件类型
	//
	// 0：统一社会信用代码
	//
	// 1：身份证号码
	PayerCertType *int64 `json:"payer_cert_type,omitempty" xml:"payer_cert_type,omitempty"`
	// 应付方类型
	//
	// 0：企业
	//
	// 1：个人
	PayerType *int64 `json:"payer_type,omitempty" xml:"payer_type,omitempty"`
	// 履约标的金额
	//
	//
	PaymentAmount *string `json:"payment_amount,omitempty" xml:"payment_amount,omitempty"`
	// 履约宽限期，单位：天
	//
	//
	PaymentDateBuffer *int64 `json:"payment_date_buffer,omitempty" xml:"payment_date_buffer,omitempty"`
	// 目标履约日期
	//
	//
	PaymentDeadline *string `json:"payment_deadline,omitempty" xml:"payment_deadline,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
}

func (s SaveTwcNotaryJointconstraintRecordRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveTwcNotaryJointconstraintRecordRequest) GoString() string {
	return s.String()
}

func (s *SaveTwcNotaryJointconstraintRecordRequest) SetAuthToken(v string) *SaveTwcNotaryJointconstraintRecordRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveTwcNotaryJointconstraintRecordRequest) SetProductInstanceId(v string) *SaveTwcNotaryJointconstraintRecordRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveTwcNotaryJointconstraintRecordRequest) SetRegionName(v string) *SaveTwcNotaryJointconstraintRecordRequest {
	s.RegionName = &v
	return s
}

func (s *SaveTwcNotaryJointconstraintRecordRequest) SetBeneficiaryAccountCode(v string) *SaveTwcNotaryJointconstraintRecordRequest {
	s.BeneficiaryAccountCode = &v
	return s
}

func (s *SaveTwcNotaryJointconstraintRecordRequest) SetBeneficiaryAccountType(v int64) *SaveTwcNotaryJointconstraintRecordRequest {
	s.BeneficiaryAccountType = &v
	return s
}

func (s *SaveTwcNotaryJointconstraintRecordRequest) SetBeneficiaryCertNumber(v string) *SaveTwcNotaryJointconstraintRecordRequest {
	s.BeneficiaryCertNumber = &v
	return s
}

func (s *SaveTwcNotaryJointconstraintRecordRequest) SetBeneficiaryCertType(v int64) *SaveTwcNotaryJointconstraintRecordRequest {
	s.BeneficiaryCertType = &v
	return s
}

func (s *SaveTwcNotaryJointconstraintRecordRequest) SetBeneficiaryType(v int64) *SaveTwcNotaryJointconstraintRecordRequest {
	s.BeneficiaryType = &v
	return s
}

func (s *SaveTwcNotaryJointconstraintRecordRequest) SetContractCode(v string) *SaveTwcNotaryJointconstraintRecordRequest {
	s.ContractCode = &v
	return s
}

func (s *SaveTwcNotaryJointconstraintRecordRequest) SetContractFulfillmentCode(v string) *SaveTwcNotaryJointconstraintRecordRequest {
	s.ContractFulfillmentCode = &v
	return s
}

func (s *SaveTwcNotaryJointconstraintRecordRequest) SetContractName(v string) *SaveTwcNotaryJointconstraintRecordRequest {
	s.ContractName = &v
	return s
}

func (s *SaveTwcNotaryJointconstraintRecordRequest) SetContractTxhash(v string) *SaveTwcNotaryJointconstraintRecordRequest {
	s.ContractTxhash = &v
	return s
}

func (s *SaveTwcNotaryJointconstraintRecordRequest) SetExternalUrl(v string) *SaveTwcNotaryJointconstraintRecordRequest {
	s.ExternalUrl = &v
	return s
}

func (s *SaveTwcNotaryJointconstraintRecordRequest) SetIndustryCode(v string) *SaveTwcNotaryJointconstraintRecordRequest {
	s.IndustryCode = &v
	return s
}

func (s *SaveTwcNotaryJointconstraintRecordRequest) SetPaidAmount(v string) *SaveTwcNotaryJointconstraintRecordRequest {
	s.PaidAmount = &v
	return s
}

func (s *SaveTwcNotaryJointconstraintRecordRequest) SetPaidProof(v string) *SaveTwcNotaryJointconstraintRecordRequest {
	s.PaidProof = &v
	return s
}

func (s *SaveTwcNotaryJointconstraintRecordRequest) SetPaidTime(v string) *SaveTwcNotaryJointconstraintRecordRequest {
	s.PaidTime = &v
	return s
}

func (s *SaveTwcNotaryJointconstraintRecordRequest) SetPayerAccountCode(v string) *SaveTwcNotaryJointconstraintRecordRequest {
	s.PayerAccountCode = &v
	return s
}

func (s *SaveTwcNotaryJointconstraintRecordRequest) SetPayerAccountType(v int64) *SaveTwcNotaryJointconstraintRecordRequest {
	s.PayerAccountType = &v
	return s
}

func (s *SaveTwcNotaryJointconstraintRecordRequest) SetPayerCertNumber(v string) *SaveTwcNotaryJointconstraintRecordRequest {
	s.PayerCertNumber = &v
	return s
}

func (s *SaveTwcNotaryJointconstraintRecordRequest) SetPayerCertType(v int64) *SaveTwcNotaryJointconstraintRecordRequest {
	s.PayerCertType = &v
	return s
}

func (s *SaveTwcNotaryJointconstraintRecordRequest) SetPayerType(v int64) *SaveTwcNotaryJointconstraintRecordRequest {
	s.PayerType = &v
	return s
}

func (s *SaveTwcNotaryJointconstraintRecordRequest) SetPaymentAmount(v string) *SaveTwcNotaryJointconstraintRecordRequest {
	s.PaymentAmount = &v
	return s
}

func (s *SaveTwcNotaryJointconstraintRecordRequest) SetPaymentDateBuffer(v int64) *SaveTwcNotaryJointconstraintRecordRequest {
	s.PaymentDateBuffer = &v
	return s
}

func (s *SaveTwcNotaryJointconstraintRecordRequest) SetPaymentDeadline(v string) *SaveTwcNotaryJointconstraintRecordRequest {
	s.PaymentDeadline = &v
	return s
}

type SaveTwcNotaryJointconstraintRecordResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SaveTwcNotaryJointconstraintRecordResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveTwcNotaryJointconstraintRecordResponse) GoString() string {
	return s.String()
}

func (s *SaveTwcNotaryJointconstraintRecordResponse) SetReqMsgId(v string) *SaveTwcNotaryJointconstraintRecordResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveTwcNotaryJointconstraintRecordResponse) SetResultCode(v string) *SaveTwcNotaryJointconstraintRecordResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveTwcNotaryJointconstraintRecordResponse) SetResultMsg(v string) *SaveTwcNotaryJointconstraintRecordResponse {
	s.ResultMsg = &v
	return s
}

type DeleteTwcNotaryJointconstraintRecordRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 合同编号
	//
	//
	ContractCode *string `json:"contract_code,omitempty" xml:"contract_code,omitempty"`
	// 合同履行记录标签
	//
	//
	ContractFulfillmentCode *string `json:"contract_fulfillment_code,omitempty" xml:"contract_fulfillment_code,omitempty"`
	// 应付方证件号码
	//
	//
	PayerCertNumber *string `json:"payer_cert_number,omitempty" xml:"payer_cert_number,omitempty"`
	// 应付方证件类型
	//
	// 0：统一社会信用代码
	//
	// 1：身份证号码
	PayerCertType *int64 `json:"payer_cert_type,omitempty" xml:"payer_cert_type,omitempty"`
	// 应付方类型
	//
	// 0：企业
	//
	// 1：个人
	PayerType *int64 `json:"payer_type,omitempty" xml:"payer_type,omitempty"`
}

func (s DeleteTwcNotaryJointconstraintRecordRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteTwcNotaryJointconstraintRecordRequest) GoString() string {
	return s.String()
}

func (s *DeleteTwcNotaryJointconstraintRecordRequest) SetAuthToken(v string) *DeleteTwcNotaryJointconstraintRecordRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteTwcNotaryJointconstraintRecordRequest) SetProductInstanceId(v string) *DeleteTwcNotaryJointconstraintRecordRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteTwcNotaryJointconstraintRecordRequest) SetRegionName(v string) *DeleteTwcNotaryJointconstraintRecordRequest {
	s.RegionName = &v
	return s
}

func (s *DeleteTwcNotaryJointconstraintRecordRequest) SetContractCode(v string) *DeleteTwcNotaryJointconstraintRecordRequest {
	s.ContractCode = &v
	return s
}

func (s *DeleteTwcNotaryJointconstraintRecordRequest) SetContractFulfillmentCode(v string) *DeleteTwcNotaryJointconstraintRecordRequest {
	s.ContractFulfillmentCode = &v
	return s
}

func (s *DeleteTwcNotaryJointconstraintRecordRequest) SetPayerCertNumber(v string) *DeleteTwcNotaryJointconstraintRecordRequest {
	s.PayerCertNumber = &v
	return s
}

func (s *DeleteTwcNotaryJointconstraintRecordRequest) SetPayerCertType(v int64) *DeleteTwcNotaryJointconstraintRecordRequest {
	s.PayerCertType = &v
	return s
}

func (s *DeleteTwcNotaryJointconstraintRecordRequest) SetPayerType(v int64) *DeleteTwcNotaryJointconstraintRecordRequest {
	s.PayerType = &v
	return s
}

type DeleteTwcNotaryJointconstraintRecordResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteTwcNotaryJointconstraintRecordResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteTwcNotaryJointconstraintRecordResponse) GoString() string {
	return s.String()
}

func (s *DeleteTwcNotaryJointconstraintRecordResponse) SetReqMsgId(v string) *DeleteTwcNotaryJointconstraintRecordResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteTwcNotaryJointconstraintRecordResponse) SetResultCode(v string) *DeleteTwcNotaryJointconstraintRecordResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteTwcNotaryJointconstraintRecordResponse) SetResultMsg(v string) *DeleteTwcNotaryJointconstraintRecordResponse {
	s.ResultMsg = &v
	return s
}

type QueryTwcNotaryJointconstraintBreachrecordRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 对象实体证件号码
	//
	//
	CertNumber *string `json:"cert_number,omitempty" xml:"cert_number,omitempty"`
	// 对象实体证件类型
	//
	// 0：统一社会信用代码
	//
	// 1：身份证号码
	CertType *int64 `json:"cert_type,omitempty" xml:"cert_type,omitempty"`
	// 查询对象实体类型
	//
	// 0：企业
	//
	// 1：个人
	EntityType *int64 `json:"entity_type,omitempty" xml:"entity_type,omitempty"`
}

func (s QueryTwcNotaryJointconstraintBreachrecordRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryJointconstraintBreachrecordRequest) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryJointconstraintBreachrecordRequest) SetAuthToken(v string) *QueryTwcNotaryJointconstraintBreachrecordRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwcNotaryJointconstraintBreachrecordRequest) SetProductInstanceId(v string) *QueryTwcNotaryJointconstraintBreachrecordRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwcNotaryJointconstraintBreachrecordRequest) SetRegionName(v string) *QueryTwcNotaryJointconstraintBreachrecordRequest {
	s.RegionName = &v
	return s
}

func (s *QueryTwcNotaryJointconstraintBreachrecordRequest) SetCertNumber(v string) *QueryTwcNotaryJointconstraintBreachrecordRequest {
	s.CertNumber = &v
	return s
}

func (s *QueryTwcNotaryJointconstraintBreachrecordRequest) SetCertType(v int64) *QueryTwcNotaryJointconstraintBreachrecordRequest {
	s.CertType = &v
	return s
}

func (s *QueryTwcNotaryJointconstraintBreachrecordRequest) SetEntityType(v int64) *QueryTwcNotaryJointconstraintBreachrecordRequest {
	s.EntityType = &v
	return s
}

type QueryTwcNotaryJointconstraintBreachrecordResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 违约次数
	//
	//
	BreachCount *int64 `json:"breach_count,omitempty" xml:"breach_count,omitempty"`
	// 是否存在履行记录
	//
	//
	HasRecord *bool `json:"has_record,omitempty" xml:"has_record,omitempty"`
}

func (s QueryTwcNotaryJointconstraintBreachrecordResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryJointconstraintBreachrecordResponse) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryJointconstraintBreachrecordResponse) SetReqMsgId(v string) *QueryTwcNotaryJointconstraintBreachrecordResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwcNotaryJointconstraintBreachrecordResponse) SetResultCode(v string) *QueryTwcNotaryJointconstraintBreachrecordResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwcNotaryJointconstraintBreachrecordResponse) SetResultMsg(v string) *QueryTwcNotaryJointconstraintBreachrecordResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwcNotaryJointconstraintBreachrecordResponse) SetBreachCount(v int64) *QueryTwcNotaryJointconstraintBreachrecordResponse {
	s.BreachCount = &v
	return s
}

func (s *QueryTwcNotaryJointconstraintBreachrecordResponse) SetHasRecord(v bool) *QueryTwcNotaryJointconstraintBreachrecordResponse {
	s.HasRecord = &v
	return s
}

type CreateTwcNotaryTransRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 存证关联实体（个人/企业）的身份识别信息
	Customer *Identity `json:"customer,omitempty" xml:"customer,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 业务子类型标识
	SubBizId *string `json:"sub_biz_id,omitempty" xml:"sub_biz_id,omitempty"`
	// 是否使用可信时间戳，默认为false
	Tsr *bool `json:"tsr,omitempty" xml:"tsr,omitempty"`
}

func (s CreateTwcNotaryTransRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryTransRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryTransRequest) SetAuthToken(v string) *CreateTwcNotaryTransRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryTransRequest) SetProductInstanceId(v string) *CreateTwcNotaryTransRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryTransRequest) SetRegionName(v string) *CreateTwcNotaryTransRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryTransRequest) SetCustomer(v *Identity) *CreateTwcNotaryTransRequest {
	s.Customer = v
	return s
}

func (s *CreateTwcNotaryTransRequest) SetProperties(v string) *CreateTwcNotaryTransRequest {
	s.Properties = &v
	return s
}

func (s *CreateTwcNotaryTransRequest) SetSubBizId(v string) *CreateTwcNotaryTransRequest {
	s.SubBizId = &v
	return s
}

func (s *CreateTwcNotaryTransRequest) SetTsr(v bool) *CreateTwcNotaryTransRequest {
	s.Tsr = &v
	return s
}

type CreateTwcNotaryTransResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回事务ID，全局唯一
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 可信时间信息
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
}

func (s CreateTwcNotaryTransResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryTransResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryTransResponse) SetReqMsgId(v string) *CreateTwcNotaryTransResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryTransResponse) SetResultCode(v string) *CreateTwcNotaryTransResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryTransResponse) SetResultMsg(v string) *CreateTwcNotaryTransResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryTransResponse) SetTransactionId(v string) *CreateTwcNotaryTransResponse {
	s.TransactionId = &v
	return s
}

func (s *CreateTwcNotaryTransResponse) SetTsr(v *TsrResponse) *CreateTwcNotaryTransResponse {
	s.Tsr = v
	return s
}

type GetTwcNotaryTransRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
}

func (s GetTwcNotaryTransRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTwcNotaryTransRequest) GoString() string {
	return s.String()
}

func (s *GetTwcNotaryTransRequest) SetAuthToken(v string) *GetTwcNotaryTransRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTwcNotaryTransRequest) SetProductInstanceId(v string) *GetTwcNotaryTransRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTwcNotaryTransRequest) SetRegionName(v string) *GetTwcNotaryTransRequest {
	s.RegionName = &v
	return s
}

func (s *GetTwcNotaryTransRequest) SetTransactionId(v string) *GetTwcNotaryTransRequest {
	s.TransactionId = &v
	return s
}

type GetTwcNotaryTransResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回文件下载路径列表
	FileUrl []*string `json:"file_url,omitempty" xml:"file_url,omitempty" type:"Repeated"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
}

func (s GetTwcNotaryTransResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTwcNotaryTransResponse) GoString() string {
	return s.String()
}

func (s *GetTwcNotaryTransResponse) SetReqMsgId(v string) *GetTwcNotaryTransResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTwcNotaryTransResponse) SetResultCode(v string) *GetTwcNotaryTransResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTwcNotaryTransResponse) SetResultMsg(v string) *GetTwcNotaryTransResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTwcNotaryTransResponse) SetFileUrl(v []*string) *GetTwcNotaryTransResponse {
	s.FileUrl = v
	return s
}

func (s *GetTwcNotaryTransResponse) SetTransactionId(v string) *GetTwcNotaryTransResponse {
	s.TransactionId = &v
	return s
}

type CreateTwcNotaryTextRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 哈希算法，目前仅支持 SHA256
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty"`
	// 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 存证内容
	NotaryContent *string `json:"notary_content,omitempty" xml:"notary_content,omitempty"`
	// 描述本条存证在存证事务中的阶段，用户可自行维护
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 文本存证类型，支持源文本/文本哈希
	TextNotaryType *string `json:"text_notary_type,omitempty" xml:"text_notary_type,omitempty"`
	// 存证事务id
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 是否使用可信时间戳，默认为false
	Tsr *bool `json:"tsr,omitempty" xml:"tsr,omitempty"`
}

func (s CreateTwcNotaryTextRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryTextRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryTextRequest) SetAuthToken(v string) *CreateTwcNotaryTextRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryTextRequest) SetProductInstanceId(v string) *CreateTwcNotaryTextRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryTextRequest) SetRegionName(v string) *CreateTwcNotaryTextRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryTextRequest) SetHashAlgorithm(v string) *CreateTwcNotaryTextRequest {
	s.HashAlgorithm = &v
	return s
}

func (s *CreateTwcNotaryTextRequest) SetLocation(v *Location) *CreateTwcNotaryTextRequest {
	s.Location = v
	return s
}

func (s *CreateTwcNotaryTextRequest) SetNotaryContent(v string) *CreateTwcNotaryTextRequest {
	s.NotaryContent = &v
	return s
}

func (s *CreateTwcNotaryTextRequest) SetPhase(v string) *CreateTwcNotaryTextRequest {
	s.Phase = &v
	return s
}

func (s *CreateTwcNotaryTextRequest) SetProperties(v string) *CreateTwcNotaryTextRequest {
	s.Properties = &v
	return s
}

func (s *CreateTwcNotaryTextRequest) SetTextNotaryType(v string) *CreateTwcNotaryTextRequest {
	s.TextNotaryType = &v
	return s
}

func (s *CreateTwcNotaryTextRequest) SetTransactionId(v string) *CreateTwcNotaryTextRequest {
	s.TransactionId = &v
	return s
}

func (s *CreateTwcNotaryTextRequest) SetTsr(v bool) *CreateTwcNotaryTextRequest {
	s.Tsr = &v
	return s
}

type CreateTwcNotaryTextResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 可信时间信息
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 存证凭据
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateTwcNotaryTextResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryTextResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryTextResponse) SetReqMsgId(v string) *CreateTwcNotaryTextResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryTextResponse) SetResultCode(v string) *CreateTwcNotaryTextResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryTextResponse) SetResultMsg(v string) *CreateTwcNotaryTextResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryTextResponse) SetTsr(v *TsrResponse) *CreateTwcNotaryTextResponse {
	s.Tsr = v
	return s
}

func (s *CreateTwcNotaryTextResponse) SetTxHash(v string) *CreateTwcNotaryTextResponse {
	s.TxHash = &v
	return s
}

type GetTwcNotaryTextRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 描述本条存证在存证事务中的阶段，用户可自行维护
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 存证事务id
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 存证凭据
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s GetTwcNotaryTextRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTwcNotaryTextRequest) GoString() string {
	return s.String()
}

func (s *GetTwcNotaryTextRequest) SetAuthToken(v string) *GetTwcNotaryTextRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTwcNotaryTextRequest) SetProductInstanceId(v string) *GetTwcNotaryTextRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTwcNotaryTextRequest) SetRegionName(v string) *GetTwcNotaryTextRequest {
	s.RegionName = &v
	return s
}

func (s *GetTwcNotaryTextRequest) SetLocation(v *Location) *GetTwcNotaryTextRequest {
	s.Location = v
	return s
}

func (s *GetTwcNotaryTextRequest) SetPhase(v string) *GetTwcNotaryTextRequest {
	s.Phase = &v
	return s
}

func (s *GetTwcNotaryTextRequest) SetProperties(v string) *GetTwcNotaryTextRequest {
	s.Properties = &v
	return s
}

func (s *GetTwcNotaryTextRequest) SetTransactionId(v string) *GetTwcNotaryTextRequest {
	s.TransactionId = &v
	return s
}

func (s *GetTwcNotaryTextRequest) SetTxHash(v string) *GetTwcNotaryTextRequest {
	s.TxHash = &v
	return s
}

type GetTwcNotaryTextResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证信息
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 哈希算法
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty"`
	// 文本存证类型
	TextNotaryType *string `json:"text_notary_type,omitempty" xml:"text_notary_type,omitempty"`
	// 可信信息
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
}

func (s GetTwcNotaryTextResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTwcNotaryTextResponse) GoString() string {
	return s.String()
}

func (s *GetTwcNotaryTextResponse) SetReqMsgId(v string) *GetTwcNotaryTextResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTwcNotaryTextResponse) SetResultCode(v string) *GetTwcNotaryTextResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTwcNotaryTextResponse) SetResultMsg(v string) *GetTwcNotaryTextResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTwcNotaryTextResponse) SetContent(v string) *GetTwcNotaryTextResponse {
	s.Content = &v
	return s
}

func (s *GetTwcNotaryTextResponse) SetHashAlgorithm(v string) *GetTwcNotaryTextResponse {
	s.HashAlgorithm = &v
	return s
}

func (s *GetTwcNotaryTextResponse) SetTextNotaryType(v string) *GetTwcNotaryTextResponse {
	s.TextNotaryType = &v
	return s
}

func (s *GetTwcNotaryTextResponse) SetTsr(v *TsrResponse) *GetTwcNotaryTextResponse {
	s.Tsr = v
	return s
}

type CreateTwcNotaryFileRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 文件存证模式，目前仅支持 FILE_RAW 和 FILE_HASH
	FileNotaryType *string `json:"file_notary_type,omitempty" xml:"file_notary_type,omitempty"`
	// 当文件存证模式为FILE_HASH时，用户可以指定该参数。当前服务仅支持 SHA256，若不填写，则默认值为 SHA256。
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty"`
	// 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 存证文件内容，对文件内容做base64编码后得到。例如FILE_RAW模式下，文件内容为“test”，那么base64编码后的结果则为“dGVzdA==”。如果是FILE_HASh模式，则该字段直接为文件hash。
	NotaryFile *string `json:"notary_file,omitempty" xml:"notary_file,omitempty"`
	// 存证文件名称
	NotaryName *string `json:"notary_name,omitempty" xml:"notary_name,omitempty"`
	// 描述本条存证在存证事务中的阶段，用户可自行维护
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 是否使用可信时间戳，默认为false
	Tsr *bool `json:"tsr,omitempty" xml:"tsr,omitempty"`
}

func (s CreateTwcNotaryFileRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryFileRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryFileRequest) SetAuthToken(v string) *CreateTwcNotaryFileRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryFileRequest) SetProductInstanceId(v string) *CreateTwcNotaryFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryFileRequest) SetRegionName(v string) *CreateTwcNotaryFileRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryFileRequest) SetFileNotaryType(v string) *CreateTwcNotaryFileRequest {
	s.FileNotaryType = &v
	return s
}

func (s *CreateTwcNotaryFileRequest) SetHashAlgorithm(v string) *CreateTwcNotaryFileRequest {
	s.HashAlgorithm = &v
	return s
}

func (s *CreateTwcNotaryFileRequest) SetLocation(v *Location) *CreateTwcNotaryFileRequest {
	s.Location = v
	return s
}

func (s *CreateTwcNotaryFileRequest) SetNotaryFile(v string) *CreateTwcNotaryFileRequest {
	s.NotaryFile = &v
	return s
}

func (s *CreateTwcNotaryFileRequest) SetNotaryName(v string) *CreateTwcNotaryFileRequest {
	s.NotaryName = &v
	return s
}

func (s *CreateTwcNotaryFileRequest) SetPhase(v string) *CreateTwcNotaryFileRequest {
	s.Phase = &v
	return s
}

func (s *CreateTwcNotaryFileRequest) SetProperties(v string) *CreateTwcNotaryFileRequest {
	s.Properties = &v
	return s
}

func (s *CreateTwcNotaryFileRequest) SetTransactionId(v string) *CreateTwcNotaryFileRequest {
	s.TransactionId = &v
	return s
}

func (s *CreateTwcNotaryFileRequest) SetTsr(v bool) *CreateTwcNotaryFileRequest {
	s.Tsr = &v
	return s
}

type CreateTwcNotaryFileResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 可信时间信息
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 存证凭证
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateTwcNotaryFileResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryFileResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryFileResponse) SetReqMsgId(v string) *CreateTwcNotaryFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryFileResponse) SetResultCode(v string) *CreateTwcNotaryFileResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryFileResponse) SetResultMsg(v string) *CreateTwcNotaryFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryFileResponse) SetTsr(v *TsrResponse) *CreateTwcNotaryFileResponse {
	s.Tsr = v
	return s
}

func (s *CreateTwcNotaryFileResponse) SetTxHash(v string) *CreateTwcNotaryFileResponse {
	s.TxHash = &v
	return s
}

type GetTwcNotaryFileRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 描述本条存证在存证事务中的阶段，用户可自行维护
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 存证凭据
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s GetTwcNotaryFileRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTwcNotaryFileRequest) GoString() string {
	return s.String()
}

func (s *GetTwcNotaryFileRequest) SetAuthToken(v string) *GetTwcNotaryFileRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTwcNotaryFileRequest) SetProductInstanceId(v string) *GetTwcNotaryFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTwcNotaryFileRequest) SetRegionName(v string) *GetTwcNotaryFileRequest {
	s.RegionName = &v
	return s
}

func (s *GetTwcNotaryFileRequest) SetLocation(v *Location) *GetTwcNotaryFileRequest {
	s.Location = v
	return s
}

func (s *GetTwcNotaryFileRequest) SetPhase(v string) *GetTwcNotaryFileRequest {
	s.Phase = &v
	return s
}

func (s *GetTwcNotaryFileRequest) SetProperties(v string) *GetTwcNotaryFileRequest {
	s.Properties = &v
	return s
}

func (s *GetTwcNotaryFileRequest) SetTransactionId(v string) *GetTwcNotaryFileRequest {
	s.TransactionId = &v
	return s
}

func (s *GetTwcNotaryFileRequest) SetTxHash(v string) *GetTwcNotaryFileRequest {
	s.TxHash = &v
	return s
}

type GetTwcNotaryFileResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s GetTwcNotaryFileResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTwcNotaryFileResponse) GoString() string {
	return s.String()
}

func (s *GetTwcNotaryFileResponse) SetReqMsgId(v string) *GetTwcNotaryFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTwcNotaryFileResponse) SetResultCode(v string) *GetTwcNotaryFileResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTwcNotaryFileResponse) SetResultMsg(v string) *GetTwcNotaryFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTwcNotaryFileResponse) SetFileHash(v string) *GetTwcNotaryFileResponse {
	s.FileHash = &v
	return s
}

func (s *GetTwcNotaryFileResponse) SetFileNotaryType(v string) *GetTwcNotaryFileResponse {
	s.FileNotaryType = &v
	return s
}

func (s *GetTwcNotaryFileResponse) SetHashAlgorithm(v string) *GetTwcNotaryFileResponse {
	s.HashAlgorithm = &v
	return s
}

func (s *GetTwcNotaryFileResponse) SetOssPath(v string) *GetTwcNotaryFileResponse {
	s.OssPath = &v
	return s
}

type CreateTwcNotarySourceRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 描述本条存证在存证事务中的阶段，用户可自行维护
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 原文文件描述
	SourceDesc *string `json:"source_desc,omitempty" xml:"source_desc,omitempty"`
	// 存证文件内容，对文件内容做base64编码后得到。例如文件内容为“test”，那么base64编码后的结果则为“dGVzdA==”
	SourceFile *string `json:"source_file,omitempty" xml:"source_file,omitempty"`
	// 存证原文名称
	SourceName *string `json:"source_name,omitempty" xml:"source_name,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 是否使用可信时间戳，默认为false
	Tsr *bool `json:"tsr,omitempty" xml:"tsr,omitempty"`
}

func (s CreateTwcNotarySourceRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotarySourceRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotarySourceRequest) SetAuthToken(v string) *CreateTwcNotarySourceRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotarySourceRequest) SetProductInstanceId(v string) *CreateTwcNotarySourceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotarySourceRequest) SetRegionName(v string) *CreateTwcNotarySourceRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotarySourceRequest) SetLocation(v *Location) *CreateTwcNotarySourceRequest {
	s.Location = v
	return s
}

func (s *CreateTwcNotarySourceRequest) SetPhase(v string) *CreateTwcNotarySourceRequest {
	s.Phase = &v
	return s
}

func (s *CreateTwcNotarySourceRequest) SetProperties(v string) *CreateTwcNotarySourceRequest {
	s.Properties = &v
	return s
}

func (s *CreateTwcNotarySourceRequest) SetSourceDesc(v string) *CreateTwcNotarySourceRequest {
	s.SourceDesc = &v
	return s
}

func (s *CreateTwcNotarySourceRequest) SetSourceFile(v string) *CreateTwcNotarySourceRequest {
	s.SourceFile = &v
	return s
}

func (s *CreateTwcNotarySourceRequest) SetSourceName(v string) *CreateTwcNotarySourceRequest {
	s.SourceName = &v
	return s
}

func (s *CreateTwcNotarySourceRequest) SetTransactionId(v string) *CreateTwcNotarySourceRequest {
	s.TransactionId = &v
	return s
}

func (s *CreateTwcNotarySourceRequest) SetTsr(v bool) *CreateTwcNotarySourceRequest {
	s.Tsr = &v
	return s
}

type CreateTwcNotarySourceResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 可信时间信息
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 存证凭据
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateTwcNotarySourceResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotarySourceResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotarySourceResponse) SetReqMsgId(v string) *CreateTwcNotarySourceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotarySourceResponse) SetResultCode(v string) *CreateTwcNotarySourceResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotarySourceResponse) SetResultMsg(v string) *CreateTwcNotarySourceResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotarySourceResponse) SetTsr(v *TsrResponse) *CreateTwcNotarySourceResponse {
	s.Tsr = v
	return s
}

func (s *CreateTwcNotarySourceResponse) SetTxHash(v string) *CreateTwcNotarySourceResponse {
	s.TxHash = &v
	return s
}

type GetTwcNotarySourceRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 描述本条存证在存证事务中的阶段，用户可自行维护
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 存证事务id
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 存证凭据
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s GetTwcNotarySourceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTwcNotarySourceRequest) GoString() string {
	return s.String()
}

func (s *GetTwcNotarySourceRequest) SetAuthToken(v string) *GetTwcNotarySourceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTwcNotarySourceRequest) SetProductInstanceId(v string) *GetTwcNotarySourceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTwcNotarySourceRequest) SetRegionName(v string) *GetTwcNotarySourceRequest {
	s.RegionName = &v
	return s
}

func (s *GetTwcNotarySourceRequest) SetLocation(v *Location) *GetTwcNotarySourceRequest {
	s.Location = v
	return s
}

func (s *GetTwcNotarySourceRequest) SetPhase(v string) *GetTwcNotarySourceRequest {
	s.Phase = &v
	return s
}

func (s *GetTwcNotarySourceRequest) SetProperties(v string) *GetTwcNotarySourceRequest {
	s.Properties = &v
	return s
}

func (s *GetTwcNotarySourceRequest) SetTransactionId(v string) *GetTwcNotarySourceRequest {
	s.TransactionId = &v
	return s
}

func (s *GetTwcNotarySourceRequest) SetTxHash(v string) *GetTwcNotarySourceRequest {
	s.TxHash = &v
	return s
}

type GetTwcNotarySourceResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件下载地址
	OssPath *string `json:"oss_path,omitempty" xml:"oss_path,omitempty"`
}

func (s GetTwcNotarySourceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTwcNotarySourceResponse) GoString() string {
	return s.String()
}

func (s *GetTwcNotarySourceResponse) SetReqMsgId(v string) *GetTwcNotarySourceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTwcNotarySourceResponse) SetResultCode(v string) *GetTwcNotarySourceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTwcNotarySourceResponse) SetResultMsg(v string) *GetTwcNotarySourceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTwcNotarySourceResponse) SetOssPath(v string) *GetTwcNotarySourceResponse {
	s.OssPath = &v
	return s
}

type CheckTwcNotaryStatusRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 存证核验数据组
	NotaryCheckMetaList []*NotaryCheckMeta `json:"notary_check_meta_list,omitempty" xml:"notary_check_meta_list,omitempty" type:"Repeated"`
}

func (s CheckTwcNotaryStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckTwcNotaryStatusRequest) GoString() string {
	return s.String()
}

func (s *CheckTwcNotaryStatusRequest) SetAuthToken(v string) *CheckTwcNotaryStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckTwcNotaryStatusRequest) SetProductInstanceId(v string) *CheckTwcNotaryStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckTwcNotaryStatusRequest) SetRegionName(v string) *CheckTwcNotaryStatusRequest {
	s.RegionName = &v
	return s
}

func (s *CheckTwcNotaryStatusRequest) SetNotaryCheckMetaList(v []*NotaryCheckMeta) *CheckTwcNotaryStatusRequest {
	s.NotaryCheckMetaList = v
	return s
}

type CheckTwcNotaryStatusResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证核验结果
	NotaryCheckResults []*NotaryCheckResult `json:"notary_check_results,omitempty" xml:"notary_check_results,omitempty" type:"Repeated"`
}

func (s CheckTwcNotaryStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckTwcNotaryStatusResponse) GoString() string {
	return s.String()
}

func (s *CheckTwcNotaryStatusResponse) SetReqMsgId(v string) *CheckTwcNotaryStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckTwcNotaryStatusResponse) SetResultCode(v string) *CheckTwcNotaryStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckTwcNotaryStatusResponse) SetResultMsg(v string) *CheckTwcNotaryStatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckTwcNotaryStatusResponse) SetNotaryCheckResults(v []*NotaryCheckResult) *CheckTwcNotaryStatusResponse {
	s.NotaryCheckResults = v
	return s
}

type DeployTwcNotaryLeaseContractRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 租赁服务平台对应的合约ID
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty"`
}

func (s DeployTwcNotaryLeaseContractRequest) String() string {
	return tea.Prettify(s)
}

func (s DeployTwcNotaryLeaseContractRequest) GoString() string {
	return s.String()
}

func (s *DeployTwcNotaryLeaseContractRequest) SetAuthToken(v string) *DeployTwcNotaryLeaseContractRequest {
	s.AuthToken = &v
	return s
}

func (s *DeployTwcNotaryLeaseContractRequest) SetProductInstanceId(v string) *DeployTwcNotaryLeaseContractRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeployTwcNotaryLeaseContractRequest) SetRegionName(v string) *DeployTwcNotaryLeaseContractRequest {
	s.RegionName = &v
	return s
}

func (s *DeployTwcNotaryLeaseContractRequest) SetContractId(v string) *DeployTwcNotaryLeaseContractRequest {
	s.ContractId = &v
	return s
}

type DeployTwcNotaryLeaseContractResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s DeployTwcNotaryLeaseContractResponse) String() string {
	return tea.Prettify(s)
}

func (s DeployTwcNotaryLeaseContractResponse) GoString() string {
	return s.String()
}

func (s *DeployTwcNotaryLeaseContractResponse) SetReqMsgId(v string) *DeployTwcNotaryLeaseContractResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeployTwcNotaryLeaseContractResponse) SetResultCode(v string) *DeployTwcNotaryLeaseContractResponse {
	s.ResultCode = &v
	return s
}

func (s *DeployTwcNotaryLeaseContractResponse) SetResultMsg(v string) *DeployTwcNotaryLeaseContractResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeployTwcNotaryLeaseContractResponse) SetCode(v int64) *DeployTwcNotaryLeaseContractResponse {
	s.Code = &v
	return s
}

func (s *DeployTwcNotaryLeaseContractResponse) SetErrMessage(v string) *DeployTwcNotaryLeaseContractResponse {
	s.ErrMessage = &v
	return s
}

func (s *DeployTwcNotaryLeaseContractResponse) SetResponseData(v string) *DeployTwcNotaryLeaseContractResponse {
	s.ResponseData = &v
	return s
}

type CreateTwcNotaryLeaseProductinfoRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 合约id
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 保证金  精确到毫厘，即123400表示12.34元
	DepositPrice *int64 `json:"deposit_price,omitempty" xml:"deposit_price,omitempty"`
	// 商品目录额外信息
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 安装拆卸费 精确到毫厘，即123400表示12.34元
	InstallPrice *int64 `json:"install_price,omitempty" xml:"install_price,omitempty"`
	// 租赁服务平台id
	LeaseId *string `json:"lease_id,omitempty" xml:"lease_id,omitempty"`
	// 一级分类
	MainClass *string `json:"main_class,omitempty" xml:"main_class,omitempty"`
	// 商品编码 长度不可超过50
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
	// 商品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty"`
	// 采购价  精确到毫厘，即123400表示12.34元
	ProductPrice *int64 `json:"product_price,omitempty" xml:"product_price,omitempty"`
	// 出租详细信息
	Rentinfos []*RentInfo `json:"rentinfos,omitempty" xml:"rentinfos,omitempty" type:"Repeated"`
	// 二级分类
	SubClass *string `json:"sub_class,omitempty" xml:"sub_class,omitempty"`
	// 供应商id
	SupplierId *string `json:"supplier_id,omitempty" xml:"supplier_id,omitempty"`
	// 供应商
	SupplierName *string `json:"supplier_name,omitempty" xml:"supplier_name,omitempty"`
	// 供应商对该产品版本
	SupplierVersion *string `json:"supplier_version,omitempty" xml:"supplier_version,omitempty"`
}

func (s CreateTwcNotaryLeaseProductinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseProductinfoRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseProductinfoRequest) SetAuthToken(v string) *CreateTwcNotaryLeaseProductinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryLeaseProductinfoRequest) SetProductInstanceId(v string) *CreateTwcNotaryLeaseProductinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryLeaseProductinfoRequest) SetRegionName(v string) *CreateTwcNotaryLeaseProductinfoRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryLeaseProductinfoRequest) SetApplicationId(v string) *CreateTwcNotaryLeaseProductinfoRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateTwcNotaryLeaseProductinfoRequest) SetDepositPrice(v int64) *CreateTwcNotaryLeaseProductinfoRequest {
	s.DepositPrice = &v
	return s
}

func (s *CreateTwcNotaryLeaseProductinfoRequest) SetExtraInfo(v string) *CreateTwcNotaryLeaseProductinfoRequest {
	s.ExtraInfo = &v
	return s
}

func (s *CreateTwcNotaryLeaseProductinfoRequest) SetInstallPrice(v int64) *CreateTwcNotaryLeaseProductinfoRequest {
	s.InstallPrice = &v
	return s
}

func (s *CreateTwcNotaryLeaseProductinfoRequest) SetLeaseId(v string) *CreateTwcNotaryLeaseProductinfoRequest {
	s.LeaseId = &v
	return s
}

func (s *CreateTwcNotaryLeaseProductinfoRequest) SetMainClass(v string) *CreateTwcNotaryLeaseProductinfoRequest {
	s.MainClass = &v
	return s
}

func (s *CreateTwcNotaryLeaseProductinfoRequest) SetProductId(v string) *CreateTwcNotaryLeaseProductinfoRequest {
	s.ProductId = &v
	return s
}

func (s *CreateTwcNotaryLeaseProductinfoRequest) SetProductName(v string) *CreateTwcNotaryLeaseProductinfoRequest {
	s.ProductName = &v
	return s
}

func (s *CreateTwcNotaryLeaseProductinfoRequest) SetProductPrice(v int64) *CreateTwcNotaryLeaseProductinfoRequest {
	s.ProductPrice = &v
	return s
}

func (s *CreateTwcNotaryLeaseProductinfoRequest) SetRentinfos(v []*RentInfo) *CreateTwcNotaryLeaseProductinfoRequest {
	s.Rentinfos = v
	return s
}

func (s *CreateTwcNotaryLeaseProductinfoRequest) SetSubClass(v string) *CreateTwcNotaryLeaseProductinfoRequest {
	s.SubClass = &v
	return s
}

func (s *CreateTwcNotaryLeaseProductinfoRequest) SetSupplierId(v string) *CreateTwcNotaryLeaseProductinfoRequest {
	s.SupplierId = &v
	return s
}

func (s *CreateTwcNotaryLeaseProductinfoRequest) SetSupplierName(v string) *CreateTwcNotaryLeaseProductinfoRequest {
	s.SupplierName = &v
	return s
}

func (s *CreateTwcNotaryLeaseProductinfoRequest) SetSupplierVersion(v string) *CreateTwcNotaryLeaseProductinfoRequest {
	s.SupplierVersion = &v
	return s
}

type CreateTwcNotaryLeaseProductinfoResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 用户信息存储到合约中对应的区块链交易哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s CreateTwcNotaryLeaseProductinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseProductinfoResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseProductinfoResponse) SetReqMsgId(v string) *CreateTwcNotaryLeaseProductinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryLeaseProductinfoResponse) SetResultCode(v string) *CreateTwcNotaryLeaseProductinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryLeaseProductinfoResponse) SetResultMsg(v string) *CreateTwcNotaryLeaseProductinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryLeaseProductinfoResponse) SetCode(v int64) *CreateTwcNotaryLeaseProductinfoResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryLeaseProductinfoResponse) SetErrMessage(v string) *CreateTwcNotaryLeaseProductinfoResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateTwcNotaryLeaseProductinfoResponse) SetResponseData(v string) *CreateTwcNotaryLeaseProductinfoResponse {
	s.ResponseData = &v
	return s
}

type AuthTwcNotaryLeaseContractRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 融资服务平台ID 长度不可超过50
	CreditId *string `json:"credit_id,omitempty" xml:"credit_id,omitempty"`
}

func (s AuthTwcNotaryLeaseContractRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthTwcNotaryLeaseContractRequest) GoString() string {
	return s.String()
}

func (s *AuthTwcNotaryLeaseContractRequest) SetAuthToken(v string) *AuthTwcNotaryLeaseContractRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthTwcNotaryLeaseContractRequest) SetProductInstanceId(v string) *AuthTwcNotaryLeaseContractRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthTwcNotaryLeaseContractRequest) SetRegionName(v string) *AuthTwcNotaryLeaseContractRequest {
	s.RegionName = &v
	return s
}

func (s *AuthTwcNotaryLeaseContractRequest) SetCreditId(v string) *AuthTwcNotaryLeaseContractRequest {
	s.CreditId = &v
	return s
}

type AuthTwcNotaryLeaseContractResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s AuthTwcNotaryLeaseContractResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthTwcNotaryLeaseContractResponse) GoString() string {
	return s.String()
}

func (s *AuthTwcNotaryLeaseContractResponse) SetReqMsgId(v string) *AuthTwcNotaryLeaseContractResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthTwcNotaryLeaseContractResponse) SetResultCode(v string) *AuthTwcNotaryLeaseContractResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthTwcNotaryLeaseContractResponse) SetResultMsg(v string) *AuthTwcNotaryLeaseContractResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthTwcNotaryLeaseContractResponse) SetCode(v int64) *AuthTwcNotaryLeaseContractResponse {
	s.Code = &v
	return s
}

func (s *AuthTwcNotaryLeaseContractResponse) SetErrMessage(v string) *AuthTwcNotaryLeaseContractResponse {
	s.ErrMessage = &v
	return s
}

func (s *AuthTwcNotaryLeaseContractResponse) SetResponseData(v string) *AuthTwcNotaryLeaseContractResponse {
	s.ResponseData = &v
	return s
}

type CreateTwcNotaryLeaseUserinfoRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 支付宝账号信息
	AlipayUid *string `json:"alipay_uid,omitempty" xml:"alipay_uid,omitempty"`
	// 融资租赁业务id，由资方控制台生成返回
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 是否启动异步
	Async *int64 `json:"async,omitempty" xml:"async,omitempty"`
	// 融资租赁用户信息额外字段
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 承租企业统一社会信用代码 长度不可超过50
	LeaseCorpId *string `json:"lease_corp_id,omitempty" xml:"lease_corp_id,omitempty"`
	// 承租企业名称 长度不可超过50
	LeaseCorpName *string `json:"lease_corp_name,omitempty" xml:"lease_corp_name,omitempty"`
	// 承租法定代表人姓名 长度不可超过50
	LeaseCorpOwnerName *string `json:"lease_corp_owner_name,omitempty" xml:"lease_corp_owner_name,omitempty"`
	// 用户登录名，租赁平台会员ID/支付宝ID 长度不可超过50
	LoginId *string `json:"login_id,omitempty" xml:"login_id,omitempty"`
	// 用户登录时间 格式为2019-8-31 12:00:00
	LoginTime *string `json:"login_time,omitempty" xml:"login_time,omitempty"`
	// 用户登录名类型 1.商户会员2.支付宝3.其他
	LoginType *int64 `json:"login_type,omitempty" xml:"login_type,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 额外通知第三方，如果需要通知相关方外的第三方，需要在此设置关联方的租户id，若不设置则只通知资方
	RelatedNotify []*string `json:"related_notify,omitempty" xml:"related_notify,omitempty" type:"Repeated"`
	// 区块链认证Hash，若为支付宝实人，必填
	UserBlockchainVerifyHash *string `json:"user_blockchain_verify_hash,omitempty" xml:"user_blockchain_verify_hash,omitempty"`
	// 承租人电子邮件，法院/仲裁电子送达必填项，长度不超过5
	UserEmail *string `json:"user_email,omitempty" xml:"user_email,omitempty"`
	// 承租人身份证
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 承租人身份证照片哈希
	UserImageHash *string `json:"user_image_hash,omitempty" xml:"user_image_hash,omitempty"`
	// 承租人身份证照片存证交易哈希
	UserImageTxHash *string `json:"user_image_tx_hash,omitempty" xml:"user_image_tx_hash,omitempty"`
	// 承租人姓名 长度不可超过10
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
	// 承租人手机号
	UserPhoneNumber *string `json:"user_phone_number,omitempty" xml:"user_phone_number,omitempty"`
	// 身份认证类型 1支付宝实人，2芝麻实人，3非蚂蚁实人
	UserType *int64 `json:"user_type,omitempty" xml:"user_type,omitempty"`
}

func (s CreateTwcNotaryLeaseUserinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseUserinfoRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseUserinfoRequest) SetAuthToken(v string) *CreateTwcNotaryLeaseUserinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoRequest) SetProductInstanceId(v string) *CreateTwcNotaryLeaseUserinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoRequest) SetRegionName(v string) *CreateTwcNotaryLeaseUserinfoRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoRequest) SetAlipayUid(v string) *CreateTwcNotaryLeaseUserinfoRequest {
	s.AlipayUid = &v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoRequest) SetApplicationId(v string) *CreateTwcNotaryLeaseUserinfoRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoRequest) SetAsync(v int64) *CreateTwcNotaryLeaseUserinfoRequest {
	s.Async = &v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoRequest) SetExtraInfo(v string) *CreateTwcNotaryLeaseUserinfoRequest {
	s.ExtraInfo = &v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoRequest) SetLeaseCorpId(v string) *CreateTwcNotaryLeaseUserinfoRequest {
	s.LeaseCorpId = &v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoRequest) SetLeaseCorpName(v string) *CreateTwcNotaryLeaseUserinfoRequest {
	s.LeaseCorpName = &v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoRequest) SetLeaseCorpOwnerName(v string) *CreateTwcNotaryLeaseUserinfoRequest {
	s.LeaseCorpOwnerName = &v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoRequest) SetLoginId(v string) *CreateTwcNotaryLeaseUserinfoRequest {
	s.LoginId = &v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoRequest) SetLoginTime(v string) *CreateTwcNotaryLeaseUserinfoRequest {
	s.LoginTime = &v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoRequest) SetLoginType(v int64) *CreateTwcNotaryLeaseUserinfoRequest {
	s.LoginType = &v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoRequest) SetOrderId(v string) *CreateTwcNotaryLeaseUserinfoRequest {
	s.OrderId = &v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoRequest) SetRelatedNotify(v []*string) *CreateTwcNotaryLeaseUserinfoRequest {
	s.RelatedNotify = v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoRequest) SetUserBlockchainVerifyHash(v string) *CreateTwcNotaryLeaseUserinfoRequest {
	s.UserBlockchainVerifyHash = &v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoRequest) SetUserEmail(v string) *CreateTwcNotaryLeaseUserinfoRequest {
	s.UserEmail = &v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoRequest) SetUserId(v string) *CreateTwcNotaryLeaseUserinfoRequest {
	s.UserId = &v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoRequest) SetUserImageHash(v string) *CreateTwcNotaryLeaseUserinfoRequest {
	s.UserImageHash = &v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoRequest) SetUserImageTxHash(v string) *CreateTwcNotaryLeaseUserinfoRequest {
	s.UserImageTxHash = &v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoRequest) SetUserName(v string) *CreateTwcNotaryLeaseUserinfoRequest {
	s.UserName = &v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoRequest) SetUserPhoneNumber(v string) *CreateTwcNotaryLeaseUserinfoRequest {
	s.UserPhoneNumber = &v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoRequest) SetUserType(v int64) *CreateTwcNotaryLeaseUserinfoRequest {
	s.UserType = &v
	return s
}

type CreateTwcNotaryLeaseUserinfoResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 用户信息存储到合约中对应的区块链交易哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s CreateTwcNotaryLeaseUserinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseUserinfoResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseUserinfoResponse) SetReqMsgId(v string) *CreateTwcNotaryLeaseUserinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoResponse) SetResultCode(v string) *CreateTwcNotaryLeaseUserinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoResponse) SetResultMsg(v string) *CreateTwcNotaryLeaseUserinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoResponse) SetCode(v int64) *CreateTwcNotaryLeaseUserinfoResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoResponse) SetErrMessage(v string) *CreateTwcNotaryLeaseUserinfoResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateTwcNotaryLeaseUserinfoResponse) SetResponseData(v string) *CreateTwcNotaryLeaseUserinfoResponse {
	s.ResponseData = &v
	return s
}

type CreateTwcNotaryLeaseOrderinfoRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 实际预授权金额，芝麻信用免押金额 精确到毫厘，即123400表示12.34元
	AcutalPreAuthFree *int64 `json:"acutal_pre_auth_free,omitempty" xml:"acutal_pre_auth_free,omitempty"`
	// 融资租赁业务id，由资方控制台创建返回
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 是否启动异步处理订单
	Async *int64 `json:"async,omitempty" xml:"async,omitempty"`
	// 采购发票地址
	BillUrl *string `json:"bill_url,omitempty" xml:"bill_url,omitempty"`
	// 到期买断价 精确到毫厘，即123400表示12.34元
	BuyOutPrice *int64 `json:"buy_out_price,omitempty" xml:"buy_out_price,omitempty"`
	// 免押金额 精确到毫厘，即123400表示12.34元
	DepositFree *int64 `json:"deposit_free,omitempty" xml:"deposit_free,omitempty"`
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
	LeaseServiceFileHash *string `json:"lease_service_file_hash,omitempty" xml:"lease_service_file_hash,omitempty"`
	// 融资租赁及服务协议文件链上存证交易哈希
	LeaseServiceFileTxHash *string `json:"lease_service_file_tx_hash,omitempty" xml:"lease_service_file_tx_hash,omitempty"`
	// 订单创建时间 格式为2019-8-31 12:00:00
	OrderCreateTime *string `json:"order_create_time,omitempty" xml:"order_create_time,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 支付订单ID
	OrderPayId *string `json:"order_pay_id,omitempty" xml:"order_pay_id,omitempty"`
	// 订单支付时间 格式为2019-8-31 12:00:00
	OrderPayTime *string `json:"order_pay_time,omitempty" xml:"order_pay_time,omitempty"`
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
	ProductInfo []*ProductInfo `json:"product_info,omitempty" xml:"product_info,omitempty" type:"Repeated"`
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
	RentPricePerMonth *int64 `json:"rent_price_per_month,omitempty" xml:"rent_price_per_month,omitempty"`
	// 租期
	RentTerm *int64 `json:"rent_term,omitempty" xml:"rent_term,omitempty"`
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
	UserAddress *string `json:"user_address,omitempty" xml:"user_address,omitempty"`
}

func (s CreateTwcNotaryLeaseOrderinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseOrderinfoRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetAuthToken(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetProductInstanceId(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetRegionName(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetAcutalPreAuthFree(v int64) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.AcutalPreAuthFree = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetApplicationId(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetAsync(v int64) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.Async = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetBillUrl(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.BillUrl = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetBuyOutPrice(v int64) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.BuyOutPrice = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetDepositFree(v int64) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.DepositFree = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetExtraInfo(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.ExtraInfo = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetInstallHash(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.InstallHash = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetInstallPrice(v int64) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.InstallPrice = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetInstallTxHash(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.InstallTxHash = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetInsuranceNumber(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.InsuranceNumber = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetInsuranceUrl(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.InsuranceUrl = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetInStoreTime(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.InStoreTime = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetLeaseOrderExtra(v []*LeaseOrderExtra) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.LeaseOrderExtra = v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetLeaseServiceAdditionalFileHash(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.LeaseServiceAdditionalFileHash = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetLeaseServiceAdditionalFileTxHash(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.LeaseServiceAdditionalFileTxHash = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetLeaseServiceFileHash(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.LeaseServiceFileHash = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetLeaseServiceFileTxHash(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.LeaseServiceFileTxHash = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetOrderCreateTime(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.OrderCreateTime = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetOrderId(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.OrderId = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetOrderPayId(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.OrderPayId = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetOrderPayTime(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.OrderPayTime = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetOrderPayType(v int64) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.OrderPayType = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetOutStoreDeliverNumber(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.OutStoreDeliverNumber = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetOutStoreTime(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.OutStoreTime = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetPayProofUrl(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.PayProofUrl = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetPreAuthPayOrderId(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.PreAuthPayOrderId = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetProductInfo(v []*ProductInfo) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.ProductInfo = v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetPurchaseContractBillHash(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.PurchaseContractBillHash = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetPurchaseContractBillTxHash(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.PurchaseContractBillTxHash = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetPurchaseContractHash(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.PurchaseContractHash = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetPurchaseContractTxHash(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.PurchaseContractTxHash = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetPurchaseContractUrl(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.PurchaseContractUrl = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetRelatedNotify(v []*string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.RelatedNotify = v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetRentContractUrl(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.RentContractUrl = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetRentPricePerMonth(v int64) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.RentPricePerMonth = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetRentTerm(v int64) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.RentTerm = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetSignHash(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.SignHash = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetSignTime(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.SignTime = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetSignTxHash(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.SignTxHash = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetStoreType(v int64) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.StoreType = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetSupplementProtocolUrl(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.SupplementProtocolUrl = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetSupplierIsvAccount(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.SupplierIsvAccount = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoRequest) SetUserAddress(v string) *CreateTwcNotaryLeaseOrderinfoRequest {
	s.UserAddress = &v
	return s
}

type CreateTwcNotaryLeaseOrderinfoResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s CreateTwcNotaryLeaseOrderinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseOrderinfoResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseOrderinfoResponse) SetReqMsgId(v string) *CreateTwcNotaryLeaseOrderinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoResponse) SetResultCode(v string) *CreateTwcNotaryLeaseOrderinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoResponse) SetResultMsg(v string) *CreateTwcNotaryLeaseOrderinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoResponse) SetCode(v int64) *CreateTwcNotaryLeaseOrderinfoResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoResponse) SetErrMessage(v string) *CreateTwcNotaryLeaseOrderinfoResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateTwcNotaryLeaseOrderinfoResponse) SetResponseData(v string) *CreateTwcNotaryLeaseOrderinfoResponse {
	s.ResponseData = &v
	return s
}

type CreateTwcNotaryLeasePromiseRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 融资租赁业务id，由资方控制台生成返回
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 是否启动异步订单处理
	Async *int64 `json:"async,omitempty" xml:"async,omitempty"`
	// 审核方式,0为系统自动审核，1为人工审核
	AuditMode *int64 `json:"audit_mode,omitempty" xml:"audit_mode,omitempty"`
	// 清分机构金融科技租户ID
	ClearingOrg *string `json:"clearing_org,omitempty" xml:"clearing_org,omitempty"`
	// 放款机构金融科技租户ID
	CreditOrg *string `json:"credit_org,omitempty" xml:"credit_org,omitempty"`
	// 第一次还款时的日期
	FirstPayDate *string `json:"first_pay_date,omitempty" xml:"first_pay_date,omitempty"`
	// 融资机构的阿里uid
	LeaseAlipayUid *string `json:"lease_alipay_uid,omitempty" xml:"lease_alipay_uid,omitempty"`
	// 宽限期，精确到毫秒
	Limit *int64 `json:"limit,omitempty" xml:"limit,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 应付租金，精确到毫厘，即123400表示12.34元
	PayDateList []*string `json:"pay_date_list,omitempty" xml:"pay_date_list,omitempty" type:"Repeated"`
	// 租赁方承诺额外字段
	PayExtraInfoList []*string `json:"pay_extra_info_list,omitempty" xml:"pay_extra_info_list,omitempty" type:"Repeated"`
	// 应付租金 精确到毫厘，即123400表示12.34元
	//
	PayMoney *int64 `json:"pay_money,omitempty" xml:"pay_money,omitempty"`
	// 应付租金 精确到毫厘，即123400表示12.34元
	PayMoneyList []*int64 `json:"pay_money_list,omitempty" xml:"pay_money_list,omitempty" type:"Repeated"`
	// 应付租金的期数
	PayPeriod *int64 `json:"pay_period,omitempty" xml:"pay_period,omitempty"`
}

func (s CreateTwcNotaryLeasePromiseRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeasePromiseRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeasePromiseRequest) SetAuthToken(v string) *CreateTwcNotaryLeasePromiseRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryLeasePromiseRequest) SetProductInstanceId(v string) *CreateTwcNotaryLeasePromiseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryLeasePromiseRequest) SetRegionName(v string) *CreateTwcNotaryLeasePromiseRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryLeasePromiseRequest) SetApplicationId(v string) *CreateTwcNotaryLeasePromiseRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateTwcNotaryLeasePromiseRequest) SetAsync(v int64) *CreateTwcNotaryLeasePromiseRequest {
	s.Async = &v
	return s
}

func (s *CreateTwcNotaryLeasePromiseRequest) SetAuditMode(v int64) *CreateTwcNotaryLeasePromiseRequest {
	s.AuditMode = &v
	return s
}

func (s *CreateTwcNotaryLeasePromiseRequest) SetClearingOrg(v string) *CreateTwcNotaryLeasePromiseRequest {
	s.ClearingOrg = &v
	return s
}

func (s *CreateTwcNotaryLeasePromiseRequest) SetCreditOrg(v string) *CreateTwcNotaryLeasePromiseRequest {
	s.CreditOrg = &v
	return s
}

func (s *CreateTwcNotaryLeasePromiseRequest) SetFirstPayDate(v string) *CreateTwcNotaryLeasePromiseRequest {
	s.FirstPayDate = &v
	return s
}

func (s *CreateTwcNotaryLeasePromiseRequest) SetLeaseAlipayUid(v string) *CreateTwcNotaryLeasePromiseRequest {
	s.LeaseAlipayUid = &v
	return s
}

func (s *CreateTwcNotaryLeasePromiseRequest) SetLimit(v int64) *CreateTwcNotaryLeasePromiseRequest {
	s.Limit = &v
	return s
}

func (s *CreateTwcNotaryLeasePromiseRequest) SetOrderId(v string) *CreateTwcNotaryLeasePromiseRequest {
	s.OrderId = &v
	return s
}

func (s *CreateTwcNotaryLeasePromiseRequest) SetPayDateList(v []*string) *CreateTwcNotaryLeasePromiseRequest {
	s.PayDateList = v
	return s
}

func (s *CreateTwcNotaryLeasePromiseRequest) SetPayExtraInfoList(v []*string) *CreateTwcNotaryLeasePromiseRequest {
	s.PayExtraInfoList = v
	return s
}

func (s *CreateTwcNotaryLeasePromiseRequest) SetPayMoney(v int64) *CreateTwcNotaryLeasePromiseRequest {
	s.PayMoney = &v
	return s
}

func (s *CreateTwcNotaryLeasePromiseRequest) SetPayMoneyList(v []*int64) *CreateTwcNotaryLeasePromiseRequest {
	s.PayMoneyList = v
	return s
}

func (s *CreateTwcNotaryLeasePromiseRequest) SetPayPeriod(v int64) *CreateTwcNotaryLeasePromiseRequest {
	s.PayPeriod = &v
	return s
}

type CreateTwcNotaryLeasePromiseResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 租方承诺信息存储到合约中对应的区块链交易哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s CreateTwcNotaryLeasePromiseResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeasePromiseResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeasePromiseResponse) SetReqMsgId(v string) *CreateTwcNotaryLeasePromiseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryLeasePromiseResponse) SetResultCode(v string) *CreateTwcNotaryLeasePromiseResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryLeasePromiseResponse) SetResultMsg(v string) *CreateTwcNotaryLeasePromiseResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryLeasePromiseResponse) SetCode(v int64) *CreateTwcNotaryLeasePromiseResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryLeasePromiseResponse) SetErrMessage(v string) *CreateTwcNotaryLeasePromiseResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateTwcNotaryLeasePromiseResponse) SetResponseData(v string) *CreateTwcNotaryLeasePromiseResponse {
	s.ResponseData = &v
	return s
}

type CreateTwcNotaryLeaseVerifyinfoRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
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
	LeaseId *string `json:"lease_id,omitempty" xml:"lease_id,omitempty"`
	// 放款流水单号
	Loan *string `json:"loan,omitempty" xml:"loan,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
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
	VerifyResult *int64 `json:"verify_result,omitempty" xml:"verify_result,omitempty"`
	// 付款汇款凭证 民盛转账成功后上传
	Voucher *string `json:"voucher,omitempty" xml:"voucher,omitempty"`
}

func (s CreateTwcNotaryLeaseVerifyinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseVerifyinfoRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseVerifyinfoRequest) SetAuthToken(v string) *CreateTwcNotaryLeaseVerifyinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoRequest) SetProductInstanceId(v string) *CreateTwcNotaryLeaseVerifyinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoRequest) SetRegionName(v string) *CreateTwcNotaryLeaseVerifyinfoRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoRequest) SetApplicationId(v string) *CreateTwcNotaryLeaseVerifyinfoRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoRequest) SetAsync(v int64) *CreateTwcNotaryLeaseVerifyinfoRequest {
	s.Async = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoRequest) SetCardNumber(v string) *CreateTwcNotaryLeaseVerifyinfoRequest {
	s.CardNumber = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoRequest) SetCreditEndTime(v string) *CreateTwcNotaryLeaseVerifyinfoRequest {
	s.CreditEndTime = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoRequest) SetCreditLimit(v int64) *CreateTwcNotaryLeaseVerifyinfoRequest {
	s.CreditLimit = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoRequest) SetCreditStartTime(v string) *CreateTwcNotaryLeaseVerifyinfoRequest {
	s.CreditStartTime = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoRequest) SetExtraInfo(v string) *CreateTwcNotaryLeaseVerifyinfoRequest {
	s.ExtraInfo = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoRequest) SetLeaseCorpId(v string) *CreateTwcNotaryLeaseVerifyinfoRequest {
	s.LeaseCorpId = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoRequest) SetLeaseCorpName(v string) *CreateTwcNotaryLeaseVerifyinfoRequest {
	s.LeaseCorpName = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoRequest) SetLeaseCorpOwnerName(v string) *CreateTwcNotaryLeaseVerifyinfoRequest {
	s.LeaseCorpOwnerName = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoRequest) SetLeaseId(v string) *CreateTwcNotaryLeaseVerifyinfoRequest {
	s.LeaseId = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoRequest) SetLoan(v string) *CreateTwcNotaryLeaseVerifyinfoRequest {
	s.Loan = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoRequest) SetOrderId(v string) *CreateTwcNotaryLeaseVerifyinfoRequest {
	s.OrderId = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoRequest) SetPayBackHash(v string) *CreateTwcNotaryLeaseVerifyinfoRequest {
	s.PayBackHash = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoRequest) SetPayBackTxHash(v string) *CreateTwcNotaryLeaseVerifyinfoRequest {
	s.PayBackTxHash = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoRequest) SetUserId(v string) *CreateTwcNotaryLeaseVerifyinfoRequest {
	s.UserId = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoRequest) SetUserName(v string) *CreateTwcNotaryLeaseVerifyinfoRequest {
	s.UserName = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoRequest) SetUserPhoneNumber(v string) *CreateTwcNotaryLeaseVerifyinfoRequest {
	s.UserPhoneNumber = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoRequest) SetVerifyResult(v int64) *CreateTwcNotaryLeaseVerifyinfoRequest {
	s.VerifyResult = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoRequest) SetVoucher(v string) *CreateTwcNotaryLeaseVerifyinfoRequest {
	s.Voucher = &v
	return s
}

type CreateTwcNotaryLeaseVerifyinfoResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s CreateTwcNotaryLeaseVerifyinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseVerifyinfoResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseVerifyinfoResponse) SetReqMsgId(v string) *CreateTwcNotaryLeaseVerifyinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoResponse) SetResultCode(v string) *CreateTwcNotaryLeaseVerifyinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoResponse) SetResultMsg(v string) *CreateTwcNotaryLeaseVerifyinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoResponse) SetCode(v int64) *CreateTwcNotaryLeaseVerifyinfoResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoResponse) SetErrMessage(v string) *CreateTwcNotaryLeaseVerifyinfoResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateTwcNotaryLeaseVerifyinfoResponse) SetResponseData(v string) *CreateTwcNotaryLeaseVerifyinfoResponse {
	s.ResponseData = &v
	return s
}

type CreateTwcNotaryLeaseCreditpromiseRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 融资租赁业务id，由资方控制台创建返回
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 是否启动异步订单处理
	Async *int64 `json:"async,omitempty" xml:"async,omitempty"`
	// 融资租赁承诺额外字段
	CreditPromiseExtraInfoList []*string `json:"credit_promise_extra_info_list,omitempty" xml:"credit_promise_extra_info_list,omitempty" type:"Repeated"`
	// 租赁平台金融科技id
	LeaseId *string `json:"lease_id,omitempty" xml:"lease_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 垫付金额
	PayInAdvanceMoney *int64 `json:"pay_in_advance_money,omitempty" xml:"pay_in_advance_money,omitempty"`
	// 垫付金额，精确到毫厘，即123400表示12.34元
	PayInAdvanceMoneyList []*int64 `json:"pay_in_advance_money_list,omitempty" xml:"pay_in_advance_money_list,omitempty" type:"Repeated"`
	// 垫付日期
	PayInAdvanceTime *string `json:"pay_in_advance_time,omitempty" xml:"pay_in_advance_time,omitempty"`
	// 垫付日  格式为2019-8-31 12:00:00
	PayInAdvanceTimeList []*string `json:"pay_in_advance_time_list,omitempty" xml:"pay_in_advance_time_list,omitempty" type:"Repeated"`
	// 根据融资租赁合同及其补充协议哈希
	PromiseHash *string `json:"promise_hash,omitempty" xml:"promise_hash,omitempty"`
	// 根据融资租赁合同及其补充协议存证交易hash
	PromiseTxHash *string `json:"promise_tx_hash,omitempty" xml:"promise_tx_hash,omitempty"`
	// 归还金额
	ReturnMoney *int64 `json:"return_money,omitempty" xml:"return_money,omitempty"`
	// 还款金额，精确到毫厘，即123400表示12.34元
	ReturnMoneyList []*int64 `json:"return_money_list,omitempty" xml:"return_money_list,omitempty" type:"Repeated"`
	// 还款比例，精确到小数点后四位 12.34% 表示为1234
	ReturnRate *int64 `json:"return_rate,omitempty" xml:"return_rate,omitempty"`
	// 归还日，格式为"2019-07-31 12:00:00"
	ReturnTime *string `json:"return_time,omitempty" xml:"return_time,omitempty"`
	// 归还日，格式为"2019-07-31 12:00:00"
	ReturnTimeList []*string `json:"return_time_list,omitempty" xml:"return_time_list,omitempty" type:"Repeated"`
}

func (s CreateTwcNotaryLeaseCreditpromiseRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseCreditpromiseRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseCreditpromiseRequest) SetAuthToken(v string) *CreateTwcNotaryLeaseCreditpromiseRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryLeaseCreditpromiseRequest) SetProductInstanceId(v string) *CreateTwcNotaryLeaseCreditpromiseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryLeaseCreditpromiseRequest) SetRegionName(v string) *CreateTwcNotaryLeaseCreditpromiseRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryLeaseCreditpromiseRequest) SetApplicationId(v string) *CreateTwcNotaryLeaseCreditpromiseRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateTwcNotaryLeaseCreditpromiseRequest) SetAsync(v int64) *CreateTwcNotaryLeaseCreditpromiseRequest {
	s.Async = &v
	return s
}

func (s *CreateTwcNotaryLeaseCreditpromiseRequest) SetCreditPromiseExtraInfoList(v []*string) *CreateTwcNotaryLeaseCreditpromiseRequest {
	s.CreditPromiseExtraInfoList = v
	return s
}

func (s *CreateTwcNotaryLeaseCreditpromiseRequest) SetLeaseId(v string) *CreateTwcNotaryLeaseCreditpromiseRequest {
	s.LeaseId = &v
	return s
}

func (s *CreateTwcNotaryLeaseCreditpromiseRequest) SetOrderId(v string) *CreateTwcNotaryLeaseCreditpromiseRequest {
	s.OrderId = &v
	return s
}

func (s *CreateTwcNotaryLeaseCreditpromiseRequest) SetPayInAdvanceMoney(v int64) *CreateTwcNotaryLeaseCreditpromiseRequest {
	s.PayInAdvanceMoney = &v
	return s
}

func (s *CreateTwcNotaryLeaseCreditpromiseRequest) SetPayInAdvanceMoneyList(v []*int64) *CreateTwcNotaryLeaseCreditpromiseRequest {
	s.PayInAdvanceMoneyList = v
	return s
}

func (s *CreateTwcNotaryLeaseCreditpromiseRequest) SetPayInAdvanceTime(v string) *CreateTwcNotaryLeaseCreditpromiseRequest {
	s.PayInAdvanceTime = &v
	return s
}

func (s *CreateTwcNotaryLeaseCreditpromiseRequest) SetPayInAdvanceTimeList(v []*string) *CreateTwcNotaryLeaseCreditpromiseRequest {
	s.PayInAdvanceTimeList = v
	return s
}

func (s *CreateTwcNotaryLeaseCreditpromiseRequest) SetPromiseHash(v string) *CreateTwcNotaryLeaseCreditpromiseRequest {
	s.PromiseHash = &v
	return s
}

func (s *CreateTwcNotaryLeaseCreditpromiseRequest) SetPromiseTxHash(v string) *CreateTwcNotaryLeaseCreditpromiseRequest {
	s.PromiseTxHash = &v
	return s
}

func (s *CreateTwcNotaryLeaseCreditpromiseRequest) SetReturnMoney(v int64) *CreateTwcNotaryLeaseCreditpromiseRequest {
	s.ReturnMoney = &v
	return s
}

func (s *CreateTwcNotaryLeaseCreditpromiseRequest) SetReturnMoneyList(v []*int64) *CreateTwcNotaryLeaseCreditpromiseRequest {
	s.ReturnMoneyList = v
	return s
}

func (s *CreateTwcNotaryLeaseCreditpromiseRequest) SetReturnRate(v int64) *CreateTwcNotaryLeaseCreditpromiseRequest {
	s.ReturnRate = &v
	return s
}

func (s *CreateTwcNotaryLeaseCreditpromiseRequest) SetReturnTime(v string) *CreateTwcNotaryLeaseCreditpromiseRequest {
	s.ReturnTime = &v
	return s
}

func (s *CreateTwcNotaryLeaseCreditpromiseRequest) SetReturnTimeList(v []*string) *CreateTwcNotaryLeaseCreditpromiseRequest {
	s.ReturnTimeList = v
	return s
}

type CreateTwcNotaryLeaseCreditpromiseResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s CreateTwcNotaryLeaseCreditpromiseResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseCreditpromiseResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseCreditpromiseResponse) SetReqMsgId(v string) *CreateTwcNotaryLeaseCreditpromiseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryLeaseCreditpromiseResponse) SetResultCode(v string) *CreateTwcNotaryLeaseCreditpromiseResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryLeaseCreditpromiseResponse) SetResultMsg(v string) *CreateTwcNotaryLeaseCreditpromiseResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryLeaseCreditpromiseResponse) SetCode(v int64) *CreateTwcNotaryLeaseCreditpromiseResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryLeaseCreditpromiseResponse) SetErrMessage(v string) *CreateTwcNotaryLeaseCreditpromiseResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateTwcNotaryLeaseCreditpromiseResponse) SetResponseData(v string) *CreateTwcNotaryLeaseCreditpromiseResponse {
	s.ResponseData = &v
	return s
}

type CreateTwcNotaryLeaseDisburseinfoRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 共管账户，网商清分
	ActiveAccount *string `json:"active_account,omitempty" xml:"active_account,omitempty"`
	// 对结果的简要描述信息
	ActiveResultDesc *string `json:"active_result_desc,omitempty" xml:"active_result_desc,omitempty"`
	// 成功/失败 0表示失败，1表示成功
	ActiveResultStatus *int64 `json:"active_result_status,omitempty" xml:"active_result_status,omitempty"`
	// 授信成功日期，格式为"2019-07-31 12:00:00"
	ActiveReturnDate *string `json:"active_return_date,omitempty" xml:"active_return_date,omitempty"`
	// 本金+利息，精确到毫厘，即123400表示12.34元
	ActiveReturnMoney *int64 `json:"active_return_money,omitempty" xml:"active_return_money,omitempty"`
	// 支用期限，精确到毫秒
	DisburseLimit *int64 `json:"disburse_limit,omitempty" xml:"disburse_limit,omitempty"`
	// 支用金额，精确到毫厘，即123400表示12.34元
	DisburseMoney *int64 `json:"disburse_money,omitempty" xml:"disburse_money,omitempty"`
	// 支用科目，服务费/租金，精确到毫厘，即123400表示12.34元
	DisburseService *int64 `json:"disburse_service,omitempty" xml:"disburse_service,omitempty"`
	// 逾期天数，支用到期日开始计算，天数为单位
	ExceedDuration *int64 `json:"exceed_duration,omitempty" xml:"exceed_duration,omitempty"`
	// 1未还款，2已还款
	ExceedPayBackStatus *int64 `json:"exceed_pay_back_status,omitempty" xml:"exceed_pay_back_status,omitempty"`
	// 逾期利率，精确到小数点后四位 12.34% 表示为1234
	ExceedRate *int64 `json:"exceed_rate,omitempty" xml:"exceed_rate,omitempty"`
	// 逾期应还款总额，本金+利息+逾期利息，精确到毫厘，即123400表示12.34元
	ExceedReturnMoney *int64 `json:"exceed_return_money,omitempty" xml:"exceed_return_money,omitempty"`
	// 贷款利率,银行同步利率，年化8%-15%,精确到小数点后四位 12.34% 表示为1234
	LoanRate *int64 `json:"loan_rate,omitempty" xml:"loan_rate,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 到期还款日，T+支用期限，节假日顺延至第一个工作日，格式为"2019-07-31 12:00:00"
	PayBackDate *string `json:"pay_back_date,omitempty" xml:"pay_back_date,omitempty"`
	// 到期还款金额，本金+利息，精确到毫厘，即123400表示12.34元
	PayBackMoney *int64 `json:"pay_back_money,omitempty" xml:"pay_back_money,omitempty"`
	// 应还利息，系统自动计算当日应还利息（T+1），精确到毫厘，即123400表示12.34元
	ReturnInterest *int64 `json:"return_interest,omitempty" xml:"return_interest,omitempty"`
}

func (s CreateTwcNotaryLeaseDisburseinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseDisburseinfoRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseDisburseinfoRequest) SetAuthToken(v string) *CreateTwcNotaryLeaseDisburseinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryLeaseDisburseinfoRequest) SetProductInstanceId(v string) *CreateTwcNotaryLeaseDisburseinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryLeaseDisburseinfoRequest) SetRegionName(v string) *CreateTwcNotaryLeaseDisburseinfoRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryLeaseDisburseinfoRequest) SetActiveAccount(v string) *CreateTwcNotaryLeaseDisburseinfoRequest {
	s.ActiveAccount = &v
	return s
}

func (s *CreateTwcNotaryLeaseDisburseinfoRequest) SetActiveResultDesc(v string) *CreateTwcNotaryLeaseDisburseinfoRequest {
	s.ActiveResultDesc = &v
	return s
}

func (s *CreateTwcNotaryLeaseDisburseinfoRequest) SetActiveResultStatus(v int64) *CreateTwcNotaryLeaseDisburseinfoRequest {
	s.ActiveResultStatus = &v
	return s
}

func (s *CreateTwcNotaryLeaseDisburseinfoRequest) SetActiveReturnDate(v string) *CreateTwcNotaryLeaseDisburseinfoRequest {
	s.ActiveReturnDate = &v
	return s
}

func (s *CreateTwcNotaryLeaseDisburseinfoRequest) SetActiveReturnMoney(v int64) *CreateTwcNotaryLeaseDisburseinfoRequest {
	s.ActiveReturnMoney = &v
	return s
}

func (s *CreateTwcNotaryLeaseDisburseinfoRequest) SetDisburseLimit(v int64) *CreateTwcNotaryLeaseDisburseinfoRequest {
	s.DisburseLimit = &v
	return s
}

func (s *CreateTwcNotaryLeaseDisburseinfoRequest) SetDisburseMoney(v int64) *CreateTwcNotaryLeaseDisburseinfoRequest {
	s.DisburseMoney = &v
	return s
}

func (s *CreateTwcNotaryLeaseDisburseinfoRequest) SetDisburseService(v int64) *CreateTwcNotaryLeaseDisburseinfoRequest {
	s.DisburseService = &v
	return s
}

func (s *CreateTwcNotaryLeaseDisburseinfoRequest) SetExceedDuration(v int64) *CreateTwcNotaryLeaseDisburseinfoRequest {
	s.ExceedDuration = &v
	return s
}

func (s *CreateTwcNotaryLeaseDisburseinfoRequest) SetExceedPayBackStatus(v int64) *CreateTwcNotaryLeaseDisburseinfoRequest {
	s.ExceedPayBackStatus = &v
	return s
}

func (s *CreateTwcNotaryLeaseDisburseinfoRequest) SetExceedRate(v int64) *CreateTwcNotaryLeaseDisburseinfoRequest {
	s.ExceedRate = &v
	return s
}

func (s *CreateTwcNotaryLeaseDisburseinfoRequest) SetExceedReturnMoney(v int64) *CreateTwcNotaryLeaseDisburseinfoRequest {
	s.ExceedReturnMoney = &v
	return s
}

func (s *CreateTwcNotaryLeaseDisburseinfoRequest) SetLoanRate(v int64) *CreateTwcNotaryLeaseDisburseinfoRequest {
	s.LoanRate = &v
	return s
}

func (s *CreateTwcNotaryLeaseDisburseinfoRequest) SetOrderId(v string) *CreateTwcNotaryLeaseDisburseinfoRequest {
	s.OrderId = &v
	return s
}

func (s *CreateTwcNotaryLeaseDisburseinfoRequest) SetPayBackDate(v string) *CreateTwcNotaryLeaseDisburseinfoRequest {
	s.PayBackDate = &v
	return s
}

func (s *CreateTwcNotaryLeaseDisburseinfoRequest) SetPayBackMoney(v int64) *CreateTwcNotaryLeaseDisburseinfoRequest {
	s.PayBackMoney = &v
	return s
}

func (s *CreateTwcNotaryLeaseDisburseinfoRequest) SetReturnInterest(v int64) *CreateTwcNotaryLeaseDisburseinfoRequest {
	s.ReturnInterest = &v
	return s
}

type CreateTwcNotaryLeaseDisburseinfoResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s CreateTwcNotaryLeaseDisburseinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseDisburseinfoResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseDisburseinfoResponse) SetReqMsgId(v string) *CreateTwcNotaryLeaseDisburseinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryLeaseDisburseinfoResponse) SetResultCode(v string) *CreateTwcNotaryLeaseDisburseinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryLeaseDisburseinfoResponse) SetResultMsg(v string) *CreateTwcNotaryLeaseDisburseinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryLeaseDisburseinfoResponse) SetCode(v int64) *CreateTwcNotaryLeaseDisburseinfoResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryLeaseDisburseinfoResponse) SetErrMessage(v string) *CreateTwcNotaryLeaseDisburseinfoResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateTwcNotaryLeaseDisburseinfoResponse) SetResponseData(v string) *CreateTwcNotaryLeaseDisburseinfoResponse {
	s.ResponseData = &v
	return s
}

type QueryTwcNotaryLeaseOrderinfoRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 融资租赁业务id，由资方控制台生成返回
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 租赁平台金融科技租户id
	LeaseId *string `json:"lease_id,omitempty" xml:"lease_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 阶段描述
	PhaseInfo *string `json:"phase_info,omitempty" xml:"phase_info,omitempty"`
}

func (s QueryTwcNotaryLeaseOrderinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryLeaseOrderinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryLeaseOrderinfoRequest) SetAuthToken(v string) *QueryTwcNotaryLeaseOrderinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwcNotaryLeaseOrderinfoRequest) SetProductInstanceId(v string) *QueryTwcNotaryLeaseOrderinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwcNotaryLeaseOrderinfoRequest) SetRegionName(v string) *QueryTwcNotaryLeaseOrderinfoRequest {
	s.RegionName = &v
	return s
}

func (s *QueryTwcNotaryLeaseOrderinfoRequest) SetApplicationId(v string) *QueryTwcNotaryLeaseOrderinfoRequest {
	s.ApplicationId = &v
	return s
}

func (s *QueryTwcNotaryLeaseOrderinfoRequest) SetLeaseId(v string) *QueryTwcNotaryLeaseOrderinfoRequest {
	s.LeaseId = &v
	return s
}

func (s *QueryTwcNotaryLeaseOrderinfoRequest) SetOrderId(v string) *QueryTwcNotaryLeaseOrderinfoRequest {
	s.OrderId = &v
	return s
}

func (s *QueryTwcNotaryLeaseOrderinfoRequest) SetPhaseInfo(v string) *QueryTwcNotaryLeaseOrderinfoRequest {
	s.PhaseInfo = &v
	return s
}

type QueryTwcNotaryLeaseOrderinfoResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s QueryTwcNotaryLeaseOrderinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryLeaseOrderinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryLeaseOrderinfoResponse) SetReqMsgId(v string) *QueryTwcNotaryLeaseOrderinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwcNotaryLeaseOrderinfoResponse) SetResultCode(v string) *QueryTwcNotaryLeaseOrderinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwcNotaryLeaseOrderinfoResponse) SetResultMsg(v string) *QueryTwcNotaryLeaseOrderinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwcNotaryLeaseOrderinfoResponse) SetCode(v int64) *QueryTwcNotaryLeaseOrderinfoResponse {
	s.Code = &v
	return s
}

func (s *QueryTwcNotaryLeaseOrderinfoResponse) SetErrMessage(v string) *QueryTwcNotaryLeaseOrderinfoResponse {
	s.ErrMessage = &v
	return s
}

func (s *QueryTwcNotaryLeaseOrderinfoResponse) SetResponseData(v string) *QueryTwcNotaryLeaseOrderinfoResponse {
	s.ResponseData = &v
	return s
}

type CreateTwcNotaryFinanceTextnotaryRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 反欺诈查询对应的身份证号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 哈希算法
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty"`
	// 位置描述信息
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 反欺诈查询需要的手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 存证阶段，用户可自行维护
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 文本哈希
	TextHash *string `json:"text_hash,omitempty" xml:"text_hash,omitempty"`
	// 本次请求的唯一id
	ThirdMessageId *string `json:"third_message_id,omitempty" xml:"third_message_id,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 是否使用可信时间戳
	Tsr *bool `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 反欺诈查询需要的姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
}

func (s CreateTwcNotaryFinanceTextnotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryFinanceTextnotaryRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryFinanceTextnotaryRequest) SetAuthToken(v string) *CreateTwcNotaryFinanceTextnotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryFinanceTextnotaryRequest) SetProductInstanceId(v string) *CreateTwcNotaryFinanceTextnotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryFinanceTextnotaryRequest) SetRegionName(v string) *CreateTwcNotaryFinanceTextnotaryRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryFinanceTextnotaryRequest) SetCertNo(v string) *CreateTwcNotaryFinanceTextnotaryRequest {
	s.CertNo = &v
	return s
}

func (s *CreateTwcNotaryFinanceTextnotaryRequest) SetHashAlgorithm(v string) *CreateTwcNotaryFinanceTextnotaryRequest {
	s.HashAlgorithm = &v
	return s
}

func (s *CreateTwcNotaryFinanceTextnotaryRequest) SetLocation(v *Location) *CreateTwcNotaryFinanceTextnotaryRequest {
	s.Location = v
	return s
}

func (s *CreateTwcNotaryFinanceTextnotaryRequest) SetMobile(v string) *CreateTwcNotaryFinanceTextnotaryRequest {
	s.Mobile = &v
	return s
}

func (s *CreateTwcNotaryFinanceTextnotaryRequest) SetPhase(v string) *CreateTwcNotaryFinanceTextnotaryRequest {
	s.Phase = &v
	return s
}

func (s *CreateTwcNotaryFinanceTextnotaryRequest) SetProperties(v string) *CreateTwcNotaryFinanceTextnotaryRequest {
	s.Properties = &v
	return s
}

func (s *CreateTwcNotaryFinanceTextnotaryRequest) SetTextHash(v string) *CreateTwcNotaryFinanceTextnotaryRequest {
	s.TextHash = &v
	return s
}

func (s *CreateTwcNotaryFinanceTextnotaryRequest) SetThirdMessageId(v string) *CreateTwcNotaryFinanceTextnotaryRequest {
	s.ThirdMessageId = &v
	return s
}

func (s *CreateTwcNotaryFinanceTextnotaryRequest) SetTransactionId(v string) *CreateTwcNotaryFinanceTextnotaryRequest {
	s.TransactionId = &v
	return s
}

func (s *CreateTwcNotaryFinanceTextnotaryRequest) SetTsr(v bool) *CreateTwcNotaryFinanceTextnotaryRequest {
	s.Tsr = &v
	return s
}

func (s *CreateTwcNotaryFinanceTextnotaryRequest) SetUserName(v string) *CreateTwcNotaryFinanceTextnotaryRequest {
	s.UserName = &v
	return s
}

type CreateTwcNotaryFinanceTextnotaryResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 反欺诈对应的信用值
	CreditRiskScore *string `json:"credit_risk_score,omitempty" xml:"credit_risk_score,omitempty"`
	// 可信时间戳
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateTwcNotaryFinanceTextnotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryFinanceTextnotaryResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryFinanceTextnotaryResponse) SetReqMsgId(v string) *CreateTwcNotaryFinanceTextnotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryFinanceTextnotaryResponse) SetResultCode(v string) *CreateTwcNotaryFinanceTextnotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryFinanceTextnotaryResponse) SetResultMsg(v string) *CreateTwcNotaryFinanceTextnotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryFinanceTextnotaryResponse) SetCreditRiskScore(v string) *CreateTwcNotaryFinanceTextnotaryResponse {
	s.CreditRiskScore = &v
	return s
}

func (s *CreateTwcNotaryFinanceTextnotaryResponse) SetTsr(v *TsrResponse) *CreateTwcNotaryFinanceTextnotaryResponse {
	s.Tsr = v
	return s
}

func (s *CreateTwcNotaryFinanceTextnotaryResponse) SetTxHash(v string) *CreateTwcNotaryFinanceTextnotaryResponse {
	s.TxHash = &v
	return s
}

type GetTwcNotaryFinanceTextnotaryRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 位置信息
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 存证阶段
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性，用户可自行维护
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s GetTwcNotaryFinanceTextnotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTwcNotaryFinanceTextnotaryRequest) GoString() string {
	return s.String()
}

func (s *GetTwcNotaryFinanceTextnotaryRequest) SetAuthToken(v string) *GetTwcNotaryFinanceTextnotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTwcNotaryFinanceTextnotaryRequest) SetProductInstanceId(v string) *GetTwcNotaryFinanceTextnotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTwcNotaryFinanceTextnotaryRequest) SetRegionName(v string) *GetTwcNotaryFinanceTextnotaryRequest {
	s.RegionName = &v
	return s
}

func (s *GetTwcNotaryFinanceTextnotaryRequest) SetLocation(v *Location) *GetTwcNotaryFinanceTextnotaryRequest {
	s.Location = v
	return s
}

func (s *GetTwcNotaryFinanceTextnotaryRequest) SetPhase(v string) *GetTwcNotaryFinanceTextnotaryRequest {
	s.Phase = &v
	return s
}

func (s *GetTwcNotaryFinanceTextnotaryRequest) SetProperties(v string) *GetTwcNotaryFinanceTextnotaryRequest {
	s.Properties = &v
	return s
}

func (s *GetTwcNotaryFinanceTextnotaryRequest) SetTransactionId(v string) *GetTwcNotaryFinanceTextnotaryRequest {
	s.TransactionId = &v
	return s
}

func (s *GetTwcNotaryFinanceTextnotaryRequest) SetTxHash(v string) *GetTwcNotaryFinanceTextnotaryRequest {
	s.TxHash = &v
	return s
}

type GetTwcNotaryFinanceTextnotaryResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 哈希算法
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty"`
	// 存证阶段
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 文本哈希
	TextHash *string `json:"text_hash,omitempty" xml:"text_hash,omitempty"`
	// 可信时间戳
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
}

func (s GetTwcNotaryFinanceTextnotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTwcNotaryFinanceTextnotaryResponse) GoString() string {
	return s.String()
}

func (s *GetTwcNotaryFinanceTextnotaryResponse) SetReqMsgId(v string) *GetTwcNotaryFinanceTextnotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTwcNotaryFinanceTextnotaryResponse) SetResultCode(v string) *GetTwcNotaryFinanceTextnotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTwcNotaryFinanceTextnotaryResponse) SetResultMsg(v string) *GetTwcNotaryFinanceTextnotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTwcNotaryFinanceTextnotaryResponse) SetHashAlgorithm(v string) *GetTwcNotaryFinanceTextnotaryResponse {
	s.HashAlgorithm = &v
	return s
}

func (s *GetTwcNotaryFinanceTextnotaryResponse) SetPhase(v string) *GetTwcNotaryFinanceTextnotaryResponse {
	s.Phase = &v
	return s
}

func (s *GetTwcNotaryFinanceTextnotaryResponse) SetProperties(v string) *GetTwcNotaryFinanceTextnotaryResponse {
	s.Properties = &v
	return s
}

func (s *GetTwcNotaryFinanceTextnotaryResponse) SetTextHash(v string) *GetTwcNotaryFinanceTextnotaryResponse {
	s.TextHash = &v
	return s
}

func (s *GetTwcNotaryFinanceTextnotaryResponse) SetTsr(v *TsrResponse) *GetTwcNotaryFinanceTextnotaryResponse {
	s.Tsr = v
	return s
}

type CreateTwcNotaryFinanceFilenotaryRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 反欺诈需要的证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 创建日期，时间戳类型，单位毫秒
	CreatedDate *int64 `json:"created_date,omitempty" xml:"created_date,omitempty"`
	// 存证文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// 文件存证类型，支持小于 1M 源文件或者文件哈希
	FileNotaryType *string `json:"file_notary_type,omitempty" xml:"file_notary_type,omitempty"`
	// 文件大小，单位 Bytes
	FileSize *int64 `json:"file_size,omitempty" xml:"file_size,omitempty"`
	// 文件类型
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty"`
	// 文件地址
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty"`
	// 哈希算法
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty"`
	// 位置信息
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 反欺诈查询需要的手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 文件存证内容
	NotaryContent *string `json:"notary_content,omitempty" xml:"notary_content,omitempty"`
	// 存证阶段
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性，用户可自行维护
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 本次请求的唯一ID
	ThirdMessageId *string `json:"third_message_id,omitempty" xml:"third_message_id,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 是否使用可信时间戳
	Tsr *bool `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 反欺诈查询需要的证件上的姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
}

func (s CreateTwcNotaryFinanceFilenotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryFinanceFilenotaryRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryFinanceFilenotaryRequest) SetAuthToken(v string) *CreateTwcNotaryFinanceFilenotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryFinanceFilenotaryRequest) SetProductInstanceId(v string) *CreateTwcNotaryFinanceFilenotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryFinanceFilenotaryRequest) SetRegionName(v string) *CreateTwcNotaryFinanceFilenotaryRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryFinanceFilenotaryRequest) SetCertNo(v string) *CreateTwcNotaryFinanceFilenotaryRequest {
	s.CertNo = &v
	return s
}

func (s *CreateTwcNotaryFinanceFilenotaryRequest) SetCreatedDate(v int64) *CreateTwcNotaryFinanceFilenotaryRequest {
	s.CreatedDate = &v
	return s
}

func (s *CreateTwcNotaryFinanceFilenotaryRequest) SetFileName(v string) *CreateTwcNotaryFinanceFilenotaryRequest {
	s.FileName = &v
	return s
}

func (s *CreateTwcNotaryFinanceFilenotaryRequest) SetFileNotaryType(v string) *CreateTwcNotaryFinanceFilenotaryRequest {
	s.FileNotaryType = &v
	return s
}

func (s *CreateTwcNotaryFinanceFilenotaryRequest) SetFileSize(v int64) *CreateTwcNotaryFinanceFilenotaryRequest {
	s.FileSize = &v
	return s
}

func (s *CreateTwcNotaryFinanceFilenotaryRequest) SetFileType(v string) *CreateTwcNotaryFinanceFilenotaryRequest {
	s.FileType = &v
	return s
}

func (s *CreateTwcNotaryFinanceFilenotaryRequest) SetFileUrl(v string) *CreateTwcNotaryFinanceFilenotaryRequest {
	s.FileUrl = &v
	return s
}

func (s *CreateTwcNotaryFinanceFilenotaryRequest) SetHashAlgorithm(v string) *CreateTwcNotaryFinanceFilenotaryRequest {
	s.HashAlgorithm = &v
	return s
}

func (s *CreateTwcNotaryFinanceFilenotaryRequest) SetLocation(v *Location) *CreateTwcNotaryFinanceFilenotaryRequest {
	s.Location = v
	return s
}

func (s *CreateTwcNotaryFinanceFilenotaryRequest) SetMobile(v string) *CreateTwcNotaryFinanceFilenotaryRequest {
	s.Mobile = &v
	return s
}

func (s *CreateTwcNotaryFinanceFilenotaryRequest) SetNotaryContent(v string) *CreateTwcNotaryFinanceFilenotaryRequest {
	s.NotaryContent = &v
	return s
}

func (s *CreateTwcNotaryFinanceFilenotaryRequest) SetPhase(v string) *CreateTwcNotaryFinanceFilenotaryRequest {
	s.Phase = &v
	return s
}

func (s *CreateTwcNotaryFinanceFilenotaryRequest) SetProperties(v string) *CreateTwcNotaryFinanceFilenotaryRequest {
	s.Properties = &v
	return s
}

func (s *CreateTwcNotaryFinanceFilenotaryRequest) SetThirdMessageId(v string) *CreateTwcNotaryFinanceFilenotaryRequest {
	s.ThirdMessageId = &v
	return s
}

func (s *CreateTwcNotaryFinanceFilenotaryRequest) SetTransactionId(v string) *CreateTwcNotaryFinanceFilenotaryRequest {
	s.TransactionId = &v
	return s
}

func (s *CreateTwcNotaryFinanceFilenotaryRequest) SetTsr(v bool) *CreateTwcNotaryFinanceFilenotaryRequest {
	s.Tsr = &v
	return s
}

func (s *CreateTwcNotaryFinanceFilenotaryRequest) SetUserName(v string) *CreateTwcNotaryFinanceFilenotaryRequest {
	s.UserName = &v
	return s
}

type CreateTwcNotaryFinanceFilenotaryResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 反欺诈查询返回的信用值
	CreditRiskScore *string `json:"credit_risk_score,omitempty" xml:"credit_risk_score,omitempty"`
	// 可信时间戳
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateTwcNotaryFinanceFilenotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryFinanceFilenotaryResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryFinanceFilenotaryResponse) SetReqMsgId(v string) *CreateTwcNotaryFinanceFilenotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryFinanceFilenotaryResponse) SetResultCode(v string) *CreateTwcNotaryFinanceFilenotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryFinanceFilenotaryResponse) SetResultMsg(v string) *CreateTwcNotaryFinanceFilenotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryFinanceFilenotaryResponse) SetCreditRiskScore(v string) *CreateTwcNotaryFinanceFilenotaryResponse {
	s.CreditRiskScore = &v
	return s
}

func (s *CreateTwcNotaryFinanceFilenotaryResponse) SetTsr(v *TsrResponse) *CreateTwcNotaryFinanceFilenotaryResponse {
	s.Tsr = v
	return s
}

func (s *CreateTwcNotaryFinanceFilenotaryResponse) SetTxHash(v string) *CreateTwcNotaryFinanceFilenotaryResponse {
	s.TxHash = &v
	return s
}

type GetTwcNotaryFinanceFilenotaryRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 位置信息
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 存证状态
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性，用户自行维护
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s GetTwcNotaryFinanceFilenotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTwcNotaryFinanceFilenotaryRequest) GoString() string {
	return s.String()
}

func (s *GetTwcNotaryFinanceFilenotaryRequest) SetAuthToken(v string) *GetTwcNotaryFinanceFilenotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTwcNotaryFinanceFilenotaryRequest) SetProductInstanceId(v string) *GetTwcNotaryFinanceFilenotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTwcNotaryFinanceFilenotaryRequest) SetRegionName(v string) *GetTwcNotaryFinanceFilenotaryRequest {
	s.RegionName = &v
	return s
}

func (s *GetTwcNotaryFinanceFilenotaryRequest) SetLocation(v *Location) *GetTwcNotaryFinanceFilenotaryRequest {
	s.Location = v
	return s
}

func (s *GetTwcNotaryFinanceFilenotaryRequest) SetPhase(v string) *GetTwcNotaryFinanceFilenotaryRequest {
	s.Phase = &v
	return s
}

func (s *GetTwcNotaryFinanceFilenotaryRequest) SetProperties(v string) *GetTwcNotaryFinanceFilenotaryRequest {
	s.Properties = &v
	return s
}

func (s *GetTwcNotaryFinanceFilenotaryRequest) SetTransactionId(v string) *GetTwcNotaryFinanceFilenotaryRequest {
	s.TransactionId = &v
	return s
}

func (s *GetTwcNotaryFinanceFilenotaryRequest) SetTxHash(v string) *GetTwcNotaryFinanceFilenotaryRequest {
	s.TxHash = &v
	return s
}

type GetTwcNotaryFinanceFilenotaryResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s GetTwcNotaryFinanceFilenotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTwcNotaryFinanceFilenotaryResponse) GoString() string {
	return s.String()
}

func (s *GetTwcNotaryFinanceFilenotaryResponse) SetReqMsgId(v string) *GetTwcNotaryFinanceFilenotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTwcNotaryFinanceFilenotaryResponse) SetResultCode(v string) *GetTwcNotaryFinanceFilenotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTwcNotaryFinanceFilenotaryResponse) SetResultMsg(v string) *GetTwcNotaryFinanceFilenotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTwcNotaryFinanceFilenotaryResponse) SetFileName(v string) *GetTwcNotaryFinanceFilenotaryResponse {
	s.FileName = &v
	return s
}

func (s *GetTwcNotaryFinanceFilenotaryResponse) SetFileNotaryType(v string) *GetTwcNotaryFinanceFilenotaryResponse {
	s.FileNotaryType = &v
	return s
}

func (s *GetTwcNotaryFinanceFilenotaryResponse) SetHashAlgorithm(v string) *GetTwcNotaryFinanceFilenotaryResponse {
	s.HashAlgorithm = &v
	return s
}

func (s *GetTwcNotaryFinanceFilenotaryResponse) SetNotaryContent(v string) *GetTwcNotaryFinanceFilenotaryResponse {
	s.NotaryContent = &v
	return s
}

func (s *GetTwcNotaryFinanceFilenotaryResponse) SetPhase(v string) *GetTwcNotaryFinanceFilenotaryResponse {
	s.Phase = &v
	return s
}

func (s *GetTwcNotaryFinanceFilenotaryResponse) SetProperties(v string) *GetTwcNotaryFinanceFilenotaryResponse {
	s.Properties = &v
	return s
}

func (s *GetTwcNotaryFinanceFilenotaryResponse) SetTsr(v *TsrResponse) *GetTwcNotaryFinanceFilenotaryResponse {
	s.Tsr = v
	return s
}

type CheckTwcNotaryIndustryNotaryRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 行业类型
	IndustryType *string `json:"industry_type,omitempty" xml:"industry_type,omitempty"`
	// 核验数据列表
	NotaryCheckMetaList []*NotaryCheckMeta `json:"notary_check_meta_list,omitempty" xml:"notary_check_meta_list,omitempty" type:"Repeated"`
}

func (s CheckTwcNotaryIndustryNotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckTwcNotaryIndustryNotaryRequest) GoString() string {
	return s.String()
}

func (s *CheckTwcNotaryIndustryNotaryRequest) SetAuthToken(v string) *CheckTwcNotaryIndustryNotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckTwcNotaryIndustryNotaryRequest) SetProductInstanceId(v string) *CheckTwcNotaryIndustryNotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckTwcNotaryIndustryNotaryRequest) SetRegionName(v string) *CheckTwcNotaryIndustryNotaryRequest {
	s.RegionName = &v
	return s
}

func (s *CheckTwcNotaryIndustryNotaryRequest) SetIndustryType(v string) *CheckTwcNotaryIndustryNotaryRequest {
	s.IndustryType = &v
	return s
}

func (s *CheckTwcNotaryIndustryNotaryRequest) SetNotaryCheckMetaList(v []*NotaryCheckMeta) *CheckTwcNotaryIndustryNotaryRequest {
	s.NotaryCheckMetaList = v
	return s
}

type CheckTwcNotaryIndustryNotaryResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 核验结果数组
	NotaryCheckResults []*NotaryCheckResult `json:"notary_check_results,omitempty" xml:"notary_check_results,omitempty" type:"Repeated"`
}

func (s CheckTwcNotaryIndustryNotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckTwcNotaryIndustryNotaryResponse) GoString() string {
	return s.String()
}

func (s *CheckTwcNotaryIndustryNotaryResponse) SetReqMsgId(v string) *CheckTwcNotaryIndustryNotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckTwcNotaryIndustryNotaryResponse) SetResultCode(v string) *CheckTwcNotaryIndustryNotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckTwcNotaryIndustryNotaryResponse) SetResultMsg(v string) *CheckTwcNotaryIndustryNotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckTwcNotaryIndustryNotaryResponse) SetNotaryCheckResults(v []*NotaryCheckResult) *CheckTwcNotaryIndustryNotaryResponse {
	s.NotaryCheckResults = v
	return s
}

type UpdateTwcNotaryLeaseContractRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 合约业务层id
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 被升级的合约名称
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty"`
}

func (s UpdateTwcNotaryLeaseContractRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateTwcNotaryLeaseContractRequest) GoString() string {
	return s.String()
}

func (s *UpdateTwcNotaryLeaseContractRequest) SetAuthToken(v string) *UpdateTwcNotaryLeaseContractRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateTwcNotaryLeaseContractRequest) SetProductInstanceId(v string) *UpdateTwcNotaryLeaseContractRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateTwcNotaryLeaseContractRequest) SetRegionName(v string) *UpdateTwcNotaryLeaseContractRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateTwcNotaryLeaseContractRequest) SetApplicationId(v string) *UpdateTwcNotaryLeaseContractRequest {
	s.ApplicationId = &v
	return s
}

func (s *UpdateTwcNotaryLeaseContractRequest) SetContractId(v string) *UpdateTwcNotaryLeaseContractRequest {
	s.ContractId = &v
	return s
}

type UpdateTwcNotaryLeaseContractResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s UpdateTwcNotaryLeaseContractResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateTwcNotaryLeaseContractResponse) GoString() string {
	return s.String()
}

func (s *UpdateTwcNotaryLeaseContractResponse) SetReqMsgId(v string) *UpdateTwcNotaryLeaseContractResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateTwcNotaryLeaseContractResponse) SetResultCode(v string) *UpdateTwcNotaryLeaseContractResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateTwcNotaryLeaseContractResponse) SetResultMsg(v string) *UpdateTwcNotaryLeaseContractResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateTwcNotaryLeaseContractResponse) SetCode(v int64) *UpdateTwcNotaryLeaseContractResponse {
	s.Code = &v
	return s
}

func (s *UpdateTwcNotaryLeaseContractResponse) SetErrMessage(v string) *UpdateTwcNotaryLeaseContractResponse {
	s.ErrMessage = &v
	return s
}

func (s *UpdateTwcNotaryLeaseContractResponse) SetResponseData(v string) *UpdateTwcNotaryLeaseContractResponse {
	s.ResponseData = &v
	return s
}

type CreateTwcNotarySueBreakpromiseinfoRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 违约金额，精确到毫厘，即123400表示12.34元
	BreakPromiseMoney *int64 `json:"break_promise_money,omitempty" xml:"break_promise_money,omitempty"`
	// 所属行业
	BusinessClass *string `json:"business_class,omitempty" xml:"business_class,omitempty"`
	// 法院唯一标识
	CourtId *string `json:"court_id,omitempty" xml:"court_id,omitempty"`
	// 管辖法院名称
	CourtName *string `json:"court_name,omitempty" xml:"court_name,omitempty"`
	// 当事人邮箱地址
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 商户统一社会信用代码或个人身份证
	InitiatorId *string `json:"initiator_id,omitempty" xml:"initiator_id,omitempty"`
	// 商户或个人名称
	//
	InitiatorName *string `json:"initiator_name,omitempty" xml:"initiator_name,omitempty"`
	// 合同唯一标识
	//
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 当事人手机号
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty"`
	// 诉前Id
	PreSueId *string `json:"pre_sue_id,omitempty" xml:"pre_sue_id,omitempty"`
	// 应履约日期，格式为"2019-07-31 12:00:00"
	PromiseDate *string `json:"promise_date,omitempty" xml:"promise_date,omitempty"`
	// 宽限期(天数，从应履约日期到进行诉前违约惩戒的自然日数）
	PromiseLimit *int64 `json:"promise_limit,omitempty" xml:"promise_limit,omitempty"`
	// 起诉期，格式为"2019-07-31 12:00:00"
	//
	SueDate *string `json:"sue_date,omitempty" xml:"sue_date,omitempty"`
	// 当事人身份证号
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 当事人姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
}

func (s CreateTwcNotarySueBreakpromiseinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotarySueBreakpromiseinfoRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotarySueBreakpromiseinfoRequest) SetAuthToken(v string) *CreateTwcNotarySueBreakpromiseinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotarySueBreakpromiseinfoRequest) SetProductInstanceId(v string) *CreateTwcNotarySueBreakpromiseinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotarySueBreakpromiseinfoRequest) SetRegionName(v string) *CreateTwcNotarySueBreakpromiseinfoRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotarySueBreakpromiseinfoRequest) SetBreakPromiseMoney(v int64) *CreateTwcNotarySueBreakpromiseinfoRequest {
	s.BreakPromiseMoney = &v
	return s
}

func (s *CreateTwcNotarySueBreakpromiseinfoRequest) SetBusinessClass(v string) *CreateTwcNotarySueBreakpromiseinfoRequest {
	s.BusinessClass = &v
	return s
}

func (s *CreateTwcNotarySueBreakpromiseinfoRequest) SetCourtId(v string) *CreateTwcNotarySueBreakpromiseinfoRequest {
	s.CourtId = &v
	return s
}

func (s *CreateTwcNotarySueBreakpromiseinfoRequest) SetCourtName(v string) *CreateTwcNotarySueBreakpromiseinfoRequest {
	s.CourtName = &v
	return s
}

func (s *CreateTwcNotarySueBreakpromiseinfoRequest) SetEmail(v string) *CreateTwcNotarySueBreakpromiseinfoRequest {
	s.Email = &v
	return s
}

func (s *CreateTwcNotarySueBreakpromiseinfoRequest) SetInitiatorId(v string) *CreateTwcNotarySueBreakpromiseinfoRequest {
	s.InitiatorId = &v
	return s
}

func (s *CreateTwcNotarySueBreakpromiseinfoRequest) SetInitiatorName(v string) *CreateTwcNotarySueBreakpromiseinfoRequest {
	s.InitiatorName = &v
	return s
}

func (s *CreateTwcNotarySueBreakpromiseinfoRequest) SetOrderId(v string) *CreateTwcNotarySueBreakpromiseinfoRequest {
	s.OrderId = &v
	return s
}

func (s *CreateTwcNotarySueBreakpromiseinfoRequest) SetPhoneNumber(v string) *CreateTwcNotarySueBreakpromiseinfoRequest {
	s.PhoneNumber = &v
	return s
}

func (s *CreateTwcNotarySueBreakpromiseinfoRequest) SetPreSueId(v string) *CreateTwcNotarySueBreakpromiseinfoRequest {
	s.PreSueId = &v
	return s
}

func (s *CreateTwcNotarySueBreakpromiseinfoRequest) SetPromiseDate(v string) *CreateTwcNotarySueBreakpromiseinfoRequest {
	s.PromiseDate = &v
	return s
}

func (s *CreateTwcNotarySueBreakpromiseinfoRequest) SetPromiseLimit(v int64) *CreateTwcNotarySueBreakpromiseinfoRequest {
	s.PromiseLimit = &v
	return s
}

func (s *CreateTwcNotarySueBreakpromiseinfoRequest) SetSueDate(v string) *CreateTwcNotarySueBreakpromiseinfoRequest {
	s.SueDate = &v
	return s
}

func (s *CreateTwcNotarySueBreakpromiseinfoRequest) SetUserId(v string) *CreateTwcNotarySueBreakpromiseinfoRequest {
	s.UserId = &v
	return s
}

func (s *CreateTwcNotarySueBreakpromiseinfoRequest) SetUserName(v string) *CreateTwcNotarySueBreakpromiseinfoRequest {
	s.UserName = &v
	return s
}

type CreateTwcNotarySueBreakpromiseinfoResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码,0表示成功
	//
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 成功插入违约数据到区块链的交易哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s CreateTwcNotarySueBreakpromiseinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotarySueBreakpromiseinfoResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotarySueBreakpromiseinfoResponse) SetReqMsgId(v string) *CreateTwcNotarySueBreakpromiseinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotarySueBreakpromiseinfoResponse) SetResultCode(v string) *CreateTwcNotarySueBreakpromiseinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotarySueBreakpromiseinfoResponse) SetResultMsg(v string) *CreateTwcNotarySueBreakpromiseinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotarySueBreakpromiseinfoResponse) SetCode(v string) *CreateTwcNotarySueBreakpromiseinfoResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotarySueBreakpromiseinfoResponse) SetErrMessage(v string) *CreateTwcNotarySueBreakpromiseinfoResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateTwcNotarySueBreakpromiseinfoResponse) SetResponseData(v string) *CreateTwcNotarySueBreakpromiseinfoResponse {
	s.ResponseData = &v
	return s
}

type UpdateTwcNotarySueBreakpromiseinfoRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 违约金额，精确到毫厘，即123400表示12.34元
	BreakPromiseMoney *int64 `json:"break_promise_money,omitempty" xml:"break_promise_money,omitempty"`
	// 所属行业
	//
	BusinessClass *string `json:"business_class,omitempty" xml:"business_class,omitempty"`
	// 当事人电子邮箱地址
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 合同唯一标识，不可更新
	//
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 当事人手机号
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty"`
	// 诉前Id，不可更新
	//
	PreSueId *string `json:"pre_sue_id,omitempty" xml:"pre_sue_id,omitempty"`
	// 应履约日期，格式为"2019-07-31 12:00:00"
	PromiseDate *string `json:"promise_date,omitempty" xml:"promise_date,omitempty"`
	// 宽限期(天数，从应履约日期到进行诉前违约惩戒的自然日数）
	PromiseLimit *int64 `json:"promise_limit,omitempty" xml:"promise_limit,omitempty"`
	// 起诉期，格式为"2019-07-31 12:00:00"
	SueDate *string `json:"sue_date,omitempty" xml:"sue_date,omitempty"`
}

func (s UpdateTwcNotarySueBreakpromiseinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateTwcNotarySueBreakpromiseinfoRequest) GoString() string {
	return s.String()
}

func (s *UpdateTwcNotarySueBreakpromiseinfoRequest) SetAuthToken(v string) *UpdateTwcNotarySueBreakpromiseinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateTwcNotarySueBreakpromiseinfoRequest) SetProductInstanceId(v string) *UpdateTwcNotarySueBreakpromiseinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateTwcNotarySueBreakpromiseinfoRequest) SetRegionName(v string) *UpdateTwcNotarySueBreakpromiseinfoRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateTwcNotarySueBreakpromiseinfoRequest) SetBreakPromiseMoney(v int64) *UpdateTwcNotarySueBreakpromiseinfoRequest {
	s.BreakPromiseMoney = &v
	return s
}

func (s *UpdateTwcNotarySueBreakpromiseinfoRequest) SetBusinessClass(v string) *UpdateTwcNotarySueBreakpromiseinfoRequest {
	s.BusinessClass = &v
	return s
}

func (s *UpdateTwcNotarySueBreakpromiseinfoRequest) SetEmail(v string) *UpdateTwcNotarySueBreakpromiseinfoRequest {
	s.Email = &v
	return s
}

func (s *UpdateTwcNotarySueBreakpromiseinfoRequest) SetOrderId(v string) *UpdateTwcNotarySueBreakpromiseinfoRequest {
	s.OrderId = &v
	return s
}

func (s *UpdateTwcNotarySueBreakpromiseinfoRequest) SetPhoneNumber(v string) *UpdateTwcNotarySueBreakpromiseinfoRequest {
	s.PhoneNumber = &v
	return s
}

func (s *UpdateTwcNotarySueBreakpromiseinfoRequest) SetPreSueId(v string) *UpdateTwcNotarySueBreakpromiseinfoRequest {
	s.PreSueId = &v
	return s
}

func (s *UpdateTwcNotarySueBreakpromiseinfoRequest) SetPromiseDate(v string) *UpdateTwcNotarySueBreakpromiseinfoRequest {
	s.PromiseDate = &v
	return s
}

func (s *UpdateTwcNotarySueBreakpromiseinfoRequest) SetPromiseLimit(v int64) *UpdateTwcNotarySueBreakpromiseinfoRequest {
	s.PromiseLimit = &v
	return s
}

func (s *UpdateTwcNotarySueBreakpromiseinfoRequest) SetSueDate(v string) *UpdateTwcNotarySueBreakpromiseinfoRequest {
	s.SueDate = &v
	return s
}

type UpdateTwcNotarySueBreakpromiseinfoResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码,0表示成功
	//
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 违约案件信息提交对应的区块链交易哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s UpdateTwcNotarySueBreakpromiseinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateTwcNotarySueBreakpromiseinfoResponse) GoString() string {
	return s.String()
}

func (s *UpdateTwcNotarySueBreakpromiseinfoResponse) SetReqMsgId(v string) *UpdateTwcNotarySueBreakpromiseinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateTwcNotarySueBreakpromiseinfoResponse) SetResultCode(v string) *UpdateTwcNotarySueBreakpromiseinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateTwcNotarySueBreakpromiseinfoResponse) SetResultMsg(v string) *UpdateTwcNotarySueBreakpromiseinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateTwcNotarySueBreakpromiseinfoResponse) SetCode(v int64) *UpdateTwcNotarySueBreakpromiseinfoResponse {
	s.Code = &v
	return s
}

func (s *UpdateTwcNotarySueBreakpromiseinfoResponse) SetErrMessage(v string) *UpdateTwcNotarySueBreakpromiseinfoResponse {
	s.ErrMessage = &v
	return s
}

func (s *UpdateTwcNotarySueBreakpromiseinfoResponse) SetResponseData(v string) *UpdateTwcNotarySueBreakpromiseinfoResponse {
	s.ResponseData = &v
	return s
}

type DeleteTwcNotarySueBreakpromiseinfoRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 合同唯一标识，不可更新
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 诉前id，不可更新
	PreSueId *string `json:"pre_sue_id,omitempty" xml:"pre_sue_id,omitempty"`
}

func (s DeleteTwcNotarySueBreakpromiseinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteTwcNotarySueBreakpromiseinfoRequest) GoString() string {
	return s.String()
}

func (s *DeleteTwcNotarySueBreakpromiseinfoRequest) SetAuthToken(v string) *DeleteTwcNotarySueBreakpromiseinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteTwcNotarySueBreakpromiseinfoRequest) SetProductInstanceId(v string) *DeleteTwcNotarySueBreakpromiseinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteTwcNotarySueBreakpromiseinfoRequest) SetRegionName(v string) *DeleteTwcNotarySueBreakpromiseinfoRequest {
	s.RegionName = &v
	return s
}

func (s *DeleteTwcNotarySueBreakpromiseinfoRequest) SetOrderId(v string) *DeleteTwcNotarySueBreakpromiseinfoRequest {
	s.OrderId = &v
	return s
}

func (s *DeleteTwcNotarySueBreakpromiseinfoRequest) SetPreSueId(v string) *DeleteTwcNotarySueBreakpromiseinfoRequest {
	s.PreSueId = &v
	return s
}

type DeleteTwcNotarySueBreakpromiseinfoResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 违约案件信息提交对应的区块链交易哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s DeleteTwcNotarySueBreakpromiseinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteTwcNotarySueBreakpromiseinfoResponse) GoString() string {
	return s.String()
}

func (s *DeleteTwcNotarySueBreakpromiseinfoResponse) SetReqMsgId(v string) *DeleteTwcNotarySueBreakpromiseinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteTwcNotarySueBreakpromiseinfoResponse) SetResultCode(v string) *DeleteTwcNotarySueBreakpromiseinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteTwcNotarySueBreakpromiseinfoResponse) SetResultMsg(v string) *DeleteTwcNotarySueBreakpromiseinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteTwcNotarySueBreakpromiseinfoResponse) SetCode(v int64) *DeleteTwcNotarySueBreakpromiseinfoResponse {
	s.Code = &v
	return s
}

func (s *DeleteTwcNotarySueBreakpromiseinfoResponse) SetErrMessage(v string) *DeleteTwcNotarySueBreakpromiseinfoResponse {
	s.ErrMessage = &v
	return s
}

func (s *DeleteTwcNotarySueBreakpromiseinfoResponse) SetResponseData(v string) *DeleteTwcNotarySueBreakpromiseinfoResponse {
	s.ResponseData = &v
	return s
}

type QueryTwcNotarySueUserinfoRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 被查者身份证号
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s QueryTwcNotarySueUserinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotarySueUserinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryTwcNotarySueUserinfoRequest) SetAuthToken(v string) *QueryTwcNotarySueUserinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwcNotarySueUserinfoRequest) SetProductInstanceId(v string) *QueryTwcNotarySueUserinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwcNotarySueUserinfoRequest) SetRegionName(v string) *QueryTwcNotarySueUserinfoRequest {
	s.RegionName = &v
	return s
}

func (s *QueryTwcNotarySueUserinfoRequest) SetUserId(v string) *QueryTwcNotarySueUserinfoRequest {
	s.UserId = &v
	return s
}

type QueryTwcNotarySueUserinfoResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 用户违约个数
	ResponseData *int64 `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s QueryTwcNotarySueUserinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotarySueUserinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryTwcNotarySueUserinfoResponse) SetReqMsgId(v string) *QueryTwcNotarySueUserinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwcNotarySueUserinfoResponse) SetResultCode(v string) *QueryTwcNotarySueUserinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwcNotarySueUserinfoResponse) SetResultMsg(v string) *QueryTwcNotarySueUserinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwcNotarySueUserinfoResponse) SetCode(v int64) *QueryTwcNotarySueUserinfoResponse {
	s.Code = &v
	return s
}

func (s *QueryTwcNotarySueUserinfoResponse) SetErrMessage(v string) *QueryTwcNotarySueUserinfoResponse {
	s.ErrMessage = &v
	return s
}

func (s *QueryTwcNotarySueUserinfoResponse) SetResponseData(v int64) *QueryTwcNotarySueUserinfoResponse {
	s.ResponseData = &v
	return s
}

type UpdateTwcNotarySueExeplarycontractRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 合约名称
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty"`
}

func (s UpdateTwcNotarySueExeplarycontractRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateTwcNotarySueExeplarycontractRequest) GoString() string {
	return s.String()
}

func (s *UpdateTwcNotarySueExeplarycontractRequest) SetAuthToken(v string) *UpdateTwcNotarySueExeplarycontractRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateTwcNotarySueExeplarycontractRequest) SetProductInstanceId(v string) *UpdateTwcNotarySueExeplarycontractRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateTwcNotarySueExeplarycontractRequest) SetRegionName(v string) *UpdateTwcNotarySueExeplarycontractRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateTwcNotarySueExeplarycontractRequest) SetContractId(v string) *UpdateTwcNotarySueExeplarycontractRequest {
	s.ContractId = &v
	return s
}

type UpdateTwcNotarySueExeplarycontractResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 0xabcdef123324234
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s UpdateTwcNotarySueExeplarycontractResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateTwcNotarySueExeplarycontractResponse) GoString() string {
	return s.String()
}

func (s *UpdateTwcNotarySueExeplarycontractResponse) SetReqMsgId(v string) *UpdateTwcNotarySueExeplarycontractResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateTwcNotarySueExeplarycontractResponse) SetResultCode(v string) *UpdateTwcNotarySueExeplarycontractResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateTwcNotarySueExeplarycontractResponse) SetResultMsg(v string) *UpdateTwcNotarySueExeplarycontractResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateTwcNotarySueExeplarycontractResponse) SetCode(v int64) *UpdateTwcNotarySueExeplarycontractResponse {
	s.Code = &v
	return s
}

func (s *UpdateTwcNotarySueExeplarycontractResponse) SetErrMessage(v string) *UpdateTwcNotarySueExeplarycontractResponse {
	s.ErrMessage = &v
	return s
}

func (s *UpdateTwcNotarySueExeplarycontractResponse) SetResponseData(v string) *UpdateTwcNotarySueExeplarycontractResponse {
	s.ResponseData = &v
	return s
}

type UpdateTwcNotarySueExemplaryrevertRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 用户管理合约id
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty"`
}

func (s UpdateTwcNotarySueExemplaryrevertRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateTwcNotarySueExemplaryrevertRequest) GoString() string {
	return s.String()
}

func (s *UpdateTwcNotarySueExemplaryrevertRequest) SetAuthToken(v string) *UpdateTwcNotarySueExemplaryrevertRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateTwcNotarySueExemplaryrevertRequest) SetProductInstanceId(v string) *UpdateTwcNotarySueExemplaryrevertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateTwcNotarySueExemplaryrevertRequest) SetRegionName(v string) *UpdateTwcNotarySueExemplaryrevertRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateTwcNotarySueExemplaryrevertRequest) SetContractId(v string) *UpdateTwcNotarySueExemplaryrevertRequest {
	s.ContractId = &v
	return s
}

type UpdateTwcNotarySueExemplaryrevertResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 回退合约所对应的区块链交易哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s UpdateTwcNotarySueExemplaryrevertResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateTwcNotarySueExemplaryrevertResponse) GoString() string {
	return s.String()
}

func (s *UpdateTwcNotarySueExemplaryrevertResponse) SetReqMsgId(v string) *UpdateTwcNotarySueExemplaryrevertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateTwcNotarySueExemplaryrevertResponse) SetResultCode(v string) *UpdateTwcNotarySueExemplaryrevertResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateTwcNotarySueExemplaryrevertResponse) SetResultMsg(v string) *UpdateTwcNotarySueExemplaryrevertResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateTwcNotarySueExemplaryrevertResponse) SetCode(v int64) *UpdateTwcNotarySueExemplaryrevertResponse {
	s.Code = &v
	return s
}

func (s *UpdateTwcNotarySueExemplaryrevertResponse) SetErrMessage(v string) *UpdateTwcNotarySueExemplaryrevertResponse {
	s.ErrMessage = &v
	return s
}

func (s *UpdateTwcNotarySueExemplaryrevertResponse) SetResponseData(v string) *UpdateTwcNotarySueExemplaryrevertResponse {
	s.ResponseData = &v
	return s
}

type CreateTwcNotaryLeaseAuditRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
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
	LeaseId *string `json:"lease_id,omitempty" xml:"lease_id,omitempty"`
	// 融资机构审核状态，0.审核中1.审核失败2.审核成功
	ManualAudit *int64 `json:"manual_audit,omitempty" xml:"manual_audit,omitempty"`
	// 融资结构审核说明，非必填，审核失败必填失败原因
	ManualAuditComments *string `json:"manual_audit_comments,omitempty" xml:"manual_audit_comments,omitempty"`
	// 订单id 长度不可超过50
	//
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 额外通知第三方，如果需要通知相关方外的第三方，需要在此设置关联方的租户id，若不设置则只通知资方
	//
	RelatedNotify []*string `json:"related_notify,omitempty" xml:"related_notify,omitempty" type:"Repeated"`
	// 总审核的个数
	TotalAuditNumber *int64 `json:"total_audit_number,omitempty" xml:"total_audit_number,omitempty"`
}

func (s CreateTwcNotaryLeaseAuditRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseAuditRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseAuditRequest) SetAuthToken(v string) *CreateTwcNotaryLeaseAuditRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryLeaseAuditRequest) SetProductInstanceId(v string) *CreateTwcNotaryLeaseAuditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryLeaseAuditRequest) SetRegionName(v string) *CreateTwcNotaryLeaseAuditRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryLeaseAuditRequest) SetApplicationId(v string) *CreateTwcNotaryLeaseAuditRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateTwcNotaryLeaseAuditRequest) SetAsync(v int64) *CreateTwcNotaryLeaseAuditRequest {
	s.Async = &v
	return s
}

func (s *CreateTwcNotaryLeaseAuditRequest) SetBatchIndex(v string) *CreateTwcNotaryLeaseAuditRequest {
	s.BatchIndex = &v
	return s
}

func (s *CreateTwcNotaryLeaseAuditRequest) SetCurrentAuditIndex(v int64) *CreateTwcNotaryLeaseAuditRequest {
	s.CurrentAuditIndex = &v
	return s
}

func (s *CreateTwcNotaryLeaseAuditRequest) SetExtraInfo(v string) *CreateTwcNotaryLeaseAuditRequest {
	s.ExtraInfo = &v
	return s
}

func (s *CreateTwcNotaryLeaseAuditRequest) SetLeaseId(v string) *CreateTwcNotaryLeaseAuditRequest {
	s.LeaseId = &v
	return s
}

func (s *CreateTwcNotaryLeaseAuditRequest) SetManualAudit(v int64) *CreateTwcNotaryLeaseAuditRequest {
	s.ManualAudit = &v
	return s
}

func (s *CreateTwcNotaryLeaseAuditRequest) SetManualAuditComments(v string) *CreateTwcNotaryLeaseAuditRequest {
	s.ManualAuditComments = &v
	return s
}

func (s *CreateTwcNotaryLeaseAuditRequest) SetOrderId(v string) *CreateTwcNotaryLeaseAuditRequest {
	s.OrderId = &v
	return s
}

func (s *CreateTwcNotaryLeaseAuditRequest) SetRelatedNotify(v []*string) *CreateTwcNotaryLeaseAuditRequest {
	s.RelatedNotify = v
	return s
}

func (s *CreateTwcNotaryLeaseAuditRequest) SetTotalAuditNumber(v int64) *CreateTwcNotaryLeaseAuditRequest {
	s.TotalAuditNumber = &v
	return s
}

type CreateTwcNotaryLeaseAuditResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s CreateTwcNotaryLeaseAuditResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseAuditResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseAuditResponse) SetReqMsgId(v string) *CreateTwcNotaryLeaseAuditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryLeaseAuditResponse) SetResultCode(v string) *CreateTwcNotaryLeaseAuditResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryLeaseAuditResponse) SetResultMsg(v string) *CreateTwcNotaryLeaseAuditResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryLeaseAuditResponse) SetCode(v int64) *CreateTwcNotaryLeaseAuditResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryLeaseAuditResponse) SetErrMessage(v string) *CreateTwcNotaryLeaseAuditResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateTwcNotaryLeaseAuditResponse) SetResponseData(v string) *CreateTwcNotaryLeaseAuditResponse {
	s.ResponseData = &v
	return s
}

type CreateTwcNotaryLeasePaymentfileRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 融资租赁业务id，由资方控制台生成
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 是否启动订单的异步处理
	Async *int64 `json:"async,omitempty" xml:"async,omitempty"`
	// 融资租赁额外字段
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 租赁服务平台ID 长度不可超过50
	LeaseId *string `json:"lease_id,omitempty" xml:"lease_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
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

func (s CreateTwcNotaryLeasePaymentfileRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeasePaymentfileRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeasePaymentfileRequest) SetAuthToken(v string) *CreateTwcNotaryLeasePaymentfileRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryLeasePaymentfileRequest) SetProductInstanceId(v string) *CreateTwcNotaryLeasePaymentfileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryLeasePaymentfileRequest) SetRegionName(v string) *CreateTwcNotaryLeasePaymentfileRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryLeasePaymentfileRequest) SetApplicationId(v string) *CreateTwcNotaryLeasePaymentfileRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateTwcNotaryLeasePaymentfileRequest) SetAsync(v int64) *CreateTwcNotaryLeasePaymentfileRequest {
	s.Async = &v
	return s
}

func (s *CreateTwcNotaryLeasePaymentfileRequest) SetExtraInfo(v string) *CreateTwcNotaryLeasePaymentfileRequest {
	s.ExtraInfo = &v
	return s
}

func (s *CreateTwcNotaryLeasePaymentfileRequest) SetLeaseId(v string) *CreateTwcNotaryLeasePaymentfileRequest {
	s.LeaseId = &v
	return s
}

func (s *CreateTwcNotaryLeasePaymentfileRequest) SetOrderId(v string) *CreateTwcNotaryLeasePaymentfileRequest {
	s.OrderId = &v
	return s
}

func (s *CreateTwcNotaryLeasePaymentfileRequest) SetPaymentFileHash(v string) *CreateTwcNotaryLeasePaymentfileRequest {
	s.PaymentFileHash = &v
	return s
}

func (s *CreateTwcNotaryLeasePaymentfileRequest) SetPaymentFileTxHash(v string) *CreateTwcNotaryLeasePaymentfileRequest {
	s.PaymentFileTxHash = &v
	return s
}

func (s *CreateTwcNotaryLeasePaymentfileRequest) SetPaymentUrl(v string) *CreateTwcNotaryLeasePaymentfileRequest {
	s.PaymentUrl = &v
	return s
}

func (s *CreateTwcNotaryLeasePaymentfileRequest) SetRelatedNotify(v []*string) *CreateTwcNotaryLeasePaymentfileRequest {
	s.RelatedNotify = v
	return s
}

type CreateTwcNotaryLeasePaymentfileResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s CreateTwcNotaryLeasePaymentfileResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeasePaymentfileResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeasePaymentfileResponse) SetReqMsgId(v string) *CreateTwcNotaryLeasePaymentfileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryLeasePaymentfileResponse) SetResultCode(v string) *CreateTwcNotaryLeasePaymentfileResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryLeasePaymentfileResponse) SetResultMsg(v string) *CreateTwcNotaryLeasePaymentfileResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryLeasePaymentfileResponse) SetCode(v int64) *CreateTwcNotaryLeasePaymentfileResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryLeasePaymentfileResponse) SetErrMessage(v string) *CreateTwcNotaryLeasePaymentfileResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateTwcNotaryLeasePaymentfileResponse) SetResponseData(v string) *CreateTwcNotaryLeasePaymentfileResponse {
	s.ResponseData = &v
	return s
}

type CreateTwcNotaryLeaseRentalRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 融资租赁业务id，由资方控制台生成返回
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 是否启动订单的异步处理
	Async *int64 `json:"async,omitempty" xml:"async,omitempty"`
	// 手续费，如通过预授权、代扣的方式规划，必填
	Charge *int64 `json:"charge,omitempty" xml:"charge,omitempty"`
	// 融资租赁用户还款额外字段
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 是否本订单所有租金还款状态结束
	IsFinish *bool `json:"is_finish,omitempty" xml:"is_finish,omitempty"`
	// 租期编号，从1开始
	LeaseTermIndex *int64 `json:"lease_term_index,omitempty" xml:"lease_term_index,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 剩余租金总数,会核验剩余租金与承诺等额
	RemainRental *int64 `json:"remain_rental,omitempty" xml:"remain_rental,omitempty"`
	// 剩余归还期数
	RemainTerm *int64 `json:"remain_term,omitempty" xml:"remain_term,omitempty"`
	// 租金归还金额,精确到毫厘，即123400表示12.34元
	RentalMoney *int64 `json:"rental_money,omitempty" xml:"rental_money,omitempty"`
	// 租金归还状态，1.足额归还2.部分归还3.未归还
	RentalReturnState *int64 `json:"rental_return_state,omitempty" xml:"rental_return_state,omitempty"`
	// 归还时间，格式为"2019-07-31 12:00:00"
	ReturnTime *string `json:"return_time,omitempty" xml:"return_time,omitempty"`
	// 还款凭证编号，不超过128字符，1.支付宝流水号
	ReturnVoucherSerial *string `json:"return_voucher_serial,omitempty" xml:"return_voucher_serial,omitempty"`
	// 还款凭证类型，1.支付宝2.平台代收（客户主动还款）3.其他
	ReturnVoucherType *int64 `json:"return_voucher_type,omitempty" xml:"return_voucher_type,omitempty"`
	// 归还方式，1.预授权代扣2.支付宝代扣3.主动还款4.其他
	ReturnWay *int64 `json:"return_way,omitempty" xml:"return_way,omitempty"`
}

func (s CreateTwcNotaryLeaseRentalRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseRentalRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseRentalRequest) SetAuthToken(v string) *CreateTwcNotaryLeaseRentalRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryLeaseRentalRequest) SetProductInstanceId(v string) *CreateTwcNotaryLeaseRentalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryLeaseRentalRequest) SetRegionName(v string) *CreateTwcNotaryLeaseRentalRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryLeaseRentalRequest) SetApplicationId(v string) *CreateTwcNotaryLeaseRentalRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateTwcNotaryLeaseRentalRequest) SetAsync(v int64) *CreateTwcNotaryLeaseRentalRequest {
	s.Async = &v
	return s
}

func (s *CreateTwcNotaryLeaseRentalRequest) SetCharge(v int64) *CreateTwcNotaryLeaseRentalRequest {
	s.Charge = &v
	return s
}

func (s *CreateTwcNotaryLeaseRentalRequest) SetExtraInfo(v string) *CreateTwcNotaryLeaseRentalRequest {
	s.ExtraInfo = &v
	return s
}

func (s *CreateTwcNotaryLeaseRentalRequest) SetIsFinish(v bool) *CreateTwcNotaryLeaseRentalRequest {
	s.IsFinish = &v
	return s
}

func (s *CreateTwcNotaryLeaseRentalRequest) SetLeaseTermIndex(v int64) *CreateTwcNotaryLeaseRentalRequest {
	s.LeaseTermIndex = &v
	return s
}

func (s *CreateTwcNotaryLeaseRentalRequest) SetOrderId(v string) *CreateTwcNotaryLeaseRentalRequest {
	s.OrderId = &v
	return s
}

func (s *CreateTwcNotaryLeaseRentalRequest) SetRemainRental(v int64) *CreateTwcNotaryLeaseRentalRequest {
	s.RemainRental = &v
	return s
}

func (s *CreateTwcNotaryLeaseRentalRequest) SetRemainTerm(v int64) *CreateTwcNotaryLeaseRentalRequest {
	s.RemainTerm = &v
	return s
}

func (s *CreateTwcNotaryLeaseRentalRequest) SetRentalMoney(v int64) *CreateTwcNotaryLeaseRentalRequest {
	s.RentalMoney = &v
	return s
}

func (s *CreateTwcNotaryLeaseRentalRequest) SetRentalReturnState(v int64) *CreateTwcNotaryLeaseRentalRequest {
	s.RentalReturnState = &v
	return s
}

func (s *CreateTwcNotaryLeaseRentalRequest) SetReturnTime(v string) *CreateTwcNotaryLeaseRentalRequest {
	s.ReturnTime = &v
	return s
}

func (s *CreateTwcNotaryLeaseRentalRequest) SetReturnVoucherSerial(v string) *CreateTwcNotaryLeaseRentalRequest {
	s.ReturnVoucherSerial = &v
	return s
}

func (s *CreateTwcNotaryLeaseRentalRequest) SetReturnVoucherType(v int64) *CreateTwcNotaryLeaseRentalRequest {
	s.ReturnVoucherType = &v
	return s
}

func (s *CreateTwcNotaryLeaseRentalRequest) SetReturnWay(v int64) *CreateTwcNotaryLeaseRentalRequest {
	s.ReturnWay = &v
	return s
}

type CreateTwcNotaryLeaseRentalResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s CreateTwcNotaryLeaseRentalResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseRentalResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseRentalResponse) SetReqMsgId(v string) *CreateTwcNotaryLeaseRentalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryLeaseRentalResponse) SetResultCode(v string) *CreateTwcNotaryLeaseRentalResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryLeaseRentalResponse) SetResultMsg(v string) *CreateTwcNotaryLeaseRentalResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryLeaseRentalResponse) SetCode(v int64) *CreateTwcNotaryLeaseRentalResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryLeaseRentalResponse) SetErrMessage(v string) *CreateTwcNotaryLeaseRentalResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateTwcNotaryLeaseRentalResponse) SetResponseData(v string) *CreateTwcNotaryLeaseRentalResponse {
	s.ResponseData = &v
	return s
}

type CreateTwcNotaryLeaseClearingRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 融资租赁业务id，由资方控制台创建返回
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 是否启动订单的异步处理
	Async *int64 `json:"async,omitempty" xml:"async,omitempty"`
	// 清分收款账号 长度不超过64
	ClearingAccount *string `json:"clearing_account,omitempty" xml:"clearing_account,omitempty"`
	// 清分金额,精确到毫厘，即123400表示12.34元
	ClearingMoney *int64 `json:"clearing_money,omitempty" xml:"clearing_money,omitempty"`
	// 清分订单号 长度不超过128
	ClearingOrderIds []*string `json:"clearing_order_ids,omitempty" xml:"clearing_order_ids,omitempty" type:"Repeated"`
	// 清分状态,1.足额2.部分3.零
	ClearingState *int64 `json:"clearing_state,omitempty" xml:"clearing_state,omitempty"`
	// 结束时间，格式为"2019-07-31 12:00:00"
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 融资租赁额外字段
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 租赁平台商户Id 长度不可超过50
	LeaseId *string `json:"lease_id,omitempty" xml:"lease_id,omitempty"`
	// 订单id 长度不可超过50
	//
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 还款批次
	ReturnIndex *int64 `json:"return_index,omitempty" xml:"return_index,omitempty"`
	// 开始时间，格式为"2019-07-31 12:00:00"
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty"`
}

func (s CreateTwcNotaryLeaseClearingRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseClearingRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseClearingRequest) SetAuthToken(v string) *CreateTwcNotaryLeaseClearingRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryLeaseClearingRequest) SetProductInstanceId(v string) *CreateTwcNotaryLeaseClearingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryLeaseClearingRequest) SetRegionName(v string) *CreateTwcNotaryLeaseClearingRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryLeaseClearingRequest) SetApplicationId(v string) *CreateTwcNotaryLeaseClearingRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateTwcNotaryLeaseClearingRequest) SetAsync(v int64) *CreateTwcNotaryLeaseClearingRequest {
	s.Async = &v
	return s
}

func (s *CreateTwcNotaryLeaseClearingRequest) SetClearingAccount(v string) *CreateTwcNotaryLeaseClearingRequest {
	s.ClearingAccount = &v
	return s
}

func (s *CreateTwcNotaryLeaseClearingRequest) SetClearingMoney(v int64) *CreateTwcNotaryLeaseClearingRequest {
	s.ClearingMoney = &v
	return s
}

func (s *CreateTwcNotaryLeaseClearingRequest) SetClearingOrderIds(v []*string) *CreateTwcNotaryLeaseClearingRequest {
	s.ClearingOrderIds = v
	return s
}

func (s *CreateTwcNotaryLeaseClearingRequest) SetClearingState(v int64) *CreateTwcNotaryLeaseClearingRequest {
	s.ClearingState = &v
	return s
}

func (s *CreateTwcNotaryLeaseClearingRequest) SetEndTime(v string) *CreateTwcNotaryLeaseClearingRequest {
	s.EndTime = &v
	return s
}

func (s *CreateTwcNotaryLeaseClearingRequest) SetExtraInfo(v string) *CreateTwcNotaryLeaseClearingRequest {
	s.ExtraInfo = &v
	return s
}

func (s *CreateTwcNotaryLeaseClearingRequest) SetLeaseId(v string) *CreateTwcNotaryLeaseClearingRequest {
	s.LeaseId = &v
	return s
}

func (s *CreateTwcNotaryLeaseClearingRequest) SetOrderId(v string) *CreateTwcNotaryLeaseClearingRequest {
	s.OrderId = &v
	return s
}

func (s *CreateTwcNotaryLeaseClearingRequest) SetReturnIndex(v int64) *CreateTwcNotaryLeaseClearingRequest {
	s.ReturnIndex = &v
	return s
}

func (s *CreateTwcNotaryLeaseClearingRequest) SetStartTime(v string) *CreateTwcNotaryLeaseClearingRequest {
	s.StartTime = &v
	return s
}

type CreateTwcNotaryLeaseClearingResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s CreateTwcNotaryLeaseClearingResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseClearingResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseClearingResponse) SetReqMsgId(v string) *CreateTwcNotaryLeaseClearingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryLeaseClearingResponse) SetResultCode(v string) *CreateTwcNotaryLeaseClearingResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryLeaseClearingResponse) SetResultMsg(v string) *CreateTwcNotaryLeaseClearingResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryLeaseClearingResponse) SetCode(v int64) *CreateTwcNotaryLeaseClearingResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryLeaseClearingResponse) SetErrMessage(v string) *CreateTwcNotaryLeaseClearingResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateTwcNotaryLeaseClearingResponse) SetResponseData(v string) *CreateTwcNotaryLeaseClearingResponse {
	s.ResponseData = &v
	return s
}

type CreateTwcNotaryLeaseRepaymentRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 融资租赁业务id，由资方控制台生成返回
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 是否启动订单的异步处理
	Async *int64 `json:"async,omitempty" xml:"async,omitempty"`
	// 融资租赁租户还款额外字段
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 是否最终订单还款结束
	IsFinish *bool `json:"is_finish,omitempty" xml:"is_finish,omitempty"`
	// 租赁平台商户Id 长度不可超过50
	LeaseId *string `json:"lease_id,omitempty" xml:"lease_id,omitempty"`
	// 订单id 长度不可超过50
	//
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 逾期天数,支用到期日开始计算
	OverdueDay *int64 `json:"overdue_day,omitempty" xml:"overdue_day,omitempty"`
	// 逾期应还款总额,本金+利息+逾期利息,精确到毫厘，即123400表示12.34元
	OverdueMoney *int64 `json:"overdue_money,omitempty" xml:"overdue_money,omitempty"`
	// 逾期利率（日利率）,精确到小数点后四位 12.34% 表示为1234
	OverdueRate *int64 `json:"overdue_rate,omitempty" xml:"overdue_rate,omitempty"`
	// 逾期状态,暂时都以0处理，目前不处理
	OverdueStatus *int64 `json:"overdue_status,omitempty" xml:"overdue_status,omitempty"`
	// 剩余应还金额，精确到毫厘，即123400表示12.34元
	RemainReturnMoney *int64 `json:"remain_return_money,omitempty" xml:"remain_return_money,omitempty"`
	// 剩余应还期数
	//
	RemainReturnTerm *int64 `json:"remain_return_term,omitempty" xml:"remain_return_term,omitempty"`
	// 每次还款流水凭证，需要融资方确认，id一样则不处理
	RepaymentUniqueId *string `json:"repayment_unique_id,omitempty" xml:"repayment_unique_id,omitempty"`
	// 还款结果简要描述,长度不超过256
	ReturnDescription *string `json:"return_description,omitempty" xml:"return_description,omitempty"`
	// 还款批次
	//
	ReturnIndex *int64 `json:"return_index,omitempty" xml:"return_index,omitempty"`
	// 还款总额,本金+利息，精确到毫厘，即123400表示12.34元
	ReturnMoney *int64 `json:"return_money,omitempty" xml:"return_money,omitempty"`
	// 还款结果状态,1.成功 2.失败
	ReturnStatus *int64 `json:"return_status,omitempty" xml:"return_status,omitempty"`
	// 还款日期，格式为"2019-07-31 12:00:00"
	ReturnTime *string `json:"return_time,omitempty" xml:"return_time,omitempty"`
	// 还款来源,1.共管账号，2.网商清分
	Source *int64 `json:"source,omitempty" xml:"source,omitempty"`
	// 逾期后还款状态,1未还款,2已还款
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
}

func (s CreateTwcNotaryLeaseRepaymentRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseRepaymentRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseRepaymentRequest) SetAuthToken(v string) *CreateTwcNotaryLeaseRepaymentRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentRequest) SetProductInstanceId(v string) *CreateTwcNotaryLeaseRepaymentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentRequest) SetRegionName(v string) *CreateTwcNotaryLeaseRepaymentRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentRequest) SetApplicationId(v string) *CreateTwcNotaryLeaseRepaymentRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentRequest) SetAsync(v int64) *CreateTwcNotaryLeaseRepaymentRequest {
	s.Async = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentRequest) SetExtraInfo(v string) *CreateTwcNotaryLeaseRepaymentRequest {
	s.ExtraInfo = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentRequest) SetIsFinish(v bool) *CreateTwcNotaryLeaseRepaymentRequest {
	s.IsFinish = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentRequest) SetLeaseId(v string) *CreateTwcNotaryLeaseRepaymentRequest {
	s.LeaseId = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentRequest) SetOrderId(v string) *CreateTwcNotaryLeaseRepaymentRequest {
	s.OrderId = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentRequest) SetOverdueDay(v int64) *CreateTwcNotaryLeaseRepaymentRequest {
	s.OverdueDay = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentRequest) SetOverdueMoney(v int64) *CreateTwcNotaryLeaseRepaymentRequest {
	s.OverdueMoney = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentRequest) SetOverdueRate(v int64) *CreateTwcNotaryLeaseRepaymentRequest {
	s.OverdueRate = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentRequest) SetOverdueStatus(v int64) *CreateTwcNotaryLeaseRepaymentRequest {
	s.OverdueStatus = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentRequest) SetRemainReturnMoney(v int64) *CreateTwcNotaryLeaseRepaymentRequest {
	s.RemainReturnMoney = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentRequest) SetRemainReturnTerm(v int64) *CreateTwcNotaryLeaseRepaymentRequest {
	s.RemainReturnTerm = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentRequest) SetRepaymentUniqueId(v string) *CreateTwcNotaryLeaseRepaymentRequest {
	s.RepaymentUniqueId = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentRequest) SetReturnDescription(v string) *CreateTwcNotaryLeaseRepaymentRequest {
	s.ReturnDescription = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentRequest) SetReturnIndex(v int64) *CreateTwcNotaryLeaseRepaymentRequest {
	s.ReturnIndex = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentRequest) SetReturnMoney(v int64) *CreateTwcNotaryLeaseRepaymentRequest {
	s.ReturnMoney = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentRequest) SetReturnStatus(v int64) *CreateTwcNotaryLeaseRepaymentRequest {
	s.ReturnStatus = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentRequest) SetReturnTime(v string) *CreateTwcNotaryLeaseRepaymentRequest {
	s.ReturnTime = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentRequest) SetSource(v int64) *CreateTwcNotaryLeaseRepaymentRequest {
	s.Source = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentRequest) SetStatus(v int64) *CreateTwcNotaryLeaseRepaymentRequest {
	s.Status = &v
	return s
}

type CreateTwcNotaryLeaseRepaymentResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 融资租赁金融机构上传还款信息链上交易哈希值
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s CreateTwcNotaryLeaseRepaymentResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseRepaymentResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseRepaymentResponse) SetReqMsgId(v string) *CreateTwcNotaryLeaseRepaymentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentResponse) SetResultCode(v string) *CreateTwcNotaryLeaseRepaymentResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentResponse) SetResultMsg(v string) *CreateTwcNotaryLeaseRepaymentResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentResponse) SetCode(v int64) *CreateTwcNotaryLeaseRepaymentResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentResponse) SetErrMessage(v string) *CreateTwcNotaryLeaseRepaymentResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateTwcNotaryLeaseRepaymentResponse) SetResponseData(v string) *CreateTwcNotaryLeaseRepaymentResponse {
	s.ResponseData = &v
	return s
}

type CreateTwcNotaryLeaseNotifyregisterRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
}

func (s CreateTwcNotaryLeaseNotifyregisterRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseNotifyregisterRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseNotifyregisterRequest) SetAuthToken(v string) *CreateTwcNotaryLeaseNotifyregisterRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryLeaseNotifyregisterRequest) SetProductInstanceId(v string) *CreateTwcNotaryLeaseNotifyregisterRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryLeaseNotifyregisterRequest) SetRegionName(v string) *CreateTwcNotaryLeaseNotifyregisterRequest {
	s.RegionName = &v
	return s
}

type CreateTwcNotaryLeaseNotifyregisterResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
}

func (s CreateTwcNotaryLeaseNotifyregisterResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseNotifyregisterResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseNotifyregisterResponse) SetReqMsgId(v string) *CreateTwcNotaryLeaseNotifyregisterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryLeaseNotifyregisterResponse) SetResultCode(v string) *CreateTwcNotaryLeaseNotifyregisterResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryLeaseNotifyregisterResponse) SetResultMsg(v string) *CreateTwcNotaryLeaseNotifyregisterResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryLeaseNotifyregisterResponse) SetCode(v int64) *CreateTwcNotaryLeaseNotifyregisterResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryLeaseNotifyregisterResponse) SetErrMessage(v string) *CreateTwcNotaryLeaseNotifyregisterResponse {
	s.ErrMessage = &v
	return s
}

type QueryTwcNotaryLeaseIotinfoRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 查询截止时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 设备唯一id imei id
	ProductImeiId *string `json:"product_imei_id,omitempty" xml:"product_imei_id,omitempty"`
	// 查询开启时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty"`
}

func (s QueryTwcNotaryLeaseIotinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryLeaseIotinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryLeaseIotinfoRequest) SetAuthToken(v string) *QueryTwcNotaryLeaseIotinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwcNotaryLeaseIotinfoRequest) SetProductInstanceId(v string) *QueryTwcNotaryLeaseIotinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwcNotaryLeaseIotinfoRequest) SetRegionName(v string) *QueryTwcNotaryLeaseIotinfoRequest {
	s.RegionName = &v
	return s
}

func (s *QueryTwcNotaryLeaseIotinfoRequest) SetEndTime(v string) *QueryTwcNotaryLeaseIotinfoRequest {
	s.EndTime = &v
	return s
}

func (s *QueryTwcNotaryLeaseIotinfoRequest) SetProductImeiId(v string) *QueryTwcNotaryLeaseIotinfoRequest {
	s.ProductImeiId = &v
	return s
}

func (s *QueryTwcNotaryLeaseIotinfoRequest) SetStartTime(v string) *QueryTwcNotaryLeaseIotinfoRequest {
	s.StartTime = &v
	return s
}

type QueryTwcNotaryLeaseIotinfoResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// ""
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 设备详情
	LeaseIotItemInfo []*LeaseIotItemInfo `json:"lease_iot_item_info,omitempty" xml:"lease_iot_item_info,omitempty" type:"Repeated"`
}

func (s QueryTwcNotaryLeaseIotinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryLeaseIotinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryLeaseIotinfoResponse) SetReqMsgId(v string) *QueryTwcNotaryLeaseIotinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwcNotaryLeaseIotinfoResponse) SetResultCode(v string) *QueryTwcNotaryLeaseIotinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwcNotaryLeaseIotinfoResponse) SetResultMsg(v string) *QueryTwcNotaryLeaseIotinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwcNotaryLeaseIotinfoResponse) SetCode(v int64) *QueryTwcNotaryLeaseIotinfoResponse {
	s.Code = &v
	return s
}

func (s *QueryTwcNotaryLeaseIotinfoResponse) SetErrMessage(v string) *QueryTwcNotaryLeaseIotinfoResponse {
	s.ErrMessage = &v
	return s
}

func (s *QueryTwcNotaryLeaseIotinfoResponse) SetLeaseIotItemInfo(v []*LeaseIotItemInfo) *QueryTwcNotaryLeaseIotinfoResponse {
	s.LeaseIotItemInfo = v
	return s
}

type CreateTwcNotaryCourtTextnotaryRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
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
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 文本数据
	TextContent *string `json:"text_content,omitempty" xml:"text_content,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 是否使用可信时间戳
	Tsr *bool `json:"tsr,omitempty" xml:"tsr,omitempty"`
}

func (s CreateTwcNotaryCourtTextnotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryCourtTextnotaryRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryCourtTextnotaryRequest) SetAuthToken(v string) *CreateTwcNotaryCourtTextnotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryCourtTextnotaryRequest) SetProductInstanceId(v string) *CreateTwcNotaryCourtTextnotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryCourtTextnotaryRequest) SetRegionName(v string) *CreateTwcNotaryCourtTextnotaryRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryCourtTextnotaryRequest) SetAgencyCode(v string) *CreateTwcNotaryCourtTextnotaryRequest {
	s.AgencyCode = &v
	return s
}

func (s *CreateTwcNotaryCourtTextnotaryRequest) SetApplicationCode(v string) *CreateTwcNotaryCourtTextnotaryRequest {
	s.ApplicationCode = &v
	return s
}

func (s *CreateTwcNotaryCourtTextnotaryRequest) SetBusinessType(v string) *CreateTwcNotaryCourtTextnotaryRequest {
	s.BusinessType = &v
	return s
}

func (s *CreateTwcNotaryCourtTextnotaryRequest) SetDataType(v string) *CreateTwcNotaryCourtTextnotaryRequest {
	s.DataType = &v
	return s
}

func (s *CreateTwcNotaryCourtTextnotaryRequest) SetLocation(v *Location) *CreateTwcNotaryCourtTextnotaryRequest {
	s.Location = v
	return s
}

func (s *CreateTwcNotaryCourtTextnotaryRequest) SetPhase(v string) *CreateTwcNotaryCourtTextnotaryRequest {
	s.Phase = &v
	return s
}

func (s *CreateTwcNotaryCourtTextnotaryRequest) SetProperties(v string) *CreateTwcNotaryCourtTextnotaryRequest {
	s.Properties = &v
	return s
}

func (s *CreateTwcNotaryCourtTextnotaryRequest) SetTextContent(v string) *CreateTwcNotaryCourtTextnotaryRequest {
	s.TextContent = &v
	return s
}

func (s *CreateTwcNotaryCourtTextnotaryRequest) SetTransactionId(v string) *CreateTwcNotaryCourtTextnotaryRequest {
	s.TransactionId = &v
	return s
}

func (s *CreateTwcNotaryCourtTextnotaryRequest) SetTsr(v bool) *CreateTwcNotaryCourtTextnotaryRequest {
	s.Tsr = &v
	return s
}

type CreateTwcNotaryCourtTextnotaryResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 可信时间戳
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateTwcNotaryCourtTextnotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryCourtTextnotaryResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryCourtTextnotaryResponse) SetReqMsgId(v string) *CreateTwcNotaryCourtTextnotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryCourtTextnotaryResponse) SetResultCode(v string) *CreateTwcNotaryCourtTextnotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryCourtTextnotaryResponse) SetResultMsg(v string) *CreateTwcNotaryCourtTextnotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryCourtTextnotaryResponse) SetTsr(v *TsrResponse) *CreateTwcNotaryCourtTextnotaryResponse {
	s.Tsr = v
	return s
}

func (s *CreateTwcNotaryCourtTextnotaryResponse) SetTxHash(v string) *CreateTwcNotaryCourtTextnotaryResponse {
	s.TxHash = &v
	return s
}

type GetTwcNotaryCourtTextnotaryRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 地理位置信息
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 存证阶段
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s GetTwcNotaryCourtTextnotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTwcNotaryCourtTextnotaryRequest) GoString() string {
	return s.String()
}

func (s *GetTwcNotaryCourtTextnotaryRequest) SetAuthToken(v string) *GetTwcNotaryCourtTextnotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTwcNotaryCourtTextnotaryRequest) SetProductInstanceId(v string) *GetTwcNotaryCourtTextnotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTwcNotaryCourtTextnotaryRequest) SetRegionName(v string) *GetTwcNotaryCourtTextnotaryRequest {
	s.RegionName = &v
	return s
}

func (s *GetTwcNotaryCourtTextnotaryRequest) SetLocation(v *Location) *GetTwcNotaryCourtTextnotaryRequest {
	s.Location = v
	return s
}

func (s *GetTwcNotaryCourtTextnotaryRequest) SetPhase(v string) *GetTwcNotaryCourtTextnotaryRequest {
	s.Phase = &v
	return s
}

func (s *GetTwcNotaryCourtTextnotaryRequest) SetProperties(v string) *GetTwcNotaryCourtTextnotaryRequest {
	s.Properties = &v
	return s
}

func (s *GetTwcNotaryCourtTextnotaryRequest) SetTransactionId(v string) *GetTwcNotaryCourtTextnotaryRequest {
	s.TransactionId = &v
	return s
}

func (s *GetTwcNotaryCourtTextnotaryRequest) SetTxHash(v string) *GetTwcNotaryCourtTextnotaryRequest {
	s.TxHash = &v
	return s
}

type GetTwcNotaryCourtTextnotaryResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 对应的法院编号
	AgencyCode *string `json:"agency_code,omitempty" xml:"agency_code,omitempty"`
	// 对应的法院应用ID
	ApplicationCode *string `json:"application_code,omitempty" xml:"application_code,omitempty"`
	// 业务类型标识
	BusinessType *string `json:"business_type,omitempty" xml:"business_type,omitempty"`
	// 数据类型标识
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty"`
	// 文本数据
	TextContent *string `json:"text_content,omitempty" xml:"text_content,omitempty"`
	// 可信时间戳
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
}

func (s GetTwcNotaryCourtTextnotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTwcNotaryCourtTextnotaryResponse) GoString() string {
	return s.String()
}

func (s *GetTwcNotaryCourtTextnotaryResponse) SetReqMsgId(v string) *GetTwcNotaryCourtTextnotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTwcNotaryCourtTextnotaryResponse) SetResultCode(v string) *GetTwcNotaryCourtTextnotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTwcNotaryCourtTextnotaryResponse) SetResultMsg(v string) *GetTwcNotaryCourtTextnotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTwcNotaryCourtTextnotaryResponse) SetAgencyCode(v string) *GetTwcNotaryCourtTextnotaryResponse {
	s.AgencyCode = &v
	return s
}

func (s *GetTwcNotaryCourtTextnotaryResponse) SetApplicationCode(v string) *GetTwcNotaryCourtTextnotaryResponse {
	s.ApplicationCode = &v
	return s
}

func (s *GetTwcNotaryCourtTextnotaryResponse) SetBusinessType(v string) *GetTwcNotaryCourtTextnotaryResponse {
	s.BusinessType = &v
	return s
}

func (s *GetTwcNotaryCourtTextnotaryResponse) SetDataType(v string) *GetTwcNotaryCourtTextnotaryResponse {
	s.DataType = &v
	return s
}

func (s *GetTwcNotaryCourtTextnotaryResponse) SetTextContent(v string) *GetTwcNotaryCourtTextnotaryResponse {
	s.TextContent = &v
	return s
}

func (s *GetTwcNotaryCourtTextnotaryResponse) SetTsr(v *TsrResponse) *GetTwcNotaryCourtTextnotaryResponse {
	s.Tsr = v
	return s
}

type CreateTwcNotaryCourtFilenotaryRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 对应的法院编号
	AgencyCode *string `json:"agency_code,omitempty" xml:"agency_code,omitempty"`
	// 对应的法院应用ID
	ApplicationCode *string `json:"application_code,omitempty" xml:"application_code,omitempty"`
	// 业务类型标识
	BusinessType *string `json:"business_type,omitempty" xml:"business_type,omitempty"`
	// 数据类型标识
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty"`
	// 文件哈希
	FileHash *string `json:"file_hash,omitempty" xml:"file_hash,omitempty"`
	// 文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// 哈希算法，目前仅支持SHA256
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty"`
	// 地理位置信息
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 存证阶段
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 是否使用可信时间戳
	Tsr *bool `json:"tsr,omitempty" xml:"tsr,omitempty"`
}

func (s CreateTwcNotaryCourtFilenotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryCourtFilenotaryRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryCourtFilenotaryRequest) SetAuthToken(v string) *CreateTwcNotaryCourtFilenotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryCourtFilenotaryRequest) SetProductInstanceId(v string) *CreateTwcNotaryCourtFilenotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryCourtFilenotaryRequest) SetRegionName(v string) *CreateTwcNotaryCourtFilenotaryRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryCourtFilenotaryRequest) SetAgencyCode(v string) *CreateTwcNotaryCourtFilenotaryRequest {
	s.AgencyCode = &v
	return s
}

func (s *CreateTwcNotaryCourtFilenotaryRequest) SetApplicationCode(v string) *CreateTwcNotaryCourtFilenotaryRequest {
	s.ApplicationCode = &v
	return s
}

func (s *CreateTwcNotaryCourtFilenotaryRequest) SetBusinessType(v string) *CreateTwcNotaryCourtFilenotaryRequest {
	s.BusinessType = &v
	return s
}

func (s *CreateTwcNotaryCourtFilenotaryRequest) SetDataType(v string) *CreateTwcNotaryCourtFilenotaryRequest {
	s.DataType = &v
	return s
}

func (s *CreateTwcNotaryCourtFilenotaryRequest) SetFileHash(v string) *CreateTwcNotaryCourtFilenotaryRequest {
	s.FileHash = &v
	return s
}

func (s *CreateTwcNotaryCourtFilenotaryRequest) SetFileName(v string) *CreateTwcNotaryCourtFilenotaryRequest {
	s.FileName = &v
	return s
}

func (s *CreateTwcNotaryCourtFilenotaryRequest) SetHashAlgorithm(v string) *CreateTwcNotaryCourtFilenotaryRequest {
	s.HashAlgorithm = &v
	return s
}

func (s *CreateTwcNotaryCourtFilenotaryRequest) SetLocation(v *Location) *CreateTwcNotaryCourtFilenotaryRequest {
	s.Location = v
	return s
}

func (s *CreateTwcNotaryCourtFilenotaryRequest) SetPhase(v string) *CreateTwcNotaryCourtFilenotaryRequest {
	s.Phase = &v
	return s
}

func (s *CreateTwcNotaryCourtFilenotaryRequest) SetProperties(v string) *CreateTwcNotaryCourtFilenotaryRequest {
	s.Properties = &v
	return s
}

func (s *CreateTwcNotaryCourtFilenotaryRequest) SetTransactionId(v string) *CreateTwcNotaryCourtFilenotaryRequest {
	s.TransactionId = &v
	return s
}

func (s *CreateTwcNotaryCourtFilenotaryRequest) SetTsr(v bool) *CreateTwcNotaryCourtFilenotaryRequest {
	s.Tsr = &v
	return s
}

type CreateTwcNotaryCourtFilenotaryResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 可信时间戳
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateTwcNotaryCourtFilenotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryCourtFilenotaryResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryCourtFilenotaryResponse) SetReqMsgId(v string) *CreateTwcNotaryCourtFilenotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryCourtFilenotaryResponse) SetResultCode(v string) *CreateTwcNotaryCourtFilenotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryCourtFilenotaryResponse) SetResultMsg(v string) *CreateTwcNotaryCourtFilenotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryCourtFilenotaryResponse) SetTsr(v *TsrResponse) *CreateTwcNotaryCourtFilenotaryResponse {
	s.Tsr = v
	return s
}

func (s *CreateTwcNotaryCourtFilenotaryResponse) SetTxHash(v string) *CreateTwcNotaryCourtFilenotaryResponse {
	s.TxHash = &v
	return s
}

type GetTwcNotaryCourtFilenotaryRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 地理位置信息
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 存证阶段
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s GetTwcNotaryCourtFilenotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTwcNotaryCourtFilenotaryRequest) GoString() string {
	return s.String()
}

func (s *GetTwcNotaryCourtFilenotaryRequest) SetAuthToken(v string) *GetTwcNotaryCourtFilenotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTwcNotaryCourtFilenotaryRequest) SetProductInstanceId(v string) *GetTwcNotaryCourtFilenotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTwcNotaryCourtFilenotaryRequest) SetRegionName(v string) *GetTwcNotaryCourtFilenotaryRequest {
	s.RegionName = &v
	return s
}

func (s *GetTwcNotaryCourtFilenotaryRequest) SetLocation(v *Location) *GetTwcNotaryCourtFilenotaryRequest {
	s.Location = v
	return s
}

func (s *GetTwcNotaryCourtFilenotaryRequest) SetPhase(v string) *GetTwcNotaryCourtFilenotaryRequest {
	s.Phase = &v
	return s
}

func (s *GetTwcNotaryCourtFilenotaryRequest) SetProperties(v string) *GetTwcNotaryCourtFilenotaryRequest {
	s.Properties = &v
	return s
}

func (s *GetTwcNotaryCourtFilenotaryRequest) SetTransactionId(v string) *GetTwcNotaryCourtFilenotaryRequest {
	s.TransactionId = &v
	return s
}

func (s *GetTwcNotaryCourtFilenotaryRequest) SetTxHash(v string) *GetTwcNotaryCourtFilenotaryRequest {
	s.TxHash = &v
	return s
}

type GetTwcNotaryCourtFilenotaryResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 对应的法院编号
	AgencyCode *string `json:"agency_code,omitempty" xml:"agency_code,omitempty"`
	// 对应的法院应用ID
	ApplicationCode *string `json:"application_code,omitempty" xml:"application_code,omitempty"`
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
}

func (s GetTwcNotaryCourtFilenotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTwcNotaryCourtFilenotaryResponse) GoString() string {
	return s.String()
}

func (s *GetTwcNotaryCourtFilenotaryResponse) SetReqMsgId(v string) *GetTwcNotaryCourtFilenotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTwcNotaryCourtFilenotaryResponse) SetResultCode(v string) *GetTwcNotaryCourtFilenotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTwcNotaryCourtFilenotaryResponse) SetResultMsg(v string) *GetTwcNotaryCourtFilenotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTwcNotaryCourtFilenotaryResponse) SetAgencyCode(v string) *GetTwcNotaryCourtFilenotaryResponse {
	s.AgencyCode = &v
	return s
}

func (s *GetTwcNotaryCourtFilenotaryResponse) SetApplicationCode(v string) *GetTwcNotaryCourtFilenotaryResponse {
	s.ApplicationCode = &v
	return s
}

func (s *GetTwcNotaryCourtFilenotaryResponse) SetBusinessType(v string) *GetTwcNotaryCourtFilenotaryResponse {
	s.BusinessType = &v
	return s
}

func (s *GetTwcNotaryCourtFilenotaryResponse) SetDataType(v string) *GetTwcNotaryCourtFilenotaryResponse {
	s.DataType = &v
	return s
}

func (s *GetTwcNotaryCourtFilenotaryResponse) SetFileHash(v string) *GetTwcNotaryCourtFilenotaryResponse {
	s.FileHash = &v
	return s
}

func (s *GetTwcNotaryCourtFilenotaryResponse) SetFileName(v string) *GetTwcNotaryCourtFilenotaryResponse {
	s.FileName = &v
	return s
}

func (s *GetTwcNotaryCourtFilenotaryResponse) SetTsr(v *TsrResponse) *GetTwcNotaryCourtFilenotaryResponse {
	s.Tsr = v
	return s
}

type CreateTwcNotaryLeaseRouteRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 具体业务字段，json形式
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
	// 方法名
	Route *string `json:"route,omitempty" xml:"route,omitempty"`
}

func (s CreateTwcNotaryLeaseRouteRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseRouteRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseRouteRequest) SetAuthToken(v string) *CreateTwcNotaryLeaseRouteRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryLeaseRouteRequest) SetProductInstanceId(v string) *CreateTwcNotaryLeaseRouteRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryLeaseRouteRequest) SetRegionName(v string) *CreateTwcNotaryLeaseRouteRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryLeaseRouteRequest) SetBizContent(v string) *CreateTwcNotaryLeaseRouteRequest {
	s.BizContent = &v
	return s
}

func (s *CreateTwcNotaryLeaseRouteRequest) SetRoute(v string) *CreateTwcNotaryLeaseRouteRequest {
	s.Route = &v
	return s
}

type CreateTwcNotaryLeaseRouteResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
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

func (s CreateTwcNotaryLeaseRouteResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseRouteResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseRouteResponse) SetReqMsgId(v string) *CreateTwcNotaryLeaseRouteResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryLeaseRouteResponse) SetResultCode(v string) *CreateTwcNotaryLeaseRouteResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryLeaseRouteResponse) SetResultMsg(v string) *CreateTwcNotaryLeaseRouteResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryLeaseRouteResponse) SetCode(v int64) *CreateTwcNotaryLeaseRouteResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryLeaseRouteResponse) SetErrMessage(v string) *CreateTwcNotaryLeaseRouteResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateTwcNotaryLeaseRouteResponse) SetResponseData(v string) *CreateTwcNotaryLeaseRouteResponse {
	s.ResponseData = &v
	return s
}

type QueryTwcNotaryLeaseEncryptedinfoRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 融资租赁业务id，由资方控制台创建返回
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 被查询的租赁公司对应的租户ID
	LeaseId *string `json:"lease_id,omitempty" xml:"lease_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
}

func (s QueryTwcNotaryLeaseEncryptedinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryLeaseEncryptedinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryLeaseEncryptedinfoRequest) SetAuthToken(v string) *QueryTwcNotaryLeaseEncryptedinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwcNotaryLeaseEncryptedinfoRequest) SetProductInstanceId(v string) *QueryTwcNotaryLeaseEncryptedinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwcNotaryLeaseEncryptedinfoRequest) SetRegionName(v string) *QueryTwcNotaryLeaseEncryptedinfoRequest {
	s.RegionName = &v
	return s
}

func (s *QueryTwcNotaryLeaseEncryptedinfoRequest) SetApplicationId(v string) *QueryTwcNotaryLeaseEncryptedinfoRequest {
	s.ApplicationId = &v
	return s
}

func (s *QueryTwcNotaryLeaseEncryptedinfoRequest) SetLeaseId(v string) *QueryTwcNotaryLeaseEncryptedinfoRequest {
	s.LeaseId = &v
	return s
}

func (s *QueryTwcNotaryLeaseEncryptedinfoRequest) SetOrderId(v string) *QueryTwcNotaryLeaseEncryptedinfoRequest {
	s.OrderId = &v
	return s
}

type QueryTwcNotaryLeaseEncryptedinfoResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误描述信息
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 对应的加密后的具体信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s QueryTwcNotaryLeaseEncryptedinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryLeaseEncryptedinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryLeaseEncryptedinfoResponse) SetReqMsgId(v string) *QueryTwcNotaryLeaseEncryptedinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwcNotaryLeaseEncryptedinfoResponse) SetResultCode(v string) *QueryTwcNotaryLeaseEncryptedinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwcNotaryLeaseEncryptedinfoResponse) SetResultMsg(v string) *QueryTwcNotaryLeaseEncryptedinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwcNotaryLeaseEncryptedinfoResponse) SetCode(v int64) *QueryTwcNotaryLeaseEncryptedinfoResponse {
	s.Code = &v
	return s
}

func (s *QueryTwcNotaryLeaseEncryptedinfoResponse) SetErrMessage(v string) *QueryTwcNotaryLeaseEncryptedinfoResponse {
	s.ErrMessage = &v
	return s
}

func (s *QueryTwcNotaryLeaseEncryptedinfoResponse) SetResponseData(v string) *QueryTwcNotaryLeaseEncryptedinfoResponse {
	s.ResponseData = &v
	return s
}

type CreateTwcNotaryContractTextRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 签署结束信息，phase为FINISH时必选
	FinishInfo *ContractNotaryFinishInfo `json:"finish_info,omitempty" xml:"finish_info,omitempty"`
	// 签署流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 签署发起信息，phase为INIT时必选
	InitInfo *ContractNotaryInitInfo `json:"init_info,omitempty" xml:"init_info,omitempty"`
	// 存证阶段，分为INIT(发起)，SIGN(签署)，FINISH(结束)
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 签署过程信息，phase为SIGN时必选
	SignInfo *ContractNotarySignInfo `json:"sign_info,omitempty" xml:"sign_info,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
}

func (s CreateTwcNotaryContractTextRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractTextRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractTextRequest) SetAuthToken(v string) *CreateTwcNotaryContractTextRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryContractTextRequest) SetProductInstanceId(v string) *CreateTwcNotaryContractTextRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryContractTextRequest) SetRegionName(v string) *CreateTwcNotaryContractTextRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryContractTextRequest) SetFinishInfo(v *ContractNotaryFinishInfo) *CreateTwcNotaryContractTextRequest {
	s.FinishInfo = v
	return s
}

func (s *CreateTwcNotaryContractTextRequest) SetFlowId(v string) *CreateTwcNotaryContractTextRequest {
	s.FlowId = &v
	return s
}

func (s *CreateTwcNotaryContractTextRequest) SetInitInfo(v *ContractNotaryInitInfo) *CreateTwcNotaryContractTextRequest {
	s.InitInfo = v
	return s
}

func (s *CreateTwcNotaryContractTextRequest) SetPhase(v string) *CreateTwcNotaryContractTextRequest {
	s.Phase = &v
	return s
}

func (s *CreateTwcNotaryContractTextRequest) SetSignInfo(v *ContractNotarySignInfo) *CreateTwcNotaryContractTextRequest {
	s.SignInfo = v
	return s
}

func (s *CreateTwcNotaryContractTextRequest) SetTransactionId(v string) *CreateTwcNotaryContractTextRequest {
	s.TransactionId = &v
	return s
}

type CreateTwcNotaryContractTextResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证凭据
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateTwcNotaryContractTextResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryContractTextResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryContractTextResponse) SetReqMsgId(v string) *CreateTwcNotaryContractTextResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryContractTextResponse) SetResultCode(v string) *CreateTwcNotaryContractTextResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryContractTextResponse) SetResultMsg(v string) *CreateTwcNotaryContractTextResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryContractTextResponse) SetTxHash(v string) *CreateTwcNotaryContractTextResponse {
	s.TxHash = &v
	return s
}

type ApplyTwcNotaryContractReportRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 签署结束阶段存证核验信息
	FinishInfo *ContractNotaryFinishInfo `json:"finish_info,omitempty" xml:"finish_info,omitempty"`
	// 签署流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 签署发起阶段存证核验信息
	InitInfo *ContractNotaryInitInfo `json:"init_info,omitempty" xml:"init_info,omitempty"`
	// 签署过程阶段存证核验信息
	SignInfo []*ContractNotarySignInfo `json:"sign_info,omitempty" xml:"sign_info,omitempty" type:"Repeated"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
}

func (s ApplyTwcNotaryContractReportRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyTwcNotaryContractReportRequest) GoString() string {
	return s.String()
}

func (s *ApplyTwcNotaryContractReportRequest) SetAuthToken(v string) *ApplyTwcNotaryContractReportRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyTwcNotaryContractReportRequest) SetProductInstanceId(v string) *ApplyTwcNotaryContractReportRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyTwcNotaryContractReportRequest) SetRegionName(v string) *ApplyTwcNotaryContractReportRequest {
	s.RegionName = &v
	return s
}

func (s *ApplyTwcNotaryContractReportRequest) SetFinishInfo(v *ContractNotaryFinishInfo) *ApplyTwcNotaryContractReportRequest {
	s.FinishInfo = v
	return s
}

func (s *ApplyTwcNotaryContractReportRequest) SetFlowId(v string) *ApplyTwcNotaryContractReportRequest {
	s.FlowId = &v
	return s
}

func (s *ApplyTwcNotaryContractReportRequest) SetInitInfo(v *ContractNotaryInitInfo) *ApplyTwcNotaryContractReportRequest {
	s.InitInfo = v
	return s
}

func (s *ApplyTwcNotaryContractReportRequest) SetSignInfo(v []*ContractNotarySignInfo) *ApplyTwcNotaryContractReportRequest {
	s.SignInfo = v
	return s
}

func (s *ApplyTwcNotaryContractReportRequest) SetTransactionId(v string) *ApplyTwcNotaryContractReportRequest {
	s.TransactionId = &v
	return s
}

type ApplyTwcNotaryContractReportResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 出证报告授权码，通过核验后获得
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty"`
}

func (s ApplyTwcNotaryContractReportResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyTwcNotaryContractReportResponse) GoString() string {
	return s.String()
}

func (s *ApplyTwcNotaryContractReportResponse) SetReqMsgId(v string) *ApplyTwcNotaryContractReportResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyTwcNotaryContractReportResponse) SetResultCode(v string) *ApplyTwcNotaryContractReportResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyTwcNotaryContractReportResponse) SetResultMsg(v string) *ApplyTwcNotaryContractReportResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyTwcNotaryContractReportResponse) SetAuthCode(v string) *ApplyTwcNotaryContractReportResponse {
	s.AuthCode = &v
	return s
}

type GetTwcNotaryContractTextRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 存证凭据
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s GetTwcNotaryContractTextRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTwcNotaryContractTextRequest) GoString() string {
	return s.String()
}

func (s *GetTwcNotaryContractTextRequest) SetAuthToken(v string) *GetTwcNotaryContractTextRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTwcNotaryContractTextRequest) SetProductInstanceId(v string) *GetTwcNotaryContractTextRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTwcNotaryContractTextRequest) SetRegionName(v string) *GetTwcNotaryContractTextRequest {
	s.RegionName = &v
	return s
}

func (s *GetTwcNotaryContractTextRequest) SetTxHash(v string) *GetTwcNotaryContractTextRequest {
	s.TxHash = &v
	return s
}

type GetTwcNotaryContractTextResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证信息对象的JSON序列化形式
	NotaryData *string `json:"notary_data,omitempty" xml:"notary_data,omitempty"`
}

func (s GetTwcNotaryContractTextResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTwcNotaryContractTextResponse) GoString() string {
	return s.String()
}

func (s *GetTwcNotaryContractTextResponse) SetReqMsgId(v string) *GetTwcNotaryContractTextResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTwcNotaryContractTextResponse) SetResultCode(v string) *GetTwcNotaryContractTextResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTwcNotaryContractTextResponse) SetResultMsg(v string) *GetTwcNotaryContractTextResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTwcNotaryContractTextResponse) SetNotaryData(v string) *GetTwcNotaryContractTextResponse {
	s.NotaryData = &v
	return s
}

type CreateTwcNotaryInternalTransRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 存证关联实体（个人/企业）的身份识别信息
	Customer *Identity `json:"customer,omitempty" xml:"customer,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 业务子类型标识
	SubBizId *string `json:"sub_biz_id,omitempty" xml:"sub_biz_id,omitempty"`
	// 是否使用可信时间戳，默认为false
	Tsr *bool `json:"tsr,omitempty" xml:"tsr,omitempty"`
}

func (s CreateTwcNotaryInternalTransRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryInternalTransRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryInternalTransRequest) SetAuthToken(v string) *CreateTwcNotaryInternalTransRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryInternalTransRequest) SetProductInstanceId(v string) *CreateTwcNotaryInternalTransRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryInternalTransRequest) SetRegionName(v string) *CreateTwcNotaryInternalTransRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryInternalTransRequest) SetCustomer(v *Identity) *CreateTwcNotaryInternalTransRequest {
	s.Customer = v
	return s
}

func (s *CreateTwcNotaryInternalTransRequest) SetProperties(v string) *CreateTwcNotaryInternalTransRequest {
	s.Properties = &v
	return s
}

func (s *CreateTwcNotaryInternalTransRequest) SetSubBizId(v string) *CreateTwcNotaryInternalTransRequest {
	s.SubBizId = &v
	return s
}

func (s *CreateTwcNotaryInternalTransRequest) SetTsr(v bool) *CreateTwcNotaryInternalTransRequest {
	s.Tsr = &v
	return s
}

type CreateTwcNotaryInternalTransResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回事务ID，全局唯一
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 可信时间信息
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
}

func (s CreateTwcNotaryInternalTransResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryInternalTransResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryInternalTransResponse) SetReqMsgId(v string) *CreateTwcNotaryInternalTransResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryInternalTransResponse) SetResultCode(v string) *CreateTwcNotaryInternalTransResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryInternalTransResponse) SetResultMsg(v string) *CreateTwcNotaryInternalTransResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryInternalTransResponse) SetTransactionId(v string) *CreateTwcNotaryInternalTransResponse {
	s.TransactionId = &v
	return s
}

func (s *CreateTwcNotaryInternalTransResponse) SetTsr(v *TsrResponse) *CreateTwcNotaryInternalTransResponse {
	s.Tsr = v
	return s
}

type CreateTwcNotaryInternalTextRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 哈希算法，目前仅支持 SHA256
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty"`
	// 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 存证内容
	NotaryContent *string `json:"notary_content,omitempty" xml:"notary_content,omitempty"`
	// 描述本条存证在存证事务中的阶段，用户可自行维护
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 文本存证类型，支持源文本/文本哈希
	TextNotaryType *string `json:"text_notary_type,omitempty" xml:"text_notary_type,omitempty"`
	// 存证事务id
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 是否使用可信时间戳，默认为false
	Tsr *bool `json:"tsr,omitempty" xml:"tsr,omitempty"`
}

func (s CreateTwcNotaryInternalTextRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryInternalTextRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryInternalTextRequest) SetAuthToken(v string) *CreateTwcNotaryInternalTextRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryInternalTextRequest) SetProductInstanceId(v string) *CreateTwcNotaryInternalTextRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryInternalTextRequest) SetRegionName(v string) *CreateTwcNotaryInternalTextRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryInternalTextRequest) SetHashAlgorithm(v string) *CreateTwcNotaryInternalTextRequest {
	s.HashAlgorithm = &v
	return s
}

func (s *CreateTwcNotaryInternalTextRequest) SetLocation(v *Location) *CreateTwcNotaryInternalTextRequest {
	s.Location = v
	return s
}

func (s *CreateTwcNotaryInternalTextRequest) SetNotaryContent(v string) *CreateTwcNotaryInternalTextRequest {
	s.NotaryContent = &v
	return s
}

func (s *CreateTwcNotaryInternalTextRequest) SetPhase(v string) *CreateTwcNotaryInternalTextRequest {
	s.Phase = &v
	return s
}

func (s *CreateTwcNotaryInternalTextRequest) SetProperties(v string) *CreateTwcNotaryInternalTextRequest {
	s.Properties = &v
	return s
}

func (s *CreateTwcNotaryInternalTextRequest) SetTextNotaryType(v string) *CreateTwcNotaryInternalTextRequest {
	s.TextNotaryType = &v
	return s
}

func (s *CreateTwcNotaryInternalTextRequest) SetTransactionId(v string) *CreateTwcNotaryInternalTextRequest {
	s.TransactionId = &v
	return s
}

func (s *CreateTwcNotaryInternalTextRequest) SetTsr(v bool) *CreateTwcNotaryInternalTextRequest {
	s.Tsr = &v
	return s
}

type CreateTwcNotaryInternalTextResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 可信时间信息
	Tsr *TsrResponse `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 存证凭据
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateTwcNotaryInternalTextResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryInternalTextResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryInternalTextResponse) SetReqMsgId(v string) *CreateTwcNotaryInternalTextResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryInternalTextResponse) SetResultCode(v string) *CreateTwcNotaryInternalTextResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryInternalTextResponse) SetResultMsg(v string) *CreateTwcNotaryInternalTextResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryInternalTextResponse) SetTsr(v *TsrResponse) *CreateTwcNotaryInternalTextResponse {
	s.Tsr = v
	return s
}

func (s *CreateTwcNotaryInternalTextResponse) SetTxHash(v string) *CreateTwcNotaryInternalTextResponse {
	s.TxHash = &v
	return s
}

type CreateTwcNotaryLeaseTextRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 哈希算法，目前仅支持 SHA256
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty"`
	// 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 存证内容
	NotaryContent *string `json:"notary_content,omitempty" xml:"notary_content,omitempty"`
	// 描述本条存证在存证事务中的阶段，用户可自行维护
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 文本存证类型，支持源文本/文本哈希
	TextNotaryType *string `json:"text_notary_type,omitempty" xml:"text_notary_type,omitempty"`
	// 存证事务id
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
}

func (s CreateTwcNotaryLeaseTextRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseTextRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseTextRequest) SetAuthToken(v string) *CreateTwcNotaryLeaseTextRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryLeaseTextRequest) SetProductInstanceId(v string) *CreateTwcNotaryLeaseTextRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryLeaseTextRequest) SetRegionName(v string) *CreateTwcNotaryLeaseTextRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryLeaseTextRequest) SetHashAlgorithm(v string) *CreateTwcNotaryLeaseTextRequest {
	s.HashAlgorithm = &v
	return s
}

func (s *CreateTwcNotaryLeaseTextRequest) SetLocation(v *Location) *CreateTwcNotaryLeaseTextRequest {
	s.Location = v
	return s
}

func (s *CreateTwcNotaryLeaseTextRequest) SetNotaryContent(v string) *CreateTwcNotaryLeaseTextRequest {
	s.NotaryContent = &v
	return s
}

func (s *CreateTwcNotaryLeaseTextRequest) SetPhase(v string) *CreateTwcNotaryLeaseTextRequest {
	s.Phase = &v
	return s
}

func (s *CreateTwcNotaryLeaseTextRequest) SetProperties(v string) *CreateTwcNotaryLeaseTextRequest {
	s.Properties = &v
	return s
}

func (s *CreateTwcNotaryLeaseTextRequest) SetTextNotaryType(v string) *CreateTwcNotaryLeaseTextRequest {
	s.TextNotaryType = &v
	return s
}

func (s *CreateTwcNotaryLeaseTextRequest) SetTransactionId(v string) *CreateTwcNotaryLeaseTextRequest {
	s.TransactionId = &v
	return s
}

type CreateTwcNotaryLeaseTextResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 入参中传入的存证阶段，可同用于租赁存证列表(twc.notary.lease.notary.list)的记录对账
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
}

func (s CreateTwcNotaryLeaseTextResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseTextResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseTextResponse) SetReqMsgId(v string) *CreateTwcNotaryLeaseTextResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryLeaseTextResponse) SetResultCode(v string) *CreateTwcNotaryLeaseTextResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryLeaseTextResponse) SetResultMsg(v string) *CreateTwcNotaryLeaseTextResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryLeaseTextResponse) SetPhase(v string) *CreateTwcNotaryLeaseTextResponse {
	s.Phase = &v
	return s
}

type CreateTwcNotaryLeaseFileRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 文件存证模式，目前仅支持 FILE_RAW 和 FILE_HASH
	FileNotaryType *string `json:"file_notary_type,omitempty" xml:"file_notary_type,omitempty"`
	// 当文件存证模式为FILE_HASH时，用户可以指定该参数。当前服务仅支持 SHA256，若不填写，则默认值为 SHA256。
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty"`
	// 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
	Location *Location `json:"location,omitempty" xml:"location,omitempty"`
	// 存证文件内容，对文件内容做base64编码后得到。例如FILE_RAW模式下，文件内容为“test”，那么base64编码后的结果则为“dGVzdA==”。如果是FILE_HASh模式，则该字段直接为文件hash。
	NotaryFile *string `json:"notary_file,omitempty" xml:"notary_file,omitempty"`
	// 存证文件名称
	NotaryName *string `json:"notary_name,omitempty" xml:"notary_name,omitempty"`
	// 描述本条存证在存证事务中的阶段，用户可自行维护
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 扩展属性
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 存证事务ID
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
}

func (s CreateTwcNotaryLeaseFileRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseFileRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseFileRequest) SetAuthToken(v string) *CreateTwcNotaryLeaseFileRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryLeaseFileRequest) SetProductInstanceId(v string) *CreateTwcNotaryLeaseFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryLeaseFileRequest) SetRegionName(v string) *CreateTwcNotaryLeaseFileRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryLeaseFileRequest) SetFileNotaryType(v string) *CreateTwcNotaryLeaseFileRequest {
	s.FileNotaryType = &v
	return s
}

func (s *CreateTwcNotaryLeaseFileRequest) SetHashAlgorithm(v string) *CreateTwcNotaryLeaseFileRequest {
	s.HashAlgorithm = &v
	return s
}

func (s *CreateTwcNotaryLeaseFileRequest) SetLocation(v *Location) *CreateTwcNotaryLeaseFileRequest {
	s.Location = v
	return s
}

func (s *CreateTwcNotaryLeaseFileRequest) SetNotaryFile(v string) *CreateTwcNotaryLeaseFileRequest {
	s.NotaryFile = &v
	return s
}

func (s *CreateTwcNotaryLeaseFileRequest) SetNotaryName(v string) *CreateTwcNotaryLeaseFileRequest {
	s.NotaryName = &v
	return s
}

func (s *CreateTwcNotaryLeaseFileRequest) SetPhase(v string) *CreateTwcNotaryLeaseFileRequest {
	s.Phase = &v
	return s
}

func (s *CreateTwcNotaryLeaseFileRequest) SetProperties(v string) *CreateTwcNotaryLeaseFileRequest {
	s.Properties = &v
	return s
}

func (s *CreateTwcNotaryLeaseFileRequest) SetTransactionId(v string) *CreateTwcNotaryLeaseFileRequest {
	s.TransactionId = &v
	return s
}

type CreateTwcNotaryLeaseFileResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 入参中的存证阶段信息，可同用于租赁存证列表(twc.notary.lease.notary.list)的记录对账
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
}

func (s CreateTwcNotaryLeaseFileResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseFileResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseFileResponse) SetReqMsgId(v string) *CreateTwcNotaryLeaseFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryLeaseFileResponse) SetResultCode(v string) *CreateTwcNotaryLeaseFileResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryLeaseFileResponse) SetResultMsg(v string) *CreateTwcNotaryLeaseFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryLeaseFileResponse) SetPhase(v string) *CreateTwcNotaryLeaseFileResponse {
	s.Phase = &v
	return s
}

type ListTwcNotaryLeaseNotaryRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 商户订单号，需要同twc.notary.lease.order.create接口的传参一致
	MerchantOrderNo *string `json:"merchant_order_no,omitempty" xml:"merchant_order_no,omitempty"`
	// 接口订单号，需要同twc.notary.lease.order.create接口的传参一致
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 支付渠道，默认支持Alipay|ThirdParty|CreditCard|BankTransfer|WeChatPay|Other，需要同twc.notary.lease.order.create接口的传参一致
	PaymentChannel *string `json:"payment_channel,omitempty" xml:"payment_channel,omitempty"`
}

func (s ListTwcNotaryLeaseNotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s ListTwcNotaryLeaseNotaryRequest) GoString() string {
	return s.String()
}

func (s *ListTwcNotaryLeaseNotaryRequest) SetAuthToken(v string) *ListTwcNotaryLeaseNotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *ListTwcNotaryLeaseNotaryRequest) SetProductInstanceId(v string) *ListTwcNotaryLeaseNotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListTwcNotaryLeaseNotaryRequest) SetRegionName(v string) *ListTwcNotaryLeaseNotaryRequest {
	s.RegionName = &v
	return s
}

func (s *ListTwcNotaryLeaseNotaryRequest) SetMerchantOrderNo(v string) *ListTwcNotaryLeaseNotaryRequest {
	s.MerchantOrderNo = &v
	return s
}

func (s *ListTwcNotaryLeaseNotaryRequest) SetOrderNo(v string) *ListTwcNotaryLeaseNotaryRequest {
	s.OrderNo = &v
	return s
}

func (s *ListTwcNotaryLeaseNotaryRequest) SetPaymentChannel(v string) *ListTwcNotaryLeaseNotaryRequest {
	s.PaymentChannel = &v
	return s
}

type ListTwcNotaryLeaseNotaryResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证记录列表
	Records []*LeaseNotaryRecord `json:"records,omitempty" xml:"records,omitempty" type:"Repeated"`
}

func (s ListTwcNotaryLeaseNotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s ListTwcNotaryLeaseNotaryResponse) GoString() string {
	return s.String()
}

func (s *ListTwcNotaryLeaseNotaryResponse) SetReqMsgId(v string) *ListTwcNotaryLeaseNotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListTwcNotaryLeaseNotaryResponse) SetResultCode(v string) *ListTwcNotaryLeaseNotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *ListTwcNotaryLeaseNotaryResponse) SetResultMsg(v string) *ListTwcNotaryLeaseNotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListTwcNotaryLeaseNotaryResponse) SetRecords(v []*LeaseNotaryRecord) *ListTwcNotaryLeaseNotaryResponse {
	s.Records = v
	return s
}

type QueryTwcNotaryLeaseApplicationRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 每页的大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 起始id
	StartId *int64 `json:"start_id,omitempty" xml:"start_id,omitempty"`
}

func (s QueryTwcNotaryLeaseApplicationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryLeaseApplicationRequest) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryLeaseApplicationRequest) SetAuthToken(v string) *QueryTwcNotaryLeaseApplicationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwcNotaryLeaseApplicationRequest) SetProductInstanceId(v string) *QueryTwcNotaryLeaseApplicationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwcNotaryLeaseApplicationRequest) SetRegionName(v string) *QueryTwcNotaryLeaseApplicationRequest {
	s.RegionName = &v
	return s
}

func (s *QueryTwcNotaryLeaseApplicationRequest) SetPageSize(v int64) *QueryTwcNotaryLeaseApplicationRequest {
	s.PageSize = &v
	return s
}

func (s *QueryTwcNotaryLeaseApplicationRequest) SetStartId(v int64) *QueryTwcNotaryLeaseApplicationRequest {
	s.StartId = &v
	return s
}

type QueryTwcNotaryLeaseApplicationResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 返回值
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s QueryTwcNotaryLeaseApplicationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryLeaseApplicationResponse) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryLeaseApplicationResponse) SetReqMsgId(v string) *QueryTwcNotaryLeaseApplicationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwcNotaryLeaseApplicationResponse) SetResultCode(v string) *QueryTwcNotaryLeaseApplicationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwcNotaryLeaseApplicationResponse) SetResultMsg(v string) *QueryTwcNotaryLeaseApplicationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwcNotaryLeaseApplicationResponse) SetCode(v int64) *QueryTwcNotaryLeaseApplicationResponse {
	s.Code = &v
	return s
}

func (s *QueryTwcNotaryLeaseApplicationResponse) SetErrMessage(v string) *QueryTwcNotaryLeaseApplicationResponse {
	s.ErrMessage = &v
	return s
}

func (s *QueryTwcNotaryLeaseApplicationResponse) SetResponseData(v string) *QueryTwcNotaryLeaseApplicationResponse {
	s.ResponseData = &v
	return s
}

type QueryTwcNotaryLeaseApplicationdetailinfoRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 合约id
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
}

func (s QueryTwcNotaryLeaseApplicationdetailinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryLeaseApplicationdetailinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryLeaseApplicationdetailinfoRequest) SetAuthToken(v string) *QueryTwcNotaryLeaseApplicationdetailinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwcNotaryLeaseApplicationdetailinfoRequest) SetProductInstanceId(v string) *QueryTwcNotaryLeaseApplicationdetailinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwcNotaryLeaseApplicationdetailinfoRequest) SetRegionName(v string) *QueryTwcNotaryLeaseApplicationdetailinfoRequest {
	s.RegionName = &v
	return s
}

func (s *QueryTwcNotaryLeaseApplicationdetailinfoRequest) SetApplicationId(v string) *QueryTwcNotaryLeaseApplicationdetailinfoRequest {
	s.ApplicationId = &v
	return s
}

type QueryTwcNotaryLeaseApplicationdetailinfoResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 合约定义详情
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s QueryTwcNotaryLeaseApplicationdetailinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwcNotaryLeaseApplicationdetailinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryTwcNotaryLeaseApplicationdetailinfoResponse) SetReqMsgId(v string) *QueryTwcNotaryLeaseApplicationdetailinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwcNotaryLeaseApplicationdetailinfoResponse) SetResultCode(v string) *QueryTwcNotaryLeaseApplicationdetailinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwcNotaryLeaseApplicationdetailinfoResponse) SetResultMsg(v string) *QueryTwcNotaryLeaseApplicationdetailinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwcNotaryLeaseApplicationdetailinfoResponse) SetCode(v int64) *QueryTwcNotaryLeaseApplicationdetailinfoResponse {
	s.Code = &v
	return s
}

func (s *QueryTwcNotaryLeaseApplicationdetailinfoResponse) SetErrMessage(v string) *QueryTwcNotaryLeaseApplicationdetailinfoResponse {
	s.ErrMessage = &v
	return s
}

func (s *QueryTwcNotaryLeaseApplicationdetailinfoResponse) SetResponseData(v string) *QueryTwcNotaryLeaseApplicationdetailinfoResponse {
	s.ResponseData = &v
	return s
}

type SetTwcNotaryLeaseRepaymentstatusRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 融资租赁对应的合约id
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// finish只能为0或1，0表示订单重置此状态下订单可以被再次操作【如清分记录上传、还款记录上传等】，1表示订单结束，在1的状态下不会再进行清分、还款记录上传等操作
	Finish *int64 `json:"finish,omitempty" xml:"finish,omitempty"`
	// 租赁机构金融科技租户Id
	LeaseId *string `json:"lease_id,omitempty" xml:"lease_id,omitempty"`
	// 融资租赁对应的订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
}

func (s SetTwcNotaryLeaseRepaymentstatusRequest) String() string {
	return tea.Prettify(s)
}

func (s SetTwcNotaryLeaseRepaymentstatusRequest) GoString() string {
	return s.String()
}

func (s *SetTwcNotaryLeaseRepaymentstatusRequest) SetAuthToken(v string) *SetTwcNotaryLeaseRepaymentstatusRequest {
	s.AuthToken = &v
	return s
}

func (s *SetTwcNotaryLeaseRepaymentstatusRequest) SetProductInstanceId(v string) *SetTwcNotaryLeaseRepaymentstatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SetTwcNotaryLeaseRepaymentstatusRequest) SetRegionName(v string) *SetTwcNotaryLeaseRepaymentstatusRequest {
	s.RegionName = &v
	return s
}

func (s *SetTwcNotaryLeaseRepaymentstatusRequest) SetApplicationId(v string) *SetTwcNotaryLeaseRepaymentstatusRequest {
	s.ApplicationId = &v
	return s
}

func (s *SetTwcNotaryLeaseRepaymentstatusRequest) SetFinish(v int64) *SetTwcNotaryLeaseRepaymentstatusRequest {
	s.Finish = &v
	return s
}

func (s *SetTwcNotaryLeaseRepaymentstatusRequest) SetLeaseId(v string) *SetTwcNotaryLeaseRepaymentstatusRequest {
	s.LeaseId = &v
	return s
}

func (s *SetTwcNotaryLeaseRepaymentstatusRequest) SetOrderId(v string) *SetTwcNotaryLeaseRepaymentstatusRequest {
	s.OrderId = &v
	return s
}

type SetTwcNotaryLeaseRepaymentstatusResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 状态重置对应的链上交易哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SetTwcNotaryLeaseRepaymentstatusResponse) String() string {
	return tea.Prettify(s)
}

func (s SetTwcNotaryLeaseRepaymentstatusResponse) GoString() string {
	return s.String()
}

func (s *SetTwcNotaryLeaseRepaymentstatusResponse) SetReqMsgId(v string) *SetTwcNotaryLeaseRepaymentstatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SetTwcNotaryLeaseRepaymentstatusResponse) SetResultCode(v string) *SetTwcNotaryLeaseRepaymentstatusResponse {
	s.ResultCode = &v
	return s
}

func (s *SetTwcNotaryLeaseRepaymentstatusResponse) SetResultMsg(v string) *SetTwcNotaryLeaseRepaymentstatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *SetTwcNotaryLeaseRepaymentstatusResponse) SetCode(v int64) *SetTwcNotaryLeaseRepaymentstatusResponse {
	s.Code = &v
	return s
}

func (s *SetTwcNotaryLeaseRepaymentstatusResponse) SetErrMessage(v string) *SetTwcNotaryLeaseRepaymentstatusResponse {
	s.ErrMessage = &v
	return s
}

func (s *SetTwcNotaryLeaseRepaymentstatusResponse) SetResponseData(v string) *SetTwcNotaryLeaseRepaymentstatusResponse {
	s.ResponseData = &v
	return s
}

type CreateTwcNotaryLeaseSupplierinfoRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 租赁方及资方定义的合约id
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 额外字段定义
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 供应商发货的物流单号
	LogisticsOrderId *string `json:"logistics_order_id,omitempty" xml:"logistics_order_id,omitempty"`
	// 用户的租赁订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 额外字段定义对应的阶段，请咨询对应的资方
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty"`
	// 采购订单id
	PurchaseOrderId *string `json:"purchase_order_id,omitempty" xml:"purchase_order_id,omitempty"`
	// 产品详细信息
	SupplierProductList []*SupplierProductInfo `json:"supplier_product_list,omitempty" xml:"supplier_product_list,omitempty" type:"Repeated"`
}

func (s CreateTwcNotaryLeaseSupplierinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseSupplierinfoRequest) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseSupplierinfoRequest) SetAuthToken(v string) *CreateTwcNotaryLeaseSupplierinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTwcNotaryLeaseSupplierinfoRequest) SetProductInstanceId(v string) *CreateTwcNotaryLeaseSupplierinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTwcNotaryLeaseSupplierinfoRequest) SetRegionName(v string) *CreateTwcNotaryLeaseSupplierinfoRequest {
	s.RegionName = &v
	return s
}

func (s *CreateTwcNotaryLeaseSupplierinfoRequest) SetApplicationId(v string) *CreateTwcNotaryLeaseSupplierinfoRequest {
	s.ApplicationId = &v
	return s
}

func (s *CreateTwcNotaryLeaseSupplierinfoRequest) SetExtraInfo(v string) *CreateTwcNotaryLeaseSupplierinfoRequest {
	s.ExtraInfo = &v
	return s
}

func (s *CreateTwcNotaryLeaseSupplierinfoRequest) SetLogisticsOrderId(v string) *CreateTwcNotaryLeaseSupplierinfoRequest {
	s.LogisticsOrderId = &v
	return s
}

func (s *CreateTwcNotaryLeaseSupplierinfoRequest) SetOrderId(v string) *CreateTwcNotaryLeaseSupplierinfoRequest {
	s.OrderId = &v
	return s
}

func (s *CreateTwcNotaryLeaseSupplierinfoRequest) SetPhase(v string) *CreateTwcNotaryLeaseSupplierinfoRequest {
	s.Phase = &v
	return s
}

func (s *CreateTwcNotaryLeaseSupplierinfoRequest) SetPurchaseOrderId(v string) *CreateTwcNotaryLeaseSupplierinfoRequest {
	s.PurchaseOrderId = &v
	return s
}

func (s *CreateTwcNotaryLeaseSupplierinfoRequest) SetSupplierProductList(v []*SupplierProductInfo) *CreateTwcNotaryLeaseSupplierinfoRequest {
	s.SupplierProductList = v
	return s
}

type CreateTwcNotaryLeaseSupplierinfoResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息描述
	ErrMessage *string `json:"err_message,omitempty" xml:"err_message,omitempty"`
	// 供应商上传采购等相关信息对应的链上哈希
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s CreateTwcNotaryLeaseSupplierinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTwcNotaryLeaseSupplierinfoResponse) GoString() string {
	return s.String()
}

func (s *CreateTwcNotaryLeaseSupplierinfoResponse) SetReqMsgId(v string) *CreateTwcNotaryLeaseSupplierinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTwcNotaryLeaseSupplierinfoResponse) SetResultCode(v string) *CreateTwcNotaryLeaseSupplierinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTwcNotaryLeaseSupplierinfoResponse) SetResultMsg(v string) *CreateTwcNotaryLeaseSupplierinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTwcNotaryLeaseSupplierinfoResponse) SetCode(v int64) *CreateTwcNotaryLeaseSupplierinfoResponse {
	s.Code = &v
	return s
}

func (s *CreateTwcNotaryLeaseSupplierinfoResponse) SetErrMessage(v string) *CreateTwcNotaryLeaseSupplierinfoResponse {
	s.ErrMessage = &v
	return s
}

func (s *CreateTwcNotaryLeaseSupplierinfoResponse) SetResponseData(v string) *CreateTwcNotaryLeaseSupplierinfoResponse {
	s.ResponseData = &v
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
 * Description: 提供给第三方仲裁isv的仲裁申请状态变化回调接口
 * Summary: 仲裁状态信息变更回调接口
 */
func (client *Client) CallbackTwcNotaryArbitrationStatus(request *CallbackTwcNotaryArbitrationStatusRequest) (_result *CallbackTwcNotaryArbitrationStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CallbackTwcNotaryArbitrationStatusResponse{}
	_body, _err := client.CallbackTwcNotaryArbitrationStatusEx(request, runtime)
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
func (client *Client) CallbackTwcNotaryArbitrationStatusEx(request *CallbackTwcNotaryArbitrationStatusRequest, runtime *util.RuntimeOptions) (_result *CallbackTwcNotaryArbitrationStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackTwcNotaryArbitrationStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.arbitration.status.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryContractAccount(request *CreateTwcNotaryContractAccountRequest) (_result *CreateTwcNotaryContractAccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryContractAccountResponse{}
	_body, _err := client.CreateTwcNotaryContractAccountEx(request, runtime)
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
func (client *Client) CreateTwcNotaryContractAccountEx(request *CreateTwcNotaryContractAccountRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryContractAccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryContractAccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.account.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryContractAccountseal(request *CreateTwcNotaryContractAccountsealRequest) (_result *CreateTwcNotaryContractAccountsealResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryContractAccountsealResponse{}
	_body, _err := client.CreateTwcNotaryContractAccountsealEx(request, runtime)
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
func (client *Client) CreateTwcNotaryContractAccountsealEx(request *CreateTwcNotaryContractAccountsealRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryContractAccountsealResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryContractAccountsealResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.accountseal.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryContractOrganization(request *CreateTwcNotaryContractOrganizationRequest) (_result *CreateTwcNotaryContractOrganizationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryContractOrganizationResponse{}
	_body, _err := client.CreateTwcNotaryContractOrganizationEx(request, runtime)
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
func (client *Client) CreateTwcNotaryContractOrganizationEx(request *CreateTwcNotaryContractOrganizationRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryContractOrganizationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryContractOrganizationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.organization.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryContractOrgseal(request *CreateTwcNotaryContractOrgsealRequest) (_result *CreateTwcNotaryContractOrgsealResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryContractOrgsealResponse{}
	_body, _err := client.CreateTwcNotaryContractOrgsealEx(request, runtime)
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
func (client *Client) CreateTwcNotaryContractOrgsealEx(request *CreateTwcNotaryContractOrgsealRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryContractOrgsealResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryContractOrgsealResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.orgseal.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) AuthTwcNotaryContractSign(request *AuthTwcNotaryContractSignRequest) (_result *AuthTwcNotaryContractSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AuthTwcNotaryContractSignResponse{}
	_body, _err := client.AuthTwcNotaryContractSignEx(request, runtime)
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
func (client *Client) AuthTwcNotaryContractSignEx(request *AuthTwcNotaryContractSignRequest, runtime *util.RuntimeOptions) (_result *AuthTwcNotaryContractSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthTwcNotaryContractSignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.sign.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryContractTemplate(request *CreateTwcNotaryContractTemplateRequest) (_result *CreateTwcNotaryContractTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryContractTemplateResponse{}
	_body, _err := client.CreateTwcNotaryContractTemplateEx(request, runtime)
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
func (client *Client) CreateTwcNotaryContractTemplateEx(request *CreateTwcNotaryContractTemplateRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryContractTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryContractTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.template.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryContractFlow(request *CreateTwcNotaryContractFlowRequest) (_result *CreateTwcNotaryContractFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryContractFlowResponse{}
	_body, _err := client.CreateTwcNotaryContractFlowEx(request, runtime)
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
func (client *Client) CreateTwcNotaryContractFlowEx(request *CreateTwcNotaryContractFlowRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryContractFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryContractFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.flow.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) AddTwcNotaryContractDocument(request *AddTwcNotaryContractDocumentRequest) (_result *AddTwcNotaryContractDocumentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AddTwcNotaryContractDocumentResponse{}
	_body, _err := client.AddTwcNotaryContractDocumentEx(request, runtime)
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
func (client *Client) AddTwcNotaryContractDocumentEx(request *AddTwcNotaryContractDocumentRequest, runtime *util.RuntimeOptions) (_result *AddTwcNotaryContractDocumentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddTwcNotaryContractDocumentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.document.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) AddTwcNotaryContractSignfield(request *AddTwcNotaryContractSignfieldRequest) (_result *AddTwcNotaryContractSignfieldResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AddTwcNotaryContractSignfieldResponse{}
	_body, _err := client.AddTwcNotaryContractSignfieldEx(request, runtime)
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
func (client *Client) AddTwcNotaryContractSignfieldEx(request *AddTwcNotaryContractSignfieldRequest, runtime *util.RuntimeOptions) (_result *AddTwcNotaryContractSignfieldResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddTwcNotaryContractSignfieldResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.signfield.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) StartTwcNotaryContractFlow(request *StartTwcNotaryContractFlowRequest) (_result *StartTwcNotaryContractFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &StartTwcNotaryContractFlowResponse{}
	_body, _err := client.StartTwcNotaryContractFlowEx(request, runtime)
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
func (client *Client) StartTwcNotaryContractFlowEx(request *StartTwcNotaryContractFlowRequest, runtime *util.RuntimeOptions) (_result *StartTwcNotaryContractFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartTwcNotaryContractFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.flow.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) SaveTwcNotaryContractFlow(request *SaveTwcNotaryContractFlowRequest) (_result *SaveTwcNotaryContractFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SaveTwcNotaryContractFlowResponse{}
	_body, _err := client.SaveTwcNotaryContractFlowEx(request, runtime)
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
func (client *Client) SaveTwcNotaryContractFlowEx(request *SaveTwcNotaryContractFlowRequest, runtime *util.RuntimeOptions) (_result *SaveTwcNotaryContractFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveTwcNotaryContractFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.flow.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) DownloadTwcNotaryContractDocument(request *DownloadTwcNotaryContractDocumentRequest) (_result *DownloadTwcNotaryContractDocumentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &DownloadTwcNotaryContractDocumentResponse{}
	_body, _err := client.DownloadTwcNotaryContractDocumentEx(request, runtime)
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
func (client *Client) DownloadTwcNotaryContractDocumentEx(request *DownloadTwcNotaryContractDocumentRequest, runtime *util.RuntimeOptions) (_result *DownloadTwcNotaryContractDocumentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DownloadTwcNotaryContractDocumentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.document.download"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) AddTwcNotaryContractFile(request *AddTwcNotaryContractFileRequest) (_result *AddTwcNotaryContractFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AddTwcNotaryContractFileResponse{}
	_body, _err := client.AddTwcNotaryContractFileEx(request, runtime)
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
func (client *Client) AddTwcNotaryContractFileEx(request *AddTwcNotaryContractFileRequest, runtime *util.RuntimeOptions) (_result *AddTwcNotaryContractFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddTwcNotaryContractFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.file.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryContractPlatform(request *CreateTwcNotaryContractPlatformRequest) (_result *CreateTwcNotaryContractPlatformResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryContractPlatformResponse{}
	_body, _err := client.CreateTwcNotaryContractPlatformEx(request, runtime)
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
func (client *Client) CreateTwcNotaryContractPlatformEx(request *CreateTwcNotaryContractPlatformRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryContractPlatformResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryContractPlatformResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.platform.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryContractUser(request *CreateTwcNotaryContractUserRequest) (_result *CreateTwcNotaryContractUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryContractUserResponse{}
	_body, _err := client.CreateTwcNotaryContractUserEx(request, runtime)
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
func (client *Client) CreateTwcNotaryContractUserEx(request *CreateTwcNotaryContractUserRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryContractUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryContractUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.user.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) StartTwcNotaryContractHandsign(request *StartTwcNotaryContractHandsignRequest) (_result *StartTwcNotaryContractHandsignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &StartTwcNotaryContractHandsignResponse{}
	_body, _err := client.StartTwcNotaryContractHandsignEx(request, runtime)
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
func (client *Client) StartTwcNotaryContractHandsignEx(request *StartTwcNotaryContractHandsignRequest, runtime *util.RuntimeOptions) (_result *StartTwcNotaryContractHandsignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartTwcNotaryContractHandsignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.handsign.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryTwcNotaryContractFlow(request *QueryTwcNotaryContractFlowRequest) (_result *QueryTwcNotaryContractFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryTwcNotaryContractFlowResponse{}
	_body, _err := client.QueryTwcNotaryContractFlowEx(request, runtime)
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
func (client *Client) QueryTwcNotaryContractFlowEx(request *QueryTwcNotaryContractFlowRequest, runtime *util.RuntimeOptions) (_result *QueryTwcNotaryContractFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwcNotaryContractFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.flow.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryContractAccountsealimage(request *CreateTwcNotaryContractAccountsealimageRequest) (_result *CreateTwcNotaryContractAccountsealimageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryContractAccountsealimageResponse{}
	_body, _err := client.CreateTwcNotaryContractAccountsealimageEx(request, runtime)
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
func (client *Client) CreateTwcNotaryContractAccountsealimageEx(request *CreateTwcNotaryContractAccountsealimageRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryContractAccountsealimageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryContractAccountsealimageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.accountsealimage.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) GetTwcNotaryContractFileuploadurl(request *GetTwcNotaryContractFileuploadurlRequest) (_result *GetTwcNotaryContractFileuploadurlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetTwcNotaryContractFileuploadurlResponse{}
	_body, _err := client.GetTwcNotaryContractFileuploadurlEx(request, runtime)
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
func (client *Client) GetTwcNotaryContractFileuploadurlEx(request *GetTwcNotaryContractFileuploadurlRequest, runtime *util.RuntimeOptions) (_result *GetTwcNotaryContractFileuploadurlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTwcNotaryContractFileuploadurlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.fileuploadurl.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) AddTwcNotaryContractPlatformsignfields(request *AddTwcNotaryContractPlatformsignfieldsRequest) (_result *AddTwcNotaryContractPlatformsignfieldsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AddTwcNotaryContractPlatformsignfieldsResponse{}
	_body, _err := client.AddTwcNotaryContractPlatformsignfieldsEx(request, runtime)
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
func (client *Client) AddTwcNotaryContractPlatformsignfieldsEx(request *AddTwcNotaryContractPlatformsignfieldsRequest, runtime *util.RuntimeOptions) (_result *AddTwcNotaryContractPlatformsignfieldsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddTwcNotaryContractPlatformsignfieldsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.platformsignfields.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) GetTwcNotaryContractFile(request *GetTwcNotaryContractFileRequest) (_result *GetTwcNotaryContractFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetTwcNotaryContractFileResponse{}
	_body, _err := client.GetTwcNotaryContractFileEx(request, runtime)
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
func (client *Client) GetTwcNotaryContractFileEx(request *GetTwcNotaryContractFileRequest, runtime *util.RuntimeOptions) (_result *GetTwcNotaryContractFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTwcNotaryContractFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.file.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryTwcNotaryContractAccountseals(request *QueryTwcNotaryContractAccountsealsRequest) (_result *QueryTwcNotaryContractAccountsealsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryTwcNotaryContractAccountsealsResponse{}
	_body, _err := client.QueryTwcNotaryContractAccountsealsEx(request, runtime)
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
func (client *Client) QueryTwcNotaryContractAccountsealsEx(request *QueryTwcNotaryContractAccountsealsRequest, runtime *util.RuntimeOptions) (_result *QueryTwcNotaryContractAccountsealsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwcNotaryContractAccountsealsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.accountseals.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryTwcNotaryContractOrganizationseals(request *QueryTwcNotaryContractOrganizationsealsRequest) (_result *QueryTwcNotaryContractOrganizationsealsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryTwcNotaryContractOrganizationsealsResponse{}
	_body, _err := client.QueryTwcNotaryContractOrganizationsealsEx(request, runtime)
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
func (client *Client) QueryTwcNotaryContractOrganizationsealsEx(request *QueryTwcNotaryContractOrganizationsealsRequest, runtime *util.RuntimeOptions) (_result *QueryTwcNotaryContractOrganizationsealsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwcNotaryContractOrganizationsealsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.organizationseals.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryTwcNotaryContractFlowsigner(request *QueryTwcNotaryContractFlowsignerRequest) (_result *QueryTwcNotaryContractFlowsignerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryTwcNotaryContractFlowsignerResponse{}
	_body, _err := client.QueryTwcNotaryContractFlowsignerEx(request, runtime)
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
func (client *Client) QueryTwcNotaryContractFlowsignerEx(request *QueryTwcNotaryContractFlowsignerRequest, runtime *util.RuntimeOptions) (_result *QueryTwcNotaryContractFlowsignerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwcNotaryContractFlowsignerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.flowsigner.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryTwcNotaryContractSignfields(request *QueryTwcNotaryContractSignfieldsRequest) (_result *QueryTwcNotaryContractSignfieldsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryTwcNotaryContractSignfieldsResponse{}
	_body, _err := client.QueryTwcNotaryContractSignfieldsEx(request, runtime)
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
func (client *Client) QueryTwcNotaryContractSignfieldsEx(request *QueryTwcNotaryContractSignfieldsRequest, runtime *util.RuntimeOptions) (_result *QueryTwcNotaryContractSignfieldsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwcNotaryContractSignfieldsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.signfields.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryTwcNotaryContractAccount(request *QueryTwcNotaryContractAccountRequest) (_result *QueryTwcNotaryContractAccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryTwcNotaryContractAccountResponse{}
	_body, _err := client.QueryTwcNotaryContractAccountEx(request, runtime)
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
func (client *Client) QueryTwcNotaryContractAccountEx(request *QueryTwcNotaryContractAccountRequest, runtime *util.RuntimeOptions) (_result *QueryTwcNotaryContractAccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwcNotaryContractAccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.account.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryTwcNotaryContractOrganization(request *QueryTwcNotaryContractOrganizationRequest) (_result *QueryTwcNotaryContractOrganizationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryTwcNotaryContractOrganizationResponse{}
	_body, _err := client.QueryTwcNotaryContractOrganizationEx(request, runtime)
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
func (client *Client) QueryTwcNotaryContractOrganizationEx(request *QueryTwcNotaryContractOrganizationRequest, runtime *util.RuntimeOptions) (_result *QueryTwcNotaryContractOrganizationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwcNotaryContractOrganizationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.organization.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryTwcNotaryContractTemplate(request *QueryTwcNotaryContractTemplateRequest) (_result *QueryTwcNotaryContractTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryTwcNotaryContractTemplateResponse{}
	_body, _err := client.QueryTwcNotaryContractTemplateEx(request, runtime)
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
func (client *Client) QueryTwcNotaryContractTemplateEx(request *QueryTwcNotaryContractTemplateRequest, runtime *util.RuntimeOptions) (_result *QueryTwcNotaryContractTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwcNotaryContractTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.template.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryContractSignflow(request *CreateTwcNotaryContractSignflowRequest) (_result *CreateTwcNotaryContractSignflowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryContractSignflowResponse{}
	_body, _err := client.CreateTwcNotaryContractSignflowEx(request, runtime)
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
func (client *Client) CreateTwcNotaryContractSignflowEx(request *CreateTwcNotaryContractSignflowRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryContractSignflowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryContractSignflowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.signflow.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryContractRegisterzft(request *CreateTwcNotaryContractRegisterzftRequest) (_result *CreateTwcNotaryContractRegisterzftResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryContractRegisterzftResponse{}
	_body, _err := client.CreateTwcNotaryContractRegisterzftEx(request, runtime)
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
func (client *Client) CreateTwcNotaryContractRegisterzftEx(request *CreateTwcNotaryContractRegisterzftRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryContractRegisterzftResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryContractRegisterzftResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.registerzft.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryContractPlatformtemplate(request *CreateTwcNotaryContractPlatformtemplateRequest) (_result *CreateTwcNotaryContractPlatformtemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryContractPlatformtemplateResponse{}
	_body, _err := client.CreateTwcNotaryContractPlatformtemplateEx(request, runtime)
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
func (client *Client) CreateTwcNotaryContractPlatformtemplateEx(request *CreateTwcNotaryContractPlatformtemplateRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryContractPlatformtemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryContractPlatformtemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.platformtemplate.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryTwcNotaryContractMerchantzft(request *QueryTwcNotaryContractMerchantzftRequest) (_result *QueryTwcNotaryContractMerchantzftResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryTwcNotaryContractMerchantzftResponse{}
	_body, _err := client.QueryTwcNotaryContractMerchantzftEx(request, runtime)
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
func (client *Client) QueryTwcNotaryContractMerchantzftEx(request *QueryTwcNotaryContractMerchantzftRequest, runtime *util.RuntimeOptions) (_result *QueryTwcNotaryContractMerchantzftResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwcNotaryContractMerchantzftResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.merchantzft.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ListTwcNotaryContractOuttradeid(request *ListTwcNotaryContractOuttradeidRequest) (_result *ListTwcNotaryContractOuttradeidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ListTwcNotaryContractOuttradeidResponse{}
	_body, _err := client.ListTwcNotaryContractOuttradeidEx(request, runtime)
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
func (client *Client) ListTwcNotaryContractOuttradeidEx(request *ListTwcNotaryContractOuttradeidRequest, runtime *util.RuntimeOptions) (_result *ListTwcNotaryContractOuttradeidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListTwcNotaryContractOuttradeidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.outtradeid.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryTwcNotaryContractTradedetail(request *QueryTwcNotaryContractTradedetailRequest) (_result *QueryTwcNotaryContractTradedetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryTwcNotaryContractTradedetailResponse{}
	_body, _err := client.QueryTwcNotaryContractTradedetailEx(request, runtime)
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
func (client *Client) QueryTwcNotaryContractTradedetailEx(request *QueryTwcNotaryContractTradedetailRequest, runtime *util.RuntimeOptions) (_result *QueryTwcNotaryContractTradedetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwcNotaryContractTradedetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.tradedetail.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryContractMerchantrefund(request *CreateTwcNotaryContractMerchantrefundRequest) (_result *CreateTwcNotaryContractMerchantrefundResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryContractMerchantrefundResponse{}
	_body, _err := client.CreateTwcNotaryContractMerchantrefundEx(request, runtime)
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
func (client *Client) CreateTwcNotaryContractMerchantrefundEx(request *CreateTwcNotaryContractMerchantrefundRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryContractMerchantrefundResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryContractMerchantrefundResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.merchantrefund.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryContractAdminaccount(request *CreateTwcNotaryContractAdminaccountRequest) (_result *CreateTwcNotaryContractAdminaccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryContractAdminaccountResponse{}
	_body, _err := client.CreateTwcNotaryContractAdminaccountEx(request, runtime)
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
func (client *Client) CreateTwcNotaryContractAdminaccountEx(request *CreateTwcNotaryContractAdminaccountRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryContractAdminaccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryContractAdminaccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.adminaccount.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ListTwcNotaryContractTradeids(request *ListTwcNotaryContractTradeidsRequest) (_result *ListTwcNotaryContractTradeidsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ListTwcNotaryContractTradeidsResponse{}
	_body, _err := client.ListTwcNotaryContractTradeidsEx(request, runtime)
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
func (client *Client) ListTwcNotaryContractTradeidsEx(request *ListTwcNotaryContractTradeidsRequest, runtime *util.RuntimeOptions) (_result *ListTwcNotaryContractTradeidsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListTwcNotaryContractTradeidsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.tradeids.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryContractCommontrigger(request *CreateTwcNotaryContractCommontriggerRequest) (_result *CreateTwcNotaryContractCommontriggerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryContractCommontriggerResponse{}
	_body, _err := client.CreateTwcNotaryContractCommontriggerEx(request, runtime)
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
func (client *Client) CreateTwcNotaryContractCommontriggerEx(request *CreateTwcNotaryContractCommontriggerRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryContractCommontriggerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryContractCommontriggerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.commontrigger.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户入驻直付通，仅供管理员调用
 * Summary: 商户入驻直付通，仅供管理员调用
 */
func (client *Client) CreateTwcNotaryContractMerchantindirectzft(request *CreateTwcNotaryContractMerchantindirectzftRequest) (_result *CreateTwcNotaryContractMerchantindirectzftResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryContractMerchantindirectzftResponse{}
	_body, _err := client.CreateTwcNotaryContractMerchantindirectzftEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户入驻直付通，仅供管理员调用
 * Summary: 商户入驻直付通，仅供管理员调用
 */
func (client *Client) CreateTwcNotaryContractMerchantindirectzftEx(request *CreateTwcNotaryContractMerchantindirectzftRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryContractMerchantindirectzftResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryContractMerchantindirectzftResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.merchantindirectzft.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryTwcNotaryContractMerchantindirectzft(request *QueryTwcNotaryContractMerchantindirectzftRequest) (_result *QueryTwcNotaryContractMerchantindirectzftResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryTwcNotaryContractMerchantindirectzftResponse{}
	_body, _err := client.QueryTwcNotaryContractMerchantindirectzftEx(request, runtime)
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
func (client *Client) QueryTwcNotaryContractMerchantindirectzftEx(request *QueryTwcNotaryContractMerchantindirectzftRequest, runtime *util.RuntimeOptions) (_result *QueryTwcNotaryContractMerchantindirectzftResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwcNotaryContractMerchantindirectzftResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.merchantindirectzft.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryTwcNotaryPayresultfileurl(request *QueryTwcNotaryPayresultfileurlRequest) (_result *QueryTwcNotaryPayresultfileurlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryTwcNotaryPayresultfileurlResponse{}
	_body, _err := client.QueryTwcNotaryPayresultfileurlEx(request, runtime)
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
func (client *Client) QueryTwcNotaryPayresultfileurlEx(request *QueryTwcNotaryPayresultfileurlRequest, runtime *util.RuntimeOptions) (_result *QueryTwcNotaryPayresultfileurlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwcNotaryPayresultfileurlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.payresultfileurl.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryContractMerchantimage(request *CreateTwcNotaryContractMerchantimageRequest) (_result *CreateTwcNotaryContractMerchantimageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryContractMerchantimageResponse{}
	_body, _err := client.CreateTwcNotaryContractMerchantimageEx(request, runtime)
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
func (client *Client) CreateTwcNotaryContractMerchantimageEx(request *CreateTwcNotaryContractMerchantimageRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryContractMerchantimageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryContractMerchantimageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.merchantimage.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CancelTwcNotaryContractPaytrade(request *CancelTwcNotaryContractPaytradeRequest) (_result *CancelTwcNotaryContractPaytradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CancelTwcNotaryContractPaytradeResponse{}
	_body, _err := client.CancelTwcNotaryContractPaytradeEx(request, runtime)
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
func (client *Client) CancelTwcNotaryContractPaytradeEx(request *CancelTwcNotaryContractPaytradeRequest, runtime *util.RuntimeOptions) (_result *CancelTwcNotaryContractPaytradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelTwcNotaryContractPaytradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.paytrade.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryContractHandsignflow(request *CreateTwcNotaryContractHandsignflowRequest) (_result *CreateTwcNotaryContractHandsignflowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryContractHandsignflowResponse{}
	_body, _err := client.CreateTwcNotaryContractHandsignflowEx(request, runtime)
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
func (client *Client) CreateTwcNotaryContractHandsignflowEx(request *CreateTwcNotaryContractHandsignflowRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryContractHandsignflowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryContractHandsignflowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.handsignflow.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryContractHandsignfield(request *CreateTwcNotaryContractHandsignfieldRequest) (_result *CreateTwcNotaryContractHandsignfieldResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryContractHandsignfieldResponse{}
	_body, _err := client.CreateTwcNotaryContractHandsignfieldEx(request, runtime)
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
func (client *Client) CreateTwcNotaryContractHandsignfieldEx(request *CreateTwcNotaryContractHandsignfieldRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryContractHandsignfieldResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryContractHandsignfieldResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.handsignfield.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) GetTwcNotaryContractSignurl(request *GetTwcNotaryContractSignurlRequest) (_result *GetTwcNotaryContractSignurlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetTwcNotaryContractSignurlResponse{}
	_body, _err := client.GetTwcNotaryContractSignurlEx(request, runtime)
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
func (client *Client) GetTwcNotaryContractSignurlEx(request *GetTwcNotaryContractSignurlRequest, runtime *util.RuntimeOptions) (_result *GetTwcNotaryContractSignurlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTwcNotaryContractSignurlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.signurl.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryWithholdAgreement(request *CreateTwcNotaryWithholdAgreementRequest) (_result *CreateTwcNotaryWithholdAgreementResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryWithholdAgreementResponse{}
	_body, _err := client.CreateTwcNotaryWithholdAgreementEx(request, runtime)
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
func (client *Client) CreateTwcNotaryWithholdAgreementEx(request *CreateTwcNotaryWithholdAgreementRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryWithholdAgreementResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryWithholdAgreementResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.withhold.agreement.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryTwcNotaryWithholdAgreement(request *QueryTwcNotaryWithholdAgreementRequest) (_result *QueryTwcNotaryWithholdAgreementResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryTwcNotaryWithholdAgreementResponse{}
	_body, _err := client.QueryTwcNotaryWithholdAgreementEx(request, runtime)
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
func (client *Client) QueryTwcNotaryWithholdAgreementEx(request *QueryTwcNotaryWithholdAgreementRequest, runtime *util.RuntimeOptions) (_result *QueryTwcNotaryWithholdAgreementResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwcNotaryWithholdAgreementResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.withhold.agreement.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryTwcNotaryWithholdAgreementurl(request *QueryTwcNotaryWithholdAgreementurlRequest) (_result *QueryTwcNotaryWithholdAgreementurlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryTwcNotaryWithholdAgreementurlResponse{}
	_body, _err := client.QueryTwcNotaryWithholdAgreementurlEx(request, runtime)
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
func (client *Client) QueryTwcNotaryWithholdAgreementurlEx(request *QueryTwcNotaryWithholdAgreementurlRequest, runtime *util.RuntimeOptions) (_result *QueryTwcNotaryWithholdAgreementurlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwcNotaryWithholdAgreementurlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.withhold.agreementurl.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryWithholdOverduetime(request *CreateTwcNotaryWithholdOverduetimeRequest) (_result *CreateTwcNotaryWithholdOverduetimeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryWithholdOverduetimeResponse{}
	_body, _err := client.CreateTwcNotaryWithholdOverduetimeEx(request, runtime)
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
func (client *Client) CreateTwcNotaryWithholdOverduetimeEx(request *CreateTwcNotaryWithholdOverduetimeRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryWithholdOverduetimeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryWithholdOverduetimeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.withhold.overduetime.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) SendTwcNotaryWithholdDeduct(request *SendTwcNotaryWithholdDeductRequest) (_result *SendTwcNotaryWithholdDeductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SendTwcNotaryWithholdDeductResponse{}
	_body, _err := client.SendTwcNotaryWithholdDeductEx(request, runtime)
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
func (client *Client) SendTwcNotaryWithholdDeductEx(request *SendTwcNotaryWithholdDeductRequest, runtime *util.RuntimeOptions) (_result *SendTwcNotaryWithholdDeductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendTwcNotaryWithholdDeductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.withhold.deduct.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryTwcNotaryWithholdPayresult(request *QueryTwcNotaryWithholdPayresultRequest) (_result *QueryTwcNotaryWithholdPayresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryTwcNotaryWithholdPayresultResponse{}
	_body, _err := client.QueryTwcNotaryWithholdPayresultEx(request, runtime)
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
func (client *Client) QueryTwcNotaryWithholdPayresultEx(request *QueryTwcNotaryWithholdPayresultRequest, runtime *util.RuntimeOptions) (_result *QueryTwcNotaryWithholdPayresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwcNotaryWithholdPayresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.withhold.payresult.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) SendTwcNotaryWithholdRefund(request *SendTwcNotaryWithholdRefundRequest) (_result *SendTwcNotaryWithholdRefundResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SendTwcNotaryWithholdRefundResponse{}
	_body, _err := client.SendTwcNotaryWithholdRefundEx(request, runtime)
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
func (client *Client) SendTwcNotaryWithholdRefundEx(request *SendTwcNotaryWithholdRefundRequest, runtime *util.RuntimeOptions) (_result *SendTwcNotaryWithholdRefundResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendTwcNotaryWithholdRefundResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.withhold.refund.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) SendTwcNotaryContractInvitation(request *SendTwcNotaryContractInvitationRequest) (_result *SendTwcNotaryContractInvitationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SendTwcNotaryContractInvitationResponse{}
	_body, _err := client.SendTwcNotaryContractInvitationEx(request, runtime)
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
func (client *Client) SendTwcNotaryContractInvitationEx(request *SendTwcNotaryContractInvitationRequest, runtime *util.RuntimeOptions) (_result *SendTwcNotaryContractInvitationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendTwcNotaryContractInvitationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.invitation.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ListTwcNotaryContractPayrule(request *ListTwcNotaryContractPayruleRequest) (_result *ListTwcNotaryContractPayruleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ListTwcNotaryContractPayruleResponse{}
	_body, _err := client.ListTwcNotaryContractPayruleEx(request, runtime)
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
func (client *Client) ListTwcNotaryContractPayruleEx(request *ListTwcNotaryContractPayruleRequest, runtime *util.RuntimeOptions) (_result *ListTwcNotaryContractPayruleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListTwcNotaryContractPayruleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.payrule.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryWithholdQrcode(request *CreateTwcNotaryWithholdQrcodeRequest) (_result *CreateTwcNotaryWithholdQrcodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryWithholdQrcodeResponse{}
	_body, _err := client.CreateTwcNotaryWithholdQrcodeEx(request, runtime)
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
func (client *Client) CreateTwcNotaryWithholdQrcodeEx(request *CreateTwcNotaryWithholdQrcodeRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryWithholdQrcodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryWithholdQrcodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.withhold.qrcode.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CancelTwcNotaryContractPaysingletrade(request *CancelTwcNotaryContractPaysingletradeRequest) (_result *CancelTwcNotaryContractPaysingletradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CancelTwcNotaryContractPaysingletradeResponse{}
	_body, _err := client.CancelTwcNotaryContractPaysingletradeEx(request, runtime)
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
func (client *Client) CancelTwcNotaryContractPaysingletradeEx(request *CancelTwcNotaryContractPaysingletradeRequest, runtime *util.RuntimeOptions) (_result *CancelTwcNotaryContractPaysingletradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelTwcNotaryContractPaysingletradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.paysingletrade.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ApplyTwcNotaryContractCallbackkey(request *ApplyTwcNotaryContractCallbackkeyRequest) (_result *ApplyTwcNotaryContractCallbackkeyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ApplyTwcNotaryContractCallbackkeyResponse{}
	_body, _err := client.ApplyTwcNotaryContractCallbackkeyEx(request, runtime)
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
func (client *Client) ApplyTwcNotaryContractCallbackkeyEx(request *ApplyTwcNotaryContractCallbackkeyRequest, runtime *util.RuntimeOptions) (_result *ApplyTwcNotaryContractCallbackkeyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyTwcNotaryContractCallbackkeyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.callbackkey.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CheckTwcNotaryEpidentityTwometa(request *CheckTwcNotaryEpidentityTwometaRequest) (_result *CheckTwcNotaryEpidentityTwometaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CheckTwcNotaryEpidentityTwometaResponse{}
	_body, _err := client.CheckTwcNotaryEpidentityTwometaEx(request, runtime)
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
func (client *Client) CheckTwcNotaryEpidentityTwometaEx(request *CheckTwcNotaryEpidentityTwometaRequest, runtime *util.RuntimeOptions) (_result *CheckTwcNotaryEpidentityTwometaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckTwcNotaryEpidentityTwometaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.epidentity.twometa.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CheckTwcNotaryEpidentityThreemeta(request *CheckTwcNotaryEpidentityThreemetaRequest) (_result *CheckTwcNotaryEpidentityThreemetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CheckTwcNotaryEpidentityThreemetaResponse{}
	_body, _err := client.CheckTwcNotaryEpidentityThreemetaEx(request, runtime)
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
func (client *Client) CheckTwcNotaryEpidentityThreemetaEx(request *CheckTwcNotaryEpidentityThreemetaRequest, runtime *util.RuntimeOptions) (_result *CheckTwcNotaryEpidentityThreemetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckTwcNotaryEpidentityThreemetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.epidentity.threemeta.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CheckTwcNotaryEpidentityFourmeta(request *CheckTwcNotaryEpidentityFourmetaRequest) (_result *CheckTwcNotaryEpidentityFourmetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CheckTwcNotaryEpidentityFourmetaResponse{}
	_body, _err := client.CheckTwcNotaryEpidentityFourmetaEx(request, runtime)
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
func (client *Client) CheckTwcNotaryEpidentityFourmetaEx(request *CheckTwcNotaryEpidentityFourmetaRequest, runtime *util.RuntimeOptions) (_result *CheckTwcNotaryEpidentityFourmetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckTwcNotaryEpidentityFourmetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.epidentity.fourmeta.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CheckTwcNotaryNotarizationOrder(request *CheckTwcNotaryNotarizationOrderRequest) (_result *CheckTwcNotaryNotarizationOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CheckTwcNotaryNotarizationOrderResponse{}
	_body, _err := client.CheckTwcNotaryNotarizationOrderEx(request, runtime)
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
func (client *Client) CheckTwcNotaryNotarizationOrderEx(request *CheckTwcNotaryNotarizationOrderRequest, runtime *util.RuntimeOptions) (_result *CheckTwcNotaryNotarizationOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckTwcNotaryNotarizationOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.notarization.order.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) UpdateTwcNotaryNotarizationOrder(request *UpdateTwcNotaryNotarizationOrderRequest) (_result *UpdateTwcNotaryNotarizationOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateTwcNotaryNotarizationOrderResponse{}
	_body, _err := client.UpdateTwcNotaryNotarizationOrderEx(request, runtime)
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
func (client *Client) UpdateTwcNotaryNotarizationOrderEx(request *UpdateTwcNotaryNotarizationOrderRequest, runtime *util.RuntimeOptions) (_result *UpdateTwcNotaryNotarizationOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateTwcNotaryNotarizationOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.notarization.order.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) SetTwcNotaryNotarizationOrder(request *SetTwcNotaryNotarizationOrderRequest) (_result *SetTwcNotaryNotarizationOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SetTwcNotaryNotarizationOrderResponse{}
	_body, _err := client.SetTwcNotaryNotarizationOrderEx(request, runtime)
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
func (client *Client) SetTwcNotaryNotarizationOrderEx(request *SetTwcNotaryNotarizationOrderRequest, runtime *util.RuntimeOptions) (_result *SetTwcNotaryNotarizationOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SetTwcNotaryNotarizationOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.notarization.order.set"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) InitTwcNotaryIdentificationFaceauth(request *InitTwcNotaryIdentificationFaceauthRequest) (_result *InitTwcNotaryIdentificationFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &InitTwcNotaryIdentificationFaceauthResponse{}
	_body, _err := client.InitTwcNotaryIdentificationFaceauthEx(request, runtime)
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
func (client *Client) InitTwcNotaryIdentificationFaceauthEx(request *InitTwcNotaryIdentificationFaceauthRequest, runtime *util.RuntimeOptions) (_result *InitTwcNotaryIdentificationFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitTwcNotaryIdentificationFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.identification.faceauth.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CertifyTwcNotaryIdentificationFaceauth(request *CertifyTwcNotaryIdentificationFaceauthRequest) (_result *CertifyTwcNotaryIdentificationFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CertifyTwcNotaryIdentificationFaceauthResponse{}
	_body, _err := client.CertifyTwcNotaryIdentificationFaceauthEx(request, runtime)
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
func (client *Client) CertifyTwcNotaryIdentificationFaceauthEx(request *CertifyTwcNotaryIdentificationFaceauthRequest, runtime *util.RuntimeOptions) (_result *CertifyTwcNotaryIdentificationFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CertifyTwcNotaryIdentificationFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.identification.faceauth.certify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryTwcNotaryIdentificationFaceauth(request *QueryTwcNotaryIdentificationFaceauthRequest) (_result *QueryTwcNotaryIdentificationFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryTwcNotaryIdentificationFaceauthResponse{}
	_body, _err := client.QueryTwcNotaryIdentificationFaceauthEx(request, runtime)
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
func (client *Client) QueryTwcNotaryIdentificationFaceauthEx(request *QueryTwcNotaryIdentificationFaceauthRequest, runtime *util.RuntimeOptions) (_result *QueryTwcNotaryIdentificationFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwcNotaryIdentificationFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.identification.faceauth.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryTwcNotaryEnterpriseFaceauth(request *QueryTwcNotaryEnterpriseFaceauthRequest) (_result *QueryTwcNotaryEnterpriseFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryTwcNotaryEnterpriseFaceauthResponse{}
	_body, _err := client.QueryTwcNotaryEnterpriseFaceauthEx(request, runtime)
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
func (client *Client) QueryTwcNotaryEnterpriseFaceauthEx(request *QueryTwcNotaryEnterpriseFaceauthRequest, runtime *util.RuntimeOptions) (_result *QueryTwcNotaryEnterpriseFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwcNotaryEnterpriseFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.enterprise.faceauth.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) InitTwcNotaryEnterpriseFaceauth(request *InitTwcNotaryEnterpriseFaceauthRequest) (_result *InitTwcNotaryEnterpriseFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &InitTwcNotaryEnterpriseFaceauthResponse{}
	_body, _err := client.InitTwcNotaryEnterpriseFaceauthEx(request, runtime)
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
func (client *Client) InitTwcNotaryEnterpriseFaceauthEx(request *InitTwcNotaryEnterpriseFaceauthRequest, runtime *util.RuntimeOptions) (_result *InitTwcNotaryEnterpriseFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitTwcNotaryEnterpriseFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.enterprise.faceauth.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CertifyTwcNotaryEnterpriseFaceauth(request *CertifyTwcNotaryEnterpriseFaceauthRequest) (_result *CertifyTwcNotaryEnterpriseFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CertifyTwcNotaryEnterpriseFaceauthResponse{}
	_body, _err := client.CertifyTwcNotaryEnterpriseFaceauthEx(request, runtime)
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
func (client *Client) CertifyTwcNotaryEnterpriseFaceauthEx(request *CertifyTwcNotaryEnterpriseFaceauthRequest, runtime *util.RuntimeOptions) (_result *CertifyTwcNotaryEnterpriseFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CertifyTwcNotaryEnterpriseFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.enterprise.faceauth.certify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryLeaseOrder(request *CreateTwcNotaryLeaseOrderRequest) (_result *CreateTwcNotaryLeaseOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryLeaseOrderResponse{}
	_body, _err := client.CreateTwcNotaryLeaseOrderEx(request, runtime)
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
func (client *Client) CreateTwcNotaryLeaseOrderEx(request *CreateTwcNotaryLeaseOrderRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryLeaseOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryLeaseOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.order.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryNotarizationBill(request *CreateTwcNotaryNotarizationBillRequest) (_result *CreateTwcNotaryNotarizationBillResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryNotarizationBillResponse{}
	_body, _err := client.CreateTwcNotaryNotarizationBillEx(request, runtime)
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
func (client *Client) CreateTwcNotaryNotarizationBillEx(request *CreateTwcNotaryNotarizationBillRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryNotarizationBillResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryNotarizationBillResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.notarization.bill.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) InitTwcNotaryCertification(request *InitTwcNotaryCertificationRequest) (_result *InitTwcNotaryCertificationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &InitTwcNotaryCertificationResponse{}
	_body, _err := client.InitTwcNotaryCertificationEx(request, runtime)
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
func (client *Client) InitTwcNotaryCertificationEx(request *InitTwcNotaryCertificationRequest, runtime *util.RuntimeOptions) (_result *InitTwcNotaryCertificationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitTwcNotaryCertificationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.certification.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryTwcNotaryCertification(request *QueryTwcNotaryCertificationRequest) (_result *QueryTwcNotaryCertificationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryTwcNotaryCertificationResponse{}
	_body, _err := client.QueryTwcNotaryCertificationEx(request, runtime)
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
func (client *Client) QueryTwcNotaryCertificationEx(request *QueryTwcNotaryCertificationRequest, runtime *util.RuntimeOptions) (_result *QueryTwcNotaryCertificationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwcNotaryCertificationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.certification.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) GetTwcNotaryTsrCertificate(request *GetTwcNotaryTsrCertificateRequest) (_result *GetTwcNotaryTsrCertificateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetTwcNotaryTsrCertificateResponse{}
	_body, _err := client.GetTwcNotaryTsrCertificateEx(request, runtime)
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
func (client *Client) GetTwcNotaryTsrCertificateEx(request *GetTwcNotaryTsrCertificateRequest, runtime *util.RuntimeOptions) (_result *GetTwcNotaryTsrCertificateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTwcNotaryTsrCertificateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.tsr.certificate.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) SaveTwcNotaryJointconstraintRecord(request *SaveTwcNotaryJointconstraintRecordRequest) (_result *SaveTwcNotaryJointconstraintRecordResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SaveTwcNotaryJointconstraintRecordResponse{}
	_body, _err := client.SaveTwcNotaryJointconstraintRecordEx(request, runtime)
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
func (client *Client) SaveTwcNotaryJointconstraintRecordEx(request *SaveTwcNotaryJointconstraintRecordRequest, runtime *util.RuntimeOptions) (_result *SaveTwcNotaryJointconstraintRecordResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveTwcNotaryJointconstraintRecordResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.jointconstraint.record.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) DeleteTwcNotaryJointconstraintRecord(request *DeleteTwcNotaryJointconstraintRecordRequest) (_result *DeleteTwcNotaryJointconstraintRecordResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &DeleteTwcNotaryJointconstraintRecordResponse{}
	_body, _err := client.DeleteTwcNotaryJointconstraintRecordEx(request, runtime)
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
func (client *Client) DeleteTwcNotaryJointconstraintRecordEx(request *DeleteTwcNotaryJointconstraintRecordRequest, runtime *util.RuntimeOptions) (_result *DeleteTwcNotaryJointconstraintRecordResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteTwcNotaryJointconstraintRecordResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.jointconstraint.record.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryTwcNotaryJointconstraintBreachrecord(request *QueryTwcNotaryJointconstraintBreachrecordRequest) (_result *QueryTwcNotaryJointconstraintBreachrecordResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryTwcNotaryJointconstraintBreachrecordResponse{}
	_body, _err := client.QueryTwcNotaryJointconstraintBreachrecordEx(request, runtime)
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
func (client *Client) QueryTwcNotaryJointconstraintBreachrecordEx(request *QueryTwcNotaryJointconstraintBreachrecordRequest, runtime *util.RuntimeOptions) (_result *QueryTwcNotaryJointconstraintBreachrecordResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwcNotaryJointconstraintBreachrecordResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.jointconstraint.breachrecord.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryTrans(request *CreateTwcNotaryTransRequest) (_result *CreateTwcNotaryTransResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryTransResponse{}
	_body, _err := client.CreateTwcNotaryTransEx(request, runtime)
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
func (client *Client) CreateTwcNotaryTransEx(request *CreateTwcNotaryTransRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryTransResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryTransResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.trans.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) GetTwcNotaryTrans(request *GetTwcNotaryTransRequest) (_result *GetTwcNotaryTransResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetTwcNotaryTransResponse{}
	_body, _err := client.GetTwcNotaryTransEx(request, runtime)
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
func (client *Client) GetTwcNotaryTransEx(request *GetTwcNotaryTransRequest, runtime *util.RuntimeOptions) (_result *GetTwcNotaryTransResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTwcNotaryTransResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.trans.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryText(request *CreateTwcNotaryTextRequest) (_result *CreateTwcNotaryTextResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryTextResponse{}
	_body, _err := client.CreateTwcNotaryTextEx(request, runtime)
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
func (client *Client) CreateTwcNotaryTextEx(request *CreateTwcNotaryTextRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryTextResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryTextResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.text.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) GetTwcNotaryText(request *GetTwcNotaryTextRequest) (_result *GetTwcNotaryTextResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetTwcNotaryTextResponse{}
	_body, _err := client.GetTwcNotaryTextEx(request, runtime)
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
func (client *Client) GetTwcNotaryTextEx(request *GetTwcNotaryTextRequest, runtime *util.RuntimeOptions) (_result *GetTwcNotaryTextResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTwcNotaryTextResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.text.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryFile(request *CreateTwcNotaryFileRequest) (_result *CreateTwcNotaryFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryFileResponse{}
	_body, _err := client.CreateTwcNotaryFileEx(request, runtime)
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
func (client *Client) CreateTwcNotaryFileEx(request *CreateTwcNotaryFileRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.file.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) GetTwcNotaryFile(request *GetTwcNotaryFileRequest) (_result *GetTwcNotaryFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetTwcNotaryFileResponse{}
	_body, _err := client.GetTwcNotaryFileEx(request, runtime)
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
func (client *Client) GetTwcNotaryFileEx(request *GetTwcNotaryFileRequest, runtime *util.RuntimeOptions) (_result *GetTwcNotaryFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTwcNotaryFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.file.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotarySource(request *CreateTwcNotarySourceRequest) (_result *CreateTwcNotarySourceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotarySourceResponse{}
	_body, _err := client.CreateTwcNotarySourceEx(request, runtime)
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
func (client *Client) CreateTwcNotarySourceEx(request *CreateTwcNotarySourceRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotarySourceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotarySourceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.source.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) GetTwcNotarySource(request *GetTwcNotarySourceRequest) (_result *GetTwcNotarySourceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetTwcNotarySourceResponse{}
	_body, _err := client.GetTwcNotarySourceEx(request, runtime)
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
func (client *Client) GetTwcNotarySourceEx(request *GetTwcNotarySourceRequest, runtime *util.RuntimeOptions) (_result *GetTwcNotarySourceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTwcNotarySourceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.source.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CheckTwcNotaryStatus(request *CheckTwcNotaryStatusRequest) (_result *CheckTwcNotaryStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CheckTwcNotaryStatusResponse{}
	_body, _err := client.CheckTwcNotaryStatusEx(request, runtime)
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
func (client *Client) CheckTwcNotaryStatusEx(request *CheckTwcNotaryStatusRequest, runtime *util.RuntimeOptions) (_result *CheckTwcNotaryStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckTwcNotaryStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.status.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) DeployTwcNotaryLeaseContract(request *DeployTwcNotaryLeaseContractRequest) (_result *DeployTwcNotaryLeaseContractResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &DeployTwcNotaryLeaseContractResponse{}
	_body, _err := client.DeployTwcNotaryLeaseContractEx(request, runtime)
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
func (client *Client) DeployTwcNotaryLeaseContractEx(request *DeployTwcNotaryLeaseContractRequest, runtime *util.RuntimeOptions) (_result *DeployTwcNotaryLeaseContractResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeployTwcNotaryLeaseContractResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.contract.deploy"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryLeaseProductinfo(request *CreateTwcNotaryLeaseProductinfoRequest) (_result *CreateTwcNotaryLeaseProductinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryLeaseProductinfoResponse{}
	_body, _err := client.CreateTwcNotaryLeaseProductinfoEx(request, runtime)
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
func (client *Client) CreateTwcNotaryLeaseProductinfoEx(request *CreateTwcNotaryLeaseProductinfoRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryLeaseProductinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryLeaseProductinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.productinfo.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) AuthTwcNotaryLeaseContract(request *AuthTwcNotaryLeaseContractRequest) (_result *AuthTwcNotaryLeaseContractResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AuthTwcNotaryLeaseContractResponse{}
	_body, _err := client.AuthTwcNotaryLeaseContractEx(request, runtime)
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
func (client *Client) AuthTwcNotaryLeaseContractEx(request *AuthTwcNotaryLeaseContractRequest, runtime *util.RuntimeOptions) (_result *AuthTwcNotaryLeaseContractResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthTwcNotaryLeaseContractResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.contract.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryLeaseUserinfo(request *CreateTwcNotaryLeaseUserinfoRequest) (_result *CreateTwcNotaryLeaseUserinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryLeaseUserinfoResponse{}
	_body, _err := client.CreateTwcNotaryLeaseUserinfoEx(request, runtime)
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
func (client *Client) CreateTwcNotaryLeaseUserinfoEx(request *CreateTwcNotaryLeaseUserinfoRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryLeaseUserinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryLeaseUserinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.userinfo.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryLeaseOrderinfo(request *CreateTwcNotaryLeaseOrderinfoRequest) (_result *CreateTwcNotaryLeaseOrderinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryLeaseOrderinfoResponse{}
	_body, _err := client.CreateTwcNotaryLeaseOrderinfoEx(request, runtime)
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
func (client *Client) CreateTwcNotaryLeaseOrderinfoEx(request *CreateTwcNotaryLeaseOrderinfoRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryLeaseOrderinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryLeaseOrderinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.orderinfo.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryLeasePromise(request *CreateTwcNotaryLeasePromiseRequest) (_result *CreateTwcNotaryLeasePromiseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryLeasePromiseResponse{}
	_body, _err := client.CreateTwcNotaryLeasePromiseEx(request, runtime)
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
func (client *Client) CreateTwcNotaryLeasePromiseEx(request *CreateTwcNotaryLeasePromiseRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryLeasePromiseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryLeasePromiseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.promise.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryLeaseVerifyinfo(request *CreateTwcNotaryLeaseVerifyinfoRequest) (_result *CreateTwcNotaryLeaseVerifyinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryLeaseVerifyinfoResponse{}
	_body, _err := client.CreateTwcNotaryLeaseVerifyinfoEx(request, runtime)
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
func (client *Client) CreateTwcNotaryLeaseVerifyinfoEx(request *CreateTwcNotaryLeaseVerifyinfoRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryLeaseVerifyinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryLeaseVerifyinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.verifyinfo.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryLeaseCreditpromise(request *CreateTwcNotaryLeaseCreditpromiseRequest) (_result *CreateTwcNotaryLeaseCreditpromiseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryLeaseCreditpromiseResponse{}
	_body, _err := client.CreateTwcNotaryLeaseCreditpromiseEx(request, runtime)
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
func (client *Client) CreateTwcNotaryLeaseCreditpromiseEx(request *CreateTwcNotaryLeaseCreditpromiseRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryLeaseCreditpromiseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryLeaseCreditpromiseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.creditpromise.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryLeaseDisburseinfo(request *CreateTwcNotaryLeaseDisburseinfoRequest) (_result *CreateTwcNotaryLeaseDisburseinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryLeaseDisburseinfoResponse{}
	_body, _err := client.CreateTwcNotaryLeaseDisburseinfoEx(request, runtime)
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
func (client *Client) CreateTwcNotaryLeaseDisburseinfoEx(request *CreateTwcNotaryLeaseDisburseinfoRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryLeaseDisburseinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryLeaseDisburseinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.disburseinfo.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryTwcNotaryLeaseOrderinfo(request *QueryTwcNotaryLeaseOrderinfoRequest) (_result *QueryTwcNotaryLeaseOrderinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryTwcNotaryLeaseOrderinfoResponse{}
	_body, _err := client.QueryTwcNotaryLeaseOrderinfoEx(request, runtime)
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
func (client *Client) QueryTwcNotaryLeaseOrderinfoEx(request *QueryTwcNotaryLeaseOrderinfoRequest, runtime *util.RuntimeOptions) (_result *QueryTwcNotaryLeaseOrderinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwcNotaryLeaseOrderinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.orderinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryFinanceTextnotary(request *CreateTwcNotaryFinanceTextnotaryRequest) (_result *CreateTwcNotaryFinanceTextnotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryFinanceTextnotaryResponse{}
	_body, _err := client.CreateTwcNotaryFinanceTextnotaryEx(request, runtime)
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
func (client *Client) CreateTwcNotaryFinanceTextnotaryEx(request *CreateTwcNotaryFinanceTextnotaryRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryFinanceTextnotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryFinanceTextnotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.finance.textnotary.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) GetTwcNotaryFinanceTextnotary(request *GetTwcNotaryFinanceTextnotaryRequest) (_result *GetTwcNotaryFinanceTextnotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetTwcNotaryFinanceTextnotaryResponse{}
	_body, _err := client.GetTwcNotaryFinanceTextnotaryEx(request, runtime)
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
func (client *Client) GetTwcNotaryFinanceTextnotaryEx(request *GetTwcNotaryFinanceTextnotaryRequest, runtime *util.RuntimeOptions) (_result *GetTwcNotaryFinanceTextnotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTwcNotaryFinanceTextnotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.finance.textnotary.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryFinanceFilenotary(request *CreateTwcNotaryFinanceFilenotaryRequest) (_result *CreateTwcNotaryFinanceFilenotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryFinanceFilenotaryResponse{}
	_body, _err := client.CreateTwcNotaryFinanceFilenotaryEx(request, runtime)
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
func (client *Client) CreateTwcNotaryFinanceFilenotaryEx(request *CreateTwcNotaryFinanceFilenotaryRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryFinanceFilenotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryFinanceFilenotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.finance.filenotary.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) GetTwcNotaryFinanceFilenotary(request *GetTwcNotaryFinanceFilenotaryRequest) (_result *GetTwcNotaryFinanceFilenotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetTwcNotaryFinanceFilenotaryResponse{}
	_body, _err := client.GetTwcNotaryFinanceFilenotaryEx(request, runtime)
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
func (client *Client) GetTwcNotaryFinanceFilenotaryEx(request *GetTwcNotaryFinanceFilenotaryRequest, runtime *util.RuntimeOptions) (_result *GetTwcNotaryFinanceFilenotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTwcNotaryFinanceFilenotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.finance.filenotary.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CheckTwcNotaryIndustryNotary(request *CheckTwcNotaryIndustryNotaryRequest) (_result *CheckTwcNotaryIndustryNotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CheckTwcNotaryIndustryNotaryResponse{}
	_body, _err := client.CheckTwcNotaryIndustryNotaryEx(request, runtime)
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
func (client *Client) CheckTwcNotaryIndustryNotaryEx(request *CheckTwcNotaryIndustryNotaryRequest, runtime *util.RuntimeOptions) (_result *CheckTwcNotaryIndustryNotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckTwcNotaryIndustryNotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.industry.notary.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) UpdateTwcNotaryLeaseContract(request *UpdateTwcNotaryLeaseContractRequest) (_result *UpdateTwcNotaryLeaseContractResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateTwcNotaryLeaseContractResponse{}
	_body, _err := client.UpdateTwcNotaryLeaseContractEx(request, runtime)
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
func (client *Client) UpdateTwcNotaryLeaseContractEx(request *UpdateTwcNotaryLeaseContractRequest, runtime *util.RuntimeOptions) (_result *UpdateTwcNotaryLeaseContractResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateTwcNotaryLeaseContractResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.contract.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotarySueBreakpromiseinfo(request *CreateTwcNotarySueBreakpromiseinfoRequest) (_result *CreateTwcNotarySueBreakpromiseinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotarySueBreakpromiseinfoResponse{}
	_body, _err := client.CreateTwcNotarySueBreakpromiseinfoEx(request, runtime)
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
func (client *Client) CreateTwcNotarySueBreakpromiseinfoEx(request *CreateTwcNotarySueBreakpromiseinfoRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotarySueBreakpromiseinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotarySueBreakpromiseinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.sue.breakpromiseinfo.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) UpdateTwcNotarySueBreakpromiseinfo(request *UpdateTwcNotarySueBreakpromiseinfoRequest) (_result *UpdateTwcNotarySueBreakpromiseinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateTwcNotarySueBreakpromiseinfoResponse{}
	_body, _err := client.UpdateTwcNotarySueBreakpromiseinfoEx(request, runtime)
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
func (client *Client) UpdateTwcNotarySueBreakpromiseinfoEx(request *UpdateTwcNotarySueBreakpromiseinfoRequest, runtime *util.RuntimeOptions) (_result *UpdateTwcNotarySueBreakpromiseinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateTwcNotarySueBreakpromiseinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.sue.breakpromiseinfo.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) DeleteTwcNotarySueBreakpromiseinfo(request *DeleteTwcNotarySueBreakpromiseinfoRequest) (_result *DeleteTwcNotarySueBreakpromiseinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &DeleteTwcNotarySueBreakpromiseinfoResponse{}
	_body, _err := client.DeleteTwcNotarySueBreakpromiseinfoEx(request, runtime)
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
func (client *Client) DeleteTwcNotarySueBreakpromiseinfoEx(request *DeleteTwcNotarySueBreakpromiseinfoRequest, runtime *util.RuntimeOptions) (_result *DeleteTwcNotarySueBreakpromiseinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteTwcNotarySueBreakpromiseinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.sue.breakpromiseinfo.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryTwcNotarySueUserinfo(request *QueryTwcNotarySueUserinfoRequest) (_result *QueryTwcNotarySueUserinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryTwcNotarySueUserinfoResponse{}
	_body, _err := client.QueryTwcNotarySueUserinfoEx(request, runtime)
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
func (client *Client) QueryTwcNotarySueUserinfoEx(request *QueryTwcNotarySueUserinfoRequest, runtime *util.RuntimeOptions) (_result *QueryTwcNotarySueUserinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwcNotarySueUserinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.sue.userinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) UpdateTwcNotarySueExeplarycontract(request *UpdateTwcNotarySueExeplarycontractRequest) (_result *UpdateTwcNotarySueExeplarycontractResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateTwcNotarySueExeplarycontractResponse{}
	_body, _err := client.UpdateTwcNotarySueExeplarycontractEx(request, runtime)
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
func (client *Client) UpdateTwcNotarySueExeplarycontractEx(request *UpdateTwcNotarySueExeplarycontractRequest, runtime *util.RuntimeOptions) (_result *UpdateTwcNotarySueExeplarycontractResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateTwcNotarySueExeplarycontractResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.sue.exeplarycontract.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) UpdateTwcNotarySueExemplaryrevert(request *UpdateTwcNotarySueExemplaryrevertRequest) (_result *UpdateTwcNotarySueExemplaryrevertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateTwcNotarySueExemplaryrevertResponse{}
	_body, _err := client.UpdateTwcNotarySueExemplaryrevertEx(request, runtime)
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
func (client *Client) UpdateTwcNotarySueExemplaryrevertEx(request *UpdateTwcNotarySueExemplaryrevertRequest, runtime *util.RuntimeOptions) (_result *UpdateTwcNotarySueExemplaryrevertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateTwcNotarySueExemplaryrevertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.sue.exemplaryrevert.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryLeaseAudit(request *CreateTwcNotaryLeaseAuditRequest) (_result *CreateTwcNotaryLeaseAuditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryLeaseAuditResponse{}
	_body, _err := client.CreateTwcNotaryLeaseAuditEx(request, runtime)
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
func (client *Client) CreateTwcNotaryLeaseAuditEx(request *CreateTwcNotaryLeaseAuditRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryLeaseAuditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryLeaseAuditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.audit.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryLeasePaymentfile(request *CreateTwcNotaryLeasePaymentfileRequest) (_result *CreateTwcNotaryLeasePaymentfileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryLeasePaymentfileResponse{}
	_body, _err := client.CreateTwcNotaryLeasePaymentfileEx(request, runtime)
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
func (client *Client) CreateTwcNotaryLeasePaymentfileEx(request *CreateTwcNotaryLeasePaymentfileRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryLeasePaymentfileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryLeasePaymentfileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.paymentfile.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryLeaseRental(request *CreateTwcNotaryLeaseRentalRequest) (_result *CreateTwcNotaryLeaseRentalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryLeaseRentalResponse{}
	_body, _err := client.CreateTwcNotaryLeaseRentalEx(request, runtime)
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
func (client *Client) CreateTwcNotaryLeaseRentalEx(request *CreateTwcNotaryLeaseRentalRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryLeaseRentalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryLeaseRentalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.rental.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryLeaseClearing(request *CreateTwcNotaryLeaseClearingRequest) (_result *CreateTwcNotaryLeaseClearingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryLeaseClearingResponse{}
	_body, _err := client.CreateTwcNotaryLeaseClearingEx(request, runtime)
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
func (client *Client) CreateTwcNotaryLeaseClearingEx(request *CreateTwcNotaryLeaseClearingRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryLeaseClearingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryLeaseClearingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.clearing.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryLeaseRepayment(request *CreateTwcNotaryLeaseRepaymentRequest) (_result *CreateTwcNotaryLeaseRepaymentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryLeaseRepaymentResponse{}
	_body, _err := client.CreateTwcNotaryLeaseRepaymentEx(request, runtime)
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
func (client *Client) CreateTwcNotaryLeaseRepaymentEx(request *CreateTwcNotaryLeaseRepaymentRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryLeaseRepaymentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryLeaseRepaymentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.repayment.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryLeaseNotifyregister(request *CreateTwcNotaryLeaseNotifyregisterRequest) (_result *CreateTwcNotaryLeaseNotifyregisterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryLeaseNotifyregisterResponse{}
	_body, _err := client.CreateTwcNotaryLeaseNotifyregisterEx(request, runtime)
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
func (client *Client) CreateTwcNotaryLeaseNotifyregisterEx(request *CreateTwcNotaryLeaseNotifyregisterRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryLeaseNotifyregisterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryLeaseNotifyregisterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.notifyregister.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryTwcNotaryLeaseIotinfo(request *QueryTwcNotaryLeaseIotinfoRequest) (_result *QueryTwcNotaryLeaseIotinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryTwcNotaryLeaseIotinfoResponse{}
	_body, _err := client.QueryTwcNotaryLeaseIotinfoEx(request, runtime)
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
func (client *Client) QueryTwcNotaryLeaseIotinfoEx(request *QueryTwcNotaryLeaseIotinfoRequest, runtime *util.RuntimeOptions) (_result *QueryTwcNotaryLeaseIotinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwcNotaryLeaseIotinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.iotinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryCourtTextnotary(request *CreateTwcNotaryCourtTextnotaryRequest) (_result *CreateTwcNotaryCourtTextnotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryCourtTextnotaryResponse{}
	_body, _err := client.CreateTwcNotaryCourtTextnotaryEx(request, runtime)
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
func (client *Client) CreateTwcNotaryCourtTextnotaryEx(request *CreateTwcNotaryCourtTextnotaryRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryCourtTextnotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryCourtTextnotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.court.textnotary.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) GetTwcNotaryCourtTextnotary(request *GetTwcNotaryCourtTextnotaryRequest) (_result *GetTwcNotaryCourtTextnotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetTwcNotaryCourtTextnotaryResponse{}
	_body, _err := client.GetTwcNotaryCourtTextnotaryEx(request, runtime)
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
func (client *Client) GetTwcNotaryCourtTextnotaryEx(request *GetTwcNotaryCourtTextnotaryRequest, runtime *util.RuntimeOptions) (_result *GetTwcNotaryCourtTextnotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTwcNotaryCourtTextnotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.court.textnotary.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryCourtFilenotary(request *CreateTwcNotaryCourtFilenotaryRequest) (_result *CreateTwcNotaryCourtFilenotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryCourtFilenotaryResponse{}
	_body, _err := client.CreateTwcNotaryCourtFilenotaryEx(request, runtime)
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
func (client *Client) CreateTwcNotaryCourtFilenotaryEx(request *CreateTwcNotaryCourtFilenotaryRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryCourtFilenotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryCourtFilenotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.court.filenotary.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) GetTwcNotaryCourtFilenotary(request *GetTwcNotaryCourtFilenotaryRequest) (_result *GetTwcNotaryCourtFilenotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetTwcNotaryCourtFilenotaryResponse{}
	_body, _err := client.GetTwcNotaryCourtFilenotaryEx(request, runtime)
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
func (client *Client) GetTwcNotaryCourtFilenotaryEx(request *GetTwcNotaryCourtFilenotaryRequest, runtime *util.RuntimeOptions) (_result *GetTwcNotaryCourtFilenotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTwcNotaryCourtFilenotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.court.filenotary.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryLeaseRoute(request *CreateTwcNotaryLeaseRouteRequest) (_result *CreateTwcNotaryLeaseRouteResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryLeaseRouteResponse{}
	_body, _err := client.CreateTwcNotaryLeaseRouteEx(request, runtime)
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
func (client *Client) CreateTwcNotaryLeaseRouteEx(request *CreateTwcNotaryLeaseRouteRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryLeaseRouteResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryLeaseRouteResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.route.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryTwcNotaryLeaseEncryptedinfo(request *QueryTwcNotaryLeaseEncryptedinfoRequest) (_result *QueryTwcNotaryLeaseEncryptedinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryTwcNotaryLeaseEncryptedinfoResponse{}
	_body, _err := client.QueryTwcNotaryLeaseEncryptedinfoEx(request, runtime)
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
func (client *Client) QueryTwcNotaryLeaseEncryptedinfoEx(request *QueryTwcNotaryLeaseEncryptedinfoRequest, runtime *util.RuntimeOptions) (_result *QueryTwcNotaryLeaseEncryptedinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwcNotaryLeaseEncryptedinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.encryptedinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryContractText(request *CreateTwcNotaryContractTextRequest) (_result *CreateTwcNotaryContractTextResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryContractTextResponse{}
	_body, _err := client.CreateTwcNotaryContractTextEx(request, runtime)
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
func (client *Client) CreateTwcNotaryContractTextEx(request *CreateTwcNotaryContractTextRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryContractTextResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryContractTextResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.text.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ApplyTwcNotaryContractReport(request *ApplyTwcNotaryContractReportRequest) (_result *ApplyTwcNotaryContractReportResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ApplyTwcNotaryContractReportResponse{}
	_body, _err := client.ApplyTwcNotaryContractReportEx(request, runtime)
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
func (client *Client) ApplyTwcNotaryContractReportEx(request *ApplyTwcNotaryContractReportRequest, runtime *util.RuntimeOptions) (_result *ApplyTwcNotaryContractReportResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyTwcNotaryContractReportResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.report.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) GetTwcNotaryContractText(request *GetTwcNotaryContractTextRequest) (_result *GetTwcNotaryContractTextResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetTwcNotaryContractTextResponse{}
	_body, _err := client.GetTwcNotaryContractTextEx(request, runtime)
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
func (client *Client) GetTwcNotaryContractTextEx(request *GetTwcNotaryContractTextRequest, runtime *util.RuntimeOptions) (_result *GetTwcNotaryContractTextResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTwcNotaryContractTextResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.contract.text.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryInternalTrans(request *CreateTwcNotaryInternalTransRequest) (_result *CreateTwcNotaryInternalTransResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryInternalTransResponse{}
	_body, _err := client.CreateTwcNotaryInternalTransEx(request, runtime)
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
func (client *Client) CreateTwcNotaryInternalTransEx(request *CreateTwcNotaryInternalTransRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryInternalTransResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryInternalTransResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.internal.trans.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryInternalText(request *CreateTwcNotaryInternalTextRequest) (_result *CreateTwcNotaryInternalTextResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryInternalTextResponse{}
	_body, _err := client.CreateTwcNotaryInternalTextEx(request, runtime)
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
func (client *Client) CreateTwcNotaryInternalTextEx(request *CreateTwcNotaryInternalTextRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryInternalTextResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryInternalTextResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.internal.text.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryLeaseText(request *CreateTwcNotaryLeaseTextRequest) (_result *CreateTwcNotaryLeaseTextResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryLeaseTextResponse{}
	_body, _err := client.CreateTwcNotaryLeaseTextEx(request, runtime)
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
func (client *Client) CreateTwcNotaryLeaseTextEx(request *CreateTwcNotaryLeaseTextRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryLeaseTextResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryLeaseTextResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.text.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryLeaseFile(request *CreateTwcNotaryLeaseFileRequest) (_result *CreateTwcNotaryLeaseFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryLeaseFileResponse{}
	_body, _err := client.CreateTwcNotaryLeaseFileEx(request, runtime)
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
func (client *Client) CreateTwcNotaryLeaseFileEx(request *CreateTwcNotaryLeaseFileRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryLeaseFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryLeaseFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.file.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ListTwcNotaryLeaseNotary(request *ListTwcNotaryLeaseNotaryRequest) (_result *ListTwcNotaryLeaseNotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ListTwcNotaryLeaseNotaryResponse{}
	_body, _err := client.ListTwcNotaryLeaseNotaryEx(request, runtime)
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
func (client *Client) ListTwcNotaryLeaseNotaryEx(request *ListTwcNotaryLeaseNotaryRequest, runtime *util.RuntimeOptions) (_result *ListTwcNotaryLeaseNotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListTwcNotaryLeaseNotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.notary.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryTwcNotaryLeaseApplication(request *QueryTwcNotaryLeaseApplicationRequest) (_result *QueryTwcNotaryLeaseApplicationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryTwcNotaryLeaseApplicationResponse{}
	_body, _err := client.QueryTwcNotaryLeaseApplicationEx(request, runtime)
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
func (client *Client) QueryTwcNotaryLeaseApplicationEx(request *QueryTwcNotaryLeaseApplicationRequest, runtime *util.RuntimeOptions) (_result *QueryTwcNotaryLeaseApplicationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwcNotaryLeaseApplicationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.application.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryTwcNotaryLeaseApplicationdetailinfo(request *QueryTwcNotaryLeaseApplicationdetailinfoRequest) (_result *QueryTwcNotaryLeaseApplicationdetailinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryTwcNotaryLeaseApplicationdetailinfoResponse{}
	_body, _err := client.QueryTwcNotaryLeaseApplicationdetailinfoEx(request, runtime)
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
func (client *Client) QueryTwcNotaryLeaseApplicationdetailinfoEx(request *QueryTwcNotaryLeaseApplicationdetailinfoRequest, runtime *util.RuntimeOptions) (_result *QueryTwcNotaryLeaseApplicationdetailinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwcNotaryLeaseApplicationdetailinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.applicationdetailinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) SetTwcNotaryLeaseRepaymentstatus(request *SetTwcNotaryLeaseRepaymentstatusRequest) (_result *SetTwcNotaryLeaseRepaymentstatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SetTwcNotaryLeaseRepaymentstatusResponse{}
	_body, _err := client.SetTwcNotaryLeaseRepaymentstatusEx(request, runtime)
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
func (client *Client) SetTwcNotaryLeaseRepaymentstatusEx(request *SetTwcNotaryLeaseRepaymentstatusRequest, runtime *util.RuntimeOptions) (_result *SetTwcNotaryLeaseRepaymentstatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SetTwcNotaryLeaseRepaymentstatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.repaymentstatus.set"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateTwcNotaryLeaseSupplierinfo(request *CreateTwcNotaryLeaseSupplierinfoRequest) (_result *CreateTwcNotaryLeaseSupplierinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateTwcNotaryLeaseSupplierinfoResponse{}
	_body, _err := client.CreateTwcNotaryLeaseSupplierinfoEx(request, runtime)
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
func (client *Client) CreateTwcNotaryLeaseSupplierinfoEx(request *CreateTwcNotaryLeaseSupplierinfoRequest, runtime *util.RuntimeOptions) (_result *CreateTwcNotaryLeaseSupplierinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTwcNotaryLeaseSupplierinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("twc.notary.lease.supplierinfo.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
