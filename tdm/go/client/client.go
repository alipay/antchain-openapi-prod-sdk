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

// 链的信息
type ChainInfo struct {
	// 块高
	BlockHeight *string `json:"block_height,omitempty" xml:"block_height,omitempty"`
	// 交易时间
	TranslateDate *string `json:"translate_date,omitempty" xml:"translate_date,omitempty"`
	// hash(64位)
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s ChainInfo) String() string {
	return tea.Prettify(s)
}

func (s ChainInfo) GoString() string {
	return s.String()
}

func (s *ChainInfo) SetBlockHeight(v string) *ChainInfo {
	s.BlockHeight = &v
	return s
}

func (s *ChainInfo) SetTranslateDate(v string) *ChainInfo {
	s.TranslateDate = &v
	return s
}

func (s *ChainInfo) SetTxHash(v string) *ChainInfo {
	s.TxHash = &v
	return s
}

// 授权协议
type AuthAgreement struct {
	// 授权协议code
	AuthAgreementCode *string `json:"auth_agreement_code,omitempty" xml:"auth_agreement_code,omitempty" require:"true"`
	// 授权协议类型：
	// TIME、时间授权
	// COUNT、次数授权
	// TIME_COUNT、时间范围内次数授权
	AuthAgreementType *string `json:"auth_agreement_type,omitempty" xml:"auth_agreement_type,omitempty" require:"true"`
	// 授权开始ishi见
	AuthBeginTime *string `json:"auth_begin_time,omitempty" xml:"auth_begin_time,omitempty"`
	// 授权截止日期
	//
	//
	AuthEndTime *string `json:"auth_end_time,omitempty" xml:"auth_end_time,omitempty"`
	// 授权次数
	//
	//
	AuthCount *int64 `json:"auth_count,omitempty" xml:"auth_count,omitempty"`
	// 剩余授权次数
	AuthBalanceCount *int64 `json:"auth_balance_count,omitempty" xml:"auth_balance_count,omitempty"`
}

func (s AuthAgreement) String() string {
	return tea.Prettify(s)
}

func (s AuthAgreement) GoString() string {
	return s.String()
}

func (s *AuthAgreement) SetAuthAgreementCode(v string) *AuthAgreement {
	s.AuthAgreementCode = &v
	return s
}

func (s *AuthAgreement) SetAuthAgreementType(v string) *AuthAgreement {
	s.AuthAgreementType = &v
	return s
}

func (s *AuthAgreement) SetAuthBeginTime(v string) *AuthAgreement {
	s.AuthBeginTime = &v
	return s
}

func (s *AuthAgreement) SetAuthEndTime(v string) *AuthAgreement {
	s.AuthEndTime = &v
	return s
}

func (s *AuthAgreement) SetAuthCount(v int64) *AuthAgreement {
	s.AuthCount = &v
	return s
}

func (s *AuthAgreement) SetAuthBalanceCount(v int64) *AuthAgreement {
	s.AuthBalanceCount = &v
	return s
}

// 证明文件使用记录保存参数 extendParams
type CertUseParams struct {
	// 证明文件ID
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty" require:"true"`
}

func (s CertUseParams) String() string {
	return tea.Prettify(s)
}

func (s CertUseParams) GoString() string {
	return s.String()
}

func (s *CertUseParams) SetIssueId(v string) *CertUseParams {
	s.IssueId = &v
	return s
}

// 授权使用记录
//
//
type AuthUsedRecord struct {
	// 被授权租户名称：
	//
	// 身份证号/统一社会组织机构信用码
	//
	//
	AuthorizedName *string `json:"authorized_name,omitempty" xml:"authorized_name,omitempty" require:"true"`
	// 授权码
	//
	//
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty" require:"true"`
	// 链的信息
	ChainInfo *ChainInfo `json:"chain_info,omitempty" xml:"chain_info,omitempty" require:"true"`
	// 扩展字段
	ExtendParams *string `json:"extend_params,omitempty" xml:"extend_params,omitempty" require:"true"`
	// 标的物,产品码名称
	//
	//
	TargetName *string `json:"target_name,omitempty" xml:"target_name,omitempty" require:"true"`
	// 授权可信内容
	TeeData *string `json:"tee_data,omitempty" xml:"tee_data,omitempty"`
	// 数据使用时间
	//
	//
	UseDate *string `json:"use_date,omitempty" xml:"use_date,omitempty" require:"true"`
}

func (s AuthUsedRecord) String() string {
	return tea.Prettify(s)
}

func (s AuthUsedRecord) GoString() string {
	return s.String()
}

func (s *AuthUsedRecord) SetAuthorizedName(v string) *AuthUsedRecord {
	s.AuthorizedName = &v
	return s
}

func (s *AuthUsedRecord) SetAuthCode(v string) *AuthUsedRecord {
	s.AuthCode = &v
	return s
}

func (s *AuthUsedRecord) SetChainInfo(v *ChainInfo) *AuthUsedRecord {
	s.ChainInfo = v
	return s
}

func (s *AuthUsedRecord) SetExtendParams(v string) *AuthUsedRecord {
	s.ExtendParams = &v
	return s
}

func (s *AuthUsedRecord) SetTargetName(v string) *AuthUsedRecord {
	s.TargetName = &v
	return s
}

func (s *AuthUsedRecord) SetTeeData(v string) *AuthUsedRecord {
	s.TeeData = &v
	return s
}

func (s *AuthUsedRecord) SetUseDate(v string) *AuthUsedRecord {
	s.UseDate = &v
	return s
}

// 证明列表查询返回
type CertSummary struct {
	// 证明文件ID
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty" require:"true"`
	// 证明文件类型
	IssueCertType *string `json:"issue_cert_type,omitempty" xml:"issue_cert_type,omitempty" require:"true"`
	// 证明文件描述
	IssueCertTypeDesc *string `json:"issue_cert_type_desc,omitempty" xml:"issue_cert_type_desc,omitempty" require:"true"`
	// 证明开具时间
	IssueTime *string `json:"issue_time,omitempty" xml:"issue_time,omitempty" require:"true"`
	// 证明图标（未使用）
	IssueIcon *string `json:"issue_icon,omitempty" xml:"issue_icon,omitempty"`
}

func (s CertSummary) String() string {
	return tea.Prettify(s)
}

func (s CertSummary) GoString() string {
	return s.String()
}

func (s *CertSummary) SetIssueId(v string) *CertSummary {
	s.IssueId = &v
	return s
}

func (s *CertSummary) SetIssueCertType(v string) *CertSummary {
	s.IssueCertType = &v
	return s
}

func (s *CertSummary) SetIssueCertTypeDesc(v string) *CertSummary {
	s.IssueCertTypeDesc = &v
	return s
}

func (s *CertSummary) SetIssueTime(v string) *CertSummary {
	s.IssueTime = &v
	return s
}

func (s *CertSummary) SetIssueIcon(v string) *CertSummary {
	s.IssueIcon = &v
	return s
}

// 授权记录
type AuthRecord struct {
	// 被授权租户名称：
	// 身份证号/统一社会组织机构信用码
	AuthorizedName *string `json:"authorized_name,omitempty" xml:"authorized_name,omitempty" require:"true"`
	// 授权协议规则
	AuthAgreement *AuthAgreement `json:"auth_agreement,omitempty" xml:"auth_agreement,omitempty" require:"true"`
	// 授权码
	//
	//
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty" require:"true"`
	// 授权时间
	//
	AuthDate *string `json:"auth_date,omitempty" xml:"auth_date,omitempty" require:"true"`
	// 授权有效状态：
	// 1、生效中、
	// 0、失效
	//
	//
	AuthStatus *string `json:"auth_status,omitempty" xml:"auth_status,omitempty" require:"true"`
	// 链的信息
	ChainInfo *ChainInfo `json:"chain_info,omitempty" xml:"chain_info,omitempty" require:"true"`
	// 授权租户身份ID：
	// 身份证号/统一社会组织机构信用码
	DataOwnerIdentity *string `json:"data_owner_identity,omitempty" xml:"data_owner_identity,omitempty" require:"true"`
	// 授权用户名称
	DataOwnerName *string `json:"data_owner_name,omitempty" xml:"data_owner_name,omitempty" require:"true"`
	// 扩展字段，与target_name拼成可见的授权详情name
	//
	//
	ExtendParams *string `json:"extend_params,omitempty" xml:"extend_params,omitempty" require:"true"`
	// 标的物名称
	//
	//
	TargetName *string `json:"target_name,omitempty" xml:"target_name,omitempty" require:"true"`
	// 授权可信数据
	TeeData *string `json:"tee_data,omitempty" xml:"tee_data,omitempty"`
}

func (s AuthRecord) String() string {
	return tea.Prettify(s)
}

func (s AuthRecord) GoString() string {
	return s.String()
}

func (s *AuthRecord) SetAuthorizedName(v string) *AuthRecord {
	s.AuthorizedName = &v
	return s
}

func (s *AuthRecord) SetAuthAgreement(v *AuthAgreement) *AuthRecord {
	s.AuthAgreement = v
	return s
}

func (s *AuthRecord) SetAuthCode(v string) *AuthRecord {
	s.AuthCode = &v
	return s
}

func (s *AuthRecord) SetAuthDate(v string) *AuthRecord {
	s.AuthDate = &v
	return s
}

func (s *AuthRecord) SetAuthStatus(v string) *AuthRecord {
	s.AuthStatus = &v
	return s
}

func (s *AuthRecord) SetChainInfo(v *ChainInfo) *AuthRecord {
	s.ChainInfo = v
	return s
}

func (s *AuthRecord) SetDataOwnerIdentity(v string) *AuthRecord {
	s.DataOwnerIdentity = &v
	return s
}

func (s *AuthRecord) SetDataOwnerName(v string) *AuthRecord {
	s.DataOwnerName = &v
	return s
}

func (s *AuthRecord) SetExtendParams(v string) *AuthRecord {
	s.ExtendParams = &v
	return s
}

func (s *AuthRecord) SetTargetName(v string) *AuthRecord {
	s.TargetName = &v
	return s
}

func (s *AuthRecord) SetTeeData(v string) *AuthRecord {
	s.TeeData = &v
	return s
}

// 公积金中心用户信息
type CpfUserAccountInfo struct {
	// 账户状态
	AccountStatus *string `json:"account_status,omitempty" xml:"account_status,omitempty" require:"true"`
	// 账户余额
	Balance *string `json:"balance,omitempty" xml:"balance,omitempty" require:"true"`
	// 缴纳单位名称
	InstName *string `json:"inst_name,omitempty" xml:"inst_name,omitempty" require:"true"`
	// 个人账户
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
}

func (s CpfUserAccountInfo) String() string {
	return tea.Prettify(s)
}

func (s CpfUserAccountInfo) GoString() string {
	return s.String()
}

func (s *CpfUserAccountInfo) SetAccountStatus(v string) *CpfUserAccountInfo {
	s.AccountStatus = &v
	return s
}

func (s *CpfUserAccountInfo) SetBalance(v string) *CpfUserAccountInfo {
	s.Balance = &v
	return s
}

func (s *CpfUserAccountInfo) SetInstName(v string) *CpfUserAccountInfo {
	s.InstName = &v
	return s
}

