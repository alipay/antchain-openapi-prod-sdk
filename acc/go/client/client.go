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

// 文件描述
type FileDefine struct {
	// 调用方设定，保证文件唯一性。
	//
	//
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 文件大小
	Size *int64 `json:"size,omitempty" xml:"size,omitempty"`
	// 文件key
	Osskey *string `json:"osskey,omitempty" xml:"osskey,omitempty" require:"true"`
	// 文件类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 预览链接
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s FileDefine) String() string {
	return tea.Prettify(s)
}

func (s FileDefine) GoString() string {
	return s.String()
}

func (s *FileDefine) SetBizId(v string) *FileDefine {
	s.BizId = &v
	return s
}

func (s *FileDefine) SetFileName(v string) *FileDefine {
	s.FileName = &v
	return s
}

func (s *FileDefine) SetSize(v int64) *FileDefine {
	s.Size = &v
	return s
}

func (s *FileDefine) SetOsskey(v string) *FileDefine {
	s.Osskey = &v
	return s
}

func (s *FileDefine) SetType(v string) *FileDefine {
	s.Type = &v
	return s
}

func (s *FileDefine) SetUrl(v string) *FileDefine {
	s.Url = &v
	return s
}

// 企业奖项
type Award struct {
	// 奖项名称
	//
	//
	AwardName *string `json:"award_name,omitempty" xml:"award_name,omitempty" require:"true"`
	// 奖项级别（参见附录十四）
	//
	//
	AwardLevel *string `json:"award_level,omitempty" xml:"award_level,omitempty" require:"true"`
	// 颁发日期（yyyy）
	//
	//
	IssueDate *string `json:"issue_date,omitempty" xml:"issue_date,omitempty" require:"true"`
	// 有效开始日期（yyyy-MM-dd）
	//
	//
	EffectStartDate *string `json:"effect_start_date,omitempty" xml:"effect_start_date,omitempty" require:"true"`
	// 有效结束日期（yyyy-MM-dd）
	//
	//
	EffectEndDate *string `json:"effect_end_date,omitempty" xml:"effect_end_date,omitempty" require:"true"`
	// 文件信息，支持上传多个文件
	//
	//
	FileDefines []*FileDefine `json:"file_defines,omitempty" xml:"file_defines,omitempty" require:"true" type:"Repeated"`
	// key
	AwardId *string `json:"award_id,omitempty" xml:"award_id,omitempty" require:"true"`
}

func (s Award) String() string {
	return tea.Prettify(s)
}

func (s Award) GoString() string {
	return s.String()
}

func (s *Award) SetAwardName(v string) *Award {
	s.AwardName = &v
	return s
}

func (s *Award) SetAwardLevel(v string) *Award {
	s.AwardLevel = &v
	return s
}

func (s *Award) SetIssueDate(v string) *Award {
	s.IssueDate = &v
	return s
}

func (s *Award) SetEffectStartDate(v string) *Award {
	s.EffectStartDate = &v
	return s
}

func (s *Award) SetEffectEndDate(v string) *Award {
	s.EffectEndDate = &v
	return s
}

func (s *Award) SetFileDefines(v []*FileDefine) *Award {
	s.FileDefines = v
	return s
}

func (s *Award) SetAwardId(v string) *Award {
	s.AwardId = &v
	return s
}

// 企业施工资质
type Construction struct {
	// 证书编号
	//
	//
	CertNum *string `json:"cert_num,omitempty" xml:"cert_num,omitempty" require:"true"`
	// 发证机关
	//
	//
	IssuingAuthority *string `json:"issuing_authority,omitempty" xml:"issuing_authority,omitempty" require:"true"`
	// 资质类别
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 等级
	Level *string `json:"level,omitempty" xml:"level,omitempty" require:"true"`
	// 有效期开始日期（yyyy-MM-dd）
	//
	//
	EffectStartDate *string `json:"effect_start_date,omitempty" xml:"effect_start_date,omitempty" require:"true"`
	// 有效期结束日期（yyyy-MM-dd）
	//
	//
	EffectEndDate *string `json:"effect_end_date,omitempty" xml:"effect_end_date,omitempty" require:"true"`
	// 文件
	FileDefines []*FileDefine `json:"file_defines,omitempty" xml:"file_defines,omitempty" type:"Repeated"`
	// key
	ConstructionId *string `json:"construction_id,omitempty" xml:"construction_id,omitempty" require:"true"`
	// 证件名称
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
}

func (s Construction) String() string {
	return tea.Prettify(s)
}

func (s Construction) GoString() string {
	return s.String()
}

func (s *Construction) SetCertNum(v string) *Construction {
	s.CertNum = &v
	return s
}

func (s *Construction) SetIssuingAuthority(v string) *Construction {
	s.IssuingAuthority = &v
	return s
}

func (s *Construction) SetCertType(v string) *Construction {
	s.CertType = &v
	return s
}

func (s *Construction) SetLevel(v string) *Construction {
	s.Level = &v
	return s
}

func (s *Construction) SetEffectStartDate(v string) *Construction {
	s.EffectStartDate = &v
	return s
}

func (s *Construction) SetEffectEndDate(v string) *Construction {
	s.EffectEndDate = &v
	return s
}

func (s *Construction) SetFileDefines(v []*FileDefine) *Construction {
	s.FileDefines = v
	return s
}

func (s *Construction) SetConstructionId(v string) *Construction {
	s.ConstructionId = &v
	return s
}

func (s *Construction) SetCertName(v string) *Construction {
	s.CertName = &v
	return s
}

// 企业资信担保
type Assure struct {
	// 担保ID
	//
	//
	AssureId *string `json:"assure_id,omitempty" xml:"assure_id,omitempty" require:"true"`
	// 文件信息，支持上传多个文件
	//
	//
	FileDefines []*FileDefine `json:"file_defines,omitempty" xml:"file_defines,omitempty" require:"true" type:"Repeated"`
}

func (s Assure) String() string {
	return tea.Prettify(s)
}

func (s Assure) GoString() string {
	return s.String()
}

func (s *Assure) SetAssureId(v string) *Assure {
	s.AssureId = &v
	return s
}

func (s *Assure) SetFileDefines(v []*FileDefine) *Assure {
	s.FileDefines = v
	return s
}

// 企业银行授信
type BankCert struct {
	// 银行账号
	//
	//
	BankAccount *string `json:"bank_account,omitempty" xml:"bank_account,omitempty" require:"true"`
	// 银行名称
	//
	//
	BankName *string `json:"bank_name,omitempty" xml:"bank_name,omitempty" require:"true"`
	// 文件信息，支持上传多个文件
	//
	//
	FileDefines []*FileDefine `json:"file_defines,omitempty" xml:"file_defines,omitempty" require:"true" type:"Repeated"`
}

func (s BankCert) String() string {
	return tea.Prettify(s)
}

func (s BankCert) GoString() string {
	return s.String()
}

func (s *BankCert) SetBankAccount(v string) *BankCert {
	s.BankAccount = &v
	return s
}

func (s *BankCert) SetBankName(v string) *BankCert {
	s.BankName = &v
	return s
}

func (s *BankCert) SetFileDefines(v []*FileDefine) *BankCert {
	s.FileDefines = v
	return s
}

// 企业资信财报
type AccountResult struct {
	// 财报ID
	//
	//
	AccResultId *string `json:"acc_result_id,omitempty" xml:"acc_result_id,omitempty" require:"true"`
	// 文件信息，支持上传多个文件
	//
	//
	FileDefines []*FileDefine `json:"file_defines,omitempty" xml:"file_defines,omitempty" require:"true" type:"Repeated"`
}

func (s AccountResult) String() string {
	return tea.Prettify(s)
}

func (s AccountResult) GoString() string {
	return s.String()
}

func (s *AccountResult) SetAccResultId(v string) *AccountResult {
	s.AccResultId = &v
	return s
}

func (s *AccountResult) SetFileDefines(v []*FileDefine) *AccountResult {
	s.FileDefines = v
	return s
}

// 关联企业信息
type RefFirm struct {
	// 企业Id
	//
	//
	FirmUserId *int64 `json:"firm_user_id,omitempty" xml:"firm_user_id,omitempty" require:"true"`
	// did
	Did *string `json:"did,omitempty" xml:"did,omitempty" require:"true"`
	//
	// 企业所在地
	FirmAddress *string `json:"firm_address,omitempty" xml:"firm_address,omitempty" require:"true"`
	// 企业认证状态
	FirmCertStatus *string `json:"firm_cert_status,omitempty" xml:"firm_cert_status,omitempty" require:"true"`
	// 行业类型
	IndustryType *string `json:"industry_type,omitempty" xml:"industry_type,omitempty" require:"true"`
	// 企业营业执照注册号
	//
	//
	CertRegNo *string `json:"cert_reg_no,omitempty" xml:"cert_reg_no,omitempty" require:"true"`
	// 营业执照文件osskey
	//
	//
	CertRegFileId *string `json:"cert_reg_file_id,omitempty" xml:"cert_reg_file_id,omitempty" require:"true"`
	// 营业文件类型(JPEG,JPG)
	//
	//
	CertRegFileType *string `json:"cert_reg_file_type,omitempty" xml:"cert_reg_file_type,omitempty" require:"true"`
	// 法定代表人证件类型
	LpCertType *string `json:"lp_cert_type,omitempty" xml:"lp_cert_type,omitempty" require:"true"`
	// 法人证件号码
	//
	LpCertNo *string `json:"lp_cert_no,omitempty" xml:"lp_cert_no,omitempty" require:"true"`
	// 法人姓名
	//
	//
	LpName *string `json:"lp_name,omitempty" xml:"lp_name,omitempty" require:"true"`
	// 法人身份证正面图片字节信息，osskeyId
	//
	//
	LpCertFileFrontId *string `json:"lp_cert_file_front_id,omitempty" xml:"lp_cert_file_front_id,omitempty" require:"true"`
	// 法人身份证正面图片文件类型
	//
	//
	LpCertFileFrontType *string `json:"lp_cert_file_front_type,omitempty" xml:"lp_cert_file_front_type,omitempty" require:"true"`
	// 企业法人证件反面图片，osskeyId
	//
	//
	LpCertFileReverseId *string `json:"lp_cert_file_reverse_id,omitempty" xml:"lp_cert_file_reverse_id,omitempty" require:"true"`
	// 法人身份证反面图片文件类型
	//
	//
	LpCertFileReverseType *string `json:"lp_cert_file_reverse_type,omitempty" xml:"lp_cert_file_reverse_type,omitempty" require:"true"`
	// 施工资质
	//
	//
	Constructions []*Construction `json:"constructions,omitempty" xml:"constructions,omitempty" require:"true" type:"Repeated"`
	// 企业名称
	//
	//
	FirmName *string `json:"firm_name,omitempty" xml:"firm_name,omitempty" require:"true"`
	// 关联关系 （参见附录三）
	//
	//
	ReferType *string `json:"refer_type,omitempty" xml:"refer_type,omitempty" require:"true"`
	// 资信-财报
	//
	//
	AccountResults []*AccountResult `json:"account_results,omitempty" xml:"account_results,omitempty" require:"true" type:"Repeated"`
	// 资信-担保
	//
	//
	Assures []*Assure `json:"assures,omitempty" xml:"assures,omitempty" require:"true" type:"Repeated"`
	// 奖项
	//
	//
	Awards []*Award `json:"awards,omitempty" xml:"awards,omitempty" require:"true" type:"Repeated"`
	// 银行授信
	//
	//
	BankCert *BankCert `json:"bank_cert,omitempty" xml:"bank_cert,omitempty" require:"true"`
	// 类型
	FirmType *string `json:"firm_type,omitempty" xml:"firm_type,omitempty" require:"true"`
	// 银行授信状态
	BankCertStatus *bool `json:"bank_cert_status,omitempty" xml:"bank_cert_status,omitempty"`
	// 资质证书状态
	ConstructionStatus *bool `json:"construction_status,omitempty" xml:"construction_status,omitempty"`
	// 资信-财报状态
	AccountResultStatus *bool `json:"account_result_status,omitempty" xml:"account_result_status,omitempty" require:"true"`
	// 奖项状态
	AwardStatus *bool `json:"award_status,omitempty" xml:"award_status,omitempty"`
}

func (s RefFirm) String() string {
	return tea.Prettify(s)
}

func (s RefFirm) GoString() string {
	return s.String()
}

func (s *RefFirm) SetFirmUserId(v int64) *RefFirm {
	s.FirmUserId = &v
	return s
}

func (s *RefFirm) SetDid(v string) *RefFirm {
	s.Did = &v
	return s
}

func (s *RefFirm) SetFirmAddress(v string) *RefFirm {
	s.FirmAddress = &v
	return s
}

func (s *RefFirm) SetFirmCertStatus(v string) *RefFirm {
	s.FirmCertStatus = &v
	return s
}

func (s *RefFirm) SetIndustryType(v string) *RefFirm {
	s.IndustryType = &v
	return s
}

func (s *RefFirm) SetCertRegNo(v string) *RefFirm {
	s.CertRegNo = &v
	return s
}

func (s *RefFirm) SetCertRegFileId(v string) *RefFirm {
	s.CertRegFileId = &v
	return s
}

func (s *RefFirm) SetCertRegFileType(v string) *RefFirm {
	s.CertRegFileType = &v
	return s
}

func (s *RefFirm) SetLpCertType(v string) *RefFirm {
	s.LpCertType = &v
	return s
}

func (s *RefFirm) SetLpCertNo(v string) *RefFirm {
	s.LpCertNo = &v
	return s
}

func (s *RefFirm) SetLpName(v string) *RefFirm {
	s.LpName = &v
	return s
}

func (s *RefFirm) SetLpCertFileFrontId(v string) *RefFirm {
	s.LpCertFileFrontId = &v
	return s
}

func (s *RefFirm) SetLpCertFileFrontType(v string) *RefFirm {
	s.LpCertFileFrontType = &v
	return s
}

func (s *RefFirm) SetLpCertFileReverseId(v string) *RefFirm {
	s.LpCertFileReverseId = &v
	return s
}

func (s *RefFirm) SetLpCertFileReverseType(v string) *RefFirm {
	s.LpCertFileReverseType = &v
	return s
}

func (s *RefFirm) SetConstructions(v []*Construction) *RefFirm {
	s.Constructions = v
	return s
}

func (s *RefFirm) SetFirmName(v string) *RefFirm {
	s.FirmName = &v
	return s
}

func (s *RefFirm) SetReferType(v string) *RefFirm {
	s.ReferType = &v
	return s
}

func (s *RefFirm) SetAccountResults(v []*AccountResult) *RefFirm {
	s.AccountResults = v
	return s
}

func (s *RefFirm) SetAssures(v []*Assure) *RefFirm {
	s.Assures = v
	return s
}

func (s *RefFirm) SetAwards(v []*Award) *RefFirm {
	s.Awards = v
	return s
}

func (s *RefFirm) SetBankCert(v *BankCert) *RefFirm {
	s.BankCert = v
	return s
}

func (s *RefFirm) SetFirmType(v string) *RefFirm {
	s.FirmType = &v
	return s
}

func (s *RefFirm) SetBankCertStatus(v bool) *RefFirm {
	s.BankCertStatus = &v
	return s
}

func (s *RefFirm) SetConstructionStatus(v bool) *RefFirm {
	s.ConstructionStatus = &v
	return s
}

func (s *RefFirm) SetAccountResultStatus(v bool) *RefFirm {
	s.AccountResultStatus = &v
	return s
}

func (s *RefFirm) SetAwardStatus(v bool) *RefFirm {
	s.AwardStatus = &v
	return s
}

