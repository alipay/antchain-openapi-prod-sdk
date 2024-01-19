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

// 协议扩展
type RiskEvaluationAgreementExtRequest struct {
	// URL：文件地址
	// CONTENT:Base64的文件流
	//
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 文件类型
	// PDF
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty"`
	// type为url是传入文件地址
	// type为CONTENT时传入Base64文件内容编码
	//
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s RiskEvaluationAgreementExtRequest) String() string {
	return tea.Prettify(s)
}

func (s RiskEvaluationAgreementExtRequest) GoString() string {
	return s.String()
}

func (s *RiskEvaluationAgreementExtRequest) SetType(v string) *RiskEvaluationAgreementExtRequest {
	s.Type = &v
	return s
}

func (s *RiskEvaluationAgreementExtRequest) SetFileType(v string) *RiskEvaluationAgreementExtRequest {
	s.FileType = &v
	return s
}

func (s *RiskEvaluationAgreementExtRequest) SetContent(v string) *RiskEvaluationAgreementExtRequest {
	s.Content = &v
	return s
}

// 地区
type RiskEvaluationDistrictExtRequest struct {
	// 地区编码
	CityCode *string `json:"city_code,omitempty" xml:"city_code,omitempty" require:"true"`
	// 省级编码
	ProvCode *string `json:"prov_code,omitempty" xml:"prov_code,omitempty" require:"true"`
}

func (s RiskEvaluationDistrictExtRequest) String() string {
	return tea.Prettify(s)
}

func (s RiskEvaluationDistrictExtRequest) GoString() string {
	return s.String()
}

func (s *RiskEvaluationDistrictExtRequest) SetCityCode(v string) *RiskEvaluationDistrictExtRequest {
	s.CityCode = &v
	return s
}

func (s *RiskEvaluationDistrictExtRequest) SetProvCode(v string) *RiskEvaluationDistrictExtRequest {
	s.ProvCode = &v
	return s
}

// 扩展信息
type RiskEvaluationExtendInfoRequest struct {
	// 协议集合
	AgreementList []*RiskEvaluationAgreementExtRequest `json:"agreement_list,omitempty" xml:"agreement_list,omitempty" require:"true" type:"Repeated"`
	// 地区请求
	DistrictExt *RiskEvaluationDistrictExtRequest `json:"district_ext,omitempty" xml:"district_ext,omitempty" require:"true"`
}

func (s RiskEvaluationExtendInfoRequest) String() string {
	return tea.Prettify(s)
}

func (s RiskEvaluationExtendInfoRequest) GoString() string {
	return s.String()
}

func (s *RiskEvaluationExtendInfoRequest) SetAgreementList(v []*RiskEvaluationAgreementExtRequest) *RiskEvaluationExtendInfoRequest {
	s.AgreementList = v
	return s
}

func (s *RiskEvaluationExtendInfoRequest) SetDistrictExt(v *RiskEvaluationDistrictExtRequest) *RiskEvaluationExtendInfoRequest {
	s.DistrictExt = v
	return s
}

type ImportDataBccCompanyPersonRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 姓名
	Xm *string `json:"xm,omitempty" xml:"xm,omitempty"`
	// 身份证号
	Sfzh *string `json:"sfzh,omitempty" xml:"sfzh,omitempty"`
	// 数据更新时间
	Sjgxsj *string `json:"sjgxsj,omitempty" xml:"sjgxsj,omitempty"`
	// 数据目录名称
	Sjmlmc *string `json:"sjmlmc,omitempty" xml:"sjmlmc,omitempty"`
	// 数据所属部门
	Sjssbm *string `json:"sjssbm,omitempty" xml:"sjssbm,omitempty"`
	// 从业资格证号
	Cyzgzh *string `json:"cyzgzh,omitempty" xml:"cyzgzh,omitempty"`
	// 从业类别
	Cylb *string `json:"cylb,omitempty" xml:"cylb,omitempty"`
	// 聘用单位
	Pydw *string `json:"pydw,omitempty" xml:"pydw,omitempty"`
	// 公告事由
	Ggsy *string `json:"ggsy,omitempty" xml:"ggsy,omitempty"`
	// 公告日期起
	Ggrqq *string `json:"ggrqq,omitempty" xml:"ggrqq,omitempty"`
	// 公告日期止
	Ggrqz *string `json:"ggrqz,omitempty" xml:"ggrqz,omitempty"`
	// 企信链所需---企信链控制台数据管理列表页中每个数据的唯一码
	DataName *string `json:"data_name,omitempty" xml:"data_name,omitempty"`
}

func (s ImportDataBccCompanyPersonRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportDataBccCompanyPersonRequest) GoString() string {
	return s.String()
}

func (s *ImportDataBccCompanyPersonRequest) SetAuthToken(v string) *ImportDataBccCompanyPersonRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportDataBccCompanyPersonRequest) SetProductInstanceId(v string) *ImportDataBccCompanyPersonRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportDataBccCompanyPersonRequest) SetXm(v string) *ImportDataBccCompanyPersonRequest {
	s.Xm = &v
	return s
}

func (s *ImportDataBccCompanyPersonRequest) SetSfzh(v string) *ImportDataBccCompanyPersonRequest {
	s.Sfzh = &v
	return s
}

func (s *ImportDataBccCompanyPersonRequest) SetSjgxsj(v string) *ImportDataBccCompanyPersonRequest {
	s.Sjgxsj = &v
	return s
}

func (s *ImportDataBccCompanyPersonRequest) SetSjmlmc(v string) *ImportDataBccCompanyPersonRequest {
	s.Sjmlmc = &v
	return s
}

func (s *ImportDataBccCompanyPersonRequest) SetSjssbm(v string) *ImportDataBccCompanyPersonRequest {
	s.Sjssbm = &v
	return s
}

func (s *ImportDataBccCompanyPersonRequest) SetCyzgzh(v string) *ImportDataBccCompanyPersonRequest {
	s.Cyzgzh = &v
	return s
}

func (s *ImportDataBccCompanyPersonRequest) SetCylb(v string) *ImportDataBccCompanyPersonRequest {
	s.Cylb = &v
	return s
}

func (s *ImportDataBccCompanyPersonRequest) SetPydw(v string) *ImportDataBccCompanyPersonRequest {
	s.Pydw = &v
	return s
}

func (s *ImportDataBccCompanyPersonRequest) SetGgsy(v string) *ImportDataBccCompanyPersonRequest {
	s.Ggsy = &v
	return s
}

func (s *ImportDataBccCompanyPersonRequest) SetGgrqq(v string) *ImportDataBccCompanyPersonRequest {
	s.Ggrqq = &v
	return s
}

func (s *ImportDataBccCompanyPersonRequest) SetGgrqz(v string) *ImportDataBccCompanyPersonRequest {
	s.Ggrqz = &v
	return s
}

func (s *ImportDataBccCompanyPersonRequest) SetDataName(v string) *ImportDataBccCompanyPersonRequest {
	s.DataName = &v
	return s
}

type ImportDataBccCompanyPersonResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据模型唯一key
	DataKey *string `json:"data_key,omitempty" xml:"data_key,omitempty"`
	// 模型码
	DataCode *string `json:"data_code,omitempty" xml:"data_code,omitempty"`
}

func (s ImportDataBccCompanyPersonResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportDataBccCompanyPersonResponse) GoString() string {
	return s.String()
}

func (s *ImportDataBccCompanyPersonResponse) SetReqMsgId(v string) *ImportDataBccCompanyPersonResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportDataBccCompanyPersonResponse) SetResultCode(v string) *ImportDataBccCompanyPersonResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportDataBccCompanyPersonResponse) SetResultMsg(v string) *ImportDataBccCompanyPersonResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportDataBccCompanyPersonResponse) SetDataKey(v string) *ImportDataBccCompanyPersonResponse {
	s.DataKey = &v
	return s
}

func (s *ImportDataBccCompanyPersonResponse) SetDataCode(v string) *ImportDataBccCompanyPersonResponse {
	s.DataCode = &v
	return s
}

type AuthBlockchainTaxRiskEvaluationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 个人身份证号
	IdentityId *string `json:"identity_id,omitempty" xml:"identity_id,omitempty" require:"true" maxLength:"30"`
	// 个人姓名
	IdentityName *string `json:"identity_name,omitempty" xml:"identity_name,omitempty" maxLength:"128"`
	// 企业的统一社会信用编码
	EnterpriseId *string `json:"enterprise_id,omitempty" xml:"enterprise_id,omitempty" maxLength:"64"`
	// 企业的名称
	EnterpriseName *string `json:"enterprise_name,omitempty" xml:"enterprise_name,omitempty"`
	// 企业或者个人企业：ENTERPRISE  个人：PERSONAL
	//
	IdentityType *string `json:"identity_type,omitempty" xml:"identity_type,omitempty" require:"true"`
	// 授权的业务类型
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
	// 授权订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 子渠道渠道编码，需要同步蚂蚁，由蚂蚁设置。如果是银行本身，可不填
	// 备注：如果同一信贷客户在不同银行的调用需要严格区分，分别授权
	//
	SubTenant *string `json:"sub_tenant,omitempty" xml:"sub_tenant,omitempty"`
	//  扩展信息
	ExtendInfo *RiskEvaluationExtendInfoRequest `json:"extend_info,omitempty" xml:"extend_info,omitempty" require:"true"`
}

func (s AuthBlockchainTaxRiskEvaluationRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthBlockchainTaxRiskEvaluationRequest) GoString() string {
	return s.String()
}

func (s *AuthBlockchainTaxRiskEvaluationRequest) SetAuthToken(v string) *AuthBlockchainTaxRiskEvaluationRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthBlockchainTaxRiskEvaluationRequest) SetProductInstanceId(v string) *AuthBlockchainTaxRiskEvaluationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthBlockchainTaxRiskEvaluationRequest) SetIdentityId(v string) *AuthBlockchainTaxRiskEvaluationRequest {
	s.IdentityId = &v
	return s
}

func (s *AuthBlockchainTaxRiskEvaluationRequest) SetIdentityName(v string) *AuthBlockchainTaxRiskEvaluationRequest {
	s.IdentityName = &v
	return s
}

func (s *AuthBlockchainTaxRiskEvaluationRequest) SetEnterpriseId(v string) *AuthBlockchainTaxRiskEvaluationRequest {
	s.EnterpriseId = &v
	return s
}

func (s *AuthBlockchainTaxRiskEvaluationRequest) SetEnterpriseName(v string) *AuthBlockchainTaxRiskEvaluationRequest {
	s.EnterpriseName = &v
	return s
}

func (s *AuthBlockchainTaxRiskEvaluationRequest) SetIdentityType(v string) *AuthBlockchainTaxRiskEvaluationRequest {
	s.IdentityType = &v
	return s
}

func (s *AuthBlockchainTaxRiskEvaluationRequest) SetAuthType(v string) *AuthBlockchainTaxRiskEvaluationRequest {
	s.AuthType = &v
	return s
}

func (s *AuthBlockchainTaxRiskEvaluationRequest) SetOrderNo(v string) *AuthBlockchainTaxRiskEvaluationRequest {
	s.OrderNo = &v
	return s
}

func (s *AuthBlockchainTaxRiskEvaluationRequest) SetSubTenant(v string) *AuthBlockchainTaxRiskEvaluationRequest {
	s.SubTenant = &v
	return s
}

func (s *AuthBlockchainTaxRiskEvaluationRequest) SetExtendInfo(v *RiskEvaluationExtendInfoRequest) *AuthBlockchainTaxRiskEvaluationRequest {
	s.ExtendInfo = v
	return s
}

type AuthBlockchainTaxRiskEvaluationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权订单订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 是否授权成功true是，false否
	AuthSuccess *bool `json:"auth_success,omitempty" xml:"auth_success,omitempty"`
	// 过期时间，unix时间戳 毫秒
	ExpireTime *int64 `json:"expire_time,omitempty" xml:"expire_time,omitempty"`
	// 授权时间，unix时间戳 毫秒
	AuthTime *string `json:"auth_time,omitempty" xml:"auth_time,omitempty"`
}

func (s AuthBlockchainTaxRiskEvaluationResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthBlockchainTaxRiskEvaluationResponse) GoString() string {
	return s.String()
}

func (s *AuthBlockchainTaxRiskEvaluationResponse) SetReqMsgId(v string) *AuthBlockchainTaxRiskEvaluationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthBlockchainTaxRiskEvaluationResponse) SetResultCode(v string) *AuthBlockchainTaxRiskEvaluationResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthBlockchainTaxRiskEvaluationResponse) SetResultMsg(v string) *AuthBlockchainTaxRiskEvaluationResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthBlockchainTaxRiskEvaluationResponse) SetOrderNo(v string) *AuthBlockchainTaxRiskEvaluationResponse {
	s.OrderNo = &v
	return s
}

