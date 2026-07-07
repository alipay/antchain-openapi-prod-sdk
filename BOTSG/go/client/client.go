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
	// 数据签名
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

// 事件数据领域参数
type EventSpecs struct {
	// 物模型事件ID
	// example:
	//
	// 7084744398341955584
	EventModelId *string `json:"event_model_id,omitempty" xml:"event_model_id,omitempty" require:"true"`
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
	// 冗余字段，请忽略
	// example:
	//
	// true, false
	ReturnHash *bool `json:"return_hash,omitempty" xml:"return_hash,omitempty"`
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

func (s *EventSpecs) SetBizType(v string) *EventSpecs {
	s.BizType = &v
	return s
}

func (s *EventSpecs) SetSubmitDate(v string) *EventSpecs {
	s.SubmitDate = &v
	return s
}

func (s *EventSpecs) SetReturnHash(v bool) *EventSpecs {
	s.ReturnHash = &v
	return s
}

func (s *EventSpecs) SetIsRepaired(v bool) *EventSpecs {
	s.IsRepaired = &v
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

// 通过设备ID注册发行时的设备参数
type RegByDeviceIdParm struct {
	// 一般是业务上唯一的设备ID/资产编码
	// example:
	//
	// 1122
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 物模型事件ID
	// example:
	//
	// 7033986596836630528
	DeviceDataModelId *string `json:"device_data_model_id,omitempty" xml:"device_data_model_id,omitempty"`
	// 固定填写RAW_DATA
	// example:
	//
	// RAW_DATA
	DeviceFeature *string `json:"device_feature,omitempty" xml:"device_feature,omitempty"`
	// true : 设备ID已存在时返回存在的设备关联字段; false : 设备ID已存在时直接抛出异常；
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
	//
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
	//
	// example:
	//
	// 112233
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 来源要素名称
	//
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

// 通过设备注册发行时的设备参数 （与RegByDeviceIdParam的区别在于设备端有无植入蚂蚁SDK或模组）
type RegByDeviceParm struct {
	// 一般是业务上唯一的设备ID/资产编码
	// example:
	//
	// 1122
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 物模型事件ID
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
	// example:
	//
	// 1001
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
	//
	// 资产所有人名称
	// example:
	//
	//  蚂蚁区块链科技（上海）有限公司
	OwnerName *string `json:"owner_name,omitempty" xml:"owner_name,omitempty"`
	//
	// 设备名称/型号
	// example:
	//
	//  64.0V30AH
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty"`
	//
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

// 设备信息
type Device struct {
	// 设备ID，一般是设备的出厂编码或业务上的资产ID
	// example:
	//
	// 123ABC
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	//
	// 物模型事件ID
	// example:
	//
	// 112233
	DeviceDataModelId *string `json:"device_data_model_id,omitempty" xml:"device_data_model_id,omitempty" require:"true"`
	// 场景码
	//
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
	// example:
	//
	// a1234
	DeviceIccid *string `json:"device_iccid,omitempty" xml:"device_iccid,omitempty"`
	// 设备扩展信息
	// example:
	//
	// {“”:""}
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 设备类型编码
	// example:
	//
	// 5000
	DeviceTypeCode *string `json:"device_type_code,omitempty" xml:"device_type_code,omitempty" require:"true"`
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
	// 设备链上Id
	//
	// example:
	//
	// 223344
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty"`
	// 上链哈希
	//
	// example:
	//
	// 3344
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 上链时间
	//
	// example:
	//
	// 224455
	TxTime *int64 `json:"tx_time,omitempty" xml:"tx_time,omitempty"`
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

func (s *Device) SetDeviceTypeCode(v string) *Device {
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
	//
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

// 收集数据返回的上链结果
type SendCollectorResult struct {
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
	// 数据的链上哈希
	//
	// example:
	//
	// 2c952456827828cdedad06afccef75a9f2c2840cbb6b0b659f653da1e5916cb2
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s SendCollectorResult) String() string {
	return tea.Prettify(s)
}

func (s SendCollectorResult) GoString() string {
	return s.String()
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

func (s *SendCollectorResult) SetTxHash(v string) *SendCollectorResult {
	s.TxHash = &v
	return s
}

type SyncAssetelementProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 若要素项目已存在，是否进行全量覆盖
	CoverExistProject *bool `json:"cover_exist_project,omitempty" xml:"cover_exist_project,omitempty" require:"true"`
	// 同步目标
	Destination *string `json:"destination,omitempty" xml:"destination,omitempty" require:"true"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 项目名称
	//
	ProjectName *string `json:"project_name,omitempty" xml:"project_name,omitempty" require:"true"`
	// 根元素ID列表
	RootElements *string `json:"root_elements,omitempty" xml:"root_elements,omitempty"`
	// 是否只读
	//
	ReadOnly *bool `json:"read_only,omitempty" xml:"read_only,omitempty" require:"true"`
	// 备注
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
	// 附件列表
	AttachmentList *string `json:"attachment_list,omitempty" xml:"attachment_list,omitempty"`
	// 产品Owner
	PdOwner *string `json:"pd_owner,omitempty" xml:"pd_owner,omitempty"`
	// 要素列表
	AssetElementInfoList []*AssetElementInfo `json:"asset_element_info_list,omitempty" xml:"asset_element_info_list,omitempty" type:"Repeated"`
	// 要素关系列表
	AssetElementRelationInfoList []*AssetElementRelationInfo `json:"asset_element_relation_info_list,omitempty" xml:"asset_element_relation_info_list,omitempty" type:"Repeated"`
}

func (s SyncAssetelementProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAssetelementProjectRequest) GoString() string {
	return s.String()
}

func (s *SyncAssetelementProjectRequest) SetAuthToken(v string) *SyncAssetelementProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAssetelementProjectRequest) SetProductInstanceId(v string) *SyncAssetelementProjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAssetelementProjectRequest) SetCoverExistProject(v bool) *SyncAssetelementProjectRequest {
	s.CoverExistProject = &v
	return s
}

func (s *SyncAssetelementProjectRequest) SetDestination(v string) *SyncAssetelementProjectRequest {
	s.Destination = &v
	return s
}

func (s *SyncAssetelementProjectRequest) SetProjectId(v string) *SyncAssetelementProjectRequest {
	s.ProjectId = &v
	return s
}

func (s *SyncAssetelementProjectRequest) SetProjectName(v string) *SyncAssetelementProjectRequest {
	s.ProjectName = &v
	return s
}

func (s *SyncAssetelementProjectRequest) SetRootElements(v string) *SyncAssetelementProjectRequest {
	s.RootElements = &v
	return s
}

func (s *SyncAssetelementProjectRequest) SetReadOnly(v bool) *SyncAssetelementProjectRequest {
	s.ReadOnly = &v
	return s
}

func (s *SyncAssetelementProjectRequest) SetRemark(v string) *SyncAssetelementProjectRequest {
	s.Remark = &v
	return s
}

func (s *SyncAssetelementProjectRequest) SetAttachmentList(v string) *SyncAssetelementProjectRequest {
	s.AttachmentList = &v
	return s
}

func (s *SyncAssetelementProjectRequest) SetPdOwner(v string) *SyncAssetelementProjectRequest {
	s.PdOwner = &v
	return s
}

func (s *SyncAssetelementProjectRequest) SetAssetElementInfoList(v []*AssetElementInfo) *SyncAssetelementProjectRequest {
	s.AssetElementInfoList = v
	return s
}

func (s *SyncAssetelementProjectRequest) SetAssetElementRelationInfoList(v []*AssetElementRelationInfo) *SyncAssetelementProjectRequest {
	s.AssetElementRelationInfoList = v
	return s
}

type SyncAssetelementProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 同步结果
	SyncStatus *string `json:"sync_status,omitempty" xml:"sync_status,omitempty"`
}

func (s SyncAssetelementProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAssetelementProjectResponse) GoString() string {
	return s.String()
}

func (s *SyncAssetelementProjectResponse) SetReqMsgId(v string) *SyncAssetelementProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAssetelementProjectResponse) SetResultCode(v string) *SyncAssetelementProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAssetelementProjectResponse) SetResultMsg(v string) *SyncAssetelementProjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAssetelementProjectResponse) SetSyncStatus(v string) *SyncAssetelementProjectResponse {
	s.SyncStatus = &v
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
	//
	// 设备详情
	DeviceList []*Device `json:"device_list,omitempty" xml:"device_list,omitempty" type:"Repeated"`
	// 设备信息不存在的deviceId集合
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

type CreateDistributedeviceBydeviceidmulRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	// 场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 设备注册信息集合
	DeviceParamList []*RegByDeviceIdParm `json:"device_param_list,omitempty" xml:"device_param_list,omitempty" require:"true" type:"Repeated"`
}

func (s CreateDistributedeviceBydeviceidmulRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDistributedeviceBydeviceidmulRequest) GoString() string {
	return s.String()
}

func (s *CreateDistributedeviceBydeviceidmulRequest) SetAuthToken(v string) *CreateDistributedeviceBydeviceidmulRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidmulRequest) SetProductInstanceId(v string) *CreateDistributedeviceBydeviceidmulRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidmulRequest) SetScene(v string) *CreateDistributedeviceBydeviceidmulRequest {
	s.Scene = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidmulRequest) SetDeviceParamList(v []*RegByDeviceIdParm) *CreateDistributedeviceBydeviceidmulRequest {
	s.DeviceParamList = v
	return s
}

type CreateDistributedeviceBydeviceidmulResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 可信设备ID集合
	TrustiotDeviceIdList []*TrustiotDeviceIdMap `json:"trustiot_device_id_list,omitempty" xml:"trustiot_device_id_list,omitempty" type:"Repeated"`
}

func (s CreateDistributedeviceBydeviceidmulResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDistributedeviceBydeviceidmulResponse) GoString() string {
	return s.String()
}

func (s *CreateDistributedeviceBydeviceidmulResponse) SetReqMsgId(v string) *CreateDistributedeviceBydeviceidmulResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidmulResponse) SetResultCode(v string) *CreateDistributedeviceBydeviceidmulResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidmulResponse) SetResultMsg(v string) *CreateDistributedeviceBydeviceidmulResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDistributedeviceBydeviceidmulResponse) SetTrustiotDeviceIdList(v []*TrustiotDeviceIdMap) *CreateDistributedeviceBydeviceidmulResponse {
	s.TrustiotDeviceIdList = v
	return s
}

type CreateDistributedeviceBydevicemulRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码，由蚂蚁侧定义
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 设备注册信息集合, 数组长度不超过50
	DeviceParamList []*RegByDeviceParm `json:"device_param_list,omitempty" xml:"device_param_list,omitempty" require:"true" type:"Repeated"`
}

func (s CreateDistributedeviceBydevicemulRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDistributedeviceBydevicemulRequest) GoString() string {
	return s.String()
}

func (s *CreateDistributedeviceBydevicemulRequest) SetAuthToken(v string) *CreateDistributedeviceBydevicemulRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDistributedeviceBydevicemulRequest) SetProductInstanceId(v string) *CreateDistributedeviceBydevicemulRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDistributedeviceBydevicemulRequest) SetScene(v string) *CreateDistributedeviceBydevicemulRequest {
	s.Scene = &v
	return s
}

func (s *CreateDistributedeviceBydevicemulRequest) SetDeviceParamList(v []*RegByDeviceParm) *CreateDistributedeviceBydevicemulRequest {
	s.DeviceParamList = v
	return s
}

type CreateDistributedeviceBydevicemulResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 可信设备ID集合
	TrustiotDeviceIdList []*TrustiotDeviceIdMap `json:"trustiot_device_id_list,omitempty" xml:"trustiot_device_id_list,omitempty" type:"Repeated"`
}

func (s CreateDistributedeviceBydevicemulResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDistributedeviceBydevicemulResponse) GoString() string {
	return s.String()
}

func (s *CreateDistributedeviceBydevicemulResponse) SetReqMsgId(v string) *CreateDistributedeviceBydevicemulResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDistributedeviceBydevicemulResponse) SetResultCode(v string) *CreateDistributedeviceBydevicemulResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDistributedeviceBydevicemulResponse) SetResultMsg(v string) *CreateDistributedeviceBydevicemulResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDistributedeviceBydevicemulResponse) SetTrustiotDeviceIdList(v []*TrustiotDeviceIdMap) *CreateDistributedeviceBydevicemulResponse {
	s.TrustiotDeviceIdList = v
	return s
}

type SendEventDataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 事件数据列表
	EventDataList []*EventData `json:"event_data_list,omitempty" xml:"event_data_list,omitempty" require:"true" type:"Repeated"`
	// 事件数据领域参数
	//
	EventSpecs *EventSpecs `json:"event_specs,omitempty" xml:"event_specs,omitempty" require:"true"`
}

func (s SendEventDataRequest) String() string {
	return tea.Prettify(s)
}

func (s SendEventDataRequest) GoString() string {
	return s.String()
}

func (s *SendEventDataRequest) SetAuthToken(v string) *SendEventDataRequest {
	s.AuthToken = &v
	return s
}

func (s *SendEventDataRequest) SetProductInstanceId(v string) *SendEventDataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendEventDataRequest) SetScene(v string) *SendEventDataRequest {
	s.Scene = &v
	return s
}

func (s *SendEventDataRequest) SetEventDataList(v []*EventData) *SendEventDataRequest {
	s.EventDataList = v
	return s
}

func (s *SendEventDataRequest) SetEventSpecs(v *EventSpecs) *SendEventDataRequest {
	s.EventSpecs = v
	return s
}

type SendEventDataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 上报数据返回的上链结果
	//
	ResultList []*SendCollectorResult `json:"result_list,omitempty" xml:"result_list,omitempty" type:"Repeated"`
}

func (s SendEventDataResponse) String() string {
	return tea.Prettify(s)
}

func (s SendEventDataResponse) GoString() string {
	return s.String()
}

func (s *SendEventDataResponse) SetReqMsgId(v string) *SendEventDataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendEventDataResponse) SetResultCode(v string) *SendEventDataResponse {
	s.ResultCode = &v
	return s
}

func (s *SendEventDataResponse) SetResultMsg(v string) *SendEventDataResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendEventDataResponse) SetResultList(v []*SendCollectorResult) *SendEventDataResponse {
	s.ResultList = v
	return s
}

type ImportIotagentClientRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备标识列表
	UidList []*string `json:"uid_list,omitempty" xml:"uid_list,omitempty" require:"true" type:"Repeated"`
	// 实例Id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// SKU名称
	SkuName *string `json:"sku_name,omitempty" xml:"sku_name,omitempty" require:"true"`
	// 模版智能体ID
	TemplateAgentId *string `json:"template_agent_id,omitempty" xml:"template_agent_id,omitempty" require:"true"`
	// 智能体话题
	AgentTopic *string `json:"agent_topic,omitempty" xml:"agent_topic,omitempty" require:"true"`
}

func (s ImportIotagentClientRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportIotagentClientRequest) GoString() string {
	return s.String()
}

func (s *ImportIotagentClientRequest) SetAuthToken(v string) *ImportIotagentClientRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportIotagentClientRequest) SetProductInstanceId(v string) *ImportIotagentClientRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportIotagentClientRequest) SetUidList(v []*string) *ImportIotagentClientRequest {
	s.UidList = v
	return s
}

func (s *ImportIotagentClientRequest) SetInstanceId(v string) *ImportIotagentClientRequest {
	s.InstanceId = &v
	return s
}

func (s *ImportIotagentClientRequest) SetSkuName(v string) *ImportIotagentClientRequest {
	s.SkuName = &v
	return s
}

func (s *ImportIotagentClientRequest) SetTemplateAgentId(v string) *ImportIotagentClientRequest {
	s.TemplateAgentId = &v
	return s
}

func (s *ImportIotagentClientRequest) SetAgentTopic(v string) *ImportIotagentClientRequest {
	s.AgentTopic = &v
	return s
}

type ImportIotagentClientResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 成功加白的UID列表
	SuccessUidList []*string `json:"success_uid_list,omitempty" xml:"success_uid_list,omitempty" type:"Repeated"`
	// 已存在的UID列表
	ExistedUidList []*string `json:"existed_uid_list,omitempty" xml:"existed_uid_list,omitempty" type:"Repeated"`
	// 无效的UID列表
	InvalidUidList []*string `json:"invalid_uid_list,omitempty" xml:"invalid_uid_list,omitempty" type:"Repeated"`
}

func (s ImportIotagentClientResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportIotagentClientResponse) GoString() string {
	return s.String()
}

func (s *ImportIotagentClientResponse) SetReqMsgId(v string) *ImportIotagentClientResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportIotagentClientResponse) SetResultCode(v string) *ImportIotagentClientResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportIotagentClientResponse) SetResultMsg(v string) *ImportIotagentClientResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportIotagentClientResponse) SetSuccessUidList(v []*string) *ImportIotagentClientResponse {
	s.SuccessUidList = v
	return s
}

func (s *ImportIotagentClientResponse) SetExistedUidList(v []*string) *ImportIotagentClientResponse {
	s.ExistedUidList = v
	return s
}

func (s *ImportIotagentClientResponse) SetInvalidUidList(v []*string) *ImportIotagentClientResponse {
	s.InvalidUidList = v
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
				"sdk_version":      tea.String("1.0.2"),
				"_prod_code":       tea.String("BOTSG"),
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
// Description: 要素项目同步
//
// Summary: 要素项目同步
func (client *Client) SyncAssetelementProject(request *SyncAssetelementProjectRequest) (_result *SyncAssetelementProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAssetelementProjectResponse{}
	_body, _err := client.SyncAssetelementProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 要素项目同步
//
// Summary: 要素项目同步
func (client *Client) SyncAssetelementProjectEx(request *SyncAssetelementProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAssetelementProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAssetelementProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.botsg.assetelement.project.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 通过deviceId获取设备详情
//
// Summary: 通过deviceId获取设备详情
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

// Description:
//
// Description: 通过deviceId获取设备详情
//
// Summary: 通过deviceId获取设备详情
func (client *Client) GetDeviceBydeviceidEx(request *GetDeviceBydeviceidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetDeviceBydeviceidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDeviceBydeviceidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.botsg.device.bydeviceid.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 通过设备ID异步批量发行设备
//
// Summary: 通过设备ID异步批量发行设备
func (client *Client) CreateDistributedeviceBydeviceidmul(request *CreateDistributedeviceBydeviceidmulRequest) (_result *CreateDistributedeviceBydeviceidmulResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDistributedeviceBydeviceidmulResponse{}
	_body, _err := client.CreateDistributedeviceBydeviceidmulEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 通过设备ID异步批量发行设备
//
// Summary: 通过设备ID异步批量发行设备
func (client *Client) CreateDistributedeviceBydeviceidmulEx(request *CreateDistributedeviceBydeviceidmulRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDistributedeviceBydeviceidmulResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDistributedeviceBydeviceidmulResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.botsg.distributedevice.bydeviceidmul.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 通过设备异步批量发行设备
//
// Summary: 通过设备异步批量发行设备
func (client *Client) CreateDistributedeviceBydevicemul(request *CreateDistributedeviceBydevicemulRequest) (_result *CreateDistributedeviceBydevicemulResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDistributedeviceBydevicemulResponse{}
	_body, _err := client.CreateDistributedeviceBydevicemulEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 通过设备异步批量发行设备
//
// Summary: 通过设备异步批量发行设备
func (client *Client) CreateDistributedeviceBydevicemulEx(request *CreateDistributedeviceBydevicemulRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDistributedeviceBydevicemulResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDistributedeviceBydevicemulResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.botsg.distributedevice.bydevicemul.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 事件数据上报整合接口
//
// Summary: 事件数据上报整合接口
func (client *Client) SendEventData(request *SendEventDataRequest) (_result *SendEventDataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendEventDataResponse{}
	_body, _err := client.SendEventDataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 事件数据上报整合接口
//
// Summary: 事件数据上报整合接口
func (client *Client) SendEventDataEx(request *SendEventDataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendEventDataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendEventDataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.botsg.event.data.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 智能体设备标识导入接口
//
// Summary: 智能体设备标识导入接口
func (client *Client) ImportIotagentClient(request *ImportIotagentClientRequest) (_result *ImportIotagentClientResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportIotagentClientResponse{}
	_body, _err := client.ImportIotagentClientEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 智能体设备标识导入接口
//
// Summary: 智能体设备标识导入接口
func (client *Client) ImportIotagentClientEx(request *ImportIotagentClientRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportIotagentClientResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportIotagentClientResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.botsg.iotagent.client.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
