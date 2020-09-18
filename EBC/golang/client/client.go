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

// 证书
type Cert struct {
	// 证书编号
	CertCode *string `json:"cert_code,omitempty" xml:"cert_code,omitempty" maxLength:"64"`
	// 证书描述
	CertDescription *string `json:"cert_description,omitempty" xml:"cert_description,omitempty"`
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
	// 发布时间时区，默认UTC+8
	//
	CertPublishTimeZone *string `json:"cert_publish_time_zone,omitempty" xml:"cert_publish_time_zone,omitempty"`
	// 时间周期开始时间
	CertStartTime *string `json:"cert_start_time,omitempty" xml:"cert_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 1-有效
	// 2-冻结
	// 3-失效
	// 4-作废
	// 5-其他
	CertStatus *int64 `json:"cert_status,omitempty" xml:"cert_status,omitempty"`
	// 证书概述
	CertSummary *string `json:"cert_summary,omitempty" xml:"cert_summary,omitempty"`
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

func (s *Cert) SetCertDescription(v string) *Cert {
	s.CertDescription = &v
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

func (s *Cert) SetCertPublishTimeZone(v string) *Cert {
	s.CertPublishTimeZone = &v
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

func (s *Cert) SetCertSummary(v string) *Cert {
	s.CertSummary = &v
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

// 课程学习记录
type CourseRecord struct {
	// 链上章节id
	//
	ChapterId *string `json:"chapter_id,omitempty" xml:"chapter_id,omitempty" maxLength:"128"`
	// 班级id
	ClassId *string `json:"class_id,omitempty" xml:"class_id,omitempty" maxLength:"128"`
	// 课程id
	CourseId *string `json:"course_id,omitempty" xml:"course_id,omitempty" maxLength:"128"`
	// 课程名称
	CourseName *string `json:"course_name,omitempty" xml:"course_name,omitempty" maxLength:"128"`
	// 企业did
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	// 企业用户id
	//
	OrgUserId *string `json:"org_user_id,omitempty" xml:"org_user_id,omitempty" maxLength:"128"`
	// 课程扩展信息，格式为json。比如钉钉用户id。
	RecordExt *string `json:"record_ext,omitempty" xml:"record_ext,omitempty" maxLength:"2000"`
	// 记录id
	RecordId *string `json:"record_id,omitempty" xml:"record_id,omitempty" maxLength:"128"`
	// 本次开启时间
	//
	RecordOpenTime *string `json:"record_open_time,omitempty" xml:"record_open_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 本次观看时长，单位秒
	RecordPeriod *int64 `json:"record_period,omitempty" xml:"record_period,omitempty"`
	// 行为来源
	RecordSource *string `json:"record_source,omitempty" xml:"record_source,omitempty" maxLength:"128"`
	// 本次点击观看时间
	RecordStartTime *string `json:"record_start_time,omitempty" xml:"record_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
}

func (s CourseRecord) String() string {
	return tea.Prettify(s)
}

func (s CourseRecord) GoString() string {
	return s.String()
}

func (s *CourseRecord) SetChapterId(v string) *CourseRecord {
	s.ChapterId = &v
	return s
}

func (s *CourseRecord) SetClassId(v string) *CourseRecord {
	s.ClassId = &v
	return s
}

func (s *CourseRecord) SetCourseId(v string) *CourseRecord {
	s.CourseId = &v
	return s
}

func (s *CourseRecord) SetCourseName(v string) *CourseRecord {
	s.CourseName = &v
	return s
}

func (s *CourseRecord) SetOrgDid(v string) *CourseRecord {
	s.OrgDid = &v
	return s
}

func (s *CourseRecord) SetOrgUserId(v string) *CourseRecord {
	s.OrgUserId = &v
	return s
}

func (s *CourseRecord) SetRecordExt(v string) *CourseRecord {
	s.RecordExt = &v
	return s
}

func (s *CourseRecord) SetRecordId(v string) *CourseRecord {
	s.RecordId = &v
	return s
}

func (s *CourseRecord) SetRecordOpenTime(v string) *CourseRecord {
	s.RecordOpenTime = &v
	return s
}

func (s *CourseRecord) SetRecordPeriod(v int64) *CourseRecord {
	s.RecordPeriod = &v
	return s
}

func (s *CourseRecord) SetRecordSource(v string) *CourseRecord {
	s.RecordSource = &v
	return s
}

func (s *CourseRecord) SetRecordStartTime(v string) *CourseRecord {
	s.RecordStartTime = &v
	return s
}

// 字段隐私属性描述
type PrivacyDesc struct {
	// 属性名称
	//
	AttributeName *string `json:"attribute_name,omitempty" xml:"attribute_name,omitempty" maxLength:"64"`
	// 隐私等级：
	// 1：数据可以全量明文查询
	// 2：数据仅可以通过数据比较查询
	PrivacyLevel *int64 `json:"privacy_level,omitempty" xml:"privacy_level,omitempty"`
}

func (s PrivacyDesc) String() string {
	return tea.Prettify(s)
}

func (s PrivacyDesc) GoString() string {
	return s.String()
}

func (s *PrivacyDesc) SetAttributeName(v string) *PrivacyDesc {
	s.AttributeName = &v
	return s
}

func (s *PrivacyDesc) SetPrivacyLevel(v int64) *PrivacyDesc {
	s.PrivacyLevel = &v
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

// 字段托管属性描述
type ProxyDesc struct {
	// 属性名称
	AttributeName *string `json:"attribute_name,omitempty" xml:"attribute_name,omitempty" maxLength:"64"`
	// 是否托管
	IsProxy *bool `json:"is_proxy,omitempty" xml:"is_proxy,omitempty"`
}

func (s ProxyDesc) String() string {
	return tea.Prettify(s)
}

func (s ProxyDesc) GoString() string {
	return s.String()
}

func (s *ProxyDesc) SetAttributeName(v string) *ProxyDesc {
	s.AttributeName = &v
	return s
}

func (s *ProxyDesc) SetIsProxy(v bool) *ProxyDesc {
	s.IsProxy = &v
	return s
}

// 字段公开属性描述列表
type PublicDesc struct {
	// 属性名称
	AttributeName *string `json:"attribute_name,omitempty" xml:"attribute_name,omitempty" maxLength:"64"`
	// 数据是否所有消费方可查询
	IsPublic *bool `json:"is_public,omitempty" xml:"is_public,omitempty"`
}

func (s PublicDesc) String() string {
	return tea.Prettify(s)
}

func (s PublicDesc) GoString() string {
	return s.String()
}

func (s *PublicDesc) SetAttributeName(v string) *PublicDesc {
	s.AttributeName = &v
	return s
}

func (s *PublicDesc) SetIsPublic(v bool) *PublicDesc {
	s.IsPublic = &v
	return s
}

// 课程章节
type CourseChapter struct {
	// 业务系统章节ID
	//
	ChapterBizId *string `json:"chapter_biz_id,omitempty" xml:"chapter_biz_id,omitempty" maxLength:"128"`
	// 章节描述
	//
	ChapterDescription *string `json:"chapter_description,omitempty" xml:"chapter_description,omitempty" maxLength:"1000"`
	// 链上章节id
	ChapterId *string `json:"chapter_id,omitempty" xml:"chapter_id,omitempty" maxLength:"128"`
	// 章节名称
	ChapterName *string `json:"chapter_name,omitempty" xml:"chapter_name,omitempty" maxLength:"128"`
	// 章节时长，单位秒
	ChapterPeriod *int64 `json:"chapter_period,omitempty" xml:"chapter_period,omitempty"`
}

func (s CourseChapter) String() string {
	return tea.Prettify(s)
}

func (s CourseChapter) GoString() string {
	return s.String()
}

func (s *CourseChapter) SetChapterBizId(v string) *CourseChapter {
	s.ChapterBizId = &v
	return s
}

func (s *CourseChapter) SetChapterDescription(v string) *CourseChapter {
	s.ChapterDescription = &v
	return s
}

func (s *CourseChapter) SetChapterId(v string) *CourseChapter {
	s.ChapterId = &v
	return s
}

func (s *CourseChapter) SetChapterName(v string) *CourseChapter {
	s.ChapterName = &v
	return s
}

func (s *CourseChapter) SetChapterPeriod(v int64) *CourseChapter {
	s.ChapterPeriod = &v
	return s
}

type CreateBaasEbcOrganizationRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 企业码
	OrgCode *string `json:"org_code,omitempty" xml:"org_code,omitempty" maxLength:"64"`
	// 企业名称
	OrgName *string `json:"org_name,omitempty" xml:"org_name,omitempty" maxLength:"64"`
}

func (s CreateBaasEbcOrganizationRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasEbcOrganizationRequest) GoString() string {
	return s.String()
}

func (s *CreateBaasEbcOrganizationRequest) SetAuthToken(v string) *CreateBaasEbcOrganizationRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBaasEbcOrganizationRequest) SetProductInstanceId(v string) *CreateBaasEbcOrganizationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBaasEbcOrganizationRequest) SetRegionName(v string) *CreateBaasEbcOrganizationRequest {
	s.RegionName = &v
	return s
}

func (s *CreateBaasEbcOrganizationRequest) SetOrgCode(v string) *CreateBaasEbcOrganizationRequest {
	s.OrgCode = &v
	return s
}

func (s *CreateBaasEbcOrganizationRequest) SetOrgName(v string) *CreateBaasEbcOrganizationRequest {
	s.OrgName = &v
	return s
}

type CreateBaasEbcOrganizationResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业did
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty"`
}

func (s CreateBaasEbcOrganizationResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasEbcOrganizationResponse) GoString() string {
	return s.String()
}

func (s *CreateBaasEbcOrganizationResponse) SetReqMsgId(v string) *CreateBaasEbcOrganizationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBaasEbcOrganizationResponse) SetResultCode(v string) *CreateBaasEbcOrganizationResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBaasEbcOrganizationResponse) SetResultMsg(v string) *CreateBaasEbcOrganizationResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBaasEbcOrganizationResponse) SetOrgDid(v string) *CreateBaasEbcOrganizationResponse {
	s.OrgDid = &v
	return s
}

type CreateBaasEbcPersonRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 姓名
	PersonName *string `json:"person_name,omitempty" xml:"person_name,omitempty" maxLength:"32"`
	// 持有人主证件编号，无身份证的个人使用0000000000000000
	// 请使用我们提供的公钥对数据进行加密
	PrimaryIdNo *string `json:"primary_id_no,omitempty" xml:"primary_id_no,omitempty" maxLength:"1024"`
	// 隐私属性描述列表
	//
	PrivacyDescList []*PrivacyDesc `json:"privacy_desc_list,omitempty" xml:"privacy_desc_list,omitempty" type:"Repeated"`
	// 托管属性描述列表
	//
	ProxyDescList []*ProxyDesc `json:"proxy_desc_list,omitempty" xml:"proxy_desc_list,omitempty" type:"Repeated"`
	// 公开属性描述列表
	//
	PublicDescList []*PublicDesc `json:"public_desc_list,omitempty" xml:"public_desc_list,omitempty" type:"Repeated"`
	// 持有人辅助证件编号-1
	// 请使用我们提供的公钥对数据进行加密
	SecondIdNo1 *string `json:"second_id_no_1,omitempty" xml:"second_id_no_1,omitempty" maxLength:"1024"`
	// 持有人辅助证件编号-1
	// 请使用我们提供的公钥对数据进行加密
	SecondIdNo2 *string `json:"second_id_no_2,omitempty" xml:"second_id_no_2,omitempty" maxLength:"1024"`
	// 持有人辅助证件编号-3
	// 请使用我们提供的公钥对数据进行加密
	SecondIdNo3 *string `json:"second_id_no_3,omitempty" xml:"second_id_no_3,omitempty" maxLength:"1024"`
	// 非对称加密后的对称秘钥，对应执行java SDK中的EnvelopeClient#envelopeSeal方法的返回值
	SecretKey *string `json:"secret_key,omitempty" xml:"secret_key,omitempty" maxLength:"512"`
}

func (s CreateBaasEbcPersonRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasEbcPersonRequest) GoString() string {
	return s.String()
}

func (s *CreateBaasEbcPersonRequest) SetAuthToken(v string) *CreateBaasEbcPersonRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBaasEbcPersonRequest) SetProductInstanceId(v string) *CreateBaasEbcPersonRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBaasEbcPersonRequest) SetRegionName(v string) *CreateBaasEbcPersonRequest {
	s.RegionName = &v
	return s
}

func (s *CreateBaasEbcPersonRequest) SetPersonName(v string) *CreateBaasEbcPersonRequest {
	s.PersonName = &v
	return s
}

func (s *CreateBaasEbcPersonRequest) SetPrimaryIdNo(v string) *CreateBaasEbcPersonRequest {
	s.PrimaryIdNo = &v
	return s
}

func (s *CreateBaasEbcPersonRequest) SetPrivacyDescList(v []*PrivacyDesc) *CreateBaasEbcPersonRequest {
	s.PrivacyDescList = v
	return s
}

func (s *CreateBaasEbcPersonRequest) SetProxyDescList(v []*ProxyDesc) *CreateBaasEbcPersonRequest {
	s.ProxyDescList = v
	return s
}

func (s *CreateBaasEbcPersonRequest) SetPublicDescList(v []*PublicDesc) *CreateBaasEbcPersonRequest {
	s.PublicDescList = v
	return s
}

func (s *CreateBaasEbcPersonRequest) SetSecondIdNo1(v string) *CreateBaasEbcPersonRequest {
	s.SecondIdNo1 = &v
	return s
}

func (s *CreateBaasEbcPersonRequest) SetSecondIdNo2(v string) *CreateBaasEbcPersonRequest {
	s.SecondIdNo2 = &v
	return s
}

func (s *CreateBaasEbcPersonRequest) SetSecondIdNo3(v string) *CreateBaasEbcPersonRequest {
	s.SecondIdNo3 = &v
	return s
}

func (s *CreateBaasEbcPersonRequest) SetSecretKey(v string) *CreateBaasEbcPersonRequest {
	s.SecretKey = &v
	return s
}

type CreateBaasEbcPersonResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 个人id
	PersonDid *string `json:"person_did,omitempty" xml:"person_did,omitempty"`
}

func (s CreateBaasEbcPersonResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasEbcPersonResponse) GoString() string {
	return s.String()
}

func (s *CreateBaasEbcPersonResponse) SetReqMsgId(v string) *CreateBaasEbcPersonResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBaasEbcPersonResponse) SetResultCode(v string) *CreateBaasEbcPersonResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBaasEbcPersonResponse) SetResultMsg(v string) *CreateBaasEbcPersonResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBaasEbcPersonResponse) SetPersonDid(v string) *CreateBaasEbcPersonResponse {
	s.PersonDid = &v
	return s
}

