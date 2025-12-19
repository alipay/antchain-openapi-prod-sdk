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

// 权益智能体任务步骤对象
type AgentTaskStepData struct {
	// 步骤id
	StepId *string `json:"step_id,omitempty" xml:"step_id,omitempty" require:"true"`
	// 步骤名称
	StepName *string `json:"step_name,omitempty" xml:"step_name,omitempty" require:"true"`
	//  PENDING,  RUNNING,COMPLETED,TERMINATED,FAILED
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 更新时间
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty" require:"true"`
	// 关联的消息id
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty" require:"true"`
	// 关联的异步任务id
	JobId *string `json:"job_id,omitempty" xml:"job_id,omitempty" require:"true"`
	// 异步任务结果
	Result *string `json:"result,omitempty" xml:"result,omitempty" require:"true"`
	// 异步任务已读标识
	MessageFlag *bool `json:"message_flag,omitempty" xml:"message_flag,omitempty" require:"true"`
}

func (s AgentTaskStepData) String() string {
	return tea.Prettify(s)
}

func (s AgentTaskStepData) GoString() string {
	return s.String()
}

func (s *AgentTaskStepData) SetStepId(v string) *AgentTaskStepData {
	s.StepId = &v
	return s
}

func (s *AgentTaskStepData) SetStepName(v string) *AgentTaskStepData {
	s.StepName = &v
	return s
}

func (s *AgentTaskStepData) SetStatus(v string) *AgentTaskStepData {
	s.Status = &v
	return s
}

func (s *AgentTaskStepData) SetUpdateTime(v string) *AgentTaskStepData {
	s.UpdateTime = &v
	return s
}

func (s *AgentTaskStepData) SetMessageId(v string) *AgentTaskStepData {
	s.MessageId = &v
	return s
}

func (s *AgentTaskStepData) SetJobId(v string) *AgentTaskStepData {
	s.JobId = &v
	return s
}

func (s *AgentTaskStepData) SetResult(v string) *AgentTaskStepData {
	s.Result = &v
	return s
}

func (s *AgentTaskStepData) SetMessageFlag(v bool) *AgentTaskStepData {
	s.MessageFlag = &v
	return s
}

// 权益智能体任务对象
type AgentTaskData struct {
	// 任务名称
	TaskName *string `json:"task_name,omitempty" xml:"task_name,omitempty" require:"true"`
	// 任务类型
	TaskType *string `json:"task_type,omitempty" xml:"task_type,omitempty" require:"true"`
	// 任务状态
	TaskStatus *string `json:"task_status,omitempty" xml:"task_status,omitempty" require:"true"`
	// 是否有未读的消息
	MessageFlag *bool `json:"message_flag,omitempty" xml:"message_flag,omitempty" require:"true"`
	// 最后更新时间
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty" require:"true"`
	// 单步骤任务直接关联消息id
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty" require:"true"`
	// 附加信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty" require:"true"`
	// 任务步骤列表
	StepList []*AgentTaskStepData `json:"step_list,omitempty" xml:"step_list,omitempty" require:"true" type:"Repeated"`
}

func (s AgentTaskData) String() string {
	return tea.Prettify(s)
}

func (s AgentTaskData) GoString() string {
	return s.String()
}

func (s *AgentTaskData) SetTaskName(v string) *AgentTaskData {
	s.TaskName = &v
	return s
}

func (s *AgentTaskData) SetTaskType(v string) *AgentTaskData {
	s.TaskType = &v
	return s
}

func (s *AgentTaskData) SetTaskStatus(v string) *AgentTaskData {
	s.TaskStatus = &v
	return s
}

func (s *AgentTaskData) SetMessageFlag(v bool) *AgentTaskData {
	s.MessageFlag = &v
	return s
}

func (s *AgentTaskData) SetUpdateTime(v string) *AgentTaskData {
	s.UpdateTime = &v
	return s
}

func (s *AgentTaskData) SetMessageId(v string) *AgentTaskData {
	s.MessageId = &v
	return s
}

func (s *AgentTaskData) SetExtInfo(v string) *AgentTaskData {
	s.ExtInfo = &v
	return s
}

func (s *AgentTaskData) SetStepList(v []*AgentTaskStepData) *AgentTaskData {
	s.StepList = v
	return s
}

// 权益智能体对话对象
type AgentChatData struct {
	// 会话id
	//
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true"`
	// 消息id
	//
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty" require:"true"`
	// 是否已完成
	Finished *bool `json:"finished,omitempty" xml:"finished,omitempty" require:"true"`
	// text: 文本 mage: 图片 stream：流式文本
	ContentType *string `json:"content_type,omitempty" xml:"content_type,omitempty" require:"true"`
	// 内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s AgentChatData) String() string {
	return tea.Prettify(s)
}

func (s AgentChatData) GoString() string {
	return s.String()
}

func (s *AgentChatData) SetSessionId(v string) *AgentChatData {
	s.SessionId = &v
	return s
}

func (s *AgentChatData) SetMessageId(v string) *AgentChatData {
	s.MessageId = &v
	return s
}

func (s *AgentChatData) SetFinished(v bool) *AgentChatData {
	s.Finished = &v
	return s
}

func (s *AgentChatData) SetContentType(v string) *AgentChatData {
	s.ContentType = &v
	return s
}

func (s *AgentChatData) SetContent(v string) *AgentChatData {
	s.Content = &v
	return s
}

// 子指标结构体
type SubMetricData struct {
	// 日期
	Date *string `json:"date,omitempty" xml:"date,omitempty" require:"true"`
	// 指标类型:OPERATING_INCOME, REPAY_AMOUNT, REPAY_NUMBER, REPAY_USER_NUMBER, REPAY_AVG_AMOUNT, ALI_DST_AMT,OPERATING_COST, GROSS_PROFIT_MARGIN,VOUCHER_CONVERSION, USER_CONVERSION
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 指标值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s SubMetricData) String() string {
	return tea.Prettify(s)
}

