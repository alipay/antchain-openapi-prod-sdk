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

// 批次详情
type BatchDetailVO struct {
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 实施内容id
	CombinationId *string `json:"combination_id,omitempty" xml:"combination_id,omitempty" require:"true"`
	// 批次名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 备注
	Remarks *string `json:"remarks,omitempty" xml:"remarks,omitempty" require:"true"`
	// 发放方式：【0：自动拨付，1：其他方式拨付，2：快递寄送，3：当面发放，4：服务后确认发放，5：无特定发放方式】
	IssueWay *int64 `json:"issue_way,omitempty" xml:"issue_way,omitempty" require:"true"`
	// 确认接收人 0发前确认 1发后确认
	AffirmanceReceivers *int64 `json:"affirmance_receivers,omitempty" xml:"affirmance_receivers,omitempty" require:"true"`
	// 接收方式（0扫脸验证、1身份证号码验证，2扫二维码验证, 3直接导入
	ReceiveCheckWay *int64 `json:"receive_check_way,omitempty" xml:"receive_check_way,omitempty" require:"true"`
	// 发放数量
	IssueAmount *int64 `json:"issue_amount,omitempty" xml:"issue_amount,omitempty" require:"true"`
}

func (s BatchDetailVO) String() string {
	return tea.Prettify(s)
}

func (s BatchDetailVO) GoString() string {
	return s.String()
}

func (s *BatchDetailVO) SetId(v string) *BatchDetailVO {
	s.Id = &v
	return s
}

func (s *BatchDetailVO) SetCombinationId(v string) *BatchDetailVO {
	s.CombinationId = &v
	return s
}

func (s *BatchDetailVO) SetName(v string) *BatchDetailVO {
	s.Name = &v
	return s
}

func (s *BatchDetailVO) SetRemarks(v string) *BatchDetailVO {
	s.Remarks = &v
	return s
}

func (s *BatchDetailVO) SetIssueWay(v int64) *BatchDetailVO {
	s.IssueWay = &v
	return s
}

func (s *BatchDetailVO) SetAffirmanceReceivers(v int64) *BatchDetailVO {
	s.AffirmanceReceivers = &v
	return s
}

func (s *BatchDetailVO) SetReceiveCheckWay(v int64) *BatchDetailVO {
	s.ReceiveCheckWay = &v
	return s
}

func (s *BatchDetailVO) SetIssueAmount(v int64) *BatchDetailVO {
	s.IssueAmount = &v
	return s
}

// 项目详情
type ProjectVO struct {
	// 公益项目ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 创建时间
	GmtCreate *int64 `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true"`
	// 修改时间
	GmtModified *int64 `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true"`
	// 公益项目名称
	PjName *string `json:"pj_name,omitempty" xml:"pj_name,omitempty" require:"true"`
	// 机构ID
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty" require:"true"`
	// 公益方向
	PublicWelfareDirection *string `json:"public_welfare_direction,omitempty" xml:"public_welfare_direction,omitempty" require:"true"`
	// 测试项目:0正式项目(默认),1测试项目
	TestFlag *int64 `json:"test_flag,omitempty" xml:"test_flag,omitempty"`
}

func (s ProjectVO) String() string {
	return tea.Prettify(s)
}

func (s ProjectVO) GoString() string {
	return s.String()
}

func (s *ProjectVO) SetId(v string) *ProjectVO {
	s.Id = &v
	return s
}

func (s *ProjectVO) SetGmtCreate(v int64) *ProjectVO {
	s.GmtCreate = &v
	return s
}

func (s *ProjectVO) SetGmtModified(v int64) *ProjectVO {
	s.GmtModified = &v
	return s
}

func (s *ProjectVO) SetPjName(v string) *ProjectVO {
	s.PjName = &v
	return s
}

func (s *ProjectVO) SetOrgId(v string) *ProjectVO {
	s.OrgId = &v
	return s
}

func (s *ProjectVO) SetPublicWelfareDirection(v string) *ProjectVO {
	s.PublicWelfareDirection = &v
	return s
}

func (s *ProjectVO) SetTestFlag(v int64) *ProjectVO {
	s.TestFlag = &v
	return s
}

// 分期详情
type StagesDetailVO struct {
	// 分期id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 计划开始时间
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 计划结束时间
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 目标捐赠金额
	TargetMoney *int64 `json:"target_money,omitempty" xml:"target_money,omitempty"`
	// 目标捐赠人数
	TargetNum *int64 `json:"target_num,omitempty" xml:"target_num,omitempty"`
	// 说明
	Note *string `json:"note,omitempty" xml:"note,omitempty"`
	// 公开募捐编号
	PublicFundraisingNo *string `json:"public_fundraising_no,omitempty" xml:"public_fundraising_no,omitempty"`
	// 静态文件地址‘,’分割
	CoverUrl *string `json:"cover_url,omitempty" xml:"cover_url,omitempty"`
	// 管理费用金额(单位：分)
	AdministrativeRate *int64 `json:"administrative_rate,omitempty" xml:"administrative_rate,omitempty"`
	// 项目状态，0进行中（默认），1已结项
	State *int64 `json:"state,omitempty" xml:"state,omitempty"`
	// 签约id,关联签约表
	SignId *string `json:"sign_id,omitempty" xml:"sign_id,omitempty"`
}

func (s StagesDetailVO) String() string {
	return tea.Prettify(s)
}

func (s StagesDetailVO) GoString() string {
	return s.String()
}

func (s *StagesDetailVO) SetId(v string) *StagesDetailVO {
	s.Id = &v
	return s
}

func (s *StagesDetailVO) SetStartTime(v int64) *StagesDetailVO {
	s.StartTime = &v
	return s
}

func (s *StagesDetailVO) SetEndTime(v int64) *StagesDetailVO {
	s.EndTime = &v
	return s
}

func (s *StagesDetailVO) SetTargetMoney(v int64) *StagesDetailVO {
	s.TargetMoney = &v
	return s
}

func (s *StagesDetailVO) SetTargetNum(v int64) *StagesDetailVO {
	s.TargetNum = &v
	return s
}

func (s *StagesDetailVO) SetNote(v string) *StagesDetailVO {
	s.Note = &v
	return s
}

func (s *StagesDetailVO) SetPublicFundraisingNo(v string) *StagesDetailVO {
	s.PublicFundraisingNo = &v
	return s
}

func (s *StagesDetailVO) SetCoverUrl(v string) *StagesDetailVO {
	s.CoverUrl = &v
	return s
}

func (s *StagesDetailVO) SetAdministrativeRate(v int64) *StagesDetailVO {
	s.AdministrativeRate = &v
	return s
}

func (s *StagesDetailVO) SetState(v int64) *StagesDetailVO {
	s.State = &v
	return s
}

func (s *StagesDetailVO) SetSignId(v string) *StagesDetailVO {
	s.SignId = &v
	return s
}

// 实施内容信息
type SubjectCombinationMessage struct {
	// 实施内容id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true" maxLength:"50"`
	// 实施内容名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" maxLength:"20"`
	// 实施内容类型：0善款类，1实物类、2服务类
	Type *int64 `json:"type,omitempty" xml:"type,omitempty"`
	// 单位
	Unit *string `json:"unit,omitempty" xml:"unit,omitempty" maxLength:"10"`
	// 说明
	Note *string `json:"note,omitempty" xml:"note,omitempty" maxLength:"1000"`
	// 单价是否固定，0:不固定，1:固定
	PriceDeterminedFlag *int64 `json:"price_determined_flag,omitempty" xml:"price_determined_flag,omitempty"`
	// 单价
	Price *int64 `json:"price,omitempty" xml:"price,omitempty"`
	// 预估发放数量
	TotalNum *int64 `json:"total_num,omitempty" xml:"total_num,omitempty"`
	// 操作类型0-新增，1-修改，2-删除
	Operate *int64 `json:"operate,omitempty" xml:"operate,omitempty" require:"true"`
}

func (s SubjectCombinationMessage) String() string {
	return tea.Prettify(s)
}

func (s SubjectCombinationMessage) GoString() string {
	return s.String()
}

func (s *SubjectCombinationMessage) SetId(v string) *SubjectCombinationMessage {
	s.Id = &v
	return s
}

func (s *SubjectCombinationMessage) SetName(v string) *SubjectCombinationMessage {
	s.Name = &v
	return s
}

func (s *SubjectCombinationMessage) SetType(v int64) *SubjectCombinationMessage {
	s.Type = &v
	return s
}

func (s *SubjectCombinationMessage) SetUnit(v string) *SubjectCombinationMessage {
	s.Unit = &v
	return s
}

func (s *SubjectCombinationMessage) SetNote(v string) *SubjectCombinationMessage {
	s.Note = &v
	return s
}

func (s *SubjectCombinationMessage) SetPriceDeterminedFlag(v int64) *SubjectCombinationMessage {
	s.PriceDeterminedFlag = &v
	return s
}

func (s *SubjectCombinationMessage) SetPrice(v int64) *SubjectCombinationMessage {
	s.Price = &v
	return s
}

func (s *SubjectCombinationMessage) SetTotalNum(v int64) *SubjectCombinationMessage {
	s.TotalNum = &v
	return s
}

func (s *SubjectCombinationMessage) SetOperate(v int64) *SubjectCombinationMessage {
	s.Operate = &v
	return s
}