type CreateBaasEbcOrganizationUserRequest struct {
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

func (s CreateBaasEbcOrganizationUserRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasEbcOrganizationUserRequest) GoString() string {
	return s.String()
}

func (s *CreateBaasEbcOrganizationUserRequest) SetAuthToken(v string) *CreateBaasEbcOrganizationUserRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBaasEbcOrganizationUserRequest) SetProductInstanceId(v string) *CreateBaasEbcOrganizationUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBaasEbcOrganizationUserRequest) SetRegionName(v string) *CreateBaasEbcOrganizationUserRequest {
	s.RegionName = &v
	return s
}

func (s *CreateBaasEbcOrganizationUserRequest) SetOrgDid(v string) *CreateBaasEbcOrganizationUserRequest {
	s.OrgDid = &v
	return s
}

func (s *CreateBaasEbcOrganizationUserRequest) SetPersonDid(v string) *CreateBaasEbcOrganizationUserRequest {
	s.PersonDid = &v
	return s
}

func (s *CreateBaasEbcOrganizationUserRequest) SetUid(v string) *CreateBaasEbcOrganizationUserRequest {
	s.Uid = &v
	return s
}

type CreateBaasEbcOrganizationUserResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 机构内用户id
	OrgUserId *string `json:"org_user_id,omitempty" xml:"org_user_id,omitempty"`
}

func (s CreateBaasEbcOrganizationUserResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasEbcOrganizationUserResponse) GoString() string {
	return s.String()
}

func (s *CreateBaasEbcOrganizationUserResponse) SetReqMsgId(v string) *CreateBaasEbcOrganizationUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBaasEbcOrganizationUserResponse) SetResultCode(v string) *CreateBaasEbcOrganizationUserResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBaasEbcOrganizationUserResponse) SetResultMsg(v string) *CreateBaasEbcOrganizationUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBaasEbcOrganizationUserResponse) SetOrgUserId(v string) *CreateBaasEbcOrganizationUserResponse {
	s.OrgUserId = &v
	return s
}

type CancelBaasEbcPersonRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 个人id
	PersonDid *string `json:"person_did,omitempty" xml:"person_did,omitempty" maxLength:"128"`
}

func (s CancelBaasEbcPersonRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelBaasEbcPersonRequest) GoString() string {
	return s.String()
}

func (s *CancelBaasEbcPersonRequest) SetAuthToken(v string) *CancelBaasEbcPersonRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelBaasEbcPersonRequest) SetProductInstanceId(v string) *CancelBaasEbcPersonRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelBaasEbcPersonRequest) SetRegionName(v string) *CancelBaasEbcPersonRequest {
	s.RegionName = &v
	return s
}

func (s *CancelBaasEbcPersonRequest) SetPersonDid(v string) *CancelBaasEbcPersonRequest {
	s.PersonDid = &v
	return s
}

type CancelBaasEbcPersonResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CancelBaasEbcPersonResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelBaasEbcPersonResponse) GoString() string {
	return s.String()
}

func (s *CancelBaasEbcPersonResponse) SetReqMsgId(v string) *CancelBaasEbcPersonResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelBaasEbcPersonResponse) SetResultCode(v string) *CancelBaasEbcPersonResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelBaasEbcPersonResponse) SetResultMsg(v string) *CancelBaasEbcPersonResponse {
	s.ResultMsg = &v
	return s
}

type ResumeBaasEbcPersonRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 个人did
	PersonDid *string `json:"person_did,omitempty" xml:"person_did,omitempty" maxLength:"128"`
}

func (s ResumeBaasEbcPersonRequest) String() string {
	return tea.Prettify(s)
}

func (s ResumeBaasEbcPersonRequest) GoString() string {
	return s.String()
}

func (s *ResumeBaasEbcPersonRequest) SetAuthToken(v string) *ResumeBaasEbcPersonRequest {
	s.AuthToken = &v
	return s
}

func (s *ResumeBaasEbcPersonRequest) SetProductInstanceId(v string) *ResumeBaasEbcPersonRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ResumeBaasEbcPersonRequest) SetRegionName(v string) *ResumeBaasEbcPersonRequest {
	s.RegionName = &v
	return s
}

func (s *ResumeBaasEbcPersonRequest) SetPersonDid(v string) *ResumeBaasEbcPersonRequest {
	s.PersonDid = &v
	return s
}

type ResumeBaasEbcPersonResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ResumeBaasEbcPersonResponse) String() string {
	return tea.Prettify(s)
}

func (s ResumeBaasEbcPersonResponse) GoString() string {
	return s.String()
}

func (s *ResumeBaasEbcPersonResponse) SetReqMsgId(v string) *ResumeBaasEbcPersonResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ResumeBaasEbcPersonResponse) SetResultCode(v string) *ResumeBaasEbcPersonResponse {
	s.ResultCode = &v
	return s
}

func (s *ResumeBaasEbcPersonResponse) SetResultMsg(v string) *ResumeBaasEbcPersonResponse {
	s.ResultMsg = &v
	return s
}

type CreateBaasEbcOrganizationClassRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
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
	// 隐私属性描述列表
	//
	PrivacyDescList []*PrivacyDesc `json:"privacy_desc_list,omitempty" xml:"privacy_desc_list,omitempty" type:"Repeated"`
	// 托管属性描述列表
	//
	ProxyDescList []*ProxyDesc `json:"proxy_desc_list,omitempty" xml:"proxy_desc_list,omitempty" type:"Repeated"`
	// 公开属性描述列表
	//
	PublicDescList []*PublicDesc `json:"public_desc_list,omitempty" xml:"public_desc_list,omitempty" type:"Repeated"`
	// 非对称加密后的对称秘钥，对应执行java SDK中的EnvelopeClient#envelopeSeal方法的返回值
	SecretKey *string `json:"secret_key,omitempty" xml:"secret_key,omitempty" maxLength:"512"`
	// 1线上、2线下、3混合
	Type *int64 `json:"type,omitempty" xml:"type,omitempty"`
}

func (s CreateBaasEbcOrganizationClassRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasEbcOrganizationClassRequest) GoString() string {
	return s.String()
}

func (s *CreateBaasEbcOrganizationClassRequest) SetAuthToken(v string) *CreateBaasEbcOrganizationClassRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBaasEbcOrganizationClassRequest) SetProductInstanceId(v string) *CreateBaasEbcOrganizationClassRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBaasEbcOrganizationClassRequest) SetRegionName(v string) *CreateBaasEbcOrganizationClassRequest {
	s.RegionName = &v
	return s
}

func (s *CreateBaasEbcOrganizationClassRequest) SetCapacity(v int64) *CreateBaasEbcOrganizationClassRequest {
	s.Capacity = &v
	return s
}

func (s *CreateBaasEbcOrganizationClassRequest) SetClassEndTime(v string) *CreateBaasEbcOrganizationClassRequest {
	s.ClassEndTime = &v
	return s
}

func (s *CreateBaasEbcOrganizationClassRequest) SetClassName(v string) *CreateBaasEbcOrganizationClassRequest {
	s.ClassName = &v
	return s
}

func (s *CreateBaasEbcOrganizationClassRequest) SetClassStartTime(v string) *CreateBaasEbcOrganizationClassRequest {
	s.ClassStartTime = &v
	return s
}

func (s *CreateBaasEbcOrganizationClassRequest) SetClassStatus(v int64) *CreateBaasEbcOrganizationClassRequest {
	s.ClassStatus = &v
	return s
}

func (s *CreateBaasEbcOrganizationClassRequest) SetOrgDid(v string) *CreateBaasEbcOrganizationClassRequest {
	s.OrgDid = &v
	return s
}

func (s *CreateBaasEbcOrganizationClassRequest) SetPrivacyDescList(v []*PrivacyDesc) *CreateBaasEbcOrganizationClassRequest {
	s.PrivacyDescList = v
	return s
}

func (s *CreateBaasEbcOrganizationClassRequest) SetProxyDescList(v []*ProxyDesc) *CreateBaasEbcOrganizationClassRequest {
	s.ProxyDescList = v
	return s
}

func (s *CreateBaasEbcOrganizationClassRequest) SetPublicDescList(v []*PublicDesc) *CreateBaasEbcOrganizationClassRequest {
	s.PublicDescList = v
	return s
}

func (s *CreateBaasEbcOrganizationClassRequest) SetSecretKey(v string) *CreateBaasEbcOrganizationClassRequest {
	s.SecretKey = &v
	return s
}

func (s *CreateBaasEbcOrganizationClassRequest) SetType(v int64) *CreateBaasEbcOrganizationClassRequest {
	s.Type = &v
	return s
}

type CreateBaasEbcOrganizationClassResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 班级id
	ClassId *string `json:"class_id,omitempty" xml:"class_id,omitempty"`
}

func (s CreateBaasEbcOrganizationClassResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasEbcOrganizationClassResponse) GoString() string {
	return s.String()
}

func (s *CreateBaasEbcOrganizationClassResponse) SetReqMsgId(v string) *CreateBaasEbcOrganizationClassResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBaasEbcOrganizationClassResponse) SetResultCode(v string) *CreateBaasEbcOrganizationClassResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBaasEbcOrganizationClassResponse) SetResultMsg(v string) *CreateBaasEbcOrganizationClassResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBaasEbcOrganizationClassResponse) SetClassId(v string) *CreateBaasEbcOrganizationClassResponse {
	s.ClassId = &v
	return s
}

type UpdateBaasEbcOrganizationClassRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
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
	// 隐私属性描述列表
	//
	PrivacyDescList []*PrivacyDesc `json:"privacy_desc_list,omitempty" xml:"privacy_desc_list,omitempty" type:"Repeated"`
	// 托管属性描述列表
	//
	ProxyDescList []*ProxyDesc `json:"proxy_desc_list,omitempty" xml:"proxy_desc_list,omitempty" type:"Repeated"`
	// 公开属性描述列表
	//
	PublicDescList []*PublicDesc `json:"public_desc_list,omitempty" xml:"public_desc_list,omitempty" type:"Repeated"`
	// 非对称加密后的对称秘钥，对应执行java SDK中的EnvelopeClient#envelopeSeal方法的返回值
	SecretKey *string `json:"secret_key,omitempty" xml:"secret_key,omitempty" maxLength:"512"`
}

func (s UpdateBaasEbcOrganizationClassRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateBaasEbcOrganizationClassRequest) GoString() string {
	return s.String()
}

func (s *UpdateBaasEbcOrganizationClassRequest) SetAuthToken(v string) *UpdateBaasEbcOrganizationClassRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateBaasEbcOrganizationClassRequest) SetProductInstanceId(v string) *UpdateBaasEbcOrganizationClassRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateBaasEbcOrganizationClassRequest) SetRegionName(v string) *UpdateBaasEbcOrganizationClassRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateBaasEbcOrganizationClassRequest) SetCapacity(v int64) *UpdateBaasEbcOrganizationClassRequest {
	s.Capacity = &v
	return s
}

func (s *UpdateBaasEbcOrganizationClassRequest) SetClassEndTime(v string) *UpdateBaasEbcOrganizationClassRequest {
	s.ClassEndTime = &v
	return s
}

func (s *UpdateBaasEbcOrganizationClassRequest) SetClassId(v string) *UpdateBaasEbcOrganizationClassRequest {
	s.ClassId = &v
	return s
}

func (s *UpdateBaasEbcOrganizationClassRequest) SetClassName(v string) *UpdateBaasEbcOrganizationClassRequest {
	s.ClassName = &v
	return s
}

func (s *UpdateBaasEbcOrganizationClassRequest) SetClassStartTime(v string) *UpdateBaasEbcOrganizationClassRequest {
	s.ClassStartTime = &v
	return s
}

func (s *UpdateBaasEbcOrganizationClassRequest) SetClassStatus(v int64) *UpdateBaasEbcOrganizationClassRequest {
	s.ClassStatus = &v
	return s
}

func (s *UpdateBaasEbcOrganizationClassRequest) SetOrgDid(v string) *UpdateBaasEbcOrganizationClassRequest {
	s.OrgDid = &v
	return s
}

func (s *UpdateBaasEbcOrganizationClassRequest) SetPrivacyDescList(v []*PrivacyDesc) *UpdateBaasEbcOrganizationClassRequest {
	s.PrivacyDescList = v
	return s
}

func (s *UpdateBaasEbcOrganizationClassRequest) SetProxyDescList(v []*ProxyDesc) *UpdateBaasEbcOrganizationClassRequest {
	s.ProxyDescList = v
	return s
}

func (s *UpdateBaasEbcOrganizationClassRequest) SetPublicDescList(v []*PublicDesc) *UpdateBaasEbcOrganizationClassRequest {
	s.PublicDescList = v
	return s
}

func (s *UpdateBaasEbcOrganizationClassRequest) SetSecretKey(v string) *UpdateBaasEbcOrganizationClassRequest {
	s.SecretKey = &v
	return s
}

type UpdateBaasEbcOrganizationClassResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateBaasEbcOrganizationClassResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateBaasEbcOrganizationClassResponse) GoString() string {
	return s.String()
}

func (s *UpdateBaasEbcOrganizationClassResponse) SetReqMsgId(v string) *UpdateBaasEbcOrganizationClassResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateBaasEbcOrganizationClassResponse) SetResultCode(v string) *UpdateBaasEbcOrganizationClassResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateBaasEbcOrganizationClassResponse) SetResultMsg(v string) *UpdateBaasEbcOrganizationClassResponse {
	s.ResultMsg = &v
	return s
}

type AddBaasEbcClassUserRequest struct {
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

func (s AddBaasEbcClassUserRequest) String() string {
	return tea.Prettify(s)
}

func (s AddBaasEbcClassUserRequest) GoString() string {
	return s.String()
}

func (s *AddBaasEbcClassUserRequest) SetAuthToken(v string) *AddBaasEbcClassUserRequest {
	s.AuthToken = &v
	return s
}

func (s *AddBaasEbcClassUserRequest) SetProductInstanceId(v string) *AddBaasEbcClassUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddBaasEbcClassUserRequest) SetRegionName(v string) *AddBaasEbcClassUserRequest {
	s.RegionName = &v
	return s
}

func (s *AddBaasEbcClassUserRequest) SetClassId(v string) *AddBaasEbcClassUserRequest {
	s.ClassId = &v
	return s
}

func (s *AddBaasEbcClassUserRequest) SetOrgDid(v string) *AddBaasEbcClassUserRequest {
	s.OrgDid = &v
	return s
}

func (s *AddBaasEbcClassUserRequest) SetOrgUserList(v []*OrgUser) *AddBaasEbcClassUserRequest {
	s.OrgUserList = v
	return s
}

type AddBaasEbcClassUserResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 加入失败的用户列表
	FailList []*OrgUser `json:"fail_list,omitempty" xml:"fail_list,omitempty" type:"Repeated"`
}

func (s AddBaasEbcClassUserResponse) String() string {
	return tea.Prettify(s)
}

func (s AddBaasEbcClassUserResponse) GoString() string {
	return s.String()
}

