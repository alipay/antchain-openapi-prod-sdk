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

// 收集信息
type CollectContent struct {
	// 链上设备Id
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty" require:"true"`
	// 收集的内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 对内容的签名
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
	// 服务端发送的扩展数据（非可信设备直接产生的数据）
	ExtraData *string `json:"extra_data,omitempty" xml:"extra_data,omitempty"`
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

// 设备业务数据
type BizContentGroup struct {
	// 设备链上Id
	//
	//
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty" require:"true"`
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

// 数据模型
type DataModel struct {
	//  数据模型Id
	DataModelId *string `json:"data_model_id,omitempty" xml:"data_model_id,omitempty" require:"true"`
	// 数据模型名称
	DataModelName *string `json:"data_model_name,omitempty" xml:"data_model_name,omitempty"`
	// 数据模型
	DataModel *string `json:"data_model,omitempty" xml:"data_model,omitempty" require:"true"`
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

// 设备类型
type Device struct {
	// 设备实体唯一Id
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

type CreateDeviceDatamodelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据模型
	DataModel *string `json:"data_model,omitempty" xml:"data_model,omitempty" require:"true"`
	// 数据模型名称
	DataModelName *string `json:"data_model_name,omitempty" xml:"data_model_name,omitempty"`
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
	DeviceTypeCode *int64 `json:"device_type_code,omitempty" xml:"device_type_code,omitempty"`
	// 设备单价 单位：分
	InitialPrice *int64 `json:"initial_price,omitempty" xml:"initial_price,omitempty"`
	// 出厂时间
	FactoryTime *string `json:"factory_time,omitempty" xml:"factory_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 投放时间
	ReleaseTime *string `json:"release_time,omitempty" xml:"release_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 设备型号
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty"`
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
	DeviceImei *string `json:"device_imei,omitempty" xml:"device_imei,omitempty" require:"true"`
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

type SendCollectorBychainidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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
	DeviceTypeCode *int64 `json:"device_type_code,omitempty" xml:"device_type_code,omitempty"`
	// 设备单价 单位：分
	InitialPrice *int64 `json:"initial_price,omitempty" xml:"initial_price,omitempty"`
	// 出厂时间
	FactoryTime *string `json:"factory_time,omitempty" xml:"factory_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 投放时间
	ReleaseTime *string `json:"release_time,omitempty" xml:"release_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 设备型号
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty" require:"true"`
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
				"sdk_version":      tea.String("1.5.7"),
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