func (s *AuthBlockchainTaxRiskEvaluationResponse) SetAuthSuccess(v bool) *AuthBlockchainTaxRiskEvaluationResponse {
	s.AuthSuccess = &v
	return s
}

func (s *AuthBlockchainTaxRiskEvaluationResponse) SetExpireTime(v int64) *AuthBlockchainTaxRiskEvaluationResponse {
	s.ExpireTime = &v
	return s
}

func (s *AuthBlockchainTaxRiskEvaluationResponse) SetAuthTime(v string) *AuthBlockchainTaxRiskEvaluationResponse {
	s.AuthTime = &v
	return s
}

type QueryBlockchainTaxRiskEvaluationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求流水号(必填),调用方保证每次请求号唯一，受理方用来校验唯一性，同一受理号返回请求结果一致
	BizRequestId *string `json:"biz_request_id,omitempty" xml:"biz_request_id,omitempty" require:"true"`
	// 信贷用户的纳税人识别号或者身份证号
	IdentityId *string `json:"identity_id,omitempty" xml:"identity_id,omitempty" require:"true"`
	// 授权类型
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
	// 授权订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 机构编码
	InstCode *string `json:"inst_code,omitempty" xml:"inst_code,omitempty" require:"true"`
}

func (s QueryBlockchainTaxRiskEvaluationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainTaxRiskEvaluationRequest) GoString() string {
	return s.String()
}

func (s *QueryBlockchainTaxRiskEvaluationRequest) SetAuthToken(v string) *QueryBlockchainTaxRiskEvaluationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBlockchainTaxRiskEvaluationRequest) SetProductInstanceId(v string) *QueryBlockchainTaxRiskEvaluationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBlockchainTaxRiskEvaluationRequest) SetBizRequestId(v string) *QueryBlockchainTaxRiskEvaluationRequest {
	s.BizRequestId = &v
	return s
}

func (s *QueryBlockchainTaxRiskEvaluationRequest) SetIdentityId(v string) *QueryBlockchainTaxRiskEvaluationRequest {
	s.IdentityId = &v
	return s
}

func (s *QueryBlockchainTaxRiskEvaluationRequest) SetAuthType(v string) *QueryBlockchainTaxRiskEvaluationRequest {
	s.AuthType = &v
	return s
}

func (s *QueryBlockchainTaxRiskEvaluationRequest) SetOrderNo(v string) *QueryBlockchainTaxRiskEvaluationRequest {
	s.OrderNo = &v
	return s
}

func (s *QueryBlockchainTaxRiskEvaluationRequest) SetInstCode(v string) *QueryBlockchainTaxRiskEvaluationRequest {
	s.InstCode = &v
	return s
}

type QueryBlockchainTaxRiskEvaluationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// unix秒时间戳,查询时间，用来对账使用
	QueryTime *string `json:"query_time,omitempty" xml:"query_time,omitempty"`
	// 是否查的，空数据标识
	NullDataFlag *bool `json:"null_data_flag,omitempty" xml:"null_data_flag,omitempty"`
}

func (s QueryBlockchainTaxRiskEvaluationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainTaxRiskEvaluationResponse) GoString() string {
	return s.String()
}

func (s *QueryBlockchainTaxRiskEvaluationResponse) SetReqMsgId(v string) *QueryBlockchainTaxRiskEvaluationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBlockchainTaxRiskEvaluationResponse) SetResultCode(v string) *QueryBlockchainTaxRiskEvaluationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBlockchainTaxRiskEvaluationResponse) SetResultMsg(v string) *QueryBlockchainTaxRiskEvaluationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBlockchainTaxRiskEvaluationResponse) SetQueryTime(v string) *QueryBlockchainTaxRiskEvaluationResponse {
	s.QueryTime = &v
	return s
}

func (s *QueryBlockchainTaxRiskEvaluationResponse) SetNullDataFlag(v bool) *QueryBlockchainTaxRiskEvaluationResponse {
	s.NullDataFlag = &v
	return s
}

type SyncBlockchainTaxRiskEvaluationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求流水号(必填),调用方保证每次请求号唯一，受理方用来校验唯一性，同一受理号返回请求结果一致
	BizRequestId *string `json:"biz_request_id,omitempty" xml:"biz_request_id,omitempty" require:"true"`
	// 信贷用户的纳税人识别号或者身份证号
	IdentityId *string `json:"identity_id,omitempty" xml:"identity_id,omitempty" require:"true"`
	// 授权类型
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
	// 授权订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 机构编码
	InstCode *string `json:"inst_code,omitempty" xml:"inst_code,omitempty" require:"true"`
}