func (s *AddBaasEbcClassUserResponse) SetReqMsgId(v string) *AddBaasEbcClassUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddBaasEbcClassUserResponse) SetResultCode(v string) *AddBaasEbcClassUserResponse {
	s.ResultCode = &v
	return s
}

func (s *AddBaasEbcClassUserResponse) SetResultMsg(v string) *AddBaasEbcClassUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddBaasEbcClassUserResponse) SetFailList(v []*OrgUser) *AddBaasEbcClassUserResponse {
	s.FailList = v
	return s
}

type DeleteBaasEbcClassUserRequest struct {
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

func (s DeleteBaasEbcClassUserRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteBaasEbcClassUserRequest) GoString() string {
	return s.String()
}

func (s *DeleteBaasEbcClassUserRequest) SetAuthToken(v string) *DeleteBaasEbcClassUserRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteBaasEbcClassUserRequest) SetProductInstanceId(v string) *DeleteBaasEbcClassUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteBaasEbcClassUserRequest) SetRegionName(v string) *DeleteBaasEbcClassUserRequest {
	s.RegionName = &v
	return s
}

func (s *DeleteBaasEbcClassUserRequest) SetClassId(v string) *DeleteBaasEbcClassUserRequest {
	s.ClassId = &v
	return s
}

func (s *DeleteBaasEbcClassUserRequest) SetOrgDid(v string) *DeleteBaasEbcClassUserRequest {
	s.OrgDid = &v
	return s
}

func (s *DeleteBaasEbcClassUserRequest) SetOrgUserList(v []*OrgUser) *DeleteBaasEbcClassUserRequest {
	s.OrgUserList = v
	return s
}

type DeleteBaasEbcClassUserResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 删除失败的用户列表
	FailList []*OrgUser `json:"fail_list,omitempty" xml:"fail_list,omitempty" type:"Repeated"`
}

func (s DeleteBaasEbcClassUserResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteBaasEbcClassUserResponse) GoString() string {
	return s.String()
}

func (s *DeleteBaasEbcClassUserResponse) SetReqMsgId(v string) *DeleteBaasEbcClassUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteBaasEbcClassUserResponse) SetResultCode(v string) *DeleteBaasEbcClassUserResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteBaasEbcClassUserResponse) SetResultMsg(v string) *DeleteBaasEbcClassUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteBaasEbcClassUserResponse) SetFailList(v []*OrgUser) *DeleteBaasEbcClassUserResponse {
	s.FailList = v
	return s
}

type QueryBaasEbcOrganizationClassRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 班级id
	ClassId *string `json:"class_id,omitempty" xml:"class_id,omitempty" maxLength:"128"`
	// 企业did
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
}

func (s QueryBaasEbcOrganizationClassRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasEbcOrganizationClassRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasEbcOrganizationClassRequest) SetAuthToken(v string) *QueryBaasEbcOrganizationClassRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasEbcOrganizationClassRequest) SetProductInstanceId(v string) *QueryBaasEbcOrganizationClassRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasEbcOrganizationClassRequest) SetRegionName(v string) *QueryBaasEbcOrganizationClassRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasEbcOrganizationClassRequest) SetClassId(v string) *QueryBaasEbcOrganizationClassRequest {
	s.ClassId = &v
	return s
}

func (s *QueryBaasEbcOrganizationClassRequest) SetOrgDid(v string) *QueryBaasEbcOrganizationClassRequest {
	s.OrgDid = &v
	return s
}

type QueryBaasEbcOrganizationClassResponse struct {
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

func (s QueryBaasEbcOrganizationClassResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasEbcOrganizationClassResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasEbcOrganizationClassResponse) SetReqMsgId(v string) *QueryBaasEbcOrganizationClassResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasEbcOrganizationClassResponse) SetResultCode(v string) *QueryBaasEbcOrganizationClassResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasEbcOrganizationClassResponse) SetResultMsg(v string) *QueryBaasEbcOrganizationClassResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasEbcOrganizationClassResponse) SetClassName(v string) *QueryBaasEbcOrganizationClassResponse {
	s.ClassName = &v
	return s
}

func (s *QueryBaasEbcOrganizationClassResponse) SetClassStatus(v int64) *QueryBaasEbcOrganizationClassResponse {
	s.ClassStatus = &v
	return s
}

func (s *QueryBaasEbcOrganizationClassResponse) SetCreateTime(v string) *QueryBaasEbcOrganizationClassResponse {
	s.CreateTime = &v
	return s
}

func (s *QueryBaasEbcOrganizationClassResponse) SetModifyTime(v string) *QueryBaasEbcOrganizationClassResponse {
	s.ModifyTime = &v
	return s
}

func (s *QueryBaasEbcOrganizationClassResponse) SetPeriod(v int64) *QueryBaasEbcOrganizationClassResponse {
	s.Period = &v
	return s
}

func (s *QueryBaasEbcOrganizationClassResponse) SetType(v string) *QueryBaasEbcOrganizationClassResponse {
	s.Type = &v
	return s
}

func (s *QueryBaasEbcOrganizationClassResponse) SetUserNum(v int64) *QueryBaasEbcOrganizationClassResponse {
	s.UserNum = &v
	return s
}

type QueryBaasEbcClassUserRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 班级id
	ClassId *string `json:"class_id,omitempty" xml:"class_id,omitempty" maxLength:"128"`
	// 企业did
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
}

func (s QueryBaasEbcClassUserRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasEbcClassUserRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasEbcClassUserRequest) SetAuthToken(v string) *QueryBaasEbcClassUserRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasEbcClassUserRequest) SetProductInstanceId(v string) *QueryBaasEbcClassUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasEbcClassUserRequest) SetRegionName(v string) *QueryBaasEbcClassUserRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasEbcClassUserRequest) SetClassId(v string) *QueryBaasEbcClassUserRequest {
	s.ClassId = &v
	return s
}

func (s *QueryBaasEbcClassUserRequest) SetOrgDid(v string) *QueryBaasEbcClassUserRequest {
	s.OrgDid = &v
	return s
}

type QueryBaasEbcClassUserResponse struct {
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

func (s QueryBaasEbcClassUserResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasEbcClassUserResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasEbcClassUserResponse) SetReqMsgId(v string) *QueryBaasEbcClassUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasEbcClassUserResponse) SetResultCode(v string) *QueryBaasEbcClassUserResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasEbcClassUserResponse) SetResultMsg(v string) *QueryBaasEbcClassUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasEbcClassUserResponse) SetClassName(v string) *QueryBaasEbcClassUserResponse {
	s.ClassName = &v
	return s
}

func (s *QueryBaasEbcClassUserResponse) SetOrgUserIdList(v []*string) *QueryBaasEbcClassUserResponse {
	s.OrgUserIdList = v
	return s
}

func (s *QueryBaasEbcClassUserResponse) SetUserNum(v int64) *QueryBaasEbcClassUserResponse {
	s.UserNum = &v
	return s
}

type CreateBaasEbcOrganizationCourseRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 课程描述
	//
	CourseDescription *string `json:"course_description,omitempty" xml:"course_description,omitempty" maxLength:"1000"`
	// 课程结束时间
	CourseEndTime *string `json:"course_end_time,omitempty" xml:"course_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 课程名称
	CourseName *string `json:"course_name,omitempty" xml:"course_name,omitempty" maxLength:"64"`
	// 课程开始时间
	CourseStartTime *string `json:"course_start_time,omitempty" xml:"course_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 课程简介
	//
	CourseSummary *string `json:"course_summary,omitempty" xml:"course_summary,omitempty" maxLength:"120"`
	// 课程类型
	// 1直播课程，2录播课程，3线下课程，4其他类型
	CourseType *int64 `json:"course_type,omitempty" xml:"course_type,omitempty"`
	// 企业did
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	// 课程时长
	Period *int64 `json:"period,omitempty" xml:"period,omitempty"`
}

func (s CreateBaasEbcOrganizationCourseRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasEbcOrganizationCourseRequest) GoString() string {
	return s.String()
}

func (s *CreateBaasEbcOrganizationCourseRequest) SetAuthToken(v string) *CreateBaasEbcOrganizationCourseRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBaasEbcOrganizationCourseRequest) SetProductInstanceId(v string) *CreateBaasEbcOrganizationCourseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBaasEbcOrganizationCourseRequest) SetRegionName(v string) *CreateBaasEbcOrganizationCourseRequest {
	s.RegionName = &v
	return s
}

func (s *CreateBaasEbcOrganizationCourseRequest) SetCourseDescription(v string) *CreateBaasEbcOrganizationCourseRequest {
	s.CourseDescription = &v
	return s
}

func (s *CreateBaasEbcOrganizationCourseRequest) SetCourseEndTime(v string) *CreateBaasEbcOrganizationCourseRequest {
	s.CourseEndTime = &v
	return s
}

func (s *CreateBaasEbcOrganizationCourseRequest) SetCourseName(v string) *CreateBaasEbcOrganizationCourseRequest {
	s.CourseName = &v
	return s
}

func (s *CreateBaasEbcOrganizationCourseRequest) SetCourseStartTime(v string) *CreateBaasEbcOrganizationCourseRequest {
	s.CourseStartTime = &v
	return s
}

func (s *CreateBaasEbcOrganizationCourseRequest) SetCourseSummary(v string) *CreateBaasEbcOrganizationCourseRequest {
	s.CourseSummary = &v
	return s
}

func (s *CreateBaasEbcOrganizationCourseRequest) SetCourseType(v int64) *CreateBaasEbcOrganizationCourseRequest {
	s.CourseType = &v
	return s
}

func (s *CreateBaasEbcOrganizationCourseRequest) SetOrgDid(v string) *CreateBaasEbcOrganizationCourseRequest {
	s.OrgDid = &v
	return s
}

func (s *CreateBaasEbcOrganizationCourseRequest) SetPeriod(v int64) *CreateBaasEbcOrganizationCourseRequest {
	s.Period = &v
	return s
}

type CreateBaasEbcOrganizationCourseResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 课程did
	CourseId *string `json:"course_id,omitempty" xml:"course_id,omitempty"`
}

func (s CreateBaasEbcOrganizationCourseResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasEbcOrganizationCourseResponse) GoString() string {
	return s.String()
}

func (s *CreateBaasEbcOrganizationCourseResponse) SetReqMsgId(v string) *CreateBaasEbcOrganizationCourseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBaasEbcOrganizationCourseResponse) SetResultCode(v string) *CreateBaasEbcOrganizationCourseResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBaasEbcOrganizationCourseResponse) SetResultMsg(v string) *CreateBaasEbcOrganizationCourseResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBaasEbcOrganizationCourseResponse) SetCourseId(v string) *CreateBaasEbcOrganizationCourseResponse {
	s.CourseId = &v
	return s
}

type UpdateBaasEbcOrganizationCourseRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 课程描述
	//
	CourseDescription *string `json:"course_description,omitempty" xml:"course_description,omitempty" maxLength:"1000"`
	// 课程结束时间
	CourseEndTime *string `json:"course_end_time,omitempty" xml:"course_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 课程id
	CourseId *string `json:"course_id,omitempty" xml:"course_id,omitempty" maxLength:"128"`
	// 课程名称
	CourseName *string `json:"course_name,omitempty" xml:"course_name,omitempty" maxLength:"64"`
	// 课程开始时间
	CourseStartTime *string `json:"course_start_time,omitempty" xml:"course_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 课程简介
	//
	CourseSummary *string `json:"course_summary,omitempty" xml:"course_summary,omitempty" maxLength:"120"`
	// 课程类型
	// 1直播课程，2录播课程，3线下课程，4其他类型
	CourseType *int64 `json:"course_type,omitempty" xml:"course_type,omitempty"`
	// 企业id
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	// 课程时长
	Period *int64 `json:"period,omitempty" xml:"period,omitempty"`
}

func (s UpdateBaasEbcOrganizationCourseRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateBaasEbcOrganizationCourseRequest) GoString() string {
	return s.String()
}

func (s *UpdateBaasEbcOrganizationCourseRequest) SetAuthToken(v string) *UpdateBaasEbcOrganizationCourseRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateBaasEbcOrganizationCourseRequest) SetProductInstanceId(v string) *UpdateBaasEbcOrganizationCourseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateBaasEbcOrganizationCourseRequest) SetRegionName(v string) *UpdateBaasEbcOrganizationCourseRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateBaasEbcOrganizationCourseRequest) SetCourseDescription(v string) *UpdateBaasEbcOrganizationCourseRequest {
	s.CourseDescription = &v
	return s
}

func (s *UpdateBaasEbcOrganizationCourseRequest) SetCourseEndTime(v string) *UpdateBaasEbcOrganizationCourseRequest {
	s.CourseEndTime = &v
	return s
}

func (s *UpdateBaasEbcOrganizationCourseRequest) SetCourseId(v string) *UpdateBaasEbcOrganizationCourseRequest {
	s.CourseId = &v
	return s
}

func (s *UpdateBaasEbcOrganizationCourseRequest) SetCourseName(v string) *UpdateBaasEbcOrganizationCourseRequest {
	s.CourseName = &v
	return s
}

func (s *UpdateBaasEbcOrganizationCourseRequest) SetCourseStartTime(v string) *UpdateBaasEbcOrganizationCourseRequest {
	s.CourseStartTime = &v
	return s
}

func (s *UpdateBaasEbcOrganizationCourseRequest) SetCourseSummary(v string) *UpdateBaasEbcOrganizationCourseRequest {
	s.CourseSummary = &v
	return s
}

func (s *UpdateBaasEbcOrganizationCourseRequest) SetCourseType(v int64) *UpdateBaasEbcOrganizationCourseRequest {
	s.CourseType = &v
	return s
}

func (s *UpdateBaasEbcOrganizationCourseRequest) SetOrgDid(v string) *UpdateBaasEbcOrganizationCourseRequest {
	s.OrgDid = &v
	return s
}

func (s *UpdateBaasEbcOrganizationCourseRequest) SetPeriod(v int64) *UpdateBaasEbcOrganizationCourseRequest {
	s.Period = &v
	return s
}

type UpdateBaasEbcOrganizationCourseResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateBaasEbcOrganizationCourseResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateBaasEbcOrganizationCourseResponse) GoString() string {
	return s.String()
}

func (s *UpdateBaasEbcOrganizationCourseResponse) SetReqMsgId(v string) *UpdateBaasEbcOrganizationCourseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateBaasEbcOrganizationCourseResponse) SetResultCode(v string) *UpdateBaasEbcOrganizationCourseResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateBaasEbcOrganizationCourseResponse) SetResultMsg(v string) *UpdateBaasEbcOrganizationCourseResponse {
	s.ResultMsg = &v
	return s
}

