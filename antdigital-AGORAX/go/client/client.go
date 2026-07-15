// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/v2/service"
	"github.com/alibabacloud-go/tea/tea"
	antchainutil "github.com/antchain-openapi-sdk-go/antchain-util/service"
)

// Description:
//
// Model for initing client
type Config struct {
	// accesskey id
	AccessKeyId *string `json:"accessKeyId,omitempty" xml:"accessKeyId,omitempty"`
	// accesskey secret
	AccessKeySecret *string `json:"accessKeySecret,omitempty" xml:"accessKeySecret,omitempty"`
	// security token
	SecurityToken *string `json:"securityToken,omitempty" xml:"securityToken,omitempty"`
	// http protocol
	//
	// example:
	//
	// http
	Protocol *string `json:"protocol,omitempty" xml:"protocol,omitempty"`
	// read timeout
	//
	// example:
	//
	// 10
	ReadTimeout *int `json:"readTimeout,omitempty" xml:"readTimeout,omitempty"`
	// connect timeout
	//
	// example:
	//
	// 10
	ConnectTimeout *int `json:"connectTimeout,omitempty" xml:"connectTimeout,omitempty"`
	// http proxy
	//
	// example:
	//
	// http://localhost
	HttpProxy *string `json:"httpProxy,omitempty" xml:"httpProxy,omitempty"`
	// https proxy
	//
	// example:
	//
	// https://localhost
	HttpsProxy *string `json:"httpsProxy,omitempty" xml:"httpsProxy,omitempty"`
	// endpoint
	//
	// example:
	//
	// cs.aliyuncs.com
	Endpoint *string `json:"endpoint,omitempty" xml:"endpoint,omitempty"`
	// proxy white list
	//
	// example:
	//
	// http://localhost
	NoProxy *string `json:"noProxy,omitempty" xml:"noProxy,omitempty"`
	// max idle conns
	//
	// example:
	//
	// 3
	MaxIdleConns *int `json:"maxIdleConns,omitempty" xml:"maxIdleConns,omitempty"`
	// user agent
	//
	// example:
	//
	// Alibabacloud/1
	UserAgent *string `json:"userAgent,omitempty" xml:"userAgent,omitempty"`
	// socks5 proxy
	Socks5Proxy *string `json:"socks5Proxy,omitempty" xml:"socks5Proxy,omitempty"`
	// socks5 network
	//
	// example:
	//
	// TCP
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

// 数据授权服务审批流程节点结构体
type ProcessNode struct {
	// 审批节点ID
	// example:
	//
	// did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty" require:"true" maxLength:"100"`
	// 节点名称
	// example:
	//
	// Bob
	NodeName *string `json:"node_name,omitempty" xml:"node_name,omitempty" require:"true" maxLength:"64"`
	// 节点序号，从1开始编号
	// example:
	//
	// 1
	NodeNum *int64 `json:"node_num,omitempty" xml:"node_num,omitempty" require:"true" minimum:"1"`
}

func (s ProcessNode) String() string {
	return tea.Prettify(s)
}

func (s ProcessNode) GoString() string {
	return s.String()
}

func (s *ProcessNode) SetNodeId(v string) *ProcessNode {
	s.NodeId = &v
	return s
}

func (s *ProcessNode) SetNodeName(v string) *ProcessNode {
	s.NodeName = &v
	return s
}

func (s *ProcessNode) SetNodeNum(v int64) *ProcessNode {
	s.NodeNum = &v
	return s
}

// 蚂蚁链浏览器合约链交易内容
type BlockchainBrowserTransactionContract struct {
	// data
	// example:
	//
	// asdfasdfsadfsdafasd
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
	// from
	// example:
	//
	// eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612
	From *string `json:"from,omitempty" xml:"from,omitempty" require:"true"`
	// to
	// example:
	//
	// eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612
	To *string `json:"to,omitempty" xml:"to,omitempty" require:"true"`
	// gas
	// example:
	//
	// 0
	Gas *int64 `json:"gas,omitempty" xml:"gas,omitempty" require:"true"`
	// hash
	// example:
	//
	// 65a0a7aa9b6f739faddd8e993eadecf85340cdeda6e20417e013e052f30afd3c
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty" require:"true"`
	// nonce
	// example:
	//
	// 395460146568219584
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty" require:"true"`
	// period
	// example:
	//
	// 0
	Period *int64 `json:"period,omitempty" xml:"period,omitempty" require:"true"`
	// signature_list
	// example:
	//
	// signature_list
	SignatureList []*string `json:"signature_list,omitempty" xml:"signature_list,omitempty" require:"true" type:"Repeated"`
	// timestamp
	// example:
	//
	// 1604565299516
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty" require:"true"`
	// transaction_type
	// example:
	//
	// TX_DEPOSIT_DATA
	TransactionType *string `json:"transaction_type,omitempty" xml:"transaction_type,omitempty" require:"true"`
	// value
	// example:
	//
	// 0
	Value *int64 `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s BlockchainBrowserTransactionContract) String() string {
	return tea.Prettify(s)
}

func (s BlockchainBrowserTransactionContract) GoString() string {
	return s.String()
}

func (s *BlockchainBrowserTransactionContract) SetData(v string) *BlockchainBrowserTransactionContract {
	s.Data = &v
	return s
}

func (s *BlockchainBrowserTransactionContract) SetFrom(v string) *BlockchainBrowserTransactionContract {
	s.From = &v
	return s
}

func (s *BlockchainBrowserTransactionContract) SetTo(v string) *BlockchainBrowserTransactionContract {
	s.To = &v
	return s
}

func (s *BlockchainBrowserTransactionContract) SetGas(v int64) *BlockchainBrowserTransactionContract {
	s.Gas = &v
	return s
}

func (s *BlockchainBrowserTransactionContract) SetHash(v string) *BlockchainBrowserTransactionContract {
	s.Hash = &v
	return s
}

func (s *BlockchainBrowserTransactionContract) SetNonce(v string) *BlockchainBrowserTransactionContract {
	s.Nonce = &v
	return s
}

func (s *BlockchainBrowserTransactionContract) SetPeriod(v int64) *BlockchainBrowserTransactionContract {
	s.Period = &v
	return s
}

func (s *BlockchainBrowserTransactionContract) SetSignatureList(v []*string) *BlockchainBrowserTransactionContract {
	s.SignatureList = v
	return s
}

func (s *BlockchainBrowserTransactionContract) SetTimestamp(v int64) *BlockchainBrowserTransactionContract {
	s.Timestamp = &v
	return s
}

func (s *BlockchainBrowserTransactionContract) SetTransactionType(v string) *BlockchainBrowserTransactionContract {
	s.TransactionType = &v
	return s
}

func (s *BlockchainBrowserTransactionContract) SetValue(v int64) *BlockchainBrowserTransactionContract {
	s.Value = &v
	return s
}

// TriggerLogDTO类成员
type PositionStructBody struct {
	// 错误计数
	// example:
	//
	// "1"
	ErrorCount *string `json:"error_count,omitempty" xml:"error_count,omitempty"`
	// 高度
	// example:
	//
	// "10"
	Height *string `json:"height,omitempty" xml:"height,omitempty"`
	// 序号
	// example:
	//
	// “1”
	Index *string `json:"index,omitempty" xml:"index,omitempty"`
	// 最后一个错误
	// example:
	//
	// “”
	LastError *string `json:"last_error,omitempty" xml:"last_error,omitempty"`
	// 类型
	// example:
	//
	// ""
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s PositionStructBody) String() string {
	return tea.Prettify(s)
}

func (s PositionStructBody) GoString() string {
	return s.String()
}

func (s *PositionStructBody) SetErrorCount(v string) *PositionStructBody {
	s.ErrorCount = &v
	return s
}

func (s *PositionStructBody) SetHeight(v string) *PositionStructBody {
	s.Height = &v
	return s
}

func (s *PositionStructBody) SetIndex(v string) *PositionStructBody {
	s.Index = &v
	return s
}

func (s *PositionStructBody) SetLastError(v string) *PositionStructBody {
	s.LastError = &v
	return s
}

func (s *PositionStructBody) SetType(v string) *PositionStructBody {
	s.Type = &v
	return s
}

// 授权服务参与方结构体
type Participant struct {
	// 业务系统唯一标示
	// example:
	//
	// 76a0e716164848168dc726460042ee25
	BizUid *string `json:"biz_uid,omitempty" xml:"biz_uid,omitempty" maxLength:"64"`
	// 区块链ID
	// example:
	//
	// cfd98b44fb3246dbbae07dae4bae59fe
	BlockchainId *string `json:"blockchain_id,omitempty" xml:"blockchain_id,omitempty"`
	// 创建时间
	// example:
	//
	// 1595574776000
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty" require:"true"`
	// 信用代码
	// example:
	//
	// 30405123
	CreditNumber *string `json:"credit_number,omitempty" xml:"credit_number,omitempty"`
	// 扩展信息，标准JSON格式
	// example:
	//
	// {"organization":"test","company":"test"}
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
	// 参与方名字
	// example:
	//
	// Bob
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"64"`
	// 回调通知服务地址
	// example:
	//
	// http://127.0.0.1
	NotificationService *string `json:"notification_service,omitempty" xml:"notification_service,omitempty"`
	// 参与方ID
	// example:
	//
	// did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
	ParticipantId *string `json:"participant_id,omitempty" xml:"participant_id,omitempty" require:"true" maxLength:"100"`
	// DID  doc中的公开信息
	// example:
	//
	// information
	PublicInfo *string `json:"public_info,omitempty" xml:"public_info,omitempty"`
	// 参与方角色列表
	Role []*string `json:"role,omitempty" xml:"role,omitempty" require:"true" type:"Repeated"`
	// 空间ID
	// example:
	//
	// space1
	SpaceId *string `json:"space_id,omitempty" xml:"space_id,omitempty"`
	// 参与方状态
	// example:
	//
	// ACTIVE,DELETED...
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 更新时间
	// example:
	//
	// 1595574776000
	UpdateTime *int64 `json:"update_time,omitempty" xml:"update_time,omitempty" require:"true"`
	// 账户名称
	// example:
	//
	// account1
	Account *string `json:"account,omitempty" xml:"account,omitempty"`
}

func (s Participant) String() string {
	return tea.Prettify(s)
}

func (s Participant) GoString() string {
	return s.String()
}

func (s *Participant) SetBizUid(v string) *Participant {
	s.BizUid = &v
	return s
}

func (s *Participant) SetBlockchainId(v string) *Participant {
	s.BlockchainId = &v
	return s
}

func (s *Participant) SetCreateTime(v int64) *Participant {
	s.CreateTime = &v
	return s
}

func (s *Participant) SetCreditNumber(v string) *Participant {
	s.CreditNumber = &v
	return s
}

func (s *Participant) SetExtensionInfo(v string) *Participant {
	s.ExtensionInfo = &v
	return s
}

func (s *Participant) SetName(v string) *Participant {
	s.Name = &v
	return s
}

func (s *Participant) SetNotificationService(v string) *Participant {
	s.NotificationService = &v
	return s
}

func (s *Participant) SetParticipantId(v string) *Participant {
	s.ParticipantId = &v
	return s
}

func (s *Participant) SetPublicInfo(v string) *Participant {
	s.PublicInfo = &v
	return s
}

func (s *Participant) SetRole(v []*string) *Participant {
	s.Role = v
	return s
}

func (s *Participant) SetSpaceId(v string) *Participant {
	s.SpaceId = &v
	return s
}

func (s *Participant) SetStatus(v string) *Participant {
	s.Status = &v
	return s
}

func (s *Participant) SetUpdateTime(v int64) *Participant {
	s.UpdateTime = &v
	return s
}

func (s *Participant) SetAccount(v string) *Participant {
	s.Account = &v
	return s
}

// 合约绑定关系
type ContractBindResp struct {
	// 合约标识
	// example:
	//
	// cme20230724104931af3a4d
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty"`
	// 合约名称
	// example:
	//
	// 资产合约
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 是否已关联
	// example:
	//
	// true
	Bind *bool `json:"bind,omitempty" xml:"bind,omitempty"`
}

func (s ContractBindResp) String() string {
	return tea.Prettify(s)
}

func (s ContractBindResp) GoString() string {
	return s.String()
}

func (s *ContractBindResp) SetServiceId(v string) *ContractBindResp {
	s.ServiceId = &v
	return s
}

func (s *ContractBindResp) SetName(v string) *ContractBindResp {
	s.Name = &v
	return s
}

func (s *ContractBindResp) SetBind(v bool) *ContractBindResp {
	s.Bind = &v
	return s
}

// 节点类型
type CrowdNodeTypeEnum struct {
	// 组合节点
	// example:
	//
	// xx
	Group *string `json:"group,omitempty" xml:"group,omitempty"`
	// 条件节点
	// example:
	//
	// xx
	Condition *string `json:"condition,omitempty" xml:"condition,omitempty"`
}

func (s CrowdNodeTypeEnum) String() string {
	return tea.Prettify(s)
}

func (s CrowdNodeTypeEnum) GoString() string {
	return s.String()
}

func (s *CrowdNodeTypeEnum) SetGroup(v string) *CrowdNodeTypeEnum {
	s.Group = &v
	return s
}

func (s *CrowdNodeTypeEnum) SetCondition(v string) *CrowdNodeTypeEnum {
	s.Condition = &v
	return s
}

// 任务列表返回体
type TaskListInfoDTO struct {
	// 任务名称
	// example:
	//
	// 普通任务
	TaskName *string `json:"task_name,omitempty" xml:"task_name,omitempty" require:"true"`
	// 任务ID
	// example:
	//
	// qdQxqU5gz
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// appId
	// example:
	//
	// 2021004121633301
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 自有ID
	// example:
	//
	// ybl1112
	SurveyId *string `json:"survey_id,omitempty" xml:"survey_id,omitempty" require:"true"`
	// 租户ID
	// example:
	//
	// RIVUFSJG
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 租户名称
	// example:
	//
	// 李强
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty" require:"true"`
	// 操作员
	// example:
	//
	// eipzps@alitest.comtest
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// 样本数量
	SampleNum *int64 `json:"sample_num,omitempty" xml:"sample_num,omitempty" require:"true"`
	// 完成数量
	CompletedNum *int64 `json:"completed_num,omitempty" xml:"completed_num,omitempty" require:"true"`
	// 甄别数量
	ScreenNum *int64 `json:"screen_num,omitempty" xml:"screen_num,omitempty" require:"true"`
	// 样本总金额
	// example:
	//
	// 10.00
	SampleTotalAmount *string `json:"sample_total_amount,omitempty" xml:"sample_total_amount,omitempty" require:"true"`
	// 全额红包总金额
	// example:
	//
	// 20.00
	RedPacketTotalAmount *string `json:"red_packet_total_amount,omitempty" xml:"red_packet_total_amount,omitempty" require:"true"`
	// 该任务总金额
	// example:
	//
	// 30.00
	TaskTotalAmount *string `json:"task_total_amount,omitempty" xml:"task_total_amount,omitempty" require:"true"`
	// 全额红包金额
	// example:
	//
	// 1.00
	FullRedPacketAmount *string `json:"full_red_packet_amount,omitempty" xml:"full_red_packet_amount,omitempty" require:"true"`
	// 甄别红包金额
	// example:
	//
	// 0.05
	ExamineRedPacketAmount *string `json:"examine_red_packet_amount,omitempty" xml:"examine_red_packet_amount,omitempty" require:"true"`
	// 发证量
	IssuedNum *int64 `json:"issued_num,omitempty" xml:"issued_num,omitempty"`
	// 产品下单code类型（1-资源包 2-后付费）
	// example:
	//
	// 1
	ProductCodeType *string `json:"product_code_type,omitempty" xml:"product_code_type,omitempty" require:"true"`
	// 审核理由
	// example:
	//
	// 拒绝,图片不合适
	ReviewContent *string `json:"review_content,omitempty" xml:"review_content,omitempty"`
	// 任务状态：0-已删、1-已完成、2-审核未通过、3-暂停、4-投放中、5-暂停中未重启、6、投放中未暂停、7-投放中未调整、8-投放中未完成、9-待投放、10-草稿任务
	// example:
	//
	// 9
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// ap状态，1:启用，0：审批中
	// example:
	//
	// 1
	ApStatus *string `json:"ap_status,omitempty" xml:"ap_status,omitempty" require:"true"`
	// 奖励渠道（0-手动发支付宝余额 1-海豚红包 2-问卷自带）
	// example:
	//
	// 1
	PrizeChannel *int64 `json:"prize_channel,omitempty" xml:"prize_channel,omitempty" require:"true"`
	// 奖励渠道为问卷自带时，全额红包信息
	// example:
	//
	// 1-5元红包
	FullRedPacketTextInfo *string `json:"full_red_packet_text_info,omitempty" xml:"full_red_packet_text_info,omitempty"`
	// 修改时间
	// example:
	//
	// 2023-12-22 10:34:11
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true"`
	// 创建时间
	// example:
	//
	// 2023-12-22 10:11:33
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true"`
	// 投放时间
	// example:
	//
	// 2023-12-23 10:11:22
	GmtOnline *string `json:"gmt_online,omitempty" xml:"gmt_online,omitempty"`
	// 最近暂停/完成时间
	// example:
	//
	// 2022-12-22 09:11:11
	GmtPauseOrComplete *string `json:"gmt_pause_or_complete,omitempty" xml:"gmt_pause_or_complete,omitempty"`
	// 最近一轮用时（h）
	// example:
	//
	// 1
	LastRoundTime *int64 `json:"last_round_time,omitempty" xml:"last_round_time,omitempty"`
}

func (s TaskListInfoDTO) String() string {
	return tea.Prettify(s)
}

func (s TaskListInfoDTO) GoString() string {
	return s.String()
}

func (s *TaskListInfoDTO) SetTaskName(v string) *TaskListInfoDTO {
	s.TaskName = &v
	return s
}

func (s *TaskListInfoDTO) SetTaskId(v string) *TaskListInfoDTO {
	s.TaskId = &v
	return s
}

func (s *TaskListInfoDTO) SetAppId(v string) *TaskListInfoDTO {
	s.AppId = &v
	return s
}

func (s *TaskListInfoDTO) SetSurveyId(v string) *TaskListInfoDTO {
	s.SurveyId = &v
	return s
}

func (s *TaskListInfoDTO) SetTenantId(v string) *TaskListInfoDTO {
	s.TenantId = &v
	return s
}

func (s *TaskListInfoDTO) SetTenantName(v string) *TaskListInfoDTO {
	s.TenantName = &v
	return s
}

func (s *TaskListInfoDTO) SetOperator(v string) *TaskListInfoDTO {
	s.Operator = &v
	return s
}

func (s *TaskListInfoDTO) SetSampleNum(v int64) *TaskListInfoDTO {
	s.SampleNum = &v
	return s
}

func (s *TaskListInfoDTO) SetCompletedNum(v int64) *TaskListInfoDTO {
	s.CompletedNum = &v
	return s
}

func (s *TaskListInfoDTO) SetScreenNum(v int64) *TaskListInfoDTO {
	s.ScreenNum = &v
	return s
}

func (s *TaskListInfoDTO) SetSampleTotalAmount(v string) *TaskListInfoDTO {
	s.SampleTotalAmount = &v
	return s
}

func (s *TaskListInfoDTO) SetRedPacketTotalAmount(v string) *TaskListInfoDTO {
	s.RedPacketTotalAmount = &v
	return s
}

func (s *TaskListInfoDTO) SetTaskTotalAmount(v string) *TaskListInfoDTO {
	s.TaskTotalAmount = &v
	return s
}

func (s *TaskListInfoDTO) SetFullRedPacketAmount(v string) *TaskListInfoDTO {
	s.FullRedPacketAmount = &v
	return s
}

func (s *TaskListInfoDTO) SetExamineRedPacketAmount(v string) *TaskListInfoDTO {
	s.ExamineRedPacketAmount = &v
	return s
}

func (s *TaskListInfoDTO) SetIssuedNum(v int64) *TaskListInfoDTO {
	s.IssuedNum = &v
	return s
}

func (s *TaskListInfoDTO) SetProductCodeType(v string) *TaskListInfoDTO {
	s.ProductCodeType = &v
	return s
}

func (s *TaskListInfoDTO) SetReviewContent(v string) *TaskListInfoDTO {
	s.ReviewContent = &v
	return s
}

func (s *TaskListInfoDTO) SetStatus(v string) *TaskListInfoDTO {
	s.Status = &v
	return s
}

func (s *TaskListInfoDTO) SetApStatus(v string) *TaskListInfoDTO {
	s.ApStatus = &v
	return s
}

func (s *TaskListInfoDTO) SetPrizeChannel(v int64) *TaskListInfoDTO {
	s.PrizeChannel = &v
	return s
}

func (s *TaskListInfoDTO) SetFullRedPacketTextInfo(v string) *TaskListInfoDTO {
	s.FullRedPacketTextInfo = &v
	return s
}

func (s *TaskListInfoDTO) SetGmtModified(v string) *TaskListInfoDTO {
	s.GmtModified = &v
	return s
}

func (s *TaskListInfoDTO) SetGmtCreate(v string) *TaskListInfoDTO {
	s.GmtCreate = &v
	return s
}

func (s *TaskListInfoDTO) SetGmtOnline(v string) *TaskListInfoDTO {
	s.GmtOnline = &v
	return s
}

func (s *TaskListInfoDTO) SetGmtPauseOrComplete(v string) *TaskListInfoDTO {
	s.GmtPauseOrComplete = &v
	return s
}

func (s *TaskListInfoDTO) SetLastRoundTime(v int64) *TaskListInfoDTO {
	s.LastRoundTime = &v
	return s
}

// 阿里云联盟成员信息
type ALiYunMember struct {
	// 加入时间
	// example:
	//
	// 11231231231
	JoinTime *int64 `json:"join_time,omitempty" xml:"join_time,omitempty"`
	// 成员id
	// example:
	//
	// 成员id
	MemberId *string `json:"member_id,omitempty" xml:"member_id,omitempty"`
	// 成员名称
	// example:
	//
	// 成员名称
	MemberName *string `json:"member_name,omitempty" xml:"member_name,omitempty"`
	// 角色
	// example:
	//
	// 角色
	Role *string `json:"role,omitempty" xml:"role,omitempty"`
	// 状态
	// example:
	//
	// 状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s ALiYunMember) String() string {
	return tea.Prettify(s)
}

func (s ALiYunMember) GoString() string {
	return s.String()
}

func (s *ALiYunMember) SetJoinTime(v int64) *ALiYunMember {
	s.JoinTime = &v
	return s
}

func (s *ALiYunMember) SetMemberId(v string) *ALiYunMember {
	s.MemberId = &v
	return s
}

func (s *ALiYunMember) SetMemberName(v string) *ALiYunMember {
	s.MemberName = &v
	return s
}

func (s *ALiYunMember) SetRole(v string) *ALiYunMember {
	s.Role = &v
	return s
}

func (s *ALiYunMember) SetStatus(v string) *ALiYunMember {
	s.Status = &v
	return s
}

// 对客展示信息
type DisplayInfo struct {
	// 权益名称
	// example:
	//
	// 满100 减10元
	BenefitName *string `json:"benefit_name,omitempty" xml:"benefit_name,omitempty"`
	// 展示金额文案
	// example:
	//
	// 10元
	ShowAmountText *string `json:"show_amount_text,omitempty" xml:"show_amount_text,omitempty"`
	// 门槛金额文案
	// example:
	//
	// 满100元可用
	ThresholdAmountText *string `json:"threshold_amount_text,omitempty" xml:"threshold_amount_text,omitempty"`
	// 使用说明
	// example:
	//
	// 满100 减10元
	BenefitUsageDesc *string `json:"benefit_usage_desc,omitempty" xml:"benefit_usage_desc,omitempty"`
	// 规则描述
	// example:
	//
	// 满100元可用
	BenefitRuleDesc *string `json:"benefit_rule_desc,omitempty" xml:"benefit_rule_desc,omitempty"`
}

func (s DisplayInfo) String() string {
	return tea.Prettify(s)
}

func (s DisplayInfo) GoString() string {
	return s.String()
}

func (s *DisplayInfo) SetBenefitName(v string) *DisplayInfo {
	s.BenefitName = &v
	return s
}

func (s *DisplayInfo) SetShowAmountText(v string) *DisplayInfo {
	s.ShowAmountText = &v
	return s
}

func (s *DisplayInfo) SetThresholdAmountText(v string) *DisplayInfo {
	s.ThresholdAmountText = &v
	return s
}

func (s *DisplayInfo) SetBenefitUsageDesc(v string) *DisplayInfo {
	s.BenefitUsageDesc = &v
	return s
}

func (s *DisplayInfo) SetBenefitRuleDesc(v string) *DisplayInfo {
	s.BenefitRuleDesc = &v
	return s
}

// 应用授权列表
type ApplicationPageListResp struct {
	// 应用标识
	// example:
	//
	// app20230725115808679d4f
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
	// 链ID
	// example:
	//
	// 284f75bc-8069-443f-9d46-4576bb15f210
	AccessKey *string `json:"access_key,omitempty" xml:"access_key,omitempty"`
	// 合约(创建实例时填写的合约名称。)
	NameList []*string `json:"name_list,omitempty" xml:"name_list,omitempty" type:"Repeated"`
}

func (s ApplicationPageListResp) String() string {
	return tea.Prettify(s)
}

func (s ApplicationPageListResp) GoString() string {
	return s.String()
}

func (s *ApplicationPageListResp) SetApplicationId(v string) *ApplicationPageListResp {
	s.ApplicationId = &v
	return s
}

func (s *ApplicationPageListResp) SetAccessKey(v string) *ApplicationPageListResp {
	s.AccessKey = &v
	return s
}

func (s *ApplicationPageListResp) SetNameList(v []*string) *ApplicationPageListResp {
	s.NameList = v
	return s
}

// 实例进度信息
type InstanceProgressInfo struct {
	// 操作人
	// example:
	//
	// 张三
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
	// 操作时间
	// example:
	//
	// 1690166971465
	Time *int64 `json:"time,omitempty" xml:"time,omitempty"`
	// 合约部署进度类型
	// example:
	//
	// SERVICE_START
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 部署状态
	// example:
	//
	// INIT
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 合约部署进度名称
	// example:
	//
	// 部署合约服务
	TypeName *string `json:"type_name,omitempty" xml:"type_name,omitempty"`
	// 额外参数
	// example:
	//
	// {json}
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s InstanceProgressInfo) String() string {
	return tea.Prettify(s)
}

func (s InstanceProgressInfo) GoString() string {
	return s.String()
}

func (s *InstanceProgressInfo) SetOperator(v string) *InstanceProgressInfo {
	s.Operator = &v
	return s
}

func (s *InstanceProgressInfo) SetTime(v int64) *InstanceProgressInfo {
	s.Time = &v
	return s
}

func (s *InstanceProgressInfo) SetType(v string) *InstanceProgressInfo {
	s.Type = &v
	return s
}

func (s *InstanceProgressInfo) SetStatus(v string) *InstanceProgressInfo {
	s.Status = &v
	return s
}

func (s *InstanceProgressInfo) SetTypeName(v string) *InstanceProgressInfo {
	s.TypeName = &v
	return s
}

func (s *InstanceProgressInfo) SetData(v string) *InstanceProgressInfo {
	s.Data = &v
	return s
}

// 授权服务数据模型结构体
type DataModel struct {
	// 业务系统唯一标示
	// example:
	//
	// 3fc223617da9a17a4d7792ef0c3f57bd176ec
	BizUid *string `json:"biz_uid,omitempty" xml:"biz_uid,omitempty"`
	// 空间ID
	// example:
	//
	// space1
	SpaceId *string `json:"space_id,omitempty" xml:"space_id,omitempty" require:"true"`
	// 创建时间
	// example:
	//
	// 1595574776000
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty" require:"true"`
	// 数据模型描述
	// example:
	//
	// 这是一个描述信息
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 模型字段详细信息
	// example:
	//
	// {"organization":"test","company":"test"}
	FieldDetail *string `json:"field_detail,omitempty" xml:"field_detail,omitempty" require:"true"`
	// 数据模型业务ID
	// example:
	//
	// model_company_data
	ModelBizId *string `json:"model_biz_id,omitempty" xml:"model_biz_id,omitempty"`
	// 数据模型ID
	// example:
	//
	// DATA_MODEL_123
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
	// 数据模型名称
	// example:
	//
	// 税务信息模型
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 提交人
	Submitter *Participant `json:"submitter,omitempty" xml:"submitter,omitempty" require:"true"`
	// 更新时间
	// example:
	//
	// 1595574776000
	UpdateTime *int64 `json:"update_time,omitempty" xml:"update_time,omitempty" require:"true"`
	// 状态
	// example:
	//
	// ACTIVE
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s DataModel) String() string {
	return tea.Prettify(s)
}

func (s DataModel) GoString() string {
	return s.String()
}

func (s *DataModel) SetBizUid(v string) *DataModel {
	s.BizUid = &v
	return s
}

func (s *DataModel) SetSpaceId(v string) *DataModel {
	s.SpaceId = &v
	return s
}

func (s *DataModel) SetCreateTime(v int64) *DataModel {
	s.CreateTime = &v
	return s
}

func (s *DataModel) SetDescription(v string) *DataModel {
	s.Description = &v
	return s
}

func (s *DataModel) SetFieldDetail(v string) *DataModel {
	s.FieldDetail = &v
	return s
}

func (s *DataModel) SetModelBizId(v string) *DataModel {
	s.ModelBizId = &v
	return s
}

func (s *DataModel) SetModelId(v string) *DataModel {
	s.ModelId = &v
	return s
}

func (s *DataModel) SetName(v string) *DataModel {
	s.Name = &v
	return s
}

func (s *DataModel) SetSubmitter(v *Participant) *DataModel {
	s.Submitter = v
	return s
}

func (s *DataModel) SetUpdateTime(v int64) *DataModel {
	s.UpdateTime = &v
	return s
}

func (s *DataModel) SetStatus(v string) *DataModel {
	s.Status = &v
	return s
}

// 授权流程节点详细信息
type NodeDetail struct {
	// 节点审批意见
	// example:
	//
	// agree comment
	Comment *string `json:"comment,omitempty" xml:"comment,omitempty" require:"true"`
	// 节点ID
	// example:
	//
	// did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty" require:"true"`
	// 节点名称
	// example:
	//
	// Bob
	NodeName *string `json:"node_name,omitempty" xml:"node_name,omitempty" require:"true"`
	// 节点状态
	// example:
	//
	// Agree
	NodeStatus *string `json:"node_status,omitempty" xml:"node_status,omitempty" require:"true"`
	// 节点审批时间
	// example:
	//
	// 1592883002497
	OperateTime *int64 `json:"operate_time,omitempty" xml:"operate_time,omitempty" require:"true"`
	// 扩展参数
	// example:
	//
	// test
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
}

func (s NodeDetail) String() string {
	return tea.Prettify(s)
}

func (s NodeDetail) GoString() string {
	return s.String()
}

func (s *NodeDetail) SetComment(v string) *NodeDetail {
	s.Comment = &v
	return s
}

func (s *NodeDetail) SetNodeId(v string) *NodeDetail {
	s.NodeId = &v
	return s
}

func (s *NodeDetail) SetNodeName(v string) *NodeDetail {
	s.NodeName = &v
	return s
}

func (s *NodeDetail) SetNodeStatus(v string) *NodeDetail {
	s.NodeStatus = &v
	return s
}

func (s *NodeDetail) SetOperateTime(v int64) *NodeDetail {
	s.OperateTime = &v
	return s
}

func (s *NodeDetail) SetExtensionInfo(v string) *NodeDetail {
	s.ExtensionInfo = &v
	return s
}

// 合约链配置信息结果
type ContractIdeConfig struct {
	// 合约链的一个已创建的测试账户
	// example:
	//
	// Tester001
	AccountName *string `json:"account_name,omitempty" xml:"account_name,omitempty" require:"true"`
	// 区块链唯一标识
	// example:
	//
	// 0001bcde
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 合约链的名字
	// example:
	//
	// 合约体验链
	ChainName *string `json:"chain_name,omitempty" xml:"chain_name,omitempty" require:"true"`
	// 目标合约链的host地址
	// example:
	//
	// https://127.0.0.1
	Host *string `json:"host,omitempty" xml:"host,omitempty" require:"true"`
	// 说明是否开启wasm合约功能
	// example:
	//
	// true
	IsWasm *bool `json:"is_wasm,omitempty" xml:"is_wasm,omitempty"`
	// 目标合约链服务公开的端口号
	// example:
	//
	// 18131
	Port *string `json:"port,omitempty" xml:"port,omitempty" require:"true"`
	// 合约链已创建的测试账户的密钥
	// example:
	//
	// c8d6079a1ea7e5dba407998fecd89ac0783295c7e1a84d44e304b5314c765e73
	PrivateKey *string `json:"private_key,omitempty" xml:"private_key,omitempty" require:"true"`
	// 如果是TEE硬件隐私合约链，会包含此字段内容
	// example:
	//
	// -----BEGIN PUBLIC KEY----- <RSA公钥> -----END PUBLIC KEY-----
	RsaPublicKey *string `json:"rsa_public_key,omitempty" xml:"rsa_public_key,omitempty"`
	// 合约链的版本说明
	// example:
	//
	// 2.7
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
}

func (s ContractIdeConfig) String() string {
	return tea.Prettify(s)
}

func (s ContractIdeConfig) GoString() string {
	return s.String()
}

func (s *ContractIdeConfig) SetAccountName(v string) *ContractIdeConfig {
	s.AccountName = &v
	return s
}

func (s *ContractIdeConfig) SetBizid(v string) *ContractIdeConfig {
	s.Bizid = &v
	return s
}

func (s *ContractIdeConfig) SetChainName(v string) *ContractIdeConfig {
	s.ChainName = &v
	return s
}

func (s *ContractIdeConfig) SetHost(v string) *ContractIdeConfig {
	s.Host = &v
	return s
}

func (s *ContractIdeConfig) SetIsWasm(v bool) *ContractIdeConfig {
	s.IsWasm = &v
	return s
}

func (s *ContractIdeConfig) SetPort(v string) *ContractIdeConfig {
	s.Port = &v
	return s
}

func (s *ContractIdeConfig) SetPrivateKey(v string) *ContractIdeConfig {
	s.PrivateKey = &v
	return s
}

func (s *ContractIdeConfig) SetRsaPublicKey(v string) *ContractIdeConfig {
	s.RsaPublicKey = &v
	return s
}

func (s *ContractIdeConfig) SetVersion(v string) *ContractIdeConfig {
	s.Version = &v
	return s
}

// {"key":"value"}
type KeyValuePair struct {
	// 键名
	// example:
	//
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// 值
	// example:
	//
	// value
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s KeyValuePair) String() string {
	return tea.Prettify(s)
}

func (s KeyValuePair) GoString() string {
	return s.String()
}

func (s *KeyValuePair) SetKey(v string) *KeyValuePair {
	s.Key = &v
	return s
}

func (s *KeyValuePair) SetValue(v string) *KeyValuePair {
	s.Value = &v
	return s
}

// 日志存储类型
type TriggerLogDTOStructBody struct {
	// 创建时间
	// example:
	//
	// ""
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 修改时间
	// example:
	//
	// ""
	ModifyTime *string `json:"modify_time,omitempty" xml:"modify_time,omitempty"`
	// 状态
	// example:
	//
	// ""
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// uuid
	// example:
	//
	// “”
	Uuid *string `json:"uuid,omitempty" xml:"uuid,omitempty"`
	// 位置
	// example:
	//
	// {}
	Position *PositionStructBody `json:"position,omitempty" xml:"position,omitempty"`
}

func (s TriggerLogDTOStructBody) String() string {
	return tea.Prettify(s)
}

func (s TriggerLogDTOStructBody) GoString() string {
	return s.String()
}

func (s *TriggerLogDTOStructBody) SetCreateTime(v string) *TriggerLogDTOStructBody {
	s.CreateTime = &v
	return s
}

func (s *TriggerLogDTOStructBody) SetModifyTime(v string) *TriggerLogDTOStructBody {
	s.ModifyTime = &v
	return s
}

func (s *TriggerLogDTOStructBody) SetStatus(v string) *TriggerLogDTOStructBody {
	s.Status = &v
	return s
}

func (s *TriggerLogDTOStructBody) SetUuid(v string) *TriggerLogDTOStructBody {
	s.Uuid = &v
	return s
}

func (s *TriggerLogDTOStructBody) SetPosition(v *PositionStructBody) *TriggerLogDTOStructBody {
	s.Position = v
	return s
}

// 合约类型
type ContractTypeListResp struct {
	// 名称
	// example:
	//
	// 存证合约
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 值
	// example:
	//
	// DEPOSITE
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s ContractTypeListResp) String() string {
	return tea.Prettify(s)
}

func (s ContractTypeListResp) GoString() string {
	return s.String()
}

func (s *ContractTypeListResp) SetName(v string) *ContractTypeListResp {
	s.Name = &v
	return s
}

func (s *ContractTypeListResp) SetValue(v string) *ContractTypeListResp {
	s.Value = &v
	return s
}

// 蚂蚁链浏览器交易信息
type BlockchainBrowserTransaction struct {
	// bizid
	// example:
	//
	// 27ce375122ef483691488395808e009e
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// block_hash
	// example:
	//
	// 4a6306e001a484c5c1d198668008b4876b991c5369a18a8431e9e7b37b021694
	BlockHash *string `json:"block_hash,omitempty" xml:"block_hash,omitempty" require:"true"`
	// category
	// example:
	//
	// -1
	Category *int64 `json:"category,omitempty" xml:"category,omitempty" require:"true"`
	// create_time
	// example:
	//
	// 1604565299516
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty" require:"true"`
	// from
	// example:
	//
	// eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612
	From *string `json:"from,omitempty" xml:"from,omitempty" require:"true"`
	// gas_used
	// example:
	//
	// 0
	GasUsed *int64 `json:"gas_used,omitempty" xml:"gas_used,omitempty" require:"true"`
	// hash
	// example:
	//
	// 65a0a7aa9b6f739faddd8e993eadecf85340cdeda6e20417e013e052f30afd3c
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty" require:"true"`
	// height
	// example:
	//
	// 6814087
	Height *int64 `json:"height,omitempty" xml:"height,omitempty" require:"true"`
	// reference_count
	// example:
	//
	// 0
	ReferenceCount *int64 `json:"reference_count,omitempty" xml:"reference_count,omitempty" require:"true"`
	// to
	// example:
	//
	// eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612
	To *string `json:"to,omitempty" xml:"to,omitempty" require:"true"`
	// transaction_type
	// example:
	//
	// TX_DEPOSIT_DATA
	TransactionType *string `json:"transaction_type,omitempty" xml:"transaction_type,omitempty" require:"true"`
	// block_version
	// example:
	//
	// 10
	BlockVersion *int64 `json:"block_version,omitempty" xml:"block_version,omitempty" require:"true"`
	// blockchain_name
	// example:
	//
	// BAASQATEST
	BlockchainName *string `json:"blockchain_name,omitempty" xml:"blockchain_name,omitempty" require:"true"`
	// blockchain_status
	// example:
	//
	// true, false
	BlockchainStatus *bool `json:"blockchain_status,omitempty" xml:"blockchain_status,omitempty" require:"true"`
	// content
	// example:
	//
	// eyJ0cmFuc2FjdGlvbl9pZCI6ImRjM2YyZTYz
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// hash_status
	// example:
	//
	// true, false
	HashStatus *bool `json:"hash_status,omitempty" xml:"hash_status,omitempty" require:"true"`
	// type
	// example:
	//
	// 0
	Type *int64 `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// transaction_contract
	// example:
	//
	// transaction_contract
	TransactionContract *BlockchainBrowserTransactionContract `json:"transaction_contract,omitempty" xml:"transaction_contract,omitempty" require:"true"`
}

func (s BlockchainBrowserTransaction) String() string {
	return tea.Prettify(s)
}

func (s BlockchainBrowserTransaction) GoString() string {
	return s.String()
}

func (s *BlockchainBrowserTransaction) SetBizid(v string) *BlockchainBrowserTransaction {
	s.Bizid = &v
	return s
}

func (s *BlockchainBrowserTransaction) SetBlockHash(v string) *BlockchainBrowserTransaction {
	s.BlockHash = &v
	return s
}

func (s *BlockchainBrowserTransaction) SetCategory(v int64) *BlockchainBrowserTransaction {
	s.Category = &v
	return s
}

func (s *BlockchainBrowserTransaction) SetCreateTime(v int64) *BlockchainBrowserTransaction {
	s.CreateTime = &v
	return s
}

func (s *BlockchainBrowserTransaction) SetFrom(v string) *BlockchainBrowserTransaction {
	s.From = &v
	return s
}

func (s *BlockchainBrowserTransaction) SetGasUsed(v int64) *BlockchainBrowserTransaction {
	s.GasUsed = &v
	return s
}

func (s *BlockchainBrowserTransaction) SetHash(v string) *BlockchainBrowserTransaction {
	s.Hash = &v
	return s
}

func (s *BlockchainBrowserTransaction) SetHeight(v int64) *BlockchainBrowserTransaction {
	s.Height = &v
	return s
}

func (s *BlockchainBrowserTransaction) SetReferenceCount(v int64) *BlockchainBrowserTransaction {
	s.ReferenceCount = &v
	return s
}

func (s *BlockchainBrowserTransaction) SetTo(v string) *BlockchainBrowserTransaction {
	s.To = &v
	return s
}

func (s *BlockchainBrowserTransaction) SetTransactionType(v string) *BlockchainBrowserTransaction {
	s.TransactionType = &v
	return s
}

func (s *BlockchainBrowserTransaction) SetBlockVersion(v int64) *BlockchainBrowserTransaction {
	s.BlockVersion = &v
	return s
}

func (s *BlockchainBrowserTransaction) SetBlockchainName(v string) *BlockchainBrowserTransaction {
	s.BlockchainName = &v
	return s
}

func (s *BlockchainBrowserTransaction) SetBlockchainStatus(v bool) *BlockchainBrowserTransaction {
	s.BlockchainStatus = &v
	return s
}

func (s *BlockchainBrowserTransaction) SetContent(v string) *BlockchainBrowserTransaction {
	s.Content = &v
	return s
}

func (s *BlockchainBrowserTransaction) SetHashStatus(v bool) *BlockchainBrowserTransaction {
	s.HashStatus = &v
	return s
}

func (s *BlockchainBrowserTransaction) SetType(v int64) *BlockchainBrowserTransaction {
	s.Type = &v
	return s
}

func (s *BlockchainBrowserTransaction) SetTransactionContract(v *BlockchainBrowserTransactionContract) *BlockchainBrowserTransaction {
	s.TransactionContract = v
	return s
}

// 结算详细信息
type SettleDetailInfo struct {
	// 结算收款方账户类型
	// example:
	//
	// userId
	TransInType *string `json:"trans_in_type,omitempty" xml:"trans_in_type,omitempty" require:"true"`
	// 结算收款方
	// example:
	//
	// 1100001990
	TransIn *string `json:"trans_in,omitempty" xml:"trans_in,omitempty" require:"true"`
	// 结算汇总维度
	// example:
	//
	// A0001
	SummaryDimension *string `json:"summary_dimension,omitempty" xml:"summary_dimension,omitempty"`
	// 结算主体类型
	// example:
	//
	// SecondMerchant
	SettleEntityType *string `json:"settle_entity_type,omitempty" xml:"settle_entity_type,omitempty"`
	// 结算主体标识
	// example:
	//
	// 2088xxxxx
	SettleEntityId *string `json:"settle_entity_id,omitempty" xml:"settle_entity_id,omitempty"`
}

func (s SettleDetailInfo) String() string {
	return tea.Prettify(s)
}

func (s SettleDetailInfo) GoString() string {
	return s.String()
}

func (s *SettleDetailInfo) SetTransInType(v string) *SettleDetailInfo {
	s.TransInType = &v
	return s
}

func (s *SettleDetailInfo) SetTransIn(v string) *SettleDetailInfo {
	s.TransIn = &v
	return s
}

func (s *SettleDetailInfo) SetSummaryDimension(v string) *SettleDetailInfo {
	s.SummaryDimension = &v
	return s
}

func (s *SettleDetailInfo) SetSettleEntityType(v string) *SettleDetailInfo {
	s.SettleEntityType = &v
	return s
}

func (s *SettleDetailInfo) SetSettleEntityId(v string) *SettleDetailInfo {
	s.SettleEntityId = &v
	return s
}

// 阿里云蚂蚁链相关下载链接
type ALiYunDownloadPath struct {
	// client_crt_url
	// example:
	//
	// client_crt_url
	ClientCrtUrl *string `json:"client_crt_url,omitempty" xml:"client_crt_url,omitempty"`
	// trust_ca_url
	// example:
	//
	// trust_ca_url
	TrustCaUrl *string `json:"trust_ca_url,omitempty" xml:"trust_ca_url,omitempty"`
	// ca_crt_url
	// example:
	//
	// ca_crt_url
	CaCrtUrl *string `json:"ca_crt_url,omitempty" xml:"ca_crt_url,omitempty"`
	// sdk_url
	// example:
	//
	// sdk_url
	SdkUrl *string `json:"sdk_url,omitempty" xml:"sdk_url,omitempty"`
}

func (s ALiYunDownloadPath) String() string {
	return tea.Prettify(s)
}

func (s ALiYunDownloadPath) GoString() string {
	return s.String()
}

func (s *ALiYunDownloadPath) SetClientCrtUrl(v string) *ALiYunDownloadPath {
	s.ClientCrtUrl = &v
	return s
}

func (s *ALiYunDownloadPath) SetTrustCaUrl(v string) *ALiYunDownloadPath {
	s.TrustCaUrl = &v
	return s
}

func (s *ALiYunDownloadPath) SetCaCrtUrl(v string) *ALiYunDownloadPath {
	s.CaCrtUrl = &v
	return s
}

func (s *ALiYunDownloadPath) SetSdkUrl(v string) *ALiYunDownloadPath {
	s.SdkUrl = &v
	return s
}

// 阿里云子链结构体
type ALiYunChainSubnet struct {
	// 子链id
	// example:
	//
	// S210304150059
	AntChainId *string `json:"ant_chain_id,omitempty" xml:"ant_chain_id,omitempty"`
	// 子链名称
	// example:
	//
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 子链节点数
	// example:
	//
	// 1
	NodeSum *int64 `json:"node_sum,omitempty" xml:"node_sum,omitempty"`
	// 子链监控状态
	// example:
	//
	// true, false
	Monitor *bool `json:"monitor,omitempty" xml:"monitor,omitempty"`
	// 子链的块高
	// example:
	//
	// 100
	BlockHeight *string `json:"block_height,omitempty" xml:"block_height,omitempty"`
	// 子链的业务总数
	// example:
	//
	// 1000
	TransactionSum *int64 `json:"transaction_sum,omitempty" xml:"transaction_sum,omitempty"`
	// 子链的创建时间
	// example:
	//
	// 1000821213123
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 子链的状态
	// example:
	//
	// STOP/CREATE
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 子链的权限
	// example:
	//
	// true, false
	ConsortiumMember *bool `json:"consortium_member,omitempty" xml:"consortium_member,omitempty"`
	// 主链id
	// example:
	//
	// 2e7e22c42bb8419bbf99b7f56aa2f17f
	MainChainId *string `json:"main_chain_id,omitempty" xml:"main_chain_id,omitempty"`
	// rest申请状态
	// example:
	//
	// OK
	Rest *string `json:"rest,omitempty" xml:"rest,omitempty"`
	// 子链序号
	// example:
	//
	// 0000000000000002000000000000000000000000
	GroupId *string `json:"group_id,omitempty" xml:"group_id,omitempty"`
}

func (s ALiYunChainSubnet) String() string {
	return tea.Prettify(s)
}

func (s ALiYunChainSubnet) GoString() string {
	return s.String()
}

func (s *ALiYunChainSubnet) SetAntChainId(v string) *ALiYunChainSubnet {
	s.AntChainId = &v
	return s
}

func (s *ALiYunChainSubnet) SetName(v string) *ALiYunChainSubnet {
	s.Name = &v
	return s
}

func (s *ALiYunChainSubnet) SetNodeSum(v int64) *ALiYunChainSubnet {
	s.NodeSum = &v
	return s
}

func (s *ALiYunChainSubnet) SetMonitor(v bool) *ALiYunChainSubnet {
	s.Monitor = &v
	return s
}

func (s *ALiYunChainSubnet) SetBlockHeight(v string) *ALiYunChainSubnet {
	s.BlockHeight = &v
	return s
}

func (s *ALiYunChainSubnet) SetTransactionSum(v int64) *ALiYunChainSubnet {
	s.TransactionSum = &v
	return s
}

func (s *ALiYunChainSubnet) SetCreateTime(v int64) *ALiYunChainSubnet {
	s.CreateTime = &v
	return s
}

func (s *ALiYunChainSubnet) SetStatus(v string) *ALiYunChainSubnet {
	s.Status = &v
	return s
}

func (s *ALiYunChainSubnet) SetConsortiumMember(v bool) *ALiYunChainSubnet {
	s.ConsortiumMember = &v
	return s
}

func (s *ALiYunChainSubnet) SetMainChainId(v string) *ALiYunChainSubnet {
	s.MainChainId = &v
	return s
}

func (s *ALiYunChainSubnet) SetRest(v string) *ALiYunChainSubnet {
	s.Rest = &v
	return s
}

func (s *ALiYunChainSubnet) SetGroupId(v string) *ALiYunChainSubnet {
	s.GroupId = &v
	return s
}

// Did doc中的service info
type DidServiceInfo struct {
	// 服务的end point info
	// example:
	//
	// http://xxxxxx
	EndPoint *string `json:"end_point,omitempty" xml:"end_point,omitempty" require:"true"`
	// 扩展字段信息
	// example:
	//
	// {"item1":""}
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty" require:"true"`
}

func (s DidServiceInfo) String() string {
	return tea.Prettify(s)
}

func (s DidServiceInfo) GoString() string {
	return s.String()
}

func (s *DidServiceInfo) SetEndPoint(v string) *DidServiceInfo {
	s.EndPoint = &v
	return s
}

func (s *DidServiceInfo) SetExtensionInfo(v string) *DidServiceInfo {
	s.ExtensionInfo = &v
	return s
}

// 实例最近调用记录
type InstanceRecordInfo struct {
	// 应用标识
	// example:
	//
	// app20230725115808679d4f
	Application *string `json:"application,omitempty" xml:"application,omitempty"`
	// 执行结果
	// example:
	//
	// INIT
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 操作时间
	// example:
	//
	// 1690166971465
	OperatingTime *string `json:"operating_time,omitempty" xml:"operating_time,omitempty"`
}

func (s InstanceRecordInfo) String() string {
	return tea.Prettify(s)
}

func (s InstanceRecordInfo) GoString() string {
	return s.String()
}

func (s *InstanceRecordInfo) SetApplication(v string) *InstanceRecordInfo {
	s.Application = &v
	return s
}

func (s *InstanceRecordInfo) SetStatus(v string) *InstanceRecordInfo {
	s.Status = &v
	return s
}

func (s *InstanceRecordInfo) SetOperatingTime(v string) *InstanceRecordInfo {
	s.OperatingTime = &v
	return s
}

// 阿里云账户信息
type ALiYunAccount struct {
	// ant_chain_id
	// example:
	//
	// ant_chain_id
	AntChainId *string `json:"ant_chain_id,omitempty" xml:"ant_chain_id,omitempty"`
	// account
	// example:
	//
	// account
	Account *string `json:"account,omitempty" xml:"account,omitempty"`
	// account_public_key
	// example:
	//
	// account_public_key
	AccountPublicKey *string `json:"account_public_key,omitempty" xml:"account_public_key,omitempty"`
	// account_recovery_key
	// example:
	//
	// account_recovery_key
	AccountRecoveryKey *string `json:"account_recovery_key,omitempty" xml:"account_recovery_key,omitempty"`
	// account_status
	// example:
	//
	// account_status
	AccountStatus *string `json:"account_status,omitempty" xml:"account_status,omitempty"`
	// 机构信息
	// example:
	//
	// uid-11321313131
	MemberName *string `json:"member_name,omitempty" xml:"member_name,omitempty"`
	// 创建时间
	// example:
	//
	// 112313123
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
}

func (s ALiYunAccount) String() string {
	return tea.Prettify(s)
}

func (s ALiYunAccount) GoString() string {
	return s.String()
}

func (s *ALiYunAccount) SetAntChainId(v string) *ALiYunAccount {
	s.AntChainId = &v
	return s
}

func (s *ALiYunAccount) SetAccount(v string) *ALiYunAccount {
	s.Account = &v
	return s
}

func (s *ALiYunAccount) SetAccountPublicKey(v string) *ALiYunAccount {
	s.AccountPublicKey = &v
	return s
}

func (s *ALiYunAccount) SetAccountRecoveryKey(v string) *ALiYunAccount {
	s.AccountRecoveryKey = &v
	return s
}

func (s *ALiYunAccount) SetAccountStatus(v string) *ALiYunAccount {
	s.AccountStatus = &v
	return s
}

func (s *ALiYunAccount) SetMemberName(v string) *ALiYunAccount {
	s.MemberName = &v
	return s
}

func (s *ALiYunAccount) SetCreateTime(v int64) *ALiYunAccount {
	s.CreateTime = &v
	return s
}

// 阿里云链节点信息
type ALiYunChainNodeInfo struct {
	// block_height
	// example:
	//
	// 3123123
	BlockHeight *int64 `json:"block_height,omitempty" xml:"block_height,omitempty"`
	// node_name
	// example:
	//
	// node_name
	NodeName *string `json:"node_name,omitempty" xml:"node_name,omitempty"`
	// status
	// example:
	//
	// true, false
	Status *bool `json:"status,omitempty" xml:"status,omitempty"`
	// version
	// example:
	//
	// version
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
	// 节点id
	// example:
	//
	// 0x0AC5C397C076E394B3D32C1A9488AAF32BABD410A2FFAF97C87646F5BD04CD42
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty"`
	// 节点ip
	// example:
	//
	// 10.1.0.12
	NodeIp *string `json:"node_ip,omitempty" xml:"node_ip,omitempty"`
	// 节点的端口
	// example:
	//
	// 18130
	NodePort *string `json:"node_port,omitempty" xml:"node_port,omitempty"`
	// 节点类型
	// example:
	//
	// 共识或非共识
	NodeType *string `json:"node_type,omitempty" xml:"node_type,omitempty"`
	// 节点状态
	// example:
	//
	// 正常/异常
	NodeState *string `json:"node_state,omitempty" xml:"node_state,omitempty"`
	// 节点来源
	// example:
	//
	// BaaS
	NodeSource *string `json:"node_source,omitempty" xml:"node_source,omitempty"`
	// 节点存储空间使用量
	// example:
	//
	// 10
	DiskUse *string `json:"disk_use,omitempty" xml:"disk_use,omitempty"`
	// 节点存储总空间大小
	// example:
	//
	// 1024
	DiskTotal *string `json:"disk_total,omitempty" xml:"disk_total,omitempty"`
	// 节点公钥
	// example:
	//
	// 121231bcd
	PublicKey *string `json:"public_key,omitempty" xml:"public_key,omitempty"`
}

func (s ALiYunChainNodeInfo) String() string {
	return tea.Prettify(s)
}

func (s ALiYunChainNodeInfo) GoString() string {
	return s.String()
}

func (s *ALiYunChainNodeInfo) SetBlockHeight(v int64) *ALiYunChainNodeInfo {
	s.BlockHeight = &v
	return s
}

func (s *ALiYunChainNodeInfo) SetNodeName(v string) *ALiYunChainNodeInfo {
	s.NodeName = &v
	return s
}

func (s *ALiYunChainNodeInfo) SetStatus(v bool) *ALiYunChainNodeInfo {
	s.Status = &v
	return s
}

func (s *ALiYunChainNodeInfo) SetVersion(v string) *ALiYunChainNodeInfo {
	s.Version = &v
	return s
}

func (s *ALiYunChainNodeInfo) SetNodeId(v string) *ALiYunChainNodeInfo {
	s.NodeId = &v
	return s
}

func (s *ALiYunChainNodeInfo) SetNodeIp(v string) *ALiYunChainNodeInfo {
	s.NodeIp = &v
	return s
}

func (s *ALiYunChainNodeInfo) SetNodePort(v string) *ALiYunChainNodeInfo {
	s.NodePort = &v
	return s
}

func (s *ALiYunChainNodeInfo) SetNodeType(v string) *ALiYunChainNodeInfo {
	s.NodeType = &v
	return s
}

func (s *ALiYunChainNodeInfo) SetNodeState(v string) *ALiYunChainNodeInfo {
	s.NodeState = &v
	return s
}

func (s *ALiYunChainNodeInfo) SetNodeSource(v string) *ALiYunChainNodeInfo {
	s.NodeSource = &v
	return s
}

func (s *ALiYunChainNodeInfo) SetDiskUse(v string) *ALiYunChainNodeInfo {
	s.DiskUse = &v
	return s
}

func (s *ALiYunChainNodeInfo) SetDiskTotal(v string) *ALiYunChainNodeInfo {
	s.DiskTotal = &v
	return s
}

func (s *ALiYunChainNodeInfo) SetPublicKey(v string) *ALiYunChainNodeInfo {
	s.PublicKey = &v
	return s
}

// VC可信传输时，指定的目标did信息
type VcTransmitTargetStruct struct {
	// 目标did的公钥
	// example:
	//
	// xxxx
	PublicKey *string `json:"public_key,omitempty" xml:"public_key,omitempty"`
	// 传输vc使用的区块链id
	// example:
	//
	// bizid
	VcChannel *string `json:"vc_channel,omitempty" xml:"vc_channel,omitempty" maxLength:"32" minLength:"8"`
	// 验证者did
	// example:
	//
	// did:mychain:xxxx
	VerifierDid *string `json:"verifier_did,omitempty" xml:"verifier_did,omitempty" require:"true"`
}

func (s VcTransmitTargetStruct) String() string {
	return tea.Prettify(s)
}

func (s VcTransmitTargetStruct) GoString() string {
	return s.String()
}

func (s *VcTransmitTargetStruct) SetPublicKey(v string) *VcTransmitTargetStruct {
	s.PublicKey = &v
	return s
}

func (s *VcTransmitTargetStruct) SetVcChannel(v string) *VcTransmitTargetStruct {
	s.VcChannel = &v
	return s
}

func (s *VcTransmitTargetStruct) SetVerifierDid(v string) *VcTransmitTargetStruct {
	s.VerifierDid = &v
	return s
}

// 人群标签对象
type CrowdTagEnumItemDTO struct {
	// 枚举名称
	// example:
	//
	// 性别
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 枚举值
	// example:
	//
	// F
	Val *string `json:"val,omitempty" xml:"val,omitempty" require:"true"`
}

func (s CrowdTagEnumItemDTO) String() string {
	return tea.Prettify(s)
}

func (s CrowdTagEnumItemDTO) GoString() string {
	return s.String()
}

func (s *CrowdTagEnumItemDTO) SetName(v string) *CrowdTagEnumItemDTO {
	s.Name = &v
	return s
}

func (s *CrowdTagEnumItemDTO) SetVal(v string) *CrowdTagEnumItemDTO {
	s.Val = &v
	return s
}

// 阿里云交易查询信息
type ALiYunTransaction struct {
	// tx_type
	// example:
	//
	// tx_type
	TxType *string `json:"tx_type,omitempty" xml:"tx_type,omitempty"`
	// data
	// example:
	//
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// hash
	// example:
	//
	// hash
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
	// from
	// example:
	//
	// from
	From *string `json:"from,omitempty" xml:"from,omitempty"`
	// to
	// example:
	//
	// to
	To *string `json:"to,omitempty" xml:"to,omitempty"`
	// timestamp
	// example:
	//
	// 1231231
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
	// period
	// example:
	//
	// 12312312
	Period *int64 `json:"period,omitempty" xml:"period,omitempty"`
	// nonce
	// example:
	//
	// nonce
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty"`
	// gas
	// example:
	//
	// gas
	Gas *string `json:"gas,omitempty" xml:"gas,omitempty"`
	// value
	// example:
	//
	// value
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
	// signatures
	// example:
	//
	// signatures
	Signatures []*string `json:"signatures,omitempty" xml:"signatures,omitempty" type:"Repeated"`
	// extentions
	// example:
	//
	// extentions
	Extentions []*string `json:"extentions,omitempty" xml:"extentions,omitempty" type:"Repeated"`
}

func (s ALiYunTransaction) String() string {
	return tea.Prettify(s)
}

func (s ALiYunTransaction) GoString() string {
	return s.String()
}

func (s *ALiYunTransaction) SetTxType(v string) *ALiYunTransaction {
	s.TxType = &v
	return s
}

func (s *ALiYunTransaction) SetData(v string) *ALiYunTransaction {
	s.Data = &v
	return s
}

func (s *ALiYunTransaction) SetHash(v string) *ALiYunTransaction {
	s.Hash = &v
	return s
}

func (s *ALiYunTransaction) SetFrom(v string) *ALiYunTransaction {
	s.From = &v
	return s
}

func (s *ALiYunTransaction) SetTo(v string) *ALiYunTransaction {
	s.To = &v
	return s
}

func (s *ALiYunTransaction) SetTimestamp(v int64) *ALiYunTransaction {
	s.Timestamp = &v
	return s
}

func (s *ALiYunTransaction) SetPeriod(v int64) *ALiYunTransaction {
	s.Period = &v
	return s
}

func (s *ALiYunTransaction) SetNonce(v string) *ALiYunTransaction {
	s.Nonce = &v
	return s
}

func (s *ALiYunTransaction) SetGas(v string) *ALiYunTransaction {
	s.Gas = &v
	return s
}

func (s *ALiYunTransaction) SetValue(v string) *ALiYunTransaction {
	s.Value = &v
	return s
}

func (s *ALiYunTransaction) SetSignatures(v []*string) *ALiYunTransaction {
	s.Signatures = v
	return s
}

func (s *ALiYunTransaction) SetExtentions(v []*string) *ALiYunTransaction {
	s.Extentions = v
	return s
}

// 阿里云存证链信息
type ALiYunNotaryBlockchain struct {
	// name
	// example:
	//
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// bizid
	// example:
	//
	// bizid
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty"`
	// chain_type
	// example:
	//
	// chain_type
	ChainType *string `json:"chain_type,omitempty" xml:"chain_type,omitempty"`
	// node_num
	// example:
	//
	// node_num
	NodeNum *int64 `json:"node_num,omitempty" xml:"node_num,omitempty"`
	// member_status
	// example:
	//
	// member_status
	MemberStatus *string `json:"member_status,omitempty" xml:"member_status,omitempty"`
	// block_height
	// example:
	//
	// block_height
	BlockHeight *int64 `json:"block_height,omitempty" xml:"block_height,omitempty"`
	// transactions
	// example:
	//
	// transactions
	Transactions *int64 `json:"transactions,omitempty" xml:"transactions,omitempty"`
	// network
	// example:
	//
	// network
	Network *string `json:"network,omitempty" xml:"network,omitempty"`
	// version
	// example:
	//
	// version
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
}

func (s ALiYunNotaryBlockchain) String() string {
	return tea.Prettify(s)
}

func (s ALiYunNotaryBlockchain) GoString() string {
	return s.String()
}

func (s *ALiYunNotaryBlockchain) SetName(v string) *ALiYunNotaryBlockchain {
	s.Name = &v
	return s
}

func (s *ALiYunNotaryBlockchain) SetBizid(v string) *ALiYunNotaryBlockchain {
	s.Bizid = &v
	return s
}

func (s *ALiYunNotaryBlockchain) SetChainType(v string) *ALiYunNotaryBlockchain {
	s.ChainType = &v
	return s
}

func (s *ALiYunNotaryBlockchain) SetNodeNum(v int64) *ALiYunNotaryBlockchain {
	s.NodeNum = &v
	return s
}

func (s *ALiYunNotaryBlockchain) SetMemberStatus(v string) *ALiYunNotaryBlockchain {
	s.MemberStatus = &v
	return s
}

func (s *ALiYunNotaryBlockchain) SetBlockHeight(v int64) *ALiYunNotaryBlockchain {
	s.BlockHeight = &v
	return s
}

func (s *ALiYunNotaryBlockchain) SetTransactions(v int64) *ALiYunNotaryBlockchain {
	s.Transactions = &v
	return s
}

func (s *ALiYunNotaryBlockchain) SetNetwork(v string) *ALiYunNotaryBlockchain {
	s.Network = &v
	return s
}

func (s *ALiYunNotaryBlockchain) SetVersion(v string) *ALiYunNotaryBlockchain {
	s.Version = &v
	return s
}

// 合约市场列表
type ContractTemplateResp struct {
	// 模板标识
	// example:
	//
	// tme202307251209228357cc
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty"`
	// 产品码
	// example:
	//
	// 0001
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
	// 合约名称
	// example:
	//
	// 资产合约
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 缩略图url
	// example:
	//
	// http://www.xxx.com
	ThumbUrl *string `json:"thumb_url,omitempty" xml:"thumb_url,omitempty"`
	// 合约描述
	// example:
	//
	// 实现数据不可删除，不可篡改，不可抵赖的存证效果
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 文档地址
	// example:
	//
	// https://help.aliyun.com/product/84950.html
	DetailUrl *string `json:"detail_url,omitempty" xml:"detail_url,omitempty"`
	// 是否已开通合约
	// example:
	//
	// true
	Open *bool `json:"open,omitempty" xml:"open,omitempty"`
	// 后续展示：购买用户头像
	AvatarLogoList []*string `json:"avatar_logo_list,omitempty" xml:"avatar_logo_list,omitempty" type:"Repeated"`
	// 定制合约价格
	// example:
	//
	// 定制合约服务费用：80,000元/年
	PriceMessage *string `json:"price_message,omitempty" xml:"price_message,omitempty"`
}

func (s ContractTemplateResp) String() string {
	return tea.Prettify(s)
}

func (s ContractTemplateResp) GoString() string {
	return s.String()
}

func (s *ContractTemplateResp) SetTemplateId(v string) *ContractTemplateResp {
	s.TemplateId = &v
	return s
}

func (s *ContractTemplateResp) SetProductCode(v string) *ContractTemplateResp {
	s.ProductCode = &v
	return s
}

func (s *ContractTemplateResp) SetName(v string) *ContractTemplateResp {
	s.Name = &v
	return s
}

func (s *ContractTemplateResp) SetThumbUrl(v string) *ContractTemplateResp {
	s.ThumbUrl = &v
	return s
}

func (s *ContractTemplateResp) SetDescription(v string) *ContractTemplateResp {
	s.Description = &v
	return s
}

func (s *ContractTemplateResp) SetDetailUrl(v string) *ContractTemplateResp {
	s.DetailUrl = &v
	return s
}

func (s *ContractTemplateResp) SetOpen(v bool) *ContractTemplateResp {
	s.Open = &v
	return s
}

func (s *ContractTemplateResp) SetAvatarLogoList(v []*string) *ContractTemplateResp {
	s.AvatarLogoList = v
	return s
}

func (s *ContractTemplateResp) SetPriceMessage(v string) *ContractTemplateResp {
	s.PriceMessage = &v
	return s
}

// 数据授权服务数据对象结构体
type DataEntity struct {
	// 授权状态
	// example:
	//
	// AUTHORIZED
	AuthStatus *string `json:"auth_status,omitempty" xml:"auth_status,omitempty"`
	// 业务系统唯一标示
	// example:
	//
	// 76a0e716164848168dc726460042ee25
	BizUid *string `json:"biz_uid,omitempty" xml:"biz_uid,omitempty" maxLength:"64"`
	// 区块链ID
	// example:
	//
	// 8c777cf9a71b660233215b6337dca78d
	BlockchainId *string `json:"blockchain_id,omitempty" xml:"blockchain_id,omitempty"`
	// 数据类别
	// example:
	//
	// TABLE,FILE...
	Category *string `json:"category,omitempty" xml:"category,omitempty" require:"true" maxLength:"32"`
	// 数据ID
	// example:
	//
	// did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true" maxLength:"100"`
	// 数据模型ID
	// example:
	//
	// DATA_MODEL_Q23
	DataModelId *string `json:"data_model_id,omitempty" xml:"data_model_id,omitempty"`
	// 扩展信息，标准JSON格式
	// example:
	//
	// {"strategy":"test”}
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
	// 数据名称
	// example:
	//
	// testdata
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"64"`
	// 数据所有者ID
	// example:
	//
	// did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
	OwnerId *string `json:"owner_id,omitempty" xml:"owner_id,omitempty" require:"true" maxLength:"100"`
	// 流程节点信息
	ProcessTemplate []*ProcessNode `json:"process_template,omitempty" xml:"process_template,omitempty" type:"Repeated"`
	// 数据状态
	// example:
	//
	// ACTIVE,DELETED...
	Status *string `json:"status,omitempty" xml:"status,omitempty" maxLength:"16"`
	// 创建时间
	// example:
	//
	// 1595574776000
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty" require:"true"`
	// 修改时间
	// example:
	//
	// 1592810480442
	UpdateTime *int64 `json:"update_time,omitempty" xml:"update_time,omitempty"`
	// DID doc里的公开信息
	// example:
	//
	// {}
	PublicInfo *string `json:"public_info,omitempty" xml:"public_info,omitempty"`
}

func (s DataEntity) String() string {
	return tea.Prettify(s)
}

func (s DataEntity) GoString() string {
	return s.String()
}

func (s *DataEntity) SetAuthStatus(v string) *DataEntity {
	s.AuthStatus = &v
	return s
}

func (s *DataEntity) SetBizUid(v string) *DataEntity {
	s.BizUid = &v
	return s
}

func (s *DataEntity) SetBlockchainId(v string) *DataEntity {
	s.BlockchainId = &v
	return s
}

func (s *DataEntity) SetCategory(v string) *DataEntity {
	s.Category = &v
	return s
}

func (s *DataEntity) SetDataId(v string) *DataEntity {
	s.DataId = &v
	return s
}

func (s *DataEntity) SetDataModelId(v string) *DataEntity {
	s.DataModelId = &v
	return s
}

func (s *DataEntity) SetExtensionInfo(v string) *DataEntity {
	s.ExtensionInfo = &v
	return s
}

func (s *DataEntity) SetName(v string) *DataEntity {
	s.Name = &v
	return s
}

func (s *DataEntity) SetOwnerId(v string) *DataEntity {
	s.OwnerId = &v
	return s
}

func (s *DataEntity) SetProcessTemplate(v []*ProcessNode) *DataEntity {
	s.ProcessTemplate = v
	return s
}

func (s *DataEntity) SetStatus(v string) *DataEntity {
	s.Status = &v
	return s
}

func (s *DataEntity) SetCreateTime(v int64) *DataEntity {
	s.CreateTime = &v
	return s
}

func (s *DataEntity) SetUpdateTime(v int64) *DataEntity {
	s.UpdateTime = &v
	return s
}

func (s *DataEntity) SetPublicInfo(v string) *DataEntity {
	s.PublicInfo = &v
	return s
}

// 车辆用户信息
type CarUserInfo struct {
	// 唯一标识用户的id
	// example:
	//
	// xxxxx
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 手机号
	// example:
	//
	// 138xxxxxxx
	PhoneNum *string `json:"phone_num,omitempty" xml:"phone_num,omitempty" require:"true"`
	// 城市编码
	// example:
	//
	// 110000
	CityCode *string `json:"city_code,omitempty" xml:"city_code,omitempty" require:"true"`
	// 姓名
	// example:
	//
	// 张三
	UserCertName *string `json:"user_cert_name,omitempty" xml:"user_cert_name,omitempty"`
	// 证件号码
	// example:
	//
	// xxxxx
	UserCertNo *string `json:"user_cert_no,omitempty" xml:"user_cert_no,omitempty"`
	// 性别
	// example:
	//
	// girl
	UserGender *string `json:"user_gender,omitempty" xml:"user_gender,omitempty"`
	// 昵称
	// example:
	//
	// xxxxx
	Nick *string `json:"nick,omitempty" xml:"nick,omitempty"`
}

func (s CarUserInfo) String() string {
	return tea.Prettify(s)
}

func (s CarUserInfo) GoString() string {
	return s.String()
}

func (s *CarUserInfo) SetUserId(v string) *CarUserInfo {
	s.UserId = &v
	return s
}

func (s *CarUserInfo) SetPhoneNum(v string) *CarUserInfo {
	s.PhoneNum = &v
	return s
}

func (s *CarUserInfo) SetCityCode(v string) *CarUserInfo {
	s.CityCode = &v
	return s
}

func (s *CarUserInfo) SetUserCertName(v string) *CarUserInfo {
	s.UserCertName = &v
	return s
}

func (s *CarUserInfo) SetUserCertNo(v string) *CarUserInfo {
	s.UserCertNo = &v
	return s
}

func (s *CarUserInfo) SetUserGender(v string) *CarUserInfo {
	s.UserGender = &v
	return s
}

func (s *CarUserInfo) SetNick(v string) *CarUserInfo {
	s.Nick = &v
	return s
}

// 阿里云蚂蚁链对象
type ALiYunAntChain struct {
	// ant_chain_id
	// example:
	//
	// ant_chain_id
	AntChainId *string `json:"ant_chain_id,omitempty" xml:"ant_chain_id,omitempty"`
	// 链名称
	// example:
	//
	// name
	AntChainName *string `json:"ant_chain_name,omitempty" xml:"ant_chain_name,omitempty"`
	// 链的类型
	// example:
	//
	// 链的类型
	ChainType *string `json:"chain_type,omitempty" xml:"chain_type,omitempty"`
	// cipher_suit
	// example:
	//
	// cipher_suit
	CipherSuit *string `json:"cipher_suit,omitempty" xml:"cipher_suit,omitempty"`
	// 创建时间
	// example:
	//
	// 创建时间
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// expire_time
	// example:
	//
	// 1123123123123
	ExpireTime *int64 `json:"expire_time,omitempty" xml:"expire_time,omitempty"`
	// instance_id
	// example:
	//
	// instance_id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty"`
	// is_admin
	// example:
	//
	// true、false
	IsAdmin *bool `json:"is_admin,omitempty" xml:"is_admin,omitempty"`
	// 成员状态
	// example:
	//
	// 成员状态
	MemberStatus *string `json:"member_status,omitempty" xml:"member_status,omitempty"`
	// merkle_tree_suit
	// example:
	//
	// merkle_tree_suit
	MerkleTreeSuit *string `json:"merkle_tree_suit,omitempty" xml:"merkle_tree_suit,omitempty"`
	// Network
	// example:
	//
	// Network
	Network *string `json:"network,omitempty" xml:"network,omitempty"`
	// 节点数
	// example:
	//
	// 节点数
	NodeNum *int64 `json:"node_num,omitempty" xml:"node_num,omitempty"`
	// 区域信息
	// example:
	//
	// 区域信息
	RegionId *string `json:"region_id,omitempty" xml:"region_id,omitempty"`
	// 链的资源大小
	// example:
	//
	// 链的资源大小
	ResourceSize *string `json:"resource_size,omitempty" xml:"resource_size,omitempty"`
	// rest_status
	// example:
	//
	// rest_status
	RestStatus *string `json:"rest_status,omitempty" xml:"rest_status,omitempty"`
	// 算法参数
	// example:
	//
	// 算法参数
	TlsAlgo *string `json:"tls_algo,omitempty" xml:"tls_algo,omitempty"`
	// 版本信息
	// example:
	//
	// 0.10.2.12.5
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
	// monitor_status
	// example:
	//
	// monitor_status
	MonitorStatus *bool `json:"monitor_status,omitempty" xml:"monitor_status,omitempty"`
}

func (s ALiYunAntChain) String() string {
	return tea.Prettify(s)
}

func (s ALiYunAntChain) GoString() string {
	return s.String()
}

func (s *ALiYunAntChain) SetAntChainId(v string) *ALiYunAntChain {
	s.AntChainId = &v
	return s
}

func (s *ALiYunAntChain) SetAntChainName(v string) *ALiYunAntChain {
	s.AntChainName = &v
	return s
}

func (s *ALiYunAntChain) SetChainType(v string) *ALiYunAntChain {
	s.ChainType = &v
	return s
}

func (s *ALiYunAntChain) SetCipherSuit(v string) *ALiYunAntChain {
	s.CipherSuit = &v
	return s
}

func (s *ALiYunAntChain) SetCreateTime(v int64) *ALiYunAntChain {
	s.CreateTime = &v
	return s
}

func (s *ALiYunAntChain) SetExpireTime(v int64) *ALiYunAntChain {
	s.ExpireTime = &v
	return s
}

func (s *ALiYunAntChain) SetInstanceId(v string) *ALiYunAntChain {
	s.InstanceId = &v
	return s
}

func (s *ALiYunAntChain) SetIsAdmin(v bool) *ALiYunAntChain {
	s.IsAdmin = &v
	return s
}

func (s *ALiYunAntChain) SetMemberStatus(v string) *ALiYunAntChain {
	s.MemberStatus = &v
	return s
}

func (s *ALiYunAntChain) SetMerkleTreeSuit(v string) *ALiYunAntChain {
	s.MerkleTreeSuit = &v
	return s
}

func (s *ALiYunAntChain) SetNetwork(v string) *ALiYunAntChain {
	s.Network = &v
	return s
}

func (s *ALiYunAntChain) SetNodeNum(v int64) *ALiYunAntChain {
	s.NodeNum = &v
	return s
}

func (s *ALiYunAntChain) SetRegionId(v string) *ALiYunAntChain {
	s.RegionId = &v
	return s
}

func (s *ALiYunAntChain) SetResourceSize(v string) *ALiYunAntChain {
	s.ResourceSize = &v
	return s
}

func (s *ALiYunAntChain) SetRestStatus(v string) *ALiYunAntChain {
	s.RestStatus = &v
	return s
}

func (s *ALiYunAntChain) SetTlsAlgo(v string) *ALiYunAntChain {
	s.TlsAlgo = &v
	return s
}

func (s *ALiYunAntChain) SetVersion(v string) *ALiYunAntChain {
	s.Version = &v
	return s
}

func (s *ALiYunAntChain) SetMonitorStatus(v bool) *ALiYunAntChain {
	s.MonitorStatus = &v
	return s
}

// Did Doc中的服务字段描述
type DidDocServicesInfo struct {
	// 服务的扩展字段
	// example:
	//
	// json string
	Extension *string `json:"extension,omitempty" xml:"extension,omitempty"`
	// 服务ID，必须保证该服务ID在did doc中是唯一的。对于保留类型服务：
	// DidAuthService， 有且只能有一个，并且id必须为didauth-1；
	// VerifiableClaimRepository， 有且只有一个，并且id必须为vcrepository-1;
	// example:
	//
	// service-id1
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 服务的可访问地址
	// example:
	//
	// http://example.com
	ServiceEndpoint *string `json:"service_endpoint,omitempty" xml:"service_endpoint,omitempty" require:"true"`
	// 服务类型，必须是已经注册的服务类型，或者是默认保留的服务类型
	// example:
	//
	// KYBServiceType
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s DidDocServicesInfo) String() string {
	return tea.Prettify(s)
}

func (s DidDocServicesInfo) GoString() string {
	return s.String()
}

func (s *DidDocServicesInfo) SetExtension(v string) *DidDocServicesInfo {
	s.Extension = &v
	return s
}

func (s *DidDocServicesInfo) SetId(v string) *DidDocServicesInfo {
	s.Id = &v
	return s
}

func (s *DidDocServicesInfo) SetServiceEndpoint(v string) *DidDocServicesInfo {
	s.ServiceEndpoint = &v
	return s
}

func (s *DidDocServicesInfo) SetType(v string) *DidDocServicesInfo {
	s.Type = &v
	return s
}

// 阿里云蚂蚁区块链证书信息
type ALiYunCertificateApplication struct {
	// ant_chain_id
	// example:
	//
	// ant_chain_id
	AntChainId *string `json:"ant_chain_id,omitempty" xml:"ant_chain_id,omitempty"`
	// username
	// example:
	//
	// username
	Username *string `json:"username,omitempty" xml:"username,omitempty"`
	// createtime
	// example:
	//
	// createtime
	Createtime *int64 `json:"createtime,omitempty" xml:"createtime,omitempty"`
	// updatetime
	// example:
	//
	// 1231231231231
	Updatetime *int64 `json:"updatetime,omitempty" xml:"updatetime,omitempty"`
	// bid
	// example:
	//
	// bid
	Bid *string `json:"bid,omitempty" xml:"bid,omitempty"`
	// status
	// example:
	//
	// status
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s ALiYunCertificateApplication) String() string {
	return tea.Prettify(s)
}

func (s ALiYunCertificateApplication) GoString() string {
	return s.String()
}

func (s *ALiYunCertificateApplication) SetAntChainId(v string) *ALiYunCertificateApplication {
	s.AntChainId = &v
	return s
}

func (s *ALiYunCertificateApplication) SetUsername(v string) *ALiYunCertificateApplication {
	s.Username = &v
	return s
}

func (s *ALiYunCertificateApplication) SetCreatetime(v int64) *ALiYunCertificateApplication {
	s.Createtime = &v
	return s
}

func (s *ALiYunCertificateApplication) SetUpdatetime(v int64) *ALiYunCertificateApplication {
	s.Updatetime = &v
	return s
}

func (s *ALiYunCertificateApplication) SetBid(v string) *ALiYunCertificateApplication {
	s.Bid = &v
	return s
}

func (s *ALiYunCertificateApplication) SetStatus(v string) *ALiYunCertificateApplication {
	s.Status = &v
	return s
}

// DidDoc中service的信息
type DisServicesInfo struct {
	// did doc service扩展字段
	// example:
	//
	// {}
	Extesion *string `json:"extesion,omitempty" xml:"extesion,omitempty"`
	// did doc service id
	// example:
	//
	// didauth-1
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 服务endpoint
	// example:
	//
	// http://auth.mydid.agent.com
	ServiceEndpoint *string `json:"service_endpoint,omitempty" xml:"service_endpoint,omitempty" require:"true"`
	// service type
	// example:
	//
	// DidAuthService
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// EXIST
	// CONFLICT
	// VALID
	// INVALID
	// example:
	//
	// 描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
}

func (s DisServicesInfo) String() string {
	return tea.Prettify(s)
}

func (s DisServicesInfo) GoString() string {
	return s.String()
}

func (s *DisServicesInfo) SetExtesion(v string) *DisServicesInfo {
	s.Extesion = &v
	return s
}

func (s *DisServicesInfo) SetId(v string) *DisServicesInfo {
	s.Id = &v
	return s
}

func (s *DisServicesInfo) SetServiceEndpoint(v string) *DisServicesInfo {
	s.ServiceEndpoint = &v
	return s
}

func (s *DisServicesInfo) SetType(v string) *DisServicesInfo {
	s.Type = &v
	return s
}

func (s *DisServicesInfo) SetDesc(v string) *DisServicesInfo {
	s.Desc = &v
	return s
}

// 阿里云合约链信息
type ALiYunContractBlockchain struct {
	// name
	// example:
	//
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// bizid
	// example:
	//
	// bizid
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty"`
	// chain_type
	// example:
	//
	// chain_type
	ChainType *string `json:"chain_type,omitempty" xml:"chain_type,omitempty"`
	// node_num
	// example:
	//
	// 3
	NodeNum *int64 `json:"node_num,omitempty" xml:"node_num,omitempty"`
	// member_status
	// example:
	//
	// member_status
	MemberStatus *string `json:"member_status,omitempty" xml:"member_status,omitempty"`
	// block_height
	// example:
	//
	// 4
	BlockHeight *int64 `json:"block_height,omitempty" xml:"block_height,omitempty"`
	// transactions
	// example:
	//
	// 121
	Transactions *int64 `json:"transactions,omitempty" xml:"transactions,omitempty"`
	// network
	// example:
	//
	// network
	Network *string `json:"network,omitempty" xml:"network,omitempty"`
	// version
	// example:
	//
	// version
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
}

func (s ALiYunContractBlockchain) String() string {
	return tea.Prettify(s)
}

func (s ALiYunContractBlockchain) GoString() string {
	return s.String()
}

func (s *ALiYunContractBlockchain) SetName(v string) *ALiYunContractBlockchain {
	s.Name = &v
	return s
}

func (s *ALiYunContractBlockchain) SetBizid(v string) *ALiYunContractBlockchain {
	s.Bizid = &v
	return s
}

func (s *ALiYunContractBlockchain) SetChainType(v string) *ALiYunContractBlockchain {
	s.ChainType = &v
	return s
}

func (s *ALiYunContractBlockchain) SetNodeNum(v int64) *ALiYunContractBlockchain {
	s.NodeNum = &v
	return s
}

func (s *ALiYunContractBlockchain) SetMemberStatus(v string) *ALiYunContractBlockchain {
	s.MemberStatus = &v
	return s
}

func (s *ALiYunContractBlockchain) SetBlockHeight(v int64) *ALiYunContractBlockchain {
	s.BlockHeight = &v
	return s
}

func (s *ALiYunContractBlockchain) SetTransactions(v int64) *ALiYunContractBlockchain {
	s.Transactions = &v
	return s
}

func (s *ALiYunContractBlockchain) SetNetwork(v string) *ALiYunContractBlockchain {
	s.Network = &v
	return s
}

func (s *ALiYunContractBlockchain) SetVersion(v string) *ALiYunContractBlockchain {
	s.Version = &v
	return s
}

// 阿里云区块链小程序用户权限信息
type ALiYunChainMiniAppAuthorizedUser struct {
	// phone
	// example:
	//
	// phone
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty"`
	// gmt_authorized
	// example:
	//
	// gmt_authorized
	GmtAuthorized *string `json:"gmt_authorized,omitempty" xml:"gmt_authorized,omitempty"`
	// 记录id
	// example:
	//
	// 112
	UserId *int64 `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s ALiYunChainMiniAppAuthorizedUser) String() string {
	return tea.Prettify(s)
}

func (s ALiYunChainMiniAppAuthorizedUser) GoString() string {
	return s.String()
}

func (s *ALiYunChainMiniAppAuthorizedUser) SetPhone(v string) *ALiYunChainMiniAppAuthorizedUser {
	s.Phone = &v
	return s
}

func (s *ALiYunChainMiniAppAuthorizedUser) SetGmtAuthorized(v string) *ALiYunChainMiniAppAuthorizedUser {
	s.GmtAuthorized = &v
	return s
}

func (s *ALiYunChainMiniAppAuthorizedUser) SetUserId(v int64) *ALiYunChainMiniAppAuthorizedUser {
	s.UserId = &v
	return s
}

// 阿里云合约工程信息
type ALiYunContractProject struct {
	// consortium_id
	// example:
	//
	// consortium_id
	ConsortiumId *string `json:"consortium_id,omitempty" xml:"consortium_id,omitempty"`
	// create_time
	// example:
	//
	// 123123123
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// project_description
	// example:
	//
	// project_description
	ProjectDescription *string `json:"project_description,omitempty" xml:"project_description,omitempty"`
	// project_id
	// example:
	//
	// project_id
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty"`
	// project_name
	// example:
	//
	// project_name
	ProjectName *string `json:"project_name,omitempty" xml:"project_name,omitempty"`
	// project_version
	// example:
	//
	// project_version
	ProjectVersion *string `json:"project_version,omitempty" xml:"project_version,omitempty"`
	// update_time
	// example:
	//
	// update_time
	UpdateTime *int64 `json:"update_time,omitempty" xml:"update_time,omitempty"`
}

func (s ALiYunContractProject) String() string {
	return tea.Prettify(s)
}

func (s ALiYunContractProject) GoString() string {
	return s.String()
}

func (s *ALiYunContractProject) SetConsortiumId(v string) *ALiYunContractProject {
	s.ConsortiumId = &v
	return s
}

func (s *ALiYunContractProject) SetCreateTime(v int64) *ALiYunContractProject {
	s.CreateTime = &v
	return s
}

func (s *ALiYunContractProject) SetProjectDescription(v string) *ALiYunContractProject {
	s.ProjectDescription = &v
	return s
}

func (s *ALiYunContractProject) SetProjectId(v string) *ALiYunContractProject {
	s.ProjectId = &v
	return s
}

func (s *ALiYunContractProject) SetProjectName(v string) *ALiYunContractProject {
	s.ProjectName = &v
	return s
}

func (s *ALiYunContractProject) SetProjectVersion(v string) *ALiYunContractProject {
	s.ProjectVersion = &v
	return s
}

func (s *ALiYunContractProject) SetUpdateTime(v int64) *ALiYunContractProject {
	s.UpdateTime = &v
	return s
}

// 合约列表
type ContractPageListResp struct {
	// 服务ID
	// example:
	//
	// cme20230724104931af3a4d
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty"`
	// 合约名称
	// example:
	//
	// 资产合约
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 合约类型
	// example:
	//
	// 存证合约
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 创建时间
	// example:
	//
	// 1690166971465
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
}

func (s ContractPageListResp) String() string {
	return tea.Prettify(s)
}

func (s ContractPageListResp) GoString() string {
	return s.String()
}

func (s *ContractPageListResp) SetServiceId(v string) *ContractPageListResp {
	s.ServiceId = &v
	return s
}

func (s *ContractPageListResp) SetName(v string) *ContractPageListResp {
	s.Name = &v
	return s
}

func (s *ContractPageListResp) SetType(v string) *ContractPageListResp {
	s.Type = &v
	return s
}

func (s *ContractPageListResp) SetCreateTime(v int64) *ContractPageListResp {
	s.CreateTime = &v
	return s
}

// 阿里云区块链信息
type ALiYunOldContractBlockchain struct {
	// name
	// example:
	//
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// bizid
	// example:
	//
	// bizid
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty"`
	// chain_type
	// example:
	//
	// chain_type
	ChainType *string `json:"chain_type,omitempty" xml:"chain_type,omitempty"`
	// node_num
	// example:
	//
	// node_num
	NodeNum *int64 `json:"node_num,omitempty" xml:"node_num,omitempty"`
	// member_status
	// example:
	//
	// member_status
	MemberStatus *string `json:"member_status,omitempty" xml:"member_status,omitempty"`
	// block_height
	// example:
	//
	// block_height
	BlockHeight *int64 `json:"block_height,omitempty" xml:"block_height,omitempty"`
	// transactions
	// example:
	//
	// transactions
	Transactions *int64 `json:"transactions,omitempty" xml:"transactions,omitempty"`
	// network
	// example:
	//
	// network
	Network *string `json:"network,omitempty" xml:"network,omitempty"`
	// version
	// example:
	//
	// version
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
}

func (s ALiYunOldContractBlockchain) String() string {
	return tea.Prettify(s)
}

func (s ALiYunOldContractBlockchain) GoString() string {
	return s.String()
}

func (s *ALiYunOldContractBlockchain) SetName(v string) *ALiYunOldContractBlockchain {
	s.Name = &v
	return s
}

func (s *ALiYunOldContractBlockchain) SetBizid(v string) *ALiYunOldContractBlockchain {
	s.Bizid = &v
	return s
}

func (s *ALiYunOldContractBlockchain) SetChainType(v string) *ALiYunOldContractBlockchain {
	s.ChainType = &v
	return s
}

func (s *ALiYunOldContractBlockchain) SetNodeNum(v int64) *ALiYunOldContractBlockchain {
	s.NodeNum = &v
	return s
}

func (s *ALiYunOldContractBlockchain) SetMemberStatus(v string) *ALiYunOldContractBlockchain {
	s.MemberStatus = &v
	return s
}

func (s *ALiYunOldContractBlockchain) SetBlockHeight(v int64) *ALiYunOldContractBlockchain {
	s.BlockHeight = &v
	return s
}

func (s *ALiYunOldContractBlockchain) SetTransactions(v int64) *ALiYunOldContractBlockchain {
	s.Transactions = &v
	return s
}

func (s *ALiYunOldContractBlockchain) SetNetwork(v string) *ALiYunOldContractBlockchain {
	s.Network = &v
	return s
}

func (s *ALiYunOldContractBlockchain) SetVersion(v string) *ALiYunOldContractBlockchain {
	s.Version = &v
	return s
}

// 分页属性
type ALiYunPagination struct {
	// 分页大小
	// example:
	//
	// 20
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 分页编号
	// example:
	//
	// 1
	PageNumber *int64 `json:"page_number,omitempty" xml:"page_number,omitempty"`
	// 总数大小
	// example:
	//
	// 100
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s ALiYunPagination) String() string {
	return tea.Prettify(s)
}

func (s ALiYunPagination) GoString() string {
	return s.String()
}

func (s *ALiYunPagination) SetPageSize(v int64) *ALiYunPagination {
	s.PageSize = &v
	return s
}

func (s *ALiYunPagination) SetPageNumber(v int64) *ALiYunPagination {
	s.PageNumber = &v
	return s
}

func (s *ALiYunPagination) SetTotalCount(v int64) *ALiYunPagination {
	s.TotalCount = &v
	return s
}

// 阿里云区块链交易的汇总信息
type ALiYunTransactionSummary struct {
	// alias
	// example:
	//
	// alias
	Alias *string `json:"alias,omitempty" xml:"alias,omitempty"`
	// hash
	// example:
	//
	// hash
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
	// trans_type_v6
	// example:
	//
	// trans_type_v6
	TransTypeV6 *string `json:"trans_type_v6,omitempty" xml:"trans_type_v6,omitempty"`
	// trans_type_v10
	// example:
	//
	// trans_type_v10
	TransTypeV10 *string `json:"trans_type_v10,omitempty" xml:"trans_type_v10,omitempty"`
	// category
	// example:
	//
	// 1
	Category *int64 `json:"category,omitempty" xml:"category,omitempty"`
	// height
	// example:
	//
	// 2131231
	Height *int64 `json:"height,omitempty" xml:"height,omitempty"`
	// block_hash
	// example:
	//
	// block_hash
	BlockHash *string `json:"block_hash,omitempty" xml:"block_hash,omitempty"`
	// create_time
	// example:
	//
	// 123123123
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// reference_count
	// example:
	//
	// 1
	ReferenceCount *int64 `json:"reference_count,omitempty" xml:"reference_count,omitempty"`
	// from
	// example:
	//
	// from
	From *string `json:"from,omitempty" xml:"from,omitempty"`
	// to
	// example:
	//
	// to
	To *string `json:"to,omitempty" xml:"to,omitempty"`
	// gas_used
	// example:
	//
	// 123
	GasUsed *int64 `json:"gas_used,omitempty" xml:"gas_used,omitempty"`
}

func (s ALiYunTransactionSummary) String() string {
	return tea.Prettify(s)
}

func (s ALiYunTransactionSummary) GoString() string {
	return s.String()
}

func (s *ALiYunTransactionSummary) SetAlias(v string) *ALiYunTransactionSummary {
	s.Alias = &v
	return s
}

func (s *ALiYunTransactionSummary) SetHash(v string) *ALiYunTransactionSummary {
	s.Hash = &v
	return s
}

func (s *ALiYunTransactionSummary) SetTransTypeV6(v string) *ALiYunTransactionSummary {
	s.TransTypeV6 = &v
	return s
}

func (s *ALiYunTransactionSummary) SetTransTypeV10(v string) *ALiYunTransactionSummary {
	s.TransTypeV10 = &v
	return s
}

func (s *ALiYunTransactionSummary) SetCategory(v int64) *ALiYunTransactionSummary {
	s.Category = &v
	return s
}

func (s *ALiYunTransactionSummary) SetHeight(v int64) *ALiYunTransactionSummary {
	s.Height = &v
	return s
}

func (s *ALiYunTransactionSummary) SetBlockHash(v string) *ALiYunTransactionSummary {
	s.BlockHash = &v
	return s
}

func (s *ALiYunTransactionSummary) SetCreateTime(v int64) *ALiYunTransactionSummary {
	s.CreateTime = &v
	return s
}

func (s *ALiYunTransactionSummary) SetReferenceCount(v int64) *ALiYunTransactionSummary {
	s.ReferenceCount = &v
	return s
}

func (s *ALiYunTransactionSummary) SetFrom(v string) *ALiYunTransactionSummary {
	s.From = &v
	return s
}

func (s *ALiYunTransactionSummary) SetTo(v string) *ALiYunTransactionSummary {
	s.To = &v
	return s
}

func (s *ALiYunTransactionSummary) SetGasUsed(v int64) *ALiYunTransactionSummary {
	s.GasUsed = &v
	return s
}

// 阿里云联盟信息
type ALiYunAntConsortium struct {
	// 链的数量
	// example:
	//
	// 2
	ChainNum *int64 `json:"chain_num,omitempty" xml:"chain_num,omitempty"`
	// 成员数量
	// example:
	//
	// 5
	MemberNum *int64 `json:"member_num,omitempty" xml:"member_num,omitempty"`
	// 时间戳
	// example:
	//
	// 时间戳
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 角色
	// example:
	//
	// 角色
	Role *string `json:"role,omitempty" xml:"role,omitempty"`
	// 联盟id
	// example:
	//
	// 联盟id
	ConsortiumId *string `json:"consortium_id,omitempty" xml:"consortium_id,omitempty"`
	// 状态值
	// example:
	//
	// 状态值
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 联盟名称
	// example:
	//
	// 联盟名称
	ConsortiumName *string `json:"consortium_name,omitempty" xml:"consortium_name,omitempty"`
	// 联盟描述
	// example:
	//
	// 联盟描述
	ConsortiumDescription *string `json:"consortium_description,omitempty" xml:"consortium_description,omitempty"`
	// 是否为空联盟
	// example:
	//
	// true, false
	IsEmptyConsortium *bool `json:"is_empty_consortium,omitempty" xml:"is_empty_consortium,omitempty"`
}

func (s ALiYunAntConsortium) String() string {
	return tea.Prettify(s)
}

func (s ALiYunAntConsortium) GoString() string {
	return s.String()
}

func (s *ALiYunAntConsortium) SetChainNum(v int64) *ALiYunAntConsortium {
	s.ChainNum = &v
	return s
}

func (s *ALiYunAntConsortium) SetMemberNum(v int64) *ALiYunAntConsortium {
	s.MemberNum = &v
	return s
}

func (s *ALiYunAntConsortium) SetCreateTime(v int64) *ALiYunAntConsortium {
	s.CreateTime = &v
	return s
}

func (s *ALiYunAntConsortium) SetRole(v string) *ALiYunAntConsortium {
	s.Role = &v
	return s
}

func (s *ALiYunAntConsortium) SetConsortiumId(v string) *ALiYunAntConsortium {
	s.ConsortiumId = &v
	return s
}

func (s *ALiYunAntConsortium) SetStatus(v string) *ALiYunAntConsortium {
	s.Status = &v
	return s
}

func (s *ALiYunAntConsortium) SetConsortiumName(v string) *ALiYunAntConsortium {
	s.ConsortiumName = &v
	return s
}

func (s *ALiYunAntConsortium) SetConsortiumDescription(v string) *ALiYunAntConsortium {
	s.ConsortiumDescription = &v
	return s
}

func (s *ALiYunAntConsortium) SetIsEmptyConsortium(v bool) *ALiYunAntConsortium {
	s.IsEmptyConsortium = &v
	return s
}

// 阿里云数据导出任务checkpoint类
type CheckPointStructBody struct {
	// 高度
	// example:
	//
	// 100
	Height *string `json:"height,omitempty" xml:"height,omitempty"`
	// 序号
	// example:
	//
	// 0
	Index *string `json:"index,omitempty" xml:"index,omitempty"`
	// 类型
	// example:
	//
	// "Block"
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// last_error
	// example:
	//
	// “”
	LastError *string `json:"last_error,omitempty" xml:"last_error,omitempty"`
	// 错误统计
	// example:
	//
	// 0
	ErrorCount *string `json:"error_count,omitempty" xml:"error_count,omitempty"`
	// 统计
	// example:
	//
	// 0
	TotalCount *string `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s CheckPointStructBody) String() string {
	return tea.Prettify(s)
}

func (s CheckPointStructBody) GoString() string {
	return s.String()
}

func (s *CheckPointStructBody) SetHeight(v string) *CheckPointStructBody {
	s.Height = &v
	return s
}

func (s *CheckPointStructBody) SetIndex(v string) *CheckPointStructBody {
	s.Index = &v
	return s
}

func (s *CheckPointStructBody) SetType(v string) *CheckPointStructBody {
	s.Type = &v
	return s
}

func (s *CheckPointStructBody) SetLastError(v string) *CheckPointStructBody {
	s.LastError = &v
	return s
}

func (s *CheckPointStructBody) SetErrorCount(v string) *CheckPointStructBody {
	s.ErrorCount = &v
	return s
}

func (s *CheckPointStructBody) SetTotalCount(v string) *CheckPointStructBody {
	s.TotalCount = &v
	return s
}

// 人群匹配结果
type CrowdMatchResult struct {
	// 人群匹配结果
	// example:
	//
	// true, false
	Match *bool `json:"match,omitempty" xml:"match,omitempty" require:"true"`
}

func (s CrowdMatchResult) String() string {
	return tea.Prettify(s)
}

func (s CrowdMatchResult) GoString() string {
	return s.String()
}

func (s *CrowdMatchResult) SetMatch(v bool) *CrowdMatchResult {
	s.Match = &v
	return s
}

// 账户映射情况
type AccountMappingInfo struct {
	// 链上账户id
	// example:
	//
	// xxxxxxx
	BcAccount *string `json:"bc_account,omitempty" xml:"bc_account,omitempty" require:"true"`
	// 账户绑定状态，1为未绑定，2为绑定成功
	// example:
	//
	// 1
	BindingStatus *int64 `json:"binding_status,omitempty" xml:"binding_status,omitempty" require:"true"`
	// 1是激活状态，2是冻结状态
	// example:
	//
	// 1
	Status *int64 `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 账户唯一标示
	// example:
	//
	// userid
	Uid *string `json:"uid,omitempty" xml:"uid,omitempty" require:"true"`
}

func (s AccountMappingInfo) String() string {
	return tea.Prettify(s)
}

func (s AccountMappingInfo) GoString() string {
	return s.String()
}

func (s *AccountMappingInfo) SetBcAccount(v string) *AccountMappingInfo {
	s.BcAccount = &v
	return s
}

func (s *AccountMappingInfo) SetBindingStatus(v int64) *AccountMappingInfo {
	s.BindingStatus = &v
	return s
}

func (s *AccountMappingInfo) SetStatus(v int64) *AccountMappingInfo {
	s.Status = &v
	return s
}

func (s *AccountMappingInfo) SetUid(v string) *AccountMappingInfo {
	s.Uid = &v
	return s
}

// 证书实例详情
type CertInstanceDetail struct {
	// 主键
	// example:
	//
	// xx
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 实例名称
	// example:
	//
	// xx
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 版发者
	// example:
	//
	// xx
	Issuer *string `json:"issuer,omitempty" xml:"issuer,omitempty" require:"true"`
	// 实例内容
	// example:
	//
	// xx
	ClaimContent *string `json:"claim_content,omitempty" xml:"claim_content,omitempty" require:"true"`
	// 状态；-1：已删除 0：审核未通过, 1：审核通过, 2：待审核, 3：编辑中
	Status *int64 `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 审核建议
	// example:
	//
	// xx
	VerifyComment *string `json:"verify_comment,omitempty" xml:"verify_comment,omitempty" require:"true"`
	// 创建时间
	// example:
	//
	// 1701227612000
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true"`
	// 修改时间
	// example:
	//
	// 1701227612000
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true"`
}

func (s CertInstanceDetail) String() string {
	return tea.Prettify(s)
}

func (s CertInstanceDetail) GoString() string {
	return s.String()
}

func (s *CertInstanceDetail) SetBizId(v string) *CertInstanceDetail {
	s.BizId = &v
	return s
}

func (s *CertInstanceDetail) SetName(v string) *CertInstanceDetail {
	s.Name = &v
	return s
}

func (s *CertInstanceDetail) SetIssuer(v string) *CertInstanceDetail {
	s.Issuer = &v
	return s
}

func (s *CertInstanceDetail) SetClaimContent(v string) *CertInstanceDetail {
	s.ClaimContent = &v
	return s
}

func (s *CertInstanceDetail) SetStatus(v int64) *CertInstanceDetail {
	s.Status = &v
	return s
}

func (s *CertInstanceDetail) SetVerifyComment(v string) *CertInstanceDetail {
	s.VerifyComment = &v
	return s
}

func (s *CertInstanceDetail) SetGmtCreate(v string) *CertInstanceDetail {
	s.GmtCreate = &v
	return s
}

func (s *CertInstanceDetail) SetGmtModified(v string) *CertInstanceDetail {
	s.GmtModified = &v
	return s
}

// 奖品基本信息
type PrizeBaseInfo struct {
	// 奖品ID
	// example:
	//
	// 110000199001011234
	PrizeId *string `json:"prize_id,omitempty" xml:"prize_id,omitempty"`
	// 奖品名称
	// example:
	//
	// xx面馆
	PrizeName *string `json:"prize_name,omitempty" xml:"prize_name,omitempty"`
	// 奖品类型
	// example:
	//
	// VIRTUAL_PRIZE
	PrizeType *string `json:"prize_type,omitempty" xml:"prize_type,omitempty"`
	// 奖品状态
	// example:
	//
	// PRIZE_CREATED
	PrizeStatus *string `json:"prize_status,omitempty" xml:"prize_status,omitempty"`
	// 预算金额
	// example:
	//
	// 354.22
	BudgetAmount *int64 `json:"budget_amount,omitempty" xml:"budget_amount,omitempty"`
}

func (s PrizeBaseInfo) String() string {
	return tea.Prettify(s)
}

func (s PrizeBaseInfo) GoString() string {
	return s.String()
}

func (s *PrizeBaseInfo) SetPrizeId(v string) *PrizeBaseInfo {
	s.PrizeId = &v
	return s
}

func (s *PrizeBaseInfo) SetPrizeName(v string) *PrizeBaseInfo {
	s.PrizeName = &v
	return s
}

func (s *PrizeBaseInfo) SetPrizeType(v string) *PrizeBaseInfo {
	s.PrizeType = &v
	return s
}

func (s *PrizeBaseInfo) SetPrizeStatus(v string) *PrizeBaseInfo {
	s.PrizeStatus = &v
	return s
}

func (s *PrizeBaseInfo) SetBudgetAmount(v int64) *PrizeBaseInfo {
	s.BudgetAmount = &v
	return s
}

// 蚂蚁链用途申报结构体
type ChainPurpose struct {
	// 用途id
	// example:
	//
	// 4356
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 用途key
	// example:
	//
	// 3uhhf
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// 用途内容
	// example:
	//
	// 用途内容
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 用途申报时间
	// example:
	//
	// 22-01-01
	Time *string `json:"time,omitempty" xml:"time,omitempty"`
	// 用途申报状态
	// example:
	//
	// 用途申报状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 简短描述开关
	// example:
	//
	// true, false
	Item *bool `json:"item,omitempty" xml:"item,omitempty"`
	// 详细描述开关
	// example:
	//
	// true, false
	Extend *bool `json:"extend,omitempty" xml:"extend,omitempty"`
	// 用途申报简短描述
	// example:
	//
	// ""
	PurposeItem *string `json:"purpose_item,omitempty" xml:"purpose_item,omitempty"`
}

func (s ChainPurpose) String() string {
	return tea.Prettify(s)
}

func (s ChainPurpose) GoString() string {
	return s.String()
}

func (s *ChainPurpose) SetId(v string) *ChainPurpose {
	s.Id = &v
	return s
}

func (s *ChainPurpose) SetKey(v string) *ChainPurpose {
	s.Key = &v
	return s
}

func (s *ChainPurpose) SetName(v string) *ChainPurpose {
	s.Name = &v
	return s
}

func (s *ChainPurpose) SetTime(v string) *ChainPurpose {
	s.Time = &v
	return s
}

func (s *ChainPurpose) SetStatus(v string) *ChainPurpose {
	s.Status = &v
	return s
}

func (s *ChainPurpose) SetItem(v bool) *ChainPurpose {
	s.Item = &v
	return s
}

func (s *ChainPurpose) SetExtend(v bool) *ChainPurpose {
	s.Extend = &v
	return s
}

func (s *ChainPurpose) SetPurposeItem(v string) *ChainPurpose {
	s.PurposeItem = &v
	return s
}

// 定价策略
type PriceStrategy struct {
	// 定价策略类型
	// example:
	//
	// FIXED
	StrategyType *string `json:"strategy_type,omitempty" xml:"strategy_type,omitempty"`
	// 策略值
	// example:
	//
	// 110000199001011234
	StrategyValue *string `json:"strategy_value,omitempty" xml:"strategy_value,omitempty"`
	// 最小金额（单位：分）
	// example:
	//
	// 6.22
	MinPrice *int64 `json:"min_price,omitempty" xml:"min_price,omitempty"`
	// 最大金额（单位：分）
	// example:
	//
	// 45.22
	MaxPrice *int64 `json:"max_price,omitempty" xml:"max_price,omitempty"`
	// 门槛金额（单位：分）
	// example:
	//
	// 21.55
	Threshold *int64 `json:"threshold,omitempty" xml:"threshold,omitempty"`
	// 门槛类型
	// example:
	//
	// 074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5
	ThresholdType *string `json:"threshold_type,omitempty" xml:"threshold_type,omitempty"`
}

func (s PriceStrategy) String() string {
	return tea.Prettify(s)
}

func (s PriceStrategy) GoString() string {
	return s.String()
}

func (s *PriceStrategy) SetStrategyType(v string) *PriceStrategy {
	s.StrategyType = &v
	return s
}

func (s *PriceStrategy) SetStrategyValue(v string) *PriceStrategy {
	s.StrategyValue = &v
	return s
}

func (s *PriceStrategy) SetMinPrice(v int64) *PriceStrategy {
	s.MinPrice = &v
	return s
}

func (s *PriceStrategy) SetMaxPrice(v int64) *PriceStrategy {
	s.MaxPrice = &v
	return s
}

func (s *PriceStrategy) SetThreshold(v int64) *PriceStrategy {
	s.Threshold = &v
	return s
}

func (s *PriceStrategy) SetThresholdType(v string) *PriceStrategy {
	s.ThresholdType = &v
	return s
}

// 证书颁发校验错误描述
type TemplateInstanceErrorDetailDTO struct {
	// 当前错误类型的错误行数
	// example:
	//
	// 1-5000
	ErrorNum *int64 `json:"error_num,omitempty" xml:"error_num,omitempty" require:"true"`
	// 出错数据抽样
	// example:
	//
	// [“xxx“, “xxxx“]
	Samples []*string `json:"samples,omitempty" xml:"samples,omitempty" require:"true" type:"Repeated"`
	// 出错列，从0开始
	// example:
	//
	// 0
	ErrorColumnIndex *int64 `json:"error_column_index,omitempty" xml:"error_column_index,omitempty" require:"true"`
	// 当前错误类型的描述
	// example:
	//
	// 身份证号格式不正确
	ErrorDescription *string `json:"error_description,omitempty" xml:"error_description,omitempty" require:"true"`
}

func (s TemplateInstanceErrorDetailDTO) String() string {
	return tea.Prettify(s)
}

func (s TemplateInstanceErrorDetailDTO) GoString() string {
	return s.String()
}

func (s *TemplateInstanceErrorDetailDTO) SetErrorNum(v int64) *TemplateInstanceErrorDetailDTO {
	s.ErrorNum = &v
	return s
}

func (s *TemplateInstanceErrorDetailDTO) SetSamples(v []*string) *TemplateInstanceErrorDetailDTO {
	s.Samples = v
	return s
}

func (s *TemplateInstanceErrorDetailDTO) SetErrorColumnIndex(v int64) *TemplateInstanceErrorDetailDTO {
	s.ErrorColumnIndex = &v
	return s
}

func (s *TemplateInstanceErrorDetailDTO) SetErrorDescription(v string) *TemplateInstanceErrorDetailDTO {
	s.ErrorDescription = &v
	return s
}

// 申请用户授权的目标可验证声明内容、过期时间等配置
type Claim struct {
	// 一个json的string，内容包含具体需要的声明，不同业务场景不同。
	// example:
	//
	// {"issuerName":"XX有限公司","userNo":"12123434"}
	ClaimContent *string `json:"claim_content,omitempty" xml:"claim_content,omitempty" require:"true"`
	// 如果在相同的biz_type下，还需要针对声明claim进行细化划分，可以使用此字段。
	// example:
	//
	// Level1
	ClaimType *string `json:"claim_type,omitempty" xml:"claim_type,omitempty"`
	// 申请声明颁发后的有效期，可选参数，如果不指定则默认申请永久有效。
	// example:
	//
	// -1
	Expire *int64 `json:"expire,omitempty" xml:"expire,omitempty"`
	// 授权颁发可验证声明的目标did信息，通常为机构或组织的did
	// example:
	//
	// did:mychain:6d8f3ff4af91532eaa7fc477be6b68dea14ed3bcfd5755ccedced43f6c248214
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 目标待授权的名称，标定唯一性，与claim内容配合使用，如果不指定did可以考虑使用此字段。
	// example:
	//
	// XX有限公司
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s Claim) String() string {
	return tea.Prettify(s)
}

func (s Claim) GoString() string {
	return s.String()
}

func (s *Claim) SetClaimContent(v string) *Claim {
	s.ClaimContent = &v
	return s
}

func (s *Claim) SetClaimType(v string) *Claim {
	s.ClaimType = &v
	return s
}

func (s *Claim) SetExpire(v int64) *Claim {
	s.Expire = &v
	return s
}

func (s *Claim) SetDid(v string) *Claim {
	s.Did = &v
	return s
}

func (s *Claim) SetName(v string) *Claim {
	s.Name = &v
	return s
}

// 阿里云子链检查结果
type ALiYunChainSubnetCheck struct {
	// 检查结果
	// example:
	//
	// OK
	CheckResult *string `json:"check_result,omitempty" xml:"check_result,omitempty"`
	// 子链成员列表
	ConsortiumMemberList []*string `json:"consortium_member_list,omitempty" xml:"consortium_member_list,omitempty" type:"Repeated"`
	// 节点信息列表
	ChainNodeInfoList []*ALiYunChainNodeInfo `json:"chain_node_info_list,omitempty" xml:"chain_node_info_list,omitempty" type:"Repeated"`
	// 联盟管理员
	// example:
	//
	// true, false
	ConsortiumAdmin *bool `json:"consortium_admin,omitempty" xml:"consortium_admin,omitempty"`
	// 子链成员列表
	ConsortiumMemberInfoList []*ALiYunMember `json:"consortium_member_info_list,omitempty" xml:"consortium_member_info_list,omitempty" type:"Repeated"`
	// 分页信息
	Pagination *ALiYunPagination `json:"pagination,omitempty" xml:"pagination,omitempty"`
}

func (s ALiYunChainSubnetCheck) String() string {
	return tea.Prettify(s)
}

func (s ALiYunChainSubnetCheck) GoString() string {
	return s.String()
}

func (s *ALiYunChainSubnetCheck) SetCheckResult(v string) *ALiYunChainSubnetCheck {
	s.CheckResult = &v
	return s
}

func (s *ALiYunChainSubnetCheck) SetConsortiumMemberList(v []*string) *ALiYunChainSubnetCheck {
	s.ConsortiumMemberList = v
	return s
}

func (s *ALiYunChainSubnetCheck) SetChainNodeInfoList(v []*ALiYunChainNodeInfo) *ALiYunChainSubnetCheck {
	s.ChainNodeInfoList = v
	return s
}

func (s *ALiYunChainSubnetCheck) SetConsortiumAdmin(v bool) *ALiYunChainSubnetCheck {
	s.ConsortiumAdmin = &v
	return s
}

func (s *ALiYunChainSubnetCheck) SetConsortiumMemberInfoList(v []*ALiYunMember) *ALiYunChainSubnetCheck {
	s.ConsortiumMemberInfoList = v
	return s
}

func (s *ALiYunChainSubnetCheck) SetPagination(v *ALiYunPagination) *ALiYunChainSubnetCheck {
	s.Pagination = v
	return s
}

// 授权规则详细信息
type AuthorizationRule struct {
	// 规则来源
	// example:
	//
	// DID
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 规则索引
	// example:
	//
	// serviceType
	Index *string `json:"index,omitempty" xml:"index,omitempty" require:"true"`
	// 规则类型
	// example:
	//
	// DEFAULT
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 规则表达式
	// example:
	//
	// EQUALS
	Expression *string `json:"expression,omitempty" xml:"expression,omitempty" require:"true"`
	// 规则内容
	// example:
	//
	// content
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s AuthorizationRule) String() string {
	return tea.Prettify(s)
}

func (s AuthorizationRule) GoString() string {
	return s.String()
}

func (s *AuthorizationRule) SetSource(v string) *AuthorizationRule {
	s.Source = &v
	return s
}

func (s *AuthorizationRule) SetIndex(v string) *AuthorizationRule {
	s.Index = &v
	return s
}

func (s *AuthorizationRule) SetType(v string) *AuthorizationRule {
	s.Type = &v
	return s
}

func (s *AuthorizationRule) SetExpression(v string) *AuthorizationRule {
	s.Expression = &v
	return s
}

func (s *AuthorizationRule) SetContent(v string) *AuthorizationRule {
	s.Content = &v
	return s
}

// 账户映射结果
type AccountMappingResult struct {
	// 该账户在链上的唯一标示
	// example:
	//
	// 1234:1234:123
	Baccount *string `json:"baccount,omitempty" xml:"baccount,omitempty" require:"true"`
	// 当前账户映射结果描述语句
	// example:
	//
	// 成功
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
	// 状态描述符
	// example:
	//
	// success
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 自有系统中该账户唯一标示
	// example:
	//
	// 1234
	Uid *string `json:"uid,omitempty" xml:"uid,omitempty" require:"true"`
}

func (s AccountMappingResult) String() string {
	return tea.Prettify(s)
}

func (s AccountMappingResult) GoString() string {
	return s.String()
}

func (s *AccountMappingResult) SetBaccount(v string) *AccountMappingResult {
	s.Baccount = &v
	return s
}

func (s *AccountMappingResult) SetMessage(v string) *AccountMappingResult {
	s.Message = &v
	return s
}

func (s *AccountMappingResult) SetStatus(v string) *AccountMappingResult {
	s.Status = &v
	return s
}

func (s *AccountMappingResult) SetUid(v string) *AccountMappingResult {
	s.Uid = &v
	return s
}

// 经营地址
type AddressInfo struct {
	// 城市编码
	// example:
	//
	// 371000
	CityCode *string `json:"city_code,omitempty" xml:"city_code,omitempty" require:"true"`
	// 区县编码
	// example:
	//
	// 371002
	DistrictCode *string `json:"district_code,omitempty" xml:"district_code,omitempty" require:"true"`
	// 地址
	// example:
	//
	// 万塘路18号黄龙时代广场B座
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true"`
	// 省份编码
	// example:
	//
	// 370000
	ProvinceCode *string `json:"province_code,omitempty" xml:"province_code,omitempty" require:"true"`
	// 高德 poiid
	// example:
	//
	// B0FFIVU189
	Poiid *string `json:"poiid,omitempty" xml:"poiid,omitempty"`
	// 经度
	// example:
	//
	// 120.760001
	Longitude *string `json:"longitude,omitempty" xml:"longitude,omitempty"`
	// 纬度
	// example:
	//
	// 60.270001
	Latitude *string `json:"latitude,omitempty" xml:"latitude,omitempty"`
	// 地址类型
	// example:
	//
	// BUSINESS_ADDRESS
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s AddressInfo) String() string {
	return tea.Prettify(s)
}

func (s AddressInfo) GoString() string {
	return s.String()
}

func (s *AddressInfo) SetCityCode(v string) *AddressInfo {
	s.CityCode = &v
	return s
}

func (s *AddressInfo) SetDistrictCode(v string) *AddressInfo {
	s.DistrictCode = &v
	return s
}

func (s *AddressInfo) SetAddress(v string) *AddressInfo {
	s.Address = &v
	return s
}

func (s *AddressInfo) SetProvinceCode(v string) *AddressInfo {
	s.ProvinceCode = &v
	return s
}

func (s *AddressInfo) SetPoiid(v string) *AddressInfo {
	s.Poiid = &v
	return s
}

func (s *AddressInfo) SetLongitude(v string) *AddressInfo {
	s.Longitude = &v
	return s
}

func (s *AddressInfo) SetLatitude(v string) *AddressInfo {
	s.Latitude = &v
	return s
}

func (s *AddressInfo) SetType(v string) *AddressInfo {
	s.Type = &v
	return s
}

// 可验证声明的完整内容以及状态，当前持有者的did等信息
type VcContent struct {
	// 可验证声明的唯一标识id，status 为 “1” 时候非空
	// example:
	//
	// 未定义
	VcId *string `json:"vc_id,omitempty" xml:"vc_id,omitempty" require:"true"`
	// 可验证声明完整内容， status 为 “1” 时候非空
	// example:
	//
	// 声明内容，JSON字符串
	VcContent *string `json:"vc_content,omitempty" xml:"vc_content,omitempty" require:"true"`
	// 可验证声明的颁发状态说明： -1：颁发失败，0：未授权 1：授权成功，此时vc_content字段会包含授权后的声明内容，其它状态码，待定义后增加。
	// example:
	//
	// “1”
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 被颁发当前可验证声明的目标did
	// example:
	//
	// did:mychain:6d8f3ff4af91532eaa7fc477be6b68dea14ed3bcfd5755ccedced43f6c248214
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 如果status 是 “-1”，则说明当前可验证声明颁发失败，此字段说明失败原因。
	// example:
	//
	// “颁发可验证声明失败”
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s VcContent) String() string {
	return tea.Prettify(s)
}

func (s VcContent) GoString() string {
	return s.String()
}

func (s *VcContent) SetVcId(v string) *VcContent {
	s.VcId = &v
	return s
}

func (s *VcContent) SetVcContent(v string) *VcContent {
	s.VcContent = &v
	return s
}

func (s *VcContent) SetStatus(v string) *VcContent {
	s.Status = &v
	return s
}

func (s *VcContent) SetDid(v string) *VcContent {
	s.Did = &v
	return s
}

func (s *VcContent) SetMessage(v string) *VcContent {
	s.Message = &v
	return s
}

// 退分账明细信息
type RefundRoyaltyResult struct {
	// 退分账金额
	// example:
	//
	// 12.50
	RefundAmount *string `json:"refund_amount,omitempty" xml:"refund_amount,omitempty" require:"true"`
	// 退分账结果码
	// example:
	//
	// SUCCESS
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty" require:"true"`
}

func (s RefundRoyaltyResult) String() string {
	return tea.Prettify(s)
}

func (s RefundRoyaltyResult) GoString() string {
	return s.String()
}

func (s *RefundRoyaltyResult) SetRefundAmount(v string) *RefundRoyaltyResult {
	s.RefundAmount = &v
	return s
}

func (s *RefundRoyaltyResult) SetResultCode(v string) *RefundRoyaltyResult {
	s.ResultCode = &v
	return s
}

// 用户身份、账户及手机号信息
type UserInfoParam struct {
	// 用户手机号信息
	// example:
	//
	// 13222222222
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty" require:"true"`
	// 用户账号信息
	// example:
	//
	// 13222222222
	UserAccount *string `json:"user_account,omitempty" xml:"user_account,omitempty" require:"true"`
	// 用户名称
	// example:
	//
	// wangerxiao
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
}

func (s UserInfoParam) String() string {
	return tea.Prettify(s)
}

func (s UserInfoParam) GoString() string {
	return s.String()
}

func (s *UserInfoParam) SetPhone(v string) *UserInfoParam {
	s.Phone = &v
	return s
}

func (s *UserInfoParam) SetUserAccount(v string) *UserInfoParam {
	s.UserAccount = &v
	return s
}

func (s *UserInfoParam) SetUserName(v string) *UserInfoParam {
	s.UserName = &v
	return s
}

// 任务人群匹配返回列表
type TaskCrowdMatchResp struct {
	// 任务ID
	// example:
	//
	// NQYwDb1w5
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 人群匹配结果
	CrowdMatchResult *CrowdMatchResult `json:"crowd_match_result,omitempty" xml:"crowd_match_result,omitempty" require:"true"`
}

func (s TaskCrowdMatchResp) String() string {
	return tea.Prettify(s)
}

func (s TaskCrowdMatchResp) GoString() string {
	return s.String()
}

func (s *TaskCrowdMatchResp) SetTaskId(v string) *TaskCrowdMatchResp {
	s.TaskId = &v
	return s
}

func (s *TaskCrowdMatchResp) SetCrowdMatchResult(v *CrowdMatchResult) *TaskCrowdMatchResp {
	s.CrowdMatchResult = v
	return s
}

// 链详情
type MyChainInfo struct {
	// 链id
	// example:
	//
	// xxxid
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 授权租户id
	// example:
	//
	// tenantID
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true"`
}

func (s MyChainInfo) String() string {
	return tea.Prettify(s)
}

func (s MyChainInfo) GoString() string {
	return s.String()
}

func (s *MyChainInfo) SetBizId(v string) *MyChainInfo {
	s.BizId = &v
	return s
}

func (s *MyChainInfo) SetTenant(v string) *MyChainInfo {
	s.Tenant = &v
	return s
}

// 派生DID的具体参数
type DeriveDid struct {
	// 派生的子did
	// example:
	//
	// did:mychain:xxxx
	Childdid *string `json:"childdid,omitempty" xml:"childdid,omitempty" require:"true"`
	// 子did 的did doc
	// example:
	//
	// xxx
	Childdiddoc *string `json:"childdiddoc,omitempty" xml:"childdiddoc,omitempty" require:"true"`
	// 用户输入用于派生子did的派生码
	// example:
	//
	// asdfghj
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
}

func (s DeriveDid) String() string {
	return tea.Prettify(s)
}

func (s DeriveDid) GoString() string {
	return s.String()
}

func (s *DeriveDid) SetChilddid(v string) *DeriveDid {
	s.Childdid = &v
	return s
}

func (s *DeriveDid) SetChilddiddoc(v string) *DeriveDid {
	s.Childdiddoc = &v
	return s
}

func (s *DeriveDid) SetCode(v string) *DeriveDid {
	s.Code = &v
	return s
}

// 授权明细详情
type AuthorizationDetail struct {
	// 授权凭证ID
	// example:
	//
	// vc:private:0000:7bd647663cec087bc424941ad35cb588e96f38c2dcb512442410596c02e8ef681595560495530110
	AuthorityCertId *string `json:"authority_cert_id,omitempty" xml:"authority_cert_id,omitempty" require:"true"`
	// 授权ID
	// example:
	//
	// 8c777cf9a71b660233215b6337dca78d66e10f25feca50a2761c09df7d4d0506
	AuthorizationId *string `json:"authorization_id,omitempty" xml:"authorization_id,omitempty"`
	// 区块号
	// example:
	//
	// 1324
	BlockNum *int64 `json:"block_num,omitempty" xml:"block_num,omitempty" require:"true"`
	// 过期时间
	// example:
	//
	// 1592810480442
	Expire *int64 `json:"expire,omitempty" xml:"expire,omitempty"`
	// 授权时间
	// example:
	//
	// 1595574776000
	IssuanceTime *int64 `json:"issuance_time,omitempty" xml:"issuance_time,omitempty" require:"true"`
	// 授权人
	Issuer *Participant `json:"issuer,omitempty" xml:"issuer,omitempty" require:"true"`
	// 被授权人
	Subject *Participant `json:"subject,omitempty" xml:"subject,omitempty" require:"true"`
	// 哈希
	// example:
	//
	// d4dbde485203ed445b59fa7cf7976ecc56cf7494cca2d0185c1cac130463ac91
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 资产所有者
	Owner *Participant `json:"owner,omitempty" xml:"owner,omitempty" require:"true"`
}

func (s AuthorizationDetail) String() string {
	return tea.Prettify(s)
}

func (s AuthorizationDetail) GoString() string {
	return s.String()
}

func (s *AuthorizationDetail) SetAuthorityCertId(v string) *AuthorizationDetail {
	s.AuthorityCertId = &v
	return s
}

func (s *AuthorizationDetail) SetAuthorizationId(v string) *AuthorizationDetail {
	s.AuthorizationId = &v
	return s
}

func (s *AuthorizationDetail) SetBlockNum(v int64) *AuthorizationDetail {
	s.BlockNum = &v
	return s
}

func (s *AuthorizationDetail) SetExpire(v int64) *AuthorizationDetail {
	s.Expire = &v
	return s
}

func (s *AuthorizationDetail) SetIssuanceTime(v int64) *AuthorizationDetail {
	s.IssuanceTime = &v
	return s
}

func (s *AuthorizationDetail) SetIssuer(v *Participant) *AuthorizationDetail {
	s.Issuer = v
	return s
}

func (s *AuthorizationDetail) SetSubject(v *Participant) *AuthorizationDetail {
	s.Subject = v
	return s
}

func (s *AuthorizationDetail) SetTxHash(v string) *AuthorizationDetail {
	s.TxHash = &v
	return s
}

func (s *AuthorizationDetail) SetOwner(v *Participant) *AuthorizationDetail {
	s.Owner = v
	return s
}

// 阿里云CloudIde的配置
type ALiYunChainCloudIdeConfig struct {
	// bizid
	// example:
	//
	// bizid
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty"`
	// name
	// example:
	//
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// trial_account
	// example:
	//
	// trial_account
	TrialAccount *string `json:"trial_account,omitempty" xml:"trial_account,omitempty"`
	// trial_account_private_key
	// example:
	//
	// trial_account_private_key
	TrialAccountPrivateKey *string `json:"trial_account_private_key,omitempty" xml:"trial_account_private_key,omitempty"`
	// ant_chain_id
	// example:
	//
	// ant_chain_id
	AntChainId *string `json:"ant_chain_id,omitempty" xml:"ant_chain_id,omitempty"`
	// ant_chain_name
	// example:
	//
	// ant_chain_name
	AntChainName *string `json:"ant_chain_name,omitempty" xml:"ant_chain_name,omitempty"`
	// version
	// example:
	//
	// version
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
}

func (s ALiYunChainCloudIdeConfig) String() string {
	return tea.Prettify(s)
}

func (s ALiYunChainCloudIdeConfig) GoString() string {
	return s.String()
}

func (s *ALiYunChainCloudIdeConfig) SetBizid(v string) *ALiYunChainCloudIdeConfig {
	s.Bizid = &v
	return s
}

func (s *ALiYunChainCloudIdeConfig) SetName(v string) *ALiYunChainCloudIdeConfig {
	s.Name = &v
	return s
}

func (s *ALiYunChainCloudIdeConfig) SetTrialAccount(v string) *ALiYunChainCloudIdeConfig {
	s.TrialAccount = &v
	return s
}

func (s *ALiYunChainCloudIdeConfig) SetTrialAccountPrivateKey(v string) *ALiYunChainCloudIdeConfig {
	s.TrialAccountPrivateKey = &v
	return s
}

func (s *ALiYunChainCloudIdeConfig) SetAntChainId(v string) *ALiYunChainCloudIdeConfig {
	s.AntChainId = &v
	return s
}

func (s *ALiYunChainCloudIdeConfig) SetAntChainName(v string) *ALiYunChainCloudIdeConfig {
	s.AntChainName = &v
	return s
}

func (s *ALiYunChainCloudIdeConfig) SetVersion(v string) *ALiYunChainCloudIdeConfig {
	s.Version = &v
	return s
}

// 创建应用响应信息
type ApplicationCreateResp struct {
	// 应用标识
	// example:
	//
	// app20230725115808679d4f
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty"`
}

func (s ApplicationCreateResp) String() string {
	return tea.Prettify(s)
}

func (s ApplicationCreateResp) GoString() string {
	return s.String()
}

func (s *ApplicationCreateResp) SetApplicationId(v string) *ApplicationCreateResp {
	s.ApplicationId = &v
	return s
}

// 阿里云联盟返回结果
type ALiYunUnion struct {
	// 联盟内链的集合
	// example:
	//
	// 联盟内链的集合
	AntChains []*ALiYunAntChain `json:"ant_chains,omitempty" xml:"ant_chains,omitempty" type:"Repeated"`
	// 联盟信息
	// example:
	//
	// 联盟信息
	AntConsortiums []*ALiYunAntConsortium `json:"ant_consortiums,omitempty" xml:"ant_consortiums,omitempty" type:"Repeated"`
	// 联盟Id
	// example:
	//
	// 联盟Id
	ConsortiumId *string `json:"consortium_id,omitempty" xml:"consortium_id,omitempty"`
	// 联盟成员信息
	// example:
	//
	// 联盟成员信息
	Members []*ALiYunMember `json:"members,omitempty" xml:"members,omitempty" type:"Repeated"`
	// 阿里云分页属性
	// example:
	//
	// 阿里云分页属性
	Pagination *ALiYunPagination `json:"pagination,omitempty" xml:"pagination,omitempty"`
	// is_exist
	// example:
	//
	// true, false
	IsExist *bool `json:"is_exist,omitempty" xml:"is_exist,omitempty"`
}

func (s ALiYunUnion) String() string {
	return tea.Prettify(s)
}

func (s ALiYunUnion) GoString() string {
	return s.String()
}

func (s *ALiYunUnion) SetAntChains(v []*ALiYunAntChain) *ALiYunUnion {
	s.AntChains = v
	return s
}

func (s *ALiYunUnion) SetAntConsortiums(v []*ALiYunAntConsortium) *ALiYunUnion {
	s.AntConsortiums = v
	return s
}

func (s *ALiYunUnion) SetConsortiumId(v string) *ALiYunUnion {
	s.ConsortiumId = &v
	return s
}

func (s *ALiYunUnion) SetMembers(v []*ALiYunMember) *ALiYunUnion {
	s.Members = v
	return s
}

func (s *ALiYunUnion) SetPagination(v *ALiYunPagination) *ALiYunUnion {
	s.Pagination = v
	return s
}

func (s *ALiYunUnion) SetIsExist(v bool) *ALiYunUnion {
	s.IsExist = &v
	return s
}

// 数据授权服务公钥矩阵关系结构体
type PublicKeyRelation struct {
	// 公钥颁发者ID
	// example:
	//
	// did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
	IssuerId *string `json:"issuer_id,omitempty" xml:"issuer_id,omitempty" require:"true"`
	// 公钥接受者ID
	// example:
	//
	// did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
	RecipientId *string `json:"recipient_id,omitempty" xml:"recipient_id,omitempty" require:"true"`
}

func (s PublicKeyRelation) String() string {
	return tea.Prettify(s)
}

func (s PublicKeyRelation) GoString() string {
	return s.String()
}

func (s *PublicKeyRelation) SetIssuerId(v string) *PublicKeyRelation {
	s.IssuerId = &v
	return s
}

func (s *PublicKeyRelation) SetRecipientId(v string) *PublicKeyRelation {
	s.RecipientId = &v
	return s
}

// 获取Afts文件上传地址返回值，包含地址和token
type GetAftsUploadUrlResponse struct {
	// 11121312
	// example:
	//
	// 123
	MassToken *string `json:"mass_token,omitempty" xml:"mass_token,omitempty" require:"true"`
	// 上传文件地址
	// example:
	//
	// http://uploadExcamp.com
	UploadUrl *string `json:"upload_url,omitempty" xml:"upload_url,omitempty" require:"true"`
}

func (s GetAftsUploadUrlResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAftsUploadUrlResponse) GoString() string {
	return s.String()
}

func (s *GetAftsUploadUrlResponse) SetMassToken(v string) *GetAftsUploadUrlResponse {
	s.MassToken = &v
	return s
}

func (s *GetAftsUploadUrlResponse) SetUploadUrl(v string) *GetAftsUploadUrlResponse {
	s.UploadUrl = &v
	return s
}

// 合约类型
type ContractTypeResp struct {
	// 合约服务类型
	TypeList []*ContractTypeListResp `json:"type_list,omitempty" xml:"type_list,omitempty" type:"Repeated"`
}

func (s ContractTypeResp) String() string {
	return tea.Prettify(s)
}

func (s ContractTypeResp) GoString() string {
	return s.String()
}

func (s *ContractTypeResp) SetTypeList(v []*ContractTypeListResp) *ContractTypeResp {
	s.TypeList = v
	return s
}

// 物流金融平台运单轨迹信息
type LogisticLocation struct {
	// 结构化地址信息,规则遵循：国家、省份、城市、区县、城镇、乡村、街道、门牌号码、屋邨、大厦
	// example:
	//
	// 北京市朝阳区阜通东大街6号
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 行政区划代码
	// example:
	//
	// 110000
	CityCode *string `json:"city_code,omitempty" xml:"city_code,omitempty"`
	// 纬度
	// example:
	//
	// 39.916527
	Lat *string `json:"lat,omitempty" xml:"lat,omitempty" require:"true"`
	// 经度
	// example:
	//
	// 116.397128
	Lon *string `json:"lon,omitempty" xml:"lon,omitempty" require:"true"`
	// 轨迹时间戳
	// example:
	//
	// 1566221266000
	TrackTime *int64 `json:"track_time,omitempty" xml:"track_time,omitempty" require:"true"`
}

func (s LogisticLocation) String() string {
	return tea.Prettify(s)
}

func (s LogisticLocation) GoString() string {
	return s.String()
}

func (s *LogisticLocation) SetAddress(v string) *LogisticLocation {
	s.Address = &v
	return s
}

func (s *LogisticLocation) SetCityCode(v string) *LogisticLocation {
	s.CityCode = &v
	return s
}

func (s *LogisticLocation) SetLat(v string) *LogisticLocation {
	s.Lat = &v
	return s
}

func (s *LogisticLocation) SetLon(v string) *LogisticLocation {
	s.Lon = &v
	return s
}

func (s *LogisticLocation) SetTrackTime(v int64) *LogisticLocation {
	s.TrackTime = &v
	return s
}

// 活动基本信息
type ActivityBaseInfo struct {
	// 活动ID
	// example:
	//
	// 110000199001011234
	ActivityId *string `json:"activity_id,omitempty" xml:"activity_id,omitempty" require:"true"`
	// 活动名称
	// example:
	//
	// xx面馆活动
	ActivityName *string `json:"activity_name,omitempty" xml:"activity_name,omitempty"`
	// 活动状态
	// example:
	//
	// CAMP_CREATED
	ActivityStatus *string `json:"activity_status,omitempty" xml:"activity_status,omitempty"`
	// 平台类型
	// example:
	//
	// PLATFORM
	PlatformType *string `json:"platform_type,omitempty" xml:"platform_type,omitempty"`
	// 活动开始时间
	// example:
	//
	// yyyy-MM-dd HH:mm:ss
	PublishStartTime *string `json:"publish_start_time,omitempty" xml:"publish_start_time,omitempty"`
	// 活动结束时间
	// example:
	//
	// yyyy-MM-dd HH:mm:ss
	PublishEndTime *string `json:"publish_end_time,omitempty" xml:"publish_end_time,omitempty"`
}

func (s ActivityBaseInfo) String() string {
	return tea.Prettify(s)
}

func (s ActivityBaseInfo) GoString() string {
	return s.String()
}

func (s *ActivityBaseInfo) SetActivityId(v string) *ActivityBaseInfo {
	s.ActivityId = &v
	return s
}

func (s *ActivityBaseInfo) SetActivityName(v string) *ActivityBaseInfo {
	s.ActivityName = &v
	return s
}

func (s *ActivityBaseInfo) SetActivityStatus(v string) *ActivityBaseInfo {
	s.ActivityStatus = &v
	return s
}

func (s *ActivityBaseInfo) SetPlatformType(v string) *ActivityBaseInfo {
	s.PlatformType = &v
	return s
}

func (s *ActivityBaseInfo) SetPublishStartTime(v string) *ActivityBaseInfo {
	s.PublishStartTime = &v
	return s
}

func (s *ActivityBaseInfo) SetPublishEndTime(v string) *ActivityBaseInfo {
	s.PublishEndTime = &v
	return s
}

// 阿里云订单结果
type ALiYunOrderResult struct {
	// request_id
	// example:
	//
	// request_id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// data
	// example:
	//
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// success
	// example:
	//
	// true, false
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// code
	// example:
	//
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// message
	// example:
	//
	// message
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// synchro
	// example:
	//
	// true, false
	Synchro *bool `json:"synchro,omitempty" xml:"synchro,omitempty"`
}

func (s ALiYunOrderResult) String() string {
	return tea.Prettify(s)
}

func (s ALiYunOrderResult) GoString() string {
	return s.String()
}

func (s *ALiYunOrderResult) SetRequestId(v string) *ALiYunOrderResult {
	s.RequestId = &v
	return s
}

func (s *ALiYunOrderResult) SetData(v string) *ALiYunOrderResult {
	s.Data = &v
	return s
}

func (s *ALiYunOrderResult) SetSuccess(v bool) *ALiYunOrderResult {
	s.Success = &v
	return s
}

func (s *ALiYunOrderResult) SetCode(v string) *ALiYunOrderResult {
	s.Code = &v
	return s
}

func (s *ALiYunOrderResult) SetMessage(v string) *ALiYunOrderResult {
	s.Message = &v
	return s
}

func (s *ALiYunOrderResult) SetSynchro(v bool) *ALiYunOrderResult {
	s.Synchro = &v
	return s
}

// 批量查询商户下已映射的账户信息接口，返回的对象
type QueryMappingBatchResult struct {
	// 本次查询获取的账户信息
	Accounts []*AccountMappingInfo `json:"accounts,omitempty" xml:"accounts,omitempty" require:"true" type:"Repeated"`
	// 该商户下总共映射账户的数量
	// example:
	//
	// 200
	TotalNum *int64 `json:"total_num,omitempty" xml:"total_num,omitempty" require:"true"`
	// 该商户下账户信息的总页数
	// example:
	//
	// 10
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty" require:"true"`
}

func (s QueryMappingBatchResult) String() string {
	return tea.Prettify(s)
}

func (s QueryMappingBatchResult) GoString() string {
	return s.String()
}

func (s *QueryMappingBatchResult) SetAccounts(v []*AccountMappingInfo) *QueryMappingBatchResult {
	s.Accounts = v
	return s
}

func (s *QueryMappingBatchResult) SetTotalNum(v int64) *QueryMappingBatchResult {
	s.TotalNum = &v
	return s
}

func (s *QueryMappingBatchResult) SetTotalPage(v int64) *QueryMappingBatchResult {
	s.TotalPage = &v
	return s
}

// 阿里云区块链区块信息
type ALiYunChainBlock struct {
	// ant_chain_id
	// example:
	//
	// ant_chain_id
	AntChainId *string `json:"ant_chain_id,omitempty" xml:"ant_chain_id,omitempty"`
	// block_hash
	// example:
	//
	// block_hash
	BlockHash *string `json:"block_hash,omitempty" xml:"block_hash,omitempty"`
	// create_time
	// example:
	//
	// create_time
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// height
	// example:
	//
	// 123123
	Height *int64 `json:"height,omitempty" xml:"height,omitempty"`
	// previous_hash
	// example:
	//
	// previous_hash
	PreviousHash *string `json:"previous_hash,omitempty" xml:"previous_hash,omitempty"`
	// root_tx_hash
	// example:
	//
	// root_tx_hash
	RootTxHash *string `json:"root_tx_hash,omitempty" xml:"root_tx_hash,omitempty"`
	// transaction_size
	// example:
	//
	// 3
	TransactionSize *int64 `json:"transaction_size,omitempty" xml:"transaction_size,omitempty"`
	// trans_summary_list
	// example:
	//
	// trans_summary_list
	TransSummaryList []*ALiYunTransactionSummary `json:"trans_summary_list,omitempty" xml:"trans_summary_list,omitempty" type:"Repeated"`
	// Version
	// example:
	//
	// 10
	Version *int64 `json:"version,omitempty" xml:"version,omitempty"`
}

func (s ALiYunChainBlock) String() string {
	return tea.Prettify(s)
}

func (s ALiYunChainBlock) GoString() string {
	return s.String()
}

func (s *ALiYunChainBlock) SetAntChainId(v string) *ALiYunChainBlock {
	s.AntChainId = &v
	return s
}

func (s *ALiYunChainBlock) SetBlockHash(v string) *ALiYunChainBlock {
	s.BlockHash = &v
	return s
}

func (s *ALiYunChainBlock) SetCreateTime(v int64) *ALiYunChainBlock {
	s.CreateTime = &v
	return s
}

func (s *ALiYunChainBlock) SetHeight(v int64) *ALiYunChainBlock {
	s.Height = &v
	return s
}

func (s *ALiYunChainBlock) SetPreviousHash(v string) *ALiYunChainBlock {
	s.PreviousHash = &v
	return s
}

func (s *ALiYunChainBlock) SetRootTxHash(v string) *ALiYunChainBlock {
	s.RootTxHash = &v
	return s
}

func (s *ALiYunChainBlock) SetTransactionSize(v int64) *ALiYunChainBlock {
	s.TransactionSize = &v
	return s
}

func (s *ALiYunChainBlock) SetTransSummaryList(v []*ALiYunTransactionSummary) *ALiYunChainBlock {
	s.TransSummaryList = v
	return s
}

func (s *ALiYunChainBlock) SetVersion(v int64) *ALiYunChainBlock {
	s.Version = &v
	return s
}

// 应用授权列表查询
type ApplicationPageResp struct {
	// 应用授权列表
	List []*ApplicationPageListResp `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
	// 总数
	// example:
	//
	// 200
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s ApplicationPageResp) String() string {
	return tea.Prettify(s)
}

func (s ApplicationPageResp) GoString() string {
	return s.String()
}

func (s *ApplicationPageResp) SetList(v []*ApplicationPageListResp) *ApplicationPageResp {
	s.List = v
	return s
}

func (s *ApplicationPageResp) SetTotal(v int64) *ApplicationPageResp {
	s.Total = &v
	return s
}

// did中使用ZKP生成证明需要的信息
type DidZKPInfo struct {
	// 需要生成证明的路径
	// example:
	//
	// "$./path"
	Path *string `json:"path,omitempty" xml:"path,omitempty" require:"true"`
	// 生成ZKP证明的公共信息
	// example:
	//
	// json array string
	PublicInputs *string `json:"public_inputs,omitempty" xml:"public_inputs,omitempty" require:"true"`
	// zkp方法
	// example:
	//
	// more,less,contain
	ZkpType *string `json:"zkp_type,omitempty" xml:"zkp_type,omitempty" require:"true"`
}

func (s DidZKPInfo) String() string {
	return tea.Prettify(s)
}

func (s DidZKPInfo) GoString() string {
	return s.String()
}

func (s *DidZKPInfo) SetPath(v string) *DidZKPInfo {
	s.Path = &v
	return s
}

func (s *DidZKPInfo) SetPublicInputs(v string) *DidZKPInfo {
	s.PublicInputs = &v
	return s
}

func (s *DidZKPInfo) SetZkpType(v string) *DidZKPInfo {
	s.ZkpType = &v
	return s
}

// 阿里云账户列表信息
type ALiYunAccountList struct {
	// pagination
	// example:
	//
	// pagination
	Pagination *ALiYunPagination `json:"pagination,omitempty" xml:"pagination,omitempty"`
	// accounts
	// example:
	//
	// accounts
	Accounts []*ALiYunAccount `json:"accounts,omitempty" xml:"accounts,omitempty" type:"Repeated"`
	// 联盟管理员
	// example:
	//
	// true, false
	ConsortiumAdmin *bool `json:"consortium_admin,omitempty" xml:"consortium_admin,omitempty"`
}

func (s ALiYunAccountList) String() string {
	return tea.Prettify(s)
}

func (s ALiYunAccountList) GoString() string {
	return s.String()
}

func (s *ALiYunAccountList) SetPagination(v *ALiYunPagination) *ALiYunAccountList {
	s.Pagination = v
	return s
}

func (s *ALiYunAccountList) SetAccounts(v []*ALiYunAccount) *ALiYunAccountList {
	s.Accounts = v
	return s
}

func (s *ALiYunAccountList) SetConsortiumAdmin(v bool) *ALiYunAccountList {
	s.ConsortiumAdmin = &v
	return s
}

// 蚂蚁链用途申报结构体
type AntChainPurposeResponse struct {
	// 用户申报用途状态
	// example:
	//
	// 1
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 已申报的用途，比如供应链金融
	// example:
	//
	// 已申报的用途，比如供应链金融
	Purpose *string `json:"purpose,omitempty" xml:"purpose,omitempty"`
	// 申报时间
	// example:
	//
	// 21-1-1
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 简短说明用途
	// example:
	//
	// 简短说明用途
	ChainPurposeItem *string `json:"chain_purpose_item,omitempty" xml:"chain_purpose_item,omitempty"`
	// 用途详情
	// example:
	//
	// 用途详情
	ChainPurposeExtend *string `json:"chain_purpose_extend,omitempty" xml:"chain_purpose_extend,omitempty"`
	// 申请用途列表
	// example:
	//
	// []
	RecordList []*ChainPurpose `json:"record_list,omitempty" xml:"record_list,omitempty" type:"Repeated"`
}

func (s AntChainPurposeResponse) String() string {
	return tea.Prettify(s)
}

func (s AntChainPurposeResponse) GoString() string {
	return s.String()
}

func (s *AntChainPurposeResponse) SetStatus(v string) *AntChainPurposeResponse {
	s.Status = &v
	return s
}

func (s *AntChainPurposeResponse) SetPurpose(v string) *AntChainPurposeResponse {
	s.Purpose = &v
	return s
}

func (s *AntChainPurposeResponse) SetCreateTime(v string) *AntChainPurposeResponse {
	s.CreateTime = &v
	return s
}

func (s *AntChainPurposeResponse) SetChainPurposeItem(v string) *AntChainPurposeResponse {
	s.ChainPurposeItem = &v
	return s
}

func (s *AntChainPurposeResponse) SetChainPurposeExtend(v string) *AntChainPurposeResponse {
	s.ChainPurposeExtend = &v
	return s
}

func (s *AntChainPurposeResponse) SetRecordList(v []*ChainPurpose) *AntChainPurposeResponse {
	s.RecordList = v
	return s
}

// 阿里云交易收据
type ALiYunTransactionReceipt struct {
	// data
	// example:
	//
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// gas_used
	// example:
	//
	// gas_used
	GasUsed *string `json:"gas_used,omitempty" xml:"gas_used,omitempty"`
	// result
	// example:
	//
	// result
	Result *int64 `json:"result,omitempty" xml:"result,omitempty"`
	// logs
	// example:
	//
	// logs
	Logs []*string `json:"logs,omitempty" xml:"logs,omitempty" type:"Repeated"`
}

func (s ALiYunTransactionReceipt) String() string {
	return tea.Prettify(s)
}

func (s ALiYunTransactionReceipt) GoString() string {
	return s.String()
}

func (s *ALiYunTransactionReceipt) SetData(v string) *ALiYunTransactionReceipt {
	s.Data = &v
	return s
}

func (s *ALiYunTransactionReceipt) SetGasUsed(v string) *ALiYunTransactionReceipt {
	s.GasUsed = &v
	return s
}

func (s *ALiYunTransactionReceipt) SetResult(v int64) *ALiYunTransactionReceipt {
	s.Result = &v
	return s
}

func (s *ALiYunTransactionReceipt) SetLogs(v []*string) *ALiYunTransactionReceipt {
	s.Logs = v
	return s
}

// 实例进度
type ContractCreateProcessResp struct {
	// 当前进度信息
	// example:
	//
	// SERVICE_START
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 合约部署进度
	ProgressInfoList []*InstanceProgressInfo `json:"progress_info_list,omitempty" xml:"progress_info_list,omitempty" type:"Repeated"`
}

func (s ContractCreateProcessResp) String() string {
	return tea.Prettify(s)
}

func (s ContractCreateProcessResp) GoString() string {
	return s.String()
}

func (s *ContractCreateProcessResp) SetStatus(v string) *ContractCreateProcessResp {
	s.Status = &v
	return s
}

func (s *ContractCreateProcessResp) SetProgressInfoList(v []*InstanceProgressInfo) *ContractCreateProcessResp {
	s.ProgressInfoList = v
	return s
}

// 新建合约服务
type ContractCreateResp struct {
	// 合约标识
	// example:
	//
	// cme20230724104931af3a4d
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty"`
}

func (s ContractCreateResp) String() string {
	return tea.Prettify(s)
}

func (s ContractCreateResp) GoString() string {
	return s.String()
}

func (s *ContractCreateResp) SetServiceId(v string) *ContractCreateResp {
	s.ServiceId = &v
	return s
}

// 内部建链信息查询
type CreateBlockchainInfo struct {
	// 链id
	// example:
	//
	// 141a48c42f1e47b085a4502dab442553
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 链的状态
	// example:
	//
	// NOMAL
	BlockchainStatus *string `json:"blockchain_status,omitempty" xml:"blockchain_status,omitempty" require:"true"`
	// 链的类型
	// example:
	//
	// PROD、TEST
	BlockchainType *string `json:"blockchain_type,omitempty" xml:"blockchain_type,omitempty" require:"true"`
	// 链的名称
	// example:
	//
	// 区块链
	BlockchainName *string `json:"blockchain_name,omitempty" xml:"blockchain_name,omitempty" require:"true"`
	// 节点数量
	// example:
	//
	// 1
	BlockchanNodeNum *int64 `json:"blockchan_node_num,omitempty" xml:"blockchan_node_num,omitempty" require:"true"`
	// 创建时间
	// example:
	//
	// 1609731134000
	BlockchainCreateTime *int64 `json:"blockchain_create_time,omitempty" xml:"blockchain_create_time,omitempty" require:"true"`
}

func (s CreateBlockchainInfo) String() string {
	return tea.Prettify(s)
}

func (s CreateBlockchainInfo) GoString() string {
	return s.String()
}

func (s *CreateBlockchainInfo) SetBizid(v string) *CreateBlockchainInfo {
	s.Bizid = &v
	return s
}

func (s *CreateBlockchainInfo) SetBlockchainStatus(v string) *CreateBlockchainInfo {
	s.BlockchainStatus = &v
	return s
}

func (s *CreateBlockchainInfo) SetBlockchainType(v string) *CreateBlockchainInfo {
	s.BlockchainType = &v
	return s
}

func (s *CreateBlockchainInfo) SetBlockchainName(v string) *CreateBlockchainInfo {
	s.BlockchainName = &v
	return s
}

func (s *CreateBlockchainInfo) SetBlockchanNodeNum(v int64) *CreateBlockchainInfo {
	s.BlockchanNodeNum = &v
	return s
}

func (s *CreateBlockchainInfo) SetBlockchainCreateTime(v int64) *CreateBlockchainInfo {
	s.BlockchainCreateTime = &v
	return s
}

// VC分享的结果
type VcShareResult struct {
	// 目标分享的VC的id
	// example:
	//
	// vc:mychain:dec9725c55bc7ad28b97340230f211b2ad96a35f5131ce9f77c1bd7b67f919451572244785477124
	VcId *string `json:"vc_id,omitempty" xml:"vc_id,omitempty" require:"true"`
	// 分享给目标接受者的did
	// example:
	//
	// did:mychain:6d8f3ff4af91532eaa7fc477be6b68dea14ed3bcfd5755ccedced43f6c248214
	TargetDid *string `json:"target_did,omitempty" xml:"target_did,omitempty" require:"true"`
	// 分享链上VC数据的交易hash，可用于直连区块链查询交易内容时使用。
	// example:
	//
	// 388d0822df016aa66c954344e22c36ec89e4a4573ef0491220bd80c1fe3469cb
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 分享是否成功，true：成功，false：失败
	// example:
	//
	// true，false
	Status *bool `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 失败的对应原因信息
	// example:
	//
	// “失败原因”
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s VcShareResult) String() string {
	return tea.Prettify(s)
}

func (s VcShareResult) GoString() string {
	return s.String()
}

func (s *VcShareResult) SetVcId(v string) *VcShareResult {
	s.VcId = &v
	return s
}

func (s *VcShareResult) SetTargetDid(v string) *VcShareResult {
	s.TargetDid = &v
	return s
}

func (s *VcShareResult) SetTxHash(v string) *VcShareResult {
	s.TxHash = &v
	return s
}

func (s *VcShareResult) SetStatus(v bool) *VcShareResult {
	s.Status = &v
	return s
}

func (s *VcShareResult) SetMsg(v string) *VcShareResult {
	s.Msg = &v
	return s
}

// 合约加密字段
type ContractEncryptKeyItem struct {
	// 字段对应的id
	// example:
	//
	// keyId
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// 0:encrypt_text,
	// 1:encrypt_array_text,
	// 2:encrypt_int
	// 3:encrypt_array_int
	// example:
	//
	// 0
	Type *int64 `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 字段对应的数据
	// example:
	//
	// "value_1"
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s ContractEncryptKeyItem) String() string {
	return tea.Prettify(s)
}

func (s ContractEncryptKeyItem) GoString() string {
	return s.String()
}

func (s *ContractEncryptKeyItem) SetKey(v string) *ContractEncryptKeyItem {
	s.Key = &v
	return s
}

func (s *ContractEncryptKeyItem) SetType(v int64) *ContractEncryptKeyItem {
	s.Type = &v
	return s
}

func (s *ContractEncryptKeyItem) SetValue(v string) *ContractEncryptKeyItem {
	s.Value = &v
	return s
}

// did更新事件
type DidEvent struct {
	// 事件对应的合约方法
	// example:
	//
	// add
	Action *string `json:"action,omitempty" xml:"action,omitempty" require:"true"`
	// 对应did
	// example:
	//
	// did:mychain:XXXX
	Did *string `json:"did,omitempty" xml:"did,omitempty" require:"true"`
	// did对应doc
	// example:
	//
	// {}
	DidDoc *string `json:"did_doc,omitempty" xml:"did_doc,omitempty" require:"true"`
	// 本次事件的触发者
	// example:
	//
	// XXXXXXXXX
	From *string `json:"from,omitempty" xml:"from,omitempty" require:"true"`
	// 6500
	// example:
	//
	// 事件在区块的高度
	Height *int64 `json:"height,omitempty" xml:"height,omitempty" require:"true"`
	// 交易hash
	// example:
	//
	// xxxxxx
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 交易在区块中的index
	// example:
	//
	// 1
	TxIndex *int64 `json:"tx_index,omitempty" xml:"tx_index,omitempty" require:"true"`
}

func (s DidEvent) String() string {
	return tea.Prettify(s)
}

func (s DidEvent) GoString() string {
	return s.String()
}

func (s *DidEvent) SetAction(v string) *DidEvent {
	s.Action = &v
	return s
}

func (s *DidEvent) SetDid(v string) *DidEvent {
	s.Did = &v
	return s
}

func (s *DidEvent) SetDidDoc(v string) *DidEvent {
	s.DidDoc = &v
	return s
}

func (s *DidEvent) SetFrom(v string) *DidEvent {
	s.From = &v
	return s
}

func (s *DidEvent) SetHeight(v int64) *DidEvent {
	s.Height = &v
	return s
}

func (s *DidEvent) SetTxHash(v string) *DidEvent {
	s.TxHash = &v
	return s
}

func (s *DidEvent) SetTxIndex(v int64) *DidEvent {
	s.TxIndex = &v
	return s
}

// Vc可信传输实际参数
type VcTransmitPayload struct {
	// 目标did相关信息列表
	TargetVerifier []*VcTransmitTargetStruct `json:"target_verifier,omitempty" xml:"target_verifier,omitempty" require:"true" type:"Repeated"`
	// 要传输的vc_id
	// example:
	//
	// vc:mychain:xxxxx
	VcId *string `json:"vc_id,omitempty" xml:"vc_id,omitempty" require:"true"`
	// vc原文，如果vc原文出现在传输接口，那么VC仓库不会从本地查找，而是直接将传输的VC上链
	// example:
	//
	// json string
	VcContent *string `json:"vc_content,omitempty" xml:"vc_content,omitempty"`
}

func (s VcTransmitPayload) String() string {
	return tea.Prettify(s)
}

func (s VcTransmitPayload) GoString() string {
	return s.String()
}

func (s *VcTransmitPayload) SetTargetVerifier(v []*VcTransmitTargetStruct) *VcTransmitPayload {
	s.TargetVerifier = v
	return s
}

func (s *VcTransmitPayload) SetVcId(v string) *VcTransmitPayload {
	s.VcId = &v
	return s
}

func (s *VcTransmitPayload) SetVcContent(v string) *VcTransmitPayload {
	s.VcContent = &v
	return s
}

// 阿里云合约内容
type ALiYunChainContractContent struct {
	// content
	// example:
	//
	// content
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// content_id
	// example:
	//
	// content_id
	ContentId *string `json:"content_id,omitempty" xml:"content_id,omitempty"`
	// content_name
	// example:
	//
	// content_name
	ContentName *string `json:"content_name,omitempty" xml:"content_name,omitempty"`
	// create_time
	// example:
	//
	// create_time
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// is_directory
	// example:
	//
	// true
	IsDirectory *bool `json:"is_directory,omitempty" xml:"is_directory,omitempty"`
	// parent_content_id
	// example:
	//
	// parent_content_id
	ParentContentId *string `json:"parent_content_id,omitempty" xml:"parent_content_id,omitempty"`
	// project_id
	// example:
	//
	// project_id
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty"`
	// update_time
	// example:
	//
	// update_time
	UpdateTime *int64 `json:"update_time,omitempty" xml:"update_time,omitempty"`
}

func (s ALiYunChainContractContent) String() string {
	return tea.Prettify(s)
}

func (s ALiYunChainContractContent) GoString() string {
	return s.String()
}

func (s *ALiYunChainContractContent) SetContent(v string) *ALiYunChainContractContent {
	s.Content = &v
	return s
}

func (s *ALiYunChainContractContent) SetContentId(v string) *ALiYunChainContractContent {
	s.ContentId = &v
	return s
}

func (s *ALiYunChainContractContent) SetContentName(v string) *ALiYunChainContractContent {
	s.ContentName = &v
	return s
}

func (s *ALiYunChainContractContent) SetCreateTime(v int64) *ALiYunChainContractContent {
	s.CreateTime = &v
	return s
}

func (s *ALiYunChainContractContent) SetIsDirectory(v bool) *ALiYunChainContractContent {
	s.IsDirectory = &v
	return s
}

func (s *ALiYunChainContractContent) SetParentContentId(v string) *ALiYunChainContractContent {
	s.ParentContentId = &v
	return s
}

func (s *ALiYunChainContractContent) SetProjectId(v string) *ALiYunChainContractContent {
	s.ProjectId = &v
	return s
}

func (s *ALiYunChainContractContent) SetUpdateTime(v int64) *ALiYunChainContractContent {
	s.UpdateTime = &v
	return s
}

// 描述结算信息
type SettleInfo struct {
	// 结算详细信息
	SettleDetailInfos []*SettleDetailInfo `json:"settle_detail_infos,omitempty" xml:"settle_detail_infos,omitempty" require:"true" type:"Repeated"`
}

func (s SettleInfo) String() string {
	return tea.Prettify(s)
}

func (s SettleInfo) GoString() string {
	return s.String()
}

func (s *SettleInfo) SetSettleDetailInfos(v []*SettleDetailInfo) *SettleInfo {
	s.SettleDetailInfos = v
	return s
}

// 结果
type Result struct {
	// 联盟id
	// example:
	//
	// 00001
	ConsortiumId *string `json:"consortium_id,omitempty" xml:"consortium_id,omitempty" require:"true"`
}

func (s Result) String() string {
	return tea.Prettify(s)
}

func (s Result) GoString() string {
	return s.String()
}

func (s *Result) SetConsortiumId(v string) *Result {
	s.ConsortiumId = &v
	return s
}

// 更新did doc中的service信息
type UpdateDidService struct {
	// 待更新did之前的版本号
	// example:
	//
	// 2
	PreviousVersion *int64 `json:"previous_version,omitempty" xml:"previous_version,omitempty" require:"true"`
	// did doc中的service id
	// example:
	//
	// service#1
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 服务信息
	ServiceInfo *DidServiceInfo `json:"service_info,omitempty" xml:"service_info,omitempty" require:"true"`
	// 服务类型
	// example:
	//
	// auth
	ServiceType *string `json:"service_type,omitempty" xml:"service_type,omitempty" require:"true"`
}

func (s UpdateDidService) String() string {
	return tea.Prettify(s)
}

func (s UpdateDidService) GoString() string {
	return s.String()
}

func (s *UpdateDidService) SetPreviousVersion(v int64) *UpdateDidService {
	s.PreviousVersion = &v
	return s
}

func (s *UpdateDidService) SetServiceId(v string) *UpdateDidService {
	s.ServiceId = &v
	return s
}

func (s *UpdateDidService) SetServiceInfo(v *DidServiceInfo) *UpdateDidService {
	s.ServiceInfo = v
	return s
}

func (s *UpdateDidService) SetServiceType(v string) *UpdateDidService {
	s.ServiceType = &v
	return s
}

// 包含业务组的用户信息
type AccountInfoWithBiz struct {
	// 注册地址
	// example:
	//
	// 北京
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 业务场景code
	// example:
	//
	// 020301
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty" require:"true"`
	// 业务名称
	// example:
	//
	// test1
	BizName *string `json:"biz_name,omitempty" xml:"biz_name,omitempty" require:"true"`
	// 业务类型，预留
	// example:
	//
	// test1
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 用户创建时间，格式yyyy-MM-dd HH:mm:ss
	// example:
	//
	// 2019-06-12 00:00:00
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 用户注销时间，格式yyyy-MM-dd HH:mm:ss
	// example:
	//
	// 2019-06-13 00:00:00
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 扩展字段，使用json格式
	// example:
	//
	// {"status":1}
	Extension *string `json:"extension,omitempty" xml:"extension,omitempty" maxLength:"200"`
	// 业务组code
	// example:
	//
	// 0101
	GroupCode *string `json:"group_code,omitempty" xml:"group_code,omitempty" require:"true"`
	// 业务组名称
	// example:
	//
	// baas平台
	GroupName *string `json:"group_name,omitempty" xml:"group_name,omitempty" require:"true"`
	// 唯一标示类型，0:统一信用代码,1:开票机构代码,2:身份证号
	// example:
	//
	// 0
	IdentityType *int64 `json:"identity_type,omitempty" xml:"identity_type,omitempty"`
	// 唯一标示码
	// example:
	//
	// 370211198106130000
	IdentityValue *string `json:"identity_value,omitempty" xml:"identity_value,omitempty"`
	// 用户标签
	// example:
	//
	// <kpi>0</kpi>
	Label *string `json:"label,omitempty" xml:"label,omitempty"`
	// 间连用户的上层直连用户名称
	// example:
	//
	// 某某公司
	Parent *string `json:"parent,omitempty" xml:"parent,omitempty"`
	// 统计时间，时间格式：yyyy-MM-dd HH:mm:ss
	// example:
	//
	// 2019-06-12 00:00:00
	StatDate *string `json:"stat_date,omitempty" xml:"stat_date,omitempty"`
	// 用户id
	// example:
	//
	// bjc1111
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户或企业名称
	// example:
	//
	// 北京公司A
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
	// 用户类型：direct直连，indirect间连，partner合作伙伴
	// example:
	//
	// direct
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty"`
}

func (s AccountInfoWithBiz) String() string {
	return tea.Prettify(s)
}

func (s AccountInfoWithBiz) GoString() string {
	return s.String()
}

func (s *AccountInfoWithBiz) SetAddress(v string) *AccountInfoWithBiz {
	s.Address = &v
	return s
}

func (s *AccountInfoWithBiz) SetBizCode(v string) *AccountInfoWithBiz {
	s.BizCode = &v
	return s
}

func (s *AccountInfoWithBiz) SetBizName(v string) *AccountInfoWithBiz {
	s.BizName = &v
	return s
}

func (s *AccountInfoWithBiz) SetBizType(v string) *AccountInfoWithBiz {
	s.BizType = &v
	return s
}

func (s *AccountInfoWithBiz) SetCreateTime(v string) *AccountInfoWithBiz {
	s.CreateTime = &v
	return s
}

func (s *AccountInfoWithBiz) SetEndTime(v string) *AccountInfoWithBiz {
	s.EndTime = &v
	return s
}

func (s *AccountInfoWithBiz) SetExtension(v string) *AccountInfoWithBiz {
	s.Extension = &v
	return s
}

func (s *AccountInfoWithBiz) SetGroupCode(v string) *AccountInfoWithBiz {
	s.GroupCode = &v
	return s
}

func (s *AccountInfoWithBiz) SetGroupName(v string) *AccountInfoWithBiz {
	s.GroupName = &v
	return s
}

func (s *AccountInfoWithBiz) SetIdentityType(v int64) *AccountInfoWithBiz {
	s.IdentityType = &v
	return s
}

func (s *AccountInfoWithBiz) SetIdentityValue(v string) *AccountInfoWithBiz {
	s.IdentityValue = &v
	return s
}

func (s *AccountInfoWithBiz) SetLabel(v string) *AccountInfoWithBiz {
	s.Label = &v
	return s
}

func (s *AccountInfoWithBiz) SetParent(v string) *AccountInfoWithBiz {
	s.Parent = &v
	return s
}

func (s *AccountInfoWithBiz) SetStatDate(v string) *AccountInfoWithBiz {
	s.StatDate = &v
	return s
}

func (s *AccountInfoWithBiz) SetUserId(v string) *AccountInfoWithBiz {
	s.UserId = &v
	return s
}

func (s *AccountInfoWithBiz) SetUserName(v string) *AccountInfoWithBiz {
	s.UserName = &v
	return s
}

func (s *AccountInfoWithBiz) SetUserType(v string) *AccountInfoWithBiz {
	s.UserType = &v
	return s
}

// 基础车辆信息
type BasicCarInfo struct {
	// 车牌号码
	// example:
	//
	// 京Axxxxx
	LicenseNo *string `json:"license_no,omitempty" xml:"license_no,omitempty" require:"true"`
	// 车架号
	// example:
	//
	// xxxxx
	Vin *string `json:"vin,omitempty" xml:"vin,omitempty" require:"true"`
	// 发动机号
	// example:
	//
	// xxxxx
	EngineNo *string `json:"engine_no,omitempty" xml:"engine_no,omitempty" require:"true"`
	// 初登日期
	// example:
	//
	// 2021-12-21
	RegisterDate *string `json:"register_date,omitempty" xml:"register_date,omitempty" require:"true"`
	// 车辆型号
	// example:
	//
	// xxxxx
	ModelCode *string `json:"model_code,omitempty" xml:"model_code,omitempty" require:"true"`
	// 营运性质
	// example:
	//
	// xxxxx
	UseNatureCode *string `json:"use_nature_code,omitempty" xml:"use_nature_code,omitempty" require:"true"`
	// 是否抵押
	// example:
	//
	// true, false
	Mortgage *bool `json:"mortgage,omitempty" xml:"mortgage,omitempty"`
}

func (s BasicCarInfo) String() string {
	return tea.Prettify(s)
}

func (s BasicCarInfo) GoString() string {
	return s.String()
}

func (s *BasicCarInfo) SetLicenseNo(v string) *BasicCarInfo {
	s.LicenseNo = &v
	return s
}

func (s *BasicCarInfo) SetVin(v string) *BasicCarInfo {
	s.Vin = &v
	return s
}

func (s *BasicCarInfo) SetEngineNo(v string) *BasicCarInfo {
	s.EngineNo = &v
	return s
}

func (s *BasicCarInfo) SetRegisterDate(v string) *BasicCarInfo {
	s.RegisterDate = &v
	return s
}

func (s *BasicCarInfo) SetModelCode(v string) *BasicCarInfo {
	s.ModelCode = &v
	return s
}

func (s *BasicCarInfo) SetUseNatureCode(v string) *BasicCarInfo {
	s.UseNatureCode = &v
	return s
}

func (s *BasicCarInfo) SetMortgage(v bool) *BasicCarInfo {
	s.Mortgage = &v
	return s
}

// 商户行业资质信息
type IndustryQualificationInfo struct {
	// 商户行业资质类型
	// example:
	//
	// 323
	IndustryQualificationType *string `json:"industry_qualification_type,omitempty" xml:"industry_qualification_type,omitempty" require:"true"`
	// 商户行业资质图片
	// example:
	//
	// 20200219192259536bda6664ed60f815
	IndustryQualificationImage *string `json:"industry_qualification_image,omitempty" xml:"industry_qualification_image,omitempty" require:"true"`
}

func (s IndustryQualificationInfo) String() string {
	return tea.Prettify(s)
}

func (s IndustryQualificationInfo) GoString() string {
	return s.String()
}

func (s *IndustryQualificationInfo) SetIndustryQualificationType(v string) *IndustryQualificationInfo {
	s.IndustryQualificationType = &v
	return s
}

func (s *IndustryQualificationInfo) SetIndustryQualificationImage(v string) *IndustryQualificationInfo {
	s.IndustryQualificationImage = &v
	return s
}

// 物流金融信用凭证信息
type IssueInfo struct {
	// 信用流转批次号
	// example:
	//
	// 001abc
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 合同编号
	// example:
	//
	// 8888888
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty"`
	// 信用凭证额度
	// example:
	//
	// 1898.98
	CreditLimit *string `json:"credit_limit,omitempty" xml:"credit_limit,omitempty"`
	// 失败原因信息
	// example:
	//
	// 发行额度不足
	ErrMsg *string `json:"err_msg,omitempty" xml:"err_msg,omitempty"`
	// 信用凭证到期时间
	// example:
	//
	// 20191212
	ExpireDate *string `json:"expire_date,omitempty" xml:"expire_date,omitempty"`
	// 信用凭证发起时间
	// example:
	//
	// 20190101
	IssueDate *string `json:"issue_date,omitempty" xml:"issue_date,omitempty"`
	// 信用流转凭证
	// example:
	//
	// 002abc
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty"`
	// 发行结果状态
	// -1:发行失败状态， 0:未完成状态， 1:已发行状态
	// example:
	//
	// 1
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
	// 发行信用流转的运单号
	// example:
	//
	// 003abc
	WaybillId *string `json:"waybill_id,omitempty" xml:"waybill_id,omitempty"`
}

func (s IssueInfo) String() string {
	return tea.Prettify(s)
}

func (s IssueInfo) GoString() string {
	return s.String()
}

func (s *IssueInfo) SetBatchId(v string) *IssueInfo {
	s.BatchId = &v
	return s
}

func (s *IssueInfo) SetContractId(v string) *IssueInfo {
	s.ContractId = &v
	return s
}

func (s *IssueInfo) SetCreditLimit(v string) *IssueInfo {
	s.CreditLimit = &v
	return s
}

func (s *IssueInfo) SetErrMsg(v string) *IssueInfo {
	s.ErrMsg = &v
	return s
}

func (s *IssueInfo) SetExpireDate(v string) *IssueInfo {
	s.ExpireDate = &v
	return s
}

func (s *IssueInfo) SetIssueDate(v string) *IssueInfo {
	s.IssueDate = &v
	return s
}

func (s *IssueInfo) SetIssueId(v string) *IssueInfo {
	s.IssueId = &v
	return s
}

func (s *IssueInfo) SetStatus(v int64) *IssueInfo {
	s.Status = &v
	return s
}

func (s *IssueInfo) SetWaybillId(v string) *IssueInfo {
	s.WaybillId = &v
	return s
}

// 查看应用秘钥响应信息
type ApplicationGetSkResp struct {
	// 应用秘钥
	// example:
	//
	// ******
	Sk *string `json:"sk,omitempty" xml:"sk,omitempty"`
}

func (s ApplicationGetSkResp) String() string {
	return tea.Prettify(s)
}

func (s ApplicationGetSkResp) GoString() string {
	return s.String()
}

func (s *ApplicationGetSkResp) SetSk(v string) *ApplicationGetSkResp {
	s.Sk = &v
	return s
}

// 分页失败的展示日志（过滤器：待处理、成功、已忽略）
type CommonResponsePageableStructBody struct {
	// 页面规格
	// example:
	//
	// 10
	PageSize *string `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 当前页码
	// example:
	//
	// 10
	Current *string `json:"current,omitempty" xml:"current,omitempty"`
	// 总条数
	// example:
	//
	// total
	Total *string `json:"total,omitempty" xml:"total,omitempty"`
	// 失败日志数组
	// example:
	//
	// {}
	List []*TriggerLogDTOStructBody `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
}

func (s CommonResponsePageableStructBody) String() string {
	return tea.Prettify(s)
}

func (s CommonResponsePageableStructBody) GoString() string {
	return s.String()
}

func (s *CommonResponsePageableStructBody) SetPageSize(v string) *CommonResponsePageableStructBody {
	s.PageSize = &v
	return s
}

func (s *CommonResponsePageableStructBody) SetCurrent(v string) *CommonResponsePageableStructBody {
	s.Current = &v
	return s
}

func (s *CommonResponsePageableStructBody) SetTotal(v string) *CommonResponsePageableStructBody {
	s.Total = &v
	return s
}

func (s *CommonResponsePageableStructBody) SetList(v []*TriggerLogDTOStructBody) *CommonResponsePageableStructBody {
	s.List = v
	return s
}

// 阿里云售卖区信息
type ALiYunChainRegion struct {
	// region_id
	// example:
	//
	// region_id
	RegionId *string `json:"region_id,omitempty" xml:"region_id,omitempty"`
	// region_name
	// example:
	//
	// region_name
	RegionName *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
}

func (s ALiYunChainRegion) String() string {
	return tea.Prettify(s)
}

func (s ALiYunChainRegion) GoString() string {
	return s.String()
}

func (s *ALiYunChainRegion) SetRegionId(v string) *ALiYunChainRegion {
	s.RegionId = &v
	return s
}

func (s *ALiYunChainRegion) SetRegionName(v string) *ALiYunChainRegion {
	s.RegionName = &v
	return s
}

// 阿里云售卖联盟信息
type ALiYunBuyUnion struct {
	// consortium_name
	// example:
	//
	// consortium_name
	ConsortiumName *string `json:"consortium_name,omitempty" xml:"consortium_name,omitempty"`
	// consortium_id
	// example:
	//
	// consortium_id
	ConsortiumId *string `json:"consortium_id,omitempty" xml:"consortium_id,omitempty"`
}

func (s ALiYunBuyUnion) String() string {
	return tea.Prettify(s)
}

func (s ALiYunBuyUnion) GoString() string {
	return s.String()
}

func (s *ALiYunBuyUnion) SetConsortiumName(v string) *ALiYunBuyUnion {
	s.ConsortiumName = &v
	return s
}

func (s *ALiYunBuyUnion) SetConsortiumId(v string) *ALiYunBuyUnion {
	s.ConsortiumId = &v
	return s
}

// 分享可验证声明时的核心内容
type VcShareStruct struct {
	// 分享的目标VC的id
	// example:
	//
	// 未定义
	VcId *string `json:"vc_id,omitempty" xml:"vc_id,omitempty" require:"true"`
	// 目标的VC持有者的did
	// example:
	//
	// did:mychain:6d8f3ff4af91532eaa7fc477be6b68dea14ed3bcfd5755ccedced43f6c248214
	OwnerDid *string `json:"owner_did,omitempty" xml:"owner_did,omitempty" require:"true"`
	// 在支持声明的claim字段级别分享能力时使用，可以指定哪些字段隐藏，哪些字段分享。示例中标记为”1“的是隐藏，”0“的是分享明文。
	// example:
	//
	// { "Item1": "1", "学历信息": [ { "学历": "0", "毕业院校": "0", "专业": "0", "Item2":"1", }, "1", ], "Item3":"1" }
	Index *string `json:"index,omitempty" xml:"index,omitempty"`
	// 非托管模式下owner_did的签名，作为授权凭证
	// example:
	//
	// jN1LVH5YhbTvgrdeBqlImPJBWDzVdNyyHZ1n9A0pSOQKnt11jWM5Qn707+wEa7bc8TOd1WvRItTe
	//
	// mx4xYCqX0gE=
	//
	//
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty"`
}

func (s VcShareStruct) String() string {
	return tea.Prettify(s)
}

func (s VcShareStruct) GoString() string {
	return s.String()
}

func (s *VcShareStruct) SetVcId(v string) *VcShareStruct {
	s.VcId = &v
	return s
}

func (s *VcShareStruct) SetOwnerDid(v string) *VcShareStruct {
	s.OwnerDid = &v
	return s
}

func (s *VcShareStruct) SetIndex(v string) *VcShareStruct {
	s.Index = &v
	return s
}

func (s *VcShareStruct) SetSignature(v string) *VcShareStruct {
	s.Signature = &v
	return s
}

// 小程序浏览器授权类型
type MiniAppBrowserAuthType struct {
	// 授权类型
	// example:
	//
	// DISABLED, ALL_USER, SPECIFIC_USER
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
}

func (s MiniAppBrowserAuthType) String() string {
	return tea.Prettify(s)
}

func (s MiniAppBrowserAuthType) GoString() string {
	return s.String()
}

func (s *MiniAppBrowserAuthType) SetAuthType(v string) *MiniAppBrowserAuthType {
	s.AuthType = &v
	return s
}

// 链上交易信息
type TxInfo struct {
	// 上链结果
	// example:
	//
	// SUCCESS
	TxReceiptResult *string `json:"tx_receipt_result,omitempty" xml:"tx_receipt_result,omitempty" require:"true"`
	// 区块链id
	// example:
	//
	// c4b83bb3080a4a19957af5b0b4430542
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 交易hash
	// example:
	//
	// aeedaaf3abb4a1ce86de538ec42759626689ea59fdfba4a10a0ef1550aa10d3d
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 交易类型
	// example:
	//
	// TX_DEPOSIT_DATA
	TxType *string `json:"tx_type,omitempty" xml:"tx_type,omitempty" require:"true"`
	// 时间戳
	// example:
	//
	// 1638796927336
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty" require:"true"`
	// 区块高度
	// example:
	//
	// 68772416
	BlockNumber *string `json:"block_number,omitempty" xml:"block_number,omitempty" require:"true"`
	// 交易随机数Nonce
	// example:
	//
	// 505563366098488426
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty" require:"true"`
	// 发起地址
	// example:
	//
	// 070e88eb167a1dc5156563c5b0dd2c9e89fe5cff50e78c8534c33511d13d3304
	From *string `json:"from,omitempty" xml:"from,omitempty" require:"true"`
	// 目标地址
	// example:
	//
	// 070e88eb167a1dc5156563c5b0dd2c9e89fe5cff50e78c8534c33511d13d3304
	To *string `json:"to,omitempty" xml:"to,omitempty" require:"true"`
	// 签名
	// example:
	//
	// 9357e09984d9ba31f0f6070a8276b0d39ffeb8c40aaa7a6873cc69a04ea4babf7295d642aeb945b5eca6624751e11e41885d918deae554abd8d732f95e31d44f00
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
}

func (s TxInfo) String() string {
	return tea.Prettify(s)
}

func (s TxInfo) GoString() string {
	return s.String()
}

func (s *TxInfo) SetTxReceiptResult(v string) *TxInfo {
	s.TxReceiptResult = &v
	return s
}

func (s *TxInfo) SetBizId(v string) *TxInfo {
	s.BizId = &v
	return s
}

func (s *TxInfo) SetTxHash(v string) *TxInfo {
	s.TxHash = &v
	return s
}

func (s *TxInfo) SetTxType(v string) *TxInfo {
	s.TxType = &v
	return s
}

func (s *TxInfo) SetTimestamp(v int64) *TxInfo {
	s.Timestamp = &v
	return s
}

func (s *TxInfo) SetBlockNumber(v string) *TxInfo {
	s.BlockNumber = &v
	return s
}

func (s *TxInfo) SetNonce(v string) *TxInfo {
	s.Nonce = &v
	return s
}

func (s *TxInfo) SetFrom(v string) *TxInfo {
	s.From = &v
	return s
}

func (s *TxInfo) SetTo(v string) *TxInfo {
	s.To = &v
	return s
}

func (s *TxInfo) SetSignature(v string) *TxInfo {
	s.Signature = &v
	return s
}

// 服务发现结果
type ServiceDiscoveryResult struct {
	// 提供该服务能力的did
	// example:
	//
	// did:mychain:...
	Did *string `json:"did,omitempty" xml:"did,omitempty" require:"true"`
	// 提供该服务能力的endpoint信息
	Services []*DidDocServicesInfo `json:"services,omitempty" xml:"services,omitempty" require:"true" type:"Repeated"`
}

func (s ServiceDiscoveryResult) String() string {
	return tea.Prettify(s)
}

func (s ServiceDiscoveryResult) GoString() string {
	return s.String()
}

func (s *ServiceDiscoveryResult) SetDid(v string) *ServiceDiscoveryResult {
	s.Did = &v
	return s
}

func (s *ServiceDiscoveryResult) SetServices(v []*DidDocServicesInfo) *ServiceDiscoveryResult {
	s.Services = v
	return s
}

// 蚂蚁链交易汇总信息
type BlockchainBrowserTransactionStatistic struct {
	// 蚂蚁链id
	// example:
	//
	// 27ce375122ef483691488395808e009e
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 开始时间
	// example:
	//
	// 1604480401000
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty" require:"true"`
	// 时间点
	// example:
	//
	// 2020-10-28
	DateTime *string `json:"date_time,omitempty" xml:"date_time,omitempty" require:"true"`
	// 统计时间内最新块高度
	// example:
	//
	// 6372915
	LastSumBlockHeight *int64 `json:"last_sum_block_height,omitempty" xml:"last_sum_block_height,omitempty" require:"true"`
	// 统计周期内交易的数量
	// example:
	//
	// 2750038
	TransCount *int64 `json:"trans_count,omitempty" xml:"trans_count,omitempty" require:"true"`
}

func (s BlockchainBrowserTransactionStatistic) String() string {
	return tea.Prettify(s)
}

func (s BlockchainBrowserTransactionStatistic) GoString() string {
	return s.String()
}

func (s *BlockchainBrowserTransactionStatistic) SetBizid(v string) *BlockchainBrowserTransactionStatistic {
	s.Bizid = &v
	return s
}

func (s *BlockchainBrowserTransactionStatistic) SetCreateTime(v int64) *BlockchainBrowserTransactionStatistic {
	s.CreateTime = &v
	return s
}

func (s *BlockchainBrowserTransactionStatistic) SetDateTime(v string) *BlockchainBrowserTransactionStatistic {
	s.DateTime = &v
	return s
}

func (s *BlockchainBrowserTransactionStatistic) SetLastSumBlockHeight(v int64) *BlockchainBrowserTransactionStatistic {
	s.LastSumBlockHeight = &v
	return s
}

func (s *BlockchainBrowserTransactionStatistic) SetTransCount(v int64) *BlockchainBrowserTransactionStatistic {
	s.TransCount = &v
	return s
}

// 阿里云区块链Rest信息
type ALiYunChainRest struct {
	// access_id
	// example:
	//
	// access_id
	AccessId *string `json:"access_id,omitempty" xml:"access_id,omitempty"`
	// create_time
	// example:
	//
	// 123123123
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// rest
	// example:
	//
	// rest
	Rest *string `json:"rest,omitempty" xml:"rest,omitempty"`
	// update_time
	// example:
	//
	// 123123123
	UpdateTime *int64 `json:"update_time,omitempty" xml:"update_time,omitempty"`
	// REST开通结果
	// example:
	//
	// OK
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s ALiYunChainRest) String() string {
	return tea.Prettify(s)
}

func (s ALiYunChainRest) GoString() string {
	return s.String()
}

func (s *ALiYunChainRest) SetAccessId(v string) *ALiYunChainRest {
	s.AccessId = &v
	return s
}

func (s *ALiYunChainRest) SetCreateTime(v int64) *ALiYunChainRest {
	s.CreateTime = &v
	return s
}

func (s *ALiYunChainRest) SetRest(v string) *ALiYunChainRest {
	s.Rest = &v
	return s
}

func (s *ALiYunChainRest) SetUpdateTime(v int64) *ALiYunChainRest {
	s.UpdateTime = &v
	return s
}

func (s *ALiYunChainRest) SetResult(v string) *ALiYunChainRest {
	s.Result = &v
	return s
}

// 通过controller注册用户
type VcControllerAddUserRegisterPayload struct {
	// 注册用户did
	// example:
	//
	// did:mychain:xxxxx
	Did *string `json:"did,omitempty" xml:"did,omitempty" require:"true"`
	// 用户did对应的授权公钥
	// example:
	//
	// xxxxxx
	PublicKey *string `json:"public_key,omitempty" xml:"public_key,omitempty" require:"true"`
	// 业务区块连的bizid
	// example:
	//
	// xxx
	VcChannel *string `json:"vc_channel,omitempty" xml:"vc_channel,omitempty" maxLength:"32" minLength:"8"`
}

func (s VcControllerAddUserRegisterPayload) String() string {
	return tea.Prettify(s)
}

func (s VcControllerAddUserRegisterPayload) GoString() string {
	return s.String()
}

func (s *VcControllerAddUserRegisterPayload) SetDid(v string) *VcControllerAddUserRegisterPayload {
	s.Did = &v
	return s
}

func (s *VcControllerAddUserRegisterPayload) SetPublicKey(v string) *VcControllerAddUserRegisterPayload {
	s.PublicKey = &v
	return s
}

func (s *VcControllerAddUserRegisterPayload) SetVcChannel(v string) *VcControllerAddUserRegisterPayload {
	s.VcChannel = &v
	return s
}

// 账户信息
type AccountInfo struct {
	// 版通数量
	// example:
	//
	// 1000
	EpAmount *int64 `json:"ep_amount,omitempty" xml:"ep_amount,omitempty" require:"true"`
	// 版通代码
	// example:
	//
	// 000111
	EpCode *string `json:"ep_code,omitempty" xml:"ep_code,omitempty" require:"true"`
}

func (s AccountInfo) String() string {
	return tea.Prettify(s)
}

func (s AccountInfo) GoString() string {
	return s.String()
}

func (s *AccountInfo) SetEpAmount(v int64) *AccountInfo {
	s.EpAmount = &v
	return s
}

func (s *AccountInfo) SetEpCode(v string) *AccountInfo {
	s.EpCode = &v
	return s
}

// 阿里云区块链配置信息
type ALiYunChainConfigOption struct {
	// config_option
	// example:
	//
	// config_option
	ConfigOption *string `json:"config_option,omitempty" xml:"config_option,omitempty"`
	// show_name
	// example:
	//
	// show_name
	ShowName *string `json:"show_name,omitempty" xml:"show_name,omitempty"`
	// enable
	// example:
	//
	// true, false
	Enable *bool `json:"enable,omitempty" xml:"enable,omitempty"`
}

func (s ALiYunChainConfigOption) String() string {
	return tea.Prettify(s)
}

func (s ALiYunChainConfigOption) GoString() string {
	return s.String()
}

func (s *ALiYunChainConfigOption) SetConfigOption(v string) *ALiYunChainConfigOption {
	s.ConfigOption = &v
	return s
}

func (s *ALiYunChainConfigOption) SetShowName(v string) *ALiYunChainConfigOption {
	s.ShowName = &v
	return s
}

func (s *ALiYunChainConfigOption) SetEnable(v bool) *ALiYunChainConfigOption {
	s.Enable = &v
	return s
}

// 删除资源返回结果
type ALiYunDeleteResource struct {
	// data
	// example:
	//
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
	// success
	// example:
	//
	// true, false
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ALiYunDeleteResource) String() string {
	return tea.Prettify(s)
}

func (s ALiYunDeleteResource) GoString() string {
	return s.String()
}

func (s *ALiYunDeleteResource) SetData(v bool) *ALiYunDeleteResource {
	s.Data = &v
	return s
}

func (s *ALiYunDeleteResource) SetSuccess(v bool) *ALiYunDeleteResource {
	s.Success = &v
	return s
}

// 交易详情
type TransactionInfo struct {
	// 交易时间戳
	// example:
	//
	// timestamp
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty" require:"true"`
	// 交易hash
	// example:
	//
	// hash
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty" require:"true"`
	// 交易块高
	// example:
	//
	// 1
	Height *int64 `json:"height,omitempty" xml:"height,omitempty" require:"true"`
	// 交易所在块高
	// example:
	//
	// hash
	Blockhash *string `json:"blockhash,omitempty" xml:"blockhash,omitempty" require:"true"`
	// 交易来源
	// example:
	//
	// hash
	From *string `json:"from,omitempty" xml:"from,omitempty" require:"true"`
	// 交易地址
	// example:
	//
	// hash
	To *string `json:"to,omitempty" xml:"to,omitempty" require:"true"`
	// 交易类型
	// example:
	//
	// 11
	Txtype *int64 `json:"txtype,omitempty" xml:"txtype,omitempty" require:"true"`
	// 转账额度
	// example:
	//
	// 1
	Value *int64 `json:"value,omitempty" xml:"value,omitempty" require:"true"`
	// logs
	// example:
	//
	// logs
	Logs *string `json:"logs,omitempty" xml:"logs,omitempty" require:"true"`
	// 燃料消耗
	// example:
	//
	// 11
	Gasused *int64 `json:"gasused,omitempty" xml:"gasused,omitempty" require:"true"`
	// result
	// example:
	//
	// result
	Result *string `json:"result,omitempty" xml:"result,omitempty" require:"true"`
	// 拓展json字段
	// example:
	//
	// json
	Json *string `json:"json,omitempty" xml:"json,omitempty" require:"true"`
}

func (s TransactionInfo) String() string {
	return tea.Prettify(s)
}

func (s TransactionInfo) GoString() string {
	return s.String()
}

func (s *TransactionInfo) SetTimestamp(v int64) *TransactionInfo {
	s.Timestamp = &v
	return s
}

func (s *TransactionInfo) SetHash(v string) *TransactionInfo {
	s.Hash = &v
	return s
}

func (s *TransactionInfo) SetHeight(v int64) *TransactionInfo {
	s.Height = &v
	return s
}

func (s *TransactionInfo) SetBlockhash(v string) *TransactionInfo {
	s.Blockhash = &v
	return s
}

func (s *TransactionInfo) SetFrom(v string) *TransactionInfo {
	s.From = &v
	return s
}

func (s *TransactionInfo) SetTo(v string) *TransactionInfo {
	s.To = &v
	return s
}

func (s *TransactionInfo) SetTxtype(v int64) *TransactionInfo {
	s.Txtype = &v
	return s
}

func (s *TransactionInfo) SetValue(v int64) *TransactionInfo {
	s.Value = &v
	return s
}

func (s *TransactionInfo) SetLogs(v string) *TransactionInfo {
	s.Logs = &v
	return s
}

func (s *TransactionInfo) SetGasused(v int64) *TransactionInfo {
	s.Gasused = &v
	return s
}

func (s *TransactionInfo) SetResult(v string) *TransactionInfo {
	s.Result = &v
	return s
}

func (s *TransactionInfo) SetJson(v string) *TransactionInfo {
	s.Json = &v
	return s
}

// 阿里云区块链小程序权限控制信息
type ALiYunChainMiniAppAuthorization struct {
	// ant_chain_id
	// example:
	//
	// ant_chain_id
	AntChainId *string `json:"ant_chain_id,omitempty" xml:"ant_chain_id,omitempty"`
	// q_r_code_type
	// example:
	//
	// q_r_code_type
	QRCodeType *string `json:"q_r_code_type,omitempty" xml:"q_r_code_type,omitempty"`
	// authorization_type
	// example:
	//
	// authorization_type
	AuthorizationType *string `json:"authorization_type,omitempty" xml:"authorization_type,omitempty"`
}

func (s ALiYunChainMiniAppAuthorization) String() string {
	return tea.Prettify(s)
}

func (s ALiYunChainMiniAppAuthorization) GoString() string {
	return s.String()
}

func (s *ALiYunChainMiniAppAuthorization) SetAntChainId(v string) *ALiYunChainMiniAppAuthorization {
	s.AntChainId = &v
	return s
}

func (s *ALiYunChainMiniAppAuthorization) SetQRCodeType(v string) *ALiYunChainMiniAppAuthorization {
	s.QRCodeType = &v
	return s
}

func (s *ALiYunChainMiniAppAuthorization) SetAuthorizationType(v string) *ALiYunChainMiniAppAuthorization {
	s.AuthorizationType = &v
	return s
}

// 历史任务信息
type OldTaskInfo struct {
	// 任务标题(同一个租户不能重复)
	// example:
	//
	// 普通任务
	TaskName *string `json:"task_name,omitempty" xml:"task_name,omitempty" require:"true"`
	// appId
	// example:
	//
	// 2021004121633301
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 问卷ID
	// example:
	//
	// ybl1112
	SurveyId *string `json:"survey_id,omitempty" xml:"survey_id,omitempty" require:"true"`
	// 备注信息
	// example:
	//
	// 普通任务备注
	Notes *string `json:"notes,omitempty" xml:"notes,omitempty"`
	// 租户ID
	// example:
	//
	// RIVUFSJG
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 操作者
	// example:
	//
	// eipzps@alitest.comtest
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// banner标题
	// example:
	//
	// 普通任务banner
	BannerTitle *string `json:"banner_title,omitempty" xml:"banner_title,omitempty" require:"true"`
	// banner图片地址（最多支持3张）
	// example:
	//
	// testTenant_1.png,testTenant_1.png
	BannerImageUrls *string `json:"banner_image_urls,omitempty" xml:"banner_image_urls,omitempty"`
	// banner 图片地址, 拼装后的url
	// example:
	//
	// ["testTenant_1.png","testTenant_1.png"]
	BannerImageFullUrls []*string `json:"banner_image_full_urls,omitempty" xml:"banner_image_full_urls,omitempty" type:"Repeated"`
	// 题量
	// example:
	//
	// 100
	QuestionNum *int64 `json:"question_num,omitempty" xml:"question_num,omitempty" require:"true"`
	// 任务连接地址
	// example:
	//
	// https://pro.wenjuan.com/t/a2
	TaskLinkUrl *string `json:"task_link_url,omitempty" xml:"task_link_url,omitempty" require:"true"`
	// 人群划分描述
	// example:
	//
	// 购买过健身服装的人群
	PersonDivideContent *string `json:"person_divide_content,omitempty" xml:"person_divide_content,omitempty"`
	// 城市列表
	// example:
	//
	// 北京,上海,新加坡
	CityDivideUrls *string `json:"city_divide_urls,omitempty" xml:"city_divide_urls,omitempty"`
	// 城市列表, 拼装后的url
	// example:
	//
	// ["北京","上海","新加坡"]
	CityDivideFullUrls []*string `json:"city_divide_full_urls,omitempty" xml:"city_divide_full_urls,omitempty" type:"Repeated"`
	// 样本数量
	// example:
	//
	// 20
	SampleNum *int64 `json:"sample_num,omitempty" xml:"sample_num,omitempty" require:"true"`
	// 完成样本量
	// example:
	//
	// 1
	CompletedNum *int64 `json:"completed_num,omitempty" xml:"completed_num,omitempty" require:"true"`
	// 产品下单code类型（1-资源包 2-后付费）
	// example:
	//
	// 1
	ProductCodeType *string `json:"product_code_type,omitempty" xml:"product_code_type,omitempty" require:"true"`
	// 产品余量
	// example:
	//
	// 20
	ProductCapacity *int64 `json:"product_capacity,omitempty" xml:"product_capacity,omitempty" require:"true"`
	// 奖励渠道（0-手动发支付宝余额 1-海豚红包 2-问卷自带）
	// example:
	//
	// 1
	PrizeChannel *int64 `json:"prize_channel,omitempty" xml:"prize_channel,omitempty" require:"true"`
	// 支付宝账号
	// example:
	//
	// kefu@lingdangshuo.com
	AlipayAccountId *string `json:"alipay_account_id,omitempty" xml:"alipay_account_id,omitempty"`
	// 奖励类型（0-定额红包）
	// example:
	//
	// 0
	PrizeType *int64 `json:"prize_type,omitempty" xml:"prize_type,omitempty" require:"true"`
	// 全额红包金额，奖励渠道为0和1时
	// example:
	//
	// 1.00
	FullRedPacketAmount *string `json:"full_red_packet_amount,omitempty" xml:"full_red_packet_amount,omitempty" require:"true"`
	// 全额红包描述，奖励渠道为2时，此处必填
	// example:
	//
	// 1-5元红包
	FullRedPacketTextInfo *string `json:"full_red_packet_text_info,omitempty" xml:"full_red_packet_text_info,omitempty"`
	// 甄别红包金额
	// example:
	//
	// 0.01
	ExamineRedPacketAmount *string `json:"examine_red_packet_amount,omitempty" xml:"examine_red_packet_amount,omitempty" require:"true"`
	// 关联的证书instanceId
	// example:
	//
	// 6511ce4b43414e9588114682bbf9a893
	CertInstanceId *string `json:"cert_instance_id,omitempty" xml:"cert_instance_id,omitempty"`
	// 证书实例详情
	CertInstanceDetail *CertInstanceDetail `json:"cert_instance_detail,omitempty" xml:"cert_instance_detail,omitempty"`
	// 审核建议
	// example:
	//
	// 拒绝
	VerifyComment *string `json:"verify_comment,omitempty" xml:"verify_comment,omitempty"`
	// 任务创建时间
	// example:
	//
	// 2023-12-20 12:19:00
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true"`
	// 任务更新时间
	// example:
	//
	// 2023-12-20 12:45:00
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true"`
	// 审核理由
	// example:
	//
	// 不合适
	ReviewContent *string `json:"review_content,omitempty" xml:"review_content,omitempty"`
	// 人群配置信息
	// example:
	//
	// {"exclude": false,"nodeConfig": {"groupType": "AND","children": ["exclude": false,"nodeType": "GROUP","nodeId": "1303661d-a7da-4d8a-b646-0819f2fc2855","nodeConfig": {"groupType": "AND","children": []}}]},"nodeId": "ROOT","nodeType": "GROUP"}
	CrowdConfig *string `json:"crowd_config,omitempty" xml:"crowd_config,omitempty"`
	// 任务ID
	// example:
	//
	// qdQxqU5gz
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 状态
	// example:
	//
	// 9
	Status *int64 `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s OldTaskInfo) String() string {
	return tea.Prettify(s)
}

func (s OldTaskInfo) GoString() string {
	return s.String()
}

func (s *OldTaskInfo) SetTaskName(v string) *OldTaskInfo {
	s.TaskName = &v
	return s
}

func (s *OldTaskInfo) SetAppId(v string) *OldTaskInfo {
	s.AppId = &v
	return s
}

func (s *OldTaskInfo) SetSurveyId(v string) *OldTaskInfo {
	s.SurveyId = &v
	return s
}

func (s *OldTaskInfo) SetNotes(v string) *OldTaskInfo {
	s.Notes = &v
	return s
}

func (s *OldTaskInfo) SetTenantId(v string) *OldTaskInfo {
	s.TenantId = &v
	return s
}

func (s *OldTaskInfo) SetOperator(v string) *OldTaskInfo {
	s.Operator = &v
	return s
}

func (s *OldTaskInfo) SetBannerTitle(v string) *OldTaskInfo {
	s.BannerTitle = &v
	return s
}

func (s *OldTaskInfo) SetBannerImageUrls(v string) *OldTaskInfo {
	s.BannerImageUrls = &v
	return s
}

func (s *OldTaskInfo) SetBannerImageFullUrls(v []*string) *OldTaskInfo {
	s.BannerImageFullUrls = v
	return s
}

func (s *OldTaskInfo) SetQuestionNum(v int64) *OldTaskInfo {
	s.QuestionNum = &v
	return s
}

func (s *OldTaskInfo) SetTaskLinkUrl(v string) *OldTaskInfo {
	s.TaskLinkUrl = &v
	return s
}

func (s *OldTaskInfo) SetPersonDivideContent(v string) *OldTaskInfo {
	s.PersonDivideContent = &v
	return s
}

func (s *OldTaskInfo) SetCityDivideUrls(v string) *OldTaskInfo {
	s.CityDivideUrls = &v
	return s
}

func (s *OldTaskInfo) SetCityDivideFullUrls(v []*string) *OldTaskInfo {
	s.CityDivideFullUrls = v
	return s
}

func (s *OldTaskInfo) SetSampleNum(v int64) *OldTaskInfo {
	s.SampleNum = &v
	return s
}

func (s *OldTaskInfo) SetCompletedNum(v int64) *OldTaskInfo {
	s.CompletedNum = &v
	return s
}

func (s *OldTaskInfo) SetProductCodeType(v string) *OldTaskInfo {
	s.ProductCodeType = &v
	return s
}

func (s *OldTaskInfo) SetProductCapacity(v int64) *OldTaskInfo {
	s.ProductCapacity = &v
	return s
}

func (s *OldTaskInfo) SetPrizeChannel(v int64) *OldTaskInfo {
	s.PrizeChannel = &v
	return s
}

func (s *OldTaskInfo) SetAlipayAccountId(v string) *OldTaskInfo {
	s.AlipayAccountId = &v
	return s
}

func (s *OldTaskInfo) SetPrizeType(v int64) *OldTaskInfo {
	s.PrizeType = &v
	return s
}

func (s *OldTaskInfo) SetFullRedPacketAmount(v string) *OldTaskInfo {
	s.FullRedPacketAmount = &v
	return s
}

func (s *OldTaskInfo) SetFullRedPacketTextInfo(v string) *OldTaskInfo {
	s.FullRedPacketTextInfo = &v
	return s
}

func (s *OldTaskInfo) SetExamineRedPacketAmount(v string) *OldTaskInfo {
	s.ExamineRedPacketAmount = &v
	return s
}

func (s *OldTaskInfo) SetCertInstanceId(v string) *OldTaskInfo {
	s.CertInstanceId = &v
	return s
}

func (s *OldTaskInfo) SetCertInstanceDetail(v *CertInstanceDetail) *OldTaskInfo {
	s.CertInstanceDetail = v
	return s
}

func (s *OldTaskInfo) SetVerifyComment(v string) *OldTaskInfo {
	s.VerifyComment = &v
	return s
}

func (s *OldTaskInfo) SetGmtCreate(v string) *OldTaskInfo {
	s.GmtCreate = &v
	return s
}

func (s *OldTaskInfo) SetGmtModified(v string) *OldTaskInfo {
	s.GmtModified = &v
	return s
}

func (s *OldTaskInfo) SetReviewContent(v string) *OldTaskInfo {
	s.ReviewContent = &v
	return s
}

func (s *OldTaskInfo) SetCrowdConfig(v string) *OldTaskInfo {
	s.CrowdConfig = &v
	return s
}

func (s *OldTaskInfo) SetTaskId(v string) *OldTaskInfo {
	s.TaskId = &v
	return s
}

func (s *OldTaskInfo) SetStatus(v int64) *OldTaskInfo {
	s.Status = &v
	return s
}

// 阿里云蚂蚁区块链相关下载结果
type ALiYunChainDownload struct {
	// private_key
	// example:
	//
	// private_key
	PrivateKey *string `json:"private_key,omitempty" xml:"private_key,omitempty"`
	// download_path
	// example:
	//
	// download_path
	DownloadPath *ALiYunDownloadPath `json:"download_path,omitempty" xml:"download_path,omitempty"`
}

func (s ALiYunChainDownload) String() string {
	return tea.Prettify(s)
}

func (s ALiYunChainDownload) GoString() string {
	return s.String()
}

func (s *ALiYunChainDownload) SetPrivateKey(v string) *ALiYunChainDownload {
	s.PrivateKey = &v
	return s
}

func (s *ALiYunChainDownload) SetDownloadPath(v *ALiYunDownloadPath) *ALiYunChainDownload {
	s.DownloadPath = v
	return s
}

// 授权协议信息
type AgreementConfigInfoDTO struct {
	// 协议名称
	// example:
	//
	// testAgreementName
	AgreementName *string `json:"agreement_name,omitempty" xml:"agreement_name,omitempty" require:"true"`
	// 协议链接
	// example:
	//
	// testAgreementUrl
	AgreementUrl *string `json:"agreement_url,omitempty" xml:"agreement_url,omitempty" require:"true"`
	// 协议描述
	// example:
	//
	// testAgreementDesc
	AgreementDesc *string `json:"agreement_desc,omitempty" xml:"agreement_desc,omitempty" require:"true"`
	// 协议版本
	// example:
	//
	// 1
	Version *int64 `json:"version,omitempty" xml:"version,omitempty"`
}

func (s AgreementConfigInfoDTO) String() string {
	return tea.Prettify(s)
}

func (s AgreementConfigInfoDTO) GoString() string {
	return s.String()
}

func (s *AgreementConfigInfoDTO) SetAgreementName(v string) *AgreementConfigInfoDTO {
	s.AgreementName = &v
	return s
}

func (s *AgreementConfigInfoDTO) SetAgreementUrl(v string) *AgreementConfigInfoDTO {
	s.AgreementUrl = &v
	return s
}

func (s *AgreementConfigInfoDTO) SetAgreementDesc(v string) *AgreementConfigInfoDTO {
	s.AgreementDesc = &v
	return s
}

func (s *AgreementConfigInfoDTO) SetVersion(v int64) *AgreementConfigInfoDTO {
	s.Version = &v
	return s
}

// 阿里云链统计信息
type ALiYunChainStatics struct {
	// alias
	// example:
	//
	// alias
	Alias *string `json:"alias,omitempty" xml:"alias,omitempty"`
	// Dt
	// example:
	//
	// Dt
	Dt *int64 `json:"dt,omitempty" xml:"dt,omitempty"`
	// trans_count
	// example:
	//
	// 21323
	TransCount *int64 `json:"trans_count,omitempty" xml:"trans_count,omitempty"`
	// last_sum_block_height
	// example:
	//
	// 1231
	LastSumBlockHeight *int64 `json:"last_sum_block_height,omitempty" xml:"last_sum_block_height,omitempty"`
	// creat_time
	// example:
	//
	// creat_time
	CreatTime *int64 `json:"creat_time,omitempty" xml:"creat_time,omitempty"`
}

func (s ALiYunChainStatics) String() string {
	return tea.Prettify(s)
}

func (s ALiYunChainStatics) GoString() string {
	return s.String()
}

func (s *ALiYunChainStatics) SetAlias(v string) *ALiYunChainStatics {
	s.Alias = &v
	return s
}

func (s *ALiYunChainStatics) SetDt(v int64) *ALiYunChainStatics {
	s.Dt = &v
	return s
}

func (s *ALiYunChainStatics) SetTransCount(v int64) *ALiYunChainStatics {
	s.TransCount = &v
	return s
}

func (s *ALiYunChainStatics) SetLastSumBlockHeight(v int64) *ALiYunChainStatics {
	s.LastSumBlockHeight = &v
	return s
}

func (s *ALiYunChainStatics) SetCreatTime(v int64) *ALiYunChainStatics {
	s.CreatTime = &v
	return s
}

// 阿里云蚂蚁区块链证书列表信息
type ALiYunCertificateApplications struct {
	// pagination
	// example:
	//
	// pagination
	Pagination *ALiYunPagination `json:"pagination,omitempty" xml:"pagination,omitempty"`
	// certificate_application
	// example:
	//
	// certificate_application
	CertificateApplications []*ALiYunCertificateApplication `json:"certificate_applications,omitempty" xml:"certificate_applications,omitempty" type:"Repeated"`
}

func (s ALiYunCertificateApplications) String() string {
	return tea.Prettify(s)
}

func (s ALiYunCertificateApplications) GoString() string {
	return s.String()
}

func (s *ALiYunCertificateApplications) SetPagination(v *ALiYunPagination) *ALiYunCertificateApplications {
	s.Pagination = v
	return s
}

func (s *ALiYunCertificateApplications) SetCertificateApplications(v []*ALiYunCertificateApplication) *ALiYunCertificateApplications {
	s.CertificateApplications = v
	return s
}

// vc传输初始化结果
type VcTransmitInitResult struct {
	// 初始化成功与否
	// example:
	//
	// true, false
	IsSuccess *bool `json:"is_success,omitempty" xml:"is_success,omitempty" require:"true"`
	// 失败时返回的额外信息
	// example:
	//
	// 附属消息
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
	// 接受者did
	// example:
	//
	// did:mychain:xxxx
	TargetVerifier *string `json:"target_verifier,omitempty" xml:"target_verifier,omitempty" require:"true"`
	// 待签名的交易hash
	// example:
	//
	// 123123
	NeedSignatureTxHash *string `json:"need_signature_tx_hash,omitempty" xml:"need_signature_tx_hash,omitempty" require:"true"`
}

func (s VcTransmitInitResult) String() string {
	return tea.Prettify(s)
}

func (s VcTransmitInitResult) GoString() string {
	return s.String()
}

func (s *VcTransmitInitResult) SetIsSuccess(v bool) *VcTransmitInitResult {
	s.IsSuccess = &v
	return s
}

func (s *VcTransmitInitResult) SetMessage(v string) *VcTransmitInitResult {
	s.Message = &v
	return s
}

func (s *VcTransmitInitResult) SetTargetVerifier(v string) *VcTransmitInitResult {
	s.TargetVerifier = &v
	return s
}

func (s *VcTransmitInitResult) SetNeedSignatureTxHash(v string) *VcTransmitInitResult {
	s.NeedSignatureTxHash = &v
	return s
}

// 具体实体的身份信息
type EntityInfo struct {
	// 0，身份证；1，电话；2，email，3，企业营业执照号
	Type *int64 `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 具体号码
	// example:
	//
	// 18701507222
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s EntityInfo) String() string {
	return tea.Prettify(s)
}

func (s EntityInfo) GoString() string {
	return s.String()
}

func (s *EntityInfo) SetType(v int64) *EntityInfo {
	s.Type = &v
	return s
}

func (s *EntityInfo) SetValue(v string) *EntityInfo {
	s.Value = &v
	return s
}

// 链节点信息
type NodeInfo struct {
	// 链的区块高度
	// example:
	//
	// 10000
	Blockheight *int64 `json:"blockheight,omitempty" xml:"blockheight,omitempty"`
	// 节点名称
	// example:
	//
	// 名字
	Nodename *string `json:"nodename,omitempty" xml:"nodename,omitempty"`
	// 节点健康状况
	// example:
	//
	// true
	Status *bool `json:"status,omitempty" xml:"status,omitempty"`
	// 节点版本
	// example:
	//
	// 0.10
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
}

func (s NodeInfo) String() string {
	return tea.Prettify(s)
}

func (s NodeInfo) GoString() string {
	return s.String()
}

func (s *NodeInfo) SetBlockheight(v int64) *NodeInfo {
	s.Blockheight = &v
	return s
}

func (s *NodeInfo) SetNodename(v string) *NodeInfo {
	s.Nodename = &v
	return s
}

func (s *NodeInfo) SetStatus(v bool) *NodeInfo {
	s.Status = &v
	return s
}

func (s *NodeInfo) SetVersion(v string) *NodeInfo {
	s.Version = &v
	return s
}

// Did服务类型描述结构体
type DidServiceType struct {
	// 枚举类型，描述访问服务的方式
	// example:
	//
	// http,https,openapi,ftp,other...
	AccessMode *string `json:"access_mode,omitempty" xml:"access_mode,omitempty"`
	// 对服务的文字描述，<1000个字符
	// example:
	//
	// 对服务描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" maxLength:"1000"`
	// 服务类型创建者did
	// example:
	//
	// did:mychain:xxxx
	Did *string `json:"did,omitempty" xml:"did,omitempty" require:"true"`
	// { "item1":"", "item2":"",...
	// example:
	//
	// json描述服务入参
	ServiceInput *string `json:"service_input,omitempty" xml:"service_input,omitempty"`
	// 返回值类型描述，json形式
	// example:
	//
	// { "item1":"" "item2":"" ... }
	ServiceOutput *string `json:"service_output,omitempty" xml:"service_output,omitempty"`
	// 自定义服务类型，字符数16～32个
	// example:
	//
	// KYBServiceType
	ServiceType *string `json:"service_type,omitempty" xml:"service_type,omitempty" require:"true"`
}

func (s DidServiceType) String() string {
	return tea.Prettify(s)
}

func (s DidServiceType) GoString() string {
	return s.String()
}

func (s *DidServiceType) SetAccessMode(v string) *DidServiceType {
	s.AccessMode = &v
	return s
}

func (s *DidServiceType) SetDescription(v string) *DidServiceType {
	s.Description = &v
	return s
}

func (s *DidServiceType) SetDid(v string) *DidServiceType {
	s.Did = &v
	return s
}

func (s *DidServiceType) SetServiceInput(v string) *DidServiceType {
	s.ServiceInput = &v
	return s
}

func (s *DidServiceType) SetServiceOutput(v string) *DidServiceType {
	s.ServiceOutput = &v
	return s
}

func (s *DidServiceType) SetServiceType(v string) *DidServiceType {
	s.ServiceType = &v
	return s
}

// 应用请求
type ApplicationQueryReq struct {
	// 应用程序ID
	// example:
	//
	// app20230725115808679d4f
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s ApplicationQueryReq) String() string {
	return tea.Prettify(s)
}

func (s ApplicationQueryReq) GoString() string {
	return s.String()
}

func (s *ApplicationQueryReq) SetApplicationId(v string) *ApplicationQueryReq {
	s.ApplicationId = &v
	return s
}

// 分账信息
type OpenApiRoyaltyDetailInfoPojo struct {
	// 分账比例
	// example:
	//
	// 2
	Percentage *string `json:"percentage,omitempty" xml:"percentage,omitempty"`
	// 分账金额
	// example:
	//
	// 2
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty"`
	// 分账类型
	// example:
	//
	// transfer
	RoyaltyType *string `json:"royalty_type,omitempty" xml:"royalty_type,omitempty"`
	// 支出方账户类型
	// example:
	//
	// userId
	TransOutType *string `json:"trans_out_type,omitempty" xml:"trans_out_type,omitempty"`
	// 支出方账户
	// example:
	//
	// 2088101126765726
	TransOut *string `json:"trans_out,omitempty" xml:"trans_out,omitempty"`
	// 收入方账户类型
	// example:
	//
	// userId
	TransInType *string `json:"trans_in_type,omitempty" xml:"trans_in_type,omitempty"`
	// 收入方账户
	// example:
	//
	// 2088101126708402
	TransIn *string `json:"trans_in,omitempty" xml:"trans_in,omitempty"`
	// 分账描述
	// example:
	//
	// 分账给2088101126708402
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
}

func (s OpenApiRoyaltyDetailInfoPojo) String() string {
	return tea.Prettify(s)
}

func (s OpenApiRoyaltyDetailInfoPojo) GoString() string {
	return s.String()
}

func (s *OpenApiRoyaltyDetailInfoPojo) SetPercentage(v string) *OpenApiRoyaltyDetailInfoPojo {
	s.Percentage = &v
	return s
}

func (s *OpenApiRoyaltyDetailInfoPojo) SetAmount(v string) *OpenApiRoyaltyDetailInfoPojo {
	s.Amount = &v
	return s
}

func (s *OpenApiRoyaltyDetailInfoPojo) SetRoyaltyType(v string) *OpenApiRoyaltyDetailInfoPojo {
	s.RoyaltyType = &v
	return s
}

func (s *OpenApiRoyaltyDetailInfoPojo) SetTransOutType(v string) *OpenApiRoyaltyDetailInfoPojo {
	s.TransOutType = &v
	return s
}

func (s *OpenApiRoyaltyDetailInfoPojo) SetTransOut(v string) *OpenApiRoyaltyDetailInfoPojo {
	s.TransOut = &v
	return s
}

func (s *OpenApiRoyaltyDetailInfoPojo) SetTransInType(v string) *OpenApiRoyaltyDetailInfoPojo {
	s.TransInType = &v
	return s
}

func (s *OpenApiRoyaltyDetailInfoPojo) SetTransIn(v string) *OpenApiRoyaltyDetailInfoPojo {
	s.TransIn = &v
	return s
}

func (s *OpenApiRoyaltyDetailInfoPojo) SetDesc(v string) *OpenApiRoyaltyDetailInfoPojo {
	s.Desc = &v
	return s
}

// 合约信息
type ContractInfo struct {
	// 合约地址
	// example:
	//
	// ac01ceb0d8df822e042e5ea3b677201655250dbf54b9bd0c364de6f3f2a1dc7e
	Contract *string `json:"contract,omitempty" xml:"contract,omitempty"`
	// 部署hash
	// example:
	//
	// 1c625b49992ed3b55abaac677f964a35c4151d4112da8204ac874b6497bf1143
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
	// 合约部署时间
	// example:
	//
	// 1573401600000
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
}

func (s ContractInfo) String() string {
	return tea.Prettify(s)
}

func (s ContractInfo) GoString() string {
	return s.String()
}

func (s *ContractInfo) SetContract(v string) *ContractInfo {
	s.Contract = &v
	return s
}

func (s *ContractInfo) SetHash(v string) *ContractInfo {
	s.Hash = &v
	return s
}

func (s *ContractInfo) SetTimestamp(v int64) *ContractInfo {
	s.Timestamp = &v
	return s
}

// 创建VC参数
type AddVC struct {
	// vc原文hash
	// example:
	//
	// 1232
	ContentHash *string `json:"content_hash,omitempty" xml:"content_hash,omitempty" require:"true"`
	// issuer后缀的hash值
	// example:
	//
	// 12345667
	IssuerHash *string `json:"issuer_hash,omitempty" xml:"issuer_hash,omitempty" require:"true"`
	// valid or invalid
	// example:
	//
	// valid
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 接收者后缀hash值
	// example:
	//
	// 1234567
	SubjectHash *string `json:"subject_hash,omitempty" xml:"subject_hash,omitempty" require:"true"`
	// 可验证声明id
	// example:
	//
	// vc:mychain:xxxxxx
	VcId *string `json:"vc_id,omitempty" xml:"vc_id,omitempty" require:"true"`
}

func (s AddVC) String() string {
	return tea.Prettify(s)
}

func (s AddVC) GoString() string {
	return s.String()
}

func (s *AddVC) SetContentHash(v string) *AddVC {
	s.ContentHash = &v
	return s
}

func (s *AddVC) SetIssuerHash(v string) *AddVC {
	s.IssuerHash = &v
	return s
}

func (s *AddVC) SetStatus(v string) *AddVC {
	s.Status = &v
	return s
}

func (s *AddVC) SetSubjectHash(v string) *AddVC {
	s.SubjectHash = &v
	return s
}

func (s *AddVC) SetVcId(v string) *AddVC {
	s.VcId = &v
	return s
}

// 带单位的值
type ValueUnitPair struct {
	// 数值
	Value *int64 `json:"value,omitempty" xml:"value,omitempty" require:"true"`
	// 单位
	// example:
	//
	// d
	Unit *string `json:"unit,omitempty" xml:"unit,omitempty" require:"true"`
}

func (s ValueUnitPair) String() string {
	return tea.Prettify(s)
}

func (s ValueUnitPair) GoString() string {
	return s.String()
}

func (s *ValueUnitPair) SetValue(v int64) *ValueUnitPair {
	s.Value = &v
	return s
}

func (s *ValueUnitPair) SetUnit(v string) *ValueUnitPair {
	s.Unit = &v
	return s
}

// 阿里云区块链小程序交易二维码生成
type ALiYunChainMiniAppCodeCreate struct {
	// ant_chain_id
	// example:
	//
	// ant_chain_id
	AntChainId *string `json:"ant_chain_id,omitempty" xml:"ant_chain_id,omitempty"`
	// transaction_hash
	// example:
	//
	// transaction_hash
	TransactionHash *string `json:"transaction_hash,omitempty" xml:"transaction_hash,omitempty"`
	// base64_q_r_code_p_n_g
	// example:
	//
	// base64_q_r_code_p_n_g
	Base64QRCodePNG *string `json:"base64_q_r_code_p_n_g,omitempty" xml:"base64_q_r_code_p_n_g,omitempty"`
	// q_r_code_content
	// example:
	//
	// q_r_code_content
	QRCodeContent *string `json:"q_r_code_content,omitempty" xml:"q_r_code_content,omitempty"`
}

func (s ALiYunChainMiniAppCodeCreate) String() string {
	return tea.Prettify(s)
}

func (s ALiYunChainMiniAppCodeCreate) GoString() string {
	return s.String()
}

func (s *ALiYunChainMiniAppCodeCreate) SetAntChainId(v string) *ALiYunChainMiniAppCodeCreate {
	s.AntChainId = &v
	return s
}

func (s *ALiYunChainMiniAppCodeCreate) SetTransactionHash(v string) *ALiYunChainMiniAppCodeCreate {
	s.TransactionHash = &v
	return s
}

func (s *ALiYunChainMiniAppCodeCreate) SetBase64QRCodePNG(v string) *ALiYunChainMiniAppCodeCreate {
	s.Base64QRCodePNG = &v
	return s
}

func (s *ALiYunChainMiniAppCodeCreate) SetQRCodeContent(v string) *ALiYunChainMiniAppCodeCreate {
	s.QRCodeContent = &v
	return s
}

// 描述分布的结构，目前主要包含date和value值
type Curve struct {
	// 分布以day为单位的日期
	// example:
	//
	// 2021-03-19
	Date *string `json:"date,omitempty" xml:"date,omitempty" require:"true"`
	// 以day为单位的一天凭证颁发的数据量统计。
	// example:
	//
	// 1001
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s Curve) String() string {
	return tea.Prettify(s)
}

func (s Curve) GoString() string {
	return s.String()
}

func (s *Curve) SetDate(v string) *Curve {
	s.Date = &v
	return s
}

func (s *Curve) SetValue(v string) *Curve {
	s.Value = &v
	return s
}

// 存证元数据
type NotaryMetaParam struct {
	// 描述本条存证在存证事务中的阶段，用户可自行维护
	// example:
	//
	// 合同内容
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty" require:"true"`
	// 扩展字段
	// example:
	//
	// {"key":"value"}
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 全局唯一的存证事务ID
	// example:
	//
	// 877c4383-9c83-477b-b7ec-03828a946e54
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
}

func (s NotaryMetaParam) String() string {
	return tea.Prettify(s)
}

func (s NotaryMetaParam) GoString() string {
	return s.String()
}

func (s *NotaryMetaParam) SetPhase(v string) *NotaryMetaParam {
	s.Phase = &v
	return s
}

func (s *NotaryMetaParam) SetProperties(v string) *NotaryMetaParam {
	s.Properties = &v
	return s
}

func (s *NotaryMetaParam) SetToken(v string) *NotaryMetaParam {
	s.Token = &v
	return s
}

// 用于内部业务统计的信息，外部商户请忽略
type BizInfo struct {
	// BPWZPFCN
	// example:
	//
	// 用户的金融科技租户id
	ClientTenent *string `json:"client_tenent,omitempty" xml:"client_tenent,omitempty"`
	// 业务代码
	// example:
	//
	// BAAS_ANTFIN|BAAS_ALICLOUD|MORSE|RECEIVABLE|TRACE|GLOBAL_PAYMENT|JUDICIAL|INVOICE
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
}

func (s BizInfo) String() string {
	return tea.Prettify(s)
}

func (s BizInfo) GoString() string {
	return s.String()
}

func (s *BizInfo) SetClientTenent(v string) *BizInfo {
	s.ClientTenent = &v
	return s
}

func (s *BizInfo) SetCode(v string) *BizInfo {
	s.Code = &v
	return s
}

// 数字资产管理平台版通交易信息
type EPTradeInfo struct {
	// 版通代码
	// example:
	//
	// 000111
	EpCode *string `json:"ep_code,omitempty" xml:"ep_code,omitempty" require:"true"`
	// 版通交易号
	// example:
	//
	// 123123
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty" require:"true"`
	// 卖方账户
	// example:
	//
	// testAccount
	TxFrom *string `json:"tx_from,omitempty" xml:"tx_from,omitempty" require:"true"`
	// 交易时间戳
	// example:
	//
	// 1560827725
	TxTime *int64 `json:"tx_time,omitempty" xml:"tx_time,omitempty" require:"true"`
	// 买方账户
	// example:
	//
	// testAccount
	TxTo *string `json:"tx_to,omitempty" xml:"tx_to,omitempty" require:"true"`
	// 交易数量
	// example:
	//
	// 1000
	TxValue *int64 `json:"tx_value,omitempty" xml:"tx_value,omitempty" require:"true"`
}

func (s EPTradeInfo) String() string {
	return tea.Prettify(s)
}

func (s EPTradeInfo) GoString() string {
	return s.String()
}

func (s *EPTradeInfo) SetEpCode(v string) *EPTradeInfo {
	s.EpCode = &v
	return s
}

func (s *EPTradeInfo) SetTxCode(v string) *EPTradeInfo {
	s.TxCode = &v
	return s
}

func (s *EPTradeInfo) SetTxFrom(v string) *EPTradeInfo {
	s.TxFrom = &v
	return s
}

func (s *EPTradeInfo) SetTxTime(v int64) *EPTradeInfo {
	s.TxTime = &v
	return s
}

func (s *EPTradeInfo) SetTxTo(v string) *EPTradeInfo {
	s.TxTo = &v
	return s
}

func (s *EPTradeInfo) SetTxValue(v int64) *EPTradeInfo {
	s.TxValue = &v
	return s
}

// 可信存证身份识别信息
type Identity struct {
	// 经办人姓名，企业认证必选
	// example:
	//
	// 小明
	Agent *string `json:"agent,omitempty" xml:"agent,omitempty"`
	// 经办人身份证
	// example:
	//
	// 123123123123
	AgentId *string `json:"agent_id,omitempty" xml:"agent_id,omitempty"`
	// 用户名称
	// example:
	//
	// 小王
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 证件号
	// example:
	//
	// 12332112312312
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 证件类型，个人只支持身份证IDENTITY_CARD，企业支持UNIFIED_SOCIAL_CREDIT_CODE（统一社会信用代码）和ENTERPRISE_REGISTERED_NUMBER（企业工商注册号
	// example:
	//
	// IDENTITY_CARD
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 法人姓名，企业认证必选
	// example:
	//
	// 小李
	LegalPerson *string `json:"legal_person,omitempty" xml:"legal_person,omitempty"`
	// 法人身份证,  企业认证必选
	// example:
	//
	// 123123321123
	LegalPersonId *string `json:"legal_person_id,omitempty" xml:"legal_person_id,omitempty"`
	// 用户手机号码
	// example:
	//
	// 1231231231
	MobileNo *string `json:"mobile_no,omitempty" xml:"mobile_no,omitempty"`
	// 扩展属性
	// example:
	//
	// {"key":"value"}
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 用户类型，PERSON或者ENTERPRISE
	// example:
	//
	// PERSON
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty" require:"true"`
}

func (s Identity) String() string {
	return tea.Prettify(s)
}

func (s Identity) GoString() string {
	return s.String()
}

func (s *Identity) SetAgent(v string) *Identity {
	s.Agent = &v
	return s
}

func (s *Identity) SetAgentId(v string) *Identity {
	s.AgentId = &v
	return s
}

func (s *Identity) SetCertName(v string) *Identity {
	s.CertName = &v
	return s
}

func (s *Identity) SetCertNo(v string) *Identity {
	s.CertNo = &v
	return s
}

func (s *Identity) SetCertType(v string) *Identity {
	s.CertType = &v
	return s
}

func (s *Identity) SetLegalPerson(v string) *Identity {
	s.LegalPerson = &v
	return s
}

func (s *Identity) SetLegalPersonId(v string) *Identity {
	s.LegalPersonId = &v
	return s
}

func (s *Identity) SetMobileNo(v string) *Identity {
	s.MobileNo = &v
	return s
}

func (s *Identity) SetProperties(v string) *Identity {
	s.Properties = &v
	return s
}

func (s *Identity) SetUserType(v string) *Identity {
	s.UserType = &v
	return s
}

// 联系人信息
type ContactInfo struct {
	// 联系人名字
	// example:
	//
	// 张三
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 手机号
	// example:
	//
	// 13888888888
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 电子邮箱
	// example:
	//
	// user@domain.com
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 电话
	// example:
	//
	// 0571-85022088
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty"`
	// 身份证号
	// example:
	//
	// 110000199001011234
	IdCardNo *string `json:"id_card_no,omitempty" xml:"id_card_no,omitempty"`
}

func (s ContactInfo) String() string {
	return tea.Prettify(s)
}

func (s ContactInfo) GoString() string {
	return s.String()
}

func (s *ContactInfo) SetName(v string) *ContactInfo {
	s.Name = &v
	return s
}

func (s *ContactInfo) SetMobile(v string) *ContactInfo {
	s.Mobile = &v
	return s
}

func (s *ContactInfo) SetEmail(v string) *ContactInfo {
	s.Email = &v
	return s
}

func (s *ContactInfo) SetPhone(v string) *ContactInfo {
	s.Phone = &v
	return s
}

func (s *ContactInfo) SetIdCardNo(v string) *ContactInfo {
	s.IdCardNo = &v
	return s
}

// 营销分销平台推广人账户信息
type FundInfo struct {
	// 可提现余额
	// example:
	//
	// 10.8
	Balance *string `json:"balance,omitempty" xml:"balance,omitempty" require:"true"`
	// 待结算额度
	// example:
	//
	// 11.4
	SettleQuota *string `json:"settle_quota,omitempty" xml:"settle_quota,omitempty" require:"true"`
	// 商户id
	// example:
	//
	// tset id
	ShopId *string `json:"shop_id,omitempty" xml:"shop_id,omitempty" require:"true"`
}

func (s FundInfo) String() string {
	return tea.Prettify(s)
}

func (s FundInfo) GoString() string {
	return s.String()
}

func (s *FundInfo) SetBalance(v string) *FundInfo {
	s.Balance = &v
	return s
}

func (s *FundInfo) SetSettleQuota(v string) *FundInfo {
	s.SettleQuota = &v
	return s
}

func (s *FundInfo) SetShopId(v string) *FundInfo {
	s.ShopId = &v
	return s
}

// VC Repo用户注册结构体
type VcUserRegisterPayload struct {
	// 用户did对应的授权公钥
	// example:
	//
	// 用户did对应的授权公钥
	PublicKey *string `json:"public_key,omitempty" xml:"public_key,omitempty"`
	// 业务区块连的bizid
	// example:
	//
	// 业务区块连的bizid
	VcChannel *string `json:"vc_channel,omitempty" xml:"vc_channel,omitempty" maxLength:"32" minLength:"8"`
}

func (s VcUserRegisterPayload) String() string {
	return tea.Prettify(s)
}

func (s VcUserRegisterPayload) GoString() string {
	return s.String()
}

func (s *VcUserRegisterPayload) SetPublicKey(v string) *VcUserRegisterPayload {
	s.PublicKey = &v
	return s
}

func (s *VcUserRegisterPayload) SetVcChannel(v string) *VcUserRegisterPayload {
	s.VcChannel = &v
	return s
}

// 阿里云请求结果
type ALiYunHandleBabelMns struct {
	// message
	// example:
	//
	// message
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// request_id
	// example:
	//
	// request_id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// success
	// example:
	//
	// true, false
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ALiYunHandleBabelMns) String() string {
	return tea.Prettify(s)
}

func (s ALiYunHandleBabelMns) GoString() string {
	return s.String()
}

func (s *ALiYunHandleBabelMns) SetMessage(v string) *ALiYunHandleBabelMns {
	s.Message = &v
	return s
}

func (s *ALiYunHandleBabelMns) SetRequestId(v string) *ALiYunHandleBabelMns {
	s.RequestId = &v
	return s
}

func (s *ALiYunHandleBabelMns) SetSuccess(v bool) *ALiYunHandleBabelMns {
	s.Success = &v
	return s
}

// 溯源信息中的一项记录。
type Item struct {
	// 溯源项的具体内容
	// example:
	//
	// 枭洒保税所有海关可用严禁修改
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true"`
	// 扩展信息 ，json格式
	// example:
	//
	// "{"isUrl",true,"usrid":"123231"}"
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty" require:"true"`
	// 溯源项的键值
	// example:
	//
	// itemName
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// 溯源项的中文标题
	// example:
	//
	// 品名
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
	// 内容类型
	// example:
	//
	// text, image, region, link, longtext
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s Item) String() string {
	return tea.Prettify(s)
}

func (s Item) GoString() string {
	return s.String()
}

func (s *Item) SetDesc(v string) *Item {
	s.Desc = &v
	return s
}

func (s *Item) SetExtInfo(v string) *Item {
	s.ExtInfo = &v
	return s
}

func (s *Item) SetKey(v string) *Item {
	s.Key = &v
	return s
}

func (s *Item) SetTitle(v string) *Item {
	s.Title = &v
	return s
}

func (s *Item) SetType(v string) *Item {
	s.Type = &v
	return s
}

// C3S可信计算服务TAPP应用信息
type TappInfo struct {
	// C3S可信计算TAPP应用标识
	// example:
	//
	// fafafafaf
	TaapId *string `json:"taap_id,omitempty" xml:"taap_id,omitempty" require:"true"`
	// C3S可信计算TAPP版本
	// example:
	//
	// 1
	TappVersion *int64 `json:"tapp_version,omitempty" xml:"tapp_version,omitempty" require:"true"`
}

func (s TappInfo) String() string {
	return tea.Prettify(s)
}

func (s TappInfo) GoString() string {
	return s.String()
}

func (s *TappInfo) SetTaapId(v string) *TappInfo {
	s.TaapId = &v
	return s
}

func (s *TappInfo) SetTappVersion(v int64) *TappInfo {
	s.TappVersion = &v
	return s
}

// BaaS平台联盟信息
type BaasUnionInfo struct {
	// 联盟名称
	// example:
	//
	// name
	UnionName *string `json:"union_name,omitempty" xml:"union_name,omitempty" require:"true"`
	// 描述
	// example:
	//
	// 描述
	UnionDescription *string `json:"union_description,omitempty" xml:"union_description,omitempty" require:"true"`
	// 联系人
	// example:
	//
	// 联系人
	UnionUser *string `json:"union_user,omitempty" xml:"union_user,omitempty" require:"true"`
	// 联盟联系人手机号码
	// example:
	//
	// 联盟联系人手机号码
	UnionUserCell *string `json:"union_user_cell,omitempty" xml:"union_user_cell,omitempty" require:"true"`
	// 联盟联系人邮箱
	// example:
	//
	// 联盟联系人邮箱
	UnionUserMail *string `json:"union_user_mail,omitempty" xml:"union_user_mail,omitempty" require:"true"`
}

func (s BaasUnionInfo) String() string {
	return tea.Prettify(s)
}

func (s BaasUnionInfo) GoString() string {
	return s.String()
}

func (s *BaasUnionInfo) SetUnionName(v string) *BaasUnionInfo {
	s.UnionName = &v
	return s
}

func (s *BaasUnionInfo) SetUnionDescription(v string) *BaasUnionInfo {
	s.UnionDescription = &v
	return s
}

func (s *BaasUnionInfo) SetUnionUser(v string) *BaasUnionInfo {
	s.UnionUser = &v
	return s
}

func (s *BaasUnionInfo) SetUnionUserCell(v string) *BaasUnionInfo {
	s.UnionUserCell = &v
	return s
}

func (s *BaasUnionInfo) SetUnionUserMail(v string) *BaasUnionInfo {
	s.UnionUserMail = &v
	return s
}

// blockchain交易结构体
type TransactionPo struct {
	// 交易所在块hash
	// example:
	//
	// b0c13c3bdeb4b3e0892ab2d2ddd28f9972abba66a3fae0799507dec6fcfa7ba0
	BlockHash *string `json:"block_hash,omitempty" xml:"block_hash,omitempty"`
	// 交易来源
	// example:
	//
	// b0c13c3bdeb4b3e0892ab2d2ddd28f9972abba66a3fae0799507dec6fcfa7ba0
	From *string `json:"from,omitempty" xml:"from,omitempty"`
	// gas消耗
	// example:
	//
	// 1111
	GasUsed *int64 `json:"gas_used,omitempty" xml:"gas_used,omitempty"`
	// 交易hash
	// example:
	//
	// ce386c5510df2e358056893b86ba77178fcf00d90de9c56bd788fd1968c9b58d
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
	// 交易所在块 块高
	// example:
	//
	// 1000
	Height *int64 `json:"height,omitempty" xml:"height,omitempty"`
	// 交易返回结果
	// example:
	//
	// 0
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
	// 交易时间
	// example:
	//
	// 1573401600000
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
	// 交易地址
	// example:
	//
	// 4a5e107d0ea041f25ca7bfb58503e6549913e67e5d07aadfe359418440359fec
	To *string `json:"to,omitempty" xml:"to,omitempty"`
	// 交易类型 同SDK
	// example:
	//
	// 11
	TxType *int64 `json:"tx_type,omitempty" xml:"tx_type,omitempty"`
	// 转账额度
	// example:
	//
	// 1111
	Value *int64 `json:"value,omitempty" xml:"value,omitempty"`
}

func (s TransactionPo) String() string {
	return tea.Prettify(s)
}

func (s TransactionPo) GoString() string {
	return s.String()
}

func (s *TransactionPo) SetBlockHash(v string) *TransactionPo {
	s.BlockHash = &v
	return s
}

func (s *TransactionPo) SetFrom(v string) *TransactionPo {
	s.From = &v
	return s
}

func (s *TransactionPo) SetGasUsed(v int64) *TransactionPo {
	s.GasUsed = &v
	return s
}

func (s *TransactionPo) SetHash(v string) *TransactionPo {
	s.Hash = &v
	return s
}

func (s *TransactionPo) SetHeight(v int64) *TransactionPo {
	s.Height = &v
	return s
}

func (s *TransactionPo) SetResult(v string) *TransactionPo {
	s.Result = &v
	return s
}

func (s *TransactionPo) SetTimestamp(v int64) *TransactionPo {
	s.Timestamp = &v
	return s
}

func (s *TransactionPo) SetTo(v string) *TransactionPo {
	s.To = &v
	return s
}

func (s *TransactionPo) SetTxType(v int64) *TransactionPo {
	s.TxType = &v
	return s
}

func (s *TransactionPo) SetValue(v int64) *TransactionPo {
	s.Value = &v
	return s
}

// VC链上传输结果
type VcTransmitResult struct {
	// 成功或者失败
	// example:
	//
	// true, false
	IsSuccess *bool `json:"is_success,omitempty" xml:"is_success,omitempty" require:"true"`
	// 失败信息
	// example:
	//
	// 失败信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 验证verifier did
	// example:
	//
	// did:mychian:xxxxx
	TargetVerifier *string `json:"target_verifier,omitempty" xml:"target_verifier,omitempty" require:"true"`
	// 交易hash
	// example:
	//
	// xxxxx
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s VcTransmitResult) String() string {
	return tea.Prettify(s)
}

func (s VcTransmitResult) GoString() string {
	return s.String()
}

func (s *VcTransmitResult) SetIsSuccess(v bool) *VcTransmitResult {
	s.IsSuccess = &v
	return s
}

func (s *VcTransmitResult) SetMessage(v string) *VcTransmitResult {
	s.Message = &v
	return s
}

func (s *VcTransmitResult) SetTargetVerifier(v string) *VcTransmitResult {
	s.TargetVerifier = &v
	return s
}

func (s *VcTransmitResult) SetTxHash(v string) *VcTransmitResult {
	s.TxHash = &v
	return s
}

// 分账主体
type RoyaltyEntity struct {
	// 分账接收方类型
	// example:
	//
	// userId
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 分账接收方账号
	// example:
	//
	// 2088324168543
	Account *string `json:"account,omitempty" xml:"account,omitempty" require:"true"`
	// 分账接收方真实姓名
	// example:
	//
	// 张三
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 分账关系描述
	// example:
	//
	// 分账给测试商户
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
}

func (s RoyaltyEntity) String() string {
	return tea.Prettify(s)
}

func (s RoyaltyEntity) GoString() string {
	return s.String()
}

func (s *RoyaltyEntity) SetType(v string) *RoyaltyEntity {
	s.Type = &v
	return s
}

func (s *RoyaltyEntity) SetAccount(v string) *RoyaltyEntity {
	s.Account = &v
	return s
}

func (s *RoyaltyEntity) SetName(v string) *RoyaltyEntity {
	s.Name = &v
	return s
}

func (s *RoyaltyEntity) SetMemo(v string) *RoyaltyEntity {
	s.Memo = &v
	return s
}

// 可信时间信息结构
type TsrResponse struct {
	// hash后的信息
	// example:
	//
	// AAAAA
	HashedMessage *string `json:"hashed_message,omitempty" xml:"hashed_message,omitempty" require:"true"`
	// 哈希算法
	// example:
	//
	// 321
	HashAlgorithm *string `json:"hash_algorithm,omitempty" xml:"hash_algorithm,omitempty" require:"true"`
	// 时间
	// example:
	//
	// 123
	Ts *string `json:"ts,omitempty" xml:"ts,omitempty" require:"true"`
}

func (s TsrResponse) String() string {
	return tea.Prettify(s)
}

func (s TsrResponse) GoString() string {
	return s.String()
}

func (s *TsrResponse) SetHashedMessage(v string) *TsrResponse {
	s.HashedMessage = &v
	return s
}

func (s *TsrResponse) SetHashAlgorithm(v string) *TsrResponse {
	s.HashAlgorithm = &v
	return s
}

func (s *TsrResponse) SetTs(v string) *TsrResponse {
	s.Ts = &v
	return s
}

// 商品信息
type GoodsDetail struct {
	// 商品编号
	// example:
	//
	// apple-01
	GoodsId *string `json:"goods_id,omitempty" xml:"goods_id,omitempty" require:"true"`
	// 商品名称
	// example:
	//
	// apple
	GoodsName *string `json:"goods_name,omitempty" xml:"goods_name,omitempty" require:"true"`
	// 商品数量
	// example:
	//
	// 1
	Quantity *string `json:"quantity,omitempty" xml:"quantity,omitempty" require:"true"`
	// 商品单价
	// example:
	//
	// 200
	Price *string `json:"price,omitempty" xml:"price,omitempty" require:"true"`
	// 商品类目
	// example:
	//
	// 34543238
	GoodsCategory *string `json:"goods_category,omitempty" xml:"goods_category,omitempty"`
	// 商品类目树
	// example:
	//
	// 124868003|126232002|126252004
	CategoriesTree *string `json:"categories_tree,omitempty" xml:"categories_tree,omitempty"`
	// 商品的展示地址
	// example:
	//
	// http://www.alipay.com/xxx.jpg
	ShowUrl *string `json:"show_url,omitempty" xml:"show_url,omitempty"`
	// 商品69条码
	// example:
	//
	// 6972829161111
	GoodsEanId *string `json:"goods_ean_id,omitempty" xml:"goods_ean_id,omitempty"`
	// 商家侧小程序商品 ID
	// example:
	//
	// outItem_01
	OutItemId *string `json:"out_item_id,omitempty" xml:"out_item_id,omitempty"`
	// 商家侧小程序商品ID
	// example:
	//
	// outSku_01
	OutSkuId *string `json:"out_sku_id,omitempty" xml:"out_sku_id,omitempty"`
}

func (s GoodsDetail) String() string {
	return tea.Prettify(s)
}

func (s GoodsDetail) GoString() string {
	return s.String()
}

func (s *GoodsDetail) SetGoodsId(v string) *GoodsDetail {
	s.GoodsId = &v
	return s
}

func (s *GoodsDetail) SetGoodsName(v string) *GoodsDetail {
	s.GoodsName = &v
	return s
}

func (s *GoodsDetail) SetQuantity(v string) *GoodsDetail {
	s.Quantity = &v
	return s
}

func (s *GoodsDetail) SetPrice(v string) *GoodsDetail {
	s.Price = &v
	return s
}

func (s *GoodsDetail) SetGoodsCategory(v string) *GoodsDetail {
	s.GoodsCategory = &v
	return s
}

func (s *GoodsDetail) SetCategoriesTree(v string) *GoodsDetail {
	s.CategoriesTree = &v
	return s
}

func (s *GoodsDetail) SetShowUrl(v string) *GoodsDetail {
	s.ShowUrl = &v
	return s
}

func (s *GoodsDetail) SetGoodsEanId(v string) *GoodsDetail {
	s.GoodsEanId = &v
	return s
}

func (s *GoodsDetail) SetOutItemId(v string) *GoodsDetail {
	s.OutItemId = &v
	return s
}

func (s *GoodsDetail) SetOutSkuId(v string) *GoodsDetail {
	s.OutSkuId = &v
	return s
}

// 阿里云数据导出服务TriggerDTO结构体
type TriggerDTOStructBody struct {
	// 名称
	// example:
	//
	// 9481b612d6ca4cfdbecc5c5d395eda4237c749fa-97fc-4156-9c23-e21cd6060669
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 类型
	// example:
	//
	// "BLOCK"
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 源
	// example:
	//
	// “”
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
	// 创建时间
	// example:
	//
	// 103422
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 错误信息
	// example:
	//
	// "error"
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// 状态
	// example:
	//
	// “success”
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// option（map结构，由于金融云无map接口所以通过string类型传输json格式）
	// example:
	//
	// {a:"123",  b:"123"}
	Option *string `json:"option,omitempty" xml:"option,omitempty"`
	// checkpoint类
	// example:
	//
	// {}
	Checkpoint *CheckPointStructBody `json:"checkpoint,omitempty" xml:"checkpoint,omitempty"`
	// 待处理的错误事件总数
	// example:
	//
	// 待处理的错误事件总数
	PendingErrorLogs *string `json:"pending_error_logs,omitempty" xml:"pending_error_logs,omitempty"`
}

func (s TriggerDTOStructBody) String() string {
	return tea.Prettify(s)
}

func (s TriggerDTOStructBody) GoString() string {
	return s.String()
}

func (s *TriggerDTOStructBody) SetName(v string) *TriggerDTOStructBody {
	s.Name = &v
	return s
}

func (s *TriggerDTOStructBody) SetType(v string) *TriggerDTOStructBody {
	s.Type = &v
	return s
}

func (s *TriggerDTOStructBody) SetSource(v string) *TriggerDTOStructBody {
	s.Source = &v
	return s
}

func (s *TriggerDTOStructBody) SetCreateTime(v string) *TriggerDTOStructBody {
	s.CreateTime = &v
	return s
}

func (s *TriggerDTOStructBody) SetErrorMessage(v string) *TriggerDTOStructBody {
	s.ErrorMessage = &v
	return s
}

func (s *TriggerDTOStructBody) SetStatus(v string) *TriggerDTOStructBody {
	s.Status = &v
	return s
}

func (s *TriggerDTOStructBody) SetOption(v string) *TriggerDTOStructBody {
	s.Option = &v
	return s
}

func (s *TriggerDTOStructBody) SetCheckpoint(v *CheckPointStructBody) *TriggerDTOStructBody {
	s.Checkpoint = v
	return s
}

func (s *TriggerDTOStructBody) SetPendingErrorLogs(v string) *TriggerDTOStructBody {
	s.PendingErrorLogs = &v
	return s
}

// 人群配置
type CrowdNodeDTO struct {
	// 节点id
	// example:
	//
	// c1bff3fe-f1fb-42a2-8fc7-9cbb1a011713
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty" require:"true"`
	// 节点类型
	// example:
	//
	// GROUP
	NodeType *CrowdNodeTypeEnum `json:"node_type,omitempty" xml:"node_type,omitempty" require:"true"`
	// 是否排除
	// example:
	//
	// true, false
	Exclude *bool `json:"exclude,omitempty" xml:"exclude,omitempty" require:"true"`
	// 节点配置
	// example:
	//
	// "nodeConfig": {   "tagCode": "P0010GC6",   "valueList": [     {       "selectedValues": [         "18",         "30"       ],       "operator": "BT"     }   ],   "tagType": "BASE" }
	NodeConfig *string `json:"node_config,omitempty" xml:"node_config,omitempty" require:"true"`
}

func (s CrowdNodeDTO) String() string {
	return tea.Prettify(s)
}

func (s CrowdNodeDTO) GoString() string {
	return s.String()
}

func (s *CrowdNodeDTO) SetNodeId(v string) *CrowdNodeDTO {
	s.NodeId = &v
	return s
}

func (s *CrowdNodeDTO) SetNodeType(v *CrowdNodeTypeEnum) *CrowdNodeDTO {
	s.NodeType = v
	return s
}

func (s *CrowdNodeDTO) SetExclude(v bool) *CrowdNodeDTO {
	s.Exclude = &v
	return s
}

func (s *CrowdNodeDTO) SetNodeConfig(v string) *CrowdNodeDTO {
	s.NodeConfig = &v
	return s
}

// 可信存证存证地点信息
type Location struct {
	// 所在城市
	// example:
	//
	// 杭州
	City *string `json:"city,omitempty" xml:"city,omitempty"`
	// 操作IMEI
	// example:
	//
	// 359426002899056
	Imei *string `json:"imei,omitempty" xml:"imei,omitempty"`
	// 操作IMSI
	// example:
	//
	// 460001357924680
	Imsi *string `json:"imsi,omitempty" xml:"imsi,omitempty"`
	// 操作IP地址
	// example:
	//
	// 0.0.0.0
	Ip *string `json:"ip,omitempty" xml:"ip,omitempty"`
	// 纬度
	// example:
	//
	// 66.33
	Latitude *string `json:"latitude,omitempty" xml:"latitude,omitempty"`
	// 经度
	// example:
	//
	// 23.26
	Longitude *string `json:"longitude,omitempty" xml:"longitude,omitempty"`
	// 扩展属性
	// example:
	//
	// {"key":"value"}
	Propertities *string `json:"propertities,omitempty" xml:"propertities,omitempty"`
	// 操作Wi-Fi物理地址
	// example:
	//
	// 00-01-6C-06-A6-29
	WifiMac *string `json:"wifi_mac,omitempty" xml:"wifi_mac,omitempty"`
}

func (s Location) String() string {
	return tea.Prettify(s)
}

func (s Location) GoString() string {
	return s.String()
}

func (s *Location) SetCity(v string) *Location {
	s.City = &v
	return s
}

func (s *Location) SetImei(v string) *Location {
	s.Imei = &v
	return s
}

func (s *Location) SetImsi(v string) *Location {
	s.Imsi = &v
	return s
}

func (s *Location) SetIp(v string) *Location {
	s.Ip = &v
	return s
}

func (s *Location) SetLatitude(v string) *Location {
	s.Latitude = &v
	return s
}

func (s *Location) SetLongitude(v string) *Location {
	s.Longitude = &v
	return s
}

func (s *Location) SetPropertities(v string) *Location {
	s.Propertities = &v
	return s
}

func (s *Location) SetWifiMac(v string) *Location {
	s.WifiMac = &v
	return s
}

// 营销分销推广人账户流水信息
type CapitalInfo struct {
	// 记录流水额度
	// example:
	//
	// 15.9
	BalanceLog *string `json:"balance_log,omitempty" xml:"balance_log,omitempty" require:"true"`
	// 商户id
	// example:
	//
	// testid
	ShopId *string `json:"shop_id,omitempty" xml:"shop_id,omitempty" require:"true"`
	// 记录时间
	// example:
	//
	// 12.2
	TimeLog *int64 `json:"time_log,omitempty" xml:"time_log,omitempty" require:"true"`
	// 链上地址
	// example:
	//
	// 123
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
}

func (s CapitalInfo) String() string {
	return tea.Prettify(s)
}

func (s CapitalInfo) GoString() string {
	return s.String()
}

func (s *CapitalInfo) SetBalanceLog(v string) *CapitalInfo {
	s.BalanceLog = &v
	return s
}

func (s *CapitalInfo) SetShopId(v string) *CapitalInfo {
	s.ShopId = &v
	return s
}

func (s *CapitalInfo) SetTimeLog(v int64) *CapitalInfo {
	s.TimeLog = &v
	return s
}

func (s *CapitalInfo) SetTxHash(v string) *CapitalInfo {
	s.TxHash = &v
	return s
}

// 阿里云区块链小程序日志查询
type ALiYunChainMiniAppLog struct {
	// access_count
	// example:
	//
	// 100
	AccessCount *int64 `json:"access_count,omitempty" xml:"access_count,omitempty"`
	// access_alipay_account_count
	// example:
	//
	// 1000
	AccessAlipayAccountCount *int64 `json:"access_alipay_account_count,omitempty" xml:"access_alipay_account_count,omitempty"`
}

func (s ALiYunChainMiniAppLog) String() string {
	return tea.Prettify(s)
}

func (s ALiYunChainMiniAppLog) GoString() string {
	return s.String()
}

func (s *ALiYunChainMiniAppLog) SetAccessCount(v int64) *ALiYunChainMiniAppLog {
	s.AccessCount = &v
	return s
}

func (s *ALiYunChainMiniAppLog) SetAccessAlipayAccountCount(v int64) *ALiYunChainMiniAppLog {
	s.AccessAlipayAccountCount = &v
	return s
}

// 订单结果
type OrderResult struct {
	// 事例id
	// example:
	//
	// 事例id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 是否成功
	// example:
	//
	// true, false
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
}

func (s OrderResult) String() string {
	return tea.Prettify(s)
}

func (s OrderResult) GoString() string {
	return s.String()
}

func (s *OrderResult) SetInstanceId(v string) *OrderResult {
	s.InstanceId = &v
	return s
}

func (s *OrderResult) SetSuccess(v bool) *OrderResult {
	s.Success = &v
	return s
}

// 蚂蚁链节点信息
type BlockchainBrowserNodeOwner struct {
	// node_id
	// example:
	//
	// node_id
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty" require:"true"`
	// node_ip
	// example:
	//
	// node_ip
	NodeIp *string `json:"node_ip,omitempty" xml:"node_ip,omitempty" require:"true"`
	// node_name
	// example:
	//
	// node_name
	NodeName *string `json:"node_name,omitempty" xml:"node_name,omitempty" require:"true"`
	// node_owner
	// example:
	//
	// node_owner
	NodeOwner *string `json:"node_owner,omitempty" xml:"node_owner,omitempty" require:"true"`
	// node_port
	// example:
	//
	// node_port
	NodePort *string `json:"node_port,omitempty" xml:"node_port,omitempty" require:"true"`
	// node_source
	// example:
	//
	// node_source
	NodeSource *string `json:"node_source,omitempty" xml:"node_source,omitempty" require:"true"`
	// node_state
	// example:
	//
	// node_state
	NodeState *string `json:"node_state,omitempty" xml:"node_state,omitempty" require:"true"`
	// node_type
	// example:
	//
	// node_type
	NodeType *string `json:"node_type,omitempty" xml:"node_type,omitempty" require:"true"`
	// 节点已使用的存储空间
	// example:
	//
	// 50
	NodeDiskUsed *string `json:"node_disk_used,omitempty" xml:"node_disk_used,omitempty" require:"true"`
	// 节点的总存储空间
	// example:
	//
	// 1024
	NodeDiskTotal *string `json:"node_disk_total,omitempty" xml:"node_disk_total,omitempty" require:"true"`
}

func (s BlockchainBrowserNodeOwner) String() string {
	return tea.Prettify(s)
}

func (s BlockchainBrowserNodeOwner) GoString() string {
	return s.String()
}

func (s *BlockchainBrowserNodeOwner) SetNodeId(v string) *BlockchainBrowserNodeOwner {
	s.NodeId = &v
	return s
}

func (s *BlockchainBrowserNodeOwner) SetNodeIp(v string) *BlockchainBrowserNodeOwner {
	s.NodeIp = &v
	return s
}

func (s *BlockchainBrowserNodeOwner) SetNodeName(v string) *BlockchainBrowserNodeOwner {
	s.NodeName = &v
	return s
}

func (s *BlockchainBrowserNodeOwner) SetNodeOwner(v string) *BlockchainBrowserNodeOwner {
	s.NodeOwner = &v
	return s
}

func (s *BlockchainBrowserNodeOwner) SetNodePort(v string) *BlockchainBrowserNodeOwner {
	s.NodePort = &v
	return s
}

func (s *BlockchainBrowserNodeOwner) SetNodeSource(v string) *BlockchainBrowserNodeOwner {
	s.NodeSource = &v
	return s
}

func (s *BlockchainBrowserNodeOwner) SetNodeState(v string) *BlockchainBrowserNodeOwner {
	s.NodeState = &v
	return s
}

func (s *BlockchainBrowserNodeOwner) SetNodeType(v string) *BlockchainBrowserNodeOwner {
	s.NodeType = &v
	return s
}

func (s *BlockchainBrowserNodeOwner) SetNodeDiskUsed(v string) *BlockchainBrowserNodeOwner {
	s.NodeDiskUsed = &v
	return s
}

func (s *BlockchainBrowserNodeOwner) SetNodeDiskTotal(v string) *BlockchainBrowserNodeOwner {
	s.NodeDiskTotal = &v
	return s
}

// 阿里云蚂蚁区块链账户创建信息
type ALiYunChainAccount struct {
	// account_private_key
	// example:
	//
	// account_private_key
	AccountPrivateKey *string `json:"account_private_key,omitempty" xml:"account_private_key,omitempty"`
	// account_public_key
	// example:
	//
	// account_public_key
	AccountPublicKey *string `json:"account_public_key,omitempty" xml:"account_public_key,omitempty"`
	// account_recover_private_key
	// example:
	//
	// account_recover_private_key
	AccountRecoverPrivateKey *string `json:"account_recover_private_key,omitempty" xml:"account_recover_private_key,omitempty"`
	// account_recover_public_key
	// example:
	//
	// account_recover_public_key
	AccountRecoverPublicKey *string `json:"account_recover_public_key,omitempty" xml:"account_recover_public_key,omitempty"`
	// ant_chain_id
	// example:
	//
	// ant_chain_id
	AntChainId *string `json:"ant_chain_id,omitempty" xml:"ant_chain_id,omitempty"`
	// account
	// example:
	//
	// account
	Account *string `json:"account,omitempty" xml:"account,omitempty"`
}

func (s ALiYunChainAccount) String() string {
	return tea.Prettify(s)
}

func (s ALiYunChainAccount) GoString() string {
	return s.String()
}

func (s *ALiYunChainAccount) SetAccountPrivateKey(v string) *ALiYunChainAccount {
	s.AccountPrivateKey = &v
	return s
}

func (s *ALiYunChainAccount) SetAccountPublicKey(v string) *ALiYunChainAccount {
	s.AccountPublicKey = &v
	return s
}

func (s *ALiYunChainAccount) SetAccountRecoverPrivateKey(v string) *ALiYunChainAccount {
	s.AccountRecoverPrivateKey = &v
	return s
}

func (s *ALiYunChainAccount) SetAccountRecoverPublicKey(v string) *ALiYunChainAccount {
	s.AccountRecoverPublicKey = &v
	return s
}

func (s *ALiYunChainAccount) SetAntChainId(v string) *ALiYunChainAccount {
	s.AntChainId = &v
	return s
}

func (s *ALiYunChainAccount) SetAccount(v string) *ALiYunChainAccount {
	s.Account = &v
	return s
}

// 更新DID服务列表
type UpdateDidServiceList struct {
	// 待更新did之前的版本号
	PreviousVersion *int64 `json:"previous_version,omitempty" xml:"previous_version,omitempty" require:"true"`
	// 服务信息列表
	ServiceList []*DisServicesInfo `json:"service_list,omitempty" xml:"service_list,omitempty" require:"true" type:"Repeated"`
}

func (s UpdateDidServiceList) String() string {
	return tea.Prettify(s)
}

func (s UpdateDidServiceList) GoString() string {
	return s.String()
}

func (s *UpdateDidServiceList) SetPreviousVersion(v int64) *UpdateDidServiceList {
	s.PreviousVersion = &v
	return s
}

func (s *UpdateDidServiceList) SetServiceList(v []*DisServicesInfo) *UpdateDidServiceList {
	s.ServiceList = v
	return s
}

// 营销分销商品信息
type ItemDto struct {
	// 商品id
	// example:
	//
	// test id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty" require:"true"`
	// 商户id
	// example:
	//
	// test id
	ShopId *string `json:"shop_id,omitempty" xml:"shop_id,omitempty" require:"true"`
	// 链上地址
	// example:
	//
	// 123
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
}

func (s ItemDto) String() string {
	return tea.Prettify(s)
}

func (s ItemDto) GoString() string {
	return s.String()
}

func (s *ItemDto) SetProductId(v string) *ItemDto {
	s.ProductId = &v
	return s
}

func (s *ItemDto) SetShopId(v string) *ItemDto {
	s.ShopId = &v
	return s
}

func (s *ItemDto) SetTxHash(v string) *ItemDto {
	s.TxHash = &v
	return s
}

// 蚂蚁链最新区块列表信息
type BlockchainBrowserLatestBlock struct {
	// bizid
	// example:
	//
	// bizid
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// block_hash
	// example:
	//
	// block_hash
	BlockHash *string `json:"block_hash,omitempty" xml:"block_hash,omitempty" require:"true"`
	// create_time
	// example:
	//
	// 1604564398000
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty" require:"true"`
	// height
	// example:
	//
	// 6812497
	Height *int64 `json:"height,omitempty" xml:"height,omitempty" require:"true"`
	// previous_hash
	// example:
	//
	// f6d51d362abc1b31e42dbd88d5ce0660cb96b8d0c0a4293cd29ffa042f61c784
	PreviousHash *string `json:"previous_hash,omitempty" xml:"previous_hash,omitempty" require:"true"`
	// root_tx_hash
	// example:
	//
	// da9a42027ab141c8396b7fc78d74c94264da71f6361ac468385bed3fbc5408b4
	RootTxHash *string `json:"root_tx_hash,omitempty" xml:"root_tx_hash,omitempty" require:"true"`
	// size
	// example:
	//
	// 1024
	Size *int64 `json:"size,omitempty" xml:"size,omitempty" require:"true"`
	// transaction_size
	// example:
	//
	// 1
	TransactionSize *int64 `json:"transaction_size,omitempty" xml:"transaction_size,omitempty" require:"true"`
	// version
	// example:
	//
	// 258
	Version *int64 `json:"version,omitempty" xml:"version,omitempty" require:"true"`
}

func (s BlockchainBrowserLatestBlock) String() string {
	return tea.Prettify(s)
}

func (s BlockchainBrowserLatestBlock) GoString() string {
	return s.String()
}

func (s *BlockchainBrowserLatestBlock) SetBizid(v string) *BlockchainBrowserLatestBlock {
	s.Bizid = &v
	return s
}

func (s *BlockchainBrowserLatestBlock) SetBlockHash(v string) *BlockchainBrowserLatestBlock {
	s.BlockHash = &v
	return s
}

func (s *BlockchainBrowserLatestBlock) SetCreateTime(v int64) *BlockchainBrowserLatestBlock {
	s.CreateTime = &v
	return s
}

func (s *BlockchainBrowserLatestBlock) SetHeight(v int64) *BlockchainBrowserLatestBlock {
	s.Height = &v
	return s
}

func (s *BlockchainBrowserLatestBlock) SetPreviousHash(v string) *BlockchainBrowserLatestBlock {
	s.PreviousHash = &v
	return s
}

func (s *BlockchainBrowserLatestBlock) SetRootTxHash(v string) *BlockchainBrowserLatestBlock {
	s.RootTxHash = &v
	return s
}

func (s *BlockchainBrowserLatestBlock) SetSize(v int64) *BlockchainBrowserLatestBlock {
	s.Size = &v
	return s
}

func (s *BlockchainBrowserLatestBlock) SetTransactionSize(v int64) *BlockchainBrowserLatestBlock {
	s.TransactionSize = &v
	return s
}

func (s *BlockchainBrowserLatestBlock) SetVersion(v int64) *BlockchainBrowserLatestBlock {
	s.Version = &v
	return s
}

// VC传输确认
type VcTransmitCnf struct {
	// 针对tx_hash的签名
	// example:
	//
	// 123123123
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
	// 交易hash
	// example:
	//
	// 1232123
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// vc传输目标did
	// example:
	//
	// 验证者id
	VerifierId *string `json:"verifier_id,omitempty" xml:"verifier_id,omitempty" require:"true"`
}

func (s VcTransmitCnf) String() string {
	return tea.Prettify(s)
}

func (s VcTransmitCnf) GoString() string {
	return s.String()
}

func (s *VcTransmitCnf) SetSignature(v string) *VcTransmitCnf {
	s.Signature = &v
	return s
}

func (s *VcTransmitCnf) SetTxHash(v string) *VcTransmitCnf {
	s.TxHash = &v
	return s
}

func (s *VcTransmitCnf) SetVerifierId(v string) *VcTransmitCnf {
	s.VerifierId = &v
	return s
}

// 阿里云区块链小程序用户权限查询
type ALiYunChainMiniAppUserPrivilege struct {
	// ant_chain_id
	// example:
	//
	// ant_chain_id
	AntChainId *string `json:"ant_chain_id,omitempty" xml:"ant_chain_id,omitempty"`
	// q_r_code_type
	// example:
	//
	// q_r_code_type
	QRCodeType *string `json:"q_r_code_type,omitempty" xml:"q_r_code_type,omitempty"`
	// authorization_type
	// example:
	//
	// authorization_type
	AuthorizationType *string `json:"authorization_type,omitempty" xml:"authorization_type,omitempty"`
	// pagination
	// example:
	//
	// pagination
	Pagination *ALiYunPagination `json:"pagination,omitempty" xml:"pagination,omitempty"`
	// ALiYunChainMiniAppAuthorizedUser
	// example:
	//
	// ALiYunChainMiniAppAuthorizedUser
	AuthorizedUserList []*ALiYunChainMiniAppAuthorizedUser `json:"authorized_user_list,omitempty" xml:"authorized_user_list,omitempty" type:"Repeated"`
}

func (s ALiYunChainMiniAppUserPrivilege) String() string {
	return tea.Prettify(s)
}

func (s ALiYunChainMiniAppUserPrivilege) GoString() string {
	return s.String()
}

func (s *ALiYunChainMiniAppUserPrivilege) SetAntChainId(v string) *ALiYunChainMiniAppUserPrivilege {
	s.AntChainId = &v
	return s
}

func (s *ALiYunChainMiniAppUserPrivilege) SetQRCodeType(v string) *ALiYunChainMiniAppUserPrivilege {
	s.QRCodeType = &v
	return s
}

func (s *ALiYunChainMiniAppUserPrivilege) SetAuthorizationType(v string) *ALiYunChainMiniAppUserPrivilege {
	s.AuthorizationType = &v
	return s
}

func (s *ALiYunChainMiniAppUserPrivilege) SetPagination(v *ALiYunPagination) *ALiYunChainMiniAppUserPrivilege {
	s.Pagination = v
	return s
}

func (s *ALiYunChainMiniAppUserPrivilege) SetAuthorizedUserList(v []*ALiYunChainMiniAppAuthorizedUser) *ALiYunChainMiniAppUserPrivilege {
	s.AuthorizedUserList = v
	return s
}

// 授权服务流程信息
type ProcessInfo struct {
	// 当前处理节点
	// example:
	//
	// 1
	CurrentNode *int64 `json:"current_node,omitempty" xml:"current_node,omitempty" require:"true" minimum:"0"`
	// 扩展信息
	// example:
	//
	// 68f955a58591e80b94e6ed755722abab4d665936a59bbe6482dd0be9aad21d9a
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
	// 节点列表
	Nodes []*NodeDetail `json:"nodes,omitempty" xml:"nodes,omitempty" require:"true" type:"Repeated"`
	// 流程ID
	// example:
	//
	// 68f955a58591e80b94e6ed755722abab4d665936a59bbe6482dd0be9aad21d9a
	ProcessId *string `json:"process_id,omitempty" xml:"process_id,omitempty" require:"true"`
	// 流程状态
	// example:
	//
	// processing
	ProcessStatus *string `json:"process_status,omitempty" xml:"process_status,omitempty" require:"true"`
	// 流程节点总数
	// example:
	//
	// 1
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty" require:"true" minimum:"0"`
	// 数据对象ID
	// example:
	//
	// did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
}

func (s ProcessInfo) String() string {
	return tea.Prettify(s)
}

func (s ProcessInfo) GoString() string {
	return s.String()
}

func (s *ProcessInfo) SetCurrentNode(v int64) *ProcessInfo {
	s.CurrentNode = &v
	return s
}

func (s *ProcessInfo) SetExtensionInfo(v string) *ProcessInfo {
	s.ExtensionInfo = &v
	return s
}

func (s *ProcessInfo) SetNodes(v []*NodeDetail) *ProcessInfo {
	s.Nodes = v
	return s
}

func (s *ProcessInfo) SetProcessId(v string) *ProcessInfo {
	s.ProcessId = &v
	return s
}

func (s *ProcessInfo) SetProcessStatus(v string) *ProcessInfo {
	s.ProcessStatus = &v
	return s
}

func (s *ProcessInfo) SetTotalCount(v int64) *ProcessInfo {
	s.TotalCount = &v
	return s
}

func (s *ProcessInfo) SetDataId(v string) *ProcessInfo {
	s.DataId = &v
	return s
}

// 阿里云区块链售卖资源信息
type ALiYunChainResouceForSale struct {
	// region_id
	// example:
	//
	// region_id
	RegionId *string `json:"region_id,omitempty" xml:"region_id,omitempty"`
	// type_list
	// example:
	//
	// type_list
	TypeList []*string `json:"type_list,omitempty" xml:"type_list,omitempty" type:"Repeated"`
}

func (s ALiYunChainResouceForSale) String() string {
	return tea.Prettify(s)
}

func (s ALiYunChainResouceForSale) GoString() string {
	return s.String()
}

func (s *ALiYunChainResouceForSale) SetRegionId(v string) *ALiYunChainResouceForSale {
	s.RegionId = &v
	return s
}

func (s *ALiYunChainResouceForSale) SetTypeList(v []*string) *ALiYunChainResouceForSale {
	s.TypeList = v
	return s
}

// 数字资产管理平台账户映射结构
type ExchangeAccountMap struct {
	// 用户联系方式
	// example:
	//
	// 13473121212
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty" require:"true"`
	// 用户账户
	// example:
	//
	// testAccount
	UserAccount *string `json:"user_account,omitempty" xml:"user_account,omitempty" require:"true"`
	// 用户名称
	// example:
	//
	// 小明
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
}

func (s ExchangeAccountMap) String() string {
	return tea.Prettify(s)
}

func (s ExchangeAccountMap) GoString() string {
	return s.String()
}

func (s *ExchangeAccountMap) SetPhone(v string) *ExchangeAccountMap {
	s.Phone = &v
	return s
}

func (s *ExchangeAccountMap) SetUserAccount(v string) *ExchangeAccountMap {
	s.UserAccount = &v
	return s
}

func (s *ExchangeAccountMap) SetUserName(v string) *ExchangeAccountMap {
	s.UserName = &v
	return s
}

// 阿里云区块链创建信息
type ALiYunChainExecuteOrder struct {
	// user_request_id
	// example:
	//
	// user_request_id
	UserRequestId *string `json:"user_request_id,omitempty" xml:"user_request_id,omitempty"`
	// data
	// example:
	//
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// success
	// example:
	//
	// true, false
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// code
	// example:
	//
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// message
	// example:
	//
	// message
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// synchro
	// example:
	//
	// true, false
	Synchro *bool `json:"synchro,omitempty" xml:"synchro,omitempty"`
}

func (s ALiYunChainExecuteOrder) String() string {
	return tea.Prettify(s)
}

func (s ALiYunChainExecuteOrder) GoString() string {
	return s.String()
}

func (s *ALiYunChainExecuteOrder) SetUserRequestId(v string) *ALiYunChainExecuteOrder {
	s.UserRequestId = &v
	return s
}

func (s *ALiYunChainExecuteOrder) SetData(v string) *ALiYunChainExecuteOrder {
	s.Data = &v
	return s
}

func (s *ALiYunChainExecuteOrder) SetSuccess(v bool) *ALiYunChainExecuteOrder {
	s.Success = &v
	return s
}

func (s *ALiYunChainExecuteOrder) SetCode(v string) *ALiYunChainExecuteOrder {
	s.Code = &v
	return s
}

func (s *ALiYunChainExecuteOrder) SetMessage(v string) *ALiYunChainExecuteOrder {
	s.Message = &v
	return s
}

func (s *ALiYunChainExecuteOrder) SetSynchro(v bool) *ALiYunChainExecuteOrder {
	s.Synchro = &v
	return s
}

// 授权服务产品
type AuthProduct struct {
	// 产品code
	// example:
	//
	// SOCIAL_INSURANCE
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 产品简称
	// example:
	//
	// 社保
	ProductAbbr *string `json:"product_abbr,omitempty" xml:"product_abbr,omitempty" require:"true"`
}

func (s AuthProduct) String() string {
	return tea.Prettify(s)
}

func (s AuthProduct) GoString() string {
	return s.String()
}

func (s *AuthProduct) SetProductCode(v string) *AuthProduct {
	s.ProductCode = &v
	return s
}

func (s *AuthProduct) SetProductAbbr(v string) *AuthProduct {
	s.ProductAbbr = &v
	return s
}

// 账户映射的具体信息
type AccountMap struct {
	// 要映射的链对应的唯一id
	// example:
	//
	// 12345
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 0: 身份证；1：手机；2: 电子邮箱；3: 企业营业执照号
	// example:
	//
	// 0
	EntityInfoType *int64 `json:"entity_info_type,omitempty" xml:"entity_info_type,omitempty"`
	// 对应entity_info_type的具体值
	//
	// example:
	//
	// 18701207322
	EntityInfoValue *string `json:"entity_info_value,omitempty" xml:"entity_info_value,omitempty"`
	// 账户对应实体的全名
	// example:
	//
	// huihui.liu
	FullName *string `json:"full_name,omitempty" xml:"full_name,omitempty"`
	// 该账户在指定链上的状态1，激活，2，冻结，新建账户只能为1
	Status *int64 `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 希望映射后在链上的账户名
	// example:
	//
	// huihui_online
	TargetName *string `json:"target_name,omitempty" xml:"target_name,omitempty"`
	// 该账户对应实体的类型：0， 个人； 1， 企业
	// example:
	//
	// 1
	Type *int64 `json:"type,omitempty" xml:"type,omitempty"`
	// 自有系统中该账户的唯一标示
	// example:
	//
	// huihui
	Uid *string `json:"uid,omitempty" xml:"uid,omitempty" require:"true"`
}

func (s AccountMap) String() string {
	return tea.Prettify(s)
}

func (s AccountMap) GoString() string {
	return s.String()
}

func (s *AccountMap) SetBizid(v string) *AccountMap {
	s.Bizid = &v
	return s
}

func (s *AccountMap) SetEntityInfoType(v int64) *AccountMap {
	s.EntityInfoType = &v
	return s
}

func (s *AccountMap) SetEntityInfoValue(v string) *AccountMap {
	s.EntityInfoValue = &v
	return s
}

func (s *AccountMap) SetFullName(v string) *AccountMap {
	s.FullName = &v
	return s
}

func (s *AccountMap) SetStatus(v int64) *AccountMap {
	s.Status = &v
	return s
}

func (s *AccountMap) SetTargetName(v string) *AccountMap {
	s.TargetName = &v
	return s
}

func (s *AccountMap) SetType(v int64) *AccountMap {
	s.Type = &v
	return s
}

func (s *AccountMap) SetUid(v string) *AccountMap {
	s.Uid = &v
	return s
}

// 任务列表分页结构体
type PageTaskListDTO struct {
	// 任务列表集合
	Content []*TaskListInfoDTO `json:"content,omitempty" xml:"content,omitempty" require:"true" type:"Repeated"`
	// 总记录条目
	// example:
	//
	// 6
	TotalElements *int64 `json:"total_elements,omitempty" xml:"total_elements,omitempty" require:"true"`
	// 记录总页数
	// example:
	//
	// 20
	TotalPages *int64 `json:"total_pages,omitempty" xml:"total_pages,omitempty" require:"true"`
	// 页码
	// example:
	//
	// 0
	Number *int64 `json:"number,omitempty" xml:"number,omitempty" require:"true"`
	// 每页记录条目
	// example:
	//
	// 6
	Size *int64 `json:"size,omitempty" xml:"size,omitempty" require:"true"`
	// 每页元素个数
	NumberOfElements *int64 `json:"number_of_elements,omitempty" xml:"number_of_elements,omitempty" require:"true"`
}

func (s PageTaskListDTO) String() string {
	return tea.Prettify(s)
}

func (s PageTaskListDTO) GoString() string {
	return s.String()
}

func (s *PageTaskListDTO) SetContent(v []*TaskListInfoDTO) *PageTaskListDTO {
	s.Content = v
	return s
}

func (s *PageTaskListDTO) SetTotalElements(v int64) *PageTaskListDTO {
	s.TotalElements = &v
	return s
}

func (s *PageTaskListDTO) SetTotalPages(v int64) *PageTaskListDTO {
	s.TotalPages = &v
	return s
}

func (s *PageTaskListDTO) SetNumber(v int64) *PageTaskListDTO {
	s.Number = &v
	return s
}

func (s *PageTaskListDTO) SetSize(v int64) *PageTaskListDTO {
	s.Size = &v
	return s
}

func (s *PageTaskListDTO) SetNumberOfElements(v int64) *PageTaskListDTO {
	s.NumberOfElements = &v
	return s
}

// 服务端签名oss的url然后client直传文件到oss，此结构包含了服务端签名后的数据。
type PresignedUrlPolicy struct {
	// oss访问的临时access id
	// example:
	//
	// LTAIR4HVnajwxdUK
	AccessId *string `json:"access_id,omitempty" xml:"access_id,omitempty" require:"true"`
	// 一个需要回调通知服务端的方法名，非必填
	// example:
	//
	// callBackFunction
	Callback *string `json:"callback,omitempty" xml:"callback,omitempty"`
	// oss上的文件存放路径
	// example:
	//
	// contract/abi/lP9v5bJsvY1566977941329
	Dir *string `json:"dir,omitempty" xml:"dir,omitempty" require:"true"`
	// url超期的时间戳说明
	// example:
	//
	// 1566977971
	Expire *string `json:"expire,omitempty" xml:"expire,omitempty" require:"true"`
	// oss的地址
	// example:
	//
	// https://baas-XXX.oss-cn-shanghai.aliyuncs.com
	Host *string `json:"host,omitempty" xml:"host,omitempty" require:"true"`
	// 被base64编码的policy内容
	// example:
	//
	// eyJleHBpcmF0aW9uIjoiMjAxOS0wOC0yOFQwNzozOTozMS4zMjlaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjBdLFsic3RhcnRzLXdpdGgiLCIka2V5IiwiY29udHJhY3QvYWJpL2xQOXY1YkpzdlkxNTY2OTc3OTQxMzI5Il1dfQ==
	Policy *string `json:"policy,omitempty" xml:"policy,omitempty" require:"true"`
	// 签名结果
	// example:
	//
	// sQEa/Q8F/e5jqDWPvTVYtZ5Ysbw=
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
}

func (s PresignedUrlPolicy) String() string {
	return tea.Prettify(s)
}

func (s PresignedUrlPolicy) GoString() string {
	return s.String()
}

func (s *PresignedUrlPolicy) SetAccessId(v string) *PresignedUrlPolicy {
	s.AccessId = &v
	return s
}

func (s *PresignedUrlPolicy) SetCallback(v string) *PresignedUrlPolicy {
	s.Callback = &v
	return s
}

func (s *PresignedUrlPolicy) SetDir(v string) *PresignedUrlPolicy {
	s.Dir = &v
	return s
}

func (s *PresignedUrlPolicy) SetExpire(v string) *PresignedUrlPolicy {
	s.Expire = &v
	return s
}

func (s *PresignedUrlPolicy) SetHost(v string) *PresignedUrlPolicy {
	s.Host = &v
	return s
}

func (s *PresignedUrlPolicy) SetPolicy(v string) *PresignedUrlPolicy {
	s.Policy = &v
	return s
}

func (s *PresignedUrlPolicy) SetSignature(v string) *PresignedUrlPolicy {
	s.Signature = &v
	return s
}

// 更新did auth paylod结构体
type UpdateDidAuthPayload struct {
	// 新公钥的实际控制者
	// example:
	//
	// did:mychain:xxxx
	Controller *string `json:"controller,omitempty" xml:"controller,omitempty" require:"true"`
	// 旧Auth Key的过期时间
	// example:
	//
	// 1567890
	PreviousAuthKeyExpire *string `json:"previous_auth_key_expire,omitempty" xml:"previous_auth_key_expire,omitempty" require:"true"`
	// 更新Did doc的版本
	// example:
	//
	// 1
	PreviousVersion *int64 `json:"previous_version,omitempty" xml:"previous_version,omitempty" require:"true"`
	// 新DID Auth key的public key id
	// example:
	//
	// key#3
	PublicKeyId *string `json:"public_key_id,omitempty" xml:"public_key_id,omitempty" require:"true"`
	// 密钥对生成算法
	// example:
	//
	// RsaVerificationKey2018
	PublicKeyType *string `json:"public_key_type,omitempty" xml:"public_key_type,omitempty" require:"true"`
	// 公钥的实际值
	// example:
	//
	// xxxxxx
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s UpdateDidAuthPayload) String() string {
	return tea.Prettify(s)
}

func (s UpdateDidAuthPayload) GoString() string {
	return s.String()
}

func (s *UpdateDidAuthPayload) SetController(v string) *UpdateDidAuthPayload {
	s.Controller = &v
	return s
}

func (s *UpdateDidAuthPayload) SetPreviousAuthKeyExpire(v string) *UpdateDidAuthPayload {
	s.PreviousAuthKeyExpire = &v
	return s
}

func (s *UpdateDidAuthPayload) SetPreviousVersion(v int64) *UpdateDidAuthPayload {
	s.PreviousVersion = &v
	return s
}

func (s *UpdateDidAuthPayload) SetPublicKeyId(v string) *UpdateDidAuthPayload {
	s.PublicKeyId = &v
	return s
}

func (s *UpdateDidAuthPayload) SetPublicKeyType(v string) *UpdateDidAuthPayload {
	s.PublicKeyType = &v
	return s
}

func (s *UpdateDidAuthPayload) SetValue(v string) *UpdateDidAuthPayload {
	s.Value = &v
	return s
}

// 获取Afts上传地址和token
type GetAftsUploadUrlRequest struct {
	// 问件类型
	// example:
	//
	// csv
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
}

func (s GetAftsUploadUrlRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAftsUploadUrlRequest) GoString() string {
	return s.String()
}

func (s *GetAftsUploadUrlRequest) SetFileType(v string) *GetAftsUploadUrlRequest {
	s.FileType = &v
	return s
}

// did详情
type DidDetail struct {
	// 控制者的did描述符
	// example:
	//
	// did:mychain:xxxx
	Controller *string `json:"controller,omitempty" xml:"controller,omitempty" require:"true"`
	// did描述符
	// example:
	//
	// did:mychain:xxxxx
	Did *string `json:"did,omitempty" xml:"did,omitempty" require:"true"`
	// did doc
	// example:
	//
	// json字段
	DidDoc *string `json:"did_doc,omitempty" xml:"did_doc,omitempty" require:"true"`
}

func (s DidDetail) String() string {
	return tea.Prettify(s)
}

func (s DidDetail) GoString() string {
	return s.String()
}

func (s *DidDetail) SetController(v string) *DidDetail {
	s.Controller = &v
	return s
}

func (s *DidDetail) SetDid(v string) *DidDetail {
	s.Did = &v
	return s
}

func (s *DidDetail) SetDidDoc(v string) *DidDetail {
	s.DidDoc = &v
	return s
}

// 蚂蚁链浏览器区块信息
type BlockchainBrowserBlock struct {
	// bizid
	// example:
	//
	// 27ce375122ef483691488395808e009e
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// blockchain_name
	// example:
	//
	// BAASQATEST
	BlockchainName *string `json:"blockchain_name,omitempty" xml:"blockchain_name,omitempty" require:"true"`
	// blockchain_status
	// example:
	//
	// true
	BlockchainStatus *bool `json:"blockchain_status,omitempty" xml:"blockchain_status,omitempty" require:"true"`
	// block_hash
	// example:
	//
	// 4a6306e001a484c5c1d198668008b4876b991c5369a18a8431e9e7b37b021694
	BlockHash *string `json:"block_hash,omitempty" xml:"block_hash,omitempty" require:"true"`
	// create_time
	// example:
	//
	// 1604565300002
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty" require:"true"`
	// hash_status
	// example:
	//
	// true, false
	HashStatus *bool `json:"hash_status,omitempty" xml:"hash_status,omitempty" require:"true"`
	// height
	// example:
	//
	// 6814087
	Height *int64 `json:"height,omitempty" xml:"height,omitempty" require:"true"`
	// previous_hash
	// example:
	//
	// e70b3768125ac3543ba0c823fa56500eb4516c165cb7fd1489961fac961ee5f1
	PreviousHash *string `json:"previous_hash,omitempty" xml:"previous_hash,omitempty" require:"true"`
	// root_tx_hash
	// example:
	//
	// 711f000e6604bf49bc4434b8ecd57ac98c0519e817d8f75bf6eef3caea7a0d79
	RootTxHash *string `json:"root_tx_hash,omitempty" xml:"root_tx_hash,omitempty" require:"true"`
	// transaction_list
	// example:
	//
	// transaction_list
	TransactionList []*BlockchainBrowserTransaction `json:"transaction_list,omitempty" xml:"transaction_list,omitempty" require:"true" type:"Repeated"`
	// transaction_size
	// example:
	//
	// 11
	TransactionSize *int64 `json:"transaction_size,omitempty" xml:"transaction_size,omitempty" require:"true"`
}

func (s BlockchainBrowserBlock) String() string {
	return tea.Prettify(s)
}

func (s BlockchainBrowserBlock) GoString() string {
	return s.String()
}

func (s *BlockchainBrowserBlock) SetBizid(v string) *BlockchainBrowserBlock {
	s.Bizid = &v
	return s
}

func (s *BlockchainBrowserBlock) SetBlockchainName(v string) *BlockchainBrowserBlock {
	s.BlockchainName = &v
	return s
}

func (s *BlockchainBrowserBlock) SetBlockchainStatus(v bool) *BlockchainBrowserBlock {
	s.BlockchainStatus = &v
	return s
}

func (s *BlockchainBrowserBlock) SetBlockHash(v string) *BlockchainBrowserBlock {
	s.BlockHash = &v
	return s
}

func (s *BlockchainBrowserBlock) SetCreateTime(v int64) *BlockchainBrowserBlock {
	s.CreateTime = &v
	return s
}

func (s *BlockchainBrowserBlock) SetHashStatus(v bool) *BlockchainBrowserBlock {
	s.HashStatus = &v
	return s
}

func (s *BlockchainBrowserBlock) SetHeight(v int64) *BlockchainBrowserBlock {
	s.Height = &v
	return s
}

func (s *BlockchainBrowserBlock) SetPreviousHash(v string) *BlockchainBrowserBlock {
	s.PreviousHash = &v
	return s
}

func (s *BlockchainBrowserBlock) SetRootTxHash(v string) *BlockchainBrowserBlock {
	s.RootTxHash = &v
	return s
}

func (s *BlockchainBrowserBlock) SetTransactionList(v []*BlockchainBrowserTransaction) *BlockchainBrowserBlock {
	s.TransactionList = v
	return s
}

func (s *BlockchainBrowserBlock) SetTransactionSize(v int64) *BlockchainBrowserBlock {
	s.TransactionSize = &v
	return s
}

// 任务人群配置
type TaskCrowdNodeDTO struct {
	// 节点ID
	// example:
	//
	// c1bff3fe-f1fb-42a2-8fc7-9cbb1a011713
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty" require:"true"`
	// 节点类型
	// example:
	//
	// GROUP、AND
	NodeType *string `json:"node_type,omitempty" xml:"node_type,omitempty" require:"true"`
	// 是否排除
	// example:
	//
	// true, false
	Exclude *bool `json:"exclude,omitempty" xml:"exclude,omitempty" require:"true"`
	// 节点配置
	// example:
	//
	// "nodeConfig": { "tagCode": "P0010GC6", "valueList": [ { "selectedValues": [ "18", "30" ], "operator": "BT" } ], "tagType": "BASE" }
	NodeConfig *string `json:"node_config,omitempty" xml:"node_config,omitempty" require:"true"`
}

func (s TaskCrowdNodeDTO) String() string {
	return tea.Prettify(s)
}

func (s TaskCrowdNodeDTO) GoString() string {
	return s.String()
}

func (s *TaskCrowdNodeDTO) SetNodeId(v string) *TaskCrowdNodeDTO {
	s.NodeId = &v
	return s
}

func (s *TaskCrowdNodeDTO) SetNodeType(v string) *TaskCrowdNodeDTO {
	s.NodeType = &v
	return s
}

func (s *TaskCrowdNodeDTO) SetExclude(v bool) *TaskCrowdNodeDTO {
	s.Exclude = &v
	return s
}

func (s *TaskCrowdNodeDTO) SetNodeConfig(v string) *TaskCrowdNodeDTO {
	s.NodeConfig = &v
	return s
}

// 人群匹配结果
type MatchResult struct {
	// 是否匹配
	// example:
	//
	// true, false
	Match *bool `json:"match,omitempty" xml:"match,omitempty" require:"true"`
}

func (s MatchResult) String() string {
	return tea.Prettify(s)
}

func (s MatchResult) GoString() string {
	return s.String()
}

func (s *MatchResult) SetMatch(v bool) *MatchResult {
	s.Match = &v
	return s
}

// 阿里云蚂蚁区块链信息
type ALiYunChain struct {
	// notary_blockchain
	// example:
	//
	// notary_blockchain
	NotaryBlockchain *ALiYunNotaryBlockchain `json:"notary_blockchain,omitempty" xml:"notary_blockchain,omitempty"`
	// contract_blockchain
	// example:
	//
	// contract_blockchain
	ContractBlockchain *ALiYunContractBlockchain `json:"contract_blockchain,omitempty" xml:"contract_blockchain,omitempty"`
	// old_contract_blockchain
	// example:
	//
	// old_contract_blockchain
	OldContractBlockchain *ALiYunOldContractBlockchain `json:"old_contract_blockchain,omitempty" xml:"old_contract_blockchain,omitempty"`
}

func (s ALiYunChain) String() string {
	return tea.Prettify(s)
}

func (s ALiYunChain) GoString() string {
	return s.String()
}

func (s *ALiYunChain) SetNotaryBlockchain(v *ALiYunNotaryBlockchain) *ALiYunChain {
	s.NotaryBlockchain = v
	return s
}

func (s *ALiYunChain) SetContractBlockchain(v *ALiYunContractBlockchain) *ALiYunChain {
	s.ContractBlockchain = v
	return s
}

func (s *ALiYunChain) SetOldContractBlockchain(v *ALiYunOldContractBlockchain) *ALiYunChain {
	s.OldContractBlockchain = v
	return s
}

// 营销分销平台返佣信息
type RakeBackInfo struct {
	// 推广层级
	// example:
	//
	// 1
	Level *int64 `json:"level,omitempty" xml:"level,omitempty" require:"true"`
	// 上级推广订单id
	// example:
	//
	// test id
	ParentId *string `json:"parent_id,omitempty" xml:"parent_id,omitempty" require:"true"`
	// 推广人id
	// example:
	//
	// test id
	PromoterId *string `json:"promoter_id,omitempty" xml:"promoter_id,omitempty" require:"true"`
	// 返佣额度
	// example:
	//
	// 10.5
	Quota *string `json:"quota,omitempty" xml:"quota,omitempty" require:"true"`
	// 返佣比例 10表示10%
	// example:
	//
	// 10
	Rate *string `json:"rate,omitempty" xml:"rate,omitempty" require:"true"`
}

func (s RakeBackInfo) String() string {
	return tea.Prettify(s)
}

func (s RakeBackInfo) GoString() string {
	return s.String()
}

func (s *RakeBackInfo) SetLevel(v int64) *RakeBackInfo {
	s.Level = &v
	return s
}

func (s *RakeBackInfo) SetParentId(v string) *RakeBackInfo {
	s.ParentId = &v
	return s
}

func (s *RakeBackInfo) SetPromoterId(v string) *RakeBackInfo {
	s.PromoterId = &v
	return s
}

func (s *RakeBackInfo) SetQuota(v string) *RakeBackInfo {
	s.Quota = &v
	return s
}

func (s *RakeBackInfo) SetRate(v string) *RakeBackInfo {
	s.Rate = &v
	return s
}

// 阿里云区块链小程序交易查询信息
type ALiYunChainMiniAppTransaction struct {
	// authorized
	// example:
	//
	// true,false
	Authorized *bool `json:"authorized,omitempty" xml:"authorized,omitempty"`
	// transaction_response
	// example:
	//
	// transaction_response
	TransactionResponse *string `json:"transaction_response,omitempty" xml:"transaction_response,omitempty"`
	// transaction_receipt
	// example:
	//
	// transaction_receipt
	TransactionReceipt *string `json:"transaction_receipt,omitempty" xml:"transaction_receipt,omitempty"`
}

func (s ALiYunChainMiniAppTransaction) String() string {
	return tea.Prettify(s)
}

func (s ALiYunChainMiniAppTransaction) GoString() string {
	return s.String()
}

func (s *ALiYunChainMiniAppTransaction) SetAuthorized(v bool) *ALiYunChainMiniAppTransaction {
	s.Authorized = &v
	return s
}

func (s *ALiYunChainMiniAppTransaction) SetTransactionResponse(v string) *ALiYunChainMiniAppTransaction {
	s.TransactionResponse = &v
	return s
}

func (s *ALiYunChainMiniAppTransaction) SetTransactionReceipt(v string) *ALiYunChainMiniAppTransaction {
	s.TransactionReceipt = &v
	return s
}

// 阿里云托管账户信息
type ALiYunChainKmsAccount struct {
	// 账户公钥
	// example:
	//
	// 1234567890
	PubKey *string `json:"pub_key,omitempty" xml:"pub_key,omitempty"`
	// 托管秘钥ID
	// example:
	//
	// 1234567890
	MyKmsKeyId *string `json:"my_kms_key_id,omitempty" xml:"my_kms_key_id,omitempty"`
}

func (s ALiYunChainKmsAccount) String() string {
	return tea.Prettify(s)
}

func (s ALiYunChainKmsAccount) GoString() string {
	return s.String()
}

func (s *ALiYunChainKmsAccount) SetPubKey(v string) *ALiYunChainKmsAccount {
	s.PubKey = &v
	return s
}

func (s *ALiYunChainKmsAccount) SetMyKmsKeyId(v string) *ALiYunChainKmsAccount {
	s.MyKmsKeyId = &v
	return s
}

// 物流金融平台用户信息
type LogisticFinUser struct {
	// 纳税人识别号
	// example:
	//
	// 789
	DraweeTaxNo *string `json:"drawee_tax_no,omitempty" xml:"drawee_tax_no,omitempty" require:"true"`
	// 业务方企业id
	// example:
	//
	// 123
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty" require:"true"`
	// 业务方用户id
	// example:
	//
	// 456
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s LogisticFinUser) String() string {
	return tea.Prettify(s)
}

func (s LogisticFinUser) GoString() string {
	return s.String()
}

func (s *LogisticFinUser) SetDraweeTaxNo(v string) *LogisticFinUser {
	s.DraweeTaxNo = &v
	return s
}

func (s *LogisticFinUser) SetOrgId(v string) *LogisticFinUser {
	s.OrgId = &v
	return s
}

func (s *LogisticFinUser) SetUserId(v string) *LogisticFinUser {
	s.UserId = &v
	return s
}

// 合约查询
type ContractQueryDetailReq struct {
	// 服务ID
	// example:
	//
	// cme20230724104931af3a4d
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s ContractQueryDetailReq) String() string {
	return tea.Prettify(s)
}

func (s ContractQueryDetailReq) GoString() string {
	return s.String()
}

func (s *ContractQueryDetailReq) SetServiceId(v string) *ContractQueryDetailReq {
	s.ServiceId = &v
	return s
}

// 车辆基本信息
type CarInfo struct {
	// 车牌号
	// example:
	//
	// xxx
	LicenseNo *string `json:"license_no,omitempty" xml:"license_no,omitempty" require:"true"`
	// 车架号
	// example:
	//
	// xx
	Vin *string `json:"vin,omitempty" xml:"vin,omitempty" require:"true"`
	// 发动机号
	// example:
	//
	// xxx
	EngineNo *string `json:"engine_no,omitempty" xml:"engine_no,omitempty" require:"true"`
	//
	// 注册日期
	// example:
	//
	// xxxx
	RegisterDate *string `json:"register_date,omitempty" xml:"register_date,omitempty" require:"true"`
	// 车型
	// example:
	//
	// xxx
	ModelCode *string `json:"model_code,omitempty" xml:"model_code,omitempty" require:"true"`
}

func (s CarInfo) String() string {
	return tea.Prettify(s)
}

func (s CarInfo) GoString() string {
	return s.String()
}

func (s *CarInfo) SetLicenseNo(v string) *CarInfo {
	s.LicenseNo = &v
	return s
}

func (s *CarInfo) SetVin(v string) *CarInfo {
	s.Vin = &v
	return s
}

func (s *CarInfo) SetEngineNo(v string) *CarInfo {
	s.EngineNo = &v
	return s
}

func (s *CarInfo) SetRegisterDate(v string) *CarInfo {
	s.RegisterDate = &v
	return s
}

func (s *CarInfo) SetModelCode(v string) *CarInfo {
	s.ModelCode = &v
	return s
}

// 智能合约市场列表查询
type ContractTemplateQueryReq struct {
	// 页码
	// example:
	//
	// 1
	Num *int64 `json:"num,omitempty" xml:"num,omitempty" require:"true"`
	// 页大小
	// example:
	//
	// 200
	Size *int64 `json:"size,omitempty" xml:"size,omitempty" require:"true"`
}

func (s ContractTemplateQueryReq) String() string {
	return tea.Prettify(s)
}

func (s ContractTemplateQueryReq) GoString() string {
	return s.String()
}

func (s *ContractTemplateQueryReq) SetNum(v int64) *ContractTemplateQueryReq {
	s.Num = &v
	return s
}

func (s *ContractTemplateQueryReq) SetSize(v int64) *ContractTemplateQueryReq {
	s.Size = &v
	return s
}

// 分销会员用户信息
type DistributionUser struct {
	// 用户创建时间
	// example:
	//
	// 2018-01-02 20:00:00
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty" require:"true"`
	// 用户手机号
	// example:
	//
	// 13000005555
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 用户唯一标识
	// example:
	//
	// 000:111:222:333
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s DistributionUser) String() string {
	return tea.Prettify(s)
}

func (s DistributionUser) GoString() string {
	return s.String()
}

func (s *DistributionUser) SetCreateTime(v string) *DistributionUser {
	s.CreateTime = &v
	return s
}

func (s *DistributionUser) SetMobile(v string) *DistributionUser {
	s.Mobile = &v
	return s
}

func (s *DistributionUser) SetUserId(v string) *DistributionUser {
	s.UserId = &v
	return s
}

// 智能合约市场列表
type ContractTemplateListResp struct {
	// 合约市场列表
	List []*ContractTemplateResp `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
	// 总数
	// example:
	//
	// 200
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s ContractTemplateListResp) String() string {
	return tea.Prettify(s)
}

func (s ContractTemplateListResp) GoString() string {
	return s.String()
}

func (s *ContractTemplateListResp) SetList(v []*ContractTemplateResp) *ContractTemplateListResp {
	s.List = v
	return s
}

func (s *ContractTemplateListResp) SetTotal(v int64) *ContractTemplateListResp {
	s.Total = &v
	return s
}

// 授权流程操作结果
type ProcessResult struct {
	// 申请权限的扩展参数
	// example:
	//
	// test
	Extension *string `json:"extension,omitempty" xml:"extension,omitempty"`
	// 申请权限原因
	// example:
	//
	// test
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 下一个处理节点ID
	// example:
	//
	// did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
	Next *string `json:"next,omitempty" xml:"next,omitempty"`
	// 流程ID
	// example:
	//
	// 68f955a58591e80b94e6ed755722abab4d665936a59bbe6482dd0be9aad21d9a
	ProcessId *string `json:"process_id,omitempty" xml:"process_id,omitempty" require:"true"`
	// 流程状态
	// example:
	//
	// processing
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 数据对象ID
	// example:
	//
	// did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 交易HASH
	// example:
	//
	// AQEETAAAAEEAAAAETbYFwqfIiyqFWt2Tasr2f4
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 区块高度
	// example:
	//
	// 1256
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 授权凭证
	// example:
	//
	// JSON格式
	AuthorityCert *string `json:"authority_cert,omitempty" xml:"authority_cert,omitempty"`
}

func (s ProcessResult) String() string {
	return tea.Prettify(s)
}

func (s ProcessResult) GoString() string {
	return s.String()
}

func (s *ProcessResult) SetExtension(v string) *ProcessResult {
	s.Extension = &v
	return s
}

func (s *ProcessResult) SetMessage(v string) *ProcessResult {
	s.Message = &v
	return s
}

func (s *ProcessResult) SetNext(v string) *ProcessResult {
	s.Next = &v
	return s
}

func (s *ProcessResult) SetProcessId(v string) *ProcessResult {
	s.ProcessId = &v
	return s
}

func (s *ProcessResult) SetStatus(v string) *ProcessResult {
	s.Status = &v
	return s
}

func (s *ProcessResult) SetDataId(v string) *ProcessResult {
	s.DataId = &v
	return s
}

func (s *ProcessResult) SetTxHash(v string) *ProcessResult {
	s.TxHash = &v
	return s
}

func (s *ProcessResult) SetBlockNumber(v int64) *ProcessResult {
	s.BlockNumber = &v
	return s
}

func (s *ProcessResult) SetAuthorityCert(v string) *ProcessResult {
	s.AuthorityCert = &v
	return s
}

// 数据授权服务用户公钥结构体
type PublicKey struct {
	// 公钥颁发者ID
	// example:
	//
	// did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
	IssuerId *string `json:"issuer_id,omitempty" xml:"issuer_id,omitempty" require:"true" maxLength:"100"`
	// 公钥内容
	// example:
	//
	// AQEETAAAAEEAAAAETbYFwqfIiyqFWt2Tasr2f4+wjKcEXsFupLxM6WZohB702fTTsuw88bp7LKBskdWhDiZvpeIShOzZopg95psaFw==
	PublicKeyContent *string `json:"public_key_content,omitempty" xml:"public_key_content,omitempty" require:"true"`
	// 公钥接受者ID
	// example:
	//
	// did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
	RecipientId *string `json:"recipient_id,omitempty" xml:"recipient_id,omitempty" require:"true" maxLength:"100"`
}

func (s PublicKey) String() string {
	return tea.Prettify(s)
}

func (s PublicKey) GoString() string {
	return s.String()
}

func (s *PublicKey) SetIssuerId(v string) *PublicKey {
	s.IssuerId = &v
	return s
}

func (s *PublicKey) SetPublicKeyContent(v string) *PublicKey {
	s.PublicKeyContent = &v
	return s
}

func (s *PublicKey) SetRecipientId(v string) *PublicKey {
	s.RecipientId = &v
	return s
}

// 合约部署记录
type ContractRecord struct {
	// abi对应oss key
	// example:
	//
	// abi-oss-key
	AbiOssKey *string `json:"abi_oss_key,omitempty" xml:"abi_oss_key,omitempty" require:"true"`
	// abi oss 地址
	// example:
	//
	// abi-oss-url
	AbiOssUrl *string `json:"abi_oss_url,omitempty" xml:"abi_oss_url,omitempty"`
	// 区块链唯一标识
	// example:
	//
	// 0001bcde
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 区块链名称
	// example:
	//
	// 合约体验链
	BlockchainName *string `json:"blockchain_name,omitempty" xml:"blockchain_name,omitempty" require:"true"`
	// bytecode对应oss key
	// example:
	//
	// bytecode-oss-key
	BytecodeOssKey *string `json:"bytecode_oss_key,omitempty" xml:"bytecode_oss_key,omitempty" require:"true"`
	// bytecode oss 地址
	// example:
	//
	// bytecode-oss-url
	BytecodeOssUrl *string `json:"bytecode_oss_url,omitempty" xml:"bytecode_oss_url,omitempty"`
	// 16进制表示的合约identity
	// example:
	//
	// e7d3e769f3f593dadcb8634cc5b09fc90dd3a61c4a06a79cb0923662fe6fae6b
	Identity *string `json:"identity,omitempty" xml:"identity,omitempty" require:"true"`
	// 合约代码中定义的合约实例名，比如solidity的contract 关键字后面的命名
	// example:
	//
	// instance-name
	InstanceName *string `json:"instance_name,omitempty" xml:"instance_name,omitempty" require:"true"`
	// 合约名称
	// example:
	//
	// contract-name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 发布状态，1未发布，3已发布
	// example:
	//
	// 3
	Publish *int64 `json:"publish,omitempty" xml:"publish,omitempty" require:"true"`
	// 交易hash
	// example:
	//
	// e93372533f323b2f12783aa3a586135cf421486439c2cdcde47411b78f9839ec
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// solidity|cpp|go
	// example:
	//
	// solidity
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s ContractRecord) String() string {
	return tea.Prettify(s)
}

func (s ContractRecord) GoString() string {
	return s.String()
}

func (s *ContractRecord) SetAbiOssKey(v string) *ContractRecord {
	s.AbiOssKey = &v
	return s
}

func (s *ContractRecord) SetAbiOssUrl(v string) *ContractRecord {
	s.AbiOssUrl = &v
	return s
}

func (s *ContractRecord) SetBizid(v string) *ContractRecord {
	s.Bizid = &v
	return s
}

func (s *ContractRecord) SetBlockchainName(v string) *ContractRecord {
	s.BlockchainName = &v
	return s
}

func (s *ContractRecord) SetBytecodeOssKey(v string) *ContractRecord {
	s.BytecodeOssKey = &v
	return s
}

func (s *ContractRecord) SetBytecodeOssUrl(v string) *ContractRecord {
	s.BytecodeOssUrl = &v
	return s
}

func (s *ContractRecord) SetIdentity(v string) *ContractRecord {
	s.Identity = &v
	return s
}

func (s *ContractRecord) SetInstanceName(v string) *ContractRecord {
	s.InstanceName = &v
	return s
}

func (s *ContractRecord) SetName(v string) *ContractRecord {
	s.Name = &v
	return s
}

func (s *ContractRecord) SetPublish(v int64) *ContractRecord {
	s.Publish = &v
	return s
}

func (s *ContractRecord) SetTxHash(v string) *ContractRecord {
	s.TxHash = &v
	return s
}

func (s *ContractRecord) SetType(v string) *ContractRecord {
	s.Type = &v
	return s
}

// 蚂蚁链浏览器交易收据信息
type BlockchainBrowserTransactionReceipt struct {
	// data
	// example:
	//
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
	// gas_used
	// example:
	//
	// 0
	GasUsed *int64 `json:"gas_used,omitempty" xml:"gas_used,omitempty" require:"true"`
	// logs
	// example:
	//
	// awdawd
	Logs []*string `json:"logs,omitempty" xml:"logs,omitempty" require:"true" type:"Repeated"`
	// result
	// example:
	//
	// 0
	Result *int64 `json:"result,omitempty" xml:"result,omitempty" require:"true"`
}

func (s BlockchainBrowserTransactionReceipt) String() string {
	return tea.Prettify(s)
}

func (s BlockchainBrowserTransactionReceipt) GoString() string {
	return s.String()
}

func (s *BlockchainBrowserTransactionReceipt) SetData(v string) *BlockchainBrowserTransactionReceipt {
	s.Data = &v
	return s
}

func (s *BlockchainBrowserTransactionReceipt) SetGasUsed(v int64) *BlockchainBrowserTransactionReceipt {
	s.GasUsed = &v
	return s
}

func (s *BlockchainBrowserTransactionReceipt) SetLogs(v []*string) *BlockchainBrowserTransactionReceipt {
	s.Logs = v
	return s
}

func (s *BlockchainBrowserTransactionReceipt) SetResult(v int64) *BlockchainBrowserTransactionReceipt {
	s.Result = &v
	return s
}

// 商户站点信息（网站/APP/小程序）
type SiteInfo struct {
	// 网站类型
	// example:
	//
	// 06
	SiteType *string `json:"site_type,omitempty" xml:"site_type,omitempty" require:"true"`
	// 站点地址
	// example:
	//
	// https://open.alipay.com
	SiteUrl *string `json:"site_url,omitempty" xml:"site_url,omitempty" require:"true"`
	// 站点名称
	// example:
	//
	// XXX网站
	SiteName *string `json:"site_name,omitempty" xml:"site_name,omitempty" require:"true"`
	// 小程序 appId
	// example:
	//
	// 2021004105652035
	TinyAppId *string `json:"tiny_app_id,omitempty" xml:"tiny_app_id,omitempty" require:"true"`
}

func (s SiteInfo) String() string {
	return tea.Prettify(s)
}

func (s SiteInfo) GoString() string {
	return s.String()
}

func (s *SiteInfo) SetSiteType(v string) *SiteInfo {
	s.SiteType = &v
	return s
}

func (s *SiteInfo) SetSiteUrl(v string) *SiteInfo {
	s.SiteUrl = &v
	return s
}

func (s *SiteInfo) SetSiteName(v string) *SiteInfo {
	s.SiteName = &v
	return s
}

func (s *SiteInfo) SetTinyAppId(v string) *SiteInfo {
	s.TinyAppId = &v
	return s
}

// 数字资产管理平台批发结构
type AccountWholesaleParam struct {
	// 批发数量
	// example:
	//
	// 1000
	EpAmount *int64 `json:"ep_amount,omitempty" xml:"ep_amount,omitempty" require:"true"`
	// 用户账户
	// example:
	//
	// testAccount
	UserAccount *string `json:"user_account,omitempty" xml:"user_account,omitempty" require:"true"`
}

func (s AccountWholesaleParam) String() string {
	return tea.Prettify(s)
}

func (s AccountWholesaleParam) GoString() string {
	return s.String()
}

func (s *AccountWholesaleParam) SetEpAmount(v int64) *AccountWholesaleParam {
	s.EpAmount = &v
	return s
}

func (s *AccountWholesaleParam) SetUserAccount(v string) *AccountWholesaleParam {
	s.UserAccount = &v
	return s
}

// 发券记录列表
type List struct {
	// 记录ID
	// example:
	//
	// 1100034
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 活动ID
	// example:
	//
	// 1100001911234
	ActivityId *string `json:"activity_id,omitempty" xml:"activity_id,omitempty"`
	// 活动名称
	// example:
	//
	// xx面馆活动
	ActivityName *string `json:"activity_name,omitempty" xml:"activity_name,omitempty"`
	// 用户ID
	// example:
	//
	// 2088000098761234
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 业务ID
	// example:
	//
	// 110001011234
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 记录来源：NORMAL（正常发券）/ HAITUN_SYNC（上游补录）
	// example:
	//
	// NORMAL
	RecordSource *string `json:"record_source,omitempty" xml:"record_source,omitempty"`
	// 创建时间
	// example:
	//
	// yyyy-MM-dd HH:mm:ss
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty"`
	// 更新时间
	// example:
	//
	// yyyy-MM-dd HH:mm:ss
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty"`
}

func (s List) String() string {
	return tea.Prettify(s)
}

func (s List) GoString() string {
	return s.String()
}

func (s *List) SetId(v int64) *List {
	s.Id = &v
	return s
}

func (s *List) SetActivityId(v string) *List {
	s.ActivityId = &v
	return s
}

func (s *List) SetActivityName(v string) *List {
	s.ActivityName = &v
	return s
}

func (s *List) SetUserId(v string) *List {
	s.UserId = &v
	return s
}

func (s *List) SetBizId(v string) *List {
	s.BizId = &v
	return s
}

func (s *List) SetRecordSource(v string) *List {
	s.RecordSource = &v
	return s
}

func (s *List) SetGmtCreate(v string) *List {
	s.GmtCreate = &v
	return s
}

func (s *List) SetGmtModified(v string) *List {
	s.GmtModified = &v
	return s
}

// 更新后的任务信息
type UpdatedTaskInfo struct {
	// 任务标题(同一个租户不能重复)
	// example:
	//
	// 普通任务修改
	TaskName *string `json:"task_name,omitempty" xml:"task_name,omitempty" require:"true"`
	// appId
	// example:
	//
	// 2021004121633301
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 问卷ID
	// example:
	//
	// ybl1112
	SurveyId *string `json:"survey_id,omitempty" xml:"survey_id,omitempty" require:"true"`
	// 任务ID
	// example:
	//
	// qdQxqU5gz
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 备注信息
	// example:
	//
	// 普通任务修改测试
	Notes *string `json:"notes,omitempty" xml:"notes,omitempty"`
	// 租户ID
	// example:
	//
	// RIVUFSJG
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 操作者ID
	// example:
	//
	// eipzps@alitest.comtest
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// banner标题
	// example:
	//
	// 普通任务banner
	BannerTitle *string `json:"banner_title,omitempty" xml:"banner_title,omitempty" require:"true"`
	// banner图片地址（最多支持3张）
	// example:
	//
	// testTenant_1.png,testTenant_1.png
	BannerImageUrls *string `json:"banner_image_urls,omitempty" xml:"banner_image_urls,omitempty"`
	// banner 图片地址, 拼装后的url
	// example:
	//
	// ["testTenant_1.png","testTenant_1.png"]
	BannerImageFullUrls []*string `json:"banner_image_full_urls,omitempty" xml:"banner_image_full_urls,omitempty" type:"Repeated"`
	// 题量
	// example:
	//
	// 10
	QuestionNum *int64 `json:"question_num,omitempty" xml:"question_num,omitempty" require:"true"`
	// 任务连接地址
	// example:
	//
	// https://pro.wenjuan.com/t/a1
	TaskLinkUrl *string `json:"task_link_url,omitempty" xml:"task_link_url,omitempty" require:"true"`
	// 人群划分描述
	// example:
	//
	// 购买过健身服装的人群
	PersonDivideContent *string `json:"person_divide_content,omitempty" xml:"person_divide_content,omitempty"`
	// 城市列表
	// example:
	//
	// 新加坡,纽约,tokey
	CityDivideUrls *string `json:"city_divide_urls,omitempty" xml:"city_divide_urls,omitempty"`
	// 城市列表, 拼装后的url
	// example:
	//
	// [_新加坡_,"纽约","tokey"]
	CityDivideFullUrls []*string `json:"city_divide_full_urls,omitempty" xml:"city_divide_full_urls,omitempty" type:"Repeated"`
	// 样本数量
	// example:
	//
	// 100
	SampleNum *int64 `json:"sample_num,omitempty" xml:"sample_num,omitempty" require:"true"`
	// 完成样本量
	// example:
	//
	// 2
	CompletedNum *int64 `json:"completed_num,omitempty" xml:"completed_num,omitempty" require:"true"`
	// 产品下单code类型（1-资源包 2-后付费）
	// example:
	//
	// 1
	ProductCodeType *string `json:"product_code_type,omitempty" xml:"product_code_type,omitempty" require:"true"`
	// 产品余量
	// example:
	//
	// 13
	ProductCapacity *int64 `json:"product_capacity,omitempty" xml:"product_capacity,omitempty" require:"true"`
	// 奖励渠道（0-手动发支付宝余额 1-海豚红包 2-问卷自带）
	// example:
	//
	// 1
	PrizeChannel *int64 `json:"prize_channel,omitempty" xml:"prize_channel,omitempty" require:"true"`
	// 支付宝账号
	// example:
	//
	// kefu@lingdangshuo.com
	AlipayAccountId *string `json:"alipay_account_id,omitempty" xml:"alipay_account_id,omitempty"`
	// 奖励类型（0-定额红包）
	// example:
	//
	// 0
	PrizeType *int64 `json:"prize_type,omitempty" xml:"prize_type,omitempty" require:"true"`
	// 全额红包金额，奖励渠道为0和1时
	// example:
	//
	// 1.00
	FullRedPacketAmount *string `json:"full_red_packet_amount,omitempty" xml:"full_red_packet_amount,omitempty" require:"true"`
	// 全额红包描述，奖励渠道为2时，此处必填
	// example:
	//
	// 1-6元红包
	FullRedPacketTextInfo *string `json:"full_red_packet_text_info,omitempty" xml:"full_red_packet_text_info,omitempty"`
	// 甄别红包金额
	// example:
	//
	// 0.01
	ExamineRedPacketAmount *string `json:"examine_red_packet_amount,omitempty" xml:"examine_red_packet_amount,omitempty" require:"true"`
	// 关联的证书instanceId
	// example:
	//
	// 6511ce4b43414e9588114682bbf9a893
	CertInstanceId *string `json:"cert_instance_id,omitempty" xml:"cert_instance_id,omitempty"`
	// 证书实例详情
	CertInstanceDetail *CertInstanceDetail `json:"cert_instance_detail,omitempty" xml:"cert_instance_detail,omitempty" require:"true"`
	// 审核意见
	// example:
	//
	// 拒绝
	VerifyOmment *string `json:"verify_omment,omitempty" xml:"verify_omment,omitempty"`
	// 任务创建时间
	// example:
	//
	// 2023-12-20 12:19:00
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true"`
	// 任务修改时间
	// example:
	//
	// 2023-12-20 12:45:00
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true"`
	// 审核理由
	// example:
	//
	// 不合适
	ReviewContent *string `json:"review_content,omitempty" xml:"review_content,omitempty"`
	// 状态
	// example:
	//
	// 9
	Status *int64 `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 人群配置
	// example:
	//
	// {"exclude": false,"nodeConfig": {"groupType": "AND","children": ["exclude": false,"nodeType": "GROUP","nodeId": "1303661d-a7da-4d8a-b646-0819f2fc2855","nodeConfig": {"groupType": "AND","children": []}}]},"nodeId": "ROOT","nodeType": "GROUP"}
	CrowdConfig *string `json:"crowd_config,omitempty" xml:"crowd_config,omitempty" require:"true"`
}

func (s UpdatedTaskInfo) String() string {
	return tea.Prettify(s)
}

func (s UpdatedTaskInfo) GoString() string {
	return s.String()
}

func (s *UpdatedTaskInfo) SetTaskName(v string) *UpdatedTaskInfo {
	s.TaskName = &v
	return s
}

func (s *UpdatedTaskInfo) SetAppId(v string) *UpdatedTaskInfo {
	s.AppId = &v
	return s
}

func (s *UpdatedTaskInfo) SetSurveyId(v string) *UpdatedTaskInfo {
	s.SurveyId = &v
	return s
}

func (s *UpdatedTaskInfo) SetTaskId(v string) *UpdatedTaskInfo {
	s.TaskId = &v
	return s
}

func (s *UpdatedTaskInfo) SetNotes(v string) *UpdatedTaskInfo {
	s.Notes = &v
	return s
}

func (s *UpdatedTaskInfo) SetTenantId(v string) *UpdatedTaskInfo {
	s.TenantId = &v
	return s
}

func (s *UpdatedTaskInfo) SetOperator(v string) *UpdatedTaskInfo {
	s.Operator = &v
	return s
}

func (s *UpdatedTaskInfo) SetBannerTitle(v string) *UpdatedTaskInfo {
	s.BannerTitle = &v
	return s
}

func (s *UpdatedTaskInfo) SetBannerImageUrls(v string) *UpdatedTaskInfo {
	s.BannerImageUrls = &v
	return s
}

func (s *UpdatedTaskInfo) SetBannerImageFullUrls(v []*string) *UpdatedTaskInfo {
	s.BannerImageFullUrls = v
	return s
}

func (s *UpdatedTaskInfo) SetQuestionNum(v int64) *UpdatedTaskInfo {
	s.QuestionNum = &v
	return s
}

func (s *UpdatedTaskInfo) SetTaskLinkUrl(v string) *UpdatedTaskInfo {
	s.TaskLinkUrl = &v
	return s
}

func (s *UpdatedTaskInfo) SetPersonDivideContent(v string) *UpdatedTaskInfo {
	s.PersonDivideContent = &v
	return s
}

func (s *UpdatedTaskInfo) SetCityDivideUrls(v string) *UpdatedTaskInfo {
	s.CityDivideUrls = &v
	return s
}

func (s *UpdatedTaskInfo) SetCityDivideFullUrls(v []*string) *UpdatedTaskInfo {
	s.CityDivideFullUrls = v
	return s
}

func (s *UpdatedTaskInfo) SetSampleNum(v int64) *UpdatedTaskInfo {
	s.SampleNum = &v
	return s
}

func (s *UpdatedTaskInfo) SetCompletedNum(v int64) *UpdatedTaskInfo {
	s.CompletedNum = &v
	return s
}

func (s *UpdatedTaskInfo) SetProductCodeType(v string) *UpdatedTaskInfo {
	s.ProductCodeType = &v
	return s
}

func (s *UpdatedTaskInfo) SetProductCapacity(v int64) *UpdatedTaskInfo {
	s.ProductCapacity = &v
	return s
}

func (s *UpdatedTaskInfo) SetPrizeChannel(v int64) *UpdatedTaskInfo {
	s.PrizeChannel = &v
	return s
}

func (s *UpdatedTaskInfo) SetAlipayAccountId(v string) *UpdatedTaskInfo {
	s.AlipayAccountId = &v
	return s
}

func (s *UpdatedTaskInfo) SetPrizeType(v int64) *UpdatedTaskInfo {
	s.PrizeType = &v
	return s
}

func (s *UpdatedTaskInfo) SetFullRedPacketAmount(v string) *UpdatedTaskInfo {
	s.FullRedPacketAmount = &v
	return s
}

func (s *UpdatedTaskInfo) SetFullRedPacketTextInfo(v string) *UpdatedTaskInfo {
	s.FullRedPacketTextInfo = &v
	return s
}

func (s *UpdatedTaskInfo) SetExamineRedPacketAmount(v string) *UpdatedTaskInfo {
	s.ExamineRedPacketAmount = &v
	return s
}

func (s *UpdatedTaskInfo) SetCertInstanceId(v string) *UpdatedTaskInfo {
	s.CertInstanceId = &v
	return s
}

func (s *UpdatedTaskInfo) SetCertInstanceDetail(v *CertInstanceDetail) *UpdatedTaskInfo {
	s.CertInstanceDetail = v
	return s
}

func (s *UpdatedTaskInfo) SetVerifyOmment(v string) *UpdatedTaskInfo {
	s.VerifyOmment = &v
	return s
}

func (s *UpdatedTaskInfo) SetGmtCreate(v string) *UpdatedTaskInfo {
	s.GmtCreate = &v
	return s
}

func (s *UpdatedTaskInfo) SetGmtModified(v string) *UpdatedTaskInfo {
	s.GmtModified = &v
	return s
}

func (s *UpdatedTaskInfo) SetReviewContent(v string) *UpdatedTaskInfo {
	s.ReviewContent = &v
	return s
}

func (s *UpdatedTaskInfo) SetStatus(v int64) *UpdatedTaskInfo {
	s.Status = &v
	return s
}

func (s *UpdatedTaskInfo) SetCrowdConfig(v string) *UpdatedTaskInfo {
	s.CrowdConfig = &v
	return s
}

// 阿里云交易查询结果
type ALiYunTransactionResult struct {
	// block_hash
	// example:
	//
	// block_hash
	BlockHash *string `json:"block_hash,omitempty" xml:"block_hash,omitempty"`
	// block_height
	// example:
	//
	// 123131
	BlockHeight *int64 `json:"block_height,omitempty" xml:"block_height,omitempty"`
	// block_version
	// example:
	//
	// block_version
	BlockVersion *string `json:"block_version,omitempty" xml:"block_version,omitempty"`
	// create_time
	// example:
	//
	// 213213
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// hash
	// example:
	//
	// hash
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
	// Transaction
	// example:
	//
	// Transaction
	Transaction *ALiYunTransaction `json:"transaction,omitempty" xml:"transaction,omitempty"`
}

func (s ALiYunTransactionResult) String() string {
	return tea.Prettify(s)
}

func (s ALiYunTransactionResult) GoString() string {
	return s.String()
}

func (s *ALiYunTransactionResult) SetBlockHash(v string) *ALiYunTransactionResult {
	s.BlockHash = &v
	return s
}

func (s *ALiYunTransactionResult) SetBlockHeight(v int64) *ALiYunTransactionResult {
	s.BlockHeight = &v
	return s
}

func (s *ALiYunTransactionResult) SetBlockVersion(v string) *ALiYunTransactionResult {
	s.BlockVersion = &v
	return s
}

func (s *ALiYunTransactionResult) SetCreateTime(v int64) *ALiYunTransactionResult {
	s.CreateTime = &v
	return s
}

func (s *ALiYunTransactionResult) SetHash(v string) *ALiYunTransactionResult {
	s.Hash = &v
	return s
}

func (s *ALiYunTransactionResult) SetTransaction(v *ALiYunTransaction) *ALiYunTransactionResult {
	s.Transaction = v
	return s
}

// waas公钥信息
type PublicKeyInfo struct {
	// 公钥id
	// example:
	//
	// key-1
	KeyId *string `json:"key_id,omitempty" xml:"key_id,omitempty" require:"true"`
	// 公钥内容
	// example:
	//
	// 7ceb38181822437c82909506a87aa456
	PublicKey *string `json:"public_key,omitempty" xml:"public_key,omitempty" require:"true"`
	// 算法类型
	// example:
	//
	// Secp256k1VerificationKey2018
	SignType *string `json:"sign_type,omitempty" xml:"sign_type,omitempty" require:"true"`
	// 过期时间戳（毫秒）
	// example:
	//
	// 18600000000
	Expire *int64 `json:"expire,omitempty" xml:"expire,omitempty"`
	// 公钥状态，0:不可用 1:可用
	// example:
	//
	// 1
	Status *int64 `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 创建者的did
	// example:
	//
	// did:xxxx:xxxxxxxx
	Controller *string `json:"controller,omitempty" xml:"controller,omitempty"`
}

func (s PublicKeyInfo) String() string {
	return tea.Prettify(s)
}

func (s PublicKeyInfo) GoString() string {
	return s.String()
}

func (s *PublicKeyInfo) SetKeyId(v string) *PublicKeyInfo {
	s.KeyId = &v
	return s
}

func (s *PublicKeyInfo) SetPublicKey(v string) *PublicKeyInfo {
	s.PublicKey = &v
	return s
}

func (s *PublicKeyInfo) SetSignType(v string) *PublicKeyInfo {
	s.SignType = &v
	return s
}

func (s *PublicKeyInfo) SetExpire(v int64) *PublicKeyInfo {
	s.Expire = &v
	return s
}

func (s *PublicKeyInfo) SetStatus(v int64) *PublicKeyInfo {
	s.Status = &v
	return s
}

func (s *PublicKeyInfo) SetController(v string) *PublicKeyInfo {
	s.Controller = &v
	return s
}

// 更新VC状态数据结构
type UpdateVCStatus struct {
	// valid or invalid
	// example:
	//
	// valid
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 可验证声明id
	// example:
	//
	// vc:mychain:xxxx
	VcId *string `json:"vc_id,omitempty" xml:"vc_id,omitempty" require:"true"`
}

func (s UpdateVCStatus) String() string {
	return tea.Prettify(s)
}

func (s UpdateVCStatus) GoString() string {
	return s.String()
}

func (s *UpdateVCStatus) SetStatus(v string) *UpdateVCStatus {
	s.Status = &v
	return s
}

func (s *UpdateVCStatus) SetVcId(v string) *UpdateVCStatus {
	s.VcId = &v
	return s
}

// 关联应用
type ContractBindAppReq struct {
	// 应用ID
	// example:
	//
	// app20230725115808679d4f
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 合约服务标识集合
	ServiceIds []*string `json:"service_ids,omitempty" xml:"service_ids,omitempty" type:"Repeated"`
}

func (s ContractBindAppReq) String() string {
	return tea.Prettify(s)
}

func (s ContractBindAppReq) GoString() string {
	return s.String()
}

func (s *ContractBindAppReq) SetApplicationId(v string) *ContractBindAppReq {
	s.ApplicationId = &v
	return s
}

func (s *ContractBindAppReq) SetServiceIds(v []*string) *ContractBindAppReq {
	s.ServiceIds = v
	return s
}

// 用户数据
type OCUserData struct {
	// 创建时间
	// example:
	//
	// 2018-10-10 10:10:00
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 手机号
	// example:
	//
	// 186xxxxx
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty" require:"true"`
	// 用户姓名
	// example:
	//
	// xxxxxxx
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
}

func (s OCUserData) String() string {
	return tea.Prettify(s)
}

func (s OCUserData) GoString() string {
	return s.String()
}

func (s *OCUserData) SetCreateTime(v string) *OCUserData {
	s.CreateTime = &v
	return s
}

func (s *OCUserData) SetPhoneNumber(v string) *OCUserData {
	s.PhoneNumber = &v
	return s
}

func (s *OCUserData) SetUserName(v string) *OCUserData {
	s.UserName = &v
	return s
}

// 车五项信息
type CarItemsInfo struct {
	// 车架号
	// example:
	//
	// XXX
	Vin *string `json:"vin,omitempty" xml:"vin,omitempty"`
	// 发动机号
	// example:
	//
	// XXX
	EngineNo *string `json:"engine_no,omitempty" xml:"engine_no,omitempty"`
	// 注册日期
	// example:
	//
	// XXX
	RegisterDate *string `json:"register_date,omitempty" xml:"register_date,omitempty"`
	// 品牌车型
	// example:
	//
	// XXX
	ModelCode *string `json:"model_code,omitempty" xml:"model_code,omitempty"`
	// 营运性质
	// example:
	//
	// XXX
	UseNatureCode *string `json:"use_nature_code,omitempty" xml:"use_nature_code,omitempty"`
}

func (s CarItemsInfo) String() string {
	return tea.Prettify(s)
}

func (s CarItemsInfo) GoString() string {
	return s.String()
}

func (s *CarItemsInfo) SetVin(v string) *CarItemsInfo {
	s.Vin = &v
	return s
}

func (s *CarItemsInfo) SetEngineNo(v string) *CarItemsInfo {
	s.EngineNo = &v
	return s
}

func (s *CarItemsInfo) SetRegisterDate(v string) *CarItemsInfo {
	s.RegisterDate = &v
	return s
}

func (s *CarItemsInfo) SetModelCode(v string) *CarItemsInfo {
	s.ModelCode = &v
	return s
}

func (s *CarItemsInfo) SetUseNatureCode(v string) *CarItemsInfo {
	s.UseNatureCode = &v
	return s
}

// 用户身份信息
type UserMetaInfo struct {
	// 用户身份信息类型
	// example:
	//
	// TwoMeta
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 用户身份信息
	Data []*KeyValuePair `json:"data,omitempty" xml:"data,omitempty" require:"true" type:"Repeated"`
}

func (s UserMetaInfo) String() string {
	return tea.Prettify(s)
}

func (s UserMetaInfo) GoString() string {
	return s.String()
}

func (s *UserMetaInfo) SetType(v string) *UserMetaInfo {
	s.Type = &v
	return s
}

func (s *UserMetaInfo) SetData(v []*KeyValuePair) *UserMetaInfo {
	s.Data = v
	return s
}

// 车辆业务价格
type CarBusinessPrice struct {
	// 品牌id
	// example:
	//
	// xxx
	BrandId *string `json:"brand_id,omitempty" xml:"brand_id,omitempty" require:"true"`
	// 品牌名称
	// example:
	//
	// xxx
	BrandName *string `json:"brand_name,omitempty" xml:"brand_name,omitempty" require:"true"`
	// 车系ID
	//
	// example:
	//
	// xxx
	CarSeriesId *string `json:"car_series_id,omitempty" xml:"car_series_id,omitempty" require:"true"`
	// 车系名称
	// example:
	//
	// xxx
	CarSeries *string `json:"car_series,omitempty" xml:"car_series,omitempty" require:"true"`
	// 车型ID
	// example:
	//
	// xxx
	CarId *string `json:"car_id,omitempty" xml:"car_id,omitempty" require:"true"`
	// 车型名称
	// example:
	//
	// xxx
	CarName *string `json:"car_name,omitempty" xml:"car_name,omitempty" require:"true"`
	// 年款
	// example:
	//
	// xxx
	CarYear *string `json:"car_year,omitempty" xml:"car_year,omitempty" require:"true"`
	// 城市code
	// example:
	//
	// xxx
	CityCode *string `json:"city_code,omitempty" xml:"city_code,omitempty" require:"true"`
	// 城市名称
	// example:
	//
	// xxx
	CityName *string `json:"city_name,omitempty" xml:"city_name,omitempty" require:"true"`
	//   车系指导价（范围值） 单位到分
	// example:
	//
	// {"min":1234,"max":5678}
	SeriesGuidePrice *string `json:"series_guide_price,omitempty" xml:"series_guide_price,omitempty" require:"true"`
	// 车型指导价（具体值）单位到分
	OfficialPrice *int64 `json:"official_price,omitempty" xml:"official_price,omitempty" require:"true"`
	// 车主成交价（具体值）单位到分
	FullPrice *int64 `json:"full_price,omitempty" xml:"full_price,omitempty" require:"true"`
	// 车主裸车价（具体值）单位到分
	NakedPrice *int64 `json:"naked_price,omitempty" xml:"naked_price,omitempty" require:"true"`
	// 购置税（具体值）单位到分
	PurchaseTax *int64 `json:"purchase_tax,omitempty" xml:"purchase_tax,omitempty" require:"true"`
	// 车船税（具体值）单位到分
	VehicleVesselTax *int64 `json:"vehicle_vessel_tax,omitempty" xml:"vehicle_vessel_tax,omitempty" require:"true"`
	// 商业险（具体值）单位到分
	BusinessInsurance *int64 `json:"business_insurance,omitempty" xml:"business_insurance,omitempty" require:"true"`
	// json 扩展字段
	// example:
	//
	// xxx
	ExtraContent *string `json:"extra_content,omitempty" xml:"extra_content,omitempty" require:"true"`
}

func (s CarBusinessPrice) String() string {
	return tea.Prettify(s)
}

func (s CarBusinessPrice) GoString() string {
	return s.String()
}

func (s *CarBusinessPrice) SetBrandId(v string) *CarBusinessPrice {
	s.BrandId = &v
	return s
}

func (s *CarBusinessPrice) SetBrandName(v string) *CarBusinessPrice {
	s.BrandName = &v
	return s
}

func (s *CarBusinessPrice) SetCarSeriesId(v string) *CarBusinessPrice {
	s.CarSeriesId = &v
	return s
}

func (s *CarBusinessPrice) SetCarSeries(v string) *CarBusinessPrice {
	s.CarSeries = &v
	return s
}

func (s *CarBusinessPrice) SetCarId(v string) *CarBusinessPrice {
	s.CarId = &v
	return s
}

func (s *CarBusinessPrice) SetCarName(v string) *CarBusinessPrice {
	s.CarName = &v
	return s
}

func (s *CarBusinessPrice) SetCarYear(v string) *CarBusinessPrice {
	s.CarYear = &v
	return s
}

func (s *CarBusinessPrice) SetCityCode(v string) *CarBusinessPrice {
	s.CityCode = &v
	return s
}

func (s *CarBusinessPrice) SetCityName(v string) *CarBusinessPrice {
	s.CityName = &v
	return s
}

func (s *CarBusinessPrice) SetSeriesGuidePrice(v string) *CarBusinessPrice {
	s.SeriesGuidePrice = &v
	return s
}

func (s *CarBusinessPrice) SetOfficialPrice(v int64) *CarBusinessPrice {
	s.OfficialPrice = &v
	return s
}

func (s *CarBusinessPrice) SetFullPrice(v int64) *CarBusinessPrice {
	s.FullPrice = &v
	return s
}

func (s *CarBusinessPrice) SetNakedPrice(v int64) *CarBusinessPrice {
	s.NakedPrice = &v
	return s
}

func (s *CarBusinessPrice) SetPurchaseTax(v int64) *CarBusinessPrice {
	s.PurchaseTax = &v
	return s
}

func (s *CarBusinessPrice) SetVehicleVesselTax(v int64) *CarBusinessPrice {
	s.VehicleVesselTax = &v
	return s
}

func (s *CarBusinessPrice) SetBusinessInsurance(v int64) *CarBusinessPrice {
	s.BusinessInsurance = &v
	return s
}

func (s *CarBusinessPrice) SetExtraContent(v string) *CarBusinessPrice {
	s.ExtraContent = &v
	return s
}

// 阿里云子链列表信息
type ALiYunChainSubnetList struct {
	// ant_chain_id
	// example:
	//
	// S210304150059
	AntChainId *string `json:"ant_chain_id,omitempty" xml:"ant_chain_id,omitempty"`
	// 子链名称
	// example:
	//
	// 子链名称
	BlockchainName *string `json:"blockchain_name,omitempty" xml:"blockchain_name,omitempty"`
	// 联盟管理员
	// example:
	//
	// true, false
	ConsortiumAdmin *bool `json:"consortium_admin,omitempty" xml:"consortium_admin,omitempty"`
	// 子链列表信息
	BlockchainSubnetList []*ALiYunChainSubnet `json:"blockchain_subnet_list,omitempty" xml:"blockchain_subnet_list,omitempty" type:"Repeated"`
}

func (s ALiYunChainSubnetList) String() string {
	return tea.Prettify(s)
}

func (s ALiYunChainSubnetList) GoString() string {
	return s.String()
}

func (s *ALiYunChainSubnetList) SetAntChainId(v string) *ALiYunChainSubnetList {
	s.AntChainId = &v
	return s
}

func (s *ALiYunChainSubnetList) SetBlockchainName(v string) *ALiYunChainSubnetList {
	s.BlockchainName = &v
	return s
}

func (s *ALiYunChainSubnetList) SetConsortiumAdmin(v bool) *ALiYunChainSubnetList {
	s.ConsortiumAdmin = &v
	return s
}

func (s *ALiYunChainSubnetList) SetBlockchainSubnetList(v []*ALiYunChainSubnet) *ALiYunChainSubnetList {
	s.BlockchainSubnetList = v
	return s
}

// 合约服务列表查询
type ContracPageReq struct {
	// 合约服务类别
	// example:
	//
	// 存证合约
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 页码
	// example:
	//
	// 1
	Num *int64 `json:"num,omitempty" xml:"num,omitempty" require:"true"`
	// 页大小
	// example:
	//
	// 200
	Size *int64 `json:"size,omitempty" xml:"size,omitempty" require:"true"`
}

func (s ContracPageReq) String() string {
	return tea.Prettify(s)
}

func (s ContracPageReq) GoString() string {
	return s.String()
}

func (s *ContracPageReq) SetType(v string) *ContracPageReq {
	s.Type = &v
	return s
}

func (s *ContracPageReq) SetNum(v int64) *ContracPageReq {
	s.Num = &v
	return s
}

func (s *ContracPageReq) SetSize(v int64) *ContracPageReq {
	s.Size = &v
	return s
}

// 批量提交结果
type BatchSubmitCarResult struct {
	// 提交线索唯一请求id
	// example:
	//
	// xxx
	SubmitId *string `json:"submit_id,omitempty" xml:"submit_id,omitempty" require:"true"`
	// 是否成功
	// example:
	//
	// true, false
	IsSuccess *bool `json:"is_success,omitempty" xml:"is_success,omitempty" require:"true"`
	// OK
	// NO_DEMAND 无线索需求，需要重试
	// INVALID 无效，不要重试
	// example:
	//
	// OK/INVALID/NO_DEMAND
	PushResultCode *string `json:"push_result_code,omitempty" xml:"push_result_code,omitempty" require:"true"`
}

func (s BatchSubmitCarResult) String() string {
	return tea.Prettify(s)
}

func (s BatchSubmitCarResult) GoString() string {
	return s.String()
}

func (s *BatchSubmitCarResult) SetSubmitId(v string) *BatchSubmitCarResult {
	s.SubmitId = &v
	return s
}

func (s *BatchSubmitCarResult) SetIsSuccess(v bool) *BatchSubmitCarResult {
	s.IsSuccess = &v
	return s
}

func (s *BatchSubmitCarResult) SetPushResultCode(v string) *BatchSubmitCarResult {
	s.PushResultCode = &v
	return s
}

// 人群标签枚举集合对象
type CrowdTagEnumResp struct {
	// 人群标签code
	// example:
	//
	// P0010GC6
	CrowdTag *string `json:"crowd_tag,omitempty" xml:"crowd_tag,omitempty" require:"true"`
	// 人群标签枚举列表对象
	CrowTagEnumItemList []*CrowdTagEnumItemDTO `json:"crow_tag_enum_item_list,omitempty" xml:"crow_tag_enum_item_list,omitempty" require:"true" type:"Repeated"`
}

func (s CrowdTagEnumResp) String() string {
	return tea.Prettify(s)
}

func (s CrowdTagEnumResp) GoString() string {
	return s.String()
}

func (s *CrowdTagEnumResp) SetCrowdTag(v string) *CrowdTagEnumResp {
	s.CrowdTag = &v
	return s
}

func (s *CrowdTagEnumResp) SetCrowTagEnumItemList(v []*CrowdTagEnumItemDTO) *CrowdTagEnumResp {
	s.CrowTagEnumItemList = v
	return s
}

// 协议模板信息
type Agreement struct {
	// 协议名称
	// example:
	//
	// -
	AgreementName *string `json:"agreement_name,omitempty" xml:"agreement_name,omitempty" require:"true"`
	// 协议类型
	// example:
	//
	// USER_SERVICE_AUTH
	AgreementType *string `json:"agreement_type,omitempty" xml:"agreement_type,omitempty" require:"true"`
	// 第三方原始协议链接
	// example:
	//
	// -
	AgreementUrl *string `json:"agreement_url,omitempty" xml:"agreement_url,omitempty" require:"true"`
	// 协议文件上传目录
	// example:
	//
	// -
	AgreementFileOssKey *string `json:"agreement_file_oss_key,omitempty" xml:"agreement_file_oss_key,omitempty" require:"true"`
	// 上传时的协议原始文件名
	// example:
	//
	// -
	AgreementFileOriginalName *string `json:"agreement_file_original_name,omitempty" xml:"agreement_file_original_name,omitempty" require:"true"`
}

func (s Agreement) String() string {
	return tea.Prettify(s)
}

func (s Agreement) GoString() string {
	return s.String()
}

func (s *Agreement) SetAgreementName(v string) *Agreement {
	s.AgreementName = &v
	return s
}

func (s *Agreement) SetAgreementType(v string) *Agreement {
	s.AgreementType = &v
	return s
}

func (s *Agreement) SetAgreementUrl(v string) *Agreement {
	s.AgreementUrl = &v
	return s
}

func (s *Agreement) SetAgreementFileOssKey(v string) *Agreement {
	s.AgreementFileOssKey = &v
	return s
}

func (s *Agreement) SetAgreementFileOriginalName(v string) *Agreement {
	s.AgreementFileOriginalName = &v
	return s
}

// 阿里云最新区块列表查询的单元信息
type ALiYunChainBlockInfo struct {
	// alias
	// example:
	//
	// alias
	Alias *string `json:"alias,omitempty" xml:"alias,omitempty"`
	// block_hash
	// example:
	//
	// block_hash
	BlockHash *string `json:"block_hash,omitempty" xml:"block_hash,omitempty"`
	// root_tx_hash
	// example:
	//
	// root_tx_hash
	RootTxHash *string `json:"root_tx_hash,omitempty" xml:"root_tx_hash,omitempty"`
	// height
	// example:
	//
	// 120
	Height *int64 `json:"height,omitempty" xml:"height,omitempty"`
	// previous_hash
	// example:
	//
	// previous_hash
	PreviousHash *string `json:"previous_hash,omitempty" xml:"previous_hash,omitempty"`
	// create_time
	// example:
	//
	// 12312312312
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// biz_data
	// example:
	//
	// biz_data
	BizData *string `json:"biz_data,omitempty" xml:"biz_data,omitempty"`
	// transaction_size
	// example:
	//
	// 12
	TransactionSize *int64 `json:"transaction_size,omitempty" xml:"transaction_size,omitempty"`
	// version
	// example:
	//
	// 20
	Version *int64 `json:"version,omitempty" xml:"version,omitempty"`
	// size
	// example:
	//
	// size
	Size *int64 `json:"size,omitempty" xml:"size,omitempty"`
}

func (s ALiYunChainBlockInfo) String() string {
	return tea.Prettify(s)
}

func (s ALiYunChainBlockInfo) GoString() string {
	return s.String()
}

func (s *ALiYunChainBlockInfo) SetAlias(v string) *ALiYunChainBlockInfo {
	s.Alias = &v
	return s
}

func (s *ALiYunChainBlockInfo) SetBlockHash(v string) *ALiYunChainBlockInfo {
	s.BlockHash = &v
	return s
}

func (s *ALiYunChainBlockInfo) SetRootTxHash(v string) *ALiYunChainBlockInfo {
	s.RootTxHash = &v
	return s
}

func (s *ALiYunChainBlockInfo) SetHeight(v int64) *ALiYunChainBlockInfo {
	s.Height = &v
	return s
}

func (s *ALiYunChainBlockInfo) SetPreviousHash(v string) *ALiYunChainBlockInfo {
	s.PreviousHash = &v
	return s
}

func (s *ALiYunChainBlockInfo) SetCreateTime(v int64) *ALiYunChainBlockInfo {
	s.CreateTime = &v
	return s
}

func (s *ALiYunChainBlockInfo) SetBizData(v string) *ALiYunChainBlockInfo {
	s.BizData = &v
	return s
}

func (s *ALiYunChainBlockInfo) SetTransactionSize(v int64) *ALiYunChainBlockInfo {
	s.TransactionSize = &v
	return s
}

func (s *ALiYunChainBlockInfo) SetVersion(v int64) *ALiYunChainBlockInfo {
	s.Version = &v
	return s
}

func (s *ALiYunChainBlockInfo) SetSize(v int64) *ALiYunChainBlockInfo {
	s.Size = &v
	return s
}

// 组件信息
type DiscreteValue struct {
	// 排序id
	// example:
	//
	// 12
	SortId *int64 `json:"sort_id,omitempty" xml:"sort_id,omitempty"`
	// 字段描述
	// example:
	//
	// 联盟名称
	Text *string `json:"text,omitempty" xml:"text,omitempty" require:"true"`
	// 提示信息
	// example:
	//
	// 提示信息
	Tips *string `json:"tips,omitempty" xml:"tips,omitempty"`
	// 单位信息
	// example:
	//
	// 单位信息
	Unit *string `json:"unit,omitempty" xml:"unit,omitempty"`
	// 值内容
	// example:
	//
	// 值内容
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s DiscreteValue) String() string {
	return tea.Prettify(s)
}

func (s DiscreteValue) GoString() string {
	return s.String()
}

func (s *DiscreteValue) SetSortId(v int64) *DiscreteValue {
	s.SortId = &v
	return s
}

func (s *DiscreteValue) SetText(v string) *DiscreteValue {
	s.Text = &v
	return s
}

func (s *DiscreteValue) SetTips(v string) *DiscreteValue {
	s.Tips = &v
	return s
}

func (s *DiscreteValue) SetUnit(v string) *DiscreteValue {
	s.Unit = &v
	return s
}

func (s *DiscreteValue) SetValue(v string) *DiscreteValue {
	s.Value = &v
	return s
}

// 合约列表
type ContractPageResp struct {
	// 合约列表
	List []*ContractPageListResp `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
	// 总数
	// example:
	//
	// 200
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s ContractPageResp) String() string {
	return tea.Prettify(s)
}

func (s ContractPageResp) GoString() string {
	return s.String()
}

func (s *ContractPageResp) SetList(v []*ContractPageListResp) *ContractPageResp {
	s.List = v
	return s
}

func (s *ContractPageResp) SetTotal(v int64) *ContractPageResp {
	s.Total = &v
	return s
}

// AccountPo
type AccountPo struct {
	// 账户 hash
	// example:
	//
	// 465518149b3407dc927e05208136c42b2c6b82fe961006f3dff5202b0c3d8764
	Account *string `json:"account,omitempty" xml:"account,omitempty"`
	// 账户创建时间
	// example:
	//
	// 1573442990479
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 创建该账户的交易hash
	// example:
	//
	// fffc98e106171ee7783fb79a433312e3ac98091cb82e7292ec62462138c7ff8e
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
	// 创建该账户的 账户hash
	// example:
	//
	// e7d3e769f3f593dadcb8634cc5b09fc90dd3a61c4a06a79cb0923662fe6fae6b
	Parent *string `json:"parent,omitempty" xml:"parent,omitempty"`
}

func (s AccountPo) String() string {
	return tea.Prettify(s)
}

func (s AccountPo) GoString() string {
	return s.String()
}

func (s *AccountPo) SetAccount(v string) *AccountPo {
	s.Account = &v
	return s
}

func (s *AccountPo) SetCreateTime(v int64) *AccountPo {
	s.CreateTime = &v
	return s
}

func (s *AccountPo) SetHash(v string) *AccountPo {
	s.Hash = &v
	return s
}

func (s *AccountPo) SetParent(v string) *AccountPo {
	s.Parent = &v
	return s
}

// doc删除service
type DidDeleteService struct {
	// 修改前did doc版本
	// example:
	//
	// 2
	PreviousVersion *int64 `json:"previous_version,omitempty" xml:"previous_version,omitempty" require:"true"`
	// 指定服务的id
	// example:
	//
	// service#2
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
}

func (s DidDeleteService) String() string {
	return tea.Prettify(s)
}

func (s DidDeleteService) GoString() string {
	return s.String()
}

func (s *DidDeleteService) SetPreviousVersion(v int64) *DidDeleteService {
	s.PreviousVersion = &v
	return s
}

func (s *DidDeleteService) SetServiceId(v string) *DidDeleteService {
	s.ServiceId = &v
	return s
}

// 结算银行卡信息
type SettleCardInfo struct {
	// 开户支行名
	// example:
	//
	// 招商银行杭州高新支行
	AccountBranchName *string `json:"account_branch_name,omitempty" xml:"account_branch_name,omitempty" require:"true"`
	// 卡户名
	// example:
	//
	// 张三
	AccountHolderName *string `json:"account_holder_name,omitempty" xml:"account_holder_name,omitempty" require:"true"`
	// 开户行所在地-市
	// example:
	//
	// 杭州市
	AccountInstCity *string `json:"account_inst_city,omitempty" xml:"account_inst_city,omitempty" require:"true"`
	// 开户行简称缩写
	// example:
	//
	// CMB
	AccountInstId *string `json:"account_inst_id,omitempty" xml:"account_inst_id,omitempty" require:"true"`
	// 银行名称
	// example:
	//
	// 招商银行
	AccountInstName *string `json:"account_inst_name,omitempty" xml:"account_inst_name,omitempty" require:"true"`
	// 开户行所在地-省
	// example:
	//
	// 浙江省
	AccountInstProvince *string `json:"account_inst_province,omitempty" xml:"account_inst_province,omitempty" require:"true"`
	// 银行卡号
	// example:
	//
	// 6214855710610408
	AccountNo *string `json:"account_no,omitempty" xml:"account_no,omitempty" require:"true"`
	// 卡类型
	// example:
	//
	// DC
	AccountType *string `json:"account_type,omitempty" xml:"account_type,omitempty" require:"true"`
	// 账号使用类型
	// example:
	//
	// 01
	UsageType *string `json:"usage_type,omitempty" xml:"usage_type,omitempty" require:"true"`
}

func (s SettleCardInfo) String() string {
	return tea.Prettify(s)
}

func (s SettleCardInfo) GoString() string {
	return s.String()
}

func (s *SettleCardInfo) SetAccountBranchName(v string) *SettleCardInfo {
	s.AccountBranchName = &v
	return s
}

func (s *SettleCardInfo) SetAccountHolderName(v string) *SettleCardInfo {
	s.AccountHolderName = &v
	return s
}

func (s *SettleCardInfo) SetAccountInstCity(v string) *SettleCardInfo {
	s.AccountInstCity = &v
	return s
}

func (s *SettleCardInfo) SetAccountInstId(v string) *SettleCardInfo {
	s.AccountInstId = &v
	return s
}

func (s *SettleCardInfo) SetAccountInstName(v string) *SettleCardInfo {
	s.AccountInstName = &v
	return s
}

func (s *SettleCardInfo) SetAccountInstProvince(v string) *SettleCardInfo {
	s.AccountInstProvince = &v
	return s
}

func (s *SettleCardInfo) SetAccountNo(v string) *SettleCardInfo {
	s.AccountNo = &v
	return s
}

func (s *SettleCardInfo) SetAccountType(v string) *SettleCardInfo {
	s.AccountType = &v
	return s
}

func (s *SettleCardInfo) SetUsageType(v string) *SettleCardInfo {
	s.UsageType = &v
	return s
}

// 可验证声明相关的事件
type VCEvent struct {
	// 事件对应的合约方法
	// example:
	//
	// add
	Action *string `json:"action,omitempty" xml:"action,omitempty" require:"true"`
	// 本次事件的触发者
	// example:
	//
	// xxxxx
	From *string `json:"from,omitempty" xml:"from,omitempty" require:"true"`
	// 事件在区块的高度
	// example:
	//
	// 6300
	Height *int64 `json:"height,omitempty" xml:"height,omitempty" require:"true"`
	// 该VC的颁发者
	// example:
	//
	// did:mychian:xxxxx
	Issuer *string `json:"issuer,omitempty" xml:"issuer,omitempty" require:"true"`
	// 有效，或者无效
	// example:
	//
	// valid
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 该vc的接受者
	// example:
	//
	// hash256(did:mychain:xxxxx)
	Subjec *string `json:"subjec,omitempty" xml:"subjec,omitempty" require:"true"`
	// 交易hash
	//
	// example:
	//
	// xxxx
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 交易在区块中的index
	// example:
	//
	// 1
	TxIndex *int64 `json:"tx_index,omitempty" xml:"tx_index,omitempty" require:"true"`
	// 可验证声明Hash值
	// example:
	//
	// hash256(可验证声明)
	VcHash *string `json:"vc_hash,omitempty" xml:"vc_hash,omitempty" require:"true"`
	// vcid
	// example:
	//
	// vc:mychain:XXXX
	VcId *string `json:"vc_id,omitempty" xml:"vc_id,omitempty" require:"true"`
}

func (s VCEvent) String() string {
	return tea.Prettify(s)
}

func (s VCEvent) GoString() string {
	return s.String()
}

func (s *VCEvent) SetAction(v string) *VCEvent {
	s.Action = &v
	return s
}

func (s *VCEvent) SetFrom(v string) *VCEvent {
	s.From = &v
	return s
}

func (s *VCEvent) SetHeight(v int64) *VCEvent {
	s.Height = &v
	return s
}

func (s *VCEvent) SetIssuer(v string) *VCEvent {
	s.Issuer = &v
	return s
}

func (s *VCEvent) SetStatus(v string) *VCEvent {
	s.Status = &v
	return s
}

func (s *VCEvent) SetSubjec(v string) *VCEvent {
	s.Subjec = &v
	return s
}

func (s *VCEvent) SetTxHash(v string) *VCEvent {
	s.TxHash = &v
	return s
}

func (s *VCEvent) SetTxIndex(v int64) *VCEvent {
	s.TxIndex = &v
	return s
}

func (s *VCEvent) SetVcHash(v string) *VCEvent {
	s.VcHash = &v
	return s
}

func (s *VCEvent) SetVcId(v string) *VCEvent {
	s.VcId = &v
	return s
}

// dis服务发现对象
type DisServiceInfo struct {
	// 提供服务的did
	// example:
	//
	// did:mychain:xxxxxxxxx
	Controller *string `json:"controller,omitempty" xml:"controller,omitempty" require:"true"`
	// 服务地址
	// example:
	//
	// www.xxxx.com/xxxx
	EndPoint *string `json:"end_point,omitempty" xml:"end_point,omitempty" require:"true"`
	// 服务id
	// example:
	//
	// did:service:xxxxxx
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 服务类型
	// example:
	//
	// xxxx
	ServiceType *string `json:"service_type,omitempty" xml:"service_type,omitempty" require:"true"`
}

func (s DisServiceInfo) String() string {
	return tea.Prettify(s)
}

func (s DisServiceInfo) GoString() string {
	return s.String()
}

func (s *DisServiceInfo) SetController(v string) *DisServiceInfo {
	s.Controller = &v
	return s
}

func (s *DisServiceInfo) SetEndPoint(v string) *DisServiceInfo {
	s.EndPoint = &v
	return s
}

func (s *DisServiceInfo) SetServiceId(v string) *DisServiceInfo {
	s.ServiceId = &v
	return s
}

func (s *DisServiceInfo) SetServiceType(v string) *DisServiceInfo {
	s.ServiceType = &v
	return s
}

// 用户基本信息
type CarOwnerUserInfo struct {
	// 用户id
	// example:
	//
	// XX
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 手机号
	// example:
	//
	// XXX
	PhoneNum *string `json:"phone_num,omitempty" xml:"phone_num,omitempty" require:"true"`
}

func (s CarOwnerUserInfo) String() string {
	return tea.Prettify(s)
}

func (s CarOwnerUserInfo) GoString() string {
	return s.String()
}

func (s *CarOwnerUserInfo) SetUserId(v string) *CarOwnerUserInfo {
	s.UserId = &v
	return s
}

func (s *CarOwnerUserInfo) SetPhoneNum(v string) *CarOwnerUserInfo {
	s.PhoneNum = &v
	return s
}

// POAP徽章的详细信息
type PoapInfo struct {
	// 徽章ID，具有唯一性
	// example:
	//
	// ACconstellation_ADF
	PoapId *string `json:"poap_id,omitempty" xml:"poap_id,omitempty" require:"true"`
	// 徽章名字
	// example:
	//
	// 星座徽章
	PoapName *string `json:"poap_name,omitempty" xml:"poap_name,omitempty" require:"true"`
	// 徽章HASH
	// example:
	//
	// 0fddf9087f7c5bd71c2fabb4b520bdec9fe7157c00807b26f9ddff9cd5d73d77
	UniHash *string `json:"uni_hash,omitempty" xml:"uni_hash,omitempty" require:"true"`
	// 状态，枚举值
	// example:
	//
	// FINISHED
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 徽章资源 URL
	// example:
	//
	// http://xxxx.ff.png
	PoapUrl *string `json:"poap_url,omitempty" xml:"poap_url,omitempty" require:"true"`
	// 枚举值，2D_IMAGE--2D图片渲染；3D_OASISENGINE--3D模型渲染
	// example:
	//
	// 2D_IMAGE
	RenderType *string `json:"render_type,omitempty" xml:"render_type,omitempty" require:"true"`
	// 3D模型降级使用的资源URL
	// example:
	//
	// http://xxx.png
	FaultToleranceUrl *string `json:"fault_tolerance_url,omitempty" xml:"fault_tolerance_url,omitempty"`
	// 小程序详情跳转URL。临时链接，过期时间为 detail_alipays_url_expire_time 字段的值
	// example:
	//
	// alipays://platformapi/startapp?
	DetailAlipaysUrl *string `json:"detail_alipays_url,omitempty" xml:"detail_alipays_url,omitempty"`
	// 详情页跳转URL过期时间
	// example:
	//
	// 2022-12-31 23:59:59
	DetailAlipaysUrlExpireTime *string `json:"detail_alipays_url_expire_time,omitempty" xml:"detail_alipays_url_expire_time,omitempty"`
}

func (s PoapInfo) String() string {
	return tea.Prettify(s)
}

func (s PoapInfo) GoString() string {
	return s.String()
}

func (s *PoapInfo) SetPoapId(v string) *PoapInfo {
	s.PoapId = &v
	return s
}

func (s *PoapInfo) SetPoapName(v string) *PoapInfo {
	s.PoapName = &v
	return s
}

func (s *PoapInfo) SetUniHash(v string) *PoapInfo {
	s.UniHash = &v
	return s
}

func (s *PoapInfo) SetStatus(v string) *PoapInfo {
	s.Status = &v
	return s
}

func (s *PoapInfo) SetPoapUrl(v string) *PoapInfo {
	s.PoapUrl = &v
	return s
}

func (s *PoapInfo) SetRenderType(v string) *PoapInfo {
	s.RenderType = &v
	return s
}

func (s *PoapInfo) SetFaultToleranceUrl(v string) *PoapInfo {
	s.FaultToleranceUrl = &v
	return s
}

func (s *PoapInfo) SetDetailAlipaysUrl(v string) *PoapInfo {
	s.DetailAlipaysUrl = &v
	return s
}

func (s *PoapInfo) SetDetailAlipaysUrlExpireTime(v string) *PoapInfo {
	s.DetailAlipaysUrlExpireTime = &v
	return s
}

// 分布式数字身份信息
type DidInfo struct {
	// 分布式数字身份id
	// example:
	//
	// 123123
	Did *string `json:"did,omitempty" xml:"did,omitempty" require:"true"`
	// 分布式数字身份对应的用户名称
	// example:
	//
	// 蚂蚁金服
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s DidInfo) String() string {
	return tea.Prettify(s)
}

func (s DidInfo) GoString() string {
	return s.String()
}

func (s *DidInfo) SetDid(v string) *DidInfo {
	s.Did = &v
	return s
}

func (s *DidInfo) SetName(v string) *DidInfo {
	s.Name = &v
	return s
}

// 数据隐私服务选择tapp信息的结构体
type ChoiceTappInfo struct {
	// 选择的tapp的名字
	// example:
	//
	// erpDataReader-1
	TappName *string `json:"tapp_name,omitempty" xml:"tapp_name,omitempty" require:"true"`
	// 版本号，如果不填就选择最新的版本
	TappVersion *int64 `json:"tapp_version,omitempty" xml:"tapp_version,omitempty"`
	// 该tapp将被声明在did doc中的id
	// example:
	//
	// erpDataReader-1
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
}

func (s ChoiceTappInfo) String() string {
	return tea.Prettify(s)
}

func (s ChoiceTappInfo) GoString() string {
	return s.String()
}

func (s *ChoiceTappInfo) SetTappName(v string) *ChoiceTappInfo {
	s.TappName = &v
	return s
}

func (s *ChoiceTappInfo) SetTappVersion(v int64) *ChoiceTappInfo {
	s.TappVersion = &v
	return s
}

func (s *ChoiceTappInfo) SetServiceId(v string) *ChoiceTappInfo {
	s.ServiceId = &v
	return s
}

// 复制阿里云合约工程信息
type ALiYunContractProjectDuplicate struct {
	// id
	// example:
	//
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// consortium_id
	// example:
	//
	// consortium_id
	ConsortiumId *string `json:"consortium_id,omitempty" xml:"consortium_id,omitempty"`
	// gmt_create
	// example:
	//
	// 21312312312
	GmtCreate *int64 `json:"gmt_create,omitempty" xml:"gmt_create,omitempty"`
	// gmt_modified
	// example:
	//
	// 123123212
	GmtModified *int64 `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty"`
	// name
	// example:
	//
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// version
	// example:
	//
	// version
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
	// description
	// example:
	//
	// description
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
}

func (s ALiYunContractProjectDuplicate) String() string {
	return tea.Prettify(s)
}

func (s ALiYunContractProjectDuplicate) GoString() string {
	return s.String()
}

func (s *ALiYunContractProjectDuplicate) SetId(v string) *ALiYunContractProjectDuplicate {
	s.Id = &v
	return s
}

func (s *ALiYunContractProjectDuplicate) SetConsortiumId(v string) *ALiYunContractProjectDuplicate {
	s.ConsortiumId = &v
	return s
}

func (s *ALiYunContractProjectDuplicate) SetGmtCreate(v int64) *ALiYunContractProjectDuplicate {
	s.GmtCreate = &v
	return s
}

func (s *ALiYunContractProjectDuplicate) SetGmtModified(v int64) *ALiYunContractProjectDuplicate {
	s.GmtModified = &v
	return s
}

func (s *ALiYunContractProjectDuplicate) SetName(v string) *ALiYunContractProjectDuplicate {
	s.Name = &v
	return s
}

func (s *ALiYunContractProjectDuplicate) SetVersion(v string) *ALiYunContractProjectDuplicate {
	s.Version = &v
	return s
}

func (s *ALiYunContractProjectDuplicate) SetDescription(v string) *ALiYunContractProjectDuplicate {
	s.Description = &v
	return s
}

// 物流金融信用流转流水信息
type CreditTransferStatementInfo struct {
	// 信用凭证额度
	// example:
	//
	// 1989.76
	CreditLimit *string `json:"credit_limit,omitempty" xml:"credit_limit,omitempty"`
	// 信用凭证到期时间
	// example:
	//
	// 20191212
	ExpireDate *string `json:"expire_date,omitempty" xml:"expire_date,omitempty"`
	// 凭证来源方did
	// example:
	//
	// did:mychain:1b8b30228ec99cb5de99b2265538f3c505b274e0bef98fb9cee7aabd8f5f47eb
	FromDid *string `json:"from_did,omitempty" xml:"from_did,omitempty"`
	// 信用凭证发起时间
	// example:
	//
	// 20190101
	IssueDate *string `json:"issue_date,omitempty" xml:"issue_date,omitempty"`
	// 信用流转凭证
	// example:
	//
	// 000abc
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty"`
	// 流水类型
	// example:
	//
	// 融资提现
	StateType *string `json:"state_type,omitempty" xml:"state_type,omitempty"`
	// 凭证流转方did
	// example:
	//
	// did:mychain:1b8b30228ec99cb5de99b2265538f3c505b274e0bef98fb9cee7aabd8f5f47eb
	ToDid *string `json:"to_did,omitempty" xml:"to_did,omitempty"`
}

func (s CreditTransferStatementInfo) String() string {
	return tea.Prettify(s)
}

func (s CreditTransferStatementInfo) GoString() string {
	return s.String()
}

func (s *CreditTransferStatementInfo) SetCreditLimit(v string) *CreditTransferStatementInfo {
	s.CreditLimit = &v
	return s
}

func (s *CreditTransferStatementInfo) SetExpireDate(v string) *CreditTransferStatementInfo {
	s.ExpireDate = &v
	return s
}

func (s *CreditTransferStatementInfo) SetFromDid(v string) *CreditTransferStatementInfo {
	s.FromDid = &v
	return s
}

func (s *CreditTransferStatementInfo) SetIssueDate(v string) *CreditTransferStatementInfo {
	s.IssueDate = &v
	return s
}

func (s *CreditTransferStatementInfo) SetIssueId(v string) *CreditTransferStatementInfo {
	s.IssueId = &v
	return s
}

func (s *CreditTransferStatementInfo) SetStateType(v string) *CreditTransferStatementInfo {
	s.StateType = &v
	return s
}

func (s *CreditTransferStatementInfo) SetToDid(v string) *CreditTransferStatementInfo {
	s.ToDid = &v
	return s
}

// 关联奖品列表
type PrizeList struct {
	// 对客展示信息
	// example:
	//
	// undefined
	DisplayInfo *DisplayInfo `json:"display_info,omitempty" xml:"display_info,omitempty"`
	// 定价策略
	// example:
	//
	// undefined
	PriceStrategy *PriceStrategy `json:"price_strategy,omitempty" xml:"price_strategy,omitempty"`
	// 奖品基本信息
	// example:
	//
	// undefined
	PrizeBaseInfo *PrizeBaseInfo `json:"prize_base_info,omitempty" xml:"prize_base_info,omitempty"`
}

func (s PrizeList) String() string {
	return tea.Prettify(s)
}

func (s PrizeList) GoString() string {
	return s.String()
}

func (s *PrizeList) SetDisplayInfo(v *DisplayInfo) *PrizeList {
	s.DisplayInfo = v
	return s
}

func (s *PrizeList) SetPriceStrategy(v *PriceStrategy) *PrizeList {
	s.PriceStrategy = v
	return s
}

func (s *PrizeList) SetPrizeBaseInfo(v *PrizeBaseInfo) *PrizeList {
	s.PrizeBaseInfo = v
	return s
}

// 新车信息
type NewCarInfo struct {
	// 车系
	// example:
	//
	// xx
	CarSeries *string `json:"car_series,omitempty" xml:"car_series,omitempty" require:"true"`
	// 金融方案
	// example:
	//
	// xxx
	FinaicalPlan *string `json:"finaical_plan,omitempty" xml:"finaical_plan,omitempty"`
	// 车系id
	// example:
	//
	// xxx
	CarSeriesId *string `json:"car_series_id,omitempty" xml:"car_series_id,omitempty"`
	// 请求提交唯一id
	// example:
	//
	// xxxx
	SubmitId *string `json:"submit_id,omitempty" xml:"submit_id,omitempty"`
	// 预计购买时间
	// example:
	//
	// 1
	PurcharseTime *string `json:"purcharse_time,omitempty" xml:"purcharse_time,omitempty"`
	// 用户信息
	UserInfo *CarUserInfo `json:"user_info,omitempty" xml:"user_info,omitempty" require:"true"`
	// 懂车帝或者汽车之家
	// example:
	//
	// DCD/QC
	MatchSource *string `json:"match_source,omitempty" xml:"match_source,omitempty"`
	// 汽车之家车型id
	// example:
	//
	// 123
	QcCarSeriesId *string `json:"qc_car_series_id,omitempty" xml:"qc_car_series_id,omitempty"`
}

func (s NewCarInfo) String() string {
	return tea.Prettify(s)
}

func (s NewCarInfo) GoString() string {
	return s.String()
}

func (s *NewCarInfo) SetCarSeries(v string) *NewCarInfo {
	s.CarSeries = &v
	return s
}

func (s *NewCarInfo) SetFinaicalPlan(v string) *NewCarInfo {
	s.FinaicalPlan = &v
	return s
}

func (s *NewCarInfo) SetCarSeriesId(v string) *NewCarInfo {
	s.CarSeriesId = &v
	return s
}

func (s *NewCarInfo) SetSubmitId(v string) *NewCarInfo {
	s.SubmitId = &v
	return s
}

func (s *NewCarInfo) SetPurcharseTime(v string) *NewCarInfo {
	s.PurcharseTime = &v
	return s
}

func (s *NewCarInfo) SetUserInfo(v *CarUserInfo) *NewCarInfo {
	s.UserInfo = v
	return s
}

func (s *NewCarInfo) SetMatchSource(v string) *NewCarInfo {
	s.MatchSource = &v
	return s
}

func (s *NewCarInfo) SetQcCarSeriesId(v string) *NewCarInfo {
	s.QcCarSeriesId = &v
	return s
}

// 阿里云合约工程信息查询
type ALiYunContractProjects struct {
	// pagination
	// example:
	//
	// pagination
	Pagination *ALiYunPagination `json:"pagination,omitempty" xml:"pagination,omitempty"`
	// contract_projects
	// example:
	//
	// contract_projects
	ContractProjects []*ALiYunContractProject `json:"contract_projects,omitempty" xml:"contract_projects,omitempty" type:"Repeated"`
}

func (s ALiYunContractProjects) String() string {
	return tea.Prettify(s)
}

func (s ALiYunContractProjects) GoString() string {
	return s.String()
}

func (s *ALiYunContractProjects) SetPagination(v *ALiYunPagination) *ALiYunContractProjects {
	s.Pagination = v
	return s
}

func (s *ALiYunContractProjects) SetContractProjects(v []*ALiYunContractProject) *ALiYunContractProjects {
	s.ContractProjects = v
	return s
}

// 阿里云区块链资源类型信息
type ALiYunChainResouceType struct {
	// type_id
	// example:
	//
	// type_id
	TypeId *int64 `json:"type_id,omitempty" xml:"type_id,omitempty"`
	// cpu
	// example:
	//
	// 24
	Cpu *int64 `json:"cpu,omitempty" xml:"cpu,omitempty"`
	// memory
	// example:
	//
	// 24
	Memory *int64 `json:"memory,omitempty" xml:"memory,omitempty"`
	// disk
	// example:
	//
	// 500
	Disk *int64 `json:"disk,omitempty" xml:"disk,omitempty"`
}

func (s ALiYunChainResouceType) String() string {
	return tea.Prettify(s)
}

func (s ALiYunChainResouceType) GoString() string {
	return s.String()
}

func (s *ALiYunChainResouceType) SetTypeId(v int64) *ALiYunChainResouceType {
	s.TypeId = &v
	return s
}

func (s *ALiYunChainResouceType) SetCpu(v int64) *ALiYunChainResouceType {
	s.Cpu = &v
	return s
}

func (s *ALiYunChainResouceType) SetMemory(v int64) *ALiYunChainResouceType {
	s.Memory = &v
	return s
}

func (s *ALiYunChainResouceType) SetDisk(v int64) *ALiYunChainResouceType {
	s.Disk = &v
	return s
}

// 结构化存证类型
type DepositMetaDataItem struct {
	// 结构化存证时该item的描述
	// example:
	//
	// 货物个数
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true"`
	// 结构化存证该数据字段的唯一索引
	// example:
	//
	// item_id
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// 结构化存证时该item的类型
	// 0 text
	// 1 encrypt text
	// 2 txHash
	// 3 image url
	// 4 vedio url
	// 5 map url
	// example:
	//
	// 0
	Type *int64 `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 结构化数据存证时，该item的值
	// example:
	//
	// 10个
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s DepositMetaDataItem) String() string {
	return tea.Prettify(s)
}

func (s DepositMetaDataItem) GoString() string {
	return s.String()
}

func (s *DepositMetaDataItem) SetDesc(v string) *DepositMetaDataItem {
	s.Desc = &v
	return s
}

func (s *DepositMetaDataItem) SetKey(v string) *DepositMetaDataItem {
	s.Key = &v
	return s
}

func (s *DepositMetaDataItem) SetType(v int64) *DepositMetaDataItem {
	s.Type = &v
	return s
}

func (s *DepositMetaDataItem) SetValue(v string) *DepositMetaDataItem {
	s.Value = &v
	return s
}

// 阿里云最新交易信息
type ALiYunLatestTransaction struct {
	// hash
	// example:
	//
	// hash
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
	// transaction_v10_type
	// example:
	//
	// transaction_v10_type
	TransactionV10Type *string `json:"transaction_v10_type,omitempty" xml:"transaction_v10_type,omitempty"`
	// trans_type_v6
	// example:
	//
	// trans_type_v6
	TransTypeV6 *string `json:"trans_type_v6,omitempty" xml:"trans_type_v6,omitempty"`
	// from
	// example:
	//
	// from
	From *string `json:"from,omitempty" xml:"from,omitempty"`
	// to
	// example:
	//
	// to
	To *string `json:"to,omitempty" xml:"to,omitempty"`
	// create_time
	// example:
	//
	// 1231231231
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
}

func (s ALiYunLatestTransaction) String() string {
	return tea.Prettify(s)
}

func (s ALiYunLatestTransaction) GoString() string {
	return s.String()
}

func (s *ALiYunLatestTransaction) SetHash(v string) *ALiYunLatestTransaction {
	s.Hash = &v
	return s
}

func (s *ALiYunLatestTransaction) SetTransactionV10Type(v string) *ALiYunLatestTransaction {
	s.TransactionV10Type = &v
	return s
}

func (s *ALiYunLatestTransaction) SetTransTypeV6(v string) *ALiYunLatestTransaction {
	s.TransTypeV6 = &v
	return s
}

func (s *ALiYunLatestTransaction) SetFrom(v string) *ALiYunLatestTransaction {
	s.From = &v
	return s
}

func (s *ALiYunLatestTransaction) SetTo(v string) *ALiYunLatestTransaction {
	s.To = &v
	return s
}

func (s *ALiYunLatestTransaction) SetCreateTime(v int64) *ALiYunLatestTransaction {
	s.CreateTime = &v
	return s
}

// 分页查询请求信息
type PageReq struct {
	// 页码
	// example:
	//
	// 1
	Num *int64 `json:"num,omitempty" xml:"num,omitempty" require:"true"`
	// 页大小
	// example:
	//
	// 200
	Size *int64 `json:"size,omitempty" xml:"size,omitempty" require:"true"`
}

func (s PageReq) String() string {
	return tea.Prettify(s)
}

func (s PageReq) GoString() string {
	return s.String()
}

func (s *PageReq) SetNum(v int64) *PageReq {
	s.Num = &v
	return s
}

func (s *PageReq) SetSize(v int64) *PageReq {
	s.Size = &v
	return s
}

// 用户密钥信息
type UserBizKeyInfo struct {
	// 拥有该密钥的用户列表
	// example:
	//
	// CZKZJVCN
	GrantedUser []*string `json:"granted_user,omitempty" xml:"granted_user,omitempty" require:"true" type:"Repeated"`
	// 密钥名称
	// example:
	//
	// subunion_a_key
	KeyName *string `json:"key_name,omitempty" xml:"key_name,omitempty" require:"true"`
}

func (s UserBizKeyInfo) String() string {
	return tea.Prettify(s)
}

func (s UserBizKeyInfo) GoString() string {
	return s.String()
}

func (s *UserBizKeyInfo) SetGrantedUser(v []*string) *UserBizKeyInfo {
	s.GrantedUser = v
	return s
}

func (s *UserBizKeyInfo) SetKeyName(v string) *UserBizKeyInfo {
	s.KeyName = &v
	return s
}

// 证书详情
type BareClaim struct {
	// 下面的内容由调用者自己定义，建议只存放必要的声明信息，不要放置敏感数据
	// example:
	//
	// {"degree": {"type": "BachelorDegree","name": "Baccalauréat en musiques numériques"}}
	Claim *string `json:"claim,omitempty" xml:"claim,omitempty" require:"true"`
	// 证书类型
	// example:
	//
	// claimtype
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s BareClaim) String() string {
	return tea.Prettify(s)
}

func (s BareClaim) GoString() string {
	return s.String()
}

func (s *BareClaim) SetClaim(v string) *BareClaim {
	s.Claim = &v
	return s
}

func (s *BareClaim) SetType(v string) *BareClaim {
	s.Type = &v
	return s
}

// 合约链配置信息结果，内部包含一个列表，列举多个合约链的配置信息
type ContractIdeConfigResult struct {
	// 合约链的配置信息，可包含多个合约链的配置
	ContractIdeConfigList []*ContractIdeConfig `json:"contract_ide_config_list,omitempty" xml:"contract_ide_config_list,omitempty" require:"true" type:"Repeated"`
}

func (s ContractIdeConfigResult) String() string {
	return tea.Prettify(s)
}

func (s ContractIdeConfigResult) GoString() string {
	return s.String()
}

func (s *ContractIdeConfigResult) SetContractIdeConfigList(v []*ContractIdeConfig) *ContractIdeConfigResult {
	s.ContractIdeConfigList = v
	return s
}

// 合约与应用关联信息
type ContractBindListResp struct {
	// 合约关联列表
	List []*ContractBindResp `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
}

func (s ContractBindListResp) String() string {
	return tea.Prettify(s)
}

func (s ContractBindListResp) GoString() string {
	return s.String()
}

func (s *ContractBindListResp) SetList(v []*ContractBindResp) *ContractBindListResp {
	s.List = v
	return s
}

// 合约详情
type ContractDetailResp struct {
	// 合约服务ID
	// example:
	//
	// cme20230724104931af3a4d
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty"`
	// 合约服务名称
	// example:
	//
	// 存证合约
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 创建人
	// example:
	//
	// 张三
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty"`
	// 创建时间
	// example:
	//
	// 1690166971465
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 订购产品
	// example:
	//
	// 存证合约服务
	OrderingProducts *string `json:"ordering_products,omitempty" xml:"ordering_products,omitempty"`
	// 关联区块链id
	// example:
	//
	// 284f75bc-8069-443f-9d46-4576bb15f210
	ChanId *string `json:"chan_id,omitempty" xml:"chan_id,omitempty"`
	// 合约状态
	// example:
	//
	// DEPLOYED
	ContractStatus *string `json:"contract_status,omitempty" xml:"contract_status,omitempty"`
	// 合约部署进度当前状态
	// example:
	//
	// SERVICE_START
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 合约部署进度
	ProgressInfoList []*InstanceProgressInfo `json:"progress_info_list,omitempty" xml:"progress_info_list,omitempty" type:"Repeated"`
	// 实例最近调用记录(暂缓，先不做)
	RecordInfoList []*InstanceRecordInfo `json:"record_info_list,omitempty" xml:"record_info_list,omitempty" type:"Repeated"`
}

func (s ContractDetailResp) String() string {
	return tea.Prettify(s)
}

func (s ContractDetailResp) GoString() string {
	return s.String()
}

func (s *ContractDetailResp) SetServiceId(v string) *ContractDetailResp {
	s.ServiceId = &v
	return s
}

func (s *ContractDetailResp) SetName(v string) *ContractDetailResp {
	s.Name = &v
	return s
}

func (s *ContractDetailResp) SetCreator(v string) *ContractDetailResp {
	s.Creator = &v
	return s
}

func (s *ContractDetailResp) SetCreateTime(v int64) *ContractDetailResp {
	s.CreateTime = &v
	return s
}

func (s *ContractDetailResp) SetOrderingProducts(v string) *ContractDetailResp {
	s.OrderingProducts = &v
	return s
}

func (s *ContractDetailResp) SetChanId(v string) *ContractDetailResp {
	s.ChanId = &v
	return s
}

func (s *ContractDetailResp) SetContractStatus(v string) *ContractDetailResp {
	s.ContractStatus = &v
	return s
}

func (s *ContractDetailResp) SetStatus(v string) *ContractDetailResp {
	s.Status = &v
	return s
}

func (s *ContractDetailResp) SetProgressInfoList(v []*InstanceProgressInfo) *ContractDetailResp {
	s.ProgressInfoList = v
	return s
}

func (s *ContractDetailResp) SetRecordInfoList(v []*InstanceRecordInfo) *ContractDetailResp {
	s.RecordInfoList = v
	return s
}

// 默认结算规则
type DefaultSettleRule struct {
	// 默认结算类型，结算到银行卡: bankCard，结算到支付宝账号: alipayAccount
	// example:
	//
	// alipayAccount
	DefaultSettleType *string `json:"default_settle_type,omitempty" xml:"default_settle_type,omitempty" require:"true"`
	// 默认结算目标	bankCard 时填银行卡号，alipayAccount 时填支付宝登录号
	// example:
	//
	// myalipay@alipay.com
	DefaultSettleTarget *string `json:"default_settle_target,omitempty" xml:"default_settle_target,omitempty" require:"true"`
}

func (s DefaultSettleRule) String() string {
	return tea.Prettify(s)
}

func (s DefaultSettleRule) GoString() string {
	return s.String()
}

func (s *DefaultSettleRule) SetDefaultSettleType(v string) *DefaultSettleRule {
	s.DefaultSettleType = &v
	return s
}

func (s *DefaultSettleRule) SetDefaultSettleTarget(v string) *DefaultSettleRule {
	s.DefaultSettleTarget = &v
	return s
}

// 托管数据库ManagedMQDTO结构体
type ManagedMQDTOStructBody struct {
	// id
	// example:
	//
	// 5
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 实例
	// example:
	//
	// "MQ_INST_1287126353308684_BXYEnC3u"
	Instance *string `json:"instance,omitempty" xml:"instance,omitempty"`
	// 主题
	// example:
	//
	// "tfx4lb3m0qh3emact73tln8t8qkygb65"
	Topic *string `json:"topic,omitempty" xml:"topic,omitempty"`
	// 类型
	// example:
	//
	// "basic"
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s ManagedMQDTOStructBody) String() string {
	return tea.Prettify(s)
}

func (s ManagedMQDTOStructBody) GoString() string {
	return s.String()
}

func (s *ManagedMQDTOStructBody) SetId(v string) *ManagedMQDTOStructBody {
	s.Id = &v
	return s
}

func (s *ManagedMQDTOStructBody) SetInstance(v string) *ManagedMQDTOStructBody {
	s.Instance = &v
	return s
}

func (s *ManagedMQDTOStructBody) SetTopic(v string) *ManagedMQDTOStructBody {
	s.Topic = &v
	return s
}

func (s *ManagedMQDTOStructBody) SetType(v string) *ManagedMQDTOStructBody {
	s.Type = &v
	return s
}

// 证书批量颁发进度
type CertIssueProgressDTO struct {
	// 证书实例id
	// example:
	//
	// b99e641b2d6d45ac90600fd958e8bc3a
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 存证ID，如果颁发失败，此值为null
	// example:
	//
	// vc:mychain:xxxxxx
	VcId *string `json:"vc_id,omitempty" xml:"vc_id,omitempty" require:"true"`
	// 因校验异常停止任务（不会继续校验文件内容和颁发证书） -3
	// 因校验内容不正确停止颁发任务(会校验完所有的行但不执行颁发) -2
	// 已手动取消（可重试状态下手动取消任务，取消状态下可以启动新的颁发任务） -1
	// 可重试 0
	// 执行中（初始状态） 1
	// 已成功完成 2
	// example:
	//
	// 2
	Status *int64 `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// is_error=true时的错误描述
	// example:
	//
	// 标题格式不正确
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty" require:"true"`
	// 证书的字段标题列表
	// example:
	//
	// [身份证号,姓名,证书字段1]
	Titles []*string `json:"titles,omitempty" xml:"titles,omitempty" require:"true" type:"Repeated"`
	// 颁发进度百分比
	// example:
	//
	// 0-100
	ProgressPercent *int64 `json:"progress_percent,omitempty" xml:"progress_percent,omitempty" require:"true"`
	// 当前批次数据总行数（不含标题）
	// example:
	//
	// 0-5000
	TotalNum *string `json:"total_num,omitempty" xml:"total_num,omitempty" require:"true"`
	// 颁发证书当前执行的阶段，VERIFY：校验文件中，ISSUE：颁发中
	// example:
	//
	// VERIFY、ISSUE
	CurTaskType *string `json:"cur_task_type,omitempty" xml:"cur_task_type,omitempty" require:"true"`
	// 颁发开始的时间戳
	// example:
	//
	// 18123123123123
	StartTimeMillis *int64 `json:"start_time_millis,omitempty" xml:"start_time_millis,omitempty" require:"true"`
	// 颁发结束的时间戳
	// example:
	//
	// 182371293192831
	EndTimeMillis *int64 `json:"end_time_millis,omitempty" xml:"end_time_millis,omitempty" require:"true"`
	// 校验错误描述列表
	ErrorDetails []*TemplateInstanceErrorDetailDTO `json:"error_details,omitempty" xml:"error_details,omitempty" require:"true" type:"Repeated"`
}

func (s CertIssueProgressDTO) String() string {
	return tea.Prettify(s)
}

func (s CertIssueProgressDTO) GoString() string {
	return s.String()
}

func (s *CertIssueProgressDTO) SetBizId(v string) *CertIssueProgressDTO {
	s.BizId = &v
	return s
}

func (s *CertIssueProgressDTO) SetVcId(v string) *CertIssueProgressDTO {
	s.VcId = &v
	return s
}

func (s *CertIssueProgressDTO) SetStatus(v int64) *CertIssueProgressDTO {
	s.Status = &v
	return s
}

func (s *CertIssueProgressDTO) SetErrorMessage(v string) *CertIssueProgressDTO {
	s.ErrorMessage = &v
	return s
}

func (s *CertIssueProgressDTO) SetTitles(v []*string) *CertIssueProgressDTO {
	s.Titles = v
	return s
}

func (s *CertIssueProgressDTO) SetProgressPercent(v int64) *CertIssueProgressDTO {
	s.ProgressPercent = &v
	return s
}

func (s *CertIssueProgressDTO) SetTotalNum(v string) *CertIssueProgressDTO {
	s.TotalNum = &v
	return s
}

func (s *CertIssueProgressDTO) SetCurTaskType(v string) *CertIssueProgressDTO {
	s.CurTaskType = &v
	return s
}

func (s *CertIssueProgressDTO) SetStartTimeMillis(v int64) *CertIssueProgressDTO {
	s.StartTimeMillis = &v
	return s
}

func (s *CertIssueProgressDTO) SetEndTimeMillis(v int64) *CertIssueProgressDTO {
	s.EndTimeMillis = &v
	return s
}

func (s *CertIssueProgressDTO) SetErrorDetails(v []*TemplateInstanceErrorDetailDTO) *CertIssueProgressDTO {
	s.ErrorDetails = v
	return s
}

// 退款商品详细信息
type RefundGoodsDetail struct {
	// 商品编号
	// example:
	//
	// apple-01
	GoodsId *string `json:"goods_id,omitempty" xml:"goods_id,omitempty" require:"true"`
	// 该商品的退款总金额
	// example:
	//
	// 19.50
	RefundAmount *string `json:"refund_amount,omitempty" xml:"refund_amount,omitempty" require:"true"`
}

func (s RefundGoodsDetail) String() string {
	return tea.Prettify(s)
}

func (s RefundGoodsDetail) GoString() string {
	return s.String()
}

func (s *RefundGoodsDetail) SetGoodsId(v string) *RefundGoodsDetail {
	s.GoodsId = &v
	return s
}

func (s *RefundGoodsDetail) SetRefundAmount(v string) *RefundGoodsDetail {
	s.RefundAmount = &v
	return s
}

// 存证信息集合
type NotaryTransaction struct {
	// 如果存证类型为text, 则为存证内容
	// 如果存证类型为file,则为存证文件临时下载地址
	// example:
	//
	// content
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 链上存证哈希
	// example:
	//
	// 04181b49ee5d7eb0099a289ac8a45df6afb5aa2679c5284444698a9790099269
	TransactionHash *string `json:"transaction_hash,omitempty" xml:"transaction_hash,omitempty" require:"true"`
	// 存证类型
	// example:
	//
	// text,file
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s NotaryTransaction) String() string {
	return tea.Prettify(s)
}

func (s NotaryTransaction) GoString() string {
	return s.String()
}

func (s *NotaryTransaction) SetContent(v string) *NotaryTransaction {
	s.Content = &v
	return s
}

func (s *NotaryTransaction) SetTransactionHash(v string) *NotaryTransaction {
	s.TransactionHash = &v
	return s
}

func (s *NotaryTransaction) SetType(v string) *NotaryTransaction {
	s.Type = &v
	return s
}

// 蚂蚁链最新交易信息
type BlockchainBrowserLatestTransaction struct {
	// create_time
	// example:
	//
	// createTime
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty" require:"true"`
	// from
	// example:
	//
	// eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612
	From *string `json:"from,omitempty" xml:"from,omitempty" require:"true"`
	// to
	// example:
	//
	// e4386406265f8a0f7d3a84efec3afa3ea12d2f9a3c21e2928a7b4d6a4e70ba68
	To *string `json:"to,omitempty" xml:"to,omitempty" require:"true"`
	// hash
	// example:
	//
	// eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty" require:"true"`
	// transactionV10Type
	// example:
	//
	// TX_DEPOSIT_DATA
	TransactionType *string `json:"transaction_type,omitempty" xml:"transaction_type,omitempty" require:"true"`
}

func (s BlockchainBrowserLatestTransaction) String() string {
	return tea.Prettify(s)
}

func (s BlockchainBrowserLatestTransaction) GoString() string {
	return s.String()
}

func (s *BlockchainBrowserLatestTransaction) SetCreateTime(v int64) *BlockchainBrowserLatestTransaction {
	s.CreateTime = &v
	return s
}

func (s *BlockchainBrowserLatestTransaction) SetFrom(v string) *BlockchainBrowserLatestTransaction {
	s.From = &v
	return s
}

func (s *BlockchainBrowserLatestTransaction) SetTo(v string) *BlockchainBrowserLatestTransaction {
	s.To = &v
	return s
}

func (s *BlockchainBrowserLatestTransaction) SetHash(v string) *BlockchainBrowserLatestTransaction {
	s.Hash = &v
	return s
}

func (s *BlockchainBrowserLatestTransaction) SetTransactionType(v string) *BlockchainBrowserLatestTransaction {
	s.TransactionType = &v
	return s
}

// 版通历史发行记录信息
type EPIssueHisInfo struct {
	// 版通发行日期时间戳
	// example:
	//
	// 1560827725
	IssueDate *int64 `json:"issue_date,omitempty" xml:"issue_date,omitempty" require:"true"`
	// 版通线下发行量
	// example:
	//
	// 1000
	OfflineIssueAmount *int64 `json:"offline_issue_amount,omitempty" xml:"offline_issue_amount,omitempty" require:"true"`
	// 版通线上发行量
	// example:
	//
	// 1000
	OnlineIssueAmount *int64 `json:"online_issue_amount,omitempty" xml:"online_issue_amount,omitempty" require:"true"`
	// 版通自持发行量
	// example:
	//
	// 1000
	SelfIssueAmount *int64 `json:"self_issue_amount,omitempty" xml:"self_issue_amount,omitempty" require:"true"`
}

func (s EPIssueHisInfo) String() string {
	return tea.Prettify(s)
}

func (s EPIssueHisInfo) GoString() string {
	return s.String()
}

func (s *EPIssueHisInfo) SetIssueDate(v int64) *EPIssueHisInfo {
	s.IssueDate = &v
	return s
}

func (s *EPIssueHisInfo) SetOfflineIssueAmount(v int64) *EPIssueHisInfo {
	s.OfflineIssueAmount = &v
	return s
}

func (s *EPIssueHisInfo) SetOnlineIssueAmount(v int64) *EPIssueHisInfo {
	s.OnlineIssueAmount = &v
	return s
}

func (s *EPIssueHisInfo) SetSelfIssueAmount(v int64) *EPIssueHisInfo {
	s.SelfIssueAmount = &v
	return s
}

// 数据资产分页查询
type ListDataEntityResult struct {
	// 数据模型信息
	DataModel *DataModel `json:"data_model,omitempty" xml:"data_model,omitempty" require:"true"`
	// 数据资产信息
	DataEntity *DataEntity `json:"data_entity,omitempty" xml:"data_entity,omitempty" require:"true"`
}

func (s ListDataEntityResult) String() string {
	return tea.Prettify(s)
}

func (s ListDataEntityResult) GoString() string {
	return s.String()
}

func (s *ListDataEntityResult) SetDataModel(v *DataModel) *ListDataEntityResult {
	s.DataModel = v
	return s
}

func (s *ListDataEntityResult) SetDataEntity(v *DataEntity) *ListDataEntityResult {
	s.DataEntity = v
	return s
}

// 新建合约服务
type ContractCreateReq struct {
	// 链ID
	// example:
	//
	// 284f75bc-8069-443f-9d46-4576bb15f210
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty" require:"true"`
	// 合约模板标识
	// example:
	//
	// cme2023072511571851e2f3
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 合约名称
	// example:
	//
	// 资产合约
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s ContractCreateReq) String() string {
	return tea.Prettify(s)
}

func (s ContractCreateReq) GoString() string {
	return s.String()
}

func (s *ContractCreateReq) SetChainId(v string) *ContractCreateReq {
	s.ChainId = &v
	return s
}

func (s *ContractCreateReq) SetTemplateId(v string) *ContractCreateReq {
	s.TemplateId = &v
	return s
}

func (s *ContractCreateReq) SetName(v string) *ContractCreateReq {
	s.Name = &v
	return s
}

// identity parameter
type IdentityParam struct {
	// 经办人姓名
	// example:
	//
	// 张某某
	Agent *string `json:"agent,omitempty" xml:"agent,omitempty"`
	// 经办人身份证号
	// example:
	//
	// 130406200101012832
	AgentId *string `json:"agent_id,omitempty" xml:"agent_id,omitempty"`
	// 用户的姓名
	// example:
	//
	// 李明
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 用户的身份证号
	// example:
	//
	// 410204200101013716
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 用户证件类型，目前只支持IDENTITY_CARD
	// example:
	//
	// IDENTITY_CARD
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 法人姓名，企业认证必选
	// example:
	//
	// 张某某
	LegalPerson *string `json:"legal_person,omitempty" xml:"legal_person,omitempty"`
	// 法人身份证，企业认证必选
	// example:
	//
	// 130406200101010634
	LegalPersonId *string `json:"legal_person_id,omitempty" xml:"legal_person_id,omitempty"`
	// 手机号码
	// example:
	//
	// 18322331111
	MobileNo *string `json:"mobile_no,omitempty" xml:"mobile_no,omitempty"`
	// 扩展属性字段
	// example:
	//
	// {"key":"value"}
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 用户类型，默认为PERSON
	// example:
	//
	// PERSON,ENTERPRISE
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty"`
}

func (s IdentityParam) String() string {
	return tea.Prettify(s)
}

func (s IdentityParam) GoString() string {
	return s.String()
}

func (s *IdentityParam) SetAgent(v string) *IdentityParam {
	s.Agent = &v
	return s
}

func (s *IdentityParam) SetAgentId(v string) *IdentityParam {
	s.AgentId = &v
	return s
}

func (s *IdentityParam) SetCertName(v string) *IdentityParam {
	s.CertName = &v
	return s
}

func (s *IdentityParam) SetCertNo(v string) *IdentityParam {
	s.CertNo = &v
	return s
}

func (s *IdentityParam) SetCertType(v string) *IdentityParam {
	s.CertType = &v
	return s
}

func (s *IdentityParam) SetLegalPerson(v string) *IdentityParam {
	s.LegalPerson = &v
	return s
}

func (s *IdentityParam) SetLegalPersonId(v string) *IdentityParam {
	s.LegalPersonId = &v
	return s
}

func (s *IdentityParam) SetMobileNo(v string) *IdentityParam {
	s.MobileNo = &v
	return s
}

func (s *IdentityParam) SetProperties(v string) *IdentityParam {
	s.Properties = &v
	return s
}

func (s *IdentityParam) SetUserType(v string) *IdentityParam {
	s.UserType = &v
	return s
}

// 阿里云链信息
type ALiYunChainInfo struct {
	// abnormal_nodes
	// example:
	//
	// 4
	AbnormalNodes *int64 `json:"abnormal_nodes,omitempty" xml:"abnormal_nodes,omitempty"`
	// ant_chain_id
	// example:
	//
	// ant_chain_id
	AntChainId *string `json:"ant_chain_id,omitempty" xml:"ant_chain_id,omitempty"`
	// block_height
	// example:
	//
	// 2131
	BlockHeight *int64 `json:"block_height,omitempty" xml:"block_height,omitempty"`
	// create_time
	// example:
	//
	// 123131212312
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// is_role
	// example:
	//
	// true
	IsRole *bool `json:"is_role,omitempty" xml:"is_role,omitempty"`
	// node_number
	// example:
	//
	// 4
	NodeNumber *int64 `json:"node_number,omitempty" xml:"node_number,omitempty"`
	// normal
	// example:
	//
	// true, false
	Normal *bool `json:"normal,omitempty" xml:"normal,omitempty"`
	// transaction_sum
	// example:
	//
	// 312312
	TransactionSum *int64 `json:"transaction_sum,omitempty" xml:"transaction_sum,omitempty"`
	// Version
	// example:
	//
	// Version
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
	// node_infos
	// example:
	//
	// node_infos
	NodeInfos []*ALiYunChainNodeInfo `json:"node_infos,omitempty" xml:"node_infos,omitempty" type:"Repeated"`
}

func (s ALiYunChainInfo) String() string {
	return tea.Prettify(s)
}

func (s ALiYunChainInfo) GoString() string {
	return s.String()
}

func (s *ALiYunChainInfo) SetAbnormalNodes(v int64) *ALiYunChainInfo {
	s.AbnormalNodes = &v
	return s
}

func (s *ALiYunChainInfo) SetAntChainId(v string) *ALiYunChainInfo {
	s.AntChainId = &v
	return s
}

func (s *ALiYunChainInfo) SetBlockHeight(v int64) *ALiYunChainInfo {
	s.BlockHeight = &v
	return s
}

func (s *ALiYunChainInfo) SetCreateTime(v int64) *ALiYunChainInfo {
	s.CreateTime = &v
	return s
}

func (s *ALiYunChainInfo) SetIsRole(v bool) *ALiYunChainInfo {
	s.IsRole = &v
	return s
}

func (s *ALiYunChainInfo) SetNodeNumber(v int64) *ALiYunChainInfo {
	s.NodeNumber = &v
	return s
}

func (s *ALiYunChainInfo) SetNormal(v bool) *ALiYunChainInfo {
	s.Normal = &v
	return s
}

func (s *ALiYunChainInfo) SetTransactionSum(v int64) *ALiYunChainInfo {
	s.TransactionSum = &v
	return s
}

func (s *ALiYunChainInfo) SetVersion(v string) *ALiYunChainInfo {
	s.Version = &v
	return s
}

func (s *ALiYunChainInfo) SetNodeInfos(v []*ALiYunChainNodeInfo) *ALiYunChainInfo {
	s.NodeInfos = v
	return s
}

// 创建did doc时的具体操作
type DidAddDoc struct {
	// did doc content
	// example:
	//
	// json string
	Doc *string `json:"doc,omitempty" xml:"doc,omitempty" require:"true"`
}

func (s DidAddDoc) String() string {
	return tea.Prettify(s)
}

func (s DidAddDoc) GoString() string {
	return s.String()
}

func (s *DidAddDoc) SetDoc(v string) *DidAddDoc {
	s.Doc = &v
	return s
}

// 证书模板详情类
type TemplateInfoDTO struct {
	// 主键
	// example:
	//
	// 1
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 模板类别：马拉松类、滑雪类
	// example:
	//
	// marathon
	Category *string `json:"category,omitempty" xml:"category,omitempty" require:"true"`
	// 模板内容， json格式文本
	// example:
	//
	// {}
	ClaimTemplate *string `json:"claim_template,omitempty" xml:"claim_template,omitempty" require:"true"`
	// 创建时间
	// example:
	//
	// 2021-01-01 00:00:00
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true"`
	// 修改时间
	// example:
	//
	// 2021-01-01 00:00:00
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true"`
}

func (s TemplateInfoDTO) String() string {
	return tea.Prettify(s)
}

func (s TemplateInfoDTO) GoString() string {
	return s.String()
}

func (s *TemplateInfoDTO) SetId(v int64) *TemplateInfoDTO {
	s.Id = &v
	return s
}

func (s *TemplateInfoDTO) SetCategory(v string) *TemplateInfoDTO {
	s.Category = &v
	return s
}

func (s *TemplateInfoDTO) SetClaimTemplate(v string) *TemplateInfoDTO {
	s.ClaimTemplate = &v
	return s
}

func (s *TemplateInfoDTO) SetGmtCreate(v string) *TemplateInfoDTO {
	s.GmtCreate = &v
	return s
}

func (s *TemplateInfoDTO) SetGmtModified(v string) *TemplateInfoDTO {
	s.GmtModified = &v
	return s
}

// 发券记录列表
type OrderList struct {
	// 活动ID
	// example:
	//
	// 0zgNdId0nxi95b5lsNpazWYoCo5
	ActivityId *string `json:"activity_id,omitempty" xml:"activity_id,omitempty"`
	// 记录ID
	// example:
	//
	// 110000199001011234
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 业务ID
	// example:
	//
	// b5lsNpazWYoCo5
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 奖品id
	// example:
	//
	// 110000199001011234
	PrizeId *string `json:"prize_id,omitempty" xml:"prize_id,omitempty"`
	// 触发时间
	// example:
	//
	// 2026-04-29 10:19:23
	SendTime *string `json:"send_time,omitempty" xml:"send_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 发券结果
	// example:
	//
	// SUCCESS
	SendStatus *string `json:"send_status,omitempty" xml:"send_status,omitempty"`
	// 错误码
	// example:
	//
	// 10000911
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 错误描述
	// example:
	//
	// [10000911]指定奖品指定金额决策参数检查异常
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
}

func (s OrderList) String() string {
	return tea.Prettify(s)
}

func (s OrderList) GoString() string {
	return s.String()
}

func (s *OrderList) SetActivityId(v string) *OrderList {
	s.ActivityId = &v
	return s
}

func (s *OrderList) SetId(v string) *OrderList {
	s.Id = &v
	return s
}

func (s *OrderList) SetBizId(v string) *OrderList {
	s.BizId = &v
	return s
}

func (s *OrderList) SetPrizeId(v string) *OrderList {
	s.PrizeId = &v
	return s
}

func (s *OrderList) SetSendTime(v string) *OrderList {
	s.SendTime = &v
	return s
}

func (s *OrderList) SetSendStatus(v string) *OrderList {
	s.SendStatus = &v
	return s
}

func (s *OrderList) SetErrorCode(v string) *OrderList {
	s.ErrorCode = &v
	return s
}

func (s *OrderList) SetErrorMsg(v string) *OrderList {
	s.ErrorMsg = &v
	return s
}

// 退款列表
type RefundList struct {
	// 退款业务号
	// example:
	//
	// XXX
	OutRequestNo *string `json:"out_request_no,omitempty" xml:"out_request_no,omitempty" require:"true"`
	// 本次退款金额
	// example:
	//
	// 1.09
	RefundAmount *string `json:"refund_amount,omitempty" xml:"refund_amount,omitempty" require:"true"`
	// 退款状态
	// example:
	//
	// XXX
	RefundStatus *string `json:"refund_status,omitempty" xml:"refund_status,omitempty" require:"true"`
}

func (s RefundList) String() string {
	return tea.Prettify(s)
}

func (s RefundList) GoString() string {
	return s.String()
}

func (s *RefundList) SetOutRequestNo(v string) *RefundList {
	s.OutRequestNo = &v
	return s
}

func (s *RefundList) SetRefundAmount(v string) *RefundList {
	s.RefundAmount = &v
	return s
}

func (s *RefundList) SetRefundStatus(v string) *RefundList {
	s.RefundStatus = &v
	return s
}

// 退款信息
type RefundInfo struct {
	// 退款业务号
	// example:
	//
	// XXX
	OutRequestNo *string `json:"out_request_no,omitempty" xml:"out_request_no,omitempty" require:"true"`
	// 本次退款金额
	// example:
	//
	// 11.09
	RefundAmount *string `json:"refund_amount,omitempty" xml:"refund_amount,omitempty" require:"true"`
	// 退款状态
	// example:
	//
	// XXX
	RefundStatus *string `json:"refund_status,omitempty" xml:"refund_status,omitempty" require:"true"`
}

func (s RefundInfo) String() string {
	return tea.Prettify(s)
}

func (s RefundInfo) GoString() string {
	return s.String()
}

func (s *RefundInfo) SetOutRequestNo(v string) *RefundInfo {
	s.OutRequestNo = &v
	return s
}

func (s *RefundInfo) SetRefundAmount(v string) *RefundInfo {
	s.RefundAmount = &v
	return s
}

func (s *RefundInfo) SetRefundStatus(v string) *RefundInfo {
	s.RefundStatus = &v
	return s
}

type QueryBaasPromotionActivityRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 活动ID，由运营线下通知分配
	ActivityId *string `json:"activity_id,omitempty" xml:"activity_id,omitempty" require:"true"`
}

func (s QueryBaasPromotionActivityRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPromotionActivityRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPromotionActivityRequest) SetAuthToken(v string) *QueryBaasPromotionActivityRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPromotionActivityRequest) SetProductInstanceId(v string) *QueryBaasPromotionActivityRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPromotionActivityRequest) SetActivityId(v string) *QueryBaasPromotionActivityRequest {
	s.ActivityId = &v
	return s
}

type QueryBaasPromotionActivityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 活动基本信息
	ActivityBaseInfo *ActivityBaseInfo `json:"activity_base_info,omitempty" xml:"activity_base_info,omitempty"`
	// 关联奖品列表
	PrizeList *PrizeList `json:"prize_list,omitempty" xml:"prize_list,omitempty"`
}

func (s QueryBaasPromotionActivityResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPromotionActivityResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPromotionActivityResponse) SetReqMsgId(v string) *QueryBaasPromotionActivityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPromotionActivityResponse) SetResultCode(v string) *QueryBaasPromotionActivityResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPromotionActivityResponse) SetResultMsg(v string) *QueryBaasPromotionActivityResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPromotionActivityResponse) SetActivityBaseInfo(v *ActivityBaseInfo) *QueryBaasPromotionActivityResponse {
	s.ActivityBaseInfo = v
	return s
}

func (s *QueryBaasPromotionActivityResponse) SetPrizeList(v *PrizeList) *QueryBaasPromotionActivityResponse {
	s.PrizeList = v
	return s
}

type ExecBaasPromotionCouponRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// openId
	OpenId *string `json:"open_id,omitempty" xml:"open_id,omitempty" require:"true"`
	// appId
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 活动ID，由运营线下通知分配
	ActivityId *string `json:"activity_id,omitempty" xml:"activity_id,omitempty" require:"true"`
	// 奖品ID，需要指定奖品抽奖时传入
	PrizeId *string `json:"prize_id,omitempty" xml:"prize_id,omitempty"`
}

func (s ExecBaasPromotionCouponRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecBaasPromotionCouponRequest) GoString() string {
	return s.String()
}

func (s *ExecBaasPromotionCouponRequest) SetAuthToken(v string) *ExecBaasPromotionCouponRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecBaasPromotionCouponRequest) SetProductInstanceId(v string) *ExecBaasPromotionCouponRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecBaasPromotionCouponRequest) SetBizId(v string) *ExecBaasPromotionCouponRequest {
	s.BizId = &v
	return s
}

func (s *ExecBaasPromotionCouponRequest) SetOpenId(v string) *ExecBaasPromotionCouponRequest {
	s.OpenId = &v
	return s
}

func (s *ExecBaasPromotionCouponRequest) SetAppId(v string) *ExecBaasPromotionCouponRequest {
	s.AppId = &v
	return s
}

func (s *ExecBaasPromotionCouponRequest) SetActivityId(v string) *ExecBaasPromotionCouponRequest {
	s.ActivityId = &v
	return s
}

func (s *ExecBaasPromotionCouponRequest) SetPrizeId(v string) *ExecBaasPromotionCouponRequest {
	s.PrizeId = &v
	return s
}

type ExecBaasPromotionCouponResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 活动ID
	ActivityId *string `json:"activity_id,omitempty" xml:"activity_id,omitempty"`
	// 活动名称
	ActivityName *string `json:"activity_name,omitempty" xml:"activity_name,omitempty"`
	// 活动状态
	ActivityStatus *string `json:"activity_status,omitempty" xml:"activity_status,omitempty"`
	// 子错误码
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 子错误描述
	SubMessage *string `json:"sub_message,omitempty" xml:"sub_message,omitempty"`
}

func (s ExecBaasPromotionCouponResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecBaasPromotionCouponResponse) GoString() string {
	return s.String()
}

func (s *ExecBaasPromotionCouponResponse) SetReqMsgId(v string) *ExecBaasPromotionCouponResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecBaasPromotionCouponResponse) SetResultCode(v string) *ExecBaasPromotionCouponResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecBaasPromotionCouponResponse) SetResultMsg(v string) *ExecBaasPromotionCouponResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecBaasPromotionCouponResponse) SetActivityId(v string) *ExecBaasPromotionCouponResponse {
	s.ActivityId = &v
	return s
}

func (s *ExecBaasPromotionCouponResponse) SetActivityName(v string) *ExecBaasPromotionCouponResponse {
	s.ActivityName = &v
	return s
}

func (s *ExecBaasPromotionCouponResponse) SetActivityStatus(v string) *ExecBaasPromotionCouponResponse {
	s.ActivityStatus = &v
	return s
}

func (s *ExecBaasPromotionCouponResponse) SetSubCode(v string) *ExecBaasPromotionCouponResponse {
	s.SubCode = &v
	return s
}

func (s *ExecBaasPromotionCouponResponse) SetSubMessage(v string) *ExecBaasPromotionCouponResponse {
	s.SubMessage = &v
	return s
}

type QueryBaasPromotionCouponRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// openId
	OpenId *string `json:"open_id,omitempty" xml:"open_id,omitempty"`
	// appId
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty"`
	// 活动ID
	ActivityId *string `json:"activity_id,omitempty" xml:"activity_id,omitempty" require:"true"`
	// 开始日期
	StartDate *string `json:"start_date,omitempty" xml:"start_date,omitempty"`
	// 结束日期
	EndDate *string `json:"end_date,omitempty" xml:"end_date,omitempty"`
	// 页码，默认 1，最小值 1
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 每页数量，默认 20，范围 1~100
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s QueryBaasPromotionCouponRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPromotionCouponRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPromotionCouponRequest) SetAuthToken(v string) *QueryBaasPromotionCouponRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPromotionCouponRequest) SetProductInstanceId(v string) *QueryBaasPromotionCouponRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPromotionCouponRequest) SetOpenId(v string) *QueryBaasPromotionCouponRequest {
	s.OpenId = &v
	return s
}

func (s *QueryBaasPromotionCouponRequest) SetAppId(v string) *QueryBaasPromotionCouponRequest {
	s.AppId = &v
	return s
}

func (s *QueryBaasPromotionCouponRequest) SetActivityId(v string) *QueryBaasPromotionCouponRequest {
	s.ActivityId = &v
	return s
}

func (s *QueryBaasPromotionCouponRequest) SetStartDate(v string) *QueryBaasPromotionCouponRequest {
	s.StartDate = &v
	return s
}

func (s *QueryBaasPromotionCouponRequest) SetEndDate(v string) *QueryBaasPromotionCouponRequest {
	s.EndDate = &v
	return s
}

func (s *QueryBaasPromotionCouponRequest) SetPageNum(v int64) *QueryBaasPromotionCouponRequest {
	s.PageNum = &v
	return s
}

func (s *QueryBaasPromotionCouponRequest) SetPageSize(v int64) *QueryBaasPromotionCouponRequest {
	s.PageSize = &v
	return s
}

type QueryBaasPromotionCouponResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 记录总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 当前页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 每页数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 发券记录列表
	List []*List `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
}

func (s QueryBaasPromotionCouponResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPromotionCouponResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPromotionCouponResponse) SetReqMsgId(v string) *QueryBaasPromotionCouponResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPromotionCouponResponse) SetResultCode(v string) *QueryBaasPromotionCouponResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPromotionCouponResponse) SetResultMsg(v string) *QueryBaasPromotionCouponResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPromotionCouponResponse) SetTotalCount(v int64) *QueryBaasPromotionCouponResponse {
	s.TotalCount = &v
	return s
}

func (s *QueryBaasPromotionCouponResponse) SetPageNum(v int64) *QueryBaasPromotionCouponResponse {
	s.PageNum = &v
	return s
}

func (s *QueryBaasPromotionCouponResponse) SetPageSize(v int64) *QueryBaasPromotionCouponResponse {
	s.PageSize = &v
	return s
}

func (s *QueryBaasPromotionCouponResponse) SetList(v []*List) *QueryBaasPromotionCouponResponse {
	s.List = v
	return s
}

type QueryPromotionActivityRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 活动ID，由运营线下通知分配
	ActivityId *string `json:"activity_id,omitempty" xml:"activity_id,omitempty" require:"true"`
}

func (s QueryPromotionActivityRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryPromotionActivityRequest) GoString() string {
	return s.String()
}

func (s *QueryPromotionActivityRequest) SetAuthToken(v string) *QueryPromotionActivityRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryPromotionActivityRequest) SetProductInstanceId(v string) *QueryPromotionActivityRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryPromotionActivityRequest) SetActivityId(v string) *QueryPromotionActivityRequest {
	s.ActivityId = &v
	return s
}

type QueryPromotionActivityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 活动基本信息
	ActivityBaseInfo *ActivityBaseInfo `json:"activity_base_info,omitempty" xml:"activity_base_info,omitempty"`
	// 关联奖品列表
	PrizeList *PrizeList `json:"prize_list,omitempty" xml:"prize_list,omitempty"`
}

func (s QueryPromotionActivityResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryPromotionActivityResponse) GoString() string {
	return s.String()
}

func (s *QueryPromotionActivityResponse) SetReqMsgId(v string) *QueryPromotionActivityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryPromotionActivityResponse) SetResultCode(v string) *QueryPromotionActivityResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryPromotionActivityResponse) SetResultMsg(v string) *QueryPromotionActivityResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryPromotionActivityResponse) SetActivityBaseInfo(v *ActivityBaseInfo) *QueryPromotionActivityResponse {
	s.ActivityBaseInfo = v
	return s
}

func (s *QueryPromotionActivityResponse) SetPrizeList(v *PrizeList) *QueryPromotionActivityResponse {
	s.PrizeList = v
	return s
}

type ExecPromotionCouponRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// open_id
	OpenId *string `json:"open_id,omitempty" xml:"open_id,omitempty" require:"true"`
	// appId
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 活动ID
	ActivityId *string `json:"activity_id,omitempty" xml:"activity_id,omitempty" require:"true"`
	// 奖品ID，需要指定奖品抽奖时传入
	PrizeId *string `json:"prize_id,omitempty" xml:"prize_id,omitempty"`
}

func (s ExecPromotionCouponRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecPromotionCouponRequest) GoString() string {
	return s.String()
}

func (s *ExecPromotionCouponRequest) SetAuthToken(v string) *ExecPromotionCouponRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecPromotionCouponRequest) SetProductInstanceId(v string) *ExecPromotionCouponRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecPromotionCouponRequest) SetBizId(v string) *ExecPromotionCouponRequest {
	s.BizId = &v
	return s
}

func (s *ExecPromotionCouponRequest) SetOpenId(v string) *ExecPromotionCouponRequest {
	s.OpenId = &v
	return s
}

func (s *ExecPromotionCouponRequest) SetAppId(v string) *ExecPromotionCouponRequest {
	s.AppId = &v
	return s
}

func (s *ExecPromotionCouponRequest) SetActivityId(v string) *ExecPromotionCouponRequest {
	s.ActivityId = &v
	return s
}

func (s *ExecPromotionCouponRequest) SetPrizeId(v string) *ExecPromotionCouponRequest {
	s.PrizeId = &v
	return s
}

type ExecPromotionCouponResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 活动ID
	ActivityId *string `json:"activity_id,omitempty" xml:"activity_id,omitempty"`
	// 活动名称
	ActivityName *string `json:"activity_name,omitempty" xml:"activity_name,omitempty"`
	// 活动状态
	ActivityStatus *string `json:"activity_status,omitempty" xml:"activity_status,omitempty"`
	// 子错误码
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 子错误描述
	SubMessage *string `json:"sub_message,omitempty" xml:"sub_message,omitempty"`
}

func (s ExecPromotionCouponResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecPromotionCouponResponse) GoString() string {
	return s.String()
}

func (s *ExecPromotionCouponResponse) SetReqMsgId(v string) *ExecPromotionCouponResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecPromotionCouponResponse) SetResultCode(v string) *ExecPromotionCouponResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecPromotionCouponResponse) SetResultMsg(v string) *ExecPromotionCouponResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecPromotionCouponResponse) SetActivityId(v string) *ExecPromotionCouponResponse {
	s.ActivityId = &v
	return s
}

func (s *ExecPromotionCouponResponse) SetActivityName(v string) *ExecPromotionCouponResponse {
	s.ActivityName = &v
	return s
}

func (s *ExecPromotionCouponResponse) SetActivityStatus(v string) *ExecPromotionCouponResponse {
	s.ActivityStatus = &v
	return s
}

func (s *ExecPromotionCouponResponse) SetSubCode(v string) *ExecPromotionCouponResponse {
	s.SubCode = &v
	return s
}

func (s *ExecPromotionCouponResponse) SetSubMessage(v string) *ExecPromotionCouponResponse {
	s.SubMessage = &v
	return s
}

type QueryPromotionCouponRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 活动ID
	ActivityId *string `json:"activity_id,omitempty" xml:"activity_id,omitempty" require:"true"`
	// openId
	OpenId *string `json:"open_id,omitempty" xml:"open_id,omitempty" require:"true"`
	// appId
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 开始日期
	StartDate *string `json:"start_date,omitempty" xml:"start_date,omitempty" require:"true"`
	// 结束日期
	EndDate *string `json:"end_date,omitempty" xml:"end_date,omitempty" require:"true"`
	// 页码，默认 1，最小值 1
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 每页数量，默认 20，范围 1~100
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s QueryPromotionCouponRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryPromotionCouponRequest) GoString() string {
	return s.String()
}

func (s *QueryPromotionCouponRequest) SetAuthToken(v string) *QueryPromotionCouponRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryPromotionCouponRequest) SetProductInstanceId(v string) *QueryPromotionCouponRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryPromotionCouponRequest) SetActivityId(v string) *QueryPromotionCouponRequest {
	s.ActivityId = &v
	return s
}

func (s *QueryPromotionCouponRequest) SetOpenId(v string) *QueryPromotionCouponRequest {
	s.OpenId = &v
	return s
}

func (s *QueryPromotionCouponRequest) SetAppId(v string) *QueryPromotionCouponRequest {
	s.AppId = &v
	return s
}

func (s *QueryPromotionCouponRequest) SetStartDate(v string) *QueryPromotionCouponRequest {
	s.StartDate = &v
	return s
}

func (s *QueryPromotionCouponRequest) SetEndDate(v string) *QueryPromotionCouponRequest {
	s.EndDate = &v
	return s
}

func (s *QueryPromotionCouponRequest) SetPageNum(v int64) *QueryPromotionCouponRequest {
	s.PageNum = &v
	return s
}

func (s *QueryPromotionCouponRequest) SetPageSize(v int64) *QueryPromotionCouponRequest {
	s.PageSize = &v
	return s
}

type QueryPromotionCouponResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 记录总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 当前页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 每页数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 发券记录列表
	OrderList []*OrderList `json:"order_list,omitempty" xml:"order_list,omitempty" type:"Repeated"`
}

func (s QueryPromotionCouponResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryPromotionCouponResponse) GoString() string {
	return s.String()
}

func (s *QueryPromotionCouponResponse) SetReqMsgId(v string) *QueryPromotionCouponResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryPromotionCouponResponse) SetResultCode(v string) *QueryPromotionCouponResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryPromotionCouponResponse) SetResultMsg(v string) *QueryPromotionCouponResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryPromotionCouponResponse) SetTotalCount(v int64) *QueryPromotionCouponResponse {
	s.TotalCount = &v
	return s
}

func (s *QueryPromotionCouponResponse) SetPageNum(v int64) *QueryPromotionCouponResponse {
	s.PageNum = &v
	return s
}

func (s *QueryPromotionCouponResponse) SetPageSize(v int64) *QueryPromotionCouponResponse {
	s.PageSize = &v
	return s
}

func (s *QueryPromotionCouponResponse) SetOrderList(v []*OrderList) *QueryPromotionCouponResponse {
	s.OrderList = v
	return s
}

type InitTradeAppRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 接入方 外部业务订单号，接入方 内唯一，创建后不可变
	OutTradeNo *string `json:"out_trade_no,omitempty" xml:"out_trade_no,omitempty" require:"true"`
	// 支付金额，单位：元，大于 0，最多两位小数
	TotalAmount *string `json:"total_amount,omitempty" xml:"total_amount,omitempty" require:"true"`
	// 商品或权益卡标题
	Subject *string `json:"subject,omitempty" xml:"subject,omitempty" require:"true"`
	// 用户登记手机号，中国大陆 11 位手机号
	RegisteredMobile *string `json:"registered_mobile,omitempty" xml:"registered_mobile,omitempty"`
	// 用户登录接口返回的用户唯一标识
	OpenId *string `json:"open_id,omitempty" xml:"open_id,omitempty" require:"true"`
	// 权益档位 ID
	TierId *string `json:"tier_id,omitempty" xml:"tier_id,omitempty" require:"true"`
}

func (s InitTradeAppRequest) String() string {
	return tea.Prettify(s)
}

func (s InitTradeAppRequest) GoString() string {
	return s.String()
}

func (s *InitTradeAppRequest) SetAuthToken(v string) *InitTradeAppRequest {
	s.AuthToken = &v
	return s
}

func (s *InitTradeAppRequest) SetProductInstanceId(v string) *InitTradeAppRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitTradeAppRequest) SetOutTradeNo(v string) *InitTradeAppRequest {
	s.OutTradeNo = &v
	return s
}

func (s *InitTradeAppRequest) SetTotalAmount(v string) *InitTradeAppRequest {
	s.TotalAmount = &v
	return s
}

func (s *InitTradeAppRequest) SetSubject(v string) *InitTradeAppRequest {
	s.Subject = &v
	return s
}

func (s *InitTradeAppRequest) SetRegisteredMobile(v string) *InitTradeAppRequest {
	s.RegisteredMobile = &v
	return s
}

func (s *InitTradeAppRequest) SetOpenId(v string) *InitTradeAppRequest {
	s.OpenId = &v
	return s
}

func (s *InitTradeAppRequest) SetTierId(v string) *InitTradeAppRequest {
	s.TierId = &v
	return s
}

type InitTradeAppResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 接入方 外部业务订单号
	OutTradeNo *string `json:"out_trade_no,omitempty" xml:"out_trade_no,omitempty"`
	// 支付宝交易号，供小程序拉起支付
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
}

func (s InitTradeAppResponse) String() string {
	return tea.Prettify(s)
}

func (s InitTradeAppResponse) GoString() string {
	return s.String()
}

func (s *InitTradeAppResponse) SetReqMsgId(v string) *InitTradeAppResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitTradeAppResponse) SetResultCode(v string) *InitTradeAppResponse {
	s.ResultCode = &v
	return s
}

func (s *InitTradeAppResponse) SetResultMsg(v string) *InitTradeAppResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitTradeAppResponse) SetOutTradeNo(v string) *InitTradeAppResponse {
	s.OutTradeNo = &v
	return s
}

func (s *InitTradeAppResponse) SetTradeNo(v string) *InitTradeAppResponse {
	s.TradeNo = &v
	return s
}

type QueryTradeAppRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 创建支付时的外部业务订单号
	OutTradeNo *string `json:"out_trade_no,omitempty" xml:"out_trade_no,omitempty" require:"true"`
}

func (s QueryTradeAppRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTradeAppRequest) GoString() string {
	return s.String()
}

func (s *QueryTradeAppRequest) SetAuthToken(v string) *QueryTradeAppRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTradeAppRequest) SetProductInstanceId(v string) *QueryTradeAppRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTradeAppRequest) SetOutTradeNo(v string) *QueryTradeAppRequest {
	s.OutTradeNo = &v
	return s
}

type QueryTradeAppResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 接入方外部业务订单号
	OutTradeNo *string `json:"out_trade_no,omitempty" xml:"out_trade_no,omitempty"`
	// 支付宝交易号
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
	// 支付状态
	TradeStatus *string `json:"trade_status,omitempty" xml:"trade_status,omitempty"`
	// 订单金额，单位：元
	TotalAmount *string `json:"total_amount,omitempty" xml:"total_amount,omitempty"`
	// 实付金额，单位：元
	ReceiptAmount *string `json:"receipt_amount,omitempty" xml:"receipt_amount,omitempty"`
	// 退款记录
	RefundList []*RefundInfo `json:"refund_list,omitempty" xml:"refund_list,omitempty" type:"Repeated"`
	// 累计退款金额
	TotalRefundAmount *string `json:"total_refund_amount,omitempty" xml:"total_refund_amount,omitempty"`
}

func (s QueryTradeAppResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTradeAppResponse) GoString() string {
	return s.String()
}

func (s *QueryTradeAppResponse) SetReqMsgId(v string) *QueryTradeAppResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTradeAppResponse) SetResultCode(v string) *QueryTradeAppResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTradeAppResponse) SetResultMsg(v string) *QueryTradeAppResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTradeAppResponse) SetOutTradeNo(v string) *QueryTradeAppResponse {
	s.OutTradeNo = &v
	return s
}

func (s *QueryTradeAppResponse) SetTradeNo(v string) *QueryTradeAppResponse {
	s.TradeNo = &v
	return s
}

func (s *QueryTradeAppResponse) SetTradeStatus(v string) *QueryTradeAppResponse {
	s.TradeStatus = &v
	return s
}

func (s *QueryTradeAppResponse) SetTotalAmount(v string) *QueryTradeAppResponse {
	s.TotalAmount = &v
	return s
}

func (s *QueryTradeAppResponse) SetReceiptAmount(v string) *QueryTradeAppResponse {
	s.ReceiptAmount = &v
	return s
}

func (s *QueryTradeAppResponse) SetRefundList(v []*RefundInfo) *QueryTradeAppResponse {
	s.RefundList = v
	return s
}

func (s *QueryTradeAppResponse) SetTotalRefundAmount(v string) *QueryTradeAppResponse {
	s.TotalRefundAmount = &v
	return s
}

type CloseTradeAppRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 接入方 外部业务订单号
	OutTradeNo *string `json:"out_trade_no,omitempty" xml:"out_trade_no,omitempty" require:"true"`
}

func (s CloseTradeAppRequest) String() string {
	return tea.Prettify(s)
}

func (s CloseTradeAppRequest) GoString() string {
	return s.String()
}

func (s *CloseTradeAppRequest) SetAuthToken(v string) *CloseTradeAppRequest {
	s.AuthToken = &v
	return s
}

func (s *CloseTradeAppRequest) SetProductInstanceId(v string) *CloseTradeAppRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CloseTradeAppRequest) SetOutTradeNo(v string) *CloseTradeAppRequest {
	s.OutTradeNo = &v
	return s
}

type CloseTradeAppResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 接入方 外部业务订单号
	OutTradeNo *string `json:"out_trade_no,omitempty" xml:"out_trade_no,omitempty"`
	// 支付宝交易号
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
	// 支付状态
	TradeStatus *string `json:"trade_status,omitempty" xml:"trade_status,omitempty"`
}

func (s CloseTradeAppResponse) String() string {
	return tea.Prettify(s)
}

func (s CloseTradeAppResponse) GoString() string {
	return s.String()
}

func (s *CloseTradeAppResponse) SetReqMsgId(v string) *CloseTradeAppResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CloseTradeAppResponse) SetResultCode(v string) *CloseTradeAppResponse {
	s.ResultCode = &v
	return s
}

func (s *CloseTradeAppResponse) SetResultMsg(v string) *CloseTradeAppResponse {
	s.ResultMsg = &v
	return s
}

func (s *CloseTradeAppResponse) SetOutTradeNo(v string) *CloseTradeAppResponse {
	s.OutTradeNo = &v
	return s
}

func (s *CloseTradeAppResponse) SetTradeNo(v string) *CloseTradeAppResponse {
	s.TradeNo = &v
	return s
}

func (s *CloseTradeAppResponse) SetTradeStatus(v string) *CloseTradeAppResponse {
	s.TradeStatus = &v
	return s
}

type ExecLoginAppRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 支付宝小程序本次取得的一次性授权码
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty" require:"true"`
	// 用户是否已签署隐私协议
	PrivacyAgreementSigned *bool `json:"privacy_agreement_signed,omitempty" xml:"privacy_agreement_signed,omitempty" require:"true"`
}

func (s ExecLoginAppRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecLoginAppRequest) GoString() string {
	return s.String()
}

func (s *ExecLoginAppRequest) SetAuthToken(v string) *ExecLoginAppRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecLoginAppRequest) SetProductInstanceId(v string) *ExecLoginAppRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecLoginAppRequest) SetAuthCode(v string) *ExecLoginAppRequest {
	s.AuthCode = &v
	return s
}

func (s *ExecLoginAppRequest) SetPrivacyAgreementSigned(v bool) *ExecLoginAppRequest {
	s.PrivacyAgreementSigned = &v
	return s
}

type ExecLoginAppResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 由auth_code 换取的用户唯一标识
	OpenId *string `json:"open_id,omitempty" xml:"open_id,omitempty"`
}

func (s ExecLoginAppResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecLoginAppResponse) GoString() string {
	return s.String()
}

func (s *ExecLoginAppResponse) SetReqMsgId(v string) *ExecLoginAppResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecLoginAppResponse) SetResultCode(v string) *ExecLoginAppResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecLoginAppResponse) SetResultMsg(v string) *ExecLoginAppResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecLoginAppResponse) SetOpenId(v string) *ExecLoginAppResponse {
	s.OpenId = &v
	return s
}

type ExecPromotionConsultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户 open_id
	OpenId *string `json:"open_id,omitempty" xml:"open_id,omitempty" require:"true"`
	// 支付宝小程序 App ID
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 支付宝小程序 App ID
	ActivityId *string `json:"activity_id,omitempty" xml:"activity_id,omitempty" require:"true"`
}

func (s ExecPromotionConsultRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecPromotionConsultRequest) GoString() string {
	return s.String()
}

func (s *ExecPromotionConsultRequest) SetAuthToken(v string) *ExecPromotionConsultRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecPromotionConsultRequest) SetProductInstanceId(v string) *ExecPromotionConsultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecPromotionConsultRequest) SetOpenId(v string) *ExecPromotionConsultRequest {
	s.OpenId = &v
	return s
}

func (s *ExecPromotionConsultRequest) SetAppId(v string) *ExecPromotionConsultRequest {
	s.AppId = &v
	return s
}

func (s *ExecPromotionConsultRequest) SetActivityId(v string) *ExecPromotionConsultRequest {
	s.ActivityId = &v
	return s
}

type ExecPromotionConsultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 咨询状态
	ConsultStatus *string `json:"consult_status,omitempty" xml:"consult_status,omitempty"`
}

func (s ExecPromotionConsultResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecPromotionConsultResponse) GoString() string {
	return s.String()
}

func (s *ExecPromotionConsultResponse) SetReqMsgId(v string) *ExecPromotionConsultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecPromotionConsultResponse) SetResultCode(v string) *ExecPromotionConsultResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecPromotionConsultResponse) SetResultMsg(v string) *ExecPromotionConsultResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecPromotionConsultResponse) SetConsultStatus(v string) *ExecPromotionConsultResponse {
	s.ConsultStatus = &v
	return s
}

type QueryBenefitAppRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户open_id
	OpenId *string `json:"open_id,omitempty" xml:"open_id,omitempty" require:"true"`
}

func (s QueryBenefitAppRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBenefitAppRequest) GoString() string {
	return s.String()
}

func (s *QueryBenefitAppRequest) SetAuthToken(v string) *QueryBenefitAppRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBenefitAppRequest) SetProductInstanceId(v string) *QueryBenefitAppRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBenefitAppRequest) SetOpenId(v string) *QueryBenefitAppRequest {
	s.OpenId = &v
	return s
}

type QueryBenefitAppResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 平台配置的档位稳定 ID，例如TIER_17
	TierId *string `json:"tier_id,omitempty" xml:"tier_id,omitempty"`
	// 档位名称，例如中级会员17元
	TierName *string `json:"tier_name,omitempty" xml:"tier_name,omitempty"`
}

func (s QueryBenefitAppResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBenefitAppResponse) GoString() string {
	return s.String()
}

func (s *QueryBenefitAppResponse) SetReqMsgId(v string) *QueryBenefitAppResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBenefitAppResponse) SetResultCode(v string) *QueryBenefitAppResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBenefitAppResponse) SetResultMsg(v string) *QueryBenefitAppResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBenefitAppResponse) SetTierId(v string) *QueryBenefitAppResponse {
	s.TierId = &v
	return s
}

func (s *QueryBenefitAppResponse) SetTierName(v string) *QueryBenefitAppResponse {
	s.TierName = &v
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

// Description:
//
// # Init client with Config
//
// @param config - config contains the necessary information to create a client
func NewClient(config *Config) (*Client, error) {
	client := new(Client)
	err := client.Init(config)
	return client, err
}

func (client *Client) Init(config *Config) (_err error) {
	if tea.BoolValue(util.IsUnset(config)) {
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

// Description:
//
// # Encapsulate the request and invoke the network
//
// @param action - api name
//
// @param protocol - http or https
//
// @param method - e.g. GET
//
// @param pathname - pathname of every api
//
// @param request - which contains request params
//
// @param runtime - which controls some details of call api, such as retry times
//
// @return the response
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
				"sdk_version":      tea.String("1.4.1"),
				"_prod_code":       tea.String("AGORAX"),
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

// Description:
//
// Description: 查询活动及关联奖品详情信息
//
// Summary: 查询活动及关联奖品详情信息
func (client *Client) QueryBaasPromotionActivity(request *QueryBaasPromotionActivityRequest) (_result *QueryBaasPromotionActivityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBaasPromotionActivityResponse{}
	_body, _err := client.QueryBaasPromotionActivityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询活动及关联奖品详情信息
//
// Summary: 查询活动及关联奖品详情信息
func (client *Client) QueryBaasPromotionActivityEx(request *QueryBaasPromotionActivityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBaasPromotionActivityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPromotionActivityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.promotion.activity.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 为指定用户发放优惠券
//
// Summary: 为指定用户发放优惠券
func (client *Client) ExecBaasPromotionCoupon(request *ExecBaasPromotionCouponRequest) (_result *ExecBaasPromotionCouponResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecBaasPromotionCouponResponse{}
	_body, _err := client.ExecBaasPromotionCouponEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 为指定用户发放优惠券
//
// Summary: 为指定用户发放优惠券
func (client *Client) ExecBaasPromotionCouponEx(request *ExecBaasPromotionCouponRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecBaasPromotionCouponResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecBaasPromotionCouponResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.promotion.coupon.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 分页查询发券记录
//
// Summary: 分页查询发券记录
func (client *Client) QueryBaasPromotionCoupon(request *QueryBaasPromotionCouponRequest) (_result *QueryBaasPromotionCouponResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBaasPromotionCouponResponse{}
	_body, _err := client.QueryBaasPromotionCouponEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 分页查询发券记录
//
// Summary: 分页查询发券记录
func (client *Client) QueryBaasPromotionCouponEx(request *QueryBaasPromotionCouponRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBaasPromotionCouponResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPromotionCouponResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.promotion.coupon.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询活动及关联奖品详情信息
//
// Summary: 查询活动及关联奖品详情信息
func (client *Client) QueryPromotionActivity(request *QueryPromotionActivityRequest) (_result *QueryPromotionActivityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryPromotionActivityResponse{}
	_body, _err := client.QueryPromotionActivityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询活动及关联奖品详情信息
//
// Summary: 查询活动及关联奖品详情信息
func (client *Client) QueryPromotionActivityEx(request *QueryPromotionActivityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryPromotionActivityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryPromotionActivityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.agorax.promotion.activity.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 为指定用户发放优惠券
//
// Summary: 为指定用户发放优惠券
func (client *Client) ExecPromotionCoupon(request *ExecPromotionCouponRequest) (_result *ExecPromotionCouponResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecPromotionCouponResponse{}
	_body, _err := client.ExecPromotionCouponEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 为指定用户发放优惠券
//
// Summary: 为指定用户发放优惠券
func (client *Client) ExecPromotionCouponEx(request *ExecPromotionCouponRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecPromotionCouponResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecPromotionCouponResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.agorax.promotion.coupon.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 分页查询发券记录
//
// Summary: 分页查询发券记录
func (client *Client) QueryPromotionCoupon(request *QueryPromotionCouponRequest) (_result *QueryPromotionCouponResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryPromotionCouponResponse{}
	_body, _err := client.QueryPromotionCouponEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 分页查询发券记录
//
// Summary: 分页查询发券记录
func (client *Client) QueryPromotionCouponEx(request *QueryPromotionCouponRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryPromotionCouponResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryPromotionCouponResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.agorax.promotion.coupon.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 小程序创建支付订单
//
// Summary: 小程序创建支付订单
func (client *Client) InitTradeApp(request *InitTradeAppRequest) (_result *InitTradeAppResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitTradeAppResponse{}
	_body, _err := client.InitTradeAppEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 小程序创建支付订单
//
// Summary: 小程序创建支付订单
func (client *Client) InitTradeAppEx(request *InitTradeAppRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitTradeAppResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitTradeAppResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.agorax.trade.app.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 小程序交易查询
//
// Summary: 小程序交易查询
func (client *Client) QueryTradeApp(request *QueryTradeAppRequest) (_result *QueryTradeAppResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTradeAppResponse{}
	_body, _err := client.QueryTradeAppEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 小程序交易查询
//
// Summary: 小程序交易查询
func (client *Client) QueryTradeAppEx(request *QueryTradeAppRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTradeAppResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTradeAppResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.agorax.trade.app.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 关闭尚未支付的交易
//
// Summary: 关闭尚未支付的交易
func (client *Client) CloseTradeApp(request *CloseTradeAppRequest) (_result *CloseTradeAppResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CloseTradeAppResponse{}
	_body, _err := client.CloseTradeAppEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 关闭尚未支付的交易
//
// Summary: 关闭尚未支付的交易
func (client *Client) CloseTradeAppEx(request *CloseTradeAppRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CloseTradeAppResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CloseTradeAppResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.agorax.trade.app.close"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 小程序用户登录
//
// Summary: 小程序用户登录
func (client *Client) ExecLoginApp(request *ExecLoginAppRequest) (_result *ExecLoginAppResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecLoginAppResponse{}
	_body, _err := client.ExecLoginAppEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 小程序用户登录
//
// Summary: 小程序用户登录
func (client *Client) ExecLoginAppEx(request *ExecLoginAppRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecLoginAppResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecLoginAppResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.agorax.login.app.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 发券前咨询用户是否可以领券
//
// Summary: 发券前咨询用户是否可以领券
func (client *Client) ExecPromotionConsult(request *ExecPromotionConsultRequest) (_result *ExecPromotionConsultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecPromotionConsultResponse{}
	_body, _err := client.ExecPromotionConsultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 发券前咨询用户是否可以领券
//
// Summary: 发券前咨询用户是否可以领券
func (client *Client) ExecPromotionConsultEx(request *ExecPromotionConsultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecPromotionConsultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecPromotionConsultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.agorax.promotion.consult.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询用户权益档位
//
// Summary: 查询用户权益档位
func (client *Client) QueryBenefitApp(request *QueryBenefitAppRequest) (_result *QueryBenefitAppResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBenefitAppResponse{}
	_body, _err := client.QueryBenefitAppEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询用户权益档位
//
// Summary: 查询用户权益档位
func (client *Client) QueryBenefitAppEx(request *QueryBenefitAppRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBenefitAppResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBenefitAppResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.agorax.benefit.app.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
