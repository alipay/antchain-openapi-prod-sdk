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

// CA电子签约正文章信息
type CaSystemMainBodyRequest struct {
	// 签署页码
	PosPage *int64 `json:"pos_page,omitempty" xml:"pos_page,omitempty" require:"true"`
	// 签署区位置横坐标
	PosX *string `json:"pos_x,omitempty" xml:"pos_x,omitempty" require:"true"`
	// 签署区位置纵坐标
	PosY *string `json:"pos_y,omitempty" xml:"pos_y,omitempty" require:"true"`
}

func (s CaSystemMainBodyRequest) String() string {
	return tea.Prettify(s)
}

func (s CaSystemMainBodyRequest) GoString() string {
	return s.String()
}

func (s *CaSystemMainBodyRequest) SetPosPage(v int64) *CaSystemMainBodyRequest {
	s.PosPage = &v
	return s
}

func (s *CaSystemMainBodyRequest) SetPosX(v string) *CaSystemMainBodyRequest {
	s.PosX = &v
	return s
}

func (s *CaSystemMainBodyRequest) SetPosY(v string) *CaSystemMainBodyRequest {
	s.PosY = &v
	return s
}

// 骑缝章信息
type CaSystemCrossPageRequest struct {
	// 签署页码
	PosPageStart *int64 `json:"pos_page_start,omitempty" xml:"pos_page_start,omitempty" require:"true"`
	// 结束页码（供骑缝章使用）
	PosPageEnd *int64 `json:"pos_page_end,omitempty" xml:"pos_page_end,omitempty" require:"true"`
	// 签署区位置横坐标
	PosX *string `json:"pos_x,omitempty" xml:"pos_x,omitempty" require:"true"`
	// 签署区位置纵坐标
	PosY *string `json:"pos_y,omitempty" xml:"pos_y,omitempty" require:"true"`
}

func (s CaSystemCrossPageRequest) String() string {
	return tea.Prettify(s)
}

func (s CaSystemCrossPageRequest) GoString() string {
	return s.String()
}

func (s *CaSystemCrossPageRequest) SetPosPageStart(v int64) *CaSystemCrossPageRequest {
	s.PosPageStart = &v
	return s
}

func (s *CaSystemCrossPageRequest) SetPosPageEnd(v int64) *CaSystemCrossPageRequest {
	s.PosPageEnd = &v
	return s
}

func (s *CaSystemCrossPageRequest) SetPosX(v string) *CaSystemCrossPageRequest {
	s.PosX = &v
	return s
}

func (s *CaSystemCrossPageRequest) SetPosY(v string) *CaSystemCrossPageRequest {
	s.PosY = &v
	return s
}

// 签署区域信息（包括印模信息）
type CaSystemSignAreaRequest struct {
	// 印章id,联系签署中心获取
	SealId *string `json:"seal_id,omitempty" xml:"seal_id,omitempty"`
	// 用印对齐类型,TOP_LEFT("TOP_LEFT", "左上角对齐"), BOTTOM_LEFT("BOTTOM_LEFT", "左下角对齐"), CENTER("CENTER", "xy值是印章的中心"), TOP_RIGHT("TOP_RIGHT", "xy值是印章右上角"), BOTTOM_RIGHT("BOTTOM_RIGHT", "xy值是印章右下角")
	LocationType *string `json:"location_type,omitempty" xml:"location_type,omitempty" require:"true"`
	// 签署位置类型，1-正文，2-骑缝
	PositionType *string `json:"position_type,omitempty" xml:"position_type,omitempty" require:"true"`
	// 骑缝章信息，需要盖骑缝章的时候 请传递此参数
	SystemCrossPageRequest *CaSystemCrossPageRequest `json:"system_cross_page_request,omitempty" xml:"system_cross_page_request,omitempty"`
	// 正文章信息，正文章模式必填
	SystemMainBodyRequest *CaSystemMainBodyRequest `json:"system_main_body_request,omitempty" xml:"system_main_body_request,omitempty"`
}

func (s CaSystemSignAreaRequest) String() string {
	return tea.Prettify(s)
}

func (s CaSystemSignAreaRequest) GoString() string {
	return s.String()
}

func (s *CaSystemSignAreaRequest) SetSealId(v string) *CaSystemSignAreaRequest {
	s.SealId = &v
	return s
}

func (s *CaSystemSignAreaRequest) SetLocationType(v string) *CaSystemSignAreaRequest {
	s.LocationType = &v
	return s
}

func (s *CaSystemSignAreaRequest) SetPositionType(v string) *CaSystemSignAreaRequest {
	s.PositionType = &v
	return s
}

func (s *CaSystemSignAreaRequest) SetSystemCrossPageRequest(v *CaSystemCrossPageRequest) *CaSystemSignAreaRequest {
	s.SystemCrossPageRequest = v
	return s
}

func (s *CaSystemSignAreaRequest) SetSystemMainBodyRequest(v *CaSystemMainBodyRequest) *CaSystemSignAreaRequest {
	s.SystemMainBodyRequest = v
	return s
}

// 签署文件信息（包含印模和签署区域）
type CaSystemSignFileRequest struct {
	// 签署文件id,和签署文件列表fileId呼应
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 签署文件列表（包含印模和签署区域）
	SystemSignAreaRequestList []*CaSystemSignAreaRequest `json:"system_sign_area_request_list,omitempty" xml:"system_sign_area_request_list,omitempty" require:"true" type:"Repeated"`
}

func (s CaSystemSignFileRequest) String() string {
	return tea.Prettify(s)
}

func (s CaSystemSignFileRequest) GoString() string {
	return s.String()
}

func (s *CaSystemSignFileRequest) SetFileId(v string) *CaSystemSignFileRequest {
	s.FileId = &v
	return s
}

func (s *CaSystemSignFileRequest) SetSystemSignAreaRequestList(v []*CaSystemSignAreaRequest) *CaSystemSignFileRequest {
	s.SystemSignAreaRequestList = v
	return s
}

// 待签署文件列表
type CaSignFileRequest struct {
	// 文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 文件id,映射唯一的文件。多文件签署场景下，fileId必须唯一且和文件一一对应
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s CaSignFileRequest) String() string {
	return tea.Prettify(s)
}

func (s CaSignFileRequest) GoString() string {
	return s.String()
}

func (s *CaSignFileRequest) SetFileName(v string) *CaSignFileRequest {
	s.FileName = &v
	return s
}

func (s *CaSignFileRequest) SetFileId(v string) *CaSignFileRequest {
	s.FileId = &v
	return s
}

// 签署方信息
type SignatoryInfo struct {
	// 页码信息 （骑缝签署页码为1-2这种，其余情况都是数字）
	PosPage *string `json:"pos_page,omitempty" xml:"pos_page,omitempty" require:"true"`
	//  x坐标
	PosX *string `json:"pos_x,omitempty" xml:"pos_x,omitempty" require:"true"`
	//  y坐标
	PosY *string `json:"pos_y,omitempty" xml:"pos_y,omitempty" require:"true"`
	// 签署区宽 (默认为100)
	Width *string `json:"width,omitempty" xml:"width,omitempty"`
}

func (s SignatoryInfo) String() string {
	return tea.Prettify(s)
}

func (s SignatoryInfo) GoString() string {
	return s.String()
}

func (s *SignatoryInfo) SetPosPage(v string) *SignatoryInfo {
	s.PosPage = &v
	return s
}

func (s *SignatoryInfo) SetPosX(v string) *SignatoryInfo {
	s.PosX = &v
	return s
}

func (s *SignatoryInfo) SetPosY(v string) *SignatoryInfo {
	s.PosY = &v
	return s
}

func (s *SignatoryInfo) SetWidth(v string) *SignatoryInfo {
	s.Width = &v
	return s
}

// 签署完成的文件
type CaSignFileResult struct {
	// 文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// 文件osskey
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty"`
	// 文件id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 文件http链接
	HttpFileUrl *string `json:"http_file_url,omitempty" xml:"http_file_url,omitempty"`
}

func (s CaSignFileResult) String() string {
	return tea.Prettify(s)
}

func (s CaSignFileResult) GoString() string {
	return s.String()
}

func (s *CaSignFileResult) SetFileName(v string) *CaSignFileResult {
	s.FileName = &v
	return s
}

func (s *CaSignFileResult) SetFileKey(v string) *CaSignFileResult {
	s.FileKey = &v
	return s
}

func (s *CaSignFileResult) SetFileId(v string) *CaSignFileResult {
	s.FileId = &v
	return s
}

func (s *CaSignFileResult) SetHttpFileUrl(v string) *CaSignFileResult {
	s.HttpFileUrl = &v
	return s
}

// 签署人信息
type CaSignUserInfoRequest struct {
	// 用户类型个人:PERSON 机构:ORG
	SignUserType *string `json:"sign_user_type,omitempty" xml:"sign_user_type,omitempty" require:"true"`
	// 签署方名称，个人传真实姓名：张三 机构传机构正确的名称：xxx责任有限公司
	SignerName *string `json:"signer_name,omitempty" xml:"signer_name,omitempty" require:"true"`
	// 授权签署时的签署人证件类型,签署方证件类型 CRED_PSN_CH_IDCARD(大陆身份证) CRED_ORG_USCC(统一社会信用代码)
	SignerCertType *string `json:"signer_cert_type,omitempty" xml:"signer_cert_type,omitempty" require:"true"`
	// 签署方证件号码,签署方证件号码： 个人传递身份证件号 企业传递统一社会信用编码
	SignerCertNumber *string `json:"signer_cert_number,omitempty" xml:"signer_cert_number,omitempty" require:"true"`
	// 企业子类型,signUserType为org时必选 企业子类型 * BUS("BUS", "企业"), * SINGLE("SINGLE", "个体工商户"), * GOV("GOV", "党政机关"), * INST("INST", "事业单位"), * COMMON("COMMON", "社会组织"), * OTHER("OTHER", "其他组织")
	SignSubType *string `json:"sign_sub_type,omitempty" xml:"sign_sub_type,omitempty"`
	// 是否指定授权人签署
	Authorized *string `json:"authorized,omitempty" xml:"authorized,omitempty"`
	// authorized=1时必填,签署方名称
	AuthSignerName *string `json:"auth_signer_name,omitempty" xml:"auth_signer_name,omitempty"`
	// authorized=1 时必填,授权签署时的签署人证件类型
	AuthSignerCertType *string `json:"auth_signer_cert_type,omitempty" xml:"auth_signer_cert_type,omitempty"`
	// authorized=1 时必填,授权签署方证件号码
	AuthSignerCertNumber *string `json:"auth_signer_cert_number,omitempty" xml:"auth_signer_cert_number,omitempty"`
	// 手机号，用于发送签署短信
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 邮箱联系方式
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 签署顺序，默认-1无签署顺序
	Order *string `json:"order,omitempty" xml:"order,omitempty"`
	// 是否自动签署,ture为需要自动签署，false为手动签署
	AutoSign *bool `json:"auto_sign,omitempty" xml:"auto_sign,omitempty" require:"true"`
	// 签署文件列表（包含印模和签署区域）
	SystemSignFileRequestList []*CaSystemSignFileRequest `json:"system_sign_file_request_list,omitempty" xml:"system_sign_file_request_list,omitempty" require:"true" type:"Repeated"`
}

func (s CaSignUserInfoRequest) String() string {
	return tea.Prettify(s)
}

func (s CaSignUserInfoRequest) GoString() string {
	return s.String()
}

