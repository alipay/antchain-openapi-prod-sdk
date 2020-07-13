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
	AccessKeyId     *string `json:"accessKeyId,omitempty" xml:"accessKeyId,omitempty"`
	AccessKeySecret *string `json:"accessKeySecret,omitempty" xml:"accessKeySecret,omitempty"`
	SecurityToken   *string `json:"securityToken,omitempty" xml:"securityToken,omitempty"`
	Protocol        *string `json:"protocol,omitempty" xml:"protocol,omitempty"`
	ReadTimeout     *int    `json:"readTimeout,omitempty" xml:"readTimeout,omitempty"`
	ConnectTimeout  *int    `json:"connectTimeout,omitempty" xml:"connectTimeout,omitempty"`
	HttpProxy       *string `json:"httpProxy,omitempty" xml:"httpProxy,omitempty"`
	HttpsProxy      *string `json:"httpsProxy,omitempty" xml:"httpsProxy,omitempty"`
	Endpoint        *string `json:"endpoint,omitempty" xml:"endpoint,omitempty"`
	NoProxy         *string `json:"noProxy,omitempty" xml:"noProxy,omitempty"`
	MaxIdleConns    *int    `json:"maxIdleConns,omitempty" xml:"maxIdleConns,omitempty"`
	UserAgent       *string `json:"userAgent,omitempty" xml:"userAgent,omitempty"`
	Socks5Proxy     *string `json:"socks5Proxy,omitempty" xml:"socks5Proxy,omitempty"`
	Socks5NetWork   *string `json:"socks5NetWork,omitempty" xml:"socks5NetWork,omitempty"`
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

// 证书
type Cert struct {
	// 证书编号
	CertCode *string `json:"cert_code,omitempty" xml:"cert_code,omitempty" maxLength:"64"`
	// 时间周期结束时间
	CertEndTime *string `json:"cert_end_time,omitempty" xml:"cert_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 证书id
	CertId *string `json:"cert_id,omitempty" xml:"cert_id,omitempty" maxLength:"128"`
	// 证书名称-中文
	CertNameCn *string `json:"cert_name_cn,omitempty" xml:"cert_name_cn,omitempty" maxLength:"64"`
	// 证书名称-英文（拼音）
	CertNameEn *string `json:"cert_name_en,omitempty" xml:"cert_name_en,omitempty"`
	// 首次发布时间
	CertPublishTime *string `json:"cert_publish_time,omitempty" xml:"cert_publish_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 时间周期开始时间
	CertStartTime *string `json:"cert_start_time,omitempty" xml:"cert_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 1-有效
	// 2-冻结
	// 3-失效
	// 4-作废
	// 5-其他
	CertStatus *int64 `json:"cert_status,omitempty" xml:"cert_status,omitempty"`
	// 实体证书图片url
	CertUrl *string `json:"cert_url,omitempty" xml:"cert_url,omitempty" maxLength:"256"`
	// 证书归属国家
	// 使用“ISO 3166-1”代码表-数字码
	// https://zh.wikipedia.org/wiki/ISO_3166-1
	Country *string `json:"country,omitempty" xml:"country,omitempty" maxLength:"32"`
	// 1.长期有效
	// 2.时间周期
	ExpireType *int64 `json:"expire_type,omitempty" xml:"expire_type,omitempty"`
	// 其他信息文件url
	FeatureUrl *string `json:"feature_url,omitempty" xml:"feature_url,omitempty" maxLength:"512"`
	// 持有人的人脸图像url
	HolderAvatar *string `json:"holder_avatar,omitempty" xml:"holder_avatar,omitempty" maxLength:"256"`
	// 证书持有人姓名
	HolderName *string `json:"holder_name,omitempty" xml:"holder_name,omitempty" maxLength:"64"`
	// 证书等级类型：
	// 初级（五级）、中级（四级）、高级（三级）、技师（二级）和高级技师（一级）、其他
	Level *string `json:"level,omitempty" xml:"level,omitempty" maxLength:"32"`
	// 企业did
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	// 企业名称
	OrgName *string `json:"org_name,omitempty" xml:"org_name,omitempty" maxLength:"64"`
	// 证书持有人id
	OrgUserId *string `json:"org_user_id,omitempty" xml:"org_user_id,omitempty" maxLength:"128"`
	// 持有人主证件编号，无身份证的个人使用0000000000000000
	PrimaryIdNo *string `json:"primary_id_no,omitempty" xml:"primary_id_no,omitempty" maxLength:"64"`
	// 持有人辅助证件编号-1
	SecondIdNo1 *string `json:"second_id_no_1,omitempty" xml:"second_id_no_1,omitempty" maxLength:"64"`
	// 持有人辅助证件编号-2
	SecondIdNo2 *string `json:"second_id_no_2,omitempty" xml:"second_id_no_2,omitempty" maxLength:"64"`
	// 持有人辅助证件编号-3
	SecondIdNo3 *string `json:"second_id_no_3,omitempty" xml:"second_id_no_3,omitempty" maxLength:"64"`
	// -数字码类型为156时可使用如下类目：
	// --学历证书-XLZ
	// --职业证书--ZYZ
	// -其他国家传入--QT
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s Cert) String() string {
	return tea.Prettify(s)
}

func (s Cert) GoString() string {
	return s.String()
}

func (s *Cert) SetCertCode(v string) *Cert {
	s.CertCode = &v
	return s
}

func (s *Cert) SetCertEndTime(v string) *Cert {
	s.CertEndTime = &v
	return s
}

func (s *Cert) SetCertId(v string) *Cert {
	s.CertId = &v
	return s
}

func (s *Cert) SetCertNameCn(v string) *Cert {
	s.CertNameCn = &v
	return s
}

func (s *Cert) SetCertNameEn(v string) *Cert {
	s.CertNameEn = &v
	return s
}

func (s *Cert) SetCertPublishTime(v string) *Cert {
	s.CertPublishTime = &v
	return s
}

func (s *Cert) SetCertStartTime(v string) *Cert {
	s.CertStartTime = &v
	return s
}

func (s *Cert) SetCertStatus(v int64) *Cert {
	s.CertStatus = &v
	return s
}

func (s *Cert) SetCertUrl(v string) *Cert {
	s.CertUrl = &v
	return s
}

func (s *Cert) SetCountry(v string) *Cert {
	s.Country = &v
	return s
}

func (s *Cert) SetExpireType(v int64) *Cert {
	s.ExpireType = &v
	return s
}

func (s *Cert) SetFeatureUrl(v string) *Cert {
	s.FeatureUrl = &v
	return s
}

func (s *Cert) SetHolderAvatar(v string) *Cert {
	s.HolderAvatar = &v
	return s
}

func (s *Cert) SetHolderName(v string) *Cert {
	s.HolderName = &v
	return s
}

func (s *Cert) SetLevel(v string) *Cert {
	s.Level = &v
	return s
}

func (s *Cert) SetOrgDid(v string) *Cert {
	s.OrgDid = &v
	return s
}

func (s *Cert) SetOrgName(v string) *Cert {
	s.OrgName = &v
	return s
}

func (s *Cert) SetOrgUserId(v string) *Cert {
	s.OrgUserId = &v
	return s
}

func (s *Cert) SetPrimaryIdNo(v string) *Cert {
	s.PrimaryIdNo = &v
	return s
}

func (s *Cert) SetSecondIdNo1(v string) *Cert {
	s.SecondIdNo1 = &v
	return s
}

func (s *Cert) SetSecondIdNo2(v string) *Cert {
	s.SecondIdNo2 = &v
	return s
}

func (s *Cert) SetSecondIdNo3(v string) *Cert {
	s.SecondIdNo3 = &v
	return s
}

func (s *Cert) SetType(v string) *Cert {
	s.Type = &v
	return s
}

// 企业用户
type OrgUser struct {
	// 企业did
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	// 企业用户id
	OrgUserId *string `json:"org_user_id,omitempty" xml:"org_user_id,omitempty" maxLength:"128"`
}

func (s OrgUser) String() string {
	return tea.Prettify(s)
}

func (s OrgUser) GoString() string {
	return s.String()
}

func (s *OrgUser) SetOrgDid(v string) *OrgUser {
	s.OrgDid = &v
	return s
}

func (s *OrgUser) SetOrgUserId(v string) *OrgUser {
	s.OrgUserId = &v
	return s
}

// 班级
type Class struct {
	// 班级id
	ClassId *string `json:"class_id,omitempty" xml:"class_id,omitempty" maxLength:"128"`
	// 企业did
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
}

func (s Class) String() string {
	return tea.Prettify(s)
}

func (s Class) GoString() string {
	return s.String()
}

func (s *Class) SetClassId(v string) *Class {
	s.ClassId = &v
	return s
}

func (s *Class) SetOrgDid(v string) *Class {
	s.OrgDid = &v
	return s
}

// 字段加密属性描述列表
type AttributeDesc struct {
	// 属性名称
	AttributeName *string `json:"attribute_name,omitempty" xml:"attribute_name,omitempty" maxLength:"64"`
	// 是否托管
	// 注：非托管的数据不支持被动消费，只支持主动消费，目前系统尚不支持主动消费
	IsProxy *bool `json:"is_proxy,omitempty" xml:"is_proxy,omitempty"`
	// 是否公开
	IsPublic *bool `json:"is_public,omitempty" xml:"is_public,omitempty"`
	// 隐私等级
	// 1级数据可以全量明文查询
	// 2级数据仅可以通过数据比较查询
	// 注：目前系统尚不支持隐私等级2的对比查询
	PrivacyLevel *int64 `json:"privacy_level,omitempty" xml:"privacy_level,omitempty"`
}

func (s AttributeDesc) String() string {
	return tea.Prettify(s)
}

func (s AttributeDesc) GoString() string {
	return s.String()
}

func (s *AttributeDesc) SetAttributeName(v string) *AttributeDesc {
	s.AttributeName = &v
	return s
}

func (s *AttributeDesc) SetIsProxy(v bool) *AttributeDesc {
	s.IsProxy = &v
	return s
}

func (s *AttributeDesc) SetIsPublic(v bool) *AttributeDesc {
	s.IsPublic = &v
	return s
}

func (s *AttributeDesc) SetPrivacyLevel(v int64) *AttributeDesc {
	s.PrivacyLevel = &v
	return s
}

type CreateAasEbcOrganizationRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 企业码
	OrgCode *string `json:"org_code,omitempty" xml:"org_code,omitempty" maxLength:"64"`
	// 企业名称
	OrgName *string `json:"org_name,omitempty" xml:"org_name,omitempty" maxLength:"64"`
}

func (s CreateAasEbcOrganizationRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAasEbcOrganizationRequest) GoString() string {
	return s.String()
}

func (s *CreateAasEbcOrganizationRequest) SetAuthToken(v string) *CreateAasEbcOrganizationRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAasEbcOrganizationRequest) SetProductInstanceId(v string) *CreateAasEbcOrganizationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAasEbcOrganizationRequest) SetRegionName(v string) *CreateAasEbcOrganizationRequest {
	s.RegionName = &v
	return s
}

func (s *CreateAasEbcOrganizationRequest) SetOrgCode(v string) *CreateAasEbcOrganizationRequest {
	s.OrgCode = &v
	return s
}

func (s *CreateAasEbcOrganizationRequest) SetOrgName(v string) *CreateAasEbcOrganizationRequest {
	s.OrgName = &v
	return s
}

type CreateAasEbcOrganizationResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业did
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty"`
}

func (s CreateAasEbcOrganizationResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAasEbcOrganizationResponse) GoString() string {
	return s.String()
}

func (s *CreateAasEbcOrganizationResponse) SetReqMsgId(v string) *CreateAasEbcOrganizationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAasEbcOrganizationResponse) SetResultCode(v string) *CreateAasEbcOrganizationResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAasEbcOrganizationResponse) SetResultMsg(v string) *CreateAasEbcOrganizationResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAasEbcOrganizationResponse) SetOrgDid(v string) *CreateAasEbcOrganizationResponse {
	s.OrgDid = &v
	return s
}

type CreateAasEbcPersonRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 加密属性描述列表
	//
	AttributeDescList []*AttributeDesc `json:"attribute_desc_list,omitempty" xml:"attribute_desc_list,omitempty" type:"Repeated"`
	// 姓名
	PersonName *string `json:"person_name,omitempty" xml:"person_name,omitempty" maxLength:"32"`
	// 持有人主证件编号，无身份证的个人使用0000000000000000
	// 请使用我们提供的公钥对数据进行加密
	PrimaryIdNo *string `json:"primary_id_no,omitempty" xml:"primary_id_no,omitempty" maxLength:"1024"`
	// 持有人辅助证件编号-1
	// 请使用我们提供的公钥对数据进行加密
	SecondIdNo1 *string `json:"second_id_no_1,omitempty" xml:"second_id_no_1,omitempty" maxLength:"1024"`
	// 持有人辅助证件编号-1
	// 请使用我们提供的公钥对数据进行加密
	SecondIdNo2 *string `json:"second_id_no_2,omitempty" xml:"second_id_no_2,omitempty" maxLength:"1024"`
	// 持有人辅助证件编号-3
	// 请使用我们提供的公钥对数据进行加密
	SecondIdNo3 *string `json:"second_id_no_3,omitempty" xml:"second_id_no_3,omitempty" maxLength:"1024"`
}

func (s CreateAasEbcPersonRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAasEbcPersonRequest) GoString() string {
	return s.String()
}

func (s *CreateAasEbcPersonRequest) SetAuthToken(v string) *CreateAasEbcPersonRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAasEbcPersonRequest) SetProductInstanceId(v string) *CreateAasEbcPersonRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAasEbcPersonRequest) SetRegionName(v string) *CreateAasEbcPersonRequest {
	s.RegionName = &v
	return s
}

func (s *CreateAasEbcPersonRequest) SetAttributeDescList(v []*AttributeDesc) *CreateAasEbcPersonRequest {
	s.AttributeDescList = v
	return s
}

func (s *CreateAasEbcPersonRequest) SetPersonName(v string) *CreateAasEbcPersonRequest {
	s.PersonName = &v
	return s
}

func (s *CreateAasEbcPersonRequest) SetPrimaryIdNo(v string) *CreateAasEbcPersonRequest {
	s.PrimaryIdNo = &v
	return s
}

func (s *CreateAasEbcPersonRequest) SetSecondIdNo1(v string) *CreateAasEbcPersonRequest {
	s.SecondIdNo1 = &v
	return s
}

func (s *CreateAasEbcPersonRequest) SetSecondIdNo2(v string) *CreateAasEbcPersonRequest {
	s.SecondIdNo2 = &v
	return s
}

func (s *CreateAasEbcPersonRequest) SetSecondIdNo3(v string) *CreateAasEbcPersonRequest {
	s.SecondIdNo3 = &v
	return s
}

type CreateAasEbcPersonResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 个人id
	PersonDid *string `json:"person_did,omitempty" xml:"person_did,omitempty"`
}

func (s CreateAasEbcPersonResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAasEbcPersonResponse) GoString() string {
	return s.String()
}

func (s *CreateAasEbcPersonResponse) SetReqMsgId(v string) *CreateAasEbcPersonResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAasEbcPersonResponse) SetResultCode(v string) *CreateAasEbcPersonResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAasEbcPersonResponse) SetResultMsg(v string) *CreateAasEbcPersonResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAasEbcPersonResponse) SetPersonDid(v string) *CreateAasEbcPersonResponse {
	s.PersonDid = &v
	return s
}

type CreateAasEbcOrganizationUserRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 企业id
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	// 个人id
	PersonDid *string `json:"person_did,omitempty" xml:"person_did,omitempty" maxLength:"128"`
	// 机构内部用户工号
	Uid *string `json:"uid,omitempty" xml:"uid,omitempty" maxLength:"64"`
}

func (s CreateAasEbcOrganizationUserRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAasEbcOrganizationUserRequest) GoString() string {
	return s.String()
}

func (s *CreateAasEbcOrganizationUserRequest) SetAuthToken(v string) *CreateAasEbcOrganizationUserRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAasEbcOrganizationUserRequest) SetProductInstanceId(v string) *CreateAasEbcOrganizationUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAasEbcOrganizationUserRequest) SetRegionName(v string) *CreateAasEbcOrganizationUserRequest {
	s.RegionName = &v
	return s
}

func (s *CreateAasEbcOrganizationUserRequest) SetOrgDid(v string) *CreateAasEbcOrganizationUserRequest {
	s.OrgDid = &v
	return s
}

func (s *CreateAasEbcOrganizationUserRequest) SetPersonDid(v string) *CreateAasEbcOrganizationUserRequest {
	s.PersonDid = &v
	return s
}

func (s *CreateAasEbcOrganizationUserRequest) SetUid(v string) *CreateAasEbcOrganizationUserRequest {
	s.Uid = &v
	return s
}

type CreateAasEbcOrganizationUserResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 机构内用户id
	OrgUserId *string `json:"org_user_id,omitempty" xml:"org_user_id,omitempty"`
}

func (s CreateAasEbcOrganizationUserResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAasEbcOrganizationUserResponse) GoString() string {
	return s.String()
}

func (s *CreateAasEbcOrganizationUserResponse) SetReqMsgId(v string) *CreateAasEbcOrganizationUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAasEbcOrganizationUserResponse) SetResultCode(v string) *CreateAasEbcOrganizationUserResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAasEbcOrganizationUserResponse) SetResultMsg(v string) *CreateAasEbcOrganizationUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAasEbcOrganizationUserResponse) SetOrgUserId(v string) *CreateAasEbcOrganizationUserResponse {
	s.OrgUserId = &v
	return s
}

type CancelAasEbcPersonRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 个人id
	PersonDid *string `json:"person_did,omitempty" xml:"person_did,omitempty" maxLength:"128"`
}

func (s CancelAasEbcPersonRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelAasEbcPersonRequest) GoString() string {
	return s.String()
}

func (s *CancelAasEbcPersonRequest) SetAuthToken(v string) *CancelAasEbcPersonRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelAasEbcPersonRequest) SetProductInstanceId(v string) *CancelAasEbcPersonRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelAasEbcPersonRequest) SetRegionName(v string) *CancelAasEbcPersonRequest {
	s.RegionName = &v
	return s
}

func (s *CancelAasEbcPersonRequest) SetPersonDid(v string) *CancelAasEbcPersonRequest {
	s.PersonDid = &v
	return s
}

type CancelAasEbcPersonResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CancelAasEbcPersonResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelAasEbcPersonResponse) GoString() string {
	return s.String()
}

func (s *CancelAasEbcPersonResponse) SetReqMsgId(v string) *CancelAasEbcPersonResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelAasEbcPersonResponse) SetResultCode(v string) *CancelAasEbcPersonResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelAasEbcPersonResponse) SetResultMsg(v string) *CancelAasEbcPersonResponse {
	s.ResultMsg = &v
	return s
}

type ResumeAasEbcPersonRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 个人did
	PersonDid *string `json:"person_did,omitempty" xml:"person_did,omitempty" maxLength:"128"`
}

func (s ResumeAasEbcPersonRequest) String() string {
	return tea.Prettify(s)
}

func (s ResumeAasEbcPersonRequest) GoString() string {
	return s.String()
}

func (s *ResumeAasEbcPersonRequest) SetAuthToken(v string) *ResumeAasEbcPersonRequest {
	s.AuthToken = &v
	return s
}

func (s *ResumeAasEbcPersonRequest) SetProductInstanceId(v string) *ResumeAasEbcPersonRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ResumeAasEbcPersonRequest) SetRegionName(v string) *ResumeAasEbcPersonRequest {
	s.RegionName = &v
	return s
}

func (s *ResumeAasEbcPersonRequest) SetPersonDid(v string) *ResumeAasEbcPersonRequest {
	s.PersonDid = &v
	return s
}

type ResumeAasEbcPersonResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ResumeAasEbcPersonResponse) String() string {
	return tea.Prettify(s)
}

func (s ResumeAasEbcPersonResponse) GoString() string {
	return s.String()
}

func (s *ResumeAasEbcPersonResponse) SetReqMsgId(v string) *ResumeAasEbcPersonResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ResumeAasEbcPersonResponse) SetResultCode(v string) *ResumeAasEbcPersonResponse {
	s.ResultCode = &v
	return s
}

func (s *ResumeAasEbcPersonResponse) SetResultMsg(v string) *ResumeAasEbcPersonResponse {
	s.ResultMsg = &v
	return s
}

type CreateAasEbcOrganizationClassRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 加密属性描述列表
	//
	AttributeDescList []*AttributeDesc `json:"attribute_desc_list,omitempty" xml:"attribute_desc_list,omitempty" type:"Repeated"`
	// 班级容量
	Capacity *int64 `json:"capacity,omitempty" xml:"capacity,omitempty"`
	// 结束时间
	ClassEndTime *string `json:"class_end_time,omitempty" xml:"class_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 班级名称
	ClassName *string `json:"class_name,omitempty" xml:"class_name,omitempty" maxLength:"64"`
	// 开始时间
	ClassStartTime *string `json:"class_start_time,omitempty" xml:"class_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 1:有效、2:暂停、3:失效
	ClassStatus *int64 `json:"class_status,omitempty" xml:"class_status,omitempty"`
	// 企业id
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	// 1线上、2线下、3混合
	Type *int64 `json:"type,omitempty" xml:"type,omitempty"`
}

func (s CreateAasEbcOrganizationClassRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAasEbcOrganizationClassRequest) GoString() string {
	return s.String()
}

func (s *CreateAasEbcOrganizationClassRequest) SetAuthToken(v string) *CreateAasEbcOrganizationClassRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAasEbcOrganizationClassRequest) SetProductInstanceId(v string) *CreateAasEbcOrganizationClassRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAasEbcOrganizationClassRequest) SetRegionName(v string) *CreateAasEbcOrganizationClassRequest {
	s.RegionName = &v
	return s
}

func (s *CreateAasEbcOrganizationClassRequest) SetAttributeDescList(v []*AttributeDesc) *CreateAasEbcOrganizationClassRequest {
	s.AttributeDescList = v
	return s
}

func (s *CreateAasEbcOrganizationClassRequest) SetCapacity(v int64) *CreateAasEbcOrganizationClassRequest {
	s.Capacity = &v
	return s
}

func (s *CreateAasEbcOrganizationClassRequest) SetClassEndTime(v string) *CreateAasEbcOrganizationClassRequest {
	s.ClassEndTime = &v
	return s
}

func (s *CreateAasEbcOrganizationClassRequest) SetClassName(v string) *CreateAasEbcOrganizationClassRequest {
	s.ClassName = &v
	return s
}

func (s *CreateAasEbcOrganizationClassRequest) SetClassStartTime(v string) *CreateAasEbcOrganizationClassRequest {
	s.ClassStartTime = &v
	return s
}

func (s *CreateAasEbcOrganizationClassRequest) SetClassStatus(v int64) *CreateAasEbcOrganizationClassRequest {
	s.ClassStatus = &v
	return s
}

func (s *CreateAasEbcOrganizationClassRequest) SetOrgDid(v string) *CreateAasEbcOrganizationClassRequest {
	s.OrgDid = &v
	return s
}

func (s *CreateAasEbcOrganizationClassRequest) SetType(v int64) *CreateAasEbcOrganizationClassRequest {
	s.Type = &v
	return s
}

type CreateAasEbcOrganizationClassResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 班级id
	ClassId *string `json:"class_id,omitempty" xml:"class_id,omitempty"`
}

func (s CreateAasEbcOrganizationClassResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAasEbcOrganizationClassResponse) GoString() string {
	return s.String()
}

func (s *CreateAasEbcOrganizationClassResponse) SetReqMsgId(v string) *CreateAasEbcOrganizationClassResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAasEbcOrganizationClassResponse) SetResultCode(v string) *CreateAasEbcOrganizationClassResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAasEbcOrganizationClassResponse) SetResultMsg(v string) *CreateAasEbcOrganizationClassResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAasEbcOrganizationClassResponse) SetClassId(v string) *CreateAasEbcOrganizationClassResponse {
	s.ClassId = &v
	return s
}

type UpdateAasEbcOrganizationClassRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 加密属性描述列表
	//
	AttributeDescList []*AttributeDesc `json:"attribute_desc_list,omitempty" xml:"attribute_desc_list,omitempty" type:"Repeated"`
	// 容量
	Capacity *int64 `json:"capacity,omitempty" xml:"capacity,omitempty"`
	// 结束时间
	ClassEndTime *string `json:"class_end_time,omitempty" xml:"class_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 班级id
	ClassId *string `json:"class_id,omitempty" xml:"class_id,omitempty" maxLength:"128"`
	// 班级名称
	ClassName *string `json:"class_name,omitempty" xml:"class_name,omitempty" maxLength:"64"`
	// 开始时间
	ClassStartTime *string `json:"class_start_time,omitempty" xml:"class_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 1:有效、2:暂停、3:失效
	ClassStatus *int64 `json:"class_status,omitempty" xml:"class_status,omitempty"`
	// 企业did
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
}

func (s UpdateAasEbcOrganizationClassRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasEbcOrganizationClassRequest) GoString() string {
	return s.String()
}

func (s *UpdateAasEbcOrganizationClassRequest) SetAuthToken(v string) *UpdateAasEbcOrganizationClassRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAasEbcOrganizationClassRequest) SetProductInstanceId(v string) *UpdateAasEbcOrganizationClassRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAasEbcOrganizationClassRequest) SetRegionName(v string) *UpdateAasEbcOrganizationClassRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateAasEbcOrganizationClassRequest) SetAttributeDescList(v []*AttributeDesc) *UpdateAasEbcOrganizationClassRequest {
	s.AttributeDescList = v
	return s
}

func (s *UpdateAasEbcOrganizationClassRequest) SetCapacity(v int64) *UpdateAasEbcOrganizationClassRequest {
	s.Capacity = &v
	return s
}

func (s *UpdateAasEbcOrganizationClassRequest) SetClassEndTime(v string) *UpdateAasEbcOrganizationClassRequest {
	s.ClassEndTime = &v
	return s
}

func (s *UpdateAasEbcOrganizationClassRequest) SetClassId(v string) *UpdateAasEbcOrganizationClassRequest {
	s.ClassId = &v
	return s
}

func (s *UpdateAasEbcOrganizationClassRequest) SetClassName(v string) *UpdateAasEbcOrganizationClassRequest {
	s.ClassName = &v
	return s
}

func (s *UpdateAasEbcOrganizationClassRequest) SetClassStartTime(v string) *UpdateAasEbcOrganizationClassRequest {
	s.ClassStartTime = &v
	return s
}

func (s *UpdateAasEbcOrganizationClassRequest) SetClassStatus(v int64) *UpdateAasEbcOrganizationClassRequest {
	s.ClassStatus = &v
	return s
}

func (s *UpdateAasEbcOrganizationClassRequest) SetOrgDid(v string) *UpdateAasEbcOrganizationClassRequest {
	s.OrgDid = &v
	return s
}

type UpdateAasEbcOrganizationClassResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAasEbcOrganizationClassResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasEbcOrganizationClassResponse) GoString() string {
	return s.String()
}

func (s *UpdateAasEbcOrganizationClassResponse) SetReqMsgId(v string) *UpdateAasEbcOrganizationClassResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAasEbcOrganizationClassResponse) SetResultCode(v string) *UpdateAasEbcOrganizationClassResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAasEbcOrganizationClassResponse) SetResultMsg(v string) *UpdateAasEbcOrganizationClassResponse {
	s.ResultMsg = &v
	return s
}

type AddAasEbcClassUserRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 班级id
	ClassId *string `json:"class_id,omitempty" xml:"class_id,omitempty" maxLength:"128"`
	// 企业id
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	// 企业用户列表,最多一次传入50个
	OrgUserList []*OrgUser `json:"org_user_list,omitempty" xml:"org_user_list,omitempty" type:"Repeated"`
}

func (s AddAasEbcClassUserRequest) String() string {
	return tea.Prettify(s)
}

func (s AddAasEbcClassUserRequest) GoString() string {
	return s.String()
}

func (s *AddAasEbcClassUserRequest) SetAuthToken(v string) *AddAasEbcClassUserRequest {
	s.AuthToken = &v
	return s
}

func (s *AddAasEbcClassUserRequest) SetProductInstanceId(v string) *AddAasEbcClassUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddAasEbcClassUserRequest) SetRegionName(v string) *AddAasEbcClassUserRequest {
	s.RegionName = &v
	return s
}

func (s *AddAasEbcClassUserRequest) SetClassId(v string) *AddAasEbcClassUserRequest {
	s.ClassId = &v
	return s
}

func (s *AddAasEbcClassUserRequest) SetOrgDid(v string) *AddAasEbcClassUserRequest {
	s.OrgDid = &v
	return s
}

func (s *AddAasEbcClassUserRequest) SetOrgUserList(v []*OrgUser) *AddAasEbcClassUserRequest {
	s.OrgUserList = v
	return s
}

type AddAasEbcClassUserResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 加入失败的用户列表
	FailList []*OrgUser `json:"fail_list,omitempty" xml:"fail_list,omitempty" type:"Repeated"`
}

func (s AddAasEbcClassUserResponse) String() string {
	return tea.Prettify(s)
}

func (s AddAasEbcClassUserResponse) GoString() string {
	return s.String()
}

func (s *AddAasEbcClassUserResponse) SetReqMsgId(v string) *AddAasEbcClassUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddAasEbcClassUserResponse) SetResultCode(v string) *AddAasEbcClassUserResponse {
	s.ResultCode = &v
	return s
}

func (s *AddAasEbcClassUserResponse) SetResultMsg(v string) *AddAasEbcClassUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddAasEbcClassUserResponse) SetFailList(v []*OrgUser) *AddAasEbcClassUserResponse {
	s.FailList = v
	return s
}

type DeleteAasEbcClassUserRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 班级id
	ClassId *string `json:"class_id,omitempty" xml:"class_id,omitempty" maxLength:"128"`
	// 企业id
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	// 企业用户列表,最多一次传入50个
	OrgUserList []*OrgUser `json:"org_user_list,omitempty" xml:"org_user_list,omitempty" type:"Repeated"`
}

func (s DeleteAasEbcClassUserRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteAasEbcClassUserRequest) GoString() string {
	return s.String()
}

func (s *DeleteAasEbcClassUserRequest) SetAuthToken(v string) *DeleteAasEbcClassUserRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteAasEbcClassUserRequest) SetProductInstanceId(v string) *DeleteAasEbcClassUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteAasEbcClassUserRequest) SetRegionName(v string) *DeleteAasEbcClassUserRequest {
	s.RegionName = &v
	return s
}

func (s *DeleteAasEbcClassUserRequest) SetClassId(v string) *DeleteAasEbcClassUserRequest {
	s.ClassId = &v
	return s
}

func (s *DeleteAasEbcClassUserRequest) SetOrgDid(v string) *DeleteAasEbcClassUserRequest {
	s.OrgDid = &v
	return s
}

func (s *DeleteAasEbcClassUserRequest) SetOrgUserList(v []*OrgUser) *DeleteAasEbcClassUserRequest {
	s.OrgUserList = v
	return s
}

type DeleteAasEbcClassUserResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 删除失败的用户列表
	FailList []*OrgUser `json:"fail_list,omitempty" xml:"fail_list,omitempty" type:"Repeated"`
}

func (s DeleteAasEbcClassUserResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteAasEbcClassUserResponse) GoString() string {
	return s.String()
}

func (s *DeleteAasEbcClassUserResponse) SetReqMsgId(v string) *DeleteAasEbcClassUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteAasEbcClassUserResponse) SetResultCode(v string) *DeleteAasEbcClassUserResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteAasEbcClassUserResponse) SetResultMsg(v string) *DeleteAasEbcClassUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteAasEbcClassUserResponse) SetFailList(v []*OrgUser) *DeleteAasEbcClassUserResponse {
	s.FailList = v
	return s
}

type QueryAasEbcOrganizationClassRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 班级id
	ClassId *string `json:"class_id,omitempty" xml:"class_id,omitempty" maxLength:"128"`
	// 企业did
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
}

func (s QueryAasEbcOrganizationClassRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasEbcOrganizationClassRequest) GoString() string {
	return s.String()
}

func (s *QueryAasEbcOrganizationClassRequest) SetAuthToken(v string) *QueryAasEbcOrganizationClassRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasEbcOrganizationClassRequest) SetProductInstanceId(v string) *QueryAasEbcOrganizationClassRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasEbcOrganizationClassRequest) SetRegionName(v string) *QueryAasEbcOrganizationClassRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasEbcOrganizationClassRequest) SetClassId(v string) *QueryAasEbcOrganizationClassRequest {
	s.ClassId = &v
	return s
}

func (s *QueryAasEbcOrganizationClassRequest) SetOrgDid(v string) *QueryAasEbcOrganizationClassRequest {
	s.OrgDid = &v
	return s
}

type QueryAasEbcOrganizationClassResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 班级名称
	ClassName *string `json:"class_name,omitempty" xml:"class_name,omitempty"`
	// 1:有效、2:暂停、3:失效
	ClassStatus *int64 `json:"class_status,omitempty" xml:"class_status,omitempty"`
	// 创建时间
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 修改时间
	ModifyTime *string `json:"modify_time,omitempty" xml:"modify_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 累计时长
	Period *int64 `json:"period,omitempty" xml:"period,omitempty"`
	// 班级类型：线上、线下、混合
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 学员数量
	UserNum *int64 `json:"user_num,omitempty" xml:"user_num,omitempty"`
}

func (s QueryAasEbcOrganizationClassResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasEbcOrganizationClassResponse) GoString() string {
	return s.String()
}

func (s *QueryAasEbcOrganizationClassResponse) SetReqMsgId(v string) *QueryAasEbcOrganizationClassResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasEbcOrganizationClassResponse) SetResultCode(v string) *QueryAasEbcOrganizationClassResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasEbcOrganizationClassResponse) SetResultMsg(v string) *QueryAasEbcOrganizationClassResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasEbcOrganizationClassResponse) SetClassName(v string) *QueryAasEbcOrganizationClassResponse {
	s.ClassName = &v
	return s
}

func (s *QueryAasEbcOrganizationClassResponse) SetClassStatus(v int64) *QueryAasEbcOrganizationClassResponse {
	s.ClassStatus = &v
	return s
}

func (s *QueryAasEbcOrganizationClassResponse) SetCreateTime(v string) *QueryAasEbcOrganizationClassResponse {
	s.CreateTime = &v
	return s
}

func (s *QueryAasEbcOrganizationClassResponse) SetModifyTime(v string) *QueryAasEbcOrganizationClassResponse {
	s.ModifyTime = &v
	return s
}

func (s *QueryAasEbcOrganizationClassResponse) SetPeriod(v int64) *QueryAasEbcOrganizationClassResponse {
	s.Period = &v
	return s
}

func (s *QueryAasEbcOrganizationClassResponse) SetType(v string) *QueryAasEbcOrganizationClassResponse {
	s.Type = &v
	return s
}

func (s *QueryAasEbcOrganizationClassResponse) SetUserNum(v int64) *QueryAasEbcOrganizationClassResponse {
	s.UserNum = &v
	return s
}

type QueryAasEbcClassUserRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 班级id
	ClassId *string `json:"class_id,omitempty" xml:"class_id,omitempty" maxLength:"128"`
	// 企业did
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
}

func (s QueryAasEbcClassUserRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasEbcClassUserRequest) GoString() string {
	return s.String()
}

func (s *QueryAasEbcClassUserRequest) SetAuthToken(v string) *QueryAasEbcClassUserRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasEbcClassUserRequest) SetProductInstanceId(v string) *QueryAasEbcClassUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasEbcClassUserRequest) SetRegionName(v string) *QueryAasEbcClassUserRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasEbcClassUserRequest) SetClassId(v string) *QueryAasEbcClassUserRequest {
	s.ClassId = &v
	return s
}

func (s *QueryAasEbcClassUserRequest) SetOrgDid(v string) *QueryAasEbcClassUserRequest {
	s.OrgDid = &v
	return s
}

type QueryAasEbcClassUserResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 班级名称
	ClassName *string `json:"class_name,omitempty" xml:"class_name,omitempty"`
	// 企业用户id列表
	OrgUserIdList []*string `json:"org_user_id_list,omitempty" xml:"org_user_id_list,omitempty" type:"Repeated"`
	// 学员数量
	UserNum *int64 `json:"user_num,omitempty" xml:"user_num,omitempty"`
}

func (s QueryAasEbcClassUserResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasEbcClassUserResponse) GoString() string {
	return s.String()
}

func (s *QueryAasEbcClassUserResponse) SetReqMsgId(v string) *QueryAasEbcClassUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasEbcClassUserResponse) SetResultCode(v string) *QueryAasEbcClassUserResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasEbcClassUserResponse) SetResultMsg(v string) *QueryAasEbcClassUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasEbcClassUserResponse) SetClassName(v string) *QueryAasEbcClassUserResponse {
	s.ClassName = &v
	return s
}

func (s *QueryAasEbcClassUserResponse) SetOrgUserIdList(v []*string) *QueryAasEbcClassUserResponse {
	s.OrgUserIdList = v
	return s
}

func (s *QueryAasEbcClassUserResponse) SetUserNum(v int64) *QueryAasEbcClassUserResponse {
	s.UserNum = &v
	return s
}

type CreateAasEbcOrganizationCourseRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 课程结束时间
	CourseEndTime *string `json:"course_end_time,omitempty" xml:"course_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 课程名称
	CourseName *string `json:"course_name,omitempty" xml:"course_name,omitempty" maxLength:"64"`
	// 课程开始时间
	CourseStartTime *string `json:"course_start_time,omitempty" xml:"course_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 企业did
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	// 课程时长
	Period *int64 `json:"period,omitempty" xml:"period,omitempty"`
}

func (s CreateAasEbcOrganizationCourseRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAasEbcOrganizationCourseRequest) GoString() string {
	return s.String()
}

func (s *CreateAasEbcOrganizationCourseRequest) SetAuthToken(v string) *CreateAasEbcOrganizationCourseRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAasEbcOrganizationCourseRequest) SetProductInstanceId(v string) *CreateAasEbcOrganizationCourseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAasEbcOrganizationCourseRequest) SetRegionName(v string) *CreateAasEbcOrganizationCourseRequest {
	s.RegionName = &v
	return s
}

func (s *CreateAasEbcOrganizationCourseRequest) SetCourseEndTime(v string) *CreateAasEbcOrganizationCourseRequest {
	s.CourseEndTime = &v
	return s
}

func (s *CreateAasEbcOrganizationCourseRequest) SetCourseName(v string) *CreateAasEbcOrganizationCourseRequest {
	s.CourseName = &v
	return s
}

func (s *CreateAasEbcOrganizationCourseRequest) SetCourseStartTime(v string) *CreateAasEbcOrganizationCourseRequest {
	s.CourseStartTime = &v
	return s
}

func (s *CreateAasEbcOrganizationCourseRequest) SetOrgDid(v string) *CreateAasEbcOrganizationCourseRequest {
	s.OrgDid = &v
	return s
}

func (s *CreateAasEbcOrganizationCourseRequest) SetPeriod(v int64) *CreateAasEbcOrganizationCourseRequest {
	s.Period = &v
	return s
}

type CreateAasEbcOrganizationCourseResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 课程did
	CourseId *string `json:"course_id,omitempty" xml:"course_id,omitempty"`
}

func (s CreateAasEbcOrganizationCourseResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAasEbcOrganizationCourseResponse) GoString() string {
	return s.String()
}

func (s *CreateAasEbcOrganizationCourseResponse) SetReqMsgId(v string) *CreateAasEbcOrganizationCourseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAasEbcOrganizationCourseResponse) SetResultCode(v string) *CreateAasEbcOrganizationCourseResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAasEbcOrganizationCourseResponse) SetResultMsg(v string) *CreateAasEbcOrganizationCourseResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAasEbcOrganizationCourseResponse) SetCourseId(v string) *CreateAasEbcOrganizationCourseResponse {
	s.CourseId = &v
	return s
}

type UpdateAasEbcOrganizationCourseRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 课程结束时间
	CourseEndTime *string `json:"course_end_time,omitempty" xml:"course_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 课程id
	CourseId *string `json:"course_id,omitempty" xml:"course_id,omitempty" maxLength:"128"`
	// 课程名称
	CourseName *string `json:"course_name,omitempty" xml:"course_name,omitempty" maxLength:"64"`
	// 课程开始时间
	CourseStartTime *string `json:"course_start_time,omitempty" xml:"course_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 企业id
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	// 课程时长
	Period *int64 `json:"period,omitempty" xml:"period,omitempty"`
}

func (s UpdateAasEbcOrganizationCourseRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasEbcOrganizationCourseRequest) GoString() string {
	return s.String()
}

func (s *UpdateAasEbcOrganizationCourseRequest) SetAuthToken(v string) *UpdateAasEbcOrganizationCourseRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAasEbcOrganizationCourseRequest) SetProductInstanceId(v string) *UpdateAasEbcOrganizationCourseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAasEbcOrganizationCourseRequest) SetRegionName(v string) *UpdateAasEbcOrganizationCourseRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateAasEbcOrganizationCourseRequest) SetCourseEndTime(v string) *UpdateAasEbcOrganizationCourseRequest {
	s.CourseEndTime = &v
	return s
}

func (s *UpdateAasEbcOrganizationCourseRequest) SetCourseId(v string) *UpdateAasEbcOrganizationCourseRequest {
	s.CourseId = &v
	return s
}

func (s *UpdateAasEbcOrganizationCourseRequest) SetCourseName(v string) *UpdateAasEbcOrganizationCourseRequest {
	s.CourseName = &v
	return s
}

func (s *UpdateAasEbcOrganizationCourseRequest) SetCourseStartTime(v string) *UpdateAasEbcOrganizationCourseRequest {
	s.CourseStartTime = &v
	return s
}

func (s *UpdateAasEbcOrganizationCourseRequest) SetOrgDid(v string) *UpdateAasEbcOrganizationCourseRequest {
	s.OrgDid = &v
	return s
}

func (s *UpdateAasEbcOrganizationCourseRequest) SetPeriod(v int64) *UpdateAasEbcOrganizationCourseRequest {
	s.Period = &v
	return s
}

type UpdateAasEbcOrganizationCourseResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAasEbcOrganizationCourseResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasEbcOrganizationCourseResponse) GoString() string {
	return s.String()
}

func (s *UpdateAasEbcOrganizationCourseResponse) SetReqMsgId(v string) *UpdateAasEbcOrganizationCourseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAasEbcOrganizationCourseResponse) SetResultCode(v string) *UpdateAasEbcOrganizationCourseResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAasEbcOrganizationCourseResponse) SetResultMsg(v string) *UpdateAasEbcOrganizationCourseResponse {
	s.ResultMsg = &v
	return s
}

type AddAasEbcCourseClassRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 班级列表,最多一次传入50个
	ClassList []*Class `json:"class_list,omitempty" xml:"class_list,omitempty" type:"Repeated"`
	// 班级id
	CourseId *string `json:"course_id,omitempty" xml:"course_id,omitempty" maxLength:"128"`
	// 企业id
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
}

func (s AddAasEbcCourseClassRequest) String() string {
	return tea.Prettify(s)
}

func (s AddAasEbcCourseClassRequest) GoString() string {
	return s.String()
}

func (s *AddAasEbcCourseClassRequest) SetAuthToken(v string) *AddAasEbcCourseClassRequest {
	s.AuthToken = &v
	return s
}

func (s *AddAasEbcCourseClassRequest) SetProductInstanceId(v string) *AddAasEbcCourseClassRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddAasEbcCourseClassRequest) SetRegionName(v string) *AddAasEbcCourseClassRequest {
	s.RegionName = &v
	return s
}

func (s *AddAasEbcCourseClassRequest) SetClassList(v []*Class) *AddAasEbcCourseClassRequest {
	s.ClassList = v
	return s
}

func (s *AddAasEbcCourseClassRequest) SetCourseId(v string) *AddAasEbcCourseClassRequest {
	s.CourseId = &v
	return s
}

func (s *AddAasEbcCourseClassRequest) SetOrgDid(v string) *AddAasEbcCourseClassRequest {
	s.OrgDid = &v
	return s
}

type AddAasEbcCourseClassResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 添加失败的班级列表
	FailList []*Class `json:"fail_list,omitempty" xml:"fail_list,omitempty" type:"Repeated"`
}

func (s AddAasEbcCourseClassResponse) String() string {
	return tea.Prettify(s)
}

func (s AddAasEbcCourseClassResponse) GoString() string {
	return s.String()
}

func (s *AddAasEbcCourseClassResponse) SetReqMsgId(v string) *AddAasEbcCourseClassResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddAasEbcCourseClassResponse) SetResultCode(v string) *AddAasEbcCourseClassResponse {
	s.ResultCode = &v
	return s
}

func (s *AddAasEbcCourseClassResponse) SetResultMsg(v string) *AddAasEbcCourseClassResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddAasEbcCourseClassResponse) SetFailList(v []*Class) *AddAasEbcCourseClassResponse {
	s.FailList = v
	return s
}

type AddAasEbcCourseUserRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 课程id
	CourseId *string `json:"course_id,omitempty" xml:"course_id,omitempty" maxLength:"128"`
	// 企业id
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	// 企业用户列表,最多一次传入50个
	OrgUserList []*OrgUser `json:"org_user_list,omitempty" xml:"org_user_list,omitempty" type:"Repeated"`
}

func (s AddAasEbcCourseUserRequest) String() string {
	return tea.Prettify(s)
}

func (s AddAasEbcCourseUserRequest) GoString() string {
	return s.String()
}

func (s *AddAasEbcCourseUserRequest) SetAuthToken(v string) *AddAasEbcCourseUserRequest {
	s.AuthToken = &v
	return s
}

func (s *AddAasEbcCourseUserRequest) SetProductInstanceId(v string) *AddAasEbcCourseUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddAasEbcCourseUserRequest) SetRegionName(v string) *AddAasEbcCourseUserRequest {
	s.RegionName = &v
	return s
}

func (s *AddAasEbcCourseUserRequest) SetCourseId(v string) *AddAasEbcCourseUserRequest {
	s.CourseId = &v
	return s
}

func (s *AddAasEbcCourseUserRequest) SetOrgDid(v string) *AddAasEbcCourseUserRequest {
	s.OrgDid = &v
	return s
}

func (s *AddAasEbcCourseUserRequest) SetOrgUserList(v []*OrgUser) *AddAasEbcCourseUserRequest {
	s.OrgUserList = v
	return s
}

type AddAasEbcCourseUserResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 添加失败的用户列表
	FailList []*OrgUser `json:"fail_list,omitempty" xml:"fail_list,omitempty" type:"Repeated"`
}

func (s AddAasEbcCourseUserResponse) String() string {
	return tea.Prettify(s)
}

func (s AddAasEbcCourseUserResponse) GoString() string {
	return s.String()
}

func (s *AddAasEbcCourseUserResponse) SetReqMsgId(v string) *AddAasEbcCourseUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddAasEbcCourseUserResponse) SetResultCode(v string) *AddAasEbcCourseUserResponse {
	s.ResultCode = &v
	return s
}

func (s *AddAasEbcCourseUserResponse) SetResultMsg(v string) *AddAasEbcCourseUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddAasEbcCourseUserResponse) SetFailList(v []*OrgUser) *AddAasEbcCourseUserResponse {
	s.FailList = v
	return s
}

type DeleteAasEbcCourseClassRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 班级列表,最多一次传入50个
	ClassList []*Class `json:"class_list,omitempty" xml:"class_list,omitempty" type:"Repeated"`
	// 课程id
	CourseId *string `json:"course_id,omitempty" xml:"course_id,omitempty" maxLength:"128"`
	// 企业id
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
}

func (s DeleteAasEbcCourseClassRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteAasEbcCourseClassRequest) GoString() string {
	return s.String()
}

func (s *DeleteAasEbcCourseClassRequest) SetAuthToken(v string) *DeleteAasEbcCourseClassRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteAasEbcCourseClassRequest) SetProductInstanceId(v string) *DeleteAasEbcCourseClassRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteAasEbcCourseClassRequest) SetRegionName(v string) *DeleteAasEbcCourseClassRequest {
	s.RegionName = &v
	return s
}

func (s *DeleteAasEbcCourseClassRequest) SetClassList(v []*Class) *DeleteAasEbcCourseClassRequest {
	s.ClassList = v
	return s
}

func (s *DeleteAasEbcCourseClassRequest) SetCourseId(v string) *DeleteAasEbcCourseClassRequest {
	s.CourseId = &v
	return s
}

func (s *DeleteAasEbcCourseClassRequest) SetOrgDid(v string) *DeleteAasEbcCourseClassRequest {
	s.OrgDid = &v
	return s
}

type DeleteAasEbcCourseClassResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 删除失败的班级列表
	FailList []*Class `json:"fail_list,omitempty" xml:"fail_list,omitempty" type:"Repeated"`
}

func (s DeleteAasEbcCourseClassResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteAasEbcCourseClassResponse) GoString() string {
	return s.String()
}

func (s *DeleteAasEbcCourseClassResponse) SetReqMsgId(v string) *DeleteAasEbcCourseClassResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteAasEbcCourseClassResponse) SetResultCode(v string) *DeleteAasEbcCourseClassResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteAasEbcCourseClassResponse) SetResultMsg(v string) *DeleteAasEbcCourseClassResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteAasEbcCourseClassResponse) SetFailList(v []*Class) *DeleteAasEbcCourseClassResponse {
	s.FailList = v
	return s
}

type DeleteAasEbcCourseUserRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 课程id
	CourseId *string `json:"course_id,omitempty" xml:"course_id,omitempty" maxLength:"128"`
	// 企业id
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	// 企业用户列表,最多一次传入50个
	OrgUserList []*OrgUser `json:"org_user_list,omitempty" xml:"org_user_list,omitempty" type:"Repeated"`
}

func (s DeleteAasEbcCourseUserRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteAasEbcCourseUserRequest) GoString() string {
	return s.String()
}

func (s *DeleteAasEbcCourseUserRequest) SetAuthToken(v string) *DeleteAasEbcCourseUserRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteAasEbcCourseUserRequest) SetProductInstanceId(v string) *DeleteAasEbcCourseUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteAasEbcCourseUserRequest) SetRegionName(v string) *DeleteAasEbcCourseUserRequest {
	s.RegionName = &v
	return s
}

func (s *DeleteAasEbcCourseUserRequest) SetCourseId(v string) *DeleteAasEbcCourseUserRequest {
	s.CourseId = &v
	return s
}

func (s *DeleteAasEbcCourseUserRequest) SetOrgDid(v string) *DeleteAasEbcCourseUserRequest {
	s.OrgDid = &v
	return s
}

func (s *DeleteAasEbcCourseUserRequest) SetOrgUserList(v []*OrgUser) *DeleteAasEbcCourseUserRequest {
	s.OrgUserList = v
	return s
}

type DeleteAasEbcCourseUserResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 删除失败的用户列表
	FailList []*OrgUser `json:"fail_list,omitempty" xml:"fail_list,omitempty" type:"Repeated"`
}

func (s DeleteAasEbcCourseUserResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteAasEbcCourseUserResponse) GoString() string {
	return s.String()
}

func (s *DeleteAasEbcCourseUserResponse) SetReqMsgId(v string) *DeleteAasEbcCourseUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteAasEbcCourseUserResponse) SetResultCode(v string) *DeleteAasEbcCourseUserResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteAasEbcCourseUserResponse) SetResultMsg(v string) *DeleteAasEbcCourseUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteAasEbcCourseUserResponse) SetFailList(v []*OrgUser) *DeleteAasEbcCourseUserResponse {
	s.FailList = v
	return s
}

type CreateAasEbcUserCertRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 加密属性描述列表
	AttributeDescList []*AttributeDesc `json:"attribute_desc_list,omitempty" xml:"attribute_desc_list,omitempty" type:"Repeated"`
	// 证书编号
	CertCode *string `json:"cert_code,omitempty" xml:"cert_code,omitempty" maxLength:"64"`
	// 时间周期结束时间
	CertEndTime *string `json:"cert_end_time,omitempty" xml:"cert_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 证书名称-中文
	CertNameCn *string `json:"cert_name_cn,omitempty" xml:"cert_name_cn,omitempty" maxLength:"64"`
	// 证书名称-英文（拼音）
	CertNameEn *string `json:"cert_name_en,omitempty" xml:"cert_name_en,omitempty" maxLength:"64"`
	// 首次发布时间
	CertPublishTime *string `json:"cert_publish_time,omitempty" xml:"cert_publish_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 时间周期开始时间
	CertStartTime *string `json:"cert_start_time,omitempty" xml:"cert_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 1-有效 2-冻结 3-失效 4-作废 5-其他
	CertStatus *int64 `json:"cert_status,omitempty" xml:"cert_status,omitempty"`
	// 证书归属国家 使用“ISO 3166-1”代码表-数字码 https://zh.wikipedia.org/wiki/ISO_3166-1
	Country *string `json:"country,omitempty" xml:"country,omitempty" maxLength:"32"`
	// 有效期类型1.长期有效 2.时间周期
	ExpireType *int64 `json:"expire_type,omitempty" xml:"expire_type,omitempty"`
	// 证书持有人姓名
	//
	HolderName *string `json:"holder_name,omitempty" xml:"holder_name,omitempty" maxLength:"64"`
	// 证书等级类型： 初级（五级）、中级（四级）、高级（三级）、技师（二级）和高级技师（一级）、其他
	Level *string `json:"level,omitempty" xml:"level,omitempty" maxLength:"32"`
	// 企业id
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	// 企业名称
	OrgName *string `json:"org_name,omitempty" xml:"org_name,omitempty" maxLength:"64"`
	// 企业用户id
	OrgUserId *string `json:"org_user_id,omitempty" xml:"org_user_id,omitempty" maxLength:"128"`
	// 持有人主证件编号，无身份证的个人使用0000000000000000
	// 请使用我们提供的公钥对数据进行加密
	//
	PrimaryIdNo *string `json:"primary_id_no,omitempty" xml:"primary_id_no,omitempty" maxLength:"1024"`
	// 持有人辅助证件编号-1
	// 请使用我们提供的公钥对数据进行加密
	SecondIdNo1 *string `json:"second_id_no_1,omitempty" xml:"second_id_no_1,omitempty" maxLength:"1024"`
	// 持有人辅助证件编号-2
	// 请使用我们提供的公钥对数据进行加密
	SecondIdNo2 *string `json:"second_id_no_2,omitempty" xml:"second_id_no_2,omitempty" maxLength:"1024"`
	// 持有人辅助证件编号-3
	// 请使用我们提供的公钥对数据进行加密
	SecondIdNo3 *string `json:"second_id_no_3,omitempty" xml:"second_id_no_3,omitempty" maxLength:"1024"`
	// -数字码类型为156时可使用如下类目： --学历证书-XLZ --职业证书--ZYZ -其他国家传入--QT
	Type *string `json:"type,omitempty" xml:"type,omitempty" maxLength:"64"`
}

func (s CreateAasEbcUserCertRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAasEbcUserCertRequest) GoString() string {
	return s.String()
}

func (s *CreateAasEbcUserCertRequest) SetAuthToken(v string) *CreateAasEbcUserCertRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAasEbcUserCertRequest) SetProductInstanceId(v string) *CreateAasEbcUserCertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAasEbcUserCertRequest) SetRegionName(v string) *CreateAasEbcUserCertRequest {
	s.RegionName = &v
	return s
}

func (s *CreateAasEbcUserCertRequest) SetAttributeDescList(v []*AttributeDesc) *CreateAasEbcUserCertRequest {
	s.AttributeDescList = v
	return s
}

func (s *CreateAasEbcUserCertRequest) SetCertCode(v string) *CreateAasEbcUserCertRequest {
	s.CertCode = &v
	return s
}

func (s *CreateAasEbcUserCertRequest) SetCertEndTime(v string) *CreateAasEbcUserCertRequest {
	s.CertEndTime = &v
	return s
}

func (s *CreateAasEbcUserCertRequest) SetCertNameCn(v string) *CreateAasEbcUserCertRequest {
	s.CertNameCn = &v
	return s
}

func (s *CreateAasEbcUserCertRequest) SetCertNameEn(v string) *CreateAasEbcUserCertRequest {
	s.CertNameEn = &v
	return s
}

func (s *CreateAasEbcUserCertRequest) SetCertPublishTime(v string) *CreateAasEbcUserCertRequest {
	s.CertPublishTime = &v
	return s
}

func (s *CreateAasEbcUserCertRequest) SetCertStartTime(v string) *CreateAasEbcUserCertRequest {
	s.CertStartTime = &v
	return s
}

func (s *CreateAasEbcUserCertRequest) SetCertStatus(v int64) *CreateAasEbcUserCertRequest {
	s.CertStatus = &v
	return s
}

func (s *CreateAasEbcUserCertRequest) SetCountry(v string) *CreateAasEbcUserCertRequest {
	s.Country = &v
	return s
}

func (s *CreateAasEbcUserCertRequest) SetExpireType(v int64) *CreateAasEbcUserCertRequest {
	s.ExpireType = &v
	return s
}

func (s *CreateAasEbcUserCertRequest) SetHolderName(v string) *CreateAasEbcUserCertRequest {
	s.HolderName = &v
	return s
}

func (s *CreateAasEbcUserCertRequest) SetLevel(v string) *CreateAasEbcUserCertRequest {
	s.Level = &v
	return s
}

func (s *CreateAasEbcUserCertRequest) SetOrgDid(v string) *CreateAasEbcUserCertRequest {
	s.OrgDid = &v
	return s
}

func (s *CreateAasEbcUserCertRequest) SetOrgName(v string) *CreateAasEbcUserCertRequest {
	s.OrgName = &v
	return s
}

func (s *CreateAasEbcUserCertRequest) SetOrgUserId(v string) *CreateAasEbcUserCertRequest {
	s.OrgUserId = &v
	return s
}

func (s *CreateAasEbcUserCertRequest) SetPrimaryIdNo(v string) *CreateAasEbcUserCertRequest {
	s.PrimaryIdNo = &v
	return s
}

func (s *CreateAasEbcUserCertRequest) SetSecondIdNo1(v string) *CreateAasEbcUserCertRequest {
	s.SecondIdNo1 = &v
	return s
}

func (s *CreateAasEbcUserCertRequest) SetSecondIdNo2(v string) *CreateAasEbcUserCertRequest {
	s.SecondIdNo2 = &v
	return s
}

func (s *CreateAasEbcUserCertRequest) SetSecondIdNo3(v string) *CreateAasEbcUserCertRequest {
	s.SecondIdNo3 = &v
	return s
}

func (s *CreateAasEbcUserCertRequest) SetType(v string) *CreateAasEbcUserCertRequest {
	s.Type = &v
	return s
}

type CreateAasEbcUserCertResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 证书id
	CertId *string `json:"cert_id,omitempty" xml:"cert_id,omitempty"`
}

func (s CreateAasEbcUserCertResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAasEbcUserCertResponse) GoString() string {
	return s.String()
}

func (s *CreateAasEbcUserCertResponse) SetReqMsgId(v string) *CreateAasEbcUserCertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAasEbcUserCertResponse) SetResultCode(v string) *CreateAasEbcUserCertResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAasEbcUserCertResponse) SetResultMsg(v string) *CreateAasEbcUserCertResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAasEbcUserCertResponse) SetCertId(v string) *CreateAasEbcUserCertResponse {
	s.CertId = &v
	return s
}

type UpdateAasEbcUserCertRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 加密属性描述列表
	//
	AttributeDescList []*AttributeDesc `json:"attribute_desc_list,omitempty" xml:"attribute_desc_list,omitempty" type:"Repeated"`
	// 证书id
	CertId *string `json:"cert_id,omitempty" xml:"cert_id,omitempty" maxLength:"128"`
	// 首次发布时间
	CertPublishTime *string `json:"cert_publish_time,omitempty" xml:"cert_publish_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 1-有效 2-冻结 3-失效 4-作废 5-其他
	CertStatus *int64 `json:"cert_status,omitempty" xml:"cert_status,omitempty"`
	// 企业did
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	// 企业用户id
	OrgUserId *string `json:"org_user_id,omitempty" xml:"org_user_id,omitempty" maxLength:"128"`
}

func (s UpdateAasEbcUserCertRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasEbcUserCertRequest) GoString() string {
	return s.String()
}

func (s *UpdateAasEbcUserCertRequest) SetAuthToken(v string) *UpdateAasEbcUserCertRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAasEbcUserCertRequest) SetProductInstanceId(v string) *UpdateAasEbcUserCertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAasEbcUserCertRequest) SetRegionName(v string) *UpdateAasEbcUserCertRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateAasEbcUserCertRequest) SetAttributeDescList(v []*AttributeDesc) *UpdateAasEbcUserCertRequest {
	s.AttributeDescList = v
	return s
}

func (s *UpdateAasEbcUserCertRequest) SetCertId(v string) *UpdateAasEbcUserCertRequest {
	s.CertId = &v
	return s
}

func (s *UpdateAasEbcUserCertRequest) SetCertPublishTime(v string) *UpdateAasEbcUserCertRequest {
	s.CertPublishTime = &v
	return s
}

func (s *UpdateAasEbcUserCertRequest) SetCertStatus(v int64) *UpdateAasEbcUserCertRequest {
	s.CertStatus = &v
	return s
}

func (s *UpdateAasEbcUserCertRequest) SetOrgDid(v string) *UpdateAasEbcUserCertRequest {
	s.OrgDid = &v
	return s
}

func (s *UpdateAasEbcUserCertRequest) SetOrgUserId(v string) *UpdateAasEbcUserCertRequest {
	s.OrgUserId = &v
	return s
}

type UpdateAasEbcUserCertResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAasEbcUserCertResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasEbcUserCertResponse) GoString() string {
	return s.String()
}

func (s *UpdateAasEbcUserCertResponse) SetReqMsgId(v string) *UpdateAasEbcUserCertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAasEbcUserCertResponse) SetResultCode(v string) *UpdateAasEbcUserCertResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAasEbcUserCertResponse) SetResultMsg(v string) *UpdateAasEbcUserCertResponse {
	s.ResultMsg = &v
	return s
}

type QueryAasEbcOrganizationCertRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 查询结束时间
	End *string `json:"end,omitempty" xml:"end,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 企业id
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	// 开始时间
	Start *string `json:"start,omitempty" xml:"start,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
}

func (s QueryAasEbcOrganizationCertRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasEbcOrganizationCertRequest) GoString() string {
	return s.String()
}

func (s *QueryAasEbcOrganizationCertRequest) SetAuthToken(v string) *QueryAasEbcOrganizationCertRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasEbcOrganizationCertRequest) SetProductInstanceId(v string) *QueryAasEbcOrganizationCertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasEbcOrganizationCertRequest) SetRegionName(v string) *QueryAasEbcOrganizationCertRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasEbcOrganizationCertRequest) SetEnd(v string) *QueryAasEbcOrganizationCertRequest {
	s.End = &v
	return s
}

func (s *QueryAasEbcOrganizationCertRequest) SetOrgDid(v string) *QueryAasEbcOrganizationCertRequest {
	s.OrgDid = &v
	return s
}

func (s *QueryAasEbcOrganizationCertRequest) SetStart(v string) *QueryAasEbcOrganizationCertRequest {
	s.Start = &v
	return s
}

type QueryAasEbcOrganizationCertResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 证书id
	CertIdList []*string `json:"cert_id_list,omitempty" xml:"cert_id_list,omitempty" type:"Repeated"`
}

func (s QueryAasEbcOrganizationCertResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasEbcOrganizationCertResponse) GoString() string {
	return s.String()
}

func (s *QueryAasEbcOrganizationCertResponse) SetReqMsgId(v string) *QueryAasEbcOrganizationCertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasEbcOrganizationCertResponse) SetResultCode(v string) *QueryAasEbcOrganizationCertResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasEbcOrganizationCertResponse) SetResultMsg(v string) *QueryAasEbcOrganizationCertResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasEbcOrganizationCertResponse) SetCertIdList(v []*string) *QueryAasEbcOrganizationCertResponse {
	s.CertIdList = v
	return s
}

type QueryAasEbcUserCertRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 企业did
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	// 企业用户id
	OrgUserId *string `json:"org_user_id,omitempty" xml:"org_user_id,omitempty" maxLength:"128"`
}

func (s QueryAasEbcUserCertRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasEbcUserCertRequest) GoString() string {
	return s.String()
}

func (s *QueryAasEbcUserCertRequest) SetAuthToken(v string) *QueryAasEbcUserCertRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasEbcUserCertRequest) SetProductInstanceId(v string) *QueryAasEbcUserCertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasEbcUserCertRequest) SetRegionName(v string) *QueryAasEbcUserCertRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasEbcUserCertRequest) SetOrgDid(v string) *QueryAasEbcUserCertRequest {
	s.OrgDid = &v
	return s
}

func (s *QueryAasEbcUserCertRequest) SetOrgUserId(v string) *QueryAasEbcUserCertRequest {
	s.OrgUserId = &v
	return s
}

type QueryAasEbcUserCertResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 证书id列表
	CertIdList []*string `json:"cert_id_list,omitempty" xml:"cert_id_list,omitempty" type:"Repeated"`
}

func (s QueryAasEbcUserCertResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasEbcUserCertResponse) GoString() string {
	return s.String()
}

func (s *QueryAasEbcUserCertResponse) SetReqMsgId(v string) *QueryAasEbcUserCertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasEbcUserCertResponse) SetResultCode(v string) *QueryAasEbcUserCertResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasEbcUserCertResponse) SetResultMsg(v string) *QueryAasEbcUserCertResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasEbcUserCertResponse) SetCertIdList(v []*string) *QueryAasEbcUserCertResponse {
	s.CertIdList = v
	return s
}

type QueryAasEbcCertRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 证书id
	CertId *string `json:"cert_id,omitempty" xml:"cert_id,omitempty" maxLength:"128"`
	// 企业did
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
}

func (s QueryAasEbcCertRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasEbcCertRequest) GoString() string {
	return s.String()
}

func (s *QueryAasEbcCertRequest) SetAuthToken(v string) *QueryAasEbcCertRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasEbcCertRequest) SetProductInstanceId(v string) *QueryAasEbcCertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasEbcCertRequest) SetRegionName(v string) *QueryAasEbcCertRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasEbcCertRequest) SetCertId(v string) *QueryAasEbcCertRequest {
	s.CertId = &v
	return s
}

func (s *QueryAasEbcCertRequest) SetOrgDid(v string) *QueryAasEbcCertRequest {
	s.OrgDid = &v
	return s
}

type QueryAasEbcCertResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 证书明细
	Cert *Cert `json:"cert,omitempty" xml:"cert,omitempty"`
}

func (s QueryAasEbcCertResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasEbcCertResponse) GoString() string {
	return s.String()
}

func (s *QueryAasEbcCertResponse) SetReqMsgId(v string) *QueryAasEbcCertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasEbcCertResponse) SetResultCode(v string) *QueryAasEbcCertResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasEbcCertResponse) SetResultMsg(v string) *QueryAasEbcCertResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasEbcCertResponse) SetCert(v *Cert) *QueryAasEbcCertResponse {
	s.Cert = v
	return s
}

type ApplyAasEbcCertUrlRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 证书code
	CertCode *string `json:"cert_code,omitempty" xml:"cert_code,omitempty" maxLength:"128"`
	// 机构did
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	// 证书持有人id
	OrgUserId *string `json:"org_user_id,omitempty" xml:"org_user_id,omitempty"`
}

func (s ApplyAasEbcCertUrlRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyAasEbcCertUrlRequest) GoString() string {
	return s.String()
}

func (s *ApplyAasEbcCertUrlRequest) SetAuthToken(v string) *ApplyAasEbcCertUrlRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyAasEbcCertUrlRequest) SetProductInstanceId(v string) *ApplyAasEbcCertUrlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyAasEbcCertUrlRequest) SetRegionName(v string) *ApplyAasEbcCertUrlRequest {
	s.RegionName = &v
	return s
}

func (s *ApplyAasEbcCertUrlRequest) SetCertCode(v string) *ApplyAasEbcCertUrlRequest {
	s.CertCode = &v
	return s
}

func (s *ApplyAasEbcCertUrlRequest) SetOrgDid(v string) *ApplyAasEbcCertUrlRequest {
	s.OrgDid = &v
	return s
}

func (s *ApplyAasEbcCertUrlRequest) SetOrgUserId(v string) *ApplyAasEbcCertUrlRequest {
	s.OrgUserId = &v
	return s
}

type ApplyAasEbcCertUrlResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实体证书图片上传url，文件最大5M
	CertUploadUrl *string `json:"cert_upload_url,omitempty" xml:"cert_upload_url,omitempty"`
	// 其他信息文件上传url，文件最大5M
	//
	FeatureUploadUrl *string `json:"feature_upload_url,omitempty" xml:"feature_upload_url,omitempty"`
	// 持有人的人脸图像上传url，文件最大5M
	HolderAvatarUploadUrl *string `json:"holder_avatar_upload_url,omitempty" xml:"holder_avatar_upload_url,omitempty"`
}

func (s ApplyAasEbcCertUrlResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyAasEbcCertUrlResponse) GoString() string {
	return s.String()
}

func (s *ApplyAasEbcCertUrlResponse) SetReqMsgId(v string) *ApplyAasEbcCertUrlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyAasEbcCertUrlResponse) SetResultCode(v string) *ApplyAasEbcCertUrlResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyAasEbcCertUrlResponse) SetResultMsg(v string) *ApplyAasEbcCertUrlResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyAasEbcCertUrlResponse) SetCertUploadUrl(v string) *ApplyAasEbcCertUrlResponse {
	s.CertUploadUrl = &v
	return s
}

func (s *ApplyAasEbcCertUrlResponse) SetFeatureUploadUrl(v string) *ApplyAasEbcCertUrlResponse {
	s.FeatureUploadUrl = &v
	return s
}

func (s *ApplyAasEbcCertUrlResponse) SetHolderAvatarUploadUrl(v string) *ApplyAasEbcCertUrlResponse {
	s.HolderAvatarUploadUrl = &v
	return s
}

type CreateAasEbcAuthRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 授权关系结束时间
	AuthEndTime *string `json:"auth_end_time,omitempty" xml:"auth_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 授权关系开始时间
	AuthStartTime *string `json:"auth_start_time,omitempty" xml:"auth_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 1:身份数据，2:机构数据，3：课程数据，4：班级数据，5：证书数据
	DataType *int64 `json:"data_type,omitempty" xml:"data_type,omitempty"`
	// 授权目标数据id列表，最多20个
	TargetIdList []*string `json:"target_id_list,omitempty" xml:"target_id_list,omitempty" type:"Repeated"`
	// 1.数据,2.机构,3.认证方,4.ALL
	TargetType *int64 `json:"target_type,omitempty" xml:"target_type,omitempty"`
	// 消费方租户id
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty" maxLength:"64"`
}

func (s CreateAasEbcAuthRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAasEbcAuthRequest) GoString() string {
	return s.String()
}

func (s *CreateAasEbcAuthRequest) SetAuthToken(v string) *CreateAasEbcAuthRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAasEbcAuthRequest) SetProductInstanceId(v string) *CreateAasEbcAuthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAasEbcAuthRequest) SetRegionName(v string) *CreateAasEbcAuthRequest {
	s.RegionName = &v
	return s
}

func (s *CreateAasEbcAuthRequest) SetAuthEndTime(v string) *CreateAasEbcAuthRequest {
	s.AuthEndTime = &v
	return s
}

func (s *CreateAasEbcAuthRequest) SetAuthStartTime(v string) *CreateAasEbcAuthRequest {
	s.AuthStartTime = &v
	return s
}

func (s *CreateAasEbcAuthRequest) SetDataType(v int64) *CreateAasEbcAuthRequest {
	s.DataType = &v
	return s
}

func (s *CreateAasEbcAuthRequest) SetTargetIdList(v []*string) *CreateAasEbcAuthRequest {
	s.TargetIdList = v
	return s
}

func (s *CreateAasEbcAuthRequest) SetTargetType(v int64) *CreateAasEbcAuthRequest {
	s.TargetType = &v
	return s
}

func (s *CreateAasEbcAuthRequest) SetTenantName(v string) *CreateAasEbcAuthRequest {
	s.TenantName = &v
	return s
}

type CreateAasEbcAuthResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权关系id
	AuthId *string `json:"auth_id,omitempty" xml:"auth_id,omitempty"`
}

func (s CreateAasEbcAuthResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAasEbcAuthResponse) GoString() string {
	return s.String()
}

func (s *CreateAasEbcAuthResponse) SetReqMsgId(v string) *CreateAasEbcAuthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAasEbcAuthResponse) SetResultCode(v string) *CreateAasEbcAuthResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAasEbcAuthResponse) SetResultMsg(v string) *CreateAasEbcAuthResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAasEbcAuthResponse) SetAuthId(v string) *CreateAasEbcAuthResponse {
	s.AuthId = &v
	return s
}

type UpdateAasEbcAuthRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 授权关系结束时间
	//
	AuthEndTime *string `json:"auth_end_time,omitempty" xml:"auth_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 授权关系id
	AuthId *string `json:"auth_id,omitempty" xml:"auth_id,omitempty" maxLength:"256"`
	// 授权关系开始时间
	//
	AuthStartTime *string `json:"auth_start_time,omitempty" xml:"auth_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 1:身份数据，2:机构数据，3：课程数据，4：班级数据，5：证书数据
	DataType *int64 `json:"data_type,omitempty" xml:"data_type,omitempty"`
	// 授权目标数据id列表，最多20个
	TargetIdList []*string `json:"target_id_list,omitempty" xml:"target_id_list,omitempty" type:"Repeated"`
	// 1.数据,2.机构,3.认证方,4.ALL
	//
	TargetType *int64 `json:"target_type,omitempty" xml:"target_type,omitempty"`
	// 消费方租户id
	//
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty" maxLength:"64"`
}

func (s UpdateAasEbcAuthRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasEbcAuthRequest) GoString() string {
	return s.String()
}

