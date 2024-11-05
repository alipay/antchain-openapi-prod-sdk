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

// 附件上传表单参数
type FormParam struct {
	//
	OssAccessKeyId *string `json:"oss_access_key_id,omitempty" xml:"oss_access_key_id,omitempty" require:"true"`
	//
	Callback *string `json:"callback,omitempty" xml:"callback,omitempty" require:"true"`
	//
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	//
	Policy *string `json:"policy,omitempty" xml:"policy,omitempty" require:"true"`
	//
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
	//
	SuccessActionStatus *string `json:"success_action_status,omitempty" xml:"success_action_status,omitempty" require:"true"`
	//
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
}

func (s FormParam) String() string {
	return tea.Prettify(s)
}

func (s FormParam) GoString() string {
	return s.String()
}

func (s *FormParam) SetOssAccessKeyId(v string) *FormParam {
	s.OssAccessKeyId = &v
	return s
}

func (s *FormParam) SetCallback(v string) *FormParam {
	s.Callback = &v
	return s
}

func (s *FormParam) SetKey(v string) *FormParam {
	s.Key = &v
	return s
}

func (s *FormParam) SetPolicy(v string) *FormParam {
	s.Policy = &v
	return s
}

func (s *FormParam) SetSignature(v string) *FormParam {
	s.Signature = &v
	return s
}

func (s *FormParam) SetSuccessActionStatus(v string) *FormParam {
	s.SuccessActionStatus = &v
	return s
}

func (s *FormParam) SetAppName(v string) *FormParam {
	s.AppName = &v
	return s
}

// 附件上传
type UploadRequest struct {
	// 文件流/文件地址
	Stream *string `json:"stream,omitempty" xml:"stream,omitempty" require:"true"`
	// 文件名称
	Filename *string `json:"filename,omitempty" xml:"filename,omitempty" require:"true"`
	// 内外工号
	User *string `json:"user,omitempty" xml:"user,omitempty" require:"true"`
	// 附件的关联对象类型
	TargetType *string `json:"target_type,omitempty" xml:"target_type,omitempty" require:"true"`
	// 附件的关联对象ID
	TargetId *int64 `json:"target_id,omitempty" xml:"target_id,omitempty" require:"true"`
}

func (s UploadRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadRequest) GoString() string {
	return s.String()
}

func (s *UploadRequest) SetStream(v string) *UploadRequest {
	s.Stream = &v
	return s
}

func (s *UploadRequest) SetFilename(v string) *UploadRequest {
	s.Filename = &v
	return s
}

func (s *UploadRequest) SetUser(v string) *UploadRequest {
	s.User = &v
	return s
}

func (s *UploadRequest) SetTargetType(v string) *UploadRequest {
	s.TargetType = &v
	return s
}

func (s *UploadRequest) SetTargetId(v int64) *UploadRequest {
	s.TargetId = &v
	return s
}

// 返回结果
type ResultMap struct {
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// value
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s ResultMap) String() string {
	return tea.Prettify(s)
}

func (s ResultMap) GoString() string {
	return s.String()
}

func (s *ResultMap) SetName(v string) *ResultMap {
	s.Name = &v
	return s
}

func (s *ResultMap) SetValue(v string) *ResultMap {
	s.Value = &v
	return s
}

// 文件集合
type UploadRequestArray struct {
	// 文件数据
	UploadArray *UploadRequest `json:"upload_array,omitempty" xml:"upload_array,omitempty" require:"true"`
}

func (s UploadRequestArray) String() string {
	return tea.Prettify(s)
}

func (s UploadRequestArray) GoString() string {
	return s.String()
}

func (s *UploadRequestArray) SetUploadArray(v *UploadRequest) *UploadRequestArray {
	s.UploadArray = v
	return s
}

// 事件详情
type Emergency struct {
	// 标题
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
	// 账号
	Account *string `json:"account,omitempty" xml:"account,omitempty" require:"true"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 手机号
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty" require:"true"`
	// 邮箱
	Email *string `json:"email,omitempty" xml:"email,omitempty" require:"true"`
	// 钉钉群
	Group *string `json:"group,omitempty" xml:"group,omitempty" require:"true"`
	// 当前记录状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s Emergency) String() string {
	return tea.Prettify(s)
}

func (s Emergency) GoString() string {
	return s.String()
}

func (s *Emergency) SetTitle(v string) *Emergency {
	s.Title = &v
	return s
}

func (s *Emergency) SetAccount(v string) *Emergency {
	s.Account = &v
	return s
}

func (s *Emergency) SetName(v string) *Emergency {
	s.Name = &v
	return s
}

func (s *Emergency) SetPhone(v string) *Emergency {
	s.Phone = &v
	return s
}

func (s *Emergency) SetEmail(v string) *Emergency {
	s.Email = &v
	return s
}

func (s *Emergency) SetGroup(v string) *Emergency {
	s.Group = &v
	return s
}

func (s *Emergency) SetStatus(v string) *Emergency {
	s.Status = &v
	return s
}

// aces产品
type AcesProduct struct {
	//
	CnName *string `json:"cn_name,omitempty" xml:"cn_name,omitempty" require:"true"`
	//
	EnName *string `json:"en_name,omitempty" xml:"en_name,omitempty"`
	//
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 产品owner
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty"`
	// 产品创建时间
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty" require:"true"`
	// 产品修改时间
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty" require:"true"`
	//
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	//
	L1 *string `json:"l1,omitempty" xml:"l1,omitempty"`
	//
	L2 *string `json:"l2,omitempty" xml:"l2,omitempty"`
}

func (s AcesProduct) String() string {
	return tea.Prettify(s)
}

func (s AcesProduct) GoString() string {
	return s.String()
}

func (s *AcesProduct) SetCnName(v string) *AcesProduct {
	s.CnName = &v
	return s
}