func (s *CpfUserAccountInfo) SetAccountId(v string) *CpfUserAccountInfo {
	s.AccountId = &v
	return s
}

// 证明使用记录返回结果
type CertUsageLogVO struct {
	// 使用方名称
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 使用时间
	UsageTime *string `json:"usage_time,omitempty" xml:"usage_time,omitempty" require:"true"`
	// 证明类型
	IssueCertType *string `json:"issue_cert_type,omitempty" xml:"issue_cert_type,omitempty" require:"true"`
	// 证明类型描述
	IssueCertTypeDesc *string `json:"issue_cert_type_desc,omitempty" xml:"issue_cert_type_desc,omitempty" require:"true"`
	// 证明开具时间
	IssueTime *string `json:"issue_time,omitempty" xml:"issue_time,omitempty" require:"true"`
	// 用途
	Purpose *string `json:"purpose,omitempty" xml:"purpose,omitempty" require:"true"`
	// 业务流水号
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
}

func (s CertUsageLogVO) String() string {
	return tea.Prettify(s)
}

func (s CertUsageLogVO) GoString() string {
	return s.String()
}

func (s *CertUsageLogVO) SetUserName(v string) *CertUsageLogVO {
	s.UserName = &v
	return s
}

func (s *CertUsageLogVO) SetUsageTime(v string) *CertUsageLogVO {
	s.UsageTime = &v
	return s
}

func (s *CertUsageLogVO) SetIssueCertType(v string) *CertUsageLogVO {
	s.IssueCertType = &v
	return s
}

func (s *CertUsageLogVO) SetIssueCertTypeDesc(v string) *CertUsageLogVO {
	s.IssueCertTypeDesc = &v
	return s
}

func (s *CertUsageLogVO) SetIssueTime(v string) *CertUsageLogVO {
	s.IssueTime = &v
	return s
}

func (s *CertUsageLogVO) SetPurpose(v string) *CertUsageLogVO {
	s.Purpose = &v
	return s
}

func (s *CertUsageLogVO) SetBizId(v string) *CertUsageLogVO {
	s.BizId = &v
	return s
}

// 证明开具信息
type IssueCertInfo struct {
	// 证明文件ID
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty" require:"true"`
	// 证明开具时间
	IssueTime *string `json:"issue_time,omitempty" xml:"issue_time,omitempty" require:"true"`
	// 证明开具单位
	ProviderName *string `json:"provider_name,omitempty" xml:"provider_name,omitempty"`
	// 证明类型
	IssueCertType *string `json:"issue_cert_type,omitempty" xml:"issue_cert_type,omitempty" require:"true"`
	// 证明抬头
	DepositCertTag *string `json:"deposit_cert_tag,omitempty" xml:"deposit_cert_tag,omitempty"`
	// 证明文件png图片存储地址
	DepositCert *string `json:"deposit_cert,omitempty" xml:"deposit_cert,omitempty"`
	// 证明文件pdf获取地址(不带二维码)
	DepositCertPdf *string `json:"deposit_cert_pdf,omitempty" xml:"deposit_cert_pdf,omitempty"`
	// 证明文件pdf获取地址(带验真码)
	DepositCertPdfQr *string `json:"deposit_cert_pdf_qr,omitempty" xml:"deposit_cert_pdf_qr,omitempty"`
}

func (s IssueCertInfo) String() string {
	return tea.Prettify(s)
}

func (s IssueCertInfo) GoString() string {
	return s.String()
}

func (s *IssueCertInfo) SetIssueId(v string) *IssueCertInfo {
	s.IssueId = &v
	return s
}

func (s *IssueCertInfo) SetIssueTime(v string) *IssueCertInfo {
	s.IssueTime = &v
	return s
}

func (s *IssueCertInfo) SetProviderName(v string) *IssueCertInfo {
	s.ProviderName = &v
	return s
}

func (s *IssueCertInfo) SetIssueCertType(v string) *IssueCertInfo {
	s.IssueCertType = &v
	return s
}

func (s *IssueCertInfo) SetDepositCertTag(v string) *IssueCertInfo {
	s.DepositCertTag = &v
	return s
}

func (s *IssueCertInfo) SetDepositCert(v string) *IssueCertInfo {
	s.DepositCert = &v
	return s
}

func (s *IssueCertInfo) SetDepositCertPdf(v string) *IssueCertInfo {
	s.DepositCertPdf = &v
	return s
}

func (s *IssueCertInfo) SetDepositCertPdfQr(v string) *IssueCertInfo {
	s.DepositCertPdfQr = &v
	return s
}

// 属性
type AuthProperty struct {
	// 地区
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// {"山西","广东"}
	Value []*string `json:"value,omitempty" xml:"value,omitempty" require:"true" type:"Repeated"`
}

func (s AuthProperty) String() string {
	return tea.Prettify(s)
}

func (s AuthProperty) GoString() string {
	return s.String()
}

func (s *AuthProperty) SetKey(v string) *AuthProperty {
	s.Key = &v
	return s
}

func (s *AuthProperty) SetValue(v []*string) *AuthProperty {
	s.Value = v
	return s
}

// 用户贷款信息
type CpfUserLoanInfo struct {
	// 用户证件号码
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 证件类型
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 配偶证件号码
	PoId *string `json:"po_id,omitempty" xml:"po_id,omitempty" require:"true"`
	// 配偶姓名
	PoName *string `json:"po_name,omitempty" xml:"po_name,omitempty" require:"true"`
	// 贷款合同编号
	LoanId *string `json:"loan_id,omitempty" xml:"loan_id,omitempty" require:"true"`
	// 贷款余额
	LoanBalance *string `json:"loan_balance,omitempty" xml:"loan_balance,omitempty" require:"true"`
	// 贷款合同状态
	LoanStatus *string `json:"loan_status,omitempty" xml:"loan_status,omitempty" require:"true"`
}

func (s CpfUserLoanInfo) String() string {
	return tea.Prettify(s)
}

func (s CpfUserLoanInfo) GoString() string {
	return s.String()
}

func (s *CpfUserLoanInfo) SetUserId(v string) *CpfUserLoanInfo {
	s.UserId = &v
	return s
}

func (s *CpfUserLoanInfo) SetUserName(v string) *CpfUserLoanInfo {
	s.UserName = &v
	return s
}

func (s *CpfUserLoanInfo) SetPoId(v string) *CpfUserLoanInfo {
	s.PoId = &v
	return s
}

func (s *CpfUserLoanInfo) SetPoName(v string) *CpfUserLoanInfo {
	s.PoName = &v
	return s
}

func (s *CpfUserLoanInfo) SetLoanId(v string) *CpfUserLoanInfo {
	s.LoanId = &v
	return s
}

func (s *CpfUserLoanInfo) SetLoanBalance(v string) *CpfUserLoanInfo {
	s.LoanBalance = &v
	return s
}

func (s *CpfUserLoanInfo) SetLoanStatus(v string) *CpfUserLoanInfo {
	s.LoanStatus = &v
	return s
}

// 核身信息, 授权时传入
type CertificationInfo struct {
}

func (s CertificationInfo) String() string {
	return tea.Prettify(s)
}

func (s CertificationInfo) GoString() string {
	return s.String()
}

// 证明开具参数，填入证明开具接口的 extendParams 部分
type IssueCertParams struct {
	// 贷款合同编号
	Dkhtbh *string `json:"dkhtbh,omitempty" xml:"dkhtbh,omitempty"`
	// 公积金中心个人账户
	Grzh *string `json:"grzh,omitempty" xml:"grzh,omitempty"`
	// 查询开始日期
	Ksrq *string `json:"ksrq,omitempty" xml:"ksrq,omitempty"`
	// 查询结束日期
	Jsrq *string `json:"jsrq,omitempty" xml:"jsrq,omitempty"`
	// 公积金贷款中心
	Gjjdkzx *string `json:"gjjdkzx,omitempty" xml:"gjjdkzx,omitempty"`
	// 贷款金额，单位 万元
	Dkje *string `json:"dkje,omitempty" xml:"dkje,omitempty"`
	// 贷款期限，单位 年
	Dkqx *string `json:"dkqx,omitempty" xml:"dkqx,omitempty"`
}

func (s IssueCertParams) String() string {
	return tea.Prettify(s)
}

func (s IssueCertParams) GoString() string {
	return s.String()
}

func (s *IssueCertParams) SetDkhtbh(v string) *IssueCertParams {
	s.Dkhtbh = &v
	return s
}

func (s *IssueCertParams) SetGrzh(v string) *IssueCertParams {
	s.Grzh = &v
	return s
}

func (s *IssueCertParams) SetKsrq(v string) *IssueCertParams {
	s.Ksrq = &v
	return s
}

func (s *IssueCertParams) SetJsrq(v string) *IssueCertParams {
	s.Jsrq = &v
	return s
}

func (s *IssueCertParams) SetGjjdkzx(v string) *IssueCertParams {
	s.Gjjdkzx = &v
	return s
}

func (s *IssueCertParams) SetDkje(v string) *IssueCertParams {
	s.Dkje = &v
	return s
}

func (s *IssueCertParams) SetDkqx(v string) *IssueCertParams {
	s.Dkqx = &v
	return s
}

// 核身初始化请求信息
type CertificationRequest struct {
	// 认证模式
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty" require:"true"`
}

func (s CertificationRequest) String() string {
	return tea.Prettify(s)
}

func (s CertificationRequest) GoString() string {
	return s.String()
}

func (s *CertificationRequest) SetBizCode(v string) *CertificationRequest {
	s.BizCode = &v
	return s
}

// 机构用数记录查询结果（公积金业务）
type CpfDataUsageLogVO struct {
	// 使用方名称
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 使用时间
	UsageTime *string `json:"usage_time,omitempty" xml:"usage_time,omitempty" require:"true"`
	// 数据项描述
	DataDesc *string `json:"data_desc,omitempty" xml:"data_desc,omitempty" require:"true"`
	// 用途
	Purpose *string `json:"purpose,omitempty" xml:"purpose,omitempty" require:"true"`
	// 业务流水号
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
}

func (s CpfDataUsageLogVO) String() string {
	return tea.Prettify(s)
}

func (s CpfDataUsageLogVO) GoString() string {
	return s.String()
}

func (s *CpfDataUsageLogVO) SetUserName(v string) *CpfDataUsageLogVO {
	s.UserName = &v
	return s
}

func (s *CpfDataUsageLogVO) SetUsageTime(v string) *CpfDataUsageLogVO {
	s.UsageTime = &v
	return s
}

func (s *CpfDataUsageLogVO) SetDataDesc(v string) *CpfDataUsageLogVO {
	s.DataDesc = &v
	return s
}

func (s *CpfDataUsageLogVO) SetPurpose(v string) *CpfDataUsageLogVO {
	s.Purpose = &v
	return s
}

func (s *CpfDataUsageLogVO) SetBizId(v string) *CpfDataUsageLogVO {
	s.BizId = &v
	return s
}

// 核身初始化结果
type CertificationInitResponse struct {
	// 核身认证唯一标识
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
	// 商户请求唯一标识
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 场景ID
	SceneId *string `json:"scene_id,omitempty" xml:"scene_id,omitempty" require:"true"`
}

func (s CertificationInitResponse) String() string {
	return tea.Prettify(s)
}