// 实施内容详情
type OpenSubjectCombinationVO struct {
	// 实施内容id
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 实施内容名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 实施内容类型
	Type *int64 `json:"type,omitempty" xml:"type,omitempty"`
	// 单位
	Unit *string `json:"unit,omitempty" xml:"unit,omitempty"`
	// 说明
	Note *string `json:"note,omitempty" xml:"note,omitempty"`
	// 单价是否固定，0:不固定，1:固定
	PriceDeterminedFlag *int64 `json:"price_determined_flag,omitempty" xml:"price_determined_flag,omitempty"`
	// 单价
	Price *int64 `json:"price,omitempty" xml:"price,omitempty"`
	// 预估发放个数
	TotalNum *int64 `json:"total_num,omitempty" xml:"total_num,omitempty"`
}

func (s OpenSubjectCombinationVO) String() string {
	return tea.Prettify(s)
}

func (s OpenSubjectCombinationVO) GoString() string {
	return s.String()
}

func (s *OpenSubjectCombinationVO) SetId(v string) *OpenSubjectCombinationVO {
	s.Id = &v
	return s
}

func (s *OpenSubjectCombinationVO) SetName(v string) *OpenSubjectCombinationVO {
	s.Name = &v
	return s
}

func (s *OpenSubjectCombinationVO) SetType(v int64) *OpenSubjectCombinationVO {
	s.Type = &v
	return s
}

func (s *OpenSubjectCombinationVO) SetUnit(v string) *OpenSubjectCombinationVO {
	s.Unit = &v
	return s
}

func (s *OpenSubjectCombinationVO) SetNote(v string) *OpenSubjectCombinationVO {
	s.Note = &v
	return s
}

func (s *OpenSubjectCombinationVO) SetPriceDeterminedFlag(v int64) *OpenSubjectCombinationVO {
	s.PriceDeterminedFlag = &v
	return s
}

func (s *OpenSubjectCombinationVO) SetPrice(v int64) *OpenSubjectCombinationVO {
	s.Price = &v
	return s
}

func (s *OpenSubjectCombinationVO) SetTotalNum(v int64) *OpenSubjectCombinationVO {
	s.TotalNum = &v
	return s
}

// 执行记录
type ReceivedRecord struct {
	// 执行记录id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true" maxLength:"50"`
	// 支付宝用户标识
	ReceiverAlipayUserId *string `json:"receiver_alipay_user_id,omitempty" xml:"receiver_alipay_user_id,omitempty" require:"true" maxLength:"16" minLength:"16"`
	// 领取人姓名
	ReceiverName *string `json:"receiver_name,omitempty" xml:"receiver_name,omitempty" require:"true" maxLength:"50"`
	// 领取人身份证号码
	ReceiverCardNo *string `json:"receiver_card_no,omitempty" xml:"receiver_card_no,omitempty" require:"true"`
	// 联系号码
	ReceiverPhoneNo *string `json:"receiver_phone_no,omitempty" xml:"receiver_phone_no,omitempty" maxLength:"20"`
	// 是否是受益人本人 0本人，1代领
	AgentFlag *int64 `json:"agent_flag,omitempty" xml:"agent_flag,omitempty" require:"true"`
	// 领取人和受益人关系
	Relationship *string `json:"relationship,omitempty" xml:"relationship,omitempty" maxLength:"100"`
	// 受益人信息
	BeneficiaryMessage *string `json:"beneficiary_message,omitempty" xml:"beneficiary_message,omitempty" maxLength:"200"`
	// 领取人所属机构
	ReceiverOrg *string `json:"receiver_org,omitempty" xml:"receiver_org,omitempty" maxLength:"100"`
	// 领取说明
	ReceiveNote *string `json:"receive_note,omitempty" xml:"receive_note,omitempty" maxLength:"100"`
	// 受益人数
	BenefitNumber *int64 `json:"benefit_number,omitempty" xml:"benefit_number,omitempty" maximum:"999999999" minimum:"1"`
	// 快递地址
	ExpressAddress *string `json:"express_address,omitempty" xml:"express_address,omitempty" maxLength:"100"`
	// 发放数量
	IssueAmount *int64 `json:"issue_amount,omitempty" xml:"issue_amount,omitempty" maximum:"100000000" minimum:"1"`
}

func (s ReceivedRecord) String() string {
	return tea.Prettify(s)
}

func (s ReceivedRecord) GoString() string {
	return s.String()
}

func (s *ReceivedRecord) SetId(v string) *ReceivedRecord {
	s.Id = &v
	return s
}

func (s *ReceivedRecord) SetReceiverAlipayUserId(v string) *ReceivedRecord {
	s.ReceiverAlipayUserId = &v
	return s
}

func (s *ReceivedRecord) SetReceiverName(v string) *ReceivedRecord {
	s.ReceiverName = &v
	return s
}

func (s *ReceivedRecord) SetReceiverCardNo(v string) *ReceivedRecord {
	s.ReceiverCardNo = &v
	return s
}

func (s *ReceivedRecord) SetReceiverPhoneNo(v string) *ReceivedRecord {
	s.ReceiverPhoneNo = &v
	return s
}

func (s *ReceivedRecord) SetAgentFlag(v int64) *ReceivedRecord {
	s.AgentFlag = &v
	return s
}

func (s *ReceivedRecord) SetRelationship(v string) *ReceivedRecord {
	s.Relationship = &v
	return s
}

func (s *ReceivedRecord) SetBeneficiaryMessage(v string) *ReceivedRecord {
	s.BeneficiaryMessage = &v
	return s
}

func (s *ReceivedRecord) SetReceiverOrg(v string) *ReceivedRecord {
	s.ReceiverOrg = &v
	return s
}

func (s *ReceivedRecord) SetReceiveNote(v string) *ReceivedRecord {
	s.ReceiveNote = &v
	return s
}

func (s *ReceivedRecord) SetBenefitNumber(v int64) *ReceivedRecord {
	s.BenefitNumber = &v
	return s
}

func (s *ReceivedRecord) SetExpressAddress(v string) *ReceivedRecord {
	s.ExpressAddress = &v
	return s
}

func (s *ReceivedRecord) SetIssueAmount(v int64) *ReceivedRecord {
	s.IssueAmount = &v
	return s
}

// 机构详情结构
type OrgVO struct {
	// 机构ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 创建时间
	GmtCreate *int64 `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true"`
	// 修改时间
	GmtModified *int64 `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true"`
	// 机构名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 统一社会信用代码
	UnifiedSocialCreditCode *string `json:"unified_social_credit_code,omitempty" xml:"unified_social_credit_code,omitempty" require:"true"`
	// 机构简介
	Introduction *string `json:"introduction,omitempty" xml:"introduction,omitempty" require:"true"`
	// 签约时间
	SignTime *int64 `json:"sign_time,omitempty" xml:"sign_time,omitempty" require:"true"`
	//  测试项目:0正式机构(默认),1测试机构
	TestFlag *int64 `json:"test_flag,omitempty" xml:"test_flag,omitempty"`
}

func (s OrgVO) String() string {
	return tea.Prettify(s)
}

func (s OrgVO) GoString() string {
	return s.String()
}

func (s *OrgVO) SetId(v string) *OrgVO {
	s.Id = &v
	return s
}

func (s *OrgVO) SetGmtCreate(v int64) *OrgVO {
	s.GmtCreate = &v
	return s
}

func (s *OrgVO) SetGmtModified(v int64) *OrgVO {
	s.GmtModified = &v
	return s
}

func (s *OrgVO) SetName(v string) *OrgVO {
	s.Name = &v
	return s
}

func (s *OrgVO) SetUnifiedSocialCreditCode(v string) *OrgVO {
	s.UnifiedSocialCreditCode = &v
	return s
}

func (s *OrgVO) SetIntroduction(v string) *OrgVO {
	s.Introduction = &v
	return s
}

func (s *OrgVO) SetSignTime(v int64) *OrgVO {
	s.SignTime = &v
	return s
}

func (s *OrgVO) SetTestFlag(v int64) *OrgVO {
	s.TestFlag = &v
	return s
}

type CreateAlipaysignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签约记录id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true" maxLength:"50"`
	// 机构id
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty" require:"true" maxLength:"50"`
	// 支付宝代扣账号
	AlipayAccount *string `json:"alipay_account,omitempty" xml:"alipay_account,omitempty" require:"true" maxLength:"100"`
}

func (s CreateAlipaysignRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAlipaysignRequest) GoString() string {
	return s.String()
}

func (s *CreateAlipaysignRequest) SetAuthToken(v string) *CreateAlipaysignRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAlipaysignRequest) SetProductInstanceId(v string) *CreateAlipaysignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAlipaysignRequest) SetId(v string) *CreateAlipaysignRequest {
	s.Id = &v
	return s
}

func (s *CreateAlipaysignRequest) SetOrgId(v string) *CreateAlipaysignRequest {
	s.OrgId = &v
	return s
}

func (s *CreateAlipaysignRequest) SetAlipayAccount(v string) *CreateAlipaysignRequest {
	s.AlipayAccount = &v
	return s
}

type CreateAlipaysignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateAlipaysignResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAlipaysignResponse) GoString() string {
	return s.String()
}

func (s *CreateAlipaysignResponse) SetReqMsgId(v string) *CreateAlipaysignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAlipaysignResponse) SetResultCode(v string) *CreateAlipaysignResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAlipaysignResponse) SetResultMsg(v string) *CreateAlipaysignResponse {
	s.ResultMsg = &v
	return s
}

type QueryAlipaysignStateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签约记录id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true" maxLength:"50" minLength:"1"`
}

func (s QueryAlipaysignStateRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAlipaysignStateRequest) GoString() string {
	return s.String()
}