func (s *AcesProduct) SetEnName(v string) *AcesProduct {
	s.EnName = &v
	return s
}

func (s *AcesProduct) SetCode(v string) *AcesProduct {
	s.Code = &v
	return s
}

func (s *AcesProduct) SetOwner(v string) *AcesProduct {
	s.Owner = &v
	return s
}

func (s *AcesProduct) SetCreateTime(v string) *AcesProduct {
	s.CreateTime = &v
	return s
}

func (s *AcesProduct) SetUpdateTime(v string) *AcesProduct {
	s.UpdateTime = &v
	return s
}

func (s *AcesProduct) SetDescription(v string) *AcesProduct {
	s.Description = &v
	return s
}

func (s *AcesProduct) SetL1(v string) *AcesProduct {
	s.L1 = &v
	return s
}

func (s *AcesProduct) SetL2(v string) *AcesProduct {
	s.L2 = &v
	return s
}

// 返回结果
type ResultOncall struct {
	// 是否成功
	Success *string `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 提示信息
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty" require:"true"`
	// 保存的工单主键id（成功才有）
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
}

func (s ResultOncall) String() string {
	return tea.Prettify(s)
}

func (s ResultOncall) GoString() string {
	return s.String()
}

func (s *ResultOncall) SetSuccess(v string) *ResultOncall {
	s.Success = &v
	return s
}

func (s *ResultOncall) SetResultMsg(v string) *ResultOncall {
	s.ResultMsg = &v
	return s
}

func (s *ResultOncall) SetId(v string) *ResultOncall {
	s.Id = &v
	return s
}

// 商务中心项目基础结构
type ProjectBase struct {
	// 项目记录ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 项目可读编码
	ProjectCode *string `json:"project_code,omitempty" xml:"project_code,omitempty"`
	// 项目名称
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// 项目来源：蚂蚁、阿里云、合作伙伴 ProjectSource.getKey() ANTCLOUD("ANTCLOUD", "蚂蚁区块链"), ALIYUN("ALIYUN", "阿里云"), PARTNER("PARTNER", "合作伙伴");
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
	// 签约方（总包方）。蚂蚁、阿里云 ANTCLOUD("ANTCLOUD", "蚂蚁区块链"), ALIYUN("ALIYUN", "阿里云"),
	Contractor *string `json:"contractor,omitempty" xml:"contractor,omitempty"`
	// 项目所在阶段
	Stage *string `json:"stage,omitempty" xml:"stage,omitempty"`
	// 项目状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 预计签约日期
	ExpectConDate *string `json:"expect_con_date,omitempty" xml:"expect_con_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 预估签约金额
	ExpectConAmt *string `json:"expect_con_amt,omitempty" xml:"expect_con_amt,omitempty"`
	// 是否需要交付。1需要，0不需要
	NeedPm *string `json:"need_pm,omitempty" xml:"need_pm,omitempty"`
	// 是否需要提前”进场“。1需要，0不需要。
	NeedAdEntry *string `json:"need_ad_entry,omitempty" xml:"need_ad_entry,omitempty"`
	// 合作伙伴Id
	PartnerId *string `json:"partner_id,omitempty" xml:"partner_id,omitempty"`
	// partnerName
	PartnerName *string `json:"partner_name,omitempty" xml:"partner_name,omitempty"`
	// 阿里云Bpid
	AliyunBpid *string `json:"aliyun_bpid,omitempty" xml:"aliyun_bpid,omitempty"`
	// 客户ID
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty"`
	// 客户名称
	CustomerName *string `json:"customer_name,omitempty" xml:"customer_name,omitempty"`
	// BD
	BdWorkNo *string `json:"bd_work_no,omitempty" xml:"bd_work_no,omitempty"`
	// PM
	PmWorkNos []*string `json:"pm_work_nos,omitempty" xml:"pm_work_nos,omitempty" type:"Repeated"`
	//
	TamList []*string `json:"tam_list,omitempty" xml:"tam_list,omitempty" type:"Repeated"`
	//
	BdList []*string `json:"bd_list,omitempty" xml:"bd_list,omitempty" type:"Repeated"`
	//
	TmList []*string `json:"tm_list,omitempty" xml:"tm_list,omitempty" type:"Repeated"`
	//
	PmList []*string `json:"pm_list,omitempty" xml:"pm_list,omitempty" type:"Repeated"`
}

func (s ProjectBase) String() string {
	return tea.Prettify(s)
}

func (s ProjectBase) GoString() string {
	return s.String()
}

func (s *ProjectBase) SetId(v string) *ProjectBase {
	s.Id = &v
	return s
}

func (s *ProjectBase) SetProjectCode(v string) *ProjectBase {
	s.ProjectCode = &v
	return s
}

func (s *ProjectBase) SetTitle(v string) *ProjectBase {
	s.Title = &v
	return s
}

func (s *ProjectBase) SetSource(v string) *ProjectBase {
	s.Source = &v
	return s
}

func (s *ProjectBase) SetContractor(v string) *ProjectBase {
	s.Contractor = &v
	return s
}

func (s *ProjectBase) SetStage(v string) *ProjectBase {
	s.Stage = &v
	return s
}

func (s *ProjectBase) SetStatus(v string) *ProjectBase {
	s.Status = &v
	return s
}

func (s *ProjectBase) SetExpectConDate(v string) *ProjectBase {
	s.ExpectConDate = &v
	return s
}

func (s *ProjectBase) SetExpectConAmt(v string) *ProjectBase {
	s.ExpectConAmt = &v
	return s
}

func (s *ProjectBase) SetNeedPm(v string) *ProjectBase {
	s.NeedPm = &v
	return s
}

func (s *ProjectBase) SetNeedAdEntry(v string) *ProjectBase {
	s.NeedAdEntry = &v
	return s
}

