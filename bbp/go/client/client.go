// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/service"
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

// 键值对，兼容map用
type NameValuePair struct {
	// 键名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 键值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s NameValuePair) String() string {
	return tea.Prettify(s)
}

func (s NameValuePair) GoString() string {
	return s.String()
}

func (s *NameValuePair) SetName(v string) *NameValuePair {
	s.Name = &v
	return s
}

func (s *NameValuePair) SetValue(v string) *NameValuePair {
	s.Value = &v
	return s
}

// 授权列表键值对
type AuthorizeRecordsPairs struct {
	// 授权业务
	AuthBusinessCode *string `json:"auth_business_code,omitempty" xml:"auth_business_code,omitempty" require:"true"`
	// 授权密钥
	AuthBusinessSecret *string `json:"auth_business_secret,omitempty" xml:"auth_business_secret,omitempty" require:"true"`
}

func (s AuthorizeRecordsPairs) String() string {
	return tea.Prettify(s)
}

func (s AuthorizeRecordsPairs) GoString() string {
	return s.String()
}

func (s *AuthorizeRecordsPairs) SetAuthBusinessCode(v string) *AuthorizeRecordsPairs {
	s.AuthBusinessCode = &v
	return s
}

func (s *AuthorizeRecordsPairs) SetAuthBusinessSecret(v string) *AuthorizeRecordsPairs {
	s.AuthBusinessSecret = &v
	return s
}

// 核身产品
type GwValidateProduct struct {
	// 核审产品码，支持多种核身产品。
	// ZK_FACE_VERIFY：人脸识别
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 产品渲染方式：H5、NATIVE 或 PC
	Group *string `json:"group,omitempty" xml:"group,omitempty" require:"true"`
	// 核身产品参数，因网关限制，暂只支持Map<String,String>
	ProductParams []*NameValuePair `json:"product_params,omitempty" xml:"product_params,omitempty" type:"Repeated"`
}

func (s GwValidateProduct) String() string {
	return tea.Prettify(s)
}

func (s GwValidateProduct) GoString() string {
	return s.String()
}

func (s *GwValidateProduct) SetProductCode(v string) *GwValidateProduct {
	s.ProductCode = &v
	return s
}

func (s *GwValidateProduct) SetGroup(v string) *GwValidateProduct {
	s.Group = &v
	return s
}

func (s *GwValidateProduct) SetProductParams(v []*NameValuePair) *GwValidateProduct {
	s.ProductParams = v
	return s
}

// 规则明细
type RuleDetail struct {
	// 项目类别
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 领域
	FieId *string `json:"fie_id,omitempty" xml:"fie_id,omitempty" require:"true"`
	// 级别
	Level *string `json:"level,omitempty" xml:"level,omitempty" require:"true"`
	// 资质
	Qualifications *string `json:"qualifications,omitempty" xml:"qualifications,omitempty" require:"true"`
	// 保定报价
	PriceBd *int64 `json:"price_bd,omitempty" xml:"price_bd,omitempty" require:"true"`
	// 离岸价格
	FobPrice *int64 `json:"fob_price,omitempty" xml:"fob_price,omitempty" require:"true"`
	// 离岸价格
	PriceTj *int64 `json:"price_tj,omitempty" xml:"price_tj,omitempty" require:"true"`
	// 北京报价
	PriceBj *int64 `json:"price_bj,omitempty" xml:"price_bj,omitempty" require:"true"`
	// 最少提供人数
	Numpeople *int64 `json:"numpeople,omitempty" xml:"numpeople,omitempty" require:"true"`
}

func (s RuleDetail) String() string {
	return tea.Prettify(s)
}

func (s RuleDetail) GoString() string {
	return s.String()
}

func (s *RuleDetail) SetType(v string) *RuleDetail {
	s.Type = &v
	return s
}

func (s *RuleDetail) SetFieId(v string) *RuleDetail {
	s.FieId = &v
	return s
}

func (s *RuleDetail) SetLevel(v string) *RuleDetail {
	s.Level = &v
	return s
}

func (s *RuleDetail) SetQualifications(v string) *RuleDetail {
	s.Qualifications = &v
	return s
}

func (s *RuleDetail) SetPriceBd(v int64) *RuleDetail {
	s.PriceBd = &v
	return s
}

func (s *RuleDetail) SetFobPrice(v int64) *RuleDetail {
	s.FobPrice = &v
	return s
}

func (s *RuleDetail) SetPriceTj(v int64) *RuleDetail {
	s.PriceTj = &v
	return s
}

func (s *RuleDetail) SetPriceBj(v int64) *RuleDetail {
	s.PriceBj = &v
	return s
}

func (s *RuleDetail) SetNumpeople(v int64) *RuleDetail {
	s.Numpeople = &v
	return s
}

// 对账单
type Reconciliation struct {
	// 供应商
	SupCode *string `json:"sup_code,omitempty" xml:"sup_code,omitempty" require:"true"`
	// 供应商名称
	SupName *string `json:"sup_name,omitempty" xml:"sup_name,omitempty" require:"true"`
	// 结算金额(单位分)
	SettlementAmount *int64 `json:"settlement_amount,omitempty" xml:"settlement_amount,omitempty" require:"true"`
	// 长城确认时间
	ConfirmDateGw *string `json:"confirm_date_gw,omitempty" xml:"confirm_date_gw,omitempty" require:"true"`
	// 长城方确认人
	ConfirmerGw *string `json:"confirmer_gw,omitempty" xml:"confirmer_gw,omitempty" require:"true"`
	// 长城确认状态
	ConfirmStateGw *string `json:"confirm_state_gw,omitempty" xml:"confirm_state_gw,omitempty" require:"true"`
	// 服务方确认时间
	ConfirmDateSup *string `json:"confirm_date_sup,omitempty" xml:"confirm_date_sup,omitempty" require:"true"`
	// 服务方确认人
	ConfirmerSup *string `json:"confirmer_sup,omitempty" xml:"confirmer_sup,omitempty" require:"true"`
	// 服务方确认状态
	ConfirmStateSup *string `json:"confirm_state_sup,omitempty" xml:"confirm_state_sup,omitempty" require:"true"`
	// 计算时间
	SocreDate *string `json:"socre_date,omitempty" xml:"socre_date,omitempty" require:"true"`
}

func (s Reconciliation) String() string {
	return tea.Prettify(s)
}

func (s Reconciliation) GoString() string {
	return s.String()
}

func (s *Reconciliation) SetSupCode(v string) *Reconciliation {
	s.SupCode = &v
	return s
}

func (s *Reconciliation) SetSupName(v string) *Reconciliation {
	s.SupName = &v
	return s
}

func (s *Reconciliation) SetSettlementAmount(v int64) *Reconciliation {
	s.SettlementAmount = &v
	return s
}

func (s *Reconciliation) SetConfirmDateGw(v string) *Reconciliation {
	s.ConfirmDateGw = &v
	return s
}

func (s *Reconciliation) SetConfirmerGw(v string) *Reconciliation {
	s.ConfirmerGw = &v
	return s
}

func (s *Reconciliation) SetConfirmStateGw(v string) *Reconciliation {
	s.ConfirmStateGw = &v
	return s
}

func (s *Reconciliation) SetConfirmDateSup(v string) *Reconciliation {
	s.ConfirmDateSup = &v
	return s
}

func (s *Reconciliation) SetConfirmerSup(v string) *Reconciliation {
	s.ConfirmerSup = &v
	return s
}

func (s *Reconciliation) SetConfirmStateSup(v string) *Reconciliation {
	s.ConfirmStateSup = &v
	return s
}

func (s *Reconciliation) SetSocreDate(v string) *Reconciliation {
	s.SocreDate = &v
	return s
}

// 客户认证结果
type CustomerAuthResult struct {
	// 账户ID
	AccId *string `json:"acc_id,omitempty" xml:"acc_id,omitempty"`
	// 返回code 0:核验成功 1:企业信息有误 2:企业非正常营业
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 客户ID
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty"`
	// 客户did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 验证状态
	EnterpriseStatus *string `json:"enterprise_status,omitempty" xml:"enterprise_status,omitempty"`
	// 开业时间
	OpenTime *string `json:"open_time,omitempty" xml:"open_time,omitempty" require:"true"`
	// 认证结果，是否通过
	Pass *bool `json:"pass,omitempty" xml:"pass,omitempty" require:"true"`
	// 业务ID
	DisReqMsgId *string `json:"dis_req_msg_id,omitempty" xml:"dis_req_msg_id,omitempty"`
}

func (s CustomerAuthResult) String() string {
	return tea.Prettify(s)
}

func (s CustomerAuthResult) GoString() string {
	return s.String()
}

func (s *CustomerAuthResult) SetAccId(v string) *CustomerAuthResult {
	s.AccId = &v
	return s
}

func (s *CustomerAuthResult) SetCode(v string) *CustomerAuthResult {
	s.Code = &v
	return s
}

func (s *CustomerAuthResult) SetCustomerId(v string) *CustomerAuthResult {
	s.CustomerId = &v
	return s
}

func (s *CustomerAuthResult) SetDid(v string) *CustomerAuthResult {
	s.Did = &v
	return s
}

func (s *CustomerAuthResult) SetEnterpriseStatus(v string) *CustomerAuthResult {
	s.EnterpriseStatus = &v
	return s
}

func (s *CustomerAuthResult) SetOpenTime(v string) *CustomerAuthResult {
	s.OpenTime = &v
	return s
}

func (s *CustomerAuthResult) SetPass(v bool) *CustomerAuthResult {
	s.Pass = &v
	return s
}

func (s *CustomerAuthResult) SetDisReqMsgId(v string) *CustomerAuthResult {
	s.DisReqMsgId = &v
	return s
}

// 业务授权列表键值对
type BusinessRecordsPairs struct {
	// 业务编码
	BusinessCode *string `json:"business_code,omitempty" xml:"business_code,omitempty" require:"true"`
	// 业务公钥
	PublicKey *string `json:"public_key,omitempty" xml:"public_key,omitempty" require:"true"`
}

func (s BusinessRecordsPairs) String() string {
	return tea.Prettify(s)
}

func (s BusinessRecordsPairs) GoString() string {
	return s.String()
}

func (s *BusinessRecordsPairs) SetBusinessCode(v string) *BusinessRecordsPairs {
	s.BusinessCode = &v
	return s
}

func (s *BusinessRecordsPairs) SetPublicKey(v string) *BusinessRecordsPairs {
	s.PublicKey = &v
	return s
}

// 供应商
type SpProvider struct {
	// 供应商编号
	SupCode *string `json:"sup_code,omitempty" xml:"sup_code,omitempty" require:"true"`
	// 供应商名称
	SupName *string `json:"sup_name,omitempty" xml:"sup_name,omitempty" require:"true"`
	// 文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 文件code
	FileCode *string `json:"file_code,omitempty" xml:"file_code,omitempty" require:"true"`
	// hash的值
	HashCode *string `json:"hash_code,omitempty" xml:"hash_code,omitempty" require:"true"`
	// 开始时间
	StartDate *string `json:"start_date,omitempty" xml:"start_date,omitempty" require:"true"`
	// 结束日期
	ClosingDate *string `json:"closing_date,omitempty" xml:"closing_date,omitempty" require:"true"`
	// 文件路径
	FilePath *string `json:"file_path,omitempty" xml:"file_path,omitempty" require:"true"`
	// 2021-03-04 11:16:23
	CreateDate *string `json:"create_date,omitempty" xml:"create_date,omitempty" require:"true"`
	// 创建者
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty" require:"true"`
}

func (s SpProvider) String() string {
	return tea.Prettify(s)
}

func (s SpProvider) GoString() string {
	return s.String()
}

func (s *SpProvider) SetSupCode(v string) *SpProvider {
	s.SupCode = &v
	return s
}

func (s *SpProvider) SetSupName(v string) *SpProvider {
	s.SupName = &v
	return s
}

func (s *SpProvider) SetFileName(v string) *SpProvider {
	s.FileName = &v
	return s
}

func (s *SpProvider) SetFileCode(v string) *SpProvider {
	s.FileCode = &v
	return s
}

func (s *SpProvider) SetHashCode(v string) *SpProvider {
	s.HashCode = &v
	return s
}

func (s *SpProvider) SetStartDate(v string) *SpProvider {
	s.StartDate = &v
	return s
}

func (s *SpProvider) SetClosingDate(v string) *SpProvider {
	s.ClosingDate = &v
	return s
}

func (s *SpProvider) SetFilePath(v string) *SpProvider {
	s.FilePath = &v
	return s
}

func (s *SpProvider) SetCreateDate(v string) *SpProvider {
	s.CreateDate = &v
	return s
}

func (s *SpProvider) SetCreator(v string) *SpProvider {
	s.Creator = &v
	return s
}

// 考核信息
type Assessment struct {
	// 供应商
	SupCode *string `json:"sup_code,omitempty" xml:"sup_code,omitempty" require:"true"`
	// 供应商B
	SupName *string `json:"sup_name,omitempty" xml:"sup_name,omitempty" require:"true"`
	// 员工号
	JobNumber *string `json:"job_number,omitempty" xml:"job_number,omitempty" require:"true"`
	// 员工姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 考核分数
	AssessmentNum *int64 `json:"assessment_num,omitempty" xml:"assessment_num,omitempty" require:"true"`
	// 级别
	Level *string `json:"level,omitempty" xml:"level,omitempty" require:"true"`
	// 创建时间
	CreateDate *string `json:"create_date,omitempty" xml:"create_date,omitempty" require:"true"`
	// 管理员
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty"`
	// 202103
	ScoreDate *string `json:"score_date,omitempty" xml:"score_date,omitempty" require:"true"`
	// 结果状态
	Resultstate *string `json:"resultstate,omitempty" xml:"resultstate,omitempty" require:"true"`
	// 工作地点
	Workplace *string `json:"workplace,omitempty" xml:"workplace,omitempty"`
	// 状态更新时间
	Resultdate *string `json:"resultdate,omitempty" xml:"resultdate,omitempty" require:"true"`
	// 确认人
	Resultby *string `json:"resultby,omitempty" xml:"resultby,omitempty" require:"true"`
	// 备注
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
}

func (s Assessment) String() string {
	return tea.Prettify(s)
}

func (s Assessment) GoString() string {
	return s.String()
}

func (s *Assessment) SetSupCode(v string) *Assessment {
	s.SupCode = &v
	return s
}

func (s *Assessment) SetSupName(v string) *Assessment {
	s.SupName = &v
	return s
}

func (s *Assessment) SetJobNumber(v string) *Assessment {
	s.JobNumber = &v
	return s
}

func (s *Assessment) SetName(v string) *Assessment {
	s.Name = &v
	return s
}

func (s *Assessment) SetAssessmentNum(v int64) *Assessment {
	s.AssessmentNum = &v
	return s
}

func (s *Assessment) SetLevel(v string) *Assessment {
	s.Level = &v
	return s
}

func (s *Assessment) SetCreateDate(v string) *Assessment {
	s.CreateDate = &v
	return s
}

func (s *Assessment) SetCreator(v string) *Assessment {
	s.Creator = &v
	return s
}

func (s *Assessment) SetScoreDate(v string) *Assessment {
	s.ScoreDate = &v
	return s
}

func (s *Assessment) SetResultstate(v string) *Assessment {
	s.Resultstate = &v
	return s
}

func (s *Assessment) SetWorkplace(v string) *Assessment {
	s.Workplace = &v
	return s
}