func (s *CaSignUserInfoRequest) SetSignUserType(v string) *CaSignUserInfoRequest {
	s.SignUserType = &v
	return s
}

func (s *CaSignUserInfoRequest) SetSignerName(v string) *CaSignUserInfoRequest {
	s.SignerName = &v
	return s
}

func (s *CaSignUserInfoRequest) SetSignerCertType(v string) *CaSignUserInfoRequest {
	s.SignerCertType = &v
	return s
}

func (s *CaSignUserInfoRequest) SetSignerCertNumber(v string) *CaSignUserInfoRequest {
	s.SignerCertNumber = &v
	return s
}

func (s *CaSignUserInfoRequest) SetSignSubType(v string) *CaSignUserInfoRequest {
	s.SignSubType = &v
	return s
}

func (s *CaSignUserInfoRequest) SetAuthorized(v string) *CaSignUserInfoRequest {
	s.Authorized = &v
	return s
}

func (s *CaSignUserInfoRequest) SetAuthSignerName(v string) *CaSignUserInfoRequest {
	s.AuthSignerName = &v
	return s
}

func (s *CaSignUserInfoRequest) SetAuthSignerCertType(v string) *CaSignUserInfoRequest {
	s.AuthSignerCertType = &v
	return s
}

func (s *CaSignUserInfoRequest) SetAuthSignerCertNumber(v string) *CaSignUserInfoRequest {
	s.AuthSignerCertNumber = &v
	return s
}

func (s *CaSignUserInfoRequest) SetMobile(v string) *CaSignUserInfoRequest {
	s.Mobile = &v
	return s
}

func (s *CaSignUserInfoRequest) SetEmail(v string) *CaSignUserInfoRequest {
	s.Email = &v
	return s
}

func (s *CaSignUserInfoRequest) SetOrder(v string) *CaSignUserInfoRequest {
	s.Order = &v
	return s
}

func (s *CaSignUserInfoRequest) SetAutoSign(v bool) *CaSignUserInfoRequest {
	s.AutoSign = &v
	return s
}

func (s *CaSignUserInfoRequest) SetSystemSignFileRequestList(v []*CaSystemSignFileRequest) *CaSignUserInfoRequest {
	s.SystemSignFileRequestList = v
	return s
}

// 签署人状态
type CaSignOperatorResult struct {
	// 签署方UserId
	SignUserId *string `json:"sign_user_id,omitempty" xml:"sign_user_id,omitempty" require:"true"`
	// 签署方证件号
	SignCertNo *string `json:"sign_cert_no,omitempty" xml:"sign_cert_no,omitempty"`
	// 签署方证件名称
	SignCertName *string `json:"sign_cert_name,omitempty" xml:"sign_cert_name,omitempty" require:"true"`
	// 签署方证件类型
	SignCertType *string `json:"sign_cert_type,omitempty" xml:"sign_cert_type,omitempty"`
	// 是否授权
	Authorized *int64 `json:"authorized,omitempty" xml:"authorized,omitempty"`
	// 授权时间
	AuthorizeTime *string `json:"authorize_time,omitempty" xml:"authorize_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 授权人证件号码
	AuthPersonCertNo *string `json:"auth_person_cert_no,omitempty" xml:"auth_person_cert_no,omitempty"`
	// 授权人证件名称
	AuthPersonCertName *string `json:"auth_person_cert_name,omitempty" xml:"auth_person_cert_name,omitempty"`
	// 授权人证件类型
	AuthPersonCertType *string `json:"auth_person_cert_type,omitempty" xml:"auth_person_cert_type,omitempty"`
	// 签署失败原因
	FailInfo *string `json:"fail_info,omitempty" xml:"fail_info,omitempty"`
	// SIGNNED
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 签署时间
	SignTime *string `json:"sign_time,omitempty" xml:"sign_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 是否我方公司
	OurCorp *int64 `json:"our_corp,omitempty" xml:"our_corp,omitempty"`
	// 电话联系方式，脱敏显示
	MobileNumber *string `json:"mobile_number,omitempty" xml:"mobile_number,omitempty"`
	// 邮件联系地址，脱敏展示返回
	EmailAddress *string `json:"email_address,omitempty" xml:"email_address,omitempty"`
}

func (s CaSignOperatorResult) String() string {
	return tea.Prettify(s)
}

func (s CaSignOperatorResult) GoString() string {
	return s.String()
}

func (s *CaSignOperatorResult) SetSignUserId(v string) *CaSignOperatorResult {
	s.SignUserId = &v
	return s
}

func (s *CaSignOperatorResult) SetSignCertNo(v string) *CaSignOperatorResult {
	s.SignCertNo = &v
	return s
}

func (s *CaSignOperatorResult) SetSignCertName(v string) *CaSignOperatorResult {
	s.SignCertName = &v
	return s
}

func (s *CaSignOperatorResult) SetSignCertType(v string) *CaSignOperatorResult {
	s.SignCertType = &v
	return s
}

func (s *CaSignOperatorResult) SetAuthorized(v int64) *CaSignOperatorResult {
	s.Authorized = &v
	return s
}

func (s *CaSignOperatorResult) SetAuthorizeTime(v string) *CaSignOperatorResult {
	s.AuthorizeTime = &v
	return s
}

func (s *CaSignOperatorResult) SetAuthPersonCertNo(v string) *CaSignOperatorResult {
	s.AuthPersonCertNo = &v
	return s
}

func (s *CaSignOperatorResult) SetAuthPersonCertName(v string) *CaSignOperatorResult {
	s.AuthPersonCertName = &v
	return s
}

func (s *CaSignOperatorResult) SetAuthPersonCertType(v string) *CaSignOperatorResult {
	s.AuthPersonCertType = &v
	return s
}

func (s *CaSignOperatorResult) SetFailInfo(v string) *CaSignOperatorResult {
	s.FailInfo = &v
	return s
}

func (s *CaSignOperatorResult) SetStatus(v string) *CaSignOperatorResult {
	s.Status = &v
	return s
}

func (s *CaSignOperatorResult) SetSignTime(v string) *CaSignOperatorResult {
	s.SignTime = &v
	return s
}

func (s *CaSignOperatorResult) SetOurCorp(v int64) *CaSignOperatorResult {
	s.OurCorp = &v
	return s
}

func (s *CaSignOperatorResult) SetMobileNumber(v string) *CaSignOperatorResult {
	s.MobileNumber = &v
	return s
}

func (s *CaSignOperatorResult) SetEmailAddress(v string) *CaSignOperatorResult {
	s.EmailAddress = &v
	return s
}

// 签署链接结果
type CaSignUrlResult struct {
	// 签署方名称
	SignCertName *string `json:"sign_cert_name,omitempty" xml:"sign_cert_name,omitempty"`
	// 签署方证件号（脱敏）
	SignCertNo *string `json:"sign_cert_no,omitempty" xml:"sign_cert_no,omitempty"`
	// 签署方id
	SignUserId *string `json:"sign_user_id,omitempty" xml:"sign_user_id,omitempty"`
	// 加密后的签署方证件号(用来关联签署方的签署链接)
	EncryptSignCertNo *string `json:"encrypt_sign_cert_no,omitempty" xml:"encrypt_sign_cert_no,omitempty"`
	// 签署链接
	SignUrl *string `json:"sign_url,omitempty" xml:"sign_url,omitempty"`
}

func (s CaSignUrlResult) String() string {
	return tea.Prettify(s)
}

func (s CaSignUrlResult) GoString() string {
	return s.String()
}

func (s *CaSignUrlResult) SetSignCertName(v string) *CaSignUrlResult {
	s.SignCertName = &v
	return s
}

func (s *CaSignUrlResult) SetSignCertNo(v string) *CaSignUrlResult {
	s.SignCertNo = &v
	return s
}

func (s *CaSignUrlResult) SetSignUserId(v string) *CaSignUrlResult {
	s.SignUserId = &v
	return s
}

func (s *CaSignUrlResult) SetEncryptSignCertNo(v string) *CaSignUrlResult {
	s.EncryptSignCertNo = &v
	return s
}

func (s *CaSignUrlResult) SetSignUrl(v string) *CaSignUrlResult {
	s.SignUrl = &v
	return s
}

// 签署链接类
type SignUrlResp struct {
	// 0-企业 1-用户
	Type *int64 `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 企业名称或用户姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 社会信用代码或身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 手动签署url（长链接）
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 手动签署url(端链接)
	ShortUrl *string `json:"short_url,omitempty" xml:"short_url,omitempty"`
	// 电子合同签署区id
	SignFiledId *string `json:"sign_filed_id,omitempty" xml:"sign_filed_id,omitempty" require:"true"`
}

func (s SignUrlResp) String() string {
	return tea.Prettify(s)
}

func (s SignUrlResp) GoString() string {
	return s.String()
}

func (s *SignUrlResp) SetType(v int64) *SignUrlResp {
	s.Type = &v
	return s
}

func (s *SignUrlResp) SetName(v string) *SignUrlResp {
	s.Name = &v
	return s
}

func (s *SignUrlResp) SetCertNo(v string) *SignUrlResp {
	s.CertNo = &v
	return s
}

func (s *SignUrlResp) SetUrl(v string) *SignUrlResp {
	s.Url = &v
	return s
}

func (s *SignUrlResp) SetShortUrl(v string) *SignUrlResp {
	s.ShortUrl = &v
	return s
}

func (s *SignUrlResp) SetSignFiledId(v string) *SignUrlResp {
	s.SignFiledId = &v
	return s
}

// 退保失败订单信息
type FailOrderInfo struct {
	// 退保失败订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 失败原因
	FailReason *string `json:"fail_reason,omitempty" xml:"fail_reason,omitempty" require:"true"`
}

func (s FailOrderInfo) String() string {
	return tea.Prettify(s)
}

func (s FailOrderInfo) GoString() string {
	return s.String()
}

func (s *FailOrderInfo) SetOrderNo(v string) *FailOrderInfo {
	s.OrderNo = &v
	return s
}

func (s *FailOrderInfo) SetFailReason(v string) *FailOrderInfo {
	s.FailReason = &v
	return s
}

// 用户签署信息
type SignUserInfo struct {
	// 身份证号
	IdNumber *string `json:"id_number,omitempty" xml:"id_number,omitempty" require:"true"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 签署区列表
	SignAreaList []*SignatoryInfo `json:"sign_area_list,omitempty" xml:"sign_area_list,omitempty" require:"true" type:"Repeated"`
}

func (s SignUserInfo) String() string {
	return tea.Prettify(s)
}

func (s SignUserInfo) GoString() string {
	return s.String()
}

func (s *SignUserInfo) SetIdNumber(v string) *SignUserInfo {
	s.IdNumber = &v
	return s
}

func (s *SignUserInfo) SetName(v string) *SignUserInfo {
	s.Name = &v
	return s
}

func (s *SignUserInfo) SetSignAreaList(v []*SignatoryInfo) *SignUserInfo {
	s.SignAreaList = v
	return s
}

// 签署发起返回类
type ContractSignResponse struct {
	// 流程id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	// 签署链接数组
	SignUrlList []*SignUrlResp `json:"sign_url_list,omitempty" xml:"sign_url_list,omitempty" require:"true" type:"Repeated"`
}

func (s ContractSignResponse) String() string {
	return tea.Prettify(s)
}

func (s ContractSignResponse) GoString() string {
	return s.String()
}

func (s *ContractSignResponse) SetFlowId(v string) *ContractSignResponse {
	s.FlowId = &v
	return s
}