func (s CertificationInitResponse) GoString() string {
	return s.String()
}

func (s *CertificationInitResponse) SetCertifyId(v string) *CertificationInitResponse {
	s.CertifyId = &v
	return s
}

func (s *CertificationInitResponse) SetOuterOrderNo(v string) *CertificationInitResponse {
	s.OuterOrderNo = &v
	return s
}

func (s *CertificationInitResponse) SetSceneId(v string) *CertificationInitResponse {
	s.SceneId = &v
	return s
}

type OpenCpfCertRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 端ID
	TerminalIdentity *string `json:"terminal_identity,omitempty" xml:"terminal_identity,omitempty" require:"true"`
	// 证明类型
	IssueCertType *string `json:"issue_cert_type,omitempty" xml:"issue_cert_type,omitempty" require:"true"`
	// 公积金中心ID
	ProviderId *string `json:"provider_id,omitempty" xml:"provider_id,omitempty" require:"true"`
	// 证件类型
	DataOwnerIdentityType *string `json:"data_owner_identity_type,omitempty" xml:"data_owner_identity_type,omitempty" require:"true"`
	// 数据拥有者ID（身份证ID）
	DataOwnerIdentity *string `json:"data_owner_identity,omitempty" xml:"data_owner_identity,omitempty" require:"true"`
	// 数据拥有者姓名（真实姓名）
	DataOwnerName *string `json:"data_owner_name,omitempty" xml:"data_owner_name,omitempty" require:"true"`
	// 请求结构体序列化
	ExtendParams *string `json:"extend_params,omitempty" xml:"extend_params,omitempty"`
}

func (s OpenCpfCertRequest) String() string {
	return tea.Prettify(s)
}

func (s OpenCpfCertRequest) GoString() string {
	return s.String()
}

func (s *OpenCpfCertRequest) SetAuthToken(v string) *OpenCpfCertRequest {
	s.AuthToken = &v
	return s
}

func (s *OpenCpfCertRequest) SetProductInstanceId(v string) *OpenCpfCertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OpenCpfCertRequest) SetTerminalIdentity(v string) *OpenCpfCertRequest {
	s.TerminalIdentity = &v
	return s
}

func (s *OpenCpfCertRequest) SetIssueCertType(v string) *OpenCpfCertRequest {
	s.IssueCertType = &v
	return s
}

func (s *OpenCpfCertRequest) SetProviderId(v string) *OpenCpfCertRequest {
	s.ProviderId = &v
	return s
}

func (s *OpenCpfCertRequest) SetDataOwnerIdentityType(v string) *OpenCpfCertRequest {
	s.DataOwnerIdentityType = &v
	return s
}

func (s *OpenCpfCertRequest) SetDataOwnerIdentity(v string) *OpenCpfCertRequest {
	s.DataOwnerIdentity = &v
	return s
}

func (s *OpenCpfCertRequest) SetDataOwnerName(v string) *OpenCpfCertRequest {
	s.DataOwnerName = &v
	return s
}

func (s *OpenCpfCertRequest) SetExtendParams(v string) *OpenCpfCertRequest {
	s.ExtendParams = &v
	return s
}

type OpenCpfCertResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 证明文件ID
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty"`
	// 证明文件获取地址
	DepositCert *string `json:"deposit_cert,omitempty" xml:"deposit_cert,omitempty"`
}

func (s OpenCpfCertResponse) String() string {
	return tea.Prettify(s)
}

func (s OpenCpfCertResponse) GoString() string {
	return s.String()
}

func (s *OpenCpfCertResponse) SetReqMsgId(v string) *OpenCpfCertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OpenCpfCertResponse) SetResultCode(v string) *OpenCpfCertResponse {
	s.ResultCode = &v
	return s
}

func (s *OpenCpfCertResponse) SetResultMsg(v string) *OpenCpfCertResponse {
	s.ResultMsg = &v
	return s
}

func (s *OpenCpfCertResponse) SetIssueId(v string) *OpenCpfCertResponse {
	s.IssueId = &v
	return s
}

func (s *OpenCpfCertResponse) SetDepositCert(v string) *OpenCpfCertResponse {
	s.DepositCert = &v
	return s
}

type ListCpfCertRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 端ID
	TerminalIdentity *string `json:"terminal_identity,omitempty" xml:"terminal_identity,omitempty" require:"true"`
	// 身份证ID
	DataOwnerIdentity *string `json:"data_owner_identity,omitempty" xml:"data_owner_identity,omitempty" require:"true"`
	// 证明类型
	IssueCertType *string `json:"issue_cert_type,omitempty" xml:"issue_cert_type,omitempty" require:"true"`
	// 当前页码，默认1
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 每页展示数量，默认10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 时间筛选枚举类型，默认全部
	OptionTime *string `json:"option_time,omitempty" xml:"option_time,omitempty"`
}

func (s ListCpfCertRequest) String() string {
	return tea.Prettify(s)
}

func (s ListCpfCertRequest) GoString() string {
	return s.String()
}

func (s *ListCpfCertRequest) SetAuthToken(v string) *ListCpfCertRequest {
	s.AuthToken = &v
	return s
}

func (s *ListCpfCertRequest) SetProductInstanceId(v string) *ListCpfCertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListCpfCertRequest) SetTerminalIdentity(v string) *ListCpfCertRequest {
	s.TerminalIdentity = &v
	return s
}

func (s *ListCpfCertRequest) SetDataOwnerIdentity(v string) *ListCpfCertRequest {
	s.DataOwnerIdentity = &v
	return s
}

func (s *ListCpfCertRequest) SetIssueCertType(v string) *ListCpfCertRequest {
	s.IssueCertType = &v
	return s
}

func (s *ListCpfCertRequest) SetCurrentPage(v int64) *ListCpfCertRequest {
	s.CurrentPage = &v
	return s
}

func (s *ListCpfCertRequest) SetPageSize(v int64) *ListCpfCertRequest {
	s.PageSize = &v
	return s
}

func (s *ListCpfCertRequest) SetOptionTime(v string) *ListCpfCertRequest {
	s.OptionTime = &v
	return s
}

type ListCpfCertResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前页码
	Current *int64 `json:"current,omitempty" xml:"current,omitempty"`
	// 每页数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 记录总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 证明开具信息列表
	CertList []*CertSummary `json:"cert_list,omitempty" xml:"cert_list,omitempty" type:"Repeated"`
}

func (s ListCpfCertResponse) String() string {
	return tea.Prettify(s)
}

func (s ListCpfCertResponse) GoString() string {
	return s.String()
}

func (s *ListCpfCertResponse) SetReqMsgId(v string) *ListCpfCertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListCpfCertResponse) SetResultCode(v string) *ListCpfCertResponse {
	s.ResultCode = &v
	return s
}

func (s *ListCpfCertResponse) SetResultMsg(v string) *ListCpfCertResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListCpfCertResponse) SetCurrent(v int64) *ListCpfCertResponse {
	s.Current = &v
	return s
}

func (s *ListCpfCertResponse) SetPageSize(v int64) *ListCpfCertResponse {
	s.PageSize = &v
	return s
}

func (s *ListCpfCertResponse) SetTotal(v int64) *ListCpfCertResponse {
	s.Total = &v
	return s
}

func (s *ListCpfCertResponse) SetCertList(v []*CertSummary) *ListCpfCertResponse {
	s.CertList = v
	return s
}

type CheckCpfCertRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部业务流水
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 扫码验真类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 端ID
	TerminalIdentity *string `json:"terminal_identity,omitempty" xml:"terminal_identity,omitempty" require:"true"`
	// 证明ID
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty" require:"true"`
	// 身份证ID
	DataOwnerIdentity *string `json:"data_owner_identity,omitempty" xml:"data_owner_identity,omitempty" require:"true"`
	// 使用方ID
	DataUserIdentity *string `json:"data_user_identity,omitempty" xml:"data_user_identity,omitempty"`
	// 使用方名称
	DataUserName *string `json:"data_user_name,omitempty" xml:"data_user_name,omitempty"`
	// 用途
	Purpose *string `json:"purpose,omitempty" xml:"purpose,omitempty"`
	// 使用时间
	UseTime *string `json:"use_time,omitempty" xml:"use_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 扩展字段
	ExtendParams *string `json:"extend_params,omitempty" xml:"extend_params,omitempty"`
}

func (s CheckCpfCertRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckCpfCertRequest) GoString() string {
	return s.String()
}

func (s *CheckCpfCertRequest) SetAuthToken(v string) *CheckCpfCertRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckCpfCertRequest) SetProductInstanceId(v string) *CheckCpfCertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckCpfCertRequest) SetBizId(v string) *CheckCpfCertRequest {
	s.BizId = &v
	return s
}

func (s *CheckCpfCertRequest) SetType(v string) *CheckCpfCertRequest {
	s.Type = &v
	return s
}

func (s *CheckCpfCertRequest) SetTerminalIdentity(v string) *CheckCpfCertRequest {
	s.TerminalIdentity = &v
	return s
}

func (s *CheckCpfCertRequest) SetIssueId(v string) *CheckCpfCertRequest {
	s.IssueId = &v
	return s
}

func (s *CheckCpfCertRequest) SetDataOwnerIdentity(v string) *CheckCpfCertRequest {
	s.DataOwnerIdentity = &v
	return s
}

func (s *CheckCpfCertRequest) SetDataUserIdentity(v string) *CheckCpfCertRequest {
	s.DataUserIdentity = &v
	return s
}

func (s *CheckCpfCertRequest) SetDataUserName(v string) *CheckCpfCertRequest {
	s.DataUserName = &v
	return s
}

func (s *CheckCpfCertRequest) SetPurpose(v string) *CheckCpfCertRequest {
	s.Purpose = &v
	return s
}

func (s *CheckCpfCertRequest) SetUseTime(v string) *CheckCpfCertRequest {
	s.UseTime = &v
	return s
}

func (s *CheckCpfCertRequest) SetExtendParams(v string) *CheckCpfCertRequest {
	s.ExtendParams = &v
	return s
}

type CheckCpfCertResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 证明ID
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty"`
	// 证明文件获取地址
	DepositCert *string `json:"deposit_cert,omitempty" xml:"deposit_cert,omitempty"`
}

func (s CheckCpfCertResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckCpfCertResponse) GoString() string {
	return s.String()
}

func (s *CheckCpfCertResponse) SetReqMsgId(v string) *CheckCpfCertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckCpfCertResponse) SetResultCode(v string) *CheckCpfCertResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckCpfCertResponse) SetResultMsg(v string) *CheckCpfCertResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckCpfCertResponse) SetIssueId(v string) *CheckCpfCertResponse {
	s.IssueId = &v
	return s
}

func (s *CheckCpfCertResponse) SetDepositCert(v string) *CheckCpfCertResponse {
	s.DepositCert = &v
	return s
}

type SaveCpfCertuseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务流水号
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 身份证ID
	DataOwnerIdentity *string `json:"data_owner_identity,omitempty" xml:"data_owner_identity,omitempty" require:"true"`
	// 姓名
	DataOwnerName *string `json:"data_owner_name,omitempty" xml:"data_owner_name,omitempty" require:"true"`
	// 用数机构ID
	DataUserIdentity *string `json:"data_user_identity,omitempty" xml:"data_user_identity,omitempty" require:"true"`
	// 用数机构名称
	DataUserName *string `json:"data_user_name,omitempty" xml:"data_user_name,omitempty" require:"true"`
	// 用数端ID
	TerminalIdentity *string `json:"terminal_identity,omitempty" xml:"terminal_identity,omitempty" require:"true"`
	// 用数目的
	Purpose *string `json:"purpose,omitempty" xml:"purpose,omitempty" require:"true"`
	// 用数时间
	OperateTime *string `json:"operate_time,omitempty" xml:"operate_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 扩展字段
	ExtendParams *string `json:"extend_params,omitempty" xml:"extend_params,omitempty"`
}

func (s SaveCpfCertuseRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveCpfCertuseRequest) GoString() string {
	return s.String()
}

func (s *SaveCpfCertuseRequest) SetAuthToken(v string) *SaveCpfCertuseRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveCpfCertuseRequest) SetProductInstanceId(v string) *SaveCpfCertuseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveCpfCertuseRequest) SetBizId(v string) *SaveCpfCertuseRequest {
	s.BizId = &v
	return s
}

func (s *SaveCpfCertuseRequest) SetDataOwnerIdentity(v string) *SaveCpfCertuseRequest {
	s.DataOwnerIdentity = &v
	return s
}

func (s *SaveCpfCertuseRequest) SetDataOwnerName(v string) *SaveCpfCertuseRequest {
	s.DataOwnerName = &v
	return s
}

func (s *SaveCpfCertuseRequest) SetDataUserIdentity(v string) *SaveCpfCertuseRequest {
	s.DataUserIdentity = &v
	return s
}

func (s *SaveCpfCertuseRequest) SetDataUserName(v string) *SaveCpfCertuseRequest {
	s.DataUserName = &v
	return s
}

func (s *SaveCpfCertuseRequest) SetTerminalIdentity(v string) *SaveCpfCertuseRequest {
	s.TerminalIdentity = &v
	return s
}

func (s *SaveCpfCertuseRequest) SetPurpose(v string) *SaveCpfCertuseRequest {
	s.Purpose = &v
	return s
}

func (s *SaveCpfCertuseRequest) SetOperateTime(v string) *SaveCpfCertuseRequest {
	s.OperateTime = &v
	return s
}

func (s *SaveCpfCertuseRequest) SetExtendParams(v string) *SaveCpfCertuseRequest {
	s.ExtendParams = &v
	return s
}

type SaveCpfCertuseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SaveCpfCertuseResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveCpfCertuseResponse) GoString() string {
	return s.String()
}

func (s *SaveCpfCertuseResponse) SetReqMsgId(v string) *SaveCpfCertuseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveCpfCertuseResponse) SetResultCode(v string) *SaveCpfCertuseResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveCpfCertuseResponse) SetResultMsg(v string) *SaveCpfCertuseResponse {
	s.ResultMsg = &v
	return s
}

type GetCpfCertuseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务流水号
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 端ID
	TerminalIdentity *string `json:"terminal_identity,omitempty" xml:"terminal_identity,omitempty" require:"true"`
	// 用数机构ID
	DataUserIdentity *string `json:"data_user_identity,omitempty" xml:"data_user_identity,omitempty" require:"true"`
	// 用数机构
	DataUserName *string `json:"data_user_name,omitempty" xml:"data_user_name,omitempty" require:"true"`
	// 证明文件ID
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty" require:"true"`
	// 使用目的
	Purpose *string `json:"purpose,omitempty" xml:"purpose,omitempty"`
	// 使用时间
	UseTime *string `json:"use_time,omitempty" xml:"use_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s GetCpfCertuseRequest) String() string {
	return tea.Prettify(s)
}

func (s GetCpfCertuseRequest) GoString() string {
	return s.String()
}

func (s *GetCpfCertuseRequest) SetAuthToken(v string) *GetCpfCertuseRequest {
	s.AuthToken = &v
	return s
}

func (s *GetCpfCertuseRequest) SetProductInstanceId(v string) *GetCpfCertuseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetCpfCertuseRequest) SetBizId(v string) *GetCpfCertuseRequest {
	s.BizId = &v
	return s
}

func (s *GetCpfCertuseRequest) SetTerminalIdentity(v string) *GetCpfCertuseRequest {
	s.TerminalIdentity = &v
	return s
}

func (s *GetCpfCertuseRequest) SetDataUserIdentity(v string) *GetCpfCertuseRequest {
	s.DataUserIdentity = &v
	return s
}

func (s *GetCpfCertuseRequest) SetDataUserName(v string) *GetCpfCertuseRequest {
	s.DataUserName = &v
	return s
}

func (s *GetCpfCertuseRequest) SetIssueId(v string) *GetCpfCertuseRequest {
	s.IssueId = &v
	return s
}

func (s *GetCpfCertuseRequest) SetPurpose(v string) *GetCpfCertuseRequest {
	s.Purpose = &v
	return s
}

func (s *GetCpfCertuseRequest) SetUseTime(v string) *GetCpfCertuseRequest {
	s.UseTime = &v
	return s
}

type GetCpfCertuseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 原始文件pdf
	DepositCert *string `json:"deposit_cert,omitempty" xml:"deposit_cert,omitempty"`
}

func (s GetCpfCertuseResponse) String() string {
	return tea.Prettify(s)
}

func (s GetCpfCertuseResponse) GoString() string {
	return s.String()
}

func (s *GetCpfCertuseResponse) SetReqMsgId(v string) *GetCpfCertuseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetCpfCertuseResponse) SetResultCode(v string) *GetCpfCertuseResponse {
	s.ResultCode = &v
	return s
}

func (s *GetCpfCertuseResponse) SetResultMsg(v string) *GetCpfCertuseResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetCpfCertuseResponse) SetDepositCert(v string) *GetCpfCertuseResponse {
	s.DepositCert = &v
	return s
}

type GetCpfCertRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 证明文件ID
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty" require:"true"`
	// 证明文件存储类型
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// 端ID
	TerminalIdentity *string `json:"terminal_identity,omitempty" xml:"terminal_identity,omitempty" require:"true"`
}

func (s GetCpfCertRequest) String() string {
	return tea.Prettify(s)
}

func (s GetCpfCertRequest) GoString() string {
	return s.String()
}

func (s *GetCpfCertRequest) SetAuthToken(v string) *GetCpfCertRequest {
	s.AuthToken = &v
	return s
}

func (s *GetCpfCertRequest) SetProductInstanceId(v string) *GetCpfCertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetCpfCertRequest) SetIssueId(v string) *GetCpfCertRequest {
	s.IssueId = &v
	return s
}

func (s *GetCpfCertRequest) SetFileType(v string) *GetCpfCertRequest {
	s.FileType = &v
	return s
}

func (s *GetCpfCertRequest) SetTerminalIdentity(v string) *GetCpfCertRequest {
	s.TerminalIdentity = &v
	return s
}

type GetCpfCertResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 证明文件ID
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty"`
	// 证明文件获取地址
	DepositCert *string `json:"deposit_cert,omitempty" xml:"deposit_cert,omitempty"`
}

func (s GetCpfCertResponse) String() string {
	return tea.Prettify(s)
}

func (s GetCpfCertResponse) GoString() string {
	return s.String()
}

func (s *GetCpfCertResponse) SetReqMsgId(v string) *GetCpfCertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetCpfCertResponse) SetResultCode(v string) *GetCpfCertResponse {
	s.ResultCode = &v
	return s
}

func (s *GetCpfCertResponse) SetResultMsg(v string) *GetCpfCertResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetCpfCertResponse) SetIssueId(v string) *GetCpfCertResponse {
	s.IssueId = &v
	return s
}

func (s *GetCpfCertResponse) SetDepositCert(v string) *GetCpfCertResponse {
	s.DepositCert = &v
	return s
}

type ListCpfCertuseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 端ID
	TerminalIdentity *string `json:"terminal_identity,omitempty" xml:"terminal_identity,omitempty" require:"true"`
	// 证明ID
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty" require:"true"`
	// 筛选时间 按月份筛选
	OptionTime *string `json:"option_time,omitempty" xml:"option_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s ListCpfCertuseRequest) String() string {
	return tea.Prettify(s)
}

func (s ListCpfCertuseRequest) GoString() string {
	return s.String()
}

func (s *ListCpfCertuseRequest) SetAuthToken(v string) *ListCpfCertuseRequest {
	s.AuthToken = &v
	return s
}

func (s *ListCpfCertuseRequest) SetProductInstanceId(v string) *ListCpfCertuseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListCpfCertuseRequest) SetTerminalIdentity(v string) *ListCpfCertuseRequest {
	s.TerminalIdentity = &v
	return s
}

func (s *ListCpfCertuseRequest) SetIssueId(v string) *ListCpfCertuseRequest {
	s.IssueId = &v
	return s
}

func (s *ListCpfCertuseRequest) SetOptionTime(v string) *ListCpfCertuseRequest {
	s.OptionTime = &v
	return s
}

type ListCpfCertuseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用证记录列表
	UseRecords []*CertUsageLogVO `json:"use_records,omitempty" xml:"use_records,omitempty" type:"Repeated"`
}

func (s ListCpfCertuseResponse) String() string {
	return tea.Prettify(s)
}

func (s ListCpfCertuseResponse) GoString() string {
	return s.String()
}

func (s *ListCpfCertuseResponse) SetReqMsgId(v string) *ListCpfCertuseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListCpfCertuseResponse) SetResultCode(v string) *ListCpfCertuseResponse {
	s.ResultCode = &v
	return s
}

func (s *ListCpfCertuseResponse) SetResultMsg(v string) *ListCpfCertuseResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListCpfCertuseResponse) SetUseRecords(v []*CertUsageLogVO) *ListCpfCertuseResponse {
	s.UseRecords = v
	return s
}

type GetCpfDataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 端ID
	TerminalIdentity *string `json:"terminal_identity,omitempty" xml:"terminal_identity,omitempty" require:"true"`
	// 业务流水号
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 使用方ID
	DataUserIdentity *string `json:"data_user_identity,omitempty" xml:"data_user_identity,omitempty" require:"true"`
	// 使用方名称
	DataUserName *string `json:"data_user_name,omitempty" xml:"data_user_name,omitempty" require:"true"`
	// 证件类型
	DataOwnerIdentityType *string `json:"data_owner_identity_type,omitempty" xml:"data_owner_identity_type,omitempty" require:"true"`
	// 用户ID
	DataOwnerIdentity *string `json:"data_owner_identity,omitempty" xml:"data_owner_identity,omitempty" require:"true"`
	// 用户姓名
	DataOwnerName *string `json:"data_owner_name,omitempty" xml:"data_owner_name,omitempty" require:"true"`
	// 数据源ID
	ProviderId *string `json:"provider_id,omitempty" xml:"provider_id,omitempty" require:"true"`
	// 数据项code
	DataCode *string `json:"data_code,omitempty" xml:"data_code,omitempty" require:"true"`
	// 授权码
	TargetCode *string `json:"target_code,omitempty" xml:"target_code,omitempty" require:"true"`
	// 扩展字段。
	ExtendParams *string `json:"extend_params,omitempty" xml:"extend_params,omitempty"`
}

func (s GetCpfDataRequest) String() string {
	return tea.Prettify(s)
}

func (s GetCpfDataRequest) GoString() string {
	return s.String()
}

func (s *GetCpfDataRequest) SetAuthToken(v string) *GetCpfDataRequest {
	s.AuthToken = &v
	return s
}

func (s *GetCpfDataRequest) SetProductInstanceId(v string) *GetCpfDataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetCpfDataRequest) SetTerminalIdentity(v string) *GetCpfDataRequest {
	s.TerminalIdentity = &v
	return s
}

func (s *GetCpfDataRequest) SetBizId(v string) *GetCpfDataRequest {
	s.BizId = &v
	return s
}

func (s *GetCpfDataRequest) SetDataUserIdentity(v string) *GetCpfDataRequest {
	s.DataUserIdentity = &v
	return s
}

func (s *GetCpfDataRequest) SetDataUserName(v string) *GetCpfDataRequest {
	s.DataUserName = &v
	return s
}

func (s *GetCpfDataRequest) SetDataOwnerIdentityType(v string) *GetCpfDataRequest {
	s.DataOwnerIdentityType = &v
	return s
}

func (s *GetCpfDataRequest) SetDataOwnerIdentity(v string) *GetCpfDataRequest {
	s.DataOwnerIdentity = &v
	return s
}

func (s *GetCpfDataRequest) SetDataOwnerName(v string) *GetCpfDataRequest {
	s.DataOwnerName = &v
	return s
}

func (s *GetCpfDataRequest) SetProviderId(v string) *GetCpfDataRequest {
	s.ProviderId = &v
	return s
}

func (s *GetCpfDataRequest) SetDataCode(v string) *GetCpfDataRequest {
	s.DataCode = &v
	return s
}

func (s *GetCpfDataRequest) SetTargetCode(v string) *GetCpfDataRequest {
	s.TargetCode = &v
	return s
}

func (s *GetCpfDataRequest) SetExtendParams(v string) *GetCpfDataRequest {
	s.ExtendParams = &v
	return s
}

type GetCpfDataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// PDF、或结构化信息、或加密数据
	TrustData *string `json:"trust_data,omitempty" xml:"trust_data,omitempty"`
	// 数据hash，数据验真时用
	DataHash *string `json:"data_hash,omitempty" xml:"data_hash,omitempty"`
}

func (s GetCpfDataResponse) String() string {
	return tea.Prettify(s)
}

func (s GetCpfDataResponse) GoString() string {
	return s.String()
}

func (s *GetCpfDataResponse) SetReqMsgId(v string) *GetCpfDataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetCpfDataResponse) SetResultCode(v string) *GetCpfDataResponse {
	s.ResultCode = &v
	return s
}

func (s *GetCpfDataResponse) SetResultMsg(v string) *GetCpfDataResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetCpfDataResponse) SetTrustData(v string) *GetCpfDataResponse {
	s.TrustData = &v
	return s
}

func (s *GetCpfDataResponse) SetDataHash(v string) *GetCpfDataResponse {
	s.DataHash = &v
	return s
}

type ListCpfDatauseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 端ID
	TerminalIdentity *string `json:"terminal_identity,omitempty" xml:"terminal_identity,omitempty" require:"true"`
	// 使用方ID
	DataUserIdentity *string `json:"data_user_identity,omitempty" xml:"data_user_identity,omitempty" require:"true"`
	// 用户身份证ID
	DataOwnerIdentity *string `json:"data_owner_identity,omitempty" xml:"data_owner_identity,omitempty"`
	// 筛选时间，按月份筛选，默认当前月份
	OptionTime *string `json:"option_time,omitempty" xml:"option_time,omitempty"`
	// 数据类型
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 数据类型
	DataCode *string `json:"data_code,omitempty" xml:"data_code,omitempty"`
}

func (s ListCpfDatauseRequest) String() string {
	return tea.Prettify(s)
}

func (s ListCpfDatauseRequest) GoString() string {
	return s.String()
}

func (s *ListCpfDatauseRequest) SetAuthToken(v string) *ListCpfDatauseRequest {
	s.AuthToken = &v
	return s
}

func (s *ListCpfDatauseRequest) SetProductInstanceId(v string) *ListCpfDatauseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListCpfDatauseRequest) SetTerminalIdentity(v string) *ListCpfDatauseRequest {
	s.TerminalIdentity = &v
	return s
}

func (s *ListCpfDatauseRequest) SetDataUserIdentity(v string) *ListCpfDatauseRequest {
	s.DataUserIdentity = &v
	return s
}

func (s *ListCpfDatauseRequest) SetDataOwnerIdentity(v string) *ListCpfDatauseRequest {
	s.DataOwnerIdentity = &v
	return s
}

func (s *ListCpfDatauseRequest) SetOptionTime(v string) *ListCpfDatauseRequest {
	s.OptionTime = &v
	return s
}

func (s *ListCpfDatauseRequest) SetType(v string) *ListCpfDatauseRequest {
	s.Type = &v
	return s
}

func (s *ListCpfDatauseRequest) SetDataCode(v string) *ListCpfDatauseRequest {
	s.DataCode = &v
	return s
}

type ListCpfDatauseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 机构用数记录
	UseRecords []*CpfDataUsageLogVO `json:"use_records,omitempty" xml:"use_records,omitempty" type:"Repeated"`
}

func (s ListCpfDatauseResponse) String() string {
	return tea.Prettify(s)
}

func (s ListCpfDatauseResponse) GoString() string {
	return s.String()
}

func (s *ListCpfDatauseResponse) SetReqMsgId(v string) *ListCpfDatauseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListCpfDatauseResponse) SetResultCode(v string) *ListCpfDatauseResponse {
	s.ResultCode = &v
	return s
}

func (s *ListCpfDatauseResponse) SetResultMsg(v string) *ListCpfDatauseResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListCpfDatauseResponse) SetUseRecords(v []*CpfDataUsageLogVO) *ListCpfDatauseResponse {
	s.UseRecords = v
	return s
}

type QueryCpfUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 端ID
	TerminalIdentity *string `json:"terminal_identity,omitempty" xml:"terminal_identity,omitempty" require:"true"`
	// 数据源ID
	ProviderId *string `json:"provider_id,omitempty" xml:"provider_id,omitempty" require:"true"`
	// 用户身份证ID
	DataOwnerIdentity *string `json:"data_owner_identity,omitempty" xml:"data_owner_identity,omitempty" require:"true"`
	// 用户姓名
	DataOwnerName *string `json:"data_owner_name,omitempty" xml:"data_owner_name,omitempty" require:"true"`
	// 证件类型
	DataOwnerIdentityType *string `json:"data_owner_identity_type,omitempty" xml:"data_owner_identity_type,omitempty" require:"true"`
}

func (s QueryCpfUserRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCpfUserRequest) GoString() string {
	return s.String()
}

func (s *QueryCpfUserRequest) SetAuthToken(v string) *QueryCpfUserRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCpfUserRequest) SetProductInstanceId(v string) *QueryCpfUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCpfUserRequest) SetTerminalIdentity(v string) *QueryCpfUserRequest {
	s.TerminalIdentity = &v
	return s
}

func (s *QueryCpfUserRequest) SetProviderId(v string) *QueryCpfUserRequest {
	s.ProviderId = &v
	return s
}

func (s *QueryCpfUserRequest) SetDataOwnerIdentity(v string) *QueryCpfUserRequest {
	s.DataOwnerIdentity = &v
	return s
}

func (s *QueryCpfUserRequest) SetDataOwnerName(v string) *QueryCpfUserRequest {
	s.DataOwnerName = &v
	return s
}

func (s *QueryCpfUserRequest) SetDataOwnerIdentityType(v string) *QueryCpfUserRequest {
	s.DataOwnerIdentityType = &v
	return s
}

type QueryCpfUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 个人账户信息
	UserAccountInfo []*CpfUserAccountInfo `json:"user_account_info,omitempty" xml:"user_account_info,omitempty" type:"Repeated"`
	// 贷款信息
	UserLoanInfo []*CpfUserLoanInfo `json:"user_loan_info,omitempty" xml:"user_loan_info,omitempty" type:"Repeated"`
}

func (s QueryCpfUserResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCpfUserResponse) GoString() string {
	return s.String()
}

func (s *QueryCpfUserResponse) SetReqMsgId(v string) *QueryCpfUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCpfUserResponse) SetResultCode(v string) *QueryCpfUserResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCpfUserResponse) SetResultMsg(v string) *QueryCpfUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCpfUserResponse) SetUserAccountInfo(v []*CpfUserAccountInfo) *QueryCpfUserResponse {
	s.UserAccountInfo = v
	return s
}

func (s *QueryCpfUserResponse) SetUserLoanInfo(v []*CpfUserLoanInfo) *QueryCpfUserResponse {
	s.UserLoanInfo = v
	return s
}

type ExecCpfAuthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 流水号
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 用户身份证ID
	DataOwnerIdentity *string `json:"data_owner_identity,omitempty" xml:"data_owner_identity,omitempty" require:"true"`
	// 用户姓名
	DataOwnerName *string `json:"data_owner_name,omitempty" xml:"data_owner_name,omitempty"`
	// 被授权机构ID
	AuthorizedIdentity *string `json:"authorized_identity,omitempty" xml:"authorized_identity,omitempty" require:"true"`
	// 被授权机构名称
	AuthorizedName *string `json:"authorized_name,omitempty" xml:"authorized_name,omitempty"`
	// 端ID
	AuthorizedPlatformIdentity *string `json:"authorized_platform_identity,omitempty" xml:"authorized_platform_identity,omitempty" require:"true"`
	// 被授权公积金中心ID
	ProviderId *string `json:"provider_id,omitempty" xml:"provider_id,omitempty"`
	// 授权标的
	TargetCode *string `json:"target_code,omitempty" xml:"target_code,omitempty" require:"true"`
	// 授权协议
	AuthAgreement *AuthAgreement `json:"auth_agreement,omitempty" xml:"auth_agreement,omitempty" require:"true"`
	// 核身信息
	CertificationInfo *CertificationInfo `json:"certification_info,omitempty" xml:"certification_info,omitempty"`
	// 扩展字段
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
}

func (s ExecCpfAuthRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecCpfAuthRequest) GoString() string {
	return s.String()
}

func (s *ExecCpfAuthRequest) SetAuthToken(v string) *ExecCpfAuthRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecCpfAuthRequest) SetProductInstanceId(v string) *ExecCpfAuthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecCpfAuthRequest) SetRequestId(v string) *ExecCpfAuthRequest {
	s.RequestId = &v
	return s
}

func (s *ExecCpfAuthRequest) SetDataOwnerIdentity(v string) *ExecCpfAuthRequest {
	s.DataOwnerIdentity = &v
	return s
}

func (s *ExecCpfAuthRequest) SetDataOwnerName(v string) *ExecCpfAuthRequest {
	s.DataOwnerName = &v
	return s
}

func (s *ExecCpfAuthRequest) SetAuthorizedIdentity(v string) *ExecCpfAuthRequest {
	s.AuthorizedIdentity = &v
	return s
}

func (s *ExecCpfAuthRequest) SetAuthorizedName(v string) *ExecCpfAuthRequest {
	s.AuthorizedName = &v
	return s
}

func (s *ExecCpfAuthRequest) SetAuthorizedPlatformIdentity(v string) *ExecCpfAuthRequest {
	s.AuthorizedPlatformIdentity = &v
	return s
}

func (s *ExecCpfAuthRequest) SetProviderId(v string) *ExecCpfAuthRequest {
	s.ProviderId = &v
	return s
}

func (s *ExecCpfAuthRequest) SetTargetCode(v string) *ExecCpfAuthRequest {
	s.TargetCode = &v
	return s
}

func (s *ExecCpfAuthRequest) SetAuthAgreement(v *AuthAgreement) *ExecCpfAuthRequest {
	s.AuthAgreement = v
	return s
}

func (s *ExecCpfAuthRequest) SetCertificationInfo(v *CertificationInfo) *ExecCpfAuthRequest {
	s.CertificationInfo = v
	return s
}

func (s *ExecCpfAuthRequest) SetContent(v string) *ExecCpfAuthRequest {
	s.Content = &v
	return s
}

type ExecCpfAuthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权码
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty"`
}

