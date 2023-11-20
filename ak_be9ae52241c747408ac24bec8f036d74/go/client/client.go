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

// 该参与方的输入数据配置
type ParticipantInput struct {
	// 授权至项目内的数据集ID
	AuthDatasetId *string `json:"auth_dataset_id,omitempty" xml:"auth_dataset_id,omitempty" require:"true"`
	// 上述数据集所需参与计算的列
	Fields []*string `json:"fields,omitempty" xml:"fields,omitempty" type:"Repeated"`
	// 用户筛选该数据集的过滤条件
	Filter *string `json:"filter,omitempty" xml:"filter,omitempty"`
}

func (s ParticipantInput) String() string {
	return tea.Prettify(s)
}

func (s ParticipantInput) GoString() string {
	return s.String()
}

func (s *ParticipantInput) SetAuthDatasetId(v string) *ParticipantInput {
	s.AuthDatasetId = &v
	return s
}

func (s *ParticipantInput) SetFields(v []*string) *ParticipantInput {
	s.Fields = v
	return s
}

func (s *ParticipantInput) SetFilter(v string) *ParticipantInput {
	s.Filter = &v
	return s
}

// 参与方输出配置参数
type ParticipantOutput struct {
	// 授权至项目内的数据源ID
	AuthDatasourceId *string `json:"auth_datasource_id,omitempty" xml:"auth_datasource_id,omitempty"`
	// 输出表名
	TableName *string `json:"table_name,omitempty" xml:"table_name,omitempty"`
	// 输出类型，本期仅支持FULL
	WriteType *string `json:"write_type,omitempty" xml:"write_type,omitempty"`
}

func (s ParticipantOutput) String() string {
	return tea.Prettify(s)
}

func (s ParticipantOutput) GoString() string {
	return s.String()
}

func (s *ParticipantOutput) SetAuthDatasourceId(v string) *ParticipantOutput {
	s.AuthDatasourceId = &v
	return s
}

func (s *ParticipantOutput) SetTableName(v string) *ParticipantOutput {
	s.TableName = &v
	return s
}

func (s *ParticipantOutput) SetWriteType(v string) *ParticipantOutput {
	s.WriteType = &v
	return s
}

// 字段的元信息
type StructuredDataField struct {
	// 字段名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 字段描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 字段类型。
	// 示例如下：
	// STRING,
	// INTEGER,
	// DOUBLE,
	// BOOLEAN
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 字段是否可为空
	Nullable *bool `json:"nullable,omitempty" xml:"nullable,omitempty"`
}

func (s StructuredDataField) String() string {
	return tea.Prettify(s)
}

func (s StructuredDataField) GoString() string {
	return s.String()
}

func (s *StructuredDataField) SetName(v string) *StructuredDataField {
	s.Name = &v
	return s
}

func (s *StructuredDataField) SetDescription(v string) *StructuredDataField {
	s.Description = &v
	return s
}

func (s *StructuredDataField) SetType(v string) *StructuredDataField {
	s.Type = &v
	return s
}

func (s *StructuredDataField) SetNullable(v bool) *StructuredDataField {
	s.Nullable = &v
	return s
}

// 项目内参与方节点信息
type Party struct {
	// 参与方节点id，创建项目时无需传入，由saas统一分配
	PartyId *string `json:"party_id,omitempty" xml:"party_id,omitempty"`
	// 所属方id，若为云上节点，则为云上租户ID，若为线下节点，则该参数为空
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 参与方节点类型，创建项目时无需填写，由local_config字段推导出节点参与方类型；
	// 一期支持两类，FATE为线下fate参与方节点，SAAS_FATE为云上fate参与方节点
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 参与方配置json，当type为FATE时，其结构为FatePartyConfigInfo，当type为SAAS_FATE时，其结构为List<FatePartyConfigInfo>
	NodeConfig *string `json:"node_config,omitempty" xml:"node_config,omitempty"`
}

func (s Party) String() string {
	return tea.Prettify(s)
}

func (s Party) GoString() string {
	return s.String()
}

func (s *Party) SetPartyId(v string) *Party {
	s.PartyId = &v
	return s
}

func (s *Party) SetTenantId(v string) *Party {
	s.TenantId = &v
	return s
}

func (s *Party) SetType(v string) *Party {
	s.Type = &v
	return s
}

func (s *Party) SetNodeConfig(v string) *Party {
	s.NodeConfig = &v
	return s
}

// psi参与方任务配置信息
type PsiParticipantConfig struct {
	// 参与方所属节点ID
	PartyId *string `json:"party_id,omitempty" xml:"party_id,omitempty" require:"true"`
	// 该参与方用于求交的匹配列，对于线下fate节点不填写该参数，默认匹配其第一列
	MatchedColumn *string `json:"matched_column,omitempty" xml:"matched_column,omitempty"`
	// 参与方输入数据，参考结构体定义
	Input *ParticipantInput `json:"input,omitempty" xml:"input,omitempty" require:"true"`
	// 参与方输出数据，参考结构体定义
	Output *ParticipantOutput `json:"output,omitempty" xml:"output,omitempty"`
}

func (s PsiParticipantConfig) String() string {
	return tea.Prettify(s)
}

func (s PsiParticipantConfig) GoString() string {
	return s.String()
}

func (s *PsiParticipantConfig) SetPartyId(v string) *PsiParticipantConfig {
	s.PartyId = &v
	return s
}

func (s *PsiParticipantConfig) SetMatchedColumn(v string) *PsiParticipantConfig {
	s.MatchedColumn = &v
	return s
}

func (s *PsiParticipantConfig) SetInput(v *ParticipantInput) *PsiParticipantConfig {
	s.Input = v
	return s
}

func (s *PsiParticipantConfig) SetOutput(v *ParticipantOutput) *PsiParticipantConfig {
	s.Output = v
	return s
}

// 结构化数据源的schema信息
type StructuredDataSchema struct {
	// 结构化数据字段列表
	FieldList []*StructuredDataField `json:"field_list,omitempty" xml:"field_list,omitempty" type:"Repeated"`
}

func (s StructuredDataSchema) String() string {
	return tea.Prettify(s)
}

func (s StructuredDataSchema) GoString() string {
	return s.String()
}

func (s *StructuredDataSchema) SetFieldList(v []*StructuredDataField) *StructuredDataSchema {
	s.FieldList = v
	return s
}

// psi任务信息
type PsiJob struct {
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 执行任务ID
	JobId *string `json:"job_id,omitempty" xml:"job_id,omitempty" require:"true"`
	// 发起任务的租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 任务提交时间（毫秒）
	GmtCreate *int64 `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true"`
	// 任务真正开始执行的unix 时间戳（毫秒）
	GmtExecStart *int64 `json:"gmt_exec_start,omitempty" xml:"gmt_exec_start,omitempty" require:"true"`
	// 任务最终执行完成时间（毫秒）
	GmtExecEnd *int64 `json:"gmt_exec_end,omitempty" xml:"gmt_exec_end,omitempty" require:"true"`
	// 任务名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 任务类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 项目类型
	ProjectType *string `json:"project_type,omitempty" xml:"project_type,omitempty" require:"true"`
	// 项目描述信息
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 任务执行状态，EXECUTING执行中，SUCCESS执行成功，FAILED执行失败
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 任务执行结果信息，若执行失败则返回错误日志
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 参与方配置参数，参考结构体定义
	ParticipantList []*PsiParticipantConfig `json:"participant_list,omitempty" xml:"participant_list,omitempty" require:"true" type:"Repeated"`
}

func (s PsiJob) String() string {
	return tea.Prettify(s)
}

func (s PsiJob) GoString() string {
	return s.String()
}

func (s *PsiJob) SetProjectId(v string) *PsiJob {
	s.ProjectId = &v
	return s
}

func (s *PsiJob) SetJobId(v string) *PsiJob {
	s.JobId = &v
	return s
}

func (s *PsiJob) SetTenantId(v string) *PsiJob {
	s.TenantId = &v
	return s
}

func (s *PsiJob) SetGmtCreate(v int64) *PsiJob {
	s.GmtCreate = &v
	return s
}

func (s *PsiJob) SetGmtExecStart(v int64) *PsiJob {
	s.GmtExecStart = &v
	return s
}

func (s *PsiJob) SetGmtExecEnd(v int64) *PsiJob {
	s.GmtExecEnd = &v
	return s
}

func (s *PsiJob) SetName(v string) *PsiJob {
	s.Name = &v
	return s
}

func (s *PsiJob) SetType(v string) *PsiJob {
	s.Type = &v
	return s
}

func (s *PsiJob) SetProjectType(v string) *PsiJob {
	s.ProjectType = &v
	return s
}

func (s *PsiJob) SetDescription(v string) *PsiJob {
	s.Description = &v
	return s
}

func (s *PsiJob) SetStatus(v string) *PsiJob {
	s.Status = &v
	return s
}

func (s *PsiJob) SetResultMsg(v string) *PsiJob {
	s.ResultMsg = &v
	return s
}

func (s *PsiJob) SetParticipantList(v []*PsiParticipantConfig) *PsiJob {
	s.ParticipantList = v
	return s
}

// 推断出的数据集schema
type RecognizedDatasetSchema struct {
	// 数据集格式类型。
	// 示例如下：
	// TABLE,
	// CSV
	FormatType *string `json:"format_type,omitempty" xml:"format_type,omitempty"`
	// 数据集数据源格式信息，如 csv 分隔符，数据库主键名称等。
	// 对应关系如下：
	// 数据表 -> TableFormatConfig，
	// CSV文件 -> CSVFormatConfig
	FormatConfig *string `json:"format_config,omitempty" xml:"format_config,omitempty"`
	// 数据集 schema 类型。
	SchemaType *string `json:"schema_type,omitempty" xml:"schema_type,omitempty"`
	// 结构化数据 schema
	// schema_type为STRUCTURED_DATA时必填
	StructuredDataSchema *StructuredDataSchema `json:"structured_data_schema,omitempty" xml:"structured_data_schema,omitempty"`
}

func (s RecognizedDatasetSchema) String() string {
	return tea.Prettify(s)
}

func (s RecognizedDatasetSchema) GoString() string {
	return s.String()
}

func (s *RecognizedDatasetSchema) SetFormatType(v string) *RecognizedDatasetSchema {
	s.FormatType = &v
	return s
}

func (s *RecognizedDatasetSchema) SetFormatConfig(v string) *RecognizedDatasetSchema {
	s.FormatConfig = &v
	return s
}

func (s *RecognizedDatasetSchema) SetSchemaType(v string) *RecognizedDatasetSchema {
	s.SchemaType = &v
	return s
}

func (s *RecognizedDatasetSchema) SetStructuredDataSchema(v *StructuredDataSchema) *RecognizedDatasetSchema {
	s.StructuredDataSchema = v
	return s
}

