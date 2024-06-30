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

// 数据实时检索搜索Request
type DataSearchRequest struct {
	// 所有请求字符串，支持使用 and, or 逻辑连接词和括号
	Query *string `json:"query,omitempty" xml:"query,omitempty" require:"true"`
	// 分页，返回数据结果起始位置
	Offset *int64 `json:"offset,omitempty" xml:"offset,omitempty"`
	// 请求的结果数量，默认值 10
	Size *int64 `json:"size,omitempty" xml:"size,omitempty"`
	// 是否按时间降序排列
	Reverse *bool `json:"reverse,omitempty" xml:"reverse,omitempty"`
	// 检索数据的截止时间范围，Unix时间戳（秒）
	To *int64 `json:"to,omitempty" xml:"to,omitempty"`
	// 检索结果的总条数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s DataSearchRequest) String() string {
	return tea.Prettify(s)
}

func (s DataSearchRequest) GoString() string {
	return s.String()
}

func (s *DataSearchRequest) SetQuery(v string) *DataSearchRequest {
	s.Query = &v
	return s
}

func (s *DataSearchRequest) SetOffset(v int64) *DataSearchRequest {
	s.Offset = &v
	return s
}

func (s *DataSearchRequest) SetSize(v int64) *DataSearchRequest {
	s.Size = &v
	return s
}

func (s *DataSearchRequest) SetReverse(v bool) *DataSearchRequest {
	s.Reverse = &v
	return s
}

func (s *DataSearchRequest) SetTo(v int64) *DataSearchRequest {
	s.To = &v
	return s
}

func (s *DataSearchRequest) SetTotal(v int64) *DataSearchRequest {
	s.Total = &v
	return s
}

// 业务数据检索的结果数据
type DataSearchResultResponseLog struct {
	// 数据关联的合约Meta信息
	MetaId *string `json:"meta_id,omitempty" xml:"meta_id,omitempty" require:"true"`
	// 交易调用的函数名称
	Function *string `json:"function,omitempty" xml:"function,omitempty"`
	// 交易产生的事件名称
	Topic *string `json:"topic,omitempty" xml:"topic,omitempty"`
	// 交易所在的区块高度
	BlockNum *int64 `json:"block_num,omitempty" xml:"block_num,omitempty" require:"true"`
	// 交易ID
	TxId *string `json:"tx_id,omitempty" xml:"tx_id,omitempty" require:"true"`
	// Json 序列化的交易请求参数
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 交易中合约输出的日志内容
	Log *string `json:"log,omitempty" xml:"log,omitempty"`
	// 索引数据枚举类型， interface, event, deposit ；分别对应合约调用、合约事件、原生存证
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 交易上链时间戳，单位毫秒
	TxTimestamp *int64 `json:"tx_timestamp,omitempty" xml:"tx_timestamp,omitempty" require:"true"`
}

func (s DataSearchResultResponseLog) String() string {
	return tea.Prettify(s)
}

func (s DataSearchResultResponseLog) GoString() string {
	return s.String()
}

func (s *DataSearchResultResponseLog) SetMetaId(v string) *DataSearchResultResponseLog {
	s.MetaId = &v
	return s
}

func (s *DataSearchResultResponseLog) SetFunction(v string) *DataSearchResultResponseLog {
	s.Function = &v
	return s
}

func (s *DataSearchResultResponseLog) SetTopic(v string) *DataSearchResultResponseLog {
	s.Topic = &v
	return s
}

func (s *DataSearchResultResponseLog) SetBlockNum(v int64) *DataSearchResultResponseLog {
	s.BlockNum = &v
	return s
}

func (s *DataSearchResultResponseLog) SetTxId(v string) *DataSearchResultResponseLog {
	s.TxId = &v
	return s
}

func (s *DataSearchResultResponseLog) SetData(v string) *DataSearchResultResponseLog {
	s.Data = &v
	return s
}

func (s *DataSearchResultResponseLog) SetLog(v string) *DataSearchResultResponseLog {
	s.Log = &v
	return s
}

func (s *DataSearchResultResponseLog) SetType(v string) *DataSearchResultResponseLog {
	s.Type = &v
	return s
}

func (s *DataSearchResultResponseLog) SetTxTimestamp(v int64) *DataSearchResultResponseLog {
	s.TxTimestamp = &v
	return s
}

// 合约Meta
type ContractMeta struct {
	// MetaID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 合约Meta创建时间
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 合约Meta更新时间
	UpdateTime *int64 `json:"update_time,omitempty" xml:"update_time,omitempty"`
	// 合约名称
	ContractName *string `json:"contract_name,omitempty" xml:"contract_name,omitempty" require:"true"`
	// 合约名称对应的Hex编码合约地址
	ContractAddr *string `json:"contract_addr,omitempty" xml:"contract_addr,omitempty" require:"true"`
	// 合约版本号，用于助记
	ContractVersion *string `json:"contract_version,omitempty" xml:"contract_version,omitempty" require:"true"`
	// 合约Meta的类型，枚举类型；
	MetaType *string `json:"meta_type,omitempty" xml:"meta_type,omitempty" require:"true"`
	// 合约Meta生效块高，留空表示从上一个已定义的区间结束开始生效； 否则表示具体的起始生效块高
	StartBlock *int64 `json:"start_block,omitempty" xml:"start_block,omitempty"`
	// 合约Meta生效的截止块高，留空表示自动探测到下一个已定于的区间为止， 0 表示持续生效
	EndBlock *int64 `json:"end_block,omitempty" xml:"end_block,omitempty"`
	// 合约是否对外该链其它租户开放； 0 表示否， 1表示开放
	PublicFlag *int64 `json:"public_flag,omitempty" xml:"public_flag,omitempty"`
	// 合约Meta对应类型的数据
	MetaContent *string `json:"meta_content,omitempty" xml:"meta_content,omitempty" require:"true"`
}

func (s ContractMeta) String() string {
	return tea.Prettify(s)
}

func (s ContractMeta) GoString() string {
	return s.String()
}

func (s *ContractMeta) SetId(v int64) *ContractMeta {
	s.Id = &v
	return s
}

func (s *ContractMeta) SetCreateTime(v int64) *ContractMeta {
	s.CreateTime = &v
	return s
}

func (s *ContractMeta) SetUpdateTime(v int64) *ContractMeta {
	s.UpdateTime = &v
	return s
}

func (s *ContractMeta) SetContractName(v string) *ContractMeta {
	s.ContractName = &v
	return s
}

func (s *ContractMeta) SetContractAddr(v string) *ContractMeta {
	s.ContractAddr = &v
	return s
}

func (s *ContractMeta) SetContractVersion(v string) *ContractMeta {
	s.ContractVersion = &v
	return s
}

func (s *ContractMeta) SetMetaType(v string) *ContractMeta {
	s.MetaType = &v
	return s
}

func (s *ContractMeta) SetStartBlock(v int64) *ContractMeta {
	s.StartBlock = &v
	return s
}

func (s *ContractMeta) SetEndBlock(v int64) *ContractMeta {
	s.EndBlock = &v
	return s
}

func (s *ContractMeta) SetPublicFlag(v int64) *ContractMeta {
	s.PublicFlag = &v
	return s
}

func (s *ContractMeta) SetMetaContent(v string) *ContractMeta {
	s.MetaContent = &v
	return s
}

// 导出任务
type Trigger struct {
	// 导出任务唯一ID
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 导出目标
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 导出的事件类型
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
	// 创建时间戳
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 最近的错误描述信息
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// 任务的状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 导出任务的待处理错误日志数量
	PendingErrorLogs *int64 `json:"pending_error_logs,omitempty" xml:"pending_error_logs,omitempty"`
	// 检查点信息
	Checkpoint *TriggerCheckpoint `json:"checkpoint,omitempty" xml:"checkpoint,omitempty"`
	// 导出任务配置
	Options []*MapEntry `json:"options,omitempty" xml:"options,omitempty" require:"true" type:"Repeated"`
}

func (s Trigger) String() string {
	return tea.Prettify(s)
}

func (s Trigger) GoString() string {
	return s.String()
}

func (s *Trigger) SetName(v string) *Trigger {
	s.Name = &v
	return s
}

func (s *Trigger) SetType(v string) *Trigger {
	s.Type = &v
	return s
}

func (s *Trigger) SetSource(v string) *Trigger {
	s.Source = &v
	return s
}

func (s *Trigger) SetCreateTime(v int64) *Trigger {
	s.CreateTime = &v
	return s
}

func (s *Trigger) SetErrorMessage(v string) *Trigger {
	s.ErrorMessage = &v
	return s
}

func (s *Trigger) SetStatus(v string) *Trigger {
	s.Status = &v
	return s
}

func (s *Trigger) SetPendingErrorLogs(v int64) *Trigger {
	s.PendingErrorLogs = &v
	return s
}

func (s *Trigger) SetCheckpoint(v *TriggerCheckpoint) *Trigger {
	s.Checkpoint = v
	return s
}

func (s *Trigger) SetOptions(v []*MapEntry) *Trigger {
	s.Options = v
	return s
}

// 导出任务检查点信息
type TriggerCheckpoint struct {
	// 当前处理的高度
	Height *int64 `json:"height,omitempty" xml:"height,omitempty"`
	// 检查点偏移量
	Index *int64 `json:"index,omitempty" xml:"index,omitempty"`
	// 检查点的类型
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 最近的错误信息
	LastError *string `json:"last_error,omitempty" xml:"last_error,omitempty"`
	// 错误计数
	ErrorCount *int64 `json:"error_count,omitempty" xml:"error_count,omitempty"`
	// 推送的事件数量
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s TriggerCheckpoint) String() string {
	return tea.Prettify(s)
}

func (s TriggerCheckpoint) GoString() string {
	return s.String()
}

func (s *TriggerCheckpoint) SetHeight(v int64) *TriggerCheckpoint {
	s.Height = &v
	return s
}

func (s *TriggerCheckpoint) SetIndex(v int64) *TriggerCheckpoint {
	s.Index = &v
	return s
}

func (s *TriggerCheckpoint) SetType(v string) *TriggerCheckpoint {
	s.Type = &v
	return s
}

func (s *TriggerCheckpoint) SetLastError(v string) *TriggerCheckpoint {
	s.LastError = &v
	return s
}

func (s *TriggerCheckpoint) SetErrorCount(v int64) *TriggerCheckpoint {
	s.ErrorCount = &v
	return s
}

func (s *TriggerCheckpoint) SetTotalCount(v int64) *TriggerCheckpoint {
	s.TotalCount = &v
	return s
}

// 导出任务的日志
type TriggerLog struct {
	// 日志的唯一ID
	Uuid *string `json:"uuid,omitempty" xml:"uuid,omitempty" require:"true"`
	// 日志的发生时间
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 日志的最近修改时间
	ModifyTime *int64 `json:"modify_time,omitempty" xml:"modify_time,omitempty"`
	// 日志发生的位置
	Position *TriggerCheckpoint `json:"position,omitempty" xml:"position,omitempty" require:"true"`
	// 日志状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s TriggerLog) String() string {
	return tea.Prettify(s)
}

func (s TriggerLog) GoString() string {
	return s.String()
}

func (s *TriggerLog) SetUuid(v string) *TriggerLog {
	s.Uuid = &v
	return s
}

func (s *TriggerLog) SetCreateTime(v int64) *TriggerLog {
	s.CreateTime = &v
	return s
}

func (s *TriggerLog) SetModifyTime(v int64) *TriggerLog {
	s.ModifyTime = &v
	return s
}

func (s *TriggerLog) SetPosition(v *TriggerCheckpoint) *TriggerLog {
	s.Position = v
	return s
}

func (s *TriggerLog) SetStatus(v string) *TriggerLog {
	s.Status = &v
	return s
}

// MapKV
type MapEntry struct {
	// Key
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// value
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
	// 声明 value 的类型，包括 String / Double / Long / Bool / JSONObject / JSONArray
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s MapEntry) String() string {
	return tea.Prettify(s)
}

func (s MapEntry) GoString() string {
	return s.String()
}

func (s *MapEntry) SetKey(v string) *MapEntry {
	s.Key = &v
	return s
}

func (s *MapEntry) SetValue(v string) *MapEntry {
	s.Value = &v
	return s
}

func (s *MapEntry) SetType(v string) *MapEntry {
	s.Type = &v
	return s
}

// 数据导出映射关系
type DataExportTableField struct {
	// 列名称
	ColumnName *string `json:"column_name,omitempty" xml:"column_name,omitempty"`
	// 事件中字段提取的 jq 表达式
	Field *string `json:"field,omitempty" xml:"field,omitempty"`
	// 列类型
	ColumnType *string `json:"column_type,omitempty" xml:"column_type,omitempty"`
	// 列大小
	ColumnSize *int64 `json:"column_size,omitempty" xml:"column_size,omitempty"`
	// 列描述
	ColumnDescription *string `json:"column_description,omitempty" xml:"column_description,omitempty"`
}

func (s DataExportTableField) String() string {
	return tea.Prettify(s)
}

func (s DataExportTableField) GoString() string {
	return s.String()
}

func (s *DataExportTableField) SetColumnName(v string) *DataExportTableField {
	s.ColumnName = &v
	return s
}

func (s *DataExportTableField) SetField(v string) *DataExportTableField {
	s.Field = &v
	return s
}

func (s *DataExportTableField) SetColumnType(v string) *DataExportTableField {
	s.ColumnType = &v
	return s
}

func (s *DataExportTableField) SetColumnSize(v int64) *DataExportTableField {
	s.ColumnSize = &v
	return s
}

func (s *DataExportTableField) SetColumnDescription(v string) *DataExportTableField {
	s.ColumnDescription = &v
	return s
}

// 服务状态
type ServiceStatus struct {
	// 服务名称
	Service *string `json:"service,omitempty" xml:"service,omitempty" require:"true"`
	// 服务的开通与关闭状态
	State *string `json:"state,omitempty" xml:"state,omitempty" require:"true"`
}

func (s ServiceStatus) String() string {
	return tea.Prettify(s)
}

func (s ServiceStatus) GoString() string {
	return s.String()
}

func (s *ServiceStatus) SetService(v string) *ServiceStatus {
	s.Service = &v
	return s
}

func (s *ServiceStatus) SetState(v string) *ServiceStatus {
	s.State = &v
	return s
}

// 地址标签信息
type ChainInsightAddressLabel struct {
	// 链上账户或者合约地址
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 账户或者合约的真实名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 用户定义的地址描述信息
	Comments *string `json:"comments,omitempty" xml:"comments,omitempty"`
	// 合约/账户地址的标签信息
	Labels []*MapEntry `json:"labels,omitempty" xml:"labels,omitempty" type:"Repeated"`
}

func (s ChainInsightAddressLabel) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightAddressLabel) GoString() string {
	return s.String()
}

func (s *ChainInsightAddressLabel) SetAddress(v string) *ChainInsightAddressLabel {
	s.Address = &v
	return s
}

func (s *ChainInsightAddressLabel) SetName(v string) *ChainInsightAddressLabel {
	s.Name = &v
	return s
}

func (s *ChainInsightAddressLabel) SetComments(v string) *ChainInsightAddressLabel {
	s.Comments = &v
	return s
}

func (s *ChainInsightAddressLabel) SetLabels(v []*MapEntry) *ChainInsightAddressLabel {
	s.Labels = v
	return s
}

// 数据洞察搜索请求
type ChainInsightSearchRequest struct {
	// 插叙偏移量，用于分页；= (pageNo - 1 * pageSize); 最大值 500
	Offset *int64 `json:"offset,omitempty" xml:"offset,omitempty" require:"true"`
	// 搜索的上下文，在查询下一页时，需要在请求中带入 Response 返回的 context
	Context *string `json:"context,omitempty" xml:"context,omitempty"`
	// 页大小
	PagSize *int64 `json:"pag_size,omitempty" xml:"pag_size,omitempty" require:"true"`
	// 需要搜索的请求内容，可以使用 and、or、not、括号 组合查询逻辑
	Query *string `json:"query,omitempty" xml:"query,omitempty" require:"true"`
	// 查询某个合约或者存证账户的时间轴返回结果
	TimelineQuery *string `json:"timeline_query,omitempty" xml:"timeline_query,omitempty"`
	// 查询范围的开始时间戳，毫秒
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true"`
	// 查询范围的终止时间戳，单位毫秒
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true"`
	// 搜索的类型范围，枚举：Chain、ChainData、ChainAddress、ChainBlock、ChainTx、ChainTxTimeline、DigitalAsset
	EnabledTypes []*string `json:"enabled_types,omitempty" xml:"enabled_types,omitempty" type:"Repeated"`
}

func (s ChainInsightSearchRequest) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightSearchRequest) GoString() string {
	return s.String()
}

func (s *ChainInsightSearchRequest) SetOffset(v int64) *ChainInsightSearchRequest {
	s.Offset = &v
	return s
}

func (s *ChainInsightSearchRequest) SetContext(v string) *ChainInsightSearchRequest {
	s.Context = &v
	return s
}

func (s *ChainInsightSearchRequest) SetPagSize(v int64) *ChainInsightSearchRequest {
	s.PagSize = &v
	return s
}

func (s *ChainInsightSearchRequest) SetQuery(v string) *ChainInsightSearchRequest {
	s.Query = &v
	return s
}

func (s *ChainInsightSearchRequest) SetTimelineQuery(v string) *ChainInsightSearchRequest {
	s.TimelineQuery = &v
	return s
}

func (s *ChainInsightSearchRequest) SetStartTime(v int64) *ChainInsightSearchRequest {
	s.StartTime = &v
	return s
}

func (s *ChainInsightSearchRequest) SetEndTime(v int64) *ChainInsightSearchRequest {
	s.EndTime = &v
	return s
}

func (s *ChainInsightSearchRequest) SetEnabledTypes(v []*string) *ChainInsightSearchRequest {
	s.EnabledTypes = v
	return s
}

// 数据洞察搜索返回结果
type ChainInsightSearchResponse struct {
	// 搜索命中的结果总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty" require:"true"`
	// 搜索总共消耗了多长时间，时间单位毫秒
	Took *int64 `json:"took,omitempty" xml:"took,omitempty" require:"true"`
	// 当前搜索的 context；翻页时请求中的 context 需要配置为该值
	Context *string `json:"context,omitempty" xml:"context,omitempty" require:"true"`
	// 搜索结果
	Items []*ChainInsightSearchResultItem `json:"items,omitempty" xml:"items,omitempty" require:"true" type:"Repeated"`
}

func (s ChainInsightSearchResponse) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightSearchResponse) GoString() string {
	return s.String()
}

func (s *ChainInsightSearchResponse) SetTotal(v int64) *ChainInsightSearchResponse {
	s.Total = &v
	return s
}

func (s *ChainInsightSearchResponse) SetTook(v int64) *ChainInsightSearchResponse {
	s.Took = &v
	return s
}

func (s *ChainInsightSearchResponse) SetContext(v string) *ChainInsightSearchResponse {
	s.Context = &v
	return s
}

func (s *ChainInsightSearchResponse) SetItems(v []*ChainInsightSearchResultItem) *ChainInsightSearchResponse {
	s.Items = v
	return s
}

// 数据洞察搜索结果的Item
type ChainInsightSearchResultItem struct {
	// 结果类型，枚举：Chain、ChainData、ChainAddress、ChainBlock、ChainTx、ChainTxTimeline
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 结果所在的链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 结果链ID对应的区块链名称
	BizName *string `json:"biz_name,omitempty" xml:"biz_name,omitempty"`
	// 结果与搜索请求的相关性程度，(0, 10000000]
	Score *int64 `json:"score,omitempty" xml:"score,omitempty" require:"true"`
	// 搜索结果值
	Values []*MapEntry `json:"values,omitempty" xml:"values,omitempty" require:"true" type:"Repeated"`
}

func (s ChainInsightSearchResultItem) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightSearchResultItem) GoString() string {
	return s.String()
}

func (s *ChainInsightSearchResultItem) SetType(v string) *ChainInsightSearchResultItem {
	s.Type = &v
	return s
}

func (s *ChainInsightSearchResultItem) SetBizId(v string) *ChainInsightSearchResultItem {
	s.BizId = &v
	return s
}

func (s *ChainInsightSearchResultItem) SetBizName(v string) *ChainInsightSearchResultItem {
	s.BizName = &v
	return s
}

func (s *ChainInsightSearchResultItem) SetScore(v int64) *ChainInsightSearchResultItem {
	s.Score = &v
	return s
}

func (s *ChainInsightSearchResultItem) SetValues(v []*MapEntry) *ChainInsightSearchResultItem {
	s.Values = v
	return s
}

// 数据洞察链上地址信息
type ChainInsightAddress struct {
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 链名称
	BizIdName *string `json:"biz_id_name,omitempty" xml:"biz_id_name,omitempty"`
	// 账户或合约地址
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true"`
	// 创建者租户ID
	CreatorOrganization *string `json:"creator_organization,omitempty" xml:"creator_organization,omitempty"`
	// 创建者地址
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty" require:"true"`
	// 创建时间
	CraeteTime *int64 `json:"craete_time,omitempty" xml:"craete_time,omitempty" require:"true"`
	// 创建交易ID
	CreateTxId *string `json:"create_tx_id,omitempty" xml:"create_tx_id,omitempty" require:"true"`
	// 修改时间戳
	ModifyTime *int64 `json:"modify_time,omitempty" xml:"modify_time,omitempty" require:"true"`
	// 最近修改账户的交易ID
	ModifyTxId *string `json:"modify_tx_id,omitempty" xml:"modify_tx_id,omitempty" require:"true"`
	// 地址类型，枚举：Account，Contract
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 地址状态，枚举：NORMAL，FREEZE，RECOVERING，UNKNOWN
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 地址余额
	Balance *int64 `json:"balance,omitempty" xml:"balance,omitempty" require:"true"`
	// 认证Map
	AuthMap []*MapEntry `json:"auth_map,omitempty" xml:"auth_map,omitempty" require:"true" type:"Repeated"`
	// 地址恢复公钥
	RecoverKey *string `json:"recover_key,omitempty" xml:"recover_key,omitempty" require:"true"`
	// 合约类型，仅当地址为合约时返回：WASM、SOLIDITY
	ContractType *string `json:"contract_type,omitempty" xml:"contract_type,omitempty"`
	// 资产合约相关信息
	AssetContractInfo *ChainInsightAssetContractInfo `json:"asset_contract_info,omitempty" xml:"asset_contract_info,omitempty"`
	// 创建时间
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty" require:"true"`
}

func (s ChainInsightAddress) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightAddress) GoString() string {
	return s.String()
}

func (s *ChainInsightAddress) SetBizId(v string) *ChainInsightAddress {
	s.BizId = &v
	return s
}

func (s *ChainInsightAddress) SetBizIdName(v string) *ChainInsightAddress {
	s.BizIdName = &v
	return s
}

func (s *ChainInsightAddress) SetAddress(v string) *ChainInsightAddress {
	s.Address = &v
	return s
}

func (s *ChainInsightAddress) SetCreatorOrganization(v string) *ChainInsightAddress {
	s.CreatorOrganization = &v
	return s
}

func (s *ChainInsightAddress) SetCreator(v string) *ChainInsightAddress {
	s.Creator = &v
	return s
}

func (s *ChainInsightAddress) SetCraeteTime(v int64) *ChainInsightAddress {
	s.CraeteTime = &v
	return s
}

func (s *ChainInsightAddress) SetCreateTxId(v string) *ChainInsightAddress {
	s.CreateTxId = &v
	return s
}

func (s *ChainInsightAddress) SetModifyTime(v int64) *ChainInsightAddress {
	s.ModifyTime = &v
	return s
}

func (s *ChainInsightAddress) SetModifyTxId(v string) *ChainInsightAddress {
	s.ModifyTxId = &v
	return s
}

func (s *ChainInsightAddress) SetType(v string) *ChainInsightAddress {
	s.Type = &v
	return s
}

func (s *ChainInsightAddress) SetStatus(v string) *ChainInsightAddress {
	s.Status = &v
	return s
}

func (s *ChainInsightAddress) SetBalance(v int64) *ChainInsightAddress {
	s.Balance = &v
	return s
}

func (s *ChainInsightAddress) SetAuthMap(v []*MapEntry) *ChainInsightAddress {
	s.AuthMap = v
	return s
}

func (s *ChainInsightAddress) SetRecoverKey(v string) *ChainInsightAddress {
	s.RecoverKey = &v
	return s
}

func (s *ChainInsightAddress) SetContractType(v string) *ChainInsightAddress {
	s.ContractType = &v
	return s
}

func (s *ChainInsightAddress) SetAssetContractInfo(v *ChainInsightAssetContractInfo) *ChainInsightAddress {
	s.AssetContractInfo = v
	return s
}

func (s *ChainInsightAddress) SetCreateTime(v int64) *ChainInsightAddress {
	s.CreateTime = &v
	return s
}

// 链上交易中的事件
type ChainInsightEvent struct {
	// 事件的 topics 列表
	Topics []*string `json:"topics,omitempty" xml:"topics,omitempty" require:"true" type:"Repeated"`
	// 解析后的交易 topics 列表
	TopicsDecoded []*string `json:"topics_decoded,omitempty" xml:"topics_decoded,omitempty" type:"Repeated"`
	// 事件的内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 解析后的事件内容
	ContentDecoded *string `json:"content_decoded,omitempty" xml:"content_decoded,omitempty"`
}

func (s ChainInsightEvent) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightEvent) GoString() string {
	return s.String()
}

func (s *ChainInsightEvent) SetTopics(v []*string) *ChainInsightEvent {
	s.Topics = v
	return s
}

func (s *ChainInsightEvent) SetTopicsDecoded(v []*string) *ChainInsightEvent {
	s.TopicsDecoded = v
	return s
}

func (s *ChainInsightEvent) SetContent(v string) *ChainInsightEvent {
	s.Content = &v
	return s
}

func (s *ChainInsightEvent) SetContentDecoded(v string) *ChainInsightEvent {
	s.ContentDecoded = &v
	return s
}

// 链上交易
type ChainInsightTransaction struct {
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 链名称
	BizIdName *string `json:"biz_id_name,omitempty" xml:"biz_id_name,omitempty"`
	// 交易ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 交易类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 交易状态，VALID 表示合法，其它为错误码
	State *string `json:"state,omitempty" xml:"state,omitempty" require:"true"`
	// 交易发起者地址
	From *string `json:"from,omitempty" xml:"from,omitempty" require:"true"`
	// 交易目标地址
	To *string `json:"to,omitempty" xml:"to,omitempty" require:"true"`
	// 交易原始输入，hex编码
	Input *string `json:"input,omitempty" xml:"input,omitempty" require:"true"`
	// 交易调用的函数名
	Function *string `json:"function,omitempty" xml:"function,omitempty"`
	// 交易输入解析后的 json string
	InputDecoded *string `json:"input_decoded,omitempty" xml:"input_decoded,omitempty"`
	// 交易的返回值
	Output *string `json:"output,omitempty" xml:"output,omitempty"`
	// 交易返回值解析后的 json string
	OutputDecoded *string `json:"output_decoded,omitempty" xml:"output_decoded,omitempty"`
	// 交易所在区块高度
	BlockNum *int64 `json:"block_num,omitempty" xml:"block_num,omitempty" require:"true"`
	// 交易所在区块中的 index
	TxIndex *int64 `json:"tx_index,omitempty" xml:"tx_index,omitempty" require:"true"`
	// 原始交易的 json string
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 交易中的事件
	Events []*ChainInsightEvent `json:"events,omitempty" xml:"events,omitempty" type:"Repeated"`
	// 交易时间戳（单位：毫秒）
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty" require:"true"`
}

func (s ChainInsightTransaction) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightTransaction) GoString() string {
	return s.String()
}

func (s *ChainInsightTransaction) SetBizId(v string) *ChainInsightTransaction {
	s.BizId = &v
	return s
}

func (s *ChainInsightTransaction) SetBizIdName(v string) *ChainInsightTransaction {
	s.BizIdName = &v
	return s
}

func (s *ChainInsightTransaction) SetId(v string) *ChainInsightTransaction {
	s.Id = &v
	return s
}

func (s *ChainInsightTransaction) SetType(v string) *ChainInsightTransaction {
	s.Type = &v
	return s
}

func (s *ChainInsightTransaction) SetState(v string) *ChainInsightTransaction {
	s.State = &v
	return s
}

func (s *ChainInsightTransaction) SetFrom(v string) *ChainInsightTransaction {
	s.From = &v
	return s
}

func (s *ChainInsightTransaction) SetTo(v string) *ChainInsightTransaction {
	s.To = &v
	return s
}

func (s *ChainInsightTransaction) SetInput(v string) *ChainInsightTransaction {
	s.Input = &v
	return s
}

func (s *ChainInsightTransaction) SetFunction(v string) *ChainInsightTransaction {
	s.Function = &v
	return s
}

func (s *ChainInsightTransaction) SetInputDecoded(v string) *ChainInsightTransaction {
	s.InputDecoded = &v
	return s
}

func (s *ChainInsightTransaction) SetOutput(v string) *ChainInsightTransaction {
	s.Output = &v
	return s
}

func (s *ChainInsightTransaction) SetOutputDecoded(v string) *ChainInsightTransaction {
	s.OutputDecoded = &v
	return s
}

func (s *ChainInsightTransaction) SetBlockNum(v int64) *ChainInsightTransaction {
	s.BlockNum = &v
	return s
}

func (s *ChainInsightTransaction) SetTxIndex(v int64) *ChainInsightTransaction {
	s.TxIndex = &v
	return s
}

func (s *ChainInsightTransaction) SetData(v string) *ChainInsightTransaction {
	s.Data = &v
	return s
}

func (s *ChainInsightTransaction) SetEvents(v []*ChainInsightEvent) *ChainInsightTransaction {
	s.Events = v
	return s
}

func (s *ChainInsightTransaction) SetTimestamp(v int64) *ChainInsightTransaction {
	s.Timestamp = &v
	return s
}

// 数据洞察合约接口
type ChainInsightContractInterface struct {
	// 展示的函数名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 接口中使用的函数名称标识符
	NameSig *string `json:"name_sig,omitempty" xml:"name_sig,omitempty" require:"true"`
	// 接口的类型，枚举：function, event, deposit
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 对应的标准 ERC 事件/方法 的名称
	StandardErcName *string `json:"standard_erc_name,omitempty" xml:"standard_erc_name,omitempty"`
	// 参数列表
	Args []*ChainInsightContractInterfaceArgument `json:"args,omitempty" xml:"args,omitempty" type:"Repeated"`
}

func (s ChainInsightContractInterface) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightContractInterface) GoString() string {
	return s.String()
}

func (s *ChainInsightContractInterface) SetName(v string) *ChainInsightContractInterface {
	s.Name = &v
	return s
}

func (s *ChainInsightContractInterface) SetNameSig(v string) *ChainInsightContractInterface {
	s.NameSig = &v
	return s
}

func (s *ChainInsightContractInterface) SetType(v string) *ChainInsightContractInterface {
	s.Type = &v
	return s
}

func (s *ChainInsightContractInterface) SetStandardErcName(v string) *ChainInsightContractInterface {
	s.StandardErcName = &v
	return s
}

func (s *ChainInsightContractInterface) SetArgs(v []*ChainInsightContractInterfaceArgument) *ChainInsightContractInterface {
	s.Args = v
	return s
}

// 数据洞察合约接口参数信息
type ChainInsightContractInterfaceArgument struct {
	// 参数名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 参数类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 参数位置，枚举：input，output，deposit
	Location *string `json:"location,omitempty" xml:"location,omitempty" require:"true"`
	// 参数的业务名称
	Comment *string `json:"comment,omitempty" xml:"comment,omitempty"`
	// 用于在更新参数配置时，声明是否需要删除该参数的 comment 内容
	DeleteComment *bool `json:"delete_comment,omitempty" xml:"delete_comment,omitempty"`
	// 对应的标准 ERC 参数的名称，例如：标准ERC1155 TransferBatch事件中的operator
	StandardErcName *string `json:"standard_erc_name,omitempty" xml:"standard_erc_name,omitempty"`
	// 是否进行数据脱敏
	NeedDesensitization *bool `json:"need_desensitization,omitempty" xml:"need_desensitization,omitempty"`
	// 子参数列表
	SubArgs *ChainInsightContractInterfaceArgumentList `json:"sub_args,omitempty" xml:"sub_args,omitempty"`
}

func (s ChainInsightContractInterfaceArgument) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightContractInterfaceArgument) GoString() string {
	return s.String()
}

func (s *ChainInsightContractInterfaceArgument) SetName(v string) *ChainInsightContractInterfaceArgument {
	s.Name = &v
	return s
}

func (s *ChainInsightContractInterfaceArgument) SetType(v string) *ChainInsightContractInterfaceArgument {
	s.Type = &v
	return s
}

func (s *ChainInsightContractInterfaceArgument) SetLocation(v string) *ChainInsightContractInterfaceArgument {
	s.Location = &v
	return s
}

func (s *ChainInsightContractInterfaceArgument) SetComment(v string) *ChainInsightContractInterfaceArgument {
	s.Comment = &v
	return s
}

func (s *ChainInsightContractInterfaceArgument) SetDeleteComment(v bool) *ChainInsightContractInterfaceArgument {
	s.DeleteComment = &v
	return s
}

