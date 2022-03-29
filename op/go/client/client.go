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

// 数组元素类型
type ListItem struct {
	// 参数类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 结构体名称
	StructName *string `json:"struct_name,omitempty" xml:"struct_name,omitempty"`
	// 参数示例
	Example *string `json:"example,omitempty" xml:"example,omitempty"`
	// 整数最大值
	Maximum *int64 `json:"maximum,omitempty" xml:"maximum,omitempty"`
	// 是否包括最大值
	ExclusiveMaximum *bool `json:"exclusive_maximum,omitempty" xml:"exclusive_maximum,omitempty"`
	// 最小值
	Minimum *int64 `json:"minimum,omitempty" xml:"minimum,omitempty"`
	// 是否包括最小值
	ExclusiveMinimum *bool `json:"exclusive_minimum,omitempty" xml:"exclusive_minimum,omitempty"`
	// 最大长度
	MaxLength *int64 `json:"max_length,omitempty" xml:"max_length,omitempty"`
	// 最小长度
	MinLength *int64 `json:"min_length,omitempty" xml:"min_length,omitempty"`
	// 模式
	Pattern *string `json:"pattern,omitempty" xml:"pattern,omitempty"`
	// 最大元素个数
	MaxItems *int64 `json:"max_items,omitempty" xml:"max_items,omitempty"`
	// 最小元素数目
	MinItems *int64 `json:"min_items,omitempty" xml:"min_items,omitempty"`
	// 枚举类型
	EnumValues *string `json:"enum_values,omitempty" xml:"enum_values,omitempty"`
}

func (s ListItem) String() string {
	return tea.Prettify(s)
}

func (s ListItem) GoString() string {
	return s.String()
}

func (s *ListItem) SetType(v string) *ListItem {
	s.Type = &v
	return s
}

func (s *ListItem) SetStructName(v string) *ListItem {
	s.StructName = &v
	return s
}

func (s *ListItem) SetExample(v string) *ListItem {
	s.Example = &v
	return s
}

func (s *ListItem) SetMaximum(v int64) *ListItem {
	s.Maximum = &v
	return s
}

func (s *ListItem) SetExclusiveMaximum(v bool) *ListItem {
	s.ExclusiveMaximum = &v
	return s
}

func (s *ListItem) SetMinimum(v int64) *ListItem {
	s.Minimum = &v
	return s
}

func (s *ListItem) SetExclusiveMinimum(v bool) *ListItem {
	s.ExclusiveMinimum = &v
	return s
}

func (s *ListItem) SetMaxLength(v int64) *ListItem {
	s.MaxLength = &v
	return s
}

func (s *ListItem) SetMinLength(v int64) *ListItem {
	s.MinLength = &v
	return s
}

func (s *ListItem) SetPattern(v string) *ListItem {
	s.Pattern = &v
	return s
}

func (s *ListItem) SetMaxItems(v int64) *ListItem {
	s.MaxItems = &v
	return s
}

func (s *ListItem) SetMinItems(v int64) *ListItem {
	s.MinItems = &v
	return s
}

func (s *ListItem) SetEnumValues(v string) *ListItem {
	s.EnumValues = &v
	return s
}

// 参数模型
type ParamModal struct {
	// api meta数据id
	ApiMetaId *string `json:"api_meta_id,omitempty" xml:"api_meta_id,omitempty" require:"true"`
	// api版本id
	ApiVersionId *string `json:"api_version_id,omitempty" xml:"api_version_id,omitempty" require:"true"`
	// 数组参数
	ListItem []*ListItem `json:"list_item,omitempty" xml:"list_item,omitempty" type:"Repeated"`
	// 结构体id
	FieldStructId *string `json:"field_struct_id,omitempty" xml:"field_struct_id,omitempty"`
	// 结构体名称
	FieldStructName *string `json:"field_struct_name,omitempty" xml:"field_struct_name,omitempty"`
	// 参数示例
	Example *string `json:"example,omitempty" xml:"example,omitempty"`
	// 是否必填
	Required *bool `json:"required,omitempty" xml:"required,omitempty" require:"true"`
	// 最大整数长度
	Maximum *int64 `json:"maximum,omitempty" xml:"maximum,omitempty"`
	// 是否包括最大值
	ExclusiveMaximum *bool `json:"exclusive_maximum,omitempty" xml:"exclusive_maximum,omitempty"`
	// 整数的最小值
	Minimum *int64 `json:"minimum,omitempty" xml:"minimum,omitempty"`
	// 是否排除最小值
	ExclusiveMinimum *bool `json:"exclusive_minimum,omitempty" xml:"exclusive_minimum,omitempty"`
	// 字符串的最大长度
	MaxLength *int64 `json:"max_length,omitempty" xml:"max_length,omitempty"`
	// 字符串的最小长度
	MinLength *int64 `json:"min_length,omitempty" xml:"min_length,omitempty"`
	// 模式
	Pattern *string `json:"pattern,omitempty" xml:"pattern,omitempty"`
	// 最大元素数目
	MaxItems *int64 `json:"max_items,omitempty" xml:"max_items,omitempty"`
	// 最小元素数目
	MinItems *int64 `json:"min_items,omitempty" xml:"min_items,omitempty"`
	// 枚举值
	EnumValues *string `json:"enum_values,omitempty" xml:"enum_values,omitempty"`
	// 参数名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 参数类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 参数描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 参数特性
	Feature *string `json:"feature,omitempty" xml:"feature,omitempty" require:"true"`
}

func (s ParamModal) String() string {
	return tea.Prettify(s)
}

func (s ParamModal) GoString() string {
	return s.String()
}

func (s *ParamModal) SetApiMetaId(v string) *ParamModal {
	s.ApiMetaId = &v
	return s
}

func (s *ParamModal) SetApiVersionId(v string) *ParamModal {
	s.ApiVersionId = &v
	return s
}

func (s *ParamModal) SetListItem(v []*ListItem) *ParamModal {
	s.ListItem = v
	return s
}

func (s *ParamModal) SetFieldStructId(v string) *ParamModal {
	s.FieldStructId = &v
	return s
}

func (s *ParamModal) SetFieldStructName(v string) *ParamModal {
	s.FieldStructName = &v
	return s
}

func (s *ParamModal) SetExample(v string) *ParamModal {
	s.Example = &v
	return s
}

func (s *ParamModal) SetRequired(v bool) *ParamModal {
	s.Required = &v
	return s
}

func (s *ParamModal) SetMaximum(v int64) *ParamModal {
	s.Maximum = &v
	return s
}

func (s *ParamModal) SetExclusiveMaximum(v bool) *ParamModal {
	s.ExclusiveMaximum = &v
	return s
}

func (s *ParamModal) SetMinimum(v int64) *ParamModal {
	s.Minimum = &v
	return s
}

func (s *ParamModal) SetExclusiveMinimum(v bool) *ParamModal {
	s.ExclusiveMinimum = &v
	return s
}

func (s *ParamModal) SetMaxLength(v int64) *ParamModal {
	s.MaxLength = &v
	return s
}

func (s *ParamModal) SetMinLength(v int64) *ParamModal {
	s.MinLength = &v
	return s
}

func (s *ParamModal) SetPattern(v string) *ParamModal {
	s.Pattern = &v
	return s
}

func (s *ParamModal) SetMaxItems(v int64) *ParamModal {
	s.MaxItems = &v
	return s
}

func (s *ParamModal) SetMinItems(v int64) *ParamModal {
	s.MinItems = &v
	return s
}

func (s *ParamModal) SetEnumValues(v string) *ParamModal {
	s.EnumValues = &v
	return s
}

func (s *ParamModal) SetName(v string) *ParamModal {
	s.Name = &v
	return s
}

func (s *ParamModal) SetType(v string) *ParamModal {
	s.Type = &v
	return s
}

func (s *ParamModal) SetDescription(v string) *ParamModal {
	s.Description = &v
	return s
}

func (s *ParamModal) SetFeature(v string) *ParamModal {
	s.Feature = &v
	return s
}

// api结果码
type ResultCodeRequest struct {
	// api版本
	ApiVersion *string `json:"api_version,omitempty" xml:"api_version,omitempty" require:"true"`
	// api名称
	ApiName *string `json:"api_name,omitempty" xml:"api_name,omitempty" require:"true"`
	// 外部返回结果码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 内部返回结果码
	InternalCode *string `json:"internal_code,omitempty" xml:"internal_code,omitempty" require:"true"`
	// 结果码描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 错误解决方法
	Resolution *string `json:"resolution,omitempty" xml:"resolution,omitempty"`
}

func (s ResultCodeRequest) String() string {
	return tea.Prettify(s)
}

func (s ResultCodeRequest) GoString() string {
	return s.String()
}

func (s *ResultCodeRequest) SetApiVersion(v string) *ResultCodeRequest {
	s.ApiVersion = &v
	return s
}

func (s *ResultCodeRequest) SetApiName(v string) *ResultCodeRequest {
	s.ApiName = &v
	return s
}

func (s *ResultCodeRequest) SetCode(v string) *ResultCodeRequest {
	s.Code = &v
	return s
}

func (s *ResultCodeRequest) SetInternalCode(v string) *ResultCodeRequest {
	s.InternalCode = &v
	return s
}

func (s *ResultCodeRequest) SetDescription(v string) *ResultCodeRequest {
	s.Description = &v
	return s
}

func (s *ResultCodeRequest) SetResolution(v string) *ResultCodeRequest {
	s.Resolution = &v
	return s
}

