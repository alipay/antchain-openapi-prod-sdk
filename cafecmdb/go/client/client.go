// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/service"
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

// 由于OP不支持MAP对象，此对象用来模拟Map中的Entry
type MapStringToStringEntry struct {
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// value
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s MapStringToStringEntry) String() string {
	return tea.Prettify(s)
}

func (s MapStringToStringEntry) GoString() string {
	return s.String()
}

func (s *MapStringToStringEntry) SetKey(v string) *MapStringToStringEntry {
	s.Key = &v
	return s
}

func (s *MapStringToStringEntry) SetValue(v string) *MapStringToStringEntry {
	s.Value = &v
	return s
}

// 查询的条件
type Condition struct {
	// 用于查询条件的字段
	Field *string `json:"field,omitempty" xml:"field,omitempty" require:"true"`
	// 查询操作符
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// 由于OP限制，此字段无法直接使用数组。请务必使用能够解析的JSON数组
	Values *string `json:"values,omitempty" xml:"values,omitempty" require:"true"`
}

func (s Condition) String() string {
	return tea.Prettify(s)
}

func (s Condition) GoString() string {
	return s.String()
}

func (s *Condition) SetField(v string) *Condition {
	s.Field = &v
	return s
}

func (s *Condition) SetOperator(v string) *Condition {
	s.Operator = &v
	return s
}

func (s *Condition) SetValues(v string) *Condition {
	s.Values = &v
	return s
}

// 字段组
type AttributeGroup struct {
	// id
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty" require:"true"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// display_name
	DisplayName *string `json:"display_name,omitempty" xml:"display_name,omitempty"`
	// display_properties
	DisplayProperties *string `json:"display_properties,omitempty" xml:"display_properties,omitempty"`
}

func (s AttributeGroup) String() string {
	return tea.Prettify(s)
}

func (s AttributeGroup) GoString() string {
	return s.String()
}

func (s *AttributeGroup) SetUniqueId(v string) *AttributeGroup {
	s.UniqueId = &v
	return s
}

func (s *AttributeGroup) SetName(v string) *AttributeGroup {
	s.Name = &v
	return s
}

func (s *AttributeGroup) SetDisplayName(v string) *AttributeGroup {
	s.DisplayName = &v
	return s
}

func (s *AttributeGroup) SetDisplayProperties(v string) *AttributeGroup {
	s.DisplayProperties = &v
	return s
}

// 模型字段（属性）
type Attribute struct {
	// 所属模型的唯一标识
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
	// 唯一标识（所属模型内唯一）
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty" require:"true"`
	// 名称（所属模型内唯一）
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 类型【取值范围：INTEGER，LONG，DOUBLE，FLOAT，BOOLEAN，STRING，DATE，DATETIME，ENUM，ARRAY】
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 是否为系统内置
	System *bool `json:"system,omitempty" xml:"system,omitempty" require:"true"`
	// 是否只读
	Readonly *bool `json:"readonly,omitempty" xml:"readonly,omitempty" require:"true"`
	// 是否必填
	Required *bool `json:"required,omitempty" xml:"required,omitempty" require:"true"`
	// 用于前端展示排序，数字越大优先级越高，默认为 0
	Priority *int64 `json:"priority,omitempty" xml:"priority,omitempty" require:"true"`
	// 用于前端展示的扩展属性
	DisplayProperties []*MapStringToStringEntry `json:"display_properties,omitempty" xml:"display_properties,omitempty" type:"Repeated"`
	// 创建时间
	CreatedTime *string `json:"created_time,omitempty" xml:"created_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	ModifiedTime *string `json:"modified_time,omitempty" xml:"modified_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 字段分组Id
	GroupId *string `json:"group_id,omitempty" xml:"group_id,omitempty" require:"true"`
}

func (s Attribute) String() string {
	return tea.Prettify(s)
}

func (s Attribute) GoString() string {
	return s.String()
}

func (s *Attribute) SetModelId(v string) *Attribute {
	s.ModelId = &v
	return s
}

func (s *Attribute) SetUniqueId(v string) *Attribute {
	s.UniqueId = &v
	return s
}

func (s *Attribute) SetName(v string) *Attribute {
	s.Name = &v
	return s
}

func (s *Attribute) SetDescription(v string) *Attribute {
	s.Description = &v
	return s
}

func (s *Attribute) SetType(v string) *Attribute {
	s.Type = &v
	return s
}

func (s *Attribute) SetSystem(v bool) *Attribute {
	s.System = &v
	return s
}

func (s *Attribute) SetReadonly(v bool) *Attribute {
	s.Readonly = &v
	return s
}

func (s *Attribute) SetRequired(v bool) *Attribute {
	s.Required = &v
	return s
}

func (s *Attribute) SetPriority(v int64) *Attribute {
	s.Priority = &v
	return s
}

func (s *Attribute) SetDisplayProperties(v []*MapStringToStringEntry) *Attribute {
	s.DisplayProperties = v
	return s
}

func (s *Attribute) SetCreatedTime(v string) *Attribute {
	s.CreatedTime = &v
	return s
}

func (s *Attribute) SetModifiedTime(v string) *Attribute {
	s.ModifiedTime = &v
	return s
}

func (s *Attribute) SetGroupId(v string) *Attribute {
	s.GroupId = &v
	return s
}

// 模型分组
type ModelCategory struct {
	// 唯一标识（全局唯一）
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty" require:"true"`
	// 名称（全局唯一）
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 是否为系统内置
	System *bool `json:"system,omitempty" xml:"system,omitempty" require:"true"`
	// 创建时间
	CreatedTime *string `json:"created_time,omitempty" xml:"created_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	ModifiedTime *string `json:"modified_time,omitempty" xml:"modified_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// icon
	Icon *string `json:"icon,omitempty" xml:"icon,omitempty"`
}

func (s ModelCategory) String() string {
	return tea.Prettify(s)
}

func (s ModelCategory) GoString() string {
	return s.String()
}

func (s *ModelCategory) SetUniqueId(v string) *ModelCategory {
	s.UniqueId = &v
	return s
}

func (s *ModelCategory) SetName(v string) *ModelCategory {
	s.Name = &v
	return s
}

func (s *ModelCategory) SetSystem(v bool) *ModelCategory {
	s.System = &v
	return s
}

func (s *ModelCategory) SetCreatedTime(v string) *ModelCategory {
	s.CreatedTime = &v
	return s
}

func (s *ModelCategory) SetModifiedTime(v string) *ModelCategory {
	s.ModifiedTime = &v
	return s
}

func (s *ModelCategory) SetIcon(v string) *ModelCategory {
	s.Icon = &v
	return s
}

// 模型关联
type ModelRelationship struct {
	// 目标模型的唯一标识
	DestinationModelId *string `json:"destination_model_id,omitempty" xml:"destination_model_id,omitempty" require:"true"`
	// 源模型的唯一标识（目标模型内唯一）
	SourceModelId *string `json:"source_model_id,omitempty" xml:"source_model_id,omitempty" require:"true"`
	// 唯一标识（目标模型内唯一，等同于目标模型中与源模型建立关联的外键属性）
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty" require:"true"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 关联类型【取值范围：ONE_TO_ONE，ONE_TO_MANY】
	RelationType *string `json:"relation_type,omitempty" xml:"relation_type,omitempty" require:"true"`
	// 是否为系统内置
	System *bool `json:"system,omitempty" xml:"system,omitempty" require:"true"`
	// 创建时间
	CreatedTime *string `json:"created_time,omitempty" xml:"created_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	ModifiedTime *string `json:"modified_time,omitempty" xml:"modified_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s ModelRelationship) String() string {
	return tea.Prettify(s)
}

func (s ModelRelationship) GoString() string {
	return s.String()
}

func (s *ModelRelationship) SetDestinationModelId(v string) *ModelRelationship {
	s.DestinationModelId = &v
	return s
}

func (s *ModelRelationship) SetSourceModelId(v string) *ModelRelationship {
	s.SourceModelId = &v
	return s
}

func (s *ModelRelationship) SetUniqueId(v string) *ModelRelationship {
	s.UniqueId = &v
	return s
}

func (s *ModelRelationship) SetDescription(v string) *ModelRelationship {
	s.Description = &v
	return s
}

func (s *ModelRelationship) SetRelationType(v string) *ModelRelationship {
	s.RelationType = &v
	return s
}

func (s *ModelRelationship) SetSystem(v bool) *ModelRelationship {
	s.System = &v
	return s
}

func (s *ModelRelationship) SetCreatedTime(v string) *ModelRelationship {
	s.CreatedTime = &v
	return s
}

func (s *ModelRelationship) SetModifiedTime(v string) *ModelRelationship {
	s.ModifiedTime = &v
	return s
}