func (s ExecCpfAuthResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecCpfAuthResponse) GoString() string {
	return s.String()
}

func (s *ExecCpfAuthResponse) SetReqMsgId(v string) *ExecCpfAuthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecCpfAuthResponse) SetResultCode(v string) *ExecCpfAuthResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecCpfAuthResponse) SetResultMsg(v string) *ExecCpfAuthResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecCpfAuthResponse) SetAuthCode(v string) *ExecCpfAuthResponse {
	s.AuthCode = &v
	return s
}

type CancelCpfAuthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 流水号
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 身份证ID
	DataOwnerIdentity *string `json:"data_owner_identity,omitempty" xml:"data_owner_identity,omitempty" require:"true"`
	// 端ID
	AuthorizedPlatformIdentity *string `json:"authorized_platform_identity,omitempty" xml:"authorized_platform_identity,omitempty" require:"true"`
	// 授权接口返回的授权码
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty" require:"true"`
	// 核身信息
	CertificationInfo *string `json:"certification_info,omitempty" xml:"certification_info,omitempty"`
}

func (s CancelCpfAuthRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelCpfAuthRequest) GoString() string {
	return s.String()
}

func (s *CancelCpfAuthRequest) SetAuthToken(v string) *CancelCpfAuthRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelCpfAuthRequest) SetProductInstanceId(v string) *CancelCpfAuthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelCpfAuthRequest) SetRequestId(v string) *CancelCpfAuthRequest {
	s.RequestId = &v
	return s
}

func (s *CancelCpfAuthRequest) SetDataOwnerIdentity(v string) *CancelCpfAuthRequest {
	s.DataOwnerIdentity = &v
	return s
}

func (s *CancelCpfAuthRequest) SetAuthorizedPlatformIdentity(v string) *CancelCpfAuthRequest {
	s.AuthorizedPlatformIdentity = &v
	return s
}

func (s *CancelCpfAuthRequest) SetAuthCode(v string) *CancelCpfAuthRequest {
	s.AuthCode = &v
	return s
}

func (s *CancelCpfAuthRequest) SetCertificationInfo(v string) *CancelCpfAuthRequest {
	s.CertificationInfo = &v
	return s
}

type CancelCpfAuthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CancelCpfAuthResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelCpfAuthResponse) GoString() string {
	return s.String()
}

func (s *CancelCpfAuthResponse) SetReqMsgId(v string) *CancelCpfAuthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelCpfAuthResponse) SetResultCode(v string) *CancelCpfAuthResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelCpfAuthResponse) SetResultMsg(v string) *CancelCpfAuthResponse {
	s.ResultMsg = &v
	return s
}

type QueryCpfAuthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 身份证ID
	DataOwnerIdentity *string `json:"data_owner_identity,omitempty" xml:"data_owner_identity,omitempty" require:"true"`
	// 被授权机构ID
	AuthorizedIdentity *string `json:"authorized_identity,omitempty" xml:"authorized_identity,omitempty"`
	// 端ID
	AuthorizedPlatformIdentity *string `json:"authorized_platform_identity,omitempty" xml:"authorized_platform_identity,omitempty" require:"true"`
	// 标的产品码
	TargetCode *string `json:"target_code,omitempty" xml:"target_code,omitempty"`
	// 扩展字段
	ExtendParams *string `json:"extend_params,omitempty" xml:"extend_params,omitempty"`
	// 授权状态
	AuthState *string `json:"auth_state,omitempty" xml:"auth_state,omitempty" require:"true"`
}

func (s QueryCpfAuthRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCpfAuthRequest) GoString() string {
	return s.String()
}

func (s *QueryCpfAuthRequest) SetAuthToken(v string) *QueryCpfAuthRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCpfAuthRequest) SetProductInstanceId(v string) *QueryCpfAuthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCpfAuthRequest) SetDataOwnerIdentity(v string) *QueryCpfAuthRequest {
	s.DataOwnerIdentity = &v
	return s
}

func (s *QueryCpfAuthRequest) SetAuthorizedIdentity(v string) *QueryCpfAuthRequest {
	s.AuthorizedIdentity = &v
	return s
}

func (s *QueryCpfAuthRequest) SetAuthorizedPlatformIdentity(v string) *QueryCpfAuthRequest {
	s.AuthorizedPlatformIdentity = &v
	return s
}

func (s *QueryCpfAuthRequest) SetTargetCode(v string) *QueryCpfAuthRequest {
	s.TargetCode = &v
	return s
}

func (s *QueryCpfAuthRequest) SetExtendParams(v string) *QueryCpfAuthRequest {
	s.ExtendParams = &v
	return s
}

func (s *QueryCpfAuthRequest) SetAuthState(v string) *QueryCpfAuthRequest {
	s.AuthState = &v
	return s
}

type QueryCpfAuthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权记录列表
	AuthRecords []*AuthRecord `json:"auth_records,omitempty" xml:"auth_records,omitempty" type:"Repeated"`
}

func (s QueryCpfAuthResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCpfAuthResponse) GoString() string {
	return s.String()
}

func (s *QueryCpfAuthResponse) SetReqMsgId(v string) *QueryCpfAuthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCpfAuthResponse) SetResultCode(v string) *QueryCpfAuthResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCpfAuthResponse) SetResultMsg(v string) *QueryCpfAuthResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCpfAuthResponse) SetAuthRecords(v []*AuthRecord) *QueryCpfAuthResponse {
	s.AuthRecords = v
	return s
}

type ExecAuthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 被授权租户身份ID：
	//
	// 身份证号/统一社会组织机构信用码
	AuthorizedIdentity *string `json:"authorized_identity,omitempty" xml:"authorized_identity,omitempty" require:"true"`
	// 分配code
	//
	//
	AuthorizedPlatformIdentity *string `json:"authorized_platform_identity,omitempty" xml:"authorized_platform_identity,omitempty" require:"true"`
	// 授权协议
	AuthAgreement *AuthAgreement `json:"auth_agreement,omitempty" xml:"auth_agreement,omitempty" require:"true"`
	// 扩展字段,目前是一个json串，传入相关附加信息，如果对应的附加信息key不需要，可以不传，
	//
	// key对应的value数据字典由平台提供
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 授权租户身份ID：
	// 身份证号/统一社会组织机构信用码
	//
	//
	DataOwnerIdentity *string `json:"data_owner_identity,omitempty" xml:"data_owner_identity,omitempty" require:"true"`
	// 请求流水号(64位 由平台方定义)_
	// 幂等标示
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 标的物
	//
	//
	TargetCode *string `json:"target_code,omitempty" xml:"target_code,omitempty" require:"true"`
	// 核身产品类型
	CertificationType *string `json:"certification_type,omitempty" xml:"certification_type,omitempty"`
	// 核身信息
	//
	//
	CertificationInfo *string `json:"certification_info,omitempty" xml:"certification_info,omitempty"`
}

func (s ExecAuthRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAuthRequest) GoString() string {
	return s.String()
}

func (s *ExecAuthRequest) SetAuthToken(v string) *ExecAuthRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAuthRequest) SetProductInstanceId(v string) *ExecAuthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAuthRequest) SetAuthorizedIdentity(v string) *ExecAuthRequest {
	s.AuthorizedIdentity = &v
	return s
}

func (s *ExecAuthRequest) SetAuthorizedPlatformIdentity(v string) *ExecAuthRequest {
	s.AuthorizedPlatformIdentity = &v
	return s
}

func (s *ExecAuthRequest) SetAuthAgreement(v *AuthAgreement) *ExecAuthRequest {
	s.AuthAgreement = v
	return s
}

func (s *ExecAuthRequest) SetContent(v string) *ExecAuthRequest {
	s.Content = &v
	return s
}

func (s *ExecAuthRequest) SetDataOwnerIdentity(v string) *ExecAuthRequest {
	s.DataOwnerIdentity = &v
	return s
}

func (s *ExecAuthRequest) SetRequestId(v string) *ExecAuthRequest {
	s.RequestId = &v
	return s
}

func (s *ExecAuthRequest) SetTargetCode(v string) *ExecAuthRequest {
	s.TargetCode = &v
	return s
}

func (s *ExecAuthRequest) SetCertificationType(v string) *ExecAuthRequest {
	s.CertificationType = &v
	return s
}

func (s *ExecAuthRequest) SetCertificationInfo(v string) *ExecAuthRequest {
	s.CertificationInfo = &v
	return s
}

type ExecAuthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权码
	//
	//
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty"`
}

func (s ExecAuthResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAuthResponse) GoString() string {
	return s.String()
}

func (s *ExecAuthResponse) SetReqMsgId(v string) *ExecAuthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAuthResponse) SetResultCode(v string) *ExecAuthResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAuthResponse) SetResultMsg(v string) *ExecAuthResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecAuthResponse) SetAuthCode(v string) *ExecAuthResponse {
	s.AuthCode = &v
	return s
}

type CancelAuthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授权租户身份ID：
	// 身份证号/统一社会组织机构信用码
	DataOwnerIdentity *string `json:"data_owner_identity,omitempty" xml:"data_owner_identity,omitempty" require:"true"`
	// 分配code
	AuthorizedPlatformIdentity *string `json:"authorized_platform_identity,omitempty" xml:"authorized_platform_identity,omitempty" require:"true"`
	// 标的物，查询授权接口返回
	//
	//
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty" require:"true"`
	// 核身信息
	//
	CertificationInfo *string `json:"certification_info,omitempty" xml:"certification_info,omitempty" require:"true"`
	// 请求流水号
	//
	// 幂等标示
	//
	//
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
}

func (s CancelAuthRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelAuthRequest) GoString() string {
	return s.String()
}

func (s *CancelAuthRequest) SetAuthToken(v string) *CancelAuthRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelAuthRequest) SetProductInstanceId(v string) *CancelAuthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelAuthRequest) SetDataOwnerIdentity(v string) *CancelAuthRequest {
	s.DataOwnerIdentity = &v
	return s
}

func (s *CancelAuthRequest) SetAuthorizedPlatformIdentity(v string) *CancelAuthRequest {
	s.AuthorizedPlatformIdentity = &v
	return s
}

