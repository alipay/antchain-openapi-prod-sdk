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

// ColumnDTO
type ColumnDTO struct {
	// tableGuid
	TableGuid *string `json:"table_guid,omitempty" xml:"table_guid,omitempty" require:"true"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// desc
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true"`
	// dataType
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty" require:"true"`
	// columnSeq
	ColumnSeq *int64 `json:"column_seq,omitempty" xml:"column_seq,omitempty" require:"true"`
	// securityLevel
	SecurityLevel *string `json:"security_level,omitempty" xml:"security_level,omitempty" require:"true"`
	// true, false
	IsPK *bool `json:"is_p_k,omitempty" xml:"is_p_k,omitempty" require:"true"`
	// isPartition
	IsPartition *bool `json:"is_partition,omitempty" xml:"is_partition,omitempty" require:"true"`
	// columnId
	ColumnId *string `json:"column_id,omitempty" xml:"column_id,omitempty" require:"true"`
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// visitCount
	VisitCount *int64 `json:"visit_count,omitempty" xml:"visit_count,omitempty" require:"true"`
}

func (s ColumnDTO) String() string {
	return tea.Prettify(s)
}

func (s ColumnDTO) GoString() string {
	return s.String()
}

func (s *ColumnDTO) SetTableGuid(v string) *ColumnDTO {
	s.TableGuid = &v
	return s
}

func (s *ColumnDTO) SetName(v string) *ColumnDTO {
	s.Name = &v
	return s
}

func (s *ColumnDTO) SetDesc(v string) *ColumnDTO {
	s.Desc = &v
	return s
}

func (s *ColumnDTO) SetDataType(v string) *ColumnDTO {
	s.DataType = &v
	return s
}

func (s *ColumnDTO) SetColumnSeq(v int64) *ColumnDTO {
	s.ColumnSeq = &v
	return s
}

func (s *ColumnDTO) SetSecurityLevel(v string) *ColumnDTO {
	s.SecurityLevel = &v
	return s
}

func (s *ColumnDTO) SetIsPK(v bool) *ColumnDTO {
	s.IsPK = &v
	return s
}

func (s *ColumnDTO) SetIsPartition(v bool) *ColumnDTO {
	s.IsPartition = &v
	return s
}

func (s *ColumnDTO) SetColumnId(v string) *ColumnDTO {
	s.ColumnId = &v
	return s
}

func (s *ColumnDTO) SetCode(v string) *ColumnDTO {
	s.Code = &v
	return s
}

func (s *ColumnDTO) SetVisitCount(v int64) *ColumnDTO {
	s.VisitCount = &v
	return s
}

// TableDTO
type TableDTO struct {
	// tableId
	TableId *string `json:"table_id,omitempty" xml:"table_id,omitempty" require:"true"`
	// subType
	SubType *string `json:"sub_type,omitempty" xml:"sub_type,omitempty" require:"true"`
	// tableType
	TableType *string `json:"table_type,omitempty" xml:"table_type,omitempty" require:"true"`
	// phyFileSize
	PhyFileSize *int64 `json:"phy_file_size,omitempty" xml:"phy_file_size,omitempty" require:"true"`
	// tableLifeCycle
	TableLifeCycle *string `json:"table_life_cycle,omitempty" xml:"table_life_cycle,omitempty" require:"true"`
	// createTime
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty" require:"true"`
	// lastDdlTime
	LastDdlTime *string `json:"last_ddl_time,omitempty" xml:"last_ddl_time,omitempty" require:"true"`
	// nodeIds
	NodeIds *string `json:"node_ids,omitempty" xml:"node_ids,omitempty" require:"true"`
	// lastViewTime
	LastViewTime *string `json:"last_view_time,omitempty" xml:"last_view_time,omitempty" require:"true"`
	// appId
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// partitionKey
	PartitionKey *string `json:"partition_key,omitempty" xml:"partition_key,omitempty" require:"true"`
	// primaryKey
	PrimaryKey *string `json:"primary_key,omitempty" xml:"primary_key,omitempty" require:"true"`
	// dataLayer
	DataLayer *string `json:"data_layer,omitempty" xml:"data_layer,omitempty" require:"true"`
	// owner
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty" require:"true"`
	// ownerName
	OwnerName *string `json:"owner_name,omitempty" xml:"owner_name,omitempty" require:"true"`
	// visitCnt3m
	VisitCnt3m *string `json:"visit_cnt3m,omitempty" xml:"visit_cnt3m,omitempty" require:"true"`
	// env
	Env *string `json:"env,omitempty" xml:"env,omitempty" require:"true"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// nameCn
	NameCn *string `json:"name_cn,omitempty" xml:"name_cn,omitempty" require:"true"`
	// gmtDataUpdateTime
	GmtDataUpdateTime *string `json:"gmt_data_update_time,omitempty" xml:"gmt_data_update_time,omitempty" require:"true"`
	// desc
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true"`
	// guid
	Guid *string `json:"guid,omitempty" xml:"guid,omitempty" require:"true"`
	// logicSubType
	LogicSubType *string `json:"logic_sub_type,omitempty" xml:"logic_sub_type,omitempty" require:"true"`
	// tenantId
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// bizUnitId
	BizUnitId *string `json:"biz_unit_id,omitempty" xml:"biz_unit_id,omitempty" require:"true"`
	// bizUnitName
	BizUnitName *string `json:"biz_unit_name,omitempty" xml:"biz_unit_name,omitempty" require:"true"`
	// dataCellId
	DataCellJd *string `json:"data_cell_jd,omitempty" xml:"data_cell_jd,omitempty" require:"true"`
	// dataCellName
	DataCellName *string `json:"data_cell_name,omitempty" xml:"data_cell_name,omitempty" require:"true"`
	// projectId
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// projectName
	ProjectName *string `json:"project_name,omitempty" xml:"project_name,omitempty" require:"true"`
	// developMode
	DevelopMode *string `json:"develop_mode,omitempty" xml:"develop_mode,omitempty" require:"true"`
	// modelType
	ModelType *string `json:"model_type,omitempty" xml:"model_type,omitempty" require:"true"`
	// parentModelId
	ParentModelId *string `json:"parent_model_id,omitempty" xml:"parent_model_id,omitempty" require:"true"`
	// fileId
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// columns
	Columns []*ColumnDTO `json:"columns,omitempty" xml:"columns,omitempty" require:"true" type:"Repeated"`
}

func (s TableDTO) String() string {
	return tea.Prettify(s)
}

func (s TableDTO) GoString() string {
	return s.String()
}

func (s *TableDTO) SetTableId(v string) *TableDTO {
	s.TableId = &v
	return s
}

func (s *TableDTO) SetSubType(v string) *TableDTO {
	s.SubType = &v
	return s
}

func (s *TableDTO) SetTableType(v string) *TableDTO {
	s.TableType = &v
	return s
}

func (s *TableDTO) SetPhyFileSize(v int64) *TableDTO {
	s.PhyFileSize = &v
	return s
}

func (s *TableDTO) SetTableLifeCycle(v string) *TableDTO {
	s.TableLifeCycle = &v
	return s
}

func (s *TableDTO) SetCreateTime(v string) *TableDTO {
	s.CreateTime = &v
	return s
}

func (s *TableDTO) SetLastDdlTime(v string) *TableDTO {
	s.LastDdlTime = &v
	return s
}

func (s *TableDTO) SetNodeIds(v string) *TableDTO {
	s.NodeIds = &v
	return s
}

func (s *TableDTO) SetLastViewTime(v string) *TableDTO {
	s.LastViewTime = &v
	return s
}

func (s *TableDTO) SetAppId(v string) *TableDTO {
	s.AppId = &v
	return s
}

func (s *TableDTO) SetPartitionKey(v string) *TableDTO {
	s.PartitionKey = &v
	return s
}

func (s *TableDTO) SetPrimaryKey(v string) *TableDTO {
	s.PrimaryKey = &v
	return s
}

func (s *TableDTO) SetDataLayer(v string) *TableDTO {
	s.DataLayer = &v
	return s
}

func (s *TableDTO) SetOwner(v string) *TableDTO {
	s.Owner = &v
	return s
}

func (s *TableDTO) SetOwnerName(v string) *TableDTO {
	s.OwnerName = &v
	return s
}

func (s *TableDTO) SetVisitCnt3m(v string) *TableDTO {
	s.VisitCnt3m = &v
	return s
}

func (s *TableDTO) SetEnv(v string) *TableDTO {
	s.Env = &v
	return s
}

func (s *TableDTO) SetName(v string) *TableDTO {
	s.Name = &v
	return s
}

func (s *TableDTO) SetNameCn(v string) *TableDTO {
	s.NameCn = &v
	return s
}

func (s *TableDTO) SetGmtDataUpdateTime(v string) *TableDTO {
	s.GmtDataUpdateTime = &v
	return s
}

func (s *TableDTO) SetDesc(v string) *TableDTO {
	s.Desc = &v
	return s
}

func (s *TableDTO) SetGuid(v string) *TableDTO {
	s.Guid = &v
	return s
}

func (s *TableDTO) SetLogicSubType(v string) *TableDTO {
	s.LogicSubType = &v
	return s
}

func (s *TableDTO) SetTenantId(v string) *TableDTO {
	s.TenantId = &v
	return s
}

func (s *TableDTO) SetBizUnitId(v string) *TableDTO {
	s.BizUnitId = &v
	return s
}

func (s *TableDTO) SetBizUnitName(v string) *TableDTO {
	s.BizUnitName = &v
	return s
}

func (s *TableDTO) SetDataCellJd(v string) *TableDTO {
	s.DataCellJd = &v
	return s
}

func (s *TableDTO) SetDataCellName(v string) *TableDTO {
	s.DataCellName = &v
	return s
}

func (s *TableDTO) SetProjectId(v string) *TableDTO {
	s.ProjectId = &v
	return s
}

func (s *TableDTO) SetProjectName(v string) *TableDTO {
	s.ProjectName = &v
	return s
}

func (s *TableDTO) SetDevelopMode(v string) *TableDTO {
	s.DevelopMode = &v
	return s
}

func (s *TableDTO) SetModelType(v string) *TableDTO {
	s.ModelType = &v
	return s
}

func (s *TableDTO) SetParentModelId(v string) *TableDTO {
	s.ParentModelId = &v
	return s
}

func (s *TableDTO) SetFileId(v string) *TableDTO {
	s.FileId = &v
	return s
}

func (s *TableDTO) SetColumns(v []*ColumnDTO) *TableDTO {
	s.Columns = v
	return s
}

// 查询结果
type QueryResult struct {
	// 工号
	WorkNo *string `json:"work_no,omitempty" xml:"work_no,omitempty" require:"true"`
	// 花名
	NickName *string `json:"nick_name,omitempty" xml:"nick_name,omitempty"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 域账号
	LoginAccount *string `json:"login_account,omitempty" xml:"login_account,omitempty" require:"true"`
	// 企业邮箱
	BuMail *string `json:"bu_mail,omitempty" xml:"bu_mail,omitempty" require:"true"`
	// 人员类型
	EmpType *string `json:"emp_type,omitempty" xml:"emp_type,omitempty" require:"true"`
}

func (s QueryResult) String() string {
	return tea.Prettify(s)
}

func (s QueryResult) GoString() string {
	return s.String()
}

func (s *QueryResult) SetWorkNo(v string) *QueryResult {
	s.WorkNo = &v
	return s
}

func (s *QueryResult) SetNickName(v string) *QueryResult {
	s.NickName = &v
	return s
}

func (s *QueryResult) SetName(v string) *QueryResult {
	s.Name = &v
	return s
}

func (s *QueryResult) SetLoginAccount(v string) *QueryResult {
	s.LoginAccount = &v
	return s
}

func (s *QueryResult) SetBuMail(v string) *QueryResult {
	s.BuMail = &v
	return s
}

func (s *QueryResult) SetEmpType(v string) *QueryResult {
	s.EmpType = &v
	return s
}

// PublishStatus
type PublishStatus struct {
	// status
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// errorCode
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty" require:"true"`
	// message
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
	// errorData
	ErrorData *string `json:"error_data,omitempty" xml:"error_data,omitempty" require:"true"`
}

func (s PublishStatus) String() string {
	return tea.Prettify(s)
}

func (s PublishStatus) GoString() string {
	return s.String()
}

func (s *PublishStatus) SetStatus(v string) *PublishStatus {
	s.Status = &v
	return s
}

func (s *PublishStatus) SetErrorCode(v string) *PublishStatus {
	s.ErrorCode = &v
	return s
}