// 合同流程签名人
type ContractFlowSigner struct {
	// 签署人账号id
	//
	SignerAccountId *string `json:"signer_account_id,omitempty" xml:"signer_account_id,omitempty" require:"true"`
	// 签约主体的账号id（个人/企业）；如签署人本签署，则返回签署人账号id；如签署人代机构签署，则返回机构账号id
	//
	SignerAuthorizedAccountId *string `json:"signer_authorized_account_id,omitempty" xml:"signer_authorized_account_id,omitempty" require:"true"`
	// 签约主体名称
	//
	SignerAuthorizedAccountName *string `json:"signer_authorized_account_name,omitempty" xml:"signer_authorized_account_name,omitempty" require:"true"`
	// 签署主体是否已实名
	//
	SignerAuthorizedAccountRealName *bool `json:"signer_authorized_account_real_name,omitempty" xml:"signer_authorized_account_real_name,omitempty" require:"true"`
	// 签署主体类型, 0-个人, 1-机构
	//
	SignerAuthorizedAccountType *int64 `json:"signer_authorized_account_type,omitempty" xml:"signer_authorized_account_type,omitempty" require:"true"`
	// 签署人名称
	//
	SignerName *string `json:"signer_name,omitempty" xml:"signer_name,omitempty" require:"true"`
	// 签署人是否已实名
	//
	SignerRealName *bool `json:"signer_real_name,omitempty" xml:"signer_real_name,omitempty" require:"true"`
	// 签署顺序
	//
	SignOrder *int64 `json:"sign_order,omitempty" xml:"sign_order,omitempty" require:"true"`
	// 签署状态, 0-待签, 1-未签, 2-已签 3-待审批 4-拒签
	//
	SignStatus *int64 `json:"sign_status,omitempty" xml:"sign_status,omitempty" require:"true"`
	// 本次签署任务对应指定的第三方业务流水号id，当存在多个第三方业务流水号id时，返回多个，并逗号隔开
	//
	ThirdOrderNo *string `json:"third_order_no,omitempty" xml:"third_order_no,omitempty" require:"true"`
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

// 个人认证信息
type UserDetailData struct {
	// 账户Id
	UserId *int64 `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 统一身份id
	//
	//
	Did *string `json:"did,omitempty" xml:"did,omitempty" require:"true"`
	// 账户名
	//
	//
	LoginId *string `json:"login_id,omitempty" xml:"login_id,omitempty" require:"true"`
	// 用户姓名
	//
	//
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 用户类型
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty" require:"true"`
	// 账户类型
	AccountType *string `json:"account_type,omitempty" xml:"account_type,omitempty" require:"true"`
	// 个人认证状态
	CertStatus *string `json:"cert_status,omitempty" xml:"cert_status,omitempty" require:"true"`
	// 邮箱
	Email *string `json:"email,omitempty" xml:"email,omitempty" require:"true"`
	// 手机号
	Telphone *string `json:"telphone,omitempty" xml:"telphone,omitempty" require:"true"`
	// 个人证件类型
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 证件号码
	//
	CertNum *string `json:"cert_num,omitempty" xml:"cert_num,omitempty" require:"true"`
	// cert_file_front_id
	CertFileFrontId *string `json:"cert_file_front_id,omitempty" xml:"cert_file_front_id,omitempty" require:"true"`
	// 个人证件正面类型
	CertFileFrontType *string `json:"cert_file_front_type,omitempty" xml:"cert_file_front_type,omitempty" require:"true"`
	// 个人证件反面图片，osskeyId
	//
	//
	CertFileReverseId *string `json:"cert_file_reverse_id,omitempty" xml:"cert_file_reverse_id,omitempty" require:"true"`
	// 个人证件反面类型。JPG
	//
	//
	CertFileReverseType *string `json:"cert_file_reverse_type,omitempty" xml:"cert_file_reverse_type,omitempty" require:"true"`
	// 关联企业信息
	//
	//
	RefFirms []*RefFirm `json:"ref_firms,omitempty" xml:"ref_firms,omitempty" require:"true" type:"Repeated"`
	// 是否有印章
	SealFlag *bool `json:"seal_flag,omitempty" xml:"seal_flag,omitempty"`
}

func (s UserDetailData) String() string {
	return tea.Prettify(s)
}

func (s UserDetailData) GoString() string {
	return s.String()
}

func (s *UserDetailData) SetUserId(v int64) *UserDetailData {
	s.UserId = &v
	return s
}

func (s *UserDetailData) SetDid(v string) *UserDetailData {
	s.Did = &v
	return s
}

func (s *UserDetailData) SetLoginId(v string) *UserDetailData {
	s.LoginId = &v
	return s
}

func (s *UserDetailData) SetUserName(v string) *UserDetailData {
	s.UserName = &v
	return s
}

func (s *UserDetailData) SetUserType(v string) *UserDetailData {
	s.UserType = &v
	return s
}

func (s *UserDetailData) SetAccountType(v string) *UserDetailData {
	s.AccountType = &v
	return s
}

func (s *UserDetailData) SetCertStatus(v string) *UserDetailData {
	s.CertStatus = &v
	return s
}

func (s *UserDetailData) SetEmail(v string) *UserDetailData {
	s.Email = &v
	return s
}

func (s *UserDetailData) SetTelphone(v string) *UserDetailData {
	s.Telphone = &v
	return s
}

func (s *UserDetailData) SetCertType(v string) *UserDetailData {
	s.CertType = &v
	return s
}

func (s *UserDetailData) SetCertNum(v string) *UserDetailData {
	s.CertNum = &v
	return s
}

func (s *UserDetailData) SetCertFileFrontId(v string) *UserDetailData {
	s.CertFileFrontId = &v
	return s
}

func (s *UserDetailData) SetCertFileFrontType(v string) *UserDetailData {
	s.CertFileFrontType = &v
	return s
}

func (s *UserDetailData) SetCertFileReverseId(v string) *UserDetailData {
	s.CertFileReverseId = &v
	return s
}

func (s *UserDetailData) SetCertFileReverseType(v string) *UserDetailData {
	s.CertFileReverseType = &v
	return s
}

func (s *UserDetailData) SetRefFirms(v []*RefFirm) *UserDetailData {
	s.RefFirms = v
	return s
}

func (s *UserDetailData) SetSealFlag(v bool) *UserDetailData {
	s.SealFlag = &v
	return s
}

// 返回数据结构体
type TokenData struct {
	// 授权token
	AccessToken *string `json:"access_token,omitempty" xml:"access_token,omitempty" require:"true"`
	// 授权类型
	TokenType *string `json:"token_type,omitempty" xml:"token_type,omitempty" require:"true"`
	// 过期时间
	Expiresln *int64 `json:"expiresln,omitempty" xml:"expiresln,omitempty" require:"true"`
	// 重新刷新Token
	RefreshToken *string `json:"refresh_token,omitempty" xml:"refresh_token,omitempty" require:"true"`
	// sessionid
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty"`
}

func (s TokenData) String() string {
	return tea.Prettify(s)
}

func (s TokenData) GoString() string {
	return s.String()
}

func (s *TokenData) SetAccessToken(v string) *TokenData {
	s.AccessToken = &v
	return s
}

func (s *TokenData) SetTokenType(v string) *TokenData {
	s.TokenType = &v
	return s
}

func (s *TokenData) SetExpiresln(v int64) *TokenData {
	s.Expiresln = &v
	return s
}

func (s *TokenData) SetRefreshToken(v string) *TokenData {
	s.RefreshToken = &v
	return s
}

func (s *TokenData) SetSessionId(v string) *TokenData {
	s.SessionId = &v
	return s
}

// 合同文档地址
type ContractDocAddress struct {
	// 电子合同文档ID
	//
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 电子合同文档名称，默认文件名称
	//
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 电子合同下载文档地址, 有效时间1小时
	//
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty" require:"true"`
	// 链上hash
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

// 农民工基本信息
type WorkersBaseInfo struct {
	// 姓名
	FullName *string `json:"full_name,omitempty" xml:"full_name,omitempty" require:"true"`
	// 身份证号
	IdCard *string `json:"id_card,omitempty" xml:"id_card,omitempty" require:"true"`
	// 身份证有效期起
	IdCardStartDate *string `json:"id_card_start_date,omitempty" xml:"id_card_start_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 身份证有效期止
	IdCardEndDate *string `json:"id_card_end_date,omitempty" xml:"id_card_end_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 农民工个人did（实名认证后才有工号id）
	WorkersDid *string `json:"workers_did,omitempty" xml:"workers_did,omitempty"`
	// 手机号
	MobileNo *string `json:"mobile_no,omitempty" xml:"mobile_no,omitempty"`
	// 工种
	WorkType []*string `json:"work_type,omitempty" xml:"work_type,omitempty" require:"true" type:"Repeated"`
	// 工作状态   [1.进场   2.退场]
	WorkState *string `json:"work_state,omitempty" xml:"work_state,omitempty"`
	// 进场时间
	EnterTime *string `json:"enter_time,omitempty" xml:"enter_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 退场时间
	QuitTime *string `json:"quit_time,omitempty" xml:"quit_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 合同薪资（单位：元）
	Compensation *string `json:"compensation,omitempty" xml:"compensation,omitempty"`
}

func (s WorkersBaseInfo) String() string {
	return tea.Prettify(s)
}

func (s WorkersBaseInfo) GoString() string {
	return s.String()
}

func (s *WorkersBaseInfo) SetFullName(v string) *WorkersBaseInfo {
	s.FullName = &v
	return s
}

func (s *WorkersBaseInfo) SetIdCard(v string) *WorkersBaseInfo {
	s.IdCard = &v
	return s
}

func (s *WorkersBaseInfo) SetIdCardStartDate(v string) *WorkersBaseInfo {
	s.IdCardStartDate = &v
	return s
}

func (s *WorkersBaseInfo) SetIdCardEndDate(v string) *WorkersBaseInfo {
	s.IdCardEndDate = &v
	return s
}

func (s *WorkersBaseInfo) SetWorkersDid(v string) *WorkersBaseInfo {
	s.WorkersDid = &v
	return s
}

func (s *WorkersBaseInfo) SetMobileNo(v string) *WorkersBaseInfo {
	s.MobileNo = &v
	return s
}

func (s *WorkersBaseInfo) SetWorkType(v []*string) *WorkersBaseInfo {
	s.WorkType = v
	return s
}

func (s *WorkersBaseInfo) SetWorkState(v string) *WorkersBaseInfo {
	s.WorkState = &v
	return s
}

func (s *WorkersBaseInfo) SetEnterTime(v string) *WorkersBaseInfo {
	s.EnterTime = &v
	return s
}

func (s *WorkersBaseInfo) SetQuitTime(v string) *WorkersBaseInfo {
	s.QuitTime = &v
	return s
}

func (s *WorkersBaseInfo) SetCompensation(v string) *WorkersBaseInfo {
	s.Compensation = &v
	return s
}

// 签约字段
type ContractSignField struct {
	// account_id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// file_id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// signfield_id
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

// 农民工工资发放
type WorkersWagePayment struct {
	// 薪资年月
	PayYM *string `json:"pay_y_m,omitempty" xml:"pay_y_m,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 工资是否发放[已发放 未发放]
	PayWages *string `json:"pay_wages,omitempty" xml:"pay_wages,omitempty" require:"true"`
}

func (s WorkersWagePayment) String() string {
	return tea.Prettify(s)
}

func (s WorkersWagePayment) GoString() string {
	return s.String()
}

func (s *WorkersWagePayment) SetPayYM(v string) *WorkersWagePayment {
	s.PayYM = &v
	return s
}

func (s *WorkersWagePayment) SetPayWages(v string) *WorkersWagePayment {
	s.PayWages = &v
	return s
}

// 账号信息
type UserData struct {
	// 账号id
	LoginId *string `json:"login_id,omitempty" xml:"login_id,omitempty" require:"true"`
	// 账号id
	UserId *int64 `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 用户类型
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty" require:"true"`
	// 用户姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 关联企业
	RefFirms []*RefFirm `json:"ref_firms,omitempty" xml:"ref_firms,omitempty" require:"true" type:"Repeated"`
	// 认证状态
	CertStatus *string `json:"cert_status,omitempty" xml:"cert_status,omitempty" require:"true"`
	// 账户类别
	AccountType *string `json:"account_type,omitempty" xml:"account_type,omitempty" require:"true"`
	// did
	Did *string `json:"did,omitempty" xml:"did,omitempty" require:"true"`
}

func (s UserData) String() string {
	return tea.Prettify(s)
}

func (s UserData) GoString() string {
	return s.String()
}

func (s *UserData) SetLoginId(v string) *UserData {
	s.LoginId = &v
	return s
}

func (s *UserData) SetUserId(v int64) *UserData {
	s.UserId = &v
	return s
}

func (s *UserData) SetUserType(v string) *UserData {
	s.UserType = &v
	return s
}

func (s *UserData) SetUserName(v string) *UserData {
	s.UserName = &v
	return s
}

func (s *UserData) SetRefFirms(v []*RefFirm) *UserData {
	s.RefFirms = v
	return s
}

func (s *UserData) SetCertStatus(v string) *UserData {
	s.CertStatus = &v
	return s
}

func (s *UserData) SetAccountType(v string) *UserData {
	s.AccountType = &v
	return s
}

func (s *UserData) SetDid(v string) *UserData {
	s.Did = &v
	return s
}

// 合同关联主体
type Contractaccountapplication struct {
	// 邮箱
	Email *string `json:"email,omitempty" xml:"email,omitempty" require:"true"`
	// 身份证号码
	IdNumber *string `json:"id_number,omitempty" xml:"id_number,omitempty" require:"true"`
	// 身份证类型
	IdType *string `json:"id_type,omitempty" xml:"id_type,omitempty" require:"true"`
	// 电话号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s Contractaccountapplication) String() string {
	return tea.Prettify(s)
}

func (s Contractaccountapplication) GoString() string {
	return s.String()
}

func (s *Contractaccountapplication) SetEmail(v string) *Contractaccountapplication {
	s.Email = &v
	return s
}

func (s *Contractaccountapplication) SetIdNumber(v string) *Contractaccountapplication {
	s.IdNumber = &v
	return s
}

func (s *Contractaccountapplication) SetIdType(v string) *Contractaccountapplication {
	s.IdType = &v
	return s
}

func (s *Contractaccountapplication) SetMobile(v string) *Contractaccountapplication {
	s.Mobile = &v
	return s
}

func (s *Contractaccountapplication) SetName(v string) *Contractaccountapplication {
	s.Name = &v
	return s
}

func (s *Contractaccountapplication) SetUserId(v string) *Contractaccountapplication {
	s.UserId = &v
	return s
}

// 存证信息
type ContractNotaryInfo struct {
	// 存证的内容哈希值
	//
	ContentHash *string `json:"content_hash,omitempty" xml:"content_hash,omitempty" require:"true"`
	// 存证相关联的文档ID
	//
	DocId *string `json:"doc_id,omitempty" xml:"doc_id,omitempty" require:"true"`
	// 存证事务ID
	//
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty" require:"true"`
	// 存证地址
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
}

func (s ContractNotaryInfo) String() string {
	return tea.Prettify(s)
}

func (s ContractNotaryInfo) GoString() string {
	return s.String()
}

func (s *ContractNotaryInfo) SetContentHash(v string) *ContractNotaryInfo {
	s.ContentHash = &v
	return s
}

func (s *ContractNotaryInfo) SetDocId(v string) *ContractNotaryInfo {
	s.DocId = &v
	return s
}

func (s *ContractNotaryInfo) SetTransactionId(v string) *ContractNotaryInfo {
	s.TransactionId = &v
	return s
}

func (s *ContractNotaryInfo) SetTxHash(v string) *ContractNotaryInfo {
	s.TxHash = &v
	return s
}

// ContractSignFieldApplication
type ContractSignFieldApplication struct {
	// add_sign_time
	AddSignTime *bool `json:"add_sign_time,omitempty" xml:"add_sign_time,omitempty"`
	// authorized_account_id
	AuthorizedAccountId *string `json:"authorized_account_id,omitempty" xml:"authorized_account_id,omitempty" require:"true"`
	// file_id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// order
	Order *string `json:"order,omitempty" xml:"order,omitempty"`
	// pos_page
	PosPage *string `json:"pos_page,omitempty" xml:"pos_page,omitempty" require:"true"`
	// pos_x
	PosX *string `json:"pos_x,omitempty" xml:"pos_x,omitempty" require:"true"`
	// seal_id
	SealId *string `json:"seal_id,omitempty" xml:"seal_id,omitempty"`
	// third_order_no
	ThirdOrderNo *string `json:"third_order_no,omitempty" xml:"third_order_no,omitempty"`
	// pos_y
	PosY *string `json:"pos_y,omitempty" xml:"pos_y,omitempty" require:"true"`
	// width
	Width *string `json:"width,omitempty" xml:"width,omitempty"`
	// signType
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

func (s *ContractSignFieldApplication) SetOrder(v string) *ContractSignFieldApplication {
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

func (s *ContractSignFieldApplication) SetSealId(v string) *ContractSignFieldApplication {
	s.SealId = &v
	return s
}

func (s *ContractSignFieldApplication) SetThirdOrderNo(v string) *ContractSignFieldApplication {
	s.ThirdOrderNo = &v
	return s
}

func (s *ContractSignFieldApplication) SetPosY(v string) *ContractSignFieldApplication {
	s.PosY = &v
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

// ContractHandSignFieldApplication
type ContractHandSignFieldApplication struct {
	// account_id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// file_id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// order
	Order *int64 `json:"order,omitempty" xml:"order,omitempty"`
	// pos_page
	PosPage *string `json:"pos_page,omitempty" xml:"pos_page,omitempty"`
	// posX
	PosX *string `json:"pos_x,omitempty" xml:"pos_x,omitempty"`
	// posY
	PosY *string `json:"pos_y,omitempty" xml:"pos_y,omitempty"`
	// sealId
	SealId *string `json:"seal_id,omitempty" xml:"seal_id,omitempty"`
	// signDateBeanType
	SignDateBeanType *int64 `json:"sign_date_bean_type,omitempty" xml:"sign_date_bean_type,omitempty" require:"true"`
	// signDateFontSize
	SignDateFontSize *int64 `json:"sign_date_font_size,omitempty" xml:"sign_date_font_size,omitempty" require:"true"`
	// sign_date_format
	SignDateFormat *string `json:"sign_date_format,omitempty" xml:"sign_date_format,omitempty"`
	// signDatePosPage
	SignDatePosPage *int64 `json:"sign_date_pos_page,omitempty" xml:"sign_date_pos_page,omitempty"`
	// signDatePosX
	SignDatePosX *string `json:"sign_date_pos_x,omitempty" xml:"sign_date_pos_x,omitempty"`
	// sign_date_pos_y
	SignDatePosY *string `json:"sign_date_pos_y,omitempty" xml:"sign_date_pos_y,omitempty"`
	// sign_type
	SignType *int64 `json:"sign_type,omitempty" xml:"sign_type,omitempty"`
	// third_order_no
	ThirdOrderNo *string `json:"third_order_no,omitempty" xml:"third_order_no,omitempty"`
	// width
	Width *string `json:"width,omitempty" xml:"width,omitempty"`
	// seal_ids
	SealIds []*string `json:"seal_ids,omitempty" xml:"seal_ids,omitempty" type:"Repeated"`
	// 签名字段type
	SignFieldType *int64 `json:"sign_field_type,omitempty" xml:"sign_field_type,omitempty"`
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

func (s *ContractHandSignFieldApplication) SetSignFieldType(v int64) *ContractHandSignFieldApplication {
	s.SignFieldType = &v
	return s
}

// 农民工考勤
type WorkersCheckAttendance struct {
	// 考勤类型  [1.入场 2.退场]
	AttendanceType *string `json:"attendance_type,omitempty" xml:"attendance_type,omitempty" require:"true"`
	// 打卡时间
	ClockInTime *string `json:"clock_in_time,omitempty" xml:"clock_in_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s WorkersCheckAttendance) String() string {
	return tea.Prettify(s)
}

func (s WorkersCheckAttendance) GoString() string {
	return s.String()
}

func (s *WorkersCheckAttendance) SetAttendanceType(v string) *WorkersCheckAttendance {
	s.AttendanceType = &v
	return s
}

func (s *WorkersCheckAttendance) SetClockInTime(v string) *WorkersCheckAttendance {
	s.ClockInTime = &v
	return s
}

// 签署区列表详情
type ContractSignFieldDetail struct {
	// 签约主体类别，0-个人，1-机构，默认0,2 是不限
	ActorIndentityType *int64 `json:"actor_indentity_type,omitempty" xml:"actor_indentity_type,omitempty" require:"true"`
	// 添加时间
	AddTime *int64 `json:"add_time,omitempty" xml:"add_time,omitempty" require:"true"`
	// 是否指定位置，TRUE表示不允许更新位置，配置项，无默认值
	AssignedPosbean *bool `json:"assigned_posbean,omitempty" xml:"assigned_posbean,omitempty" require:"true"`
	// 是否指定印章数据，TRUE表示不允许更新印章，配置项，无默认值
	AssignedSeal *bool `json:"assigned_seal,omitempty" xml:"assigned_seal,omitempty" require:"true"`
	// 签约主体账号标识，将使用该主体账号对应的数字证书完成本次签署，如：当存在签署操作人代某机构签署时，需要传入该机构的账号id
	AuthorizedAccountId *string `json:"authorized_account_id,omitempty" xml:"authorized_account_id,omitempty" require:"true"`
	// 是否自动执行，TRUE需要静默授权，配置项，无默认值
	AutoExecute *bool `json:"auto_execute,omitempty" xml:"auto_execute,omitempty" require:"true"`
	// 执行失败原因
	ExecuteFailedReason *string `json:"execute_failed_reason,omitempty" xml:"execute_failed_reason,omitempty" require:"true"`
	// 文件file id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 流程id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	// 签署区顺序，默认1,且不小于1，顺序越小越先处理
	Order *int64 `json:"order,omitempty" xml:"order,omitempty" require:"true"`
	// 页码信息，可以_,_或_-_分割
	PosPage *string `json:"pos_page,omitempty" xml:"pos_page,omitempty" require:"true"`
	// x坐标
	PosX *string `json:"pos_x,omitempty" xml:"pos_x,omitempty" require:"true"`
	// y坐标
	PosY *string `json:"pos_y,omitempty" xml:"pos_y,omitempty" require:"true"`
	// 印章文件file key
	SealFileKey *string `json:"seal_file_key,omitempty" xml:"seal_file_key,omitempty" require:"true"`
	// 印章id
	SealId *string `json:"seal_id,omitempty" xml:"seal_id,omitempty" require:"true"`
	// 印章类型，支持多种类型时逗号分割，0-手绘印章，1-模版印章，为空不限制
	SealType *string `json:"seal_type,omitempty" xml:"seal_type,omitempty" require:"true"`
	// 签署操作人个人账号标识，即操作本次签署的个人，如需e签宝通知用户签署，则系统向该账号下绑定的手机、邮箱发送签署链接
	SignerAccountId *string `json:"signer_account_id,omitempty" xml:"signer_account_id,omitempty" require:"true"`
	// 签署区Id
	SignfieldId *string `json:"signfield_id,omitempty" xml:"signfield_id,omitempty" require:"true"`
	// 签署类型，0-不限，1-单页签署，2-骑缝签署,4-关键字签署，默认1
	SignType *int64 `json:"sign_type,omitempty" xml:"sign_type,omitempty" require:"true"`
	// 签署区状态（0："等待执行，1："执行中"，2："执行失败"，3："审批中"，4： "执行完成")
	Status *int64 `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 状态描述
	StatusDescription *string `json:"status_description,omitempty" xml:"status_description,omitempty" require:"true"`
	// 签署区宽
	Width *string `json:"width,omitempty" xml:"width,omitempty" require:"true"`
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

// 代扣订单信息
type ContractPaymentOrderInfo struct {
	// 代扣触发时间，精确到毫秒 java.lang.System#currentTimeMillis()
	//
	PayDate *int64 `json:"pay_date,omitempty" xml:"pay_date,omitempty" require:"true"`
	// 代扣金额，整数 精确到分
	//
	PayMoney *int64 `json:"pay_money,omitempty" xml:"pay_money,omitempty" require:"true"`
	// 是否用户签署成功后立即触发第一期代扣
	//
	TriggerImmediately *int64 `json:"trigger_immediately,omitempty" xml:"trigger_immediately,omitempty"`
}

func (s ContractPaymentOrderInfo) String() string {
	return tea.Prettify(s)
}

func (s ContractPaymentOrderInfo) GoString() string {
	return s.String()
}

func (s *ContractPaymentOrderInfo) SetPayDate(v int64) *ContractPaymentOrderInfo {
	s.PayDate = &v
	return s
}

func (s *ContractPaymentOrderInfo) SetPayMoney(v int64) *ContractPaymentOrderInfo {
	s.PayMoney = &v
	return s
}

func (s *ContractPaymentOrderInfo) SetTriggerImmediately(v int64) *ContractPaymentOrderInfo {
	s.TriggerImmediately = &v
	return s
}

// 财报信息
type FileInfo struct {
	// 业务id
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 财报文件，base64
	FileStr *string `json:"file_str,omitempty" xml:"file_str,omitempty" require:"true"`
	// 文件名称（企业财报.jpg）
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 文件大小(byte长度)
	FileSize *int64 `json:"file_size,omitempty" xml:"file_size,omitempty" require:"true"`
	// 文件类型(jpg)
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
}

func (s FileInfo) String() string {
	return tea.Prettify(s)
}

func (s FileInfo) GoString() string {
	return s.String()
}

func (s *FileInfo) SetBizId(v string) *FileInfo {
	s.BizId = &v
	return s
}

func (s *FileInfo) SetFileStr(v string) *FileInfo {
	s.FileStr = &v
	return s
}

func (s *FileInfo) SetFileName(v string) *FileInfo {
	s.FileName = &v
	return s
}

func (s *FileInfo) SetFileSize(v int64) *FileInfo {
	s.FileSize = &v
	return s
}

func (s *FileInfo) SetFileType(v string) *FileInfo {
	s.FileType = &v
	return s
}

// 待签署文件
type ContractDocument struct {
	// 是否加密，0-不加密，1-加，默认0
	//
	Encryption *int64 `json:"encryption,omitempty" xml:"encryption,omitempty"`
	// 电子合同文档的ID
	//
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 电子合同文档名称，默认文件名称
	//
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// 电子合同文档密码, 如果encryption值为1, 文档密码不能为空，默认没有密码
	//
	FilePassword *string `json:"file_password,omitempty" xml:"file_password,omitempty"`
}

func (s ContractDocument) String() string {
	return tea.Prettify(s)
}

func (s ContractDocument) GoString() string {
	return s.String()
}

func (s *ContractDocument) SetEncryption(v int64) *ContractDocument {
	s.Encryption = &v
	return s
}

func (s *ContractDocument) SetFileId(v string) *ContractDocument {
	s.FileId = &v
	return s
}

func (s *ContractDocument) SetFileName(v string) *ContractDocument {
	s.FileName = &v
	return s
}

func (s *ContractDocument) SetFilePassword(v string) *ContractDocument {
	s.FilePassword = &v
	return s
}

// OneStepSignField
type OneStepSignField struct {
	// accountId
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// file_id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// order
	Order *int64 `json:"order,omitempty" xml:"order,omitempty"`
	// posPage
	PosPage *string `json:"pos_page,omitempty" xml:"pos_page,omitempty" require:"true"`
	// posX
	PosX *string `json:"pos_x,omitempty" xml:"pos_x,omitempty" require:"true"`
	// posY
	PosY *string `json:"pos_y,omitempty" xml:"pos_y,omitempty" require:"true"`
	// sealId
	SealId *string `json:"seal_id,omitempty" xml:"seal_id,omitempty"`
	// sign_date_bean_type
	SignDateBeanType *int64 `json:"sign_date_bean_type,omitempty" xml:"sign_date_bean_type,omitempty"`
	// sign_date_font_size
	SignDateFontSize *int64 `json:"sign_date_font_size,omitempty" xml:"sign_date_font_size,omitempty"`
	// sign_date_format
	SignDateFormat *string `json:"sign_date_format,omitempty" xml:"sign_date_format,omitempty"`
	// sign_date_pos_page
	SignDatePosPage *int64 `json:"sign_date_pos_page,omitempty" xml:"sign_date_pos_page,omitempty"`
	// sign_date_pos_x
	SignDatePosX *string `json:"sign_date_pos_x,omitempty" xml:"sign_date_pos_x,omitempty"`
	//
	SignDatePosY *string `json:"sign_date_pos_y,omitempty" xml:"sign_date_pos_y,omitempty"`
	// signType
	SignType *int64 `json:"sign_type,omitempty" xml:"sign_type,omitempty"`
	// third_order_no
	ThirdOrderNo *string `json:"third_order_no,omitempty" xml:"third_order_no,omitempty"`
	// width
	Width *string `json:"width,omitempty" xml:"width,omitempty"`
	// auto_execute
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

// 法人认证信息
type CertifyLPDTO struct {
	// 认证id
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
	// 二维码url
	QrUrl *string `json:"qr_url,omitempty" xml:"qr_url,omitempty" require:"true"`
	//  二维码中的Logo的图片地址
	ImgUrl *string `json:"img_url,omitempty" xml:"img_url,omitempty" require:"true"`
	//  二维码中Logo缩放的比例系数，如5表示长宽最小值的1/5
	Ratio *string `json:"ratio,omitempty" xml:"ratio,omitempty" require:"true"`
	// 过期时间戳，单位毫秒
	Expires *int64 `json:"expires,omitempty" xml:"expires,omitempty" require:"true"`
}

func (s CertifyLPDTO) String() string {
	return tea.Prettify(s)
}

func (s CertifyLPDTO) GoString() string {
	return s.String()
}

func (s *CertifyLPDTO) SetCertifyId(v string) *CertifyLPDTO {
	s.CertifyId = &v
	return s
}

func (s *CertifyLPDTO) SetQrUrl(v string) *CertifyLPDTO {
	s.QrUrl = &v
	return s
}

func (s *CertifyLPDTO) SetImgUrl(v string) *CertifyLPDTO {
	s.ImgUrl = &v
	return s
}

func (s *CertifyLPDTO) SetRatio(v string) *CertifyLPDTO {
	s.Ratio = &v
	return s
}

func (s *CertifyLPDTO) SetExpires(v int64) *CertifyLPDTO {
	s.Expires = &v
	return s
}

// 合约签约配置
type Contractsignflowconfig struct {
	// 回调通知地址 ,默认取项目配置通知地址
	//
	NoticeDeveloperUrl *string `json:"notice_developer_url,omitempty" xml:"notice_developer_url,omitempty"`
	// 通知方式，逗号分割，1-短信，2-邮件 。默认值1，请务必请选择一个通知方式，否则客户将接收不到流程的签署通知和审批通知，如果流程需要审批，将导致审批无法完成；如果客户需要不通知，可以设置notice_type为""
	//
	NoticeType *string `json:"notice_type,omitempty" xml:"notice_type,omitempty" require:"true"`
	// 签署成功或者流程结束后的默认重定向地址，默认签署完成停在当前页面
	//
	RedirectUrl *string `json:"redirect_url,omitempty" xml:"redirect_url,omitempty"`
	// 签署成功或者流程结束后的默认重定向地址，默认签署完成停在当前页面
	//
	SignPlatform *string `json:"sign_platform,omitempty" xml:"sign_platform,omitempty"`
	// 签署失败时的跳转地址，如果不做单独配置，默认与redirect_url一致（配合twc.notary.contract.signflow.create接口使用）
	//
	RedirectUrlOnFailure *string `json:"redirect_url_on_failure,omitempty" xml:"redirect_url_on_failure,omitempty"`
	// 是否允许自由签署，默认false（配合twc.notary.contract.signflow.create接口使用）
	//
	FreeSignature *bool `json:"free_signature,omitempty" xml:"free_signature,omitempty"`
}

func (s Contractsignflowconfig) String() string {
	return tea.Prettify(s)
}

func (s Contractsignflowconfig) GoString() string {
	return s.String()
}

func (s *Contractsignflowconfig) SetNoticeDeveloperUrl(v string) *Contractsignflowconfig {
	s.NoticeDeveloperUrl = &v
	return s
}

func (s *Contractsignflowconfig) SetNoticeType(v string) *Contractsignflowconfig {
	s.NoticeType = &v
	return s
}

func (s *Contractsignflowconfig) SetRedirectUrl(v string) *Contractsignflowconfig {
	s.RedirectUrl = &v
	return s
}

func (s *Contractsignflowconfig) SetSignPlatform(v string) *Contractsignflowconfig {
	s.SignPlatform = &v
	return s
}

func (s *Contractsignflowconfig) SetRedirectUrlOnFailure(v string) *Contractsignflowconfig {
	s.RedirectUrlOnFailure = &v
	return s
}

func (s *Contractsignflowconfig) SetFreeSignature(v bool) *Contractsignflowconfig {
	s.FreeSignature = &v
	return s
}

// 企业银行授信
type BandCert struct {
	// 银行账号
	//
	//
	BankAccount *string `json:"bank_account,omitempty" xml:"bank_account,omitempty" require:"true"`
	// 银行名称
	//
	//
	BankName *string `json:"bank_name,omitempty" xml:"bank_name,omitempty" require:"true"`
	// 文件信息，支持上传多个文件
	//
	//
	FileDefines []*FileDefine `json:"file_defines,omitempty" xml:"file_defines,omitempty" require:"true" type:"Repeated"`
}

func (s BandCert) String() string {
	return tea.Prettify(s)
}

func (s BandCert) GoString() string {
	return s.String()
}

func (s *BandCert) SetBankAccount(v string) *BandCert {
	s.BankAccount = &v
	return s
}

func (s *BandCert) SetBankName(v string) *BandCert {
	s.BankName = &v
	return s
}

func (s *BandCert) SetFileDefines(v []*FileDefine) *BandCert {
	s.FileDefines = v
	return s
}

// 保证金对象
type SecurityFundDto struct {
	// 保证金类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 金额
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
}

func (s SecurityFundDto) String() string {
	return tea.Prettify(s)
}

func (s SecurityFundDto) GoString() string {
	return s.String()
}

func (s *SecurityFundDto) SetType(v string) *SecurityFundDto {
	s.Type = &v
	return s
}

func (s *SecurityFundDto) SetAmount(v string) *SecurityFundDto {
	s.Amount = &v
	return s
}

// 合同乙方信息
type PartyBFirmDto struct {
	// 乙方统一社会信用代码
	PartyBBidderCode *string `json:"party_b_bidder_code,omitempty" xml:"party_b_bidder_code,omitempty" require:"true"`
	// 乙方名称
	PartyBName *string `json:"party_b_name,omitempty" xml:"party_b_name,omitempty" require:"true"`
	// 乙方授权代表Did
	PartyBAuditDid *string `json:"party_b_audit_did,omitempty" xml:"party_b_audit_did,omitempty" require:"true"`
}

func (s PartyBFirmDto) String() string {
	return tea.Prettify(s)
}

func (s PartyBFirmDto) GoString() string {
	return s.String()
}

func (s *PartyBFirmDto) SetPartyBBidderCode(v string) *PartyBFirmDto {
	s.PartyBBidderCode = &v
	return s
}

func (s *PartyBFirmDto) SetPartyBName(v string) *PartyBFirmDto {
	s.PartyBName = &v
	return s
}

func (s *PartyBFirmDto) SetPartyBAuditDid(v string) *PartyBFirmDto {
	s.PartyBAuditDid = &v
	return s
}

// 合同企业主体
type Contractorganizationapplication struct {
	// 执照号码
	IdNumber *string `json:"id_number,omitempty" xml:"id_number,omitempty" require:"true"`
	// 执照类型
	IdType *string `json:"id_type,omitempty" xml:"id_type,omitempty" require:"true"`
	// 法人名称
	LegalPerson *string `json:"legal_person,omitempty" xml:"legal_person,omitempty" require:"true"`
	// 法人证件号
	LegalPersonId *string `json:"legal_person_id,omitempty" xml:"legal_person_id,omitempty" require:"true"`
	// 企业名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 组织id
	OrganizationId *string `json:"organization_id,omitempty" xml:"organization_id,omitempty" require:"true"`
}

func (s Contractorganizationapplication) String() string {
	return tea.Prettify(s)
}

func (s Contractorganizationapplication) GoString() string {
	return s.String()
}

func (s *Contractorganizationapplication) SetIdNumber(v string) *Contractorganizationapplication {
	s.IdNumber = &v
	return s
}

func (s *Contractorganizationapplication) SetIdType(v string) *Contractorganizationapplication {
	s.IdType = &v
	return s
}

func (s *Contractorganizationapplication) SetLegalPerson(v string) *Contractorganizationapplication {
	s.LegalPerson = &v
	return s
}

func (s *Contractorganizationapplication) SetLegalPersonId(v string) *Contractorganizationapplication {
	s.LegalPersonId = &v
	return s
}

func (s *Contractorganizationapplication) SetName(v string) *Contractorganizationapplication {
	s.Name = &v
	return s
}

func (s *Contractorganizationapplication) SetOrganizationId(v string) *Contractorganizationapplication {
	s.OrganizationId = &v
	return s
}

type VerifyUserPwdRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 登录账号
	LoginId *string `json:"login_id,omitempty" xml:"login_id,omitempty" require:"true"`
	// 登录密码
	Password *string `json:"password,omitempty" xml:"password,omitempty" require:"true"`
	// 过期时间指定(单位 秒)，默认30分钟
	Expires *int64 `json:"expires,omitempty" xml:"expires,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 公钥名称
	PubkeyName *string `json:"pubkey_name,omitempty" xml:"pubkey_name,omitempty" require:"true"`
}

func (s VerifyUserPwdRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyUserPwdRequest) GoString() string {
	return s.String()
}

func (s *VerifyUserPwdRequest) SetAuthToken(v string) *VerifyUserPwdRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyUserPwdRequest) SetProductInstanceId(v string) *VerifyUserPwdRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyUserPwdRequest) SetLoginId(v string) *VerifyUserPwdRequest {
	s.LoginId = &v
	return s
}

func (s *VerifyUserPwdRequest) SetPassword(v string) *VerifyUserPwdRequest {
	s.Password = &v
	return s
}

func (s *VerifyUserPwdRequest) SetExpires(v int64) *VerifyUserPwdRequest {
	s.Expires = &v
	return s
}

func (s *VerifyUserPwdRequest) SetTenantId(v string) *VerifyUserPwdRequest {
	s.TenantId = &v
	return s
}

func (s *VerifyUserPwdRequest) SetPubkeyName(v string) *VerifyUserPwdRequest {
	s.PubkeyName = &v
	return s
}

type VerifyUserPwdResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回数据
	Data *TokenData `json:"data,omitempty" xml:"data,omitempty"`
	// 用户id返回值
	UserId *int64 `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s VerifyUserPwdResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyUserPwdResponse) GoString() string {
	return s.String()
}

func (s *VerifyUserPwdResponse) SetReqMsgId(v string) *VerifyUserPwdResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyUserPwdResponse) SetResultCode(v string) *VerifyUserPwdResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyUserPwdResponse) SetResultMsg(v string) *VerifyUserPwdResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyUserPwdResponse) SetData(v *TokenData) *VerifyUserPwdResponse {
	s.Data = v
	return s
}

func (s *VerifyUserPwdResponse) SetUserId(v int64) *VerifyUserPwdResponse {
	s.UserId = &v
	return s
}

func (s *VerifyUserPwdResponse) SetDid(v string) *VerifyUserPwdResponse {
	s.Did = &v
	return s
}

type ApplyUserSmsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 邮箱 or 短信 二选一
	Telphone *string `json:"telphone,omitempty" xml:"telphone,omitempty"`
	// 过期时间（单位：秒），默认30分钟
	Expires *int64 `json:"expires,omitempty" xml:"expires,omitempty"`
	// 重发短信时间（单位：S），默认60s
	Intervals *int64 `json:"intervals,omitempty" xml:"intervals,omitempty"`
	// 是否立刻发发送短信(1 立刻发送 0 等待业务触发)
	SendDirect *int64 `json:"send_direct,omitempty" xml:"send_direct,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 邮箱
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
}

func (s ApplyUserSmsRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyUserSmsRequest) GoString() string {
	return s.String()
}

func (s *ApplyUserSmsRequest) SetAuthToken(v string) *ApplyUserSmsRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyUserSmsRequest) SetProductInstanceId(v string) *ApplyUserSmsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyUserSmsRequest) SetTelphone(v string) *ApplyUserSmsRequest {
	s.Telphone = &v
	return s
}

func (s *ApplyUserSmsRequest) SetExpires(v int64) *ApplyUserSmsRequest {
	s.Expires = &v
	return s
}

func (s *ApplyUserSmsRequest) SetIntervals(v int64) *ApplyUserSmsRequest {
	s.Intervals = &v
	return s
}

func (s *ApplyUserSmsRequest) SetSendDirect(v int64) *ApplyUserSmsRequest {
	s.SendDirect = &v
	return s
}

func (s *ApplyUserSmsRequest) SetTenantId(v string) *ApplyUserSmsRequest {
	s.TenantId = &v
	return s
}

func (s *ApplyUserSmsRequest) SetEmail(v string) *ApplyUserSmsRequest {
	s.Email = &v
	return s
}

type ApplyUserSmsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 短信重新触发url
	//
	//
	SmsResendUrl *string `json:"sms_resend_url,omitempty" xml:"sms_resend_url,omitempty"`
	// 核验id
	//
	//
	VerifyId *string `json:"verify_id,omitempty" xml:"verify_id,omitempty"`
	// did_24c93459216945468fdf1d899c521910
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s ApplyUserSmsResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyUserSmsResponse) GoString() string {
	return s.String()
}

func (s *ApplyUserSmsResponse) SetReqMsgId(v string) *ApplyUserSmsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyUserSmsResponse) SetResultCode(v string) *ApplyUserSmsResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyUserSmsResponse) SetResultMsg(v string) *ApplyUserSmsResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyUserSmsResponse) SetSmsResendUrl(v string) *ApplyUserSmsResponse {
	s.SmsResendUrl = &v
	return s
}

func (s *ApplyUserSmsResponse) SetVerifyId(v string) *ApplyUserSmsResponse {
	s.VerifyId = &v
	return s
}

func (s *ApplyUserSmsResponse) SetDid(v string) *ApplyUserSmsResponse {
	s.Did = &v
	return s
}

type VerifyUserSmsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 核验id，sms_login_apply 产生
	VerifyId *string `json:"verify_id,omitempty" xml:"verify_id,omitempty" require:"true"`
	// 短信code
	CheckCode *string `json:"check_code,omitempty" xml:"check_code,omitempty" require:"true"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
}

func (s VerifyUserSmsRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyUserSmsRequest) GoString() string {
	return s.String()
}

func (s *VerifyUserSmsRequest) SetAuthToken(v string) *VerifyUserSmsRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyUserSmsRequest) SetProductInstanceId(v string) *VerifyUserSmsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyUserSmsRequest) SetVerifyId(v string) *VerifyUserSmsRequest {
	s.VerifyId = &v
	return s
}

func (s *VerifyUserSmsRequest) SetCheckCode(v string) *VerifyUserSmsRequest {
	s.CheckCode = &v
	return s
}

func (s *VerifyUserSmsRequest) SetTenantId(v string) *VerifyUserSmsRequest {
	s.TenantId = &v
	return s
}

type VerifyUserSmsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回数据
	Data *TokenData `json:"data,omitempty" xml:"data,omitempty"`
	// 新增userId返回值
	UserId *int64 `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s VerifyUserSmsResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyUserSmsResponse) GoString() string {
	return s.String()
}

func (s *VerifyUserSmsResponse) SetReqMsgId(v string) *VerifyUserSmsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyUserSmsResponse) SetResultCode(v string) *VerifyUserSmsResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyUserSmsResponse) SetResultMsg(v string) *VerifyUserSmsResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyUserSmsResponse) SetData(v *TokenData) *VerifyUserSmsResponse {
	s.Data = v
	return s
}

func (s *VerifyUserSmsResponse) SetUserId(v int64) *VerifyUserSmsResponse {
	s.UserId = &v
	return s
}

type AuthUserRefRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 操作员id，一般是C类用户
	OperatorId *int64 `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
	// 待登录的B类账号id
	RefUserId *int64 `json:"ref_user_id,omitempty" xml:"ref_user_id,omitempty" require:"true"`
	// operatorId 用户登录时对应的accessToken
	//
	//
	AccessToken *string `json:"access_token,omitempty" xml:"access_token,omitempty" require:"true"`
	// 是否设为默认企业(1 设置默认企业 0 切换临时企业)
	//
	//
	SetDefault *int64 `json:"set_default,omitempty" xml:"set_default,omitempty" require:"true"`
}

func (s AuthUserRefRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthUserRefRequest) GoString() string {
	return s.String()
}

func (s *AuthUserRefRequest) SetAuthToken(v string) *AuthUserRefRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthUserRefRequest) SetProductInstanceId(v string) *AuthUserRefRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthUserRefRequest) SetOperatorId(v int64) *AuthUserRefRequest {
	s.OperatorId = &v
	return s
}