func (s *QueryAlipaysignStateRequest) SetAuthToken(v string) *QueryAlipaysignStateRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAlipaysignStateRequest) SetProductInstanceId(v string) *QueryAlipaysignStateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAlipaysignStateRequest) SetId(v string) *QueryAlipaysignStateRequest {
	s.Id = &v
	return s
}

type QueryAlipaysignStateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 代扣账号签约状态 0.未签约 1.已签约
	State *int64 `json:"state,omitempty" xml:"state,omitempty"`
}

func (s QueryAlipaysignStateResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAlipaysignStateResponse) GoString() string {
	return s.String()
}

func (s *QueryAlipaysignStateResponse) SetReqMsgId(v string) *QueryAlipaysignStateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAlipaysignStateResponse) SetResultCode(v string) *QueryAlipaysignStateResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAlipaysignStateResponse) SetResultMsg(v string) *QueryAlipaysignStateResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAlipaysignStateResponse) SetState(v int64) *QueryAlipaysignStateResponse {
	s.State = &v
	return s
}

type QueryAlipaysignQrcodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryAlipaysignQrcodeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAlipaysignQrcodeRequest) GoString() string {
	return s.String()
}

func (s *QueryAlipaysignQrcodeRequest) SetAuthToken(v string) *QueryAlipaysignQrcodeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAlipaysignQrcodeRequest) SetProductInstanceId(v string) *QueryAlipaysignQrcodeRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryAlipaysignQrcodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 账号签约二维码url
	SignUrl *string `json:"sign_url,omitempty" xml:"sign_url,omitempty"`
}

func (s QueryAlipaysignQrcodeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAlipaysignQrcodeResponse) GoString() string {
	return s.String()
}

func (s *QueryAlipaysignQrcodeResponse) SetReqMsgId(v string) *QueryAlipaysignQrcodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAlipaysignQrcodeResponse) SetResultCode(v string) *QueryAlipaysignQrcodeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAlipaysignQrcodeResponse) SetResultMsg(v string) *QueryAlipaysignQrcodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAlipaysignQrcodeResponse) SetSignUrl(v string) *QueryAlipaysignQrcodeResponse {
	s.SignUrl = &v
	return s
}

type CreatePersonPermissionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 机构ID(第三方指定ID 50字符)
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty" require:"true" maxLength:"50"`
	// 项目角色ID(1项目管理员、2项目执行人、3项目财务)
	RoleId *int64 `json:"role_id,omitempty" xml:"role_id,omitempty" require:"true"`
	// 项目ID(第三方指定ID 50字符)
	PjId *string `json:"pj_id,omitempty" xml:"pj_id,omitempty" require:"true" maxLength:"50"`
	// 被授权人支付宝用户标识(16字符)
	AlipayUserId *string `json:"alipay_user_id,omitempty" xml:"alipay_user_id,omitempty" require:"true"`
}

func (s CreatePersonPermissionRequest) String() string {
	return tea.Prettify(s)
}

func (s CreatePersonPermissionRequest) GoString() string {
	return s.String()
}

func (s *CreatePersonPermissionRequest) SetAuthToken(v string) *CreatePersonPermissionRequest {
	s.AuthToken = &v
	return s
}

func (s *CreatePersonPermissionRequest) SetProductInstanceId(v string) *CreatePersonPermissionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreatePersonPermissionRequest) SetOrgId(v string) *CreatePersonPermissionRequest {
	s.OrgId = &v
	return s
}

func (s *CreatePersonPermissionRequest) SetRoleId(v int64) *CreatePersonPermissionRequest {
	s.RoleId = &v
	return s
}

func (s *CreatePersonPermissionRequest) SetPjId(v string) *CreatePersonPermissionRequest {
	s.PjId = &v
	return s
}

func (s *CreatePersonPermissionRequest) SetAlipayUserId(v string) *CreatePersonPermissionRequest {
	s.AlipayUserId = &v
	return s
}

type CreatePersonPermissionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreatePersonPermissionResponse) String() string {
	return tea.Prettify(s)
}

func (s CreatePersonPermissionResponse) GoString() string {
	return s.String()
}

func (s *CreatePersonPermissionResponse) SetReqMsgId(v string) *CreatePersonPermissionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreatePersonPermissionResponse) SetResultCode(v string) *CreatePersonPermissionResponse {
	s.ResultCode = &v
	return s
}

func (s *CreatePersonPermissionResponse) SetResultMsg(v string) *CreatePersonPermissionResponse {
	s.ResultMsg = &v
	return s
}

type DeletePersonRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 机构ID(第三方指定ID 50字符)
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty" require:"true" maxLength:"50"`
	// 项目角色ID(1项目管理员、2项目执行人、3项目财务)
	RoleId *int64 `json:"role_id,omitempty" xml:"role_id,omitempty" require:"true"`
	// 项目ID(第三方指定ID 50字符)
	PjId *string `json:"pj_id,omitempty" xml:"pj_id,omitempty" require:"true" maxLength:"50"`
	// 被授权人支付宝用户标识（16字符）
	AlipayUserId *string `json:"alipay_user_id,omitempty" xml:"alipay_user_id,omitempty" require:"true"`
}

func (s DeletePersonRequest) String() string {
	return tea.Prettify(s)
}

func (s DeletePersonRequest) GoString() string {
	return s.String()
}

func (s *DeletePersonRequest) SetAuthToken(v string) *DeletePersonRequest {
	s.AuthToken = &v
	return s
}

func (s *DeletePersonRequest) SetProductInstanceId(v string) *DeletePersonRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeletePersonRequest) SetOrgId(v string) *DeletePersonRequest {
	s.OrgId = &v
	return s
}

func (s *DeletePersonRequest) SetRoleId(v int64) *DeletePersonRequest {
	s.RoleId = &v
	return s
}

func (s *DeletePersonRequest) SetPjId(v string) *DeletePersonRequest {
	s.PjId = &v
	return s
}

func (s *DeletePersonRequest) SetAlipayUserId(v string) *DeletePersonRequest {
	s.AlipayUserId = &v
	return s
}

type DeletePersonResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeletePersonResponse) String() string {
	return tea.Prettify(s)
}

func (s DeletePersonResponse) GoString() string {
	return s.String()
}

func (s *DeletePersonResponse) SetReqMsgId(v string) *DeletePersonResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeletePersonResponse) SetResultCode(v string) *DeletePersonResponse {
	s.ResultCode = &v
	return s
}

func (s *DeletePersonResponse) SetResultMsg(v string) *DeletePersonResponse {
	s.ResultMsg = &v
	return s
}

type InitBatchRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true" maxLength:"50"`
	// 实施内容id
	CombinationId *string `json:"combination_id,omitempty" xml:"combination_id,omitempty" require:"true" maxLength:"50"`
	// 批次名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"100"`
	// 发放备注
	Remarks *string `json:"remarks,omitempty" xml:"remarks,omitempty" require:"true" maxLength:"200"`
	// 确认接收人 0发前确认 1发后确认
	AffirmanceReceivers *int64 `json:"affirmance_receivers,omitempty" xml:"affirmance_receivers,omitempty" require:"true"`
	// 发放方式：【0：自动拨付，1：其他方式拨付，2：快递寄送，3：当面发放，4：服务后确认发放，5：无特定发放方式，6：现场组织】
	IssueWay *int64 `json:"issue_way,omitempty" xml:"issue_way,omitempty" require:"true"`
	// 接收验证方式（0扫脸验证、1身份证号码验证，2扫二维码验证, 3快递签收验证，4登录确认，5直接导入）
	ReceiveCheckWay *int64 `json:"receive_check_way,omitempty" xml:"receive_check_way,omitempty" require:"true"`
	// 分期ID
	StagesId *string `json:"stages_id,omitempty" xml:"stages_id,omitempty" require:"true" maxLength:"50"`
	// 发放数量最大值1亿（发后确认- 扫码领取时必填）单位分
	IssueAmount *int64 `json:"issue_amount,omitempty" xml:"issue_amount,omitempty"`
}

func (s InitBatchRequest) String() string {
	return tea.Prettify(s)
}

func (s InitBatchRequest) GoString() string {
	return s.String()
}

func (s *InitBatchRequest) SetAuthToken(v string) *InitBatchRequest {
	s.AuthToken = &v
	return s
}

func (s *InitBatchRequest) SetProductInstanceId(v string) *InitBatchRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitBatchRequest) SetId(v string) *InitBatchRequest {
	s.Id = &v
	return s
}

func (s *InitBatchRequest) SetCombinationId(v string) *InitBatchRequest {
	s.CombinationId = &v
	return s
}

func (s *InitBatchRequest) SetName(v string) *InitBatchRequest {
	s.Name = &v
	return s
}

func (s *InitBatchRequest) SetRemarks(v string) *InitBatchRequest {
	s.Remarks = &v
	return s
}

func (s *InitBatchRequest) SetAffirmanceReceivers(v int64) *InitBatchRequest {
	s.AffirmanceReceivers = &v
	return s
}

func (s *InitBatchRequest) SetIssueWay(v int64) *InitBatchRequest {
	s.IssueWay = &v
	return s
}

func (s *InitBatchRequest) SetReceiveCheckWay(v int64) *InitBatchRequest {
	s.ReceiveCheckWay = &v
	return s
}

func (s *InitBatchRequest) SetStagesId(v string) *InitBatchRequest {
	s.StagesId = &v
	return s
}

func (s *InitBatchRequest) SetIssueAmount(v int64) *InitBatchRequest {
	s.IssueAmount = &v
	return s
}

type InitBatchResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s InitBatchResponse) String() string {
	return tea.Prettify(s)
}

func (s InitBatchResponse) GoString() string {
	return s.String()
}

func (s *InitBatchResponse) SetReqMsgId(v string) *InitBatchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitBatchResponse) SetResultCode(v string) *InitBatchResponse {
	s.ResultCode = &v
	return s
}

func (s *InitBatchResponse) SetResultMsg(v string) *InitBatchResponse {
	s.ResultMsg = &v
	return s
}

type UpdateBatchRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 批次暂停状态 2继续发放（领取中），3暂停发放，4领取完成
	Status *int64 `json:"status,omitempty" xml:"status,omitempty" require:"true" maximum:"4" minimum:"2"`
}

func (s UpdateBatchRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateBatchRequest) GoString() string {
	return s.String()
}

func (s *UpdateBatchRequest) SetAuthToken(v string) *UpdateBatchRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateBatchRequest) SetProductInstanceId(v string) *UpdateBatchRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateBatchRequest) SetId(v string) *UpdateBatchRequest {
	s.Id = &v
	return s
}

func (s *UpdateBatchRequest) SetStatus(v int64) *UpdateBatchRequest {
	s.Status = &v
	return s
}

type UpdateBatchResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateBatchResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateBatchResponse) GoString() string {
	return s.String()
}

func (s *UpdateBatchResponse) SetReqMsgId(v string) *UpdateBatchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateBatchResponse) SetResultCode(v string) *UpdateBatchResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateBatchResponse) SetResultMsg(v string) *UpdateBatchResponse {
	s.ResultMsg = &v
	return s
}

type DeleteBatchRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true" maxLength:"50"`
}

func (s DeleteBatchRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteBatchRequest) GoString() string {
	return s.String()
}

func (s *DeleteBatchRequest) SetAuthToken(v string) *DeleteBatchRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteBatchRequest) SetProductInstanceId(v string) *DeleteBatchRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteBatchRequest) SetId(v string) *DeleteBatchRequest {
	s.Id = &v
	return s
}

type DeleteBatchResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteBatchResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteBatchResponse) GoString() string {
	return s.String()
}

func (s *DeleteBatchResponse) SetReqMsgId(v string) *DeleteBatchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteBatchResponse) SetResultCode(v string) *DeleteBatchResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteBatchResponse) SetResultMsg(v string) *DeleteBatchResponse {
	s.ResultMsg = &v
	return s
}

type CreateStagesRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 分期id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true" maxLength:"50"`
	// 项目id
	PjId *string `json:"pj_id,omitempty" xml:"pj_id,omitempty" require:"true" maxLength:"50"`
	// 计划开始时间
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 计划结束时间
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 目标捐赠金额
	TargetMoney *int64 `json:"target_money,omitempty" xml:"target_money,omitempty"`
	// 目标捐赠人数
	TargetNum *int64 `json:"target_num,omitempty" xml:"target_num,omitempty"`
	// 说明
	Note *string `json:"note,omitempty" xml:"note,omitempty" maxLength:"1000"`
	// 公开募捐编号
	PublicFundraisingNo *string `json:"public_fundraising_no,omitempty" xml:"public_fundraising_no,omitempty" maxLength:"50"`
	// 静态文件地址‘,’分割
	CoverUrl *string `json:"cover_url,omitempty" xml:"cover_url,omitempty" maxLength:"450"`
	// 管理费用金额(单位：分)
	AdministrativeRate *int64 `json:"administrative_rate,omitempty" xml:"administrative_rate,omitempty"`
	// 签约id,关联签约表
	SignId *string `json:"sign_id,omitempty" xml:"sign_id,omitempty" maxLength:"50"`
}

func (s CreateStagesRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateStagesRequest) GoString() string {
	return s.String()
}

func (s *CreateStagesRequest) SetAuthToken(v string) *CreateStagesRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateStagesRequest) SetProductInstanceId(v string) *CreateStagesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateStagesRequest) SetId(v string) *CreateStagesRequest {
	s.Id = &v
	return s
}

func (s *CreateStagesRequest) SetPjId(v string) *CreateStagesRequest {
	s.PjId = &v
	return s
}

func (s *CreateStagesRequest) SetStartTime(v int64) *CreateStagesRequest {
	s.StartTime = &v
	return s
}

func (s *CreateStagesRequest) SetEndTime(v int64) *CreateStagesRequest {
	s.EndTime = &v
	return s
}

func (s *CreateStagesRequest) SetTargetMoney(v int64) *CreateStagesRequest {
	s.TargetMoney = &v
	return s
}

func (s *CreateStagesRequest) SetTargetNum(v int64) *CreateStagesRequest {
	s.TargetNum = &v
	return s
}

func (s *CreateStagesRequest) SetNote(v string) *CreateStagesRequest {
	s.Note = &v
	return s
}

func (s *CreateStagesRequest) SetPublicFundraisingNo(v string) *CreateStagesRequest {
	s.PublicFundraisingNo = &v
	return s
}

func (s *CreateStagesRequest) SetCoverUrl(v string) *CreateStagesRequest {
	s.CoverUrl = &v
	return s
}

func (s *CreateStagesRequest) SetAdministrativeRate(v int64) *CreateStagesRequest {
	s.AdministrativeRate = &v
	return s
}

func (s *CreateStagesRequest) SetSignId(v string) *CreateStagesRequest {
	s.SignId = &v
	return s
}

type CreateStagesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateStagesResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateStagesResponse) GoString() string {
	return s.String()
}

func (s *CreateStagesResponse) SetReqMsgId(v string) *CreateStagesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateStagesResponse) SetResultCode(v string) *CreateStagesResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateStagesResponse) SetResultMsg(v string) *CreateStagesResponse {
	s.ResultMsg = &v
	return s
}

type QueryBatchRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true" maxLength:"50" minLength:"1"`
}

func (s QueryBatchRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBatchRequest) GoString() string {
	return s.String()
}

func (s *QueryBatchRequest) SetAuthToken(v string) *QueryBatchRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBatchRequest) SetProductInstanceId(v string) *QueryBatchRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBatchRequest) SetId(v string) *QueryBatchRequest {
	s.Id = &v
	return s
}

type QueryBatchResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 批次详情
	BatchDetailVo *BatchDetailVO `json:"batch_detail_vo,omitempty" xml:"batch_detail_vo,omitempty"`
}

func (s QueryBatchResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBatchResponse) GoString() string {
	return s.String()
}

func (s *QueryBatchResponse) SetReqMsgId(v string) *QueryBatchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBatchResponse) SetResultCode(v string) *QueryBatchResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBatchResponse) SetResultMsg(v string) *QueryBatchResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBatchResponse) SetBatchDetailVo(v *BatchDetailVO) *QueryBatchResponse {
	s.BatchDetailVo = v
	return s
}

type UpdateStagesRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 分期id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true" maxLength:"50"`
	// 计划开始时间
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 计划结束时间
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 目标捐赠金额
	TargetMoney *int64 `json:"target_money,omitempty" xml:"target_money,omitempty"`
	// 目标捐赠人数
	TargetNum *int64 `json:"target_num,omitempty" xml:"target_num,omitempty"`
	// 说明
	Note *string `json:"note,omitempty" xml:"note,omitempty" maxLength:"1000"`
	// 公开募捐编号
	PublicFundraisingNo *string `json:"public_fundraising_no,omitempty" xml:"public_fundraising_no,omitempty" maxLength:"50"`
	// 静态文件地址‘,’分割
	CoverUrl *string `json:"cover_url,omitempty" xml:"cover_url,omitempty" maxLength:"450"`
	// 管理费用金额(单位：分)
	AdministrativeRate *int64 `json:"administrative_rate,omitempty" xml:"administrative_rate,omitempty"`
	// 项目状态，0进行中（默认），1已结项
	State *int64 `json:"state,omitempty" xml:"state,omitempty"`
	// 签约id,关联签约表
	SignId *string `json:"sign_id,omitempty" xml:"sign_id,omitempty" maxLength:"50"`
}

func (s UpdateStagesRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateStagesRequest) GoString() string {
	return s.String()
}

func (s *UpdateStagesRequest) SetAuthToken(v string) *UpdateStagesRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateStagesRequest) SetProductInstanceId(v string) *UpdateStagesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateStagesRequest) SetId(v string) *UpdateStagesRequest {
	s.Id = &v
	return s
}

func (s *UpdateStagesRequest) SetStartTime(v int64) *UpdateStagesRequest {
	s.StartTime = &v
	return s
}

func (s *UpdateStagesRequest) SetEndTime(v int64) *UpdateStagesRequest {
	s.EndTime = &v
	return s
}

func (s *UpdateStagesRequest) SetTargetMoney(v int64) *UpdateStagesRequest {
	s.TargetMoney = &v
	return s
}

func (s *UpdateStagesRequest) SetTargetNum(v int64) *UpdateStagesRequest {
	s.TargetNum = &v
	return s
}

func (s *UpdateStagesRequest) SetNote(v string) *UpdateStagesRequest {
	s.Note = &v
	return s
}

func (s *UpdateStagesRequest) SetPublicFundraisingNo(v string) *UpdateStagesRequest {
	s.PublicFundraisingNo = &v
	return s
}

func (s *UpdateStagesRequest) SetCoverUrl(v string) *UpdateStagesRequest {
	s.CoverUrl = &v
	return s
}

