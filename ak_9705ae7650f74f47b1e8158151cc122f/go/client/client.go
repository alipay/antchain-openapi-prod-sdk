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

// 联系人信息
type ContactInfo struct {
	// 联系人
	ContactName *string `json:"contact_name,omitempty" xml:"contact_name,omitempty" require:"true"`
	// 联系电话
	ContactPhone *string `json:"contact_phone,omitempty" xml:"contact_phone,omitempty" require:"true"`
}

func (s ContactInfo) String() string {
	return tea.Prettify(s)
}

func (s ContactInfo) GoString() string {
	return s.String()
}

func (s *ContactInfo) SetContactName(v string) *ContactInfo {
	s.ContactName = &v
	return s
}

func (s *ContactInfo) SetContactPhone(v string) *ContactInfo {
	s.ContactPhone = &v
	return s
}

// 证书信息
type CertificateData struct {
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 版权用户UID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// DCI码
	DciCode *string `json:"dci_code,omitempty" xml:"dci_code,omitempty" require:"true"`
	// 证书下载的链接地址
	CertificateUrl *string `json:"certificate_url,omitempty" xml:"certificate_url,omitempty" require:"true"`
}

func (s CertificateData) String() string {
	return tea.Prettify(s)
}

func (s CertificateData) GoString() string {
	return s.String()
}

func (s *CertificateData) SetTaskId(v string) *CertificateData {
	s.TaskId = &v
	return s
}

func (s *CertificateData) SetUserId(v string) *CertificateData {
	s.UserId = &v
	return s
}

func (s *CertificateData) SetDciCode(v string) *CertificateData {
	s.DciCode = &v
	return s
}

func (s *CertificateData) SetCertificateUrl(v string) *CertificateData {
	s.CertificateUrl = &v
	return s
}

// 发票信息
type InvoiceInfo struct {
	// 发票类型 InvoiceTypeEnum目前只支持普票
	// (NORMAL,ELC,普票)
	// (SPECIAL,VAT,专票)
	InvoiceType *string `json:"invoice_type,omitempty" xml:"invoice_type,omitempty" require:"true"`
	// 发票抬头（著作权人之一）
	InvoiceHeader *string `json:"invoice_header,omitempty" xml:"invoice_header,omitempty" require:"true"`
	// 纳税人识别号（机构必填）
	TaxpayerNumber *string `json:"taxpayer_number,omitempty" xml:"taxpayer_number,omitempty"`
	// 注册地址（专票必填）
	RegisteredAddress *string `json:"registered_address,omitempty" xml:"registered_address,omitempty"`
	// 注册电话（专票必填）
	RegisteredTel *string `json:"registered_tel,omitempty" xml:"registered_tel,omitempty"`
	// 开户电话（专票必填）
	OpenAccountTel *string `json:"open_account_tel,omitempty" xml:"open_account_tel,omitempty"`
	// 开户银行（专票必填）
	OpenAccountBank *string `json:"open_account_bank,omitempty" xml:"open_account_bank,omitempty"`
	// 银行账号（专票必填）
	BankAccount *string `json:"bank_account,omitempty" xml:"bank_account,omitempty"`
}

func (s InvoiceInfo) String() string {
	return tea.Prettify(s)
}

func (s InvoiceInfo) GoString() string {
	return s.String()
}

func (s *InvoiceInfo) SetInvoiceType(v string) *InvoiceInfo {
	s.InvoiceType = &v
	return s
}

func (s *InvoiceInfo) SetInvoiceHeader(v string) *InvoiceInfo {
	s.InvoiceHeader = &v
	return s
}

func (s *InvoiceInfo) SetTaxpayerNumber(v string) *InvoiceInfo {
	s.TaxpayerNumber = &v
	return s
}

func (s *InvoiceInfo) SetRegisteredAddress(v string) *InvoiceInfo {
	s.RegisteredAddress = &v
	return s
}

func (s *InvoiceInfo) SetRegisteredTel(v string) *InvoiceInfo {
	s.RegisteredTel = &v
	return s
}

func (s *InvoiceInfo) SetOpenAccountTel(v string) *InvoiceInfo {
	s.OpenAccountTel = &v
	return s
}

func (s *InvoiceInfo) SetOpenAccountBank(v string) *InvoiceInfo {
	s.OpenAccountBank = &v
	return s
}

func (s *InvoiceInfo) SetBankAccount(v string) *InvoiceInfo {
	s.BankAccount = &v
	return s
}

// 订单明细
type OrderItem struct {
	// 项目ID
	ItemId *string `json:"item_id,omitempty" xml:"item_id,omitempty" require:"true"`
	// 项目类型（数登申请）
	ItemType *string `json:"item_type,omitempty" xml:"item_type,omitempty" require:"true"`
}

func (s OrderItem) String() string {
	return tea.Prettify(s)
}

func (s OrderItem) GoString() string {
	return s.String()
}

func (s *OrderItem) SetItemId(v string) *OrderItem {
	s.ItemId = &v
	return s
}

func (s *OrderItem) SetItemType(v string) *OrderItem {
	s.ItemType = &v
	return s
}

// 数登上传文件结构体
type AdditionalFileInfo struct {
	// 内容梗概文件fileId
	ContentSummaryFileId *string `json:"content_summary_file_id,omitempty" xml:"content_summary_file_id,omitempty"`
	// 权利归属证明文件
	OwnershipFileIds []*string `json:"ownership_file_ids,omitempty" xml:"ownership_file_ids,omitempty" type:"Repeated"`
	// 肖像权授权文件fileId
	PortraitAuthFileId *string `json:"portrait_auth_file_id,omitempty" xml:"portrait_auth_file_id,omitempty"`
	// 他人作品授权文件fileId
	OthersWorkAuthFileId *string `json:"others_work_auth_file_id,omitempty" xml:"others_work_auth_file_id,omitempty"`
	// 其他文件fileId列表
	OtherFileIdList []*string `json:"other_file_id_list,omitempty" xml:"other_file_id_list,omitempty" type:"Repeated"`
	// 商用授权字体授权文件fileId
	FontAuthorizeFileId *string `json:"font_authorize_file_id,omitempty" xml:"font_authorize_file_id,omitempty"`
}

func (s AdditionalFileInfo) String() string {
	return tea.Prettify(s)
}

func (s AdditionalFileInfo) GoString() string {
	return s.String()
}

func (s *AdditionalFileInfo) SetContentSummaryFileId(v string) *AdditionalFileInfo {
	s.ContentSummaryFileId = &v
	return s
}

func (s *AdditionalFileInfo) SetOwnershipFileIds(v []*string) *AdditionalFileInfo {
	s.OwnershipFileIds = v
	return s
}

func (s *AdditionalFileInfo) SetPortraitAuthFileId(v string) *AdditionalFileInfo {
	s.PortraitAuthFileId = &v
	return s
}

func (s *AdditionalFileInfo) SetOthersWorkAuthFileId(v string) *AdditionalFileInfo {
	s.OthersWorkAuthFileId = &v
	return s
}

func (s *AdditionalFileInfo) SetOtherFileIdList(v []*string) *AdditionalFileInfo {
	s.OtherFileIdList = v
	return s
}

func (s *AdditionalFileInfo) SetFontAuthorizeFileId(v string) *AdditionalFileInfo {
	s.FontAuthorizeFileId = &v
	return s
}

// 数登申请声明：包括创作目的、创作过程、独创性和字体申明
type DciExplanationInfo struct {
	// 创作目的，描述作品创作的目的
	CreationPurpose *string `json:"creation_purpose,omitempty" xml:"creation_purpose,omitempty" require:"true"`
	// 创作过程，具体的创作过程
	CreationProcess *string `json:"creation_process,omitempty" xml:"creation_process,omitempty" require:"true"`
	// 阐述作品的独创性
	Originality *string `json:"originality,omitempty" xml:"originality,omitempty" require:"true"`
	// 创作过程涉及到字体使用相关版权说明
	FontCopyright *string `json:"font_copyright,omitempty" xml:"font_copyright,omitempty"`
	// 创作过程涉及到字体使用相关版权说明
	//
	FontTypes []*string `json:"font_types,omitempty" xml:"font_types,omitempty" type:"Repeated"`
}

func (s DciExplanationInfo) String() string {
	return tea.Prettify(s)
}

func (s DciExplanationInfo) GoString() string {
	return s.String()
}

func (s *DciExplanationInfo) SetCreationPurpose(v string) *DciExplanationInfo {
	s.CreationPurpose = &v
	return s
}

func (s *DciExplanationInfo) SetCreationProcess(v string) *DciExplanationInfo {
	s.CreationProcess = &v
	return s
}

func (s *DciExplanationInfo) SetOriginality(v string) *DciExplanationInfo {
	s.Originality = &v
	return s
}