// 用于描述数据源的元信息
type LocalDatasource struct {
	// 数据源id
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 数据源名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 数据源描述信息
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 当前数据源是否支持写入
	Writable *bool `json:"writable,omitempty" xml:"writable,omitempty"`
	// 用于描述数据源类型的枚举。
	// 示例如下：
	// MYSQL,
	// DB2,
	// SQLSERVER,
	// ORACLE,
	// HIVE2,
	// ODPS
	//
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 用于描述数据源的连接信息，为描述连接信息的数据对象转化为的json字符串，与type指定的数据源类型必须一一对应。
	// 该参数请参考如下对应结构体，定义好后需转成jsonString，对应关系展示如下：
	// MYSQL -> MysqlConnConfig,
	// ORACLE -> OracleConnConfig,
	// SQLSERVER -> SqlServerConnConfig,
	// DB2 -> DbTwoConnConfig,
	// HIVE2 -> HiveTwoConnConfig,
	// ODPS -> OdpsConnConfig
	ConnConfig *string `json:"conn_config,omitempty" xml:"conn_config,omitempty"`
}

func (s LocalDatasource) String() string {
	return tea.Prettify(s)
}

func (s LocalDatasource) GoString() string {
	return s.String()
}

func (s *LocalDatasource) SetId(v string) *LocalDatasource {
	s.Id = &v
	return s
}

func (s *LocalDatasource) SetName(v string) *LocalDatasource {
	s.Name = &v
	return s
}

func (s *LocalDatasource) SetDescription(v string) *LocalDatasource {
	s.Description = &v
	return s
}

func (s *LocalDatasource) SetWritable(v bool) *LocalDatasource {
	s.Writable = &v
	return s
}

func (s *LocalDatasource) SetType(v string) *LocalDatasource {
	s.Type = &v
	return s
}

func (s *LocalDatasource) SetConnConfig(v string) *LocalDatasource {
	s.ConnConfig = &v
	return s
}

// 用于描述数据集的元信息
type LocalDataset struct {
	// 数据集id
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 数据集名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 数据集描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 数据集所属的数据源 id
	DatasourceId *string `json:"datasource_id,omitempty" xml:"datasource_id,omitempty"`
	// 数据源类型。
	// 示例如下：
	// MYSQL,
	// DB2,
	// SQLSERVER,
	// ORACLE,
	// HIVE2,
	// ODPS
	DatasourceType *string `json:"datasource_type,omitempty" xml:"datasource_type,omitempty"`
	// 数据源连接参数转化成的json字符串，必须与数据源类型一一对应。
	// 该参数请参考如下对应结构体，定义好后需转成jsonString，具体的对应信息如下：
	// MYSQL -> MysqlConnConfig,
	// ORACLE -> OracleConnConfig,
	// SQLSERVER -> SqlServerConnConfig,
	// DB2 -> DbTwoConnConfig,
	// HIVE2 -> HiveTwoConnConfig,
	// ODPS -> OdpsConnConfig
	DatasourceConnConfig *string `json:"datasource_conn_config,omitempty" xml:"datasource_conn_config,omitempty"`
	// 数据集在数据源中的位置信息转化成的json字符串，如数据表名称等，必须和数据源类型一一对应。
	// 该参数请参考如下对应结构体，定义好后需转成jsonString，具体的对应关系如下：
	// MYSQL -> MysqlLocationConfig,
	// ORACLE -> OracleLocationConfig,
	// SQLSERVER -> SqlServerLocationConfig,
	// DB2 -> DbTwoLocationConfig,
	// HIVE2 -> HiveTwoLocationConfig,
	// ODPS -> OdpsLocationConfig
	LocationConfig *string `json:"location_config,omitempty" xml:"location_config,omitempty"`
	// 数据集格式类型。
	// 示例如下：
	// TABLE
	FormatType *string `json:"format_type,omitempty" xml:"format_type,omitempty"`
	// 数据集格式信息，如 csv 分隔符，数据库主键名称等，与数据集类型一一对应。
	// 该参数请参考如下对应结构体，定义好后需转成jsonString，当前支持的类型展示如下：
	// 数据表 -> TableFormatConfig
	FormatConfig *string `json:"format_config,omitempty" xml:"format_config,omitempty"`
	// 数据集 schema 类型。
	// 示例如下：
	// STRUCTURED_DATA
	SchemaType *string `json:"schema_type,omitempty" xml:"schema_type,omitempty"`
	// 结构化数据 schema，schema_type为STRUCTURED_DATA时必填
	StructuredDataSchema *StructuredDataSchema `json:"structured_data_schema,omitempty" xml:"structured_data_schema,omitempty"`
}

func (s LocalDataset) String() string {
	return tea.Prettify(s)
}

func (s LocalDataset) GoString() string {
	return s.String()
}

func (s *LocalDataset) SetId(v string) *LocalDataset {
	s.Id = &v
	return s
}

func (s *LocalDataset) SetName(v string) *LocalDataset {
	s.Name = &v
	return s
}

func (s *LocalDataset) SetDescription(v string) *LocalDataset {
	s.Description = &v
	return s
}

func (s *LocalDataset) SetDatasourceId(v string) *LocalDataset {
	s.DatasourceId = &v
	return s
}

func (s *LocalDataset) SetDatasourceType(v string) *LocalDataset {
	s.DatasourceType = &v
	return s
}

func (s *LocalDataset) SetDatasourceConnConfig(v string) *LocalDataset {
	s.DatasourceConnConfig = &v
	return s
}

func (s *LocalDataset) SetLocationConfig(v string) *LocalDataset {
	s.LocationConfig = &v
	return s
}

func (s *LocalDataset) SetFormatType(v string) *LocalDataset {
	s.FormatType = &v
	return s
}

func (s *LocalDataset) SetFormatConfig(v string) *LocalDataset {
	s.FormatConfig = &v
	return s
}

func (s *LocalDataset) SetSchemaType(v string) *LocalDataset {
	s.SchemaType = &v
	return s
}

func (s *LocalDataset) SetStructuredDataSchema(v *StructuredDataSchema) *LocalDataset {
	s.StructuredDataSchema = v
	return s
}

// 已授权至项目内的数据源配置信息
type AuthDatasource struct {
	// 授权数据源ID
	AuthDatasourceId *string `json:"auth_datasource_id,omitempty" xml:"auth_datasource_id,omitempty" require:"true"`
	// 创建数据源授权时间(毫秒)
	GmtCreate *int64 `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true"`
	// 更新数据源授权时间(毫秒)
	GmtModified *int64 `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true"`
	// 数据源名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 对应本地数据源的配置参数
	Config *string `json:"config,omitempty" xml:"config,omitempty" require:"true"`
	//  数据源来源
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 项目内可见范围类型，ALL_TENANT全部机构可见，SPECIFIC_TENANT部分机构可见。调用授权数据集 和 数据源请求时 若不填该参数，则默认ALL_TENANT
	VisibleType *string `json:"visible_type,omitempty" xml:"visible_type,omitempty" require:"true"`
}

func (s AuthDatasource) String() string {
	return tea.Prettify(s)
}

func (s AuthDatasource) GoString() string {
	return s.String()
}

func (s *AuthDatasource) SetAuthDatasourceId(v string) *AuthDatasource {
	s.AuthDatasourceId = &v
	return s
}

func (s *AuthDatasource) SetGmtCreate(v int64) *AuthDatasource {
	s.GmtCreate = &v
	return s
}

func (s *AuthDatasource) SetGmtModified(v int64) *AuthDatasource {
	s.GmtModified = &v
	return s
}

func (s *AuthDatasource) SetName(v string) *AuthDatasource {
	s.Name = &v
	return s
}

func (s *AuthDatasource) SetConfig(v string) *AuthDatasource {
	s.Config = &v
	return s
}

func (s *AuthDatasource) SetSource(v string) *AuthDatasource {
	s.Source = &v
	return s
}

func (s *AuthDatasource) SetProjectId(v string) *AuthDatasource {
	s.ProjectId = &v
	return s
}

func (s *AuthDatasource) SetVisibleType(v string) *AuthDatasource {
	s.VisibleType = &v
	return s
}

// 项目信息
type Project struct {
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 创建者ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 项目名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 项目状态:CREATING为创建中，FAILED为创建失败，FINISHED为创建完成。仅状态为FINISHED的项目才允许创建任务
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 创建时间（毫秒）
	GmtCreate *int64 `json:"gmt_create,omitempty" xml:"gmt_create,omitempty"`
	// 更新时间（毫秒）
	GmtModified *int64 `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty"`
	// 参与方列表
	PartyList []*Party `json:"party_list,omitempty" xml:"party_list,omitempty" require:"true" type:"Repeated"`
}

func (s Project) String() string {
	return tea.Prettify(s)
}

func (s Project) GoString() string {
	return s.String()
}

func (s *Project) SetProjectId(v string) *Project {
	s.ProjectId = &v
	return s
}

func (s *Project) SetTenantId(v string) *Project {
	s.TenantId = &v
	return s
}

func (s *Project) SetName(v string) *Project {
	s.Name = &v
	return s
}

func (s *Project) SetStatus(v string) *Project {
	s.Status = &v
	return s
}

func (s *Project) SetGmtCreate(v int64) *Project {
	s.GmtCreate = &v
	return s
}

func (s *Project) SetGmtModified(v int64) *Project {
	s.GmtModified = &v
	return s
}

func (s *Project) SetPartyList(v []*Party) *Project {
	s.PartyList = v
	return s
}

// 项目内授权的数据集信息
type AuthDataset struct {
	// 授权数据集ID
	AuthDatasetId *string `json:"auth_dataset_id,omitempty" xml:"auth_dataset_id,omitempty" require:"true"`
	// 创建授权时间(毫秒)
	GmtCreate *int64 `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true"`
	// 更新授权时间(毫秒)
	GmtModified *int64 `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true"`
	// 数据集名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 数据集配置参数
	Config *string `json:"config,omitempty" xml:"config,omitempty" require:"true"`
	// SAAS：该数据集为云上saas节点登记，数据的元信息存储于fdf中
	// FATE：该数据集为线下fate节点登记，数据参数仅有tablename&namespace
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 项目内可见范围类型，ALL_TENANT全部机构可见，SPECIFIC_TENANT部分机构可见。调用授权数据集 和 数据源请求时 若不填该参数，则默认ALL_TENANT
	VisibleType *string `json:"visible_type,omitempty" xml:"visible_type,omitempty" require:"true"`
}

func (s AuthDataset) String() string {
	return tea.Prettify(s)
}

func (s AuthDataset) GoString() string {
	return s.String()
}

func (s *AuthDataset) SetAuthDatasetId(v string) *AuthDataset {
	s.AuthDatasetId = &v
	return s
}

func (s *AuthDataset) SetGmtCreate(v int64) *AuthDataset {
	s.GmtCreate = &v
	return s
}

func (s *AuthDataset) SetGmtModified(v int64) *AuthDataset {
	s.GmtModified = &v
	return s
}

func (s *AuthDataset) SetName(v string) *AuthDataset {
	s.Name = &v
	return s
}

func (s *AuthDataset) SetConfig(v string) *AuthDataset {
	s.Config = &v
	return s
}

func (s *AuthDataset) SetSource(v string) *AuthDataset {
	s.Source = &v
	return s
}

func (s *AuthDataset) SetProjectId(v string) *AuthDataset {
	s.ProjectId = &v
	return s
}

func (s *AuthDataset) SetVisibleType(v string) *AuthDataset {
	s.VisibleType = &v
	return s
}

// 创建项目时所有参与方的连接参数
type PartyReq struct {
	// 参与方类型，例如：{FATE, SAAS_FATE, KUSCIA, SAAS_KUSCIA}
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 参与方租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 远端节点的配置信息，本期仅支持一种类型：FATE，其配置参考FatePartyLocalConfigInfo结构体定义
	RemoteConfig *string `json:"remote_config,omitempty" xml:"remote_config,omitempty" require:"true"`
}