func (s *UpdateStagesRequest) SetAdministrativeRate(v int64) *UpdateStagesRequest {
	s.AdministrativeRate = &v
	return s
}

func (s *UpdateStagesRequest) SetState(v int64) *UpdateStagesRequest {
	s.State = &v
	return s
}

func (s *UpdateStagesRequest) SetSignId(v string) *UpdateStagesRequest {
	s.SignId = &v
	return s
}

type UpdateStagesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateStagesResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateStagesResponse) GoString() string {
	return s.String()
}

func (s *UpdateStagesResponse) SetReqMsgId(v string) *UpdateStagesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateStagesResponse) SetResultCode(v string) *UpdateStagesResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateStagesResponse) SetResultMsg(v string) *UpdateStagesResponse {
	s.ResultMsg = &v
	return s
}

type CreateOrgRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 50字符，单平台幂等
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true" maxLength:"50"`
	// 50字符 机构名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"50"`
	// 500字符 机构简介
	Introduction *string `json:"introduction,omitempty" xml:"introduction,omitempty" require:"true" maxLength:"500"`
	// 社会统一信用代码固定18位
	UnifiedSocialCreditCode *string `json:"unified_social_credit_code,omitempty" xml:"unified_social_credit_code,omitempty" require:"true"`
	// 测试机构说明:0正式机构(未填写默认0),1测试机构
	TestFlag *int64 `json:"test_flag,omitempty" xml:"test_flag,omitempty"`
	// 13位时间戳 签约时间
	SignTime *int64 `json:"sign_time,omitempty" xml:"sign_time,omitempty" require:"true"`
}

func (s CreateOrgRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateOrgRequest) GoString() string {
	return s.String()
}

func (s *CreateOrgRequest) SetAuthToken(v string) *CreateOrgRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateOrgRequest) SetProductInstanceId(v string) *CreateOrgRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateOrgRequest) SetId(v string) *CreateOrgRequest {
	s.Id = &v
	return s
}

func (s *CreateOrgRequest) SetName(v string) *CreateOrgRequest {
	s.Name = &v
	return s
}

func (s *CreateOrgRequest) SetIntroduction(v string) *CreateOrgRequest {
	s.Introduction = &v
	return s
}

func (s *CreateOrgRequest) SetUnifiedSocialCreditCode(v string) *CreateOrgRequest {
	s.UnifiedSocialCreditCode = &v
	return s
}

func (s *CreateOrgRequest) SetTestFlag(v int64) *CreateOrgRequest {
	s.TestFlag = &v
	return s
}

func (s *CreateOrgRequest) SetSignTime(v int64) *CreateOrgRequest {
	s.SignTime = &v
	return s
}

type CreateOrgResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateOrgResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateOrgResponse) GoString() string {
	return s.String()
}

func (s *CreateOrgResponse) SetReqMsgId(v string) *CreateOrgResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateOrgResponse) SetResultCode(v string) *CreateOrgResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateOrgResponse) SetResultMsg(v string) *CreateOrgResponse {
	s.ResultMsg = &v
	return s
}

type QueryStagesRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 分期id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true" maxLength:"50"`
}

func (s QueryStagesRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryStagesRequest) GoString() string {
	return s.String()
}

func (s *QueryStagesRequest) SetAuthToken(v string) *QueryStagesRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryStagesRequest) SetProductInstanceId(v string) *QueryStagesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryStagesRequest) SetId(v string) *QueryStagesRequest {
	s.Id = &v
	return s
}

type QueryStagesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分期详情
	OpenStagesDetailVo *StagesDetailVO `json:"open_stages_detail_vo,omitempty" xml:"open_stages_detail_vo,omitempty"`
}

func (s QueryStagesResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryStagesResponse) GoString() string {
	return s.String()
}

func (s *QueryStagesResponse) SetReqMsgId(v string) *QueryStagesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryStagesResponse) SetResultCode(v string) *QueryStagesResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryStagesResponse) SetResultMsg(v string) *QueryStagesResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryStagesResponse) SetOpenStagesDetailVo(v *StagesDetailVO) *QueryStagesResponse {
	s.OpenStagesDetailVo = v
	return s
}

type UpdateOrgRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 50字符，单平台幂等
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true" maxLength:"50"`
	// 500字符 机构简介
	Introduction *string `json:"introduction,omitempty" xml:"introduction,omitempty" maxLength:"500"`
	// 社会统一信用代码固定18位
	UnifiedSocialCreditCode *string `json:"unified_social_credit_code,omitempty" xml:"unified_social_credit_code,omitempty"`
	// 13位时间戳 签约时间
	SignTime *int64 `json:"sign_time,omitempty" xml:"sign_time,omitempty"`
}

func (s UpdateOrgRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateOrgRequest) GoString() string {
	return s.String()
}

func (s *UpdateOrgRequest) SetAuthToken(v string) *UpdateOrgRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateOrgRequest) SetProductInstanceId(v string) *UpdateOrgRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateOrgRequest) SetId(v string) *UpdateOrgRequest {
	s.Id = &v
	return s
}

func (s *UpdateOrgRequest) SetIntroduction(v string) *UpdateOrgRequest {
	s.Introduction = &v
	return s
}

func (s *UpdateOrgRequest) SetUnifiedSocialCreditCode(v string) *UpdateOrgRequest {
	s.UnifiedSocialCreditCode = &v
	return s
}

func (s *UpdateOrgRequest) SetSignTime(v int64) *UpdateOrgRequest {
	s.SignTime = &v
	return s
}

type UpdateOrgResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateOrgResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateOrgResponse) GoString() string {
	return s.String()
}

func (s *UpdateOrgResponse) SetReqMsgId(v string) *UpdateOrgResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateOrgResponse) SetResultCode(v string) *UpdateOrgResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateOrgResponse) SetResultMsg(v string) *UpdateOrgResponse {
	s.ResultMsg = &v
	return s
}

type CreateCombinationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 实施内容id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true" maxLength:"50"`
	// 分期id
	StagesId *string `json:"stages_id,omitempty" xml:"stages_id,omitempty" require:"true" maxLength:"50"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"20"`
	// 实施内容类型：0善款类，1实物类、2服务类
	Type *int64 `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 单位
	Unit *string `json:"unit,omitempty" xml:"unit,omitempty" require:"true" maxLength:"10"`
	// 说明
	Note *string `json:"note,omitempty" xml:"note,omitempty" maxLength:"1000"`
	// 单价是否固定，0:不固定，1:固定
	PriceDeterminedFlag *int64 `json:"price_determined_flag,omitempty" xml:"price_determined_flag,omitempty" require:"true"`
	// 单位分，预估单价
	Price *int64 `json:"price,omitempty" xml:"price,omitempty" require:"true"`
	// 预估发放数量
	TotalNum *int64 `json:"total_num,omitempty" xml:"total_num,omitempty" require:"true"`
}

func (s CreateCombinationRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateCombinationRequest) GoString() string {
	return s.String()
}

func (s *CreateCombinationRequest) SetAuthToken(v string) *CreateCombinationRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateCombinationRequest) SetProductInstanceId(v string) *CreateCombinationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateCombinationRequest) SetId(v string) *CreateCombinationRequest {
	s.Id = &v
	return s
}

func (s *CreateCombinationRequest) SetStagesId(v string) *CreateCombinationRequest {
	s.StagesId = &v
	return s
}

func (s *CreateCombinationRequest) SetName(v string) *CreateCombinationRequest {
	s.Name = &v
	return s
}

func (s *CreateCombinationRequest) SetType(v int64) *CreateCombinationRequest {
	s.Type = &v
	return s
}

func (s *CreateCombinationRequest) SetUnit(v string) *CreateCombinationRequest {
	s.Unit = &v
	return s
}

func (s *CreateCombinationRequest) SetNote(v string) *CreateCombinationRequest {
	s.Note = &v
	return s
}

func (s *CreateCombinationRequest) SetPriceDeterminedFlag(v int64) *CreateCombinationRequest {
	s.PriceDeterminedFlag = &v
	return s
}

func (s *CreateCombinationRequest) SetPrice(v int64) *CreateCombinationRequest {
	s.Price = &v
	return s
}

func (s *CreateCombinationRequest) SetTotalNum(v int64) *CreateCombinationRequest {
	s.TotalNum = &v
	return s
}

type CreateCombinationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateCombinationResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateCombinationResponse) GoString() string {
	return s.String()
}

func (s *CreateCombinationResponse) SetReqMsgId(v string) *CreateCombinationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateCombinationResponse) SetResultCode(v string) *CreateCombinationResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateCombinationResponse) SetResultMsg(v string) *CreateCombinationResponse {
	s.ResultMsg = &v
	return s
}

type DetailOrgRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 50字符，单平台幂等
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true" maxLength:"50"`
}

func (s DetailOrgRequest) String() string {
	return tea.Prettify(s)
}

func (s DetailOrgRequest) GoString() string {
	return s.String()
}

func (s *DetailOrgRequest) SetAuthToken(v string) *DetailOrgRequest {
	s.AuthToken = &v
	return s
}

func (s *DetailOrgRequest) SetProductInstanceId(v string) *DetailOrgRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DetailOrgRequest) SetId(v string) *DetailOrgRequest {
	s.Id = &v
	return s
}

type DetailOrgResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 机构详情结构体
	OrgVo *OrgVO `json:"org_vo,omitempty" xml:"org_vo,omitempty"`
}