// api请求参数体
type ApiParamRequest struct {
	// api名称
	ApiName *string `json:"api_name,omitempty" xml:"api_name,omitempty" require:"true"`
	// api版本
	ApiVersion *string `json:"api_version,omitempty" xml:"api_version,omitempty" require:"true"`
	// 参数名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 目标名称
	TargetName *string `json:"target_name,omitempty" xml:"target_name,omitempty"`
	// 参数类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 链表信息
	ListItem []*ListItem `json:"list_item,omitempty" xml:"list_item,omitempty" type:"Repeated"`
	// 参数示例
	Example *string `json:"example,omitempty" xml:"example,omitempty"`
	// 参数描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 结构体名称
	StructName *string `json:"struct_name,omitempty" xml:"struct_name,omitempty"`
	// 最大值
	Maximum *int64 `json:"maximum,omitempty" xml:"maximum,omitempty"`
	// 最小值
	Minimum *int64 `json:"minimum,omitempty" xml:"minimum,omitempty"`
	// 最大长度
	MaxLength *int64 `json:"max_length,omitempty" xml:"max_length,omitempty"`
	// 最小长度
	MinLength *int64 `json:"min_length,omitempty" xml:"min_length,omitempty"`
	// 是否必填
	Required *bool `json:"required,omitempty" xml:"required,omitempty" require:"true"`
	// 特性
	Feature *string `json:"feature,omitempty" xml:"feature,omitempty" require:"true"`
}

func (s ApiParamRequest) String() string {
	return tea.Prettify(s)
}

func (s ApiParamRequest) GoString() string {
	return s.String()
}

func (s *ApiParamRequest) SetApiName(v string) *ApiParamRequest {
	s.ApiName = &v
	return s
}

func (s *ApiParamRequest) SetApiVersion(v string) *ApiParamRequest {
	s.ApiVersion = &v
	return s
}

func (s *ApiParamRequest) SetName(v string) *ApiParamRequest {
	s.Name = &v
	return s
}

func (s *ApiParamRequest) SetTargetName(v string) *ApiParamRequest {
	s.TargetName = &v
	return s
}

func (s *ApiParamRequest) SetType(v string) *ApiParamRequest {
	s.Type = &v
	return s
}

func (s *ApiParamRequest) SetListItem(v []*ListItem) *ApiParamRequest {
	s.ListItem = v
	return s
}

func (s *ApiParamRequest) SetExample(v string) *ApiParamRequest {
	s.Example = &v
	return s
}

func (s *ApiParamRequest) SetDescription(v string) *ApiParamRequest {
	s.Description = &v
	return s
}

func (s *ApiParamRequest) SetStructName(v string) *ApiParamRequest {
	s.StructName = &v
	return s
}

func (s *ApiParamRequest) SetMaximum(v int64) *ApiParamRequest {
	s.Maximum = &v
	return s
}

func (s *ApiParamRequest) SetMinimum(v int64) *ApiParamRequest {
	s.Minimum = &v
	return s
}

func (s *ApiParamRequest) SetMaxLength(v int64) *ApiParamRequest {
	s.MaxLength = &v
	return s
}

func (s *ApiParamRequest) SetMinLength(v int64) *ApiParamRequest {
	s.MinLength = &v
	return s
}

func (s *ApiParamRequest) SetRequired(v bool) *ApiParamRequest {
	s.Required = &v
	return s
}

func (s *ApiParamRequest) SetFeature(v string) *ApiParamRequest {
	s.Feature = &v
	return s
}

// api参数信息
type ApiParamInfo struct {
	// api名字
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// api类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 示例
	Example *string `json:"example,omitempty" xml:"example,omitempty" require:"true"`
	// api描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 结构体名称
	StructName *string `json:"struct_name,omitempty" xml:"struct_name,omitempty" require:"true"`
	// 最大数字
	Maximum *int64 `json:"maximum,omitempty" xml:"maximum,omitempty" require:"true"`
	// 最小数字
	Minimum *int64 `json:"minimum,omitempty" xml:"minimum,omitempty" require:"true"`
	// 字符串最大长度
	MaxLength *int64 `json:"max_length,omitempty" xml:"max_length,omitempty" require:"true"`
	// 最小长度
	MinLength *bool `json:"min_length,omitempty" xml:"min_length,omitempty" require:"true"`
	//  是否支持传输文件
	FileTransfer *bool `json:"file_transfer,omitempty" xml:"file_transfer,omitempty" require:"true"`
	// 是否为必填字段
	Required *bool `json:"required,omitempty" xml:"required,omitempty" require:"true"`
}

func (s ApiParamInfo) String() string {
	return tea.Prettify(s)
}

func (s ApiParamInfo) GoString() string {
	return s.String()
}

func (s *ApiParamInfo) SetName(v string) *ApiParamInfo {
	s.Name = &v
	return s
}

func (s *ApiParamInfo) SetType(v string) *ApiParamInfo {
	s.Type = &v
	return s
}

func (s *ApiParamInfo) SetExample(v string) *ApiParamInfo {
	s.Example = &v
	return s
}

func (s *ApiParamInfo) SetDescription(v string) *ApiParamInfo {
	s.Description = &v
	return s
}

func (s *ApiParamInfo) SetStructName(v string) *ApiParamInfo {
	s.StructName = &v
	return s
}

func (s *ApiParamInfo) SetMaximum(v int64) *ApiParamInfo {
	s.Maximum = &v
	return s
}

func (s *ApiParamInfo) SetMinimum(v int64) *ApiParamInfo {
	s.Minimum = &v
	return s
}

func (s *ApiParamInfo) SetMaxLength(v int64) *ApiParamInfo {
	s.MaxLength = &v
	return s
}

func (s *ApiParamInfo) SetMinLength(v bool) *ApiParamInfo {
	s.MinLength = &v
	return s
}

func (s *ApiParamInfo) SetFileTransfer(v bool) *ApiParamInfo {
	s.FileTransfer = &v
	return s
}

func (s *ApiParamInfo) SetRequired(v bool) *ApiParamInfo {
	s.Required = &v
	return s
}

// api返回结果
type ApiResultCodeInfo struct {
	// 返回结果码
	InternalCode *string `json:"internal_code,omitempty" xml:"internal_code,omitempty" require:"true"`
	// 外部结果码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 返回结果描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 返回结果码解决方案
	Resolution *string `json:"resolution,omitempty" xml:"resolution,omitempty" require:"true"`
}

func (s ApiResultCodeInfo) String() string {
	return tea.Prettify(s)
}

func (s ApiResultCodeInfo) GoString() string {
	return s.String()
}

func (s *ApiResultCodeInfo) SetInternalCode(v string) *ApiResultCodeInfo {
	s.InternalCode = &v
	return s
}

func (s *ApiResultCodeInfo) SetCode(v string) *ApiResultCodeInfo {
	s.Code = &v
	return s
}

func (s *ApiResultCodeInfo) SetDescription(v string) *ApiResultCodeInfo {
	s.Description = &v
	return s
}

func (s *ApiResultCodeInfo) SetResolution(v string) *ApiResultCodeInfo {
	s.Resolution = &v
	return s
}

