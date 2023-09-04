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
				"sdk_version":      tea.String("1.1.1"),
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