func (s PartyReq) String() string {
	return tea.Prettify(s)
}

func (s PartyReq) GoString() string {
	return s.String()
}

func (s *PartyReq) SetType(v string) *PartyReq {
	s.Type = &v
	return s
}

func (s *PartyReq) SetTenantId(v string) *PartyReq {
	s.TenantId = &v
	return s
}

func (s *PartyReq) SetRemoteConfig(v string) *PartyReq {
	s.RemoteConfig = &v
	return s
}

type CreateAntchainPdcpDatasourceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据源名称，必填，长度不超过50个字符
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 数据源的描述，数据量，作用域等等。
	// 非必填，长度不超过200个字符。
	Description *string `json:"description,omitempty" xml:"description,omitempty" maxLength:"200"`
	// 描述当前数据源是否支持写入。
	// true表示支持写入。
	Writable *bool `json:"writable,omitempty" xml:"writable,omitempty" require:"true"`
	// 描述数据源类型的枚举，必填。
	// 示例如下：
	// MYSQL,
	// DB2,
	// SQLSERVER,
	// ORACLE,
	// HIVE2,
	// ODPS
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 数据源连接信息的对象体转化为的json字符串。
	// 要求连接信息的类型必须与type指定的一致。
	// 该参数请参考如下的对应结构体，定义好后转化成jsonstring，对应信息如下：
	// MYSQL -> MysqlConnConfig,
	// ORACLE -> OracleConnConfig,
	// SQLSERVER -> SqlServerConnConfig,
	// DB2 -> DbTwoConnConfig,
	// HIVE2 -> HiveTwoConnConfig,
	// ODPS -> OdpsConnConfig
	ConnConfig *string `json:"conn_config,omitempty" xml:"conn_config,omitempty" require:"true"`
}

func (s CreateAntchainPdcpDatasourceRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainPdcpDatasourceRequest) GoString() string {
	return s.String()
}

func (s *CreateAntchainPdcpDatasourceRequest) SetAuthToken(v string) *CreateAntchainPdcpDatasourceRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAntchainPdcpDatasourceRequest) SetProductInstanceId(v string) *CreateAntchainPdcpDatasourceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAntchainPdcpDatasourceRequest) SetName(v string) *CreateAntchainPdcpDatasourceRequest {
	s.Name = &v
	return s
}

func (s *CreateAntchainPdcpDatasourceRequest) SetDescription(v string) *CreateAntchainPdcpDatasourceRequest {
	s.Description = &v
	return s
}

func (s *CreateAntchainPdcpDatasourceRequest) SetWritable(v bool) *CreateAntchainPdcpDatasourceRequest {
	s.Writable = &v
	return s
}

func (s *CreateAntchainPdcpDatasourceRequest) SetType(v string) *CreateAntchainPdcpDatasourceRequest {
	s.Type = &v
	return s
}

func (s *CreateAntchainPdcpDatasourceRequest) SetConnConfig(v string) *CreateAntchainPdcpDatasourceRequest {
	s.ConnConfig = &v
	return s
}

type CreateAntchainPdcpDatasourceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 创建的数据源的信息。
	Data *LocalDatasource `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateAntchainPdcpDatasourceResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainPdcpDatasourceResponse) GoString() string {
	return s.String()
}

func (s *CreateAntchainPdcpDatasourceResponse) SetReqMsgId(v string) *CreateAntchainPdcpDatasourceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAntchainPdcpDatasourceResponse) SetResultCode(v string) *CreateAntchainPdcpDatasourceResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAntchainPdcpDatasourceResponse) SetResultMsg(v string) *CreateAntchainPdcpDatasourceResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAntchainPdcpDatasourceResponse) SetData(v *LocalDatasource) *CreateAntchainPdcpDatasourceResponse {
	s.Data = v
	return s
}

type DeleteAntchainPdcpDatasourceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待删除的数据源 id，必填
	DatasourceId *string `json:"datasource_id,omitempty" xml:"datasource_id,omitempty" require:"true"`
}

func (s DeleteAntchainPdcpDatasourceRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteAntchainPdcpDatasourceRequest) GoString() string {
	return s.String()
}

func (s *DeleteAntchainPdcpDatasourceRequest) SetAuthToken(v string) *DeleteAntchainPdcpDatasourceRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteAntchainPdcpDatasourceRequest) SetProductInstanceId(v string) *DeleteAntchainPdcpDatasourceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteAntchainPdcpDatasourceRequest) SetDatasourceId(v string) *DeleteAntchainPdcpDatasourceRequest {
	s.DatasourceId = &v
	return s
}

type DeleteAntchainPdcpDatasourceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteAntchainPdcpDatasourceResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteAntchainPdcpDatasourceResponse) GoString() string {
	return s.String()
}

func (s *DeleteAntchainPdcpDatasourceResponse) SetReqMsgId(v string) *DeleteAntchainPdcpDatasourceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteAntchainPdcpDatasourceResponse) SetResultCode(v string) *DeleteAntchainPdcpDatasourceResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteAntchainPdcpDatasourceResponse) SetResultMsg(v string) *DeleteAntchainPdcpDatasourceResponse {
	s.ResultMsg = &v
	return s
}

type UpdateAntchainPdcpDatasourceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待更新的数据源 id，必填
	DatasourceId *string `json:"datasource_id,omitempty" xml:"datasource_id,omitempty" require:"true"`
	// 更新后的数据源名称，非必填，不填则不更新
	Name *string `json:"name,omitempty" xml:"name,omitempty" maxLength:"50"`
	// 更新后的数据源描述，非必填，不填则不更新
	Description *string `json:"description,omitempty" xml:"description,omitempty" maxLength:"200"`
	// 数据源是否可写，非必填，不填则不更新
	Writable *bool `json:"writable,omitempty" xml:"writable,omitempty"`
	// 数据源连接参数，非必填，不填则不更新，注意必须与此数据源创建时的类型一致。
	// 该参数请参考如下对应结构体，定义好后需转成jsonString，对应关系展示如下：
	// MYSQL -> MysqlConnConfig,
	// ORACLE -> OracleConnConfig,
	// SQLSERVER -> SqlServerConnConfig,
	// DB2 -> DbTwoConnConfig,
	// HIVE2 -> HiveTwoConnConfig,
	// ODPS -> OdpsConnConfig
	ConnConfig *string `json:"conn_config,omitempty" xml:"conn_config,omitempty"`
}

func (s UpdateAntchainPdcpDatasourceRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAntchainPdcpDatasourceRequest) GoString() string {
	return s.String()
}

func (s *UpdateAntchainPdcpDatasourceRequest) SetAuthToken(v string) *UpdateAntchainPdcpDatasourceRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAntchainPdcpDatasourceRequest) SetProductInstanceId(v string) *UpdateAntchainPdcpDatasourceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAntchainPdcpDatasourceRequest) SetDatasourceId(v string) *UpdateAntchainPdcpDatasourceRequest {
	s.DatasourceId = &v
	return s
}

func (s *UpdateAntchainPdcpDatasourceRequest) SetName(v string) *UpdateAntchainPdcpDatasourceRequest {
	s.Name = &v
	return s
}

func (s *UpdateAntchainPdcpDatasourceRequest) SetDescription(v string) *UpdateAntchainPdcpDatasourceRequest {
	s.Description = &v
	return s
}

func (s *UpdateAntchainPdcpDatasourceRequest) SetWritable(v bool) *UpdateAntchainPdcpDatasourceRequest {
	s.Writable = &v
	return s
}

func (s *UpdateAntchainPdcpDatasourceRequest) SetConnConfig(v string) *UpdateAntchainPdcpDatasourceRequest {
	s.ConnConfig = &v
	return s
}

type UpdateAntchainPdcpDatasourceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAntchainPdcpDatasourceResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAntchainPdcpDatasourceResponse) GoString() string {
	return s.String()
}

func (s *UpdateAntchainPdcpDatasourceResponse) SetReqMsgId(v string) *UpdateAntchainPdcpDatasourceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAntchainPdcpDatasourceResponse) SetResultCode(v string) *UpdateAntchainPdcpDatasourceResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAntchainPdcpDatasourceResponse) SetResultMsg(v string) *UpdateAntchainPdcpDatasourceResponse {
	s.ResultMsg = &v
	return s
}

type QueryAntchainPdcpDatasourceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 想要查询的数据源的数据源id，用于指定数据源
	DatasourceId *string `json:"datasource_id,omitempty" xml:"datasource_id,omitempty" require:"true" minLength:"1"`
}

func (s QueryAntchainPdcpDatasourceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainPdcpDatasourceRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainPdcpDatasourceRequest) SetAuthToken(v string) *QueryAntchainPdcpDatasourceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainPdcpDatasourceRequest) SetProductInstanceId(v string) *QueryAntchainPdcpDatasourceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainPdcpDatasourceRequest) SetDatasourceId(v string) *QueryAntchainPdcpDatasourceRequest {
	s.DatasourceId = &v
	return s
}

type QueryAntchainPdcpDatasourceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询到的指定数据源的信息
	Data *LocalDatasource `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryAntchainPdcpDatasourceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainPdcpDatasourceResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainPdcpDatasourceResponse) SetReqMsgId(v string) *QueryAntchainPdcpDatasourceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainPdcpDatasourceResponse) SetResultCode(v string) *QueryAntchainPdcpDatasourceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainPdcpDatasourceResponse) SetResultMsg(v string) *QueryAntchainPdcpDatasourceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainPdcpDatasourceResponse) SetData(v *LocalDatasource) *QueryAntchainPdcpDatasourceResponse {
	s.Data = v
	return s
}

type PagequeryAntchainPdcpDatasourceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据源名称，筛选用，非必填
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 数据源类型，筛选用，非必填。
	// 示例如下：
	// MYSQL,
	// DB2,
	// SQLSERVER,
	// ORACLE,
	// HIVE2,
	// OSS,
	// MINIO
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 数据源是否可写，筛选用，非必填
	Writable *bool `json:"writable,omitempty" xml:"writable,omitempty"`
	// 分页页数，必填
	Page *int64 `json:"page,omitempty" xml:"page,omitempty" require:"true" minimum:"1"`
	// 分页大小，必填
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true" minimum:"1"`
}

func (s PagequeryAntchainPdcpDatasourceRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryAntchainPdcpDatasourceRequest) GoString() string {
	return s.String()
}

func (s *PagequeryAntchainPdcpDatasourceRequest) SetAuthToken(v string) *PagequeryAntchainPdcpDatasourceRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryAntchainPdcpDatasourceRequest) SetProductInstanceId(v string) *PagequeryAntchainPdcpDatasourceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryAntchainPdcpDatasourceRequest) SetName(v string) *PagequeryAntchainPdcpDatasourceRequest {
	s.Name = &v
	return s
}

func (s *PagequeryAntchainPdcpDatasourceRequest) SetType(v string) *PagequeryAntchainPdcpDatasourceRequest {
	s.Type = &v
	return s
}

func (s *PagequeryAntchainPdcpDatasourceRequest) SetWritable(v bool) *PagequeryAntchainPdcpDatasourceRequest {
	s.Writable = &v
	return s
}