func (s *CancelAuthRequest) SetAuthCode(v string) *CancelAuthRequest {
	s.AuthCode = &v
	return s
}

func (s *CancelAuthRequest) SetCertificationInfo(v string) *CancelAuthRequest {
	s.CertificationInfo = &v
	return s
}

func (s *CancelAuthRequest) SetRequestId(v string) *CancelAuthRequest {
	s.RequestId = &v
	return s
}

type CancelAuthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CancelAuthResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelAuthResponse) GoString() string {
	return s.String()
}

func (s *CancelAuthResponse) SetReqMsgId(v string) *CancelAuthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelAuthResponse) SetResultCode(v string) *CancelAuthResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelAuthResponse) SetResultMsg(v string) *CancelAuthResponse {
	s.ResultMsg = &v
	return s
}

type QueryAuthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 被授权租户身份ID：
	// 身份证号/统一社会组织机构信用码
	AuthorizedIdentity *string `json:"authorized_identity,omitempty" xml:"authorized_identity,omitempty" require:"true"`
	// 分配code
	//
	//
	AuthorizedPlatformIdentity *string `json:"authorized_platform_identity,omitempty" xml:"authorized_platform_identity,omitempty" require:"true"`
	// 授权租户身份ID：
	// 身份证号/统一社会组织机构信用码
	DataOwnerIdentity *string `json:"data_owner_identity,omitempty" xml:"data_owner_identity,omitempty" require:"true"`
	// 扩展信息
	ExtendParams *string `json:"extend_params,omitempty" xml:"extend_params,omitempty" require:"true"`
	// 标的物
	//
	//
	TargetCode *string `json:"target_code,omitempty" xml:"target_code,omitempty" require:"true"`
	// 请求流水号幂等标示
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
}

func (s QueryAuthRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAuthRequest) GoString() string {
	return s.String()
}

func (s *QueryAuthRequest) SetAuthToken(v string) *QueryAuthRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAuthRequest) SetProductInstanceId(v string) *QueryAuthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAuthRequest) SetAuthorizedIdentity(v string) *QueryAuthRequest {
	s.AuthorizedIdentity = &v
	return s
}

func (s *QueryAuthRequest) SetAuthorizedPlatformIdentity(v string) *QueryAuthRequest {
	s.AuthorizedPlatformIdentity = &v
	return s
}

func (s *QueryAuthRequest) SetDataOwnerIdentity(v string) *QueryAuthRequest {
	s.DataOwnerIdentity = &v
	return s
}

func (s *QueryAuthRequest) SetExtendParams(v string) *QueryAuthRequest {
	s.ExtendParams = &v
	return s
}

func (s *QueryAuthRequest) SetTargetCode(v string) *QueryAuthRequest {
	s.TargetCode = &v
	return s
}

func (s *QueryAuthRequest) SetRequestId(v string) *QueryAuthRequest {
	s.RequestId = &v
	return s
}

type QueryAuthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 缴存证明数据(json格式数据)
	TrustData *string `json:"trust_data,omitempty" xml:"trust_data,omitempty"`
}

func (s QueryAuthResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAuthResponse) GoString() string {
	return s.String()
}

func (s *QueryAuthResponse) SetReqMsgId(v string) *QueryAuthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAuthResponse) SetResultCode(v string) *QueryAuthResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAuthResponse) SetResultMsg(v string) *QueryAuthResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAuthResponse) SetTrustData(v string) *QueryAuthResponse {
	s.TrustData = &v
	return s
}

type QueryAuthOwnerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	// 授权租户身份ID：
	// 身份证号/统一社会组织机构信用码
	DataOwnerIdentity *string `json:"data_owner_identity,omitempty" xml:"data_owner_identity,omitempty" require:"true"`
	// 被授权租户身份ID：
	// 身份证号/统一社会组织机构信用码
	AuthorizedIdentity *string `json:"authorized_identity,omitempty" xml:"authorized_identity,omitempty"`
	// 分配code
	//
	//
	AuthorizedPlatformIdentity *string `json:"authorized_platform_identity,omitempty" xml:"authorized_platform_identity,omitempty" require:"true"`
	// 标的物
	//
	//
	TargetCode *string `json:"target_code,omitempty" xml:"target_code,omitempty"`
	// 扩展字段
	//
	//
	ExtendParams *string `json:"extend_params,omitempty" xml:"extend_params,omitempty"`
	// "1", "授权激活状态"
	// "2", "授权取消"
	// "3", "授权过期"
	AuthState *string `json:"auth_state,omitempty" xml:"auth_state,omitempty" require:"true"`
}

func (s QueryAuthOwnerRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAuthOwnerRequest) GoString() string {
	return s.String()
}

func (s *QueryAuthOwnerRequest) SetAuthToken(v string) *QueryAuthOwnerRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAuthOwnerRequest) SetProductInstanceId(v string) *QueryAuthOwnerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAuthOwnerRequest) SetDataOwnerIdentity(v string) *QueryAuthOwnerRequest {
	s.DataOwnerIdentity = &v
	return s
}

func (s *QueryAuthOwnerRequest) SetAuthorizedIdentity(v string) *QueryAuthOwnerRequest {
	s.AuthorizedIdentity = &v
	return s
}

func (s *QueryAuthOwnerRequest) SetAuthorizedPlatformIdentity(v string) *QueryAuthOwnerRequest {
	s.AuthorizedPlatformIdentity = &v
	return s
}

func (s *QueryAuthOwnerRequest) SetTargetCode(v string) *QueryAuthOwnerRequest {
	s.TargetCode = &v
	return s
}

func (s *QueryAuthOwnerRequest) SetExtendParams(v string) *QueryAuthOwnerRequest {
	s.ExtendParams = &v
	return s
}

func (s *QueryAuthOwnerRequest) SetAuthState(v string) *QueryAuthOwnerRequest {
	s.AuthState = &v
	return s
}

type QueryAuthOwnerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权记录集合
	AuthRecords []*AuthRecord `json:"auth_records,omitempty" xml:"auth_records,omitempty" type:"Repeated"`
}

func (s QueryAuthOwnerResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAuthOwnerResponse) GoString() string {
	return s.String()
}

func (s *QueryAuthOwnerResponse) SetReqMsgId(v string) *QueryAuthOwnerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAuthOwnerResponse) SetResultCode(v string) *QueryAuthOwnerResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAuthOwnerResponse) SetResultMsg(v string) *QueryAuthOwnerResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAuthOwnerResponse) SetAuthRecords(v []*AuthRecord) *QueryAuthOwnerResponse {
	s.AuthRecords = v
	return s
}

type QueryAuthuseOwnerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 分配code
	//
	//
	AuthorizedPlatformIdentity *string `json:"authorized_platform_identity,omitempty" xml:"authorized_platform_identity,omitempty" require:"true"`
	// 授权码
	//
	//
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty" require:"true"`
	// 授权租户身份ID：
	//
	// 身份证号/统一社会组织机构信用码
	DataOwnerIdentity *string `json:"data_owner_identity,omitempty" xml:"data_owner_identity,omitempty" require:"true"`
	// 扩展字段
	ExtendParams *string `json:"extend_params,omitempty" xml:"extend_params,omitempty"`
}

func (s QueryAuthuseOwnerRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAuthuseOwnerRequest) GoString() string {
	return s.String()
}

func (s *QueryAuthuseOwnerRequest) SetAuthToken(v string) *QueryAuthuseOwnerRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAuthuseOwnerRequest) SetProductInstanceId(v string) *QueryAuthuseOwnerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAuthuseOwnerRequest) SetAuthorizedPlatformIdentity(v string) *QueryAuthuseOwnerRequest {
	s.AuthorizedPlatformIdentity = &v
	return s
}

func (s *QueryAuthuseOwnerRequest) SetAuthCode(v string) *QueryAuthuseOwnerRequest {
	s.AuthCode = &v
	return s
}

func (s *QueryAuthuseOwnerRequest) SetDataOwnerIdentity(v string) *QueryAuthuseOwnerRequest {
	s.DataOwnerIdentity = &v
	return s
}

func (s *QueryAuthuseOwnerRequest) SetExtendParams(v string) *QueryAuthuseOwnerRequest {
	s.ExtendParams = &v
	return s
}

type QueryAuthuseOwnerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权使用记录
	//
	//
	UseRecords []*AuthUsedRecord `json:"use_records,omitempty" xml:"use_records,omitempty" type:"Repeated"`
}

func (s QueryAuthuseOwnerResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAuthuseOwnerResponse) GoString() string {
	return s.String()
}

func (s *QueryAuthuseOwnerResponse) SetReqMsgId(v string) *QueryAuthuseOwnerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAuthuseOwnerResponse) SetResultCode(v string) *QueryAuthuseOwnerResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAuthuseOwnerResponse) SetResultMsg(v string) *QueryAuthuseOwnerResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAuthuseOwnerResponse) SetUseRecords(v []*AuthUsedRecord) *QueryAuthuseOwnerResponse {
	s.UseRecords = v
	return s
}

type ExecAuthuseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 被授权租户身份ID：
	//
	// 身份证号/统一社会组织机构信用码
	//
	//
	AuthorizedIdentity *string `json:"authorized_identity,omitempty" xml:"authorized_identity,omitempty" require:"true"`
	// 分配code
	//
	//
	AuthorizedPlatformIdentity *string `json:"authorized_platform_identity,omitempty" xml:"authorized_platform_identity,omitempty" require:"true"`
	// 授权租户身份ID：
	// 身份证号/统一社会组织机构信用码
	DataOwnerIdentity *string `json:"data_owner_identity,omitempty" xml:"data_owner_identity,omitempty" require:"true"`
	// 扩展字段
	//
	//
	ExtendParams *string `json:"extend_params,omitempty" xml:"extend_params,omitempty" require:"true"`
	// 请求流水号
	//
	// 幂等标示
	//
	//
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 标的物
	//
	//
	TargetCode *string `json:"target_code,omitempty" xml:"target_code,omitempty" require:"true"`
}

func (s ExecAuthuseRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAuthuseRequest) GoString() string {
	return s.String()
}

func (s *ExecAuthuseRequest) SetAuthToken(v string) *ExecAuthuseRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAuthuseRequest) SetProductInstanceId(v string) *ExecAuthuseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAuthuseRequest) SetAuthorizedIdentity(v string) *ExecAuthuseRequest {
	s.AuthorizedIdentity = &v
	return s
}

func (s *ExecAuthuseRequest) SetAuthorizedPlatformIdentity(v string) *ExecAuthuseRequest {
	s.AuthorizedPlatformIdentity = &v
	return s
}

func (s *ExecAuthuseRequest) SetDataOwnerIdentity(v string) *ExecAuthuseRequest {
	s.DataOwnerIdentity = &v
	return s
}

func (s *ExecAuthuseRequest) SetExtendParams(v string) *ExecAuthuseRequest {
	s.ExtendParams = &v
	return s
}

func (s *ExecAuthuseRequest) SetRequestId(v string) *ExecAuthuseRequest {
	s.RequestId = &v
	return s
}

func (s *ExecAuthuseRequest) SetTargetCode(v string) *ExecAuthuseRequest {
	s.TargetCode = &v
	return s
}

type ExecAuthuseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 缴存证明数据
	//
	//
	TrustData *string `json:"trust_data,omitempty" xml:"trust_data,omitempty"`
}