// k-v对
type KeyValuePair struct {
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// value
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
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

// api分组枚举
type ApiGroupTypeEnum struct {
	// API分组类型
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// api分组描述
	Ddescription *string `json:"ddescription,omitempty" xml:"ddescription,omitempty"`
}

func (s ApiGroupTypeEnum) String() string {
	return tea.Prettify(s)
}

func (s ApiGroupTypeEnum) GoString() string {
	return s.String()
}

func (s *ApiGroupTypeEnum) SetCode(v string) *ApiGroupTypeEnum {
	s.Code = &v
	return s
}

func (s *ApiGroupTypeEnum) SetDdescription(v string) *ApiGroupTypeEnum {
	s.Ddescription = &v
	return s
}

// Api状态
type StatusEnum struct {
	// api状态码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// api状态码描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
}

func (s StatusEnum) String() string {
	return tea.Prettify(s)
}

func (s StatusEnum) GoString() string {
	return s.String()
}

func (s *StatusEnum) SetCode(v string) *StatusEnum {
	s.Code = &v
	return s
}

func (s *StatusEnum) SetDescription(v string) *StatusEnum {
	s.Description = &v
	return s
}

// 结果码
type ResultCode struct {
	// meta数据id
	ApiMetaId *string `json:"api_meta_id,omitempty" xml:"api_meta_id,omitempty" require:"true"`
	// api版本id
	ApiVersionId *string `json:"api_version_id,omitempty" xml:"api_version_id,omitempty" require:"true"`
	// 结果码
	InternalCode *string `json:"internal_code,omitempty" xml:"internal_code,omitempty" require:"true"`
	// 外部结果码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 返回结果描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 解决错误办法
	Resolution *string `json:"resolution,omitempty" xml:"resolution,omitempty" require:"true"`
}

func (s ResultCode) String() string {
	return tea.Prettify(s)
}

func (s ResultCode) GoString() string {
	return s.String()
}

func (s *ResultCode) SetApiMetaId(v string) *ResultCode {
	s.ApiMetaId = &v
	return s
}

func (s *ResultCode) SetApiVersionId(v string) *ResultCode {
	s.ApiVersionId = &v
	return s
}

func (s *ResultCode) SetInternalCode(v string) *ResultCode {
	s.InternalCode = &v
	return s
}

func (s *ResultCode) SetCode(v string) *ResultCode {
	s.Code = &v
	return s
}

func (s *ResultCode) SetDescription(v string) *ResultCode {
	s.Description = &v
	return s
}

func (s *ResultCode) SetResolution(v string) *ResultCode {
	s.Resolution = &v
	return s
}

// 分组信息
type ApiGroup struct {
	// 分组名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 分组描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// api类型
	Type *ApiGroupTypeEnum `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 产品
	ProviderId *string `json:"provider_id,omitempty" xml:"provider_id,omitempty" require:"true"`
	// 套件id
	ApiSuiteId *string `json:"api_suite_id,omitempty" xml:"api_suite_id,omitempty" require:"true"`
}

func (s ApiGroup) String() string {
	return tea.Prettify(s)
}

func (s ApiGroup) GoString() string {
	return s.String()
}

func (s *ApiGroup) SetName(v string) *ApiGroup {
	s.Name = &v
	return s
}

func (s *ApiGroup) SetDescription(v string) *ApiGroup {
	s.Description = &v
	return s
}

func (s *ApiGroup) SetType(v *ApiGroupTypeEnum) *ApiGroup {
	s.Type = v
	return s
}

func (s *ApiGroup) SetProviderId(v string) *ApiGroup {
	s.ProviderId = &v
	return s
}

func (s *ApiGroup) SetApiSuiteId(v string) *ApiGroup {
	s.ApiSuiteId = &v
	return s
}

// Api基础数据
type ApiMetaRequest struct {
	// 产品码
	ProviderName *string `json:"provider_name,omitempty" xml:"provider_name,omitempty" require:"true"`
	// 套件版本号
	SuiteVersion *string `json:"suite_version,omitempty" xml:"suite_version,omitempty" require:"true"`
	// api分组名称
	GroupName *string `json:"group_name,omitempty" xml:"group_name,omitempty" require:"true"`
	// api名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 新名字
	NewName *string `json:"new_name,omitempty" xml:"new_name,omitempty"`
	// api拥有者
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty" require:"true"`
	// api简介
	Summary *string `json:"summary,omitempty" xml:"summary,omitempty" require:"true"`
	// 是否是内部api
	Internal *bool `json:"internal,omitempty" xml:"internal,omitempty" require:"true"`
	// api版本
	ApiVersion *string `json:"api_version,omitempty" xml:"api_version,omitempty" require:"true"`
	// api描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 是否是第三方代理
	ThirdPartAuth *bool `json:"third_part_auth,omitempty" xml:"third_part_auth,omitempty"`
	// api状态
	StatusEnum *StatusEnum `json:"status_enum,omitempty" xml:"status_enum,omitempty" require:"true"`
	// 扩展参数
	ExtAttribute *string `json:"ext_attribute,omitempty" xml:"ext_attribute,omitempty"`
}

func (s ApiMetaRequest) String() string {
	return tea.Prettify(s)
}

func (s ApiMetaRequest) GoString() string {
	return s.String()
}

func (s *ApiMetaRequest) SetProviderName(v string) *ApiMetaRequest {
	s.ProviderName = &v
	return s
}

func (s *ApiMetaRequest) SetSuiteVersion(v string) *ApiMetaRequest {
	s.SuiteVersion = &v
	return s
}

func (s *ApiMetaRequest) SetGroupName(v string) *ApiMetaRequest {
	s.GroupName = &v
	return s
}

func (s *ApiMetaRequest) SetName(v string) *ApiMetaRequest {
	s.Name = &v
	return s
}

func (s *ApiMetaRequest) SetNewName(v string) *ApiMetaRequest {
	s.NewName = &v
	return s
}

func (s *ApiMetaRequest) SetOwner(v string) *ApiMetaRequest {
	s.Owner = &v
	return s
}

func (s *ApiMetaRequest) SetSummary(v string) *ApiMetaRequest {
	s.Summary = &v
	return s
}

func (s *ApiMetaRequest) SetInternal(v bool) *ApiMetaRequest {
	s.Internal = &v
	return s
}

func (s *ApiMetaRequest) SetApiVersion(v string) *ApiMetaRequest {
	s.ApiVersion = &v
	return s
}

func (s *ApiMetaRequest) SetDescription(v string) *ApiMetaRequest {
	s.Description = &v
	return s
}

func (s *ApiMetaRequest) SetThirdPartAuth(v bool) *ApiMetaRequest {
	s.ThirdPartAuth = &v
	return s
}

func (s *ApiMetaRequest) SetStatusEnum(v *StatusEnum) *ApiMetaRequest {
	s.StatusEnum = v
	return s
}

func (s *ApiMetaRequest) SetExtAttribute(v string) *ApiMetaRequest {
	s.ExtAttribute = &v
	return s
}

// 引入参数
type ImportApiParamsRequest struct {
	// 请求参数
	RequestParams []*ApiParamRequest `json:"request_params,omitempty" xml:"request_params,omitempty" type:"Repeated"`
	// 响应参数
	ResponseParams []*ApiParamRequest `json:"response_params,omitempty" xml:"response_params,omitempty" type:"Repeated"`
	// 返回结果码
	ResultCodes []*ResultCodeRequest `json:"result_codes,omitempty" xml:"result_codes,omitempty" type:"Repeated"`
	// api名称
	ApiName *string `json:"api_name,omitempty" xml:"api_name,omitempty" require:"true"`
	// api版本
	ApiVersion *string `json:"api_version,omitempty" xml:"api_version,omitempty" require:"true"`
}

func (s ImportApiParamsRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportApiParamsRequest) GoString() string {
	return s.String()
}

func (s *ImportApiParamsRequest) SetRequestParams(v []*ApiParamRequest) *ImportApiParamsRequest {
	s.RequestParams = v
	return s
}

func (s *ImportApiParamsRequest) SetResponseParams(v []*ApiParamRequest) *ImportApiParamsRequest {
	s.ResponseParams = v
	return s
}

func (s *ImportApiParamsRequest) SetResultCodes(v []*ResultCodeRequest) *ImportApiParamsRequest {
	s.ResultCodes = v
	return s
}

func (s *ImportApiParamsRequest) SetApiName(v string) *ImportApiParamsRequest {
	s.ApiName = &v
	return s
}

func (s *ImportApiParamsRequest) SetApiVersion(v string) *ImportApiParamsRequest {
	s.ApiVersion = &v
	return s
}

// api前端数据
type ApiFrontendInfo struct {
	// 是否有数据传输
	FileTransfer *bool `json:"file_transfer,omitempty" xml:"file_transfer,omitempty" require:"true"`
	// api参数
	RequestPathParams []*string `json:"request_path_params,omitempty" xml:"request_path_params,omitempty" require:"true" type:"Repeated"`
	// Rest请求的URI，并带有路径参数
	RequestUriWithPathParams *string `json:"request_uri_with_path_params,omitempty" xml:"request_uri_with_path_params,omitempty" require:"true"`
	// api参数
	RequestParams *ApiParamInfo `json:"request_params,omitempty" xml:"request_params,omitempty" require:"true"`
}

func (s ApiFrontendInfo) String() string {
	return tea.Prettify(s)
}

func (s ApiFrontendInfo) GoString() string {
	return s.String()
}

func (s *ApiFrontendInfo) SetFileTransfer(v bool) *ApiFrontendInfo {
	s.FileTransfer = &v
	return s
}

func (s *ApiFrontendInfo) SetRequestPathParams(v []*string) *ApiFrontendInfo {
	s.RequestPathParams = v
	return s
}

func (s *ApiFrontendInfo) SetRequestUriWithPathParams(v string) *ApiFrontendInfo {
	s.RequestUriWithPathParams = &v
	return s
}

func (s *ApiFrontendInfo) SetRequestParams(v *ApiParamInfo) *ApiFrontendInfo {
	s.RequestParams = v
	return s
}

// api套件信息
type ApiSuite struct {
	// 产品码
	ProviderId *string `json:"provider_id,omitempty" xml:"provider_id,omitempty" require:"true"`
	// 套件版本
	Version *string `json:"version,omitempty" xml:"version,omitempty" require:"true"`
	// 是否发布
	Released *bool `json:"released,omitempty" xml:"released,omitempty" require:"true"`
	// 版本号
	VersionAlias *string `json:"version_alias,omitempty" xml:"version_alias,omitempty" require:"true"`
}

func (s ApiSuite) String() string {
	return tea.Prettify(s)
}

func (s ApiSuite) GoString() string {
	return s.String()
}

func (s *ApiSuite) SetProviderId(v string) *ApiSuite {
	s.ProviderId = &v
	return s
}

func (s *ApiSuite) SetVersion(v string) *ApiSuite {
	s.Version = &v
	return s
}

func (s *ApiSuite) SetReleased(v bool) *ApiSuite {
	s.Released = &v
	return s
}

func (s *ApiSuite) SetVersionAlias(v string) *ApiSuite {
	s.VersionAlias = &v
	return s
}

// api后台参数
type ApiBackendInfo struct {
	//  调用方法
	DispatchType *string `json:"dispatch_type,omitempty" xml:"dispatch_type,omitempty" require:"true"`
	// TR转发的uniqueid
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty"`
	// TR转发的url
	TestUrl *string `json:"test_url,omitempty" xml:"test_url,omitempty"`
	// TR转发的路径
	Path *string `json:"path,omitempty" xml:"path,omitempty"`
	// 是否跳过鉴权
	SkipAuth *bool `json:"skip_auth,omitempty" xml:"skip_auth,omitempty"`
	// 后端转发超时时间
	Timeout *int64 `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
	// 后端返回参数
	ResponseParams []*ApiParamInfo `json:"response_params,omitempty" xml:"response_params,omitempty" require:"true" type:"Repeated"`
	// 返回结果码
	ResultCodes []*ApiResultCodeInfo `json:"result_codes,omitempty" xml:"result_codes,omitempty" require:"true" type:"Repeated"`
}

func (s ApiBackendInfo) String() string {
	return tea.Prettify(s)
}

func (s ApiBackendInfo) GoString() string {
	return s.String()
}

func (s *ApiBackendInfo) SetDispatchType(v string) *ApiBackendInfo {
	s.DispatchType = &v
	return s
}

func (s *ApiBackendInfo) SetUniqueId(v string) *ApiBackendInfo {
	s.UniqueId = &v
	return s
}

func (s *ApiBackendInfo) SetTestUrl(v string) *ApiBackendInfo {
	s.TestUrl = &v
	return s
}

func (s *ApiBackendInfo) SetPath(v string) *ApiBackendInfo {
	s.Path = &v
	return s
}

func (s *ApiBackendInfo) SetSkipAuth(v bool) *ApiBackendInfo {
	s.SkipAuth = &v
	return s
}

func (s *ApiBackendInfo) SetTimeout(v int64) *ApiBackendInfo {
	s.Timeout = &v
	return s
}

func (s *ApiBackendInfo) SetResponseParams(v []*ApiParamInfo) *ApiBackendInfo {
	s.ResponseParams = v
	return s
}

func (s *ApiBackendInfo) SetResultCodes(v []*ApiResultCodeInfo) *ApiBackendInfo {
	s.ResultCodes = v
	return s
}

// api版本请求体
type ApiVersionRequest struct {
	// 产品名称
	ProviderName *string `json:"provider_name,omitempty" xml:"provider_name,omitempty" require:"true"`
	// 套件版本
	SuiteVersion *string `json:"suite_version,omitempty" xml:"suite_version,omitempty" require:"true"`
	// API名称
	ApiName *string `json:"api_name,omitempty" xml:"api_name,omitempty" require:"true"`
	// api版本名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// api版本描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// api转发方式
	DispatchType *string `json:"dispatch_type,omitempty" xml:"dispatch_type,omitempty" require:"true"`
	// unique id
	UniquId *string `json:"uniqu_id,omitempty" xml:"uniqu_id,omitempty" require:"true"`
	// 测试url
	TestUrl *string `json:"test_url,omitempty" xml:"test_url,omitempty"`
	// 转发路径
	Path *string `json:"path,omitempty" xml:"path,omitempty"`
	// api状态
	Status *StatusEnum `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 1000
	Timeout *int64 `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
	// 请求uri模式
	RequestUriPattern *string `json:"request_uri_pattern,omitempty" xml:"request_uri_pattern,omitempty"`
	// 请求路径参数
	RequestPathParams *string `json:"request_path_params,omitempty" xml:"request_path_params,omitempty"`
	// 方法名称
	RequestMethod *string `json:"request_method,omitempty" xml:"request_method,omitempty" require:"true"`
	// 支持特性
	Feature *string `json:"feature,omitempty" xml:"feature,omitempty"`
}

func (s ApiVersionRequest) String() string {
	return tea.Prettify(s)
}

func (s ApiVersionRequest) GoString() string {
	return s.String()
}

func (s *ApiVersionRequest) SetProviderName(v string) *ApiVersionRequest {
	s.ProviderName = &v
	return s
}

func (s *ApiVersionRequest) SetSuiteVersion(v string) *ApiVersionRequest {
	s.SuiteVersion = &v
	return s
}

func (s *ApiVersionRequest) SetApiName(v string) *ApiVersionRequest {
	s.ApiName = &v
	return s
}

func (s *ApiVersionRequest) SetName(v string) *ApiVersionRequest {
	s.Name = &v
	return s
}

func (s *ApiVersionRequest) SetDescription(v string) *ApiVersionRequest {
	s.Description = &v
	return s
}

func (s *ApiVersionRequest) SetDispatchType(v string) *ApiVersionRequest {
	s.DispatchType = &v
	return s
}

func (s *ApiVersionRequest) SetUniquId(v string) *ApiVersionRequest {
	s.UniquId = &v
	return s
}

func (s *ApiVersionRequest) SetTestUrl(v string) *ApiVersionRequest {
	s.TestUrl = &v
	return s
}

func (s *ApiVersionRequest) SetPath(v string) *ApiVersionRequest {
	s.Path = &v
	return s
}

func (s *ApiVersionRequest) SetStatus(v *StatusEnum) *ApiVersionRequest {
	s.Status = v
	return s
}

func (s *ApiVersionRequest) SetTimeout(v int64) *ApiVersionRequest {
	s.Timeout = &v
	return s
}

func (s *ApiVersionRequest) SetRequestUriPattern(v string) *ApiVersionRequest {
	s.RequestUriPattern = &v
	return s
}

func (s *ApiVersionRequest) SetRequestPathParams(v string) *ApiVersionRequest {
	s.RequestPathParams = &v
	return s
}

func (s *ApiVersionRequest) SetRequestMethod(v string) *ApiVersionRequest {
	s.RequestMethod = &v
	return s
}

func (s *ApiVersionRequest) SetFeature(v string) *ApiVersionRequest {
	s.Feature = &v
	return s
}

// api版本信息
type ApiVersion struct {
	// 版本名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// api版本描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// apimeta数据id
	ApiMetaId *string `json:"api_meta_id,omitempty" xml:"api_meta_id,omitempty" require:"true"`
	// api状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// api请求参数
	RequestParams []*ParamModal `json:"request_params,omitempty" xml:"request_params,omitempty" type:"Repeated"`
	// api响应参数
	ResponseParams []*ParamModal `json:"response_params,omitempty" xml:"response_params,omitempty" require:"true" type:"Repeated"`
	// api uri模式
	RequestUriPattern *string `json:"request_uri_pattern,omitempty" xml:"request_uri_pattern,omitempty"`
	// 请求参数路径
	RequestPathParams *string `json:"request_path_params,omitempty" xml:"request_path_params,omitempty"`
	// 请求方法
	RequestMethod *string `json:"request_method,omitempty" xml:"request_method,omitempty" require:"true"`
	// 具体API请求时，解析出来的路径参数与其对应的值
	// eg. /sofa/mq/msgtype/{id}，如果实际请求为/sofa/mq/msgtype/1，那么返回的map就是 id => 1
	RequestPathValues []*KeyValuePair `json:"request_path_values,omitempty" xml:"request_path_values,omitempty" require:"true" type:"Repeated"`
	// 请求分发方法
	DispatchType *string `json:"dispatch_type,omitempty" xml:"dispatch_type,omitempty" require:"true"`
	// 分发内容
	DispatchContext *string `json:"dispatch_context,omitempty" xml:"dispatch_context,omitempty"`
	// 接口特性
	Feature *string `json:"feature,omitempty" xml:"feature,omitempty"`
}

func (s ApiVersion) String() string {
	return tea.Prettify(s)
}

func (s ApiVersion) GoString() string {
	return s.String()
}

func (s *ApiVersion) SetName(v string) *ApiVersion {
	s.Name = &v
	return s
}

func (s *ApiVersion) SetDescription(v string) *ApiVersion {
	s.Description = &v
	return s
}

func (s *ApiVersion) SetApiMetaId(v string) *ApiVersion {
	s.ApiMetaId = &v
	return s
}

func (s *ApiVersion) SetStatus(v string) *ApiVersion {
	s.Status = &v
	return s
}

func (s *ApiVersion) SetRequestParams(v []*ParamModal) *ApiVersion {
	s.RequestParams = v
	return s
}

func (s *ApiVersion) SetResponseParams(v []*ParamModal) *ApiVersion {
	s.ResponseParams = v
	return s
}

func (s *ApiVersion) SetRequestUriPattern(v string) *ApiVersion {
	s.RequestUriPattern = &v
	return s
}

func (s *ApiVersion) SetRequestPathParams(v string) *ApiVersion {
	s.RequestPathParams = &v
	return s
}

func (s *ApiVersion) SetRequestMethod(v string) *ApiVersion {
	s.RequestMethod = &v
	return s
}

func (s *ApiVersion) SetRequestPathValues(v []*KeyValuePair) *ApiVersion {
	s.RequestPathValues = v
	return s
}

func (s *ApiVersion) SetDispatchType(v string) *ApiVersion {
	s.DispatchType = &v
	return s
}

func (s *ApiVersion) SetDispatchContext(v string) *ApiVersion {
	s.DispatchContext = &v
	return s
}

func (s *ApiVersion) SetFeature(v string) *ApiVersion {
	s.Feature = &v
	return s
}

// api元数据
type ApiMeta struct {
	// api名字
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// api简介
	Summary *string `json:"summary,omitempty" xml:"summary,omitempty" require:"true"`
	// api负责人
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty" require:"true"`
	// 为true时，不签约的情况下也可以调用
	ActivationDisabled *bool `json:"activation_disabled,omitempty" xml:"activation_disabled,omitempty" require:"true"`
	// 是否对外展示
	Internal *bool `json:"internal,omitempty" xml:"internal,omitempty" require:"true"`
	// unique_id
	DefaultUniqueId *string `json:"default_unique_id,omitempty" xml:"default_unique_id,omitempty"`
	// 调用路径
	DefaultHttpPath *string `json:"default_http_path,omitempty" xml:"default_http_path,omitempty"`
	// 允许使用的用户类型
	AllowedUserType *string `json:"allowed_user_type,omitempty" xml:"allowed_user_type,omitempty"`
	// 是否是第三方授权
	ThirdPartyAuth *bool `json:"third_party_auth,omitempty" xml:"third_party_auth,omitempty" require:"true"`
	// 动作名称
	ActionName *string `json:"action_name,omitempty" xml:"action_name,omitempty" require:"true"`
	// 角色名称
	RoleName *string `json:"role_name,omitempty" xml:"role_name,omitempty"`
	// api描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// api状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 产品码
	ProviderId *string `json:"provider_id,omitempty" xml:"provider_id,omitempty" require:"true"`
	// 分组id
	GroupId *string `json:"group_id,omitempty" xml:"group_id,omitempty" require:"true"`
	// 套件id
	ApiSuiteId *string `json:"api_suite_id,omitempty" xml:"api_suite_id,omitempty" require:"true"`
	// 扩展参数
	ExtAttribute *string `json:"ext_attribute,omitempty" xml:"ext_attribute,omitempty"`
}

func (s ApiMeta) String() string {
	return tea.Prettify(s)
}

func (s ApiMeta) GoString() string {
	return s.String()
}

func (s *ApiMeta) SetName(v string) *ApiMeta {
	s.Name = &v
	return s
}

func (s *ApiMeta) SetSummary(v string) *ApiMeta {
	s.Summary = &v
	return s
}

func (s *ApiMeta) SetOwner(v string) *ApiMeta {
	s.Owner = &v
	return s
}

func (s *ApiMeta) SetActivationDisabled(v bool) *ApiMeta {
	s.ActivationDisabled = &v
	return s
}

func (s *ApiMeta) SetInternal(v bool) *ApiMeta {
	s.Internal = &v
	return s
}

func (s *ApiMeta) SetDefaultUniqueId(v string) *ApiMeta {
	s.DefaultUniqueId = &v
	return s
}

func (s *ApiMeta) SetDefaultHttpPath(v string) *ApiMeta {
	s.DefaultHttpPath = &v
	return s
}

func (s *ApiMeta) SetAllowedUserType(v string) *ApiMeta {
	s.AllowedUserType = &v
	return s
}

func (s *ApiMeta) SetThirdPartyAuth(v bool) *ApiMeta {
	s.ThirdPartyAuth = &v
	return s
}

func (s *ApiMeta) SetActionName(v string) *ApiMeta {
	s.ActionName = &v
	return s
}

func (s *ApiMeta) SetRoleName(v string) *ApiMeta {
	s.RoleName = &v
	return s
}

func (s *ApiMeta) SetDescription(v string) *ApiMeta {
	s.Description = &v
	return s
}

func (s *ApiMeta) SetStatus(v string) *ApiMeta {
	s.Status = &v
	return s
}

func (s *ApiMeta) SetProviderId(v string) *ApiMeta {
	s.ProviderId = &v
	return s
}

func (s *ApiMeta) SetGroupId(v string) *ApiMeta {
	s.GroupId = &v
	return s
}

func (s *ApiMeta) SetApiSuiteId(v string) *ApiMeta {
	s.ApiSuiteId = &v
	return s
}

func (s *ApiMeta) SetExtAttribute(v string) *ApiMeta {
	s.ExtAttribute = &v
	return s
}

// 渠道API
type ChannelApi struct {
	// 渠道名称
	ChannelName *string `json:"channel_name,omitempty" xml:"channel_name,omitempty" require:"true"`
	// 外部产品码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 外部服务码
	ServiceCode *string `json:"service_code,omitempty" xml:"service_code,omitempty"`
	// 外部API名称
	ApiName *string `json:"api_name,omitempty" xml:"api_name,omitempty" require:"true"`
	// 外部API版本
	ApiVersion *string `json:"api_version,omitempty" xml:"api_version,omitempty" require:"true"`
	// 鉴权模式
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty"`
	// 鉴权资源表达式
	AuthExpression *string `json:"auth_expression,omitempty" xml:"auth_expression,omitempty"`
	// 内部产品码
	InnerProviderName *string `json:"inner_provider_name,omitempty" xml:"inner_provider_name,omitempty" require:"true"`
	// 内部API名称
	InnerApiName *string `json:"inner_api_name,omitempty" xml:"inner_api_name,omitempty"`
	// 内部API版本
	InnerApiVersion *string `json:"inner_api_version,omitempty" xml:"inner_api_version,omitempty"`
}

func (s ChannelApi) String() string {
	return tea.Prettify(s)
}

func (s ChannelApi) GoString() string {
	return s.String()
}

func (s *ChannelApi) SetChannelName(v string) *ChannelApi {
	s.ChannelName = &v
	return s
}

func (s *ChannelApi) SetProductCode(v string) *ChannelApi {
	s.ProductCode = &v
	return s
}

func (s *ChannelApi) SetServiceCode(v string) *ChannelApi {
	s.ServiceCode = &v
	return s
}

func (s *ChannelApi) SetApiName(v string) *ChannelApi {
	s.ApiName = &v
	return s
}

func (s *ChannelApi) SetApiVersion(v string) *ChannelApi {
	s.ApiVersion = &v
	return s
}

func (s *ChannelApi) SetAuthType(v string) *ChannelApi {
	s.AuthType = &v
	return s
}

func (s *ChannelApi) SetAuthExpression(v string) *ChannelApi {
	s.AuthExpression = &v
	return s
}

func (s *ChannelApi) SetInnerProviderName(v string) *ChannelApi {
	s.InnerProviderName = &v
	return s
}

func (s *ChannelApi) SetInnerApiName(v string) *ChannelApi {
	s.InnerApiName = &v
	return s
}

func (s *ChannelApi) SetInnerApiVersion(v string) *ChannelApi {
	s.InnerApiVersion = &v
	return s
}

// api
type ApiPair struct {
	// api名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// api版本
	Version *string `json:"version,omitempty" xml:"version,omitempty" require:"true"`
}

func (s ApiPair) String() string {
	return tea.Prettify(s)
}

func (s ApiPair) GoString() string {
	return s.String()
}

func (s *ApiPair) SetName(v string) *ApiPair {
	s.Name = &v
	return s
}

func (s *ApiPair) SetVersion(v string) *ApiPair {
	s.Version = &v
	return s
}

type QueryApiserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 产品码
	Provider *string `json:"provider,omitempty" xml:"provider,omitempty" require:"true"`
	// 套件
	Suite *string `json:"suite,omitempty" xml:"suite,omitempty" require:"true"`
	// api名字
	ApiName *string `json:"api_name,omitempty" xml:"api_name,omitempty" require:"true"`
}