func (s *ChainInsightContractInterfaceArgument) SetStandardErcName(v string) *ChainInsightContractInterfaceArgument {
	s.StandardErcName = &v
	return s
}

func (s *ChainInsightContractInterfaceArgument) SetNeedDesensitization(v bool) *ChainInsightContractInterfaceArgument {
	s.NeedDesensitization = &v
	return s
}

func (s *ChainInsightContractInterfaceArgument) SetSubArgs(v *ChainInsightContractInterfaceArgumentList) *ChainInsightContractInterfaceArgument {
	s.SubArgs = v
	return s
}

// 二维点
type ChainInsightPoint struct {
	// x坐标，4位定点小数， 10000 表示 1
	X *int64 `json:"x,omitempty" xml:"x,omitempty" require:"true"`
	// y坐标，4位定点小数， 10000 表示 1
	Y *int64 `json:"y,omitempty" xml:"y,omitempty" require:"true"`
}

func (s ChainInsightPoint) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightPoint) GoString() string {
	return s.String()
}

func (s *ChainInsightPoint) SetX(v int64) *ChainInsightPoint {
	s.X = &v
	return s
}

func (s *ChainInsightPoint) SetY(v int64) *ChainInsightPoint {
	s.Y = &v
	return s
}

// 数据洞察折线图
type ChainInsightHistogram struct {
	// 横坐标名称
	XLabel *string `json:"x_label,omitempty" xml:"x_label,omitempty"`
	// 纵坐标名称
	YLabel *string `json:"y_label,omitempty" xml:"y_label,omitempty"`
	// 坐标集，按x增序
	Points []*ChainInsightPoint `json:"points,omitempty" xml:"points,omitempty" require:"true" type:"Repeated"`
	// 表格的名称或维度名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s ChainInsightHistogram) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightHistogram) GoString() string {
	return s.String()
}

func (s *ChainInsightHistogram) SetXLabel(v string) *ChainInsightHistogram {
	s.XLabel = &v
	return s
}

func (s *ChainInsightHistogram) SetYLabel(v string) *ChainInsightHistogram {
	s.YLabel = &v
	return s
}

func (s *ChainInsightHistogram) SetPoints(v []*ChainInsightPoint) *ChainInsightHistogram {
	s.Points = v
	return s
}

func (s *ChainInsightHistogram) SetName(v string) *ChainInsightHistogram {
	s.Name = &v
	return s
}

// 链上区块
type ChainInsightBlock struct {
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 链名称
	BizIdName *string `json:"biz_id_name,omitempty" xml:"biz_id_name,omitempty"`
	// 链ID
	Chain *string `json:"chain,omitempty" xml:"chain,omitempty" require:"true"`
	// 所在子网
	Network *string `json:"network,omitempty" xml:"network,omitempty" require:"true"`
	// 区块高度
	Number *int64 `json:"number,omitempty" xml:"number,omitempty" require:"true"`
	// 区块Hash
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty" require:"true"`
	// 区块创建时间戳
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty" require:"true"`
	// 上一个区块Hash
	PreviousHash *string `json:"previous_hash,omitempty" xml:"previous_hash,omitempty" require:"true"`
	// 区块内交易列表
	Transactions []*ChainInsightTransaction `json:"transactions,omitempty" xml:"transactions,omitempty" require:"true" type:"Repeated"`
	// 区块的json序列化string
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ChainInsightBlock) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightBlock) GoString() string {
	return s.String()
}

func (s *ChainInsightBlock) SetBizId(v string) *ChainInsightBlock {
	s.BizId = &v
	return s
}

func (s *ChainInsightBlock) SetBizIdName(v string) *ChainInsightBlock {
	s.BizIdName = &v
	return s
}

func (s *ChainInsightBlock) SetChain(v string) *ChainInsightBlock {
	s.Chain = &v
	return s
}

func (s *ChainInsightBlock) SetNetwork(v string) *ChainInsightBlock {
	s.Network = &v
	return s
}

func (s *ChainInsightBlock) SetNumber(v int64) *ChainInsightBlock {
	s.Number = &v
	return s
}

func (s *ChainInsightBlock) SetHash(v string) *ChainInsightBlock {
	s.Hash = &v
	return s
}

func (s *ChainInsightBlock) SetCreateTime(v int64) *ChainInsightBlock {
	s.CreateTime = &v
	return s
}

func (s *ChainInsightBlock) SetPreviousHash(v string) *ChainInsightBlock {
	s.PreviousHash = &v
	return s
}

func (s *ChainInsightBlock) SetTransactions(v []*ChainInsightTransaction) *ChainInsightBlock {
	s.Transactions = v
	return s
}

func (s *ChainInsightBlock) SetData(v string) *ChainInsightBlock {
	s.Data = &v
	return s
}

// 地址最近交易返回值
type ChainInsightAddressLatestTxsResponse struct {
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 当前页码
	Current *int64 `json:"current,omitempty" xml:"current,omitempty"`
	// 合计
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 近期交易详情
	List []*ChainInsightTransaction `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
}

func (s ChainInsightAddressLatestTxsResponse) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightAddressLatestTxsResponse) GoString() string {
	return s.String()
}

func (s *ChainInsightAddressLatestTxsResponse) SetPageSize(v int64) *ChainInsightAddressLatestTxsResponse {
	s.PageSize = &v
	return s
}

func (s *ChainInsightAddressLatestTxsResponse) SetCurrent(v int64) *ChainInsightAddressLatestTxsResponse {
	s.Current = &v
	return s
}

func (s *ChainInsightAddressLatestTxsResponse) SetTotal(v int64) *ChainInsightAddressLatestTxsResponse {
	s.Total = &v
	return s
}

func (s *ChainInsightAddressLatestTxsResponse) SetList(v []*ChainInsightTransaction) *ChainInsightAddressLatestTxsResponse {
	s.List = v
	return s
}

// 查询自定义统计Table指标的返回结果
type ChainInsightStatisticCustomTablesResponse struct {
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 当前页码
	Current *int64 `json:"current,omitempty" xml:"current,omitempty" require:"true"`
	// 总条数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty" require:"true"`
	// 表格每一行内容，    Key 为列名，    Value，列的取值
	List []*ChainInsightStatisticCustomTableRow `json:"list,omitempty" xml:"list,omitempty" require:"true" type:"Repeated"`
}

func (s ChainInsightStatisticCustomTablesResponse) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightStatisticCustomTablesResponse) GoString() string {
	return s.String()
}

func (s *ChainInsightStatisticCustomTablesResponse) SetPageSize(v int64) *ChainInsightStatisticCustomTablesResponse {
	s.PageSize = &v
	return s
}

func (s *ChainInsightStatisticCustomTablesResponse) SetCurrent(v int64) *ChainInsightStatisticCustomTablesResponse {
	s.Current = &v
	return s
}

func (s *ChainInsightStatisticCustomTablesResponse) SetTotal(v int64) *ChainInsightStatisticCustomTablesResponse {
	s.Total = &v
	return s
}

func (s *ChainInsightStatisticCustomTablesResponse) SetList(v []*ChainInsightStatisticCustomTableRow) *ChainInsightStatisticCustomTablesResponse {
	s.List = v
	return s
}

// 数据洞察统计指标Meta元数据
type ChainInsightStatisticMetricMeta struct {
	// 统计指标的类型；枚举：Table，Histogram
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 指标的展示名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 指标的实际名称（自定义指标ID）
	MetricName *string `json:"metric_name,omitempty" xml:"metric_name,omitempty" require:"true"`
}

func (s ChainInsightStatisticMetricMeta) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightStatisticMetricMeta) GoString() string {
	return s.String()
}

func (s *ChainInsightStatisticMetricMeta) SetType(v string) *ChainInsightStatisticMetricMeta {
	s.Type = &v
	return s
}

func (s *ChainInsightStatisticMetricMeta) SetName(v string) *ChainInsightStatisticMetricMeta {
	s.Name = &v
	return s
}

func (s *ChainInsightStatisticMetricMeta) SetMetricName(v string) *ChainInsightStatisticMetricMeta {
	s.MetricName = &v
	return s
}

// 数据洞察统计任务
type ChainInsightStatisticTask struct {
	// 统计任务ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 统计任务类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 所属链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 统计的链上合约地址
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 任务产出的指标信息
	Metrics []*ChainInsightStatisticMetricMeta `json:"metrics,omitempty" xml:"metrics,omitempty" require:"true" type:"Repeated"`
	// 任务创建时间，毫秒时间戳
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 任务修改时间，毫秒时间戳
	ModifyTime *int64 `json:"modify_time,omitempty" xml:"modify_time,omitempty"`
	// 任务状态：Running： 运行中； Paused: 已暂停
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s ChainInsightStatisticTask) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightStatisticTask) GoString() string {
	return s.String()
}

func (s *ChainInsightStatisticTask) SetId(v string) *ChainInsightStatisticTask {
	s.Id = &v
	return s
}

func (s *ChainInsightStatisticTask) SetType(v string) *ChainInsightStatisticTask {
	s.Type = &v
	return s
}

func (s *ChainInsightStatisticTask) SetBizId(v string) *ChainInsightStatisticTask {
	s.BizId = &v
	return s
}

func (s *ChainInsightStatisticTask) SetAddress(v string) *ChainInsightStatisticTask {
	s.Address = &v
	return s
}

func (s *ChainInsightStatisticTask) SetMetrics(v []*ChainInsightStatisticMetricMeta) *ChainInsightStatisticTask {
	s.Metrics = v
	return s
}

func (s *ChainInsightStatisticTask) SetCreateTime(v int64) *ChainInsightStatisticTask {
	s.CreateTime = &v
	return s
}

func (s *ChainInsightStatisticTask) SetModifyTime(v int64) *ChainInsightStatisticTask {
	s.ModifyTime = &v
	return s
}

func (s *ChainInsightStatisticTask) SetStatus(v string) *ChainInsightStatisticTask {
	s.Status = &v
	return s
}

// 数据洞察表格行
type ChainInsightStatisticCustomTableRow struct {
	// 表格的一行
	Row []*MapEntry `json:"row,omitempty" xml:"row,omitempty" require:"true" type:"Repeated"`
}

func (s ChainInsightStatisticCustomTableRow) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightStatisticCustomTableRow) GoString() string {
	return s.String()
}

func (s *ChainInsightStatisticCustomTableRow) SetRow(v []*MapEntry) *ChainInsightStatisticCustomTableRow {
	s.Row = v
	return s
}

// 数据搜索状态
type ChainInsightSearchStatus struct {
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 链名称
	BizIdName *string `json:"biz_id_name,omitempty" xml:"biz_id_name,omitempty"`
	// Indexing,Enabled,Disabled
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 当前索引的区块高度
	CurrentHeight *int64 `json:"current_height,omitempty" xml:"current_height,omitempty"`
	// 当前区块链高度
	LedgerHeight *int64 `json:"ledger_height,omitempty" xml:"ledger_height,omitempty"`
	// 预计索引完成的时间，单位秒
	EstimateTime *int64 `json:"estimate_time,omitempty" xml:"estimate_time,omitempty"`
}

func (s ChainInsightSearchStatus) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightSearchStatus) GoString() string {
	return s.String()
}

func (s *ChainInsightSearchStatus) SetBizId(v string) *ChainInsightSearchStatus {
	s.BizId = &v
	return s
}

func (s *ChainInsightSearchStatus) SetBizIdName(v string) *ChainInsightSearchStatus {
	s.BizIdName = &v
	return s
}

func (s *ChainInsightSearchStatus) SetStatus(v string) *ChainInsightSearchStatus {
	s.Status = &v
	return s
}

func (s *ChainInsightSearchStatus) SetCurrentHeight(v int64) *ChainInsightSearchStatus {
	s.CurrentHeight = &v
	return s
}

func (s *ChainInsightSearchStatus) SetLedgerHeight(v int64) *ChainInsightSearchStatus {
	s.LedgerHeight = &v
	return s
}

func (s *ChainInsightSearchStatus) SetEstimateTime(v int64) *ChainInsightSearchStatus {
	s.EstimateTime = &v
	return s
}

// 数据洞察看板
type ChainInsightWidget struct {
	// 看版类型，内置看版类型为Default
	WidgetType *string `json:"widget_type,omitempty" xml:"widget_type,omitempty" require:"true"`
	// 看版子类型；ChainIdWidget, ChainAccountWidget, ChainContractWidget, ChainTotalTransactionWidget, ChainActiveAddressWidget, ChainTxTimeLineWidget
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 看版时间范围，单位小时
	TimeRange *int64 `json:"time_range,omitempty" xml:"time_range,omitempty" require:"true"`
	// 看板ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 看版名称，最大32字符
	Name *string `json:"name,omitempty" xml:"name,omitempty" maxLength:"32"`
	// 看版描述，最大 255 字符
	Description *string `json:"description,omitempty" xml:"description,omitempty" maxLength:"255"`
	// 看版创建时间，单位毫秒时间戳
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 看版修改时间，单位毫秒时间戳
	ModifyTime *int64 `json:"modify_time,omitempty" xml:"modify_time,omitempty"`
	// 看版对应的链ID，空表示联盟下所有的链
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 链名称
	BizIdName *string `json:"biz_id_name,omitempty" xml:"biz_id_name,omitempty"`
	// 看版对应的链上账户地址，hex编码
	HexAddress *string `json:"hex_address,omitempty" xml:"hex_address,omitempty"`
	// 时间轴搜索的请求
	Query *string `json:"query,omitempty" xml:"query,omitempty"`
}

func (s ChainInsightWidget) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightWidget) GoString() string {
	return s.String()
}

func (s *ChainInsightWidget) SetWidgetType(v string) *ChainInsightWidget {
	s.WidgetType = &v
	return s
}

func (s *ChainInsightWidget) SetType(v string) *ChainInsightWidget {
	s.Type = &v
	return s
}

func (s *ChainInsightWidget) SetTimeRange(v int64) *ChainInsightWidget {
	s.TimeRange = &v
	return s
}

func (s *ChainInsightWidget) SetId(v string) *ChainInsightWidget {
	s.Id = &v
	return s
}

func (s *ChainInsightWidget) SetName(v string) *ChainInsightWidget {
	s.Name = &v
	return s
}

func (s *ChainInsightWidget) SetDescription(v string) *ChainInsightWidget {
	s.Description = &v
	return s
}

func (s *ChainInsightWidget) SetCreateTime(v int64) *ChainInsightWidget {
	s.CreateTime = &v
	return s
}

func (s *ChainInsightWidget) SetModifyTime(v int64) *ChainInsightWidget {
	s.ModifyTime = &v
	return s
}

func (s *ChainInsightWidget) SetBizId(v string) *ChainInsightWidget {
	s.BizId = &v
	return s
}

func (s *ChainInsightWidget) SetBizIdName(v string) *ChainInsightWidget {
	s.BizIdName = &v
	return s
}

func (s *ChainInsightWidget) SetHexAddress(v string) *ChainInsightWidget {
	s.HexAddress = &v
	return s
}

func (s *ChainInsightWidget) SetQuery(v string) *ChainInsightWidget {
	s.Query = &v
	return s
}

// 链上近期活跃地址响应
type ChainInsightActiveAddressesResponse struct {
	// 页面大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 当前页码
	Current *int64 `json:"current,omitempty" xml:"current,omitempty"`
	// 合计
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 结果列表
	List []*MapEntryList `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
}

func (s ChainInsightActiveAddressesResponse) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightActiveAddressesResponse) GoString() string {
	return s.String()
}

func (s *ChainInsightActiveAddressesResponse) SetPageSize(v int64) *ChainInsightActiveAddressesResponse {
	s.PageSize = &v
	return s
}

func (s *ChainInsightActiveAddressesResponse) SetCurrent(v int64) *ChainInsightActiveAddressesResponse {
	s.Current = &v
	return s
}

func (s *ChainInsightActiveAddressesResponse) SetTotal(v int64) *ChainInsightActiveAddressesResponse {
	s.Total = &v
	return s
}

func (s *ChainInsightActiveAddressesResponse) SetList(v []*MapEntryList) *ChainInsightActiveAddressesResponse {
	s.List = v
	return s
}

// 链上交易基础信息
type ChainInsightTransactionInfo struct {
	// 交易ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 交易类型
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 交易发起者
	From *string `json:"from,omitempty" xml:"from,omitempty"`
	// 交易接收者
	To *string `json:"to,omitempty" xml:"to,omitempty"`
	// 交易成块高度
	Height *int64 `json:"height,omitempty" xml:"height,omitempty"`
	// 交易成块时间，毫秒时间戳
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
	// 合约中 ABI 的状态  (无需上传) none / （可以上传）pending / （可以更新）uploaded
	AbiStatus *string `json:"abi_status,omitempty" xml:"abi_status,omitempty"`
}

func (s ChainInsightTransactionInfo) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightTransactionInfo) GoString() string {
	return s.String()
}

func (s *ChainInsightTransactionInfo) SetId(v string) *ChainInsightTransactionInfo {
	s.Id = &v
	return s
}

func (s *ChainInsightTransactionInfo) SetType(v string) *ChainInsightTransactionInfo {
	s.Type = &v
	return s
}

func (s *ChainInsightTransactionInfo) SetFrom(v string) *ChainInsightTransactionInfo {
	s.From = &v
	return s
}

func (s *ChainInsightTransactionInfo) SetTo(v string) *ChainInsightTransactionInfo {
	s.To = &v
	return s
}

func (s *ChainInsightTransactionInfo) SetHeight(v int64) *ChainInsightTransactionInfo {
	s.Height = &v
	return s
}

func (s *ChainInsightTransactionInfo) SetTimestamp(v int64) *ChainInsightTransactionInfo {
	s.Timestamp = &v
	return s
}

func (s *ChainInsightTransactionInfo) SetAbiStatus(v string) *ChainInsightTransactionInfo {
	s.AbiStatus = &v
	return s
}

// ChainInsightTransactionInfo分页结构体
type ChainInsightTransactionInfoPageableResponse struct {
	// 页面大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 当前页码
	Current *int64 `json:"current,omitempty" xml:"current,omitempty"`
	// 合计
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// ChainInsightTransactionInfo列表
	List []*ChainInsightTransactionInfo `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
}

func (s ChainInsightTransactionInfoPageableResponse) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightTransactionInfoPageableResponse) GoString() string {
	return s.String()
}

func (s *ChainInsightTransactionInfoPageableResponse) SetPageSize(v int64) *ChainInsightTransactionInfoPageableResponse {
	s.PageSize = &v
	return s
}

func (s *ChainInsightTransactionInfoPageableResponse) SetCurrent(v int64) *ChainInsightTransactionInfoPageableResponse {
	s.Current = &v
	return s
}

func (s *ChainInsightTransactionInfoPageableResponse) SetTotal(v int64) *ChainInsightTransactionInfoPageableResponse {
	s.Total = &v
	return s
}

func (s *ChainInsightTransactionInfoPageableResponse) SetList(v []*ChainInsightTransactionInfo) *ChainInsightTransactionInfoPageableResponse {
	s.List = v
	return s
}

// 区块链节点信息
type ChainInsightNodeInfo struct {
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 节点名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 节点IP
	Ip *string `json:"ip,omitempty" xml:"ip,omitempty"`
	// 节点当前区块高度
	Height *int64 `json:"height,omitempty" xml:"height,omitempty"`
	// 节点状态，ok, fail
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s ChainInsightNodeInfo) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightNodeInfo) GoString() string {
	return s.String()
}

func (s *ChainInsightNodeInfo) SetBizId(v string) *ChainInsightNodeInfo {
	s.BizId = &v
	return s
}

func (s *ChainInsightNodeInfo) SetName(v string) *ChainInsightNodeInfo {
	s.Name = &v
	return s
}

func (s *ChainInsightNodeInfo) SetIp(v string) *ChainInsightNodeInfo {
	s.Ip = &v
	return s
}

func (s *ChainInsightNodeInfo) SetHeight(v int64) *ChainInsightNodeInfo {
	s.Height = &v
	return s
}

func (s *ChainInsightNodeInfo) SetStatus(v string) *ChainInsightNodeInfo {
	s.Status = &v
	return s
}

// 链状态
type ChainStatus struct {
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 链名称
	BizIdName *string `json:"biz_id_name,omitempty" xml:"biz_id_name,omitempty"`
	// 主链ID
	ParentBizId *string `json:"parent_biz_id,omitempty" xml:"parent_biz_id,omitempty"`
	// 当前区块高度
	LedgerHeight *int64 `json:"ledger_height,omitempty" xml:"ledger_height,omitempty"`
	// 交易总量
	TxCount *int64 `json:"tx_count,omitempty" xml:"tx_count,omitempty"`
	// 链状态，ok, fail
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s ChainStatus) String() string {
	return tea.Prettify(s)
}

func (s ChainStatus) GoString() string {
	return s.String()
}

func (s *ChainStatus) SetBizId(v string) *ChainStatus {
	s.BizId = &v
	return s
}

func (s *ChainStatus) SetBizIdName(v string) *ChainStatus {
	s.BizIdName = &v
	return s
}

func (s *ChainStatus) SetParentBizId(v string) *ChainStatus {
	s.ParentBizId = &v
	return s
}

func (s *ChainStatus) SetLedgerHeight(v int64) *ChainStatus {
	s.LedgerHeight = &v
	return s
}

func (s *ChainStatus) SetTxCount(v int64) *ChainStatus {
	s.TxCount = &v
	return s
}

func (s *ChainStatus) SetStatus(v string) *ChainStatus {
	s.Status = &v
	return s
}

// 链状态信息
type ChainInsightChainStatus struct {
	// 节点信息
	NodeInfos []*ChainInsightNodeInfo `json:"node_infos,omitempty" xml:"node_infos,omitempty" type:"Repeated"`
	// 链状态
	ChainStatuses []*ChainStatus `json:"chain_statuses,omitempty" xml:"chain_statuses,omitempty" type:"Repeated"`
}

func (s ChainInsightChainStatus) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightChainStatus) GoString() string {
	return s.String()
}

func (s *ChainInsightChainStatus) SetNodeInfos(v []*ChainInsightNodeInfo) *ChainInsightChainStatus {
	s.NodeInfos = v
	return s
}

func (s *ChainInsightChainStatus) SetChainStatuses(v []*ChainStatus) *ChainInsightChainStatus {
	s.ChainStatuses = v
	return s
}

// MapEntry列表，对应一个Map
type MapEntryList struct {
	// MapEntry列表
	Element []*MapEntry `json:"element,omitempty" xml:"element,omitempty" type:"Repeated"`
}

func (s MapEntryList) String() string {
	return tea.Prettify(s)
}

func (s MapEntryList) GoString() string {
	return s.String()
}

func (s *MapEntryList) SetElement(v []*MapEntry) *MapEntryList {
	s.Element = v
	return s
}

// 链上资产信息
type ChainInsightAsset struct {
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 链名称
	BizIdName *string `json:"biz_id_name,omitempty" xml:"biz_id_name,omitempty"`
	// 资产合约地址
	ContractAddr *string `json:"contract_addr,omitempty" xml:"contract_addr,omitempty" require:"true"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 数字权证链上的1155资产分片ID
	ShardId *string `json:"shard_id,omitempty" xml:"shard_id,omitempty"`
	// 资产类型：ERC721 / ERC1155
	ErcType *string `json:"erc_type,omitempty" xml:"erc_type,omitempty" require:"true"`
	// 创建时间，取值为创建时交易所在区块创建的时间，单位：毫秒
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 持有者数量
	OwnerCount *int64 `json:"owner_count,omitempty" xml:"owner_count,omitempty"`
	// 资产元信息
	MetaData *string `json:"meta_data,omitempty" xml:"meta_data,omitempty"`
	// 资产元信息链接
	Uri *string `json:"uri,omitempty" xml:"uri,omitempty"`
	// 账户名下该资产的余额 / 合约下该资产的总供应量
	Balance *int64 `json:"balance,omitempty" xml:"balance,omitempty"`
	// 该资产最近一笔交易的哈希
	LatestTxHash *string `json:"latest_tx_hash,omitempty" xml:"latest_tx_hash,omitempty" require:"true"`
	// 该资产最近一笔交易所在区块的创建时间
	LatestTxTime *int64 `json:"latest_tx_time,omitempty" xml:"latest_tx_time,omitempty" require:"true"`
}

func (s ChainInsightAsset) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightAsset) GoString() string {
	return s.String()
}

func (s *ChainInsightAsset) SetBizId(v string) *ChainInsightAsset {
	s.BizId = &v
	return s
}

func (s *ChainInsightAsset) SetBizIdName(v string) *ChainInsightAsset {
	s.BizIdName = &v
	return s
}

func (s *ChainInsightAsset) SetContractAddr(v string) *ChainInsightAsset {
	s.ContractAddr = &v
	return s
}

func (s *ChainInsightAsset) SetAssetId(v string) *ChainInsightAsset {
	s.AssetId = &v
	return s
}

func (s *ChainInsightAsset) SetShardId(v string) *ChainInsightAsset {
	s.ShardId = &v
	return s
}

func (s *ChainInsightAsset) SetErcType(v string) *ChainInsightAsset {
	s.ErcType = &v
	return s
}

func (s *ChainInsightAsset) SetCreateTime(v int64) *ChainInsightAsset {
	s.CreateTime = &v
	return s
}

func (s *ChainInsightAsset) SetOwnerCount(v int64) *ChainInsightAsset {
	s.OwnerCount = &v
	return s
}

func (s *ChainInsightAsset) SetMetaData(v string) *ChainInsightAsset {
	s.MetaData = &v
	return s
}

func (s *ChainInsightAsset) SetUri(v string) *ChainInsightAsset {
	s.Uri = &v
	return s
}

func (s *ChainInsightAsset) SetBalance(v int64) *ChainInsightAsset {
	s.Balance = &v
	return s
}

func (s *ChainInsightAsset) SetLatestTxHash(v string) *ChainInsightAsset {
	s.LatestTxHash = &v
	return s
}

func (s *ChainInsightAsset) SetLatestTxTime(v int64) *ChainInsightAsset {
	s.LatestTxTime = &v
	return s
}

// 链上资产元信息
type ChainInsightAssetMeta struct {
	// 资产元信息链接
	Uri *string `json:"uri,omitempty" xml:"uri,omitempty"`
	// 资产元信息
	MetaData *string `json:"meta_data,omitempty" xml:"meta_data,omitempty"`
	// 资源类型：Image / Audio / Video / Unknown
	ResourceType *string `json:"resource_type,omitempty" xml:"resource_type,omitempty" require:"true"`
	// 资源详细数据，如图片、视频的链接
	ResourceData *string `json:"resource_data,omitempty" xml:"resource_data,omitempty"`
}

func (s ChainInsightAssetMeta) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightAssetMeta) GoString() string {
	return s.String()
}

func (s *ChainInsightAssetMeta) SetUri(v string) *ChainInsightAssetMeta {
	s.Uri = &v
	return s
}

func (s *ChainInsightAssetMeta) SetMetaData(v string) *ChainInsightAssetMeta {
	s.MetaData = &v
	return s
}

func (s *ChainInsightAssetMeta) SetResourceType(v string) *ChainInsightAssetMeta {
	s.ResourceType = &v
	return s
}

func (s *ChainInsightAssetMeta) SetResourceData(v string) *ChainInsightAssetMeta {
	s.ResourceData = &v
	return s
}

// 链上资产持有者信息
type ChainInsightAssetOwner struct {
	// 持有者地址
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty" require:"true"`
	// 合约地址
	ContractAddr *string `json:"contract_addr,omitempty" xml:"contract_addr,omitempty" require:"true"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 数字权证链1155合约特有的分片ID
	ShardId *string `json:"shard_id,omitempty" xml:"shard_id,omitempty"`
	// 资产类型：ERC721 / ERC1155
	ErcType *string `json:"erc_type,omitempty" xml:"erc_type,omitempty" require:"true"`
	// 数字资产余额
	Balance *int64 `json:"balance,omitempty" xml:"balance,omitempty" require:"true"`
	// 该账户对该资产最近一次转让交易的哈希
	UpdateTxHash *string `json:"update_tx_hash,omitempty" xml:"update_tx_hash,omitempty" require:"true"`
	// 该账户对该资产最近一次转让交易所在区块高度
	UpdateBlockHeight *int64 `json:"update_block_height,omitempty" xml:"update_block_height,omitempty" require:"true"`
	// 该账户对该资产最近一次转让交易所在区块的创建时间，单位：毫秒
	UpdateBlockTime *int64 `json:"update_block_time,omitempty" xml:"update_block_time,omitempty" require:"true"`
}

func (s ChainInsightAssetOwner) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightAssetOwner) GoString() string {
	return s.String()
}

func (s *ChainInsightAssetOwner) SetOwner(v string) *ChainInsightAssetOwner {
	s.Owner = &v
	return s
}

func (s *ChainInsightAssetOwner) SetContractAddr(v string) *ChainInsightAssetOwner {
	s.ContractAddr = &v
	return s
}

func (s *ChainInsightAssetOwner) SetAssetId(v string) *ChainInsightAssetOwner {
	s.AssetId = &v
	return s
}

func (s *ChainInsightAssetOwner) SetShardId(v string) *ChainInsightAssetOwner {
	s.ShardId = &v
	return s
}

func (s *ChainInsightAssetOwner) SetErcType(v string) *ChainInsightAssetOwner {
	s.ErcType = &v
	return s
}

func (s *ChainInsightAssetOwner) SetBalance(v int64) *ChainInsightAssetOwner {
	s.Balance = &v
	return s
}

func (s *ChainInsightAssetOwner) SetUpdateTxHash(v string) *ChainInsightAssetOwner {
	s.UpdateTxHash = &v
	return s
}

func (s *ChainInsightAssetOwner) SetUpdateBlockHeight(v int64) *ChainInsightAssetOwner {
	s.UpdateBlockHeight = &v
	return s
}

func (s *ChainInsightAssetOwner) SetUpdateBlockTime(v int64) *ChainInsightAssetOwner {
	s.UpdateBlockTime = &v
	return s
}

// 链上资产持有者信息响应
type ChainInsightAssetOwnersResponse struct {
	// 页面大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 当前页码
	Current *int64 `json:"current,omitempty" xml:"current,omitempty" require:"true"`
	// 合计
	Total *int64 `json:"total,omitempty" xml:"total,omitempty" require:"true"`
	// 结果列表
	List []*ChainInsightAssetOwner `json:"list,omitempty" xml:"list,omitempty" require:"true" type:"Repeated"`
}

func (s ChainInsightAssetOwnersResponse) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightAssetOwnersResponse) GoString() string {
	return s.String()
}

func (s *ChainInsightAssetOwnersResponse) SetPageSize(v int64) *ChainInsightAssetOwnersResponse {
	s.PageSize = &v
	return s
}

func (s *ChainInsightAssetOwnersResponse) SetCurrent(v int64) *ChainInsightAssetOwnersResponse {
	s.Current = &v
	return s
}

func (s *ChainInsightAssetOwnersResponse) SetTotal(v int64) *ChainInsightAssetOwnersResponse {
	s.Total = &v
	return s
}

func (s *ChainInsightAssetOwnersResponse) SetList(v []*ChainInsightAssetOwner) *ChainInsightAssetOwnersResponse {
	s.List = v
	return s
}

// 链上资产信息响应
type ChainInsightAssetsResponse struct {
	// 页面大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 当前页码
	Current *int64 `json:"current,omitempty" xml:"current,omitempty" require:"true"`
	// 合计
	Total *int64 `json:"total,omitempty" xml:"total,omitempty" require:"true"`
	// 结果列表
	List []*ChainInsightAsset `json:"list,omitempty" xml:"list,omitempty" require:"true" type:"Repeated"`
}

func (s ChainInsightAssetsResponse) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightAssetsResponse) GoString() string {
	return s.String()
}

func (s *ChainInsightAssetsResponse) SetPageSize(v int64) *ChainInsightAssetsResponse {
	s.PageSize = &v
	return s
}

func (s *ChainInsightAssetsResponse) SetCurrent(v int64) *ChainInsightAssetsResponse {
	s.Current = &v
	return s
}

func (s *ChainInsightAssetsResponse) SetTotal(v int64) *ChainInsightAssetsResponse {
	s.Total = &v
	return s
}

func (s *ChainInsightAssetsResponse) SetList(v []*ChainInsightAsset) *ChainInsightAssetsResponse {
	s.List = v
	return s
}

// 链上资产流转信息
type ChainInsightAssetOperation struct {
	// 合约地址
	ContractAddr *string `json:"contract_addr,omitempty" xml:"contract_addr,omitempty" require:"true"`
	// 流转交易哈希
	TxId *string `json:"tx_id,omitempty" xml:"tx_id,omitempty" require:"true"`
	// 转让执行者地址，ERC1155资产会有
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
	// 资产转出地址
	From *string `json:"from,omitempty" xml:"from,omitempty" require:"true"`
	// 资产转入地址
	To *string `json:"to,omitempty" xml:"to,omitempty" require:"true"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 数字权证链的1155资产的分片ID
	ShardId *string `json:"shard_id,omitempty" xml:"shard_id,omitempty"`
	// 资产转让数量
	AssetValue *int64 `json:"asset_value,omitempty" xml:"asset_value,omitempty" require:"true"`
	// 资产流转交易所在区块的创建时间，单位：毫秒
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty" require:"true"`
	// 流转交易所在块高
	BlockHeight *int64 `json:"block_height,omitempty" xml:"block_height,omitempty" require:"true"`
}