func (s *UpdateAasEbcAuthRequest) SetAuthToken(v string) *UpdateAasEbcAuthRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAasEbcAuthRequest) SetProductInstanceId(v string) *UpdateAasEbcAuthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAasEbcAuthRequest) SetRegionName(v string) *UpdateAasEbcAuthRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateAasEbcAuthRequest) SetAuthEndTime(v string) *UpdateAasEbcAuthRequest {
	s.AuthEndTime = &v
	return s
}

func (s *UpdateAasEbcAuthRequest) SetAuthId(v string) *UpdateAasEbcAuthRequest {
	s.AuthId = &v
	return s
}

func (s *UpdateAasEbcAuthRequest) SetAuthStartTime(v string) *UpdateAasEbcAuthRequest {
	s.AuthStartTime = &v
	return s
}

func (s *UpdateAasEbcAuthRequest) SetDataType(v int64) *UpdateAasEbcAuthRequest {
	s.DataType = &v
	return s
}

func (s *UpdateAasEbcAuthRequest) SetTargetIdList(v []*string) *UpdateAasEbcAuthRequest {
	s.TargetIdList = v
	return s
}

func (s *UpdateAasEbcAuthRequest) SetTargetType(v int64) *UpdateAasEbcAuthRequest {
	s.TargetType = &v
	return s
}

func (s *UpdateAasEbcAuthRequest) SetTenantName(v string) *UpdateAasEbcAuthRequest {
	s.TenantName = &v
	return s
}

type UpdateAasEbcAuthResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAasEbcAuthResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasEbcAuthResponse) GoString() string {
	return s.String()
}

func (s *UpdateAasEbcAuthResponse) SetReqMsgId(v string) *UpdateAasEbcAuthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAasEbcAuthResponse) SetResultCode(v string) *UpdateAasEbcAuthResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAasEbcAuthResponse) SetResultMsg(v string) *UpdateAasEbcAuthResponse {
	s.ResultMsg = &v
	return s
}

type UpdateAasEbcAuthStatusRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 授权关系id
	//
	AuthId *string `json:"auth_id,omitempty" xml:"auth_id,omitempty" maxLength:"256"`
	// 1:启用，2：禁用，3：停用
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
	// 消费方租户id
	//
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty" maxLength:"64"`
}

func (s UpdateAasEbcAuthStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasEbcAuthStatusRequest) GoString() string {
	return s.String()
}

func (s *UpdateAasEbcAuthStatusRequest) SetAuthToken(v string) *UpdateAasEbcAuthStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAasEbcAuthStatusRequest) SetProductInstanceId(v string) *UpdateAasEbcAuthStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAasEbcAuthStatusRequest) SetRegionName(v string) *UpdateAasEbcAuthStatusRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateAasEbcAuthStatusRequest) SetAuthId(v string) *UpdateAasEbcAuthStatusRequest {
	s.AuthId = &v
	return s
}

func (s *UpdateAasEbcAuthStatusRequest) SetStatus(v int64) *UpdateAasEbcAuthStatusRequest {
	s.Status = &v
	return s
}

func (s *UpdateAasEbcAuthStatusRequest) SetTenantName(v string) *UpdateAasEbcAuthStatusRequest {
	s.TenantName = &v
	return s
}

type UpdateAasEbcAuthStatusResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAasEbcAuthStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasEbcAuthStatusResponse) GoString() string {
	return s.String()
}

func (s *UpdateAasEbcAuthStatusResponse) SetReqMsgId(v string) *UpdateAasEbcAuthStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAasEbcAuthStatusResponse) SetResultCode(v string) *UpdateAasEbcAuthStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAasEbcAuthStatusResponse) SetResultMsg(v string) *UpdateAasEbcAuthStatusResponse {
	s.ResultMsg = &v
	return s
}

type UpdateAasEbcDataPriceRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 目标数据id列表，最多20个
	DataIdList []*string `json:"data_id_list,omitempty" xml:"data_id_list,omitempty" type:"Repeated"`
	// 1:身份数据，2:机构数据，3：课程数据，4：班级数据，5：证书数据
	DataType *int64 `json:"data_type,omitempty" xml:"data_type,omitempty"`
	// 数据价值
	Price *int64 `json:"price,omitempty" xml:"price,omitempty" maximum:"undefined" minimum:"undefined"`
}

func (s UpdateAasEbcDataPriceRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasEbcDataPriceRequest) GoString() string {
	return s.String()
}

func (s *UpdateAasEbcDataPriceRequest) SetAuthToken(v string) *UpdateAasEbcDataPriceRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAasEbcDataPriceRequest) SetProductInstanceId(v string) *UpdateAasEbcDataPriceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAasEbcDataPriceRequest) SetRegionName(v string) *UpdateAasEbcDataPriceRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateAasEbcDataPriceRequest) SetDataIdList(v []*string) *UpdateAasEbcDataPriceRequest {
	s.DataIdList = v
	return s
}

func (s *UpdateAasEbcDataPriceRequest) SetDataType(v int64) *UpdateAasEbcDataPriceRequest {
	s.DataType = &v
	return s
}

func (s *UpdateAasEbcDataPriceRequest) SetPrice(v int64) *UpdateAasEbcDataPriceRequest {
	s.Price = &v
	return s
}

type UpdateAasEbcDataPriceResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 更新失败的id列表
	FailList []*string `json:"fail_list,omitempty" xml:"fail_list,omitempty" type:"Repeated"`
}

func (s UpdateAasEbcDataPriceResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasEbcDataPriceResponse) GoString() string {
	return s.String()
}

func (s *UpdateAasEbcDataPriceResponse) SetReqMsgId(v string) *UpdateAasEbcDataPriceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAasEbcDataPriceResponse) SetResultCode(v string) *UpdateAasEbcDataPriceResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAasEbcDataPriceResponse) SetResultMsg(v string) *UpdateAasEbcDataPriceResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateAasEbcDataPriceResponse) SetFailList(v []*string) *UpdateAasEbcDataPriceResponse {
	s.FailList = v
	return s
}

type QueryAasEbcConsumptionAmountRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 开始时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 消费方租户id
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty" maxLength:"64"`
}

func (s QueryAasEbcConsumptionAmountRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasEbcConsumptionAmountRequest) GoString() string {
	return s.String()
}

func (s *QueryAasEbcConsumptionAmountRequest) SetAuthToken(v string) *QueryAasEbcConsumptionAmountRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasEbcConsumptionAmountRequest) SetProductInstanceId(v string) *QueryAasEbcConsumptionAmountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasEbcConsumptionAmountRequest) SetRegionName(v string) *QueryAasEbcConsumptionAmountRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasEbcConsumptionAmountRequest) SetEndTime(v string) *QueryAasEbcConsumptionAmountRequest {
	s.EndTime = &v
	return s
}

func (s *QueryAasEbcConsumptionAmountRequest) SetStartTime(v string) *QueryAasEbcConsumptionAmountRequest {
	s.StartTime = &v
	return s
}

func (s *QueryAasEbcConsumptionAmountRequest) SetTenantName(v string) *QueryAasEbcConsumptionAmountRequest {
	s.TenantName = &v
	return s
}

type QueryAasEbcConsumptionAmountResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区间内的累计消费金额
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty"`
}

func (s QueryAasEbcConsumptionAmountResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasEbcConsumptionAmountResponse) GoString() string {
	return s.String()
}