func (s SubMetricData) GoString() string {
	return s.String()
}

func (s *SubMetricData) SetDate(v string) *SubMetricData {
	s.Date = &v
	return s
}

func (s *SubMetricData) SetType(v string) *SubMetricData {
	s.Type = &v
	return s
}

func (s *SubMetricData) SetValue(v string) *SubMetricData {
	s.Value = &v
	return s
}

// 交易区间数据
type TradeRangeData struct {
	// 区间开始
	Start *string `json:"start,omitempty" xml:"start,omitempty" require:"true"`
	// 区间结束
	End *string `json:"end,omitempty" xml:"end,omitempty" require:"true"`
	// 区间内统计值
	Value *int64 `json:"value,omitempty" xml:"value,omitempty" require:"true"`
	// 百分比
	Rate *string `json:"rate,omitempty" xml:"rate,omitempty" require:"true"`
}

func (s TradeRangeData) String() string {
	return tea.Prettify(s)
}

func (s TradeRangeData) GoString() string {
	return s.String()
}

func (s *TradeRangeData) SetStart(v string) *TradeRangeData {
	s.Start = &v
	return s
}

func (s *TradeRangeData) SetEnd(v string) *TradeRangeData {
	s.End = &v
	return s
}

func (s *TradeRangeData) SetValue(v int64) *TradeRangeData {
	s.Value = &v
	return s
}

func (s *TradeRangeData) SetRate(v string) *TradeRangeData {
	s.Rate = &v
	return s
}

// 机构趋势数据
type OrgTrendData struct {
	// 日期
	Date *string `json:"date,omitempty" xml:"date,omitempty" require:"true"`
	// 还款金额
	RepaymentAmt *string `json:"repayment_amt,omitempty" xml:"repayment_amt,omitempty" require:"true"`
	// 预算金额
	BudgetAmt *string `json:"budget_amt,omitempty" xml:"budget_amt,omitempty" require:"true"`
	// 交易金额
	TradeAmt *string `json:"trade_amt,omitempty" xml:"trade_amt,omitempty" require:"true"`
}

func (s OrgTrendData) String() string {
	return tea.Prettify(s)
}

func (s OrgTrendData) GoString() string {
	return s.String()
}

func (s *OrgTrendData) SetDate(v string) *OrgTrendData {
	s.Date = &v
	return s
}

func (s *OrgTrendData) SetRepaymentAmt(v string) *OrgTrendData {
	s.RepaymentAmt = &v
	return s
}

func (s *OrgTrendData) SetBudgetAmt(v string) *OrgTrendData {
	s.BudgetAmt = &v
	return s
}

func (s *OrgTrendData) SetTradeAmt(v string) *OrgTrendData {
	s.TradeAmt = &v
	return s
}

// 查询数据统计指标结果
type MetricData struct {
	// 租户指标: OPERATING_INCOME, REPAY_AMOUNT, REPAY_NUMBER, REPAY_USER_NUMBER, REPAY_AVG_AMOUNT, ALI_DST_AMT
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 指标值
	Total *string `json:"total,omitempty" xml:"total,omitempty" require:"true"`
	// 子指标列表
	SubList []*SubMetricData `json:"sub_list,omitempty" xml:"sub_list,omitempty" require:"true" type:"Repeated"`
}

func (s MetricData) String() string {
	return tea.Prettify(s)
}

func (s MetricData) GoString() string {
	return s.String()
}

func (s *MetricData) SetType(v string) *MetricData {
	s.Type = &v
	return s
}

func (s *MetricData) SetTotal(v string) *MetricData {
	s.Total = &v
	return s
}

func (s *MetricData) SetSubList(v []*SubMetricData) *MetricData {
	s.SubList = v
	return s
}

// 转化统计数据
type ConversionData struct {
	// 渠道
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
	// 投放人数
	SendCnt *int64 `json:"send_cnt,omitempty" xml:"send_cnt,omitempty" require:"true"`
	// 核销人数
	UseCnt *int64 `json:"use_cnt,omitempty" xml:"use_cnt,omitempty" require:"true"`
	// 核销率
	UseRate *string `json:"use_rate,omitempty" xml:"use_rate,omitempty" require:"true"`
}

func (s ConversionData) String() string {
	return tea.Prettify(s)
}

func (s ConversionData) GoString() string {
	return s.String()
}

func (s *ConversionData) SetChannel(v string) *ConversionData {
	s.Channel = &v
	return s
}

func (s *ConversionData) SetSendCnt(v int64) *ConversionData {
	s.SendCnt = &v
	return s
}

func (s *ConversionData) SetUseCnt(v int64) *ConversionData {
	s.UseCnt = &v
	return s
}

func (s *ConversionData) SetUseRate(v string) *ConversionData {
	s.UseRate = &v
	return s
}

// 还款回调结果数据
type RepayCallBackResData struct {
	// 状态
	Status *bool `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s RepayCallBackResData) String() string {
	return tea.Prettify(s)
}

func (s RepayCallBackResData) GoString() string {
	return s.String()
}

func (s *RepayCallBackResData) SetStatus(v bool) *RepayCallBackResData {
	s.Status = &v
	return s
}

// 权益智能体会话消息对象
type AgentSessionMessageData struct {
	// 会话id
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true"`
	// 消息编号
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty" require:"true"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true"`
	// 对话请求内容
	Request *string `json:"request,omitempty" xml:"request,omitempty" require:"true"`
	// 对话响应内容
	Response *string `json:"response,omitempty" xml:"response,omitempty" require:"true"`
	// 对话状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 会话结果(错误)信息
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty" require:"true"`
	// 卡片编辑的业务数据
	CustomData *string `json:"custom_data,omitempty" xml:"custom_data,omitempty" require:"true"`
	// 卡片编辑后的内容
	CustomResponse *string `json:"custom_response,omitempty" xml:"custom_response,omitempty" require:"true"`
	// 是否可编辑
	Editable *bool `json:"editable,omitempty" xml:"editable,omitempty" require:"true"`
}