func (s DetailOrgResponse) String() string {
	return tea.Prettify(s)
}

func (s DetailOrgResponse) GoString() string {
	return s.String()
}

func (s *DetailOrgResponse) SetReqMsgId(v string) *DetailOrgResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DetailOrgResponse) SetResultCode(v string) *DetailOrgResponse {
	s.ResultCode = &v
	return s
}

func (s *DetailOrgResponse) SetResultMsg(v string) *DetailOrgResponse {
	s.ResultMsg = &v
	return s
}

func (s *DetailOrgResponse) SetOrgVo(v *OrgVO) *DetailOrgResponse {
	s.OrgVo = v
	return s
}

type UpdateCombinationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 实施内容id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true" maxLength:"50"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" maxLength:"20"`
	// 实施内容类型：0善款类，1实物类、2服务类
	Type *int64 `json:"type,omitempty" xml:"type,omitempty"`
	// 单位
	Unit *string `json:"unit,omitempty" xml:"unit,omitempty" maxLength:"10"`
	// 说明
	Note *string `json:"note,omitempty" xml:"note,omitempty" maxLength:"1000"`
	// 单价是否固定，0:不固定，1:固定
	PriceDeterminedFlag *int64 `json:"price_determined_flag,omitempty" xml:"price_determined_flag,omitempty"`
	// 单位分，预估单价
	Price *int64 `json:"price,omitempty" xml:"price,omitempty"`
	// 预估发放数量
	TotalNum *int64 `json:"total_num,omitempty" xml:"total_num,omitempty"`
}

func (s UpdateCombinationRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateCombinationRequest) GoString() string {
	return s.String()
}

func (s *UpdateCombinationRequest) SetAuthToken(v string) *UpdateCombinationRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateCombinationRequest) SetProductInstanceId(v string) *UpdateCombinationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateCombinationRequest) SetId(v string) *UpdateCombinationRequest {
	s.Id = &v
	return s
}

func (s *UpdateCombinationRequest) SetName(v string) *UpdateCombinationRequest {
	s.Name = &v
	return s
}

func (s *UpdateCombinationRequest) SetType(v int64) *UpdateCombinationRequest {
	s.Type = &v
	return s
}

func (s *UpdateCombinationRequest) SetUnit(v string) *UpdateCombinationRequest {
	s.Unit = &v
	return s
}

func (s *UpdateCombinationRequest) SetNote(v string) *UpdateCombinationRequest {
	s.Note = &v
	return s
}

func (s *UpdateCombinationRequest) SetPriceDeterminedFlag(v int64) *UpdateCombinationRequest {
	s.PriceDeterminedFlag = &v
	return s
}

func (s *UpdateCombinationRequest) SetPrice(v int64) *UpdateCombinationRequest {
	s.Price = &v
	return s
}

func (s *UpdateCombinationRequest) SetTotalNum(v int64) *UpdateCombinationRequest {
	s.TotalNum = &v
	return s
}

type UpdateCombinationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateCombinationResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateCombinationResponse) GoString() string {
	return s.String()
}

func (s *UpdateCombinationResponse) SetReqMsgId(v string) *UpdateCombinationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateCombinationResponse) SetResultCode(v string) *UpdateCombinationResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateCombinationResponse) SetResultMsg(v string) *UpdateCombinationResponse {
	s.ResultMsg = &v
	return s
}

type CreateProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 50字符，单平台幂等
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true" maxLength:"50"`
	// 50字符 机构id
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty" require:"true" maxLength:"50"`
	// 100字符 项目名称
	PjName *string `json:"pj_name,omitempty" xml:"pj_name,omitempty" require:"true" maxLength:"100"`
	// 64字符  公益领域（系统判断是否维护公益领域字典表，数据库存id）
	PublicWelfareDirection *string `json:"public_welfare_direction,omitempty" xml:"public_welfare_direction,omitempty" require:"true" maxLength:"64"`
	// 测试项目说明:0正式项目(未填写默认0),1测试项目
	TestFlag *int64 `json:"test_flag,omitempty" xml:"test_flag,omitempty"`
}

func (s CreateProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateProjectRequest) GoString() string {
	return s.String()
}

func (s *CreateProjectRequest) SetAuthToken(v string) *CreateProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateProjectRequest) SetProductInstanceId(v string) *CreateProjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateProjectRequest) SetId(v string) *CreateProjectRequest {
	s.Id = &v
	return s
}

func (s *CreateProjectRequest) SetOrgId(v string) *CreateProjectRequest {
	s.OrgId = &v
	return s
}

func (s *CreateProjectRequest) SetPjName(v string) *CreateProjectRequest {
	s.PjName = &v
	return s
}

func (s *CreateProjectRequest) SetPublicWelfareDirection(v string) *CreateProjectRequest {
	s.PublicWelfareDirection = &v
	return s
}

func (s *CreateProjectRequest) SetTestFlag(v int64) *CreateProjectRequest {
	s.TestFlag = &v
	return s
}

type CreateProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateProjectResponse) GoString() string {
	return s.String()
}

func (s *CreateProjectResponse) SetReqMsgId(v string) *CreateProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateProjectResponse) SetResultCode(v string) *CreateProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateProjectResponse) SetResultMsg(v string) *CreateProjectResponse {
	s.ResultMsg = &v
	return s
}

type UpdateProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 50字符，单平台幂等
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true" maxLength:"50"`
	// 100字符 项目名称
	PjName *string `json:"pj_name,omitempty" xml:"pj_name,omitempty" maxLength:"100"`
	// 64字符 公益领域（系统判断是否维护公益领域字典表，数据库存id）
	PublicWelfareDirection *string `json:"public_welfare_direction,omitempty" xml:"public_welfare_direction,omitempty" maxLength:"64"`
	// 测试项目说明:0正式项目(未填写默认0),1测试项目
	TestFlag *int64 `json:"test_flag,omitempty" xml:"test_flag,omitempty"`
}

func (s UpdateProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateProjectRequest) GoString() string {
	return s.String()
}

func (s *UpdateProjectRequest) SetAuthToken(v string) *UpdateProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateProjectRequest) SetProductInstanceId(v string) *UpdateProjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateProjectRequest) SetId(v string) *UpdateProjectRequest {
	s.Id = &v
	return s
}

func (s *UpdateProjectRequest) SetPjName(v string) *UpdateProjectRequest {
	s.PjName = &v
	return s
}

func (s *UpdateProjectRequest) SetPublicWelfareDirection(v string) *UpdateProjectRequest {
	s.PublicWelfareDirection = &v
	return s
}

func (s *UpdateProjectRequest) SetTestFlag(v int64) *UpdateProjectRequest {
	s.TestFlag = &v
	return s
}

type UpdateProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateProjectResponse) GoString() string {
	return s.String()
}

func (s *UpdateProjectResponse) SetReqMsgId(v string) *UpdateProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateProjectResponse) SetResultCode(v string) *UpdateProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateProjectResponse) SetResultMsg(v string) *UpdateProjectResponse {
	s.ResultMsg = &v
	return s
}

type DetailProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 50字符，单平台幂等
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true" maxLength:"50"`
}

func (s DetailProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s DetailProjectRequest) GoString() string {
	return s.String()
}

func (s *DetailProjectRequest) SetAuthToken(v string) *DetailProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *DetailProjectRequest) SetProductInstanceId(v string) *DetailProjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DetailProjectRequest) SetId(v string) *DetailProjectRequest {
	s.Id = &v
	return s
}

type DetailProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 项目结构体
	ProjectVo *ProjectVO `json:"project_vo,omitempty" xml:"project_vo,omitempty"`
}

func (s DetailProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s DetailProjectResponse) GoString() string {
	return s.String()
}

func (s *DetailProjectResponse) SetReqMsgId(v string) *DetailProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DetailProjectResponse) SetResultCode(v string) *DetailProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *DetailProjectResponse) SetResultMsg(v string) *DetailProjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *DetailProjectResponse) SetProjectVo(v *ProjectVO) *DetailProjectResponse {
	s.ProjectVo = v
	return s
}

type QueryCombinationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 实施内容id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true" maxLength:"50"`
}

func (s QueryCombinationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCombinationRequest) GoString() string {
	return s.String()
}

func (s *QueryCombinationRequest) SetAuthToken(v string) *QueryCombinationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCombinationRequest) SetProductInstanceId(v string) *QueryCombinationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCombinationRequest) SetId(v string) *QueryCombinationRequest {
	s.Id = &v
	return s
}

type QueryCombinationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实施内容详情
	OpenSubjectCombinationVo *OpenSubjectCombinationVO `json:"open_subject_combination_vo,omitempty" xml:"open_subject_combination_vo,omitempty"`
}

func (s QueryCombinationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCombinationResponse) GoString() string {
	return s.String()
}

func (s *QueryCombinationResponse) SetReqMsgId(v string) *QueryCombinationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCombinationResponse) SetResultCode(v string) *QueryCombinationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCombinationResponse) SetResultMsg(v string) *QueryCombinationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCombinationResponse) SetOpenSubjectCombinationVo(v *OpenSubjectCombinationVO) *QueryCombinationResponse {
	s.OpenSubjectCombinationVo = v
	return s
}

type BatchcreateRecordRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 批次id
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty" require:"true" maxLength:"50"`
	// 执行记录数组
	ReceivedRecordList []*ReceivedRecord `json:"received_record_list,omitempty" xml:"received_record_list,omitempty" require:"true" type:"Repeated"`
}