func (s SyncBlockchainTaxRiskEvaluationRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncBlockchainTaxRiskEvaluationRequest) GoString() string {
	return s.String()
}

func (s *SyncBlockchainTaxRiskEvaluationRequest) SetAuthToken(v string) *SyncBlockchainTaxRiskEvaluationRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncBlockchainTaxRiskEvaluationRequest) SetProductInstanceId(v string) *SyncBlockchainTaxRiskEvaluationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncBlockchainTaxRiskEvaluationRequest) SetBizRequestId(v string) *SyncBlockchainTaxRiskEvaluationRequest {
	s.BizRequestId = &v
	return s
}

func (s *SyncBlockchainTaxRiskEvaluationRequest) SetIdentityId(v string) *SyncBlockchainTaxRiskEvaluationRequest {
	s.IdentityId = &v
	return s
}

func (s *SyncBlockchainTaxRiskEvaluationRequest) SetAuthType(v string) *SyncBlockchainTaxRiskEvaluationRequest {
	s.AuthType = &v
	return s
}

func (s *SyncBlockchainTaxRiskEvaluationRequest) SetOrderNo(v string) *SyncBlockchainTaxRiskEvaluationRequest {
	s.OrderNo = &v
	return s
}

func (s *SyncBlockchainTaxRiskEvaluationRequest) SetInstCode(v string) *SyncBlockchainTaxRiskEvaluationRequest {
	s.InstCode = &v
	return s
}

type SyncBlockchainTaxRiskEvaluationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 1322324243	unix秒时间戳,查询时间，用来对账使用
	QueryTime *string `json:"query_time,omitempty" xml:"query_time,omitempty"`
	// 内容，List<JsonObject>
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
}

func (s SyncBlockchainTaxRiskEvaluationResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncBlockchainTaxRiskEvaluationResponse) GoString() string {
	return s.String()
}

func (s *SyncBlockchainTaxRiskEvaluationResponse) SetReqMsgId(v string) *SyncBlockchainTaxRiskEvaluationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncBlockchainTaxRiskEvaluationResponse) SetResultCode(v string) *SyncBlockchainTaxRiskEvaluationResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncBlockchainTaxRiskEvaluationResponse) SetResultMsg(v string) *SyncBlockchainTaxRiskEvaluationResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncBlockchainTaxRiskEvaluationResponse) SetQueryTime(v string) *SyncBlockchainTaxRiskEvaluationResponse {
	s.QueryTime = &v
	return s
}

func (s *SyncBlockchainTaxRiskEvaluationResponse) SetBizContent(v string) *SyncBlockchainTaxRiskEvaluationResponse {
	s.BizContent = &v
	return s
}

type StartBlockchainTaxRiskEvaluationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 个人身份证号
	IdentityId *string `json:"identity_id,omitempty" xml:"identity_id,omitempty" require:"true"`
	// 个人姓名
	IdentityName *string `json:"identity_name,omitempty" xml:"identity_name,omitempty"`
	// 企业的统一社会信用编码
	EnterpriseId *string `json:"enterprise_id,omitempty" xml:"enterprise_id,omitempty"`
	// 某某某公司
	EnterpriseName *string `json:"enterprise_name,omitempty" xml:"enterprise_name,omitempty"`
	// 企业或者个人企业：ENTERPRISE 个人：PERSONAL
	IdentityType *string `json:"identity_type,omitempty" xml:"identity_type,omitempty" require:"true"`
	// 101
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
	// 授权订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 请求流水号(必填),调用 方保证每次请求号唯   一，受理方用来校验唯 一性，同一受理号返回 请求结果一致
	BizRequestId *string `json:"biz_request_id,omitempty" xml:"biz_request_id,omitempty" require:"true"`
	// 子渠道渠道编码，需要同步蚂蚁，由蚂蚁设置。如果是银行本身，可不填 备注：如果同一信贷客户在不同银行的调用需要严格区分，分别授权
	SubTenant *string `json:"sub_tenant,omitempty" xml:"sub_tenant,omitempty" require:"true"`
	// 扩展信息
	ExtendInfo *RiskEvaluationExtendInfoRequest `json:"extend_info,omitempty" xml:"extend_info,omitempty" require:"true"`
	// 查询模式，SINGLE_CITY 查到第一个城市就结束，ALL_CITY 查询所有城市，默认ALL_CITY
	SearchModel *string `json:"search_model,omitempty" xml:"search_model,omitempty"`
}