func (s *ContractSignResponse) SetSignUrlList(v []*SignUrlResp) *ContractSignResponse {
	s.SignUrlList = v
	return s
}

// 保险产品类
type InsureProductInfo struct {
	// 产品名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 产品id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty" require:"true"`
	// 险种编码:
	// ACCIDENT: 意外险
	// EMPLOYER: 雇主险
	InsuranceTypeCode *string `json:"insurance_type_code,omitempty" xml:"insurance_type_code,omitempty" require:"true"`
	// 推荐编码
	RecomFlowNo *string `json:"recom_flow_no,omitempty" xml:"recom_flow_no,omitempty"`
	// 最低价格（分）
	Premium *int64 `json:"premium,omitempty" xml:"premium,omitempty"`
	// 保额（分）
	SumInsured *int64 `json:"sum_insured,omitempty" xml:"sum_insured,omitempty"`
}

func (s InsureProductInfo) String() string {
	return tea.Prettify(s)
}

func (s InsureProductInfo) GoString() string {
	return s.String()
}

func (s *InsureProductInfo) SetName(v string) *InsureProductInfo {
	s.Name = &v
	return s
}

func (s *InsureProductInfo) SetProductId(v string) *InsureProductInfo {
	s.ProductId = &v
	return s
}

func (s *InsureProductInfo) SetInsuranceTypeCode(v string) *InsureProductInfo {
	s.InsuranceTypeCode = &v
	return s
}

func (s *InsureProductInfo) SetRecomFlowNo(v string) *InsureProductInfo {
	s.RecomFlowNo = &v
	return s
}

func (s *InsureProductInfo) SetPremium(v int64) *InsureProductInfo {
	s.Premium = &v
	return s
}

func (s *InsureProductInfo) SetSumInsured(v int64) *InsureProductInfo {
	s.SumInsured = &v
	return s
}

// 用印子任务受理流水
type CaSubSignResult struct {
	// 子业务流水号
	SubBizNo *string `json:"sub_biz_no,omitempty" xml:"sub_biz_no,omitempty"`
	// 子任务id
	SignTaskId *string `json:"sign_task_id,omitempty" xml:"sign_task_id,omitempty"`
	// 我方签署方id
	OurUserId *string `json:"our_user_id,omitempty" xml:"our_user_id,omitempty"`
	// 是否关联业务 true:关联 false：不关联
	RelatedBusiness *bool `json:"related_business,omitempty" xml:"related_business,omitempty"`
	// 签署链接结果列表
	CaSignUrlResultList []*CaSignUrlResult `json:"ca_sign_url_result_list,omitempty" xml:"ca_sign_url_result_list,omitempty" type:"Repeated"`
}

func (s CaSubSignResult) String() string {
	return tea.Prettify(s)
}

func (s CaSubSignResult) GoString() string {
	return s.String()
}

func (s *CaSubSignResult) SetSubBizNo(v string) *CaSubSignResult {
	s.SubBizNo = &v
	return s
}

func (s *CaSubSignResult) SetSignTaskId(v string) *CaSubSignResult {
	s.SignTaskId = &v
	return s
}

func (s *CaSubSignResult) SetOurUserId(v string) *CaSubSignResult {
	s.OurUserId = &v
	return s
}

func (s *CaSubSignResult) SetRelatedBusiness(v bool) *CaSubSignResult {
	s.RelatedBusiness = &v
	return s
}

func (s *CaSubSignResult) SetCaSignUrlResultList(v []*CaSignUrlResult) *CaSubSignResult {
	s.CaSignUrlResultList = v
	return s
}

// 模板填充字段实体
type TemplateFieldConfigRequest struct {
	// 字段拥有者（1个人，2客户，3人资服务商）
	Type *int64 `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 字段名称（英文：identityName、identityNumber、phoneNumber、positionName、salary、salaryNumber、examineStandard、projectDesc）
	FieldName *string `json:"field_name,omitempty" xml:"field_name,omitempty" require:"true"`
	// 字段名称描述（中文名：姓名、身份证号、手机号、职位、薪资、薪数、考核标准、项目描述）
	FieldNameDesc *string `json:"field_name_desc,omitempty" xml:"field_name_desc,omitempty" require:"true"`
	// 字段值
	FieldValue *string `json:"field_value,omitempty" xml:"field_value,omitempty" require:"true"`
}

func (s TemplateFieldConfigRequest) String() string {
	return tea.Prettify(s)
}

func (s TemplateFieldConfigRequest) GoString() string {
	return s.String()
}

func (s *TemplateFieldConfigRequest) SetType(v int64) *TemplateFieldConfigRequest {
	s.Type = &v
	return s
}

func (s *TemplateFieldConfigRequest) SetFieldName(v string) *TemplateFieldConfigRequest {
	s.FieldName = &v
	return s
}

func (s *TemplateFieldConfigRequest) SetFieldNameDesc(v string) *TemplateFieldConfigRequest {
	s.FieldNameDesc = &v
	return s
}

func (s *TemplateFieldConfigRequest) SetFieldValue(v string) *TemplateFieldConfigRequest {
	s.FieldValue = &v
	return s
}

// 签署任务结果
type CaSignTaskResult struct {
	// 子任务流水号
	SubBizNo *string `json:"sub_biz_no,omitempty" xml:"sub_biz_no,omitempty" require:"true"`
	// 签署子任务id
	SignTaskId *string `json:"sign_task_id,omitempty" xml:"sign_task_id,omitempty" require:"true"`
	// 签署子任务的状态
	SignTaskStatus *string `json:"sign_task_status,omitempty" xml:"sign_task_status,omitempty"`
	// 签署完成的文件列表
	SignFileResultList []*CaSignFileResult `json:"sign_file_result_list,omitempty" xml:"sign_file_result_list,omitempty" type:"Repeated"`
	// 签署人状态列表
	SignOperatorResultList []*CaSignOperatorResult `json:"sign_operator_result_list,omitempty" xml:"sign_operator_result_list,omitempty" type:"Repeated"`
}

func (s CaSignTaskResult) String() string {
	return tea.Prettify(s)
}

func (s CaSignTaskResult) GoString() string {
	return s.String()
}

func (s *CaSignTaskResult) SetSubBizNo(v string) *CaSignTaskResult {
	s.SubBizNo = &v
	return s
}

func (s *CaSignTaskResult) SetSignTaskId(v string) *CaSignTaskResult {
	s.SignTaskId = &v
	return s
}

func (s *CaSignTaskResult) SetSignTaskStatus(v string) *CaSignTaskResult {
	s.SignTaskStatus = &v
	return s
}

func (s *CaSignTaskResult) SetSignFileResultList(v []*CaSignFileResult) *CaSignTaskResult {
	s.SignFileResultList = v
	return s
}

func (s *CaSignTaskResult) SetSignOperatorResultList(v []*CaSignOperatorResult) *CaSignTaskResult {
	s.SignOperatorResultList = v
	return s
}

// 签署任务信息
type CaSignTaskRequest struct {
	// 子业务流水号
	SubBizNo *string `json:"sub_biz_no,omitempty" xml:"sub_biz_no,omitempty" require:"true"`
	// 任务描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 签署人信息
	SignUserInfoRequestList []*CaSignUserInfoRequest `json:"sign_user_info_request_list,omitempty" xml:"sign_user_info_request_list,omitempty" require:"true" type:"Repeated"`
	// 待签署文件列表
	SignFileRequestList []*CaSignFileRequest `json:"sign_file_request_list,omitempty" xml:"sign_file_request_list,omitempty" type:"Repeated"`
}

func (s CaSignTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s CaSignTaskRequest) GoString() string {
	return s.String()
}

func (s *CaSignTaskRequest) SetSubBizNo(v string) *CaSignTaskRequest {
	s.SubBizNo = &v
	return s
}

func (s *CaSignTaskRequest) SetDescription(v string) *CaSignTaskRequest {
	s.Description = &v
	return s
}

func (s *CaSignTaskRequest) SetSignUserInfoRequestList(v []*CaSignUserInfoRequest) *CaSignTaskRequest {
	s.SignUserInfoRequestList = v
	return s
}

func (s *CaSignTaskRequest) SetSignFileRequestList(v []*CaSignFileRequest) *CaSignTaskRequest {
	s.SignFileRequestList = v
	return s
}

// 员工信息
type InsureEmployeeInfo struct {
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 额外信息
	ExtraMsg *string `json:"extra_msg,omitempty" xml:"extra_msg,omitempty" require:"true"`
}

func (s InsureEmployeeInfo) String() string {
	return tea.Prettify(s)
}

func (s InsureEmployeeInfo) GoString() string {
	return s.String()
}

func (s *InsureEmployeeInfo) SetName(v string) *InsureEmployeeInfo {
	s.Name = &v
	return s
}

func (s *InsureEmployeeInfo) SetCertNo(v string) *InsureEmployeeInfo {
	s.CertNo = &v
	return s
}

func (s *InsureEmployeeInfo) SetMobile(v string) *InsureEmployeeInfo {
	s.Mobile = &v
	return s
}

func (s *InsureEmployeeInfo) SetExtraMsg(v string) *InsureEmployeeInfo {
	s.ExtraMsg = &v
	return s
}

// 签约企业信息
type SignEnterpriseInfo struct {
	// 公司名称
	OrganizationName *string `json:"organization_name,omitempty" xml:"organization_name,omitempty" require:"true"`
	// 社会统一信用代码
	Uscc *string `json:"uscc,omitempty" xml:"uscc,omitempty" require:"true"`
	// 法人姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 法人身份证号码
	IdNumber *string `json:"id_number,omitempty" xml:"id_number,omitempty" require:"true"`
	// 签署模式0、自动签署1、手动签署（用户只能手动）
	//
	SignType *int64 `json:"sign_type,omitempty" xml:"sign_type,omitempty" require:"true"`
	// 签署区列表
	SignAreaList []*SignatoryInfo `json:"sign_area_list,omitempty" xml:"sign_area_list,omitempty" require:"true" type:"Repeated"`
}

func (s SignEnterpriseInfo) String() string {
	return tea.Prettify(s)
}

func (s SignEnterpriseInfo) GoString() string {
	return s.String()
}

func (s *SignEnterpriseInfo) SetOrganizationName(v string) *SignEnterpriseInfo {
	s.OrganizationName = &v
	return s
}

func (s *SignEnterpriseInfo) SetUscc(v string) *SignEnterpriseInfo {
	s.Uscc = &v
	return s
}

func (s *SignEnterpriseInfo) SetName(v string) *SignEnterpriseInfo {
	s.Name = &v
	return s
}

func (s *SignEnterpriseInfo) SetIdNumber(v string) *SignEnterpriseInfo {
	s.IdNumber = &v
	return s
}

func (s *SignEnterpriseInfo) SetSignType(v int64) *SignEnterpriseInfo {
	s.SignType = &v
	return s
}

func (s *SignEnterpriseInfo) SetSignAreaList(v []*SignatoryInfo) *SignEnterpriseInfo {
	s.SignAreaList = v
	return s
}

// 键值对
type XNameValuePair struct {
	// 键名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 键值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s XNameValuePair) String() string {
	return tea.Prettify(s)
}

func (s XNameValuePair) GoString() string {
	return s.String()
}

func (s *XNameValuePair) SetName(v string) *XNameValuePair {
	s.Name = &v
	return s
}

func (s *XNameValuePair) SetValue(v string) *XNameValuePair {
	s.Value = &v
	return s
}

type SignAntsaasStaffingcContractSendRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 需要确保唯一（定位订单）
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty" require:"true"`
	// 合同或模版文件
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 合同类型（1合同文件 2合同模板）
	ContractType *int64 `json:"contract_type,omitempty" xml:"contract_type,omitempty" require:"true"`
	// 合同名称, 必须带上文件名后缀。 .dpf .doc .docx
	ContractName *string `json:"contract_name,omitempty" xml:"contract_name,omitempty" require:"true"`
	// 合同文件类型 （pdf、word）
	ContractFileType *string `json:"contract_file_type,omitempty" xml:"contract_file_type,omitempty" require:"true"`
	// 合同模版参数，json格式，以key value格式存储，合同类型属于模板必填
	SimpleFormFields *string `json:"simple_form_fields,omitempty" xml:"simple_form_fields,omitempty"`
	// 签署平台（ALIPAY或H5）
	SignPlatform *string `json:"sign_platform,omitempty" xml:"sign_platform,omitempty" require:"true"`
	// 合同用户信息列表
	SignUserList []*SignUserInfo `json:"sign_user_list,omitempty" xml:"sign_user_list,omitempty" require:"true" type:"Repeated"`
	// 合同企业信息列表
	SignEnterpriseList []*SignEnterpriseInfo `json:"sign_enterprise_list,omitempty" xml:"sign_enterprise_list,omitempty" require:"true" type:"Repeated"`
}