func (s AgentSessionMessageData) String() string {
	return tea.Prettify(s)
}

func (s AgentSessionMessageData) GoString() string {
	return s.String()
}

func (s *AgentSessionMessageData) SetSessionId(v string) *AgentSessionMessageData {
	s.SessionId = &v
	return s
}

func (s *AgentSessionMessageData) SetMessageId(v string) *AgentSessionMessageData {
	s.MessageId = &v
	return s
}

func (s *AgentSessionMessageData) SetGmtCreate(v string) *AgentSessionMessageData {
	s.GmtCreate = &v
	return s
}

func (s *AgentSessionMessageData) SetRequest(v string) *AgentSessionMessageData {
	s.Request = &v
	return s
}

func (s *AgentSessionMessageData) SetResponse(v string) *AgentSessionMessageData {
	s.Response = &v
	return s
}

func (s *AgentSessionMessageData) SetStatus(v string) *AgentSessionMessageData {
	s.Status = &v
	return s
}

func (s *AgentSessionMessageData) SetResultMsg(v string) *AgentSessionMessageData {
	s.ResultMsg = &v
	return s
}

func (s *AgentSessionMessageData) SetCustomData(v string) *AgentSessionMessageData {
	s.CustomData = &v
	return s
}

func (s *AgentSessionMessageData) SetCustomResponse(v string) *AgentSessionMessageData {
	s.CustomResponse = &v
	return s
}

func (s *AgentSessionMessageData) SetEditable(v bool) *AgentSessionMessageData {
	s.Editable = &v
	return s
}

// 过程转化指标结果
type ProcessConversionMetricData struct {
	// 发放数
	Send *int64 `json:"send,omitempty" xml:"send,omitempty" require:"true"`
	// 核销数
	Used *int64 `json:"used,omitempty" xml:"used,omitempty" require:"true"`
	// 核销转化率
	Rate *string `json:"rate,omitempty" xml:"rate,omitempty" require:"true"`
}

func (s ProcessConversionMetricData) String() string {
	return tea.Prettify(s)
}

func (s ProcessConversionMetricData) GoString() string {
	return s.String()
}

func (s *ProcessConversionMetricData) SetSend(v int64) *ProcessConversionMetricData {
	s.Send = &v
	return s
}

func (s *ProcessConversionMetricData) SetUsed(v int64) *ProcessConversionMetricData {
	s.Used = &v
	return s
}

func (s *ProcessConversionMetricData) SetRate(v string) *ProcessConversionMetricData {
	s.Rate = &v
	return s
}

// 权益智能体会话对象
type AgentSessionData struct {
	// 会话id
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true"`
	// 会话标题
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
	// 创建时间
	GmtCreated *string `json:"gmt_created,omitempty" xml:"gmt_created,omitempty" require:"true"`
	// VALID("生效"),INVALID("失效"),RUNNING("进行中"),FAILED("失败"),TERMINATED("已终止"), COMPLETED("已完成");
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 任务列表
	TaskList []*AgentTaskData `json:"task_list,omitempty" xml:"task_list,omitempty" type:"Repeated"`
}

func (s AgentSessionData) String() string {
	return tea.Prettify(s)
}

func (s AgentSessionData) GoString() string {
	return s.String()
}

func (s *AgentSessionData) SetSessionId(v string) *AgentSessionData {
	s.SessionId = &v
	return s
}

func (s *AgentSessionData) SetTitle(v string) *AgentSessionData {
	s.Title = &v
	return s
}

func (s *AgentSessionData) SetGmtCreated(v string) *AgentSessionData {
	s.GmtCreated = &v
	return s
}

func (s *AgentSessionData) SetStatus(v string) *AgentSessionData {
	s.Status = &v
	return s
}

func (s *AgentSessionData) SetTaskList(v []*AgentTaskData) *AgentSessionData {
	s.TaskList = v
	return s
}

// 人群信息
type CrowdStrategyData struct {
	// 人群编码
	StrategyCode *string `json:"strategy_code,omitempty" xml:"strategy_code,omitempty" require:"true"`
	// 人群名称
	StrategyName *string `json:"strategy_name,omitempty" xml:"strategy_name,omitempty" require:"true"`
	// 状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 人群数量
	StrategyCount *int64 `json:"strategy_count,omitempty" xml:"strategy_count,omitempty" require:"true"`
	// 用户数量
	UserCount *int64 `json:"user_count,omitempty" xml:"user_count,omitempty" require:"true"`
	// 机构名称
	InstName *string `json:"inst_name,omitempty" xml:"inst_name,omitempty"`
	// 日期
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true"`
}

func (s CrowdStrategyData) String() string {
	return tea.Prettify(s)
}

func (s CrowdStrategyData) GoString() string {
	return s.String()
}

func (s *CrowdStrategyData) SetStrategyCode(v string) *CrowdStrategyData {
	s.StrategyCode = &v
	return s
}

func (s *CrowdStrategyData) SetStrategyName(v string) *CrowdStrategyData {
	s.StrategyName = &v
	return s
}

func (s *CrowdStrategyData) SetStatus(v string) *CrowdStrategyData {
	s.Status = &v
	return s
}

func (s *CrowdStrategyData) SetStrategyCount(v int64) *CrowdStrategyData {
	s.StrategyCount = &v
	return s
}

func (s *CrowdStrategyData) SetUserCount(v int64) *CrowdStrategyData {
	s.UserCount = &v
	return s
}

func (s *CrowdStrategyData) SetInstName(v string) *CrowdStrategyData {
	s.InstName = &v
	return s
}