// 审计日志
type AuditLog struct {
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 操作者
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// 操作的对象类别
	ResourceType *string `json:"resource_type,omitempty" xml:"resource_type,omitempty" require:"true"`
	// 动作
	Action *string `json:"action,omitempty" xml:"action,omitempty" require:"true"`
	// 对象的ID
	Targets []*string `json:"targets,omitempty" xml:"targets,omitempty" require:"true" type:"Repeated"`
	// operation_time
	OperationTime *string `json:"operation_time,omitempty" xml:"operation_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s AuditLog) String() string {
	return tea.Prettify(s)
}

func (s AuditLog) GoString() string {
	return s.String()
}

func (s *AuditLog) SetId(v string) *AuditLog {
	s.Id = &v
	return s
}

func (s *AuditLog) SetOperator(v string) *AuditLog {
	s.Operator = &v
	return s
}

func (s *AuditLog) SetResourceType(v string) *AuditLog {
	s.ResourceType = &v
	return s
}

func (s *AuditLog) SetAction(v string) *AuditLog {
	s.Action = &v
	return s
}

func (s *AuditLog) SetTargets(v []*string) *AuditLog {
	s.Targets = v
	return s
}

func (s *AuditLog) SetOperationTime(v string) *AuditLog {
	s.OperationTime = &v
	return s
}

// CMDB中的实体对象
type Item struct {
	// 实例ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// created_time
	CreatedTime *string `json:"created_time,omitempty" xml:"created_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// modified_time
	ModifiedTime *string `json:"modified_time,omitempty" xml:"modified_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// data_json
	DataJson *string `json:"data_json,omitempty" xml:"data_json,omitempty" require:"true"`
}

func (s Item) String() string {
	return tea.Prettify(s)
}

func (s Item) GoString() string {
	return s.String()
}

func (s *Item) SetId(v string) *Item {
	s.Id = &v
	return s
}

func (s *Item) SetName(v string) *Item {
	s.Name = &v
	return s
}

func (s *Item) SetCreatedTime(v string) *Item {
	s.CreatedTime = &v
	return s
}

func (s *Item) SetModifiedTime(v string) *Item {
	s.ModifiedTime = &v
	return s
}

func (s *Item) SetDataJson(v string) *Item {
	s.DataJson = &v
	return s
}

// 模型
type Model struct {
	// 唯一标识（全局唯一）
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty" require:"true"`
	// 名称（全局唯一）
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 所属模型分组的唯一标识
	CategoryId *string `json:"category_id,omitempty" xml:"category_id,omitempty" require:"true"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 是否为系统内置
	System *bool `json:"system,omitempty" xml:"system,omitempty" require:"true"`
	// 用于前端展示排序，数字越大优先级越高，默认为 0
	Priority *int64 `json:"priority,omitempty" xml:"priority,omitempty" require:"true"`
	// 用于前端展示的扩展属性
	DisplayProperties []*MapStringToStringEntry `json:"display_properties,omitempty" xml:"display_properties,omitempty" type:"Repeated"`
	// 创建时间
	CreatedTime *string `json:"created_time,omitempty" xml:"created_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	ModifiedTime *string `json:"modified_time,omitempty" xml:"modified_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s Model) String() string {
	return tea.Prettify(s)
}

func (s Model) GoString() string {
	return s.String()
}

func (s *Model) SetUniqueId(v string) *Model {
	s.UniqueId = &v
	return s
}

func (s *Model) SetName(v string) *Model {
	s.Name = &v
	return s
}

func (s *Model) SetCategoryId(v string) *Model {
	s.CategoryId = &v
	return s
}

func (s *Model) SetDescription(v string) *Model {
	s.Description = &v
	return s
}

func (s *Model) SetSystem(v bool) *Model {
	s.System = &v
	return s
}

func (s *Model) SetPriority(v int64) *Model {
	s.Priority = &v
	return s
}

func (s *Model) SetDisplayProperties(v []*MapStringToStringEntry) *Model {
	s.DisplayProperties = v
	return s
}

func (s *Model) SetCreatedTime(v string) *Model {
	s.CreatedTime = &v
	return s
}

func (s *Model) SetModifiedTime(v string) *Model {
	s.ModifiedTime = &v
	return s
}

// 系统参数
type SystemParam struct {
	// description
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// value_type
	ValueType *string `json:"value_type,omitempty" xml:"value_type,omitempty" require:"true"`
	// value_json
	ValueJson *string `json:"value_json,omitempty" xml:"value_json,omitempty" require:"true"`
	// group_name
	GroupName *string `json:"group_name,omitempty" xml:"group_name,omitempty" require:"true"`
}

func (s SystemParam) String() string {
	return tea.Prettify(s)
}

func (s SystemParam) GoString() string {
	return s.String()
}

func (s *SystemParam) SetDescription(v string) *SystemParam {
	s.Description = &v
	return s
}

func (s *SystemParam) SetKey(v string) *SystemParam {
	s.Key = &v
	return s
}

func (s *SystemParam) SetValueType(v string) *SystemParam {
	s.ValueType = &v
	return s
}

func (s *SystemParam) SetValueJson(v string) *SystemParam {
	s.ValueJson = &v
	return s
}

func (s *SystemParam) SetGroupName(v string) *SystemParam {
	s.GroupName = &v
	return s
}

// 联合查询时的过滤条件
type Filter struct {
	// join_model_id
	JoinModelId *string `json:"join_model_id,omitempty" xml:"join_model_id,omitempty" require:"true"`
	// conditions
	Conditions []*Condition `json:"conditions,omitempty" xml:"conditions,omitempty" require:"true" type:"Repeated"`
}

func (s Filter) String() string {
	return tea.Prettify(s)
}

func (s Filter) GoString() string {
	return s.String()
}

func (s *Filter) SetJoinModelId(v string) *Filter {
	s.JoinModelId = &v
	return s
}

func (s *Filter) SetConditions(v []*Condition) *Filter {
	s.Conditions = v
	return s
}

type QueryItemRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// display_fields
	DisplayFields []*string `json:"display_fields,omitempty" xml:"display_fields,omitempty" type:"Repeated"`
	// page_size
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// page_number
	PageNumber *int64 `json:"page_number,omitempty" xml:"page_number,omitempty"`
	// sort_fields
	SortFields []*string `json:"sort_fields,omitempty" xml:"sort_fields,omitempty" type:"Repeated"`
	// conditions
	Conditions []*Condition `json:"conditions,omitempty" xml:"conditions,omitempty" require:"true" type:"Repeated"`
	// filter
	Filter *Filter `json:"filter,omitempty" xml:"filter,omitempty"`
	// model_id
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
}

func (s QueryItemRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryItemRequest) GoString() string {
	return s.String()
}

func (s *QueryItemRequest) SetAuthToken(v string) *QueryItemRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryItemRequest) SetDisplayFields(v []*string) *QueryItemRequest {
	s.DisplayFields = v
	return s
}

func (s *QueryItemRequest) SetPageSize(v int64) *QueryItemRequest {
	s.PageSize = &v
	return s
}

func (s *QueryItemRequest) SetPageNumber(v int64) *QueryItemRequest {
	s.PageNumber = &v
	return s
}

func (s *QueryItemRequest) SetSortFields(v []*string) *QueryItemRequest {
	s.SortFields = v
	return s
}

func (s *QueryItemRequest) SetConditions(v []*Condition) *QueryItemRequest {
	s.Conditions = v
	return s
}

func (s *QueryItemRequest) SetFilter(v *Filter) *QueryItemRequest {
	s.Filter = v
	return s
}

func (s *QueryItemRequest) SetModelId(v string) *QueryItemRequest {
	s.ModelId = &v
	return s
}

type QueryItemResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// total_count
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// data
	Data []*Item `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryItemResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryItemResponse) GoString() string {
	return s.String()
}

func (s *QueryItemResponse) SetReqMsgId(v string) *QueryItemResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryItemResponse) SetResultCode(v string) *QueryItemResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryItemResponse) SetResultMsg(v string) *QueryItemResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryItemResponse) SetTotalCount(v int64) *QueryItemResponse {
	s.TotalCount = &v
	return s
}

func (s *QueryItemResponse) SetData(v []*Item) *QueryItemResponse {
	s.Data = v
	return s
}

type CreateItemRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// model_id
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 注意，data_json是一个MAP<String,Object>，但OP不支持MAP，，用户需要用Json序列化成字符串。不正确的格式将会报错
	DataJson *string `json:"data_json,omitempty" xml:"data_json,omitempty" require:"true"`
}

func (s CreateItemRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateItemRequest) GoString() string {
	return s.String()
}

func (s *CreateItemRequest) SetAuthToken(v string) *CreateItemRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateItemRequest) SetModelId(v string) *CreateItemRequest {
	s.ModelId = &v
	return s
}

func (s *CreateItemRequest) SetName(v string) *CreateItemRequest {
	s.Name = &v
	return s
}

func (s *CreateItemRequest) SetId(v string) *CreateItemRequest {
	s.Id = &v
	return s
}

func (s *CreateItemRequest) SetDataJson(v string) *CreateItemRequest {
	s.DataJson = &v
	return s
}

type CreateItemResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateItemResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateItemResponse) GoString() string {
	return s.String()
}

func (s *CreateItemResponse) SetReqMsgId(v string) *CreateItemResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateItemResponse) SetResultCode(v string) *CreateItemResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateItemResponse) SetResultMsg(v string) *CreateItemResponse {
	s.ResultMsg = &v
	return s
}

type UpdateItemRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// model_id
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
	// 同创建的data
	DataJson *string `json:"data_json,omitempty" xml:"data_json,omitempty" require:"true"`
}

func (s UpdateItemRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateItemRequest) GoString() string {
	return s.String()
}

func (s *UpdateItemRequest) SetAuthToken(v string) *UpdateItemRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateItemRequest) SetId(v string) *UpdateItemRequest {
	s.Id = &v
	return s
}

func (s *UpdateItemRequest) SetModelId(v string) *UpdateItemRequest {
	s.ModelId = &v
	return s
}

func (s *UpdateItemRequest) SetDataJson(v string) *UpdateItemRequest {
	s.DataJson = &v
	return s
}

type UpdateItemResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateItemResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateItemResponse) GoString() string {
	return s.String()
}

func (s *UpdateItemResponse) SetReqMsgId(v string) *UpdateItemResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateItemResponse) SetResultCode(v string) *UpdateItemResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateItemResponse) SetResultMsg(v string) *UpdateItemResponse {
	s.ResultMsg = &v
	return s
}

type DeleteItemRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// model_id
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
}

func (s DeleteItemRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteItemRequest) GoString() string {
	return s.String()
}

func (s *DeleteItemRequest) SetAuthToken(v string) *DeleteItemRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteItemRequest) SetId(v string) *DeleteItemRequest {
	s.Id = &v
	return s
}

func (s *DeleteItemRequest) SetModelId(v string) *DeleteItemRequest {
	s.ModelId = &v
	return s
}

type DeleteItemResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteItemResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteItemResponse) GoString() string {
	return s.String()
}

func (s *DeleteItemResponse) SetReqMsgId(v string) *DeleteItemResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteItemResponse) SetResultCode(v string) *DeleteItemResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteItemResponse) SetResultMsg(v string) *DeleteItemResponse {
	s.ResultMsg = &v
	return s
}

type GetItemRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// model_id
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
}

func (s GetItemRequest) String() string {
	return tea.Prettify(s)
}

func (s GetItemRequest) GoString() string {
	return s.String()
}

func (s *GetItemRequest) SetAuthToken(v string) *GetItemRequest {
	s.AuthToken = &v
	return s
}

func (s *GetItemRequest) SetId(v string) *GetItemRequest {
	s.Id = &v
	return s
}

func (s *GetItemRequest) SetModelId(v string) *GetItemRequest {
	s.ModelId = &v
	return s
}

type GetItemResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *Item `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetItemResponse) String() string {
	return tea.Prettify(s)
}