func (s *PublishStatus) SetMessage(v string) *PublishStatus {
	s.Message = &v
	return s
}

func (s *PublishStatus) SetErrorData(v string) *PublishStatus {
	s.ErrorData = &v
	return s
}

// Zhx ir 结果
type ZhxIrResultStruct struct {
	// 日合计交易金额指数
	AmtIndexV *string `json:"amt_index_v,omitempty" xml:"amt_index_v,omitempty"`
	// 日合计交易笔数指标
	TransNumIndexV *string `json:"trans_num_index_v,omitempty" xml:"trans_num_index_v,omitempty"`
	// 日合计交易人数指数
	UserNumIndexV *string `json:"user_num_index_v,omitempty" xml:"user_num_index_v,omitempty"`
	// 时间
	Dt *string `json:"dt,omitempty" xml:"dt,omitempty"`
	// 城市等级
	CityLevel *string `json:"city_level,omitempty" xml:"city_level,omitempty"`
}

func (s ZhxIrResultStruct) String() string {
	return tea.Prettify(s)
}

func (s ZhxIrResultStruct) GoString() string {
	return s.String()
}

func (s *ZhxIrResultStruct) SetAmtIndexV(v string) *ZhxIrResultStruct {
	s.AmtIndexV = &v
	return s
}

func (s *ZhxIrResultStruct) SetTransNumIndexV(v string) *ZhxIrResultStruct {
	s.TransNumIndexV = &v
	return s
}

func (s *ZhxIrResultStruct) SetUserNumIndexV(v string) *ZhxIrResultStruct {
	s.UserNumIndexV = &v
	return s
}

func (s *ZhxIrResultStruct) SetDt(v string) *ZhxIrResultStruct {
	s.Dt = &v
	return s
}

func (s *ZhxIrResultStruct) SetCityLevel(v string) *ZhxIrResultStruct {
	s.CityLevel = &v
	return s
}

// 分区结果查询信息
type PartitionObject struct {
	// tableGuid
	TableGuid *string `json:"table_guid,omitempty" xml:"table_guid,omitempty" require:"true"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// create_time
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty" require:"true"`
	// last_modify_time
	LastModifyTime *string `json:"last_modify_time,omitempty" xml:"last_modify_time,omitempty" require:"true"`
	// panguFileSize
	PanguFileSize *int64 `json:"pangu_file_size,omitempty" xml:"pangu_file_size,omitempty" require:"true"`
	// recordCnt 记录数目
	RecordCnt *int64 `json:"record_cnt,omitempty" xml:"record_cnt,omitempty" require:"true"`
}

func (s PartitionObject) String() string {
	return tea.Prettify(s)
}

func (s PartitionObject) GoString() string {
	return s.String()
}

func (s *PartitionObject) SetTableGuid(v string) *PartitionObject {
	s.TableGuid = &v
	return s
}

func (s *PartitionObject) SetName(v string) *PartitionObject {
	s.Name = &v
	return s
}

func (s *PartitionObject) SetCreateTime(v string) *PartitionObject {
	s.CreateTime = &v
	return s
}

func (s *PartitionObject) SetLastModifyTime(v string) *PartitionObject {
	s.LastModifyTime = &v
	return s
}

func (s *PartitionObject) SetPanguFileSize(v int64) *PartitionObject {
	s.PanguFileSize = &v
	return s
}

func (s *PartitionObject) SetRecordCnt(v int64) *PartitionObject {
	s.RecordCnt = &v
	return s
}

// ProduceFeatureResultObj
type ProduceFeatureResultObj struct {
	// projectId
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// taskId
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// status
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// publishId
	PublishId *string `json:"publish_id,omitempty" xml:"publish_id,omitempty"`
	// supplementId
	SupplementId *string `json:"supplement_id,omitempty" xml:"supplement_id,omitempty"`
	// fileKey
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty"`
	// guid
	Guid *string `json:"guid,omitempty" xml:"guid,omitempty"`
	// partition
	Partition *string `json:"partition,omitempty" xml:"partition,omitempty"`
}

func (s ProduceFeatureResultObj) String() string {
	return tea.Prettify(s)
}

func (s ProduceFeatureResultObj) GoString() string {
	return s.String()
}

func (s *ProduceFeatureResultObj) SetProjectId(v string) *ProduceFeatureResultObj {
	s.ProjectId = &v
	return s
}

func (s *ProduceFeatureResultObj) SetTaskId(v string) *ProduceFeatureResultObj {
	s.TaskId = &v
	return s
}

func (s *ProduceFeatureResultObj) SetStatus(v string) *ProduceFeatureResultObj {
	s.Status = &v
	return s
}

func (s *ProduceFeatureResultObj) SetPublishId(v string) *ProduceFeatureResultObj {
	s.PublishId = &v
	return s
}

func (s *ProduceFeatureResultObj) SetSupplementId(v string) *ProduceFeatureResultObj {
	s.SupplementId = &v
	return s
}

func (s *ProduceFeatureResultObj) SetFileKey(v string) *ProduceFeatureResultObj {
	s.FileKey = &v
	return s
}

func (s *ProduceFeatureResultObj) SetGuid(v string) *ProduceFeatureResultObj {
	s.Guid = &v
	return s
}

func (s *ProduceFeatureResultObj) SetPartition(v string) *ProduceFeatureResultObj {
	s.Partition = &v
	return s
}

// BaseResult
type BaseResult struct {
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// errorCode
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty" require:"true"`
	// message
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
	// tabledto
	Data *TableDTO `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s BaseResult) String() string {
	return tea.Prettify(s)
}

func (s BaseResult) GoString() string {
	return s.String()
}

func (s *BaseResult) SetSuccess(v bool) *BaseResult {
	s.Success = &v
	return s
}

func (s *BaseResult) SetErrorCode(v string) *BaseResult {
	s.ErrorCode = &v
	return s
}

func (s *BaseResult) SetMessage(v string) *BaseResult {
	s.Message = &v
	return s
}

func (s *BaseResult) SetData(v *TableDTO) *BaseResult {
	s.Data = v
	return s
}

// 用户信息查询结果
type UserInfoResult struct {
	// hr主数据接口调用结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 调用信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 错误码
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 查询结果
	QueryResultList []*QueryResult `json:"query_result_list,omitempty" xml:"query_result_list,omitempty" require:"true" type:"Repeated"`
}

func (s UserInfoResult) String() string {
	return tea.Prettify(s)
}

func (s UserInfoResult) GoString() string {
	return s.String()
}

func (s *UserInfoResult) SetSuccess(v bool) *UserInfoResult {
	s.Success = &v
	return s
}

func (s *UserInfoResult) SetMessage(v string) *UserInfoResult {
	s.Message = &v
	return s
}

func (s *UserInfoResult) SetErrorCode(v string) *UserInfoResult {
	s.ErrorCode = &v
	return s
}

func (s *UserInfoResult) SetQueryResultList(v []*QueryResult) *UserInfoResult {
	s.QueryResultList = v
	return s
}

// 键值对，兼容map用
type NameValuePair struct {
	//
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

// 模型结果
type ModelResult struct {
	// 分数
	Score *string `json:"score,omitempty" xml:"score,omitempty" require:"true"`
	// 模型id
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
}

func (s ModelResult) String() string {
	return tea.Prettify(s)
}

func (s ModelResult) GoString() string {
	return s.String()
}

func (s *ModelResult) SetScore(v string) *ModelResult {
	s.Score = &v
	return s
}

func (s *ModelResult) SetModelId(v string) *ModelResult {
	s.ModelId = &v
	return s
}

type QueryDuankaEvaluationRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求流水ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 用户关联订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 请求模型ID列表（目前仅支持每次请求一个模型），逗号分割
	ModelList *string `json:"model_list,omitempty" xml:"model_list,omitempty" require:"true"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 用户id类型：
	// "ID_NO"： 身份证号,
	UserIdType *string `json:"user_id_type,omitempty" xml:"user_id_type,omitempty" require:"true"`
	// 加密类型(目前只支持SHA256):
	// "MD5"：MD5（32位小写）,
	// "SHA256" ： SHA256（密文小写），              "SM3"： SM3（密文小写）
	EncryptType *string `json:"encrypt_type,omitempty" xml:"encrypt_type,omitempty" require:"true"`
	// 用户授权模版编号
	AuthTemplateNo *string `json:"auth_template_no,omitempty" xml:"auth_template_no,omitempty" require:"true"`
	// 用户授权编码
	AuthNo *string `json:"auth_no,omitempty" xml:"auth_no,omitempty" require:"true"`
	// 客户发起请求时间, 格式："yyyy-MM-dd HH:mm:ss"
	RequestTime *string `json:"request_time,omitempty" xml:"request_time,omitempty" require:"true"`
}

func (s QueryDuankaEvaluationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDuankaEvaluationRequest) GoString() string {
	return s.String()
}

func (s *QueryDuankaEvaluationRequest) SetAuthToken(v string) *QueryDuankaEvaluationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDuankaEvaluationRequest) SetRequestId(v string) *QueryDuankaEvaluationRequest {
	s.RequestId = &v
	return s
}

func (s *QueryDuankaEvaluationRequest) SetOrderId(v string) *QueryDuankaEvaluationRequest {
	s.OrderId = &v
	return s
}

func (s *QueryDuankaEvaluationRequest) SetModelList(v string) *QueryDuankaEvaluationRequest {
	s.ModelList = &v
	return s
}

func (s *QueryDuankaEvaluationRequest) SetUserId(v string) *QueryDuankaEvaluationRequest {
	s.UserId = &v
	return s
}

func (s *QueryDuankaEvaluationRequest) SetUserIdType(v string) *QueryDuankaEvaluationRequest {
	s.UserIdType = &v
	return s
}

func (s *QueryDuankaEvaluationRequest) SetEncryptType(v string) *QueryDuankaEvaluationRequest {
	s.EncryptType = &v
	return s
}

func (s *QueryDuankaEvaluationRequest) SetAuthTemplateNo(v string) *QueryDuankaEvaluationRequest {
	s.AuthTemplateNo = &v
	return s
}

func (s *QueryDuankaEvaluationRequest) SetAuthNo(v string) *QueryDuankaEvaluationRequest {
	s.AuthNo = &v
	return s
}

func (s *QueryDuankaEvaluationRequest) SetRequestTime(v string) *QueryDuankaEvaluationRequest {
	s.RequestTime = &v
	return s
}

type QueryDuankaEvaluationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模型结果，数组返回
	Result []*ModelResult `json:"result,omitempty" xml:"result,omitempty" type:"Repeated"`
	// 请求流水ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s QueryDuankaEvaluationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDuankaEvaluationResponse) GoString() string {
	return s.String()
}

func (s *QueryDuankaEvaluationResponse) SetReqMsgId(v string) *QueryDuankaEvaluationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDuankaEvaluationResponse) SetResultCode(v string) *QueryDuankaEvaluationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDuankaEvaluationResponse) SetResultMsg(v string) *QueryDuankaEvaluationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDuankaEvaluationResponse) SetResult(v []*ModelResult) *QueryDuankaEvaluationResponse {
	s.Result = v
	return s
}

func (s *QueryDuankaEvaluationResponse) SetRequestId(v string) *QueryDuankaEvaluationResponse {
	s.RequestId = &v
	return s
}

type QueryHrUserRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 花名列表
	NickNameList []*string `json:"nick_name_list,omitempty" xml:"nick_name_list,omitempty" type:"Repeated"`
	// 域账户列表
	LoginAccountList []*string `json:"login_account_list,omitempty" xml:"login_account_list,omitempty" type:"Repeated"`
}

func (s QueryHrUserRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryHrUserRequest) GoString() string {
	return s.String()
}

func (s *QueryHrUserRequest) SetAuthToken(v string) *QueryHrUserRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryHrUserRequest) SetNickNameList(v []*string) *QueryHrUserRequest {
	s.NickNameList = v
	return s
}

func (s *QueryHrUserRequest) SetLoginAccountList(v []*string) *QueryHrUserRequest {
	s.LoginAccountList = v
	return s
}

type QueryHrUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询用户信息结果
	UserInfoResult *UserInfoResult `json:"user_info_result,omitempty" xml:"user_info_result,omitempty"`
}

func (s QueryHrUserResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryHrUserResponse) GoString() string {
	return s.String()
}