func (s *CrowdStrategyData) SetGmtCreate(v string) *CrowdStrategyData {
	s.GmtCreate = &v
	return s
}

// 券信息
type VoucherInfo struct {
	// 券id
	VoucherId *string `json:"voucher_id,omitempty" xml:"voucher_id,omitempty" require:"true"`
	// 2088id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 产品编码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 资产编码
	AssetsCode *string `json:"assets_code,omitempty" xml:"assets_code,omitempty" require:"true"`
	// 券名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 券模板ID
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 发行人id
	PublisherUserId *string `json:"publisher_user_id,omitempty" xml:"publisher_user_id,omitempty" require:"true"`
	// 状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 券生效时间
	GmtActive *string `json:"gmt_active,omitempty" xml:"gmt_active,omitempty" require:"true"`
	// 券失效时间
	GmtExpired *string `json:"gmt_expired,omitempty" xml:"gmt_expired,omitempty" require:"true"`
	// 展期
	GmtExtend *string `json:"gmt_extend,omitempty" xml:"gmt_extend,omitempty" require:"true"`
	// 面额
	TotalAmount *string `json:"total_amount,omitempty" xml:"total_amount,omitempty" require:"true"`
	// 门槛金额
	FloorAmount *string `json:"floor_amount,omitempty" xml:"floor_amount,omitempty" require:"true"`
	// 总次数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty" require:"true"`
	// 可用次数
	AvailableCount *int64 `json:"available_count,omitempty" xml:"available_count,omitempty" require:"true"`
	// 已使用次数
	UsedCount *int64 `json:"used_count,omitempty" xml:"used_count,omitempty" require:"true"`
	// 券描述
	VoucherDescription *string `json:"voucher_description,omitempty" xml:"voucher_description,omitempty" require:"true"`
	// 券模板扩展信息
	ExtendTemplateInfo *string `json:"extend_template_info,omitempty" xml:"extend_template_info,omitempty" require:"true"`
	// 扩展信息
	ExtendInfo *string `json:"extend_info,omitempty" xml:"extend_info,omitempty" require:"true"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true"`
	// 修改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true"`
	// 业务类型
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty" require:"true"`
	// 收银台展示分组
	GroupCode *string `json:"group_code,omitempty" xml:"group_code,omitempty" require:"true"`
	// 收银台展示分组名称
	GroupCodeName *string `json:"group_code_name,omitempty" xml:"group_code_name,omitempty" require:"true"`
}

func (s VoucherInfo) String() string {
	return tea.Prettify(s)
}

func (s VoucherInfo) GoString() string {
	return s.String()
}

func (s *VoucherInfo) SetVoucherId(v string) *VoucherInfo {
	s.VoucherId = &v
	return s
}

func (s *VoucherInfo) SetUserId(v string) *VoucherInfo {
	s.UserId = &v
	return s
}

func (s *VoucherInfo) SetProductCode(v string) *VoucherInfo {
	s.ProductCode = &v
	return s
}

func (s *VoucherInfo) SetAssetsCode(v string) *VoucherInfo {
	s.AssetsCode = &v
	return s
}

func (s *VoucherInfo) SetName(v string) *VoucherInfo {
	s.Name = &v
	return s
}

func (s *VoucherInfo) SetTemplateId(v string) *VoucherInfo {
	s.TemplateId = &v
	return s
}

func (s *VoucherInfo) SetPublisherUserId(v string) *VoucherInfo {
	s.PublisherUserId = &v
	return s
}

func (s *VoucherInfo) SetStatus(v string) *VoucherInfo {
	s.Status = &v
	return s
}

func (s *VoucherInfo) SetGmtActive(v string) *VoucherInfo {
	s.GmtActive = &v
	return s
}

func (s *VoucherInfo) SetGmtExpired(v string) *VoucherInfo {
	s.GmtExpired = &v
	return s
}

func (s *VoucherInfo) SetGmtExtend(v string) *VoucherInfo {
	s.GmtExtend = &v
	return s
}

func (s *VoucherInfo) SetTotalAmount(v string) *VoucherInfo {
	s.TotalAmount = &v
	return s
}

func (s *VoucherInfo) SetFloorAmount(v string) *VoucherInfo {
	s.FloorAmount = &v
	return s
}

func (s *VoucherInfo) SetTotalCount(v int64) *VoucherInfo {
	s.TotalCount = &v
	return s
}

func (s *VoucherInfo) SetAvailableCount(v int64) *VoucherInfo {
	s.AvailableCount = &v
	return s
}

func (s *VoucherInfo) SetUsedCount(v int64) *VoucherInfo {
	s.UsedCount = &v
	return s
}

func (s *VoucherInfo) SetVoucherDescription(v string) *VoucherInfo {
	s.VoucherDescription = &v
	return s
}

func (s *VoucherInfo) SetExtendTemplateInfo(v string) *VoucherInfo {
	s.ExtendTemplateInfo = &v
	return s
}

func (s *VoucherInfo) SetExtendInfo(v string) *VoucherInfo {
	s.ExtendInfo = &v
	return s
}

func (s *VoucherInfo) SetGmtCreate(v string) *VoucherInfo {
	s.GmtCreate = &v
	return s
}

func (s *VoucherInfo) SetGmtModified(v string) *VoucherInfo {
	s.GmtModified = &v
	return s
}

func (s *VoucherInfo) SetBizCode(v string) *VoucherInfo {
	s.BizCode = &v
	return s
}

func (s *VoucherInfo) SetGroupCode(v string) *VoucherInfo {
	s.GroupCode = &v
	return s
}

func (s *VoucherInfo) SetGroupCodeName(v string) *VoucherInfo {
	s.GroupCodeName = &v
	return s
}