func (s *Assessment) SetResultdate(v string) *Assessment {
	s.Resultdate = &v
	return s
}

func (s *Assessment) SetResultby(v string) *Assessment {
	s.Resultby = &v
	return s
}

func (s *Assessment) SetRemark(v string) *Assessment {
	s.Remark = &v
	return s
}

// 查询功能所用集合
type QueryMap struct {
	// 查询枚举：QueryTypeEnum
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 查询参数
	Value []*NameValuePair `json:"value,omitempty" xml:"value,omitempty" type:"Repeated"`
}

func (s QueryMap) String() string {
	return tea.Prettify(s)
}

func (s QueryMap) GoString() string {
	return s.String()
}

func (s *QueryMap) SetName(v string) *QueryMap {
	s.Name = &v
	return s
}

func (s *QueryMap) SetValue(v []*NameValuePair) *QueryMap {
	s.Value = v
	return s
}

// 用户宠物保单信息模型
type InsuranceRecordModel struct {
	// 保司编码
	MechanismCode *string `json:"mechanism_code,omitempty" xml:"mechanism_code,omitempty" require:"true"`
	// 保单号
	PolicyNo *string `json:"policy_no,omitempty" xml:"policy_no,omitempty" require:"true"`
	// 保险产品SKU
	ThirdPartSku *string `json:"third_part_sku,omitempty" xml:"third_part_sku,omitempty"`
	// 保司机构名称
	MechanismName *string `json:"mechanism_name,omitempty" xml:"mechanism_name,omitempty"`
	// 保险类型
	InsuranceType *string `json:"insurance_type,omitempty" xml:"insurance_type,omitempty" require:"true"`
	// 用户ID，天猫uid
	SourceUid *string `json:"source_uid,omitempty" xml:"source_uid,omitempty" require:"true"`
	// 渠道来源 TIANMAO（天猫）
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 用户类型 PERSON
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty" require:"true"`
	// 扩展信息 （保单附件路径）
	Extend *string `json:"extend,omitempty" xml:"extend,omitempty"`
	// 保单生效时间
	PolicyEffectTime *string `json:"policy_effect_time,omitempty" xml:"policy_effect_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 保单失效时间
	PolicyInvalidTime *string `json:"policy_invalid_time,omitempty" xml:"policy_invalid_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 订单总金额 单位为分
	PolicyTotalAmount *int64 `json:"policy_total_amount,omitempty" xml:"policy_total_amount,omitempty" require:"true"`
	// 保费支付日期
	PolicyPayDate *string `json:"policy_pay_date,omitempty" xml:"policy_pay_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 保单支付总期数
	PolicyTotalStage *int64 `json:"policy_total_stage,omitempty" xml:"policy_total_stage,omitempty" require:"true"`
	// 每期支付金额
	PolicyStageAverAmount *int64 `json:"policy_stage_aver_amount,omitempty" xml:"policy_stage_aver_amount,omitempty"`
	// 保单已支付期数
	PolicyPaidStage *int64 `json:"policy_paid_stage,omitempty" xml:"policy_paid_stage,omitempty"`
	// 订单时间
	OrderTime *string `json:"order_time,omitempty" xml:"order_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 活动码 赠险/商业险
	ActivityCode *string `json:"activity_code,omitempty" xml:"activity_code,omitempty"`
	// 授权类型 0 非授权 1 授权
	AuthorizationType *int64 `json:"authorization_type,omitempty" xml:"authorization_type,omitempty" require:"true"`
}

func (s InsuranceRecordModel) String() string {
	return tea.Prettify(s)
}

func (s InsuranceRecordModel) GoString() string {
	return s.String()
}

func (s *InsuranceRecordModel) SetMechanismCode(v string) *InsuranceRecordModel {
	s.MechanismCode = &v
	return s
}

func (s *InsuranceRecordModel) SetPolicyNo(v string) *InsuranceRecordModel {
	s.PolicyNo = &v
	return s
}

func (s *InsuranceRecordModel) SetThirdPartSku(v string) *InsuranceRecordModel {
	s.ThirdPartSku = &v
	return s
}

func (s *InsuranceRecordModel) SetMechanismName(v string) *InsuranceRecordModel {
	s.MechanismName = &v
	return s
}

func (s *InsuranceRecordModel) SetInsuranceType(v string) *InsuranceRecordModel {
	s.InsuranceType = &v
	return s
}

func (s *InsuranceRecordModel) SetSourceUid(v string) *InsuranceRecordModel {
	s.SourceUid = &v
	return s
}

func (s *InsuranceRecordModel) SetSource(v string) *InsuranceRecordModel {
	s.Source = &v
	return s
}

func (s *InsuranceRecordModel) SetUserType(v string) *InsuranceRecordModel {
	s.UserType = &v
	return s
}

func (s *InsuranceRecordModel) SetExtend(v string) *InsuranceRecordModel {
	s.Extend = &v
	return s
}

func (s *InsuranceRecordModel) SetPolicyEffectTime(v string) *InsuranceRecordModel {
	s.PolicyEffectTime = &v
	return s
}

func (s *InsuranceRecordModel) SetPolicyInvalidTime(v string) *InsuranceRecordModel {
	s.PolicyInvalidTime = &v
	return s
}

func (s *InsuranceRecordModel) SetPolicyTotalAmount(v int64) *InsuranceRecordModel {
	s.PolicyTotalAmount = &v
	return s
}

func (s *InsuranceRecordModel) SetPolicyPayDate(v string) *InsuranceRecordModel {
	s.PolicyPayDate = &v
	return s
}

func (s *InsuranceRecordModel) SetPolicyTotalStage(v int64) *InsuranceRecordModel {
	s.PolicyTotalStage = &v
	return s
}

func (s *InsuranceRecordModel) SetPolicyStageAverAmount(v int64) *InsuranceRecordModel {
	s.PolicyStageAverAmount = &v
	return s
}

func (s *InsuranceRecordModel) SetPolicyPaidStage(v int64) *InsuranceRecordModel {
	s.PolicyPaidStage = &v
	return s
}

func (s *InsuranceRecordModel) SetOrderTime(v string) *InsuranceRecordModel {
	s.OrderTime = &v
	return s
}

func (s *InsuranceRecordModel) SetActivityCode(v string) *InsuranceRecordModel {
	s.ActivityCode = &v
	return s
}

func (s *InsuranceRecordModel) SetAuthorizationType(v int64) *InsuranceRecordModel {
	s.AuthorizationType = &v
	return s
}

// 考勤信息
type Attendance struct {
	// 供应商编码
	SupCode *string `json:"sup_code,omitempty" xml:"sup_code,omitempty" require:"true"`
	// 供应商A
	SupName *string `json:"sup_name,omitempty" xml:"sup_name,omitempty"`
	// 员工编号
	JobNumber *string `json:"job_number,omitempty" xml:"job_number,omitempty" require:"true"`
	// 名字
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 考勤信息
	AttendanceNum *int64 `json:"attendance_num,omitempty" xml:"attendance_num,omitempty" require:"true"`
	// 级别
	Level *string `json:"level,omitempty" xml:"level,omitempty"`
	// 创建时间
	CreateDate *string `json:"create_date,omitempty" xml:"create_date,omitempty" require:"true"`
	// 创建者
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty"`
	// 时间
	ScoreDate *string `json:"score_date,omitempty" xml:"score_date,omitempty" require:"true"`
	// 结果状态
	Resultstate *string `json:"resultstate,omitempty" xml:"resultstate,omitempty"`
	// 工作地点
	Workplace *string `json:"workplace,omitempty" xml:"workplace,omitempty"`
	// 结果时间
	Resultdate *string `json:"resultdate,omitempty" xml:"resultdate,omitempty"`
	// 确认人
	Resultby *string `json:"resultby,omitempty" xml:"resultby,omitempty"`
	// 备注
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
}

func (s Attendance) String() string {
	return tea.Prettify(s)
}

func (s Attendance) GoString() string {
	return s.String()
}

func (s *Attendance) SetSupCode(v string) *Attendance {
	s.SupCode = &v
	return s
}

func (s *Attendance) SetSupName(v string) *Attendance {
	s.SupName = &v
	return s
}

func (s *Attendance) SetJobNumber(v string) *Attendance {
	s.JobNumber = &v
	return s
}

func (s *Attendance) SetName(v string) *Attendance {
	s.Name = &v
	return s
}

func (s *Attendance) SetAttendanceNum(v int64) *Attendance {
	s.AttendanceNum = &v
	return s
}

func (s *Attendance) SetLevel(v string) *Attendance {
	s.Level = &v
	return s
}

func (s *Attendance) SetCreateDate(v string) *Attendance {
	s.CreateDate = &v
	return s
}

func (s *Attendance) SetCreator(v string) *Attendance {
	s.Creator = &v
	return s
}

func (s *Attendance) SetScoreDate(v string) *Attendance {
	s.ScoreDate = &v
	return s
}

func (s *Attendance) SetResultstate(v string) *Attendance {
	s.Resultstate = &v
	return s
}

func (s *Attendance) SetWorkplace(v string) *Attendance {
	s.Workplace = &v
	return s
}

func (s *Attendance) SetResultdate(v string) *Attendance {
	s.Resultdate = &v
	return s
}

func (s *Attendance) SetResultby(v string) *Attendance {
	s.Resultby = &v
	return s
}

func (s *Attendance) SetRemark(v string) *Attendance {
	s.Remark = &v
	return s
}

// 核身渲染结果
type GwVerifyViewResult struct {
	// 核身上下文id
	VerifyId *string `json:"verify_id,omitempty" xml:"verify_id,omitempty" require:"true"`
	// 核审产品码，支持多种核身产品。 ZK_FACE_VERIFY：人脸识别
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 核身分组
	Group *string `json:"group,omitempty" xml:"group,omitempty" require:"true"`
	// 返回结果
	ResponseParams []*NameValuePair `json:"response_params,omitempty" xml:"response_params,omitempty" require:"true" type:"Repeated"`
	// 核身渲染是否调用成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 返回码
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 返回信息
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s GwVerifyViewResult) String() string {
	return tea.Prettify(s)
}

func (s GwVerifyViewResult) GoString() string {
	return s.String()
}

func (s *GwVerifyViewResult) SetVerifyId(v string) *GwVerifyViewResult {
	s.VerifyId = &v
	return s
}

func (s *GwVerifyViewResult) SetProductCode(v string) *GwVerifyViewResult {
	s.ProductCode = &v
	return s
}

func (s *GwVerifyViewResult) SetGroup(v string) *GwVerifyViewResult {
	s.Group = &v
	return s
}

func (s *GwVerifyViewResult) SetResponseParams(v []*NameValuePair) *GwVerifyViewResult {
	s.ResponseParams = v
	return s
}

func (s *GwVerifyViewResult) SetSuccess(v bool) *GwVerifyViewResult {
	s.Success = &v
	return s
}

func (s *GwVerifyViewResult) SetResultCode(v string) *GwVerifyViewResult {
	s.ResultCode = &v
	return s
}

func (s *GwVerifyViewResult) SetResultMsg(v string) *GwVerifyViewResult {
	s.ResultMsg = &v
	return s
}

// 核审场景
type GwVerifyScene struct {
	// 调用方系统名
	SystemName *string `json:"system_name,omitempty" xml:"system_name,omitempty" require:"true"`
	// 业务方产品
	BizProduct *string `json:"biz_product,omitempty" xml:"biz_product,omitempty" require:"true"`
	// 业务产品节点
	BizProdNode *string `json:"biz_prod_node,omitempty" xml:"biz_prod_node,omitempty" require:"true"`
	// 业务接入渠道
	AccessChannel *string `json:"access_channel,omitempty" xml:"access_channel,omitempty" require:"true"`
	// 业务调用场景的语言版本、CHINESE("中文", "chi")、ENG("英文", "en")
	Language *string `json:"language,omitempty" xml:"language,omitempty" require:"true"`
}

func (s GwVerifyScene) String() string {
	return tea.Prettify(s)
}

func (s GwVerifyScene) GoString() string {
	return s.String()
}

func (s *GwVerifyScene) SetSystemName(v string) *GwVerifyScene {
	s.SystemName = &v
	return s
}

func (s *GwVerifyScene) SetBizProduct(v string) *GwVerifyScene {
	s.BizProduct = &v
	return s
}

func (s *GwVerifyScene) SetBizProdNode(v string) *GwVerifyScene {
	s.BizProdNode = &v
	return s
}

func (s *GwVerifyScene) SetAccessChannel(v string) *GwVerifyScene {
	s.AccessChannel = &v
	return s
}

func (s *GwVerifyScene) SetLanguage(v string) *GwVerifyScene {
	s.Language = &v
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

type AuthCustomerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 预留业务code
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty" require:"true"`
	// 企业证件号码
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
	// 企业证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
	EpCertNoType *string `json:"ep_cert_no_type,omitempty" xml:"ep_cert_no_type,omitempty" require:"true"`
	// 法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
	// 法人证件号码
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
	// 法人证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
	//
	LegalPersonCertNoType *string `json:"legal_person_cert_no_type,omitempty" xml:"legal_person_cert_no_type,omitempty"`
	// 系统名称
	OwnerName *string `json:"owner_name,omitempty" xml:"owner_name,omitempty"`
	// 系统租户ID
	OwnerUid *string `json:"owner_uid,omitempty" xml:"owner_uid,omitempty"`
	// 业务唯一ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 业务渠道，需提前申请产品码
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
	// 认证类型：ENTERPRISE-企业, PERSON-个人
	CertifyEnum *string `json:"certify_enum,omitempty" xml:"certify_enum,omitempty" require:"true"`
	// 客户支付宝ID，如有则填。
	AlipayUid *string `json:"alipay_uid,omitempty" xml:"alipay_uid,omitempty"`
	// 个人姓名，用于个人认证
	PersonName *string `json:"person_name,omitempty" xml:"person_name,omitempty"`
	// 个人证件号码
	PersonCertNo *string `json:"person_cert_no,omitempty" xml:"person_cert_no,omitempty"`
	// 个人证件类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
	PersonCertType *string `json:"person_cert_type,omitempty" xml:"person_cert_type,omitempty"`
	// 扩展信息
	ExtensionInfo []*NameValuePair `json:"extension_info,omitempty" xml:"extension_info,omitempty" type:"Repeated"`
}

func (s AuthCustomerRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthCustomerRequest) GoString() string {
	return s.String()
}

func (s *AuthCustomerRequest) SetAuthToken(v string) *AuthCustomerRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthCustomerRequest) SetProductInstanceId(v string) *AuthCustomerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthCustomerRequest) SetBizCode(v string) *AuthCustomerRequest {
	s.BizCode = &v
	return s
}

func (s *AuthCustomerRequest) SetEpCertName(v string) *AuthCustomerRequest {
	s.EpCertName = &v
	return s
}

func (s *AuthCustomerRequest) SetEpCertNo(v string) *AuthCustomerRequest {
	s.EpCertNo = &v
	return s
}

func (s *AuthCustomerRequest) SetEpCertNoType(v string) *AuthCustomerRequest {
	s.EpCertNoType = &v
	return s
}

func (s *AuthCustomerRequest) SetLegalPersonCertName(v string) *AuthCustomerRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *AuthCustomerRequest) SetLegalPersonCertNo(v string) *AuthCustomerRequest {
	s.LegalPersonCertNo = &v
	return s
}

func (s *AuthCustomerRequest) SetLegalPersonCertNoType(v string) *AuthCustomerRequest {
	s.LegalPersonCertNoType = &v
	return s
}