type AddBaasEbcCourseClassRequest struct {
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

func (s AddBaasEbcCourseClassRequest) String() string {
	return tea.Prettify(s)
}

func (s AddBaasEbcCourseClassRequest) GoString() string {
	return s.String()
}

func (s *AddBaasEbcCourseClassRequest) SetAuthToken(v string) *AddBaasEbcCourseClassRequest {
	s.AuthToken = &v
	return s
}

func (s *AddBaasEbcCourseClassRequest) SetProductInstanceId(v string) *AddBaasEbcCourseClassRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddBaasEbcCourseClassRequest) SetRegionName(v string) *AddBaasEbcCourseClassRequest {
	s.RegionName = &v
	return s
}

func (s *AddBaasEbcCourseClassRequest) SetClassList(v []*Class) *AddBaasEbcCourseClassRequest {
	s.ClassList = v
	return s
}

func (s *AddBaasEbcCourseClassRequest) SetCourseId(v string) *AddBaasEbcCourseClassRequest {
	s.CourseId = &v
	return s
}

func (s *AddBaasEbcCourseClassRequest) SetOrgDid(v string) *AddBaasEbcCourseClassRequest {
	s.OrgDid = &v
	return s
}

type AddBaasEbcCourseClassResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 添加失败的班级列表
	FailList []*Class `json:"fail_list,omitempty" xml:"fail_list,omitempty" type:"Repeated"`
}

func (s AddBaasEbcCourseClassResponse) String() string {
	return tea.Prettify(s)
}

func (s AddBaasEbcCourseClassResponse) GoString() string {
	return s.String()
}

func (s *AddBaasEbcCourseClassResponse) SetReqMsgId(v string) *AddBaasEbcCourseClassResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddBaasEbcCourseClassResponse) SetResultCode(v string) *AddBaasEbcCourseClassResponse {
	s.ResultCode = &v
	return s
}

func (s *AddBaasEbcCourseClassResponse) SetResultMsg(v string) *AddBaasEbcCourseClassResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddBaasEbcCourseClassResponse) SetFailList(v []*Class) *AddBaasEbcCourseClassResponse {
	s.FailList = v
	return s
}

type AddBaasEbcCourseUserRequest struct {
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

func (s AddBaasEbcCourseUserRequest) String() string {
	return tea.Prettify(s)
}

func (s AddBaasEbcCourseUserRequest) GoString() string {
	return s.String()
}

func (s *AddBaasEbcCourseUserRequest) SetAuthToken(v string) *AddBaasEbcCourseUserRequest {
	s.AuthToken = &v
	return s
}

func (s *AddBaasEbcCourseUserRequest) SetProductInstanceId(v string) *AddBaasEbcCourseUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddBaasEbcCourseUserRequest) SetRegionName(v string) *AddBaasEbcCourseUserRequest {
	s.RegionName = &v
	return s
}

func (s *AddBaasEbcCourseUserRequest) SetCourseId(v string) *AddBaasEbcCourseUserRequest {
	s.CourseId = &v
	return s
}

func (s *AddBaasEbcCourseUserRequest) SetOrgDid(v string) *AddBaasEbcCourseUserRequest {
	s.OrgDid = &v
	return s
}

func (s *AddBaasEbcCourseUserRequest) SetOrgUserList(v []*OrgUser) *AddBaasEbcCourseUserRequest {
	s.OrgUserList = v
	return s
}

type AddBaasEbcCourseUserResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 添加失败的用户列表
	FailList []*OrgUser `json:"fail_list,omitempty" xml:"fail_list,omitempty" type:"Repeated"`
}

func (s AddBaasEbcCourseUserResponse) String() string {
	return tea.Prettify(s)
}

func (s AddBaasEbcCourseUserResponse) GoString() string {
	return s.String()
}

func (s *AddBaasEbcCourseUserResponse) SetReqMsgId(v string) *AddBaasEbcCourseUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddBaasEbcCourseUserResponse) SetResultCode(v string) *AddBaasEbcCourseUserResponse {
	s.ResultCode = &v
	return s
}

func (s *AddBaasEbcCourseUserResponse) SetResultMsg(v string) *AddBaasEbcCourseUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddBaasEbcCourseUserResponse) SetFailList(v []*OrgUser) *AddBaasEbcCourseUserResponse {
	s.FailList = v
	return s
}

type DeleteBaasEbcCourseClassRequest struct {
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

func (s DeleteBaasEbcCourseClassRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteBaasEbcCourseClassRequest) GoString() string {
	return s.String()
}

func (s *DeleteBaasEbcCourseClassRequest) SetAuthToken(v string) *DeleteBaasEbcCourseClassRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteBaasEbcCourseClassRequest) SetProductInstanceId(v string) *DeleteBaasEbcCourseClassRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteBaasEbcCourseClassRequest) SetRegionName(v string) *DeleteBaasEbcCourseClassRequest {
	s.RegionName = &v
	return s
}

func (s *DeleteBaasEbcCourseClassRequest) SetClassList(v []*Class) *DeleteBaasEbcCourseClassRequest {
	s.ClassList = v
	return s
}

func (s *DeleteBaasEbcCourseClassRequest) SetCourseId(v string) *DeleteBaasEbcCourseClassRequest {
	s.CourseId = &v
	return s
}

func (s *DeleteBaasEbcCourseClassRequest) SetOrgDid(v string) *DeleteBaasEbcCourseClassRequest {
	s.OrgDid = &v
	return s
}

type DeleteBaasEbcCourseClassResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 删除失败的班级列表
	FailList []*Class `json:"fail_list,omitempty" xml:"fail_list,omitempty" type:"Repeated"`
}

func (s DeleteBaasEbcCourseClassResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteBaasEbcCourseClassResponse) GoString() string {
	return s.String()
}

func (s *DeleteBaasEbcCourseClassResponse) SetReqMsgId(v string) *DeleteBaasEbcCourseClassResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteBaasEbcCourseClassResponse) SetResultCode(v string) *DeleteBaasEbcCourseClassResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteBaasEbcCourseClassResponse) SetResultMsg(v string) *DeleteBaasEbcCourseClassResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteBaasEbcCourseClassResponse) SetFailList(v []*Class) *DeleteBaasEbcCourseClassResponse {
	s.FailList = v
	return s
}

type DeleteBaasEbcCourseUserRequest struct {
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

func (s DeleteBaasEbcCourseUserRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteBaasEbcCourseUserRequest) GoString() string {
	return s.String()
}

func (s *DeleteBaasEbcCourseUserRequest) SetAuthToken(v string) *DeleteBaasEbcCourseUserRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteBaasEbcCourseUserRequest) SetProductInstanceId(v string) *DeleteBaasEbcCourseUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteBaasEbcCourseUserRequest) SetRegionName(v string) *DeleteBaasEbcCourseUserRequest {
	s.RegionName = &v
	return s
}

func (s *DeleteBaasEbcCourseUserRequest) SetCourseId(v string) *DeleteBaasEbcCourseUserRequest {
	s.CourseId = &v
	return s
}

func (s *DeleteBaasEbcCourseUserRequest) SetOrgDid(v string) *DeleteBaasEbcCourseUserRequest {
	s.OrgDid = &v
	return s
}

func (s *DeleteBaasEbcCourseUserRequest) SetOrgUserList(v []*OrgUser) *DeleteBaasEbcCourseUserRequest {
	s.OrgUserList = v
	return s
}

type DeleteBaasEbcCourseUserResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 删除失败的用户列表
	FailList []*OrgUser `json:"fail_list,omitempty" xml:"fail_list,omitempty" type:"Repeated"`
}

func (s DeleteBaasEbcCourseUserResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteBaasEbcCourseUserResponse) GoString() string {
	return s.String()
}

func (s *DeleteBaasEbcCourseUserResponse) SetReqMsgId(v string) *DeleteBaasEbcCourseUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteBaasEbcCourseUserResponse) SetResultCode(v string) *DeleteBaasEbcCourseUserResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteBaasEbcCourseUserResponse) SetResultMsg(v string) *DeleteBaasEbcCourseUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteBaasEbcCourseUserResponse) SetFailList(v []*OrgUser) *DeleteBaasEbcCourseUserResponse {
	s.FailList = v
	return s
}

type CreateBaasEbcUserCertRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 证书编号
	CertCode *string `json:"cert_code,omitempty" xml:"cert_code,omitempty" maxLength:"64"`
	// 证书描述
	CertDescription *string `json:"cert_description,omitempty" xml:"cert_description,omitempty" maxLength:"1000"`
	// 时间周期结束时间
	CertEndTime *string `json:"cert_end_time,omitempty" xml:"cert_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 证书名称-中文
	CertNameCn *string `json:"cert_name_cn,omitempty" xml:"cert_name_cn,omitempty" maxLength:"64"`
	// 证书名称-英文（拼音）
	CertNameEn *string `json:"cert_name_en,omitempty" xml:"cert_name_en,omitempty" maxLength:"64"`
	// 首次发布时间
	CertPublishTime *string `json:"cert_publish_time,omitempty" xml:"cert_publish_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 发布时间时区，默认UTC+8
	CertPublishTimeZone *string `json:"cert_publish_time_zone,omitempty" xml:"cert_publish_time_zone,omitempty" maxLength:"64"`
	// 时间周期开始时间
	CertStartTime *string `json:"cert_start_time,omitempty" xml:"cert_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 1-有效 2-冻结 3-失效 4-作废 5-其他
	CertStatus *int64 `json:"cert_status,omitempty" xml:"cert_status,omitempty"`
	// 证书概述
	CertSummary *string `json:"cert_summary,omitempty" xml:"cert_summary,omitempty" maxLength:"250"`
	// 证书归属国家 使用“ISO 3166-1”代码表-数字码 https://zh.wikipedia.org/wiki/ISO_3166-1
	Country *string `json:"country,omitempty" xml:"country,omitempty" maxLength:"32"`
	// 有效期类型1.长期有效 2.时间周期
	ExpireType *int64 `json:"expire_type,omitempty" xml:"expire_type,omitempty"`
	// 证书持有人姓名
	//
	HolderName *string `json:"holder_name,omitempty" xml:"holder_name,omitempty" maxLength:"64"`
	// 证书等级类型： 初级（五级）、中级（四级）、高级（三级）、技师（二级）和高级技师（一级）、其他
	Level *string `json:"level,omitempty" xml:"level,omitempty" maxLength:"256"`
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
	// 隐私属性描述列表
	PrivacyDescList []*PrivacyDesc `json:"privacy_desc_list,omitempty" xml:"privacy_desc_list,omitempty" type:"Repeated"`
	// 托管属性描述列表
	ProxyDescList []*ProxyDesc `json:"proxy_desc_list,omitempty" xml:"proxy_desc_list,omitempty" type:"Repeated"`
	// 公开属性描述列表
	PublicDescList []*PublicDesc `json:"public_desc_list,omitempty" xml:"public_desc_list,omitempty" type:"Repeated"`
	// 持有人辅助证件编号-1
	// 请使用我们提供的公钥对数据进行加密
	SecondIdNo1 *string `json:"second_id_no_1,omitempty" xml:"second_id_no_1,omitempty" maxLength:"1024"`
	// 持有人辅助证件编号-2
	// 请使用我们提供的公钥对数据进行加密
	SecondIdNo2 *string `json:"second_id_no_2,omitempty" xml:"second_id_no_2,omitempty" maxLength:"1024"`
	// 持有人辅助证件编号-3
	// 请使用我们提供的公钥对数据进行加密
	SecondIdNo3 *string `json:"second_id_no_3,omitempty" xml:"second_id_no_3,omitempty" maxLength:"1024"`
	// 非对称加密后的对称秘钥，对应执行java SDK中的EnvelopeClient#envelopeSeal方法的返回值
	SecretKey *string `json:"secret_key,omitempty" xml:"secret_key,omitempty" maxLength:"512"`
	// -数字码类型为156时可使用如下类目： --学历证书-XLZ --职业证书--ZYZ -其他国家传入--QT
	Type *string `json:"type,omitempty" xml:"type,omitempty" maxLength:"64"`
}

func (s CreateBaasEbcUserCertRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasEbcUserCertRequest) GoString() string {
	return s.String()
}

func (s *CreateBaasEbcUserCertRequest) SetAuthToken(v string) *CreateBaasEbcUserCertRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetProductInstanceId(v string) *CreateBaasEbcUserCertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetRegionName(v string) *CreateBaasEbcUserCertRequest {
	s.RegionName = &v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetCertCode(v string) *CreateBaasEbcUserCertRequest {
	s.CertCode = &v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetCertDescription(v string) *CreateBaasEbcUserCertRequest {
	s.CertDescription = &v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetCertEndTime(v string) *CreateBaasEbcUserCertRequest {
	s.CertEndTime = &v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetCertNameCn(v string) *CreateBaasEbcUserCertRequest {
	s.CertNameCn = &v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetCertNameEn(v string) *CreateBaasEbcUserCertRequest {
	s.CertNameEn = &v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetCertPublishTime(v string) *CreateBaasEbcUserCertRequest {
	s.CertPublishTime = &v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetCertPublishTimeZone(v string) *CreateBaasEbcUserCertRequest {
	s.CertPublishTimeZone = &v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetCertStartTime(v string) *CreateBaasEbcUserCertRequest {
	s.CertStartTime = &v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetCertStatus(v int64) *CreateBaasEbcUserCertRequest {
	s.CertStatus = &v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetCertSummary(v string) *CreateBaasEbcUserCertRequest {
	s.CertSummary = &v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetCountry(v string) *CreateBaasEbcUserCertRequest {
	s.Country = &v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetExpireType(v int64) *CreateBaasEbcUserCertRequest {
	s.ExpireType = &v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetHolderName(v string) *CreateBaasEbcUserCertRequest {
	s.HolderName = &v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetLevel(v string) *CreateBaasEbcUserCertRequest {
	s.Level = &v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetOrgDid(v string) *CreateBaasEbcUserCertRequest {
	s.OrgDid = &v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetOrgName(v string) *CreateBaasEbcUserCertRequest {
	s.OrgName = &v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetOrgUserId(v string) *CreateBaasEbcUserCertRequest {
	s.OrgUserId = &v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetPrimaryIdNo(v string) *CreateBaasEbcUserCertRequest {
	s.PrimaryIdNo = &v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetPrivacyDescList(v []*PrivacyDesc) *CreateBaasEbcUserCertRequest {
	s.PrivacyDescList = v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetProxyDescList(v []*ProxyDesc) *CreateBaasEbcUserCertRequest {
	s.ProxyDescList = v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetPublicDescList(v []*PublicDesc) *CreateBaasEbcUserCertRequest {
	s.PublicDescList = v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetSecondIdNo1(v string) *CreateBaasEbcUserCertRequest {
	s.SecondIdNo1 = &v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetSecondIdNo2(v string) *CreateBaasEbcUserCertRequest {
	s.SecondIdNo2 = &v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetSecondIdNo3(v string) *CreateBaasEbcUserCertRequest {
	s.SecondIdNo3 = &v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetSecretKey(v string) *CreateBaasEbcUserCertRequest {
	s.SecretKey = &v
	return s
}

func (s *CreateBaasEbcUserCertRequest) SetType(v string) *CreateBaasEbcUserCertRequest {
	s.Type = &v
	return s
}

type CreateBaasEbcUserCertResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 证书id
	CertId *string `json:"cert_id,omitempty" xml:"cert_id,omitempty"`
}

func (s CreateBaasEbcUserCertResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasEbcUserCertResponse) GoString() string {
	return s.String()
}

func (s *CreateBaasEbcUserCertResponse) SetReqMsgId(v string) *CreateBaasEbcUserCertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBaasEbcUserCertResponse) SetResultCode(v string) *CreateBaasEbcUserCertResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBaasEbcUserCertResponse) SetResultMsg(v string) *CreateBaasEbcUserCertResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBaasEbcUserCertResponse) SetCertId(v string) *CreateBaasEbcUserCertResponse {
	s.CertId = &v
	return s
}

type UpdateBaasEbcUserCertRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
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
	// 隐私属性描述列表
	//
	PrivacyDescList []*PrivacyDesc `json:"privacy_desc_list,omitempty" xml:"privacy_desc_list,omitempty" type:"Repeated"`
	// 托管属性描述列表
	//
	ProxyDescList []*ProxyDesc `json:"proxy_desc_list,omitempty" xml:"proxy_desc_list,omitempty" type:"Repeated"`
	// 公开属性描述列表
	//
	PublicDescList []*PublicDesc `json:"public_desc_list,omitempty" xml:"public_desc_list,omitempty" type:"Repeated"`
	// 非对称加密后的对称秘钥，对应执行java SDK中的EnvelopeClient#envelopeSeal方法的返回值
	SecretKey *string `json:"secret_key,omitempty" xml:"secret_key,omitempty" maxLength:"512"`
}

func (s UpdateBaasEbcUserCertRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateBaasEbcUserCertRequest) GoString() string {
	return s.String()
}

func (s *UpdateBaasEbcUserCertRequest) SetAuthToken(v string) *UpdateBaasEbcUserCertRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateBaasEbcUserCertRequest) SetProductInstanceId(v string) *UpdateBaasEbcUserCertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateBaasEbcUserCertRequest) SetRegionName(v string) *UpdateBaasEbcUserCertRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateBaasEbcUserCertRequest) SetCertId(v string) *UpdateBaasEbcUserCertRequest {
	s.CertId = &v
	return s
}

func (s *UpdateBaasEbcUserCertRequest) SetCertPublishTime(v string) *UpdateBaasEbcUserCertRequest {
	s.CertPublishTime = &v
	return s
}

func (s *UpdateBaasEbcUserCertRequest) SetCertStatus(v int64) *UpdateBaasEbcUserCertRequest {
	s.CertStatus = &v
	return s
}

func (s *UpdateBaasEbcUserCertRequest) SetOrgDid(v string) *UpdateBaasEbcUserCertRequest {
	s.OrgDid = &v
	return s
}

func (s *UpdateBaasEbcUserCertRequest) SetOrgUserId(v string) *UpdateBaasEbcUserCertRequest {
	s.OrgUserId = &v
	return s
}

func (s *UpdateBaasEbcUserCertRequest) SetPrivacyDescList(v []*PrivacyDesc) *UpdateBaasEbcUserCertRequest {
	s.PrivacyDescList = v
	return s
}

func (s *UpdateBaasEbcUserCertRequest) SetProxyDescList(v []*ProxyDesc) *UpdateBaasEbcUserCertRequest {
	s.ProxyDescList = v
	return s
}

func (s *UpdateBaasEbcUserCertRequest) SetPublicDescList(v []*PublicDesc) *UpdateBaasEbcUserCertRequest {
	s.PublicDescList = v
	return s
}

func (s *UpdateBaasEbcUserCertRequest) SetSecretKey(v string) *UpdateBaasEbcUserCertRequest {
	s.SecretKey = &v
	return s
}

type UpdateBaasEbcUserCertResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateBaasEbcUserCertResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateBaasEbcUserCertResponse) GoString() string {
	return s.String()
}

func (s *UpdateBaasEbcUserCertResponse) SetReqMsgId(v string) *UpdateBaasEbcUserCertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateBaasEbcUserCertResponse) SetResultCode(v string) *UpdateBaasEbcUserCertResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateBaasEbcUserCertResponse) SetResultMsg(v string) *UpdateBaasEbcUserCertResponse {
	s.ResultMsg = &v
	return s
}

type QueryBaasEbcOrganizationCertRequest struct {
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

func (s QueryBaasEbcOrganizationCertRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasEbcOrganizationCertRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasEbcOrganizationCertRequest) SetAuthToken(v string) *QueryBaasEbcOrganizationCertRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasEbcOrganizationCertRequest) SetProductInstanceId(v string) *QueryBaasEbcOrganizationCertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasEbcOrganizationCertRequest) SetRegionName(v string) *QueryBaasEbcOrganizationCertRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasEbcOrganizationCertRequest) SetEnd(v string) *QueryBaasEbcOrganizationCertRequest {
	s.End = &v
	return s
}

func (s *QueryBaasEbcOrganizationCertRequest) SetOrgDid(v string) *QueryBaasEbcOrganizationCertRequest {
	s.OrgDid = &v
	return s
}

func (s *QueryBaasEbcOrganizationCertRequest) SetStart(v string) *QueryBaasEbcOrganizationCertRequest {
	s.Start = &v
	return s
}

type QueryBaasEbcOrganizationCertResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 证书id
	CertIdList []*string `json:"cert_id_list,omitempty" xml:"cert_id_list,omitempty" type:"Repeated"`
}

func (s QueryBaasEbcOrganizationCertResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasEbcOrganizationCertResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasEbcOrganizationCertResponse) SetReqMsgId(v string) *QueryBaasEbcOrganizationCertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasEbcOrganizationCertResponse) SetResultCode(v string) *QueryBaasEbcOrganizationCertResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasEbcOrganizationCertResponse) SetResultMsg(v string) *QueryBaasEbcOrganizationCertResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasEbcOrganizationCertResponse) SetCertIdList(v []*string) *QueryBaasEbcOrganizationCertResponse {
	s.CertIdList = v
	return s
}

type QueryBaasEbcUserCertRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 企业did
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	// 企业用户id
	OrgUserId *string `json:"org_user_id,omitempty" xml:"org_user_id,omitempty" maxLength:"128"`
}

func (s QueryBaasEbcUserCertRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasEbcUserCertRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasEbcUserCertRequest) SetAuthToken(v string) *QueryBaasEbcUserCertRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasEbcUserCertRequest) SetProductInstanceId(v string) *QueryBaasEbcUserCertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasEbcUserCertRequest) SetRegionName(v string) *QueryBaasEbcUserCertRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasEbcUserCertRequest) SetOrgDid(v string) *QueryBaasEbcUserCertRequest {
	s.OrgDid = &v
	return s
}

func (s *QueryBaasEbcUserCertRequest) SetOrgUserId(v string) *QueryBaasEbcUserCertRequest {
	s.OrgUserId = &v
	return s
}

type QueryBaasEbcUserCertResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 证书id列表
	CertIdList []*string `json:"cert_id_list,omitempty" xml:"cert_id_list,omitempty" type:"Repeated"`
}

func (s QueryBaasEbcUserCertResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasEbcUserCertResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasEbcUserCertResponse) SetReqMsgId(v string) *QueryBaasEbcUserCertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasEbcUserCertResponse) SetResultCode(v string) *QueryBaasEbcUserCertResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasEbcUserCertResponse) SetResultMsg(v string) *QueryBaasEbcUserCertResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasEbcUserCertResponse) SetCertIdList(v []*string) *QueryBaasEbcUserCertResponse {
	s.CertIdList = v
	return s
}

type QueryBaasEbcCertRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 证书id
	CertId *string `json:"cert_id,omitempty" xml:"cert_id,omitempty" maxLength:"128"`
	// 企业did
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
}

func (s QueryBaasEbcCertRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasEbcCertRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasEbcCertRequest) SetAuthToken(v string) *QueryBaasEbcCertRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasEbcCertRequest) SetProductInstanceId(v string) *QueryBaasEbcCertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasEbcCertRequest) SetRegionName(v string) *QueryBaasEbcCertRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasEbcCertRequest) SetCertId(v string) *QueryBaasEbcCertRequest {
	s.CertId = &v
	return s
}

func (s *QueryBaasEbcCertRequest) SetOrgDid(v string) *QueryBaasEbcCertRequest {
	s.OrgDid = &v
	return s
}

type QueryBaasEbcCertResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 证书明细
	Cert *Cert `json:"cert,omitempty" xml:"cert,omitempty"`
}

func (s QueryBaasEbcCertResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasEbcCertResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasEbcCertResponse) SetReqMsgId(v string) *QueryBaasEbcCertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasEbcCertResponse) SetResultCode(v string) *QueryBaasEbcCertResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasEbcCertResponse) SetResultMsg(v string) *QueryBaasEbcCertResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasEbcCertResponse) SetCert(v *Cert) *QueryBaasEbcCertResponse {
	s.Cert = v
	return s
}

type ApplyBaasEbcCertUrlRequest struct {
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

func (s ApplyBaasEbcCertUrlRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyBaasEbcCertUrlRequest) GoString() string {
	return s.String()
}

func (s *ApplyBaasEbcCertUrlRequest) SetAuthToken(v string) *ApplyBaasEbcCertUrlRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyBaasEbcCertUrlRequest) SetProductInstanceId(v string) *ApplyBaasEbcCertUrlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyBaasEbcCertUrlRequest) SetRegionName(v string) *ApplyBaasEbcCertUrlRequest {
	s.RegionName = &v
	return s
}

func (s *ApplyBaasEbcCertUrlRequest) SetCertCode(v string) *ApplyBaasEbcCertUrlRequest {
	s.CertCode = &v
	return s
}

func (s *ApplyBaasEbcCertUrlRequest) SetOrgDid(v string) *ApplyBaasEbcCertUrlRequest {
	s.OrgDid = &v
	return s
}

func (s *ApplyBaasEbcCertUrlRequest) SetOrgUserId(v string) *ApplyBaasEbcCertUrlRequest {
	s.OrgUserId = &v
	return s
}

type ApplyBaasEbcCertUrlResponse struct {
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

func (s ApplyBaasEbcCertUrlResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyBaasEbcCertUrlResponse) GoString() string {
	return s.String()
}

func (s *ApplyBaasEbcCertUrlResponse) SetReqMsgId(v string) *ApplyBaasEbcCertUrlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyBaasEbcCertUrlResponse) SetResultCode(v string) *ApplyBaasEbcCertUrlResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyBaasEbcCertUrlResponse) SetResultMsg(v string) *ApplyBaasEbcCertUrlResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyBaasEbcCertUrlResponse) SetCertUploadUrl(v string) *ApplyBaasEbcCertUrlResponse {
	s.CertUploadUrl = &v
	return s
}

func (s *ApplyBaasEbcCertUrlResponse) SetFeatureUploadUrl(v string) *ApplyBaasEbcCertUrlResponse {
	s.FeatureUploadUrl = &v
	return s
}

func (s *ApplyBaasEbcCertUrlResponse) SetHolderAvatarUploadUrl(v string) *ApplyBaasEbcCertUrlResponse {
	s.HolderAvatarUploadUrl = &v
	return s
}

type CreateBaasEbcAuthRequest struct {
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

func (s CreateBaasEbcAuthRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasEbcAuthRequest) GoString() string {
	return s.String()
}

func (s *CreateBaasEbcAuthRequest) SetAuthToken(v string) *CreateBaasEbcAuthRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBaasEbcAuthRequest) SetProductInstanceId(v string) *CreateBaasEbcAuthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBaasEbcAuthRequest) SetRegionName(v string) *CreateBaasEbcAuthRequest {
	s.RegionName = &v
	return s
}

func (s *CreateBaasEbcAuthRequest) SetAuthEndTime(v string) *CreateBaasEbcAuthRequest {
	s.AuthEndTime = &v
	return s
}

func (s *CreateBaasEbcAuthRequest) SetAuthStartTime(v string) *CreateBaasEbcAuthRequest {
	s.AuthStartTime = &v
	return s
}

func (s *CreateBaasEbcAuthRequest) SetDataType(v int64) *CreateBaasEbcAuthRequest {
	s.DataType = &v
	return s
}

func (s *CreateBaasEbcAuthRequest) SetTargetIdList(v []*string) *CreateBaasEbcAuthRequest {
	s.TargetIdList = v
	return s
}

func (s *CreateBaasEbcAuthRequest) SetTargetType(v int64) *CreateBaasEbcAuthRequest {
	s.TargetType = &v
	return s
}

func (s *CreateBaasEbcAuthRequest) SetTenantName(v string) *CreateBaasEbcAuthRequest {
	s.TenantName = &v
	return s
}

type CreateBaasEbcAuthResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权关系id
	AuthId *string `json:"auth_id,omitempty" xml:"auth_id,omitempty"`
}

func (s CreateBaasEbcAuthResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasEbcAuthResponse) GoString() string {
	return s.String()
}

func (s *CreateBaasEbcAuthResponse) SetReqMsgId(v string) *CreateBaasEbcAuthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBaasEbcAuthResponse) SetResultCode(v string) *CreateBaasEbcAuthResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBaasEbcAuthResponse) SetResultMsg(v string) *CreateBaasEbcAuthResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBaasEbcAuthResponse) SetAuthId(v string) *CreateBaasEbcAuthResponse {
	s.AuthId = &v
	return s
}

type UpdateBaasEbcAuthRequest struct {
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

func (s UpdateBaasEbcAuthRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateBaasEbcAuthRequest) GoString() string {
	return s.String()
}

func (s *UpdateBaasEbcAuthRequest) SetAuthToken(v string) *UpdateBaasEbcAuthRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateBaasEbcAuthRequest) SetProductInstanceId(v string) *UpdateBaasEbcAuthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateBaasEbcAuthRequest) SetRegionName(v string) *UpdateBaasEbcAuthRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateBaasEbcAuthRequest) SetAuthEndTime(v string) *UpdateBaasEbcAuthRequest {
	s.AuthEndTime = &v
	return s
}

func (s *UpdateBaasEbcAuthRequest) SetAuthId(v string) *UpdateBaasEbcAuthRequest {
	s.AuthId = &v
	return s
}

func (s *UpdateBaasEbcAuthRequest) SetAuthStartTime(v string) *UpdateBaasEbcAuthRequest {
	s.AuthStartTime = &v
	return s
}

func (s *UpdateBaasEbcAuthRequest) SetDataType(v int64) *UpdateBaasEbcAuthRequest {
	s.DataType = &v
	return s
}

func (s *UpdateBaasEbcAuthRequest) SetTargetIdList(v []*string) *UpdateBaasEbcAuthRequest {
	s.TargetIdList = v
	return s
}

func (s *UpdateBaasEbcAuthRequest) SetTargetType(v int64) *UpdateBaasEbcAuthRequest {
	s.TargetType = &v
	return s
}

func (s *UpdateBaasEbcAuthRequest) SetTenantName(v string) *UpdateBaasEbcAuthRequest {
	s.TenantName = &v
	return s
}

type UpdateBaasEbcAuthResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateBaasEbcAuthResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateBaasEbcAuthResponse) GoString() string {
	return s.String()
}

func (s *UpdateBaasEbcAuthResponse) SetReqMsgId(v string) *UpdateBaasEbcAuthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateBaasEbcAuthResponse) SetResultCode(v string) *UpdateBaasEbcAuthResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateBaasEbcAuthResponse) SetResultMsg(v string) *UpdateBaasEbcAuthResponse {
	s.ResultMsg = &v
	return s
}

type UpdateBaasEbcAuthStatusRequest struct {
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

func (s UpdateBaasEbcAuthStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateBaasEbcAuthStatusRequest) GoString() string {
	return s.String()
}

func (s *UpdateBaasEbcAuthStatusRequest) SetAuthToken(v string) *UpdateBaasEbcAuthStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateBaasEbcAuthStatusRequest) SetProductInstanceId(v string) *UpdateBaasEbcAuthStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateBaasEbcAuthStatusRequest) SetRegionName(v string) *UpdateBaasEbcAuthStatusRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateBaasEbcAuthStatusRequest) SetAuthId(v string) *UpdateBaasEbcAuthStatusRequest {
	s.AuthId = &v
	return s
}

func (s *UpdateBaasEbcAuthStatusRequest) SetStatus(v int64) *UpdateBaasEbcAuthStatusRequest {
	s.Status = &v
	return s
}

func (s *UpdateBaasEbcAuthStatusRequest) SetTenantName(v string) *UpdateBaasEbcAuthStatusRequest {
	s.TenantName = &v
	return s
}

type UpdateBaasEbcAuthStatusResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateBaasEbcAuthStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateBaasEbcAuthStatusResponse) GoString() string {
	return s.String()
}

func (s *UpdateBaasEbcAuthStatusResponse) SetReqMsgId(v string) *UpdateBaasEbcAuthStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateBaasEbcAuthStatusResponse) SetResultCode(v string) *UpdateBaasEbcAuthStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateBaasEbcAuthStatusResponse) SetResultMsg(v string) *UpdateBaasEbcAuthStatusResponse {
	s.ResultMsg = &v
	return s
}

type UpdateBaasEbcDataPriceRequest struct {
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

func (s UpdateBaasEbcDataPriceRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateBaasEbcDataPriceRequest) GoString() string {
	return s.String()
}

func (s *UpdateBaasEbcDataPriceRequest) SetAuthToken(v string) *UpdateBaasEbcDataPriceRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateBaasEbcDataPriceRequest) SetProductInstanceId(v string) *UpdateBaasEbcDataPriceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateBaasEbcDataPriceRequest) SetRegionName(v string) *UpdateBaasEbcDataPriceRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateBaasEbcDataPriceRequest) SetDataIdList(v []*string) *UpdateBaasEbcDataPriceRequest {
	s.DataIdList = v
	return s
}

func (s *UpdateBaasEbcDataPriceRequest) SetDataType(v int64) *UpdateBaasEbcDataPriceRequest {
	s.DataType = &v
	return s
}

func (s *UpdateBaasEbcDataPriceRequest) SetPrice(v int64) *UpdateBaasEbcDataPriceRequest {
	s.Price = &v
	return s
}

type UpdateBaasEbcDataPriceResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 更新失败的id列表
	FailList []*string `json:"fail_list,omitempty" xml:"fail_list,omitempty" type:"Repeated"`
}

func (s UpdateBaasEbcDataPriceResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateBaasEbcDataPriceResponse) GoString() string {
	return s.String()
}

func (s *UpdateBaasEbcDataPriceResponse) SetReqMsgId(v string) *UpdateBaasEbcDataPriceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateBaasEbcDataPriceResponse) SetResultCode(v string) *UpdateBaasEbcDataPriceResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateBaasEbcDataPriceResponse) SetResultMsg(v string) *UpdateBaasEbcDataPriceResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateBaasEbcDataPriceResponse) SetFailList(v []*string) *UpdateBaasEbcDataPriceResponse {
	s.FailList = v
	return s
}

type QueryBaasEbcConsumptionAmountRequest struct {
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

func (s QueryBaasEbcConsumptionAmountRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasEbcConsumptionAmountRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasEbcConsumptionAmountRequest) SetAuthToken(v string) *QueryBaasEbcConsumptionAmountRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasEbcConsumptionAmountRequest) SetProductInstanceId(v string) *QueryBaasEbcConsumptionAmountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasEbcConsumptionAmountRequest) SetRegionName(v string) *QueryBaasEbcConsumptionAmountRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasEbcConsumptionAmountRequest) SetEndTime(v string) *QueryBaasEbcConsumptionAmountRequest {
	s.EndTime = &v
	return s
}

func (s *QueryBaasEbcConsumptionAmountRequest) SetStartTime(v string) *QueryBaasEbcConsumptionAmountRequest {
	s.StartTime = &v
	return s
}

func (s *QueryBaasEbcConsumptionAmountRequest) SetTenantName(v string) *QueryBaasEbcConsumptionAmountRequest {
	s.TenantName = &v
	return s
}

type QueryBaasEbcConsumptionAmountResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区间内的累计消费金额
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty"`
}

func (s QueryBaasEbcConsumptionAmountResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasEbcConsumptionAmountResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasEbcConsumptionAmountResponse) SetReqMsgId(v string) *QueryBaasEbcConsumptionAmountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasEbcConsumptionAmountResponse) SetResultCode(v string) *QueryBaasEbcConsumptionAmountResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasEbcConsumptionAmountResponse) SetResultMsg(v string) *QueryBaasEbcConsumptionAmountResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasEbcConsumptionAmountResponse) SetAmount(v int64) *QueryBaasEbcConsumptionAmountResponse {
	s.Amount = &v
	return s
}

type QueryBaasEbcOrganizationCourseRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 班级id
	CourseId *string `json:"course_id,omitempty" xml:"course_id,omitempty" maxLength:"128"`
	// 企业did
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"256"`
}

func (s QueryBaasEbcOrganizationCourseRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasEbcOrganizationCourseRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasEbcOrganizationCourseRequest) SetAuthToken(v string) *QueryBaasEbcOrganizationCourseRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasEbcOrganizationCourseRequest) SetProductInstanceId(v string) *QueryBaasEbcOrganizationCourseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasEbcOrganizationCourseRequest) SetRegionName(v string) *QueryBaasEbcOrganizationCourseRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasEbcOrganizationCourseRequest) SetCourseId(v string) *QueryBaasEbcOrganizationCourseRequest {
	s.CourseId = &v
	return s
}

func (s *QueryBaasEbcOrganizationCourseRequest) SetOrgDid(v string) *QueryBaasEbcOrganizationCourseRequest {
	s.OrgDid = &v
	return s
}

type QueryBaasEbcOrganizationCourseResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 课程班级列表
	CourseClassList []*Class `json:"course_class_list,omitempty" xml:"course_class_list,omitempty" type:"Repeated"`
	// 课程描述
	CourseDescription *string `json:"course_description,omitempty" xml:"course_description,omitempty"`
	// 课程结束时间
	//
	CourseEndTime *string `json:"course_end_time,omitempty" xml:"course_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 课程最近一次修改时间
	CourseModifyTime *string `json:"course_modify_time,omitempty" xml:"course_modify_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 课程名称
	CourseName *string `json:"course_name,omitempty" xml:"course_name,omitempty"`
	// 课程学员列表
	CourseOrgUserList []*OrgUser `json:"course_org_user_list,omitempty" xml:"course_org_user_list,omitempty" type:"Repeated"`
	// 课程开始时间
	//
	CourseStartTime *string `json:"course_start_time,omitempty" xml:"course_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 1:已发布,2:进行中,3:已结束
	CourseStatus *int64 `json:"course_status,omitempty" xml:"course_status,omitempty"`
	// 课程简介
	CourseSummary *string `json:"course_summary,omitempty" xml:"course_summary,omitempty"`
	// 课程时长
	//
	Period *int64 `json:"period,omitempty" xml:"period,omitempty"`
}

func (s QueryBaasEbcOrganizationCourseResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasEbcOrganizationCourseResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasEbcOrganizationCourseResponse) SetReqMsgId(v string) *QueryBaasEbcOrganizationCourseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasEbcOrganizationCourseResponse) SetResultCode(v string) *QueryBaasEbcOrganizationCourseResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasEbcOrganizationCourseResponse) SetResultMsg(v string) *QueryBaasEbcOrganizationCourseResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasEbcOrganizationCourseResponse) SetCourseClassList(v []*Class) *QueryBaasEbcOrganizationCourseResponse {
	s.CourseClassList = v
	return s
}

func (s *QueryBaasEbcOrganizationCourseResponse) SetCourseDescription(v string) *QueryBaasEbcOrganizationCourseResponse {
	s.CourseDescription = &v
	return s
}

func (s *QueryBaasEbcOrganizationCourseResponse) SetCourseEndTime(v string) *QueryBaasEbcOrganizationCourseResponse {
	s.CourseEndTime = &v
	return s
}

func (s *QueryBaasEbcOrganizationCourseResponse) SetCourseModifyTime(v string) *QueryBaasEbcOrganizationCourseResponse {
	s.CourseModifyTime = &v
	return s
}

func (s *QueryBaasEbcOrganizationCourseResponse) SetCourseName(v string) *QueryBaasEbcOrganizationCourseResponse {
	s.CourseName = &v
	return s
}

func (s *QueryBaasEbcOrganizationCourseResponse) SetCourseOrgUserList(v []*OrgUser) *QueryBaasEbcOrganizationCourseResponse {
	s.CourseOrgUserList = v
	return s
}

func (s *QueryBaasEbcOrganizationCourseResponse) SetCourseStartTime(v string) *QueryBaasEbcOrganizationCourseResponse {
	s.CourseStartTime = &v
	return s
}

func (s *QueryBaasEbcOrganizationCourseResponse) SetCourseStatus(v int64) *QueryBaasEbcOrganizationCourseResponse {
	s.CourseStatus = &v
	return s
}

func (s *QueryBaasEbcOrganizationCourseResponse) SetCourseSummary(v string) *QueryBaasEbcOrganizationCourseResponse {
	s.CourseSummary = &v
	return s
}

func (s *QueryBaasEbcOrganizationCourseResponse) SetPeriod(v int64) *QueryBaasEbcOrganizationCourseResponse {
	s.Period = &v
	return s
}

type CreateBaasEbcCourseChapterRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 业务系统章节ID
	ChapterBizId *string `json:"chapter_biz_id,omitempty" xml:"chapter_biz_id,omitempty" maxLength:"128"`
	// 章节描述
	ChapterDescription *string `json:"chapter_description,omitempty" xml:"chapter_description,omitempty" maxLength:"2000"`
	// 章节名称
	ChapterName *string `json:"chapter_name,omitempty" xml:"chapter_name,omitempty" maxLength:"128"`
	// 章节时长，单位秒
	ChapterPeriod *int64 `json:"chapter_period,omitempty" xml:"chapter_period,omitempty"`
	// 课程id
	CourseId *string `json:"course_id,omitempty" xml:"course_id,omitempty" maxLength:"128"`
	// 企业链上did
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
}

func (s CreateBaasEbcCourseChapterRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasEbcCourseChapterRequest) GoString() string {
	return s.String()
}

func (s *CreateBaasEbcCourseChapterRequest) SetAuthToken(v string) *CreateBaasEbcCourseChapterRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBaasEbcCourseChapterRequest) SetProductInstanceId(v string) *CreateBaasEbcCourseChapterRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBaasEbcCourseChapterRequest) SetRegionName(v string) *CreateBaasEbcCourseChapterRequest {
	s.RegionName = &v
	return s
}

func (s *CreateBaasEbcCourseChapterRequest) SetChapterBizId(v string) *CreateBaasEbcCourseChapterRequest {
	s.ChapterBizId = &v
	return s
}

func (s *CreateBaasEbcCourseChapterRequest) SetChapterDescription(v string) *CreateBaasEbcCourseChapterRequest {
	s.ChapterDescription = &v
	return s
}

func (s *CreateBaasEbcCourseChapterRequest) SetChapterName(v string) *CreateBaasEbcCourseChapterRequest {
	s.ChapterName = &v
	return s
}

func (s *CreateBaasEbcCourseChapterRequest) SetChapterPeriod(v int64) *CreateBaasEbcCourseChapterRequest {
	s.ChapterPeriod = &v
	return s
}

func (s *CreateBaasEbcCourseChapterRequest) SetCourseId(v string) *CreateBaasEbcCourseChapterRequest {
	s.CourseId = &v
	return s
}

func (s *CreateBaasEbcCourseChapterRequest) SetOrgDid(v string) *CreateBaasEbcCourseChapterRequest {
	s.OrgDid = &v
	return s
}

type CreateBaasEbcCourseChapterResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上章节id
	ChapterId *string `json:"chapter_id,omitempty" xml:"chapter_id,omitempty"`
}

func (s CreateBaasEbcCourseChapterResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasEbcCourseChapterResponse) GoString() string {
	return s.String()
}

func (s *CreateBaasEbcCourseChapterResponse) SetReqMsgId(v string) *CreateBaasEbcCourseChapterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBaasEbcCourseChapterResponse) SetResultCode(v string) *CreateBaasEbcCourseChapterResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBaasEbcCourseChapterResponse) SetResultMsg(v string) *CreateBaasEbcCourseChapterResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBaasEbcCourseChapterResponse) SetChapterId(v string) *CreateBaasEbcCourseChapterResponse {
	s.ChapterId = &v
	return s
}

type UpdateBaasEbcCourseChapterRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 章节描述
	ChapterDescription *string `json:"chapter_description,omitempty" xml:"chapter_description,omitempty" maxLength:"2000"`
	// 链上章节id
	ChapterId *string `json:"chapter_id,omitempty" xml:"chapter_id,omitempty" maxLength:"128"`
	// 章节名称
	ChapterName *string `json:"chapter_name,omitempty" xml:"chapter_name,omitempty" maxLength:"128"`
	// 章节时长，单位秒
	ChapterPeriod *int64 `json:"chapter_period,omitempty" xml:"chapter_period,omitempty"`
	// 链上课程id
	CourseId *string `json:"course_id,omitempty" xml:"course_id,omitempty" maxLength:"128"`
	// 企业链上did
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
}

func (s UpdateBaasEbcCourseChapterRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateBaasEbcCourseChapterRequest) GoString() string {
	return s.String()
}