// 机构订单交易记录对象
type OrgTradeData struct {
	// 平台优惠金额。单位：元。
	DiscountAmount *string `json:"discount_amount,omitempty" xml:"discount_amount,omitempty" require:"true"`
	// 买家实付金额，单位为元，两位小数。
	BuyerPayAmount *string `json:"buyer_pay_amount,omitempty" xml:"buyer_pay_amount,omitempty" require:"true"`
	// 买家在支付宝的用户id
	BuyerUserId *string `json:"buyer_user_id,omitempty" xml:"buyer_user_id,omitempty" require:"true"`
	// 支付宝交易号，交易单主键id
	OutTradeNo *string `json:"out_trade_no,omitempty" xml:"out_trade_no,omitempty" require:"true"`
	// 支付宝订单号
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty" require:"true"`
	// 本次交易打款给卖家的时间
	SendPayDate *string `json:"send_pay_date,omitempty" xml:"send_pay_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 交易状态：WAIT_BUYER_PAY（交易创建，等待买家付款）、TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、TRADE_SUCCESS（交易支付成功）、TRADE_FINISHED（交易结束，不可退款）
	TradeStatus *string `json:"trade_status,omitempty" xml:"trade_status,omitempty" require:"true"`
	// 实收金额，单位为元，两位小数。该金额为本笔交易，商户账户能够实际收到的金额
	ReceiptAmount *string `json:"receipt_amount,omitempty" xml:"receipt_amount,omitempty" require:"true"`
	// 交易的订单金额，单位为元，两位小数。该参数的值为支付时传入的total_amount
	TotalAmount *string `json:"total_amount,omitempty" xml:"total_amount,omitempty" require:"true"`
}

func (s OrgTradeData) String() string {
	return tea.Prettify(s)
}

func (s OrgTradeData) GoString() string {
	return s.String()
}

func (s *OrgTradeData) SetDiscountAmount(v string) *OrgTradeData {
	s.DiscountAmount = &v
	return s
}

func (s *OrgTradeData) SetBuyerPayAmount(v string) *OrgTradeData {
	s.BuyerPayAmount = &v
	return s
}

func (s *OrgTradeData) SetBuyerUserId(v string) *OrgTradeData {
	s.BuyerUserId = &v
	return s
}

func (s *OrgTradeData) SetOutTradeNo(v string) *OrgTradeData {
	s.OutTradeNo = &v
	return s
}

func (s *OrgTradeData) SetTradeNo(v string) *OrgTradeData {
	s.TradeNo = &v
	return s
}

func (s *OrgTradeData) SetSendPayDate(v string) *OrgTradeData {
	s.SendPayDate = &v
	return s
}

func (s *OrgTradeData) SetTradeStatus(v string) *OrgTradeData {
	s.TradeStatus = &v
	return s
}

func (s *OrgTradeData) SetReceiptAmount(v string) *OrgTradeData {
	s.ReceiptAmount = &v
	return s
}

func (s *OrgTradeData) SetTotalAmount(v string) *OrgTradeData {
	s.TotalAmount = &v
	return s
}

// 供应商打款记录
type PaymentRecord struct {
	// 云上租户id
	CloudTenantId *string `json:"cloud_tenant_id,omitempty" xml:"cloud_tenant_id,omitempty" require:"true"`
	// 打款金额，单位分
	PaymentAmount *int64 `json:"payment_amount,omitempty" xml:"payment_amount,omitempty" require:"true"`
	// 服务商名称 - 即云租户名称，比如南京飞翰
	SupplierName *string `json:"supplier_name,omitempty" xml:"supplier_name,omitempty" require:"true"`
	// 打款日期
	PaymentDate *string `json:"payment_date,omitempty" xml:"payment_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 唯一请求id，即payment_record_id
	RequestUniqueId *string `json:"request_unique_id,omitempty" xml:"request_unique_id,omitempty" require:"true"`
}

func (s PaymentRecord) String() string {
	return tea.Prettify(s)
}

func (s PaymentRecord) GoString() string {
	return s.String()
}

func (s *PaymentRecord) SetCloudTenantId(v string) *PaymentRecord {
	s.CloudTenantId = &v
	return s
}

func (s *PaymentRecord) SetPaymentAmount(v int64) *PaymentRecord {
	s.PaymentAmount = &v
	return s
}

func (s *PaymentRecord) SetSupplierName(v string) *PaymentRecord {
	s.SupplierName = &v
	return s
}

func (s *PaymentRecord) SetPaymentDate(v string) *PaymentRecord {
	s.PaymentDate = &v
	return s
}

func (s *PaymentRecord) SetRequestUniqueId(v string) *PaymentRecord {
	s.RequestUniqueId = &v
	return s
}

// agent对话客户端返回结果
type AgentChatCustomResponse struct {
	// 消息id
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty"`
	// 内容
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
}

func (s AgentChatCustomResponse) String() string {
	return tea.Prettify(s)
}

func (s AgentChatCustomResponse) GoString() string {
	return s.String()
}

func (s *AgentChatCustomResponse) SetMessageId(v string) *AgentChatCustomResponse {
	s.MessageId = &v
	return s
}

func (s *AgentChatCustomResponse) SetContent(v string) *AgentChatCustomResponse {
	s.Content = &v
	return s
}