func (s *DciExplanationInfo) SetFontCopyright(v string) *DciExplanationInfo {
	s.FontCopyright = &v
	return s
}

func (s *DciExplanationInfo) SetFontTypes(v []*string) *DciExplanationInfo {
	s.FontTypes = v
	return s
}

type CreateBlockchainBccrDciRegistrationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// DC123456
	DciContentId *string `json:"dci_content_id,omitempty" xml:"dci_content_id,omitempty" require:"true"`
	// 数登申请声明
	ExplanationInfo *DciExplanationInfo `json:"explanation_info,omitempty" xml:"explanation_info,omitempty" require:"true"`
	// 补充文件相关信息
	AdditionalFileInfo *AdditionalFileInfo `json:"additional_file_info,omitempty" xml:"additional_file_info,omitempty"`
	// 发票信息--当前支持普票
	InvoiceInfo *InvoiceInfo `json:"invoice_info,omitempty" xml:"invoice_info,omitempty"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
	// 废弃待删除
	CreationStatement *string `json:"creation_statement,omitempty" xml:"creation_statement,omitempty"`
	// 废弃待删除
	AncillaryEvidencePathList []*string `json:"ancillary_evidence_path_list,omitempty" xml:"ancillary_evidence_path_list,omitempty" type:"Repeated"`
	// 申领人联系信息
	ApplyerContactInfo *ContactInfo `json:"applyer_contact_info,omitempty" xml:"applyer_contact_info,omitempty"`
	// 代理人联系信息
	PlatformContactInfo *ContactInfo `json:"platform_contact_info,omitempty" xml:"platform_contact_info,omitempty"`
	// 权利描述
	RightScopeDesc *string `json:"right_scope_desc,omitempty" xml:"right_scope_desc,omitempty"`
}

func (s CreateBlockchainBccrDciRegistrationRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBlockchainBccrDciRegistrationRequest) GoString() string {
	return s.String()
}

func (s *CreateBlockchainBccrDciRegistrationRequest) SetAuthToken(v string) *CreateBlockchainBccrDciRegistrationRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBlockchainBccrDciRegistrationRequest) SetProductInstanceId(v string) *CreateBlockchainBccrDciRegistrationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBlockchainBccrDciRegistrationRequest) SetDciContentId(v string) *CreateBlockchainBccrDciRegistrationRequest {
	s.DciContentId = &v
	return s
}

func (s *CreateBlockchainBccrDciRegistrationRequest) SetExplanationInfo(v *DciExplanationInfo) *CreateBlockchainBccrDciRegistrationRequest {
	s.ExplanationInfo = v
	return s
}

func (s *CreateBlockchainBccrDciRegistrationRequest) SetAdditionalFileInfo(v *AdditionalFileInfo) *CreateBlockchainBccrDciRegistrationRequest {
	s.AdditionalFileInfo = v
	return s
}

func (s *CreateBlockchainBccrDciRegistrationRequest) SetInvoiceInfo(v *InvoiceInfo) *CreateBlockchainBccrDciRegistrationRequest {
	s.InvoiceInfo = v
	return s
}

func (s *CreateBlockchainBccrDciRegistrationRequest) SetClientToken(v string) *CreateBlockchainBccrDciRegistrationRequest {
	s.ClientToken = &v
	return s
}

func (s *CreateBlockchainBccrDciRegistrationRequest) SetCreationStatement(v string) *CreateBlockchainBccrDciRegistrationRequest {
	s.CreationStatement = &v
	return s
}

func (s *CreateBlockchainBccrDciRegistrationRequest) SetAncillaryEvidencePathList(v []*string) *CreateBlockchainBccrDciRegistrationRequest {
	s.AncillaryEvidencePathList = v
	return s
}

func (s *CreateBlockchainBccrDciRegistrationRequest) SetApplyerContactInfo(v *ContactInfo) *CreateBlockchainBccrDciRegistrationRequest {
	s.ApplyerContactInfo = v
	return s
}

func (s *CreateBlockchainBccrDciRegistrationRequest) SetPlatformContactInfo(v *ContactInfo) *CreateBlockchainBccrDciRegistrationRequest {
	s.PlatformContactInfo = v
	return s
}

func (s *CreateBlockchainBccrDciRegistrationRequest) SetRightScopeDesc(v string) *CreateBlockchainBccrDciRegistrationRequest {
	s.RightScopeDesc = &v
	return s
}

type CreateBlockchainBccrDciRegistrationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数登申请id
	DigitalRegisterId *string `json:"digital_register_id,omitempty" xml:"digital_register_id,omitempty"`
	// 错误信息
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
}

func (s CreateBlockchainBccrDciRegistrationResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBlockchainBccrDciRegistrationResponse) GoString() string {
	return s.String()
}

func (s *CreateBlockchainBccrDciRegistrationResponse) SetReqMsgId(v string) *CreateBlockchainBccrDciRegistrationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBlockchainBccrDciRegistrationResponse) SetResultCode(v string) *CreateBlockchainBccrDciRegistrationResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBlockchainBccrDciRegistrationResponse) SetResultMsg(v string) *CreateBlockchainBccrDciRegistrationResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBlockchainBccrDciRegistrationResponse) SetDigitalRegisterId(v string) *CreateBlockchainBccrDciRegistrationResponse {
	s.DigitalRegisterId = &v
	return s
}

func (s *CreateBlockchainBccrDciRegistrationResponse) SetErrorMsg(v string) *CreateBlockchainBccrDciRegistrationResponse {
	s.ErrorMsg = &v
	return s
}

type QueryBlockchainBccrDciRegistrationsubmitRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// dci内容id
	DciContentId *string `json:"dci_content_id,omitempty" xml:"dci_content_id,omitempty" require:"true"`
}

func (s QueryBlockchainBccrDciRegistrationsubmitRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainBccrDciRegistrationsubmitRequest) GoString() string {
	return s.String()
}

func (s *QueryBlockchainBccrDciRegistrationsubmitRequest) SetAuthToken(v string) *QueryBlockchainBccrDciRegistrationsubmitRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationsubmitRequest) SetProductInstanceId(v string) *QueryBlockchainBccrDciRegistrationsubmitRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationsubmitRequest) SetDciContentId(v string) *QueryBlockchainBccrDciRegistrationsubmitRequest {
	s.DciContentId = &v
	return s
}

type QueryBlockchainBccrDciRegistrationsubmitResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数登提交状态
	ContentStatus *string `json:"content_status,omitempty" xml:"content_status,omitempty"`
}

func (s QueryBlockchainBccrDciRegistrationsubmitResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainBccrDciRegistrationsubmitResponse) GoString() string {
	return s.String()
}

func (s *QueryBlockchainBccrDciRegistrationsubmitResponse) SetReqMsgId(v string) *QueryBlockchainBccrDciRegistrationsubmitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationsubmitResponse) SetResultCode(v string) *QueryBlockchainBccrDciRegistrationsubmitResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationsubmitResponse) SetResultMsg(v string) *QueryBlockchainBccrDciRegistrationsubmitResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationsubmitResponse) SetContentStatus(v string) *QueryBlockchainBccrDciRegistrationsubmitResponse {
	s.ContentStatus = &v
	return s
}

type QueryBlockchainBccrDciRegistrationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数登申请id
	DigitalRegisterId *string `json:"digital_register_id,omitempty" xml:"digital_register_id,omitempty"`
	// dci申领id
	DciContentId *string `json:"dci_content_id,omitempty" xml:"dci_content_id,omitempty"`
}

func (s QueryBlockchainBccrDciRegistrationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainBccrDciRegistrationRequest) GoString() string {
	return s.String()
}

func (s *QueryBlockchainBccrDciRegistrationRequest) SetAuthToken(v string) *QueryBlockchainBccrDciRegistrationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationRequest) SetProductInstanceId(v string) *QueryBlockchainBccrDciRegistrationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationRequest) SetDigitalRegisterId(v string) *QueryBlockchainBccrDciRegistrationRequest {
	s.DigitalRegisterId = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationRequest) SetDciContentId(v string) *QueryBlockchainBccrDciRegistrationRequest {
	s.DciContentId = &v
	return s
}

type QueryBlockchainBccrDciRegistrationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 废弃待删除
	ContentStatus *string `json:"content_status,omitempty" xml:"content_status,omitempty"`
	// 废弃待删除
	RegisterCertTxHash *string `json:"register_cert_tx_hash,omitempty" xml:"register_cert_tx_hash,omitempty"`
	// 废弃待删除
	RegisterCertBlockHeight *string `json:"register_cert_block_height,omitempty" xml:"register_cert_block_height,omitempty"`
	// 废弃待删除
	RegisterCertTsr *string `json:"register_cert_tsr,omitempty" xml:"register_cert_tsr,omitempty"`
	// 废弃待删除
	RegisterCertPngFileId *string `json:"register_cert_png_file_id,omitempty" xml:"register_cert_png_file_id,omitempty"`
	// 废弃待删除
	RegisterSampleFileId *string `json:"register_sample_file_id,omitempty" xml:"register_sample_file_id,omitempty"`
	// 废弃待删除
	RegisterSamplePngFileId *string `json:"register_sample_png_file_id,omitempty" xml:"register_sample_png_file_id,omitempty"`
	// 废弃待删除
	RegisterDownloadTimesLeft *int64 `json:"register_download_times_left,omitempty" xml:"register_download_times_left,omitempty"`
	// 废弃待删除
	ErrorReason *string `json:"error_reason,omitempty" xml:"error_reason,omitempty"`
	// 废弃待删除
	ErrorReasonCn *string `json:"error_reason_cn,omitempty" xml:"error_reason_cn,omitempty"`
	// 废弃待删除
	InvoiceFileIdList []*string `json:"invoice_file_id_list,omitempty" xml:"invoice_file_id_list,omitempty" type:"Repeated"`
	// 废弃待删除
	ApplyRegisterTime *string `json:"apply_register_time,omitempty" xml:"apply_register_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 数登登记号
	RegNumber *string `json:"reg_number,omitempty" xml:"reg_number,omitempty"`
	// 数登id
	DigitalRegisterId *string `json:"digital_register_id,omitempty" xml:"digital_register_id,omitempty"`
	// dci申领id
	DciContentId *string `json:"dci_content_id,omitempty" xml:"dci_content_id,omitempty"`
	// 数登状态
	DigitalRegisterStatus *string `json:"digital_register_status,omitempty" xml:"digital_register_status,omitempty"`
	// 数登申请时间
	DigitalRegisterApplyTime *string `json:"digital_register_apply_time,omitempty" xml:"digital_register_apply_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 数登完成时间
	DigitalRegisterCompletionTime *string `json:"digital_register_completion_time,omitempty" xml:"digital_register_completion_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 数登证书预览图url
	DigitalRegisterCertPngUrl *string `json:"digital_register_cert_png_url,omitempty" xml:"digital_register_cert_png_url,omitempty"`
	// 样本证书预览图url
	DigitalRegisterSamplePngUrl *string `json:"digital_register_sample_png_url,omitempty" xml:"digital_register_sample_png_url,omitempty"`
	// 证书本月剩余下载次数
	DownloadTimesLeft *int64 `json:"download_times_left,omitempty" xml:"download_times_left,omitempty"`
	// 发票下载链接list
	InvoiceUrlList []*string `json:"invoice_url_list,omitempty" xml:"invoice_url_list,omitempty" type:"Repeated"`
	// 数登失败详情
	FailDetail *string `json:"fail_detail,omitempty" xml:"fail_detail,omitempty"`
	// 补正类型
	AmendType *string `json:"amend_type,omitempty" xml:"amend_type,omitempty"`
	// 用户申请表url
	ApplyFormUrl *string `json:"apply_form_url,omitempty" xml:"apply_form_url,omitempty"`
	// 数登流水号
	FlowNumber *string `json:"flow_number,omitempty" xml:"flow_number,omitempty"`
}

func (s QueryBlockchainBccrDciRegistrationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainBccrDciRegistrationResponse) GoString() string {
	return s.String()
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetReqMsgId(v string) *QueryBlockchainBccrDciRegistrationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetResultCode(v string) *QueryBlockchainBccrDciRegistrationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetResultMsg(v string) *QueryBlockchainBccrDciRegistrationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetContentStatus(v string) *QueryBlockchainBccrDciRegistrationResponse {
	s.ContentStatus = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetRegisterCertTxHash(v string) *QueryBlockchainBccrDciRegistrationResponse {
	s.RegisterCertTxHash = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetRegisterCertBlockHeight(v string) *QueryBlockchainBccrDciRegistrationResponse {
	s.RegisterCertBlockHeight = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetRegisterCertTsr(v string) *QueryBlockchainBccrDciRegistrationResponse {
	s.RegisterCertTsr = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetRegisterCertPngFileId(v string) *QueryBlockchainBccrDciRegistrationResponse {
	s.RegisterCertPngFileId = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetRegisterSampleFileId(v string) *QueryBlockchainBccrDciRegistrationResponse {
	s.RegisterSampleFileId = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetRegisterSamplePngFileId(v string) *QueryBlockchainBccrDciRegistrationResponse {
	s.RegisterSamplePngFileId = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetRegisterDownloadTimesLeft(v int64) *QueryBlockchainBccrDciRegistrationResponse {
	s.RegisterDownloadTimesLeft = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetErrorReason(v string) *QueryBlockchainBccrDciRegistrationResponse {
	s.ErrorReason = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetErrorReasonCn(v string) *QueryBlockchainBccrDciRegistrationResponse {
	s.ErrorReasonCn = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetInvoiceFileIdList(v []*string) *QueryBlockchainBccrDciRegistrationResponse {
	s.InvoiceFileIdList = v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetApplyRegisterTime(v string) *QueryBlockchainBccrDciRegistrationResponse {
	s.ApplyRegisterTime = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetRegNumber(v string) *QueryBlockchainBccrDciRegistrationResponse {
	s.RegNumber = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetDigitalRegisterId(v string) *QueryBlockchainBccrDciRegistrationResponse {
	s.DigitalRegisterId = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetDciContentId(v string) *QueryBlockchainBccrDciRegistrationResponse {
	s.DciContentId = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetDigitalRegisterStatus(v string) *QueryBlockchainBccrDciRegistrationResponse {
	s.DigitalRegisterStatus = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetDigitalRegisterApplyTime(v string) *QueryBlockchainBccrDciRegistrationResponse {
	s.DigitalRegisterApplyTime = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetDigitalRegisterCompletionTime(v string) *QueryBlockchainBccrDciRegistrationResponse {
	s.DigitalRegisterCompletionTime = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetDigitalRegisterCertPngUrl(v string) *QueryBlockchainBccrDciRegistrationResponse {
	s.DigitalRegisterCertPngUrl = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetDigitalRegisterSamplePngUrl(v string) *QueryBlockchainBccrDciRegistrationResponse {
	s.DigitalRegisterSamplePngUrl = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetDownloadTimesLeft(v int64) *QueryBlockchainBccrDciRegistrationResponse {
	s.DownloadTimesLeft = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetInvoiceUrlList(v []*string) *QueryBlockchainBccrDciRegistrationResponse {
	s.InvoiceUrlList = v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetFailDetail(v string) *QueryBlockchainBccrDciRegistrationResponse {
	s.FailDetail = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetAmendType(v string) *QueryBlockchainBccrDciRegistrationResponse {
	s.AmendType = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetApplyFormUrl(v string) *QueryBlockchainBccrDciRegistrationResponse {
	s.ApplyFormUrl = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationResponse) SetFlowNumber(v string) *QueryBlockchainBccrDciRegistrationResponse {
	s.FlowNumber = &v
	return s
}

type GetBlockchainBccrDciRegistrationcertRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数登申请id
	DigitalRegisterId *string `json:"digital_register_id,omitempty" xml:"digital_register_id,omitempty" require:"true"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
	// 废弃待删除
	DciContentId *string `json:"dci_content_id,omitempty" xml:"dci_content_id,omitempty"`
}

func (s GetBlockchainBccrDciRegistrationcertRequest) String() string {
	return tea.Prettify(s)
}

func (s GetBlockchainBccrDciRegistrationcertRequest) GoString() string {
	return s.String()
}

func (s *GetBlockchainBccrDciRegistrationcertRequest) SetAuthToken(v string) *GetBlockchainBccrDciRegistrationcertRequest {
	s.AuthToken = &v
	return s
}

func (s *GetBlockchainBccrDciRegistrationcertRequest) SetProductInstanceId(v string) *GetBlockchainBccrDciRegistrationcertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetBlockchainBccrDciRegistrationcertRequest) SetDigitalRegisterId(v string) *GetBlockchainBccrDciRegistrationcertRequest {
	s.DigitalRegisterId = &v
	return s
}

func (s *GetBlockchainBccrDciRegistrationcertRequest) SetClientToken(v string) *GetBlockchainBccrDciRegistrationcertRequest {
	s.ClientToken = &v
	return s
}

func (s *GetBlockchainBccrDciRegistrationcertRequest) SetDciContentId(v string) *GetBlockchainBccrDciRegistrationcertRequest {
	s.DciContentId = &v
	return s
}

type GetBlockchainBccrDciRegistrationcertResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 废弃待删除
	CertStatus *string `json:"cert_status,omitempty" xml:"cert_status,omitempty"`
	// 废弃待删除
	CertificateUrl *string `json:"certificate_url,omitempty" xml:"certificate_url,omitempty"`
	// 废弃待删除
	ErrorReason *string `json:"error_reason,omitempty" xml:"error_reason,omitempty"`
	// 废弃待删除
	ErrorReasonCn *string `json:"error_reason_cn,omitempty" xml:"error_reason_cn,omitempty"`
	// 数登状态
	DigitalRegisterStatus *string `json:"digital_register_status,omitempty" xml:"digital_register_status,omitempty"`
	// 数登证书&样本证书压缩包url
	DownloadUrl *string `json:"download_url,omitempty" xml:"download_url,omitempty"`
	// 剩余下载次数
	DownloadTimesLeft *int64 `json:"download_times_left,omitempty" xml:"download_times_left,omitempty"`
	// 失败详情
	FailDetail *string `json:"fail_detail,omitempty" xml:"fail_detail,omitempty"`
	// 数登证书下载链接
	DigitalRegisterCertUrl *string `json:"digital_register_cert_url,omitempty" xml:"digital_register_cert_url,omitempty"`
	// 数登样本证书下载链接
	DigitalRegisterSampleUrl *string `json:"digital_register_sample_url,omitempty" xml:"digital_register_sample_url,omitempty"`
}

func (s GetBlockchainBccrDciRegistrationcertResponse) String() string {
	return tea.Prettify(s)
}

func (s GetBlockchainBccrDciRegistrationcertResponse) GoString() string {
	return s.String()
}

func (s *GetBlockchainBccrDciRegistrationcertResponse) SetReqMsgId(v string) *GetBlockchainBccrDciRegistrationcertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetBlockchainBccrDciRegistrationcertResponse) SetResultCode(v string) *GetBlockchainBccrDciRegistrationcertResponse {
	s.ResultCode = &v
	return s
}

func (s *GetBlockchainBccrDciRegistrationcertResponse) SetResultMsg(v string) *GetBlockchainBccrDciRegistrationcertResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetBlockchainBccrDciRegistrationcertResponse) SetCertStatus(v string) *GetBlockchainBccrDciRegistrationcertResponse {
	s.CertStatus = &v
	return s
}

func (s *GetBlockchainBccrDciRegistrationcertResponse) SetCertificateUrl(v string) *GetBlockchainBccrDciRegistrationcertResponse {
	s.CertificateUrl = &v
	return s
}

func (s *GetBlockchainBccrDciRegistrationcertResponse) SetErrorReason(v string) *GetBlockchainBccrDciRegistrationcertResponse {
	s.ErrorReason = &v
	return s
}

func (s *GetBlockchainBccrDciRegistrationcertResponse) SetErrorReasonCn(v string) *GetBlockchainBccrDciRegistrationcertResponse {
	s.ErrorReasonCn = &v
	return s
}

func (s *GetBlockchainBccrDciRegistrationcertResponse) SetDigitalRegisterStatus(v string) *GetBlockchainBccrDciRegistrationcertResponse {
	s.DigitalRegisterStatus = &v
	return s
}

func (s *GetBlockchainBccrDciRegistrationcertResponse) SetDownloadUrl(v string) *GetBlockchainBccrDciRegistrationcertResponse {
	s.DownloadUrl = &v
	return s
}

func (s *GetBlockchainBccrDciRegistrationcertResponse) SetDownloadTimesLeft(v int64) *GetBlockchainBccrDciRegistrationcertResponse {
	s.DownloadTimesLeft = &v
	return s
}

func (s *GetBlockchainBccrDciRegistrationcertResponse) SetFailDetail(v string) *GetBlockchainBccrDciRegistrationcertResponse {
	s.FailDetail = &v
	return s
}

func (s *GetBlockchainBccrDciRegistrationcertResponse) SetDigitalRegisterCertUrl(v string) *GetBlockchainBccrDciRegistrationcertResponse {
	s.DigitalRegisterCertUrl = &v
	return s
}

func (s *GetBlockchainBccrDciRegistrationcertResponse) SetDigitalRegisterSampleUrl(v string) *GetBlockchainBccrDciRegistrationcertResponse {
	s.DigitalRegisterSampleUrl = &v
	return s
}

type CreateBlockchainBccrDciRegistrationcertRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 版权用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// DCI码
	DciCode *string `json:"dci_code,omitempty" xml:"dci_code,omitempty" require:"true"`
	// 登记号
	RegNumber *string `json:"reg_number,omitempty" xml:"reg_number,omitempty" require:"true"`
	// 二维码
	QrCodeUrl *string `json:"qr_code_url,omitempty" xml:"qr_code_url,omitempty" require:"true"`
	// 客户端token
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty"`
}

func (s CreateBlockchainBccrDciRegistrationcertRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBlockchainBccrDciRegistrationcertRequest) GoString() string {
	return s.String()
}

func (s *CreateBlockchainBccrDciRegistrationcertRequest) SetAuthToken(v string) *CreateBlockchainBccrDciRegistrationcertRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBlockchainBccrDciRegistrationcertRequest) SetProductInstanceId(v string) *CreateBlockchainBccrDciRegistrationcertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBlockchainBccrDciRegistrationcertRequest) SetTaskId(v string) *CreateBlockchainBccrDciRegistrationcertRequest {
	s.TaskId = &v
	return s
}

func (s *CreateBlockchainBccrDciRegistrationcertRequest) SetUserId(v string) *CreateBlockchainBccrDciRegistrationcertRequest {
	s.UserId = &v
	return s
}

func (s *CreateBlockchainBccrDciRegistrationcertRequest) SetDciCode(v string) *CreateBlockchainBccrDciRegistrationcertRequest {
	s.DciCode = &v
	return s
}

func (s *CreateBlockchainBccrDciRegistrationcertRequest) SetRegNumber(v string) *CreateBlockchainBccrDciRegistrationcertRequest {
	s.RegNumber = &v
	return s
}

func (s *CreateBlockchainBccrDciRegistrationcertRequest) SetQrCodeUrl(v string) *CreateBlockchainBccrDciRegistrationcertRequest {
	s.QrCodeUrl = &v
	return s
}

func (s *CreateBlockchainBccrDciRegistrationcertRequest) SetClientToken(v string) *CreateBlockchainBccrDciRegistrationcertRequest {
	s.ClientToken = &v
	return s
}

type CreateBlockchainBccrDciRegistrationcertResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateBlockchainBccrDciRegistrationcertResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBlockchainBccrDciRegistrationcertResponse) GoString() string {
	return s.String()
}

func (s *CreateBlockchainBccrDciRegistrationcertResponse) SetReqMsgId(v string) *CreateBlockchainBccrDciRegistrationcertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBlockchainBccrDciRegistrationcertResponse) SetResultCode(v string) *CreateBlockchainBccrDciRegistrationcertResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBlockchainBccrDciRegistrationcertResponse) SetResultMsg(v string) *CreateBlockchainBccrDciRegistrationcertResponse {
	s.ResultMsg = &v
	return s
}

type QueryBlockchainBccrDciRegistrationcertRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryBlockchainBccrDciRegistrationcertRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainBccrDciRegistrationcertRequest) GoString() string {
	return s.String()
}

func (s *QueryBlockchainBccrDciRegistrationcertRequest) SetAuthToken(v string) *QueryBlockchainBccrDciRegistrationcertRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationcertRequest) SetProductInstanceId(v string) *QueryBlockchainBccrDciRegistrationcertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationcertRequest) SetTaskId(v string) *QueryBlockchainBccrDciRegistrationcertRequest {
	s.TaskId = &v
	return s
}

type QueryBlockchainBccrDciRegistrationcertResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 证书信息
	CertificateData *CertificateData `json:"certificate_data,omitempty" xml:"certificate_data,omitempty"`
}

func (s QueryBlockchainBccrDciRegistrationcertResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainBccrDciRegistrationcertResponse) GoString() string {
	return s.String()
}

func (s *QueryBlockchainBccrDciRegistrationcertResponse) SetReqMsgId(v string) *QueryBlockchainBccrDciRegistrationcertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationcertResponse) SetResultCode(v string) *QueryBlockchainBccrDciRegistrationcertResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationcertResponse) SetResultMsg(v string) *QueryBlockchainBccrDciRegistrationcertResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBlockchainBccrDciRegistrationcertResponse) SetCertificateData(v *CertificateData) *QueryBlockchainBccrDciRegistrationcertResponse {
	s.CertificateData = v
	return s
}

type GetBlockchainBccrDciPayurlRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数登申请id
	DigitalRegisterId *string `json:"digital_register_id,omitempty" xml:"digital_register_id,omitempty" require:"true"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
	// 废弃待删除
	DciUserId *string `json:"dci_user_id,omitempty" xml:"dci_user_id,omitempty"`
	// 废弃待删除
	DciContentId *string `json:"dci_content_id,omitempty" xml:"dci_content_id,omitempty"`
	// 废弃待删除
	PayMent *string `json:"pay_ment,omitempty" xml:"pay_ment,omitempty"`
	// 废弃待删除
	InvoiceInfo *InvoiceInfo `json:"invoice_info,omitempty" xml:"invoice_info,omitempty"`
}

func (s GetBlockchainBccrDciPayurlRequest) String() string {
	return tea.Prettify(s)
}

func (s GetBlockchainBccrDciPayurlRequest) GoString() string {
	return s.String()
}

func (s *GetBlockchainBccrDciPayurlRequest) SetAuthToken(v string) *GetBlockchainBccrDciPayurlRequest {
	s.AuthToken = &v
	return s
}

func (s *GetBlockchainBccrDciPayurlRequest) SetProductInstanceId(v string) *GetBlockchainBccrDciPayurlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetBlockchainBccrDciPayurlRequest) SetDigitalRegisterId(v string) *GetBlockchainBccrDciPayurlRequest {
	s.DigitalRegisterId = &v
	return s
}

func (s *GetBlockchainBccrDciPayurlRequest) SetClientToken(v string) *GetBlockchainBccrDciPayurlRequest {
	s.ClientToken = &v
	return s
}

func (s *GetBlockchainBccrDciPayurlRequest) SetDciUserId(v string) *GetBlockchainBccrDciPayurlRequest {
	s.DciUserId = &v
	return s
}

func (s *GetBlockchainBccrDciPayurlRequest) SetDciContentId(v string) *GetBlockchainBccrDciPayurlRequest {
	s.DciContentId = &v
	return s
}

func (s *GetBlockchainBccrDciPayurlRequest) SetPayMent(v string) *GetBlockchainBccrDciPayurlRequest {
	s.PayMent = &v
	return s
}

func (s *GetBlockchainBccrDciPayurlRequest) SetInvoiceInfo(v *InvoiceInfo) *GetBlockchainBccrDciPayurlRequest {
	s.InvoiceInfo = v
	return s
}

type GetBlockchainBccrDciPayurlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 支付链接
	PayUrl *string `json:"pay_url,omitempty" xml:"pay_url,omitempty"`
	// 错误信息
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
}

func (s GetBlockchainBccrDciPayurlResponse) String() string {
	return tea.Prettify(s)
}

func (s GetBlockchainBccrDciPayurlResponse) GoString() string {
	return s.String()
}

func (s *GetBlockchainBccrDciPayurlResponse) SetReqMsgId(v string) *GetBlockchainBccrDciPayurlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetBlockchainBccrDciPayurlResponse) SetResultCode(v string) *GetBlockchainBccrDciPayurlResponse {
	s.ResultCode = &v
	return s
}

func (s *GetBlockchainBccrDciPayurlResponse) SetResultMsg(v string) *GetBlockchainBccrDciPayurlResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetBlockchainBccrDciPayurlResponse) SetPayUrl(v string) *GetBlockchainBccrDciPayurlResponse {
	s.PayUrl = &v
	return s
}

func (s *GetBlockchainBccrDciPayurlResponse) SetErrorMsg(v string) *GetBlockchainBccrDciPayurlResponse {
	s.ErrorMsg = &v
	return s
}

type QueryBlockchainBccrDciPayRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数登申请id
	DigitalRegisterId *string `json:"digital_register_id,omitempty" xml:"digital_register_id,omitempty" require:"true"`
	// 废弃待删除
	DciUserId *string `json:"dci_user_id,omitempty" xml:"dci_user_id,omitempty"`
	// 废弃待删除
	DciContentId *string `json:"dci_content_id,omitempty" xml:"dci_content_id,omitempty"`
}

func (s QueryBlockchainBccrDciPayRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainBccrDciPayRequest) GoString() string {
	return s.String()
}

func (s *QueryBlockchainBccrDciPayRequest) SetAuthToken(v string) *QueryBlockchainBccrDciPayRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBlockchainBccrDciPayRequest) SetProductInstanceId(v string) *QueryBlockchainBccrDciPayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBlockchainBccrDciPayRequest) SetDigitalRegisterId(v string) *QueryBlockchainBccrDciPayRequest {
	s.DigitalRegisterId = &v
	return s
}

func (s *QueryBlockchainBccrDciPayRequest) SetDciUserId(v string) *QueryBlockchainBccrDciPayRequest {
	s.DciUserId = &v
	return s
}

func (s *QueryBlockchainBccrDciPayRequest) SetDciContentId(v string) *QueryBlockchainBccrDciPayRequest {
	s.DciContentId = &v
	return s
}

type QueryBlockchainBccrDciPayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 支付状态
	// （INIT 用户点击支付，待获取链接；GET_PAY_URL_FAIL 获取支付链接失败；PAY_FAIL 支付失败；TIMEOUT 支付超时；PAY_SUCCESS 支付成功；PAYING 支付中；PAY_EXCEPTION	支付异常，待重试）
	PayStatus *string `json:"pay_status,omitempty" xml:"pay_status,omitempty"`
	// 废弃待删除
	PayState *string `json:"pay_state,omitempty" xml:"pay_state,omitempty"`
}

func (s QueryBlockchainBccrDciPayResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainBccrDciPayResponse) GoString() string {
	return s.String()
}

func (s *QueryBlockchainBccrDciPayResponse) SetReqMsgId(v string) *QueryBlockchainBccrDciPayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBlockchainBccrDciPayResponse) SetResultCode(v string) *QueryBlockchainBccrDciPayResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBlockchainBccrDciPayResponse) SetResultMsg(v string) *QueryBlockchainBccrDciPayResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBlockchainBccrDciPayResponse) SetPayStatus(v string) *QueryBlockchainBccrDciPayResponse {
	s.PayStatus = &v
	return s
}

func (s *QueryBlockchainBccrDciPayResponse) SetPayState(v string) *QueryBlockchainBccrDciPayResponse {
	s.PayState = &v
	return s
}

type CallbackBlockchainBccrDciPayresultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 与中心约定的任务ID，同一个作品可能会发起多次登记
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 平台Id
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 订单ID
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 支付方式 (ALIPAY,0,支付宝)
	PayMent *string `json:"pay_ment,omitempty" xml:"pay_ment,omitempty" require:"true"`
	// 订单金额
	Money *string `json:"money,omitempty" xml:"money,omitempty" require:"true"`
	// 结果描述，如：支付成功
	ResultContent *string `json:"result_content,omitempty" xml:"result_content,omitempty" require:"true"`
	// 状态，2001代表支付成功
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
}

func (s CallbackBlockchainBccrDciPayresultRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackBlockchainBccrDciPayresultRequest) GoString() string {
	return s.String()
}

func (s *CallbackBlockchainBccrDciPayresultRequest) SetAuthToken(v string) *CallbackBlockchainBccrDciPayresultRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackBlockchainBccrDciPayresultRequest) SetProductInstanceId(v string) *CallbackBlockchainBccrDciPayresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackBlockchainBccrDciPayresultRequest) SetTaskId(v string) *CallbackBlockchainBccrDciPayresultRequest {
	s.TaskId = &v
	return s
}

func (s *CallbackBlockchainBccrDciPayresultRequest) SetAppId(v string) *CallbackBlockchainBccrDciPayresultRequest {
	s.AppId = &v
	return s
}

func (s *CallbackBlockchainBccrDciPayresultRequest) SetOrderId(v string) *CallbackBlockchainBccrDciPayresultRequest {
	s.OrderId = &v
	return s
}

func (s *CallbackBlockchainBccrDciPayresultRequest) SetPayMent(v string) *CallbackBlockchainBccrDciPayresultRequest {
	s.PayMent = &v
	return s
}

func (s *CallbackBlockchainBccrDciPayresultRequest) SetMoney(v string) *CallbackBlockchainBccrDciPayresultRequest {
	s.Money = &v
	return s
}

func (s *CallbackBlockchainBccrDciPayresultRequest) SetResultContent(v string) *CallbackBlockchainBccrDciPayresultRequest {
	s.ResultContent = &v
	return s
}

func (s *CallbackBlockchainBccrDciPayresultRequest) SetCode(v string) *CallbackBlockchainBccrDciPayresultRequest {
	s.Code = &v
	return s
}

type CallbackBlockchainBccrDciPayresultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CallbackBlockchainBccrDciPayresultResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackBlockchainBccrDciPayresultResponse) GoString() string {
	return s.String()
}

func (s *CallbackBlockchainBccrDciPayresultResponse) SetReqMsgId(v string) *CallbackBlockchainBccrDciPayresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackBlockchainBccrDciPayresultResponse) SetResultCode(v string) *CallbackBlockchainBccrDciPayresultResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackBlockchainBccrDciPayresultResponse) SetResultMsg(v string) *CallbackBlockchainBccrDciPayresultResponse {
	s.ResultMsg = &v
	return s
}

type RefuseBlockchainBccrDciRegistrationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 复审失败原因
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 失败详情
	FailDetail *string `json:"fail_detail,omitempty" xml:"fail_detail,omitempty" require:"true"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
}

func (s RefuseBlockchainBccrDciRegistrationRequest) String() string {
	return tea.Prettify(s)
}

func (s RefuseBlockchainBccrDciRegistrationRequest) GoString() string {
	return s.String()
}

func (s *RefuseBlockchainBccrDciRegistrationRequest) SetAuthToken(v string) *RefuseBlockchainBccrDciRegistrationRequest {
	s.AuthToken = &v
	return s
}

func (s *RefuseBlockchainBccrDciRegistrationRequest) SetProductInstanceId(v string) *RefuseBlockchainBccrDciRegistrationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RefuseBlockchainBccrDciRegistrationRequest) SetTaskId(v string) *RefuseBlockchainBccrDciRegistrationRequest {
	s.TaskId = &v
	return s
}

func (s *RefuseBlockchainBccrDciRegistrationRequest) SetCode(v string) *RefuseBlockchainBccrDciRegistrationRequest {
	s.Code = &v
	return s
}

func (s *RefuseBlockchainBccrDciRegistrationRequest) SetFailDetail(v string) *RefuseBlockchainBccrDciRegistrationRequest {
	s.FailDetail = &v
	return s
}

func (s *RefuseBlockchainBccrDciRegistrationRequest) SetClientToken(v string) *RefuseBlockchainBccrDciRegistrationRequest {
	s.ClientToken = &v
	return s
}

type RefuseBlockchainBccrDciRegistrationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RefuseBlockchainBccrDciRegistrationResponse) String() string {
	return tea.Prettify(s)
}

func (s RefuseBlockchainBccrDciRegistrationResponse) GoString() string {
	return s.String()
}

func (s *RefuseBlockchainBccrDciRegistrationResponse) SetReqMsgId(v string) *RefuseBlockchainBccrDciRegistrationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RefuseBlockchainBccrDciRegistrationResponse) SetResultCode(v string) *RefuseBlockchainBccrDciRegistrationResponse {
	s.ResultCode = &v
	return s
}

func (s *RefuseBlockchainBccrDciRegistrationResponse) SetResultMsg(v string) *RefuseBlockchainBccrDciRegistrationResponse {
	s.ResultMsg = &v
	return s
}

type RetryBlockchainBccrDciRegistrationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待补正数登申请id
	DigitalRegisterId *string `json:"digital_register_id,omitempty" xml:"digital_register_id,omitempty" require:"true"`
	// 替换dci申领id
	DciContentId *string `json:"dci_content_id,omitempty" xml:"dci_content_id,omitempty"`
	// 数登申请声明
	ExplanationInfo *DciExplanationInfo `json:"explanation_info,omitempty" xml:"explanation_info,omitempty" require:"true"`
	// 补充文件信息
	AdditionalFileInfo *AdditionalFileInfo `json:"additional_file_info,omitempty" xml:"additional_file_info,omitempty"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
	// 权利描述
	RightScopeDesc *string `json:"right_scope_desc,omitempty" xml:"right_scope_desc,omitempty"`
	// 申领人联系信息
	ApplyerContactInfo *ContactInfo `json:"applyer_contact_info,omitempty" xml:"applyer_contact_info,omitempty"`
	// 代理人联系信息
	PlatformContactInfo *ContactInfo `json:"platform_contact_info,omitempty" xml:"platform_contact_info,omitempty"`
}

func (s RetryBlockchainBccrDciRegistrationRequest) String() string {
	return tea.Prettify(s)
}

func (s RetryBlockchainBccrDciRegistrationRequest) GoString() string {
	return s.String()
}

func (s *RetryBlockchainBccrDciRegistrationRequest) SetAuthToken(v string) *RetryBlockchainBccrDciRegistrationRequest {
	s.AuthToken = &v
	return s
}

func (s *RetryBlockchainBccrDciRegistrationRequest) SetProductInstanceId(v string) *RetryBlockchainBccrDciRegistrationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RetryBlockchainBccrDciRegistrationRequest) SetDigitalRegisterId(v string) *RetryBlockchainBccrDciRegistrationRequest {
	s.DigitalRegisterId = &v
	return s
}

func (s *RetryBlockchainBccrDciRegistrationRequest) SetDciContentId(v string) *RetryBlockchainBccrDciRegistrationRequest {
	s.DciContentId = &v
	return s
}

func (s *RetryBlockchainBccrDciRegistrationRequest) SetExplanationInfo(v *DciExplanationInfo) *RetryBlockchainBccrDciRegistrationRequest {
	s.ExplanationInfo = v
	return s
}

func (s *RetryBlockchainBccrDciRegistrationRequest) SetAdditionalFileInfo(v *AdditionalFileInfo) *RetryBlockchainBccrDciRegistrationRequest {
	s.AdditionalFileInfo = v
	return s
}

func (s *RetryBlockchainBccrDciRegistrationRequest) SetClientToken(v string) *RetryBlockchainBccrDciRegistrationRequest {
	s.ClientToken = &v
	return s
}

func (s *RetryBlockchainBccrDciRegistrationRequest) SetRightScopeDesc(v string) *RetryBlockchainBccrDciRegistrationRequest {
	s.RightScopeDesc = &v
	return s
}

func (s *RetryBlockchainBccrDciRegistrationRequest) SetApplyerContactInfo(v *ContactInfo) *RetryBlockchainBccrDciRegistrationRequest {
	s.ApplyerContactInfo = v
	return s
}

func (s *RetryBlockchainBccrDciRegistrationRequest) SetPlatformContactInfo(v *ContactInfo) *RetryBlockchainBccrDciRegistrationRequest {
	s.PlatformContactInfo = v
	return s
}

type RetryBlockchainBccrDciRegistrationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误信息
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
}

func (s RetryBlockchainBccrDciRegistrationResponse) String() string {
	return tea.Prettify(s)
}

func (s RetryBlockchainBccrDciRegistrationResponse) GoString() string {
	return s.String()
}

func (s *RetryBlockchainBccrDciRegistrationResponse) SetReqMsgId(v string) *RetryBlockchainBccrDciRegistrationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RetryBlockchainBccrDciRegistrationResponse) SetResultCode(v string) *RetryBlockchainBccrDciRegistrationResponse {
	s.ResultCode = &v
	return s
}

func (s *RetryBlockchainBccrDciRegistrationResponse) SetResultMsg(v string) *RetryBlockchainBccrDciRegistrationResponse {
	s.ResultMsg = &v
	return s
}

func (s *RetryBlockchainBccrDciRegistrationResponse) SetErrorMsg(v string) *RetryBlockchainBccrDciRegistrationResponse {
	s.ErrorMsg = &v
	return s
}

type CloseBlockchainBccrDciRegistrationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数登id
	DigitalRegisterId *string `json:"digital_register_id,omitempty" xml:"digital_register_id,omitempty" require:"true"`
	// 退费人名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 联系手机号
	MobileNo *string `json:"mobile_no,omitempty" xml:"mobile_no,omitempty" require:"true"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
}

func (s CloseBlockchainBccrDciRegistrationRequest) String() string {
	return tea.Prettify(s)
}

func (s CloseBlockchainBccrDciRegistrationRequest) GoString() string {
	return s.String()
}

func (s *CloseBlockchainBccrDciRegistrationRequest) SetAuthToken(v string) *CloseBlockchainBccrDciRegistrationRequest {
	s.AuthToken = &v
	return s
}

func (s *CloseBlockchainBccrDciRegistrationRequest) SetProductInstanceId(v string) *CloseBlockchainBccrDciRegistrationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CloseBlockchainBccrDciRegistrationRequest) SetDigitalRegisterId(v string) *CloseBlockchainBccrDciRegistrationRequest {
	s.DigitalRegisterId = &v
	return s
}

func (s *CloseBlockchainBccrDciRegistrationRequest) SetName(v string) *CloseBlockchainBccrDciRegistrationRequest {
	s.Name = &v
	return s
}

func (s *CloseBlockchainBccrDciRegistrationRequest) SetMobileNo(v string) *CloseBlockchainBccrDciRegistrationRequest {
	s.MobileNo = &v
	return s
}

func (s *CloseBlockchainBccrDciRegistrationRequest) SetClientToken(v string) *CloseBlockchainBccrDciRegistrationRequest {
	s.ClientToken = &v
	return s
}

type CloseBlockchainBccrDciRegistrationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CloseBlockchainBccrDciRegistrationResponse) String() string {
	return tea.Prettify(s)
}

func (s CloseBlockchainBccrDciRegistrationResponse) GoString() string {
	return s.String()
}

func (s *CloseBlockchainBccrDciRegistrationResponse) SetReqMsgId(v string) *CloseBlockchainBccrDciRegistrationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CloseBlockchainBccrDciRegistrationResponse) SetResultCode(v string) *CloseBlockchainBccrDciRegistrationResponse {
	s.ResultCode = &v
	return s
}

func (s *CloseBlockchainBccrDciRegistrationResponse) SetResultMsg(v string) *CloseBlockchainBccrDciRegistrationResponse {
	s.ResultMsg = &v
	return s
}

type CreateBlockchainBccrOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
	// 幂等id【标废弃， 幂等id已client_token为准】
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 发票信息
	InvoiceInfo *InvoiceInfo `json:"invoice_info,omitempty" xml:"invoice_info,omitempty" require:"true"`
	// 订单明细列表
	OrderItem []*OrderItem `json:"order_item,omitempty" xml:"order_item,omitempty" require:"true" type:"Repeated"`
}

func (s CreateBlockchainBccrOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBlockchainBccrOrderRequest) GoString() string {
	return s.String()
}

func (s *CreateBlockchainBccrOrderRequest) SetAuthToken(v string) *CreateBlockchainBccrOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBlockchainBccrOrderRequest) SetProductInstanceId(v string) *CreateBlockchainBccrOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBlockchainBccrOrderRequest) SetClientToken(v string) *CreateBlockchainBccrOrderRequest {
	s.ClientToken = &v
	return s
}

func (s *CreateBlockchainBccrOrderRequest) SetRequestId(v string) *CreateBlockchainBccrOrderRequest {
	s.RequestId = &v
	return s
}

func (s *CreateBlockchainBccrOrderRequest) SetInvoiceInfo(v *InvoiceInfo) *CreateBlockchainBccrOrderRequest {
	s.InvoiceInfo = v
	return s
}

func (s *CreateBlockchainBccrOrderRequest) SetOrderItem(v []*OrderItem) *CreateBlockchainBccrOrderRequest {
	s.OrderItem = v
	return s
}

type CreateBlockchainBccrOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用于查询支付链接
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 创建订单失败
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
}