func (s QueryApiserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApiserviceRequest) GoString() string {
	return s.String()
}

func (s *QueryApiserviceRequest) SetAuthToken(v string) *QueryApiserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApiserviceRequest) SetProvider(v string) *QueryApiserviceRequest {
	s.Provider = &v
	return s
}

func (s *QueryApiserviceRequest) SetSuite(v string) *QueryApiserviceRequest {
	s.Suite = &v
	return s
}

func (s *QueryApiserviceRequest) SetApiName(v string) *QueryApiserviceRequest {
	s.ApiName = &v
	return s
}

type QueryApiserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 套件信息
	ApiSuite *ApiSuite `json:"api_suite,omitempty" xml:"api_suite,omitempty"`
	// api基本信息
	ApiMeta *ApiMeta `json:"api_meta,omitempty" xml:"api_meta,omitempty"`
	// api版本数据
	ApiVersion *ApiVersion `json:"api_version,omitempty" xml:"api_version,omitempty"`
	// api分组信息
	ApiGroup *ApiGroup `json:"api_group,omitempty" xml:"api_group,omitempty"`
	// api请求参数
	RequestParams []*ParamModal `json:"request_params,omitempty" xml:"request_params,omitempty" type:"Repeated"`
	// api返回参数
	ResponseParams []*ParamModal `json:"response_params,omitempty" xml:"response_params,omitempty" type:"Repeated"`
	// 结果码
	ResultCodes []*ResultCode `json:"result_codes,omitempty" xml:"result_codes,omitempty" type:"Repeated"`
}