func (s *PagequeryAntchainPdcpDatasourceRequest) SetPage(v int64) *PagequeryAntchainPdcpDatasourceRequest {
	s.Page = &v
	return s
}

func (s *PagequeryAntchainPdcpDatasourceRequest) SetPageSize(v int64) *PagequeryAntchainPdcpDatasourceRequest {
	s.PageSize = &v
	return s
}

type PagequeryAntchainPdcpDatasourceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果的总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 分页页数
	Page *string `json:"page,omitempty" xml:"page,omitempty"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 返回的数据源元信息列表
	Data []*LocalDatasource `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s PagequeryAntchainPdcpDatasourceResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryAntchainPdcpDatasourceResponse) GoString() string {
	return s.String()
}

func (s *PagequeryAntchainPdcpDatasourceResponse) SetReqMsgId(v string) *PagequeryAntchainPdcpDatasourceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryAntchainPdcpDatasourceResponse) SetResultCode(v string) *PagequeryAntchainPdcpDatasourceResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryAntchainPdcpDatasourceResponse) SetResultMsg(v string) *PagequeryAntchainPdcpDatasourceResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryAntchainPdcpDatasourceResponse) SetTotal(v int64) *PagequeryAntchainPdcpDatasourceResponse {
	s.Total = &v
	return s
}

func (s *PagequeryAntchainPdcpDatasourceResponse) SetPage(v string) *PagequeryAntchainPdcpDatasourceResponse {
	s.Page = &v
	return s
}

func (s *PagequeryAntchainPdcpDatasourceResponse) SetPageSize(v int64) *PagequeryAntchainPdcpDatasourceResponse {
	s.PageSize = &v
	return s
}

func (s *PagequeryAntchainPdcpDatasourceResponse) SetData(v []*LocalDatasource) *PagequeryAntchainPdcpDatasourceResponse {
	s.Data = v
	return s
}

type CreateAntchainPdcpDatasetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据集名称，必填
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 数据集描述，非必填
	Description *string `json:"description,omitempty" xml:"description,omitempty" maxLength:"200"`
	// 采用数据源配置进行登记时的数据源 id
	// 如果填写了本参数，则可不填写datasourceType和connConfig
	// 如果填写了本参数，将优先采用本参数指定的 datasource 配置
	DatasourceId *string `json:"datasource_id,omitempty" xml:"datasource_id,omitempty"`
	// 数据集数据源类型。
	// 如果填写了datasourceId，则可不传本参数，填写了本参数也将被忽略。
	// 如果未填写datasourceId，则必须同时填写本参数和 connConfig参数。
	// 示例如下：
	// MYSQL,
	// DB2,
	// SQLSERVER,
	// ORACLE,
	// HIVE2,
	// ODPS
	DatasourceType *string `json:"datasource_type,omitempty" xml:"datasource_type,omitempty"`
	// 数据集所属数据源连接信息，与数据源类型一一对应。
	// 如果填写了datasourceId，则可不传本参数，填写本参数也将被忽略。
	// 如果未填写 datasourceId，则必须同时填写本参数和datasourceType参数。
	// 该参数请参考如下对应结构体，定义好后需转成jsonString，具体对应关系如下：
	// MYSQL -> MysqlConnConfig,
	// ORACLE -> OracleConnConfig,
	// SQLSERVER -> SqlServerConnConfig,
	// DB2 -> DbTwoConnConfig,
	// HIVE2 -> HiveTwoConnConfig,
	// ODPS -> OdpsConnConfig
	ConnConfig *string `json:"conn_config,omitempty" xml:"conn_config,omitempty"`
	// 数据集位置信息的对象转化成的json字符串，如数据表名称等。
	// 该参数请参考如下对应结构体，定义好后需转成jsonString，具体的对应信息如下：
	// MYSQL -> MysqlLocationConfig,
	// ORACLE -> OracleLocationConfig,
	// SQLSERVER -> SqlServerLocationConfig,
	// DB2 -> DbTwoLocationConfig,
	// HIVE2 -> HiveTwoLocationConfig,
	// ODPS -> OdpsLocationConfig
	LocationConfig *string `json:"location_config,omitempty" xml:"location_config,omitempty" require:"true"`
	// 数据集格式类型。
	// 示例如下：
	// TABLE
	FormatType *string `json:"format_type,omitempty" xml:"format_type,omitempty" require:"true"`
	// 数据集格式信息转化成的json字符串，如 csv 分隔符，数据库主键名称等，必须与数据源类型一一对应。
	// 具体的对应关系如下：
	// 数据表 -> TableFormatConfig
	FormatConfig *string `json:"format_config,omitempty" xml:"format_config,omitempty" require:"true"`
	// 数据集 schema 类型。
	// 示例如下：
	// STRUCTURED_DATA
	SchemaType *string `json:"schema_type,omitempty" xml:"schema_type,omitempty" require:"true"`
	// 结构化数据 schema
	// schemaType为STRUCTURED_DATA时必填
	StructuredDataSchema *StructuredDataSchema `json:"structured_data_schema,omitempty" xml:"structured_data_schema,omitempty"`
}

func (s CreateAntchainPdcpDatasetRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainPdcpDatasetRequest) GoString() string {
	return s.String()
}

func (s *CreateAntchainPdcpDatasetRequest) SetAuthToken(v string) *CreateAntchainPdcpDatasetRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAntchainPdcpDatasetRequest) SetProductInstanceId(v string) *CreateAntchainPdcpDatasetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAntchainPdcpDatasetRequest) SetName(v string) *CreateAntchainPdcpDatasetRequest {
	s.Name = &v
	return s
}

func (s *CreateAntchainPdcpDatasetRequest) SetDescription(v string) *CreateAntchainPdcpDatasetRequest {
	s.Description = &v
	return s
}

func (s *CreateAntchainPdcpDatasetRequest) SetDatasourceId(v string) *CreateAntchainPdcpDatasetRequest {
	s.DatasourceId = &v
	return s
}

func (s *CreateAntchainPdcpDatasetRequest) SetDatasourceType(v string) *CreateAntchainPdcpDatasetRequest {
	s.DatasourceType = &v
	return s
}

func (s *CreateAntchainPdcpDatasetRequest) SetConnConfig(v string) *CreateAntchainPdcpDatasetRequest {
	s.ConnConfig = &v
	return s
}

func (s *CreateAntchainPdcpDatasetRequest) SetLocationConfig(v string) *CreateAntchainPdcpDatasetRequest {
	s.LocationConfig = &v
	return s
}

func (s *CreateAntchainPdcpDatasetRequest) SetFormatType(v string) *CreateAntchainPdcpDatasetRequest {
	s.FormatType = &v
	return s
}

func (s *CreateAntchainPdcpDatasetRequest) SetFormatConfig(v string) *CreateAntchainPdcpDatasetRequest {
	s.FormatConfig = &v
	return s
}

func (s *CreateAntchainPdcpDatasetRequest) SetSchemaType(v string) *CreateAntchainPdcpDatasetRequest {
	s.SchemaType = &v
	return s
}

func (s *CreateAntchainPdcpDatasetRequest) SetStructuredDataSchema(v *StructuredDataSchema) *CreateAntchainPdcpDatasetRequest {
	s.StructuredDataSchema = v
	return s
}

type CreateAntchainPdcpDatasetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 创建后的数据集信息
	Data *LocalDataset `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateAntchainPdcpDatasetResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainPdcpDatasetResponse) GoString() string {
	return s.String()
}

func (s *CreateAntchainPdcpDatasetResponse) SetReqMsgId(v string) *CreateAntchainPdcpDatasetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAntchainPdcpDatasetResponse) SetResultCode(v string) *CreateAntchainPdcpDatasetResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAntchainPdcpDatasetResponse) SetResultMsg(v string) *CreateAntchainPdcpDatasetResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAntchainPdcpDatasetResponse) SetData(v *LocalDataset) *CreateAntchainPdcpDatasetResponse {
	s.Data = v
	return s
}

type DeleteAntchainPdcpDatasetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待删除的数据集 id，必填
	DatasetId *string `json:"dataset_id,omitempty" xml:"dataset_id,omitempty" require:"true"`
}

func (s DeleteAntchainPdcpDatasetRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteAntchainPdcpDatasetRequest) GoString() string {
	return s.String()
}

func (s *DeleteAntchainPdcpDatasetRequest) SetAuthToken(v string) *DeleteAntchainPdcpDatasetRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteAntchainPdcpDatasetRequest) SetProductInstanceId(v string) *DeleteAntchainPdcpDatasetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteAntchainPdcpDatasetRequest) SetDatasetId(v string) *DeleteAntchainPdcpDatasetRequest {
	s.DatasetId = &v
	return s
}

type DeleteAntchainPdcpDatasetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteAntchainPdcpDatasetResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteAntchainPdcpDatasetResponse) GoString() string {
	return s.String()
}

func (s *DeleteAntchainPdcpDatasetResponse) SetReqMsgId(v string) *DeleteAntchainPdcpDatasetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteAntchainPdcpDatasetResponse) SetResultCode(v string) *DeleteAntchainPdcpDatasetResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteAntchainPdcpDatasetResponse) SetResultMsg(v string) *DeleteAntchainPdcpDatasetResponse {
	s.ResultMsg = &v
	return s
}

type UpdateAntchainPdcpDatasetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 采用数据源配置进行登记时的数据源 id，非必填，不填则不更新
	// 如果填写了本参数，则可不填写datasourceType和connConfig
	// 如果填写了本参数，将优先采用本参数指定的datasource配置
	DatasourceId *string `json:"datasource_id,omitempty" xml:"datasource_id,omitempty"`
	// 待更新的数据集 id，必填
	DatasetId *string `json:"dataset_id,omitempty" xml:"dataset_id,omitempty" require:"true"`
	// 数据集数据源类型，非必填，不填则不更新。
	// 如果填写了datasourceId，则可不传本参数，填写了本参数也将被忽略。
	// 如果未填写datasourceId，则必须同时填写本参数和connConfig参数。
	// 示例如下：
	// MYSQL,
	// DB2,
	// SQLSERVER,
	// ORACLE,
	// HIVE2,
	// ODPS
	DatasourceType *string `json:"datasource_type,omitempty" xml:"datasource_type,omitempty"`
	// 更新后的数据集名称，非必填，不填则不更新
	Name *string `json:"name,omitempty" xml:"name,omitempty" maxLength:"50"`
	// 更新后的数据集描述，非必填，不填则不更新
	Description *string `json:"description,omitempty" xml:"description,omitempty" maxLength:"200"`
	// 数据集数据源连接信息转化的json字符串，非必填，不填则不更新。
	// 如果填写了datasourceId，则可不传本参数，填写本参数也将被忽略。
	// 如果未填写datasourceId，则必须同时填写本参数和datasourceType参数。
	// 该参数请参考如下对应结构体，定义好后需转成jsonString，对应信息如下：
	// MYSQL -> MysqlConnConfig,
	// ORACLE -> OracleConnConfig,
	// SQLSERVER -> SqlServerConnConfig,
	// DB2 -> DbTwoConnConfig,
	// HIVE2 -> HiveTwoConnConfig,
	// ODPS -> OdpsConnConfig
	ConnConfig *string `json:"conn_config,omitempty" xml:"conn_config,omitempty"`
	// 数据集位置信息转化的json字符串，如数据表名称等，非必填，不填则不更新。
	// 如果填写了datasourceId，则本参数必填且根据 datasourceId 对应的数据源类型进行解析。
	// 如果未填写datasourceId且填写了 connConfig，则本参数必填且根据datasourceType进行解析。
	// 该参数请参考如下对应结构体，定义好后需转成jsonString，对应信息如下：
	// MYSQL -> MysqlLocationConfig,
	// ORACLE -> OracleLocationConfig,
	// SQLSERVER -> SqlServerLocationConfig,
	// DB2 -> DbTwoLocationConfig,
	// HIVE2 -> HiveTwoLocationConfig,
	// ODPS -> OdpsLocationConfig
	LocationConfig *string `json:"location_config,omitempty" xml:"location_config,omitempty"`
	// 数据集格式类型，非必填，不填则不更新，如果填写，则format_config也必须填写。
	// 示例：TABLE
	FormatType *string `json:"format_type,omitempty" xml:"format_type,omitempty"`
	// 数据集数据源格式信息，如 csv 分隔符，数据库主键名称等，非必填，不填则不更新
	// 如果填写，则formatType也必须填写
	// 该参数请参考如下对应结构体，定义好后需转成jsonString，对应关系如下：
	// 数据表 -> TableFormatConfig，
	FormatConfig *string `json:"format_config,omitempty" xml:"format_config,omitempty"`
}

func (s UpdateAntchainPdcpDatasetRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAntchainPdcpDatasetRequest) GoString() string {
	return s.String()
}

func (s *UpdateAntchainPdcpDatasetRequest) SetAuthToken(v string) *UpdateAntchainPdcpDatasetRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAntchainPdcpDatasetRequest) SetProductInstanceId(v string) *UpdateAntchainPdcpDatasetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAntchainPdcpDatasetRequest) SetDatasourceId(v string) *UpdateAntchainPdcpDatasetRequest {
	s.DatasourceId = &v
	return s
}

func (s *UpdateAntchainPdcpDatasetRequest) SetDatasetId(v string) *UpdateAntchainPdcpDatasetRequest {
	s.DatasetId = &v
	return s
}

func (s *UpdateAntchainPdcpDatasetRequest) SetDatasourceType(v string) *UpdateAntchainPdcpDatasetRequest {
	s.DatasourceType = &v
	return s
}

func (s *UpdateAntchainPdcpDatasetRequest) SetName(v string) *UpdateAntchainPdcpDatasetRequest {
	s.Name = &v
	return s
}

func (s *UpdateAntchainPdcpDatasetRequest) SetDescription(v string) *UpdateAntchainPdcpDatasetRequest {
	s.Description = &v
	return s
}

func (s *UpdateAntchainPdcpDatasetRequest) SetConnConfig(v string) *UpdateAntchainPdcpDatasetRequest {
	s.ConnConfig = &v
	return s
}

func (s *UpdateAntchainPdcpDatasetRequest) SetLocationConfig(v string) *UpdateAntchainPdcpDatasetRequest {
	s.LocationConfig = &v
	return s
}

func (s *UpdateAntchainPdcpDatasetRequest) SetFormatType(v string) *UpdateAntchainPdcpDatasetRequest {
	s.FormatType = &v
	return s
}

func (s *UpdateAntchainPdcpDatasetRequest) SetFormatConfig(v string) *UpdateAntchainPdcpDatasetRequest {
	s.FormatConfig = &v
	return s
}

type UpdateAntchainPdcpDatasetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAntchainPdcpDatasetResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAntchainPdcpDatasetResponse) GoString() string {
	return s.String()
}

func (s *UpdateAntchainPdcpDatasetResponse) SetReqMsgId(v string) *UpdateAntchainPdcpDatasetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAntchainPdcpDatasetResponse) SetResultCode(v string) *UpdateAntchainPdcpDatasetResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAntchainPdcpDatasetResponse) SetResultMsg(v string) *UpdateAntchainPdcpDatasetResponse {
	s.ResultMsg = &v
	return s
}

type QueryAntchainPdcpDatasetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据集id
	DatasetId *string `json:"dataset_id,omitempty" xml:"dataset_id,omitempty" require:"true" minLength:"1"`
}

func (s QueryAntchainPdcpDatasetRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainPdcpDatasetRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainPdcpDatasetRequest) SetAuthToken(v string) *QueryAntchainPdcpDatasetRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainPdcpDatasetRequest) SetProductInstanceId(v string) *QueryAntchainPdcpDatasetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainPdcpDatasetRequest) SetDatasetId(v string) *QueryAntchainPdcpDatasetRequest {
	s.DatasetId = &v
	return s
}

type QueryAntchainPdcpDatasetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询到的数据集信息
	Data *LocalDataset `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryAntchainPdcpDatasetResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainPdcpDatasetResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainPdcpDatasetResponse) SetReqMsgId(v string) *QueryAntchainPdcpDatasetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainPdcpDatasetResponse) SetResultCode(v string) *QueryAntchainPdcpDatasetResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainPdcpDatasetResponse) SetResultMsg(v string) *QueryAntchainPdcpDatasetResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainPdcpDatasetResponse) SetData(v *LocalDataset) *QueryAntchainPdcpDatasetResponse {
	s.Data = v
	return s
}

type PagequeryAntchainPdcpDatasetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据集名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 所属的数据源id，非必填
	DatasourceId *string `json:"datasource_id,omitempty" xml:"datasource_id,omitempty"`
	// 所属的数据源类型，非必填。
	// 示例如下：
	// MYSQL,
	// DB2,
	// SQLSERVER,
	// ORACLE,
	// HIVE2,
	// ODPS
	DatasourceType *string `json:"datasource_type,omitempty" xml:"datasource_type,omitempty"`
	// 分页页数,不允许为空
	Page *int64 `json:"page,omitempty" xml:"page,omitempty" require:"true" minimum:"1"`
	// 分页大小，不允许为空
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true" minimum:"1"`
}

func (s PagequeryAntchainPdcpDatasetRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryAntchainPdcpDatasetRequest) GoString() string {
	return s.String()
}

func (s *PagequeryAntchainPdcpDatasetRequest) SetAuthToken(v string) *PagequeryAntchainPdcpDatasetRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryAntchainPdcpDatasetRequest) SetProductInstanceId(v string) *PagequeryAntchainPdcpDatasetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryAntchainPdcpDatasetRequest) SetName(v string) *PagequeryAntchainPdcpDatasetRequest {
	s.Name = &v
	return s
}

func (s *PagequeryAntchainPdcpDatasetRequest) SetDatasourceId(v string) *PagequeryAntchainPdcpDatasetRequest {
	s.DatasourceId = &v
	return s
}

func (s *PagequeryAntchainPdcpDatasetRequest) SetDatasourceType(v string) *PagequeryAntchainPdcpDatasetRequest {
	s.DatasourceType = &v
	return s
}

func (s *PagequeryAntchainPdcpDatasetRequest) SetPage(v int64) *PagequeryAntchainPdcpDatasetRequest {
	s.Page = &v
	return s
}

func (s *PagequeryAntchainPdcpDatasetRequest) SetPageSize(v int64) *PagequeryAntchainPdcpDatasetRequest {
	s.PageSize = &v
	return s
}

type PagequeryAntchainPdcpDatasetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果的总数量
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 分页页数
	Page *int64 `json:"page,omitempty" xml:"page,omitempty"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 返回的数据集元信息的列表
	Data []*LocalDataset `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s PagequeryAntchainPdcpDatasetResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryAntchainPdcpDatasetResponse) GoString() string {
	return s.String()
}

func (s *PagequeryAntchainPdcpDatasetResponse) SetReqMsgId(v string) *PagequeryAntchainPdcpDatasetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryAntchainPdcpDatasetResponse) SetResultCode(v string) *PagequeryAntchainPdcpDatasetResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryAntchainPdcpDatasetResponse) SetResultMsg(v string) *PagequeryAntchainPdcpDatasetResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryAntchainPdcpDatasetResponse) SetTotal(v int64) *PagequeryAntchainPdcpDatasetResponse {
	s.Total = &v
	return s
}

func (s *PagequeryAntchainPdcpDatasetResponse) SetPage(v int64) *PagequeryAntchainPdcpDatasetResponse {
	s.Page = &v
	return s
}

func (s *PagequeryAntchainPdcpDatasetResponse) SetPageSize(v int64) *PagequeryAntchainPdcpDatasetResponse {
	s.PageSize = &v
	return s
}

func (s *PagequeryAntchainPdcpDatasetResponse) SetData(v []*LocalDataset) *PagequeryAntchainPdcpDatasetResponse {
	s.Data = v
	return s
}

type RecognizeAntchainPdcpDatasetSchemaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 采用数据源配置进行登记时的数据源 id
	// 如果填写了本参数，则可不填写datasourceType和connConfig
	// 如果填写了本参数，将优先采用本参数指定的 datasource 配置
	DatasourceId *string `json:"datasource_id,omitempty" xml:"datasource_id,omitempty"`
	// 数据资产数据源类型
	// 如果填写了datasourceId，则可不传本参数，填写了本参数也将被忽略
	// 如果未填写datasourceId，则必须同时填写本参数和connConfig参数
	DatasourceType *string `json:"datasource_type,omitempty" xml:"datasource_type,omitempty"`
	// 数据资产数据源连接信息，与数据源类型必须一一对应。
	// 如果填写了datasourceId，则可不传本参数，填写本参数也将被忽略。
	// 如果未填写datasourceId，则必须同时填写本参数和datasourceType参数。
	// 该参数请参考如下对应结构体，定义好后需转成jsonString，具体的对应信息如下：
	// MYSQL -> MysqlConnConfig,
	// ORACLE -> OracleConnConfig,
	// SQLSERVER -> SqlServerConnConfig,
	// DB2 -> DbTwoConnConfig,
	// HIVE2 -> HiveTwoConnConfig,
	// ODPS -> OdpsConnConfig
	ConnConfig *string `json:"conn_config,omitempty" xml:"conn_config,omitempty"`
	// 数据集位置配置，如数据表名称等。
	// 如果填写了datasourceId，则根据datasourceId对应的数据源类型进行解析。
	// 如果未填写datasourceId，则根据datasourceType进行解析。
	// 该参数请参考如下对应结构体，定义好后需转成jsonString，对应信息如下：
	// MYSQL -> MysqlLocationConfig,
	// ORACLE -> OracleLocationConfig,
	// SQLSERVER -> SqlServerLocationConfig,
	// DB2 -> DbTwoLocationConfig,
	// HIVE2 -> HiveTwoLocationConfig,
	// ODPS -> OdpsLocationConfig
	LocationConfig *string `json:"location_config,omitempty" xml:"location_config,omitempty" require:"true"`
	// 数据集格式类型，如TABLE。
	FormatType *string `json:"format_type,omitempty" xml:"format_type,omitempty" require:"true"`
	// 数据集所属的数据源格式信息，如 csv 分隔符，数据库主键名称等。
	// 该参数请参考如下对应结构体，定义好后需转成jsonString，对应关系如下：
	// 数据表 -> TableFormatConfig，
	FormatConfig *string `json:"format_config,omitempty" xml:"format_config,omitempty"`
}