func (s CreateBlockchainBccrOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBlockchainBccrOrderResponse) GoString() string {
	return s.String()
}

func (s *CreateBlockchainBccrOrderResponse) SetReqMsgId(v string) *CreateBlockchainBccrOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBlockchainBccrOrderResponse) SetResultCode(v string) *CreateBlockchainBccrOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBlockchainBccrOrderResponse) SetResultMsg(v string) *CreateBlockchainBccrOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBlockchainBccrOrderResponse) SetOrderId(v string) *CreateBlockchainBccrOrderResponse {
	s.OrderId = &v
	return s
}

func (s *CreateBlockchainBccrOrderResponse) SetErrorMsg(v string) *CreateBlockchainBccrOrderResponse {
	s.ErrorMsg = &v
	return s
}

type QueryBlockchainBccrOrderPayurlRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s QueryBlockchainBccrOrderPayurlRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainBccrOrderPayurlRequest) GoString() string {
	return s.String()
}

func (s *QueryBlockchainBccrOrderPayurlRequest) SetAuthToken(v string) *QueryBlockchainBccrOrderPayurlRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBlockchainBccrOrderPayurlRequest) SetProductInstanceId(v string) *QueryBlockchainBccrOrderPayurlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBlockchainBccrOrderPayurlRequest) SetOrderId(v string) *QueryBlockchainBccrOrderPayurlRequest {
	s.OrderId = &v
	return s
}

type QueryBlockchainBccrOrderPayurlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 支付链接
	PayUrl *string `json:"pay_url,omitempty" xml:"pay_url,omitempty"`
	// 查询支付链接失败
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
}

func (s QueryBlockchainBccrOrderPayurlResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainBccrOrderPayurlResponse) GoString() string {
	return s.String()
}

func (s *QueryBlockchainBccrOrderPayurlResponse) SetReqMsgId(v string) *QueryBlockchainBccrOrderPayurlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBlockchainBccrOrderPayurlResponse) SetResultCode(v string) *QueryBlockchainBccrOrderPayurlResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBlockchainBccrOrderPayurlResponse) SetResultMsg(v string) *QueryBlockchainBccrOrderPayurlResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBlockchainBccrOrderPayurlResponse) SetPayUrl(v string) *QueryBlockchainBccrOrderPayurlResponse {
	s.PayUrl = &v
	return s
}

func (s *QueryBlockchainBccrOrderPayurlResponse) SetErrorMsg(v string) *QueryBlockchainBccrOrderPayurlResponse {
	s.ErrorMsg = &v
	return s
}

type FinishBlockchainBccrDciRegistrationcertRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 登记号
	RegNumber *string `json:"reg_number,omitempty" xml:"reg_number,omitempty" require:"true"`
	// 数登证书地址
	CertificateUrl *string `json:"certificate_url,omitempty" xml:"certificate_url,omitempty"`
	// 数登样本地址
	SampleUrl *string `json:"sample_url,omitempty" xml:"sample_url,omitempty"`
	// 客户端幂等token
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
}