func (s BatchcreateRecordRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateRecordRequest) GoString() string {
	return s.String()
}

func (s *BatchcreateRecordRequest) SetAuthToken(v string) *BatchcreateRecordRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchcreateRecordRequest) SetProductInstanceId(v string) *BatchcreateRecordRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchcreateRecordRequest) SetBatchId(v string) *BatchcreateRecordRequest {
	s.BatchId = &v
	return s
}

func (s *BatchcreateRecordRequest) SetReceivedRecordList(v []*ReceivedRecord) *BatchcreateRecordRequest {
	s.ReceivedRecordList = v
	return s
}

type BatchcreateRecordResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BatchcreateRecordResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateRecordResponse) GoString() string {
	return s.String()
}

func (s *BatchcreateRecordResponse) SetReqMsgId(v string) *BatchcreateRecordResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchcreateRecordResponse) SetResultCode(v string) *BatchcreateRecordResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchcreateRecordResponse) SetResultMsg(v string) *BatchcreateRecordResponse {
	s.ResultMsg = &v
	return s
}

type CreateBatchRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 分期ID
	StagesId *string `json:"stages_id,omitempty" xml:"stages_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 实施内容id
	CombinationId *string `json:"combination_id,omitempty" xml:"combination_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 批次名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"100" minLength:"1"`
	// 备注
	Remarks *string `json:"remarks,omitempty" xml:"remarks,omitempty" require:"true" maxLength:"200" minLength:"1"`
	// 接收验证方式（0扫脸验证、2扫二维码验证, 3快递签收验证，4登录确认）
	IssueWay *int64 `json:"issue_way,omitempty" xml:"issue_way,omitempty" require:"true"`
	// 确认接收人 0发前确认 1发后确认
	AffirmanceReceivers *int64 `json:"affirmance_receivers,omitempty" xml:"affirmance_receivers,omitempty" require:"true"`
	// 接收方式（0扫脸验证、1身份证号码验证，2扫二维码验证, 3直接导入
	ReceiveCheckWay *int64 `json:"receive_check_way,omitempty" xml:"receive_check_way,omitempty" require:"true"`
	// 发放数量最大值1亿（发后确认- 扫码领取时必填）单位分
	IssueAmount *int64 `json:"issue_amount,omitempty" xml:"issue_amount,omitempty"`
}

func (s CreateBatchRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBatchRequest) GoString() string {
	return s.String()
}

func (s *CreateBatchRequest) SetAuthToken(v string) *CreateBatchRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBatchRequest) SetProductInstanceId(v string) *CreateBatchRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBatchRequest) SetId(v string) *CreateBatchRequest {
	s.Id = &v
	return s
}

func (s *CreateBatchRequest) SetStagesId(v string) *CreateBatchRequest {
	s.StagesId = &v
	return s
}

func (s *CreateBatchRequest) SetCombinationId(v string) *CreateBatchRequest {
	s.CombinationId = &v
	return s
}

func (s *CreateBatchRequest) SetName(v string) *CreateBatchRequest {
	s.Name = &v
	return s
}

func (s *CreateBatchRequest) SetRemarks(v string) *CreateBatchRequest {
	s.Remarks = &v
	return s
}

func (s *CreateBatchRequest) SetIssueWay(v int64) *CreateBatchRequest {
	s.IssueWay = &v
	return s
}

func (s *CreateBatchRequest) SetAffirmanceReceivers(v int64) *CreateBatchRequest {
	s.AffirmanceReceivers = &v
	return s
}

func (s *CreateBatchRequest) SetReceiveCheckWay(v int64) *CreateBatchRequest {
	s.ReceiveCheckWay = &v
	return s
}

func (s *CreateBatchRequest) SetIssueAmount(v int64) *CreateBatchRequest {
	s.IssueAmount = &v
	return s
}

type CreateBatchResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateBatchResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBatchResponse) GoString() string {
	return s.String()
}

func (s *CreateBatchResponse) SetReqMsgId(v string) *CreateBatchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBatchResponse) SetResultCode(v string) *CreateBatchResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBatchResponse) SetResultMsg(v string) *CreateBatchResponse {
	s.ResultMsg = &v
	return s
}

type UpdateRecordRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 快递单号，50字符（发放方式（issue_way）为快递寄送时可修改）
	ExpressNumber *string `json:"express_number,omitempty" xml:"express_number,omitempty" maxLength:"50" minLength:"1"`
	// 快递公司，50字符（发放方式（issue_way）为快递寄送时可修改）
	ExpressCompany *string `json:"express_company,omitempty" xml:"express_company,omitempty" maxLength:"50" minLength:"1"`
	// 快递地址，100字符（发放方式（issue_way）为快递寄送时可修改）
	ExpressAddress *string `json:"express_address,omitempty" xml:"express_address,omitempty" maxLength:"100" minLength:"1"`
	// 支付流水号，100字符（实施内容为善款类且执行记录状态为待发放（receive_status）必填）
	PaySerialNumber *string `json:"pay_serial_number,omitempty" xml:"pay_serial_number,omitempty" maxLength:"100" minLength:"1"`
	// 转账方式，100字符 发放方式为善款类且执行记录状态为待发放（receive_status）必填）
	TransferMethod *string `json:"transfer_method,omitempty" xml:"transfer_method,omitempty" maxLength:"100" minLength:"1"`
}

func (s UpdateRecordRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateRecordRequest) GoString() string {
	return s.String()
}

func (s *UpdateRecordRequest) SetAuthToken(v string) *UpdateRecordRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateRecordRequest) SetProductInstanceId(v string) *UpdateRecordRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateRecordRequest) SetId(v string) *UpdateRecordRequest {
	s.Id = &v
	return s
}

func (s *UpdateRecordRequest) SetExpressNumber(v string) *UpdateRecordRequest {
	s.ExpressNumber = &v
	return s
}

func (s *UpdateRecordRequest) SetExpressCompany(v string) *UpdateRecordRequest {
	s.ExpressCompany = &v
	return s
}

func (s *UpdateRecordRequest) SetExpressAddress(v string) *UpdateRecordRequest {
	s.ExpressAddress = &v
	return s
}

func (s *UpdateRecordRequest) SetPaySerialNumber(v string) *UpdateRecordRequest {
	s.PaySerialNumber = &v
	return s
}

func (s *UpdateRecordRequest) SetTransferMethod(v string) *UpdateRecordRequest {
	s.TransferMethod = &v
	return s
}

type UpdateRecordResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateRecordResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateRecordResponse) GoString() string {
	return s.String()
}

func (s *UpdateRecordResponse) SetReqMsgId(v string) *UpdateRecordResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateRecordResponse) SetResultCode(v string) *UpdateRecordResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateRecordResponse) SetResultMsg(v string) *UpdateRecordResponse {
	s.ResultMsg = &v
	return s
}

type BatchcreateCombinationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 分期id
	StagesId *string `json:"stages_id,omitempty" xml:"stages_id,omitempty" require:"true"`
	// 实施内容信息集合
	CombinationMessageList []*SubjectCombinationMessage `json:"combination_message_list,omitempty" xml:"combination_message_list,omitempty" require:"true" type:"Repeated"`
}

func (s BatchcreateCombinationRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateCombinationRequest) GoString() string {
	return s.String()
}

func (s *BatchcreateCombinationRequest) SetAuthToken(v string) *BatchcreateCombinationRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchcreateCombinationRequest) SetProductInstanceId(v string) *BatchcreateCombinationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchcreateCombinationRequest) SetStagesId(v string) *BatchcreateCombinationRequest {
	s.StagesId = &v
	return s
}

func (s *BatchcreateCombinationRequest) SetCombinationMessageList(v []*SubjectCombinationMessage) *BatchcreateCombinationRequest {
	s.CombinationMessageList = v
	return s
}

type BatchcreateCombinationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BatchcreateCombinationResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateCombinationResponse) GoString() string {
	return s.String()
}