func (s *AuthUserRefRequest) SetRefUserId(v int64) *AuthUserRefRequest {
	s.RefUserId = &v
	return s
}

func (s *AuthUserRefRequest) SetAccessToken(v string) *AuthUserRefRequest {
	s.AccessToken = &v
	return s
}

func (s *AuthUserRefRequest) SetSetDefault(v int64) *AuthUserRefRequest {
	s.SetDefault = &v
	return s
}

type AuthUserRefResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AuthUserRefResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthUserRefResponse) GoString() string {
	return s.String()
}

func (s *AuthUserRefResponse) SetReqMsgId(v string) *AuthUserRefResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthUserRefResponse) SetResultCode(v string) *AuthUserRefResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthUserRefResponse) SetResultMsg(v string) *AuthUserRefResponse {
	s.ResultMsg = &v
	return s
}

type CloseUserLoginRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 账号id
	UserId *int64 `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// accessToken
	AccessToken *string `json:"access_token,omitempty" xml:"access_token,omitempty" require:"true"`
}

func (s CloseUserLoginRequest) String() string {
	return tea.Prettify(s)
}

func (s CloseUserLoginRequest) GoString() string {
	return s.String()
}

func (s *CloseUserLoginRequest) SetAuthToken(v string) *CloseUserLoginRequest {
	s.AuthToken = &v
	return s
}

func (s *CloseUserLoginRequest) SetProductInstanceId(v string) *CloseUserLoginRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CloseUserLoginRequest) SetUserId(v int64) *CloseUserLoginRequest {
	s.UserId = &v
	return s
}

func (s *CloseUserLoginRequest) SetTenantId(v string) *CloseUserLoginRequest {
	s.TenantId = &v
	return s
}

func (s *CloseUserLoginRequest) SetAccessToken(v string) *CloseUserLoginRequest {
	s.AccessToken = &v
	return s
}

type CloseUserLoginResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CloseUserLoginResponse) String() string {
	return tea.Prettify(s)
}

func (s CloseUserLoginResponse) GoString() string {
	return s.String()
}

func (s *CloseUserLoginResponse) SetReqMsgId(v string) *CloseUserLoginResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CloseUserLoginResponse) SetResultCode(v string) *CloseUserLoginResponse {
	s.ResultCode = &v
	return s
}

func (s *CloseUserLoginResponse) SetResultMsg(v string) *CloseUserLoginResponse {
	s.ResultMsg = &v
	return s
}

type CreateUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 登录名称
	LoginId *string `json:"login_id,omitempty" xml:"login_id,omitempty"`
	// 非登录账号无需密码
	Password *string `json:"password,omitempty" xml:"password,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 用户类型
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty" require:"true"`
	// 用户名称
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
	// 手机号码
	Telphone *string `json:"telphone,omitempty" xml:"telphone,omitempty"`
	// 用户邮箱
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 创建者,一般是C创建B类账号。非提其他主体创建，可以不传
	CreatorUserId *int64 `json:"creator_user_id,omitempty" xml:"creator_user_id,omitempty"`
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

func (s *CreateUserRequest) SetLoginId(v string) *CreateUserRequest {
	s.LoginId = &v
	return s
}

func (s *CreateUserRequest) SetPassword(v string) *CreateUserRequest {
	s.Password = &v
	return s
}

func (s *CreateUserRequest) SetTenantId(v string) *CreateUserRequest {
	s.TenantId = &v
	return s
}

func (s *CreateUserRequest) SetUserType(v string) *CreateUserRequest {
	s.UserType = &v
	return s
}

func (s *CreateUserRequest) SetUserName(v string) *CreateUserRequest {
	s.UserName = &v
	return s
}

func (s *CreateUserRequest) SetTelphone(v string) *CreateUserRequest {
	s.Telphone = &v
	return s
}

func (s *CreateUserRequest) SetEmail(v string) *CreateUserRequest {
	s.Email = &v
	return s
}

func (s *CreateUserRequest) SetCreatorUserId(v int64) *CreateUserRequest {
	s.CreatorUserId = &v
	return s
}

type CreateUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

type GetUserCurrentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 账号id
	UserId *int64 `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 不传默认是 BASE_INFO
	// BASE_INFO 基本信息
	// ORG_CERT_FILE 企业图片
	// LP_CERT_FILE 法人图片
	QueryOptions []*string `json:"query_options,omitempty" xml:"query_options,omitempty" type:"Repeated"`
	// 企业用户userId
	FirmUserId *int64 `json:"firm_user_id,omitempty" xml:"firm_user_id,omitempty"`
}

func (s GetUserCurrentRequest) String() string {
	return tea.Prettify(s)
}

func (s GetUserCurrentRequest) GoString() string {
	return s.String()
}

func (s *GetUserCurrentRequest) SetAuthToken(v string) *GetUserCurrentRequest {
	s.AuthToken = &v
	return s
}

func (s *GetUserCurrentRequest) SetProductInstanceId(v string) *GetUserCurrentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetUserCurrentRequest) SetUserId(v int64) *GetUserCurrentRequest {
	s.UserId = &v
	return s
}

func (s *GetUserCurrentRequest) SetTenantId(v string) *GetUserCurrentRequest {
	s.TenantId = &v
	return s
}

func (s *GetUserCurrentRequest) SetQueryOptions(v []*string) *GetUserCurrentRequest {
	s.QueryOptions = v
	return s
}

func (s *GetUserCurrentRequest) SetFirmUserId(v int64) *GetUserCurrentRequest {
	s.FirmUserId = &v
	return s
}

type GetUserCurrentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回数据
	Data *UserDetailData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetUserCurrentResponse) String() string {
	return tea.Prettify(s)
}

func (s GetUserCurrentResponse) GoString() string {
	return s.String()
}

func (s *GetUserCurrentResponse) SetReqMsgId(v string) *GetUserCurrentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetUserCurrentResponse) SetResultCode(v string) *GetUserCurrentResponse {
	s.ResultCode = &v
	return s
}

func (s *GetUserCurrentResponse) SetResultMsg(v string) *GetUserCurrentResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetUserCurrentResponse) SetData(v *UserDetailData) *GetUserCurrentResponse {
	s.Data = v
	return s
}

type VerifyFirmRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 账号id
	UserId *int64 `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 企业名称
	FirmName *string `json:"firm_name,omitempty" xml:"firm_name,omitempty"`
	// 企业类型
	FirmType *string `json:"firm_type,omitempty" xml:"firm_type,omitempty"`
	// 企业营业执照注册号
	CertRegNo *string `json:"cert_reg_no,omitempty" xml:"cert_reg_no,omitempty"`
	// 企业营业执照图片，osskey
	CertRegFileId *string `json:"cert_reg_file_id,omitempty" xml:"cert_reg_file_id,omitempty"`
	// 法人证件类型
	LpCertType *string `json:"lp_cert_type,omitempty" xml:"lp_cert_type,omitempty"`
	// 证件号码
	LpCertNo *string `json:"lp_cert_no,omitempty" xml:"lp_cert_no,omitempty"`
	// 企业法人证件正面图片
	LpCertFileFrontId *string `json:"lp_cert_file_front_id,omitempty" xml:"lp_cert_file_front_id,omitempty"`
	// 企业法人证件反面图片
	//
	//
	LpCertFileReverseId *string `json:"lp_cert_file_reverse_id,omitempty" xml:"lp_cert_file_reverse_id,omitempty"`
	// JPEG,JPG
	CertRegFileType *string `json:"cert_reg_file_type,omitempty" xml:"cert_reg_file_type,omitempty"`
	// JPG
	LpCertFileFrontType *string `json:"lp_cert_file_front_type,omitempty" xml:"lp_cert_file_front_type,omitempty"`
	// 身份证反面文件类型
	LpCertFileReverseType *string `json:"lp_cert_file_reverse_type,omitempty" xml:"lp_cert_file_reverse_type,omitempty"`
	// 法人姓名
	LpName *string `json:"lp_name,omitempty" xml:"lp_name,omitempty"`
	// 租户信息
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 行业类型
	IndustryType *string `json:"industry_type,omitempty" xml:"industry_type,omitempty"`
	// 公司所在地
	FirmAddress *string `json:"firm_address,omitempty" xml:"firm_address,omitempty"`
	// 提交类型
	OperationType *string `json:"operation_type,omitempty" xml:"operation_type,omitempty" require:"true"`
}

func (s VerifyFirmRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyFirmRequest) GoString() string {
	return s.String()
}

func (s *VerifyFirmRequest) SetAuthToken(v string) *VerifyFirmRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyFirmRequest) SetProductInstanceId(v string) *VerifyFirmRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyFirmRequest) SetUserId(v int64) *VerifyFirmRequest {
	s.UserId = &v
	return s
}

func (s *VerifyFirmRequest) SetFirmName(v string) *VerifyFirmRequest {
	s.FirmName = &v
	return s
}

func (s *VerifyFirmRequest) SetFirmType(v string) *VerifyFirmRequest {
	s.FirmType = &v
	return s
}

func (s *VerifyFirmRequest) SetCertRegNo(v string) *VerifyFirmRequest {
	s.CertRegNo = &v
	return s
}

func (s *VerifyFirmRequest) SetCertRegFileId(v string) *VerifyFirmRequest {
	s.CertRegFileId = &v
	return s
}

func (s *VerifyFirmRequest) SetLpCertType(v string) *VerifyFirmRequest {
	s.LpCertType = &v
	return s
}

func (s *VerifyFirmRequest) SetLpCertNo(v string) *VerifyFirmRequest {
	s.LpCertNo = &v
	return s
}

func (s *VerifyFirmRequest) SetLpCertFileFrontId(v string) *VerifyFirmRequest {
	s.LpCertFileFrontId = &v
	return s
}

func (s *VerifyFirmRequest) SetLpCertFileReverseId(v string) *VerifyFirmRequest {
	s.LpCertFileReverseId = &v
	return s
}

func (s *VerifyFirmRequest) SetCertRegFileType(v string) *VerifyFirmRequest {
	s.CertRegFileType = &v
	return s
}

func (s *VerifyFirmRequest) SetLpCertFileFrontType(v string) *VerifyFirmRequest {
	s.LpCertFileFrontType = &v
	return s
}

func (s *VerifyFirmRequest) SetLpCertFileReverseType(v string) *VerifyFirmRequest {
	s.LpCertFileReverseType = &v
	return s
}

func (s *VerifyFirmRequest) SetLpName(v string) *VerifyFirmRequest {
	s.LpName = &v
	return s
}

func (s *VerifyFirmRequest) SetTenantId(v string) *VerifyFirmRequest {
	s.TenantId = &v
	return s
}

func (s *VerifyFirmRequest) SetIndustryType(v string) *VerifyFirmRequest {
	s.IndustryType = &v
	return s
}

func (s *VerifyFirmRequest) SetFirmAddress(v string) *VerifyFirmRequest {
	s.FirmAddress = &v
	return s
}

func (s *VerifyFirmRequest) SetOperationType(v string) *VerifyFirmRequest {
	s.OperationType = &v
	return s
}

type VerifyFirmResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业分布式did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 法人认证信息
	CertifyLpDto *CertifyLPDTO `json:"certify_lp_dto,omitempty" xml:"certify_lp_dto,omitempty"`
}

func (s VerifyFirmResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyFirmResponse) GoString() string {
	return s.String()
}