func (s QueryApiserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApiserviceResponse) GoString() string {
	return s.String()
}

func (s *QueryApiserviceResponse) SetReqMsgId(v string) *QueryApiserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApiserviceResponse) SetResultCode(v string) *QueryApiserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApiserviceResponse) SetResultMsg(v string) *QueryApiserviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryApiserviceResponse) SetApiSuite(v *ApiSuite) *QueryApiserviceResponse {
	s.ApiSuite = v
	return s
}

func (s *QueryApiserviceResponse) SetApiMeta(v *ApiMeta) *QueryApiserviceResponse {
	s.ApiMeta = v
	return s
}

func (s *QueryApiserviceResponse) SetApiVersion(v *ApiVersion) *QueryApiserviceResponse {
	s.ApiVersion = v
	return s
}

func (s *QueryApiserviceResponse) SetApiGroup(v *ApiGroup) *QueryApiserviceResponse {
	s.ApiGroup = v
	return s
}

func (s *QueryApiserviceResponse) SetRequestParams(v []*ParamModal) *QueryApiserviceResponse {
	s.RequestParams = v
	return s
}

func (s *QueryApiserviceResponse) SetResponseParams(v []*ParamModal) *QueryApiserviceResponse {
	s.ResponseParams = v
	return s
}

func (s *QueryApiserviceResponse) SetResultCodes(v []*ResultCode) *QueryApiserviceResponse {
	s.ResultCodes = v
	return s
}

type ImportApiserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// api基本信息
	ApiMetaRequest *ApiMetaRequest `json:"api_meta_request,omitempty" xml:"api_meta_request,omitempty" require:"true"`
	// api版本
	ApiVersionRequest *ApiVersionRequest `json:"api_version_request,omitempty" xml:"api_version_request,omitempty" require:"true"`
	// api请求参数
	ImportApiParamsRequest *ImportApiParamsRequest `json:"import_api_params_request,omitempty" xml:"import_api_params_request,omitempty"`
}

func (s ImportApiserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportApiserviceRequest) GoString() string {
	return s.String()
}

func (s *ImportApiserviceRequest) SetAuthToken(v string) *ImportApiserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportApiserviceRequest) SetApiMetaRequest(v *ApiMetaRequest) *ImportApiserviceRequest {
	s.ApiMetaRequest = v
	return s
}

func (s *ImportApiserviceRequest) SetApiVersionRequest(v *ApiVersionRequest) *ImportApiserviceRequest {
	s.ApiVersionRequest = v
	return s
}

func (s *ImportApiserviceRequest) SetImportApiParamsRequest(v *ImportApiParamsRequest) *ImportApiserviceRequest {
	s.ImportApiParamsRequest = v
	return s
}

type ImportApiserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ImportApiserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportApiserviceResponse) GoString() string {
	return s.String()
}

func (s *ImportApiserviceResponse) SetReqMsgId(v string) *ImportApiserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportApiserviceResponse) SetResultCode(v string) *ImportApiserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportApiserviceResponse) SetResultMsg(v string) *ImportApiserviceResponse {
	s.ResultMsg = &v
	return s
}

type CreateApiserviceProductRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 产品类型
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 产品英文名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 产品中文名
	ChineseName *string `json:"chinese_name,omitempty" xml:"chinese_name,omitempty" require:"true"`
	// 产品版本
	ProdVersion *string `json:"prod_version,omitempty" xml:"prod_version,omitempty"`
	// 产品所有者
	PrimaryOwnerId *string `json:"primary_owner_id,omitempty" xml:"primary_owner_id,omitempty" require:"true"`
	// 产品描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// api提供方类型
	ProviderType *string `json:"provider_type,omitempty" xml:"provider_type,omitempty"`
	// 产品前缀
	ApiNamePrefix *string `json:"api_name_prefix,omitempty" xml:"api_name_prefix,omitempty"`
}