// 机构总览数据
type OrgOverviewData struct {
	// 预算总金额
	TotalBudgetAmt *string `json:"total_budget_amt,omitempty" xml:"total_budget_amt,omitempty" require:"true"`
	// 花呗预算金额
	HuabeiBudgetAmt *string `json:"huabei_budget_amt,omitempty" xml:"huabei_budget_amt,omitempty" require:"true"`
	// 借呗预算金额
	JiebeiBudgetAmt *string `json:"jiebei_budget_amt,omitempty" xml:"jiebei_budget_amt,omitempty" require:"true"`
	// 小微预算金额
	XiaoweiBudgetAmt *string `json:"xiaowei_budget_amt,omitempty" xml:"xiaowei_budget_amt,omitempty" require:"true"`
	// 服务费预算金额
	ServiceBudgetAmt *string `json:"service_budget_amt,omitempty" xml:"service_budget_amt,omitempty" require:"true"`
	// 总回款金额
	TotalRepaymentAmt *string `json:"total_repayment_amt,omitempty" xml:"total_repayment_amt,omitempty" require:"true"`
	// 花呗回款金额
	HuabeiRepaymentAmt *string `json:"huabei_repayment_amt,omitempty" xml:"huabei_repayment_amt,omitempty" require:"true"`
	// 借呗回款金额
	JiebeiRepaymentAmt *string `json:"jiebei_repayment_amt,omitempty" xml:"jiebei_repayment_amt,omitempty" require:"true"`
	// 小微回款金额
	XiaoweiRepaymentAmt *string `json:"xiaowei_repayment_amt,omitempty" xml:"xiaowei_repayment_amt,omitempty" require:"true"`
	// 总交易金额
	TotalTradeAmt *string `json:"total_trade_amt,omitempty" xml:"total_trade_amt,omitempty" require:"true"`
	// 花呗交易金额
	HuabeiTradeAmt *string `json:"huabei_trade_amt,omitempty" xml:"huabei_trade_amt,omitempty" require:"true"`
	// 借呗交易金额
	JiebeiTradeAmt *string `json:"jiebei_trade_amt,omitempty" xml:"jiebei_trade_amt,omitempty" require:"true"`
	// 小微交易金额
	XiaoweiTradeAmt *string `json:"xiaowei_trade_amt,omitempty" xml:"xiaowei_trade_amt,omitempty" require:"true"`
	// 内部补贴金额
	InternalSubsidyAmt *string `json:"internal_subsidy_amt,omitempty" xml:"internal_subsidy_amt,omitempty" require:"true"`
	// 净回款额
	TotalNetRepaymentAmt *string `json:"total_net_repayment_amt,omitempty" xml:"total_net_repayment_amt,omitempty" require:"true"`
	// 活动roi
	ActivityRoi *string `json:"activity_roi,omitempty" xml:"activity_roi,omitempty" require:"true"`
	// 花呗roi
	HuabeiRoi *string `json:"huabei_roi,omitempty" xml:"huabei_roi,omitempty" require:"true"`
	// 借呗roi
	JiebeiRoi *string `json:"jiebei_roi,omitempty" xml:"jiebei_roi,omitempty" require:"true"`
	// 小微roi
	XiaoweiRoi *string `json:"xiaowei_roi,omitempty" xml:"xiaowei_roi,omitempty" require:"true"`
}

func (s OrgOverviewData) String() string {
	return tea.Prettify(s)
}

func (s OrgOverviewData) GoString() string {
	return s.String()
}

func (s *OrgOverviewData) SetTotalBudgetAmt(v string) *OrgOverviewData {
	s.TotalBudgetAmt = &v
	return s
}

func (s *OrgOverviewData) SetHuabeiBudgetAmt(v string) *OrgOverviewData {
	s.HuabeiBudgetAmt = &v
	return s
}

func (s *OrgOverviewData) SetJiebeiBudgetAmt(v string) *OrgOverviewData {
	s.JiebeiBudgetAmt = &v
	return s
}

func (s *OrgOverviewData) SetXiaoweiBudgetAmt(v string) *OrgOverviewData {
	s.XiaoweiBudgetAmt = &v
	return s
}

func (s *OrgOverviewData) SetServiceBudgetAmt(v string) *OrgOverviewData {
	s.ServiceBudgetAmt = &v
	return s
}

func (s *OrgOverviewData) SetTotalRepaymentAmt(v string) *OrgOverviewData {
	s.TotalRepaymentAmt = &v
	return s
}

func (s *OrgOverviewData) SetHuabeiRepaymentAmt(v string) *OrgOverviewData {
	s.HuabeiRepaymentAmt = &v
	return s
}

func (s *OrgOverviewData) SetJiebeiRepaymentAmt(v string) *OrgOverviewData {
	s.JiebeiRepaymentAmt = &v
	return s
}

func (s *OrgOverviewData) SetXiaoweiRepaymentAmt(v string) *OrgOverviewData {
	s.XiaoweiRepaymentAmt = &v
	return s
}

func (s *OrgOverviewData) SetTotalTradeAmt(v string) *OrgOverviewData {
	s.TotalTradeAmt = &v
	return s
}

func (s *OrgOverviewData) SetHuabeiTradeAmt(v string) *OrgOverviewData {
	s.HuabeiTradeAmt = &v
	return s
}

func (s *OrgOverviewData) SetJiebeiTradeAmt(v string) *OrgOverviewData {
	s.JiebeiTradeAmt = &v
	return s
}

func (s *OrgOverviewData) SetXiaoweiTradeAmt(v string) *OrgOverviewData {
	s.XiaoweiTradeAmt = &v
	return s
}

func (s *OrgOverviewData) SetInternalSubsidyAmt(v string) *OrgOverviewData {
	s.InternalSubsidyAmt = &v
	return s
}

func (s *OrgOverviewData) SetTotalNetRepaymentAmt(v string) *OrgOverviewData {
	s.TotalNetRepaymentAmt = &v
	return s
}

func (s *OrgOverviewData) SetActivityRoi(v string) *OrgOverviewData {
	s.ActivityRoi = &v
	return s
}

func (s *OrgOverviewData) SetHuabeiRoi(v string) *OrgOverviewData {
	s.HuabeiRoi = &v
	return s
}

func (s *OrgOverviewData) SetJiebeiRoi(v string) *OrgOverviewData {
	s.JiebeiRoi = &v
	return s
}

func (s *OrgOverviewData) SetXiaoweiRoi(v string) *OrgOverviewData {
	s.XiaoweiRoi = &v
	return s
}