func (s *QueryHrUserResponse) SetReqMsgId(v string) *QueryHrUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryHrUserResponse) SetResultCode(v string) *QueryHrUserResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryHrUserResponse) SetResultMsg(v string) *QueryHrUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryHrUserResponse) SetUserInfoResult(v *UserInfoResult) *QueryHrUserResponse {
	s.UserInfoResult = v
	return s
}

type QuerySkyholdResRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 业务biz_code
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty" require:"true"`
	// 查询key
	KeyId *string `json:"key_id,omitempty" xml:"key_id,omitempty" require:"true"`
	// 渠道code
	ChannelCode *string `json:"channel_code,omitempty" xml:"channel_code,omitempty" require:"true"`
	// 客户id
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty" require:"true"`
	// 授权码
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty"`
}

func (s QuerySkyholdResRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySkyholdResRequest) GoString() string {
	return s.String()
}

func (s *QuerySkyholdResRequest) SetAuthToken(v string) *QuerySkyholdResRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySkyholdResRequest) SetBizCode(v string) *QuerySkyholdResRequest {
	s.BizCode = &v
	return s
}

func (s *QuerySkyholdResRequest) SetKeyId(v string) *QuerySkyholdResRequest {
	s.KeyId = &v
	return s
}

func (s *QuerySkyholdResRequest) SetChannelCode(v string) *QuerySkyholdResRequest {
	s.ChannelCode = &v
	return s
}

func (s *QuerySkyholdResRequest) SetCustomerId(v string) *QuerySkyholdResRequest {
	s.CustomerId = &v
	return s
}

func (s *QuerySkyholdResRequest) SetAuthCode(v string) *QuerySkyholdResRequest {
	s.AuthCode = &v
	return s
}

type QuerySkyholdResResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询结果
	JsonRes *string `json:"json_res,omitempty" xml:"json_res,omitempty"`
}

func (s QuerySkyholdResResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySkyholdResResponse) GoString() string {
	return s.String()
}

func (s *QuerySkyholdResResponse) SetReqMsgId(v string) *QuerySkyholdResResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySkyholdResResponse) SetResultCode(v string) *QuerySkyholdResResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySkyholdResResponse) SetResultMsg(v string) *QuerySkyholdResResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySkyholdResResponse) SetJsonRes(v string) *QuerySkyholdResResponse {
	s.JsonRes = &v
	return s
}

type QueryCommonScoreRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 用户授权编码
	AuthNo *string `json:"auth_no,omitempty" xml:"auth_no,omitempty" require:"true"`
	// 模型id
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
	// 用户id（客户身份证号/手机号的md5/sha256散列值）
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
	UserIdType *string `json:"user_id_type,omitempty" xml:"user_id_type,omitempty" require:"true"`
	// user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
	EncryptType *string `json:"encrypt_type,omitempty" xml:"encrypt_type,omitempty" require:"true"`
	// 客户编码
	CustomerCode *string `json:"customer_code,omitempty" xml:"customer_code,omitempty" require:"true"`
	// 流水号，串联链路用，非必填
	TransNo *string `json:"trans_no,omitempty" xml:"trans_no,omitempty"`
	// encrypt_type类型的散列后的操作，默认为空不加密。
	// 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING
	// 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。
	// 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
	UserIdHashEncrypt *string `json:"user_id_hash_encrypt,omitempty" xml:"user_id_hash_encrypt,omitempty"`
}

func (s QueryCommonScoreRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCommonScoreRequest) GoString() string {
	return s.String()
}

func (s *QueryCommonScoreRequest) SetAuthToken(v string) *QueryCommonScoreRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCommonScoreRequest) SetAuthNo(v string) *QueryCommonScoreRequest {
	s.AuthNo = &v
	return s
}

func (s *QueryCommonScoreRequest) SetModelId(v string) *QueryCommonScoreRequest {
	s.ModelId = &v
	return s
}

func (s *QueryCommonScoreRequest) SetUserId(v string) *QueryCommonScoreRequest {
	s.UserId = &v
	return s
}

func (s *QueryCommonScoreRequest) SetUserIdType(v string) *QueryCommonScoreRequest {
	s.UserIdType = &v
	return s
}

func (s *QueryCommonScoreRequest) SetEncryptType(v string) *QueryCommonScoreRequest {
	s.EncryptType = &v
	return s
}

func (s *QueryCommonScoreRequest) SetCustomerCode(v string) *QueryCommonScoreRequest {
	s.CustomerCode = &v
	return s
}

func (s *QueryCommonScoreRequest) SetTransNo(v string) *QueryCommonScoreRequest {
	s.TransNo = &v
	return s
}

func (s *QueryCommonScoreRequest) SetUserIdHashEncrypt(v string) *QueryCommonScoreRequest {
	s.UserIdHashEncrypt = &v
	return s
}

type QueryCommonScoreResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模型分数
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
	// 流水号
	TransNo *string `json:"trans_no,omitempty" xml:"trans_no,omitempty"`
}

func (s QueryCommonScoreResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCommonScoreResponse) GoString() string {
	return s.String()
}

func (s *QueryCommonScoreResponse) SetReqMsgId(v string) *QueryCommonScoreResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCommonScoreResponse) SetResultCode(v string) *QueryCommonScoreResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCommonScoreResponse) SetResultMsg(v string) *QueryCommonScoreResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCommonScoreResponse) SetScore(v string) *QueryCommonScoreResponse {
	s.Score = &v
	return s
}

func (s *QueryCommonScoreResponse) SetTransNo(v string) *QueryCommonScoreResponse {
	s.TransNo = &v
	return s
}

type SubmitYunfengdieAuditRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 接口调用参数
	Params *string `json:"params,omitempty" xml:"params,omitempty" require:"true"`
	// 请求头参数
	Headers *string `json:"headers,omitempty" xml:"headers,omitempty" require:"true"`
}

func (s SubmitYunfengdieAuditRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitYunfengdieAuditRequest) GoString() string {
	return s.String()
}

func (s *SubmitYunfengdieAuditRequest) SetAuthToken(v string) *SubmitYunfengdieAuditRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitYunfengdieAuditRequest) SetParams(v string) *SubmitYunfengdieAuditRequest {
	s.Params = &v
	return s
}

func (s *SubmitYunfengdieAuditRequest) SetHeaders(v string) *SubmitYunfengdieAuditRequest {
	s.Headers = &v
	return s
}

type SubmitYunfengdieAuditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 云凤蝶工单提交相应JSON
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s SubmitYunfengdieAuditResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitYunfengdieAuditResponse) GoString() string {
	return s.String()
}

func (s *SubmitYunfengdieAuditResponse) SetReqMsgId(v string) *SubmitYunfengdieAuditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitYunfengdieAuditResponse) SetResultCode(v string) *SubmitYunfengdieAuditResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitYunfengdieAuditResponse) SetResultMsg(v string) *SubmitYunfengdieAuditResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitYunfengdieAuditResponse) SetResult(v string) *SubmitYunfengdieAuditResponse {
	s.Result = &v
	return s
}

type ImportAistudioOssRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 阿里云oss路径
	AliyunOssPath *string `json:"aliyun_oss_path,omitempty" xml:"aliyun_oss_path,omitempty" require:"true"`
	// 主站oss路径
	AntOssPath *string `json:"ant_oss_path,omitempty" xml:"ant_oss_path,omitempty" require:"true"`
}

func (s ImportAistudioOssRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportAistudioOssRequest) GoString() string {
	return s.String()
}

func (s *ImportAistudioOssRequest) SetAuthToken(v string) *ImportAistudioOssRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportAistudioOssRequest) SetAliyunOssPath(v string) *ImportAistudioOssRequest {
	s.AliyunOssPath = &v
	return s
}

func (s *ImportAistudioOssRequest) SetAntOssPath(v string) *ImportAistudioOssRequest {
	s.AntOssPath = &v
	return s
}

type ImportAistudioOssResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ImportAistudioOssResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportAistudioOssResponse) GoString() string {
	return s.String()
}

func (s *ImportAistudioOssResponse) SetReqMsgId(v string) *ImportAistudioOssResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportAistudioOssResponse) SetResultCode(v string) *ImportAistudioOssResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportAistudioOssResponse) SetResultMsg(v string) *ImportAistudioOssResponse {
	s.ResultMsg = &v
	return s
}

type CheckAistudioModelRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 业务唯一码（可填model_id）
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty" require:"true"`
	// 业务类型（TDI平台填TDI）
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 模型类型（1：离线模型，2：在线模型，3：既是离线也是在线）
	ModelType *int64 `json:"model_type,omitempty" xml:"model_type,omitempty" require:"true"`
	// 所需要验收服务的list
	// 1. PRESSURE
	// 2. RUNTIMUE
	// 3. SAFETY
	ServiceSelector *string `json:"service_selector,omitempty" xml:"service_selector,omitempty" require:"true"`
	// 离线模型oss路径
	OfflineModelPath *string `json:"offline_model_path,omitempty" xml:"offline_model_path,omitempty"`
	// 在线模型oss路径
	OnlineModelPath *string `json:"online_model_path,omitempty" xml:"online_model_path,omitempty"`
	// 模型脚本oss路径
	ScriptPath *string `json:"script_path,omitempty" xml:"script_path,omitempty" require:"true"`
	// 验证样本（csv格式，包括保留列、特征列和分数）的OSS路径
	SamplePath *string `json:"sample_path,omitempty" xml:"sample_path,omitempty" require:"true"`
	// 验证样本保留列的list
	RemainList *string `json:"remain_list,omitempty" xml:"remain_list,omitempty" require:"true"`
	// 验证样本特征列的list
	FeatureList *string `json:"feature_list,omitempty" xml:"feature_list,omitempty" require:"true"`
	// 验证样本分数列
	ScoreCol *string `json:"score_col,omitempty" xml:"score_col,omitempty" require:"true"`
	// aistudio docker镜像指定，若未指定，则默认为
	// reg.docker.alibaba-inc.com/aii/aistudio:aistudio-108521006-1633157052-1690290565806
	DockerImage *string `json:"docker_image,omitempty" xml:"docker_image,omitempty"`
	// 在线模型压测核数，默认为1
	PmCore *int64 `json:"pm_core,omitempty" xml:"pm_core,omitempty"`
	// 在线模型压测内存大小（GB），默认为2
	PmMem *int64 `json:"pm_mem,omitempty" xml:"pm_mem,omitempty"`
	// 离线模型批次大小，默认2000
	BatchSize *int64 `json:"batch_size,omitempty" xml:"batch_size,omitempty"`
	// 验证所用样本数，默认50000
	VerificationNum *int64 `json:"verification_num,omitempty" xml:"verification_num,omitempty"`
}

func (s CheckAistudioModelRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckAistudioModelRequest) GoString() string {
	return s.String()
}

func (s *CheckAistudioModelRequest) SetAuthToken(v string) *CheckAistudioModelRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckAistudioModelRequest) SetBizCode(v string) *CheckAistudioModelRequest {
	s.BizCode = &v
	return s
}

func (s *CheckAistudioModelRequest) SetBizType(v string) *CheckAistudioModelRequest {
	s.BizType = &v
	return s
}

func (s *CheckAistudioModelRequest) SetModelType(v int64) *CheckAistudioModelRequest {
	s.ModelType = &v
	return s
}

func (s *CheckAistudioModelRequest) SetServiceSelector(v string) *CheckAistudioModelRequest {
	s.ServiceSelector = &v
	return s
}

func (s *CheckAistudioModelRequest) SetOfflineModelPath(v string) *CheckAistudioModelRequest {
	s.OfflineModelPath = &v
	return s
}

func (s *CheckAistudioModelRequest) SetOnlineModelPath(v string) *CheckAistudioModelRequest {
	s.OnlineModelPath = &v
	return s
}

func (s *CheckAistudioModelRequest) SetScriptPath(v string) *CheckAistudioModelRequest {
	s.ScriptPath = &v
	return s
}

func (s *CheckAistudioModelRequest) SetSamplePath(v string) *CheckAistudioModelRequest {
	s.SamplePath = &v
	return s
}

func (s *CheckAistudioModelRequest) SetRemainList(v string) *CheckAistudioModelRequest {
	s.RemainList = &v
	return s
}

func (s *CheckAistudioModelRequest) SetFeatureList(v string) *CheckAistudioModelRequest {
	s.FeatureList = &v
	return s
}

func (s *CheckAistudioModelRequest) SetScoreCol(v string) *CheckAistudioModelRequest {
	s.ScoreCol = &v
	return s
}