func (s *ProjectBase) SetPartnerId(v string) *ProjectBase {
	s.PartnerId = &v
	return s
}

func (s *ProjectBase) SetPartnerName(v string) *ProjectBase {
	s.PartnerName = &v
	return s
}

func (s *ProjectBase) SetAliyunBpid(v string) *ProjectBase {
	s.AliyunBpid = &v
	return s
}

func (s *ProjectBase) SetCustomerId(v string) *ProjectBase {
	s.CustomerId = &v
	return s
}

func (s *ProjectBase) SetCustomerName(v string) *ProjectBase {
	s.CustomerName = &v
	return s
}

func (s *ProjectBase) SetBdWorkNo(v string) *ProjectBase {
	s.BdWorkNo = &v
	return s
}

func (s *ProjectBase) SetPmWorkNos(v []*string) *ProjectBase {
	s.PmWorkNos = v
	return s
}

func (s *ProjectBase) SetTamList(v []*string) *ProjectBase {
	s.TamList = v
	return s
}

func (s *ProjectBase) SetBdList(v []*string) *ProjectBase {
	s.BdList = v
	return s
}

func (s *ProjectBase) SetTmList(v []*string) *ProjectBase {
	s.TmList = v
	return s
}

func (s *ProjectBase) SetPmList(v []*string) *ProjectBase {
	s.PmList = v
	return s
}

// 返回结构
type ResultData struct {
	// data
	Data *ResultMap `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s ResultData) String() string {
	return tea.Prettify(s)
}

func (s ResultData) GoString() string {
	return s.String()
}

func (s *ResultData) SetData(v *ResultMap) *ResultData {
	s.Data = v
	return s
}

// ACES系统接收的项目信息
type AcesProject struct {
	// 项目id
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 项目名称
	ProjectName *string `json:"project_name,omitempty" xml:"project_name,omitempty" require:"true"`
	// 客户id
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty" require:"true"`
	// 客户名称
	CustomerName *string `json:"customer_name,omitempty" xml:"customer_name,omitempty" require:"true"`
	// 产品线
	ProjectLine *string `json:"project_line,omitempty" xml:"project_line,omitempty"`
	// 业务线
	WorkLine *string `json:"work_line,omitempty" xml:"work_line,omitempty"`
	// 业务分类
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 项目大阶段
	ProjectBigStage *string `json:"project_big_stage,omitempty" xml:"project_big_stage,omitempty"`
	// 转维状态
	OpStatus *string `json:"op_status,omitempty" xml:"op_status,omitempty"`
	// 交付阶段
	Deliver *string `json:"deliver,omitempty" xml:"deliver,omitempty"`
	// 是否售后
	AfterSale *bool `json:"after_sale,omitempty" xml:"after_sale,omitempty"`
	//
	AliyunBpid *string `json:"aliyun_bpid,omitempty" xml:"aliyun_bpid,omitempty"`
	// 解决方案架构师
	Sa *string `json:"sa,omitempty" xml:"sa,omitempty" require:"true"`
	// 项目经理
	Pm *string `json:"pm,omitempty" xml:"pm,omitempty" require:"true"`
	// 商务经理
	Bd *string `json:"bd,omitempty" xml:"bd,omitempty" require:"true"`
	// 交付经理
	Tm *string `json:"tm,omitempty" xml:"tm,omitempty" require:"true"`
	// 项目状态
	ProjectStage *string `json:"project_stage,omitempty" xml:"project_stage,omitempty"`
	// 项目交付状态（未启动、已启动等）
	ProjectStatus *string `json:"project_status,omitempty" xml:"project_status,omitempty"`
	// 是否需要交付 1需要 0不需要
	NeedDeliver *string `json:"need_deliver,omitempty" xml:"need_deliver,omitempty" require:"true"`
	// 是否需要提前进场 1需要 0不需要
	NeedAdEntry *string `json:"need_ad_entry,omitempty" xml:"need_ad_entry,omitempty" require:"true"`
	// 是否需要竞标 1需要 0不需要
	NeedTender *string `json:"need_tender,omitempty" xml:"need_tender,omitempty" require:"true"`
	// 张三
	Cre *string `json:"cre,omitempty" xml:"cre,omitempty"`
}

func (s AcesProject) String() string {
	return tea.Prettify(s)
}

func (s AcesProject) GoString() string {
	return s.String()
}

func (s *AcesProject) SetProjectId(v string) *AcesProject {
	s.ProjectId = &v
	return s
}

func (s *AcesProject) SetProjectName(v string) *AcesProject {
	s.ProjectName = &v
	return s
}

func (s *AcesProject) SetCustomerId(v string) *AcesProject {
	s.CustomerId = &v
	return s
}

func (s *AcesProject) SetCustomerName(v string) *AcesProject {
	s.CustomerName = &v
	return s
}

func (s *AcesProject) SetProjectLine(v string) *AcesProject {
	s.ProjectLine = &v
	return s
}

func (s *AcesProject) SetWorkLine(v string) *AcesProject {
	s.WorkLine = &v
	return s
}

func (s *AcesProject) SetBizType(v string) *AcesProject {
	s.BizType = &v
	return s
}

func (s *AcesProject) SetProjectBigStage(v string) *AcesProject {
	s.ProjectBigStage = &v
	return s
}

func (s *AcesProject) SetOpStatus(v string) *AcesProject {
	s.OpStatus = &v
	return s
}

func (s *AcesProject) SetDeliver(v string) *AcesProject {
	s.Deliver = &v
	return s
}

func (s *AcesProject) SetAfterSale(v bool) *AcesProject {
	s.AfterSale = &v
	return s
}

func (s *AcesProject) SetAliyunBpid(v string) *AcesProject {
	s.AliyunBpid = &v
	return s
}

func (s *AcesProject) SetSa(v string) *AcesProject {
	s.Sa = &v
	return s
}