func (s SignAntsaasStaffingcContractSendRequest) String() string {
	return tea.Prettify(s)
}

func (s SignAntsaasStaffingcContractSendRequest) GoString() string {
	return s.String()
}

func (s *SignAntsaasStaffingcContractSendRequest) SetAuthToken(v string) *SignAntsaasStaffingcContractSendRequest {
	s.AuthToken = &v
	return s
}

func (s *SignAntsaasStaffingcContractSendRequest) SetProductInstanceId(v string) *SignAntsaasStaffingcContractSendRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SignAntsaasStaffingcContractSendRequest) SetOutBizNo(v string) *SignAntsaasStaffingcContractSendRequest {
	s.OutBizNo = &v
	return s
}

func (s *SignAntsaasStaffingcContractSendRequest) SetFileObject(v io.Reader) *SignAntsaasStaffingcContractSendRequest {
	s.FileObject = v
	return s
}

func (s *SignAntsaasStaffingcContractSendRequest) SetFileObjectName(v string) *SignAntsaasStaffingcContractSendRequest {
	s.FileObjectName = &v
	return s
}

func (s *SignAntsaasStaffingcContractSendRequest) SetFileId(v string) *SignAntsaasStaffingcContractSendRequest {
	s.FileId = &v
	return s
}

func (s *SignAntsaasStaffingcContractSendRequest) SetContractType(v int64) *SignAntsaasStaffingcContractSendRequest {
	s.ContractType = &v
	return s
}

func (s *SignAntsaasStaffingcContractSendRequest) SetContractName(v string) *SignAntsaasStaffingcContractSendRequest {
	s.ContractName = &v
	return s
}

func (s *SignAntsaasStaffingcContractSendRequest) SetContractFileType(v string) *SignAntsaasStaffingcContractSendRequest {
	s.ContractFileType = &v
	return s
}

func (s *SignAntsaasStaffingcContractSendRequest) SetSimpleFormFields(v string) *SignAntsaasStaffingcContractSendRequest {
	s.SimpleFormFields = &v
	return s
}

func (s *SignAntsaasStaffingcContractSendRequest) SetSignPlatform(v string) *SignAntsaasStaffingcContractSendRequest {
	s.SignPlatform = &v
	return s
}

func (s *SignAntsaasStaffingcContractSendRequest) SetSignUserList(v []*SignUserInfo) *SignAntsaasStaffingcContractSendRequest {
	s.SignUserList = v
	return s
}

func (s *SignAntsaasStaffingcContractSendRequest) SetSignEnterpriseList(v []*SignEnterpriseInfo) *SignAntsaasStaffingcContractSendRequest {
	s.SignEnterpriseList = v
	return s
}

type SignAntsaasStaffingcContractSendResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发起签约返回结果
	Response *ContractSignResponse `json:"response,omitempty" xml:"response,omitempty"`
}

func (s SignAntsaasStaffingcContractSendResponse) String() string {
	return tea.Prettify(s)
}

func (s SignAntsaasStaffingcContractSendResponse) GoString() string {
	return s.String()
}

func (s *SignAntsaasStaffingcContractSendResponse) SetReqMsgId(v string) *SignAntsaasStaffingcContractSendResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SignAntsaasStaffingcContractSendResponse) SetResultCode(v string) *SignAntsaasStaffingcContractSendResponse {
	s.ResultCode = &v
	return s
}

func (s *SignAntsaasStaffingcContractSendResponse) SetResultMsg(v string) *SignAntsaasStaffingcContractSendResponse {
	s.ResultMsg = &v
	return s
}

func (s *SignAntsaasStaffingcContractSendResponse) SetResponse(v *ContractSignResponse) *SignAntsaasStaffingcContractSendResponse {
	s.Response = v
	return s
}

type QueryAntsaasStaffingcContractSignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 流程id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
}

func (s QueryAntsaasStaffingcContractSignRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntsaasStaffingcContractSignRequest) GoString() string {
	return s.String()
}

func (s *QueryAntsaasStaffingcContractSignRequest) SetAuthToken(v string) *QueryAntsaasStaffingcContractSignRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntsaasStaffingcContractSignRequest) SetProductInstanceId(v string) *QueryAntsaasStaffingcContractSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntsaasStaffingcContractSignRequest) SetFlowId(v string) *QueryAntsaasStaffingcContractSignRequest {
	s.FlowId = &v
	return s
}

type QueryAntsaasStaffingcContractSignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 流程id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 文件有效截止日期
	ContractValidity *int64 `json:"contract_validity,omitempty" xml:"contract_validity,omitempty"`
	// 流程描述
	FlowDesc *string `json:"flow_desc,omitempty" xml:"flow_desc,omitempty"`
	// 流程开始时间
	FlowStartTime *string `json:"flow_start_time,omitempty" xml:"flow_start_time,omitempty"`
	// 流程结束时间
	FlowEndTime *string `json:"flow_end_time,omitempty" xml:"flow_end_time,omitempty"`
	// 流程状态（0-草稿、1-签署中、2-完成、3-撤销、4-终止、5-过期、6-删除、7-拒签）
	FlowStatus *int64 `json:"flow_status,omitempty" xml:"flow_status,omitempty"`
	// 合同文件id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 合同文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// 合同文件下载地址（1小时内有效）
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty"`
	// 如果未签署，将返回签署链接
	SignUrlList []*SignUrlResp `json:"sign_url_list,omitempty" xml:"sign_url_list,omitempty" type:"Repeated"`
}

func (s QueryAntsaasStaffingcContractSignResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntsaasStaffingcContractSignResponse) GoString() string {
	return s.String()
}

func (s *QueryAntsaasStaffingcContractSignResponse) SetReqMsgId(v string) *QueryAntsaasStaffingcContractSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntsaasStaffingcContractSignResponse) SetResultCode(v string) *QueryAntsaasStaffingcContractSignResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntsaasStaffingcContractSignResponse) SetResultMsg(v string) *QueryAntsaasStaffingcContractSignResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntsaasStaffingcContractSignResponse) SetFlowId(v string) *QueryAntsaasStaffingcContractSignResponse {
	s.FlowId = &v
	return s
}

func (s *QueryAntsaasStaffingcContractSignResponse) SetContractValidity(v int64) *QueryAntsaasStaffingcContractSignResponse {
	s.ContractValidity = &v
	return s
}

func (s *QueryAntsaasStaffingcContractSignResponse) SetFlowDesc(v string) *QueryAntsaasStaffingcContractSignResponse {
	s.FlowDesc = &v
	return s
}

func (s *QueryAntsaasStaffingcContractSignResponse) SetFlowStartTime(v string) *QueryAntsaasStaffingcContractSignResponse {
	s.FlowStartTime = &v
	return s
}

func (s *QueryAntsaasStaffingcContractSignResponse) SetFlowEndTime(v string) *QueryAntsaasStaffingcContractSignResponse {
	s.FlowEndTime = &v
	return s
}

func (s *QueryAntsaasStaffingcContractSignResponse) SetFlowStatus(v int64) *QueryAntsaasStaffingcContractSignResponse {
	s.FlowStatus = &v
	return s
}

func (s *QueryAntsaasStaffingcContractSignResponse) SetFileId(v string) *QueryAntsaasStaffingcContractSignResponse {
	s.FileId = &v
	return s
}

func (s *QueryAntsaasStaffingcContractSignResponse) SetFileName(v string) *QueryAntsaasStaffingcContractSignResponse {
	s.FileName = &v
	return s
}

func (s *QueryAntsaasStaffingcContractSignResponse) SetFileUrl(v string) *QueryAntsaasStaffingcContractSignResponse {
	s.FileUrl = &v
	return s
}

func (s *QueryAntsaasStaffingcContractSignResponse) SetSignUrlList(v []*SignUrlResp) *QueryAntsaasStaffingcContractSignResponse {
	s.SignUrlList = v
	return s
}

type QueryAntsaasStaffingcEpcertificationUrlRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 一次认证的唯一标识,在商户调用认证初始化接口的时候获取
	// (如果接口创建接口发生未知异常，可使用out_biz_no替代，查询状态）
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
}

func (s QueryAntsaasStaffingcEpcertificationUrlRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntsaasStaffingcEpcertificationUrlRequest) GoString() string {
	return s.String()
}

func (s *QueryAntsaasStaffingcEpcertificationUrlRequest) SetAuthToken(v string) *QueryAntsaasStaffingcEpcertificationUrlRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntsaasStaffingcEpcertificationUrlRequest) SetProductInstanceId(v string) *QueryAntsaasStaffingcEpcertificationUrlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntsaasStaffingcEpcertificationUrlRequest) SetBizNo(v string) *QueryAntsaasStaffingcEpcertificationUrlRequest {
	s.BizNo = &v
	return s
}

type QueryAntsaasStaffingcEpcertificationUrlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// // 响应为表单格式，可嵌入页面，具体以返回的结果为准
	ResultBody *string `json:"result_body,omitempty" xml:"result_body,omitempty"`
	// 订单号（但入参为out_biz_no时传入）
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
}

func (s QueryAntsaasStaffingcEpcertificationUrlResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntsaasStaffingcEpcertificationUrlResponse) GoString() string {
	return s.String()
}

func (s *QueryAntsaasStaffingcEpcertificationUrlResponse) SetReqMsgId(v string) *QueryAntsaasStaffingcEpcertificationUrlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntsaasStaffingcEpcertificationUrlResponse) SetResultCode(v string) *QueryAntsaasStaffingcEpcertificationUrlResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntsaasStaffingcEpcertificationUrlResponse) SetResultMsg(v string) *QueryAntsaasStaffingcEpcertificationUrlResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntsaasStaffingcEpcertificationUrlResponse) SetResultBody(v string) *QueryAntsaasStaffingcEpcertificationUrlResponse {
	s.ResultBody = &v
	return s
}

func (s *QueryAntsaasStaffingcEpcertificationUrlResponse) SetBizNo(v string) *QueryAntsaasStaffingcEpcertificationUrlResponse {
	s.BizNo = &v
	return s
}