func (s ExecAuthuseResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAuthuseResponse) GoString() string {
	return s.String()
}

func (s *ExecAuthuseResponse) SetReqMsgId(v string) *ExecAuthuseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAuthuseResponse) SetResultCode(v string) *ExecAuthuseResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAuthuseResponse) SetResultMsg(v string) *ExecAuthuseResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecAuthuseResponse) SetTrustData(v string) *ExecAuthuseResponse {
	s.TrustData = &v
	return s
}

type InitCpfVerifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 核身初始化请求信息
	CertificationRequest *string `json:"certification_request,omitempty" xml:"certification_request,omitempty" require:"true"`
}

func (s InitCpfVerifyRequest) String() string {
	return tea.Prettify(s)
}

func (s InitCpfVerifyRequest) GoString() string {
	return s.String()
}

func (s *InitCpfVerifyRequest) SetAuthToken(v string) *InitCpfVerifyRequest {
	s.AuthToken = &v
	return s
}

func (s *InitCpfVerifyRequest) SetProductInstanceId(v string) *InitCpfVerifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitCpfVerifyRequest) SetCertificationRequest(v string) *InitCpfVerifyRequest {
	s.CertificationRequest = &v
	return s
}

type InitCpfVerifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 核身初始化返回信息
	ResultObj *string `json:"result_obj,omitempty" xml:"result_obj,omitempty"`
}

func (s InitCpfVerifyResponse) String() string {
	return tea.Prettify(s)
}

func (s InitCpfVerifyResponse) GoString() string {
	return s.String()
}

func (s *InitCpfVerifyResponse) SetReqMsgId(v string) *InitCpfVerifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitCpfVerifyResponse) SetResultCode(v string) *InitCpfVerifyResponse {
	s.ResultCode = &v
	return s
}

func (s *InitCpfVerifyResponse) SetResultMsg(v string) *InitCpfVerifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitCpfVerifyResponse) SetResultObj(v string) *InitCpfVerifyResponse {
	s.ResultObj = &v
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
				"sdk_version":      tea.String("1.1.0"),
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
 * Description: 公积金证明开具接口
 * Summary: 公积金证明开具接口
 */
func (client *Client) OpenCpfCert(request *OpenCpfCertRequest) (_result *OpenCpfCertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OpenCpfCertResponse{}
	_body, _err := client.OpenCpfCertEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 公积金证明开具接口
 * Summary: 公积金证明开具接口
 */
func (client *Client) OpenCpfCertEx(request *OpenCpfCertRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OpenCpfCertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OpenCpfCertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.tdm.cpf.cert.open"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 证明列表查询接口
 * Summary: 证明列表查询接口
 */
func (client *Client) ListCpfCert(request *ListCpfCertRequest) (_result *ListCpfCertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListCpfCertResponse{}
	_body, _err := client.ListCpfCertEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 证明列表查询接口
 * Summary: 证明列表查询接口
 */
func (client *Client) ListCpfCertEx(request *ListCpfCertRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListCpfCertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListCpfCertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.tdm.cpf.cert.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 扫码验真
 * Summary: 扫码验真
 */
func (client *Client) CheckCpfCert(request *CheckCpfCertRequest) (_result *CheckCpfCertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckCpfCertResponse{}
	_body, _err := client.CheckCpfCertEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 扫码验真
 * Summary: 扫码验真
 */
func (client *Client) CheckCpfCertEx(request *CheckCpfCertRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckCpfCertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckCpfCertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.tdm.cpf.cert.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 证明使用记录保存
 * Summary: 证明使用记录保存
 */
func (client *Client) SaveCpfCertuse(request *SaveCpfCertuseRequest) (_result *SaveCpfCertuseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveCpfCertuseResponse{}
	_body, _err := client.SaveCpfCertuseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 证明使用记录保存
 * Summary: 证明使用记录保存
 */
func (client *Client) SaveCpfCertuseEx(request *SaveCpfCertuseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveCpfCertuseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveCpfCertuseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.tdm.cpf.certuse.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 机构扫码用证
 * Summary: 扫码用证接口
 */
func (client *Client) GetCpfCertuse(request *GetCpfCertuseRequest) (_result *GetCpfCertuseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetCpfCertuseResponse{}
	_body, _err := client.GetCpfCertuseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 机构扫码用证
 * Summary: 扫码用证接口
 */
func (client *Client) GetCpfCertuseEx(request *GetCpfCertuseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetCpfCertuseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetCpfCertuseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.tdm.cpf.certuse.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 已开具证明查询
 * Summary: 已开具证明查询
 */
func (client *Client) GetCpfCert(request *GetCpfCertRequest) (_result *GetCpfCertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetCpfCertResponse{}
	_body, _err := client.GetCpfCertEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 已开具证明查询
 * Summary: 已开具证明查询
 */
func (client *Client) GetCpfCertEx(request *GetCpfCertRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetCpfCertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetCpfCertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.tdm.cpf.cert.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 证明使用记录查询
 * Summary: 证明使用记录查询
 */
func (client *Client) ListCpfCertuse(request *ListCpfCertuseRequest) (_result *ListCpfCertuseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListCpfCertuseResponse{}
	_body, _err := client.ListCpfCertuseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 证明使用记录查询
 * Summary: 证明使用记录查询
 */
func (client *Client) ListCpfCertuseEx(request *ListCpfCertuseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListCpfCertuseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListCpfCertuseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.tdm.cpf.certuse.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 机构获取用户公积金数据（授权、用数分离时接口）
 * Summary: 数据使用
 */
func (client *Client) GetCpfData(request *GetCpfDataRequest) (_result *GetCpfDataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetCpfDataResponse{}
	_body, _err := client.GetCpfDataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 机构获取用户公积金数据（授权、用数分离时接口）
 * Summary: 数据使用
 */
func (client *Client) GetCpfDataEx(request *GetCpfDataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetCpfDataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetCpfDataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.tdm.cpf.data.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 机构用数记录查询
 * Summary: 数据使用记录查询
 */
func (client *Client) ListCpfDatause(request *ListCpfDatauseRequest) (_result *ListCpfDatauseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListCpfDatauseResponse{}
	_body, _err := client.ListCpfDatauseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 机构用数记录查询
 * Summary: 数据使用记录查询
 */
func (client *Client) ListCpfDatauseEx(request *ListCpfDatauseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListCpfDatauseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListCpfDatauseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.tdm.cpf.datause.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询用户在公积金中心的个人账户、贷款合同信息
 * Summary: 公积金中心用户信息查询
 */
func (client *Client) QueryCpfUser(request *QueryCpfUserRequest) (_result *QueryCpfUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCpfUserResponse{}
	_body, _err := client.QueryCpfUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询用户在公积金中心的个人账户、贷款合同信息
 * Summary: 公积金中心用户信息查询
 */
func (client *Client) QueryCpfUserEx(request *QueryCpfUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCpfUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCpfUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.tdm.cpf.user.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 公积金业务授权接口
 * Summary: 授权接口
 */
func (client *Client) ExecCpfAuth(request *ExecCpfAuthRequest) (_result *ExecCpfAuthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecCpfAuthResponse{}
	_body, _err := client.ExecCpfAuthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 公积金业务授权接口
 * Summary: 授权接口
 */
func (client *Client) ExecCpfAuthEx(request *ExecCpfAuthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecCpfAuthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecCpfAuthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.tdm.cpf.auth.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 取消授权
 * Summary: 取消授权
 */
func (client *Client) CancelCpfAuth(request *CancelCpfAuthRequest) (_result *CancelCpfAuthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelCpfAuthResponse{}
	_body, _err := client.CancelCpfAuthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 取消授权
 * Summary: 取消授权
 */
func (client *Client) CancelCpfAuthEx(request *CancelCpfAuthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelCpfAuthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelCpfAuthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.tdm.cpf.auth.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人授权记录查询
 * Summary: 个人授权记录查询
 */
func (client *Client) QueryCpfAuth(request *QueryCpfAuthRequest) (_result *QueryCpfAuthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCpfAuthResponse{}
	_body, _err := client.QueryCpfAuthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人授权记录查询
 * Summary: 个人授权记录查询
 */
func (client *Client) QueryCpfAuthEx(request *QueryCpfAuthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCpfAuthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCpfAuthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.tdm.cpf.auth.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 可信数据流转授权
 * Summary: 授权
 */
func (client *Client) ExecAuth(request *ExecAuthRequest) (_result *ExecAuthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecAuthResponse{}
	_body, _err := client.ExecAuthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 可信数据流转授权
 * Summary: 授权
 */
func (client *Client) ExecAuthEx(request *ExecAuthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecAuthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAuthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.tdm.auth.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 取消授权
 * Summary: 取消授权
 */
func (client *Client) CancelAuth(request *CancelAuthRequest) (_result *CancelAuthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelAuthResponse{}
	_body, _err := client.CancelAuthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 取消授权
 * Summary: 取消授权
 */
func (client *Client) CancelAuthEx(request *CancelAuthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelAuthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelAuthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.tdm.auth.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用权
 * Summary: 用权
 */
func (client *Client) QueryAuth(request *QueryAuthRequest) (_result *QueryAuthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAuthResponse{}
	_body, _err := client.QueryAuthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用权
 * Summary: 用权
 */
func (client *Client) QueryAuthEx(request *QueryAuthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAuthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAuthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.tdm.auth.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 授权记录查询（个人授权记录查询）
 * Summary: 授权记录查询
 */
func (client *Client) QueryAuthOwner(request *QueryAuthOwnerRequest) (_result *QueryAuthOwnerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAuthOwnerResponse{}
	_body, _err := client.QueryAuthOwnerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 授权记录查询（个人授权记录查询）
 * Summary: 授权记录查询
 */
func (client *Client) QueryAuthOwnerEx(request *QueryAuthOwnerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAuthOwnerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAuthOwnerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.tdm.auth.owner.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 授权使用记录查询（个人查询维度）
 * Summary: 授权使用记录查询
 */
func (client *Client) QueryAuthuseOwner(request *QueryAuthuseOwnerRequest) (_result *QueryAuthuseOwnerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAuthuseOwnerResponse{}
	_body, _err := client.QueryAuthuseOwnerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 授权使用记录查询（个人查询维度）
 * Summary: 授权使用记录查询
 */
func (client *Client) QueryAuthuseOwnerEx(request *QueryAuthuseOwnerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAuthuseOwnerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAuthuseOwnerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.tdm.authuse.owner.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 授权数据使用
 * Summary: 授权数据使用
 */
func (client *Client) ExecAuthuse(request *ExecAuthuseRequest) (_result *ExecAuthuseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecAuthuseResponse{}
	_body, _err := client.ExecAuthuseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 授权数据使用
 * Summary: 授权数据使用
 */
func (client *Client) ExecAuthuseEx(request *ExecAuthuseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecAuthuseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAuthuseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.tdm.authuse.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) InitCpfVerify(request *InitCpfVerifyRequest) (_result *InitCpfVerifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitCpfVerifyResponse{}
	_body, _err := client.InitCpfVerifyEx(request, headers, runtime)
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
func (client *Client) InitCpfVerifyEx(request *InitCpfVerifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitCpfVerifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitCpfVerifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.tdm.cpf.verify.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