func (s ChainInsightAssetOperation) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightAssetOperation) GoString() string {
	return s.String()
}

func (s *ChainInsightAssetOperation) SetContractAddr(v string) *ChainInsightAssetOperation {
	s.ContractAddr = &v
	return s
}

func (s *ChainInsightAssetOperation) SetTxId(v string) *ChainInsightAssetOperation {
	s.TxId = &v
	return s
}

func (s *ChainInsightAssetOperation) SetOperator(v string) *ChainInsightAssetOperation {
	s.Operator = &v
	return s
}

func (s *ChainInsightAssetOperation) SetFrom(v string) *ChainInsightAssetOperation {
	s.From = &v
	return s
}

func (s *ChainInsightAssetOperation) SetTo(v string) *ChainInsightAssetOperation {
	s.To = &v
	return s
}

func (s *ChainInsightAssetOperation) SetAssetId(v string) *ChainInsightAssetOperation {
	s.AssetId = &v
	return s
}

func (s *ChainInsightAssetOperation) SetShardId(v string) *ChainInsightAssetOperation {
	s.ShardId = &v
	return s
}

func (s *ChainInsightAssetOperation) SetAssetValue(v int64) *ChainInsightAssetOperation {
	s.AssetValue = &v
	return s
}

func (s *ChainInsightAssetOperation) SetTimestamp(v int64) *ChainInsightAssetOperation {
	s.Timestamp = &v
	return s
}

func (s *ChainInsightAssetOperation) SetBlockHeight(v int64) *ChainInsightAssetOperation {
	s.BlockHeight = &v
	return s
}

// 链上资产流转交易响应
type ChainInsightAssetOperationsResponse struct {
	// 页面大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 当前页码
	Current *int64 `json:"current,omitempty" xml:"current,omitempty" require:"true"`
	// 合计
	Total *int64 `json:"total,omitempty" xml:"total,omitempty" require:"true"`
	// 结果列表
	List []*ChainInsightAssetOperation `json:"list,omitempty" xml:"list,omitempty" require:"true" type:"Repeated"`
}

func (s ChainInsightAssetOperationsResponse) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightAssetOperationsResponse) GoString() string {
	return s.String()
}

func (s *ChainInsightAssetOperationsResponse) SetPageSize(v int64) *ChainInsightAssetOperationsResponse {
	s.PageSize = &v
	return s
}

func (s *ChainInsightAssetOperationsResponse) SetCurrent(v int64) *ChainInsightAssetOperationsResponse {
	s.Current = &v
	return s
}

func (s *ChainInsightAssetOperationsResponse) SetTotal(v int64) *ChainInsightAssetOperationsResponse {
	s.Total = &v
	return s
}

func (s *ChainInsightAssetOperationsResponse) SetList(v []*ChainInsightAssetOperation) *ChainInsightAssetOperationsResponse {
	s.List = v
	return s
}

// 资产合约信息
type ChainInsightAssetContractInfo struct {
	// 资产类型：ERC721 / ERC1155
	ErcType *string `json:"erc_type,omitempty" xml:"erc_type,omitempty"`
	// 资产总量
	AssetCount *int64 `json:"asset_count,omitempty" xml:"asset_count,omitempty"`
	// 持有者总量
	OwnerCount *int64 `json:"owner_count,omitempty" xml:"owner_count,omitempty"`
}

func (s ChainInsightAssetContractInfo) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightAssetContractInfo) GoString() string {
	return s.String()
}

func (s *ChainInsightAssetContractInfo) SetErcType(v string) *ChainInsightAssetContractInfo {
	s.ErcType = &v
	return s
}

func (s *ChainInsightAssetContractInfo) SetAssetCount(v int64) *ChainInsightAssetContractInfo {
	s.AssetCount = &v
	return s
}

func (s *ChainInsightAssetContractInfo) SetOwnerCount(v int64) *ChainInsightAssetContractInfo {
	s.OwnerCount = &v
	return s
}

// 业务模型配置
type DataModelConfig struct {
	// 对应的方法参数
	ArgName *string `json:"arg_name,omitempty" xml:"arg_name,omitempty" require:"true"`
	// 方法参数位置，input / output
	ArgLocation *string `json:"arg_location,omitempty" xml:"arg_location,omitempty" require:"true"`
	// 业务名称
	Comment *string `json:"comment,omitempty" xml:"comment,omitempty"`
	// 业务名称在交易时间轴是否可见
	Visible *bool `json:"visible,omitempty" xml:"visible,omitempty"`
}

func (s DataModelConfig) String() string {
	return tea.Prettify(s)
}

func (s DataModelConfig) GoString() string {
	return s.String()
}

func (s *DataModelConfig) SetArgName(v string) *DataModelConfig {
	s.ArgName = &v
	return s
}

func (s *DataModelConfig) SetArgLocation(v string) *DataModelConfig {
	s.ArgLocation = &v
	return s
}

func (s *DataModelConfig) SetComment(v string) *DataModelConfig {
	s.Comment = &v
	return s
}

func (s *DataModelConfig) SetVisible(v bool) *DataModelConfig {
	s.Visible = &v
	return s
}

// 链上地址（合约、存证账户）交易时间轴配置
type AddressTimelineConfig struct {
	// 交易时间轴看板高度
	WidgetHeight *int64 `json:"widget_height,omitempty" xml:"widget_height,omitempty" maximum:"1000" minimum:"300"`
	// 接口业务字段配置列表，更新时只需传入需要更新的方法
	InterfaceDataModelConfigs []*InterfaceDataModelConfig `json:"interface_data_model_configs,omitempty" xml:"interface_data_model_configs,omitempty" type:"Repeated"`
}

func (s AddressTimelineConfig) String() string {
	return tea.Prettify(s)
}

func (s AddressTimelineConfig) GoString() string {
	return s.String()
}

func (s *AddressTimelineConfig) SetWidgetHeight(v int64) *AddressTimelineConfig {
	s.WidgetHeight = &v
	return s
}

func (s *AddressTimelineConfig) SetInterfaceDataModelConfigs(v []*InterfaceDataModelConfig) *AddressTimelineConfig {
	s.InterfaceDataModelConfigs = v
	return s
}

// 接口业务字段配置
type InterfaceDataModelConfig struct {
	// 接口名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 接口签名，SOLIDITY 合约必填
	NameSig *string `json:"name_sig,omitempty" xml:"name_sig,omitempty"`
	// 接口类型，当前 event 暂不支持。
	// function / deposit / event
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 接口参数配置列表，保序传递。
	ArgConfigs []*DataModelConfig `json:"arg_configs,omitempty" xml:"arg_configs,omitempty" type:"Repeated"`
}

func (s InterfaceDataModelConfig) String() string {
	return tea.Prettify(s)
}

func (s InterfaceDataModelConfig) GoString() string {
	return s.String()
}

func (s *InterfaceDataModelConfig) SetName(v string) *InterfaceDataModelConfig {
	s.Name = &v
	return s
}

func (s *InterfaceDataModelConfig) SetNameSig(v string) *InterfaceDataModelConfig {
	s.NameSig = &v
	return s
}

func (s *InterfaceDataModelConfig) SetType(v string) *InterfaceDataModelConfig {
	s.Type = &v
	return s
}

func (s *InterfaceDataModelConfig) SetArgConfigs(v []*DataModelConfig) *InterfaceDataModelConfig {
	s.ArgConfigs = v
	return s
}

// 合约接口参数列表
type ChainInsightContractInterfaceArgumentList struct {
	// 合约接口参数列表
	List []*ChainInsightContractInterfaceArgument `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
}

func (s ChainInsightContractInterfaceArgumentList) String() string {
	return tea.Prettify(s)
}

func (s ChainInsightContractInterfaceArgumentList) GoString() string {
	return s.String()
}

func (s *ChainInsightContractInterfaceArgumentList) SetList(v []*ChainInsightContractInterfaceArgument) *ChainInsightContractInterfaceArgumentList {
	s.List = v
	return s
}

type QueryDatasearchSearchRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户唯一标识符（租户ID）
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 链唯一标识符
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 检索的metaId范围；私有化不支持，参数留空
	MetaConditions []*string `json:"meta_conditions,omitempty" xml:"meta_conditions,omitempty" type:"Repeated"`
	// 检索请求
	Query *DataSearchRequest `json:"query,omitempty" xml:"query,omitempty" require:"true"`
}

func (s QueryDatasearchSearchRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDatasearchSearchRequest) GoString() string {
	return s.String()
}

func (s *QueryDatasearchSearchRequest) SetAuthToken(v string) *QueryDatasearchSearchRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDatasearchSearchRequest) SetProductInstanceId(v string) *QueryDatasearchSearchRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDatasearchSearchRequest) SetTenantId(v string) *QueryDatasearchSearchRequest {
	s.TenantId = &v
	return s
}

func (s *QueryDatasearchSearchRequest) SetBizId(v string) *QueryDatasearchSearchRequest {
	s.BizId = &v
	return s
}

func (s *QueryDatasearchSearchRequest) SetMetaConditions(v []*string) *QueryDatasearchSearchRequest {
	s.MetaConditions = v
	return s
}

func (s *QueryDatasearchSearchRequest) SetQuery(v *DataSearchRequest) *QueryDatasearchSearchRequest {
	s.Query = v
	return s
}

type QueryDatasearchSearchResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求下一页的Request
	Context *DataSearchRequest `json:"context,omitempty" xml:"context,omitempty"`
	// 检索的结果
	Logs []*DataSearchResultResponseLog `json:"logs,omitempty" xml:"logs,omitempty" type:"Repeated"`
}

func (s QueryDatasearchSearchResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDatasearchSearchResponse) GoString() string {
	return s.String()
}

func (s *QueryDatasearchSearchResponse) SetReqMsgId(v string) *QueryDatasearchSearchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDatasearchSearchResponse) SetResultCode(v string) *QueryDatasearchSearchResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDatasearchSearchResponse) SetResultMsg(v string) *QueryDatasearchSearchResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDatasearchSearchResponse) SetContext(v *DataSearchRequest) *QueryDatasearchSearchResponse {
	s.Context = v
	return s
}

func (s *QueryDatasearchSearchResponse) SetLogs(v []*DataSearchResultResponseLog) *QueryDatasearchSearchResponse {
	s.Logs = v
	return s
}

type StartDatasearchIndexRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户唯一标识符（租户ID）
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 链唯一标识符
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 合约ABI meta ID
	MetaId *string `json:"meta_id,omitempty" xml:"meta_id,omitempty" require:"true"`
	// 合约 hex 编码的地址
	Contract *string `json:"contract,omitempty" xml:"contract,omitempty" require:"true"`
	// 索引的起始位置，同合约ABI的起始位置； 0 表示从头
	StartHeight *int64 `json:"start_height,omitempty" xml:"start_height,omitempty" require:"true"`
	// 索引的终止位置，同合约ABI的终止位置；0 表示到最新
	EndHeight *int64 `json:"end_height,omitempty" xml:"end_height,omitempty" require:"true"`
	// 索引类型，   interface  为合约方法及输入输出； event 为合约Logs; deposit 为原生存证
	IndexType *string `json:"index_type,omitempty" xml:"index_type,omitempty" require:"true"`
}

func (s StartDatasearchIndexRequest) String() string {
	return tea.Prettify(s)
}

func (s StartDatasearchIndexRequest) GoString() string {
	return s.String()
}

func (s *StartDatasearchIndexRequest) SetAuthToken(v string) *StartDatasearchIndexRequest {
	s.AuthToken = &v
	return s
}

func (s *StartDatasearchIndexRequest) SetProductInstanceId(v string) *StartDatasearchIndexRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartDatasearchIndexRequest) SetTenantId(v string) *StartDatasearchIndexRequest {
	s.TenantId = &v
	return s
}

func (s *StartDatasearchIndexRequest) SetBizId(v string) *StartDatasearchIndexRequest {
	s.BizId = &v
	return s
}

func (s *StartDatasearchIndexRequest) SetMetaId(v string) *StartDatasearchIndexRequest {
	s.MetaId = &v
	return s
}

func (s *StartDatasearchIndexRequest) SetContract(v string) *StartDatasearchIndexRequest {
	s.Contract = &v
	return s
}

func (s *StartDatasearchIndexRequest) SetStartHeight(v int64) *StartDatasearchIndexRequest {
	s.StartHeight = &v
	return s
}

func (s *StartDatasearchIndexRequest) SetEndHeight(v int64) *StartDatasearchIndexRequest {
	s.EndHeight = &v
	return s
}

func (s *StartDatasearchIndexRequest) SetIndexType(v string) *StartDatasearchIndexRequest {
	s.IndexType = &v
	return s
}

type StartDatasearchIndexResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 合约索引的任务的状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s StartDatasearchIndexResponse) String() string {
	return tea.Prettify(s)
}

func (s StartDatasearchIndexResponse) GoString() string {
	return s.String()
}

func (s *StartDatasearchIndexResponse) SetReqMsgId(v string) *StartDatasearchIndexResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartDatasearchIndexResponse) SetResultCode(v string) *StartDatasearchIndexResponse {
	s.ResultCode = &v
	return s
}

func (s *StartDatasearchIndexResponse) SetResultMsg(v string) *StartDatasearchIndexResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartDatasearchIndexResponse) SetStatus(v string) *StartDatasearchIndexResponse {
	s.Status = &v
	return s
}

type StopDatasearchIndexRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户唯一标识符（租户ID）
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 链唯一标识符
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 合约ABI的ID
	MetaId *string `json:"meta_id,omitempty" xml:"meta_id,omitempty" require:"true"`
	// 索引类型， interface 为合约方法及输入输出； event 为合约Logs; deposit 为原生存证
	IndexType *string `json:"index_type,omitempty" xml:"index_type,omitempty" require:"true"`
}

func (s StopDatasearchIndexRequest) String() string {
	return tea.Prettify(s)
}

func (s StopDatasearchIndexRequest) GoString() string {
	return s.String()
}

func (s *StopDatasearchIndexRequest) SetAuthToken(v string) *StopDatasearchIndexRequest {
	s.AuthToken = &v
	return s
}

func (s *StopDatasearchIndexRequest) SetProductInstanceId(v string) *StopDatasearchIndexRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StopDatasearchIndexRequest) SetTenantId(v string) *StopDatasearchIndexRequest {
	s.TenantId = &v
	return s
}

func (s *StopDatasearchIndexRequest) SetBizId(v string) *StopDatasearchIndexRequest {
	s.BizId = &v
	return s
}

func (s *StopDatasearchIndexRequest) SetMetaId(v string) *StopDatasearchIndexRequest {
	s.MetaId = &v
	return s
}

func (s *StopDatasearchIndexRequest) SetIndexType(v string) *StopDatasearchIndexRequest {
	s.IndexType = &v
	return s
}

type StopDatasearchIndexResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 合约索引的任务的状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s StopDatasearchIndexResponse) String() string {
	return tea.Prettify(s)
}

func (s StopDatasearchIndexResponse) GoString() string {
	return s.String()
}

func (s *StopDatasearchIndexResponse) SetReqMsgId(v string) *StopDatasearchIndexResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StopDatasearchIndexResponse) SetResultCode(v string) *StopDatasearchIndexResponse {
	s.ResultCode = &v
	return s
}

func (s *StopDatasearchIndexResponse) SetResultMsg(v string) *StopDatasearchIndexResponse {
	s.ResultMsg = &v
	return s
}

func (s *StopDatasearchIndexResponse) SetStatus(v string) *StopDatasearchIndexResponse {
	s.Status = &v
	return s
}

type RemoveDatasearchIndexRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户唯一标识符（租户ID）
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 链唯一标识符
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 合约ABI meta ID
	MetaId *string `json:"meta_id,omitempty" xml:"meta_id,omitempty" require:"true"`
	// 索引类型， interface 为合约方法及输入输出； event 为合约Logs; deposit 为原生存证
	IndexType *string `json:"index_type,omitempty" xml:"index_type,omitempty" require:"true"`
}

func (s RemoveDatasearchIndexRequest) String() string {
	return tea.Prettify(s)
}

func (s RemoveDatasearchIndexRequest) GoString() string {
	return s.String()
}

func (s *RemoveDatasearchIndexRequest) SetAuthToken(v string) *RemoveDatasearchIndexRequest {
	s.AuthToken = &v
	return s
}

func (s *RemoveDatasearchIndexRequest) SetProductInstanceId(v string) *RemoveDatasearchIndexRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RemoveDatasearchIndexRequest) SetTenantId(v string) *RemoveDatasearchIndexRequest {
	s.TenantId = &v
	return s
}

func (s *RemoveDatasearchIndexRequest) SetBizId(v string) *RemoveDatasearchIndexRequest {
	s.BizId = &v
	return s
}

func (s *RemoveDatasearchIndexRequest) SetMetaId(v string) *RemoveDatasearchIndexRequest {
	s.MetaId = &v
	return s
}

func (s *RemoveDatasearchIndexRequest) SetIndexType(v string) *RemoveDatasearchIndexRequest {
	s.IndexType = &v
	return s
}

type RemoveDatasearchIndexResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 合约索引的任务的状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s RemoveDatasearchIndexResponse) String() string {
	return tea.Prettify(s)
}

func (s RemoveDatasearchIndexResponse) GoString() string {
	return s.String()
}

func (s *RemoveDatasearchIndexResponse) SetReqMsgId(v string) *RemoveDatasearchIndexResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RemoveDatasearchIndexResponse) SetResultCode(v string) *RemoveDatasearchIndexResponse {
	s.ResultCode = &v
	return s
}

func (s *RemoveDatasearchIndexResponse) SetResultMsg(v string) *RemoveDatasearchIndexResponse {
	s.ResultMsg = &v
	return s
}

func (s *RemoveDatasearchIndexResponse) SetStatus(v string) *RemoveDatasearchIndexResponse {
	s.Status = &v
	return s
}

type GetDatasearchIndexRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户唯一标识符（租户ID）
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 链唯一标识符
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 合约ABI meta ID
	MetaId *string `json:"meta_id,omitempty" xml:"meta_id,omitempty" require:"true"`
	// 索引类型， interface 为合约方法及输入输出； event 为合约Logs; deposit 为原生存证
	IndexType *string `json:"index_type,omitempty" xml:"index_type,omitempty" require:"true"`
}

func (s GetDatasearchIndexRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDatasearchIndexRequest) GoString() string {
	return s.String()
}

func (s *GetDatasearchIndexRequest) SetAuthToken(v string) *GetDatasearchIndexRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDatasearchIndexRequest) SetProductInstanceId(v string) *GetDatasearchIndexRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetDatasearchIndexRequest) SetTenantId(v string) *GetDatasearchIndexRequest {
	s.TenantId = &v
	return s
}

func (s *GetDatasearchIndexRequest) SetBizId(v string) *GetDatasearchIndexRequest {
	s.BizId = &v
	return s
}

func (s *GetDatasearchIndexRequest) SetMetaId(v string) *GetDatasearchIndexRequest {
	s.MetaId = &v
	return s
}

func (s *GetDatasearchIndexRequest) SetIndexType(v string) *GetDatasearchIndexRequest {
	s.IndexType = &v
	return s
}

type GetDatasearchIndexResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 索引的索引进度（块高）
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
}

func (s GetDatasearchIndexResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDatasearchIndexResponse) GoString() string {
	return s.String()
}

func (s *GetDatasearchIndexResponse) SetReqMsgId(v string) *GetDatasearchIndexResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDatasearchIndexResponse) SetResultCode(v string) *GetDatasearchIndexResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDatasearchIndexResponse) SetResultMsg(v string) *GetDatasearchIndexResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDatasearchIndexResponse) SetStatus(v int64) *GetDatasearchIndexResponse {
	s.Status = &v
	return s
}

type ListContractmetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户唯一标识符（租户ID）
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 链唯一标识符
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 合约 hex 编码的地址, 留空表示所有合约
	ContractAddr *string `json:"contract_addr,omitempty" xml:"contract_addr,omitempty"`
}

func (s ListContractmetaRequest) String() string {
	return tea.Prettify(s)
}

func (s ListContractmetaRequest) GoString() string {
	return s.String()
}

func (s *ListContractmetaRequest) SetAuthToken(v string) *ListContractmetaRequest {
	s.AuthToken = &v
	return s
}

func (s *ListContractmetaRequest) SetProductInstanceId(v string) *ListContractmetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListContractmetaRequest) SetTenantId(v string) *ListContractmetaRequest {
	s.TenantId = &v
	return s
}

func (s *ListContractmetaRequest) SetBizId(v string) *ListContractmetaRequest {
	s.BizId = &v
	return s
}

func (s *ListContractmetaRequest) SetContractAddr(v string) *ListContractmetaRequest {
	s.ContractAddr = &v
	return s
}

type ListContractmetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 合约Meta列表
	Metas []*ContractMeta `json:"metas,omitempty" xml:"metas,omitempty" type:"Repeated"`
}

func (s ListContractmetaResponse) String() string {
	return tea.Prettify(s)
}

func (s ListContractmetaResponse) GoString() string {
	return s.String()
}

func (s *ListContractmetaResponse) SetReqMsgId(v string) *ListContractmetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListContractmetaResponse) SetResultCode(v string) *ListContractmetaResponse {
	s.ResultCode = &v
	return s
}

func (s *ListContractmetaResponse) SetResultMsg(v string) *ListContractmetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListContractmetaResponse) SetMetas(v []*ContractMeta) *ListContractmetaResponse {
	s.Metas = v
	return s
}

type AddContractmetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户唯一标识符（租户ID）
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 链唯一标识符
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 合约Meta
	Meta *ContractMeta `json:"meta,omitempty" xml:"meta,omitempty" require:"true"`
}

func (s AddContractmetaRequest) String() string {
	return tea.Prettify(s)
}

func (s AddContractmetaRequest) GoString() string {
	return s.String()
}

func (s *AddContractmetaRequest) SetAuthToken(v string) *AddContractmetaRequest {
	s.AuthToken = &v
	return s
}

func (s *AddContractmetaRequest) SetProductInstanceId(v string) *AddContractmetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddContractmetaRequest) SetTenantId(v string) *AddContractmetaRequest {
	s.TenantId = &v
	return s
}

func (s *AddContractmetaRequest) SetBizId(v string) *AddContractmetaRequest {
	s.BizId = &v
	return s
}

func (s *AddContractmetaRequest) SetMeta(v *ContractMeta) *AddContractmetaRequest {
	s.Meta = v
	return s
}

type AddContractmetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 合约Meta
	Meta *ContractMeta `json:"meta,omitempty" xml:"meta,omitempty"`
}

func (s AddContractmetaResponse) String() string {
	return tea.Prettify(s)
}

func (s AddContractmetaResponse) GoString() string {
	return s.String()
}

func (s *AddContractmetaResponse) SetReqMsgId(v string) *AddContractmetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddContractmetaResponse) SetResultCode(v string) *AddContractmetaResponse {
	s.ResultCode = &v
	return s
}

func (s *AddContractmetaResponse) SetResultMsg(v string) *AddContractmetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddContractmetaResponse) SetMeta(v *ContractMeta) *AddContractmetaResponse {
	s.Meta = v
	return s
}

type DeleteContractmetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户唯一标识符（租户ID）
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 链唯一标识符
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 要删除的合约MetaID
	MetaId *int64 `json:"meta_id,omitempty" xml:"meta_id,omitempty" require:"true"`
}

func (s DeleteContractmetaRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteContractmetaRequest) GoString() string {
	return s.String()
}

func (s *DeleteContractmetaRequest) SetAuthToken(v string) *DeleteContractmetaRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteContractmetaRequest) SetProductInstanceId(v string) *DeleteContractmetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteContractmetaRequest) SetTenantId(v string) *DeleteContractmetaRequest {
	s.TenantId = &v
	return s
}

func (s *DeleteContractmetaRequest) SetBizId(v string) *DeleteContractmetaRequest {
	s.BizId = &v
	return s
}

func (s *DeleteContractmetaRequest) SetMetaId(v int64) *DeleteContractmetaRequest {
	s.MetaId = &v
	return s
}

type DeleteContractmetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteContractmetaResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteContractmetaResponse) GoString() string {
	return s.String()
}

func (s *DeleteContractmetaResponse) SetReqMsgId(v string) *DeleteContractmetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteContractmetaResponse) SetResultCode(v string) *DeleteContractmetaResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteContractmetaResponse) SetResultMsg(v string) *DeleteContractmetaResponse {
	s.ResultMsg = &v
	return s
}

type GetContractmetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户唯一标识符（租户ID）
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 链唯一标识符
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 合约MetaId
	MetaId *int64 `json:"meta_id,omitempty" xml:"meta_id,omitempty" require:"true"`
}

func (s GetContractmetaRequest) String() string {
	return tea.Prettify(s)
}

func (s GetContractmetaRequest) GoString() string {
	return s.String()
}

func (s *GetContractmetaRequest) SetAuthToken(v string) *GetContractmetaRequest {
	s.AuthToken = &v
	return s
}

func (s *GetContractmetaRequest) SetProductInstanceId(v string) *GetContractmetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetContractmetaRequest) SetTenantId(v string) *GetContractmetaRequest {
	s.TenantId = &v
	return s
}

func (s *GetContractmetaRequest) SetBizId(v string) *GetContractmetaRequest {
	s.BizId = &v
	return s
}

func (s *GetContractmetaRequest) SetMetaId(v int64) *GetContractmetaRequest {
	s.MetaId = &v
	return s
}

type GetContractmetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 合约Meta
	Meta *ContractMeta `json:"meta,omitempty" xml:"meta,omitempty"`
}

func (s GetContractmetaResponse) String() string {
	return tea.Prettify(s)
}

func (s GetContractmetaResponse) GoString() string {
	return s.String()
}

func (s *GetContractmetaResponse) SetReqMsgId(v string) *GetContractmetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetContractmetaResponse) SetResultCode(v string) *GetContractmetaResponse {
	s.ResultCode = &v
	return s
}

func (s *GetContractmetaResponse) SetResultMsg(v string) *GetContractmetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetContractmetaResponse) SetMeta(v *ContractMeta) *GetContractmetaResponse {
	s.Meta = v
	return s
}

type CreateDataexportPreviewdataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户唯一标识符（租户ID）
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 链唯一标识符
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 任务配置
	Trigger *Trigger `json:"trigger,omitempty" xml:"trigger,omitempty" require:"true"`
}

func (s CreateDataexportPreviewdataRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDataexportPreviewdataRequest) GoString() string {
	return s.String()
}

func (s *CreateDataexportPreviewdataRequest) SetAuthToken(v string) *CreateDataexportPreviewdataRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDataexportPreviewdataRequest) SetProductInstanceId(v string) *CreateDataexportPreviewdataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDataexportPreviewdataRequest) SetTenantId(v string) *CreateDataexportPreviewdataRequest {
	s.TenantId = &v
	return s
}

func (s *CreateDataexportPreviewdataRequest) SetBizId(v string) *CreateDataexportPreviewdataRequest {
	s.BizId = &v
	return s
}

func (s *CreateDataexportPreviewdataRequest) SetTrigger(v *Trigger) *CreateDataexportPreviewdataRequest {
	s.Trigger = v
	return s
}

type CreateDataexportPreviewdataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 异步任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
}

func (s CreateDataexportPreviewdataResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDataexportPreviewdataResponse) GoString() string {
	return s.String()
}

func (s *CreateDataexportPreviewdataResponse) SetReqMsgId(v string) *CreateDataexportPreviewdataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDataexportPreviewdataResponse) SetResultCode(v string) *CreateDataexportPreviewdataResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDataexportPreviewdataResponse) SetResultMsg(v string) *CreateDataexportPreviewdataResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDataexportPreviewdataResponse) SetTaskId(v string) *CreateDataexportPreviewdataResponse {
	s.TaskId = &v
	return s
}

type QueryDataexportPreviewdataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户唯一标识符（租户ID）
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 链唯一标识符
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 异步任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryDataexportPreviewdataRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDataexportPreviewdataRequest) GoString() string {
	return s.String()
}

func (s *QueryDataexportPreviewdataRequest) SetAuthToken(v string) *QueryDataexportPreviewdataRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDataexportPreviewdataRequest) SetProductInstanceId(v string) *QueryDataexportPreviewdataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDataexportPreviewdataRequest) SetTenantId(v string) *QueryDataexportPreviewdataRequest {
	s.TenantId = &v
	return s
}

func (s *QueryDataexportPreviewdataRequest) SetBizId(v string) *QueryDataexportPreviewdataRequest {
	s.BizId = &v
	return s
}

func (s *QueryDataexportPreviewdataRequest) SetTaskId(v string) *QueryDataexportPreviewdataRequest {
	s.TaskId = &v
	return s
}

type QueryDataexportPreviewdataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预览数据
	Data []*string `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryDataexportPreviewdataResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDataexportPreviewdataResponse) GoString() string {
	return s.String()
}

func (s *QueryDataexportPreviewdataResponse) SetReqMsgId(v string) *QueryDataexportPreviewdataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDataexportPreviewdataResponse) SetResultCode(v string) *QueryDataexportPreviewdataResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDataexportPreviewdataResponse) SetResultMsg(v string) *QueryDataexportPreviewdataResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDataexportPreviewdataResponse) SetData(v []*string) *QueryDataexportPreviewdataResponse {
	s.Data = v
	return s
}

type GetDataexportPreviewsmappingRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户唯一标识符（租户ID）
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 链唯一标识符
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 获取的映射类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 预览返回的数据
	Data []*string `json:"data,omitempty" xml:"data,omitempty" require:"true" type:"Repeated"`
}

func (s GetDataexportPreviewsmappingRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDataexportPreviewsmappingRequest) GoString() string {
	return s.String()
}

func (s *GetDataexportPreviewsmappingRequest) SetAuthToken(v string) *GetDataexportPreviewsmappingRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDataexportPreviewsmappingRequest) SetProductInstanceId(v string) *GetDataexportPreviewsmappingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetDataexportPreviewsmappingRequest) SetTenantId(v string) *GetDataexportPreviewsmappingRequest {
	s.TenantId = &v
	return s
}

func (s *GetDataexportPreviewsmappingRequest) SetBizId(v string) *GetDataexportPreviewsmappingRequest {
	s.BizId = &v
	return s
}

func (s *GetDataexportPreviewsmappingRequest) SetType(v string) *GetDataexportPreviewsmappingRequest {
	s.Type = &v
	return s
}

func (s *GetDataexportPreviewsmappingRequest) SetData(v []*string) *GetDataexportPreviewsmappingRequest {
	s.Data = v
	return s
}

type GetDataexportPreviewsmappingResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 映射关系列表
	Data []*DataExportTableField `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s GetDataexportPreviewsmappingResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDataexportPreviewsmappingResponse) GoString() string {
	return s.String()
}

func (s *GetDataexportPreviewsmappingResponse) SetReqMsgId(v string) *GetDataexportPreviewsmappingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDataexportPreviewsmappingResponse) SetResultCode(v string) *GetDataexportPreviewsmappingResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDataexportPreviewsmappingResponse) SetResultMsg(v string) *GetDataexportPreviewsmappingResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDataexportPreviewsmappingResponse) SetData(v []*DataExportTableField) *GetDataexportPreviewsmappingResponse {
	s.Data = v
	return s
}

type CreateDataexportTriggerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户唯一标识符（租户ID）
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 链唯一标识符
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 导出任务
	Trigger *Trigger `json:"trigger,omitempty" xml:"trigger,omitempty" require:"true"`
}

func (s CreateDataexportTriggerRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDataexportTriggerRequest) GoString() string {
	return s.String()
}

func (s *CreateDataexportTriggerRequest) SetAuthToken(v string) *CreateDataexportTriggerRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDataexportTriggerRequest) SetProductInstanceId(v string) *CreateDataexportTriggerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDataexportTriggerRequest) SetTenantId(v string) *CreateDataexportTriggerRequest {
	s.TenantId = &v
	return s
}

func (s *CreateDataexportTriggerRequest) SetBizId(v string) *CreateDataexportTriggerRequest {
	s.BizId = &v
	return s
}

func (s *CreateDataexportTriggerRequest) SetTrigger(v *Trigger) *CreateDataexportTriggerRequest {
	s.Trigger = v
	return s
}

type CreateDataexportTriggerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateDataexportTriggerResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDataexportTriggerResponse) GoString() string {
	return s.String()
}

func (s *CreateDataexportTriggerResponse) SetReqMsgId(v string) *CreateDataexportTriggerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDataexportTriggerResponse) SetResultCode(v string) *CreateDataexportTriggerResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDataexportTriggerResponse) SetResultMsg(v string) *CreateDataexportTriggerResponse {
	s.ResultMsg = &v
	return s
}

type QueryDataexportPreviewsqlRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// -
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// -
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// -
	Trigger *Trigger `json:"trigger,omitempty" xml:"trigger,omitempty" require:"true"`
}

func (s QueryDataexportPreviewsqlRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDataexportPreviewsqlRequest) GoString() string {
	return s.String()
}

func (s *QueryDataexportPreviewsqlRequest) SetAuthToken(v string) *QueryDataexportPreviewsqlRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDataexportPreviewsqlRequest) SetProductInstanceId(v string) *QueryDataexportPreviewsqlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDataexportPreviewsqlRequest) SetTenantId(v string) *QueryDataexportPreviewsqlRequest {
	s.TenantId = &v
	return s
}

func (s *QueryDataexportPreviewsqlRequest) SetBizId(v string) *QueryDataexportPreviewsqlRequest {
	s.BizId = &v
	return s
}

func (s *QueryDataexportPreviewsqlRequest) SetTrigger(v *Trigger) *QueryDataexportPreviewsqlRequest {
	s.Trigger = v
	return s
}

type QueryDataexportPreviewsqlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 创建表的SQL语句
	Sql *string `json:"sql,omitempty" xml:"sql,omitempty"`
}

func (s QueryDataexportPreviewsqlResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDataexportPreviewsqlResponse) GoString() string {
	return s.String()
}

func (s *QueryDataexportPreviewsqlResponse) SetReqMsgId(v string) *QueryDataexportPreviewsqlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDataexportPreviewsqlResponse) SetResultCode(v string) *QueryDataexportPreviewsqlResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDataexportPreviewsqlResponse) SetResultMsg(v string) *QueryDataexportPreviewsqlResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDataexportPreviewsqlResponse) SetSql(v string) *QueryDataexportPreviewsqlResponse {
	s.Sql = &v
	return s
}

type ListDataexportTriggerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// -
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// -
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
}

func (s ListDataexportTriggerRequest) String() string {
	return tea.Prettify(s)
}

func (s ListDataexportTriggerRequest) GoString() string {
	return s.String()
}

func (s *ListDataexportTriggerRequest) SetAuthToken(v string) *ListDataexportTriggerRequest {
	s.AuthToken = &v
	return s
}

func (s *ListDataexportTriggerRequest) SetProductInstanceId(v string) *ListDataexportTriggerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListDataexportTriggerRequest) SetTenantId(v string) *ListDataexportTriggerRequest {
	s.TenantId = &v
	return s
}

func (s *ListDataexportTriggerRequest) SetBizId(v string) *ListDataexportTriggerRequest {
	s.BizId = &v
	return s
}

type ListDataexportTriggerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// -
	Triggers []*Trigger `json:"triggers,omitempty" xml:"triggers,omitempty" type:"Repeated"`
}

func (s ListDataexportTriggerResponse) String() string {
	return tea.Prettify(s)
}

func (s ListDataexportTriggerResponse) GoString() string {
	return s.String()
}

func (s *ListDataexportTriggerResponse) SetReqMsgId(v string) *ListDataexportTriggerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListDataexportTriggerResponse) SetResultCode(v string) *ListDataexportTriggerResponse {
	s.ResultCode = &v
	return s
}

func (s *ListDataexportTriggerResponse) SetResultMsg(v string) *ListDataexportTriggerResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListDataexportTriggerResponse) SetTriggers(v []*Trigger) *ListDataexportTriggerResponse {
	s.Triggers = v
	return s
}

type OperateDataexportTriggerstatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// -
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// -
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 导出任务ID
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 操作
	Action *string `json:"action,omitempty" xml:"action,omitempty" require:"true"`
}

func (s OperateDataexportTriggerstatusRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateDataexportTriggerstatusRequest) GoString() string {
	return s.String()
}

func (s *OperateDataexportTriggerstatusRequest) SetAuthToken(v string) *OperateDataexportTriggerstatusRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateDataexportTriggerstatusRequest) SetProductInstanceId(v string) *OperateDataexportTriggerstatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateDataexportTriggerstatusRequest) SetTenantId(v string) *OperateDataexportTriggerstatusRequest {
	s.TenantId = &v
	return s
}

func (s *OperateDataexportTriggerstatusRequest) SetBizId(v string) *OperateDataexportTriggerstatusRequest {
	s.BizId = &v
	return s
}

func (s *OperateDataexportTriggerstatusRequest) SetName(v string) *OperateDataexportTriggerstatusRequest {
	s.Name = &v
	return s
}

func (s *OperateDataexportTriggerstatusRequest) SetAction(v string) *OperateDataexportTriggerstatusRequest {
	s.Action = &v
	return s
}

type OperateDataexportTriggerstatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// -
	Trigger *Trigger `json:"trigger,omitempty" xml:"trigger,omitempty"`
}

func (s OperateDataexportTriggerstatusResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateDataexportTriggerstatusResponse) GoString() string {
	return s.String()
}

func (s *OperateDataexportTriggerstatusResponse) SetReqMsgId(v string) *OperateDataexportTriggerstatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateDataexportTriggerstatusResponse) SetResultCode(v string) *OperateDataexportTriggerstatusResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateDataexportTriggerstatusResponse) SetResultMsg(v string) *OperateDataexportTriggerstatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateDataexportTriggerstatusResponse) SetTrigger(v *Trigger) *OperateDataexportTriggerstatusResponse {
	s.Trigger = v
	return s
}

type OperateDataexportTriggerconfigRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// -
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// -
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 导出任务ID
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// -
	Trigger *Trigger `json:"trigger,omitempty" xml:"trigger,omitempty" require:"true"`
}

func (s OperateDataexportTriggerconfigRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateDataexportTriggerconfigRequest) GoString() string {
	return s.String()
}

func (s *OperateDataexportTriggerconfigRequest) SetAuthToken(v string) *OperateDataexportTriggerconfigRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateDataexportTriggerconfigRequest) SetProductInstanceId(v string) *OperateDataexportTriggerconfigRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateDataexportTriggerconfigRequest) SetTenantId(v string) *OperateDataexportTriggerconfigRequest {
	s.TenantId = &v
	return s
}

func (s *OperateDataexportTriggerconfigRequest) SetBizId(v string) *OperateDataexportTriggerconfigRequest {
	s.BizId = &v
	return s
}

func (s *OperateDataexportTriggerconfigRequest) SetName(v string) *OperateDataexportTriggerconfigRequest {
	s.Name = &v
	return s
}

func (s *OperateDataexportTriggerconfigRequest) SetTrigger(v *Trigger) *OperateDataexportTriggerconfigRequest {
	s.Trigger = v
	return s
}

type OperateDataexportTriggerconfigResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// -
	Trigger *Trigger `json:"trigger,omitempty" xml:"trigger,omitempty"`
}

func (s OperateDataexportTriggerconfigResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateDataexportTriggerconfigResponse) GoString() string {
	return s.String()
}

func (s *OperateDataexportTriggerconfigResponse) SetReqMsgId(v string) *OperateDataexportTriggerconfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateDataexportTriggerconfigResponse) SetResultCode(v string) *OperateDataexportTriggerconfigResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateDataexportTriggerconfigResponse) SetResultMsg(v string) *OperateDataexportTriggerconfigResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateDataexportTriggerconfigResponse) SetTrigger(v *Trigger) *OperateDataexportTriggerconfigResponse {
	s.Trigger = v
	return s
}

type ListDataexportTriggerlogRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// biz_id
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 导出任务ID
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 状态过滤条件
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// -
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty"`
	// -
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s ListDataexportTriggerlogRequest) String() string {
	return tea.Prettify(s)
}

func (s ListDataexportTriggerlogRequest) GoString() string {
	return s.String()
}

func (s *ListDataexportTriggerlogRequest) SetAuthToken(v string) *ListDataexportTriggerlogRequest {
	s.AuthToken = &v
	return s
}

func (s *ListDataexportTriggerlogRequest) SetProductInstanceId(v string) *ListDataexportTriggerlogRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListDataexportTriggerlogRequest) SetTenantId(v string) *ListDataexportTriggerlogRequest {
	s.TenantId = &v
	return s
}

func (s *ListDataexportTriggerlogRequest) SetBizId(v string) *ListDataexportTriggerlogRequest {
	s.BizId = &v
	return s
}

func (s *ListDataexportTriggerlogRequest) SetName(v string) *ListDataexportTriggerlogRequest {
	s.Name = &v
	return s
}

func (s *ListDataexportTriggerlogRequest) SetAction(v string) *ListDataexportTriggerlogRequest {
	s.Action = &v
	return s
}

func (s *ListDataexportTriggerlogRequest) SetPageNo(v int64) *ListDataexportTriggerlogRequest {
	s.PageNo = &v
	return s
}

func (s *ListDataexportTriggerlogRequest) SetPageSize(v int64) *ListDataexportTriggerlogRequest {
	s.PageSize = &v
	return s
}

type ListDataexportTriggerlogResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// -
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// -
	Current *int64 `json:"current,omitempty" xml:"current,omitempty"`
	// -
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// -
	List []*TriggerLog `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
}

func (s ListDataexportTriggerlogResponse) String() string {
	return tea.Prettify(s)
}

func (s ListDataexportTriggerlogResponse) GoString() string {
	return s.String()
}

func (s *ListDataexportTriggerlogResponse) SetReqMsgId(v string) *ListDataexportTriggerlogResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListDataexportTriggerlogResponse) SetResultCode(v string) *ListDataexportTriggerlogResponse {
	s.ResultCode = &v
	return s
}

func (s *ListDataexportTriggerlogResponse) SetResultMsg(v string) *ListDataexportTriggerlogResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListDataexportTriggerlogResponse) SetPageSize(v int64) *ListDataexportTriggerlogResponse {
	s.PageSize = &v
	return s
}

func (s *ListDataexportTriggerlogResponse) SetCurrent(v int64) *ListDataexportTriggerlogResponse {
	s.Current = &v
	return s
}

func (s *ListDataexportTriggerlogResponse) SetTotal(v int64) *ListDataexportTriggerlogResponse {
	s.Total = &v
	return s
}

func (s *ListDataexportTriggerlogResponse) SetList(v []*TriggerLog) *ListDataexportTriggerlogResponse {
	s.List = v
	return s
}

type OperateDataexportTriggerlogRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// biz_id
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 导出任务ID
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 操作
	Action *string `json:"action,omitempty" xml:"action,omitempty" require:"true"`
	// 导出任务日志ID列表
	Logs []*string `json:"logs,omitempty" xml:"logs,omitempty" require:"true" type:"Repeated"`
}

func (s OperateDataexportTriggerlogRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateDataexportTriggerlogRequest) GoString() string {
	return s.String()
}

func (s *OperateDataexportTriggerlogRequest) SetAuthToken(v string) *OperateDataexportTriggerlogRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateDataexportTriggerlogRequest) SetProductInstanceId(v string) *OperateDataexportTriggerlogRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateDataexportTriggerlogRequest) SetTenantId(v string) *OperateDataexportTriggerlogRequest {
	s.TenantId = &v
	return s
}

func (s *OperateDataexportTriggerlogRequest) SetBizId(v string) *OperateDataexportTriggerlogRequest {
	s.BizId = &v
	return s
}

func (s *OperateDataexportTriggerlogRequest) SetName(v string) *OperateDataexportTriggerlogRequest {
	s.Name = &v
	return s
}

func (s *OperateDataexportTriggerlogRequest) SetAction(v string) *OperateDataexportTriggerlogRequest {
	s.Action = &v
	return s
}

func (s *OperateDataexportTriggerlogRequest) SetLogs(v []*string) *OperateDataexportTriggerlogRequest {
	s.Logs = v
	return s
}

type OperateDataexportTriggerlogResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s OperateDataexportTriggerlogResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateDataexportTriggerlogResponse) GoString() string {
	return s.String()
}

func (s *OperateDataexportTriggerlogResponse) SetReqMsgId(v string) *OperateDataexportTriggerlogResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateDataexportTriggerlogResponse) SetResultCode(v string) *OperateDataexportTriggerlogResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateDataexportTriggerlogResponse) SetResultMsg(v string) *OperateDataexportTriggerlogResponse {
	s.ResultMsg = &v
	return s
}

type QueryChaininsightLabelsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 需要查询的地址列表
	HexAddresses []*string `json:"hex_addresses,omitempty" xml:"hex_addresses,omitempty" require:"true" type:"Repeated"`
	// 租户ID，留空
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s QueryChaininsightLabelsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightLabelsRequest) GoString() string {
	return s.String()
}

func (s *QueryChaininsightLabelsRequest) SetAuthToken(v string) *QueryChaininsightLabelsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryChaininsightLabelsRequest) SetProductInstanceId(v string) *QueryChaininsightLabelsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryChaininsightLabelsRequest) SetBizId(v string) *QueryChaininsightLabelsRequest {
	s.BizId = &v
	return s
}

func (s *QueryChaininsightLabelsRequest) SetHexAddresses(v []*string) *QueryChaininsightLabelsRequest {
	s.HexAddresses = v
	return s
}

func (s *QueryChaininsightLabelsRequest) SetTenantId(v string) *QueryChaininsightLabelsRequest {
	s.TenantId = &v
	return s
}

type QueryChaininsightLabelsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 地址的标签信息
	Result []*ChainInsightAddressLabel `json:"result,omitempty" xml:"result,omitempty" type:"Repeated"`
}

func (s QueryChaininsightLabelsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightLabelsResponse) GoString() string {
	return s.String()
}

func (s *QueryChaininsightLabelsResponse) SetReqMsgId(v string) *QueryChaininsightLabelsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryChaininsightLabelsResponse) SetResultCode(v string) *QueryChaininsightLabelsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryChaininsightLabelsResponse) SetResultMsg(v string) *QueryChaininsightLabelsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryChaininsightLabelsResponse) SetResult(v []*ChainInsightAddressLabel) *QueryChaininsightLabelsResponse {
	s.Result = v
	return s
}

type UpdateChaininsightLabelsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 链上地址
	HexAddress *string `json:"hex_address,omitempty" xml:"hex_address,omitempty" require:"true"`
	// 更新的 label 内容
	Label *ChainInsightAddressLabel `json:"label,omitempty" xml:"label,omitempty" require:"true"`
	// 租户ID，留空
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s UpdateChaininsightLabelsRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateChaininsightLabelsRequest) GoString() string {
	return s.String()
}

func (s *UpdateChaininsightLabelsRequest) SetAuthToken(v string) *UpdateChaininsightLabelsRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateChaininsightLabelsRequest) SetProductInstanceId(v string) *UpdateChaininsightLabelsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateChaininsightLabelsRequest) SetBizId(v string) *UpdateChaininsightLabelsRequest {
	s.BizId = &v
	return s
}

func (s *UpdateChaininsightLabelsRequest) SetHexAddress(v string) *UpdateChaininsightLabelsRequest {
	s.HexAddress = &v
	return s
}

func (s *UpdateChaininsightLabelsRequest) SetLabel(v *ChainInsightAddressLabel) *UpdateChaininsightLabelsRequest {
	s.Label = v
	return s
}

func (s *UpdateChaininsightLabelsRequest) SetTenantId(v string) *UpdateChaininsightLabelsRequest {
	s.TenantId = &v
	return s
}

type UpdateChaininsightLabelsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s UpdateChaininsightLabelsResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateChaininsightLabelsResponse) GoString() string {
	return s.String()
}

func (s *UpdateChaininsightLabelsResponse) SetReqMsgId(v string) *UpdateChaininsightLabelsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateChaininsightLabelsResponse) SetResultCode(v string) *UpdateChaininsightLabelsResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateChaininsightLabelsResponse) SetResultMsg(v string) *UpdateChaininsightLabelsResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateChaininsightLabelsResponse) SetResult(v string) *UpdateChaininsightLabelsResponse {
	s.Result = &v
	return s
}

type QueryChaininsightSearchRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟ID
	UnionId *string `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 需要搜索的链ID列表，为空是表示搜索联盟内的所有链
	BizIds []*string `json:"biz_ids,omitempty" xml:"biz_ids,omitempty" type:"Repeated"`
	// 搜索请求
	Request *ChainInsightSearchRequest `json:"request,omitempty" xml:"request,omitempty" require:"true"`
	// 租户ID，留空
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s QueryChaininsightSearchRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightSearchRequest) GoString() string {
	return s.String()
}

func (s *QueryChaininsightSearchRequest) SetAuthToken(v string) *QueryChaininsightSearchRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryChaininsightSearchRequest) SetProductInstanceId(v string) *QueryChaininsightSearchRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryChaininsightSearchRequest) SetUnionId(v string) *QueryChaininsightSearchRequest {
	s.UnionId = &v
	return s
}

func (s *QueryChaininsightSearchRequest) SetBizIds(v []*string) *QueryChaininsightSearchRequest {
	s.BizIds = v
	return s
}

func (s *QueryChaininsightSearchRequest) SetRequest(v *ChainInsightSearchRequest) *QueryChaininsightSearchRequest {
	s.Request = v
	return s
}

func (s *QueryChaininsightSearchRequest) SetTenantId(v string) *QueryChaininsightSearchRequest {
	s.TenantId = &v
	return s
}

type QueryChaininsightSearchResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 搜索结果
	Result *ChainInsightSearchResponse `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryChaininsightSearchResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightSearchResponse) GoString() string {
	return s.String()
}

func (s *QueryChaininsightSearchResponse) SetReqMsgId(v string) *QueryChaininsightSearchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryChaininsightSearchResponse) SetResultCode(v string) *QueryChaininsightSearchResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryChaininsightSearchResponse) SetResultMsg(v string) *QueryChaininsightSearchResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryChaininsightSearchResponse) SetResult(v *ChainInsightSearchResponse) *QueryChaininsightSearchResponse {
	s.Result = v
	return s
}

type QueryChaininsightAddressRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 链上地址
	HexAddress *string `json:"hex_address,omitempty" xml:"hex_address,omitempty" require:"true"`
	// 租户ID，留空
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s QueryChaininsightAddressRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightAddressRequest) GoString() string {
	return s.String()
}

func (s *QueryChaininsightAddressRequest) SetAuthToken(v string) *QueryChaininsightAddressRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryChaininsightAddressRequest) SetProductInstanceId(v string) *QueryChaininsightAddressRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryChaininsightAddressRequest) SetBizId(v string) *QueryChaininsightAddressRequest {
	s.BizId = &v
	return s
}

func (s *QueryChaininsightAddressRequest) SetHexAddress(v string) *QueryChaininsightAddressRequest {
	s.HexAddress = &v
	return s
}

func (s *QueryChaininsightAddressRequest) SetTenantId(v string) *QueryChaininsightAddressRequest {
	s.TenantId = &v
	return s
}

type QueryChaininsightAddressResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *ChainInsightAddress `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryChaininsightAddressResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightAddressResponse) GoString() string {
	return s.String()
}

func (s *QueryChaininsightAddressResponse) SetReqMsgId(v string) *QueryChaininsightAddressResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryChaininsightAddressResponse) SetResultCode(v string) *QueryChaininsightAddressResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryChaininsightAddressResponse) SetResultMsg(v string) *QueryChaininsightAddressResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryChaininsightAddressResponse) SetResult(v *ChainInsightAddress) *QueryChaininsightAddressResponse {
	s.Result = v
	return s
}

type QueryChaininsightTransactionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 交易ID
	TxId *string `json:"tx_id,omitempty" xml:"tx_id,omitempty" require:"true"`
	// hex编码的TEE交易解密Key，留空表示不解密
	TeeKey *string `json:"tee_key,omitempty" xml:"tee_key,omitempty"`
	// 租户ID，留空
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s QueryChaininsightTransactionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightTransactionRequest) GoString() string {
	return s.String()
}

func (s *QueryChaininsightTransactionRequest) SetAuthToken(v string) *QueryChaininsightTransactionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryChaininsightTransactionRequest) SetProductInstanceId(v string) *QueryChaininsightTransactionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryChaininsightTransactionRequest) SetBizId(v string) *QueryChaininsightTransactionRequest {
	s.BizId = &v
	return s
}

func (s *QueryChaininsightTransactionRequest) SetTxId(v string) *QueryChaininsightTransactionRequest {
	s.TxId = &v
	return s
}

func (s *QueryChaininsightTransactionRequest) SetTeeKey(v string) *QueryChaininsightTransactionRequest {
	s.TeeKey = &v
	return s
}

func (s *QueryChaininsightTransactionRequest) SetTenantId(v string) *QueryChaininsightTransactionRequest {
	s.TenantId = &v
	return s
}

type QueryChaininsightTransactionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *ChainInsightTransaction `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryChaininsightTransactionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightTransactionResponse) GoString() string {
	return s.String()
}

func (s *QueryChaininsightTransactionResponse) SetReqMsgId(v string) *QueryChaininsightTransactionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryChaininsightTransactionResponse) SetResultCode(v string) *QueryChaininsightTransactionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryChaininsightTransactionResponse) SetResultMsg(v string) *QueryChaininsightTransactionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryChaininsightTransactionResponse) SetResult(v *ChainInsightTransaction) *QueryChaininsightTransactionResponse {
	s.Result = v
	return s
}

type QueryChaininsightBlockRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 区块高度
	Num *int64 `json:"num,omitempty" xml:"num,omitempty" require:"true"`
}

func (s QueryChaininsightBlockRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightBlockRequest) GoString() string {
	return s.String()
}

func (s *QueryChaininsightBlockRequest) SetAuthToken(v string) *QueryChaininsightBlockRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryChaininsightBlockRequest) SetProductInstanceId(v string) *QueryChaininsightBlockRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryChaininsightBlockRequest) SetBizId(v string) *QueryChaininsightBlockRequest {
	s.BizId = &v
	return s
}

func (s *QueryChaininsightBlockRequest) SetNum(v int64) *QueryChaininsightBlockRequest {
	s.Num = &v
	return s
}

type QueryChaininsightBlockResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *ChainInsightBlock `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryChaininsightBlockResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightBlockResponse) GoString() string {
	return s.String()
}

func (s *QueryChaininsightBlockResponse) SetReqMsgId(v string) *QueryChaininsightBlockResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryChaininsightBlockResponse) SetResultCode(v string) *QueryChaininsightBlockResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryChaininsightBlockResponse) SetResultMsg(v string) *QueryChaininsightBlockResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryChaininsightBlockResponse) SetResult(v *ChainInsightBlock) *QueryChaininsightBlockResponse {
	s.Result = v
	return s
}

type QueryChaininsightAddresslatesttxsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 链上地址
	HexAddress *string `json:"hex_address,omitempty" xml:"hex_address,omitempty" require:"true"`
	// 页码
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s QueryChaininsightAddresslatesttxsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightAddresslatesttxsRequest) GoString() string {
	return s.String()
}

func (s *QueryChaininsightAddresslatesttxsRequest) SetAuthToken(v string) *QueryChaininsightAddresslatesttxsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryChaininsightAddresslatesttxsRequest) SetProductInstanceId(v string) *QueryChaininsightAddresslatesttxsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryChaininsightAddresslatesttxsRequest) SetBizId(v string) *QueryChaininsightAddresslatesttxsRequest {
	s.BizId = &v
	return s
}

func (s *QueryChaininsightAddresslatesttxsRequest) SetHexAddress(v string) *QueryChaininsightAddresslatesttxsRequest {
	s.HexAddress = &v
	return s
}

func (s *QueryChaininsightAddresslatesttxsRequest) SetPageNo(v int64) *QueryChaininsightAddresslatesttxsRequest {
	s.PageNo = &v
	return s
}

func (s *QueryChaininsightAddresslatesttxsRequest) SetPageSize(v int64) *QueryChaininsightAddresslatesttxsRequest {
	s.PageSize = &v
	return s
}

type QueryChaininsightAddresslatesttxsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *ChainInsightAddressLatestTxsResponse `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryChaininsightAddresslatesttxsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightAddresslatesttxsResponse) GoString() string {
	return s.String()
}

func (s *QueryChaininsightAddresslatesttxsResponse) SetReqMsgId(v string) *QueryChaininsightAddresslatesttxsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryChaininsightAddresslatesttxsResponse) SetResultCode(v string) *QueryChaininsightAddresslatesttxsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryChaininsightAddresslatesttxsResponse) SetResultMsg(v string) *QueryChaininsightAddresslatesttxsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryChaininsightAddresslatesttxsResponse) SetResult(v *ChainInsightAddressLatestTxsResponse) *QueryChaininsightAddresslatesttxsResponse {
	s.Result = v
	return s
}

type ListChaininsightContractinterfaceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 链上地址
	HexAddress *string `json:"hex_address,omitempty" xml:"hex_address,omitempty" require:"true"`
	// 需要查询的版本信息，0表示最新
	Ver *string `json:"ver,omitempty" xml:"ver,omitempty" require:"true"`
	// 租户ID，留空
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s ListChaininsightContractinterfaceRequest) String() string {
	return tea.Prettify(s)
}

func (s ListChaininsightContractinterfaceRequest) GoString() string {
	return s.String()
}

func (s *ListChaininsightContractinterfaceRequest) SetAuthToken(v string) *ListChaininsightContractinterfaceRequest {
	s.AuthToken = &v
	return s
}

func (s *ListChaininsightContractinterfaceRequest) SetProductInstanceId(v string) *ListChaininsightContractinterfaceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListChaininsightContractinterfaceRequest) SetBizId(v string) *ListChaininsightContractinterfaceRequest {
	s.BizId = &v
	return s
}

func (s *ListChaininsightContractinterfaceRequest) SetHexAddress(v string) *ListChaininsightContractinterfaceRequest {
	s.HexAddress = &v
	return s
}

func (s *ListChaininsightContractinterfaceRequest) SetVer(v string) *ListChaininsightContractinterfaceRequest {
	s.Ver = &v
	return s
}

func (s *ListChaininsightContractinterfaceRequest) SetTenantId(v string) *ListChaininsightContractinterfaceRequest {
	s.TenantId = &v
	return s
}

type ListChaininsightContractinterfaceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result []*ChainInsightContractInterface `json:"result,omitempty" xml:"result,omitempty" type:"Repeated"`
}

func (s ListChaininsightContractinterfaceResponse) String() string {
	return tea.Prettify(s)
}

func (s ListChaininsightContractinterfaceResponse) GoString() string {
	return s.String()
}

func (s *ListChaininsightContractinterfaceResponse) SetReqMsgId(v string) *ListChaininsightContractinterfaceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListChaininsightContractinterfaceResponse) SetResultCode(v string) *ListChaininsightContractinterfaceResponse {
	s.ResultCode = &v
	return s
}

func (s *ListChaininsightContractinterfaceResponse) SetResultMsg(v string) *ListChaininsightContractinterfaceResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListChaininsightContractinterfaceResponse) SetResult(v []*ChainInsightContractInterface) *ListChaininsightContractinterfaceResponse {
	s.Result = v
	return s
}

type DetailChaininsightContractinterfaceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 链上地址
	HexAddress *string `json:"hex_address,omitempty" xml:"hex_address,omitempty" require:"true"`
	// 版本信息（块高）
	Ver *string `json:"ver,omitempty" xml:"ver,omitempty" require:"true"`
	// 接口
	ContractInterface *ChainInsightContractInterface `json:"contract_interface,omitempty" xml:"contract_interface,omitempty" require:"true"`
	// 租户ID，留空
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s DetailChaininsightContractinterfaceRequest) String() string {
	return tea.Prettify(s)
}

func (s DetailChaininsightContractinterfaceRequest) GoString() string {
	return s.String()
}

func (s *DetailChaininsightContractinterfaceRequest) SetAuthToken(v string) *DetailChaininsightContractinterfaceRequest {
	s.AuthToken = &v
	return s
}

func (s *DetailChaininsightContractinterfaceRequest) SetProductInstanceId(v string) *DetailChaininsightContractinterfaceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DetailChaininsightContractinterfaceRequest) SetBizId(v string) *DetailChaininsightContractinterfaceRequest {
	s.BizId = &v
	return s
}

func (s *DetailChaininsightContractinterfaceRequest) SetHexAddress(v string) *DetailChaininsightContractinterfaceRequest {
	s.HexAddress = &v
	return s
}

func (s *DetailChaininsightContractinterfaceRequest) SetVer(v string) *DetailChaininsightContractinterfaceRequest {
	s.Ver = &v
	return s
}

func (s *DetailChaininsightContractinterfaceRequest) SetContractInterface(v *ChainInsightContractInterface) *DetailChaininsightContractinterfaceRequest {
	s.ContractInterface = v
	return s
}

func (s *DetailChaininsightContractinterfaceRequest) SetTenantId(v string) *DetailChaininsightContractinterfaceRequest {
	s.TenantId = &v
	return s
}

type DetailChaininsightContractinterfaceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result []*ChainInsightContractInterfaceArgument `json:"result,omitempty" xml:"result,omitempty" type:"Repeated"`
}

func (s DetailChaininsightContractinterfaceResponse) String() string {
	return tea.Prettify(s)
}

func (s DetailChaininsightContractinterfaceResponse) GoString() string {
	return s.String()
}

func (s *DetailChaininsightContractinterfaceResponse) SetReqMsgId(v string) *DetailChaininsightContractinterfaceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DetailChaininsightContractinterfaceResponse) SetResultCode(v string) *DetailChaininsightContractinterfaceResponse {
	s.ResultCode = &v
	return s
}

func (s *DetailChaininsightContractinterfaceResponse) SetResultMsg(v string) *DetailChaininsightContractinterfaceResponse {
	s.ResultMsg = &v
	return s
}

func (s *DetailChaininsightContractinterfaceResponse) SetResult(v []*ChainInsightContractInterfaceArgument) *DetailChaininsightContractinterfaceResponse {
	s.Result = v
	return s
}

type UpdateChaininsightContractinterfaceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 链上地址
	HexAddress *string `json:"hex_address,omitempty" xml:"hex_address,omitempty" require:"true"`
	// 版本信息
	Ver *string `json:"ver,omitempty" xml:"ver,omitempty" require:"true"`
	// 接口信息
	ContractInterface *ChainInsightContractInterface `json:"contract_interface,omitempty" xml:"contract_interface,omitempty" require:"true"`
	// 新的接口参数信息
	InterfaceArgument *ChainInsightContractInterfaceArgument `json:"interface_argument,omitempty" xml:"interface_argument,omitempty" require:"true"`
	// 租户ID，留空
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s UpdateChaininsightContractinterfaceRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateChaininsightContractinterfaceRequest) GoString() string {
	return s.String()
}

func (s *UpdateChaininsightContractinterfaceRequest) SetAuthToken(v string) *UpdateChaininsightContractinterfaceRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateChaininsightContractinterfaceRequest) SetProductInstanceId(v string) *UpdateChaininsightContractinterfaceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateChaininsightContractinterfaceRequest) SetBizId(v string) *UpdateChaininsightContractinterfaceRequest {
	s.BizId = &v
	return s
}

func (s *UpdateChaininsightContractinterfaceRequest) SetHexAddress(v string) *UpdateChaininsightContractinterfaceRequest {
	s.HexAddress = &v
	return s
}

func (s *UpdateChaininsightContractinterfaceRequest) SetVer(v string) *UpdateChaininsightContractinterfaceRequest {
	s.Ver = &v
	return s
}

func (s *UpdateChaininsightContractinterfaceRequest) SetContractInterface(v *ChainInsightContractInterface) *UpdateChaininsightContractinterfaceRequest {
	s.ContractInterface = v
	return s
}

func (s *UpdateChaininsightContractinterfaceRequest) SetInterfaceArgument(v *ChainInsightContractInterfaceArgument) *UpdateChaininsightContractinterfaceRequest {
	s.InterfaceArgument = v
	return s
}

func (s *UpdateChaininsightContractinterfaceRequest) SetTenantId(v string) *UpdateChaininsightContractinterfaceRequest {
	s.TenantId = &v
	return s
}

type UpdateChaininsightContractinterfaceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s UpdateChaininsightContractinterfaceResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateChaininsightContractinterfaceResponse) GoString() string {
	return s.String()
}

func (s *UpdateChaininsightContractinterfaceResponse) SetReqMsgId(v string) *UpdateChaininsightContractinterfaceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateChaininsightContractinterfaceResponse) SetResultCode(v string) *UpdateChaininsightContractinterfaceResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateChaininsightContractinterfaceResponse) SetResultMsg(v string) *UpdateChaininsightContractinterfaceResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateChaininsightContractinterfaceResponse) SetResult(v string) *UpdateChaininsightContractinterfaceResponse {
	s.Result = &v
	return s
}

type UploadChaininsightAbiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 链上地址
	HexAddress *string `json:"hex_address,omitempty" xml:"hex_address,omitempty" require:"true"`
	// 对应的合约版本
	Ver *string `json:"ver,omitempty" xml:"ver,omitempty" require:"true"`
	// ABI文件原始内容
	File *string `json:"file,omitempty" xml:"file,omitempty" require:"true"`
	// 租户ID，留空
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s UploadChaininsightAbiRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadChaininsightAbiRequest) GoString() string {
	return s.String()
}

func (s *UploadChaininsightAbiRequest) SetAuthToken(v string) *UploadChaininsightAbiRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadChaininsightAbiRequest) SetProductInstanceId(v string) *UploadChaininsightAbiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadChaininsightAbiRequest) SetBizId(v string) *UploadChaininsightAbiRequest {
	s.BizId = &v
	return s
}

func (s *UploadChaininsightAbiRequest) SetHexAddress(v string) *UploadChaininsightAbiRequest {
	s.HexAddress = &v
	return s
}

func (s *UploadChaininsightAbiRequest) SetVer(v string) *UploadChaininsightAbiRequest {
	s.Ver = &v
	return s
}

func (s *UploadChaininsightAbiRequest) SetFile(v string) *UploadChaininsightAbiRequest {
	s.File = &v
	return s
}

func (s *UploadChaininsightAbiRequest) SetTenantId(v string) *UploadChaininsightAbiRequest {
	s.TenantId = &v
	return s
}

type UploadChaininsightAbiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s UploadChaininsightAbiResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadChaininsightAbiResponse) GoString() string {
	return s.String()
}

func (s *UploadChaininsightAbiResponse) SetReqMsgId(v string) *UploadChaininsightAbiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadChaininsightAbiResponse) SetResultCode(v string) *UploadChaininsightAbiResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadChaininsightAbiResponse) SetResultMsg(v string) *UploadChaininsightAbiResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadChaininsightAbiResponse) SetResult(v string) *UploadChaininsightAbiResponse {
	s.Result = &v
	return s
}

type QueryChaininsightAddresshistogramrxRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 地址
	HexAddress *string `json:"hex_address,omitempty" xml:"hex_address,omitempty" require:"true"`
	// 开始时间戳，毫秒
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true"`
	// 结束时间戳，毫秒
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true"`
	// 点集类型，枚举：Amount、Increment、GrowthRate，默认Amount
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s QueryChaininsightAddresshistogramrxRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightAddresshistogramrxRequest) GoString() string {
	return s.String()
}