func (s *UpdateBaasEbcCourseChapterRequest) SetAuthToken(v string) *UpdateBaasEbcCourseChapterRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateBaasEbcCourseChapterRequest) SetProductInstanceId(v string) *UpdateBaasEbcCourseChapterRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateBaasEbcCourseChapterRequest) SetRegionName(v string) *UpdateBaasEbcCourseChapterRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateBaasEbcCourseChapterRequest) SetChapterDescription(v string) *UpdateBaasEbcCourseChapterRequest {
	s.ChapterDescription = &v
	return s
}

func (s *UpdateBaasEbcCourseChapterRequest) SetChapterId(v string) *UpdateBaasEbcCourseChapterRequest {
	s.ChapterId = &v
	return s
}

func (s *UpdateBaasEbcCourseChapterRequest) SetChapterName(v string) *UpdateBaasEbcCourseChapterRequest {
	s.ChapterName = &v
	return s
}

func (s *UpdateBaasEbcCourseChapterRequest) SetChapterPeriod(v int64) *UpdateBaasEbcCourseChapterRequest {
	s.ChapterPeriod = &v
	return s
}

func (s *UpdateBaasEbcCourseChapterRequest) SetCourseId(v string) *UpdateBaasEbcCourseChapterRequest {
	s.CourseId = &v
	return s
}

func (s *UpdateBaasEbcCourseChapterRequest) SetOrgDid(v string) *UpdateBaasEbcCourseChapterRequest {
	s.OrgDid = &v
	return s
}

type UpdateBaasEbcCourseChapterResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateBaasEbcCourseChapterResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateBaasEbcCourseChapterResponse) GoString() string {
	return s.String()
}

func (s *UpdateBaasEbcCourseChapterResponse) SetReqMsgId(v string) *UpdateBaasEbcCourseChapterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateBaasEbcCourseChapterResponse) SetResultCode(v string) *UpdateBaasEbcCourseChapterResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateBaasEbcCourseChapterResponse) SetResultMsg(v string) *UpdateBaasEbcCourseChapterResponse {
	s.ResultMsg = &v
	return s
}

type CreateBaasEbcCourseRecordRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链上章节id
	ChapterId *string `json:"chapter_id,omitempty" xml:"chapter_id,omitempty" maxLength:"128"`
	// 链上班级id
	ClassId *string `json:"class_id,omitempty" xml:"class_id,omitempty" maxLength:"128"`
	// 链上课程id
	CourseId *string `json:"course_id,omitempty" xml:"course_id,omitempty" maxLength:"128"`
	// 课程名称
	CourseName *string `json:"course_name,omitempty" xml:"course_name,omitempty" maxLength:"128"`
	// 企业did
	//
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	// 企业用户id
	OrgUserId *string `json:"org_user_id,omitempty" xml:"org_user_id,omitempty" maxLength:"128"`
	// 课程扩展信息，格式为json。比如钉钉用户id。
	RecordExt *string `json:"record_ext,omitempty" xml:"record_ext,omitempty" maxLength:"2000"`
	// 本次开启时间
	RecordOpenTime *string `json:"record_open_time,omitempty" xml:"record_open_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 本次观看时长，单位秒
	RecordPeriod *int64 `json:"record_period,omitempty" xml:"record_period,omitempty"`
	// 行为来源
	RecordSource *string `json:"record_source,omitempty" xml:"record_source,omitempty" maxLength:"128"`
	// 本次点击观看时间
	RecordStartTime *string `json:"record_start_time,omitempty" xml:"record_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
}

func (s CreateBaasEbcCourseRecordRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasEbcCourseRecordRequest) GoString() string {
	return s.String()
}

func (s *CreateBaasEbcCourseRecordRequest) SetAuthToken(v string) *CreateBaasEbcCourseRecordRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBaasEbcCourseRecordRequest) SetProductInstanceId(v string) *CreateBaasEbcCourseRecordRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBaasEbcCourseRecordRequest) SetRegionName(v string) *CreateBaasEbcCourseRecordRequest {
	s.RegionName = &v
	return s
}

func (s *CreateBaasEbcCourseRecordRequest) SetChapterId(v string) *CreateBaasEbcCourseRecordRequest {
	s.ChapterId = &v
	return s
}

func (s *CreateBaasEbcCourseRecordRequest) SetClassId(v string) *CreateBaasEbcCourseRecordRequest {
	s.ClassId = &v
	return s
}

func (s *CreateBaasEbcCourseRecordRequest) SetCourseId(v string) *CreateBaasEbcCourseRecordRequest {
	s.CourseId = &v
	return s
}

func (s *CreateBaasEbcCourseRecordRequest) SetCourseName(v string) *CreateBaasEbcCourseRecordRequest {
	s.CourseName = &v
	return s
}

func (s *CreateBaasEbcCourseRecordRequest) SetOrgDid(v string) *CreateBaasEbcCourseRecordRequest {
	s.OrgDid = &v
	return s
}

func (s *CreateBaasEbcCourseRecordRequest) SetOrgUserId(v string) *CreateBaasEbcCourseRecordRequest {
	s.OrgUserId = &v
	return s
}

func (s *CreateBaasEbcCourseRecordRequest) SetRecordExt(v string) *CreateBaasEbcCourseRecordRequest {
	s.RecordExt = &v
	return s
}

func (s *CreateBaasEbcCourseRecordRequest) SetRecordOpenTime(v string) *CreateBaasEbcCourseRecordRequest {
	s.RecordOpenTime = &v
	return s
}

func (s *CreateBaasEbcCourseRecordRequest) SetRecordPeriod(v int64) *CreateBaasEbcCourseRecordRequest {
	s.RecordPeriod = &v
	return s
}

func (s *CreateBaasEbcCourseRecordRequest) SetRecordSource(v string) *CreateBaasEbcCourseRecordRequest {
	s.RecordSource = &v
	return s
}

func (s *CreateBaasEbcCourseRecordRequest) SetRecordStartTime(v string) *CreateBaasEbcCourseRecordRequest {
	s.RecordStartTime = &v
	return s
}

type CreateBaasEbcCourseRecordResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上学习记录id
	RecordId *string `json:"record_id,omitempty" xml:"record_id,omitempty"`
}

func (s CreateBaasEbcCourseRecordResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasEbcCourseRecordResponse) GoString() string {
	return s.String()
}

func (s *CreateBaasEbcCourseRecordResponse) SetReqMsgId(v string) *CreateBaasEbcCourseRecordResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBaasEbcCourseRecordResponse) SetResultCode(v string) *CreateBaasEbcCourseRecordResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBaasEbcCourseRecordResponse) SetResultMsg(v string) *CreateBaasEbcCourseRecordResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBaasEbcCourseRecordResponse) SetRecordId(v string) *CreateBaasEbcCourseRecordResponse {
	s.RecordId = &v
	return s
}

type QueryBaasEbcCourseChapterRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 课程id
	CourseId *string `json:"course_id,omitempty" xml:"course_id,omitempty" maxLength:"128"`
	// 企业链上did
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
}

func (s QueryBaasEbcCourseChapterRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasEbcCourseChapterRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasEbcCourseChapterRequest) SetAuthToken(v string) *QueryBaasEbcCourseChapterRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasEbcCourseChapterRequest) SetProductInstanceId(v string) *QueryBaasEbcCourseChapterRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasEbcCourseChapterRequest) SetRegionName(v string) *QueryBaasEbcCourseChapterRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasEbcCourseChapterRequest) SetCourseId(v string) *QueryBaasEbcCourseChapterRequest {
	s.CourseId = &v
	return s
}

func (s *QueryBaasEbcCourseChapterRequest) SetOrgDid(v string) *QueryBaasEbcCourseChapterRequest {
	s.OrgDid = &v
	return s
}

type QueryBaasEbcCourseChapterResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 课程章节列表
	ChapterList []*CourseChapter `json:"chapter_list,omitempty" xml:"chapter_list,omitempty" type:"Repeated"`
}

func (s QueryBaasEbcCourseChapterResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasEbcCourseChapterResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasEbcCourseChapterResponse) SetReqMsgId(v string) *QueryBaasEbcCourseChapterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasEbcCourseChapterResponse) SetResultCode(v string) *QueryBaasEbcCourseChapterResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasEbcCourseChapterResponse) SetResultMsg(v string) *QueryBaasEbcCourseChapterResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasEbcCourseChapterResponse) SetChapterList(v []*CourseChapter) *QueryBaasEbcCourseChapterResponse {
	s.ChapterList = v
	return s
}

type QueryBaasEbcCourseRecordRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 课程id
	CourseId *string `json:"course_id,omitempty" xml:"course_id,omitempty" maxLength:"128"`
	// 企业链上did
	//
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	// 企业用户id
	//
	OrgUserId *string `json:"org_user_id,omitempty" xml:"org_user_id,omitempty" maxLength:"128"`
	// 页码，从1开始
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 页面大小，最大10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" maximum:"undefined"`
}

func (s QueryBaasEbcCourseRecordRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasEbcCourseRecordRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasEbcCourseRecordRequest) SetAuthToken(v string) *QueryBaasEbcCourseRecordRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasEbcCourseRecordRequest) SetProductInstanceId(v string) *QueryBaasEbcCourseRecordRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasEbcCourseRecordRequest) SetRegionName(v string) *QueryBaasEbcCourseRecordRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasEbcCourseRecordRequest) SetCourseId(v string) *QueryBaasEbcCourseRecordRequest {
	s.CourseId = &v
	return s
}

func (s *QueryBaasEbcCourseRecordRequest) SetOrgDid(v string) *QueryBaasEbcCourseRecordRequest {
	s.OrgDid = &v
	return s
}

func (s *QueryBaasEbcCourseRecordRequest) SetOrgUserId(v string) *QueryBaasEbcCourseRecordRequest {
	s.OrgUserId = &v
	return s
}

func (s *QueryBaasEbcCourseRecordRequest) SetPageNum(v int64) *QueryBaasEbcCourseRecordRequest {
	s.PageNum = &v
	return s
}

func (s *QueryBaasEbcCourseRecordRequest) SetPageSize(v int64) *QueryBaasEbcCourseRecordRequest {
	s.PageSize = &v
	return s
}

type QueryBaasEbcCourseRecordResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总页数
	Pages *int64 `json:"pages,omitempty" xml:"pages,omitempty"`
	// 学习记录列表
	RecordList []*CourseRecord `json:"record_list,omitempty" xml:"record_list,omitempty" type:"Repeated"`
	// 数据总量
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s QueryBaasEbcCourseRecordResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasEbcCourseRecordResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasEbcCourseRecordResponse) SetReqMsgId(v string) *QueryBaasEbcCourseRecordResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasEbcCourseRecordResponse) SetResultCode(v string) *QueryBaasEbcCourseRecordResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasEbcCourseRecordResponse) SetResultMsg(v string) *QueryBaasEbcCourseRecordResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasEbcCourseRecordResponse) SetPages(v int64) *QueryBaasEbcCourseRecordResponse {
	s.Pages = &v
	return s
}

func (s *QueryBaasEbcCourseRecordResponse) SetRecordList(v []*CourseRecord) *QueryBaasEbcCourseRecordResponse {
	s.RecordList = v
	return s
}