func (s *QueryAasEbcConsumptionAmountResponse) SetReqMsgId(v string) *QueryAasEbcConsumptionAmountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasEbcConsumptionAmountResponse) SetResultCode(v string) *QueryAasEbcConsumptionAmountResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasEbcConsumptionAmountResponse) SetResultMsg(v string) *QueryAasEbcConsumptionAmountResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasEbcConsumptionAmountResponse) SetAmount(v int64) *QueryAasEbcConsumptionAmountResponse {
	s.Amount = &v
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
				"sdkVersion":     tea.String("Tea-SDK-20200713"),
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
 * Description: 创建企业
 * Summary: 创建企业
 */
func (client *Client) CreateAasEbcOrganization(request *CreateAasEbcOrganizationRequest) (_result *CreateAasEbcOrganizationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateAasEbcOrganizationResponse{}
	_body, _err := client.CreateAasEbcOrganizationEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建企业
 * Summary: 创建企业
 */
func (client *Client) CreateAasEbcOrganizationEx(request *CreateAasEbcOrganizationRequest, runtime *util.RuntimeOptions) (_result *CreateAasEbcOrganizationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAasEbcOrganizationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.organization.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建个人
 * Summary: 创建个人
 */
func (client *Client) CreateAasEbcPerson(request *CreateAasEbcPersonRequest) (_result *CreateAasEbcPersonResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateAasEbcPersonResponse{}
	_body, _err := client.CreateAasEbcPersonEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建个人
 * Summary: 创建个人
 */
func (client *Client) CreateAasEbcPersonEx(request *CreateAasEbcPersonRequest, runtime *util.RuntimeOptions) (_result *CreateAasEbcPersonResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAasEbcPersonResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.person.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业用户注册
 * Summary: 企业用户注册
 */
func (client *Client) CreateAasEbcOrganizationUser(request *CreateAasEbcOrganizationUserRequest) (_result *CreateAasEbcOrganizationUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateAasEbcOrganizationUserResponse{}
	_body, _err := client.CreateAasEbcOrganizationUserEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业用户注册
 * Summary: 企业用户注册
 */
func (client *Client) CreateAasEbcOrganizationUserEx(request *CreateAasEbcOrganizationUserRequest, runtime *util.RuntimeOptions) (_result *CreateAasEbcOrganizationUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAasEbcOrganizationUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.organization.user.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人退出
 * Summary: 个人退出
 */
func (client *Client) CancelAasEbcPerson(request *CancelAasEbcPersonRequest) (_result *CancelAasEbcPersonResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CancelAasEbcPersonResponse{}
	_body, _err := client.CancelAasEbcPersonEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人退出
 * Summary: 个人退出
 */
func (client *Client) CancelAasEbcPersonEx(request *CancelAasEbcPersonRequest, runtime *util.RuntimeOptions) (_result *CancelAasEbcPersonResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelAasEbcPersonResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.person.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户复入
 * Summary: 用户复入
 */
func (client *Client) ResumeAasEbcPerson(request *ResumeAasEbcPersonRequest) (_result *ResumeAasEbcPersonResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ResumeAasEbcPersonResponse{}
	_body, _err := client.ResumeAasEbcPersonEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户复入
 * Summary: 用户复入
 */
func (client *Client) ResumeAasEbcPersonEx(request *ResumeAasEbcPersonRequest, runtime *util.RuntimeOptions) (_result *ResumeAasEbcPersonResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResumeAasEbcPersonResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.person.resume"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建班级
 * Summary: 创建班级
 */
func (client *Client) CreateAasEbcOrganizationClass(request *CreateAasEbcOrganizationClassRequest) (_result *CreateAasEbcOrganizationClassResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateAasEbcOrganizationClassResponse{}
	_body, _err := client.CreateAasEbcOrganizationClassEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建班级
 * Summary: 创建班级
 */
func (client *Client) CreateAasEbcOrganizationClassEx(request *CreateAasEbcOrganizationClassRequest, runtime *util.RuntimeOptions) (_result *CreateAasEbcOrganizationClassResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAasEbcOrganizationClassResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.organization.class.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新班级
 * Summary: 更新班级
 */
func (client *Client) UpdateAasEbcOrganizationClass(request *UpdateAasEbcOrganizationClassRequest) (_result *UpdateAasEbcOrganizationClassResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateAasEbcOrganizationClassResponse{}
	_body, _err := client.UpdateAasEbcOrganizationClassEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新班级
 * Summary: 更新班级
 */
func (client *Client) UpdateAasEbcOrganizationClassEx(request *UpdateAasEbcOrganizationClassRequest, runtime *util.RuntimeOptions) (_result *UpdateAasEbcOrganizationClassResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAasEbcOrganizationClassResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.organization.class.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 增加学员
 * Summary: 增加学员
 */
func (client *Client) AddAasEbcClassUser(request *AddAasEbcClassUserRequest) (_result *AddAasEbcClassUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AddAasEbcClassUserResponse{}
	_body, _err := client.AddAasEbcClassUserEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 增加学员
 * Summary: 增加学员
 */
func (client *Client) AddAasEbcClassUserEx(request *AddAasEbcClassUserRequest, runtime *util.RuntimeOptions) (_result *AddAasEbcClassUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddAasEbcClassUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.class.user.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除学员
 * Summary: 删除学员
 */
func (client *Client) DeleteAasEbcClassUser(request *DeleteAasEbcClassUserRequest) (_result *DeleteAasEbcClassUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &DeleteAasEbcClassUserResponse{}
	_body, _err := client.DeleteAasEbcClassUserEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除学员
 * Summary: 删除学员
 */
func (client *Client) DeleteAasEbcClassUserEx(request *DeleteAasEbcClassUserRequest, runtime *util.RuntimeOptions) (_result *DeleteAasEbcClassUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteAasEbcClassUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.class.user.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 班级查询
 * Summary: 班级查询
 */
func (client *Client) QueryAasEbcOrganizationClass(request *QueryAasEbcOrganizationClassRequest) (_result *QueryAasEbcOrganizationClassResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasEbcOrganizationClassResponse{}
	_body, _err := client.QueryAasEbcOrganizationClassEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 班级查询
 * Summary: 班级查询
 */
func (client *Client) QueryAasEbcOrganizationClassEx(request *QueryAasEbcOrganizationClassRequest, runtime *util.RuntimeOptions) (_result *QueryAasEbcOrganizationClassResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasEbcOrganizationClassResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.organization.class.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 班级明细查询
 * Summary: 班级明细查询
 */
func (client *Client) QueryAasEbcClassUser(request *QueryAasEbcClassUserRequest) (_result *QueryAasEbcClassUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasEbcClassUserResponse{}
	_body, _err := client.QueryAasEbcClassUserEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 班级明细查询
 * Summary: 班级明细查询
 */
func (client *Client) QueryAasEbcClassUserEx(request *QueryAasEbcClassUserRequest, runtime *util.RuntimeOptions) (_result *QueryAasEbcClassUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasEbcClassUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.class.user.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发布课程
 * Summary: 发布课程
 */
func (client *Client) CreateAasEbcOrganizationCourse(request *CreateAasEbcOrganizationCourseRequest) (_result *CreateAasEbcOrganizationCourseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateAasEbcOrganizationCourseResponse{}
	_body, _err := client.CreateAasEbcOrganizationCourseEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发布课程
 * Summary: 发布课程
 */
func (client *Client) CreateAasEbcOrganizationCourseEx(request *CreateAasEbcOrganizationCourseRequest, runtime *util.RuntimeOptions) (_result *CreateAasEbcOrganizationCourseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAasEbcOrganizationCourseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.organization.course.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新课程
 * Summary: 更新课程
 */
func (client *Client) UpdateAasEbcOrganizationCourse(request *UpdateAasEbcOrganizationCourseRequest) (_result *UpdateAasEbcOrganizationCourseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateAasEbcOrganizationCourseResponse{}
	_body, _err := client.UpdateAasEbcOrganizationCourseEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新课程
 * Summary: 更新课程
 */
func (client *Client) UpdateAasEbcOrganizationCourseEx(request *UpdateAasEbcOrganizationCourseRequest, runtime *util.RuntimeOptions) (_result *UpdateAasEbcOrganizationCourseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAasEbcOrganizationCourseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.organization.course.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 将班级添加到课程中
 * Summary: 增加课程班级
 */
func (client *Client) AddAasEbcCourseClass(request *AddAasEbcCourseClassRequest) (_result *AddAasEbcCourseClassResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AddAasEbcCourseClassResponse{}
	_body, _err := client.AddAasEbcCourseClassEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 将班级添加到课程中
 * Summary: 增加课程班级
 */
func (client *Client) AddAasEbcCourseClassEx(request *AddAasEbcCourseClassRequest, runtime *util.RuntimeOptions) (_result *AddAasEbcCourseClassResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddAasEbcCourseClassResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.course.class.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 将学员添加到课程中
 * Summary: 增加课程学员
 */
func (client *Client) AddAasEbcCourseUser(request *AddAasEbcCourseUserRequest) (_result *AddAasEbcCourseUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AddAasEbcCourseUserResponse{}
	_body, _err := client.AddAasEbcCourseUserEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 将学员添加到课程中
 * Summary: 增加课程学员
 */
func (client *Client) AddAasEbcCourseUserEx(request *AddAasEbcCourseUserRequest, runtime *util.RuntimeOptions) (_result *AddAasEbcCourseUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddAasEbcCourseUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.course.user.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除课程中的班级
 * Summary: 删除课程班级
 */
func (client *Client) DeleteAasEbcCourseClass(request *DeleteAasEbcCourseClassRequest) (_result *DeleteAasEbcCourseClassResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &DeleteAasEbcCourseClassResponse{}
	_body, _err := client.DeleteAasEbcCourseClassEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除课程中的班级
 * Summary: 删除课程班级
 */
func (client *Client) DeleteAasEbcCourseClassEx(request *DeleteAasEbcCourseClassRequest, runtime *util.RuntimeOptions) (_result *DeleteAasEbcCourseClassResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteAasEbcCourseClassResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.course.class.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除课程中的学员
 * Summary: 删除课程学员
 */
func (client *Client) DeleteAasEbcCourseUser(request *DeleteAasEbcCourseUserRequest) (_result *DeleteAasEbcCourseUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &DeleteAasEbcCourseUserResponse{}
	_body, _err := client.DeleteAasEbcCourseUserEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除课程中的学员
 * Summary: 删除课程学员
 */
func (client *Client) DeleteAasEbcCourseUserEx(request *DeleteAasEbcCourseUserRequest, runtime *util.RuntimeOptions) (_result *DeleteAasEbcCourseUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteAasEbcCourseUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.course.user.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发布证书
 * Summary: 发布证书
 */
func (client *Client) CreateAasEbcUserCert(request *CreateAasEbcUserCertRequest) (_result *CreateAasEbcUserCertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateAasEbcUserCertResponse{}
	_body, _err := client.CreateAasEbcUserCertEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发布证书
 * Summary: 发布证书
 */
func (client *Client) CreateAasEbcUserCertEx(request *CreateAasEbcUserCertRequest, runtime *util.RuntimeOptions) (_result *CreateAasEbcUserCertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAasEbcUserCertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.user.cert.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新证书
 * Summary: 更新证书
 */
func (client *Client) UpdateAasEbcUserCert(request *UpdateAasEbcUserCertRequest) (_result *UpdateAasEbcUserCertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateAasEbcUserCertResponse{}
	_body, _err := client.UpdateAasEbcUserCertEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新证书
 * Summary: 更新证书
 */
func (client *Client) UpdateAasEbcUserCertEx(request *UpdateAasEbcUserCertRequest, runtime *util.RuntimeOptions) (_result *UpdateAasEbcUserCertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAasEbcUserCertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.user.cert.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询证书
 * Summary: 查询企业证书
 */
func (client *Client) QueryAasEbcOrganizationCert(request *QueryAasEbcOrganizationCertRequest) (_result *QueryAasEbcOrganizationCertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasEbcOrganizationCertResponse{}
	_body, _err := client.QueryAasEbcOrganizationCertEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询证书
 * Summary: 查询企业证书
 */
func (client *Client) QueryAasEbcOrganizationCertEx(request *QueryAasEbcOrganizationCertRequest, runtime *util.RuntimeOptions) (_result *QueryAasEbcOrganizationCertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasEbcOrganizationCertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.organization.cert.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询用户证书
 * Summary: 查询用户证书
 */
func (client *Client) QueryAasEbcUserCert(request *QueryAasEbcUserCertRequest) (_result *QueryAasEbcUserCertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasEbcUserCertResponse{}
	_body, _err := client.QueryAasEbcUserCertEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询用户证书
 * Summary: 查询用户证书
 */
func (client *Client) QueryAasEbcUserCertEx(request *QueryAasEbcUserCertRequest, runtime *util.RuntimeOptions) (_result *QueryAasEbcUserCertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasEbcUserCertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.user.cert.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 证书明细查询
 * Summary: 证书明细查询
 */
func (client *Client) QueryAasEbcCert(request *QueryAasEbcCertRequest) (_result *QueryAasEbcCertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasEbcCertResponse{}
	_body, _err := client.QueryAasEbcCertEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 证书明细查询
 * Summary: 证书明细查询
 */
func (client *Client) QueryAasEbcCertEx(request *QueryAasEbcCertRequest, runtime *util.RuntimeOptions) (_result *QueryAasEbcCertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasEbcCertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.cert.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 申请证书信息上传url，证书未发布则会返回证书图片、证书持有人、证书其他信息的文件上传url。
证书已发布则会返回证书图片、证书其他信息的文件上传url。
文件最大5M
 * Summary: 申请证书信息上传url
*/
func (client *Client) ApplyAasEbcCertUrl(request *ApplyAasEbcCertUrlRequest) (_result *ApplyAasEbcCertUrlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ApplyAasEbcCertUrlResponse{}
	_body, _err := client.ApplyAasEbcCertUrlEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 申请证书信息上传url，证书未发布则会返回证书图片、证书持有人、证书其他信息的文件上传url。
证书已发布则会返回证书图片、证书其他信息的文件上传url。
文件最大5M
 * Summary: 申请证书信息上传url
*/
func (client *Client) ApplyAasEbcCertUrlEx(request *ApplyAasEbcCertUrlRequest, runtime *util.RuntimeOptions) (_result *ApplyAasEbcCertUrlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyAasEbcCertUrlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.cert.url.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新增授权关系，仅限联盟管理员调用
 * Summary: 新增授权关系
 */
func (client *Client) CreateAasEbcAuth(request *CreateAasEbcAuthRequest) (_result *CreateAasEbcAuthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateAasEbcAuthResponse{}
	_body, _err := client.CreateAasEbcAuthEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新增授权关系，仅限联盟管理员调用
 * Summary: 新增授权关系
 */
func (client *Client) CreateAasEbcAuthEx(request *CreateAasEbcAuthRequest, runtime *util.RuntimeOptions) (_result *CreateAasEbcAuthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAasEbcAuthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.auth.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新授权关系，仅限联盟管理员调用
 * Summary: 更新授权关系
 */
func (client *Client) UpdateAasEbcAuth(request *UpdateAasEbcAuthRequest) (_result *UpdateAasEbcAuthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateAasEbcAuthResponse{}
	_body, _err := client.UpdateAasEbcAuthEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新授权关系，仅限联盟管理员调用
 * Summary: 更新授权关系
 */
func (client *Client) UpdateAasEbcAuthEx(request *UpdateAasEbcAuthRequest, runtime *util.RuntimeOptions) (_result *UpdateAasEbcAuthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAasEbcAuthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.auth.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新授权关系状态，仅限联盟管理员调用
 * Summary: 更新授权关系状态
 */
func (client *Client) UpdateAasEbcAuthStatus(request *UpdateAasEbcAuthStatusRequest) (_result *UpdateAasEbcAuthStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateAasEbcAuthStatusResponse{}
	_body, _err := client.UpdateAasEbcAuthStatusEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新授权关系状态，仅限联盟管理员调用
 * Summary: 更新授权关系状态
 */
func (client *Client) UpdateAasEbcAuthStatusEx(request *UpdateAasEbcAuthStatusRequest, runtime *util.RuntimeOptions) (_result *UpdateAasEbcAuthStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAasEbcAuthStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.auth.status.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新数据价值
 * Summary: 更新数据价值
 */
func (client *Client) UpdateAasEbcDataPrice(request *UpdateAasEbcDataPriceRequest) (_result *UpdateAasEbcDataPriceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateAasEbcDataPriceResponse{}
	_body, _err := client.UpdateAasEbcDataPriceEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新数据价值
 * Summary: 更新数据价值
 */
func (client *Client) UpdateAasEbcDataPriceEx(request *UpdateAasEbcDataPriceRequest, runtime *util.RuntimeOptions) (_result *UpdateAasEbcDataPriceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAasEbcDataPriceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.data.price.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询消费者消费金额
 * Summary: 查询消费者消费金额
 */
func (client *Client) QueryAasEbcConsumptionAmount(request *QueryAasEbcConsumptionAmountRequest) (_result *QueryAasEbcConsumptionAmountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasEbcConsumptionAmountResponse{}
	_body, _err := client.QueryAasEbcConsumptionAmountEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询消费者消费金额
 * Summary: 查询消费者消费金额
 */
func (client *Client) QueryAasEbcConsumptionAmountEx(request *QueryAasEbcConsumptionAmountRequest, runtime *util.RuntimeOptions) (_result *QueryAasEbcConsumptionAmountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasEbcConsumptionAmountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.consumption.amount.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