func (s *VerifyFirmResponse) SetReqMsgId(v string) *VerifyFirmResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyFirmResponse) SetResultCode(v string) *VerifyFirmResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyFirmResponse) SetResultMsg(v string) *VerifyFirmResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyFirmResponse) SetDid(v string) *VerifyFirmResponse {
	s.Did = &v
	return s
}

func (s *VerifyFirmResponse) SetCertifyLpDto(v *CertifyLPDTO) *VerifyFirmResponse {
	s.CertifyLpDto = v
	return s
}

type VerifyUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 账号id
	UserId *int64 `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 个人名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 证件类型
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 证件号码
	CertNum *string `json:"cert_num,omitempty" xml:"cert_num,omitempty" require:"true"`
	// 个人证件正面图片,osskey值
	//
	CertFileFrontId *string `json:"cert_file_front_id,omitempty" xml:"cert_file_front_id,omitempty"`
	// 个人证件反面图片,oss的key值
	CertFileReverseId *string `json:"cert_file_reverse_id,omitempty" xml:"cert_file_reverse_id,omitempty"`
	// JPG
	CertFileFrontType *string `json:"cert_file_front_type,omitempty" xml:"cert_file_front_type,omitempty"`
	// 个人证件文件反面，文件类型
	CertFileReverseType *string `json:"cert_file_reverse_type,omitempty" xml:"cert_file_reverse_type,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
}

func (s VerifyUserRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyUserRequest) GoString() string {
	return s.String()
}

func (s *VerifyUserRequest) SetAuthToken(v string) *VerifyUserRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyUserRequest) SetProductInstanceId(v string) *VerifyUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyUserRequest) SetUserId(v int64) *VerifyUserRequest {
	s.UserId = &v
	return s
}

func (s *VerifyUserRequest) SetName(v string) *VerifyUserRequest {
	s.Name = &v
	return s
}

func (s *VerifyUserRequest) SetCertType(v string) *VerifyUserRequest {
	s.CertType = &v
	return s
}

func (s *VerifyUserRequest) SetCertNum(v string) *VerifyUserRequest {
	s.CertNum = &v
	return s
}

func (s *VerifyUserRequest) SetCertFileFrontId(v string) *VerifyUserRequest {
	s.CertFileFrontId = &v
	return s
}

func (s *VerifyUserRequest) SetCertFileReverseId(v string) *VerifyUserRequest {
	s.CertFileReverseId = &v
	return s
}

func (s *VerifyUserRequest) SetCertFileFrontType(v string) *VerifyUserRequest {
	s.CertFileFrontType = &v
	return s
}

func (s *VerifyUserRequest) SetCertFileReverseType(v string) *VerifyUserRequest {
	s.CertFileReverseType = &v
	return s
}

func (s *VerifyUserRequest) SetTenantId(v string) *VerifyUserRequest {
	s.TenantId = &v
	return s
}

type VerifyUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 验证成功，颁发个人did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 个人二维码认证信息
	CertifyLpDto *CertifyLPDTO `json:"certify_lp_dto,omitempty" xml:"certify_lp_dto,omitempty"`
}

func (s VerifyUserResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyUserResponse) GoString() string {
	return s.String()
}

func (s *VerifyUserResponse) SetReqMsgId(v string) *VerifyUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyUserResponse) SetResultCode(v string) *VerifyUserResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyUserResponse) SetResultMsg(v string) *VerifyUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyUserResponse) SetDid(v string) *VerifyUserResponse {
	s.Did = &v
	return s
}

func (s *VerifyUserResponse) SetCertifyLpDto(v *CertifyLPDTO) *VerifyUserResponse {
	s.CertifyLpDto = v
	return s
}

type RecognizeOcrFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 文件类型
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// 证件类型
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
}

func (s RecognizeOcrFileRequest) String() string {
	return tea.Prettify(s)
}

func (s RecognizeOcrFileRequest) GoString() string {
	return s.String()
}

func (s *RecognizeOcrFileRequest) SetAuthToken(v string) *RecognizeOcrFileRequest {
	s.AuthToken = &v
	return s
}

func (s *RecognizeOcrFileRequest) SetProductInstanceId(v string) *RecognizeOcrFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RecognizeOcrFileRequest) SetFileId(v string) *RecognizeOcrFileRequest {
	s.FileId = &v
	return s
}

func (s *RecognizeOcrFileRequest) SetFileType(v string) *RecognizeOcrFileRequest {
	s.FileType = &v
	return s
}

func (s *RecognizeOcrFileRequest) SetCertType(v string) *RecognizeOcrFileRequest {
	s.CertType = &v
	return s
}

func (s *RecognizeOcrFileRequest) SetTenantId(v string) *RecognizeOcrFileRequest {
	s.TenantId = &v
	return s
}

type RecognizeOcrFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 解析数据结果，对应不同证件
	ParseData *string `json:"parse_data,omitempty" xml:"parse_data,omitempty"`
}

func (s RecognizeOcrFileResponse) String() string {
	return tea.Prettify(s)
}

func (s RecognizeOcrFileResponse) GoString() string {
	return s.String()
}

func (s *RecognizeOcrFileResponse) SetReqMsgId(v string) *RecognizeOcrFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RecognizeOcrFileResponse) SetResultCode(v string) *RecognizeOcrFileResponse {
	s.ResultCode = &v
	return s
}

func (s *RecognizeOcrFileResponse) SetResultMsg(v string) *RecognizeOcrFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *RecognizeOcrFileResponse) SetParseData(v string) *RecognizeOcrFileResponse {
	s.ParseData = &v
	return s
}

type CertifyCertifyFirmmetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 自定义唯一id
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 租户类型
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 企业名称
	FirmName *string `json:"firm_name,omitempty" xml:"firm_name,omitempty" require:"true"`
	// 企业营业执照号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 法人姓名
	LpCertName *string `json:"lp_cert_name,omitempty" xml:"lp_cert_name,omitempty" require:"true"`
	// 法人身份证号
	LpCertNo *string `json:"lp_cert_no,omitempty" xml:"lp_cert_no,omitempty" require:"true"`
}

func (s CertifyCertifyFirmmetaRequest) String() string {
	return tea.Prettify(s)
}

func (s CertifyCertifyFirmmetaRequest) GoString() string {
	return s.String()
}

func (s *CertifyCertifyFirmmetaRequest) SetAuthToken(v string) *CertifyCertifyFirmmetaRequest {
	s.AuthToken = &v
	return s
}

func (s *CertifyCertifyFirmmetaRequest) SetProductInstanceId(v string) *CertifyCertifyFirmmetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CertifyCertifyFirmmetaRequest) SetBizId(v string) *CertifyCertifyFirmmetaRequest {
	s.BizId = &v
	return s
}

func (s *CertifyCertifyFirmmetaRequest) SetTenantId(v string) *CertifyCertifyFirmmetaRequest {
	s.TenantId = &v
	return s
}

func (s *CertifyCertifyFirmmetaRequest) SetFirmName(v string) *CertifyCertifyFirmmetaRequest {
	s.FirmName = &v
	return s
}

func (s *CertifyCertifyFirmmetaRequest) SetCertNo(v string) *CertifyCertifyFirmmetaRequest {
	s.CertNo = &v
	return s
}

func (s *CertifyCertifyFirmmetaRequest) SetLpCertName(v string) *CertifyCertifyFirmmetaRequest {
	s.LpCertName = &v
	return s
}

func (s *CertifyCertifyFirmmetaRequest) SetLpCertNo(v string) *CertifyCertifyFirmmetaRequest {
	s.LpCertNo = &v
	return s
}

type CertifyCertifyFirmmetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s CertifyCertifyFirmmetaResponse) String() string {
	return tea.Prettify(s)
}

func (s CertifyCertifyFirmmetaResponse) GoString() string {
	return s.String()
}

func (s *CertifyCertifyFirmmetaResponse) SetReqMsgId(v string) *CertifyCertifyFirmmetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CertifyCertifyFirmmetaResponse) SetResultCode(v string) *CertifyCertifyFirmmetaResponse {
	s.ResultCode = &v
	return s
}

func (s *CertifyCertifyFirmmetaResponse) SetResultMsg(v string) *CertifyCertifyFirmmetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CertifyCertifyFirmmetaResponse) SetDid(v string) *CertifyCertifyFirmmetaResponse {
	s.Did = &v
	return s
}

type CertifyCertifyPersonmetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 自定义唯一id
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 租户类型
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 身份证号
	UserCertNo *string `json:"user_cert_no,omitempty" xml:"user_cert_no,omitempty" require:"true"`
}

func (s CertifyCertifyPersonmetaRequest) String() string {
	return tea.Prettify(s)
}

func (s CertifyCertifyPersonmetaRequest) GoString() string {
	return s.String()
}

func (s *CertifyCertifyPersonmetaRequest) SetAuthToken(v string) *CertifyCertifyPersonmetaRequest {
	s.AuthToken = &v
	return s
}

func (s *CertifyCertifyPersonmetaRequest) SetProductInstanceId(v string) *CertifyCertifyPersonmetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CertifyCertifyPersonmetaRequest) SetBizId(v string) *CertifyCertifyPersonmetaRequest {
	s.BizId = &v
	return s
}

func (s *CertifyCertifyPersonmetaRequest) SetTenantId(v string) *CertifyCertifyPersonmetaRequest {
	s.TenantId = &v
	return s
}

func (s *CertifyCertifyPersonmetaRequest) SetUserName(v string) *CertifyCertifyPersonmetaRequest {
	s.UserName = &v
	return s
}

func (s *CertifyCertifyPersonmetaRequest) SetUserCertNo(v string) *CertifyCertifyPersonmetaRequest {
	s.UserCertNo = &v
	return s
}

type CertifyCertifyPersonmetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 个人did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s CertifyCertifyPersonmetaResponse) String() string {
	return tea.Prettify(s)
}

func (s CertifyCertifyPersonmetaResponse) GoString() string {
	return s.String()
}

func (s *CertifyCertifyPersonmetaResponse) SetReqMsgId(v string) *CertifyCertifyPersonmetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CertifyCertifyPersonmetaResponse) SetResultCode(v string) *CertifyCertifyPersonmetaResponse {
	s.ResultCode = &v
	return s
}

func (s *CertifyCertifyPersonmetaResponse) SetResultMsg(v string) *CertifyCertifyPersonmetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CertifyCertifyPersonmetaResponse) SetDid(v string) *CertifyCertifyPersonmetaResponse {
	s.Did = &v
	return s
}

type CertifyCertifyFaceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 自定义唯一id
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 租户类型
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 身份证号
	UserCertNo *string `json:"user_cert_no,omitempty" xml:"user_cert_no,omitempty" require:"true"`
	// 前端页面回调地址
	FrontCallbackUrl *string `json:"front_callback_url,omitempty" xml:"front_callback_url,omitempty"`
	// 后端接口回调地址
	BackCallbackUrl *string `json:"back_callback_url,omitempty" xml:"back_callback_url,omitempty"`
}

func (s CertifyCertifyFaceRequest) String() string {
	return tea.Prettify(s)
}

func (s CertifyCertifyFaceRequest) GoString() string {
	return s.String()
}

func (s *CertifyCertifyFaceRequest) SetAuthToken(v string) *CertifyCertifyFaceRequest {
	s.AuthToken = &v
	return s
}

func (s *CertifyCertifyFaceRequest) SetProductInstanceId(v string) *CertifyCertifyFaceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CertifyCertifyFaceRequest) SetBizId(v string) *CertifyCertifyFaceRequest {
	s.BizId = &v
	return s
}

func (s *CertifyCertifyFaceRequest) SetTenantId(v string) *CertifyCertifyFaceRequest {
	s.TenantId = &v
	return s
}

func (s *CertifyCertifyFaceRequest) SetUserName(v string) *CertifyCertifyFaceRequest {
	s.UserName = &v
	return s
}

func (s *CertifyCertifyFaceRequest) SetUserCertNo(v string) *CertifyCertifyFaceRequest {
	s.UserCertNo = &v
	return s
}

func (s *CertifyCertifyFaceRequest) SetFrontCallbackUrl(v string) *CertifyCertifyFaceRequest {
	s.FrontCallbackUrl = &v
	return s
}

func (s *CertifyCertifyFaceRequest) SetBackCallbackUrl(v string) *CertifyCertifyFaceRequest {
	s.BackCallbackUrl = &v
	return s
}

type CertifyCertifyFaceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 跳转url
	RedirectUrl *string `json:"redirect_url,omitempty" xml:"redirect_url,omitempty"`
	// 校验id
	VerifyId *string `json:"verify_id,omitempty" xml:"verify_id,omitempty"`
}

func (s CertifyCertifyFaceResponse) String() string {
	return tea.Prettify(s)
}

func (s CertifyCertifyFaceResponse) GoString() string {
	return s.String()
}

func (s *CertifyCertifyFaceResponse) SetReqMsgId(v string) *CertifyCertifyFaceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CertifyCertifyFaceResponse) SetResultCode(v string) *CertifyCertifyFaceResponse {
	s.ResultCode = &v
	return s
}

func (s *CertifyCertifyFaceResponse) SetResultMsg(v string) *CertifyCertifyFaceResponse {
	s.ResultMsg = &v
	return s
}

func (s *CertifyCertifyFaceResponse) SetRedirectUrl(v string) *CertifyCertifyFaceResponse {
	s.RedirectUrl = &v
	return s
}

func (s *CertifyCertifyFaceResponse) SetVerifyId(v string) *CertifyCertifyFaceResponse {
	s.VerifyId = &v
	return s
}

type QueryQueryFacecertifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 自定义唯一id
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 租户类型
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 校验id
	VerifyId *string `json:"verify_id,omitempty" xml:"verify_id,omitempty" require:"true"`
}

func (s QueryQueryFacecertifyRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryQueryFacecertifyRequest) GoString() string {
	return s.String()
}

func (s *QueryQueryFacecertifyRequest) SetAuthToken(v string) *QueryQueryFacecertifyRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryQueryFacecertifyRequest) SetProductInstanceId(v string) *QueryQueryFacecertifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryQueryFacecertifyRequest) SetBizId(v string) *QueryQueryFacecertifyRequest {
	s.BizId = &v
	return s
}

func (s *QueryQueryFacecertifyRequest) SetTenantId(v string) *QueryQueryFacecertifyRequest {
	s.TenantId = &v
	return s
}

func (s *QueryQueryFacecertifyRequest) SetVerifyId(v string) *QueryQueryFacecertifyRequest {
	s.VerifyId = &v
	return s
}

type QueryQueryFacecertifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 认证状态
	// VERIFY_SUCCESS：认证成功
	// VERIFY_PROCESSING：正在认证
	// VERIFY_FAILED：认证失败
	VerifyStatus *string `json:"verify_status,omitempty" xml:"verify_status,omitempty"`
}

func (s QueryQueryFacecertifyResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryQueryFacecertifyResponse) GoString() string {
	return s.String()
}

func (s *QueryQueryFacecertifyResponse) SetReqMsgId(v string) *QueryQueryFacecertifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryQueryFacecertifyResponse) SetResultCode(v string) *QueryQueryFacecertifyResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryQueryFacecertifyResponse) SetResultMsg(v string) *QueryQueryFacecertifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryQueryFacecertifyResponse) SetSuccess(v bool) *QueryQueryFacecertifyResponse {
	s.Success = &v
	return s
}

func (s *QueryQueryFacecertifyResponse) SetVerifyStatus(v string) *QueryQueryFacecertifyResponse {
	s.VerifyStatus = &v
	return s
}

type SwitchSwitchFirmidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 账号id
	UserId *int64 `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 企业id
	FirmId *int64 `json:"firm_id,omitempty" xml:"firm_id,omitempty" require:"true"`
	// 登录sessionId
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true"`
}

func (s SwitchSwitchFirmidRequest) String() string {
	return tea.Prettify(s)
}

func (s SwitchSwitchFirmidRequest) GoString() string {
	return s.String()
}

func (s *SwitchSwitchFirmidRequest) SetAuthToken(v string) *SwitchSwitchFirmidRequest {
	s.AuthToken = &v
	return s
}

func (s *SwitchSwitchFirmidRequest) SetProductInstanceId(v string) *SwitchSwitchFirmidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SwitchSwitchFirmidRequest) SetUserId(v int64) *SwitchSwitchFirmidRequest {
	s.UserId = &v
	return s
}

func (s *SwitchSwitchFirmidRequest) SetFirmId(v int64) *SwitchSwitchFirmidRequest {
	s.FirmId = &v
	return s
}

func (s *SwitchSwitchFirmidRequest) SetSessionId(v string) *SwitchSwitchFirmidRequest {
	s.SessionId = &v
	return s
}

type SwitchSwitchFirmidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 结果码
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 结果消息
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
}

func (s SwitchSwitchFirmidResponse) String() string {
	return tea.Prettify(s)
}

func (s SwitchSwitchFirmidResponse) GoString() string {
	return s.String()
}

func (s *SwitchSwitchFirmidResponse) SetReqMsgId(v string) *SwitchSwitchFirmidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SwitchSwitchFirmidResponse) SetResultCode(v string) *SwitchSwitchFirmidResponse {
	s.ResultCode = &v
	return s
}

func (s *SwitchSwitchFirmidResponse) SetResultMsg(v string) *SwitchSwitchFirmidResponse {
	s.ResultMsg = &v
	return s
}

func (s *SwitchSwitchFirmidResponse) SetSuccess(v bool) *SwitchSwitchFirmidResponse {
	s.Success = &v
	return s
}

func (s *SwitchSwitchFirmidResponse) SetErrorCode(v string) *SwitchSwitchFirmidResponse {
	s.ErrorCode = &v
	return s
}

func (s *SwitchSwitchFirmidResponse) SetErrorMsg(v string) *SwitchSwitchFirmidResponse {
	s.ErrorMsg = &v
	return s
}

type QueryQueryFirmfinancialRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业Id
	FirmId *int64 `json:"firm_id,omitempty" xml:"firm_id,omitempty" require:"true"`
	// 租户信息
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 查询类型（1：查询状态，2：财报信息）
	QueryOptions *string `json:"query_options,omitempty" xml:"query_options,omitempty" require:"true"`
}

func (s QueryQueryFirmfinancialRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryQueryFirmfinancialRequest) GoString() string {
	return s.String()
}

func (s *QueryQueryFirmfinancialRequest) SetAuthToken(v string) *QueryQueryFirmfinancialRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryQueryFirmfinancialRequest) SetProductInstanceId(v string) *QueryQueryFirmfinancialRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryQueryFirmfinancialRequest) SetFirmId(v int64) *QueryQueryFirmfinancialRequest {
	s.FirmId = &v
	return s
}

func (s *QueryQueryFirmfinancialRequest) SetTenantId(v string) *QueryQueryFirmfinancialRequest {
	s.TenantId = &v
	return s
}

func (s *QueryQueryFirmfinancialRequest) SetQueryOptions(v string) *QueryQueryFirmfinancialRequest {
	s.QueryOptions = &v
	return s
}

type QueryQueryFirmfinancialResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 结果码
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 结果消息
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
	// 财报状态(true已上传，false未上传)
	Status *bool `json:"status,omitempty" xml:"status,omitempty"`
	// 查询结果
	AccountResult []*FileInfo `json:"account_result,omitempty" xml:"account_result,omitempty" type:"Repeated"`
}

func (s QueryQueryFirmfinancialResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryQueryFirmfinancialResponse) GoString() string {
	return s.String()
}

func (s *QueryQueryFirmfinancialResponse) SetReqMsgId(v string) *QueryQueryFirmfinancialResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryQueryFirmfinancialResponse) SetResultCode(v string) *QueryQueryFirmfinancialResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryQueryFirmfinancialResponse) SetResultMsg(v string) *QueryQueryFirmfinancialResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryQueryFirmfinancialResponse) SetSuccess(v bool) *QueryQueryFirmfinancialResponse {
	s.Success = &v
	return s
}

func (s *QueryQueryFirmfinancialResponse) SetErrorCode(v string) *QueryQueryFirmfinancialResponse {
	s.ErrorCode = &v
	return s
}

func (s *QueryQueryFirmfinancialResponse) SetErrorMsg(v string) *QueryQueryFirmfinancialResponse {
	s.ErrorMsg = &v
	return s
}

func (s *QueryQueryFirmfinancialResponse) SetStatus(v bool) *QueryQueryFirmfinancialResponse {
	s.Status = &v
	return s
}

func (s *QueryQueryFirmfinancialResponse) SetAccountResult(v []*FileInfo) *QueryQueryFirmfinancialResponse {
	s.AccountResult = v
	return s
}

type SwitchSwitchFirmfinancialRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业id
	FirmId *int64 `json:"firm_id,omitempty" xml:"firm_id,omitempty" require:"true"`
	// 租户类型
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 操作类型（新增：add，删除：delete)
	OperationType *string `json:"operation_type,omitempty" xml:"operation_type,omitempty" require:"true"`
	// 业务id
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 财报信息
	FileInfo *FileInfo `json:"file_info,omitempty" xml:"file_info,omitempty"`
}

func (s SwitchSwitchFirmfinancialRequest) String() string {
	return tea.Prettify(s)
}

func (s SwitchSwitchFirmfinancialRequest) GoString() string {
	return s.String()
}

func (s *SwitchSwitchFirmfinancialRequest) SetAuthToken(v string) *SwitchSwitchFirmfinancialRequest {
	s.AuthToken = &v
	return s
}

func (s *SwitchSwitchFirmfinancialRequest) SetProductInstanceId(v string) *SwitchSwitchFirmfinancialRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SwitchSwitchFirmfinancialRequest) SetFirmId(v int64) *SwitchSwitchFirmfinancialRequest {
	s.FirmId = &v
	return s
}

func (s *SwitchSwitchFirmfinancialRequest) SetTenantId(v string) *SwitchSwitchFirmfinancialRequest {
	s.TenantId = &v
	return s
}

func (s *SwitchSwitchFirmfinancialRequest) SetOperationType(v string) *SwitchSwitchFirmfinancialRequest {
	s.OperationType = &v
	return s
}

func (s *SwitchSwitchFirmfinancialRequest) SetBizId(v string) *SwitchSwitchFirmfinancialRequest {
	s.BizId = &v
	return s
}

func (s *SwitchSwitchFirmfinancialRequest) SetFileInfo(v *FileInfo) *SwitchSwitchFirmfinancialRequest {
	s.FileInfo = v
	return s
}

type SwitchSwitchFirmfinancialResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 结果码
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 结果消息
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
}

func (s SwitchSwitchFirmfinancialResponse) String() string {
	return tea.Prettify(s)
}

func (s SwitchSwitchFirmfinancialResponse) GoString() string {
	return s.String()
}

func (s *SwitchSwitchFirmfinancialResponse) SetReqMsgId(v string) *SwitchSwitchFirmfinancialResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SwitchSwitchFirmfinancialResponse) SetResultCode(v string) *SwitchSwitchFirmfinancialResponse {
	s.ResultCode = &v
	return s
}

func (s *SwitchSwitchFirmfinancialResponse) SetResultMsg(v string) *SwitchSwitchFirmfinancialResponse {
	s.ResultMsg = &v
	return s
}

func (s *SwitchSwitchFirmfinancialResponse) SetSuccess(v bool) *SwitchSwitchFirmfinancialResponse {
	s.Success = &v
	return s
}

func (s *SwitchSwitchFirmfinancialResponse) SetErrorCode(v string) *SwitchSwitchFirmfinancialResponse {
	s.ErrorCode = &v
	return s
}

func (s *SwitchSwitchFirmfinancialResponse) SetErrorMsg(v string) *SwitchSwitchFirmfinancialResponse {
	s.ErrorMsg = &v
	return s
}

type CreateDidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// ⾃定义唯⼀id
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 租户类型
	//
	TenantType *string `json:"tenant_type,omitempty" xml:"tenant_type,omitempty" require:"true"`
	// 认证类型，企业：FIRM，个人：PERSON
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 企业营业执照号(当认证类型为企业时为必传)
	CertRegNum *string `json:"cert_reg_num,omitempty" xml:"cert_reg_num,omitempty"`
	// 法人姓名
	LegalName *string `json:"legal_name,omitempty" xml:"legal_name,omitempty"`
	// 法人身份证号
	LegalCertNum *string `json:"legal_cert_num,omitempty" xml:"legal_cert_num,omitempty"`
	// 企业名称(当认证类型为企业时为必传)
	FirmName *string `json:"firm_name,omitempty" xml:"firm_name,omitempty"`
	// 个人email
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 个人身份证号
	CertNum *string `json:"cert_num,omitempty" xml:"cert_num,omitempty" require:"true"`
	// 个人手机号
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty"`
	// 个人姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 个人did(当认证类型为企业时为必传)
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty"`
}

func (s CreateDidRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDidRequest) GoString() string {
	return s.String()
}

func (s *CreateDidRequest) SetAuthToken(v string) *CreateDidRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDidRequest) SetProductInstanceId(v string) *CreateDidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDidRequest) SetBizId(v string) *CreateDidRequest {
	s.BizId = &v
	return s
}

func (s *CreateDidRequest) SetTenantType(v string) *CreateDidRequest {
	s.TenantType = &v
	return s
}

func (s *CreateDidRequest) SetCertType(v string) *CreateDidRequest {
	s.CertType = &v
	return s
}

func (s *CreateDidRequest) SetCertRegNum(v string) *CreateDidRequest {
	s.CertRegNum = &v
	return s
}

func (s *CreateDidRequest) SetLegalName(v string) *CreateDidRequest {
	s.LegalName = &v
	return s
}

func (s *CreateDidRequest) SetLegalCertNum(v string) *CreateDidRequest {
	s.LegalCertNum = &v
	return s
}

func (s *CreateDidRequest) SetFirmName(v string) *CreateDidRequest {
	s.FirmName = &v
	return s
}

func (s *CreateDidRequest) SetEmail(v string) *CreateDidRequest {
	s.Email = &v
	return s
}

func (s *CreateDidRequest) SetCertNum(v string) *CreateDidRequest {
	s.CertNum = &v
	return s
}

func (s *CreateDidRequest) SetPhone(v string) *CreateDidRequest {
	s.Phone = &v
	return s
}

func (s *CreateDidRequest) SetName(v string) *CreateDidRequest {
	s.Name = &v
	return s
}

func (s *CreateDidRequest) SetUserDid(v string) *CreateDidRequest {
	s.UserDid = &v
	return s
}

type CreateDidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业did/个人did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s CreateDidResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDidResponse) GoString() string {
	return s.String()
}

func (s *CreateDidResponse) SetReqMsgId(v string) *CreateDidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDidResponse) SetResultCode(v string) *CreateDidResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDidResponse) SetResultMsg(v string) *CreateDidResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDidResponse) SetDid(v string) *CreateDidResponse {
	s.Did = &v
	return s
}

type CreateContractPlatformRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 创建个人
	Creator *Contractaccountapplication `json:"creator,omitempty" xml:"creator,omitempty" require:"true"`
	// 合同企业信息
	Platform *Contractorganizationapplication `json:"platform,omitempty" xml:"platform,omitempty" require:"true"`
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

func (s *CreateContractPlatformRequest) SetCreator(v *Contractaccountapplication) *CreateContractPlatformRequest {
	s.Creator = v
	return s
}

func (s *CreateContractPlatformRequest) SetPlatform(v *Contractorganizationapplication) *CreateContractPlatformRequest {
	s.Platform = v
	return s
}

type CreateContractPlatformResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	//
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 创建人ID
	//
	CreatorId *string `json:"creator_id,omitempty" xml:"creator_id,omitempty"`
	// 业务码信息
	//
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 平台方ID
	//
	PlatformId *string `json:"platform_id,omitempty" xml:"platform_id,omitempty"`
	// 平台用户与智能合同服务间鉴权使用的密钥
	//
	Secret *string `json:"secret,omitempty" xml:"secret,omitempty"`
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

func (s *CreateContractPlatformResponse) SetCode(v int64) *CreateContractPlatformResponse {
	s.Code = &v
	return s
}

func (s *CreateContractPlatformResponse) SetCreatorId(v string) *CreateContractPlatformResponse {
	s.CreatorId = &v
	return s
}

func (s *CreateContractPlatformResponse) SetMessage(v string) *CreateContractPlatformResponse {
	s.Message = &v
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

type AddContractDocumentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待签署文件
	Docs []*ContractDocument `json:"docs,omitempty" xml:"docs,omitempty" require:"true" type:"Repeated"`
	// 流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
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

func (s *AddContractDocumentRequest) SetDocs(v []*ContractDocument) *AddContractDocumentRequest {
	s.Docs = v
	return s
}

func (s *AddContractDocumentRequest) SetFlowId(v string) *AddContractDocumentRequest {
	s.FlowId = &v
	return s
}

type AddContractDocumentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

type AddContractFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件名称
	//
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 输入项填充内容，以key:value传入
	//
	SimpleFormFields *string `json:"simple_form_fields,omitempty" xml:"simple_form_fields,omitempty" require:"true"`
	// 模板编号
	//
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
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

func (s *AddContractFileRequest) SetSimpleFormFields(v string) *AddContractFileRequest {
	s.SimpleFormFields = &v
	return s
}

func (s *AddContractFileRequest) SetTemplateId(v string) *AddContractFileRequest {
	s.TemplateId = &v
	return s
}

type AddContractFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件下载地址，有效期一小时
	//
	DownloadUrl *string `json:"download_url,omitempty" xml:"download_url,omitempty"`
	// 文件id
	//
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 文件名称
	//
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

type ApplyContractCallbackkeyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
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
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 加签使用的key
	//
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

type AuthContractSignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授权人DID，即个人账号DID或机构账号DID
	//
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// 授权截止时间, 格式为yyyy-MM-dd HH:mm:ss，默认无限期
	//
	Deadline *string `json:"deadline,omitempty" xml:"deadline,omitempty" require:"true"`
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
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务数据, 是否授权成功
	//
	Accepted *bool `json:"accepted,omitempty" xml:"accepted,omitempty"`
	// 业务码，0表示成功
	//
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	//
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
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

func (s *AuthContractSignResponse) SetAccepted(v bool) *AuthContractSignResponse {
	s.Accepted = &v
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

type CreateContractTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 模板文件md5值，再做base64编码
	//
	ContentMd5 *string `json:"content_md5,omitempty" xml:"content_md5,omitempty" require:"true"`
	// 目标文件的MIME类型
	//
	ContentType *string `json:"content_type,omitempty" xml:"content_type,omitempty" require:"true"`
	// 是否需要转成pdf，如果模板文件为.doc/.docx 传true，为pdf传false
	//
	Convert2Pdf *bool `json:"convert2_pdf,omitempty" xml:"convert2_pdf,omitempty" require:"true"`
	// 文件名称，必须带扩展名如:.pdf,.doc,.docx
	//
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
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	//
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	//
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 模板ID
	//
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty"`
	// 文件直传地址，需要用此上传地址使用put方式上传文件，只有文件上传后模板才可用
	//
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

type CreateContractSignflowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 是否自动归档，默认false 如设置为true，则在流程开启后，当所有签署人签署完毕，系统自动将流程归档，状态变为“已完成”状态，在流程状态为“已完成”前，可随时添加签署人；如设置为false，则在调用流程开启后，需主动调用签署流程归档接口，将流程状...
	//
	AutoArchive *bool `json:"auto_archive,omitempty" xml:"auto_archive,omitempty"`
	// 是否强制代扣
	//
	AutoDeductionForce *bool `json:"auto_deduction_force,omitempty" xml:"auto_deduction_force,omitempty" require:"true"`
	// 文件主题
	//
	BusinessScene *string `json:"business_scene,omitempty" xml:"business_scene,omitempty" require:"true"`
	// 合同签名配置
	ContractSignFlowConfig *Contractsignflowconfig `json:"contract_sign_flow_config,omitempty" xml:"contract_sign_flow_config,omitempty" require:"true"`
	// 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
	//
	InitiatorAccountId *string `json:"initiator_account_id,omitempty" xml:"initiator_account_id,omitempty"`
	// 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
	//
	InitiatorAuthorizedAccountId *string `json:"initiator_authorized_account_id,omitempty" xml:"initiator_authorized_account_id,omitempty"`
	// 代扣信息
	RepaymentOrderInfo []*ContractPaymentOrderInfo `json:"repayment_order_info,omitempty" xml:"repayment_order_info,omitempty" require:"true" type:"Repeated"`
	// 签署平台，ALIPAY（支付宝小程序）或H5
	//
	SignPlatform *string `json:"sign_platform,omitempty" xml:"sign_platform,omitempty"`
	// 签署有效截止日期，毫秒，默认3天失效
	//
	SignValidity *int64 `json:"sign_validity,omitempty" xml:"sign_validity,omitempty"`
	// 付款方ID（个人）
	//
	PayerTuid *string `json:"payer_tuid,omitempty" xml:"payer_tuid,omitempty"`
	// 收款方ID(机构)
	//
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

func (s *CreateContractSignflowRequest) SetContractSignFlowConfig(v *Contractsignflowconfig) *CreateContractSignflowRequest {
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

func (s *CreateContractSignflowRequest) SetRepaymentOrderInfo(v []*ContractPaymentOrderInfo) *CreateContractSignflowRequest {
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
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	//
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 签约流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 业务码信息
	//
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

type GetContractFileuploadurlRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 所属账号did，即个人账号id或机构账号id，如不传，则默认属于对接平台
	//
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 先计算文件md5值，在对该md5值进行base64编码
	//
	ContentMd5 *string `json:"content_md5,omitempty" xml:"content_md5,omitempty" require:"true"`
	// 目标文件的MIME类型
	//
	ContentType *string `json:"content_type,omitempty" xml:"content_type,omitempty" require:"true"`
	// 是否转换成pdf文档，默认false，代表不做转换。转换是异步行为，如果指定要转换，需要调用查询文件信息接口查询状态，转换完成后才可使用。
	//
	Convert2Pdf *string `json:"convert_2_pdf,omitempty" xml:"convert_2_pdf,omitempty" require:"true"`
	// 文件名称（必须带上文件扩展名，不然会导致后续发起流程校验过不去 示例：合同.pdf ）
	//
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 文件大小，单位byte
	//
	FileSize *int64 `json:"file_size,omitempty" xml:"file_size,omitempty" require:"true"`
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

func (s *GetContractFileuploadurlRequest) SetFileName(v string) *GetContractFileuploadurlRequest {
	s.FileName = &v
	return s
}

func (s *GetContractFileuploadurlRequest) SetFileSize(v int64) *GetContractFileuploadurlRequest {
	s.FileSize = &v
	return s
}

type GetContractFileuploadurlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	//
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 文件Id
	//
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 文件直传地址, 可以重复使用，但是只能传一样的文件，有效期一小时
	//
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 上传url
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

type AddContractSignfieldRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署流程ID
	//
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	// 合同签约字段集合
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
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	//
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	//
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 合同签约返回值
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

type CreateContractHandsignfieldRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 流程id
	//
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	// 签名参数
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
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	//
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	//
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 签署区列表数据
	//
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

type StartContractFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 流程ID
	//
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
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	//
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	//
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

type GetContractSignurlRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署人账号id
	//
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// 流程id
	//
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	// 默认为空，返回的任务链接仅包含签署人本人需要签署的任务； 传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务； 传入指定机构id，则返回的任务链接包含签署人“本人+指定代签机构”的签署任务
	//
	OrganizeId *string `json:"organize_id,omitempty" xml:"organize_id,omitempty"`
	// 是否需要同时返回短链接，默认为false
	//
	ShortUrl *bool `json:"short_url,omitempty" xml:"short_url,omitempty"`
	// 客户账户id
	AgentAccountId *string `json:"agent_account_id,omitempty" xml:"agent_account_id,omitempty"`
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

func (s *GetContractSignurlRequest) SetAgentAccountId(v string) *GetContractSignurlRequest {
	s.AgentAccountId = &v
	return s
}

type GetContractSignurlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	//
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	//
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 短链地址
	//
	ShortUrl *string `json:"short_url,omitempty" xml:"short_url,omitempty"`
	// 长链地址
	//
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
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

func (s *GetContractSignurlResponse) SetShortUrl(v string) *GetContractSignurlResponse {
	s.ShortUrl = &v
	return s
}

func (s *GetContractSignurlResponse) SetUrl(v string) *GetContractSignurlResponse {
	s.Url = &v
	return s
}

type DownloadContractDocumentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 流程ID
	//
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
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文档下载地址
	Docs []*ContractDocAddress `json:"docs,omitempty" xml:"docs,omitempty" type:"Repeated"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
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

func (s *DownloadContractDocumentResponse) SetDocs(v []*ContractDocAddress) *DownloadContractDocumentResponse {
	s.Docs = v
	return s
}

func (s *DownloadContractDocumentResponse) SetCode(v int64) *DownloadContractDocumentResponse {
	s.Code = &v
	return s
}

func (s *DownloadContractDocumentResponse) SetMessage(v string) *DownloadContractDocumentResponse {
	s.Message = &v
	return s
}

type SaveContractFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 流程ID
	//
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
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	//
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	//
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

type QueryContractFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 流程id
	//
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
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否自动归档
	//
	AutoArchive *bool `json:"auto_archive,omitempty" xml:"auto_archive,omitempty"`
	// 文件主题
	//
	BusinessScene *string `json:"business_scene,omitempty" xml:"business_scene,omitempty"`
	// 业务码，0表示成功
	//
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 流程配置信息
	//
	ConfigInfo *Contractsignflowconfig `json:"config_info,omitempty" xml:"config_info,omitempty"`
	// 文件到期前，提前多少小时提醒续签
	//
	ContractRemind *int64 `json:"contract_remind,omitempty" xml:"contract_remind,omitempty"`
	// 文件有效截止日期
	//
	ContractValidity *int64 `json:"contract_validity,omitempty" xml:"contract_validity,omitempty"`
	// 流程描述, 如果流程已拒签或已撤回, 并且存在拒签或撤回原因, 流程描述显示为原因, 否则默认为流程状态描述
	//
	FlowDesc *string `json:"flow_desc,omitempty" xml:"flow_desc,omitempty"`
	// 流程结束时间
	//
	FlowEndTime *string `json:"flow_end_time,omitempty" xml:"flow_end_time,omitempty"`
	// 流程ID
	//
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 流程开始时间
	//
	FlowStartTime *string `json:"flow_start_time,omitempty" xml:"flow_start_time,omitempty"`
	// 流程状态,0-草稿 1-签署中 2-完成 3-撤销 4-终止 5-过期 6-删除 7-拒签
	//
	FlowStatus *int64 `json:"flow_status,omitempty" xml:"flow_status,omitempty"`
	// 发起人账户id
	//
	InitiatorAccountId *string `json:"initiator_account_id,omitempty" xml:"initiator_account_id,omitempty"`
	// 发起方主体id
	//
	InitiatorAuthorizedAccountId *string `json:"initiator_authorized_account_id,omitempty" xml:"initiator_authorized_account_id,omitempty"`
	// 业务码信息
	//
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

func (s *QueryContractFlowResponse) SetConfigInfo(v *Contractsignflowconfig) *QueryContractFlowResponse {
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

type GetContractFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件id
	//
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
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	//
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 下载地址
	//
	DownloadUrl *string `json:"download_url,omitempty" xml:"download_url,omitempty"`
	// 文件id
	//
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 业务码信息
	//
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 文件名称
	//
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// pdf文件总页数,仅当文件类型为pdf时有值
	//
	PdfTotalPages *int64 `json:"pdf_total_pages,omitempty" xml:"pdf_total_pages,omitempty"`
	// 文件大小，单位byte
	//
	Size *int64 `json:"size,omitempty" xml:"size,omitempty"`
	// 文件状态, 0:文件未上传；1:文件上传中 ；2：文件上传已完成,；3：文件上传失败 ；4：文件等待转pdf ；5：文件已转换pdf 。
	//
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
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

func (s *GetContractFileResponse) SetDownloadUrl(v string) *GetContractFileResponse {
	s.DownloadUrl = &v
	return s
}

func (s *GetContractFileResponse) SetFileId(v string) *GetContractFileResponse {
	s.FileId = &v
	return s
}

func (s *GetContractFileResponse) SetMessage(v string) *GetContractFileResponse {
	s.Message = &v
	return s
}

func (s *GetContractFileResponse) SetName(v string) *GetContractFileResponse {
	s.Name = &v
	return s
}

func (s *GetContractFileResponse) SetPdfTotalPages(v int64) *GetContractFileResponse {
	s.PdfTotalPages = &v
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

type QueryContractNotaryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
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
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	//
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	//
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

type CreateContractAccountsealimageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户id
	//
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// 印章别名
	//
	Alias *string `json:"alias,omitempty" xml:"alias,omitempty"`
	// 印章数据，base64格式字符串，不包含格式前缀
	//
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
	// 印章高度, 个人默认95px, 机构默认159px
	//
	Height *int64 `json:"height,omitempty" xml:"height,omitempty"`
	// 是否对图片进行透明化处理，默认false。仅对图片整体做透明化处理，无法去除图片背景
	//
	TransparentFlag *bool `json:"transparent_flag,omitempty" xml:"transparent_flag,omitempty"`
	// 印章数据类型，BASE64：base64格式
	//
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 印章宽度, 个人默认95px, 机构默认159px
	//
	Width *int64 `json:"width,omitempty" xml:"width,omitempty"`
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

func (s *CreateContractAccountsealimageRequest) SetData(v string) *CreateContractAccountsealimageRequest {
	s.Data = &v
	return s
}

func (s *CreateContractAccountsealimageRequest) SetHeight(v int64) *CreateContractAccountsealimageRequest {
	s.Height = &v
	return s
}

func (s *CreateContractAccountsealimageRequest) SetTransparentFlag(v bool) *CreateContractAccountsealimageRequest {
	s.TransparentFlag = &v
	return s
}

func (s *CreateContractAccountsealimageRequest) SetType(v string) *CreateContractAccountsealimageRequest {
	s.Type = &v
	return s
}

func (s *CreateContractAccountsealimageRequest) SetWidth(v int64) *CreateContractAccountsealimageRequest {
	s.Width = &v
	return s
}

type CreateContractAccountsealimageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 印章fileKey
	//
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty"`
	// 印章高度
	//
	Height *int64 `json:"height,omitempty" xml:"height,omitempty"`
	// 印章id
	//
	SealId *string `json:"seal_id,omitempty" xml:"seal_id,omitempty"`
	// 印章下载地址, 有效时间1小时
	//
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 印章宽度
	//
	Width *int64 `json:"width,omitempty" xml:"width,omitempty"`
	// 业务码，0表示成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
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

func (s *CreateContractAccountsealimageResponse) SetFileKey(v string) *CreateContractAccountsealimageResponse {
	s.FileKey = &v
	return s
}

func (s *CreateContractAccountsealimageResponse) SetHeight(v int64) *CreateContractAccountsealimageResponse {
	s.Height = &v
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

func (s *CreateContractAccountsealimageResponse) SetWidth(v int64) *CreateContractAccountsealimageResponse {
	s.Width = &v
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

type CreateContractOnestepflowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 是否自动归档，默认false。
	//
	AutoArchive *bool `json:"auto_archive,omitempty" xml:"auto_archive,omitempty"`
	// 是否自动开启，默认false。
	//
	AutoInitiate *bool `json:"auto_initiate,omitempty" xml:"auto_initiate,omitempty"`
	// 文件主题
	//
	BusinessScene *string `json:"business_scene,omitempty" xml:"business_scene,omitempty" require:"true"`
	// 流程备注
	//
	Comment *string `json:"comment,omitempty" xml:"comment,omitempty"`
	// 流程配置
	ContractSignFlowConfig *Contractsignflowconfig `json:"contract_sign_flow_config,omitempty" xml:"contract_sign_flow_config,omitempty" require:"true"`
	// 合同文件
	Docs []*ContractDocument `json:"docs,omitempty" xml:"docs,omitempty" require:"true" type:"Repeated"`
	// 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
	//
	InitiatorAccountId *string `json:"initiator_account_id,omitempty" xml:"initiator_account_id,omitempty"`
	// 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
	//
	InitiatorAuthorizedAccountId *string `json:"initiator_authorized_account_id,omitempty" xml:"initiator_authorized_account_id,omitempty"`
	// 签署操作人个人账号标识，即操作本次签署的个人
	//
	SignFields []*OneStepSignField `json:"sign_fields,omitempty" xml:"sign_fields,omitempty" require:"true" type:"Repeated"`
	// 签署平台，ALIPAY（支付宝小程序）或H5，默认H5
	//
	SignPlatform *string `json:"sign_platform,omitempty" xml:"sign_platform,omitempty"`
	// 签署有效截止日期，毫秒，默认3天失效
	//
	SignValidity *int64 `json:"sign_validity,omitempty" xml:"sign_validity,omitempty" require:"true"`
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

func (s *CreateContractOnestepflowRequest) SetContractSignFlowConfig(v *Contractsignflowconfig) *CreateContractOnestepflowRequest {
	s.ContractSignFlowConfig = v
	return s
}

func (s *CreateContractOnestepflowRequest) SetDocs(v []*ContractDocument) *CreateContractOnestepflowRequest {
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
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	//
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 流程ID
	//
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 业务码信息
	//
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

type QueryContractFlowsignerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 流程id
	//
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
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务码，0表示成功
	//
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 业务码信息
	//
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 签署人信息
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
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 账号id，默认所有签署人
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 流程id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
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

func (s *QueryContractSignfieldsRequest) SetAccountId(v string) *QueryContractSignfieldsRequest {
	s.AccountId = &v
	return s
}

func (s *QueryContractSignfieldsRequest) SetFlowId(v string) *QueryContractSignfieldsRequest {
	s.FlowId = &v
	return s
}

func (s *QueryContractSignfieldsRequest) SetSignfieldIds(v string) *QueryContractSignfieldsRequest {
	s.SignfieldIds = &v
	return s
}

type QueryContractSignfieldsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

type DeleteContractSignerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署人ID
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// 流程id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
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

func (s *DeleteContractSignerRequest) SetAccountId(v string) *DeleteContractSignerRequest {
	s.AccountId = &v
	return s
}

func (s *DeleteContractSignerRequest) SetFlowId(v string) *DeleteContractSignerRequest {
	s.FlowId = &v
	return s
}

type DeleteContractSignerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

type SyncEcpCloudRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// api_code
	ApiCode *string `json:"api_code,omitempty" xml:"api_code,omitempty" require:"true"`
	// param_map_json
	ParamMapJson *string `json:"param_map_json,omitempty" xml:"param_map_json,omitempty" require:"true"`
}

func (s SyncEcpCloudRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncEcpCloudRequest) GoString() string {
	return s.String()
}

func (s *SyncEcpCloudRequest) SetAuthToken(v string) *SyncEcpCloudRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncEcpCloudRequest) SetProductInstanceId(v string) *SyncEcpCloudRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncEcpCloudRequest) SetApiCode(v string) *SyncEcpCloudRequest {
	s.ApiCode = &v
	return s
}

func (s *SyncEcpCloudRequest) SetParamMapJson(v string) *SyncEcpCloudRequest {
	s.ParamMapJson = &v
	return s
}

type SyncEcpCloudResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s SyncEcpCloudResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncEcpCloudResponse) GoString() string {
	return s.String()
}

func (s *SyncEcpCloudResponse) SetReqMsgId(v string) *SyncEcpCloudResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncEcpCloudResponse) SetResultCode(v string) *SyncEcpCloudResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncEcpCloudResponse) SetResultMsg(v string) *SyncEcpCloudResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncEcpCloudResponse) SetData(v string) *SyncEcpCloudResponse {
	s.Data = &v
	return s
}

type CreateOauthUrlRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 回调地址
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty" require:"true"`
	// 登录渠道(web,h5)
	LoginChannel *string `json:"login_channel,omitempty" xml:"login_channel,omitempty" require:"true"`
	// 客户端口令
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
}