func (s GetItemResponse) GoString() string {
	return s.String()
}

func (s *GetItemResponse) SetReqMsgId(v string) *GetItemResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetItemResponse) SetResultCode(v string) *GetItemResponse {
	s.ResultCode = &v
	return s
}

func (s *GetItemResponse) SetResultMsg(v string) *GetItemResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetItemResponse) SetData(v *Item) *GetItemResponse {
	s.Data = v
	return s
}

type GetModelRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 要获取的模型的唯一标识
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty" require:"true"`
}

func (s GetModelRequest) String() string {
	return tea.Prettify(s)
}

func (s GetModelRequest) GoString() string {
	return s.String()
}

func (s *GetModelRequest) SetAuthToken(v string) *GetModelRequest {
	s.AuthToken = &v
	return s
}

func (s *GetModelRequest) SetUniqueId(v string) *GetModelRequest {
	s.UniqueId = &v
	return s
}

type GetModelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 获取到的模型
	Data *Model `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetModelResponse) String() string {
	return tea.Prettify(s)
}

func (s GetModelResponse) GoString() string {
	return s.String()
}

func (s *GetModelResponse) SetReqMsgId(v string) *GetModelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetModelResponse) SetResultCode(v string) *GetModelResponse {
	s.ResultCode = &v
	return s
}

func (s *GetModelResponse) SetResultMsg(v string) *GetModelResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetModelResponse) SetData(v *Model) *GetModelResponse {
	s.Data = v
	return s
}

type QueryModelRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s QueryModelRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryModelRequest) GoString() string {
	return s.String()
}

func (s *QueryModelRequest) SetAuthToken(v string) *QueryModelRequest {
	s.AuthToken = &v
	return s
}

type QueryModelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询到的模型列表
	Data []*Model `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryModelResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryModelResponse) GoString() string {
	return s.String()
}

func (s *QueryModelResponse) SetReqMsgId(v string) *QueryModelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryModelResponse) SetResultCode(v string) *QueryModelResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryModelResponse) SetResultMsg(v string) *QueryModelResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryModelResponse) SetData(v []*Model) *QueryModelResponse {
	s.Data = v
	return s
}

type CreateModelRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 唯一标识（全局唯一）
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty" require:"true"`
	// 名称（全局唯一）
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 所属模型分组的唯一标识
	CategoryId *string `json:"category_id,omitempty" xml:"category_id,omitempty" require:"true"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 用于前端展示排序，数字越大优先级越高，默认为 0
	Priority *int64 `json:"priority,omitempty" xml:"priority,omitempty"`
	// 用于前端展示的扩展属性
	DisplayProperties []*MapStringToStringEntry `json:"display_properties,omitempty" xml:"display_properties,omitempty" type:"Repeated"`
}

func (s CreateModelRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateModelRequest) GoString() string {
	return s.String()
}

func (s *CreateModelRequest) SetAuthToken(v string) *CreateModelRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateModelRequest) SetUniqueId(v string) *CreateModelRequest {
	s.UniqueId = &v
	return s
}

func (s *CreateModelRequest) SetName(v string) *CreateModelRequest {
	s.Name = &v
	return s
}

func (s *CreateModelRequest) SetCategoryId(v string) *CreateModelRequest {
	s.CategoryId = &v
	return s
}

func (s *CreateModelRequest) SetDescription(v string) *CreateModelRequest {
	s.Description = &v
	return s
}

func (s *CreateModelRequest) SetPriority(v int64) *CreateModelRequest {
	s.Priority = &v
	return s
}

func (s *CreateModelRequest) SetDisplayProperties(v []*MapStringToStringEntry) *CreateModelRequest {
	s.DisplayProperties = v
	return s
}

type CreateModelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 创建出的模型
	Data *Model `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateModelResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateModelResponse) GoString() string {
	return s.String()
}

func (s *CreateModelResponse) SetReqMsgId(v string) *CreateModelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateModelResponse) SetResultCode(v string) *CreateModelResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateModelResponse) SetResultMsg(v string) *CreateModelResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateModelResponse) SetData(v *Model) *CreateModelResponse {
	s.Data = v
	return s
}

type UpdateModelRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 要更新的模型的唯一标识
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty" require:"true"`
	// 名称（全局唯一）
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 用于前端展示排序，数字越大优先级越高，默认为 0
	Priority *int64 `json:"priority,omitempty" xml:"priority,omitempty"`
	// 用于前端展示的扩展属性
	DisplayProperties []*MapStringToStringEntry `json:"display_properties,omitempty" xml:"display_properties,omitempty" type:"Repeated"`
}

func (s UpdateModelRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateModelRequest) GoString() string {
	return s.String()
}

func (s *UpdateModelRequest) SetAuthToken(v string) *UpdateModelRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateModelRequest) SetUniqueId(v string) *UpdateModelRequest {
	s.UniqueId = &v
	return s
}

func (s *UpdateModelRequest) SetName(v string) *UpdateModelRequest {
	s.Name = &v
	return s
}

func (s *UpdateModelRequest) SetDescription(v string) *UpdateModelRequest {
	s.Description = &v
	return s
}

func (s *UpdateModelRequest) SetPriority(v int64) *UpdateModelRequest {
	s.Priority = &v
	return s
}

func (s *UpdateModelRequest) SetDisplayProperties(v []*MapStringToStringEntry) *UpdateModelRequest {
	s.DisplayProperties = v
	return s
}

type UpdateModelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 更新后的模型
	Data *Model `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateModelResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateModelResponse) GoString() string {
	return s.String()
}

func (s *UpdateModelResponse) SetReqMsgId(v string) *UpdateModelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateModelResponse) SetResultCode(v string) *UpdateModelResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateModelResponse) SetResultMsg(v string) *UpdateModelResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateModelResponse) SetData(v *Model) *UpdateModelResponse {
	s.Data = v
	return s
}

type GetModelcategoryRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 要获取的模型分组的唯一标识
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty" require:"true"`
}

func (s GetModelcategoryRequest) String() string {
	return tea.Prettify(s)
}

func (s GetModelcategoryRequest) GoString() string {
	return s.String()
}

func (s *GetModelcategoryRequest) SetAuthToken(v string) *GetModelcategoryRequest {
	s.AuthToken = &v
	return s
}

func (s *GetModelcategoryRequest) SetUniqueId(v string) *GetModelcategoryRequest {
	s.UniqueId = &v
	return s
}

type GetModelcategoryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 获取到的模型分组
	Data *ModelCategory `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetModelcategoryResponse) String() string {
	return tea.Prettify(s)
}

func (s GetModelcategoryResponse) GoString() string {
	return s.String()
}

func (s *GetModelcategoryResponse) SetReqMsgId(v string) *GetModelcategoryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetModelcategoryResponse) SetResultCode(v string) *GetModelcategoryResponse {
	s.ResultCode = &v
	return s
}

func (s *GetModelcategoryResponse) SetResultMsg(v string) *GetModelcategoryResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetModelcategoryResponse) SetData(v *ModelCategory) *GetModelcategoryResponse {
	s.Data = v
	return s
}

type DeleteModelRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 要删除的模型的唯一标识
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty" require:"true"`
}

func (s DeleteModelRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteModelRequest) GoString() string {
	return s.String()
}

func (s *DeleteModelRequest) SetAuthToken(v string) *DeleteModelRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteModelRequest) SetUniqueId(v string) *DeleteModelRequest {
	s.UniqueId = &v
	return s
}

type DeleteModelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteModelResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteModelResponse) GoString() string {
	return s.String()
}

func (s *DeleteModelResponse) SetReqMsgId(v string) *DeleteModelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteModelResponse) SetResultCode(v string) *DeleteModelResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteModelResponse) SetResultMsg(v string) *DeleteModelResponse {
	s.ResultMsg = &v
	return s
}

type QueryModelcategoryRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s QueryModelcategoryRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryModelcategoryRequest) GoString() string {
	return s.String()
}

func (s *QueryModelcategoryRequest) SetAuthToken(v string) *QueryModelcategoryRequest {
	s.AuthToken = &v
	return s
}

type QueryModelcategoryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询到的模型分组列表
	Data []*ModelCategory `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryModelcategoryResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryModelcategoryResponse) GoString() string {
	return s.String()
}

func (s *QueryModelcategoryResponse) SetReqMsgId(v string) *QueryModelcategoryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryModelcategoryResponse) SetResultCode(v string) *QueryModelcategoryResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryModelcategoryResponse) SetResultMsg(v string) *QueryModelcategoryResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryModelcategoryResponse) SetData(v []*ModelCategory) *QueryModelcategoryResponse {
	s.Data = v
	return s
}

type CreateModelcategoryRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 唯一标识（全局唯一）
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty" require:"true"`
	// 名称（全局唯一）
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s CreateModelcategoryRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateModelcategoryRequest) GoString() string {
	return s.String()
}

func (s *CreateModelcategoryRequest) SetAuthToken(v string) *CreateModelcategoryRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateModelcategoryRequest) SetUniqueId(v string) *CreateModelcategoryRequest {
	s.UniqueId = &v
	return s
}

func (s *CreateModelcategoryRequest) SetName(v string) *CreateModelcategoryRequest {
	s.Name = &v
	return s
}

type CreateModelcategoryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 创建出的模型分组
	Data *ModelCategory `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateModelcategoryResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateModelcategoryResponse) GoString() string {
	return s.String()
}

func (s *CreateModelcategoryResponse) SetReqMsgId(v string) *CreateModelcategoryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateModelcategoryResponse) SetResultCode(v string) *CreateModelcategoryResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateModelcategoryResponse) SetResultMsg(v string) *CreateModelcategoryResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateModelcategoryResponse) SetData(v *ModelCategory) *CreateModelcategoryResponse {
	s.Data = v
	return s
}

type UpdateModelcategoryRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 要更新的模型分组的唯一标识
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty" require:"true"`
	// 名称（全局唯一）
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s UpdateModelcategoryRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateModelcategoryRequest) GoString() string {
	return s.String()
}