func (s *AuthCustomerRequest) SetOwnerName(v string) *AuthCustomerRequest {
	s.OwnerName = &v
	return s
}

func (s *AuthCustomerRequest) SetOwnerUid(v string) *AuthCustomerRequest {
	s.OwnerUid = &v
	return s
}

func (s *AuthCustomerRequest) SetBizId(v string) *AuthCustomerRequest {
	s.BizId = &v
	return s
}

func (s *AuthCustomerRequest) SetChannel(v string) *AuthCustomerRequest {
	s.Channel = &v
	return s
}

func (s *AuthCustomerRequest) SetCertifyEnum(v string) *AuthCustomerRequest {
	s.CertifyEnum = &v
	return s
}

func (s *AuthCustomerRequest) SetAlipayUid(v string) *AuthCustomerRequest {
	s.AlipayUid = &v
	return s
}

func (s *AuthCustomerRequest) SetPersonName(v string) *AuthCustomerRequest {
	s.PersonName = &v
	return s
}

func (s *AuthCustomerRequest) SetPersonCertNo(v string) *AuthCustomerRequest {
	s.PersonCertNo = &v
	return s
}

func (s *AuthCustomerRequest) SetPersonCertType(v string) *AuthCustomerRequest {
	s.PersonCertType = &v
	return s
}

func (s *AuthCustomerRequest) SetExtensionInfo(v []*NameValuePair) *AuthCustomerRequest {
	s.ExtensionInfo = v
	return s
}

type AuthCustomerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 客户认证结果
	Result *CustomerAuthResult `json:"result,omitempty" xml:"result,omitempty"`
}

func (s AuthCustomerResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthCustomerResponse) GoString() string {
	return s.String()
}

func (s *AuthCustomerResponse) SetReqMsgId(v string) *AuthCustomerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthCustomerResponse) SetResultCode(v string) *AuthCustomerResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthCustomerResponse) SetResultMsg(v string) *AuthCustomerResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthCustomerResponse) SetResult(v *CustomerAuthResult) *AuthCustomerResponse {
	s.Result = v
	return s
}

type CreateCustomerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务渠道，需提前申请产品码
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty" require:"true"`
	// 客户类型：ENTERPRISE-企业, PERSON-个人
	//
	CustomerType *string `json:"customer_type,omitempty" xml:"customer_type,omitempty" require:"true"`
	// 客户名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 客户证件号码，企业/个人均可
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 客户证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 法人姓名
	//
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
	// 法人证件号码
	//
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
	// 法人证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
	LegalPersonCertNoType *string `json:"legal_person_cert_no_type,omitempty" xml:"legal_person_cert_no_type,omitempty" require:"true"`
	// 是否需要先认证再注册，默认不认证。
	IsAuth *bool `json:"is_auth,omitempty" xml:"is_auth,omitempty" require:"true"`
	// 业务角色： 买方，卖方，机构，合作伙伴
	BusinessRole *string `json:"business_role,omitempty" xml:"business_role,omitempty"`
	// 客户支付宝ID，如有则填。
	AlipayUid *string `json:"alipay_uid,omitempty" xml:"alipay_uid,omitempty"`
}

func (s CreateCustomerRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateCustomerRequest) GoString() string {
	return s.String()
}

func (s *CreateCustomerRequest) SetAuthToken(v string) *CreateCustomerRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateCustomerRequest) SetProductInstanceId(v string) *CreateCustomerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateCustomerRequest) SetBizCode(v string) *CreateCustomerRequest {
	s.BizCode = &v
	return s
}

func (s *CreateCustomerRequest) SetCustomerType(v string) *CreateCustomerRequest {
	s.CustomerType = &v
	return s
}

func (s *CreateCustomerRequest) SetName(v string) *CreateCustomerRequest {
	s.Name = &v
	return s
}

func (s *CreateCustomerRequest) SetCertNo(v string) *CreateCustomerRequest {
	s.CertNo = &v
	return s
}

func (s *CreateCustomerRequest) SetCertType(v string) *CreateCustomerRequest {
	s.CertType = &v
	return s
}

func (s *CreateCustomerRequest) SetLegalPersonCertName(v string) *CreateCustomerRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *CreateCustomerRequest) SetLegalPersonCertNo(v string) *CreateCustomerRequest {
	s.LegalPersonCertNo = &v
	return s
}

func (s *CreateCustomerRequest) SetLegalPersonCertNoType(v string) *CreateCustomerRequest {
	s.LegalPersonCertNoType = &v
	return s
}

func (s *CreateCustomerRequest) SetIsAuth(v bool) *CreateCustomerRequest {
	s.IsAuth = &v
	return s
}

func (s *CreateCustomerRequest) SetBusinessRole(v string) *CreateCustomerRequest {
	s.BusinessRole = &v
	return s
}

func (s *CreateCustomerRequest) SetAlipayUid(v string) *CreateCustomerRequest {
	s.AlipayUid = &v
	return s
}

type CreateCustomerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 统一客户ID
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty"`
	// 统一账户ID
	AccId *string `json:"acc_id,omitempty" xml:"acc_id,omitempty"`
	// 客户认证结果
	AuthFourElementsResponse *CustomerAuthResult `json:"auth_four_elements_response,omitempty" xml:"auth_four_elements_response,omitempty"`
}

func (s CreateCustomerResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateCustomerResponse) GoString() string {
	return s.String()
}

func (s *CreateCustomerResponse) SetReqMsgId(v string) *CreateCustomerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateCustomerResponse) SetResultCode(v string) *CreateCustomerResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateCustomerResponse) SetResultMsg(v string) *CreateCustomerResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateCustomerResponse) SetCustomerId(v string) *CreateCustomerResponse {
	s.CustomerId = &v
	return s
}

func (s *CreateCustomerResponse) SetAccId(v string) *CreateCustomerResponse {
	s.AccId = &v
	return s
}

func (s *CreateCustomerResponse) SetAuthFourElementsResponse(v *CustomerAuthResult) *CreateCustomerResponse {
	s.AuthFourElementsResponse = v
	return s
}

type QueryCustomerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询内容
	ConditionMap []*QueryMap `json:"condition_map,omitempty" xml:"condition_map,omitempty" require:"true" type:"Repeated"`
}

func (s QueryCustomerRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCustomerRequest) GoString() string {
	return s.String()
}

func (s *QueryCustomerRequest) SetAuthToken(v string) *QueryCustomerRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCustomerRequest) SetProductInstanceId(v string) *QueryCustomerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCustomerRequest) SetConditionMap(v []*QueryMap) *QueryCustomerRequest {
	s.ConditionMap = v
	return s
}

type QueryCustomerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询结果
	Result []*NameValuePair `json:"result,omitempty" xml:"result,omitempty" type:"Repeated"`
}

func (s QueryCustomerResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCustomerResponse) GoString() string {
	return s.String()
}

func (s *QueryCustomerResponse) SetReqMsgId(v string) *QueryCustomerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCustomerResponse) SetResultCode(v string) *QueryCustomerResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCustomerResponse) SetResultMsg(v string) *QueryCustomerResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCustomerResponse) SetResult(v []*NameValuePair) *QueryCustomerResponse {
	s.Result = v
	return s
}

type InitVerifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 接入场景（主要由接入系统、接入产品、产品节点三部分组成）
	VerifyScene *GwVerifyScene `json:"verify_scene,omitempty" xml:"verify_scene,omitempty" require:"true"`
	// 调用方传入，唯一标识一笔业务，核身平台将bizId与核身token进行绑定，用作防串改校验
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 调用方传入，存放业务扩展参数（callback参数也写入此）
	ExternParams []*NameValuePair `json:"extern_params,omitempty" xml:"extern_params,omitempty" type:"Repeated"`
	// 调用方传入，指定核身完成后的回调类型
	CallbackEnum *string `json:"callback_enum,omitempty" xml:"callback_enum,omitempty"`
	// 核身产品列表
	ValidateFlows []*GwValidateProduct `json:"validate_flows,omitempty" xml:"validate_flows,omitempty" require:"true" type:"Repeated"`
}

func (s InitVerifyRequest) String() string {
	return tea.Prettify(s)
}

func (s InitVerifyRequest) GoString() string {
	return s.String()
}

func (s *InitVerifyRequest) SetAuthToken(v string) *InitVerifyRequest {
	s.AuthToken = &v
	return s
}

func (s *InitVerifyRequest) SetProductInstanceId(v string) *InitVerifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitVerifyRequest) SetVerifyScene(v *GwVerifyScene) *InitVerifyRequest {
	s.VerifyScene = v
	return s
}

func (s *InitVerifyRequest) SetBizId(v string) *InitVerifyRequest {
	s.BizId = &v
	return s
}

func (s *InitVerifyRequest) SetExternParams(v []*NameValuePair) *InitVerifyRequest {
	s.ExternParams = v
	return s
}

func (s *InitVerifyRequest) SetCallbackEnum(v string) *InitVerifyRequest {
	s.CallbackEnum = &v
	return s
}

func (s *InitVerifyRequest) SetValidateFlows(v []*GwValidateProduct) *InitVerifyRequest {
	s.ValidateFlows = v
	return s
}

type InitVerifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 核身id
	VerifyId *string `json:"verify_id,omitempty" xml:"verify_id,omitempty"`
	// 核身请求地址url
	VerifyUrl *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
	// 核身处理状态:INITIAL、PROCESSING、SUCCESS、EXPIRED、FAIL
	VerifyStatus *string `json:"verify_status,omitempty" xml:"verify_status,omitempty"`
	// 可用产品集合
	ValidProd []*GwValidateProduct `json:"valid_prod,omitempty" xml:"valid_prod,omitempty" type:"Repeated"`
}

func (s InitVerifyResponse) String() string {
	return tea.Prettify(s)
}

func (s InitVerifyResponse) GoString() string {
	return s.String()
}

func (s *InitVerifyResponse) SetReqMsgId(v string) *InitVerifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitVerifyResponse) SetResultCode(v string) *InitVerifyResponse {
	s.ResultCode = &v
	return s
}

func (s *InitVerifyResponse) SetResultMsg(v string) *InitVerifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitVerifyResponse) SetVerifyId(v string) *InitVerifyResponse {
	s.VerifyId = &v
	return s
}

func (s *InitVerifyResponse) SetVerifyUrl(v string) *InitVerifyResponse {
	s.VerifyUrl = &v
	return s
}

func (s *InitVerifyResponse) SetVerifyStatus(v string) *InitVerifyResponse {
	s.VerifyStatus = &v
	return s
}

func (s *InitVerifyResponse) SetValidProd(v []*GwValidateProduct) *InitVerifyResponse {
	s.ValidProd = v
	return s
}

type StartVerifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 核身上下文id
	VerifyId *string `json:"verify_id,omitempty" xml:"verify_id,omitempty" require:"true"`
	// 核身模块分组
	Group *string `json:"group,omitempty" xml:"group,omitempty" require:"true"`
	// 核身动作：view-渲染，verify-校验，repeat-重新发送
	ProductAction *string `json:"product_action,omitempty" xml:"product_action,omitempty" require:"true"`
	// 业务id
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
}

func (s StartVerifyRequest) String() string {
	return tea.Prettify(s)
}

func (s StartVerifyRequest) GoString() string {
	return s.String()
}

func (s *StartVerifyRequest) SetAuthToken(v string) *StartVerifyRequest {
	s.AuthToken = &v
	return s
}

func (s *StartVerifyRequest) SetProductInstanceId(v string) *StartVerifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartVerifyRequest) SetVerifyId(v string) *StartVerifyRequest {
	s.VerifyId = &v
	return s
}

func (s *StartVerifyRequest) SetGroup(v string) *StartVerifyRequest {
	s.Group = &v
	return s
}

func (s *StartVerifyRequest) SetProductAction(v string) *StartVerifyRequest {
	s.ProductAction = &v
	return s
}

func (s *StartVerifyRequest) SetBizId(v string) *StartVerifyRequest {
	s.BizId = &v
	return s
}

type StartVerifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 核身渲染结果
	Result []*GwVerifyViewResult `json:"result,omitempty" xml:"result,omitempty" type:"Repeated"`
}

func (s StartVerifyResponse) String() string {
	return tea.Prettify(s)
}

func (s StartVerifyResponse) GoString() string {
	return s.String()
}

func (s *StartVerifyResponse) SetReqMsgId(v string) *StartVerifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartVerifyResponse) SetResultCode(v string) *StartVerifyResponse {
	s.ResultCode = &v
	return s
}

func (s *StartVerifyResponse) SetResultMsg(v string) *StartVerifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartVerifyResponse) SetResult(v []*GwVerifyViewResult) *StartVerifyResponse {
	s.Result = v
	return s
}

type CheckVerifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 核身上下文id
	VerifyId *string `json:"verify_id,omitempty" xml:"verify_id,omitempty" require:"true"`
	// 核身模块分组
	Group *string `json:"group,omitempty" xml:"group,omitempty" require:"true"`
	// 核身动作：view-渲染，verify-校验，repeat-重新发送
	ProductAction *string `json:"product_action,omitempty" xml:"product_action,omitempty" require:"true"`
	// 业务id
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 核身产品码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
}

func (s CheckVerifyRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckVerifyRequest) GoString() string {
	return s.String()
}

func (s *CheckVerifyRequest) SetAuthToken(v string) *CheckVerifyRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckVerifyRequest) SetProductInstanceId(v string) *CheckVerifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckVerifyRequest) SetVerifyId(v string) *CheckVerifyRequest {
	s.VerifyId = &v
	return s
}

func (s *CheckVerifyRequest) SetGroup(v string) *CheckVerifyRequest {
	s.Group = &v
	return s
}

func (s *CheckVerifyRequest) SetProductAction(v string) *CheckVerifyRequest {
	s.ProductAction = &v
	return s
}

func (s *CheckVerifyRequest) SetBizId(v string) *CheckVerifyRequest {
	s.BizId = &v
	return s
}

func (s *CheckVerifyRequest) SetProductCode(v string) *CheckVerifyRequest {
	s.ProductCode = &v
	return s
}

type CheckVerifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 核身结果枚举：PASS-核身成功，INITIAL-初始化，PROCESS-处理中，FAIL-失败
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s CheckVerifyResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckVerifyResponse) GoString() string {
	return s.String()
}

func (s *CheckVerifyResponse) SetReqMsgId(v string) *CheckVerifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckVerifyResponse) SetResultCode(v string) *CheckVerifyResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckVerifyResponse) SetResultMsg(v string) *CheckVerifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckVerifyResponse) SetStatus(v string) *CheckVerifyResponse {
	s.Status = &v
	return s
}

type VerifyMetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 预留业务code
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty" require:"true"`
	// 企业证件号码
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
	// 企业证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
	EpCertNoType *string `json:"ep_cert_no_type,omitempty" xml:"ep_cert_no_type,omitempty" require:"true"`
	// 法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
	// 法人证件号码
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
	// 法人证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
	LegalPersonCertNoType *string `json:"legal_person_cert_no_type,omitempty" xml:"legal_person_cert_no_type,omitempty"`
	// 系统名称
	OwnerName *string `json:"owner_name,omitempty" xml:"owner_name,omitempty"`
	// 系统租户ID
	OwnerUid *string `json:"owner_uid,omitempty" xml:"owner_uid,omitempty"`
	// 业务唯一ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 业务渠道，需提前申请产品码
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
	// 认证类型：ENTERPRISE-企业, PERSON-个人
	CertifyEnum *string `json:"certify_enum,omitempty" xml:"certify_enum,omitempty" require:"true"`
	// 客户支付宝ID
	AlipayUid *string `json:"alipay_uid,omitempty" xml:"alipay_uid,omitempty"`
	// 个人姓名，用于个人认证
	PersonName *string `json:"person_name,omitempty" xml:"person_name,omitempty"`
	// 个人证件号码
	PersonCertNo *string `json:"person_cert_no,omitempty" xml:"person_cert_no,omitempty"`
	// 个人证件类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
	PersonCertType *string `json:"person_cert_type,omitempty" xml:"person_cert_type,omitempty"`
	// 扩展信息
	ExtensionInfo *NameValuePair `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
}

func (s VerifyMetaRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyMetaRequest) GoString() string {
	return s.String()
}

func (s *VerifyMetaRequest) SetAuthToken(v string) *VerifyMetaRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyMetaRequest) SetProductInstanceId(v string) *VerifyMetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyMetaRequest) SetBizCode(v string) *VerifyMetaRequest {
	s.BizCode = &v
	return s
}

func (s *VerifyMetaRequest) SetEpCertName(v string) *VerifyMetaRequest {
	s.EpCertName = &v
	return s
}

func (s *VerifyMetaRequest) SetEpCertNo(v string) *VerifyMetaRequest {
	s.EpCertNo = &v
	return s
}

func (s *VerifyMetaRequest) SetEpCertNoType(v string) *VerifyMetaRequest {
	s.EpCertNoType = &v
	return s
}

func (s *VerifyMetaRequest) SetLegalPersonCertName(v string) *VerifyMetaRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *VerifyMetaRequest) SetLegalPersonCertNo(v string) *VerifyMetaRequest {
	s.LegalPersonCertNo = &v
	return s
}

func (s *VerifyMetaRequest) SetLegalPersonCertNoType(v string) *VerifyMetaRequest {
	s.LegalPersonCertNoType = &v
	return s
}

func (s *VerifyMetaRequest) SetOwnerName(v string) *VerifyMetaRequest {
	s.OwnerName = &v
	return s
}

func (s *VerifyMetaRequest) SetOwnerUid(v string) *VerifyMetaRequest {
	s.OwnerUid = &v
	return s
}

func (s *VerifyMetaRequest) SetBizId(v string) *VerifyMetaRequest {
	s.BizId = &v
	return s
}

func (s *VerifyMetaRequest) SetChannel(v string) *VerifyMetaRequest {
	s.Channel = &v
	return s
}

func (s *VerifyMetaRequest) SetCertifyEnum(v string) *VerifyMetaRequest {
	s.CertifyEnum = &v
	return s
}

func (s *VerifyMetaRequest) SetAlipayUid(v string) *VerifyMetaRequest {
	s.AlipayUid = &v
	return s
}

func (s *VerifyMetaRequest) SetPersonName(v string) *VerifyMetaRequest {
	s.PersonName = &v
	return s
}

func (s *VerifyMetaRequest) SetPersonCertNo(v string) *VerifyMetaRequest {
	s.PersonCertNo = &v
	return s
}

func (s *VerifyMetaRequest) SetPersonCertType(v string) *VerifyMetaRequest {
	s.PersonCertType = &v
	return s
}

func (s *VerifyMetaRequest) SetExtensionInfo(v *NameValuePair) *VerifyMetaRequest {
	s.ExtensionInfo = v
	return s
}

type VerifyMetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 要素认证结果
	Result *CustomerAuthResult `json:"result,omitempty" xml:"result,omitempty"`
}

func (s VerifyMetaResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyMetaResponse) GoString() string {
	return s.String()
}

func (s *VerifyMetaResponse) SetReqMsgId(v string) *VerifyMetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyMetaResponse) SetResultCode(v string) *VerifyMetaResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyMetaResponse) SetResultMsg(v string) *VerifyMetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyMetaResponse) SetResult(v *CustomerAuthResult) *VerifyMetaResponse {
	s.Result = v
	return s
}

type QueryEnterpriseBusinessinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty" require:"true"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty" require:"true"`
	// 企业唯一编码
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
}

func (s QueryEnterpriseBusinessinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEnterpriseBusinessinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryEnterpriseBusinessinfoRequest) SetAuthToken(v string) *QueryEnterpriseBusinessinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEnterpriseBusinessinfoRequest) SetProductInstanceId(v string) *QueryEnterpriseBusinessinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEnterpriseBusinessinfoRequest) SetBizCode(v string) *QueryEnterpriseBusinessinfoRequest {
	s.BizCode = &v
	return s
}

func (s *QueryEnterpriseBusinessinfoRequest) SetEpCertName(v string) *QueryEnterpriseBusinessinfoRequest {
	s.EpCertName = &v
	return s
}

func (s *QueryEnterpriseBusinessinfoRequest) SetEpCertNo(v string) *QueryEnterpriseBusinessinfoRequest {
	s.EpCertNo = &v
	return s
}

type QueryEnterpriseBusinessinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签名之后的结果
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty"`
	// 国民经济行业代码
	IndustryCode *string `json:"industry_code,omitempty" xml:"industry_code,omitempty"`
	// 国民经济行业名称
	IndustryName *string `json:"industry_name,omitempty" xml:"industry_name,omitempty"`
	// 行业门类代码
	IndustryPhyCode *string `json:"industry_phy_code,omitempty" xml:"industry_phy_code,omitempty"`
	// 行业门类名称
	IndustryPhyName *string `json:"industry_phy_name,omitempty" xml:"industry_phy_name,omitempty"`
}

func (s QueryEnterpriseBusinessinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEnterpriseBusinessinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryEnterpriseBusinessinfoResponse) SetReqMsgId(v string) *QueryEnterpriseBusinessinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEnterpriseBusinessinfoResponse) SetResultCode(v string) *QueryEnterpriseBusinessinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEnterpriseBusinessinfoResponse) SetResultMsg(v string) *QueryEnterpriseBusinessinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEnterpriseBusinessinfoResponse) SetSignature(v string) *QueryEnterpriseBusinessinfoResponse {
	s.Signature = &v
	return s
}

func (s *QueryEnterpriseBusinessinfoResponse) SetIndustryCode(v string) *QueryEnterpriseBusinessinfoResponse {
	s.IndustryCode = &v
	return s
}

func (s *QueryEnterpriseBusinessinfoResponse) SetIndustryName(v string) *QueryEnterpriseBusinessinfoResponse {
	s.IndustryName = &v
	return s
}

func (s *QueryEnterpriseBusinessinfoResponse) SetIndustryPhyCode(v string) *QueryEnterpriseBusinessinfoResponse {
	s.IndustryPhyCode = &v
	return s
}

func (s *QueryEnterpriseBusinessinfoResponse) SetIndustryPhyName(v string) *QueryEnterpriseBusinessinfoResponse {
	s.IndustryPhyName = &v
	return s
}

type ApplyContractRuleRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 服务提供商
	SpProvider *SpProvider `json:"sp_provider,omitempty" xml:"sp_provider,omitempty" require:"true"`
	// 明细
	RuleDetails []*RuleDetail `json:"rule_details,omitempty" xml:"rule_details,omitempty" require:"true" type:"Repeated"`
	// confirmer
	Confirmer *string `json:"confirmer,omitempty" xml:"confirmer,omitempty" require:"true"`
	// 确认时间
	ConfirmDate *string `json:"confirm_date,omitempty" xml:"confirm_date,omitempty" require:"true"`
	// confirm_status
	ConfirmStatus *string `json:"confirm_status,omitempty" xml:"confirm_status,omitempty" require:"true"`
}

func (s ApplyContractRuleRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyContractRuleRequest) GoString() string {
	return s.String()
}

func (s *ApplyContractRuleRequest) SetAuthToken(v string) *ApplyContractRuleRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyContractRuleRequest) SetProductInstanceId(v string) *ApplyContractRuleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyContractRuleRequest) SetSpProvider(v *SpProvider) *ApplyContractRuleRequest {
	s.SpProvider = v
	return s
}

func (s *ApplyContractRuleRequest) SetRuleDetails(v []*RuleDetail) *ApplyContractRuleRequest {
	s.RuleDetails = v
	return s
}

func (s *ApplyContractRuleRequest) SetConfirmer(v string) *ApplyContractRuleRequest {
	s.Confirmer = &v
	return s
}

func (s *ApplyContractRuleRequest) SetConfirmDate(v string) *ApplyContractRuleRequest {
	s.ConfirmDate = &v
	return s
}

func (s *ApplyContractRuleRequest) SetConfirmStatus(v string) *ApplyContractRuleRequest {
	s.ConfirmStatus = &v
	return s
}

type ApplyContractRuleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ApplyContractRuleResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyContractRuleResponse) GoString() string {
	return s.String()
}

func (s *ApplyContractRuleResponse) SetReqMsgId(v string) *ApplyContractRuleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyContractRuleResponse) SetResultCode(v string) *ApplyContractRuleResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyContractRuleResponse) SetResultMsg(v string) *ApplyContractRuleResponse {
	s.ResultMsg = &v
	return s
}

type GetContractRuleRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 服务商code
	SupCode *string `json:"sup_code,omitempty" xml:"sup_code,omitempty" require:"true"`
}

func (s GetContractRuleRequest) String() string {
	return tea.Prettify(s)
}

func (s GetContractRuleRequest) GoString() string {
	return s.String()
}

func (s *GetContractRuleRequest) SetAuthToken(v string) *GetContractRuleRequest {
	s.AuthToken = &v
	return s
}

func (s *GetContractRuleRequest) SetProductInstanceId(v string) *GetContractRuleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetContractRuleRequest) SetSupCode(v string) *GetContractRuleRequest {
	s.SupCode = &v
	return s
}

type GetContractRuleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 服务商
	SpProvider *SpProvider `json:"sp_provider,omitempty" xml:"sp_provider,omitempty"`
	// 规则明细
	RuleDetails []*RuleDetail `json:"rule_details,omitempty" xml:"rule_details,omitempty" type:"Repeated"`
	// 确认人
	Confirmer *string `json:"confirmer,omitempty" xml:"confirmer,omitempty"`
	// 确认状态
	ConfirmStatus *string `json:"confirm_status,omitempty" xml:"confirm_status,omitempty"`
	// 确认时间
	ConfirmDate *string `json:"confirm_date,omitempty" xml:"confirm_date,omitempty"`
}

func (s GetContractRuleResponse) String() string {
	return tea.Prettify(s)
}

func (s GetContractRuleResponse) GoString() string {
	return s.String()
}

func (s *GetContractRuleResponse) SetReqMsgId(v string) *GetContractRuleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetContractRuleResponse) SetResultCode(v string) *GetContractRuleResponse {
	s.ResultCode = &v
	return s
}

func (s *GetContractRuleResponse) SetResultMsg(v string) *GetContractRuleResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetContractRuleResponse) SetSpProvider(v *SpProvider) *GetContractRuleResponse {
	s.SpProvider = v
	return s
}

func (s *GetContractRuleResponse) SetRuleDetails(v []*RuleDetail) *GetContractRuleResponse {
	s.RuleDetails = v
	return s
}

func (s *GetContractRuleResponse) SetConfirmer(v string) *GetContractRuleResponse {
	s.Confirmer = &v
	return s
}

func (s *GetContractRuleResponse) SetConfirmStatus(v string) *GetContractRuleResponse {
	s.ConfirmStatus = &v
	return s
}

func (s *GetContractRuleResponse) SetConfirmDate(v string) *GetContractRuleResponse {
	s.ConfirmDate = &v
	return s
}

type UploadStaffAttendanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 考勤信息
	Attendance *Attendance `json:"attendance,omitempty" xml:"attendance,omitempty" require:"true"`
	// uuid就行
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
}

func (s UploadStaffAttendanceRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadStaffAttendanceRequest) GoString() string {
	return s.String()
}

func (s *UploadStaffAttendanceRequest) SetAuthToken(v string) *UploadStaffAttendanceRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadStaffAttendanceRequest) SetProductInstanceId(v string) *UploadStaffAttendanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadStaffAttendanceRequest) SetAttendance(v *Attendance) *UploadStaffAttendanceRequest {
	s.Attendance = v
	return s
}

func (s *UploadStaffAttendanceRequest) SetBizId(v string) *UploadStaffAttendanceRequest {
	s.BizId = &v
	return s
}

type UploadStaffAttendanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UploadStaffAttendanceResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadStaffAttendanceResponse) GoString() string {
	return s.String()
}

func (s *UploadStaffAttendanceResponse) SetReqMsgId(v string) *UploadStaffAttendanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadStaffAttendanceResponse) SetResultCode(v string) *UploadStaffAttendanceResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadStaffAttendanceResponse) SetResultMsg(v string) *UploadStaffAttendanceResponse {
	s.ResultMsg = &v
	return s
}

type QueryStaffAttendanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 员工工号
	JobNumber *string `json:"job_number,omitempty" xml:"job_number,omitempty" require:"true"`
	// 考勤月份
	ScoreDates []*string `json:"score_dates,omitempty" xml:"score_dates,omitempty" require:"true" type:"Repeated"`
	// 供应商
	SupCode *string `json:"sup_code,omitempty" xml:"sup_code,omitempty" require:"true"`
}

func (s QueryStaffAttendanceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryStaffAttendanceRequest) GoString() string {
	return s.String()
}

func (s *QueryStaffAttendanceRequest) SetAuthToken(v string) *QueryStaffAttendanceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryStaffAttendanceRequest) SetProductInstanceId(v string) *QueryStaffAttendanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryStaffAttendanceRequest) SetJobNumber(v string) *QueryStaffAttendanceRequest {
	s.JobNumber = &v
	return s
}

func (s *QueryStaffAttendanceRequest) SetScoreDates(v []*string) *QueryStaffAttendanceRequest {
	s.ScoreDates = v
	return s
}

func (s *QueryStaffAttendanceRequest) SetSupCode(v string) *QueryStaffAttendanceRequest {
	s.SupCode = &v
	return s
}

type QueryStaffAttendanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 考勤信息查询
	Attendance []*Attendance `json:"attendance,omitempty" xml:"attendance,omitempty" type:"Repeated"`
}

func (s QueryStaffAttendanceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryStaffAttendanceResponse) GoString() string {
	return s.String()
}

func (s *QueryStaffAttendanceResponse) SetReqMsgId(v string) *QueryStaffAttendanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryStaffAttendanceResponse) SetResultCode(v string) *QueryStaffAttendanceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryStaffAttendanceResponse) SetResultMsg(v string) *QueryStaffAttendanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryStaffAttendanceResponse) SetAttendance(v []*Attendance) *QueryStaffAttendanceResponse {
	s.Attendance = v
	return s
}

type UploadStaffAssessmentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求时间
	TimeStamp *int64 `json:"time_stamp,omitempty" xml:"time_stamp,omitempty" require:"true"`
	// 考核信息
	Assessment *Assessment `json:"assessment,omitempty" xml:"assessment,omitempty" require:"true"`
}

func (s UploadStaffAssessmentRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadStaffAssessmentRequest) GoString() string {
	return s.String()
}

func (s *UploadStaffAssessmentRequest) SetAuthToken(v string) *UploadStaffAssessmentRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadStaffAssessmentRequest) SetProductInstanceId(v string) *UploadStaffAssessmentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadStaffAssessmentRequest) SetTimeStamp(v int64) *UploadStaffAssessmentRequest {
	s.TimeStamp = &v
	return s
}