func (s StartBlockchainTaxRiskEvaluationRequest) String() string {
	return tea.Prettify(s)
}

func (s StartBlockchainTaxRiskEvaluationRequest) GoString() string {
	return s.String()
}

func (s *StartBlockchainTaxRiskEvaluationRequest) SetAuthToken(v string) *StartBlockchainTaxRiskEvaluationRequest {
	s.AuthToken = &v
	return s
}

func (s *StartBlockchainTaxRiskEvaluationRequest) SetProductInstanceId(v string) *StartBlockchainTaxRiskEvaluationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartBlockchainTaxRiskEvaluationRequest) SetIdentityId(v string) *StartBlockchainTaxRiskEvaluationRequest {
	s.IdentityId = &v
	return s
}

func (s *StartBlockchainTaxRiskEvaluationRequest) SetIdentityName(v string) *StartBlockchainTaxRiskEvaluationRequest {
	s.IdentityName = &v
	return s
}

func (s *StartBlockchainTaxRiskEvaluationRequest) SetEnterpriseId(v string) *StartBlockchainTaxRiskEvaluationRequest {
	s.EnterpriseId = &v
	return s
}

func (s *StartBlockchainTaxRiskEvaluationRequest) SetEnterpriseName(v string) *StartBlockchainTaxRiskEvaluationRequest {
	s.EnterpriseName = &v
	return s
}

func (s *StartBlockchainTaxRiskEvaluationRequest) SetIdentityType(v string) *StartBlockchainTaxRiskEvaluationRequest {
	s.IdentityType = &v
	return s
}

func (s *StartBlockchainTaxRiskEvaluationRequest) SetAuthType(v string) *StartBlockchainTaxRiskEvaluationRequest {
	s.AuthType = &v
	return s
}

func (s *StartBlockchainTaxRiskEvaluationRequest) SetOrderNo(v string) *StartBlockchainTaxRiskEvaluationRequest {
	s.OrderNo = &v
	return s
}

func (s *StartBlockchainTaxRiskEvaluationRequest) SetBizRequestId(v string) *StartBlockchainTaxRiskEvaluationRequest {
	s.BizRequestId = &v
	return s
}

func (s *StartBlockchainTaxRiskEvaluationRequest) SetSubTenant(v string) *StartBlockchainTaxRiskEvaluationRequest {
	s.SubTenant = &v
	return s
}

func (s *StartBlockchainTaxRiskEvaluationRequest) SetExtendInfo(v *RiskEvaluationExtendInfoRequest) *StartBlockchainTaxRiskEvaluationRequest {
	s.ExtendInfo = v
	return s
}

func (s *StartBlockchainTaxRiskEvaluationRequest) SetSearchModel(v string) *StartBlockchainTaxRiskEvaluationRequest {
	s.SearchModel = &v
	return s
}

type StartBlockchainTaxRiskEvaluationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权订单订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 是否授权成功true是，false否
	AuthSuccess *string `json:"auth_success,omitempty" xml:"auth_success,omitempty"`
	// 过期时间，unix时间戳 毫秒
	ExpireTime *int64 `json:"expire_time,omitempty" xml:"expire_time,omitempty"`
	// 授权时间，unix时间戳 毫秒
	AuthTime *int64 `json:"auth_time,omitempty" xml:"auth_time,omitempty"`
	// 预测的常驻省份
	PredictProvCode *string `json:"predict_prov_code,omitempty" xml:"predict_prov_code,omitempty"`
}

func (s StartBlockchainTaxRiskEvaluationResponse) String() string {
	return tea.Prettify(s)
}

func (s StartBlockchainTaxRiskEvaluationResponse) GoString() string {
	return s.String()
}

func (s *StartBlockchainTaxRiskEvaluationResponse) SetReqMsgId(v string) *StartBlockchainTaxRiskEvaluationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartBlockchainTaxRiskEvaluationResponse) SetResultCode(v string) *StartBlockchainTaxRiskEvaluationResponse {
	s.ResultCode = &v
	return s
}

func (s *StartBlockchainTaxRiskEvaluationResponse) SetResultMsg(v string) *StartBlockchainTaxRiskEvaluationResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartBlockchainTaxRiskEvaluationResponse) SetOrderNo(v string) *StartBlockchainTaxRiskEvaluationResponse {
	s.OrderNo = &v
	return s
}