func (s CreateOauthUrlRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateOauthUrlRequest) GoString() string {
	return s.String()
}

func (s *CreateOauthUrlRequest) SetAuthToken(v string) *CreateOauthUrlRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateOauthUrlRequest) SetProductInstanceId(v string) *CreateOauthUrlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateOauthUrlRequest) SetTenantId(v string) *CreateOauthUrlRequest {
	s.TenantId = &v
	return s
}

func (s *CreateOauthUrlRequest) SetCallbackUrl(v string) *CreateOauthUrlRequest {
	s.CallbackUrl = &v
	return s
}

func (s *CreateOauthUrlRequest) SetLoginChannel(v string) *CreateOauthUrlRequest {
	s.LoginChannel = &v
	return s
}

func (s *CreateOauthUrlRequest) SetClientToken(v string) *CreateOauthUrlRequest {
	s.ClientToken = &v
	return s
}

type CreateOauthUrlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 验权url
	OauthUrl *string `json:"oauth_url,omitempty" xml:"oauth_url,omitempty"`
}

func (s CreateOauthUrlResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateOauthUrlResponse) GoString() string {
	return s.String()
}

func (s *CreateOauthUrlResponse) SetReqMsgId(v string) *CreateOauthUrlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateOauthUrlResponse) SetResultCode(v string) *CreateOauthUrlResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateOauthUrlResponse) SetResultMsg(v string) *CreateOauthUrlResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateOauthUrlResponse) SetOauthUrl(v string) *CreateOauthUrlResponse {
	s.OauthUrl = &v
	return s
}

type GetOauthTokenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授权类型
	GrantType *string `json:"grant_type,omitempty" xml:"grant_type,omitempty" require:"true"`
	// 授权码
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty" require:"true"`
	// client端申请oauth时的口令
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
	// 过期时间
	Expires *int64 `json:"expires,omitempty" xml:"expires,omitempty"`
}

func (s GetOauthTokenRequest) String() string {
	return tea.Prettify(s)
}

func (s GetOauthTokenRequest) GoString() string {
	return s.String()
}

func (s *GetOauthTokenRequest) SetAuthToken(v string) *GetOauthTokenRequest {
	s.AuthToken = &v
	return s
}

func (s *GetOauthTokenRequest) SetProductInstanceId(v string) *GetOauthTokenRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetOauthTokenRequest) SetGrantType(v string) *GetOauthTokenRequest {
	s.GrantType = &v
	return s
}

func (s *GetOauthTokenRequest) SetAuthCode(v string) *GetOauthTokenRequest {
	s.AuthCode = &v
	return s
}

func (s *GetOauthTokenRequest) SetClientToken(v string) *GetOauthTokenRequest {
	s.ClientToken = &v
	return s
}

func (s *GetOauthTokenRequest) SetExpires(v int64) *GetOauthTokenRequest {
	s.Expires = &v
	return s
}

type GetOauthTokenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回数据
	Data *TokenData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetOauthTokenResponse) String() string {
	return tea.Prettify(s)
}

func (s GetOauthTokenResponse) GoString() string {
	return s.String()
}

func (s *GetOauthTokenResponse) SetReqMsgId(v string) *GetOauthTokenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetOauthTokenResponse) SetResultCode(v string) *GetOauthTokenResponse {
	s.ResultCode = &v
	return s
}

func (s *GetOauthTokenResponse) SetResultMsg(v string) *GetOauthTokenResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetOauthTokenResponse) SetData(v *TokenData) *GetOauthTokenResponse {
	s.Data = v
	return s
}

type GetOauthTokendetailRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授权token
	AccessToken *string `json:"access_token,omitempty" xml:"access_token,omitempty" require:"true"`
}

func (s GetOauthTokendetailRequest) String() string {
	return tea.Prettify(s)
}

func (s GetOauthTokendetailRequest) GoString() string {
	return s.String()
}

func (s *GetOauthTokendetailRequest) SetAuthToken(v string) *GetOauthTokendetailRequest {
	s.AuthToken = &v
	return s
}

func (s *GetOauthTokendetailRequest) SetProductInstanceId(v string) *GetOauthTokendetailRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetOauthTokendetailRequest) SetAccessToken(v string) *GetOauthTokendetailRequest {
	s.AccessToken = &v
	return s
}

type GetOauthTokendetailResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权token
	AccessToken *string `json:"access_token,omitempty" xml:"access_token,omitempty"`
	// 授权可查看的用户的信息
	DataGrant *UserData `json:"data_grant,omitempty" xml:"data_grant,omitempty"`
}

func (s GetOauthTokendetailResponse) String() string {
	return tea.Prettify(s)
}

func (s GetOauthTokendetailResponse) GoString() string {
	return s.String()
}

func (s *GetOauthTokendetailResponse) SetReqMsgId(v string) *GetOauthTokendetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetOauthTokendetailResponse) SetResultCode(v string) *GetOauthTokendetailResponse {
	s.ResultCode = &v
	return s
}

func (s *GetOauthTokendetailResponse) SetResultMsg(v string) *GetOauthTokendetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetOauthTokendetailResponse) SetAccessToken(v string) *GetOauthTokendetailResponse {
	s.AccessToken = &v
	return s
}

func (s *GetOauthTokendetailResponse) SetDataGrant(v *UserData) *GetOauthTokendetailResponse {
	s.DataGrant = v
	return s
}

type CheckSessionAliveRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// sessionID
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true"`
}

func (s CheckSessionAliveRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckSessionAliveRequest) GoString() string {
	return s.String()
}

func (s *CheckSessionAliveRequest) SetAuthToken(v string) *CheckSessionAliveRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckSessionAliveRequest) SetProductInstanceId(v string) *CheckSessionAliveRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckSessionAliveRequest) SetTenantId(v string) *CheckSessionAliveRequest {
	s.TenantId = &v
	return s
}

func (s *CheckSessionAliveRequest) SetSessionId(v string) *CheckSessionAliveRequest {
	s.SessionId = &v
	return s
}

type CheckSessionAliveResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户id
	UserId *int64 `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 登录时间
	LoginTime *string `json:"login_time,omitempty" xml:"login_time,omitempty"`
	// 添加用户类型
	UserData *UserData `json:"user_data,omitempty" xml:"user_data,omitempty"`
	// did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s CheckSessionAliveResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckSessionAliveResponse) GoString() string {
	return s.String()
}

func (s *CheckSessionAliveResponse) SetReqMsgId(v string) *CheckSessionAliveResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckSessionAliveResponse) SetResultCode(v string) *CheckSessionAliveResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckSessionAliveResponse) SetResultMsg(v string) *CheckSessionAliveResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckSessionAliveResponse) SetUserId(v int64) *CheckSessionAliveResponse {
	s.UserId = &v
	return s
}

func (s *CheckSessionAliveResponse) SetLoginTime(v string) *CheckSessionAliveResponse {
	s.LoginTime = &v
	return s
}

func (s *CheckSessionAliveResponse) SetUserData(v *UserData) *CheckSessionAliveResponse {
	s.UserData = v
	return s
}

func (s *CheckSessionAliveResponse) SetDid(v string) *CheckSessionAliveResponse {
	s.Did = &v
	return s
}

type NotifyPartnerAsyncRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// ZHONGYI
	PartnerId *string `json:"partner_id,omitempty" xml:"partner_id,omitempty" require:"true"`
	// 产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 通知内容
	//
	NotifyContent *string `json:"notify_content,omitempty" xml:"notify_content,omitempty" require:"true"`
}

func (s NotifyPartnerAsyncRequest) String() string {
	return tea.Prettify(s)
}

func (s NotifyPartnerAsyncRequest) GoString() string {
	return s.String()
}

func (s *NotifyPartnerAsyncRequest) SetAuthToken(v string) *NotifyPartnerAsyncRequest {
	s.AuthToken = &v
	return s
}

func (s *NotifyPartnerAsyncRequest) SetProductInstanceId(v string) *NotifyPartnerAsyncRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *NotifyPartnerAsyncRequest) SetPartnerId(v string) *NotifyPartnerAsyncRequest {
	s.PartnerId = &v
	return s
}

func (s *NotifyPartnerAsyncRequest) SetProductCode(v string) *NotifyPartnerAsyncRequest {
	s.ProductCode = &v
	return s
}

func (s *NotifyPartnerAsyncRequest) SetNotifyContent(v string) *NotifyPartnerAsyncRequest {
	s.NotifyContent = &v
	return s
}

type NotifyPartnerAsyncResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s NotifyPartnerAsyncResponse) String() string {
	return tea.Prettify(s)
}

func (s NotifyPartnerAsyncResponse) GoString() string {
	return s.String()
}

func (s *NotifyPartnerAsyncResponse) SetReqMsgId(v string) *NotifyPartnerAsyncResponse {
	s.ReqMsgId = &v
	return s
}

func (s *NotifyPartnerAsyncResponse) SetResultCode(v string) *NotifyPartnerAsyncResponse {
	s.ResultCode = &v
	return s
}

func (s *NotifyPartnerAsyncResponse) SetResultMsg(v string) *NotifyPartnerAsyncResponse {
	s.ResultMsg = &v
	return s
}

type CreateProjectBaseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 唯一业务id
	ProjectId *int64 `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 项目编号
	ProjectCode *string `json:"project_code,omitempty" xml:"project_code,omitempty" require:"true"`
	// 项目名称
	ProjectName *string `json:"project_name,omitempty" xml:"project_name,omitempty" require:"true"`
	// 项目建立时间
	ProjectCreateTime *string `json:"project_create_time,omitempty" xml:"project_create_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 建设单位统一社会信用代码
	PartyABidderCode *string `json:"party_a_bidder_code,omitempty" xml:"party_a_bidder_code,omitempty" require:"true"`
	// 施工单位统一社会信用代码
	PartyBBidderCode *string `json:"party_b_bidder_code,omitempty" xml:"party_b_bidder_code,omitempty" require:"true"`
	// 项目所在行政区域代码
	RegionCode *string `json:"region_code,omitempty" xml:"region_code,omitempty" require:"true"`
	// 项目类型
	ProjectType *string `json:"project_type,omitempty" xml:"project_type,omitempty" require:"true"`
	// 拟开工时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 拟建成时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 工程造价（单位：元，精确小数点后6位）
	ProjectPrice *string `json:"project_price,omitempty" xml:"project_price,omitempty" require:"true"`
	// 资金来源
	FundSource *string `json:"fund_source,omitempty" xml:"fund_source,omitempty" require:"true"`
	// 行业分类
	IndusCategory *string `json:"indus_category,omitempty" xml:"indus_category,omitempty" require:"true"`
	// 项目地址
	ProjectAddress *string `json:"project_address,omitempty" xml:"project_address,omitempty" require:"true"`
	// 争议解决方式
	DisputeresolutionType *string `json:"disputeresolution_type,omitempty" xml:"disputeresolution_type,omitempty"`
	// 资金落实比例
	ContributionRatio *string `json:"contribution_ratio,omitempty" xml:"contribution_ratio,omitempty"`
	// 资金落实情况
	FundImpl *string `json:"fund_impl,omitempty" xml:"fund_impl,omitempty"`
	// 项目规模
	ProjectScale *string `json:"project_scale,omitempty" xml:"project_scale,omitempty"`
	// 总投资额(单位：元，小数点后六位)
	BidBond *string `json:"bid_bond,omitempty" xml:"bid_bond,omitempty"`
	// 建设单位的项目联系人
	Contactor *string `json:"contactor,omitempty" xml:"contactor,omitempty"`
	// 建设单位的项目联系人联系方式
	ContactInformation *string `json:"contact_information,omitempty" xml:"contact_information,omitempty"`
	// 是否国有投资
	IsGContruction *string `json:"is_g_contruction,omitempty" xml:"is_g_contruction,omitempty"`
	// 担保方式
	GuaranteeType *string `json:"guarantee_type,omitempty" xml:"guarantee_type,omitempty"`
	// 反担保协议编号
	ConterGuarAgreeNo *string `json:"conter_guar_agree_no,omitempty" xml:"conter_guar_agree_no,omitempty"`
	// 创建人did
	CreatedDid *string `json:"created_did,omitempty" xml:"created_did,omitempty"`
	// 数据时间戳
	DataTimestamp *string `json:"data_timestamp,omitempty" xml:"data_timestamp,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s CreateProjectBaseRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateProjectBaseRequest) GoString() string {
	return s.String()
}

func (s *CreateProjectBaseRequest) SetAuthToken(v string) *CreateProjectBaseRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateProjectBaseRequest) SetProductInstanceId(v string) *CreateProjectBaseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateProjectBaseRequest) SetProjectId(v int64) *CreateProjectBaseRequest {
	s.ProjectId = &v
	return s
}

func (s *CreateProjectBaseRequest) SetProjectCode(v string) *CreateProjectBaseRequest {
	s.ProjectCode = &v
	return s
}

func (s *CreateProjectBaseRequest) SetProjectName(v string) *CreateProjectBaseRequest {
	s.ProjectName = &v
	return s
}

func (s *CreateProjectBaseRequest) SetProjectCreateTime(v string) *CreateProjectBaseRequest {
	s.ProjectCreateTime = &v
	return s
}

func (s *CreateProjectBaseRequest) SetPartyABidderCode(v string) *CreateProjectBaseRequest {
	s.PartyABidderCode = &v
	return s
}

func (s *CreateProjectBaseRequest) SetPartyBBidderCode(v string) *CreateProjectBaseRequest {
	s.PartyBBidderCode = &v
	return s
}

func (s *CreateProjectBaseRequest) SetRegionCode(v string) *CreateProjectBaseRequest {
	s.RegionCode = &v
	return s
}

func (s *CreateProjectBaseRequest) SetProjectType(v string) *CreateProjectBaseRequest {
	s.ProjectType = &v
	return s
}

func (s *CreateProjectBaseRequest) SetStartTime(v string) *CreateProjectBaseRequest {
	s.StartTime = &v
	return s
}

func (s *CreateProjectBaseRequest) SetEndTime(v string) *CreateProjectBaseRequest {
	s.EndTime = &v
	return s
}

func (s *CreateProjectBaseRequest) SetProjectPrice(v string) *CreateProjectBaseRequest {
	s.ProjectPrice = &v
	return s
}

func (s *CreateProjectBaseRequest) SetFundSource(v string) *CreateProjectBaseRequest {
	s.FundSource = &v
	return s
}

func (s *CreateProjectBaseRequest) SetIndusCategory(v string) *CreateProjectBaseRequest {
	s.IndusCategory = &v
	return s
}

func (s *CreateProjectBaseRequest) SetProjectAddress(v string) *CreateProjectBaseRequest {
	s.ProjectAddress = &v
	return s
}

func (s *CreateProjectBaseRequest) SetDisputeresolutionType(v string) *CreateProjectBaseRequest {
	s.DisputeresolutionType = &v
	return s
}

func (s *CreateProjectBaseRequest) SetContributionRatio(v string) *CreateProjectBaseRequest {
	s.ContributionRatio = &v
	return s
}

func (s *CreateProjectBaseRequest) SetFundImpl(v string) *CreateProjectBaseRequest {
	s.FundImpl = &v
	return s
}

func (s *CreateProjectBaseRequest) SetProjectScale(v string) *CreateProjectBaseRequest {
	s.ProjectScale = &v
	return s
}

func (s *CreateProjectBaseRequest) SetBidBond(v string) *CreateProjectBaseRequest {
	s.BidBond = &v
	return s
}

func (s *CreateProjectBaseRequest) SetContactor(v string) *CreateProjectBaseRequest {
	s.Contactor = &v
	return s
}

func (s *CreateProjectBaseRequest) SetContactInformation(v string) *CreateProjectBaseRequest {
	s.ContactInformation = &v
	return s
}

func (s *CreateProjectBaseRequest) SetIsGContruction(v string) *CreateProjectBaseRequest {
	s.IsGContruction = &v
	return s
}

func (s *CreateProjectBaseRequest) SetGuaranteeType(v string) *CreateProjectBaseRequest {
	s.GuaranteeType = &v
	return s
}

func (s *CreateProjectBaseRequest) SetConterGuarAgreeNo(v string) *CreateProjectBaseRequest {
	s.ConterGuarAgreeNo = &v
	return s
}

func (s *CreateProjectBaseRequest) SetCreatedDid(v string) *CreateProjectBaseRequest {
	s.CreatedDid = &v
	return s
}

func (s *CreateProjectBaseRequest) SetDataTimestamp(v string) *CreateProjectBaseRequest {
	s.DataTimestamp = &v
	return s
}

type CreateProjectBaseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 信息上链的哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateProjectBaseResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateProjectBaseResponse) GoString() string {
	return s.String()
}

func (s *CreateProjectBaseResponse) SetReqMsgId(v string) *CreateProjectBaseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateProjectBaseResponse) SetResultCode(v string) *CreateProjectBaseResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateProjectBaseResponse) SetResultMsg(v string) *CreateProjectBaseResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateProjectBaseResponse) SetTxHash(v string) *CreateProjectBaseResponse {
	s.TxHash = &v
	return s
}

type BatchcreateWorkersBaseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目编号
	ProjectCode *string `json:"project_code,omitempty" xml:"project_code,omitempty" require:"true"`
	// 农民工基本信息
	WorkerList []*WorkersBaseInfo `json:"worker_list,omitempty" xml:"worker_list,omitempty" require:"true" type:"Repeated"`
}

func (s BatchcreateWorkersBaseRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateWorkersBaseRequest) GoString() string {
	return s.String()
}

func (s *BatchcreateWorkersBaseRequest) SetAuthToken(v string) *BatchcreateWorkersBaseRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchcreateWorkersBaseRequest) SetProductInstanceId(v string) *BatchcreateWorkersBaseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchcreateWorkersBaseRequest) SetProjectCode(v string) *BatchcreateWorkersBaseRequest {
	s.ProjectCode = &v
	return s
}

func (s *BatchcreateWorkersBaseRequest) SetWorkerList(v []*WorkersBaseInfo) *BatchcreateWorkersBaseRequest {
	s.WorkerList = v
	return s
}

type BatchcreateWorkersBaseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BatchcreateWorkersBaseResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateWorkersBaseResponse) GoString() string {
	return s.String()
}

func (s *BatchcreateWorkersBaseResponse) SetReqMsgId(v string) *BatchcreateWorkersBaseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchcreateWorkersBaseResponse) SetResultCode(v string) *BatchcreateWorkersBaseResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchcreateWorkersBaseResponse) SetResultMsg(v string) *BatchcreateWorkersBaseResponse {
	s.ResultMsg = &v
	return s
}

type BatchcreateWorkersAttendanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目编号
	ProjectCode *string `json:"project_code,omitempty" xml:"project_code,omitempty" require:"true"`
	// 身份证号
	IdCard *string `json:"id_card,omitempty" xml:"id_card,omitempty" require:"true"`
	// 农民工考勤信息
	AttendanceList []*WorkersCheckAttendance `json:"attendance_list,omitempty" xml:"attendance_list,omitempty" require:"true" type:"Repeated"`
}

func (s BatchcreateWorkersAttendanceRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateWorkersAttendanceRequest) GoString() string {
	return s.String()
}

func (s *BatchcreateWorkersAttendanceRequest) SetAuthToken(v string) *BatchcreateWorkersAttendanceRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchcreateWorkersAttendanceRequest) SetProductInstanceId(v string) *BatchcreateWorkersAttendanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchcreateWorkersAttendanceRequest) SetProjectCode(v string) *BatchcreateWorkersAttendanceRequest {
	s.ProjectCode = &v
	return s
}

func (s *BatchcreateWorkersAttendanceRequest) SetIdCard(v string) *BatchcreateWorkersAttendanceRequest {
	s.IdCard = &v
	return s
}

func (s *BatchcreateWorkersAttendanceRequest) SetAttendanceList(v []*WorkersCheckAttendance) *BatchcreateWorkersAttendanceRequest {
	s.AttendanceList = v
	return s
}

type BatchcreateWorkersAttendanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BatchcreateWorkersAttendanceResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateWorkersAttendanceResponse) GoString() string {
	return s.String()
}

func (s *BatchcreateWorkersAttendanceResponse) SetReqMsgId(v string) *BatchcreateWorkersAttendanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchcreateWorkersAttendanceResponse) SetResultCode(v string) *BatchcreateWorkersAttendanceResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchcreateWorkersAttendanceResponse) SetResultMsg(v string) *BatchcreateWorkersAttendanceResponse {
	s.ResultMsg = &v
	return s
}

type BatchcreateWorkersWageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目编号
	ProjectCode *string `json:"project_code,omitempty" xml:"project_code,omitempty" require:"true"`
	// 身份证号
	IdCard *string `json:"id_card,omitempty" xml:"id_card,omitempty" require:"true"`
	// 农民工工资发放信息
	WageList []*WorkersWagePayment `json:"wage_list,omitempty" xml:"wage_list,omitempty" require:"true" type:"Repeated"`
}

func (s BatchcreateWorkersWageRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateWorkersWageRequest) GoString() string {
	return s.String()
}

func (s *BatchcreateWorkersWageRequest) SetAuthToken(v string) *BatchcreateWorkersWageRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchcreateWorkersWageRequest) SetProductInstanceId(v string) *BatchcreateWorkersWageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchcreateWorkersWageRequest) SetProjectCode(v string) *BatchcreateWorkersWageRequest {
	s.ProjectCode = &v
	return s
}

func (s *BatchcreateWorkersWageRequest) SetIdCard(v string) *BatchcreateWorkersWageRequest {
	s.IdCard = &v
	return s
}

func (s *BatchcreateWorkersWageRequest) SetWageList(v []*WorkersWagePayment) *BatchcreateWorkersWageRequest {
	s.WageList = v
	return s
}

type BatchcreateWorkersWageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BatchcreateWorkersWageResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateWorkersWageResponse) GoString() string {
	return s.String()
}

func (s *BatchcreateWorkersWageResponse) SetReqMsgId(v string) *BatchcreateWorkersWageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchcreateWorkersWageResponse) SetResultCode(v string) *BatchcreateWorkersWageResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchcreateWorkersWageResponse) SetResultMsg(v string) *BatchcreateWorkersWageResponse {
	s.ResultMsg = &v
	return s
}

type CreateProjectFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目编号
	ProjectCode *string `json:"project_code,omitempty" xml:"project_code,omitempty" require:"true"`
	// 文件id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 文件业务id
	FileBizId *string `json:"file_biz_id,omitempty" xml:"file_biz_id,omitempty"`
	// 文件编号
	FileCode *string `json:"file_code,omitempty" xml:"file_code,omitempty"`
	// 文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// 文件类型
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// 扩展字段
	ExtraData *string `json:"extra_data,omitempty" xml:"extra_data,omitempty"`
	// 数据时间戳
	DataTimestamp *string `json:"data_timestamp,omitempty" xml:"data_timestamp,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s CreateProjectFileRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateProjectFileRequest) GoString() string {
	return s.String()
}

func (s *CreateProjectFileRequest) SetAuthToken(v string) *CreateProjectFileRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateProjectFileRequest) SetProductInstanceId(v string) *CreateProjectFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateProjectFileRequest) SetProjectCode(v string) *CreateProjectFileRequest {
	s.ProjectCode = &v
	return s
}

func (s *CreateProjectFileRequest) SetFileId(v string) *CreateProjectFileRequest {
	s.FileId = &v
	return s
}

func (s *CreateProjectFileRequest) SetFileBizId(v string) *CreateProjectFileRequest {
	s.FileBizId = &v
	return s
}

func (s *CreateProjectFileRequest) SetFileCode(v string) *CreateProjectFileRequest {
	s.FileCode = &v
	return s
}

func (s *CreateProjectFileRequest) SetFileName(v string) *CreateProjectFileRequest {
	s.FileName = &v
	return s
}

func (s *CreateProjectFileRequest) SetFileType(v string) *CreateProjectFileRequest {
	s.FileType = &v
	return s
}

func (s *CreateProjectFileRequest) SetExtraData(v string) *CreateProjectFileRequest {
	s.ExtraData = &v
	return s
}

func (s *CreateProjectFileRequest) SetDataTimestamp(v string) *CreateProjectFileRequest {
	s.DataTimestamp = &v
	return s
}

type CreateProjectFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 信息上链的哈希
	//
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateProjectFileResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateProjectFileResponse) GoString() string {
	return s.String()
}

func (s *CreateProjectFileResponse) SetReqMsgId(v string) *CreateProjectFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateProjectFileResponse) SetResultCode(v string) *CreateProjectFileResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateProjectFileResponse) SetResultMsg(v string) *CreateProjectFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateProjectFileResponse) SetTxHash(v string) *CreateProjectFileResponse {
	s.TxHash = &v
	return s
}

type CreateContractBaseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目编号
	ProjectCode *string `json:"project_code,omitempty" xml:"project_code,omitempty" require:"true"`
	// 合同信息id
	ContractInfoId *int64 `json:"contract_info_id,omitempty" xml:"contract_info_id,omitempty" require:"true"`
	// 合同编号
	ContractInfoCode *string `json:"contract_info_code,omitempty" xml:"contract_info_code,omitempty" require:"true"`
	// 合同名称
	ContractName *string `json:"contract_name,omitempty" xml:"contract_name,omitempty" require:"true"`
	// 合同版本,从1起
	ContractVersion *int64 `json:"contract_version,omitempty" xml:"contract_version,omitempty" require:"true"`
	// 变更原因（第一版不传值）
	ChangeReason *string `json:"change_reason,omitempty" xml:"change_reason,omitempty"`
	// 合同类型
	ContractType *string `json:"contract_type,omitempty" xml:"contract_type,omitempty" require:"true"`
	// 甲方统一社会信用代码
	PartyABidderCode *string `json:"party_a_bidder_code,omitempty" xml:"party_a_bidder_code,omitempty" require:"true"`
	// 甲方名称
	PartyAName *string `json:"party_a_name,omitempty" xml:"party_a_name,omitempty" require:"true"`
	// 甲方授权代表Did
	PartyAAuditDid *string `json:"party_a_audit_did,omitempty" xml:"party_a_audit_did,omitempty" require:"true"`
	// 乙方集合
	PartyBFirmDtoList []*PartyBFirmDto `json:"party_b_firm_dto_list,omitempty" xml:"party_b_firm_dto_list,omitempty" require:"true" type:"Repeated"`
	// 合同金额
	ContractMoney *string `json:"contract_money,omitempty" xml:"contract_money,omitempty" require:"true"`
	// 金额币种代码
	PriceCurrency *string `json:"price_currency,omitempty" xml:"price_currency,omitempty" require:"true"`
	// 金额单位
	PriceUnit *string `json:"price_unit,omitempty" xml:"price_unit,omitempty" require:"true"`
	// 拟开工时间
	StartDate *string `json:"start_date,omitempty" xml:"start_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 拟建成时间
	EndDate *string `json:"end_date,omitempty" xml:"end_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 合同签署时间
	ContractSignTime *string `json:"contract_sign_time,omitempty" xml:"contract_sign_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 创建人Did
	CreatedDid *string `json:"created_did,omitempty" xml:"created_did,omitempty" require:"true"`
	// 合同文件
	ContractFile *string `json:"contract_file,omitempty" xml:"contract_file,omitempty" require:"true"`
	// 文件存证
	Evidence *string `json:"evidence,omitempty" xml:"evidence,omitempty" require:"true"`
	// 存证txHash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 数据时间戳
	DataTimestamp *string `json:"data_timestamp,omitempty" xml:"data_timestamp,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 保证金对象集合
	SecurityFundDtoList []*SecurityFundDto `json:"security_fund_dto_list,omitempty" xml:"security_fund_dto_list,omitempty" type:"Repeated"`
}

func (s CreateContractBaseRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateContractBaseRequest) GoString() string {
	return s.String()
}

func (s *CreateContractBaseRequest) SetAuthToken(v string) *CreateContractBaseRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateContractBaseRequest) SetProductInstanceId(v string) *CreateContractBaseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateContractBaseRequest) SetProjectCode(v string) *CreateContractBaseRequest {
	s.ProjectCode = &v
	return s
}

func (s *CreateContractBaseRequest) SetContractInfoId(v int64) *CreateContractBaseRequest {
	s.ContractInfoId = &v
	return s
}

func (s *CreateContractBaseRequest) SetContractInfoCode(v string) *CreateContractBaseRequest {
	s.ContractInfoCode = &v
	return s
}

func (s *CreateContractBaseRequest) SetContractName(v string) *CreateContractBaseRequest {
	s.ContractName = &v
	return s
}

func (s *CreateContractBaseRequest) SetContractVersion(v int64) *CreateContractBaseRequest {
	s.ContractVersion = &v
	return s
}

func (s *CreateContractBaseRequest) SetChangeReason(v string) *CreateContractBaseRequest {
	s.ChangeReason = &v
	return s
}

func (s *CreateContractBaseRequest) SetContractType(v string) *CreateContractBaseRequest {
	s.ContractType = &v
	return s
}

func (s *CreateContractBaseRequest) SetPartyABidderCode(v string) *CreateContractBaseRequest {
	s.PartyABidderCode = &v
	return s
}

func (s *CreateContractBaseRequest) SetPartyAName(v string) *CreateContractBaseRequest {
	s.PartyAName = &v
	return s
}

func (s *CreateContractBaseRequest) SetPartyAAuditDid(v string) *CreateContractBaseRequest {
	s.PartyAAuditDid = &v
	return s
}

func (s *CreateContractBaseRequest) SetPartyBFirmDtoList(v []*PartyBFirmDto) *CreateContractBaseRequest {
	s.PartyBFirmDtoList = v
	return s
}

func (s *CreateContractBaseRequest) SetContractMoney(v string) *CreateContractBaseRequest {
	s.ContractMoney = &v
	return s
}

func (s *CreateContractBaseRequest) SetPriceCurrency(v string) *CreateContractBaseRequest {
	s.PriceCurrency = &v
	return s
}

func (s *CreateContractBaseRequest) SetPriceUnit(v string) *CreateContractBaseRequest {
	s.PriceUnit = &v
	return s
}

func (s *CreateContractBaseRequest) SetStartDate(v string) *CreateContractBaseRequest {
	s.StartDate = &v
	return s
}

func (s *CreateContractBaseRequest) SetEndDate(v string) *CreateContractBaseRequest {
	s.EndDate = &v
	return s
}

func (s *CreateContractBaseRequest) SetContractSignTime(v string) *CreateContractBaseRequest {
	s.ContractSignTime = &v
	return s
}

func (s *CreateContractBaseRequest) SetCreatedDid(v string) *CreateContractBaseRequest {
	s.CreatedDid = &v
	return s
}

func (s *CreateContractBaseRequest) SetContractFile(v string) *CreateContractBaseRequest {
	s.ContractFile = &v
	return s
}

func (s *CreateContractBaseRequest) SetEvidence(v string) *CreateContractBaseRequest {
	s.Evidence = &v
	return s
}

func (s *CreateContractBaseRequest) SetTxHash(v string) *CreateContractBaseRequest {
	s.TxHash = &v
	return s
}

func (s *CreateContractBaseRequest) SetDataTimestamp(v string) *CreateContractBaseRequest {
	s.DataTimestamp = &v
	return s
}

func (s *CreateContractBaseRequest) SetSecurityFundDtoList(v []*SecurityFundDto) *CreateContractBaseRequest {
	s.SecurityFundDtoList = v
	return s
}

type CreateContractBaseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 信息上链的哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateContractBaseResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateContractBaseResponse) GoString() string {
	return s.String()
}

func (s *CreateContractBaseResponse) SetReqMsgId(v string) *CreateContractBaseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateContractBaseResponse) SetResultCode(v string) *CreateContractBaseResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateContractBaseResponse) SetResultMsg(v string) *CreateContractBaseResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateContractBaseResponse) SetTxHash(v string) *CreateContractBaseResponse {
	s.TxHash = &v
	return s
}

type CreateContractImplRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合同编号,(确定是哪个合同的收付款，需要唯一标识id)
	ContractInfoCode *string `json:"contract_info_code,omitempty" xml:"contract_info_code,omitempty" require:"true"`
	// 收付款id
	ContractImplId *int64 `json:"contract_impl_id,omitempty" xml:"contract_impl_id,omitempty" require:"true"`
	// 付款方统一社会信用代码
	PartyABidderCode *string `json:"party_a_bidder_code,omitempty" xml:"party_a_bidder_code,omitempty" require:"true"`
	// 付款方审核人Did
	PartyAAuditDid *string `json:"party_a_audit_did,omitempty" xml:"party_a_audit_did,omitempty" require:"true"`
	// 付款方名称
	PartyAName *string `json:"party_a_name,omitempty" xml:"party_a_name,omitempty" require:"true"`
	// 收款方统一社会信用代码
	PartyBBidderCode *string `json:"party_b_bidder_code,omitempty" xml:"party_b_bidder_code,omitempty" require:"true"`
	// 收款方审核人Did
	PartyBAuditDid *string `json:"party_b_audit_did,omitempty" xml:"party_b_audit_did,omitempty"`
	// 收款方名称
	PartyBName *string `json:"party_b_name,omitempty" xml:"party_b_name,omitempty" require:"true"`
	// 拨付金额
	PayMoney *string `json:"pay_money,omitempty" xml:"pay_money,omitempty" require:"true"`
	// 金额币种代码
	PriceCurrency *string `json:"price_currency,omitempty" xml:"price_currency,omitempty" require:"true"`
	// 金额单位
	PriceUnit *string `json:"price_unit,omitempty" xml:"price_unit,omitempty" require:"true"`
	// 支付说明
	Remarks *string `json:"remarks,omitempty" xml:"remarks,omitempty" require:"true"`
	// 款项类型
	PaymentType *string `json:"payment_type,omitempty" xml:"payment_type,omitempty" require:"true"`
	// 拨付时间
	PayTime *string `json:"pay_time,omitempty" xml:"pay_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 创建人Did
	CreatedDid *string `json:"created_did,omitempty" xml:"created_did,omitempty" require:"true"`
	// 付款凭证文件(文件Id)
	File *string `json:"file,omitempty" xml:"file,omitempty" require:"true"`
	// 数据时间戳
	DataTimestamp *string `json:"data_timestamp,omitempty" xml:"data_timestamp,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s CreateContractImplRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateContractImplRequest) GoString() string {
	return s.String()
}

func (s *CreateContractImplRequest) SetAuthToken(v string) *CreateContractImplRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateContractImplRequest) SetProductInstanceId(v string) *CreateContractImplRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateContractImplRequest) SetContractInfoCode(v string) *CreateContractImplRequest {
	s.ContractInfoCode = &v
	return s
}

func (s *CreateContractImplRequest) SetContractImplId(v int64) *CreateContractImplRequest {
	s.ContractImplId = &v
	return s
}

func (s *CreateContractImplRequest) SetPartyABidderCode(v string) *CreateContractImplRequest {
	s.PartyABidderCode = &v
	return s
}

func (s *CreateContractImplRequest) SetPartyAAuditDid(v string) *CreateContractImplRequest {
	s.PartyAAuditDid = &v
	return s
}

func (s *CreateContractImplRequest) SetPartyAName(v string) *CreateContractImplRequest {
	s.PartyAName = &v
	return s
}

func (s *CreateContractImplRequest) SetPartyBBidderCode(v string) *CreateContractImplRequest {
	s.PartyBBidderCode = &v
	return s
}

func (s *CreateContractImplRequest) SetPartyBAuditDid(v string) *CreateContractImplRequest {
	s.PartyBAuditDid = &v
	return s
}

func (s *CreateContractImplRequest) SetPartyBName(v string) *CreateContractImplRequest {
	s.PartyBName = &v
	return s
}

func (s *CreateContractImplRequest) SetPayMoney(v string) *CreateContractImplRequest {
	s.PayMoney = &v
	return s
}

func (s *CreateContractImplRequest) SetPriceCurrency(v string) *CreateContractImplRequest {
	s.PriceCurrency = &v
	return s
}

func (s *CreateContractImplRequest) SetPriceUnit(v string) *CreateContractImplRequest {
	s.PriceUnit = &v
	return s
}

func (s *CreateContractImplRequest) SetRemarks(v string) *CreateContractImplRequest {
	s.Remarks = &v
	return s
}

func (s *CreateContractImplRequest) SetPaymentType(v string) *CreateContractImplRequest {
	s.PaymentType = &v
	return s
}

func (s *CreateContractImplRequest) SetPayTime(v string) *CreateContractImplRequest {
	s.PayTime = &v
	return s
}

func (s *CreateContractImplRequest) SetCreatedDid(v string) *CreateContractImplRequest {
	s.CreatedDid = &v
	return s
}

func (s *CreateContractImplRequest) SetFile(v string) *CreateContractImplRequest {
	s.File = &v
	return s
}

func (s *CreateContractImplRequest) SetDataTimestamp(v string) *CreateContractImplRequest {
	s.DataTimestamp = &v
	return s
}

type CreateContractImplResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 信息上链的哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateContractImplResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateContractImplResponse) GoString() string {
	return s.String()
}

func (s *CreateContractImplResponse) SetReqMsgId(v string) *CreateContractImplResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateContractImplResponse) SetResultCode(v string) *CreateContractImplResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateContractImplResponse) SetResultMsg(v string) *CreateContractImplResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateContractImplResponse) SetTxHash(v string) *CreateContractImplResponse {
	s.TxHash = &v
	return s
}

type CreateUserCertRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 云蚂账户id
	UserId *int64 `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 个人证件类型
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 证件号码
	CertNum *string `json:"cert_num,omitempty" xml:"cert_num,omitempty" require:"true"`
	// 个人证件正面图片文件id，应用侧fileId
	CertFileFront *int64 `json:"cert_file_front,omitempty" xml:"cert_file_front,omitempty" require:"true"`
	// 个人证件正面类型。JPG
	CertFileFrontType *string `json:"cert_file_front_type,omitempty" xml:"cert_file_front_type,omitempty" require:"true"`
	// 个人证件反面图片文件id，应用侧fileId
	CertFileReverse *int64 `json:"cert_file_reverse,omitempty" xml:"cert_file_reverse,omitempty" require:"true"`
	// 个人证件反面类型。JPG
	CertFileReverseType *string `json:"cert_file_reverse_type,omitempty" xml:"cert_file_reverse_type,omitempty" require:"true"`
}

func (s CreateUserCertRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateUserCertRequest) GoString() string {
	return s.String()
}

func (s *CreateUserCertRequest) SetAuthToken(v string) *CreateUserCertRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateUserCertRequest) SetProductInstanceId(v string) *CreateUserCertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateUserCertRequest) SetUserId(v int64) *CreateUserCertRequest {
	s.UserId = &v
	return s
}

func (s *CreateUserCertRequest) SetName(v string) *CreateUserCertRequest {
	s.Name = &v
	return s
}

func (s *CreateUserCertRequest) SetCertType(v string) *CreateUserCertRequest {
	s.CertType = &v
	return s
}

func (s *CreateUserCertRequest) SetCertNum(v string) *CreateUserCertRequest {
	s.CertNum = &v
	return s
}

func (s *CreateUserCertRequest) SetCertFileFront(v int64) *CreateUserCertRequest {
	s.CertFileFront = &v
	return s
}

func (s *CreateUserCertRequest) SetCertFileFrontType(v string) *CreateUserCertRequest {
	s.CertFileFrontType = &v
	return s
}

func (s *CreateUserCertRequest) SetCertFileReverse(v int64) *CreateUserCertRequest {
	s.CertFileReverse = &v
	return s
}

func (s *CreateUserCertRequest) SetCertFileReverseType(v string) *CreateUserCertRequest {
	s.CertFileReverseType = &v
	return s
}

type CreateUserCertResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateUserCertResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateUserCertResponse) GoString() string {
	return s.String()
}

func (s *CreateUserCertResponse) SetReqMsgId(v string) *CreateUserCertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateUserCertResponse) SetResultCode(v string) *CreateUserCertResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateUserCertResponse) SetResultMsg(v string) *CreateUserCertResponse {
	s.ResultMsg = &v
	return s
}

type UpdateUserInfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 云蚂侧用户id
	//
	UserId *int64 `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 信息同步类型
	//
	OperationType *string `json:"operation_type,omitempty" xml:"operation_type,omitempty" require:"true"`
	// 用户邮箱
	//
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 用户手机号码
	//
	Telphone *string `json:"telphone,omitempty" xml:"telphone,omitempty"`
	// 个人认证状态
	//
	UserCertStatus *string `json:"user_cert_status,omitempty" xml:"user_cert_status,omitempty"`
	// 个人认证did
	//
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty"`
}

func (s UpdateUserInfoRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateUserInfoRequest) GoString() string {
	return s.String()
}

func (s *UpdateUserInfoRequest) SetAuthToken(v string) *UpdateUserInfoRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateUserInfoRequest) SetProductInstanceId(v string) *UpdateUserInfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateUserInfoRequest) SetUserId(v int64) *UpdateUserInfoRequest {
	s.UserId = &v
	return s
}

func (s *UpdateUserInfoRequest) SetOperationType(v string) *UpdateUserInfoRequest {
	s.OperationType = &v
	return s
}

func (s *UpdateUserInfoRequest) SetEmail(v string) *UpdateUserInfoRequest {
	s.Email = &v
	return s
}

func (s *UpdateUserInfoRequest) SetTelphone(v string) *UpdateUserInfoRequest {
	s.Telphone = &v
	return s
}

func (s *UpdateUserInfoRequest) SetUserCertStatus(v string) *UpdateUserInfoRequest {
	s.UserCertStatus = &v
	return s
}

func (s *UpdateUserInfoRequest) SetUserDid(v string) *UpdateUserInfoRequest {
	s.UserDid = &v
	return s
}

type UpdateUserInfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateUserInfoResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateUserInfoResponse) GoString() string {
	return s.String()
}

func (s *UpdateUserInfoResponse) SetReqMsgId(v string) *UpdateUserInfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateUserInfoResponse) SetResultCode(v string) *UpdateUserInfoResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateUserInfoResponse) SetResultMsg(v string) *UpdateUserInfoResponse {
	s.ResultMsg = &v
	return s
}

type CreateUserRegisterRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 默认登录名称
	LoginId *string `json:"login_id,omitempty" xml:"login_id,omitempty" require:"true"`
	// 用户邮箱
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 用户手机号码
	Telphone *string `json:"telphone,omitempty" xml:"telphone,omitempty"`
	// 云蚂侧用户id
	UserId *int64 `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 来源 ： 1 APP注册，2 PC注册，3 后台添加
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
}

func (s CreateUserRegisterRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateUserRegisterRequest) GoString() string {
	return s.String()
}

func (s *CreateUserRegisterRequest) SetAuthToken(v string) *CreateUserRegisterRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateUserRegisterRequest) SetProductInstanceId(v string) *CreateUserRegisterRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateUserRegisterRequest) SetLoginId(v string) *CreateUserRegisterRequest {
	s.LoginId = &v
	return s
}

func (s *CreateUserRegisterRequest) SetEmail(v string) *CreateUserRegisterRequest {
	s.Email = &v
	return s
}

func (s *CreateUserRegisterRequest) SetTelphone(v string) *CreateUserRegisterRequest {
	s.Telphone = &v
	return s
}

func (s *CreateUserRegisterRequest) SetUserId(v int64) *CreateUserRegisterRequest {
	s.UserId = &v
	return s
}

func (s *CreateUserRegisterRequest) SetSource(v string) *CreateUserRegisterRequest {
	s.Source = &v
	return s
}

type CreateUserRegisterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateUserRegisterResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateUserRegisterResponse) GoString() string {
	return s.String()
}

func (s *CreateUserRegisterResponse) SetReqMsgId(v string) *CreateUserRegisterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateUserRegisterResponse) SetResultCode(v string) *CreateUserRegisterResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateUserRegisterResponse) SetResultMsg(v string) *CreateUserRegisterResponse {
	s.ResultMsg = &v
	return s
}

type CreateFirmCertRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 云蚂侧企业id
	FirmId *int64 `json:"firm_id,omitempty" xml:"firm_id,omitempty" require:"true"`
	// 企业名称
	FirmName *string `json:"firm_name,omitempty" xml:"firm_name,omitempty" require:"true"`
	// 企业类型
	FirmType *string `json:"firm_type,omitempty" xml:"firm_type,omitempty"`
	// 行业类型
	IndustryType *string `json:"industry_type,omitempty" xml:"industry_type,omitempty" require:"true"`
	// 企业地址省份
	FirmAddress *string `json:"firm_address,omitempty" xml:"firm_address,omitempty" require:"true"`
	// 企业营业执照注册号
	CertRegNo *string `json:"cert_reg_no,omitempty" xml:"cert_reg_no,omitempty" require:"true"`
	// 营业执照图片id，应用侧fileId
	CertRegFile *int64 `json:"cert_reg_file,omitempty" xml:"cert_reg_file,omitempty" require:"true"`
	// 营业执照图片类型(JPEG,JPG)
	CertRegFileType *string `json:"cert_reg_file_type,omitempty" xml:"cert_reg_file_type,omitempty" require:"true"`
	// 法定代表人证件类型
	LpCertType *string `json:"lp_cert_type,omitempty" xml:"lp_cert_type,omitempty" require:"true"`
	// 法人证件号码
	LpCertNo *string `json:"lp_cert_no,omitempty" xml:"lp_cert_no,omitempty" require:"true"`
	// 法人姓名
	LpName *string `json:"lp_name,omitempty" xml:"lp_name,omitempty" require:"true"`
	// 法人身份证正面图片id，应用侧FileId
	LpCertFileFront *int64 `json:"lp_cert_file_front,omitempty" xml:"lp_cert_file_front,omitempty" require:"true"`
	// 法人身份证正面图片文件类型(JPEG,JPG)
	LpCertFileFrontType *string `json:"lp_cert_file_front_type,omitempty" xml:"lp_cert_file_front_type,omitempty" require:"true"`
	// 法人身份证反面图片id，应用侧FileId
	LpCertFileReverse *int64 `json:"lp_cert_file_reverse,omitempty" xml:"lp_cert_file_reverse,omitempty" require:"true"`
	// 法人身份证反面图片id，应用侧FileId
	LpCertFileReverseType *string `json:"lp_cert_file_reverse_type,omitempty" xml:"lp_cert_file_reverse_type,omitempty" require:"true"`
}

func (s CreateFirmCertRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateFirmCertRequest) GoString() string {
	return s.String()
}

func (s *CreateFirmCertRequest) SetAuthToken(v string) *CreateFirmCertRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateFirmCertRequest) SetProductInstanceId(v string) *CreateFirmCertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateFirmCertRequest) SetFirmId(v int64) *CreateFirmCertRequest {
	s.FirmId = &v
	return s
}

func (s *CreateFirmCertRequest) SetFirmName(v string) *CreateFirmCertRequest {
	s.FirmName = &v
	return s
}

func (s *CreateFirmCertRequest) SetFirmType(v string) *CreateFirmCertRequest {
	s.FirmType = &v
	return s
}

func (s *CreateFirmCertRequest) SetIndustryType(v string) *CreateFirmCertRequest {
	s.IndustryType = &v
	return s
}

func (s *CreateFirmCertRequest) SetFirmAddress(v string) *CreateFirmCertRequest {
	s.FirmAddress = &v
	return s
}

func (s *CreateFirmCertRequest) SetCertRegNo(v string) *CreateFirmCertRequest {
	s.CertRegNo = &v
	return s
}

func (s *CreateFirmCertRequest) SetCertRegFile(v int64) *CreateFirmCertRequest {
	s.CertRegFile = &v
	return s
}

func (s *CreateFirmCertRequest) SetCertRegFileType(v string) *CreateFirmCertRequest {
	s.CertRegFileType = &v
	return s
}

func (s *CreateFirmCertRequest) SetLpCertType(v string) *CreateFirmCertRequest {
	s.LpCertType = &v
	return s
}

func (s *CreateFirmCertRequest) SetLpCertNo(v string) *CreateFirmCertRequest {
	s.LpCertNo = &v
	return s
}

func (s *CreateFirmCertRequest) SetLpName(v string) *CreateFirmCertRequest {
	s.LpName = &v
	return s
}

func (s *CreateFirmCertRequest) SetLpCertFileFront(v int64) *CreateFirmCertRequest {
	s.LpCertFileFront = &v
	return s
}

func (s *CreateFirmCertRequest) SetLpCertFileFrontType(v string) *CreateFirmCertRequest {
	s.LpCertFileFrontType = &v
	return s
}

func (s *CreateFirmCertRequest) SetLpCertFileReverse(v int64) *CreateFirmCertRequest {
	s.LpCertFileReverse = &v
	return s
}

func (s *CreateFirmCertRequest) SetLpCertFileReverseType(v string) *CreateFirmCertRequest {
	s.LpCertFileReverseType = &v
	return s
}

type CreateFirmCertResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateFirmCertResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateFirmCertResponse) GoString() string {
	return s.String()
}

func (s *CreateFirmCertResponse) SetReqMsgId(v string) *CreateFirmCertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateFirmCertResponse) SetResultCode(v string) *CreateFirmCertResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateFirmCertResponse) SetResultMsg(v string) *CreateFirmCertResponse {
	s.ResultMsg = &v
	return s
}

type UpdateFirmInfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 云蚂侧用户id
	UserId *int64 `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 信息同步类型
	OperationType *string `json:"operation_type,omitempty" xml:"operation_type,omitempty" require:"true"`
	// 云蚂侧企业id
	FirmId *int64 `json:"firm_id,omitempty" xml:"firm_id,omitempty" require:"true"`
	// 企业名称
	FirmName *string `json:"firm_name,omitempty" xml:"firm_name,omitempty"`
	// 企业认证状态
	FirmCertStatus *string `json:"firm_cert_status,omitempty" xml:"firm_cert_status,omitempty"`
	// 企业认证did
	FirmDid *string `json:"firm_did,omitempty" xml:"firm_did,omitempty"`
	// 账户角色
	ReferType *string `json:"refer_type,omitempty" xml:"refer_type,omitempty"`
	// 云蚂侧原管理员账户id
	FormerAdminId *int64 `json:"former_admin_id,omitempty" xml:"former_admin_id,omitempty"`
}