func (s *UploadStaffAssessmentRequest) SetAssessment(v *Assessment) *UploadStaffAssessmentRequest {
	s.Assessment = v
	return s
}

type UploadStaffAssessmentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UploadStaffAssessmentResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadStaffAssessmentResponse) GoString() string {
	return s.String()
}

func (s *UploadStaffAssessmentResponse) SetReqMsgId(v string) *UploadStaffAssessmentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadStaffAssessmentResponse) SetResultCode(v string) *UploadStaffAssessmentResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadStaffAssessmentResponse) SetResultMsg(v string) *UploadStaffAssessmentResponse {
	s.ResultMsg = &v
	return s
}

type QueryStaffAssessmentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 员工工号
	JobNumber *string `json:"job_number,omitempty" xml:"job_number,omitempty" require:"true"`
	// 考核月份
	ScoreDates []*string `json:"score_dates,omitempty" xml:"score_dates,omitempty" require:"true" type:"Repeated"`
	// 供应商
	SupCode *string `json:"sup_code,omitempty" xml:"sup_code,omitempty" require:"true"`
}

func (s QueryStaffAssessmentRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryStaffAssessmentRequest) GoString() string {
	return s.String()
}

func (s *QueryStaffAssessmentRequest) SetAuthToken(v string) *QueryStaffAssessmentRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryStaffAssessmentRequest) SetProductInstanceId(v string) *QueryStaffAssessmentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryStaffAssessmentRequest) SetJobNumber(v string) *QueryStaffAssessmentRequest {
	s.JobNumber = &v
	return s
}

func (s *QueryStaffAssessmentRequest) SetScoreDates(v []*string) *QueryStaffAssessmentRequest {
	s.ScoreDates = v
	return s
}

func (s *QueryStaffAssessmentRequest) SetSupCode(v string) *QueryStaffAssessmentRequest {
	s.SupCode = &v
	return s
}

type QueryStaffAssessmentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 考核结果
	Assessments []*Assessment `json:"assessments,omitempty" xml:"assessments,omitempty" type:"Repeated"`
}

func (s QueryStaffAssessmentResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryStaffAssessmentResponse) GoString() string {
	return s.String()
}

func (s *QueryStaffAssessmentResponse) SetReqMsgId(v string) *QueryStaffAssessmentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryStaffAssessmentResponse) SetResultCode(v string) *QueryStaffAssessmentResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryStaffAssessmentResponse) SetResultMsg(v string) *QueryStaffAssessmentResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryStaffAssessmentResponse) SetAssessments(v []*Assessment) *QueryStaffAssessmentResponse {
	s.Assessments = v
	return s
}

type ExecContractReconciliationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 供应商
	SupCode *string `json:"sup_code,omitempty" xml:"sup_code,omitempty" require:"true"`
	// 结算时间
	ScoreDate *string `json:"score_date,omitempty" xml:"score_date,omitempty" require:"true"`
}

func (s ExecContractReconciliationRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecContractReconciliationRequest) GoString() string {
	return s.String()
}

func (s *ExecContractReconciliationRequest) SetAuthToken(v string) *ExecContractReconciliationRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecContractReconciliationRequest) SetProductInstanceId(v string) *ExecContractReconciliationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecContractReconciliationRequest) SetSupCode(v string) *ExecContractReconciliationRequest {
	s.SupCode = &v
	return s
}

func (s *ExecContractReconciliationRequest) SetScoreDate(v string) *ExecContractReconciliationRequest {
	s.ScoreDate = &v
	return s
}

type ExecContractReconciliationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结算单
	Reconciliation *Reconciliation `json:"reconciliation,omitempty" xml:"reconciliation,omitempty"`
}

func (s ExecContractReconciliationResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecContractReconciliationResponse) GoString() string {
	return s.String()
}

func (s *ExecContractReconciliationResponse) SetReqMsgId(v string) *ExecContractReconciliationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecContractReconciliationResponse) SetResultCode(v string) *ExecContractReconciliationResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecContractReconciliationResponse) SetResultMsg(v string) *ExecContractReconciliationResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecContractReconciliationResponse) SetReconciliation(v *Reconciliation) *ExecContractReconciliationResponse {
	s.Reconciliation = v
	return s
}

type ConfirmContractReconciliationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 服务商
	SupCode *string `json:"sup_code,omitempty" xml:"sup_code,omitempty" require:"true"`
	// 确认时间
	SocreDate *string `json:"socre_date,omitempty" xml:"socre_date,omitempty" require:"true"`
	// 确认类型：1、长城  2、服务方
	ConfirmType *string `json:"confirm_type,omitempty" xml:"confirm_type,omitempty" require:"true"`
	// 确认者
	Confirmer *string `json:"confirmer,omitempty" xml:"confirmer,omitempty" require:"true"`
	// 认证状态
	ConfirmStatus *string `json:"confirm_status,omitempty" xml:"confirm_status,omitempty" require:"true"`
}

func (s ConfirmContractReconciliationRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmContractReconciliationRequest) GoString() string {
	return s.String()
}

func (s *ConfirmContractReconciliationRequest) SetAuthToken(v string) *ConfirmContractReconciliationRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmContractReconciliationRequest) SetProductInstanceId(v string) *ConfirmContractReconciliationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ConfirmContractReconciliationRequest) SetSupCode(v string) *ConfirmContractReconciliationRequest {
	s.SupCode = &v
	return s
}

func (s *ConfirmContractReconciliationRequest) SetSocreDate(v string) *ConfirmContractReconciliationRequest {
	s.SocreDate = &v
	return s
}

func (s *ConfirmContractReconciliationRequest) SetConfirmType(v string) *ConfirmContractReconciliationRequest {
	s.ConfirmType = &v
	return s
}

func (s *ConfirmContractReconciliationRequest) SetConfirmer(v string) *ConfirmContractReconciliationRequest {
	s.Confirmer = &v
	return s
}

func (s *ConfirmContractReconciliationRequest) SetConfirmStatus(v string) *ConfirmContractReconciliationRequest {
	s.ConfirmStatus = &v
	return s
}

type ConfirmContractReconciliationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结算单
	Reconciliation *Reconciliation `json:"reconciliation,omitempty" xml:"reconciliation,omitempty"`
}

func (s ConfirmContractReconciliationResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmContractReconciliationResponse) GoString() string {
	return s.String()
}

func (s *ConfirmContractReconciliationResponse) SetReqMsgId(v string) *ConfirmContractReconciliationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmContractReconciliationResponse) SetResultCode(v string) *ConfirmContractReconciliationResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmContractReconciliationResponse) SetResultMsg(v string) *ConfirmContractReconciliationResponse {
	s.ResultMsg = &v
	return s
}

func (s *ConfirmContractReconciliationResponse) SetReconciliation(v *Reconciliation) *ConfirmContractReconciliationResponse {
	s.Reconciliation = v
	return s
}

type QueryContractReconciliationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 供应商code
	SupCode *string `json:"sup_code,omitempty" xml:"sup_code,omitempty" require:"true"`
	// 月份
	ScoreDates []*string `json:"score_dates,omitempty" xml:"score_dates,omitempty" require:"true" type:"Repeated"`
}

func (s QueryContractReconciliationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryContractReconciliationRequest) GoString() string {
	return s.String()
}

func (s *QueryContractReconciliationRequest) SetAuthToken(v string) *QueryContractReconciliationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryContractReconciliationRequest) SetProductInstanceId(v string) *QueryContractReconciliationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryContractReconciliationRequest) SetSupCode(v string) *QueryContractReconciliationRequest {
	s.SupCode = &v
	return s
}

func (s *QueryContractReconciliationRequest) SetScoreDates(v []*string) *QueryContractReconciliationRequest {
	s.ScoreDates = v
	return s
}

type QueryContractReconciliationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结算单
	Reconciliations []*Reconciliation `json:"reconciliations,omitempty" xml:"reconciliations,omitempty" type:"Repeated"`
}

func (s QueryContractReconciliationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryContractReconciliationResponse) GoString() string {
	return s.String()
}

func (s *QueryContractReconciliationResponse) SetReqMsgId(v string) *QueryContractReconciliationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryContractReconciliationResponse) SetResultCode(v string) *QueryContractReconciliationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryContractReconciliationResponse) SetResultMsg(v string) *QueryContractReconciliationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryContractReconciliationResponse) SetReconciliations(v []*Reconciliation) *QueryContractReconciliationResponse {
	s.Reconciliations = v
	return s
}

type VerifyCustomerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 支付宝uid
	AlipayUid *string `json:"alipay_uid,omitempty" xml:"alipay_uid,omitempty" require:"true"`
	// 个人名称
	PersonName *string `json:"person_name,omitempty" xml:"person_name,omitempty"`
	// 个人联系电话
	PersonPhone *string `json:"person_phone,omitempty" xml:"person_phone,omitempty"`
	// 核验证件号
	PersonCertNo *string `json:"person_cert_no,omitempty" xml:"person_cert_no,omitempty"`
	// 个人身份类型  RESIDENT（身份证）
	PersonCertType *string `json:"person_cert_type,omitempty" xml:"person_cert_type,omitempty"`
}

func (s VerifyCustomerRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyCustomerRequest) GoString() string {
	return s.String()
}

func (s *VerifyCustomerRequest) SetAuthToken(v string) *VerifyCustomerRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyCustomerRequest) SetProductInstanceId(v string) *VerifyCustomerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyCustomerRequest) SetBizCode(v string) *VerifyCustomerRequest {
	s.BizCode = &v
	return s
}

func (s *VerifyCustomerRequest) SetAlipayUid(v string) *VerifyCustomerRequest {
	s.AlipayUid = &v
	return s
}

func (s *VerifyCustomerRequest) SetPersonName(v string) *VerifyCustomerRequest {
	s.PersonName = &v
	return s
}

func (s *VerifyCustomerRequest) SetPersonPhone(v string) *VerifyCustomerRequest {
	s.PersonPhone = &v
	return s
}

func (s *VerifyCustomerRequest) SetPersonCertNo(v string) *VerifyCustomerRequest {
	s.PersonCertNo = &v
	return s
}

func (s *VerifyCustomerRequest) SetPersonCertType(v string) *VerifyCustomerRequest {
	s.PersonCertType = &v
	return s
}

type VerifyCustomerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户生成的did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s VerifyCustomerResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyCustomerResponse) GoString() string {
	return s.String()
}

func (s *VerifyCustomerResponse) SetReqMsgId(v string) *VerifyCustomerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyCustomerResponse) SetResultCode(v string) *VerifyCustomerResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyCustomerResponse) SetResultMsg(v string) *VerifyCustomerResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyCustomerResponse) SetDid(v string) *VerifyCustomerResponse {
	s.Did = &v
	return s
}

type MatchDidAccountRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码(YYX)
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty" require:"true"`
	// 支付宝uid
	Uid *string `json:"uid,omitempty" xml:"uid,omitempty" require:"true"`
	// 分布式id ，双向check
	Did *string `json:"did,omitempty" xml:"did,omitempty" require:"true"`
	// 链id
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 链账户
	ChainAccount *string `json:"chain_account,omitempty" xml:"chain_account,omitempty" require:"true"`
	// 托管情况下包含
	KmsKeyId *string `json:"kms_key_id,omitempty" xml:"kms_key_id,omitempty"`
}

func (s MatchDidAccountRequest) String() string {
	return tea.Prettify(s)
}

func (s MatchDidAccountRequest) GoString() string {
	return s.String()
}

func (s *MatchDidAccountRequest) SetAuthToken(v string) *MatchDidAccountRequest {
	s.AuthToken = &v
	return s
}

func (s *MatchDidAccountRequest) SetProductInstanceId(v string) *MatchDidAccountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *MatchDidAccountRequest) SetBizCode(v string) *MatchDidAccountRequest {
	s.BizCode = &v
	return s
}

func (s *MatchDidAccountRequest) SetUid(v string) *MatchDidAccountRequest {
	s.Uid = &v
	return s
}

func (s *MatchDidAccountRequest) SetDid(v string) *MatchDidAccountRequest {
	s.Did = &v
	return s
}

func (s *MatchDidAccountRequest) SetChainId(v string) *MatchDidAccountRequest {
	s.ChainId = &v
	return s
}

func (s *MatchDidAccountRequest) SetChainAccount(v string) *MatchDidAccountRequest {
	s.ChainAccount = &v
	return s
}

func (s *MatchDidAccountRequest) SetKmsKeyId(v string) *MatchDidAccountRequest {
	s.KmsKeyId = &v
	return s
}

type MatchDidAccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s MatchDidAccountResponse) String() string {
	return tea.Prettify(s)
}

func (s MatchDidAccountResponse) GoString() string {
	return s.String()
}

func (s *MatchDidAccountResponse) SetReqMsgId(v string) *MatchDidAccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *MatchDidAccountResponse) SetResultCode(v string) *MatchDidAccountResponse {
	s.ResultCode = &v
	return s
}

func (s *MatchDidAccountResponse) SetResultMsg(v string) *MatchDidAccountResponse {
	s.ResultMsg = &v
	return s
}

type MatchDidAssetsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码(YYX)
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty" require:"true"`
	// 支付宝uid
	Uid *string `json:"uid,omitempty" xml:"uid,omitempty" require:"true"`
	// 分布式id ，双向check
	Did *string `json:"did,omitempty" xml:"did,omitempty" require:"true"`
	// 链id
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 链账户
	ChainAccount *string `json:"chain_account,omitempty" xml:"chain_account,omitempty" require:"true"`
	// 链资产地址 HASH
	Contract *string `json:"contract,omitempty" xml:"contract,omitempty" require:"true"`
	// 合约类型 0-WASM
	ContractType *int64 `json:"contract_type,omitempty" xml:"contract_type,omitempty" require:"true"`
	// 资产类型
	AssertType *string `json:"assert_type,omitempty" xml:"assert_type,omitempty" require:"true"`
	// 上次资产发生变更的区块高度
	BlockNumber *string `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 上次资产发生变更的序号
	TxIndex *string `json:"tx_index,omitempty" xml:"tx_index,omitempty" require:"true"`
	// 上次资产发生变更的交易序列号
	LongIndex *string `json:"long_index,omitempty" xml:"long_index,omitempty" require:"true"`
	// 资产名称
	AssertName *string `json:"assert_name,omitempty" xml:"assert_name,omitempty" require:"true"`
	// 资产信息（资产描述信息）
	AssertData *string `json:"assert_data,omitempty" xml:"assert_data,omitempty" require:"true"`
	// 资产ID
	AssertId *string `json:"assert_id,omitempty" xml:"assert_id,omitempty" require:"true"`
}

func (s MatchDidAssetsRequest) String() string {
	return tea.Prettify(s)
}

func (s MatchDidAssetsRequest) GoString() string {
	return s.String()
}

func (s *MatchDidAssetsRequest) SetAuthToken(v string) *MatchDidAssetsRequest {
	s.AuthToken = &v
	return s
}

func (s *MatchDidAssetsRequest) SetProductInstanceId(v string) *MatchDidAssetsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *MatchDidAssetsRequest) SetBizCode(v string) *MatchDidAssetsRequest {
	s.BizCode = &v
	return s
}

func (s *MatchDidAssetsRequest) SetUid(v string) *MatchDidAssetsRequest {
	s.Uid = &v
	return s
}

func (s *MatchDidAssetsRequest) SetDid(v string) *MatchDidAssetsRequest {
	s.Did = &v
	return s
}

func (s *MatchDidAssetsRequest) SetChainId(v string) *MatchDidAssetsRequest {
	s.ChainId = &v
	return s
}

func (s *MatchDidAssetsRequest) SetChainAccount(v string) *MatchDidAssetsRequest {
	s.ChainAccount = &v
	return s
}

func (s *MatchDidAssetsRequest) SetContract(v string) *MatchDidAssetsRequest {
	s.Contract = &v
	return s
}

func (s *MatchDidAssetsRequest) SetContractType(v int64) *MatchDidAssetsRequest {
	s.ContractType = &v
	return s
}

func (s *MatchDidAssetsRequest) SetAssertType(v string) *MatchDidAssetsRequest {
	s.AssertType = &v
	return s
}

func (s *MatchDidAssetsRequest) SetBlockNumber(v string) *MatchDidAssetsRequest {
	s.BlockNumber = &v
	return s
}

func (s *MatchDidAssetsRequest) SetTxIndex(v string) *MatchDidAssetsRequest {
	s.TxIndex = &v
	return s
}

func (s *MatchDidAssetsRequest) SetLongIndex(v string) *MatchDidAssetsRequest {
	s.LongIndex = &v
	return s
}

func (s *MatchDidAssetsRequest) SetAssertName(v string) *MatchDidAssetsRequest {
	s.AssertName = &v
	return s
}

func (s *MatchDidAssetsRequest) SetAssertData(v string) *MatchDidAssetsRequest {
	s.AssertData = &v
	return s
}

func (s *MatchDidAssetsRequest) SetAssertId(v string) *MatchDidAssetsRequest {
	s.AssertId = &v
	return s
}

type MatchDidAssetsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 资产id
	AssertId *string `json:"assert_id,omitempty" xml:"assert_id,omitempty"`
}

func (s MatchDidAssetsResponse) String() string {
	return tea.Prettify(s)
}

func (s MatchDidAssetsResponse) GoString() string {
	return s.String()
}

func (s *MatchDidAssetsResponse) SetReqMsgId(v string) *MatchDidAssetsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *MatchDidAssetsResponse) SetResultCode(v string) *MatchDidAssetsResponse {
	s.ResultCode = &v
	return s
}

func (s *MatchDidAssetsResponse) SetResultMsg(v string) *MatchDidAssetsResponse {
	s.ResultMsg = &v
	return s
}

func (s *MatchDidAssetsResponse) SetAssertId(v string) *MatchDidAssetsResponse {
	s.AssertId = &v
	return s
}

type CreateDidCustomerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty" require:"true"`
	// 支付宝uid
	AlipayUid *string `json:"alipay_uid,omitempty" xml:"alipay_uid,omitempty" require:"true"`
	// 个人名称
	PersonName *string `json:"person_name,omitempty" xml:"person_name,omitempty"`
	// 个人联系电话
	PersonPhone *string `json:"person_phone,omitempty" xml:"person_phone,omitempty"`
	// 核验证件号
	PersonCertNo *string `json:"person_cert_no,omitempty" xml:"person_cert_no,omitempty"`
	// 个人身份类型
	PersonCertType *string `json:"person_cert_type,omitempty" xml:"person_cert_type,omitempty"`
}

func (s CreateDidCustomerRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDidCustomerRequest) GoString() string {
	return s.String()
}

func (s *CreateDidCustomerRequest) SetAuthToken(v string) *CreateDidCustomerRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDidCustomerRequest) SetProductInstanceId(v string) *CreateDidCustomerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDidCustomerRequest) SetBizCode(v string) *CreateDidCustomerRequest {
	s.BizCode = &v
	return s
}

func (s *CreateDidCustomerRequest) SetAlipayUid(v string) *CreateDidCustomerRequest {
	s.AlipayUid = &v
	return s
}

func (s *CreateDidCustomerRequest) SetPersonName(v string) *CreateDidCustomerRequest {
	s.PersonName = &v
	return s
}

func (s *CreateDidCustomerRequest) SetPersonPhone(v string) *CreateDidCustomerRequest {
	s.PersonPhone = &v
	return s
}

func (s *CreateDidCustomerRequest) SetPersonCertNo(v string) *CreateDidCustomerRequest {
	s.PersonCertNo = &v
	return s
}

func (s *CreateDidCustomerRequest) SetPersonCertType(v string) *CreateDidCustomerRequest {
	s.PersonCertType = &v
	return s
}

type CreateDidCustomerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户生成的did	用户的did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 用户昵称
	Nickname *string `json:"nickname,omitempty" xml:"nickname,omitempty"`
}

func (s CreateDidCustomerResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDidCustomerResponse) GoString() string {
	return s.String()
}

func (s *CreateDidCustomerResponse) SetReqMsgId(v string) *CreateDidCustomerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDidCustomerResponse) SetResultCode(v string) *CreateDidCustomerResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDidCustomerResponse) SetResultMsg(v string) *CreateDidCustomerResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDidCustomerResponse) SetDid(v string) *CreateDidCustomerResponse {
	s.Did = &v
	return s
}

func (s *CreateDidCustomerResponse) SetNickname(v string) *CreateDidCustomerResponse {
	s.Nickname = &v
	return s
}

type CreateDidEnterpriseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty" require:"true"`
	// 企业唯一编码
	EnterpriseCode *string `json:"enterprise_code,omitempty" xml:"enterprise_code,omitempty" require:"true"`
	// 企业名称
	EnterpriseName *string `json:"enterprise_name,omitempty" xml:"enterprise_name,omitempty"`
	// ORG_CERT 全国组织机构代码证书
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty"`
}

func (s CreateDidEnterpriseRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDidEnterpriseRequest) GoString() string {
	return s.String()
}

func (s *CreateDidEnterpriseRequest) SetAuthToken(v string) *CreateDidEnterpriseRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDidEnterpriseRequest) SetProductInstanceId(v string) *CreateDidEnterpriseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDidEnterpriseRequest) SetBizCode(v string) *CreateDidEnterpriseRequest {
	s.BizCode = &v
	return s
}

func (s *CreateDidEnterpriseRequest) SetEnterpriseCode(v string) *CreateDidEnterpriseRequest {
	s.EnterpriseCode = &v
	return s
}

func (s *CreateDidEnterpriseRequest) SetEnterpriseName(v string) *CreateDidEnterpriseRequest {
	s.EnterpriseName = &v
	return s
}

func (s *CreateDidEnterpriseRequest) SetCertType(v string) *CreateDidEnterpriseRequest {
	s.CertType = &v
	return s
}

type CreateDidEnterpriseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业用户生成的did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s CreateDidEnterpriseResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDidEnterpriseResponse) GoString() string {
	return s.String()
}

func (s *CreateDidEnterpriseResponse) SetReqMsgId(v string) *CreateDidEnterpriseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDidEnterpriseResponse) SetResultCode(v string) *CreateDidEnterpriseResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDidEnterpriseResponse) SetResultMsg(v string) *CreateDidEnterpriseResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDidEnterpriseResponse) SetDid(v string) *CreateDidEnterpriseResponse {
	s.Did = &v
	return s
}

type InitInsuranceUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 保司编码
	BusinessCode *string `json:"business_code,omitempty" xml:"business_code,omitempty" require:"true"`
	// 三方Id，此处为天猫id
	ThirdPartId *string `json:"third_part_id,omitempty" xml:"third_part_id,omitempty" require:"true"`
	// 来源渠道，TIANMAO（天猫）
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
	// 埋点信息，JSON格式字符串
	Burieds *string `json:"burieds,omitempty" xml:"burieds,omitempty"`
}

func (s InitInsuranceUserRequest) String() string {
	return tea.Prettify(s)
}

func (s InitInsuranceUserRequest) GoString() string {
	return s.String()
}

func (s *InitInsuranceUserRequest) SetAuthToken(v string) *InitInsuranceUserRequest {
	s.AuthToken = &v
	return s
}

func (s *InitInsuranceUserRequest) SetProductInstanceId(v string) *InitInsuranceUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitInsuranceUserRequest) SetBusinessCode(v string) *InitInsuranceUserRequest {
	s.BusinessCode = &v
	return s
}

func (s *InitInsuranceUserRequest) SetThirdPartId(v string) *InitInsuranceUserRequest {
	s.ThirdPartId = &v
	return s
}

func (s *InitInsuranceUserRequest) SetChannel(v string) *InitInsuranceUserRequest {
	s.Channel = &v
	return s
}

func (s *InitInsuranceUserRequest) SetBurieds(v string) *InitInsuranceUserRequest {
	s.Burieds = &v
	return s
}

type InitInsuranceUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s InitInsuranceUserResponse) String() string {
	return tea.Prettify(s)
}

func (s InitInsuranceUserResponse) GoString() string {
	return s.String()
}

func (s *InitInsuranceUserResponse) SetReqMsgId(v string) *InitInsuranceUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitInsuranceUserResponse) SetResultCode(v string) *InitInsuranceUserResponse {
	s.ResultCode = &v
	return s
}

func (s *InitInsuranceUserResponse) SetResultMsg(v string) *InitInsuranceUserResponse {
	s.ResultMsg = &v
	return s
}

type QueryInsuranceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 保司编码
	MechanismCode *string `json:"mechanism_code,omitempty" xml:"mechanism_code,omitempty" require:"true"`
}

func (s QueryInsuranceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInsuranceRequest) GoString() string {
	return s.String()
}

func (s *QueryInsuranceRequest) SetAuthToken(v string) *QueryInsuranceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInsuranceRequest) SetProductInstanceId(v string) *QueryInsuranceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInsuranceRequest) SetMechanismCode(v string) *QueryInsuranceRequest {
	s.MechanismCode = &v
	return s
}

type QueryInsuranceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务授权列表
	BusinessAuthorizeRecords []*BusinessRecordsPairs `json:"business_authorize_records,omitempty" xml:"business_authorize_records,omitempty" type:"Repeated"`
}

func (s QueryInsuranceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInsuranceResponse) GoString() string {
	return s.String()
}

func (s *QueryInsuranceResponse) SetReqMsgId(v string) *QueryInsuranceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInsuranceResponse) SetResultCode(v string) *QueryInsuranceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInsuranceResponse) SetResultMsg(v string) *QueryInsuranceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInsuranceResponse) SetBusinessAuthorizeRecords(v []*BusinessRecordsPairs) *QueryInsuranceResponse {
	s.BusinessAuthorizeRecords = v
	return s
}

type OperateInsuranceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 保司编码
	MechanismCode *string `json:"mechanism_code,omitempty" xml:"mechanism_code,omitempty"`
	// 保单加密信息
	PolicyEncryptionContext *string `json:"policy_encryption_context,omitempty" xml:"policy_encryption_context,omitempty"`
	// 保单号
	PolicyNo *string `json:"policy_no,omitempty" xml:"policy_no,omitempty"`
	// 保险产品SKU
	ThirdPartSku *string `json:"third_part_sku,omitempty" xml:"third_part_sku,omitempty"`
	// 保险公司名称
	MechanismName *string `json:"mechanism_name,omitempty" xml:"mechanism_name,omitempty"`
	// 保单种类，险种
	InsuranceType *string `json:"insurance_type,omitempty" xml:"insurance_type,omitempty" require:"true"`
	// 来源uid，此处指天猫id
	SourceUid *string `json:"source_uid,omitempty" xml:"source_uid,omitempty" require:"true"`
	// 订单来源
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
	// 投保人
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
	// 投保人类型  自然人/公司
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty"`
	// 投保人电话号码
	UserPhoneNumber *string `json:"user_phone_number,omitempty" xml:"user_phone_number,omitempty"`
	// 投保人证件号
	UserCertNo *string `json:"user_cert_no,omitempty" xml:"user_cert_no,omitempty"`
	// 拓展信息
	Extend *string `json:"extend,omitempty" xml:"extend,omitempty"`
	// 保单生效时间（毫秒值）
	PolicyEffectTime *int64 `json:"policy_effect_time,omitempty" xml:"policy_effect_time,omitempty"`
	// 保单失效时间（毫秒值）
	PolicyInvalidTime *int64 `json:"policy_invalid_time,omitempty" xml:"policy_invalid_time,omitempty"`
	// 订单总金额 整型，以分为单位，50000分 = 500.00元
	PolicyTotalAmount *int64 `json:"policy_total_amount,omitempty" xml:"policy_total_amount,omitempty"`
	// 订单总期数（一次性付款用1）
	PolicyTotalStage *int64 `json:"policy_total_stage,omitempty" xml:"policy_total_stage,omitempty"`
	// 保费支付日期（毫秒值）
	PolicyPayDate *int64 `json:"policy_pay_date,omitempty" xml:"policy_pay_date,omitempty"`
	// 已支付保费期数（1代表1期）
	PolicyPaidStage *int64 `json:"policy_paid_stage,omitempty" xml:"policy_paid_stage,omitempty"`
	// 每一期保费金额，整型，以分为单位，50000分 = 500.00元
	PolicyStageAverAmount *int64 `json:"policy_stage_aver_amount,omitempty" xml:"policy_stage_aver_amount,omitempty"`
	// 订单时间（毫秒值）
	OrderTime *int64 `json:"order_time,omitempty" xml:"order_time,omitempty"`
	// 操作类型
	// 下单 支付 理赔 退单
	Operation *string `json:"operation,omitempty" xml:"operation,omitempty"`
	// 授权列表
	AuthorizeRecords []*AuthorizeRecordsPairs `json:"authorize_records,omitempty" xml:"authorize_records,omitempty" type:"Repeated"`
	// 活动码/赠险码
	ActivityCode *string `json:"activity_code,omitempty" xml:"activity_code,omitempty"`
	// 授权类型 1-已授权 2-未授权
	AuthorizationType *int64 `json:"authorization_type,omitempty" xml:"authorization_type,omitempty" require:"true"`
}

func (s OperateInsuranceRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateInsuranceRequest) GoString() string {
	return s.String()
}

func (s *OperateInsuranceRequest) SetAuthToken(v string) *OperateInsuranceRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateInsuranceRequest) SetProductInstanceId(v string) *OperateInsuranceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateInsuranceRequest) SetMechanismCode(v string) *OperateInsuranceRequest {
	s.MechanismCode = &v
	return s
}

func (s *OperateInsuranceRequest) SetPolicyEncryptionContext(v string) *OperateInsuranceRequest {
	s.PolicyEncryptionContext = &v
	return s
}

func (s *OperateInsuranceRequest) SetPolicyNo(v string) *OperateInsuranceRequest {
	s.PolicyNo = &v
	return s
}

func (s *OperateInsuranceRequest) SetThirdPartSku(v string) *OperateInsuranceRequest {
	s.ThirdPartSku = &v
	return s
}

func (s *OperateInsuranceRequest) SetMechanismName(v string) *OperateInsuranceRequest {
	s.MechanismName = &v
	return s
}

func (s *OperateInsuranceRequest) SetInsuranceType(v string) *OperateInsuranceRequest {
	s.InsuranceType = &v
	return s
}

func (s *OperateInsuranceRequest) SetSourceUid(v string) *OperateInsuranceRequest {
	s.SourceUid = &v
	return s
}

func (s *OperateInsuranceRequest) SetSource(v string) *OperateInsuranceRequest {
	s.Source = &v
	return s
}

func (s *OperateInsuranceRequest) SetUserName(v string) *OperateInsuranceRequest {
	s.UserName = &v
	return s
}

func (s *OperateInsuranceRequest) SetUserType(v string) *OperateInsuranceRequest {
	s.UserType = &v
	return s
}