func (s *QueryChaininsightAddresshistogramrxRequest) SetAuthToken(v string) *QueryChaininsightAddresshistogramrxRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryChaininsightAddresshistogramrxRequest) SetProductInstanceId(v string) *QueryChaininsightAddresshistogramrxRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryChaininsightAddresshistogramrxRequest) SetBizId(v string) *QueryChaininsightAddresshistogramrxRequest {
	s.BizId = &v
	return s
}

func (s *QueryChaininsightAddresshistogramrxRequest) SetHexAddress(v string) *QueryChaininsightAddresshistogramrxRequest {
	s.HexAddress = &v
	return s
}

func (s *QueryChaininsightAddresshistogramrxRequest) SetStartTime(v int64) *QueryChaininsightAddresshistogramrxRequest {
	s.StartTime = &v
	return s
}

func (s *QueryChaininsightAddresshistogramrxRequest) SetEndTime(v int64) *QueryChaininsightAddresshistogramrxRequest {
	s.EndTime = &v
	return s
}

func (s *QueryChaininsightAddresshistogramrxRequest) SetType(v string) *QueryChaininsightAddresshistogramrxRequest {
	s.Type = &v
	return s
}

type QueryChaininsightAddresshistogramrxResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *ChainInsightHistogram `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryChaininsightAddresshistogramrxResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightAddresshistogramrxResponse) GoString() string {
	return s.String()
}

func (s *QueryChaininsightAddresshistogramrxResponse) SetReqMsgId(v string) *QueryChaininsightAddresshistogramrxResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryChaininsightAddresshistogramrxResponse) SetResultCode(v string) *QueryChaininsightAddresshistogramrxResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryChaininsightAddresshistogramrxResponse) SetResultMsg(v string) *QueryChaininsightAddresshistogramrxResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryChaininsightAddresshistogramrxResponse) SetResult(v *ChainInsightHistogram) *QueryChaininsightAddresshistogramrxResponse {
	s.Result = v
	return s
}

type QueryChaininsightAddresshistogramtxRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 地址
	HexAddress *string `json:"hex_address,omitempty" xml:"hex_address,omitempty" require:"true"`
	// 开始时间戳
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true"`
	// 结束时间戳
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true"`
	// 点集类型，枚举：Amount、Increment、GrowthRate，默认Amount
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s QueryChaininsightAddresshistogramtxRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightAddresshistogramtxRequest) GoString() string {
	return s.String()
}

func (s *QueryChaininsightAddresshistogramtxRequest) SetAuthToken(v string) *QueryChaininsightAddresshistogramtxRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryChaininsightAddresshistogramtxRequest) SetProductInstanceId(v string) *QueryChaininsightAddresshistogramtxRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryChaininsightAddresshistogramtxRequest) SetBizId(v string) *QueryChaininsightAddresshistogramtxRequest {
	s.BizId = &v
	return s
}

func (s *QueryChaininsightAddresshistogramtxRequest) SetHexAddress(v string) *QueryChaininsightAddresshistogramtxRequest {
	s.HexAddress = &v
	return s
}

func (s *QueryChaininsightAddresshistogramtxRequest) SetStartTime(v int64) *QueryChaininsightAddresshistogramtxRequest {
	s.StartTime = &v
	return s
}

func (s *QueryChaininsightAddresshistogramtxRequest) SetEndTime(v int64) *QueryChaininsightAddresshistogramtxRequest {
	s.EndTime = &v
	return s
}

func (s *QueryChaininsightAddresshistogramtxRequest) SetType(v string) *QueryChaininsightAddresshistogramtxRequest {
	s.Type = &v
	return s
}

type QueryChaininsightAddresshistogramtxResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *ChainInsightHistogram `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryChaininsightAddresshistogramtxResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightAddresshistogramtxResponse) GoString() string {
	return s.String()
}

func (s *QueryChaininsightAddresshistogramtxResponse) SetReqMsgId(v string) *QueryChaininsightAddresshistogramtxResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryChaininsightAddresshistogramtxResponse) SetResultCode(v string) *QueryChaininsightAddresshistogramtxResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryChaininsightAddresshistogramtxResponse) SetResultMsg(v string) *QueryChaininsightAddresshistogramtxResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryChaininsightAddresshistogramtxResponse) SetResult(v *ChainInsightHistogram) *QueryChaininsightAddresshistogramtxResponse {
	s.Result = v
	return s
}

type QueryChaininsightChaintxhistogramRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟ID
	UnionId *string `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 链ID，可选；留空表示联盟内所有链
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 开始时间戳
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true"`
	// 结束时间戳
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true"`
	// 点集类型，枚举：Amount、Increment、GrowthRate，默认Amount
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s QueryChaininsightChaintxhistogramRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightChaintxhistogramRequest) GoString() string {
	return s.String()
}

func (s *QueryChaininsightChaintxhistogramRequest) SetAuthToken(v string) *QueryChaininsightChaintxhistogramRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryChaininsightChaintxhistogramRequest) SetProductInstanceId(v string) *QueryChaininsightChaintxhistogramRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryChaininsightChaintxhistogramRequest) SetUnionId(v string) *QueryChaininsightChaintxhistogramRequest {
	s.UnionId = &v
	return s
}

func (s *QueryChaininsightChaintxhistogramRequest) SetBizId(v string) *QueryChaininsightChaintxhistogramRequest {
	s.BizId = &v
	return s
}

func (s *QueryChaininsightChaintxhistogramRequest) SetStartTime(v int64) *QueryChaininsightChaintxhistogramRequest {
	s.StartTime = &v
	return s
}

func (s *QueryChaininsightChaintxhistogramRequest) SetEndTime(v int64) *QueryChaininsightChaintxhistogramRequest {
	s.EndTime = &v
	return s
}

func (s *QueryChaininsightChaintxhistogramRequest) SetType(v string) *QueryChaininsightChaintxhistogramRequest {
	s.Type = &v
	return s
}

type QueryChaininsightChaintxhistogramResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *ChainInsightHistogram `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryChaininsightChaintxhistogramResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightChaintxhistogramResponse) GoString() string {
	return s.String()
}

func (s *QueryChaininsightChaintxhistogramResponse) SetReqMsgId(v string) *QueryChaininsightChaintxhistogramResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryChaininsightChaintxhistogramResponse) SetResultCode(v string) *QueryChaininsightChaintxhistogramResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryChaininsightChaintxhistogramResponse) SetResultMsg(v string) *QueryChaininsightChaintxhistogramResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryChaininsightChaintxhistogramResponse) SetResult(v *ChainInsightHistogram) *QueryChaininsightChaintxhistogramResponse {
	s.Result = v
	return s
}

type BatchqueryChaininsightTransactionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s BatchqueryChaininsightTransactionRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryChaininsightTransactionRequest) GoString() string {
	return s.String()
}

func (s *BatchqueryChaininsightTransactionRequest) SetAuthToken(v string) *BatchqueryChaininsightTransactionRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchqueryChaininsightTransactionRequest) SetProductInstanceId(v string) *BatchqueryChaininsightTransactionRequest {
	s.ProductInstanceId = &v
	return s
}

type BatchqueryChaininsightTransactionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BatchqueryChaininsightTransactionResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryChaininsightTransactionResponse) GoString() string {
	return s.String()
}

func (s *BatchqueryChaininsightTransactionResponse) SetReqMsgId(v string) *BatchqueryChaininsightTransactionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchqueryChaininsightTransactionResponse) SetResultCode(v string) *BatchqueryChaininsightTransactionResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchqueryChaininsightTransactionResponse) SetResultMsg(v string) *BatchqueryChaininsightTransactionResponse {
	s.ResultMsg = &v
	return s
}

type ListChaininsightStatisticRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 统计类型，ContractStatistic：合约性能检测指标
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 合约地址
	HexAddress *string `json:"hex_address,omitempty" xml:"hex_address,omitempty"`
}

func (s ListChaininsightStatisticRequest) String() string {
	return tea.Prettify(s)
}

func (s ListChaininsightStatisticRequest) GoString() string {
	return s.String()
}

func (s *ListChaininsightStatisticRequest) SetAuthToken(v string) *ListChaininsightStatisticRequest {
	s.AuthToken = &v
	return s
}

func (s *ListChaininsightStatisticRequest) SetProductInstanceId(v string) *ListChaininsightStatisticRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListChaininsightStatisticRequest) SetBizId(v string) *ListChaininsightStatisticRequest {
	s.BizId = &v
	return s
}

func (s *ListChaininsightStatisticRequest) SetType(v string) *ListChaininsightStatisticRequest {
	s.Type = &v
	return s
}

func (s *ListChaininsightStatisticRequest) SetHexAddress(v string) *ListChaininsightStatisticRequest {
	s.HexAddress = &v
	return s
}

type ListChaininsightStatisticResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result []*ChainInsightStatisticTask `json:"result,omitempty" xml:"result,omitempty" type:"Repeated"`
}

func (s ListChaininsightStatisticResponse) String() string {
	return tea.Prettify(s)
}

func (s ListChaininsightStatisticResponse) GoString() string {
	return s.String()
}

func (s *ListChaininsightStatisticResponse) SetReqMsgId(v string) *ListChaininsightStatisticResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListChaininsightStatisticResponse) SetResultCode(v string) *ListChaininsightStatisticResponse {
	s.ResultCode = &v
	return s
}

func (s *ListChaininsightStatisticResponse) SetResultMsg(v string) *ListChaininsightStatisticResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListChaininsightStatisticResponse) SetResult(v []*ChainInsightStatisticTask) *ListChaininsightStatisticResponse {
	s.Result = v
	return s
}

type AddChaininsightStatisticRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 统计类型，    ContractStatistic： 合约性能检测指标
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 链上合约地址
	HexAddress *string `json:"hex_address,omitempty" xml:"hex_address,omitempty"`
	// 租户ID，留空
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s AddChaininsightStatisticRequest) String() string {
	return tea.Prettify(s)
}

func (s AddChaininsightStatisticRequest) GoString() string {
	return s.String()
}

func (s *AddChaininsightStatisticRequest) SetAuthToken(v string) *AddChaininsightStatisticRequest {
	s.AuthToken = &v
	return s
}

func (s *AddChaininsightStatisticRequest) SetProductInstanceId(v string) *AddChaininsightStatisticRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddChaininsightStatisticRequest) SetBizId(v string) *AddChaininsightStatisticRequest {
	s.BizId = &v
	return s
}

func (s *AddChaininsightStatisticRequest) SetType(v string) *AddChaininsightStatisticRequest {
	s.Type = &v
	return s
}

func (s *AddChaininsightStatisticRequest) SetHexAddress(v string) *AddChaininsightStatisticRequest {
	s.HexAddress = &v
	return s
}

func (s *AddChaininsightStatisticRequest) SetTenantId(v string) *AddChaininsightStatisticRequest {
	s.TenantId = &v
	return s
}

type AddChaininsightStatisticResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *ChainInsightStatisticTask `json:"result,omitempty" xml:"result,omitempty"`
}

func (s AddChaininsightStatisticResponse) String() string {
	return tea.Prettify(s)
}

func (s AddChaininsightStatisticResponse) GoString() string {
	return s.String()
}

func (s *AddChaininsightStatisticResponse) SetReqMsgId(v string) *AddChaininsightStatisticResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddChaininsightStatisticResponse) SetResultCode(v string) *AddChaininsightStatisticResponse {
	s.ResultCode = &v
	return s
}

func (s *AddChaininsightStatisticResponse) SetResultMsg(v string) *AddChaininsightStatisticResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddChaininsightStatisticResponse) SetResult(v *ChainInsightStatisticTask) *AddChaininsightStatisticResponse {
	s.Result = v
	return s
}

type OperateChaininsightStatisticRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 统计任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 操作方式； Delete 删除
	Operation *string `json:"operation,omitempty" xml:"operation,omitempty" require:"true"`
	// 租户ID，留空
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s OperateChaininsightStatisticRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateChaininsightStatisticRequest) GoString() string {
	return s.String()
}

func (s *OperateChaininsightStatisticRequest) SetAuthToken(v string) *OperateChaininsightStatisticRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateChaininsightStatisticRequest) SetProductInstanceId(v string) *OperateChaininsightStatisticRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateChaininsightStatisticRequest) SetBizId(v string) *OperateChaininsightStatisticRequest {
	s.BizId = &v
	return s
}

func (s *OperateChaininsightStatisticRequest) SetTaskId(v string) *OperateChaininsightStatisticRequest {
	s.TaskId = &v
	return s
}

func (s *OperateChaininsightStatisticRequest) SetOperation(v string) *OperateChaininsightStatisticRequest {
	s.Operation = &v
	return s
}

func (s *OperateChaininsightStatisticRequest) SetTenantId(v string) *OperateChaininsightStatisticRequest {
	s.TenantId = &v
	return s
}

type OperateChaininsightStatisticResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *ChainInsightStatisticTask `json:"result,omitempty" xml:"result,omitempty"`
}

func (s OperateChaininsightStatisticResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateChaininsightStatisticResponse) GoString() string {
	return s.String()
}

func (s *OperateChaininsightStatisticResponse) SetReqMsgId(v string) *OperateChaininsightStatisticResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateChaininsightStatisticResponse) SetResultCode(v string) *OperateChaininsightStatisticResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateChaininsightStatisticResponse) SetResultMsg(v string) *OperateChaininsightStatisticResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateChaininsightStatisticResponse) SetResult(v *ChainInsightStatisticTask) *OperateChaininsightStatisticResponse {
	s.Result = v
	return s
}

type QueryChaininsightStatistichistogramRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 自定义通知指标的ID
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 多个维度名称，空表示所有维度
	Dimensions []*string `json:"dimensions,omitempty" xml:"dimensions,omitempty" type:"Repeated"`
	// 查询开始时间，毫秒时间戳
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true"`
	// 查询结束时间，毫秒时间戳
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true"`
	// 点集类型，枚举：Amount、Increment、GrowthRate，默认为Amount
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s QueryChaininsightStatistichistogramRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightStatistichistogramRequest) GoString() string {
	return s.String()
}

func (s *QueryChaininsightStatistichistogramRequest) SetAuthToken(v string) *QueryChaininsightStatistichistogramRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryChaininsightStatistichistogramRequest) SetProductInstanceId(v string) *QueryChaininsightStatistichistogramRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryChaininsightStatistichistogramRequest) SetBizId(v string) *QueryChaininsightStatistichistogramRequest {
	s.BizId = &v
	return s
}

func (s *QueryChaininsightStatistichistogramRequest) SetName(v string) *QueryChaininsightStatistichistogramRequest {
	s.Name = &v
	return s
}

func (s *QueryChaininsightStatistichistogramRequest) SetDimensions(v []*string) *QueryChaininsightStatistichistogramRequest {
	s.Dimensions = v
	return s
}

func (s *QueryChaininsightStatistichistogramRequest) SetStartTime(v int64) *QueryChaininsightStatistichistogramRequest {
	s.StartTime = &v
	return s
}

func (s *QueryChaininsightStatistichistogramRequest) SetEndTime(v int64) *QueryChaininsightStatistichistogramRequest {
	s.EndTime = &v
	return s
}

func (s *QueryChaininsightStatistichistogramRequest) SetType(v string) *QueryChaininsightStatistichistogramRequest {
	s.Type = &v
	return s
}

type QueryChaininsightStatistichistogramResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result []*ChainInsightHistogram `json:"result,omitempty" xml:"result,omitempty" type:"Repeated"`
}

func (s QueryChaininsightStatistichistogramResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightStatistichistogramResponse) GoString() string {
	return s.String()
}

func (s *QueryChaininsightStatistichistogramResponse) SetReqMsgId(v string) *QueryChaininsightStatistichistogramResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryChaininsightStatistichistogramResponse) SetResultCode(v string) *QueryChaininsightStatistichistogramResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryChaininsightStatistichistogramResponse) SetResultMsg(v string) *QueryChaininsightStatistichistogramResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryChaininsightStatistichistogramResponse) SetResult(v []*ChainInsightHistogram) *QueryChaininsightStatistichistogramResponse {
	s.Result = v
	return s
}

type QueryChaininsightStatistictableRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 自定义统计的指标ID
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 多个维度名称，空表示所有维度
	Dimensions []*string `json:"dimensions,omitempty" xml:"dimensions,omitempty" type:"Repeated"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 页码
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty"`
}

func (s QueryChaininsightStatistictableRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightStatistictableRequest) GoString() string {
	return s.String()
}

func (s *QueryChaininsightStatistictableRequest) SetAuthToken(v string) *QueryChaininsightStatistictableRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryChaininsightStatistictableRequest) SetProductInstanceId(v string) *QueryChaininsightStatistictableRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryChaininsightStatistictableRequest) SetBizId(v string) *QueryChaininsightStatistictableRequest {
	s.BizId = &v
	return s
}

func (s *QueryChaininsightStatistictableRequest) SetName(v string) *QueryChaininsightStatistictableRequest {
	s.Name = &v
	return s
}

func (s *QueryChaininsightStatistictableRequest) SetDimensions(v []*string) *QueryChaininsightStatistictableRequest {
	s.Dimensions = v
	return s
}

func (s *QueryChaininsightStatistictableRequest) SetPageSize(v int64) *QueryChaininsightStatistictableRequest {
	s.PageSize = &v
	return s
}

func (s *QueryChaininsightStatistictableRequest) SetPageNo(v int64) *QueryChaininsightStatistictableRequest {
	s.PageNo = &v
	return s
}

type QueryChaininsightStatistictableResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *ChainInsightStatisticCustomTablesResponse `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryChaininsightStatistictableResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightStatistictableResponse) GoString() string {
	return s.String()
}

func (s *QueryChaininsightStatistictableResponse) SetReqMsgId(v string) *QueryChaininsightStatistictableResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryChaininsightStatistictableResponse) SetResultCode(v string) *QueryChaininsightStatistictableResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryChaininsightStatistictableResponse) SetResultMsg(v string) *QueryChaininsightStatistictableResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryChaininsightStatistictableResponse) SetResult(v *ChainInsightStatisticCustomTablesResponse) *QueryChaininsightStatistictableResponse {
	s.Result = v
	return s
}

type CreateChaininsightQrcodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// QR码类型，枚举值：CONTRACT / HEXADDRESS / TX / CHAIN / BLOCK / TIMELINE
	PageType *string `json:"page_type,omitempty" xml:"page_type,omitempty" require:"true"`
	// 页面对应的参数
	ParamMap []*MapEntry `json:"param_map,omitempty" xml:"param_map,omitempty" require:"true" type:"Repeated"`
}

func (s CreateChaininsightQrcodeRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateChaininsightQrcodeRequest) GoString() string {
	return s.String()
}

func (s *CreateChaininsightQrcodeRequest) SetAuthToken(v string) *CreateChaininsightQrcodeRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateChaininsightQrcodeRequest) SetProductInstanceId(v string) *CreateChaininsightQrcodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateChaininsightQrcodeRequest) SetBizId(v string) *CreateChaininsightQrcodeRequest {
	s.BizId = &v
	return s
}

func (s *CreateChaininsightQrcodeRequest) SetPageType(v string) *CreateChaininsightQrcodeRequest {
	s.PageType = &v
	return s
}

func (s *CreateChaininsightQrcodeRequest) SetParamMap(v []*MapEntry) *CreateChaininsightQrcodeRequest {
	s.ParamMap = v
	return s
}

type CreateChaininsightQrcodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// base64编码的png图片
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s CreateChaininsightQrcodeResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateChaininsightQrcodeResponse) GoString() string {
	return s.String()
}

func (s *CreateChaininsightQrcodeResponse) SetReqMsgId(v string) *CreateChaininsightQrcodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateChaininsightQrcodeResponse) SetResultCode(v string) *CreateChaininsightQrcodeResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateChaininsightQrcodeResponse) SetResultMsg(v string) *CreateChaininsightQrcodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateChaininsightQrcodeResponse) SetResult(v string) *CreateChaininsightQrcodeResponse {
	s.Result = &v
	return s
}

type OpenChaininsightDatasearchRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟ID
	UnionId *string `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 租户ID，留空
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s OpenChaininsightDatasearchRequest) String() string {
	return tea.Prettify(s)
}

func (s OpenChaininsightDatasearchRequest) GoString() string {
	return s.String()
}

func (s *OpenChaininsightDatasearchRequest) SetAuthToken(v string) *OpenChaininsightDatasearchRequest {
	s.AuthToken = &v
	return s
}

func (s *OpenChaininsightDatasearchRequest) SetProductInstanceId(v string) *OpenChaininsightDatasearchRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OpenChaininsightDatasearchRequest) SetUnionId(v string) *OpenChaininsightDatasearchRequest {
	s.UnionId = &v
	return s
}

func (s *OpenChaininsightDatasearchRequest) SetBizId(v string) *OpenChaininsightDatasearchRequest {
	s.BizId = &v
	return s
}

func (s *OpenChaininsightDatasearchRequest) SetTenantId(v string) *OpenChaininsightDatasearchRequest {
	s.TenantId = &v
	return s
}

type OpenChaininsightDatasearchResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s OpenChaininsightDatasearchResponse) String() string {
	return tea.Prettify(s)
}

func (s OpenChaininsightDatasearchResponse) GoString() string {
	return s.String()
}

func (s *OpenChaininsightDatasearchResponse) SetReqMsgId(v string) *OpenChaininsightDatasearchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OpenChaininsightDatasearchResponse) SetResultCode(v string) *OpenChaininsightDatasearchResponse {
	s.ResultCode = &v
	return s
}

func (s *OpenChaininsightDatasearchResponse) SetResultMsg(v string) *OpenChaininsightDatasearchResponse {
	s.ResultMsg = &v
	return s
}

func (s *OpenChaininsightDatasearchResponse) SetResult(v string) *OpenChaininsightDatasearchResponse {
	s.Result = &v
	return s
}

type QueryChaininsightPrivatedatasearchstatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟ID
	UnionId *string `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 租户ID，留空
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 链ID列表
	BizIds []*string `json:"biz_ids,omitempty" xml:"biz_ids,omitempty" type:"Repeated"`
}

func (s QueryChaininsightPrivatedatasearchstatusRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightPrivatedatasearchstatusRequest) GoString() string {
	return s.String()
}

func (s *QueryChaininsightPrivatedatasearchstatusRequest) SetAuthToken(v string) *QueryChaininsightPrivatedatasearchstatusRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryChaininsightPrivatedatasearchstatusRequest) SetProductInstanceId(v string) *QueryChaininsightPrivatedatasearchstatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryChaininsightPrivatedatasearchstatusRequest) SetUnionId(v string) *QueryChaininsightPrivatedatasearchstatusRequest {
	s.UnionId = &v
	return s
}

func (s *QueryChaininsightPrivatedatasearchstatusRequest) SetTenantId(v string) *QueryChaininsightPrivatedatasearchstatusRequest {
	s.TenantId = &v
	return s
}

func (s *QueryChaininsightPrivatedatasearchstatusRequest) SetBizIds(v []*string) *QueryChaininsightPrivatedatasearchstatusRequest {
	s.BizIds = v
	return s
}

type QueryChaininsightPrivatedatasearchstatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链搜索状态列表
	Result []*ChainInsightSearchStatus `json:"result,omitempty" xml:"result,omitempty" type:"Repeated"`
}

func (s QueryChaininsightPrivatedatasearchstatusResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightPrivatedatasearchstatusResponse) GoString() string {
	return s.String()
}

func (s *QueryChaininsightPrivatedatasearchstatusResponse) SetReqMsgId(v string) *QueryChaininsightPrivatedatasearchstatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryChaininsightPrivatedatasearchstatusResponse) SetResultCode(v string) *QueryChaininsightPrivatedatasearchstatusResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryChaininsightPrivatedatasearchstatusResponse) SetResultMsg(v string) *QueryChaininsightPrivatedatasearchstatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryChaininsightPrivatedatasearchstatusResponse) SetResult(v []*ChainInsightSearchStatus) *QueryChaininsightPrivatedatasearchstatusResponse {
	s.Result = v
	return s
}

type AddChaininsightWidgetsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟ID
	UnionId *string `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 租户ID，留空
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 数据洞察看板
	Widget *ChainInsightWidget `json:"widget,omitempty" xml:"widget,omitempty" require:"true"`
}

func (s AddChaininsightWidgetsRequest) String() string {
	return tea.Prettify(s)
}

func (s AddChaininsightWidgetsRequest) GoString() string {
	return s.String()
}

func (s *AddChaininsightWidgetsRequest) SetAuthToken(v string) *AddChaininsightWidgetsRequest {
	s.AuthToken = &v
	return s
}

func (s *AddChaininsightWidgetsRequest) SetProductInstanceId(v string) *AddChaininsightWidgetsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddChaininsightWidgetsRequest) SetUnionId(v string) *AddChaininsightWidgetsRequest {
	s.UnionId = &v
	return s
}

func (s *AddChaininsightWidgetsRequest) SetTenantId(v string) *AddChaininsightWidgetsRequest {
	s.TenantId = &v
	return s
}

func (s *AddChaininsightWidgetsRequest) SetWidget(v *ChainInsightWidget) *AddChaininsightWidgetsRequest {
	s.Widget = v
	return s
}

type AddChaininsightWidgetsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据洞察看板
	Result *ChainInsightWidget `json:"result,omitempty" xml:"result,omitempty"`
}

func (s AddChaininsightWidgetsResponse) String() string {
	return tea.Prettify(s)
}

func (s AddChaininsightWidgetsResponse) GoString() string {
	return s.String()
}

func (s *AddChaininsightWidgetsResponse) SetReqMsgId(v string) *AddChaininsightWidgetsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddChaininsightWidgetsResponse) SetResultCode(v string) *AddChaininsightWidgetsResponse {
	s.ResultCode = &v
	return s
}

func (s *AddChaininsightWidgetsResponse) SetResultMsg(v string) *AddChaininsightWidgetsResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddChaininsightWidgetsResponse) SetResult(v *ChainInsightWidget) *AddChaininsightWidgetsResponse {
	s.Result = v
	return s
}

type ListChaininsightWidgetsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟ID
	UnionId *string `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 租户ID，留空
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s ListChaininsightWidgetsRequest) String() string {
	return tea.Prettify(s)
}

func (s ListChaininsightWidgetsRequest) GoString() string {
	return s.String()
}

func (s *ListChaininsightWidgetsRequest) SetAuthToken(v string) *ListChaininsightWidgetsRequest {
	s.AuthToken = &v
	return s
}

func (s *ListChaininsightWidgetsRequest) SetProductInstanceId(v string) *ListChaininsightWidgetsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListChaininsightWidgetsRequest) SetUnionId(v string) *ListChaininsightWidgetsRequest {
	s.UnionId = &v
	return s
}

func (s *ListChaininsightWidgetsRequest) SetTenantId(v string) *ListChaininsightWidgetsRequest {
	s.TenantId = &v
	return s
}

type ListChaininsightWidgetsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据洞察看板列表
	Result []*ChainInsightWidget `json:"result,omitempty" xml:"result,omitempty" type:"Repeated"`
}

func (s ListChaininsightWidgetsResponse) String() string {
	return tea.Prettify(s)
}

func (s ListChaininsightWidgetsResponse) GoString() string {
	return s.String()
}

func (s *ListChaininsightWidgetsResponse) SetReqMsgId(v string) *ListChaininsightWidgetsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListChaininsightWidgetsResponse) SetResultCode(v string) *ListChaininsightWidgetsResponse {
	s.ResultCode = &v
	return s
}

func (s *ListChaininsightWidgetsResponse) SetResultMsg(v string) *ListChaininsightWidgetsResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListChaininsightWidgetsResponse) SetResult(v []*ChainInsightWidget) *ListChaininsightWidgetsResponse {
	s.Result = v
	return s
}

type QueryChaininsightTablesactivereceiverRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟ID
	UnionId *string `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 链ID列表
	BizIds []*string `json:"biz_ids,omitempty" xml:"biz_ids,omitempty" type:"Repeated"`
	// 时间范围，单位小时，默认24小时
	TimeRange *int64 `json:"time_range,omitempty" xml:"time_range,omitempty" maximum:"168" minimum:"0"`
	// 页码，默认1
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" minimum:"1"`
	// 页面大小，默认10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" maximum:"100"`
	// 租户ID，留空
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s QueryChaininsightTablesactivereceiverRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightTablesactivereceiverRequest) GoString() string {
	return s.String()
}

func (s *QueryChaininsightTablesactivereceiverRequest) SetAuthToken(v string) *QueryChaininsightTablesactivereceiverRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryChaininsightTablesactivereceiverRequest) SetProductInstanceId(v string) *QueryChaininsightTablesactivereceiverRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryChaininsightTablesactivereceiverRequest) SetUnionId(v string) *QueryChaininsightTablesactivereceiverRequest {
	s.UnionId = &v
	return s
}

func (s *QueryChaininsightTablesactivereceiverRequest) SetBizIds(v []*string) *QueryChaininsightTablesactivereceiverRequest {
	s.BizIds = v
	return s
}

func (s *QueryChaininsightTablesactivereceiverRequest) SetTimeRange(v int64) *QueryChaininsightTablesactivereceiverRequest {
	s.TimeRange = &v
	return s
}

func (s *QueryChaininsightTablesactivereceiverRequest) SetPageNo(v int64) *QueryChaininsightTablesactivereceiverRequest {
	s.PageNo = &v
	return s
}

func (s *QueryChaininsightTablesactivereceiverRequest) SetPageSize(v int64) *QueryChaininsightTablesactivereceiverRequest {
	s.PageSize = &v
	return s
}

func (s *QueryChaininsightTablesactivereceiverRequest) SetTenantId(v string) *QueryChaininsightTablesactivereceiverRequest {
	s.TenantId = &v
	return s
}

type QueryChaininsightTablesactivereceiverResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据洞察链上活跃接收地址响应
	Result *ChainInsightActiveAddressesResponse `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryChaininsightTablesactivereceiverResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightTablesactivereceiverResponse) GoString() string {
	return s.String()
}

func (s *QueryChaininsightTablesactivereceiverResponse) SetReqMsgId(v string) *QueryChaininsightTablesactivereceiverResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryChaininsightTablesactivereceiverResponse) SetResultCode(v string) *QueryChaininsightTablesactivereceiverResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryChaininsightTablesactivereceiverResponse) SetResultMsg(v string) *QueryChaininsightTablesactivereceiverResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryChaininsightTablesactivereceiverResponse) SetResult(v *ChainInsightActiveAddressesResponse) *QueryChaininsightTablesactivereceiverResponse {
	s.Result = v
	return s
}

type QueryChaininsightTablesactivesenderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟ID
	UnionId *string `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 链ID列表
	BizIds []*string `json:"biz_ids,omitempty" xml:"biz_ids,omitempty" type:"Repeated"`
	// 时间范围，单位小时，默认24小时
	TimeRange *int64 `json:"time_range,omitempty" xml:"time_range,omitempty" maximum:"168" minimum:"0"`
	// 页码，默认1
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" minimum:"1"`
	// 页面大小，默认10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" maximum:"100"`
	// 租户ID，留空
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s QueryChaininsightTablesactivesenderRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightTablesactivesenderRequest) GoString() string {
	return s.String()
}

func (s *QueryChaininsightTablesactivesenderRequest) SetAuthToken(v string) *QueryChaininsightTablesactivesenderRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryChaininsightTablesactivesenderRequest) SetProductInstanceId(v string) *QueryChaininsightTablesactivesenderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryChaininsightTablesactivesenderRequest) SetUnionId(v string) *QueryChaininsightTablesactivesenderRequest {
	s.UnionId = &v
	return s
}

func (s *QueryChaininsightTablesactivesenderRequest) SetBizIds(v []*string) *QueryChaininsightTablesactivesenderRequest {
	s.BizIds = v
	return s
}