func (s *StartBlockchainTaxRiskEvaluationResponse) SetAuthSuccess(v string) *StartBlockchainTaxRiskEvaluationResponse {
	s.AuthSuccess = &v
	return s
}

func (s *StartBlockchainTaxRiskEvaluationResponse) SetExpireTime(v int64) *StartBlockchainTaxRiskEvaluationResponse {
	s.ExpireTime = &v
	return s
}

func (s *StartBlockchainTaxRiskEvaluationResponse) SetAuthTime(v int64) *StartBlockchainTaxRiskEvaluationResponse {
	s.AuthTime = &v
	return s
}

func (s *StartBlockchainTaxRiskEvaluationResponse) SetPredictProvCode(v string) *StartBlockchainTaxRiskEvaluationResponse {
	s.PredictProvCode = &v
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
				"_prod_code":       tea.String("ak_aafd16538edd4fc0ab50acd01355adb6"),
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
 * Description: 个人信息
 * Summary: 个人信息
 */
func (client *Client) ImportDataBccCompanyPerson(request *ImportDataBccCompanyPersonRequest) (_result *ImportDataBccCompanyPersonResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportDataBccCompanyPersonResponse{}
	_body, _err := client.ImportDataBccCompanyPersonEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人信息
 * Summary: 个人信息
 */
func (client *Client) ImportDataBccCompanyPersonEx(request *ImportDataBccCompanyPersonRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportDataBccCompanyPersonResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportDataBccCompanyPersonResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("data.bcc.company.person.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 授权接口
 * Summary: 授权接口
 */
func (client *Client) AuthBlockchainTaxRiskEvaluation(request *AuthBlockchainTaxRiskEvaluationRequest) (_result *AuthBlockchainTaxRiskEvaluationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthBlockchainTaxRiskEvaluationResponse{}
	_body, _err := client.AuthBlockchainTaxRiskEvaluationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 授权接口
 * Summary: 授权接口
 */
func (client *Client) AuthBlockchainTaxRiskEvaluationEx(request *AuthBlockchainTaxRiskEvaluationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthBlockchainTaxRiskEvaluationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthBlockchainTaxRiskEvaluationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.risk.evaluation.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询
 * Summary: 查询
 */
func (client *Client) QueryBlockchainTaxRiskEvaluation(request *QueryBlockchainTaxRiskEvaluationRequest) (_result *QueryBlockchainTaxRiskEvaluationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBlockchainTaxRiskEvaluationResponse{}
	_body, _err := client.QueryBlockchainTaxRiskEvaluationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询
 * Summary: 查询
 */
func (client *Client) QueryBlockchainTaxRiskEvaluationEx(request *QueryBlockchainTaxRiskEvaluationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBlockchainTaxRiskEvaluationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBlockchainTaxRiskEvaluationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.risk.evaluation.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询-同步返回提额数据
 * Summary: 查询-同步提额数据返回
 */
func (client *Client) SyncBlockchainTaxRiskEvaluation(request *SyncBlockchainTaxRiskEvaluationRequest) (_result *SyncBlockchainTaxRiskEvaluationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncBlockchainTaxRiskEvaluationResponse{}
	_body, _err := client.SyncBlockchainTaxRiskEvaluationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询-同步返回提额数据
 * Summary: 查询-同步提额数据返回
 */
func (client *Client) SyncBlockchainTaxRiskEvaluationEx(request *SyncBlockchainTaxRiskEvaluationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncBlockchainTaxRiskEvaluationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncBlockchainTaxRiskEvaluationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.risk.evaluation.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提额资质评估授权并查询,支持省级查询
 * Summary: 提额资质评估授权并查询
 */
func (client *Client) StartBlockchainTaxRiskEvaluation(request *StartBlockchainTaxRiskEvaluationRequest) (_result *StartBlockchainTaxRiskEvaluationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartBlockchainTaxRiskEvaluationResponse{}
	_body, _err := client.StartBlockchainTaxRiskEvaluationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提额资质评估授权并查询,支持省级查询
 * Summary: 提额资质评估授权并查询
 */
func (client *Client) StartBlockchainTaxRiskEvaluationEx(request *StartBlockchainTaxRiskEvaluationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartBlockchainTaxRiskEvaluationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartBlockchainTaxRiskEvaluationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.risk.evaluation.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