type CreateAntsaasStaffingcEpcertificationAuthorizeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 需要保证唯一，外部订单号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty" require:"true"`
	// 企业全称
	EpName *string `json:"ep_name,omitempty" xml:"ep_name,omitempty" require:"true"`
	// 统一社会信用代码或营业执照注册号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
	// 认证完成后，跳转到指定url地址
	ReturnUrl *string `json:"return_url,omitempty" xml:"return_url,omitempty"`
}

func (s CreateAntsaasStaffingcEpcertificationAuthorizeRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAntsaasStaffingcEpcertificationAuthorizeRequest) GoString() string {
	return s.String()
}

func (s *CreateAntsaasStaffingcEpcertificationAuthorizeRequest) SetAuthToken(v string) *CreateAntsaasStaffingcEpcertificationAuthorizeRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAntsaasStaffingcEpcertificationAuthorizeRequest) SetProductInstanceId(v string) *CreateAntsaasStaffingcEpcertificationAuthorizeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAntsaasStaffingcEpcertificationAuthorizeRequest) SetOutBizNo(v string) *CreateAntsaasStaffingcEpcertificationAuthorizeRequest {
	s.OutBizNo = &v
	return s
}

func (s *CreateAntsaasStaffingcEpcertificationAuthorizeRequest) SetEpName(v string) *CreateAntsaasStaffingcEpcertificationAuthorizeRequest {
	s.EpName = &v
	return s
}

func (s *CreateAntsaasStaffingcEpcertificationAuthorizeRequest) SetEpCertNo(v string) *CreateAntsaasStaffingcEpcertificationAuthorizeRequest {
	s.EpCertNo = &v
	return s
}

func (s *CreateAntsaasStaffingcEpcertificationAuthorizeRequest) SetReturnUrl(v string) *CreateAntsaasStaffingcEpcertificationAuthorizeRequest {
	s.ReturnUrl = &v
	return s
}

type CreateAntsaasStaffingcEpcertificationAuthorizeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 一次认证的唯一标识
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
}

func (s CreateAntsaasStaffingcEpcertificationAuthorizeResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAntsaasStaffingcEpcertificationAuthorizeResponse) GoString() string {
	return s.String()
}

func (s *CreateAntsaasStaffingcEpcertificationAuthorizeResponse) SetReqMsgId(v string) *CreateAntsaasStaffingcEpcertificationAuthorizeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAntsaasStaffingcEpcertificationAuthorizeResponse) SetResultCode(v string) *CreateAntsaasStaffingcEpcertificationAuthorizeResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAntsaasStaffingcEpcertificationAuthorizeResponse) SetResultMsg(v string) *CreateAntsaasStaffingcEpcertificationAuthorizeResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAntsaasStaffingcEpcertificationAuthorizeResponse) SetBizNo(v string) *CreateAntsaasStaffingcEpcertificationAuthorizeResponse {
	s.BizNo = &v
	return s
}

type QueryAntsaasStaffingcEpcertificationRiskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 一次认证的唯一标识,在调用认证初始化接口的时候获取
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// 企业全称
	EpName *string `json:"ep_name,omitempty" xml:"ep_name,omitempty" require:"true"`
	// 统一社会信用代码或营业执照注册号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
}

func (s QueryAntsaasStaffingcEpcertificationRiskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntsaasStaffingcEpcertificationRiskRequest) GoString() string {
	return s.String()
}

func (s *QueryAntsaasStaffingcEpcertificationRiskRequest) SetAuthToken(v string) *QueryAntsaasStaffingcEpcertificationRiskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntsaasStaffingcEpcertificationRiskRequest) SetProductInstanceId(v string) *QueryAntsaasStaffingcEpcertificationRiskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntsaasStaffingcEpcertificationRiskRequest) SetBizNo(v string) *QueryAntsaasStaffingcEpcertificationRiskRequest {
	s.BizNo = &v
	return s
}

func (s *QueryAntsaasStaffingcEpcertificationRiskRequest) SetEpName(v string) *QueryAntsaasStaffingcEpcertificationRiskRequest {
	s.EpName = &v
	return s
}

func (s *QueryAntsaasStaffingcEpcertificationRiskRequest) SetEpCertNo(v string) *QueryAntsaasStaffingcEpcertificationRiskRequest {
	s.EpCertNo = &v
	return s
}

type QueryAntsaasStaffingcEpcertificationRiskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证状态，取值如下： SUCCESS，代表成功 INIT，代表初始化 CERTIFYING，代表认证中 FAIL，代表失败
	CertifyStatus *string `json:"certify_status,omitempty" xml:"certify_status,omitempty"`
	// 授权状态，从用户授权开始计时，时间窗口3天 取值如下： SUCCESS，代表用户已授权 FAIL，代表用户未授权或授权失效
	AuthStatus *string `json:"auth_status,omitempty" xml:"auth_status,omitempty"`
	// 企业全称，字段auth_status为SUCCESS时返回
	EpName *string `json:"ep_name,omitempty" xml:"ep_name,omitempty"`
	// 统一社会信用代码或营业执照注册号，字段auth_status为SUCCESS时返回
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
	// 法人认证姓名，字段auth_status为SUCCESS时返回
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
	// 法人认证身份证号
	CertifyPersonCardNoPostfix *string `json:"certify_person_card_no_postfix,omitempty" xml:"certify_person_card_no_postfix,omitempty"`
	// 认证失败原因列表，当certify_status=FAIL时返回
	CertifyFailReasons []*string `json:"certify_fail_reasons,omitempty" xml:"certify_fail_reasons,omitempty" type:"Repeated"`
	// 认证风险识别结果集合
	// 枚举值
	// 低风险认证: CERTIFICATION_LOW_RISK
	// 中风险认证: CERTIFICATION_MID_RISK2
	// 高风险认证: CERTIFICATION_HIGH_RISK
	// 批量注册: ONE_ADDR_MULTI_COMP
	// 经营异常: OPERATION_ABNORMAL
	// 交叉任职: CROSS_POSITION
	// 涉嫌洗钱: SUSPECTED_MONEY_LAUNDERING
	// 空壳公司: SHELL_COMPANY
	// 失信被执行: BREACH_PROMISE_EXECUTION
	// 严重违法失信: SERIOUS_BREACH_TRUST
	// 行政处罚: ADMINISTRATIVE_SANCTION
	// 司法冻结: JUDICIAL_FREEZE
	// 违规违禁: VIOLATION_BAN
	// 信贷逾期: CREDIT_OVERDUE
	// 多头借贷: LONG_BORROWING
	// 疑似欺诈: SUSPECTED_FRAUD
	// 疑似涉赌博: SUSPECTED_GAMBLING
	// 企业芝麻证: LI_XIN_CERTIFICATE
	RiskIdentifyResult []*string `json:"risk_identify_result,omitempty" xml:"risk_identify_result,omitempty" type:"Repeated"`
	// 空壳企业等级，描述企业空壳程度。
	// 枚举值
	// 优秀企业，没有空壳企业的常见特征，且有很多正向特征证明其正常经营: A+
	// 较为优秀的企业，没有空壳企业的常见特征，且有较多正向特征证明其正常经营: A
	// 较为优秀的企业，几乎没有空壳企业的常见特征，或者有较多正向特征证明其正常经营: B
	// 普通企业，一般没有空壳企业的常见特征，或者有很少量能反映其正常经营的数据: M+
	// 普通企业或者新注册的企业，一般没有空壳企业的常见特征，但是也没有太多能反映其在正常生产经营的数据: M
	// 普通企业，一般没有明显空壳企业的常见特征，也没有太多能反映其在正常生产经营的数据，可能和空壳企业有少量交集: M-
	// 较差企业，有部分空壳企业特征，可能有较少能反映其在正常生产经营的数据。建议这部分企业酌情考虑风险: C+
	// 差企业，有较多空壳企业特征，几乎没有能反映其在正常生产经营的数据: C
	// 差企业，有很多明显空壳企业特征，几乎没有能反映其在正常生产经营的数据: D
	ShellCompanyLevel *string `json:"shell_company_level,omitempty" xml:"shell_company_level,omitempty"`
}

func (s QueryAntsaasStaffingcEpcertificationRiskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntsaasStaffingcEpcertificationRiskResponse) GoString() string {
	return s.String()
}

func (s *QueryAntsaasStaffingcEpcertificationRiskResponse) SetReqMsgId(v string) *QueryAntsaasStaffingcEpcertificationRiskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntsaasStaffingcEpcertificationRiskResponse) SetResultCode(v string) *QueryAntsaasStaffingcEpcertificationRiskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntsaasStaffingcEpcertificationRiskResponse) SetResultMsg(v string) *QueryAntsaasStaffingcEpcertificationRiskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntsaasStaffingcEpcertificationRiskResponse) SetCertifyStatus(v string) *QueryAntsaasStaffingcEpcertificationRiskResponse {
	s.CertifyStatus = &v
	return s
}

func (s *QueryAntsaasStaffingcEpcertificationRiskResponse) SetAuthStatus(v string) *QueryAntsaasStaffingcEpcertificationRiskResponse {
	s.AuthStatus = &v
	return s
}

func (s *QueryAntsaasStaffingcEpcertificationRiskResponse) SetEpName(v string) *QueryAntsaasStaffingcEpcertificationRiskResponse {
	s.EpName = &v
	return s
}

func (s *QueryAntsaasStaffingcEpcertificationRiskResponse) SetEpCertNo(v string) *QueryAntsaasStaffingcEpcertificationRiskResponse {
	s.EpCertNo = &v
	return s
}

func (s *QueryAntsaasStaffingcEpcertificationRiskResponse) SetUserName(v string) *QueryAntsaasStaffingcEpcertificationRiskResponse {
	s.UserName = &v
	return s
}

func (s *QueryAntsaasStaffingcEpcertificationRiskResponse) SetCertifyPersonCardNoPostfix(v string) *QueryAntsaasStaffingcEpcertificationRiskResponse {
	s.CertifyPersonCardNoPostfix = &v
	return s
}

func (s *QueryAntsaasStaffingcEpcertificationRiskResponse) SetCertifyFailReasons(v []*string) *QueryAntsaasStaffingcEpcertificationRiskResponse {
	s.CertifyFailReasons = v
	return s
}

func (s *QueryAntsaasStaffingcEpcertificationRiskResponse) SetRiskIdentifyResult(v []*string) *QueryAntsaasStaffingcEpcertificationRiskResponse {
	s.RiskIdentifyResult = v
	return s
}

func (s *QueryAntsaasStaffingcEpcertificationRiskResponse) SetShellCompanyLevel(v string) *QueryAntsaasStaffingcEpcertificationRiskResponse {
	s.ShellCompanyLevel = &v
	return s
}

type ApplyAntsaasStaffingcInsureSignurlRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业名称
	EnterpriseName *string `json:"enterprise_name,omitempty" xml:"enterprise_name,omitempty" require:"true"`
	// 社会信用代码
	SocialCreditCode *string `json:"social_credit_code,omitempty" xml:"social_credit_code,omitempty" require:"true"`
	// 签约支付宝账号（企业支付宝是邮箱）
	AuthAccount *string `json:"auth_account,omitempty" xml:"auth_account,omitempty" require:"true"`
	// 联系手机号（用于接收投保失败等短信通知）
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 外部业务号(64长度以内）
	//
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty" require:"true"`
}

func (s ApplyAntsaasStaffingcInsureSignurlRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyAntsaasStaffingcInsureSignurlRequest) GoString() string {
	return s.String()
}