func (s *OperateInsuranceRequest) SetUserPhoneNumber(v string) *OperateInsuranceRequest {
	s.UserPhoneNumber = &v
	return s
}

func (s *OperateInsuranceRequest) SetUserCertNo(v string) *OperateInsuranceRequest {
	s.UserCertNo = &v
	return s
}

func (s *OperateInsuranceRequest) SetExtend(v string) *OperateInsuranceRequest {
	s.Extend = &v
	return s
}

func (s *OperateInsuranceRequest) SetPolicyEffectTime(v int64) *OperateInsuranceRequest {
	s.PolicyEffectTime = &v
	return s
}

func (s *OperateInsuranceRequest) SetPolicyInvalidTime(v int64) *OperateInsuranceRequest {
	s.PolicyInvalidTime = &v
	return s
}

func (s *OperateInsuranceRequest) SetPolicyTotalAmount(v int64) *OperateInsuranceRequest {
	s.PolicyTotalAmount = &v
	return s
}

func (s *OperateInsuranceRequest) SetPolicyTotalStage(v int64) *OperateInsuranceRequest {
	s.PolicyTotalStage = &v
	return s
}

func (s *OperateInsuranceRequest) SetPolicyPayDate(v int64) *OperateInsuranceRequest {
	s.PolicyPayDate = &v
	return s
}

func (s *OperateInsuranceRequest) SetPolicyPaidStage(v int64) *OperateInsuranceRequest {
	s.PolicyPaidStage = &v
	return s
}

func (s *OperateInsuranceRequest) SetPolicyStageAverAmount(v int64) *OperateInsuranceRequest {
	s.PolicyStageAverAmount = &v
	return s
}

func (s *OperateInsuranceRequest) SetOrderTime(v int64) *OperateInsuranceRequest {
	s.OrderTime = &v
	return s
}

func (s *OperateInsuranceRequest) SetOperation(v string) *OperateInsuranceRequest {
	s.Operation = &v
	return s
}

func (s *OperateInsuranceRequest) SetAuthorizeRecords(v []*AuthorizeRecordsPairs) *OperateInsuranceRequest {
	s.AuthorizeRecords = v
	return s
}

func (s *OperateInsuranceRequest) SetActivityCode(v string) *OperateInsuranceRequest {
	s.ActivityCode = &v
	return s
}

func (s *OperateInsuranceRequest) SetAuthorizationType(v int64) *OperateInsuranceRequest {
	s.AuthorizationType = &v
	return s
}

type OperateInsuranceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s OperateInsuranceResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateInsuranceResponse) GoString() string {
	return s.String()
}

func (s *OperateInsuranceResponse) SetReqMsgId(v string) *OperateInsuranceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateInsuranceResponse) SetResultCode(v string) *OperateInsuranceResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateInsuranceResponse) SetResultMsg(v string) *OperateInsuranceResponse {
	s.ResultMsg = &v
	return s
}

type UploadInsuranceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 保司编码
	MechanismCode *string `json:"mechanism_code,omitempty" xml:"mechanism_code,omitempty" require:"true"`
	// 附件信息
	//
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s UploadInsuranceRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadInsuranceRequest) GoString() string {
	return s.String()
}

func (s *UploadInsuranceRequest) SetAuthToken(v string) *UploadInsuranceRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadInsuranceRequest) SetProductInstanceId(v string) *UploadInsuranceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadInsuranceRequest) SetMechanismCode(v string) *UploadInsuranceRequest {
	s.MechanismCode = &v
	return s
}

func (s *UploadInsuranceRequest) SetFileObject(v io.Reader) *UploadInsuranceRequest {
	s.FileObject = v
	return s
}

func (s *UploadInsuranceRequest) SetFileObjectName(v string) *UploadInsuranceRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadInsuranceRequest) SetFileId(v string) *UploadInsuranceRequest {
	s.FileId = &v
	return s
}

type UploadInsuranceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件类型
	FileBizType *string `json:"file_biz_type,omitempty" xml:"file_biz_type,omitempty"`
	// 文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// 文件访问路径
	OssUrl *string `json:"oss_url,omitempty" xml:"oss_url,omitempty"`
}

func (s UploadInsuranceResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadInsuranceResponse) GoString() string {
	return s.String()
}

func (s *UploadInsuranceResponse) SetReqMsgId(v string) *UploadInsuranceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadInsuranceResponse) SetResultCode(v string) *UploadInsuranceResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadInsuranceResponse) SetResultMsg(v string) *UploadInsuranceResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadInsuranceResponse) SetFileBizType(v string) *UploadInsuranceResponse {
	s.FileBizType = &v
	return s
}

func (s *UploadInsuranceResponse) SetFileName(v string) *UploadInsuranceResponse {
	s.FileName = &v
	return s
}

func (s *UploadInsuranceResponse) SetOssUrl(v string) *UploadInsuranceResponse {
	s.OssUrl = &v
	return s
}

type SyncInsuranceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 保司编码
	MechanismCode *string `json:"mechanism_code,omitempty" xml:"mechanism_code,omitempty" require:"true"`
	// 理赔加密信息
	PolicyEncryptionContext *string `json:"policy_encryption_context,omitempty" xml:"policy_encryption_context,omitempty" require:"true"`
	// 保单号
	PolicyNo *string `json:"policy_no,omitempty" xml:"policy_no,omitempty" require:"true"`
	// 保险产品SKU
	ThirdPartSku *string `json:"third_part_sku,omitempty" xml:"third_part_sku,omitempty"`
	// 保司名称
	MechanismName *string `json:"mechanism_name,omitempty" xml:"mechanism_name,omitempty"`
	// 保单种类，险种
	InsuranceType *string `json:"insurance_type,omitempty" xml:"insurance_type,omitempty"`
	// 操作类型
	// 下单 支付 理赔 退单
	Operation *string `json:"operation,omitempty" xml:"operation,omitempty"`
	// 赔付单号
	ClaimOrderNo *string `json:"claim_order_no,omitempty" xml:"claim_order_no,omitempty" require:"true"`
	// 理赔申请时间（毫秒值）
	ClaimApplyTime *int64 `json:"claim_apply_time,omitempty" xml:"claim_apply_time,omitempty" require:"true"`
	// 理赔赔付时间（毫秒值）
	ClaimPayTime *int64 `json:"claim_pay_time,omitempty" xml:"claim_pay_time,omitempty" require:"true"`
	// 理赔申请金额，整型，以分为单位，50000分 = 500.00元
	ClaimApplyAmount *int64 `json:"claim_apply_amount,omitempty" xml:"claim_apply_amount,omitempty" require:"true"`
	// 理赔金额，整型，以分为单位，50000分 = 500.00元
	ClaimAmount *int64 `json:"claim_amount,omitempty" xml:"claim_amount,omitempty" require:"true"`
	// 授权列表
	AuthorizeRecords []*AuthorizeRecordsPairs `json:"authorize_records,omitempty" xml:"authorize_records,omitempty" type:"Repeated"`
}

func (s SyncInsuranceRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncInsuranceRequest) GoString() string {
	return s.String()
}

func (s *SyncInsuranceRequest) SetAuthToken(v string) *SyncInsuranceRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncInsuranceRequest) SetProductInstanceId(v string) *SyncInsuranceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncInsuranceRequest) SetMechanismCode(v string) *SyncInsuranceRequest {
	s.MechanismCode = &v
	return s
}

func (s *SyncInsuranceRequest) SetPolicyEncryptionContext(v string) *SyncInsuranceRequest {
	s.PolicyEncryptionContext = &v
	return s
}

func (s *SyncInsuranceRequest) SetPolicyNo(v string) *SyncInsuranceRequest {
	s.PolicyNo = &v
	return s
}

func (s *SyncInsuranceRequest) SetThirdPartSku(v string) *SyncInsuranceRequest {
	s.ThirdPartSku = &v
	return s
}

func (s *SyncInsuranceRequest) SetMechanismName(v string) *SyncInsuranceRequest {
	s.MechanismName = &v
	return s
}

func (s *SyncInsuranceRequest) SetInsuranceType(v string) *SyncInsuranceRequest {
	s.InsuranceType = &v
	return s
}

func (s *SyncInsuranceRequest) SetOperation(v string) *SyncInsuranceRequest {
	s.Operation = &v
	return s
}

func (s *SyncInsuranceRequest) SetClaimOrderNo(v string) *SyncInsuranceRequest {
	s.ClaimOrderNo = &v
	return s
}

func (s *SyncInsuranceRequest) SetClaimApplyTime(v int64) *SyncInsuranceRequest {
	s.ClaimApplyTime = &v
	return s
}

func (s *SyncInsuranceRequest) SetClaimPayTime(v int64) *SyncInsuranceRequest {
	s.ClaimPayTime = &v
	return s
}

func (s *SyncInsuranceRequest) SetClaimApplyAmount(v int64) *SyncInsuranceRequest {
	s.ClaimApplyAmount = &v
	return s
}

func (s *SyncInsuranceRequest) SetClaimAmount(v int64) *SyncInsuranceRequest {
	s.ClaimAmount = &v
	return s
}

func (s *SyncInsuranceRequest) SetAuthorizeRecords(v []*AuthorizeRecordsPairs) *SyncInsuranceRequest {
	s.AuthorizeRecords = v
	return s
}

type SyncInsuranceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SyncInsuranceResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncInsuranceResponse) GoString() string {
	return s.String()
}

func (s *SyncInsuranceResponse) SetReqMsgId(v string) *SyncInsuranceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncInsuranceResponse) SetResultCode(v string) *SyncInsuranceResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncInsuranceResponse) SetResultMsg(v string) *SyncInsuranceResponse {
	s.ResultMsg = &v
	return s
}

type CancelInsuranceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 原保单号
	PolicyNo *string `json:"policy_no,omitempty" xml:"policy_no,omitempty" require:"true"`
	// 保单终止日期 毫秒值
	PolicyEndTime *int64 `json:"policy_end_time,omitempty" xml:"policy_end_time,omitempty" require:"true"`
	// 退保原因
	ReasonForQuit *string `json:"reason_for_quit,omitempty" xml:"reason_for_quit,omitempty" require:"true"`
	// 退保保费金额，单位分
	QuitTotalAmount *int64 `json:"quit_total_amount,omitempty" xml:"quit_total_amount,omitempty" require:"true"`
	// 扩展信息
	Extend *string `json:"extend,omitempty" xml:"extend,omitempty"`
}

func (s CancelInsuranceRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelInsuranceRequest) GoString() string {
	return s.String()
}

func (s *CancelInsuranceRequest) SetAuthToken(v string) *CancelInsuranceRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelInsuranceRequest) SetProductInstanceId(v string) *CancelInsuranceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelInsuranceRequest) SetPolicyNo(v string) *CancelInsuranceRequest {
	s.PolicyNo = &v
	return s
}

func (s *CancelInsuranceRequest) SetPolicyEndTime(v int64) *CancelInsuranceRequest {
	s.PolicyEndTime = &v
	return s
}

func (s *CancelInsuranceRequest) SetReasonForQuit(v string) *CancelInsuranceRequest {
	s.ReasonForQuit = &v
	return s
}

func (s *CancelInsuranceRequest) SetQuitTotalAmount(v int64) *CancelInsuranceRequest {
	s.QuitTotalAmount = &v
	return s
}

func (s *CancelInsuranceRequest) SetExtend(v string) *CancelInsuranceRequest {
	s.Extend = &v
	return s
}

type CancelInsuranceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CancelInsuranceResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelInsuranceResponse) GoString() string {
	return s.String()
}

func (s *CancelInsuranceResponse) SetReqMsgId(v string) *CancelInsuranceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelInsuranceResponse) SetResultCode(v string) *CancelInsuranceResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelInsuranceResponse) SetResultMsg(v string) *CancelInsuranceResponse {
	s.ResultMsg = &v
	return s
}

type QueryInsuranceRecordsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 第三方Id，此处为天猫uid
	SourceUid *string `json:"source_uid,omitempty" xml:"source_uid,omitempty" require:"true"`
	// 保司编码
	MechanismCode *string `json:"mechanism_code,omitempty" xml:"mechanism_code,omitempty" require:"true"`
}

func (s QueryInsuranceRecordsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInsuranceRecordsRequest) GoString() string {
	return s.String()
}

func (s *QueryInsuranceRecordsRequest) SetAuthToken(v string) *QueryInsuranceRecordsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInsuranceRecordsRequest) SetProductInstanceId(v string) *QueryInsuranceRecordsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInsuranceRecordsRequest) SetSourceUid(v string) *QueryInsuranceRecordsRequest {
	s.SourceUid = &v
	return s
}

func (s *QueryInsuranceRecordsRequest) SetMechanismCode(v string) *QueryInsuranceRecordsRequest {
	s.MechanismCode = &v
	return s
}

type QueryInsuranceRecordsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户保单信息集合
	InsuranceRecordsList []*InsuranceRecordModel `json:"insurance_records_list,omitempty" xml:"insurance_records_list,omitempty" type:"Repeated"`
}

func (s QueryInsuranceRecordsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInsuranceRecordsResponse) GoString() string {
	return s.String()
}

func (s *QueryInsuranceRecordsResponse) SetReqMsgId(v string) *QueryInsuranceRecordsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInsuranceRecordsResponse) SetResultCode(v string) *QueryInsuranceRecordsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInsuranceRecordsResponse) SetResultMsg(v string) *QueryInsuranceRecordsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInsuranceRecordsResponse) SetInsuranceRecordsList(v []*InsuranceRecordModel) *QueryInsuranceRecordsResponse {
	s.InsuranceRecordsList = v
	return s
}

type QueryInsuranceChainRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 第三方Id，此处为天猫uid
	SourceUid *string `json:"source_uid,omitempty" xml:"source_uid,omitempty" require:"true"`
	// 保单号
	PolicyNo *string `json:"policy_no,omitempty" xml:"policy_no,omitempty" require:"true"`
}

func (s QueryInsuranceChainRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInsuranceChainRequest) GoString() string {
	return s.String()
}

func (s *QueryInsuranceChainRequest) SetAuthToken(v string) *QueryInsuranceChainRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInsuranceChainRequest) SetProductInstanceId(v string) *QueryInsuranceChainRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInsuranceChainRequest) SetSourceUid(v string) *QueryInsuranceChainRequest {
	s.SourceUid = &v
	return s
}

func (s *QueryInsuranceChainRequest) SetPolicyNo(v string) *QueryInsuranceChainRequest {
	s.PolicyNo = &v
	return s
}

type QueryInsuranceChainResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 保司编码
	MerchanismCode *string `json:"merchanism_code,omitempty" xml:"merchanism_code,omitempty"`
	// 订单来源 TIANMAO
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
	// 保险类型
	InsuraceType *string `json:"insurace_type,omitempty" xml:"insurace_type,omitempty"`
	// 保单加密信息（加密数据，由保司持有密钥）
	InsuranceContext *string `json:"insurance_context,omitempty" xml:"insurance_context,omitempty"`
	// 退保保单信息（加密数据，由保司持有密钥）
	InsuranceClaimContext *string `json:"insurance_claim_context,omitempty" xml:"insurance_claim_context,omitempty"`
	// 保单理赔信息（加密数据，由保司持有密钥）
	InsuranceSurrenderContext *string `json:"insurance_surrender_context,omitempty" xml:"insurance_surrender_context,omitempty"`
}

func (s QueryInsuranceChainResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInsuranceChainResponse) GoString() string {
	return s.String()
}