// 权益智能体对话返回结构体
type AgentChatResponse struct {
	// 是否结束
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 对话data数据
	Data *AgentChatData `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s AgentChatResponse) String() string {
	return tea.Prettify(s)
}

func (s AgentChatResponse) GoString() string {
	return s.String()
}

func (s *AgentChatResponse) SetSuccess(v bool) *AgentChatResponse {
	s.Success = &v
	return s
}

func (s *AgentChatResponse) SetData(v *AgentChatData) *AgentChatResponse {
	s.Data = v
	return s
}

// 券咨询业务上下文
type VoucherConsultBusinessContext struct {
	// 指定资产编码列表
	AssetTypeCodeList []*string `json:"asset_type_code_list,omitempty" xml:"asset_type_code_list,omitempty" require:"true" type:"Repeated"`
	// 订单金额
	OrderAmount *string `json:"order_amount,omitempty" xml:"order_amount,omitempty" require:"true"`
	// 收款账号
	PayeeUserId *string `json:"payee_user_id,omitempty" xml:"payee_user_id,omitempty" require:"true"`
	// 业务上下文信息
	BizContext *string `json:"biz_context,omitempty" xml:"biz_context,omitempty" require:"true"`
}

func (s VoucherConsultBusinessContext) String() string {
	return tea.Prettify(s)
}

func (s VoucherConsultBusinessContext) GoString() string {
	return s.String()
}

func (s *VoucherConsultBusinessContext) SetAssetTypeCodeList(v []*string) *VoucherConsultBusinessContext {
	s.AssetTypeCodeList = v
	return s
}

func (s *VoucherConsultBusinessContext) SetOrderAmount(v string) *VoucherConsultBusinessContext {
	s.OrderAmount = &v
	return s
}

func (s *VoucherConsultBusinessContext) SetPayeeUserId(v string) *VoucherConsultBusinessContext {
	s.PayeeUserId = &v
	return s
}

func (s *VoucherConsultBusinessContext) SetBizContext(v string) *VoucherConsultBusinessContext {
	s.BizContext = &v
	return s
}

// 支付宝交易记录
type OrgAlipayTradeData struct {
	// 支付宝订单号
	AlipayOrderNo *string `json:"alipay_order_no,omitempty" xml:"alipay_order_no,omitempty" require:"true"`
	// 交易创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true"`
	// 交易支付时间
	GmtPay *string `json:"gmt_pay,omitempty" xml:"gmt_pay,omitempty" require:"true"`
	// 交易退款时间
	GmtRefund *string `json:"gmt_refund,omitempty" xml:"gmt_refund,omitempty" require:"true"`
	// 商品备注信息
	GoodsMemo *string `json:"goods_memo,omitempty" xml:"goods_memo,omitempty"`
	// 机构名称
	GoodsTitle *string `json:"goods_title,omitempty" xml:"goods_title,omitempty" require:"true"`
	// 商户订单号，创建支付宝交易时传入的信息
	MerchantOrderNo *string `json:"merchant_order_no,omitempty" xml:"merchant_order_no,omitempty" require:"true"`
	// 商家优惠金额
	NetMdiscount *string `json:"net_mdiscount,omitempty" xml:"net_mdiscount,omitempty" require:"true"`
	// 对方账户
	OtherAccount *string `json:"other_account,omitempty" xml:"other_account,omitempty" require:"true"`
	// 订单退款金额
	RefundAmount *string `json:"refund_amount,omitempty" xml:"refund_amount,omitempty" require:"true"`
	// 服务费金额
	ServiceFee *string `json:"service_fee,omitempty" xml:"service_fee,omitempty" require:"true"`
	// 门店名称
	StoreName *string `json:"store_name,omitempty" xml:"store_name,omitempty"`
	// 门店编号
	StoreNo *string `json:"store_no,omitempty" xml:"store_no,omitempty"`
	// 订单金额
	TotalAmount *string `json:"total_amount,omitempty" xml:"total_amount,omitempty" require:"true"`
	// 订单状态(待付款,成功,关闭,待发货,待确认收货,已预付,进行中)
	TradeStatus *string `json:"trade_status,omitempty" xml:"trade_status,omitempty" require:"true"`
	// 业务类型，帮助商户作为对账参考
	TradeType *string `json:"trade_type,omitempty" xml:"trade_type,omitempty" require:"true"`
}

func (s OrgAlipayTradeData) String() string {
	return tea.Prettify(s)
}

func (s OrgAlipayTradeData) GoString() string {
	return s.String()
}

func (s *OrgAlipayTradeData) SetAlipayOrderNo(v string) *OrgAlipayTradeData {
	s.AlipayOrderNo = &v
	return s
}

func (s *OrgAlipayTradeData) SetGmtCreate(v string) *OrgAlipayTradeData {
	s.GmtCreate = &v
	return s
}

func (s *OrgAlipayTradeData) SetGmtPay(v string) *OrgAlipayTradeData {
	s.GmtPay = &v
	return s
}

func (s *OrgAlipayTradeData) SetGmtRefund(v string) *OrgAlipayTradeData {
	s.GmtRefund = &v
	return s
}

func (s *OrgAlipayTradeData) SetGoodsMemo(v string) *OrgAlipayTradeData {
	s.GoodsMemo = &v
	return s
}

func (s *OrgAlipayTradeData) SetGoodsTitle(v string) *OrgAlipayTradeData {
	s.GoodsTitle = &v
	return s
}

func (s *OrgAlipayTradeData) SetMerchantOrderNo(v string) *OrgAlipayTradeData {
	s.MerchantOrderNo = &v
	return s
}

func (s *OrgAlipayTradeData) SetNetMdiscount(v string) *OrgAlipayTradeData {
	s.NetMdiscount = &v
	return s
}

func (s *OrgAlipayTradeData) SetOtherAccount(v string) *OrgAlipayTradeData {
	s.OtherAccount = &v
	return s
}