func (s *ApplyAntsaasStaffingcInsureSignurlRequest) SetAuthToken(v string) *ApplyAntsaasStaffingcInsureSignurlRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyAntsaasStaffingcInsureSignurlRequest) SetProductInstanceId(v string) *ApplyAntsaasStaffingcInsureSignurlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyAntsaasStaffingcInsureSignurlRequest) SetEnterpriseName(v string) *ApplyAntsaasStaffingcInsureSignurlRequest {
	s.EnterpriseName = &v
	return s
}

func (s *ApplyAntsaasStaffingcInsureSignurlRequest) SetSocialCreditCode(v string) *ApplyAntsaasStaffingcInsureSignurlRequest {
	s.SocialCreditCode = &v
	return s
}

func (s *ApplyAntsaasStaffingcInsureSignurlRequest) SetAuthAccount(v string) *ApplyAntsaasStaffingcInsureSignurlRequest {
	s.AuthAccount = &v
	return s
}

func (s *ApplyAntsaasStaffingcInsureSignurlRequest) SetMobile(v string) *ApplyAntsaasStaffingcInsureSignurlRequest {
	s.Mobile = &v
	return s
}

func (s *ApplyAntsaasStaffingcInsureSignurlRequest) SetOutBizNo(v string) *ApplyAntsaasStaffingcInsureSignurlRequest {
	s.OutBizNo = &v
	return s
}

type ApplyAntsaasStaffingcInsureSignurlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签约地址
	SignUrl *string `json:"sign_url,omitempty" xml:"sign_url,omitempty"`
}

func (s ApplyAntsaasStaffingcInsureSignurlResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyAntsaasStaffingcInsureSignurlResponse) GoString() string {
	return s.String()
}

func (s *ApplyAntsaasStaffingcInsureSignurlResponse) SetReqMsgId(v string) *ApplyAntsaasStaffingcInsureSignurlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyAntsaasStaffingcInsureSignurlResponse) SetResultCode(v string) *ApplyAntsaasStaffingcInsureSignurlResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyAntsaasStaffingcInsureSignurlResponse) SetResultMsg(v string) *ApplyAntsaasStaffingcInsureSignurlResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyAntsaasStaffingcInsureSignurlResponse) SetSignUrl(v string) *ApplyAntsaasStaffingcInsureSignurlResponse {
	s.SignUrl = &v
	return s
}

type ListAntsaasStaffingcInsureProductRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业名称
	EnterpriseName *string `json:"enterprise_name,omitempty" xml:"enterprise_name,omitempty" require:"true"`
	// 统一社会信用代码
	SocialCreditCode *string `json:"social_credit_code,omitempty" xml:"social_credit_code,omitempty" require:"true"`
	// 保险场景码:
	// FLEXIBLE_EMPLOYMENT-日单（实时生效）
	// INITIATIVE_EMPLOYMENT-长期（次日0点生效）
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty" require:"true"`
	// 险种编码:
	//  ACCIDENT: 意外险
	//  EMPLOYER_LIABILITY: 雇主险
	InsuranceTypeCode *string `json:"insurance_type_code,omitempty" xml:"insurance_type_code,omitempty" require:"true"`
}

func (s ListAntsaasStaffingcInsureProductRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAntsaasStaffingcInsureProductRequest) GoString() string {
	return s.String()
}

func (s *ListAntsaasStaffingcInsureProductRequest) SetAuthToken(v string) *ListAntsaasStaffingcInsureProductRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAntsaasStaffingcInsureProductRequest) SetProductInstanceId(v string) *ListAntsaasStaffingcInsureProductRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListAntsaasStaffingcInsureProductRequest) SetEnterpriseName(v string) *ListAntsaasStaffingcInsureProductRequest {
	s.EnterpriseName = &v
	return s
}

func (s *ListAntsaasStaffingcInsureProductRequest) SetSocialCreditCode(v string) *ListAntsaasStaffingcInsureProductRequest {
	s.SocialCreditCode = &v
	return s
}

func (s *ListAntsaasStaffingcInsureProductRequest) SetBizCode(v string) *ListAntsaasStaffingcInsureProductRequest {
	s.BizCode = &v
	return s
}

func (s *ListAntsaasStaffingcInsureProductRequest) SetInsuranceTypeCode(v string) *ListAntsaasStaffingcInsureProductRequest {
	s.InsuranceTypeCode = &v
	return s
}

type ListAntsaasStaffingcInsureProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 保险产品列表
	ProductList []*InsureProductInfo `json:"product_list,omitempty" xml:"product_list,omitempty" type:"Repeated"`
}

func (s ListAntsaasStaffingcInsureProductResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAntsaasStaffingcInsureProductResponse) GoString() string {
	return s.String()
}

func (s *ListAntsaasStaffingcInsureProductResponse) SetReqMsgId(v string) *ListAntsaasStaffingcInsureProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAntsaasStaffingcInsureProductResponse) SetResultCode(v string) *ListAntsaasStaffingcInsureProductResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAntsaasStaffingcInsureProductResponse) SetResultMsg(v string) *ListAntsaasStaffingcInsureProductResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAntsaasStaffingcInsureProductResponse) SetProductList(v []*InsureProductInfo) *ListAntsaasStaffingcInsureProductResponse {
	s.ProductList = v
	return s
}

type QueryAntsaasStaffingcInsurePriceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业名称
	EnterpriseName *string `json:"enterprise_name,omitempty" xml:"enterprise_name,omitempty" require:"true"`
	// 统一社会信用代码
	SocialCreditCode *string `json:"social_credit_code,omitempty" xml:"social_credit_code,omitempty" require:"true"`
	// 产品ID
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty" require:"true"`
	// 职业编码:
	// default-1-一类职业;
	// default-2-二类职业;
	// default-3-三类职业;
	// default-4-四类职业;
	JobCode *string `json:"job_code,omitempty" xml:"job_code,omitempty" require:"true"`
	// 周期：
	// 1D、
	// 30D、
	// 360D
	Period *string `json:"period,omitempty" xml:"period,omitempty" require:"true"`
}

func (s QueryAntsaasStaffingcInsurePriceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntsaasStaffingcInsurePriceRequest) GoString() string {
	return s.String()
}

func (s *QueryAntsaasStaffingcInsurePriceRequest) SetAuthToken(v string) *QueryAntsaasStaffingcInsurePriceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntsaasStaffingcInsurePriceRequest) SetProductInstanceId(v string) *QueryAntsaasStaffingcInsurePriceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntsaasStaffingcInsurePriceRequest) SetEnterpriseName(v string) *QueryAntsaasStaffingcInsurePriceRequest {
	s.EnterpriseName = &v
	return s
}

func (s *QueryAntsaasStaffingcInsurePriceRequest) SetSocialCreditCode(v string) *QueryAntsaasStaffingcInsurePriceRequest {
	s.SocialCreditCode = &v
	return s
}

func (s *QueryAntsaasStaffingcInsurePriceRequest) SetProductId(v string) *QueryAntsaasStaffingcInsurePriceRequest {
	s.ProductId = &v
	return s
}

func (s *QueryAntsaasStaffingcInsurePriceRequest) SetJobCode(v string) *QueryAntsaasStaffingcInsurePriceRequest {
	s.JobCode = &v
	return s
}

func (s *QueryAntsaasStaffingcInsurePriceRequest) SetPeriod(v string) *QueryAntsaasStaffingcInsurePriceRequest {
	s.Period = &v
	return s
}

type QueryAntsaasStaffingcInsurePriceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 价格
	Price *int64 `json:"price,omitempty" xml:"price,omitempty"`
}

func (s QueryAntsaasStaffingcInsurePriceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntsaasStaffingcInsurePriceResponse) GoString() string {
	return s.String()
}

func (s *QueryAntsaasStaffingcInsurePriceResponse) SetReqMsgId(v string) *QueryAntsaasStaffingcInsurePriceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntsaasStaffingcInsurePriceResponse) SetResultCode(v string) *QueryAntsaasStaffingcInsurePriceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntsaasStaffingcInsurePriceResponse) SetResultMsg(v string) *QueryAntsaasStaffingcInsurePriceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntsaasStaffingcInsurePriceResponse) SetPrice(v int64) *QueryAntsaasStaffingcInsurePriceResponse {
	s.Price = &v
	return s
}

type SendAntsaasStaffingcInsureRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部业务号（幂等、异步通知回传）
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty" require:"true"`
	// 企业名称
	EnterpriseName *string `json:"enterprise_name,omitempty" xml:"enterprise_name,omitempty" require:"true"`
	// 统一社会信用代码
	SocialCreditCode *string `json:"social_credit_code,omitempty" xml:"social_credit_code,omitempty" require:"true"`
	// 保险场景码:
	// FLEXIBLE_EMPLOYMENT-日单（实时生效）
	// INITIATIVE_EMPLOYMENT- 长期（次日0点生效）
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty" require:"true"`
	// 投保的险种编码:
	// ACCIDENT: 意外险,
	// EMPLOYER_LIABILITY: 雇主险
	InsuranceTypeCode *string `json:"insurance_type_code,omitempty" xml:"insurance_type_code,omitempty" require:"true"`
	// 产品ID
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty" require:"true"`
	// 职业编码:
	// default-1-一类职业;
	// default-2-二类职业;
	// default-3-三类职业;
	// default-4-四类职业;
	// default-5-五类职业（雇主险60万和80万保额暂不支持）
	JobCode *string `json:"job_code,omitempty" xml:"job_code,omitempty" require:"true"`
	// 保障周期：30D、360D（bizCode为长期时必传）
	Period *string `json:"period,omitempty" xml:"period,omitempty"`
	// 推荐编码
	RecomFlowNo *string `json:"recom_flow_no,omitempty" xml:"recom_flow_no,omitempty"`
	// 地址（bizCode为日单必传）
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 投保人列表，extra_msg需传递out_sub_biz_no，外部明细业务号（投保结果通知会回传，自行定义）
	EmployeeList []*InsureEmployeeInfo `json:"employee_list,omitempty" xml:"employee_list,omitempty" require:"true" type:"Repeated"`
}

func (s SendAntsaasStaffingcInsureRequest) String() string {
	return tea.Prettify(s)
}

func (s SendAntsaasStaffingcInsureRequest) GoString() string {
	return s.String()
}

func (s *SendAntsaasStaffingcInsureRequest) SetAuthToken(v string) *SendAntsaasStaffingcInsureRequest {
	s.AuthToken = &v
	return s
}

func (s *SendAntsaasStaffingcInsureRequest) SetProductInstanceId(v string) *SendAntsaasStaffingcInsureRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendAntsaasStaffingcInsureRequest) SetOutBizNo(v string) *SendAntsaasStaffingcInsureRequest {
	s.OutBizNo = &v
	return s
}

func (s *SendAntsaasStaffingcInsureRequest) SetEnterpriseName(v string) *SendAntsaasStaffingcInsureRequest {
	s.EnterpriseName = &v
	return s
}

func (s *SendAntsaasStaffingcInsureRequest) SetSocialCreditCode(v string) *SendAntsaasStaffingcInsureRequest {
	s.SocialCreditCode = &v
	return s
}

func (s *SendAntsaasStaffingcInsureRequest) SetBizCode(v string) *SendAntsaasStaffingcInsureRequest {
	s.BizCode = &v
	return s
}

func (s *SendAntsaasStaffingcInsureRequest) SetInsuranceTypeCode(v string) *SendAntsaasStaffingcInsureRequest {
	s.InsuranceTypeCode = &v
	return s
}

