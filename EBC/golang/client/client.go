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
	AuthToken       *string `json:"authToken,omitempty" xml:"authToken,omitempty"`
	Protocol        *string `json:"protocol,omitempty" xml:"protocol,omitempty"`
	RegionId        *string `json:"regionId,omitempty" xml:"regionId,omitempty"`
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
	Tenant          *string `json:"tenant,omitempty" xml:"tenant,omitempty"`
	Workspace       *string `json:"workspace,omitempty" xml:"workspace,omitempty"`
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

func (s *Config) SetAuthToken(v string) *Config {
	s.AuthToken = &v
	return s
}

func (s *Config) SetProtocol(v string) *Config {
	s.Protocol = &v
	return s
}

func (s *Config) SetRegionId(v string) *Config {
	s.RegionId = &v
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

func (s *Config) SetTenant(v string) *Config {
	s.Tenant = &v
	return s
}

func (s *Config) SetWorkspace(v string) *Config {
	s.Workspace = &v
	return s
}

type Cert struct {
	CertCode        *string `json:"cert_code,omitempty" xml:"cert_code,omitempty" maxLength:"64"`
	CertEndTime     *string `json:"cert_end_time,omitempty" xml:"cert_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?"`
	CertId          *string `json:"cert_id,omitempty" xml:"cert_id,omitempty" maxLength:"128"`
	CertNameCn      *string `json:"cert_name_cn,omitempty" xml:"cert_name_cn,omitempty" maxLength:"64"`
	CertNameEn      *string `json:"cert_name_en,omitempty" xml:"cert_name_en,omitempty"`
	CertPublishTime *string `json:"cert_publish_time,omitempty" xml:"cert_publish_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?"`
	CertStartTime   *string `json:"cert_start_time,omitempty" xml:"cert_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?"`
	CertStatus      *int64  `json:"cert_status,omitempty" xml:"cert_status,omitempty"`
	CertUrl         *string `json:"cert_url,omitempty" xml:"cert_url,omitempty" maxLength:"256"`
	Country         *string `json:"country,omitempty" xml:"country,omitempty" maxLength:"32"`
	ExpireType      *int64  `json:"expire_type,omitempty" xml:"expire_type,omitempty"`
	FeatureUrl      *string `json:"feature_url,omitempty" xml:"feature_url,omitempty" maxLength:"512"`
	HolderAvatar    *string `json:"holder_avatar,omitempty" xml:"holder_avatar,omitempty" maxLength:"256"`
	HolderName      *string `json:"holder_name,omitempty" xml:"holder_name,omitempty" maxLength:"64"`
	Level           *string `json:"level,omitempty" xml:"level,omitempty" maxLength:"32"`
	OrgDid          *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	OrgName         *string `json:"org_name,omitempty" xml:"org_name,omitempty" maxLength:"64"`
	OrgUserId       *string `json:"org_user_id,omitempty" xml:"org_user_id,omitempty" maxLength:"128"`
	PrimaryIdNo     *string `json:"primary_id_no,omitempty" xml:"primary_id_no,omitempty" maxLength:"64"`
	SecondIdNo1     *string `json:"second_id_no_1,omitempty" xml:"second_id_no_1,omitempty" maxLength:"64"`
	SecondIdNo2     *string `json:"second_id_no_2,omitempty" xml:"second_id_no_2,omitempty" maxLength:"64"`
	SecondIdNo3     *string `json:"second_id_no_3,omitempty" xml:"second_id_no_3,omitempty" maxLength:"64"`
	Type            *string `json:"type,omitempty" xml:"type,omitempty"`
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

type OrgUser struct {
	OrgDid    *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
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

type Class struct {
	ClassId *string `json:"class_id,omitempty" xml:"class_id,omitempty" maxLength:"128"`
	OrgDid  *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
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

type DeleteCourseClassRequest struct {
	ClassList []*Class `json:"class_list,omitempty" xml:"class_list,omitempty" type:"Repeated"`
	CourseId  *string  `json:"course_id,omitempty" xml:"course_id,omitempty" maxLength:"128"`
	OrgDid    *string  `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
}

func (s DeleteCourseClassRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteCourseClassRequest) GoString() string {
	return s.String()
}

func (s *DeleteCourseClassRequest) SetClassList(v []*Class) *DeleteCourseClassRequest {
	s.ClassList = v
	return s
}

func (s *DeleteCourseClassRequest) SetCourseId(v string) *DeleteCourseClassRequest {
	s.CourseId = &v
	return s
}

func (s *DeleteCourseClassRequest) SetOrgDid(v string) *DeleteCourseClassRequest {
	s.OrgDid = &v
	return s
}

type DeleteCourseClassResponse struct {
	FailList []*Class `json:"fail_list,omitempty" xml:"fail_list,omitempty" type:"Repeated"`
}

func (s DeleteCourseClassResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteCourseClassResponse) GoString() string {
	return s.String()
}

func (s *DeleteCourseClassResponse) SetFailList(v []*Class) *DeleteCourseClassResponse {
	s.FailList = v
	return s
}

type ApplyCertUrlRequest struct {
	CertCode  *string `json:"cert_code,omitempty" xml:"cert_code,omitempty" maxLength:"128"`
	OrgDid    *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	OrgUserId *string `json:"org_user_id,omitempty" xml:"org_user_id,omitempty"`
}

func (s ApplyCertUrlRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyCertUrlRequest) GoString() string {
	return s.String()
}

func (s *ApplyCertUrlRequest) SetCertCode(v string) *ApplyCertUrlRequest {
	s.CertCode = &v
	return s
}

func (s *ApplyCertUrlRequest) SetOrgDid(v string) *ApplyCertUrlRequest {
	s.OrgDid = &v
	return s
}

func (s *ApplyCertUrlRequest) SetOrgUserId(v string) *ApplyCertUrlRequest {
	s.OrgUserId = &v
	return s
}

type ApplyCertUrlResponse struct {
	CertUploadUrl         *string `json:"cert_upload_url,omitempty" xml:"cert_upload_url,omitempty"`
	FeatureUploadUrl      *string `json:"feature_upload_url,omitempty" xml:"feature_upload_url,omitempty"`
	HolderAvatarUploadUrl *string `json:"holder_avatar_upload_url,omitempty" xml:"holder_avatar_upload_url,omitempty"`
}

func (s ApplyCertUrlResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyCertUrlResponse) GoString() string {
	return s.String()
}

func (s *ApplyCertUrlResponse) SetCertUploadUrl(v string) *ApplyCertUrlResponse {
	s.CertUploadUrl = &v
	return s
}

func (s *ApplyCertUrlResponse) SetFeatureUploadUrl(v string) *ApplyCertUrlResponse {
	s.FeatureUploadUrl = &v
	return s
}

func (s *ApplyCertUrlResponse) SetHolderAvatarUploadUrl(v string) *ApplyCertUrlResponse {
	s.HolderAvatarUploadUrl = &v
	return s
}

type AddCourseClassRequest struct {
	ClassList []*Class `json:"class_list,omitempty" xml:"class_list,omitempty" type:"Repeated"`
	CourseId  *string  `json:"course_id,omitempty" xml:"course_id,omitempty" maxLength:"128"`
	OrgDid    *string  `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
}

func (s AddCourseClassRequest) String() string {
	return tea.Prettify(s)
}

func (s AddCourseClassRequest) GoString() string {
	return s.String()
}

func (s *AddCourseClassRequest) SetClassList(v []*Class) *AddCourseClassRequest {
	s.ClassList = v
	return s
}

func (s *AddCourseClassRequest) SetCourseId(v string) *AddCourseClassRequest {
	s.CourseId = &v
	return s
}

func (s *AddCourseClassRequest) SetOrgDid(v string) *AddCourseClassRequest {
	s.OrgDid = &v
	return s
}

type AddCourseClassResponse struct {
	FailList []*Class `json:"fail_list,omitempty" xml:"fail_list,omitempty" type:"Repeated"`
}

func (s AddCourseClassResponse) String() string {
	return tea.Prettify(s)
}

func (s AddCourseClassResponse) GoString() string {
	return s.String()
}

func (s *AddCourseClassResponse) SetFailList(v []*Class) *AddCourseClassResponse {
	s.FailList = v
	return s
}

type AddClassUserRequest struct {
	ClassId     *string    `json:"class_id,omitempty" xml:"class_id,omitempty" maxLength:"128"`
	OrgDid      *string    `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	OrgUserList []*OrgUser `json:"org_user_list,omitempty" xml:"org_user_list,omitempty" type:"Repeated"`
}

func (s AddClassUserRequest) String() string {
	return tea.Prettify(s)
}

func (s AddClassUserRequest) GoString() string {
	return s.String()
}

func (s *AddClassUserRequest) SetClassId(v string) *AddClassUserRequest {
	s.ClassId = &v
	return s
}

func (s *AddClassUserRequest) SetOrgDid(v string) *AddClassUserRequest {
	s.OrgDid = &v
	return s
}

func (s *AddClassUserRequest) SetOrgUserList(v []*OrgUser) *AddClassUserRequest {
	s.OrgUserList = v
	return s
}

type AddClassUserResponse struct {
	FailList []*OrgUser `json:"fail_list,omitempty" xml:"fail_list,omitempty" type:"Repeated"`
}

func (s AddClassUserResponse) String() string {
	return tea.Prettify(s)
}

func (s AddClassUserResponse) GoString() string {
	return s.String()
}

func (s *AddClassUserResponse) SetFailList(v []*OrgUser) *AddClassUserResponse {
	s.FailList = v
	return s
}

type QueryOrganizationCertRequest struct {
	End    *string `json:"end,omitempty" xml:"end,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?"`
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	Start  *string `json:"start,omitempty" xml:"start,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?"`
}

func (s QueryOrganizationCertRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryOrganizationCertRequest) GoString() string {
	return s.String()
}

func (s *QueryOrganizationCertRequest) SetEnd(v string) *QueryOrganizationCertRequest {
	s.End = &v
	return s
}

func (s *QueryOrganizationCertRequest) SetOrgDid(v string) *QueryOrganizationCertRequest {
	s.OrgDid = &v
	return s
}

func (s *QueryOrganizationCertRequest) SetStart(v string) *QueryOrganizationCertRequest {
	s.Start = &v
	return s
}

type QueryOrganizationCertResponse struct {
	CertIdList []*string `json:"cert_id_list,omitempty" xml:"cert_id_list,omitempty" type:"Repeated"`
}

func (s QueryOrganizationCertResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryOrganizationCertResponse) GoString() string {
	return s.String()
}

func (s *QueryOrganizationCertResponse) SetCertIdList(v []*string) *QueryOrganizationCertResponse {
	s.CertIdList = v
	return s
}

type AddCourseUserRequest struct {
	CourseId    *string    `json:"course_id,omitempty" xml:"course_id,omitempty" maxLength:"128"`
	OrgDid      *string    `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	OrgUserList []*OrgUser `json:"org_user_list,omitempty" xml:"org_user_list,omitempty" type:"Repeated"`
}

func (s AddCourseUserRequest) String() string {
	return tea.Prettify(s)
}

func (s AddCourseUserRequest) GoString() string {
	return s.String()
}

func (s *AddCourseUserRequest) SetCourseId(v string) *AddCourseUserRequest {
	s.CourseId = &v
	return s
}

func (s *AddCourseUserRequest) SetOrgDid(v string) *AddCourseUserRequest {
	s.OrgDid = &v
	return s
}

func (s *AddCourseUserRequest) SetOrgUserList(v []*OrgUser) *AddCourseUserRequest {
	s.OrgUserList = v
	return s
}

type AddCourseUserResponse struct {
	FailList []*OrgUser `json:"fail_list,omitempty" xml:"fail_list,omitempty" type:"Repeated"`
}

func (s AddCourseUserResponse) String() string {
	return tea.Prettify(s)
}

func (s AddCourseUserResponse) GoString() string {
	return s.String()
}

func (s *AddCourseUserResponse) SetFailList(v []*OrgUser) *AddCourseUserResponse {
	s.FailList = v
	return s
}

type DeleteCourseUserRequest struct {
	CourseId    *string    `json:"course_id,omitempty" xml:"course_id,omitempty" maxLength:"128"`
	OrgDid      *string    `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	OrgUserList []*OrgUser `json:"org_user_list,omitempty" xml:"org_user_list,omitempty" type:"Repeated"`
}

func (s DeleteCourseUserRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteCourseUserRequest) GoString() string {
	return s.String()
}

func (s *DeleteCourseUserRequest) SetCourseId(v string) *DeleteCourseUserRequest {
	s.CourseId = &v
	return s
}

func (s *DeleteCourseUserRequest) SetOrgDid(v string) *DeleteCourseUserRequest {
	s.OrgDid = &v
	return s
}

func (s *DeleteCourseUserRequest) SetOrgUserList(v []*OrgUser) *DeleteCourseUserRequest {
	s.OrgUserList = v
	return s
}

type DeleteCourseUserResponse struct {
	FailList []*OrgUser `json:"fail_list,omitempty" xml:"fail_list,omitempty" type:"Repeated"`
}

func (s DeleteCourseUserResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteCourseUserResponse) GoString() string {
	return s.String()
}

func (s *DeleteCourseUserResponse) SetFailList(v []*OrgUser) *DeleteCourseUserResponse {
	s.FailList = v
	return s
}

type CreateOrganizationClassRequest struct {
	Capacity       *int    `json:"capacity,omitempty" xml:"capacity,omitempty"`
	ClassEndTime   *string `json:"class_end_time,omitempty" xml:"class_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?"`
	ClassName      *string `json:"class_name,omitempty" xml:"class_name,omitempty" maxLength:"64"`
	ClassStartTime *string `json:"class_start_time,omitempty" xml:"class_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?"`
	ClassStatus    *int    `json:"class_status,omitempty" xml:"class_status,omitempty"`
	OrgDid         *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	Type           *int    `json:"type,omitempty" xml:"type,omitempty"`
}

func (s CreateOrganizationClassRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateOrganizationClassRequest) GoString() string {
	return s.String()
}

func (s *CreateOrganizationClassRequest) SetCapacity(v int) *CreateOrganizationClassRequest {
	s.Capacity = &v
	return s
}

func (s *CreateOrganizationClassRequest) SetClassEndTime(v string) *CreateOrganizationClassRequest {
	s.ClassEndTime = &v
	return s
}

func (s *CreateOrganizationClassRequest) SetClassName(v string) *CreateOrganizationClassRequest {
	s.ClassName = &v
	return s
}

func (s *CreateOrganizationClassRequest) SetClassStartTime(v string) *CreateOrganizationClassRequest {
	s.ClassStartTime = &v
	return s
}

func (s *CreateOrganizationClassRequest) SetClassStatus(v int) *CreateOrganizationClassRequest {
	s.ClassStatus = &v
	return s
}

func (s *CreateOrganizationClassRequest) SetOrgDid(v string) *CreateOrganizationClassRequest {
	s.OrgDid = &v
	return s
}

func (s *CreateOrganizationClassRequest) SetType(v int) *CreateOrganizationClassRequest {
	s.Type = &v
	return s
}

type CreateOrganizationClassResponse struct {
	ClassId *string `json:"class_id,omitempty" xml:"class_id,omitempty"`
}

func (s CreateOrganizationClassResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateOrganizationClassResponse) GoString() string {
	return s.String()
}

func (s *CreateOrganizationClassResponse) SetClassId(v string) *CreateOrganizationClassResponse {
	s.ClassId = &v
	return s
}

type QueryClassUserRequest struct {
	ClassId *string `json:"class_id,omitempty" xml:"class_id,omitempty" maxLength:"128"`
	OrgDid  *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
}

func (s QueryClassUserRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryClassUserRequest) GoString() string {
	return s.String()
}

func (s *QueryClassUserRequest) SetClassId(v string) *QueryClassUserRequest {
	s.ClassId = &v
	return s
}

func (s *QueryClassUserRequest) SetOrgDid(v string) *QueryClassUserRequest {
	s.OrgDid = &v
	return s
}

type QueryClassUserResponse struct {
	ClassName     *string   `json:"class_name,omitempty" xml:"class_name,omitempty"`
	OrgUserIdList []*string `json:"org_user_id_list,omitempty" xml:"org_user_id_list,omitempty" type:"Repeated"`
	UserNum       *int      `json:"user_num,omitempty" xml:"user_num,omitempty"`
}

func (s QueryClassUserResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryClassUserResponse) GoString() string {
	return s.String()
}

func (s *QueryClassUserResponse) SetClassName(v string) *QueryClassUserResponse {
	s.ClassName = &v
	return s
}

func (s *QueryClassUserResponse) SetOrgUserIdList(v []*string) *QueryClassUserResponse {
	s.OrgUserIdList = v
	return s
}

func (s *QueryClassUserResponse) SetUserNum(v int) *QueryClassUserResponse {
	s.UserNum = &v
	return s
}

type QueryCertRequest struct {
	CertId *string `json:"cert_id,omitempty" xml:"cert_id,omitempty" maxLength:"128"`
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
}

func (s QueryCertRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCertRequest) GoString() string {
	return s.String()
}

func (s *QueryCertRequest) SetCertId(v string) *QueryCertRequest {
	s.CertId = &v
	return s
}

func (s *QueryCertRequest) SetOrgDid(v string) *QueryCertRequest {
	s.OrgDid = &v
	return s
}

type QueryCertResponse struct {
	Cert *Cert `json:"cert,omitempty" xml:"cert,omitempty"`
}

func (s QueryCertResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCertResponse) GoString() string {
	return s.String()
}

func (s *QueryCertResponse) SetCert(v *Cert) *QueryCertResponse {
	s.Cert = v
	return s
}

type UpdateOrganizationCourseRequest struct {
	CourseEndTime   *string `json:"course_end_time,omitempty" xml:"course_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?"`
	CourseId        *string `json:"course_id,omitempty" xml:"course_id,omitempty" maxLength:"128"`
	CourseName      *string `json:"course_name,omitempty" xml:"course_name,omitempty" maxLength:"64"`
	CourseStartTime *string `json:"course_start_time,omitempty" xml:"course_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?"`
	OrgDid          *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	Period          *int    `json:"period,omitempty" xml:"period,omitempty"`
}

func (s UpdateOrganizationCourseRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateOrganizationCourseRequest) GoString() string {
	return s.String()
}

func (s *UpdateOrganizationCourseRequest) SetCourseEndTime(v string) *UpdateOrganizationCourseRequest {
	s.CourseEndTime = &v
	return s
}

func (s *UpdateOrganizationCourseRequest) SetCourseId(v string) *UpdateOrganizationCourseRequest {
	s.CourseId = &v
	return s
}

func (s *UpdateOrganizationCourseRequest) SetCourseName(v string) *UpdateOrganizationCourseRequest {
	s.CourseName = &v
	return s
}

func (s *UpdateOrganizationCourseRequest) SetCourseStartTime(v string) *UpdateOrganizationCourseRequest {
	s.CourseStartTime = &v
	return s
}

func (s *UpdateOrganizationCourseRequest) SetOrgDid(v string) *UpdateOrganizationCourseRequest {
	s.OrgDid = &v
	return s
}

func (s *UpdateOrganizationCourseRequest) SetPeriod(v int) *UpdateOrganizationCourseRequest {
	s.Period = &v
	return s
}

type UpdateOrganizationCourseResponse struct {
}

func (s UpdateOrganizationCourseResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateOrganizationCourseResponse) GoString() string {
	return s.String()
}

type CancelPersonRequest struct {
	PersonDid *string `json:"person_did,omitempty" xml:"person_did,omitempty" maxLength:"128"`
}

func (s CancelPersonRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelPersonRequest) GoString() string {
	return s.String()
}

func (s *CancelPersonRequest) SetPersonDid(v string) *CancelPersonRequest {
	s.PersonDid = &v
	return s
}

type CancelPersonResponse struct {
}

func (s CancelPersonResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelPersonResponse) GoString() string {
	return s.String()
}

type CreateUserCertRequest struct {
	CertCode        *string `json:"cert_code,omitempty" xml:"cert_code,omitempty" maxLength:"64"`
	CertEndTime     *string `json:"cert_end_time,omitempty" xml:"cert_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?"`
	CertNameCn      *string `json:"cert_name_cn,omitempty" xml:"cert_name_cn,omitempty" maxLength:"64"`
	CertNameEn      *string `json:"cert_name_en,omitempty" xml:"cert_name_en,omitempty" maxLength:"64"`
	CertPublishTime *string `json:"cert_publish_time,omitempty" xml:"cert_publish_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?"`
	CertStartTime   *string `json:"cert_start_time,omitempty" xml:"cert_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?"`
	CertStatus      *int    `json:"cert_status,omitempty" xml:"cert_status,omitempty"`
	Country         *string `json:"country,omitempty" xml:"country,omitempty" maxLength:"32"`
	ExpireType      *int    `json:"expire_type,omitempty" xml:"expire_type,omitempty"`
	HolderName      *string `json:"holder_name,omitempty" xml:"holder_name,omitempty" maxLength:"64"`
	Level           *string `json:"level,omitempty" xml:"level,omitempty" maxLength:"32"`
	OrgDid          *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	OrgName         *string `json:"org_name,omitempty" xml:"org_name,omitempty" maxLength:"64"`
	OrgUserId       *string `json:"org_user_id,omitempty" xml:"org_user_id,omitempty" maxLength:"128"`
	PrimaryIdNo     *string `json:"primary_id_no,omitempty" xml:"primary_id_no,omitempty" maxLength:"1024"`
	SecondIdNo1     *string `json:"second_id_no_1,omitempty" xml:"second_id_no_1,omitempty" maxLength:"1024"`
	SecondIdNo2     *string `json:"second_id_no_2,omitempty" xml:"second_id_no_2,omitempty" maxLength:"1024"`
	SecondIdNo3     *string `json:"second_id_no_3,omitempty" xml:"second_id_no_3,omitempty" maxLength:"1024"`
	Type            *string `json:"type,omitempty" xml:"type,omitempty" maxLength:"64"`
}

func (s CreateUserCertRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateUserCertRequest) GoString() string {
	return s.String()
}

func (s *CreateUserCertRequest) SetCertCode(v string) *CreateUserCertRequest {
	s.CertCode = &v
	return s
}

func (s *CreateUserCertRequest) SetCertEndTime(v string) *CreateUserCertRequest {
	s.CertEndTime = &v
	return s
}

func (s *CreateUserCertRequest) SetCertNameCn(v string) *CreateUserCertRequest {
	s.CertNameCn = &v
	return s
}

func (s *CreateUserCertRequest) SetCertNameEn(v string) *CreateUserCertRequest {
	s.CertNameEn = &v
	return s
}

func (s *CreateUserCertRequest) SetCertPublishTime(v string) *CreateUserCertRequest {
	s.CertPublishTime = &v
	return s
}

func (s *CreateUserCertRequest) SetCertStartTime(v string) *CreateUserCertRequest {
	s.CertStartTime = &v
	return s
}

func (s *CreateUserCertRequest) SetCertStatus(v int) *CreateUserCertRequest {
	s.CertStatus = &v
	return s
}

func (s *CreateUserCertRequest) SetCountry(v string) *CreateUserCertRequest {
	s.Country = &v
	return s
}

func (s *CreateUserCertRequest) SetExpireType(v int) *CreateUserCertRequest {
	s.ExpireType = &v
	return s
}

func (s *CreateUserCertRequest) SetHolderName(v string) *CreateUserCertRequest {
	s.HolderName = &v
	return s
}

func (s *CreateUserCertRequest) SetLevel(v string) *CreateUserCertRequest {
	s.Level = &v
	return s
}

func (s *CreateUserCertRequest) SetOrgDid(v string) *CreateUserCertRequest {
	s.OrgDid = &v
	return s
}

func (s *CreateUserCertRequest) SetOrgName(v string) *CreateUserCertRequest {
	s.OrgName = &v
	return s
}

func (s *CreateUserCertRequest) SetOrgUserId(v string) *CreateUserCertRequest {
	s.OrgUserId = &v
	return s
}

func (s *CreateUserCertRequest) SetPrimaryIdNo(v string) *CreateUserCertRequest {
	s.PrimaryIdNo = &v
	return s
}

func (s *CreateUserCertRequest) SetSecondIdNo1(v string) *CreateUserCertRequest {
	s.SecondIdNo1 = &v
	return s
}

func (s *CreateUserCertRequest) SetSecondIdNo2(v string) *CreateUserCertRequest {
	s.SecondIdNo2 = &v
	return s
}

func (s *CreateUserCertRequest) SetSecondIdNo3(v string) *CreateUserCertRequest {
	s.SecondIdNo3 = &v
	return s
}

func (s *CreateUserCertRequest) SetType(v string) *CreateUserCertRequest {
	s.Type = &v
	return s
}

type CreateUserCertResponse struct {
	CertId *string `json:"cert_id,omitempty" xml:"cert_id,omitempty"`
}

func (s CreateUserCertResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateUserCertResponse) GoString() string {
	return s.String()
}

func (s *CreateUserCertResponse) SetCertId(v string) *CreateUserCertResponse {
	s.CertId = &v
	return s
}

type DeleteClassUserRequest struct {
	ClassId     *string    `json:"class_id,omitempty" xml:"class_id,omitempty" maxLength:"128"`
	OrgDid      *string    `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	OrgUserList []*OrgUser `json:"org_user_list,omitempty" xml:"org_user_list,omitempty" type:"Repeated"`
}

func (s DeleteClassUserRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteClassUserRequest) GoString() string {
	return s.String()
}

func (s *DeleteClassUserRequest) SetClassId(v string) *DeleteClassUserRequest {
	s.ClassId = &v
	return s
}

func (s *DeleteClassUserRequest) SetOrgDid(v string) *DeleteClassUserRequest {
	s.OrgDid = &v
	return s
}

func (s *DeleteClassUserRequest) SetOrgUserList(v []*OrgUser) *DeleteClassUserRequest {
	s.OrgUserList = v
	return s
}

type DeleteClassUserResponse struct {
	FailList []*OrgUser `json:"fail_list,omitempty" xml:"fail_list,omitempty" type:"Repeated"`
}

func (s DeleteClassUserResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteClassUserResponse) GoString() string {
	return s.String()
}

func (s *DeleteClassUserResponse) SetFailList(v []*OrgUser) *DeleteClassUserResponse {
	s.FailList = v
	return s
}

type CreatePersonRequest struct {
	PersonName  *string `json:"person_name,omitempty" xml:"person_name,omitempty" maxLength:"32"`
	PrimaryIdNo *string `json:"primary_id_no,omitempty" xml:"primary_id_no,omitempty" maxLength:"1024"`
	SecondIdNo1 *string `json:"second_id_no_1,omitempty" xml:"second_id_no_1,omitempty" maxLength:"1024"`
	SecondIdNo2 *string `json:"second_id_no_2,omitempty" xml:"second_id_no_2,omitempty" maxLength:"1024"`
	SecondIdNo3 *string `json:"second_id_no_3,omitempty" xml:"second_id_no_3,omitempty" maxLength:"1024"`
}

func (s CreatePersonRequest) String() string {
	return tea.Prettify(s)
}

func (s CreatePersonRequest) GoString() string {
	return s.String()
}

func (s *CreatePersonRequest) SetPersonName(v string) *CreatePersonRequest {
	s.PersonName = &v
	return s
}

func (s *CreatePersonRequest) SetPrimaryIdNo(v string) *CreatePersonRequest {
	s.PrimaryIdNo = &v
	return s
}

func (s *CreatePersonRequest) SetSecondIdNo1(v string) *CreatePersonRequest {
	s.SecondIdNo1 = &v
	return s
}

func (s *CreatePersonRequest) SetSecondIdNo2(v string) *CreatePersonRequest {
	s.SecondIdNo2 = &v
	return s
}

func (s *CreatePersonRequest) SetSecondIdNo3(v string) *CreatePersonRequest {
	s.SecondIdNo3 = &v
	return s
}

type CreatePersonResponse struct {
	PersonDid *string `json:"person_did,omitempty" xml:"person_did,omitempty"`
}

func (s CreatePersonResponse) String() string {
	return tea.Prettify(s)
}

func (s CreatePersonResponse) GoString() string {
	return s.String()
}

func (s *CreatePersonResponse) SetPersonDid(v string) *CreatePersonResponse {
	s.PersonDid = &v
	return s
}

type ResumePersonRequest struct {
	PersonDid *string `json:"person_did,omitempty" xml:"person_did,omitempty" maxLength:"128"`
}

func (s ResumePersonRequest) String() string {
	return tea.Prettify(s)
}

func (s ResumePersonRequest) GoString() string {
	return s.String()
}

func (s *ResumePersonRequest) SetPersonDid(v string) *ResumePersonRequest {
	s.PersonDid = &v
	return s
}

type ResumePersonResponse struct {
}

func (s ResumePersonResponse) String() string {
	return tea.Prettify(s)
}

func (s ResumePersonResponse) GoString() string {
	return s.String()
}

type QueryOrganizationClassRequest struct {
	ClassId *string `json:"class_id,omitempty" xml:"class_id,omitempty" maxLength:"128"`
	OrgDid  *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
}

func (s QueryOrganizationClassRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryOrganizationClassRequest) GoString() string {
	return s.String()
}

func (s *QueryOrganizationClassRequest) SetClassId(v string) *QueryOrganizationClassRequest {
	s.ClassId = &v
	return s
}

func (s *QueryOrganizationClassRequest) SetOrgDid(v string) *QueryOrganizationClassRequest {
	s.OrgDid = &v
	return s
}

type QueryOrganizationClassResponse struct {
	ClassName   *string `json:"class_name,omitempty" xml:"class_name,omitempty"`
	ClassStatus *int    `json:"class_status,omitempty" xml:"class_status,omitempty"`
	CreateTime  *string `json:"create_time,omitempty" xml:"create_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?"`
	ModifyTime  *string `json:"modify_time,omitempty" xml:"modify_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?"`
	Period      *int    `json:"period,omitempty" xml:"period,omitempty"`
	Type        *string `json:"type,omitempty" xml:"type,omitempty"`
	UserNum     *int    `json:"user_num,omitempty" xml:"user_num,omitempty"`
}

func (s QueryOrganizationClassResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryOrganizationClassResponse) GoString() string {
	return s.String()
}

func (s *QueryOrganizationClassResponse) SetClassName(v string) *QueryOrganizationClassResponse {
	s.ClassName = &v
	return s
}

func (s *QueryOrganizationClassResponse) SetClassStatus(v int) *QueryOrganizationClassResponse {
	s.ClassStatus = &v
	return s
}

func (s *QueryOrganizationClassResponse) SetCreateTime(v string) *QueryOrganizationClassResponse {
	s.CreateTime = &v
	return s
}

func (s *QueryOrganizationClassResponse) SetModifyTime(v string) *QueryOrganizationClassResponse {
	s.ModifyTime = &v
	return s
}

func (s *QueryOrganizationClassResponse) SetPeriod(v int) *QueryOrganizationClassResponse {
	s.Period = &v
	return s
}

func (s *QueryOrganizationClassResponse) SetType(v string) *QueryOrganizationClassResponse {
	s.Type = &v
	return s
}

func (s *QueryOrganizationClassResponse) SetUserNum(v int) *QueryOrganizationClassResponse {
	s.UserNum = &v
	return s
}

type UpdateOrganizationClassRequest struct {
	Capacity       *int    `json:"capacity,omitempty" xml:"capacity,omitempty"`
	ClassEndTime   *string `json:"class_end_time,omitempty" xml:"class_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?"`
	ClassId        *string `json:"class_id,omitempty" xml:"class_id,omitempty" maxLength:"128"`
	ClassName      *string `json:"class_name,omitempty" xml:"class_name,omitempty" maxLength:"64"`
	ClassStartTime *string `json:"class_start_time,omitempty" xml:"class_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?"`
	ClassStatus    *int    `json:"class_status,omitempty" xml:"class_status,omitempty"`
	OrgDid         *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
}

func (s UpdateOrganizationClassRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateOrganizationClassRequest) GoString() string {
	return s.String()
}

func (s *UpdateOrganizationClassRequest) SetCapacity(v int) *UpdateOrganizationClassRequest {
	s.Capacity = &v
	return s
}

func (s *UpdateOrganizationClassRequest) SetClassEndTime(v string) *UpdateOrganizationClassRequest {
	s.ClassEndTime = &v
	return s
}

func (s *UpdateOrganizationClassRequest) SetClassId(v string) *UpdateOrganizationClassRequest {
	s.ClassId = &v
	return s
}

func (s *UpdateOrganizationClassRequest) SetClassName(v string) *UpdateOrganizationClassRequest {
	s.ClassName = &v
	return s
}

func (s *UpdateOrganizationClassRequest) SetClassStartTime(v string) *UpdateOrganizationClassRequest {
	s.ClassStartTime = &v
	return s
}

func (s *UpdateOrganizationClassRequest) SetClassStatus(v int) *UpdateOrganizationClassRequest {
	s.ClassStatus = &v
	return s
}

func (s *UpdateOrganizationClassRequest) SetOrgDid(v string) *UpdateOrganizationClassRequest {
	s.OrgDid = &v
	return s
}

type UpdateOrganizationClassResponse struct {
}

func (s UpdateOrganizationClassResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateOrganizationClassResponse) GoString() string {
	return s.String()
}

type QueryUserCertRequest struct {
	OrgDid    *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	OrgUserId *string `json:"org_user_id,omitempty" xml:"org_user_id,omitempty" maxLength:"128"`
}

func (s QueryUserCertRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryUserCertRequest) GoString() string {
	return s.String()
}

func (s *QueryUserCertRequest) SetOrgDid(v string) *QueryUserCertRequest {
	s.OrgDid = &v
	return s
}

func (s *QueryUserCertRequest) SetOrgUserId(v string) *QueryUserCertRequest {
	s.OrgUserId = &v
	return s
}

type QueryUserCertResponse struct {
	CertIdList []*string `json:"cert_id_list,omitempty" xml:"cert_id_list,omitempty" type:"Repeated"`
}

func (s QueryUserCertResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryUserCertResponse) GoString() string {
	return s.String()
}

func (s *QueryUserCertResponse) SetCertIdList(v []*string) *QueryUserCertResponse {
	s.CertIdList = v
	return s
}

type CreateOrganizationCourseRequest struct {
	CourseEndTime   *string `json:"course_end_time,omitempty" xml:"course_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?"`
	CourseName      *string `json:"course_name,omitempty" xml:"course_name,omitempty" maxLength:"64"`
	CourseStartTime *string `json:"course_start_time,omitempty" xml:"course_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?"`
	OrgDid          *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	Period          *int    `json:"period,omitempty" xml:"period,omitempty"`
}

func (s CreateOrganizationCourseRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateOrganizationCourseRequest) GoString() string {
	return s.String()
}

func (s *CreateOrganizationCourseRequest) SetCourseEndTime(v string) *CreateOrganizationCourseRequest {
	s.CourseEndTime = &v
	return s
}

func (s *CreateOrganizationCourseRequest) SetCourseName(v string) *CreateOrganizationCourseRequest {
	s.CourseName = &v
	return s
}

func (s *CreateOrganizationCourseRequest) SetCourseStartTime(v string) *CreateOrganizationCourseRequest {
	s.CourseStartTime = &v
	return s
}

func (s *CreateOrganizationCourseRequest) SetOrgDid(v string) *CreateOrganizationCourseRequest {
	s.OrgDid = &v
	return s
}

func (s *CreateOrganizationCourseRequest) SetPeriod(v int) *CreateOrganizationCourseRequest {
	s.Period = &v
	return s
}

type CreateOrganizationCourseResponse struct {
	CourseId *string `json:"course_id,omitempty" xml:"course_id,omitempty"`
}

func (s CreateOrganizationCourseResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateOrganizationCourseResponse) GoString() string {
	return s.String()
}

func (s *CreateOrganizationCourseResponse) SetCourseId(v string) *CreateOrganizationCourseResponse {
	s.CourseId = &v
	return s
}

type CreateOrganizationRequest struct {
	OrgCode *string `json:"org_code,omitempty" xml:"org_code,omitempty" maxLength:"64"`
	OrgName *string `json:"org_name,omitempty" xml:"org_name,omitempty" maxLength:"64"`
}

func (s CreateOrganizationRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateOrganizationRequest) GoString() string {
	return s.String()
}

func (s *CreateOrganizationRequest) SetOrgCode(v string) *CreateOrganizationRequest {
	s.OrgCode = &v
	return s
}

func (s *CreateOrganizationRequest) SetOrgName(v string) *CreateOrganizationRequest {
	s.OrgName = &v
	return s
}

type CreateOrganizationResponse struct {
	OrgDid *string `json:"org_did,omitempty" xml:"org_did,omitempty"`
}

func (s CreateOrganizationResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateOrganizationResponse) GoString() string {
	return s.String()
}

func (s *CreateOrganizationResponse) SetOrgDid(v string) *CreateOrganizationResponse {
	s.OrgDid = &v
	return s
}

type CreateOrganizationUserRequest struct {
	OrgDid    *string `json:"org_did,omitempty" xml:"org_did,omitempty" maxLength:"128"`
	PersonDid *string `json:"person_did,omitempty" xml:"person_did,omitempty" maxLength:"128"`
	Uid       *string `json:"uid,omitempty" xml:"uid,omitempty" maxLength:"64"`
}

func (s CreateOrganizationUserRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateOrganizationUserRequest) GoString() string {
	return s.String()
}

func (s *CreateOrganizationUserRequest) SetOrgDid(v string) *CreateOrganizationUserRequest {
	s.OrgDid = &v
	return s
}

func (s *CreateOrganizationUserRequest) SetPersonDid(v string) *CreateOrganizationUserRequest {
	s.PersonDid = &v
	return s
}

func (s *CreateOrganizationUserRequest) SetUid(v string) *CreateOrganizationUserRequest {
	s.Uid = &v
	return s
}

type CreateOrganizationUserResponse struct {
	OrgUserId *string `json:"org_user_id,omitempty" xml:"org_user_id,omitempty"`
}

func (s CreateOrganizationUserResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateOrganizationUserResponse) GoString() string {
	return s.String()
}

func (s *CreateOrganizationUserResponse) SetOrgUserId(v string) *CreateOrganizationUserResponse {
	s.OrgUserId = &v
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
	AuthToken       *string
	Tenant          *string
	Workspace       *string
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
	client.Tenant = config.Tenant
	client.Workspace = config.Workspace
	client.Endpoint = config.Endpoint
	client.AuthToken = config.AuthToken
	client.Protocol = config.Protocol
	client.RegionId = config.RegionId
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
func (client *Client) DoRequest(action *string, protocol *string, method *string, pathname *string, request map[string]interface{}, runtime *util.RuntimeOptions) (_result map[string]interface{}, _err error) {
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
				"method":     action,
				"version":    tea.String("1.0"),
				"sign_type":  tea.String("HmacSHA1"),
				"req_time":   alipayutil.GetTimestamp(),
				"req_msg_id": util.GetNonce(),
			}
			if !tea.BoolValue(util.Empty(client.Tenant)) {
				request_.Query["tenant"] = client.Tenant
			}

			if !tea.BoolValue(util.Empty(client.Workspace)) {
				request_.Query["workspace"] = client.Workspace
			}

			if !tea.BoolValue(util.Empty(client.AuthToken)) {
				request_.Query["auth_token"] = client.AuthToken
			} else {
				request_.Query["access_key"] = client.AccessKeyId
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
	userAgent := util.GetUserAgent(client.UserAgent)
	_result = userAgent
	return _result
}

/**
 * Description: 删除课程中的班级
 * Summary: 删除课程班级
 */
func (client *Client) DeleteCourseClass(request *DeleteCourseClassRequest) (_result *DeleteCourseClassResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &DeleteCourseClassResponse{}
	_body, _err := client.DeleteCourseClassEx(request, runtime)
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
func (client *Client) DeleteCourseClassEx(request *DeleteCourseClassRequest, runtime *util.RuntimeOptions) (_result *DeleteCourseClassResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteCourseClassResponse{}
	_body, _err := client.DoRequest(tea.String("baas.ebc.course.class.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ApplyCertUrl(request *ApplyCertUrlRequest) (_result *ApplyCertUrlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ApplyCertUrlResponse{}
	_body, _err := client.ApplyCertUrlEx(request, runtime)
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
func (client *Client) ApplyCertUrlEx(request *ApplyCertUrlRequest, runtime *util.RuntimeOptions) (_result *ApplyCertUrlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyCertUrlResponse{}
	_body, _err := client.DoRequest(tea.String("baas.ebc.cert.url.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) AddCourseClass(request *AddCourseClassRequest) (_result *AddCourseClassResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AddCourseClassResponse{}
	_body, _err := client.AddCourseClassEx(request, runtime)
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
func (client *Client) AddCourseClassEx(request *AddCourseClassRequest, runtime *util.RuntimeOptions) (_result *AddCourseClassResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddCourseClassResponse{}
	_body, _err := client.DoRequest(tea.String("baas.ebc.course.class.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) AddClassUser(request *AddClassUserRequest) (_result *AddClassUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AddClassUserResponse{}
	_body, _err := client.AddClassUserEx(request, runtime)
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
func (client *Client) AddClassUserEx(request *AddClassUserRequest, runtime *util.RuntimeOptions) (_result *AddClassUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddClassUserResponse{}
	_body, _err := client.DoRequest(tea.String("baas.ebc.class.user.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryOrganizationCert(request *QueryOrganizationCertRequest) (_result *QueryOrganizationCertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryOrganizationCertResponse{}
	_body, _err := client.QueryOrganizationCertEx(request, runtime)
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
func (client *Client) QueryOrganizationCertEx(request *QueryOrganizationCertRequest, runtime *util.RuntimeOptions) (_result *QueryOrganizationCertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryOrganizationCertResponse{}
	_body, _err := client.DoRequest(tea.String("baas.ebc.organization.cert.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) AddCourseUser(request *AddCourseUserRequest) (_result *AddCourseUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AddCourseUserResponse{}
	_body, _err := client.AddCourseUserEx(request, runtime)
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
func (client *Client) AddCourseUserEx(request *AddCourseUserRequest, runtime *util.RuntimeOptions) (_result *AddCourseUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddCourseUserResponse{}
	_body, _err := client.DoRequest(tea.String("baas.ebc.course.user.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) DeleteCourseUser(request *DeleteCourseUserRequest) (_result *DeleteCourseUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &DeleteCourseUserResponse{}
	_body, _err := client.DeleteCourseUserEx(request, runtime)
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
func (client *Client) DeleteCourseUserEx(request *DeleteCourseUserRequest, runtime *util.RuntimeOptions) (_result *DeleteCourseUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteCourseUserResponse{}
	_body, _err := client.DoRequest(tea.String("baas.ebc.course.user.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateOrganizationClass(request *CreateOrganizationClassRequest) (_result *CreateOrganizationClassResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateOrganizationClassResponse{}
	_body, _err := client.CreateOrganizationClassEx(request, runtime)
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
func (client *Client) CreateOrganizationClassEx(request *CreateOrganizationClassRequest, runtime *util.RuntimeOptions) (_result *CreateOrganizationClassResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateOrganizationClassResponse{}
	_body, _err := client.DoRequest(tea.String("baas.ebc.organization.class.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryClassUser(request *QueryClassUserRequest) (_result *QueryClassUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryClassUserResponse{}
	_body, _err := client.QueryClassUserEx(request, runtime)
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
func (client *Client) QueryClassUserEx(request *QueryClassUserRequest, runtime *util.RuntimeOptions) (_result *QueryClassUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryClassUserResponse{}
	_body, _err := client.DoRequest(tea.String("baas.ebc.class.user.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryCert(request *QueryCertRequest) (_result *QueryCertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryCertResponse{}
	_body, _err := client.QueryCertEx(request, runtime)
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
func (client *Client) QueryCertEx(request *QueryCertRequest, runtime *util.RuntimeOptions) (_result *QueryCertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCertResponse{}
	_body, _err := client.DoRequest(tea.String("baas.ebc.cert.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) UpdateOrganizationCourse(request *UpdateOrganizationCourseRequest) (_result *UpdateOrganizationCourseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateOrganizationCourseResponse{}
	_body, _err := client.UpdateOrganizationCourseEx(request, runtime)
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
func (client *Client) UpdateOrganizationCourseEx(request *UpdateOrganizationCourseRequest, runtime *util.RuntimeOptions) (_result *UpdateOrganizationCourseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateOrganizationCourseResponse{}
	_body, _err := client.DoRequest(tea.String("baas.ebc.organization.course.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CancelPerson(request *CancelPersonRequest) (_result *CancelPersonResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CancelPersonResponse{}
	_body, _err := client.CancelPersonEx(request, runtime)
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
func (client *Client) CancelPersonEx(request *CancelPersonRequest, runtime *util.RuntimeOptions) (_result *CancelPersonResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelPersonResponse{}
	_body, _err := client.DoRequest(tea.String("baas.ebc.person.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateUserCert(request *CreateUserCertRequest) (_result *CreateUserCertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateUserCertResponse{}
	_body, _err := client.CreateUserCertEx(request, runtime)
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
func (client *Client) CreateUserCertEx(request *CreateUserCertRequest, runtime *util.RuntimeOptions) (_result *CreateUserCertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateUserCertResponse{}
	_body, _err := client.DoRequest(tea.String("baas.ebc.user.cert.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) DeleteClassUser(request *DeleteClassUserRequest) (_result *DeleteClassUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &DeleteClassUserResponse{}
	_body, _err := client.DeleteClassUserEx(request, runtime)
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
func (client *Client) DeleteClassUserEx(request *DeleteClassUserRequest, runtime *util.RuntimeOptions) (_result *DeleteClassUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteClassUserResponse{}
	_body, _err := client.DoRequest(tea.String("baas.ebc.class.user.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreatePerson(request *CreatePersonRequest) (_result *CreatePersonResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreatePersonResponse{}
	_body, _err := client.CreatePersonEx(request, runtime)
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
func (client *Client) CreatePersonEx(request *CreatePersonRequest, runtime *util.RuntimeOptions) (_result *CreatePersonResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreatePersonResponse{}
	_body, _err := client.DoRequest(tea.String("baas.ebc.person.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ResumePerson(request *ResumePersonRequest) (_result *ResumePersonResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ResumePersonResponse{}
	_body, _err := client.ResumePersonEx(request, runtime)
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
func (client *Client) ResumePersonEx(request *ResumePersonRequest, runtime *util.RuntimeOptions) (_result *ResumePersonResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResumePersonResponse{}
	_body, _err := client.DoRequest(tea.String("baas.ebc.person.resume"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryOrganizationClass(request *QueryOrganizationClassRequest) (_result *QueryOrganizationClassResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryOrganizationClassResponse{}
	_body, _err := client.QueryOrganizationClassEx(request, runtime)
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
func (client *Client) QueryOrganizationClassEx(request *QueryOrganizationClassRequest, runtime *util.RuntimeOptions) (_result *QueryOrganizationClassResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryOrganizationClassResponse{}
	_body, _err := client.DoRequest(tea.String("baas.ebc.organization.class.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) UpdateOrganizationClass(request *UpdateOrganizationClassRequest) (_result *UpdateOrganizationClassResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateOrganizationClassResponse{}
	_body, _err := client.UpdateOrganizationClassEx(request, runtime)
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
func (client *Client) UpdateOrganizationClassEx(request *UpdateOrganizationClassRequest, runtime *util.RuntimeOptions) (_result *UpdateOrganizationClassResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateOrganizationClassResponse{}
	_body, _err := client.DoRequest(tea.String("baas.ebc.organization.class.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryUserCert(request *QueryUserCertRequest) (_result *QueryUserCertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryUserCertResponse{}
	_body, _err := client.QueryUserCertEx(request, runtime)
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
func (client *Client) QueryUserCertEx(request *QueryUserCertRequest, runtime *util.RuntimeOptions) (_result *QueryUserCertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryUserCertResponse{}
	_body, _err := client.DoRequest(tea.String("baas.ebc.user.cert.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateOrganizationCourse(request *CreateOrganizationCourseRequest) (_result *CreateOrganizationCourseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateOrganizationCourseResponse{}
	_body, _err := client.CreateOrganizationCourseEx(request, runtime)
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
func (client *Client) CreateOrganizationCourseEx(request *CreateOrganizationCourseRequest, runtime *util.RuntimeOptions) (_result *CreateOrganizationCourseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateOrganizationCourseResponse{}
	_body, _err := client.DoRequest(tea.String("baas.ebc.organization.course.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建企业
 * Summary: 创建企业
 */
func (client *Client) CreateOrganization(request *CreateOrganizationRequest) (_result *CreateOrganizationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateOrganizationResponse{}
	_body, _err := client.CreateOrganizationEx(request, runtime)
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
func (client *Client) CreateOrganizationEx(request *CreateOrganizationRequest, runtime *util.RuntimeOptions) (_result *CreateOrganizationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateOrganizationResponse{}
	_body, _err := client.DoRequest(tea.String("baas.ebc.organization.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateOrganizationUser(request *CreateOrganizationUserRequest) (_result *CreateOrganizationUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateOrganizationUserResponse{}
	_body, _err := client.CreateOrganizationUserEx(request, runtime)
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
func (client *Client) CreateOrganizationUserEx(request *CreateOrganizationUserRequest, runtime *util.RuntimeOptions) (_result *CreateOrganizationUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateOrganizationUserResponse{}
	_body, _err := client.DoRequest(tea.String("baas.ebc.organization.user.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