func (s *AcesProject) SetPm(v string) *AcesProject {
	s.Pm = &v
	return s
}

func (s *AcesProject) SetBd(v string) *AcesProject {
	s.Bd = &v
	return s
}

func (s *AcesProject) SetTm(v string) *AcesProject {
	s.Tm = &v
	return s
}

func (s *AcesProject) SetProjectStage(v string) *AcesProject {
	s.ProjectStage = &v
	return s
}

func (s *AcesProject) SetProjectStatus(v string) *AcesProject {
	s.ProjectStatus = &v
	return s
}

func (s *AcesProject) SetNeedDeliver(v string) *AcesProject {
	s.NeedDeliver = &v
	return s
}

func (s *AcesProject) SetNeedAdEntry(v string) *AcesProject {
	s.NeedAdEntry = &v
	return s
}

func (s *AcesProject) SetNeedTender(v string) *AcesProject {
	s.NeedTender = &v
	return s
}

func (s *AcesProject) SetCre(v string) *AcesProject {
	s.Cre = &v
	return s
}

//
type Upload struct {
	//
	Endpoint *string `json:"endpoint,omitempty" xml:"endpoint,omitempty" require:"true"`
	//
	FileUniqueId *string `json:"file_unique_id,omitempty" xml:"file_unique_id,omitempty" require:"true"`
	//
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty" require:"true"`
	//
	FormParam *FormParam `json:"form_param,omitempty" xml:"form_param,omitempty" require:"true"`
}

func (s Upload) String() string {
	return tea.Prettify(s)
}

func (s Upload) GoString() string {
	return s.String()
}

func (s *Upload) SetEndpoint(v string) *Upload {
	s.Endpoint = &v
	return s
}

func (s *Upload) SetFileUniqueId(v string) *Upload {
	s.FileUniqueId = &v
	return s
}

func (s *Upload) SetFileUrl(v string) *Upload {
	s.FileUrl = &v
	return s
}

func (s *Upload) SetFormParam(v *FormParam) *Upload {
	s.FormParam = v
	return s
}

// 提交表单入参
type SubmitRequest struct {
	// 测试
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
	// 问题描述（富文本）
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 影响
	Influence *string `json:"influence,omitempty" xml:"influence,omitempty" require:"true"`
	// 账号
	Account *string `json:"account,omitempty" xml:"account,omitempty" require:"true"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 手机号
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty"`
	// 邮箱
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 钉钉群
	Group *string `json:"group,omitempty" xml:"group,omitempty" require:"true"`
	// 校验令牌（接入RDS校验）
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
	// ip
	Ip *string `json:"ip,omitempty" xml:"ip,omitempty" require:"true"`
	// 验证码
	VerifyCode *string `json:"verify_code,omitempty" xml:"verify_code,omitempty" require:"true"`
	// RDS的bizNo
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// 公有化PUBLIC、私有化PRIVATE
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 上传附件的URL
	FileUrl []*string `json:"file_url,omitempty" xml:"file_url,omitempty" type:"Repeated"`
}

func (s SubmitRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitRequest) GoString() string {
	return s.String()
}

func (s *SubmitRequest) SetTitle(v string) *SubmitRequest {
	s.Title = &v
	return s
}

func (s *SubmitRequest) SetDescription(v string) *SubmitRequest {
	s.Description = &v
	return s
}

func (s *SubmitRequest) SetInfluence(v string) *SubmitRequest {
	s.Influence = &v
	return s
}

func (s *SubmitRequest) SetAccount(v string) *SubmitRequest {
	s.Account = &v
	return s
}

func (s *SubmitRequest) SetName(v string) *SubmitRequest {
	s.Name = &v
	return s
}

func (s *SubmitRequest) SetPhone(v string) *SubmitRequest {
	s.Phone = &v
	return s
}

func (s *SubmitRequest) SetEmail(v string) *SubmitRequest {
	s.Email = &v
	return s
}

func (s *SubmitRequest) SetGroup(v string) *SubmitRequest {
	s.Group = &v
	return s
}

func (s *SubmitRequest) SetToken(v string) *SubmitRequest {
	s.Token = &v
	return s
}

func (s *SubmitRequest) SetIp(v string) *SubmitRequest {
	s.Ip = &v
	return s
}

func (s *SubmitRequest) SetVerifyCode(v string) *SubmitRequest {
	s.VerifyCode = &v
	return s
}

func (s *SubmitRequest) SetBizNo(v string) *SubmitRequest {
	s.BizNo = &v
	return s
}

func (s *SubmitRequest) SetType(v string) *SubmitRequest {
	s.Type = &v
	return s
}

func (s *SubmitRequest) SetFileUrl(v []*string) *SubmitRequest {
	s.FileUrl = v
	return s
}

// 返回值
type ResultArray struct {
	// 数组
	ResultArray []*string `json:"result_array,omitempty" xml:"result_array,omitempty" require:"true" type:"Repeated"`
}

func (s ResultArray) String() string {
	return tea.Prettify(s)
}

func (s ResultArray) GoString() string {
	return s.String()
}

func (s *ResultArray) SetResultArray(v []*string) *ResultArray {
	s.ResultArray = v
	return s
}

type QueryCustomRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 分页页码
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" require:"true"`
	// 分页长度，最大不超过50
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true" maximum:"50" minimum:"10"`
	// 项目id，非必填；可通过项目id查询单个项目
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty"`
}

func (s QueryCustomRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCustomRequest) GoString() string {
	return s.String()
}

func (s *QueryCustomRequest) SetAuthToken(v string) *QueryCustomRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCustomRequest) SetPageNo(v int64) *QueryCustomRequest {
	s.PageNo = &v
	return s
}

func (s *QueryCustomRequest) SetPageSize(v int64) *QueryCustomRequest {
	s.PageSize = &v
	return s
}