func (s FinishBlockchainBccrDciRegistrationcertRequest) String() string {
	return tea.Prettify(s)
}

func (s FinishBlockchainBccrDciRegistrationcertRequest) GoString() string {
	return s.String()
}

func (s *FinishBlockchainBccrDciRegistrationcertRequest) SetAuthToken(v string) *FinishBlockchainBccrDciRegistrationcertRequest {
	s.AuthToken = &v
	return s
}

func (s *FinishBlockchainBccrDciRegistrationcertRequest) SetProductInstanceId(v string) *FinishBlockchainBccrDciRegistrationcertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *FinishBlockchainBccrDciRegistrationcertRequest) SetRegNumber(v string) *FinishBlockchainBccrDciRegistrationcertRequest {
	s.RegNumber = &v
	return s
}

func (s *FinishBlockchainBccrDciRegistrationcertRequest) SetCertificateUrl(v string) *FinishBlockchainBccrDciRegistrationcertRequest {
	s.CertificateUrl = &v
	return s
}

func (s *FinishBlockchainBccrDciRegistrationcertRequest) SetSampleUrl(v string) *FinishBlockchainBccrDciRegistrationcertRequest {
	s.SampleUrl = &v
	return s
}

func (s *FinishBlockchainBccrDciRegistrationcertRequest) SetClientToken(v string) *FinishBlockchainBccrDciRegistrationcertRequest {
	s.ClientToken = &v
	return s
}