func (s *SendAntsaasStaffingcInsureRequest) SetProductId(v string) *SendAntsaasStaffingcInsureRequest {
	s.ProductId = &v
	return s
}

func (s *SendAntsaasStaffingcInsureRequest) SetJobCode(v string) *SendAntsaasStaffingcInsureRequest {
	s.JobCode = &v
	return s
}

func (s *SendAntsaasStaffingcInsureRequest) SetPeriod(v string) *SendAntsaasStaffingcInsureRequest {
	s.Period = &v
	return s
}

func (s *SendAntsaasStaffingcInsureRequest) SetRecomFlowNo(v string) *SendAntsaasStaffingcInsureRequest {
	s.RecomFlowNo = &v
	return s
}

func (s *SendAntsaasStaffingcInsureRequest) SetAddress(v string) *SendAntsaasStaffingcInsureRequest {
	s.Address = &v
	return s
}

func (s *SendAntsaasStaffingcInsureRequest) SetEmployeeList(v []*InsureEmployeeInfo) *SendAntsaasStaffingcInsureRequest {
	s.EmployeeList = v
	return s
}

type SendAntsaasStaffingcInsureResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 投保失败人员信息，extra_msg会返回failReason，投保失败原因
	FailEmployeeList []*InsureEmployeeInfo `json:"fail_employee_list,omitempty" xml:"fail_employee_list,omitempty" type:"Repeated"`
}

func (s SendAntsaasStaffingcInsureResponse) String() string {
	return tea.Prettify(s)
}

func (s SendAntsaasStaffingcInsureResponse) GoString() string {
	return s.String()
}

func (s *SendAntsaasStaffingcInsureResponse) SetReqMsgId(v string) *SendAntsaasStaffingcInsureResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendAntsaasStaffingcInsureResponse) SetResultCode(v string) *SendAntsaasStaffingcInsureResponse {
	s.ResultCode = &v
	return s
}

func (s *SendAntsaasStaffingcInsureResponse) SetResultMsg(v string) *SendAntsaasStaffingcInsureResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendAntsaasStaffingcInsureResponse) SetFailEmployeeList(v []*InsureEmployeeInfo) *SendAntsaasStaffingcInsureResponse {
	s.FailEmployeeList = v
	return s
}

type SendAntsaasStaffingcInsureRefundRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部业务号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty" require:"true"`
	// 企业名称
	EnterpriseName *string `json:"enterprise_name,omitempty" xml:"enterprise_name,omitempty" require:"true"`
	// 统一社会信用代码
	SocialCreditCode *string `json:"social_credit_code,omitempty" xml:"social_credit_code,omitempty" require:"true"`
	// 退保订单号列表
	OrderNoList []*int64 `json:"order_no_list,omitempty" xml:"order_no_list,omitempty" require:"true" type:"Repeated"`
}

func (s SendAntsaasStaffingcInsureRefundRequest) String() string {
	return tea.Prettify(s)
}

func (s SendAntsaasStaffingcInsureRefundRequest) GoString() string {
	return s.String()
}

func (s *SendAntsaasStaffingcInsureRefundRequest) SetAuthToken(v string) *SendAntsaasStaffingcInsureRefundRequest {
	s.AuthToken = &v
	return s
}

func (s *SendAntsaasStaffingcInsureRefundRequest) SetProductInstanceId(v string) *SendAntsaasStaffingcInsureRefundRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendAntsaasStaffingcInsureRefundRequest) SetOutBizNo(v string) *SendAntsaasStaffingcInsureRefundRequest {
	s.OutBizNo = &v
	return s
}

func (s *SendAntsaasStaffingcInsureRefundRequest) SetEnterpriseName(v string) *SendAntsaasStaffingcInsureRefundRequest {
	s.EnterpriseName = &v
	return s
}

func (s *SendAntsaasStaffingcInsureRefundRequest) SetSocialCreditCode(v string) *SendAntsaasStaffingcInsureRefundRequest {
	s.SocialCreditCode = &v
	return s
}

func (s *SendAntsaasStaffingcInsureRefundRequest) SetOrderNoList(v []*int64) *SendAntsaasStaffingcInsureRefundRequest {
	s.OrderNoList = v
	return s
}

type SendAntsaasStaffingcInsureRefundResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 失败原因列表
	FailOrderInfoList []*FailOrderInfo `json:"fail_order_info_list,omitempty" xml:"fail_order_info_list,omitempty" type:"Repeated"`
}

func (s SendAntsaasStaffingcInsureRefundResponse) String() string {
	return tea.Prettify(s)
}

func (s SendAntsaasStaffingcInsureRefundResponse) GoString() string {
	return s.String()
}

func (s *SendAntsaasStaffingcInsureRefundResponse) SetReqMsgId(v string) *SendAntsaasStaffingcInsureRefundResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendAntsaasStaffingcInsureRefundResponse) SetResultCode(v string) *SendAntsaasStaffingcInsureRefundResponse {
	s.ResultCode = &v
	return s
}

func (s *SendAntsaasStaffingcInsureRefundResponse) SetResultMsg(v string) *SendAntsaasStaffingcInsureRefundResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendAntsaasStaffingcInsureRefundResponse) SetFailOrderInfoList(v []*FailOrderInfo) *SendAntsaasStaffingcInsureRefundResponse {
	s.FailOrderInfoList = v
	return s
}

type SignAntsaasStaffingcContractCaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务名称
	BizName *string `json:"biz_name,omitempty" xml:"biz_name,omitempty" require:"true"`
	// 业务编号
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// 版本
	SignVersion *string `json:"sign_version,omitempty" xml:"sign_version,omitempty" require:"true"`
	// 签署任务信息
	SignTaskRequestList []*CaSignTaskRequest `json:"sign_task_request_list,omitempty" xml:"sign_task_request_list,omitempty" require:"true" type:"Repeated"`
	// 通过文件API上传的文件的file_id
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 合同模板密钥:若为合同模板该值必填,否则不需要填写
	TemplateSecretKey *string `json:"template_secret_key,omitempty" xml:"template_secret_key,omitempty"`
	// 模板填充字段集合
	TemplateFieldConfigRequestList []*TemplateFieldConfigRequest `json:"template_field_config_request_list,omitempty" xml:"template_field_config_request_list,omitempty" type:"Repeated"`
}

func (s SignAntsaasStaffingcContractCaRequest) String() string {
	return tea.Prettify(s)
}

func (s SignAntsaasStaffingcContractCaRequest) GoString() string {
	return s.String()
}

func (s *SignAntsaasStaffingcContractCaRequest) SetAuthToken(v string) *SignAntsaasStaffingcContractCaRequest {
	s.AuthToken = &v
	return s
}

func (s *SignAntsaasStaffingcContractCaRequest) SetProductInstanceId(v string) *SignAntsaasStaffingcContractCaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SignAntsaasStaffingcContractCaRequest) SetBizName(v string) *SignAntsaasStaffingcContractCaRequest {
	s.BizName = &v
	return s
}

func (s *SignAntsaasStaffingcContractCaRequest) SetBizNo(v string) *SignAntsaasStaffingcContractCaRequest {
	s.BizNo = &v
	return s
}

func (s *SignAntsaasStaffingcContractCaRequest) SetSignVersion(v string) *SignAntsaasStaffingcContractCaRequest {
	s.SignVersion = &v
	return s
}

func (s *SignAntsaasStaffingcContractCaRequest) SetSignTaskRequestList(v []*CaSignTaskRequest) *SignAntsaasStaffingcContractCaRequest {
	s.SignTaskRequestList = v
	return s
}

func (s *SignAntsaasStaffingcContractCaRequest) SetFileObject(v io.Reader) *SignAntsaasStaffingcContractCaRequest {
	s.FileObject = v
	return s
}

func (s *SignAntsaasStaffingcContractCaRequest) SetFileObjectName(v string) *SignAntsaasStaffingcContractCaRequest {
	s.FileObjectName = &v
	return s
}

func (s *SignAntsaasStaffingcContractCaRequest) SetFileId(v string) *SignAntsaasStaffingcContractCaRequest {
	s.FileId = &v
	return s
}

func (s *SignAntsaasStaffingcContractCaRequest) SetTemplateSecretKey(v string) *SignAntsaasStaffingcContractCaRequest {
	s.TemplateSecretKey = &v
	return s
}

func (s *SignAntsaasStaffingcContractCaRequest) SetTemplateFieldConfigRequestList(v []*TemplateFieldConfigRequest) *SignAntsaasStaffingcContractCaRequest {
	s.TemplateFieldConfigRequestList = v
	return s
}

type SignAntsaasStaffingcContractCaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签约流程id
	SignFlowId *string `json:"sign_flow_id,omitempty" xml:"sign_flow_id,omitempty"`
	// 业务流水号
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 用印子任务受理流水
	SubAntSignResultList []*CaSubSignResult `json:"sub_ant_sign_result_list,omitempty" xml:"sub_ant_sign_result_list,omitempty" type:"Repeated"`
}

func (s SignAntsaasStaffingcContractCaResponse) String() string {
	return tea.Prettify(s)
}

func (s SignAntsaasStaffingcContractCaResponse) GoString() string {
	return s.String()
}

func (s *SignAntsaasStaffingcContractCaResponse) SetReqMsgId(v string) *SignAntsaasStaffingcContractCaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SignAntsaasStaffingcContractCaResponse) SetResultCode(v string) *SignAntsaasStaffingcContractCaResponse {
	s.ResultCode = &v
	return s
}

func (s *SignAntsaasStaffingcContractCaResponse) SetResultMsg(v string) *SignAntsaasStaffingcContractCaResponse {
	s.ResultMsg = &v
	return s
}

func (s *SignAntsaasStaffingcContractCaResponse) SetSignFlowId(v string) *SignAntsaasStaffingcContractCaResponse {
	s.SignFlowId = &v
	return s
}

func (s *SignAntsaasStaffingcContractCaResponse) SetBizNo(v string) *SignAntsaasStaffingcContractCaResponse {
	s.BizNo = &v
	return s
}

func (s *SignAntsaasStaffingcContractCaResponse) SetSubAntSignResultList(v []*CaSubSignResult) *SignAntsaasStaffingcContractCaResponse {
	s.SubAntSignResultList = v
	return s
}

type QueryAntsaasStaffingcContractCaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署流程ID,传值默认查询签署流程下全部任务状态
	SignFlowId *string `json:"sign_flow_id,omitempty" xml:"sign_flow_id,omitempty" require:"true"`
	// 签署任务id
	SignTaskId *string `json:"sign_task_id,omitempty" xml:"sign_task_id,omitempty" require:"true"`
	// 业务唯一流水号
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
}

func (s QueryAntsaasStaffingcContractCaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntsaasStaffingcContractCaRequest) GoString() string {
	return s.String()
}

func (s *QueryAntsaasStaffingcContractCaRequest) SetAuthToken(v string) *QueryAntsaasStaffingcContractCaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntsaasStaffingcContractCaRequest) SetProductInstanceId(v string) *QueryAntsaasStaffingcContractCaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntsaasStaffingcContractCaRequest) SetSignFlowId(v string) *QueryAntsaasStaffingcContractCaRequest {
	s.SignFlowId = &v
	return s
}

func (s *QueryAntsaasStaffingcContractCaRequest) SetSignTaskId(v string) *QueryAntsaasStaffingcContractCaRequest {
	s.SignTaskId = &v
	return s
}