func (s RecognizeAntchainPdcpDatasetSchemaRequest) String() string {
	return tea.Prettify(s)
}

func (s RecognizeAntchainPdcpDatasetSchemaRequest) GoString() string {
	return s.String()
}

func (s *RecognizeAntchainPdcpDatasetSchemaRequest) SetAuthToken(v string) *RecognizeAntchainPdcpDatasetSchemaRequest {
	s.AuthToken = &v
	return s
}

func (s *RecognizeAntchainPdcpDatasetSchemaRequest) SetProductInstanceId(v string) *RecognizeAntchainPdcpDatasetSchemaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RecognizeAntchainPdcpDatasetSchemaRequest) SetDatasourceId(v string) *RecognizeAntchainPdcpDatasetSchemaRequest {
	s.DatasourceId = &v
	return s
}

func (s *RecognizeAntchainPdcpDatasetSchemaRequest) SetDatasourceType(v string) *RecognizeAntchainPdcpDatasetSchemaRequest {
	s.DatasourceType = &v
	return s
}

func (s *RecognizeAntchainPdcpDatasetSchemaRequest) SetConnConfig(v string) *RecognizeAntchainPdcpDatasetSchemaRequest {
	s.ConnConfig = &v
	return s
}

func (s *RecognizeAntchainPdcpDatasetSchemaRequest) SetLocationConfig(v string) *RecognizeAntchainPdcpDatasetSchemaRequest {
	s.LocationConfig = &v
	return s
}

func (s *RecognizeAntchainPdcpDatasetSchemaRequest) SetFormatType(v string) *RecognizeAntchainPdcpDatasetSchemaRequest {
	s.FormatType = &v
	return s
}

func (s *RecognizeAntchainPdcpDatasetSchemaRequest) SetFormatConfig(v string) *RecognizeAntchainPdcpDatasetSchemaRequest {
	s.FormatConfig = &v
	return s
}

type RecognizeAntchainPdcpDatasetSchemaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 识别到的数据集的 schema 信息
	Data *RecognizedDatasetSchema `json:"data,omitempty" xml:"data,omitempty"`
}

func (s RecognizeAntchainPdcpDatasetSchemaResponse) String() string {
	return tea.Prettify(s)
}

func (s RecognizeAntchainPdcpDatasetSchemaResponse) GoString() string {
	return s.String()
}

func (s *RecognizeAntchainPdcpDatasetSchemaResponse) SetReqMsgId(v string) *RecognizeAntchainPdcpDatasetSchemaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RecognizeAntchainPdcpDatasetSchemaResponse) SetResultCode(v string) *RecognizeAntchainPdcpDatasetSchemaResponse {
	s.ResultCode = &v
	return s
}

func (s *RecognizeAntchainPdcpDatasetSchemaResponse) SetResultMsg(v string) *RecognizeAntchainPdcpDatasetSchemaResponse {
	s.ResultMsg = &v
	return s
}

func (s *RecognizeAntchainPdcpDatasetSchemaResponse) SetData(v *RecognizedDatasetSchema) *RecognizeAntchainPdcpDatasetSchemaResponse {
	s.Data = v
	return s
}

type CreateAntchainPdcpProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 参与方节点信息列表，不同的节点类型参考不同结构体。一期节点类型仅支持FATE，其构造方式请参考FatePartyLocalConfigInfo
	PartyList []*PartyReq `json:"party_list,omitempty" xml:"party_list,omitempty" require:"true" type:"Repeated"`
}

func (s CreateAntchainPdcpProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainPdcpProjectRequest) GoString() string {
	return s.String()
}

func (s *CreateAntchainPdcpProjectRequest) SetAuthToken(v string) *CreateAntchainPdcpProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAntchainPdcpProjectRequest) SetProductInstanceId(v string) *CreateAntchainPdcpProjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAntchainPdcpProjectRequest) SetName(v string) *CreateAntchainPdcpProjectRequest {
	s.Name = &v
	return s
}

func (s *CreateAntchainPdcpProjectRequest) SetPartyList(v []*PartyReq) *CreateAntchainPdcpProjectRequest {
	s.PartyList = v
	return s
}

type CreateAntchainPdcpProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 项目信息
	Data *Project `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateAntchainPdcpProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainPdcpProjectResponse) GoString() string {
	return s.String()
}

func (s *CreateAntchainPdcpProjectResponse) SetReqMsgId(v string) *CreateAntchainPdcpProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAntchainPdcpProjectResponse) SetResultCode(v string) *CreateAntchainPdcpProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAntchainPdcpProjectResponse) SetResultMsg(v string) *CreateAntchainPdcpProjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAntchainPdcpProjectResponse) SetData(v *Project) *CreateAntchainPdcpProjectResponse {
	s.Data = v
	return s
}

type GetAntchainPdcpProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目唯一标识
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true" minLength:"1"`
}

func (s GetAntchainPdcpProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainPdcpProjectRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainPdcpProjectRequest) SetAuthToken(v string) *GetAntchainPdcpProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainPdcpProjectRequest) SetProductInstanceId(v string) *GetAntchainPdcpProjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainPdcpProjectRequest) SetProjectId(v string) *GetAntchainPdcpProjectRequest {
	s.ProjectId = &v
	return s
}

type GetAntchainPdcpProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 项目详情信息
	Data *Project `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetAntchainPdcpProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainPdcpProjectResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainPdcpProjectResponse) SetReqMsgId(v string) *GetAntchainPdcpProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainPdcpProjectResponse) SetResultCode(v string) *GetAntchainPdcpProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainPdcpProjectResponse) SetResultMsg(v string) *GetAntchainPdcpProjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainPdcpProjectResponse) SetData(v *Project) *GetAntchainPdcpProjectResponse {
	s.Data = v
	return s
}

type AuthAntchainPdcpProjectDatasetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据集名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 数据集配置参数，若授权的数据集归属于云上的节点，则参考结构体AuthSaasDatasetConfig，若授权的数据集归属于线下的节点，则参考结构体AuthFateDatasetConfig
	Config *string `json:"config,omitempty" xml:"config,omitempty" require:"true"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 项目内可见范围类型，ALL_TENANT全部机构可见，SPECIFIC_TENANT部分机构可见。调用授权数据集 和 数据源请求时 若不填该参数，则默认ALL_TENANT
	VisibleType *string `json:"visible_type,omitempty" xml:"visible_type,omitempty"`
}

func (s AuthAntchainPdcpProjectDatasetRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthAntchainPdcpProjectDatasetRequest) GoString() string {
	return s.String()
}

func (s *AuthAntchainPdcpProjectDatasetRequest) SetAuthToken(v string) *AuthAntchainPdcpProjectDatasetRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthAntchainPdcpProjectDatasetRequest) SetProductInstanceId(v string) *AuthAntchainPdcpProjectDatasetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthAntchainPdcpProjectDatasetRequest) SetName(v string) *AuthAntchainPdcpProjectDatasetRequest {
	s.Name = &v
	return s
}

func (s *AuthAntchainPdcpProjectDatasetRequest) SetConfig(v string) *AuthAntchainPdcpProjectDatasetRequest {
	s.Config = &v
	return s
}

func (s *AuthAntchainPdcpProjectDatasetRequest) SetProjectId(v string) *AuthAntchainPdcpProjectDatasetRequest {
	s.ProjectId = &v
	return s
}

func (s *AuthAntchainPdcpProjectDatasetRequest) SetVisibleType(v string) *AuthAntchainPdcpProjectDatasetRequest {
	s.VisibleType = &v
	return s
}

type AuthAntchainPdcpProjectDatasetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权至某个项目中的数据集信息
	Data *AuthDataset `json:"data,omitempty" xml:"data,omitempty"`
}

func (s AuthAntchainPdcpProjectDatasetResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthAntchainPdcpProjectDatasetResponse) GoString() string {
	return s.String()
}

func (s *AuthAntchainPdcpProjectDatasetResponse) SetReqMsgId(v string) *AuthAntchainPdcpProjectDatasetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthAntchainPdcpProjectDatasetResponse) SetResultCode(v string) *AuthAntchainPdcpProjectDatasetResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthAntchainPdcpProjectDatasetResponse) SetResultMsg(v string) *AuthAntchainPdcpProjectDatasetResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthAntchainPdcpProjectDatasetResponse) SetData(v *AuthDataset) *AuthAntchainPdcpProjectDatasetResponse {
	s.Data = v
	return s
}

type AuthAntchainPdcpProjectDatasourceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据源名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 选择已登记的数据源ID，云上的参考AuthSaasDatasourceConfig
	Config *string `json:"config,omitempty" xml:"config,omitempty" require:"true"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 项目内可见范围类型，ALL_TENANT全部机构可见，SPECIFIC_TENANT部分机构可见。调用授权数据集 和 数据源请求时 若不填该参数，则默认ALL_TENANT
	VisibleType *string `json:"visible_type,omitempty" xml:"visible_type,omitempty"`
}

func (s AuthAntchainPdcpProjectDatasourceRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthAntchainPdcpProjectDatasourceRequest) GoString() string {
	return s.String()
}

func (s *AuthAntchainPdcpProjectDatasourceRequest) SetAuthToken(v string) *AuthAntchainPdcpProjectDatasourceRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthAntchainPdcpProjectDatasourceRequest) SetProductInstanceId(v string) *AuthAntchainPdcpProjectDatasourceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthAntchainPdcpProjectDatasourceRequest) SetName(v string) *AuthAntchainPdcpProjectDatasourceRequest {
	s.Name = &v
	return s
}

func (s *AuthAntchainPdcpProjectDatasourceRequest) SetConfig(v string) *AuthAntchainPdcpProjectDatasourceRequest {
	s.Config = &v
	return s
}

func (s *AuthAntchainPdcpProjectDatasourceRequest) SetProjectId(v string) *AuthAntchainPdcpProjectDatasourceRequest {
	s.ProjectId = &v
	return s
}

func (s *AuthAntchainPdcpProjectDatasourceRequest) SetVisibleType(v string) *AuthAntchainPdcpProjectDatasourceRequest {
	s.VisibleType = &v
	return s
}

type AuthAntchainPdcpProjectDatasourceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权至项目的数据源信息
	Data *AuthDatasource `json:"data,omitempty" xml:"data,omitempty"`
}

func (s AuthAntchainPdcpProjectDatasourceResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthAntchainPdcpProjectDatasourceResponse) GoString() string {
	return s.String()
}

func (s *AuthAntchainPdcpProjectDatasourceResponse) SetReqMsgId(v string) *AuthAntchainPdcpProjectDatasourceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthAntchainPdcpProjectDatasourceResponse) SetResultCode(v string) *AuthAntchainPdcpProjectDatasourceResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthAntchainPdcpProjectDatasourceResponse) SetResultMsg(v string) *AuthAntchainPdcpProjectDatasourceResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthAntchainPdcpProjectDatasourceResponse) SetData(v *AuthDatasource) *AuthAntchainPdcpProjectDatasourceResponse {
	s.Data = v
	return s
}

type PagequeryAntchainPdcpProjectAuthdatasetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true" minLength:"1"`
	// 分页参数
	Page *int64 `json:"page,omitempty" xml:"page,omitempty" require:"true"`
	// 分页参数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s PagequeryAntchainPdcpProjectAuthdatasetRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryAntchainPdcpProjectAuthdatasetRequest) GoString() string {
	return s.String()
}