func (s *QueryChaininsightTablesactivesenderRequest) SetTimeRange(v int64) *QueryChaininsightTablesactivesenderRequest {
	s.TimeRange = &v
	return s
}

func (s *QueryChaininsightTablesactivesenderRequest) SetPageNo(v int64) *QueryChaininsightTablesactivesenderRequest {
	s.PageNo = &v
	return s
}

func (s *QueryChaininsightTablesactivesenderRequest) SetPageSize(v int64) *QueryChaininsightTablesactivesenderRequest {
	s.PageSize = &v
	return s
}

func (s *QueryChaininsightTablesactivesenderRequest) SetTenantId(v string) *QueryChaininsightTablesactivesenderRequest {
	s.TenantId = &v
	return s
}

type QueryChaininsightTablesactivesenderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据洞察链上活跃发送地址响应
	Result *ChainInsightActiveAddressesResponse `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryChaininsightTablesactivesenderResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightTablesactivesenderResponse) GoString() string {
	return s.String()
}

func (s *QueryChaininsightTablesactivesenderResponse) SetReqMsgId(v string) *QueryChaininsightTablesactivesenderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryChaininsightTablesactivesenderResponse) SetResultCode(v string) *QueryChaininsightTablesactivesenderResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryChaininsightTablesactivesenderResponse) SetResultMsg(v string) *QueryChaininsightTablesactivesenderResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryChaininsightTablesactivesenderResponse) SetResult(v *ChainInsightActiveAddressesResponse) *QueryChaininsightTablesactivesenderResponse {
	s.Result = v
	return s
}

type PagequeryChaininsightLatestcontractsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 页码
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" minimum:"1"`
	// 页面大小，默认为5
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" maximum:"100"`
}

func (s PagequeryChaininsightLatestcontractsRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryChaininsightLatestcontractsRequest) GoString() string {
	return s.String()
}

func (s *PagequeryChaininsightLatestcontractsRequest) SetAuthToken(v string) *PagequeryChaininsightLatestcontractsRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryChaininsightLatestcontractsRequest) SetProductInstanceId(v string) *PagequeryChaininsightLatestcontractsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryChaininsightLatestcontractsRequest) SetBizId(v string) *PagequeryChaininsightLatestcontractsRequest {
	s.BizId = &v
	return s
}

func (s *PagequeryChaininsightLatestcontractsRequest) SetPageNo(v int64) *PagequeryChaininsightLatestcontractsRequest {
	s.PageNo = &v
	return s
}

func (s *PagequeryChaininsightLatestcontractsRequest) SetPageSize(v int64) *PagequeryChaininsightLatestcontractsRequest {
	s.PageSize = &v
	return s
}

type PagequeryChaininsightLatestcontractsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *ChainInsightTransactionInfoPageableResponse `json:"result,omitempty" xml:"result,omitempty"`
}

func (s PagequeryChaininsightLatestcontractsResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryChaininsightLatestcontractsResponse) GoString() string {
	return s.String()
}

func (s *PagequeryChaininsightLatestcontractsResponse) SetReqMsgId(v string) *PagequeryChaininsightLatestcontractsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryChaininsightLatestcontractsResponse) SetResultCode(v string) *PagequeryChaininsightLatestcontractsResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryChaininsightLatestcontractsResponse) SetResultMsg(v string) *PagequeryChaininsightLatestcontractsResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryChaininsightLatestcontractsResponse) SetResult(v *ChainInsightTransactionInfoPageableResponse) *PagequeryChaininsightLatestcontractsResponse {
	s.Result = v
	return s
}

type PagequeryChaininsightLatesttxsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 页面大小，默认为5
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" maximum:"100"`
	// 页码，默认为1
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" minimum:"1"`
}

func (s PagequeryChaininsightLatesttxsRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryChaininsightLatesttxsRequest) GoString() string {
	return s.String()
}

func (s *PagequeryChaininsightLatesttxsRequest) SetAuthToken(v string) *PagequeryChaininsightLatesttxsRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryChaininsightLatesttxsRequest) SetProductInstanceId(v string) *PagequeryChaininsightLatesttxsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryChaininsightLatesttxsRequest) SetBizId(v string) *PagequeryChaininsightLatesttxsRequest {
	s.BizId = &v
	return s
}

func (s *PagequeryChaininsightLatesttxsRequest) SetPageSize(v int64) *PagequeryChaininsightLatesttxsRequest {
	s.PageSize = &v
	return s
}

func (s *PagequeryChaininsightLatesttxsRequest) SetPageNo(v int64) *PagequeryChaininsightLatesttxsRequest {
	s.PageNo = &v
	return s
}

type PagequeryChaininsightLatesttxsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *ChainInsightAddressLatestTxsResponse `json:"result,omitempty" xml:"result,omitempty"`
}

func (s PagequeryChaininsightLatesttxsResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryChaininsightLatesttxsResponse) GoString() string {
	return s.String()
}

func (s *PagequeryChaininsightLatesttxsResponse) SetReqMsgId(v string) *PagequeryChaininsightLatesttxsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryChaininsightLatesttxsResponse) SetResultCode(v string) *PagequeryChaininsightLatesttxsResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryChaininsightLatesttxsResponse) SetResultMsg(v string) *PagequeryChaininsightLatesttxsResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryChaininsightLatesttxsResponse) SetResult(v *ChainInsightAddressLatestTxsResponse) *PagequeryChaininsightLatesttxsResponse {
	s.Result = v
	return s
}

type QueryChaininsightPrivatechainsstatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟ID
	UnionId *string `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 链ID列表
	BizIds []*string `json:"biz_ids,omitempty" xml:"biz_ids,omitempty" type:"Repeated"`
	// 租户ID，留空
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s QueryChaininsightPrivatechainsstatusRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightPrivatechainsstatusRequest) GoString() string {
	return s.String()
}

func (s *QueryChaininsightPrivatechainsstatusRequest) SetAuthToken(v string) *QueryChaininsightPrivatechainsstatusRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryChaininsightPrivatechainsstatusRequest) SetProductInstanceId(v string) *QueryChaininsightPrivatechainsstatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryChaininsightPrivatechainsstatusRequest) SetUnionId(v string) *QueryChaininsightPrivatechainsstatusRequest {
	s.UnionId = &v
	return s
}

func (s *QueryChaininsightPrivatechainsstatusRequest) SetBizIds(v []*string) *QueryChaininsightPrivatechainsstatusRequest {
	s.BizIds = v
	return s
}

func (s *QueryChaininsightPrivatechainsstatusRequest) SetTenantId(v string) *QueryChaininsightPrivatechainsstatusRequest {
	s.TenantId = &v
	return s
}

type QueryChaininsightPrivatechainsstatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *ChainInsightChainStatus `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryChaininsightPrivatechainsstatusResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightPrivatechainsstatusResponse) GoString() string {
	return s.String()
}

func (s *QueryChaininsightPrivatechainsstatusResponse) SetReqMsgId(v string) *QueryChaininsightPrivatechainsstatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryChaininsightPrivatechainsstatusResponse) SetResultCode(v string) *QueryChaininsightPrivatechainsstatusResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryChaininsightPrivatechainsstatusResponse) SetResultMsg(v string) *QueryChaininsightPrivatechainsstatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryChaininsightPrivatechainsstatusResponse) SetResult(v *ChainInsightChainStatus) *QueryChaininsightPrivatechainsstatusResponse {
	s.Result = v
	return s
}

type QueryChaininsightPrivatechaintxhistogramRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟ID
	UnionId *string `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 链ID列表
	BizIds []*string `json:"biz_ids,omitempty" xml:"biz_ids,omitempty" require:"true" type:"Repeated"`
	// 开始时间戳
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true"`
	// 结束时间戳
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true"`
	// 点集类型，枚举：Amount、Increment、GrowthRate，默认为Amount
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 统计间隔
	Interval *int64 `json:"interval,omitempty" xml:"interval,omitempty"`
	// 枚举值，统计间隔的时间单位：Second / Hour / Day / Month / Year
	IntervalUnit *string `json:"interval_unit,omitempty" xml:"interval_unit,omitempty"`
}

func (s QueryChaininsightPrivatechaintxhistogramRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightPrivatechaintxhistogramRequest) GoString() string {
	return s.String()
}

func (s *QueryChaininsightPrivatechaintxhistogramRequest) SetAuthToken(v string) *QueryChaininsightPrivatechaintxhistogramRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryChaininsightPrivatechaintxhistogramRequest) SetProductInstanceId(v string) *QueryChaininsightPrivatechaintxhistogramRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryChaininsightPrivatechaintxhistogramRequest) SetUnionId(v string) *QueryChaininsightPrivatechaintxhistogramRequest {
	s.UnionId = &v
	return s
}

func (s *QueryChaininsightPrivatechaintxhistogramRequest) SetBizIds(v []*string) *QueryChaininsightPrivatechaintxhistogramRequest {
	s.BizIds = v
	return s
}

func (s *QueryChaininsightPrivatechaintxhistogramRequest) SetStartTime(v int64) *QueryChaininsightPrivatechaintxhistogramRequest {
	s.StartTime = &v
	return s
}

func (s *QueryChaininsightPrivatechaintxhistogramRequest) SetEndTime(v int64) *QueryChaininsightPrivatechaintxhistogramRequest {
	s.EndTime = &v
	return s
}

func (s *QueryChaininsightPrivatechaintxhistogramRequest) SetType(v string) *QueryChaininsightPrivatechaintxhistogramRequest {
	s.Type = &v
	return s
}

func (s *QueryChaininsightPrivatechaintxhistogramRequest) SetInterval(v int64) *QueryChaininsightPrivatechaintxhistogramRequest {
	s.Interval = &v
	return s
}

func (s *QueryChaininsightPrivatechaintxhistogramRequest) SetIntervalUnit(v string) *QueryChaininsightPrivatechaintxhistogramRequest {
	s.IntervalUnit = &v
	return s
}

type QueryChaininsightPrivatechaintxhistogramResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *ChainInsightHistogram `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryChaininsightPrivatechaintxhistogramResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightPrivatechaintxhistogramResponse) GoString() string {
	return s.String()
}

func (s *QueryChaininsightPrivatechaintxhistogramResponse) SetReqMsgId(v string) *QueryChaininsightPrivatechaintxhistogramResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryChaininsightPrivatechaintxhistogramResponse) SetResultCode(v string) *QueryChaininsightPrivatechaintxhistogramResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryChaininsightPrivatechaintxhistogramResponse) SetResultMsg(v string) *QueryChaininsightPrivatechaintxhistogramResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryChaininsightPrivatechaintxhistogramResponse) SetResult(v *ChainInsightHistogram) *QueryChaininsightPrivatechaintxhistogramResponse {
	s.Result = v
	return s
}

type DeleteChaininsightWidgetsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟ID
	UnionId *string `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 看板ID
	WidgetId *string `json:"widget_id,omitempty" xml:"widget_id,omitempty" require:"true"`
	// 租户ID，留空
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s DeleteChaininsightWidgetsRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteChaininsightWidgetsRequest) GoString() string {
	return s.String()
}

func (s *DeleteChaininsightWidgetsRequest) SetAuthToken(v string) *DeleteChaininsightWidgetsRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteChaininsightWidgetsRequest) SetProductInstanceId(v string) *DeleteChaininsightWidgetsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteChaininsightWidgetsRequest) SetUnionId(v string) *DeleteChaininsightWidgetsRequest {
	s.UnionId = &v
	return s
}

func (s *DeleteChaininsightWidgetsRequest) SetWidgetId(v string) *DeleteChaininsightWidgetsRequest {
	s.WidgetId = &v
	return s
}

func (s *DeleteChaininsightWidgetsRequest) SetTenantId(v string) *DeleteChaininsightWidgetsRequest {
	s.TenantId = &v
	return s
}

type DeleteChaininsightWidgetsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s DeleteChaininsightWidgetsResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteChaininsightWidgetsResponse) GoString() string {
	return s.String()
}

func (s *DeleteChaininsightWidgetsResponse) SetReqMsgId(v string) *DeleteChaininsightWidgetsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteChaininsightWidgetsResponse) SetResultCode(v string) *DeleteChaininsightWidgetsResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteChaininsightWidgetsResponse) SetResultMsg(v string) *DeleteChaininsightWidgetsResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteChaininsightWidgetsResponse) SetResult(v string) *DeleteChaininsightWidgetsResponse {
	s.Result = &v
	return s
}

type OperateChaininsightWidgetsmoveRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟ID
	UnionId *string `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 看板ID
	WidgetId *string `json:"widget_id,omitempty" xml:"widget_id,omitempty" require:"true"`
	// 移动类型， 向上移动（MoveUp） / 向下移动（MoveDown）
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 租户ID，留空
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s OperateChaininsightWidgetsmoveRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateChaininsightWidgetsmoveRequest) GoString() string {
	return s.String()
}

func (s *OperateChaininsightWidgetsmoveRequest) SetAuthToken(v string) *OperateChaininsightWidgetsmoveRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateChaininsightWidgetsmoveRequest) SetProductInstanceId(v string) *OperateChaininsightWidgetsmoveRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateChaininsightWidgetsmoveRequest) SetUnionId(v string) *OperateChaininsightWidgetsmoveRequest {
	s.UnionId = &v
	return s
}

func (s *OperateChaininsightWidgetsmoveRequest) SetWidgetId(v string) *OperateChaininsightWidgetsmoveRequest {
	s.WidgetId = &v
	return s
}

func (s *OperateChaininsightWidgetsmoveRequest) SetType(v string) *OperateChaininsightWidgetsmoveRequest {
	s.Type = &v
	return s
}

func (s *OperateChaininsightWidgetsmoveRequest) SetTenantId(v string) *OperateChaininsightWidgetsmoveRequest {
	s.TenantId = &v
	return s
}

type OperateChaininsightWidgetsmoveResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 移动后的看板列表
	Result []*ChainInsightWidget `json:"result,omitempty" xml:"result,omitempty" type:"Repeated"`
}

func (s OperateChaininsightWidgetsmoveResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateChaininsightWidgetsmoveResponse) GoString() string {
	return s.String()
}

func (s *OperateChaininsightWidgetsmoveResponse) SetReqMsgId(v string) *OperateChaininsightWidgetsmoveResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateChaininsightWidgetsmoveResponse) SetResultCode(v string) *OperateChaininsightWidgetsmoveResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateChaininsightWidgetsmoveResponse) SetResultMsg(v string) *OperateChaininsightWidgetsmoveResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateChaininsightWidgetsmoveResponse) SetResult(v []*ChainInsightWidget) *OperateChaininsightWidgetsmoveResponse {
	s.Result = v
	return s
}

type UpdateChaininsightWidgetsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟ID
	UnionId *string `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 要修改的看板信息
	Widget *ChainInsightWidget `json:"widget,omitempty" xml:"widget,omitempty" require:"true"`
	// 租户ID，留空
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s UpdateChaininsightWidgetsRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateChaininsightWidgetsRequest) GoString() string {
	return s.String()
}

func (s *UpdateChaininsightWidgetsRequest) SetAuthToken(v string) *UpdateChaininsightWidgetsRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateChaininsightWidgetsRequest) SetProductInstanceId(v string) *UpdateChaininsightWidgetsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateChaininsightWidgetsRequest) SetUnionId(v string) *UpdateChaininsightWidgetsRequest {
	s.UnionId = &v
	return s
}

func (s *UpdateChaininsightWidgetsRequest) SetWidget(v *ChainInsightWidget) *UpdateChaininsightWidgetsRequest {
	s.Widget = v
	return s
}

func (s *UpdateChaininsightWidgetsRequest) SetTenantId(v string) *UpdateChaininsightWidgetsRequest {
	s.TenantId = &v
	return s
}

type UpdateChaininsightWidgetsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 修改后的看板信息
	Result *ChainInsightWidget `json:"result,omitempty" xml:"result,omitempty"`
}

func (s UpdateChaininsightWidgetsResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateChaininsightWidgetsResponse) GoString() string {
	return s.String()
}

func (s *UpdateChaininsightWidgetsResponse) SetReqMsgId(v string) *UpdateChaininsightWidgetsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateChaininsightWidgetsResponse) SetResultCode(v string) *UpdateChaininsightWidgetsResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateChaininsightWidgetsResponse) SetResultMsg(v string) *UpdateChaininsightWidgetsResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateChaininsightWidgetsResponse) SetResult(v *ChainInsightWidget) *UpdateChaininsightWidgetsResponse {
	s.Result = v
	return s
}

type DownloadChaininsightContractRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 合约地址
	HexAddress *string `json:"hex_address,omitempty" xml:"hex_address,omitempty" require:"true"`
	// 合约部署交易所在区块范围的最大值，默认为0，即小于当前区块
	Height *string `json:"height,omitempty" xml:"height,omitempty"`
}

func (s DownloadChaininsightContractRequest) String() string {
	return tea.Prettify(s)
}

func (s DownloadChaininsightContractRequest) GoString() string {
	return s.String()
}

func (s *DownloadChaininsightContractRequest) SetAuthToken(v string) *DownloadChaininsightContractRequest {
	s.AuthToken = &v
	return s
}

func (s *DownloadChaininsightContractRequest) SetProductInstanceId(v string) *DownloadChaininsightContractRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DownloadChaininsightContractRequest) SetBizId(v string) *DownloadChaininsightContractRequest {
	s.BizId = &v
	return s
}

func (s *DownloadChaininsightContractRequest) SetHexAddress(v string) *DownloadChaininsightContractRequest {
	s.HexAddress = &v
	return s
}

func (s *DownloadChaininsightContractRequest) SetHeight(v string) *DownloadChaininsightContractRequest {
	s.Height = &v
	return s
}

type DownloadChaininsightContractResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// base64编码的合约信息
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s DownloadChaininsightContractResponse) String() string {
	return tea.Prettify(s)
}

func (s DownloadChaininsightContractResponse) GoString() string {
	return s.String()
}

func (s *DownloadChaininsightContractResponse) SetReqMsgId(v string) *DownloadChaininsightContractResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DownloadChaininsightContractResponse) SetResultCode(v string) *DownloadChaininsightContractResponse {
	s.ResultCode = &v
	return s
}

func (s *DownloadChaininsightContractResponse) SetResultMsg(v string) *DownloadChaininsightContractResponse {
	s.ResultMsg = &v
	return s
}

func (s *DownloadChaininsightContractResponse) SetResult(v string) *DownloadChaininsightContractResponse {
	s.Result = &v
	return s
}

type PagequeryChaininsightContractmodifytxRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 租户ID，留空
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 合约地址
	HexAddress *string `json:"hex_address,omitempty" xml:"hex_address,omitempty" require:"true"`
	// 页码，默认为1
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" minimum:"1"`
	// 页面大小，默认为10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" maximum:"100"`
}

func (s PagequeryChaininsightContractmodifytxRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryChaininsightContractmodifytxRequest) GoString() string {
	return s.String()
}

func (s *PagequeryChaininsightContractmodifytxRequest) SetAuthToken(v string) *PagequeryChaininsightContractmodifytxRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryChaininsightContractmodifytxRequest) SetProductInstanceId(v string) *PagequeryChaininsightContractmodifytxRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryChaininsightContractmodifytxRequest) SetBizId(v string) *PagequeryChaininsightContractmodifytxRequest {
	s.BizId = &v
	return s
}

func (s *PagequeryChaininsightContractmodifytxRequest) SetTenantId(v string) *PagequeryChaininsightContractmodifytxRequest {
	s.TenantId = &v
	return s
}

func (s *PagequeryChaininsightContractmodifytxRequest) SetHexAddress(v string) *PagequeryChaininsightContractmodifytxRequest {
	s.HexAddress = &v
	return s
}

func (s *PagequeryChaininsightContractmodifytxRequest) SetPageNo(v int64) *PagequeryChaininsightContractmodifytxRequest {
	s.PageNo = &v
	return s
}

func (s *PagequeryChaininsightContractmodifytxRequest) SetPageSize(v int64) *PagequeryChaininsightContractmodifytxRequest {
	s.PageSize = &v
	return s
}

type PagequeryChaininsightContractmodifytxResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *ChainInsightTransactionInfoPageableResponse `json:"result,omitempty" xml:"result,omitempty"`
}

func (s PagequeryChaininsightContractmodifytxResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryChaininsightContractmodifytxResponse) GoString() string {
	return s.String()
}

func (s *PagequeryChaininsightContractmodifytxResponse) SetReqMsgId(v string) *PagequeryChaininsightContractmodifytxResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryChaininsightContractmodifytxResponse) SetResultCode(v string) *PagequeryChaininsightContractmodifytxResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryChaininsightContractmodifytxResponse) SetResultMsg(v string) *PagequeryChaininsightContractmodifytxResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryChaininsightContractmodifytxResponse) SetResult(v *ChainInsightTransactionInfoPageableResponse) *PagequeryChaininsightContractmodifytxResponse {
	s.Result = v
	return s
}

type PagequeryChaininsightAccountmodifytxRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 账户地址
	HexAddress *string `json:"hex_address,omitempty" xml:"hex_address,omitempty" require:"true"`
	// 页码，默认为1
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" minimum:"1"`
	// 页面大小，默认为10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" maximum:"100"`
}

func (s PagequeryChaininsightAccountmodifytxRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryChaininsightAccountmodifytxRequest) GoString() string {
	return s.String()
}

func (s *PagequeryChaininsightAccountmodifytxRequest) SetAuthToken(v string) *PagequeryChaininsightAccountmodifytxRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryChaininsightAccountmodifytxRequest) SetProductInstanceId(v string) *PagequeryChaininsightAccountmodifytxRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryChaininsightAccountmodifytxRequest) SetBizId(v string) *PagequeryChaininsightAccountmodifytxRequest {
	s.BizId = &v
	return s
}

func (s *PagequeryChaininsightAccountmodifytxRequest) SetHexAddress(v string) *PagequeryChaininsightAccountmodifytxRequest {
	s.HexAddress = &v
	return s
}

func (s *PagequeryChaininsightAccountmodifytxRequest) SetPageNo(v int64) *PagequeryChaininsightAccountmodifytxRequest {
	s.PageNo = &v
	return s
}

func (s *PagequeryChaininsightAccountmodifytxRequest) SetPageSize(v int64) *PagequeryChaininsightAccountmodifytxRequest {
	s.PageSize = &v
	return s
}

type PagequeryChaininsightAccountmodifytxResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *ChainInsightTransactionInfoPageableResponse `json:"result,omitempty" xml:"result,omitempty"`
}

func (s PagequeryChaininsightAccountmodifytxResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryChaininsightAccountmodifytxResponse) GoString() string {
	return s.String()
}

func (s *PagequeryChaininsightAccountmodifytxResponse) SetReqMsgId(v string) *PagequeryChaininsightAccountmodifytxResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryChaininsightAccountmodifytxResponse) SetResultCode(v string) *PagequeryChaininsightAccountmodifytxResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryChaininsightAccountmodifytxResponse) SetResultMsg(v string) *PagequeryChaininsightAccountmodifytxResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryChaininsightAccountmodifytxResponse) SetResult(v *ChainInsightTransactionInfoPageableResponse) *PagequeryChaininsightAccountmodifytxResponse {
	s.Result = v
	return s
}

type ListChaininsightAssetinterfacesrequiredRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// ERC标准类型：ERC721 / ERC1155
	ErcType *string `json:"erc_type,omitempty" xml:"erc_type,omitempty" require:"true"`
}

func (s ListChaininsightAssetinterfacesrequiredRequest) String() string {
	return tea.Prettify(s)
}

func (s ListChaininsightAssetinterfacesrequiredRequest) GoString() string {
	return s.String()
}

func (s *ListChaininsightAssetinterfacesrequiredRequest) SetAuthToken(v string) *ListChaininsightAssetinterfacesrequiredRequest {
	s.AuthToken = &v
	return s
}

func (s *ListChaininsightAssetinterfacesrequiredRequest) SetProductInstanceId(v string) *ListChaininsightAssetinterfacesrequiredRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListChaininsightAssetinterfacesrequiredRequest) SetErcType(v string) *ListChaininsightAssetinterfacesrequiredRequest {
	s.ErcType = &v
	return s
}

type ListChaininsightAssetinterfacesrequiredResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result []*ChainInsightContractInterface `json:"result,omitempty" xml:"result,omitempty" type:"Repeated"`
}

func (s ListChaininsightAssetinterfacesrequiredResponse) String() string {
	return tea.Prettify(s)
}

func (s ListChaininsightAssetinterfacesrequiredResponse) GoString() string {
	return s.String()
}

func (s *ListChaininsightAssetinterfacesrequiredResponse) SetReqMsgId(v string) *ListChaininsightAssetinterfacesrequiredResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListChaininsightAssetinterfacesrequiredResponse) SetResultCode(v string) *ListChaininsightAssetinterfacesrequiredResponse {
	s.ResultCode = &v
	return s
}

func (s *ListChaininsightAssetinterfacesrequiredResponse) SetResultMsg(v string) *ListChaininsightAssetinterfacesrequiredResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListChaininsightAssetinterfacesrequiredResponse) SetResult(v []*ChainInsightContractInterface) *ListChaininsightAssetinterfacesrequiredResponse {
	s.Result = v
	return s
}

type QueryChaininsightStatisticassetdetailRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 合约地址
	Contract *string `json:"contract,omitempty" xml:"contract,omitempty" require:"true"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
}

func (s QueryChaininsightStatisticassetdetailRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightStatisticassetdetailRequest) GoString() string {
	return s.String()
}

func (s *QueryChaininsightStatisticassetdetailRequest) SetAuthToken(v string) *QueryChaininsightStatisticassetdetailRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryChaininsightStatisticassetdetailRequest) SetProductInstanceId(v string) *QueryChaininsightStatisticassetdetailRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryChaininsightStatisticassetdetailRequest) SetBizId(v string) *QueryChaininsightStatisticassetdetailRequest {
	s.BizId = &v
	return s
}

func (s *QueryChaininsightStatisticassetdetailRequest) SetContract(v string) *QueryChaininsightStatisticassetdetailRequest {
	s.Contract = &v
	return s
}

func (s *QueryChaininsightStatisticassetdetailRequest) SetAssetId(v string) *QueryChaininsightStatisticassetdetailRequest {
	s.AssetId = &v
	return s
}

type QueryChaininsightStatisticassetdetailResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *ChainInsightAsset `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryChaininsightStatisticassetdetailResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightStatisticassetdetailResponse) GoString() string {
	return s.String()
}

func (s *QueryChaininsightStatisticassetdetailResponse) SetReqMsgId(v string) *QueryChaininsightStatisticassetdetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryChaininsightStatisticassetdetailResponse) SetResultCode(v string) *QueryChaininsightStatisticassetdetailResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryChaininsightStatisticassetdetailResponse) SetResultMsg(v string) *QueryChaininsightStatisticassetdetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryChaininsightStatisticassetdetailResponse) SetResult(v *ChainInsightAsset) *QueryChaininsightStatisticassetdetailResponse {
	s.Result = v
	return s
}

type QueryChaininsightStatisticassetmetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 合约地址
	Contract *string `json:"contract,omitempty" xml:"contract,omitempty" require:"true"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
}

func (s QueryChaininsightStatisticassetmetaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightStatisticassetmetaRequest) GoString() string {
	return s.String()
}

func (s *QueryChaininsightStatisticassetmetaRequest) SetAuthToken(v string) *QueryChaininsightStatisticassetmetaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryChaininsightStatisticassetmetaRequest) SetProductInstanceId(v string) *QueryChaininsightStatisticassetmetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryChaininsightStatisticassetmetaRequest) SetBizId(v string) *QueryChaininsightStatisticassetmetaRequest {
	s.BizId = &v
	return s
}

func (s *QueryChaininsightStatisticassetmetaRequest) SetContract(v string) *QueryChaininsightStatisticassetmetaRequest {
	s.Contract = &v
	return s
}

func (s *QueryChaininsightStatisticassetmetaRequest) SetAssetId(v string) *QueryChaininsightStatisticassetmetaRequest {
	s.AssetId = &v
	return s
}

type QueryChaininsightStatisticassetmetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *ChainInsightAssetMeta `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryChaininsightStatisticassetmetaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightStatisticassetmetaResponse) GoString() string {
	return s.String()
}

func (s *QueryChaininsightStatisticassetmetaResponse) SetReqMsgId(v string) *QueryChaininsightStatisticassetmetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryChaininsightStatisticassetmetaResponse) SetResultCode(v string) *QueryChaininsightStatisticassetmetaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryChaininsightStatisticassetmetaResponse) SetResultMsg(v string) *QueryChaininsightStatisticassetmetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryChaininsightStatisticassetmetaResponse) SetResult(v *ChainInsightAssetMeta) *QueryChaininsightStatisticassetmetaResponse {
	s.Result = v
	return s
}

type PagequeryChaininsightStatisticassetownerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 合约地址
	Contract *string `json:"contract,omitempty" xml:"contract,omitempty" require:"true"`
	// 资产ID，可空，支持模糊搜索（既可以是assetId，也可以是数字权证链1155资产特有的shardId）
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 数字权证链1155合约的分片ID
	ShardId *string `json:"shard_id,omitempty" xml:"shard_id,omitempty"`
	// 页数，从 1 开始，缺省值为1
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" minimum:"1"`
	// 页面大小，缺省值为10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" maximum:"100" minimum:"1"`
}

func (s PagequeryChaininsightStatisticassetownerRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryChaininsightStatisticassetownerRequest) GoString() string {
	return s.String()
}

func (s *PagequeryChaininsightStatisticassetownerRequest) SetAuthToken(v string) *PagequeryChaininsightStatisticassetownerRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryChaininsightStatisticassetownerRequest) SetProductInstanceId(v string) *PagequeryChaininsightStatisticassetownerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryChaininsightStatisticassetownerRequest) SetBizId(v string) *PagequeryChaininsightStatisticassetownerRequest {
	s.BizId = &v
	return s
}

func (s *PagequeryChaininsightStatisticassetownerRequest) SetContract(v string) *PagequeryChaininsightStatisticassetownerRequest {
	s.Contract = &v
	return s
}

func (s *PagequeryChaininsightStatisticassetownerRequest) SetAssetId(v string) *PagequeryChaininsightStatisticassetownerRequest {
	s.AssetId = &v
	return s
}

func (s *PagequeryChaininsightStatisticassetownerRequest) SetShardId(v string) *PagequeryChaininsightStatisticassetownerRequest {
	s.ShardId = &v
	return s
}

func (s *PagequeryChaininsightStatisticassetownerRequest) SetPageNo(v int64) *PagequeryChaininsightStatisticassetownerRequest {
	s.PageNo = &v
	return s
}

func (s *PagequeryChaininsightStatisticassetownerRequest) SetPageSize(v int64) *PagequeryChaininsightStatisticassetownerRequest {
	s.PageSize = &v
	return s
}

type PagequeryChaininsightStatisticassetownerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *ChainInsightAssetOwnersResponse `json:"result,omitempty" xml:"result,omitempty"`
}

func (s PagequeryChaininsightStatisticassetownerResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryChaininsightStatisticassetownerResponse) GoString() string {
	return s.String()
}

func (s *PagequeryChaininsightStatisticassetownerResponse) SetReqMsgId(v string) *PagequeryChaininsightStatisticassetownerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryChaininsightStatisticassetownerResponse) SetResultCode(v string) *PagequeryChaininsightStatisticassetownerResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryChaininsightStatisticassetownerResponse) SetResultMsg(v string) *PagequeryChaininsightStatisticassetownerResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryChaininsightStatisticassetownerResponse) SetResult(v *ChainInsightAssetOwnersResponse) *PagequeryChaininsightStatisticassetownerResponse {
	s.Result = v
	return s
}

type PagequeryChaininsightStatisticassetinventoryaccountRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 账户地址
	Account *string `json:"account,omitempty" xml:"account,omitempty" require:"true"`
	// 资产ID，可空，支持模糊搜索（既可以是assetId，也可以是数字权证链1155资产特有的shardId）
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 页数，从1开始，缺省值为1
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" minimum:"1"`
	// 页面大小，缺省值为10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" maximum:"100" minimum:"1"`
}

func (s PagequeryChaininsightStatisticassetinventoryaccountRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryChaininsightStatisticassetinventoryaccountRequest) GoString() string {
	return s.String()
}

func (s *PagequeryChaininsightStatisticassetinventoryaccountRequest) SetAuthToken(v string) *PagequeryChaininsightStatisticassetinventoryaccountRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryChaininsightStatisticassetinventoryaccountRequest) SetProductInstanceId(v string) *PagequeryChaininsightStatisticassetinventoryaccountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryChaininsightStatisticassetinventoryaccountRequest) SetBizId(v string) *PagequeryChaininsightStatisticassetinventoryaccountRequest {
	s.BizId = &v
	return s
}

func (s *PagequeryChaininsightStatisticassetinventoryaccountRequest) SetAccount(v string) *PagequeryChaininsightStatisticassetinventoryaccountRequest {
	s.Account = &v
	return s
}