func (s *QueryCustomRequest) SetProjectId(v string) *QueryCustomRequest {
	s.ProjectId = &v
	return s
}

type QueryCustomResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 调用结果是否成功标识
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 项目数组
	Data []*AcesProject `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// 项目总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s QueryCustomResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCustomResponse) GoString() string {
	return s.String()
}

func (s *QueryCustomResponse) SetReqMsgId(v string) *QueryCustomResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCustomResponse) SetResultCode(v string) *QueryCustomResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCustomResponse) SetResultMsg(v string) *QueryCustomResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCustomResponse) SetSuccess(v bool) *QueryCustomResponse {
	s.Success = &v
	return s
}

func (s *QueryCustomResponse) SetData(v []*AcesProject) *QueryCustomResponse {
	s.Data = v
	return s
}

func (s *QueryCustomResponse) SetTotal(v int64) *QueryCustomResponse {
	s.Total = &v
	return s
}

type QueryCodeRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	//
	L5codeList []*string `json:"l5code_list,omitempty" xml:"l5code_list,omitempty" require:"true" type:"Repeated"`
}

func (s QueryCodeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCodeRequest) GoString() string {
	return s.String()
}

func (s *QueryCodeRequest) SetAuthToken(v string) *QueryCodeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCodeRequest) SetL5codeList(v []*string) *QueryCodeRequest {
	s.L5codeList = v
	return s
}

type QueryCodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	//
	L3codeList []*string `json:"l3code_list,omitempty" xml:"l3code_list,omitempty" type:"Repeated"`
	//
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryCodeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCodeResponse) GoString() string {
	return s.String()
}

func (s *QueryCodeResponse) SetReqMsgId(v string) *QueryCodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCodeResponse) SetResultCode(v string) *QueryCodeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCodeResponse) SetResultMsg(v string) *QueryCodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCodeResponse) SetL3codeList(v []*string) *QueryCodeResponse {
	s.L3codeList = v
	return s
}

func (s *QueryCodeResponse) SetSuccess(v bool) *QueryCodeResponse {
	s.Success = &v
	return s
}

type QueryProductRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// l3code的数组
	L3codeList []*string `json:"l3code_list,omitempty" xml:"l3code_list,omitempty" require:"true" type:"Repeated"`
}

func (s QueryProductRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryProductRequest) GoString() string {
	return s.String()
}

func (s *QueryProductRequest) SetAuthToken(v string) *QueryProductRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryProductRequest) SetL3codeList(v []*string) *QueryProductRequest {
	s.L3codeList = v
	return s
}

type QueryProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	//
	ProductList []*AcesProduct `json:"product_list,omitempty" xml:"product_list,omitempty" type:"Repeated"`
	//
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryProductResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryProductResponse) GoString() string {
	return s.String()
}

func (s *QueryProductResponse) SetReqMsgId(v string) *QueryProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryProductResponse) SetResultCode(v string) *QueryProductResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryProductResponse) SetResultMsg(v string) *QueryProductResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryProductResponse) SetProductList(v []*AcesProduct) *QueryProductResponse {
	s.ProductList = v
	return s
}

func (s *QueryProductResponse) SetSuccess(v bool) *QueryProductResponse {
	s.Success = &v
	return s
}

type QueryProjectPagequeryRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 兼容BD待客下单对外暴露项目Id查询
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 项目唯一编码
	ProjectCode *string `json:"project_code,omitempty" xml:"project_code,omitempty"`
	// 项目名称，支持模糊
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// 客户id
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty"`
	// 客户名称
	CustomerName *string `json:"customer_name,omitempty" xml:"customer_name,omitempty"`
	// 项目阶段，支持多个过滤
	Status []*string `json:"status,omitempty" xml:"status,omitempty" type:"Repeated"`
	// 项目阶段，支持多个过滤
	Stages []*string `json:"stages,omitempty" xml:"stages,omitempty" type:"Repeated"`
	// 项目BD工号列表
	BdWorkNos []*string `json:"bd_work_nos,omitempty" xml:"bd_work_nos,omitempty" type:"Repeated"`
	// 交付项目经理工号列表
	PmWorkNos []*string `json:"pm_work_nos,omitempty" xml:"pm_work_nos,omitempty" type:"Repeated"`
	// 页面大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 当前页面
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
}

func (s QueryProjectPagequeryRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryProjectPagequeryRequest) GoString() string {
	return s.String()
}

func (s *QueryProjectPagequeryRequest) SetAuthToken(v string) *QueryProjectPagequeryRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryProjectPagequeryRequest) SetId(v string) *QueryProjectPagequeryRequest {
	s.Id = &v
	return s
}

func (s *QueryProjectPagequeryRequest) SetProjectCode(v string) *QueryProjectPagequeryRequest {
	s.ProjectCode = &v
	return s
}

func (s *QueryProjectPagequeryRequest) SetTitle(v string) *QueryProjectPagequeryRequest {
	s.Title = &v
	return s
}

func (s *QueryProjectPagequeryRequest) SetCustomerId(v string) *QueryProjectPagequeryRequest {
	s.CustomerId = &v
	return s
}

func (s *QueryProjectPagequeryRequest) SetCustomerName(v string) *QueryProjectPagequeryRequest {
	s.CustomerName = &v
	return s
}

func (s *QueryProjectPagequeryRequest) SetStatus(v []*string) *QueryProjectPagequeryRequest {
	s.Status = v
	return s
}

func (s *QueryProjectPagequeryRequest) SetStages(v []*string) *QueryProjectPagequeryRequest {
	s.Stages = v
	return s
}

func (s *QueryProjectPagequeryRequest) SetBdWorkNos(v []*string) *QueryProjectPagequeryRequest {
	s.BdWorkNos = v
	return s
}

func (s *QueryProjectPagequeryRequest) SetPmWorkNos(v []*string) *QueryProjectPagequeryRequest {
	s.PmWorkNos = v
	return s
}