func (s *OrgAlipayTradeData) SetRefundAmount(v string) *OrgAlipayTradeData {
	s.RefundAmount = &v
	return s
}

func (s *OrgAlipayTradeData) SetServiceFee(v string) *OrgAlipayTradeData {
	s.ServiceFee = &v
	return s
}

func (s *OrgAlipayTradeData) SetStoreName(v string) *OrgAlipayTradeData {
	s.StoreName = &v
	return s
}

func (s *OrgAlipayTradeData) SetStoreNo(v string) *OrgAlipayTradeData {
	s.StoreNo = &v
	return s
}

func (s *OrgAlipayTradeData) SetTotalAmount(v string) *OrgAlipayTradeData {
	s.TotalAmount = &v
	return s
}

func (s *OrgAlipayTradeData) SetTradeStatus(v string) *OrgAlipayTradeData {
	s.TradeStatus = &v
	return s
}

func (s *OrgAlipayTradeData) SetTradeType(v string) *OrgAlipayTradeData {
	s.TradeType = &v
	return s
}

// 核销明细月文件
type BenefitWriteOffMonthFileData struct {
	// 所属月份
	BillingMonth *string `json:"billing_month,omitempty" xml:"billing_month,omitempty" require:"true"`
	// AFTS 上传到文件 id
	FileFiledId *string `json:"file_filed_id,omitempty" xml:"file_filed_id,omitempty" require:"true"`
}

func (s BenefitWriteOffMonthFileData) String() string {
	return tea.Prettify(s)
}

func (s BenefitWriteOffMonthFileData) GoString() string {
	return s.String()
}

func (s *BenefitWriteOffMonthFileData) SetBillingMonth(v string) *BenefitWriteOffMonthFileData {
	s.BillingMonth = &v
	return s
}

func (s *BenefitWriteOffMonthFileData) SetFileFiledId(v string) *BenefitWriteOffMonthFileData {
	s.FileFiledId = &v
	return s
}

type CallbackAntdigitalAssetOrgoperationRepayRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 还款编号
	RepayRecordNo *string `json:"repay_record_no,omitempty" xml:"repay_record_no,omitempty" require:"true"`
	// 还款处理状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 额外的信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	// 请求唯一id，最长32字符
	//
	RequestUniqueId *string `json:"request_unique_id,omitempty" xml:"request_unique_id,omitempty" require:"true"`
}

func (s CallbackAntdigitalAssetOrgoperationRepayRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackAntdigitalAssetOrgoperationRepayRequest) GoString() string {
	return s.String()
}

func (s *CallbackAntdigitalAssetOrgoperationRepayRequest) SetAuthToken(v string) *CallbackAntdigitalAssetOrgoperationRepayRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackAntdigitalAssetOrgoperationRepayRequest) SetProductInstanceId(v string) *CallbackAntdigitalAssetOrgoperationRepayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackAntdigitalAssetOrgoperationRepayRequest) SetTenantId(v string) *CallbackAntdigitalAssetOrgoperationRepayRequest {
	s.TenantId = &v
	return s
}

func (s *CallbackAntdigitalAssetOrgoperationRepayRequest) SetRepayRecordNo(v string) *CallbackAntdigitalAssetOrgoperationRepayRequest {
	s.RepayRecordNo = &v
	return s
}

func (s *CallbackAntdigitalAssetOrgoperationRepayRequest) SetStatus(v string) *CallbackAntdigitalAssetOrgoperationRepayRequest {
	s.Status = &v
	return s
}

func (s *CallbackAntdigitalAssetOrgoperationRepayRequest) SetExtInfo(v string) *CallbackAntdigitalAssetOrgoperationRepayRequest {
	s.ExtInfo = &v
	return s
}

func (s *CallbackAntdigitalAssetOrgoperationRepayRequest) SetRequestUniqueId(v string) *CallbackAntdigitalAssetOrgoperationRepayRequest {
	s.RequestUniqueId = &v
	return s
}

type CallbackAntdigitalAssetOrgoperationRepayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 还款回调结果
	Data *RepayCallBackResData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CallbackAntdigitalAssetOrgoperationRepayResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackAntdigitalAssetOrgoperationRepayResponse) GoString() string {
	return s.String()
}

func (s *CallbackAntdigitalAssetOrgoperationRepayResponse) SetReqMsgId(v string) *CallbackAntdigitalAssetOrgoperationRepayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackAntdigitalAssetOrgoperationRepayResponse) SetResultCode(v string) *CallbackAntdigitalAssetOrgoperationRepayResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackAntdigitalAssetOrgoperationRepayResponse) SetResultMsg(v string) *CallbackAntdigitalAssetOrgoperationRepayResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackAntdigitalAssetOrgoperationRepayResponse) SetData(v *RepayCallBackResData) *CallbackAntdigitalAssetOrgoperationRepayResponse {
	s.Data = v
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
				"_prod_code":       tea.String("QFTEST"),
				"_prod_channel":    tea.String("default"),
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
 * Description: 机构权益运营还款回调
 * Summary: 机构权益运营还款回调
 */
func (client *Client) CallbackAntdigitalAssetOrgoperationRepay(request *CallbackAntdigitalAssetOrgoperationRepayRequest) (_result *CallbackAntdigitalAssetOrgoperationRepayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackAntdigitalAssetOrgoperationRepayResponse{}
	_body, _err := client.CallbackAntdigitalAssetOrgoperationRepayEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 机构权益运营还款回调
 * Summary: 机构权益运营还款回调
 */
func (client *Client) CallbackAntdigitalAssetOrgoperationRepayEx(request *CallbackAntdigitalAssetOrgoperationRepayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackAntdigitalAssetOrgoperationRepayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackAntdigitalAssetOrgoperationRepayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.asset.orgoperation.repay.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