func (s CreateApiserviceProductRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateApiserviceProductRequest) GoString() string {
	return s.String()
}

func (s *CreateApiserviceProductRequest) SetAuthToken(v string) *CreateApiserviceProductRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateApiserviceProductRequest) SetProdCode(v string) *CreateApiserviceProductRequest {
	s.ProdCode = &v
	return s
}

func (s *CreateApiserviceProductRequest) SetType(v string) *CreateApiserviceProductRequest {
	s.Type = &v
	return s
}

func (s *CreateApiserviceProductRequest) SetName(v string) *CreateApiserviceProductRequest {
	s.Name = &v
	return s
}

func (s *CreateApiserviceProductRequest) SetChineseName(v string) *CreateApiserviceProductRequest {
	s.ChineseName = &v
	return s
}

func (s *CreateApiserviceProductRequest) SetProdVersion(v string) *CreateApiserviceProductRequest {
	s.ProdVersion = &v
	return s
}

func (s *CreateApiserviceProductRequest) SetPrimaryOwnerId(v string) *CreateApiserviceProductRequest {
	s.PrimaryOwnerId = &v
	return s
}

func (s *CreateApiserviceProductRequest) SetDescription(v string) *CreateApiserviceProductRequest {
	s.Description = &v
	return s
}

func (s *CreateApiserviceProductRequest) SetProviderType(v string) *CreateApiserviceProductRequest {
	s.ProviderType = &v
	return s
}

func (s *CreateApiserviceProductRequest) SetApiNamePrefix(v string) *CreateApiserviceProductRequest {
	s.ApiNamePrefix = &v
	return s
}

type CreateApiserviceProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateApiserviceProductResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateApiserviceProductResponse) GoString() string {
	return s.String()
}

func (s *CreateApiserviceProductResponse) SetReqMsgId(v string) *CreateApiserviceProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateApiserviceProductResponse) SetResultCode(v string) *CreateApiserviceProductResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateApiserviceProductResponse) SetResultMsg(v string) *CreateApiserviceProductResponse {
	s.ResultMsg = &v
	return s
}

type CreateApiserviceGroupRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 所属产品
	ProviderName *string `json:"provider_name,omitempty" xml:"provider_name,omitempty" require:"true"`
	// 套件版本
	SuiteVersion *string `json:"suite_version,omitempty" xml:"suite_version,omitempty" require:"true"`
	// 分组描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 分组名称
	GroupName *string `json:"group_name,omitempty" xml:"group_name,omitempty" require:"true"`
	// 分组类型
	ApiGroupType *string `json:"api_group_type,omitempty" xml:"api_group_type,omitempty"`
}

func (s CreateApiserviceGroupRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateApiserviceGroupRequest) GoString() string {
	return s.String()
}

func (s *CreateApiserviceGroupRequest) SetAuthToken(v string) *CreateApiserviceGroupRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateApiserviceGroupRequest) SetProviderName(v string) *CreateApiserviceGroupRequest {
	s.ProviderName = &v
	return s
}

func (s *CreateApiserviceGroupRequest) SetSuiteVersion(v string) *CreateApiserviceGroupRequest {
	s.SuiteVersion = &v
	return s
}

func (s *CreateApiserviceGroupRequest) SetDescription(v string) *CreateApiserviceGroupRequest {
	s.Description = &v
	return s
}

func (s *CreateApiserviceGroupRequest) SetGroupName(v string) *CreateApiserviceGroupRequest {
	s.GroupName = &v
	return s
}

func (s *CreateApiserviceGroupRequest) SetApiGroupType(v string) *CreateApiserviceGroupRequest {
	s.ApiGroupType = &v
	return s
}

type CreateApiserviceGroupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateApiserviceGroupResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateApiserviceGroupResponse) GoString() string {
	return s.String()
}

func (s *CreateApiserviceGroupResponse) SetReqMsgId(v string) *CreateApiserviceGroupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateApiserviceGroupResponse) SetResultCode(v string) *CreateApiserviceGroupResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateApiserviceGroupResponse) SetResultMsg(v string) *CreateApiserviceGroupResponse {
	s.ResultMsg = &v
	return s
}

type CreateApiserviceSuiteRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 默认为1.0.0
	SuiteVersion *string `json:"suite_version,omitempty" xml:"suite_version,omitempty"`
	// 所属产品名
	ProviderName *string `json:"provider_name,omitempty" xml:"provider_name,omitempty" require:"true"`
	// 是否已经发布
	Released *bool `json:"released,omitempty" xml:"released,omitempty" require:"true"`
}

func (s CreateApiserviceSuiteRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateApiserviceSuiteRequest) GoString() string {
	return s.String()
}

func (s *CreateApiserviceSuiteRequest) SetAuthToken(v string) *CreateApiserviceSuiteRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateApiserviceSuiteRequest) SetSuiteVersion(v string) *CreateApiserviceSuiteRequest {
	s.SuiteVersion = &v
	return s
}

func (s *CreateApiserviceSuiteRequest) SetProviderName(v string) *CreateApiserviceSuiteRequest {
	s.ProviderName = &v
	return s
}

func (s *CreateApiserviceSuiteRequest) SetReleased(v bool) *CreateApiserviceSuiteRequest {
	s.Released = &v
	return s
}

type CreateApiserviceSuiteResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateApiserviceSuiteResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateApiserviceSuiteResponse) GoString() string {
	return s.String()
}

func (s *CreateApiserviceSuiteResponse) SetReqMsgId(v string) *CreateApiserviceSuiteResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateApiserviceSuiteResponse) SetResultCode(v string) *CreateApiserviceSuiteResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateApiserviceSuiteResponse) SetResultMsg(v string) *CreateApiserviceSuiteResponse {
	s.ResultMsg = &v
	return s
}

type ImportSpecRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// API数据描述，XML文件内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s ImportSpecRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportSpecRequest) GoString() string {
	return s.String()
}

func (s *ImportSpecRequest) SetAuthToken(v string) *ImportSpecRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportSpecRequest) SetContent(v string) *ImportSpecRequest {
	s.Content = &v
	return s
}

type ImportSpecResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ImportSpecResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportSpecResponse) GoString() string {
	return s.String()
}

func (s *ImportSpecResponse) SetReqMsgId(v string) *ImportSpecResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportSpecResponse) SetResultCode(v string) *ImportSpecResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportSpecResponse) SetResultMsg(v string) *ImportSpecResponse {
	s.ResultMsg = &v
	return s
}

type ExportSpecRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// api列表
	Apis []*ApiPair `json:"apis,omitempty" xml:"apis,omitempty" type:"Repeated"`
}

func (s ExportSpecRequest) String() string {
	return tea.Prettify(s)
}

func (s ExportSpecRequest) GoString() string {
	return s.String()
}

func (s *ExportSpecRequest) SetAuthToken(v string) *ExportSpecRequest {
	s.AuthToken = &v
	return s
}

func (s *ExportSpecRequest) SetProdCode(v string) *ExportSpecRequest {
	s.ProdCode = &v
	return s
}

func (s *ExportSpecRequest) SetApis(v []*ApiPair) *ExportSpecRequest {
	s.Apis = v
	return s
}

type ExportSpecResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// spec内容
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
}

func (s ExportSpecResponse) String() string {
	return tea.Prettify(s)
}

func (s ExportSpecResponse) GoString() string {
	return s.String()
}

func (s *ExportSpecResponse) SetReqMsgId(v string) *ExportSpecResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExportSpecResponse) SetResultCode(v string) *ExportSpecResponse {
	s.ResultCode = &v
	return s
}

func (s *ExportSpecResponse) SetResultMsg(v string) *ExportSpecResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExportSpecResponse) SetContent(v string) *ExportSpecResponse {
	s.Content = &v
	return s
}

type GetProviderRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
}

func (s GetProviderRequest) String() string {
	return tea.Prettify(s)
}

func (s GetProviderRequest) GoString() string {
	return s.String()
}

func (s *GetProviderRequest) SetAuthToken(v string) *GetProviderRequest {
	s.AuthToken = &v
	return s
}

func (s *GetProviderRequest) SetProdCode(v string) *GetProviderRequest {
	s.ProdCode = &v
	return s
}

type GetProviderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// API前缀
	ApiNamePrefix *string `json:"api_name_prefix,omitempty" xml:"api_name_prefix,omitempty"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 是否在开发者中心展示
	DeveloperCenterDisplay *bool `json:"developer_center_display,omitempty" xml:"developer_center_display,omitempty"`
	// Proivder名称，等同于产品码
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 产品别名
	NameAlias *string `json:"name_alias,omitempty" xml:"name_alias,omitempty"`
	// 组织机构
	Organization *string `json:"organization,omitempty" xml:"organization,omitempty"`
	// 产品类型
	ProviderType *string `json:"provider_type,omitempty" xml:"provider_type,omitempty"`
	// 产品状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 产品简介
	Summary *string `json:"summary,omitempty" xml:"summary,omitempty"`
}

func (s GetProviderResponse) String() string {
	return tea.Prettify(s)
}

func (s GetProviderResponse) GoString() string {
	return s.String()
}

func (s *GetProviderResponse) SetReqMsgId(v string) *GetProviderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetProviderResponse) SetResultCode(v string) *GetProviderResponse {
	s.ResultCode = &v
	return s
}

func (s *GetProviderResponse) SetResultMsg(v string) *GetProviderResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetProviderResponse) SetApiNamePrefix(v string) *GetProviderResponse {
	s.ApiNamePrefix = &v
	return s
}

func (s *GetProviderResponse) SetDescription(v string) *GetProviderResponse {
	s.Description = &v
	return s
}

func (s *GetProviderResponse) SetDeveloperCenterDisplay(v bool) *GetProviderResponse {
	s.DeveloperCenterDisplay = &v
	return s
}

func (s *GetProviderResponse) SetName(v string) *GetProviderResponse {
	s.Name = &v
	return s
}

func (s *GetProviderResponse) SetNameAlias(v string) *GetProviderResponse {
	s.NameAlias = &v
	return s
}

func (s *GetProviderResponse) SetOrganization(v string) *GetProviderResponse {
	s.Organization = &v
	return s
}

func (s *GetProviderResponse) SetProviderType(v string) *GetProviderResponse {
	s.ProviderType = &v
	return s
}

func (s *GetProviderResponse) SetStatus(v string) *GetProviderResponse {
	s.Status = &v
	return s
}

func (s *GetProviderResponse) SetSummary(v string) *GetProviderResponse {
	s.Summary = &v
	return s
}

type ImportChannelapiRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 渠道API列表
	ApiList []*ChannelApi `json:"api_list,omitempty" xml:"api_list,omitempty" require:"true" type:"Repeated"`
}

func (s ImportChannelapiRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportChannelapiRequest) GoString() string {
	return s.String()
}

func (s *ImportChannelapiRequest) SetAuthToken(v string) *ImportChannelapiRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportChannelapiRequest) SetApiList(v []*ChannelApi) *ImportChannelapiRequest {
	s.ApiList = v
	return s
}

type ImportChannelapiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 失败列表
	FailureList []*ChannelApi `json:"failure_list,omitempty" xml:"failure_list,omitempty" type:"Repeated"`
	// 失败数量
	FailureNum *int64 `json:"failure_num,omitempty" xml:"failure_num,omitempty"`
	// 成功数量
	SuccessNum *int64 `json:"success_num,omitempty" xml:"success_num,omitempty"`
}

func (s ImportChannelapiResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportChannelapiResponse) GoString() string {
	return s.String()
}

func (s *ImportChannelapiResponse) SetReqMsgId(v string) *ImportChannelapiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportChannelapiResponse) SetResultCode(v string) *ImportChannelapiResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportChannelapiResponse) SetResultMsg(v string) *ImportChannelapiResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportChannelapiResponse) SetFailureList(v []*ChannelApi) *ImportChannelapiResponse {
	s.FailureList = v
	return s
}

func (s *ImportChannelapiResponse) SetFailureNum(v int64) *ImportChannelapiResponse {
	s.FailureNum = &v
	return s
}

func (s *ImportChannelapiResponse) SetSuccessNum(v int64) *ImportChannelapiResponse {
	s.SuccessNum = &v
	return s
}

type ServiceGatewayCheckRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s ServiceGatewayCheckRequest) String() string {
	return tea.Prettify(s)
}

func (s ServiceGatewayCheckRequest) GoString() string {
	return s.String()
}

func (s *ServiceGatewayCheckRequest) SetAuthToken(v string) *ServiceGatewayCheckRequest {
	s.AuthToken = &v
	return s
}

type ServiceGatewayCheckResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 如果正常，返回OK
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s ServiceGatewayCheckResponse) String() string {
	return tea.Prettify(s)
}

func (s ServiceGatewayCheckResponse) GoString() string {
	return s.String()
}

func (s *ServiceGatewayCheckResponse) SetReqMsgId(v string) *ServiceGatewayCheckResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ServiceGatewayCheckResponse) SetResultCode(v string) *ServiceGatewayCheckResponse {
	s.ResultCode = &v
	return s
}

func (s *ServiceGatewayCheckResponse) SetResultMsg(v string) *ServiceGatewayCheckResponse {
	s.ResultMsg = &v
	return s
}

func (s *ServiceGatewayCheckResponse) SetStatus(v string) *ServiceGatewayCheckResponse {
	s.Status = &v
	return s
}

type ImportGatewaySpecRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// API数据描述，XML文件内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s ImportGatewaySpecRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportGatewaySpecRequest) GoString() string {
	return s.String()
}

func (s *ImportGatewaySpecRequest) SetAuthToken(v string) *ImportGatewaySpecRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportGatewaySpecRequest) SetContent(v string) *ImportGatewaySpecRequest {
	s.Content = &v
	return s
}

type ImportGatewaySpecResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ImportGatewaySpecResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportGatewaySpecResponse) GoString() string {
	return s.String()
}

func (s *ImportGatewaySpecResponse) SetReqMsgId(v string) *ImportGatewaySpecResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportGatewaySpecResponse) SetResultCode(v string) *ImportGatewaySpecResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportGatewaySpecResponse) SetResultMsg(v string) *ImportGatewaySpecResponse {
	s.ResultMsg = &v
	return s
}

type UpdateGatewayClusterhostRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 产品码
	Product *string `json:"product,omitempty" xml:"product,omitempty" require:"true"`
	// 集群名称，对应productInstanceId
	Cluster *string `json:"cluster,omitempty" xml:"cluster,omitempty" require:"true"`
	// api所属套件版本
	SuitVersion *string `json:"suit_version,omitempty" xml:"suit_version,omitempty" require:"true"`
	// api分组名称
	GroupName *string `json:"group_name,omitempty" xml:"group_name,omitempty" require:"true"`
	// 后端地址
	Host *string `json:"host,omitempty" xml:"host,omitempty" require:"true"`
}

func (s UpdateGatewayClusterhostRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateGatewayClusterhostRequest) GoString() string {
	return s.String()
}

func (s *UpdateGatewayClusterhostRequest) SetAuthToken(v string) *UpdateGatewayClusterhostRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateGatewayClusterhostRequest) SetProduct(v string) *UpdateGatewayClusterhostRequest {
	s.Product = &v
	return s
}

func (s *UpdateGatewayClusterhostRequest) SetCluster(v string) *UpdateGatewayClusterhostRequest {
	s.Cluster = &v
	return s
}

func (s *UpdateGatewayClusterhostRequest) SetSuitVersion(v string) *UpdateGatewayClusterhostRequest {
	s.SuitVersion = &v
	return s
}

func (s *UpdateGatewayClusterhostRequest) SetGroupName(v string) *UpdateGatewayClusterhostRequest {
	s.GroupName = &v
	return s
}

func (s *UpdateGatewayClusterhostRequest) SetHost(v string) *UpdateGatewayClusterhostRequest {
	s.Host = &v
	return s
}

type UpdateGatewayClusterhostResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateGatewayClusterhostResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateGatewayClusterhostResponse) GoString() string {
	return s.String()
}

func (s *UpdateGatewayClusterhostResponse) SetReqMsgId(v string) *UpdateGatewayClusterhostResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateGatewayClusterhostResponse) SetResultCode(v string) *UpdateGatewayClusterhostResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateGatewayClusterhostResponse) SetResultMsg(v string) *UpdateGatewayClusterhostResponse {
	s.ResultMsg = &v
	return s
}

type CreateGatewayStaticrouterRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 产品码
	Provider *string `json:"provider,omitempty" xml:"provider,omitempty" require:"true"`
	// 套件版本
	SuitVersion *string `json:"suit_version,omitempty" xml:"suit_version,omitempty" require:"true"`
	// 分组名称
	GroupName *string `json:"group_name,omitempty" xml:"group_name,omitempty" require:"true"`
	// accessKey
	Accesskey *string `json:"accesskey,omitempty" xml:"accesskey,omitempty" require:"true"`
	// 后端地址
	Host *string `json:"host,omitempty" xml:"host,omitempty" require:"true"`
}

func (s CreateGatewayStaticrouterRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateGatewayStaticrouterRequest) GoString() string {
	return s.String()
}

func (s *CreateGatewayStaticrouterRequest) SetAuthToken(v string) *CreateGatewayStaticrouterRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateGatewayStaticrouterRequest) SetProvider(v string) *CreateGatewayStaticrouterRequest {
	s.Provider = &v
	return s
}

func (s *CreateGatewayStaticrouterRequest) SetSuitVersion(v string) *CreateGatewayStaticrouterRequest {
	s.SuitVersion = &v
	return s
}

func (s *CreateGatewayStaticrouterRequest) SetGroupName(v string) *CreateGatewayStaticrouterRequest {
	s.GroupName = &v
	return s
}

func (s *CreateGatewayStaticrouterRequest) SetAccesskey(v string) *CreateGatewayStaticrouterRequest {
	s.Accesskey = &v
	return s
}

func (s *CreateGatewayStaticrouterRequest) SetHost(v string) *CreateGatewayStaticrouterRequest {
	s.Host = &v
	return s
}

type CreateGatewayStaticrouterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateGatewayStaticrouterResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateGatewayStaticrouterResponse) GoString() string {
	return s.String()
}

func (s *CreateGatewayStaticrouterResponse) SetReqMsgId(v string) *CreateGatewayStaticrouterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateGatewayStaticrouterResponse) SetResultCode(v string) *CreateGatewayStaticrouterResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateGatewayStaticrouterResponse) SetResultMsg(v string) *CreateGatewayStaticrouterResponse {
	s.ResultMsg = &v
	return s
}

type QueryGatewayClusterhostRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 产品码
	Product *string `json:"product,omitempty" xml:"product,omitempty" require:"true"`
	// 集群名称，对应productInstanceId
	Cluster *string `json:"cluster,omitempty" xml:"cluster,omitempty" require:"true"`
	// api所属套件版本
	SuitVersion *string `json:"suit_version,omitempty" xml:"suit_version,omitempty" require:"true"`
	// api分组名称
	GroupName *string `json:"group_name,omitempty" xml:"group_name,omitempty" require:"true"`
}

func (s QueryGatewayClusterhostRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGatewayClusterhostRequest) GoString() string {
	return s.String()
}

func (s *QueryGatewayClusterhostRequest) SetAuthToken(v string) *QueryGatewayClusterhostRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGatewayClusterhostRequest) SetProduct(v string) *QueryGatewayClusterhostRequest {
	s.Product = &v
	return s
}

func (s *QueryGatewayClusterhostRequest) SetCluster(v string) *QueryGatewayClusterhostRequest {
	s.Cluster = &v
	return s
}

func (s *QueryGatewayClusterhostRequest) SetSuitVersion(v string) *QueryGatewayClusterhostRequest {
	s.SuitVersion = &v
	return s
}

func (s *QueryGatewayClusterhostRequest) SetGroupName(v string) *QueryGatewayClusterhostRequest {
	s.GroupName = &v
	return s
}

type QueryGatewayClusterhostResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 后端地址
	Host *string `json:"host,omitempty" xml:"host,omitempty"`
}

func (s QueryGatewayClusterhostResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGatewayClusterhostResponse) GoString() string {
	return s.String()
}

func (s *QueryGatewayClusterhostResponse) SetReqMsgId(v string) *QueryGatewayClusterhostResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGatewayClusterhostResponse) SetResultCode(v string) *QueryGatewayClusterhostResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGatewayClusterhostResponse) SetResultMsg(v string) *QueryGatewayClusterhostResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGatewayClusterhostResponse) SetHost(v string) *QueryGatewayClusterhostResponse {
	s.Host = &v
	return s
}

type ImportSdkRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// SDK语言
	SdkLanguage *string `json:"sdk_language,omitempty" xml:"sdk_language,omitempty" require:"true"`
	// 版本
	VersionOfSdk *string `json:"version_of_sdk,omitempty" xml:"version_of_sdk,omitempty" require:"true"`
	// 依赖详情
	DependencyDetail *string `json:"dependency_detail,omitempty" xml:"dependency_detail,omitempty" require:"true"`
}

func (s ImportSdkRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportSdkRequest) GoString() string {
	return s.String()
}

func (s *ImportSdkRequest) SetAuthToken(v string) *ImportSdkRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportSdkRequest) SetProdCode(v string) *ImportSdkRequest {
	s.ProdCode = &v
	return s
}

func (s *ImportSdkRequest) SetSdkLanguage(v string) *ImportSdkRequest {
	s.SdkLanguage = &v
	return s
}

func (s *ImportSdkRequest) SetVersionOfSdk(v string) *ImportSdkRequest {
	s.VersionOfSdk = &v
	return s
}

func (s *ImportSdkRequest) SetDependencyDetail(v string) *ImportSdkRequest {
	s.DependencyDetail = &v
	return s
}

type ImportSdkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ImportSdkResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportSdkResponse) GoString() string {
	return s.String()
}

func (s *ImportSdkResponse) SetReqMsgId(v string) *ImportSdkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportSdkResponse) SetResultCode(v string) *ImportSdkResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportSdkResponse) SetResultMsg(v string) *ImportSdkResponse {
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
				"sdk_version":      tea.String("3.2.3"),
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
 * Description: 查询api详情
 * Summary: 查询api
 */
func (client *Client) QueryApiservice(request *QueryApiserviceRequest) (_result *QueryApiserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApiserviceResponse{}
	_body, _err := client.QueryApiserviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询api详情
 * Summary: 查询api
 */
func (client *Client) QueryApiserviceEx(request *QueryApiserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApiserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApiserviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.openapi.apiservice.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 导入api信息
 * Summary: 导入api信息
 */
func (client *Client) ImportApiservice(request *ImportApiserviceRequest) (_result *ImportApiserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportApiserviceResponse{}
	_body, _err := client.ImportApiserviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 导入api信息
 * Summary: 导入api信息
 */
func (client *Client) ImportApiserviceEx(request *ImportApiserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportApiserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportApiserviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.openapi.apiservice.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 调用apicore创建产品
 * Summary: 创建产品
 */
func (client *Client) CreateApiserviceProduct(request *CreateApiserviceProductRequest) (_result *CreateApiserviceProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateApiserviceProductResponse{}
	_body, _err := client.CreateApiserviceProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 调用apicore创建产品
 * Summary: 创建产品
 */
func (client *Client) CreateApiserviceProductEx(request *CreateApiserviceProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateApiserviceProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateApiserviceProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.openapi.apiservice.product.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建分组
 * Summary: 创建分组
 */
func (client *Client) CreateApiserviceGroup(request *CreateApiserviceGroupRequest) (_result *CreateApiserviceGroupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateApiserviceGroupResponse{}
	_body, _err := client.CreateApiserviceGroupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建分组
 * Summary: 创建分组
 */
func (client *Client) CreateApiserviceGroupEx(request *CreateApiserviceGroupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateApiserviceGroupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateApiserviceGroupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.openapi.apiservice.group.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建suite
 * Summary: 创建suite
 */
func (client *Client) CreateApiserviceSuite(request *CreateApiserviceSuiteRequest) (_result *CreateApiserviceSuiteResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateApiserviceSuiteResponse{}
	_body, _err := client.CreateApiserviceSuiteEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建suite
 * Summary: 创建suite
 */
func (client *Client) CreateApiserviceSuiteEx(request *CreateApiserviceSuiteRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateApiserviceSuiteResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateApiserviceSuiteResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.openapi.apiservice.suite.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过XML Spec形式导入产品的API配置
 * Summary: 导入API配置
 */
func (client *Client) ImportSpec(request *ImportSpecRequest) (_result *ImportSpecResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportSpecResponse{}
	_body, _err := client.ImportSpecEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过XML Spec形式导入产品的API配置
 * Summary: 导入API配置
 */
func (client *Client) ImportSpecEx(request *ImportSpecRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportSpecResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportSpecResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.openapi.spec.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 导出Spec
 * Summary: 导出Spec
 */
func (client *Client) ExportSpec(request *ExportSpecRequest) (_result *ExportSpecResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExportSpecResponse{}
	_body, _err := client.ExportSpecEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 导出Spec
 * Summary: 导出Spec
 */
func (client *Client) ExportSpecEx(request *ExportSpecRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExportSpecResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExportSpecResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.openapi.spec.export"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取OpenAPI提供方详情
 * Summary: 获取OpenAPI提供方详情
 */
func (client *Client) GetProvider(request *GetProviderRequest) (_result *GetProviderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetProviderResponse{}
	_body, _err := client.GetProviderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取OpenAPI提供方详情
 * Summary: 获取OpenAPI提供方详情
 */
func (client *Client) GetProviderEx(request *GetProviderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetProviderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetProviderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.openapi.provider.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 渠道API导入
 * Summary: 渠道API导入
 */
func (client *Client) ImportChannelapi(request *ImportChannelapiRequest) (_result *ImportChannelapiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportChannelapiResponse{}
	_body, _err := client.ImportChannelapiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 渠道API导入
 * Summary: 渠道API导入
 */
func (client *Client) ImportChannelapiEx(request *ImportChannelapiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportChannelapiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportChannelapiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.openapi.channelapi.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 检测金融云网关目前的健康状态
 * Summary: 网关健康检查1
 */
func (client *Client) ServiceGatewayCheck(request *ServiceGatewayCheckRequest) (_result *ServiceGatewayCheckResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ServiceGatewayCheckResponse{}
	_body, _err := client.ServiceGatewayCheckEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 检测金融云网关目前的健康状态
 * Summary: 网关健康检查1
 */
func (client *Client) ServiceGatewayCheckEx(request *ServiceGatewayCheckRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ServiceGatewayCheckResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ServiceGatewayCheckResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.openapi.gateway.check.service"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过XML Spec形式导入产品的API配置
 * Summary: 导入API配置
 */
func (client *Client) ImportGatewaySpec(request *ImportGatewaySpecRequest) (_result *ImportGatewaySpecResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportGatewaySpecResponse{}
	_body, _err := client.ImportGatewaySpecEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过XML Spec形式导入产品的API配置
 * Summary: 导入API配置
 */
func (client *Client) ImportGatewaySpecEx(request *ImportGatewaySpecRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportGatewaySpecResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportGatewaySpecResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.openapi.gateway.spec.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新集群路由host
 * Summary: 更新集群路由host
 */
func (client *Client) UpdateGatewayClusterhost(request *UpdateGatewayClusterhostRequest) (_result *UpdateGatewayClusterhostResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateGatewayClusterhostResponse{}
	_body, _err := client.UpdateGatewayClusterhostEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新集群路由host
 * Summary: 更新集群路由host
 */
func (client *Client) UpdateGatewayClusterhostEx(request *UpdateGatewayClusterhostRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateGatewayClusterhostResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateGatewayClusterhostResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.openapi.gateway.clusterhost.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建静态路由
 * Summary: 创建静态路由
 */
func (client *Client) CreateGatewayStaticrouter(request *CreateGatewayStaticrouterRequest) (_result *CreateGatewayStaticrouterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateGatewayStaticrouterResponse{}
	_body, _err := client.CreateGatewayStaticrouterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建静态路由
 * Summary: 创建静态路由
 */
func (client *Client) CreateGatewayStaticrouterEx(request *CreateGatewayStaticrouterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateGatewayStaticrouterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateGatewayStaticrouterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.openapi.gateway.staticrouter.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询集群路由host
 * Summary: 查询集群路由host
 */
func (client *Client) QueryGatewayClusterhost(request *QueryGatewayClusterhostRequest) (_result *QueryGatewayClusterhostResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGatewayClusterhostResponse{}
	_body, _err := client.QueryGatewayClusterhostEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询集群路由host
 * Summary: 查询集群路由host
 */
func (client *Client) QueryGatewayClusterhostEx(request *QueryGatewayClusterhostRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGatewayClusterhostResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGatewayClusterhostResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.openapi.gateway.clusterhost.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 导入SDK信息
 * Summary: 导入SDK信息
 */
func (client *Client) ImportSdk(request *ImportSdkRequest) (_result *ImportSdkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportSdkResponse{}
	_body, _err := client.ImportSdkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 导入SDK信息
 * Summary: 导入SDK信息
 */
func (client *Client) ImportSdkEx(request *ImportSdkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportSdkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportSdkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.openapi.sdk.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