func (s *UpdateModelcategoryRequest) SetAuthToken(v string) *UpdateModelcategoryRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateModelcategoryRequest) SetUniqueId(v string) *UpdateModelcategoryRequest {
	s.UniqueId = &v
	return s
}

func (s *UpdateModelcategoryRequest) SetName(v string) *UpdateModelcategoryRequest {
	s.Name = &v
	return s
}

type UpdateModelcategoryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 更新后的模型分组
	Data *ModelCategory `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateModelcategoryResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateModelcategoryResponse) GoString() string {
	return s.String()
}

func (s *UpdateModelcategoryResponse) SetReqMsgId(v string) *UpdateModelcategoryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateModelcategoryResponse) SetResultCode(v string) *UpdateModelcategoryResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateModelcategoryResponse) SetResultMsg(v string) *UpdateModelcategoryResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateModelcategoryResponse) SetData(v *ModelCategory) *UpdateModelcategoryResponse {
	s.Data = v
	return s
}

type DeleteModelcategoryRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 要删除的模型分组的唯一标识
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty" require:"true"`
}

func (s DeleteModelcategoryRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteModelcategoryRequest) GoString() string {
	return s.String()
}

func (s *DeleteModelcategoryRequest) SetAuthToken(v string) *DeleteModelcategoryRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteModelcategoryRequest) SetUniqueId(v string) *DeleteModelcategoryRequest {
	s.UniqueId = &v
	return s
}

type DeleteModelcategoryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteModelcategoryResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteModelcategoryResponse) GoString() string {
	return s.String()
}

func (s *DeleteModelcategoryResponse) SetReqMsgId(v string) *DeleteModelcategoryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteModelcategoryResponse) SetResultCode(v string) *DeleteModelcategoryResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteModelcategoryResponse) SetResultMsg(v string) *DeleteModelcategoryResponse {
	s.ResultMsg = &v
	return s
}

type GetModelAttributeRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 字段所属模型的唯一标识
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
	// 要获取的字段的唯一标识
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty" require:"true"`
}

func (s GetModelAttributeRequest) String() string {
	return tea.Prettify(s)
}

func (s GetModelAttributeRequest) GoString() string {
	return s.String()
}

func (s *GetModelAttributeRequest) SetAuthToken(v string) *GetModelAttributeRequest {
	s.AuthToken = &v
	return s
}

func (s *GetModelAttributeRequest) SetModelId(v string) *GetModelAttributeRequest {
	s.ModelId = &v
	return s
}

func (s *GetModelAttributeRequest) SetUniqueId(v string) *GetModelAttributeRequest {
	s.UniqueId = &v
	return s
}

type GetModelAttributeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 获取到的字段
	Data *Attribute `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetModelAttributeResponse) String() string {
	return tea.Prettify(s)
}

func (s GetModelAttributeResponse) GoString() string {
	return s.String()
}

func (s *GetModelAttributeResponse) SetReqMsgId(v string) *GetModelAttributeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetModelAttributeResponse) SetResultCode(v string) *GetModelAttributeResponse {
	s.ResultCode = &v
	return s
}

func (s *GetModelAttributeResponse) SetResultMsg(v string) *GetModelAttributeResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetModelAttributeResponse) SetData(v *Attribute) *GetModelAttributeResponse {
	s.Data = v
	return s
}

type QueryModelAttributeRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 所属模型的唯一标识
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty"`
}

func (s QueryModelAttributeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryModelAttributeRequest) GoString() string {
	return s.String()
}

func (s *QueryModelAttributeRequest) SetAuthToken(v string) *QueryModelAttributeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryModelAttributeRequest) SetModelId(v string) *QueryModelAttributeRequest {
	s.ModelId = &v
	return s
}

type QueryModelAttributeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询到的模型字段列表
	Data []*Attribute `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryModelAttributeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryModelAttributeResponse) GoString() string {
	return s.String()
}

func (s *QueryModelAttributeResponse) SetReqMsgId(v string) *QueryModelAttributeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryModelAttributeResponse) SetResultCode(v string) *QueryModelAttributeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryModelAttributeResponse) SetResultMsg(v string) *QueryModelAttributeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryModelAttributeResponse) SetData(v []*Attribute) *QueryModelAttributeResponse {
	s.Data = v
	return s
}

type CreateModelAttributeRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 所属模型的唯一标识
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
	// 唯一标识（所属模型内唯一）
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty" require:"true"`
	// 名称（所属模型内唯一）
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 类型【取值范围：INTEGER，LONG，DOUBLE，FLOAT，BOOLEAN，STRING，DATE，DATETIME，ENUM，ARRAY】
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 是否只读
	Readonly *bool `json:"readonly,omitempty" xml:"readonly,omitempty" require:"true"`
	// 是否必填
	Required *bool `json:"required,omitempty" xml:"required,omitempty" require:"true"`
	// 用于前端展示排序，数字越大优先级越高，默认为 0
	Priority *int64 `json:"priority,omitempty" xml:"priority,omitempty"`
	// 用于前端展示的扩展属性
	DisplayProperties []*MapStringToStringEntry `json:"display_properties,omitempty" xml:"display_properties,omitempty" type:"Repeated"`
	// group_id
	GroupId *string `json:"group_id,omitempty" xml:"group_id,omitempty" require:"true"`
}

func (s CreateModelAttributeRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateModelAttributeRequest) GoString() string {
	return s.String()
}

func (s *CreateModelAttributeRequest) SetAuthToken(v string) *CreateModelAttributeRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateModelAttributeRequest) SetModelId(v string) *CreateModelAttributeRequest {
	s.ModelId = &v
	return s
}

func (s *CreateModelAttributeRequest) SetUniqueId(v string) *CreateModelAttributeRequest {
	s.UniqueId = &v
	return s
}

func (s *CreateModelAttributeRequest) SetName(v string) *CreateModelAttributeRequest {
	s.Name = &v
	return s
}

func (s *CreateModelAttributeRequest) SetDescription(v string) *CreateModelAttributeRequest {
	s.Description = &v
	return s
}

func (s *CreateModelAttributeRequest) SetType(v string) *CreateModelAttributeRequest {
	s.Type = &v
	return s
}

func (s *CreateModelAttributeRequest) SetReadonly(v bool) *CreateModelAttributeRequest {
	s.Readonly = &v
	return s
}

func (s *CreateModelAttributeRequest) SetRequired(v bool) *CreateModelAttributeRequest {
	s.Required = &v
	return s
}

func (s *CreateModelAttributeRequest) SetPriority(v int64) *CreateModelAttributeRequest {
	s.Priority = &v
	return s
}

func (s *CreateModelAttributeRequest) SetDisplayProperties(v []*MapStringToStringEntry) *CreateModelAttributeRequest {
	s.DisplayProperties = v
	return s
}

func (s *CreateModelAttributeRequest) SetGroupId(v string) *CreateModelAttributeRequest {
	s.GroupId = &v
	return s
}

type CreateModelAttributeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 创建出的模型字段
	Data *Attribute `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateModelAttributeResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateModelAttributeResponse) GoString() string {
	return s.String()
}

func (s *CreateModelAttributeResponse) SetReqMsgId(v string) *CreateModelAttributeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateModelAttributeResponse) SetResultCode(v string) *CreateModelAttributeResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateModelAttributeResponse) SetResultMsg(v string) *CreateModelAttributeResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateModelAttributeResponse) SetData(v *Attribute) *CreateModelAttributeResponse {
	s.Data = v
	return s
}

type UpdateModelAttributeRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 要更新的模型字段所属模型的唯一标识
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
	// 要更新的模型字段的唯一标识
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty" require:"true"`
	// 名称（所属模型内唯一）
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 是否只读
	Readonly *bool `json:"readonly,omitempty" xml:"readonly,omitempty" require:"true"`
	// 是否必填
	Required *bool `json:"required,omitempty" xml:"required,omitempty" require:"true"`
	// 用于前端展示排序，数字越大优先级越高，默认为 0
	Priority *int64 `json:"priority,omitempty" xml:"priority,omitempty"`
	// 用于前端展示的扩展属性
	DisplayProperties []*MapStringToStringEntry `json:"display_properties,omitempty" xml:"display_properties,omitempty" type:"Repeated"`
}

func (s UpdateModelAttributeRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateModelAttributeRequest) GoString() string {
	return s.String()
}

func (s *UpdateModelAttributeRequest) SetAuthToken(v string) *UpdateModelAttributeRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateModelAttributeRequest) SetModelId(v string) *UpdateModelAttributeRequest {
	s.ModelId = &v
	return s
}

func (s *UpdateModelAttributeRequest) SetUniqueId(v string) *UpdateModelAttributeRequest {
	s.UniqueId = &v
	return s
}

func (s *UpdateModelAttributeRequest) SetName(v string) *UpdateModelAttributeRequest {
	s.Name = &v
	return s
}

func (s *UpdateModelAttributeRequest) SetDescription(v string) *UpdateModelAttributeRequest {
	s.Description = &v
	return s
}

func (s *UpdateModelAttributeRequest) SetReadonly(v bool) *UpdateModelAttributeRequest {
	s.Readonly = &v
	return s
}

func (s *UpdateModelAttributeRequest) SetRequired(v bool) *UpdateModelAttributeRequest {
	s.Required = &v
	return s
}

func (s *UpdateModelAttributeRequest) SetPriority(v int64) *UpdateModelAttributeRequest {
	s.Priority = &v
	return s
}

func (s *UpdateModelAttributeRequest) SetDisplayProperties(v []*MapStringToStringEntry) *UpdateModelAttributeRequest {
	s.DisplayProperties = v
	return s
}

type UpdateModelAttributeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 更新后的模型字段
	Data *Attribute `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateModelAttributeResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateModelAttributeResponse) GoString() string {
	return s.String()
}

func (s *UpdateModelAttributeResponse) SetReqMsgId(v string) *UpdateModelAttributeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateModelAttributeResponse) SetResultCode(v string) *UpdateModelAttributeResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateModelAttributeResponse) SetResultMsg(v string) *UpdateModelAttributeResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateModelAttributeResponse) SetData(v *Attribute) *UpdateModelAttributeResponse {
	s.Data = v
	return s
}

type DeleteModelAttributeRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 要删除的模型字段所属模型的唯一标识
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
	// 要删除的模型字段的唯一标识
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty" require:"true"`
}

func (s DeleteModelAttributeRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteModelAttributeRequest) GoString() string {
	return s.String()
}

func (s *DeleteModelAttributeRequest) SetAuthToken(v string) *DeleteModelAttributeRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteModelAttributeRequest) SetModelId(v string) *DeleteModelAttributeRequest {
	s.ModelId = &v
	return s
}

func (s *DeleteModelAttributeRequest) SetUniqueId(v string) *DeleteModelAttributeRequest {
	s.UniqueId = &v
	return s
}

type DeleteModelAttributeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteModelAttributeResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteModelAttributeResponse) GoString() string {
	return s.String()
}

func (s *DeleteModelAttributeResponse) SetReqMsgId(v string) *DeleteModelAttributeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteModelAttributeResponse) SetResultCode(v string) *DeleteModelAttributeResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteModelAttributeResponse) SetResultMsg(v string) *DeleteModelAttributeResponse {
	s.ResultMsg = &v
	return s
}

type ExistItemIdRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// model_id
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
}

func (s ExistItemIdRequest) String() string {
	return tea.Prettify(s)
}

func (s ExistItemIdRequest) GoString() string {
	return s.String()
}

func (s *ExistItemIdRequest) SetAuthToken(v string) *ExistItemIdRequest {
	s.AuthToken = &v
	return s
}

func (s *ExistItemIdRequest) SetModelId(v string) *ExistItemIdRequest {
	s.ModelId = &v
	return s
}

func (s *ExistItemIdRequest) SetId(v string) *ExistItemIdRequest {
	s.Id = &v
	return s
}

type ExistItemIdResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// exsit
	Exsit *bool `json:"exsit,omitempty" xml:"exsit,omitempty"`
}

func (s ExistItemIdResponse) String() string {
	return tea.Prettify(s)
}

func (s ExistItemIdResponse) GoString() string {
	return s.String()
}

func (s *ExistItemIdResponse) SetReqMsgId(v string) *ExistItemIdResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExistItemIdResponse) SetResultCode(v string) *ExistItemIdResponse {
	s.ResultCode = &v
	return s
}

func (s *ExistItemIdResponse) SetResultMsg(v string) *ExistItemIdResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExistItemIdResponse) SetExsit(v bool) *ExistItemIdResponse {
	s.Exsit = &v
	return s
}

type QueryItemRelationsRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 目标模型id
	DestinationModelId *string `json:"destination_model_id,omitempty" xml:"destination_model_id,omitempty" require:"true"`
	// item_id
	ItemId *string `json:"item_id,omitempty" xml:"item_id,omitempty" require:"true"`
	// 1
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// page_number
	PageNumber *int64 `json:"page_number,omitempty" xml:"page_number,omitempty" require:"true"`
	// display_fields
	DisplayFields []*string `json:"display_fields,omitempty" xml:"display_fields,omitempty" type:"Repeated"`
	// 上钻表示查询拓扑目标为自己的上级资源，反之则是查询以自己为源目标的下级资源
	DrillUp *bool `json:"drill_up,omitempty" xml:"drill_up,omitempty"`
}

func (s QueryItemRelationsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryItemRelationsRequest) GoString() string {
	return s.String()
}

func (s *QueryItemRelationsRequest) SetAuthToken(v string) *QueryItemRelationsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryItemRelationsRequest) SetDestinationModelId(v string) *QueryItemRelationsRequest {
	s.DestinationModelId = &v
	return s
}

func (s *QueryItemRelationsRequest) SetItemId(v string) *QueryItemRelationsRequest {
	s.ItemId = &v
	return s
}

func (s *QueryItemRelationsRequest) SetPageSize(v int64) *QueryItemRelationsRequest {
	s.PageSize = &v
	return s
}

func (s *QueryItemRelationsRequest) SetPageNumber(v int64) *QueryItemRelationsRequest {
	s.PageNumber = &v
	return s
}

func (s *QueryItemRelationsRequest) SetDisplayFields(v []*string) *QueryItemRelationsRequest {
	s.DisplayFields = v
	return s
}

func (s *QueryItemRelationsRequest) SetDrillUp(v bool) *QueryItemRelationsRequest {
	s.DrillUp = &v
	return s
}

type QueryItemRelationsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*Item `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// total_count
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s QueryItemRelationsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryItemRelationsResponse) GoString() string {
	return s.String()
}

func (s *QueryItemRelationsResponse) SetReqMsgId(v string) *QueryItemRelationsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryItemRelationsResponse) SetResultCode(v string) *QueryItemRelationsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryItemRelationsResponse) SetResultMsg(v string) *QueryItemRelationsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryItemRelationsResponse) SetData(v []*Item) *QueryItemRelationsResponse {
	s.Data = v
	return s
}

func (s *QueryItemRelationsResponse) SetTotalCount(v int64) *QueryItemRelationsResponse {
	s.TotalCount = &v
	return s
}

type ImportItemRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// model_id
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
}

func (s ImportItemRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportItemRequest) GoString() string {
	return s.String()
}

func (s *ImportItemRequest) SetAuthToken(v string) *ImportItemRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportItemRequest) SetModelId(v string) *ImportItemRequest {
	s.ModelId = &v
	return s
}

type ImportItemResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// succeed_count
	SucceedCount *int64 `json:"succeed_count,omitempty" xml:"succeed_count,omitempty"`
	// failed_count
	FailedCount *int64 `json:"failed_count,omitempty" xml:"failed_count,omitempty"`
	// failed_reasons
	FailedReasons []*string `json:"failed_reasons,omitempty" xml:"failed_reasons,omitempty" type:"Repeated"`
}

func (s ImportItemResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportItemResponse) GoString() string {
	return s.String()
}

func (s *ImportItemResponse) SetReqMsgId(v string) *ImportItemResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportItemResponse) SetResultCode(v string) *ImportItemResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportItemResponse) SetResultMsg(v string) *ImportItemResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportItemResponse) SetSucceedCount(v int64) *ImportItemResponse {
	s.SucceedCount = &v
	return s
}

func (s *ImportItemResponse) SetFailedCount(v int64) *ImportItemResponse {
	s.FailedCount = &v
	return s
}

func (s *ImportItemResponse) SetFailedReasons(v []*string) *ImportItemResponse {
	s.FailedReasons = v
	return s
}

type ExportItemRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// model_id
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
	// display_fields
	DisplayFields []*string `json:"display_fields,omitempty" xml:"display_fields,omitempty" require:"true" type:"Repeated"`
	// conditions
	Conditions []*Condition `json:"conditions,omitempty" xml:"conditions,omitempty" type:"Repeated"`
}

func (s ExportItemRequest) String() string {
	return tea.Prettify(s)
}

func (s ExportItemRequest) GoString() string {
	return s.String()
}

func (s *ExportItemRequest) SetAuthToken(v string) *ExportItemRequest {
	s.AuthToken = &v
	return s
}

func (s *ExportItemRequest) SetModelId(v string) *ExportItemRequest {
	s.ModelId = &v
	return s
}

func (s *ExportItemRequest) SetDisplayFields(v []*string) *ExportItemRequest {
	s.DisplayFields = v
	return s
}

func (s *ExportItemRequest) SetConditions(v []*Condition) *ExportItemRequest {
	s.Conditions = v
	return s
}

type ExportItemResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// file_source
	FileSource *string `json:"file_source,omitempty" xml:"file_source,omitempty"`
}

func (s ExportItemResponse) String() string {
	return tea.Prettify(s)
}

func (s ExportItemResponse) GoString() string {
	return s.String()
}

func (s *ExportItemResponse) SetReqMsgId(v string) *ExportItemResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExportItemResponse) SetResultCode(v string) *ExportItemResponse {
	s.ResultCode = &v
	return s
}

func (s *ExportItemResponse) SetResultMsg(v string) *ExportItemResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExportItemResponse) SetFileSource(v string) *ExportItemResponse {
	s.FileSource = &v
	return s
}

type GetModelrelationshipRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 要获取的模型关联的目标模型的唯一标识
	DestinationModelId *string `json:"destination_model_id,omitempty" xml:"destination_model_id,omitempty" require:"true"`
	// 要获取的模型关联的源模型的唯一标识
	SourceModelId *string `json:"source_model_id,omitempty" xml:"source_model_id,omitempty" require:"true"`
}

func (s GetModelrelationshipRequest) String() string {
	return tea.Prettify(s)
}

func (s GetModelrelationshipRequest) GoString() string {
	return s.String()
}

func (s *GetModelrelationshipRequest) SetAuthToken(v string) *GetModelrelationshipRequest {
	s.AuthToken = &v
	return s
}

func (s *GetModelrelationshipRequest) SetDestinationModelId(v string) *GetModelrelationshipRequest {
	s.DestinationModelId = &v
	return s
}

func (s *GetModelrelationshipRequest) SetSourceModelId(v string) *GetModelrelationshipRequest {
	s.SourceModelId = &v
	return s
}

type GetModelrelationshipResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 获取到的模型关联
	Data *ModelRelationship `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetModelrelationshipResponse) String() string {
	return tea.Prettify(s)
}

func (s GetModelrelationshipResponse) GoString() string {
	return s.String()
}

func (s *GetModelrelationshipResponse) SetReqMsgId(v string) *GetModelrelationshipResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetModelrelationshipResponse) SetResultCode(v string) *GetModelrelationshipResponse {
	s.ResultCode = &v
	return s
}

func (s *GetModelrelationshipResponse) SetResultMsg(v string) *GetModelrelationshipResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetModelrelationshipResponse) SetData(v *ModelRelationship) *GetModelrelationshipResponse {
	s.Data = v
	return s
}

type QueryModelrelationshipRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 目标模型的唯一标识
	DestinationModelId *string `json:"destination_model_id,omitempty" xml:"destination_model_id,omitempty"`
}