func (s *BatchcreateCombinationResponse) SetReqMsgId(v string) *BatchcreateCombinationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchcreateCombinationResponse) SetResultCode(v string) *BatchcreateCombinationResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchcreateCombinationResponse) SetResultMsg(v string) *BatchcreateCombinationResponse {
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
				"sdk_version":      tea.String("1.0.14"),
				"_prod_code":       tea.String("MYCHARITY"),
				"_prod_channel":    tea.String("undefined"),
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
 * Description: 待签约账号创建
 * Summary: 待签约账号创建
 */
func (client *Client) CreateAlipaysign(request *CreateAlipaysignRequest) (_result *CreateAlipaysignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAlipaysignResponse{}
	_body, _err := client.CreateAlipaysignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 待签约账号创建
 * Summary: 待签约账号创建
 */
func (client *Client) CreateAlipaysignEx(request *CreateAlipaysignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAlipaysignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAlipaysignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mycharity.alipaysign.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 机构下代扣账号签约状态查询
 * Summary: 机构下代扣账号签约状态查询
 */
func (client *Client) QueryAlipaysignState(request *QueryAlipaysignStateRequest) (_result *QueryAlipaysignStateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAlipaysignStateResponse{}
	_body, _err := client.QueryAlipaysignStateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 机构下代扣账号签约状态查询
 * Summary: 机构下代扣账号签约状态查询
 */
func (client *Client) QueryAlipaysignStateEx(request *QueryAlipaysignStateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAlipaysignStateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAlipaysignStateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mycharity.alipaysign.state.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 账号签约二维码获取
 * Summary: 账号签约二维码获取
 */
func (client *Client) QueryAlipaysignQrcode(request *QueryAlipaysignQrcodeRequest) (_result *QueryAlipaysignQrcodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAlipaysignQrcodeResponse{}
	_body, _err := client.QueryAlipaysignQrcodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 账号签约二维码获取
 * Summary: 账号签约二维码获取
 */
func (client *Client) QueryAlipaysignQrcodeEx(request *QueryAlipaysignQrcodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAlipaysignQrcodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAlipaysignQrcodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mycharity.alipaysign.qrcode.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建人员并配置权限。如人员已经存在，则不创建。
 * Summary: 创建人员及配置权限
 */
func (client *Client) CreatePersonPermission(request *CreatePersonPermissionRequest) (_result *CreatePersonPermissionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreatePersonPermissionResponse{}
	_body, _err := client.CreatePersonPermissionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建人员并配置权限。如人员已经存在，则不创建。
 * Summary: 创建人员及配置权限
 */
func (client *Client) CreatePersonPermissionEx(request *CreatePersonPermissionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreatePersonPermissionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreatePersonPermissionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mycharity.person.permission.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 允许已授权的用户通过此接口删除人员权限。
 * Summary: 配置权限删除
 */
func (client *Client) DeletePerson(request *DeletePersonRequest) (_result *DeletePersonResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeletePersonResponse{}
	_body, _err := client.DeletePersonEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 允许已授权的用户通过此接口删除人员权限。
 * Summary: 配置权限删除
 */
func (client *Client) DeletePersonEx(request *DeletePersonRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeletePersonResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeletePersonResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mycharity.person.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建批次
 * Summary: 创建批次
 */
func (client *Client) InitBatch(request *InitBatchRequest) (_result *InitBatchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitBatchResponse{}
	_body, _err := client.InitBatchEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建批次
 * Summary: 创建批次
 */
func (client *Client) InitBatchEx(request *InitBatchRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitBatchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitBatchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mycharity.batch.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 修改批次状态
 * Summary: 修改批次状态
 */
func (client *Client) UpdateBatch(request *UpdateBatchRequest) (_result *UpdateBatchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateBatchResponse{}
	_body, _err := client.UpdateBatchEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 修改批次状态
 * Summary: 修改批次状态
 */
func (client *Client) UpdateBatchEx(request *UpdateBatchRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateBatchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateBatchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mycharity.batch.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除批次
 * Summary: 删除批次
 */
func (client *Client) DeleteBatch(request *DeleteBatchRequest) (_result *DeleteBatchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteBatchResponse{}
	_body, _err := client.DeleteBatchEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除批次
 * Summary: 删除批次
 */
func (client *Client) DeleteBatchEx(request *DeleteBatchRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteBatchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteBatchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mycharity.batch.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建项目分期
 * Summary: 创建分期
 */
func (client *Client) CreateStages(request *CreateStagesRequest) (_result *CreateStagesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateStagesResponse{}
	_body, _err := client.CreateStagesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建项目分期
 * Summary: 创建分期
 */
func (client *Client) CreateStagesEx(request *CreateStagesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateStagesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateStagesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mycharity.stages.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询批次
 * Summary: 查询批次
 */
func (client *Client) QueryBatch(request *QueryBatchRequest) (_result *QueryBatchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBatchResponse{}
	_body, _err := client.QueryBatchEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询批次
 * Summary: 查询批次
 */
func (client *Client) QueryBatchEx(request *QueryBatchRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBatchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBatchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mycharity.batch.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新项目分期
 * Summary: 更新分期
 */
func (client *Client) UpdateStages(request *UpdateStagesRequest) (_result *UpdateStagesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateStagesResponse{}
	_body, _err := client.UpdateStagesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新项目分期
 * Summary: 更新分期
 */
func (client *Client) UpdateStagesEx(request *UpdateStagesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateStagesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateStagesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mycharity.stages.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建机构
 * Summary: 创建机构
 */
func (client *Client) CreateOrg(request *CreateOrgRequest) (_result *CreateOrgResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateOrgResponse{}
	_body, _err := client.CreateOrgEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建机构
 * Summary: 创建机构
 */
func (client *Client) CreateOrgEx(request *CreateOrgRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateOrgResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateOrgResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mycharity.org.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询分期
 * Summary: 查询分期
 */
func (client *Client) QueryStages(request *QueryStagesRequest) (_result *QueryStagesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryStagesResponse{}
	_body, _err := client.QueryStagesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询分期
 * Summary: 查询分期
 */
func (client *Client) QueryStagesEx(request *QueryStagesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryStagesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryStagesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mycharity.stages.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新机构
 * Summary: 更新机构
 */
func (client *Client) UpdateOrg(request *UpdateOrgRequest) (_result *UpdateOrgResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateOrgResponse{}
	_body, _err := client.UpdateOrgEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新机构
 * Summary: 更新机构
 */
func (client *Client) UpdateOrgEx(request *UpdateOrgRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateOrgResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateOrgResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mycharity.org.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建实施内容
 * Summary: 创建实施内容
 */
func (client *Client) CreateCombination(request *CreateCombinationRequest) (_result *CreateCombinationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateCombinationResponse{}
	_body, _err := client.CreateCombinationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建实施内容
 * Summary: 创建实施内容
 */
func (client *Client) CreateCombinationEx(request *CreateCombinationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateCombinationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateCombinationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mycharity.combination.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 机构详情
 * Summary: 机构详情
 */
func (client *Client) DetailOrg(request *DetailOrgRequest) (_result *DetailOrgResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DetailOrgResponse{}
	_body, _err := client.DetailOrgEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 机构详情
 * Summary: 机构详情
 */
func (client *Client) DetailOrgEx(request *DetailOrgRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DetailOrgResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DetailOrgResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mycharity.org.detail"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 修改实施内容
 * Summary: 修改实施内容
 */
func (client *Client) UpdateCombination(request *UpdateCombinationRequest) (_result *UpdateCombinationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateCombinationResponse{}
	_body, _err := client.UpdateCombinationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 修改实施内容
 * Summary: 修改实施内容
 */
func (client *Client) UpdateCombinationEx(request *UpdateCombinationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateCombinationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateCombinationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mycharity.combination.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建项目
 * Summary: 创建项目
 */
func (client *Client) CreateProject(request *CreateProjectRequest) (_result *CreateProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateProjectResponse{}
	_body, _err := client.CreateProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建项目
 * Summary: 创建项目
 */
func (client *Client) CreateProjectEx(request *CreateProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mycharity.project.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新项目
 * Summary: 更新项目
 */
func (client *Client) UpdateProject(request *UpdateProjectRequest) (_result *UpdateProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateProjectResponse{}
	_body, _err := client.UpdateProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新项目
 * Summary: 更新项目
 */
func (client *Client) UpdateProjectEx(request *UpdateProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mycharity.project.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 项目详情
 * Summary: 项目详情
 */
func (client *Client) DetailProject(request *DetailProjectRequest) (_result *DetailProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DetailProjectResponse{}
	_body, _err := client.DetailProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 项目详情
 * Summary: 项目详情
 */
func (client *Client) DetailProjectEx(request *DetailProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DetailProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DetailProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mycharity.project.detail"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询实施内容
 * Summary: 查询实施内容
 */
func (client *Client) QueryCombination(request *QueryCombinationRequest) (_result *QueryCombinationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCombinationResponse{}
	_body, _err := client.QueryCombinationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询实施内容
 * Summary: 查询实施内容
 */
func (client *Client) QueryCombinationEx(request *QueryCombinationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCombinationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCombinationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mycharity.combination.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 批量创建执行记录
 * Summary: 批量创建执行记录
 */
func (client *Client) BatchcreateRecord(request *BatchcreateRecordRequest) (_result *BatchcreateRecordResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchcreateRecordResponse{}
	_body, _err := client.BatchcreateRecordEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 批量创建执行记录
 * Summary: 批量创建执行记录
 */
func (client *Client) BatchcreateRecordEx(request *BatchcreateRecordRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchcreateRecordResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchcreateRecordResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mycharity.record.batchcreate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建批次
 * Summary: 创建批次
 */
func (client *Client) CreateBatch(request *CreateBatchRequest) (_result *CreateBatchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBatchResponse{}
	_body, _err := client.CreateBatchEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建批次
 * Summary: 创建批次
 */
func (client *Client) CreateBatchEx(request *CreateBatchRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBatchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBatchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mycharity.batch.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 修改执行记录状态
 * Summary: 修改执行记录状态
 */
func (client *Client) UpdateRecord(request *UpdateRecordRequest) (_result *UpdateRecordResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateRecordResponse{}
	_body, _err := client.UpdateRecordEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 修改执行记录状态
 * Summary: 修改执行记录状态
 */
func (client *Client) UpdateRecordEx(request *UpdateRecordRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateRecordResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateRecordResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mycharity.record.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 批量创建、修改、删除实施内容
 * Summary: 批量创建、修改、删除实施内容
 */
func (client *Client) BatchcreateCombination(request *BatchcreateCombinationRequest) (_result *BatchcreateCombinationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchcreateCombinationResponse{}
	_body, _err := client.BatchcreateCombinationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 批量创建、修改、删除实施内容
 * Summary: 批量创建、修改、删除实施内容
 */
func (client *Client) BatchcreateCombinationEx(request *BatchcreateCombinationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchcreateCombinationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchcreateCombinationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mycharity.combination.batchcreate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