func (s *CheckAistudioModelRequest) SetDockerImage(v string) *CheckAistudioModelRequest {
	s.DockerImage = &v
	return s
}

func (s *CheckAistudioModelRequest) SetPmCore(v int64) *CheckAistudioModelRequest {
	s.PmCore = &v
	return s
}

func (s *CheckAistudioModelRequest) SetPmMem(v int64) *CheckAistudioModelRequest {
	s.PmMem = &v
	return s
}

func (s *CheckAistudioModelRequest) SetBatchSize(v int64) *CheckAistudioModelRequest {
	s.BatchSize = &v
	return s
}

func (s *CheckAistudioModelRequest) SetVerificationNum(v int64) *CheckAistudioModelRequest {
	s.VerificationNum = &v
	return s
}

type CheckAistudioModelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 异步任务id
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
}

func (s CheckAistudioModelResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckAistudioModelResponse) GoString() string {
	return s.String()
}

func (s *CheckAistudioModelResponse) SetReqMsgId(v string) *CheckAistudioModelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckAistudioModelResponse) SetResultCode(v string) *CheckAistudioModelResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckAistudioModelResponse) SetResultMsg(v string) *CheckAistudioModelResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckAistudioModelResponse) SetTaskId(v string) *CheckAistudioModelResponse {
	s.TaskId = &v
	return s
}

type QueryAistudioModelRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 任务id
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryAistudioModelRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAistudioModelRequest) GoString() string {
	return s.String()
}

func (s *QueryAistudioModelRequest) SetAuthToken(v string) *QueryAistudioModelRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAistudioModelRequest) SetTaskId(v string) *QueryAistudioModelRequest {
	s.TaskId = &v
	return s
}

type QueryAistudioModelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务唯一id
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 压测报告
	PressureReport *string `json:"pressure_report,omitempty" xml:"pressure_report,omitempty"`
	// 运行态报告
	RuntimeReport *string `json:"runtime_report,omitempty" xml:"runtime_report,omitempty"`
	// 安全报告
	SafetyReport *string `json:"safety_report,omitempty" xml:"safety_report,omitempty"`
	// 任务状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s QueryAistudioModelResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAistudioModelResponse) GoString() string {
	return s.String()
}

func (s *QueryAistudioModelResponse) SetReqMsgId(v string) *QueryAistudioModelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAistudioModelResponse) SetResultCode(v string) *QueryAistudioModelResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAistudioModelResponse) SetResultMsg(v string) *QueryAistudioModelResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAistudioModelResponse) SetBizCode(v string) *QueryAistudioModelResponse {
	s.BizCode = &v
	return s
}

func (s *QueryAistudioModelResponse) SetPressureReport(v string) *QueryAistudioModelResponse {
	s.PressureReport = &v
	return s
}

func (s *QueryAistudioModelResponse) SetRuntimeReport(v string) *QueryAistudioModelResponse {
	s.RuntimeReport = &v
	return s
}

func (s *QueryAistudioModelResponse) SetSafetyReport(v string) *QueryAistudioModelResponse {
	s.SafetyReport = &v
	return s
}

func (s *QueryAistudioModelResponse) SetStatus(v string) *QueryAistudioModelResponse {
	s.Status = &v
	return s
}

type QueryBacktrackScoreRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 用户授权编码
	AuthNo *string `json:"auth_no,omitempty" xml:"auth_no,omitempty" require:"true"`
	// 模型id
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
	// 用户id（客户身份证号/手机号的md5/sha256/sm3散列值）
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
	UserIdType *string `json:"user_id_type,omitempty" xml:"user_id_type,omitempty" require:"true"`
	// user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
	EncryptType *string `json:"encrypt_type,omitempty" xml:"encrypt_type,omitempty" require:"true"`
	//
	// 客户编码
	CustomerCode *string `json:"customer_code,omitempty" xml:"customer_code,omitempty" require:"true"`
	// 流水号，串联链路用，非必填
	TransNo *string `json:"trans_no,omitempty" xml:"trans_no,omitempty"`
	// encrypt_type类型的散列后的操作，默认为空不加密。 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
	UserIdHashEncrypt *string `json:"user_id_hash_encrypt,omitempty" xml:"user_id_hash_encrypt,omitempty"`
	// 回溯采样日期
	SampleDate *string `json:"sample_date,omitempty" xml:"sample_date,omitempty" require:"true"`
}

func (s QueryBacktrackScoreRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBacktrackScoreRequest) GoString() string {
	return s.String()
}

func (s *QueryBacktrackScoreRequest) SetAuthToken(v string) *QueryBacktrackScoreRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBacktrackScoreRequest) SetAuthNo(v string) *QueryBacktrackScoreRequest {
	s.AuthNo = &v
	return s
}

func (s *QueryBacktrackScoreRequest) SetModelId(v string) *QueryBacktrackScoreRequest {
	s.ModelId = &v
	return s
}

func (s *QueryBacktrackScoreRequest) SetUserId(v string) *QueryBacktrackScoreRequest {
	s.UserId = &v
	return s
}

func (s *QueryBacktrackScoreRequest) SetUserIdType(v string) *QueryBacktrackScoreRequest {
	s.UserIdType = &v
	return s
}

func (s *QueryBacktrackScoreRequest) SetEncryptType(v string) *QueryBacktrackScoreRequest {
	s.EncryptType = &v
	return s
}

func (s *QueryBacktrackScoreRequest) SetCustomerCode(v string) *QueryBacktrackScoreRequest {
	s.CustomerCode = &v
	return s
}

func (s *QueryBacktrackScoreRequest) SetTransNo(v string) *QueryBacktrackScoreRequest {
	s.TransNo = &v
	return s
}

func (s *QueryBacktrackScoreRequest) SetUserIdHashEncrypt(v string) *QueryBacktrackScoreRequest {
	s.UserIdHashEncrypt = &v
	return s
}

func (s *QueryBacktrackScoreRequest) SetSampleDate(v string) *QueryBacktrackScoreRequest {
	s.SampleDate = &v
	return s
}

type QueryBacktrackScoreResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模型分数
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
	// 流水号
	TransNo *string `json:"trans_no,omitempty" xml:"trans_no,omitempty"`
}

func (s QueryBacktrackScoreResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBacktrackScoreResponse) GoString() string {
	return s.String()
}

func (s *QueryBacktrackScoreResponse) SetReqMsgId(v string) *QueryBacktrackScoreResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBacktrackScoreResponse) SetResultCode(v string) *QueryBacktrackScoreResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBacktrackScoreResponse) SetResultMsg(v string) *QueryBacktrackScoreResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBacktrackScoreResponse) SetScore(v string) *QueryBacktrackScoreResponse {
	s.Score = &v
	return s
}

func (s *QueryBacktrackScoreResponse) SetTransNo(v string) *QueryBacktrackScoreResponse {
	s.TransNo = &v
	return s
}

type CheckEasMdetectionRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// sql
	Sql *string `json:"sql,omitempty" xml:"sql,omitempty" require:"true"`
}

func (s CheckEasMdetectionRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckEasMdetectionRequest) GoString() string {
	return s.String()
}

func (s *CheckEasMdetectionRequest) SetAuthToken(v string) *CheckEasMdetectionRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckEasMdetectionRequest) SetSql(v string) *CheckEasMdetectionRequest {
	s.Sql = &v
	return s
}

type CheckEasMdetectionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 检查结果
	CheckResult *bool `json:"check_result,omitempty" xml:"check_result,omitempty"`
	// 检查结果码
	CheckCode *string `json:"check_code,omitempty" xml:"check_code,omitempty"`
	// 检查消息
	CheckMessage *string `json:"check_message,omitempty" xml:"check_message,omitempty"`
}

func (s CheckEasMdetectionResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckEasMdetectionResponse) GoString() string {
	return s.String()
}

func (s *CheckEasMdetectionResponse) SetReqMsgId(v string) *CheckEasMdetectionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckEasMdetectionResponse) SetResultCode(v string) *CheckEasMdetectionResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckEasMdetectionResponse) SetResultMsg(v string) *CheckEasMdetectionResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckEasMdetectionResponse) SetCheckResult(v bool) *CheckEasMdetectionResponse {
	s.CheckResult = &v
	return s
}

func (s *CheckEasMdetectionResponse) SetCheckCode(v string) *CheckEasMdetectionResponse {
	s.CheckCode = &v
	return s
}

func (s *CheckEasMdetectionResponse) SetCheckMessage(v string) *CheckEasMdetectionResponse {
	s.CheckMessage = &v
	return s
}

type QueryBpserviceHttpRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求地址
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 请求头参数
	Headers []*NameValuePair `json:"headers,omitempty" xml:"headers,omitempty" type:"Repeated"`
	// 请求体JSON String
	RequestBody *string `json:"request_body,omitempty" xml:"request_body,omitempty"`
	// 0-GET，1-POST，2-PUT，3-DELETE
	HttpMethod *int64 `json:"http_method,omitempty" xml:"http_method,omitempty" require:"true"`
}

func (s QueryBpserviceHttpRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBpserviceHttpRequest) GoString() string {
	return s.String()
}

func (s *QueryBpserviceHttpRequest) SetAuthToken(v string) *QueryBpserviceHttpRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBpserviceHttpRequest) SetUrl(v string) *QueryBpserviceHttpRequest {
	s.Url = &v
	return s
}

func (s *QueryBpserviceHttpRequest) SetHeaders(v []*NameValuePair) *QueryBpserviceHttpRequest {
	s.Headers = v
	return s
}

func (s *QueryBpserviceHttpRequest) SetRequestBody(v string) *QueryBpserviceHttpRequest {
	s.RequestBody = &v
	return s
}

func (s *QueryBpserviceHttpRequest) SetHttpMethod(v int64) *QueryBpserviceHttpRequest {
	s.HttpMethod = &v
	return s
}

type QueryBpserviceHttpResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// http响应body String
	ResponseBodyString *string `json:"response_body_string,omitempty" xml:"response_body_string,omitempty"`
}

func (s QueryBpserviceHttpResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBpserviceHttpResponse) GoString() string {
	return s.String()
}

func (s *QueryBpserviceHttpResponse) SetReqMsgId(v string) *QueryBpserviceHttpResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBpserviceHttpResponse) SetResultCode(v string) *QueryBpserviceHttpResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBpserviceHttpResponse) SetResultMsg(v string) *QueryBpserviceHttpResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBpserviceHttpResponse) SetResponseBodyString(v string) *QueryBpserviceHttpResponse {
	s.ResponseBodyString = &v
	return s
}

type ImportDataphinTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true"`
	// 操作人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// projectTaskPath项目任务地址
	ProjectTaskPath *string `json:"project_task_path,omitempty" xml:"project_task_path,omitempty" require:"true"`
	// tenantId租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// dt=20240226
	Params *string `json:"params,omitempty" xml:"params,omitempty" require:"true"`
	// sql
	Sql *string `json:"sql,omitempty" xml:"sql,omitempty" require:"true"`
}

func (s ImportDataphinTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportDataphinTaskRequest) GoString() string {
	return s.String()
}

func (s *ImportDataphinTaskRequest) SetAuthToken(v string) *ImportDataphinTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportDataphinTaskRequest) SetName(v string) *ImportDataphinTaskRequest {
	s.Name = &v
	return s
}

func (s *ImportDataphinTaskRequest) SetDesc(v string) *ImportDataphinTaskRequest {
	s.Desc = &v
	return s
}

func (s *ImportDataphinTaskRequest) SetOperator(v string) *ImportDataphinTaskRequest {
	s.Operator = &v
	return s
}

func (s *ImportDataphinTaskRequest) SetProjectId(v string) *ImportDataphinTaskRequest {
	s.ProjectId = &v
	return s
}

func (s *ImportDataphinTaskRequest) SetProjectTaskPath(v string) *ImportDataphinTaskRequest {
	s.ProjectTaskPath = &v
	return s
}

func (s *ImportDataphinTaskRequest) SetTenantId(v string) *ImportDataphinTaskRequest {
	s.TenantId = &v
	return s
}

func (s *ImportDataphinTaskRequest) SetParams(v string) *ImportDataphinTaskRequest {
	s.Params = &v
	return s
}

func (s *ImportDataphinTaskRequest) SetSql(v string) *ImportDataphinTaskRequest {
	s.Sql = &v
	return s
}

type ImportDataphinTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果数据
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ImportDataphinTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportDataphinTaskResponse) GoString() string {
	return s.String()
}