func (s *QueryBaasEbcCourseRecordResponse) SetTotal(v int64) *QueryBaasEbcCourseRecordResponse {
	s.Total = &v
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
				"sdkVersion":     tea.String("Tea-SDK-20200918"),
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
func (client *Client) CreateBaasEbcOrganization(request *CreateBaasEbcOrganizationRequest) (_result *CreateBaasEbcOrganizationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateBaasEbcOrganizationResponse{}
	_body, _err := client.CreateBaasEbcOrganizationEx(request, runtime)
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
func (client *Client) CreateBaasEbcOrganizationEx(request *CreateBaasEbcOrganizationRequest, runtime *util.RuntimeOptions) (_result *CreateBaasEbcOrganizationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBaasEbcOrganizationResponse{}
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
func (client *Client) CreateBaasEbcPerson(request *CreateBaasEbcPersonRequest) (_result *CreateBaasEbcPersonResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateBaasEbcPersonResponse{}
	_body, _err := client.CreateBaasEbcPersonEx(request, runtime)
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
func (client *Client) CreateBaasEbcPersonEx(request *CreateBaasEbcPersonRequest, runtime *util.RuntimeOptions) (_result *CreateBaasEbcPersonResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBaasEbcPersonResponse{}
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
func (client *Client) CreateBaasEbcOrganizationUser(request *CreateBaasEbcOrganizationUserRequest) (_result *CreateBaasEbcOrganizationUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateBaasEbcOrganizationUserResponse{}
	_body, _err := client.CreateBaasEbcOrganizationUserEx(request, runtime)
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
func (client *Client) CreateBaasEbcOrganizationUserEx(request *CreateBaasEbcOrganizationUserRequest, runtime *util.RuntimeOptions) (_result *CreateBaasEbcOrganizationUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBaasEbcOrganizationUserResponse{}
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
func (client *Client) CancelBaasEbcPerson(request *CancelBaasEbcPersonRequest) (_result *CancelBaasEbcPersonResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CancelBaasEbcPersonResponse{}
	_body, _err := client.CancelBaasEbcPersonEx(request, runtime)
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
func (client *Client) CancelBaasEbcPersonEx(request *CancelBaasEbcPersonRequest, runtime *util.RuntimeOptions) (_result *CancelBaasEbcPersonResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelBaasEbcPersonResponse{}
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
func (client *Client) ResumeBaasEbcPerson(request *ResumeBaasEbcPersonRequest) (_result *ResumeBaasEbcPersonResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ResumeBaasEbcPersonResponse{}
	_body, _err := client.ResumeBaasEbcPersonEx(request, runtime)
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
func (client *Client) ResumeBaasEbcPersonEx(request *ResumeBaasEbcPersonRequest, runtime *util.RuntimeOptions) (_result *ResumeBaasEbcPersonResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResumeBaasEbcPersonResponse{}
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
func (client *Client) CreateBaasEbcOrganizationClass(request *CreateBaasEbcOrganizationClassRequest) (_result *CreateBaasEbcOrganizationClassResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateBaasEbcOrganizationClassResponse{}
	_body, _err := client.CreateBaasEbcOrganizationClassEx(request, runtime)
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
func (client *Client) CreateBaasEbcOrganizationClassEx(request *CreateBaasEbcOrganizationClassRequest, runtime *util.RuntimeOptions) (_result *CreateBaasEbcOrganizationClassResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBaasEbcOrganizationClassResponse{}
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
func (client *Client) UpdateBaasEbcOrganizationClass(request *UpdateBaasEbcOrganizationClassRequest) (_result *UpdateBaasEbcOrganizationClassResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateBaasEbcOrganizationClassResponse{}
	_body, _err := client.UpdateBaasEbcOrganizationClassEx(request, runtime)
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
func (client *Client) UpdateBaasEbcOrganizationClassEx(request *UpdateBaasEbcOrganizationClassRequest, runtime *util.RuntimeOptions) (_result *UpdateBaasEbcOrganizationClassResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateBaasEbcOrganizationClassResponse{}
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
func (client *Client) AddBaasEbcClassUser(request *AddBaasEbcClassUserRequest) (_result *AddBaasEbcClassUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AddBaasEbcClassUserResponse{}
	_body, _err := client.AddBaasEbcClassUserEx(request, runtime)
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
func (client *Client) AddBaasEbcClassUserEx(request *AddBaasEbcClassUserRequest, runtime *util.RuntimeOptions) (_result *AddBaasEbcClassUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddBaasEbcClassUserResponse{}
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
func (client *Client) DeleteBaasEbcClassUser(request *DeleteBaasEbcClassUserRequest) (_result *DeleteBaasEbcClassUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &DeleteBaasEbcClassUserResponse{}
	_body, _err := client.DeleteBaasEbcClassUserEx(request, runtime)
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
func (client *Client) DeleteBaasEbcClassUserEx(request *DeleteBaasEbcClassUserRequest, runtime *util.RuntimeOptions) (_result *DeleteBaasEbcClassUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteBaasEbcClassUserResponse{}
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
func (client *Client) QueryBaasEbcOrganizationClass(request *QueryBaasEbcOrganizationClassRequest) (_result *QueryBaasEbcOrganizationClassResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasEbcOrganizationClassResponse{}
	_body, _err := client.QueryBaasEbcOrganizationClassEx(request, runtime)
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
func (client *Client) QueryBaasEbcOrganizationClassEx(request *QueryBaasEbcOrganizationClassRequest, runtime *util.RuntimeOptions) (_result *QueryBaasEbcOrganizationClassResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasEbcOrganizationClassResponse{}
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
func (client *Client) QueryBaasEbcClassUser(request *QueryBaasEbcClassUserRequest) (_result *QueryBaasEbcClassUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasEbcClassUserResponse{}
	_body, _err := client.QueryBaasEbcClassUserEx(request, runtime)
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
func (client *Client) QueryBaasEbcClassUserEx(request *QueryBaasEbcClassUserRequest, runtime *util.RuntimeOptions) (_result *QueryBaasEbcClassUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasEbcClassUserResponse{}
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
func (client *Client) CreateBaasEbcOrganizationCourse(request *CreateBaasEbcOrganizationCourseRequest) (_result *CreateBaasEbcOrganizationCourseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateBaasEbcOrganizationCourseResponse{}
	_body, _err := client.CreateBaasEbcOrganizationCourseEx(request, runtime)
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
func (client *Client) CreateBaasEbcOrganizationCourseEx(request *CreateBaasEbcOrganizationCourseRequest, runtime *util.RuntimeOptions) (_result *CreateBaasEbcOrganizationCourseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBaasEbcOrganizationCourseResponse{}
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
func (client *Client) UpdateBaasEbcOrganizationCourse(request *UpdateBaasEbcOrganizationCourseRequest) (_result *UpdateBaasEbcOrganizationCourseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateBaasEbcOrganizationCourseResponse{}
	_body, _err := client.UpdateBaasEbcOrganizationCourseEx(request, runtime)
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
func (client *Client) UpdateBaasEbcOrganizationCourseEx(request *UpdateBaasEbcOrganizationCourseRequest, runtime *util.RuntimeOptions) (_result *UpdateBaasEbcOrganizationCourseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateBaasEbcOrganizationCourseResponse{}
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
func (client *Client) AddBaasEbcCourseClass(request *AddBaasEbcCourseClassRequest) (_result *AddBaasEbcCourseClassResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AddBaasEbcCourseClassResponse{}
	_body, _err := client.AddBaasEbcCourseClassEx(request, runtime)
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
func (client *Client) AddBaasEbcCourseClassEx(request *AddBaasEbcCourseClassRequest, runtime *util.RuntimeOptions) (_result *AddBaasEbcCourseClassResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddBaasEbcCourseClassResponse{}
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
func (client *Client) AddBaasEbcCourseUser(request *AddBaasEbcCourseUserRequest) (_result *AddBaasEbcCourseUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AddBaasEbcCourseUserResponse{}
	_body, _err := client.AddBaasEbcCourseUserEx(request, runtime)
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
func (client *Client) AddBaasEbcCourseUserEx(request *AddBaasEbcCourseUserRequest, runtime *util.RuntimeOptions) (_result *AddBaasEbcCourseUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddBaasEbcCourseUserResponse{}
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
func (client *Client) DeleteBaasEbcCourseClass(request *DeleteBaasEbcCourseClassRequest) (_result *DeleteBaasEbcCourseClassResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &DeleteBaasEbcCourseClassResponse{}
	_body, _err := client.DeleteBaasEbcCourseClassEx(request, runtime)
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
func (client *Client) DeleteBaasEbcCourseClassEx(request *DeleteBaasEbcCourseClassRequest, runtime *util.RuntimeOptions) (_result *DeleteBaasEbcCourseClassResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteBaasEbcCourseClassResponse{}
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
func (client *Client) DeleteBaasEbcCourseUser(request *DeleteBaasEbcCourseUserRequest) (_result *DeleteBaasEbcCourseUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &DeleteBaasEbcCourseUserResponse{}
	_body, _err := client.DeleteBaasEbcCourseUserEx(request, runtime)
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
func (client *Client) DeleteBaasEbcCourseUserEx(request *DeleteBaasEbcCourseUserRequest, runtime *util.RuntimeOptions) (_result *DeleteBaasEbcCourseUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteBaasEbcCourseUserResponse{}
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
func (client *Client) CreateBaasEbcUserCert(request *CreateBaasEbcUserCertRequest) (_result *CreateBaasEbcUserCertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateBaasEbcUserCertResponse{}
	_body, _err := client.CreateBaasEbcUserCertEx(request, runtime)
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
func (client *Client) CreateBaasEbcUserCertEx(request *CreateBaasEbcUserCertRequest, runtime *util.RuntimeOptions) (_result *CreateBaasEbcUserCertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBaasEbcUserCertResponse{}
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
func (client *Client) UpdateBaasEbcUserCert(request *UpdateBaasEbcUserCertRequest) (_result *UpdateBaasEbcUserCertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateBaasEbcUserCertResponse{}
	_body, _err := client.UpdateBaasEbcUserCertEx(request, runtime)
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
func (client *Client) UpdateBaasEbcUserCertEx(request *UpdateBaasEbcUserCertRequest, runtime *util.RuntimeOptions) (_result *UpdateBaasEbcUserCertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateBaasEbcUserCertResponse{}
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
func (client *Client) QueryBaasEbcOrganizationCert(request *QueryBaasEbcOrganizationCertRequest) (_result *QueryBaasEbcOrganizationCertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasEbcOrganizationCertResponse{}
	_body, _err := client.QueryBaasEbcOrganizationCertEx(request, runtime)
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
func (client *Client) QueryBaasEbcOrganizationCertEx(request *QueryBaasEbcOrganizationCertRequest, runtime *util.RuntimeOptions) (_result *QueryBaasEbcOrganizationCertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasEbcOrganizationCertResponse{}
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
func (client *Client) QueryBaasEbcUserCert(request *QueryBaasEbcUserCertRequest) (_result *QueryBaasEbcUserCertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasEbcUserCertResponse{}
	_body, _err := client.QueryBaasEbcUserCertEx(request, runtime)
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
func (client *Client) QueryBaasEbcUserCertEx(request *QueryBaasEbcUserCertRequest, runtime *util.RuntimeOptions) (_result *QueryBaasEbcUserCertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasEbcUserCertResponse{}
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
func (client *Client) QueryBaasEbcCert(request *QueryBaasEbcCertRequest) (_result *QueryBaasEbcCertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasEbcCertResponse{}
	_body, _err := client.QueryBaasEbcCertEx(request, runtime)
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
func (client *Client) QueryBaasEbcCertEx(request *QueryBaasEbcCertRequest, runtime *util.RuntimeOptions) (_result *QueryBaasEbcCertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasEbcCertResponse{}
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
func (client *Client) ApplyBaasEbcCertUrl(request *ApplyBaasEbcCertUrlRequest) (_result *ApplyBaasEbcCertUrlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ApplyBaasEbcCertUrlResponse{}
	_body, _err := client.ApplyBaasEbcCertUrlEx(request, runtime)
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
func (client *Client) ApplyBaasEbcCertUrlEx(request *ApplyBaasEbcCertUrlRequest, runtime *util.RuntimeOptions) (_result *ApplyBaasEbcCertUrlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyBaasEbcCertUrlResponse{}
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
func (client *Client) CreateBaasEbcAuth(request *CreateBaasEbcAuthRequest) (_result *CreateBaasEbcAuthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateBaasEbcAuthResponse{}
	_body, _err := client.CreateBaasEbcAuthEx(request, runtime)
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
func (client *Client) CreateBaasEbcAuthEx(request *CreateBaasEbcAuthRequest, runtime *util.RuntimeOptions) (_result *CreateBaasEbcAuthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBaasEbcAuthResponse{}
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
func (client *Client) UpdateBaasEbcAuth(request *UpdateBaasEbcAuthRequest) (_result *UpdateBaasEbcAuthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateBaasEbcAuthResponse{}
	_body, _err := client.UpdateBaasEbcAuthEx(request, runtime)
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
func (client *Client) UpdateBaasEbcAuthEx(request *UpdateBaasEbcAuthRequest, runtime *util.RuntimeOptions) (_result *UpdateBaasEbcAuthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateBaasEbcAuthResponse{}
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
func (client *Client) UpdateBaasEbcAuthStatus(request *UpdateBaasEbcAuthStatusRequest) (_result *UpdateBaasEbcAuthStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateBaasEbcAuthStatusResponse{}
	_body, _err := client.UpdateBaasEbcAuthStatusEx(request, runtime)
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
func (client *Client) UpdateBaasEbcAuthStatusEx(request *UpdateBaasEbcAuthStatusRequest, runtime *util.RuntimeOptions) (_result *UpdateBaasEbcAuthStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateBaasEbcAuthStatusResponse{}
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
func (client *Client) UpdateBaasEbcDataPrice(request *UpdateBaasEbcDataPriceRequest) (_result *UpdateBaasEbcDataPriceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateBaasEbcDataPriceResponse{}
	_body, _err := client.UpdateBaasEbcDataPriceEx(request, runtime)
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
func (client *Client) UpdateBaasEbcDataPriceEx(request *UpdateBaasEbcDataPriceRequest, runtime *util.RuntimeOptions) (_result *UpdateBaasEbcDataPriceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateBaasEbcDataPriceResponse{}
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
func (client *Client) QueryBaasEbcConsumptionAmount(request *QueryBaasEbcConsumptionAmountRequest) (_result *QueryBaasEbcConsumptionAmountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasEbcConsumptionAmountResponse{}
	_body, _err := client.QueryBaasEbcConsumptionAmountEx(request, runtime)
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
func (client *Client) QueryBaasEbcConsumptionAmountEx(request *QueryBaasEbcConsumptionAmountRequest, runtime *util.RuntimeOptions) (_result *QueryBaasEbcConsumptionAmountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasEbcConsumptionAmountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.consumption.amount.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 课程明细查询
 * Summary: 课程明细查询
 */
func (client *Client) QueryBaasEbcOrganizationCourse(request *QueryBaasEbcOrganizationCourseRequest) (_result *QueryBaasEbcOrganizationCourseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasEbcOrganizationCourseResponse{}
	_body, _err := client.QueryBaasEbcOrganizationCourseEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 课程明细查询
 * Summary: 课程明细查询
 */
func (client *Client) QueryBaasEbcOrganizationCourseEx(request *QueryBaasEbcOrganizationCourseRequest, runtime *util.RuntimeOptions) (_result *QueryBaasEbcOrganizationCourseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasEbcOrganizationCourseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.organization.course.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 课程章节发布
 * Summary: 课程章节发布
 */
func (client *Client) CreateBaasEbcCourseChapter(request *CreateBaasEbcCourseChapterRequest) (_result *CreateBaasEbcCourseChapterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateBaasEbcCourseChapterResponse{}
	_body, _err := client.CreateBaasEbcCourseChapterEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 课程章节发布
 * Summary: 课程章节发布
 */
func (client *Client) CreateBaasEbcCourseChapterEx(request *CreateBaasEbcCourseChapterRequest, runtime *util.RuntimeOptions) (_result *CreateBaasEbcCourseChapterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBaasEbcCourseChapterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.course.chapter.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 课程章节更新
 * Summary: 课程章节更新
 */
func (client *Client) UpdateBaasEbcCourseChapter(request *UpdateBaasEbcCourseChapterRequest) (_result *UpdateBaasEbcCourseChapterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateBaasEbcCourseChapterResponse{}
	_body, _err := client.UpdateBaasEbcCourseChapterEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 课程章节更新
 * Summary: 课程章节更新
 */
func (client *Client) UpdateBaasEbcCourseChapterEx(request *UpdateBaasEbcCourseChapterRequest, runtime *util.RuntimeOptions) (_result *UpdateBaasEbcCourseChapterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateBaasEbcCourseChapterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.course.chapter.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建学习记录
 * Summary: 创建学习记录
 */
func (client *Client) CreateBaasEbcCourseRecord(request *CreateBaasEbcCourseRecordRequest) (_result *CreateBaasEbcCourseRecordResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateBaasEbcCourseRecordResponse{}
	_body, _err := client.CreateBaasEbcCourseRecordEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建学习记录
 * Summary: 创建学习记录
 */
func (client *Client) CreateBaasEbcCourseRecordEx(request *CreateBaasEbcCourseRecordRequest, runtime *util.RuntimeOptions) (_result *CreateBaasEbcCourseRecordResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBaasEbcCourseRecordResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.course.record.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 课程章节查询
 * Summary: 课程章节查询
 */
func (client *Client) QueryBaasEbcCourseChapter(request *QueryBaasEbcCourseChapterRequest) (_result *QueryBaasEbcCourseChapterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasEbcCourseChapterResponse{}
	_body, _err := client.QueryBaasEbcCourseChapterEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 课程章节查询
 * Summary: 课程章节查询
 */
func (client *Client) QueryBaasEbcCourseChapterEx(request *QueryBaasEbcCourseChapterRequest, runtime *util.RuntimeOptions) (_result *QueryBaasEbcCourseChapterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasEbcCourseChapterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.course.chapter.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 学习记录查询
 * Summary: 学习记录查询
 */
func (client *Client) QueryBaasEbcCourseRecord(request *QueryBaasEbcCourseRecordRequest) (_result *QueryBaasEbcCourseRecordResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasEbcCourseRecordResponse{}
	_body, _err := client.QueryBaasEbcCourseRecordEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 学习记录查询
 * Summary: 学习记录查询
 */
func (client *Client) QueryBaasEbcCourseRecordEx(request *QueryBaasEbcCourseRecordRequest, runtime *util.RuntimeOptions) (_result *QueryBaasEbcCourseRecordResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasEbcCourseRecordResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.ebc.course.record.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