type FinishBlockchainBccrDciRegistrationcertResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s FinishBlockchainBccrDciRegistrationcertResponse) String() string {
	return tea.Prettify(s)
}

func (s FinishBlockchainBccrDciRegistrationcertResponse) GoString() string {
	return s.String()
}

func (s *FinishBlockchainBccrDciRegistrationcertResponse) SetReqMsgId(v string) *FinishBlockchainBccrDciRegistrationcertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *FinishBlockchainBccrDciRegistrationcertResponse) SetResultCode(v string) *FinishBlockchainBccrDciRegistrationcertResponse {
	s.ResultCode = &v
	return s
}

func (s *FinishBlockchainBccrDciRegistrationcertResponse) SetResultMsg(v string) *FinishBlockchainBccrDciRegistrationcertResponse {
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
				"sdk_version":      tea.String("1.0.0"),
				"_prod_code":       tea.String("ak_9705ae7650f74f47b1e8158151cc122f"),
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
 * Description: 发起数登申请
 * Summary: 发起数登申请
 */
func (client *Client) CreateBlockchainBccrDciRegistration(request *CreateBlockchainBccrDciRegistrationRequest) (_result *CreateBlockchainBccrDciRegistrationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBlockchainBccrDciRegistrationResponse{}
	_body, _err := client.CreateBlockchainBccrDciRegistrationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发起数登申请
 * Summary: 发起数登申请
 */
func (client *Client) CreateBlockchainBccrDciRegistrationEx(request *CreateBlockchainBccrDciRegistrationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBlockchainBccrDciRegistrationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBlockchainBccrDciRegistrationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.registration.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 已废弃接口
 * Summary: 已废弃接口
 */
func (client *Client) QueryBlockchainBccrDciRegistrationsubmit(request *QueryBlockchainBccrDciRegistrationsubmitRequest) (_result *QueryBlockchainBccrDciRegistrationsubmitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBlockchainBccrDciRegistrationsubmitResponse{}
	_body, _err := client.QueryBlockchainBccrDciRegistrationsubmitEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 已废弃接口
 * Summary: 已废弃接口
 */
func (client *Client) QueryBlockchainBccrDciRegistrationsubmitEx(request *QueryBlockchainBccrDciRegistrationsubmitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBlockchainBccrDciRegistrationsubmitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBlockchainBccrDciRegistrationsubmitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.registrationsubmit.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询数登结果
 * Summary: 查询数登结果
 */
func (client *Client) QueryBlockchainBccrDciRegistration(request *QueryBlockchainBccrDciRegistrationRequest) (_result *QueryBlockchainBccrDciRegistrationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBlockchainBccrDciRegistrationResponse{}
	_body, _err := client.QueryBlockchainBccrDciRegistrationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询数登结果
 * Summary: 查询数登结果
 */
func (client *Client) QueryBlockchainBccrDciRegistrationEx(request *QueryBlockchainBccrDciRegistrationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBlockchainBccrDciRegistrationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBlockchainBccrDciRegistrationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.registration.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取数登证书下载链接
 * Summary: 获取数登证书下载链接
 */
func (client *Client) GetBlockchainBccrDciRegistrationcert(request *GetBlockchainBccrDciRegistrationcertRequest) (_result *GetBlockchainBccrDciRegistrationcertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetBlockchainBccrDciRegistrationcertResponse{}
	_body, _err := client.GetBlockchainBccrDciRegistrationcertEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取数登证书下载链接
 * Summary: 获取数登证书下载链接
 */
func (client *Client) GetBlockchainBccrDciRegistrationcertEx(request *GetBlockchainBccrDciRegistrationcertRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetBlockchainBccrDciRegistrationcertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetBlockchainBccrDciRegistrationcertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.registrationcert.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建数字登记证书
 * Summary: 创建数字登记证书
 */
func (client *Client) CreateBlockchainBccrDciRegistrationcert(request *CreateBlockchainBccrDciRegistrationcertRequest) (_result *CreateBlockchainBccrDciRegistrationcertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBlockchainBccrDciRegistrationcertResponse{}
	_body, _err := client.CreateBlockchainBccrDciRegistrationcertEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建数字登记证书
 * Summary: 创建数字登记证书
 */
func (client *Client) CreateBlockchainBccrDciRegistrationcertEx(request *CreateBlockchainBccrDciRegistrationcertRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBlockchainBccrDciRegistrationcertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBlockchainBccrDciRegistrationcertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.registrationcert.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 已废弃接口
 * Summary: 已废弃接口
 */
func (client *Client) QueryBlockchainBccrDciRegistrationcert(request *QueryBlockchainBccrDciRegistrationcertRequest) (_result *QueryBlockchainBccrDciRegistrationcertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBlockchainBccrDciRegistrationcertResponse{}
	_body, _err := client.QueryBlockchainBccrDciRegistrationcertEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 已废弃接口
 * Summary: 已废弃接口
 */
func (client *Client) QueryBlockchainBccrDciRegistrationcertEx(request *QueryBlockchainBccrDciRegistrationcertRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBlockchainBccrDciRegistrationcertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBlockchainBccrDciRegistrationcertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.registrationcert.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发起支付，获取支付链接
 * Summary: 数登支付-发起支付
 */
func (client *Client) GetBlockchainBccrDciPayurl(request *GetBlockchainBccrDciPayurlRequest) (_result *GetBlockchainBccrDciPayurlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetBlockchainBccrDciPayurlResponse{}
	_body, _err := client.GetBlockchainBccrDciPayurlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发起支付，获取支付链接
 * Summary: 数登支付-发起支付
 */
func (client *Client) GetBlockchainBccrDciPayurlEx(request *GetBlockchainBccrDciPayurlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetBlockchainBccrDciPayurlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetBlockchainBccrDciPayurlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.payurl.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询数登支付结果
 * Summary: 查询数登支付结果
 */
func (client *Client) QueryBlockchainBccrDciPay(request *QueryBlockchainBccrDciPayRequest) (_result *QueryBlockchainBccrDciPayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBlockchainBccrDciPayResponse{}
	_body, _err := client.QueryBlockchainBccrDciPayEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询数登支付结果
 * Summary: 查询数登支付结果
 */
func (client *Client) QueryBlockchainBccrDciPayEx(request *QueryBlockchainBccrDciPayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBlockchainBccrDciPayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBlockchainBccrDciPayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.pay.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 支付结果回调
 * Summary: 数登支付-支付结果回调
 */
func (client *Client) CallbackBlockchainBccrDciPayresult(request *CallbackBlockchainBccrDciPayresultRequest) (_result *CallbackBlockchainBccrDciPayresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackBlockchainBccrDciPayresultResponse{}
	_body, _err := client.CallbackBlockchainBccrDciPayresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 支付结果回调
 * Summary: 数登支付-支付结果回调
 */
func (client *Client) CallbackBlockchainBccrDciPayresultEx(request *CallbackBlockchainBccrDciPayresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackBlockchainBccrDciPayresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackBlockchainBccrDciPayresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.payresult.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数登审核失败结果回调
 * Summary: 数登审核失败结果回调
 */
func (client *Client) RefuseBlockchainBccrDciRegistration(request *RefuseBlockchainBccrDciRegistrationRequest) (_result *RefuseBlockchainBccrDciRegistrationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RefuseBlockchainBccrDciRegistrationResponse{}
	_body, _err := client.RefuseBlockchainBccrDciRegistrationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数登审核失败结果回调
 * Summary: 数登审核失败结果回调
 */
func (client *Client) RefuseBlockchainBccrDciRegistrationEx(request *RefuseBlockchainBccrDciRegistrationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RefuseBlockchainBccrDciRegistrationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RefuseBlockchainBccrDciRegistrationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.registration.refuse"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 补正数登申请
 * Summary: 补正数登申请
 */
func (client *Client) RetryBlockchainBccrDciRegistration(request *RetryBlockchainBccrDciRegistrationRequest) (_result *RetryBlockchainBccrDciRegistrationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RetryBlockchainBccrDciRegistrationResponse{}
	_body, _err := client.RetryBlockchainBccrDciRegistrationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 补正数登申请
 * Summary: 补正数登申请
 */
func (client *Client) RetryBlockchainBccrDciRegistrationEx(request *RetryBlockchainBccrDciRegistrationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RetryBlockchainBccrDciRegistrationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RetryBlockchainBccrDciRegistrationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.registration.retry"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数登停止申请
 * Summary: 数登停止申请
 */
func (client *Client) CloseBlockchainBccrDciRegistration(request *CloseBlockchainBccrDciRegistrationRequest) (_result *CloseBlockchainBccrDciRegistrationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CloseBlockchainBccrDciRegistrationResponse{}
	_body, _err := client.CloseBlockchainBccrDciRegistrationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数登停止申请
 * Summary: 数登停止申请
 */
func (client *Client) CloseBlockchainBccrDciRegistrationEx(request *CloseBlockchainBccrDciRegistrationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CloseBlockchainBccrDciRegistrationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CloseBlockchainBccrDciRegistrationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.registration.close"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建订单
 * Summary: 创建订单
 */
func (client *Client) CreateBlockchainBccrOrder(request *CreateBlockchainBccrOrderRequest) (_result *CreateBlockchainBccrOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBlockchainBccrOrderResponse{}
	_body, _err := client.CreateBlockchainBccrOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建订单
 * Summary: 创建订单
 */
func (client *Client) CreateBlockchainBccrOrderEx(request *CreateBlockchainBccrOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBlockchainBccrOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBlockchainBccrOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.order.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询订单支付链接
 * Summary: 查询订单支付链接
 */
func (client *Client) QueryBlockchainBccrOrderPayurl(request *QueryBlockchainBccrOrderPayurlRequest) (_result *QueryBlockchainBccrOrderPayurlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBlockchainBccrOrderPayurlResponse{}
	_body, _err := client.QueryBlockchainBccrOrderPayurlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询订单支付链接
 * Summary: 查询订单支付链接
 */
func (client *Client) QueryBlockchainBccrOrderPayurlEx(request *QueryBlockchainBccrOrderPayurlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBlockchainBccrOrderPayurlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBlockchainBccrOrderPayurlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.order.payurl.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 版保完成数登证书回调
 * Summary: 版保完成数登证书回调
 */
func (client *Client) FinishBlockchainBccrDciRegistrationcert(request *FinishBlockchainBccrDciRegistrationcertRequest) (_result *FinishBlockchainBccrDciRegistrationcertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &FinishBlockchainBccrDciRegistrationcertResponse{}
	_body, _err := client.FinishBlockchainBccrDciRegistrationcertEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 版保完成数登证书回调
 * Summary: 版保完成数登证书回调
 */
func (client *Client) FinishBlockchainBccrDciRegistrationcertEx(request *FinishBlockchainBccrDciRegistrationcertRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *FinishBlockchainBccrDciRegistrationcertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &FinishBlockchainBccrDciRegistrationcertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.registrationcert.finish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