func (s *ImportDataphinTaskResponse) SetReqMsgId(v string) *ImportDataphinTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportDataphinTaskResponse) SetResultCode(v string) *ImportDataphinTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportDataphinTaskResponse) SetResultMsg(v string) *ImportDataphinTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportDataphinTaskResponse) SetData(v string) *ImportDataphinTaskResponse {
	s.Data = &v
	return s
}

type SyncOssOdpsRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// ossPath
	OssPath *string `json:"oss_path,omitempty" xml:"oss_path,omitempty" require:"true"`
	// ossFilename
	OssFilename *string `json:"oss_filename,omitempty" xml:"oss_filename,omitempty" require:"true"`
	// 来源列表
	SourceList []*string `json:"source_list,omitempty" xml:"source_list,omitempty" type:"Repeated"`
	// oss ds id
	OssDsId *string `json:"oss_ds_id,omitempty" xml:"oss_ds_id,omitempty" require:"true"`
	// ossDsName
	OssDsName *string `json:"oss_ds_name,omitempty" xml:"oss_ds_name,omitempty" require:"true"`
	// odpsDsId
	OdpsDsId *string `json:"odps_ds_id,omitempty" xml:"odps_ds_id,omitempty" require:"true"`
	// odps_ds_name
	OdpsDsName *string `json:"odps_ds_name,omitempty" xml:"odps_ds_name,omitempty" require:"true"`
	// odpsProjectName
	OdpsProjectName *string `json:"odps_project_name,omitempty" xml:"odps_project_name,omitempty" require:"true"`
	// odpsTableName
	OdpsTableName *string `json:"odps_table_name,omitempty" xml:"odps_table_name,omitempty" require:"true"`
	// odpsGuidTableName
	OdpsGuidTableName *string `json:"odps_guid_table_name,omitempty" xml:"odps_guid_table_name,omitempty" require:"true"`
	// partitionCondition
	PartitionCondition *string `json:"partition_condition,omitempty" xml:"partition_condition,omitempty" require:"true"`
	// where
	Where *string `json:"where,omitempty" xml:"where,omitempty"`
	// columnList
	ColumnList []*string `json:"column_list,omitempty" xml:"column_list,omitempty" require:"true" type:"Repeated"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
	// 操作人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// projectId项目id
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// projectTaskPath 项目任务地址
	ProjectTaskPath *string `json:"project_task_path,omitempty" xml:"project_task_path,omitempty" require:"true"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 参数
	Params *string `json:"params,omitempty" xml:"params,omitempty"`
}

func (s SyncOssOdpsRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncOssOdpsRequest) GoString() string {
	return s.String()
}

func (s *SyncOssOdpsRequest) SetAuthToken(v string) *SyncOssOdpsRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncOssOdpsRequest) SetOssPath(v string) *SyncOssOdpsRequest {
	s.OssPath = &v
	return s
}

func (s *SyncOssOdpsRequest) SetOssFilename(v string) *SyncOssOdpsRequest {
	s.OssFilename = &v
	return s
}

func (s *SyncOssOdpsRequest) SetSourceList(v []*string) *SyncOssOdpsRequest {
	s.SourceList = v
	return s
}

func (s *SyncOssOdpsRequest) SetOssDsId(v string) *SyncOssOdpsRequest {
	s.OssDsId = &v
	return s
}

func (s *SyncOssOdpsRequest) SetOssDsName(v string) *SyncOssOdpsRequest {
	s.OssDsName = &v
	return s
}

func (s *SyncOssOdpsRequest) SetOdpsDsId(v string) *SyncOssOdpsRequest {
	s.OdpsDsId = &v
	return s
}

func (s *SyncOssOdpsRequest) SetOdpsDsName(v string) *SyncOssOdpsRequest {
	s.OdpsDsName = &v
	return s
}

func (s *SyncOssOdpsRequest) SetOdpsProjectName(v string) *SyncOssOdpsRequest {
	s.OdpsProjectName = &v
	return s
}

func (s *SyncOssOdpsRequest) SetOdpsTableName(v string) *SyncOssOdpsRequest {
	s.OdpsTableName = &v
	return s
}

func (s *SyncOssOdpsRequest) SetOdpsGuidTableName(v string) *SyncOssOdpsRequest {
	s.OdpsGuidTableName = &v
	return s
}

func (s *SyncOssOdpsRequest) SetPartitionCondition(v string) *SyncOssOdpsRequest {
	s.PartitionCondition = &v
	return s
}

func (s *SyncOssOdpsRequest) SetWhere(v string) *SyncOssOdpsRequest {
	s.Where = &v
	return s
}

func (s *SyncOssOdpsRequest) SetColumnList(v []*string) *SyncOssOdpsRequest {
	s.ColumnList = v
	return s
}

func (s *SyncOssOdpsRequest) SetName(v string) *SyncOssOdpsRequest {
	s.Name = &v
	return s
}

func (s *SyncOssOdpsRequest) SetDesc(v string) *SyncOssOdpsRequest {
	s.Desc = &v
	return s
}

func (s *SyncOssOdpsRequest) SetOperator(v string) *SyncOssOdpsRequest {
	s.Operator = &v
	return s
}

func (s *SyncOssOdpsRequest) SetProjectId(v string) *SyncOssOdpsRequest {
	s.ProjectId = &v
	return s
}

func (s *SyncOssOdpsRequest) SetProjectTaskPath(v string) *SyncOssOdpsRequest {
	s.ProjectTaskPath = &v
	return s
}

func (s *SyncOssOdpsRequest) SetTenantId(v string) *SyncOssOdpsRequest {
	s.TenantId = &v
	return s
}

func (s *SyncOssOdpsRequest) SetParams(v string) *SyncOssOdpsRequest {
	s.Params = &v
	return s
}

type SyncOssOdpsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// requestId
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// message
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// trace_id
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s SyncOssOdpsResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncOssOdpsResponse) GoString() string {
	return s.String()
}

func (s *SyncOssOdpsResponse) SetReqMsgId(v string) *SyncOssOdpsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncOssOdpsResponse) SetResultCode(v string) *SyncOssOdpsResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncOssOdpsResponse) SetResultMsg(v string) *SyncOssOdpsResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncOssOdpsResponse) SetRequestId(v string) *SyncOssOdpsResponse {
	s.RequestId = &v
	return s
}

func (s *SyncOssOdpsResponse) SetCode(v string) *SyncOssOdpsResponse {
	s.Code = &v
	return s
}

func (s *SyncOssOdpsResponse) SetMessage(v string) *SyncOssOdpsResponse {
	s.Message = &v
	return s
}

func (s *SyncOssOdpsResponse) SetTraceId(v string) *SyncOssOdpsResponse {
	s.TraceId = &v
	return s
}

func (s *SyncOssOdpsResponse) SetData(v string) *SyncOssOdpsResponse {
	s.Data = &v
	return s
}

type SyncOpdsOssRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// ossPath
	OssPath *string `json:"oss_path,omitempty" xml:"oss_path,omitempty" require:"true"`
	// ossFilename
	OssFilename *string `json:"oss_filename,omitempty" xml:"oss_filename,omitempty" require:"true"`
	// ossDsId
	OssDsId *string `json:"oss_ds_id,omitempty" xml:"oss_ds_id,omitempty" require:"true"`
	// ossDsName
	OssDsName *string `json:"oss_ds_name,omitempty" xml:"oss_ds_name,omitempty" require:"true"`
	// odpsDsId
	OdpsDsId *string `json:"odps_ds_id,omitempty" xml:"odps_ds_id,omitempty" require:"true"`
	// odpsDsName
	OdpsDsName *string `json:"odps_ds_name,omitempty" xml:"odps_ds_name,omitempty" require:"true"`
	// odpsProjectName
	OdpsProjectName *string `json:"odps_project_name,omitempty" xml:"odps_project_name,omitempty" require:"true"`
	// odpsTableName
	OdpsTableName *string `json:"odps_table_name,omitempty" xml:"odps_table_name,omitempty" require:"true"`
	// odpsGuidTableName
	OdpsGuidTableName *string `json:"odps_guid_table_name,omitempty" xml:"odps_guid_table_name,omitempty" require:"true"`
	// 分区条件
	PartitionCondition *string `json:"partition_condition,omitempty" xml:"partition_condition,omitempty" require:"true"`
	// 过滤条件
	Where *string `json:"where,omitempty" xml:"where,omitempty" require:"true"`
	// 字段列表
	ColumnList []*string `json:"column_list,omitempty" xml:"column_list,omitempty" require:"true" type:"Repeated"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 任务描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true"`
	// 操作人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// 项目空间id
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// project_task_path
	ProjectTaskPath *string `json:"project_task_path,omitempty" xml:"project_task_path,omitempty" require:"true"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 参数
	Params *string `json:"params,omitempty" xml:"params,omitempty" require:"true"`
}

func (s SyncOpdsOssRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncOpdsOssRequest) GoString() string {
	return s.String()
}

func (s *SyncOpdsOssRequest) SetAuthToken(v string) *SyncOpdsOssRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncOpdsOssRequest) SetOssPath(v string) *SyncOpdsOssRequest {
	s.OssPath = &v
	return s
}

func (s *SyncOpdsOssRequest) SetOssFilename(v string) *SyncOpdsOssRequest {
	s.OssFilename = &v
	return s
}

func (s *SyncOpdsOssRequest) SetOssDsId(v string) *SyncOpdsOssRequest {
	s.OssDsId = &v
	return s
}

func (s *SyncOpdsOssRequest) SetOssDsName(v string) *SyncOpdsOssRequest {
	s.OssDsName = &v
	return s
}

func (s *SyncOpdsOssRequest) SetOdpsDsId(v string) *SyncOpdsOssRequest {
	s.OdpsDsId = &v
	return s
}

func (s *SyncOpdsOssRequest) SetOdpsDsName(v string) *SyncOpdsOssRequest {
	s.OdpsDsName = &v
	return s
}

func (s *SyncOpdsOssRequest) SetOdpsProjectName(v string) *SyncOpdsOssRequest {
	s.OdpsProjectName = &v
	return s
}

func (s *SyncOpdsOssRequest) SetOdpsTableName(v string) *SyncOpdsOssRequest {
	s.OdpsTableName = &v
	return s
}

func (s *SyncOpdsOssRequest) SetOdpsGuidTableName(v string) *SyncOpdsOssRequest {
	s.OdpsGuidTableName = &v
	return s
}

func (s *SyncOpdsOssRequest) SetPartitionCondition(v string) *SyncOpdsOssRequest {
	s.PartitionCondition = &v
	return s
}

func (s *SyncOpdsOssRequest) SetWhere(v string) *SyncOpdsOssRequest {
	s.Where = &v
	return s
}

func (s *SyncOpdsOssRequest) SetColumnList(v []*string) *SyncOpdsOssRequest {
	s.ColumnList = v
	return s
}

func (s *SyncOpdsOssRequest) SetName(v string) *SyncOpdsOssRequest {
	s.Name = &v
	return s
}

func (s *SyncOpdsOssRequest) SetDesc(v string) *SyncOpdsOssRequest {
	s.Desc = &v
	return s
}

func (s *SyncOpdsOssRequest) SetOperator(v string) *SyncOpdsOssRequest {
	s.Operator = &v
	return s
}

func (s *SyncOpdsOssRequest) SetProjectId(v string) *SyncOpdsOssRequest {
	s.ProjectId = &v
	return s
}

func (s *SyncOpdsOssRequest) SetProjectTaskPath(v string) *SyncOpdsOssRequest {
	s.ProjectTaskPath = &v
	return s
}

func (s *SyncOpdsOssRequest) SetTenantId(v string) *SyncOpdsOssRequest {
	s.TenantId = &v
	return s
}

func (s *SyncOpdsOssRequest) SetParams(v string) *SyncOpdsOssRequest {
	s.Params = &v
	return s
}

type SyncOpdsOssResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// requestId
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// message
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// traceId
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
}

func (s SyncOpdsOssResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncOpdsOssResponse) GoString() string {
	return s.String()
}

func (s *SyncOpdsOssResponse) SetReqMsgId(v string) *SyncOpdsOssResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncOpdsOssResponse) SetResultCode(v string) *SyncOpdsOssResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncOpdsOssResponse) SetResultMsg(v string) *SyncOpdsOssResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncOpdsOssResponse) SetData(v string) *SyncOpdsOssResponse {
	s.Data = &v
	return s
}

func (s *SyncOpdsOssResponse) SetRequestId(v string) *SyncOpdsOssResponse {
	s.RequestId = &v
	return s
}

func (s *SyncOpdsOssResponse) SetCode(v string) *SyncOpdsOssResponse {
	s.Code = &v
	return s
}

func (s *SyncOpdsOssResponse) SetMessage(v string) *SyncOpdsOssResponse {
	s.Message = &v
	return s
}

func (s *SyncOpdsOssResponse) SetTraceId(v string) *SyncOpdsOssResponse {
	s.TraceId = &v
	return s
}

type ExistDataphinTablepartitionRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// operator操作人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// project项目空间
	Project *string `json:"project,omitempty" xml:"project,omitempty" require:"true"`
	// tableName
	TableName *string `json:"table_name,omitempty" xml:"table_name,omitempty" require:"true"`
	// 分区
	Partition *string `json:"partition,omitempty" xml:"partition,omitempty" require:"true"`
}

func (s ExistDataphinTablepartitionRequest) String() string {
	return tea.Prettify(s)
}

func (s ExistDataphinTablepartitionRequest) GoString() string {
	return s.String()
}

func (s *ExistDataphinTablepartitionRequest) SetAuthToken(v string) *ExistDataphinTablepartitionRequest {
	s.AuthToken = &v
	return s
}

func (s *ExistDataphinTablepartitionRequest) SetOperator(v string) *ExistDataphinTablepartitionRequest {
	s.Operator = &v
	return s
}

func (s *ExistDataphinTablepartitionRequest) SetProject(v string) *ExistDataphinTablepartitionRequest {
	s.Project = &v
	return s
}

func (s *ExistDataphinTablepartitionRequest) SetTableName(v string) *ExistDataphinTablepartitionRequest {
	s.TableName = &v
	return s
}

func (s *ExistDataphinTablepartitionRequest) SetPartition(v string) *ExistDataphinTablepartitionRequest {
	s.Partition = &v
	return s
}

type ExistDataphinTablepartitionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分区返回数据
	Data *PartitionObject `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ExistDataphinTablepartitionResponse) String() string {
	return tea.Prettify(s)
}

