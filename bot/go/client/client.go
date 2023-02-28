// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/v2/service"
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

// 资源定位信息
type BaiResourceLocation struct {
	// 资源定位类型
	// HTTP_URL：资源url
	// STRING_BASE64：资源base64字符串（不带base64头部）
	LocationType *string `json:"location_type,omitempty" xml:"location_type,omitempty" require:"true"`
	// 资源定位值
	LocationValue *string `json:"location_value,omitempty" xml:"location_value,omitempty" require:"true"`
}

func (s BaiResourceLocation) String() string {
	return tea.Prettify(s)
}

func (s BaiResourceLocation) GoString() string {
	return s.String()
}

func (s *BaiResourceLocation) SetLocationType(v string) *BaiResourceLocation {
	s.LocationType = &v
	return s
}

func (s *BaiResourceLocation) SetLocationValue(v string) *BaiResourceLocation {
	s.LocationValue = &v
	return s
}

// iot平台权限数据
type IotBasicPermissionData struct {
	// 权限编码
	PermissionCode *string `json:"permission_code,omitempty" xml:"permission_code,omitempty" require:"true"`
	// 权限名称
	PermissionName *string `json:"permission_name,omitempty" xml:"permission_name,omitempty" require:"true"`
	// 权限内容
	PermissionData *string `json:"permission_data,omitempty" xml:"permission_data,omitempty" require:"true"`
	// 权限类型
	PermissionType *string `json:"permission_type,omitempty" xml:"permission_type,omitempty" require:"true"`
	// 权限模块
	Module *string `json:"module,omitempty" xml:"module,omitempty" require:"true"`
}

func (s IotBasicPermissionData) String() string {
	return tea.Prettify(s)
}

func (s IotBasicPermissionData) GoString() string {
	return s.String()
}

func (s *IotBasicPermissionData) SetPermissionCode(v string) *IotBasicPermissionData {
	s.PermissionCode = &v
	return s
}

func (s *IotBasicPermissionData) SetPermissionName(v string) *IotBasicPermissionData {
	s.PermissionName = &v
	return s
}

func (s *IotBasicPermissionData) SetPermissionData(v string) *IotBasicPermissionData {
	s.PermissionData = &v
	return s
}

func (s *IotBasicPermissionData) SetPermissionType(v string) *IotBasicPermissionData {
	s.PermissionType = &v
	return s
}

func (s *IotBasicPermissionData) SetModule(v string) *IotBasicPermissionData {
	s.Module = &v
	return s
}

// sdk信息
type SdkModel struct {
	// 主键id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 设备SDK公钥
	VerifyKey *string `json:"verify_key,omitempty" xml:"verify_key,omitempty" require:"true"`
	// SDK版本号
	SdkVersionStr *string `json:"sdk_version_str,omitempty" xml:"sdk_version_str,omitempty"`
	// sdk模型
	MetaModel *string `json:"meta_model,omitempty" xml:"meta_model,omitempty"`
	// 平台
	Platform *string `json:"platform,omitempty" xml:"platform,omitempty"`
	// 公司名称
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty"`
}

func (s SdkModel) String() string {
	return tea.Prettify(s)
}

func (s SdkModel) GoString() string {
	return s.String()
}

func (s *SdkModel) SetId(v int64) *SdkModel {
	s.Id = &v
	return s
}

func (s *SdkModel) SetGmtCreate(v string) *SdkModel {
	s.GmtCreate = &v
	return s
}

func (s *SdkModel) SetGmtModified(v string) *SdkModel {
	s.GmtModified = &v
	return s
}

func (s *SdkModel) SetVerifyKey(v string) *SdkModel {
	s.VerifyKey = &v
	return s
}

func (s *SdkModel) SetSdkVersionStr(v string) *SdkModel {
	s.SdkVersionStr = &v
	return s
}

func (s *SdkModel) SetMetaModel(v string) *SdkModel {
	s.MetaModel = &v
	return s
}

func (s *SdkModel) SetPlatform(v string) *SdkModel {
	s.Platform = &v
	return s
}

func (s *SdkModel) SetCorpName(v string) *SdkModel {
	s.CorpName = &v
	return s
}

// GoodsIdAndCount
type GoodsIdAndCount struct {
	// 商品id
	GoodsSkuId *int64 `json:"goods_sku_id,omitempty" xml:"goods_sku_id,omitempty" require:"true"`
	// 商品采购数量
	Count *int64 `json:"count,omitempty" xml:"count,omitempty" require:"true"`
}

func (s GoodsIdAndCount) String() string {
	return tea.Prettify(s)
}

func (s GoodsIdAndCount) GoString() string {
	return s.String()
}

func (s *GoodsIdAndCount) SetGoodsSkuId(v int64) *GoodsIdAndCount {
	s.GoodsSkuId = &v
	return s
}

func (s *GoodsIdAndCount) SetCount(v int64) *GoodsIdAndCount {
	s.Count = &v
	return s
}

// ProductKey信息
type ProductKeyModel struct {
	// 主键id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 更新时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 设备端ProductKey
	ProductKey *string `json:"product_key,omitempty" xml:"product_key,omitempty" require:"true"`
	// 场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 租户Id
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty" require:"true"`
	// 数据模型id
	DataModelId *string `json:"data_model_id,omitempty" xml:"data_model_id,omitempty" require:"true"`
	// sdk前缀
	SdkVersionPrefix *string `json:"sdk_version_prefix,omitempty" xml:"sdk_version_prefix,omitempty" require:"true"`
	// 制造商
	Manufacturer *string `json:"manufacturer,omitempty" xml:"manufacturer,omitempty"`
	// 顾客
	Customer *string `json:"customer,omitempty" xml:"customer,omitempty"`
}

func (s ProductKeyModel) String() string {
	return tea.Prettify(s)
}

func (s ProductKeyModel) GoString() string {
	return s.String()
}

func (s *ProductKeyModel) SetId(v int64) *ProductKeyModel {
	s.Id = &v
	return s
}

func (s *ProductKeyModel) SetGmtCreate(v string) *ProductKeyModel {
	s.GmtCreate = &v
	return s
}

func (s *ProductKeyModel) SetGmtModified(v string) *ProductKeyModel {
	s.GmtModified = &v
	return s
}

func (s *ProductKeyModel) SetProductKey(v string) *ProductKeyModel {
	s.ProductKey = &v
	return s
}

func (s *ProductKeyModel) SetScene(v string) *ProductKeyModel {
	s.Scene = &v
	return s
}

func (s *ProductKeyModel) SetTenantName(v string) *ProductKeyModel {
	s.TenantName = &v
	return s
}

func (s *ProductKeyModel) SetDataModelId(v string) *ProductKeyModel {
	s.DataModelId = &v
	return s
}

func (s *ProductKeyModel) SetSdkVersionPrefix(v string) *ProductKeyModel {
	s.SdkVersionPrefix = &v
	return s
}

func (s *ProductKeyModel) SetManufacturer(v string) *ProductKeyModel {
	s.Manufacturer = &v
	return s
}

func (s *ProductKeyModel) SetCustomer(v string) *ProductKeyModel {
	s.Customer = &v
	return s
}

// 场景码信息
type SceneModel struct {
	// 主键id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 场景名
	SceneName *string `json:"scene_name,omitempty" xml:"scene_name,omitempty" require:"true"`
	// 是否托管
	Escrowed *string `json:"escrowed,omitempty" xml:"escrowed,omitempty"`
	// 私钥密码
	PrivateKeyPassword *string `json:"private_key_password,omitempty" xml:"private_key_password,omitempty"`
	// 租户
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty"`
	// 场景类型
	SceneType *string `json:"scene_type,omitempty" xml:"scene_type,omitempty"`
	// 是否跳过中台数据校验处理
	SkipPegasus *bool `json:"skip_pegasus,omitempty" xml:"skip_pegasus,omitempty"`
	// 定制数据处理类 , 使用用逗号分隔
	CustomerProcessor *string `json:"customer_processor,omitempty" xml:"customer_processor,omitempty"`
}

func (s SceneModel) String() string {
	return tea.Prettify(s)
}

func (s SceneModel) GoString() string {
	return s.String()
}

func (s *SceneModel) SetId(v int64) *SceneModel {
	s.Id = &v
	return s
}

func (s *SceneModel) SetGmtCreate(v string) *SceneModel {
	s.GmtCreate = &v
	return s
}

func (s *SceneModel) SetGmtModified(v string) *SceneModel {
	s.GmtModified = &v
	return s
}

func (s *SceneModel) SetSceneName(v string) *SceneModel {
	s.SceneName = &v
	return s
}

func (s *SceneModel) SetEscrowed(v string) *SceneModel {
	s.Escrowed = &v
	return s
}

func (s *SceneModel) SetPrivateKeyPassword(v string) *SceneModel {
	s.PrivateKeyPassword = &v
	return s
}

func (s *SceneModel) SetTenantName(v string) *SceneModel {
	s.TenantName = &v
	return s
}

func (s *SceneModel) SetSceneType(v string) *SceneModel {
	s.SceneType = &v
	return s
}

func (s *SceneModel) SetSkipPegasus(v bool) *SceneModel {
	s.SkipPegasus = &v
	return s
}

func (s *SceneModel) SetCustomerProcessor(v string) *SceneModel {
	s.CustomerProcessor = &v
	return s
}

// 数据校验失败返回体
type DataVerifyFailureData struct {
	// 主键id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// Alipay-0101
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 设备ID
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty"`
	// 发行设备ID
	DisDeviceId *string `json:"dis_device_id,omitempty" xml:"dis_device_id,omitempty"`
	// 类型：0:数据上报;1:数据完整性校验
	Type *int64 `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// c89b65a2e3afd604977c0....
	PublicKey *string `json:"public_key,omitempty" xml:"public_key,omitempty"`
	// 验签类型：0(RAW_DATA)；1(公钥格式为PEM)；2(公钥格式为DER)
	FormatType *int64 `json:"format_type,omitempty" xml:"format_type,omitempty"`
	// 验证内容hash
	ContentId *string `json:"content_id,omitempty" xml:"content_id,omitempty"`
	// 验证内容
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 签名
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty"`
	// 错误信息
	FailMessage *string `json:"fail_message,omitempty" xml:"fail_message,omitempty"`
	// 补充数据
	ExtraData *string `json:"extra_data,omitempty" xml:"extra_data,omitempty"`
	// 数据来源：0(普通数据上报)；1(MAAS数据上报)；2(设备业务数据上报);3(标签流转)
	Source *int64 `json:"source,omitempty" xml:"source,omitempty"`
}

func (s DataVerifyFailureData) String() string {
	return tea.Prettify(s)
}

func (s DataVerifyFailureData) GoString() string {
	return s.String()
}

func (s *DataVerifyFailureData) SetId(v int64) *DataVerifyFailureData {
	s.Id = &v
	return s
}

func (s *DataVerifyFailureData) SetGmtCreate(v string) *DataVerifyFailureData {
	s.GmtCreate = &v
	return s
}

func (s *DataVerifyFailureData) SetScene(v string) *DataVerifyFailureData {
	s.Scene = &v
	return s
}

func (s *DataVerifyFailureData) SetDeviceId(v string) *DataVerifyFailureData {
	s.DeviceId = &v
	return s
}

func (s *DataVerifyFailureData) SetDisDeviceId(v string) *DataVerifyFailureData {
	s.DisDeviceId = &v
	return s
}

func (s *DataVerifyFailureData) SetType(v int64) *DataVerifyFailureData {
	s.Type = &v
	return s
}

func (s *DataVerifyFailureData) SetPublicKey(v string) *DataVerifyFailureData {
	s.PublicKey = &v
	return s
}

func (s *DataVerifyFailureData) SetFormatType(v int64) *DataVerifyFailureData {
	s.FormatType = &v
	return s
}

func (s *DataVerifyFailureData) SetContentId(v string) *DataVerifyFailureData {
	s.ContentId = &v
	return s
}

func (s *DataVerifyFailureData) SetContent(v string) *DataVerifyFailureData {
	s.Content = &v
	return s
}

func (s *DataVerifyFailureData) SetSignature(v string) *DataVerifyFailureData {
	s.Signature = &v
	return s
}

func (s *DataVerifyFailureData) SetFailMessage(v string) *DataVerifyFailureData {
	s.FailMessage = &v
	return s
}

func (s *DataVerifyFailureData) SetExtraData(v string) *DataVerifyFailureData {
	s.ExtraData = &v
	return s
}

func (s *DataVerifyFailureData) SetSource(v int64) *DataVerifyFailureData {
	s.Source = &v
	return s
}

// 租户信息
type PermissionedTenantModel struct {
	// 主键Id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 租户名称
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty" require:"true"`
	// 公司名称
	OrgName *string `json:"org_name,omitempty" xml:"org_name,omitempty" require:"true"`
	// 租户所有人标识
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty"`
	// 网关私钥
	GatewayPrivateKey *string `json:"gateway_private_key,omitempty" xml:"gateway_private_key,omitempty"`
	// 网关公钥
	GatewayPublicKey *string `json:"gateway_public_key,omitempty" xml:"gateway_public_key,omitempty"`
}

func (s PermissionedTenantModel) String() string {
	return tea.Prettify(s)
}

func (s PermissionedTenantModel) GoString() string {
	return s.String()
}

func (s *PermissionedTenantModel) SetId(v int64) *PermissionedTenantModel {
	s.Id = &v
	return s
}

func (s *PermissionedTenantModel) SetGmtCreate(v string) *PermissionedTenantModel {
	s.GmtCreate = &v
	return s
}

func (s *PermissionedTenantModel) SetGmtModified(v string) *PermissionedTenantModel {
	s.GmtModified = &v
	return s
}

func (s *PermissionedTenantModel) SetTenantName(v string) *PermissionedTenantModel {
	s.TenantName = &v
	return s
}

func (s *PermissionedTenantModel) SetOrgName(v string) *PermissionedTenantModel {
	s.OrgName = &v
	return s
}

func (s *PermissionedTenantModel) SetOwner(v string) *PermissionedTenantModel {
	s.Owner = &v
	return s
}

func (s *PermissionedTenantModel) SetGatewayPrivateKey(v string) *PermissionedTenantModel {
	s.GatewayPrivateKey = &v
	return s
}

func (s *PermissionedTenantModel) SetGatewayPublicKey(v string) *PermissionedTenantModel {
	s.GatewayPublicKey = &v
	return s
}

// 商品单点鉴定结果
type BaiGoodsPointIdentificationResult struct {
	// 鉴定点大项名称
	PointName *string `json:"point_name,omitempty" xml:"point_name,omitempty" require:"true"`
	// 鉴定点子项名称
	SubPointName *string `json:"sub_point_name,omitempty" xml:"sub_point_name,omitempty" require:"true"`
	// 单点鉴定结果
	// REAL：鉴定为真
	// FAKE：鉴定为假
	// UNABLE_IDENTIFY：无法鉴定
	Result *string `json:"result,omitempty" xml:"result,omitempty" require:"true"`
	// 鉴定分数
	Grade *string `json:"grade,omitempty" xml:"grade,omitempty"`
	// 用户侧的鉴定点point_id，直接将用户传入的user_point_id返回
	UserPointId *string `json:"user_point_id,omitempty" xml:"user_point_id,omitempty"`
	// 鉴定评价
	AppraiseMessage *string `json:"appraise_message,omitempty" xml:"appraise_message,omitempty"`
	// 鉴定点图片资源定位符
	ResourceLocation *BaiResourceLocation `json:"resource_location,omitempty" xml:"resource_location,omitempty"`
}

func (s BaiGoodsPointIdentificationResult) String() string {
	return tea.Prettify(s)
}

func (s BaiGoodsPointIdentificationResult) GoString() string {
	return s.String()
}

func (s *BaiGoodsPointIdentificationResult) SetPointName(v string) *BaiGoodsPointIdentificationResult {
	s.PointName = &v
	return s
}

func (s *BaiGoodsPointIdentificationResult) SetSubPointName(v string) *BaiGoodsPointIdentificationResult {
	s.SubPointName = &v
	return s
}

func (s *BaiGoodsPointIdentificationResult) SetResult(v string) *BaiGoodsPointIdentificationResult {
	s.Result = &v
	return s
}

func (s *BaiGoodsPointIdentificationResult) SetGrade(v string) *BaiGoodsPointIdentificationResult {
	s.Grade = &v
	return s
}

func (s *BaiGoodsPointIdentificationResult) SetUserPointId(v string) *BaiGoodsPointIdentificationResult {
	s.UserPointId = &v
	return s
}

func (s *BaiGoodsPointIdentificationResult) SetAppraiseMessage(v string) *BaiGoodsPointIdentificationResult {
	s.AppraiseMessage = &v
	return s
}

func (s *BaiGoodsPointIdentificationResult) SetResourceLocation(v *BaiResourceLocation) *BaiGoodsPointIdentificationResult {
	s.ResourceLocation = v
	return s
}

// 商品数字指纹子鉴定项鉴定结果
type GoodsDigitalFingerprintPointIdentificationResult struct {
	// 子鉴定项
	SubPointName *string `json:"sub_point_name,omitempty" xml:"sub_point_name,omitempty" require:"true"`
	// 商品数字指纹鉴定子项鉴定结果
	Result *string `json:"result,omitempty" xml:"result,omitempty" require:"true"`
	// 鉴定子项鉴定得分
	Grade *string `json:"grade,omitempty" xml:"grade,omitempty" require:"true"`
}

func (s GoodsDigitalFingerprintPointIdentificationResult) String() string {
	return tea.Prettify(s)
}

func (s GoodsDigitalFingerprintPointIdentificationResult) GoString() string {
	return s.String()
}

func (s *GoodsDigitalFingerprintPointIdentificationResult) SetSubPointName(v string) *GoodsDigitalFingerprintPointIdentificationResult {
	s.SubPointName = &v
	return s
}

func (s *GoodsDigitalFingerprintPointIdentificationResult) SetResult(v string) *GoodsDigitalFingerprintPointIdentificationResult {
	s.Result = &v
	return s
}

func (s *GoodsDigitalFingerprintPointIdentificationResult) SetGrade(v string) *GoodsDigitalFingerprintPointIdentificationResult {
	s.Grade = &v
	return s
}

// 商品数字指纹鉴定点
type GoodsDigitalFingerprintPoint struct {
	// 鉴定点子项
	SubPointName *string `json:"sub_point_name,omitempty" xml:"sub_point_name,omitempty" require:"true"`
	// 微观图片url
	MicroImageUrl *string `json:"micro_image_url,omitempty" xml:"micro_image_url,omitempty" require:"true"`
	// 宏观图片url
	MacroImageUrl *string `json:"macro_image_url,omitempty" xml:"macro_image_url,omitempty" require:"true"`
}

func (s GoodsDigitalFingerprintPoint) String() string {
	return tea.Prettify(s)
}

func (s GoodsDigitalFingerprintPoint) GoString() string {
	return s.String()
}

func (s *GoodsDigitalFingerprintPoint) SetSubPointName(v string) *GoodsDigitalFingerprintPoint {
	s.SubPointName = &v
	return s
}

func (s *GoodsDigitalFingerprintPoint) SetMicroImageUrl(v string) *GoodsDigitalFingerprintPoint {
	s.MicroImageUrl = &v
	return s
}

func (s *GoodsDigitalFingerprintPoint) SetMacroImageUrl(v string) *GoodsDigitalFingerprintPoint {
	s.MacroImageUrl = &v
	return s
}

// 告警策略
type AlertStrategy struct {
	// 主键ID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 更新时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 租户
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty" require:"true"`
	// 场景码
	//
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty"`
	// 策略类型：DEBUG（技术联调）；MONITOR（生产监控）
	StrategyType *string `json:"strategy_type,omitempty" xml:"strategy_type,omitempty" require:"true"`
	// 策略详情，json格式
	StrategyDetail *string `json:"strategy_detail,omitempty" xml:"strategy_detail,omitempty" require:"true"`
	// 是否启用，默认false
	Enabled *bool `json:"enabled,omitempty" xml:"enabled,omitempty" require:"true"`
	// 备注
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
}

func (s AlertStrategy) String() string {
	return tea.Prettify(s)
}

func (s AlertStrategy) GoString() string {
	return s.String()
}

func (s *AlertStrategy) SetId(v int64) *AlertStrategy {
	s.Id = &v
	return s
}

func (s *AlertStrategy) SetGmtCreate(v string) *AlertStrategy {
	s.GmtCreate = &v
	return s
}

func (s *AlertStrategy) SetGmtModified(v string) *AlertStrategy {
	s.GmtModified = &v
	return s
}

func (s *AlertStrategy) SetTenantName(v string) *AlertStrategy {
	s.TenantName = &v
	return s
}

func (s *AlertStrategy) SetScene(v string) *AlertStrategy {
	s.Scene = &v
	return s
}

func (s *AlertStrategy) SetStrategyType(v string) *AlertStrategy {
	s.StrategyType = &v
	return s
}

func (s *AlertStrategy) SetStrategyDetail(v string) *AlertStrategy {
	s.StrategyDetail = &v
	return s
}

func (s *AlertStrategy) SetEnabled(v bool) *AlertStrategy {
	s.Enabled = &v
	return s
}

func (s *AlertStrategy) SetRemark(v string) *AlertStrategy {
	s.Remark = &v
	return s
}

// 商品的鉴定点图片信息
type BaiGoodsPoint struct {
	// 鉴定点名称
	PointName *string `json:"point_name,omitempty" xml:"point_name,omitempty" require:"true"`
	// 鉴定点子项
	SubPointName *string `json:"sub_point_name,omitempty" xml:"sub_point_name,omitempty" require:"true"`
	// 鉴定点图片的url
	ImageUrl *string `json:"image_url,omitempty" xml:"image_url,omitempty"`
	// 图片内容base64编码的字符串，该字段与image_url至少一个非空，同时传入以image_url为准
	ImageBase64 *string `json:"image_base64,omitempty" xml:"image_base64,omitempty"`
	// 用户侧鉴定单关联id
	UserPointId *string `json:"user_point_id,omitempty" xml:"user_point_id,omitempty"`
}

func (s BaiGoodsPoint) String() string {
	return tea.Prettify(s)
}

func (s BaiGoodsPoint) GoString() string {
	return s.String()
}

func (s *BaiGoodsPoint) SetPointName(v string) *BaiGoodsPoint {
	s.PointName = &v
	return s
}

func (s *BaiGoodsPoint) SetSubPointName(v string) *BaiGoodsPoint {
	s.SubPointName = &v
	return s
}

func (s *BaiGoodsPoint) SetImageUrl(v string) *BaiGoodsPoint {
	s.ImageUrl = &v
	return s
}

func (s *BaiGoodsPoint) SetImageBase64(v string) *BaiGoodsPoint {
	s.ImageBase64 = &v
	return s
}

func (s *BaiGoodsPoint) SetUserPointId(v string) *BaiGoodsPoint {
	s.UserPointId = &v
	return s
}

// 设备采购订单元素
type IotBasicDeviceOrderItem struct {
	// 蚂蚁链IoT平台设备唯一ID
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty" require:"true"`
	// 设备唯一编号
	DeviceSn *string `json:"device_sn,omitempty" xml:"device_sn,omitempty" require:"true"`
	// 设备金额，精确到小数后两位
	PaymentAmount *string `json:"payment_amount,omitempty" xml:"payment_amount,omitempty" require:"true"`
}

func (s IotBasicDeviceOrderItem) String() string {
	return tea.Prettify(s)
}

func (s IotBasicDeviceOrderItem) GoString() string {
	return s.String()
}

func (s *IotBasicDeviceOrderItem) SetDeviceDid(v string) *IotBasicDeviceOrderItem {
	s.DeviceDid = &v
	return s
}

func (s *IotBasicDeviceOrderItem) SetDeviceSn(v string) *IotBasicDeviceOrderItem {
	s.DeviceSn = &v
	return s
}

func (s *IotBasicDeviceOrderItem) SetPaymentAmount(v string) *IotBasicDeviceOrderItem {
	s.PaymentAmount = &v
	return s
}

// 原始数据包
type RawData struct {
	// 链上设备id
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty"`
	// 数据内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 设备id
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty"`
	// 上链哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 上链时间
	TxTime *int64 `json:"tx_time,omitempty" xml:"tx_time,omitempty" require:"true"`
	// 链上外围设备ID
	ChainPeripheralId *string `json:"chain_peripheral_id,omitempty" xml:"chain_peripheral_id,omitempty"`
	// 外围设备ID
	PeripheralId *string `json:"peripheral_id,omitempty" xml:"peripheral_id,omitempty"`
}

func (s RawData) String() string {
	return tea.Prettify(s)
}

func (s RawData) GoString() string {
	return s.String()
}

func (s *RawData) SetChainDeviceId(v string) *RawData {
	s.ChainDeviceId = &v
	return s
}

func (s *RawData) SetContent(v string) *RawData {
	s.Content = &v
	return s
}

func (s *RawData) SetDeviceId(v string) *RawData {
	s.DeviceId = &v
	return s
}

func (s *RawData) SetTxHash(v string) *RawData {
	s.TxHash = &v
	return s
}

func (s *RawData) SetTxTime(v int64) *RawData {
	s.TxTime = &v
	return s
}

func (s *RawData) SetChainPeripheralId(v string) *RawData {
	s.ChainPeripheralId = &v
	return s
}

func (s *RawData) SetPeripheralId(v string) *RawData {
	s.PeripheralId = &v
	return s
}

// iot平台角色信息
type IotBasicRolePermission struct {
	// 角色编码
	RoleCode *string `json:"role_code,omitempty" xml:"role_code,omitempty" require:"true"`
	// 角色名称
	RoleName *string `json:"role_name,omitempty" xml:"role_name,omitempty" require:"true"`
	// 权限列表
	PermissionList []*IotBasicPermissionData `json:"permission_list,omitempty" xml:"permission_list,omitempty" require:"true" type:"Repeated"`
}

func (s IotBasicRolePermission) String() string {
	return tea.Prettify(s)
}

func (s IotBasicRolePermission) GoString() string {
	return s.String()
}

func (s *IotBasicRolePermission) SetRoleCode(v string) *IotBasicRolePermission {
	s.RoleCode = &v
	return s
}

func (s *IotBasicRolePermission) SetRoleName(v string) *IotBasicRolePermission {
	s.RoleName = &v
	return s
}

func (s *IotBasicRolePermission) SetPermissionList(v []*IotBasicPermissionData) *IotBasicRolePermission {
	s.PermissionList = v
	return s
}

// 商品数字指纹鉴定结果
type GoodsDigitalFingerprintIdentifyResultData struct {
	// 鉴定结果
	IdentificationResult *string `json:"identification_result,omitempty" xml:"identification_result,omitempty" require:"true"`
	// 鉴定结果描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 商品数字指纹鉴定点鉴定结果列表
	PointIdentificationResults []*GoodsDigitalFingerprintPointIdentificationResult `json:"point_identification_results,omitempty" xml:"point_identification_results,omitempty" require:"true" type:"Repeated"`
}

func (s GoodsDigitalFingerprintIdentifyResultData) String() string {
	return tea.Prettify(s)
}

func (s GoodsDigitalFingerprintIdentifyResultData) GoString() string {
	return s.String()
}

func (s *GoodsDigitalFingerprintIdentifyResultData) SetIdentificationResult(v string) *GoodsDigitalFingerprintIdentifyResultData {
	s.IdentificationResult = &v
	return s
}

func (s *GoodsDigitalFingerprintIdentifyResultData) SetDescription(v string) *GoodsDigitalFingerprintIdentifyResultData {
	s.Description = &v
	return s
}

func (s *GoodsDigitalFingerprintIdentifyResultData) SetPointIdentificationResults(v []*GoodsDigitalFingerprintPointIdentificationResult) *GoodsDigitalFingerprintIdentifyResultData {
	s.PointIdentificationResults = v
	return s
}

// 租赁合同信息
type RentContractInfo struct {
	// 租赁合同ID
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty" require:"true"`
	// 租约时间
	LeaseTime *string `json:"lease_time,omitempty" xml:"lease_time,omitempty" require:"true"`
	// 入住时间
	CheckinDate *string `json:"checkin_date,omitempty" xml:"checkin_date,omitempty" require:"true"`
	// 退租时间
	CheckoutDate *string `json:"checkout_date,omitempty" xml:"checkout_date,omitempty" require:"true"`
}

func (s RentContractInfo) String() string {
	return tea.Prettify(s)
}

func (s RentContractInfo) GoString() string {
	return s.String()
}

func (s *RentContractInfo) SetContractId(v string) *RentContractInfo {
	s.ContractId = &v
	return s
}

func (s *RentContractInfo) SetLeaseTime(v string) *RentContractInfo {
	s.LeaseTime = &v
	return s
}

func (s *RentContractInfo) SetCheckinDate(v string) *RentContractInfo {
	s.CheckinDate = &v
	return s
}

func (s *RentContractInfo) SetCheckoutDate(v string) *RentContractInfo {
	s.CheckoutDate = &v
	return s
}

// Sdk分页查询结果
type SdkPageResponse struct {
	// 页数
	//
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
	// 页码
	//
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 总记录数
	//
	TotalSize *int64 `json:"total_size,omitempty" xml:"total_size,omitempty" require:"true"`
	// 总页数
	//
	TotalPages *int64 `json:"total_pages,omitempty" xml:"total_pages,omitempty" require:"true"`
	// 数据
	PageData []*SdkModel `json:"page_data,omitempty" xml:"page_data,omitempty" require:"true" type:"Repeated"`
}

func (s SdkPageResponse) String() string {
	return tea.Prettify(s)
}

func (s SdkPageResponse) GoString() string {
	return s.String()
}

func (s *SdkPageResponse) SetPageIndex(v int64) *SdkPageResponse {
	s.PageIndex = &v
	return s
}

func (s *SdkPageResponse) SetPageSize(v int64) *SdkPageResponse {
	s.PageSize = &v
	return s
}

func (s *SdkPageResponse) SetTotalSize(v int64) *SdkPageResponse {
	s.TotalSize = &v
	return s
}

func (s *SdkPageResponse) SetTotalPages(v int64) *SdkPageResponse {
	s.TotalPages = &v
	return s
}

func (s *SdkPageResponse) SetPageData(v []*SdkModel) *SdkPageResponse {
	s.PageData = v
	return s
}

// 查询设备列表结构体
type IotBasicDeviceQueryResponse struct {
	// 设备名称
	//
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty" require:"true"`
	// 设备序列号
	DeviceSn *string `json:"device_sn,omitempty" xml:"device_sn,omitempty" require:"true"`
	// 设备品类名称
	DeviceCategoryName *string `json:"device_category_name,omitempty" xml:"device_category_name,omitempty" require:"true"`
	// 设备型号
	DeviceModel *string `json:"device_model,omitempty" xml:"device_model,omitempty" require:"true"`
	// 设备状态
	DeviceStatus *string `json:"device_status,omitempty" xml:"device_status,omitempty"`
	// 设备安装位置
	Location *string `json:"location,omitempty" xml:"location,omitempty"`
	// 设备注册时间
	RegisterTime *string `json:"register_time,omitempty" xml:"register_time,omitempty" require:"true"`
	// 设备厂商
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty" require:"true"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 客户名称
	CustomerName *string `json:"customer_name,omitempty" xml:"customer_name,omitempty" require:"true"`
	// 异常错误码
	AbnormalCode *string `json:"abnormal_code,omitempty" xml:"abnormal_code,omitempty"`
	// 设备唯一身份id
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty"`
	// 账号ID
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// 账户名称
	AccountName *string `json:"account_name,omitempty" xml:"account_name,omitempty" require:"true"`
	// 设备服务状态
	ServiceStatus *string `json:"service_status,omitempty" xml:"service_status,omitempty" require:"true"`
	// 应用版本号
	AppVersion *string `json:"app_version,omitempty" xml:"app_version,omitempty" require:"true"`
	// 服务有效期
	ValidityTime *string `json:"validity_time,omitempty" xml:"validity_time,omitempty"`
}

func (s IotBasicDeviceQueryResponse) String() string {
	return tea.Prettify(s)
}

func (s IotBasicDeviceQueryResponse) GoString() string {
	return s.String()
}

func (s *IotBasicDeviceQueryResponse) SetDeviceName(v string) *IotBasicDeviceQueryResponse {
	s.DeviceName = &v
	return s
}

func (s *IotBasicDeviceQueryResponse) SetDeviceSn(v string) *IotBasicDeviceQueryResponse {
	s.DeviceSn = &v
	return s
}

func (s *IotBasicDeviceQueryResponse) SetDeviceCategoryName(v string) *IotBasicDeviceQueryResponse {
	s.DeviceCategoryName = &v
	return s
}

func (s *IotBasicDeviceQueryResponse) SetDeviceModel(v string) *IotBasicDeviceQueryResponse {
	s.DeviceModel = &v
	return s
}

func (s *IotBasicDeviceQueryResponse) SetDeviceStatus(v string) *IotBasicDeviceQueryResponse {
	s.DeviceStatus = &v
	return s
}

func (s *IotBasicDeviceQueryResponse) SetLocation(v string) *IotBasicDeviceQueryResponse {
	s.Location = &v
	return s
}

func (s *IotBasicDeviceQueryResponse) SetRegisterTime(v string) *IotBasicDeviceQueryResponse {
	s.RegisterTime = &v
	return s
}

func (s *IotBasicDeviceQueryResponse) SetCorpName(v string) *IotBasicDeviceQueryResponse {
	s.CorpName = &v
	return s
}

func (s *IotBasicDeviceQueryResponse) SetTenantId(v string) *IotBasicDeviceQueryResponse {
	s.TenantId = &v
	return s
}

func (s *IotBasicDeviceQueryResponse) SetCustomerName(v string) *IotBasicDeviceQueryResponse {
	s.CustomerName = &v
	return s
}

func (s *IotBasicDeviceQueryResponse) SetAbnormalCode(v string) *IotBasicDeviceQueryResponse {
	s.AbnormalCode = &v
	return s
}

func (s *IotBasicDeviceQueryResponse) SetDeviceDid(v string) *IotBasicDeviceQueryResponse {
	s.DeviceDid = &v
	return s
}

func (s *IotBasicDeviceQueryResponse) SetAccountId(v string) *IotBasicDeviceQueryResponse {
	s.AccountId = &v
	return s
}

func (s *IotBasicDeviceQueryResponse) SetAccountName(v string) *IotBasicDeviceQueryResponse {
	s.AccountName = &v
	return s
}

func (s *IotBasicDeviceQueryResponse) SetServiceStatus(v string) *IotBasicDeviceQueryResponse {
	s.ServiceStatus = &v
	return s
}

func (s *IotBasicDeviceQueryResponse) SetAppVersion(v string) *IotBasicDeviceQueryResponse {
	s.AppVersion = &v
	return s
}

func (s *IotBasicDeviceQueryResponse) SetValidityTime(v string) *IotBasicDeviceQueryResponse {
	s.ValidityTime = &v
	return s
}

// 租户关联信息请求结构体
type TenantBindInfoReq struct {
	// 租户关联扩展信息
	Extension *string `json:"extension,omitempty" xml:"extension,omitempty"`
	// 业务类型，默认空
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 组织机构代码，可为中文
	TenantUid *string `json:"tenant_uid,omitempty" xml:"tenant_uid,omitempty" require:"true"`
	// 组织结构名称
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
}

func (s TenantBindInfoReq) String() string {
	return tea.Prettify(s)
}

func (s TenantBindInfoReq) GoString() string {
	return s.String()
}

func (s *TenantBindInfoReq) SetExtension(v string) *TenantBindInfoReq {
	s.Extension = &v
	return s
}

func (s *TenantBindInfoReq) SetBizType(v string) *TenantBindInfoReq {
	s.BizType = &v
	return s
}

func (s *TenantBindInfoReq) SetTenantUid(v string) *TenantBindInfoReq {
	s.TenantUid = &v
	return s
}

func (s *TenantBindInfoReq) SetUserName(v string) *TenantBindInfoReq {
	s.UserName = &v
	return s
}

// 设备注册 请求对象
type IotBasicDeviceRegisterInfo struct {
	// 设备规格
	DeviceSpecs *string `json:"device_specs,omitempty" xml:"device_specs,omitempty" require:"true"`
	// 设备型号
	DeviceModel *string `json:"device_model,omitempty" xml:"device_model,omitempty" require:"true"`
	// 设备名称
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty" require:"true"`
	// 设备sn
	DeviceSn *string `json:"device_sn,omitempty" xml:"device_sn,omitempty" require:"true"`
	// 设备标签
	NickName *string `json:"nick_name,omitempty" xml:"nick_name,omitempty"`
	// 安装位置
	Location *string `json:"location,omitempty" xml:"location,omitempty"`
	// 设备扩展信息
	DeviceExt *string `json:"device_ext,omitempty" xml:"device_ext,omitempty"`
	// 设备安全认证ID
	SecId *string `json:"sec_id,omitempty" xml:"sec_id,omitempty"`
}

func (s IotBasicDeviceRegisterInfo) String() string {
	return tea.Prettify(s)
}

func (s IotBasicDeviceRegisterInfo) GoString() string {
	return s.String()
}

func (s *IotBasicDeviceRegisterInfo) SetDeviceSpecs(v string) *IotBasicDeviceRegisterInfo {
	s.DeviceSpecs = &v
	return s
}

func (s *IotBasicDeviceRegisterInfo) SetDeviceModel(v string) *IotBasicDeviceRegisterInfo {
	s.DeviceModel = &v
	return s
}

func (s *IotBasicDeviceRegisterInfo) SetDeviceName(v string) *IotBasicDeviceRegisterInfo {
	s.DeviceName = &v
	return s
}

func (s *IotBasicDeviceRegisterInfo) SetDeviceSn(v string) *IotBasicDeviceRegisterInfo {
	s.DeviceSn = &v
	return s
}

func (s *IotBasicDeviceRegisterInfo) SetNickName(v string) *IotBasicDeviceRegisterInfo {
	s.NickName = &v
	return s
}

func (s *IotBasicDeviceRegisterInfo) SetLocation(v string) *IotBasicDeviceRegisterInfo {
	s.Location = &v
	return s
}

func (s *IotBasicDeviceRegisterInfo) SetDeviceExt(v string) *IotBasicDeviceRegisterInfo {
	s.DeviceExt = &v
	return s
}

func (s *IotBasicDeviceRegisterInfo) SetSecId(v string) *IotBasicDeviceRegisterInfo {
	s.SecId = &v
	return s
}

// 溯源码比对请求体
type BaiQrcodeComparisonReqData struct {
	// 扫码操作id，多次请求的trace_id相同代表短时间内在扫同一个码
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true" maxLength:"128"`
	// query图片定位信息
	QueryImageLocation *BaiResourceLocation `json:"query_image_location,omitempty" xml:"query_image_location,omitempty" require:"true"`
	// gallery图片定位信息
	GalleryImageLocation *BaiResourceLocation `json:"gallery_image_location,omitempty" xml:"gallery_image_location,omitempty" require:"true"`
	// 是否允许降级
	Downgrade *bool `json:"downgrade,omitempty" xml:"downgrade,omitempty" require:"true"`
}

func (s BaiQrcodeComparisonReqData) String() string {
	return tea.Prettify(s)
}

func (s BaiQrcodeComparisonReqData) GoString() string {
	return s.String()
}

func (s *BaiQrcodeComparisonReqData) SetTraceId(v string) *BaiQrcodeComparisonReqData {
	s.TraceId = &v
	return s
}

func (s *BaiQrcodeComparisonReqData) SetQueryImageLocation(v *BaiResourceLocation) *BaiQrcodeComparisonReqData {
	s.QueryImageLocation = v
	return s
}

func (s *BaiQrcodeComparisonReqData) SetGalleryImageLocation(v *BaiResourceLocation) *BaiQrcodeComparisonReqData {
	s.GalleryImageLocation = v
	return s
}

func (s *BaiQrcodeComparisonReqData) SetDowngrade(v bool) *BaiQrcodeComparisonReqData {
	s.Downgrade = &v
	return s
}

// 仓库实体身份附加参数请求结构体，应用在注册/更新API的ThingExtraParams
type WarehouseReqModel struct {
	// 详细地址
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 面积 平方米单位*1e4
	Area *int64 `json:"area,omitempty" xml:"area,omitempty"`
	// 海拔 米单位*1e2
	Elevation *int64 `json:"elevation,omitempty" xml:"elevation,omitempty"`
	// 仓库高度 米单位*1e2
	Height *int64 `json:"height,omitempty" xml:"height,omitempty"`
	// 纬度 度数单位*1e9
	Latitude *int64 `json:"latitude,omitempty" xml:"latitude,omitempty"`
	// 经度 度数单位*1e9
	Longitude *int64 `json:"longitude,omitempty" xml:"longitude,omitempty"`
	// 所在国家，中国
	Nation *string `json:"nation,omitempty" xml:"nation,omitempty"`
	// 其他信息
	OtherInfo *string `json:"other_info,omitempty" xml:"other_info,omitempty"`
	// 仓库状态, AVAILABLE, IN_USE, DELETED, 自定义
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 仓库类型
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s WarehouseReqModel) String() string {
	return tea.Prettify(s)
}

func (s WarehouseReqModel) GoString() string {
	return s.String()
}

func (s *WarehouseReqModel) SetAddress(v string) *WarehouseReqModel {
	s.Address = &v
	return s
}

func (s *WarehouseReqModel) SetArea(v int64) *WarehouseReqModel {
	s.Area = &v
	return s
}

func (s *WarehouseReqModel) SetElevation(v int64) *WarehouseReqModel {
	s.Elevation = &v
	return s
}

func (s *WarehouseReqModel) SetHeight(v int64) *WarehouseReqModel {
	s.Height = &v
	return s
}

func (s *WarehouseReqModel) SetLatitude(v int64) *WarehouseReqModel {
	s.Latitude = &v
	return s
}

func (s *WarehouseReqModel) SetLongitude(v int64) *WarehouseReqModel {
	s.Longitude = &v
	return s
}

func (s *WarehouseReqModel) SetNation(v string) *WarehouseReqModel {
	s.Nation = &v
	return s
}

func (s *WarehouseReqModel) SetOtherInfo(v string) *WarehouseReqModel {
	s.OtherInfo = &v
	return s
}

func (s *WarehouseReqModel) SetStatus(v string) *WarehouseReqModel {
	s.Status = &v
	return s
}

func (s *WarehouseReqModel) SetType(v string) *WarehouseReqModel {
	s.Type = &v
	return s
}

// PurchaseOrderInfoDetail
type PurchaseOrderInfoDetail struct {
	// 租赁订单号
	//
	OrderNumber *string `json:"order_number,omitempty" xml:"order_number,omitempty" require:"true"`
	// 收货人姓名
	//
	ConsigneeName *string `json:"consignee_name,omitempty" xml:"consignee_name,omitempty" require:"true"`
	// 收货人身份证号
	ConsigneeIdNumber *string `json:"consignee_id_number,omitempty" xml:"consignee_id_number,omitempty" require:"true"`
	// 收货人手机号
	//
	ConsigneePhone *string `json:"consignee_phone,omitempty" xml:"consignee_phone,omitempty" require:"true"`
	// 收货人地址
	ConsigneeAddress *string `json:"consignee_address,omitempty" xml:"consignee_address,omitempty" require:"true"`
	// 供货商名称
	//
	SupplierName *string `json:"supplier_name,omitempty" xml:"supplier_name,omitempty" require:"true"`
	// 供货商租户id
	//
	SupplierId *string `json:"supplier_id,omitempty" xml:"supplier_id,omitempty" require:"true"`
	// 采购商id
	//
	LeaseId *string `json:"lease_id,omitempty" xml:"lease_id,omitempty" require:"true"`
	// 商品信息列表
	GoodsIdAndCount []*GoodsIdAndCount `json:"goods_id_and_count,omitempty" xml:"goods_id_and_count,omitempty" require:"true" type:"Repeated"`
}

func (s PurchaseOrderInfoDetail) String() string {
	return tea.Prettify(s)
}

func (s PurchaseOrderInfoDetail) GoString() string {
	return s.String()
}

func (s *PurchaseOrderInfoDetail) SetOrderNumber(v string) *PurchaseOrderInfoDetail {
	s.OrderNumber = &v
	return s
}

func (s *PurchaseOrderInfoDetail) SetConsigneeName(v string) *PurchaseOrderInfoDetail {
	s.ConsigneeName = &v
	return s
}

func (s *PurchaseOrderInfoDetail) SetConsigneeIdNumber(v string) *PurchaseOrderInfoDetail {
	s.ConsigneeIdNumber = &v
	return s
}

func (s *PurchaseOrderInfoDetail) SetConsigneePhone(v string) *PurchaseOrderInfoDetail {
	s.ConsigneePhone = &v
	return s
}

func (s *PurchaseOrderInfoDetail) SetConsigneeAddress(v string) *PurchaseOrderInfoDetail {
	s.ConsigneeAddress = &v
	return s
}

func (s *PurchaseOrderInfoDetail) SetSupplierName(v string) *PurchaseOrderInfoDetail {
	s.SupplierName = &v
	return s
}

func (s *PurchaseOrderInfoDetail) SetSupplierId(v string) *PurchaseOrderInfoDetail {
	s.SupplierId = &v
	return s
}

func (s *PurchaseOrderInfoDetail) SetLeaseId(v string) *PurchaseOrderInfoDetail {
	s.LeaseId = &v
	return s
}

func (s *PurchaseOrderInfoDetail) SetGoodsIdAndCount(v []*GoodsIdAndCount) *PurchaseOrderInfoDetail {
	s.GoodsIdAndCount = v
	return s
}

// 设备不可操作标识类
type DeviceDisableData struct {
	// 设备sn号
	DeviceSn *string `json:"device_sn,omitempty" xml:"device_sn,omitempty" require:"true"`
	// 厂商
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty" require:"true"`
}

func (s DeviceDisableData) String() string {
	return tea.Prettify(s)
}

func (s DeviceDisableData) GoString() string {
	return s.String()
}

func (s *DeviceDisableData) SetDeviceSn(v string) *DeviceDisableData {
	s.DeviceSn = &v
	return s
}

func (s *DeviceDisableData) SetCorpName(v string) *DeviceDisableData {
	s.CorpName = &v
	return s
}

// 设备属性关系对象
type IotDeviceAttributeRelationshipData struct {
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 设备品类名称
	DeviceCategory *string `json:"device_category,omitempty" xml:"device_category,omitempty" require:"true"`
	// 关系类型
	RelationType *string `json:"relation_type,omitempty" xml:"relation_type,omitempty" require:"true"`
	// 厂商名称
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty"`
	// 设备型号
	DeviceModel *string `json:"device_model,omitempty" xml:"device_model,omitempty"`
	// 设备规格
	DeviceSpecs *string `json:"device_specs,omitempty" xml:"device_specs,omitempty"`
	// 硬件模块
	HardwareModule *string `json:"hardware_module,omitempty" xml:"hardware_module,omitempty"`
}

func (s IotDeviceAttributeRelationshipData) String() string {
	return tea.Prettify(s)
}

func (s IotDeviceAttributeRelationshipData) GoString() string {
	return s.String()
}

func (s *IotDeviceAttributeRelationshipData) SetId(v int64) *IotDeviceAttributeRelationshipData {
	s.Id = &v
	return s
}

func (s *IotDeviceAttributeRelationshipData) SetDeviceCategory(v string) *IotDeviceAttributeRelationshipData {
	s.DeviceCategory = &v
	return s
}

func (s *IotDeviceAttributeRelationshipData) SetRelationType(v string) *IotDeviceAttributeRelationshipData {
	s.RelationType = &v
	return s
}

func (s *IotDeviceAttributeRelationshipData) SetCorpName(v string) *IotDeviceAttributeRelationshipData {
	s.CorpName = &v
	return s
}

func (s *IotDeviceAttributeRelationshipData) SetDeviceModel(v string) *IotDeviceAttributeRelationshipData {
	s.DeviceModel = &v
	return s
}

func (s *IotDeviceAttributeRelationshipData) SetDeviceSpecs(v string) *IotDeviceAttributeRelationshipData {
	s.DeviceSpecs = &v
	return s
}

func (s *IotDeviceAttributeRelationshipData) SetHardwareModule(v string) *IotDeviceAttributeRelationshipData {
	s.HardwareModule = &v
	return s
}

// 创建订单失败的返回结构体
type InsertPurchaseOrderFailInfo struct {
	// 订单ID
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 订单保存失败的原因
	FailReason *string `json:"fail_reason,omitempty" xml:"fail_reason,omitempty" require:"true"`
}

func (s InsertPurchaseOrderFailInfo) String() string {
	return tea.Prettify(s)
}

func (s InsertPurchaseOrderFailInfo) GoString() string {
	return s.String()
}

func (s *InsertPurchaseOrderFailInfo) SetOrderId(v string) *InsertPurchaseOrderFailInfo {
	s.OrderId = &v
	return s
}

func (s *InsertPurchaseOrderFailInfo) SetFailReason(v string) *InsertPurchaseOrderFailInfo {
	s.FailReason = &v
	return s
}

// 菜鸟分拣机设备监控信息
type ScfLeaseEqpInfo struct {
	// 设备类型
	DeviceType *string `json:"device_type,omitempty" xml:"device_type,omitempty"`
	// 运营日期
	OperationDate *string `json:"operation_date,omitempty" xml:"operation_date,omitempty"`
	// 修改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty"`
	// 维修金比例
	MaintenanceMoney *string `json:"maintenance_money,omitempty" xml:"maintenance_money,omitempty"`
	// 当日设备维修记录
	MaintainRecord *string `json:"maintain_record,omitempty" xml:"maintain_record,omitempty"`
	// 设备识别号
	DeviceNo *string `json:"device_no,omitempty" xml:"device_no,omitempty"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty"`
	// 当日分拣单数
	SortingNum *string `json:"sorting_num,omitempty" xml:"sorting_num,omitempty"`
	// 当日运营时长,单位分钟
	OperationMinute *string `json:"operation_minute,omitempty" xml:"operation_minute,omitempty"`
	// 04:00-16:00分拣单数/（派件分拣单数）
	AmNum *string `json:"am_num,omitempty" xml:"am_num,omitempty"`
	// 16:00-04:00分拣单数/ （揽件分拣单数)
	PmNum *string `json:"pm_num,omitempty" xml:"pm_num,omitempty"`
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 设备验收日期
	DeviceAcceptanceDate *string `json:"device_acceptance_date,omitempty" xml:"device_acceptance_date,omitempty"`
	// 数据更新时间
	DataUpdateTime *string `json:"data_update_time,omitempty" xml:"data_update_time,omitempty"`
}

func (s ScfLeaseEqpInfo) String() string {
	return tea.Prettify(s)
}

func (s ScfLeaseEqpInfo) GoString() string {
	return s.String()
}

func (s *ScfLeaseEqpInfo) SetDeviceType(v string) *ScfLeaseEqpInfo {
	s.DeviceType = &v
	return s
}

func (s *ScfLeaseEqpInfo) SetOperationDate(v string) *ScfLeaseEqpInfo {
	s.OperationDate = &v
	return s
}

func (s *ScfLeaseEqpInfo) SetGmtModified(v string) *ScfLeaseEqpInfo {
	s.GmtModified = &v
	return s
}

func (s *ScfLeaseEqpInfo) SetMaintenanceMoney(v string) *ScfLeaseEqpInfo {
	s.MaintenanceMoney = &v
	return s
}

func (s *ScfLeaseEqpInfo) SetMaintainRecord(v string) *ScfLeaseEqpInfo {
	s.MaintainRecord = &v
	return s
}

func (s *ScfLeaseEqpInfo) SetDeviceNo(v string) *ScfLeaseEqpInfo {
	s.DeviceNo = &v
	return s
}

func (s *ScfLeaseEqpInfo) SetGmtCreate(v string) *ScfLeaseEqpInfo {
	s.GmtCreate = &v
	return s
}

func (s *ScfLeaseEqpInfo) SetSortingNum(v string) *ScfLeaseEqpInfo {
	s.SortingNum = &v
	return s
}

func (s *ScfLeaseEqpInfo) SetOperationMinute(v string) *ScfLeaseEqpInfo {
	s.OperationMinute = &v
	return s
}

func (s *ScfLeaseEqpInfo) SetAmNum(v string) *ScfLeaseEqpInfo {
	s.AmNum = &v
	return s
}

func (s *ScfLeaseEqpInfo) SetPmNum(v string) *ScfLeaseEqpInfo {
	s.PmNum = &v
	return s
}

func (s *ScfLeaseEqpInfo) SetId(v string) *ScfLeaseEqpInfo {
	s.Id = &v
	return s
}

func (s *ScfLeaseEqpInfo) SetDeviceAcceptanceDate(v string) *ScfLeaseEqpInfo {
	s.DeviceAcceptanceDate = &v
	return s
}

func (s *ScfLeaseEqpInfo) SetDataUpdateTime(v string) *ScfLeaseEqpInfo {
	s.DataUpdateTime = &v
	return s
}

// 房源信息同步实体类
type HouseInfo struct {
	// 房源唯一ID
	HouseId *string `json:"house_id,omitempty" xml:"house_id,omitempty" require:"true"`
	// 租赁模式
	LeaseMode *string `json:"lease_mode,omitempty" xml:"lease_mode,omitempty"`
	// 面积平方
	Acreage *string `json:"acreage,omitempty" xml:"acreage,omitempty"`
	// 房源类型：0住宅、1别墅、
	// 2商铺、3写字楼
	Structure *int64 `json:"structure,omitempty" xml:"structure,omitempty" require:"true"`
	// 房屋地址
	Addr *string `json:"addr,omitempty" xml:"addr,omitempty"`
	// 门锁设备DID
	LockId *string `json:"lock_id,omitempty" xml:"lock_id,omitempty"`
	// 电表设备DID
	AmmeterId *string `json:"ammeter_id,omitempty" xml:"ammeter_id,omitempty"`
}

func (s HouseInfo) String() string {
	return tea.Prettify(s)
}

func (s HouseInfo) GoString() string {
	return s.String()
}

func (s *HouseInfo) SetHouseId(v string) *HouseInfo {
	s.HouseId = &v
	return s
}

func (s *HouseInfo) SetLeaseMode(v string) *HouseInfo {
	s.LeaseMode = &v
	return s
}

func (s *HouseInfo) SetAcreage(v string) *HouseInfo {
	s.Acreage = &v
	return s
}

func (s *HouseInfo) SetStructure(v int64) *HouseInfo {
	s.Structure = &v
	return s
}

func (s *HouseInfo) SetAddr(v string) *HouseInfo {
	s.Addr = &v
	return s
}

func (s *HouseInfo) SetLockId(v string) *HouseInfo {
	s.LockId = &v
	return s
}

func (s *HouseInfo) SetAmmeterId(v string) *HouseInfo {
	s.AmmeterId = &v
	return s
}

// 信物链存证请求结构体
type EvidenceStorageReq struct {
	// 业务数据，原文上链，或者加密（label若为CRYPTO）上链，上链后的业务数据，通过授权可被区块链其他业务方查询
	BizData *string `json:"biz_data,omitempty" xml:"biz_data,omitempty"`
	// 不同上链方式
	// 空/"": 默认
	// "TTTS": 溯源
	// "IOTPAY": 支付
	// "CZ": 存证
	// "RAW":文本
	Category *string `json:"category,omitempty" xml:"category,omitempty" require:"true"`
	// 上链实体id(设备/空间)
	// 不可和project_uid同时为空
	IotDid *string `json:"iot_did,omitempty" xml:"iot_did,omitempty"`
	// 需要上链的证据的哈希值
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
	// 上链的附属信息
	MetaJson *string `json:"meta_json,omitempty" xml:"meta_json,omitempty"`
	// 上链的项目id,
	// 不可和iot_did同时为空
	ProjectUid *string `json:"project_uid,omitempty" xml:"project_uid,omitempty"`
}

func (s EvidenceStorageReq) String() string {
	return tea.Prettify(s)
}

func (s EvidenceStorageReq) GoString() string {
	return s.String()
}

func (s *EvidenceStorageReq) SetBizData(v string) *EvidenceStorageReq {
	s.BizData = &v
	return s
}

func (s *EvidenceStorageReq) SetCategory(v string) *EvidenceStorageReq {
	s.Category = &v
	return s
}

func (s *EvidenceStorageReq) SetIotDid(v string) *EvidenceStorageReq {
	s.IotDid = &v
	return s
}

func (s *EvidenceStorageReq) SetHash(v string) *EvidenceStorageReq {
	s.Hash = &v
	return s
}

func (s *EvidenceStorageReq) SetMetaJson(v string) *EvidenceStorageReq {
	s.MetaJson = &v
	return s
}

func (s *EvidenceStorageReq) SetProjectUid(v string) *EvidenceStorageReq {
	s.ProjectUid = &v
	return s
}

// 收集信息
type CollectContent struct {
	// 链上设备ID（与可信设备ID至少填一项）
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty"`
	// 可信设备ID（与链上设备ID至少填一项）
	TrustiotDeviceId *int64 `json:"trustiot_device_id,omitempty" xml:"trustiot_device_id,omitempty"`
	// 收集的内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 对内容的签名
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
	// 服务端发送的扩展数据（非可信设备直接产生的数据）
	ExtraData *string `json:"extra_data,omitempty" xml:"extra_data,omitempty"`
	// 数据模型Id
	DataModelId *string `json:"data_model_id,omitempty" xml:"data_model_id,omitempty"`
}

func (s CollectContent) String() string {
	return tea.Prettify(s)
}

func (s CollectContent) GoString() string {
	return s.String()
}

func (s *CollectContent) SetChainDeviceId(v string) *CollectContent {
	s.ChainDeviceId = &v
	return s
}

func (s *CollectContent) SetTrustiotDeviceId(v int64) *CollectContent {
	s.TrustiotDeviceId = &v
	return s
}

func (s *CollectContent) SetContent(v string) *CollectContent {
	s.Content = &v
	return s
}

func (s *CollectContent) SetSignature(v string) *CollectContent {
	s.Signature = &v
	return s
}

func (s *CollectContent) SetExtraData(v string) *CollectContent {
	s.ExtraData = &v
	return s
}

func (s *CollectContent) SetDataModelId(v string) *CollectContent {
	s.DataModelId = &v
	return s
}

// 租期信息
type RentBillItem struct {
	// 租约分期ID
	BillItemId *string `json:"bill_item_id,omitempty" xml:"bill_item_id,omitempty" require:"true"`
	// 租约分期名称
	BillItemName *string `json:"bill_item_name,omitempty" xml:"bill_item_name,omitempty"`
	// 租期开始日期
	BillItemBegin *string `json:"bill_item_begin,omitempty" xml:"bill_item_begin,omitempty" require:"true"`
	// 租期结束日期
	BillItemEnd *string `json:"bill_item_end,omitempty" xml:"bill_item_end,omitempty" require:"true"`
	// 租约金额
	BillItemMoney *string `json:"bill_item_money,omitempty" xml:"bill_item_money,omitempty" require:"true"`
	// 租约支付状态
	PaymentState *string `json:"payment_state,omitempty" xml:"payment_state,omitempty"`
}

func (s RentBillItem) String() string {
	return tea.Prettify(s)
}

func (s RentBillItem) GoString() string {
	return s.String()
}

func (s *RentBillItem) SetBillItemId(v string) *RentBillItem {
	s.BillItemId = &v
	return s
}

func (s *RentBillItem) SetBillItemName(v string) *RentBillItem {
	s.BillItemName = &v
	return s
}

func (s *RentBillItem) SetBillItemBegin(v string) *RentBillItem {
	s.BillItemBegin = &v
	return s
}

func (s *RentBillItem) SetBillItemEnd(v string) *RentBillItem {
	s.BillItemEnd = &v
	return s
}

func (s *RentBillItem) SetBillItemMoney(v string) *RentBillItem {
	s.BillItemMoney = &v
	return s
}

func (s *RentBillItem) SetPaymentState(v string) *RentBillItem {
	s.PaymentState = &v
	return s
}

// 溯源二维码生成请求的请求数据
type BaiQrcodeGenerateReqData struct {
	// 二维码的码值
	QrcodeContent *string `json:"qrcode_content,omitempty" xml:"qrcode_content,omitempty" require:"true"`
}

func (s BaiQrcodeGenerateReqData) String() string {
	return tea.Prettify(s)
}

func (s BaiQrcodeGenerateReqData) GoString() string {
	return s.String()
}

func (s *BaiQrcodeGenerateReqData) SetQrcodeContent(v string) *BaiQrcodeGenerateReqData {
	s.QrcodeContent = &v
	return s
}

// 数据模型
type DataModel struct {
	//  数据模型Id
	DataModelId *string `json:"data_model_id,omitempty" xml:"data_model_id,omitempty" require:"true"`
	// 数据模型名称
	DataModelName *string `json:"data_model_name,omitempty" xml:"data_model_name,omitempty"`
	// 数据模型
	DataModel *string `json:"data_model,omitempty" xml:"data_model,omitempty" require:"true"`
	// 数据模型类别
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 用户自定义版本
	CustomerVersion *string `json:"customer_version,omitempty" xml:"customer_version,omitempty"`
}

func (s DataModel) String() string {
	return tea.Prettify(s)
}

func (s DataModel) GoString() string {
	return s.String()
}

func (s *DataModel) SetDataModelId(v string) *DataModel {
	s.DataModelId = &v
	return s
}

func (s *DataModel) SetDataModelName(v string) *DataModel {
	s.DataModelName = &v
	return s
}

func (s *DataModel) SetDataModel(v string) *DataModel {
	s.DataModel = &v
	return s
}

func (s *DataModel) SetBizType(v string) *DataModel {
	s.BizType = &v
	return s
}

func (s *DataModel) SetCustomerVersion(v string) *DataModel {
	s.CustomerVersion = &v
	return s
}

// 溯源防伪码生成请求的响应数据
type BaiQrcodeGenerateRespData struct {
	// 二维码的base64字符串
	GenerateResult *string `json:"generate_result,omitempty" xml:"generate_result,omitempty" require:"true"`
	// 生成结果码
	GenerateCode *string `json:"generate_code,omitempty" xml:"generate_code,omitempty" require:"true"`
	// 用于异常场景下细化错误信息
	GenerateMessage *string `json:"generate_message,omitempty" xml:"generate_message,omitempty" require:"true"`
	// 生成失败时的解决方案，用于异常场景下细化错误信息
	UnableGenerateSolution *string `json:"unable_generate_solution,omitempty" xml:"unable_generate_solution,omitempty" require:"true"`
}

func (s BaiQrcodeGenerateRespData) String() string {
	return tea.Prettify(s)
}

func (s BaiQrcodeGenerateRespData) GoString() string {
	return s.String()
}

func (s *BaiQrcodeGenerateRespData) SetGenerateResult(v string) *BaiQrcodeGenerateRespData {
	s.GenerateResult = &v
	return s
}

func (s *BaiQrcodeGenerateRespData) SetGenerateCode(v string) *BaiQrcodeGenerateRespData {
	s.GenerateCode = &v
	return s
}

func (s *BaiQrcodeGenerateRespData) SetGenerateMessage(v string) *BaiQrcodeGenerateRespData {
	s.GenerateMessage = &v
	return s
}

func (s *BaiQrcodeGenerateRespData) SetUnableGenerateSolution(v string) *BaiQrcodeGenerateRespData {
	s.UnableGenerateSolution = &v
	return s
}

// 充电明细信息
type ChargeDetail struct {
	// 开始时间
	DetailStartTime *string `json:"detail_start_time,omitempty" xml:"detail_start_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 结束时间
	DetailEndTime *string `json:"detail_end_time,omitempty" xml:"detail_end_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 时段电价，小数点后4位
	ElecPrice *string `json:"elec_price,omitempty" xml:"elec_price,omitempty"`
	// 时段服务费价格，小数点后4位
	ServicePrice *string `json:"service_price,omitempty" xml:"service_price,omitempty"`
	// 时段充电量，单位：度，小数点后2位
	DetailPower *string `json:"detail_power,omitempty" xml:"detail_power,omitempty" require:"true"`
	// 时段电费，小数点后2位
	DetailElecMoney *string `json:"detail_elec_money,omitempty" xml:"detail_elec_money,omitempty"`
	// 时段服务费，小数点后2位
	DetailServiceMoney *string `json:"detail_service_money,omitempty" xml:"detail_service_money,omitempty"`
}

func (s ChargeDetail) String() string {
	return tea.Prettify(s)
}

func (s ChargeDetail) GoString() string {
	return s.String()
}

func (s *ChargeDetail) SetDetailStartTime(v string) *ChargeDetail {
	s.DetailStartTime = &v
	return s
}

func (s *ChargeDetail) SetDetailEndTime(v string) *ChargeDetail {
	s.DetailEndTime = &v
	return s
}

func (s *ChargeDetail) SetElecPrice(v string) *ChargeDetail {
	s.ElecPrice = &v
	return s
}

func (s *ChargeDetail) SetServicePrice(v string) *ChargeDetail {
	s.ServicePrice = &v
	return s
}

func (s *ChargeDetail) SetDetailPower(v string) *ChargeDetail {
	s.DetailPower = &v
	return s
}

func (s *ChargeDetail) SetDetailElecMoney(v string) *ChargeDetail {
	s.DetailElecMoney = &v
	return s
}

func (s *ChargeDetail) SetDetailServiceMoney(v string) *ChargeDetail {
	s.DetailServiceMoney = &v
	return s
}

// 更新设备和空间关联请求结构体
type UpdateDeviceSpaceReq struct {
	// API要更新的设备DID
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty" require:"true"`
	// 0-全部更新 (暂不支持)
	// 1-添加
	// 2-删除
	//
	UpdateMode *int64 `json:"update_mode,omitempty" xml:"update_mode,omitempty" require:"true"`
	// API要更新的设备部署库位
	DeviceSpace []*string `json:"device_space,omitempty" xml:"device_space,omitempty" require:"true" type:"Repeated"`
}

func (s UpdateDeviceSpaceReq) String() string {
	return tea.Prettify(s)
}

func (s UpdateDeviceSpaceReq) GoString() string {
	return s.String()
}

func (s *UpdateDeviceSpaceReq) SetDeviceDid(v string) *UpdateDeviceSpaceReq {
	s.DeviceDid = &v
	return s
}

func (s *UpdateDeviceSpaceReq) SetUpdateMode(v int64) *UpdateDeviceSpaceReq {
	s.UpdateMode = &v
	return s
}

func (s *UpdateDeviceSpaceReq) SetDeviceSpace(v []*string) *UpdateDeviceSpaceReq {
	s.DeviceSpace = v
	return s
}

// 设备注册失败对象
type IotBasicDeviceRegisterFail struct {
	// 设备名称
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty" require:"true"`
	// 设备sn
	DeviceSn *string `json:"device_sn,omitempty" xml:"device_sn,omitempty" require:"true"`
	// 错误编码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 错误描述
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
}

func (s IotBasicDeviceRegisterFail) String() string {
	return tea.Prettify(s)
}

func (s IotBasicDeviceRegisterFail) GoString() string {
	return s.String()
}

func (s *IotBasicDeviceRegisterFail) SetDeviceName(v string) *IotBasicDeviceRegisterFail {
	s.DeviceName = &v
	return s
}

func (s *IotBasicDeviceRegisterFail) SetDeviceSn(v string) *IotBasicDeviceRegisterFail {
	s.DeviceSn = &v
	return s
}

func (s *IotBasicDeviceRegisterFail) SetCode(v string) *IotBasicDeviceRegisterFail {
	s.Code = &v
	return s
}

func (s *IotBasicDeviceRegisterFail) SetMessage(v string) *IotBasicDeviceRegisterFail {
	s.Message = &v
	return s
}

// 设备信息
type Device struct {
	// 设备ID，一般是设备的出厂编码或业务上的资产ID
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 数据模型Id
	DeviceDataModelId *string `json:"device_data_model_id,omitempty" xml:"device_data_model_id,omitempty" require:"true"`
	// 场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// imei号
	DeviceImei *string `json:"device_imei,omitempty" xml:"device_imei,omitempty" require:"true"`
	// 设备名称
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty"`
	// 设备厂商名称
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty"`
	// 设备ICCID
	//
	//
	DeviceIccid *string `json:"device_iccid,omitempty" xml:"device_iccid,omitempty"`
	// 设备扩展信息
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 设备链上Id
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty" require:"true"`
	// 上链哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 上链时间
	TxTime *int64 `json:"tx_time,omitempty" xml:"tx_time,omitempty" require:"true"`
	// 设备类型编码，必填，对应资管平台中的设备类型
	//
	// 枚举值：
	//
	// 车辆 1000
	// 车辆 四轮车 1001
	// 车辆 四轮车 纯电四轮车 1002
	// 车辆 四轮车 混动四轮车 1003
	// 车辆 四轮车 燃油四轮车 1004
	// 车辆 两轮车 1011
	// 车辆 两轮车 两轮单车 1012
	// 车辆 两轮车 两轮助力车 1013
	//
	// 换电柜 2000
	// 换电柜 二轮车换电柜 2001
	//
	// 电池 3000
	// 电池 磷酸铁电池 3001
	// 电池 三元锂电池 3002
	//
	// 回收设备 4000
	//
	// 垃圾分类回收 4001
	//
	// 洗车机 5000
	DeviceTypeCode *int64 `json:"device_type_code,omitempty" xml:"device_type_code,omitempty" require:"true"`
	// 单价
	InitialPrice *int64 `json:"initial_price,omitempty" xml:"initial_price,omitempty" require:"true"`
	// 投放时间
	ReleaseTime *string `json:"release_time,omitempty" xml:"release_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 出厂时间
	FactoryTime *string `json:"factory_time,omitempty" xml:"factory_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 设备状态，取值范围：NORMAL、OFFLINE、UNREGISTER
	DeviceStatus *string `json:"device_status,omitempty" xml:"device_status,omitempty"`
	// 可信设备ID
	TrustiotDeviceId *int64 `json:"trustiot_device_id,omitempty" xml:"trustiot_device_id,omitempty" require:"true"`
}

func (s Device) String() string {
	return tea.Prettify(s)
}

func (s Device) GoString() string {
	return s.String()
}

func (s *Device) SetDeviceId(v string) *Device {
	s.DeviceId = &v
	return s
}

func (s *Device) SetDeviceDataModelId(v string) *Device {
	s.DeviceDataModelId = &v
	return s
}

func (s *Device) SetScene(v string) *Device {
	s.Scene = &v
	return s
}

func (s *Device) SetDeviceImei(v string) *Device {
	s.DeviceImei = &v
	return s
}

func (s *Device) SetDeviceName(v string) *Device {
	s.DeviceName = &v
	return s
}

func (s *Device) SetCorpName(v string) *Device {
	s.CorpName = &v
	return s
}

func (s *Device) SetDeviceIccid(v string) *Device {
	s.DeviceIccid = &v
	return s
}

func (s *Device) SetExtraInfo(v string) *Device {
	s.ExtraInfo = &v
	return s
}

func (s *Device) SetChainDeviceId(v string) *Device {
	s.ChainDeviceId = &v
	return s
}

func (s *Device) SetTxHash(v string) *Device {
	s.TxHash = &v
	return s
}

func (s *Device) SetTxTime(v int64) *Device {
	s.TxTime = &v
	return s
}

func (s *Device) SetDeviceTypeCode(v int64) *Device {
	s.DeviceTypeCode = &v
	return s
}

func (s *Device) SetInitialPrice(v int64) *Device {
	s.InitialPrice = &v
	return s
}

func (s *Device) SetReleaseTime(v string) *Device {
	s.ReleaseTime = &v
	return s
}

func (s *Device) SetFactoryTime(v string) *Device {
	s.FactoryTime = &v
	return s
}

func (s *Device) SetDeviceStatus(v string) *Device {
	s.DeviceStatus = &v
	return s
}

func (s *Device) SetTrustiotDeviceId(v int64) *Device {
	s.TrustiotDeviceId = &v
	return s
}

// 新增厂商字典时需要传的产品信息
type AddProductInfo struct {
	// 产品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true"`
	// 产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 产品描述
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
}

func (s AddProductInfo) String() string {
	return tea.Prettify(s)
}

func (s AddProductInfo) GoString() string {
	return s.String()
}

func (s *AddProductInfo) SetProductName(v string) *AddProductInfo {
	s.ProductName = &v
	return s
}

func (s *AddProductInfo) SetProductCode(v string) *AddProductInfo {
	s.ProductCode = &v
	return s
}

func (s *AddProductInfo) SetRemark(v string) *AddProductInfo {
	s.Remark = &v
	return s
}

// 设备实体请求结构体，应用在注册/更新API的ThingsExtraParams
type DeviceRegisterReqModel struct {
	// 保留
	AuthLevel *int64 `json:"auth_level,omitempty" xml:"auth_level,omitempty"`
	// 设备属性字符串，
	// 阿里云设备类型，填入三元组
	DeviceAttribute *string `json:"device_attribute,omitempty" xml:"device_attribute,omitempty"`
	// 物模型ID，参考其他文档
	DeviceModelId *string `json:"device_model_id,omitempty" xml:"device_model_id,omitempty"`
	// 可传入自定义信息
	OtherInfo *string `json:"other_info,omitempty" xml:"other_info,omitempty"`
	// 业务自定义，可以传入该实体的w3c服务节点
	ServiceEndpoint *string `json:"service_endpoint,omitempty" xml:"service_endpoint,omitempty"`
	// 保留，默认
	//     STATUS_REGISTERED(3)
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s DeviceRegisterReqModel) String() string {
	return tea.Prettify(s)
}

func (s DeviceRegisterReqModel) GoString() string {
	return s.String()
}

func (s *DeviceRegisterReqModel) SetAuthLevel(v int64) *DeviceRegisterReqModel {
	s.AuthLevel = &v
	return s
}

func (s *DeviceRegisterReqModel) SetDeviceAttribute(v string) *DeviceRegisterReqModel {
	s.DeviceAttribute = &v
	return s
}

func (s *DeviceRegisterReqModel) SetDeviceModelId(v string) *DeviceRegisterReqModel {
	s.DeviceModelId = &v
	return s
}

func (s *DeviceRegisterReqModel) SetOtherInfo(v string) *DeviceRegisterReqModel {
	s.OtherInfo = &v
	return s
}

func (s *DeviceRegisterReqModel) SetServiceEndpoint(v string) *DeviceRegisterReqModel {
	s.ServiceEndpoint = &v
	return s
}

func (s *DeviceRegisterReqModel) SetStatus(v string) *DeviceRegisterReqModel {
	s.Status = &v
	return s
}

// 设备远程操作对象
type DeviceOperateInfo struct {
	// 蚂蚁链iot平台设备ID
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty" require:"true"`
	// 设备签名
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
}

func (s DeviceOperateInfo) String() string {
	return tea.Prettify(s)
}

func (s DeviceOperateInfo) GoString() string {
	return s.String()
}

func (s *DeviceOperateInfo) SetDeviceDid(v string) *DeviceOperateInfo {
	s.DeviceDid = &v
	return s
}

func (s *DeviceOperateInfo) SetSignature(v string) *DeviceOperateInfo {
	s.Signature = &v
	return s
}

// 菜鸟设备监控信息获取请求体
type ScfLeaseEqpInfoQueryRequest struct {
	// 设备识别号
	DeviceNo *string `json:"device_no,omitempty" xml:"device_no,omitempty" require:"true"`
	// 运营日期
	OperationDate *string `json:"operation_date,omitempty" xml:"operation_date,omitempty" require:"true"`
}

func (s ScfLeaseEqpInfoQueryRequest) String() string {
	return tea.Prettify(s)
}

func (s ScfLeaseEqpInfoQueryRequest) GoString() string {
	return s.String()
}

func (s *ScfLeaseEqpInfoQueryRequest) SetDeviceNo(v string) *ScfLeaseEqpInfoQueryRequest {
	s.DeviceNo = &v
	return s
}

func (s *ScfLeaseEqpInfoQueryRequest) SetOperationDate(v string) *ScfLeaseEqpInfoQueryRequest {
	s.OperationDate = &v
	return s
}

// 信物链查询实体身份请求结构体
type DidBaseQueryReq struct {
	// * "thingId"       原始ID
	// * "certText"      证书文本
	// * "certPublicKey"证书公钥
	// * "didPublicKey" DID公钥
	// * "didExtension"  DID扩展，设备/企业组织/仓库/空间的解析同thingsExtraParams
	// * "didUsername"   DID用户名
	// * "ownerDid"      所有者DID
	// * "userDid"       使用者DID
	// * "thingType"     实体类型，设备/企业组织/仓库/空间等
	// * "thingStatus"   实体状态
	// * "thingModelId" 实体物模型类型
	// * "thingAttribute"实体属性
	// * "thingVersion"  实体版本
	// * "spacesAttached"关联空间列表
	// * "thingsAttached"关联实体列表（例：库位关联设备）
	// * "authLevel"     授权等级
	// * "thingServiceEndpoint" 服务列表
	DataFilter []*string `json:"data_filter,omitempty" xml:"data_filter,omitempty" require:"true" type:"Repeated"`
	// 是否从链上查询，从链上查询将返回txHash值
	OnChain *bool `json:"on_chain,omitempty" xml:"on_chain,omitempty" require:"true"`
	// 需要查询的实体Did列表，同一次查询的Did须为相同类型
	ThingsDidList []*string `json:"things_did_list,omitempty" xml:"things_did_list,omitempty" require:"true" type:"Repeated"`
}

func (s DidBaseQueryReq) String() string {
	return tea.Prettify(s)
}

func (s DidBaseQueryReq) GoString() string {
	return s.String()
}

func (s *DidBaseQueryReq) SetDataFilter(v []*string) *DidBaseQueryReq {
	s.DataFilter = v
	return s
}

func (s *DidBaseQueryReq) SetOnChain(v bool) *DidBaseQueryReq {
	s.OnChain = &v
	return s
}

func (s *DidBaseQueryReq) SetThingsDidList(v []*string) *DidBaseQueryReq {
	s.ThingsDidList = v
	return s
}

// 商品鉴定返回结果
type BaiGoodsComparisonResponse struct {
	// 鉴定结果（REAL：为真   FAKE：为假   UNABLE_IDENTIFY：无法鉴定）
	IdentificationResult *string `json:"identification_result,omitempty" xml:"identification_result,omitempty" require:"true"`
	// 鉴定补充信息
	IdentificationMessage *string `json:"identification_message,omitempty" xml:"identification_message,omitempty"`
	// 鉴定信息code
	IdentificationCode *string `json:"identification_code,omitempty" xml:"identification_code,omitempty"`
}

func (s BaiGoodsComparisonResponse) String() string {
	return tea.Prettify(s)
}

func (s BaiGoodsComparisonResponse) GoString() string {
	return s.String()
}

func (s *BaiGoodsComparisonResponse) SetIdentificationResult(v string) *BaiGoodsComparisonResponse {
	s.IdentificationResult = &v
	return s
}

func (s *BaiGoodsComparisonResponse) SetIdentificationMessage(v string) *BaiGoodsComparisonResponse {
	s.IdentificationMessage = &v
	return s
}

func (s *BaiGoodsComparisonResponse) SetIdentificationCode(v string) *BaiGoodsComparisonResponse {
	s.IdentificationCode = &v
	return s
}

// 租户分页查询结果
type PermissionedTenantPageResponse struct {
	// 页数
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
	// 页码
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 总记录数
	TotalSize *int64 `json:"total_size,omitempty" xml:"total_size,omitempty" require:"true"`
	// 总页数
	TotalPages *int64 `json:"total_pages,omitempty" xml:"total_pages,omitempty" require:"true"`
	// 数据
	PageData []*PermissionedTenantModel `json:"page_data,omitempty" xml:"page_data,omitempty" require:"true" type:"Repeated"`
}

func (s PermissionedTenantPageResponse) String() string {
	return tea.Prettify(s)
}

func (s PermissionedTenantPageResponse) GoString() string {
	return s.String()
}

func (s *PermissionedTenantPageResponse) SetPageIndex(v int64) *PermissionedTenantPageResponse {
	s.PageIndex = &v
	return s
}

func (s *PermissionedTenantPageResponse) SetPageSize(v int64) *PermissionedTenantPageResponse {
	s.PageSize = &v
	return s
}

func (s *PermissionedTenantPageResponse) SetTotalSize(v int64) *PermissionedTenantPageResponse {
	s.TotalSize = &v
	return s
}

func (s *PermissionedTenantPageResponse) SetTotalPages(v int64) *PermissionedTenantPageResponse {
	s.TotalPages = &v
	return s
}

func (s *PermissionedTenantPageResponse) SetPageData(v []*PermissionedTenantModel) *PermissionedTenantPageResponse {
	s.PageData = v
	return s
}

// 任务信息
type TaskInfo struct {
	// 升级计划Id
	PlanId *int64 `json:"plan_id,omitempty" xml:"plan_id,omitempty" minimum:"0"`
	// 刷库计划步骤id
	PlanStepId *int64 `json:"plan_step_id,omitempty" xml:"plan_step_id,omitempty" minimum:"0"`
	// 任务id
	TaskId *int64 `json:"task_id,omitempty" xml:"task_id,omitempty" minimum:"0"`
	// action_id
	ActionId *int64 `json:"action_id,omitempty" xml:"action_id,omitempty" minimum:"0"`
	// 任务类型
	TaskType *string `json:"task_type,omitempty" xml:"task_type,omitempty" require:"true"`
}

func (s TaskInfo) String() string {
	return tea.Prettify(s)
}

func (s TaskInfo) GoString() string {
	return s.String()
}

func (s *TaskInfo) SetPlanId(v int64) *TaskInfo {
	s.PlanId = &v
	return s
}

func (s *TaskInfo) SetPlanStepId(v int64) *TaskInfo {
	s.PlanStepId = &v
	return s
}

func (s *TaskInfo) SetTaskId(v int64) *TaskInfo {
	s.TaskId = &v
	return s
}

func (s *TaskInfo) SetActionId(v int64) *TaskInfo {
	s.ActionId = &v
	return s
}

func (s *TaskInfo) SetTaskType(v string) *TaskInfo {
	s.TaskType = &v
	return s
}

// 商品鉴定返回结果
type BaiGoodsIdentificationRespData struct {
	// 鉴定结果
	// REAL：鉴定为真
	// FAKE：鉴定为假
	// UNABLE_IDENTIFY：无法鉴定
	IdentificationResult *string `json:"identification_result,omitempty" xml:"identification_result,omitempty" require:"true"`
	// 整体鉴定分数
	Grade *string `json:"grade,omitempty" xml:"grade,omitempty" require:"true"`
	// 整体鉴定报告描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 鉴定点鉴定结果列表
	PointIdentificationResults []*BaiGoodsPointIdentificationResult `json:"point_identification_results,omitempty" xml:"point_identification_results,omitempty" require:"true" type:"Repeated"`
	// 鉴定评价
	AppraiseMessage *string `json:"appraise_message,omitempty" xml:"appraise_message,omitempty"`
	// 用户自定义字符串，系统不做处理，会在响应体中带回
	OutState *string `json:"out_state,omitempty" xml:"out_state,omitempty"`
}

func (s BaiGoodsIdentificationRespData) String() string {
	return tea.Prettify(s)
}

func (s BaiGoodsIdentificationRespData) GoString() string {
	return s.String()
}

func (s *BaiGoodsIdentificationRespData) SetIdentificationResult(v string) *BaiGoodsIdentificationRespData {
	s.IdentificationResult = &v
	return s
}

func (s *BaiGoodsIdentificationRespData) SetGrade(v string) *BaiGoodsIdentificationRespData {
	s.Grade = &v
	return s
}

func (s *BaiGoodsIdentificationRespData) SetDescription(v string) *BaiGoodsIdentificationRespData {
	s.Description = &v
	return s
}

func (s *BaiGoodsIdentificationRespData) SetPointIdentificationResults(v []*BaiGoodsPointIdentificationResult) *BaiGoodsIdentificationRespData {
	s.PointIdentificationResults = v
	return s
}

func (s *BaiGoodsIdentificationRespData) SetAppraiseMessage(v string) *BaiGoodsIdentificationRespData {
	s.AppraiseMessage = &v
	return s
}

func (s *BaiGoodsIdentificationRespData) SetOutState(v string) *BaiGoodsIdentificationRespData {
	s.OutState = &v
	return s
}

// iot平台用户信息
//
type IotBasicUserInfo struct {
	// 租户ID
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true"`
	// 金融云用户Id
	//
	CloudUserId *string `json:"cloud_user_id,omitempty" xml:"cloud_user_id,omitempty" require:"true"`
	// 金融云平台的登录名
	//
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty" require:"true"`
	// 权限集合
	PermissionList []*IotBasicRolePermission `json:"permission_list,omitempty" xml:"permission_list,omitempty" require:"true" type:"Repeated"`
}

func (s IotBasicUserInfo) String() string {
	return tea.Prettify(s)
}

func (s IotBasicUserInfo) GoString() string {
	return s.String()
}

func (s *IotBasicUserInfo) SetTenant(v string) *IotBasicUserInfo {
	s.Tenant = &v
	return s
}

func (s *IotBasicUserInfo) SetCloudUserId(v string) *IotBasicUserInfo {
	s.CloudUserId = &v
	return s
}

func (s *IotBasicUserInfo) SetLoginName(v string) *IotBasicUserInfo {
	s.LoginName = &v
	return s
}

func (s *IotBasicUserInfo) SetPermissionList(v []*IotBasicRolePermission) *IotBasicUserInfo {
	s.PermissionList = v
	return s
}

// 发行数据包
type DistributeDataPackage struct {
	// 原始数据
	DataList []*RawData `json:"data_list,omitempty" xml:"data_list,omitempty" require:"true" type:"Repeated"`
	// 发行设备Id
	DistributeDeviceId *string `json:"distribute_device_id,omitempty" xml:"distribute_device_id,omitempty" require:"true"`
	// 打包时间
	PackageTime *int64 `json:"package_time,omitempty" xml:"package_time,omitempty" require:"true"`
}

func (s DistributeDataPackage) String() string {
	return tea.Prettify(s)
}

func (s DistributeDataPackage) GoString() string {
	return s.String()
}

func (s *DistributeDataPackage) SetDataList(v []*RawData) *DistributeDataPackage {
	s.DataList = v
	return s
}

func (s *DistributeDataPackage) SetDistributeDeviceId(v string) *DistributeDataPackage {
	s.DistributeDeviceId = &v
	return s
}

func (s *DistributeDataPackage) SetPackageTime(v int64) *DistributeDataPackage {
	s.PackageTime = &v
	return s
}

// BAI提供的OCR接口返回值
type BaiOcrResponse struct {
	// 返回的结果体
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s BaiOcrResponse) String() string {
	return tea.Prettify(s)
}

func (s BaiOcrResponse) GoString() string {
	return s.String()
}

func (s *BaiOcrResponse) SetData(v string) *BaiOcrResponse {
	s.Data = &v
	return s
}

// 溯源防伪码质检请求的请求数据
type BaiQrcodeVerifyReqData struct {
	// 二维码图片url
	QueryImageUrl *string `json:"query_image_url,omitempty" xml:"query_image_url,omitempty" require:"true"`
}

func (s BaiQrcodeVerifyReqData) String() string {
	return tea.Prettify(s)
}

func (s BaiQrcodeVerifyReqData) GoString() string {
	return s.String()
}

func (s *BaiQrcodeVerifyReqData) SetQueryImageUrl(v string) *BaiQrcodeVerifyReqData {
	s.QueryImageUrl = &v
	return s
}

// 实体身份注册请求结构体
type ThingsDidRegisterReq struct {
	// 业务编码，暂时保留，不需传入
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 信物链实体的所有者的分布式身份
	OwnerTenantDid *string `json:"owner_tenant_did,omitempty" xml:"owner_tenant_did,omitempty"`
	// 信物链实体附加信息 不同实体身份，有不同的json组织格式...
	// 参考
	// DeviceRegisterReqModel，
	// SpaceRegisterReqModel，
	// CorporateReqModel，
	// WarehouseReqModel，
	//
	ThingExtraParams *string `json:"thing_extra_params,omitempty" xml:"thing_extra_params,omitempty"`
	// 原始id，租户内同一类型实体唯一
	ThingOriginId *string `json:"thing_origin_id,omitempty" xml:"thing_origin_id,omitempty" require:"true"`
	// 实体原始名称
	ThingOriginName *string `json:"thing_origin_name,omitempty" xml:"thing_origin_name,omitempty" require:"true"`
	// 信物链实体身份
	// DID_TYPE_DEVICE_ALIYUN(0): 阿里云设备
	// DID_TYPE_DEVICE_PEGASUS(1): 链机设备
	// DID_TYPE_DEVICE_MCU(2): MCU设备
	// DID_TYPE_DEVICE_INTEL(3): intel设备
	// DID_TYPE_DEVICE_DEVICE(16384): 默认设备 ...
	// DID_TYPE_CORPORATE(65536): 组织实体
	// DID_TYPE_WAREHOUSE(131072)：仓库实体
	// DID_TYPE_SPACE(196608)： 空间实体
	ThingType *int64 `json:"thing_type,omitempty" xml:"thing_type,omitempty" require:"true"`
	// 实体版本
	ThingVersion *string `json:"thing_version,omitempty" xml:"thing_version,omitempty" require:"true"`
	// 信物链实体的使用方的分布式身份列表
	UserDid []*string `json:"user_did,omitempty" xml:"user_did,omitempty" type:"Repeated"`
}

func (s ThingsDidRegisterReq) String() string {
	return tea.Prettify(s)
}

func (s ThingsDidRegisterReq) GoString() string {
	return s.String()
}

func (s *ThingsDidRegisterReq) SetBizType(v string) *ThingsDidRegisterReq {
	s.BizType = &v
	return s
}

func (s *ThingsDidRegisterReq) SetOwnerTenantDid(v string) *ThingsDidRegisterReq {
	s.OwnerTenantDid = &v
	return s
}

func (s *ThingsDidRegisterReq) SetThingExtraParams(v string) *ThingsDidRegisterReq {
	s.ThingExtraParams = &v
	return s
}

func (s *ThingsDidRegisterReq) SetThingOriginId(v string) *ThingsDidRegisterReq {
	s.ThingOriginId = &v
	return s
}

func (s *ThingsDidRegisterReq) SetThingOriginName(v string) *ThingsDidRegisterReq {
	s.ThingOriginName = &v
	return s
}

func (s *ThingsDidRegisterReq) SetThingType(v int64) *ThingsDidRegisterReq {
	s.ThingType = &v
	return s
}

func (s *ThingsDidRegisterReq) SetThingVersion(v string) *ThingsDidRegisterReq {
	s.ThingVersion = &v
	return s
}

func (s *ThingsDidRegisterReq) SetUserDid(v []*string) *ThingsDidRegisterReq {
	s.UserDid = v
	return s
}

// 数据上链失败结果
type DeviceCollectFail struct {
	// 上链数据采集ID
	CollectId *string `json:"collect_id,omitempty" xml:"collect_id,omitempty" require:"true"`
	// 错误码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 错误信息
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
}

func (s DeviceCollectFail) String() string {
	return tea.Prettify(s)
}

func (s DeviceCollectFail) GoString() string {
	return s.String()
}

func (s *DeviceCollectFail) SetCollectId(v string) *DeviceCollectFail {
	s.CollectId = &v
	return s
}

func (s *DeviceCollectFail) SetCode(v string) *DeviceCollectFail {
	s.Code = &v
	return s
}

func (s *DeviceCollectFail) SetMessage(v string) *DeviceCollectFail {
	s.Message = &v
	return s
}

// 商品鉴定点鉴定响应体
type BaiGoodsPointQueryRespData struct {
	// 识别结果
	// true：识别到鉴定点
	// false：未识别到鉴定点
	Detection *bool `json:"detection,omitempty" xml:"detection,omitempty" require:"true"`
	// 鉴定结果
	// REAL：鉴定为真
	// FAKE：鉴定为假
	// UNABLE_IDENTIFY：无法鉴定
	IdentificationResult *string `json:"identification_result,omitempty" xml:"identification_result,omitempty" require:"true"`
}

func (s BaiGoodsPointQueryRespData) String() string {
	return tea.Prettify(s)
}

func (s BaiGoodsPointQueryRespData) GoString() string {
	return s.String()
}

func (s *BaiGoodsPointQueryRespData) SetDetection(v bool) *BaiGoodsPointQueryRespData {
	s.Detection = &v
	return s
}

func (s *BaiGoodsPointQueryRespData) SetIdentificationResult(v string) *BaiGoodsPointQueryRespData {
	s.IdentificationResult = &v
	return s
}

// 溯源防伪码质检响应数据
type BaiQrcodeVerifyRespData struct {
	// 鉴定结果
	// REAL：通过
	// UNABLE_IDENTIFY：无法鉴定
	IdentificationResult *string `json:"identification_result,omitempty" xml:"identification_result,omitempty" require:"true"`
	// 辅助识别结果码
	IdentificationCode *string `json:"identification_code,omitempty" xml:"identification_code,omitempty" require:"true"`
	// 辅助识别信息
	IdentificationMessage *string `json:"identification_message,omitempty" xml:"identification_message,omitempty" require:"true"`
	// 无法鉴定时的解决方案
	UnableIdentifySolution *string `json:"unable_identify_solution,omitempty" xml:"unable_identify_solution,omitempty" require:"true"`
}

func (s BaiQrcodeVerifyRespData) String() string {
	return tea.Prettify(s)
}

func (s BaiQrcodeVerifyRespData) GoString() string {
	return s.String()
}

func (s *BaiQrcodeVerifyRespData) SetIdentificationResult(v string) *BaiQrcodeVerifyRespData {
	s.IdentificationResult = &v
	return s
}

func (s *BaiQrcodeVerifyRespData) SetIdentificationCode(v string) *BaiQrcodeVerifyRespData {
	s.IdentificationCode = &v
	return s
}

func (s *BaiQrcodeVerifyRespData) SetIdentificationMessage(v string) *BaiQrcodeVerifyRespData {
	s.IdentificationMessage = &v
	return s
}

func (s *BaiQrcodeVerifyRespData) SetUnableIdentifySolution(v string) *BaiQrcodeVerifyRespData {
	s.UnableIdentifySolution = &v
	return s
}

// 商品鉴定点检测接口响应数据
type BaiGoodsPointCheckRespData struct {
	// 图片是否有效，无效则需要提示重拍
	Valid *bool `json:"valid,omitempty" xml:"valid,omitempty" require:"true"`
}

func (s BaiGoodsPointCheckRespData) String() string {
	return tea.Prettify(s)
}

func (s BaiGoodsPointCheckRespData) GoString() string {
	return s.String()
}

func (s *BaiGoodsPointCheckRespData) SetValid(v bool) *BaiGoodsPointCheckRespData {
	s.Valid = &v
	return s
}

// 数据校验失败分页查询结果
type DataVerifyFailureDataPageResponse struct {
	// 页数
	//
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
	// 页码
	//
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 总记录数
	//
	TotalSize *int64 `json:"total_size,omitempty" xml:"total_size,omitempty" require:"true"`
	// 总页数
	//
	TotalPages *int64 `json:"total_pages,omitempty" xml:"total_pages,omitempty" require:"true"`
	// 数据
	PageData []*DataVerifyFailureData `json:"page_data,omitempty" xml:"page_data,omitempty" require:"true" type:"Repeated"`
}

func (s DataVerifyFailureDataPageResponse) String() string {
	return tea.Prettify(s)
}

func (s DataVerifyFailureDataPageResponse) GoString() string {
	return s.String()
}

func (s *DataVerifyFailureDataPageResponse) SetPageIndex(v int64) *DataVerifyFailureDataPageResponse {
	s.PageIndex = &v
	return s
}

func (s *DataVerifyFailureDataPageResponse) SetPageSize(v int64) *DataVerifyFailureDataPageResponse {
	s.PageSize = &v
	return s
}

func (s *DataVerifyFailureDataPageResponse) SetTotalSize(v int64) *DataVerifyFailureDataPageResponse {
	s.TotalSize = &v
	return s
}

func (s *DataVerifyFailureDataPageResponse) SetTotalPages(v int64) *DataVerifyFailureDataPageResponse {
	s.TotalPages = &v
	return s
}

func (s *DataVerifyFailureDataPageResponse) SetPageData(v []*DataVerifyFailureData) *DataVerifyFailureDataPageResponse {
	s.PageData = v
	return s
}

// TSM CommonCmd
type TsmCommonCmd struct {
	// private byte cla;
	Cla *int64 `json:"cla,omitempty" xml:"cla,omitempty" require:"true"`
	//  host challenge data.
	Data []*int64 `json:"data,omitempty" xml:"data,omitempty" require:"true" type:"Repeated"`
	// private byte ins;
	Ins *int64 `json:"ins,omitempty" xml:"ins,omitempty" require:"true"`
	//  private byte lc;
	Lc *int64 `json:"lc,omitempty" xml:"lc,omitempty" require:"true"`
	// private byte le = (byte) 0x00;
	Le *int64 `json:"le,omitempty" xml:"le,omitempty"`
	// private Boolean needSecurityHandle = Boolean.TRUE;
	NeedSecurityHandle *bool `json:"need_security_handle,omitempty" xml:"need_security_handle,omitempty"`
	// private byte p1;
	P1 *int64 `json:"p1,omitempty" xml:"p1,omitempty" require:"true"`
	// private byte p2 = (byte) 0x00;
	P2 *int64 `json:"p2,omitempty" xml:"p2,omitempty" require:"true"`
}

func (s TsmCommonCmd) String() string {
	return tea.Prettify(s)
}

func (s TsmCommonCmd) GoString() string {
	return s.String()
}

func (s *TsmCommonCmd) SetCla(v int64) *TsmCommonCmd {
	s.Cla = &v
	return s
}

func (s *TsmCommonCmd) SetData(v []*int64) *TsmCommonCmd {
	s.Data = v
	return s
}

func (s *TsmCommonCmd) SetIns(v int64) *TsmCommonCmd {
	s.Ins = &v
	return s
}

func (s *TsmCommonCmd) SetLc(v int64) *TsmCommonCmd {
	s.Lc = &v
	return s
}

func (s *TsmCommonCmd) SetLe(v int64) *TsmCommonCmd {
	s.Le = &v
	return s
}

func (s *TsmCommonCmd) SetNeedSecurityHandle(v bool) *TsmCommonCmd {
	s.NeedSecurityHandle = &v
	return s
}

func (s *TsmCommonCmd) SetP1(v int64) *TsmCommonCmd {
	s.P1 = &v
	return s
}

func (s *TsmCommonCmd) SetP2(v int64) *TsmCommonCmd {
	s.P2 = &v
	return s
}

// 设备管控 失败对象
type DeviceControlFail struct {
	// 设备did
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty" require:"true"`
	// 操作失败code
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 操作失败信息
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
}

func (s DeviceControlFail) String() string {
	return tea.Prettify(s)
}

func (s DeviceControlFail) GoString() string {
	return s.String()
}

func (s *DeviceControlFail) SetDeviceDid(v string) *DeviceControlFail {
	s.DeviceDid = &v
	return s
}

func (s *DeviceControlFail) SetCode(v string) *DeviceControlFail {
	s.Code = &v
	return s
}

func (s *DeviceControlFail) SetMessage(v string) *DeviceControlFail {
	s.Message = &v
	return s
}

// 信物链证据基本组成结构体
type EvidenceBaseModel struct {
	// 业务数据
	BizData *string `json:"biz_data,omitempty" xml:"biz_data,omitempty"`
	// 证据哈希值
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
	// 证据附属信息字段
	MetaJson *string `json:"meta_json,omitempty" xml:"meta_json,omitempty"`
}

func (s EvidenceBaseModel) String() string {
	return tea.Prettify(s)
}

func (s EvidenceBaseModel) GoString() string {
	return s.String()
}

func (s *EvidenceBaseModel) SetBizData(v string) *EvidenceBaseModel {
	s.BizData = &v
	return s
}

func (s *EvidenceBaseModel) SetHash(v string) *EvidenceBaseModel {
	s.Hash = &v
	return s
}

func (s *EvidenceBaseModel) SetMetaJson(v string) *EvidenceBaseModel {
	s.MetaJson = &v
	return s
}

// tlsnotary文件认证成功后上传到oss的文件链接列表
type TlsnotaryUploadOssLinks struct {
	// 证书链摘要文件的oss链接
	CertChainDigestLink *string `json:"cert_chain_digest_link,omitempty" xml:"cert_chain_digest_link,omitempty" require:"true"`
	// 邮件eml文件的oss链接
	EmlFileLink *string `json:"eml_file_link,omitempty" xml:"eml_file_link,omitempty" require:"true"`
}

func (s TlsnotaryUploadOssLinks) String() string {
	return tea.Prettify(s)
}

func (s TlsnotaryUploadOssLinks) GoString() string {
	return s.String()
}

func (s *TlsnotaryUploadOssLinks) SetCertChainDigestLink(v string) *TlsnotaryUploadOssLinks {
	s.CertChainDigestLink = &v
	return s
}

func (s *TlsnotaryUploadOssLinks) SetEmlFileLink(v string) *TlsnotaryUploadOssLinks {
	s.EmlFileLink = &v
	return s
}

// 二维码识别响应结构体
type BaiQrcodeParseRespData struct {
	// 二维码内容
	CodeValue []*string `json:"code_value,omitempty" xml:"code_value,omitempty" require:"true" type:"Repeated"`
}

func (s BaiQrcodeParseRespData) String() string {
	return tea.Prettify(s)
}

func (s BaiQrcodeParseRespData) GoString() string {
	return s.String()
}

func (s *BaiQrcodeParseRespData) SetCodeValue(v []*string) *BaiQrcodeParseRespData {
	s.CodeValue = v
	return s
}

// 实体身份更新请求结构体，设备/仓库/空间/组织
type ThingsDidUpdateReq struct {
	// 业务类型，默认空
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 待更新的实体did
	ThingDid *string `json:"thing_did,omitempty" xml:"thing_did,omitempty" require:"true"`
	// 更新内容，参考更新请求不同实体类型结构体，对应不同实体类型不一样
	// 信物链实体附加信息 不同实体身份，有不同的json组织格式，
	// 参考 DeviceRegisterReqModel， SpaceRegisterReqModel， CorporateReqModel， WarehouseReqModel，
	ThingExtraParams *string `json:"thing_extra_params,omitempty" xml:"thing_extra_params,omitempty"`
	// 更新后的实体版本
	ThingVersion *string `json:"thing_version,omitempty" xml:"thing_version,omitempty" require:"true"`
}

func (s ThingsDidUpdateReq) String() string {
	return tea.Prettify(s)
}

func (s ThingsDidUpdateReq) GoString() string {
	return s.String()
}

func (s *ThingsDidUpdateReq) SetBizType(v string) *ThingsDidUpdateReq {
	s.BizType = &v
	return s
}

func (s *ThingsDidUpdateReq) SetThingDid(v string) *ThingsDidUpdateReq {
	s.ThingDid = &v
	return s
}

func (s *ThingsDidUpdateReq) SetThingExtraParams(v string) *ThingsDidUpdateReq {
	s.ThingExtraParams = &v
	return s
}

func (s *ThingsDidUpdateReq) SetThingVersion(v string) *ThingsDidUpdateReq {
	s.ThingVersion = &v
	return s
}

// 标签流转上链返回txHash
type LabelChainResult struct {
	// 标签ID
	LabelId *string `json:"label_id,omitempty" xml:"label_id,omitempty" require:"true"`
	// 业务资产ID，接入方自行定义
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 标签最近一次上链的txHash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 错误码
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 错误信息
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty" require:"true"`
}

func (s LabelChainResult) String() string {
	return tea.Prettify(s)
}

func (s LabelChainResult) GoString() string {
	return s.String()
}

func (s *LabelChainResult) SetLabelId(v string) *LabelChainResult {
	s.LabelId = &v
	return s
}

func (s *LabelChainResult) SetAssetId(v string) *LabelChainResult {
	s.AssetId = &v
	return s
}

func (s *LabelChainResult) SetTxHash(v string) *LabelChainResult {
	s.TxHash = &v
	return s
}

func (s *LabelChainResult) SetErrorCode(v string) *LabelChainResult {
	s.ErrorCode = &v
	return s
}

func (s *LabelChainResult) SetErrorMsg(v string) *LabelChainResult {
	s.ErrorMsg = &v
	return s
}

// 二维码识别请求
type BaiQrcodeParseReqData struct {
	// 待识别图片的url
	ImageUrl *string `json:"image_url,omitempty" xml:"image_url,omitempty" require:"true"`
}

func (s BaiQrcodeParseReqData) String() string {
	return tea.Prettify(s)
}

func (s BaiQrcodeParseReqData) GoString() string {
	return s.String()
}

func (s *BaiQrcodeParseReqData) SetImageUrl(v string) *BaiQrcodeParseReqData {
	s.ImageUrl = &v
	return s
}

// 电脑型号信息
type ComputerInfo struct {
	// 颜色
	Colour *string `json:"colour,omitempty" xml:"colour,omitempty"`
	// 色值
	ColourNumber *string `json:"colour_number,omitempty" xml:"colour_number,omitempty"`
	// 电脑型号
	ComputerModel *string `json:"computer_model,omitempty" xml:"computer_model,omitempty"`
	// 配置参数
	ConfigParam *string `json:"config_param,omitempty" xml:"config_param,omitempty"`
	// 显卡
	VideoCard *string `json:"video_card,omitempty" xml:"video_card,omitempty"`
	// 屏幕
	ScreenSize *string `json:"screen_size,omitempty" xml:"screen_size,omitempty"`
	// 电脑CPU
	Cpu *string `json:"cpu,omitempty" xml:"cpu,omitempty" require:"true"`
	// 电脑内存
	Memory *string `json:"memory,omitempty" xml:"memory,omitempty" require:"true"`
	// 电脑硬盘
	DiskSize *string `json:"disk_size,omitempty" xml:"disk_size,omitempty" require:"true"`
}

func (s ComputerInfo) String() string {
	return tea.Prettify(s)
}

func (s ComputerInfo) GoString() string {
	return s.String()
}

func (s *ComputerInfo) SetColour(v string) *ComputerInfo {
	s.Colour = &v
	return s
}

func (s *ComputerInfo) SetColourNumber(v string) *ComputerInfo {
	s.ColourNumber = &v
	return s
}

func (s *ComputerInfo) SetComputerModel(v string) *ComputerInfo {
	s.ComputerModel = &v
	return s
}

func (s *ComputerInfo) SetConfigParam(v string) *ComputerInfo {
	s.ConfigParam = &v
	return s
}

func (s *ComputerInfo) SetVideoCard(v string) *ComputerInfo {
	s.VideoCard = &v
	return s
}

func (s *ComputerInfo) SetScreenSize(v string) *ComputerInfo {
	s.ScreenSize = &v
	return s
}

func (s *ComputerInfo) SetCpu(v string) *ComputerInfo {
	s.Cpu = &v
	return s
}

func (s *ComputerInfo) SetMemory(v string) *ComputerInfo {
	s.Memory = &v
	return s
}

func (s *ComputerInfo) SetDiskSize(v string) *ComputerInfo {
	s.DiskSize = &v
	return s
}

// 信物链存证查询请求结构体
type EvidenceQueryInfoReq struct {
	// 暂时保留
	DeviceSignature *string `json:"device_signature,omitempty" xml:"device_signature,omitempty"`
	// 暂时保留
	DeviceUid *string `json:"device_uid,omitempty" xml:"device_uid,omitempty"`
	// 不同上链方式
	// "CZ": 普通存证
	// "IOTPAY": 支付存证
	// "RAW": 文本上链
	// "TTTS": 溯源存证
	QueryType *string `json:"query_type,omitempty" xml:"query_type,omitempty" require:"true"`
	// 查询的链上交易txHash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
}

func (s EvidenceQueryInfoReq) String() string {
	return tea.Prettify(s)
}

func (s EvidenceQueryInfoReq) GoString() string {
	return s.String()
}

func (s *EvidenceQueryInfoReq) SetDeviceSignature(v string) *EvidenceQueryInfoReq {
	s.DeviceSignature = &v
	return s
}

func (s *EvidenceQueryInfoReq) SetDeviceUid(v string) *EvidenceQueryInfoReq {
	s.DeviceUid = &v
	return s
}

func (s *EvidenceQueryInfoReq) SetQueryType(v string) *EvidenceQueryInfoReq {
	s.QueryType = &v
	return s
}

func (s *EvidenceQueryInfoReq) SetTxHash(v string) *EvidenceQueryInfoReq {
	s.TxHash = &v
	return s
}

// AI商品鉴定请求信息
type BaiGoodsComparisonReqData struct {
	// 品类
	Category *string `json:"category,omitempty" xml:"category,omitempty" require:"true"`
	// 品牌
	Brand *string `json:"brand,omitempty" xml:"brand,omitempty" require:"true"`
	// 款式
	Style *string `json:"style,omitempty" xml:"style,omitempty" require:"true"`
	// 商品鉴定点列表
	GoodsPoints []*BaiGoodsPoint `json:"goods_points,omitempty" xml:"goods_points,omitempty" require:"true" type:"Repeated"`
	// 用户自定义字符串，系统不做处理，会在响应体中带回
	OutState *string `json:"out_state,omitempty" xml:"out_state,omitempty"`
}

func (s BaiGoodsComparisonReqData) String() string {
	return tea.Prettify(s)
}

func (s BaiGoodsComparisonReqData) GoString() string {
	return s.String()
}

func (s *BaiGoodsComparisonReqData) SetCategory(v string) *BaiGoodsComparisonReqData {
	s.Category = &v
	return s
}

func (s *BaiGoodsComparisonReqData) SetBrand(v string) *BaiGoodsComparisonReqData {
	s.Brand = &v
	return s
}

func (s *BaiGoodsComparisonReqData) SetStyle(v string) *BaiGoodsComparisonReqData {
	s.Style = &v
	return s
}

func (s *BaiGoodsComparisonReqData) SetGoodsPoints(v []*BaiGoodsPoint) *BaiGoodsComparisonReqData {
	s.GoodsPoints = v
	return s
}

func (s *BaiGoodsComparisonReqData) SetOutState(v string) *BaiGoodsComparisonReqData {
	s.OutState = &v
	return s
}

// 收集数据返回的上链结果
type SendCollectorResult struct {
	// 数据内容content的上链交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
}

func (s SendCollectorResult) String() string {
	return tea.Prettify(s)
}

func (s SendCollectorResult) GoString() string {
	return s.String()
}

func (s *SendCollectorResult) SetTxHash(v string) *SendCollectorResult {
	s.TxHash = &v
	return s
}

// 指纹图片入库是否成功
type GoodsDigitalFingerprintRegisterResultData struct {
	// 指纹图片入库是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 失败原因
	Describe *string `json:"describe,omitempty" xml:"describe,omitempty"`
}

func (s GoodsDigitalFingerprintRegisterResultData) String() string {
	return tea.Prettify(s)
}

func (s GoodsDigitalFingerprintRegisterResultData) GoString() string {
	return s.String()
}

func (s *GoodsDigitalFingerprintRegisterResultData) SetSuccess(v bool) *GoodsDigitalFingerprintRegisterResultData {
	s.Success = &v
	return s
}

func (s *GoodsDigitalFingerprintRegisterResultData) SetDescribe(v string) *GoodsDigitalFingerprintRegisterResultData {
	s.Describe = &v
	return s
}

// 租户项目创建请求结构体模型
type TenantProjectCreateReq struct {
	// 业务类型，默认空
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 可选的，项目关联的区块链类型，1/2/3代表存证/合约等类型
	BlockchainType *int64 `json:"blockchain_type,omitempty" xml:"blockchain_type,omitempty"`
	// 可选的，项目关联的区块链uid
	BlockchainUid *string `json:"blockchain_uid,omitempty" xml:"blockchain_uid,omitempty"`
	// 租户下唯一项目名称，用以标识项目聚合的存证等信息
	ProjectName *string `json:"project_name,omitempty" xml:"project_name,omitempty" require:"true"`
}

func (s TenantProjectCreateReq) String() string {
	return tea.Prettify(s)
}

func (s TenantProjectCreateReq) GoString() string {
	return s.String()
}

func (s *TenantProjectCreateReq) SetBizType(v string) *TenantProjectCreateReq {
	s.BizType = &v
	return s
}

func (s *TenantProjectCreateReq) SetBlockchainType(v int64) *TenantProjectCreateReq {
	s.BlockchainType = &v
	return s
}

func (s *TenantProjectCreateReq) SetBlockchainUid(v string) *TenantProjectCreateReq {
	s.BlockchainUid = &v
	return s
}

func (s *TenantProjectCreateReq) SetProjectName(v string) *TenantProjectCreateReq {
	s.ProjectName = &v
	return s
}

// 设备硬件模块信息体
type IotBasicDeviceHardWareModule struct {
	// 所属规格
	SpecsId *int64 `json:"specs_id,omitempty" xml:"specs_id,omitempty" require:"true"`
	// 硬件模块ID
	HardwareModuleId *int64 `json:"hardware_module_id,omitempty" xml:"hardware_module_id,omitempty" require:"true"`
	// 模块名称
	HardwareModuleName *string `json:"hardware_module_name,omitempty" xml:"hardware_module_name,omitempty" require:"true"`
	// 模块编码
	HardwareModuleValue *string `json:"hardware_module_value,omitempty" xml:"hardware_module_value,omitempty" require:"true"`
	// 模块参数
	HardwareModuleParam *string `json:"hardware_module_param,omitempty" xml:"hardware_module_param,omitempty" require:"true"`
}

func (s IotBasicDeviceHardWareModule) String() string {
	return tea.Prettify(s)
}

func (s IotBasicDeviceHardWareModule) GoString() string {
	return s.String()
}

func (s *IotBasicDeviceHardWareModule) SetSpecsId(v int64) *IotBasicDeviceHardWareModule {
	s.SpecsId = &v
	return s
}

func (s *IotBasicDeviceHardWareModule) SetHardwareModuleId(v int64) *IotBasicDeviceHardWareModule {
	s.HardwareModuleId = &v
	return s
}

func (s *IotBasicDeviceHardWareModule) SetHardwareModuleName(v string) *IotBasicDeviceHardWareModule {
	s.HardwareModuleName = &v
	return s
}

func (s *IotBasicDeviceHardWareModule) SetHardwareModuleValue(v string) *IotBasicDeviceHardWareModule {
	s.HardwareModuleValue = &v
	return s
}

func (s *IotBasicDeviceHardWareModule) SetHardwareModuleParam(v string) *IotBasicDeviceHardWareModule {
	s.HardwareModuleParam = &v
	return s
}

// 订单同步失败结果
type DeviceOrderFail struct {
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 设备did
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty" require:"true"`
	// 返回code
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 失败
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
}

func (s DeviceOrderFail) String() string {
	return tea.Prettify(s)
}

func (s DeviceOrderFail) GoString() string {
	return s.String()
}

func (s *DeviceOrderFail) SetOrderId(v string) *DeviceOrderFail {
	s.OrderId = &v
	return s
}

func (s *DeviceOrderFail) SetDeviceDid(v string) *DeviceOrderFail {
	s.DeviceDid = &v
	return s
}

func (s *DeviceOrderFail) SetCode(v string) *DeviceOrderFail {
	s.Code = &v
	return s
}

func (s *DeviceOrderFail) SetMessage(v string) *DeviceOrderFail {
	s.Message = &v
	return s
}

// 二维码验真接口返回值
type BaiQrcodeComparisonRespData struct {
	// 识别结果（REAL：真   FAKE：假   UNABLE_IDENTIFY：无法识别）
	IdentificationResult *string `json:"identification_result,omitempty" xml:"identification_result,omitempty" require:"true"`
	// 辅助识别结果码
	IdentificationCode *string `json:"identification_code,omitempty" xml:"identification_code,omitempty"`
	// 辅助识别信息
	IdentificationMessage *string `json:"identification_message,omitempty" xml:"identification_message,omitempty"`
	// 无法识别时提示的解决方案
	UnableIdentifySolution *string `json:"unable_identify_solution,omitempty" xml:"unable_identify_solution,omitempty"`
}

func (s BaiQrcodeComparisonRespData) String() string {
	return tea.Prettify(s)
}

func (s BaiQrcodeComparisonRespData) GoString() string {
	return s.String()
}

func (s *BaiQrcodeComparisonRespData) SetIdentificationResult(v string) *BaiQrcodeComparisonRespData {
	s.IdentificationResult = &v
	return s
}

func (s *BaiQrcodeComparisonRespData) SetIdentificationCode(v string) *BaiQrcodeComparisonRespData {
	s.IdentificationCode = &v
	return s
}

func (s *BaiQrcodeComparisonRespData) SetIdentificationMessage(v string) *BaiQrcodeComparisonRespData {
	s.IdentificationMessage = &v
	return s
}

func (s *BaiQrcodeComparisonRespData) SetUnableIdentifySolution(v string) *BaiQrcodeComparisonRespData {
	s.UnableIdentifySolution = &v
	return s
}

// 收集标签数据
type CollectLabelContent struct {
	// 链上设备ID
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty" require:"true"`
	// 1.设备端上报数据内容
	// 2.与设备上报的数据一致，服务端不可修改
	// 3.解析后需与DataModel匹配
	// 4.映射 Label 对象结构化存储
	// 5.转为JSON后如果是JSONObject 映射单个 Label
	// 6.转为JSON后如果是JSONArray 映射多个 Label
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// content的签名
	// 与设备上报的签名保持一致，服务端不可修改
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
	// 未经设备签名的附加数据JSON String
	// 注意：如果 content 批量解析 ，extraData也会批量复制融入解析后的content
	ExtraData *string `json:"extra_data,omitempty" xml:"extra_data,omitempty"`
}

func (s CollectLabelContent) String() string {
	return tea.Prettify(s)
}

func (s CollectLabelContent) GoString() string {
	return s.String()
}

func (s *CollectLabelContent) SetChainDeviceId(v string) *CollectLabelContent {
	s.ChainDeviceId = &v
	return s
}

func (s *CollectLabelContent) SetContent(v string) *CollectLabelContent {
	s.Content = &v
	return s
}

func (s *CollectLabelContent) SetSignature(v string) *CollectLabelContent {
	s.Signature = &v
	return s
}

func (s *CollectLabelContent) SetExtraData(v string) *CollectLabelContent {
	s.ExtraData = &v
	return s
}

// 数据上链成功结果数据
type DeviceCollectResult struct {
	// 上链数据采集ID
	CollectId *string `json:"collect_id,omitempty" xml:"collect_id,omitempty" require:"true"`
	// 上链id
	AntchainId *string `json:"antchain_id,omitempty" xml:"antchain_id,omitempty"`
}

func (s DeviceCollectResult) String() string {
	return tea.Prettify(s)
}

func (s DeviceCollectResult) GoString() string {
	return s.String()
}

func (s *DeviceCollectResult) SetCollectId(v string) *DeviceCollectResult {
	s.CollectId = &v
	return s
}

func (s *DeviceCollectResult) SetAntchainId(v string) *DeviceCollectResult {
	s.AntchainId = &v
	return s
}

// ProductKey分页查询结果
type ProductKeyPageResponse struct {
	// 页数
	//
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
	// 页码
	//
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 总记录数
	//
	TotalSize *int64 `json:"total_size,omitempty" xml:"total_size,omitempty" require:"true"`
	// 总页数
	//
	TotalPages *int64 `json:"total_pages,omitempty" xml:"total_pages,omitempty" require:"true"`
	// 数据
	PageData []*ProductKeyModel `json:"page_data,omitempty" xml:"page_data,omitempty" require:"true" type:"Repeated"`
}

func (s ProductKeyPageResponse) String() string {
	return tea.Prettify(s)
}

func (s ProductKeyPageResponse) GoString() string {
	return s.String()
}

func (s *ProductKeyPageResponse) SetPageIndex(v int64) *ProductKeyPageResponse {
	s.PageIndex = &v
	return s
}

func (s *ProductKeyPageResponse) SetPageSize(v int64) *ProductKeyPageResponse {
	s.PageSize = &v
	return s
}

func (s *ProductKeyPageResponse) SetTotalSize(v int64) *ProductKeyPageResponse {
	s.TotalSize = &v
	return s
}

func (s *ProductKeyPageResponse) SetTotalPages(v int64) *ProductKeyPageResponse {
	s.TotalPages = &v
	return s
}

func (s *ProductKeyPageResponse) SetPageData(v []*ProductKeyModel) *ProductKeyPageResponse {
	s.PageData = v
	return s
}

// 上链数据结果集
type ChainModelResult struct {
	// 所属业务
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
	// 资产类型
	DataScene *string `json:"data_scene,omitempty" xml:"data_scene,omitempty" require:"true"`
	// 资产id
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 资产数据内容json
	AssetData *string `json:"asset_data,omitempty" xml:"asset_data,omitempty" require:"true"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 上链时间
	TxTime *string `json:"tx_time,omitempty" xml:"tx_time,omitempty" require:"true"`
	// 业务ID
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty" require:"true"`
}

func (s ChainModelResult) String() string {
	return tea.Prettify(s)
}

func (s ChainModelResult) GoString() string {
	return s.String()
}

func (s *ChainModelResult) SetBizScene(v string) *ChainModelResult {
	s.BizScene = &v
	return s
}

func (s *ChainModelResult) SetDataScene(v string) *ChainModelResult {
	s.DataScene = &v
	return s
}

func (s *ChainModelResult) SetAssetId(v string) *ChainModelResult {
	s.AssetId = &v
	return s
}

func (s *ChainModelResult) SetAssetData(v string) *ChainModelResult {
	s.AssetData = &v
	return s
}

func (s *ChainModelResult) SetTenantId(v string) *ChainModelResult {
	s.TenantId = &v
	return s
}

func (s *ChainModelResult) SetTxTime(v string) *ChainModelResult {
	s.TxTime = &v
	return s
}

func (s *ChainModelResult) SetBusinessId(v string) *ChainModelResult {
	s.BusinessId = &v
	return s
}

// 空间实体身份附加参数请求结构体，应用在注册/更新API的ThingExtraParams
type SpaceRegisterReqModel struct {
	// 面积 平方米单位*1e4
	Area *int64 `json:"area,omitempty" xml:"area,omitempty"`
	// 自定义业务类型，例如选择：危险品/非危险品/食品
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 海拔 米单位*1e2
	Elevation *int64 `json:"elevation,omitempty" xml:"elevation,omitempty"`
	// 高度 米单位*1e2
	Height *int64 `json:"height,omitempty" xml:"height,omitempty"`
	// 纬度 度数单位*1e9
	Latitude *int64 `json:"latitude,omitempty" xml:"latitude,omitempty"`
	// 经度 度数单位*1e9
	Longitude *int64 `json:"longitude,omitempty" xml:"longitude,omitempty"`
	// 自定义其他字段
	OtherInfo *string `json:"other_info,omitempty" xml:"other_info,omitempty"`
	// 父类型，在业务中自定义关联，例如仓位的父节点是仓库
	ParentDid *string `json:"parent_did,omitempty" xml:"parent_did,omitempty"`
	// 可填入符合w3c did定义的服务节点
	ServiceEndpoint *string `json:"service_endpoint,omitempty" xml:"service_endpoint,omitempty"`
	// 空间状态，自定义
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 空间类型，例如冷藏/冷冻/通道/平面/立体
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s SpaceRegisterReqModel) String() string {
	return tea.Prettify(s)
}

func (s SpaceRegisterReqModel) GoString() string {
	return s.String()
}

func (s *SpaceRegisterReqModel) SetArea(v int64) *SpaceRegisterReqModel {
	s.Area = &v
	return s
}

func (s *SpaceRegisterReqModel) SetBizType(v string) *SpaceRegisterReqModel {
	s.BizType = &v
	return s
}

func (s *SpaceRegisterReqModel) SetElevation(v int64) *SpaceRegisterReqModel {
	s.Elevation = &v
	return s
}

func (s *SpaceRegisterReqModel) SetHeight(v int64) *SpaceRegisterReqModel {
	s.Height = &v
	return s
}

func (s *SpaceRegisterReqModel) SetLatitude(v int64) *SpaceRegisterReqModel {
	s.Latitude = &v
	return s
}

func (s *SpaceRegisterReqModel) SetLongitude(v int64) *SpaceRegisterReqModel {
	s.Longitude = &v
	return s
}

func (s *SpaceRegisterReqModel) SetOtherInfo(v string) *SpaceRegisterReqModel {
	s.OtherInfo = &v
	return s
}

func (s *SpaceRegisterReqModel) SetParentDid(v string) *SpaceRegisterReqModel {
	s.ParentDid = &v
	return s
}

func (s *SpaceRegisterReqModel) SetServiceEndpoint(v string) *SpaceRegisterReqModel {
	s.ServiceEndpoint = &v
	return s
}

func (s *SpaceRegisterReqModel) SetStatus(v string) *SpaceRegisterReqModel {
	s.Status = &v
	return s
}

func (s *SpaceRegisterReqModel) SetType(v string) *SpaceRegisterReqModel {
	s.Type = &v
	return s
}

// 标签流转历史
type LabelTrace struct {
	// 操作内容
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 链上哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 上链时间
	TxTime *string `json:"tx_time,omitempty" xml:"tx_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 上链失败的错误码
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 上链失败的错误信息
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
	// 是否上链成功
	IsSuccess *bool `json:"is_success,omitempty" xml:"is_success,omitempty"`
	// 标签对应资产版本号
	Version *int64 `json:"version,omitempty" xml:"version,omitempty"`
}

func (s LabelTrace) String() string {
	return tea.Prettify(s)
}

func (s LabelTrace) GoString() string {
	return s.String()
}

func (s *LabelTrace) SetContent(v string) *LabelTrace {
	s.Content = &v
	return s
}

func (s *LabelTrace) SetTxHash(v string) *LabelTrace {
	s.TxHash = &v
	return s
}

func (s *LabelTrace) SetTxTime(v string) *LabelTrace {
	s.TxTime = &v
	return s
}

func (s *LabelTrace) SetErrorCode(v string) *LabelTrace {
	s.ErrorCode = &v
	return s
}

func (s *LabelTrace) SetErrorMsg(v string) *LabelTrace {
	s.ErrorMsg = &v
	return s
}

func (s *LabelTrace) SetIsSuccess(v bool) *LabelTrace {
	s.IsSuccess = &v
	return s
}

func (s *LabelTrace) SetVersion(v int64) *LabelTrace {
	s.Version = &v
	return s
}

// 外围设备信息
type Peripheral struct {
	// 外围设备Id
	PeripheralId *string `json:"peripheral_id,omitempty" xml:"peripheral_id,omitempty" require:"true"`
	// 数据模型id
	//
	PeripheralDataModelId *string `json:"peripheral_data_model_id,omitempty" xml:"peripheral_data_model_id,omitempty" require:"true"`
	// 场景码
	//
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 外围设备名称
	//
	PeripheralName *string `json:"peripheral_name,omitempty" xml:"peripheral_name,omitempty"`
	// 厂商名称
	//
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty"`
	// 链上外围设备Id
	//
	ChainPeripheralId *string `json:"chain_peripheral_id,omitempty" xml:"chain_peripheral_id,omitempty" require:"true"`
	// 链上哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 上链时间
	TxTime *int64 `json:"tx_time,omitempty" xml:"tx_time,omitempty" require:"true"`
	// 设备类型编码，必填，对应资管平台中的设备类型
	//
	// 枚举值：
	//
	// 车辆 1000
	// 车辆 四轮车 1001
	// 车辆 四轮车 纯电四轮车 1002
	// 车辆 四轮车 混动四轮车 1003
	// 车辆 四轮车 燃油四轮车 1004
	// 车辆 两轮车 1011
	// 车辆 两轮车 两轮单车 1012
	// 车辆 两轮车 两轮助力车 1013
	//
	// 换电柜 2000
	// 换电柜 二轮车换电柜 2001
	//
	// 电池 3000
	// 电池 磷酸铁电池 3001
	// 电池 三元锂电池 3002
	//
	// 回收设备 4000
	//
	// 垃圾分类回收 4001
	//
	// 洗车机 5000
	DeviceTypeCode *int64 `json:"device_type_code,omitempty" xml:"device_type_code,omitempty" require:"true"`
	// 单价，单位分
	InitialPrice *int64 `json:"initial_price,omitempty" xml:"initial_price,omitempty" require:"true"`
	// 出厂时间
	FactoryTime *string `json:"factory_time,omitempty" xml:"factory_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 投放时间
	ReleaseTime *string `json:"release_time,omitempty" xml:"release_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s Peripheral) String() string {
	return tea.Prettify(s)
}

func (s Peripheral) GoString() string {
	return s.String()
}

func (s *Peripheral) SetPeripheralId(v string) *Peripheral {
	s.PeripheralId = &v
	return s
}

func (s *Peripheral) SetPeripheralDataModelId(v string) *Peripheral {
	s.PeripheralDataModelId = &v
	return s
}

func (s *Peripheral) SetScene(v string) *Peripheral {
	s.Scene = &v
	return s
}

func (s *Peripheral) SetPeripheralName(v string) *Peripheral {
	s.PeripheralName = &v
	return s
}

func (s *Peripheral) SetCorpName(v string) *Peripheral {
	s.CorpName = &v
	return s
}

func (s *Peripheral) SetChainPeripheralId(v string) *Peripheral {
	s.ChainPeripheralId = &v
	return s
}

func (s *Peripheral) SetTxHash(v string) *Peripheral {
	s.TxHash = &v
	return s
}

func (s *Peripheral) SetTxTime(v int64) *Peripheral {
	s.TxTime = &v
	return s
}

func (s *Peripheral) SetDeviceTypeCode(v int64) *Peripheral {
	s.DeviceTypeCode = &v
	return s
}

func (s *Peripheral) SetInitialPrice(v int64) *Peripheral {
	s.InitialPrice = &v
	return s
}

func (s *Peripheral) SetFactoryTime(v string) *Peripheral {
	s.FactoryTime = &v
	return s
}

func (s *Peripheral) SetReleaseTime(v string) *Peripheral {
	s.ReleaseTime = &v
	return s
}

// 订单计费数据
type OrderPushInfo struct {
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 时间戳，取订单上链timestamp字段
	OrderCollectTime *string `json:"order_collect_time,omitempty" xml:"order_collect_time,omitempty" require:"true"`
	// 订单总金额
	TotalAmount *string `json:"total_amount,omitempty" xml:"total_amount,omitempty" require:"true"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
}

func (s OrderPushInfo) String() string {
	return tea.Prettify(s)
}

func (s OrderPushInfo) GoString() string {
	return s.String()
}

func (s *OrderPushInfo) SetOrderId(v string) *OrderPushInfo {
	s.OrderId = &v
	return s
}

func (s *OrderPushInfo) SetOrderCollectTime(v string) *OrderPushInfo {
	s.OrderCollectTime = &v
	return s
}

func (s *OrderPushInfo) SetTotalAmount(v string) *OrderPushInfo {
	s.TotalAmount = &v
	return s
}

func (s *OrderPushInfo) SetTenantId(v string) *OrderPushInfo {
	s.TenantId = &v
	return s
}

// 订单同步成功列表
type DeviceOrderResult struct {
	// 上链id
	AntchainId *string `json:"antchain_id,omitempty" xml:"antchain_id,omitempty" require:"true"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s DeviceOrderResult) String() string {
	return tea.Prettify(s)
}

func (s DeviceOrderResult) GoString() string {
	return s.String()
}

func (s *DeviceOrderResult) SetAntchainId(v string) *DeviceOrderResult {
	s.AntchainId = &v
	return s
}

func (s *DeviceOrderResult) SetOrderId(v string) *DeviceOrderResult {
	s.OrderId = &v
	return s
}

// 设备注册结果对象
type IotBasicDeviceRegisterResult struct {
	// 设备did
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty" require:"true"`
	// 设备密钥
	PrivateKey *string `json:"private_key,omitempty" xml:"private_key,omitempty" require:"true"`
	// 设备名称
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty" require:"true"`
	// 设备sn
	DeviceSn *string `json:"device_sn,omitempty" xml:"device_sn,omitempty" require:"true"`
}

func (s IotBasicDeviceRegisterResult) String() string {
	return tea.Prettify(s)
}

func (s IotBasicDeviceRegisterResult) GoString() string {
	return s.String()
}

func (s *IotBasicDeviceRegisterResult) SetDeviceDid(v string) *IotBasicDeviceRegisterResult {
	s.DeviceDid = &v
	return s
}

func (s *IotBasicDeviceRegisterResult) SetPrivateKey(v string) *IotBasicDeviceRegisterResult {
	s.PrivateKey = &v
	return s
}

func (s *IotBasicDeviceRegisterResult) SetDeviceName(v string) *IotBasicDeviceRegisterResult {
	s.DeviceName = &v
	return s
}

func (s *IotBasicDeviceRegisterResult) SetDeviceSn(v string) *IotBasicDeviceRegisterResult {
	s.DeviceSn = &v
	return s
}

// 信物链实体身份注册请求结构体
type ThingsDidBaseRegisterRequest struct {
	// 信物链实体的所有者的分布式身份
	OwnerTenantDid *string `json:"owner_tenant_did,omitempty" xml:"owner_tenant_did,omitempty"`
	// 信物链实体的使用方的分布式身份列表
	UserDid []*string `json:"user_did,omitempty" xml:"user_did,omitempty" type:"Repeated"`
	// 信物链实体身份
	// DID_TYPE_DEVICE_ALIYUN: 阿里云设备
	// DID_TYPE_DEVICE_PEGASUS: 链机设备
	// DID_TYPE_DEVICE_MCU: MCU设备
	// DID_TYPE_DEVICE_INTEL: intel设备
	// DID_TYPE_DEVICE_DEVICE: 默认设备
	// ...
	// DID_TYPE_CORPORATE:  组织实体
	// DID_TYPE_WAREHOUSE：仓库实体
	// DID_TYPE_SPACE： 空间实体
	ThingType *string `json:"thing_type,omitempty" xml:"thing_type,omitempty" require:"true"`
	// 原始id，租户内同一类型实体唯一
	ThingOriginId *string `json:"thing_origin_id,omitempty" xml:"thing_origin_id,omitempty" require:"true"`
	// 实体原始名称
	ThingOriginName *string `json:"thing_origin_name,omitempty" xml:"thing_origin_name,omitempty" require:"true"`
	// 实体版本
	ThingVersion *string `json:"thing_version,omitempty" xml:"thing_version,omitempty" require:"true"`
	// 业务编码
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 信物链实体附加信息
	// 不同实体身份，有不同的json组织格式，参考另外技术文档
	ThingExtraParams *string `json:"thing_extra_params,omitempty" xml:"thing_extra_params,omitempty"`
}

func (s ThingsDidBaseRegisterRequest) String() string {
	return tea.Prettify(s)
}

func (s ThingsDidBaseRegisterRequest) GoString() string {
	return s.String()
}

func (s *ThingsDidBaseRegisterRequest) SetOwnerTenantDid(v string) *ThingsDidBaseRegisterRequest {
	s.OwnerTenantDid = &v
	return s
}

func (s *ThingsDidBaseRegisterRequest) SetUserDid(v []*string) *ThingsDidBaseRegisterRequest {
	s.UserDid = v
	return s
}

func (s *ThingsDidBaseRegisterRequest) SetThingType(v string) *ThingsDidBaseRegisterRequest {
	s.ThingType = &v
	return s
}

func (s *ThingsDidBaseRegisterRequest) SetThingOriginId(v string) *ThingsDidBaseRegisterRequest {
	s.ThingOriginId = &v
	return s
}

func (s *ThingsDidBaseRegisterRequest) SetThingOriginName(v string) *ThingsDidBaseRegisterRequest {
	s.ThingOriginName = &v
	return s
}

func (s *ThingsDidBaseRegisterRequest) SetThingVersion(v string) *ThingsDidBaseRegisterRequest {
	s.ThingVersion = &v
	return s
}

func (s *ThingsDidBaseRegisterRequest) SetBizType(v string) *ThingsDidBaseRegisterRequest {
	s.BizType = &v
	return s
}

func (s *ThingsDidBaseRegisterRequest) SetThingExtraParams(v string) *ThingsDidBaseRegisterRequest {
	s.ThingExtraParams = &v
	return s
}

// 告警策略分页查询结果
type AlertStrategyPageResponse struct {
	// 页数
	//
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
	// 页码
	//
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 总记录数
	//
	TotalSize *int64 `json:"total_size,omitempty" xml:"total_size,omitempty" require:"true"`
	// 总页数
	//
	TotalPages *int64 `json:"total_pages,omitempty" xml:"total_pages,omitempty" require:"true"`
	// 数据
	PageData []*AlertStrategy `json:"page_data,omitempty" xml:"page_data,omitempty" require:"true" type:"Repeated"`
}

func (s AlertStrategyPageResponse) String() string {
	return tea.Prettify(s)
}

func (s AlertStrategyPageResponse) GoString() string {
	return s.String()
}

func (s *AlertStrategyPageResponse) SetPageIndex(v int64) *AlertStrategyPageResponse {
	s.PageIndex = &v
	return s
}

func (s *AlertStrategyPageResponse) SetPageSize(v int64) *AlertStrategyPageResponse {
	s.PageSize = &v
	return s
}

func (s *AlertStrategyPageResponse) SetTotalSize(v int64) *AlertStrategyPageResponse {
	s.TotalSize = &v
	return s
}

func (s *AlertStrategyPageResponse) SetTotalPages(v int64) *AlertStrategyPageResponse {
	s.TotalPages = &v
	return s
}

func (s *AlertStrategyPageResponse) SetPageData(v []*AlertStrategy) *AlertStrategyPageResponse {
	s.PageData = v
	return s
}

// 场景分页查询结果
type ScenePageResponse struct {
	// 页数
	//
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
	// 页码
	//
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 总记录数
	//
	TotalSize *int64 `json:"total_size,omitempty" xml:"total_size,omitempty" require:"true"`
	// 总页数
	//
	TotalPages *int64 `json:"total_pages,omitempty" xml:"total_pages,omitempty" require:"true"`
	// 数据
	PageData []*SceneModel `json:"page_data,omitempty" xml:"page_data,omitempty" require:"true" type:"Repeated"`
}

func (s ScenePageResponse) String() string {
	return tea.Prettify(s)
}

func (s ScenePageResponse) GoString() string {
	return s.String()
}

func (s *ScenePageResponse) SetPageIndex(v int64) *ScenePageResponse {
	s.PageIndex = &v
	return s
}

func (s *ScenePageResponse) SetPageSize(v int64) *ScenePageResponse {
	s.PageSize = &v
	return s
}

func (s *ScenePageResponse) SetTotalSize(v int64) *ScenePageResponse {
	s.TotalSize = &v
	return s
}

func (s *ScenePageResponse) SetTotalPages(v int64) *ScenePageResponse {
	s.TotalPages = &v
	return s
}

func (s *ScenePageResponse) SetPageData(v []*SceneModel) *ScenePageResponse {
	s.PageData = v
	return s
}

// 信物链实体查询返回的数据结构，对应数据表字段
type DidBaseQueryResp struct {
	// 授权水平，0-默认关联授权
	AuthLevel *int64 `json:"auth_level,omitempty" xml:"auth_level,omitempty"`
	// 证书公钥，特定实体可查询
	CertPublicKey *string `json:"cert_public_key,omitempty" xml:"cert_public_key,omitempty"`
	// 证书文本，特定实体可以查询
	CertText *string `json:"cert_text,omitempty" xml:"cert_text,omitempty"`
	// DID扩展，设备/企业组织/仓库/空间的解析同ThingExtraParams
	DidExtension *string `json:"did_extension,omitempty" xml:"did_extension,omitempty"`
	// did公钥，特定w3c did实体可查询
	DidPublicKey *string `json:"did_public_key,omitempty" xml:"did_public_key,omitempty"`
	// DID用户名，w3c did实体可查询
	DidUsername *string `json:"did_username,omitempty" xml:"did_username,omitempty"`
	// 所有者DID
	OwnerDid *string `json:"owner_did,omitempty" xml:"owner_did,omitempty"`
	// 实体附属空间列表，例如仓库下属库位，设备关联库位等
	SpacesAttached []*string `json:"spaces_attached,omitempty" xml:"spaces_attached,omitempty" type:"Repeated"`
	// 实体附属实体列表，例如空间关联设备列表
	ThingsAttached []*string `json:"things_attached,omitempty" xml:"things_attached,omitempty" type:"Repeated"`
	// 实体属性，在阿里云iot设备，对应三元组
	ThingAttribute *string `json:"thing_attribute,omitempty" xml:"thing_attribute,omitempty"`
	// 原始ID
	ThingId *string `json:"thing_id,omitempty" xml:"thing_id,omitempty"`
	// 实体物模型id
	ThingModelId *string `json:"thing_model_id,omitempty" xml:"thing_model_id,omitempty"`
	// 服务端点，可实现w3c service endpoint
	ThingServiceEndpoint *string `json:"thing_service_endpoint,omitempty" xml:"thing_service_endpoint,omitempty"`
	// 设备状态需要是通过 updateStatus api更新，
	// 其他状态通过updateThingsDid api更新
	ThingStatus *string `json:"thing_status,omitempty" xml:"thing_status,omitempty"`
	// 实体类型，注册时候的类型
	// 0: 阿里云设备
	// 1: 链机设备
	// 2: MCU设备
	// 3: INTEL设备
	// 16384:  默认设备
	// 65536: 组织身份
	// 131072: 仓库身份
	// 196608: 空间身份
	ThingType *int64 `json:"thing_type,omitempty" xml:"thing_type,omitempty"`
	// 实体版本
	ThingVersion *string `json:"thing_version,omitempty" xml:"thing_version,omitempty"`
	// 使用者DID列表
	UserDidList []*string `json:"user_did_list,omitempty" xml:"user_did_list,omitempty" type:"Repeated"`
	// 查询的did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s DidBaseQueryResp) String() string {
	return tea.Prettify(s)
}

func (s DidBaseQueryResp) GoString() string {
	return s.String()
}

func (s *DidBaseQueryResp) SetAuthLevel(v int64) *DidBaseQueryResp {
	s.AuthLevel = &v
	return s
}

func (s *DidBaseQueryResp) SetCertPublicKey(v string) *DidBaseQueryResp {
	s.CertPublicKey = &v
	return s
}

func (s *DidBaseQueryResp) SetCertText(v string) *DidBaseQueryResp {
	s.CertText = &v
	return s
}

func (s *DidBaseQueryResp) SetDidExtension(v string) *DidBaseQueryResp {
	s.DidExtension = &v
	return s
}

func (s *DidBaseQueryResp) SetDidPublicKey(v string) *DidBaseQueryResp {
	s.DidPublicKey = &v
	return s
}

func (s *DidBaseQueryResp) SetDidUsername(v string) *DidBaseQueryResp {
	s.DidUsername = &v
	return s
}

func (s *DidBaseQueryResp) SetOwnerDid(v string) *DidBaseQueryResp {
	s.OwnerDid = &v
	return s
}

func (s *DidBaseQueryResp) SetSpacesAttached(v []*string) *DidBaseQueryResp {
	s.SpacesAttached = v
	return s
}

func (s *DidBaseQueryResp) SetThingsAttached(v []*string) *DidBaseQueryResp {
	s.ThingsAttached = v
	return s
}

func (s *DidBaseQueryResp) SetThingAttribute(v string) *DidBaseQueryResp {
	s.ThingAttribute = &v
	return s
}

func (s *DidBaseQueryResp) SetThingId(v string) *DidBaseQueryResp {
	s.ThingId = &v
	return s
}

func (s *DidBaseQueryResp) SetThingModelId(v string) *DidBaseQueryResp {
	s.ThingModelId = &v
	return s
}

func (s *DidBaseQueryResp) SetThingServiceEndpoint(v string) *DidBaseQueryResp {
	s.ThingServiceEndpoint = &v
	return s
}

func (s *DidBaseQueryResp) SetThingStatus(v string) *DidBaseQueryResp {
	s.ThingStatus = &v
	return s
}

func (s *DidBaseQueryResp) SetThingType(v int64) *DidBaseQueryResp {
	s.ThingType = &v
	return s
}

func (s *DidBaseQueryResp) SetThingVersion(v string) *DidBaseQueryResp {
	s.ThingVersion = &v
	return s
}

func (s *DidBaseQueryResp) SetUserDidList(v []*string) *DidBaseQueryResp {
	s.UserDidList = v
	return s
}

func (s *DidBaseQueryResp) SetDid(v string) *DidBaseQueryResp {
	s.Did = &v
	return s
}

// 用户操作集合
type IotBasicUserRequest struct {
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 金融云用户id
	CloudUserId *string `json:"cloud_user_id,omitempty" xml:"cloud_user_id,omitempty"`
	// 登录名
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
}

func (s IotBasicUserRequest) String() string {
	return tea.Prettify(s)
}

func (s IotBasicUserRequest) GoString() string {
	return s.String()
}

func (s *IotBasicUserRequest) SetTenantId(v string) *IotBasicUserRequest {
	s.TenantId = &v
	return s
}

func (s *IotBasicUserRequest) SetCloudUserId(v string) *IotBasicUserRequest {
	s.CloudUserId = &v
	return s
}

func (s *IotBasicUserRequest) SetLoginName(v string) *IotBasicUserRequest {
	s.LoginName = &v
	return s
}

// 设备业务数据
type BizContentGroup struct {
	// 设备链上ID（与scene参数、可信设备ID至少有一个参数不为空）
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty"`
	// 可信设备ID（与scene参数、设备链上ID至少有一个参数不为空）
	TrustiotDeviceId *int64 `json:"trustiot_device_id,omitempty" xml:"trustiot_device_id,omitempty"`
	// 业务Id
	//
	//
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 业务类型
	//
	//
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 数据内容 JSON字符串
	//
	//
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s BizContentGroup) String() string {
	return tea.Prettify(s)
}

func (s BizContentGroup) GoString() string {
	return s.String()
}

func (s *BizContentGroup) SetChainDeviceId(v string) *BizContentGroup {
	s.ChainDeviceId = &v
	return s
}

func (s *BizContentGroup) SetTrustiotDeviceId(v int64) *BizContentGroup {
	s.TrustiotDeviceId = &v
	return s
}

func (s *BizContentGroup) SetBizId(v string) *BizContentGroup {
	s.BizId = &v
	return s
}

func (s *BizContentGroup) SetBizType(v string) *BizContentGroup {
	s.BizType = &v
	return s
}

func (s *BizContentGroup) SetContent(v string) *BizContentGroup {
	s.Content = &v
	return s
}

// 组织请求注册更新结构体，应用在注册/更新API的ThingExtraParams
type CorporateReqModel struct {
	// 组织地址
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 运营地址
	BusinessAddress *string `json:"business_address,omitempty" xml:"business_address,omitempty"`
	// 经营类目
	BusinessScope *string `json:"business_scope,omitempty" xml:"business_scope,omitempty"`
	// 注册时间，字符串类型
	CertifyDate *string `json:"certify_date,omitempty" xml:"certify_date,omitempty"`
	// 营业执照有效期，字符串
	LicenceExpireDate *string `json:"licence_expire_date,omitempty" xml:"licence_expire_date,omitempty"`
	// 国家
	Nation *string `json:"nation,omitempty" xml:"nation,omitempty"`
	// 组织类型
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s CorporateReqModel) String() string {
	return tea.Prettify(s)
}

func (s CorporateReqModel) GoString() string {
	return s.String()
}

func (s *CorporateReqModel) SetAddress(v string) *CorporateReqModel {
	s.Address = &v
	return s
}

func (s *CorporateReqModel) SetBusinessAddress(v string) *CorporateReqModel {
	s.BusinessAddress = &v
	return s
}

func (s *CorporateReqModel) SetBusinessScope(v string) *CorporateReqModel {
	s.BusinessScope = &v
	return s
}

func (s *CorporateReqModel) SetCertifyDate(v string) *CorporateReqModel {
	s.CertifyDate = &v
	return s
}

func (s *CorporateReqModel) SetLicenceExpireDate(v string) *CorporateReqModel {
	s.LicenceExpireDate = &v
	return s
}

func (s *CorporateReqModel) SetNation(v string) *CorporateReqModel {
	s.Nation = &v
	return s
}

func (s *CorporateReqModel) SetType(v string) *CorporateReqModel {
	s.Type = &v
	return s
}

// 商品数字指纹注册用户信息
type GoodsDigitalFingerprintUserInfo struct {
	// 平台注册用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 用户角色
	UserRole *string `json:"user_role,omitempty" xml:"user_role,omitempty" require:"true"`
	// 用户登录id来源
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
	// 作为平台使用方，提供对应的渠道用户id列表
	RelationUserIdList []*string `json:"relation_user_id_list,omitempty" xml:"relation_user_id_list,omitempty" type:"Repeated"`
}

func (s GoodsDigitalFingerprintUserInfo) String() string {
	return tea.Prettify(s)
}

func (s GoodsDigitalFingerprintUserInfo) GoString() string {
	return s.String()
}

func (s *GoodsDigitalFingerprintUserInfo) SetUserId(v string) *GoodsDigitalFingerprintUserInfo {
	s.UserId = &v
	return s
}

func (s *GoodsDigitalFingerprintUserInfo) SetUserRole(v string) *GoodsDigitalFingerprintUserInfo {
	s.UserRole = &v
	return s
}

func (s *GoodsDigitalFingerprintUserInfo) SetChannel(v string) *GoodsDigitalFingerprintUserInfo {
	s.Channel = &v
	return s
}

func (s *GoodsDigitalFingerprintUserInfo) SetRelationUserIdList(v []*string) *GoodsDigitalFingerprintUserInfo {
	s.RelationUserIdList = v
	return s
}

// 收集标签数据（元数据，无签名）
type CollectLabelRawContent struct {
	// 1.设备端上报数据内容 2.与设备上报的数据一致，服务端不可修改 3.解析后需与DataModel匹配 4.映射 Label 对象结构化存储 5.转为JSON后如果是JSONObject 映射单个 Label 6.转为JSON后如果是JSONArray 映射多个 Label
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 数据模型ID
	DataModelId *string `json:"data_model_id,omitempty" xml:"data_model_id,omitempty" require:"true"`
}

func (s CollectLabelRawContent) String() string {
	return tea.Prettify(s)
}

func (s CollectLabelRawContent) GoString() string {
	return s.String()
}

func (s *CollectLabelRawContent) SetContent(v string) *CollectLabelRawContent {
	s.Content = &v
	return s
}

func (s *CollectLabelRawContent) SetDataModelId(v string) *CollectLabelRawContent {
	s.DataModelId = &v
	return s
}

// 发行设备
type DistributeDevice struct {
	// 链上设备Id  （deviceType=DEVICE 时有值)
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty"`
	// 设备id
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 发行设备Id
	DistributeDeviceId *string `json:"distribute_device_id,omitempty" xml:"distribute_device_id,omitempty" require:"true"`
	// 场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 设备类型 DEVICE : 设备 、PERIPHERAL : 外围设备
	DeviceType *string `json:"device_type,omitempty" xml:"device_type,omitempty" require:"true"`
	// 链上外围设备Id（deviceType=PERIPHERAL 时有值)
	ChainPeripheralId *string `json:"chain_peripheral_id,omitempty" xml:"chain_peripheral_id,omitempty"`
	// 设备状态，取值范围：NORMAL、OFFLINE、UNREGISTER
	DeviceStatus *string `json:"device_status,omitempty" xml:"device_status,omitempty"`
}

func (s DistributeDevice) String() string {
	return tea.Prettify(s)
}

func (s DistributeDevice) GoString() string {
	return s.String()
}

func (s *DistributeDevice) SetChainDeviceId(v string) *DistributeDevice {
	s.ChainDeviceId = &v
	return s
}

func (s *DistributeDevice) SetDeviceId(v string) *DistributeDevice {
	s.DeviceId = &v
	return s
}

func (s *DistributeDevice) SetDistributeDeviceId(v string) *DistributeDevice {
	s.DistributeDeviceId = &v
	return s
}

func (s *DistributeDevice) SetScene(v string) *DistributeDevice {
	s.Scene = &v
	return s
}

func (s *DistributeDevice) SetDeviceType(v string) *DistributeDevice {
	s.DeviceType = &v
	return s
}

func (s *DistributeDevice) SetChainPeripheralId(v string) *DistributeDevice {
	s.ChainPeripheralId = &v
	return s
}

func (s *DistributeDevice) SetDeviceStatus(v string) *DistributeDevice {
	s.DeviceStatus = &v
	return s
}

// 设备概览统计信息
type DeviceOverViewResponse struct {
	// 设备品类名称
	DeviceCategoryName *string `json:"device_category_name,omitempty" xml:"device_category_name,omitempty" require:"true"`
	// 设备总数
	DeviceTotal *int64 `json:"device_total,omitempty" xml:"device_total,omitempty" require:"true"`
}

func (s DeviceOverViewResponse) String() string {
	return tea.Prettify(s)
}

func (s DeviceOverViewResponse) GoString() string {
	return s.String()
}

func (s *DeviceOverViewResponse) SetDeviceCategoryName(v string) *DeviceOverViewResponse {
	s.DeviceCategoryName = &v
	return s
}

func (s *DeviceOverViewResponse) SetDeviceTotal(v int64) *DeviceOverViewResponse {
	s.DeviceTotal = &v
	return s
}

// 手机型号信息
type PhoneInfo struct {
	// 颜色
	Colour *string `json:"colour,omitempty" xml:"colour,omitempty" require:"true"`
	// 色值
	ColourNumber *string `json:"colour_number,omitempty" xml:"colour_number,omitempty" require:"true"`
	// 内存大小
	Memory *string `json:"memory,omitempty" xml:"memory,omitempty" require:"true"`
}

func (s PhoneInfo) String() string {
	return tea.Prettify(s)
}

func (s PhoneInfo) GoString() string {
	return s.String()
}

func (s *PhoneInfo) SetColour(v string) *PhoneInfo {
	s.Colour = &v
	return s
}

func (s *PhoneInfo) SetColourNumber(v string) *PhoneInfo {
	s.ColourNumber = &v
	return s
}

func (s *PhoneInfo) SetMemory(v string) *PhoneInfo {
	s.Memory = &v
	return s
}

// 设备规格信息体
type IotBasicDeviceSpecs struct {
	// 厂商编码
	CorpValue *string `json:"corp_value,omitempty" xml:"corp_value,omitempty" require:"true"`
	// 厂商名称
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty" require:"true"`
	// 型号名称
	ModelName *string `json:"model_name,omitempty" xml:"model_name,omitempty" require:"true"`
	// 型号编码
	ModelValue *string `json:"model_value,omitempty" xml:"model_value,omitempty" require:"true"`
	// 防疫机
	CategoryName *string `json:"category_name,omitempty" xml:"category_name,omitempty" require:"true"`
	// 设备品类编码
	CategoryCode *string `json:"category_code,omitempty" xml:"category_code,omitempty" require:"true"`
	// 规格ID
	SpecsId *int64 `json:"specs_id,omitempty" xml:"specs_id,omitempty" require:"true"`
	// 规格名称
	SpecsName *string `json:"specs_name,omitempty" xml:"specs_name,omitempty" require:"true"`
	// 规格编码
	SpecsValue *string `json:"specs_value,omitempty" xml:"specs_value,omitempty" require:"true"`
	// 规格参数
	SpecsParam *string `json:"specs_param,omitempty" xml:"specs_param,omitempty" require:"true"`
}

func (s IotBasicDeviceSpecs) String() string {
	return tea.Prettify(s)
}

func (s IotBasicDeviceSpecs) GoString() string {
	return s.String()
}

func (s *IotBasicDeviceSpecs) SetCorpValue(v string) *IotBasicDeviceSpecs {
	s.CorpValue = &v
	return s
}

func (s *IotBasicDeviceSpecs) SetCorpName(v string) *IotBasicDeviceSpecs {
	s.CorpName = &v
	return s
}

func (s *IotBasicDeviceSpecs) SetModelName(v string) *IotBasicDeviceSpecs {
	s.ModelName = &v
	return s
}

func (s *IotBasicDeviceSpecs) SetModelValue(v string) *IotBasicDeviceSpecs {
	s.ModelValue = &v
	return s
}

func (s *IotBasicDeviceSpecs) SetCategoryName(v string) *IotBasicDeviceSpecs {
	s.CategoryName = &v
	return s
}

func (s *IotBasicDeviceSpecs) SetCategoryCode(v string) *IotBasicDeviceSpecs {
	s.CategoryCode = &v
	return s
}

func (s *IotBasicDeviceSpecs) SetSpecsId(v int64) *IotBasicDeviceSpecs {
	s.SpecsId = &v
	return s
}

func (s *IotBasicDeviceSpecs) SetSpecsName(v string) *IotBasicDeviceSpecs {
	s.SpecsName = &v
	return s
}

func (s *IotBasicDeviceSpecs) SetSpecsValue(v string) *IotBasicDeviceSpecs {
	s.SpecsValue = &v
	return s
}

func (s *IotBasicDeviceSpecs) SetSpecsParam(v string) *IotBasicDeviceSpecs {
	s.SpecsParam = &v
	return s
}

// 商品数字指纹信息
type GoodsDigitalFingerprintInfo struct {
	// 品类
	Category *string `json:"category,omitempty" xml:"category,omitempty" require:"true"`
	// 品牌
	Brand *string `json:"brand,omitempty" xml:"brand,omitempty" require:"true"`
	// 款式
	Style *string `json:"style,omitempty" xml:"style,omitempty" require:"true"`
	// 商品数字指纹鉴定点列表
	GoodsPoints []*GoodsDigitalFingerprintPoint `json:"goods_points,omitempty" xml:"goods_points,omitempty" require:"true" type:"Repeated"`
	// 商品id
	GoodsId *string `json:"goods_id,omitempty" xml:"goods_id,omitempty" require:"true" maxLength:"128"`
}

func (s GoodsDigitalFingerprintInfo) String() string {
	return tea.Prettify(s)
}

func (s GoodsDigitalFingerprintInfo) GoString() string {
	return s.String()
}

func (s *GoodsDigitalFingerprintInfo) SetCategory(v string) *GoodsDigitalFingerprintInfo {
	s.Category = &v
	return s
}

func (s *GoodsDigitalFingerprintInfo) SetBrand(v string) *GoodsDigitalFingerprintInfo {
	s.Brand = &v
	return s
}

func (s *GoodsDigitalFingerprintInfo) SetStyle(v string) *GoodsDigitalFingerprintInfo {
	s.Style = &v
	return s
}

func (s *GoodsDigitalFingerprintInfo) SetGoodsPoints(v []*GoodsDigitalFingerprintPoint) *GoodsDigitalFingerprintInfo {
	s.GoodsPoints = v
	return s
}

func (s *GoodsDigitalFingerprintInfo) SetGoodsId(v string) *GoodsDigitalFingerprintInfo {
	s.GoodsId = &v
	return s
}

// 具备实体权限访问者更新请求
type DidUpdateTenantReq struct {
	// 待更新实体身份did
	ThingDid *string `json:"thing_did,omitempty" xml:"thing_did,omitempty" require:"true"`
	// 待更新访问者列表
	TenantList []*string `json:"tenant_list,omitempty" xml:"tenant_list,omitempty" require:"true" type:"Repeated"`
	// 权限角色
	// TENANT_ROLE_OWNER
	// TENANT_ROLE_USER
	// TENANT_ROLE_OBSERVER
	TenantRole *string `json:"tenant_role,omitempty" xml:"tenant_role,omitempty" require:"true"`
	// 增加权限：THINGS_OP_MODE_ADD
	// 删除权限：THINGS_OP_MODE_REMOVE
	OpMode *string `json:"op_mode,omitempty" xml:"op_mode,omitempty" require:"true"`
}

func (s DidUpdateTenantReq) String() string {
	return tea.Prettify(s)
}

func (s DidUpdateTenantReq) GoString() string {
	return s.String()
}

func (s *DidUpdateTenantReq) SetThingDid(v string) *DidUpdateTenantReq {
	s.ThingDid = &v
	return s
}

func (s *DidUpdateTenantReq) SetTenantList(v []*string) *DidUpdateTenantReq {
	s.TenantList = v
	return s
}

func (s *DidUpdateTenantReq) SetTenantRole(v string) *DidUpdateTenantReq {
	s.TenantRole = &v
	return s
}

func (s *DidUpdateTenantReq) SetOpMode(v string) *DidUpdateTenantReq {
	s.OpMode = &v
	return s
}

// 订单批量同步单个请求体
type DeviceorderRequest struct {
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 支付状态
	OrderStatus *string `json:"order_status,omitempty" xml:"order_status,omitempty" require:"true"`
	// 商家唯一id
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 设备订单元素集合
	OrderDeviceList []*IotBasicDeviceOrderItem `json:"order_device_list,omitempty" xml:"order_device_list,omitempty" require:"true" type:"Repeated"`
	// 订单总金额，精确到小数点后两位
	TotalAmount *string `json:"total_amount,omitempty" xml:"total_amount,omitempty" require:"true"`
}

func (s DeviceorderRequest) String() string {
	return tea.Prettify(s)
}

func (s DeviceorderRequest) GoString() string {
	return s.String()
}

func (s *DeviceorderRequest) SetOrderId(v string) *DeviceorderRequest {
	s.OrderId = &v
	return s
}

func (s *DeviceorderRequest) SetOrderStatus(v string) *DeviceorderRequest {
	s.OrderStatus = &v
	return s
}

func (s *DeviceorderRequest) SetMerchantId(v string) *DeviceorderRequest {
	s.MerchantId = &v
	return s
}

func (s *DeviceorderRequest) SetOrderDeviceList(v []*IotBasicDeviceOrderItem) *DeviceorderRequest {
	s.OrderDeviceList = v
	return s
}

func (s *DeviceorderRequest) SetTotalAmount(v string) *DeviceorderRequest {
	s.TotalAmount = &v
	return s
}

// 上链数据
type CollectInfo struct {
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 数据资产类型
	DataScene *string `json:"data_scene,omitempty" xml:"data_scene,omitempty" require:"true"`
	// 资产数据内容，业务要上链的数据JSON格式
	AssetData *string `json:"asset_data,omitempty" xml:"asset_data,omitempty" require:"true"`
	// 上链数据采集id
	CollectId *string `json:"collect_id,omitempty" xml:"collect_id,omitempty" require:"true"`
}

func (s CollectInfo) String() string {
	return tea.Prettify(s)
}

func (s CollectInfo) GoString() string {
	return s.String()
}

func (s *CollectInfo) SetAssetId(v string) *CollectInfo {
	s.AssetId = &v
	return s
}

func (s *CollectInfo) SetDataScene(v string) *CollectInfo {
	s.DataScene = &v
	return s
}

func (s *CollectInfo) SetAssetData(v string) *CollectInfo {
	s.AssetData = &v
	return s
}

func (s *CollectInfo) SetCollectId(v string) *CollectInfo {
	s.CollectId = &v
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

type OpenAcecContractRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 产品码，全局唯一
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 开通产品的租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 实例Id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 服务接入码
	AccessCode *string `json:"access_code,omitempty" xml:"access_code,omitempty" require:"true"`
	// 用户自定义数据
	CustomData *string `json:"custom_data,omitempty" xml:"custom_data,omitempty"`
}

func (s OpenAcecContractRequest) String() string {
	return tea.Prettify(s)
}

func (s OpenAcecContractRequest) GoString() string {
	return s.String()
}

func (s *OpenAcecContractRequest) SetAuthToken(v string) *OpenAcecContractRequest {
	s.AuthToken = &v
	return s
}

func (s *OpenAcecContractRequest) SetProductInstanceId(v string) *OpenAcecContractRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OpenAcecContractRequest) SetOrderNo(v string) *OpenAcecContractRequest {
	s.OrderNo = &v
	return s
}

func (s *OpenAcecContractRequest) SetProductCode(v string) *OpenAcecContractRequest {
	s.ProductCode = &v
	return s
}

func (s *OpenAcecContractRequest) SetTenantId(v string) *OpenAcecContractRequest {
	s.TenantId = &v
	return s
}

func (s *OpenAcecContractRequest) SetInstanceId(v string) *OpenAcecContractRequest {
	s.InstanceId = &v
	return s
}

func (s *OpenAcecContractRequest) SetAccessCode(v string) *OpenAcecContractRequest {
	s.AccessCode = &v
	return s
}

func (s *OpenAcecContractRequest) SetCustomData(v string) *OpenAcecContractRequest {
	s.CustomData = &v
	return s
}

type OpenAcecContractResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务返回字段
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s OpenAcecContractResponse) String() string {
	return tea.Prettify(s)
}

func (s OpenAcecContractResponse) GoString() string {
	return s.String()
}

func (s *OpenAcecContractResponse) SetReqMsgId(v string) *OpenAcecContractResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OpenAcecContractResponse) SetResultCode(v string) *OpenAcecContractResponse {
	s.ResultCode = &v
	return s
}

func (s *OpenAcecContractResponse) SetResultMsg(v string) *OpenAcecContractResponse {
	s.ResultMsg = &v
	return s
}

func (s *OpenAcecContractResponse) SetData(v string) *OpenAcecContractResponse {
	s.Data = &v
	return s
}

type StopAcecContractRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 产品码，全局唯一
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 产品实例Id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s StopAcecContractRequest) String() string {
	return tea.Prettify(s)
}

func (s StopAcecContractRequest) GoString() string {
	return s.String()
}

func (s *StopAcecContractRequest) SetAuthToken(v string) *StopAcecContractRequest {
	s.AuthToken = &v
	return s
}

func (s *StopAcecContractRequest) SetProductInstanceId(v string) *StopAcecContractRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StopAcecContractRequest) SetOrderNo(v string) *StopAcecContractRequest {
	s.OrderNo = &v
	return s
}

func (s *StopAcecContractRequest) SetProductCode(v string) *StopAcecContractRequest {
	s.ProductCode = &v
	return s
}

func (s *StopAcecContractRequest) SetInstanceId(v string) *StopAcecContractRequest {
	s.InstanceId = &v
	return s
}

type StopAcecContractResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务返回字段
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s StopAcecContractResponse) String() string {
	return tea.Prettify(s)
}

func (s StopAcecContractResponse) GoString() string {
	return s.String()
}

func (s *StopAcecContractResponse) SetReqMsgId(v string) *StopAcecContractResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StopAcecContractResponse) SetResultCode(v string) *StopAcecContractResponse {
	s.ResultCode = &v
	return s
}

func (s *StopAcecContractResponse) SetResultMsg(v string) *StopAcecContractResponse {
	s.ResultMsg = &v
	return s
}

func (s *StopAcecContractResponse) SetData(v string) *StopAcecContractResponse {
	s.Data = &v
	return s
}

type ResumeAcecContractRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 服务接入码
	AccessCode *string `json:"access_code,omitempty" xml:"access_code,omitempty" require:"true"`
	// 实例Id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 产品码，全局唯一
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
}

func (s ResumeAcecContractRequest) String() string {
	return tea.Prettify(s)
}

func (s ResumeAcecContractRequest) GoString() string {
	return s.String()
}

func (s *ResumeAcecContractRequest) SetAuthToken(v string) *ResumeAcecContractRequest {
	s.AuthToken = &v
	return s
}

func (s *ResumeAcecContractRequest) SetProductInstanceId(v string) *ResumeAcecContractRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ResumeAcecContractRequest) SetAccessCode(v string) *ResumeAcecContractRequest {
	s.AccessCode = &v
	return s
}

func (s *ResumeAcecContractRequest) SetInstanceId(v string) *ResumeAcecContractRequest {
	s.InstanceId = &v
	return s
}

func (s *ResumeAcecContractRequest) SetOrderNo(v string) *ResumeAcecContractRequest {
	s.OrderNo = &v
	return s
}

func (s *ResumeAcecContractRequest) SetProductCode(v string) *ResumeAcecContractRequest {
	s.ProductCode = &v
	return s
}

type ResumeAcecContractResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务返回字段
	//
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ResumeAcecContractResponse) String() string {
	return tea.Prettify(s)
}

func (s ResumeAcecContractResponse) GoString() string {
	return s.String()
}

func (s *ResumeAcecContractResponse) SetReqMsgId(v string) *ResumeAcecContractResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ResumeAcecContractResponse) SetResultCode(v string) *ResumeAcecContractResponse {
	s.ResultCode = &v
	return s
}

func (s *ResumeAcecContractResponse) SetResultMsg(v string) *ResumeAcecContractResponse {
	s.ResultMsg = &v
	return s
}

func (s *ResumeAcecContractResponse) SetData(v string) *ResumeAcecContractResponse {
	s.Data = &v
	return s
}

type CreateLeaseRealpersonRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 身份信息来源类型，当前仅支持证件（CERT_INFO）
	IdentityType *string `json:"identity_type,omitempty" xml:"identity_type,omitempty" require:"true"`
	// 证件类型，当前仅支持身份证（IDENTITY_CARD）
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 真实姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 商户请求的唯一标识。
	// 值为 32 位长度的字母数字组合。其中，前面几位字符是商户自定义的简称，中间几位可以使用一段时间，后段可以使用一个随机或递增序列。该值也可以使用 UUID
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 认证结束回跳地址
	ReturnUrl *string `json:"return_url,omitempty" xml:"return_url,omitempty" require:"true"`
}

func (s CreateLeaseRealpersonRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseRealpersonRequest) GoString() string {
	return s.String()
}

func (s *CreateLeaseRealpersonRequest) SetAuthToken(v string) *CreateLeaseRealpersonRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeaseRealpersonRequest) SetProductInstanceId(v string) *CreateLeaseRealpersonRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeaseRealpersonRequest) SetIdentityType(v string) *CreateLeaseRealpersonRequest {
	s.IdentityType = &v
	return s
}

func (s *CreateLeaseRealpersonRequest) SetCertType(v string) *CreateLeaseRealpersonRequest {
	s.CertType = &v
	return s
}

func (s *CreateLeaseRealpersonRequest) SetCertName(v string) *CreateLeaseRealpersonRequest {
	s.CertName = &v
	return s
}

func (s *CreateLeaseRealpersonRequest) SetCertNo(v string) *CreateLeaseRealpersonRequest {
	s.CertNo = &v
	return s
}

func (s *CreateLeaseRealpersonRequest) SetOuterOrderNo(v string) *CreateLeaseRealpersonRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CreateLeaseRealpersonRequest) SetReturnUrl(v string) *CreateLeaseRealpersonRequest {
	s.ReturnUrl = &v
	return s
}

type CreateLeaseRealpersonResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务返回字段，JSON格式
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateLeaseRealpersonResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeaseRealpersonResponse) GoString() string {
	return s.String()
}

func (s *CreateLeaseRealpersonResponse) SetReqMsgId(v string) *CreateLeaseRealpersonResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeaseRealpersonResponse) SetResultCode(v string) *CreateLeaseRealpersonResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeaseRealpersonResponse) SetResultMsg(v string) *CreateLeaseRealpersonResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeaseRealpersonResponse) SetData(v string) *CreateLeaseRealpersonResponse {
	s.Data = &v
	return s
}

type QueryLeaseRealpersonRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 实人认证的唯一标识
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
	// 商户请求的唯一标识。 值为 32 位长度的字母数字组合。其中，前面几位字符是商户自定义的简称，中间几位可以使用一段时间，后段可以使用一个随机或递增序列。该值也可以使用 UUID
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
}

func (s QueryLeaseRealpersonRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryLeaseRealpersonRequest) GoString() string {
	return s.String()
}

func (s *QueryLeaseRealpersonRequest) SetAuthToken(v string) *QueryLeaseRealpersonRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryLeaseRealpersonRequest) SetProductInstanceId(v string) *QueryLeaseRealpersonRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryLeaseRealpersonRequest) SetCertifyId(v string) *QueryLeaseRealpersonRequest {
	s.CertifyId = &v
	return s
}

func (s *QueryLeaseRealpersonRequest) SetOuterOrderNo(v string) *QueryLeaseRealpersonRequest {
	s.OuterOrderNo = &v
	return s
}

type QueryLeaseRealpersonResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务返回字段，JSON格式
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryLeaseRealpersonResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryLeaseRealpersonResponse) GoString() string {
	return s.String()
}

func (s *QueryLeaseRealpersonResponse) SetReqMsgId(v string) *QueryLeaseRealpersonResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryLeaseRealpersonResponse) SetResultCode(v string) *QueryLeaseRealpersonResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryLeaseRealpersonResponse) SetResultMsg(v string) *QueryLeaseRealpersonResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryLeaseRealpersonResponse) SetData(v string) *QueryLeaseRealpersonResponse {
	s.Data = &v
	return s
}

type QueryLeaseRiskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部系统的用户唯一ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 用户姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 用户身份证号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 用户手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 用户IP地址
	Ip *string `json:"ip,omitempty" xml:"ip,omitempty" require:"true"`
}

func (s QueryLeaseRiskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryLeaseRiskRequest) GoString() string {
	return s.String()
}

func (s *QueryLeaseRiskRequest) SetAuthToken(v string) *QueryLeaseRiskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryLeaseRiskRequest) SetProductInstanceId(v string) *QueryLeaseRiskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryLeaseRiskRequest) SetUserId(v string) *QueryLeaseRiskRequest {
	s.UserId = &v
	return s
}

func (s *QueryLeaseRiskRequest) SetUserName(v string) *QueryLeaseRiskRequest {
	s.UserName = &v
	return s
}

func (s *QueryLeaseRiskRequest) SetCertNo(v string) *QueryLeaseRiskRequest {
	s.CertNo = &v
	return s
}

func (s *QueryLeaseRiskRequest) SetMobile(v string) *QueryLeaseRiskRequest {
	s.Mobile = &v
	return s
}

func (s *QueryLeaseRiskRequest) SetIp(v string) *QueryLeaseRiskRequest {
	s.Ip = &v
	return s
}

type QueryLeaseRiskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务返回字段，JSON格式
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryLeaseRiskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryLeaseRiskResponse) GoString() string {
	return s.String()
}

func (s *QueryLeaseRiskResponse) SetReqMsgId(v string) *QueryLeaseRiskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryLeaseRiskResponse) SetResultCode(v string) *QueryLeaseRiskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryLeaseRiskResponse) SetResultMsg(v string) *QueryLeaseRiskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryLeaseRiskResponse) SetData(v string) *QueryLeaseRiskResponse {
	s.Data = &v
	return s
}

type FinishTraceConfigRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 私有化端配置成功标志
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 租户
	PrivatedTenant *string `json:"privated_tenant,omitempty" xml:"privated_tenant,omitempty" require:"true"`
	// 私有化端唯一标识
	UniqueNum *string `json:"unique_num,omitempty" xml:"unique_num,omitempty" require:"true"`
	// 任务信息，用于消费者回告
	TaskInfo *TaskInfo `json:"task_info,omitempty" xml:"task_info,omitempty" require:"true"`
}

func (s FinishTraceConfigRequest) String() string {
	return tea.Prettify(s)
}

func (s FinishTraceConfigRequest) GoString() string {
	return s.String()
}

func (s *FinishTraceConfigRequest) SetAuthToken(v string) *FinishTraceConfigRequest {
	s.AuthToken = &v
	return s
}

func (s *FinishTraceConfigRequest) SetProductInstanceId(v string) *FinishTraceConfigRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *FinishTraceConfigRequest) SetSuccess(v bool) *FinishTraceConfigRequest {
	s.Success = &v
	return s
}

func (s *FinishTraceConfigRequest) SetPrivatedTenant(v string) *FinishTraceConfigRequest {
	s.PrivatedTenant = &v
	return s
}

func (s *FinishTraceConfigRequest) SetUniqueNum(v string) *FinishTraceConfigRequest {
	s.UniqueNum = &v
	return s
}

func (s *FinishTraceConfigRequest) SetTaskInfo(v *TaskInfo) *FinishTraceConfigRequest {
	s.TaskInfo = v
	return s
}

type FinishTraceConfigResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务结果码
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s FinishTraceConfigResponse) String() string {
	return tea.Prettify(s)
}

func (s FinishTraceConfigResponse) GoString() string {
	return s.String()
}

func (s *FinishTraceConfigResponse) SetReqMsgId(v string) *FinishTraceConfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *FinishTraceConfigResponse) SetResultCode(v string) *FinishTraceConfigResponse {
	s.ResultCode = &v
	return s
}

func (s *FinishTraceConfigResponse) SetResultMsg(v string) *FinishTraceConfigResponse {
	s.ResultMsg = &v
	return s
}

func (s *FinishTraceConfigResponse) SetResult(v string) *FinishTraceConfigResponse {
	s.Result = &v
	return s
}

type QueryBaiOcrRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 调用业务方身份标识，指明调用来源
	AppKey *string `json:"app_key,omitempty" xml:"app_key,omitempty" require:"true"`
	// OCR服务的业务类型，目前支持：
	// businessLicense，营业执照识别
	// idCard，身份证识别
	// bankCard，银行卡识别
	// VATInvoice，增值税发票识别
	OcrType *string `json:"ocr_type,omitempty" xml:"ocr_type,omitempty" require:"true"`
	// 请求的资源类型，目前支持：
	// image，图片
	// pdf，PDF复印件
	SourceType *string `json:"source_type,omitempty" xml:"source_type,omitempty" require:"true"`
	// 图片或PDF等内容的base64内容字符串
	SourceBase64 *string `json:"source_base64,omitempty" xml:"source_base64,omitempty" require:"true"`
	// 资源的附加属性
	// 如针对身份证识别，需要指定face(人像面)或back(国徽面)
	SourceConfigSide *string `json:"source_config_side,omitempty" xml:"source_config_side,omitempty"`
}

func (s QueryBaiOcrRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaiOcrRequest) GoString() string {
	return s.String()
}

func (s *QueryBaiOcrRequest) SetAuthToken(v string) *QueryBaiOcrRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaiOcrRequest) SetProductInstanceId(v string) *QueryBaiOcrRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaiOcrRequest) SetAppKey(v string) *QueryBaiOcrRequest {
	s.AppKey = &v
	return s
}

func (s *QueryBaiOcrRequest) SetOcrType(v string) *QueryBaiOcrRequest {
	s.OcrType = &v
	return s
}

func (s *QueryBaiOcrRequest) SetSourceType(v string) *QueryBaiOcrRequest {
	s.SourceType = &v
	return s
}

func (s *QueryBaiOcrRequest) SetSourceBase64(v string) *QueryBaiOcrRequest {
	s.SourceBase64 = &v
	return s
}

func (s *QueryBaiOcrRequest) SetSourceConfigSide(v string) *QueryBaiOcrRequest {
	s.SourceConfigSide = &v
	return s
}

type QueryBaiOcrResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果体，JSON字符串
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryBaiOcrResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaiOcrResponse) GoString() string {
	return s.String()
}

func (s *QueryBaiOcrResponse) SetReqMsgId(v string) *QueryBaiOcrResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaiOcrResponse) SetResultCode(v string) *QueryBaiOcrResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaiOcrResponse) SetResultMsg(v string) *QueryBaiOcrResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaiOcrResponse) SetData(v string) *QueryBaiOcrResponse {
	s.Data = &v
	return s
}

type QueryAiidentificationQrcodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户身份标识
	AppKey *string `json:"app_key,omitempty" xml:"app_key,omitempty" require:"true"`
	// BaiQrcodeComparisonReqData转为JSONString后再getBytes
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s QueryAiidentificationQrcodeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAiidentificationQrcodeRequest) GoString() string {
	return s.String()
}

func (s *QueryAiidentificationQrcodeRequest) SetAuthToken(v string) *QueryAiidentificationQrcodeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAiidentificationQrcodeRequest) SetProductInstanceId(v string) *QueryAiidentificationQrcodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAiidentificationQrcodeRequest) SetAppKey(v string) *QueryAiidentificationQrcodeRequest {
	s.AppKey = &v
	return s
}

func (s *QueryAiidentificationQrcodeRequest) SetFileObject(v io.Reader) *QueryAiidentificationQrcodeRequest {
	s.FileObject = v
	return s
}

func (s *QueryAiidentificationQrcodeRequest) SetFileObjectName(v string) *QueryAiidentificationQrcodeRequest {
	s.FileObjectName = &v
	return s
}

func (s *QueryAiidentificationQrcodeRequest) SetFileId(v string) *QueryAiidentificationQrcodeRequest {
	s.FileId = &v
	return s
}

type QueryAiidentificationQrcodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Data *BaiQrcodeComparisonRespData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryAiidentificationQrcodeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAiidentificationQrcodeResponse) GoString() string {
	return s.String()
}

func (s *QueryAiidentificationQrcodeResponse) SetReqMsgId(v string) *QueryAiidentificationQrcodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAiidentificationQrcodeResponse) SetResultCode(v string) *QueryAiidentificationQrcodeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAiidentificationQrcodeResponse) SetResultMsg(v string) *QueryAiidentificationQrcodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAiidentificationQrcodeResponse) SetData(v *BaiQrcodeComparisonRespData) *QueryAiidentificationQrcodeResponse {
	s.Data = v
	return s
}

type QueryAiidentificationGoodsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户身份标识
	AppKey *string `json:"app_key,omitempty" xml:"app_key,omitempty" require:"true"`
	// 鉴定商品信息
	GoodsInfo *BaiGoodsComparisonReqData `json:"goods_info,omitempty" xml:"goods_info,omitempty" require:"true"`
}

func (s QueryAiidentificationGoodsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAiidentificationGoodsRequest) GoString() string {
	return s.String()
}

func (s *QueryAiidentificationGoodsRequest) SetAuthToken(v string) *QueryAiidentificationGoodsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAiidentificationGoodsRequest) SetProductInstanceId(v string) *QueryAiidentificationGoodsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAiidentificationGoodsRequest) SetAppKey(v string) *QueryAiidentificationGoodsRequest {
	s.AppKey = &v
	return s
}

func (s *QueryAiidentificationGoodsRequest) SetGoodsInfo(v *BaiGoodsComparisonReqData) *QueryAiidentificationGoodsRequest {
	s.GoodsInfo = v
	return s
}

type QueryAiidentificationGoodsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Data *BaiGoodsIdentificationRespData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryAiidentificationGoodsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAiidentificationGoodsResponse) GoString() string {
	return s.String()
}

func (s *QueryAiidentificationGoodsResponse) SetReqMsgId(v string) *QueryAiidentificationGoodsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAiidentificationGoodsResponse) SetResultCode(v string) *QueryAiidentificationGoodsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAiidentificationGoodsResponse) SetResultMsg(v string) *QueryAiidentificationGoodsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAiidentificationGoodsResponse) SetData(v *BaiGoodsIdentificationRespData) *QueryAiidentificationGoodsResponse {
	s.Data = v
	return s
}

type CheckAiidentificationGoodspointRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户调用标识
	AppKey *string `json:"app_key,omitempty" xml:"app_key,omitempty" require:"true"`
	// 品类
	Category *string `json:"category,omitempty" xml:"category,omitempty" require:"true"`
	// 品牌
	Brand *string `json:"brand,omitempty" xml:"brand,omitempty" require:"true"`
	// 款式
	Style *string `json:"style,omitempty" xml:"style,omitempty" require:"true"`
	// 鉴定点信息
	PointInfo *BaiGoodsPoint `json:"point_info,omitempty" xml:"point_info,omitempty" require:"true"`
}

func (s CheckAiidentificationGoodspointRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckAiidentificationGoodspointRequest) GoString() string {
	return s.String()
}

func (s *CheckAiidentificationGoodspointRequest) SetAuthToken(v string) *CheckAiidentificationGoodspointRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckAiidentificationGoodspointRequest) SetProductInstanceId(v string) *CheckAiidentificationGoodspointRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckAiidentificationGoodspointRequest) SetAppKey(v string) *CheckAiidentificationGoodspointRequest {
	s.AppKey = &v
	return s
}

func (s *CheckAiidentificationGoodspointRequest) SetCategory(v string) *CheckAiidentificationGoodspointRequest {
	s.Category = &v
	return s
}

func (s *CheckAiidentificationGoodspointRequest) SetBrand(v string) *CheckAiidentificationGoodspointRequest {
	s.Brand = &v
	return s
}

func (s *CheckAiidentificationGoodspointRequest) SetStyle(v string) *CheckAiidentificationGoodspointRequest {
	s.Style = &v
	return s
}

func (s *CheckAiidentificationGoodspointRequest) SetPointInfo(v *BaiGoodsPoint) *CheckAiidentificationGoodspointRequest {
	s.PointInfo = v
	return s
}

type CheckAiidentificationGoodspointResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品鉴定点检测响应数据
	Data *BaiGoodsPointCheckRespData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CheckAiidentificationGoodspointResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckAiidentificationGoodspointResponse) GoString() string {
	return s.String()
}

func (s *CheckAiidentificationGoodspointResponse) SetReqMsgId(v string) *CheckAiidentificationGoodspointResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckAiidentificationGoodspointResponse) SetResultCode(v string) *CheckAiidentificationGoodspointResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckAiidentificationGoodspointResponse) SetResultMsg(v string) *CheckAiidentificationGoodspointResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckAiidentificationGoodspointResponse) SetData(v *BaiGoodsPointCheckRespData) *CheckAiidentificationGoodspointResponse {
	s.Data = v
	return s
}

type CheckAiidentificationQrcodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户标识
	AppKey *string `json:"app_key,omitempty" xml:"app_key,omitempty" require:"true"`
	// 请求data
	Data *BaiQrcodeComparisonReqData `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s CheckAiidentificationQrcodeRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckAiidentificationQrcodeRequest) GoString() string {
	return s.String()
}

func (s *CheckAiidentificationQrcodeRequest) SetAuthToken(v string) *CheckAiidentificationQrcodeRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckAiidentificationQrcodeRequest) SetProductInstanceId(v string) *CheckAiidentificationQrcodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckAiidentificationQrcodeRequest) SetAppKey(v string) *CheckAiidentificationQrcodeRequest {
	s.AppKey = &v
	return s
}

func (s *CheckAiidentificationQrcodeRequest) SetData(v *BaiQrcodeComparisonReqData) *CheckAiidentificationQrcodeRequest {
	s.Data = v
	return s
}

type CheckAiidentificationQrcodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Data *BaiQrcodeComparisonRespData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CheckAiidentificationQrcodeResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckAiidentificationQrcodeResponse) GoString() string {
	return s.String()
}

func (s *CheckAiidentificationQrcodeResponse) SetReqMsgId(v string) *CheckAiidentificationQrcodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckAiidentificationQrcodeResponse) SetResultCode(v string) *CheckAiidentificationQrcodeResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckAiidentificationQrcodeResponse) SetResultMsg(v string) *CheckAiidentificationQrcodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckAiidentificationQrcodeResponse) SetData(v *BaiQrcodeComparisonRespData) *CheckAiidentificationQrcodeResponse {
	s.Data = v
	return s
}

type CreateAiidentificationQrcodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户身份标识
	AppKey *string `json:"app_key,omitempty" xml:"app_key,omitempty" require:"true"`
	// 二维码生成请求的请求数据
	Data *BaiQrcodeGenerateReqData `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s CreateAiidentificationQrcodeRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAiidentificationQrcodeRequest) GoString() string {
	return s.String()
}

func (s *CreateAiidentificationQrcodeRequest) SetAuthToken(v string) *CreateAiidentificationQrcodeRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAiidentificationQrcodeRequest) SetProductInstanceId(v string) *CreateAiidentificationQrcodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAiidentificationQrcodeRequest) SetAppKey(v string) *CreateAiidentificationQrcodeRequest {
	s.AppKey = &v
	return s
}

func (s *CreateAiidentificationQrcodeRequest) SetData(v *BaiQrcodeGenerateReqData) *CreateAiidentificationQrcodeRequest {
	s.Data = v
	return s
}

type CreateAiidentificationQrcodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Data *BaiQrcodeGenerateRespData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateAiidentificationQrcodeResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAiidentificationQrcodeResponse) GoString() string {
	return s.String()
}

func (s *CreateAiidentificationQrcodeResponse) SetReqMsgId(v string) *CreateAiidentificationQrcodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAiidentificationQrcodeResponse) SetResultCode(v string) *CreateAiidentificationQrcodeResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAiidentificationQrcodeResponse) SetResultMsg(v string) *CreateAiidentificationQrcodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAiidentificationQrcodeResponse) SetData(v *BaiQrcodeGenerateRespData) *CreateAiidentificationQrcodeResponse {
	s.Data = v
	return s
}

type VerifyAiidentificationQrcodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户身份标识
	AppKey *string `json:"app_key,omitempty" xml:"app_key,omitempty" require:"true"`
	// 溯源防伪码质检请求数据
	Data *BaiQrcodeVerifyReqData `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s VerifyAiidentificationQrcodeRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyAiidentificationQrcodeRequest) GoString() string {
	return s.String()
}

func (s *VerifyAiidentificationQrcodeRequest) SetAuthToken(v string) *VerifyAiidentificationQrcodeRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyAiidentificationQrcodeRequest) SetProductInstanceId(v string) *VerifyAiidentificationQrcodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyAiidentificationQrcodeRequest) SetAppKey(v string) *VerifyAiidentificationQrcodeRequest {
	s.AppKey = &v
	return s
}

func (s *VerifyAiidentificationQrcodeRequest) SetData(v *BaiQrcodeVerifyReqData) *VerifyAiidentificationQrcodeRequest {
	s.Data = v
	return s
}

type VerifyAiidentificationQrcodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 溯源防伪码质检响应结果
	Data *BaiQrcodeVerifyRespData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s VerifyAiidentificationQrcodeResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyAiidentificationQrcodeResponse) GoString() string {
	return s.String()
}

func (s *VerifyAiidentificationQrcodeResponse) SetReqMsgId(v string) *VerifyAiidentificationQrcodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyAiidentificationQrcodeResponse) SetResultCode(v string) *VerifyAiidentificationQrcodeResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyAiidentificationQrcodeResponse) SetResultMsg(v string) *VerifyAiidentificationQrcodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyAiidentificationQrcodeResponse) SetData(v *BaiQrcodeVerifyRespData) *VerifyAiidentificationQrcodeResponse {
	s.Data = v
	return s
}

type QueryAiidentificationGoodspointRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户调用标识
	AppKey *string `json:"app_key,omitempty" xml:"app_key,omitempty" require:"true"`
	// 品类
	Category *string `json:"category,omitempty" xml:"category,omitempty" require:"true"`
	// 品牌
	Brand *string `json:"brand,omitempty" xml:"brand,omitempty" require:"true"`
	// 款式
	Style *string `json:"style,omitempty" xml:"style,omitempty" require:"true"`
	// 鉴定点信息
	PointInfo *BaiGoodsPoint `json:"point_info,omitempty" xml:"point_info,omitempty" require:"true"`
}

func (s QueryAiidentificationGoodspointRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAiidentificationGoodspointRequest) GoString() string {
	return s.String()
}

func (s *QueryAiidentificationGoodspointRequest) SetAuthToken(v string) *QueryAiidentificationGoodspointRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAiidentificationGoodspointRequest) SetProductInstanceId(v string) *QueryAiidentificationGoodspointRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAiidentificationGoodspointRequest) SetAppKey(v string) *QueryAiidentificationGoodspointRequest {
	s.AppKey = &v
	return s
}

func (s *QueryAiidentificationGoodspointRequest) SetCategory(v string) *QueryAiidentificationGoodspointRequest {
	s.Category = &v
	return s
}

func (s *QueryAiidentificationGoodspointRequest) SetBrand(v string) *QueryAiidentificationGoodspointRequest {
	s.Brand = &v
	return s
}

func (s *QueryAiidentificationGoodspointRequest) SetStyle(v string) *QueryAiidentificationGoodspointRequest {
	s.Style = &v
	return s
}

func (s *QueryAiidentificationGoodspointRequest) SetPointInfo(v *BaiGoodsPoint) *QueryAiidentificationGoodspointRequest {
	s.PointInfo = v
	return s
}

type QueryAiidentificationGoodspointResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品鉴定点鉴定响应体
	Data *BaiGoodsPointQueryRespData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryAiidentificationGoodspointResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAiidentificationGoodspointResponse) GoString() string {
	return s.String()
}

func (s *QueryAiidentificationGoodspointResponse) SetReqMsgId(v string) *QueryAiidentificationGoodspointResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAiidentificationGoodspointResponse) SetResultCode(v string) *QueryAiidentificationGoodspointResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAiidentificationGoodspointResponse) SetResultMsg(v string) *QueryAiidentificationGoodspointResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAiidentificationGoodspointResponse) SetData(v *BaiGoodsPointQueryRespData) *QueryAiidentificationGoodspointResponse {
	s.Data = v
	return s
}

type RegisterAiidentificationGoodsdigitalfingerprintRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户身份标识
	AppKey *string `json:"app_key,omitempty" xml:"app_key,omitempty" require:"true"`
	// 商品数字指纹信息
	GoodsInfo *GoodsDigitalFingerprintInfo `json:"goods_info,omitempty" xml:"goods_info,omitempty" require:"true"`
	// 商品数字指纹用户信息
	UserInfo *GoodsDigitalFingerprintUserInfo `json:"user_info,omitempty" xml:"user_info,omitempty" require:"true"`
}

func (s RegisterAiidentificationGoodsdigitalfingerprintRequest) String() string {
	return tea.Prettify(s)
}

func (s RegisterAiidentificationGoodsdigitalfingerprintRequest) GoString() string {
	return s.String()
}

func (s *RegisterAiidentificationGoodsdigitalfingerprintRequest) SetAuthToken(v string) *RegisterAiidentificationGoodsdigitalfingerprintRequest {
	s.AuthToken = &v
	return s
}

func (s *RegisterAiidentificationGoodsdigitalfingerprintRequest) SetProductInstanceId(v string) *RegisterAiidentificationGoodsdigitalfingerprintRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RegisterAiidentificationGoodsdigitalfingerprintRequest) SetAppKey(v string) *RegisterAiidentificationGoodsdigitalfingerprintRequest {
	s.AppKey = &v
	return s
}

func (s *RegisterAiidentificationGoodsdigitalfingerprintRequest) SetGoodsInfo(v *GoodsDigitalFingerprintInfo) *RegisterAiidentificationGoodsdigitalfingerprintRequest {
	s.GoodsInfo = v
	return s
}

func (s *RegisterAiidentificationGoodsdigitalfingerprintRequest) SetUserInfo(v *GoodsDigitalFingerprintUserInfo) *RegisterAiidentificationGoodsdigitalfingerprintRequest {
	s.UserInfo = v
	return s
}

type RegisterAiidentificationGoodsdigitalfingerprintResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 指纹图片入库是否成功
	Data *GoodsDigitalFingerprintRegisterResultData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s RegisterAiidentificationGoodsdigitalfingerprintResponse) String() string {
	return tea.Prettify(s)
}

func (s RegisterAiidentificationGoodsdigitalfingerprintResponse) GoString() string {
	return s.String()
}

func (s *RegisterAiidentificationGoodsdigitalfingerprintResponse) SetReqMsgId(v string) *RegisterAiidentificationGoodsdigitalfingerprintResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RegisterAiidentificationGoodsdigitalfingerprintResponse) SetResultCode(v string) *RegisterAiidentificationGoodsdigitalfingerprintResponse {
	s.ResultCode = &v
	return s
}

func (s *RegisterAiidentificationGoodsdigitalfingerprintResponse) SetResultMsg(v string) *RegisterAiidentificationGoodsdigitalfingerprintResponse {
	s.ResultMsg = &v
	return s
}

func (s *RegisterAiidentificationGoodsdigitalfingerprintResponse) SetData(v *GoodsDigitalFingerprintRegisterResultData) *RegisterAiidentificationGoodsdigitalfingerprintResponse {
	s.Data = v
	return s
}

type CheckAiidentificationGoodsdigitalfingerprintRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户身份标识
	AppKey *string `json:"app_key,omitempty" xml:"app_key,omitempty" require:"true"`
	// 商品数字指纹鉴定信息
	GoodsInfo *GoodsDigitalFingerprintInfo `json:"goods_info,omitempty" xml:"goods_info,omitempty" require:"true"`
	// 商品数字指纹注册用户信息
	UserInfo *GoodsDigitalFingerprintUserInfo `json:"user_info,omitempty" xml:"user_info,omitempty" require:"true"`
}

func (s CheckAiidentificationGoodsdigitalfingerprintRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckAiidentificationGoodsdigitalfingerprintRequest) GoString() string {
	return s.String()
}

func (s *CheckAiidentificationGoodsdigitalfingerprintRequest) SetAuthToken(v string) *CheckAiidentificationGoodsdigitalfingerprintRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckAiidentificationGoodsdigitalfingerprintRequest) SetProductInstanceId(v string) *CheckAiidentificationGoodsdigitalfingerprintRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckAiidentificationGoodsdigitalfingerprintRequest) SetAppKey(v string) *CheckAiidentificationGoodsdigitalfingerprintRequest {
	s.AppKey = &v
	return s
}

func (s *CheckAiidentificationGoodsdigitalfingerprintRequest) SetGoodsInfo(v *GoodsDigitalFingerprintInfo) *CheckAiidentificationGoodsdigitalfingerprintRequest {
	s.GoodsInfo = v
	return s
}

func (s *CheckAiidentificationGoodsdigitalfingerprintRequest) SetUserInfo(v *GoodsDigitalFingerprintUserInfo) *CheckAiidentificationGoodsdigitalfingerprintRequest {
	s.UserInfo = v
	return s
}

type CheckAiidentificationGoodsdigitalfingerprintResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品数字指纹整体鉴定结果
	Data *GoodsDigitalFingerprintIdentifyResultData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CheckAiidentificationGoodsdigitalfingerprintResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckAiidentificationGoodsdigitalfingerprintResponse) GoString() string {
	return s.String()
}

func (s *CheckAiidentificationGoodsdigitalfingerprintResponse) SetReqMsgId(v string) *CheckAiidentificationGoodsdigitalfingerprintResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckAiidentificationGoodsdigitalfingerprintResponse) SetResultCode(v string) *CheckAiidentificationGoodsdigitalfingerprintResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckAiidentificationGoodsdigitalfingerprintResponse) SetResultMsg(v string) *CheckAiidentificationGoodsdigitalfingerprintResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckAiidentificationGoodsdigitalfingerprintResponse) SetData(v *GoodsDigitalFingerprintIdentifyResultData) *CheckAiidentificationGoodsdigitalfingerprintResponse {
	s.Data = v
	return s
}

type GetAiidentificationQrcodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 二维码识别请求体
	Data *BaiQrcodeParseReqData `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s GetAiidentificationQrcodeRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAiidentificationQrcodeRequest) GoString() string {
	return s.String()
}

func (s *GetAiidentificationQrcodeRequest) SetAuthToken(v string) *GetAiidentificationQrcodeRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAiidentificationQrcodeRequest) SetProductInstanceId(v string) *GetAiidentificationQrcodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAiidentificationQrcodeRequest) SetRequestId(v string) *GetAiidentificationQrcodeRequest {
	s.RequestId = &v
	return s
}

func (s *GetAiidentificationQrcodeRequest) SetData(v *BaiQrcodeParseReqData) *GetAiidentificationQrcodeRequest {
	s.Data = v
	return s
}

type GetAiidentificationQrcodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 返回码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 返回信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 二维码识别结果
	Data *BaiQrcodeParseRespData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetAiidentificationQrcodeResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAiidentificationQrcodeResponse) GoString() string {
	return s.String()
}

func (s *GetAiidentificationQrcodeResponse) SetReqMsgId(v string) *GetAiidentificationQrcodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAiidentificationQrcodeResponse) SetResultCode(v string) *GetAiidentificationQrcodeResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAiidentificationQrcodeResponse) SetResultMsg(v string) *GetAiidentificationQrcodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAiidentificationQrcodeResponse) SetRequestId(v string) *GetAiidentificationQrcodeResponse {
	s.RequestId = &v
	return s
}

func (s *GetAiidentificationQrcodeResponse) SetCode(v string) *GetAiidentificationQrcodeResponse {
	s.Code = &v
	return s
}

func (s *GetAiidentificationQrcodeResponse) SetMessage(v string) *GetAiidentificationQrcodeResponse {
	s.Message = &v
	return s
}

func (s *GetAiidentificationQrcodeResponse) SetData(v *BaiQrcodeParseRespData) *GetAiidentificationQrcodeResponse {
	s.Data = v
	return s
}

type CreateAcsDeviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备ID
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 场景码-对应acs iot管控后台项目code
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 设备类型编码-对应acs iot管控后台设备类型编码
	ClassCode *string `json:"class_code,omitempty" xml:"class_code,omitempty" require:"true"`
	// 设备注册信息
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 设备注册信息 签名
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
	// 设备名称
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty" require:"true"`
	// 设备单价 单位：分
	InitialPrice *int64 `json:"initial_price,omitempty" xml:"initial_price,omitempty"`
	// 设备出厂时间
	FactoryTime *string `json:"factory_time,omitempty" xml:"factory_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 设备投放时间
	ReleaseTime *string `json:"release_time,omitempty" xml:"release_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s CreateAcsDeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAcsDeviceRequest) GoString() string {
	return s.String()
}

func (s *CreateAcsDeviceRequest) SetAuthToken(v string) *CreateAcsDeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAcsDeviceRequest) SetProductInstanceId(v string) *CreateAcsDeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAcsDeviceRequest) SetDeviceId(v string) *CreateAcsDeviceRequest {
	s.DeviceId = &v
	return s
}

func (s *CreateAcsDeviceRequest) SetScene(v string) *CreateAcsDeviceRequest {
	s.Scene = &v
	return s
}

func (s *CreateAcsDeviceRequest) SetClassCode(v string) *CreateAcsDeviceRequest {
	s.ClassCode = &v
	return s
}

func (s *CreateAcsDeviceRequest) SetContent(v string) *CreateAcsDeviceRequest {
	s.Content = &v
	return s
}

func (s *CreateAcsDeviceRequest) SetSignature(v string) *CreateAcsDeviceRequest {
	s.Signature = &v
	return s
}

func (s *CreateAcsDeviceRequest) SetDeviceName(v string) *CreateAcsDeviceRequest {
	s.DeviceName = &v
	return s
}

func (s *CreateAcsDeviceRequest) SetInitialPrice(v int64) *CreateAcsDeviceRequest {
	s.InitialPrice = &v
	return s
}

func (s *CreateAcsDeviceRequest) SetFactoryTime(v string) *CreateAcsDeviceRequest {
	s.FactoryTime = &v
	return s
}

func (s *CreateAcsDeviceRequest) SetReleaseTime(v string) *CreateAcsDeviceRequest {
	s.ReleaseTime = &v
	return s
}

type CreateAcsDeviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上设备Id
	ChainDeviceid *string `json:"chain_deviceid,omitempty" xml:"chain_deviceid,omitempty"`
	// 发行设备ID
	DistributeDeviceId *string `json:"distribute_device_id,omitempty" xml:"distribute_device_id,omitempty"`
	// 设备激活文本-设备直连上链方式使用
	ActiveData *string `json:"active_data,omitempty" xml:"active_data,omitempty"`
}

func (s CreateAcsDeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAcsDeviceResponse) GoString() string {
	return s.String()
}

func (s *CreateAcsDeviceResponse) SetReqMsgId(v string) *CreateAcsDeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAcsDeviceResponse) SetResultCode(v string) *CreateAcsDeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAcsDeviceResponse) SetResultMsg(v string) *CreateAcsDeviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAcsDeviceResponse) SetChainDeviceid(v string) *CreateAcsDeviceResponse {
	s.ChainDeviceid = &v
	return s
}

func (s *CreateAcsDeviceResponse) SetDistributeDeviceId(v string) *CreateAcsDeviceResponse {
	s.DistributeDeviceId = &v
	return s
}

func (s *CreateAcsDeviceResponse) SetActiveData(v string) *CreateAcsDeviceResponse {
	s.ActiveData = &v
	return s
}

type SendAcsCollectorRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链上设备Id
	//
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty" require:"true"`
	// 收集内容
	CollectContentList []*CollectContent `json:"collect_content_list,omitempty" xml:"collect_content_list,omitempty" require:"true" type:"Repeated"`
	// 随机数，防重放
	Nonce []*string `json:"nonce,omitempty" xml:"nonce,omitempty" require:"true" type:"Repeated"`
}

func (s SendAcsCollectorRequest) String() string {
	return tea.Prettify(s)
}

func (s SendAcsCollectorRequest) GoString() string {
	return s.String()
}

func (s *SendAcsCollectorRequest) SetAuthToken(v string) *SendAcsCollectorRequest {
	s.AuthToken = &v
	return s
}

func (s *SendAcsCollectorRequest) SetProductInstanceId(v string) *SendAcsCollectorRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendAcsCollectorRequest) SetChainDeviceId(v string) *SendAcsCollectorRequest {
	s.ChainDeviceId = &v
	return s
}

func (s *SendAcsCollectorRequest) SetCollectContentList(v []*CollectContent) *SendAcsCollectorRequest {
	s.CollectContentList = v
	return s
}

func (s *SendAcsCollectorRequest) SetNonce(v []*string) *SendAcsCollectorRequest {
	s.Nonce = v
	return s
}

type SendAcsCollectorResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 收集数据返回的上链结果
	ResultList []*SendCollectorResult `json:"result_list,omitempty" xml:"result_list,omitempty" type:"Repeated"`
}

func (s SendAcsCollectorResponse) String() string {
	return tea.Prettify(s)
}

func (s SendAcsCollectorResponse) GoString() string {
	return s.String()
}

func (s *SendAcsCollectorResponse) SetReqMsgId(v string) *SendAcsCollectorResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendAcsCollectorResponse) SetResultCode(v string) *SendAcsCollectorResponse {
	s.ResultCode = &v
	return s
}

func (s *SendAcsCollectorResponse) SetResultMsg(v string) *SendAcsCollectorResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendAcsCollectorResponse) SetResultList(v []*SendCollectorResult) *SendAcsCollectorResponse {
	s.ResultList = v
	return s
}

type QueryIotbasicDeviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 当前登录用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 设备SN
	DeviceSn *string `json:"device_sn,omitempty" xml:"device_sn,omitempty"`
	// 设备品类code
	CategoryCode *string `json:"category_code,omitempty" xml:"category_code,omitempty"`
	// 设备型号
	DeviceModel *string `json:"device_model,omitempty" xml:"device_model,omitempty"`
	// 厂商名称
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty"`
	// 安装位置
	Location *string `json:"location,omitempty" xml:"location,omitempty"`
	// 设备状态，在线/离线、故障
	DeviceStatus *string `json:"device_status,omitempty" xml:"device_status,omitempty"`
	// 指定显示返回结果中的第几页。
	//
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true" minimum:"1"`
	// 指定返回结果中每页显示的产品数量，最大值是200。
	//
	//
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true" maximum:"200" minimum:"1"`
}

func (s QueryIotbasicDeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIotbasicDeviceRequest) GoString() string {
	return s.String()
}

func (s *QueryIotbasicDeviceRequest) SetAuthToken(v string) *QueryIotbasicDeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIotbasicDeviceRequest) SetProductInstanceId(v string) *QueryIotbasicDeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIotbasicDeviceRequest) SetTenantId(v string) *QueryIotbasicDeviceRequest {
	s.TenantId = &v
	return s
}

func (s *QueryIotbasicDeviceRequest) SetUserId(v string) *QueryIotbasicDeviceRequest {
	s.UserId = &v
	return s
}

func (s *QueryIotbasicDeviceRequest) SetDeviceSn(v string) *QueryIotbasicDeviceRequest {
	s.DeviceSn = &v
	return s
}

func (s *QueryIotbasicDeviceRequest) SetCategoryCode(v string) *QueryIotbasicDeviceRequest {
	s.CategoryCode = &v
	return s
}

func (s *QueryIotbasicDeviceRequest) SetDeviceModel(v string) *QueryIotbasicDeviceRequest {
	s.DeviceModel = &v
	return s
}

func (s *QueryIotbasicDeviceRequest) SetCorpName(v string) *QueryIotbasicDeviceRequest {
	s.CorpName = &v
	return s
}

func (s *QueryIotbasicDeviceRequest) SetLocation(v string) *QueryIotbasicDeviceRequest {
	s.Location = &v
	return s
}

func (s *QueryIotbasicDeviceRequest) SetDeviceStatus(v string) *QueryIotbasicDeviceRequest {
	s.DeviceStatus = &v
	return s
}

func (s *QueryIotbasicDeviceRequest) SetCurrentPage(v int64) *QueryIotbasicDeviceRequest {
	s.CurrentPage = &v
	return s
}

func (s *QueryIotbasicDeviceRequest) SetPageSize(v int64) *QueryIotbasicDeviceRequest {
	s.PageSize = &v
	return s
}

type QueryIotbasicDeviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前页号。
	//
	//
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 总页数
	PageCount *int64 `json:"page_count,omitempty" xml:"page_count,omitempty"`
	// 每页显示条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总记录数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 设备列表
	DeviceList []*IotBasicDeviceQueryResponse `json:"device_list,omitempty" xml:"device_list,omitempty" type:"Repeated"`
}

func (s QueryIotbasicDeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIotbasicDeviceResponse) GoString() string {
	return s.String()
}

func (s *QueryIotbasicDeviceResponse) SetReqMsgId(v string) *QueryIotbasicDeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIotbasicDeviceResponse) SetResultCode(v string) *QueryIotbasicDeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIotbasicDeviceResponse) SetResultMsg(v string) *QueryIotbasicDeviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIotbasicDeviceResponse) SetCurrentPage(v int64) *QueryIotbasicDeviceResponse {
	s.CurrentPage = &v
	return s
}

func (s *QueryIotbasicDeviceResponse) SetPageCount(v int64) *QueryIotbasicDeviceResponse {
	s.PageCount = &v
	return s
}

func (s *QueryIotbasicDeviceResponse) SetPageSize(v int64) *QueryIotbasicDeviceResponse {
	s.PageSize = &v
	return s
}

func (s *QueryIotbasicDeviceResponse) SetTotal(v int64) *QueryIotbasicDeviceResponse {
	s.Total = &v
	return s
}

func (s *QueryIotbasicDeviceResponse) SetDeviceList(v []*IotBasicDeviceQueryResponse) *QueryIotbasicDeviceResponse {
	s.DeviceList = v
	return s
}

type RecognizeIotbasicCustomerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 用户ID或操作员ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s RecognizeIotbasicCustomerRequest) String() string {
	return tea.Prettify(s)
}

func (s RecognizeIotbasicCustomerRequest) GoString() string {
	return s.String()
}

func (s *RecognizeIotbasicCustomerRequest) SetAuthToken(v string) *RecognizeIotbasicCustomerRequest {
	s.AuthToken = &v
	return s
}

func (s *RecognizeIotbasicCustomerRequest) SetProductInstanceId(v string) *RecognizeIotbasicCustomerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RecognizeIotbasicCustomerRequest) SetTenantId(v string) *RecognizeIotbasicCustomerRequest {
	s.TenantId = &v
	return s
}

func (s *RecognizeIotbasicCustomerRequest) SetUserId(v string) *RecognizeIotbasicCustomerRequest {
	s.UserId = &v
	return s
}

type RecognizeIotbasicCustomerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否授权开通IoT产品
	Authorized *bool `json:"authorized,omitempty" xml:"authorized,omitempty"`
	// 设备数量列表
	DeviceList []*DeviceOverViewResponse `json:"device_list,omitempty" xml:"device_list,omitempty" type:"Repeated"`
	// 角色
	IotRole *string `json:"iot_role,omitempty" xml:"iot_role,omitempty"`
}

func (s RecognizeIotbasicCustomerResponse) String() string {
	return tea.Prettify(s)
}

func (s RecognizeIotbasicCustomerResponse) GoString() string {
	return s.String()
}

func (s *RecognizeIotbasicCustomerResponse) SetReqMsgId(v string) *RecognizeIotbasicCustomerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RecognizeIotbasicCustomerResponse) SetResultCode(v string) *RecognizeIotbasicCustomerResponse {
	s.ResultCode = &v
	return s
}

func (s *RecognizeIotbasicCustomerResponse) SetResultMsg(v string) *RecognizeIotbasicCustomerResponse {
	s.ResultMsg = &v
	return s
}

func (s *RecognizeIotbasicCustomerResponse) SetAuthorized(v bool) *RecognizeIotbasicCustomerResponse {
	s.Authorized = &v
	return s
}

func (s *RecognizeIotbasicCustomerResponse) SetDeviceList(v []*DeviceOverViewResponse) *RecognizeIotbasicCustomerResponse {
	s.DeviceList = v
	return s
}

func (s *RecognizeIotbasicCustomerResponse) SetIotRole(v string) *RecognizeIotbasicCustomerResponse {
	s.IotRole = &v
	return s
}

type CertifyIotbasicDeviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备序列号
	DeviceSn *string `json:"device_sn,omitempty" xml:"device_sn,omitempty" require:"true"`
	// 设备厂商
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty" require:"true"`
}

func (s CertifyIotbasicDeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s CertifyIotbasicDeviceRequest) GoString() string {
	return s.String()
}

func (s *CertifyIotbasicDeviceRequest) SetAuthToken(v string) *CertifyIotbasicDeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *CertifyIotbasicDeviceRequest) SetProductInstanceId(v string) *CertifyIotbasicDeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CertifyIotbasicDeviceRequest) SetDeviceSn(v string) *CertifyIotbasicDeviceRequest {
	s.DeviceSn = &v
	return s
}

func (s *CertifyIotbasicDeviceRequest) SetCorpName(v string) *CertifyIotbasicDeviceRequest {
	s.CorpName = &v
	return s
}

type CertifyIotbasicDeviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 设备名称
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty"`
	// 设备型号
	DeviceModel *string `json:"device_model,omitempty" xml:"device_model,omitempty"`
	// 设备状态
	DeviceStatus *string `json:"device_status,omitempty" xml:"device_status,omitempty"`
	// 注册时间
	RegisterTime *string `json:"register_time,omitempty" xml:"register_time,omitempty"`
	// 客户名称
	CustomerName *string `json:"customer_name,omitempty" xml:"customer_name,omitempty"`
	// 客户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 客户端版本
	AppVersion *string `json:"app_version,omitempty" xml:"app_version,omitempty"`
	// 服务状态
	ServiceStatus *string `json:"service_status,omitempty" xml:"service_status,omitempty"`
	// 子账号ID
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 所属账号名称
	AccountName *string `json:"account_name,omitempty" xml:"account_name,omitempty"`
	// 子账号角色
	UserRole *string `json:"user_role,omitempty" xml:"user_role,omitempty"`
}

func (s CertifyIotbasicDeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s CertifyIotbasicDeviceResponse) GoString() string {
	return s.String()
}

func (s *CertifyIotbasicDeviceResponse) SetReqMsgId(v string) *CertifyIotbasicDeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CertifyIotbasicDeviceResponse) SetResultCode(v string) *CertifyIotbasicDeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *CertifyIotbasicDeviceResponse) SetResultMsg(v string) *CertifyIotbasicDeviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *CertifyIotbasicDeviceResponse) SetDeviceName(v string) *CertifyIotbasicDeviceResponse {
	s.DeviceName = &v
	return s
}

func (s *CertifyIotbasicDeviceResponse) SetDeviceModel(v string) *CertifyIotbasicDeviceResponse {
	s.DeviceModel = &v
	return s
}

func (s *CertifyIotbasicDeviceResponse) SetDeviceStatus(v string) *CertifyIotbasicDeviceResponse {
	s.DeviceStatus = &v
	return s
}

func (s *CertifyIotbasicDeviceResponse) SetRegisterTime(v string) *CertifyIotbasicDeviceResponse {
	s.RegisterTime = &v
	return s
}

func (s *CertifyIotbasicDeviceResponse) SetCustomerName(v string) *CertifyIotbasicDeviceResponse {
	s.CustomerName = &v
	return s
}

func (s *CertifyIotbasicDeviceResponse) SetTenantId(v string) *CertifyIotbasicDeviceResponse {
	s.TenantId = &v
	return s
}

func (s *CertifyIotbasicDeviceResponse) SetAppVersion(v string) *CertifyIotbasicDeviceResponse {
	s.AppVersion = &v
	return s
}

func (s *CertifyIotbasicDeviceResponse) SetServiceStatus(v string) *CertifyIotbasicDeviceResponse {
	s.ServiceStatus = &v
	return s
}

func (s *CertifyIotbasicDeviceResponse) SetAccountId(v string) *CertifyIotbasicDeviceResponse {
	s.AccountId = &v
	return s
}

func (s *CertifyIotbasicDeviceResponse) SetAccountName(v string) *CertifyIotbasicDeviceResponse {
	s.AccountName = &v
	return s
}

func (s *CertifyIotbasicDeviceResponse) SetUserRole(v string) *CertifyIotbasicDeviceResponse {
	s.UserRole = &v
	return s
}

type OperateIotbasicUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 操作用户集合
	UserList []*IotBasicUserRequest `json:"user_list,omitempty" xml:"user_list,omitempty" require:"true" type:"Repeated"`
	// 要开通的角色
	IotRole *string `json:"iot_role,omitempty" xml:"iot_role,omitempty"`
	// 操作类型
	Action *string `json:"action,omitempty" xml:"action,omitempty" require:"true"`
	// 操作人
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
	// 参数签名校验
	ParamSign *string `json:"param_sign,omitempty" xml:"param_sign,omitempty"`
}

func (s OperateIotbasicUserRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateIotbasicUserRequest) GoString() string {
	return s.String()
}

func (s *OperateIotbasicUserRequest) SetAuthToken(v string) *OperateIotbasicUserRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateIotbasicUserRequest) SetProductInstanceId(v string) *OperateIotbasicUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateIotbasicUserRequest) SetUserList(v []*IotBasicUserRequest) *OperateIotbasicUserRequest {
	s.UserList = v
	return s
}

func (s *OperateIotbasicUserRequest) SetIotRole(v string) *OperateIotbasicUserRequest {
	s.IotRole = &v
	return s
}

func (s *OperateIotbasicUserRequest) SetAction(v string) *OperateIotbasicUserRequest {
	s.Action = &v
	return s
}

func (s *OperateIotbasicUserRequest) SetOperatorId(v string) *OperateIotbasicUserRequest {
	s.OperatorId = &v
	return s
}

func (s *OperateIotbasicUserRequest) SetParamSign(v string) *OperateIotbasicUserRequest {
	s.ParamSign = &v
	return s
}

type OperateIotbasicUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 操作失败集合
	FailList []*IotBasicUserRequest `json:"fail_list,omitempty" xml:"fail_list,omitempty" type:"Repeated"`
	// 用户信息
	QueryList []*IotBasicUserInfo `json:"query_list,omitempty" xml:"query_list,omitempty" type:"Repeated"`
}

func (s OperateIotbasicUserResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateIotbasicUserResponse) GoString() string {
	return s.String()
}

func (s *OperateIotbasicUserResponse) SetReqMsgId(v string) *OperateIotbasicUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateIotbasicUserResponse) SetResultCode(v string) *OperateIotbasicUserResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateIotbasicUserResponse) SetResultMsg(v string) *OperateIotbasicUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateIotbasicUserResponse) SetSuccess(v bool) *OperateIotbasicUserResponse {
	s.Success = &v
	return s
}

func (s *OperateIotbasicUserResponse) SetFailList(v []*IotBasicUserRequest) *OperateIotbasicUserResponse {
	s.FailList = v
	return s
}

func (s *OperateIotbasicUserResponse) SetQueryList(v []*IotBasicUserInfo) *OperateIotbasicUserResponse {
	s.QueryList = v
	return s
}

type OperateIotbasicPermissionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 操作人
	//
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
	// 角色
	IotRole *string `json:"iot_role,omitempty" xml:"iot_role,omitempty"`
	// 待添加的权限集合
	PermissionList []*IotBasicPermissionData `json:"permission_list,omitempty" xml:"permission_list,omitempty" type:"Repeated"`
	// 操作类型
	Action *string `json:"action,omitempty" xml:"action,omitempty" require:"true"`
	// 绑定权限集合
	BindPermision []*string `json:"bind_permision,omitempty" xml:"bind_permision,omitempty" type:"Repeated"`
	// 参数签名校验
	ParamSign *string `json:"param_sign,omitempty" xml:"param_sign,omitempty"`
}

func (s OperateIotbasicPermissionRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateIotbasicPermissionRequest) GoString() string {
	return s.String()
}

func (s *OperateIotbasicPermissionRequest) SetAuthToken(v string) *OperateIotbasicPermissionRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateIotbasicPermissionRequest) SetProductInstanceId(v string) *OperateIotbasicPermissionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateIotbasicPermissionRequest) SetOperatorId(v string) *OperateIotbasicPermissionRequest {
	s.OperatorId = &v
	return s
}

func (s *OperateIotbasicPermissionRequest) SetIotRole(v string) *OperateIotbasicPermissionRequest {
	s.IotRole = &v
	return s
}

func (s *OperateIotbasicPermissionRequest) SetPermissionList(v []*IotBasicPermissionData) *OperateIotbasicPermissionRequest {
	s.PermissionList = v
	return s
}

func (s *OperateIotbasicPermissionRequest) SetAction(v string) *OperateIotbasicPermissionRequest {
	s.Action = &v
	return s
}

func (s *OperateIotbasicPermissionRequest) SetBindPermision(v []*string) *OperateIotbasicPermissionRequest {
	s.BindPermision = v
	return s
}

func (s *OperateIotbasicPermissionRequest) SetParamSign(v string) *OperateIotbasicPermissionRequest {
	s.ParamSign = &v
	return s
}

type OperateIotbasicPermissionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 权限列表
	RoleList []*IotBasicRolePermission `json:"role_list,omitempty" xml:"role_list,omitempty" type:"Repeated"`
}

func (s OperateIotbasicPermissionResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateIotbasicPermissionResponse) GoString() string {
	return s.String()
}

func (s *OperateIotbasicPermissionResponse) SetReqMsgId(v string) *OperateIotbasicPermissionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateIotbasicPermissionResponse) SetResultCode(v string) *OperateIotbasicPermissionResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateIotbasicPermissionResponse) SetResultMsg(v string) *OperateIotbasicPermissionResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateIotbasicPermissionResponse) SetSuccess(v bool) *OperateIotbasicPermissionResponse {
	s.Success = &v
	return s
}

func (s *OperateIotbasicPermissionResponse) SetRoleList(v []*IotBasicRolePermission) *OperateIotbasicPermissionResponse {
	s.RoleList = v
	return s
}

type QueryIotbasicSnRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 当前登录用户ID
	//
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 指定显示返回结果中的第几页。
	//
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true" minimum:"1"`
	// 指定返回结果中每页显示的产品数量，最大值是300。
	//
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true" maximum:"300" minimum:"1"`
}

func (s QueryIotbasicSnRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIotbasicSnRequest) GoString() string {
	return s.String()
}

func (s *QueryIotbasicSnRequest) SetAuthToken(v string) *QueryIotbasicSnRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIotbasicSnRequest) SetProductInstanceId(v string) *QueryIotbasicSnRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIotbasicSnRequest) SetTenantId(v string) *QueryIotbasicSnRequest {
	s.TenantId = &v
	return s
}

func (s *QueryIotbasicSnRequest) SetUserId(v string) *QueryIotbasicSnRequest {
	s.UserId = &v
	return s
}

func (s *QueryIotbasicSnRequest) SetCurrentPage(v int64) *QueryIotbasicSnRequest {
	s.CurrentPage = &v
	return s
}

func (s *QueryIotbasicSnRequest) SetPageSize(v int64) *QueryIotbasicSnRequest {
	s.PageSize = &v
	return s
}

type QueryIotbasicSnResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前页号。
	//
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 总页数
	//
	PageCount *int64 `json:"page_count,omitempty" xml:"page_count,omitempty"`
	// 每页显示条数
	//
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总记录数
	//
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// sn集合
	SnList []*string `json:"sn_list,omitempty" xml:"sn_list,omitempty" type:"Repeated"`
}

func (s QueryIotbasicSnResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIotbasicSnResponse) GoString() string {
	return s.String()
}

func (s *QueryIotbasicSnResponse) SetReqMsgId(v string) *QueryIotbasicSnResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIotbasicSnResponse) SetResultCode(v string) *QueryIotbasicSnResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIotbasicSnResponse) SetResultMsg(v string) *QueryIotbasicSnResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIotbasicSnResponse) SetCurrentPage(v int64) *QueryIotbasicSnResponse {
	s.CurrentPage = &v
	return s
}

func (s *QueryIotbasicSnResponse) SetPageCount(v int64) *QueryIotbasicSnResponse {
	s.PageCount = &v
	return s
}

func (s *QueryIotbasicSnResponse) SetPageSize(v int64) *QueryIotbasicSnResponse {
	s.PageSize = &v
	return s
}

func (s *QueryIotbasicSnResponse) SetTotal(v int64) *QueryIotbasicSnResponse {
	s.Total = &v
	return s
}

func (s *QueryIotbasicSnResponse) SetSnList(v []*string) *QueryIotbasicSnResponse {
	s.SnList = v
	return s
}

type QueryDeviceSpecsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备SN
	DeviceSn *string `json:"device_sn,omitempty" xml:"device_sn,omitempty" require:"true"`
	// 厂商编码
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty" require:"true"`
}

func (s QueryDeviceSpecsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceSpecsRequest) GoString() string {
	return s.String()
}

func (s *QueryDeviceSpecsRequest) SetAuthToken(v string) *QueryDeviceSpecsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDeviceSpecsRequest) SetProductInstanceId(v string) *QueryDeviceSpecsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDeviceSpecsRequest) SetDeviceSn(v string) *QueryDeviceSpecsRequest {
	s.DeviceSn = &v
	return s
}

func (s *QueryDeviceSpecsRequest) SetCorpName(v string) *QueryDeviceSpecsRequest {
	s.CorpName = &v
	return s
}

type QueryDeviceSpecsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 设备规格描述
	DeviceSpecs *IotBasicDeviceSpecs `json:"device_specs,omitempty" xml:"device_specs,omitempty"`
	// 硬件模块集合
	HardwareModuleList []*IotBasicDeviceHardWareModule `json:"hardware_module_list,omitempty" xml:"hardware_module_list,omitempty" type:"Repeated"`
}

func (s QueryDeviceSpecsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceSpecsResponse) GoString() string {
	return s.String()
}

func (s *QueryDeviceSpecsResponse) SetReqMsgId(v string) *QueryDeviceSpecsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDeviceSpecsResponse) SetResultCode(v string) *QueryDeviceSpecsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDeviceSpecsResponse) SetResultMsg(v string) *QueryDeviceSpecsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDeviceSpecsResponse) SetDeviceSpecs(v *IotBasicDeviceSpecs) *QueryDeviceSpecsResponse {
	s.DeviceSpecs = v
	return s
}

func (s *QueryDeviceSpecsResponse) SetHardwareModuleList(v []*IotBasicDeviceHardWareModule) *QueryDeviceSpecsResponse {
	s.HardwareModuleList = v
	return s
}

type OperateIotbasicRelrationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备属性关系id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 设备品类名称
	DeviceCategory *string `json:"device_category,omitempty" xml:"device_category,omitempty" require:"true"`
	// 数据关系类型
	RelationType *string `json:"relation_type,omitempty" xml:"relation_type,omitempty" require:"true"`
	// 厂商名称
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty"`
	// TPS980	设备型号
	DeviceModel *string `json:"device_model,omitempty" xml:"device_model,omitempty"`
	// 设备规格
	DeviceSpecs *string `json:"device_specs,omitempty" xml:"device_specs,omitempty"`
	// 硬件模块
	HardwareModule *string `json:"hardware_module,omitempty" xml:"hardware_module,omitempty"`
	// ADD,EDIT,DELETE，QUERY；选择操作
	Operate *string `json:"operate,omitempty" xml:"operate,omitempty" require:"true"`
	// 参数签名校验
	ParamSign *string `json:"param_sign,omitempty" xml:"param_sign,omitempty"`
	// 项目空间
	ProjectSpace *string `json:"project_space,omitempty" xml:"project_space,omitempty"`
}

func (s OperateIotbasicRelrationRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateIotbasicRelrationRequest) GoString() string {
	return s.String()
}

func (s *OperateIotbasicRelrationRequest) SetAuthToken(v string) *OperateIotbasicRelrationRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateIotbasicRelrationRequest) SetProductInstanceId(v string) *OperateIotbasicRelrationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateIotbasicRelrationRequest) SetId(v int64) *OperateIotbasicRelrationRequest {
	s.Id = &v
	return s
}

func (s *OperateIotbasicRelrationRequest) SetDeviceCategory(v string) *OperateIotbasicRelrationRequest {
	s.DeviceCategory = &v
	return s
}

func (s *OperateIotbasicRelrationRequest) SetRelationType(v string) *OperateIotbasicRelrationRequest {
	s.RelationType = &v
	return s
}

func (s *OperateIotbasicRelrationRequest) SetCorpName(v string) *OperateIotbasicRelrationRequest {
	s.CorpName = &v
	return s
}

func (s *OperateIotbasicRelrationRequest) SetDeviceModel(v string) *OperateIotbasicRelrationRequest {
	s.DeviceModel = &v
	return s
}

func (s *OperateIotbasicRelrationRequest) SetDeviceSpecs(v string) *OperateIotbasicRelrationRequest {
	s.DeviceSpecs = &v
	return s
}

func (s *OperateIotbasicRelrationRequest) SetHardwareModule(v string) *OperateIotbasicRelrationRequest {
	s.HardwareModule = &v
	return s
}

func (s *OperateIotbasicRelrationRequest) SetOperate(v string) *OperateIotbasicRelrationRequest {
	s.Operate = &v
	return s
}

func (s *OperateIotbasicRelrationRequest) SetParamSign(v string) *OperateIotbasicRelrationRequest {
	s.ParamSign = &v
	return s
}

func (s *OperateIotbasicRelrationRequest) SetProjectSpace(v string) *OperateIotbasicRelrationRequest {
	s.ProjectSpace = &v
	return s
}

type OperateIotbasicRelrationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 设备属性关系数据
	IotDeviceAttributeRelationshipData *IotDeviceAttributeRelationshipData `json:"iot_device_attribute_relationship_data,omitempty" xml:"iot_device_attribute_relationship_data,omitempty"`
}

func (s OperateIotbasicRelrationResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateIotbasicRelrationResponse) GoString() string {
	return s.String()
}

func (s *OperateIotbasicRelrationResponse) SetReqMsgId(v string) *OperateIotbasicRelrationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateIotbasicRelrationResponse) SetResultCode(v string) *OperateIotbasicRelrationResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateIotbasicRelrationResponse) SetResultMsg(v string) *OperateIotbasicRelrationResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateIotbasicRelrationResponse) SetSuccess(v bool) *OperateIotbasicRelrationResponse {
	s.Success = &v
	return s
}

func (s *OperateIotbasicRelrationResponse) SetIotDeviceAttributeRelationshipData(v *IotDeviceAttributeRelationshipData) *OperateIotbasicRelrationResponse {
	s.IotDeviceAttributeRelationshipData = v
	return s
}

type OperateIotbasicDictionaryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 设备品类编码
	DeviceCategory *string `json:"device_category,omitempty" xml:"device_category,omitempty"`
	// 字典数据类型
	DictionaryType *string `json:"dictionary_type,omitempty" xml:"dictionary_type,omitempty"`
	// 字典数据名称
	DictionaryName *string `json:"dictionary_name,omitempty" xml:"dictionary_name,omitempty"`
	// 字典数据值
	DictionaryValue *string `json:"dictionary_value,omitempty" xml:"dictionary_value,omitempty"`
	// 硬件模块参数
	DictionaryParam *string `json:"dictionary_param,omitempty" xml:"dictionary_param,omitempty"`
	// 选择操作
	Action *string `json:"action,omitempty" xml:"action,omitempty" require:"true"`
	// 参数签名校验
	ParamSign *string `json:"param_sign,omitempty" xml:"param_sign,omitempty"`
}

func (s OperateIotbasicDictionaryRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateIotbasicDictionaryRequest) GoString() string {
	return s.String()
}

func (s *OperateIotbasicDictionaryRequest) SetAuthToken(v string) *OperateIotbasicDictionaryRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateIotbasicDictionaryRequest) SetProductInstanceId(v string) *OperateIotbasicDictionaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateIotbasicDictionaryRequest) SetId(v int64) *OperateIotbasicDictionaryRequest {
	s.Id = &v
	return s
}

func (s *OperateIotbasicDictionaryRequest) SetDeviceCategory(v string) *OperateIotbasicDictionaryRequest {
	s.DeviceCategory = &v
	return s
}

func (s *OperateIotbasicDictionaryRequest) SetDictionaryType(v string) *OperateIotbasicDictionaryRequest {
	s.DictionaryType = &v
	return s
}

func (s *OperateIotbasicDictionaryRequest) SetDictionaryName(v string) *OperateIotbasicDictionaryRequest {
	s.DictionaryName = &v
	return s
}

func (s *OperateIotbasicDictionaryRequest) SetDictionaryValue(v string) *OperateIotbasicDictionaryRequest {
	s.DictionaryValue = &v
	return s
}

func (s *OperateIotbasicDictionaryRequest) SetDictionaryParam(v string) *OperateIotbasicDictionaryRequest {
	s.DictionaryParam = &v
	return s
}

func (s *OperateIotbasicDictionaryRequest) SetAction(v string) *OperateIotbasicDictionaryRequest {
	s.Action = &v
	return s
}

func (s *OperateIotbasicDictionaryRequest) SetParamSign(v string) *OperateIotbasicDictionaryRequest {
	s.ParamSign = &v
	return s
}

type OperateIotbasicDictionaryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s OperateIotbasicDictionaryResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateIotbasicDictionaryResponse) GoString() string {
	return s.String()
}

func (s *OperateIotbasicDictionaryResponse) SetReqMsgId(v string) *OperateIotbasicDictionaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateIotbasicDictionaryResponse) SetResultCode(v string) *OperateIotbasicDictionaryResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateIotbasicDictionaryResponse) SetResultMsg(v string) *OperateIotbasicDictionaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateIotbasicDictionaryResponse) SetSuccess(v bool) *OperateIotbasicDictionaryResponse {
	s.Success = &v
	return s
}

type OperateIotbasicCategoryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 品类名称
	CategoryName *string `json:"category_name,omitempty" xml:"category_name,omitempty" require:"true"`
	// 行业
	Industry *string `json:"industry,omitempty" xml:"industry,omitempty" require:"true"`
	// 场景
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 品类类型：标准 | 自定义
	CategoryType *string `json:"category_type,omitempty" xml:"category_type,omitempty" require:"true"`
	// 描述内容
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
	// 操作类型
	Action *string `json:"action,omitempty" xml:"action,omitempty" require:"true"`
	// 操作人id
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
	// 参数签名校验
	ParamSign *string `json:"param_sign,omitempty" xml:"param_sign,omitempty" require:"true"`
	// 品类code
	CategoryCode *string `json:"category_code,omitempty" xml:"category_code,omitempty"`
}

func (s OperateIotbasicCategoryRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateIotbasicCategoryRequest) GoString() string {
	return s.String()
}

func (s *OperateIotbasicCategoryRequest) SetAuthToken(v string) *OperateIotbasicCategoryRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateIotbasicCategoryRequest) SetProductInstanceId(v string) *OperateIotbasicCategoryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateIotbasicCategoryRequest) SetCategoryName(v string) *OperateIotbasicCategoryRequest {
	s.CategoryName = &v
	return s
}

func (s *OperateIotbasicCategoryRequest) SetIndustry(v string) *OperateIotbasicCategoryRequest {
	s.Industry = &v
	return s
}

func (s *OperateIotbasicCategoryRequest) SetScene(v string) *OperateIotbasicCategoryRequest {
	s.Scene = &v
	return s
}

func (s *OperateIotbasicCategoryRequest) SetCategoryType(v string) *OperateIotbasicCategoryRequest {
	s.CategoryType = &v
	return s
}

func (s *OperateIotbasicCategoryRequest) SetRemark(v string) *OperateIotbasicCategoryRequest {
	s.Remark = &v
	return s
}

func (s *OperateIotbasicCategoryRequest) SetAction(v string) *OperateIotbasicCategoryRequest {
	s.Action = &v
	return s
}

func (s *OperateIotbasicCategoryRequest) SetOperatorId(v string) *OperateIotbasicCategoryRequest {
	s.OperatorId = &v
	return s
}

func (s *OperateIotbasicCategoryRequest) SetParamSign(v string) *OperateIotbasicCategoryRequest {
	s.ParamSign = &v
	return s
}

func (s *OperateIotbasicCategoryRequest) SetCategoryCode(v string) *OperateIotbasicCategoryRequest {
	s.CategoryCode = &v
	return s
}

type OperateIotbasicCategoryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s OperateIotbasicCategoryResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateIotbasicCategoryResponse) GoString() string {
	return s.String()
}

func (s *OperateIotbasicCategoryResponse) SetReqMsgId(v string) *OperateIotbasicCategoryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateIotbasicCategoryResponse) SetResultCode(v string) *OperateIotbasicCategoryResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateIotbasicCategoryResponse) SetResultMsg(v string) *OperateIotbasicCategoryResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateIotbasicCategoryResponse) SetSuccess(v bool) *OperateIotbasicCategoryResponse {
	s.Success = &v
	return s
}

type OperateIotbasicControlconfigRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备品类编码
	CategoryCode *string `json:"category_code,omitempty" xml:"category_code,omitempty" require:"true"`
	// 厂商
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty" require:"true"`
	// 设备型号
	DeviceModel *string `json:"device_model,omitempty" xml:"device_model,omitempty"`
	// 管控模式
	ControlModel *string `json:"control_model,omitempty" xml:"control_model,omitempty" require:"true"`
	// 是否上链--注册设备后需上链存证，记录存证hash
	IsRegisterNotify *string `json:"is_register_notify,omitempty" xml:"is_register_notify,omitempty" require:"true"`
	// 是否标准设备-- 设备注册时 判断扩展属性 或展示时 显示扩展属性
	IsStandard *string `json:"is_standard,omitempty" xml:"is_standard,omitempty" require:"true"`
	// 是否生成密钥--注册设备时 生成密钥对， 存到 设备公钥(public_key)、deviceSecrect
	IsGenSecret *string `json:"is_gen_secret,omitempty" xml:"is_gen_secret,omitempty" require:"true"`
	// 接口地址
	ServiceProvider *string `json:"service_provider,omitempty" xml:"service_provider,omitempty"`
	// 接口参数
	ControlParam *string `json:"control_param,omitempty" xml:"control_param,omitempty"`
	// 操作类型
	Action *string `json:"action,omitempty" xml:"action,omitempty" require:"true"`
	// 操作人id
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
	// 参数签名校验
	ParamSign *string `json:"param_sign,omitempty" xml:"param_sign,omitempty" require:"true"`
	// 是否接入安全认证
	IsSupportSec *string `json:"is_support_sec,omitempty" xml:"is_support_sec,omitempty" require:"true"`
	// 设备规格ID
	DeviceSpecs *int64 `json:"device_specs,omitempty" xml:"device_specs,omitempty"`
	// 厂商ID
	CorpId *int64 `json:"corp_id,omitempty" xml:"corp_id,omitempty" require:"true"`
}

func (s OperateIotbasicControlconfigRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateIotbasicControlconfigRequest) GoString() string {
	return s.String()
}

func (s *OperateIotbasicControlconfigRequest) SetAuthToken(v string) *OperateIotbasicControlconfigRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateIotbasicControlconfigRequest) SetProductInstanceId(v string) *OperateIotbasicControlconfigRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateIotbasicControlconfigRequest) SetCategoryCode(v string) *OperateIotbasicControlconfigRequest {
	s.CategoryCode = &v
	return s
}

func (s *OperateIotbasicControlconfigRequest) SetCorpName(v string) *OperateIotbasicControlconfigRequest {
	s.CorpName = &v
	return s
}

func (s *OperateIotbasicControlconfigRequest) SetDeviceModel(v string) *OperateIotbasicControlconfigRequest {
	s.DeviceModel = &v
	return s
}

func (s *OperateIotbasicControlconfigRequest) SetControlModel(v string) *OperateIotbasicControlconfigRequest {
	s.ControlModel = &v
	return s
}

func (s *OperateIotbasicControlconfigRequest) SetIsRegisterNotify(v string) *OperateIotbasicControlconfigRequest {
	s.IsRegisterNotify = &v
	return s
}

func (s *OperateIotbasicControlconfigRequest) SetIsStandard(v string) *OperateIotbasicControlconfigRequest {
	s.IsStandard = &v
	return s
}

func (s *OperateIotbasicControlconfigRequest) SetIsGenSecret(v string) *OperateIotbasicControlconfigRequest {
	s.IsGenSecret = &v
	return s
}

func (s *OperateIotbasicControlconfigRequest) SetServiceProvider(v string) *OperateIotbasicControlconfigRequest {
	s.ServiceProvider = &v
	return s
}

func (s *OperateIotbasicControlconfigRequest) SetControlParam(v string) *OperateIotbasicControlconfigRequest {
	s.ControlParam = &v
	return s
}

func (s *OperateIotbasicControlconfigRequest) SetAction(v string) *OperateIotbasicControlconfigRequest {
	s.Action = &v
	return s
}

func (s *OperateIotbasicControlconfigRequest) SetOperatorId(v string) *OperateIotbasicControlconfigRequest {
	s.OperatorId = &v
	return s
}

func (s *OperateIotbasicControlconfigRequest) SetParamSign(v string) *OperateIotbasicControlconfigRequest {
	s.ParamSign = &v
	return s
}

func (s *OperateIotbasicControlconfigRequest) SetIsSupportSec(v string) *OperateIotbasicControlconfigRequest {
	s.IsSupportSec = &v
	return s
}

func (s *OperateIotbasicControlconfigRequest) SetDeviceSpecs(v int64) *OperateIotbasicControlconfigRequest {
	s.DeviceSpecs = &v
	return s
}

func (s *OperateIotbasicControlconfigRequest) SetCorpId(v int64) *OperateIotbasicControlconfigRequest {
	s.CorpId = &v
	return s
}

type OperateIotbasicControlconfigResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s OperateIotbasicControlconfigResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateIotbasicControlconfigResponse) GoString() string {
	return s.String()
}

func (s *OperateIotbasicControlconfigResponse) SetReqMsgId(v string) *OperateIotbasicControlconfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateIotbasicControlconfigResponse) SetResultCode(v string) *OperateIotbasicControlconfigResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateIotbasicControlconfigResponse) SetResultMsg(v string) *OperateIotbasicControlconfigResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateIotbasicControlconfigResponse) SetSuccess(v bool) *OperateIotbasicControlconfigResponse {
	s.Success = &v
	return s
}

type OperateIotbasicChainmodelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 操作类型
	Action *string `json:"action,omitempty" xml:"action,omitempty" require:"true"`
	// 操作人id
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
	// 参数签名校验
	ParamSign *string `json:"param_sign,omitempty" xml:"param_sign,omitempty" require:"true"`
	// 所属业务
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
	// 资产数据类型
	DataScene *string `json:"data_scene,omitempty" xml:"data_scene,omitempty" require:"true"`
	// 资产ID-key
	AssetsIdKey *string `json:"assets_id_key,omitempty" xml:"assets_id_key,omitempty" require:"true"`
	// 资产ID-类型
	AssetsIdType *string `json:"assets_id_type,omitempty" xml:"assets_id_type,omitempty" require:"true"`
	// 签名验证方式
	SignatureCheckType *string `json:"signature_check_type,omitempty" xml:"signature_check_type,omitempty" require:"true"`
}

func (s OperateIotbasicChainmodelRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateIotbasicChainmodelRequest) GoString() string {
	return s.String()
}

func (s *OperateIotbasicChainmodelRequest) SetAuthToken(v string) *OperateIotbasicChainmodelRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateIotbasicChainmodelRequest) SetProductInstanceId(v string) *OperateIotbasicChainmodelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateIotbasicChainmodelRequest) SetAction(v string) *OperateIotbasicChainmodelRequest {
	s.Action = &v
	return s
}

func (s *OperateIotbasicChainmodelRequest) SetOperatorId(v string) *OperateIotbasicChainmodelRequest {
	s.OperatorId = &v
	return s
}

func (s *OperateIotbasicChainmodelRequest) SetParamSign(v string) *OperateIotbasicChainmodelRequest {
	s.ParamSign = &v
	return s
}

func (s *OperateIotbasicChainmodelRequest) SetBizScene(v string) *OperateIotbasicChainmodelRequest {
	s.BizScene = &v
	return s
}

func (s *OperateIotbasicChainmodelRequest) SetDataScene(v string) *OperateIotbasicChainmodelRequest {
	s.DataScene = &v
	return s
}

func (s *OperateIotbasicChainmodelRequest) SetAssetsIdKey(v string) *OperateIotbasicChainmodelRequest {
	s.AssetsIdKey = &v
	return s
}

func (s *OperateIotbasicChainmodelRequest) SetAssetsIdType(v string) *OperateIotbasicChainmodelRequest {
	s.AssetsIdType = &v
	return s
}

func (s *OperateIotbasicChainmodelRequest) SetSignatureCheckType(v string) *OperateIotbasicChainmodelRequest {
	s.SignatureCheckType = &v
	return s
}

type OperateIotbasicChainmodelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s OperateIotbasicChainmodelResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateIotbasicChainmodelResponse) GoString() string {
	return s.String()
}

func (s *OperateIotbasicChainmodelResponse) SetReqMsgId(v string) *OperateIotbasicChainmodelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateIotbasicChainmodelResponse) SetResultCode(v string) *OperateIotbasicChainmodelResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateIotbasicChainmodelResponse) SetResultMsg(v string) *OperateIotbasicChainmodelResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateIotbasicChainmodelResponse) SetSuccess(v bool) *OperateIotbasicChainmodelResponse {
	s.Success = &v
	return s
}

type OperateIotbasicDeviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备不可操作列表
	DeviceDisableList []*DeviceDisableData `json:"device_disable_list,omitempty" xml:"device_disable_list,omitempty" require:"true" type:"Repeated"`
	// 不允许操作类型
	// DISABLE_CHAGE：不允许变更租户
	// DISABLE_EDIT：不允许编辑设备
	// DISABLE_DEL：不允许删除设备
	DisableOperateType *string `json:"disable_operate_type,omitempty" xml:"disable_operate_type,omitempty" require:"true"`
	// 操作状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 不允许操作提示，操作状态为true时必须有值
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s OperateIotbasicDeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateIotbasicDeviceRequest) GoString() string {
	return s.String()
}

func (s *OperateIotbasicDeviceRequest) SetAuthToken(v string) *OperateIotbasicDeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateIotbasicDeviceRequest) SetProductInstanceId(v string) *OperateIotbasicDeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateIotbasicDeviceRequest) SetDeviceDisableList(v []*DeviceDisableData) *OperateIotbasicDeviceRequest {
	s.DeviceDisableList = v
	return s
}

func (s *OperateIotbasicDeviceRequest) SetDisableOperateType(v string) *OperateIotbasicDeviceRequest {
	s.DisableOperateType = &v
	return s
}

func (s *OperateIotbasicDeviceRequest) SetStatus(v string) *OperateIotbasicDeviceRequest {
	s.Status = &v
	return s
}

func (s *OperateIotbasicDeviceRequest) SetMessage(v string) *OperateIotbasicDeviceRequest {
	s.Message = &v
	return s
}

type OperateIotbasicDeviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s OperateIotbasicDeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateIotbasicDeviceResponse) GoString() string {
	return s.String()
}

func (s *OperateIotbasicDeviceResponse) SetReqMsgId(v string) *OperateIotbasicDeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateIotbasicDeviceResponse) SetResultCode(v string) *OperateIotbasicDeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateIotbasicDeviceResponse) SetResultMsg(v string) *OperateIotbasicDeviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateIotbasicDeviceResponse) SetSuccess(v bool) *OperateIotbasicDeviceResponse {
	s.Success = &v
	return s
}

type CreateIotbasicDeviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备厂商名称
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty" require:"true"`
	// 设备品类编码
	DeviceCategoryCode *string `json:"device_category_code,omitempty" xml:"device_category_code,omitempty" require:"true"`
	// A1
	DeviceModel *string `json:"device_model,omitempty" xml:"device_model,omitempty" require:"true"`
	// xxx
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty" require:"true"`
	// xe21d
	DeviceSn *string `json:"device_sn,omitempty" xml:"device_sn,omitempty" require:"true"`
	// standard
	DeviceSpecs *string `json:"device_specs,omitempty" xml:"device_specs,omitempty" require:"true"`
	// 安装位置
	Location *string `json:"location,omitempty" xml:"location,omitempty"`
	// 设备标签
	NickName *string `json:"nick_name,omitempty" xml:"nick_name,omitempty"`
	// secid
	SecId *string `json:"sec_id,omitempty" xml:"sec_id,omitempty"`
	// 设备扩展信息
	DeviceExt *string `json:"device_ext,omitempty" xml:"device_ext,omitempty"`
	// 业务场景编码
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
	// 所属租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
}

func (s CreateIotbasicDeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateIotbasicDeviceRequest) GoString() string {
	return s.String()
}

func (s *CreateIotbasicDeviceRequest) SetAuthToken(v string) *CreateIotbasicDeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateIotbasicDeviceRequest) SetProductInstanceId(v string) *CreateIotbasicDeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateIotbasicDeviceRequest) SetCorpName(v string) *CreateIotbasicDeviceRequest {
	s.CorpName = &v
	return s
}

func (s *CreateIotbasicDeviceRequest) SetDeviceCategoryCode(v string) *CreateIotbasicDeviceRequest {
	s.DeviceCategoryCode = &v
	return s
}

func (s *CreateIotbasicDeviceRequest) SetDeviceModel(v string) *CreateIotbasicDeviceRequest {
	s.DeviceModel = &v
	return s
}

func (s *CreateIotbasicDeviceRequest) SetDeviceName(v string) *CreateIotbasicDeviceRequest {
	s.DeviceName = &v
	return s
}

func (s *CreateIotbasicDeviceRequest) SetDeviceSn(v string) *CreateIotbasicDeviceRequest {
	s.DeviceSn = &v
	return s
}

func (s *CreateIotbasicDeviceRequest) SetDeviceSpecs(v string) *CreateIotbasicDeviceRequest {
	s.DeviceSpecs = &v
	return s
}

func (s *CreateIotbasicDeviceRequest) SetLocation(v string) *CreateIotbasicDeviceRequest {
	s.Location = &v
	return s
}

func (s *CreateIotbasicDeviceRequest) SetNickName(v string) *CreateIotbasicDeviceRequest {
	s.NickName = &v
	return s
}

func (s *CreateIotbasicDeviceRequest) SetSecId(v string) *CreateIotbasicDeviceRequest {
	s.SecId = &v
	return s
}

func (s *CreateIotbasicDeviceRequest) SetDeviceExt(v string) *CreateIotbasicDeviceRequest {
	s.DeviceExt = &v
	return s
}

func (s *CreateIotbasicDeviceRequest) SetBizScene(v string) *CreateIotbasicDeviceRequest {
	s.BizScene = &v
	return s
}

func (s *CreateIotbasicDeviceRequest) SetTenantId(v string) *CreateIotbasicDeviceRequest {
	s.TenantId = &v
	return s
}

type CreateIotbasicDeviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// ddi
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty"`
	// 设备私钥
	PrivateKey *string `json:"private_key,omitempty" xml:"private_key,omitempty"`
}

func (s CreateIotbasicDeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateIotbasicDeviceResponse) GoString() string {
	return s.String()
}

func (s *CreateIotbasicDeviceResponse) SetReqMsgId(v string) *CreateIotbasicDeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateIotbasicDeviceResponse) SetResultCode(v string) *CreateIotbasicDeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateIotbasicDeviceResponse) SetResultMsg(v string) *CreateIotbasicDeviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateIotbasicDeviceResponse) SetDeviceDid(v string) *CreateIotbasicDeviceResponse {
	s.DeviceDid = &v
	return s
}

func (s *CreateIotbasicDeviceResponse) SetPrivateKey(v string) *CreateIotbasicDeviceResponse {
	s.PrivateKey = &v
	return s
}

type BatchcreateIotbasicDeviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备厂商
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty" require:"true"`
	// 设备品类编码
	DeviceCategoryCode *string `json:"device_category_code,omitempty" xml:"device_category_code,omitempty" require:"true"`
	// 业务场景码
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
	// 所属租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 注册设备集合
	DeviceList []*IotBasicDeviceRegisterInfo `json:"device_list,omitempty" xml:"device_list,omitempty" require:"true" type:"Repeated"`
}

func (s BatchcreateIotbasicDeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateIotbasicDeviceRequest) GoString() string {
	return s.String()
}

func (s *BatchcreateIotbasicDeviceRequest) SetAuthToken(v string) *BatchcreateIotbasicDeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchcreateIotbasicDeviceRequest) SetProductInstanceId(v string) *BatchcreateIotbasicDeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchcreateIotbasicDeviceRequest) SetCorpName(v string) *BatchcreateIotbasicDeviceRequest {
	s.CorpName = &v
	return s
}

func (s *BatchcreateIotbasicDeviceRequest) SetDeviceCategoryCode(v string) *BatchcreateIotbasicDeviceRequest {
	s.DeviceCategoryCode = &v
	return s
}

func (s *BatchcreateIotbasicDeviceRequest) SetBizScene(v string) *BatchcreateIotbasicDeviceRequest {
	s.BizScene = &v
	return s
}

func (s *BatchcreateIotbasicDeviceRequest) SetTenantId(v string) *BatchcreateIotbasicDeviceRequest {
	s.TenantId = &v
	return s
}

func (s *BatchcreateIotbasicDeviceRequest) SetDeviceList(v []*IotBasicDeviceRegisterInfo) *BatchcreateIotbasicDeviceRequest {
	s.DeviceList = v
	return s
}

type BatchcreateIotbasicDeviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 注册成功集合
	SuccessList []*IotBasicDeviceRegisterResult `json:"success_list,omitempty" xml:"success_list,omitempty" type:"Repeated"`
	// 注册失败集合
	FailList []*IotBasicDeviceRegisterFail `json:"fail_list,omitempty" xml:"fail_list,omitempty" type:"Repeated"`
}

func (s BatchcreateIotbasicDeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateIotbasicDeviceResponse) GoString() string {
	return s.String()
}

func (s *BatchcreateIotbasicDeviceResponse) SetReqMsgId(v string) *BatchcreateIotbasicDeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchcreateIotbasicDeviceResponse) SetResultCode(v string) *BatchcreateIotbasicDeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchcreateIotbasicDeviceResponse) SetResultMsg(v string) *BatchcreateIotbasicDeviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchcreateIotbasicDeviceResponse) SetSuccessList(v []*IotBasicDeviceRegisterResult) *BatchcreateIotbasicDeviceResponse {
	s.SuccessList = v
	return s
}

func (s *BatchcreateIotbasicDeviceResponse) SetFailList(v []*IotBasicDeviceRegisterFail) *BatchcreateIotbasicDeviceResponse {
	s.FailList = v
	return s
}

type SyncIotbasicDevicestatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备did
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty" require:"true"`
	// 设备状态
	DeviceStatus *string `json:"device_status,omitempty" xml:"device_status,omitempty" require:"true"`
	// 设备签名
	DeviceSignature *string `json:"device_signature,omitempty" xml:"device_signature,omitempty" require:"true"`
}

func (s SyncIotbasicDevicestatusRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncIotbasicDevicestatusRequest) GoString() string {
	return s.String()
}

func (s *SyncIotbasicDevicestatusRequest) SetAuthToken(v string) *SyncIotbasicDevicestatusRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncIotbasicDevicestatusRequest) SetProductInstanceId(v string) *SyncIotbasicDevicestatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncIotbasicDevicestatusRequest) SetDeviceDid(v string) *SyncIotbasicDevicestatusRequest {
	s.DeviceDid = &v
	return s
}

func (s *SyncIotbasicDevicestatusRequest) SetDeviceStatus(v string) *SyncIotbasicDevicestatusRequest {
	s.DeviceStatus = &v
	return s
}

func (s *SyncIotbasicDevicestatusRequest) SetDeviceSignature(v string) *SyncIotbasicDevicestatusRequest {
	s.DeviceSignature = &v
	return s
}

type SyncIotbasicDevicestatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SyncIotbasicDevicestatusResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncIotbasicDevicestatusResponse) GoString() string {
	return s.String()
}

func (s *SyncIotbasicDevicestatusResponse) SetReqMsgId(v string) *SyncIotbasicDevicestatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncIotbasicDevicestatusResponse) SetResultCode(v string) *SyncIotbasicDevicestatusResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncIotbasicDevicestatusResponse) SetResultMsg(v string) *SyncIotbasicDevicestatusResponse {
	s.ResultMsg = &v
	return s
}

type VerifyIotbasicIdentifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备did
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty" require:"true"`
	// 设备认证参数
	VerifyParam *string `json:"verify_param,omitempty" xml:"verify_param,omitempty" require:"true"`
	// 设备签名，用设备pri_key 进行签名
	DeviceSignature *string `json:"device_signature,omitempty" xml:"device_signature,omitempty" require:"true"`
}

func (s VerifyIotbasicIdentifyRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyIotbasicIdentifyRequest) GoString() string {
	return s.String()
}

func (s *VerifyIotbasicIdentifyRequest) SetAuthToken(v string) *VerifyIotbasicIdentifyRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyIotbasicIdentifyRequest) SetProductInstanceId(v string) *VerifyIotbasicIdentifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyIotbasicIdentifyRequest) SetDeviceDid(v string) *VerifyIotbasicIdentifyRequest {
	s.DeviceDid = &v
	return s
}

func (s *VerifyIotbasicIdentifyRequest) SetVerifyParam(v string) *VerifyIotbasicIdentifyRequest {
	s.VerifyParam = &v
	return s
}

func (s *VerifyIotbasicIdentifyRequest) SetDeviceSignature(v string) *VerifyIotbasicIdentifyRequest {
	s.DeviceSignature = &v
	return s
}

type VerifyIotbasicIdentifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证结果
	VerifyResult *string `json:"verify_result,omitempty" xml:"verify_result,omitempty"`
}

func (s VerifyIotbasicIdentifyResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyIotbasicIdentifyResponse) GoString() string {
	return s.String()
}

func (s *VerifyIotbasicIdentifyResponse) SetReqMsgId(v string) *VerifyIotbasicIdentifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyIotbasicIdentifyResponse) SetResultCode(v string) *VerifyIotbasicIdentifyResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyIotbasicIdentifyResponse) SetResultMsg(v string) *VerifyIotbasicIdentifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyIotbasicIdentifyResponse) SetVerifyResult(v string) *VerifyIotbasicIdentifyResponse {
	s.VerifyResult = &v
	return s
}

type UpdateIotbasicDeviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备did
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty" require:"true"`
	// 设备名称
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty"`
	// 安装位置
	Location *string `json:"location,omitempty" xml:"location,omitempty"`
	// 设备扩展信息
	DeviceExt *string `json:"device_ext,omitempty" xml:"device_ext,omitempty"`
	// 设备标签
	NickName *string `json:"nick_name,omitempty" xml:"nick_name,omitempty"`
	// 设备签名
	DeviceSignature *string `json:"device_signature,omitempty" xml:"device_signature,omitempty" require:"true"`
}

func (s UpdateIotbasicDeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateIotbasicDeviceRequest) GoString() string {
	return s.String()
}

func (s *UpdateIotbasicDeviceRequest) SetAuthToken(v string) *UpdateIotbasicDeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateIotbasicDeviceRequest) SetProductInstanceId(v string) *UpdateIotbasicDeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateIotbasicDeviceRequest) SetDeviceDid(v string) *UpdateIotbasicDeviceRequest {
	s.DeviceDid = &v
	return s
}

func (s *UpdateIotbasicDeviceRequest) SetDeviceName(v string) *UpdateIotbasicDeviceRequest {
	s.DeviceName = &v
	return s
}

func (s *UpdateIotbasicDeviceRequest) SetLocation(v string) *UpdateIotbasicDeviceRequest {
	s.Location = &v
	return s
}

func (s *UpdateIotbasicDeviceRequest) SetDeviceExt(v string) *UpdateIotbasicDeviceRequest {
	s.DeviceExt = &v
	return s
}

func (s *UpdateIotbasicDeviceRequest) SetNickName(v string) *UpdateIotbasicDeviceRequest {
	s.NickName = &v
	return s
}

func (s *UpdateIotbasicDeviceRequest) SetDeviceSignature(v string) *UpdateIotbasicDeviceRequest {
	s.DeviceSignature = &v
	return s
}

type UpdateIotbasicDeviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateIotbasicDeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateIotbasicDeviceResponse) GoString() string {
	return s.String()
}

func (s *UpdateIotbasicDeviceResponse) SetReqMsgId(v string) *UpdateIotbasicDeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateIotbasicDeviceResponse) SetResultCode(v string) *UpdateIotbasicDeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateIotbasicDeviceResponse) SetResultMsg(v string) *UpdateIotbasicDeviceResponse {
	s.ResultMsg = &v
	return s
}

type OperateIotbasicDevicecollectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 数据资产类型
	DataScene *string `json:"data_scene,omitempty" xml:"data_scene,omitempty" require:"true"`
	// 所属业务
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
	// 资产数据内容，业务要上链的数据JSON格式
	AssetData *string `json:"asset_data,omitempty" xml:"asset_data,omitempty" require:"true"`
}

func (s OperateIotbasicDevicecollectRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateIotbasicDevicecollectRequest) GoString() string {
	return s.String()
}

func (s *OperateIotbasicDevicecollectRequest) SetAuthToken(v string) *OperateIotbasicDevicecollectRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateIotbasicDevicecollectRequest) SetProductInstanceId(v string) *OperateIotbasicDevicecollectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateIotbasicDevicecollectRequest) SetTenantId(v string) *OperateIotbasicDevicecollectRequest {
	s.TenantId = &v
	return s
}

func (s *OperateIotbasicDevicecollectRequest) SetAssetId(v string) *OperateIotbasicDevicecollectRequest {
	s.AssetId = &v
	return s
}

func (s *OperateIotbasicDevicecollectRequest) SetDataScene(v string) *OperateIotbasicDevicecollectRequest {
	s.DataScene = &v
	return s
}

func (s *OperateIotbasicDevicecollectRequest) SetBizScene(v string) *OperateIotbasicDevicecollectRequest {
	s.BizScene = &v
	return s
}

func (s *OperateIotbasicDevicecollectRequest) SetAssetData(v string) *OperateIotbasicDevicecollectRequest {
	s.AssetData = &v
	return s
}

type OperateIotbasicDevicecollectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 上链id
	AntchainId *string `json:"antchain_id,omitempty" xml:"antchain_id,omitempty"`
}

func (s OperateIotbasicDevicecollectResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateIotbasicDevicecollectResponse) GoString() string {
	return s.String()
}

func (s *OperateIotbasicDevicecollectResponse) SetReqMsgId(v string) *OperateIotbasicDevicecollectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateIotbasicDevicecollectResponse) SetResultCode(v string) *OperateIotbasicDevicecollectResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateIotbasicDevicecollectResponse) SetResultMsg(v string) *OperateIotbasicDevicecollectResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateIotbasicDevicecollectResponse) SetSuccess(v bool) *OperateIotbasicDevicecollectResponse {
	s.Success = &v
	return s
}

func (s *OperateIotbasicDevicecollectResponse) SetAntchainId(v string) *OperateIotbasicDevicecollectResponse {
	s.AntchainId = &v
	return s
}

type OperateIotbasicProjectspaceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目空间id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 项目名称
	ProjectName *string `json:"project_name,omitempty" xml:"project_name,omitempty"`
	// 项目编码（device_base表字段biz_scene）
	ProjectCode *string `json:"project_code,omitempty" xml:"project_code,omitempty"`
	// 项目描述
	ProjectDesc *string `json:"project_desc,omitempty" xml:"project_desc,omitempty"`
	// 项目负责人（PD）
	ProjectLeader *string `json:"project_leader,omitempty" xml:"project_leader,omitempty"`
	// 上链ID（数据上到哪个业务链）
	UpchainId *string `json:"upchain_id,omitempty" xml:"upchain_id,omitempty"`
	// 上链方式（通过IOT可信平台，banRest）
	UpchainType *string `json:"upchain_type,omitempty" xml:"upchain_type,omitempty"`
	// 上链参数（账号，秘钥），json字符串格式
	UpchainParams *string `json:"upchain_params,omitempty" xml:"upchain_params,omitempty"`
	// 是否上链
	IsUpchain *bool `json:"is_upchain,omitempty" xml:"is_upchain,omitempty"`
	// 操作类型
	Action *string `json:"action,omitempty" xml:"action,omitempty" require:"true"`
	// 操作人id
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
	// 参数签名校验
	ParamSign *string `json:"param_sign,omitempty" xml:"param_sign,omitempty" require:"true"`
}

func (s OperateIotbasicProjectspaceRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateIotbasicProjectspaceRequest) GoString() string {
	return s.String()
}

func (s *OperateIotbasicProjectspaceRequest) SetAuthToken(v string) *OperateIotbasicProjectspaceRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateIotbasicProjectspaceRequest) SetProductInstanceId(v string) *OperateIotbasicProjectspaceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateIotbasicProjectspaceRequest) SetId(v int64) *OperateIotbasicProjectspaceRequest {
	s.Id = &v
	return s
}

func (s *OperateIotbasicProjectspaceRequest) SetProjectName(v string) *OperateIotbasicProjectspaceRequest {
	s.ProjectName = &v
	return s
}

func (s *OperateIotbasicProjectspaceRequest) SetProjectCode(v string) *OperateIotbasicProjectspaceRequest {
	s.ProjectCode = &v
	return s
}

func (s *OperateIotbasicProjectspaceRequest) SetProjectDesc(v string) *OperateIotbasicProjectspaceRequest {
	s.ProjectDesc = &v
	return s
}

func (s *OperateIotbasicProjectspaceRequest) SetProjectLeader(v string) *OperateIotbasicProjectspaceRequest {
	s.ProjectLeader = &v
	return s
}

func (s *OperateIotbasicProjectspaceRequest) SetUpchainId(v string) *OperateIotbasicProjectspaceRequest {
	s.UpchainId = &v
	return s
}

func (s *OperateIotbasicProjectspaceRequest) SetUpchainType(v string) *OperateIotbasicProjectspaceRequest {
	s.UpchainType = &v
	return s
}

func (s *OperateIotbasicProjectspaceRequest) SetUpchainParams(v string) *OperateIotbasicProjectspaceRequest {
	s.UpchainParams = &v
	return s
}

func (s *OperateIotbasicProjectspaceRequest) SetIsUpchain(v bool) *OperateIotbasicProjectspaceRequest {
	s.IsUpchain = &v
	return s
}

func (s *OperateIotbasicProjectspaceRequest) SetAction(v string) *OperateIotbasicProjectspaceRequest {
	s.Action = &v
	return s
}

func (s *OperateIotbasicProjectspaceRequest) SetOperatorId(v string) *OperateIotbasicProjectspaceRequest {
	s.OperatorId = &v
	return s
}

func (s *OperateIotbasicProjectspaceRequest) SetParamSign(v string) *OperateIotbasicProjectspaceRequest {
	s.ParamSign = &v
	return s
}

type OperateIotbasicProjectspaceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s OperateIotbasicProjectspaceResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateIotbasicProjectspaceResponse) GoString() string {
	return s.String()
}

func (s *OperateIotbasicProjectspaceResponse) SetReqMsgId(v string) *OperateIotbasicProjectspaceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateIotbasicProjectspaceResponse) SetResultCode(v string) *OperateIotbasicProjectspaceResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateIotbasicProjectspaceResponse) SetResultMsg(v string) *OperateIotbasicProjectspaceResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateIotbasicProjectspaceResponse) SetSuccess(v bool) *OperateIotbasicProjectspaceResponse {
	s.Success = &v
	return s
}

type PushRentMerchantRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业法人名称(个人可空)
	LegalPersonName *string `json:"legal_person_name,omitempty" xml:"legal_person_name,omitempty"`
	// 企业法人证件号(个人可空)
	LegalPersionIdcard *string `json:"legal_persion_idcard,omitempty" xml:"legal_persion_idcard,omitempty"`
	// 企业名称(个人名称)
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty" require:"true"`
	// 企业社会信用代码(个人身份证)
	MerchantCreditNo *string `json:"merchant_credit_no,omitempty" xml:"merchant_credit_no,omitempty" require:"true"`
	// 支付宝监管户账号
	AlipayAccount *string `json:"alipay_account,omitempty" xml:"alipay_account,omitempty"`
	// 个人或企业
	// 个人：P
	// 企业：E
	MerchantType *string `json:"merchant_type,omitempty" xml:"merchant_type,omitempty" require:"true"`
	// 企业联系人
	Contacts *string `json:"contacts,omitempty" xml:"contacts,omitempty"`
	// 企业位置
	Addr *string `json:"addr,omitempty" xml:"addr,omitempty"`
}

func (s PushRentMerchantRequest) String() string {
	return tea.Prettify(s)
}

func (s PushRentMerchantRequest) GoString() string {
	return s.String()
}

func (s *PushRentMerchantRequest) SetAuthToken(v string) *PushRentMerchantRequest {
	s.AuthToken = &v
	return s
}

func (s *PushRentMerchantRequest) SetProductInstanceId(v string) *PushRentMerchantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushRentMerchantRequest) SetLegalPersonName(v string) *PushRentMerchantRequest {
	s.LegalPersonName = &v
	return s
}

func (s *PushRentMerchantRequest) SetLegalPersionIdcard(v string) *PushRentMerchantRequest {
	s.LegalPersionIdcard = &v
	return s
}

func (s *PushRentMerchantRequest) SetMerchantName(v string) *PushRentMerchantRequest {
	s.MerchantName = &v
	return s
}

func (s *PushRentMerchantRequest) SetMerchantCreditNo(v string) *PushRentMerchantRequest {
	s.MerchantCreditNo = &v
	return s
}

func (s *PushRentMerchantRequest) SetAlipayAccount(v string) *PushRentMerchantRequest {
	s.AlipayAccount = &v
	return s
}

func (s *PushRentMerchantRequest) SetMerchantType(v string) *PushRentMerchantRequest {
	s.MerchantType = &v
	return s
}

func (s *PushRentMerchantRequest) SetContacts(v string) *PushRentMerchantRequest {
	s.Contacts = &v
	return s
}

func (s *PushRentMerchantRequest) SetAddr(v string) *PushRentMerchantRequest {
	s.Addr = &v
	return s
}

type PushRentMerchantResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s PushRentMerchantResponse) String() string {
	return tea.Prettify(s)
}

func (s PushRentMerchantResponse) GoString() string {
	return s.String()
}

func (s *PushRentMerchantResponse) SetReqMsgId(v string) *PushRentMerchantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushRentMerchantResponse) SetResultCode(v string) *PushRentMerchantResponse {
	s.ResultCode = &v
	return s
}

func (s *PushRentMerchantResponse) SetResultMsg(v string) *PushRentMerchantResponse {
	s.ResultMsg = &v
	return s
}

type PushRentBillRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业主房屋账单ID(
	LeaseBillId *string `json:"lease_bill_id,omitempty" xml:"lease_bill_id,omitempty" require:"true"`
	// 房源ID
	HouseId *string `json:"house_id,omitempty" xml:"house_id,omitempty" require:"true"`
	// 总账单开始日期
	BillBeginDate *string `json:"bill_begin_date,omitempty" xml:"bill_begin_date,omitempty" require:"true"`
	// 总账单结束日期
	BillEndDate *string `json:"bill_end_date,omitempty" xml:"bill_end_date,omitempty" require:"true"`
	// 总账单金额
	BillMoney *string `json:"bill_money,omitempty" xml:"bill_money,omitempty" require:"true"`
	// 提醒缴租日期范围(天数)
	RemindRange *string `json:"remind_range,omitempty" xml:"remind_range,omitempty" require:"true"`
	// 逾期未缴租警告日期范围(天数)
	WarnRange *string `json:"warn_range,omitempty" xml:"warn_range,omitempty" require:"true"`
	// 风险干预日期天数
	RiskRange *string `json:"risk_range,omitempty" xml:"risk_range,omitempty" require:"true"`
	// 账单租期集合
	BillItemList []*RentBillItem `json:"bill_item_list,omitempty" xml:"bill_item_list,omitempty" require:"true" type:"Repeated"`
}

func (s PushRentBillRequest) String() string {
	return tea.Prettify(s)
}

func (s PushRentBillRequest) GoString() string {
	return s.String()
}

func (s *PushRentBillRequest) SetAuthToken(v string) *PushRentBillRequest {
	s.AuthToken = &v
	return s
}

func (s *PushRentBillRequest) SetProductInstanceId(v string) *PushRentBillRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushRentBillRequest) SetLeaseBillId(v string) *PushRentBillRequest {
	s.LeaseBillId = &v
	return s
}

func (s *PushRentBillRequest) SetHouseId(v string) *PushRentBillRequest {
	s.HouseId = &v
	return s
}

func (s *PushRentBillRequest) SetBillBeginDate(v string) *PushRentBillRequest {
	s.BillBeginDate = &v
	return s
}

func (s *PushRentBillRequest) SetBillEndDate(v string) *PushRentBillRequest {
	s.BillEndDate = &v
	return s
}

func (s *PushRentBillRequest) SetBillMoney(v string) *PushRentBillRequest {
	s.BillMoney = &v
	return s
}

func (s *PushRentBillRequest) SetRemindRange(v string) *PushRentBillRequest {
	s.RemindRange = &v
	return s
}

func (s *PushRentBillRequest) SetWarnRange(v string) *PushRentBillRequest {
	s.WarnRange = &v
	return s
}

func (s *PushRentBillRequest) SetRiskRange(v string) *PushRentBillRequest {
	s.RiskRange = &v
	return s
}

func (s *PushRentBillRequest) SetBillItemList(v []*RentBillItem) *PushRentBillRequest {
	s.BillItemList = v
	return s
}

type PushRentBillResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s PushRentBillResponse) String() string {
	return tea.Prettify(s)
}

func (s PushRentBillResponse) GoString() string {
	return s.String()
}

func (s *PushRentBillResponse) SetReqMsgId(v string) *PushRentBillResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushRentBillResponse) SetResultCode(v string) *PushRentBillResponse {
	s.ResultCode = &v
	return s
}

func (s *PushRentBillResponse) SetResultMsg(v string) *PushRentBillResponse {
	s.ResultMsg = &v
	return s
}

type PushRentRenterRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租客id
	RenterId *string `json:"renter_id,omitempty" xml:"renter_id,omitempty" require:"true"`
	// 租客名称
	RenterName *string `json:"renter_name,omitempty" xml:"renter_name,omitempty" require:"true"`
	// 租客联系电话
	RenterPhone *string `json:"renter_phone,omitempty" xml:"renter_phone,omitempty" require:"true"`
	// 租客身份证号
	RenterIdCard *string `json:"renter_id_card,omitempty" xml:"renter_id_card,omitempty"`
	// 房源唯一ID
	HouseId *string `json:"house_id,omitempty" xml:"house_id,omitempty" require:"true"`
	// 租赁合同信息
	RentContract *RentContractInfo `json:"rent_contract,omitempty" xml:"rent_contract,omitempty" require:"true"`
	// 企业(业主)身份识别码
	MerchantIdCard *string `json:"merchant_id_card,omitempty" xml:"merchant_id_card,omitempty" require:"true"`
}

func (s PushRentRenterRequest) String() string {
	return tea.Prettify(s)
}

func (s PushRentRenterRequest) GoString() string {
	return s.String()
}

func (s *PushRentRenterRequest) SetAuthToken(v string) *PushRentRenterRequest {
	s.AuthToken = &v
	return s
}

func (s *PushRentRenterRequest) SetProductInstanceId(v string) *PushRentRenterRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushRentRenterRequest) SetRenterId(v string) *PushRentRenterRequest {
	s.RenterId = &v
	return s
}

func (s *PushRentRenterRequest) SetRenterName(v string) *PushRentRenterRequest {
	s.RenterName = &v
	return s
}

func (s *PushRentRenterRequest) SetRenterPhone(v string) *PushRentRenterRequest {
	s.RenterPhone = &v
	return s
}

func (s *PushRentRenterRequest) SetRenterIdCard(v string) *PushRentRenterRequest {
	s.RenterIdCard = &v
	return s
}

func (s *PushRentRenterRequest) SetHouseId(v string) *PushRentRenterRequest {
	s.HouseId = &v
	return s
}

func (s *PushRentRenterRequest) SetRentContract(v *RentContractInfo) *PushRentRenterRequest {
	s.RentContract = v
	return s
}

func (s *PushRentRenterRequest) SetMerchantIdCard(v string) *PushRentRenterRequest {
	s.MerchantIdCard = &v
	return s
}

type PushRentRenterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s PushRentRenterResponse) String() string {
	return tea.Prettify(s)
}

func (s PushRentRenterResponse) GoString() string {
	return s.String()
}

func (s *PushRentRenterResponse) SetReqMsgId(v string) *PushRentRenterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushRentRenterResponse) SetResultCode(v string) *PushRentRenterResponse {
	s.ResultCode = &v
	return s
}

func (s *PushRentRenterResponse) SetResultMsg(v string) *PushRentRenterResponse {
	s.ResultMsg = &v
	return s
}

type SyncRentRentpaymentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租金缴纳账单ID
	LeaseBillId *string `json:"lease_bill_id,omitempty" xml:"lease_bill_id,omitempty" require:"true"`
	// 租约分期ID
	BillItemId *string `json:"bill_item_id,omitempty" xml:"bill_item_id,omitempty" require:"true"`
	// 租约支付状态
	PaymentState *string `json:"payment_state,omitempty" xml:"payment_state,omitempty" require:"true"`
	// 支付操作日期，已支付或支付失败需要有值
	PaymentDate *string `json:"payment_date,omitempty" xml:"payment_date,omitempty"`
}

func (s SyncRentRentpaymentRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncRentRentpaymentRequest) GoString() string {
	return s.String()
}

func (s *SyncRentRentpaymentRequest) SetAuthToken(v string) *SyncRentRentpaymentRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncRentRentpaymentRequest) SetProductInstanceId(v string) *SyncRentRentpaymentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncRentRentpaymentRequest) SetLeaseBillId(v string) *SyncRentRentpaymentRequest {
	s.LeaseBillId = &v
	return s
}

func (s *SyncRentRentpaymentRequest) SetBillItemId(v string) *SyncRentRentpaymentRequest {
	s.BillItemId = &v
	return s
}

func (s *SyncRentRentpaymentRequest) SetPaymentState(v string) *SyncRentRentpaymentRequest {
	s.PaymentState = &v
	return s
}

func (s *SyncRentRentpaymentRequest) SetPaymentDate(v string) *SyncRentRentpaymentRequest {
	s.PaymentDate = &v
	return s
}

type SyncRentRentpaymentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SyncRentRentpaymentResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncRentRentpaymentResponse) GoString() string {
	return s.String()
}

func (s *SyncRentRentpaymentResponse) SetReqMsgId(v string) *SyncRentRentpaymentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncRentRentpaymentResponse) SetResultCode(v string) *SyncRentRentpaymentResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncRentRentpaymentResponse) SetResultMsg(v string) *SyncRentRentpaymentResponse {
	s.ResultMsg = &v
	return s
}

type PushRentHouseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 房源信息集合 数组
	HouseList []*HouseInfo `json:"house_list,omitempty" xml:"house_list,omitempty" require:"true" type:"Repeated"`
	// 企业(业主)身份识别码
	MerchantIdCard *string `json:"merchant_id_card,omitempty" xml:"merchant_id_card,omitempty" require:"true"`
	// 联系电话
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty"`
	// 联系人
	Contract *string `json:"contract,omitempty" xml:"contract,omitempty"`
	// 对应会员用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s PushRentHouseRequest) String() string {
	return tea.Prettify(s)
}

func (s PushRentHouseRequest) GoString() string {
	return s.String()
}

func (s *PushRentHouseRequest) SetAuthToken(v string) *PushRentHouseRequest {
	s.AuthToken = &v
	return s
}

func (s *PushRentHouseRequest) SetProductInstanceId(v string) *PushRentHouseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushRentHouseRequest) SetHouseList(v []*HouseInfo) *PushRentHouseRequest {
	s.HouseList = v
	return s
}

func (s *PushRentHouseRequest) SetMerchantIdCard(v string) *PushRentHouseRequest {
	s.MerchantIdCard = &v
	return s
}

func (s *PushRentHouseRequest) SetPhone(v string) *PushRentHouseRequest {
	s.Phone = &v
	return s
}

func (s *PushRentHouseRequest) SetContract(v string) *PushRentHouseRequest {
	s.Contract = &v
	return s
}

func (s *PushRentHouseRequest) SetUserId(v string) *PushRentHouseRequest {
	s.UserId = &v
	return s
}

type PushRentHouseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s PushRentHouseResponse) String() string {
	return tea.Prettify(s)
}

func (s PushRentHouseResponse) GoString() string {
	return s.String()
}

func (s *PushRentHouseResponse) SetReqMsgId(v string) *PushRentHouseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushRentHouseResponse) SetResultCode(v string) *PushRentHouseResponse {
	s.ResultCode = &v
	return s
}

func (s *PushRentHouseResponse) SetResultMsg(v string) *PushRentHouseResponse {
	s.ResultMsg = &v
	return s
}

type SyncIotbasicDevicegenerateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备厂商名称
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty" require:"true"`
	// 设备sn
	DeviceSn *string `json:"device_sn,omitempty" xml:"device_sn,omitempty" require:"true"`
	// 公钥
	PubKey *string `json:"pub_key,omitempty" xml:"pub_key,omitempty" require:"true"`
	// 所属业务
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
	// 分组标签，标识密钥的分组
	Tag *string `json:"tag,omitempty" xml:"tag,omitempty" require:"true"`
}

func (s SyncIotbasicDevicegenerateRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncIotbasicDevicegenerateRequest) GoString() string {
	return s.String()
}

func (s *SyncIotbasicDevicegenerateRequest) SetAuthToken(v string) *SyncIotbasicDevicegenerateRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncIotbasicDevicegenerateRequest) SetProductInstanceId(v string) *SyncIotbasicDevicegenerateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncIotbasicDevicegenerateRequest) SetCorpName(v string) *SyncIotbasicDevicegenerateRequest {
	s.CorpName = &v
	return s
}

func (s *SyncIotbasicDevicegenerateRequest) SetDeviceSn(v string) *SyncIotbasicDevicegenerateRequest {
	s.DeviceSn = &v
	return s
}

func (s *SyncIotbasicDevicegenerateRequest) SetPubKey(v string) *SyncIotbasicDevicegenerateRequest {
	s.PubKey = &v
	return s
}

func (s *SyncIotbasicDevicegenerateRequest) SetBizScene(v string) *SyncIotbasicDevicegenerateRequest {
	s.BizScene = &v
	return s
}

func (s *SyncIotbasicDevicegenerateRequest) SetTag(v string) *SyncIotbasicDevicegenerateRequest {
	s.Tag = &v
	return s
}

type SyncIotbasicDevicegenerateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 设备私钥
	DeviceKey *string `json:"device_key,omitempty" xml:"device_key,omitempty"`
	// 设备认证id
	SecId *string `json:"sec_id,omitempty" xml:"sec_id,omitempty"`
}

func (s SyncIotbasicDevicegenerateResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncIotbasicDevicegenerateResponse) GoString() string {
	return s.String()
}

func (s *SyncIotbasicDevicegenerateResponse) SetReqMsgId(v string) *SyncIotbasicDevicegenerateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncIotbasicDevicegenerateResponse) SetResultCode(v string) *SyncIotbasicDevicegenerateResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncIotbasicDevicegenerateResponse) SetResultMsg(v string) *SyncIotbasicDevicegenerateResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncIotbasicDevicegenerateResponse) SetDeviceKey(v string) *SyncIotbasicDevicegenerateResponse {
	s.DeviceKey = &v
	return s
}

func (s *SyncIotbasicDevicegenerateResponse) SetSecId(v string) *SyncIotbasicDevicegenerateResponse {
	s.SecId = &v
	return s
}

type OperateIotbasicBatchcollectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 所属业务
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 上链数据列表
	CollectInfoList []*CollectInfo `json:"collect_info_list,omitempty" xml:"collect_info_list,omitempty" require:"true" type:"Repeated"`
}

func (s OperateIotbasicBatchcollectRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateIotbasicBatchcollectRequest) GoString() string {
	return s.String()
}

func (s *OperateIotbasicBatchcollectRequest) SetAuthToken(v string) *OperateIotbasicBatchcollectRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateIotbasicBatchcollectRequest) SetProductInstanceId(v string) *OperateIotbasicBatchcollectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateIotbasicBatchcollectRequest) SetBizScene(v string) *OperateIotbasicBatchcollectRequest {
	s.BizScene = &v
	return s
}

func (s *OperateIotbasicBatchcollectRequest) SetTenantId(v string) *OperateIotbasicBatchcollectRequest {
	s.TenantId = &v
	return s
}

func (s *OperateIotbasicBatchcollectRequest) SetCollectInfoList(v []*CollectInfo) *OperateIotbasicBatchcollectRequest {
	s.CollectInfoList = v
	return s
}

type OperateIotbasicBatchcollectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 上链成功列表
	SuccessList []*DeviceCollectResult `json:"success_list,omitempty" xml:"success_list,omitempty" type:"Repeated"`
	// 上链失败列表
	FailList []*DeviceCollectFail `json:"fail_list,omitempty" xml:"fail_list,omitempty" type:"Repeated"`
}

func (s OperateIotbasicBatchcollectResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateIotbasicBatchcollectResponse) GoString() string {
	return s.String()
}

func (s *OperateIotbasicBatchcollectResponse) SetReqMsgId(v string) *OperateIotbasicBatchcollectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateIotbasicBatchcollectResponse) SetResultCode(v string) *OperateIotbasicBatchcollectResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateIotbasicBatchcollectResponse) SetResultMsg(v string) *OperateIotbasicBatchcollectResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateIotbasicBatchcollectResponse) SetSuccess(v bool) *OperateIotbasicBatchcollectResponse {
	s.Success = &v
	return s
}

func (s *OperateIotbasicBatchcollectResponse) SetSuccessList(v []*DeviceCollectResult) *OperateIotbasicBatchcollectResponse {
	s.SuccessList = v
	return s
}

func (s *OperateIotbasicBatchcollectResponse) SetFailList(v []*DeviceCollectFail) *OperateIotbasicBatchcollectResponse {
	s.FailList = v
	return s
}

type ImportIotbasicDeviceorderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 所属业务
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
	// 订单ID
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 订单状态: 已支付
	OrderStatus *string `json:"order_status,omitempty" xml:"order_status,omitempty" require:"true"`
	// 订单采购设备清单
	OrderDeviceList []*IotBasicDeviceOrderItem `json:"order_device_list,omitempty" xml:"order_device_list,omitempty" require:"true" type:"Repeated"`
	// 商家ID，唯一编号
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// 订单总金额，精确到小数后两位
	TotalAmount *string `json:"total_amount,omitempty" xml:"total_amount,omitempty" require:"true"`
}

func (s ImportIotbasicDeviceorderRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportIotbasicDeviceorderRequest) GoString() string {
	return s.String()
}

func (s *ImportIotbasicDeviceorderRequest) SetAuthToken(v string) *ImportIotbasicDeviceorderRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportIotbasicDeviceorderRequest) SetProductInstanceId(v string) *ImportIotbasicDeviceorderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportIotbasicDeviceorderRequest) SetBizScene(v string) *ImportIotbasicDeviceorderRequest {
	s.BizScene = &v
	return s
}

func (s *ImportIotbasicDeviceorderRequest) SetOrderId(v string) *ImportIotbasicDeviceorderRequest {
	s.OrderId = &v
	return s
}

func (s *ImportIotbasicDeviceorderRequest) SetOrderStatus(v string) *ImportIotbasicDeviceorderRequest {
	s.OrderStatus = &v
	return s
}

func (s *ImportIotbasicDeviceorderRequest) SetOrderDeviceList(v []*IotBasicDeviceOrderItem) *ImportIotbasicDeviceorderRequest {
	s.OrderDeviceList = v
	return s
}

func (s *ImportIotbasicDeviceorderRequest) SetMerchantId(v string) *ImportIotbasicDeviceorderRequest {
	s.MerchantId = &v
	return s
}

func (s *ImportIotbasicDeviceorderRequest) SetTotalAmount(v string) *ImportIotbasicDeviceorderRequest {
	s.TotalAmount = &v
	return s
}

type ImportIotbasicDeviceorderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上hash地址
	AntchainId *string `json:"antchain_id,omitempty" xml:"antchain_id,omitempty"`
	// 代表接口是否处理成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ImportIotbasicDeviceorderResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportIotbasicDeviceorderResponse) GoString() string {
	return s.String()
}

func (s *ImportIotbasicDeviceorderResponse) SetReqMsgId(v string) *ImportIotbasicDeviceorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportIotbasicDeviceorderResponse) SetResultCode(v string) *ImportIotbasicDeviceorderResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportIotbasicDeviceorderResponse) SetResultMsg(v string) *ImportIotbasicDeviceorderResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportIotbasicDeviceorderResponse) SetAntchainId(v string) *ImportIotbasicDeviceorderResponse {
	s.AntchainId = &v
	return s
}

func (s *ImportIotbasicDeviceorderResponse) SetSuccess(v bool) *ImportIotbasicDeviceorderResponse {
	s.Success = &v
	return s
}

type ImportIotbasicDeviceorderbatchRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务类型
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
	// 订单同步批量请求体
	OrderBatchSyncReq []*DeviceorderRequest `json:"order_batch_sync_req,omitempty" xml:"order_batch_sync_req,omitempty" require:"true" type:"Repeated"`
}

func (s ImportIotbasicDeviceorderbatchRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportIotbasicDeviceorderbatchRequest) GoString() string {
	return s.String()
}

func (s *ImportIotbasicDeviceorderbatchRequest) SetAuthToken(v string) *ImportIotbasicDeviceorderbatchRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportIotbasicDeviceorderbatchRequest) SetProductInstanceId(v string) *ImportIotbasicDeviceorderbatchRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportIotbasicDeviceorderbatchRequest) SetBizScene(v string) *ImportIotbasicDeviceorderbatchRequest {
	s.BizScene = &v
	return s
}

func (s *ImportIotbasicDeviceorderbatchRequest) SetOrderBatchSyncReq(v []*DeviceorderRequest) *ImportIotbasicDeviceorderbatchRequest {
	s.OrderBatchSyncReq = v
	return s
}

type ImportIotbasicDeviceorderbatchResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 接口是否执行成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 订单上链成功的集合
	SuccessList []*DeviceOrderResult `json:"success_list,omitempty" xml:"success_list,omitempty" type:"Repeated"`
	// 订单上链失败的集合
	FailList []*DeviceOrderFail `json:"fail_list,omitempty" xml:"fail_list,omitempty" type:"Repeated"`
}

func (s ImportIotbasicDeviceorderbatchResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportIotbasicDeviceorderbatchResponse) GoString() string {
	return s.String()
}

func (s *ImportIotbasicDeviceorderbatchResponse) SetReqMsgId(v string) *ImportIotbasicDeviceorderbatchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportIotbasicDeviceorderbatchResponse) SetResultCode(v string) *ImportIotbasicDeviceorderbatchResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportIotbasicDeviceorderbatchResponse) SetResultMsg(v string) *ImportIotbasicDeviceorderbatchResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportIotbasicDeviceorderbatchResponse) SetSuccess(v bool) *ImportIotbasicDeviceorderbatchResponse {
	s.Success = &v
	return s
}

func (s *ImportIotbasicDeviceorderbatchResponse) SetSuccessList(v []*DeviceOrderResult) *ImportIotbasicDeviceorderbatchResponse {
	s.SuccessList = v
	return s
}

func (s *ImportIotbasicDeviceorderbatchResponse) SetFailList(v []*DeviceOrderFail) *ImportIotbasicDeviceorderbatchResponse {
	s.FailList = v
	return s
}

type DeleteIotbasicDeviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备did
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty" require:"true"`
	// 设备所属用户
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 设备did签名
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
}

func (s DeleteIotbasicDeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteIotbasicDeviceRequest) GoString() string {
	return s.String()
}

func (s *DeleteIotbasicDeviceRequest) SetAuthToken(v string) *DeleteIotbasicDeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteIotbasicDeviceRequest) SetProductInstanceId(v string) *DeleteIotbasicDeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteIotbasicDeviceRequest) SetDeviceDid(v string) *DeleteIotbasicDeviceRequest {
	s.DeviceDid = &v
	return s
}

func (s *DeleteIotbasicDeviceRequest) SetUserId(v string) *DeleteIotbasicDeviceRequest {
	s.UserId = &v
	return s
}

func (s *DeleteIotbasicDeviceRequest) SetSignature(v string) *DeleteIotbasicDeviceRequest {
	s.Signature = &v
	return s
}

type DeleteIotbasicDeviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s DeleteIotbasicDeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteIotbasicDeviceResponse) GoString() string {
	return s.String()
}

func (s *DeleteIotbasicDeviceResponse) SetReqMsgId(v string) *DeleteIotbasicDeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteIotbasicDeviceResponse) SetResultCode(v string) *DeleteIotbasicDeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteIotbasicDeviceResponse) SetResultMsg(v string) *DeleteIotbasicDeviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteIotbasicDeviceResponse) SetSuccess(v bool) *DeleteIotbasicDeviceResponse {
	s.Success = &v
	return s
}

type OperateIotbasicDevicecontrolRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备did 集合
	DeviceDidList *string `json:"device_did_list,omitempty" xml:"device_did_list,omitempty"`
	// 设备did 集合
	DeviceOperateInfos []*DeviceOperateInfo `json:"device_operate_infos,omitempty" xml:"device_operate_infos,omitempty" type:"Repeated"`
	// 设备操作类型
	DeviceOperation *string `json:"device_operation,omitempty" xml:"device_operation,omitempty" require:"true"`
	// 所属账号名称
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s OperateIotbasicDevicecontrolRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateIotbasicDevicecontrolRequest) GoString() string {
	return s.String()
}

func (s *OperateIotbasicDevicecontrolRequest) SetAuthToken(v string) *OperateIotbasicDevicecontrolRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateIotbasicDevicecontrolRequest) SetProductInstanceId(v string) *OperateIotbasicDevicecontrolRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateIotbasicDevicecontrolRequest) SetDeviceDidList(v string) *OperateIotbasicDevicecontrolRequest {
	s.DeviceDidList = &v
	return s
}

func (s *OperateIotbasicDevicecontrolRequest) SetDeviceOperateInfos(v []*DeviceOperateInfo) *OperateIotbasicDevicecontrolRequest {
	s.DeviceOperateInfos = v
	return s
}

func (s *OperateIotbasicDevicecontrolRequest) SetDeviceOperation(v string) *OperateIotbasicDevicecontrolRequest {
	s.DeviceOperation = &v
	return s
}

func (s *OperateIotbasicDevicecontrolRequest) SetUserId(v string) *OperateIotbasicDevicecontrolRequest {
	s.UserId = &v
	return s
}

type OperateIotbasicDevicecontrolResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 操作成功的设备did列表
	SuccessList []*string `json:"success_list,omitempty" xml:"success_list,omitempty" type:"Repeated"`
	// 操作失败的设备did及失败信息列表
	FailList []*DeviceControlFail `json:"fail_list,omitempty" xml:"fail_list,omitempty" type:"Repeated"`
}

func (s OperateIotbasicDevicecontrolResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateIotbasicDevicecontrolResponse) GoString() string {
	return s.String()
}

func (s *OperateIotbasicDevicecontrolResponse) SetReqMsgId(v string) *OperateIotbasicDevicecontrolResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateIotbasicDevicecontrolResponse) SetResultCode(v string) *OperateIotbasicDevicecontrolResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateIotbasicDevicecontrolResponse) SetResultMsg(v string) *OperateIotbasicDevicecontrolResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateIotbasicDevicecontrolResponse) SetSuccess(v bool) *OperateIotbasicDevicecontrolResponse {
	s.Success = &v
	return s
}

func (s *OperateIotbasicDevicecontrolResponse) SetSuccessList(v []*string) *OperateIotbasicDevicecontrolResponse {
	s.SuccessList = v
	return s
}

func (s *OperateIotbasicDevicecontrolResponse) SetFailList(v []*DeviceControlFail) *OperateIotbasicDevicecontrolResponse {
	s.FailList = v
	return s
}

type QueryDeviceRegisterresultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备SN，可以传deviceSn和corpName，或者deviceDid，都传的以deviceDid为准
	DeviceSn *string `json:"device_sn,omitempty" xml:"device_sn,omitempty"`
	// 设备厂商名称，可以传deviceSn和corpName，或者deviceDid，都传的以deviceDid为准
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty"`
	// 设备did，可以传deviceSn和corpName，或者deviceDid，都传的以deviceDid为准
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
}

func (s QueryDeviceRegisterresultRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceRegisterresultRequest) GoString() string {
	return s.String()
}

func (s *QueryDeviceRegisterresultRequest) SetAuthToken(v string) *QueryDeviceRegisterresultRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDeviceRegisterresultRequest) SetProductInstanceId(v string) *QueryDeviceRegisterresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDeviceRegisterresultRequest) SetDeviceSn(v string) *QueryDeviceRegisterresultRequest {
	s.DeviceSn = &v
	return s
}

func (s *QueryDeviceRegisterresultRequest) SetCorpName(v string) *QueryDeviceRegisterresultRequest {
	s.CorpName = &v
	return s
}

func (s *QueryDeviceRegisterresultRequest) SetDeviceDid(v string) *QueryDeviceRegisterresultRequest {
	s.DeviceDid = &v
	return s
}

func (s *QueryDeviceRegisterresultRequest) SetTenantId(v string) *QueryDeviceRegisterresultRequest {
	s.TenantId = &v
	return s
}

type QueryDeviceRegisterresultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 设备did
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty"`
	// 设备秘钥
	PrivateKey *string `json:"private_key,omitempty" xml:"private_key,omitempty"`
}

func (s QueryDeviceRegisterresultResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceRegisterresultResponse) GoString() string {
	return s.String()
}

func (s *QueryDeviceRegisterresultResponse) SetReqMsgId(v string) *QueryDeviceRegisterresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDeviceRegisterresultResponse) SetResultCode(v string) *QueryDeviceRegisterresultResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDeviceRegisterresultResponse) SetResultMsg(v string) *QueryDeviceRegisterresultResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDeviceRegisterresultResponse) SetSuccess(v bool) *QueryDeviceRegisterresultResponse {
	s.Success = &v
	return s
}

func (s *QueryDeviceRegisterresultResponse) SetDeviceDid(v string) *QueryDeviceRegisterresultResponse {
	s.DeviceDid = &v
	return s
}

func (s *QueryDeviceRegisterresultResponse) SetPrivateKey(v string) *QueryDeviceRegisterresultResponse {
	s.PrivateKey = &v
	return s
}

type QueryDeviceStatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备did
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty" require:"true"`
	// 设备did签名
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
}

func (s QueryDeviceStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceStatusRequest) GoString() string {
	return s.String()
}

func (s *QueryDeviceStatusRequest) SetAuthToken(v string) *QueryDeviceStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDeviceStatusRequest) SetProductInstanceId(v string) *QueryDeviceStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDeviceStatusRequest) SetDeviceDid(v string) *QueryDeviceStatusRequest {
	s.DeviceDid = &v
	return s
}

func (s *QueryDeviceStatusRequest) SetSignature(v string) *QueryDeviceStatusRequest {
	s.Signature = &v
	return s
}

type QueryDeviceStatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 设备did
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty"`
	// 操作是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 设备状态
	DeviceStatus *string `json:"device_status,omitempty" xml:"device_status,omitempty"`
	// 设备认证状态
	AuthStatus *string `json:"auth_status,omitempty" xml:"auth_status,omitempty"`
}

func (s QueryDeviceStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceStatusResponse) GoString() string {
	return s.String()
}

func (s *QueryDeviceStatusResponse) SetReqMsgId(v string) *QueryDeviceStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDeviceStatusResponse) SetResultCode(v string) *QueryDeviceStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDeviceStatusResponse) SetResultMsg(v string) *QueryDeviceStatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDeviceStatusResponse) SetDeviceDid(v string) *QueryDeviceStatusResponse {
	s.DeviceDid = &v
	return s
}

func (s *QueryDeviceStatusResponse) SetSuccess(v bool) *QueryDeviceStatusResponse {
	s.Success = &v
	return s
}

func (s *QueryDeviceStatusResponse) SetDeviceStatus(v string) *QueryDeviceStatusResponse {
	s.DeviceStatus = &v
	return s
}

func (s *QueryDeviceStatusResponse) SetAuthStatus(v string) *QueryDeviceStatusResponse {
	s.AuthStatus = &v
	return s
}

type OperateIotbasicOpenapiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 操作类型
	OperateType *string `json:"operate_type,omitempty" xml:"operate_type,omitempty" require:"true"`
	// 参数签名
	ParamSign *string `json:"param_sign,omitempty" xml:"param_sign,omitempty" require:"true"`
	// 业务操作类型
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 操作人id
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
	// 类名（实现类），首字母小写
	InterfaceName *string `json:"interface_name,omitempty" xml:"interface_name,omitempty" require:"true"`
	// 方法名
	MethodName *string `json:"method_name,omitempty" xml:"method_name,omitempty" require:"true"`
	// 参数类路径
	ParamClass *string `json:"param_class,omitempty" xml:"param_class,omitempty" require:"true"`
	// 参数数据
	ParamList *string `json:"param_list,omitempty" xml:"param_list,omitempty" require:"true"`
}

func (s OperateIotbasicOpenapiRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateIotbasicOpenapiRequest) GoString() string {
	return s.String()
}

func (s *OperateIotbasicOpenapiRequest) SetAuthToken(v string) *OperateIotbasicOpenapiRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateIotbasicOpenapiRequest) SetProductInstanceId(v string) *OperateIotbasicOpenapiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateIotbasicOpenapiRequest) SetOperateType(v string) *OperateIotbasicOpenapiRequest {
	s.OperateType = &v
	return s
}

func (s *OperateIotbasicOpenapiRequest) SetParamSign(v string) *OperateIotbasicOpenapiRequest {
	s.ParamSign = &v
	return s
}

func (s *OperateIotbasicOpenapiRequest) SetBizType(v string) *OperateIotbasicOpenapiRequest {
	s.BizType = &v
	return s
}

func (s *OperateIotbasicOpenapiRequest) SetOperatorId(v string) *OperateIotbasicOpenapiRequest {
	s.OperatorId = &v
	return s
}

func (s *OperateIotbasicOpenapiRequest) SetInterfaceName(v string) *OperateIotbasicOpenapiRequest {
	s.InterfaceName = &v
	return s
}

func (s *OperateIotbasicOpenapiRequest) SetMethodName(v string) *OperateIotbasicOpenapiRequest {
	s.MethodName = &v
	return s
}

func (s *OperateIotbasicOpenapiRequest) SetParamClass(v string) *OperateIotbasicOpenapiRequest {
	s.ParamClass = &v
	return s
}

func (s *OperateIotbasicOpenapiRequest) SetParamList(v string) *OperateIotbasicOpenapiRequest {
	s.ParamList = &v
	return s
}

type OperateIotbasicOpenapiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 结果数据
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s OperateIotbasicOpenapiResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateIotbasicOpenapiResponse) GoString() string {
	return s.String()
}

func (s *OperateIotbasicOpenapiResponse) SetReqMsgId(v string) *OperateIotbasicOpenapiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateIotbasicOpenapiResponse) SetResultCode(v string) *OperateIotbasicOpenapiResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateIotbasicOpenapiResponse) SetResultMsg(v string) *OperateIotbasicOpenapiResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateIotbasicOpenapiResponse) SetSuccess(v bool) *OperateIotbasicOpenapiResponse {
	s.Success = &v
	return s
}

func (s *OperateIotbasicOpenapiResponse) SetResult(v string) *OperateIotbasicOpenapiResponse {
	s.Result = &v
	return s
}

type QueryIotbasicDevicecollectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 资产类型
	DataScene *string `json:"data_scene,omitempty" xml:"data_scene,omitempty"`
	// 所属业务
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 上链hash
	AntchainId *string `json:"antchain_id,omitempty" xml:"antchain_id,omitempty"`
	// 上链数据内容 json
	AssetData *string `json:"asset_data,omitempty" xml:"asset_data,omitempty"`
	// 每页数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true" maximum:"100" minimum:"1"`
	// 当前页码
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true"`
	// 业务id
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
	// 查询开始时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty"`
}

func (s QueryIotbasicDevicecollectRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIotbasicDevicecollectRequest) GoString() string {
	return s.String()
}

func (s *QueryIotbasicDevicecollectRequest) SetAuthToken(v string) *QueryIotbasicDevicecollectRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIotbasicDevicecollectRequest) SetProductInstanceId(v string) *QueryIotbasicDevicecollectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIotbasicDevicecollectRequest) SetEndTime(v string) *QueryIotbasicDevicecollectRequest {
	s.EndTime = &v
	return s
}

func (s *QueryIotbasicDevicecollectRequest) SetDataScene(v string) *QueryIotbasicDevicecollectRequest {
	s.DataScene = &v
	return s
}

func (s *QueryIotbasicDevicecollectRequest) SetBizScene(v string) *QueryIotbasicDevicecollectRequest {
	s.BizScene = &v
	return s
}

func (s *QueryIotbasicDevicecollectRequest) SetTenantId(v string) *QueryIotbasicDevicecollectRequest {
	s.TenantId = &v
	return s
}

func (s *QueryIotbasicDevicecollectRequest) SetAntchainId(v string) *QueryIotbasicDevicecollectRequest {
	s.AntchainId = &v
	return s
}

func (s *QueryIotbasicDevicecollectRequest) SetAssetData(v string) *QueryIotbasicDevicecollectRequest {
	s.AssetData = &v
	return s
}

func (s *QueryIotbasicDevicecollectRequest) SetPageSize(v int64) *QueryIotbasicDevicecollectRequest {
	s.PageSize = &v
	return s
}

func (s *QueryIotbasicDevicecollectRequest) SetCurrentPage(v int64) *QueryIotbasicDevicecollectRequest {
	s.CurrentPage = &v
	return s
}

func (s *QueryIotbasicDevicecollectRequest) SetBusinessId(v string) *QueryIotbasicDevicecollectRequest {
	s.BusinessId = &v
	return s
}

func (s *QueryIotbasicDevicecollectRequest) SetStartTime(v string) *QueryIotbasicDevicecollectRequest {
	s.StartTime = &v
	return s
}

type QueryIotbasicDevicecollectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前页码
	Current *int64 `json:"current,omitempty" xml:"current,omitempty"`
	// 每页数据大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 数据总条数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
	// 查询结果
	Data []*ChainModelResult `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryIotbasicDevicecollectResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIotbasicDevicecollectResponse) GoString() string {
	return s.String()
}

func (s *QueryIotbasicDevicecollectResponse) SetReqMsgId(v string) *QueryIotbasicDevicecollectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIotbasicDevicecollectResponse) SetResultCode(v string) *QueryIotbasicDevicecollectResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIotbasicDevicecollectResponse) SetResultMsg(v string) *QueryIotbasicDevicecollectResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIotbasicDevicecollectResponse) SetCurrent(v int64) *QueryIotbasicDevicecollectResponse {
	s.Current = &v
	return s
}

func (s *QueryIotbasicDevicecollectResponse) SetPageSize(v int64) *QueryIotbasicDevicecollectResponse {
	s.PageSize = &v
	return s
}

func (s *QueryIotbasicDevicecollectResponse) SetTotal(v int64) *QueryIotbasicDevicecollectResponse {
	s.Total = &v
	return s
}

func (s *QueryIotbasicDevicecollectResponse) SetTotalPage(v int64) *QueryIotbasicDevicecollectResponse {
	s.TotalPage = &v
	return s
}

func (s *QueryIotbasicDevicecollectResponse) SetData(v []*ChainModelResult) *QueryIotbasicDevicecollectResponse {
	s.Data = v
	return s
}

type QueryIotbasicDeviceorderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 开始时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 所属业务
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
	// 每页数据条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true" maximum:"100" minimum:"1"`
	// 当前页数
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true"`
	// 订单ID
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 设备did
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty"`
}

func (s QueryIotbasicDeviceorderRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIotbasicDeviceorderRequest) GoString() string {
	return s.String()
}

func (s *QueryIotbasicDeviceorderRequest) SetAuthToken(v string) *QueryIotbasicDeviceorderRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIotbasicDeviceorderRequest) SetProductInstanceId(v string) *QueryIotbasicDeviceorderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIotbasicDeviceorderRequest) SetTenantId(v string) *QueryIotbasicDeviceorderRequest {
	s.TenantId = &v
	return s
}

func (s *QueryIotbasicDeviceorderRequest) SetStartTime(v string) *QueryIotbasicDeviceorderRequest {
	s.StartTime = &v
	return s
}

func (s *QueryIotbasicDeviceorderRequest) SetEndTime(v string) *QueryIotbasicDeviceorderRequest {
	s.EndTime = &v
	return s
}

func (s *QueryIotbasicDeviceorderRequest) SetBizScene(v string) *QueryIotbasicDeviceorderRequest {
	s.BizScene = &v
	return s
}

func (s *QueryIotbasicDeviceorderRequest) SetPageSize(v int64) *QueryIotbasicDeviceorderRequest {
	s.PageSize = &v
	return s
}

func (s *QueryIotbasicDeviceorderRequest) SetCurrentPage(v int64) *QueryIotbasicDeviceorderRequest {
	s.CurrentPage = &v
	return s
}

func (s *QueryIotbasicDeviceorderRequest) SetOrderId(v string) *QueryIotbasicDeviceorderRequest {
	s.OrderId = &v
	return s
}

func (s *QueryIotbasicDeviceorderRequest) SetDeviceDid(v string) *QueryIotbasicDeviceorderRequest {
	s.DeviceDid = &v
	return s
}

type QueryIotbasicDeviceorderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单明细
	OrderDetail []*IotBasicDeviceOrderItem `json:"order_detail,omitempty" xml:"order_detail,omitempty" type:"Repeated"`
	// 总记录数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
	// 当前页码
	Current *int64 `json:"current,omitempty" xml:"current,omitempty"`
	// 每页条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s QueryIotbasicDeviceorderResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIotbasicDeviceorderResponse) GoString() string {
	return s.String()
}

func (s *QueryIotbasicDeviceorderResponse) SetReqMsgId(v string) *QueryIotbasicDeviceorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIotbasicDeviceorderResponse) SetResultCode(v string) *QueryIotbasicDeviceorderResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIotbasicDeviceorderResponse) SetResultMsg(v string) *QueryIotbasicDeviceorderResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIotbasicDeviceorderResponse) SetOrderDetail(v []*IotBasicDeviceOrderItem) *QueryIotbasicDeviceorderResponse {
	s.OrderDetail = v
	return s
}

func (s *QueryIotbasicDeviceorderResponse) SetTotal(v int64) *QueryIotbasicDeviceorderResponse {
	s.Total = &v
	return s
}

func (s *QueryIotbasicDeviceorderResponse) SetTotalPage(v int64) *QueryIotbasicDeviceorderResponse {
	s.TotalPage = &v
	return s
}

func (s *QueryIotbasicDeviceorderResponse) SetCurrent(v int64) *QueryIotbasicDeviceorderResponse {
	s.Current = &v
	return s
}

func (s *QueryIotbasicDeviceorderResponse) SetPageSize(v int64) *QueryIotbasicDeviceorderResponse {
	s.PageSize = &v
	return s
}

type PushIotbasicMeterdataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
}

func (s PushIotbasicMeterdataRequest) String() string {
	return tea.Prettify(s)
}

func (s PushIotbasicMeterdataRequest) GoString() string {
	return s.String()
}

func (s *PushIotbasicMeterdataRequest) SetAuthToken(v string) *PushIotbasicMeterdataRequest {
	s.AuthToken = &v
	return s
}

func (s *PushIotbasicMeterdataRequest) SetProductInstanceId(v string) *PushIotbasicMeterdataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushIotbasicMeterdataRequest) SetTenantId(v string) *PushIotbasicMeterdataRequest {
	s.TenantId = &v
	return s
}

func (s *PushIotbasicMeterdataRequest) SetOrderId(v string) *PushIotbasicMeterdataRequest {
	s.OrderId = &v
	return s
}

type PushIotbasicMeterdataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s PushIotbasicMeterdataResponse) String() string {
	return tea.Prettify(s)
}

func (s PushIotbasicMeterdataResponse) GoString() string {
	return s.String()
}

func (s *PushIotbasicMeterdataResponse) SetReqMsgId(v string) *PushIotbasicMeterdataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushIotbasicMeterdataResponse) SetResultCode(v string) *PushIotbasicMeterdataResponse {
	s.ResultCode = &v
	return s
}

func (s *PushIotbasicMeterdataResponse) SetResultMsg(v string) *PushIotbasicMeterdataResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushIotbasicMeterdataResponse) SetSuccess(v bool) *PushIotbasicMeterdataResponse {
	s.Success = &v
	return s
}

type SaveIotbasicCustomerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 商品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
}

func (s SaveIotbasicCustomerRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveIotbasicCustomerRequest) GoString() string {
	return s.String()
}

func (s *SaveIotbasicCustomerRequest) SetAuthToken(v string) *SaveIotbasicCustomerRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveIotbasicCustomerRequest) SetProductInstanceId(v string) *SaveIotbasicCustomerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveIotbasicCustomerRequest) SetTenantId(v string) *SaveIotbasicCustomerRequest {
	s.TenantId = &v
	return s
}

func (s *SaveIotbasicCustomerRequest) SetProductCode(v string) *SaveIotbasicCustomerRequest {
	s.ProductCode = &v
	return s
}

type SaveIotbasicCustomerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 成功标志
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s SaveIotbasicCustomerResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveIotbasicCustomerResponse) GoString() string {
	return s.String()
}

func (s *SaveIotbasicCustomerResponse) SetReqMsgId(v string) *SaveIotbasicCustomerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveIotbasicCustomerResponse) SetResultCode(v string) *SaveIotbasicCustomerResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveIotbasicCustomerResponse) SetResultMsg(v string) *SaveIotbasicCustomerResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveIotbasicCustomerResponse) SetSuccess(v bool) *SaveIotbasicCustomerResponse {
	s.Success = &v
	return s
}

type QueryIotplatformPurchaseorderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 设备串号
	SerialNumber *string `json:"serial_number,omitempty" xml:"serial_number,omitempty" require:"true"`
}

func (s QueryIotplatformPurchaseorderRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIotplatformPurchaseorderRequest) GoString() string {
	return s.String()
}

func (s *QueryIotplatformPurchaseorderRequest) SetAuthToken(v string) *QueryIotplatformPurchaseorderRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIotplatformPurchaseorderRequest) SetProductInstanceId(v string) *QueryIotplatformPurchaseorderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIotplatformPurchaseorderRequest) SetTenantId(v string) *QueryIotplatformPurchaseorderRequest {
	s.TenantId = &v
	return s
}

func (s *QueryIotplatformPurchaseorderRequest) SetSerialNumber(v string) *QueryIotplatformPurchaseorderRequest {
	s.SerialNumber = &v
	return s
}

type QueryIotplatformPurchaseorderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否为链上采购商品，true：是，false：否
	GoodsFromChain *bool `json:"goods_from_chain,omitempty" xml:"goods_from_chain,omitempty"`
	// 采购时间
	PurchaseTime *string `json:"purchase_time,omitempty" xml:"purchase_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 采购商名称
	LeaseName *string `json:"lease_name,omitempty" xml:"lease_name,omitempty"`
	// 采购价
	PurchaseOrderPrice *string `json:"purchase_order_price,omitempty" xml:"purchase_order_price,omitempty"`
	// 商品名称
	GoodsName *string `json:"goods_name,omitempty" xml:"goods_name,omitempty"`
}

func (s QueryIotplatformPurchaseorderResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIotplatformPurchaseorderResponse) GoString() string {
	return s.String()
}

func (s *QueryIotplatformPurchaseorderResponse) SetReqMsgId(v string) *QueryIotplatformPurchaseorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIotplatformPurchaseorderResponse) SetResultCode(v string) *QueryIotplatformPurchaseorderResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIotplatformPurchaseorderResponse) SetResultMsg(v string) *QueryIotplatformPurchaseorderResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIotplatformPurchaseorderResponse) SetGoodsFromChain(v bool) *QueryIotplatformPurchaseorderResponse {
	s.GoodsFromChain = &v
	return s
}

func (s *QueryIotplatformPurchaseorderResponse) SetPurchaseTime(v string) *QueryIotplatformPurchaseorderResponse {
	s.PurchaseTime = &v
	return s
}

func (s *QueryIotplatformPurchaseorderResponse) SetLeaseName(v string) *QueryIotplatformPurchaseorderResponse {
	s.LeaseName = &v
	return s
}

func (s *QueryIotplatformPurchaseorderResponse) SetPurchaseOrderPrice(v string) *QueryIotplatformPurchaseorderResponse {
	s.PurchaseOrderPrice = &v
	return s
}

func (s *QueryIotplatformPurchaseorderResponse) SetGoodsName(v string) *QueryIotplatformPurchaseorderResponse {
	s.GoodsName = &v
	return s
}

type ImportIotplatformMeshidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户的金融云租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 客户的公司名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" require:"true"`
	// 设备按照MeshAgent后获取的MeshId
	MeshId *string `json:"mesh_id,omitempty" xml:"mesh_id,omitempty" require:"true"`
	// 客户自定义的业务上使用的设备标识，需要与租赁业务上使用的ID进行对应
	DeviceSn *string `json:"device_sn,omitempty" xml:"device_sn,omitempty" require:"true"`
	// 设备类型字段
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 代理商名称，用于二级代理模式
	AgentName *string `json:"agent_name,omitempty" xml:"agent_name,omitempty"`
}

func (s ImportIotplatformMeshidRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportIotplatformMeshidRequest) GoString() string {
	return s.String()
}

func (s *ImportIotplatformMeshidRequest) SetAuthToken(v string) *ImportIotplatformMeshidRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportIotplatformMeshidRequest) SetProductInstanceId(v string) *ImportIotplatformMeshidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportIotplatformMeshidRequest) SetTenantId(v string) *ImportIotplatformMeshidRequest {
	s.TenantId = &v
	return s
}

func (s *ImportIotplatformMeshidRequest) SetCompanyName(v string) *ImportIotplatformMeshidRequest {
	s.CompanyName = &v
	return s
}

func (s *ImportIotplatformMeshidRequest) SetMeshId(v string) *ImportIotplatformMeshidRequest {
	s.MeshId = &v
	return s
}

func (s *ImportIotplatformMeshidRequest) SetDeviceSn(v string) *ImportIotplatformMeshidRequest {
	s.DeviceSn = &v
	return s
}

func (s *ImportIotplatformMeshidRequest) SetType(v string) *ImportIotplatformMeshidRequest {
	s.Type = &v
	return s
}

func (s *ImportIotplatformMeshidRequest) SetAgentName(v string) *ImportIotplatformMeshidRequest {
	s.AgentName = &v
	return s
}

type ImportIotplatformMeshidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 提交绑定时的SN号，用于确认
	DeviceSn *string `json:"device_sn,omitempty" xml:"device_sn,omitempty"`
}

func (s ImportIotplatformMeshidResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportIotplatformMeshidResponse) GoString() string {
	return s.String()
}

func (s *ImportIotplatformMeshidResponse) SetReqMsgId(v string) *ImportIotplatformMeshidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportIotplatformMeshidResponse) SetResultCode(v string) *ImportIotplatformMeshidResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportIotplatformMeshidResponse) SetResultMsg(v string) *ImportIotplatformMeshidResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportIotplatformMeshidResponse) SetDeviceSn(v string) *ImportIotplatformMeshidResponse {
	s.DeviceSn = &v
	return s
}

type ImportPurchaseorderThirdpartyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租赁订单号
	OrderNumber *string `json:"order_number,omitempty" xml:"order_number,omitempty" require:"true"`
	// 收货人姓名
	ConsigneeName *string `json:"consignee_name,omitempty" xml:"consignee_name,omitempty" require:"true"`
	// 收货人身份证号
	ConsigneeIdNumber *string `json:"consignee_id_number,omitempty" xml:"consignee_id_number,omitempty" require:"true"`
	// 收货人手机号
	ConsigneePhone *string `json:"consignee_phone,omitempty" xml:"consignee_phone,omitempty" require:"true"`
	// 收货人地址
	ConsigneeAddress *string `json:"consignee_address,omitempty" xml:"consignee_address,omitempty" require:"true"`
	// 供货商名称
	SupplierName *string `json:"supplier_name,omitempty" xml:"supplier_name,omitempty" require:"true"`
	// 供货商租户id
	SupplierId *string `json:"supplier_id,omitempty" xml:"supplier_id,omitempty" require:"true"`
	// 采购商租户id
	LeaseId *string `json:"lease_id,omitempty" xml:"lease_id,omitempty" require:"true"`
	// 商品信息列表
	GoodsList []*GoodsIdAndCount `json:"goods_list,omitempty" xml:"goods_list,omitempty" require:"true" type:"Repeated"`
	// 幂等号
	IdempotId *string `json:"idempot_id,omitempty" xml:"idempot_id,omitempty" require:"true"`
}

func (s ImportPurchaseorderThirdpartyRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportPurchaseorderThirdpartyRequest) GoString() string {
	return s.String()
}

func (s *ImportPurchaseorderThirdpartyRequest) SetAuthToken(v string) *ImportPurchaseorderThirdpartyRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportPurchaseorderThirdpartyRequest) SetProductInstanceId(v string) *ImportPurchaseorderThirdpartyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportPurchaseorderThirdpartyRequest) SetOrderNumber(v string) *ImportPurchaseorderThirdpartyRequest {
	s.OrderNumber = &v
	return s
}

func (s *ImportPurchaseorderThirdpartyRequest) SetConsigneeName(v string) *ImportPurchaseorderThirdpartyRequest {
	s.ConsigneeName = &v
	return s
}

func (s *ImportPurchaseorderThirdpartyRequest) SetConsigneeIdNumber(v string) *ImportPurchaseorderThirdpartyRequest {
	s.ConsigneeIdNumber = &v
	return s
}

func (s *ImportPurchaseorderThirdpartyRequest) SetConsigneePhone(v string) *ImportPurchaseorderThirdpartyRequest {
	s.ConsigneePhone = &v
	return s
}

func (s *ImportPurchaseorderThirdpartyRequest) SetConsigneeAddress(v string) *ImportPurchaseorderThirdpartyRequest {
	s.ConsigneeAddress = &v
	return s
}

func (s *ImportPurchaseorderThirdpartyRequest) SetSupplierName(v string) *ImportPurchaseorderThirdpartyRequest {
	s.SupplierName = &v
	return s
}

func (s *ImportPurchaseorderThirdpartyRequest) SetSupplierId(v string) *ImportPurchaseorderThirdpartyRequest {
	s.SupplierId = &v
	return s
}

func (s *ImportPurchaseorderThirdpartyRequest) SetLeaseId(v string) *ImportPurchaseorderThirdpartyRequest {
	s.LeaseId = &v
	return s
}

func (s *ImportPurchaseorderThirdpartyRequest) SetGoodsList(v []*GoodsIdAndCount) *ImportPurchaseorderThirdpartyRequest {
	s.GoodsList = v
	return s
}

func (s *ImportPurchaseorderThirdpartyRequest) SetIdempotId(v string) *ImportPurchaseorderThirdpartyRequest {
	s.IdempotId = &v
	return s
}

type ImportPurchaseorderThirdpartyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 采购平台-采购详情id
	PurchaseOrderId *string `json:"purchase_order_id,omitempty" xml:"purchase_order_id,omitempty"`
	// 当前状态
	// READY_DELIVER(0, "待发货"),
	// DELIVERED(1, "已发货"),
	// REFUSED(2, "已拒发"),
	// CANCELED(4, "已取消"),
	// REFUNDED(5, "已退货");
	//
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// InsertPurchaseOrderFailInfo
	FailMap *InsertPurchaseOrderFailInfo `json:"fail_map,omitempty" xml:"fail_map,omitempty"`
	// 真实订单信息，成功不返回
	//
	PurchaseOrderInfoDetail *PurchaseOrderInfoDetail `json:"purchase_order_info_detail,omitempty" xml:"purchase_order_info_detail,omitempty"`
	// 幂等号
	IdempotId *string `json:"idempot_id,omitempty" xml:"idempot_id,omitempty"`
}

func (s ImportPurchaseorderThirdpartyResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportPurchaseorderThirdpartyResponse) GoString() string {
	return s.String()
}

func (s *ImportPurchaseorderThirdpartyResponse) SetReqMsgId(v string) *ImportPurchaseorderThirdpartyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportPurchaseorderThirdpartyResponse) SetResultCode(v string) *ImportPurchaseorderThirdpartyResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportPurchaseorderThirdpartyResponse) SetResultMsg(v string) *ImportPurchaseorderThirdpartyResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportPurchaseorderThirdpartyResponse) SetPurchaseOrderId(v string) *ImportPurchaseorderThirdpartyResponse {
	s.PurchaseOrderId = &v
	return s
}

func (s *ImportPurchaseorderThirdpartyResponse) SetStatus(v string) *ImportPurchaseorderThirdpartyResponse {
	s.Status = &v
	return s
}

func (s *ImportPurchaseorderThirdpartyResponse) SetFailMap(v *InsertPurchaseOrderFailInfo) *ImportPurchaseorderThirdpartyResponse {
	s.FailMap = v
	return s
}

func (s *ImportPurchaseorderThirdpartyResponse) SetPurchaseOrderInfoDetail(v *PurchaseOrderInfoDetail) *ImportPurchaseorderThirdpartyResponse {
	s.PurchaseOrderInfoDetail = v
	return s
}

func (s *ImportPurchaseorderThirdpartyResponse) SetIdempotId(v string) *ImportPurchaseorderThirdpartyResponse {
	s.IdempotId = &v
	return s
}

type AddUserRoleRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 账号标识，蚂蚁金融科技租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 租户名称
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty" require:"true"`
	// 权限标识
	//     LEASER(0),
	//     BUYERS(1),
	//     OWNER(2),
	//     ADMIN(9);
	Role *string `json:"role,omitempty" xml:"role,omitempty" require:"true"`
	// 是否支持abm远程
	SupportAbm *bool `json:"support_abm,omitempty" xml:"support_abm,omitempty" require:"true"`
	// 是否含税
	IncludTax *bool `json:"includ_tax,omitempty" xml:"includ_tax,omitempty" require:"true"`
}

func (s AddUserRoleRequest) String() string {
	return tea.Prettify(s)
}

func (s AddUserRoleRequest) GoString() string {
	return s.String()
}

func (s *AddUserRoleRequest) SetAuthToken(v string) *AddUserRoleRequest {
	s.AuthToken = &v
	return s
}

func (s *AddUserRoleRequest) SetProductInstanceId(v string) *AddUserRoleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddUserRoleRequest) SetTenantId(v string) *AddUserRoleRequest {
	s.TenantId = &v
	return s
}

func (s *AddUserRoleRequest) SetTenantName(v string) *AddUserRoleRequest {
	s.TenantName = &v
	return s
}

func (s *AddUserRoleRequest) SetRole(v string) *AddUserRoleRequest {
	s.Role = &v
	return s
}

func (s *AddUserRoleRequest) SetSupportAbm(v bool) *AddUserRoleRequest {
	s.SupportAbm = &v
	return s
}

func (s *AddUserRoleRequest) SetIncludTax(v bool) *AddUserRoleRequest {
	s.IncludTax = &v
	return s
}

type AddUserRoleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 新增的用户id
	UserId *int64 `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s AddUserRoleResponse) String() string {
	return tea.Prettify(s)
}

func (s AddUserRoleResponse) GoString() string {
	return s.String()
}

func (s *AddUserRoleResponse) SetReqMsgId(v string) *AddUserRoleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddUserRoleResponse) SetResultCode(v string) *AddUserRoleResponse {
	s.ResultCode = &v
	return s
}

func (s *AddUserRoleResponse) SetResultMsg(v string) *AddUserRoleResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddUserRoleResponse) SetUserId(v int64) *AddUserRoleResponse {
	s.UserId = &v
	return s
}

type AddGoodsSkuRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// GoodsTypeEnum,商品一级类目
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 商品二级类目
	SecondType *string `json:"second_type,omitempty" xml:"second_type,omitempty" require:"true"`
	// 商品品牌
	Brand *string `json:"brand,omitempty" xml:"brand,omitempty" require:"true"`
	// 商品名称，型号
	Model *string `json:"model,omitempty" xml:"model,omitempty" require:"true"`
	// 市场价
	MarketPrice *int64 `json:"market_price,omitempty" xml:"market_price,omitempty" require:"true"`
	// 手机型号信息
	PhoneInfo *PhoneInfo `json:"phone_info,omitempty" xml:"phone_info,omitempty"`
	// 电脑型号信息
	ComputerInfo *ComputerInfo `json:"computer_info,omitempty" xml:"computer_info,omitempty"`
}

func (s AddGoodsSkuRequest) String() string {
	return tea.Prettify(s)
}

func (s AddGoodsSkuRequest) GoString() string {
	return s.String()
}

func (s *AddGoodsSkuRequest) SetAuthToken(v string) *AddGoodsSkuRequest {
	s.AuthToken = &v
	return s
}

func (s *AddGoodsSkuRequest) SetProductInstanceId(v string) *AddGoodsSkuRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddGoodsSkuRequest) SetType(v string) *AddGoodsSkuRequest {
	s.Type = &v
	return s
}

func (s *AddGoodsSkuRequest) SetSecondType(v string) *AddGoodsSkuRequest {
	s.SecondType = &v
	return s
}

func (s *AddGoodsSkuRequest) SetBrand(v string) *AddGoodsSkuRequest {
	s.Brand = &v
	return s
}

func (s *AddGoodsSkuRequest) SetModel(v string) *AddGoodsSkuRequest {
	s.Model = &v
	return s
}

func (s *AddGoodsSkuRequest) SetMarketPrice(v int64) *AddGoodsSkuRequest {
	s.MarketPrice = &v
	return s
}

func (s *AddGoodsSkuRequest) SetPhoneInfo(v *PhoneInfo) *AddGoodsSkuRequest {
	s.PhoneInfo = v
	return s
}

func (s *AddGoodsSkuRequest) SetComputerInfo(v *ComputerInfo) *AddGoodsSkuRequest {
	s.ComputerInfo = v
	return s
}

type AddGoodsSkuResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// SKU id
	SkuId *int64 `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
}

func (s AddGoodsSkuResponse) String() string {
	return tea.Prettify(s)
}

func (s AddGoodsSkuResponse) GoString() string {
	return s.String()
}

func (s *AddGoodsSkuResponse) SetReqMsgId(v string) *AddGoodsSkuResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddGoodsSkuResponse) SetResultCode(v string) *AddGoodsSkuResponse {
	s.ResultCode = &v
	return s
}

func (s *AddGoodsSkuResponse) SetResultMsg(v string) *AddGoodsSkuResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddGoodsSkuResponse) SetSkuId(v int64) *AddGoodsSkuResponse {
	s.SkuId = &v
	return s
}

type PushMeterdataOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 订单计费数据列表
	OrderPushList []*OrderPushInfo `json:"order_push_list,omitempty" xml:"order_push_list,omitempty" require:"true" type:"Repeated"`
}

func (s PushMeterdataOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s PushMeterdataOrderRequest) GoString() string {
	return s.String()
}

func (s *PushMeterdataOrderRequest) SetAuthToken(v string) *PushMeterdataOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *PushMeterdataOrderRequest) SetProductInstanceId(v string) *PushMeterdataOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushMeterdataOrderRequest) SetTenantId(v string) *PushMeterdataOrderRequest {
	s.TenantId = &v
	return s
}

func (s *PushMeterdataOrderRequest) SetOrderPushList(v []*OrderPushInfo) *PushMeterdataOrderRequest {
	s.OrderPushList = v
	return s
}

type PushMeterdataOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s PushMeterdataOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s PushMeterdataOrderResponse) GoString() string {
	return s.String()
}

func (s *PushMeterdataOrderResponse) SetReqMsgId(v string) *PushMeterdataOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushMeterdataOrderResponse) SetResultCode(v string) *PushMeterdataOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *PushMeterdataOrderResponse) SetResultMsg(v string) *PushMeterdataOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushMeterdataOrderResponse) SetSuccess(v bool) *PushMeterdataOrderResponse {
	s.Success = &v
	return s
}

type CreateDeviceDatamodelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据模型
	DataModel *string `json:"data_model,omitempty" xml:"data_model,omitempty" require:"true"`
	// 数据模型名称
	DataModelName *string `json:"data_model_name,omitempty" xml:"data_model_name,omitempty"`
	// 数据模型类别
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 用户自定义版本
	CustomerVersion *string `json:"customer_version,omitempty" xml:"customer_version,omitempty"`
	// 是否转化为物模型，默认false
	TransformThingModel *bool `json:"transform_thing_model,omitempty" xml:"transform_thing_model,omitempty"`
}

func (s CreateDeviceDatamodelRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDeviceDatamodelRequest) GoString() string {
	return s.String()
}

func (s *CreateDeviceDatamodelRequest) SetAuthToken(v string) *CreateDeviceDatamodelRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDeviceDatamodelRequest) SetProductInstanceId(v string) *CreateDeviceDatamodelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDeviceDatamodelRequest) SetDataModel(v string) *CreateDeviceDatamodelRequest {
	s.DataModel = &v
	return s
}

func (s *CreateDeviceDatamodelRequest) SetDataModelName(v string) *CreateDeviceDatamodelRequest {
	s.DataModelName = &v
	return s
}

func (s *CreateDeviceDatamodelRequest) SetBizType(v string) *CreateDeviceDatamodelRequest {
	s.BizType = &v
	return s
}

func (s *CreateDeviceDatamodelRequest) SetCustomerVersion(v string) *CreateDeviceDatamodelRequest {
	s.CustomerVersion = &v
	return s
}

func (s *CreateDeviceDatamodelRequest) SetTransformThingModel(v bool) *CreateDeviceDatamodelRequest {
	s.TransformThingModel = &v
	return s
}

type CreateDeviceDatamodelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据模型id
	DeviceDataModelId *string `json:"device_data_model_id,omitempty" xml:"device_data_model_id,omitempty"`
}

func (s CreateDeviceDatamodelResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDeviceDatamodelResponse) GoString() string {
	return s.String()
}

func (s *CreateDeviceDatamodelResponse) SetReqMsgId(v string) *CreateDeviceDatamodelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDeviceDatamodelResponse) SetResultCode(v string) *CreateDeviceDatamodelResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDeviceDatamodelResponse) SetResultMsg(v string) *CreateDeviceDatamodelResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDeviceDatamodelResponse) SetDeviceDataModelId(v string) *CreateDeviceDatamodelResponse {
	s.DeviceDataModelId = &v
	return s
}

type GetDeviceDatamodelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据模型Id
	DataModelId *string `json:"data_model_id,omitempty" xml:"data_model_id,omitempty" require:"true"`
}

func (s GetDeviceDatamodelRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDeviceDatamodelRequest) GoString() string {
	return s.String()
}

func (s *GetDeviceDatamodelRequest) SetAuthToken(v string) *GetDeviceDatamodelRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDeviceDatamodelRequest) SetProductInstanceId(v string) *GetDeviceDatamodelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetDeviceDatamodelRequest) SetDataModelId(v string) *GetDeviceDatamodelRequest {
	s.DataModelId = &v
	return s
}

type GetDeviceDatamodelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据模型
	DataModel *DataModel `json:"data_model,omitempty" xml:"data_model,omitempty"`
}

func (s GetDeviceDatamodelResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDeviceDatamodelResponse) GoString() string {
	return s.String()
}

func (s *GetDeviceDatamodelResponse) SetReqMsgId(v string) *GetDeviceDatamodelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDeviceDatamodelResponse) SetResultCode(v string) *GetDeviceDatamodelResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDeviceDatamodelResponse) SetResultMsg(v string) *GetDeviceDatamodelResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDeviceDatamodelResponse) SetDataModel(v *DataModel) *GetDeviceDatamodelResponse {
	s.DataModel = v
	return s
}

type ImportDeviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备Id
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 数据模型id
	DeviceDataModelId *string `json:"device_data_model_id,omitempty" xml:"device_data_model_id,omitempty" require:"true"`
	// 场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 设备imei
	DeviceImei *string `json:"device_imei,omitempty" xml:"device_imei,omitempty" require:"true"`
	// 设备名称
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty"`
	// 厂商名称
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty"`
	// 枚举值： SIGNED_DATA 、RAW_DATA ，默认填写 SIGNED_DATA（需要验签的设备）
	DeviceFeature *string `json:"device_feature,omitempty" xml:"device_feature,omitempty" require:"true"`
	// 设备类型编码，必填，对应资管平台中的设备类型
	//
	// 枚举值：
	//
	// 车辆 1000
	// 车辆 四轮车 1001
	// 车辆 四轮车 纯电四轮车 1002
	// 车辆 四轮车 混动四轮车 1003
	// 车辆 四轮车 燃油四轮车 1004
	// 车辆 两轮车 1011
	// 车辆 两轮车 两轮单车 1012
	// 车辆 两轮车 两轮助力车 1013
	//
	// 换电柜 2000
	// 换电柜 二轮车换电柜 2001
	//
	// 电池 3000
	// 电池 磷酸铁电池 3001
	// 电池 三元锂电池 3002
	//
	// 回收设备 4000
	//
	// 垃圾分类回收 4001
	//
	// 洗车机 5000
	// 通用计算设备	                6000
	// 	移动设备		        6001
	// 		智能手机	        6002
	// 		工业掌机	        6003
	// 		平板电脑	        6004
	// 	云设备		        6011
	// 		云计算服务器	6012
	DeviceTypeCode *int64 `json:"device_type_code,omitempty" xml:"device_type_code,omitempty" require:"true"`
	// 设备单价 单位：分
	InitialPrice *int64 `json:"initial_price,omitempty" xml:"initial_price,omitempty" require:"true"`
	// 出厂时间
	FactoryTime *string `json:"factory_time,omitempty" xml:"factory_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 投放时间
	ReleaseTime *string `json:"release_time,omitempty" xml:"release_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 设备类型，需要提前约定好
	DeviceTypeId *string `json:"device_type_id,omitempty" xml:"device_type_id,omitempty"`
	// 可信根派生公钥
	DevicePublicKey *string `json:"device_public_key,omitempty" xml:"device_public_key,omitempty"`
}

func (s ImportDeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportDeviceRequest) GoString() string {
	return s.String()
}

func (s *ImportDeviceRequest) SetAuthToken(v string) *ImportDeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportDeviceRequest) SetProductInstanceId(v string) *ImportDeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportDeviceRequest) SetDeviceId(v string) *ImportDeviceRequest {
	s.DeviceId = &v
	return s
}

func (s *ImportDeviceRequest) SetDeviceDataModelId(v string) *ImportDeviceRequest {
	s.DeviceDataModelId = &v
	return s
}

func (s *ImportDeviceRequest) SetScene(v string) *ImportDeviceRequest {
	s.Scene = &v
	return s
}

func (s *ImportDeviceRequest) SetDeviceImei(v string) *ImportDeviceRequest {
	s.DeviceImei = &v
	return s
}

func (s *ImportDeviceRequest) SetDeviceName(v string) *ImportDeviceRequest {
	s.DeviceName = &v
	return s
}

func (s *ImportDeviceRequest) SetCorpName(v string) *ImportDeviceRequest {
	s.CorpName = &v
	return s
}

func (s *ImportDeviceRequest) SetDeviceFeature(v string) *ImportDeviceRequest {
	s.DeviceFeature = &v
	return s
}

func (s *ImportDeviceRequest) SetDeviceTypeCode(v int64) *ImportDeviceRequest {
	s.DeviceTypeCode = &v
	return s
}

func (s *ImportDeviceRequest) SetInitialPrice(v int64) *ImportDeviceRequest {
	s.InitialPrice = &v
	return s
}

func (s *ImportDeviceRequest) SetFactoryTime(v string) *ImportDeviceRequest {
	s.FactoryTime = &v
	return s
}

func (s *ImportDeviceRequest) SetReleaseTime(v string) *ImportDeviceRequest {
	s.ReleaseTime = &v
	return s
}

func (s *ImportDeviceRequest) SetDeviceTypeId(v string) *ImportDeviceRequest {
	s.DeviceTypeId = &v
	return s
}

func (s *ImportDeviceRequest) SetDevicePublicKey(v string) *ImportDeviceRequest {
	s.DevicePublicKey = &v
	return s
}

type ImportDeviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上设备Id
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty"`
	// 可信设备ID
	TrustiotDeviceId *int64 `json:"trustiot_device_id,omitempty" xml:"trustiot_device_id,omitempty"`
}

func (s ImportDeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportDeviceResponse) GoString() string {
	return s.String()
}

func (s *ImportDeviceResponse) SetReqMsgId(v string) *ImportDeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportDeviceResponse) SetResultCode(v string) *ImportDeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportDeviceResponse) SetResultMsg(v string) *ImportDeviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportDeviceResponse) SetChainDeviceId(v string) *ImportDeviceResponse {
	s.ChainDeviceId = &v
	return s
}

func (s *ImportDeviceResponse) SetTrustiotDeviceId(v int64) *ImportDeviceResponse {
	s.TrustiotDeviceId = &v
	return s
}

type GetDeviceBychainidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链上设备Id
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty" require:"true"`
}

func (s GetDeviceBychainidRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDeviceBychainidRequest) GoString() string {
	return s.String()
}

func (s *GetDeviceBychainidRequest) SetAuthToken(v string) *GetDeviceBychainidRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDeviceBychainidRequest) SetProductInstanceId(v string) *GetDeviceBychainidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetDeviceBychainidRequest) SetChainDeviceId(v string) *GetDeviceBychainidRequest {
	s.ChainDeviceId = &v
	return s
}

type GetDeviceBychainidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 设备详情
	Device *Device `json:"device,omitempty" xml:"device,omitempty"`
}

func (s GetDeviceBychainidResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDeviceBychainidResponse) GoString() string {
	return s.String()
}

func (s *GetDeviceBychainidResponse) SetReqMsgId(v string) *GetDeviceBychainidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDeviceBychainidResponse) SetResultCode(v string) *GetDeviceBychainidResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDeviceBychainidResponse) SetResultMsg(v string) *GetDeviceBychainidResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDeviceBychainidResponse) SetDevice(v *Device) *GetDeviceBychainidResponse {
	s.Device = v
	return s
}

type GetDeviceBydeviceidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备id集合
	DeviceIdList []*string `json:"device_id_list,omitempty" xml:"device_id_list,omitempty" require:"true" type:"Repeated"`
	// 场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
}

func (s GetDeviceBydeviceidRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDeviceBydeviceidRequest) GoString() string {
	return s.String()
}

func (s *GetDeviceBydeviceidRequest) SetAuthToken(v string) *GetDeviceBydeviceidRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDeviceBydeviceidRequest) SetProductInstanceId(v string) *GetDeviceBydeviceidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetDeviceBydeviceidRequest) SetDeviceIdList(v []*string) *GetDeviceBydeviceidRequest {
	s.DeviceIdList = v
	return s
}

func (s *GetDeviceBydeviceidRequest) SetScene(v string) *GetDeviceBydeviceidRequest {
	s.Scene = &v
	return s
}

type GetDeviceBydeviceidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 设备详情
	DeviceList []*Device `json:"device_list,omitempty" xml:"device_list,omitempty" type:"Repeated"`
	// 设备信息不存在的deviceid集合
	MissDeviceIdList []*string `json:"miss_device_id_list,omitempty" xml:"miss_device_id_list,omitempty" type:"Repeated"`
	// 成功获取到设备信息的deviceid集合
	SuccessDeviceIdList []*string `json:"success_device_id_list,omitempty" xml:"success_device_id_list,omitempty" type:"Repeated"`
}

func (s GetDeviceBydeviceidResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDeviceBydeviceidResponse) GoString() string {
	return s.String()
}

func (s *GetDeviceBydeviceidResponse) SetReqMsgId(v string) *GetDeviceBydeviceidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDeviceBydeviceidResponse) SetResultCode(v string) *GetDeviceBydeviceidResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDeviceBydeviceidResponse) SetResultMsg(v string) *GetDeviceBydeviceidResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDeviceBydeviceidResponse) SetDeviceList(v []*Device) *GetDeviceBydeviceidResponse {
	s.DeviceList = v
	return s
}

func (s *GetDeviceBydeviceidResponse) SetMissDeviceIdList(v []*string) *GetDeviceBydeviceidResponse {
	s.MissDeviceIdList = v
	return s
}

func (s *GetDeviceBydeviceidResponse) SetSuccessDeviceIdList(v []*string) *GetDeviceBydeviceidResponse {
	s.SuccessDeviceIdList = v
	return s
}

type ListDeviceBysceneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
}

func (s ListDeviceBysceneRequest) String() string {
	return tea.Prettify(s)
}

func (s ListDeviceBysceneRequest) GoString() string {
	return s.String()
}

func (s *ListDeviceBysceneRequest) SetAuthToken(v string) *ListDeviceBysceneRequest {
	s.AuthToken = &v
	return s
}

func (s *ListDeviceBysceneRequest) SetProductInstanceId(v string) *ListDeviceBysceneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListDeviceBysceneRequest) SetScene(v string) *ListDeviceBysceneRequest {
	s.Scene = &v
	return s
}

type ListDeviceBysceneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 设备列表
	DeviceList []*Device `json:"device_list,omitempty" xml:"device_list,omitempty" type:"Repeated"`
}

func (s ListDeviceBysceneResponse) String() string {
	return tea.Prettify(s)
}

func (s ListDeviceBysceneResponse) GoString() string {
	return s.String()
}

func (s *ListDeviceBysceneResponse) SetReqMsgId(v string) *ListDeviceBysceneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListDeviceBysceneResponse) SetResultCode(v string) *ListDeviceBysceneResponse {
	s.ResultCode = &v
	return s
}

func (s *ListDeviceBysceneResponse) SetResultMsg(v string) *ListDeviceBysceneResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListDeviceBysceneResponse) SetDeviceList(v []*Device) *ListDeviceBysceneResponse {
	s.DeviceList = v
	return s
}

type UpdateDeviceInfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链上设备Id
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty" require:"true"`
	// 设备imei号
	DeviceImei *string `json:"device_imei,omitempty" xml:"device_imei,omitempty"`
	// 设备数据模型Id
	//
	//
	DataModelId *string `json:"data_model_id,omitempty" xml:"data_model_id,omitempty"`
	// 设备ICCID
	//
	//
	DeviceIccid *string `json:"device_iccid,omitempty" xml:"device_iccid,omitempty"`
	// deviceTypeCode 枚举
	//
	// 车辆: 1000
	// 四轮车: 1001
	// 纯电四轮车:1002
	// 混动四轮车 1003
	// 燃油四轮车 : 1004
	//
	// 两轮车:1011
	// 两轮单车:1012
	// 两轮助力车:1013
	//
	// 换电柜 :2000
	// 二轮车换电柜:2001
	//
	// 电池 :3000
	// 磷酸铁电池:3001
	// 三元锂电池:3002
	//
	// 回收设备:4000
	// 垃圾分类回收:4001
	//
	// 洗车机 :5000
	// 通用计算设备	                6000
	// 	移动设备		        6001
	// 		智能手机	        6002
	// 		工业掌机	        6003
	// 		平板电脑	        6004
	// 	云设备		        6011
	// 		云计算服务器	6012
	DeviceTypeCode *int64 `json:"device_type_code,omitempty" xml:"device_type_code,omitempty"`
	// 设备单价 单位：分
	InitialPrice *int64 `json:"initial_price,omitempty" xml:"initial_price,omitempty"`
	// 出厂时间
	FactoryTime *string `json:"factory_time,omitempty" xml:"factory_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 投放时间
	ReleaseTime *string `json:"release_time,omitempty" xml:"release_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 设备型号
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty"`
	// 额外信息
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 资产所有人标识（统一社会信用代码）
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty"`
	// 资产所有人名称
	OwnerName *string `json:"owner_name,omitempty" xml:"owner_name,omitempty"`
}

func (s UpdateDeviceInfoRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateDeviceInfoRequest) GoString() string {
	return s.String()
}

func (s *UpdateDeviceInfoRequest) SetAuthToken(v string) *UpdateDeviceInfoRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateDeviceInfoRequest) SetProductInstanceId(v string) *UpdateDeviceInfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateDeviceInfoRequest) SetChainDeviceId(v string) *UpdateDeviceInfoRequest {
	s.ChainDeviceId = &v
	return s
}

func (s *UpdateDeviceInfoRequest) SetDeviceImei(v string) *UpdateDeviceInfoRequest {
	s.DeviceImei = &v
	return s
}

func (s *UpdateDeviceInfoRequest) SetDataModelId(v string) *UpdateDeviceInfoRequest {
	s.DataModelId = &v
	return s
}

func (s *UpdateDeviceInfoRequest) SetDeviceIccid(v string) *UpdateDeviceInfoRequest {
	s.DeviceIccid = &v
	return s
}

func (s *UpdateDeviceInfoRequest) SetDeviceTypeCode(v int64) *UpdateDeviceInfoRequest {
	s.DeviceTypeCode = &v
	return s
}

func (s *UpdateDeviceInfoRequest) SetInitialPrice(v int64) *UpdateDeviceInfoRequest {
	s.InitialPrice = &v
	return s
}

func (s *UpdateDeviceInfoRequest) SetFactoryTime(v string) *UpdateDeviceInfoRequest {
	s.FactoryTime = &v
	return s
}

func (s *UpdateDeviceInfoRequest) SetReleaseTime(v string) *UpdateDeviceInfoRequest {
	s.ReleaseTime = &v
	return s
}

func (s *UpdateDeviceInfoRequest) SetDeviceName(v string) *UpdateDeviceInfoRequest {
	s.DeviceName = &v
	return s
}

func (s *UpdateDeviceInfoRequest) SetExtraInfo(v string) *UpdateDeviceInfoRequest {
	s.ExtraInfo = &v
	return s
}

func (s *UpdateDeviceInfoRequest) SetOwner(v string) *UpdateDeviceInfoRequest {
	s.Owner = &v
	return s
}

func (s *UpdateDeviceInfoRequest) SetOwnerName(v string) *UpdateDeviceInfoRequest {
	s.OwnerName = &v
	return s
}

type UpdateDeviceInfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateDeviceInfoResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateDeviceInfoResponse) GoString() string {
	return s.String()
}

func (s *UpdateDeviceInfoResponse) SetReqMsgId(v string) *UpdateDeviceInfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateDeviceInfoResponse) SetResultCode(v string) *UpdateDeviceInfoResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateDeviceInfoResponse) SetResultMsg(v string) *UpdateDeviceInfoResponse {
	s.ResultMsg = &v
	return s
}

type CreateDistributedeviceBydeviceidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 厂商名
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty"`
	// 数据模型Id
	DeviceDataModelId *string `json:"device_data_model_id,omitempty" xml:"device_data_model_id,omitempty" require:"true"`
	// 设备Id
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 设备imei号
	DeviceImei *string `json:"device_imei,omitempty" xml:"device_imei,omitempty"`
	// 设备名称
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty"`
	// 场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 枚举值： SIGNED_DATA 、RAW_DATA ，默认填写 SIGNED_DATA（需要验签的设备）
	DeviceFeature *string `json:"device_feature,omitempty" xml:"device_feature,omitempty"`
	// 当用已发行设备发行时返回已发行id或返回错误
	WithExistDeviceId *bool `json:"with_exist_device_id,omitempty" xml:"with_exist_device_id,omitempty"`
	// 设备类型编码
	DeviceTypeCode *int64 `json:"device_type_code,omitempty" xml:"device_type_code,omitempty"`
	// 设备单价 单位：分
	InitialPrice *int64 `json:"initial_price,omitempty" xml:"initial_price,omitempty"`
	// 出厂时间
	FactoryTime *string `json:"factory_time,omitempty" xml:"factory_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 投放时间
	ReleaseTime *string `json:"release_time,omitempty" xml:"release_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 额外信息
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 资产所有人标识（统一社会信用代码）
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty"`
	// 资产所有人名称
	OwnerName *string `json:"owner_name,omitempty" xml:"owner_name,omitempty"`
}

func (s CreateDistributedeviceBydeviceidRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDistributedeviceBydeviceidRequest) GoString() string {
	return s.String()
}

func (s *CreateDistributedeviceBydeviceidRequest) SetAuthToken(v string) *CreateDistributedeviceBydeviceidRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidRequest) SetProductInstanceId(v string) *CreateDistributedeviceBydeviceidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidRequest) SetCorpName(v string) *CreateDistributedeviceBydeviceidRequest {
	s.CorpName = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidRequest) SetDeviceDataModelId(v string) *CreateDistributedeviceBydeviceidRequest {
	s.DeviceDataModelId = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidRequest) SetDeviceId(v string) *CreateDistributedeviceBydeviceidRequest {
	s.DeviceId = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidRequest) SetDeviceImei(v string) *CreateDistributedeviceBydeviceidRequest {
	s.DeviceImei = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidRequest) SetDeviceName(v string) *CreateDistributedeviceBydeviceidRequest {
	s.DeviceName = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidRequest) SetScene(v string) *CreateDistributedeviceBydeviceidRequest {
	s.Scene = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidRequest) SetDeviceFeature(v string) *CreateDistributedeviceBydeviceidRequest {
	s.DeviceFeature = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidRequest) SetWithExistDeviceId(v bool) *CreateDistributedeviceBydeviceidRequest {
	s.WithExistDeviceId = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidRequest) SetDeviceTypeCode(v int64) *CreateDistributedeviceBydeviceidRequest {
	s.DeviceTypeCode = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidRequest) SetInitialPrice(v int64) *CreateDistributedeviceBydeviceidRequest {
	s.InitialPrice = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidRequest) SetFactoryTime(v string) *CreateDistributedeviceBydeviceidRequest {
	s.FactoryTime = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidRequest) SetReleaseTime(v string) *CreateDistributedeviceBydeviceidRequest {
	s.ReleaseTime = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidRequest) SetExtraInfo(v string) *CreateDistributedeviceBydeviceidRequest {
	s.ExtraInfo = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidRequest) SetOwner(v string) *CreateDistributedeviceBydeviceidRequest {
	s.Owner = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidRequest) SetOwnerName(v string) *CreateDistributedeviceBydeviceidRequest {
	s.OwnerName = &v
	return s
}

type CreateDistributedeviceBydeviceidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上设备Id
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty"`
	// 发行设备Id
	DistributeDeviceId *string `json:"distribute_device_id,omitempty" xml:"distribute_device_id,omitempty"`
	// 可信设备ID
	TrustiotDeviceId *int64 `json:"trustiot_device_id,omitempty" xml:"trustiot_device_id,omitempty"`
}

func (s CreateDistributedeviceBydeviceidResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDistributedeviceBydeviceidResponse) GoString() string {
	return s.String()
}

func (s *CreateDistributedeviceBydeviceidResponse) SetReqMsgId(v string) *CreateDistributedeviceBydeviceidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidResponse) SetResultCode(v string) *CreateDistributedeviceBydeviceidResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidResponse) SetResultMsg(v string) *CreateDistributedeviceBydeviceidResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidResponse) SetChainDeviceId(v string) *CreateDistributedeviceBydeviceidResponse {
	s.ChainDeviceId = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidResponse) SetDistributeDeviceId(v string) *CreateDistributedeviceBydeviceidResponse {
	s.DistributeDeviceId = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidResponse) SetTrustiotDeviceId(v int64) *CreateDistributedeviceBydeviceidResponse {
	s.TrustiotDeviceId = &v
	return s
}

type CreateDistributedeviceBychainidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链上设备Id
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty" require:"true"`
}

func (s CreateDistributedeviceBychainidRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDistributedeviceBychainidRequest) GoString() string {
	return s.String()
}

func (s *CreateDistributedeviceBychainidRequest) SetAuthToken(v string) *CreateDistributedeviceBychainidRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDistributedeviceBychainidRequest) SetProductInstanceId(v string) *CreateDistributedeviceBychainidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDistributedeviceBychainidRequest) SetChainDeviceId(v string) *CreateDistributedeviceBychainidRequest {
	s.ChainDeviceId = &v
	return s
}

type CreateDistributedeviceBychainidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发行设备Id
	DistributeDeviceId *string `json:"distribute_device_id,omitempty" xml:"distribute_device_id,omitempty"`
}

func (s CreateDistributedeviceBychainidResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDistributedeviceBychainidResponse) GoString() string {
	return s.String()
}

func (s *CreateDistributedeviceBychainidResponse) SetReqMsgId(v string) *CreateDistributedeviceBychainidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDistributedeviceBychainidResponse) SetResultCode(v string) *CreateDistributedeviceBychainidResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDistributedeviceBychainidResponse) SetResultMsg(v string) *CreateDistributedeviceBychainidResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDistributedeviceBychainidResponse) SetDistributeDeviceId(v string) *CreateDistributedeviceBychainidResponse {
	s.DistributeDeviceId = &v
	return s
}

type ReplaceDistributedeviceBychainidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链上设备Id
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty" require:"true"`
	// 发行设备Id
	DistributeDeviceId *string `json:"distribute_device_id,omitempty" xml:"distribute_device_id,omitempty" require:"true"`
}

func (s ReplaceDistributedeviceBychainidRequest) String() string {
	return tea.Prettify(s)
}

func (s ReplaceDistributedeviceBychainidRequest) GoString() string {
	return s.String()
}

func (s *ReplaceDistributedeviceBychainidRequest) SetAuthToken(v string) *ReplaceDistributedeviceBychainidRequest {
	s.AuthToken = &v
	return s
}

func (s *ReplaceDistributedeviceBychainidRequest) SetProductInstanceId(v string) *ReplaceDistributedeviceBychainidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ReplaceDistributedeviceBychainidRequest) SetChainDeviceId(v string) *ReplaceDistributedeviceBychainidRequest {
	s.ChainDeviceId = &v
	return s
}

func (s *ReplaceDistributedeviceBychainidRequest) SetDistributeDeviceId(v string) *ReplaceDistributedeviceBychainidRequest {
	s.DistributeDeviceId = &v
	return s
}

type ReplaceDistributedeviceBychainidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ReplaceDistributedeviceBychainidResponse) String() string {
	return tea.Prettify(s)
}

func (s ReplaceDistributedeviceBychainidResponse) GoString() string {
	return s.String()
}

func (s *ReplaceDistributedeviceBychainidResponse) SetReqMsgId(v string) *ReplaceDistributedeviceBychainidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ReplaceDistributedeviceBychainidResponse) SetResultCode(v string) *ReplaceDistributedeviceBychainidResponse {
	s.ResultCode = &v
	return s
}

func (s *ReplaceDistributedeviceBychainidResponse) SetResultMsg(v string) *ReplaceDistributedeviceBychainidResponse {
	s.ResultMsg = &v
	return s
}

type SendCollectorBychainidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链上设备Id
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty" require:"true"`
	// 收集数据
	CollectContentList []*CollectContent `json:"collect_content_list,omitempty" xml:"collect_content_list,omitempty" require:"true" type:"Repeated"`
	// 随机数，防重放
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty" require:"true"`
	// 数据模型Id
	DataModelId *string `json:"data_model_id,omitempty" xml:"data_model_id,omitempty"`
}

func (s SendCollectorBychainidRequest) String() string {
	return tea.Prettify(s)
}

func (s SendCollectorBychainidRequest) GoString() string {
	return s.String()
}

func (s *SendCollectorBychainidRequest) SetAuthToken(v string) *SendCollectorBychainidRequest {
	s.AuthToken = &v
	return s
}

func (s *SendCollectorBychainidRequest) SetProductInstanceId(v string) *SendCollectorBychainidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendCollectorBychainidRequest) SetChainDeviceId(v string) *SendCollectorBychainidRequest {
	s.ChainDeviceId = &v
	return s
}

func (s *SendCollectorBychainidRequest) SetCollectContentList(v []*CollectContent) *SendCollectorBychainidRequest {
	s.CollectContentList = v
	return s
}

func (s *SendCollectorBychainidRequest) SetNonce(v string) *SendCollectorBychainidRequest {
	s.Nonce = &v
	return s
}

func (s *SendCollectorBychainidRequest) SetDataModelId(v string) *SendCollectorBychainidRequest {
	s.DataModelId = &v
	return s
}

type SendCollectorBychainidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 收集数据返回的上链结果
	ResultList []*SendCollectorResult `json:"result_list,omitempty" xml:"result_list,omitempty" type:"Repeated"`
}

func (s SendCollectorBychainidResponse) String() string {
	return tea.Prettify(s)
}

func (s SendCollectorBychainidResponse) GoString() string {
	return s.String()
}

func (s *SendCollectorBychainidResponse) SetReqMsgId(v string) *SendCollectorBychainidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendCollectorBychainidResponse) SetResultCode(v string) *SendCollectorBychainidResponse {
	s.ResultCode = &v
	return s
}

func (s *SendCollectorBychainidResponse) SetResultMsg(v string) *SendCollectorBychainidResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendCollectorBychainidResponse) SetResultList(v []*SendCollectorResult) *SendCollectorBychainidResponse {
	s.ResultList = v
	return s
}

type GetDistributedeviceBychainidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 发行设备Id
	ChainIdList []*string `json:"chain_id_list,omitempty" xml:"chain_id_list,omitempty" require:"true" type:"Repeated"`
}

func (s GetDistributedeviceBychainidRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDistributedeviceBychainidRequest) GoString() string {
	return s.String()
}

func (s *GetDistributedeviceBychainidRequest) SetAuthToken(v string) *GetDistributedeviceBychainidRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDistributedeviceBychainidRequest) SetProductInstanceId(v string) *GetDistributedeviceBychainidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetDistributedeviceBychainidRequest) SetChainIdList(v []*string) *GetDistributedeviceBychainidRequest {
	s.ChainIdList = v
	return s
}

type GetDistributedeviceBychainidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发行设备
	DistributeDeviceList []*DistributeDevice `json:"distribute_device_list,omitempty" xml:"distribute_device_list,omitempty" type:"Repeated"`
}

func (s GetDistributedeviceBychainidResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDistributedeviceBychainidResponse) GoString() string {
	return s.String()
}

func (s *GetDistributedeviceBychainidResponse) SetReqMsgId(v string) *GetDistributedeviceBychainidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDistributedeviceBychainidResponse) SetResultCode(v string) *GetDistributedeviceBychainidResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDistributedeviceBychainidResponse) SetResultMsg(v string) *GetDistributedeviceBychainidResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDistributedeviceBychainidResponse) SetDistributeDeviceList(v []*DistributeDevice) *GetDistributedeviceBychainidResponse {
	s.DistributeDeviceList = v
	return s
}

type ListDistributedeviceBysceneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
}

func (s ListDistributedeviceBysceneRequest) String() string {
	return tea.Prettify(s)
}

func (s ListDistributedeviceBysceneRequest) GoString() string {
	return s.String()
}

func (s *ListDistributedeviceBysceneRequest) SetAuthToken(v string) *ListDistributedeviceBysceneRequest {
	s.AuthToken = &v
	return s
}

func (s *ListDistributedeviceBysceneRequest) SetProductInstanceId(v string) *ListDistributedeviceBysceneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListDistributedeviceBysceneRequest) SetScene(v string) *ListDistributedeviceBysceneRequest {
	s.Scene = &v
	return s
}

type ListDistributedeviceBysceneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发行设备
	DistributeDeviceList []*DistributeDevice `json:"distribute_device_list,omitempty" xml:"distribute_device_list,omitempty" type:"Repeated"`
}

func (s ListDistributedeviceBysceneResponse) String() string {
	return tea.Prettify(s)
}

func (s ListDistributedeviceBysceneResponse) GoString() string {
	return s.String()
}

func (s *ListDistributedeviceBysceneResponse) SetReqMsgId(v string) *ListDistributedeviceBysceneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListDistributedeviceBysceneResponse) SetResultCode(v string) *ListDistributedeviceBysceneResponse {
	s.ResultCode = &v
	return s
}

func (s *ListDistributedeviceBysceneResponse) SetResultMsg(v string) *ListDistributedeviceBysceneResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListDistributedeviceBysceneResponse) SetDistributeDeviceList(v []*DistributeDevice) *ListDistributedeviceBysceneResponse {
	s.DistributeDeviceList = v
	return s
}

type CreateConsumerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 消费者名称
	ConsumerName *string `json:"consumer_name,omitempty" xml:"consumer_name,omitempty" require:"true"`
}

func (s CreateConsumerRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateConsumerRequest) GoString() string {
	return s.String()
}

func (s *CreateConsumerRequest) SetAuthToken(v string) *CreateConsumerRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateConsumerRequest) SetProductInstanceId(v string) *CreateConsumerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateConsumerRequest) SetConsumerName(v string) *CreateConsumerRequest {
	s.ConsumerName = &v
	return s
}

type CreateConsumerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 消费者Id
	ConsumerId *string `json:"consumer_id,omitempty" xml:"consumer_id,omitempty"`
}

func (s CreateConsumerResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateConsumerResponse) GoString() string {
	return s.String()
}

func (s *CreateConsumerResponse) SetReqMsgId(v string) *CreateConsumerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateConsumerResponse) SetResultCode(v string) *CreateConsumerResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateConsumerResponse) SetResultMsg(v string) *CreateConsumerResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateConsumerResponse) SetConsumerId(v string) *CreateConsumerResponse {
	s.ConsumerId = &v
	return s
}

type SetConsumerSubscribeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 消费者Id
	ConsumerId *string `json:"consumer_id,omitempty" xml:"consumer_id,omitempty" require:"true"`
	// 订阅的发行设备Id列表
	DistributeDeviceIdList []*string `json:"distribute_device_id_list,omitempty" xml:"distribute_device_id_list,omitempty" require:"true" type:"Repeated"`
}

func (s SetConsumerSubscribeRequest) String() string {
	return tea.Prettify(s)
}

func (s SetConsumerSubscribeRequest) GoString() string {
	return s.String()
}

func (s *SetConsumerSubscribeRequest) SetAuthToken(v string) *SetConsumerSubscribeRequest {
	s.AuthToken = &v
	return s
}

func (s *SetConsumerSubscribeRequest) SetProductInstanceId(v string) *SetConsumerSubscribeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SetConsumerSubscribeRequest) SetConsumerId(v string) *SetConsumerSubscribeRequest {
	s.ConsumerId = &v
	return s
}

func (s *SetConsumerSubscribeRequest) SetDistributeDeviceIdList(v []*string) *SetConsumerSubscribeRequest {
	s.DistributeDeviceIdList = v
	return s
}

type SetConsumerSubscribeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订阅的发行设备列表
	DistributeDeviceList []*string `json:"distribute_device_list,omitempty" xml:"distribute_device_list,omitempty" type:"Repeated"`
}

func (s SetConsumerSubscribeResponse) String() string {
	return tea.Prettify(s)
}

func (s SetConsumerSubscribeResponse) GoString() string {
	return s.String()
}

func (s *SetConsumerSubscribeResponse) SetReqMsgId(v string) *SetConsumerSubscribeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SetConsumerSubscribeResponse) SetResultCode(v string) *SetConsumerSubscribeResponse {
	s.ResultCode = &v
	return s
}

func (s *SetConsumerSubscribeResponse) SetResultMsg(v string) *SetConsumerSubscribeResponse {
	s.ResultMsg = &v
	return s
}

func (s *SetConsumerSubscribeResponse) SetDistributeDeviceList(v []*string) *SetConsumerSubscribeResponse {
	s.DistributeDeviceList = v
	return s
}

type SetConsumerUnsubscribeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 消费者id
	ConsumerId *string `json:"consumer_id,omitempty" xml:"consumer_id,omitempty" require:"true"`
	// 发型设备Id列表
	DistributeDeviceIdList []*string `json:"distribute_device_id_list,omitempty" xml:"distribute_device_id_list,omitempty" require:"true" type:"Repeated"`
}

func (s SetConsumerUnsubscribeRequest) String() string {
	return tea.Prettify(s)
}

func (s SetConsumerUnsubscribeRequest) GoString() string {
	return s.String()
}

func (s *SetConsumerUnsubscribeRequest) SetAuthToken(v string) *SetConsumerUnsubscribeRequest {
	s.AuthToken = &v
	return s
}

func (s *SetConsumerUnsubscribeRequest) SetProductInstanceId(v string) *SetConsumerUnsubscribeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SetConsumerUnsubscribeRequest) SetConsumerId(v string) *SetConsumerUnsubscribeRequest {
	s.ConsumerId = &v
	return s
}

func (s *SetConsumerUnsubscribeRequest) SetDistributeDeviceIdList(v []*string) *SetConsumerUnsubscribeRequest {
	s.DistributeDeviceIdList = v
	return s
}

type SetConsumerUnsubscribeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发行设备列表
	DistributeDeviceList []*string `json:"distribute_device_list,omitempty" xml:"distribute_device_list,omitempty" type:"Repeated"`
}

func (s SetConsumerUnsubscribeResponse) String() string {
	return tea.Prettify(s)
}

func (s SetConsumerUnsubscribeResponse) GoString() string {
	return s.String()
}

func (s *SetConsumerUnsubscribeResponse) SetReqMsgId(v string) *SetConsumerUnsubscribeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SetConsumerUnsubscribeResponse) SetResultCode(v string) *SetConsumerUnsubscribeResponse {
	s.ResultCode = &v
	return s
}

func (s *SetConsumerUnsubscribeResponse) SetResultMsg(v string) *SetConsumerUnsubscribeResponse {
	s.ResultMsg = &v
	return s
}

func (s *SetConsumerUnsubscribeResponse) SetDistributeDeviceList(v []*string) *SetConsumerUnsubscribeResponse {
	s.DistributeDeviceList = v
	return s
}

type PullConsumerDatasourceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 消费者id
	ConsumerId *string `json:"consumer_id,omitempty" xml:"consumer_id,omitempty" require:"true"`
	// 分页游标
	Cursor *string `json:"cursor,omitempty" xml:"cursor,omitempty" require:"true"`
	// 获取的时间范围
	TimeSpan []*string `json:"time_span,omitempty" xml:"time_span,omitempty" type:"Repeated"`
	// 类型：DEVICE、PERIPHERAL、ALL 默认为 ALL
	DeviceType *string `json:"device_type,omitempty" xml:"device_type,omitempty"`
}

func (s PullConsumerDatasourceRequest) String() string {
	return tea.Prettify(s)
}

func (s PullConsumerDatasourceRequest) GoString() string {
	return s.String()
}

func (s *PullConsumerDatasourceRequest) SetAuthToken(v string) *PullConsumerDatasourceRequest {
	s.AuthToken = &v
	return s
}

func (s *PullConsumerDatasourceRequest) SetProductInstanceId(v string) *PullConsumerDatasourceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PullConsumerDatasourceRequest) SetConsumerId(v string) *PullConsumerDatasourceRequest {
	s.ConsumerId = &v
	return s
}

func (s *PullConsumerDatasourceRequest) SetCursor(v string) *PullConsumerDatasourceRequest {
	s.Cursor = &v
	return s
}

func (s *PullConsumerDatasourceRequest) SetTimeSpan(v []*string) *PullConsumerDatasourceRequest {
	s.TimeSpan = v
	return s
}

func (s *PullConsumerDatasourceRequest) SetDeviceType(v string) *PullConsumerDatasourceRequest {
	s.DeviceType = &v
	return s
}

type PullConsumerDatasourceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分页游标
	Cursor *string `json:"cursor,omitempty" xml:"cursor,omitempty"`
	// 数据包列表
	DataPackageList []*DistributeDataPackage `json:"data_package_list,omitempty" xml:"data_package_list,omitempty" type:"Repeated"`
}

func (s PullConsumerDatasourceResponse) String() string {
	return tea.Prettify(s)
}

func (s PullConsumerDatasourceResponse) GoString() string {
	return s.String()
}

func (s *PullConsumerDatasourceResponse) SetReqMsgId(v string) *PullConsumerDatasourceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PullConsumerDatasourceResponse) SetResultCode(v string) *PullConsumerDatasourceResponse {
	s.ResultCode = &v
	return s
}

func (s *PullConsumerDatasourceResponse) SetResultMsg(v string) *PullConsumerDatasourceResponse {
	s.ResultMsg = &v
	return s
}

func (s *PullConsumerDatasourceResponse) SetCursor(v string) *PullConsumerDatasourceResponse {
	s.Cursor = &v
	return s
}

func (s *PullConsumerDatasourceResponse) SetDataPackageList(v []*DistributeDataPackage) *PullConsumerDatasourceResponse {
	s.DataPackageList = v
	return s
}

type GetDistributedeviceBydeviceidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备Id
	DeviceIdList []*string `json:"device_id_list,omitempty" xml:"device_id_list,omitempty" require:"true" type:"Repeated"`
	// 场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
}

func (s GetDistributedeviceBydeviceidRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDistributedeviceBydeviceidRequest) GoString() string {
	return s.String()
}

func (s *GetDistributedeviceBydeviceidRequest) SetAuthToken(v string) *GetDistributedeviceBydeviceidRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDistributedeviceBydeviceidRequest) SetProductInstanceId(v string) *GetDistributedeviceBydeviceidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetDistributedeviceBydeviceidRequest) SetDeviceIdList(v []*string) *GetDistributedeviceBydeviceidRequest {
	s.DeviceIdList = v
	return s
}

func (s *GetDistributedeviceBydeviceidRequest) SetScene(v string) *GetDistributedeviceBydeviceidRequest {
	s.Scene = &v
	return s
}

type GetDistributedeviceBydeviceidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发行设备
	DistributeDeviceList []*DistributeDevice `json:"distribute_device_list,omitempty" xml:"distribute_device_list,omitempty" type:"Repeated"`
	// 发行设备信息不存在的deviceid集合
	MissDeviceIdList []*string `json:"miss_device_id_list,omitempty" xml:"miss_device_id_list,omitempty" type:"Repeated"`
	// 成功获取到发行设备信息的deviceid集合
	SuccessDeviceIdList []*string `json:"success_device_id_list,omitempty" xml:"success_device_id_list,omitempty" type:"Repeated"`
}

func (s GetDistributedeviceBydeviceidResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDistributedeviceBydeviceidResponse) GoString() string {
	return s.String()
}

func (s *GetDistributedeviceBydeviceidResponse) SetReqMsgId(v string) *GetDistributedeviceBydeviceidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDistributedeviceBydeviceidResponse) SetResultCode(v string) *GetDistributedeviceBydeviceidResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDistributedeviceBydeviceidResponse) SetResultMsg(v string) *GetDistributedeviceBydeviceidResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDistributedeviceBydeviceidResponse) SetDistributeDeviceList(v []*DistributeDevice) *GetDistributedeviceBydeviceidResponse {
	s.DistributeDeviceList = v
	return s
}

func (s *GetDistributedeviceBydeviceidResponse) SetMissDeviceIdList(v []*string) *GetDistributedeviceBydeviceidResponse {
	s.MissDeviceIdList = v
	return s
}

func (s *GetDistributedeviceBydeviceidResponse) SetSuccessDeviceIdList(v []*string) *GetDistributedeviceBydeviceidResponse {
	s.SuccessDeviceIdList = v
	return s
}

type GetDistributedeviceBydisidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 发行设备id列表
	DistributeDeviceIdList []*string `json:"distribute_device_id_list,omitempty" xml:"distribute_device_id_list,omitempty" require:"true" type:"Repeated"`
}

func (s GetDistributedeviceBydisidRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDistributedeviceBydisidRequest) GoString() string {
	return s.String()
}

func (s *GetDistributedeviceBydisidRequest) SetAuthToken(v string) *GetDistributedeviceBydisidRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDistributedeviceBydisidRequest) SetProductInstanceId(v string) *GetDistributedeviceBydisidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetDistributedeviceBydisidRequest) SetDistributeDeviceIdList(v []*string) *GetDistributedeviceBydisidRequest {
	s.DistributeDeviceIdList = v
	return s
}

type GetDistributedeviceBydisidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发行设备列表
	DistributeDeviceList []*DistributeDevice `json:"distribute_device_list,omitempty" xml:"distribute_device_list,omitempty" type:"Repeated"`
}

func (s GetDistributedeviceBydisidResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDistributedeviceBydisidResponse) GoString() string {
	return s.String()
}

func (s *GetDistributedeviceBydisidResponse) SetReqMsgId(v string) *GetDistributedeviceBydisidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDistributedeviceBydisidResponse) SetResultCode(v string) *GetDistributedeviceBydisidResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDistributedeviceBydisidResponse) SetResultMsg(v string) *GetDistributedeviceBydisidResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDistributedeviceBydisidResponse) SetDistributeDeviceList(v []*DistributeDevice) *GetDistributedeviceBydisidResponse {
	s.DistributeDeviceList = v
	return s
}

type ImportPeripheralRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 厂商名称
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty"`
	// 数据模型id
	PeripheralDataModelId *string `json:"peripheral_data_model_id,omitempty" xml:"peripheral_data_model_id,omitempty" require:"true"`
	// 外围设备ID
	PeripheralId *string `json:"peripheral_id,omitempty" xml:"peripheral_id,omitempty" require:"true"`
	// 外围设备名称
	PeripheralName *string `json:"peripheral_name,omitempty" xml:"peripheral_name,omitempty"`
	// 场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 设备类型编码，必填，对应资管平台中的设备类型
	//
	// 枚举值：
	//
	// 车辆 1000
	// 车辆 四轮车 1001
	// 车辆 四轮车 纯电四轮车 1002
	// 车辆 四轮车 混动四轮车 1003
	// 车辆 四轮车 燃油四轮车 1004
	// 车辆 两轮车 1011
	// 车辆 两轮车 两轮单车 1012
	// 车辆 两轮车 两轮助力车 1013
	//
	// 换电柜 2000
	// 换电柜 二轮车换电柜 2001
	//
	// 电池 3000
	// 电池 磷酸铁电池 3001
	// 电池 三元锂电池 3002
	//
	// 回收设备 4000
	//
	// 垃圾分类回收 4001
	//
	// 洗车机 5000
	DeviceTypeCode *int64 `json:"device_type_code,omitempty" xml:"device_type_code,omitempty"`
	// 设备单价 单位：分
	InitialPrice *int64 `json:"initial_price,omitempty" xml:"initial_price,omitempty"`
	// 出厂时间
	FactoryTime *string `json:"factory_time,omitempty" xml:"factory_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 投放时间
	ReleaseTime *string `json:"release_time,omitempty" xml:"release_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s ImportPeripheralRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportPeripheralRequest) GoString() string {
	return s.String()
}

func (s *ImportPeripheralRequest) SetAuthToken(v string) *ImportPeripheralRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportPeripheralRequest) SetProductInstanceId(v string) *ImportPeripheralRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportPeripheralRequest) SetCorpName(v string) *ImportPeripheralRequest {
	s.CorpName = &v
	return s
}

func (s *ImportPeripheralRequest) SetPeripheralDataModelId(v string) *ImportPeripheralRequest {
	s.PeripheralDataModelId = &v
	return s
}

func (s *ImportPeripheralRequest) SetPeripheralId(v string) *ImportPeripheralRequest {
	s.PeripheralId = &v
	return s
}

func (s *ImportPeripheralRequest) SetPeripheralName(v string) *ImportPeripheralRequest {
	s.PeripheralName = &v
	return s
}

func (s *ImportPeripheralRequest) SetScene(v string) *ImportPeripheralRequest {
	s.Scene = &v
	return s
}

func (s *ImportPeripheralRequest) SetDeviceTypeCode(v int64) *ImportPeripheralRequest {
	s.DeviceTypeCode = &v
	return s
}

func (s *ImportPeripheralRequest) SetInitialPrice(v int64) *ImportPeripheralRequest {
	s.InitialPrice = &v
	return s
}

func (s *ImportPeripheralRequest) SetFactoryTime(v string) *ImportPeripheralRequest {
	s.FactoryTime = &v
	return s
}

func (s *ImportPeripheralRequest) SetReleaseTime(v string) *ImportPeripheralRequest {
	s.ReleaseTime = &v
	return s
}

type ImportPeripheralResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上外围设备Id
	//
	//
	ChainPeripheralId *string `json:"chain_peripheral_id,omitempty" xml:"chain_peripheral_id,omitempty"`
}

func (s ImportPeripheralResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportPeripheralResponse) GoString() string {
	return s.String()
}

func (s *ImportPeripheralResponse) SetReqMsgId(v string) *ImportPeripheralResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportPeripheralResponse) SetResultCode(v string) *ImportPeripheralResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportPeripheralResponse) SetResultMsg(v string) *ImportPeripheralResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportPeripheralResponse) SetChainPeripheralId(v string) *ImportPeripheralResponse {
	s.ChainPeripheralId = &v
	return s
}

type GetPeripheralBychainperipheralidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链上外围设备Id
	ChainPeripheralId *string `json:"chain_peripheral_id,omitempty" xml:"chain_peripheral_id,omitempty" require:"true"`
}

func (s GetPeripheralBychainperipheralidRequest) String() string {
	return tea.Prettify(s)
}

func (s GetPeripheralBychainperipheralidRequest) GoString() string {
	return s.String()
}

func (s *GetPeripheralBychainperipheralidRequest) SetAuthToken(v string) *GetPeripheralBychainperipheralidRequest {
	s.AuthToken = &v
	return s
}

func (s *GetPeripheralBychainperipheralidRequest) SetProductInstanceId(v string) *GetPeripheralBychainperipheralidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetPeripheralBychainperipheralidRequest) SetChainPeripheralId(v string) *GetPeripheralBychainperipheralidRequest {
	s.ChainPeripheralId = &v
	return s
}

type GetPeripheralBychainperipheralidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 外围设备信息
	Peripheral *Peripheral `json:"peripheral,omitempty" xml:"peripheral,omitempty"`
}

func (s GetPeripheralBychainperipheralidResponse) String() string {
	return tea.Prettify(s)
}

func (s GetPeripheralBychainperipheralidResponse) GoString() string {
	return s.String()
}

func (s *GetPeripheralBychainperipheralidResponse) SetReqMsgId(v string) *GetPeripheralBychainperipheralidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetPeripheralBychainperipheralidResponse) SetResultCode(v string) *GetPeripheralBychainperipheralidResponse {
	s.ResultCode = &v
	return s
}

func (s *GetPeripheralBychainperipheralidResponse) SetResultMsg(v string) *GetPeripheralBychainperipheralidResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetPeripheralBychainperipheralidResponse) SetPeripheral(v *Peripheral) *GetPeripheralBychainperipheralidResponse {
	s.Peripheral = v
	return s
}

type GetPeripheralByperipheralidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外围设备ID
	PeripheralId *string `json:"peripheral_id,omitempty" xml:"peripheral_id,omitempty" require:"true"`
	// 场景码
	//
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
}

func (s GetPeripheralByperipheralidRequest) String() string {
	return tea.Prettify(s)
}

func (s GetPeripheralByperipheralidRequest) GoString() string {
	return s.String()
}

func (s *GetPeripheralByperipheralidRequest) SetAuthToken(v string) *GetPeripheralByperipheralidRequest {
	s.AuthToken = &v
	return s
}

func (s *GetPeripheralByperipheralidRequest) SetProductInstanceId(v string) *GetPeripheralByperipheralidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetPeripheralByperipheralidRequest) SetPeripheralId(v string) *GetPeripheralByperipheralidRequest {
	s.PeripheralId = &v
	return s
}

func (s *GetPeripheralByperipheralidRequest) SetScene(v string) *GetPeripheralByperipheralidRequest {
	s.Scene = &v
	return s
}

type GetPeripheralByperipheralidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 外围设备信息
	//
	//
	Peripheral *Peripheral `json:"peripheral,omitempty" xml:"peripheral,omitempty"`
}

func (s GetPeripheralByperipheralidResponse) String() string {
	return tea.Prettify(s)
}

func (s GetPeripheralByperipheralidResponse) GoString() string {
	return s.String()
}

func (s *GetPeripheralByperipheralidResponse) SetReqMsgId(v string) *GetPeripheralByperipheralidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetPeripheralByperipheralidResponse) SetResultCode(v string) *GetPeripheralByperipheralidResponse {
	s.ResultCode = &v
	return s
}

func (s *GetPeripheralByperipheralidResponse) SetResultMsg(v string) *GetPeripheralByperipheralidResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetPeripheralByperipheralidResponse) SetPeripheral(v *Peripheral) *GetPeripheralByperipheralidResponse {
	s.Peripheral = v
	return s
}

type ListPeripheralBysceneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	//
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
}

func (s ListPeripheralBysceneRequest) String() string {
	return tea.Prettify(s)
}

func (s ListPeripheralBysceneRequest) GoString() string {
	return s.String()
}

func (s *ListPeripheralBysceneRequest) SetAuthToken(v string) *ListPeripheralBysceneRequest {
	s.AuthToken = &v
	return s
}

func (s *ListPeripheralBysceneRequest) SetProductInstanceId(v string) *ListPeripheralBysceneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListPeripheralBysceneRequest) SetScene(v string) *ListPeripheralBysceneRequest {
	s.Scene = &v
	return s
}

type ListPeripheralBysceneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 外围设备信息列表
	//
	//
	PeripheralList []*Peripheral `json:"peripheral_list,omitempty" xml:"peripheral_list,omitempty" type:"Repeated"`
}

func (s ListPeripheralBysceneResponse) String() string {
	return tea.Prettify(s)
}

func (s ListPeripheralBysceneResponse) GoString() string {
	return s.String()
}

func (s *ListPeripheralBysceneResponse) SetReqMsgId(v string) *ListPeripheralBysceneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListPeripheralBysceneResponse) SetResultCode(v string) *ListPeripheralBysceneResponse {
	s.ResultCode = &v
	return s
}

func (s *ListPeripheralBysceneResponse) SetResultMsg(v string) *ListPeripheralBysceneResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListPeripheralBysceneResponse) SetPeripheralList(v []*Peripheral) *ListPeripheralBysceneResponse {
	s.PeripheralList = v
	return s
}

type CreateDistributedeviceByperipheralidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 厂商名称
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty"`
	// 数据模型id
	PeripheralDataModelId *string `json:"peripheral_data_model_id,omitempty" xml:"peripheral_data_model_id,omitempty" require:"true"`
	// 外围设备ID
	PeripheralId *string `json:"peripheral_id,omitempty" xml:"peripheral_id,omitempty" require:"true"`
	// 外围设备名称
	//
	PeripheralName *string `json:"peripheral_name,omitempty" xml:"peripheral_name,omitempty"`
	// 场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 设备类型编码
	DeviceTypeCode *int64 `json:"device_type_code,omitempty" xml:"device_type_code,omitempty"`
	// 设备单价 单位：分
	InitialPrice *int64 `json:"initial_price,omitempty" xml:"initial_price,omitempty"`
	// 出厂时间
	FactoryTime *string `json:"factory_time,omitempty" xml:"factory_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 投放时间
	ReleaseTime *string `json:"release_time,omitempty" xml:"release_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s CreateDistributedeviceByperipheralidRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDistributedeviceByperipheralidRequest) GoString() string {
	return s.String()
}

func (s *CreateDistributedeviceByperipheralidRequest) SetAuthToken(v string) *CreateDistributedeviceByperipheralidRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDistributedeviceByperipheralidRequest) SetProductInstanceId(v string) *CreateDistributedeviceByperipheralidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDistributedeviceByperipheralidRequest) SetCorpName(v string) *CreateDistributedeviceByperipheralidRequest {
	s.CorpName = &v
	return s
}

func (s *CreateDistributedeviceByperipheralidRequest) SetPeripheralDataModelId(v string) *CreateDistributedeviceByperipheralidRequest {
	s.PeripheralDataModelId = &v
	return s
}

func (s *CreateDistributedeviceByperipheralidRequest) SetPeripheralId(v string) *CreateDistributedeviceByperipheralidRequest {
	s.PeripheralId = &v
	return s
}

func (s *CreateDistributedeviceByperipheralidRequest) SetPeripheralName(v string) *CreateDistributedeviceByperipheralidRequest {
	s.PeripheralName = &v
	return s
}

func (s *CreateDistributedeviceByperipheralidRequest) SetScene(v string) *CreateDistributedeviceByperipheralidRequest {
	s.Scene = &v
	return s
}

func (s *CreateDistributedeviceByperipheralidRequest) SetDeviceTypeCode(v int64) *CreateDistributedeviceByperipheralidRequest {
	s.DeviceTypeCode = &v
	return s
}

func (s *CreateDistributedeviceByperipheralidRequest) SetInitialPrice(v int64) *CreateDistributedeviceByperipheralidRequest {
	s.InitialPrice = &v
	return s
}

func (s *CreateDistributedeviceByperipheralidRequest) SetFactoryTime(v string) *CreateDistributedeviceByperipheralidRequest {
	s.FactoryTime = &v
	return s
}

func (s *CreateDistributedeviceByperipheralidRequest) SetReleaseTime(v string) *CreateDistributedeviceByperipheralidRequest {
	s.ReleaseTime = &v
	return s
}

type CreateDistributedeviceByperipheralidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发行设备Id
	//
	DistributeDeviceId *string `json:"distribute_device_id,omitempty" xml:"distribute_device_id,omitempty"`
	// 链上外围设备Id
	//
	ChainPeripheralId *string `json:"chain_peripheral_id,omitempty" xml:"chain_peripheral_id,omitempty"`
	// 可信设备ID
	TrustiotPeripheralId *int64 `json:"trustiot_peripheral_id,omitempty" xml:"trustiot_peripheral_id,omitempty"`
}

func (s CreateDistributedeviceByperipheralidResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDistributedeviceByperipheralidResponse) GoString() string {
	return s.String()
}

func (s *CreateDistributedeviceByperipheralidResponse) SetReqMsgId(v string) *CreateDistributedeviceByperipheralidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDistributedeviceByperipheralidResponse) SetResultCode(v string) *CreateDistributedeviceByperipheralidResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDistributedeviceByperipheralidResponse) SetResultMsg(v string) *CreateDistributedeviceByperipheralidResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDistributedeviceByperipheralidResponse) SetDistributeDeviceId(v string) *CreateDistributedeviceByperipheralidResponse {
	s.DistributeDeviceId = &v
	return s
}

func (s *CreateDistributedeviceByperipheralidResponse) SetChainPeripheralId(v string) *CreateDistributedeviceByperipheralidResponse {
	s.ChainPeripheralId = &v
	return s
}

func (s *CreateDistributedeviceByperipheralidResponse) SetTrustiotPeripheralId(v int64) *CreateDistributedeviceByperipheralidResponse {
	s.TrustiotPeripheralId = &v
	return s
}

type CreateDistributedeviceBychainperipheralidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链上外围设备Id
	//
	ChainPeripheralId *string `json:"chain_peripheral_id,omitempty" xml:"chain_peripheral_id,omitempty" require:"true"`
}

func (s CreateDistributedeviceBychainperipheralidRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDistributedeviceBychainperipheralidRequest) GoString() string {
	return s.String()
}

func (s *CreateDistributedeviceBychainperipheralidRequest) SetAuthToken(v string) *CreateDistributedeviceBychainperipheralidRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDistributedeviceBychainperipheralidRequest) SetProductInstanceId(v string) *CreateDistributedeviceBychainperipheralidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDistributedeviceBychainperipheralidRequest) SetChainPeripheralId(v string) *CreateDistributedeviceBychainperipheralidRequest {
	s.ChainPeripheralId = &v
	return s
}

type CreateDistributedeviceBychainperipheralidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发行外围设备Id
	//
	DistributeDeviceId *string `json:"distribute_device_id,omitempty" xml:"distribute_device_id,omitempty"`
}

func (s CreateDistributedeviceBychainperipheralidResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDistributedeviceBychainperipheralidResponse) GoString() string {
	return s.String()
}

func (s *CreateDistributedeviceBychainperipheralidResponse) SetReqMsgId(v string) *CreateDistributedeviceBychainperipheralidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDistributedeviceBychainperipheralidResponse) SetResultCode(v string) *CreateDistributedeviceBychainperipheralidResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDistributedeviceBychainperipheralidResponse) SetResultMsg(v string) *CreateDistributedeviceBychainperipheralidResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDistributedeviceBychainperipheralidResponse) SetDistributeDeviceId(v string) *CreateDistributedeviceBychainperipheralidResponse {
	s.DistributeDeviceId = &v
	return s
}

type ReplaceDistributedeviceBychainperipheralidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 发行外围设备Id
	//
	//
	DistributeDeviceId *string `json:"distribute_device_id,omitempty" xml:"distribute_device_id,omitempty" require:"true"`
	// 链上外围设备ID
	ChainPeripheralId *string `json:"chain_peripheral_id,omitempty" xml:"chain_peripheral_id,omitempty" require:"true"`
}

func (s ReplaceDistributedeviceBychainperipheralidRequest) String() string {
	return tea.Prettify(s)
}

func (s ReplaceDistributedeviceBychainperipheralidRequest) GoString() string {
	return s.String()
}

func (s *ReplaceDistributedeviceBychainperipheralidRequest) SetAuthToken(v string) *ReplaceDistributedeviceBychainperipheralidRequest {
	s.AuthToken = &v
	return s
}

func (s *ReplaceDistributedeviceBychainperipheralidRequest) SetProductInstanceId(v string) *ReplaceDistributedeviceBychainperipheralidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ReplaceDistributedeviceBychainperipheralidRequest) SetDistributeDeviceId(v string) *ReplaceDistributedeviceBychainperipheralidRequest {
	s.DistributeDeviceId = &v
	return s
}

func (s *ReplaceDistributedeviceBychainperipheralidRequest) SetChainPeripheralId(v string) *ReplaceDistributedeviceBychainperipheralidRequest {
	s.ChainPeripheralId = &v
	return s
}

type ReplaceDistributedeviceBychainperipheralidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ReplaceDistributedeviceBychainperipheralidResponse) String() string {
	return tea.Prettify(s)
}

func (s ReplaceDistributedeviceBychainperipheralidResponse) GoString() string {
	return s.String()
}

func (s *ReplaceDistributedeviceBychainperipheralidResponse) SetReqMsgId(v string) *ReplaceDistributedeviceBychainperipheralidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ReplaceDistributedeviceBychainperipheralidResponse) SetResultCode(v string) *ReplaceDistributedeviceBychainperipheralidResponse {
	s.ResultCode = &v
	return s
}

func (s *ReplaceDistributedeviceBychainperipheralidResponse) SetResultMsg(v string) *ReplaceDistributedeviceBychainperipheralidResponse {
	s.ResultMsg = &v
	return s
}

type ListDistributedeviceByperipheralsceneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
}

func (s ListDistributedeviceByperipheralsceneRequest) String() string {
	return tea.Prettify(s)
}

func (s ListDistributedeviceByperipheralsceneRequest) GoString() string {
	return s.String()
}

func (s *ListDistributedeviceByperipheralsceneRequest) SetAuthToken(v string) *ListDistributedeviceByperipheralsceneRequest {
	s.AuthToken = &v
	return s
}

func (s *ListDistributedeviceByperipheralsceneRequest) SetProductInstanceId(v string) *ListDistributedeviceByperipheralsceneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListDistributedeviceByperipheralsceneRequest) SetScene(v string) *ListDistributedeviceByperipheralsceneRequest {
	s.Scene = &v
	return s
}

type ListDistributedeviceByperipheralsceneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发行的外围设备信息数组
	//
	DistributeDeviceList []*DistributeDevice `json:"distribute_device_list,omitempty" xml:"distribute_device_list,omitempty" type:"Repeated"`
}

func (s ListDistributedeviceByperipheralsceneResponse) String() string {
	return tea.Prettify(s)
}

func (s ListDistributedeviceByperipheralsceneResponse) GoString() string {
	return s.String()
}

func (s *ListDistributedeviceByperipheralsceneResponse) SetReqMsgId(v string) *ListDistributedeviceByperipheralsceneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListDistributedeviceByperipheralsceneResponse) SetResultCode(v string) *ListDistributedeviceByperipheralsceneResponse {
	s.ResultCode = &v
	return s
}

func (s *ListDistributedeviceByperipheralsceneResponse) SetResultMsg(v string) *ListDistributedeviceByperipheralsceneResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListDistributedeviceByperipheralsceneResponse) SetDistributeDeviceList(v []*DistributeDevice) *ListDistributedeviceByperipheralsceneResponse {
	s.DistributeDeviceList = v
	return s
}

type GetDistributedeviceByperipheralidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外围设备Id数组
	PeripheralIdList []*string `json:"peripheral_id_list,omitempty" xml:"peripheral_id_list,omitempty" require:"true" type:"Repeated"`
	// 场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
}

func (s GetDistributedeviceByperipheralidRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDistributedeviceByperipheralidRequest) GoString() string {
	return s.String()
}

func (s *GetDistributedeviceByperipheralidRequest) SetAuthToken(v string) *GetDistributedeviceByperipheralidRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDistributedeviceByperipheralidRequest) SetProductInstanceId(v string) *GetDistributedeviceByperipheralidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetDistributedeviceByperipheralidRequest) SetPeripheralIdList(v []*string) *GetDistributedeviceByperipheralidRequest {
	s.PeripheralIdList = v
	return s
}

func (s *GetDistributedeviceByperipheralidRequest) SetScene(v string) *GetDistributedeviceByperipheralidRequest {
	s.Scene = &v
	return s
}

type GetDistributedeviceByperipheralidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发行设备信息数组
	DistributeDeviceList []*DistributeDevice `json:"distribute_device_list,omitempty" xml:"distribute_device_list,omitempty" type:"Repeated"`
	// 发行设备信息不存在的外围设备ID集合
	MissPeripheralIdList []*string `json:"miss_peripheral_id_list,omitempty" xml:"miss_peripheral_id_list,omitempty" type:"Repeated"`
	// 获取外围设备信息成功的外围设备ID集合
	SuccessPeripheralIdList []*string `json:"success_peripheral_id_list,omitempty" xml:"success_peripheral_id_list,omitempty" type:"Repeated"`
}

func (s GetDistributedeviceByperipheralidResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDistributedeviceByperipheralidResponse) GoString() string {
	return s.String()
}

func (s *GetDistributedeviceByperipheralidResponse) SetReqMsgId(v string) *GetDistributedeviceByperipheralidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDistributedeviceByperipheralidResponse) SetResultCode(v string) *GetDistributedeviceByperipheralidResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDistributedeviceByperipheralidResponse) SetResultMsg(v string) *GetDistributedeviceByperipheralidResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDistributedeviceByperipheralidResponse) SetDistributeDeviceList(v []*DistributeDevice) *GetDistributedeviceByperipheralidResponse {
	s.DistributeDeviceList = v
	return s
}

func (s *GetDistributedeviceByperipheralidResponse) SetMissPeripheralIdList(v []*string) *GetDistributedeviceByperipheralidResponse {
	s.MissPeripheralIdList = v
	return s
}

func (s *GetDistributedeviceByperipheralidResponse) SetSuccessPeripheralIdList(v []*string) *GetDistributedeviceByperipheralidResponse {
	s.SuccessPeripheralIdList = v
	return s
}

type CreateDistributedeviceBydeviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备Id
	//
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 设备数据模型Id
	//
	//
	DataModelId *string `json:"data_model_id,omitempty" xml:"data_model_id,omitempty" require:"true"`
	// 场景码
	//
	//
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 设备注册信息
	//
	//
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 签名
	//
	//
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
	// sdk版本号
	//
	//
	SdkId *string `json:"sdk_id,omitempty" xml:"sdk_id,omitempty" require:"true"`
	// 设备类型编码，必填，对应资管平台中的设备类型
	//
	// 枚举值：
	//
	// 车辆 1000
	// 车辆 四轮车 1001
	// 车辆 四轮车 纯电四轮车 1002
	// 车辆 四轮车 混动四轮车 1003
	// 车辆 四轮车 燃油四轮车 1004
	// 车辆 两轮车 1011
	// 车辆 两轮车 两轮单车 1012
	// 车辆 两轮车 两轮助力车 1013
	//
	// 换电柜 2000
	// 换电柜 二轮车换电柜 2001
	//
	// 电池 3000
	// 电池 磷酸铁电池 3001
	// 电池 三元锂电池 3002
	//
	// 回收设备 4000
	//
	// 垃圾分类回收 4001
	//
	// 洗车机 5000
	//
	// 通用计算设备	                6000
	// 	移动设备		        6001
	// 		智能手机	        6002
	// 		工业掌机	        6003
	// 		平板电脑	        6004
	// 	云设备		        6011
	// 		云计算服务器	6012
	DeviceTypeCode *int64 `json:"device_type_code,omitempty" xml:"device_type_code,omitempty"`
	// 设备单价 单位：分
	InitialPrice *int64 `json:"initial_price,omitempty" xml:"initial_price,omitempty"`
	// 出厂时间
	FactoryTime *string `json:"factory_time,omitempty" xml:"factory_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 投放时间
	ReleaseTime *string `json:"release_time,omitempty" xml:"release_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 设备型号
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty"`
	// 资产所有人标识（统一社会信用代码）
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty"`
	// 资产所有人名称
	OwnerName *string `json:"owner_name,omitempty" xml:"owner_name,omitempty"`
}

func (s CreateDistributedeviceBydeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDistributedeviceBydeviceRequest) GoString() string {
	return s.String()
}

func (s *CreateDistributedeviceBydeviceRequest) SetAuthToken(v string) *CreateDistributedeviceBydeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDistributedeviceBydeviceRequest) SetProductInstanceId(v string) *CreateDistributedeviceBydeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDistributedeviceBydeviceRequest) SetDeviceId(v string) *CreateDistributedeviceBydeviceRequest {
	s.DeviceId = &v
	return s
}

func (s *CreateDistributedeviceBydeviceRequest) SetDataModelId(v string) *CreateDistributedeviceBydeviceRequest {
	s.DataModelId = &v
	return s
}

func (s *CreateDistributedeviceBydeviceRequest) SetScene(v string) *CreateDistributedeviceBydeviceRequest {
	s.Scene = &v
	return s
}

func (s *CreateDistributedeviceBydeviceRequest) SetContent(v string) *CreateDistributedeviceBydeviceRequest {
	s.Content = &v
	return s
}

func (s *CreateDistributedeviceBydeviceRequest) SetSignature(v string) *CreateDistributedeviceBydeviceRequest {
	s.Signature = &v
	return s
}

func (s *CreateDistributedeviceBydeviceRequest) SetSdkId(v string) *CreateDistributedeviceBydeviceRequest {
	s.SdkId = &v
	return s
}

func (s *CreateDistributedeviceBydeviceRequest) SetDeviceTypeCode(v int64) *CreateDistributedeviceBydeviceRequest {
	s.DeviceTypeCode = &v
	return s
}

func (s *CreateDistributedeviceBydeviceRequest) SetInitialPrice(v int64) *CreateDistributedeviceBydeviceRequest {
	s.InitialPrice = &v
	return s
}

func (s *CreateDistributedeviceBydeviceRequest) SetFactoryTime(v string) *CreateDistributedeviceBydeviceRequest {
	s.FactoryTime = &v
	return s
}

func (s *CreateDistributedeviceBydeviceRequest) SetReleaseTime(v string) *CreateDistributedeviceBydeviceRequest {
	s.ReleaseTime = &v
	return s
}

func (s *CreateDistributedeviceBydeviceRequest) SetDeviceName(v string) *CreateDistributedeviceBydeviceRequest {
	s.DeviceName = &v
	return s
}

func (s *CreateDistributedeviceBydeviceRequest) SetOwner(v string) *CreateDistributedeviceBydeviceRequest {
	s.Owner = &v
	return s
}

func (s *CreateDistributedeviceBydeviceRequest) SetOwnerName(v string) *CreateDistributedeviceBydeviceRequest {
	s.OwnerName = &v
	return s
}

type CreateDistributedeviceBydeviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上设备Id
	//
	//
	ChainDeviceid *string `json:"chain_deviceid,omitempty" xml:"chain_deviceid,omitempty"`
	// 发行设备Id
	//
	//
	DistributeDeviceId *string `json:"distribute_device_id,omitempty" xml:"distribute_device_id,omitempty"`
	// 可信设备ID
	TrustiotDeviceId *int64 `json:"trustiot_device_id,omitempty" xml:"trustiot_device_id,omitempty"`
}

func (s CreateDistributedeviceBydeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDistributedeviceBydeviceResponse) GoString() string {
	return s.String()
}

func (s *CreateDistributedeviceBydeviceResponse) SetReqMsgId(v string) *CreateDistributedeviceBydeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDistributedeviceBydeviceResponse) SetResultCode(v string) *CreateDistributedeviceBydeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDistributedeviceBydeviceResponse) SetResultMsg(v string) *CreateDistributedeviceBydeviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDistributedeviceBydeviceResponse) SetChainDeviceid(v string) *CreateDistributedeviceBydeviceResponse {
	s.ChainDeviceid = &v
	return s
}

func (s *CreateDistributedeviceBydeviceResponse) SetDistributeDeviceId(v string) *CreateDistributedeviceBydeviceResponse {
	s.DistributeDeviceId = &v
	return s
}

func (s *CreateDistributedeviceBydeviceResponse) SetTrustiotDeviceId(v int64) *CreateDistributedeviceBydeviceResponse {
	s.TrustiotDeviceId = &v
	return s
}

type CreateTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备Id
	//
	//
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 远程命令
	//
	//
	Cmd *string `json:"cmd,omitempty" xml:"cmd,omitempty" require:"true"`
	// 附加信息
	//
	//
	Extra *string `json:"extra,omitempty" xml:"extra,omitempty" require:"true"`
	// 场景码
	//
	//
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 设备类型
	DeviceType *string `json:"device_type,omitempty" xml:"device_type,omitempty" require:"true"`
}

func (s CreateTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTaskRequest) GoString() string {
	return s.String()
}

func (s *CreateTaskRequest) SetAuthToken(v string) *CreateTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTaskRequest) SetProductInstanceId(v string) *CreateTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTaskRequest) SetDeviceId(v string) *CreateTaskRequest {
	s.DeviceId = &v
	return s
}

func (s *CreateTaskRequest) SetCmd(v string) *CreateTaskRequest {
	s.Cmd = &v
	return s
}

func (s *CreateTaskRequest) SetExtra(v string) *CreateTaskRequest {
	s.Extra = &v
	return s
}

func (s *CreateTaskRequest) SetScene(v string) *CreateTaskRequest {
	s.Scene = &v
	return s
}

func (s *CreateTaskRequest) SetDeviceType(v string) *CreateTaskRequest {
	s.DeviceType = &v
	return s
}

type CreateTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务Id
	//
	//
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
}

func (s CreateTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTaskResponse) GoString() string {
	return s.String()
}

func (s *CreateTaskResponse) SetReqMsgId(v string) *CreateTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTaskResponse) SetResultCode(v string) *CreateTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTaskResponse) SetResultMsg(v string) *CreateTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTaskResponse) SetTaskId(v string) *CreateTaskResponse {
	s.TaskId = &v
	return s
}

type QueryTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务Id
	//
	//
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 场景码
	//
	//
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
}

func (s QueryTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTaskRequest) GoString() string {
	return s.String()
}

func (s *QueryTaskRequest) SetAuthToken(v string) *QueryTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTaskRequest) SetProductInstanceId(v string) *QueryTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTaskRequest) SetTaskId(v string) *QueryTaskRequest {
	s.TaskId = &v
	return s
}

func (s *QueryTaskRequest) SetScene(v string) *QueryTaskRequest {
	s.Scene = &v
	return s
}

type QueryTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务状态
	//
	//
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s QueryTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTaskResponse) GoString() string {
	return s.String()
}

func (s *QueryTaskResponse) SetReqMsgId(v string) *QueryTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTaskResponse) SetResultCode(v string) *QueryTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTaskResponse) SetResultMsg(v string) *QueryTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTaskResponse) SetStatus(v string) *QueryTaskResponse {
	s.Status = &v
	return s
}

type QueryAnalysisRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 发行设备Id集合
	//
	//
	DisIdList []*string `json:"dis_id_list,omitempty" xml:"dis_id_list,omitempty" type:"Repeated"`
	// 时间，格式YYYYMMDD
	//
	//
	Time *string `json:"time,omitempty" xml:"time,omitempty" require:"true"`
	// 场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// SCENE : 场景设备资产分析   DEVICE：设备分析 BIZ：订单分析   ， 默认为DEVICE
	Scope *string `json:"scope,omitempty" xml:"scope,omitempty"`
}

func (s QueryAnalysisRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAnalysisRequest) GoString() string {
	return s.String()
}

func (s *QueryAnalysisRequest) SetAuthToken(v string) *QueryAnalysisRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAnalysisRequest) SetProductInstanceId(v string) *QueryAnalysisRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAnalysisRequest) SetDisIdList(v []*string) *QueryAnalysisRequest {
	s.DisIdList = v
	return s
}

func (s *QueryAnalysisRequest) SetTime(v string) *QueryAnalysisRequest {
	s.Time = &v
	return s
}

func (s *QueryAnalysisRequest) SetScene(v string) *QueryAnalysisRequest {
	s.Scene = &v
	return s
}

func (s *QueryAnalysisRequest) SetScope(v string) *QueryAnalysisRequest {
	s.Scope = &v
	return s
}

type QueryAnalysisResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分析数据，根据不同场景的不同json串
	ResultList []*string `json:"result_list,omitempty" xml:"result_list,omitempty" type:"Repeated"`
}

func (s QueryAnalysisResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAnalysisResponse) GoString() string {
	return s.String()
}

func (s *QueryAnalysisResponse) SetReqMsgId(v string) *QueryAnalysisResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAnalysisResponse) SetResultCode(v string) *QueryAnalysisResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAnalysisResponse) SetResultMsg(v string) *QueryAnalysisResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAnalysisResponse) SetResultList(v []*string) *QueryAnalysisResponse {
	s.ResultList = v
	return s
}

type SendCollectorBychainidmulRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 上传数据
	//
	//
	Content []*CollectContent `json:"content,omitempty" xml:"content,omitempty" require:"true" type:"Repeated"`
	// 随机业务号，防重放
	//
	//
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty" require:"true"`
}

func (s SendCollectorBychainidmulRequest) String() string {
	return tea.Prettify(s)
}

func (s SendCollectorBychainidmulRequest) GoString() string {
	return s.String()
}

func (s *SendCollectorBychainidmulRequest) SetAuthToken(v string) *SendCollectorBychainidmulRequest {
	s.AuthToken = &v
	return s
}

func (s *SendCollectorBychainidmulRequest) SetProductInstanceId(v string) *SendCollectorBychainidmulRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendCollectorBychainidmulRequest) SetContent(v []*CollectContent) *SendCollectorBychainidmulRequest {
	s.Content = v
	return s
}

func (s *SendCollectorBychainidmulRequest) SetNonce(v string) *SendCollectorBychainidmulRequest {
	s.Nonce = &v
	return s
}

type SendCollectorBychainidmulResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SendCollectorBychainidmulResponse) String() string {
	return tea.Prettify(s)
}

func (s SendCollectorBychainidmulResponse) GoString() string {
	return s.String()
}

func (s *SendCollectorBychainidmulResponse) SetReqMsgId(v string) *SendCollectorBychainidmulResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendCollectorBychainidmulResponse) SetResultCode(v string) *SendCollectorBychainidmulResponse {
	s.ResultCode = &v
	return s
}

func (s *SendCollectorBychainidmulResponse) SetResultMsg(v string) *SendCollectorBychainidmulResponse {
	s.ResultMsg = &v
	return s
}

type SendCollectorDevicebizdataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据模型Id
	//
	//
	DataModelId *string `json:"data_model_id,omitempty" xml:"data_model_id,omitempty" require:"true"`
	// 业务号，防重放
	//
	//
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty" require:"true"`
	// 上传数据
	Content []*BizContentGroup `json:"content,omitempty" xml:"content,omitempty" require:"true" type:"Repeated"`
	// 场景码，与content中的chainDeviceId至少有一个不为空
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty"`
}

func (s SendCollectorDevicebizdataRequest) String() string {
	return tea.Prettify(s)
}

func (s SendCollectorDevicebizdataRequest) GoString() string {
	return s.String()
}

func (s *SendCollectorDevicebizdataRequest) SetAuthToken(v string) *SendCollectorDevicebizdataRequest {
	s.AuthToken = &v
	return s
}

func (s *SendCollectorDevicebizdataRequest) SetProductInstanceId(v string) *SendCollectorDevicebizdataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendCollectorDevicebizdataRequest) SetDataModelId(v string) *SendCollectorDevicebizdataRequest {
	s.DataModelId = &v
	return s
}

func (s *SendCollectorDevicebizdataRequest) SetNonce(v string) *SendCollectorDevicebizdataRequest {
	s.Nonce = &v
	return s
}

func (s *SendCollectorDevicebizdataRequest) SetContent(v []*BizContentGroup) *SendCollectorDevicebizdataRequest {
	s.Content = v
	return s
}

func (s *SendCollectorDevicebizdataRequest) SetScene(v string) *SendCollectorDevicebizdataRequest {
	s.Scene = &v
	return s
}

type SendCollectorDevicebizdataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SendCollectorDevicebizdataResponse) String() string {
	return tea.Prettify(s)
}

func (s SendCollectorDevicebizdataResponse) GoString() string {
	return s.String()
}

func (s *SendCollectorDevicebizdataResponse) SetReqMsgId(v string) *SendCollectorDevicebizdataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendCollectorDevicebizdataResponse) SetResultCode(v string) *SendCollectorDevicebizdataResponse {
	s.ResultCode = &v
	return s
}

func (s *SendCollectorDevicebizdataResponse) SetResultMsg(v string) *SendCollectorDevicebizdataResponse {
	s.ResultMsg = &v
	return s
}

type UpdateDeviceInfobydeviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备Id
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 设备数据模型Id
	//
	//
	DataModelId *string `json:"data_model_id,omitempty" xml:"data_model_id,omitempty" require:"true"`
	// 场景码
	//
	//
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// sdk版本号
	//
	//
	SdkId *string `json:"sdk_id,omitempty" xml:"sdk_id,omitempty" require:"true"`
	// 设备注册信息
	//
	//
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 签名
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
	// 设备类型编码，必填，对应资管平台中的设备类型
	//
	// 枚举值：
	//
	// 车辆 1000
	// 车辆 四轮车 1001
	// 车辆 四轮车 纯电四轮车 1002
	// 车辆 四轮车 混动四轮车 1003
	// 车辆 四轮车 燃油四轮车 1004
	// 车辆 两轮车 1011
	// 车辆 两轮车 两轮单车 1012
	// 车辆 两轮车 两轮助力车 1013
	//
	// 换电柜 2000
	// 换电柜 二轮车换电柜 2001
	//
	// 电池 3000
	// 电池 磷酸铁电池 3001
	// 电池 三元锂电池 3002
	//
	// 回收设备 4000
	//
	// 垃圾分类回收 4001
	//
	// 洗车机 5000
	//
	// 通用计算设备	                6000
	// 	移动设备		        6001
	// 		智能手机	        6002
	// 		工业掌机	        6003
	// 		平板电脑	        6004
	// 	云设备		        6011
	// 		云计算服务器	6012
	DeviceTypeCode *int64 `json:"device_type_code,omitempty" xml:"device_type_code,omitempty" require:"true"`
	// 设备单价 单位：分
	InitialPrice *int64 `json:"initial_price,omitempty" xml:"initial_price,omitempty" require:"true"`
	// 出厂时间
	//
	FactoryTime *string `json:"factory_time,omitempty" xml:"factory_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 投放时间
	//
	ReleaseTime *string `json:"release_time,omitempty" xml:"release_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 设备型号
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty"`
	// 设备上报数据是否需要验签，取值范围（RAW_DATA、SIGNED_DATA），
	// SIGNED_DATA：需要验签
	// RAW_DATA：不需要验签
	DeviceFeature *string `json:"device_feature,omitempty" xml:"device_feature,omitempty"`
	// 额外信息
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 资产所有人标识（统一社会信用代码）
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty"`
	// 资产所有人名称
	OwnerName *string `json:"owner_name,omitempty" xml:"owner_name,omitempty"`
}

func (s UpdateDeviceInfobydeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateDeviceInfobydeviceRequest) GoString() string {
	return s.String()
}

func (s *UpdateDeviceInfobydeviceRequest) SetAuthToken(v string) *UpdateDeviceInfobydeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateDeviceInfobydeviceRequest) SetProductInstanceId(v string) *UpdateDeviceInfobydeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateDeviceInfobydeviceRequest) SetDeviceId(v string) *UpdateDeviceInfobydeviceRequest {
	s.DeviceId = &v
	return s
}

func (s *UpdateDeviceInfobydeviceRequest) SetDataModelId(v string) *UpdateDeviceInfobydeviceRequest {
	s.DataModelId = &v
	return s
}

func (s *UpdateDeviceInfobydeviceRequest) SetScene(v string) *UpdateDeviceInfobydeviceRequest {
	s.Scene = &v
	return s
}

func (s *UpdateDeviceInfobydeviceRequest) SetSdkId(v string) *UpdateDeviceInfobydeviceRequest {
	s.SdkId = &v
	return s
}

func (s *UpdateDeviceInfobydeviceRequest) SetContent(v string) *UpdateDeviceInfobydeviceRequest {
	s.Content = &v
	return s
}

func (s *UpdateDeviceInfobydeviceRequest) SetSignature(v string) *UpdateDeviceInfobydeviceRequest {
	s.Signature = &v
	return s
}

func (s *UpdateDeviceInfobydeviceRequest) SetDeviceTypeCode(v int64) *UpdateDeviceInfobydeviceRequest {
	s.DeviceTypeCode = &v
	return s
}

func (s *UpdateDeviceInfobydeviceRequest) SetInitialPrice(v int64) *UpdateDeviceInfobydeviceRequest {
	s.InitialPrice = &v
	return s
}

func (s *UpdateDeviceInfobydeviceRequest) SetFactoryTime(v string) *UpdateDeviceInfobydeviceRequest {
	s.FactoryTime = &v
	return s
}

func (s *UpdateDeviceInfobydeviceRequest) SetReleaseTime(v string) *UpdateDeviceInfobydeviceRequest {
	s.ReleaseTime = &v
	return s
}

func (s *UpdateDeviceInfobydeviceRequest) SetDeviceName(v string) *UpdateDeviceInfobydeviceRequest {
	s.DeviceName = &v
	return s
}

func (s *UpdateDeviceInfobydeviceRequest) SetDeviceFeature(v string) *UpdateDeviceInfobydeviceRequest {
	s.DeviceFeature = &v
	return s
}

func (s *UpdateDeviceInfobydeviceRequest) SetExtraInfo(v string) *UpdateDeviceInfobydeviceRequest {
	s.ExtraInfo = &v
	return s
}

func (s *UpdateDeviceInfobydeviceRequest) SetOwner(v string) *UpdateDeviceInfobydeviceRequest {
	s.Owner = &v
	return s
}

func (s *UpdateDeviceInfobydeviceRequest) SetOwnerName(v string) *UpdateDeviceInfobydeviceRequest {
	s.OwnerName = &v
	return s
}

type UpdateDeviceInfobydeviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上设备Id
	//
	//
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty"`
	// 发行设备Id
	//
	//
	DistributeDeviceId *string `json:"distribute_device_id,omitempty" xml:"distribute_device_id,omitempty"`
	// 可信设备ID
	TrustiotDeviceId *int64 `json:"trustiot_device_id,omitempty" xml:"trustiot_device_id,omitempty"`
}

func (s UpdateDeviceInfobydeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateDeviceInfobydeviceResponse) GoString() string {
	return s.String()
}

func (s *UpdateDeviceInfobydeviceResponse) SetReqMsgId(v string) *UpdateDeviceInfobydeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateDeviceInfobydeviceResponse) SetResultCode(v string) *UpdateDeviceInfobydeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateDeviceInfobydeviceResponse) SetResultMsg(v string) *UpdateDeviceInfobydeviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateDeviceInfobydeviceResponse) SetChainDeviceId(v string) *UpdateDeviceInfobydeviceResponse {
	s.ChainDeviceId = &v
	return s
}

func (s *UpdateDeviceInfobydeviceResponse) SetDistributeDeviceId(v string) *UpdateDeviceInfobydeviceResponse {
	s.DistributeDeviceId = &v
	return s
}

func (s *UpdateDeviceInfobydeviceResponse) SetTrustiotDeviceId(v int64) *UpdateDeviceInfobydeviceResponse {
	s.TrustiotDeviceId = &v
	return s
}

type OfflineDeviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备链上Id
	//
	//
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty" require:"true"`
}

func (s OfflineDeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s OfflineDeviceRequest) GoString() string {
	return s.String()
}

func (s *OfflineDeviceRequest) SetAuthToken(v string) *OfflineDeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *OfflineDeviceRequest) SetProductInstanceId(v string) *OfflineDeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OfflineDeviceRequest) SetChainDeviceId(v string) *OfflineDeviceRequest {
	s.ChainDeviceId = &v
	return s
}

type OfflineDeviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s OfflineDeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s OfflineDeviceResponse) GoString() string {
	return s.String()
}

func (s *OfflineDeviceResponse) SetReqMsgId(v string) *OfflineDeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OfflineDeviceResponse) SetResultCode(v string) *OfflineDeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *OfflineDeviceResponse) SetResultMsg(v string) *OfflineDeviceResponse {
	s.ResultMsg = &v
	return s
}

type ApplyMqtokenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 设备ID
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
}

func (s ApplyMqtokenRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyMqtokenRequest) GoString() string {
	return s.String()
}

func (s *ApplyMqtokenRequest) SetAuthToken(v string) *ApplyMqtokenRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyMqtokenRequest) SetProductInstanceId(v string) *ApplyMqtokenRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyMqtokenRequest) SetScene(v string) *ApplyMqtokenRequest {
	s.Scene = &v
	return s
}

func (s *ApplyMqtokenRequest) SetDeviceId(v string) *ApplyMqtokenRequest {
	s.DeviceId = &v
	return s
}

type ApplyMqtokenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 服务端返回的Token值，用于阿里云 MQTT连接
	Token *string `json:"token,omitempty" xml:"token,omitempty"`
	// 接入阿里云LMQ的所需的accessKey
	AccessKey *string `json:"access_key,omitempty" xml:"access_key,omitempty"`
	// mqtt的instanceId
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty"`
	// mqtt的topic
	SubTopic *string `json:"sub_topic,omitempty" xml:"sub_topic,omitempty"`
	// mqtt的topic
	PubTopic *string `json:"pub_topic,omitempty" xml:"pub_topic,omitempty"`
	// mqtt的groupId
	GroupId *string `json:"group_id,omitempty" xml:"group_id,omitempty"`
}

func (s ApplyMqtokenResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyMqtokenResponse) GoString() string {
	return s.String()
}

func (s *ApplyMqtokenResponse) SetReqMsgId(v string) *ApplyMqtokenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyMqtokenResponse) SetResultCode(v string) *ApplyMqtokenResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyMqtokenResponse) SetResultMsg(v string) *ApplyMqtokenResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyMqtokenResponse) SetToken(v string) *ApplyMqtokenResponse {
	s.Token = &v
	return s
}

func (s *ApplyMqtokenResponse) SetAccessKey(v string) *ApplyMqtokenResponse {
	s.AccessKey = &v
	return s
}

func (s *ApplyMqtokenResponse) SetInstanceId(v string) *ApplyMqtokenResponse {
	s.InstanceId = &v
	return s
}

func (s *ApplyMqtokenResponse) SetSubTopic(v string) *ApplyMqtokenResponse {
	s.SubTopic = &v
	return s
}

func (s *ApplyMqtokenResponse) SetPubTopic(v string) *ApplyMqtokenResponse {
	s.PubTopic = &v
	return s
}

func (s *ApplyMqtokenResponse) SetGroupId(v string) *ApplyMqtokenResponse {
	s.GroupId = &v
	return s
}

type QueryDeviceRegistrationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备Id，由接入方提供，场景内唯一
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 场景号
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 可信根派生公钥
	DevicePublicKey *string `json:"device_public_key,omitempty" xml:"device_public_key,omitempty" require:"true"`
}

func (s QueryDeviceRegistrationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceRegistrationRequest) GoString() string {
	return s.String()
}

func (s *QueryDeviceRegistrationRequest) SetAuthToken(v string) *QueryDeviceRegistrationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDeviceRegistrationRequest) SetProductInstanceId(v string) *QueryDeviceRegistrationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDeviceRegistrationRequest) SetDeviceId(v string) *QueryDeviceRegistrationRequest {
	s.DeviceId = &v
	return s
}

func (s *QueryDeviceRegistrationRequest) SetScene(v string) *QueryDeviceRegistrationRequest {
	s.Scene = &v
	return s
}

func (s *QueryDeviceRegistrationRequest) SetDevicePublicKey(v string) *QueryDeviceRegistrationRequest {
	s.DevicePublicKey = &v
	return s
}

type QueryDeviceRegistrationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryDeviceRegistrationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceRegistrationResponse) GoString() string {
	return s.String()
}

func (s *QueryDeviceRegistrationResponse) SetReqMsgId(v string) *QueryDeviceRegistrationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDeviceRegistrationResponse) SetResultCode(v string) *QueryDeviceRegistrationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDeviceRegistrationResponse) SetResultMsg(v string) *QueryDeviceRegistrationResponse {
	s.ResultMsg = &v
	return s
}

type AddAbnormalRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备Id，由接入方提供，场景内唯一
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 场景号
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 异常类型编码KEY_NOT_FOUND、DEVICE_ID_MISMATCH 等
	AbnormalCode *string `json:"abnormal_code,omitempty" xml:"abnormal_code,omitempty" require:"true"`
}

func (s AddAbnormalRequest) String() string {
	return tea.Prettify(s)
}

func (s AddAbnormalRequest) GoString() string {
	return s.String()
}

func (s *AddAbnormalRequest) SetAuthToken(v string) *AddAbnormalRequest {
	s.AuthToken = &v
	return s
}

func (s *AddAbnormalRequest) SetProductInstanceId(v string) *AddAbnormalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddAbnormalRequest) SetDeviceId(v string) *AddAbnormalRequest {
	s.DeviceId = &v
	return s
}

func (s *AddAbnormalRequest) SetScene(v string) *AddAbnormalRequest {
	s.Scene = &v
	return s
}

func (s *AddAbnormalRequest) SetAbnormalCode(v string) *AddAbnormalRequest {
	s.AbnormalCode = &v
	return s
}

type AddAbnormalResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AddAbnormalResponse) String() string {
	return tea.Prettify(s)
}

func (s AddAbnormalResponse) GoString() string {
	return s.String()
}

func (s *AddAbnormalResponse) SetReqMsgId(v string) *AddAbnormalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddAbnormalResponse) SetResultCode(v string) *AddAbnormalResponse {
	s.ResultCode = &v
	return s
}

func (s *AddAbnormalResponse) SetResultMsg(v string) *AddAbnormalResponse {
	s.ResultMsg = &v
	return s
}

type OnlineDeviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备链上ID
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty" require:"true"`
}

func (s OnlineDeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s OnlineDeviceRequest) GoString() string {
	return s.String()
}

func (s *OnlineDeviceRequest) SetAuthToken(v string) *OnlineDeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *OnlineDeviceRequest) SetProductInstanceId(v string) *OnlineDeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OnlineDeviceRequest) SetChainDeviceId(v string) *OnlineDeviceRequest {
	s.ChainDeviceId = &v
	return s
}

type OnlineDeviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s OnlineDeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s OnlineDeviceResponse) GoString() string {
	return s.String()
}

func (s *OnlineDeviceResponse) SetReqMsgId(v string) *OnlineDeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OnlineDeviceResponse) SetResultCode(v string) *OnlineDeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *OnlineDeviceResponse) SetResultMsg(v string) *OnlineDeviceResponse {
	s.ResultMsg = &v
	return s
}

type OfflineDeviceByunregisterRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 通过链上设备ID注销设备
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty" require:"true"`
}

func (s OfflineDeviceByunregisterRequest) String() string {
	return tea.Prettify(s)
}

func (s OfflineDeviceByunregisterRequest) GoString() string {
	return s.String()
}

func (s *OfflineDeviceByunregisterRequest) SetAuthToken(v string) *OfflineDeviceByunregisterRequest {
	s.AuthToken = &v
	return s
}

func (s *OfflineDeviceByunregisterRequest) SetProductInstanceId(v string) *OfflineDeviceByunregisterRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OfflineDeviceByunregisterRequest) SetChainDeviceId(v string) *OfflineDeviceByunregisterRequest {
	s.ChainDeviceId = &v
	return s
}

type OfflineDeviceByunregisterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s OfflineDeviceByunregisterResponse) String() string {
	return tea.Prettify(s)
}

func (s OfflineDeviceByunregisterResponse) GoString() string {
	return s.String()
}

func (s *OfflineDeviceByunregisterResponse) SetReqMsgId(v string) *OfflineDeviceByunregisterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OfflineDeviceByunregisterResponse) SetResultCode(v string) *OfflineDeviceByunregisterResponse {
	s.ResultCode = &v
	return s
}

func (s *OfflineDeviceByunregisterResponse) SetResultMsg(v string) *OfflineDeviceByunregisterResponse {
	s.ResultMsg = &v
	return s
}

type QueryLabelTraceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码 , 使用asset_id 查询时，scene也必须传入
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty"`
	// 标签Id
	LabelId *string `json:"label_id,omitempty" xml:"label_id,omitempty"`
	// 标签状态
	LabelStatus *string `json:"label_status,omitempty" xml:"label_status,omitempty"`
	// 资产Id
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 操作员
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
	// 标签拥有者
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty"`
	// 标签所处流程
	Process *string `json:"process,omitempty" xml:"process,omitempty"`
	// 标签操作
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 开始时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s QueryLabelTraceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryLabelTraceRequest) GoString() string {
	return s.String()
}

func (s *QueryLabelTraceRequest) SetAuthToken(v string) *QueryLabelTraceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryLabelTraceRequest) SetProductInstanceId(v string) *QueryLabelTraceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryLabelTraceRequest) SetScene(v string) *QueryLabelTraceRequest {
	s.Scene = &v
	return s
}

func (s *QueryLabelTraceRequest) SetLabelId(v string) *QueryLabelTraceRequest {
	s.LabelId = &v
	return s
}

func (s *QueryLabelTraceRequest) SetLabelStatus(v string) *QueryLabelTraceRequest {
	s.LabelStatus = &v
	return s
}

func (s *QueryLabelTraceRequest) SetAssetId(v string) *QueryLabelTraceRequest {
	s.AssetId = &v
	return s
}

func (s *QueryLabelTraceRequest) SetOperator(v string) *QueryLabelTraceRequest {
	s.Operator = &v
	return s
}

func (s *QueryLabelTraceRequest) SetOwner(v string) *QueryLabelTraceRequest {
	s.Owner = &v
	return s
}

func (s *QueryLabelTraceRequest) SetProcess(v string) *QueryLabelTraceRequest {
	s.Process = &v
	return s
}

func (s *QueryLabelTraceRequest) SetAction(v string) *QueryLabelTraceRequest {
	s.Action = &v
	return s
}

func (s *QueryLabelTraceRequest) SetStartTime(v string) *QueryLabelTraceRequest {
	s.StartTime = &v
	return s
}

func (s *QueryLabelTraceRequest) SetEndTime(v string) *QueryLabelTraceRequest {
	s.EndTime = &v
	return s
}

type QueryLabelTraceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 标签流转历史
	LabelTraceList []*LabelTrace `json:"label_trace_list,omitempty" xml:"label_trace_list,omitempty" type:"Repeated"`
}

func (s QueryLabelTraceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryLabelTraceResponse) GoString() string {
	return s.String()
}

func (s *QueryLabelTraceResponse) SetReqMsgId(v string) *QueryLabelTraceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryLabelTraceResponse) SetResultCode(v string) *QueryLabelTraceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryLabelTraceResponse) SetResultMsg(v string) *QueryLabelTraceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryLabelTraceResponse) SetLabelTraceList(v []*LabelTrace) *QueryLabelTraceResponse {
	s.LabelTraceList = v
	return s
}

type SyncLabelTransferRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 收集标签数据
	CollectLabelContentList []*CollectLabelContent `json:"collect_label_content_list,omitempty" xml:"collect_label_content_list,omitempty" require:"true" type:"Repeated"`
	// 业务号
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty" require:"true"`
}

func (s SyncLabelTransferRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncLabelTransferRequest) GoString() string {
	return s.String()
}

func (s *SyncLabelTransferRequest) SetAuthToken(v string) *SyncLabelTransferRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncLabelTransferRequest) SetProductInstanceId(v string) *SyncLabelTransferRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncLabelTransferRequest) SetScene(v string) *SyncLabelTransferRequest {
	s.Scene = &v
	return s
}

func (s *SyncLabelTransferRequest) SetCollectLabelContentList(v []*CollectLabelContent) *SyncLabelTransferRequest {
	s.CollectLabelContentList = v
	return s
}

func (s *SyncLabelTransferRequest) SetNonce(v string) *SyncLabelTransferRequest {
	s.Nonce = &v
	return s
}

type SyncLabelTransferResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 标签上链hash返回
	ResultList []*LabelChainResult `json:"result_list,omitempty" xml:"result_list,omitempty" type:"Repeated"`
}

func (s SyncLabelTransferResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncLabelTransferResponse) GoString() string {
	return s.String()
}

func (s *SyncLabelTransferResponse) SetReqMsgId(v string) *SyncLabelTransferResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncLabelTransferResponse) SetResultCode(v string) *SyncLabelTransferResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncLabelTransferResponse) SetResultMsg(v string) *SyncLabelTransferResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncLabelTransferResponse) SetResultList(v []*LabelChainResult) *SyncLabelTransferResponse {
	s.ResultList = v
	return s
}

type AddLabelAssetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 标签Id
	LabelId *string `json:"label_id,omitempty" xml:"label_id,omitempty" require:"true"`
	// 资产Id
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 资产对应的设备类型码，对应资管平台中的设备类型
	DeviceTypeCode *int64 `json:"device_type_code,omitempty" xml:"device_type_code,omitempty"`
}

func (s AddLabelAssetRequest) String() string {
	return tea.Prettify(s)
}

func (s AddLabelAssetRequest) GoString() string {
	return s.String()
}

func (s *AddLabelAssetRequest) SetAuthToken(v string) *AddLabelAssetRequest {
	s.AuthToken = &v
	return s
}

func (s *AddLabelAssetRequest) SetProductInstanceId(v string) *AddLabelAssetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddLabelAssetRequest) SetScene(v string) *AddLabelAssetRequest {
	s.Scene = &v
	return s
}

func (s *AddLabelAssetRequest) SetLabelId(v string) *AddLabelAssetRequest {
	s.LabelId = &v
	return s
}

func (s *AddLabelAssetRequest) SetAssetId(v string) *AddLabelAssetRequest {
	s.AssetId = &v
	return s
}

func (s *AddLabelAssetRequest) SetDeviceTypeCode(v int64) *AddLabelAssetRequest {
	s.DeviceTypeCode = &v
	return s
}

type AddLabelAssetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AddLabelAssetResponse) String() string {
	return tea.Prettify(s)
}

func (s AddLabelAssetResponse) GoString() string {
	return s.String()
}

func (s *AddLabelAssetResponse) SetReqMsgId(v string) *AddLabelAssetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddLabelAssetResponse) SetResultCode(v string) *AddLabelAssetResponse {
	s.ResultCode = &v
	return s
}

func (s *AddLabelAssetResponse) SetResultMsg(v string) *AddLabelAssetResponse {
	s.ResultMsg = &v
	return s
}

type QueryDataBytxhashRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 链上交易hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 上链类型枚举：
	// REGISTER_DEVICE	设备注册
	// DISTRIBUTE_DEVICE	设备发行
	// LABEL_DATA	标签流转数据收集
	// COLLECT_DATA	设备数据收集
	// DEVICE_BIZ_DATA	设备业务订单数据收集
	// REGISTER_PERIPHERAL_DEVICE	外围设备注册
	ContractMethod *string `json:"contract_method,omitempty" xml:"contract_method,omitempty" require:"true"`
}

func (s QueryDataBytxhashRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDataBytxhashRequest) GoString() string {
	return s.String()
}

func (s *QueryDataBytxhashRequest) SetAuthToken(v string) *QueryDataBytxhashRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDataBytxhashRequest) SetProductInstanceId(v string) *QueryDataBytxhashRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDataBytxhashRequest) SetScene(v string) *QueryDataBytxhashRequest {
	s.Scene = &v
	return s
}

func (s *QueryDataBytxhashRequest) SetTxHash(v string) *QueryDataBytxhashRequest {
	s.TxHash = &v
	return s
}

func (s *QueryDataBytxhashRequest) SetContractMethod(v string) *QueryDataBytxhashRequest {
	s.ContractMethod = &v
	return s
}

type QueryDataBytxhashResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回信息
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryDataBytxhashResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDataBytxhashResponse) GoString() string {
	return s.String()
}

func (s *QueryDataBytxhashResponse) SetReqMsgId(v string) *QueryDataBytxhashResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDataBytxhashResponse) SetResultCode(v string) *QueryDataBytxhashResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDataBytxhashResponse) SetResultMsg(v string) *QueryDataBytxhashResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDataBytxhashResponse) SetResult(v string) *QueryDataBytxhashResponse {
	s.Result = &v
	return s
}

type ExecUnprocessedTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 任务名称枚举
	// confirm_device_state : 确认设备状态变更
	Action *string `json:"action,omitempty" xml:"action,omitempty" require:"true"`
	// 任务参数
	Params *string `json:"params,omitempty" xml:"params,omitempty" require:"true"`
}

func (s ExecUnprocessedTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecUnprocessedTaskRequest) GoString() string {
	return s.String()
}

func (s *ExecUnprocessedTaskRequest) SetAuthToken(v string) *ExecUnprocessedTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecUnprocessedTaskRequest) SetProductInstanceId(v string) *ExecUnprocessedTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecUnprocessedTaskRequest) SetTaskId(v string) *ExecUnprocessedTaskRequest {
	s.TaskId = &v
	return s
}

func (s *ExecUnprocessedTaskRequest) SetAction(v string) *ExecUnprocessedTaskRequest {
	s.Action = &v
	return s
}

func (s *ExecUnprocessedTaskRequest) SetParams(v string) *ExecUnprocessedTaskRequest {
	s.Params = &v
	return s
}

type ExecUnprocessedTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecUnprocessedTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecUnprocessedTaskResponse) GoString() string {
	return s.String()
}

func (s *ExecUnprocessedTaskResponse) SetReqMsgId(v string) *ExecUnprocessedTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecUnprocessedTaskResponse) SetResultCode(v string) *ExecUnprocessedTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecUnprocessedTaskResponse) SetResultMsg(v string) *ExecUnprocessedTaskResponse {
	s.ResultMsg = &v
	return s
}

type SendCollectorSummarydataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 汇总所属的场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 汇总的业务类型，同一个scene下可以有不同的业务类型，此字段用于区分业务类型
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 提交日期（汇总所属的日期）
	SubmitDate *string `json:"submit_date,omitempty" xml:"submit_date,omitempty" require:"true"`
	// 汇总数据的数据模型ID
	DataModelId *string `json:"data_model_id,omitempty" xml:"data_model_id,omitempty" require:"true"`
	// 汇总数据的内容，格式遵循data_model_id制定的格式
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s SendCollectorSummarydataRequest) String() string {
	return tea.Prettify(s)
}

func (s SendCollectorSummarydataRequest) GoString() string {
	return s.String()
}

func (s *SendCollectorSummarydataRequest) SetAuthToken(v string) *SendCollectorSummarydataRequest {
	s.AuthToken = &v
	return s
}

func (s *SendCollectorSummarydataRequest) SetProductInstanceId(v string) *SendCollectorSummarydataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendCollectorSummarydataRequest) SetScene(v string) *SendCollectorSummarydataRequest {
	s.Scene = &v
	return s
}

func (s *SendCollectorSummarydataRequest) SetBizType(v string) *SendCollectorSummarydataRequest {
	s.BizType = &v
	return s
}

func (s *SendCollectorSummarydataRequest) SetSubmitDate(v string) *SendCollectorSummarydataRequest {
	s.SubmitDate = &v
	return s
}

func (s *SendCollectorSummarydataRequest) SetDataModelId(v string) *SendCollectorSummarydataRequest {
	s.DataModelId = &v
	return s
}

func (s *SendCollectorSummarydataRequest) SetContent(v string) *SendCollectorSummarydataRequest {
	s.Content = &v
	return s
}

type SendCollectorSummarydataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SendCollectorSummarydataResponse) String() string {
	return tea.Prettify(s)
}

func (s SendCollectorSummarydataResponse) GoString() string {
	return s.String()
}

func (s *SendCollectorSummarydataResponse) SetReqMsgId(v string) *SendCollectorSummarydataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendCollectorSummarydataResponse) SetResultCode(v string) *SendCollectorSummarydataResponse {
	s.ResultCode = &v
	return s
}

func (s *SendCollectorSummarydataResponse) SetResultMsg(v string) *SendCollectorSummarydataResponse {
	s.ResultMsg = &v
	return s
}

type AddCertificateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 机构Id
	OrganizationId *int64 `json:"organization_id,omitempty" xml:"organization_id,omitempty"`
	// 证书内容
	Certificate *string `json:"certificate,omitempty" xml:"certificate,omitempty" require:"true"`
	// 设备ID
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 主机设备ID
	HostDeviceId *string `json:"host_device_id,omitempty" xml:"host_device_id,omitempty" require:"true"`
	// 场景码
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
}

func (s AddCertificateRequest) String() string {
	return tea.Prettify(s)
}

func (s AddCertificateRequest) GoString() string {
	return s.String()
}

func (s *AddCertificateRequest) SetAuthToken(v string) *AddCertificateRequest {
	s.AuthToken = &v
	return s
}

func (s *AddCertificateRequest) SetProductInstanceId(v string) *AddCertificateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddCertificateRequest) SetOrganizationId(v int64) *AddCertificateRequest {
	s.OrganizationId = &v
	return s
}

func (s *AddCertificateRequest) SetCertificate(v string) *AddCertificateRequest {
	s.Certificate = &v
	return s
}

func (s *AddCertificateRequest) SetDeviceId(v string) *AddCertificateRequest {
	s.DeviceId = &v
	return s
}

func (s *AddCertificateRequest) SetHostDeviceId(v string) *AddCertificateRequest {
	s.HostDeviceId = &v
	return s
}

func (s *AddCertificateRequest) SetProjectId(v string) *AddCertificateRequest {
	s.ProjectId = &v
	return s
}

type AddCertificateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 原始数据
	RawData *string `json:"raw_data,omitempty" xml:"raw_data,omitempty"`
	// 对raw_data的签名
	PlatformSignature *string `json:"platform_signature,omitempty" xml:"platform_signature,omitempty"`
	// 执行结果成功与否
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 错误码
	ErrorCode *int64 `json:"error_code,omitempty" xml:"error_code,omitempty"`
}

func (s AddCertificateResponse) String() string {
	return tea.Prettify(s)
}

func (s AddCertificateResponse) GoString() string {
	return s.String()
}

func (s *AddCertificateResponse) SetReqMsgId(v string) *AddCertificateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddCertificateResponse) SetResultCode(v string) *AddCertificateResponse {
	s.ResultCode = &v
	return s
}

func (s *AddCertificateResponse) SetResultMsg(v string) *AddCertificateResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddCertificateResponse) SetRawData(v string) *AddCertificateResponse {
	s.RawData = &v
	return s
}

func (s *AddCertificateResponse) SetPlatformSignature(v string) *AddCertificateResponse {
	s.PlatformSignature = &v
	return s
}

func (s *AddCertificateResponse) SetSuccess(v bool) *AddCertificateResponse {
	s.Success = &v
	return s
}

func (s *AddCertificateResponse) SetErrorCode(v int64) *AddCertificateResponse {
	s.ErrorCode = &v
	return s
}

type AddTenantRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty" require:"true"`
	// 组织名称
	OrgName *string `json:"org_name,omitempty" xml:"org_name,omitempty" require:"true"`
	// 企业执照号
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty"`
	// 网关私钥
	GatewayPrivateKey *string `json:"gateway_private_key,omitempty" xml:"gateway_private_key,omitempty"`
	// 网关公钥
	GatewayPublicKey *string `json:"gateway_public_key,omitempty" xml:"gateway_public_key,omitempty"`
	// 是否需要生成秘钥对，默认为false
	GenerateGatewayKeys *bool `json:"generate_gateway_keys,omitempty" xml:"generate_gateway_keys,omitempty"`
	// 是否为测试租户
	Mock *bool `json:"mock,omitempty" xml:"mock,omitempty"`
}

func (s AddTenantRequest) String() string {
	return tea.Prettify(s)
}

func (s AddTenantRequest) GoString() string {
	return s.String()
}

func (s *AddTenantRequest) SetAuthToken(v string) *AddTenantRequest {
	s.AuthToken = &v
	return s
}

func (s *AddTenantRequest) SetProductInstanceId(v string) *AddTenantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddTenantRequest) SetTenantName(v string) *AddTenantRequest {
	s.TenantName = &v
	return s
}

func (s *AddTenantRequest) SetOrgName(v string) *AddTenantRequest {
	s.OrgName = &v
	return s
}

func (s *AddTenantRequest) SetOwner(v string) *AddTenantRequest {
	s.Owner = &v
	return s
}

func (s *AddTenantRequest) SetGatewayPrivateKey(v string) *AddTenantRequest {
	s.GatewayPrivateKey = &v
	return s
}

func (s *AddTenantRequest) SetGatewayPublicKey(v string) *AddTenantRequest {
	s.GatewayPublicKey = &v
	return s
}

func (s *AddTenantRequest) SetGenerateGatewayKeys(v bool) *AddTenantRequest {
	s.GenerateGatewayKeys = &v
	return s
}

func (s *AddTenantRequest) SetMock(v bool) *AddTenantRequest {
	s.Mock = &v
	return s
}

type AddTenantResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AddTenantResponse) String() string {
	return tea.Prettify(s)
}

func (s AddTenantResponse) GoString() string {
	return s.String()
}

func (s *AddTenantResponse) SetReqMsgId(v string) *AddTenantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddTenantResponse) SetResultCode(v string) *AddTenantResponse {
	s.ResultCode = &v
	return s
}

func (s *AddTenantResponse) SetResultMsg(v string) *AddTenantResponse {
	s.ResultMsg = &v
	return s
}

type AddSceneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景名称
	SceneName *string `json:"scene_name,omitempty" xml:"scene_name,omitempty" require:"true"`
	// 是否托管,取值范围为：NON_ESCROWED、ESCROWED
	Escrowed *string `json:"escrowed,omitempty" xml:"escrowed,omitempty" require:"true"`
	// 私钥密码
	PrivateKeyPassword *string `json:"private_key_password,omitempty" xml:"private_key_password,omitempty" require:"true"`
	// 租户
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty" require:"true"`
	// 场景类型
	SceneType *string `json:"scene_type,omitempty" xml:"scene_type,omitempty" require:"true"`
	// 是否为测试数据
	Mock *bool `json:"mock,omitempty" xml:"mock,omitempty"`
	// 拉块解析后是否推送至业务方
	LedgerstreamPushEnable *bool `json:"ledgerstream_push_enable,omitempty" xml:"ledgerstream_push_enable,omitempty"`
}

func (s AddSceneRequest) String() string {
	return tea.Prettify(s)
}

func (s AddSceneRequest) GoString() string {
	return s.String()
}

func (s *AddSceneRequest) SetAuthToken(v string) *AddSceneRequest {
	s.AuthToken = &v
	return s
}

func (s *AddSceneRequest) SetProductInstanceId(v string) *AddSceneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddSceneRequest) SetSceneName(v string) *AddSceneRequest {
	s.SceneName = &v
	return s
}

func (s *AddSceneRequest) SetEscrowed(v string) *AddSceneRequest {
	s.Escrowed = &v
	return s
}

func (s *AddSceneRequest) SetPrivateKeyPassword(v string) *AddSceneRequest {
	s.PrivateKeyPassword = &v
	return s
}

func (s *AddSceneRequest) SetTenantName(v string) *AddSceneRequest {
	s.TenantName = &v
	return s
}

func (s *AddSceneRequest) SetSceneType(v string) *AddSceneRequest {
	s.SceneType = &v
	return s
}

func (s *AddSceneRequest) SetMock(v bool) *AddSceneRequest {
	s.Mock = &v
	return s
}

func (s *AddSceneRequest) SetLedgerstreamPushEnable(v bool) *AddSceneRequest {
	s.LedgerstreamPushEnable = &v
	return s
}

type AddSceneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AddSceneResponse) String() string {
	return tea.Prettify(s)
}

func (s AddSceneResponse) GoString() string {
	return s.String()
}

func (s *AddSceneResponse) SetReqMsgId(v string) *AddSceneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddSceneResponse) SetResultCode(v string) *AddSceneResponse {
	s.ResultCode = &v
	return s
}

func (s *AddSceneResponse) SetResultMsg(v string) *AddSceneResponse {
	s.ResultMsg = &v
	return s
}

type DeploySceneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景名称
	SceneName *string `json:"scene_name,omitempty" xml:"scene_name,omitempty" require:"true"`
	// bnaas did
	BnaasBasicServiceDid *string `json:"bnaas_basic_service_did,omitempty" xml:"bnaas_basic_service_did,omitempty"`
	// baas rest bizId
	BaasRestBizId *string `json:"baas_rest_biz_id,omitempty" xml:"baas_rest_biz_id,omitempty"`
	// 合约版本号
	ContractVersion *string `json:"contract_version,omitempty" xml:"contract_version,omitempty"`
}

func (s DeploySceneRequest) String() string {
	return tea.Prettify(s)
}

func (s DeploySceneRequest) GoString() string {
	return s.String()
}

func (s *DeploySceneRequest) SetAuthToken(v string) *DeploySceneRequest {
	s.AuthToken = &v
	return s
}

func (s *DeploySceneRequest) SetProductInstanceId(v string) *DeploySceneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeploySceneRequest) SetSceneName(v string) *DeploySceneRequest {
	s.SceneName = &v
	return s
}

func (s *DeploySceneRequest) SetBnaasBasicServiceDid(v string) *DeploySceneRequest {
	s.BnaasBasicServiceDid = &v
	return s
}

func (s *DeploySceneRequest) SetBaasRestBizId(v string) *DeploySceneRequest {
	s.BaasRestBizId = &v
	return s
}

func (s *DeploySceneRequest) SetContractVersion(v string) *DeploySceneRequest {
	s.ContractVersion = &v
	return s
}

type DeploySceneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeploySceneResponse) String() string {
	return tea.Prettify(s)
}

func (s DeploySceneResponse) GoString() string {
	return s.String()
}

func (s *DeploySceneResponse) SetReqMsgId(v string) *DeploySceneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeploySceneResponse) SetResultCode(v string) *DeploySceneResponse {
	s.ResultCode = &v
	return s
}

func (s *DeploySceneResponse) SetResultMsg(v string) *DeploySceneResponse {
	s.ResultMsg = &v
	return s
}

type AddSdkRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备SDK公钥
	VerifyKey *string `json:"verify_key,omitempty" xml:"verify_key,omitempty" require:"true"`
	// SDK版本号
	SdkVersionStr *string `json:"sdk_version_str,omitempty" xml:"sdk_version_str,omitempty" require:"true"`
	// sdk模型，格式为json
	MetaModel *string `json:"meta_model,omitempty" xml:"meta_model,omitempty" require:"true"`
	// 平台
	Platform *string `json:"platform,omitempty" xml:"platform,omitempty"`
	// 公司名称
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty" require:"true"`
}

func (s AddSdkRequest) String() string {
	return tea.Prettify(s)
}

func (s AddSdkRequest) GoString() string {
	return s.String()
}

func (s *AddSdkRequest) SetAuthToken(v string) *AddSdkRequest {
	s.AuthToken = &v
	return s
}

func (s *AddSdkRequest) SetProductInstanceId(v string) *AddSdkRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddSdkRequest) SetVerifyKey(v string) *AddSdkRequest {
	s.VerifyKey = &v
	return s
}

func (s *AddSdkRequest) SetSdkVersionStr(v string) *AddSdkRequest {
	s.SdkVersionStr = &v
	return s
}

func (s *AddSdkRequest) SetMetaModel(v string) *AddSdkRequest {
	s.MetaModel = &v
	return s
}

func (s *AddSdkRequest) SetPlatform(v string) *AddSdkRequest {
	s.Platform = &v
	return s
}

func (s *AddSdkRequest) SetCorpName(v string) *AddSdkRequest {
	s.CorpName = &v
	return s
}

type AddSdkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AddSdkResponse) String() string {
	return tea.Prettify(s)
}

func (s AddSdkResponse) GoString() string {
	return s.String()
}

func (s *AddSdkResponse) SetReqMsgId(v string) *AddSdkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddSdkResponse) SetResultCode(v string) *AddSdkResponse {
	s.ResultCode = &v
	return s
}

func (s *AddSdkResponse) SetResultMsg(v string) *AddSdkResponse {
	s.ResultMsg = &v
	return s
}

type UpdateSdkRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 主键id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 设备SDK公钥
	VerifyKey *string `json:"verify_key,omitempty" xml:"verify_key,omitempty"`
	// SDK版本号
	SdkVersionStr *string `json:"sdk_version_str,omitempty" xml:"sdk_version_str,omitempty"`
	// sdk模型，格式为json
	MetaModel *string `json:"meta_model,omitempty" xml:"meta_model,omitempty"`
	// 平台
	Platform *string `json:"platform,omitempty" xml:"platform,omitempty"`
	// 公司名称
	//
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty"`
}

func (s UpdateSdkRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateSdkRequest) GoString() string {
	return s.String()
}

func (s *UpdateSdkRequest) SetAuthToken(v string) *UpdateSdkRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateSdkRequest) SetProductInstanceId(v string) *UpdateSdkRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateSdkRequest) SetId(v int64) *UpdateSdkRequest {
	s.Id = &v
	return s
}

func (s *UpdateSdkRequest) SetVerifyKey(v string) *UpdateSdkRequest {
	s.VerifyKey = &v
	return s
}

func (s *UpdateSdkRequest) SetSdkVersionStr(v string) *UpdateSdkRequest {
	s.SdkVersionStr = &v
	return s
}

func (s *UpdateSdkRequest) SetMetaModel(v string) *UpdateSdkRequest {
	s.MetaModel = &v
	return s
}

func (s *UpdateSdkRequest) SetPlatform(v string) *UpdateSdkRequest {
	s.Platform = &v
	return s
}

func (s *UpdateSdkRequest) SetCorpName(v string) *UpdateSdkRequest {
	s.CorpName = &v
	return s
}

type UpdateSdkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateSdkResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateSdkResponse) GoString() string {
	return s.String()
}

func (s *UpdateSdkResponse) SetReqMsgId(v string) *UpdateSdkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateSdkResponse) SetResultCode(v string) *UpdateSdkResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateSdkResponse) SetResultMsg(v string) *UpdateSdkResponse {
	s.ResultMsg = &v
	return s
}

type AddProductkeyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备端productKey
	ProductKey *string `json:"product_key,omitempty" xml:"product_key,omitempty" require:"true"`
	// 场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 租户ID
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty" require:"true"`
	// 数据模型
	DataModelId *string `json:"data_model_id,omitempty" xml:"data_model_id,omitempty" require:"true"`
	// sdk前缀
	SdkVersionPrefix *string `json:"sdk_version_prefix,omitempty" xml:"sdk_version_prefix,omitempty" require:"true"`
	// 制造商
	Manufacturer *string `json:"manufacturer,omitempty" xml:"manufacturer,omitempty" require:"true"`
	// 顾客
	Customer *string `json:"customer,omitempty" xml:"customer,omitempty" require:"true"`
	// 是否为测试数据
	Mock *bool `json:"mock,omitempty" xml:"mock,omitempty"`
}

func (s AddProductkeyRequest) String() string {
	return tea.Prettify(s)
}

func (s AddProductkeyRequest) GoString() string {
	return s.String()
}

func (s *AddProductkeyRequest) SetAuthToken(v string) *AddProductkeyRequest {
	s.AuthToken = &v
	return s
}

func (s *AddProductkeyRequest) SetProductInstanceId(v string) *AddProductkeyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddProductkeyRequest) SetProductKey(v string) *AddProductkeyRequest {
	s.ProductKey = &v
	return s
}

func (s *AddProductkeyRequest) SetScene(v string) *AddProductkeyRequest {
	s.Scene = &v
	return s
}

func (s *AddProductkeyRequest) SetTenantName(v string) *AddProductkeyRequest {
	s.TenantName = &v
	return s
}

func (s *AddProductkeyRequest) SetDataModelId(v string) *AddProductkeyRequest {
	s.DataModelId = &v
	return s
}

func (s *AddProductkeyRequest) SetSdkVersionPrefix(v string) *AddProductkeyRequest {
	s.SdkVersionPrefix = &v
	return s
}

func (s *AddProductkeyRequest) SetManufacturer(v string) *AddProductkeyRequest {
	s.Manufacturer = &v
	return s
}

func (s *AddProductkeyRequest) SetCustomer(v string) *AddProductkeyRequest {
	s.Customer = &v
	return s
}

func (s *AddProductkeyRequest) SetMock(v bool) *AddProductkeyRequest {
	s.Mock = &v
	return s
}

type AddProductkeyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AddProductkeyResponse) String() string {
	return tea.Prettify(s)
}

func (s AddProductkeyResponse) GoString() string {
	return s.String()
}

func (s *AddProductkeyResponse) SetReqMsgId(v string) *AddProductkeyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddProductkeyResponse) SetResultCode(v string) *AddProductkeyResponse {
	s.ResultCode = &v
	return s
}

func (s *AddProductkeyResponse) SetResultMsg(v string) *AddProductkeyResponse {
	s.ResultMsg = &v
	return s
}

type UpdateProductkeyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 主键id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 设备端productKey
	//
	ProductKey *string `json:"product_key,omitempty" xml:"product_key,omitempty"`
	// 场景码
	//
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty"`
	// 租户ID
	//
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty"`
	// 数据模型
	//
	DataModelId *string `json:"data_model_id,omitempty" xml:"data_model_id,omitempty"`
	// sdk前缀
	SdkVersionPrefix *string `json:"sdk_version_prefix,omitempty" xml:"sdk_version_prefix,omitempty"`
	// 制造商
	//
	Manufacturer *string `json:"manufacturer,omitempty" xml:"manufacturer,omitempty"`
	// 顾客
	Customer *string `json:"customer,omitempty" xml:"customer,omitempty"`
	// 是否为测试数据
	Mock *bool `json:"mock,omitempty" xml:"mock,omitempty"`
}

func (s UpdateProductkeyRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateProductkeyRequest) GoString() string {
	return s.String()
}

func (s *UpdateProductkeyRequest) SetAuthToken(v string) *UpdateProductkeyRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateProductkeyRequest) SetProductInstanceId(v string) *UpdateProductkeyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateProductkeyRequest) SetId(v int64) *UpdateProductkeyRequest {
	s.Id = &v
	return s
}

func (s *UpdateProductkeyRequest) SetProductKey(v string) *UpdateProductkeyRequest {
	s.ProductKey = &v
	return s
}

func (s *UpdateProductkeyRequest) SetScene(v string) *UpdateProductkeyRequest {
	s.Scene = &v
	return s
}

func (s *UpdateProductkeyRequest) SetTenantName(v string) *UpdateProductkeyRequest {
	s.TenantName = &v
	return s
}

func (s *UpdateProductkeyRequest) SetDataModelId(v string) *UpdateProductkeyRequest {
	s.DataModelId = &v
	return s
}

func (s *UpdateProductkeyRequest) SetSdkVersionPrefix(v string) *UpdateProductkeyRequest {
	s.SdkVersionPrefix = &v
	return s
}

func (s *UpdateProductkeyRequest) SetManufacturer(v string) *UpdateProductkeyRequest {
	s.Manufacturer = &v
	return s
}

func (s *UpdateProductkeyRequest) SetCustomer(v string) *UpdateProductkeyRequest {
	s.Customer = &v
	return s
}

func (s *UpdateProductkeyRequest) SetMock(v bool) *UpdateProductkeyRequest {
	s.Mock = &v
	return s
}

type UpdateProductkeyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateProductkeyResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateProductkeyResponse) GoString() string {
	return s.String()
}

func (s *UpdateProductkeyResponse) SetReqMsgId(v string) *UpdateProductkeyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateProductkeyResponse) SetResultCode(v string) *UpdateProductkeyResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateProductkeyResponse) SetResultMsg(v string) *UpdateProductkeyResponse {
	s.ResultMsg = &v
	return s
}

type UpdateTenantRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 主键Id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 租户
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty"`
	// 组织名称
	OrgName *string `json:"org_name,omitempty" xml:"org_name,omitempty"`
	// 企业执照号
	//
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty"`
	// 网关私钥
	//
	GatewayPrivateKey *string `json:"gateway_private_key,omitempty" xml:"gateway_private_key,omitempty"`
	// 网关公钥
	//
	GatewayPublicKey *string `json:"gateway_public_key,omitempty" xml:"gateway_public_key,omitempty"`
	// 是否为测试租户
	Mock *bool `json:"mock,omitempty" xml:"mock,omitempty"`
}

func (s UpdateTenantRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateTenantRequest) GoString() string {
	return s.String()
}

func (s *UpdateTenantRequest) SetAuthToken(v string) *UpdateTenantRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateTenantRequest) SetProductInstanceId(v string) *UpdateTenantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateTenantRequest) SetId(v int64) *UpdateTenantRequest {
	s.Id = &v
	return s
}

func (s *UpdateTenantRequest) SetTenantName(v string) *UpdateTenantRequest {
	s.TenantName = &v
	return s
}

func (s *UpdateTenantRequest) SetOrgName(v string) *UpdateTenantRequest {
	s.OrgName = &v
	return s
}

func (s *UpdateTenantRequest) SetOwner(v string) *UpdateTenantRequest {
	s.Owner = &v
	return s
}

func (s *UpdateTenantRequest) SetGatewayPrivateKey(v string) *UpdateTenantRequest {
	s.GatewayPrivateKey = &v
	return s
}

func (s *UpdateTenantRequest) SetGatewayPublicKey(v string) *UpdateTenantRequest {
	s.GatewayPublicKey = &v
	return s
}

func (s *UpdateTenantRequest) SetMock(v bool) *UpdateTenantRequest {
	s.Mock = &v
	return s
}

type UpdateTenantResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateTenantResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateTenantResponse) GoString() string {
	return s.String()
}

func (s *UpdateTenantResponse) SetReqMsgId(v string) *UpdateTenantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateTenantResponse) SetResultCode(v string) *UpdateTenantResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateTenantResponse) SetResultMsg(v string) *UpdateTenantResponse {
	s.ResultMsg = &v
	return s
}

type UpdateSceneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 主键Id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 是否跳过中台数据校验处理
	SkipPegasus *bool `json:"skip_pegasus,omitempty" xml:"skip_pegasus,omitempty" require:"true"`
	// 场景名称
	//
	SceneName *string `json:"scene_name,omitempty" xml:"scene_name,omitempty"`
	// 租户
	//
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty"`
	// 场景类型
	//
	SceneType *string `json:"scene_type,omitempty" xml:"scene_type,omitempty"`
	// 定制数据处理类 , 使用用逗号分隔
	CustomerProcessor *string `json:"customer_processor,omitempty" xml:"customer_processor,omitempty"`
	// 是否为测试数据
	Mock *bool `json:"mock,omitempty" xml:"mock,omitempty"`
}

func (s UpdateSceneRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateSceneRequest) GoString() string {
	return s.String()
}

func (s *UpdateSceneRequest) SetAuthToken(v string) *UpdateSceneRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateSceneRequest) SetProductInstanceId(v string) *UpdateSceneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateSceneRequest) SetId(v int64) *UpdateSceneRequest {
	s.Id = &v
	return s
}

func (s *UpdateSceneRequest) SetSkipPegasus(v bool) *UpdateSceneRequest {
	s.SkipPegasus = &v
	return s
}

func (s *UpdateSceneRequest) SetSceneName(v string) *UpdateSceneRequest {
	s.SceneName = &v
	return s
}

func (s *UpdateSceneRequest) SetTenantName(v string) *UpdateSceneRequest {
	s.TenantName = &v
	return s
}

func (s *UpdateSceneRequest) SetSceneType(v string) *UpdateSceneRequest {
	s.SceneType = &v
	return s
}

func (s *UpdateSceneRequest) SetCustomerProcessor(v string) *UpdateSceneRequest {
	s.CustomerProcessor = &v
	return s
}

func (s *UpdateSceneRequest) SetMock(v bool) *UpdateSceneRequest {
	s.Mock = &v
	return s
}

type UpdateSceneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateSceneResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateSceneResponse) GoString() string {
	return s.String()
}

func (s *UpdateSceneResponse) SetReqMsgId(v string) *UpdateSceneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateSceneResponse) SetResultCode(v string) *UpdateSceneResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateSceneResponse) SetResultMsg(v string) *UpdateSceneResponse {
	s.ResultMsg = &v
	return s
}

type SendLabelTransferonasyncRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	//
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 收集的标签流转数据
	CollectLabelContentList []*CollectLabelContent `json:"collect_label_content_list,omitempty" xml:"collect_label_content_list,omitempty" require:"true" type:"Repeated"`
	// 业务号，防重放
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty" require:"true"`
	// 1 业务端查询结果的最晚时间
	// 2 单位：天，最大值为30 天
	// 3 在responsePeriod 天之后，调用异步接口结果查询 将 无法获取异步接口的执行结果
	ResponsePeriod *int64 `json:"response_period,omitempty" xml:"response_period,omitempty" require:"true"`
}

func (s SendLabelTransferonasyncRequest) String() string {
	return tea.Prettify(s)
}

func (s SendLabelTransferonasyncRequest) GoString() string {
	return s.String()
}

func (s *SendLabelTransferonasyncRequest) SetAuthToken(v string) *SendLabelTransferonasyncRequest {
	s.AuthToken = &v
	return s
}

func (s *SendLabelTransferonasyncRequest) SetProductInstanceId(v string) *SendLabelTransferonasyncRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendLabelTransferonasyncRequest) SetScene(v string) *SendLabelTransferonasyncRequest {
	s.Scene = &v
	return s
}

func (s *SendLabelTransferonasyncRequest) SetCollectLabelContentList(v []*CollectLabelContent) *SendLabelTransferonasyncRequest {
	s.CollectLabelContentList = v
	return s
}

func (s *SendLabelTransferonasyncRequest) SetNonce(v string) *SendLabelTransferonasyncRequest {
	s.Nonce = &v
	return s
}

func (s *SendLabelTransferonasyncRequest) SetResponsePeriod(v int64) *SendLabelTransferonasyncRequest {
	s.ResponsePeriod = &v
	return s
}

type SendLabelTransferonasyncResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 接口请求的唯一标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s SendLabelTransferonasyncResponse) String() string {
	return tea.Prettify(s)
}

func (s SendLabelTransferonasyncResponse) GoString() string {
	return s.String()
}

func (s *SendLabelTransferonasyncResponse) SetReqMsgId(v string) *SendLabelTransferonasyncResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendLabelTransferonasyncResponse) SetResultCode(v string) *SendLabelTransferonasyncResponse {
	s.ResultCode = &v
	return s
}

func (s *SendLabelTransferonasyncResponse) SetResultMsg(v string) *SendLabelTransferonasyncResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendLabelTransferonasyncResponse) SetRequestId(v string) *SendLabelTransferonasyncResponse {
	s.RequestId = &v
	return s
}

type QueryAsyncRequestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求的唯一标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
}

func (s QueryAsyncRequestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAsyncRequestRequest) GoString() string {
	return s.String()
}

func (s *QueryAsyncRequestRequest) SetAuthToken(v string) *QueryAsyncRequestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAsyncRequestRequest) SetProductInstanceId(v string) *QueryAsyncRequestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAsyncRequestRequest) SetRequestId(v string) *QueryAsyncRequestRequest {
	s.RequestId = &v
	return s
}

type QueryAsyncRequestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 执行状态 枚举
	// RUNNING	请求正在处理
	// SUCCESS	请求处理成功
	// FAILED	请求处理失败
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 异步接口的执行结果 ：根据同步接口的出参构建的JSON字符串
	Response *string `json:"response,omitempty" xml:"response,omitempty"`
}

func (s QueryAsyncRequestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAsyncRequestResponse) GoString() string {
	return s.String()
}

func (s *QueryAsyncRequestResponse) SetReqMsgId(v string) *QueryAsyncRequestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAsyncRequestResponse) SetResultCode(v string) *QueryAsyncRequestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAsyncRequestResponse) SetResultMsg(v string) *QueryAsyncRequestResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAsyncRequestResponse) SetStatus(v string) *QueryAsyncRequestResponse {
	s.Status = &v
	return s
}

func (s *QueryAsyncRequestResponse) SetResponse(v string) *QueryAsyncRequestResponse {
	s.Response = &v
	return s
}

type PagequeryTenantRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 页数，默认1
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
	// 页码大小，默认10，最大100
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 租户
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty"`
	// 是否为测试数据
	Mock *bool `json:"mock,omitempty" xml:"mock,omitempty"`
}

func (s PagequeryTenantRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryTenantRequest) GoString() string {
	return s.String()
}

func (s *PagequeryTenantRequest) SetAuthToken(v string) *PagequeryTenantRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryTenantRequest) SetProductInstanceId(v string) *PagequeryTenantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryTenantRequest) SetPageIndex(v int64) *PagequeryTenantRequest {
	s.PageIndex = &v
	return s
}

func (s *PagequeryTenantRequest) SetPageSize(v int64) *PagequeryTenantRequest {
	s.PageSize = &v
	return s
}

func (s *PagequeryTenantRequest) SetTenantName(v string) *PagequeryTenantRequest {
	s.TenantName = &v
	return s
}

func (s *PagequeryTenantRequest) SetMock(v bool) *PagequeryTenantRequest {
	s.Mock = &v
	return s
}

type PagequeryTenantResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分页查询结果
	Data *PermissionedTenantPageResponse `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PagequeryTenantResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryTenantResponse) GoString() string {
	return s.String()
}

func (s *PagequeryTenantResponse) SetReqMsgId(v string) *PagequeryTenantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryTenantResponse) SetResultCode(v string) *PagequeryTenantResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryTenantResponse) SetResultMsg(v string) *PagequeryTenantResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryTenantResponse) SetData(v *PermissionedTenantPageResponse) *PagequeryTenantResponse {
	s.Data = v
	return s
}

type PagequerySceneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 页数，默认1
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
	// 页码大小，默认10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 场景码
	SceneName *string `json:"scene_name,omitempty" xml:"scene_name,omitempty"`
	// 租户
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty"`
	// 是否为测试数据
	Mock *bool `json:"mock,omitempty" xml:"mock,omitempty"`
}

func (s PagequerySceneRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequerySceneRequest) GoString() string {
	return s.String()
}

func (s *PagequerySceneRequest) SetAuthToken(v string) *PagequerySceneRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequerySceneRequest) SetProductInstanceId(v string) *PagequerySceneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequerySceneRequest) SetPageIndex(v int64) *PagequerySceneRequest {
	s.PageIndex = &v
	return s
}

func (s *PagequerySceneRequest) SetPageSize(v int64) *PagequerySceneRequest {
	s.PageSize = &v
	return s
}

func (s *PagequerySceneRequest) SetSceneName(v string) *PagequerySceneRequest {
	s.SceneName = &v
	return s
}

func (s *PagequerySceneRequest) SetTenantName(v string) *PagequerySceneRequest {
	s.TenantName = &v
	return s
}

func (s *PagequerySceneRequest) SetMock(v bool) *PagequerySceneRequest {
	s.Mock = &v
	return s
}

type PagequerySceneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分页查询结果
	Data *ScenePageResponse `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PagequerySceneResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequerySceneResponse) GoString() string {
	return s.String()
}

func (s *PagequerySceneResponse) SetReqMsgId(v string) *PagequerySceneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequerySceneResponse) SetResultCode(v string) *PagequerySceneResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequerySceneResponse) SetResultMsg(v string) *PagequerySceneResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequerySceneResponse) SetData(v *ScenePageResponse) *PagequerySceneResponse {
	s.Data = v
	return s
}

type PagequerySdkRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 页数，默认1
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
	// 页码大小，默认10，最大100
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// sdk版本号
	SdkVersionStr *string `json:"sdk_version_str,omitempty" xml:"sdk_version_str,omitempty"`
	// 公司名称
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty"`
}

func (s PagequerySdkRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequerySdkRequest) GoString() string {
	return s.String()
}

func (s *PagequerySdkRequest) SetAuthToken(v string) *PagequerySdkRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequerySdkRequest) SetProductInstanceId(v string) *PagequerySdkRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequerySdkRequest) SetPageIndex(v int64) *PagequerySdkRequest {
	s.PageIndex = &v
	return s
}

func (s *PagequerySdkRequest) SetPageSize(v int64) *PagequerySdkRequest {
	s.PageSize = &v
	return s
}

func (s *PagequerySdkRequest) SetSdkVersionStr(v string) *PagequerySdkRequest {
	s.SdkVersionStr = &v
	return s
}

func (s *PagequerySdkRequest) SetCorpName(v string) *PagequerySdkRequest {
	s.CorpName = &v
	return s
}

type PagequerySdkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分页查询结果
	Data *SdkPageResponse `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PagequerySdkResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequerySdkResponse) GoString() string {
	return s.String()
}

func (s *PagequerySdkResponse) SetReqMsgId(v string) *PagequerySdkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequerySdkResponse) SetResultCode(v string) *PagequerySdkResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequerySdkResponse) SetResultMsg(v string) *PagequerySdkResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequerySdkResponse) SetData(v *SdkPageResponse) *PagequerySdkResponse {
	s.Data = v
	return s
}

type PagequeryProductkeyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 页数，默认1
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
	// 页码大小，默认10，最大100
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 设备端productKey
	ProductKey *string `json:"product_key,omitempty" xml:"product_key,omitempty"`
	// 场景码
	//
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty"`
	// 租户ID
	//
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty"`
	// 是否为测试数据
	Mock *bool `json:"mock,omitempty" xml:"mock,omitempty"`
}

func (s PagequeryProductkeyRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryProductkeyRequest) GoString() string {
	return s.String()
}

func (s *PagequeryProductkeyRequest) SetAuthToken(v string) *PagequeryProductkeyRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryProductkeyRequest) SetProductInstanceId(v string) *PagequeryProductkeyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryProductkeyRequest) SetPageIndex(v int64) *PagequeryProductkeyRequest {
	s.PageIndex = &v
	return s
}

func (s *PagequeryProductkeyRequest) SetPageSize(v int64) *PagequeryProductkeyRequest {
	s.PageSize = &v
	return s
}

func (s *PagequeryProductkeyRequest) SetProductKey(v string) *PagequeryProductkeyRequest {
	s.ProductKey = &v
	return s
}

func (s *PagequeryProductkeyRequest) SetScene(v string) *PagequeryProductkeyRequest {
	s.Scene = &v
	return s
}

func (s *PagequeryProductkeyRequest) SetTenantName(v string) *PagequeryProductkeyRequest {
	s.TenantName = &v
	return s
}

func (s *PagequeryProductkeyRequest) SetMock(v bool) *PagequeryProductkeyRequest {
	s.Mock = &v
	return s
}

type PagequeryProductkeyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分页查询结果
	Data *ProductKeyPageResponse `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PagequeryProductkeyResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryProductkeyResponse) GoString() string {
	return s.String()
}

func (s *PagequeryProductkeyResponse) SetReqMsgId(v string) *PagequeryProductkeyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryProductkeyResponse) SetResultCode(v string) *PagequeryProductkeyResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryProductkeyResponse) SetResultMsg(v string) *PagequeryProductkeyResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryProductkeyResponse) SetData(v *ProductKeyPageResponse) *PagequeryProductkeyResponse {
	s.Data = v
	return s
}

type PagequeryDataverifyFailureRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 页数，默认1
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
	// 页码大小，默认10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 场景码
	//
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 起始查询时间
	StartDate *string `json:"start_date,omitempty" xml:"start_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 结束查询时间
	EndDate *string `json:"end_date,omitempty" xml:"end_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 设备ID（模糊查询）
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty"`
	// 数据来源：0(普通数据上报)；1(MAAS数据上报)；2(设备业务数据上报);3(标签流转)
	Source *int64 `json:"source,omitempty" xml:"source,omitempty"`
	// 类型：0:数据上报;1:数据完整性校验
	Type *int64 `json:"type,omitempty" xml:"type,omitempty"`
}

func (s PagequeryDataverifyFailureRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryDataverifyFailureRequest) GoString() string {
	return s.String()
}

func (s *PagequeryDataverifyFailureRequest) SetAuthToken(v string) *PagequeryDataverifyFailureRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryDataverifyFailureRequest) SetProductInstanceId(v string) *PagequeryDataverifyFailureRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryDataverifyFailureRequest) SetPageIndex(v int64) *PagequeryDataverifyFailureRequest {
	s.PageIndex = &v
	return s
}

func (s *PagequeryDataverifyFailureRequest) SetPageSize(v int64) *PagequeryDataverifyFailureRequest {
	s.PageSize = &v
	return s
}

func (s *PagequeryDataverifyFailureRequest) SetScene(v string) *PagequeryDataverifyFailureRequest {
	s.Scene = &v
	return s
}

func (s *PagequeryDataverifyFailureRequest) SetStartDate(v string) *PagequeryDataverifyFailureRequest {
	s.StartDate = &v
	return s
}

func (s *PagequeryDataverifyFailureRequest) SetEndDate(v string) *PagequeryDataverifyFailureRequest {
	s.EndDate = &v
	return s
}

func (s *PagequeryDataverifyFailureRequest) SetDeviceId(v string) *PagequeryDataverifyFailureRequest {
	s.DeviceId = &v
	return s
}

func (s *PagequeryDataverifyFailureRequest) SetSource(v int64) *PagequeryDataverifyFailureRequest {
	s.Source = &v
	return s
}

func (s *PagequeryDataverifyFailureRequest) SetType(v int64) *PagequeryDataverifyFailureRequest {
	s.Type = &v
	return s
}

type PagequeryDataverifyFailureResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据
	Data *DataVerifyFailureDataPageResponse `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PagequeryDataverifyFailureResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryDataverifyFailureResponse) GoString() string {
	return s.String()
}

func (s *PagequeryDataverifyFailureResponse) SetReqMsgId(v string) *PagequeryDataverifyFailureResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryDataverifyFailureResponse) SetResultCode(v string) *PagequeryDataverifyFailureResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryDataverifyFailureResponse) SetResultMsg(v string) *PagequeryDataverifyFailureResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryDataverifyFailureResponse) SetData(v *DataVerifyFailureDataPageResponse) *PagequeryDataverifyFailureResponse {
	s.Data = v
	return s
}

type AddAlertStrategyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty" require:"true"`
	// 场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty"`
	// 策略类型：DEBUG（技术联调）；MONITOR（生产监控）
	StrategyType *string `json:"strategy_type,omitempty" xml:"strategy_type,omitempty" require:"true"`
	// 策略详情，json格式
	StrategyDetail *string `json:"strategy_detail,omitempty" xml:"strategy_detail,omitempty" require:"true"`
	// 是否启用，默认false
	Enabled *bool `json:"enabled,omitempty" xml:"enabled,omitempty" require:"true"`
	// 备注
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
}

func (s AddAlertStrategyRequest) String() string {
	return tea.Prettify(s)
}

func (s AddAlertStrategyRequest) GoString() string {
	return s.String()
}

func (s *AddAlertStrategyRequest) SetAuthToken(v string) *AddAlertStrategyRequest {
	s.AuthToken = &v
	return s
}

func (s *AddAlertStrategyRequest) SetProductInstanceId(v string) *AddAlertStrategyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddAlertStrategyRequest) SetTenantName(v string) *AddAlertStrategyRequest {
	s.TenantName = &v
	return s
}

func (s *AddAlertStrategyRequest) SetScene(v string) *AddAlertStrategyRequest {
	s.Scene = &v
	return s
}

func (s *AddAlertStrategyRequest) SetStrategyType(v string) *AddAlertStrategyRequest {
	s.StrategyType = &v
	return s
}

func (s *AddAlertStrategyRequest) SetStrategyDetail(v string) *AddAlertStrategyRequest {
	s.StrategyDetail = &v
	return s
}

func (s *AddAlertStrategyRequest) SetEnabled(v bool) *AddAlertStrategyRequest {
	s.Enabled = &v
	return s
}

func (s *AddAlertStrategyRequest) SetRemark(v string) *AddAlertStrategyRequest {
	s.Remark = &v
	return s
}

type AddAlertStrategyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AddAlertStrategyResponse) String() string {
	return tea.Prettify(s)
}

func (s AddAlertStrategyResponse) GoString() string {
	return s.String()
}

func (s *AddAlertStrategyResponse) SetReqMsgId(v string) *AddAlertStrategyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddAlertStrategyResponse) SetResultCode(v string) *AddAlertStrategyResponse {
	s.ResultCode = &v
	return s
}

func (s *AddAlertStrategyResponse) SetResultMsg(v string) *AddAlertStrategyResponse {
	s.ResultMsg = &v
	return s
}

type UpdateAlertStrategyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 主键ID，更新依据
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 租户
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty"`
	// 场景码
	//
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty"`
	// 策略类型：DEBUG（技术联调）；MONITOR（生产监控）
	StrategyType *string `json:"strategy_type,omitempty" xml:"strategy_type,omitempty"`
	// 策略详情，json格式
	StrategyDetail *string `json:"strategy_detail,omitempty" xml:"strategy_detail,omitempty"`
	// 是否启用，默认false
	Enabled *bool `json:"enabled,omitempty" xml:"enabled,omitempty" require:"true"`
	// 备注
	//
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
}

func (s UpdateAlertStrategyRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAlertStrategyRequest) GoString() string {
	return s.String()
}

func (s *UpdateAlertStrategyRequest) SetAuthToken(v string) *UpdateAlertStrategyRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAlertStrategyRequest) SetProductInstanceId(v string) *UpdateAlertStrategyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAlertStrategyRequest) SetId(v int64) *UpdateAlertStrategyRequest {
	s.Id = &v
	return s
}

func (s *UpdateAlertStrategyRequest) SetTenantName(v string) *UpdateAlertStrategyRequest {
	s.TenantName = &v
	return s
}

func (s *UpdateAlertStrategyRequest) SetScene(v string) *UpdateAlertStrategyRequest {
	s.Scene = &v
	return s
}

func (s *UpdateAlertStrategyRequest) SetStrategyType(v string) *UpdateAlertStrategyRequest {
	s.StrategyType = &v
	return s
}

func (s *UpdateAlertStrategyRequest) SetStrategyDetail(v string) *UpdateAlertStrategyRequest {
	s.StrategyDetail = &v
	return s
}

func (s *UpdateAlertStrategyRequest) SetEnabled(v bool) *UpdateAlertStrategyRequest {
	s.Enabled = &v
	return s
}

func (s *UpdateAlertStrategyRequest) SetRemark(v string) *UpdateAlertStrategyRequest {
	s.Remark = &v
	return s
}

type UpdateAlertStrategyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAlertStrategyResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAlertStrategyResponse) GoString() string {
	return s.String()
}

func (s *UpdateAlertStrategyResponse) SetReqMsgId(v string) *UpdateAlertStrategyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAlertStrategyResponse) SetResultCode(v string) *UpdateAlertStrategyResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAlertStrategyResponse) SetResultMsg(v string) *UpdateAlertStrategyResponse {
	s.ResultMsg = &v
	return s
}

type PagequeryAlertStrategyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 页数，默认1
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
	// 页码大小，默认10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 租户
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty"`
	// 场景码
	//
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty"`
}

func (s PagequeryAlertStrategyRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryAlertStrategyRequest) GoString() string {
	return s.String()
}

func (s *PagequeryAlertStrategyRequest) SetAuthToken(v string) *PagequeryAlertStrategyRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryAlertStrategyRequest) SetProductInstanceId(v string) *PagequeryAlertStrategyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryAlertStrategyRequest) SetPageIndex(v int64) *PagequeryAlertStrategyRequest {
	s.PageIndex = &v
	return s
}

func (s *PagequeryAlertStrategyRequest) SetPageSize(v int64) *PagequeryAlertStrategyRequest {
	s.PageSize = &v
	return s
}

func (s *PagequeryAlertStrategyRequest) SetTenantName(v string) *PagequeryAlertStrategyRequest {
	s.TenantName = &v
	return s
}

func (s *PagequeryAlertStrategyRequest) SetScene(v string) *PagequeryAlertStrategyRequest {
	s.Scene = &v
	return s
}

type PagequeryAlertStrategyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据
	Data *AlertStrategyPageResponse `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PagequeryAlertStrategyResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryAlertStrategyResponse) GoString() string {
	return s.String()
}

func (s *PagequeryAlertStrategyResponse) SetReqMsgId(v string) *PagequeryAlertStrategyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryAlertStrategyResponse) SetResultCode(v string) *PagequeryAlertStrategyResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryAlertStrategyResponse) SetResultMsg(v string) *PagequeryAlertStrategyResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryAlertStrategyResponse) SetData(v *AlertStrategyPageResponse) *PagequeryAlertStrategyResponse {
	s.Data = v
	return s
}

type SyncLabelTransferrawRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	//
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 收集标签数据
	CollectLabelRawContentList []*CollectLabelRawContent `json:"collect_label_raw_content_list,omitempty" xml:"collect_label_raw_content_list,omitempty" require:"true" type:"Repeated"`
	// 业务号
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty" require:"true"`
}

func (s SyncLabelTransferrawRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncLabelTransferrawRequest) GoString() string {
	return s.String()
}

func (s *SyncLabelTransferrawRequest) SetAuthToken(v string) *SyncLabelTransferrawRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncLabelTransferrawRequest) SetProductInstanceId(v string) *SyncLabelTransferrawRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncLabelTransferrawRequest) SetScene(v string) *SyncLabelTransferrawRequest {
	s.Scene = &v
	return s
}

func (s *SyncLabelTransferrawRequest) SetCollectLabelRawContentList(v []*CollectLabelRawContent) *SyncLabelTransferrawRequest {
	s.CollectLabelRawContentList = v
	return s
}

func (s *SyncLabelTransferrawRequest) SetNonce(v string) *SyncLabelTransferrawRequest {
	s.Nonce = &v
	return s
}

type SyncLabelTransferrawResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 标签上链hash返回
	ResultList []*LabelChainResult `json:"result_list,omitempty" xml:"result_list,omitempty" type:"Repeated"`
}

func (s SyncLabelTransferrawResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncLabelTransferrawResponse) GoString() string {
	return s.String()
}

func (s *SyncLabelTransferrawResponse) SetReqMsgId(v string) *SyncLabelTransferrawResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncLabelTransferrawResponse) SetResultCode(v string) *SyncLabelTransferrawResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncLabelTransferrawResponse) SetResultMsg(v string) *SyncLabelTransferrawResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncLabelTransferrawResponse) SetResultList(v []*LabelChainResult) *SyncLabelTransferrawResponse {
	s.ResultList = v
	return s
}

type SendLabelTransferrawonasyncRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	//
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 收集的标签流转数据
	CollectLabelRawContentList []*CollectLabelRawContent `json:"collect_label_raw_content_list,omitempty" xml:"collect_label_raw_content_list,omitempty" require:"true" type:"Repeated"`
	// 业务号，防重放
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty" require:"true"`
	// 1 业务端查询结果的最晚时间 2 单位：天，最大值为30 天 3 在responsePeriod 天之后，调用异步接口结果查询 将 无法获取异步接口的执行结果
	ResponsePeriod *int64 `json:"response_period,omitempty" xml:"response_period,omitempty" require:"true"`
}

func (s SendLabelTransferrawonasyncRequest) String() string {
	return tea.Prettify(s)
}

func (s SendLabelTransferrawonasyncRequest) GoString() string {
	return s.String()
}

func (s *SendLabelTransferrawonasyncRequest) SetAuthToken(v string) *SendLabelTransferrawonasyncRequest {
	s.AuthToken = &v
	return s
}

func (s *SendLabelTransferrawonasyncRequest) SetProductInstanceId(v string) *SendLabelTransferrawonasyncRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendLabelTransferrawonasyncRequest) SetScene(v string) *SendLabelTransferrawonasyncRequest {
	s.Scene = &v
	return s
}

func (s *SendLabelTransferrawonasyncRequest) SetCollectLabelRawContentList(v []*CollectLabelRawContent) *SendLabelTransferrawonasyncRequest {
	s.CollectLabelRawContentList = v
	return s
}

func (s *SendLabelTransferrawonasyncRequest) SetNonce(v string) *SendLabelTransferrawonasyncRequest {
	s.Nonce = &v
	return s
}

func (s *SendLabelTransferrawonasyncRequest) SetResponsePeriod(v int64) *SendLabelTransferrawonasyncRequest {
	s.ResponsePeriod = &v
	return s
}

type SendLabelTransferrawonasyncResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 接口请求的唯一标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s SendLabelTransferrawonasyncResponse) String() string {
	return tea.Prettify(s)
}

func (s SendLabelTransferrawonasyncResponse) GoString() string {
	return s.String()
}

func (s *SendLabelTransferrawonasyncResponse) SetReqMsgId(v string) *SendLabelTransferrawonasyncResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendLabelTransferrawonasyncResponse) SetResultCode(v string) *SendLabelTransferrawonasyncResponse {
	s.ResultCode = &v
	return s
}

func (s *SendLabelTransferrawonasyncResponse) SetResultMsg(v string) *SendLabelTransferrawonasyncResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendLabelTransferrawonasyncResponse) SetRequestId(v string) *SendLabelTransferrawonasyncResponse {
	s.RequestId = &v
	return s
}

type QueryDockedDataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 1. 已对接的接口名 ;
	// 2. docked_method可通过 实例化SDK中的Request模型后获取，例如：
	// String dockedMethod = new CreateDeviceDatamodelRequest().getMethod();
	DockedMethod *string `json:"docked_method,omitempty" xml:"docked_method,omitempty" require:"true"`
	// 关键key为chainDeviceId 时不填
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty"`
	// 1. 接口中的关键key ，例如 deviceId ；
	// 2. key为chainDeviceId时，scene字段不填
	//
	Key []*string `json:"key,omitempty" xml:"key,omitempty" type:"Repeated"`
}

func (s QueryDockedDataRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDockedDataRequest) GoString() string {
	return s.String()
}

func (s *QueryDockedDataRequest) SetAuthToken(v string) *QueryDockedDataRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDockedDataRequest) SetProductInstanceId(v string) *QueryDockedDataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDockedDataRequest) SetDockedMethod(v string) *QueryDockedDataRequest {
	s.DockedMethod = &v
	return s
}

func (s *QueryDockedDataRequest) SetScene(v string) *QueryDockedDataRequest {
	s.Scene = &v
	return s
}

func (s *QueryDockedDataRequest) SetKey(v []*string) *QueryDockedDataRequest {
	s.Key = v
	return s
}

type QueryDockedDataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 1. 根据不同的method返回不同的数据内容
	// 2. markdown格式的内容
	Result []*string `json:"result,omitempty" xml:"result,omitempty" type:"Repeated"`
}

func (s QueryDockedDataResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDockedDataResponse) GoString() string {
	return s.String()
}

func (s *QueryDockedDataResponse) SetReqMsgId(v string) *QueryDockedDataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDockedDataResponse) SetResultCode(v string) *QueryDockedDataResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDockedDataResponse) SetResultMsg(v string) *QueryDockedDataResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDockedDataResponse) SetResult(v []*string) *QueryDockedDataResponse {
	s.Result = v
	return s
}

type CreateDeviceRelationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 主设备链上id
	SubjectChainDeviceId *string `json:"subject_chain_device_id,omitempty" xml:"subject_chain_device_id,omitempty" require:"true"`
	// 关系谓语，目前的取值范围：SUB_DEVICE（子设备）
	Predicate *string `json:"predicate,omitempty" xml:"predicate,omitempty" require:"true"`
	// 关联设备链上id列表
	ObjectChainDeviceIdList []*string `json:"object_chain_device_id_list,omitempty" xml:"object_chain_device_id_list,omitempty" require:"true" type:"Repeated"`
}

func (s CreateDeviceRelationRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDeviceRelationRequest) GoString() string {
	return s.String()
}

func (s *CreateDeviceRelationRequest) SetAuthToken(v string) *CreateDeviceRelationRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDeviceRelationRequest) SetProductInstanceId(v string) *CreateDeviceRelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDeviceRelationRequest) SetSubjectChainDeviceId(v string) *CreateDeviceRelationRequest {
	s.SubjectChainDeviceId = &v
	return s
}

func (s *CreateDeviceRelationRequest) SetPredicate(v string) *CreateDeviceRelationRequest {
	s.Predicate = &v
	return s
}

func (s *CreateDeviceRelationRequest) SetObjectChainDeviceIdList(v []*string) *CreateDeviceRelationRequest {
	s.ObjectChainDeviceIdList = v
	return s
}

type CreateDeviceRelationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateDeviceRelationResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDeviceRelationResponse) GoString() string {
	return s.String()
}

func (s *CreateDeviceRelationResponse) SetReqMsgId(v string) *CreateDeviceRelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDeviceRelationResponse) SetResultCode(v string) *CreateDeviceRelationResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDeviceRelationResponse) SetResultMsg(v string) *CreateDeviceRelationResponse {
	s.ResultMsg = &v
	return s
}

type DeleteDeviceRelationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 主设备链上id
	SubjectChainDeviceId *string `json:"subject_chain_device_id,omitempty" xml:"subject_chain_device_id,omitempty" require:"true"`
	// 关系谓语，目前取值范围：SUB_DEVICE（子设备）
	Predicate *string `json:"predicate,omitempty" xml:"predicate,omitempty" require:"true"`
	// 关联设备链上id
	ObjectChainDeviceId *string `json:"object_chain_device_id,omitempty" xml:"object_chain_device_id,omitempty" require:"true"`
}

func (s DeleteDeviceRelationRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteDeviceRelationRequest) GoString() string {
	return s.String()
}

func (s *DeleteDeviceRelationRequest) SetAuthToken(v string) *DeleteDeviceRelationRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteDeviceRelationRequest) SetProductInstanceId(v string) *DeleteDeviceRelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteDeviceRelationRequest) SetSubjectChainDeviceId(v string) *DeleteDeviceRelationRequest {
	s.SubjectChainDeviceId = &v
	return s
}

func (s *DeleteDeviceRelationRequest) SetPredicate(v string) *DeleteDeviceRelationRequest {
	s.Predicate = &v
	return s
}

func (s *DeleteDeviceRelationRequest) SetObjectChainDeviceId(v string) *DeleteDeviceRelationRequest {
	s.ObjectChainDeviceId = &v
	return s
}

type DeleteDeviceRelationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteDeviceRelationResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteDeviceRelationResponse) GoString() string {
	return s.String()
}

func (s *DeleteDeviceRelationResponse) SetReqMsgId(v string) *DeleteDeviceRelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteDeviceRelationResponse) SetResultCode(v string) *DeleteDeviceRelationResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteDeviceRelationResponse) SetResultMsg(v string) *DeleteDeviceRelationResponse {
	s.ResultMsg = &v
	return s
}

type PushCollectotBychainidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链上设备Id
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty" require:"true"`
	// 收集数据
	CollectContentList []*CollectContent `json:"collect_content_list,omitempty" xml:"collect_content_list,omitempty" require:"true" type:"Repeated"`
	// 随机数，防重放
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty" require:"true"`
	// 数据模型Id
	DataModelId *string `json:"data_model_id,omitempty" xml:"data_model_id,omitempty"`
}

func (s PushCollectotBychainidRequest) String() string {
	return tea.Prettify(s)
}

func (s PushCollectotBychainidRequest) GoString() string {
	return s.String()
}

func (s *PushCollectotBychainidRequest) SetAuthToken(v string) *PushCollectotBychainidRequest {
	s.AuthToken = &v
	return s
}

func (s *PushCollectotBychainidRequest) SetProductInstanceId(v string) *PushCollectotBychainidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushCollectotBychainidRequest) SetChainDeviceId(v string) *PushCollectotBychainidRequest {
	s.ChainDeviceId = &v
	return s
}

func (s *PushCollectotBychainidRequest) SetCollectContentList(v []*CollectContent) *PushCollectotBychainidRequest {
	s.CollectContentList = v
	return s
}

func (s *PushCollectotBychainidRequest) SetNonce(v string) *PushCollectotBychainidRequest {
	s.Nonce = &v
	return s
}

func (s *PushCollectotBychainidRequest) SetDataModelId(v string) *PushCollectotBychainidRequest {
	s.DataModelId = &v
	return s
}

type PushCollectotBychainidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 推送结果
	PushResult *bool `json:"push_result,omitempty" xml:"push_result,omitempty"`
}

func (s PushCollectotBychainidResponse) String() string {
	return tea.Prettify(s)
}

func (s PushCollectotBychainidResponse) GoString() string {
	return s.String()
}

func (s *PushCollectotBychainidResponse) SetReqMsgId(v string) *PushCollectotBychainidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushCollectotBychainidResponse) SetResultCode(v string) *PushCollectotBychainidResponse {
	s.ResultCode = &v
	return s
}

func (s *PushCollectotBychainidResponse) SetResultMsg(v string) *PushCollectotBychainidResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushCollectotBychainidResponse) SetPushResult(v bool) *PushCollectotBychainidResponse {
	s.PushResult = &v
	return s
}

type NotifyPullstrategyChangestatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 运营商标识
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
	// 加密后的核心数据
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
	// 接口请求时的时间戳信息，格式为yyyyMMddHHmmss
	TimeStamp *string `json:"time_stamp,omitempty" xml:"time_stamp,omitempty" require:"true"`
	// 自增序列，4位自增序列取自时间戳，同一秒内按序列自增长，新秒重计
	Seq *string `json:"seq,omitempty" xml:"seq,omitempty" require:"true"`
	// 参数签名，原文为operatorId+data+timeStamp+seq
	Sig *string `json:"sig,omitempty" xml:"sig,omitempty" require:"true"`
	// 场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 数据模型ID，用于校验data原文数据
	DataModelId *string `json:"data_model_id,omitempty" xml:"data_model_id,omitempty"`
}

func (s NotifyPullstrategyChangestatusRequest) String() string {
	return tea.Prettify(s)
}

func (s NotifyPullstrategyChangestatusRequest) GoString() string {
	return s.String()
}

func (s *NotifyPullstrategyChangestatusRequest) SetAuthToken(v string) *NotifyPullstrategyChangestatusRequest {
	s.AuthToken = &v
	return s
}

func (s *NotifyPullstrategyChangestatusRequest) SetProductInstanceId(v string) *NotifyPullstrategyChangestatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *NotifyPullstrategyChangestatusRequest) SetOperatorId(v string) *NotifyPullstrategyChangestatusRequest {
	s.OperatorId = &v
	return s
}

func (s *NotifyPullstrategyChangestatusRequest) SetData(v string) *NotifyPullstrategyChangestatusRequest {
	s.Data = &v
	return s
}

func (s *NotifyPullstrategyChangestatusRequest) SetTimeStamp(v string) *NotifyPullstrategyChangestatusRequest {
	s.TimeStamp = &v
	return s
}

func (s *NotifyPullstrategyChangestatusRequest) SetSeq(v string) *NotifyPullstrategyChangestatusRequest {
	s.Seq = &v
	return s
}

func (s *NotifyPullstrategyChangestatusRequest) SetSig(v string) *NotifyPullstrategyChangestatusRequest {
	s.Sig = &v
	return s
}

func (s *NotifyPullstrategyChangestatusRequest) SetScene(v string) *NotifyPullstrategyChangestatusRequest {
	s.Scene = &v
	return s
}

func (s *NotifyPullstrategyChangestatusRequest) SetDataModelId(v string) *NotifyPullstrategyChangestatusRequest {
	s.DataModelId = &v
	return s
}

type NotifyPullstrategyChangestatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回参数密文
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 返回消息
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 返回值
	Ret *int64 `json:"ret,omitempty" xml:"ret,omitempty"`
	// 签名，原文为ret+msg+data密文
	Sig *string `json:"sig,omitempty" xml:"sig,omitempty"`
}

func (s NotifyPullstrategyChangestatusResponse) String() string {
	return tea.Prettify(s)
}

func (s NotifyPullstrategyChangestatusResponse) GoString() string {
	return s.String()
}

func (s *NotifyPullstrategyChangestatusResponse) SetReqMsgId(v string) *NotifyPullstrategyChangestatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *NotifyPullstrategyChangestatusResponse) SetResultCode(v string) *NotifyPullstrategyChangestatusResponse {
	s.ResultCode = &v
	return s
}

func (s *NotifyPullstrategyChangestatusResponse) SetResultMsg(v string) *NotifyPullstrategyChangestatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *NotifyPullstrategyChangestatusResponse) SetData(v string) *NotifyPullstrategyChangestatusResponse {
	s.Data = &v
	return s
}

func (s *NotifyPullstrategyChangestatusResponse) SetMsg(v string) *NotifyPullstrategyChangestatusResponse {
	s.Msg = &v
	return s
}

func (s *NotifyPullstrategyChangestatusResponse) SetRet(v int64) *NotifyPullstrategyChangestatusResponse {
	s.Ret = &v
	return s
}

func (s *NotifyPullstrategyChangestatusResponse) SetSig(v string) *NotifyPullstrategyChangestatusResponse {
	s.Sig = &v
	return s
}

type NotifyPullstrategyChargeorderinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 运营商标识
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
	// 加密后的核心数据
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
	// 接口请求时的时间戳信息，格式为yyyyMMddHHmmss
	TimeStamp *string `json:"time_stamp,omitempty" xml:"time_stamp,omitempty" require:"true"`
	// 自增序列，4位自增序列取自时间戳，同一秒内按序列自增长，新秒重计
	Seq *string `json:"seq,omitempty" xml:"seq,omitempty" require:"true"`
	// 参数签名，原文为operatorId+data+timeStamp+seq
	Sig *string `json:"sig,omitempty" xml:"sig,omitempty" require:"true"`
	// 场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 数据模型ID，用于校验data原文数据
	DataModelId *string `json:"data_model_id,omitempty" xml:"data_model_id,omitempty"`
}

func (s NotifyPullstrategyChargeorderinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s NotifyPullstrategyChargeorderinfoRequest) GoString() string {
	return s.String()
}

func (s *NotifyPullstrategyChargeorderinfoRequest) SetAuthToken(v string) *NotifyPullstrategyChargeorderinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *NotifyPullstrategyChargeorderinfoRequest) SetProductInstanceId(v string) *NotifyPullstrategyChargeorderinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *NotifyPullstrategyChargeorderinfoRequest) SetOperatorId(v string) *NotifyPullstrategyChargeorderinfoRequest {
	s.OperatorId = &v
	return s
}

func (s *NotifyPullstrategyChargeorderinfoRequest) SetData(v string) *NotifyPullstrategyChargeorderinfoRequest {
	s.Data = &v
	return s
}

func (s *NotifyPullstrategyChargeorderinfoRequest) SetTimeStamp(v string) *NotifyPullstrategyChargeorderinfoRequest {
	s.TimeStamp = &v
	return s
}

func (s *NotifyPullstrategyChargeorderinfoRequest) SetSeq(v string) *NotifyPullstrategyChargeorderinfoRequest {
	s.Seq = &v
	return s
}

func (s *NotifyPullstrategyChargeorderinfoRequest) SetSig(v string) *NotifyPullstrategyChargeorderinfoRequest {
	s.Sig = &v
	return s
}

func (s *NotifyPullstrategyChargeorderinfoRequest) SetScene(v string) *NotifyPullstrategyChargeorderinfoRequest {
	s.Scene = &v
	return s
}

func (s *NotifyPullstrategyChargeorderinfoRequest) SetDataModelId(v string) *NotifyPullstrategyChargeorderinfoRequest {
	s.DataModelId = &v
	return s
}

type NotifyPullstrategyChargeorderinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回参数密文
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 返回消息
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 返回值
	Ret *int64 `json:"ret,omitempty" xml:"ret,omitempty"`
	// 签名，原文为ret+msg+data密文
	Sig *string `json:"sig,omitempty" xml:"sig,omitempty"`
}

func (s NotifyPullstrategyChargeorderinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s NotifyPullstrategyChargeorderinfoResponse) GoString() string {
	return s.String()
}

func (s *NotifyPullstrategyChargeorderinfoResponse) SetReqMsgId(v string) *NotifyPullstrategyChargeorderinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *NotifyPullstrategyChargeorderinfoResponse) SetResultCode(v string) *NotifyPullstrategyChargeorderinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *NotifyPullstrategyChargeorderinfoResponse) SetResultMsg(v string) *NotifyPullstrategyChargeorderinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *NotifyPullstrategyChargeorderinfoResponse) SetData(v string) *NotifyPullstrategyChargeorderinfoResponse {
	s.Data = &v
	return s
}

func (s *NotifyPullstrategyChargeorderinfoResponse) SetMsg(v string) *NotifyPullstrategyChargeorderinfoResponse {
	s.Msg = &v
	return s
}

func (s *NotifyPullstrategyChargeorderinfoResponse) SetRet(v int64) *NotifyPullstrategyChargeorderinfoResponse {
	s.Ret = &v
	return s
}

func (s *NotifyPullstrategyChargeorderinfoResponse) SetSig(v string) *NotifyPullstrategyChargeorderinfoResponse {
	s.Sig = &v
	return s
}

type QueryScfleaseEqpinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求体
	Request []*ScfLeaseEqpInfoQueryRequest `json:"request,omitempty" xml:"request,omitempty" require:"true" type:"Repeated"`
}

func (s QueryScfleaseEqpinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryScfleaseEqpinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryScfleaseEqpinfoRequest) SetAuthToken(v string) *QueryScfleaseEqpinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryScfleaseEqpinfoRequest) SetProductInstanceId(v string) *QueryScfleaseEqpinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryScfleaseEqpinfoRequest) SetRequest(v []*ScfLeaseEqpInfoQueryRequest) *QueryScfleaseEqpinfoRequest {
	s.Request = v
	return s
}

type QueryScfleaseEqpinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询结果
	Result []*ScfLeaseEqpInfo `json:"result,omitempty" xml:"result,omitempty" type:"Repeated"`
	// 成功/失败
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryScfleaseEqpinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryScfleaseEqpinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryScfleaseEqpinfoResponse) SetReqMsgId(v string) *QueryScfleaseEqpinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryScfleaseEqpinfoResponse) SetResultCode(v string) *QueryScfleaseEqpinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryScfleaseEqpinfoResponse) SetResultMsg(v string) *QueryScfleaseEqpinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryScfleaseEqpinfoResponse) SetResult(v []*ScfLeaseEqpInfo) *QueryScfleaseEqpinfoResponse {
	s.Result = v
	return s
}

func (s *QueryScfleaseEqpinfoResponse) SetSuccess(v bool) *QueryScfleaseEqpinfoResponse {
	s.Success = &v
	return s
}

type CreateCustomerEntityRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码，由蚂蚁提供
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 实体ID，场景内实体ID需要具有唯一性
	EntityId *string `json:"entity_id,omitempty" xml:"entity_id,omitempty" require:"true"`
	// 实体名称, 例如：服务区地理围栏
	EntityName *string `json:"entity_name,omitempty" xml:"entity_name,omitempty" require:"true"`
	// 实体内容 , 类型为字符串
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 实体类别 (枚举) ，由蚂蚁提供 ，例如地理围栏：GEOFENCE
	EntityType *string `json:"entity_type,omitempty" xml:"entity_type,omitempty" require:"true"`
}

func (s CreateCustomerEntityRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateCustomerEntityRequest) GoString() string {
	return s.String()
}

func (s *CreateCustomerEntityRequest) SetAuthToken(v string) *CreateCustomerEntityRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateCustomerEntityRequest) SetProductInstanceId(v string) *CreateCustomerEntityRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateCustomerEntityRequest) SetScene(v string) *CreateCustomerEntityRequest {
	s.Scene = &v
	return s
}

func (s *CreateCustomerEntityRequest) SetEntityId(v string) *CreateCustomerEntityRequest {
	s.EntityId = &v
	return s
}

func (s *CreateCustomerEntityRequest) SetEntityName(v string) *CreateCustomerEntityRequest {
	s.EntityName = &v
	return s
}

func (s *CreateCustomerEntityRequest) SetContent(v string) *CreateCustomerEntityRequest {
	s.Content = &v
	return s
}

func (s *CreateCustomerEntityRequest) SetEntityType(v string) *CreateCustomerEntityRequest {
	s.EntityType = &v
	return s
}

type CreateCustomerEntityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateCustomerEntityResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateCustomerEntityResponse) GoString() string {
	return s.String()
}

func (s *CreateCustomerEntityResponse) SetReqMsgId(v string) *CreateCustomerEntityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateCustomerEntityResponse) SetResultCode(v string) *CreateCustomerEntityResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateCustomerEntityResponse) SetResultMsg(v string) *CreateCustomerEntityResponse {
	s.ResultMsg = &v
	return s
}

type UpdateCustomerEntityRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码，由蚂蚁提供
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 实体ID
	//
	EntityId *string `json:"entity_id,omitempty" xml:"entity_id,omitempty" require:"true"`
	// 实体名称, 例如：服务区A地理围栏
	EntityName *string `json:"entity_name,omitempty" xml:"entity_name,omitempty" require:"true"`
	// 实体内容 , 类型为字符串
	//
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s UpdateCustomerEntityRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateCustomerEntityRequest) GoString() string {
	return s.String()
}

func (s *UpdateCustomerEntityRequest) SetAuthToken(v string) *UpdateCustomerEntityRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateCustomerEntityRequest) SetProductInstanceId(v string) *UpdateCustomerEntityRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateCustomerEntityRequest) SetScene(v string) *UpdateCustomerEntityRequest {
	s.Scene = &v
	return s
}

func (s *UpdateCustomerEntityRequest) SetEntityId(v string) *UpdateCustomerEntityRequest {
	s.EntityId = &v
	return s
}

func (s *UpdateCustomerEntityRequest) SetEntityName(v string) *UpdateCustomerEntityRequest {
	s.EntityName = &v
	return s
}

func (s *UpdateCustomerEntityRequest) SetContent(v string) *UpdateCustomerEntityRequest {
	s.Content = &v
	return s
}

type UpdateCustomerEntityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateCustomerEntityResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateCustomerEntityResponse) GoString() string {
	return s.String()
}

func (s *UpdateCustomerEntityResponse) SetReqMsgId(v string) *UpdateCustomerEntityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateCustomerEntityResponse) SetResultCode(v string) *UpdateCustomerEntityResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateCustomerEntityResponse) SetResultMsg(v string) *UpdateCustomerEntityResponse {
	s.ResultMsg = &v
	return s
}

type CreateThingmodelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 物模型内容（多个物模型功能拼合的json）
	ThingModel *string `json:"thing_model,omitempty" xml:"thing_model,omitempty" require:"true"`
}

func (s CreateThingmodelRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateThingmodelRequest) GoString() string {
	return s.String()
}

func (s *CreateThingmodelRequest) SetAuthToken(v string) *CreateThingmodelRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateThingmodelRequest) SetProductInstanceId(v string) *CreateThingmodelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateThingmodelRequest) SetThingModel(v string) *CreateThingmodelRequest {
	s.ThingModel = &v
	return s
}

type CreateThingmodelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateThingmodelResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateThingmodelResponse) GoString() string {
	return s.String()
}

func (s *CreateThingmodelResponse) SetReqMsgId(v string) *CreateThingmodelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateThingmodelResponse) SetResultCode(v string) *CreateThingmodelResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateThingmodelResponse) SetResultMsg(v string) *CreateThingmodelResponse {
	s.ResultMsg = &v
	return s
}

type QueryThingmodelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryThingmodelRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryThingmodelRequest) GoString() string {
	return s.String()
}

func (s *QueryThingmodelRequest) SetAuthToken(v string) *QueryThingmodelRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryThingmodelRequest) SetProductInstanceId(v string) *QueryThingmodelRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryThingmodelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 租户的物模型内容（多个物模型功能拼合的json）
	ThingModel *string `json:"thing_model,omitempty" xml:"thing_model,omitempty"`
}

func (s QueryThingmodelResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryThingmodelResponse) GoString() string {
	return s.String()
}

func (s *QueryThingmodelResponse) SetReqMsgId(v string) *QueryThingmodelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryThingmodelResponse) SetResultCode(v string) *QueryThingmodelResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryThingmodelResponse) SetResultMsg(v string) *QueryThingmodelResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryThingmodelResponse) SetThingModel(v string) *QueryThingmodelResponse {
	s.ThingModel = &v
	return s
}

type ExecThingsdidOneapiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 暂无
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s ExecThingsdidOneapiRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecThingsdidOneapiRequest) GoString() string {
	return s.String()
}

func (s *ExecThingsdidOneapiRequest) SetAuthToken(v string) *ExecThingsdidOneapiRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecThingsdidOneapiRequest) SetProductInstanceId(v string) *ExecThingsdidOneapiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecThingsdidOneapiRequest) SetBizContent(v string) *ExecThingsdidOneapiRequest {
	s.BizContent = &v
	return s
}

type ExecThingsdidOneapiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 暂无
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s ExecThingsdidOneapiResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecThingsdidOneapiResponse) GoString() string {
	return s.String()
}

func (s *ExecThingsdidOneapiResponse) SetReqMsgId(v string) *ExecThingsdidOneapiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecThingsdidOneapiResponse) SetResultCode(v string) *ExecThingsdidOneapiResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecThingsdidOneapiResponse) SetResultMsg(v string) *ExecThingsdidOneapiResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecThingsdidOneapiResponse) SetRawResponse(v string) *ExecThingsdidOneapiResponse {
	s.RawResponse = &v
	return s
}

type StartEvidenceStoreRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 信物链存证结构体参数
	EvidenceStorageReq *EvidenceStorageReq `json:"evidence_storage_req,omitempty" xml:"evidence_storage_req,omitempty" require:"true"`
	// 输入唯一交易ID序号，客户端管理短时内唯一
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty" require:"true"`
}

func (s StartEvidenceStoreRequest) String() string {
	return tea.Prettify(s)
}

func (s StartEvidenceStoreRequest) GoString() string {
	return s.String()
}

func (s *StartEvidenceStoreRequest) SetAuthToken(v string) *StartEvidenceStoreRequest {
	s.AuthToken = &v
	return s
}

func (s *StartEvidenceStoreRequest) SetProductInstanceId(v string) *StartEvidenceStoreRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartEvidenceStoreRequest) SetEvidenceStorageReq(v *EvidenceStorageReq) *StartEvidenceStoreRequest {
	s.EvidenceStorageReq = v
	return s
}

func (s *StartEvidenceStoreRequest) SetNonce(v string) *StartEvidenceStoreRequest {
	s.Nonce = &v
	return s
}

type StartEvidenceStoreResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// API消耗时间（毫秒单位）
	CostMillis *int64 `json:"cost_millis,omitempty" xml:"cost_millis,omitempty"`
	// 暂保留
	DataIndex *string `json:"data_index,omitempty" xml:"data_index,omitempty"`
	// 上链附加备注信息，不做上链存储。
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	// 交易ID，等于输入参数同名字段
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty"`
	// 本地unix时间戳（毫秒单位）
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
	// unix链上存储时间戳
	TxTimestamp *int64 `json:"tx_timestamp,omitempty" xml:"tx_timestamp,omitempty"`
	// 链上交易地址txHash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s StartEvidenceStoreResponse) String() string {
	return tea.Prettify(s)
}

func (s StartEvidenceStoreResponse) GoString() string {
	return s.String()
}

func (s *StartEvidenceStoreResponse) SetReqMsgId(v string) *StartEvidenceStoreResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartEvidenceStoreResponse) SetResultCode(v string) *StartEvidenceStoreResponse {
	s.ResultCode = &v
	return s
}

func (s *StartEvidenceStoreResponse) SetResultMsg(v string) *StartEvidenceStoreResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartEvidenceStoreResponse) SetCostMillis(v int64) *StartEvidenceStoreResponse {
	s.CostMillis = &v
	return s
}

func (s *StartEvidenceStoreResponse) SetDataIndex(v string) *StartEvidenceStoreResponse {
	s.DataIndex = &v
	return s
}

func (s *StartEvidenceStoreResponse) SetExtInfo(v string) *StartEvidenceStoreResponse {
	s.ExtInfo = &v
	return s
}

func (s *StartEvidenceStoreResponse) SetNonce(v string) *StartEvidenceStoreResponse {
	s.Nonce = &v
	return s
}

func (s *StartEvidenceStoreResponse) SetTimestamp(v int64) *StartEvidenceStoreResponse {
	s.Timestamp = &v
	return s
}

func (s *StartEvidenceStoreResponse) SetTxTimestamp(v int64) *StartEvidenceStoreResponse {
	s.TxTimestamp = &v
	return s
}

func (s *StartEvidenceStoreResponse) SetTxHash(v string) *StartEvidenceStoreResponse {
	s.TxHash = &v
	return s
}

type StartEvidenceQueryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 信物链单条存证查询请求结构体
	EvidenceQueryInfoReq *EvidenceQueryInfoReq `json:"evidence_query_info_req,omitempty" xml:"evidence_query_info_req,omitempty" require:"true"`
	// 输入交易唯一ID，短时内唯一
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty" require:"true"`
}

func (s StartEvidenceQueryRequest) String() string {
	return tea.Prettify(s)
}

func (s StartEvidenceQueryRequest) GoString() string {
	return s.String()
}

func (s *StartEvidenceQueryRequest) SetAuthToken(v string) *StartEvidenceQueryRequest {
	s.AuthToken = &v
	return s
}

func (s *StartEvidenceQueryRequest) SetProductInstanceId(v string) *StartEvidenceQueryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartEvidenceQueryRequest) SetEvidenceQueryInfoReq(v *EvidenceQueryInfoReq) *StartEvidenceQueryRequest {
	s.EvidenceQueryInfoReq = v
	return s
}

func (s *StartEvidenceQueryRequest) SetNonce(v string) *StartEvidenceQueryRequest {
	s.Nonce = &v
	return s
}

type StartEvidenceQueryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易在区块链所在块高度
	BlockHeight *int64 `json:"block_height,omitempty" xml:"block_height,omitempty"`
	// API消耗时间（毫秒单位）
	CostMillis *int64 `json:"cost_millis,omitempty" xml:"cost_millis,omitempty"`
	// 唯一ID，等于输入同名参数
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty"`
	// unix时间戳(毫秒单位)
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
	// 区块链交易地址txHash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 交易存储区块链的链上unix时间戳
	TxTimestamp *int64 `json:"tx_timestamp,omitempty" xml:"tx_timestamp,omitempty"`
	// 信物链查询链上获取的数据，参考结构体定义
	Data *EvidenceBaseModel `json:"data,omitempty" xml:"data,omitempty"`
}

func (s StartEvidenceQueryResponse) String() string {
	return tea.Prettify(s)
}

func (s StartEvidenceQueryResponse) GoString() string {
	return s.String()
}

func (s *StartEvidenceQueryResponse) SetReqMsgId(v string) *StartEvidenceQueryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartEvidenceQueryResponse) SetResultCode(v string) *StartEvidenceQueryResponse {
	s.ResultCode = &v
	return s
}

func (s *StartEvidenceQueryResponse) SetResultMsg(v string) *StartEvidenceQueryResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartEvidenceQueryResponse) SetBlockHeight(v int64) *StartEvidenceQueryResponse {
	s.BlockHeight = &v
	return s
}

func (s *StartEvidenceQueryResponse) SetCostMillis(v int64) *StartEvidenceQueryResponse {
	s.CostMillis = &v
	return s
}

func (s *StartEvidenceQueryResponse) SetNonce(v string) *StartEvidenceQueryResponse {
	s.Nonce = &v
	return s
}

func (s *StartEvidenceQueryResponse) SetTimestamp(v int64) *StartEvidenceQueryResponse {
	s.Timestamp = &v
	return s
}

func (s *StartEvidenceQueryResponse) SetTxHash(v string) *StartEvidenceQueryResponse {
	s.TxHash = &v
	return s
}

func (s *StartEvidenceQueryResponse) SetTxTimestamp(v int64) *StartEvidenceQueryResponse {
	s.TxTimestamp = &v
	return s
}

func (s *StartEvidenceQueryResponse) SetData(v *EvidenceBaseModel) *StartEvidenceQueryResponse {
	s.Data = v
	return s
}

type StartThingsdidRegisterRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 信物链交易唯一ID，代表需要标识的操作ID
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty" require:"true"`
	// 注册信物链身份实体请求结构体
	RegisterReq *ThingsDidRegisterReq `json:"register_req,omitempty" xml:"register_req,omitempty" require:"true"`
}

func (s StartThingsdidRegisterRequest) String() string {
	return tea.Prettify(s)
}

func (s StartThingsdidRegisterRequest) GoString() string {
	return s.String()
}

func (s *StartThingsdidRegisterRequest) SetAuthToken(v string) *StartThingsdidRegisterRequest {
	s.AuthToken = &v
	return s
}

func (s *StartThingsdidRegisterRequest) SetProductInstanceId(v string) *StartThingsdidRegisterRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartThingsdidRegisterRequest) SetNonce(v string) *StartThingsdidRegisterRequest {
	s.Nonce = &v
	return s
}

func (s *StartThingsdidRegisterRequest) SetRegisterReq(v *ThingsDidRegisterReq) *StartThingsdidRegisterRequest {
	s.RegisterReq = v
	return s
}

type StartThingsdidRegisterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 代表本操作是否是异步调用
	// true: 执行完全，非异步操作
	// false: 异步执行，需要根据nonce轮训状态
	Executed *bool `json:"executed,omitempty" xml:"executed,omitempty"`
	// 代表唯一交易ID，等于输入参数同名字段
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty"`
	// 注册成功返回的实体身份DID
	ThingDid *string `json:"thing_did,omitempty" xml:"thing_did,omitempty"`
}

func (s StartThingsdidRegisterResponse) String() string {
	return tea.Prettify(s)
}

func (s StartThingsdidRegisterResponse) GoString() string {
	return s.String()
}

func (s *StartThingsdidRegisterResponse) SetReqMsgId(v string) *StartThingsdidRegisterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartThingsdidRegisterResponse) SetResultCode(v string) *StartThingsdidRegisterResponse {
	s.ResultCode = &v
	return s
}

func (s *StartThingsdidRegisterResponse) SetResultMsg(v string) *StartThingsdidRegisterResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartThingsdidRegisterResponse) SetExecuted(v bool) *StartThingsdidRegisterResponse {
	s.Executed = &v
	return s
}

func (s *StartThingsdidRegisterResponse) SetNonce(v string) *StartThingsdidRegisterResponse {
	s.Nonce = &v
	return s
}

func (s *StartThingsdidRegisterResponse) SetThingDid(v string) *StartThingsdidRegisterResponse {
	s.ThingDid = &v
	return s
}

type QueryThingsdidAsyncprocessRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 需要查询的实体Did，可为空
	ThingDid *string `json:"thing_did,omitempty" xml:"thing_did,omitempty"`
	// 随机数唯一ID, 用以标识智能合约执行的索引交易ID，需要等于需要轮询的API的nonce
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty" require:"true"`
}

func (s QueryThingsdidAsyncprocessRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryThingsdidAsyncprocessRequest) GoString() string {
	return s.String()
}

func (s *QueryThingsdidAsyncprocessRequest) SetAuthToken(v string) *QueryThingsdidAsyncprocessRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryThingsdidAsyncprocessRequest) SetProductInstanceId(v string) *QueryThingsdidAsyncprocessRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryThingsdidAsyncprocessRequest) SetThingDid(v string) *QueryThingsdidAsyncprocessRequest {
	s.ThingDid = &v
	return s
}

func (s *QueryThingsdidAsyncprocessRequest) SetNonce(v string) *QueryThingsdidAsyncprocessRequest {
	s.Nonce = &v
	return s
}

type QueryThingsdidAsyncprocessResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 需要查询的实体Did，可为空
	ThingDid *string `json:"thing_did,omitempty" xml:"thing_did,omitempty"`
	// 随机数, 用以标识智能合约执行的索引，等于输入
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty"`
	// 交易执行当前状态，原始文本，和async_code, async_subcode匹配，将来可能会删除此字段
	AsyncStatus *string `json:"async_status,omitempty" xml:"async_status,omitempty"`
	// 从智能合约执行返回的结果编码，200成功，其他参考相应文档
	AsyncCode *string `json:"async_code,omitempty" xml:"async_code,omitempty"`
	// 可为空，代表async_code信息不能表示完整语义时的子结果码
	AsyncSubcode *string `json:"async_subcode,omitempty" xml:"async_subcode,omitempty"`
}

func (s QueryThingsdidAsyncprocessResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryThingsdidAsyncprocessResponse) GoString() string {
	return s.String()
}

func (s *QueryThingsdidAsyncprocessResponse) SetReqMsgId(v string) *QueryThingsdidAsyncprocessResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryThingsdidAsyncprocessResponse) SetResultCode(v string) *QueryThingsdidAsyncprocessResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryThingsdidAsyncprocessResponse) SetResultMsg(v string) *QueryThingsdidAsyncprocessResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryThingsdidAsyncprocessResponse) SetThingDid(v string) *QueryThingsdidAsyncprocessResponse {
	s.ThingDid = &v
	return s
}

func (s *QueryThingsdidAsyncprocessResponse) SetNonce(v string) *QueryThingsdidAsyncprocessResponse {
	s.Nonce = &v
	return s
}

func (s *QueryThingsdidAsyncprocessResponse) SetAsyncStatus(v string) *QueryThingsdidAsyncprocessResponse {
	s.AsyncStatus = &v
	return s
}

func (s *QueryThingsdidAsyncprocessResponse) SetAsyncCode(v string) *QueryThingsdidAsyncprocessResponse {
	s.AsyncCode = &v
	return s
}

func (s *QueryThingsdidAsyncprocessResponse) SetAsyncSubcode(v string) *QueryThingsdidAsyncprocessResponse {
	s.AsyncSubcode = &v
	return s
}

type UpdateThingsdidStatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 交易唯一ID
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty" require:"true"`
	// 状态取如下状态，注册设备身份，默认处于STATUS_REGISTERED，
	// 要更新为STATUS_COMMAND_STOP的设备必须处于STATUS_COMMAND_START，
	// 更新为STATUS_COMMAND_UNREGISTER后，无法更新为其他状态。
	// STATUS_COMMAND_UNREGISTER(注销),
	// STATUS_COMMAND_START(启用),
	// STATUS_COMMAND_STOP(),
	// STATUS_REGISTERED(3),
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 需要更新的实体did
	ThingDid *string `json:"thing_did,omitempty" xml:"thing_did,omitempty" require:"true"`
}

func (s UpdateThingsdidStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateThingsdidStatusRequest) GoString() string {
	return s.String()
}

func (s *UpdateThingsdidStatusRequest) SetAuthToken(v string) *UpdateThingsdidStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateThingsdidStatusRequest) SetProductInstanceId(v string) *UpdateThingsdidStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateThingsdidStatusRequest) SetNonce(v string) *UpdateThingsdidStatusRequest {
	s.Nonce = &v
	return s
}

func (s *UpdateThingsdidStatusRequest) SetStatus(v string) *UpdateThingsdidStatusRequest {
	s.Status = &v
	return s
}

func (s *UpdateThingsdidStatusRequest) SetThingDid(v string) *UpdateThingsdidStatusRequest {
	s.ThingDid = &v
	return s
}

type UpdateThingsdidStatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 代表本操作是否是异步调用 true: 执行完全，非异步操作...
	Executed *bool `json:"executed,omitempty" xml:"executed,omitempty"`
	// 代表唯一交易ID，等于输入参数同名字段
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty"`
	// 注册成功返回的实体身份DID
	ThingDid *string `json:"thing_did,omitempty" xml:"thing_did,omitempty"`
}

func (s UpdateThingsdidStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateThingsdidStatusResponse) GoString() string {
	return s.String()
}

func (s *UpdateThingsdidStatusResponse) SetReqMsgId(v string) *UpdateThingsdidStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateThingsdidStatusResponse) SetResultCode(v string) *UpdateThingsdidStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateThingsdidStatusResponse) SetResultMsg(v string) *UpdateThingsdidStatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateThingsdidStatusResponse) SetExecuted(v bool) *UpdateThingsdidStatusResponse {
	s.Executed = &v
	return s
}

func (s *UpdateThingsdidStatusResponse) SetNonce(v string) *UpdateThingsdidStatusResponse {
	s.Nonce = &v
	return s
}

func (s *UpdateThingsdidStatusResponse) SetThingDid(v string) *UpdateThingsdidStatusResponse {
	s.ThingDid = &v
	return s
}

type UpdateThingsdidDevicespaceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 参考结构体定义
	UpdateDeviceSpaceReq *UpdateDeviceSpaceReq `json:"update_device_space_req,omitempty" xml:"update_device_space_req,omitempty" require:"true"`
	// 交易唯一ID
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty" require:"true"`
}

func (s UpdateThingsdidDevicespaceRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateThingsdidDevicespaceRequest) GoString() string {
	return s.String()
}

func (s *UpdateThingsdidDevicespaceRequest) SetAuthToken(v string) *UpdateThingsdidDevicespaceRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateThingsdidDevicespaceRequest) SetProductInstanceId(v string) *UpdateThingsdidDevicespaceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateThingsdidDevicespaceRequest) SetUpdateDeviceSpaceReq(v *UpdateDeviceSpaceReq) *UpdateThingsdidDevicespaceRequest {
	s.UpdateDeviceSpaceReq = v
	return s
}

func (s *UpdateThingsdidDevicespaceRequest) SetNonce(v string) *UpdateThingsdidDevicespaceRequest {
	s.Nonce = &v
	return s
}

type UpdateThingsdidDevicespaceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 代表本操作是否是异步调用 true: 执行完全，非异步操作
	Executed *bool `json:"executed,omitempty" xml:"executed,omitempty"`
	// 代表唯一交易ID，等于输入参数同名字段
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty"`
	// 注册成功返回的实体身份DID
	ThingDid *string `json:"thing_did,omitempty" xml:"thing_did,omitempty"`
}

func (s UpdateThingsdidDevicespaceResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateThingsdidDevicespaceResponse) GoString() string {
	return s.String()
}

func (s *UpdateThingsdidDevicespaceResponse) SetReqMsgId(v string) *UpdateThingsdidDevicespaceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateThingsdidDevicespaceResponse) SetResultCode(v string) *UpdateThingsdidDevicespaceResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateThingsdidDevicespaceResponse) SetResultMsg(v string) *UpdateThingsdidDevicespaceResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateThingsdidDevicespaceResponse) SetExecuted(v bool) *UpdateThingsdidDevicespaceResponse {
	s.Executed = &v
	return s
}

func (s *UpdateThingsdidDevicespaceResponse) SetNonce(v string) *UpdateThingsdidDevicespaceResponse {
	s.Nonce = &v
	return s
}

func (s *UpdateThingsdidDevicespaceResponse) SetThingDid(v string) *UpdateThingsdidDevicespaceResponse {
	s.ThingDid = &v
	return s
}

type QueryThingsdidDidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询请求结构体，参考结构体定义
	BaseQueryReq *DidBaseQueryReq `json:"base_query_req,omitempty" xml:"base_query_req,omitempty" require:"true"`
	// 唯一交易ID
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty" require:"true"`
}

func (s QueryThingsdidDidRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryThingsdidDidRequest) GoString() string {
	return s.String()
}

func (s *QueryThingsdidDidRequest) SetAuthToken(v string) *QueryThingsdidDidRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryThingsdidDidRequest) SetProductInstanceId(v string) *QueryThingsdidDidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryThingsdidDidRequest) SetBaseQueryReq(v *DidBaseQueryReq) *QueryThingsdidDidRequest {
	s.BaseQueryReq = v
	return s
}

func (s *QueryThingsdidDidRequest) SetNonce(v string) *QueryThingsdidDidRequest {
	s.Nonce = &v
	return s
}

type QueryThingsdidDidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询请求返回结构体的数组列表，每一个元素对应一个did
	DidBaseQueryResp []*DidBaseQueryResp `json:"did_base_query_resp,omitempty" xml:"did_base_query_resp,omitempty" type:"Repeated"`
	// 交易唯一ID
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty"`
}

func (s QueryThingsdidDidResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryThingsdidDidResponse) GoString() string {
	return s.String()
}

func (s *QueryThingsdidDidResponse) SetReqMsgId(v string) *QueryThingsdidDidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryThingsdidDidResponse) SetResultCode(v string) *QueryThingsdidDidResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryThingsdidDidResponse) SetResultMsg(v string) *QueryThingsdidDidResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryThingsdidDidResponse) SetDidBaseQueryResp(v []*DidBaseQueryResp) *QueryThingsdidDidResponse {
	s.DidBaseQueryResp = v
	return s
}

func (s *QueryThingsdidDidResponse) SetNonce(v string) *QueryThingsdidDidResponse {
	s.Nonce = &v
	return s
}

type UpdateThingsdidDidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 参考更新请求结构体
	DidUpdateReq *ThingsDidUpdateReq `json:"did_update_req,omitempty" xml:"did_update_req,omitempty" require:"true"`
	// 交易唯一ID
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty" require:"true"`
}

func (s UpdateThingsdidDidRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateThingsdidDidRequest) GoString() string {
	return s.String()
}

func (s *UpdateThingsdidDidRequest) SetAuthToken(v string) *UpdateThingsdidDidRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateThingsdidDidRequest) SetProductInstanceId(v string) *UpdateThingsdidDidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateThingsdidDidRequest) SetDidUpdateReq(v *ThingsDidUpdateReq) *UpdateThingsdidDidRequest {
	s.DidUpdateReq = v
	return s
}

func (s *UpdateThingsdidDidRequest) SetNonce(v string) *UpdateThingsdidDidRequest {
	s.Nonce = &v
	return s
}

type UpdateThingsdidDidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 更新的实体DID，等于输入
	ThingDid *string `json:"thing_did,omitempty" xml:"thing_did,omitempty"`
	// 异步执行标识，true代表已经完成执行，false代表异步返回，需要轮询nonce代表的交易
	Executed *bool `json:"executed,omitempty" xml:"executed,omitempty"`
	// 交易唯一ID
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty"`
}

func (s UpdateThingsdidDidResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateThingsdidDidResponse) GoString() string {
	return s.String()
}

func (s *UpdateThingsdidDidResponse) SetReqMsgId(v string) *UpdateThingsdidDidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateThingsdidDidResponse) SetResultCode(v string) *UpdateThingsdidDidResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateThingsdidDidResponse) SetResultMsg(v string) *UpdateThingsdidDidResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateThingsdidDidResponse) SetThingDid(v string) *UpdateThingsdidDidResponse {
	s.ThingDid = &v
	return s
}

func (s *UpdateThingsdidDidResponse) SetExecuted(v bool) *UpdateThingsdidDidResponse {
	s.Executed = &v
	return s
}

func (s *UpdateThingsdidDidResponse) SetNonce(v string) *UpdateThingsdidDidResponse {
	s.Nonce = &v
	return s
}

type StartTenantBindinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 参考结构体
	BindInfoReq *TenantBindInfoReq `json:"bind_info_req,omitempty" xml:"bind_info_req,omitempty" require:"true"`
	// 交易唯一ID
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty" require:"true"`
}

func (s StartTenantBindinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s StartTenantBindinfoRequest) GoString() string {
	return s.String()
}

func (s *StartTenantBindinfoRequest) SetAuthToken(v string) *StartTenantBindinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *StartTenantBindinfoRequest) SetProductInstanceId(v string) *StartTenantBindinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartTenantBindinfoRequest) SetBindInfoReq(v *TenantBindInfoReq) *StartTenantBindinfoRequest {
	s.BindInfoReq = v
	return s
}

func (s *StartTenantBindinfoRequest) SetNonce(v string) *StartTenantBindinfoRequest {
	s.Nonce = &v
	return s
}

type StartTenantBindinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实体did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 非openapi访问模式https鉴权key_id,  暂保留
	KeyId *string `json:"key_id,omitempty" xml:"key_id,omitempty"`
	// 非openapi访问模式https鉴权key_secret,  暂保留
	KeySecret *string `json:"key_secret,omitempty" xml:"key_secret,omitempty"`
	// 交易唯一ID
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty"`
}

func (s StartTenantBindinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s StartTenantBindinfoResponse) GoString() string {
	return s.String()
}

func (s *StartTenantBindinfoResponse) SetReqMsgId(v string) *StartTenantBindinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartTenantBindinfoResponse) SetResultCode(v string) *StartTenantBindinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *StartTenantBindinfoResponse) SetResultMsg(v string) *StartTenantBindinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartTenantBindinfoResponse) SetDid(v string) *StartTenantBindinfoResponse {
	s.Did = &v
	return s
}

func (s *StartTenantBindinfoResponse) SetKeyId(v string) *StartTenantBindinfoResponse {
	s.KeyId = &v
	return s
}

func (s *StartTenantBindinfoResponse) SetKeySecret(v string) *StartTenantBindinfoResponse {
	s.KeySecret = &v
	return s
}

func (s *StartTenantBindinfoResponse) SetNonce(v string) *StartTenantBindinfoResponse {
	s.Nonce = &v
	return s
}

type CreateTenantProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 交易唯一ID
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty" require:"true"`
	// 参考结构体
	ProjectCreateReq *TenantProjectCreateReq `json:"project_create_req,omitempty" xml:"project_create_req,omitempty" require:"true"`
}

func (s CreateTenantProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTenantProjectRequest) GoString() string {
	return s.String()
}

func (s *CreateTenantProjectRequest) SetAuthToken(v string) *CreateTenantProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTenantProjectRequest) SetProductInstanceId(v string) *CreateTenantProjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTenantProjectRequest) SetNonce(v string) *CreateTenantProjectRequest {
	s.Nonce = &v
	return s
}

func (s *CreateTenantProjectRequest) SetProjectCreateReq(v *TenantProjectCreateReq) *CreateTenantProjectRequest {
	s.ProjectCreateReq = v
	return s
}

type CreateTenantProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回租户唯一的项目id，可以用以管理不同业务。
	ProjectUid *string `json:"project_uid,omitempty" xml:"project_uid,omitempty"`
	// 交易唯一ID
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty"`
}

func (s CreateTenantProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTenantProjectResponse) GoString() string {
	return s.String()
}

func (s *CreateTenantProjectResponse) SetReqMsgId(v string) *CreateTenantProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTenantProjectResponse) SetResultCode(v string) *CreateTenantProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTenantProjectResponse) SetResultMsg(v string) *CreateTenantProjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTenantProjectResponse) SetProjectUid(v string) *CreateTenantProjectResponse {
	s.ProjectUid = &v
	return s
}

func (s *CreateTenantProjectResponse) SetNonce(v string) *CreateTenantProjectResponse {
	s.Nonce = &v
	return s
}

type UpdateThingsdidTenantRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 交易唯一ID
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty" require:"true"`
	// 实体更新访问权限参与方的请求结构体
	UpdateTenantReq *DidUpdateTenantReq `json:"update_tenant_req,omitempty" xml:"update_tenant_req,omitempty" require:"true"`
}

func (s UpdateThingsdidTenantRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateThingsdidTenantRequest) GoString() string {
	return s.String()
}

func (s *UpdateThingsdidTenantRequest) SetAuthToken(v string) *UpdateThingsdidTenantRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateThingsdidTenantRequest) SetProductInstanceId(v string) *UpdateThingsdidTenantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateThingsdidTenantRequest) SetNonce(v string) *UpdateThingsdidTenantRequest {
	s.Nonce = &v
	return s
}

func (s *UpdateThingsdidTenantRequest) SetUpdateTenantReq(v *DidUpdateTenantReq) *UpdateThingsdidTenantRequest {
	s.UpdateTenantReq = v
	return s
}

type UpdateThingsdidTenantResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易唯一ID，等于输入
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty"`
	// 代表本操作是否是异步调用
	// true: 执行完全，非异步操作.
	Executed *bool `json:"executed,omitempty" xml:"executed,omitempty"`
}

func (s UpdateThingsdidTenantResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateThingsdidTenantResponse) GoString() string {
	return s.String()
}

func (s *UpdateThingsdidTenantResponse) SetReqMsgId(v string) *UpdateThingsdidTenantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateThingsdidTenantResponse) SetResultCode(v string) *UpdateThingsdidTenantResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateThingsdidTenantResponse) SetResultMsg(v string) *UpdateThingsdidTenantResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateThingsdidTenantResponse) SetNonce(v string) *UpdateThingsdidTenantResponse {
	s.Nonce = &v
	return s
}

func (s *UpdateThingsdidTenantResponse) SetExecuted(v bool) *UpdateThingsdidTenantResponse {
	s.Executed = &v
	return s
}

type LoadTsmCertificatetsmRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// certificate
	Certificate *string `json:"certificate,omitempty" xml:"certificate,omitempty"`
	// BOT
	DeviceCode *string `json:"device_code,omitempty" xml:"device_code,omitempty" require:"true"`
	// H0
	DeviceModel *string `json:"device_model,omitempty" xml:"device_model,omitempty" require:"true"`
	// SE
	DeviceModule *string `json:"device_module,omitempty" xml:"device_module,omitempty" require:"true"`
}

func (s LoadTsmCertificatetsmRequest) String() string {
	return tea.Prettify(s)
}

func (s LoadTsmCertificatetsmRequest) GoString() string {
	return s.String()
}

func (s *LoadTsmCertificatetsmRequest) SetAuthToken(v string) *LoadTsmCertificatetsmRequest {
	s.AuthToken = &v
	return s
}

func (s *LoadTsmCertificatetsmRequest) SetProductInstanceId(v string) *LoadTsmCertificatetsmRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *LoadTsmCertificatetsmRequest) SetCertificate(v string) *LoadTsmCertificatetsmRequest {
	s.Certificate = &v
	return s
}

func (s *LoadTsmCertificatetsmRequest) SetDeviceCode(v string) *LoadTsmCertificatetsmRequest {
	s.DeviceCode = &v
	return s
}

func (s *LoadTsmCertificatetsmRequest) SetDeviceModel(v string) *LoadTsmCertificatetsmRequest {
	s.DeviceModel = &v
	return s
}

func (s *LoadTsmCertificatetsmRequest) SetDeviceModule(v string) *LoadTsmCertificatetsmRequest {
	s.DeviceModule = &v
	return s
}

type LoadTsmCertificatetsmResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	//  LoadCertificateTSMCmdResponse implements Serializable
	CmdList []*TsmCommonCmd `json:"cmd_list,omitempty" xml:"cmd_list,omitempty" type:"Repeated"`
}

func (s LoadTsmCertificatetsmResponse) String() string {
	return tea.Prettify(s)
}

func (s LoadTsmCertificatetsmResponse) GoString() string {
	return s.String()
}

func (s *LoadTsmCertificatetsmResponse) SetReqMsgId(v string) *LoadTsmCertificatetsmResponse {
	s.ReqMsgId = &v
	return s
}

func (s *LoadTsmCertificatetsmResponse) SetResultCode(v string) *LoadTsmCertificatetsmResponse {
	s.ResultCode = &v
	return s
}

func (s *LoadTsmCertificatetsmResponse) SetResultMsg(v string) *LoadTsmCertificatetsmResponse {
	s.ResultMsg = &v
	return s
}

func (s *LoadTsmCertificatetsmResponse) SetCmdList(v []*TsmCommonCmd) *LoadTsmCertificatetsmResponse {
	s.CmdList = v
	return s
}

type LoadTsmResourcefileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// BOT
	DeviceCode *string `json:"device_code,omitempty" xml:"device_code,omitempty" require:"true"`
	// H0
	DeviceModel *string `json:"device_model,omitempty" xml:"device_model,omitempty" require:"true"`
	// SE
	DeviceModule *string `json:"device_module,omitempty" xml:"device_module,omitempty" require:"true"`
	// version
	FileVersion *string `json:"file_version,omitempty" xml:"file_version,omitempty"`
}

func (s LoadTsmResourcefileRequest) String() string {
	return tea.Prettify(s)
}

func (s LoadTsmResourcefileRequest) GoString() string {
	return s.String()
}

func (s *LoadTsmResourcefileRequest) SetAuthToken(v string) *LoadTsmResourcefileRequest {
	s.AuthToken = &v
	return s
}

func (s *LoadTsmResourcefileRequest) SetProductInstanceId(v string) *LoadTsmResourcefileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *LoadTsmResourcefileRequest) SetDeviceCode(v string) *LoadTsmResourcefileRequest {
	s.DeviceCode = &v
	return s
}

func (s *LoadTsmResourcefileRequest) SetDeviceModel(v string) *LoadTsmResourcefileRequest {
	s.DeviceModel = &v
	return s
}

func (s *LoadTsmResourcefileRequest) SetDeviceModule(v string) *LoadTsmResourcefileRequest {
	s.DeviceModule = &v
	return s
}

func (s *LoadTsmResourcefileRequest) SetFileVersion(v string) *LoadTsmResourcefileRequest {
	s.FileVersion = &v
	return s
}

type LoadTsmResourcefileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// appId
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty"`
	// cmd_list
	CmdList []*TsmCommonCmd `json:"cmd_list,omitempty" xml:"cmd_list,omitempty" type:"Repeated"`
}

func (s LoadTsmResourcefileResponse) String() string {
	return tea.Prettify(s)
}

func (s LoadTsmResourcefileResponse) GoString() string {
	return s.String()
}

func (s *LoadTsmResourcefileResponse) SetReqMsgId(v string) *LoadTsmResourcefileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *LoadTsmResourcefileResponse) SetResultCode(v string) *LoadTsmResourcefileResponse {
	s.ResultCode = &v
	return s
}

func (s *LoadTsmResourcefileResponse) SetResultMsg(v string) *LoadTsmResourcefileResponse {
	s.ResultMsg = &v
	return s
}

func (s *LoadTsmResourcefileResponse) SetAppId(v string) *LoadTsmResourcefileResponse {
	s.AppId = &v
	return s
}

func (s *LoadTsmResourcefileResponse) SetCmdList(v []*TsmCommonCmd) *LoadTsmResourcefileResponse {
	s.CmdList = v
	return s
}

type StartTlsnotaryTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 唯一的业务tlsnotary任务id
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 加固文件的oss链接
	OssLink *string `json:"oss_link,omitempty" xml:"oss_link,omitempty" require:"true"`
}

func (s StartTlsnotaryTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s StartTlsnotaryTaskRequest) GoString() string {
	return s.String()
}

func (s *StartTlsnotaryTaskRequest) SetAuthToken(v string) *StartTlsnotaryTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *StartTlsnotaryTaskRequest) SetProductInstanceId(v string) *StartTlsnotaryTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartTlsnotaryTaskRequest) SetTaskId(v string) *StartTlsnotaryTaskRequest {
	s.TaskId = &v
	return s
}

func (s *StartTlsnotaryTaskRequest) SetOssLink(v string) *StartTlsnotaryTaskRequest {
	s.OssLink = &v
	return s
}

type StartTlsnotaryTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 唯一的业务tlsnotary任务id
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 业务错误码
	ErrorCode *int64 `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 错误信息
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
}

func (s StartTlsnotaryTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s StartTlsnotaryTaskResponse) GoString() string {
	return s.String()
}

func (s *StartTlsnotaryTaskResponse) SetReqMsgId(v string) *StartTlsnotaryTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartTlsnotaryTaskResponse) SetResultCode(v string) *StartTlsnotaryTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *StartTlsnotaryTaskResponse) SetResultMsg(v string) *StartTlsnotaryTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartTlsnotaryTaskResponse) SetTaskId(v string) *StartTlsnotaryTaskResponse {
	s.TaskId = &v
	return s
}

func (s *StartTlsnotaryTaskResponse) SetErrorCode(v int64) *StartTlsnotaryTaskResponse {
	s.ErrorCode = &v
	return s
}

func (s *StartTlsnotaryTaskResponse) SetErrorMsg(v string) *StartTlsnotaryTaskResponse {
	s.ErrorMsg = &v
	return s
}

type QueryTlsnotaryTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 唯一的业务 tlsnotary 任务 id
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryTlsnotaryTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTlsnotaryTaskRequest) GoString() string {
	return s.String()
}

func (s *QueryTlsnotaryTaskRequest) SetAuthToken(v string) *QueryTlsnotaryTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTlsnotaryTaskRequest) SetProductInstanceId(v string) *QueryTlsnotaryTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTlsnotaryTaskRequest) SetTaskId(v string) *QueryTlsnotaryTaskRequest {
	s.TaskId = &v
	return s
}

type QueryTlsnotaryTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 唯一的业务 tlsnotary 任务 id
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// tlsnotary任务执行状态
	State *int64 `json:"state,omitempty" xml:"state,omitempty"`
	// 上传文件oss链接
	UploadOssLinks *TlsnotaryUploadOssLinks `json:"upload_oss_links,omitempty" xml:"upload_oss_links,omitempty"`
	// 认证签名
	NotarySignature *string `json:"notary_signature,omitempty" xml:"notary_signature,omitempty"`
	// 业务错误码
	ErrorCode *int64 `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 业务错误信息
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
}

func (s QueryTlsnotaryTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTlsnotaryTaskResponse) GoString() string {
	return s.String()
}

func (s *QueryTlsnotaryTaskResponse) SetReqMsgId(v string) *QueryTlsnotaryTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTlsnotaryTaskResponse) SetResultCode(v string) *QueryTlsnotaryTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTlsnotaryTaskResponse) SetResultMsg(v string) *QueryTlsnotaryTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTlsnotaryTaskResponse) SetTaskId(v string) *QueryTlsnotaryTaskResponse {
	s.TaskId = &v
	return s
}

func (s *QueryTlsnotaryTaskResponse) SetState(v int64) *QueryTlsnotaryTaskResponse {
	s.State = &v
	return s
}

func (s *QueryTlsnotaryTaskResponse) SetUploadOssLinks(v *TlsnotaryUploadOssLinks) *QueryTlsnotaryTaskResponse {
	s.UploadOssLinks = v
	return s
}

func (s *QueryTlsnotaryTaskResponse) SetNotarySignature(v string) *QueryTlsnotaryTaskResponse {
	s.NotarySignature = &v
	return s
}

func (s *QueryTlsnotaryTaskResponse) SetErrorCode(v int64) *QueryTlsnotaryTaskResponse {
	s.ErrorCode = &v
	return s
}

func (s *QueryTlsnotaryTaskResponse) SetErrorMsg(v string) *QueryTlsnotaryTaskResponse {
	s.ErrorMsg = &v
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
				"sdk_version":      tea.String("1.8.7"),
				"_prod_code":       tea.String("BOT"),
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
 * Description: acec提供的SPI服务开通接口
 * Summary: acec提供的SPI服务开通接口
 */
func (client *Client) OpenAcecContract(request *OpenAcecContractRequest) (_result *OpenAcecContractResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OpenAcecContractResponse{}
	_body, _err := client.OpenAcecContractEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: acec提供的SPI服务开通接口
 * Summary: acec提供的SPI服务开通接口
 */
func (client *Client) OpenAcecContractEx(request *OpenAcecContractRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OpenAcecContractResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OpenAcecContractResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.acec.contract.open"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: AI服务组提供的SPI服务停止接口
 * Summary: acec提供的SPI服务停止接口
 */
func (client *Client) StopAcecContract(request *StopAcecContractRequest) (_result *StopAcecContractResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StopAcecContractResponse{}
	_body, _err := client.StopAcecContractEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: AI服务组提供的SPI服务停止接口
 * Summary: acec提供的SPI服务停止接口
 */
func (client *Client) StopAcecContractEx(request *StopAcecContractRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StopAcecContractResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StopAcecContractResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.acec.contract.stop"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: acec提供的SPI服务复入接口
 * Summary: acec提供的SPI服务复入接口
 */
func (client *Client) ResumeAcecContract(request *ResumeAcecContractRequest) (_result *ResumeAcecContractResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ResumeAcecContractResponse{}
	_body, _err := client.ResumeAcecContractEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: acec提供的SPI服务复入接口
 * Summary: acec提供的SPI服务复入接口
 */
func (client *Client) ResumeAcecContractEx(request *ResumeAcecContractRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ResumeAcecContractResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResumeAcecContractResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.acec.contract.resume"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 租赁智能中心实人认证创建服务
 * Summary: 租赁智能中心实人认证创建服务
 */
func (client *Client) CreateLeaseRealperson(request *CreateLeaseRealpersonRequest) (_result *CreateLeaseRealpersonResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeaseRealpersonResponse{}
	_body, _err := client.CreateLeaseRealpersonEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 租赁智能中心实人认证创建服务
 * Summary: 租赁智能中心实人认证创建服务
 */
func (client *Client) CreateLeaseRealpersonEx(request *CreateLeaseRealpersonRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeaseRealpersonResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeaseRealpersonResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.lease.realperson.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 租赁智能中心实人认证查询服务
 * Summary: 租赁智能中心实人认证查询服务
 */
func (client *Client) QueryLeaseRealperson(request *QueryLeaseRealpersonRequest) (_result *QueryLeaseRealpersonResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryLeaseRealpersonResponse{}
	_body, _err := client.QueryLeaseRealpersonEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 租赁智能中心实人认证查询服务
 * Summary: 租赁智能中心实人认证查询服务
 */
func (client *Client) QueryLeaseRealpersonEx(request *QueryLeaseRealpersonRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryLeaseRealpersonResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryLeaseRealpersonResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.lease.realperson.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 租赁智能中心风控查询服务
 * Summary: 租赁智能中心风控查询服务
 */
func (client *Client) QueryLeaseRisk(request *QueryLeaseRiskRequest) (_result *QueryLeaseRiskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryLeaseRiskResponse{}
	_body, _err := client.QueryLeaseRiskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 租赁智能中心风控查询服务
 * Summary: 租赁智能中心风控查询服务
 */
func (client *Client) QueryLeaseRiskEx(request *QueryLeaseRiskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryLeaseRiskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryLeaseRiskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.lease.risk.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 私有化配置推送回告API
 * Summary: 私有化配置推送回告API
 */
func (client *Client) FinishTraceConfig(request *FinishTraceConfigRequest) (_result *FinishTraceConfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &FinishTraceConfigResponse{}
	_body, _err := client.FinishTraceConfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 私有化配置推送回告API
 * Summary: 私有化配置推送回告API
 */
func (client *Client) FinishTraceConfigEx(request *FinishTraceConfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *FinishTraceConfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &FinishTraceConfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.trace.config.finish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: BAI提供的OCR服务接口
 * Summary: BAI提供的OCR服务
 */
func (client *Client) QueryBaiOcr(request *QueryBaiOcrRequest) (_result *QueryBaiOcrResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBaiOcrResponse{}
	_body, _err := client.QueryBaiOcrEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: BAI提供的OCR服务接口
 * Summary: BAI提供的OCR服务
 */
func (client *Client) QueryBaiOcrEx(request *QueryBaiOcrRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBaiOcrResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaiOcrResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.bai.ocr.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: AI二维码验真
 * Summary: AI二维码验真
 */
func (client *Client) QueryAiidentificationQrcode(request *QueryAiidentificationQrcodeRequest) (_result *QueryAiidentificationQrcodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAiidentificationQrcodeResponse{}
	_body, _err := client.QueryAiidentificationQrcodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: AI二维码验真
 * Summary: AI二维码验真
 */
func (client *Client) QueryAiidentificationQrcodeEx(request *QueryAiidentificationQrcodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAiidentificationQrcodeResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("blockchain.bot.aiidentification.qrcode.query"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			queryAiidentificationQrcodeResponse := &QueryAiidentificationQrcodeResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = queryAiidentificationQrcodeResponse
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
	_result = &QueryAiidentificationQrcodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.aiidentification.qrcode.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: AI商品鉴定
 * Summary: AI商品鉴定
 */
func (client *Client) QueryAiidentificationGoods(request *QueryAiidentificationGoodsRequest) (_result *QueryAiidentificationGoodsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAiidentificationGoodsResponse{}
	_body, _err := client.QueryAiidentificationGoodsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: AI商品鉴定
 * Summary: AI商品鉴定
 */
func (client *Client) QueryAiidentificationGoodsEx(request *QueryAiidentificationGoodsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAiidentificationGoodsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAiidentificationGoodsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.aiidentification.goods.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商品鉴定点图片检测
 * Summary: 商品鉴定点图片检测
 */
func (client *Client) CheckAiidentificationGoodspoint(request *CheckAiidentificationGoodspointRequest) (_result *CheckAiidentificationGoodspointResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckAiidentificationGoodspointResponse{}
	_body, _err := client.CheckAiidentificationGoodspointEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商品鉴定点图片检测
 * Summary: 商品鉴定点图片检测
 */
func (client *Client) CheckAiidentificationGoodspointEx(request *CheckAiidentificationGoodspointRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckAiidentificationGoodspointResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckAiidentificationGoodspointResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.aiidentification.goodspoint.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 溯源码比对服务
 * Summary: AI溯源码验真
 */
func (client *Client) CheckAiidentificationQrcode(request *CheckAiidentificationQrcodeRequest) (_result *CheckAiidentificationQrcodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckAiidentificationQrcodeResponse{}
	_body, _err := client.CheckAiidentificationQrcodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 溯源码比对服务
 * Summary: AI溯源码验真
 */
func (client *Client) CheckAiidentificationQrcodeEx(request *CheckAiidentificationQrcodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckAiidentificationQrcodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckAiidentificationQrcodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.aiidentification.qrcode.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于生成溯源防伪码
 * Summary: 溯源防伪码生成接口
 */
func (client *Client) CreateAiidentificationQrcode(request *CreateAiidentificationQrcodeRequest) (_result *CreateAiidentificationQrcodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAiidentificationQrcodeResponse{}
	_body, _err := client.CreateAiidentificationQrcodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于生成溯源防伪码
 * Summary: 溯源防伪码生成接口
 */
func (client *Client) CreateAiidentificationQrcodeEx(request *CreateAiidentificationQrcodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAiidentificationQrcodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAiidentificationQrcodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.aiidentification.qrcode.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: B端二维码质检
 * Summary: B端二维码质检
 */
func (client *Client) VerifyAiidentificationQrcode(request *VerifyAiidentificationQrcodeRequest) (_result *VerifyAiidentificationQrcodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyAiidentificationQrcodeResponse{}
	_body, _err := client.VerifyAiidentificationQrcodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: B端二维码质检
 * Summary: B端二维码质检
 */
func (client *Client) VerifyAiidentificationQrcodeEx(request *VerifyAiidentificationQrcodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyAiidentificationQrcodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyAiidentificationQrcodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.aiidentification.qrcode.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商品鉴定
 * Summary: 商品鉴定
 */
func (client *Client) QueryAiidentificationGoodspoint(request *QueryAiidentificationGoodspointRequest) (_result *QueryAiidentificationGoodspointResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAiidentificationGoodspointResponse{}
	_body, _err := client.QueryAiidentificationGoodspointEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商品鉴定
 * Summary: 商品鉴定
 */
func (client *Client) QueryAiidentificationGoodspointEx(request *QueryAiidentificationGoodspointRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAiidentificationGoodspointResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAiidentificationGoodspointResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.aiidentification.goodspoint.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: AI商品数字指纹注册
 * Summary: AI数字指纹注册
 */
func (client *Client) RegisterAiidentificationGoodsdigitalfingerprint(request *RegisterAiidentificationGoodsdigitalfingerprintRequest) (_result *RegisterAiidentificationGoodsdigitalfingerprintResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RegisterAiidentificationGoodsdigitalfingerprintResponse{}
	_body, _err := client.RegisterAiidentificationGoodsdigitalfingerprintEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: AI商品数字指纹注册
 * Summary: AI数字指纹注册
 */
func (client *Client) RegisterAiidentificationGoodsdigitalfingerprintEx(request *RegisterAiidentificationGoodsdigitalfingerprintRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RegisterAiidentificationGoodsdigitalfingerprintResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RegisterAiidentificationGoodsdigitalfingerprintResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.aiidentification.goodsdigitalfingerprint.register"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: AI商品数字指纹鉴定
 * Summary: AI商品数字指纹鉴定
 */
func (client *Client) CheckAiidentificationGoodsdigitalfingerprint(request *CheckAiidentificationGoodsdigitalfingerprintRequest) (_result *CheckAiidentificationGoodsdigitalfingerprintResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckAiidentificationGoodsdigitalfingerprintResponse{}
	_body, _err := client.CheckAiidentificationGoodsdigitalfingerprintEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: AI商品数字指纹鉴定
 * Summary: AI商品数字指纹鉴定
 */
func (client *Client) CheckAiidentificationGoodsdigitalfingerprintEx(request *CheckAiidentificationGoodsdigitalfingerprintRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckAiidentificationGoodsdigitalfingerprintResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckAiidentificationGoodsdigitalfingerprintResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.aiidentification.goodsdigitalfingerprint.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 识别票据上的二维码
 * Summary: AI二维码识别
 */
func (client *Client) GetAiidentificationQrcode(request *GetAiidentificationQrcodeRequest) (_result *GetAiidentificationQrcodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAiidentificationQrcodeResponse{}
	_body, _err := client.GetAiidentificationQrcodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 识别票据上的二维码
 * Summary: AI二维码识别
 */
func (client *Client) GetAiidentificationQrcodeEx(request *GetAiidentificationQrcodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAiidentificationQrcodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAiidentificationQrcodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.aiidentification.qrcode.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: biot 私有化 设备注册接口
 * Summary: biot 私有化 设备注册接口
 */
func (client *Client) CreateAcsDevice(request *CreateAcsDeviceRequest) (_result *CreateAcsDeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAcsDeviceResponse{}
	_body, _err := client.CreateAcsDeviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: biot 私有化 设备注册接口
 * Summary: biot 私有化 设备注册接口
 */
func (client *Client) CreateAcsDeviceEx(request *CreateAcsDeviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAcsDeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAcsDeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.acs.device.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: biot 私有化 业务数据上报
 * Summary: biot 私有化 业务数据上报
 */
func (client *Client) SendAcsCollector(request *SendAcsCollectorRequest) (_result *SendAcsCollectorResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendAcsCollectorResponse{}
	_body, _err := client.SendAcsCollectorEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: biot 私有化 业务数据上报
 * Summary: biot 私有化 业务数据上报
 */
func (client *Client) SendAcsCollectorEx(request *SendAcsCollectorRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendAcsCollectorResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendAcsCollectorResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.acs.collector.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提供设备基础信息查询服务
 * Summary: IoT设备平台-设备查询
 */
func (client *Client) QueryIotbasicDevice(request *QueryIotbasicDeviceRequest) (_result *QueryIotbasicDeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIotbasicDeviceResponse{}
	_body, _err := client.QueryIotbasicDeviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提供设备基础信息查询服务
 * Summary: IoT设备平台-设备查询
 */
func (client *Client) QueryIotbasicDeviceEx(request *QueryIotbasicDeviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIotbasicDeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIotbasicDeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.device.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: IoT产品开通状态查询
 * Summary: IoT产品开通状态查询
 */
func (client *Client) RecognizeIotbasicCustomer(request *RecognizeIotbasicCustomerRequest) (_result *RecognizeIotbasicCustomerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RecognizeIotbasicCustomerResponse{}
	_body, _err := client.RecognizeIotbasicCustomerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: IoT产品开通状态查询
 * Summary: IoT产品开通状态查询
 */
func (client *Client) RecognizeIotbasicCustomerEx(request *RecognizeIotbasicCustomerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RecognizeIotbasicCustomerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RecognizeIotbasicCustomerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.customer.recognize"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: IoT设备平台-设备认证
 * Summary: IoT设备平台-设备认证
 */
func (client *Client) CertifyIotbasicDevice(request *CertifyIotbasicDeviceRequest) (_result *CertifyIotbasicDeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CertifyIotbasicDeviceResponse{}
	_body, _err := client.CertifyIotbasicDeviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: IoT设备平台-设备认证
 * Summary: IoT设备平台-设备认证
 */
func (client *Client) CertifyIotbasicDeviceEx(request *CertifyIotbasicDeviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CertifyIotbasicDeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CertifyIotbasicDeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.device.certify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: iot平台用户注册操作，新增用户，删除用户，绑定角色等操作
 * Summary: iot平台用户注册操作
 */
func (client *Client) OperateIotbasicUser(request *OperateIotbasicUserRequest) (_result *OperateIotbasicUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateIotbasicUserResponse{}
	_body, _err := client.OperateIotbasicUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: iot平台用户注册操作，新增用户，删除用户，绑定角色等操作
 * Summary: iot平台用户注册操作
 */
func (client *Client) OperateIotbasicUserEx(request *OperateIotbasicUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateIotbasicUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateIotbasicUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.user.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: iot 平台权限操作
 * Summary: iot 平台权限操作
 */
func (client *Client) OperateIotbasicPermission(request *OperateIotbasicPermissionRequest) (_result *OperateIotbasicPermissionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateIotbasicPermissionResponse{}
	_body, _err := client.OperateIotbasicPermissionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: iot 平台权限操作
 * Summary: iot 平台权限操作
 */
func (client *Client) OperateIotbasicPermissionEx(request *OperateIotbasicPermissionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateIotbasicPermissionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateIotbasicPermissionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.permission.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: IoT设备平台-设备sn列表查询
 * Summary: IoT设备平台-设备sn列表查询
 */
func (client *Client) QueryIotbasicSn(request *QueryIotbasicSnRequest) (_result *QueryIotbasicSnResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIotbasicSnResponse{}
	_body, _err := client.QueryIotbasicSnEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: IoT设备平台-设备sn列表查询
 * Summary: IoT设备平台-设备sn列表查询
 */
func (client *Client) QueryIotbasicSnEx(request *QueryIotbasicSnRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIotbasicSnResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIotbasicSnResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.sn.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: IoT设备平台-设备规格查询
 * Summary: IoT设备平台-设备规格查询
 */
func (client *Client) QueryDeviceSpecs(request *QueryDeviceSpecsRequest) (_result *QueryDeviceSpecsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDeviceSpecsResponse{}
	_body, _err := client.QueryDeviceSpecsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: IoT设备平台-设备规格查询
 * Summary: IoT设备平台-设备规格查询
 */
func (client *Client) QueryDeviceSpecsEx(request *QueryDeviceSpecsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDeviceSpecsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDeviceSpecsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.device.specs.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: IoT设备平台-设备规格关系维护
 * Summary: IoT设备平台-设备规格关系维护
 */
func (client *Client) OperateIotbasicRelration(request *OperateIotbasicRelrationRequest) (_result *OperateIotbasicRelrationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateIotbasicRelrationResponse{}
	_body, _err := client.OperateIotbasicRelrationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: IoT设备平台-设备规格关系维护
 * Summary: IoT设备平台-设备规格关系维护
 */
func (client *Client) OperateIotbasicRelrationEx(request *OperateIotbasicRelrationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateIotbasicRelrationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateIotbasicRelrationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.relration.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: IoT设备平台-设备字典数据维护
 * Summary: IoT设备平台-设备字典数据维护
 */
func (client *Client) OperateIotbasicDictionary(request *OperateIotbasicDictionaryRequest) (_result *OperateIotbasicDictionaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateIotbasicDictionaryResponse{}
	_body, _err := client.OperateIotbasicDictionaryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: IoT设备平台-设备字典数据维护
 * Summary: IoT设备平台-设备字典数据维护
 */
func (client *Client) OperateIotbasicDictionaryEx(request *OperateIotbasicDictionaryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateIotbasicDictionaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateIotbasicDictionaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.dictionary.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: IoT设备平台-设备品类数据维护
 * Summary: IoT设备平台-设备品类数据维护
 */
func (client *Client) OperateIotbasicCategory(request *OperateIotbasicCategoryRequest) (_result *OperateIotbasicCategoryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateIotbasicCategoryResponse{}
	_body, _err := client.OperateIotbasicCategoryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: IoT设备平台-设备品类数据维护
 * Summary: IoT设备平台-设备品类数据维护
 */
func (client *Client) OperateIotbasicCategoryEx(request *OperateIotbasicCategoryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateIotbasicCategoryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateIotbasicCategoryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.category.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: IoT设备平台-设备管控配置维护
 * Summary: IoT设备平台-设备管控配置维护
 */
func (client *Client) OperateIotbasicControlconfig(request *OperateIotbasicControlconfigRequest) (_result *OperateIotbasicControlconfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateIotbasicControlconfigResponse{}
	_body, _err := client.OperateIotbasicControlconfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: IoT设备平台-设备管控配置维护
 * Summary: IoT设备平台-设备管控配置维护
 */
func (client *Client) OperateIotbasicControlconfigEx(request *OperateIotbasicControlconfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateIotbasicControlconfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateIotbasicControlconfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.controlconfig.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: IoT设备平台-上链业务模型配置维护
 * Summary: IoT设备平台-上链业务模型配置维护
 */
func (client *Client) OperateIotbasicChainmodel(request *OperateIotbasicChainmodelRequest) (_result *OperateIotbasicChainmodelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateIotbasicChainmodelResponse{}
	_body, _err := client.OperateIotbasicChainmodelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: IoT设备平台-上链业务模型配置维护
 * Summary: IoT设备平台-上链业务模型配置维护
 */
func (client *Client) OperateIotbasicChainmodelEx(request *OperateIotbasicChainmodelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateIotbasicChainmodelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateIotbasicChainmodelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.chainmodel.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: IoT设备平台-设备不可操作标记更新
 * Summary: IoT设备平台-设备不可操作标记更新
 */
func (client *Client) OperateIotbasicDevice(request *OperateIotbasicDeviceRequest) (_result *OperateIotbasicDeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateIotbasicDeviceResponse{}
	_body, _err := client.OperateIotbasicDeviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: IoT设备平台-设备不可操作标记更新
 * Summary: IoT设备平台-设备不可操作标记更新
 */
func (client *Client) OperateIotbasicDeviceEx(request *OperateIotbasicDeviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateIotbasicDeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateIotbasicDeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.device.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: biot设备注册-创建设备
 * Summary: biot设备注册-创建设备
 */
func (client *Client) CreateIotbasicDevice(request *CreateIotbasicDeviceRequest) (_result *CreateIotbasicDeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateIotbasicDeviceResponse{}
	_body, _err := client.CreateIotbasicDeviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: biot设备注册-创建设备
 * Summary: biot设备注册-创建设备
 */
func (client *Client) CreateIotbasicDeviceEx(request *CreateIotbasicDeviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateIotbasicDeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateIotbasicDeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.device.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: biot设备注册-批量创建设备
 * Summary: biot设备注册-批量创建设备
 */
func (client *Client) BatchcreateIotbasicDevice(request *BatchcreateIotbasicDeviceRequest) (_result *BatchcreateIotbasicDeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchcreateIotbasicDeviceResponse{}
	_body, _err := client.BatchcreateIotbasicDeviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: biot设备注册-批量创建设备
 * Summary: biot设备注册-批量创建设备
 */
func (client *Client) BatchcreateIotbasicDeviceEx(request *BatchcreateIotbasicDeviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchcreateIotbasicDeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchcreateIotbasicDeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.device.batchcreate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: biot设备状态同步
 * Summary: iot平台-设备状态同步
 */
func (client *Client) SyncIotbasicDevicestatus(request *SyncIotbasicDevicestatusRequest) (_result *SyncIotbasicDevicestatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncIotbasicDevicestatusResponse{}
	_body, _err := client.SyncIotbasicDevicestatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: biot设备状态同步
 * Summary: iot平台-设备状态同步
 */
func (client *Client) SyncIotbasicDevicestatusEx(request *SyncIotbasicDevicestatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncIotbasicDevicestatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncIotbasicDevicestatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.devicestatus.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: biot设备-安全认证
 * Summary: biot设备-安全认证
 */
func (client *Client) VerifyIotbasicIdentify(request *VerifyIotbasicIdentifyRequest) (_result *VerifyIotbasicIdentifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyIotbasicIdentifyResponse{}
	_body, _err := client.VerifyIotbasicIdentifyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: biot设备-安全认证
 * Summary: biot设备-安全认证
 */
func (client *Client) VerifyIotbasicIdentifyEx(request *VerifyIotbasicIdentifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyIotbasicIdentifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyIotbasicIdentifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.identify.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: IoT设备平台-更新设备信息
 * Summary: IoT设备平台-更新设备信息
 */
func (client *Client) UpdateIotbasicDevice(request *UpdateIotbasicDeviceRequest) (_result *UpdateIotbasicDeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateIotbasicDeviceResponse{}
	_body, _err := client.UpdateIotbasicDeviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: IoT设备平台-更新设备信息
 * Summary: IoT设备平台-更新设备信息
 */
func (client *Client) UpdateIotbasicDeviceEx(request *UpdateIotbasicDeviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateIotbasicDeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateIotbasicDeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.device.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: IoT设备平台-设备上链
 * Summary: IoT设备平台-设备上链
 */
func (client *Client) OperateIotbasicDevicecollect(request *OperateIotbasicDevicecollectRequest) (_result *OperateIotbasicDevicecollectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateIotbasicDevicecollectResponse{}
	_body, _err := client.OperateIotbasicDevicecollectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: IoT设备平台-设备上链
 * Summary: IoT设备平台-设备上链
 */
func (client *Client) OperateIotbasicDevicecollectEx(request *OperateIotbasicDevicecollectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateIotbasicDevicecollectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateIotbasicDevicecollectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.devicecollect.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: IoT设备平台-项目空间数据维护
 * Summary: IoT设备平台-项目空间数据维护
 */
func (client *Client) OperateIotbasicProjectspace(request *OperateIotbasicProjectspaceRequest) (_result *OperateIotbasicProjectspaceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateIotbasicProjectspaceResponse{}
	_body, _err := client.OperateIotbasicProjectspaceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: IoT设备平台-项目空间数据维护
 * Summary: IoT设备平台-项目空间数据维护
 */
func (client *Client) OperateIotbasicProjectspaceEx(request *OperateIotbasicProjectspaceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateIotbasicProjectspaceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateIotbasicProjectspaceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.projectspace.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 租房saas-企业信息同步(个人房东)
 * Summary: 租房saas-企业信息同步(个人房东)
 */
func (client *Client) PushRentMerchant(request *PushRentMerchantRequest) (_result *PushRentMerchantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushRentMerchantResponse{}
	_body, _err := client.PushRentMerchantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 租房saas-企业信息同步(个人房东)
 * Summary: 租房saas-企业信息同步(个人房东)
 */
func (client *Client) PushRentMerchantEx(request *PushRentMerchantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushRentMerchantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushRentMerchantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.rent.merchant.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 租房saas-业主账单信息同步
 * Summary: 租房saas-业主账单信息同步
 */
func (client *Client) PushRentBill(request *PushRentBillRequest) (_result *PushRentBillResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushRentBillResponse{}
	_body, _err := client.PushRentBillEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 租房saas-业主账单信息同步
 * Summary: 租房saas-业主账单信息同步
 */
func (client *Client) PushRentBillEx(request *PushRentBillRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushRentBillResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushRentBillResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.rent.bill.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 租房saas-租客入住信息同步
 * Summary: 租房saas-租客入住信息同步
 */
func (client *Client) PushRentRenter(request *PushRentRenterRequest) (_result *PushRentRenterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushRentRenterResponse{}
	_body, _err := client.PushRentRenterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 租房saas-租客入住信息同步
 * Summary: 租房saas-租客入住信息同步
 */
func (client *Client) PushRentRenterEx(request *PushRentRenterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushRentRenterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushRentRenterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.rent.renter.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 租房saas-租金缴纳支付状态通知
 * Summary: 租房saas-租金缴纳支付状态通知
 */
func (client *Client) SyncRentRentpayment(request *SyncRentRentpaymentRequest) (_result *SyncRentRentpaymentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncRentRentpaymentResponse{}
	_body, _err := client.SyncRentRentpaymentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 租房saas-租金缴纳支付状态通知
 * Summary: 租房saas-租金缴纳支付状态通知
 */
func (client *Client) SyncRentRentpaymentEx(request *SyncRentRentpaymentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncRentRentpaymentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncRentRentpaymentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.rent.rentpayment.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 租房saas-房源信息同步
 * Summary: 租房saas-房源信息同步
 */
func (client *Client) PushRentHouse(request *PushRentHouseRequest) (_result *PushRentHouseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushRentHouseResponse{}
	_body, _err := client.PushRentHouseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 租房saas-房源信息同步
 * Summary: 租房saas-房源信息同步
 */
func (client *Client) PushRentHouseEx(request *PushRentHouseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushRentHouseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushRentHouseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.rent.house.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: IoT设备平台-生成设备认证密钥
 * Summary: IoT设备平台-生成设备认证密钥
 */
func (client *Client) SyncIotbasicDevicegenerate(request *SyncIotbasicDevicegenerateRequest) (_result *SyncIotbasicDevicegenerateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncIotbasicDevicegenerateResponse{}
	_body, _err := client.SyncIotbasicDevicegenerateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: IoT设备平台-生成设备认证密钥
 * Summary: IoT设备平台-生成设备认证密钥
 */
func (client *Client) SyncIotbasicDevicegenerateEx(request *SyncIotbasicDevicegenerateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncIotbasicDevicegenerateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncIotbasicDevicegenerateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.devicegenerate.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: IoT设备平台-批量数据上链
 * Summary: IoT设备平台-批量数据上链
 */
func (client *Client) OperateIotbasicBatchcollect(request *OperateIotbasicBatchcollectRequest) (_result *OperateIotbasicBatchcollectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateIotbasicBatchcollectResponse{}
	_body, _err := client.OperateIotbasicBatchcollectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: IoT设备平台-批量数据上链
 * Summary: IoT设备平台-批量数据上链
 */
func (client *Client) OperateIotbasicBatchcollectEx(request *OperateIotbasicBatchcollectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateIotbasicBatchcollectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateIotbasicBatchcollectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.batchcollect.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: IoT设备平台-设备订单导入
 * Summary: IoT设备平台-设备订单导入
 */
func (client *Client) ImportIotbasicDeviceorder(request *ImportIotbasicDeviceorderRequest) (_result *ImportIotbasicDeviceorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportIotbasicDeviceorderResponse{}
	_body, _err := client.ImportIotbasicDeviceorderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: IoT设备平台-设备订单导入
 * Summary: IoT设备平台-设备订单导入
 */
func (client *Client) ImportIotbasicDeviceorderEx(request *ImportIotbasicDeviceorderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportIotbasicDeviceorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportIotbasicDeviceorderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.deviceorder.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: IoT设备平台-订单批量同步
 * Summary: IoT设备平台-订单批量同步
 */
func (client *Client) ImportIotbasicDeviceorderbatch(request *ImportIotbasicDeviceorderbatchRequest) (_result *ImportIotbasicDeviceorderbatchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportIotbasicDeviceorderbatchResponse{}
	_body, _err := client.ImportIotbasicDeviceorderbatchEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: IoT设备平台-订单批量同步
 * Summary: IoT设备平台-订单批量同步
 */
func (client *Client) ImportIotbasicDeviceorderbatchEx(request *ImportIotbasicDeviceorderbatchRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportIotbasicDeviceorderbatchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportIotbasicDeviceorderbatchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.deviceorderbatch.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: IoT设备平台-删除设备信息
 * Summary: IoT设备平台-删除设备信息
 */
func (client *Client) DeleteIotbasicDevice(request *DeleteIotbasicDeviceRequest) (_result *DeleteIotbasicDeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteIotbasicDeviceResponse{}
	_body, _err := client.DeleteIotbasicDeviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: IoT设备平台-删除设备信息
 * Summary: IoT设备平台-删除设备信息
 */
func (client *Client) DeleteIotbasicDeviceEx(request *DeleteIotbasicDeviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteIotbasicDeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteIotbasicDeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.device.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: IoT设备平台-设备远程管控
 * Summary: IoT设备平台-设备远程管控
 */
func (client *Client) OperateIotbasicDevicecontrol(request *OperateIotbasicDevicecontrolRequest) (_result *OperateIotbasicDevicecontrolResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateIotbasicDevicecontrolResponse{}
	_body, _err := client.OperateIotbasicDevicecontrolEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: IoT设备平台-设备远程管控
 * Summary: IoT设备平台-设备远程管控
 */
func (client *Client) OperateIotbasicDevicecontrolEx(request *OperateIotbasicDevicecontrolRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateIotbasicDevicecontrolResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateIotbasicDevicecontrolResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.devicecontrol.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: IoT设备平台-设备注册结果查询
 * Summary: IoT设备平台-设备注册结果查询
 */
func (client *Client) QueryDeviceRegisterresult(request *QueryDeviceRegisterresultRequest) (_result *QueryDeviceRegisterresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDeviceRegisterresultResponse{}
	_body, _err := client.QueryDeviceRegisterresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: IoT设备平台-设备注册结果查询
 * Summary: IoT设备平台-设备注册结果查询
 */
func (client *Client) QueryDeviceRegisterresultEx(request *QueryDeviceRegisterresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDeviceRegisterresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDeviceRegisterresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.device.registerresult.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: IoT设备平台-设备状态查询
 * Summary: IoT设备平台-设备状态查询
 */
func (client *Client) QueryDeviceStatus(request *QueryDeviceStatusRequest) (_result *QueryDeviceStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDeviceStatusResponse{}
	_body, _err := client.QueryDeviceStatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: IoT设备平台-设备状态查询
 * Summary: IoT设备平台-设备状态查询
 */
func (client *Client) QueryDeviceStatusEx(request *QueryDeviceStatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDeviceStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDeviceStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.device.status.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: IoT设备平台-openApi操作
 * Summary: IoT设备平台-openApi操作
 */
func (client *Client) OperateIotbasicOpenapi(request *OperateIotbasicOpenapiRequest) (_result *OperateIotbasicOpenapiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateIotbasicOpenapiResponse{}
	_body, _err := client.OperateIotbasicOpenapiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: IoT设备平台-openApi操作
 * Summary: IoT设备平台-openApi操作
 */
func (client *Client) OperateIotbasicOpenapiEx(request *OperateIotbasicOpenapiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateIotbasicOpenapiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateIotbasicOpenapiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.openapi.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 上链数据分页查询
 * Summary: 上链数据分页查询
 */
func (client *Client) QueryIotbasicDevicecollect(request *QueryIotbasicDevicecollectRequest) (_result *QueryIotbasicDevicecollectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIotbasicDevicecollectResponse{}
	_body, _err := client.QueryIotbasicDevicecollectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上链数据分页查询
 * Summary: 上链数据分页查询
 */
func (client *Client) QueryIotbasicDevicecollectEx(request *QueryIotbasicDevicecollectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIotbasicDevicecollectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIotbasicDevicecollectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.devicecollect.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 订单上链数据分页查询
 * Summary: 订单上链数据分页查询
 */
func (client *Client) QueryIotbasicDeviceorder(request *QueryIotbasicDeviceorderRequest) (_result *QueryIotbasicDeviceorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIotbasicDeviceorderResponse{}
	_body, _err := client.QueryIotbasicDeviceorderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 订单上链数据分页查询
 * Summary: 订单上链数据分页查询
 */
func (client *Client) QueryIotbasicDeviceorderEx(request *QueryIotbasicDeviceorderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIotbasicDeviceorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIotbasicDeviceorderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.deviceorder.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: IoT设备平台-订单数据推送中台
 * Summary: IoT设备平台-订单数据推送中台
 */
func (client *Client) PushIotbasicMeterdata(request *PushIotbasicMeterdataRequest) (_result *PushIotbasicMeterdataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushIotbasicMeterdataResponse{}
	_body, _err := client.PushIotbasicMeterdataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: IoT设备平台-订单数据推送中台
 * Summary: IoT设备平台-订单数据推送中台
 */
func (client *Client) PushIotbasicMeterdataEx(request *PushIotbasicMeterdataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushIotbasicMeterdataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushIotbasicMeterdataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.meterdata.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: IoT设备平台-客户新增
 * Summary: IoT设备平台-客户新增
 */
func (client *Client) SaveIotbasicCustomer(request *SaveIotbasicCustomerRequest) (_result *SaveIotbasicCustomerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveIotbasicCustomerResponse{}
	_body, _err := client.SaveIotbasicCustomerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: IoT设备平台-客户新增
 * Summary: IoT设备平台-客户新增
 */
func (client *Client) SaveIotbasicCustomerEx(request *SaveIotbasicCustomerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveIotbasicCustomerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveIotbasicCustomerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.customer.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据设备串号查询采购设备
 * Summary: 根据设备串号查询采购设备
 */
func (client *Client) QueryIotplatformPurchaseorder(request *QueryIotplatformPurchaseorderRequest) (_result *QueryIotplatformPurchaseorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIotplatformPurchaseorderResponse{}
	_body, _err := client.QueryIotplatformPurchaseorderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据设备串号查询采购设备
 * Summary: 根据设备串号查询采购设备
 */
func (client *Client) QueryIotplatformPurchaseorderEx(request *QueryIotplatformPurchaseorderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIotplatformPurchaseorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIotplatformPurchaseorderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotplatform.purchaseorder.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 设备租赁业务中在PC设备出厂时进行MeshId及SN号的关联绑定
 * Summary: 绑定MeshId及设备SN
 */
func (client *Client) ImportIotplatformMeshid(request *ImportIotplatformMeshidRequest) (_result *ImportIotplatformMeshidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportIotplatformMeshidResponse{}
	_body, _err := client.ImportIotplatformMeshidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 设备租赁业务中在PC设备出厂时进行MeshId及SN号的关联绑定
 * Summary: 绑定MeshId及设备SN
 */
func (client *Client) ImportIotplatformMeshidEx(request *ImportIotplatformMeshidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportIotplatformMeshidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportIotplatformMeshidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotplatform.meshid.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 与租赁宝对接采购订单导入的接口
 * Summary: 与租赁宝对接采购订单导入的接口
 */
func (client *Client) ImportPurchaseorderThirdparty(request *ImportPurchaseorderThirdpartyRequest) (_result *ImportPurchaseorderThirdpartyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportPurchaseorderThirdpartyResponse{}
	_body, _err := client.ImportPurchaseorderThirdpartyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 与租赁宝对接采购订单导入的接口
 * Summary: 与租赁宝对接采购订单导入的接口
 */
func (client *Client) ImportPurchaseorderThirdpartyEx(request *ImportPurchaseorderThirdpartyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportPurchaseorderThirdpartyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportPurchaseorderThirdpartyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.purchaseorder.thirdparty.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 采购平台新增供应商角色
 * Summary: 采购平台新增供应商角色
 */
func (client *Client) AddUserRole(request *AddUserRoleRequest) (_result *AddUserRoleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddUserRoleResponse{}
	_body, _err := client.AddUserRoleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 采购平台新增供应商角色
 * Summary: 采购平台新增供应商角色
 */
func (client *Client) AddUserRoleEx(request *AddUserRoleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddUserRoleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddUserRoleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.user.role.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 采购平台新增SKU
 * Summary: 采购平台新增SKU
 */
func (client *Client) AddGoodsSku(request *AddGoodsSkuRequest) (_result *AddGoodsSkuResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddGoodsSkuResponse{}
	_body, _err := client.AddGoodsSkuEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 采购平台新增SKU
 * Summary: 采购平台新增SKU
 */
func (client *Client) AddGoodsSkuEx(request *AddGoodsSkuRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddGoodsSkuResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddGoodsSkuResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.goods.sku.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: Iotplatform-设备订单计费上传
 * Summary: Iotplatform-设备订单计费上传
 */
func (client *Client) PushMeterdataOrder(request *PushMeterdataOrderRequest) (_result *PushMeterdataOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushMeterdataOrderResponse{}
	_body, _err := client.PushMeterdataOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: Iotplatform-设备订单计费上传
 * Summary: Iotplatform-设备订单计费上传
 */
func (client *Client) PushMeterdataOrderEx(request *PushMeterdataOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushMeterdataOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushMeterdataOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.meterdata.order.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建数据模型
 * Summary: 创建数据模型
 */
func (client *Client) CreateDeviceDatamodel(request *CreateDeviceDatamodelRequest) (_result *CreateDeviceDatamodelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDeviceDatamodelResponse{}
	_body, _err := client.CreateDeviceDatamodelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建数据模型
 * Summary: 创建数据模型
 */
func (client *Client) CreateDeviceDatamodelEx(request *CreateDeviceDatamodelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDeviceDatamodelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDeviceDatamodelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.device.datamodel.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取数据模型
 * Summary: 获取数据模型
 */
func (client *Client) GetDeviceDatamodel(request *GetDeviceDatamodelRequest) (_result *GetDeviceDatamodelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetDeviceDatamodelResponse{}
	_body, _err := client.GetDeviceDatamodelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取数据模型
 * Summary: 获取数据模型
 */
func (client *Client) GetDeviceDatamodelEx(request *GetDeviceDatamodelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetDeviceDatamodelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDeviceDatamodelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.device.datamodel.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 注册设备
 * Summary: 注册设备
 */
func (client *Client) ImportDevice(request *ImportDeviceRequest) (_result *ImportDeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportDeviceResponse{}
	_body, _err := client.ImportDeviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 注册设备
 * Summary: 注册设备
 */
func (client *Client) ImportDeviceEx(request *ImportDeviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportDeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportDeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.device.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过chainId获取设备详情
 * Summary: 通过chainId获取设备详情
 */
func (client *Client) GetDeviceBychainid(request *GetDeviceBychainidRequest) (_result *GetDeviceBychainidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetDeviceBychainidResponse{}
	_body, _err := client.GetDeviceBychainidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过chainId获取设备详情
 * Summary: 通过chainId获取设备详情
 */
func (client *Client) GetDeviceBychainidEx(request *GetDeviceBychainidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetDeviceBychainidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDeviceBychainidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.device.bychainid.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过deviceId获取设备详情
 * Summary: 通过deviceId获取设备详情
 */
func (client *Client) GetDeviceBydeviceid(request *GetDeviceBydeviceidRequest) (_result *GetDeviceBydeviceidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetDeviceBydeviceidResponse{}
	_body, _err := client.GetDeviceBydeviceidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过deviceId获取设备详情
 * Summary: 通过deviceId获取设备详情
 */
func (client *Client) GetDeviceBydeviceidEx(request *GetDeviceBydeviceidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetDeviceBydeviceidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDeviceBydeviceidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.device.bydeviceid.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过场景码列举设备
 * Summary: 通过场景码列举设备
 */
func (client *Client) ListDeviceByscene(request *ListDeviceBysceneRequest) (_result *ListDeviceBysceneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListDeviceBysceneResponse{}
	_body, _err := client.ListDeviceBysceneEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过场景码列举设备
 * Summary: 通过场景码列举设备
 */
func (client *Client) ListDeviceBysceneEx(request *ListDeviceBysceneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListDeviceBysceneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListDeviceBysceneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.device.byscene.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新设备信息
 * Summary: 更新设备信息
 */
func (client *Client) UpdateDeviceInfo(request *UpdateDeviceInfoRequest) (_result *UpdateDeviceInfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateDeviceInfoResponse{}
	_body, _err := client.UpdateDeviceInfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新设备信息
 * Summary: 更新设备信息
 */
func (client *Client) UpdateDeviceInfoEx(request *UpdateDeviceInfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateDeviceInfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateDeviceInfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.device.info.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过deviceId发行设备
 * Summary: 通过deviceId发行设备
 */
func (client *Client) CreateDistributedeviceBydeviceid(request *CreateDistributedeviceBydeviceidRequest) (_result *CreateDistributedeviceBydeviceidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDistributedeviceBydeviceidResponse{}
	_body, _err := client.CreateDistributedeviceBydeviceidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过deviceId发行设备
 * Summary: 通过deviceId发行设备
 */
func (client *Client) CreateDistributedeviceBydeviceidEx(request *CreateDistributedeviceBydeviceidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDistributedeviceBydeviceidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDistributedeviceBydeviceidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.distributedevice.bydeviceid.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过链上设备Id发行
 * Summary: 通过链上设备Id发行
 */
func (client *Client) CreateDistributedeviceBychainid(request *CreateDistributedeviceBychainidRequest) (_result *CreateDistributedeviceBychainidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDistributedeviceBychainidResponse{}
	_body, _err := client.CreateDistributedeviceBychainidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过链上设备Id发行
 * Summary: 通过链上设备Id发行
 */
func (client *Client) CreateDistributedeviceBychainidEx(request *CreateDistributedeviceBychainidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDistributedeviceBychainidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDistributedeviceBychainidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.distributedevice.bychainid.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 替换发行设备
 * Summary: 替换发行设备
 */
func (client *Client) ReplaceDistributedeviceBychainid(request *ReplaceDistributedeviceBychainidRequest) (_result *ReplaceDistributedeviceBychainidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ReplaceDistributedeviceBychainidResponse{}
	_body, _err := client.ReplaceDistributedeviceBychainidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 替换发行设备
 * Summary: 替换发行设备
 */
func (client *Client) ReplaceDistributedeviceBychainidEx(request *ReplaceDistributedeviceBychainidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ReplaceDistributedeviceBychainidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ReplaceDistributedeviceBychainidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.distributedevice.bychainid.replace"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 上传单个设备所产生的设备数据
 * Summary: 上传设备数据
 */
func (client *Client) SendCollectorBychainid(request *SendCollectorBychainidRequest) (_result *SendCollectorBychainidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendCollectorBychainidResponse{}
	_body, _err := client.SendCollectorBychainidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上传单个设备所产生的设备数据
 * Summary: 上传设备数据
 */
func (client *Client) SendCollectorBychainidEx(request *SendCollectorBychainidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendCollectorBychainidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendCollectorBychainidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.collector.bychainid.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过Id获取发行设备
 * Summary: 通过Id获取发行设备
 */
func (client *Client) GetDistributedeviceBychainid(request *GetDistributedeviceBychainidRequest) (_result *GetDistributedeviceBychainidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetDistributedeviceBychainidResponse{}
	_body, _err := client.GetDistributedeviceBychainidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过Id获取发行设备
 * Summary: 通过Id获取发行设备
 */
func (client *Client) GetDistributedeviceBychainidEx(request *GetDistributedeviceBychainidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetDistributedeviceBychainidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDistributedeviceBychainidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.distributedevice.bychainid.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过场景码列举发行设备
 * Summary: 通过场景码列举发行设备
 */
func (client *Client) ListDistributedeviceByscene(request *ListDistributedeviceBysceneRequest) (_result *ListDistributedeviceBysceneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListDistributedeviceBysceneResponse{}
	_body, _err := client.ListDistributedeviceBysceneEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过场景码列举发行设备
 * Summary: 通过场景码列举发行设备
 */
func (client *Client) ListDistributedeviceBysceneEx(request *ListDistributedeviceBysceneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListDistributedeviceBysceneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListDistributedeviceBysceneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.distributedevice.byscene.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建消费者
 * Summary: 创建消费者
 */
func (client *Client) CreateConsumer(request *CreateConsumerRequest) (_result *CreateConsumerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateConsumerResponse{}
	_body, _err := client.CreateConsumerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建消费者
 * Summary: 创建消费者
 */
func (client *Client) CreateConsumerEx(request *CreateConsumerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateConsumerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateConsumerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.consumer.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 消费者订阅
 * Summary: 消费者订阅
 */
func (client *Client) SetConsumerSubscribe(request *SetConsumerSubscribeRequest) (_result *SetConsumerSubscribeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SetConsumerSubscribeResponse{}
	_body, _err := client.SetConsumerSubscribeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 消费者订阅
 * Summary: 消费者订阅
 */
func (client *Client) SetConsumerSubscribeEx(request *SetConsumerSubscribeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SetConsumerSubscribeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SetConsumerSubscribeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.consumer.subscribe.set"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 消费者取消订阅设备
 * Summary: 消费者取消订阅设备
 */
func (client *Client) SetConsumerUnsubscribe(request *SetConsumerUnsubscribeRequest) (_result *SetConsumerUnsubscribeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SetConsumerUnsubscribeResponse{}
	_body, _err := client.SetConsumerUnsubscribeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 消费者取消订阅设备
 * Summary: 消费者取消订阅设备
 */
func (client *Client) SetConsumerUnsubscribeEx(request *SetConsumerUnsubscribeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SetConsumerUnsubscribeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SetConsumerUnsubscribeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.consumer.unsubscribe.set"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 消费者获取数据
 * Summary: 消费者获取数据
 */
func (client *Client) PullConsumerDatasource(request *PullConsumerDatasourceRequest) (_result *PullConsumerDatasourceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PullConsumerDatasourceResponse{}
	_body, _err := client.PullConsumerDatasourceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 消费者获取数据
 * Summary: 消费者获取数据
 */
func (client *Client) PullConsumerDatasourceEx(request *PullConsumerDatasourceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PullConsumerDatasourceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PullConsumerDatasourceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.consumer.datasource.pull"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过设备id获取发行设备详情
 * Summary: 通过设备id获取发行设备详情
 */
func (client *Client) GetDistributedeviceBydeviceid(request *GetDistributedeviceBydeviceidRequest) (_result *GetDistributedeviceBydeviceidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetDistributedeviceBydeviceidResponse{}
	_body, _err := client.GetDistributedeviceBydeviceidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过设备id获取发行设备详情
 * Summary: 通过设备id获取发行设备详情
 */
func (client *Client) GetDistributedeviceBydeviceidEx(request *GetDistributedeviceBydeviceidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetDistributedeviceBydeviceidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDistributedeviceBydeviceidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.distributedevice.bydeviceid.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过发行id获取设备
 * Summary: 通过发行id获取设备
 */
func (client *Client) GetDistributedeviceBydisid(request *GetDistributedeviceBydisidRequest) (_result *GetDistributedeviceBydisidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetDistributedeviceBydisidResponse{}
	_body, _err := client.GetDistributedeviceBydisidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过发行id获取设备
 * Summary: 通过发行id获取设备
 */
func (client *Client) GetDistributedeviceBydisidEx(request *GetDistributedeviceBydisidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetDistributedeviceBydisidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDistributedeviceBydisidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.distributedevice.bydisid.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 注册外围设备
 * Summary: 注册外围设备
 */
func (client *Client) ImportPeripheral(request *ImportPeripheralRequest) (_result *ImportPeripheralResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportPeripheralResponse{}
	_body, _err := client.ImportPeripheralEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 注册外围设备
 * Summary: 注册外围设备
 */
func (client *Client) ImportPeripheralEx(request *ImportPeripheralRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportPeripheralResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportPeripheralResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.peripheral.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过链上外围设备ID获取详情
 * Summary: 通过链上外围设备ID获取详情
 */
func (client *Client) GetPeripheralBychainperipheralid(request *GetPeripheralBychainperipheralidRequest) (_result *GetPeripheralBychainperipheralidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetPeripheralBychainperipheralidResponse{}
	_body, _err := client.GetPeripheralBychainperipheralidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过链上外围设备ID获取详情
 * Summary: 通过链上外围设备ID获取详情
 */
func (client *Client) GetPeripheralBychainperipheralidEx(request *GetPeripheralBychainperipheralidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetPeripheralBychainperipheralidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetPeripheralBychainperipheralidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.peripheral.bychainperipheralid.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过外围设备ID获取详情
 * Summary: 通过外围设备ID获取详情
 */
func (client *Client) GetPeripheralByperipheralid(request *GetPeripheralByperipheralidRequest) (_result *GetPeripheralByperipheralidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetPeripheralByperipheralidResponse{}
	_body, _err := client.GetPeripheralByperipheralidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过外围设备ID获取详情
 * Summary: 通过外围设备ID获取详情
 */
func (client *Client) GetPeripheralByperipheralidEx(request *GetPeripheralByperipheralidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetPeripheralByperipheralidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetPeripheralByperipheralidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.peripheral.byperipheralid.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据场景列举外围设备
 * Summary: 根据场景列举外围设备
 */
func (client *Client) ListPeripheralByscene(request *ListPeripheralBysceneRequest) (_result *ListPeripheralBysceneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListPeripheralBysceneResponse{}
	_body, _err := client.ListPeripheralBysceneEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据场景列举外围设备
 * Summary: 根据场景列举外围设备
 */
func (client *Client) ListPeripheralBysceneEx(request *ListPeripheralBysceneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListPeripheralBysceneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListPeripheralBysceneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.peripheral.byscene.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过外围设备Id发行
 * Summary: 通过外围设备Id发行
 */
func (client *Client) CreateDistributedeviceByperipheralid(request *CreateDistributedeviceByperipheralidRequest) (_result *CreateDistributedeviceByperipheralidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDistributedeviceByperipheralidResponse{}
	_body, _err := client.CreateDistributedeviceByperipheralidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过外围设备Id发行
 * Summary: 通过外围设备Id发行
 */
func (client *Client) CreateDistributedeviceByperipheralidEx(request *CreateDistributedeviceByperipheralidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDistributedeviceByperipheralidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDistributedeviceByperipheralidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.distributedevice.byperipheralid.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过链上外围设备Id发行
 * Summary: 通过链上外围设备Id发行
 */
func (client *Client) CreateDistributedeviceBychainperipheralid(request *CreateDistributedeviceBychainperipheralidRequest) (_result *CreateDistributedeviceBychainperipheralidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDistributedeviceBychainperipheralidResponse{}
	_body, _err := client.CreateDistributedeviceBychainperipheralidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过链上外围设备Id发行
 * Summary: 通过链上外围设备Id发行
 */
func (client *Client) CreateDistributedeviceBychainperipheralidEx(request *CreateDistributedeviceBychainperipheralidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDistributedeviceBychainperipheralidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDistributedeviceBychainperipheralidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.distributedevice.bychainperipheralid.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 替换发行外围设备 by 链上外围设备ID
 * Summary: 替换发行外围设备 by 链上外围设备ID
 */
func (client *Client) ReplaceDistributedeviceBychainperipheralid(request *ReplaceDistributedeviceBychainperipheralidRequest) (_result *ReplaceDistributedeviceBychainperipheralidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ReplaceDistributedeviceBychainperipheralidResponse{}
	_body, _err := client.ReplaceDistributedeviceBychainperipheralidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 替换发行外围设备 by 链上外围设备ID
 * Summary: 替换发行外围设备 by 链上外围设备ID
 */
func (client *Client) ReplaceDistributedeviceBychainperipheralidEx(request *ReplaceDistributedeviceBychainperipheralidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ReplaceDistributedeviceBychainperipheralidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ReplaceDistributedeviceBychainperipheralidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.distributedevice.bychainperipheralid.replace"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据场景列举发行外围设备
 * Summary: 根据场景列举发行外围设备
 */
func (client *Client) ListDistributedeviceByperipheralscene(request *ListDistributedeviceByperipheralsceneRequest) (_result *ListDistributedeviceByperipheralsceneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListDistributedeviceByperipheralsceneResponse{}
	_body, _err := client.ListDistributedeviceByperipheralsceneEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据场景列举发行外围设备
 * Summary: 根据场景列举发行外围设备
 */
func (client *Client) ListDistributedeviceByperipheralsceneEx(request *ListDistributedeviceByperipheralsceneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListDistributedeviceByperipheralsceneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListDistributedeviceByperipheralsceneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.distributedevice.byperipheralscene.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过外围设备ID获取发行外围设备信息
 * Summary: 通过外围设备ID获取发行外围设备信息
 */
func (client *Client) GetDistributedeviceByperipheralid(request *GetDistributedeviceByperipheralidRequest) (_result *GetDistributedeviceByperipheralidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetDistributedeviceByperipheralidResponse{}
	_body, _err := client.GetDistributedeviceByperipheralidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过外围设备ID获取发行外围设备信息
 * Summary: 通过外围设备ID获取发行外围设备信息
 */
func (client *Client) GetDistributedeviceByperipheralidEx(request *GetDistributedeviceByperipheralidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetDistributedeviceByperipheralidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDistributedeviceByperipheralidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.distributedevice.byperipheralid.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发行设备by_devcie
 * Summary: 发行设备by_devcie
 */
func (client *Client) CreateDistributedeviceBydevice(request *CreateDistributedeviceBydeviceRequest) (_result *CreateDistributedeviceBydeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDistributedeviceBydeviceResponse{}
	_body, _err := client.CreateDistributedeviceBydeviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发行设备by_devcie
 * Summary: 发行设备by_devcie
 */
func (client *Client) CreateDistributedeviceBydeviceEx(request *CreateDistributedeviceBydeviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDistributedeviceBydeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDistributedeviceBydeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.distributedevice.bydevice.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 远程任务创建
 * Summary: 远程任务创建
 */
func (client *Client) CreateTask(request *CreateTaskRequest) (_result *CreateTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateTaskResponse{}
	_body, _err := client.CreateTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 远程任务创建
 * Summary: 远程任务创建
 */
func (client *Client) CreateTaskEx(request *CreateTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.task.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 远程任务查询
 * Summary: 远程任务查询
 */
func (client *Client) QueryTask(request *QueryTaskRequest) (_result *QueryTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTaskResponse{}
	_body, _err := client.QueryTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 远程任务查询
 * Summary: 远程任务查询
 */
func (client *Client) QueryTaskEx(request *QueryTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.task.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分析数据查询
 * Summary: 分析数据查询
 */
func (client *Client) QueryAnalysis(request *QueryAnalysisRequest) (_result *QueryAnalysisResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAnalysisResponse{}
	_body, _err := client.QueryAnalysisEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分析数据查询
 * Summary: 分析数据查询
 */
func (client *Client) QueryAnalysisEx(request *QueryAnalysisRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAnalysisResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAnalysisResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.analysis.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 上传数据mul（可能是多个不同的设备分别产生的多条数据）
 * Summary: 上传设备数据mul
 */
func (client *Client) SendCollectorBychainidmul(request *SendCollectorBychainidmulRequest) (_result *SendCollectorBychainidmulResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendCollectorBychainidmulResponse{}
	_body, _err := client.SendCollectorBychainidmulEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上传数据mul（可能是多个不同的设备分别产生的多条数据）
 * Summary: 上传设备数据mul
 */
func (client *Client) SendCollectorBychainidmulEx(request *SendCollectorBychainidmulRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendCollectorBychainidmulResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendCollectorBychainidmulResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.collector.bychainidmul.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 上传设备业务数据
 * Summary: 上传设备业务数据
 */
func (client *Client) SendCollectorDevicebizdata(request *SendCollectorDevicebizdataRequest) (_result *SendCollectorDevicebizdataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendCollectorDevicebizdataResponse{}
	_body, _err := client.SendCollectorDevicebizdataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上传设备业务数据
 * Summary: 上传设备业务数据
 */
func (client *Client) SendCollectorDevicebizdataEx(request *SendCollectorDevicebizdataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendCollectorDevicebizdataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendCollectorDevicebizdataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.collector.devicebizdata.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新设备信息by_devcie
 * Summary: 更新设备信息by_devcie
 */
func (client *Client) UpdateDeviceInfobydevice(request *UpdateDeviceInfobydeviceRequest) (_result *UpdateDeviceInfobydeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateDeviceInfobydeviceResponse{}
	_body, _err := client.UpdateDeviceInfobydeviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新设备信息by_devcie
 * Summary: 更新设备信息by_devcie
 */
func (client *Client) UpdateDeviceInfobydeviceEx(request *UpdateDeviceInfobydeviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateDeviceInfobydeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateDeviceInfobydeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.device.infobydevice.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 下线设备
 * Summary: 下线设备
 */
func (client *Client) OfflineDevice(request *OfflineDeviceRequest) (_result *OfflineDeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OfflineDeviceResponse{}
	_body, _err := client.OfflineDeviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 下线设备
 * Summary: 下线设备
 */
func (client *Client) OfflineDeviceEx(request *OfflineDeviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OfflineDeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OfflineDeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.device.offline"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 申请MQTT token
 * Summary: 申请MQTT token
 */
func (client *Client) ApplyMqtoken(request *ApplyMqtokenRequest) (_result *ApplyMqtokenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyMqtokenResponse{}
	_body, _err := client.ApplyMqtokenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 申请MQTT token
 * Summary: 申请MQTT token
 */
func (client *Client) ApplyMqtokenEx(request *ApplyMqtokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyMqtokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyMqtokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.mqtoken.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询设备所注册的公钥是否正确
 * Summary: 查询注册信息
 */
func (client *Client) QueryDeviceRegistration(request *QueryDeviceRegistrationRequest) (_result *QueryDeviceRegistrationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDeviceRegistrationResponse{}
	_body, _err := client.QueryDeviceRegistrationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询设备所注册的公钥是否正确
 * Summary: 查询注册信息
 */
func (client *Client) QueryDeviceRegistrationEx(request *QueryDeviceRegistrationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDeviceRegistrationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDeviceRegistrationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.device.registration.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 设备异常上报
 * Summary: 设备异常上报
 */
func (client *Client) AddAbnormal(request *AddAbnormalRequest) (_result *AddAbnormalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddAbnormalResponse{}
	_body, _err := client.AddAbnormalEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 设备异常上报
 * Summary: 设备异常上报
 */
func (client *Client) AddAbnormalEx(request *AddAbnormalRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddAbnormalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddAbnormalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.abnormal.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 设备下线后，可通过此接口重新上线
 * Summary: 设置设备状态为上线
 */
func (client *Client) OnlineDevice(request *OnlineDeviceRequest) (_result *OnlineDeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OnlineDeviceResponse{}
	_body, _err := client.OnlineDeviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 设备下线后，可通过此接口重新上线
 * Summary: 设置设备状态为上线
 */
func (client *Client) OnlineDeviceEx(request *OnlineDeviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OnlineDeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OnlineDeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.device.online"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 注销设备
 * Summary: 注销设备
 */
func (client *Client) OfflineDeviceByunregister(request *OfflineDeviceByunregisterRequest) (_result *OfflineDeviceByunregisterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OfflineDeviceByunregisterResponse{}
	_body, _err := client.OfflineDeviceByunregisterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 注销设备
 * Summary: 注销设备
 */
func (client *Client) OfflineDeviceByunregisterEx(request *OfflineDeviceByunregisterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OfflineDeviceByunregisterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OfflineDeviceByunregisterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.device.byunregister.offline"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 标签状态查询
 * Summary: 标签状态查询
 */
func (client *Client) QueryLabelTrace(request *QueryLabelTraceRequest) (_result *QueryLabelTraceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryLabelTraceResponse{}
	_body, _err := client.QueryLabelTraceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 标签状态查询
 * Summary: 标签状态查询
 */
func (client *Client) QueryLabelTraceEx(request *QueryLabelTraceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryLabelTraceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryLabelTraceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.label.trace.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 标签流转状态同步
 * Summary: 标签流转状态同步
 */
func (client *Client) SyncLabelTransfer(request *SyncLabelTransferRequest) (_result *SyncLabelTransferResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncLabelTransferResponse{}
	_body, _err := client.SyncLabelTransferEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 标签流转状态同步
 * Summary: 标签流转状态同步
 */
func (client *Client) SyncLabelTransferEx(request *SyncLabelTransferRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncLabelTransferResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncLabelTransferResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.label.transfer.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 标签资产绑定
 * Summary: 标签资产绑定
 */
func (client *Client) AddLabelAsset(request *AddLabelAssetRequest) (_result *AddLabelAssetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddLabelAssetResponse{}
	_body, _err := client.AddLabelAssetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 标签资产绑定
 * Summary: 标签资产绑定
 */
func (client *Client) AddLabelAssetEx(request *AddLabelAssetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddLabelAssetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddLabelAssetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.label.asset.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过tx_hash查询上链信息
 * Summary: 链上信息查询
 */
func (client *Client) QueryDataBytxhash(request *QueryDataBytxhashRequest) (_result *QueryDataBytxhashResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDataBytxhashResponse{}
	_body, _err := client.QueryDataBytxhashEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过tx_hash查询上链信息
 * Summary: 链上信息查询
 */
func (client *Client) QueryDataBytxhashEx(request *QueryDataBytxhashRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDataBytxhashResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDataBytxhashResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.data.bytxhash.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据taskId 执行未处理的任务
 * Summary: 执行未处理的任务
 */
func (client *Client) ExecUnprocessedTask(request *ExecUnprocessedTaskRequest) (_result *ExecUnprocessedTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecUnprocessedTaskResponse{}
	_body, _err := client.ExecUnprocessedTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据taskId 执行未处理的任务
 * Summary: 执行未处理的任务
 */
func (client *Client) ExecUnprocessedTaskEx(request *ExecUnprocessedTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecUnprocessedTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecUnprocessedTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.unprocessed.task.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 上传汇总数据
 * Summary: 上传汇总数据
 */
func (client *Client) SendCollectorSummarydata(request *SendCollectorSummarydataRequest) (_result *SendCollectorSummarydataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendCollectorSummarydataResponse{}
	_body, _err := client.SendCollectorSummarydataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上传汇总数据
 * Summary: 上传汇总数据
 */
func (client *Client) SendCollectorSummarydataEx(request *SendCollectorSummarydataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendCollectorSummarydataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendCollectorSummarydataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.collector.summarydata.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据请求体内容保存密钥
 * Summary: 保存公钥
 */
func (client *Client) AddCertificate(request *AddCertificateRequest) (_result *AddCertificateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddCertificateResponse{}
	_body, _err := client.AddCertificateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据请求体内容保存密钥
 * Summary: 保存公钥
 */
func (client *Client) AddCertificateEx(request *AddCertificateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddCertificateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddCertificateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.certificate.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新增租户
 * Summary: 新增租户
 */
func (client *Client) AddTenant(request *AddTenantRequest) (_result *AddTenantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddTenantResponse{}
	_body, _err := client.AddTenantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新增租户
 * Summary: 新增租户
 */
func (client *Client) AddTenantEx(request *AddTenantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddTenantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddTenantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.tenant.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新增场景码
 * Summary: 新增场景码
 */
func (client *Client) AddScene(request *AddSceneRequest) (_result *AddSceneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddSceneResponse{}
	_body, _err := client.AddSceneEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新增场景码
 * Summary: 新增场景码
 */
func (client *Client) AddSceneEx(request *AddSceneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddSceneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddSceneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.scene.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 部署场景合同
 * Summary: 部署场景合同
 */
func (client *Client) DeployScene(request *DeploySceneRequest) (_result *DeploySceneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeploySceneResponse{}
	_body, _err := client.DeploySceneEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 部署场景合同
 * Summary: 部署场景合同
 */
func (client *Client) DeploySceneEx(request *DeploySceneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeploySceneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeploySceneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.scene.deploy"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新增sdk
 * Summary: 新增sdk
 */
func (client *Client) AddSdk(request *AddSdkRequest) (_result *AddSdkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddSdkResponse{}
	_body, _err := client.AddSdkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新增sdk
 * Summary: 新增sdk
 */
func (client *Client) AddSdkEx(request *AddSdkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddSdkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddSdkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.sdk.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新sdk
 * Summary: 更新sdk
 */
func (client *Client) UpdateSdk(request *UpdateSdkRequest) (_result *UpdateSdkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateSdkResponse{}
	_body, _err := client.UpdateSdkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新sdk
 * Summary: 更新sdk
 */
func (client *Client) UpdateSdkEx(request *UpdateSdkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateSdkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateSdkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.sdk.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新增productKey
 * Summary: 新增productKey
 */
func (client *Client) AddProductkey(request *AddProductkeyRequest) (_result *AddProductkeyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddProductkeyResponse{}
	_body, _err := client.AddProductkeyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新增productKey
 * Summary: 新增productKey
 */
func (client *Client) AddProductkeyEx(request *AddProductkeyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddProductkeyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddProductkeyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.productkey.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新productKey
 * Summary: 更新productKey
 */
func (client *Client) UpdateProductkey(request *UpdateProductkeyRequest) (_result *UpdateProductkeyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateProductkeyResponse{}
	_body, _err := client.UpdateProductkeyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新productKey
 * Summary: 更新productKey
 */
func (client *Client) UpdateProductkeyEx(request *UpdateProductkeyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateProductkeyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateProductkeyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.productkey.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新租户
 * Summary: 更新租户
 */
func (client *Client) UpdateTenant(request *UpdateTenantRequest) (_result *UpdateTenantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateTenantResponse{}
	_body, _err := client.UpdateTenantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新租户
 * Summary: 更新租户
 */
func (client *Client) UpdateTenantEx(request *UpdateTenantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateTenantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateTenantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.tenant.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新场景码
 * Summary: 更新场景码
 */
func (client *Client) UpdateScene(request *UpdateSceneRequest) (_result *UpdateSceneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateSceneResponse{}
	_body, _err := client.UpdateSceneEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新场景码
 * Summary: 更新场景码
 */
func (client *Client) UpdateSceneEx(request *UpdateSceneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateSceneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateSceneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.scene.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 上报标签流转的异步接口，是 blockchain.bot.label.transfer.sync的异步接口版本
 * Summary: 上报标签流转的异步接口
 */
func (client *Client) SendLabelTransferonasync(request *SendLabelTransferonasyncRequest) (_result *SendLabelTransferonasyncResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendLabelTransferonasyncResponse{}
	_body, _err := client.SendLabelTransferonasyncEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上报标签流转的异步接口，是 blockchain.bot.label.transfer.sync的异步接口版本
 * Summary: 上报标签流转的异步接口
 */
func (client *Client) SendLabelTransferonasyncEx(request *SendLabelTransferonasyncRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendLabelTransferonasyncResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendLabelTransferonasyncResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.label.transferonasync.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 调用异步接口后，在reponsePeriod 天内，可调用此接口查询异步接口的执行结果
 * Summary: 异步接口结果查询
 */
func (client *Client) QueryAsyncRequest(request *QueryAsyncRequestRequest) (_result *QueryAsyncRequestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAsyncRequestResponse{}
	_body, _err := client.QueryAsyncRequestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 调用异步接口后，在reponsePeriod 天内，可调用此接口查询异步接口的执行结果
 * Summary: 异步接口结果查询
 */
func (client *Client) QueryAsyncRequestEx(request *QueryAsyncRequestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAsyncRequestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAsyncRequestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.async.request.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询租户
 * Summary: 分页查询租户
 */
func (client *Client) PagequeryTenant(request *PagequeryTenantRequest) (_result *PagequeryTenantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryTenantResponse{}
	_body, _err := client.PagequeryTenantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询租户
 * Summary: 分页查询租户
 */
func (client *Client) PagequeryTenantEx(request *PagequeryTenantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryTenantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryTenantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.tenant.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询场景码
 * Summary: 分页查询场景码
 */
func (client *Client) PagequeryScene(request *PagequerySceneRequest) (_result *PagequerySceneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequerySceneResponse{}
	_body, _err := client.PagequerySceneEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询场景码
 * Summary: 分页查询场景码
 */
func (client *Client) PagequerySceneEx(request *PagequerySceneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequerySceneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequerySceneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.scene.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询sdk
 * Summary: 分页查询sdk
 */
func (client *Client) PagequerySdk(request *PagequerySdkRequest) (_result *PagequerySdkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequerySdkResponse{}
	_body, _err := client.PagequerySdkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询sdk
 * Summary: 分页查询sdk
 */
func (client *Client) PagequerySdkEx(request *PagequerySdkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequerySdkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequerySdkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.sdk.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询productKey
 * Summary: 分页查询productKey
 */
func (client *Client) PagequeryProductkey(request *PagequeryProductkeyRequest) (_result *PagequeryProductkeyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryProductkeyResponse{}
	_body, _err := client.PagequeryProductkeyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询productKey
 * Summary: 分页查询productKey
 */
func (client *Client) PagequeryProductkeyEx(request *PagequeryProductkeyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryProductkeyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryProductkeyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.productkey.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询校验失败的数据
 * Summary: 分页查询校验失败的数据
 */
func (client *Client) PagequeryDataverifyFailure(request *PagequeryDataverifyFailureRequest) (_result *PagequeryDataverifyFailureResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryDataverifyFailureResponse{}
	_body, _err := client.PagequeryDataverifyFailureEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询校验失败的数据
 * Summary: 分页查询校验失败的数据
 */
func (client *Client) PagequeryDataverifyFailureEx(request *PagequeryDataverifyFailureRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryDataverifyFailureResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryDataverifyFailureResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.dataverify.failure.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description:  新增告警策略
 * Summary:  新增告警策略
 */
func (client *Client) AddAlertStrategy(request *AddAlertStrategyRequest) (_result *AddAlertStrategyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddAlertStrategyResponse{}
	_body, _err := client.AddAlertStrategyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description:  新增告警策略
 * Summary:  新增告警策略
 */
func (client *Client) AddAlertStrategyEx(request *AddAlertStrategyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddAlertStrategyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddAlertStrategyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.alert.strategy.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新告警策略接口
 * Summary: 更新告警策略接口
 */
func (client *Client) UpdateAlertStrategy(request *UpdateAlertStrategyRequest) (_result *UpdateAlertStrategyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateAlertStrategyResponse{}
	_body, _err := client.UpdateAlertStrategyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新告警策略接口
 * Summary: 更新告警策略接口
 */
func (client *Client) UpdateAlertStrategyEx(request *UpdateAlertStrategyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateAlertStrategyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAlertStrategyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.alert.strategy.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询告警策略接口
 * Summary: 分页查询告警策略接口
 */
func (client *Client) PagequeryAlertStrategy(request *PagequeryAlertStrategyRequest) (_result *PagequeryAlertStrategyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryAlertStrategyResponse{}
	_body, _err := client.PagequeryAlertStrategyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询告警策略接口
 * Summary: 分页查询告警策略接口
 */
func (client *Client) PagequeryAlertStrategyEx(request *PagequeryAlertStrategyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryAlertStrategyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryAlertStrategyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.alert.strategy.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 标签流转状态同步（元数据，无签名）
 * Summary: 标签流转状态同步（元数据，无签名）
 */
func (client *Client) SyncLabelTransferraw(request *SyncLabelTransferrawRequest) (_result *SyncLabelTransferrawResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncLabelTransferrawResponse{}
	_body, _err := client.SyncLabelTransferrawEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 标签流转状态同步（元数据，无签名）
 * Summary: 标签流转状态同步（元数据，无签名）
 */
func (client *Client) SyncLabelTransferrawEx(request *SyncLabelTransferrawRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncLabelTransferrawResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncLabelTransferrawResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.label.transferraw.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 上报标签流转的异步接口（元数据，无签名），是 blockchain.bot.label.transferraw.sync的异步接口版本
 * Summary: 上报标签流转的异步接口（元数据，无签名）
 */
func (client *Client) SendLabelTransferrawonasync(request *SendLabelTransferrawonasyncRequest) (_result *SendLabelTransferrawonasyncResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendLabelTransferrawonasyncResponse{}
	_body, _err := client.SendLabelTransferrawonasyncEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上报标签流转的异步接口（元数据，无签名），是 blockchain.bot.label.transferraw.sync的异步接口版本
 * Summary: 上报标签流转的异步接口（元数据，无签名）
 */
func (client *Client) SendLabelTransferrawonasyncEx(request *SendLabelTransferrawonasyncRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendLabelTransferrawonasyncResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendLabelTransferrawonasyncResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.label.transferrawonasync.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据接口名和关键key（deviceId等）, 查询验收已对接的数据
 * Summary: 查询验收已对接的数据
 */
func (client *Client) QueryDockedData(request *QueryDockedDataRequest) (_result *QueryDockedDataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDockedDataResponse{}
	_body, _err := client.QueryDockedDataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据接口名和关键key（deviceId等）, 查询验收已对接的数据
 * Summary: 查询验收已对接的数据
 */
func (client *Client) QueryDockedDataEx(request *QueryDockedDataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDockedDataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDockedDataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.docked.data.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建实体关联关系
 * Summary: 创建实体关联关系
 */
func (client *Client) CreateDeviceRelation(request *CreateDeviceRelationRequest) (_result *CreateDeviceRelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDeviceRelationResponse{}
	_body, _err := client.CreateDeviceRelationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建实体关联关系
 * Summary: 创建实体关联关系
 */
func (client *Client) CreateDeviceRelationEx(request *CreateDeviceRelationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDeviceRelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDeviceRelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.device.relation.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除实体关联关系
 * Summary: 删除实体关联关系
 */
func (client *Client) DeleteDeviceRelation(request *DeleteDeviceRelationRequest) (_result *DeleteDeviceRelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteDeviceRelationResponse{}
	_body, _err := client.DeleteDeviceRelationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除实体关联关系
 * Summary: 删除实体关联关系
 */
func (client *Client) DeleteDeviceRelationEx(request *DeleteDeviceRelationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteDeviceRelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteDeviceRelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.device.relation.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 推送单个设备所产生的设备数据
 * Summary: 推送设备数据
 */
func (client *Client) PushCollectotBychainid(request *PushCollectotBychainidRequest) (_result *PushCollectotBychainidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushCollectotBychainidResponse{}
	_body, _err := client.PushCollectotBychainidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 推送单个设备所产生的设备数据
 * Summary: 推送设备数据
 */
func (client *Client) PushCollectotBychainidEx(request *PushCollectotBychainidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushCollectotBychainidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushCollectotBychainidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.collectot.bychainid.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 推送设备状态变更信息
 * Summary: 推送设备状态变更信息
 */
func (client *Client) NotifyPullstrategyChangestatus(request *NotifyPullstrategyChangestatusRequest) (_result *NotifyPullstrategyChangestatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &NotifyPullstrategyChangestatusResponse{}
	_body, _err := client.NotifyPullstrategyChangestatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 推送设备状态变更信息
 * Summary: 推送设备状态变更信息
 */
func (client *Client) NotifyPullstrategyChangestatusEx(request *NotifyPullstrategyChangestatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *NotifyPullstrategyChangestatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &NotifyPullstrategyChangestatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.pullstrategy.changestatus.notify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 推送订单信息
 * Summary: 推送订单信息
 */
func (client *Client) NotifyPullstrategyChargeorderinfo(request *NotifyPullstrategyChargeorderinfoRequest) (_result *NotifyPullstrategyChargeorderinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &NotifyPullstrategyChargeorderinfoResponse{}
	_body, _err := client.NotifyPullstrategyChargeorderinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 推送订单信息
 * Summary: 推送订单信息
 */
func (client *Client) NotifyPullstrategyChargeorderinfoEx(request *NotifyPullstrategyChargeorderinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *NotifyPullstrategyChargeorderinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &NotifyPullstrategyChargeorderinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.pullstrategy.chargeorderinfo.notify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 菜鸟设备监控信息获取
 * Summary: 菜鸟设备监控信息获取
 */
func (client *Client) QueryScfleaseEqpinfo(request *QueryScfleaseEqpinfoRequest) (_result *QueryScfleaseEqpinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryScfleaseEqpinfoResponse{}
	_body, _err := client.QueryScfleaseEqpinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 菜鸟设备监控信息获取
 * Summary: 菜鸟设备监控信息获取
 */
func (client *Client) QueryScfleaseEqpinfoEx(request *QueryScfleaseEqpinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryScfleaseEqpinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryScfleaseEqpinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.scflease.eqpinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建自定义的实体数据
 * Summary: 创建自定义实体
 */
func (client *Client) CreateCustomerEntity(request *CreateCustomerEntityRequest) (_result *CreateCustomerEntityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateCustomerEntityResponse{}
	_body, _err := client.CreateCustomerEntityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建自定义的实体数据
 * Summary: 创建自定义实体
 */
func (client *Client) CreateCustomerEntityEx(request *CreateCustomerEntityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateCustomerEntityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateCustomerEntityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.customer.entity.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新自定义实体，通过场景码+实体ID来更新 实体内容或实体名称
 * Summary: 更新自定义实体
 */
func (client *Client) UpdateCustomerEntity(request *UpdateCustomerEntityRequest) (_result *UpdateCustomerEntityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateCustomerEntityResponse{}
	_body, _err := client.UpdateCustomerEntityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新自定义实体，通过场景码+实体ID来更新 实体内容或实体名称
 * Summary: 更新自定义实体
 */
func (client *Client) UpdateCustomerEntityEx(request *UpdateCustomerEntityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateCustomerEntityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateCustomerEntityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.customer.entity.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 为租户创建物模型
 * Summary: 为租户创建物模型
 */
func (client *Client) CreateThingmodel(request *CreateThingmodelRequest) (_result *CreateThingmodelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateThingmodelResponse{}
	_body, _err := client.CreateThingmodelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 为租户创建物模型
 * Summary: 为租户创建物模型
 */
func (client *Client) CreateThingmodelEx(request *CreateThingmodelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateThingmodelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateThingmodelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.thingmodel.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询租户的物模型
 * Summary: 查询租户的物模型
 */
func (client *Client) QueryThingmodel(request *QueryThingmodelRequest) (_result *QueryThingmodelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryThingmodelResponse{}
	_body, _err := client.QueryThingmodelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询租户的物模型
 * Summary: 查询租户的物模型
 */
func (client *Client) QueryThingmodelEx(request *QueryThingmodelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryThingmodelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryThingmodelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.thingmodel.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信物链oneapi
 * Summary: 信物链oneapi
 */
func (client *Client) ExecThingsdidOneapi(request *ExecThingsdidOneapiRequest) (_result *ExecThingsdidOneapiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecThingsdidOneapiResponse{}
	_body, _err := client.ExecThingsdidOneapiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信物链oneapi
 * Summary: 信物链oneapi
 */
func (client *Client) ExecThingsdidOneapiEx(request *ExecThingsdidOneapiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecThingsdidOneapiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecThingsdidOneapiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.thingsdid.oneapi.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信物链存证
 * Summary: 信物链存证
 */
func (client *Client) StartEvidenceStore(request *StartEvidenceStoreRequest) (_result *StartEvidenceStoreResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartEvidenceStoreResponse{}
	_body, _err := client.StartEvidenceStoreEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信物链存证
 * Summary: 信物链存证
 */
func (client *Client) StartEvidenceStoreEx(request *StartEvidenceStoreRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartEvidenceStoreResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartEvidenceStoreResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.evidence.store.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信物链存证查询
 * Summary: 信物链存证查询
 */
func (client *Client) StartEvidenceQuery(request *StartEvidenceQueryRequest) (_result *StartEvidenceQueryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartEvidenceQueryResponse{}
	_body, _err := client.StartEvidenceQueryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信物链存证查询
 * Summary: 信物链存证查询
 */
func (client *Client) StartEvidenceQueryEx(request *StartEvidenceQueryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartEvidenceQueryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartEvidenceQueryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.evidence.query.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信物链实体身份注册
 * Summary: 信物链实体身份注册
 */
func (client *Client) StartThingsdidRegister(request *StartThingsdidRegisterRequest) (_result *StartThingsdidRegisterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartThingsdidRegisterResponse{}
	_body, _err := client.StartThingsdidRegisterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信物链实体身份注册
 * Summary: 信物链实体身份注册
 */
func (client *Client) StartThingsdidRegisterEx(request *StartThingsdidRegisterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartThingsdidRegisterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartThingsdidRegisterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.thingsdid.register.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信物链异步操作查询
智能合约操作由于比较耗时，因此内部实现通过异步实现，调用完exectuted返回是false的API后，需要调用此api来轮询原先操作是否完成。
 * Summary: 信物链异步操作查询
*/
func (client *Client) QueryThingsdidAsyncprocess(request *QueryThingsdidAsyncprocessRequest) (_result *QueryThingsdidAsyncprocessResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryThingsdidAsyncprocessResponse{}
	_body, _err := client.QueryThingsdidAsyncprocessEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信物链异步操作查询
智能合约操作由于比较耗时，因此内部实现通过异步实现，调用完exectuted返回是false的API后，需要调用此api来轮询原先操作是否完成。
 * Summary: 信物链异步操作查询
*/
func (client *Client) QueryThingsdidAsyncprocessEx(request *QueryThingsdidAsyncprocessRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryThingsdidAsyncprocessResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryThingsdidAsyncprocessResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.thingsdid.asyncprocess.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信物链身份状态更新，此API目前仅支持设备状态更新
 * Summary: 信物链身份状态更新
 */
func (client *Client) UpdateThingsdidStatus(request *UpdateThingsdidStatusRequest) (_result *UpdateThingsdidStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateThingsdidStatusResponse{}
	_body, _err := client.UpdateThingsdidStatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信物链身份状态更新，此API目前仅支持设备状态更新
 * Summary: 信物链身份状态更新
 */
func (client *Client) UpdateThingsdidStatusEx(request *UpdateThingsdidStatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateThingsdidStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateThingsdidStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.thingsdid.status.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信物链设备空间关联更新，完成设备和空间关联绑定
 * Summary: 信物链设备空间关联更新
 */
func (client *Client) UpdateThingsdidDevicespace(request *UpdateThingsdidDevicespaceRequest) (_result *UpdateThingsdidDevicespaceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateThingsdidDevicespaceResponse{}
	_body, _err := client.UpdateThingsdidDevicespaceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信物链设备空间关联更新，完成设备和空间关联绑定
 * Summary: 信物链设备空间关联更新
 */
func (client *Client) UpdateThingsdidDevicespaceEx(request *UpdateThingsdidDevicespaceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateThingsdidDevicespaceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateThingsdidDevicespaceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.thingsdid.devicespace.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信物链实体did查询，根据dataFilter过滤输出
 * Summary: 信物链实体did查询
 */
func (client *Client) QueryThingsdidDid(request *QueryThingsdidDidRequest) (_result *QueryThingsdidDidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryThingsdidDidResponse{}
	_body, _err := client.QueryThingsdidDidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信物链实体did查询，根据dataFilter过滤输出
 * Summary: 信物链实体did查询
 */
func (client *Client) QueryThingsdidDidEx(request *QueryThingsdidDidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryThingsdidDidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryThingsdidDidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.thingsdid.did.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信物链实体身份更新，字段空则不更新。
 * Summary: 信物链实体身份更新
 */
func (client *Client) UpdateThingsdidDid(request *UpdateThingsdidDidRequest) (_result *UpdateThingsdidDidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateThingsdidDidResponse{}
	_body, _err := client.UpdateThingsdidDidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信物链实体身份更新，字段空则不更新。
 * Summary: 信物链实体身份更新
 */
func (client *Client) UpdateThingsdidDidEx(request *UpdateThingsdidDidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateThingsdidDidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateThingsdidDidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.thingsdid.did.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信物链租户信息关联
 * Summary: 信物链租户信息关联
 */
func (client *Client) StartTenantBindinfo(request *StartTenantBindinfoRequest) (_result *StartTenantBindinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartTenantBindinfoResponse{}
	_body, _err := client.StartTenantBindinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信物链租户信息关联
 * Summary: 信物链租户信息关联
 */
func (client *Client) StartTenantBindinfoEx(request *StartTenantBindinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartTenantBindinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartTenantBindinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.tenant.bindinfo.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信物链租户项目创建，项目可以用来管理同一租户不同业务的存证
 * Summary: 信物链租户项目创建
 */
func (client *Client) CreateTenantProject(request *CreateTenantProjectRequest) (_result *CreateTenantProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateTenantProjectResponse{}
	_body, _err := client.CreateTenantProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信物链租户项目创建，项目可以用来管理同一租户不同业务的存证
 * Summary: 信物链租户项目创建
 */
func (client *Client) CreateTenantProjectEx(request *CreateTenantProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateTenantProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTenantProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.tenant.project.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信物链实体访问权限更新
所有者/使用者/观察者权限更新
 * Summary: 信物链实体访问权限更新
*/
func (client *Client) UpdateThingsdidTenant(request *UpdateThingsdidTenantRequest) (_result *UpdateThingsdidTenantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateThingsdidTenantResponse{}
	_body, _err := client.UpdateThingsdidTenantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信物链实体访问权限更新
所有者/使用者/观察者权限更新
 * Summary: 信物链实体访问权限更新
*/
func (client *Client) UpdateThingsdidTenantEx(request *UpdateThingsdidTenantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateThingsdidTenantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateThingsdidTenantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.thingsdid.tenant.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: LoadCertificateTSMCmd，仅限内部使用api
 * Summary: TSM迁移内部使用
 */
func (client *Client) LoadTsmCertificatetsm(request *LoadTsmCertificatetsmRequest) (_result *LoadTsmCertificatetsmResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &LoadTsmCertificatetsmResponse{}
	_body, _err := client.LoadTsmCertificatetsmEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: LoadCertificateTSMCmd，仅限内部使用api
 * Summary: TSM迁移内部使用
 */
func (client *Client) LoadTsmCertificatetsmEx(request *LoadTsmCertificatetsmRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *LoadTsmCertificatetsmResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &LoadTsmCertificatetsmResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.tsm.certificatetsm.load"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: TSM迁移内部使用
 * Summary: loadResourceFile
 */
func (client *Client) LoadTsmResourcefile(request *LoadTsmResourcefileRequest) (_result *LoadTsmResourcefileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &LoadTsmResourcefileResponse{}
	_body, _err := client.LoadTsmResourcefileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: TSM迁移内部使用
 * Summary: loadResourceFile
 */
func (client *Client) LoadTsmResourcefileEx(request *LoadTsmResourcefileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *LoadTsmResourcefileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &LoadTsmResourcefileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.tsm.resourcefile.load"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 触发tlsnotary文件认证任务
 * Summary: 触发tlsnotary文件认证任务
 */
func (client *Client) StartTlsnotaryTask(request *StartTlsnotaryTaskRequest) (_result *StartTlsnotaryTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartTlsnotaryTaskResponse{}
	_body, _err := client.StartTlsnotaryTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 触发tlsnotary文件认证任务
 * Summary: 触发tlsnotary文件认证任务
 */
func (client *Client) StartTlsnotaryTaskEx(request *StartTlsnotaryTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartTlsnotaryTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartTlsnotaryTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.tlsnotary.task.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询tlsnotary文件认证任务结果
 * Summary: 查询tlsnotary文件认证任务结果
 */
func (client *Client) QueryTlsnotaryTask(request *QueryTlsnotaryTaskRequest) (_result *QueryTlsnotaryTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTlsnotaryTaskResponse{}
	_body, _err := client.QueryTlsnotaryTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询tlsnotary文件认证任务结果
 * Summary: 查询tlsnotary文件认证任务结果
 */
func (client *Client) QueryTlsnotaryTaskEx(request *QueryTlsnotaryTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTlsnotaryTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTlsnotaryTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.tlsnotary.task.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