func (s *QueryProjectPagequeryRequest) SetPageSize(v int64) *QueryProjectPagequeryRequest {
	s.PageSize = &v
	return s
}

func (s *QueryProjectPagequeryRequest) SetCurrentPage(v int64) *QueryProjectPagequeryRequest {
	s.CurrentPage = &v
	return s
}

type QueryProjectPagequeryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据
	ProjectList []*ProjectBase `json:"project_list,omitempty" xml:"project_list,omitempty" type:"Repeated"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryProjectPagequeryResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryProjectPagequeryResponse) GoString() string {
	return s.String()
}

func (s *QueryProjectPagequeryResponse) SetReqMsgId(v string) *QueryProjectPagequeryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryProjectPagequeryResponse) SetResultCode(v string) *QueryProjectPagequeryResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryProjectPagequeryResponse) SetResultMsg(v string) *QueryProjectPagequeryResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryProjectPagequeryResponse) SetProjectList(v []*ProjectBase) *QueryProjectPagequeryResponse {
	s.ProjectList = v
	return s
}

func (s *QueryProjectPagequeryResponse) SetSuccess(v bool) *QueryProjectPagequeryResponse {
	s.Success = &v
	return s
}

type QueryProjectGetprojectRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 项目id
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty"`
}

func (s QueryProjectGetprojectRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryProjectGetprojectRequest) GoString() string {
	return s.String()
}

func (s *QueryProjectGetprojectRequest) SetAuthToken(v string) *QueryProjectGetprojectRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryProjectGetprojectRequest) SetProjectId(v string) *QueryProjectGetprojectRequest {
	s.ProjectId = &v
	return s
}

type QueryProjectGetprojectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	//
	ProjectList *ProjectBase `json:"project_list,omitempty" xml:"project_list,omitempty"`
	//
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryProjectGetprojectResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryProjectGetprojectResponse) GoString() string {
	return s.String()
}

func (s *QueryProjectGetprojectResponse) SetReqMsgId(v string) *QueryProjectGetprojectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryProjectGetprojectResponse) SetResultCode(v string) *QueryProjectGetprojectResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryProjectGetprojectResponse) SetResultMsg(v string) *QueryProjectGetprojectResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryProjectGetprojectResponse) SetProjectList(v *ProjectBase) *QueryProjectGetprojectResponse {
	s.ProjectList = v
	return s
}

func (s *QueryProjectGetprojectResponse) SetSuccess(v bool) *QueryProjectGetprojectResponse {
	s.Success = &v
	return s
}

type SaveAoneRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 产品线
	ProductLine *string `json:"product_line,omitempty" xml:"product_line,omitempty" require:"true"`
	// 产品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true"`
	// 问题类型
	IssueType *string `json:"issue_type,omitempty" xml:"issue_type,omitempty" require:"true"`
	// 期望日期
	ExpectedAt *string `json:"expected_at,omitempty" xml:"expected_at,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 创建者的工号
	Author *string `json:"author,omitempty" xml:"author,omitempty" require:"true"`
	// 解决者/指派者的工号
	AssignedTo *string `json:"assigned_to,omitempty" xml:"assigned_to,omitempty" require:"true"`
	// 标题
	Subject *string `json:"subject,omitempty" xml:"subject,omitempty" require:"true"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 跟踪者的工号
	WatcherUsers []*string `json:"watcher_users,omitempty" xml:"watcher_users,omitempty" require:"true" type:"Repeated"`
	// 优先级
	PriorityId *int64 `json:"priority_id,omitempty" xml:"priority_id,omitempty" require:"true"`
}

func (s SaveAoneRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveAoneRequest) GoString() string {
	return s.String()
}

func (s *SaveAoneRequest) SetAuthToken(v string) *SaveAoneRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveAoneRequest) SetProductLine(v string) *SaveAoneRequest {
	s.ProductLine = &v
	return s
}

func (s *SaveAoneRequest) SetProductName(v string) *SaveAoneRequest {
	s.ProductName = &v
	return s
}

func (s *SaveAoneRequest) SetIssueType(v string) *SaveAoneRequest {
	s.IssueType = &v
	return s
}

func (s *SaveAoneRequest) SetExpectedAt(v string) *SaveAoneRequest {
	s.ExpectedAt = &v
	return s
}

func (s *SaveAoneRequest) SetAuthor(v string) *SaveAoneRequest {
	s.Author = &v
	return s
}

func (s *SaveAoneRequest) SetAssignedTo(v string) *SaveAoneRequest {
	s.AssignedTo = &v
	return s
}

func (s *SaveAoneRequest) SetSubject(v string) *SaveAoneRequest {
	s.Subject = &v
	return s
}

func (s *SaveAoneRequest) SetDescription(v string) *SaveAoneRequest {
	s.Description = &v
	return s
}

func (s *SaveAoneRequest) SetWatcherUsers(v []*string) *SaveAoneRequest {
	s.WatcherUsers = v
	return s
}

func (s *SaveAoneRequest) SetPriorityId(v int64) *SaveAoneRequest {
	s.PriorityId = &v
	return s
}

type SaveAoneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回数据
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s SaveAoneResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveAoneResponse) GoString() string {
	return s.String()
}

func (s *SaveAoneResponse) SetReqMsgId(v string) *SaveAoneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveAoneResponse) SetResultCode(v string) *SaveAoneResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveAoneResponse) SetResultMsg(v string) *SaveAoneResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveAoneResponse) SetResult(v string) *SaveAoneResponse {
	s.Result = &v
	return s
}

type QueryAoneRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 项目id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
}

func (s QueryAoneRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAoneRequest) GoString() string {
	return s.String()
}