func (s ExistDataphinTablepartitionResponse) GoString() string {
	return s.String()
}

func (s *ExistDataphinTablepartitionResponse) SetReqMsgId(v string) *ExistDataphinTablepartitionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExistDataphinTablepartitionResponse) SetResultCode(v string) *ExistDataphinTablepartitionResponse {
	s.ResultCode = &v
	return s
}

func (s *ExistDataphinTablepartitionResponse) SetResultMsg(v string) *ExistDataphinTablepartitionResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExistDataphinTablepartitionResponse) SetData(v *PartitionObject) *ExistDataphinTablepartitionResponse {
	s.Data = v
	return s
}

type PublishDataphinTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// desc
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true"`
	// operator
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// tenantId
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// projectId
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// taskId
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s PublishDataphinTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s PublishDataphinTaskRequest) GoString() string {
	return s.String()
}

func (s *PublishDataphinTaskRequest) SetAuthToken(v string) *PublishDataphinTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *PublishDataphinTaskRequest) SetDesc(v string) *PublishDataphinTaskRequest {
	s.Desc = &v
	return s
}

func (s *PublishDataphinTaskRequest) SetOperator(v string) *PublishDataphinTaskRequest {
	s.Operator = &v
	return s
}

func (s *PublishDataphinTaskRequest) SetTenantId(v string) *PublishDataphinTaskRequest {
	s.TenantId = &v
	return s
}

func (s *PublishDataphinTaskRequest) SetProjectId(v string) *PublishDataphinTaskRequest {
	s.ProjectId = &v
	return s
}

func (s *PublishDataphinTaskRequest) SetTaskId(v string) *PublishDataphinTaskRequest {
	s.TaskId = &v
	return s
}

type PublishDataphinTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *int64 `json:"data,omitempty" xml:"data,omitempty"`
	// requestId
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// message
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// traceId
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
}

func (s PublishDataphinTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s PublishDataphinTaskResponse) GoString() string {
	return s.String()
}

func (s *PublishDataphinTaskResponse) SetReqMsgId(v string) *PublishDataphinTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PublishDataphinTaskResponse) SetResultCode(v string) *PublishDataphinTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *PublishDataphinTaskResponse) SetResultMsg(v string) *PublishDataphinTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *PublishDataphinTaskResponse) SetData(v int64) *PublishDataphinTaskResponse {
	s.Data = &v
	return s
}

func (s *PublishDataphinTaskResponse) SetRequestId(v string) *PublishDataphinTaskResponse {
	s.RequestId = &v
	return s
}

func (s *PublishDataphinTaskResponse) SetCode(v string) *PublishDataphinTaskResponse {
	s.Code = &v
	return s
}

func (s *PublishDataphinTaskResponse) SetMessage(v string) *PublishDataphinTaskResponse {
	s.Message = &v
	return s
}

func (s *PublishDataphinTaskResponse) SetTraceId(v string) *PublishDataphinTaskResponse {
	s.TraceId = &v
	return s
}

type CheckDataphinTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// publishId
	PublishId *string `json:"publish_id,omitempty" xml:"publish_id,omitempty" require:"true"`
	// tenantId
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// operator
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
}

func (s CheckDataphinTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckDataphinTaskRequest) GoString() string {
	return s.String()
}

func (s *CheckDataphinTaskRequest) SetAuthToken(v string) *CheckDataphinTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckDataphinTaskRequest) SetPublishId(v string) *CheckDataphinTaskRequest {
	s.PublishId = &v
	return s
}

func (s *CheckDataphinTaskRequest) SetTenantId(v string) *CheckDataphinTaskRequest {
	s.TenantId = &v
	return s
}

func (s *CheckDataphinTaskRequest) SetOperator(v string) *CheckDataphinTaskRequest {
	s.Operator = &v
	return s
}

type CheckDataphinTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// publicstatus
	Data *PublishStatus `json:"data,omitempty" xml:"data,omitempty"`
	// requestId
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// message
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// traceId
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
}

func (s CheckDataphinTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckDataphinTaskResponse) GoString() string {
	return s.String()
}

func (s *CheckDataphinTaskResponse) SetReqMsgId(v string) *CheckDataphinTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckDataphinTaskResponse) SetResultCode(v string) *CheckDataphinTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckDataphinTaskResponse) SetResultMsg(v string) *CheckDataphinTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckDataphinTaskResponse) SetData(v *PublishStatus) *CheckDataphinTaskResponse {
	s.Data = v
	return s
}

func (s *CheckDataphinTaskResponse) SetRequestId(v string) *CheckDataphinTaskResponse {
	s.RequestId = &v
	return s
}

func (s *CheckDataphinTaskResponse) SetCode(v string) *CheckDataphinTaskResponse {
	s.Code = &v
	return s
}

func (s *CheckDataphinTaskResponse) SetMessage(v string) *CheckDataphinTaskResponse {
	s.Message = &v
	return s
}

func (s *CheckDataphinTaskResponse) SetTraceId(v string) *CheckDataphinTaskResponse {
	s.TraceId = &v
	return s
}

type RunDataphinTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// tenantId
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// operator
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// projectId
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// params,json map
	Params *string `json:"params,omitempty" xml:"params,omitempty" require:"true"`
	// taskId
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s RunDataphinTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s RunDataphinTaskRequest) GoString() string {
	return s.String()
}

func (s *RunDataphinTaskRequest) SetAuthToken(v string) *RunDataphinTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *RunDataphinTaskRequest) SetName(v string) *RunDataphinTaskRequest {
	s.Name = &v
	return s
}

func (s *RunDataphinTaskRequest) SetTenantId(v string) *RunDataphinTaskRequest {
	s.TenantId = &v
	return s
}

func (s *RunDataphinTaskRequest) SetOperator(v string) *RunDataphinTaskRequest {
	s.Operator = &v
	return s
}

func (s *RunDataphinTaskRequest) SetProjectId(v string) *RunDataphinTaskRequest {
	s.ProjectId = &v
	return s
}

func (s *RunDataphinTaskRequest) SetParams(v string) *RunDataphinTaskRequest {
	s.Params = &v
	return s
}

func (s *RunDataphinTaskRequest) SetTaskId(v string) *RunDataphinTaskRequest {
	s.TaskId = &v
	return s
}

type RunDataphinTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s RunDataphinTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s RunDataphinTaskResponse) GoString() string {
	return s.String()
}

func (s *RunDataphinTaskResponse) SetReqMsgId(v string) *RunDataphinTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RunDataphinTaskResponse) SetResultCode(v string) *RunDataphinTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *RunDataphinTaskResponse) SetResultMsg(v string) *RunDataphinTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *RunDataphinTaskResponse) SetData(v string) *RunDataphinTaskResponse {
	s.Data = &v
	return s
}

type QueryDataphinTableinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// projectSpaceName
	ProjectSpaceName *string `json:"project_space_name,omitempty" xml:"project_space_name,omitempty" require:"true"`
	// tableName
	TableName *string `json:"table_name,omitempty" xml:"table_name,omitempty" require:"true"`
	// operator
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
}

func (s QueryDataphinTableinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDataphinTableinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryDataphinTableinfoRequest) SetAuthToken(v string) *QueryDataphinTableinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDataphinTableinfoRequest) SetProjectSpaceName(v string) *QueryDataphinTableinfoRequest {
	s.ProjectSpaceName = &v
	return s
}

func (s *QueryDataphinTableinfoRequest) SetTableName(v string) *QueryDataphinTableinfoRequest {
	s.TableName = &v
	return s
}

func (s *QueryDataphinTableinfoRequest) SetOperator(v string) *QueryDataphinTableinfoRequest {
	s.Operator = &v
	return s
}

type QueryDataphinTableinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// requestId
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// message
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// traceId
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// data
	Data *BaseResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryDataphinTableinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDataphinTableinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryDataphinTableinfoResponse) SetReqMsgId(v string) *QueryDataphinTableinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDataphinTableinfoResponse) SetResultCode(v string) *QueryDataphinTableinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDataphinTableinfoResponse) SetResultMsg(v string) *QueryDataphinTableinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDataphinTableinfoResponse) SetRequestId(v string) *QueryDataphinTableinfoResponse {
	s.RequestId = &v
	return s
}

func (s *QueryDataphinTableinfoResponse) SetCode(v string) *QueryDataphinTableinfoResponse {
	s.Code = &v
	return s
}

func (s *QueryDataphinTableinfoResponse) SetMessage(v string) *QueryDataphinTableinfoResponse {
	s.Message = &v
	return s
}

func (s *QueryDataphinTableinfoResponse) SetTraceId(v string) *QueryDataphinTableinfoResponse {
	s.TraceId = &v
	return s
}

func (s *QueryDataphinTableinfoResponse) SetData(v *BaseResult) *QueryDataphinTableinfoResponse {
	s.Data = v
	return s
}

type ImportDataphinFileRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// orderId
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// operator
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// userId
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// fileKey
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty" require:"true"`
	// headerList
	HeaderList []*string `json:"header_list,omitempty" xml:"header_list,omitempty" require:"true" type:"Repeated"`
	// targetList
	TargetList []*string `json:"target_list,omitempty" xml:"target_list,omitempty" require:"true" type:"Repeated"`
	// tableProject
	TableProject *string `json:"table_project,omitempty" xml:"table_project,omitempty" require:"true"`
	// tableName
	TableName *string `json:"table_name,omitempty" xml:"table_name,omitempty" require:"true"`
	// partition
	Partition *string `json:"partition,omitempty" xml:"partition,omitempty" require:"true"`
	// OcDataphinProjectEnum枚举
	Project *string `json:"project,omitempty" xml:"project,omitempty" require:"true"`
}

func (s ImportDataphinFileRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportDataphinFileRequest) GoString() string {
	return s.String()
}

func (s *ImportDataphinFileRequest) SetAuthToken(v string) *ImportDataphinFileRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportDataphinFileRequest) SetOrderId(v string) *ImportDataphinFileRequest {
	s.OrderId = &v
	return s
}

func (s *ImportDataphinFileRequest) SetOperator(v string) *ImportDataphinFileRequest {
	s.Operator = &v
	return s
}

func (s *ImportDataphinFileRequest) SetUserId(v string) *ImportDataphinFileRequest {
	s.UserId = &v
	return s
}

func (s *ImportDataphinFileRequest) SetFileKey(v string) *ImportDataphinFileRequest {
	s.FileKey = &v
	return s
}