func (s *QueryInsuranceChainResponse) SetReqMsgId(v string) *QueryInsuranceChainResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInsuranceChainResponse) SetResultCode(v string) *QueryInsuranceChainResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInsuranceChainResponse) SetResultMsg(v string) *QueryInsuranceChainResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInsuranceChainResponse) SetMerchanismCode(v string) *QueryInsuranceChainResponse {
	s.MerchanismCode = &v
	return s
}

func (s *QueryInsuranceChainResponse) SetSource(v string) *QueryInsuranceChainResponse {
	s.Source = &v
	return s
}

func (s *QueryInsuranceChainResponse) SetInsuraceType(v string) *QueryInsuranceChainResponse {
	s.InsuraceType = &v
	return s
}

func (s *QueryInsuranceChainResponse) SetInsuranceContext(v string) *QueryInsuranceChainResponse {
	s.InsuranceContext = &v
	return s
}

func (s *QueryInsuranceChainResponse) SetInsuranceClaimContext(v string) *QueryInsuranceChainResponse {
	s.InsuranceClaimContext = &v
	return s
}

func (s *QueryInsuranceChainResponse) SetInsuranceSurrenderContext(v string) *QueryInsuranceChainResponse {
	s.InsuranceSurrenderContext = &v
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
				"sdk_version":      tea.String("1.7.26"),
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
 * Description: 对企业/个人进行身份认证
 * Summary: 统一客户认证接口
 */
func (client *Client) AuthCustomer(request *AuthCustomerRequest) (_result *AuthCustomerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthCustomerResponse{}
	_body, _err := client.AuthCustomerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 对企业/个人进行身份认证
 * Summary: 统一客户认证接口
 */
func (client *Client) AuthCustomerEx(request *AuthCustomerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthCustomerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthCustomerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.customer.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 智科统一客户注册
 * Summary: 统一客户注册接口
 */
func (client *Client) CreateCustomer(request *CreateCustomerRequest) (_result *CreateCustomerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateCustomerResponse{}
	_body, _err := client.CreateCustomerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 智科统一客户注册
 * Summary: 统一客户注册接口
 */
func (client *Client) CreateCustomerEx(request *CreateCustomerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateCustomerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateCustomerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.customer.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 客户信息查询
 * Summary: 客户信息查询
 */
func (client *Client) QueryCustomer(request *QueryCustomerRequest) (_result *QueryCustomerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCustomerResponse{}
	_body, _err := client.QueryCustomerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 客户信息查询
 * Summary: 客户信息查询
 */
func (client *Client) QueryCustomerEx(request *QueryCustomerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCustomerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCustomerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.customer.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) InitVerify(request *InitVerifyRequest) (_result *InitVerifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitVerifyResponse{}
	_body, _err := client.InitVerifyEx(request, headers, runtime)
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
func (client *Client) InitVerifyEx(request *InitVerifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitVerifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitVerifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.verify.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 核身产品渲染接口
 * Summary: 核身产品渲染接口
 */
func (client *Client) StartVerify(request *StartVerifyRequest) (_result *StartVerifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartVerifyResponse{}
	_body, _err := client.StartVerifyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 核身产品渲染接口
 * Summary: 核身产品渲染接口
 */
func (client *Client) StartVerifyEx(request *StartVerifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartVerifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartVerifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.verify.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 核身结果查询
 * Summary: 核身结果查询
 */
func (client *Client) CheckVerify(request *CheckVerifyRequest) (_result *CheckVerifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckVerifyResponse{}
	_body, _err := client.CheckVerifyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 核身结果查询
 * Summary: 核身结果查询
 */
func (client *Client) CheckVerifyEx(request *CheckVerifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckVerifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckVerifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.verify.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 对企业身份进行认证
 * Summary: 企业四要素认证
 */
func (client *Client) VerifyMeta(request *VerifyMetaRequest) (_result *VerifyMetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyMetaResponse{}
	_body, _err := client.VerifyMetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 对企业身份进行认证
 * Summary: 企业四要素认证
 */
func (client *Client) VerifyMetaEx(request *VerifyMetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyMetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyMetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.meta.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 经营信息查询
 * Summary: 经营信息查询
 */
func (client *Client) QueryEnterpriseBusinessinfo(request *QueryEnterpriseBusinessinfoRequest) (_result *QueryEnterpriseBusinessinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEnterpriseBusinessinfoResponse{}
	_body, _err := client.QueryEnterpriseBusinessinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 经营信息查询
 * Summary: 经营信息查询
 */
func (client *Client) QueryEnterpriseBusinessinfoEx(request *QueryEnterpriseBusinessinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEnterpriseBusinessinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEnterpriseBusinessinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.enterprise.businessinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 定义外包的薪资方案接口,以【服务商、项目类别、领域、角色、资质】为unique
 * Summary: 外包薪资规则合约发布接口
 */
func (client *Client) ApplyContractRule(request *ApplyContractRuleRequest) (_result *ApplyContractRuleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyContractRuleResponse{}
	_body, _err := client.ApplyContractRuleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 定义外包的薪资方案接口,以【服务商、项目类别、领域、角色、资质】为unique
 * Summary: 外包薪资规则合约发布接口
 */
func (client *Client) ApplyContractRuleEx(request *ApplyContractRuleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyContractRuleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyContractRuleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.contract.rule.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 调用链上合约接口，查询外包的薪资方案

 * Summary: 外包薪资规则合约查询接口
 */
func (client *Client) GetContractRule(request *GetContractRuleRequest) (_result *GetContractRuleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetContractRuleResponse{}
	_body, _err := client.GetContractRuleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 调用链上合约接口，查询外包的薪资方案

 * Summary: 外包薪资规则合约查询接口
 */
func (client *Client) GetContractRuleEx(request *GetContractRuleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetContractRuleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetContractRuleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.contract.rule.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 基于人的维度,支持批量接口上传，以{id,name,createDate,resultDate}。具体格式待商议
 * Summary: 长城汽车的考勤信息上传接口
 */
func (client *Client) UploadStaffAttendance(request *UploadStaffAttendanceRequest) (_result *UploadStaffAttendanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadStaffAttendanceResponse{}
	_body, _err := client.UploadStaffAttendanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 基于人的维度,支持批量接口上传，以{id,name,createDate,resultDate}。具体格式待商议
 * Summary: 长城汽车的考勤信息上传接口
 */
func (client *Client) UploadStaffAttendanceEx(request *UploadStaffAttendanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadStaffAttendanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadStaffAttendanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.staff.attendance.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 基于人的维度，入参：{用户id,考勤月份}
 * Summary: 长城汽车的考勤信息获取
 */
func (client *Client) QueryStaffAttendance(request *QueryStaffAttendanceRequest) (_result *QueryStaffAttendanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryStaffAttendanceResponse{}
	_body, _err := client.QueryStaffAttendanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 基于人的维度，入参：{用户id,考勤月份}
 * Summary: 长城汽车的考勤信息获取
 */
func (client *Client) QueryStaffAttendanceEx(request *QueryStaffAttendanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryStaffAttendanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryStaffAttendanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.staff.attendance.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 长城汽车的考核信息
 * Summary: 长城汽车的考核信息
 */
func (client *Client) UploadStaffAssessment(request *UploadStaffAssessmentRequest) (_result *UploadStaffAssessmentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadStaffAssessmentResponse{}
	_body, _err := client.UploadStaffAssessmentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 长城汽车的考核信息
 * Summary: 长城汽车的考核信息
 */
func (client *Client) UploadStaffAssessmentEx(request *UploadStaffAssessmentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadStaffAssessmentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadStaffAssessmentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.staff.assessment.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 考核信息查询
 * Summary: 考核信息查询
 */
func (client *Client) QueryStaffAssessment(request *QueryStaffAssessmentRequest) (_result *QueryStaffAssessmentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryStaffAssessmentResponse{}
	_body, _err := client.QueryStaffAssessmentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 考核信息查询
 * Summary: 考核信息查询
 */
func (client *Client) QueryStaffAssessmentEx(request *QueryStaffAssessmentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryStaffAssessmentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryStaffAssessmentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.staff.assessment.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 对账单执行
 * Summary: 对账单执行接口
 */
func (client *Client) ExecContractReconciliation(request *ExecContractReconciliationRequest) (_result *ExecContractReconciliationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecContractReconciliationResponse{}
	_body, _err := client.ExecContractReconciliationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 对账单执行
 * Summary: 对账单执行接口
 */
func (client *Client) ExecContractReconciliationEx(request *ExecContractReconciliationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecContractReconciliationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecContractReconciliationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.contract.reconciliation.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 结算单确认
 * Summary: 结算单确认
 */
func (client *Client) ConfirmContractReconciliation(request *ConfirmContractReconciliationRequest) (_result *ConfirmContractReconciliationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ConfirmContractReconciliationResponse{}
	_body, _err := client.ConfirmContractReconciliationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 结算单确认
 * Summary: 结算单确认
 */
func (client *Client) ConfirmContractReconciliationEx(request *ConfirmContractReconciliationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ConfirmContractReconciliationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmContractReconciliationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.contract.reconciliation.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询结算单
 * Summary: 查询结算单
 */
func (client *Client) QueryContractReconciliation(request *QueryContractReconciliationRequest) (_result *QueryContractReconciliationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryContractReconciliationResponse{}
	_body, _err := client.QueryContractReconciliationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询结算单
 * Summary: 查询结算单
 */
func (client *Client) QueryContractReconciliationEx(request *QueryContractReconciliationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryContractReconciliationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryContractReconciliationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.contract.reconciliation.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: DID创建及核验
 * Summary: DID创建及核验
 */
func (client *Client) VerifyCustomer(request *VerifyCustomerRequest) (_result *VerifyCustomerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyCustomerResponse{}
	_body, _err := client.VerifyCustomerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: DID创建及核验
 * Summary: DID创建及核验
 */
func (client *Client) VerifyCustomerEx(request *VerifyCustomerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyCustomerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyCustomerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.customer.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 身份关联链上账户
 * Summary: 身份关联链上账户
 */
func (client *Client) MatchDidAccount(request *MatchDidAccountRequest) (_result *MatchDidAccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &MatchDidAccountResponse{}
	_body, _err := client.MatchDidAccountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 身份关联链上账户
 * Summary: 身份关联链上账户
 */
func (client *Client) MatchDidAccountEx(request *MatchDidAccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *MatchDidAccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &MatchDidAccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.did.account.match"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 身份关数字资产
 * Summary: 身份关数字资产
 */
func (client *Client) MatchDidAssets(request *MatchDidAssetsRequest) (_result *MatchDidAssetsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &MatchDidAssetsResponse{}
	_body, _err := client.MatchDidAssetsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 身份关数字资产
 * Summary: 身份关数字资产
 */
func (client *Client) MatchDidAssetsEx(request *MatchDidAssetsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *MatchDidAssetsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &MatchDidAssetsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.did.assets.match"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: DID创建及核验
 * Summary: DID创建及核验
 */
func (client *Client) CreateDidCustomer(request *CreateDidCustomerRequest) (_result *CreateDidCustomerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDidCustomerResponse{}
	_body, _err := client.CreateDidCustomerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: DID创建及核验
 * Summary: DID创建及核验
 */
func (client *Client) CreateDidCustomerEx(request *CreateDidCustomerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDidCustomerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDidCustomerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.did.customer.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业DID创建及核验
 * Summary: 企业DID创建及核验
 */
func (client *Client) CreateDidEnterprise(request *CreateDidEnterpriseRequest) (_result *CreateDidEnterpriseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDidEnterpriseResponse{}
	_body, _err := client.CreateDidEnterpriseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业DID创建及核验
 * Summary: 企业DID创建及核验
 */
func (client *Client) CreateDidEnterpriseEx(request *CreateDidEnterpriseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDidEnterpriseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDidEnterpriseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.did.enterprise.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 记录用户登录保司小程序信息
 * Summary: 用户登陆页面埋点
 */
func (client *Client) InitInsuranceUser(request *InitInsuranceUserRequest) (_result *InitInsuranceUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitInsuranceUserResponse{}
	_body, _err := client.InitInsuranceUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 记录用户登录保司小程序信息
 * Summary: 用户登陆页面埋点
 */
func (client *Client) InitInsuranceUserEx(request *InitInsuranceUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitInsuranceUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitInsuranceUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.insurance.user.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保司方获取授权信息
 * Summary: 获取授权信息
 */
func (client *Client) QueryInsurance(request *QueryInsuranceRequest) (_result *QueryInsuranceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInsuranceResponse{}
	_body, _err := client.QueryInsuranceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保司方获取授权信息
 * Summary: 获取授权信息
 */
func (client *Client) QueryInsuranceEx(request *QueryInsuranceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInsuranceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInsuranceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.insurance.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保单信息上链，保单信息同步
 * Summary: 保单信息上链
 */
func (client *Client) OperateInsurance(request *OperateInsuranceRequest) (_result *OperateInsuranceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateInsuranceResponse{}
	_body, _err := client.OperateInsuranceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保单信息上链，保单信息同步
 * Summary: 保单信息上链
 */
func (client *Client) OperateInsuranceEx(request *OperateInsuranceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateInsuranceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateInsuranceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.insurance.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 上传保单附件至阿里云OSS
 * Summary: 上传保单附件
 */
func (client *Client) UploadInsurance(request *UploadInsuranceRequest) (_result *UploadInsuranceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadInsuranceResponse{}
	_body, _err := client.UploadInsuranceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上传保单附件至阿里云OSS
 * Summary: 上传保单附件
 */
func (client *Client) UploadInsuranceEx(request *UploadInsuranceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadInsuranceResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.bbp.insurance.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadInsuranceResponse := &UploadInsuranceResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadInsuranceResponse
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
	_result = &UploadInsuranceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.insurance.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保险理赔受理信息同步到蚂蚁链
 * Summary: 理赔受理上链
 */
func (client *Client) SyncInsurance(request *SyncInsuranceRequest) (_result *SyncInsuranceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncInsuranceResponse{}
	_body, _err := client.SyncInsuranceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保险理赔受理信息同步到蚂蚁链
 * Summary: 理赔受理上链
 */
func (client *Client) SyncInsuranceEx(request *SyncInsuranceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncInsuranceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncInsuranceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.insurance.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 同步用户退保信息上链
 * Summary: 保单退保接口
 */
func (client *Client) CancelInsurance(request *CancelInsuranceRequest) (_result *CancelInsuranceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelInsuranceResponse{}
	_body, _err := client.CancelInsuranceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 同步用户退保信息上链
 * Summary: 保单退保接口
 */
func (client *Client) CancelInsuranceEx(request *CancelInsuranceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelInsuranceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelInsuranceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.insurance.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询用户的数据库保单记录
 * Summary: 用户保单信息列表查询
 */
func (client *Client) QueryInsuranceRecords(request *QueryInsuranceRecordsRequest) (_result *QueryInsuranceRecordsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInsuranceRecordsResponse{}
	_body, _err := client.QueryInsuranceRecordsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询用户的数据库保单记录
 * Summary: 用户保单信息列表查询
 */
func (client *Client) QueryInsuranceRecordsEx(request *QueryInsuranceRecordsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInsuranceRecordsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInsuranceRecordsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.insurance.records.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保单链上信息查询
 * Summary: 保单链上信息查询
 */
func (client *Client) QueryInsuranceChain(request *QueryInsuranceChainRequest) (_result *QueryInsuranceChainResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInsuranceChainResponse{}
	_body, _err := client.QueryInsuranceChainEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保单链上信息查询
 * Summary: 保单链上信息查询
 */
func (client *Client) QueryInsuranceChainEx(request *QueryInsuranceChainRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInsuranceChainResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInsuranceChainResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.insurance.chain.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