func (s *PagequeryChaininsightStatisticassetinventoryaccountRequest) SetAssetId(v string) *PagequeryChaininsightStatisticassetinventoryaccountRequest {
	s.AssetId = &v
	return s
}

func (s *PagequeryChaininsightStatisticassetinventoryaccountRequest) SetPageNo(v int64) *PagequeryChaininsightStatisticassetinventoryaccountRequest {
	s.PageNo = &v
	return s
}

func (s *PagequeryChaininsightStatisticassetinventoryaccountRequest) SetPageSize(v int64) *PagequeryChaininsightStatisticassetinventoryaccountRequest {
	s.PageSize = &v
	return s
}

type PagequeryChaininsightStatisticassetinventoryaccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *ChainInsightAssetsResponse `json:"result,omitempty" xml:"result,omitempty"`
}

func (s PagequeryChaininsightStatisticassetinventoryaccountResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryChaininsightStatisticassetinventoryaccountResponse) GoString() string {
	return s.String()
}

func (s *PagequeryChaininsightStatisticassetinventoryaccountResponse) SetReqMsgId(v string) *PagequeryChaininsightStatisticassetinventoryaccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryChaininsightStatisticassetinventoryaccountResponse) SetResultCode(v string) *PagequeryChaininsightStatisticassetinventoryaccountResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryChaininsightStatisticassetinventoryaccountResponse) SetResultMsg(v string) *PagequeryChaininsightStatisticassetinventoryaccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryChaininsightStatisticassetinventoryaccountResponse) SetResult(v *ChainInsightAssetsResponse) *PagequeryChaininsightStatisticassetinventoryaccountResponse {
	s.Result = v
	return s
}

type PagequeryChaininsightStatisticassethistoryassetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 合约地址
	Contract *string `json:"contract,omitempty" xml:"contract,omitempty" require:"true"`
	// 资产ID，支持模糊搜索（既可以是assetId，也可以是数字权证链1155合约特有的shardId）
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 分片ID，可空
	ShardId *string `json:"shard_id,omitempty" xml:"shard_id,omitempty"`
	// 页数，从 1 开始，缺省值为1
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" minimum:"1"`
	// 页面大小，缺省值为10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" maximum:"100" minimum:"1"`
}

func (s PagequeryChaininsightStatisticassethistoryassetRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryChaininsightStatisticassethistoryassetRequest) GoString() string {
	return s.String()
}

func (s *PagequeryChaininsightStatisticassethistoryassetRequest) SetAuthToken(v string) *PagequeryChaininsightStatisticassethistoryassetRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryChaininsightStatisticassethistoryassetRequest) SetProductInstanceId(v string) *PagequeryChaininsightStatisticassethistoryassetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryChaininsightStatisticassethistoryassetRequest) SetBizId(v string) *PagequeryChaininsightStatisticassethistoryassetRequest {
	s.BizId = &v
	return s
}

func (s *PagequeryChaininsightStatisticassethistoryassetRequest) SetContract(v string) *PagequeryChaininsightStatisticassethistoryassetRequest {
	s.Contract = &v
	return s
}

func (s *PagequeryChaininsightStatisticassethistoryassetRequest) SetAssetId(v string) *PagequeryChaininsightStatisticassethistoryassetRequest {
	s.AssetId = &v
	return s
}

func (s *PagequeryChaininsightStatisticassethistoryassetRequest) SetShardId(v string) *PagequeryChaininsightStatisticassethistoryassetRequest {
	s.ShardId = &v
	return s
}

func (s *PagequeryChaininsightStatisticassethistoryassetRequest) SetPageNo(v int64) *PagequeryChaininsightStatisticassethistoryassetRequest {
	s.PageNo = &v
	return s
}

func (s *PagequeryChaininsightStatisticassethistoryassetRequest) SetPageSize(v int64) *PagequeryChaininsightStatisticassethistoryassetRequest {
	s.PageSize = &v
	return s
}

type PagequeryChaininsightStatisticassethistoryassetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *ChainInsightAssetOperationsResponse `json:"result,omitempty" xml:"result,omitempty"`
}

func (s PagequeryChaininsightStatisticassethistoryassetResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryChaininsightStatisticassethistoryassetResponse) GoString() string {
	return s.String()
}

func (s *PagequeryChaininsightStatisticassethistoryassetResponse) SetReqMsgId(v string) *PagequeryChaininsightStatisticassethistoryassetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryChaininsightStatisticassethistoryassetResponse) SetResultCode(v string) *PagequeryChaininsightStatisticassethistoryassetResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryChaininsightStatisticassethistoryassetResponse) SetResultMsg(v string) *PagequeryChaininsightStatisticassethistoryassetResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryChaininsightStatisticassethistoryassetResponse) SetResult(v *ChainInsightAssetOperationsResponse) *PagequeryChaininsightStatisticassethistoryassetResponse {
	s.Result = v
	return s
}

type PagequeryChaininsightStatisticassethistorycontractRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 合约地址
	Contract *string `json:"contract,omitempty" xml:"contract,omitempty" require:"true"`
	// 资产ID，支持模糊搜索（既可以是assetId，也可以是数字权证链1155资产特有的shardId）
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 数字权证链1155资产的分片ID
	ShardId *string `json:"shard_id,omitempty" xml:"shard_id,omitempty"`
	// 页数，从 1 开始，缺省值：1
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" minimum:"1"`
	// 页面大小，缺省值：10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" maximum:"100" minimum:"1"`
}

func (s PagequeryChaininsightStatisticassethistorycontractRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryChaininsightStatisticassethistorycontractRequest) GoString() string {
	return s.String()
}

func (s *PagequeryChaininsightStatisticassethistorycontractRequest) SetAuthToken(v string) *PagequeryChaininsightStatisticassethistorycontractRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryChaininsightStatisticassethistorycontractRequest) SetProductInstanceId(v string) *PagequeryChaininsightStatisticassethistorycontractRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryChaininsightStatisticassethistorycontractRequest) SetBizId(v string) *PagequeryChaininsightStatisticassethistorycontractRequest {
	s.BizId = &v
	return s
}

func (s *PagequeryChaininsightStatisticassethistorycontractRequest) SetContract(v string) *PagequeryChaininsightStatisticassethistorycontractRequest {
	s.Contract = &v
	return s
}

func (s *PagequeryChaininsightStatisticassethistorycontractRequest) SetAssetId(v string) *PagequeryChaininsightStatisticassethistorycontractRequest {
	s.AssetId = &v
	return s
}

func (s *PagequeryChaininsightStatisticassethistorycontractRequest) SetShardId(v string) *PagequeryChaininsightStatisticassethistorycontractRequest {
	s.ShardId = &v
	return s
}

func (s *PagequeryChaininsightStatisticassethistorycontractRequest) SetPageNo(v int64) *PagequeryChaininsightStatisticassethistorycontractRequest {
	s.PageNo = &v
	return s
}

func (s *PagequeryChaininsightStatisticassethistorycontractRequest) SetPageSize(v int64) *PagequeryChaininsightStatisticassethistorycontractRequest {
	s.PageSize = &v
	return s
}

type PagequeryChaininsightStatisticassethistorycontractResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *ChainInsightAssetOperationsResponse `json:"result,omitempty" xml:"result,omitempty"`
}

func (s PagequeryChaininsightStatisticassethistorycontractResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryChaininsightStatisticassethistorycontractResponse) GoString() string {
	return s.String()
}

func (s *PagequeryChaininsightStatisticassethistorycontractResponse) SetReqMsgId(v string) *PagequeryChaininsightStatisticassethistorycontractResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryChaininsightStatisticassethistorycontractResponse) SetResultCode(v string) *PagequeryChaininsightStatisticassethistorycontractResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryChaininsightStatisticassethistorycontractResponse) SetResultMsg(v string) *PagequeryChaininsightStatisticassethistorycontractResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryChaininsightStatisticassethistorycontractResponse) SetResult(v *ChainInsightAssetOperationsResponse) *PagequeryChaininsightStatisticassethistorycontractResponse {
	s.Result = v
	return s
}

type QueryChaininsightContracttimelineconfigRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 链上地址：合约 / 存证账户
	HexAddress *string `json:"hex_address,omitempty" xml:"hex_address,omitempty" require:"true"`
	// 需要更新的区块高度（会更新生效区间包含该高度的时间轴配置）
	Ver *string `json:"ver,omitempty" xml:"ver,omitempty" require:"true"`
}

func (s QueryChaininsightContracttimelineconfigRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightContracttimelineconfigRequest) GoString() string {
	return s.String()
}

func (s *QueryChaininsightContracttimelineconfigRequest) SetAuthToken(v string) *QueryChaininsightContracttimelineconfigRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryChaininsightContracttimelineconfigRequest) SetProductInstanceId(v string) *QueryChaininsightContracttimelineconfigRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryChaininsightContracttimelineconfigRequest) SetBizId(v string) *QueryChaininsightContracttimelineconfigRequest {
	s.BizId = &v
	return s
}

func (s *QueryChaininsightContracttimelineconfigRequest) SetHexAddress(v string) *QueryChaininsightContracttimelineconfigRequest {
	s.HexAddress = &v
	return s
}

func (s *QueryChaininsightContracttimelineconfigRequest) SetVer(v string) *QueryChaininsightContracttimelineconfigRequest {
	s.Ver = &v
	return s
}

type QueryChaininsightContracttimelineconfigResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *AddressTimelineConfig `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryChaininsightContracttimelineconfigResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryChaininsightContracttimelineconfigResponse) GoString() string {
	return s.String()
}

func (s *QueryChaininsightContracttimelineconfigResponse) SetReqMsgId(v string) *QueryChaininsightContracttimelineconfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryChaininsightContracttimelineconfigResponse) SetResultCode(v string) *QueryChaininsightContracttimelineconfigResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryChaininsightContracttimelineconfigResponse) SetResultMsg(v string) *QueryChaininsightContracttimelineconfigResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryChaininsightContracttimelineconfigResponse) SetResult(v *AddressTimelineConfig) *QueryChaininsightContracttimelineconfigResponse {
	s.Result = v
	return s
}

type UpdateChaininsightContracttimelineconfigRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 链上地址：合约 / 存证账户
	HexAddress *string `json:"hex_address,omitempty" xml:"hex_address,omitempty" require:"true"`
	// 需要更新的区块高度（会更新生效区间包含该高度的时间轴配置）
	Ver *string `json:"ver,omitempty" xml:"ver,omitempty" require:"true"`
	// 时间轴配置
	TimelineConfig *AddressTimelineConfig `json:"timeline_config,omitempty" xml:"timeline_config,omitempty" require:"true"`
}

func (s UpdateChaininsightContracttimelineconfigRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateChaininsightContracttimelineconfigRequest) GoString() string {
	return s.String()
}

func (s *UpdateChaininsightContracttimelineconfigRequest) SetAuthToken(v string) *UpdateChaininsightContracttimelineconfigRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateChaininsightContracttimelineconfigRequest) SetProductInstanceId(v string) *UpdateChaininsightContracttimelineconfigRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateChaininsightContracttimelineconfigRequest) SetBizId(v string) *UpdateChaininsightContracttimelineconfigRequest {
	s.BizId = &v
	return s
}

func (s *UpdateChaininsightContracttimelineconfigRequest) SetHexAddress(v string) *UpdateChaininsightContracttimelineconfigRequest {
	s.HexAddress = &v
	return s
}

func (s *UpdateChaininsightContracttimelineconfigRequest) SetVer(v string) *UpdateChaininsightContracttimelineconfigRequest {
	s.Ver = &v
	return s
}

func (s *UpdateChaininsightContracttimelineconfigRequest) SetTimelineConfig(v *AddressTimelineConfig) *UpdateChaininsightContracttimelineconfigRequest {
	s.TimelineConfig = v
	return s
}

type UpdateChaininsightContracttimelineconfigResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s UpdateChaininsightContracttimelineconfigResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateChaininsightContracttimelineconfigResponse) GoString() string {
	return s.String()
}

func (s *UpdateChaininsightContracttimelineconfigResponse) SetReqMsgId(v string) *UpdateChaininsightContracttimelineconfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateChaininsightContracttimelineconfigResponse) SetResultCode(v string) *UpdateChaininsightContracttimelineconfigResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateChaininsightContracttimelineconfigResponse) SetResultMsg(v string) *UpdateChaininsightContracttimelineconfigResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateChaininsightContracttimelineconfigResponse) SetResult(v string) *UpdateChaininsightContracttimelineconfigResponse {
	s.Result = &v
	return s
}

type SaveChaininsightContractinterfaceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 合约 / 存证账户地址
	Contract *string `json:"contract,omitempty" xml:"contract,omitempty" require:"true"`
	// 生效块高
	Ver *string `json:"ver,omitempty" xml:"ver,omitempty"`
	// 接口类型，Function / Event
	InterfaceType *string `json:"interface_type,omitempty" xml:"interface_type,omitempty" require:"true"`
	// 接口列表
	ContractInterfaces []*ChainInsightContractInterface `json:"contract_interfaces,omitempty" xml:"contract_interfaces,omitempty" require:"true" type:"Repeated"`
}

func (s SaveChaininsightContractinterfaceRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveChaininsightContractinterfaceRequest) GoString() string {
	return s.String()
}

func (s *SaveChaininsightContractinterfaceRequest) SetAuthToken(v string) *SaveChaininsightContractinterfaceRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveChaininsightContractinterfaceRequest) SetProductInstanceId(v string) *SaveChaininsightContractinterfaceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveChaininsightContractinterfaceRequest) SetBizId(v string) *SaveChaininsightContractinterfaceRequest {
	s.BizId = &v
	return s
}

func (s *SaveChaininsightContractinterfaceRequest) SetContract(v string) *SaveChaininsightContractinterfaceRequest {
	s.Contract = &v
	return s
}

func (s *SaveChaininsightContractinterfaceRequest) SetVer(v string) *SaveChaininsightContractinterfaceRequest {
	s.Ver = &v
	return s
}

func (s *SaveChaininsightContractinterfaceRequest) SetInterfaceType(v string) *SaveChaininsightContractinterfaceRequest {
	s.InterfaceType = &v
	return s
}

func (s *SaveChaininsightContractinterfaceRequest) SetContractInterfaces(v []*ChainInsightContractInterface) *SaveChaininsightContractinterfaceRequest {
	s.ContractInterfaces = v
	return s
}

type SaveChaininsightContractinterfaceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s SaveChaininsightContractinterfaceResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveChaininsightContractinterfaceResponse) GoString() string {
	return s.String()
}

func (s *SaveChaininsightContractinterfaceResponse) SetReqMsgId(v string) *SaveChaininsightContractinterfaceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveChaininsightContractinterfaceResponse) SetResultCode(v string) *SaveChaininsightContractinterfaceResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveChaininsightContractinterfaceResponse) SetResultMsg(v string) *SaveChaininsightContractinterfaceResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveChaininsightContractinterfaceResponse) SetResult(v string) *SaveChaininsightContractinterfaceResponse {
	s.Result = &v
	return s
}

type RegisterChainsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链唯一标识符
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 链配置的最后更新时间（用于标识版本）
	Ver *int64 `json:"ver,omitempty" xml:"ver,omitempty" require:"true"`
	// 链类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 节点RPC接口地址
	MychainNodes []*string `json:"mychain_nodes,omitempty" xml:"mychain_nodes,omitempty" type:"Repeated"`
	// MyChain版本
	MychainType *string `json:"mychain_type,omitempty" xml:"mychain_type,omitempty"`
	// base64编码的JDS
	MychainTruststore *string `json:"mychain_truststore,omitempty" xml:"mychain_truststore,omitempty"`
	// -
	MychainTruststorePassword *string `json:"mychain_truststore_password,omitempty" xml:"mychain_truststore_password,omitempty"`
	// -
	MychainClientCrt *string `json:"mychain_client_crt,omitempty" xml:"mychain_client_crt,omitempty"`
	// -
	MychainClientKey *string `json:"mychain_client_key,omitempty" xml:"mychain_client_key,omitempty"`
	// -
	MychainClientKeyPwd *string `json:"mychain_client_key_pwd,omitempty" xml:"mychain_client_key_pwd,omitempty"`
	// -
	MychainTlsAlgo *string `json:"mychain_tls_algo,omitempty" xml:"mychain_tls_algo,omitempty"`
	// -
	MychainIdentityAlgo *string `json:"mychain_identity_algo,omitempty" xml:"mychain_identity_algo,omitempty"`
	// 子链 groupID
	MychainGroupid *string `json:"mychain_groupid,omitempty" xml:"mychain_groupid,omitempty"`
	// 子链的父链ID
	MychainParentBizid *string `json:"mychain_parent_bizid,omitempty" xml:"mychain_parent_bizid,omitempty"`
	// Aldaba 链节点地址
	AldabaNodes []*string `json:"aldaba_nodes,omitempty" xml:"aldaba_nodes,omitempty" type:"Repeated"`
	// Aldaba 链使用的协议，支持 WebSocket / Tcp; 默认 WebSocket
	AldabaNetworkProtocol *string `json:"aldaba_network_protocol,omitempty" xml:"aldaba_network_protocol,omitempty"`
	// Aldaba 链base64编码的JDS
	AldabaTlsRootTruststore *string `json:"aldaba_tls_root_truststore,omitempty" xml:"aldaba_tls_root_truststore,omitempty"`
	// Aldaba 链 JDS 密码
	AldabaTlsRootTruststorePassword *string `json:"aldaba_tls_root_truststore_password,omitempty" xml:"aldaba_tls_root_truststore_password,omitempty"`
	// Aldaba 链 base64编码的证书
	AldabaTlsClientCertificate *string `json:"aldaba_tls_client_certificate,omitempty" xml:"aldaba_tls_client_certificate,omitempty"`
	// Aldaba 链 base64编码的密钥
	AldabaTlsClientKey *string `json:"aldaba_tls_client_key,omitempty" xml:"aldaba_tls_client_key,omitempty"`
	// Aldaba 链密钥密码
	AldabaTlsClientKeyPassword *string `json:"aldaba_tls_client_key_password,omitempty" xml:"aldaba_tls_client_key_password,omitempty"`
	// Aldaba 链 base64 编码的 sender 密钥
	AldabaSenderKey *string `json:"aldaba_sender_key,omitempty" xml:"aldaba_sender_key,omitempty"`
	// Aldaba 链 sender 密钥的密码
	AldabaSenderKeyPassword *string `json:"aldaba_sender_key_password,omitempty" xml:"aldaba_sender_key_password,omitempty"`
}

func (s RegisterChainsRequest) String() string {
	return tea.Prettify(s)
}

func (s RegisterChainsRequest) GoString() string {
	return s.String()
}

func (s *RegisterChainsRequest) SetAuthToken(v string) *RegisterChainsRequest {
	s.AuthToken = &v
	return s
}

func (s *RegisterChainsRequest) SetProductInstanceId(v string) *RegisterChainsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RegisterChainsRequest) SetBizId(v string) *RegisterChainsRequest {
	s.BizId = &v
	return s
}

func (s *RegisterChainsRequest) SetVer(v int64) *RegisterChainsRequest {
	s.Ver = &v
	return s
}

func (s *RegisterChainsRequest) SetType(v string) *RegisterChainsRequest {
	s.Type = &v
	return s
}

func (s *RegisterChainsRequest) SetMychainNodes(v []*string) *RegisterChainsRequest {
	s.MychainNodes = v
	return s
}

func (s *RegisterChainsRequest) SetMychainType(v string) *RegisterChainsRequest {
	s.MychainType = &v
	return s
}

func (s *RegisterChainsRequest) SetMychainTruststore(v string) *RegisterChainsRequest {
	s.MychainTruststore = &v
	return s
}

func (s *RegisterChainsRequest) SetMychainTruststorePassword(v string) *RegisterChainsRequest {
	s.MychainTruststorePassword = &v
	return s
}

func (s *RegisterChainsRequest) SetMychainClientCrt(v string) *RegisterChainsRequest {
	s.MychainClientCrt = &v
	return s
}

func (s *RegisterChainsRequest) SetMychainClientKey(v string) *RegisterChainsRequest {
	s.MychainClientKey = &v
	return s
}

func (s *RegisterChainsRequest) SetMychainClientKeyPwd(v string) *RegisterChainsRequest {
	s.MychainClientKeyPwd = &v
	return s
}

func (s *RegisterChainsRequest) SetMychainTlsAlgo(v string) *RegisterChainsRequest {
	s.MychainTlsAlgo = &v
	return s
}

func (s *RegisterChainsRequest) SetMychainIdentityAlgo(v string) *RegisterChainsRequest {
	s.MychainIdentityAlgo = &v
	return s
}

func (s *RegisterChainsRequest) SetMychainGroupid(v string) *RegisterChainsRequest {
	s.MychainGroupid = &v
	return s
}

func (s *RegisterChainsRequest) SetMychainParentBizid(v string) *RegisterChainsRequest {
	s.MychainParentBizid = &v
	return s
}

func (s *RegisterChainsRequest) SetAldabaNodes(v []*string) *RegisterChainsRequest {
	s.AldabaNodes = v
	return s
}

func (s *RegisterChainsRequest) SetAldabaNetworkProtocol(v string) *RegisterChainsRequest {
	s.AldabaNetworkProtocol = &v
	return s
}

func (s *RegisterChainsRequest) SetAldabaTlsRootTruststore(v string) *RegisterChainsRequest {
	s.AldabaTlsRootTruststore = &v
	return s
}

func (s *RegisterChainsRequest) SetAldabaTlsRootTruststorePassword(v string) *RegisterChainsRequest {
	s.AldabaTlsRootTruststorePassword = &v
	return s
}

func (s *RegisterChainsRequest) SetAldabaTlsClientCertificate(v string) *RegisterChainsRequest {
	s.AldabaTlsClientCertificate = &v
	return s
}

func (s *RegisterChainsRequest) SetAldabaTlsClientKey(v string) *RegisterChainsRequest {
	s.AldabaTlsClientKey = &v
	return s
}

func (s *RegisterChainsRequest) SetAldabaTlsClientKeyPassword(v string) *RegisterChainsRequest {
	s.AldabaTlsClientKeyPassword = &v
	return s
}

func (s *RegisterChainsRequest) SetAldabaSenderKey(v string) *RegisterChainsRequest {
	s.AldabaSenderKey = &v
	return s
}

func (s *RegisterChainsRequest) SetAldabaSenderKeyPassword(v string) *RegisterChainsRequest {
	s.AldabaSenderKeyPassword = &v
	return s
}

type RegisterChainsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RegisterChainsResponse) String() string {
	return tea.Prettify(s)
}

func (s RegisterChainsResponse) GoString() string {
	return s.String()
}

func (s *RegisterChainsResponse) SetReqMsgId(v string) *RegisterChainsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RegisterChainsResponse) SetResultCode(v string) *RegisterChainsResponse {
	s.ResultCode = &v
	return s
}

func (s *RegisterChainsResponse) SetResultMsg(v string) *RegisterChainsResponse {
	s.ResultMsg = &v
	return s
}

type OperateChainsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// -
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 不留空表示给租户开通权限
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 操作类型，默认留空表示开通
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s OperateChainsRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateChainsRequest) GoString() string {
	return s.String()
}

func (s *OperateChainsRequest) SetAuthToken(v string) *OperateChainsRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateChainsRequest) SetProductInstanceId(v string) *OperateChainsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateChainsRequest) SetBizId(v string) *OperateChainsRequest {
	s.BizId = &v
	return s
}

func (s *OperateChainsRequest) SetTenantId(v string) *OperateChainsRequest {
	s.TenantId = &v
	return s
}

func (s *OperateChainsRequest) SetType(v string) *OperateChainsRequest {
	s.Type = &v
	return s
}

type OperateChainsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s OperateChainsResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateChainsResponse) GoString() string {
	return s.String()
}

func (s *OperateChainsResponse) SetReqMsgId(v string) *OperateChainsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateChainsResponse) SetResultCode(v string) *OperateChainsResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateChainsResponse) SetResultMsg(v string) *OperateChainsResponse {
	s.ResultMsg = &v
	return s
}

type GetChainsStatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// -
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// -
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s GetChainsStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s GetChainsStatusRequest) GoString() string {
	return s.String()
}

func (s *GetChainsStatusRequest) SetAuthToken(v string) *GetChainsStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *GetChainsStatusRequest) SetProductInstanceId(v string) *GetChainsStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetChainsStatusRequest) SetBizId(v string) *GetChainsStatusRequest {
	s.BizId = &v
	return s
}

func (s *GetChainsStatusRequest) SetTenantId(v string) *GetChainsStatusRequest {
	s.TenantId = &v
	return s
}

type GetChainsStatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// -
	Status []*ServiceStatus `json:"status,omitempty" xml:"status,omitempty" type:"Repeated"`
}

func (s GetChainsStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s GetChainsStatusResponse) GoString() string {
	return s.String()
}

func (s *GetChainsStatusResponse) SetReqMsgId(v string) *GetChainsStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetChainsStatusResponse) SetResultCode(v string) *GetChainsStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *GetChainsStatusResponse) SetResultMsg(v string) *GetChainsStatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetChainsStatusResponse) SetStatus(v []*ServiceStatus) *GetChainsStatusResponse {
	s.Status = v
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
				"sdk_version":      tea.String("1.4.10"),
				"_prod_code":       tea.String("BAASDATAGW"),
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
 * Description: 检索索引的链上数据
 * Summary: 检索索引的链上数据
 */
func (client *Client) QueryDatasearchSearch(request *QueryDatasearchSearchRequest) (_result *QueryDatasearchSearchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDatasearchSearchResponse{}
	_body, _err := client.QueryDatasearchSearchEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 检索索引的链上数据
 * Summary: 检索索引的链上数据
 */
func (client *Client) QueryDatasearchSearchEx(request *QueryDatasearchSearchRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDatasearchSearchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDatasearchSearchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.datasearch.search.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 针对某个数据类型的数据开启索引；该方法可重入
 * Summary: 开启数据索引
 */
func (client *Client) StartDatasearchIndex(request *StartDatasearchIndexRequest) (_result *StartDatasearchIndexResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartDatasearchIndexResponse{}
	_body, _err := client.StartDatasearchIndexEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 针对某个数据类型的数据开启索引；该方法可重入
 * Summary: 开启数据索引
 */
func (client *Client) StartDatasearchIndexEx(request *StartDatasearchIndexRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartDatasearchIndexResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartDatasearchIndexResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.datasearch.index.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 针对某个分组的数据停止索引；该方法可重入
 * Summary: 停止数据索引
 */
func (client *Client) StopDatasearchIndex(request *StopDatasearchIndexRequest) (_result *StopDatasearchIndexResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StopDatasearchIndexResponse{}
	_body, _err := client.StopDatasearchIndexEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 针对某个分组的数据停止索引；该方法可重入
 * Summary: 停止数据索引
 */
func (client *Client) StopDatasearchIndexEx(request *StopDatasearchIndexRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StopDatasearchIndexResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StopDatasearchIndexResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.datasearch.index.stop"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 针对某个分组的数据删除索引（ES 中的数据仍然存在, 不会删除）；该方法不可重入
 * Summary: 删除数据索引
 */
func (client *Client) RemoveDatasearchIndex(request *RemoveDatasearchIndexRequest) (_result *RemoveDatasearchIndexResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RemoveDatasearchIndexResponse{}
	_body, _err := client.RemoveDatasearchIndexEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 针对某个分组的数据删除索引（ES 中的数据仍然存在, 不会删除）；该方法不可重入
 * Summary: 删除数据索引
 */
func (client *Client) RemoveDatasearchIndexEx(request *RemoveDatasearchIndexRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RemoveDatasearchIndexResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RemoveDatasearchIndexResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.datasearch.index.remove"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询分组的索引进度，返回当前索引的索引进度（块高）
 * Summary: 查询数据索引进度
 */
func (client *Client) GetDatasearchIndex(request *GetDatasearchIndexRequest) (_result *GetDatasearchIndexResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetDatasearchIndexResponse{}
	_body, _err := client.GetDatasearchIndexEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询分组的索引进度，返回当前索引的索引进度（块高）
 * Summary: 查询数据索引进度
 */
func (client *Client) GetDatasearchIndexEx(request *GetDatasearchIndexRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetDatasearchIndexResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDatasearchIndexResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.datasearch.index.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 列出租户在链上的所有合约Meta
 * Summary: 列出租户在链上的所有合约Meta
 */
func (client *Client) ListContractmeta(request *ListContractmetaRequest) (_result *ListContractmetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListContractmetaResponse{}
	_body, _err := client.ListContractmetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 列出租户在链上的所有合约Meta
 * Summary: 列出租户在链上的所有合约Meta
 */
func (client *Client) ListContractmetaEx(request *ListContractmetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListContractmetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListContractmetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.contractmeta.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新增合约Meta
 * Summary: 新增合约Meta
 */
func (client *Client) AddContractmeta(request *AddContractmetaRequest) (_result *AddContractmetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddContractmetaResponse{}
	_body, _err := client.AddContractmetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新增合约Meta
 * Summary: 新增合约Meta
 */
func (client *Client) AddContractmetaEx(request *AddContractmetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddContractmetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddContractmetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.contractmeta.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除合约meta
 * Summary: 删除合约meta
 */
func (client *Client) DeleteContractmeta(request *DeleteContractmetaRequest) (_result *DeleteContractmetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteContractmetaResponse{}
	_body, _err := client.DeleteContractmetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除合约meta
 * Summary: 删除合约meta
 */
func (client *Client) DeleteContractmetaEx(request *DeleteContractmetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteContractmetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteContractmetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.contractmeta.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询meta具体信息
 * Summary: 获取meta信息
 */
func (client *Client) GetContractmeta(request *GetContractmetaRequest) (_result *GetContractmetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetContractmetaResponse{}
	_body, _err := client.GetContractmetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询meta具体信息
 * Summary: 获取meta信息
 */
func (client *Client) GetContractmetaEx(request *GetContractmetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetContractmetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetContractmetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.contractmeta.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取导出任务预览数据的异步任务ID
 * Summary: 获取导出任务预览数据的异步任务ID
 */
func (client *Client) CreateDataexportPreviewdata(request *CreateDataexportPreviewdataRequest) (_result *CreateDataexportPreviewdataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDataexportPreviewdataResponse{}
	_body, _err := client.CreateDataexportPreviewdataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取导出任务预览数据的异步任务ID
 * Summary: 获取导出任务预览数据的异步任务ID
 */
func (client *Client) CreateDataexportPreviewdataEx(request *CreateDataexportPreviewdataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDataexportPreviewdataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDataexportPreviewdataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.dataexport.previewdata.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询数据预览任务结果
 * Summary: 查询数据预览任务结果
 */
func (client *Client) QueryDataexportPreviewdata(request *QueryDataexportPreviewdataRequest) (_result *QueryDataexportPreviewdataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDataexportPreviewdataResponse{}
	_body, _err := client.QueryDataexportPreviewdataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询数据预览任务结果
 * Summary: 查询数据预览任务结果
 */
func (client *Client) QueryDataexportPreviewdataEx(request *QueryDataexportPreviewdataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDataexportPreviewdataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDataexportPreviewdataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.dataexport.previewdata.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询默认字段映射
 * Summary: 查询默认字段映射
 */
func (client *Client) GetDataexportPreviewsmapping(request *GetDataexportPreviewsmappingRequest) (_result *GetDataexportPreviewsmappingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetDataexportPreviewsmappingResponse{}
	_body, _err := client.GetDataexportPreviewsmappingEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询默认字段映射
 * Summary: 查询默认字段映射
 */
func (client *Client) GetDataexportPreviewsmappingEx(request *GetDataexportPreviewsmappingRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetDataexportPreviewsmappingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDataexportPreviewsmappingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.dataexport.previewsmapping.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建导出任务
 * Summary: 创建导出任务
 */
func (client *Client) CreateDataexportTrigger(request *CreateDataexportTriggerRequest) (_result *CreateDataexportTriggerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDataexportTriggerResponse{}
	_body, _err := client.CreateDataexportTriggerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建导出任务
 * Summary: 创建导出任务
 */
func (client *Client) CreateDataexportTriggerEx(request *CreateDataexportTriggerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDataexportTriggerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDataexportTriggerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.dataexport.trigger.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询建表语句
 * Summary: 查询建表语句
 */
func (client *Client) QueryDataexportPreviewsql(request *QueryDataexportPreviewsqlRequest) (_result *QueryDataexportPreviewsqlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDataexportPreviewsqlResponse{}
	_body, _err := client.QueryDataexportPreviewsqlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询建表语句
 * Summary: 查询建表语句
 */
func (client *Client) QueryDataexportPreviewsqlEx(request *QueryDataexportPreviewsqlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDataexportPreviewsqlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDataexportPreviewsqlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.dataexport.previewsql.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 列出导出任务
 * Summary: 列出导出任务
 */
func (client *Client) ListDataexportTrigger(request *ListDataexportTriggerRequest) (_result *ListDataexportTriggerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListDataexportTriggerResponse{}
	_body, _err := client.ListDataexportTriggerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 列出导出任务
 * Summary: 列出导出任务
 */
func (client *Client) ListDataexportTriggerEx(request *ListDataexportTriggerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListDataexportTriggerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListDataexportTriggerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.dataexport.trigger.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 修改导出任务状态
 * Summary: 修改导出任务状态
 */
func (client *Client) OperateDataexportTriggerstatus(request *OperateDataexportTriggerstatusRequest) (_result *OperateDataexportTriggerstatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateDataexportTriggerstatusResponse{}
	_body, _err := client.OperateDataexportTriggerstatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 修改导出任务状态
 * Summary: 修改导出任务状态
 */
func (client *Client) OperateDataexportTriggerstatusEx(request *OperateDataexportTriggerstatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateDataexportTriggerstatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateDataexportTriggerstatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.dataexport.triggerstatus.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 修改导出任务配置
 * Summary: 修改导出任务配置
 */
func (client *Client) OperateDataexportTriggerconfig(request *OperateDataexportTriggerconfigRequest) (_result *OperateDataexportTriggerconfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateDataexportTriggerconfigResponse{}
	_body, _err := client.OperateDataexportTriggerconfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 修改导出任务配置
 * Summary: 修改导出任务配置
 */
func (client *Client) OperateDataexportTriggerconfigEx(request *OperateDataexportTriggerconfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateDataexportTriggerconfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateDataexportTriggerconfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.dataexport.triggerconfig.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 列出导出任务失败日志
 * Summary: 列出导出任务失败日志
 */
func (client *Client) ListDataexportTriggerlog(request *ListDataexportTriggerlogRequest) (_result *ListDataexportTriggerlogResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListDataexportTriggerlogResponse{}
	_body, _err := client.ListDataexportTriggerlogEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 列出导出任务失败日志
 * Summary: 列出导出任务失败日志
 */
func (client *Client) ListDataexportTriggerlogEx(request *ListDataexportTriggerlogRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListDataexportTriggerlogResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListDataexportTriggerlogResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.dataexport.triggerlog.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 操作导出任务失败日志
 * Summary: 操作导出任务失败日志
 */
func (client *Client) OperateDataexportTriggerlog(request *OperateDataexportTriggerlogRequest) (_result *OperateDataexportTriggerlogResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateDataexportTriggerlogResponse{}
	_body, _err := client.OperateDataexportTriggerlogEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 操作导出任务失败日志
 * Summary: 操作导出任务失败日志
 */
func (client *Client) OperateDataexportTriggerlogEx(request *OperateDataexportTriggerlogRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateDataexportTriggerlogResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateDataexportTriggerlogResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.dataexport.triggerlog.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询地址标签
 * Summary: 查询地址标签
 */
func (client *Client) QueryChaininsightLabels(request *QueryChaininsightLabelsRequest) (_result *QueryChaininsightLabelsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryChaininsightLabelsResponse{}
	_body, _err := client.QueryChaininsightLabelsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询地址标签
 * Summary: 查询地址标签
 */
func (client *Client) QueryChaininsightLabelsEx(request *QueryChaininsightLabelsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryChaininsightLabelsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryChaininsightLabelsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.labels.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新地址标签
 * Summary: 更新地址标签
 */
func (client *Client) UpdateChaininsightLabels(request *UpdateChaininsightLabelsRequest) (_result *UpdateChaininsightLabelsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateChaininsightLabelsResponse{}
	_body, _err := client.UpdateChaininsightLabelsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新地址标签
 * Summary: 更新地址标签
 */
func (client *Client) UpdateChaininsightLabelsEx(request *UpdateChaininsightLabelsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateChaininsightLabelsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateChaininsightLabelsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.labels.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 链上搜索
 * Summary: 链上搜索
 */
func (client *Client) QueryChaininsightSearch(request *QueryChaininsightSearchRequest) (_result *QueryChaininsightSearchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryChaininsightSearchResponse{}
	_body, _err := client.QueryChaininsightSearchEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 链上搜索
 * Summary: 链上搜索
 */
func (client *Client) QueryChaininsightSearchEx(request *QueryChaininsightSearchRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryChaininsightSearchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryChaininsightSearchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.search.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询链上地址详情
 * Summary: 查询链上地址详情
 */
func (client *Client) QueryChaininsightAddress(request *QueryChaininsightAddressRequest) (_result *QueryChaininsightAddressResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryChaininsightAddressResponse{}
	_body, _err := client.QueryChaininsightAddressEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询链上地址详情
 * Summary: 查询链上地址详情
 */
func (client *Client) QueryChaininsightAddressEx(request *QueryChaininsightAddressRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryChaininsightAddressResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryChaininsightAddressResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.address.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询链上交易详情
 * Summary: 查询链上交易详情
 */
func (client *Client) QueryChaininsightTransaction(request *QueryChaininsightTransactionRequest) (_result *QueryChaininsightTransactionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryChaininsightTransactionResponse{}
	_body, _err := client.QueryChaininsightTransactionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询链上交易详情
 * Summary: 查询链上交易详情
 */
func (client *Client) QueryChaininsightTransactionEx(request *QueryChaininsightTransactionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryChaininsightTransactionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryChaininsightTransactionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.transaction.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询链上区块详情
 * Summary: 查询链上区块详情
 */
func (client *Client) QueryChaininsightBlock(request *QueryChaininsightBlockRequest) (_result *QueryChaininsightBlockResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryChaininsightBlockResponse{}
	_body, _err := client.QueryChaininsightBlockEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询链上区块详情
 * Summary: 查询链上区块详情
 */
func (client *Client) QueryChaininsightBlockEx(request *QueryChaininsightBlockRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryChaininsightBlockResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryChaininsightBlockResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.block.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询地址近期交易
 * Summary: 查询地址近期交易
 */
func (client *Client) QueryChaininsightAddresslatesttxs(request *QueryChaininsightAddresslatesttxsRequest) (_result *QueryChaininsightAddresslatesttxsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryChaininsightAddresslatesttxsResponse{}
	_body, _err := client.QueryChaininsightAddresslatesttxsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询地址近期交易
 * Summary: 查询地址近期交易
 */
func (client *Client) QueryChaininsightAddresslatesttxsEx(request *QueryChaininsightAddresslatesttxsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryChaininsightAddresslatesttxsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryChaininsightAddresslatesttxsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.addresslatesttxs.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 列出合约全部接口
 * Summary: 列出合约全部接口
 */
func (client *Client) ListChaininsightContractinterface(request *ListChaininsightContractinterfaceRequest) (_result *ListChaininsightContractinterfaceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListChaininsightContractinterfaceResponse{}
	_body, _err := client.ListChaininsightContractinterfaceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 列出合约全部接口
 * Summary: 列出合约全部接口
 */
func (client *Client) ListChaininsightContractinterfaceEx(request *ListChaininsightContractinterfaceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListChaininsightContractinterfaceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListChaininsightContractinterfaceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.contractinterface.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询合约接口信息
 * Summary: 查询合约接口信息
 */
func (client *Client) DetailChaininsightContractinterface(request *DetailChaininsightContractinterfaceRequest) (_result *DetailChaininsightContractinterfaceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DetailChaininsightContractinterfaceResponse{}
	_body, _err := client.DetailChaininsightContractinterfaceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询合约接口信息
 * Summary: 查询合约接口信息
 */
func (client *Client) DetailChaininsightContractinterfaceEx(request *DetailChaininsightContractinterfaceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DetailChaininsightContractinterfaceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DetailChaininsightContractinterfaceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.contractinterface.detail"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新合约接口信息
 * Summary: 更新合约接口信息
 */
func (client *Client) UpdateChaininsightContractinterface(request *UpdateChaininsightContractinterfaceRequest) (_result *UpdateChaininsightContractinterfaceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateChaininsightContractinterfaceResponse{}
	_body, _err := client.UpdateChaininsightContractinterfaceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新合约接口信息
 * Summary: 更新合约接口信息
 */
func (client *Client) UpdateChaininsightContractinterfaceEx(request *UpdateChaininsightContractinterfaceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateChaininsightContractinterfaceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateChaininsightContractinterfaceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.contractinterface.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 上传合约ABI文件
 * Summary: 上传合约ABI文件
 */
func (client *Client) UploadChaininsightAbi(request *UploadChaininsightAbiRequest) (_result *UploadChaininsightAbiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadChaininsightAbiResponse{}
	_body, _err := client.UploadChaininsightAbiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上传合约ABI文件
 * Summary: 上传合约ABI文件
 */
func (client *Client) UploadChaininsightAbiEx(request *UploadChaininsightAbiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadChaininsightAbiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadChaininsightAbiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.abi.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询地址的接收交易数量趋势
 * Summary: 查询地址的接收交易数量趋势
 */
func (client *Client) QueryChaininsightAddresshistogramrx(request *QueryChaininsightAddresshistogramrxRequest) (_result *QueryChaininsightAddresshistogramrxResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryChaininsightAddresshistogramrxResponse{}
	_body, _err := client.QueryChaininsightAddresshistogramrxEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询地址的接收交易数量趋势
 * Summary: 查询地址的接收交易数量趋势
 */
func (client *Client) QueryChaininsightAddresshistogramrxEx(request *QueryChaininsightAddresshistogramrxRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryChaininsightAddresshistogramrxResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryChaininsightAddresshistogramrxResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.addresshistogramrx.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询地址的发送交易数量趋势
 * Summary: 查询地址的发送交易数量趋势
 */
func (client *Client) QueryChaininsightAddresshistogramtx(request *QueryChaininsightAddresshistogramtxRequest) (_result *QueryChaininsightAddresshistogramtxResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryChaininsightAddresshistogramtxResponse{}
	_body, _err := client.QueryChaininsightAddresshistogramtxEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询地址的发送交易数量趋势
 * Summary: 查询地址的发送交易数量趋势
 */
func (client *Client) QueryChaininsightAddresshistogramtxEx(request *QueryChaininsightAddresshistogramtxRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryChaininsightAddresshistogramtxResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryChaininsightAddresshistogramtxResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.addresshistogramtx.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询链交易数量趋势
 * Summary: 查询链交易数量趋势
 */
func (client *Client) QueryChaininsightChaintxhistogram(request *QueryChaininsightChaintxhistogramRequest) (_result *QueryChaininsightChaintxhistogramResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryChaininsightChaintxhistogramResponse{}
	_body, _err := client.QueryChaininsightChaintxhistogramEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询链交易数量趋势
 * Summary: 查询链交易数量趋势
 */
func (client *Client) QueryChaininsightChaintxhistogramEx(request *QueryChaininsightChaintxhistogramRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryChaininsightChaintxhistogramResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryChaininsightChaintxhistogramResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.chaintxhistogram.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 批量查询链上交易详情
 * Summary: 批量查询链上交易详情
 */
func (client *Client) BatchqueryChaininsightTransaction(request *BatchqueryChaininsightTransactionRequest) (_result *BatchqueryChaininsightTransactionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchqueryChaininsightTransactionResponse{}
	_body, _err := client.BatchqueryChaininsightTransactionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 批量查询链上交易详情
 * Summary: 批量查询链上交易详情
 */
func (client *Client) BatchqueryChaininsightTransactionEx(request *BatchqueryChaininsightTransactionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchqueryChaininsightTransactionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchqueryChaininsightTransactionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.transaction.batchquery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询统计任务
 * Summary: 查询统计任务
 */
func (client *Client) ListChaininsightStatistic(request *ListChaininsightStatisticRequest) (_result *ListChaininsightStatisticResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListChaininsightStatisticResponse{}
	_body, _err := client.ListChaininsightStatisticEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询统计任务
 * Summary: 查询统计任务
 */
func (client *Client) ListChaininsightStatisticEx(request *ListChaininsightStatisticRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListChaininsightStatisticResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListChaininsightStatisticResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.statistic.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新建统计任务
 * Summary: 新建统计任务
 */
func (client *Client) AddChaininsightStatistic(request *AddChaininsightStatisticRequest) (_result *AddChaininsightStatisticResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddChaininsightStatisticResponse{}
	_body, _err := client.AddChaininsightStatisticEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新建统计任务
 * Summary: 新建统计任务
 */
func (client *Client) AddChaininsightStatisticEx(request *AddChaininsightStatisticRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddChaininsightStatisticResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddChaininsightStatisticResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.statistic.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 操作统计任务
 * Summary: 操作统计任务
 */
func (client *Client) OperateChaininsightStatistic(request *OperateChaininsightStatisticRequest) (_result *OperateChaininsightStatisticResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateChaininsightStatisticResponse{}
	_body, _err := client.OperateChaininsightStatisticEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 操作统计任务
 * Summary: 操作统计任务
 */
func (client *Client) OperateChaininsightStatisticEx(request *OperateChaininsightStatisticRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateChaininsightStatisticResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateChaininsightStatisticResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.statistic.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询统计任务的统计结果直方图
 * Summary: 查询统计任务的统计结果直方图
 */
func (client *Client) QueryChaininsightStatistichistogram(request *QueryChaininsightStatistichistogramRequest) (_result *QueryChaininsightStatistichistogramResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryChaininsightStatistichistogramResponse{}
	_body, _err := client.QueryChaininsightStatistichistogramEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询统计任务的统计结果直方图
 * Summary: 查询统计任务的统计结果直方图
 */
func (client *Client) QueryChaininsightStatistichistogramEx(request *QueryChaininsightStatistichistogramRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryChaininsightStatistichistogramResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryChaininsightStatistichistogramResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.statistichistogram.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询统计任务的统计结果表格
 * Summary: 查询统计任务的统计结果表格
 */
func (client *Client) QueryChaininsightStatistictable(request *QueryChaininsightStatistictableRequest) (_result *QueryChaininsightStatistictableResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryChaininsightStatistictableResponse{}
	_body, _err := client.QueryChaininsightStatistictableEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询统计任务的统计结果表格
 * Summary: 查询统计任务的统计结果表格
 */
func (client *Client) QueryChaininsightStatistictableEx(request *QueryChaininsightStatistictableRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryChaininsightStatistictableResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryChaininsightStatistictableResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.statistictable.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 生成支付宝小程序二维码
 * Summary: 生成支付宝小程序二维码
 */
func (client *Client) CreateChaininsightQrcode(request *CreateChaininsightQrcodeRequest) (_result *CreateChaininsightQrcodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateChaininsightQrcodeResponse{}
	_body, _err := client.CreateChaininsightQrcodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 生成支付宝小程序二维码
 * Summary: 生成支付宝小程序二维码
 */
func (client *Client) CreateChaininsightQrcodeEx(request *CreateChaininsightQrcodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateChaininsightQrcodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateChaininsightQrcodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.qrcode.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 开通数据搜索服务
 * Summary: 开通数据搜索服务
 */
func (client *Client) OpenChaininsightDatasearch(request *OpenChaininsightDatasearchRequest) (_result *OpenChaininsightDatasearchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OpenChaininsightDatasearchResponse{}
	_body, _err := client.OpenChaininsightDatasearchEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 开通数据搜索服务
 * Summary: 开通数据搜索服务
 */
func (client *Client) OpenChaininsightDatasearchEx(request *OpenChaininsightDatasearchRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OpenChaininsightDatasearchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OpenChaininsightDatasearchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.datasearch.open"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 私有化场景下查询所有链的数据搜索服务状态
 * Summary: 私有化场景下查询所有链的数据搜索服务状态
 */
func (client *Client) QueryChaininsightPrivatedatasearchstatus(request *QueryChaininsightPrivatedatasearchstatusRequest) (_result *QueryChaininsightPrivatedatasearchstatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryChaininsightPrivatedatasearchstatusResponse{}
	_body, _err := client.QueryChaininsightPrivatedatasearchstatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 私有化场景下查询所有链的数据搜索服务状态
 * Summary: 私有化场景下查询所有链的数据搜索服务状态
 */
func (client *Client) QueryChaininsightPrivatedatasearchstatusEx(request *QueryChaininsightPrivatedatasearchstatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryChaininsightPrivatedatasearchstatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryChaininsightPrivatedatasearchstatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.privatedatasearchstatus.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 添加看板
 * Summary: 添加看板
 */
func (client *Client) AddChaininsightWidgets(request *AddChaininsightWidgetsRequest) (_result *AddChaininsightWidgetsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddChaininsightWidgetsResponse{}
	_body, _err := client.AddChaininsightWidgetsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 添加看板
 * Summary: 添加看板
 */
func (client *Client) AddChaininsightWidgetsEx(request *AddChaininsightWidgetsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddChaininsightWidgetsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddChaininsightWidgetsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.widgets.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取看板列表
 * Summary: 获取看板列表
 */
func (client *Client) ListChaininsightWidgets(request *ListChaininsightWidgetsRequest) (_result *ListChaininsightWidgetsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListChaininsightWidgetsResponse{}
	_body, _err := client.ListChaininsightWidgetsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取看板列表
 * Summary: 获取看板列表
 */
func (client *Client) ListChaininsightWidgetsEx(request *ListChaininsightWidgetsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListChaininsightWidgetsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListChaininsightWidgetsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.widgets.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询链上活跃接收地址
 * Summary: 分页查询链上活跃接收地址
 */
func (client *Client) QueryChaininsightTablesactivereceiver(request *QueryChaininsightTablesactivereceiverRequest) (_result *QueryChaininsightTablesactivereceiverResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryChaininsightTablesactivereceiverResponse{}
	_body, _err := client.QueryChaininsightTablesactivereceiverEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询链上活跃接收地址
 * Summary: 分页查询链上活跃接收地址
 */
func (client *Client) QueryChaininsightTablesactivereceiverEx(request *QueryChaininsightTablesactivereceiverRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryChaininsightTablesactivereceiverResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryChaininsightTablesactivereceiverResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.tablesactivereceiver.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询链上活跃发送地址
 * Summary: 分页查询链上活跃发送地址
 */
func (client *Client) QueryChaininsightTablesactivesender(request *QueryChaininsightTablesactivesenderRequest) (_result *QueryChaininsightTablesactivesenderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryChaininsightTablesactivesenderResponse{}
	_body, _err := client.QueryChaininsightTablesactivesenderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询链上活跃发送地址
 * Summary: 分页查询链上活跃发送地址
 */
func (client *Client) QueryChaininsightTablesactivesenderEx(request *QueryChaininsightTablesactivesenderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryChaininsightTablesactivesenderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryChaininsightTablesactivesenderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.tablesactivesender.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询链上近期合约
 * Summary: 分页查询链上近期合约
 */
func (client *Client) PagequeryChaininsightLatestcontracts(request *PagequeryChaininsightLatestcontractsRequest) (_result *PagequeryChaininsightLatestcontractsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryChaininsightLatestcontractsResponse{}
	_body, _err := client.PagequeryChaininsightLatestcontractsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询链上近期合约
 * Summary: 分页查询链上近期合约
 */
func (client *Client) PagequeryChaininsightLatestcontractsEx(request *PagequeryChaininsightLatestcontractsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryChaininsightLatestcontractsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryChaininsightLatestcontractsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.latestcontracts.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询链上近期交易
 * Summary: 分页查询链上近期交易
 */
func (client *Client) PagequeryChaininsightLatesttxs(request *PagequeryChaininsightLatesttxsRequest) (_result *PagequeryChaininsightLatesttxsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryChaininsightLatesttxsResponse{}
	_body, _err := client.PagequeryChaininsightLatesttxsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询链上近期交易
 * Summary: 分页查询链上近期交易
 */
func (client *Client) PagequeryChaininsightLatesttxsEx(request *PagequeryChaininsightLatesttxsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryChaininsightLatesttxsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryChaininsightLatesttxsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.latesttxs.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 私有化场景下查询区块链整体状态
 * Summary: 私有化场景下查询区块链整体状态
 */
func (client *Client) QueryChaininsightPrivatechainsstatus(request *QueryChaininsightPrivatechainsstatusRequest) (_result *QueryChaininsightPrivatechainsstatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryChaininsightPrivatechainsstatusResponse{}
	_body, _err := client.QueryChaininsightPrivatechainsstatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 私有化场景下查询区块链整体状态
 * Summary: 私有化场景下查询区块链整体状态
 */
func (client *Client) QueryChaininsightPrivatechainsstatusEx(request *QueryChaininsightPrivatechainsstatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryChaininsightPrivatechainsstatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryChaininsightPrivatechainsstatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.privatechainsstatus.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 私有化场景下查询链交易数量趋势
 * Summary: 私有化场景下查询链交易数量趋势
 */
func (client *Client) QueryChaininsightPrivatechaintxhistogram(request *QueryChaininsightPrivatechaintxhistogramRequest) (_result *QueryChaininsightPrivatechaintxhistogramResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryChaininsightPrivatechaintxhistogramResponse{}
	_body, _err := client.QueryChaininsightPrivatechaintxhistogramEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 私有化场景下查询链交易数量趋势
 * Summary: 私有化场景下查询链交易数量趋势
 */
func (client *Client) QueryChaininsightPrivatechaintxhistogramEx(request *QueryChaininsightPrivatechaintxhistogramRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryChaininsightPrivatechaintxhistogramResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryChaininsightPrivatechaintxhistogramResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.privatechaintxhistogram.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除数据洞察看板
 * Summary: 删除数据洞察看板
 */
func (client *Client) DeleteChaininsightWidgets(request *DeleteChaininsightWidgetsRequest) (_result *DeleteChaininsightWidgetsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteChaininsightWidgetsResponse{}
	_body, _err := client.DeleteChaininsightWidgetsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除数据洞察看板
 * Summary: 删除数据洞察看板
 */
func (client *Client) DeleteChaininsightWidgetsEx(request *DeleteChaininsightWidgetsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteChaininsightWidgetsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteChaininsightWidgetsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.widgets.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 移动看板
 * Summary: 移动看板
 */
func (client *Client) OperateChaininsightWidgetsmove(request *OperateChaininsightWidgetsmoveRequest) (_result *OperateChaininsightWidgetsmoveResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateChaininsightWidgetsmoveResponse{}
	_body, _err := client.OperateChaininsightWidgetsmoveEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 移动看板
 * Summary: 移动看板
 */
func (client *Client) OperateChaininsightWidgetsmoveEx(request *OperateChaininsightWidgetsmoveRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateChaininsightWidgetsmoveResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateChaininsightWidgetsmoveResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.widgetsmove.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 修改看板
 * Summary: 修改看板
 */
func (client *Client) UpdateChaininsightWidgets(request *UpdateChaininsightWidgetsRequest) (_result *UpdateChaininsightWidgetsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateChaininsightWidgetsResponse{}
	_body, _err := client.UpdateChaininsightWidgetsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 修改看板
 * Summary: 修改看板
 */
func (client *Client) UpdateChaininsightWidgetsEx(request *UpdateChaininsightWidgetsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateChaininsightWidgetsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateChaininsightWidgetsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.widgets.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 下载合约
 * Summary: 下载合约
 */
func (client *Client) DownloadChaininsightContract(request *DownloadChaininsightContractRequest) (_result *DownloadChaininsightContractResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DownloadChaininsightContractResponse{}
	_body, _err := client.DownloadChaininsightContractEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 下载合约
 * Summary: 下载合约
 */
func (client *Client) DownloadChaininsightContractEx(request *DownloadChaininsightContractRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DownloadChaininsightContractResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DownloadChaininsightContractResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.contract.download"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询修改合约的交易
 * Summary: 查询修改合约的交易
 */
func (client *Client) PagequeryChaininsightContractmodifytx(request *PagequeryChaininsightContractmodifytxRequest) (_result *PagequeryChaininsightContractmodifytxResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryChaininsightContractmodifytxResponse{}
	_body, _err := client.PagequeryChaininsightContractmodifytxEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询修改合约的交易
 * Summary: 查询修改合约的交易
 */
func (client *Client) PagequeryChaininsightContractmodifytxEx(request *PagequeryChaininsightContractmodifytxRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryChaininsightContractmodifytxResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryChaininsightContractmodifytxResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.contractmodifytx.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询账户的修改交易
 * Summary: 分页查询账户的修改交易
 */
func (client *Client) PagequeryChaininsightAccountmodifytx(request *PagequeryChaininsightAccountmodifytxRequest) (_result *PagequeryChaininsightAccountmodifytxResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryChaininsightAccountmodifytxResponse{}
	_body, _err := client.PagequeryChaininsightAccountmodifytxEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询账户的修改交易
 * Summary: 分页查询账户的修改交易
 */
func (client *Client) PagequeryChaininsightAccountmodifytxEx(request *PagequeryChaininsightAccountmodifytxRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryChaininsightAccountmodifytxResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryChaininsightAccountmodifytxResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.accountmodifytx.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 返回对应 ERC 类型资产统计所必须的接口
 * Summary: 查询资产统计所必须的接口
 */
func (client *Client) ListChaininsightAssetinterfacesrequired(request *ListChaininsightAssetinterfacesrequiredRequest) (_result *ListChaininsightAssetinterfacesrequiredResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListChaininsightAssetinterfacesrequiredResponse{}
	_body, _err := client.ListChaininsightAssetinterfacesrequiredEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 返回对应 ERC 类型资产统计所必须的接口
 * Summary: 查询资产统计所必须的接口
 */
func (client *Client) ListChaininsightAssetinterfacesrequiredEx(request *ListChaininsightAssetinterfacesrequiredRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListChaininsightAssetinterfacesrequiredResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListChaininsightAssetinterfacesrequiredResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.assetinterfacesrequired.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询链上资产的详情
 * Summary: 查询资产详情
 */
func (client *Client) QueryChaininsightStatisticassetdetail(request *QueryChaininsightStatisticassetdetailRequest) (_result *QueryChaininsightStatisticassetdetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryChaininsightStatisticassetdetailResponse{}
	_body, _err := client.QueryChaininsightStatisticassetdetailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询链上资产的详情
 * Summary: 查询资产详情
 */
func (client *Client) QueryChaininsightStatisticassetdetailEx(request *QueryChaininsightStatisticassetdetailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryChaininsightStatisticassetdetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryChaininsightStatisticassetdetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.statisticassetdetail.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询链上资产合约中资产的元信息
 * Summary: 查询链上资产元信息
 */
func (client *Client) QueryChaininsightStatisticassetmeta(request *QueryChaininsightStatisticassetmetaRequest) (_result *QueryChaininsightStatisticassetmetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryChaininsightStatisticassetmetaResponse{}
	_body, _err := client.QueryChaininsightStatisticassetmetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询链上资产合约中资产的元信息
 * Summary: 查询链上资产元信息
 */
func (client *Client) QueryChaininsightStatisticassetmetaEx(request *QueryChaininsightStatisticassetmetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryChaininsightStatisticassetmetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryChaininsightStatisticassetmetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.statisticassetmeta.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询链上资产合约中资产的持有者信息，按最近一次交易时间降序
 * Summary: 查询链上资产的持有者信息
 */
func (client *Client) PagequeryChaininsightStatisticassetowner(request *PagequeryChaininsightStatisticassetownerRequest) (_result *PagequeryChaininsightStatisticassetownerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryChaininsightStatisticassetownerResponse{}
	_body, _err := client.PagequeryChaininsightStatisticassetownerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询链上资产合约中资产的持有者信息，按最近一次交易时间降序
 * Summary: 查询链上资产的持有者信息
 */
func (client *Client) PagequeryChaininsightStatisticassetownerEx(request *PagequeryChaininsightStatisticassetownerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryChaininsightStatisticassetownerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryChaininsightStatisticassetownerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.statisticassetowner.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询链上账户的资产列表，按最近一次交易时间降序
 * Summary: 查询链上账户的资产列表
 */
func (client *Client) PagequeryChaininsightStatisticassetinventoryaccount(request *PagequeryChaininsightStatisticassetinventoryaccountRequest) (_result *PagequeryChaininsightStatisticassetinventoryaccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryChaininsightStatisticassetinventoryaccountResponse{}
	_body, _err := client.PagequeryChaininsightStatisticassetinventoryaccountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询链上账户的资产列表，按最近一次交易时间降序
 * Summary: 查询链上账户的资产列表
 */
func (client *Client) PagequeryChaininsightStatisticassetinventoryaccountEx(request *PagequeryChaininsightStatisticassetinventoryaccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryChaininsightStatisticassetinventoryaccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryChaininsightStatisticassetinventoryaccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.statisticassetinventoryaccount.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询链上资产合约中资产的流转信息，按交易时间降序
 * Summary: 查询链上资产的流转信息
 */
func (client *Client) PagequeryChaininsightStatisticassethistoryasset(request *PagequeryChaininsightStatisticassethistoryassetRequest) (_result *PagequeryChaininsightStatisticassethistoryassetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryChaininsightStatisticassethistoryassetResponse{}
	_body, _err := client.PagequeryChaininsightStatisticassethistoryassetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询链上资产合约中资产的流转信息，按交易时间降序
 * Summary: 查询链上资产的流转信息
 */
func (client *Client) PagequeryChaininsightStatisticassethistoryassetEx(request *PagequeryChaininsightStatisticassethistoryassetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryChaininsightStatisticassethistoryassetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryChaininsightStatisticassethistoryassetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.statisticassethistoryasset.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询链上资产合约的资产流转信息，按交易时间降序
 * Summary: 查询链上资产合约的资产流转信息
 */
func (client *Client) PagequeryChaininsightStatisticassethistorycontract(request *PagequeryChaininsightStatisticassethistorycontractRequest) (_result *PagequeryChaininsightStatisticassethistorycontractResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryChaininsightStatisticassethistorycontractResponse{}
	_body, _err := client.PagequeryChaininsightStatisticassethistorycontractEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询链上资产合约的资产流转信息，按交易时间降序
 * Summary: 查询链上资产合约的资产流转信息
 */
func (client *Client) PagequeryChaininsightStatisticassethistorycontractEx(request *PagequeryChaininsightStatisticassethistorycontractRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryChaininsightStatisticassethistorycontractResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryChaininsightStatisticassethistorycontractResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.statisticassethistorycontract.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 列出链上地址（合约 / 存证账户）的时间轴配置
 * Summary: 列出链上地址的时间轴配置
 */
func (client *Client) QueryChaininsightContracttimelineconfig(request *QueryChaininsightContracttimelineconfigRequest) (_result *QueryChaininsightContracttimelineconfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryChaininsightContracttimelineconfigResponse{}
	_body, _err := client.QueryChaininsightContracttimelineconfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 列出链上地址（合约 / 存证账户）的时间轴配置
 * Summary: 列出链上地址的时间轴配置
 */
func (client *Client) QueryChaininsightContracttimelineconfigEx(request *QueryChaininsightContracttimelineconfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryChaininsightContracttimelineconfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryChaininsightContracttimelineconfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.contracttimelineconfig.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新链上地址（合约 / 存证账户）的时间轴配置
 * Summary: 更新链上地址的时间轴配置
 */
func (client *Client) UpdateChaininsightContracttimelineconfig(request *UpdateChaininsightContracttimelineconfigRequest) (_result *UpdateChaininsightContracttimelineconfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateChaininsightContracttimelineconfigResponse{}
	_body, _err := client.UpdateChaininsightContracttimelineconfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新链上地址（合约 / 存证账户）的时间轴配置
 * Summary: 更新链上地址的时间轴配置
 */
func (client *Client) UpdateChaininsightContracttimelineconfigEx(request *UpdateChaininsightContracttimelineconfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateChaininsightContracttimelineconfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateChaininsightContracttimelineconfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.contracttimelineconfig.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 重写接口参数配置
 * Summary: 重写接口参数配置
 */
func (client *Client) SaveChaininsightContractinterface(request *SaveChaininsightContractinterfaceRequest) (_result *SaveChaininsightContractinterfaceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveChaininsightContractinterfaceResponse{}
	_body, _err := client.SaveChaininsightContractinterfaceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 重写接口参数配置
 * Summary: 重写接口参数配置
 */
func (client *Client) SaveChaininsightContractinterfaceEx(request *SaveChaininsightContractinterfaceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveChaininsightContractinterfaceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveChaininsightContractinterfaceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chaininsight.contractinterface.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 注册链信息
 * Summary: 注册链信息
 */
func (client *Client) RegisterChains(request *RegisterChainsRequest) (_result *RegisterChainsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RegisterChainsResponse{}
	_body, _err := client.RegisterChainsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 注册链信息
 * Summary: 注册链信息
 */
func (client *Client) RegisterChainsEx(request *RegisterChainsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RegisterChainsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RegisterChainsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chains.register"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 操作数据网关开通状态
 * Summary: 操作数据网关开通状态
 */
func (client *Client) OperateChains(request *OperateChainsRequest) (_result *OperateChainsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateChainsResponse{}
	_body, _err := client.OperateChainsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 操作数据网关开通状态
 * Summary: 操作数据网关开通状态
 */
func (client *Client) OperateChainsEx(request *OperateChainsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateChainsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateChainsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chains.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询某条链的服务开通状态
 * Summary: 查询某条链的服务开通状态
 */
func (client *Client) GetChainsStatus(request *GetChainsStatusRequest) (_result *GetChainsStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetChainsStatusResponse{}
	_body, _err := client.GetChainsStatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询某条链的服务开通状态
 * Summary: 查询某条链的服务开通状态
 */
func (client *Client) GetChainsStatusEx(request *GetChainsStatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetChainsStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetChainsStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdatagw.chains.status.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