func (s QueryModelrelationshipRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryModelrelationshipRequest) GoString() string {
	return s.String()
}

func (s *QueryModelrelationshipRequest) SetAuthToken(v string) *QueryModelrelationshipRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryModelrelationshipRequest) SetDestinationModelId(v string) *QueryModelrelationshipRequest {
	s.DestinationModelId = &v
	return s
}

type QueryModelrelationshipResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询到的模型关联列表
	Data []*ModelRelationship `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryModelrelationshipResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryModelrelationshipResponse) GoString() string {
	return s.String()
}

func (s *QueryModelrelationshipResponse) SetReqMsgId(v string) *QueryModelrelationshipResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryModelrelationshipResponse) SetResultCode(v string) *QueryModelrelationshipResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryModelrelationshipResponse) SetResultMsg(v string) *QueryModelrelationshipResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryModelrelationshipResponse) SetData(v []*ModelRelationship) *QueryModelrelationshipResponse {
	s.Data = v
	return s
}

type CreateModelrelationshipRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 目标模型的唯一标识
	DestinationModelId *string `json:"destination_model_id,omitempty" xml:"destination_model_id,omitempty" require:"true"`
	// 源模型的唯一标识（目标模型内唯一）
	SourceModelId *string `json:"source_model_id,omitempty" xml:"source_model_id,omitempty" require:"true"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 关联类型【取值范围：ONE_TO_ONE，ONE_TO_MANY】
	RelationType *string `json:"relation_type,omitempty" xml:"relation_type,omitempty" require:"true"`
}

func (s CreateModelrelationshipRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateModelrelationshipRequest) GoString() string {
	return s.String()
}

func (s *CreateModelrelationshipRequest) SetAuthToken(v string) *CreateModelrelationshipRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateModelrelationshipRequest) SetDestinationModelId(v string) *CreateModelrelationshipRequest {
	s.DestinationModelId = &v
	return s
}

func (s *CreateModelrelationshipRequest) SetSourceModelId(v string) *CreateModelrelationshipRequest {
	s.SourceModelId = &v
	return s
}

func (s *CreateModelrelationshipRequest) SetDescription(v string) *CreateModelrelationshipRequest {
	s.Description = &v
	return s
}

func (s *CreateModelrelationshipRequest) SetRelationType(v string) *CreateModelrelationshipRequest {
	s.RelationType = &v
	return s
}

type CreateModelrelationshipResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 创建出的模型关联
	Data *ModelRelationship `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateModelrelationshipResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateModelrelationshipResponse) GoString() string {
	return s.String()
}

func (s *CreateModelrelationshipResponse) SetReqMsgId(v string) *CreateModelrelationshipResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateModelrelationshipResponse) SetResultCode(v string) *CreateModelrelationshipResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateModelrelationshipResponse) SetResultMsg(v string) *CreateModelrelationshipResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateModelrelationshipResponse) SetData(v *ModelRelationship) *CreateModelrelationshipResponse {
	s.Data = v
	return s
}

type UpdateModelrelationshipRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 要更新的模型关联的目标模型的唯一标识
	DestinationModelId *string `json:"destination_model_id,omitempty" xml:"destination_model_id,omitempty" require:"true"`
	// 要更新的模型关联的源模型的唯一标识
	SourceModelId *string `json:"source_model_id,omitempty" xml:"source_model_id,omitempty" require:"true"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
}

func (s UpdateModelrelationshipRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateModelrelationshipRequest) GoString() string {
	return s.String()
}

func (s *UpdateModelrelationshipRequest) SetAuthToken(v string) *UpdateModelrelationshipRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateModelrelationshipRequest) SetDestinationModelId(v string) *UpdateModelrelationshipRequest {
	s.DestinationModelId = &v
	return s
}

func (s *UpdateModelrelationshipRequest) SetSourceModelId(v string) *UpdateModelrelationshipRequest {
	s.SourceModelId = &v
	return s
}

func (s *UpdateModelrelationshipRequest) SetDescription(v string) *UpdateModelrelationshipRequest {
	s.Description = &v
	return s
}

type UpdateModelrelationshipResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 更新后的模型关联
	Data *ModelRelationship `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateModelrelationshipResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateModelrelationshipResponse) GoString() string {
	return s.String()
}

func (s *UpdateModelrelationshipResponse) SetReqMsgId(v string) *UpdateModelrelationshipResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateModelrelationshipResponse) SetResultCode(v string) *UpdateModelrelationshipResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateModelrelationshipResponse) SetResultMsg(v string) *UpdateModelrelationshipResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateModelrelationshipResponse) SetData(v *ModelRelationship) *UpdateModelrelationshipResponse {
	s.Data = v
	return s
}

type DeleteModelrelationshipRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 要删除的模型关联的目标模型的唯一标识
	DestinationModelId *string `json:"destination_model_id,omitempty" xml:"destination_model_id,omitempty" require:"true"`
	// 要删除的模型关联的源模型的唯一标识
	SourceModelId *string `json:"source_model_id,omitempty" xml:"source_model_id,omitempty" require:"true"`
}

func (s DeleteModelrelationshipRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteModelrelationshipRequest) GoString() string {
	return s.String()
}

func (s *DeleteModelrelationshipRequest) SetAuthToken(v string) *DeleteModelrelationshipRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteModelrelationshipRequest) SetDestinationModelId(v string) *DeleteModelrelationshipRequest {
	s.DestinationModelId = &v
	return s
}

func (s *DeleteModelrelationshipRequest) SetSourceModelId(v string) *DeleteModelrelationshipRequest {
	s.SourceModelId = &v
	return s
}

type DeleteModelrelationshipResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteModelrelationshipResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteModelrelationshipResponse) GoString() string {
	return s.String()
}

func (s *DeleteModelrelationshipResponse) SetReqMsgId(v string) *DeleteModelrelationshipResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteModelrelationshipResponse) SetResultCode(v string) *DeleteModelrelationshipResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteModelrelationshipResponse) SetResultMsg(v string) *DeleteModelrelationshipResponse {
	s.ResultMsg = &v
	return s
}

type PullParamRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s PullParamRequest) String() string {
	return tea.Prettify(s)
}

func (s PullParamRequest) GoString() string {
	return s.String()
}

func (s *PullParamRequest) SetAuthToken(v string) *PullParamRequest {
	s.AuthToken = &v
	return s
}

type PullParamResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*SystemParam `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s PullParamResponse) String() string {
	return tea.Prettify(s)
}

func (s PullParamResponse) GoString() string {
	return s.String()
}

func (s *PullParamResponse) SetReqMsgId(v string) *PullParamResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PullParamResponse) SetResultCode(v string) *PullParamResponse {
	s.ResultCode = &v
	return s
}

func (s *PullParamResponse) SetResultMsg(v string) *PullParamResponse {
	s.ResultMsg = &v
	return s
}

func (s *PullParamResponse) SetData(v []*SystemParam) *PullParamResponse {
	s.Data = v
	return s
}

type PushParamRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 更新的键值
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// 由于OP不支持MAP，需要使用json字符串
	ValueJson *string `json:"value_json,omitempty" xml:"value_json,omitempty" require:"true"`
	// description
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// value_type
	ValueType *string `json:"value_type,omitempty" xml:"value_type,omitempty" require:"true"`
	// 参数分组
	GroupName *string `json:"group_name,omitempty" xml:"group_name,omitempty" require:"true"`
}

func (s PushParamRequest) String() string {
	return tea.Prettify(s)
}

func (s PushParamRequest) GoString() string {
	return s.String()
}

func (s *PushParamRequest) SetAuthToken(v string) *PushParamRequest {
	s.AuthToken = &v
	return s
}

func (s *PushParamRequest) SetKey(v string) *PushParamRequest {
	s.Key = &v
	return s
}

func (s *PushParamRequest) SetValueJson(v string) *PushParamRequest {
	s.ValueJson = &v
	return s
}

func (s *PushParamRequest) SetDescription(v string) *PushParamRequest {
	s.Description = &v
	return s
}

func (s *PushParamRequest) SetValueType(v string) *PushParamRequest {
	s.ValueType = &v
	return s
}

func (s *PushParamRequest) SetGroupName(v string) *PushParamRequest {
	s.GroupName = &v
	return s
}

type PushParamResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s PushParamResponse) String() string {
	return tea.Prettify(s)
}

func (s PushParamResponse) GoString() string {
	return s.String()
}

func (s *PushParamResponse) SetReqMsgId(v string) *PushParamResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushParamResponse) SetResultCode(v string) *PushParamResponse {
	s.ResultCode = &v
	return s
}

func (s *PushParamResponse) SetResultMsg(v string) *PushParamResponse {
	s.ResultMsg = &v
	return s
}

type CreateAttributegroupRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// display_name
	DisplayName *string `json:"display_name,omitempty" xml:"display_name,omitempty" require:"true"`
	// model_id
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
}

func (s CreateAttributegroupRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAttributegroupRequest) GoString() string {
	return s.String()
}

func (s *CreateAttributegroupRequest) SetAuthToken(v string) *CreateAttributegroupRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAttributegroupRequest) SetDisplayName(v string) *CreateAttributegroupRequest {
	s.DisplayName = &v
	return s
}

func (s *CreateAttributegroupRequest) SetModelId(v string) *CreateAttributegroupRequest {
	s.ModelId = &v
	return s
}

type CreateAttributegroupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateAttributegroupResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAttributegroupResponse) GoString() string {
	return s.String()
}

func (s *CreateAttributegroupResponse) SetReqMsgId(v string) *CreateAttributegroupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAttributegroupResponse) SetResultCode(v string) *CreateAttributegroupResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAttributegroupResponse) SetResultMsg(v string) *CreateAttributegroupResponse {
	s.ResultMsg = &v
	return s
}

type QueryAttributegroupRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// model_id
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
}

func (s QueryAttributegroupRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAttributegroupRequest) GoString() string {
	return s.String()
}

func (s *QueryAttributegroupRequest) SetAuthToken(v string) *QueryAttributegroupRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAttributegroupRequest) SetModelId(v string) *QueryAttributegroupRequest {
	s.ModelId = &v
	return s
}

type QueryAttributegroupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*AttributeGroup `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// total_count
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s QueryAttributegroupResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAttributegroupResponse) GoString() string {
	return s.String()
}

func (s *QueryAttributegroupResponse) SetReqMsgId(v string) *QueryAttributegroupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAttributegroupResponse) SetResultCode(v string) *QueryAttributegroupResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAttributegroupResponse) SetResultMsg(v string) *QueryAttributegroupResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAttributegroupResponse) SetData(v []*AttributeGroup) *QueryAttributegroupResponse {
	s.Data = v
	return s
}

func (s *QueryAttributegroupResponse) SetTotalCount(v int64) *QueryAttributegroupResponse {
	s.TotalCount = &v
	return s
}

type DeleteAttributegroupRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
}

func (s DeleteAttributegroupRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteAttributegroupRequest) GoString() string {
	return s.String()
}

func (s *DeleteAttributegroupRequest) SetAuthToken(v string) *DeleteAttributegroupRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteAttributegroupRequest) SetId(v string) *DeleteAttributegroupRequest {
	s.Id = &v
	return s
}

type DeleteAttributegroupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteAttributegroupResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteAttributegroupResponse) GoString() string {
	return s.String()
}

func (s *DeleteAttributegroupResponse) SetReqMsgId(v string) *DeleteAttributegroupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteAttributegroupResponse) SetResultCode(v string) *DeleteAttributegroupResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteAttributegroupResponse) SetResultMsg(v string) *DeleteAttributegroupResponse {
	s.ResultMsg = &v
	return s
}

type UpdateAttributegroupRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// display_name
	DisplayName *string `json:"display_name,omitempty" xml:"display_name,omitempty" require:"true"`
}

func (s UpdateAttributegroupRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAttributegroupRequest) GoString() string {
	return s.String()
}

func (s *UpdateAttributegroupRequest) SetAuthToken(v string) *UpdateAttributegroupRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAttributegroupRequest) SetId(v string) *UpdateAttributegroupRequest {
	s.Id = &v
	return s
}

func (s *UpdateAttributegroupRequest) SetDisplayName(v string) *UpdateAttributegroupRequest {
	s.DisplayName = &v
	return s
}

type UpdateAttributegroupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAttributegroupResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAttributegroupResponse) GoString() string {
	return s.String()
}

func (s *UpdateAttributegroupResponse) SetReqMsgId(v string) *UpdateAttributegroupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAttributegroupResponse) SetResultCode(v string) *UpdateAttributegroupResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAttributegroupResponse) SetResultMsg(v string) *UpdateAttributegroupResponse {
	s.ResultMsg = &v
	return s
}

type QueryAuditlogRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 操作者
	OperatorName *string `json:"operator_name,omitempty" xml:"operator_name,omitempty"`
	// resource_type
	ResourceType *string `json:"resource_type,omitempty" xml:"resource_type,omitempty"`
	// resource_ids
	ResourceIds []*string `json:"resource_ids,omitempty" xml:"resource_ids,omitempty" type:"Repeated"`
	// begin_time
	BeginTime *string `json:"begin_time,omitempty" xml:"begin_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// end_time
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// page_size
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// page_number
	PageNumber *int64 `json:"page_number,omitempty" xml:"page_number,omitempty" require:"true"`
}

func (s QueryAuditlogRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAuditlogRequest) GoString() string {
	return s.String()
}

func (s *QueryAuditlogRequest) SetAuthToken(v string) *QueryAuditlogRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAuditlogRequest) SetOperatorName(v string) *QueryAuditlogRequest {
	s.OperatorName = &v
	return s
}

func (s *QueryAuditlogRequest) SetResourceType(v string) *QueryAuditlogRequest {
	s.ResourceType = &v
	return s
}

func (s *QueryAuditlogRequest) SetResourceIds(v []*string) *QueryAuditlogRequest {
	s.ResourceIds = v
	return s
}

func (s *QueryAuditlogRequest) SetBeginTime(v string) *QueryAuditlogRequest {
	s.BeginTime = &v
	return s
}

func (s *QueryAuditlogRequest) SetEndTime(v string) *QueryAuditlogRequest {
	s.EndTime = &v
	return s
}

func (s *QueryAuditlogRequest) SetPageSize(v int64) *QueryAuditlogRequest {
	s.PageSize = &v
	return s
}

func (s *QueryAuditlogRequest) SetPageNumber(v int64) *QueryAuditlogRequest {
	s.PageNumber = &v
	return s
}

type QueryAuditlogResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*AuditLog `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// total_count
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s QueryAuditlogResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAuditlogResponse) GoString() string {
	return s.String()
}

func (s *QueryAuditlogResponse) SetReqMsgId(v string) *QueryAuditlogResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAuditlogResponse) SetResultCode(v string) *QueryAuditlogResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAuditlogResponse) SetResultMsg(v string) *QueryAuditlogResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAuditlogResponse) SetData(v []*AuditLog) *QueryAuditlogResponse {
	s.Data = v
	return s
}

func (s *QueryAuditlogResponse) SetTotalCount(v int64) *QueryAuditlogResponse {
	s.TotalCount = &v
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
				"sdk_version":      tea.String("1.0.27"),
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
 * Description: 查询资源
 * Summary: 查询资源
 */
func (client *Client) QueryItem(request *QueryItemRequest) (_result *QueryItemResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryItemResponse{}
	_body, _err := client.QueryItemEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询资源
 * Summary: 查询资源
 */
func (client *Client) QueryItemEx(request *QueryItemRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryItemResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryItemResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.item.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建资源
 * Summary: 创建资源
 */
func (client *Client) CreateItem(request *CreateItemRequest) (_result *CreateItemResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateItemResponse{}
	_body, _err := client.CreateItemEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建资源
 * Summary: 创建资源
 */
func (client *Client) CreateItemEx(request *CreateItemRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateItemResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateItemResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.item.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 全量更新资源属性，不传的属性如果原本有值会被覆盖成空值
 * Summary: 更新资源属性
 */
func (client *Client) UpdateItem(request *UpdateItemRequest) (_result *UpdateItemResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateItemResponse{}
	_body, _err := client.UpdateItemEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 全量更新资源属性，不传的属性如果原本有值会被覆盖成空值
 * Summary: 更新资源属性
 */
func (client *Client) UpdateItemEx(request *UpdateItemRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateItemResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateItemResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.item.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除单个资源
 * Summary: 删除单个资源
 */
func (client *Client) DeleteItem(request *DeleteItemRequest) (_result *DeleteItemResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteItemResponse{}
	_body, _err := client.DeleteItemEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除单个资源
 * Summary: 删除单个资源
 */
func (client *Client) DeleteItemEx(request *DeleteItemRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteItemResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteItemResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.item.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取单个Item的详细信息
 * Summary: 获取单个Item的详细信息
 */
func (client *Client) GetItem(request *GetItemRequest) (_result *GetItemResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetItemResponse{}
	_body, _err := client.GetItemEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取单个Item的详细信息
 * Summary: 获取单个Item的详细信息
 */
func (client *Client) GetItemEx(request *GetItemRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetItemResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetItemResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.item.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取单个模型
 * Summary: 获取单个模型
 */
func (client *Client) GetModel(request *GetModelRequest) (_result *GetModelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetModelResponse{}
	_body, _err := client.GetModelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取单个模型
 * Summary: 获取单个模型
 */
func (client *Client) GetModelEx(request *GetModelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetModelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetModelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.model.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询模型
 * Summary: 查询模型
 */
func (client *Client) QueryModel(request *QueryModelRequest) (_result *QueryModelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryModelResponse{}
	_body, _err := client.QueryModelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询模型
 * Summary: 查询模型
 */
func (client *Client) QueryModelEx(request *QueryModelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryModelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryModelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.model.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建模型
 * Summary: 创建模型
 */
func (client *Client) CreateModel(request *CreateModelRequest) (_result *CreateModelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateModelResponse{}
	_body, _err := client.CreateModelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建模型
 * Summary: 创建模型
 */
func (client *Client) CreateModelEx(request *CreateModelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateModelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateModelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.model.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新模型
 * Summary: 更新模型
 */
func (client *Client) UpdateModel(request *UpdateModelRequest) (_result *UpdateModelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateModelResponse{}
	_body, _err := client.UpdateModelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新模型
 * Summary: 更新模型
 */
func (client *Client) UpdateModelEx(request *UpdateModelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateModelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateModelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.model.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取单个模型分组
 * Summary: 获取单个模型分组
 */
func (client *Client) GetModelcategory(request *GetModelcategoryRequest) (_result *GetModelcategoryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetModelcategoryResponse{}
	_body, _err := client.GetModelcategoryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取单个模型分组
 * Summary: 获取单个模型分组
 */
func (client *Client) GetModelcategoryEx(request *GetModelcategoryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetModelcategoryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetModelcategoryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.modelcategory.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除模型
 * Summary: 删除模型
 */
func (client *Client) DeleteModel(request *DeleteModelRequest) (_result *DeleteModelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteModelResponse{}
	_body, _err := client.DeleteModelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除模型
 * Summary: 删除模型
 */
func (client *Client) DeleteModelEx(request *DeleteModelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteModelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteModelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.model.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询模型分组
 * Summary: 查询模型分组
 */
func (client *Client) QueryModelcategory(request *QueryModelcategoryRequest) (_result *QueryModelcategoryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryModelcategoryResponse{}
	_body, _err := client.QueryModelcategoryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询模型分组
 * Summary: 查询模型分组
 */
func (client *Client) QueryModelcategoryEx(request *QueryModelcategoryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryModelcategoryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryModelcategoryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.modelcategory.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建模型分组
 * Summary: 创建模型分组
 */
func (client *Client) CreateModelcategory(request *CreateModelcategoryRequest) (_result *CreateModelcategoryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateModelcategoryResponse{}
	_body, _err := client.CreateModelcategoryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建模型分组
 * Summary: 创建模型分组
 */
func (client *Client) CreateModelcategoryEx(request *CreateModelcategoryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateModelcategoryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateModelcategoryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.modelcategory.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新模型分组
 * Summary: 更新模型分组
 */
func (client *Client) UpdateModelcategory(request *UpdateModelcategoryRequest) (_result *UpdateModelcategoryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateModelcategoryResponse{}
	_body, _err := client.UpdateModelcategoryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新模型分组
 * Summary: 更新模型分组
 */
func (client *Client) UpdateModelcategoryEx(request *UpdateModelcategoryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateModelcategoryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateModelcategoryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.modelcategory.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除模型分组
 * Summary: 删除模型分组
 */
func (client *Client) DeleteModelcategory(request *DeleteModelcategoryRequest) (_result *DeleteModelcategoryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteModelcategoryResponse{}
	_body, _err := client.DeleteModelcategoryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除模型分组
 * Summary: 删除模型分组
 */
func (client *Client) DeleteModelcategoryEx(request *DeleteModelcategoryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteModelcategoryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteModelcategoryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.modelcategory.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取单个模型字段
 * Summary: 获取单个模型字段
 */
func (client *Client) GetModelAttribute(request *GetModelAttributeRequest) (_result *GetModelAttributeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetModelAttributeResponse{}
	_body, _err := client.GetModelAttributeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取单个模型字段
 * Summary: 获取单个模型字段
 */
func (client *Client) GetModelAttributeEx(request *GetModelAttributeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetModelAttributeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetModelAttributeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.model.attribute.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询模型字段
 * Summary: 查询模型字段
 */
func (client *Client) QueryModelAttribute(request *QueryModelAttributeRequest) (_result *QueryModelAttributeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryModelAttributeResponse{}
	_body, _err := client.QueryModelAttributeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询模型字段
 * Summary: 查询模型字段
 */
func (client *Client) QueryModelAttributeEx(request *QueryModelAttributeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryModelAttributeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryModelAttributeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.model.attribute.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建模型字段
 * Summary: 创建模型字段
 */
func (client *Client) CreateModelAttribute(request *CreateModelAttributeRequest) (_result *CreateModelAttributeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateModelAttributeResponse{}
	_body, _err := client.CreateModelAttributeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建模型字段
 * Summary: 创建模型字段
 */
func (client *Client) CreateModelAttributeEx(request *CreateModelAttributeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateModelAttributeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateModelAttributeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.model.attribute.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新模型字段
 * Summary: 更新模型字段
 */
func (client *Client) UpdateModelAttribute(request *UpdateModelAttributeRequest) (_result *UpdateModelAttributeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateModelAttributeResponse{}
	_body, _err := client.UpdateModelAttributeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新模型字段
 * Summary: 更新模型字段
 */
func (client *Client) UpdateModelAttributeEx(request *UpdateModelAttributeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateModelAttributeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateModelAttributeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.model.attribute.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除模型字段
 * Summary: 删除模型字段
 */
func (client *Client) DeleteModelAttribute(request *DeleteModelAttributeRequest) (_result *DeleteModelAttributeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteModelAttributeResponse{}
	_body, _err := client.DeleteModelAttributeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除模型字段
 * Summary: 删除模型字段
 */
func (client *Client) DeleteModelAttributeEx(request *DeleteModelAttributeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteModelAttributeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteModelAttributeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.model.attribute.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: id是否存在
 * Summary: id是否存在
 */
func (client *Client) ExistItemId(request *ExistItemIdRequest) (_result *ExistItemIdResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExistItemIdResponse{}
	_body, _err := client.ExistItemIdEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: id是否存在
 * Summary: id是否存在
 */
func (client *Client) ExistItemIdEx(request *ExistItemIdRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExistItemIdResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExistItemIdResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.item.id.exist"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询当前item的关系资源，注意区分上钻和下钻
 * Summary: 查询当前item的关系资源
 */
func (client *Client) QueryItemRelations(request *QueryItemRelationsRequest) (_result *QueryItemRelationsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryItemRelationsResponse{}
	_body, _err := client.QueryItemRelationsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询当前item的关系资源，注意区分上钻和下钻
 * Summary: 查询当前item的关系资源
 */
func (client *Client) QueryItemRelationsEx(request *QueryItemRelationsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryItemRelationsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryItemRelationsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.item.relations.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 导入ITEM
 * Summary: 导入ITEM
 */
func (client *Client) ImportItem(request *ImportItemRequest) (_result *ImportItemResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportItemResponse{}
	_body, _err := client.ImportItemEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 导入ITEM
 * Summary: 导入ITEM
 */
func (client *Client) ImportItemEx(request *ImportItemRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportItemResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportItemResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.item.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 导出资源
 * Summary: 导出资源
 */
func (client *Client) ExportItem(request *ExportItemRequest) (_result *ExportItemResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExportItemResponse{}
	_body, _err := client.ExportItemEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 导出资源
 * Summary: 导出资源
 */
func (client *Client) ExportItemEx(request *ExportItemRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExportItemResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExportItemResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.item.export"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取单个模型关联
 * Summary: 获取单个模型关联
 */
func (client *Client) GetModelrelationship(request *GetModelrelationshipRequest) (_result *GetModelrelationshipResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetModelrelationshipResponse{}
	_body, _err := client.GetModelrelationshipEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取单个模型关联
 * Summary: 获取单个模型关联
 */
func (client *Client) GetModelrelationshipEx(request *GetModelrelationshipRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetModelrelationshipResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetModelrelationshipResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.modelrelationship.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询模型关联
 * Summary: 查询模型关联
 */
func (client *Client) QueryModelrelationship(request *QueryModelrelationshipRequest) (_result *QueryModelrelationshipResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryModelrelationshipResponse{}
	_body, _err := client.QueryModelrelationshipEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询模型关联
 * Summary: 查询模型关联
 */
func (client *Client) QueryModelrelationshipEx(request *QueryModelrelationshipRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryModelrelationshipResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryModelrelationshipResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.modelrelationship.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建模型关联
 * Summary: 创建模型关联
 */
func (client *Client) CreateModelrelationship(request *CreateModelrelationshipRequest) (_result *CreateModelrelationshipResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateModelrelationshipResponse{}
	_body, _err := client.CreateModelrelationshipEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建模型关联
 * Summary: 创建模型关联
 */
func (client *Client) CreateModelrelationshipEx(request *CreateModelrelationshipRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateModelrelationshipResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateModelrelationshipResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.modelrelationship.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新模型关联
 * Summary: 更新模型关联
 */
func (client *Client) UpdateModelrelationship(request *UpdateModelrelationshipRequest) (_result *UpdateModelrelationshipResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateModelrelationshipResponse{}
	_body, _err := client.UpdateModelrelationshipEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新模型关联
 * Summary: 更新模型关联
 */
func (client *Client) UpdateModelrelationshipEx(request *UpdateModelrelationshipRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateModelrelationshipResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateModelrelationshipResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.modelrelationship.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除模型关联
 * Summary: 删除模型关联
 */
func (client *Client) DeleteModelrelationship(request *DeleteModelrelationshipRequest) (_result *DeleteModelrelationshipResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteModelrelationshipResponse{}
	_body, _err := client.DeleteModelrelationshipEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除模型关联
 * Summary: 删除模型关联
 */
func (client *Client) DeleteModelrelationshipEx(request *DeleteModelrelationshipRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteModelrelationshipResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteModelrelationshipResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.modelrelationship.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 拉取当前环境的参数表
 * Summary: 拉取当前环境的参数表
 */
func (client *Client) PullParam(request *PullParamRequest) (_result *PullParamResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PullParamResponse{}
	_body, _err := client.PullParamEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 拉取当前环境的参数表
 * Summary: 拉取当前环境的参数表
 */
func (client *Client) PullParamEx(request *PullParamRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PullParamResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PullParamResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.param.pull"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新配置信息
 * Summary: 更新配置信息
 */
func (client *Client) PushParam(request *PushParamRequest) (_result *PushParamResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushParamResponse{}
	_body, _err := client.PushParamEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新配置信息
 * Summary: 更新配置信息
 */
func (client *Client) PushParamEx(request *PushParamRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushParamResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushParamResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.param.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建字段组
 * Summary: 创建字段组
 */
func (client *Client) CreateAttributegroup(request *CreateAttributegroupRequest) (_result *CreateAttributegroupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAttributegroupResponse{}
	_body, _err := client.CreateAttributegroupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建字段组
 * Summary: 创建字段组
 */
func (client *Client) CreateAttributegroupEx(request *CreateAttributegroupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAttributegroupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAttributegroupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.attributegroup.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询字段组
 * Summary: 查询字段组
 */
func (client *Client) QueryAttributegroup(request *QueryAttributegroupRequest) (_result *QueryAttributegroupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAttributegroupResponse{}
	_body, _err := client.QueryAttributegroupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询字段组
 * Summary: 查询字段组
 */
func (client *Client) QueryAttributegroupEx(request *QueryAttributegroupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAttributegroupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAttributegroupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.attributegroup.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除字段组
 * Summary: 删除字段组
 */
func (client *Client) DeleteAttributegroup(request *DeleteAttributegroupRequest) (_result *DeleteAttributegroupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteAttributegroupResponse{}
	_body, _err := client.DeleteAttributegroupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除字段组
 * Summary: 删除字段组
 */
func (client *Client) DeleteAttributegroupEx(request *DeleteAttributegroupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteAttributegroupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteAttributegroupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.attributegroup.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新字段组
 * Summary: 更新字段组
 */
func (client *Client) UpdateAttributegroup(request *UpdateAttributegroupRequest) (_result *UpdateAttributegroupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateAttributegroupResponse{}
	_body, _err := client.UpdateAttributegroupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新字段组
 * Summary: 更新字段组
 */
func (client *Client) UpdateAttributegroupEx(request *UpdateAttributegroupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateAttributegroupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAttributegroupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.attributegroup.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 审计日志查询
 * Summary: 审计日志查询
 */
func (client *Client) QueryAuditlog(request *QueryAuditlogRequest) (_result *QueryAuditlogResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAuditlogResponse{}
	_body, _err := client.QueryAuditlogEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 审计日志查询
 * Summary: 审计日志查询
 */
func (client *Client) QueryAuditlogEx(request *QueryAuditlogRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAuditlogResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAuditlogResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cmdb.auditlog.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