func (s *PagequeryAntchainPdcpProjectAuthdatasetRequest) SetAuthToken(v string) *PagequeryAntchainPdcpProjectAuthdatasetRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryAntchainPdcpProjectAuthdatasetRequest) SetProductInstanceId(v string) *PagequeryAntchainPdcpProjectAuthdatasetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryAntchainPdcpProjectAuthdatasetRequest) SetProjectId(v string) *PagequeryAntchainPdcpProjectAuthdatasetRequest {
	s.ProjectId = &v
	return s
}

func (s *PagequeryAntchainPdcpProjectAuthdatasetRequest) SetPage(v int64) *PagequeryAntchainPdcpProjectAuthdatasetRequest {
	s.Page = &v
	return s
}

func (s *PagequeryAntchainPdcpProjectAuthdatasetRequest) SetPageSize(v int64) *PagequeryAntchainPdcpProjectAuthdatasetRequest {
	s.PageSize = &v
	return s
}

type PagequeryAntchainPdcpProjectAuthdatasetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果的总数量
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 分页页数
	Page *int64 `json:"page,omitempty" xml:"page,omitempty"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 返回的数据集元信息的列表
	Data []*AuthDataset `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s PagequeryAntchainPdcpProjectAuthdatasetResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryAntchainPdcpProjectAuthdatasetResponse) GoString() string {
	return s.String()
}

func (s *PagequeryAntchainPdcpProjectAuthdatasetResponse) SetReqMsgId(v string) *PagequeryAntchainPdcpProjectAuthdatasetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryAntchainPdcpProjectAuthdatasetResponse) SetResultCode(v string) *PagequeryAntchainPdcpProjectAuthdatasetResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryAntchainPdcpProjectAuthdatasetResponse) SetResultMsg(v string) *PagequeryAntchainPdcpProjectAuthdatasetResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryAntchainPdcpProjectAuthdatasetResponse) SetTotal(v int64) *PagequeryAntchainPdcpProjectAuthdatasetResponse {
	s.Total = &v
	return s
}

func (s *PagequeryAntchainPdcpProjectAuthdatasetResponse) SetPage(v int64) *PagequeryAntchainPdcpProjectAuthdatasetResponse {
	s.Page = &v
	return s
}

func (s *PagequeryAntchainPdcpProjectAuthdatasetResponse) SetPageSize(v int64) *PagequeryAntchainPdcpProjectAuthdatasetResponse {
	s.PageSize = &v
	return s
}

func (s *PagequeryAntchainPdcpProjectAuthdatasetResponse) SetData(v []*AuthDataset) *PagequeryAntchainPdcpProjectAuthdatasetResponse {
	s.Data = v
	return s
}

type PagequeryAntchainPdcpProjectAuthdatasourceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true" minLength:"1"`
	// 分页参数
	Page *int64 `json:"page,omitempty" xml:"page,omitempty" require:"true"`
	// 分页参数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s PagequeryAntchainPdcpProjectAuthdatasourceRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryAntchainPdcpProjectAuthdatasourceRequest) GoString() string {
	return s.String()
}

func (s *PagequeryAntchainPdcpProjectAuthdatasourceRequest) SetAuthToken(v string) *PagequeryAntchainPdcpProjectAuthdatasourceRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryAntchainPdcpProjectAuthdatasourceRequest) SetProductInstanceId(v string) *PagequeryAntchainPdcpProjectAuthdatasourceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryAntchainPdcpProjectAuthdatasourceRequest) SetProjectId(v string) *PagequeryAntchainPdcpProjectAuthdatasourceRequest {
	s.ProjectId = &v
	return s
}

func (s *PagequeryAntchainPdcpProjectAuthdatasourceRequest) SetPage(v int64) *PagequeryAntchainPdcpProjectAuthdatasourceRequest {
	s.Page = &v
	return s
}

func (s *PagequeryAntchainPdcpProjectAuthdatasourceRequest) SetPageSize(v int64) *PagequeryAntchainPdcpProjectAuthdatasourceRequest {
	s.PageSize = &v
	return s
}

type PagequeryAntchainPdcpProjectAuthdatasourceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果的总数量
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 分页页数
	Page *int64 `json:"page,omitempty" xml:"page,omitempty"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 返回项目内已授权的数据集源信息的列表
	Data []*AuthDatasource `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s PagequeryAntchainPdcpProjectAuthdatasourceResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryAntchainPdcpProjectAuthdatasourceResponse) GoString() string {
	return s.String()
}

func (s *PagequeryAntchainPdcpProjectAuthdatasourceResponse) SetReqMsgId(v string) *PagequeryAntchainPdcpProjectAuthdatasourceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryAntchainPdcpProjectAuthdatasourceResponse) SetResultCode(v string) *PagequeryAntchainPdcpProjectAuthdatasourceResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryAntchainPdcpProjectAuthdatasourceResponse) SetResultMsg(v string) *PagequeryAntchainPdcpProjectAuthdatasourceResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryAntchainPdcpProjectAuthdatasourceResponse) SetTotal(v int64) *PagequeryAntchainPdcpProjectAuthdatasourceResponse {
	s.Total = &v
	return s
}

func (s *PagequeryAntchainPdcpProjectAuthdatasourceResponse) SetPage(v int64) *PagequeryAntchainPdcpProjectAuthdatasourceResponse {
	s.Page = &v
	return s
}

func (s *PagequeryAntchainPdcpProjectAuthdatasourceResponse) SetPageSize(v int64) *PagequeryAntchainPdcpProjectAuthdatasourceResponse {
	s.PageSize = &v
	return s
}

func (s *PagequeryAntchainPdcpProjectAuthdatasourceResponse) SetData(v []*AuthDatasource) *PagequeryAntchainPdcpProjectAuthdatasourceResponse {
	s.Data = v
	return s
}

type QueryAntchainPdcpJobPsiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID
	JobId *string `json:"job_id,omitempty" xml:"job_id,omitempty" require:"true" minLength:"1"`
}

func (s QueryAntchainPdcpJobPsiRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainPdcpJobPsiRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainPdcpJobPsiRequest) SetAuthToken(v string) *QueryAntchainPdcpJobPsiRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainPdcpJobPsiRequest) SetProductInstanceId(v string) *QueryAntchainPdcpJobPsiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainPdcpJobPsiRequest) SetJobId(v string) *QueryAntchainPdcpJobPsiRequest {
	s.JobId = &v
	return s
}

type QueryAntchainPdcpJobPsiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务信息
	Data *PsiJob `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryAntchainPdcpJobPsiResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainPdcpJobPsiResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainPdcpJobPsiResponse) SetReqMsgId(v string) *QueryAntchainPdcpJobPsiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainPdcpJobPsiResponse) SetResultCode(v string) *QueryAntchainPdcpJobPsiResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainPdcpJobPsiResponse) SetResultMsg(v string) *QueryAntchainPdcpJobPsiResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainPdcpJobPsiResponse) SetData(v *PsiJob) *QueryAntchainPdcpJobPsiResponse {
	s.Data = v
	return s
}

type SubmitAntchainPdcpJobPsiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 任务名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 任务类型，目前仅支持一种
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 任务的描述信息
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 任务执行参数，构造方式参考Participant结构体定义
	ParticipantList []*PsiParticipantConfig `json:"participant_list,omitempty" xml:"participant_list,omitempty" require:"true" type:"Repeated"`
}

func (s SubmitAntchainPdcpJobPsiRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitAntchainPdcpJobPsiRequest) GoString() string {
	return s.String()
}

func (s *SubmitAntchainPdcpJobPsiRequest) SetAuthToken(v string) *SubmitAntchainPdcpJobPsiRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitAntchainPdcpJobPsiRequest) SetProductInstanceId(v string) *SubmitAntchainPdcpJobPsiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitAntchainPdcpJobPsiRequest) SetProjectId(v string) *SubmitAntchainPdcpJobPsiRequest {
	s.ProjectId = &v
	return s
}

func (s *SubmitAntchainPdcpJobPsiRequest) SetName(v string) *SubmitAntchainPdcpJobPsiRequest {
	s.Name = &v
	return s
}

func (s *SubmitAntchainPdcpJobPsiRequest) SetType(v string) *SubmitAntchainPdcpJobPsiRequest {
	s.Type = &v
	return s
}

func (s *SubmitAntchainPdcpJobPsiRequest) SetDescription(v string) *SubmitAntchainPdcpJobPsiRequest {
	s.Description = &v
	return s
}

func (s *SubmitAntchainPdcpJobPsiRequest) SetParticipantList(v []*PsiParticipantConfig) *SubmitAntchainPdcpJobPsiRequest {
	s.ParticipantList = v
	return s
}

type SubmitAntchainPdcpJobPsiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务信息
	Data *PsiJob `json:"data,omitempty" xml:"data,omitempty"`
}

func (s SubmitAntchainPdcpJobPsiResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitAntchainPdcpJobPsiResponse) GoString() string {
	return s.String()
}

func (s *SubmitAntchainPdcpJobPsiResponse) SetReqMsgId(v string) *SubmitAntchainPdcpJobPsiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitAntchainPdcpJobPsiResponse) SetResultCode(v string) *SubmitAntchainPdcpJobPsiResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitAntchainPdcpJobPsiResponse) SetResultMsg(v string) *SubmitAntchainPdcpJobPsiResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitAntchainPdcpJobPsiResponse) SetData(v *PsiJob) *SubmitAntchainPdcpJobPsiResponse {
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
				"sdk_version":      tea.String("1.0.1"),
				"_prod_code":       tea.String("ak_be9ae52241c747408ac24bec8f036d74"),
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
 * Description: 请求创建数据源
 * Summary: 创建新的数据源
 */
func (client *Client) CreateAntchainPdcpDatasource(request *CreateAntchainPdcpDatasourceRequest) (_result *CreateAntchainPdcpDatasourceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAntchainPdcpDatasourceResponse{}
	_body, _err := client.CreateAntchainPdcpDatasourceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 请求创建数据源
 * Summary: 创建新的数据源
 */
func (client *Client) CreateAntchainPdcpDatasourceEx(request *CreateAntchainPdcpDatasourceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAntchainPdcpDatasourceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAntchainPdcpDatasourceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.pdcp.datasource.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 请求删除指定的数据源。
 * Summary: 删除指定的数据源
 */
func (client *Client) DeleteAntchainPdcpDatasource(request *DeleteAntchainPdcpDatasourceRequest) (_result *DeleteAntchainPdcpDatasourceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteAntchainPdcpDatasourceResponse{}
	_body, _err := client.DeleteAntchainPdcpDatasourceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 请求删除指定的数据源。
 * Summary: 删除指定的数据源
 */
func (client *Client) DeleteAntchainPdcpDatasourceEx(request *DeleteAntchainPdcpDatasourceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteAntchainPdcpDatasourceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteAntchainPdcpDatasourceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.pdcp.datasource.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 请求更新指定数据源的信息。
 * Summary: 更新指定数据源的信息
 */
func (client *Client) UpdateAntchainPdcpDatasource(request *UpdateAntchainPdcpDatasourceRequest) (_result *UpdateAntchainPdcpDatasourceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateAntchainPdcpDatasourceResponse{}
	_body, _err := client.UpdateAntchainPdcpDatasourceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 请求更新指定数据源的信息。
 * Summary: 更新指定数据源的信息
 */
func (client *Client) UpdateAntchainPdcpDatasourceEx(request *UpdateAntchainPdcpDatasourceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateAntchainPdcpDatasourceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAntchainPdcpDatasourceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.pdcp.datasource.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 请求查询指定的数据源信息。
 * Summary: 查询指定的数据源信息
 */
func (client *Client) QueryAntchainPdcpDatasource(request *QueryAntchainPdcpDatasourceRequest) (_result *QueryAntchainPdcpDatasourceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainPdcpDatasourceResponse{}
	_body, _err := client.QueryAntchainPdcpDatasourceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 请求查询指定的数据源信息。
 * Summary: 查询指定的数据源信息
 */
func (client *Client) QueryAntchainPdcpDatasourceEx(request *QueryAntchainPdcpDatasourceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainPdcpDatasourceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainPdcpDatasourceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.pdcp.datasource.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页搜索数据源
 * Summary: 分页搜索数据源
 */
func (client *Client) PagequeryAntchainPdcpDatasource(request *PagequeryAntchainPdcpDatasourceRequest) (_result *PagequeryAntchainPdcpDatasourceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryAntchainPdcpDatasourceResponse{}
	_body, _err := client.PagequeryAntchainPdcpDatasourceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页搜索数据源
 * Summary: 分页搜索数据源
 */
func (client *Client) PagequeryAntchainPdcpDatasourceEx(request *PagequeryAntchainPdcpDatasourceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryAntchainPdcpDatasourceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryAntchainPdcpDatasourceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.pdcp.datasource.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建新的数据集
 * Summary: 创建新的数据集
 */
func (client *Client) CreateAntchainPdcpDataset(request *CreateAntchainPdcpDatasetRequest) (_result *CreateAntchainPdcpDatasetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAntchainPdcpDatasetResponse{}
	_body, _err := client.CreateAntchainPdcpDatasetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建新的数据集
 * Summary: 创建新的数据集
 */
func (client *Client) CreateAntchainPdcpDatasetEx(request *CreateAntchainPdcpDatasetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAntchainPdcpDatasetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAntchainPdcpDatasetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.pdcp.dataset.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除指定数据集
 * Summary: 删除指定数据集
 */
func (client *Client) DeleteAntchainPdcpDataset(request *DeleteAntchainPdcpDatasetRequest) (_result *DeleteAntchainPdcpDatasetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteAntchainPdcpDatasetResponse{}
	_body, _err := client.DeleteAntchainPdcpDatasetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除指定数据集
 * Summary: 删除指定数据集
 */
func (client *Client) DeleteAntchainPdcpDatasetEx(request *DeleteAntchainPdcpDatasetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteAntchainPdcpDatasetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteAntchainPdcpDatasetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.pdcp.dataset.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新指定数据集信息
 * Summary: 更新指定数据集信息
 */
func (client *Client) UpdateAntchainPdcpDataset(request *UpdateAntchainPdcpDatasetRequest) (_result *UpdateAntchainPdcpDatasetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateAntchainPdcpDatasetResponse{}
	_body, _err := client.UpdateAntchainPdcpDatasetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新指定数据集信息
 * Summary: 更新指定数据集信息
 */
func (client *Client) UpdateAntchainPdcpDatasetEx(request *UpdateAntchainPdcpDatasetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateAntchainPdcpDatasetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAntchainPdcpDatasetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.pdcp.dataset.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询指定数据集信息
 * Summary: 查询指定数据集信息
 */
func (client *Client) QueryAntchainPdcpDataset(request *QueryAntchainPdcpDatasetRequest) (_result *QueryAntchainPdcpDatasetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainPdcpDatasetResponse{}
	_body, _err := client.QueryAntchainPdcpDatasetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询指定数据集信息
 * Summary: 查询指定数据集信息
 */
func (client *Client) QueryAntchainPdcpDatasetEx(request *QueryAntchainPdcpDatasetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainPdcpDatasetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainPdcpDatasetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.pdcp.dataset.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页搜索数据集
 * Summary: 分页搜索数据集
 */
func (client *Client) PagequeryAntchainPdcpDataset(request *PagequeryAntchainPdcpDatasetRequest) (_result *PagequeryAntchainPdcpDatasetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryAntchainPdcpDatasetResponse{}
	_body, _err := client.PagequeryAntchainPdcpDatasetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页搜索数据集
 * Summary: 分页搜索数据集
 */
func (client *Client) PagequeryAntchainPdcpDatasetEx(request *PagequeryAntchainPdcpDatasetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryAntchainPdcpDatasetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryAntchainPdcpDatasetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.pdcp.dataset.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 识别数据集的 schema 信息
 * Summary: 识别数据集的 schema 信息
 */
func (client *Client) RecognizeAntchainPdcpDatasetSchema(request *RecognizeAntchainPdcpDatasetSchemaRequest) (_result *RecognizeAntchainPdcpDatasetSchemaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RecognizeAntchainPdcpDatasetSchemaResponse{}
	_body, _err := client.RecognizeAntchainPdcpDatasetSchemaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 识别数据集的 schema 信息
 * Summary: 识别数据集的 schema 信息
 */
func (client *Client) RecognizeAntchainPdcpDatasetSchemaEx(request *RecognizeAntchainPdcpDatasetSchemaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RecognizeAntchainPdcpDatasetSchemaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RecognizeAntchainPdcpDatasetSchemaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.pdcp.dataset.schema.recognize"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建项目，添加线下参与方协作节点
 * Summary: 创建项目
 */
func (client *Client) CreateAntchainPdcpProject(request *CreateAntchainPdcpProjectRequest) (_result *CreateAntchainPdcpProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAntchainPdcpProjectResponse{}
	_body, _err := client.CreateAntchainPdcpProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建项目，添加线下参与方协作节点
 * Summary: 创建项目
 */
func (client *Client) CreateAntchainPdcpProjectEx(request *CreateAntchainPdcpProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAntchainPdcpProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAntchainPdcpProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.pdcp.project.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据项目ID查询项目信息
 * Summary: 根据项目ID查询项目信息
 */
func (client *Client) GetAntchainPdcpProject(request *GetAntchainPdcpProjectRequest) (_result *GetAntchainPdcpProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainPdcpProjectResponse{}
	_body, _err := client.GetAntchainPdcpProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据项目ID查询项目信息
 * Summary: 根据项目ID查询项目信息
 */
func (client *Client) GetAntchainPdcpProjectEx(request *GetAntchainPdcpProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainPdcpProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainPdcpProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.pdcp.project.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 授权dataset至项目内，/api/project/dataset/auth，后续创建任务时仅允许选择已授权至项目内的数据集列表
 * Summary: 授权某个本地的数据集至项目中
 */
func (client *Client) AuthAntchainPdcpProjectDataset(request *AuthAntchainPdcpProjectDatasetRequest) (_result *AuthAntchainPdcpProjectDatasetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthAntchainPdcpProjectDatasetResponse{}
	_body, _err := client.AuthAntchainPdcpProjectDatasetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 授权dataset至项目内，/api/project/dataset/auth，后续创建任务时仅允许选择已授权至项目内的数据集列表
 * Summary: 授权某个本地的数据集至项目中
 */
func (client *Client) AuthAntchainPdcpProjectDatasetEx(request *AuthAntchainPdcpProjectDatasetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthAntchainPdcpProjectDatasetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthAntchainPdcpProjectDatasetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.pdcp.project.dataset.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 授权数据源至项目/api/project/datasource/auth
 * Summary: 授权某个本地数据源至项目中
 */
func (client *Client) AuthAntchainPdcpProjectDatasource(request *AuthAntchainPdcpProjectDatasourceRequest) (_result *AuthAntchainPdcpProjectDatasourceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthAntchainPdcpProjectDatasourceResponse{}
	_body, _err := client.AuthAntchainPdcpProjectDatasourceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 授权数据源至项目/api/project/datasource/auth
 * Summary: 授权某个本地数据源至项目中
 */
func (client *Client) AuthAntchainPdcpProjectDatasourceEx(request *AuthAntchainPdcpProjectDatasourceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthAntchainPdcpProjectDatasourceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthAntchainPdcpProjectDatasourceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.pdcp.project.datasource.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询项目内已授权的数据集列表
 * Summary: 分页查询项目内已授权的数据集列表
 */
func (client *Client) PagequeryAntchainPdcpProjectAuthdataset(request *PagequeryAntchainPdcpProjectAuthdatasetRequest) (_result *PagequeryAntchainPdcpProjectAuthdatasetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryAntchainPdcpProjectAuthdatasetResponse{}
	_body, _err := client.PagequeryAntchainPdcpProjectAuthdatasetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询项目内已授权的数据集列表
 * Summary: 分页查询项目内已授权的数据集列表
 */
func (client *Client) PagequeryAntchainPdcpProjectAuthdatasetEx(request *PagequeryAntchainPdcpProjectAuthdatasetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryAntchainPdcpProjectAuthdatasetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryAntchainPdcpProjectAuthdatasetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.pdcp.project.authdataset.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询项目内已授权的数据源列表
 * Summary: 分页查询项目内已授权的数据源列表
 */
func (client *Client) PagequeryAntchainPdcpProjectAuthdatasource(request *PagequeryAntchainPdcpProjectAuthdatasourceRequest) (_result *PagequeryAntchainPdcpProjectAuthdatasourceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryAntchainPdcpProjectAuthdatasourceResponse{}
	_body, _err := client.PagequeryAntchainPdcpProjectAuthdatasourceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询项目内已授权的数据源列表
 * Summary: 分页查询项目内已授权的数据源列表
 */
func (client *Client) PagequeryAntchainPdcpProjectAuthdatasourceEx(request *PagequeryAntchainPdcpProjectAuthdatasourceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryAntchainPdcpProjectAuthdatasourceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryAntchainPdcpProjectAuthdatasourceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.pdcp.project.authdatasource.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询任务信息
 * Summary: 查询任务状态
 */
func (client *Client) QueryAntchainPdcpJobPsi(request *QueryAntchainPdcpJobPsiRequest) (_result *QueryAntchainPdcpJobPsiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainPdcpJobPsiResponse{}
	_body, _err := client.QueryAntchainPdcpJobPsiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询任务信息
 * Summary: 查询任务状态
 */
func (client *Client) QueryAntchainPdcpJobPsiEx(request *QueryAntchainPdcpJobPsiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainPdcpJobPsiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainPdcpJobPsiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.pdcp.job.psi.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交psi任务接口
 * Summary: 提交psi任务接口
 */
func (client *Client) SubmitAntchainPdcpJobPsi(request *SubmitAntchainPdcpJobPsiRequest) (_result *SubmitAntchainPdcpJobPsiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitAntchainPdcpJobPsiResponse{}
	_body, _err := client.SubmitAntchainPdcpJobPsiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交psi任务接口
 * Summary: 提交psi任务接口
 */
func (client *Client) SubmitAntchainPdcpJobPsiEx(request *SubmitAntchainPdcpJobPsiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitAntchainPdcpJobPsiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitAntchainPdcpJobPsiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.pdcp.job.psi.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
