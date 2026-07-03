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

// 资源定位信息
type BaiResourceLocation struct {
	// 资源定位类型
	// HTTP_URL：资源url
	// STRING_BASE64：资源base64字符串（不带base64头部）
	// example:
	//
	// HTTP_URL, STRING_BASE64
	LocationType *string `json:"location_type,omitempty" xml:"location_type,omitempty" require:"true"`
	// 资源定位值
	// example:
	//
	// abc
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
	// example:
	//
	// ADD_DEVICE
	PermissionCode *string `json:"permission_code,omitempty" xml:"permission_code,omitempty" require:"true"`
	// 权限名称
	// example:
	//
	// 注册设备
	PermissionName *string `json:"permission_name,omitempty" xml:"permission_name,omitempty" require:"true"`
	// 权限内容
	// example:
	//
	// 权限内容
	PermissionData *string `json:"permission_data,omitempty" xml:"permission_data,omitempty" require:"true"`
	// 权限类型
	// example:
	//
	// 权限类型
	PermissionType *string `json:"permission_type,omitempty" xml:"permission_type,omitempty" require:"true"`
	// 权限模块
	// example:
	//
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
	// example:
	//
	// 1
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 创建时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 设备SDK公钥
	// example:
	//
	// MEUCIDxNwV7tXGlZ9VW19p...
	VerifyKey *string `json:"verify_key,omitempty" xml:"verify_key,omitempty" require:"true"`
	// SDK版本号
	// example:
	//
	// mqV1.0
	SdkVersionStr *string `json:"sdk_version_str,omitempty" xml:"sdk_version_str,omitempty"`
	// sdk模型
	// example:
	//
	// {"version":"1.0.0"}
	MetaModel *string `json:"meta_model,omitempty" xml:"meta_model,omitempty"`
	// 平台
	// example:
	//
	// windows
	Platform *string `json:"platform,omitempty" xml:"platform,omitempty"`
	// 公司名称
	// example:
	//
	// alipay
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
	// example:
	//
	// 23123131
	GoodsSkuId *int64 `json:"goods_sku_id,omitempty" xml:"goods_sku_id,omitempty" require:"true"`
	// 商品采购数量
	// example:
	//
	// 100
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
	// example:
	//
	// 1
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 创建时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 更新时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 设备端ProductKey
	// example:
	//
	// DEV-0101
	ProductKey *string `json:"product_key,omitempty" xml:"product_key,omitempty" require:"true"`
	// 场景码
	// example:
	//
	// testScene
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 租户Id
	// example:
	//
	// testTenant
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty" require:"true"`
	// 数据模型id
	// example:
	//
	// model_001
	DataModelId *string `json:"data_model_id,omitempty" xml:"data_model_id,omitempty" require:"true"`
	// sdk前缀
	// example:
	//
	// sdk_
	SdkVersionPrefix *string `json:"sdk_version_prefix,omitempty" xml:"sdk_version_prefix,omitempty" require:"true"`
	// 制造商
	// example:
	//
	// alibaba
	Manufacturer *string `json:"manufacturer,omitempty" xml:"manufacturer,omitempty"`
	// 顾客
	// example:
	//
	// alipay
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
	// example:
	//
	// 1
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 创建时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 场景名
	// example:
	//
	// testScene
	SceneName *string `json:"scene_name,omitempty" xml:"scene_name,omitempty" require:"true"`
	// 是否托管
	// example:
	//
	// ESCROWED
	Escrowed *string `json:"escrowed,omitempty" xml:"escrowed,omitempty"`
	// 私钥密码
	// example:
	//
	// MEUCI..
	PrivateKeyPassword *string `json:"private_key_password,omitempty" xml:"private_key_password,omitempty"`
	// 租户
	// example:
	//
	// testTenant
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty"`
	// 场景类型
	// example:
	//
	// 共享单车
	SceneType *string `json:"scene_type,omitempty" xml:"scene_type,omitempty"`
	// 是否跳过中台数据校验处理
	// example:
	//
	// true, false
	SkipPegasus *bool `json:"skip_pegasus,omitempty" xml:"skip_pegasus,omitempty"`
	// 定制数据处理类 , 使用用逗号分隔
	// example:
	//
	// XXX_GPS_PROCESSOR
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
	// example:
	//
	// 1
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 创建时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// Alipay-0101
	// example:
	//
	// 场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 设备ID
	// example:
	//
	// device_id_001
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty"`
	// 发行设备ID
	// example:
	//
	// 00202009111700539276
	DisDeviceId *string `json:"dis_device_id,omitempty" xml:"dis_device_id,omitempty"`
	// 类型：0:数据上报;1:数据完整性校验
	// example:
	//
	// 0
	Type *int64 `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// c89b65a2e3afd604977c0....
	// example:
	//
	// 公钥
	PublicKey *string `json:"public_key,omitempty" xml:"public_key,omitempty"`
	// 验签类型：0(RAW_DATA)；1(公钥格式为PEM)；2(公钥格式为DER)
	// example:
	//
	// 0
	FormatType *int64 `json:"format_type,omitempty" xml:"format_type,omitempty"`
	// 验证内容hash
	// example:
	//
	// aa5304221185b370ea84d...
	ContentId *string `json:"content_id,omitempty" xml:"content_id,omitempty"`
	// 验证内容
	// example:
	//
	// {"content":"demo",...}
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 签名
	// example:
	//
	// 9b47e12b0ddb8df...
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty"`
	// 错误信息
	// example:
	//
	// 数据验真失败
	FailMessage *string `json:"fail_message,omitempty" xml:"fail_message,omitempty"`
	// 补充数据
	// example:
	//
	// {“DEVICE-ID”:"DEMO-001"}
	ExtraData *string `json:"extra_data,omitempty" xml:"extra_data,omitempty"`
	// 数据来源：0(普通数据上报)；1(MAAS数据上报)；2(设备业务数据上报);3(标签流转)
	// example:
	//
	// 0
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

// iotx时间
type TripDuration struct {
	// 时间
	// example:
	//
	// "1.2"
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
	// 时间单位
	// example:
	//
	// "h"
	Unit *string `json:"unit,omitempty" xml:"unit,omitempty" require:"true"`
}

func (s TripDuration) String() string {
	return tea.Prettify(s)
}

func (s TripDuration) GoString() string {
	return s.String()
}

func (s *TripDuration) SetValue(v string) *TripDuration {
	s.Value = &v
	return s
}

func (s *TripDuration) SetUnit(v string) *TripDuration {
	s.Unit = &v
	return s
}

// 字典对象
type DictionaryInfoBO struct {
	// 字典key
	// example:
	//
	// key1
	Label *string `json:"label,omitempty" xml:"label,omitempty" require:"true"`
	// 字典value
	// example:
	//
	// a
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s DictionaryInfoBO) String() string {
	return tea.Prettify(s)
}

func (s DictionaryInfoBO) GoString() string {
	return s.String()
}

func (s *DictionaryInfoBO) SetLabel(v string) *DictionaryInfoBO {
	s.Label = &v
	return s
}

func (s *DictionaryInfoBO) SetValue(v string) *DictionaryInfoBO {
	s.Value = &v
	return s
}

// 租户信息
type PermissionedTenantModel struct {
	// 主键Id
	// example:
	//
	// 1
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 创建时间
	// example:
	//
	// 2018-10-10 10:10:00
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	// example:
	//
	// 2018-10-10 10:10:00
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 租户名称
	// example:
	//
	// testTenant
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty" require:"true"`
	// 公司名称
	// example:
	//
	// alipay
	OrgName *string `json:"org_name,omitempty" xml:"org_name,omitempty" require:"true"`
	// 租户所有人标识
	// example:
	//
	// alipay
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty"`
	// 网关私钥
	// example:
	//
	// MEUCIDxNw...
	GatewayPrivateKey *string `json:"gateway_private_key,omitempty" xml:"gateway_private_key,omitempty"`
	// 网关公钥
	// example:
	//
	// MEUCID...
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

// 查询业务数据交易结果对象数据
type QueryChainDataTransactionResultData struct {
	// 所属业务
	// example:
	//
	// SMART_CAR_KEY
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
	// 数据资产类型
	// example:
	//
	// 123
	DataScene *string `json:"data_scene,omitempty" xml:"data_scene,omitempty" require:"true"`
	// 资产ID
	// example:
	//
	// 123
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 租户id
	// example:
	//
	// ASDFGHJK
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 业务数据hash
	// example:
	//
	// 123
	TextHash *string `json:"text_hash,omitempty" xml:"text_hash,omitempty" require:"true"`
	// 时间
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
}

func (s QueryChainDataTransactionResultData) String() string {
	return tea.Prettify(s)
}

func (s QueryChainDataTransactionResultData) GoString() string {
	return s.String()
}

func (s *QueryChainDataTransactionResultData) SetBizScene(v string) *QueryChainDataTransactionResultData {
	s.BizScene = &v
	return s
}

func (s *QueryChainDataTransactionResultData) SetDataScene(v string) *QueryChainDataTransactionResultData {
	s.DataScene = &v
	return s
}

func (s *QueryChainDataTransactionResultData) SetAssetId(v string) *QueryChainDataTransactionResultData {
	s.AssetId = &v
	return s
}

func (s *QueryChainDataTransactionResultData) SetTenantId(v string) *QueryChainDataTransactionResultData {
	s.TenantId = &v
	return s
}

func (s *QueryChainDataTransactionResultData) SetTextHash(v string) *QueryChainDataTransactionResultData {
	s.TextHash = &v
	return s
}

func (s *QueryChainDataTransactionResultData) SetTimestamp(v int64) *QueryChainDataTransactionResultData {
	s.Timestamp = &v
	return s
}

// 商品单点鉴定结果
type BaiGoodsPointIdentificationResult struct {
	// 鉴定点大项名称
	// example:
	//
	// 内包装
	PointName *string `json:"point_name,omitempty" xml:"point_name,omitempty" require:"true"`
	// 鉴定点子项名称
	// example:
	//
	// 顶部
	SubPointName *string `json:"sub_point_name,omitempty" xml:"sub_point_name,omitempty" require:"true"`
	// 单点鉴定结果
	// REAL：鉴定为真
	// FAKE：鉴定为假
	// UNABLE_IDENTIFY：无法鉴定
	// example:
	//
	// REAL
	Result *string `json:"result,omitempty" xml:"result,omitempty" require:"true"`
	// 鉴定分数
	// example:
	//
	// 0.92
	Grade *string `json:"grade,omitempty" xml:"grade,omitempty"`
	// 用户侧的鉴定点point_id，直接将用户传入的user_point_id返回
	// example:
	//
	// 100
	UserPointId *string `json:"user_point_id,omitempty" xml:"user_point_id,omitempty"`
	// 鉴定评价
	// example:
	//
	// 完全同一，趋于同一，不同一
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
	// example:
	//
	// 子鉴定项
	SubPointName *string `json:"sub_point_name,omitempty" xml:"sub_point_name,omitempty" require:"true"`
	// 商品数字指纹鉴定子项鉴定结果
	// example:
	//
	// REAL
	Result *string `json:"result,omitempty" xml:"result,omitempty" require:"true"`
	// 鉴定子项鉴定得分
	// example:
	//
	// 0.92
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

// 二轮车操作日志
type EBikeOperationLog struct {
	// 日志时间
	// example:
	//
	// 2018-10-10 10:10
	Time *string `json:"time,omitempty" xml:"time,omitempty" require:"true"`
	// 租户
	// example:
	//
	// XXXXX
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true"`
	// 小程序应用Id
	// example:
	//
	// 7006071575519
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 用户id
	// example:
	//
	// 700607
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 设备id
	// example:
	//
	// DEVICE700607157
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty"`
	// 操作时间
	// example:
	//
	// 2018-10-10 10:10:00
	OperateTime *string `json:"operate_time,omitempty" xml:"operate_time,omitempty" require:"true"`
	// 操作描述
	// example:
	//
	// 开锁成功
	OperateDesc *string `json:"operate_desc,omitempty" xml:"operate_desc,omitempty" require:"true"`
	// 操作是否成功
	// example:
	//
	// true, false
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 日志等级(info、warn、error)
	// example:
	//
	// info
	Level *string `json:"level,omitempty" xml:"level,omitempty"`
}

func (s EBikeOperationLog) String() string {
	return tea.Prettify(s)
}

func (s EBikeOperationLog) GoString() string {
	return s.String()
}

func (s *EBikeOperationLog) SetTime(v string) *EBikeOperationLog {
	s.Time = &v
	return s
}

func (s *EBikeOperationLog) SetTenant(v string) *EBikeOperationLog {
	s.Tenant = &v
	return s
}

func (s *EBikeOperationLog) SetAppId(v string) *EBikeOperationLog {
	s.AppId = &v
	return s
}

func (s *EBikeOperationLog) SetUserId(v string) *EBikeOperationLog {
	s.UserId = &v
	return s
}

func (s *EBikeOperationLog) SetDeviceId(v string) *EBikeOperationLog {
	s.DeviceId = &v
	return s
}

func (s *EBikeOperationLog) SetOperateTime(v string) *EBikeOperationLog {
	s.OperateTime = &v
	return s
}

func (s *EBikeOperationLog) SetOperateDesc(v string) *EBikeOperationLog {
	s.OperateDesc = &v
	return s
}

func (s *EBikeOperationLog) SetSuccess(v bool) *EBikeOperationLog {
	s.Success = &v
	return s
}

func (s *EBikeOperationLog) SetLevel(v string) *EBikeOperationLog {
	s.Level = &v
	return s
}

// 商品数字指纹鉴定点
type GoodsDigitalFingerprintPoint struct {
	// 鉴定点子项
	// example:
	//
	// 正面
	SubPointName *string `json:"sub_point_name,omitempty" xml:"sub_point_name,omitempty" require:"true"`
	// 微观图片url
	// example:
	//
	// http://1001
	MicroImageUrl *string `json:"micro_image_url,omitempty" xml:"micro_image_url,omitempty" require:"true"`
	// 宏观图片url
	// example:
	//
	// http://xxxx1002
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
	// example:
	//
	// 1
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 创建时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 更新时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 租户
	// example:
	//
	// alipay
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty" require:"true"`
	// 场景码
	//
	// example:
	//
	// alipay-0101
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty"`
	// 策略类型：DEBUG（技术联调）；MONITOR（生产监控）
	// example:
	//
	// MONITOR
	StrategyType *string `json:"strategy_type,omitempty" xml:"strategy_type,omitempty" require:"true"`
	// 策略详情，json格式
	// example:
	//
	// [{  "alert_method": "DING_TALK",   "addresses": "",  "alert_strategy": "",   "params": {     "fail_days" : 10   } }, {  "alert_method": "EMAIL",   "addresses": "",  "alert_strategy": "",  "params": {       } }]
	StrategyDetail *string `json:"strategy_detail,omitempty" xml:"strategy_detail,omitempty" require:"true"`
	// 是否启用，默认false
	// example:
	//
	// true, false
	Enabled *bool `json:"enabled,omitempty" xml:"enabled,omitempty" require:"true"`
	// 备注
	// example:
	//
	// 这是一条测试数据
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
	// example:
	//
	// 内包装
	PointName *string `json:"point_name,omitempty" xml:"point_name,omitempty" require:"true"`
	// 鉴定点子项
	// example:
	//
	// 正面
	SubPointName *string `json:"sub_point_name,omitempty" xml:"sub_point_name,omitempty" require:"true"`
	// 鉴定点图片的url
	// example:
	//
	// https://xxxxxx/a.png
	ImageUrl *string `json:"image_url,omitempty" xml:"image_url,omitempty"`
	// 图片内容base64编码的字符串，该字段与image_url至少一个非空，同时传入以image_url为准
	// example:
	//
	// /9j/4QyXRXhpZgAATU0AKgAAAAgABwESAAMAAAABAAEAAAEa......
	ImageBase64 *string `json:"image_base64,omitempty" xml:"image_base64,omitempty"`
	// 用户侧鉴定单关联id
	// example:
	//
	// 100
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
	// example:
	//
	// 12321321
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty" require:"true"`
	// 设备唯一编号
	// example:
	//
	// 12321321
	DeviceSn *string `json:"device_sn,omitempty" xml:"device_sn,omitempty" require:"true"`
	// 设备金额，精确到小数后两位
	// example:
	//
	// 234.01
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
	// example:
	//
	// 1122
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty"`
	// 数据内容
	// example:
	//
	// {"a","11"}
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 设备id
	// example:
	//
	// 433
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty"`
	// 上链哈希
	// example:
	//
	// 5533
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 上链时间
	TxTime *int64 `json:"tx_time,omitempty" xml:"tx_time,omitempty" require:"true"`
	// 链上外围设备ID
	// example:
	//
	// 123123
	ChainPeripheralId *string `json:"chain_peripheral_id,omitempty" xml:"chain_peripheral_id,omitempty"`
	// 外围设备ID
	// example:
	//
	// 123123
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
	// example:
	//
	// 角色编码
	RoleCode *string `json:"role_code,omitempty" xml:"role_code,omitempty" require:"true"`
	// 角色名称
	// example:
	//
	// 角色名称
	RoleName *string `json:"role_name,omitempty" xml:"role_name,omitempty" require:"true"`
	// 权限列表
	// example:
	//
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
	// example:
	//
	// REAL
	IdentificationResult *string `json:"identification_result,omitempty" xml:"identification_result,omitempty" require:"true"`
	// 鉴定结果描述
	// example:
	//
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 商品数字指纹鉴定点鉴定结果列表
	// example:
	//
	// {"sub_point_name":"正面","result":"REAL","grade":"0.92"}
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

// 部标设备数据
type JtData struct {
	// 数据的可信平台唯一ID
	// example:
	//
	// 123
	TrustiotId *int64 `json:"trustiot_id,omitempty" xml:"trustiot_id,omitempty" require:"true"`
	// IoT可信平台设备唯一ID
	// example:
	//
	// 123
	TrustiotEntityId *int64 `json:"trustiot_entity_id,omitempty" xml:"trustiot_entity_id,omitempty" require:"true"`
	// 上报原文解析处理之后的数据
	// example:
	//
	// processed_content
	ProcessedContent *string `json:"processed_content,omitempty" xml:"processed_content,omitempty" require:"true"`
	// 和上一次上报数据里程对比，新增的里程数
	// example:
	//
	// 123
	DeltaMileage *int64 `json:"delta_mileage,omitempty" xml:"delta_mileage,omitempty"`
	// 正常位置信息：LOCATION
	// 告警信息：ALARM_BASIC、 ALARM_ADAS、 ALARM_DSM、 ALARM_ACCELEROMETER
	// example:
	//
	// 数据标识
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 告警子类型
	// //ADAS
	// 10001: 前向碰撞报警
	// 10002: 车辆偏离报警
	// 10003: 车距过近报警
	// 10004: 行人碰撞报警
	// 10005: 频繁变道报警
	// 10006: 道路标识超限报警
	// 10007: 障碍物报警 //10008~10015 保留
	// 10016: 道路标志识别事件
	// 10017: 主动抓拍事件 //10018~10031 保留
	// //DSM
	// 10101: 疲劳驾驶报警
	// 10102: 接打电话报警
	// 10103: 抽烟报警报警
	// 10104: 分神驾驶报警
	// 10105: 驾驶员异常报警 //10106~10115 保留
	// 10116: 自动抓拍事件
	// 10117: 驾驶员变更事件 //10118~10031 保留
	// //加速度
	// 11701: 急加速
	// 11702: 急减速
	// 11703: 急转弯
	// example:
	//
	// 10001
	AlarmSubType *int64 `json:"alarm_sub_type,omitempty" xml:"alarm_sub_type,omitempty"`
	// 关联设备唯一ID
	// example:
	//
	// 123
	RelatedTrustEntityId *string `json:"related_trust_entity_id,omitempty" xml:"related_trust_entity_id,omitempty"`
	// 日报日期
	// example:
	//
	// 2023-12-01
	ReportDate *string `json:"report_date,omitempty" xml:"report_date,omitempty"`
}

func (s JtData) String() string {
	return tea.Prettify(s)
}

func (s JtData) GoString() string {
	return s.String()
}

func (s *JtData) SetTrustiotId(v int64) *JtData {
	s.TrustiotId = &v
	return s
}

func (s *JtData) SetTrustiotEntityId(v int64) *JtData {
	s.TrustiotEntityId = &v
	return s
}

func (s *JtData) SetProcessedContent(v string) *JtData {
	s.ProcessedContent = &v
	return s
}

func (s *JtData) SetDeltaMileage(v int64) *JtData {
	s.DeltaMileage = &v
	return s
}

func (s *JtData) SetBizType(v string) *JtData {
	s.BizType = &v
	return s
}

func (s *JtData) SetAlarmSubType(v int64) *JtData {
	s.AlarmSubType = &v
	return s
}

func (s *JtData) SetRelatedTrustEntityId(v string) *JtData {
	s.RelatedTrustEntityId = &v
	return s
}

func (s *JtData) SetReportDate(v string) *JtData {
	s.ReportDate = &v
	return s
}

// 租赁合同信息
type RentContractInfo struct {
	// 租赁合同ID
	// example:
	//
	// 2c952456827828cdedad06afccef75a9f2c2840cbb6b0b659f653da1e5916cb2
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty" require:"true"`
	// 租约时间
	// example:
	//
	// 6个月 或 1年
	LeaseTime *string `json:"lease_time,omitempty" xml:"lease_time,omitempty" require:"true"`
	// 入住时间
	// example:
	//
	// 2006-01-02 15:04:05
	CheckinDate *string `json:"checkin_date,omitempty" xml:"checkin_date,omitempty" require:"true"`
	// 退租时间
	// example:
	//
	// 2018-10-10T10:10:00Z
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

// 通过设备ID注册发行时的设备参数
type RegByDeviceIdParm struct {
	// 一般是业务上唯一的设备ID/资产编码
	// example:
	//
	// 1122
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 数据模型ID
	// example:
	//
	// 7033986596836630528
	DeviceDataModelId *string `json:"device_data_model_id,omitempty" xml:"device_data_model_id,omitempty"`
	// 固定填写RAW_DATA
	// example:
	//
	// RAW_DATA
	DeviceFeature *string `json:"device_feature,omitempty" xml:"device_feature,omitempty"`
	// true : 设备ID已存在时返回存在的设备关联字段;
	// false : 设备ID已存在时直接抛出异常；
	// example:
	//
	// true, false
	WithExistDeviceId *bool `json:"with_exist_device_id,omitempty" xml:"with_exist_device_id,omitempty"`
	// 设备类型编码，联系蚂蚁侧获取设备类型编码
	DeviceTypeCode *int64 `json:"device_type_code,omitempty" xml:"device_type_code,omitempty" require:"true"`
	// 设备单价 单位：分
	// example:
	//
	// 1000
	InitialPrice *int64 `json:"initial_price,omitempty" xml:"initial_price,omitempty"`
	// 出厂时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	FactoryTime *string `json:"factory_time,omitempty" xml:"factory_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 投放时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	ReleaseTime *string `json:"release_time,omitempty" xml:"release_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 额外信息，联系蚂蚁侧获取参数格式
	// example:
	//
	// {...}
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 资产所有人标识（统一社会信用代码）
	// example:
	//
	// 91310101MA1FPCXA3G
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty"`
	// 资产所有人名称
	// example:
	//
	// 蚂蚁区块链科技（上海）有限公司
	OwnerName *string `json:"owner_name,omitempty" xml:"owner_name,omitempty"`
	// 设备IMEI
	// example:
	//
	// 861037055012207
	DeviceImei *string `json:"device_imei,omitempty" xml:"device_imei,omitempty"`
	// 设备名称/设备型号
	// example:
	//
	// 64.0V30AH
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty"`
	// 生产厂商名
	// example:
	//
	// 浙江一厂
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty"`
}

func (s RegByDeviceIdParm) String() string {
	return tea.Prettify(s)
}

func (s RegByDeviceIdParm) GoString() string {
	return s.String()
}

func (s *RegByDeviceIdParm) SetDeviceId(v string) *RegByDeviceIdParm {
	s.DeviceId = &v
	return s
}

func (s *RegByDeviceIdParm) SetDeviceDataModelId(v string) *RegByDeviceIdParm {
	s.DeviceDataModelId = &v
	return s
}

func (s *RegByDeviceIdParm) SetDeviceFeature(v string) *RegByDeviceIdParm {
	s.DeviceFeature = &v
	return s
}

func (s *RegByDeviceIdParm) SetWithExistDeviceId(v bool) *RegByDeviceIdParm {
	s.WithExistDeviceId = &v
	return s
}

func (s *RegByDeviceIdParm) SetDeviceTypeCode(v int64) *RegByDeviceIdParm {
	s.DeviceTypeCode = &v
	return s
}

func (s *RegByDeviceIdParm) SetInitialPrice(v int64) *RegByDeviceIdParm {
	s.InitialPrice = &v
	return s
}

func (s *RegByDeviceIdParm) SetFactoryTime(v string) *RegByDeviceIdParm {
	s.FactoryTime = &v
	return s
}

func (s *RegByDeviceIdParm) SetReleaseTime(v string) *RegByDeviceIdParm {
	s.ReleaseTime = &v
	return s
}

func (s *RegByDeviceIdParm) SetExtraInfo(v string) *RegByDeviceIdParm {
	s.ExtraInfo = &v
	return s
}

func (s *RegByDeviceIdParm) SetOwner(v string) *RegByDeviceIdParm {
	s.Owner = &v
	return s
}

func (s *RegByDeviceIdParm) SetOwnerName(v string) *RegByDeviceIdParm {
	s.OwnerName = &v
	return s
}

func (s *RegByDeviceIdParm) SetDeviceImei(v string) *RegByDeviceIdParm {
	s.DeviceImei = &v
	return s
}

func (s *RegByDeviceIdParm) SetDeviceName(v string) *RegByDeviceIdParm {
	s.DeviceName = &v
	return s
}

func (s *RegByDeviceIdParm) SetCorpName(v string) *RegByDeviceIdParm {
	s.CorpName = &v
	return s
}

// Sdk分页查询结果
type SdkPageResponse struct {
	// 页数
	//
	// example:
	//
	// 1
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
	// 页码
	//
	// example:
	//
	// 10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 总记录数
	//
	// example:
	//
	// 100
	TotalSize *int64 `json:"total_size,omitempty" xml:"total_size,omitempty" require:"true"`
	// 总页数
	//
	// example:
	//
	// 10
	TotalPages *int64 `json:"total_pages,omitempty" xml:"total_pages,omitempty" require:"true"`
	// 数据
	// example:
	//
	// {...}
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

// code,name
type CodeListView struct {
	// 数据code
	// example:
	//
	// ahog
	DataCode *string `json:"data_code,omitempty" xml:"data_code,omitempty" require:"true"`
	// 数据名称
	// example:
	//
	// name
	DataName *string `json:"data_name,omitempty" xml:"data_name,omitempty" require:"true"`
}

func (s CodeListView) String() string {
	return tea.Prettify(s)
}

func (s CodeListView) GoString() string {
	return s.String()
}

func (s *CodeListView) SetDataCode(v string) *CodeListView {
	s.DataCode = &v
	return s
}

func (s *CodeListView) SetDataName(v string) *CodeListView {
	s.DataName = &v
	return s
}

// 凭证申请接口返回参数
type CarKeyInitData struct {
	// IIFFAA 根密钥
	// example:
	//
	// fs
	RootPubKey *string `json:"root_pub_key,omitempty" xml:"root_pub_key,omitempty" require:"true"`
	// IIFAA 设备唯一ID
	// example:
	//
	// e2eer
	Tuid *string `json:"tuid,omitempty" xml:"tuid,omitempty" require:"true"`
	// 业务密钥
	// example:
	//
	// erw
	BizPrivKey *string `json:"biz_priv_key,omitempty" xml:"biz_priv_key,omitempty" require:"true"`
	// 设备唯一密钥
	// example:
	//
	// fdsw
	DevicePrivKey *string `json:"device_priv_key,omitempty" xml:"device_priv_key,omitempty" require:"true"`
	// 无感空车凭证
	// example:
	//
	// rew
	KeyLessAuthy *string `json:"key_less_authy,omitempty" xml:"key_less_authy,omitempty" require:"true"`
}

func (s CarKeyInitData) String() string {
	return tea.Prettify(s)
}

func (s CarKeyInitData) GoString() string {
	return s.String()
}

func (s *CarKeyInitData) SetRootPubKey(v string) *CarKeyInitData {
	s.RootPubKey = &v
	return s
}

func (s *CarKeyInitData) SetTuid(v string) *CarKeyInitData {
	s.Tuid = &v
	return s
}

func (s *CarKeyInitData) SetBizPrivKey(v string) *CarKeyInitData {
	s.BizPrivKey = &v
	return s
}

func (s *CarKeyInitData) SetDevicePrivKey(v string) *CarKeyInitData {
	s.DevicePrivKey = &v
	return s
}

func (s *CarKeyInitData) SetKeyLessAuthy(v string) *CarKeyInitData {
	s.KeyLessAuthy = &v
	return s
}

// iotbasic-应用列表信息
type IotbasicAppManagerPageInfo struct {
	// 应用类型
	// example:
	//
	// apk
	FileFormat *string `json:"file_format,omitempty" xml:"file_format,omitempty" require:"true"`
	// 应用大小
	FileSize *int64 `json:"file_size,omitempty" xml:"file_size,omitempty" require:"true"`
	// 应用模块名称
	// example:
	//
	// 温控设备客户端
	ModuleName *string `json:"module_name,omitempty" xml:"module_name,omitempty" require:"true"`
	// 设备品类code
	// example:
	//
	// code
	DeviceCategory *string `json:"device_category,omitempty" xml:"device_category,omitempty" require:"true"`
	// 设备品类名称
	// example:
	//
	// name
	DeviceCategoryName *string `json:"device_category_name,omitempty" xml:"device_category_name,omitempty" require:"true"`
	// 应用模块包名
	// example:
	//
	// packageName
	PackageName *string `json:"package_name,omitempty" xml:"package_name,omitempty" require:"true"`
	// 应用描述
	// example:
	//
	// desc
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
	// 应用版本号
	// example:
	//
	// 1.0
	ApkVersion *string `json:"apk_version,omitempty" xml:"apk_version,omitempty" require:"true"`
	// 应用包类型（整包：0/差分：1）
	// example:
	//
	// 0
	ApkType *int64 `json:"apk_type,omitempty" xml:"apk_type,omitempty" require:"true"`
	// 应用名称
	// example:
	//
	// apkName
	ApkName *string `json:"apk_name,omitempty" xml:"apk_name,omitempty" require:"true"`
	// 应用包id
	// example:
	//
	// apkId
	ApkId *string `json:"apk_id,omitempty" xml:"apk_id,omitempty" require:"true"`
	// 下载次数
	// example:
	//
	// 0
	DownloadCount *int64 `json:"download_count,omitempty" xml:"download_count,omitempty" require:"true"`
	// 安装次数
	// example:
	//
	// 0
	InstallCount *int64 `json:"install_count,omitempty" xml:"install_count,omitempty" require:"true"`
	// 设备型号
	// example:
	//
	// model
	DeviceModel *string `json:"device_model,omitempty" xml:"device_model,omitempty"`
}

func (s IotbasicAppManagerPageInfo) String() string {
	return tea.Prettify(s)
}

func (s IotbasicAppManagerPageInfo) GoString() string {
	return s.String()
}

func (s *IotbasicAppManagerPageInfo) SetFileFormat(v string) *IotbasicAppManagerPageInfo {
	s.FileFormat = &v
	return s
}

func (s *IotbasicAppManagerPageInfo) SetFileSize(v int64) *IotbasicAppManagerPageInfo {
	s.FileSize = &v
	return s
}

func (s *IotbasicAppManagerPageInfo) SetModuleName(v string) *IotbasicAppManagerPageInfo {
	s.ModuleName = &v
	return s
}

func (s *IotbasicAppManagerPageInfo) SetDeviceCategory(v string) *IotbasicAppManagerPageInfo {
	s.DeviceCategory = &v
	return s
}

func (s *IotbasicAppManagerPageInfo) SetDeviceCategoryName(v string) *IotbasicAppManagerPageInfo {
	s.DeviceCategoryName = &v
	return s
}

func (s *IotbasicAppManagerPageInfo) SetPackageName(v string) *IotbasicAppManagerPageInfo {
	s.PackageName = &v
	return s
}

func (s *IotbasicAppManagerPageInfo) SetRemark(v string) *IotbasicAppManagerPageInfo {
	s.Remark = &v
	return s
}

func (s *IotbasicAppManagerPageInfo) SetApkVersion(v string) *IotbasicAppManagerPageInfo {
	s.ApkVersion = &v
	return s
}

func (s *IotbasicAppManagerPageInfo) SetApkType(v int64) *IotbasicAppManagerPageInfo {
	s.ApkType = &v
	return s
}

func (s *IotbasicAppManagerPageInfo) SetApkName(v string) *IotbasicAppManagerPageInfo {
	s.ApkName = &v
	return s
}

func (s *IotbasicAppManagerPageInfo) SetApkId(v string) *IotbasicAppManagerPageInfo {
	s.ApkId = &v
	return s
}

func (s *IotbasicAppManagerPageInfo) SetDownloadCount(v int64) *IotbasicAppManagerPageInfo {
	s.DownloadCount = &v
	return s
}

func (s *IotbasicAppManagerPageInfo) SetInstallCount(v int64) *IotbasicAppManagerPageInfo {
	s.InstallCount = &v
	return s
}

func (s *IotbasicAppManagerPageInfo) SetDeviceModel(v string) *IotbasicAppManagerPageInfo {
	s.DeviceModel = &v
	return s
}

// 四轮车驾驶事件
type FourWheelerCarEvent struct {
	// 驾驶事件的类型，如正常驾驶、碰撞、急转弯、启动熄火等。
	// example:
	//
	// 1
	EventType *string `json:"event_type,omitempty" xml:"event_type,omitempty" require:"true"`
	// 驾驶事件的结束时间
	// example:
	//
	// 1736152040551
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true"`
	// 驾驶事件发生地点的经度坐标
	// example:
	//
	// 121.4737
	Lng *string `json:"lng,omitempty" xml:"lng,omitempty" require:"true"`
	// 驾驶事件发生地点的纬度坐标
	// example:
	//
	// 31.2304
	Lat *string `json:"lat,omitempty" xml:"lat,omitempty" require:"true"`
	// 驾驶事件开始的速度
	// example:
	//
	// 60
	StartSpeed *string `json:"start_speed,omitempty" xml:"start_speed,omitempty"`
	// 驾驶事件结束时的速度
	// example:
	//
	// 45
	EndSpeed *string `json:"end_speed,omitempty" xml:"end_speed,omitempty"`
	// 驾驶过程中的平均速度
	// example:
	//
	// 52.5
	AverageSpeed *string `json:"average_speed,omitempty" xml:"average_speed,omitempty"`
	// 驾驶过程中车辆的转弯角度
	// example:
	//
	// 90
	TurningAngle *string `json:"turning_angle,omitempty" xml:"turning_angle,omitempty"`
	// 驾驶事件的持续时间（以秒为单位)
	// example:
	//
	// 10
	Duration *string `json:"duration,omitempty" xml:"duration,omitempty"`
}

func (s FourWheelerCarEvent) String() string {
	return tea.Prettify(s)
}

func (s FourWheelerCarEvent) GoString() string {
	return s.String()
}

func (s *FourWheelerCarEvent) SetEventType(v string) *FourWheelerCarEvent {
	s.EventType = &v
	return s
}

func (s *FourWheelerCarEvent) SetEndTime(v int64) *FourWheelerCarEvent {
	s.EndTime = &v
	return s
}

func (s *FourWheelerCarEvent) SetLng(v string) *FourWheelerCarEvent {
	s.Lng = &v
	return s
}

func (s *FourWheelerCarEvent) SetLat(v string) *FourWheelerCarEvent {
	s.Lat = &v
	return s
}

func (s *FourWheelerCarEvent) SetStartSpeed(v string) *FourWheelerCarEvent {
	s.StartSpeed = &v
	return s
}

func (s *FourWheelerCarEvent) SetEndSpeed(v string) *FourWheelerCarEvent {
	s.EndSpeed = &v
	return s
}

func (s *FourWheelerCarEvent) SetAverageSpeed(v string) *FourWheelerCarEvent {
	s.AverageSpeed = &v
	return s
}

func (s *FourWheelerCarEvent) SetTurningAngle(v string) *FourWheelerCarEvent {
	s.TurningAngle = &v
	return s
}

func (s *FourWheelerCarEvent) SetDuration(v string) *FourWheelerCarEvent {
	s.Duration = &v
	return s
}

// 查询设备列表结构体
type IotBasicDeviceQueryResponse struct {
	// 设备名称
	//
	// example:
	//
	// 智能防疫一体机
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty" require:"true"`
	// 设备序列号
	// example:
	//
	// CN12300x
	DeviceSn *string `json:"device_sn,omitempty" xml:"device_sn,omitempty" require:"true"`
	// 设备品类名称
	// example:
	//
	// 智能防疫机
	DeviceCategoryName *string `json:"device_category_name,omitempty" xml:"device_category_name,omitempty" require:"true"`
	// 设备型号
	// example:
	//
	// PL10
	DeviceModel *string `json:"device_model,omitempty" xml:"device_model,omitempty" require:"true"`
	// 设备状态
	// example:
	//
	// online
	DeviceStatus *string `json:"device_status,omitempty" xml:"device_status,omitempty"`
	// 设备安装位置
	// example:
	//
	// 浙江省杭州市西湖区
	Location *string `json:"location,omitempty" xml:"location,omitempty"`
	// 设备注册时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	RegisterTime *string `json:"register_time,omitempty" xml:"register_time,omitempty" require:"true"`
	// 设备厂商
	// example:
	//
	// 蚂蚁数科
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty" require:"true"`
	// 租户ID
	// example:
	//
	// 2088xx
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 客户名称
	// example:
	//
	// 测试客户xx
	CustomerName *string `json:"customer_name,omitempty" xml:"customer_name,omitempty" require:"true"`
	// 异常错误码
	// example:
	//
	// SMILE_INIT_ERROR
	AbnormalCode *string `json:"abnormal_code,omitempty" xml:"abnormal_code,omitempty"`
	// 设备唯一身份id
	// example:
	//
	// did:private:12dsadadadf
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty"`
	// 账号ID
	// example:
	//
	// 12321321
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// 账户名称
	// example:
	//
	// 张三
	AccountName *string `json:"account_name,omitempty" xml:"account_name,omitempty" require:"true"`
	// 设备服务状态
	// example:
	//
	// INIT
	ServiceStatus *string `json:"service_status,omitempty" xml:"service_status,omitempty" require:"true"`
	// 应用版本号
	// example:
	//
	// 1.1.13
	AppVersion *string `json:"app_version,omitempty" xml:"app_version,omitempty" require:"true"`
	// 服务有效期
	// example:
	//
	// 2024-4-01
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
	// example:
	//
	// "CN,北京"
	Extension *string `json:"extension,omitempty" xml:"extension,omitempty"`
	// 业务类型，默认空
	// example:
	//
	// null
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 组织机构代码，可为中文
	// example:
	//
	// "12345"
	TenantUid *string `json:"tenant_uid,omitempty" xml:"tenant_uid,omitempty" require:"true"`
	// 组织结构名称
	// example:
	//
	// "xx公司xx部门"
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

// provision数据
type Data struct {
	// provision数据
	// example:
	//
	// 123XXX
	ProvisionData *string `json:"provision_data,omitempty" xml:"provision_data,omitempty" require:"true"`
	// 余量
	// example:
	//
	// 0
	Remaining *int64 `json:"remaining,omitempty" xml:"remaining,omitempty"`
}

func (s Data) String() string {
	return tea.Prettify(s)
}

func (s Data) GoString() string {
	return s.String()
}

func (s *Data) SetProvisionData(v string) *Data {
	s.ProvisionData = &v
	return s
}

func (s *Data) SetRemaining(v int64) *Data {
	s.Remaining = &v
	return s
}

// iotbasic设备模型固定属性失败内容
type IotbasicDeviceModelFixedAttributeFailInfo struct {
	// 属性说明
	// example:
	//
	// name
	AttributeName *string `json:"attribute_name,omitempty" xml:"attribute_name,omitempty" require:"true"`
	// 属性名称
	// example:
	//
	// value
	AttributeValue *string `json:"attribute_value,omitempty" xml:"attribute_value,omitempty" require:"true"`
	// 数据值类型 字符串：string 数字：long
	// example:
	//
	// string
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty" require:"true"`
	// dataType为string时，表示数据长度最小值 dataType为long时，表示数据范围最小值
	DataRangeMin *int64 `json:"data_range_min,omitempty" xml:"data_range_min,omitempty" require:"true"`
	// dataType为string时，表示数据长度最大值 dataType为long时，表示数据范围最大值
	DataRangeMax *int64 `json:"data_range_max,omitempty" xml:"data_range_max,omitempty" require:"true"`
	// 失败code
	// example:
	//
	// code
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty" require:"true"`
	// 失败消息
	// example:
	//
	// message
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty" require:"true"`
}

func (s IotbasicDeviceModelFixedAttributeFailInfo) String() string {
	return tea.Prettify(s)
}

func (s IotbasicDeviceModelFixedAttributeFailInfo) GoString() string {
	return s.String()
}

func (s *IotbasicDeviceModelFixedAttributeFailInfo) SetAttributeName(v string) *IotbasicDeviceModelFixedAttributeFailInfo {
	s.AttributeName = &v
	return s
}

func (s *IotbasicDeviceModelFixedAttributeFailInfo) SetAttributeValue(v string) *IotbasicDeviceModelFixedAttributeFailInfo {
	s.AttributeValue = &v
	return s
}

func (s *IotbasicDeviceModelFixedAttributeFailInfo) SetDataType(v string) *IotbasicDeviceModelFixedAttributeFailInfo {
	s.DataType = &v
	return s
}

func (s *IotbasicDeviceModelFixedAttributeFailInfo) SetDataRangeMin(v int64) *IotbasicDeviceModelFixedAttributeFailInfo {
	s.DataRangeMin = &v
	return s
}

func (s *IotbasicDeviceModelFixedAttributeFailInfo) SetDataRangeMax(v int64) *IotbasicDeviceModelFixedAttributeFailInfo {
	s.DataRangeMax = &v
	return s
}

func (s *IotbasicDeviceModelFixedAttributeFailInfo) SetErrorCode(v string) *IotbasicDeviceModelFixedAttributeFailInfo {
	s.ErrorCode = &v
	return s
}

func (s *IotbasicDeviceModelFixedAttributeFailInfo) SetErrorMessage(v string) *IotbasicDeviceModelFixedAttributeFailInfo {
	s.ErrorMessage = &v
	return s
}

// JT设备所关联实体设备信息
type RelatedEntity struct {
	// 所关联实体的类型
	// example:
	//
	// COSTOMER_ENETITY
	EntityType *string `json:"entity_type,omitempty" xml:"entity_type,omitempty" require:"true"`
	// 所关联实体的trustiot唯一ID
	// example:
	//
	// 7006071575276187649
	RelatedEntityTrustiotId *int64 `json:"related_entity_trustiot_id,omitempty" xml:"related_entity_trustiot_id,omitempty" require:"true"`
}

func (s RelatedEntity) String() string {
	return tea.Prettify(s)
}

func (s RelatedEntity) GoString() string {
	return s.String()
}

func (s *RelatedEntity) SetEntityType(v string) *RelatedEntity {
	s.EntityType = &v
	return s
}

func (s *RelatedEntity) SetRelatedEntityTrustiotId(v int64) *RelatedEntity {
	s.RelatedEntityTrustiotId = &v
	return s
}

// 设备注册 请求对象
type IotBasicDeviceRegisterInfo struct {
	// 设备规格
	// example:
	//
	// xxx
	DeviceSpecs *string `json:"device_specs,omitempty" xml:"device_specs,omitempty" require:"true"`
	// 设备型号
	// example:
	//
	// xxx
	DeviceModel *string `json:"device_model,omitempty" xml:"device_model,omitempty" require:"true"`
	// 设备名称
	// example:
	//
	// test
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty" require:"true"`
	// 设备sn
	// example:
	//
	// xx
	DeviceSn *string `json:"device_sn,omitempty" xml:"device_sn,omitempty" require:"true"`
	// 设备标签
	// example:
	//
	// telpo
	NickName *string `json:"nick_name,omitempty" xml:"nick_name,omitempty"`
	// 安装位置
	// example:
	//
	// 杭州市
	Location *string `json:"location,omitempty" xml:"location,omitempty"`
	// 设备扩展信息
	// example:
	//
	// [{ "txHash" : "2c952456827828cdedad06afccef75a9f2c2840cbb6b0b659f653da1e5916cb2" }]
	DeviceExt *string `json:"device_ext,omitempty" xml:"device_ext,omitempty"`
	// 设备安全认证ID
	// example:
	//
	// secid
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

// 客户自定义实体
type CustomEntityInfo struct {
	// 客户自定义实体类型，默认为JSSDK_ACCOUNT
	// example:
	//
	// JSSDK_ACCOUNT
	CustomerEntityType *string `json:"customer_entity_type,omitempty" xml:"customer_entity_type,omitempty" require:"true"`
	// 客户自定义实体内容
	// example:
	//
	// {...}
	CustomerEntityContent *string `json:"customer_entity_content,omitempty" xml:"customer_entity_content,omitempty" require:"true"`
}

func (s CustomEntityInfo) String() string {
	return tea.Prettify(s)
}

func (s CustomEntityInfo) GoString() string {
	return s.String()
}

func (s *CustomEntityInfo) SetCustomerEntityType(v string) *CustomEntityInfo {
	s.CustomerEntityType = &v
	return s
}

func (s *CustomEntityInfo) SetCustomerEntityContent(v string) *CustomEntityInfo {
	s.CustomerEntityContent = &v
	return s
}

// 溯源码比对请求体
type BaiQrcodeComparisonReqData struct {
	// 扫码操作id，多次请求的trace_id相同代表短时间内在扫同一个码
	// example:
	//
	// trace_id_001
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true" maxLength:"128"`
	// query图片定位信息
	QueryImageLocation *BaiResourceLocation `json:"query_image_location,omitempty" xml:"query_image_location,omitempty" require:"true"`
	// gallery图片定位信息
	GalleryImageLocation *BaiResourceLocation `json:"gallery_image_location,omitempty" xml:"gallery_image_location,omitempty" require:"true"`
	// 是否允许降级
	// example:
	//
	// true, false
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

// 创建xr用户通行证结果信息
type XrUserTicketResultInfo struct {
	// xr通行证资源池名称
	// example:
	//
	// 资源池001
	XrTicketPoolName *string `json:"xr_ticket_pool_name,omitempty" xml:"xr_ticket_pool_name,omitempty" require:"true"`
	// 购买数量，失败列表有值
	// example:
	//
	// 10
	Count *int64 `json:"count,omitempty" xml:"count,omitempty"`
	// 失败原因，失败列表有值
	// example:
	//
	// 参数错误
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
	// 通行证编号，成功列表有值
	// example:
	//
	// 123123
	XrTicketCode *string `json:"xr_ticket_code,omitempty" xml:"xr_ticket_code,omitempty"`
}

func (s XrUserTicketResultInfo) String() string {
	return tea.Prettify(s)
}

func (s XrUserTicketResultInfo) GoString() string {
	return s.String()
}

func (s *XrUserTicketResultInfo) SetXrTicketPoolName(v string) *XrUserTicketResultInfo {
	s.XrTicketPoolName = &v
	return s
}

func (s *XrUserTicketResultInfo) SetCount(v int64) *XrUserTicketResultInfo {
	s.Count = &v
	return s
}

func (s *XrUserTicketResultInfo) SetErrorMsg(v string) *XrUserTicketResultInfo {
	s.ErrorMsg = &v
	return s
}

func (s *XrUserTicketResultInfo) SetXrTicketCode(v string) *XrUserTicketResultInfo {
	s.XrTicketCode = &v
	return s
}

// 仓库实体身份附加参数请求结构体，应用在注册/更新API的ThingExtraParams
type WarehouseReqModel struct {
	// 详细地址
	// example:
	//
	// 北京海淀区
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 面积 平方米单位*1e4
	// example:
	//
	// 1000000
	Area *int64 `json:"area,omitempty" xml:"area,omitempty"`
	// 海拔 米单位*1e2
	// example:
	//
	// 0
	Elevation *int64 `json:"elevation,omitempty" xml:"elevation,omitempty"`
	// 仓库高度 米单位*1e2
	// example:
	//
	// 1000
	Height *int64 `json:"height,omitempty" xml:"height,omitempty"`
	// 纬度 度数单位*1e9
	// example:
	//
	// 0
	Latitude *int64 `json:"latitude,omitempty" xml:"latitude,omitempty"`
	// 经度 度数单位*1e9
	// example:
	//
	// 35000000000
	Longitude *int64 `json:"longitude,omitempty" xml:"longitude,omitempty"`
	// 所在国家，中国
	// example:
	//
	// 中国
	Nation *string `json:"nation,omitempty" xml:"nation,omitempty"`
	// 其他信息
	// example:
	//
	// "自定义"
	OtherInfo *string `json:"other_info,omitempty" xml:"other_info,omitempty"`
	// 仓库状态, AVAILABLE, IN_USE, DELETED, 自定义
	// example:
	//
	// "AVAILABLE"
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 仓库类型
	// example:
	//
	// "自定义"
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
	// example:
	//
	// dadadasda
	OrderNumber *string `json:"order_number,omitempty" xml:"order_number,omitempty" require:"true"`
	// 收货人姓名
	//
	// example:
	//
	// 立敢
	ConsigneeName *string `json:"consignee_name,omitempty" xml:"consignee_name,omitempty" require:"true"`
	// 收货人身份证号
	// example:
	//
	// 424234324324234
	ConsigneeIdNumber *string `json:"consignee_id_number,omitempty" xml:"consignee_id_number,omitempty" require:"true"`
	// 收货人手机号
	//
	// example:
	//
	// 13400113344
	ConsigneePhone *string `json:"consignee_phone,omitempty" xml:"consignee_phone,omitempty" require:"true"`
	// 收货人地址
	// example:
	//
	// 北京市海淀区XXXXXXXX
	ConsigneeAddress *string `json:"consignee_address,omitempty" xml:"consignee_address,omitempty" require:"true"`
	// 供货商名称
	//
	// example:
	//
	// fsafsafaf
	SupplierName *string `json:"supplier_name,omitempty" xml:"supplier_name,omitempty" require:"true"`
	// 供货商租户id
	//
	// example:
	//
	// fsffafaf
	SupplierId *string `json:"supplier_id,omitempty" xml:"supplier_id,omitempty" require:"true"`
	// 采购商id
	//
	// example:
	//
	// fafsafaf
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

// 授权返回实体
type GrantDeviceInfo struct {
	// 授权ID
	// example:
	//
	// 00000001
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 授权ID
	// example:
	//
	// m6XFxJeTpllXZQ3BEZCyhovWZjoiCqqW
	AuthRecordId *string `json:"auth_record_id,omitempty" xml:"auth_record_id,omitempty" require:"true"`
}

func (s GrantDeviceInfo) String() string {
	return tea.Prettify(s)
}

func (s GrantDeviceInfo) GoString() string {
	return s.String()
}

func (s *GrantDeviceInfo) SetDeviceId(v string) *GrantDeviceInfo {
	s.DeviceId = &v
	return s
}

func (s *GrantDeviceInfo) SetAuthRecordId(v string) *GrantDeviceInfo {
	s.AuthRecordId = &v
	return s
}

// iotbasic发布批次信息
type IotbasicReleaseOrderInfo struct {
	// 应用名称
	// example:
	//
	// 应用名称
	ApkName *string `json:"apk_name,omitempty" xml:"apk_name,omitempty" require:"true"`
	// 应用版本号
	// example:
	//
	// apkVersion
	ApkVersion *string `json:"apk_version,omitempty" xml:"apk_version,omitempty" require:"true"`
	// 工单id
	// example:
	//
	// orderId
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 工单名称
	// example:
	//
	// orderName
	OrderName *string `json:"order_name,omitempty" xml:"order_name,omitempty" require:"true"`
	// 发布批次状态
	// 升级中：IN_PROGRESS
	// 取消中：CANCELING
	// 部分成功：PARTIAL_SUCCESS
	// 部分失败：PARTIAL_FAILED
	// 部分取消：PARTIAL_CANCELED
	// 全部成功：ALL_SUCCESS
	// 全部失败：ALL_FAILED
	// 全部取消：ALL_CANCELED
	// example:
	//
	// IN_PROGRESS
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 发布时间
	// example:
	//
	// 2024-06-06 11:11:11
	ReleaseTime *string `json:"release_time,omitempty" xml:"release_time,omitempty" require:"true"`
	// 设备升级总数
	ReleaseTotal *int64 `json:"release_total,omitempty" xml:"release_total,omitempty" require:"true"`
	// 设备升级完成数
	ReleaseFinished *int64 `json:"release_finished,omitempty" xml:"release_finished,omitempty" require:"true"`
	// 工单状态变更时间
	// example:
	//
	// 2024-06-06 11:11:11
	StatusChangeTime *string `json:"status_change_time,omitempty" xml:"status_change_time,omitempty" require:"true"`
}

func (s IotbasicReleaseOrderInfo) String() string {
	return tea.Prettify(s)
}

func (s IotbasicReleaseOrderInfo) GoString() string {
	return s.String()
}

func (s *IotbasicReleaseOrderInfo) SetApkName(v string) *IotbasicReleaseOrderInfo {
	s.ApkName = &v
	return s
}

func (s *IotbasicReleaseOrderInfo) SetApkVersion(v string) *IotbasicReleaseOrderInfo {
	s.ApkVersion = &v
	return s
}

func (s *IotbasicReleaseOrderInfo) SetOrderId(v string) *IotbasicReleaseOrderInfo {
	s.OrderId = &v
	return s
}

func (s *IotbasicReleaseOrderInfo) SetOrderName(v string) *IotbasicReleaseOrderInfo {
	s.OrderName = &v
	return s
}

func (s *IotbasicReleaseOrderInfo) SetStatus(v string) *IotbasicReleaseOrderInfo {
	s.Status = &v
	return s
}

func (s *IotbasicReleaseOrderInfo) SetReleaseTime(v string) *IotbasicReleaseOrderInfo {
	s.ReleaseTime = &v
	return s
}

func (s *IotbasicReleaseOrderInfo) SetReleaseTotal(v int64) *IotbasicReleaseOrderInfo {
	s.ReleaseTotal = &v
	return s
}

func (s *IotbasicReleaseOrderInfo) SetReleaseFinished(v int64) *IotbasicReleaseOrderInfo {
	s.ReleaseFinished = &v
	return s
}

func (s *IotbasicReleaseOrderInfo) SetStatusChangeTime(v string) *IotbasicReleaseOrderInfo {
	s.StatusChangeTime = &v
	return s
}

// iotbasic项目空间信息
type ProjectSpaceInfo struct {
	// 项目名称
	// example:
	//
	// 温控节能
	ProjectName *string `json:"project_name,omitempty" xml:"project_name,omitempty" require:"true"`
	// 项目编码
	// example:
	//
	// TEMP_CONTROL
	ProjectCode *string `json:"project_code,omitempty" xml:"project_code,omitempty" require:"true"`
	// 项目描述
	// example:
	//
	// 这是描述
	ProjectDesc *string `json:"project_desc,omitempty" xml:"project_desc,omitempty"`
}

func (s ProjectSpaceInfo) String() string {
	return tea.Prettify(s)
}

func (s ProjectSpaceInfo) GoString() string {
	return s.String()
}

func (s *ProjectSpaceInfo) SetProjectName(v string) *ProjectSpaceInfo {
	s.ProjectName = &v
	return s
}

func (s *ProjectSpaceInfo) SetProjectCode(v string) *ProjectSpaceInfo {
	s.ProjectCode = &v
	return s
}

func (s *ProjectSpaceInfo) SetProjectDesc(v string) *ProjectSpaceInfo {
	s.ProjectDesc = &v
	return s
}

// 实例信息列表
type InstanceInfo struct {
	// 实例id
	// example:
	//
	// 设备001
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 实例名称
	// example:
	//
	// 12313
	InstanceName *string `json:"instance_name,omitempty" xml:"instance_name,omitempty" require:"true"`
}

func (s InstanceInfo) String() string {
	return tea.Prettify(s)
}

func (s InstanceInfo) GoString() string {
	return s.String()
}

func (s *InstanceInfo) SetInstanceId(v string) *InstanceInfo {
	s.InstanceId = &v
	return s
}

func (s *InstanceInfo) SetInstanceName(v string) *InstanceInfo {
	s.InstanceName = &v
	return s
}

// 查询交易结果信息
type QueryTransactionResultInfo struct {
	// 区块hash
	// example:
	//
	// 123
	BlockHash *string `json:"block_hash,omitempty" xml:"block_hash,omitempty"`
	// 父区块hash
	// example:
	//
	// 123
	ParentBlockHash *string `json:"parent_block_hash,omitempty" xml:"parent_block_hash,omitempty"`
	// 交易时间戳
	// example:
	//
	// 123
	Timestamp *string `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
	// 该交易所能消耗的最大gas
	Gas *int64 `json:"gas,omitempty" xml:"gas,omitempty"`
	// 交易发起方账户
	// example:
	//
	// 123
	From *string `json:"from,omitempty" xml:"from,omitempty"`
	// 交易接收方账户
	// example:
	//
	// 123
	To *string `json:"to,omitempty" xml:"to,omitempty"`
	// 交易类型
	// example:
	//
	// 123
	TxType *string `json:"tx_type,omitempty" xml:"tx_type,omitempty"`
	// 交易返回的数据
	Data *QueryChainDataTransactionResultData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryTransactionResultInfo) String() string {
	return tea.Prettify(s)
}

func (s QueryTransactionResultInfo) GoString() string {
	return s.String()
}

func (s *QueryTransactionResultInfo) SetBlockHash(v string) *QueryTransactionResultInfo {
	s.BlockHash = &v
	return s
}

func (s *QueryTransactionResultInfo) SetParentBlockHash(v string) *QueryTransactionResultInfo {
	s.ParentBlockHash = &v
	return s
}

func (s *QueryTransactionResultInfo) SetTimestamp(v string) *QueryTransactionResultInfo {
	s.Timestamp = &v
	return s
}

func (s *QueryTransactionResultInfo) SetGas(v int64) *QueryTransactionResultInfo {
	s.Gas = &v
	return s
}

func (s *QueryTransactionResultInfo) SetFrom(v string) *QueryTransactionResultInfo {
	s.From = &v
	return s
}

func (s *QueryTransactionResultInfo) SetTo(v string) *QueryTransactionResultInfo {
	s.To = &v
	return s
}

func (s *QueryTransactionResultInfo) SetTxType(v string) *QueryTransactionResultInfo {
	s.TxType = &v
	return s
}

func (s *QueryTransactionResultInfo) SetData(v *QueryChainDataTransactionResultData) *QueryTransactionResultInfo {
	s.Data = v
	return s
}

// 设备不可操作标识类
type DeviceDisableData struct {
	// 设备sn号
	// example:
	//
	// sn123
	DeviceSn *string `json:"device_sn,omitempty" xml:"device_sn,omitempty" require:"true"`
	// 厂商
	// example:
	//
	// telpo
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
	// example:
	//
	// 1
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 设备品类名称
	// example:
	//
	// 智能防疫机一体机
	DeviceCategory *string `json:"device_category,omitempty" xml:"device_category,omitempty" require:"true"`
	// 关系类型
	// example:
	//
	// CORP
	RelationType *string `json:"relation_type,omitempty" xml:"relation_type,omitempty" require:"true"`
	// 厂商名称
	// example:
	//
	// 天波
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty"`
	// 设备型号
	// example:
	//
	// TPS980
	DeviceModel *string `json:"device_model,omitempty" xml:"device_model,omitempty"`
	// 设备规格
	// example:
	//
	// 安卓标准版
	DeviceSpecs *string `json:"device_specs,omitempty" xml:"device_specs,omitempty"`
	// 硬件模块
	// example:
	//
	// 测温头
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
	// example:
	//
	// safsafafafa
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 订单保存失败的原因
	// example:
	//
	// fasfasfasfa
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
	// example:
	//
	// 分拣机
	DeviceType *string `json:"device_type,omitempty" xml:"device_type,omitempty"`
	// 运营日期
	// example:
	//
	// 20210720
	OperationDate *string `json:"operation_date,omitempty" xml:"operation_date,omitempty"`
	// 修改时间
	// example:
	//
	// 2021-07-20 14:08:17
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty"`
	// 维修金比例
	// example:
	//
	// 50
	MaintenanceMoney *string `json:"maintenance_money,omitempty" xml:"maintenance_money,omitempty"`
	// 当日设备维修记录
	// example:
	//
	// error
	MaintainRecord *string `json:"maintain_record,omitempty" xml:"maintain_record,omitempty"`
	// 设备识别号
	// example:
	//
	// 10010100101
	DeviceNo *string `json:"device_no,omitempty" xml:"device_no,omitempty"`
	// 创建时间
	// example:
	//
	// 2021-07-20 14:08:17
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty"`
	// 当日分拣单数
	// example:
	//
	// 131222
	SortingNum *string `json:"sorting_num,omitempty" xml:"sorting_num,omitempty"`
	// 当日运营时长,单位分钟
	// example:
	//
	// 1231321
	OperationMinute *string `json:"operation_minute,omitempty" xml:"operation_minute,omitempty"`
	// 04:00-16:00分拣单数/（派件分拣单数）
	// example:
	//
	// 130012
	AmNum *string `json:"am_num,omitempty" xml:"am_num,omitempty"`
	// 16:00-04:00分拣单数/ （揽件分拣单数)
	// example:
	//
	// 1210
	PmNum *string `json:"pm_num,omitempty" xml:"pm_num,omitempty"`
	// id
	// example:
	//
	// 3
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 设备验收日期
	// example:
	//
	// 2021-07-20 11:33:59
	DeviceAcceptanceDate *string `json:"device_acceptance_date,omitempty" xml:"device_acceptance_date,omitempty"`
	// 数据更新时间
	// example:
	//
	// 2021-07-20 11:32:35
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
	// example:
	//
	// a87
	HouseId *string `json:"house_id,omitempty" xml:"house_id,omitempty" require:"true"`
	// 租赁模式
	// example:
	//
	// 合租
	LeaseMode *string `json:"lease_mode,omitempty" xml:"lease_mode,omitempty"`
	// 面积平方
	// example:
	//
	// 120㎡
	Acreage *string `json:"acreage,omitempty" xml:"acreage,omitempty"`
	// 房源类型：0住宅、1别墅、
	// 2商铺、3写字楼
	// example:
	//
	// 0
	Structure *int64 `json:"structure,omitempty" xml:"structure,omitempty" require:"true"`
	// 房屋地址
	// example:
	//
	// hz
	Addr *string `json:"addr,omitempty" xml:"addr,omitempty"`
	// 门锁设备DID
	// example:
	//
	// L91923
	LockId *string `json:"lock_id,omitempty" xml:"lock_id,omitempty"`
	// 电表设备DID
	// example:
	//
	// A87345
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
	// example:
	//
	// [{"content":"{业务数据}","label":"CRYPTO","timestamp":0}]
	BizData *string `json:"biz_data,omitempty" xml:"biz_data,omitempty"`
	// 不同上链方式
	// 空/"": 默认
	// "TTTS": 溯源
	// "IOTPAY": 支付
	// "CZ": 存证
	// "RAW":文本
	// example:
	//
	// "CZ"
	Category *string `json:"category,omitempty" xml:"category,omitempty" require:"true"`
	// 上链实体id(设备/空间)
	// 不可和project_uid同时为空
	// example:
	//
	// "did:iot:a9147bd2b83d4732b56dc06b346588f5619f80a2d4d2412fab535cbd37293a00"
	IotDid *string `json:"iot_did,omitempty" xml:"iot_did,omitempty"`
	// 需要上链的证据的哈希值
	// example:
	//
	// "ace1213412313"
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
	// 上链的附属信息
	// example:
	//
	// "附属信息json"
	MetaJson *string `json:"meta_json,omitempty" xml:"meta_json,omitempty"`
	// 上链的项目id,
	// 不可和iot_did同时为空
	// example:
	//
	// "上链的项目id"
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

// iotbasic项目品类信息
type CategoryInfo struct {
	// 品类名称
	// example:
	//
	// 电力仪表
	CategoryName *string `json:"category_name,omitempty" xml:"category_name,omitempty" require:"true"`
	// 品类编码
	// example:
	//
	// ant_power_meter
	CategoryCode *string `json:"category_code,omitempty" xml:"category_code,omitempty" require:"true"`
	// 描述内容
	// example:
	//
	// 这是描述
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
	// 行业
	// example:
	//
	// 工业
	Industry *string `json:"industry,omitempty" xml:"industry,omitempty" require:"true"`
	// 场景
	// example:
	//
	// 智能工业
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
}

func (s CategoryInfo) String() string {
	return tea.Prettify(s)
}

func (s CategoryInfo) GoString() string {
	return s.String()
}

func (s *CategoryInfo) SetCategoryName(v string) *CategoryInfo {
	s.CategoryName = &v
	return s
}

func (s *CategoryInfo) SetCategoryCode(v string) *CategoryInfo {
	s.CategoryCode = &v
	return s
}

func (s *CategoryInfo) SetRemark(v string) *CategoryInfo {
	s.Remark = &v
	return s
}

func (s *CategoryInfo) SetIndustry(v string) *CategoryInfo {
	s.Industry = &v
	return s
}

func (s *CategoryInfo) SetScene(v string) *CategoryInfo {
	s.Scene = &v
	return s
}

// 收集信息
type CollectContent struct {
	// 链上设备ID（与可信设备ID至少填一项）
	// example:
	//
	// 1122
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty"`
	// 可信设备ID（与链上设备ID至少填一项）
	// example:
	//
	// 7006071575519457281
	TrustiotDeviceId *int64 `json:"trustiot_device_id,omitempty" xml:"trustiot_device_id,omitempty"`
	// 收集的内容
	// example:
	//
	// {"name","1"}
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 对内容的签名
	// example:
	//
	// wwexe02j
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
	// 服务端发送的扩展数据（非可信设备直接产生的数据）
	// example:
	//
	// {"extraKey":"extraValue"}
	ExtraData *string `json:"extra_data,omitempty" xml:"extra_data,omitempty"`
	// 数据模型Id
	// example:
	//
	// 00000001
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
	// example:
	//
	// 12321321
	BillItemId *string `json:"bill_item_id,omitempty" xml:"bill_item_id,omitempty" require:"true"`
	// 租约分期名称
	// example:
	//
	// 第几期
	BillItemName *string `json:"bill_item_name,omitempty" xml:"bill_item_name,omitempty"`
	// 租期开始日期
	// example:
	//
	// 2006-01-02 15:04:05
	BillItemBegin *string `json:"bill_item_begin,omitempty" xml:"bill_item_begin,omitempty" require:"true"`
	// 租期结束日期
	// example:
	//
	// 2006-02-02 15:04:05
	BillItemEnd *string `json:"bill_item_end,omitempty" xml:"bill_item_end,omitempty" require:"true"`
	// 租约金额
	// example:
	//
	// 5000
	BillItemMoney *string `json:"bill_item_money,omitempty" xml:"bill_item_money,omitempty" require:"true"`
	// 租约支付状态
	// example:
	//
	// 待支付，已支付，支付失败
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
	// example:
	//
	// TEST1234567890
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

// 实体上链数据
type EntityChainData struct {
	// 实体ID
	// example:
	//
	// 123456
	EntityId *string `json:"entity_id,omitempty" xml:"entity_id,omitempty" require:"true"`
	// 数据原文
	// example:
	//
	// content
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 数据原文对应的签名
	// example:
	//
	// 1ac3dfe2
	Sign *string `json:"sign,omitempty" xml:"sign,omitempty" require:"true"`
	// 数据原文上链哈希
	// example:
	//
	// 1f2a9ec2b
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
}

func (s EntityChainData) String() string {
	return tea.Prettify(s)
}

func (s EntityChainData) GoString() string {
	return s.String()
}

func (s *EntityChainData) SetEntityId(v string) *EntityChainData {
	s.EntityId = &v
	return s
}

func (s *EntityChainData) SetContent(v string) *EntityChainData {
	s.Content = &v
	return s
}

func (s *EntityChainData) SetSign(v string) *EntityChainData {
	s.Sign = &v
	return s
}

func (s *EntityChainData) SetTxHash(v string) *EntityChainData {
	s.TxHash = &v
	return s
}

// 数据模型
type DataModel struct {
	//  数据模型Id
	// example:
	//
	// 112233
	DataModelId *string `json:"data_model_id,omitempty" xml:"data_model_id,omitempty" require:"true"`
	// 数据模型名称
	// example:
	//
	// 检测设备模型
	DataModelName *string `json:"data_model_name,omitempty" xml:"data_model_name,omitempty"`
	// 数据模型
	// example:
	//
	// {          "PIC-URL": {                 "type": "string",                 "require":false              } }
	DataModel *string `json:"data_model,omitempty" xml:"data_model,omitempty" require:"true"`
	// 数据模型类别
	// example:
	//
	// ORDER
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 用户自定义版本
	// example:
	//
	// V1.0
	CustomerVersion *string `json:"customer_version,omitempty" xml:"customer_version,omitempty"`
	// 数据样例
	// example:
	//
	// {"name":"zhangsan"}
	DataDemo *string `json:"data_demo,omitempty" xml:"data_demo,omitempty"`
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

func (s *DataModel) SetDataDemo(v string) *DataModel {
	s.DataDemo = &v
	return s
}

// 溯源防伪码生成请求的响应数据
type BaiQrcodeGenerateRespData struct {
	// 二维码的base64字符串
	// example:
	//
	// /9j/4QyXRXhpZgAATU0AKgAAAAgABwESAAMAAAABAAEAAAEa......
	GenerateResult *string `json:"generate_result,omitempty" xml:"generate_result,omitempty" require:"true"`
	// 生成结果码
	// example:
	//
	// 200
	GenerateCode *string `json:"generate_code,omitempty" xml:"generate_code,omitempty" require:"true"`
	// 用于异常场景下细化错误信息
	// example:
	//
	// 码值不正确
	GenerateMessage *string `json:"generate_message,omitempty" xml:"generate_message,omitempty" require:"true"`
	// 生成失败时的解决方案，用于异常场景下细化错误信息
	// example:
	//
	// 请调整码值重试
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
	// example:
	//
	// 2018-10-10 10:10:00
	DetailStartTime *string `json:"detail_start_time,omitempty" xml:"detail_start_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 结束时间
	// example:
	//
	// 2018-10-10 10:10:00
	DetailEndTime *string `json:"detail_end_time,omitempty" xml:"detail_end_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 时段电价，小数点后4位
	// example:
	//
	// 10.1010
	ElecPrice *string `json:"elec_price,omitempty" xml:"elec_price,omitempty"`
	// 时段服务费价格，小数点后4位
	// example:
	//
	// 12.6222
	ServicePrice *string `json:"service_price,omitempty" xml:"service_price,omitempty"`
	// 时段充电量，单位：度，小数点后2位
	// example:
	//
	// 12.12
	DetailPower *string `json:"detail_power,omitempty" xml:"detail_power,omitempty" require:"true"`
	// 时段电费，小数点后2位
	// example:
	//
	// 10.10
	DetailElecMoney *string `json:"detail_elec_money,omitempty" xml:"detail_elec_money,omitempty"`
	// 时段服务费，小数点后2位
	// example:
	//
	// 10.10
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

// xr通行证批量创建成功列表
type XrTicketPoolSuccessList struct {
	// 租户id
	// example:
	//
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 资源id
	// example:
	//
	// 资源id
	ResourceId *string `json:"resource_id,omitempty" xml:"resource_id,omitempty" require:"true"`
	// 有效期
	// example:
	//
	// 2022-10-02
	ValidTime *string `json:"valid_time,omitempty" xml:"valid_time,omitempty" require:"true"`
	// 体验时长
	// example:
	//
	// 60(单位分)
	TestTime *int64 `json:"test_time,omitempty" xml:"test_time,omitempty" require:"true"`
	// vr设备集合
	// example:
	//
	// json或数组
	XrApps *string `json:"xr_apps,omitempty" xml:"xr_apps,omitempty"`
	// 券池最大数
	// example:
	//
	// 200
	MaxPoolCount *int64 `json:"max_pool_count,omitempty" xml:"max_pool_count,omitempty" require:"true"`
	// 券池名称
	// example:
	//
	// 券池名称
	XrTicketPoolName *string `json:"xr_ticket_pool_name,omitempty" xml:"xr_ticket_pool_name,omitempty" require:"true"`
	// 核销类型
	// example:
	//
	// XR_DEVICE
	XrVerificationType *string `json:"xr_verification_type,omitempty" xml:"xr_verification_type,omitempty" require:"true"`
}

func (s XrTicketPoolSuccessList) String() string {
	return tea.Prettify(s)
}

func (s XrTicketPoolSuccessList) GoString() string {
	return s.String()
}

func (s *XrTicketPoolSuccessList) SetTenantId(v string) *XrTicketPoolSuccessList {
	s.TenantId = &v
	return s
}

func (s *XrTicketPoolSuccessList) SetResourceId(v string) *XrTicketPoolSuccessList {
	s.ResourceId = &v
	return s
}

func (s *XrTicketPoolSuccessList) SetValidTime(v string) *XrTicketPoolSuccessList {
	s.ValidTime = &v
	return s
}

func (s *XrTicketPoolSuccessList) SetTestTime(v int64) *XrTicketPoolSuccessList {
	s.TestTime = &v
	return s
}

func (s *XrTicketPoolSuccessList) SetXrApps(v string) *XrTicketPoolSuccessList {
	s.XrApps = &v
	return s
}

func (s *XrTicketPoolSuccessList) SetMaxPoolCount(v int64) *XrTicketPoolSuccessList {
	s.MaxPoolCount = &v
	return s
}

func (s *XrTicketPoolSuccessList) SetXrTicketPoolName(v string) *XrTicketPoolSuccessList {
	s.XrTicketPoolName = &v
	return s
}

func (s *XrTicketPoolSuccessList) SetXrVerificationType(v string) *XrTicketPoolSuccessList {
	s.XrVerificationType = &v
	return s
}

// 智能体信息视图对象
type AgentInfoVO struct {
	// 智能体ID
	// example:
	//
	// 7265889323732762624
	AgentId *string `json:"agent_id,omitempty" xml:"agent_id,omitempty" require:"true"`
	// 智能体名称
	// example:
	//
	// 小蚁
	AgentName *string `json:"agent_name,omitempty" xml:"agent_name,omitempty" require:"true"`
	// 语言编码
	// example:
	//
	// zh
	LangCode *string `json:"lang_code,omitempty" xml:"lang_code,omitempty" require:"true"`
	// 音色ID
	// example:
	//
	// longjing_v2
	TtsVoiceId *string `json:"tts_voice_id,omitempty" xml:"tts_voice_id,omitempty" require:"true"`
	// 系统提示词
	// example:
	//
	// 你是一个某某智能体
	SystemPrompt *string `json:"system_prompt,omitempty" xml:"system_prompt,omitempty" require:"true"`
	// 可选模型列表
	// example:
	//
	// [{"label":"qwen-plus","value":"qwen-plus"},{"label":"glm4.7","value":"glm4.7"},{"label":"glm5","value":"glm5"}]
	LlmModelList []*DictionaryInfoBO `json:"llm_model_list,omitempty" xml:"llm_model_list,omitempty" type:"Repeated"`
	// 可选音色列表
	// example:
	//
	// [{"label":"甜甜（女声普通话）","value":"Tina"},{"label":"拉迪奥·戈尔（男声葡萄牙语）","value":"Radio Gol"}]
	TtsVoiceList []*DictionaryInfoBO `json:"tts_voice_list,omitempty" xml:"tts_voice_list,omitempty" type:"Repeated"`
	// 可选语言列表
	// example:
	//
	// [{"label": "中文","value": "zh"},{"label": "英文","value": "en"}]
	LanguageList []*DictionaryInfoBO `json:"language_list,omitempty" xml:"language_list,omitempty" type:"Repeated"`
	// 父模板智能体名称
	// example:
	//
	// 小蚁模板
	ParentTemplateAgentName *string `json:"parent_template_agent_name,omitempty" xml:"parent_template_agent_name,omitempty"`
}

func (s AgentInfoVO) String() string {
	return tea.Prettify(s)
}

func (s AgentInfoVO) GoString() string {
	return s.String()
}

func (s *AgentInfoVO) SetAgentId(v string) *AgentInfoVO {
	s.AgentId = &v
	return s
}

func (s *AgentInfoVO) SetAgentName(v string) *AgentInfoVO {
	s.AgentName = &v
	return s
}

func (s *AgentInfoVO) SetLangCode(v string) *AgentInfoVO {
	s.LangCode = &v
	return s
}

func (s *AgentInfoVO) SetTtsVoiceId(v string) *AgentInfoVO {
	s.TtsVoiceId = &v
	return s
}

func (s *AgentInfoVO) SetSystemPrompt(v string) *AgentInfoVO {
	s.SystemPrompt = &v
	return s
}

func (s *AgentInfoVO) SetLlmModelList(v []*DictionaryInfoBO) *AgentInfoVO {
	s.LlmModelList = v
	return s
}

func (s *AgentInfoVO) SetTtsVoiceList(v []*DictionaryInfoBO) *AgentInfoVO {
	s.TtsVoiceList = v
	return s
}

func (s *AgentInfoVO) SetLanguageList(v []*DictionaryInfoBO) *AgentInfoVO {
	s.LanguageList = v
	return s
}

func (s *AgentInfoVO) SetParentTemplateAgentName(v string) *AgentInfoVO {
	s.ParentTemplateAgentName = &v
	return s
}

// 要素关系信息
type AssetElementRelationInfo struct {
	// 来源要素ID
	// example:
	//
	// 112233
	SourceElementId *string `json:"source_element_id,omitempty" xml:"source_element_id,omitempty" require:"true"`
	// 目标要素ID
	// example:
	//
	// 112233
	TargetElementId *string `json:"target_element_id,omitempty" xml:"target_element_id,omitempty" require:"true"`
	// 关联类型
	// example:
	//
	// 1
	RelationType *int64 `json:"relation_type,omitempty" xml:"relation_type,omitempty" require:"true"`
	// 关联依据类型
	// example:
	//
	// NORMAL
	RelationDependencyType *string `json:"relation_dependency_type,omitempty" xml:"relation_dependency_type,omitempty"`
	// 关联依据
	// example:
	//
	// {...}
	RelationDependency *string `json:"relation_dependency,omitempty" xml:"relation_dependency,omitempty"`
	// 项目ID
	// example:
	//
	// 112233
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 来源要素名称
	// example:
	//
	// 来源要素
	SourceElementName *string `json:"source_element_name,omitempty" xml:"source_element_name,omitempty" require:"true"`
	// 目标要素名称
	// example:
	//
	// 目标要素
	TargetElementName *string `json:"target_element_name,omitempty" xml:"target_element_name,omitempty" require:"true"`
}

func (s AssetElementRelationInfo) String() string {
	return tea.Prettify(s)
}

func (s AssetElementRelationInfo) GoString() string {
	return s.String()
}

func (s *AssetElementRelationInfo) SetSourceElementId(v string) *AssetElementRelationInfo {
	s.SourceElementId = &v
	return s
}

func (s *AssetElementRelationInfo) SetTargetElementId(v string) *AssetElementRelationInfo {
	s.TargetElementId = &v
	return s
}

func (s *AssetElementRelationInfo) SetRelationType(v int64) *AssetElementRelationInfo {
	s.RelationType = &v
	return s
}

func (s *AssetElementRelationInfo) SetRelationDependencyType(v string) *AssetElementRelationInfo {
	s.RelationDependencyType = &v
	return s
}

func (s *AssetElementRelationInfo) SetRelationDependency(v string) *AssetElementRelationInfo {
	s.RelationDependency = &v
	return s
}

func (s *AssetElementRelationInfo) SetProjectId(v string) *AssetElementRelationInfo {
	s.ProjectId = &v
	return s
}

func (s *AssetElementRelationInfo) SetSourceElementName(v string) *AssetElementRelationInfo {
	s.SourceElementName = &v
	return s
}

func (s *AssetElementRelationInfo) SetTargetElementName(v string) *AssetElementRelationInfo {
	s.TargetElementName = &v
	return s
}

// 更新设备和空间关联请求结构体
type UpdateDeviceSpaceReq struct {
	// API要更新的设备DID
	// example:
	//
	// "did:iot:xxxxx"
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty" require:"true"`
	// 0-全部更新 (暂不支持)
	// 1-添加
	// 2-删除
	//
	// example:
	//
	// 1
	UpdateMode *int64 `json:"update_mode,omitempty" xml:"update_mode,omitempty" require:"true"`
	// API要更新的设备部署库位
	// example:
	//
	// ["did:iot:xxxx","did:iot:xxxxx"]
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
	// example:
	//
	// 12321321
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty" require:"true"`
	// 设备sn
	// example:
	//
	// 2088xx
	DeviceSn *string `json:"device_sn,omitempty" xml:"device_sn,omitempty" require:"true"`
	// 错误编码
	// example:
	//
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 错误描述
	// example:
	//
	// message
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
	// example:
	//
	// 123ABC
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 数据模型Id
	// example:
	//
	// 112233
	DeviceDataModelId *string `json:"device_data_model_id,omitempty" xml:"device_data_model_id,omitempty" require:"true"`
	// 场景码
	// example:
	//
	// SCENE1
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// imei号
	// example:
	//
	// 223344
	DeviceImei *string `json:"device_imei,omitempty" xml:"device_imei,omitempty" require:"true"`
	// 设备名称
	// example:
	//
	// 设备1号
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty"`
	// 设备厂商名称
	// example:
	//
	// 浙江一厂
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty"`
	// 设备ICCID
	//
	//
	// example:
	//
	// a1234
	DeviceIccid *string `json:"device_iccid,omitempty" xml:"device_iccid,omitempty"`
	// 设备扩展信息
	// example:
	//
	// {“”:""}
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 设备链上Id
	// example:
	//
	// 223344
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty" require:"true"`
	// 上链哈希
	// example:
	//
	// 3344
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 上链时间
	// example:
	//
	// 224455
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
	// example:
	//
	// 5000
	DeviceTypeCode *int64 `json:"device_type_code,omitempty" xml:"device_type_code,omitempty" require:"true"`
	// 单价
	// example:
	//
	// 1000
	InitialPrice *int64 `json:"initial_price,omitempty" xml:"initial_price,omitempty" require:"true"`
	// 投放时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	ReleaseTime *string `json:"release_time,omitempty" xml:"release_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 出厂时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	FactoryTime *string `json:"factory_time,omitempty" xml:"factory_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 设备状态，取值范围：NORMAL、OFFLINE、UNREGISTER
	// example:
	//
	// NORMAL
	DeviceStatus *string `json:"device_status,omitempty" xml:"device_status,omitempty"`
	// 可信设备ID
	// example:
	//
	// 7006071575276187649
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
	// example:
	//
	// 防疫一体机
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true"`
	// 产品code
	// example:
	//
	// face_smart
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 产品描述
	// example:
	//
	// 智能防疫机
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
	// example:
	//
	// 0
	AuthLevel *int64 `json:"auth_level,omitempty" xml:"auth_level,omitempty"`
	// 设备属性字符串，
	// 阿里云设备类型，填入三元组
	// example:
	//
	// "设备属性"
	DeviceAttribute *string `json:"device_attribute,omitempty" xml:"device_attribute,omitempty"`
	// 物模型ID，参考其他文档
	// example:
	//
	// "模型ID"
	DeviceModelId *string `json:"device_model_id,omitempty" xml:"device_model_id,omitempty"`
	// 可传入自定义信息
	// example:
	//
	// "自定义字段"
	OtherInfo *string `json:"other_info,omitempty" xml:"other_info,omitempty"`
	// 业务自定义，可以传入该实体的w3c服务节点
	// example:
	//
	// "服务端点"
	ServiceEndpoint *string `json:"service_endpoint,omitempty" xml:"service_endpoint,omitempty"`
	// 保留，默认
	//     STATUS_REGISTERED(3)
	// example:
	//
	// null
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
	// example:
	//
	// 213
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty" require:"true"`
	// 设备签名
	// example:
	//
	// sua8e
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
	// example:
	//
	// 10010100101
	DeviceNo *string `json:"device_no,omitempty" xml:"device_no,omitempty" require:"true"`
	// 运营日期
	// example:
	//
	// 2021-07-20 11:34:00
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

// 用户通行证详情
type XrUserTicketDetail struct {
	// 业务类型
	// example:
	//
	// XR_LEASE
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
	// 所属客户
	// example:
	//
	// QWERTYUI
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 用户通行证编码
	// example:
	//
	// 8613356
	XrTicketCode *string `json:"xr_ticket_code,omitempty" xml:"xr_ticket_code,omitempty" require:"true"`
	// xr通行证资源池名称
	// example:
	//
	// 资源池001
	XrTicketPoolName *string `json:"xr_ticket_pool_name,omitempty" xml:"xr_ticket_pool_name,omitempty" require:"true"`
	// 用户id
	// example:
	//
	// 2088**
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 资源id
	// example:
	//
	// xsadds
	ResourceId *string `json:"resource_id,omitempty" xml:"resource_id,omitempty" require:"true"`
	// 资源名称
	// example:
	//
	// 资源001
	ResourceName *string `json:"resource_name,omitempty" xml:"resource_name,omitempty" require:"true"`
	// 用户通行证状态
	// example:
	//
	// 待核销
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 有效期
	// example:
	//
	// 2023-03-28
	ValidTime *string `json:"valid_time,omitempty" xml:"valid_time,omitempty" require:"true"`
	// 实例id
	// example:
	//
	// 86871
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty"`
	// 核销时间
	// example:
	//
	// 2018-10-10 10:10:00
	XrVerificationTime *string `json:"xr_verification_time,omitempty" xml:"xr_verification_time,omitempty"`
	// 体验开始时间
	// example:
	//
	// 2018-10-10 10:10:00
	SampleStartTime *string `json:"sample_start_time,omitempty" xml:"sample_start_time,omitempty"`
	// 体验结束时间
	// example:
	//
	// 2018-10-10 10:10:00
	SampleEndTime *string `json:"sample_end_time,omitempty" xml:"sample_end_time,omitempty"`
	// 核销类型
	// example:
	//
	// XR_DEVICE
	XrVerificationType *string `json:"xr_verification_type,omitempty" xml:"xr_verification_type,omitempty" require:"true"`
	// 实例名称
	// example:
	//
	// 实例001
	InstanceName *string `json:"instance_name,omitempty" xml:"instance_name,omitempty"`
	// 体验时长，分
	// example:
	//
	// 60
	TestTime *int64 `json:"test_time,omitempty" xml:"test_time,omitempty" require:"true"`
	// vr应用集合
	// example:
	//
	// vr应用集合
	XrApps *string `json:"xr_apps,omitempty" xml:"xr_apps,omitempty"`
}

func (s XrUserTicketDetail) String() string {
	return tea.Prettify(s)
}

func (s XrUserTicketDetail) GoString() string {
	return s.String()
}

func (s *XrUserTicketDetail) SetBizScene(v string) *XrUserTicketDetail {
	s.BizScene = &v
	return s
}

func (s *XrUserTicketDetail) SetTenantId(v string) *XrUserTicketDetail {
	s.TenantId = &v
	return s
}

func (s *XrUserTicketDetail) SetXrTicketCode(v string) *XrUserTicketDetail {
	s.XrTicketCode = &v
	return s
}

func (s *XrUserTicketDetail) SetXrTicketPoolName(v string) *XrUserTicketDetail {
	s.XrTicketPoolName = &v
	return s
}

func (s *XrUserTicketDetail) SetUserId(v string) *XrUserTicketDetail {
	s.UserId = &v
	return s
}

func (s *XrUserTicketDetail) SetResourceId(v string) *XrUserTicketDetail {
	s.ResourceId = &v
	return s
}

func (s *XrUserTicketDetail) SetResourceName(v string) *XrUserTicketDetail {
	s.ResourceName = &v
	return s
}

func (s *XrUserTicketDetail) SetStatus(v string) *XrUserTicketDetail {
	s.Status = &v
	return s
}

func (s *XrUserTicketDetail) SetValidTime(v string) *XrUserTicketDetail {
	s.ValidTime = &v
	return s
}

func (s *XrUserTicketDetail) SetInstanceId(v string) *XrUserTicketDetail {
	s.InstanceId = &v
	return s
}

func (s *XrUserTicketDetail) SetXrVerificationTime(v string) *XrUserTicketDetail {
	s.XrVerificationTime = &v
	return s
}

func (s *XrUserTicketDetail) SetSampleStartTime(v string) *XrUserTicketDetail {
	s.SampleStartTime = &v
	return s
}

func (s *XrUserTicketDetail) SetSampleEndTime(v string) *XrUserTicketDetail {
	s.SampleEndTime = &v
	return s
}

func (s *XrUserTicketDetail) SetXrVerificationType(v string) *XrUserTicketDetail {
	s.XrVerificationType = &v
	return s
}

func (s *XrUserTicketDetail) SetInstanceName(v string) *XrUserTicketDetail {
	s.InstanceName = &v
	return s
}

func (s *XrUserTicketDetail) SetTestTime(v int64) *XrUserTicketDetail {
	s.TestTime = &v
	return s
}

func (s *XrUserTicketDetail) SetXrApps(v string) *XrUserTicketDetail {
	s.XrApps = &v
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
	// example:
	//
	// ["如下1","如下2"]
	DataFilter []*string `json:"data_filter,omitempty" xml:"data_filter,omitempty" require:"true" type:"Repeated"`
	// 是否从链上查询，从链上查询将返回txHash值
	// example:
	//
	// false
	OnChain *bool `json:"on_chain,omitempty" xml:"on_chain,omitempty" require:"true"`
	// 需要查询的实体Did列表，同一次查询的Did须为相同类型
	// example:
	//
	// ["did:iot:xxxx","did:iot:yyyyy"]
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

// 设备信息
type DeviceInfos struct {
	// tuid
	// example:
	//
	// ""
	Tuid *string `json:"tuid,omitempty" xml:"tuid,omitempty"`
	// 设备状态
	// example:
	//
	// online
	DeviceStatus *string `json:"device_status,omitempty" xml:"device_status,omitempty"`
	// ota version
	// example:
	//
	// ""
	DeviceOtaVersion *string `json:"device_ota_version,omitempty" xml:"device_ota_version,omitempty"`
}

func (s DeviceInfos) String() string {
	return tea.Prettify(s)
}

func (s DeviceInfos) GoString() string {
	return s.String()
}

func (s *DeviceInfos) SetTuid(v string) *DeviceInfos {
	s.Tuid = &v
	return s
}

func (s *DeviceInfos) SetDeviceStatus(v string) *DeviceInfos {
	s.DeviceStatus = &v
	return s
}

func (s *DeviceInfos) SetDeviceOtaVersion(v string) *DeviceInfos {
	s.DeviceOtaVersion = &v
	return s
}

// 会话内容
type AiAgentChatHistoryBO struct {
	// 客户端ID
	// example:
	//
	// 00:ba:cc
	ClientId *string `json:"client_id,omitempty" xml:"client_id,omitempty" require:"true"`
	// 客户端类型
	// example:
	//
	// ESP32
	ClientType *string `json:"client_type,omitempty" xml:"client_type,omitempty" require:"true"`
	// 对话内容
	// example:
	//
	// ...对话内容
	ConversationContent *string `json:"conversation_content,omitempty" xml:"conversation_content,omitempty" require:"true"`
	// 对话类型
	// example:
	//
	// request
	ConversationType *string `json:"conversation_type,omitempty" xml:"conversation_type,omitempty" require:"true"`
	// 会话ID
	// example:
	//
	// 7468486322254688256
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true"`
	// 对话时间（格式化后的时间）
	// example:
	//
	// 2026-06-24 21:32:59
	Time *string `json:"time,omitempty" xml:"time,omitempty" require:"true"`
}

func (s AiAgentChatHistoryBO) String() string {
	return tea.Prettify(s)
}

func (s AiAgentChatHistoryBO) GoString() string {
	return s.String()
}

func (s *AiAgentChatHistoryBO) SetClientId(v string) *AiAgentChatHistoryBO {
	s.ClientId = &v
	return s
}

func (s *AiAgentChatHistoryBO) SetClientType(v string) *AiAgentChatHistoryBO {
	s.ClientType = &v
	return s
}

func (s *AiAgentChatHistoryBO) SetConversationContent(v string) *AiAgentChatHistoryBO {
	s.ConversationContent = &v
	return s
}

func (s *AiAgentChatHistoryBO) SetConversationType(v string) *AiAgentChatHistoryBO {
	s.ConversationType = &v
	return s
}

func (s *AiAgentChatHistoryBO) SetSessionId(v string) *AiAgentChatHistoryBO {
	s.SessionId = &v
	return s
}

func (s *AiAgentChatHistoryBO) SetTime(v string) *AiAgentChatHistoryBO {
	s.Time = &v
	return s
}

// 商品鉴定返回结果
type BaiGoodsComparisonResponse struct {
	// 鉴定结果（REAL：为真   FAKE：为假   UNABLE_IDENTIFY：无法鉴定）
	// example:
	//
	// REAL
	IdentificationResult *string `json:"identification_result,omitempty" xml:"identification_result,omitempty" require:"true"`
	// 鉴定补充信息
	// example:
	//
	// 鉴定成功
	IdentificationMessage *string `json:"identification_message,omitempty" xml:"identification_message,omitempty"`
	// 鉴定信息code
	// example:
	//
	// 200
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
	// example:
	//
	// 1
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
	// 页码
	// example:
	//
	// 10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 总记录数
	// example:
	//
	// 100
	TotalSize *int64 `json:"total_size,omitempty" xml:"total_size,omitempty" require:"true"`
	// 总页数
	// example:
	//
	// 10
	TotalPages *int64 `json:"total_pages,omitempty" xml:"total_pages,omitempty" require:"true"`
	// 数据
	// example:
	//
	// {...}
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
	// example:
	//
	// 234
	PlanId *int64 `json:"plan_id,omitempty" xml:"plan_id,omitempty" minimum:"0"`
	// 刷库计划步骤id
	// example:
	//
	// 234
	PlanStepId *int64 `json:"plan_step_id,omitempty" xml:"plan_step_id,omitempty" minimum:"0"`
	// 任务id
	// example:
	//
	// 234
	TaskId *int64 `json:"task_id,omitempty" xml:"task_id,omitempty" minimum:"0"`
	// action_id
	// example:
	//
	// 234
	ActionId *int64 `json:"action_id,omitempty" xml:"action_id,omitempty" minimum:"0"`
	// 任务类型
	// example:
	//
	// 升级，溯源
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
	// example:
	//
	// REAL
	IdentificationResult *string `json:"identification_result,omitempty" xml:"identification_result,omitempty" require:"true"`
	// 整体鉴定分数
	// example:
	//
	// 0.99
	Grade *string `json:"grade,omitempty" xml:"grade,omitempty" require:"true"`
	// 整体鉴定报告描述
	// example:
	//
	// AI鉴定成功
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 鉴定点鉴定结果列表
	PointIdentificationResults []*BaiGoodsPointIdentificationResult `json:"point_identification_results,omitempty" xml:"point_identification_results,omitempty" require:"true" type:"Repeated"`
	// 鉴定评价
	// example:
	//
	// 完全同一，趋于同一，和不同一
	AppraiseMessage *string `json:"appraise_message,omitempty" xml:"appraise_message,omitempty"`
	// 用户自定义字符串，系统不做处理，会在响应体中带回
	// example:
	//
	// state
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
type IotBasicUserInfo struct {
	// 租户ID
	// example:
	//
	// DWWS2D
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true"`
	// 金融云用户Id
	//
	// example:
	//
	// 12321321
	CloudUserId *string `json:"cloud_user_id,omitempty" xml:"cloud_user_id,omitempty" require:"true"`
	// 金融云平台的登录名
	//
	// example:
	//
	// xxx@alitest.com
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
	// example:
	//
	// 244
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

// 设备物模型行程统计信息
type DeviceTripProperties struct {
	// 上报时间
	// example:
	//
	// 1765794345159
	ReportTime *string `json:"report_time,omitempty" xml:"report_time,omitempty" require:"true"`
	// 1
	// example:
	//
	// 1
	PowerStatus *string `json:"power_status,omitempty" xml:"power_status,omitempty" require:"true"`
	// 1
	// example:
	//
	// 1
	EnduranceMileage *string `json:"endurance_mileage,omitempty" xml:"endurance_mileage,omitempty" require:"true"`
	// 1
	// example:
	//
	// 1
	TotalMileage *string `json:"total_mileage,omitempty" xml:"total_mileage,omitempty" require:"true"`
	// 1
	// example:
	//
	// 1
	Speed *string `json:"speed,omitempty" xml:"speed,omitempty" require:"true"`
	// 1
	// example:
	//
	// 1
	Coord *string `json:"coord,omitempty" xml:"coord,omitempty" require:"true"`
	// 1
	// example:
	//
	// 1
	Location *string `json:"location,omitempty" xml:"location,omitempty" require:"true"`
	// 1
	// example:
	//
	// 1
	Rein *string `json:"rein,omitempty" xml:"rein,omitempty" require:"true"`
	// 1
	// example:
	//
	// 1
	SpdBd *string `json:"spd_bd,omitempty" xml:"spd_bd,omitempty" require:"true"`
	// 1
	// example:
	//
	// 1
	Cs *string `json:"cs,omitempty" xml:"cs,omitempty" require:"true"`
	// 1
	// example:
	//
	// 1
	Eqst *string `json:"eqst,omitempty" xml:"eqst,omitempty" require:"true"`
}

func (s DeviceTripProperties) String() string {
	return tea.Prettify(s)
}

func (s DeviceTripProperties) GoString() string {
	return s.String()
}

func (s *DeviceTripProperties) SetReportTime(v string) *DeviceTripProperties {
	s.ReportTime = &v
	return s
}

func (s *DeviceTripProperties) SetPowerStatus(v string) *DeviceTripProperties {
	s.PowerStatus = &v
	return s
}

func (s *DeviceTripProperties) SetEnduranceMileage(v string) *DeviceTripProperties {
	s.EnduranceMileage = &v
	return s
}

func (s *DeviceTripProperties) SetTotalMileage(v string) *DeviceTripProperties {
	s.TotalMileage = &v
	return s
}

func (s *DeviceTripProperties) SetSpeed(v string) *DeviceTripProperties {
	s.Speed = &v
	return s
}

func (s *DeviceTripProperties) SetCoord(v string) *DeviceTripProperties {
	s.Coord = &v
	return s
}

func (s *DeviceTripProperties) SetLocation(v string) *DeviceTripProperties {
	s.Location = &v
	return s
}

func (s *DeviceTripProperties) SetRein(v string) *DeviceTripProperties {
	s.Rein = &v
	return s
}

func (s *DeviceTripProperties) SetSpdBd(v string) *DeviceTripProperties {
	s.SpdBd = &v
	return s
}

func (s *DeviceTripProperties) SetCs(v string) *DeviceTripProperties {
	s.Cs = &v
	return s
}

func (s *DeviceTripProperties) SetEqst(v string) *DeviceTripProperties {
	s.Eqst = &v
	return s
}

// iotbasic项目品类行业场景内容
type IotbasicCategoryIndustrySceneInfo struct {
	// 行业
	// example:
	//
	// 工业
	Industry *string `json:"industry,omitempty" xml:"industry,omitempty" require:"true"`
	// 场景
	// example:
	//
	// 智能工业
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
}

func (s IotbasicCategoryIndustrySceneInfo) String() string {
	return tea.Prettify(s)
}

func (s IotbasicCategoryIndustrySceneInfo) GoString() string {
	return s.String()
}

func (s *IotbasicCategoryIndustrySceneInfo) SetIndustry(v string) *IotbasicCategoryIndustrySceneInfo {
	s.Industry = &v
	return s
}

func (s *IotbasicCategoryIndustrySceneInfo) SetScene(v string) *IotbasicCategoryIndustrySceneInfo {
	s.Scene = &v
	return s
}

// iotbasic设备模型固定属性
type IotbasicDeviceModelFixedAttributeInfo struct {
	// 属性说明
	// example:
	//
	// name
	AttributeName *string `json:"attribute_name,omitempty" xml:"attribute_name,omitempty" require:"true"`
	// 属性名称
	// example:
	//
	// value
	AttributeValue *string `json:"attribute_value,omitempty" xml:"attribute_value,omitempty" require:"true"`
	// 数据值类型
	// 字符串：string
	// 数字：long
	// example:
	//
	// string
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty" require:"true"`
	// dataType为string时，表示数据长度最小值
	// dataType为long时，表示数据范围最小值
	DataRangeMin *int64 `json:"data_range_min,omitempty" xml:"data_range_min,omitempty" require:"true"`
	// dataType为string时，表示数据长度最大值
	// dataType为long时，表示数据范围最大值
	DataRangeMax *int64 `json:"data_range_max,omitempty" xml:"data_range_max,omitempty" require:"true"`
}

func (s IotbasicDeviceModelFixedAttributeInfo) String() string {
	return tea.Prettify(s)
}

func (s IotbasicDeviceModelFixedAttributeInfo) GoString() string {
	return s.String()
}

func (s *IotbasicDeviceModelFixedAttributeInfo) SetAttributeName(v string) *IotbasicDeviceModelFixedAttributeInfo {
	s.AttributeName = &v
	return s
}

func (s *IotbasicDeviceModelFixedAttributeInfo) SetAttributeValue(v string) *IotbasicDeviceModelFixedAttributeInfo {
	s.AttributeValue = &v
	return s
}

func (s *IotbasicDeviceModelFixedAttributeInfo) SetDataType(v string) *IotbasicDeviceModelFixedAttributeInfo {
	s.DataType = &v
	return s
}

func (s *IotbasicDeviceModelFixedAttributeInfo) SetDataRangeMin(v int64) *IotbasicDeviceModelFixedAttributeInfo {
	s.DataRangeMin = &v
	return s
}

func (s *IotbasicDeviceModelFixedAttributeInfo) SetDataRangeMax(v int64) *IotbasicDeviceModelFixedAttributeInfo {
	s.DataRangeMax = &v
	return s
}

// 批量定时控车 批次详情
type BatchJobDetail struct {
	// 批次Id
	// example:
	//
	// ""
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 批次名称
	// example:
	//
	// ""
	BatchName *string `json:"batch_name,omitempty" xml:"batch_name,omitempty"`
	// 批次状态
	// example:
	//
	// ""
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 租户Id
	// example:
	//
	// ""
	TenantId *int64 `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 触发模式
	// example:
	//
	// ""
	TriggerMode *string `json:"trigger_mode,omitempty" xml:"trigger_mode,omitempty"`
	// 定时执行时间戳
	// example:
	//
	// 1765794345159
	ScheduledTime *int64 `json:"scheduled_time,omitempty" xml:"scheduled_time,omitempty"`
	// 实际开始时间戳
	// example:
	//
	// 1765794345159
	ActualStartTime *int64 `json:"actual_start_time,omitempty" xml:"actual_start_time,omitempty"`
	// 实际结束时间戳
	// example:
	//
	// 1765794345159
	ActualEndTime *int64 `json:"actual_end_time,omitempty" xml:"actual_end_time,omitempty"`
	// 总设备数
	// example:
	//
	// 1
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 成功数
	// example:
	//
	// 1
	SuccessCount *int64 `json:"success_count,omitempty" xml:"success_count,omitempty"`
	// 失败数
	// example:
	//
	// 1
	FailedCount *int64 `json:"failed_count,omitempty" xml:"failed_count,omitempty"`
	// 操作人
	// example:
	//
	// ""
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
}

func (s BatchJobDetail) String() string {
	return tea.Prettify(s)
}

func (s BatchJobDetail) GoString() string {
	return s.String()
}

func (s *BatchJobDetail) SetBatchId(v string) *BatchJobDetail {
	s.BatchId = &v
	return s
}

func (s *BatchJobDetail) SetBatchName(v string) *BatchJobDetail {
	s.BatchName = &v
	return s
}

func (s *BatchJobDetail) SetStatus(v string) *BatchJobDetail {
	s.Status = &v
	return s
}

func (s *BatchJobDetail) SetTenantId(v int64) *BatchJobDetail {
	s.TenantId = &v
	return s
}

func (s *BatchJobDetail) SetTriggerMode(v string) *BatchJobDetail {
	s.TriggerMode = &v
	return s
}

func (s *BatchJobDetail) SetScheduledTime(v int64) *BatchJobDetail {
	s.ScheduledTime = &v
	return s
}

func (s *BatchJobDetail) SetActualStartTime(v int64) *BatchJobDetail {
	s.ActualStartTime = &v
	return s
}

func (s *BatchJobDetail) SetActualEndTime(v int64) *BatchJobDetail {
	s.ActualEndTime = &v
	return s
}

func (s *BatchJobDetail) SetTotalCount(v int64) *BatchJobDetail {
	s.TotalCount = &v
	return s
}

func (s *BatchJobDetail) SetSuccessCount(v int64) *BatchJobDetail {
	s.SuccessCount = &v
	return s
}

func (s *BatchJobDetail) SetFailedCount(v int64) *BatchJobDetail {
	s.FailedCount = &v
	return s
}

func (s *BatchJobDetail) SetOperator(v string) *BatchJobDetail {
	s.Operator = &v
	return s
}

// 行程详情
type TripDetail struct {
	// 行程id
	// example:
	//
	// T20251210140000001
	TripId *string `json:"trip_id,omitempty" xml:"trip_id,omitempty" require:"true"`
	// 开始时间
	// example:
	//
	// 1765794345159
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true"`
	// 结束时间
	// example:
	//
	// 1765794345159
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true"`
	// 行驶里程
	// example:
	//
	// 36.9
	Mileage *string `json:"mileage,omitempty" xml:"mileage,omitempty" require:"true"`
	// 单次用时
	// example:
	//
	// "duration":{ "value":"79", "unit":"h" },
	Duration *TripDuration `json:"duration,omitempty" xml:"duration,omitempty" require:"true"`
	// 最高速度
	// example:
	//
	// 86
	MaxSpeed *string `json:"max_speed,omitempty" xml:"max_speed,omitempty" require:"true"`
	// 平均速度
	// example:
	//
	// 32
	AvgSpeed *string `json:"avg_speed,omitempty" xml:"avg_speed,omitempty" require:"true"`
	// 开始地址
	// example:
	//
	// 上海市浦东新区张江高科技园区博云路
	FirstAddress *string `json:"first_address,omitempty" xml:"first_address,omitempty" require:"true"`
	// 结束地址
	// example:
	//
	// 上海市浦东新区张江高科技园区博云路
	LastAddress *string `json:"last_address,omitempty" xml:"last_address,omitempty" require:"true"`
	// 最开始定位时间
	// example:
	//
	// 1733841605000
	FirstLocationTime *int64 `json:"first_location_time,omitempty" xml:"first_location_time,omitempty" require:"true"`
	// 最后结束定位时间
	// example:
	//
	// 1733845195000
	LastLocationTime *int64 `json:"last_location_time,omitempty" xml:"last_location_time,omitempty" require:"true"`
}

func (s TripDetail) String() string {
	return tea.Prettify(s)
}

func (s TripDetail) GoString() string {
	return s.String()
}

func (s *TripDetail) SetTripId(v string) *TripDetail {
	s.TripId = &v
	return s
}

func (s *TripDetail) SetStartTime(v int64) *TripDetail {
	s.StartTime = &v
	return s
}

func (s *TripDetail) SetEndTime(v int64) *TripDetail {
	s.EndTime = &v
	return s
}

func (s *TripDetail) SetMileage(v string) *TripDetail {
	s.Mileage = &v
	return s
}

func (s *TripDetail) SetDuration(v *TripDuration) *TripDetail {
	s.Duration = v
	return s
}

func (s *TripDetail) SetMaxSpeed(v string) *TripDetail {
	s.MaxSpeed = &v
	return s
}

func (s *TripDetail) SetAvgSpeed(v string) *TripDetail {
	s.AvgSpeed = &v
	return s
}

func (s *TripDetail) SetFirstAddress(v string) *TripDetail {
	s.FirstAddress = &v
	return s
}

func (s *TripDetail) SetLastAddress(v string) *TripDetail {
	s.LastAddress = &v
	return s
}

func (s *TripDetail) SetFirstLocationTime(v int64) *TripDetail {
	s.FirstLocationTime = &v
	return s
}

func (s *TripDetail) SetLastLocationTime(v int64) *TripDetail {
	s.LastLocationTime = &v
	return s
}

// 通行证批量创建失败列表
type XrTicketPoolFailList struct {
	// 券名称
	// example:
	//
	// 券名称
	XrTicketPoolName *string `json:"xr_ticket_pool_name,omitempty" xml:"xr_ticket_pool_name,omitempty" require:"true"`
	// 资源id
	// example:
	//
	// 资源id
	ResourceId *string `json:"resource_id,omitempty" xml:"resource_id,omitempty" require:"true"`
	// 错误码
	// example:
	//
	// ok
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty" require:"true"`
	// 租户id
	// example:
	//
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 错误信息
	// example:
	//
	// 错误信息
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty" require:"true"`
	// 核销类型
	// example:
	//
	// XR_DEVICE
	XrVerificationType *string `json:"xr_verification_type,omitempty" xml:"xr_verification_type,omitempty" require:"true"`
}

func (s XrTicketPoolFailList) String() string {
	return tea.Prettify(s)
}

func (s XrTicketPoolFailList) GoString() string {
	return s.String()
}

func (s *XrTicketPoolFailList) SetXrTicketPoolName(v string) *XrTicketPoolFailList {
	s.XrTicketPoolName = &v
	return s
}

func (s *XrTicketPoolFailList) SetResourceId(v string) *XrTicketPoolFailList {
	s.ResourceId = &v
	return s
}

func (s *XrTicketPoolFailList) SetErrorCode(v string) *XrTicketPoolFailList {
	s.ErrorCode = &v
	return s
}

func (s *XrTicketPoolFailList) SetTenantId(v string) *XrTicketPoolFailList {
	s.TenantId = &v
	return s
}

func (s *XrTicketPoolFailList) SetErrorMsg(v string) *XrTicketPoolFailList {
	s.ErrorMsg = &v
	return s
}

func (s *XrTicketPoolFailList) SetXrVerificationType(v string) *XrTicketPoolFailList {
	s.XrVerificationType = &v
	return s
}

// BAI提供的OCR接口返回值
type BaiOcrResponse struct {
	// 返回的结果体
	// example:
	//
	// {"backResult":{"issue":"XXXX","endDate":"20231010","startDate":"20131010"}}
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

// 获取设备授权返回信息
type EmpowerDeviceInfo struct {
	// 设备ID
	// example:
	//
	// 00000001
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// ACCEPTED(接受)/REVOKED(撤销)
	// example:
	//
	// ACCEPTED
	AuthStatus *string `json:"auth_status,omitempty" xml:"auth_status,omitempty" require:"true"`
	// 移除授权时间，毫秒级时间戳
	// example:
	//
	// 1781690409
	RemoveTime *int64 `json:"remove_time,omitempty" xml:"remove_time,omitempty"`
}

func (s EmpowerDeviceInfo) String() string {
	return tea.Prettify(s)
}

func (s EmpowerDeviceInfo) GoString() string {
	return s.String()
}

func (s *EmpowerDeviceInfo) SetDeviceId(v string) *EmpowerDeviceInfo {
	s.DeviceId = &v
	return s
}

func (s *EmpowerDeviceInfo) SetAuthStatus(v string) *EmpowerDeviceInfo {
	s.AuthStatus = &v
	return s
}

func (s *EmpowerDeviceInfo) SetRemoveTime(v int64) *EmpowerDeviceInfo {
	s.RemoveTime = &v
	return s
}

// 溯源防伪码质检请求的请求数据
type BaiQrcodeVerifyReqData struct {
	// 二维码图片url
	// example:
	//
	// http://xxxxxx
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

// 线下场设备元素
type XrVerificationModelVo struct {
	// 核销资源生成的实例，xr设备对应设备did
	// example:
	//
	// qsdfskjes
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 生成的实例名称，xr设备就的对应的具体设备sn
	// example:
	//
	// 设备sn
	InstanceName *string `json:"instance_name,omitempty" xml:"instance_name,omitempty" require:"true"`
	// 线下场有效期
	// example:
	//
	// 2022-10-02 09:10:09
	ValidTime *string `json:"valid_time,omitempty" xml:"valid_time,omitempty" require:"true"`
	// 服务状态：INIT初始化、SERVICING服务中、PAUSED已暂停、EXPIRED停用
	// example:
	//
	// INIT
	SeviceStatus *string `json:"sevice_status,omitempty" xml:"sevice_status,omitempty" require:"true"`
	// 设备状态：INIT 初始化、ONLINE 在线、OFFLINE 离线、FAULT 故障、ACTIVATED 激活
	// example:
	//
	// ONLINE
	DeviceStatus *string `json:"device_status,omitempty" xml:"device_status,omitempty" require:"true"`
	// 唯一ID，对应线下场code
	// example:
	//
	// 唯一ID，对应线下场code
	ResourceId *string `json:"resource_id,omitempty" xml:"resource_id,omitempty" require:"true"`
	// 对应线下场名称
	// example:
	//
	// 对应线下场名称
	ResourceName *string `json:"resource_name,omitempty" xml:"resource_name,omitempty" require:"true"`
	// 核销类型
	// example:
	//
	// XR_DEVICE
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s XrVerificationModelVo) String() string {
	return tea.Prettify(s)
}

func (s XrVerificationModelVo) GoString() string {
	return s.String()
}

func (s *XrVerificationModelVo) SetInstanceId(v string) *XrVerificationModelVo {
	s.InstanceId = &v
	return s
}

func (s *XrVerificationModelVo) SetInstanceName(v string) *XrVerificationModelVo {
	s.InstanceName = &v
	return s
}

func (s *XrVerificationModelVo) SetValidTime(v string) *XrVerificationModelVo {
	s.ValidTime = &v
	return s
}

func (s *XrVerificationModelVo) SetSeviceStatus(v string) *XrVerificationModelVo {
	s.SeviceStatus = &v
	return s
}

func (s *XrVerificationModelVo) SetDeviceStatus(v string) *XrVerificationModelVo {
	s.DeviceStatus = &v
	return s
}

func (s *XrVerificationModelVo) SetResourceId(v string) *XrVerificationModelVo {
	s.ResourceId = &v
	return s
}

func (s *XrVerificationModelVo) SetResourceName(v string) *XrVerificationModelVo {
	s.ResourceName = &v
	return s
}

func (s *XrVerificationModelVo) SetType(v string) *XrVerificationModelVo {
	s.Type = &v
	return s
}

// 业务状态信息
type BizStatusInfoOp struct {
	// 业务状态类型
	// example:
	//
	// SMART_CAR_KEY
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 业务状态
	// example:
	//
	// unbound
	BizStatus *string `json:"biz_status,omitempty" xml:"biz_status,omitempty" require:"true"`
	// 时间
	// example:
	//
	// 2018-10-10 10:10:00
	OpTime *string `json:"op_time,omitempty" xml:"op_time,omitempty" require:"true"`
}

func (s BizStatusInfoOp) String() string {
	return tea.Prettify(s)
}

func (s BizStatusInfoOp) GoString() string {
	return s.String()
}

func (s *BizStatusInfoOp) SetBizType(v string) *BizStatusInfoOp {
	s.BizType = &v
	return s
}

func (s *BizStatusInfoOp) SetBizStatus(v string) *BizStatusInfoOp {
	s.BizStatus = &v
	return s
}

func (s *BizStatusInfoOp) SetOpTime(v string) *BizStatusInfoOp {
	s.OpTime = &v
	return s
}

// 实体身份注册请求结构体
type ThingsDidRegisterReq struct {
	// 业务编码，暂时保留，不需传入
	// example:
	//
	// null
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 信物链实体的所有者的分布式身份
	// example:
	//
	// "did:mychain:xxxxx"
	OwnerTenantDid *string `json:"owner_tenant_did,omitempty" xml:"owner_tenant_did,omitempty"`
	// 信物链实体附加信息 不同实体身份，有不同的json组织格式...
	// 参考
	// DeviceRegisterReqModel，
	// SpaceRegisterReqModel，
	// CorporateReqModel，
	// WarehouseReqModel，
	//
	// example:
	//
	// "附加信息"
	ThingExtraParams *string `json:"thing_extra_params,omitempty" xml:"thing_extra_params,omitempty"`
	// 原始id，租户内同一类型实体唯一
	// example:
	//
	// "租户下唯一ID"
	ThingOriginId *string `json:"thing_origin_id,omitempty" xml:"thing_origin_id,omitempty" require:"true"`
	// 实体原始名称
	// example:
	//
	// "摄像头a"
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
	// example:
	//
	// 0
	ThingType *int64 `json:"thing_type,omitempty" xml:"thing_type,omitempty" require:"true"`
	// 实体版本
	// example:
	//
	// "1.0.0"
	ThingVersion *string `json:"thing_version,omitempty" xml:"thing_version,omitempty" require:"true"`
	// 信物链实体的使用方的分布式身份列表
	// example:
	//
	// ["did:mychain:xxxx1","did:mychain:xxxx2"]
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
	// example:
	//
	// 81htq898
	CollectId *string `json:"collect_id,omitempty" xml:"collect_id,omitempty" require:"true"`
	// 错误码
	// example:
	//
	// bad_param
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 错误信息
	// example:
	//
	// 参数错误
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
	// example:
	//
	// true
	Detection *bool `json:"detection,omitempty" xml:"detection,omitempty" require:"true"`
	// 鉴定结果
	// REAL：鉴定为真
	// FAKE：鉴定为假
	// UNABLE_IDENTIFY：无法鉴定
	// example:
	//
	// REAL
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
	// example:
	//
	// REAL
	IdentificationResult *string `json:"identification_result,omitempty" xml:"identification_result,omitempty" require:"true"`
	// 辅助识别结果码
	// example:
	//
	// 700
	IdentificationCode *string `json:"identification_code,omitempty" xml:"identification_code,omitempty" require:"true"`
	// 辅助识别信息
	// example:
	//
	// 二维码不符合标准
	IdentificationMessage *string `json:"identification_message,omitempty" xml:"identification_message,omitempty" require:"true"`
	// 无法鉴定时的解决方案
	// example:
	//
	// 请重新印刷
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

// 多媒体文件
type JtMedia struct {
	// 多媒体ID
	// example:
	//
	// 123
	MediaId *string `json:"media_id,omitempty" xml:"media_id,omitempty" require:"true"`
	// 文件名称
	// example:
	//
	// xxxx.jpg
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 可访问的url
	// example:
	//
	// https://oss.com/53/85855.jpg?sign=xxx
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 上传时间
	// example:
	//
	// 1687859592688
	GmtCreate *int64 `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true"`
	// 多媒体类型枚举：IMAGE 图像；AUDIO 音频；VIDEO视频； UN_KNOW  未知；
	// example:
	//
	// IMAGE
	MediaType *string `json:"media_type,omitempty" xml:"media_type,omitempty" require:"true"`
}

func (s JtMedia) String() string {
	return tea.Prettify(s)
}

func (s JtMedia) GoString() string {
	return s.String()
}

func (s *JtMedia) SetMediaId(v string) *JtMedia {
	s.MediaId = &v
	return s
}

func (s *JtMedia) SetName(v string) *JtMedia {
	s.Name = &v
	return s
}

func (s *JtMedia) SetUrl(v string) *JtMedia {
	s.Url = &v
	return s
}

func (s *JtMedia) SetGmtCreate(v int64) *JtMedia {
	s.GmtCreate = &v
	return s
}

func (s *JtMedia) SetMediaType(v string) *JtMedia {
	s.MediaType = &v
	return s
}

// iotx行程统计
type TripStatistics struct {
	// 总里程
	// example:
	//
	// 23
	TotalMileage *string `json:"total_mileage,omitempty" xml:"total_mileage,omitempty" require:"true"`
	// 时间体
	// example:
	//
	// "totalDuration":{ "value":"79", "unit":"h" }
	TotalDuration *TripDuration `json:"total_duration,omitempty" xml:"total_duration,omitempty" require:"true"`
	// 总次数
	// example:
	//
	// 12
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty" require:"true"`
	// 时期码
	// example:
	//
	// 2
	PeriodCode *int64 `json:"period_code,omitempty" xml:"period_code,omitempty" require:"true"`
}

func (s TripStatistics) String() string {
	return tea.Prettify(s)
}

func (s TripStatistics) GoString() string {
	return s.String()
}

func (s *TripStatistics) SetTotalMileage(v string) *TripStatistics {
	s.TotalMileage = &v
	return s
}

func (s *TripStatistics) SetTotalDuration(v *TripDuration) *TripStatistics {
	s.TotalDuration = v
	return s
}

func (s *TripStatistics) SetTotalCount(v int64) *TripStatistics {
	s.TotalCount = &v
	return s
}

func (s *TripStatistics) SetPeriodCode(v int64) *TripStatistics {
	s.PeriodCode = &v
	return s
}

// 商品鉴定点检测接口响应数据
type BaiGoodsPointCheckRespData struct {
	// 图片是否有效，无效则需要提示重拍
	// example:
	//
	// true, false
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

// 批量定时任务详情
type TaskDetail struct {
	// 批次id
	// example:
	//
	// ""
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// tuid
	// example:
	//
	// ""
	Tuid *string `json:"tuid,omitempty" xml:"tuid,omitempty"`
	// device_name
	// example:
	//
	// ""
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty"`
	// 状态
	// example:
	//
	// ""
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 调用时间
	// example:
	//
	// 1765794345159
	InvokeTime *int64 `json:"invoke_time,omitempty" xml:"invoke_time,omitempty"`
	// 错误信息
	// example:
	//
	// ""
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
	// 重试次数
	// example:
	//
	// 1
	RetryCount *int64 `json:"retry_count,omitempty" xml:"retry_count,omitempty"`
}

func (s TaskDetail) String() string {
	return tea.Prettify(s)
}

func (s TaskDetail) GoString() string {
	return s.String()
}

func (s *TaskDetail) SetBatchId(v string) *TaskDetail {
	s.BatchId = &v
	return s
}

func (s *TaskDetail) SetTuid(v string) *TaskDetail {
	s.Tuid = &v
	return s
}

func (s *TaskDetail) SetDeviceName(v string) *TaskDetail {
	s.DeviceName = &v
	return s
}

func (s *TaskDetail) SetStatus(v string) *TaskDetail {
	s.Status = &v
	return s
}

func (s *TaskDetail) SetInvokeTime(v int64) *TaskDetail {
	s.InvokeTime = &v
	return s
}

func (s *TaskDetail) SetErrorMsg(v string) *TaskDetail {
	s.ErrorMsg = &v
	return s
}

func (s *TaskDetail) SetRetryCount(v int64) *TaskDetail {
	s.RetryCount = &v
	return s
}

// 事件数据领域参数
type EventSpecs struct {
	// 物模型事件ID
	// example:
	//
	// 7084744398341955584
	EventModelId *string `json:"event_model_id,omitempty" xml:"event_model_id,omitempty" require:"true"`
	// 是否返回上链HASH，缺省值按false处理
	// example:
	//
	// true, false
	ReturnHash *bool `json:"return_hash,omitempty" xml:"return_hash,omitempty"`
	// 业务数据标识
	// example:
	//
	// ORDER
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 提交日期
	// example:
	//
	// 2024-08-15
	SubmitDate *string `json:"submit_date,omitempty" xml:"submit_date,omitempty"`
	// 是否是补数据内容
	// example:
	//
	// true, false
	IsRepaired *bool `json:"is_repaired,omitempty" xml:"is_repaired,omitempty"`
}

func (s EventSpecs) String() string {
	return tea.Prettify(s)
}

func (s EventSpecs) GoString() string {
	return s.String()
}

func (s *EventSpecs) SetEventModelId(v string) *EventSpecs {
	s.EventModelId = &v
	return s
}

func (s *EventSpecs) SetReturnHash(v bool) *EventSpecs {
	s.ReturnHash = &v
	return s
}

func (s *EventSpecs) SetBizType(v string) *EventSpecs {
	s.BizType = &v
	return s
}

func (s *EventSpecs) SetSubmitDate(v string) *EventSpecs {
	s.SubmitDate = &v
	return s
}

func (s *EventSpecs) SetIsRepaired(v bool) *EventSpecs {
	s.IsRepaired = &v
	return s
}

// 数据校验失败分页查询结果
type DataVerifyFailureDataPageResponse struct {
	// 页数
	//
	// example:
	//
	// 1
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
	// 页码
	//
	// example:
	//
	// 10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 总记录数
	//
	// example:
	//
	// 100
	TotalSize *int64 `json:"total_size,omitempty" xml:"total_size,omitempty" require:"true"`
	// 总页数
	//
	// example:
	//
	// 10
	TotalPages *int64 `json:"total_pages,omitempty" xml:"total_pages,omitempty" require:"true"`
	// 数据
	// example:
	//
	// {...}
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
	// example:
	//
	// 00
	Cla *int64 `json:"cla,omitempty" xml:"cla,omitempty" require:"true"`
	//  host challenge data.
	// example:
	//
	// [0,0]
	Data []*int64 `json:"data,omitempty" xml:"data,omitempty" require:"true" type:"Repeated"`
	// private byte ins;
	// example:
	//
	// 00
	Ins *int64 `json:"ins,omitempty" xml:"ins,omitempty" require:"true"`
	//  private byte lc;
	// example:
	//
	// lc
	Lc *int64 `json:"lc,omitempty" xml:"lc,omitempty" require:"true"`
	// private byte le = (byte) 0x00;
	// example:
	//
	// 0
	Le *int64 `json:"le,omitempty" xml:"le,omitempty"`
	// private Boolean needSecurityHandle = Boolean.TRUE;
	// example:
	//
	// true, false
	NeedSecurityHandle *bool `json:"need_security_handle,omitempty" xml:"need_security_handle,omitempty"`
	// private byte p1;
	// example:
	//
	// 00
	P1 *int64 `json:"p1,omitempty" xml:"p1,omitempty" require:"true"`
	// private byte p2 = (byte) 0x00;
	// example:
	//
	// 00
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

// xr通行证批量创建请求
type XrTicketPoolBatchReq struct {
	// 资源id
	// example:
	//
	// 资源id
	ResourceId *string `json:"resource_id,omitempty" xml:"resource_id,omitempty" require:"true"`
	// 通行证有效期
	// example:
	//
	// 通行证有效期
	ValidTime *string `json:"valid_time,omitempty" xml:"valid_time,omitempty" require:"true"`
	// 体验时长
	// example:
	//
	// 60(单位分)
	TestTime *int64 `json:"test_time,omitempty" xml:"test_time,omitempty" require:"true"`
	// vr设备集合
	// example:
	//
	// json或数组
	XrApps *string `json:"xr_apps,omitempty" xml:"xr_apps,omitempty"`
	// 券池最大出票数
	// example:
	//
	// 100
	MaxPoolCount *int64 `json:"max_pool_count,omitempty" xml:"max_pool_count,omitempty" require:"true"`
	// 通行证名称
	// example:
	//
	// 通行证名称
	XrTicketPoolName *string `json:"xr_ticket_pool_name,omitempty" xml:"xr_ticket_pool_name,omitempty" require:"true"`
	// 核销类型
	// example:
	//
	// XR_DEVICE
	XrVerificationType *string `json:"xr_verification_type,omitempty" xml:"xr_verification_type,omitempty" require:"true"`
}

func (s XrTicketPoolBatchReq) String() string {
	return tea.Prettify(s)
}

func (s XrTicketPoolBatchReq) GoString() string {
	return s.String()
}

func (s *XrTicketPoolBatchReq) SetResourceId(v string) *XrTicketPoolBatchReq {
	s.ResourceId = &v
	return s
}

func (s *XrTicketPoolBatchReq) SetValidTime(v string) *XrTicketPoolBatchReq {
	s.ValidTime = &v
	return s
}

func (s *XrTicketPoolBatchReq) SetTestTime(v int64) *XrTicketPoolBatchReq {
	s.TestTime = &v
	return s
}

func (s *XrTicketPoolBatchReq) SetXrApps(v string) *XrTicketPoolBatchReq {
	s.XrApps = &v
	return s
}

func (s *XrTicketPoolBatchReq) SetMaxPoolCount(v int64) *XrTicketPoolBatchReq {
	s.MaxPoolCount = &v
	return s
}

func (s *XrTicketPoolBatchReq) SetXrTicketPoolName(v string) *XrTicketPoolBatchReq {
	s.XrTicketPoolName = &v
	return s
}

func (s *XrTicketPoolBatchReq) SetXrVerificationType(v string) *XrTicketPoolBatchReq {
	s.XrVerificationType = &v
	return s
}

// 设备管控 失败对象
type DeviceControlFail struct {
	// 设备did
	// example:
	//
	// 123
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty" require:"true"`
	// 操作失败code
	// example:
	//
	// bad_param
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 操作失败信息
	// example:
	//
	// 参数错误
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

// 通过设备注册发行时的设备参数 （与RegByDeviceIdParam的区别在于设备端有无植入蚂蚁SDK或模组）
type RegByDeviceParm struct {
	// 一般是业务上唯一的设备ID/资产编码
	//
	// example:
	//
	// 1122
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 数据模型ID
	// example:
	//
	// 7033986596836630528
	DeviceDataModelId *string `json:"device_data_model_id,omitempty" xml:"device_data_model_id,omitempty"`
	// 设备端经过蚂蚁SDK或模组初始化得到的注册信息
	// example:
	//
	// 73546f6b656e323031323131313332393235303230303033
	DeviceRegContent *string `json:"device_reg_content,omitempty" xml:"device_reg_content,omitempty" require:"true"`
	// 蚂蚁侧SDK或模组对device_reg_content的签名
	// example:
	//
	// a573546f6b656e323031323131313332393235303230303033
	DeviceRegSignature *string `json:"device_reg_signature,omitempty" xml:"device_reg_signature,omitempty" require:"true"`
	// sdk版本号，由蚂蚁侧提供
	// example:
	//
	// ma1-t1-0.1.1-00.04.54
	SdkId *string `json:"sdk_id,omitempty" xml:"sdk_id,omitempty" require:"true"`
	// 设备类型编码，联系蚂蚁侧获取设备类型编码
	//
	// example:
	//
	// 1001
	DeviceTypeCode *int64 `json:"device_type_code,omitempty" xml:"device_type_code,omitempty" require:"true"`
	// 设备单价 单位：分
	//
	// example:
	//
	// 1000
	InitialPrice *int64 `json:"initial_price,omitempty" xml:"initial_price,omitempty"`
	// 出厂时间
	//
	// example:
	//
	// 2018-10-10T10:10:00Z
	FactoryTime *string `json:"factory_time,omitempty" xml:"factory_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 投放时间
	//
	// example:
	//
	// 2018-10-10T10:10:00Z
	ReleaseTime *string `json:"release_time,omitempty" xml:"release_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 额外信息，联系蚂蚁侧获取参数格式
	//
	// example:
	//
	// {...}
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 资产所有人标识（统一社会信用代码）
	//
	// example:
	//
	// 91310101MA1FPCXA3G
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty"`
	// 资产所有人名称
	// example:
	//
	// 蚂蚁区块链科技（上海）有限公司
	OwnerName *string `json:"owner_name,omitempty" xml:"owner_name,omitempty"`
	// 设备名称/型号
	// example:
	//
	// 64.0V30AH
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty"`
	// 设备IMEI
	// example:
	//
	// 823456712312345
	DeviceImei *string `json:"device_imei,omitempty" xml:"device_imei,omitempty"`
}

func (s RegByDeviceParm) String() string {
	return tea.Prettify(s)
}

func (s RegByDeviceParm) GoString() string {
	return s.String()
}

func (s *RegByDeviceParm) SetDeviceId(v string) *RegByDeviceParm {
	s.DeviceId = &v
	return s
}

func (s *RegByDeviceParm) SetDeviceDataModelId(v string) *RegByDeviceParm {
	s.DeviceDataModelId = &v
	return s
}

func (s *RegByDeviceParm) SetDeviceRegContent(v string) *RegByDeviceParm {
	s.DeviceRegContent = &v
	return s
}

func (s *RegByDeviceParm) SetDeviceRegSignature(v string) *RegByDeviceParm {
	s.DeviceRegSignature = &v
	return s
}

func (s *RegByDeviceParm) SetSdkId(v string) *RegByDeviceParm {
	s.SdkId = &v
	return s
}

func (s *RegByDeviceParm) SetDeviceTypeCode(v int64) *RegByDeviceParm {
	s.DeviceTypeCode = &v
	return s
}

func (s *RegByDeviceParm) SetInitialPrice(v int64) *RegByDeviceParm {
	s.InitialPrice = &v
	return s
}

func (s *RegByDeviceParm) SetFactoryTime(v string) *RegByDeviceParm {
	s.FactoryTime = &v
	return s
}

func (s *RegByDeviceParm) SetReleaseTime(v string) *RegByDeviceParm {
	s.ReleaseTime = &v
	return s
}

func (s *RegByDeviceParm) SetExtraInfo(v string) *RegByDeviceParm {
	s.ExtraInfo = &v
	return s
}

func (s *RegByDeviceParm) SetOwner(v string) *RegByDeviceParm {
	s.Owner = &v
	return s
}

func (s *RegByDeviceParm) SetOwnerName(v string) *RegByDeviceParm {
	s.OwnerName = &v
	return s
}

func (s *RegByDeviceParm) SetDeviceName(v string) *RegByDeviceParm {
	s.DeviceName = &v
	return s
}

func (s *RegByDeviceParm) SetDeviceImei(v string) *RegByDeviceParm {
	s.DeviceImei = &v
	return s
}

// xr通行证券池分页返回
type XrTicketPoolItem struct {
	// 业务类型
	// example:
	//
	// XR_LEASE
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty"`
	// 通行证名称
	// example:
	//
	// 通行证名称
	XrTicketPoolName *string `json:"xr_ticket_pool_name,omitempty" xml:"xr_ticket_pool_name,omitempty"`
	// 资源id
	// example:
	//
	// 1
	ResourceId *string `json:"resource_id,omitempty" xml:"resource_id,omitempty"`
	// 有效期
	// example:
	//
	// 2022-10-02
	ValidTime *string `json:"valid_time,omitempty" xml:"valid_time,omitempty"`
	// 体验时长
	// example:
	//
	// 15(单位分钟)
	TestTime *int64 `json:"test_time,omitempty" xml:"test_time,omitempty"`
	// 通行证状态：EXPIRED：已过期  VALID：有效  SALED：已出售
	// example:
	//
	// 通行证状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 判断已发放数量>0(USED：已使用)  判断已发放数量=0(NOT_USED：未使用)
	// example:
	//
	// USED
	UseStatus *string `json:"use_status,omitempty" xml:"use_status,omitempty"`
	// 资源名称
	// example:
	//
	// 资源名称
	ResourceName *string `json:"resource_name,omitempty" xml:"resource_name,omitempty"`
	// 设备集合
	// example:
	//
	// json 或数组
	XrApps *string `json:"xr_apps,omitempty" xml:"xr_apps,omitempty"`
	// 券池最大票数
	// example:
	//
	// 133
	MaxPoolCount *int64 `json:"max_pool_count,omitempty" xml:"max_pool_count,omitempty"`
	// 租户id
	// example:
	//
	// ADSAERDS
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 核销类型
	// example:
	//
	// XR_DEVICE
	XrVerificationType *string `json:"xr_verification_type,omitempty" xml:"xr_verification_type,omitempty"`
	// 剩余可用券数量
	// example:
	//
	// 100
	SurplusCount *int64 `json:"surplus_count,omitempty" xml:"surplus_count,omitempty"`
	// 已发放数量 （总数-剩余数量）
	// example:
	//
	// 12
	IssuedCount *int64 `json:"issued_count,omitempty" xml:"issued_count,omitempty"`
}

func (s XrTicketPoolItem) String() string {
	return tea.Prettify(s)
}

func (s XrTicketPoolItem) GoString() string {
	return s.String()
}

func (s *XrTicketPoolItem) SetBizScene(v string) *XrTicketPoolItem {
	s.BizScene = &v
	return s
}

func (s *XrTicketPoolItem) SetXrTicketPoolName(v string) *XrTicketPoolItem {
	s.XrTicketPoolName = &v
	return s
}

func (s *XrTicketPoolItem) SetResourceId(v string) *XrTicketPoolItem {
	s.ResourceId = &v
	return s
}

func (s *XrTicketPoolItem) SetValidTime(v string) *XrTicketPoolItem {
	s.ValidTime = &v
	return s
}

func (s *XrTicketPoolItem) SetTestTime(v int64) *XrTicketPoolItem {
	s.TestTime = &v
	return s
}

func (s *XrTicketPoolItem) SetStatus(v string) *XrTicketPoolItem {
	s.Status = &v
	return s
}

func (s *XrTicketPoolItem) SetUseStatus(v string) *XrTicketPoolItem {
	s.UseStatus = &v
	return s
}

func (s *XrTicketPoolItem) SetResourceName(v string) *XrTicketPoolItem {
	s.ResourceName = &v
	return s
}

func (s *XrTicketPoolItem) SetXrApps(v string) *XrTicketPoolItem {
	s.XrApps = &v
	return s
}

func (s *XrTicketPoolItem) SetMaxPoolCount(v int64) *XrTicketPoolItem {
	s.MaxPoolCount = &v
	return s
}

func (s *XrTicketPoolItem) SetTenantId(v string) *XrTicketPoolItem {
	s.TenantId = &v
	return s
}

func (s *XrTicketPoolItem) SetXrVerificationType(v string) *XrTicketPoolItem {
	s.XrVerificationType = &v
	return s
}

func (s *XrTicketPoolItem) SetSurplusCount(v int64) *XrTicketPoolItem {
	s.SurplusCount = &v
	return s
}

func (s *XrTicketPoolItem) SetIssuedCount(v int64) *XrTicketPoolItem {
	s.IssuedCount = &v
	return s
}

// kyt 凭证申请参数
type KytApplyParams struct {
	// 设备类型
	// example:
	//
	// tw_car
	DeviceType *string `json:"device_type,omitempty" xml:"device_type,omitempty"`
	// 凭证类型
	// example:
	//
	// mcu_dk_cred
	CredType *string `json:"cred_type,omitempty" xml:"cred_type,omitempty"`
	// 品牌
	// example:
	//
	// JL
	BrandId *string `json:"brand_id,omitempty" xml:"brand_id,omitempty" require:"true"`
	// 凭证内容
	// example:
	//
	// []
	GenerateCode *string `json:"generate_code,omitempty" xml:"generate_code,omitempty"`
	// 协议类型
	// example:
	//
	// ble
	ProtocolType *string `json:"protocol_type,omitempty" xml:"protocol_type,omitempty" require:"true"`
	// 无感参数
	// example:
	//
	// 1
	KeyLess *string `json:"key_less,omitempty" xml:"key_less,omitempty" require:"true"`
	// mac
	// example:
	//
	// F8:5F:56:F6:05:BC
	Mac *string `json:"mac,omitempty" xml:"mac,omitempty" require:"true"`
	// ble_name
	// example:
	//
	// ble_
	BleName *string `json:"ble_name,omitempty" xml:"ble_name,omitempty" require:"true"`
	// 通道
	// example:
	//
	// DT
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty"`
}

func (s KytApplyParams) String() string {
	return tea.Prettify(s)
}

func (s KytApplyParams) GoString() string {
	return s.String()
}

func (s *KytApplyParams) SetDeviceType(v string) *KytApplyParams {
	s.DeviceType = &v
	return s
}

func (s *KytApplyParams) SetCredType(v string) *KytApplyParams {
	s.CredType = &v
	return s
}

func (s *KytApplyParams) SetBrandId(v string) *KytApplyParams {
	s.BrandId = &v
	return s
}

func (s *KytApplyParams) SetGenerateCode(v string) *KytApplyParams {
	s.GenerateCode = &v
	return s
}

func (s *KytApplyParams) SetProtocolType(v string) *KytApplyParams {
	s.ProtocolType = &v
	return s
}

func (s *KytApplyParams) SetKeyLess(v string) *KytApplyParams {
	s.KeyLess = &v
	return s
}

func (s *KytApplyParams) SetMac(v string) *KytApplyParams {
	s.Mac = &v
	return s
}

func (s *KytApplyParams) SetBleName(v string) *KytApplyParams {
	s.BleName = &v
	return s
}

func (s *KytApplyParams) SetChannel(v string) *KytApplyParams {
	s.Channel = &v
	return s
}

// 信物链证据基本组成结构体
type EvidenceBaseModel struct {
	// 业务数据
	// example:
	//
	// [{"content":"{业务数据}","label":"CRYPTO","timestamp":0}]
	BizData *string `json:"biz_data,omitempty" xml:"biz_data,omitempty"`
	// 证据哈希值
	// example:
	//
	// "证据哈希值"
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
	// 证据附属信息字段
	// example:
	//
	// "证据附属信息"
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

// 行程列表
type TripView struct {
	// 开始时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	TripBeginTime *string `json:"trip_begin_time,omitempty" xml:"trip_begin_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 结束时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	TripEndTime *string `json:"trip_end_time,omitempty" xml:"trip_end_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 行驶公里数
	// example:
	//
	// 22
	TripTotalDistance *int64 `json:"trip_total_distance,omitempty" xml:"trip_total_distance,omitempty" require:"true"`
	// 用时
	TripTime *int64 `json:"trip_time,omitempty" xml:"trip_time,omitempty" require:"true"`
}

func (s TripView) String() string {
	return tea.Prettify(s)
}

func (s TripView) GoString() string {
	return s.String()
}

func (s *TripView) SetTripBeginTime(v string) *TripView {
	s.TripBeginTime = &v
	return s
}

func (s *TripView) SetTripEndTime(v string) *TripView {
	s.TripEndTime = &v
	return s
}

func (s *TripView) SetTripTotalDistance(v int64) *TripView {
	s.TripTotalDistance = &v
	return s
}

func (s *TripView) SetTripTime(v int64) *TripView {
	s.TripTime = &v
	return s
}

// 行程统计详情
type TripTraceView struct {
	// 开始时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	BeginTime *string `json:"begin_time,omitempty" xml:"begin_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 结束时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 平均速度
	AvgSpeed *int64 `json:"avg_speed,omitempty" xml:"avg_speed,omitempty" require:"true"`
	// 最大速度
	MaxSpeed *int64 `json:"max_speed,omitempty" xml:"max_speed,omitempty" require:"true"`
	// 最后定位时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	LastLocationTime *string `json:"last_location_time,omitempty" xml:"last_location_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 最后定位地址
	// example:
	//
	// 河南省郑州市
	LastLocation *string `json:"last_location,omitempty" xml:"last_location,omitempty" require:"true"`
}

func (s TripTraceView) String() string {
	return tea.Prettify(s)
}

func (s TripTraceView) GoString() string {
	return s.String()
}

func (s *TripTraceView) SetBeginTime(v string) *TripTraceView {
	s.BeginTime = &v
	return s
}

func (s *TripTraceView) SetEndTime(v string) *TripTraceView {
	s.EndTime = &v
	return s
}

func (s *TripTraceView) SetAvgSpeed(v int64) *TripTraceView {
	s.AvgSpeed = &v
	return s
}

func (s *TripTraceView) SetMaxSpeed(v int64) *TripTraceView {
	s.MaxSpeed = &v
	return s
}

func (s *TripTraceView) SetLastLocationTime(v string) *TripTraceView {
	s.LastLocationTime = &v
	return s
}

func (s *TripTraceView) SetLastLocation(v string) *TripTraceView {
	s.LastLocation = &v
	return s
}

// tlsnotary文件认证成功后上传到oss的文件链接列表
type TlsnotaryUploadOssLinks struct {
	// 证书链摘要文件的oss链接
	// example:
	//
	// tlsnotary/{taskId}.json
	CertChainDigestLink *string `json:"cert_chain_digest_link,omitempty" xml:"cert_chain_digest_link,omitempty" require:"true"`
	// 邮件eml文件的oss链接
	// example:
	//
	// tlsnotary/{taskId}.eml
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
	// example:
	//
	// 1234567890
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
	// example:
	//
	// null
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 待更新的实体did
	// example:
	//
	// "did:iot:xxxxx"
	ThingDid *string `json:"thing_did,omitempty" xml:"thing_did,omitempty" require:"true"`
	// 更新内容，参考更新请求不同实体类型结构体，对应不同实体类型不一样
	// 信物链实体附加信息 不同实体身份，有不同的json组织格式，
	// 参考 DeviceRegisterReqModel， SpaceRegisterReqModel， CorporateReqModel， WarehouseReqModel，
	// example:
	//
	// 参考结构体
	ThingExtraParams *string `json:"thing_extra_params,omitempty" xml:"thing_extra_params,omitempty"`
	// 更新后的实体版本
	// example:
	//
	// "1.0.1"
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
	// example:
	//
	// 86F000001A51C02000000010
	LabelId *string `json:"label_id,omitempty" xml:"label_id,omitempty" require:"true"`
	// 业务资产ID，接入方自行定义
	// example:
	//
	// XXX
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 标签最近一次上链的txHash
	// example:
	//
	// 855e7ba37a0f227e384691e250f90bb2240adf11839016cf08506c9aa5c11cef
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 错误码
	// example:
	//
	// XXXX
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 错误信息
	// example:
	//
	// xxxxx
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

// iotbasic数控设备信息
type IotbasicDigitalKeyDeviceInfo struct {
	// 设备id
	// example:
	//
	// 125839
	Devid *string `json:"devid,omitempty" xml:"devid,omitempty" require:"true"`
	// 设备名称
	// example:
	//
	// 867186033894659
	DevName *string `json:"dev_name,omitempty" xml:"dev_name,omitempty" require:"true"`
	// 设备sn
	// example:
	//
	// 9726001010008SC30N96
	Sn *string `json:"sn,omitempty" xml:"sn,omitempty" require:"true"`
	// Ccid
	// example:
	//
	// 898602B1191870002179
	Ccid *string `json:"ccid,omitempty" xml:"ccid,omitempty" require:"true"`
	// Msisdn
	// example:
	//
	// 1064818313682
	Msisdn *string `json:"msisdn,omitempty" xml:"msisdn,omitempty" require:"true"`
	// tbox固件版本号(16进制)
	// example:
	//
	// 80000109
	Ver *string `json:"ver,omitempty" xml:"ver,omitempty" require:"true"`
}

func (s IotbasicDigitalKeyDeviceInfo) String() string {
	return tea.Prettify(s)
}

func (s IotbasicDigitalKeyDeviceInfo) GoString() string {
	return s.String()
}

func (s *IotbasicDigitalKeyDeviceInfo) SetDevid(v string) *IotbasicDigitalKeyDeviceInfo {
	s.Devid = &v
	return s
}

func (s *IotbasicDigitalKeyDeviceInfo) SetDevName(v string) *IotbasicDigitalKeyDeviceInfo {
	s.DevName = &v
	return s
}

func (s *IotbasicDigitalKeyDeviceInfo) SetSn(v string) *IotbasicDigitalKeyDeviceInfo {
	s.Sn = &v
	return s
}

func (s *IotbasicDigitalKeyDeviceInfo) SetCcid(v string) *IotbasicDigitalKeyDeviceInfo {
	s.Ccid = &v
	return s
}

func (s *IotbasicDigitalKeyDeviceInfo) SetMsisdn(v string) *IotbasicDigitalKeyDeviceInfo {
	s.Msisdn = &v
	return s
}

func (s *IotbasicDigitalKeyDeviceInfo) SetVer(v string) *IotbasicDigitalKeyDeviceInfo {
	s.Ver = &v
	return s
}

// 二维码识别请求
type BaiQrcodeParseReqData struct {
	// 待识别图片的url
	// example:
	//
	// http://testImage.com/xxxxx
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

// 部标设备信息
type JtDevice struct {
	// 设备ID
	// example:
	//
	// STRING 123ABC
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 场景码
	// example:
	//
	// 123ABC
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 可信设备ID
	// example:
	//
	// 7006071575276187649
	TrustiotDeviceId *int64 `json:"trustiot_device_id,omitempty" xml:"trustiot_device_id,omitempty" require:"true"`
	// 设备注册时间
	// example:
	//
	// 1686497064968
	GmtCreate *int64 `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true"`
	// 设备是否在线
	// example:
	//
	// true, false
	Online *bool `json:"online,omitempty" xml:"online,omitempty" require:"true"`
	// 设备型号
	// example:
	//
	// 丰图T8
	DeviceModel *string `json:"device_model,omitempty" xml:"device_model,omitempty"`
	// 终端型号
	// example:
	//
	// 型号A
	TerminalType *string `json:"terminal_type,omitempty" xml:"terminal_type,omitempty"`
}

func (s JtDevice) String() string {
	return tea.Prettify(s)
}

func (s JtDevice) GoString() string {
	return s.String()
}

func (s *JtDevice) SetDeviceId(v string) *JtDevice {
	s.DeviceId = &v
	return s
}

func (s *JtDevice) SetScene(v string) *JtDevice {
	s.Scene = &v
	return s
}

func (s *JtDevice) SetTrustiotDeviceId(v int64) *JtDevice {
	s.TrustiotDeviceId = &v
	return s
}

func (s *JtDevice) SetGmtCreate(v int64) *JtDevice {
	s.GmtCreate = &v
	return s
}

func (s *JtDevice) SetOnline(v bool) *JtDevice {
	s.Online = &v
	return s
}

func (s *JtDevice) SetDeviceModel(v string) *JtDevice {
	s.DeviceModel = &v
	return s
}

func (s *JtDevice) SetTerminalType(v string) *JtDevice {
	s.TerminalType = &v
	return s
}

// iotbasic ota模块信息
type IotbasicOtaModuleInfo struct {
	// OTA模块名称
	// example:
	//
	// barcodeScanner
	ModuleName *string `json:"module_name,omitempty" xml:"module_name,omitempty" require:"true"`
	// 最新版本号
	// example:
	//
	// 1.1.1
	LastVersion *string `json:"last_version,omitempty" xml:"last_version,omitempty"`
}

func (s IotbasicOtaModuleInfo) String() string {
	return tea.Prettify(s)
}

func (s IotbasicOtaModuleInfo) GoString() string {
	return s.String()
}

func (s *IotbasicOtaModuleInfo) SetModuleName(v string) *IotbasicOtaModuleInfo {
	s.ModuleName = &v
	return s
}

func (s *IotbasicOtaModuleInfo) SetLastVersion(v string) *IotbasicOtaModuleInfo {
	s.LastVersion = &v
	return s
}

// 电脑型号信息
type ComputerInfo struct {
	// 颜色
	// example:
	//
	// 红色
	Colour *string `json:"colour,omitempty" xml:"colour,omitempty"`
	// 色值
	// example:
	//
	// #BA0F2F
	ColourNumber *string `json:"colour_number,omitempty" xml:"colour_number,omitempty"`
	// 电脑型号
	// example:
	//
	// X100
	ComputerModel *string `json:"computer_model,omitempty" xml:"computer_model,omitempty"`
	// 配置参数
	// example:
	//
	// {""}
	ConfigParam *string `json:"config_param,omitempty" xml:"config_param,omitempty"`
	// 显卡
	// example:
	//
	// GTX3080
	VideoCard *string `json:"video_card,omitempty" xml:"video_card,omitempty"`
	// 屏幕
	// example:
	//
	// 27
	ScreenSize *string `json:"screen_size,omitempty" xml:"screen_size,omitempty"`
	// 电脑CPU
	// example:
	//
	// i9
	Cpu *string `json:"cpu,omitempty" xml:"cpu,omitempty" require:"true"`
	// 电脑内存
	// example:
	//
	// 16GB
	Memory *string `json:"memory,omitempty" xml:"memory,omitempty" require:"true"`
	// 电脑硬盘
	// example:
	//
	// 500GB
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
	// example:
	//
	// null
	DeviceSignature *string `json:"device_signature,omitempty" xml:"device_signature,omitempty"`
	// 暂时保留
	// example:
	//
	// null
	DeviceUid *string `json:"device_uid,omitempty" xml:"device_uid,omitempty"`
	// 不同上链方式
	// "CZ": 普通存证
	// "IOTPAY": 支付存证
	// "RAW": 文本上链
	// "TTTS": 溯源存证
	// example:
	//
	// "CZ"
	QueryType *string `json:"query_type,omitempty" xml:"query_type,omitempty" require:"true"`
	// 查询的链上交易txHash
	// example:
	//
	// "516e981c8b62c6ef08dc99b5f5165ab2a8592b5a116298788f95bbd45d0cc499"
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
	// example:
	//
	// 奢侈品
	Category *string `json:"category,omitempty" xml:"category,omitempty" require:"true"`
	// 品牌
	// example:
	//
	// GUCCI
	Brand *string `json:"brand,omitempty" xml:"brand,omitempty" require:"true"`
	// 款式
	// example:
	//
	// Gucci Diana
	Style *string `json:"style,omitempty" xml:"style,omitempty" require:"true"`
	// 商品鉴定点列表
	GoodsPoints []*BaiGoodsPoint `json:"goods_points,omitempty" xml:"goods_points,omitempty" require:"true" type:"Repeated"`
	// 用户自定义字符串，系统不做处理，会在响应体中带回
	// example:
	//
	// state
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

// iotbasic设备模型属性失败结果
type IotbasicDeviceModelAttributeFailInfo struct {
	// 型号
	// example:
	//
	// A2
	ModelValue *string `json:"model_value,omitempty" xml:"model_value,omitempty" require:"true"`
	// 规格列表 为空表示使用标准规格
	SpecsList []*string `json:"specs_list,omitempty" xml:"specs_list,omitempty" type:"Repeated"`
	// 失败code
	// example:
	//
	// code
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty" require:"true"`
	// 失败消息
	// example:
	//
	// message
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty" require:"true"`
}

func (s IotbasicDeviceModelAttributeFailInfo) String() string {
	return tea.Prettify(s)
}

func (s IotbasicDeviceModelAttributeFailInfo) GoString() string {
	return s.String()
}

func (s *IotbasicDeviceModelAttributeFailInfo) SetModelValue(v string) *IotbasicDeviceModelAttributeFailInfo {
	s.ModelValue = &v
	return s
}

func (s *IotbasicDeviceModelAttributeFailInfo) SetSpecsList(v []*string) *IotbasicDeviceModelAttributeFailInfo {
	s.SpecsList = v
	return s
}

func (s *IotbasicDeviceModelAttributeFailInfo) SetErrorCode(v string) *IotbasicDeviceModelAttributeFailInfo {
	s.ErrorCode = &v
	return s
}

func (s *IotbasicDeviceModelAttributeFailInfo) SetErrorMessage(v string) *IotbasicDeviceModelAttributeFailInfo {
	s.ErrorMessage = &v
	return s
}

// 收集数据返回的上链结果
type SendCollectorResult struct {
	// 数据的链上哈希
	// example:
	//
	// 2c952456827828cdedad06afccef75a9f2c2840cbb6b0b659f653da1e5916cb2
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 原入参的数组索引
	// example:
	//
	// 0
	OriginalIndex *int64 `json:"original_index,omitempty" xml:"original_index,omitempty" require:"true"`
	// 失败数据对应的异常码，成功时该字段为空
	// example:
	//
	// params.invalid
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 异常信息
	// example:
	//
	// 可信设备与DEVICE-ID不匹配
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
	// 返回的扩展信息
	// example:
	//
	// {"assetId":"Q02GYQGAY5","labelId":"86F000001A51A01000003836"}
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
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

func (s *SendCollectorResult) SetOriginalIndex(v int64) *SendCollectorResult {
	s.OriginalIndex = &v
	return s
}

func (s *SendCollectorResult) SetErrorCode(v string) *SendCollectorResult {
	s.ErrorCode = &v
	return s
}

func (s *SendCollectorResult) SetErrorMsg(v string) *SendCollectorResult {
	s.ErrorMsg = &v
	return s
}

func (s *SendCollectorResult) SetExtraInfo(v string) *SendCollectorResult {
	s.ExtraInfo = &v
	return s
}

// 二轮车操作日志分页查询结果
type EBikeOperationLogPageResponse struct {
	// 页数
	//
	// example:
	//
	// 1
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
	// 页码
	// example:
	//
	// 10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 总记录数
	//
	// example:
	//
	// 100
	TotalSize *int64 `json:"total_size,omitempty" xml:"total_size,omitempty" require:"true"`
	// 总页数
	//
	// example:
	//
	// 10
	TotalPages *int64 `json:"total_pages,omitempty" xml:"total_pages,omitempty" require:"true"`
	// 数据
	// example:
	//
	// {...}
	PageData []*EBikeOperationLog `json:"page_data,omitempty" xml:"page_data,omitempty" require:"true" type:"Repeated"`
}

func (s EBikeOperationLogPageResponse) String() string {
	return tea.Prettify(s)
}

func (s EBikeOperationLogPageResponse) GoString() string {
	return s.String()
}

func (s *EBikeOperationLogPageResponse) SetPageIndex(v int64) *EBikeOperationLogPageResponse {
	s.PageIndex = &v
	return s
}

func (s *EBikeOperationLogPageResponse) SetPageSize(v int64) *EBikeOperationLogPageResponse {
	s.PageSize = &v
	return s
}

func (s *EBikeOperationLogPageResponse) SetTotalSize(v int64) *EBikeOperationLogPageResponse {
	s.TotalSize = &v
	return s
}

func (s *EBikeOperationLogPageResponse) SetTotalPages(v int64) *EBikeOperationLogPageResponse {
	s.TotalPages = &v
	return s
}

func (s *EBikeOperationLogPageResponse) SetPageData(v []*EBikeOperationLog) *EBikeOperationLogPageResponse {
	s.PageData = v
	return s
}

// 指纹图片入库是否成功
type GoodsDigitalFingerprintRegisterResultData struct {
	// 指纹图片入库是否成功
	// example:
	//
	// true
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 失败原因
	// example:
	//
	// describe
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

// iotbasic设备升级列表信息
type IotbasicReleaseDeviceInfo struct {
	// 应用名称
	// example:
	//
	// 应用名称
	ApkName *string `json:"apk_name,omitempty" xml:"apk_name,omitempty" require:"true"`
	// 应用版本号
	// example:
	//
	// apkVersion
	ApkVersion *string `json:"apk_version,omitempty" xml:"apk_version,omitempty" require:"true"`
	// 工单id
	// example:
	//
	// orderId
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 工单名称
	// example:
	//
	// orderName
	OrderName *string `json:"order_name,omitempty" xml:"order_name,omitempty" require:"true"`
	// 任务id
	// example:
	//
	// taskId
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 设备升级任务唯一id
	// example:
	//
	// orderDetailId
	OrderDetailId *string `json:"order_detail_id,omitempty" xml:"order_detail_id,omitempty" require:"true"`
	// 设备sn
	// example:
	//
	// deviceSn
	DeviceSn *string `json:"device_sn,omitempty" xml:"device_sn,omitempty" require:"true"`
	// 设备id
	// example:
	//
	// deviceId
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 设备升级状态
	// 待确认：CONFIRM
	// 待推送：QUEUED
	// 已推送：NOTIFIED
	// 升级中：IN_PROGRESS
	// 升级成功：SUCCEEDED
	// 升级失败：FAILED
	// 已取消：CANCELED
	// 升级超时：TIMEOUT
	// example:
	//
	// QUEUED
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 发布时间
	// example:
	//
	// 2024-06-06 11:11:11
	ReleaseTime *string `json:"release_time,omitempty" xml:"release_time,omitempty"`
	// 升级完成时间
	// example:
	//
	// 2024-06-06 11:11:11
	UpgradeTime *string `json:"upgrade_time,omitempty" xml:"upgrade_time,omitempty"`
}

func (s IotbasicReleaseDeviceInfo) String() string {
	return tea.Prettify(s)
}

func (s IotbasicReleaseDeviceInfo) GoString() string {
	return s.String()
}

func (s *IotbasicReleaseDeviceInfo) SetApkName(v string) *IotbasicReleaseDeviceInfo {
	s.ApkName = &v
	return s
}

func (s *IotbasicReleaseDeviceInfo) SetApkVersion(v string) *IotbasicReleaseDeviceInfo {
	s.ApkVersion = &v
	return s
}

func (s *IotbasicReleaseDeviceInfo) SetOrderId(v string) *IotbasicReleaseDeviceInfo {
	s.OrderId = &v
	return s
}

func (s *IotbasicReleaseDeviceInfo) SetOrderName(v string) *IotbasicReleaseDeviceInfo {
	s.OrderName = &v
	return s
}

func (s *IotbasicReleaseDeviceInfo) SetTaskId(v string) *IotbasicReleaseDeviceInfo {
	s.TaskId = &v
	return s
}

func (s *IotbasicReleaseDeviceInfo) SetOrderDetailId(v string) *IotbasicReleaseDeviceInfo {
	s.OrderDetailId = &v
	return s
}

func (s *IotbasicReleaseDeviceInfo) SetDeviceSn(v string) *IotbasicReleaseDeviceInfo {
	s.DeviceSn = &v
	return s
}

func (s *IotbasicReleaseDeviceInfo) SetDeviceId(v string) *IotbasicReleaseDeviceInfo {
	s.DeviceId = &v
	return s
}

func (s *IotbasicReleaseDeviceInfo) SetStatus(v string) *IotbasicReleaseDeviceInfo {
	s.Status = &v
	return s
}

func (s *IotbasicReleaseDeviceInfo) SetReleaseTime(v string) *IotbasicReleaseDeviceInfo {
	s.ReleaseTime = &v
	return s
}

func (s *IotbasicReleaseDeviceInfo) SetUpgradeTime(v string) *IotbasicReleaseDeviceInfo {
	s.UpgradeTime = &v
	return s
}

// 租户项目创建请求结构体模型
type TenantProjectCreateReq struct {
	// 业务类型，默认空
	// example:
	//
	// null
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 可选的，项目关联的区块链类型，1/2/3代表存证/合约等类型
	// example:
	//
	// 1
	BlockchainType *int64 `json:"blockchain_type,omitempty" xml:"blockchain_type,omitempty"`
	// 可选的，项目关联的区块链uid
	// example:
	//
	// 1111111
	BlockchainUid *string `json:"blockchain_uid,omitempty" xml:"blockchain_uid,omitempty"`
	// 租户下唯一项目名称，用以标识项目聚合的存证等信息
	// example:
	//
	// "唯一项目名称"
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
	// example:
	//
	// 12321321
	SpecsId *int64 `json:"specs_id,omitempty" xml:"specs_id,omitempty" require:"true"`
	// 硬件模块ID
	// example:
	//
	// 12321321
	HardwareModuleId *int64 `json:"hardware_module_id,omitempty" xml:"hardware_module_id,omitempty" require:"true"`
	// 模块名称
	// example:
	//
	// 反扫头
	HardwareModuleName *string `json:"hardware_module_name,omitempty" xml:"hardware_module_name,omitempty" require:"true"`
	// 模块编码
	// example:
	//
	// REVERSE_SCANNING_HEAD
	HardwareModuleValue *string `json:"hardware_module_value,omitempty" xml:"hardware_module_value,omitempty" require:"true"`
	// 模块参数
	// example:
	//
	// {"size":102}
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

// 行程统计概览
type TripStatisticsView struct {
	// 过去七天内所有行驶记录的总里程	，单位km
	// example:
	//
	// 20km
	TotalDistance *string `json:"total_distance,omitempty" xml:"total_distance,omitempty" require:"true"`
	// 行驶总用时
	// example:
	//
	// 3
	TotalDuration *string `json:"total_duration,omitempty" xml:"total_duration,omitempty" require:"true"`
	// 骑行次数
	// example:
	//
	// 2
	TripCount *string `json:"trip_count,omitempty" xml:"trip_count,omitempty" require:"true"`
	// 最近一次行驶的里程
	// example:
	//
	// 2
	LastTripDistance *string `json:"last_trip_distance,omitempty" xml:"last_trip_distance,omitempty" require:"true"`
	// 最近一次行驶的平均速度	，单位  km/h
	// example:
	//
	// 45
	LastTripAvgSpeed *string `json:"last_trip_avg_speed,omitempty" xml:"last_trip_avg_speed,omitempty" require:"true"`
	// 最近一次行驶的最大速度
	// example:
	//
	// 50
	LastTripMaxSpeed *string `json:"last_trip_max_speed,omitempty" xml:"last_trip_max_speed,omitempty" require:"true"`
	// 最后一次行驶用时
	// example:
	//
	// 8
	LastTripSpendTime *string `json:"last_trip_spend_time,omitempty" xml:"last_trip_spend_time,omitempty" require:"true"`
}

func (s TripStatisticsView) String() string {
	return tea.Prettify(s)
}

func (s TripStatisticsView) GoString() string {
	return s.String()
}

func (s *TripStatisticsView) SetTotalDistance(v string) *TripStatisticsView {
	s.TotalDistance = &v
	return s
}

func (s *TripStatisticsView) SetTotalDuration(v string) *TripStatisticsView {
	s.TotalDuration = &v
	return s
}

func (s *TripStatisticsView) SetTripCount(v string) *TripStatisticsView {
	s.TripCount = &v
	return s
}

func (s *TripStatisticsView) SetLastTripDistance(v string) *TripStatisticsView {
	s.LastTripDistance = &v
	return s
}

func (s *TripStatisticsView) SetLastTripAvgSpeed(v string) *TripStatisticsView {
	s.LastTripAvgSpeed = &v
	return s
}

func (s *TripStatisticsView) SetLastTripMaxSpeed(v string) *TripStatisticsView {
	s.LastTripMaxSpeed = &v
	return s
}

func (s *TripStatisticsView) SetLastTripSpendTime(v string) *TripStatisticsView {
	s.LastTripSpendTime = &v
	return s
}

// 订单同步失败结果
type DeviceOrderFail struct {
	// 订单id
	// example:
	//
	// 90
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 设备did
	// example:
	//
	// asdfg
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty" require:"true"`
	// 返回code
	// example:
	//
	// Fail
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 失败
	// example:
	//
	// 返回信息
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
	// example:
	//
	// REAL
	IdentificationResult *string `json:"identification_result,omitempty" xml:"identification_result,omitempty" require:"true"`
	// 辅助识别结果码
	// example:
	//
	// 200
	IdentificationCode *string `json:"identification_code,omitempty" xml:"identification_code,omitempty"`
	// 辅助识别信息
	// example:
	//
	// 识别成功
	IdentificationMessage *string `json:"identification_message,omitempty" xml:"identification_message,omitempty"`
	// 无法识别时提示的解决方案
	// example:
	//
	// 调整焦距
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
	// example:
	//
	// XXXXX
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty" require:"true"`
	// 1.设备端上报数据内容
	// 2.与设备上报的数据一致，服务端不可修改
	// 3.解析后需与DataModel匹配
	// 4.映射 Label 对象结构化存储
	// 5.转为JSON后如果是JSONObject 映射单个 Label
	// 6.转为JSON后如果是JSONArray 映射多个 Label
	// example:
	//
	// XXXXX
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// content的签名
	// 与设备上报的签名保持一致，服务端不可修改
	// example:
	//
	// XXXXX
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
	// 未经设备签名的附加数据JSON String
	// 注意：如果 content 批量解析 ，extraData也会批量复制融入解析后的content
	// example:
	//
	// XXXXX
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

// Session 视图对象
type AgentSessionVO struct {
	// 会话ID
	// example:
	//
	// 7468486322254688256
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true"`
	// 用户ID
	// example:
	//
	// 7468486322254688256
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 会话创建时间
	// example:
	//
	// 2026-06-24 21:32:59
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 会话修改时间
	// example:
	//
	// 2026-06-24 21:32:59
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s AgentSessionVO) String() string {
	return tea.Prettify(s)
}

func (s AgentSessionVO) GoString() string {
	return s.String()
}

func (s *AgentSessionVO) SetSessionId(v string) *AgentSessionVO {
	s.SessionId = &v
	return s
}

func (s *AgentSessionVO) SetUserId(v string) *AgentSessionVO {
	s.UserId = &v
	return s
}

func (s *AgentSessionVO) SetGmtCreate(v string) *AgentSessionVO {
	s.GmtCreate = &v
	return s
}

func (s *AgentSessionVO) SetGmtModified(v string) *AgentSessionVO {
	s.GmtModified = &v
	return s
}

// 数据上链成功结果数据
type DeviceCollectResult struct {
	// 上链数据采集ID
	// example:
	//
	// j8o12u38
	CollectId *string `json:"collect_id,omitempty" xml:"collect_id,omitempty" require:"true"`
	// 上链id
	// example:
	//
	// auit98
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

// 可信设备ID及其关联的设备ID
type TrustiotDeviceIdMap struct {
	// 可信设备ID
	// example:
	//
	// 7006413673662394390
	TrustiotDeviceId *int64 `json:"trustiot_device_id,omitempty" xml:"trustiot_device_id,omitempty" require:"true"`
	// 设备ID
	// example:
	//
	// 1122
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 设备注册的上链哈希
	// example:
	//
	// ba9de337190b017ea6255bffa226ea5ed91cbb03babb42e5a35d652ca30cdce1
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty" require:"true"`
}

func (s TrustiotDeviceIdMap) String() string {
	return tea.Prettify(s)
}

func (s TrustiotDeviceIdMap) GoString() string {
	return s.String()
}

func (s *TrustiotDeviceIdMap) SetTrustiotDeviceId(v int64) *TrustiotDeviceIdMap {
	s.TrustiotDeviceId = &v
	return s
}

func (s *TrustiotDeviceIdMap) SetDeviceId(v string) *TrustiotDeviceIdMap {
	s.DeviceId = &v
	return s
}

func (s *TrustiotDeviceIdMap) SetChainDeviceId(v string) *TrustiotDeviceIdMap {
	s.ChainDeviceId = &v
	return s
}

// ProductKey分页查询结果
type ProductKeyPageResponse struct {
	// 页数
	//
	// example:
	//
	// 1
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
	// 页码
	//
	// example:
	//
	// 10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 总记录数
	//
	// example:
	//
	// 100
	TotalSize *int64 `json:"total_size,omitempty" xml:"total_size,omitempty" require:"true"`
	// 总页数
	//
	// example:
	//
	// 10
	TotalPages *int64 `json:"total_pages,omitempty" xml:"total_pages,omitempty" require:"true"`
	// 数据
	// example:
	//
	// {...}
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

// 代扣服务返回对象
type AntdigitalWithHoldResponse struct {
	// 网关返回码
	// example:
	//
	// 10000
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 网关返回码描述
	// example:
	//
	// Business Failed
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty" require:"true"`
	// 务返回码
	// example:
	//
	// ACQ.TRADE_HAS_SUCCESS
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty" require:"true"`
	// 业务返回码描述
	// example:
	//
	// 交易已被支付
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty" require:"true"`
	// 结果返回内容
	// example:
	//
	// {__}
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 响应签名
	// example:
	//
	// DZXh8eeTuAHoYE3w1J+POiPhfDxOYBfUNn1lkeT/V7P4zJdyojWEa6IZs6Hz0yDW5Cp/viufUb5I0/V5WENS3OYR8zRedqo6D+fUTdLHdc+EFyCkiQhBxIzgngPdPdfp1PIS7BdhhzrsZHbRqb7o4k3Dxc+AAnFauu4V6Zdwczo=
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
}

func (s AntdigitalWithHoldResponse) String() string {
	return tea.Prettify(s)
}

func (s AntdigitalWithHoldResponse) GoString() string {
	return s.String()
}

func (s *AntdigitalWithHoldResponse) SetCode(v string) *AntdigitalWithHoldResponse {
	s.Code = &v
	return s
}

func (s *AntdigitalWithHoldResponse) SetMsg(v string) *AntdigitalWithHoldResponse {
	s.Msg = &v
	return s
}

func (s *AntdigitalWithHoldResponse) SetSubCode(v string) *AntdigitalWithHoldResponse {
	s.SubCode = &v
	return s
}

func (s *AntdigitalWithHoldResponse) SetSubMsg(v string) *AntdigitalWithHoldResponse {
	s.SubMsg = &v
	return s
}

func (s *AntdigitalWithHoldResponse) SetData(v string) *AntdigitalWithHoldResponse {
	s.Data = &v
	return s
}

func (s *AntdigitalWithHoldResponse) SetSignature(v string) *AntdigitalWithHoldResponse {
	s.Signature = &v
	return s
}

// 二级商户信息
type SubMerchantParams struct {
	// 子商户的商户id
	// example:
	//
	// 2088123412341234
	SubMerchantId *string `json:"sub_merchant_id,omitempty" xml:"sub_merchant_id,omitempty" require:"true"`
	// 子商户的商户名称
	// example:
	//
	// 滴滴出行
	SubMerchantName *string `json:"sub_merchant_name,omitempty" xml:"sub_merchant_name,omitempty" require:"true"`
	// 子商户的服务名称
	// example:
	//
	// 滴滴出行免密支付
	SubMerchantServiceName *string `json:"sub_merchant_service_name,omitempty" xml:"sub_merchant_service_name,omitempty" require:"true"`
	// 子商户的服务描述
	// example:
	//
	// 免密付车费，单次最高500
	SubMerchantServiceDescription *string `json:"sub_merchant_service_description,omitempty" xml:"sub_merchant_service_description,omitempty" require:"true"`
}

func (s SubMerchantParams) String() string {
	return tea.Prettify(s)
}

func (s SubMerchantParams) GoString() string {
	return s.String()
}

func (s *SubMerchantParams) SetSubMerchantId(v string) *SubMerchantParams {
	s.SubMerchantId = &v
	return s
}

func (s *SubMerchantParams) SetSubMerchantName(v string) *SubMerchantParams {
	s.SubMerchantName = &v
	return s
}

func (s *SubMerchantParams) SetSubMerchantServiceName(v string) *SubMerchantParams {
	s.SubMerchantServiceName = &v
	return s
}

func (s *SubMerchantParams) SetSubMerchantServiceDescription(v string) *SubMerchantParams {
	s.SubMerchantServiceDescription = &v
	return s
}

// 上链数据结果集
type ChainModelResult struct {
	// 所属业务
	// example:
	//
	// XR_LEASE
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
	// 资产类型
	// example:
	//
	// LOCK_RECORD
	DataScene *string `json:"data_scene,omitempty" xml:"data_scene,omitempty" require:"true"`
	// 资产id
	// example:
	//
	// 资产id
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 资产数据内容json
	// example:
	//
	// {}
	AssetData *string `json:"asset_data,omitempty" xml:"asset_data,omitempty" require:"true"`
	// 租户id
	// example:
	//
	// SDFJAG
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 上链时间
	// example:
	//
	// 2022-10-02 09:10:09
	TxTime *string `json:"tx_time,omitempty" xml:"tx_time,omitempty" require:"true"`
	// 业务ID
	// example:
	//
	// 业务ID
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty" require:"true"`
	// 上链id
	// example:
	//
	// 123
	AntchainId *string `json:"antchain_id,omitempty" xml:"antchain_id,omitempty" require:"true"`
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

func (s *ChainModelResult) SetAntchainId(v string) *ChainModelResult {
	s.AntchainId = &v
	return s
}

// 空间实体身份附加参数请求结构体，应用在注册/更新API的ThingExtraParams
type SpaceRegisterReqModel struct {
	// 面积 平方米单位*1e4
	// example:
	//
	// 10000
	Area *int64 `json:"area,omitempty" xml:"area,omitempty"`
	// 自定义业务类型，例如选择：危险品/非危险品/食品
	// example:
	//
	// "biz_type"
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 海拔 米单位*1e2
	// example:
	//
	// 0
	Elevation *int64 `json:"elevation,omitempty" xml:"elevation,omitempty"`
	// 高度 米单位*1e2
	// example:
	//
	// 123
	Height *int64 `json:"height,omitempty" xml:"height,omitempty"`
	// 纬度 度数单位*1e9
	// example:
	//
	// 0
	Latitude *int64 `json:"latitude,omitempty" xml:"latitude,omitempty"`
	// 经度 度数单位*1e9
	// example:
	//
	// 35000000000
	Longitude *int64 `json:"longitude,omitempty" xml:"longitude,omitempty"`
	// 自定义其他字段
	// example:
	//
	// "自定义"
	OtherInfo *string `json:"other_info,omitempty" xml:"other_info,omitempty"`
	// 父类型，在业务中自定义关联，例如仓位的父节点是仓库
	// example:
	//
	// “did:iot:xxxx”
	ParentDid *string `json:"parent_did,omitempty" xml:"parent_did,omitempty"`
	// 可填入符合w3c did定义的服务节点
	// example:
	//
	// "xxxx"
	ServiceEndpoint *string `json:"service_endpoint,omitempty" xml:"service_endpoint,omitempty"`
	// 空间状态，自定义
	// example:
	//
	// "IN_USE"
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 空间类型，例如冷藏/冷冻/通道/平面/立体
	// example:
	//
	// “平面“
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

// xr用户通行证分页结果信息
type XrUserTicketPageInfo struct {
	// 用户id
	// example:
	//
	// 2088**
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 用户通行证编码
	// example:
	//
	// 2739875205
	XrTicketCode *string `json:"xr_ticket_code,omitempty" xml:"xr_ticket_code,omitempty" require:"true"`
	// xr通行证资源池名称
	// example:
	//
	// 资源池001
	XrTicketPoolName *string `json:"xr_ticket_pool_name,omitempty" xml:"xr_ticket_pool_name,omitempty" require:"true"`
	// 资源名称
	// example:
	//
	// 资源001
	ResourceName *string `json:"resource_name,omitempty" xml:"resource_name,omitempty" require:"true"`
	// 用户通行证状态
	// example:
	//
	// VALID
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 有效期
	// example:
	//
	// 2023-04-06
	ValidTime *string `json:"valid_time,omitempty" xml:"valid_time,omitempty" require:"true"`
	// 所属业务
	// example:
	//
	// XR_LEASE
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
	// 租户id
	// example:
	//
	// QWERTYUI
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 核销类型
	// example:
	//
	// XR_DEVICE
	XrVerificationType *string `json:"xr_verification_type,omitempty" xml:"xr_verification_type,omitempty" require:"true"`
}

func (s XrUserTicketPageInfo) String() string {
	return tea.Prettify(s)
}

func (s XrUserTicketPageInfo) GoString() string {
	return s.String()
}

func (s *XrUserTicketPageInfo) SetUserId(v string) *XrUserTicketPageInfo {
	s.UserId = &v
	return s
}

func (s *XrUserTicketPageInfo) SetXrTicketCode(v string) *XrUserTicketPageInfo {
	s.XrTicketCode = &v
	return s
}

func (s *XrUserTicketPageInfo) SetXrTicketPoolName(v string) *XrUserTicketPageInfo {
	s.XrTicketPoolName = &v
	return s
}

func (s *XrUserTicketPageInfo) SetResourceName(v string) *XrUserTicketPageInfo {
	s.ResourceName = &v
	return s
}

func (s *XrUserTicketPageInfo) SetStatus(v string) *XrUserTicketPageInfo {
	s.Status = &v
	return s
}

func (s *XrUserTicketPageInfo) SetValidTime(v string) *XrUserTicketPageInfo {
	s.ValidTime = &v
	return s
}

func (s *XrUserTicketPageInfo) SetBizScene(v string) *XrUserTicketPageInfo {
	s.BizScene = &v
	return s
}

func (s *XrUserTicketPageInfo) SetTenantId(v string) *XrUserTicketPageInfo {
	s.TenantId = &v
	return s
}

func (s *XrUserTicketPageInfo) SetXrVerificationType(v string) *XrUserTicketPageInfo {
	s.XrVerificationType = &v
	return s
}

// 标签流转历史
type LabelTrace struct {
	// 操作内容
	// example:
	//
	// XXXXX
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 链上哈希
	// example:
	//
	// XXXXX
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 上链时间
	// example:
	//
	// XXXXX
	TxTime *string `json:"tx_time,omitempty" xml:"tx_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 上链失败的错误码
	// example:
	//
	// XXXXX
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 上链失败的错误信息
	// example:
	//
	// XXXXX
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
	// 是否上链成功
	// example:
	//
	// true, false
	IsSuccess *bool `json:"is_success,omitempty" xml:"is_success,omitempty"`
	// 标签对应资产版本号
	// example:
	//
	// 1
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
	// example:
	//
	// 123
	PeripheralId *string `json:"peripheral_id,omitempty" xml:"peripheral_id,omitempty" require:"true"`
	// 数据模型id
	//
	// example:
	//
	// 123456
	PeripheralDataModelId *string `json:"peripheral_data_model_id,omitempty" xml:"peripheral_data_model_id,omitempty" require:"true"`
	// 场景码
	//
	// example:
	//
	// scene1
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 外围设备名称
	//
	// example:
	//
	// 锂电池1
	PeripheralName *string `json:"peripheral_name,omitempty" xml:"peripheral_name,omitempty"`
	// 厂商名称
	//
	// example:
	//
	// 宁德时代1
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty"`
	// 链上外围设备Id
	//
	// example:
	//
	// 123123
	ChainPeripheralId *string `json:"chain_peripheral_id,omitempty" xml:"chain_peripheral_id,omitempty" require:"true"`
	// 链上哈希
	// example:
	//
	// txhash123
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 上链时间
	// example:
	//
	// 1605076751000
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
	// example:
	//
	// 3000
	DeviceTypeCode *int64 `json:"device_type_code,omitempty" xml:"device_type_code,omitempty" require:"true"`
	// 单价，单位分
	// example:
	//
	// 1000
	InitialPrice *int64 `json:"initial_price,omitempty" xml:"initial_price,omitempty" require:"true"`
	// 出厂时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	FactoryTime *string `json:"factory_time,omitempty" xml:"factory_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 投放时间
	// example:
	//
	// 2018-10-10T10:10:00Z
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
	// example:
	//
	// 208395
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 时间戳，取订单上链timestamp字段
	// example:
	//
	// 1665490037182
	OrderCollectTime *string `json:"order_collect_time,omitempty" xml:"order_collect_time,omitempty" require:"true"`
	// 订单总金额
	// example:
	//
	// 12000.37
	TotalAmount *string `json:"total_amount,omitempty" xml:"total_amount,omitempty" require:"true"`
	// 租户id
	// example:
	//
	// 1
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

// 证书授权信息查询结果
type SkuGrantStockInfoResp struct {
	// 产品型号
	// example:
	//
	// TEST-MODEL-0001
	ProductModel *string `json:"product_model,omitempty" xml:"product_model,omitempty"`
	// 产品形式，取值范围： SOFTWARE_HARDWARE：软硬一体（SE方案）, SOFTWARE：纯软（非SE方案）
	// example:
	//
	// SOFTWARE_HARDWARE
	ProductForm *string `json:"product_form,omitempty" xml:"product_form,omitempty"`
	// 凭证种类列表，取值范围： ["PAYMENT"]：支付码， ["PAYMENT","TRANSIT"]：支付码+乘车码
	// example:
	//
	// ["PAYMENT"]
	Features []*string `json:"features,omitempty" xml:"features,omitempty" type:"Repeated"`
	// 授权数量(指当前证书凭证种类下未消耗的证书数量)
	// example:
	//
	// 10
	CertNum *int64 `json:"cert_num,omitempty" xml:"cert_num,omitempty"`
}

func (s SkuGrantStockInfoResp) String() string {
	return tea.Prettify(s)
}

func (s SkuGrantStockInfoResp) GoString() string {
	return s.String()
}

func (s *SkuGrantStockInfoResp) SetProductModel(v string) *SkuGrantStockInfoResp {
	s.ProductModel = &v
	return s
}

func (s *SkuGrantStockInfoResp) SetProductForm(v string) *SkuGrantStockInfoResp {
	s.ProductForm = &v
	return s
}

func (s *SkuGrantStockInfoResp) SetFeatures(v []*string) *SkuGrantStockInfoResp {
	s.Features = v
	return s
}

func (s *SkuGrantStockInfoResp) SetCertNum(v int64) *SkuGrantStockInfoResp {
	s.CertNum = &v
	return s
}

// 订单同步成功列表
type DeviceOrderResult struct {
	// 上链id
	// example:
	//
	// amdfgs
	AntchainId *string `json:"antchain_id,omitempty" xml:"antchain_id,omitempty" require:"true"`
	// 订单id
	// example:
	//
	// 34
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

// 物模型事件VO
type ThingModelEventVO struct {
	// 名称
	// example:
	//
	// 设备状态数据
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 物模型功能Id
	// example:
	//
	// 7067312861108285440
	FeatureId *string `json:"feature_id,omitempty" xml:"feature_id,omitempty" require:"true"`
	// 业务标识
	// example:
	//
	// LOCATION
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 事件属性列表
	// example:
	//
	// [...]
	EventProperties *string `json:"event_properties,omitempty" xml:"event_properties,omitempty" require:"true"`
}

func (s ThingModelEventVO) String() string {
	return tea.Prettify(s)
}

func (s ThingModelEventVO) GoString() string {
	return s.String()
}

func (s *ThingModelEventVO) SetName(v string) *ThingModelEventVO {
	s.Name = &v
	return s
}

func (s *ThingModelEventVO) SetFeatureId(v string) *ThingModelEventVO {
	s.FeatureId = &v
	return s
}

func (s *ThingModelEventVO) SetBizType(v string) *ThingModelEventVO {
	s.BizType = &v
	return s
}

func (s *ThingModelEventVO) SetEventProperties(v string) *ThingModelEventVO {
	s.EventProperties = &v
	return s
}

// 设备注册结果对象
type IotBasicDeviceRegisterResult struct {
	// 设备did
	// example:
	//
	// did:private:12dsadadadf
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty" require:"true"`
	// 设备密钥
	// example:
	//
	// 12321321
	PrivateKey *string `json:"private_key,omitempty" xml:"private_key,omitempty" require:"true"`
	// 设备名称
	// example:
	//
	// test
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty" require:"true"`
	// 设备sn
	// example:
	//
	// 12321321
	DeviceSn *string `json:"device_sn,omitempty" xml:"device_sn,omitempty" require:"true"`
	// 设备认证密钥密文，需要下发安全认证SDK完成设备激活
	// example:
	//
	// 123
	SecKey *string `json:"sec_key,omitempty" xml:"sec_key,omitempty"`
	// 设备认证密钥状态
	// example:
	//
	// servicing
	ServiceStatus *string `json:"service_status,omitempty" xml:"service_status,omitempty"`
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

func (s *IotBasicDeviceRegisterResult) SetSecKey(v string) *IotBasicDeviceRegisterResult {
	s.SecKey = &v
	return s
}

func (s *IotBasicDeviceRegisterResult) SetServiceStatus(v string) *IotBasicDeviceRegisterResult {
	s.ServiceStatus = &v
	return s
}

// iotbasic设备模型属性
type IotbasicDeviceModelAttributeInfo struct {
	// 型号
	// example:
	//
	// A2
	ModelValue *string `json:"model_value,omitempty" xml:"model_value,omitempty" require:"true"`
	// 规格列表
	// 为空表示使用标准规格
	SpecsList []*string `json:"specs_list,omitempty" xml:"specs_list,omitempty" type:"Repeated"`
}

func (s IotbasicDeviceModelAttributeInfo) String() string {
	return tea.Prettify(s)
}

func (s IotbasicDeviceModelAttributeInfo) GoString() string {
	return s.String()
}

func (s *IotbasicDeviceModelAttributeInfo) SetModelValue(v string) *IotbasicDeviceModelAttributeInfo {
	s.ModelValue = &v
	return s
}

func (s *IotbasicDeviceModelAttributeInfo) SetSpecsList(v []*string) *IotbasicDeviceModelAttributeInfo {
	s.SpecsList = v
	return s
}

// 信物链实体身份注册请求结构体
type ThingsDidBaseRegisterRequest struct {
	// 信物链实体的所有者的分布式身份
	// example:
	//
	// "did:mychain:6c9f6cde4f63103d25ab1d9893242547a8518d8f51bff1a9da44e4f8537a9816"
	OwnerTenantDid *string `json:"owner_tenant_did,omitempty" xml:"owner_tenant_did,omitempty"`
	// 信物链实体的使用方的分布式身份列表
	// example:
	//
	// ["did:mychain:xxxx1","did:mychain:xxxx2"]
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
	// example:
	//
	// "DID_TYPE_DEVICE_ALIYUN"
	ThingType *string `json:"thing_type,omitempty" xml:"thing_type,omitempty" require:"true"`
	// 原始id，租户内同一类型实体唯一
	// example:
	//
	// "aaaa123"
	ThingOriginId *string `json:"thing_origin_id,omitempty" xml:"thing_origin_id,omitempty" require:"true"`
	// 实体原始名称
	// example:
	//
	// "摄像头a11"
	ThingOriginName *string `json:"thing_origin_name,omitempty" xml:"thing_origin_name,omitempty" require:"true"`
	// 实体版本
	// example:
	//
	// "1.0.0"
	ThingVersion *string `json:"thing_version,omitempty" xml:"thing_version,omitempty" require:"true"`
	// 业务编码
	// example:
	//
	// null
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 信物链实体附加信息
	// 不同实体身份，有不同的json组织格式，参考另外技术文档
	// example:
	//
	// "附加信息"
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
	// example:
	//
	// 1
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
	// 页码
	//
	// example:
	//
	// 10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 总记录数
	//
	// example:
	//
	// 100
	TotalSize *int64 `json:"total_size,omitempty" xml:"total_size,omitempty" require:"true"`
	// 总页数
	//
	// example:
	//
	// 10
	TotalPages *int64 `json:"total_pages,omitempty" xml:"total_pages,omitempty" require:"true"`
	// 数据
	// example:
	//
	// {...}
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
	// example:
	//
	// 1
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
	// 页码
	//
	// example:
	//
	// 10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 总记录数
	//
	// example:
	//
	// 100
	TotalSize *int64 `json:"total_size,omitempty" xml:"total_size,omitempty" require:"true"`
	// 总页数
	//
	// example:
	//
	// 10
	TotalPages *int64 `json:"total_pages,omitempty" xml:"total_pages,omitempty" require:"true"`
	// 数据
	// example:
	//
	// {...}
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

// 产线压测任务对象
type OnlinePressureTestTask struct {
	// DATE
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	//
	// example:
	//
	// 2018-10-10T10:10:00Z
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 产线场景码
	//
	// example:
	//
	// MAYI-0001
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 压测的目标设备可信信根设备的唯一标识，JSONArray字符串
	//
	// example:
	//
	// [ {"componentId": "864964060327592"} {"componentId": "864964060327592"} ]
	ComponentIdList *string `json:"component_id_list,omitempty" xml:"component_id_list,omitempty" require:"true"`
	// 客户侧的压测报告
	//
	// example:
	//
	// [ { "name":"流量消耗", "consumption":"100KB", "asExpected":true }, { "name":"功耗", "consumption":"25mA", "asExpected":true }, { "name":"OTA升级" "asExpected":true } ] }
	CustomerPtReport *string `json:"customer_pt_report,omitempty" xml:"customer_pt_report,omitempty"`
	// 压测开始时间
	//
	// example:
	//
	// 2018-10-10T10:10:00Z
	PtStartTime *string `json:"pt_start_time,omitempty" xml:"pt_start_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 压测结束时间
	//
	// example:
	//
	// 2018-10-10T10:10:00Z
	PtEndTime *string `json:"pt_end_time,omitempty" xml:"pt_end_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// RUNNING: 正在执行 SUCCESS : 测试通过 FAILED : 测试不通过
	//
	// example:
	//
	// RUNNING
	PtStatus *string `json:"pt_status,omitempty" xml:"pt_status,omitempty" require:"true"`
	// 关联SIT环境的工单ID
	//
	// example:
	//
	// 1122
	WorkOrderId *string `json:"work_order_id,omitempty" xml:"work_order_id,omitempty"`
	// 关联SIT环境的项目ID
	//
	// example:
	//
	// 11223344
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 产线压测任务ID
	// example:
	//
	// 11223344566
	PtTaskId *string `json:"pt_task_id,omitempty" xml:"pt_task_id,omitempty" require:"true"`
	// 压测不通过的原因
	// example:
	//
	// 数据验签失败
	FailureReason *string `json:"failure_reason,omitempty" xml:"failure_reason,omitempty" require:"true"`
	// 拓展信息
	// example:
	//
	// {...}
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
}

func (s OnlinePressureTestTask) String() string {
	return tea.Prettify(s)
}

func (s OnlinePressureTestTask) GoString() string {
	return s.String()
}

func (s *OnlinePressureTestTask) SetGmtCreate(v string) *OnlinePressureTestTask {
	s.GmtCreate = &v
	return s
}

func (s *OnlinePressureTestTask) SetGmtModified(v string) *OnlinePressureTestTask {
	s.GmtModified = &v
	return s
}

func (s *OnlinePressureTestTask) SetScene(v string) *OnlinePressureTestTask {
	s.Scene = &v
	return s
}

func (s *OnlinePressureTestTask) SetComponentIdList(v string) *OnlinePressureTestTask {
	s.ComponentIdList = &v
	return s
}

func (s *OnlinePressureTestTask) SetCustomerPtReport(v string) *OnlinePressureTestTask {
	s.CustomerPtReport = &v
	return s
}

func (s *OnlinePressureTestTask) SetPtStartTime(v string) *OnlinePressureTestTask {
	s.PtStartTime = &v
	return s
}

func (s *OnlinePressureTestTask) SetPtEndTime(v string) *OnlinePressureTestTask {
	s.PtEndTime = &v
	return s
}

func (s *OnlinePressureTestTask) SetPtStatus(v string) *OnlinePressureTestTask {
	s.PtStatus = &v
	return s
}

func (s *OnlinePressureTestTask) SetWorkOrderId(v string) *OnlinePressureTestTask {
	s.WorkOrderId = &v
	return s
}

func (s *OnlinePressureTestTask) SetProjectId(v string) *OnlinePressureTestTask {
	s.ProjectId = &v
	return s
}

func (s *OnlinePressureTestTask) SetPtTaskId(v string) *OnlinePressureTestTask {
	s.PtTaskId = &v
	return s
}

func (s *OnlinePressureTestTask) SetFailureReason(v string) *OnlinePressureTestTask {
	s.FailureReason = &v
	return s
}

func (s *OnlinePressureTestTask) SetExtraInfo(v string) *OnlinePressureTestTask {
	s.ExtraInfo = &v
	return s
}

// 客户对应设备
type CustomerDeviceItem struct {
	// id
	// example:
	//
	// 1
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 租户id
	// example:
	//
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 账号id
	// example:
	//
	// 账号id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	//  设备品类-型号-规格
	// example:
	//
	//  设备品类-型号-规格
	DeviceType *string `json:"device_type,omitempty" xml:"device_type,omitempty" require:"true"`
	// 设备sn
	// example:
	//
	// SN
	DeviceSn *string `json:"device_sn,omitempty" xml:"device_sn,omitempty" require:"true"`
	// 设备did
	// example:
	//
	// dasdf
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty" require:"true"`
	// 服务有效期
	// example:
	//
	// 服务有效期
	ValideTime *string `json:"valide_time,omitempty" xml:"valide_time,omitempty" require:"true"`
	// 设备状态
	// example:
	//
	// INIT
	DeviceStatus *string `json:"device_status,omitempty" xml:"device_status,omitempty" require:"true"`
	// 服务状态
	// example:
	//
	// INIT
	ServiceStatus *string `json:"service_status,omitempty" xml:"service_status,omitempty" require:"true"`
	// 屏幕状态 开屏、锁屏
	// example:
	//
	// 屏幕状态
	ScreenStatus *string `json:"screen_status,omitempty" xml:"screen_status,omitempty"`
}

func (s CustomerDeviceItem) String() string {
	return tea.Prettify(s)
}

func (s CustomerDeviceItem) GoString() string {
	return s.String()
}

func (s *CustomerDeviceItem) SetId(v int64) *CustomerDeviceItem {
	s.Id = &v
	return s
}

func (s *CustomerDeviceItem) SetTenantId(v string) *CustomerDeviceItem {
	s.TenantId = &v
	return s
}

func (s *CustomerDeviceItem) SetAccountId(v string) *CustomerDeviceItem {
	s.AccountId = &v
	return s
}

func (s *CustomerDeviceItem) SetDeviceType(v string) *CustomerDeviceItem {
	s.DeviceType = &v
	return s
}

func (s *CustomerDeviceItem) SetDeviceSn(v string) *CustomerDeviceItem {
	s.DeviceSn = &v
	return s
}

func (s *CustomerDeviceItem) SetDeviceDid(v string) *CustomerDeviceItem {
	s.DeviceDid = &v
	return s
}

func (s *CustomerDeviceItem) SetValideTime(v string) *CustomerDeviceItem {
	s.ValideTime = &v
	return s
}

func (s *CustomerDeviceItem) SetDeviceStatus(v string) *CustomerDeviceItem {
	s.DeviceStatus = &v
	return s
}

func (s *CustomerDeviceItem) SetServiceStatus(v string) *CustomerDeviceItem {
	s.ServiceStatus = &v
	return s
}

func (s *CustomerDeviceItem) SetScreenStatus(v string) *CustomerDeviceItem {
	s.ScreenStatus = &v
	return s
}

// 部标数据查询接口中返回的聚合统计指标结构体
type JtExtraData struct {
	// 查询的时间范围内的行驶总里程
	// example:
	//
	// 312
	DeltaMileage *int64 `json:"delta_mileage,omitempty" xml:"delta_mileage,omitempty" require:"true"`
	// 最大车速
	// example:
	//
	// 60
	MaxSpeed *int64 `json:"max_speed,omitempty" xml:"max_speed,omitempty" require:"true"`
	// 平均车速
	// example:
	//
	// 60
	AvgSpeed *int64 `json:"avg_speed,omitempty" xml:"avg_speed,omitempty" require:"true"`
}

func (s JtExtraData) String() string {
	return tea.Prettify(s)
}

func (s JtExtraData) GoString() string {
	return s.String()
}

func (s *JtExtraData) SetDeltaMileage(v int64) *JtExtraData {
	s.DeltaMileage = &v
	return s
}

func (s *JtExtraData) SetMaxSpeed(v int64) *JtExtraData {
	s.MaxSpeed = &v
	return s
}

func (s *JtExtraData) SetAvgSpeed(v int64) *JtExtraData {
	s.AvgSpeed = &v
	return s
}

// 信物链实体查询返回的数据结构，对应数据表字段
type DidBaseQueryResp struct {
	// 授权水平，0-默认关联授权
	// example:
	//
	// 0
	AuthLevel *int64 `json:"auth_level,omitempty" xml:"auth_level,omitempty"`
	// 证书公钥，特定实体可查询
	// example:
	//
	// ""
	CertPublicKey *string `json:"cert_public_key,omitempty" xml:"cert_public_key,omitempty"`
	// 证书文本，特定实体可以查询
	// example:
	//
	// “”
	CertText *string `json:"cert_text,omitempty" xml:"cert_text,omitempty"`
	// DID扩展，设备/企业组织/仓库/空间的解析同ThingExtraParams
	// example:
	//
	// ""
	DidExtension *string `json:"did_extension,omitempty" xml:"did_extension,omitempty"`
	// did公钥，特定w3c did实体可查询
	// example:
	//
	// ""
	DidPublicKey *string `json:"did_public_key,omitempty" xml:"did_public_key,omitempty"`
	// DID用户名，w3c did实体可查询
	// example:
	//
	// ""
	DidUsername *string `json:"did_username,omitempty" xml:"did_username,omitempty"`
	// 所有者DID
	// example:
	//
	// "did:iot:xxxxx"
	OwnerDid *string `json:"owner_did,omitempty" xml:"owner_did,omitempty"`
	// 实体附属空间列表，例如仓库下属库位，设备关联库位等
	// example:
	//
	// ["",""]
	SpacesAttached []*string `json:"spaces_attached,omitempty" xml:"spaces_attached,omitempty" type:"Repeated"`
	// 实体附属实体列表，例如空间关联设备列表
	// example:
	//
	// ["",""]
	ThingsAttached []*string `json:"things_attached,omitempty" xml:"things_attached,omitempty" type:"Repeated"`
	// 实体属性，在阿里云iot设备，对应三元组
	// example:
	//
	// ",,"
	ThingAttribute *string `json:"thing_attribute,omitempty" xml:"thing_attribute,omitempty"`
	// 原始ID
	// example:
	//
	// "原始ID"
	ThingId *string `json:"thing_id,omitempty" xml:"thing_id,omitempty"`
	// 实体物模型id
	// example:
	//
	// ""
	ThingModelId *string `json:"thing_model_id,omitempty" xml:"thing_model_id,omitempty"`
	// 服务端点，可实现w3c service endpoint
	// example:
	//
	// ""
	ThingServiceEndpoint *string `json:"thing_service_endpoint,omitempty" xml:"thing_service_endpoint,omitempty"`
	// 设备状态需要是通过 updateStatus api更新，
	// 其他状态通过updateThingsDid api更新
	// example:
	//
	// 实体状态
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
	// example:
	//
	// 0
	ThingType *int64 `json:"thing_type,omitempty" xml:"thing_type,omitempty"`
	// 实体版本
	// example:
	//
	// "1.0.0"
	ThingVersion *string `json:"thing_version,omitempty" xml:"thing_version,omitempty"`
	// 使用者DID列表
	// example:
	//
	// ["did:iot:xxxxx","did:iot:yyyyy"]
	UserDidList []*string `json:"user_did_list,omitempty" xml:"user_did_list,omitempty" type:"Repeated"`
	// 查询的did
	// example:
	//
	// "did:iot:xxxx"
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

// 要素信息
type AssetElementInfo struct {
	// 项目ID
	// example:
	//
	// 112233
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 要素ID
	// example:
	//
	// 112233
	ElementId *string `json:"element_id,omitempty" xml:"element_id,omitempty" require:"true"`
	// 要素名称
	// example:
	//
	// 注册要素
	ElementName *string `json:"element_name,omitempty" xml:"element_name,omitempty"`
	// 要素类型
	// example:
	//
	// 资产要素
	ElementType *string `json:"element_type,omitempty" xml:"element_type,omitempty" require:"true"`
	// 数据来源渠道， 物理要素非必填；数据要素必填；
	// example:
	//
	// MAAS
	FromType *string `json:"from_type,omitempty" xml:"from_type,omitempty"`
	// 平台领域类型， 物理要素非必填；数据要素必填；
	// example:
	//
	// COLLECT_BIZ_DATA
	DataElementType *string `json:"data_element_type,omitempty" xml:"data_element_type,omitempty"`
	// 属性列表， 物理要素非必填；数据要素必填；
	// example:
	//
	// [{...},{...}]
	PropertyList *string `json:"property_list,omitempty" xml:"property_list,omitempty"`
	// 数据上报频率
	// example:
	//
	// {...}
	Frequency *string `json:"frequency,omitempty" xml:"frequency,omitempty"`
	// 物理要素类型码，包含iot和资管的
	// example:
	//
	// {"iot":[23001], "tap":[1201]}
	PhysicsElementTypeCode *string `json:"physics_element_type_code,omitempty" xml:"physics_element_type_code,omitempty" require:"true"`
	// 业务类型
	// example:
	//
	// ORDER
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 该要素的存储位置， index代表数据流转顺序，location为库表/logstore名称，remark备注
	// example:
	//
	// {...}
	PersistentLocation *string `json:"persistent_location,omitempty" xml:"persistent_location,omitempty"`
	// 要素实例信息，用于捞取最小闭环数据
	// example:
	//
	// {"scene": "XXX", "entityId": ["XXX"], "featureId": "XXX", "startTime": "XXX", "endTime": "XXX"}
	ElementInstanceConfig *string `json:"element_instance_config,omitempty" xml:"element_instance_config,omitempty"`
	// 要素实例
	// example:
	//
	// {...}
	ElementInstanceInfo *string `json:"element_instance_info,omitempty" xml:"element_instance_info,omitempty"`
	// 属性列表来源平台 1.IOT 2.DM
	// example:
	//
	// 1
	PropertySourceType *int64 `json:"property_source_type,omitempty" xml:"property_source_type,omitempty"`
	// 拉取数据字段code请求值
	// example:
	//
	// xxx
	PropertySourceId *string `json:"property_source_id,omitempty" xml:"property_source_id,omitempty"`
	// 要素主键字段信息
	// example:
	//
	// identifier
	PrimaryKeyInfo *string `json:"primary_key_info,omitempty" xml:"primary_key_info,omitempty"`
	// 备注
	// example:
	//
	// xxx
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
}

func (s AssetElementInfo) String() string {
	return tea.Prettify(s)
}

func (s AssetElementInfo) GoString() string {
	return s.String()
}

func (s *AssetElementInfo) SetProjectId(v string) *AssetElementInfo {
	s.ProjectId = &v
	return s
}

func (s *AssetElementInfo) SetElementId(v string) *AssetElementInfo {
	s.ElementId = &v
	return s
}

func (s *AssetElementInfo) SetElementName(v string) *AssetElementInfo {
	s.ElementName = &v
	return s
}

func (s *AssetElementInfo) SetElementType(v string) *AssetElementInfo {
	s.ElementType = &v
	return s
}

func (s *AssetElementInfo) SetFromType(v string) *AssetElementInfo {
	s.FromType = &v
	return s
}

func (s *AssetElementInfo) SetDataElementType(v string) *AssetElementInfo {
	s.DataElementType = &v
	return s
}

func (s *AssetElementInfo) SetPropertyList(v string) *AssetElementInfo {
	s.PropertyList = &v
	return s
}

func (s *AssetElementInfo) SetFrequency(v string) *AssetElementInfo {
	s.Frequency = &v
	return s
}

func (s *AssetElementInfo) SetPhysicsElementTypeCode(v string) *AssetElementInfo {
	s.PhysicsElementTypeCode = &v
	return s
}

func (s *AssetElementInfo) SetBizType(v string) *AssetElementInfo {
	s.BizType = &v
	return s
}

func (s *AssetElementInfo) SetPersistentLocation(v string) *AssetElementInfo {
	s.PersistentLocation = &v
	return s
}

func (s *AssetElementInfo) SetElementInstanceConfig(v string) *AssetElementInfo {
	s.ElementInstanceConfig = &v
	return s
}

func (s *AssetElementInfo) SetElementInstanceInfo(v string) *AssetElementInfo {
	s.ElementInstanceInfo = &v
	return s
}

func (s *AssetElementInfo) SetPropertySourceType(v int64) *AssetElementInfo {
	s.PropertySourceType = &v
	return s
}

func (s *AssetElementInfo) SetPropertySourceId(v string) *AssetElementInfo {
	s.PropertySourceId = &v
	return s
}

func (s *AssetElementInfo) SetPrimaryKeyInfo(v string) *AssetElementInfo {
	s.PrimaryKeyInfo = &v
	return s
}

func (s *AssetElementInfo) SetRemark(v string) *AssetElementInfo {
	s.Remark = &v
	return s
}

// 用户通行证创建详情
type XrUserTicketInfo struct {
	// xr通行证资源池名称
	// example:
	//
	// 资源池001
	XrTicketPoolName *string `json:"xr_ticket_pool_name,omitempty" xml:"xr_ticket_pool_name,omitempty" require:"true"`
	// 购买数量
	// example:
	//
	// 10
	Count *int64 `json:"count,omitempty" xml:"count,omitempty" require:"true"`
}

func (s XrUserTicketInfo) String() string {
	return tea.Prettify(s)
}

func (s XrUserTicketInfo) GoString() string {
	return s.String()
}

func (s *XrUserTicketInfo) SetXrTicketPoolName(v string) *XrUserTicketInfo {
	s.XrTicketPoolName = &v
	return s
}

func (s *XrUserTicketInfo) SetCount(v int64) *XrUserTicketInfo {
	s.Count = &v
	return s
}

// 用户操作集合
type IotBasicUserRequest struct {
	// 租户ID
	// example:
	//
	// XRE2DAS
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 金融云用户id
	// example:
	//
	// 12321321
	CloudUserId *string `json:"cloud_user_id,omitempty" xml:"cloud_user_id,omitempty"`
	// 登录名
	// example:
	//
	// test@alibaba-inc.com
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
	// example:
	//
	// txhash123
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty"`
	// 可信设备ID（与scene参数、设备链上ID至少有一个参数不为空）
	// example:
	//
	// 7006071575519457281
	TrustiotDeviceId *int64 `json:"trustiot_device_id,omitempty" xml:"trustiot_device_id,omitempty"`
	// 业务Id
	//
	//
	// example:
	//
	// 123123
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 业务类型
	//
	//
	// example:
	//
	// 123123
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 数据内容 JSON字符串
	//
	//
	// example:
	//
	// {"":"",""}
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

// 行程详情
type TripTrace struct {
	// 定位数据
	// example:
	//
	// 113.784416,22.747500
	DeviceLocation *string `json:"device_location,omitempty" xml:"device_location,omitempty" require:"true"`
}

func (s TripTrace) String() string {
	return tea.Prettify(s)
}

func (s TripTrace) GoString() string {
	return s.String()
}

func (s *TripTrace) SetDeviceLocation(v string) *TripTrace {
	s.DeviceLocation = &v
	return s
}

// 查询设备交易结果对象数据
type QueryDeviceTransactionResultData struct {
	// 设备所属厂商
	// example:
	//
	// corp
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty" require:"true"`
	// 场景码,所属项目
	// example:
	//
	// SMART_CAR_KEY
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// IMEI
	// example:
	//
	// IMEI
	DeviceImei *string `json:"device_imei,omitempty" xml:"device_imei,omitempty"`
	// 设备sn
	// example:
	//
	// 设备sn123
	DeviceSn *string `json:"device_sn,omitempty" xml:"device_sn,omitempty" require:"true"`
	// 设备金额
	// example:
	//
	// 1.05
	Price *string `json:"price,omitempty" xml:"price,omitempty"`
	// 设备分布式身份did
	// example:
	//
	// did1223
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty" require:"true"`
	// 设备终端唯一ID
	// example:
	//
	// tuid123
	DeviceTuid *string `json:"device_tuid,omitempty" xml:"device_tuid,omitempty"`
	// 设备参数:品类+型号+规格
	// example:
	//
	// 123
	DeviceSpecs *string `json:"device_specs,omitempty" xml:"device_specs,omitempty" require:"true"`
	// 所属租户
	// example:
	//
	// QWERTYUU
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 所属账号
	// example:
	//
	// 123
	AccountName *string `json:"account_name,omitempty" xml:"account_name,omitempty" require:"true"`
}

func (s QueryDeviceTransactionResultData) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceTransactionResultData) GoString() string {
	return s.String()
}

func (s *QueryDeviceTransactionResultData) SetCorpName(v string) *QueryDeviceTransactionResultData {
	s.CorpName = &v
	return s
}

func (s *QueryDeviceTransactionResultData) SetScene(v string) *QueryDeviceTransactionResultData {
	s.Scene = &v
	return s
}

func (s *QueryDeviceTransactionResultData) SetDeviceImei(v string) *QueryDeviceTransactionResultData {
	s.DeviceImei = &v
	return s
}

func (s *QueryDeviceTransactionResultData) SetDeviceSn(v string) *QueryDeviceTransactionResultData {
	s.DeviceSn = &v
	return s
}

func (s *QueryDeviceTransactionResultData) SetPrice(v string) *QueryDeviceTransactionResultData {
	s.Price = &v
	return s
}

func (s *QueryDeviceTransactionResultData) SetDeviceDid(v string) *QueryDeviceTransactionResultData {
	s.DeviceDid = &v
	return s
}

func (s *QueryDeviceTransactionResultData) SetDeviceTuid(v string) *QueryDeviceTransactionResultData {
	s.DeviceTuid = &v
	return s
}

func (s *QueryDeviceTransactionResultData) SetDeviceSpecs(v string) *QueryDeviceTransactionResultData {
	s.DeviceSpecs = &v
	return s
}

func (s *QueryDeviceTransactionResultData) SetTenantId(v string) *QueryDeviceTransactionResultData {
	s.TenantId = &v
	return s
}

func (s *QueryDeviceTransactionResultData) SetAccountName(v string) *QueryDeviceTransactionResultData {
	s.AccountName = &v
	return s
}

// 组织请求注册更新结构体，应用在注册/更新API的ThingExtraParams
type CorporateReqModel struct {
	// 组织地址
	// example:
	//
	// xxxxx
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 运营地址
	// example:
	//
	// ""
	BusinessAddress *string `json:"business_address,omitempty" xml:"business_address,omitempty"`
	// 经营类目
	// example:
	//
	// ""
	BusinessScope *string `json:"business_scope,omitempty" xml:"business_scope,omitempty"`
	// 注册时间，字符串类型
	// example:
	//
	// "注册时间"
	CertifyDate *string `json:"certify_date,omitempty" xml:"certify_date,omitempty"`
	// 营业执照有效期，字符串
	// example:
	//
	// ""
	LicenceExpireDate *string `json:"licence_expire_date,omitempty" xml:"licence_expire_date,omitempty"`
	// 国家
	// example:
	//
	// CN
	Nation *string `json:"nation,omitempty" xml:"nation,omitempty"`
	// 组织类型
	// example:
	//
	// LimitedCompany
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
	// example:
	//
	// 12207
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 用户角色
	// example:
	//
	// 渠道商/平台
	UserRole *string `json:"user_role,omitempty" xml:"user_role,omitempty" require:"true"`
	// 用户登录id来源
	// example:
	//
	// 用户登录id来源
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
	// 作为平台使用方，提供对应的渠道用户id列表
	// example:
	//
	// ["1001","1002"]
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
	// example:
	//
	// XXXXX
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 数据模型ID
	// example:
	//
	// 001202103171566166669
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

// iotbasic数控设备信息（不包含出库信息）
type IotbasicDigitalKeyDeviceNoShipInfo struct {
	// 设备id
	// example:
	//
	// 125839
	Devid *string `json:"devid,omitempty" xml:"devid,omitempty" require:"true"`
	// 设备sn
	// example:
	//
	// 9726001010008SC30N96
	Sn *string `json:"sn,omitempty" xml:"sn,omitempty" require:"true"`
	// ccid
	// example:
	//
	// 898602B1191870002179
	Ccid *string `json:"ccid,omitempty" xml:"ccid,omitempty" require:"true"`
	// imei
	// example:
	//
	// 866311069827503
	Imei *string `json:"imei,omitempty" xml:"imei,omitempty" require:"true"`
	// tbox固件版本号(16进制)
	// example:
	//
	// 80000109
	Ver *string `json:"ver,omitempty" xml:"ver,omitempty" require:"true"`
	// PEPS系统固件版本号(16进制)
	// example:
	//
	// 81070205
	PepsVer *string `json:"peps_ver,omitempty" xml:"peps_ver,omitempty" require:"true"`
	// 蓝牙固件版本号(16进制)
	// example:
	//
	// 80090204
	BleVer *string `json:"ble_ver,omitempty" xml:"ble_ver,omitempty" require:"true"`
}

func (s IotbasicDigitalKeyDeviceNoShipInfo) String() string {
	return tea.Prettify(s)
}

func (s IotbasicDigitalKeyDeviceNoShipInfo) GoString() string {
	return s.String()
}

func (s *IotbasicDigitalKeyDeviceNoShipInfo) SetDevid(v string) *IotbasicDigitalKeyDeviceNoShipInfo {
	s.Devid = &v
	return s
}

func (s *IotbasicDigitalKeyDeviceNoShipInfo) SetSn(v string) *IotbasicDigitalKeyDeviceNoShipInfo {
	s.Sn = &v
	return s
}

func (s *IotbasicDigitalKeyDeviceNoShipInfo) SetCcid(v string) *IotbasicDigitalKeyDeviceNoShipInfo {
	s.Ccid = &v
	return s
}

func (s *IotbasicDigitalKeyDeviceNoShipInfo) SetImei(v string) *IotbasicDigitalKeyDeviceNoShipInfo {
	s.Imei = &v
	return s
}

func (s *IotbasicDigitalKeyDeviceNoShipInfo) SetVer(v string) *IotbasicDigitalKeyDeviceNoShipInfo {
	s.Ver = &v
	return s
}

func (s *IotbasicDigitalKeyDeviceNoShipInfo) SetPepsVer(v string) *IotbasicDigitalKeyDeviceNoShipInfo {
	s.PepsVer = &v
	return s
}

func (s *IotbasicDigitalKeyDeviceNoShipInfo) SetBleVer(v string) *IotbasicDigitalKeyDeviceNoShipInfo {
	s.BleVer = &v
	return s
}

// 发行设备
type DistributeDevice struct {
	// 链上设备Id  （deviceType=DEVICE 时有值)
	// example:
	//
	// 4533
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty"`
	// 设备id
	// example:
	//
	// 1122
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 发行设备Id
	// example:
	//
	// 4455
	DistributeDeviceId *string `json:"distribute_device_id,omitempty" xml:"distribute_device_id,omitempty" require:"true"`
	// 场景码
	// example:
	//
	// SCENE
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 设备类型 DEVICE : 设备 、PERIPHERAL : 外围设备
	// example:
	//
	// PERIPHERAL
	DeviceType *string `json:"device_type,omitempty" xml:"device_type,omitempty" require:"true"`
	// 链上外围设备Id（deviceType=PERIPHERAL 时有值)
	// example:
	//
	// 123123
	ChainPeripheralId *string `json:"chain_peripheral_id,omitempty" xml:"chain_peripheral_id,omitempty"`
	// 设备状态，取值范围：NORMAL、OFFLINE、UNREGISTER
	// example:
	//
	// NORMAL
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

// 事件数据
type EventData struct {
	// 数据内容
	// example:
	//
	// { "DEVICE-ID": "ABC123", "IMEI": "868331011992179", "HEART-BEAT-TIME": 1699053387008 }
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 可信设备ID
	// example:
	//
	// 7213004826408435712
	TrustIotDeviceId *int64 `json:"trust_iot_device_id,omitempty" xml:"trust_iot_device_id,omitempty"`
	// 业务ID
	// example:
	//
	// 20240815
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 设备数据签名
	// example:
	//
	// 8e084d95c5ac9198b01b9f6b8040b2daa35a3e2706a472295f52ec0966119383d7654eb2c1f67eb563194ab9d2197fcd8fcb5232308927e708257ebea8ce1cda
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty"`
	// 设备数据间接上报时，服务端补充数据
	// example:
	//
	// {"PRICE":2.2,"NUMBER":3}
	ExtraData *string `json:"extra_data,omitempty" xml:"extra_data,omitempty"`
}

func (s EventData) String() string {
	return tea.Prettify(s)
}

func (s EventData) GoString() string {
	return s.String()
}

func (s *EventData) SetContent(v string) *EventData {
	s.Content = &v
	return s
}

func (s *EventData) SetTrustIotDeviceId(v int64) *EventData {
	s.TrustIotDeviceId = &v
	return s
}

func (s *EventData) SetBizId(v string) *EventData {
	s.BizId = &v
	return s
}

func (s *EventData) SetSignature(v string) *EventData {
	s.Signature = &v
	return s
}

func (s *EventData) SetExtraData(v string) *EventData {
	s.ExtraData = &v
	return s
}

// 设备概览统计信息
type DeviceOverViewResponse struct {
	// 设备品类名称
	// example:
	//
	// test_category
	DeviceCategoryName *string `json:"device_category_name,omitempty" xml:"device_category_name,omitempty" require:"true"`
	// 设备总数
	// example:
	//
	// 2000
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
	// example:
	//
	// 红色
	Colour *string `json:"colour,omitempty" xml:"colour,omitempty" require:"true"`
	// 色值
	// example:
	//
	// #BA0F2F
	ColourNumber *string `json:"colour_number,omitempty" xml:"colour_number,omitempty" require:"true"`
	// 内存大小
	// example:
	//
	// 128GB
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
	// example:
	//
	// telpo
	CorpValue *string `json:"corp_value,omitempty" xml:"corp_value,omitempty" require:"true"`
	// 厂商名称
	// example:
	//
	// 天波
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty" require:"true"`
	// 型号名称
	// example:
	//
	// TPS1231
	ModelName *string `json:"model_name,omitempty" xml:"model_name,omitempty" require:"true"`
	// 型号编码
	// example:
	//
	// TPS123
	ModelValue *string `json:"model_value,omitempty" xml:"model_value,omitempty" require:"true"`
	// 防疫机
	// example:
	//
	// 设备品类名称
	CategoryName *string `json:"category_name,omitempty" xml:"category_name,omitempty" require:"true"`
	// 设备品类编码
	// example:
	//
	// antmic
	CategoryCode *string `json:"category_code,omitempty" xml:"category_code,omitempty" require:"true"`
	// 规格ID
	// example:
	//
	// 12321321
	SpecsId *int64 `json:"specs_id,omitempty" xml:"specs_id,omitempty" require:"true"`
	// 规格名称
	// example:
	//
	// 规格名称
	SpecsName *string `json:"specs_name,omitempty" xml:"specs_name,omitempty" require:"true"`
	// 规格编码
	// example:
	//
	// 规格编码
	SpecsValue *string `json:"specs_value,omitempty" xml:"specs_value,omitempty" require:"true"`
	// 规格参数
	// example:
	//
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
	// example:
	//
	// 奢侈品
	Category *string `json:"category,omitempty" xml:"category,omitempty" require:"true"`
	// 品牌
	// example:
	//
	// GUCCI
	Brand *string `json:"brand,omitempty" xml:"brand,omitempty" require:"true"`
	// 款式
	// example:
	//
	// Gucci Diana
	Style *string `json:"style,omitempty" xml:"style,omitempty" require:"true"`
	// 商品数字指纹鉴定点列表
	// example:
	//
	// [{"sub_point_name":"正面","image_url":"http://xxxx1001"},{"sub_point_name":"背面","image_url":"http://xxxx1002"}]
	GoodsPoints []*GoodsDigitalFingerprintPoint `json:"goods_points,omitempty" xml:"goods_points,omitempty" require:"true" type:"Repeated"`
	// 商品id
	// example:
	//
	// goodsId
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
	// example:
	//
	// "did:iot_xxxxx"
	ThingDid *string `json:"thing_did,omitempty" xml:"thing_did,omitempty" require:"true"`
	// 待更新访问者列表
	// example:
	//
	// ["",""]
	TenantList []*string `json:"tenant_list,omitempty" xml:"tenant_list,omitempty" require:"true" type:"Repeated"`
	// 权限角色
	// TENANT_ROLE_OWNER
	// TENANT_ROLE_USER
	// TENANT_ROLE_OBSERVER
	// example:
	//
	// TENANT_ROLE_OWNER
	TenantRole *string `json:"tenant_role,omitempty" xml:"tenant_role,omitempty" require:"true"`
	// 增加权限：THINGS_OP_MODE_ADD
	// 删除权限：THINGS_OP_MODE_REMOVE
	// example:
	//
	// THINGS_OP_MODE_ADD
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
	// example:
	//
	// 20034932
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 支付状态
	// example:
	//
	// PAID,UNPAID,PAYMENT_FAILED
	OrderStatus *string `json:"order_status,omitempty" xml:"order_status,omitempty" require:"true"`
	// 商家唯一id
	// example:
	//
	// 30099234
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 设备订单元素集合
	OrderDeviceList []*IotBasicDeviceOrderItem `json:"order_device_list,omitempty" xml:"order_device_list,omitempty" require:"true" type:"Repeated"`
	// 订单总金额，精确到小数点后两位
	// example:
	//
	// 22220.98
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
	// example:
	//
	// 56165431
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 数据资产类型
	// example:
	//
	// LOCK
	DataScene *string `json:"data_scene,omitempty" xml:"data_scene,omitempty" require:"true"`
	// 资产数据内容，业务要上链的数据JSON格式
	// example:
	//
	// {"a":xx,"b":xx}
	AssetData *string `json:"asset_data,omitempty" xml:"asset_data,omitempty" require:"true"`
	// 上链数据采集id
	// example:
	//
	// 289hj98u
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

// id,name
type IdListView struct {
	// 数据id
	// example:
	//
	// 10
	DataId *int64 `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 数据名称
	// example:
	//
	// name
	DataName *string `json:"data_name,omitempty" xml:"data_name,omitempty" require:"true"`
}

func (s IdListView) String() string {
	return tea.Prettify(s)
}

func (s IdListView) GoString() string {
	return s.String()
}

func (s *IdListView) SetDataId(v int64) *IdListView {
	s.DataId = &v
	return s
}

func (s *IdListView) SetDataName(v string) *IdListView {
	s.DataName = &v
	return s
}

type QueryBlockchainBotIoaAgentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 智能体ID
	AgentId *string `json:"agent_id,omitempty" xml:"agent_id,omitempty"`
	// 客户端ID，一般是设备MAC地址，若没有agentId时可传入client_id查询对应的agent_id
	ClientId *string `json:"client_id,omitempty" xml:"client_id,omitempty"`
}

func (s QueryBlockchainBotIoaAgentRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainBotIoaAgentRequest) GoString() string {
	return s.String()
}

func (s *QueryBlockchainBotIoaAgentRequest) SetAuthToken(v string) *QueryBlockchainBotIoaAgentRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBlockchainBotIoaAgentRequest) SetProductInstanceId(v string) *QueryBlockchainBotIoaAgentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBlockchainBotIoaAgentRequest) SetAgentId(v string) *QueryBlockchainBotIoaAgentRequest {
	s.AgentId = &v
	return s
}

func (s *QueryBlockchainBotIoaAgentRequest) SetClientId(v string) *QueryBlockchainBotIoaAgentRequest {
	s.ClientId = &v
	return s
}

type QueryBlockchainBotIoaAgentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 智能体信息视图对象
	AgentInfo *AgentInfoVO `json:"agent_info,omitempty" xml:"agent_info,omitempty"`
}

func (s QueryBlockchainBotIoaAgentResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainBotIoaAgentResponse) GoString() string {
	return s.String()
}

func (s *QueryBlockchainBotIoaAgentResponse) SetReqMsgId(v string) *QueryBlockchainBotIoaAgentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBlockchainBotIoaAgentResponse) SetResultCode(v string) *QueryBlockchainBotIoaAgentResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBlockchainBotIoaAgentResponse) SetResultMsg(v string) *QueryBlockchainBotIoaAgentResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBlockchainBotIoaAgentResponse) SetAgentInfo(v *AgentInfoVO) *QueryBlockchainBotIoaAgentResponse {
	s.AgentInfo = v
	return s
}

type SaveBlockchainBotIoaAgentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 智能体ID
	AgentId *string `json:"agent_id,omitempty" xml:"agent_id,omitempty" require:"true"`
	// 智能体名称
	AgentName *string `json:"agent_name,omitempty" xml:"agent_name,omitempty"`
	// 语言Code
	LangCode *string `json:"lang_code,omitempty" xml:"lang_code,omitempty"`
	// 音色ID
	TtsVoiceId *string `json:"tts_voice_id,omitempty" xml:"tts_voice_id,omitempty"`
	// 系统提示词
	SystemPrompt *string `json:"system_prompt,omitempty" xml:"system_prompt,omitempty"`
	// 父模板智能体ID
	ParentTemplateAgentId *string `json:"parent_template_agent_id,omitempty" xml:"parent_template_agent_id,omitempty"`
}

func (s SaveBlockchainBotIoaAgentRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveBlockchainBotIoaAgentRequest) GoString() string {
	return s.String()
}

func (s *SaveBlockchainBotIoaAgentRequest) SetAuthToken(v string) *SaveBlockchainBotIoaAgentRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveBlockchainBotIoaAgentRequest) SetProductInstanceId(v string) *SaveBlockchainBotIoaAgentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveBlockchainBotIoaAgentRequest) SetAgentId(v string) *SaveBlockchainBotIoaAgentRequest {
	s.AgentId = &v
	return s
}

func (s *SaveBlockchainBotIoaAgentRequest) SetAgentName(v string) *SaveBlockchainBotIoaAgentRequest {
	s.AgentName = &v
	return s
}

func (s *SaveBlockchainBotIoaAgentRequest) SetLangCode(v string) *SaveBlockchainBotIoaAgentRequest {
	s.LangCode = &v
	return s
}

func (s *SaveBlockchainBotIoaAgentRequest) SetTtsVoiceId(v string) *SaveBlockchainBotIoaAgentRequest {
	s.TtsVoiceId = &v
	return s
}

func (s *SaveBlockchainBotIoaAgentRequest) SetSystemPrompt(v string) *SaveBlockchainBotIoaAgentRequest {
	s.SystemPrompt = &v
	return s
}

func (s *SaveBlockchainBotIoaAgentRequest) SetParentTemplateAgentId(v string) *SaveBlockchainBotIoaAgentRequest {
	s.ParentTemplateAgentId = &v
	return s
}

type SaveBlockchainBotIoaAgentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SaveBlockchainBotIoaAgentResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveBlockchainBotIoaAgentResponse) GoString() string {
	return s.String()
}

func (s *SaveBlockchainBotIoaAgentResponse) SetReqMsgId(v string) *SaveBlockchainBotIoaAgentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveBlockchainBotIoaAgentResponse) SetResultCode(v string) *SaveBlockchainBotIoaAgentResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveBlockchainBotIoaAgentResponse) SetResultMsg(v string) *SaveBlockchainBotIoaAgentResponse {
	s.ResultMsg = &v
	return s
}

type QueryBlockchainBotIoaTemplatesRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 智能体ID
	AgentId *string `json:"agent_id,omitempty" xml:"agent_id,omitempty" require:"true"`
	// 客户端ID（如MAC地址）
	ClientId *string `json:"client_id,omitempty" xml:"client_id,omitempty" require:"true"`
}

func (s QueryBlockchainBotIoaTemplatesRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainBotIoaTemplatesRequest) GoString() string {
	return s.String()
}

func (s *QueryBlockchainBotIoaTemplatesRequest) SetAuthToken(v string) *QueryBlockchainBotIoaTemplatesRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBlockchainBotIoaTemplatesRequest) SetProductInstanceId(v string) *QueryBlockchainBotIoaTemplatesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBlockchainBotIoaTemplatesRequest) SetAgentId(v string) *QueryBlockchainBotIoaTemplatesRequest {
	s.AgentId = &v
	return s
}

func (s *QueryBlockchainBotIoaTemplatesRequest) SetClientId(v string) *QueryBlockchainBotIoaTemplatesRequest {
	s.ClientId = &v
	return s
}

type QueryBlockchainBotIoaTemplatesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 智能体模板 VO集合
	TemplateAgentList []*AgentInfoVO `json:"template_agent_list,omitempty" xml:"template_agent_list,omitempty" type:"Repeated"`
}

func (s QueryBlockchainBotIoaTemplatesResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainBotIoaTemplatesResponse) GoString() string {
	return s.String()
}

func (s *QueryBlockchainBotIoaTemplatesResponse) SetReqMsgId(v string) *QueryBlockchainBotIoaTemplatesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBlockchainBotIoaTemplatesResponse) SetResultCode(v string) *QueryBlockchainBotIoaTemplatesResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBlockchainBotIoaTemplatesResponse) SetResultMsg(v string) *QueryBlockchainBotIoaTemplatesResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBlockchainBotIoaTemplatesResponse) SetTemplateAgentList(v []*AgentInfoVO) *QueryBlockchainBotIoaTemplatesResponse {
	s.TemplateAgentList = v
	return s
}

type QueryBlockchainBotAgentchatHistoryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 会话ID
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true"`
	// 页码
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s QueryBlockchainBotAgentchatHistoryRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainBotAgentchatHistoryRequest) GoString() string {
	return s.String()
}

func (s *QueryBlockchainBotAgentchatHistoryRequest) SetAuthToken(v string) *QueryBlockchainBotAgentchatHistoryRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBlockchainBotAgentchatHistoryRequest) SetProductInstanceId(v string) *QueryBlockchainBotAgentchatHistoryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBlockchainBotAgentchatHistoryRequest) SetSessionId(v string) *QueryBlockchainBotAgentchatHistoryRequest {
	s.SessionId = &v
	return s
}

func (s *QueryBlockchainBotAgentchatHistoryRequest) SetPageIndex(v int64) *QueryBlockchainBotAgentchatHistoryRequest {
	s.PageIndex = &v
	return s
}

func (s *QueryBlockchainBotAgentchatHistoryRequest) SetPageSize(v int64) *QueryBlockchainBotAgentchatHistoryRequest {
	s.PageSize = &v
	return s
}

type QueryBlockchainBotAgentchatHistoryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分页结果总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 当前页码 （从第一页开始）
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 每页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总页数
	Pages *int64 `json:"pages,omitempty" xml:"pages,omitempty"`
	// 对话内容集合
	List []*AiAgentChatHistoryBO `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
}

func (s QueryBlockchainBotAgentchatHistoryResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainBotAgentchatHistoryResponse) GoString() string {
	return s.String()
}

func (s *QueryBlockchainBotAgentchatHistoryResponse) SetReqMsgId(v string) *QueryBlockchainBotAgentchatHistoryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBlockchainBotAgentchatHistoryResponse) SetResultCode(v string) *QueryBlockchainBotAgentchatHistoryResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBlockchainBotAgentchatHistoryResponse) SetResultMsg(v string) *QueryBlockchainBotAgentchatHistoryResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBlockchainBotAgentchatHistoryResponse) SetTotal(v int64) *QueryBlockchainBotAgentchatHistoryResponse {
	s.Total = &v
	return s
}

func (s *QueryBlockchainBotAgentchatHistoryResponse) SetPageNum(v int64) *QueryBlockchainBotAgentchatHistoryResponse {
	s.PageNum = &v
	return s
}

func (s *QueryBlockchainBotAgentchatHistoryResponse) SetPageSize(v int64) *QueryBlockchainBotAgentchatHistoryResponse {
	s.PageSize = &v
	return s
}

func (s *QueryBlockchainBotAgentchatHistoryResponse) SetPages(v int64) *QueryBlockchainBotAgentchatHistoryResponse {
	s.Pages = &v
	return s
}

func (s *QueryBlockchainBotAgentchatHistoryResponse) SetList(v []*AiAgentChatHistoryBO) *QueryBlockchainBotAgentchatHistoryResponse {
	s.List = v
	return s
}

type QueryBlockchainBotAgentSessionsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户端ID
	ClientId *string `json:"client_id,omitempty" xml:"client_id,omitempty" require:"true"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 页码
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s QueryBlockchainBotAgentSessionsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainBotAgentSessionsRequest) GoString() string {
	return s.String()
}

func (s *QueryBlockchainBotAgentSessionsRequest) SetAuthToken(v string) *QueryBlockchainBotAgentSessionsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBlockchainBotAgentSessionsRequest) SetProductInstanceId(v string) *QueryBlockchainBotAgentSessionsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBlockchainBotAgentSessionsRequest) SetClientId(v string) *QueryBlockchainBotAgentSessionsRequest {
	s.ClientId = &v
	return s
}

func (s *QueryBlockchainBotAgentSessionsRequest) SetUserId(v string) *QueryBlockchainBotAgentSessionsRequest {
	s.UserId = &v
	return s
}

func (s *QueryBlockchainBotAgentSessionsRequest) SetPageIndex(v int64) *QueryBlockchainBotAgentSessionsRequest {
	s.PageIndex = &v
	return s
}

func (s *QueryBlockchainBotAgentSessionsRequest) SetPageSize(v int64) *QueryBlockchainBotAgentSessionsRequest {
	s.PageSize = &v
	return s
}

type QueryBlockchainBotAgentSessionsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分页结果总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 当前页码 （从第一页开始）
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 每页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总页数
	Pages *int64 `json:"pages,omitempty" xml:"pages,omitempty"`
	// 会话集合
	List []*AgentSessionVO `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
}

func (s QueryBlockchainBotAgentSessionsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainBotAgentSessionsResponse) GoString() string {
	return s.String()
}

func (s *QueryBlockchainBotAgentSessionsResponse) SetReqMsgId(v string) *QueryBlockchainBotAgentSessionsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBlockchainBotAgentSessionsResponse) SetResultCode(v string) *QueryBlockchainBotAgentSessionsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBlockchainBotAgentSessionsResponse) SetResultMsg(v string) *QueryBlockchainBotAgentSessionsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBlockchainBotAgentSessionsResponse) SetTotal(v int64) *QueryBlockchainBotAgentSessionsResponse {
	s.Total = &v
	return s
}

func (s *QueryBlockchainBotAgentSessionsResponse) SetPageNum(v int64) *QueryBlockchainBotAgentSessionsResponse {
	s.PageNum = &v
	return s
}

func (s *QueryBlockchainBotAgentSessionsResponse) SetPageSize(v int64) *QueryBlockchainBotAgentSessionsResponse {
	s.PageSize = &v
	return s
}

func (s *QueryBlockchainBotAgentSessionsResponse) SetPages(v int64) *QueryBlockchainBotAgentSessionsResponse {
	s.Pages = &v
	return s
}

func (s *QueryBlockchainBotAgentSessionsResponse) SetList(v []*AgentSessionVO) *QueryBlockchainBotAgentSessionsResponse {
	s.List = v
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
				"sdk_version":      tea.String("1.1.5"),
				"_prod_code":       tea.String("IOTAGENT"),
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

// Description:
//
// Description: 获取智能体信息
//
// Summary: 获取智能体信息
func (client *Client) QueryBlockchainBotIoaAgent(request *QueryBlockchainBotIoaAgentRequest) (_result *QueryBlockchainBotIoaAgentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBlockchainBotIoaAgentResponse{}
	_body, _err := client.QueryBlockchainBotIoaAgentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 获取智能体信息
//
// Summary: 获取智能体信息
func (client *Client) QueryBlockchainBotIoaAgentEx(request *QueryBlockchainBotIoaAgentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBlockchainBotIoaAgentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBlockchainBotIoaAgentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.ioa.agent.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 更新智能体信息
//
// Summary: 更新智能体信息
func (client *Client) SaveBlockchainBotIoaAgent(request *SaveBlockchainBotIoaAgentRequest) (_result *SaveBlockchainBotIoaAgentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveBlockchainBotIoaAgentResponse{}
	_body, _err := client.SaveBlockchainBotIoaAgentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 更新智能体信息
//
// Summary: 更新智能体信息
func (client *Client) SaveBlockchainBotIoaAgentEx(request *SaveBlockchainBotIoaAgentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveBlockchainBotIoaAgentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveBlockchainBotIoaAgentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.ioa.agent.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询用户可选的模板列表详情
//
// Summary: 查询用户可选的模板列表详情
func (client *Client) QueryBlockchainBotIoaTemplates(request *QueryBlockchainBotIoaTemplatesRequest) (_result *QueryBlockchainBotIoaTemplatesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBlockchainBotIoaTemplatesResponse{}
	_body, _err := client.QueryBlockchainBotIoaTemplatesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询用户可选的模板列表详情
//
// Summary: 查询用户可选的模板列表详情
func (client *Client) QueryBlockchainBotIoaTemplatesEx(request *QueryBlockchainBotIoaTemplatesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBlockchainBotIoaTemplatesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBlockchainBotIoaTemplatesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.ioa.templates.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询聊天记录
//
// Summary: 查询聊天记录
func (client *Client) QueryBlockchainBotAgentchatHistory(request *QueryBlockchainBotAgentchatHistoryRequest) (_result *QueryBlockchainBotAgentchatHistoryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBlockchainBotAgentchatHistoryResponse{}
	_body, _err := client.QueryBlockchainBotAgentchatHistoryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询聊天记录
//
// Summary: 查询聊天记录
func (client *Client) QueryBlockchainBotAgentchatHistoryEx(request *QueryBlockchainBotAgentchatHistoryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBlockchainBotAgentchatHistoryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBlockchainBotAgentchatHistoryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.agentchat.history.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询 Session 列表
//
// Summary: 查询 Session 列表
func (client *Client) QueryBlockchainBotAgentSessions(request *QueryBlockchainBotAgentSessionsRequest) (_result *QueryBlockchainBotAgentSessionsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBlockchainBotAgentSessionsResponse{}
	_body, _err := client.QueryBlockchainBotAgentSessionsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询 Session 列表
//
// Summary: 查询 Session 列表
func (client *Client) QueryBlockchainBotAgentSessionsEx(request *QueryBlockchainBotAgentSessionsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBlockchainBotAgentSessionsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBlockchainBotAgentSessionsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.agent.sessions.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