func (s *QueryAntsaasStaffingcContractCaRequest) SetBizNo(v string) *QueryAntsaasStaffingcContractCaRequest {
	s.BizNo = &v
	return s
}

type QueryAntsaasStaffingcContractCaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署流程ID
	SignFlowId *string `json:"sign_flow_id,omitempty" xml:"sign_flow_id,omitempty"`
	// 签署流程状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 业务流水号
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 签署任务结果列表
	AntSignTaskResultList []*CaSignTaskResult `json:"ant_sign_task_result_list,omitempty" xml:"ant_sign_task_result_list,omitempty" type:"Repeated"`
}

func (s QueryAntsaasStaffingcContractCaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntsaasStaffingcContractCaResponse) GoString() string {
	return s.String()
}

func (s *QueryAntsaasStaffingcContractCaResponse) SetReqMsgId(v string) *QueryAntsaasStaffingcContractCaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntsaasStaffingcContractCaResponse) SetResultCode(v string) *QueryAntsaasStaffingcContractCaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntsaasStaffingcContractCaResponse) SetResultMsg(v string) *QueryAntsaasStaffingcContractCaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntsaasStaffingcContractCaResponse) SetSignFlowId(v string) *QueryAntsaasStaffingcContractCaResponse {
	s.SignFlowId = &v
	return s
}

func (s *QueryAntsaasStaffingcContractCaResponse) SetStatus(v string) *QueryAntsaasStaffingcContractCaResponse {
	s.Status = &v
	return s
}

func (s *QueryAntsaasStaffingcContractCaResponse) SetBizNo(v string) *QueryAntsaasStaffingcContractCaResponse {
	s.BizNo = &v
	return s
}

func (s *QueryAntsaasStaffingcContractCaResponse) SetAntSignTaskResultList(v []*CaSignTaskResult) *QueryAntsaasStaffingcContractCaResponse {
	s.AntSignTaskResultList = v
	return s
}

type CreateAntcloudGatewayxFileUploadRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
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
	// 产品方的api归属集群，即productInstanceId
	ApiCluster *string `json:"api_cluster,omitempty" xml:"api_cluster,omitempty"`
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

func (s *CreateAntcloudGatewayxFileUploadRequest) SetApiCluster(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.ApiCluster = &v
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
	UploadHeaders []*XNameValuePair `json:"upload_headers,omitempty" xml:"upload_headers,omitempty" type:"Repeated"`
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

func (s *CreateAntcloudGatewayxFileUploadResponse) SetUploadHeaders(v []*XNameValuePair) *CreateAntcloudGatewayxFileUploadResponse {
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
				"sdk_version":      tea.String("2.1.0"),
				"_prod_code":       tea.String("ak_320bc483f2434f39a3af9ec9f04d3cc0"),
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
 * Description: 发起签约调用接口
 * Summary: 发起签约
 */
func (client *Client) SignAntsaasStaffingcContractSend(request *SignAntsaasStaffingcContractSendRequest) (_result *SignAntsaasStaffingcContractSendResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SignAntsaasStaffingcContractSendResponse{}
	_body, _err := client.SignAntsaasStaffingcContractSendEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发起签约调用接口
 * Summary: 发起签约
 */
func (client *Client) SignAntsaasStaffingcContractSendEx(request *SignAntsaasStaffingcContractSendRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SignAntsaasStaffingcContractSendResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antsaas.staffingc.contract.send.sign"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			signAntsaasStaffingcContractSendResponse := &SignAntsaasStaffingcContractSendResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = signAntsaasStaffingcContractSendResponse
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
	_result = &SignAntsaasStaffingcContractSendResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsaas.staffingc.contract.send.sign"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 签约结果查询
 * Summary: 查询签约结果
 */
func (client *Client) QueryAntsaasStaffingcContractSign(request *QueryAntsaasStaffingcContractSignRequest) (_result *QueryAntsaasStaffingcContractSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntsaasStaffingcContractSignResponse{}
	_body, _err := client.QueryAntsaasStaffingcContractSignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 签约结果查询
 * Summary: 查询签约结果
 */
func (client *Client) QueryAntsaasStaffingcContractSignEx(request *QueryAntsaasStaffingcContractSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntsaasStaffingcContractSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntsaasStaffingcContractSignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsaas.staffingc.contract.sign.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业认证授权url查询接口
 * Summary: 企业认证授权url查询接口
 */
func (client *Client) QueryAntsaasStaffingcEpcertificationUrl(request *QueryAntsaasStaffingcEpcertificationUrlRequest) (_result *QueryAntsaasStaffingcEpcertificationUrlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntsaasStaffingcEpcertificationUrlResponse{}
	_body, _err := client.QueryAntsaasStaffingcEpcertificationUrlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业认证授权url查询接口
 * Summary: 企业认证授权url查询接口
 */
func (client *Client) QueryAntsaasStaffingcEpcertificationUrlEx(request *QueryAntsaasStaffingcEpcertificationUrlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntsaasStaffingcEpcertificationUrlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntsaasStaffingcEpcertificationUrlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsaas.staffingc.epcertification.url.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业认证创建接口
 * Summary: 企业认证创建接口
 */
func (client *Client) CreateAntsaasStaffingcEpcertificationAuthorize(request *CreateAntsaasStaffingcEpcertificationAuthorizeRequest) (_result *CreateAntsaasStaffingcEpcertificationAuthorizeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAntsaasStaffingcEpcertificationAuthorizeResponse{}
	_body, _err := client.CreateAntsaasStaffingcEpcertificationAuthorizeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业认证创建接口
 * Summary: 企业认证创建接口
 */
func (client *Client) CreateAntsaasStaffingcEpcertificationAuthorizeEx(request *CreateAntsaasStaffingcEpcertificationAuthorizeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAntsaasStaffingcEpcertificationAuthorizeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAntsaasStaffingcEpcertificationAuthorizeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsaas.staffingc.epcertification.authorize.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业认证风险查询接口
 * Summary: 企业认证风险查询接口
 */
func (client *Client) QueryAntsaasStaffingcEpcertificationRisk(request *QueryAntsaasStaffingcEpcertificationRiskRequest) (_result *QueryAntsaasStaffingcEpcertificationRiskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntsaasStaffingcEpcertificationRiskResponse{}
	_body, _err := client.QueryAntsaasStaffingcEpcertificationRiskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业认证风险查询接口
 * Summary: 企业认证风险查询接口
 */
func (client *Client) QueryAntsaasStaffingcEpcertificationRiskEx(request *QueryAntsaasStaffingcEpcertificationRiskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntsaasStaffingcEpcertificationRiskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntsaasStaffingcEpcertificationRiskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsaas.staffingc.epcertification.risk.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取保险签约认证连接
 * Summary: 获取保险签约认证连接
 */
func (client *Client) ApplyAntsaasStaffingcInsureSignurl(request *ApplyAntsaasStaffingcInsureSignurlRequest) (_result *ApplyAntsaasStaffingcInsureSignurlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyAntsaasStaffingcInsureSignurlResponse{}
	_body, _err := client.ApplyAntsaasStaffingcInsureSignurlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取保险签约认证连接
 * Summary: 获取保险签约认证连接
 */
func (client *Client) ApplyAntsaasStaffingcInsureSignurlEx(request *ApplyAntsaasStaffingcInsureSignurlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyAntsaasStaffingcInsureSignurlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyAntsaasStaffingcInsureSignurlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsaas.staffingc.insure.signurl.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询可投保的保险产品
 * Summary: 查询可投保的保险产品
 */
func (client *Client) ListAntsaasStaffingcInsureProduct(request *ListAntsaasStaffingcInsureProductRequest) (_result *ListAntsaasStaffingcInsureProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAntsaasStaffingcInsureProductResponse{}
	_body, _err := client.ListAntsaasStaffingcInsureProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询可投保的保险产品
 * Summary: 查询可投保的保险产品
 */
func (client *Client) ListAntsaasStaffingcInsureProductEx(request *ListAntsaasStaffingcInsureProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAntsaasStaffingcInsureProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAntsaasStaffingcInsureProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsaas.staffingc.insure.product.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询保险产品价格相关信息
 * Summary: 查询保险产品价格相关信息
 */
func (client *Client) QueryAntsaasStaffingcInsurePrice(request *QueryAntsaasStaffingcInsurePriceRequest) (_result *QueryAntsaasStaffingcInsurePriceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntsaasStaffingcInsurePriceResponse{}
	_body, _err := client.QueryAntsaasStaffingcInsurePriceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询保险产品价格相关信息
 * Summary: 查询保险产品价格相关信息
 */
func (client *Client) QueryAntsaasStaffingcInsurePriceEx(request *QueryAntsaasStaffingcInsurePriceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntsaasStaffingcInsurePriceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntsaasStaffingcInsurePriceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsaas.staffingc.insure.price.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 执行投保
 * Summary: 执行投保
 */
func (client *Client) SendAntsaasStaffingcInsure(request *SendAntsaasStaffingcInsureRequest) (_result *SendAntsaasStaffingcInsureResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendAntsaasStaffingcInsureResponse{}
	_body, _err := client.SendAntsaasStaffingcInsureEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 执行投保
 * Summary: 执行投保
 */
func (client *Client) SendAntsaasStaffingcInsureEx(request *SendAntsaasStaffingcInsureRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendAntsaasStaffingcInsureResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendAntsaasStaffingcInsureResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsaas.staffingc.insure.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 退保接口
 * Summary: 退保接口
 */
func (client *Client) SendAntsaasStaffingcInsureRefund(request *SendAntsaasStaffingcInsureRefundRequest) (_result *SendAntsaasStaffingcInsureRefundResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendAntsaasStaffingcInsureRefundResponse{}
	_body, _err := client.SendAntsaasStaffingcInsureRefundEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 退保接口
 * Summary: 退保接口
 */
func (client *Client) SendAntsaasStaffingcInsureRefundEx(request *SendAntsaasStaffingcInsureRefundRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendAntsaasStaffingcInsureRefundResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendAntsaasStaffingcInsureRefundResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsaas.staffingc.insure.refund.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: CA电子签
 * Summary: CA电子签约
 */
func (client *Client) SignAntsaasStaffingcContractCa(request *SignAntsaasStaffingcContractCaRequest) (_result *SignAntsaasStaffingcContractCaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SignAntsaasStaffingcContractCaResponse{}
	_body, _err := client.SignAntsaasStaffingcContractCaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: CA电子签
 * Summary: CA电子签约
 */
func (client *Client) SignAntsaasStaffingcContractCaEx(request *SignAntsaasStaffingcContractCaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SignAntsaasStaffingcContractCaResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antsaas.staffingc.contract.ca.sign"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			signAntsaasStaffingcContractCaResponse := &SignAntsaasStaffingcContractCaResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = signAntsaasStaffingcContractCaResponse
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
	_result = &SignAntsaasStaffingcContractCaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsaas.staffingc.contract.ca.sign"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询签约结果
 * Summary: 查询签约结果
 */
func (client *Client) QueryAntsaasStaffingcContractCa(request *QueryAntsaasStaffingcContractCaRequest) (_result *QueryAntsaasStaffingcContractCaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntsaasStaffingcContractCaResponse{}
	_body, _err := client.QueryAntsaasStaffingcContractCaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询签约结果
 * Summary: 查询签约结果
 */
func (client *Client) QueryAntsaasStaffingcContractCaEx(request *QueryAntsaasStaffingcContractCaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntsaasStaffingcContractCaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntsaasStaffingcContractCaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsaas.staffingc.contract.ca.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