func (s *ImportDataphinFileRequest) SetHeaderList(v []*string) *ImportDataphinFileRequest {
	s.HeaderList = v
	return s
}

func (s *ImportDataphinFileRequest) SetTargetList(v []*string) *ImportDataphinFileRequest {
	s.TargetList = v
	return s
}

func (s *ImportDataphinFileRequest) SetTableProject(v string) *ImportDataphinFileRequest {
	s.TableProject = &v
	return s
}

func (s *ImportDataphinFileRequest) SetTableName(v string) *ImportDataphinFileRequest {
	s.TableName = &v
	return s
}

func (s *ImportDataphinFileRequest) SetPartition(v string) *ImportDataphinFileRequest {
	s.Partition = &v
	return s
}

func (s *ImportDataphinFileRequest) SetProject(v string) *ImportDataphinFileRequest {
	s.Project = &v
	return s
}

type ImportDataphinFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// errorCode
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// errorMsg
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
	// resultObj
	ResultObj *ProduceFeatureResultObj `json:"result_obj,omitempty" xml:"result_obj,omitempty"`
}

func (s ImportDataphinFileResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportDataphinFileResponse) GoString() string {
	return s.String()
}

func (s *ImportDataphinFileResponse) SetReqMsgId(v string) *ImportDataphinFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportDataphinFileResponse) SetResultCode(v string) *ImportDataphinFileResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportDataphinFileResponse) SetResultMsg(v string) *ImportDataphinFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportDataphinFileResponse) SetSuccess(v bool) *ImportDataphinFileResponse {
	s.Success = &v
	return s
}

func (s *ImportDataphinFileResponse) SetErrorCode(v string) *ImportDataphinFileResponse {
	s.ErrorCode = &v
	return s
}

func (s *ImportDataphinFileResponse) SetErrorMsg(v string) *ImportDataphinFileResponse {
	s.ErrorMsg = &v
	return s
}

func (s *ImportDataphinFileResponse) SetResultObj(v *ProduceFeatureResultObj) *ImportDataphinFileResponse {
	s.ResultObj = v
	return s
}

type SubmitDatapinTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 任务描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true"`
	// operator
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// projectId
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// projectTaskPath
	ProjectTaskPath *string `json:"project_task_path,omitempty" xml:"project_task_path,omitempty" require:"true"`
	// tenantId
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// params
	Params *string `json:"params,omitempty" xml:"params,omitempty" require:"true"`
	// ossDsId
	OssDsId *string `json:"oss_ds_id,omitempty" xml:"oss_ds_id,omitempty"`
	// ossDsName
	OssDsName *string `json:"oss_ds_name,omitempty" xml:"oss_ds_name,omitempty" require:"true"`
	// odpsDsId
	OdpsDsId *string `json:"odps_ds_id,omitempty" xml:"odps_ds_id,omitempty" require:"true"`
	// odpsDsName
	OdpsDsName *string `json:"odps_ds_name,omitempty" xml:"odps_ds_name,omitempty"`
	// odpsProjectName
	OdpsProjectName *string `json:"odps_project_name,omitempty" xml:"odps_project_name,omitempty" require:"true"`
	// odpsTableName
	OdpsTableName *string `json:"odps_table_name,omitempty" xml:"odps_table_name,omitempty"`
	// odpsGuidTableName
	OdpsGuidTableName *string `json:"odps_guid_table_name,omitempty" xml:"odps_guid_table_name,omitempty" require:"true"`
	// partitionCondition
	PartitionCondition *string `json:"partition_condition,omitempty" xml:"partition_condition,omitempty"`
	// where
	Where *string `json:"where,omitempty" xml:"where,omitempty"`
	// columnList
	ColumnList []*string `json:"column_list,omitempty" xml:"column_list,omitempty" type:"Repeated"`
	// ossPath
	OssPath *string `json:"oss_path,omitempty" xml:"oss_path,omitempty" require:"true"`
	// ossFilename
	OssFilename *string `json:"oss_filename,omitempty" xml:"oss_filename,omitempty" require:"true"`
}

func (s SubmitDatapinTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitDatapinTaskRequest) GoString() string {
	return s.String()
}

func (s *SubmitDatapinTaskRequest) SetAuthToken(v string) *SubmitDatapinTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitDatapinTaskRequest) SetName(v string) *SubmitDatapinTaskRequest {
	s.Name = &v
	return s
}

func (s *SubmitDatapinTaskRequest) SetDesc(v string) *SubmitDatapinTaskRequest {
	s.Desc = &v
	return s
}

func (s *SubmitDatapinTaskRequest) SetOperator(v string) *SubmitDatapinTaskRequest {
	s.Operator = &v
	return s
}

func (s *SubmitDatapinTaskRequest) SetProjectId(v string) *SubmitDatapinTaskRequest {
	s.ProjectId = &v
	return s
}

func (s *SubmitDatapinTaskRequest) SetProjectTaskPath(v string) *SubmitDatapinTaskRequest {
	s.ProjectTaskPath = &v
	return s
}

func (s *SubmitDatapinTaskRequest) SetTenantId(v string) *SubmitDatapinTaskRequest {
	s.TenantId = &v
	return s
}

func (s *SubmitDatapinTaskRequest) SetParams(v string) *SubmitDatapinTaskRequest {
	s.Params = &v
	return s
}

func (s *SubmitDatapinTaskRequest) SetOssDsId(v string) *SubmitDatapinTaskRequest {
	s.OssDsId = &v
	return s
}

func (s *SubmitDatapinTaskRequest) SetOssDsName(v string) *SubmitDatapinTaskRequest {
	s.OssDsName = &v
	return s
}

func (s *SubmitDatapinTaskRequest) SetOdpsDsId(v string) *SubmitDatapinTaskRequest {
	s.OdpsDsId = &v
	return s
}

func (s *SubmitDatapinTaskRequest) SetOdpsDsName(v string) *SubmitDatapinTaskRequest {
	s.OdpsDsName = &v
	return s
}

func (s *SubmitDatapinTaskRequest) SetOdpsProjectName(v string) *SubmitDatapinTaskRequest {
	s.OdpsProjectName = &v
	return s
}

func (s *SubmitDatapinTaskRequest) SetOdpsTableName(v string) *SubmitDatapinTaskRequest {
	s.OdpsTableName = &v
	return s
}

func (s *SubmitDatapinTaskRequest) SetOdpsGuidTableName(v string) *SubmitDatapinTaskRequest {
	s.OdpsGuidTableName = &v
	return s
}

func (s *SubmitDatapinTaskRequest) SetPartitionCondition(v string) *SubmitDatapinTaskRequest {
	s.PartitionCondition = &v
	return s
}

func (s *SubmitDatapinTaskRequest) SetWhere(v string) *SubmitDatapinTaskRequest {
	s.Where = &v
	return s
}

func (s *SubmitDatapinTaskRequest) SetColumnList(v []*string) *SubmitDatapinTaskRequest {
	s.ColumnList = v
	return s
}

func (s *SubmitDatapinTaskRequest) SetOssPath(v string) *SubmitDatapinTaskRequest {
	s.OssPath = &v
	return s
}

func (s *SubmitDatapinTaskRequest) SetOssFilename(v string) *SubmitDatapinTaskRequest {
	s.OssFilename = &v
	return s
}

type SubmitDatapinTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// requestId
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// message
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// traceId
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s SubmitDatapinTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitDatapinTaskResponse) GoString() string {
	return s.String()
}

func (s *SubmitDatapinTaskResponse) SetReqMsgId(v string) *SubmitDatapinTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitDatapinTaskResponse) SetResultCode(v string) *SubmitDatapinTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitDatapinTaskResponse) SetResultMsg(v string) *SubmitDatapinTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitDatapinTaskResponse) SetRequestId(v string) *SubmitDatapinTaskResponse {
	s.RequestId = &v
	return s
}

func (s *SubmitDatapinTaskResponse) SetCode(v string) *SubmitDatapinTaskResponse {
	s.Code = &v
	return s
}

func (s *SubmitDatapinTaskResponse) SetMessage(v string) *SubmitDatapinTaskResponse {
	s.Message = &v
	return s
}

func (s *SubmitDatapinTaskResponse) SetTraceId(v string) *SubmitDatapinTaskResponse {
	s.TraceId = &v
	return s
}

func (s *SubmitDatapinTaskResponse) SetData(v string) *SubmitDatapinTaskResponse {
	s.Data = &v
	return s
}

type QueryIndustryScoreRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 模型id
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
	// 用户id（客户身份证号/手机号的md5/sha256散列值）
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
	UserIdType *string `json:"user_id_type,omitempty" xml:"user_id_type,omitempty" require:"true"`
	// user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
	EncryptType *string `json:"encrypt_type,omitempty" xml:"encrypt_type,omitempty" require:"true"`
	// 客户编码
	CustomerCode *string `json:"customer_code,omitempty" xml:"customer_code,omitempty" require:"true"`
	// 流水号，串联链路用，非必填
	TransNo *string `json:"trans_no,omitempty" xml:"trans_no,omitempty" require:"true"`
	// encrypt_type类型的散列后的操作，默认为空不加密。 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
	UserIdHashEncrypt *string `json:"user_id_hash_encrypt,omitempty" xml:"user_id_hash_encrypt,omitempty" require:"true"`
}

func (s QueryIndustryScoreRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIndustryScoreRequest) GoString() string {
	return s.String()
}

func (s *QueryIndustryScoreRequest) SetAuthToken(v string) *QueryIndustryScoreRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIndustryScoreRequest) SetModelId(v string) *QueryIndustryScoreRequest {
	s.ModelId = &v
	return s
}

func (s *QueryIndustryScoreRequest) SetUserId(v string) *QueryIndustryScoreRequest {
	s.UserId = &v
	return s
}

func (s *QueryIndustryScoreRequest) SetUserIdType(v string) *QueryIndustryScoreRequest {
	s.UserIdType = &v
	return s
}

func (s *QueryIndustryScoreRequest) SetEncryptType(v string) *QueryIndustryScoreRequest {
	s.EncryptType = &v
	return s
}

func (s *QueryIndustryScoreRequest) SetCustomerCode(v string) *QueryIndustryScoreRequest {
	s.CustomerCode = &v
	return s
}

func (s *QueryIndustryScoreRequest) SetTransNo(v string) *QueryIndustryScoreRequest {
	s.TransNo = &v
	return s
}

func (s *QueryIndustryScoreRequest) SetUserIdHashEncrypt(v string) *QueryIndustryScoreRequest {
	s.UserIdHashEncrypt = &v
	return s
}

type QueryIndustryScoreResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模型分数
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
	// 流水号
	TransNo *string `json:"trans_no,omitempty" xml:"trans_no,omitempty"`
}

func (s QueryIndustryScoreResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIndustryScoreResponse) GoString() string {
	return s.String()
}

func (s *QueryIndustryScoreResponse) SetReqMsgId(v string) *QueryIndustryScoreResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIndustryScoreResponse) SetResultCode(v string) *QueryIndustryScoreResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIndustryScoreResponse) SetResultMsg(v string) *QueryIndustryScoreResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIndustryScoreResponse) SetScore(v string) *QueryIndustryScoreResponse {
	s.Score = &v
	return s
}

func (s *QueryIndustryScoreResponse) SetTransNo(v string) *QueryIndustryScoreResponse {
	s.TransNo = &v
	return s
}

type QueryIrBrandRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 品牌MD5的 32位小写
	Brandmd5 *string `json:"brandmd5,omitempty" xml:"brandmd5,omitempty" require:"true"`
	// 开始日期，包含填写时间 ，目前与end_date最大间隔不大于7天
	BeginDate *string `json:"begin_date,omitempty" xml:"begin_date,omitempty" require:"true"`
	// 结束日期，包含填写时间， 目前与start_date最大间隔不大于7天
	EndDate *string `json:"end_date,omitempty" xml:"end_date,omitempty" require:"true"`
	// 场景码,brand_overview 品牌汇总；brand_citylevel 品牌城市汇总
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
}

func (s QueryIrBrandRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIrBrandRequest) GoString() string {
	return s.String()
}

func (s *QueryIrBrandRequest) SetAuthToken(v string) *QueryIrBrandRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIrBrandRequest) SetBrandmd5(v string) *QueryIrBrandRequest {
	s.Brandmd5 = &v
	return s
}

func (s *QueryIrBrandRequest) SetBeginDate(v string) *QueryIrBrandRequest {
	s.BeginDate = &v
	return s
}