func (s UpdateFirmInfoRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateFirmInfoRequest) GoString() string {
	return s.String()
}

func (s *UpdateFirmInfoRequest) SetAuthToken(v string) *UpdateFirmInfoRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateFirmInfoRequest) SetProductInstanceId(v string) *UpdateFirmInfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateFirmInfoRequest) SetUserId(v int64) *UpdateFirmInfoRequest {
	s.UserId = &v
	return s
}

func (s *UpdateFirmInfoRequest) SetOperationType(v string) *UpdateFirmInfoRequest {
	s.OperationType = &v
	return s
}

func (s *UpdateFirmInfoRequest) SetFirmId(v int64) *UpdateFirmInfoRequest {
	s.FirmId = &v
	return s
}

func (s *UpdateFirmInfoRequest) SetFirmName(v string) *UpdateFirmInfoRequest {
	s.FirmName = &v
	return s
}

func (s *UpdateFirmInfoRequest) SetFirmCertStatus(v string) *UpdateFirmInfoRequest {
	s.FirmCertStatus = &v
	return s
}

func (s *UpdateFirmInfoRequest) SetFirmDid(v string) *UpdateFirmInfoRequest {
	s.FirmDid = &v
	return s
}

func (s *UpdateFirmInfoRequest) SetReferType(v string) *UpdateFirmInfoRequest {
	s.ReferType = &v
	return s
}

func (s *UpdateFirmInfoRequest) SetFormerAdminId(v int64) *UpdateFirmInfoRequest {
	s.FormerAdminId = &v
	return s
}

type UpdateFirmInfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateFirmInfoResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateFirmInfoResponse) GoString() string {
	return s.String()
}

func (s *UpdateFirmInfoResponse) SetReqMsgId(v string) *UpdateFirmInfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateFirmInfoResponse) SetResultCode(v string) *UpdateFirmInfoResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateFirmInfoResponse) SetResultMsg(v string) *UpdateFirmInfoResponse {
	s.ResultMsg = &v
	return s
}

type QueryChainTransactionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据链上交易hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
}

func (s QueryChainTransactionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryChainTransactionRequest) GoString() string {
	return s.String()
}

func (s *QueryChainTransactionRequest) SetAuthToken(v string) *QueryChainTransactionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryChainTransactionRequest) SetProductInstanceId(v string) *QueryChainTransactionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryChainTransactionRequest) SetTxHash(v string) *QueryChainTransactionRequest {
	s.TxHash = &v
	return s
}

type QueryChainTransactionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据链上交易hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 数据块高
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 数据上链时间
	Timestamp *string `json:"timestamp,omitempty" xml:"timestamp,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s QueryChainTransactionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryChainTransactionResponse) GoString() string {
	return s.String()
}

func (s *QueryChainTransactionResponse) SetReqMsgId(v string) *QueryChainTransactionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryChainTransactionResponse) SetResultCode(v string) *QueryChainTransactionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryChainTransactionResponse) SetResultMsg(v string) *QueryChainTransactionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryChainTransactionResponse) SetTxHash(v string) *QueryChainTransactionResponse {
	s.TxHash = &v
	return s
}

func (s *QueryChainTransactionResponse) SetBlockNumber(v int64) *QueryChainTransactionResponse {
	s.BlockNumber = &v
	return s
}

func (s *QueryChainTransactionResponse) SetTimestamp(v string) *QueryChainTransactionResponse {
	s.Timestamp = &v
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
				"sdk_version":      tea.String("1.1.51"),
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
 * Description: 账密登录(PWD_LOGIN)
 * Summary: 账密登录
 */
func (client *Client) VerifyUserPwd(request *VerifyUserPwdRequest) (_result *VerifyUserPwdResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyUserPwdResponse{}
	_body, _err := client.VerifyUserPwdEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 账密登录(PWD_LOGIN)
 * Summary: 账密登录
 */
func (client *Client) VerifyUserPwdEx(request *VerifyUserPwdRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyUserPwdResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyUserPwdResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.user.pwd.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 短信登录申请
 * Summary: 短信登录申请
 */
func (client *Client) ApplyUserSms(request *ApplyUserSmsRequest) (_result *ApplyUserSmsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyUserSmsResponse{}
	_body, _err := client.ApplyUserSmsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 短信登录申请
 * Summary: 短信登录申请
 */
func (client *Client) ApplyUserSmsEx(request *ApplyUserSmsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyUserSmsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyUserSmsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.user.sms.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 短信登录
 * Summary: 短信登录
 */
func (client *Client) VerifyUserSms(request *VerifyUserSmsRequest) (_result *VerifyUserSmsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyUserSmsResponse{}
	_body, _err := client.VerifyUserSmsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 短信登录
 * Summary: 短信登录
 */
func (client *Client) VerifyUserSmsEx(request *VerifyUserSmsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyUserSmsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyUserSmsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.user.sms.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 关联登录
 * Summary: 关联登录
 */
func (client *Client) AuthUserRef(request *AuthUserRefRequest) (_result *AuthUserRefResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthUserRefResponse{}
	_body, _err := client.AuthUserRefEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 关联登录
 * Summary: 关联登录
 */
func (client *Client) AuthUserRefEx(request *AuthUserRefRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthUserRefResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthUserRefResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.user.ref.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 退出登录
 * Summary: 退出登录
 */
func (client *Client) CloseUserLogin(request *CloseUserLoginRequest) (_result *CloseUserLoginResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CloseUserLoginResponse{}
	_body, _err := client.CloseUserLoginEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 退出登录
 * Summary: 退出登录
 */
func (client *Client) CloseUserLoginEx(request *CloseUserLoginRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CloseUserLoginResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CloseUserLoginResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.user.login.close"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户注册
 * Summary: 用户注册
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
 * Description: 用户注册
 * Summary: 用户注册
 */
func (client *Client) CreateUserEx(request *CreateUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.user.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取用户信息
 * Summary: 获取用户信息
 */
func (client *Client) GetUserCurrent(request *GetUserCurrentRequest) (_result *GetUserCurrentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetUserCurrentResponse{}
	_body, _err := client.GetUserCurrentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取用户信息
 * Summary: 获取用户信息
 */
func (client *Client) GetUserCurrentEx(request *GetUserCurrentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetUserCurrentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetUserCurrentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.user.current.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业认证
 * Summary: 企业认证
 */
func (client *Client) VerifyFirm(request *VerifyFirmRequest) (_result *VerifyFirmResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyFirmResponse{}
	_body, _err := client.VerifyFirmEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业认证
 * Summary: 企业认证
 */
func (client *Client) VerifyFirmEx(request *VerifyFirmRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyFirmResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyFirmResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.firm.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人认证
 * Summary: 个人认证
 */
func (client *Client) VerifyUser(request *VerifyUserRequest) (_result *VerifyUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyUserResponse{}
	_body, _err := client.VerifyUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人认证
 * Summary: 个人认证
 */
func (client *Client) VerifyUserEx(request *VerifyUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.user.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: ocr_文件识别接口
 * Summary: ocr_文件识别接口
 */
func (client *Client) RecognizeOcrFile(request *RecognizeOcrFileRequest) (_result *RecognizeOcrFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RecognizeOcrFileResponse{}
	_body, _err := client.RecognizeOcrFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: ocr_文件识别接口
 * Summary: ocr_文件识别接口
 */
func (client *Client) RecognizeOcrFileEx(request *RecognizeOcrFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RecognizeOcrFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RecognizeOcrFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.ocr.file.recognize"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 输入企业的四要素进行认证。
 * Summary: 企业四要素认证
 */
func (client *Client) CertifyCertifyFirmmeta(request *CertifyCertifyFirmmetaRequest) (_result *CertifyCertifyFirmmetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CertifyCertifyFirmmetaResponse{}
	_body, _err := client.CertifyCertifyFirmmetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 输入企业的四要素进行认证。
 * Summary: 企业四要素认证
 */
func (client *Client) CertifyCertifyFirmmetaEx(request *CertifyCertifyFirmmetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CertifyCertifyFirmmetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CertifyCertifyFirmmetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.certify.firmmeta.certify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 输入个人的二要素进行认证。
 * Summary: 个人二要素认证
 */
func (client *Client) CertifyCertifyPersonmeta(request *CertifyCertifyPersonmetaRequest) (_result *CertifyCertifyPersonmetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CertifyCertifyPersonmetaResponse{}
	_body, _err := client.CertifyCertifyPersonmetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 输入个人的二要素进行认证。
 * Summary: 个人二要素认证
 */
func (client *Client) CertifyCertifyPersonmetaEx(request *CertifyCertifyPersonmetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CertifyCertifyPersonmetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CertifyCertifyPersonmetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.certify.personmeta.certify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 人脸识别认证
 * Summary: 人脸识别认证
 */
func (client *Client) CertifyCertifyFace(request *CertifyCertifyFaceRequest) (_result *CertifyCertifyFaceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CertifyCertifyFaceResponse{}
	_body, _err := client.CertifyCertifyFaceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 人脸识别认证
 * Summary: 人脸识别认证
 */
func (client *Client) CertifyCertifyFaceEx(request *CertifyCertifyFaceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CertifyCertifyFaceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CertifyCertifyFaceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.certify.face.certify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询人脸识别结果
 * Summary: 人脸识别结果查询
 */
func (client *Client) QueryQueryFacecertify(request *QueryQueryFacecertifyRequest) (_result *QueryQueryFacecertifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryQueryFacecertifyResponse{}
	_body, _err := client.QueryQueryFacecertifyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询人脸识别结果
 * Summary: 人脸识别结果查询
 */
func (client *Client) QueryQueryFacecertifyEx(request *QueryQueryFacecertifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryQueryFacecertifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryQueryFacecertifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.query.facecertify.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 每次切换企业，同步当前企业id
 * Summary: 控制台切换企业同步
 */
func (client *Client) SwitchSwitchFirmid(request *SwitchSwitchFirmidRequest) (_result *SwitchSwitchFirmidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SwitchSwitchFirmidResponse{}
	_body, _err := client.SwitchSwitchFirmidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 每次切换企业，同步当前企业id
 * Summary: 控制台切换企业同步
 */
func (client *Client) SwitchSwitchFirmidEx(request *SwitchSwitchFirmidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SwitchSwitchFirmidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SwitchSwitchFirmidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.switch.firmid.switch"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业身份中心查询企业财报
 * Summary: 查询企业财报
 */
func (client *Client) QueryQueryFirmfinancial(request *QueryQueryFirmfinancialRequest) (_result *QueryQueryFirmfinancialResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryQueryFirmfinancialResponse{}
	_body, _err := client.QueryQueryFirmfinancialEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业身份中心查询企业财报
 * Summary: 查询企业财报
 */
func (client *Client) QueryQueryFirmfinancialEx(request *QueryQueryFirmfinancialRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryQueryFirmfinancialResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryQueryFirmfinancialResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.query.firmfinancial.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业身份中心新增或删除企业财报
 * Summary: 新增/删除企业财报
 */
func (client *Client) SwitchSwitchFirmfinancial(request *SwitchSwitchFirmfinancialRequest) (_result *SwitchSwitchFirmfinancialResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SwitchSwitchFirmfinancialResponse{}
	_body, _err := client.SwitchSwitchFirmfinancialEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业身份中心新增或删除企业财报
 * Summary: 新增/删除企业财报
 */
func (client *Client) SwitchSwitchFirmfinancialEx(request *SwitchSwitchFirmfinancialRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SwitchSwitchFirmfinancialResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SwitchSwitchFirmfinancialResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.switch.firmfinancial.switch"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 生成企业/个人did
 * Summary: 生成企业/个人did
 */
func (client *Client) CreateDid(request *CreateDidRequest) (_result *CreateDidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDidResponse{}
	_body, _err := client.CreateDidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 生成企业/个人did
 * Summary: 生成企业/个人did
 */
func (client *Client) CreateDidEx(request *CreateDidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.did.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.contract.platform.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.contract.document.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.contract.file.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.contract.callbackkey.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.contract.sign.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.contract.template.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.contract.signflow.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.contract.fileuploadurl.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.contract.signfield.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.contract.handsignfield.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.contract.flow.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.contract.signurl.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.contract.document.download"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.contract.flow.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.contract.flow.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.contract.file.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.contract.notary.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.contract.accountsealimage.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.contract.onestepflow.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.contract.flowsigner.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.contract.signfields.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.contract.signer.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: ecp同步金融云,内部通道
 * Summary: ecp同步金融云,内部通道
 */
func (client *Client) SyncEcpCloud(request *SyncEcpCloudRequest) (_result *SyncEcpCloudResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncEcpCloudResponse{}
	_body, _err := client.SyncEcpCloudEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: ecp同步金融云,内部通道
 * Summary: ecp同步金融云,内部通道
 */
func (client *Client) SyncEcpCloudEx(request *SyncEcpCloudRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncEcpCloudResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncEcpCloudResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.ecp.cloud.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 生成url跳转登录
 * Summary: 生成url跳转登录
 */
func (client *Client) CreateOauthUrl(request *CreateOauthUrlRequest) (_result *CreateOauthUrlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateOauthUrlResponse{}
	_body, _err := client.CreateOauthUrlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 生成url跳转登录
 * Summary: 生成url跳转登录
 */
func (client *Client) CreateOauthUrlEx(request *CreateOauthUrlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateOauthUrlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateOauthUrlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.oauth.url.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取token
 * Summary: 获取token
 */
func (client *Client) GetOauthToken(request *GetOauthTokenRequest) (_result *GetOauthTokenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetOauthTokenResponse{}
	_body, _err := client.GetOauthTokenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取token
 * Summary: 获取token
 */
func (client *Client) GetOauthTokenEx(request *GetOauthTokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetOauthTokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetOauthTokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.oauth.token.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: token明细获取
 * Summary: token明细获取
 */
func (client *Client) GetOauthTokendetail(request *GetOauthTokendetailRequest) (_result *GetOauthTokendetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetOauthTokendetailResponse{}
	_body, _err := client.GetOauthTokendetailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: token明细获取
 * Summary: token明细获取
 */
func (client *Client) GetOauthTokendetailEx(request *GetOauthTokendetailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetOauthTokendetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetOauthTokendetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.oauth.tokendetail.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: session判活
 * Summary: session判活
 */
func (client *Client) CheckSessionAlive(request *CheckSessionAliveRequest) (_result *CheckSessionAliveResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckSessionAliveResponse{}
	_body, _err := client.CheckSessionAliveEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: session判活
 * Summary: session判活
 */
func (client *Client) CheckSessionAliveEx(request *CheckSessionAliveRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckSessionAliveResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckSessionAliveResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.session.alive.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 外部合作伙伴异步通知接口
 * Summary: 外部合作伙伴异步通知接口
 */
func (client *Client) NotifyPartnerAsync(request *NotifyPartnerAsyncRequest) (_result *NotifyPartnerAsyncResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &NotifyPartnerAsyncResponse{}
	_body, _err := client.NotifyPartnerAsyncEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 外部合作伙伴异步通知接口
 * Summary: 外部合作伙伴异步通知接口
 */
func (client *Client) NotifyPartnerAsyncEx(request *NotifyPartnerAsyncRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *NotifyPartnerAsyncResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &NotifyPartnerAsyncResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.partner.async.notify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建一条项目基本信息
 * Summary: 创建一条项目基本信息
 */
func (client *Client) CreateProjectBase(request *CreateProjectBaseRequest) (_result *CreateProjectBaseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateProjectBaseResponse{}
	_body, _err := client.CreateProjectBaseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建一条项目基本信息
 * Summary: 创建一条项目基本信息
 */
func (client *Client) CreateProjectBaseEx(request *CreateProjectBaseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateProjectBaseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateProjectBaseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.project.base.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 批量新增农民工基本信息
 * Summary: 批量新增农民工基本信息
 */
func (client *Client) BatchcreateWorkersBase(request *BatchcreateWorkersBaseRequest) (_result *BatchcreateWorkersBaseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchcreateWorkersBaseResponse{}
	_body, _err := client.BatchcreateWorkersBaseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 批量新增农民工基本信息
 * Summary: 批量新增农民工基本信息
 */
func (client *Client) BatchcreateWorkersBaseEx(request *BatchcreateWorkersBaseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchcreateWorkersBaseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchcreateWorkersBaseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.workers.base.batchcreate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 批量新增农民工考勤信息
 * Summary: 批量新增农民工考勤信息
 */
func (client *Client) BatchcreateWorkersAttendance(request *BatchcreateWorkersAttendanceRequest) (_result *BatchcreateWorkersAttendanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchcreateWorkersAttendanceResponse{}
	_body, _err := client.BatchcreateWorkersAttendanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 批量新增农民工考勤信息
 * Summary: 批量新增农民工考勤信息
 */
func (client *Client) BatchcreateWorkersAttendanceEx(request *BatchcreateWorkersAttendanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchcreateWorkersAttendanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchcreateWorkersAttendanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.workers.attendance.batchcreate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 批量新增农民工工资发放信息
 * Summary: 批量新增农民工工资发放信息
 */
func (client *Client) BatchcreateWorkersWage(request *BatchcreateWorkersWageRequest) (_result *BatchcreateWorkersWageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchcreateWorkersWageResponse{}
	_body, _err := client.BatchcreateWorkersWageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 批量新增农民工工资发放信息
 * Summary: 批量新增农民工工资发放信息
 */
func (client *Client) BatchcreateWorkersWageEx(request *BatchcreateWorkersWageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchcreateWorkersWageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchcreateWorkersWageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.workers.wage.batchcreate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建一条项目文件信息
 * Summary: 创建一条项目文件信息
 */
func (client *Client) CreateProjectFile(request *CreateProjectFileRequest) (_result *CreateProjectFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateProjectFileResponse{}
	_body, _err := client.CreateProjectFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建一条项目文件信息
 * Summary: 创建一条项目文件信息
 */
func (client *Client) CreateProjectFileEx(request *CreateProjectFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateProjectFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateProjectFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.project.file.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 合同基本信息流入
 * Summary: 合同基本信息流入
 */
func (client *Client) CreateContractBase(request *CreateContractBaseRequest) (_result *CreateContractBaseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateContractBaseResponse{}
	_body, _err := client.CreateContractBaseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 合同基本信息流入
 * Summary: 合同基本信息流入
 */
func (client *Client) CreateContractBaseEx(request *CreateContractBaseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateContractBaseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateContractBaseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.contract.base.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 合同收付款信息流入
 * Summary: 合同收付款信息流入
 */
func (client *Client) CreateContractImpl(request *CreateContractImplRequest) (_result *CreateContractImplResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateContractImplResponse{}
	_body, _err := client.CreateContractImplEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 合同收付款信息流入
 * Summary: 合同收付款信息流入
 */
func (client *Client) CreateContractImplEx(request *CreateContractImplRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateContractImplResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateContractImplResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.contract.impl.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人认证信息同步
 * Summary: 个人认证信息同步
 */
func (client *Client) CreateUserCert(request *CreateUserCertRequest) (_result *CreateUserCertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateUserCertResponse{}
	_body, _err := client.CreateUserCertEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人认证信息同步
 * Summary: 个人认证信息同步
 */
func (client *Client) CreateUserCertEx(request *CreateUserCertRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateUserCertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateUserCertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.user.cert.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户信息变更同步
 * Summary: 用户信息变更同步
 */
func (client *Client) UpdateUserInfo(request *UpdateUserInfoRequest) (_result *UpdateUserInfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateUserInfoResponse{}
	_body, _err := client.UpdateUserInfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户信息变更同步
 * Summary: 用户信息变更同步
 */
func (client *Client) UpdateUserInfoEx(request *UpdateUserInfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateUserInfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateUserInfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.user.info.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户注册信息同步
 * Summary: 用户注册信息同步
 */
func (client *Client) CreateUserRegister(request *CreateUserRegisterRequest) (_result *CreateUserRegisterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateUserRegisterResponse{}
	_body, _err := client.CreateUserRegisterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户注册信息同步
 * Summary: 用户注册信息同步
 */
func (client *Client) CreateUserRegisterEx(request *CreateUserRegisterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateUserRegisterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateUserRegisterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.user.register.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业认证信息同步
 * Summary: 企业认证信息同步
 */
func (client *Client) CreateFirmCert(request *CreateFirmCertRequest) (_result *CreateFirmCertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateFirmCertResponse{}
	_body, _err := client.CreateFirmCertEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业认证信息同步
 * Summary: 企业认证信息同步
 */
func (client *Client) CreateFirmCertEx(request *CreateFirmCertRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateFirmCertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateFirmCertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.firm.cert.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业信息变更同步
 * Summary: 企业信息变更同步
 */
func (client *Client) UpdateFirmInfo(request *UpdateFirmInfoRequest) (_result *UpdateFirmInfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateFirmInfoResponse{}
	_body, _err := client.UpdateFirmInfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业信息变更同步
 * Summary: 企业信息变更同步
 */
func (client *Client) UpdateFirmInfoEx(request *UpdateFirmInfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateFirmInfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateFirmInfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.firm.info.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询链上信息
 * Summary: 查询链上信息
 */
func (client *Client) QueryChainTransaction(request *QueryChainTransactionRequest) (_result *QueryChainTransactionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryChainTransactionResponse{}
	_body, _err := client.QueryChainTransactionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询链上信息
 * Summary: 查询链上信息
 */
func (client *Client) QueryChainTransactionEx(request *QueryChainTransactionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryChainTransactionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryChainTransactionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.acc.chain.transaction.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