func (s *QueryAoneRequest) SetAuthToken(v string) *QueryAoneRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAoneRequest) SetId(v int64) *QueryAoneRequest {
	s.Id = &v
	return s
}

type QueryAoneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回值
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryAoneResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAoneResponse) GoString() string {
	return s.String()
}

func (s *QueryAoneResponse) SetReqMsgId(v string) *QueryAoneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAoneResponse) SetResultCode(v string) *QueryAoneResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAoneResponse) SetResultMsg(v string) *QueryAoneResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAoneResponse) SetData(v string) *QueryAoneResponse {
	s.Data = &v
	return s
}

type ImportScOperationcenterRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 提交表单入参
	SubmitRequest *SubmitRequest `json:"submit_request,omitempty" xml:"submit_request,omitempty" require:"true"`
	// 站位
	FlagId *string `json:"flag_id,omitempty" xml:"flag_id,omitempty"`
}

func (s ImportScOperationcenterRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportScOperationcenterRequest) GoString() string {
	return s.String()
}

func (s *ImportScOperationcenterRequest) SetAuthToken(v string) *ImportScOperationcenterRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportScOperationcenterRequest) SetSubmitRequest(v *SubmitRequest) *ImportScOperationcenterRequest {
	s.SubmitRequest = v
	return s
}

func (s *ImportScOperationcenterRequest) SetFlagId(v string) *ImportScOperationcenterRequest {
	s.FlagId = &v
	return s
}

type ImportScOperationcenterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 保存的工单主键id（成功才有）
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
}

func (s ImportScOperationcenterResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportScOperationcenterResponse) GoString() string {
	return s.String()
}

func (s *ImportScOperationcenterResponse) SetReqMsgId(v string) *ImportScOperationcenterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportScOperationcenterResponse) SetResultCode(v string) *ImportScOperationcenterResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportScOperationcenterResponse) SetResultMsg(v string) *ImportScOperationcenterResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportScOperationcenterResponse) SetSuccess(v bool) *ImportScOperationcenterResponse {
	s.Success = &v
	return s
}

func (s *ImportScOperationcenterResponse) SetId(v string) *ImportScOperationcenterResponse {
	s.Id = &v
	return s
}

type OperateScOperationcenterRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 手机号/邮箱
	Receiver *string `json:"receiver,omitempty" xml:"receiver,omitempty" require:"true"`
}

func (s OperateScOperationcenterRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateScOperationcenterRequest) GoString() string {
	return s.String()
}

func (s *OperateScOperationcenterRequest) SetAuthToken(v string) *OperateScOperationcenterRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateScOperationcenterRequest) SetReceiver(v string) *OperateScOperationcenterRequest {
	s.Receiver = &v
	return s
}

type OperateScOperationcenterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s OperateScOperationcenterResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateScOperationcenterResponse) GoString() string {
	return s.String()
}

func (s *OperateScOperationcenterResponse) SetReqMsgId(v string) *OperateScOperationcenterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateScOperationcenterResponse) SetResultCode(v string) *OperateScOperationcenterResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateScOperationcenterResponse) SetResultMsg(v string) *OperateScOperationcenterResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateScOperationcenterResponse) SetSuccess(v bool) *OperateScOperationcenterResponse {
	s.Success = &v
	return s
}

type QueryScOperationcenterRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
}

func (s QueryScOperationcenterRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryScOperationcenterRequest) GoString() string {
	return s.String()
}

func (s *QueryScOperationcenterRequest) SetAuthToken(v string) *QueryScOperationcenterRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryScOperationcenterRequest) SetId(v string) *QueryScOperationcenterRequest {
	s.Id = &v
	return s
}

type QueryScOperationcenterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 事件详情
	Data *Emergency `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryScOperationcenterResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryScOperationcenterResponse) GoString() string {
	return s.String()
}

func (s *QueryScOperationcenterResponse) SetReqMsgId(v string) *QueryScOperationcenterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryScOperationcenterResponse) SetResultCode(v string) *QueryScOperationcenterResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryScOperationcenterResponse) SetResultMsg(v string) *QueryScOperationcenterResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryScOperationcenterResponse) SetSuccess(v bool) *QueryScOperationcenterResponse {
	s.Success = &v
	return s
}

func (s *QueryScOperationcenterResponse) SetData(v *Emergency) *QueryScOperationcenterResponse {
	s.Data = v
	return s
}

type ImportScFileRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	//
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	//
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	//
	BusinessName *string `json:"business_name,omitempty" xml:"business_name,omitempty" require:"true"`
}

func (s ImportScFileRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportScFileRequest) GoString() string {
	return s.String()
}

func (s *ImportScFileRequest) SetAuthToken(v string) *ImportScFileRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportScFileRequest) SetKey(v string) *ImportScFileRequest {
	s.Key = &v
	return s
}

func (s *ImportScFileRequest) SetFileName(v string) *ImportScFileRequest {
	s.FileName = &v
	return s
}

func (s *ImportScFileRequest) SetBusinessName(v string) *ImportScFileRequest {
	s.BusinessName = &v
	return s
}

type ImportScFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	//
	Data *Upload `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ImportScFileResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportScFileResponse) GoString() string {
	return s.String()
}

func (s *ImportScFileResponse) SetReqMsgId(v string) *ImportScFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportScFileResponse) SetResultCode(v string) *ImportScFileResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportScFileResponse) SetResultMsg(v string) *ImportScFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportScFileResponse) SetSuccess(v bool) *ImportScFileResponse {
	s.Success = &v
	return s
}

func (s *ImportScFileResponse) SetData(v *Upload) *ImportScFileResponse {
	s.Data = v
	return s
}

type QueryScTestRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s QueryScTestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryScTestRequest) GoString() string {
	return s.String()
}

func (s *QueryScTestRequest) SetAuthToken(v string) *QueryScTestRequest {
	s.AuthToken = &v
	return s
}

type QueryScTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryScTestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryScTestResponse) GoString() string {
	return s.String()
}

func (s *QueryScTestResponse) SetReqMsgId(v string) *QueryScTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryScTestResponse) SetResultCode(v string) *QueryScTestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryScTestResponse) SetResultMsg(v string) *QueryScTestResponse {
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
				"sdk_version":      tea.String("1.3.5"),
				"_prod_code":       tea.String("TAM"),
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
 * Description: 查询售后中心项目信息
 * Summary: 查询售后中心项目信息
 */
func (client *Client) QueryCustom(request *QueryCustomRequest) (_result *QueryCustomResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCustomResponse{}
	_body, _err := client.QueryCustomEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询售后中心项目信息
 * Summary: 查询售后中心项目信息
 */
func (client *Client) QueryCustomEx(request *QueryCustomRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCustomResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCustomResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.tam.custom.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description:
 * Summary: 查询双百L3code
 */
func (client *Client) QueryCode(request *QueryCodeRequest) (_result *QueryCodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCodeResponse{}
	_body, _err := client.QueryCodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description:
 * Summary: 查询双百L3code
 */
func (client *Client) QueryCodeEx(request *QueryCodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.tam.code.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description:
 * Summary: 根据l3code列表查询产品信息
 */
func (client *Client) QueryProduct(request *QueryProductRequest) (_result *QueryProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryProductResponse{}
	_body, _err := client.QueryProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description:
 * Summary: 根据l3code列表查询产品信息
 */
func (client *Client) QueryProductEx(request *QueryProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.tam.product.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询商务中心项目，便于获取增值服务项目
 * Summary: 查询商务中心项目，便于获取增值服务项目
 */
func (client *Client) QueryProjectPagequery(request *QueryProjectPagequeryRequest) (_result *QueryProjectPagequeryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryProjectPagequeryResponse{}
	_body, _err := client.QueryProjectPagequeryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询商务中心项目，便于获取增值服务项目
 * Summary: 查询商务中心项目，便于获取增值服务项目
 */
func (client *Client) QueryProjectPagequeryEx(request *QueryProjectPagequeryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryProjectPagequeryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryProjectPagequeryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.tam.project.pagequery.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询商务中心项目信息
 * Summary: 查询商务中心项目信息
 */
func (client *Client) QueryProjectGetproject(request *QueryProjectGetprojectRequest) (_result *QueryProjectGetprojectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryProjectGetprojectResponse{}
	_body, _err := client.QueryProjectGetprojectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询商务中心项目信息
 * Summary: 查询商务中心项目信息
 */
func (client *Client) QueryProjectGetprojectEx(request *QueryProjectGetprojectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryProjectGetprojectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryProjectGetprojectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.tam.project.getproject.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交到aone
 * Summary: 提交到aone
 */
func (client *Client) SaveAone(request *SaveAoneRequest) (_result *SaveAoneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveAoneResponse{}
	_body, _err := client.SaveAoneEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交到aone
 * Summary: 提交到aone
 */
func (client *Client) SaveAoneEx(request *SaveAoneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveAoneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveAoneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.tam.aone.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询aone详情
 * Summary: 查询aone详情
 */
func (client *Client) QueryAone(request *QueryAoneRequest) (_result *QueryAoneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAoneResponse{}
	_body, _err := client.QueryAoneEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询aone详情
 * Summary: 查询aone详情
 */
func (client *Client) QueryAoneEx(request *QueryAoneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAoneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAoneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.tam.aone.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 智能外呼需求，前端提交表单后调用此接口将数据落入售后中心
 * Summary: 前端提交需求表单
 */
func (client *Client) ImportScOperationcenter(request *ImportScOperationcenterRequest) (_result *ImportScOperationcenterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportScOperationcenterResponse{}
	_body, _err := client.ImportScOperationcenterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 智能外呼需求，前端提交表单后调用此接口将数据落入售后中心
 * Summary: 前端提交需求表单
 */
func (client *Client) ImportScOperationcenterEx(request *ImportScOperationcenterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportScOperationcenterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportScOperationcenterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.tam.sc.operationcenter.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发送验证码
 * Summary: 发送验证码
 */
func (client *Client) OperateScOperationcenter(request *OperateScOperationcenterRequest) (_result *OperateScOperationcenterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateScOperationcenterResponse{}
	_body, _err := client.OperateScOperationcenterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发送验证码
 * Summary: 发送验证码
 */
func (client *Client) OperateScOperationcenterEx(request *OperateScOperationcenterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateScOperationcenterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateScOperationcenterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.tam.sc.operationcenter.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询跟进情况
 * Summary: 查询跟进情况
 */
func (client *Client) QueryScOperationcenter(request *QueryScOperationcenterRequest) (_result *QueryScOperationcenterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryScOperationcenterResponse{}
	_body, _err := client.QueryScOperationcenterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询跟进情况
 * Summary: 查询跟进情况
 */
func (client *Client) QueryScOperationcenterEx(request *QueryScOperationcenterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryScOperationcenterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryScOperationcenterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.tam.sc.operationcenter.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 附件上传
 * Summary: 附件上传
 */
func (client *Client) ImportScFile(request *ImportScFileRequest) (_result *ImportScFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportScFileResponse{}
	_body, _err := client.ImportScFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 附件上传
 * Summary: 附件上传
 */
func (client *Client) ImportScFileEx(request *ImportScFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportScFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportScFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.tam.sc.file.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description:
 * Summary: 测试
 */
func (client *Client) QueryScTest(request *QueryScTestRequest) (_result *QueryScTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryScTestResponse{}
	_body, _err := client.QueryScTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description:
 * Summary: 测试
 */
func (client *Client) QueryScTestEx(request *QueryScTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryScTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryScTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.tam.sc.test.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