func (s *QueryIrBrandRequest) SetEndDate(v string) *QueryIrBrandRequest {
	s.EndDate = &v
	return s
}

func (s *QueryIrBrandRequest) SetScene(v string) *QueryIrBrandRequest {
	s.Scene = &v
	return s
}

type QueryIrBrandResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果
	DataList []*ZhxIrResultStruct `json:"data_list,omitempty" xml:"data_list,omitempty" type:"Repeated"`
}

func (s QueryIrBrandResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIrBrandResponse) GoString() string {
	return s.String()
}

func (s *QueryIrBrandResponse) SetReqMsgId(v string) *QueryIrBrandResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIrBrandResponse) SetResultCode(v string) *QueryIrBrandResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIrBrandResponse) SetResultMsg(v string) *QueryIrBrandResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIrBrandResponse) SetDataList(v []*ZhxIrResultStruct) *QueryIrBrandResponse {
	s.DataList = v
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
				"sdk_version":      tea.String("1.1.15"),
				"_prod_code":       tea.String("DUANKA"),
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
 * Description: 查询断卡结果
 * Summary: 查询断卡结果
 */
func (client *Client) QueryDuankaEvaluation(request *QueryDuankaEvaluationRequest) (_result *QueryDuankaEvaluationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDuankaEvaluationResponse{}
	_body, _err := client.QueryDuankaEvaluationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询断卡结果
 * Summary: 查询断卡结果
 */
func (client *Client) QueryDuankaEvaluationEx(request *QueryDuankaEvaluationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDuankaEvaluationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDuankaEvaluationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.duanka.evaluation.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: hr主数据用户信息查询接口
 * Summary: hr主数据用户信息查询接口
 */
func (client *Client) QueryHrUser(request *QueryHrUserRequest) (_result *QueryHrUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryHrUserResponse{}
	_body, _err := client.QueryHrUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: hr主数据用户信息查询接口
 * Summary: hr主数据用户信息查询接口
 */
func (client *Client) QueryHrUserEx(request *QueryHrUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryHrUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryHrUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.hr.user.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天擎数据接口查询
 * Summary: 天擎数据接口查询
 */
func (client *Client) QuerySkyholdRes(request *QuerySkyholdResRequest) (_result *QuerySkyholdResResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySkyholdResResponse{}
	_body, _err := client.QuerySkyholdResEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天擎数据接口查询
 * Summary: 天擎数据接口查询
 */
func (client *Client) QuerySkyholdResEx(request *QuerySkyholdResRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySkyholdResResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySkyholdResResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.skyhold.res.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通用查询
 * Summary: 通用查询
 */
func (client *Client) QueryCommonScore(request *QueryCommonScoreRequest) (_result *QueryCommonScoreResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCommonScoreResponse{}
	_body, _err := client.QueryCommonScoreEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通用查询
 * Summary: 通用查询
 */
func (client *Client) QueryCommonScoreEx(request *QueryCommonScoreRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCommonScoreResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCommonScoreResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.common.score.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 云凤蝶工单提交接口
 * Summary: 云凤蝶工单提交接口
 */
func (client *Client) SubmitYunfengdieAudit(request *SubmitYunfengdieAuditRequest) (_result *SubmitYunfengdieAuditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitYunfengdieAuditResponse{}
	_body, _err := client.SubmitYunfengdieAuditEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 云凤蝶工单提交接口
 * Summary: 云凤蝶工单提交接口
 */
func (client *Client) SubmitYunfengdieAuditEx(request *SubmitYunfengdieAuditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitYunfengdieAuditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitYunfengdieAuditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.yunfengdie.audit.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 文件转存接口
 * Summary: 文件转存接口
 */
func (client *Client) ImportAistudioOss(request *ImportAistudioOssRequest) (_result *ImportAistudioOssResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportAistudioOssResponse{}
	_body, _err := client.ImportAistudioOssEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 文件转存接口
 * Summary: 文件转存接口
 */
func (client *Client) ImportAistudioOssEx(request *ImportAistudioOssRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportAistudioOssResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportAistudioOssResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.aistudio.oss.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 模型验收服务
 * Summary: 模型验收服务
 */
func (client *Client) CheckAistudioModel(request *CheckAistudioModelRequest) (_result *CheckAistudioModelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckAistudioModelResponse{}
	_body, _err := client.CheckAistudioModelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 模型验收服务
 * Summary: 模型验收服务
 */
func (client *Client) CheckAistudioModelEx(request *CheckAistudioModelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckAistudioModelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckAistudioModelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.aistudio.model.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 模型验收服务结果查询
 * Summary: 模型验收服务结果查询
 */
func (client *Client) QueryAistudioModel(request *QueryAistudioModelRequest) (_result *QueryAistudioModelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAistudioModelResponse{}
	_body, _err := client.QueryAistudioModelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 模型验收服务结果查询
 * Summary: 模型验收服务结果查询
 */
func (client *Client) QueryAistudioModelEx(request *QueryAistudioModelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAistudioModelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAistudioModelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.aistudio.model.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通用查询-回溯
 * Summary: 通用查询-回溯
 */
func (client *Client) QueryBacktrackScore(request *QueryBacktrackScoreRequest) (_result *QueryBacktrackScoreResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBacktrackScoreResponse{}
	_body, _err := client.QueryBacktrackScoreEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通用查询-回溯
 * Summary: 通用查询-回溯
 */
func (client *Client) QueryBacktrackScoreEx(request *QueryBacktrackScoreRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBacktrackScoreResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBacktrackScoreResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.backtrack.score.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 大模型sql检验
 * Summary: 大模型sql检验
 */
func (client *Client) CheckEasMdetection(request *CheckEasMdetectionRequest) (_result *CheckEasMdetectionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckEasMdetectionResponse{}
	_body, _err := client.CheckEasMdetectionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 大模型sql检验
 * Summary: 大模型sql检验
 */
func (client *Client) CheckEasMdetectionEx(request *CheckEasMdetectionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckEasMdetectionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckEasMdetectionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.eas.mdetection.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 主站bpservice通用http接口，支持GET、PUT、DELETE、POST类型请求
 * Summary: 主站bpservice通用http接口
 */
func (client *Client) QueryBpserviceHttp(request *QueryBpserviceHttpRequest) (_result *QueryBpserviceHttpResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBpserviceHttpResponse{}
	_body, _err := client.QueryBpserviceHttpEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 主站bpservice通用http接口，支持GET、PUT、DELETE、POST类型请求
 * Summary: 主站bpservice通用http接口
 */
func (client *Client) QueryBpserviceHttpEx(request *QueryBpserviceHttpRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBpserviceHttpResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBpserviceHttpResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.bpservice.http.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 导入dataphin的同步任务
 * Summary: 导入dataphin的同步任务
 */
func (client *Client) ImportDataphinTask(request *ImportDataphinTaskRequest) (_result *ImportDataphinTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportDataphinTaskResponse{}
	_body, _err := client.ImportDataphinTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 导入dataphin的同步任务
 * Summary: 导入dataphin的同步任务
 */
func (client *Client) ImportDataphinTaskEx(request *ImportDataphinTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportDataphinTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportDataphinTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.dataphin.task.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 同步oss文件到odps里面
 * Summary: 同步oss文件到odps里面
 */
func (client *Client) SyncOssOdps(request *SyncOssOdpsRequest) (_result *SyncOssOdpsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncOssOdpsResponse{}
	_body, _err := client.SyncOssOdpsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 同步oss文件到odps里面
 * Summary: 同步oss文件到odps里面
 */
func (client *Client) SyncOssOdpsEx(request *SyncOssOdpsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncOssOdpsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncOssOdpsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.oss.odps.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: odps表数据导出到oss中
 * Summary: odps表数据导出到oss中
 */
func (client *Client) SyncOpdsOss(request *SyncOpdsOssRequest) (_result *SyncOpdsOssResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncOpdsOssResponse{}
	_body, _err := client.SyncOpdsOssEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: odps表数据导出到oss中
 * Summary: odps表数据导出到oss中
 */
func (client *Client) SyncOpdsOssEx(request *SyncOpdsOssRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncOpdsOssResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncOpdsOssResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.opds.oss.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 判断dataphin表分区是否存在
 * Summary: 判断dataphin表分区是否存在
 */
func (client *Client) ExistDataphinTablepartition(request *ExistDataphinTablepartitionRequest) (_result *ExistDataphinTablepartitionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExistDataphinTablepartitionResponse{}
	_body, _err := client.ExistDataphinTablepartitionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 判断dataphin表分区是否存在
 * Summary: 判断dataphin表分区是否存在
 */
func (client *Client) ExistDataphinTablepartitionEx(request *ExistDataphinTablepartitionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExistDataphinTablepartitionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExistDataphinTablepartitionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.dataphin.tablepartition.exist"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发布dataphin任务
 * Summary: 发布dataphin任务
 */
func (client *Client) PublishDataphinTask(request *PublishDataphinTaskRequest) (_result *PublishDataphinTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PublishDataphinTaskResponse{}
	_body, _err := client.PublishDataphinTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发布dataphin任务
 * Summary: 发布dataphin任务
 */
func (client *Client) PublishDataphinTaskEx(request *PublishDataphinTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PublishDataphinTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PublishDataphinTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.dataphin.task.publish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 校验任务发布
 * Summary: 校验任务发布
 */
func (client *Client) CheckDataphinTask(request *CheckDataphinTaskRequest) (_result *CheckDataphinTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckDataphinTaskResponse{}
	_body, _err := client.CheckDataphinTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 校验任务发布
 * Summary: 校验任务发布
 */
func (client *Client) CheckDataphinTaskEx(request *CheckDataphinTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckDataphinTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckDataphinTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.dataphin.task.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 运行任务
 * Summary: 运行任务
 */
func (client *Client) RunDataphinTask(request *RunDataphinTaskRequest) (_result *RunDataphinTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RunDataphinTaskResponse{}
	_body, _err := client.RunDataphinTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 运行任务
 * Summary: 运行任务
 */
func (client *Client) RunDataphinTaskEx(request *RunDataphinTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RunDataphinTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RunDataphinTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.dataphin.task.run"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 表信息查询
 * Summary: 表信息查询
 */
func (client *Client) QueryDataphinTableinfo(request *QueryDataphinTableinfoRequest) (_result *QueryDataphinTableinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDataphinTableinfoResponse{}
	_body, _err := client.QueryDataphinTableinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 表信息查询
 * Summary: 表信息查询
 */
func (client *Client) QueryDataphinTableinfoEx(request *QueryDataphinTableinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDataphinTableinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDataphinTableinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.dataphin.tableinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 文件ossToOdps
 * Summary: 文件ossToOdps
 */
func (client *Client) ImportDataphinFile(request *ImportDataphinFileRequest) (_result *ImportDataphinFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportDataphinFileResponse{}
	_body, _err := client.ImportDataphinFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 文件ossToOdps
 * Summary: 文件ossToOdps
 */
func (client *Client) ImportDataphinFileEx(request *ImportDataphinFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportDataphinFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportDataphinFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.dataphin.file.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交dataphin任务
 * Summary: 提交dataphin任务
 */
func (client *Client) SubmitDatapinTask(request *SubmitDatapinTaskRequest) (_result *SubmitDatapinTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitDatapinTaskResponse{}
	_body, _err := client.SubmitDatapinTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交dataphin任务
 * Summary: 提交dataphin任务
 */
func (client *Client) SubmitDatapinTaskEx(request *SubmitDatapinTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitDatapinTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitDatapinTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.datapin.task.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 行业分查询
 * Summary: 行业分查询
 */
func (client *Client) QueryIndustryScore(request *QueryIndustryScoreRequest) (_result *QueryIndustryScoreResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIndustryScoreResponse{}
	_body, _err := client.QueryIndustryScoreEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 行业分查询
 * Summary: 行业分查询
 */
func (client *Client) QueryIndustryScoreEx(request *QueryIndustryScoreRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIndustryScoreResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIndustryScoreResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.industry.score.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 品牌研究数据查询
 * Summary: 品牌研究数据查询
 */
func (client *Client) QueryIrBrand(request *QueryIrBrandRequest) (_result *QueryIrBrandResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIrBrandResponse{}
	_body, _err := client.QueryIrBrandEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 品牌研究数据查询
 * Summary: 品牌研究数据查询
 */
func (client *Client) QueryIrBrandEx(request *QueryIrBrandRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIrBrandResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIrBrandResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.ir.brand.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
