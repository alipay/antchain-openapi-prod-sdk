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

// 无分组设备
type DeviceInfoNoGroup struct {
	// 物模型Id
	AliyunModelId *string `json:"aliyun_model_id,omitempty" xml:"aliyun_model_id,omitempty"`
	// 三元组
	DeviceMeta *string `json:"device_meta,omitempty" xml:"device_meta,omitempty"`
	// 设备拥有者Id
	DeviceOwnerId *string `json:"device_owner_id,omitempty" xml:"device_owner_id,omitempty"`
	// 设备安装信息
	DeviceSetupInfo *string `json:"device_setup_info,omitempty" xml:"device_setup_info,omitempty"`
	// 设备类型【ALIDEV：阿里云设备，CHAINMACDEV：链机设备，M2MDEV：M2M设备，OTHERDEV：其他设备】
	//
	DeviceType *string `json:"device_type,omitempty" xml:"device_type,omitempty"`
	// 设备使用者Id
	DeviceUserIdList []*string `json:"device_user_id_list,omitempty" xml:"device_user_id_list,omitempty" type:"Repeated"`
	// 设备虚拟id
	DeviceVirtualId *string `json:"device_virtual_id,omitempty" xml:"device_virtual_id,omitempty"`
	// 智能版本
	SmartVersion *string `json:"smart_version,omitempty" xml:"smart_version,omitempty"`
	// 设备状态 【READY：未启用，STARTED：已启用，LOADING：信息待完善，DELETED：已注销， ALL：全部】
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 库位Id
	StockPositionIdList []*string `json:"stock_position_id_list,omitempty" xml:"stock_position_id_list,omitempty" type:"Repeated"`
	// 库位名称
	StockPositionNameList []*string `json:"stock_position_name_list,omitempty" xml:"stock_position_name_list,omitempty" type:"Repeated"`
	// 设备id
	ThingsDid *string `json:"things_did,omitempty" xml:"things_did,omitempty"`
	// 设备名称
	ThingsName *string `json:"things_name,omitempty" xml:"things_name,omitempty"`
	// 视频流地址
	VideoUrl *string `json:"video_url,omitempty" xml:"video_url,omitempty"`
	// 仓库Id
	WarehouseId *string `json:"warehouse_id,omitempty" xml:"warehouse_id,omitempty"`
	// 仓库名称
	WarehouseName *string `json:"warehouse_name,omitempty" xml:"warehouse_name,omitempty"`
}

func (s DeviceInfoNoGroup) String() string {
	return tea.Prettify(s)
}

func (s DeviceInfoNoGroup) GoString() string {
	return s.String()
}

func (s *DeviceInfoNoGroup) SetAliyunModelId(v string) *DeviceInfoNoGroup {
	s.AliyunModelId = &v
	return s
}

func (s *DeviceInfoNoGroup) SetDeviceMeta(v string) *DeviceInfoNoGroup {
	s.DeviceMeta = &v
	return s
}

func (s *DeviceInfoNoGroup) SetDeviceOwnerId(v string) *DeviceInfoNoGroup {
	s.DeviceOwnerId = &v
	return s
}

func (s *DeviceInfoNoGroup) SetDeviceSetupInfo(v string) *DeviceInfoNoGroup {
	s.DeviceSetupInfo = &v
	return s
}

func (s *DeviceInfoNoGroup) SetDeviceType(v string) *DeviceInfoNoGroup {
	s.DeviceType = &v
	return s
}

func (s *DeviceInfoNoGroup) SetDeviceUserIdList(v []*string) *DeviceInfoNoGroup {
	s.DeviceUserIdList = v
	return s
}

func (s *DeviceInfoNoGroup) SetDeviceVirtualId(v string) *DeviceInfoNoGroup {
	s.DeviceVirtualId = &v
	return s
}

func (s *DeviceInfoNoGroup) SetSmartVersion(v string) *DeviceInfoNoGroup {
	s.SmartVersion = &v
	return s
}

func (s *DeviceInfoNoGroup) SetStatus(v string) *DeviceInfoNoGroup {
	s.Status = &v
	return s
}

func (s *DeviceInfoNoGroup) SetStockPositionIdList(v []*string) *DeviceInfoNoGroup {
	s.StockPositionIdList = v
	return s
}

func (s *DeviceInfoNoGroup) SetStockPositionNameList(v []*string) *DeviceInfoNoGroup {
	s.StockPositionNameList = v
	return s
}

func (s *DeviceInfoNoGroup) SetThingsDid(v string) *DeviceInfoNoGroup {
	s.ThingsDid = &v
	return s
}

func (s *DeviceInfoNoGroup) SetThingsName(v string) *DeviceInfoNoGroup {
	s.ThingsName = &v
	return s
}

func (s *DeviceInfoNoGroup) SetVideoUrl(v string) *DeviceInfoNoGroup {
	s.VideoUrl = &v
	return s
}

func (s *DeviceInfoNoGroup) SetWarehouseId(v string) *DeviceInfoNoGroup {
	s.WarehouseId = &v
	return s
}

func (s *DeviceInfoNoGroup) SetWarehouseName(v string) *DeviceInfoNoGroup {
	s.WarehouseName = &v
	return s
}

// 船运箱子详情结构体
type CargoTank struct {
	// 箱号
	BoxNo *string `json:"box_no,omitempty" xml:"box_no,omitempty" require:"true"`
	// 铅封号
	//
	LeadSealingNo *string `json:"lead_sealing_no,omitempty" xml:"lead_sealing_no,omitempty" require:"true"`
	// 箱型
	BoxType *string `json:"box_type,omitempty" xml:"box_type,omitempty" require:"true"`
	// 重量
	BoxWeight *string `json:"box_weight,omitempty" xml:"box_weight,omitempty" require:"true"`
}

func (s CargoTank) String() string {
	return tea.Prettify(s)
}

func (s CargoTank) GoString() string {
	return s.String()
}

func (s *CargoTank) SetBoxNo(v string) *CargoTank {
	s.BoxNo = &v
	return s
}

func (s *CargoTank) SetLeadSealingNo(v string) *CargoTank {
	s.LeadSealingNo = &v
	return s
}

func (s *CargoTank) SetBoxType(v string) *CargoTank {
	s.BoxType = &v
	return s
}

func (s *CargoTank) SetBoxWeight(v string) *CargoTank {
	s.BoxWeight = &v
	return s
}

// 操作信息
type FlowNode struct {
	// 序号
	Index *int64 `json:"index,omitempty" xml:"index,omitempty"`
	// 操作类型【CREATE：创建入库申请，AUDIT：保管人审核，ALLOCATE：审核拒绝，STORAGE：入库，COMPLETE：完成】
	//
	//
	//
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 流程节点状态【 PASS：成功，FAIL：失败，ACTIVE：激活，INACTIVE：未激活】
	State *string `json:"state,omitempty" xml:"state,omitempty"`
	// 操作时间，单位：ms
	OperateTime *int64 `json:"operate_time,omitempty" xml:"operate_time,omitempty"`
	// 备注
	Comment *string `json:"comment,omitempty" xml:"comment,omitempty"`
}

func (s FlowNode) String() string {
	return tea.Prettify(s)
}

func (s FlowNode) GoString() string {
	return s.String()
}

func (s *FlowNode) SetIndex(v int64) *FlowNode {
	s.Index = &v
	return s
}

func (s *FlowNode) SetType(v string) *FlowNode {
	s.Type = &v
	return s
}

func (s *FlowNode) SetState(v string) *FlowNode {
	s.State = &v
	return s
}

func (s *FlowNode) SetOperateTime(v int64) *FlowNode {
	s.OperateTime = &v
	return s
}

func (s *FlowNode) SetComment(v string) *FlowNode {
	s.Comment = &v
	return s
}

// 区块链信息
type BlockchainInfo struct {
	// hash值
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 时间戳
	TxTime *int64 `json:"tx_time,omitempty" xml:"tx_time,omitempty"`
}

func (s BlockchainInfo) String() string {
	return tea.Prettify(s)
}

func (s BlockchainInfo) GoString() string {
	return s.String()
}

func (s *BlockchainInfo) SetTxHash(v string) *BlockchainInfo {
	s.TxHash = &v
	return s
}

func (s *BlockchainInfo) SetTxTime(v int64) *BlockchainInfo {
	s.TxTime = &v
	return s
}

// 流程信息
type FlowInfo struct {
	// 备注
	Comment *string `json:"comment,omitempty" xml:"comment,omitempty"`
	// 操作时间
	OperateTime *string `json:"operate_time,omitempty" xml:"operate_time,omitempty"`
	// 操作人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
	// 操作状态【NONE,WAITING,AGREED,REJECTED,CANCELED,ALL】
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s FlowInfo) String() string {
	return tea.Prettify(s)
}

func (s FlowInfo) GoString() string {
	return s.String()
}

func (s *FlowInfo) SetComment(v string) *FlowInfo {
	s.Comment = &v
	return s
}

func (s *FlowInfo) SetOperateTime(v string) *FlowInfo {
	s.OperateTime = &v
	return s
}

func (s *FlowInfo) SetOperator(v string) *FlowInfo {
	s.Operator = &v
	return s
}

func (s *FlowInfo) SetStatus(v string) *FlowInfo {
	s.Status = &v
	return s
}

// 字典信息
type TemplateDataConverter struct {
	// 货物品类
	CommodityCategory *string `json:"commodity_category,omitempty" xml:"commodity_category,omitempty" require:"true"`
	// 仓单的生成时间
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 仓储方名称或ID，提交的时候使用ID，展示使用名称
	CustodianCorp *string `json:"custodian_corp,omitempty" xml:"custodian_corp,omitempty"`
	// 存货人名称或ID，提交的时候使用ID，展示使用名称
	CustomerCorp *string `json:"customer_corp,omitempty" xml:"customer_corp,omitempty"`
	// 其他字典定制信息
	CustomData *string `json:"custom_data,omitempty" xml:"custom_data,omitempty"`
	// 是否补仓
	IsSupplement *bool `json:"is_supplement,omitempty" xml:"is_supplement,omitempty" require:"true"`
	// 联盟ID
	LeagueId *string `json:"league_id,omitempty" xml:"league_id,omitempty" require:"true"`
	// 联盟名称
	LeagueName *string `json:"league_name,omitempty" xml:"league_name,omitempty" require:"true"`
	// 资金方名称或ID，提交的时候使用ID，展示使用名称
	LenderCorp *string `json:"lender_corp,omitempty" xml:"lender_corp,omitempty"`
	// 仓位ID列表
	Position []*string `json:"position,omitempty" xml:"position,omitempty" type:"Repeated"`
	// 预分配仓位ID列表
	PrePosition []*string `json:"pre_position,omitempty" xml:"pre_position,omitempty" type:"Repeated"`
	// 预分配仓库名称或ID，提交的时候使用ID，展示使用名称
	PreWarehouseName *string `json:"pre_warehouse_name,omitempty" xml:"pre_warehouse_name,omitempty"`
	// 数量
	Quantity *int64 `json:"quantity,omitempty" xml:"quantity,omitempty" require:"true"`
	// 数量单位
	QuantityUnit *string `json:"quantity_unit,omitempty" xml:"quantity_unit,omitempty" require:"true"`
	// 物权方
	RealRightName *string `json:"real_right_name,omitempty" xml:"real_right_name,omitempty"`
	// 仓单状态
	State *string `json:"state,omitempty" xml:"state,omitempty"`
	// 补仓仓单ID
	SupplementWarehouseReceiptId *string `json:"supplement_warehouse_receipt_id,omitempty" xml:"supplement_warehouse_receipt_id,omitempty"`
	// 仓单更新时间
	UpdateTime *int64 `json:"update_time,omitempty" xml:"update_time,omitempty"`
	// 仓库名称或ID，提交的时候使用ID，展示使用名称
	WarehouseName *string `json:"warehouse_name,omitempty" xml:"warehouse_name,omitempty"`
	// 仓单ID
	WarehouseReceiptId *string `json:"warehouse_receipt_id,omitempty" xml:"warehouse_receipt_id,omitempty"`
	// 重量
	Weight *string `json:"weight,omitempty" xml:"weight,omitempty" require:"true"`
	// 重量单位
	WeightUnit *string `json:"weight_unit,omitempty" xml:"weight_unit,omitempty" require:"true"`
}

func (s TemplateDataConverter) String() string {
	return tea.Prettify(s)
}

func (s TemplateDataConverter) GoString() string {
	return s.String()
}

func (s *TemplateDataConverter) SetCommodityCategory(v string) *TemplateDataConverter {
	s.CommodityCategory = &v
	return s
}

func (s *TemplateDataConverter) SetCreateTime(v int64) *TemplateDataConverter {
	s.CreateTime = &v
	return s
}

func (s *TemplateDataConverter) SetCustodianCorp(v string) *TemplateDataConverter {
	s.CustodianCorp = &v
	return s
}

func (s *TemplateDataConverter) SetCustomerCorp(v string) *TemplateDataConverter {
	s.CustomerCorp = &v
	return s
}

func (s *TemplateDataConverter) SetCustomData(v string) *TemplateDataConverter {
	s.CustomData = &v
	return s
}

func (s *TemplateDataConverter) SetIsSupplement(v bool) *TemplateDataConverter {
	s.IsSupplement = &v
	return s
}

func (s *TemplateDataConverter) SetLeagueId(v string) *TemplateDataConverter {
	s.LeagueId = &v
	return s
}

func (s *TemplateDataConverter) SetLeagueName(v string) *TemplateDataConverter {
	s.LeagueName = &v
	return s
}

func (s *TemplateDataConverter) SetLenderCorp(v string) *TemplateDataConverter {
	s.LenderCorp = &v
	return s
}

func (s *TemplateDataConverter) SetPosition(v []*string) *TemplateDataConverter {
	s.Position = v
	return s
}

func (s *TemplateDataConverter) SetPrePosition(v []*string) *TemplateDataConverter {
	s.PrePosition = v
	return s
}

func (s *TemplateDataConverter) SetPreWarehouseName(v string) *TemplateDataConverter {
	s.PreWarehouseName = &v
	return s
}

func (s *TemplateDataConverter) SetQuantity(v int64) *TemplateDataConverter {
	s.Quantity = &v
	return s
}

func (s *TemplateDataConverter) SetQuantityUnit(v string) *TemplateDataConverter {
	s.QuantityUnit = &v
	return s
}

func (s *TemplateDataConverter) SetRealRightName(v string) *TemplateDataConverter {
	s.RealRightName = &v
	return s
}

func (s *TemplateDataConverter) SetState(v string) *TemplateDataConverter {
	s.State = &v
	return s
}

func (s *TemplateDataConverter) SetSupplementWarehouseReceiptId(v string) *TemplateDataConverter {
	s.SupplementWarehouseReceiptId = &v
	return s
}

func (s *TemplateDataConverter) SetUpdateTime(v int64) *TemplateDataConverter {
	s.UpdateTime = &v
	return s
}

func (s *TemplateDataConverter) SetWarehouseName(v string) *TemplateDataConverter {
	s.WarehouseName = &v
	return s
}

func (s *TemplateDataConverter) SetWarehouseReceiptId(v string) *TemplateDataConverter {
	s.WarehouseReceiptId = &v
	return s
}

func (s *TemplateDataConverter) SetWeight(v string) *TemplateDataConverter {
	s.Weight = &v
	return s
}

func (s *TemplateDataConverter) SetWeightUnit(v string) *TemplateDataConverter {
	s.WeightUnit = &v
	return s
}

// 联盟信息
type LeagueInfo struct {
	// 时间
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 联盟id
	LeagueId *string `json:"league_id,omitempty" xml:"league_id,omitempty"`
	// 联盟名称
	LeagueName *string `json:"league_name,omitempty" xml:"league_name,omitempty"`
	// 联盟描述
	LeagueDesc *string `json:"league_desc,omitempty" xml:"league_desc,omitempty"`
	// 联盟对应的物权平台产品
	ProductVersion *string `json:"product_version,omitempty" xml:"product_version,omitempty"`
}

func (s LeagueInfo) String() string {
	return tea.Prettify(s)
}

func (s LeagueInfo) GoString() string {
	return s.String()
}

func (s *LeagueInfo) SetCreateTime(v int64) *LeagueInfo {
	s.CreateTime = &v
	return s
}

func (s *LeagueInfo) SetLeagueId(v string) *LeagueInfo {
	s.LeagueId = &v
	return s
}

func (s *LeagueInfo) SetLeagueName(v string) *LeagueInfo {
	s.LeagueName = &v
	return s
}

func (s *LeagueInfo) SetLeagueDesc(v string) *LeagueInfo {
	s.LeagueDesc = &v
	return s
}

func (s *LeagueInfo) SetProductVersion(v string) *LeagueInfo {
	s.ProductVersion = &v
	return s
}

// 设备组
type DeviceGroup struct {
	// 设备组id
	GroupId *string `json:"group_id,omitempty" xml:"group_id,omitempty"`
	// 设备组名称
	GroupName *string `json:"group_name,omitempty" xml:"group_name,omitempty"`
	// 设备id
	ThingsDidList []*string `json:"things_did_list,omitempty" xml:"things_did_list,omitempty" type:"Repeated"`
	// 设备其他信息
	ThingsInfoList []*DeviceInfoNoGroup `json:"things_info_list,omitempty" xml:"things_info_list,omitempty" type:"Repeated"`
}

func (s DeviceGroup) String() string {
	return tea.Prettify(s)
}

func (s DeviceGroup) GoString() string {
	return s.String()
}

func (s *DeviceGroup) SetGroupId(v string) *DeviceGroup {
	s.GroupId = &v
	return s
}

func (s *DeviceGroup) SetGroupName(v string) *DeviceGroup {
	s.GroupName = &v
	return s
}

func (s *DeviceGroup) SetThingsDidList(v []*string) *DeviceGroup {
	s.ThingsDidList = v
	return s
}

func (s *DeviceGroup) SetThingsInfoList(v []*DeviceInfoNoGroup) *DeviceGroup {
	s.ThingsInfoList = v
	return s
}

// 物证信息
type EvidenceInfo struct {
	// 自定义序列
	BizId *int64 `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 资产id
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 请求信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 创建是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 短码
	QrCode *string `json:"qr_code,omitempty" xml:"qr_code,omitempty"`
}

func (s EvidenceInfo) String() string {
	return tea.Prettify(s)
}

func (s EvidenceInfo) GoString() string {
	return s.String()
}

func (s *EvidenceInfo) SetBizId(v int64) *EvidenceInfo {
	s.BizId = &v
	return s
}

func (s *EvidenceInfo) SetAssetId(v string) *EvidenceInfo {
	s.AssetId = &v
	return s
}

func (s *EvidenceInfo) SetMessage(v string) *EvidenceInfo {
	s.Message = &v
	return s
}

func (s *EvidenceInfo) SetSuccess(v bool) *EvidenceInfo {
	s.Success = &v
	return s
}

func (s *EvidenceInfo) SetQrCode(v string) *EvidenceInfo {
	s.QrCode = &v
	return s
}

// 融资利率结构体
type FinancialRateInfo struct {
	// 融资利率
	Rate *string `json:"rate,omitempty" xml:"rate,omitempty" require:"true"`
	// 起始-天
	StartDay *int64 `json:"start_day,omitempty" xml:"start_day,omitempty" require:"true"`
	// 终止-天
	EndDay *int64 `json:"end_day,omitempty" xml:"end_day,omitempty" require:"true"`
}

func (s FinancialRateInfo) String() string {
	return tea.Prettify(s)
}

func (s FinancialRateInfo) GoString() string {
	return s.String()
}

func (s *FinancialRateInfo) SetRate(v string) *FinancialRateInfo {
	s.Rate = &v
	return s
}

func (s *FinancialRateInfo) SetStartDay(v int64) *FinancialRateInfo {
	s.StartDay = &v
	return s
}

func (s *FinancialRateInfo) SetEndDay(v int64) *FinancialRateInfo {
	s.EndDay = &v
	return s
}

// 仓库信息
type WarehouseInfo struct {
	// 地址
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true"`
	// 平面图
	BlueprintUrl *string `json:"blueprint_url,omitempty" xml:"blueprint_url,omitempty" require:"true"`
	// 所在国家
	Country *string `json:"country,omitempty" xml:"country,omitempty" require:"true"`
	// 设备数量
	DeviceNum *int64 `json:"device_num,omitempty" xml:"device_num,omitempty" require:"true"`
	// 其他信息
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 纬度
	Latitude *string `json:"latitude,omitempty" xml:"latitude,omitempty" require:"true"`
	// 经度
	Longitude *string `json:"longitude,omitempty" xml:"longitude,omitempty" require:"true"`
	// 智能版本
	SmartLevel *string `json:"smart_level,omitempty" xml:"smart_level,omitempty" require:"true"`
	// 仓库状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 仓位数量
	StockPositionNum *int64 `json:"stock_position_num,omitempty" xml:"stock_position_num,omitempty" require:"true"`
	// 版本信息
	Version *string `json:"version,omitempty" xml:"version,omitempty" require:"true"`
	// 仓库面积
	WarehouseArea *string `json:"warehouse_area,omitempty" xml:"warehouse_area,omitempty" require:"true"`
	// 仓库高度
	WarehouseHeight *string `json:"warehouse_height,omitempty" xml:"warehouse_height,omitempty" require:"true"`
	// 仓库Id
	WarehouseId *string `json:"warehouse_id,omitempty" xml:"warehouse_id,omitempty" require:"true"`
	// 仓库名称
	WarehouseName *string `json:"warehouse_name,omitempty" xml:"warehouse_name,omitempty" require:"true"`
}

func (s WarehouseInfo) String() string {
	return tea.Prettify(s)
}

func (s WarehouseInfo) GoString() string {
	return s.String()
}

func (s *WarehouseInfo) SetAddress(v string) *WarehouseInfo {
	s.Address = &v
	return s
}

func (s *WarehouseInfo) SetBlueprintUrl(v string) *WarehouseInfo {
	s.BlueprintUrl = &v
	return s
}

func (s *WarehouseInfo) SetCountry(v string) *WarehouseInfo {
	s.Country = &v
	return s
}

func (s *WarehouseInfo) SetDeviceNum(v int64) *WarehouseInfo {
	s.DeviceNum = &v
	return s
}

func (s *WarehouseInfo) SetExtraInfo(v string) *WarehouseInfo {
	s.ExtraInfo = &v
	return s
}

func (s *WarehouseInfo) SetLatitude(v string) *WarehouseInfo {
	s.Latitude = &v
	return s
}

func (s *WarehouseInfo) SetLongitude(v string) *WarehouseInfo {
	s.Longitude = &v
	return s
}

func (s *WarehouseInfo) SetSmartLevel(v string) *WarehouseInfo {
	s.SmartLevel = &v
	return s
}

func (s *WarehouseInfo) SetStatus(v string) *WarehouseInfo {
	s.Status = &v
	return s
}

func (s *WarehouseInfo) SetStockPositionNum(v int64) *WarehouseInfo {
	s.StockPositionNum = &v
	return s
}

func (s *WarehouseInfo) SetVersion(v string) *WarehouseInfo {
	s.Version = &v
	return s
}

func (s *WarehouseInfo) SetWarehouseArea(v string) *WarehouseInfo {
	s.WarehouseArea = &v
	return s
}

func (s *WarehouseInfo) SetWarehouseHeight(v string) *WarehouseInfo {
	s.WarehouseHeight = &v
	return s
}

func (s *WarehouseInfo) SetWarehouseId(v string) *WarehouseInfo {
	s.WarehouseId = &v
	return s
}

func (s *WarehouseInfo) SetWarehouseName(v string) *WarehouseInfo {
	s.WarehouseName = &v
	return s
}

// 角色
type Role struct {
	// 企业名称
	FirmName *string `json:"firm_name,omitempty" xml:"firm_name,omitempty"`
	// 蚂蚁金融科技租户ID
	OpenTenant *string `json:"open_tenant,omitempty" xml:"open_tenant,omitempty"`
	// 角色类型【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
	RoleType *string `json:"role_type,omitempty" xml:"role_type,omitempty"`
}

func (s Role) String() string {
	return tea.Prettify(s)
}

func (s Role) GoString() string {
	return s.String()
}

func (s *Role) SetFirmName(v string) *Role {
	s.FirmName = &v
	return s
}

func (s *Role) SetOpenTenant(v string) *Role {
	s.OpenTenant = &v
	return s
}

func (s *Role) SetRoleType(v string) *Role {
	s.RoleType = &v
	return s
}

// 物流运单信息详情结构体
type OrderInfo struct {
	// 运单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 船名
	ShipName *string `json:"ship_name,omitempty" xml:"ship_name,omitempty" require:"true"`
	// 航次
	VoyageNo *string `json:"voyage_no,omitempty" xml:"voyage_no,omitempty" require:"true"`
	// 起始地
	OriginalPlace *string `json:"original_place,omitempty" xml:"original_place,omitempty" require:"true"`
	// 目的地
	DestPlace *string `json:"dest_place,omitempty" xml:"dest_place,omitempty" require:"true"`
	// 离港时间
	LeaveDate *string `json:"leave_date,omitempty" xml:"leave_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 预计到港时间
	EstArriDate *string `json:"est_arri_date,omitempty" xml:"est_arri_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 实际到港时间
	ActualArriDate *string `json:"actual_arri_date,omitempty" xml:"actual_arri_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 运单重量
	WaybillWeight *string `json:"waybill_weight,omitempty" xml:"waybill_weight,omitempty" require:"true"`
	// 船运箱子详情列表
	CargoTankList []*CargoTank `json:"cargo_tank_list,omitempty" xml:"cargo_tank_list,omitempty" require:"true" type:"Repeated"`
	// 委托人信息
	GrantorInfo []*string `json:"grantor_info,omitempty" xml:"grantor_info,omitempty" require:"true" type:"Repeated"`
	// 收货人信息
	ConsigneeInfo []*string `json:"consignee_info,omitempty" xml:"consignee_info,omitempty" require:"true" type:"Repeated"`
	// 运单附件
	Attachment *string `json:"attachment,omitempty" xml:"attachment,omitempty" require:"true"`
	// 物流状态:
	// 1-->已离开港口;
	// 2-->已到达港口;
	LogisticsStatus *int64 `json:"logistics_status,omitempty" xml:"logistics_status,omitempty" require:"true"`
}

func (s OrderInfo) String() string {
	return tea.Prettify(s)
}

func (s OrderInfo) GoString() string {
	return s.String()
}

func (s *OrderInfo) SetOrderNo(v string) *OrderInfo {
	s.OrderNo = &v
	return s
}

func (s *OrderInfo) SetShipName(v string) *OrderInfo {
	s.ShipName = &v
	return s
}

func (s *OrderInfo) SetVoyageNo(v string) *OrderInfo {
	s.VoyageNo = &v
	return s
}

func (s *OrderInfo) SetOriginalPlace(v string) *OrderInfo {
	s.OriginalPlace = &v
	return s
}

func (s *OrderInfo) SetDestPlace(v string) *OrderInfo {
	s.DestPlace = &v
	return s
}

func (s *OrderInfo) SetLeaveDate(v string) *OrderInfo {
	s.LeaveDate = &v
	return s
}

func (s *OrderInfo) SetEstArriDate(v string) *OrderInfo {
	s.EstArriDate = &v
	return s
}

func (s *OrderInfo) SetActualArriDate(v string) *OrderInfo {
	s.ActualArriDate = &v
	return s
}

func (s *OrderInfo) SetWaybillWeight(v string) *OrderInfo {
	s.WaybillWeight = &v
	return s
}

func (s *OrderInfo) SetCargoTankList(v []*CargoTank) *OrderInfo {
	s.CargoTankList = v
	return s
}

func (s *OrderInfo) SetGrantorInfo(v []*string) *OrderInfo {
	s.GrantorInfo = v
	return s
}

func (s *OrderInfo) SetConsigneeInfo(v []*string) *OrderInfo {
	s.ConsigneeInfo = v
	return s
}

func (s *OrderInfo) SetAttachment(v string) *OrderInfo {
	s.Attachment = &v
	return s
}

func (s *OrderInfo) SetLogisticsStatus(v int64) *OrderInfo {
	s.LogisticsStatus = &v
	return s
}

// 用户明细清单
type UserDetail struct {
	// 融资编号
	FinancingNo *string `json:"financing_no,omitempty" xml:"financing_no,omitempty" require:"true"`
	// 分润金额，乘过分润比例，到记账日的累计值
	DividedAmount *int64 `json:"divided_amount,omitempty" xml:"divided_amount,omitempty" require:"true"`
	// 分润比例，保留两位小数
	DividedRate *string `json:"divided_rate,omitempty" xml:"divided_rate,omitempty" require:"true"`
	// 罚息金额
	PenaltyAmount *int64 `json:"penalty_amount,omitempty" xml:"penalty_amount,omitempty" require:"true"`
	// 角色编码
	RoleCode *string `json:"role_code,omitempty" xml:"role_code,omitempty" require:"true"`
	// 记账日期 yyyy-mm-dd
	AccountDate *string `json:"account_date,omitempty" xml:"account_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 当日还款金额
	Payment *int64 `json:"payment,omitempty" xml:"payment,omitempty" require:"true"`
	// 其他利润(操作费还款日时写到各方记录)
	OtherProfit *int64 `json:"other_profit,omitempty" xml:"other_profit,omitempty" require:"true"`
}

func (s UserDetail) String() string {
	return tea.Prettify(s)
}

func (s UserDetail) GoString() string {
	return s.String()
}

func (s *UserDetail) SetFinancingNo(v string) *UserDetail {
	s.FinancingNo = &v
	return s
}

func (s *UserDetail) SetDividedAmount(v int64) *UserDetail {
	s.DividedAmount = &v
	return s
}

func (s *UserDetail) SetDividedRate(v string) *UserDetail {
	s.DividedRate = &v
	return s
}

func (s *UserDetail) SetPenaltyAmount(v int64) *UserDetail {
	s.PenaltyAmount = &v
	return s
}

func (s *UserDetail) SetRoleCode(v string) *UserDetail {
	s.RoleCode = &v
	return s
}

func (s *UserDetail) SetAccountDate(v string) *UserDetail {
	s.AccountDate = &v
	return s
}

func (s *UserDetail) SetPayment(v int64) *UserDetail {
	s.Payment = &v
	return s
}

func (s *UserDetail) SetOtherProfit(v int64) *UserDetail {
	s.OtherProfit = &v
	return s
}

// 物权信息
type AssetInfo struct {
	// 资产Id
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 数据字典Id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty"`
	// 资产内容
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 链信息
	BlockchainInfo *BlockchainInfo `json:"blockchain_info,omitempty" xml:"blockchain_info,omitempty"`
	// 短码
	QrCode *string `json:"qr_code,omitempty" xml:"qr_code,omitempty"`
}

func (s AssetInfo) String() string {
	return tea.Prettify(s)
}

func (s AssetInfo) GoString() string {
	return s.String()
}

func (s *AssetInfo) SetAssetId(v string) *AssetInfo {
	s.AssetId = &v
	return s
}

func (s *AssetInfo) SetTemplateId(v string) *AssetInfo {
	s.TemplateId = &v
	return s
}

func (s *AssetInfo) SetContent(v string) *AssetInfo {
	s.Content = &v
	return s
}

func (s *AssetInfo) SetBlockchainInfo(v *BlockchainInfo) *AssetInfo {
	s.BlockchainInfo = v
	return s
}

func (s *AssetInfo) SetQrCode(v string) *AssetInfo {
	s.QrCode = &v
	return s
}

// 错误信息提示
type ErrorMessage struct {
	// 错误码
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 错误信息描述
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
}

func (s ErrorMessage) String() string {
	return tea.Prettify(s)
}

func (s ErrorMessage) GoString() string {
	return s.String()
}

func (s *ErrorMessage) SetErrorCode(v string) *ErrorMessage {
	s.ErrorCode = &v
	return s
}

func (s *ErrorMessage) SetErrorMsg(v string) *ErrorMessage {
	s.ErrorMsg = &v
	return s
}

// 角色对应分润比例
type RoleRatio struct {
	// 角色编号
	// 角色编号类型
	// 风险承担方：RISK_TAKER
	// 货物监管方：CARGO_SUPERVISION
	// 资金推荐方：CAPITAL_RECOMMEND
	// 融资推荐方：FUNDER_RECOMMEND
	// 运营管理方：MANAGEMENT
	// 技术支持方：TECHNICAL
	RoleCode *string `json:"role_code,omitempty" xml:"role_code,omitempty" require:"true"`
	// 分润比例，保留两位小数的百分比
	Ratio *string `json:"ratio,omitempty" xml:"ratio,omitempty" require:"true"`
}

func (s RoleRatio) String() string {
	return tea.Prettify(s)
}

func (s RoleRatio) GoString() string {
	return s.String()
}

func (s *RoleRatio) SetRoleCode(v string) *RoleRatio {
	s.RoleCode = &v
	return s
}

func (s *RoleRatio) SetRatio(v string) *RoleRatio {
	s.Ratio = &v
	return s
}

// 用户对账单
type UserStatement struct {
	// 融资编号
	FinancingNo *string `json:"financing_no,omitempty" xml:"financing_no,omitempty" require:"true"`
	// 产品编号，有的话返回
	ProductNo *string `json:"product_no,omitempty" xml:"product_no,omitempty" require:"true"`
	// 融资金额
	FinancialAmount *int64 `json:"financial_amount,omitempty" xml:"financial_amount,omitempty" require:"true"`
	// 分润比例，保留两位小数的百分比
	ProfitRate *string `json:"profit_rate,omitempty" xml:"profit_rate,omitempty" require:"true"`
	// 总分润金额，乘过分润比例
	TotalAmount *int64 `json:"total_amount,omitempty" xml:"total_amount,omitempty" require:"true"`
	// 角色名称，按上述角色名称约定
	RoleCode *string `json:"role_code,omitempty" xml:"role_code,omitempty" require:"true"`
	// 角色对应的企业
	CompanyNo *string `json:"company_no,omitempty" xml:"company_no,omitempty" require:"true"`
	// 记账日期 yyyy-MM-dd
	AccountDate *string `json:"account_date,omitempty" xml:"account_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s UserStatement) String() string {
	return tea.Prettify(s)
}

func (s UserStatement) GoString() string {
	return s.String()
}

func (s *UserStatement) SetFinancingNo(v string) *UserStatement {
	s.FinancingNo = &v
	return s
}

func (s *UserStatement) SetProductNo(v string) *UserStatement {
	s.ProductNo = &v
	return s
}

func (s *UserStatement) SetFinancialAmount(v int64) *UserStatement {
	s.FinancialAmount = &v
	return s
}

func (s *UserStatement) SetProfitRate(v string) *UserStatement {
	s.ProfitRate = &v
	return s
}

func (s *UserStatement) SetTotalAmount(v int64) *UserStatement {
	s.TotalAmount = &v
	return s
}

func (s *UserStatement) SetRoleCode(v string) *UserStatement {
	s.RoleCode = &v
	return s
}

func (s *UserStatement) SetCompanyNo(v string) *UserStatement {
	s.CompanyNo = &v
	return s
}

func (s *UserStatement) SetAccountDate(v string) *UserStatement {
	s.AccountDate = &v
	return s
}

// 文件信息
type DocumentInfo struct {
	// 文档Id
	DocumentId *string `json:"document_id,omitempty" xml:"document_id,omitempty"`
	// 类型【CONTRACT 合同, NOTE 票据, DOCUMENT 文件, UNKNOWN 未知】
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty"`
	// 文档名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 存证哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 存证时间
	TxTime *int64 `json:"tx_time,omitempty" xml:"tx_time,omitempty"`
	// 文件Url
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s DocumentInfo) String() string {
	return tea.Prettify(s)
}

func (s DocumentInfo) GoString() string {
	return s.String()
}

func (s *DocumentInfo) SetDocumentId(v string) *DocumentInfo {
	s.DocumentId = &v
	return s
}

func (s *DocumentInfo) SetFileType(v string) *DocumentInfo {
	s.FileType = &v
	return s
}

func (s *DocumentInfo) SetName(v string) *DocumentInfo {
	s.Name = &v
	return s
}

func (s *DocumentInfo) SetTxHash(v string) *DocumentInfo {
	s.TxHash = &v
	return s
}

func (s *DocumentInfo) SetTxTime(v int64) *DocumentInfo {
	s.TxTime = &v
	return s
}

func (s *DocumentInfo) SetUrl(v string) *DocumentInfo {
	s.Url = &v
	return s
}

// 用户
type AssetChainUser struct {
	// 申请Id
	ApplyId *string `json:"apply_id,omitempty" xml:"apply_id,omitempty"`
	// 联盟申请类型【NONE,JOIN,CREATE,ALL】
	ApplyType *string `json:"apply_type,omitempty" xml:"apply_type,omitempty"`
	// 当前联盟信息
	CurrentLeagueInfo *LeagueInfo `json:"current_league_info,omitempty" xml:"current_league_info,omitempty"`
	// 企业名称
	FirmName *string `json:"firm_name,omitempty" xml:"firm_name,omitempty"`
	// 申请流程状态【NONE,WAITING,AGREED,REJECTED,CANCELED,ALL】
	LeagueApplyStatus *string `json:"league_apply_status,omitempty" xml:"league_apply_status,omitempty"`
	// 是否是盟主
	LeagueLeader *bool `json:"league_leader,omitempty" xml:"league_leader,omitempty"`
	// 登录名
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
	// 蚂蚁金融科技租户ID
	OpenTenant *string `json:"open_tenant,omitempty" xml:"open_tenant,omitempty"`
	// 角色类型【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
	RoleType *string `json:"role_type,omitempty" xml:"role_type,omitempty"`
}

func (s AssetChainUser) String() string {
	return tea.Prettify(s)
}

func (s AssetChainUser) GoString() string {
	return s.String()
}

func (s *AssetChainUser) SetApplyId(v string) *AssetChainUser {
	s.ApplyId = &v
	return s
}

func (s *AssetChainUser) SetApplyType(v string) *AssetChainUser {
	s.ApplyType = &v
	return s
}

func (s *AssetChainUser) SetCurrentLeagueInfo(v *LeagueInfo) *AssetChainUser {
	s.CurrentLeagueInfo = v
	return s
}

func (s *AssetChainUser) SetFirmName(v string) *AssetChainUser {
	s.FirmName = &v
	return s
}

func (s *AssetChainUser) SetLeagueApplyStatus(v string) *AssetChainUser {
	s.LeagueApplyStatus = &v
	return s
}

func (s *AssetChainUser) SetLeagueLeader(v bool) *AssetChainUser {
	s.LeagueLeader = &v
	return s
}

func (s *AssetChainUser) SetLoginName(v string) *AssetChainUser {
	s.LoginName = &v
	return s
}

func (s *AssetChainUser) SetOpenTenant(v string) *AssetChainUser {
	s.OpenTenant = &v
	return s
}

func (s *AssetChainUser) SetRoleType(v string) *AssetChainUser {
	s.RoleType = &v
	return s
}

// 分配的仓位
type AllocLocationInfo struct {
	// 仓位ID
	LocationId *string `json:"location_id,omitempty" xml:"location_id,omitempty"`
	// 仓位名称
	LocationName *string `json:"location_name,omitempty" xml:"location_name,omitempty"`
	// 仓位容量
	Capacity *int64 `json:"capacity,omitempty" xml:"capacity,omitempty"`
	// 已用容量
	UsedCapacity *string `json:"used_capacity,omitempty" xml:"used_capacity,omitempty"`
	// 监控等级【VIDEOREGULATORY：视频监控】
	MonitorCapacity *string `json:"monitor_capacity,omitempty" xml:"monitor_capacity,omitempty"`
	// 监控水平【STANDARD：标准版，UPGRADED：升级版】
	MonitorLevel *string `json:"monitor_level,omitempty" xml:"monitor_level,omitempty"`
}

func (s AllocLocationInfo) String() string {
	return tea.Prettify(s)
}

func (s AllocLocationInfo) GoString() string {
	return s.String()
}

func (s *AllocLocationInfo) SetLocationId(v string) *AllocLocationInfo {
	s.LocationId = &v
	return s
}

func (s *AllocLocationInfo) SetLocationName(v string) *AllocLocationInfo {
	s.LocationName = &v
	return s
}

func (s *AllocLocationInfo) SetCapacity(v int64) *AllocLocationInfo {
	s.Capacity = &v
	return s
}

func (s *AllocLocationInfo) SetUsedCapacity(v string) *AllocLocationInfo {
	s.UsedCapacity = &v
	return s
}

func (s *AllocLocationInfo) SetMonitorCapacity(v string) *AllocLocationInfo {
	s.MonitorCapacity = &v
	return s
}

func (s *AllocLocationInfo) SetMonitorLevel(v string) *AllocLocationInfo {
	s.MonitorLevel = &v
	return s
}

// 阿里云模型
type AliyunModel struct {
	// 物模型类目名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 物模型类目Id
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
}

func (s AliyunModel) String() string {
	return tea.Prettify(s)
}

func (s AliyunModel) GoString() string {
	return s.String()
}

func (s *AliyunModel) SetName(v string) *AliyunModel {
	s.Name = &v
	return s
}

func (s *AliyunModel) SetId(v string) *AliyunModel {
	s.Id = &v
	return s
}

// 数据字典
type AssetTemplate struct {
	// 模板类型id
	CategoryId *string `json:"category_id,omitempty" xml:"category_id,omitempty"`
	// 模板内容
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 模板id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty"`
	// 模板名称
	TemplateName *string `json:"template_name,omitempty" xml:"template_name,omitempty"`
	// 是否生效
	Valid *bool `json:"valid,omitempty" xml:"valid,omitempty"`
	// 是否使用
	Used *bool `json:"used,omitempty" xml:"used,omitempty"`
	// 版本号
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
	// 联盟Id
	LeagueUid *string `json:"league_uid,omitempty" xml:"league_uid,omitempty"`
	// 标准数据字典
	Standard *bool `json:"standard,omitempty" xml:"standard,omitempty"`
}

func (s AssetTemplate) String() string {
	return tea.Prettify(s)
}

func (s AssetTemplate) GoString() string {
	return s.String()
}

func (s *AssetTemplate) SetCategoryId(v string) *AssetTemplate {
	s.CategoryId = &v
	return s
}

func (s *AssetTemplate) SetContent(v string) *AssetTemplate {
	s.Content = &v
	return s
}

func (s *AssetTemplate) SetTemplateId(v string) *AssetTemplate {
	s.TemplateId = &v
	return s
}

func (s *AssetTemplate) SetTemplateName(v string) *AssetTemplate {
	s.TemplateName = &v
	return s
}

func (s *AssetTemplate) SetValid(v bool) *AssetTemplate {
	s.Valid = &v
	return s
}

func (s *AssetTemplate) SetUsed(v bool) *AssetTemplate {
	s.Used = &v
	return s
}

func (s *AssetTemplate) SetVersion(v string) *AssetTemplate {
	s.Version = &v
	return s
}

func (s *AssetTemplate) SetLeagueUid(v string) *AssetTemplate {
	s.LeagueUid = &v
	return s
}

func (s *AssetTemplate) SetStandard(v bool) *AssetTemplate {
	s.Standard = &v
	return s
}

// 设备信息
type DeviceInfo struct {
	// 物模型Id
	AliyunModelId *string `json:"aliyun_model_id,omitempty" xml:"aliyun_model_id,omitempty"`
	// 设备组
	DeviceGroupList []*DeviceGroup `json:"device_group_list,omitempty" xml:"device_group_list,omitempty" type:"Repeated"`
	// 三元组
	DeviceMeta *string `json:"device_meta,omitempty" xml:"device_meta,omitempty"`
	// 设备拥有者Id
	DeviceOwnerId *string `json:"device_owner_id,omitempty" xml:"device_owner_id,omitempty"`
	// 设备安装信息
	DeviceSetupInfo *string `json:"device_setup_info,omitempty" xml:"device_setup_info,omitempty"`
	// 设备类型【ALIDEV：阿里云设备，CHAINMACDEV：链机设备，M2MDEV：M2M设备，OTHERDEV：其他设备】
	DeviceType *string `json:"device_type,omitempty" xml:"device_type,omitempty"`
	// 设备使用者Id
	DeviceUserIdList []*string `json:"device_user_id_list,omitempty" xml:"device_user_id_list,omitempty" type:"Repeated"`
	// 设备虚拟id
	DeviceVirtualId *string `json:"device_virtual_id,omitempty" xml:"device_virtual_id,omitempty"`
	// 智能版本
	SmartVersion *string `json:"smart_version,omitempty" xml:"smart_version,omitempty"`
	// 设备状态
	//     【READY：未启用，STARTED：已启用，LOADING：信息待完善，DELETED：已注销， ALL：全部】
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 库位Id
	StockPositionIdList []*string `json:"stock_position_id_list,omitempty" xml:"stock_position_id_list,omitempty" type:"Repeated"`
	// 库位名称
	StockPositionNameList []*string `json:"stock_position_name_list,omitempty" xml:"stock_position_name_list,omitempty" type:"Repeated"`
	// thingsDid
	ThingsDid *string `json:"things_did,omitempty" xml:"things_did,omitempty"`
	// 设备名称
	ThingsName *string `json:"things_name,omitempty" xml:"things_name,omitempty"`
	// 视频流地址
	VideoUrl *string `json:"video_url,omitempty" xml:"video_url,omitempty"`
	// 仓库Id
	WarehouseId *string `json:"warehouse_id,omitempty" xml:"warehouse_id,omitempty"`
	// 仓库名称
	WarehouseName *string `json:"warehouse_name,omitempty" xml:"warehouse_name,omitempty"`
}

func (s DeviceInfo) String() string {
	return tea.Prettify(s)
}

func (s DeviceInfo) GoString() string {
	return s.String()
}

func (s *DeviceInfo) SetAliyunModelId(v string) *DeviceInfo {
	s.AliyunModelId = &v
	return s
}

func (s *DeviceInfo) SetDeviceGroupList(v []*DeviceGroup) *DeviceInfo {
	s.DeviceGroupList = v
	return s
}

func (s *DeviceInfo) SetDeviceMeta(v string) *DeviceInfo {
	s.DeviceMeta = &v
	return s
}

func (s *DeviceInfo) SetDeviceOwnerId(v string) *DeviceInfo {
	s.DeviceOwnerId = &v
	return s
}

func (s *DeviceInfo) SetDeviceSetupInfo(v string) *DeviceInfo {
	s.DeviceSetupInfo = &v
	return s
}

func (s *DeviceInfo) SetDeviceType(v string) *DeviceInfo {
	s.DeviceType = &v
	return s
}

func (s *DeviceInfo) SetDeviceUserIdList(v []*string) *DeviceInfo {
	s.DeviceUserIdList = v
	return s
}

func (s *DeviceInfo) SetDeviceVirtualId(v string) *DeviceInfo {
	s.DeviceVirtualId = &v
	return s
}

func (s *DeviceInfo) SetSmartVersion(v string) *DeviceInfo {
	s.SmartVersion = &v
	return s
}

func (s *DeviceInfo) SetStatus(v string) *DeviceInfo {
	s.Status = &v
	return s
}

func (s *DeviceInfo) SetStockPositionIdList(v []*string) *DeviceInfo {
	s.StockPositionIdList = v
	return s
}

func (s *DeviceInfo) SetStockPositionNameList(v []*string) *DeviceInfo {
	s.StockPositionNameList = v
	return s
}

func (s *DeviceInfo) SetThingsDid(v string) *DeviceInfo {
	s.ThingsDid = &v
	return s
}

func (s *DeviceInfo) SetThingsName(v string) *DeviceInfo {
	s.ThingsName = &v
	return s
}

func (s *DeviceInfo) SetVideoUrl(v string) *DeviceInfo {
	s.VideoUrl = &v
	return s
}

func (s *DeviceInfo) SetWarehouseId(v string) *DeviceInfo {
	s.WarehouseId = &v
	return s
}

func (s *DeviceInfo) SetWarehouseName(v string) *DeviceInfo {
	s.WarehouseName = &v
	return s
}

// 联盟申请信息
type LeagueApplyInfo struct {
	// 申请账号
	ApplyAccount *string `json:"apply_account,omitempty" xml:"apply_account,omitempty"`
	// 申请企业
	ApplyCorp *string `json:"apply_corp,omitempty" xml:"apply_corp,omitempty"`
	// 申请Id
	ApplyId *string `json:"apply_id,omitempty" xml:"apply_id,omitempty"`
	// 申请人手机
	ApplyMobileNum *string `json:"apply_mobile_num,omitempty" xml:"apply_mobile_num,omitempty"`
	// 申请时间
	ApplyTime *string `json:"apply_time,omitempty" xml:"apply_time,omitempty"`
	// 申请类型【NONE,JOIN,CREATE,ALL】
	ApplyType *string `json:"apply_type,omitempty" xml:"apply_type,omitempty"`
	// 当前流程状态【NONE,WAITING,AGREED,REJECTED,CANCELED,ALL】
	CurrentStatus *string `json:"current_status,omitempty" xml:"current_status,omitempty"`
	// 流程历史
	FlowHistory []*FlowInfo `json:"flow_history,omitempty" xml:"flow_history,omitempty" type:"Repeated"`
	// 角色【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
	RoleType *string `json:"role_type,omitempty" xml:"role_type,omitempty"`
}

func (s LeagueApplyInfo) String() string {
	return tea.Prettify(s)
}

func (s LeagueApplyInfo) GoString() string {
	return s.String()
}

func (s *LeagueApplyInfo) SetApplyAccount(v string) *LeagueApplyInfo {
	s.ApplyAccount = &v
	return s
}

func (s *LeagueApplyInfo) SetApplyCorp(v string) *LeagueApplyInfo {
	s.ApplyCorp = &v
	return s
}

func (s *LeagueApplyInfo) SetApplyId(v string) *LeagueApplyInfo {
	s.ApplyId = &v
	return s
}

func (s *LeagueApplyInfo) SetApplyMobileNum(v string) *LeagueApplyInfo {
	s.ApplyMobileNum = &v
	return s
}

func (s *LeagueApplyInfo) SetApplyTime(v string) *LeagueApplyInfo {
	s.ApplyTime = &v
	return s
}

func (s *LeagueApplyInfo) SetApplyType(v string) *LeagueApplyInfo {
	s.ApplyType = &v
	return s
}

func (s *LeagueApplyInfo) SetCurrentStatus(v string) *LeagueApplyInfo {
	s.CurrentStatus = &v
	return s
}

func (s *LeagueApplyInfo) SetFlowHistory(v []*FlowInfo) *LeagueApplyInfo {
	s.FlowHistory = v
	return s
}

func (s *LeagueApplyInfo) SetRoleType(v string) *LeagueApplyInfo {
	s.RoleType = &v
	return s
}

// 注册仓单申请单
type RegisterWhReceiptSummary struct {
	// 注册仓单申请单ID
	RegisterWhReceiptId *string `json:"register_wh_receipt_id,omitempty" xml:"register_wh_receipt_id,omitempty"`
	// 仓单ID
	WarehouseReceiptId *string `json:"warehouse_receipt_id,omitempty" xml:"warehouse_receipt_id,omitempty"`
	// 注册仓单申请单状态【 NONE：无效状态，WAITING：待审核，AGREED：审核同意，REJECTED：审核拒绝，CANCELED：已取消，WAITING_PRE_ALLOC_POSITION：待预分配仓位，WAITING_TRANSACTION_IN：待入库，TRANSACTION_IN：入库中，FINISHED_TRANSACTION_IN：已入库/待确认，CONFIRMED_TRANSACTION_IN：完成入库，INTERRUPTION：已中断，ALL：所有状态】
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 申请时间，单位：ms
	ApplyTime *int64 `json:"apply_time,omitempty" xml:"apply_time,omitempty"`
	// 货物品类
	CommodityCategory *string `json:"commodity_category,omitempty" xml:"commodity_category,omitempty"`
	// 数量 + 单位
	Quantity *string `json:"quantity,omitempty" xml:"quantity,omitempty"`
	// 重量 + 单位
	Weight *string `json:"weight,omitempty" xml:"weight,omitempty"`
	// 存货人名称
	CustomerName *string `json:"customer_name,omitempty" xml:"customer_name,omitempty"`
	// 保管人名称
	CustodianName *string `json:"custodian_name,omitempty" xml:"custodian_name,omitempty"`
}

func (s RegisterWhReceiptSummary) String() string {
	return tea.Prettify(s)
}

func (s RegisterWhReceiptSummary) GoString() string {
	return s.String()
}

func (s *RegisterWhReceiptSummary) SetRegisterWhReceiptId(v string) *RegisterWhReceiptSummary {
	s.RegisterWhReceiptId = &v
	return s
}

func (s *RegisterWhReceiptSummary) SetWarehouseReceiptId(v string) *RegisterWhReceiptSummary {
	s.WarehouseReceiptId = &v
	return s
}

func (s *RegisterWhReceiptSummary) SetStatus(v string) *RegisterWhReceiptSummary {
	s.Status = &v
	return s
}

func (s *RegisterWhReceiptSummary) SetApplyTime(v int64) *RegisterWhReceiptSummary {
	s.ApplyTime = &v
	return s
}

func (s *RegisterWhReceiptSummary) SetCommodityCategory(v string) *RegisterWhReceiptSummary {
	s.CommodityCategory = &v
	return s
}

func (s *RegisterWhReceiptSummary) SetQuantity(v string) *RegisterWhReceiptSummary {
	s.Quantity = &v
	return s
}

func (s *RegisterWhReceiptSummary) SetWeight(v string) *RegisterWhReceiptSummary {
	s.Weight = &v
	return s
}

func (s *RegisterWhReceiptSummary) SetCustomerName(v string) *RegisterWhReceiptSummary {
	s.CustomerName = &v
	return s
}

func (s *RegisterWhReceiptSummary) SetCustodianName(v string) *RegisterWhReceiptSummary {
	s.CustodianName = &v
	return s
}

// 仓位使用情况
type StockPositionUsed struct {
	// 库位ID
	PositionId *string `json:"position_id,omitempty" xml:"position_id,omitempty" require:"true"`
	// 已用容量，百分比的数值，如50%，则为50
	UsedCapacity *int64 `json:"used_capacity,omitempty" xml:"used_capacity,omitempty" require:"true"`
}

func (s StockPositionUsed) String() string {
	return tea.Prettify(s)
}

func (s StockPositionUsed) GoString() string {
	return s.String()
}

func (s *StockPositionUsed) SetPositionId(v string) *StockPositionUsed {
	s.PositionId = &v
	return s
}

func (s *StockPositionUsed) SetUsedCapacity(v int64) *StockPositionUsed {
	s.UsedCapacity = &v
	return s
}

// 设备用户
type DeviceUser struct {
	// 用户id
	DeviceUserId *string `json:"device_user_id,omitempty" xml:"device_user_id,omitempty"`
	// 用户名称
	DeviceUserName *string `json:"device_user_name,omitempty" xml:"device_user_name,omitempty"`
	// 角色类型【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
	RoleType *string `json:"role_type,omitempty" xml:"role_type,omitempty"`
	// 权限(仅有设备所有权和设备使用权两种权限)
	Authority *string `json:"authority,omitempty" xml:"authority,omitempty"`
}

func (s DeviceUser) String() string {
	return tea.Prettify(s)
}

func (s DeviceUser) GoString() string {
	return s.String()
}

func (s *DeviceUser) SetDeviceUserId(v string) *DeviceUser {
	s.DeviceUserId = &v
	return s
}

func (s *DeviceUser) SetDeviceUserName(v string) *DeviceUser {
	s.DeviceUserName = &v
	return s
}

func (s *DeviceUser) SetRoleType(v string) *DeviceUser {
	s.RoleType = &v
	return s
}

func (s *DeviceUser) SetAuthority(v string) *DeviceUser {
	s.Authority = &v
	return s
}

// 角色企业Map信息
type RoleOrganization struct {
	// 企业编号
	CompanyNo *string `json:"company_no,omitempty" xml:"company_no,omitempty" require:"true"`
	// 企业名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" require:"true"`
	// 角色编码
	// 角色编码类型
	// 风险承担方：RISK_TAKER
	// 货物监管方：CARGO_SUPERVISION
	// 资金推荐方：CAPITAL_RECOMMEND
	// 融资推荐方：FUNDER_RECOMMEND
	// 运营管理方：MANAGEMENT
	// 技术支持方：TECHNICAL
	RoleCode *string `json:"role_code,omitempty" xml:"role_code,omitempty" require:"true"`
}

func (s RoleOrganization) String() string {
	return tea.Prettify(s)
}

func (s RoleOrganization) GoString() string {
	return s.String()
}

func (s *RoleOrganization) SetCompanyNo(v string) *RoleOrganization {
	s.CompanyNo = &v
	return s
}

func (s *RoleOrganization) SetCompanyName(v string) *RoleOrganization {
	s.CompanyName = &v
	return s
}

func (s *RoleOrganization) SetRoleCode(v string) *RoleOrganization {
	s.RoleCode = &v
	return s
}

// 溯源信息
type WarehouseReceiptTraceInfo struct {
	// string (enum: PICK_UP, WEAK_ASSET, WEAK_ASSET_TRANSFER, WAREHOUSE_RECEIPT_TRANSFER, WAREHOUSE_RECEIPT_REGISTER, PLEDGE_APPLICATION, PLEDGE_RELEASE, WAREHOUSE_RECEIPT_CANCEL, WAREHOUSE_RECEIPT_UPDATE)
	OperateType *string `json:"operate_type,omitempty" xml:"operate_type,omitempty"`
	// 操作标识
	OperateTypeDesc *string `json:"operate_type_desc,omitempty" xml:"operate_type_desc,omitempty"`
	// 操作时间
	OperateTime *int64 `json:"operate_time,omitempty" xml:"operate_time,omitempty"`
	// 区块链信息
	BlockchainInfo *BlockchainInfo `json:"blockchain_info,omitempty" xml:"blockchain_info,omitempty"`
	// 操作主体
	OperatorName *string `json:"operator_name,omitempty" xml:"operator_name,omitempty"`
	// string (enum: COMMIT, AGREE, REJECT, CREATE, START, PRE_ALLOC, ALLOC, UPLOAD, UPDATE, COMPLETE, CONFIRM, CONFIRM_COMMIT, CONFIRM_RECALL, TRIGGER, SPLIT, RECALL)
	ActionType *string `json:"action_type,omitempty" xml:"action_type,omitempty"`
	// 动作描述
	ActionDesc *string `json:"action_desc,omitempty" xml:"action_desc,omitempty"`
	// 操作对象
	OperateObject *string `json:"operate_object,omitempty" xml:"operate_object,omitempty"`
}

func (s WarehouseReceiptTraceInfo) String() string {
	return tea.Prettify(s)
}

func (s WarehouseReceiptTraceInfo) GoString() string {
	return s.String()
}

func (s *WarehouseReceiptTraceInfo) SetOperateType(v string) *WarehouseReceiptTraceInfo {
	s.OperateType = &v
	return s
}

func (s *WarehouseReceiptTraceInfo) SetOperateTypeDesc(v string) *WarehouseReceiptTraceInfo {
	s.OperateTypeDesc = &v
	return s
}

func (s *WarehouseReceiptTraceInfo) SetOperateTime(v int64) *WarehouseReceiptTraceInfo {
	s.OperateTime = &v
	return s
}

func (s *WarehouseReceiptTraceInfo) SetBlockchainInfo(v *BlockchainInfo) *WarehouseReceiptTraceInfo {
	s.BlockchainInfo = v
	return s
}

func (s *WarehouseReceiptTraceInfo) SetOperatorName(v string) *WarehouseReceiptTraceInfo {
	s.OperatorName = &v
	return s
}

func (s *WarehouseReceiptTraceInfo) SetActionType(v string) *WarehouseReceiptTraceInfo {
	s.ActionType = &v
	return s
}

func (s *WarehouseReceiptTraceInfo) SetActionDesc(v string) *WarehouseReceiptTraceInfo {
	s.ActionDesc = &v
	return s
}

func (s *WarehouseReceiptTraceInfo) SetOperateObject(v string) *WarehouseReceiptTraceInfo {
	s.OperateObject = &v
	return s
}

// 快照
type ScreenShot struct {
	// id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// url
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty"`
	// 时间
	ScreenshotTime *int64 `json:"screenshot_time,omitempty" xml:"screenshot_time,omitempty"`
	// 上链txHash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 设备名称
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty"`
	// 关联仓位名称列表
	LocationNameList []*string `json:"location_name_list,omitempty" xml:"location_name_list,omitempty" type:"Repeated"`
}

func (s ScreenShot) String() string {
	return tea.Prettify(s)
}

func (s ScreenShot) GoString() string {
	return s.String()
}

func (s *ScreenShot) SetFileId(v string) *ScreenShot {
	s.FileId = &v
	return s
}

func (s *ScreenShot) SetFileUrl(v string) *ScreenShot {
	s.FileUrl = &v
	return s
}

func (s *ScreenShot) SetScreenshotTime(v int64) *ScreenShot {
	s.ScreenshotTime = &v
	return s
}

func (s *ScreenShot) SetTxHash(v string) *ScreenShot {
	s.TxHash = &v
	return s
}

func (s *ScreenShot) SetDeviceName(v string) *ScreenShot {
	s.DeviceName = &v
	return s
}

func (s *ScreenShot) SetLocationNameList(v []*string) *ScreenShot {
	s.LocationNameList = v
	return s
}

// 罚息利率结构体
type PenaltyRateInfo struct {
	// 罚息
	Rate *string `json:"rate,omitempty" xml:"rate,omitempty" require:"true"`
	// 起始-天
	StartDay *int64 `json:"start_day,omitempty" xml:"start_day,omitempty" require:"true"`
	// 终止-天
	EndDay *int64 `json:"end_day,omitempty" xml:"end_day,omitempty" require:"true"`
}

func (s PenaltyRateInfo) String() string {
	return tea.Prettify(s)
}

func (s PenaltyRateInfo) GoString() string {
	return s.String()
}

func (s *PenaltyRateInfo) SetRate(v string) *PenaltyRateInfo {
	s.Rate = &v
	return s
}

func (s *PenaltyRateInfo) SetStartDay(v int64) *PenaltyRateInfo {
	s.StartDay = &v
	return s
}

func (s *PenaltyRateInfo) SetEndDay(v int64) *PenaltyRateInfo {
	s.EndDay = &v
	return s
}

// 库位信息
type StorageLocation struct {
	// 仓位容量
	Capacity *string `json:"capacity,omitempty" xml:"capacity,omitempty"`
	// 设备id
	DeviceIdList []*string `json:"device_id_list,omitempty" xml:"device_id_list,omitempty" type:"Repeated"`
	// 其他信息
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 库位id
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 监控等级【VIDEOREGULATORY：视频监控】
	MonitorCapacity *string `json:"monitor_capacity,omitempty" xml:"monitor_capacity,omitempty"`
	// 监控水平【STANDARD：标准版，UPGRADED：升级版】
	MonitorLevel *string `json:"monitor_level,omitempty" xml:"monitor_level,omitempty"`
	// 库位名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 货物类型【DANGER：危险品，NON_DANGER：非危险品，FOOD：食品】
	//
	ProductType *string `json:"product_type,omitempty" xml:"product_type,omitempty"`
	// 状态【AVAILABLE：可用，IN_USE：使用中，IN_CONFIG：配置中，DELETED：已删除】
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 仓位面积
	StorageLocationArea *string `json:"storage_location_area,omitempty" xml:"storage_location_area,omitempty"`
	// 仓位高度
	StorageLocationHeight *string `json:"storage_location_height,omitempty" xml:"storage_location_height,omitempty"`
	// 库位类型【CHILL：冷藏，FREEZE：冷冻，PASSAGE：通道，FLAT：平面， STEREO：立体】
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 已用容量
	UsedCapacity *string `json:"used_capacity,omitempty" xml:"used_capacity,omitempty"`
	// 库位虚拟id
	VirtualId *string `json:"virtual_id,omitempty" xml:"virtual_id,omitempty"`
	// 仓库Id
	WarehouseId *string `json:"warehouse_id,omitempty" xml:"warehouse_id,omitempty"`
	// 关联仓单Id
	WarehouseReceiptId *string `json:"warehouse_receipt_id,omitempty" xml:"warehouse_receipt_id,omitempty"`
}

func (s StorageLocation) String() string {
	return tea.Prettify(s)
}

func (s StorageLocation) GoString() string {
	return s.String()
}

func (s *StorageLocation) SetCapacity(v string) *StorageLocation {
	s.Capacity = &v
	return s
}

func (s *StorageLocation) SetDeviceIdList(v []*string) *StorageLocation {
	s.DeviceIdList = v
	return s
}

func (s *StorageLocation) SetExtraInfo(v string) *StorageLocation {
	s.ExtraInfo = &v
	return s
}

func (s *StorageLocation) SetId(v string) *StorageLocation {
	s.Id = &v
	return s
}

func (s *StorageLocation) SetMonitorCapacity(v string) *StorageLocation {
	s.MonitorCapacity = &v
	return s
}

func (s *StorageLocation) SetMonitorLevel(v string) *StorageLocation {
	s.MonitorLevel = &v
	return s
}

func (s *StorageLocation) SetName(v string) *StorageLocation {
	s.Name = &v
	return s
}

func (s *StorageLocation) SetProductType(v string) *StorageLocation {
	s.ProductType = &v
	return s
}

func (s *StorageLocation) SetStatus(v string) *StorageLocation {
	s.Status = &v
	return s
}

func (s *StorageLocation) SetStorageLocationArea(v string) *StorageLocation {
	s.StorageLocationArea = &v
	return s
}

func (s *StorageLocation) SetStorageLocationHeight(v string) *StorageLocation {
	s.StorageLocationHeight = &v
	return s
}

func (s *StorageLocation) SetType(v string) *StorageLocation {
	s.Type = &v
	return s
}

func (s *StorageLocation) SetUsedCapacity(v string) *StorageLocation {
	s.UsedCapacity = &v
	return s
}

func (s *StorageLocation) SetVirtualId(v string) *StorageLocation {
	s.VirtualId = &v
	return s
}

func (s *StorageLocation) SetWarehouseId(v string) *StorageLocation {
	s.WarehouseId = &v
	return s
}

func (s *StorageLocation) SetWarehouseReceiptId(v string) *StorageLocation {
	s.WarehouseReceiptId = &v
	return s
}

// 用户信息
type ThirdPartyUser struct {
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
	// 联盟id
	LeagueUid *string `json:"league_uid,omitempty" xml:"league_uid,omitempty"`
	// 创建时间
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s ThirdPartyUser) String() string {
	return tea.Prettify(s)
}

func (s ThirdPartyUser) GoString() string {
	return s.String()
}

func (s *ThirdPartyUser) SetUserId(v string) *ThirdPartyUser {
	s.UserId = &v
	return s
}

func (s *ThirdPartyUser) SetUserName(v string) *ThirdPartyUser {
	s.UserName = &v
	return s
}

func (s *ThirdPartyUser) SetLeagueUid(v string) *ThirdPartyUser {
	s.LeagueUid = &v
	return s
}

func (s *ThirdPartyUser) SetCreateTime(v string) *ThirdPartyUser {
	s.CreateTime = &v
	return s
}

// 资产操作结果
type AssetResult struct {
	// 资产id
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s AssetResult) String() string {
	return tea.Prettify(s)
}

func (s AssetResult) GoString() string {
	return s.String()
}

func (s *AssetResult) SetAssetId(v string) *AssetResult {
	s.AssetId = &v
	return s
}

func (s *AssetResult) SetSuccess(v bool) *AssetResult {
	s.Success = &v
	return s
}

func (s *AssetResult) SetMessage(v string) *AssetResult {
	s.Message = &v
	return s
}

// 操作费单价结构体
type OpeUnitPriceInfo struct {
	// 操作费单价 （分）
	UnitPrice *int64 `json:"unit_price,omitempty" xml:"unit_price,omitempty" require:"true"`
	// 起始-天 （-999 表示无日期限制）
	StartDay *int64 `json:"start_day,omitempty" xml:"start_day,omitempty" require:"true"`
	// 终止-天 （-999 表示无日期限制）
	EndDay *int64 `json:"end_day,omitempty" xml:"end_day,omitempty" require:"true"`
}

func (s OpeUnitPriceInfo) String() string {
	return tea.Prettify(s)
}

func (s OpeUnitPriceInfo) GoString() string {
	return s.String()
}

func (s *OpeUnitPriceInfo) SetUnitPrice(v int64) *OpeUnitPriceInfo {
	s.UnitPrice = &v
	return s
}

func (s *OpeUnitPriceInfo) SetStartDay(v int64) *OpeUnitPriceInfo {
	s.StartDay = &v
	return s
}

func (s *OpeUnitPriceInfo) SetEndDay(v int64) *OpeUnitPriceInfo {
	s.EndDay = &v
	return s
}

// 数据字典信息
type TemplateInfo struct {
	// 数据字id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty"`
	// 数据字典名称
	TemplateName *string `json:"template_name,omitempty" xml:"template_name,omitempty"`
	// 数据字典内容
	Template *string `json:"template,omitempty" xml:"template,omitempty"`
}

func (s TemplateInfo) String() string {
	return tea.Prettify(s)
}

func (s TemplateInfo) GoString() string {
	return s.String()
}

func (s *TemplateInfo) SetTemplateId(v string) *TemplateInfo {
	s.TemplateId = &v
	return s
}

func (s *TemplateInfo) SetTemplateName(v string) *TemplateInfo {
	s.TemplateName = &v
	return s
}

func (s *TemplateInfo) SetTemplate(v string) *TemplateInfo {
	s.Template = &v
	return s
}

// 总对账单
type TotalStatement struct {
	// 企业编号
	CompanyNo *string `json:"company_no,omitempty" xml:"company_no,omitempty" require:"true"`
	// 记账日期 yyyy-mm-dd
	AccountDate *string `json:"account_date,omitempty" xml:"account_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 总分润金额
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
	// 风险承担方金额
	RiskTaker *int64 `json:"risk_taker,omitempty" xml:"risk_taker,omitempty" require:"true"`
	// 货物监管方金额
	CargoSupervision *int64 `json:"cargo_supervision,omitempty" xml:"cargo_supervision,omitempty" require:"true"`
	// 资金推荐方金额
	CapitalRecommend *int64 `json:"capital_recommend,omitempty" xml:"capital_recommend,omitempty" require:"true"`
	// 融资推荐方金额
	FunderRecommend *int64 `json:"funder_recommend,omitempty" xml:"funder_recommend,omitempty" require:"true"`
	// 运营管理方金额
	Management *int64 `json:"management,omitempty" xml:"management,omitempty" require:"true"`
	// 技术支持方金额
	Technical *int64 `json:"technical,omitempty" xml:"technical,omitempty" require:"true"`
}

func (s TotalStatement) String() string {
	return tea.Prettify(s)
}

func (s TotalStatement) GoString() string {
	return s.String()
}

func (s *TotalStatement) SetCompanyNo(v string) *TotalStatement {
	s.CompanyNo = &v
	return s
}

func (s *TotalStatement) SetAccountDate(v string) *TotalStatement {
	s.AccountDate = &v
	return s
}

func (s *TotalStatement) SetAmount(v int64) *TotalStatement {
	s.Amount = &v
	return s
}

func (s *TotalStatement) SetRiskTaker(v int64) *TotalStatement {
	s.RiskTaker = &v
	return s
}

func (s *TotalStatement) SetCargoSupervision(v int64) *TotalStatement {
	s.CargoSupervision = &v
	return s
}

func (s *TotalStatement) SetCapitalRecommend(v int64) *TotalStatement {
	s.CapitalRecommend = &v
	return s
}

func (s *TotalStatement) SetFunderRecommend(v int64) *TotalStatement {
	s.FunderRecommend = &v
	return s
}

func (s *TotalStatement) SetManagement(v int64) *TotalStatement {
	s.Management = &v
	return s
}

func (s *TotalStatement) SetTechnical(v int64) *TotalStatement {
	s.Technical = &v
	return s
}

// 物权信息
type CertificateInfo struct {
	// 模板id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 字典模板定义的数据，key-value的json对象
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 自定义序列（不能重复）
	BizId *int64 `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
}

func (s CertificateInfo) String() string {
	return tea.Prettify(s)
}

func (s CertificateInfo) GoString() string {
	return s.String()
}

func (s *CertificateInfo) SetTemplateId(v string) *CertificateInfo {
	s.TemplateId = &v
	return s
}

func (s *CertificateInfo) SetContent(v string) *CertificateInfo {
	s.Content = &v
	return s
}

func (s *CertificateInfo) SetBizId(v int64) *CertificateInfo {
	s.BizId = &v
	return s
}

// 数字字典内容
type TemplateData struct {
	// 字典类型ID
	TemplateUid *string `json:"template_uid,omitempty" xml:"template_uid,omitempty"`
	// 数字字典内容
	FormData *TemplateDataConverter `json:"form_data,omitempty" xml:"form_data,omitempty"`
}

func (s TemplateData) String() string {
	return tea.Prettify(s)
}

func (s TemplateData) GoString() string {
	return s.String()
}

func (s *TemplateData) SetTemplateUid(v string) *TemplateData {
	s.TemplateUid = &v
	return s
}

func (s *TemplateData) SetFormData(v *TemplateDataConverter) *TemplateData {
	s.FormData = v
	return s
}

// 入库信息
type TransactionInInfo struct {
	// 入库信息表ID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 仓库Did
	WarehouseDid *string `json:"warehouse_did,omitempty" xml:"warehouse_did,omitempty"`
	// 仓库名称
	WarehouseName *string `json:"warehouse_name,omitempty" xml:"warehouse_name,omitempty"`
	// 库位Did
	LocationDid *string `json:"location_did,omitempty" xml:"location_did,omitempty"`
	// 库位名称
	LocationName *string `json:"location_name,omitempty" xml:"location_name,omitempty"`
	// 设备Did
	DeviceDid *string `json:"device_did,omitempty" xml:"device_did,omitempty"`
	// 设备名称
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty"`
	// 开始时间，单位：s
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 结束时间, 单位：s
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 入库视频信息url
	VideoUrl *string `json:"video_url,omitempty" xml:"video_url,omitempty"`
	// 存证交易hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s TransactionInInfo) String() string {
	return tea.Prettify(s)
}

func (s TransactionInInfo) GoString() string {
	return s.String()
}

func (s *TransactionInInfo) SetId(v int64) *TransactionInInfo {
	s.Id = &v
	return s
}

func (s *TransactionInInfo) SetWarehouseDid(v string) *TransactionInInfo {
	s.WarehouseDid = &v
	return s
}

func (s *TransactionInInfo) SetWarehouseName(v string) *TransactionInInfo {
	s.WarehouseName = &v
	return s
}

func (s *TransactionInInfo) SetLocationDid(v string) *TransactionInInfo {
	s.LocationDid = &v
	return s
}

func (s *TransactionInInfo) SetLocationName(v string) *TransactionInInfo {
	s.LocationName = &v
	return s
}

func (s *TransactionInInfo) SetDeviceDid(v string) *TransactionInInfo {
	s.DeviceDid = &v
	return s
}

func (s *TransactionInInfo) SetDeviceName(v string) *TransactionInInfo {
	s.DeviceName = &v
	return s
}

func (s *TransactionInInfo) SetStartTime(v int64) *TransactionInInfo {
	s.StartTime = &v
	return s
}

func (s *TransactionInInfo) SetEndTime(v int64) *TransactionInInfo {
	s.EndTime = &v
	return s
}

func (s *TransactionInInfo) SetVideoUrl(v string) *TransactionInInfo {
	s.VideoUrl = &v
	return s
}

func (s *TransactionInInfo) SetTxHash(v string) *TransactionInInfo {
	s.TxHash = &v
	return s
}

// 组织信息
type Organization struct {
	// 企业编号
	RoleCompanyNo *string `json:"role_company_no,omitempty" xml:"role_company_no,omitempty" require:"true"`
	// 企业名称
	RoleCompanyName *string `json:"role_company_name,omitempty" xml:"role_company_name,omitempty" require:"true"`
}

func (s Organization) String() string {
	return tea.Prettify(s)
}

func (s Organization) GoString() string {
	return s.String()
}

func (s *Organization) SetRoleCompanyNo(v string) *Organization {
	s.RoleCompanyNo = &v
	return s
}

func (s *Organization) SetRoleCompanyName(v string) *Organization {
	s.RoleCompanyName = &v
	return s
}

// 还款利息
type BankFee struct {
	// 融资编号
	FinancialNo *string `json:"financial_no,omitempty" xml:"financial_no,omitempty" require:"true"`
	// 产品编号
	ProductNo *string `json:"product_no,omitempty" xml:"product_no,omitempty" require:"true"`
	// 应付银行本金
	CapitalAmount *int64 `json:"capital_amount,omitempty" xml:"capital_amount,omitempty" require:"true"`
	// 应付银行利息
	InterestAmount *int64 `json:"interest_amount,omitempty" xml:"interest_amount,omitempty" require:"true"`
	// 应付总金额
	TotalAmount *int64 `json:"total_amount,omitempty" xml:"total_amount,omitempty" require:"true"`
	// 记账日期 yyyy-MM-dd
	AccountDate *string `json:"account_date,omitempty" xml:"account_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s BankFee) String() string {
	return tea.Prettify(s)
}

func (s BankFee) GoString() string {
	return s.String()
}

func (s *BankFee) SetFinancialNo(v string) *BankFee {
	s.FinancialNo = &v
	return s
}

func (s *BankFee) SetProductNo(v string) *BankFee {
	s.ProductNo = &v
	return s
}

func (s *BankFee) SetCapitalAmount(v int64) *BankFee {
	s.CapitalAmount = &v
	return s
}

func (s *BankFee) SetInterestAmount(v int64) *BankFee {
	s.InterestAmount = &v
	return s
}

func (s *BankFee) SetTotalAmount(v int64) *BankFee {
	s.TotalAmount = &v
	return s
}

func (s *BankFee) SetAccountDate(v string) *BankFee {
	s.AccountDate = &v
	return s
}

// key和value均为String的entry
type StringStringEntry struct {
	// 键
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// 值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s StringStringEntry) String() string {
	return tea.Prettify(s)
}

func (s StringStringEntry) GoString() string {
	return s.String()
}

func (s *StringStringEntry) SetKey(v string) *StringStringEntry {
	s.Key = &v
	return s
}

func (s *StringStringEntry) SetValue(v string) *StringStringEntry {
	s.Value = &v
	return s
}

// 申请信息
type RegisterWhReceiptHeader struct {
	// 注册申请单ID
	RegisterWhReceiptId *string `json:"register_wh_receipt_id,omitempty" xml:"register_wh_receipt_id,omitempty"`
	// 注册仓单状态【 NONE：无效状态，WAITING：待审核，AGREED：审核同意，REJECTED：审核拒绝，CANCELED：已取消，WAITING_PRE_ALLOC_POSITION：待预分配仓位，WAITING_TRANSACTION_IN：待入库，TRANSACTION_IN：入库中，FINISHED_TRANSACTION_IN：已入库/待确认，CONFIRMED_TRANSACTION_IN：完成入库，INTERRUPTION：已中断，ALL：所有状态】
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 入库中时的子状态，只有入库中才有值【ALLOCATED_LOCATION：已调用分配仓位信息接口，TRANSACTION_IN_INFO：已调用添加入库信息接口，LOCATION_INFO：已调用补充仓位占用信息接口】
	InStoringStatus *string `json:"in_storing_status,omitempty" xml:"in_storing_status,omitempty"`
	// 更新时间
	UpdateTime *int64 `json:"update_time,omitempty" xml:"update_time,omitempty"`
}

func (s RegisterWhReceiptHeader) String() string {
	return tea.Prettify(s)
}

func (s RegisterWhReceiptHeader) GoString() string {
	return s.String()
}

func (s *RegisterWhReceiptHeader) SetRegisterWhReceiptId(v string) *RegisterWhReceiptHeader {
	s.RegisterWhReceiptId = &v
	return s
}

func (s *RegisterWhReceiptHeader) SetStatus(v string) *RegisterWhReceiptHeader {
	s.Status = &v
	return s
}

func (s *RegisterWhReceiptHeader) SetInStoringStatus(v string) *RegisterWhReceiptHeader {
	s.InStoringStatus = &v
	return s
}

func (s *RegisterWhReceiptHeader) SetUpdateTime(v int64) *RegisterWhReceiptHeader {
	s.UpdateTime = &v
	return s
}

// 历史操作信息
type FlowHistory struct {
	// 操作信息
	FlowNodeList []*FlowNode `json:"flow_node_list,omitempty" xml:"flow_node_list,omitempty" type:"Repeated"`
}

func (s FlowHistory) String() string {
	return tea.Prettify(s)
}

func (s FlowHistory) GoString() string {
	return s.String()
}

func (s *FlowHistory) SetFlowNodeList(v []*FlowNode) *FlowHistory {
	s.FlowNodeList = v
	return s
}

type CreateUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 11位的合法手机号
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty" require:"true"`
}

func (s CreateUserRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateUserRequest) GoString() string {
	return s.String()
}

func (s *CreateUserRequest) SetAuthToken(v string) *CreateUserRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateUserRequest) SetProductInstanceId(v string) *CreateUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateUserRequest) SetUserName(v string) *CreateUserRequest {
	s.UserName = &v
	return s
}

func (s *CreateUserRequest) SetPhone(v string) *CreateUserRequest {
	s.Phone = &v
	return s
}

type CreateUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求时间
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s CreateUserResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateUserResponse) GoString() string {
	return s.String()
}

func (s *CreateUserResponse) SetReqMsgId(v string) *CreateUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateUserResponse) SetResultCode(v string) *CreateUserResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateUserResponse) SetResultMsg(v string) *CreateUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateUserResponse) SetDate(v int64) *CreateUserResponse {
	s.Date = &v
	return s
}

func (s *CreateUserResponse) SetRequestId(v string) *CreateUserResponse {
	s.RequestId = &v
	return s
}

func (s *CreateUserResponse) SetUserId(v string) *CreateUserResponse {
	s.UserId = &v
	return s
}

type CreateTransferRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资产id
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 被转让的对象
	Transferee *string `json:"transferee,omitempty" xml:"transferee,omitempty" require:"true"`
	// 转让金额
	MonetaryAmount *string `json:"monetary_amount,omitempty" xml:"monetary_amount,omitempty" require:"true"`
	// 用户的标识
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s CreateTransferRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTransferRequest) GoString() string {
	return s.String()
}

func (s *CreateTransferRequest) SetAuthToken(v string) *CreateTransferRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTransferRequest) SetProductInstanceId(v string) *CreateTransferRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTransferRequest) SetAssetId(v string) *CreateTransferRequest {
	s.AssetId = &v
	return s
}

func (s *CreateTransferRequest) SetTransferee(v string) *CreateTransferRequest {
	s.Transferee = &v
	return s
}

func (s *CreateTransferRequest) SetMonetaryAmount(v string) *CreateTransferRequest {
	s.MonetaryAmount = &v
	return s
}

func (s *CreateTransferRequest) SetUserId(v string) *CreateTransferRequest {
	s.UserId = &v
	return s
}

type CreateTransferResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// long类型时间戳
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
	// 实体类中包含两个变量
	BlockchainInfo *BlockchainInfo `json:"blockchain_info,omitempty" xml:"blockchain_info,omitempty"`
}

func (s CreateTransferResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTransferResponse) GoString() string {
	return s.String()
}

func (s *CreateTransferResponse) SetReqMsgId(v string) *CreateTransferResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTransferResponse) SetResultCode(v string) *CreateTransferResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTransferResponse) SetResultMsg(v string) *CreateTransferResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTransferResponse) SetRequestId(v string) *CreateTransferResponse {
	s.RequestId = &v
	return s
}

func (s *CreateTransferResponse) SetDate(v int64) *CreateTransferResponse {
	s.Date = &v
	return s
}

func (s *CreateTransferResponse) SetBlockchainInfo(v *BlockchainInfo) *CreateTransferResponse {
	s.BlockchainInfo = v
	return s
}

type CreatePickupRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资产id
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 用户标识
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s CreatePickupRequest) String() string {
	return tea.Prettify(s)
}

func (s CreatePickupRequest) GoString() string {
	return s.String()
}

func (s *CreatePickupRequest) SetAuthToken(v string) *CreatePickupRequest {
	s.AuthToken = &v
	return s
}

func (s *CreatePickupRequest) SetProductInstanceId(v string) *CreatePickupRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreatePickupRequest) SetAssetId(v string) *CreatePickupRequest {
	s.AssetId = &v
	return s
}

func (s *CreatePickupRequest) SetUserId(v string) *CreatePickupRequest {
	s.UserId = &v
	return s
}

type CreatePickupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 提取码
	PickupId *string `json:"pickup_id,omitempty" xml:"pickup_id,omitempty"`
	// 区块链信息
	Info *BlockchainInfo `json:"info,omitempty" xml:"info,omitempty"`
	// 请求标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 时间
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
}

func (s CreatePickupResponse) String() string {
	return tea.Prettify(s)
}

func (s CreatePickupResponse) GoString() string {
	return s.String()
}

func (s *CreatePickupResponse) SetReqMsgId(v string) *CreatePickupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreatePickupResponse) SetResultCode(v string) *CreatePickupResponse {
	s.ResultCode = &v
	return s
}

func (s *CreatePickupResponse) SetResultMsg(v string) *CreatePickupResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreatePickupResponse) SetPickupId(v string) *CreatePickupResponse {
	s.PickupId = &v
	return s
}

func (s *CreatePickupResponse) SetInfo(v *BlockchainInfo) *CreatePickupResponse {
	s.Info = v
	return s
}

func (s *CreatePickupResponse) SetRequestId(v string) *CreatePickupResponse {
	s.RequestId = &v
	return s
}

func (s *CreatePickupResponse) SetDate(v int64) *CreatePickupResponse {
	s.Date = &v
	return s
}

type CancelPickupRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 提取码
	PickupId *string `json:"pickup_id,omitempty" xml:"pickup_id,omitempty" require:"true"`
	// 用户标识
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s CancelPickupRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelPickupRequest) GoString() string {
	return s.String()
}

func (s *CancelPickupRequest) SetAuthToken(v string) *CancelPickupRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelPickupRequest) SetProductInstanceId(v string) *CancelPickupRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelPickupRequest) SetPickupId(v string) *CancelPickupRequest {
	s.PickupId = &v
	return s
}

func (s *CancelPickupRequest) SetUserId(v string) *CancelPickupRequest {
	s.UserId = &v
	return s
}

type CancelPickupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 提取码
	PickupId *string `json:"pickup_id,omitempty" xml:"pickup_id,omitempty"`
	// 区块链信息
	Info *BlockchainInfo `json:"info,omitempty" xml:"info,omitempty"`
	// 请求标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 时间
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
}

func (s CancelPickupResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelPickupResponse) GoString() string {
	return s.String()
}

func (s *CancelPickupResponse) SetReqMsgId(v string) *CancelPickupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelPickupResponse) SetResultCode(v string) *CancelPickupResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelPickupResponse) SetResultMsg(v string) *CancelPickupResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelPickupResponse) SetPickupId(v string) *CancelPickupResponse {
	s.PickupId = &v
	return s
}

func (s *CancelPickupResponse) SetInfo(v *BlockchainInfo) *CancelPickupResponse {
	s.Info = v
	return s
}

func (s *CancelPickupResponse) SetRequestId(v string) *CancelPickupResponse {
	s.RequestId = &v
	return s
}

func (s *CancelPickupResponse) SetDate(v int64) *CancelPickupResponse {
	s.Date = &v
	return s
}

type DisablePickupRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资产id
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 用户标识
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s DisablePickupRequest) String() string {
	return tea.Prettify(s)
}

func (s DisablePickupRequest) GoString() string {
	return s.String()
}

func (s *DisablePickupRequest) SetAuthToken(v string) *DisablePickupRequest {
	s.AuthToken = &v
	return s
}

func (s *DisablePickupRequest) SetProductInstanceId(v string) *DisablePickupRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DisablePickupRequest) SetAssetId(v string) *DisablePickupRequest {
	s.AssetId = &v
	return s
}

func (s *DisablePickupRequest) SetUserId(v string) *DisablePickupRequest {
	s.UserId = &v
	return s
}

type DisablePickupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区块链信息
	Info *BlockchainInfo `json:"info,omitempty" xml:"info,omitempty"`
	// 提取码
	PickupId *string `json:"pickup_id,omitempty" xml:"pickup_id,omitempty"`
	// 请求标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 时间
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
}

func (s DisablePickupResponse) String() string {
	return tea.Prettify(s)
}

func (s DisablePickupResponse) GoString() string {
	return s.String()
}

func (s *DisablePickupResponse) SetReqMsgId(v string) *DisablePickupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DisablePickupResponse) SetResultCode(v string) *DisablePickupResponse {
	s.ResultCode = &v
	return s
}

func (s *DisablePickupResponse) SetResultMsg(v string) *DisablePickupResponse {
	s.ResultMsg = &v
	return s
}

func (s *DisablePickupResponse) SetInfo(v *BlockchainInfo) *DisablePickupResponse {
	s.Info = v
	return s
}

func (s *DisablePickupResponse) SetPickupId(v string) *DisablePickupResponse {
	s.PickupId = &v
	return s
}

func (s *DisablePickupResponse) SetRequestId(v string) *DisablePickupResponse {
	s.RequestId = &v
	return s
}

func (s *DisablePickupResponse) SetDate(v int64) *DisablePickupResponse {
	s.Date = &v
	return s
}

type CreateLeagueRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 区块链标识
	BlockchainD *string `json:"blockchain_d,omitempty" xml:"blockchain_d,omitempty" require:"true"`
	// 评论
	Comment *string `json:"comment,omitempty" xml:"comment,omitempty"`
	// 联盟名称
	LeagueName *string `json:"league_name,omitempty" xml:"league_name,omitempty" require:"true"`
	// 用户标识
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s CreateLeagueRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeagueRequest) GoString() string {
	return s.String()
}

func (s *CreateLeagueRequest) SetAuthToken(v string) *CreateLeagueRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeagueRequest) SetProductInstanceId(v string) *CreateLeagueRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeagueRequest) SetBlockchainD(v string) *CreateLeagueRequest {
	s.BlockchainD = &v
	return s
}

func (s *CreateLeagueRequest) SetComment(v string) *CreateLeagueRequest {
	s.Comment = &v
	return s
}

func (s *CreateLeagueRequest) SetLeagueName(v string) *CreateLeagueRequest {
	s.LeagueName = &v
	return s
}

func (s *CreateLeagueRequest) SetUserId(v string) *CreateLeagueRequest {
	s.UserId = &v
	return s
}

type CreateLeagueResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 时间
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
	// 联盟id
	LeagueId *string `json:"league_id,omitempty" xml:"league_id,omitempty"`
	// 请求标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s CreateLeagueResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeagueResponse) GoString() string {
	return s.String()
}

func (s *CreateLeagueResponse) SetReqMsgId(v string) *CreateLeagueResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeagueResponse) SetResultCode(v string) *CreateLeagueResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeagueResponse) SetResultMsg(v string) *CreateLeagueResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeagueResponse) SetDate(v int64) *CreateLeagueResponse {
	s.Date = &v
	return s
}

func (s *CreateLeagueResponse) SetLeagueId(v string) *CreateLeagueResponse {
	s.LeagueId = &v
	return s
}

func (s *CreateLeagueResponse) SetRequestId(v string) *CreateLeagueResponse {
	s.RequestId = &v
	return s
}

type AddLeagueRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟id
	LeagueId *string `json:"league_id,omitempty" xml:"league_id,omitempty" require:"true"`
	// 用户标识
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s AddLeagueRequest) String() string {
	return tea.Prettify(s)
}

func (s AddLeagueRequest) GoString() string {
	return s.String()
}

func (s *AddLeagueRequest) SetAuthToken(v string) *AddLeagueRequest {
	s.AuthToken = &v
	return s
}

func (s *AddLeagueRequest) SetProductInstanceId(v string) *AddLeagueRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddLeagueRequest) SetLeagueId(v string) *AddLeagueRequest {
	s.LeagueId = &v
	return s
}

func (s *AddLeagueRequest) SetUserId(v string) *AddLeagueRequest {
	s.UserId = &v
	return s
}

type AddLeagueResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 时间
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
	// 请求标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s AddLeagueResponse) String() string {
	return tea.Prettify(s)
}

func (s AddLeagueResponse) GoString() string {
	return s.String()
}

func (s *AddLeagueResponse) SetReqMsgId(v string) *AddLeagueResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddLeagueResponse) SetResultCode(v string) *AddLeagueResponse {
	s.ResultCode = &v
	return s
}

func (s *AddLeagueResponse) SetResultMsg(v string) *AddLeagueResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddLeagueResponse) SetDate(v int64) *AddLeagueResponse {
	s.Date = &v
	return s
}

func (s *AddLeagueResponse) SetRequestId(v string) *AddLeagueResponse {
	s.RequestId = &v
	return s
}

type ConfirmLeagueRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟id
	LeagueId *string `json:"league_id,omitempty" xml:"league_id,omitempty" require:"true"`
	// 用户标识
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 加入用户的标识
	JoinUserId *string `json:"join_user_id,omitempty" xml:"join_user_id,omitempty" require:"true"`
	// 审核结果
	Pass *bool `json:"pass,omitempty" xml:"pass,omitempty" require:"true"`
}

func (s ConfirmLeagueRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmLeagueRequest) GoString() string {
	return s.String()
}

func (s *ConfirmLeagueRequest) SetAuthToken(v string) *ConfirmLeagueRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmLeagueRequest) SetProductInstanceId(v string) *ConfirmLeagueRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ConfirmLeagueRequest) SetLeagueId(v string) *ConfirmLeagueRequest {
	s.LeagueId = &v
	return s
}

func (s *ConfirmLeagueRequest) SetUserId(v string) *ConfirmLeagueRequest {
	s.UserId = &v
	return s
}

func (s *ConfirmLeagueRequest) SetJoinUserId(v string) *ConfirmLeagueRequest {
	s.JoinUserId = &v
	return s
}

func (s *ConfirmLeagueRequest) SetPass(v bool) *ConfirmLeagueRequest {
	s.Pass = &v
	return s
}

type ConfirmLeagueResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 时间
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
	// 请求标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s ConfirmLeagueResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmLeagueResponse) GoString() string {
	return s.String()
}

func (s *ConfirmLeagueResponse) SetReqMsgId(v string) *ConfirmLeagueResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmLeagueResponse) SetResultCode(v string) *ConfirmLeagueResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmLeagueResponse) SetResultMsg(v string) *ConfirmLeagueResponse {
	s.ResultMsg = &v
	return s
}

func (s *ConfirmLeagueResponse) SetDate(v int64) *ConfirmLeagueResponse {
	s.Date = &v
	return s
}

func (s *ConfirmLeagueResponse) SetRequestId(v string) *ConfirmLeagueResponse {
	s.RequestId = &v
	return s
}

type QueryLeagueRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户标识
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 联盟id
	LeagueId *string `json:"league_id,omitempty" xml:"league_id,omitempty" require:"true"`
}

func (s QueryLeagueRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryLeagueRequest) GoString() string {
	return s.String()
}

func (s *QueryLeagueRequest) SetAuthToken(v string) *QueryLeagueRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryLeagueRequest) SetProductInstanceId(v string) *QueryLeagueRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryLeagueRequest) SetUserId(v string) *QueryLeagueRequest {
	s.UserId = &v
	return s
}

func (s *QueryLeagueRequest) SetLeagueId(v string) *QueryLeagueRequest {
	s.LeagueId = &v
	return s
}

type QueryLeagueResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 联盟信息
	League *LeagueInfo `json:"league,omitempty" xml:"league,omitempty"`
	// 时间
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
	// 请求标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s QueryLeagueResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryLeagueResponse) GoString() string {
	return s.String()
}

func (s *QueryLeagueResponse) SetReqMsgId(v string) *QueryLeagueResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryLeagueResponse) SetResultCode(v string) *QueryLeagueResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryLeagueResponse) SetResultMsg(v string) *QueryLeagueResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryLeagueResponse) SetLeague(v *LeagueInfo) *QueryLeagueResponse {
	s.League = v
	return s
}

func (s *QueryLeagueResponse) SetDate(v int64) *QueryLeagueResponse {
	s.Date = &v
	return s
}

func (s *QueryLeagueResponse) SetRequestId(v string) *QueryLeagueResponse {
	s.RequestId = &v
	return s
}

type CreateImportassetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 字典id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 数据字典内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 用户标识
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s CreateImportassetRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateImportassetRequest) GoString() string {
	return s.String()
}

func (s *CreateImportassetRequest) SetAuthToken(v string) *CreateImportassetRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateImportassetRequest) SetProductInstanceId(v string) *CreateImportassetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateImportassetRequest) SetTemplateId(v string) *CreateImportassetRequest {
	s.TemplateId = &v
	return s
}

func (s *CreateImportassetRequest) SetContent(v string) *CreateImportassetRequest {
	s.Content = &v
	return s
}

func (s *CreateImportassetRequest) SetUserId(v string) *CreateImportassetRequest {
	s.UserId = &v
	return s
}

type CreateImportassetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 资产id
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 区块链信息
	Info *BlockchainInfo `json:"info,omitempty" xml:"info,omitempty"`
	// 时间
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
	// 请求标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 短码
	QrCode *string `json:"qr_code,omitempty" xml:"qr_code,omitempty"`
}

func (s CreateImportassetResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateImportassetResponse) GoString() string {
	return s.String()
}

func (s *CreateImportassetResponse) SetReqMsgId(v string) *CreateImportassetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateImportassetResponse) SetResultCode(v string) *CreateImportassetResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateImportassetResponse) SetResultMsg(v string) *CreateImportassetResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateImportassetResponse) SetAssetId(v string) *CreateImportassetResponse {
	s.AssetId = &v
	return s
}

func (s *CreateImportassetResponse) SetInfo(v *BlockchainInfo) *CreateImportassetResponse {
	s.Info = v
	return s
}

func (s *CreateImportassetResponse) SetDate(v int64) *CreateImportassetResponse {
	s.Date = &v
	return s
}

func (s *CreateImportassetResponse) SetRequestId(v string) *CreateImportassetResponse {
	s.RequestId = &v
	return s
}

func (s *CreateImportassetResponse) SetQrCode(v string) *CreateImportassetResponse {
	s.QrCode = &v
	return s
}

type UpdateImportassetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 物权id
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 数据字典内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 用户标识
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s UpdateImportassetRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateImportassetRequest) GoString() string {
	return s.String()
}

func (s *UpdateImportassetRequest) SetAuthToken(v string) *UpdateImportassetRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateImportassetRequest) SetProductInstanceId(v string) *UpdateImportassetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateImportassetRequest) SetAssetId(v string) *UpdateImportassetRequest {
	s.AssetId = &v
	return s
}

func (s *UpdateImportassetRequest) SetContent(v string) *UpdateImportassetRequest {
	s.Content = &v
	return s
}

func (s *UpdateImportassetRequest) SetUserId(v string) *UpdateImportassetRequest {
	s.UserId = &v
	return s
}

type UpdateImportassetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区块链信息
	BlockchainInfo *BlockchainInfo `json:"blockchain_info,omitempty" xml:"blockchain_info,omitempty"`
	// 请求时间
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
	// 请求标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s UpdateImportassetResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateImportassetResponse) GoString() string {
	return s.String()
}

func (s *UpdateImportassetResponse) SetReqMsgId(v string) *UpdateImportassetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateImportassetResponse) SetResultCode(v string) *UpdateImportassetResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateImportassetResponse) SetResultMsg(v string) *UpdateImportassetResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateImportassetResponse) SetBlockchainInfo(v *BlockchainInfo) *UpdateImportassetResponse {
	s.BlockchainInfo = v
	return s
}

func (s *UpdateImportassetResponse) SetDate(v int64) *UpdateImportassetResponse {
	s.Date = &v
	return s
}

func (s *UpdateImportassetResponse) SetRequestId(v string) *UpdateImportassetResponse {
	s.RequestId = &v
	return s
}

type CancelImportassetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 物权id
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s CancelImportassetRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelImportassetRequest) GoString() string {
	return s.String()
}

func (s *CancelImportassetRequest) SetAuthToken(v string) *CancelImportassetRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelImportassetRequest) SetProductInstanceId(v string) *CancelImportassetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelImportassetRequest) SetAssetId(v string) *CancelImportassetRequest {
	s.AssetId = &v
	return s
}

func (s *CancelImportassetRequest) SetUserId(v string) *CancelImportassetRequest {
	s.UserId = &v
	return s
}

type CancelImportassetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区块链信息
	BlockchainInfo *BlockchainInfo `json:"blockchain_info,omitempty" xml:"blockchain_info,omitempty"`
	// 时间
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
	// 请求标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s CancelImportassetResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelImportassetResponse) GoString() string {
	return s.String()
}

func (s *CancelImportassetResponse) SetReqMsgId(v string) *CancelImportassetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelImportassetResponse) SetResultCode(v string) *CancelImportassetResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelImportassetResponse) SetResultMsg(v string) *CancelImportassetResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelImportassetResponse) SetBlockchainInfo(v *BlockchainInfo) *CancelImportassetResponse {
	s.BlockchainInfo = v
	return s
}

func (s *CancelImportassetResponse) SetDate(v int64) *CancelImportassetResponse {
	s.Date = &v
	return s
}

func (s *CancelImportassetResponse) SetRequestId(v string) *CancelImportassetResponse {
	s.RequestId = &v
	return s
}

type FreezeImportassetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 物权id
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s FreezeImportassetRequest) String() string {
	return tea.Prettify(s)
}

func (s FreezeImportassetRequest) GoString() string {
	return s.String()
}

func (s *FreezeImportassetRequest) SetAuthToken(v string) *FreezeImportassetRequest {
	s.AuthToken = &v
	return s
}

func (s *FreezeImportassetRequest) SetProductInstanceId(v string) *FreezeImportassetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *FreezeImportassetRequest) SetAssetId(v string) *FreezeImportassetRequest {
	s.AssetId = &v
	return s
}

func (s *FreezeImportassetRequest) SetUserId(v string) *FreezeImportassetRequest {
	s.UserId = &v
	return s
}

type FreezeImportassetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区块链信息
	BlockchainInfo *BlockchainInfo `json:"blockchain_info,omitempty" xml:"blockchain_info,omitempty"`
	// 时间
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
	// 请求标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s FreezeImportassetResponse) String() string {
	return tea.Prettify(s)
}

func (s FreezeImportassetResponse) GoString() string {
	return s.String()
}

func (s *FreezeImportassetResponse) SetReqMsgId(v string) *FreezeImportassetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *FreezeImportassetResponse) SetResultCode(v string) *FreezeImportassetResponse {
	s.ResultCode = &v
	return s
}

func (s *FreezeImportassetResponse) SetResultMsg(v string) *FreezeImportassetResponse {
	s.ResultMsg = &v
	return s
}

func (s *FreezeImportassetResponse) SetBlockchainInfo(v *BlockchainInfo) *FreezeImportassetResponse {
	s.BlockchainInfo = v
	return s
}

func (s *FreezeImportassetResponse) SetDate(v int64) *FreezeImportassetResponse {
	s.Date = &v
	return s
}

func (s *FreezeImportassetResponse) SetRequestId(v string) *FreezeImportassetResponse {
	s.RequestId = &v
	return s
}

type UnfreezeImportassetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 物权id
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s UnfreezeImportassetRequest) String() string {
	return tea.Prettify(s)
}

func (s UnfreezeImportassetRequest) GoString() string {
	return s.String()
}

func (s *UnfreezeImportassetRequest) SetAuthToken(v string) *UnfreezeImportassetRequest {
	s.AuthToken = &v
	return s
}

func (s *UnfreezeImportassetRequest) SetProductInstanceId(v string) *UnfreezeImportassetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UnfreezeImportassetRequest) SetAssetId(v string) *UnfreezeImportassetRequest {
	s.AssetId = &v
	return s
}

func (s *UnfreezeImportassetRequest) SetUserId(v string) *UnfreezeImportassetRequest {
	s.UserId = &v
	return s
}

type UnfreezeImportassetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区块链信息
	BlockchainInfo *BlockchainInfo `json:"blockchain_info,omitempty" xml:"blockchain_info,omitempty"`
	// 时间
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
	// 请求标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s UnfreezeImportassetResponse) String() string {
	return tea.Prettify(s)
}

func (s UnfreezeImportassetResponse) GoString() string {
	return s.String()
}

func (s *UnfreezeImportassetResponse) SetReqMsgId(v string) *UnfreezeImportassetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UnfreezeImportassetResponse) SetResultCode(v string) *UnfreezeImportassetResponse {
	s.ResultCode = &v
	return s
}

func (s *UnfreezeImportassetResponse) SetResultMsg(v string) *UnfreezeImportassetResponse {
	s.ResultMsg = &v
	return s
}

func (s *UnfreezeImportassetResponse) SetBlockchainInfo(v *BlockchainInfo) *UnfreezeImportassetResponse {
	s.BlockchainInfo = v
	return s
}

func (s *UnfreezeImportassetResponse) SetDate(v int64) *UnfreezeImportassetResponse {
	s.Date = &v
	return s
}

func (s *UnfreezeImportassetResponse) SetRequestId(v string) *UnfreezeImportassetResponse {
	s.RequestId = &v
	return s
}

type QueryImportassetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 物权id
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s QueryImportassetRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryImportassetRequest) GoString() string {
	return s.String()
}

func (s *QueryImportassetRequest) SetAuthToken(v string) *QueryImportassetRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryImportassetRequest) SetProductInstanceId(v string) *QueryImportassetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryImportassetRequest) SetAssetId(v string) *QueryImportassetRequest {
	s.AssetId = &v
	return s
}

func (s *QueryImportassetRequest) SetUserId(v string) *QueryImportassetRequest {
	s.UserId = &v
	return s
}

type QueryImportassetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 物权信息
	Asset *AssetInfo `json:"asset,omitempty" xml:"asset,omitempty"`
	// 时间
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s QueryImportassetResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryImportassetResponse) GoString() string {
	return s.String()
}

func (s *QueryImportassetResponse) SetReqMsgId(v string) *QueryImportassetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryImportassetResponse) SetResultCode(v string) *QueryImportassetResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryImportassetResponse) SetResultMsg(v string) *QueryImportassetResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryImportassetResponse) SetAsset(v *AssetInfo) *QueryImportassetResponse {
	s.Asset = v
	return s
}

func (s *QueryImportassetResponse) SetDate(v int64) *QueryImportassetResponse {
	s.Date = &v
	return s
}

func (s *QueryImportassetResponse) SetRequestId(v string) *QueryImportassetResponse {
	s.RequestId = &v
	return s
}

type AllImportassetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true"`
	// 页面容量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 用户标识
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 小程序是加密后的字符串
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty" require:"true"`
}

func (s AllImportassetRequest) String() string {
	return tea.Prettify(s)
}

func (s AllImportassetRequest) GoString() string {
	return s.String()
}

func (s *AllImportassetRequest) SetAuthToken(v string) *AllImportassetRequest {
	s.AuthToken = &v
	return s
}

func (s *AllImportassetRequest) SetProductInstanceId(v string) *AllImportassetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllImportassetRequest) SetCurrentPage(v int64) *AllImportassetRequest {
	s.CurrentPage = &v
	return s
}

func (s *AllImportassetRequest) SetPageSize(v int64) *AllImportassetRequest {
	s.PageSize = &v
	return s
}

func (s *AllImportassetRequest) SetUserId(v string) *AllImportassetRequest {
	s.UserId = &v
	return s
}

func (s *AllImportassetRequest) SetPhone(v string) *AllImportassetRequest {
	s.Phone = &v
	return s
}

type AllImportassetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 物权信息
	Assets []*AssetInfo `json:"assets,omitempty" xml:"assets,omitempty" type:"Repeated"`
	// 当前页码
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 时间
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
}

func (s AllImportassetResponse) String() string {
	return tea.Prettify(s)
}

func (s AllImportassetResponse) GoString() string {
	return s.String()
}

func (s *AllImportassetResponse) SetReqMsgId(v string) *AllImportassetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllImportassetResponse) SetResultCode(v string) *AllImportassetResponse {
	s.ResultCode = &v
	return s
}

func (s *AllImportassetResponse) SetResultMsg(v string) *AllImportassetResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllImportassetResponse) SetAssets(v []*AssetInfo) *AllImportassetResponse {
	s.Assets = v
	return s
}

func (s *AllImportassetResponse) SetCurrentPage(v int64) *AllImportassetResponse {
	s.CurrentPage = &v
	return s
}

func (s *AllImportassetResponse) SetDate(v int64) *AllImportassetResponse {
	s.Date = &v
	return s
}

func (s *AllImportassetResponse) SetRequestId(v string) *AllImportassetResponse {
	s.RequestId = &v
	return s
}

func (s *AllImportassetResponse) SetTotalCount(v int64) *AllImportassetResponse {
	s.TotalCount = &v
	return s
}

func (s *AllImportassetResponse) SetTotalPage(v int64) *AllImportassetResponse {
	s.TotalPage = &v
	return s
}

type BatchqueryImportassetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true"`
	// 页面大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// string (enum: PICK_UP, WEAK_ASSET, WEAK_ASSET_TRANSFER, WAREHOUSE_RECEIPT_TRANSFER, WAREHOUSE_RECEIPT_REGISTER, PLEDGE_APPLICATION, PLEDGE_RELEASE, WAREHOUSE_RECEIPT_CANCEL, WAREHOUSE_RECEIPT_UPDATE)
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 资产id
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
}

func (s BatchqueryImportassetRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryImportassetRequest) GoString() string {
	return s.String()
}

func (s *BatchqueryImportassetRequest) SetAuthToken(v string) *BatchqueryImportassetRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchqueryImportassetRequest) SetProductInstanceId(v string) *BatchqueryImportassetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchqueryImportassetRequest) SetCurrentPage(v int64) *BatchqueryImportassetRequest {
	s.CurrentPage = &v
	return s
}

func (s *BatchqueryImportassetRequest) SetPageSize(v int64) *BatchqueryImportassetRequest {
	s.PageSize = &v
	return s
}

func (s *BatchqueryImportassetRequest) SetType(v string) *BatchqueryImportassetRequest {
	s.Type = &v
	return s
}

func (s *BatchqueryImportassetRequest) SetUserId(v string) *BatchqueryImportassetRequest {
	s.UserId = &v
	return s
}

func (s *BatchqueryImportassetRequest) SetAssetId(v string) *BatchqueryImportassetRequest {
	s.AssetId = &v
	return s
}

type BatchqueryImportassetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前页码
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 时间
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
	// 请求标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 总条目
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
	// 溯源信息
	TraceInfoList []*WarehouseReceiptTraceInfo `json:"trace_info_list,omitempty" xml:"trace_info_list,omitempty" type:"Repeated"`
}

func (s BatchqueryImportassetResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryImportassetResponse) GoString() string {
	return s.String()
}

func (s *BatchqueryImportassetResponse) SetReqMsgId(v string) *BatchqueryImportassetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchqueryImportassetResponse) SetResultCode(v string) *BatchqueryImportassetResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchqueryImportassetResponse) SetResultMsg(v string) *BatchqueryImportassetResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchqueryImportassetResponse) SetCurrentPage(v int64) *BatchqueryImportassetResponse {
	s.CurrentPage = &v
	return s
}

func (s *BatchqueryImportassetResponse) SetDate(v int64) *BatchqueryImportassetResponse {
	s.Date = &v
	return s
}

func (s *BatchqueryImportassetResponse) SetRequestId(v string) *BatchqueryImportassetResponse {
	s.RequestId = &v
	return s
}

func (s *BatchqueryImportassetResponse) SetTotalCount(v int64) *BatchqueryImportassetResponse {
	s.TotalCount = &v
	return s
}

func (s *BatchqueryImportassetResponse) SetTotalPage(v int64) *BatchqueryImportassetResponse {
	s.TotalPage = &v
	return s
}

func (s *BatchqueryImportassetResponse) SetTraceInfoList(v []*WarehouseReceiptTraceInfo) *BatchqueryImportassetResponse {
	s.TraceInfoList = v
	return s
}

type CreateTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 数据字典
	Template *string `json:"template,omitempty" xml:"template,omitempty"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s CreateTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTemplateRequest) GoString() string {
	return s.String()
}

func (s *CreateTemplateRequest) SetAuthToken(v string) *CreateTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTemplateRequest) SetProductInstanceId(v string) *CreateTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTemplateRequest) SetName(v string) *CreateTemplateRequest {
	s.Name = &v
	return s
}

func (s *CreateTemplateRequest) SetTemplate(v string) *CreateTemplateRequest {
	s.Template = &v
	return s
}

func (s *CreateTemplateRequest) SetUserId(v string) *CreateTemplateRequest {
	s.UserId = &v
	return s
}

type CreateTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 时间
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
	// 请求标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 数据字典id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty"`
}

func (s CreateTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTemplateResponse) GoString() string {
	return s.String()
}

func (s *CreateTemplateResponse) SetReqMsgId(v string) *CreateTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTemplateResponse) SetResultCode(v string) *CreateTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTemplateResponse) SetResultMsg(v string) *CreateTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTemplateResponse) SetDate(v int64) *CreateTemplateResponse {
	s.Date = &v
	return s
}

func (s *CreateTemplateResponse) SetRequestId(v string) *CreateTemplateResponse {
	s.RequestId = &v
	return s
}

func (s *CreateTemplateResponse) SetTemplateId(v string) *CreateTemplateResponse {
	s.TemplateId = &v
	return s
}

type UpdateTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据字典id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 数据字典内容
	Template *string `json:"template,omitempty" xml:"template,omitempty"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s UpdateTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateTemplateRequest) GoString() string {
	return s.String()
}

func (s *UpdateTemplateRequest) SetAuthToken(v string) *UpdateTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateTemplateRequest) SetProductInstanceId(v string) *UpdateTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateTemplateRequest) SetTemplateId(v string) *UpdateTemplateRequest {
	s.TemplateId = &v
	return s
}

func (s *UpdateTemplateRequest) SetTemplate(v string) *UpdateTemplateRequest {
	s.Template = &v
	return s
}

func (s *UpdateTemplateRequest) SetUserId(v string) *UpdateTemplateRequest {
	s.UserId = &v
	return s
}

type UpdateTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 时间
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s UpdateTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateTemplateResponse) GoString() string {
	return s.String()
}

func (s *UpdateTemplateResponse) SetReqMsgId(v string) *UpdateTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateTemplateResponse) SetResultCode(v string) *UpdateTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateTemplateResponse) SetResultMsg(v string) *UpdateTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateTemplateResponse) SetDate(v int64) *UpdateTemplateResponse {
	s.Date = &v
	return s
}

func (s *UpdateTemplateResponse) SetRequestId(v string) *UpdateTemplateResponse {
	s.RequestId = &v
	return s
}

type QueryTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据字典id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s QueryTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTemplateRequest) GoString() string {
	return s.String()
}

func (s *QueryTemplateRequest) SetAuthToken(v string) *QueryTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTemplateRequest) SetProductInstanceId(v string) *QueryTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTemplateRequest) SetTemplateId(v string) *QueryTemplateRequest {
	s.TemplateId = &v
	return s
}

func (s *QueryTemplateRequest) SetUserId(v string) *QueryTemplateRequest {
	s.UserId = &v
	return s
}

type QueryTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 时间
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 数据字典信息
	TemplateInfo *TemplateInfo `json:"template_info,omitempty" xml:"template_info,omitempty"`
}

func (s QueryTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTemplateResponse) GoString() string {
	return s.String()
}

func (s *QueryTemplateResponse) SetReqMsgId(v string) *QueryTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTemplateResponse) SetResultCode(v string) *QueryTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTemplateResponse) SetResultMsg(v string) *QueryTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTemplateResponse) SetDate(v int64) *QueryTemplateResponse {
	s.Date = &v
	return s
}

func (s *QueryTemplateResponse) SetRequestId(v string) *QueryTemplateResponse {
	s.RequestId = &v
	return s
}

func (s *QueryTemplateResponse) SetTemplateInfo(v *TemplateInfo) *QueryTemplateResponse {
	s.TemplateInfo = v
	return s
}

type AllTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true"`
	// 一页的大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s AllTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s AllTemplateRequest) GoString() string {
	return s.String()
}

func (s *AllTemplateRequest) SetAuthToken(v string) *AllTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *AllTemplateRequest) SetProductInstanceId(v string) *AllTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllTemplateRequest) SetCurrentPage(v int64) *AllTemplateRequest {
	s.CurrentPage = &v
	return s
}

func (s *AllTemplateRequest) SetPageSize(v int64) *AllTemplateRequest {
	s.PageSize = &v
	return s
}

func (s *AllTemplateRequest) SetUserId(v string) *AllTemplateRequest {
	s.UserId = &v
	return s
}

type AllTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 时间
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 数据字典信息
	TemplateInfoList []*TemplateInfo `json:"template_info_list,omitempty" xml:"template_info_list,omitempty" type:"Repeated"`
}

func (s AllTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s AllTemplateResponse) GoString() string {
	return s.String()
}

func (s *AllTemplateResponse) SetReqMsgId(v string) *AllTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllTemplateResponse) SetResultCode(v string) *AllTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *AllTemplateResponse) SetResultMsg(v string) *AllTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllTemplateResponse) SetDate(v int64) *AllTemplateResponse {
	s.Date = &v
	return s
}

func (s *AllTemplateResponse) SetRequestId(v string) *AllTemplateResponse {
	s.RequestId = &v
	return s
}

func (s *AllTemplateResponse) SetTemplateInfoList(v []*TemplateInfo) *AllTemplateResponse {
	s.TemplateInfoList = v
	return s
}

type CreateCheckcodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 物权码
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 创建验权码的用户
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s CreateCheckcodeRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateCheckcodeRequest) GoString() string {
	return s.String()
}

func (s *CreateCheckcodeRequest) SetAuthToken(v string) *CreateCheckcodeRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateCheckcodeRequest) SetProductInstanceId(v string) *CreateCheckcodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateCheckcodeRequest) SetAssetId(v string) *CreateCheckcodeRequest {
	s.AssetId = &v
	return s
}

func (s *CreateCheckcodeRequest) SetUserId(v string) *CreateCheckcodeRequest {
	s.UserId = &v
	return s
}

type CreateCheckcodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 验权码
	CheckCode *string `json:"check_code,omitempty" xml:"check_code,omitempty"`
	// 请求标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 时间戳
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
}

func (s CreateCheckcodeResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateCheckcodeResponse) GoString() string {
	return s.String()
}

func (s *CreateCheckcodeResponse) SetReqMsgId(v string) *CreateCheckcodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateCheckcodeResponse) SetResultCode(v string) *CreateCheckcodeResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateCheckcodeResponse) SetResultMsg(v string) *CreateCheckcodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateCheckcodeResponse) SetCheckCode(v string) *CreateCheckcodeResponse {
	s.CheckCode = &v
	return s
}

func (s *CreateCheckcodeResponse) SetRequestId(v string) *CreateCheckcodeResponse {
	s.RequestId = &v
	return s
}

func (s *CreateCheckcodeResponse) SetDate(v int64) *CreateCheckcodeResponse {
	s.Date = &v
	return s
}

type CheckCheckcodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 物权码
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 验权码
	CheckCode *string `json:"check_code,omitempty" xml:"check_code,omitempty" require:"true"`
}

func (s CheckCheckcodeRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckCheckcodeRequest) GoString() string {
	return s.String()
}

func (s *CheckCheckcodeRequest) SetAuthToken(v string) *CheckCheckcodeRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckCheckcodeRequest) SetProductInstanceId(v string) *CheckCheckcodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckCheckcodeRequest) SetAssetId(v string) *CheckCheckcodeRequest {
	s.AssetId = &v
	return s
}

func (s *CheckCheckcodeRequest) SetCheckCode(v string) *CheckCheckcodeRequest {
	s.CheckCode = &v
	return s
}

type CheckCheckcodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 校验通过与否
	Audit *bool `json:"audit,omitempty" xml:"audit,omitempty"`
	// 请求标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 时间戳
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
}

func (s CheckCheckcodeResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckCheckcodeResponse) GoString() string {
	return s.String()
}

func (s *CheckCheckcodeResponse) SetReqMsgId(v string) *CheckCheckcodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckCheckcodeResponse) SetResultCode(v string) *CheckCheckcodeResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckCheckcodeResponse) SetResultMsg(v string) *CheckCheckcodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckCheckcodeResponse) SetAudit(v bool) *CheckCheckcodeResponse {
	s.Audit = &v
	return s
}

func (s *CheckCheckcodeResponse) SetRequestId(v string) *CheckCheckcodeResponse {
	s.RequestId = &v
	return s
}

func (s *CheckCheckcodeResponse) SetDate(v int64) *CheckCheckcodeResponse {
	s.Date = &v
	return s
}

type CreateAssetpledgeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 物权id
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 资金方的id
	LenderId *string `json:"lender_id,omitempty" xml:"lender_id,omitempty" require:"true"`
	// 申请方的id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 融资协议
	FinancialProtocolId *string `json:"financial_protocol_id,omitempty" xml:"financial_protocol_id,omitempty"`
	// 质押金额
	Value *int64 `json:"value,omitempty" xml:"value,omitempty" require:"true"`
	// 质押时长
	Duration *int64 `json:"duration,omitempty" xml:"duration,omitempty" require:"true"`
}

func (s CreateAssetpledgeRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAssetpledgeRequest) GoString() string {
	return s.String()
}

func (s *CreateAssetpledgeRequest) SetAuthToken(v string) *CreateAssetpledgeRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAssetpledgeRequest) SetProductInstanceId(v string) *CreateAssetpledgeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAssetpledgeRequest) SetAssetId(v string) *CreateAssetpledgeRequest {
	s.AssetId = &v
	return s
}

func (s *CreateAssetpledgeRequest) SetLenderId(v string) *CreateAssetpledgeRequest {
	s.LenderId = &v
	return s
}

func (s *CreateAssetpledgeRequest) SetUserId(v string) *CreateAssetpledgeRequest {
	s.UserId = &v
	return s
}

func (s *CreateAssetpledgeRequest) SetFinancialProtocolId(v string) *CreateAssetpledgeRequest {
	s.FinancialProtocolId = &v
	return s
}

func (s *CreateAssetpledgeRequest) SetValue(v int64) *CreateAssetpledgeRequest {
	s.Value = &v
	return s
}

func (s *CreateAssetpledgeRequest) SetDuration(v int64) *CreateAssetpledgeRequest {
	s.Duration = &v
	return s
}

type CreateAssetpledgeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 质押申请id
	PledgeId *string `json:"pledge_id,omitempty" xml:"pledge_id,omitempty"`
	// 区块链信息
	Info *BlockchainInfo `json:"info,omitempty" xml:"info,omitempty"`
	// 时间戳
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
	// 请求标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s CreateAssetpledgeResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAssetpledgeResponse) GoString() string {
	return s.String()
}

func (s *CreateAssetpledgeResponse) SetReqMsgId(v string) *CreateAssetpledgeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAssetpledgeResponse) SetResultCode(v string) *CreateAssetpledgeResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAssetpledgeResponse) SetResultMsg(v string) *CreateAssetpledgeResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAssetpledgeResponse) SetPledgeId(v string) *CreateAssetpledgeResponse {
	s.PledgeId = &v
	return s
}

func (s *CreateAssetpledgeResponse) SetInfo(v *BlockchainInfo) *CreateAssetpledgeResponse {
	s.Info = v
	return s
}

func (s *CreateAssetpledgeResponse) SetDate(v int64) *CreateAssetpledgeResponse {
	s.Date = &v
	return s
}

func (s *CreateAssetpledgeResponse) SetRequestId(v string) *CreateAssetpledgeResponse {
	s.RequestId = &v
	return s
}

type ReleaseAssetpledgeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资金方的id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 质押Id
	PledgeId *string `json:"pledge_id,omitempty" xml:"pledge_id,omitempty" require:"true"`
	// 放款时间
	LendDate *int64 `json:"lend_date,omitempty" xml:"lend_date,omitempty" require:"true"`
	// 放款金额
	Value *int64 `json:"value,omitempty" xml:"value,omitempty" require:"true"`
	// 收款方名称
	BorrowerName *string `json:"borrower_name,omitempty" xml:"borrower_name,omitempty" require:"true"`
	// 收款方账号
	BorrowerAccount *string `json:"borrower_account,omitempty" xml:"borrower_account,omitempty" require:"true"`
	// 收款方银行
	BorrowerBankInfo *string `json:"borrower_bank_info,omitempty" xml:"borrower_bank_info,omitempty" require:"true"`
}

func (s ReleaseAssetpledgeRequest) String() string {
	return tea.Prettify(s)
}

func (s ReleaseAssetpledgeRequest) GoString() string {
	return s.String()
}

func (s *ReleaseAssetpledgeRequest) SetAuthToken(v string) *ReleaseAssetpledgeRequest {
	s.AuthToken = &v
	return s
}

func (s *ReleaseAssetpledgeRequest) SetProductInstanceId(v string) *ReleaseAssetpledgeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ReleaseAssetpledgeRequest) SetUserId(v string) *ReleaseAssetpledgeRequest {
	s.UserId = &v
	return s
}

func (s *ReleaseAssetpledgeRequest) SetPledgeId(v string) *ReleaseAssetpledgeRequest {
	s.PledgeId = &v
	return s
}

func (s *ReleaseAssetpledgeRequest) SetLendDate(v int64) *ReleaseAssetpledgeRequest {
	s.LendDate = &v
	return s
}

func (s *ReleaseAssetpledgeRequest) SetValue(v int64) *ReleaseAssetpledgeRequest {
	s.Value = &v
	return s
}

func (s *ReleaseAssetpledgeRequest) SetBorrowerName(v string) *ReleaseAssetpledgeRequest {
	s.BorrowerName = &v
	return s
}

func (s *ReleaseAssetpledgeRequest) SetBorrowerAccount(v string) *ReleaseAssetpledgeRequest {
	s.BorrowerAccount = &v
	return s
}

func (s *ReleaseAssetpledgeRequest) SetBorrowerBankInfo(v string) *ReleaseAssetpledgeRequest {
	s.BorrowerBankInfo = &v
	return s
}

type ReleaseAssetpledgeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链信息
	Info *BlockchainInfo `json:"info,omitempty" xml:"info,omitempty"`
	// 时间戳
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
	// 请求标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s ReleaseAssetpledgeResponse) String() string {
	return tea.Prettify(s)
}

func (s ReleaseAssetpledgeResponse) GoString() string {
	return s.String()
}

func (s *ReleaseAssetpledgeResponse) SetReqMsgId(v string) *ReleaseAssetpledgeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ReleaseAssetpledgeResponse) SetResultCode(v string) *ReleaseAssetpledgeResponse {
	s.ResultCode = &v
	return s
}

func (s *ReleaseAssetpledgeResponse) SetResultMsg(v string) *ReleaseAssetpledgeResponse {
	s.ResultMsg = &v
	return s
}

func (s *ReleaseAssetpledgeResponse) SetInfo(v *BlockchainInfo) *ReleaseAssetpledgeResponse {
	s.Info = v
	return s
}

func (s *ReleaseAssetpledgeResponse) SetDate(v int64) *ReleaseAssetpledgeResponse {
	s.Date = &v
	return s
}

func (s *ReleaseAssetpledgeResponse) SetRequestId(v string) *ReleaseAssetpledgeResponse {
	s.RequestId = &v
	return s
}

type RepayAssetpledgeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 申请方
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 质押id
	PledgeId *string `json:"pledge_id,omitempty" xml:"pledge_id,omitempty" require:"true"`
	// 收款方银行
	RecipientBank *string `json:"recipient_bank,omitempty" xml:"recipient_bank,omitempty" require:"true"`
	// 收款方账号
	RecipientAccount *string `json:"recipient_account,omitempty" xml:"recipient_account,omitempty" require:"true"`
	// 金额
	Value *int64 `json:"value,omitempty" xml:"value,omitempty" require:"true"`
	// 还款时间
	RepayDate *int64 `json:"repay_date,omitempty" xml:"repay_date,omitempty" require:"true"`
}

func (s RepayAssetpledgeRequest) String() string {
	return tea.Prettify(s)
}

func (s RepayAssetpledgeRequest) GoString() string {
	return s.String()
}

func (s *RepayAssetpledgeRequest) SetAuthToken(v string) *RepayAssetpledgeRequest {
	s.AuthToken = &v
	return s
}

func (s *RepayAssetpledgeRequest) SetProductInstanceId(v string) *RepayAssetpledgeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RepayAssetpledgeRequest) SetUserId(v string) *RepayAssetpledgeRequest {
	s.UserId = &v
	return s
}

func (s *RepayAssetpledgeRequest) SetPledgeId(v string) *RepayAssetpledgeRequest {
	s.PledgeId = &v
	return s
}

func (s *RepayAssetpledgeRequest) SetRecipientBank(v string) *RepayAssetpledgeRequest {
	s.RecipientBank = &v
	return s
}

func (s *RepayAssetpledgeRequest) SetRecipientAccount(v string) *RepayAssetpledgeRequest {
	s.RecipientAccount = &v
	return s
}

func (s *RepayAssetpledgeRequest) SetValue(v int64) *RepayAssetpledgeRequest {
	s.Value = &v
	return s
}

func (s *RepayAssetpledgeRequest) SetRepayDate(v int64) *RepayAssetpledgeRequest {
	s.RepayDate = &v
	return s
}

type RepayAssetpledgeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 还款id
	RepayId *string `json:"repay_id,omitempty" xml:"repay_id,omitempty"`
	// 链信息
	Info *BlockchainInfo `json:"info,omitempty" xml:"info,omitempty"`
	// 请求标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 时间戳
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
}

func (s RepayAssetpledgeResponse) String() string {
	return tea.Prettify(s)
}

func (s RepayAssetpledgeResponse) GoString() string {
	return s.String()
}

func (s *RepayAssetpledgeResponse) SetReqMsgId(v string) *RepayAssetpledgeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RepayAssetpledgeResponse) SetResultCode(v string) *RepayAssetpledgeResponse {
	s.ResultCode = &v
	return s
}

func (s *RepayAssetpledgeResponse) SetResultMsg(v string) *RepayAssetpledgeResponse {
	s.ResultMsg = &v
	return s
}

func (s *RepayAssetpledgeResponse) SetRepayId(v string) *RepayAssetpledgeResponse {
	s.RepayId = &v
	return s
}

func (s *RepayAssetpledgeResponse) SetInfo(v *BlockchainInfo) *RepayAssetpledgeResponse {
	s.Info = v
	return s
}

func (s *RepayAssetpledgeResponse) SetRequestId(v string) *RepayAssetpledgeResponse {
	s.RequestId = &v
	return s
}

func (s *RepayAssetpledgeResponse) SetDate(v int64) *RepayAssetpledgeResponse {
	s.Date = &v
	return s
}

type GetLeagueAccountinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s GetLeagueAccountinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s GetLeagueAccountinfoRequest) GoString() string {
	return s.String()
}

func (s *GetLeagueAccountinfoRequest) SetAuthToken(v string) *GetLeagueAccountinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *GetLeagueAccountinfoRequest) SetProductInstanceId(v string) *GetLeagueAccountinfoRequest {
	s.ProductInstanceId = &v
	return s
}

type GetLeagueAccountinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户信息
	Role *AssetChainUser `json:"role,omitempty" xml:"role,omitempty"`
}

func (s GetLeagueAccountinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s GetLeagueAccountinfoResponse) GoString() string {
	return s.String()
}

func (s *GetLeagueAccountinfoResponse) SetReqMsgId(v string) *GetLeagueAccountinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetLeagueAccountinfoResponse) SetResultCode(v string) *GetLeagueAccountinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *GetLeagueAccountinfoResponse) SetResultMsg(v string) *GetLeagueAccountinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetLeagueAccountinfoResponse) SetRole(v *AssetChainUser) *GetLeagueAccountinfoResponse {
	s.Role = v
	return s
}

type CreateWarehouseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 地址
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true"`
	// 平面图
	BlueprintId *string `json:"blueprint_id,omitempty" xml:"blueprint_id,omitempty"`
	// 所在国家
	Country *string `json:"country,omitempty" xml:"country,omitempty" require:"true"`
	// 其他信息
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 纬度
	Latitude *string `json:"latitude,omitempty" xml:"latitude,omitempty" require:"true"`
	// 经度
	Longitude *string `json:"longitude,omitempty" xml:"longitude,omitempty" require:"true"`
	// 仓库面积
	WarehouseArea *string `json:"warehouse_area,omitempty" xml:"warehouse_area,omitempty" require:"true"`
	// 仓库高度
	WarehouseHeight *string `json:"warehouse_height,omitempty" xml:"warehouse_height,omitempty"`
	// 仓库id
	WarehouseId *string `json:"warehouse_id,omitempty" xml:"warehouse_id,omitempty" require:"true" maxLength:"255" minLength:"1"`
	// 仓库名称
	WarehouseName *string `json:"warehouse_name,omitempty" xml:"warehouse_name,omitempty" require:"true" maxLength:"255" minLength:"1"`
}

func (s CreateWarehouseRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateWarehouseRequest) GoString() string {
	return s.String()
}

func (s *CreateWarehouseRequest) SetAuthToken(v string) *CreateWarehouseRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateWarehouseRequest) SetProductInstanceId(v string) *CreateWarehouseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateWarehouseRequest) SetAddress(v string) *CreateWarehouseRequest {
	s.Address = &v
	return s
}

func (s *CreateWarehouseRequest) SetBlueprintId(v string) *CreateWarehouseRequest {
	s.BlueprintId = &v
	return s
}

func (s *CreateWarehouseRequest) SetCountry(v string) *CreateWarehouseRequest {
	s.Country = &v
	return s
}

func (s *CreateWarehouseRequest) SetExtraInfo(v string) *CreateWarehouseRequest {
	s.ExtraInfo = &v
	return s
}

func (s *CreateWarehouseRequest) SetLatitude(v string) *CreateWarehouseRequest {
	s.Latitude = &v
	return s
}

func (s *CreateWarehouseRequest) SetLongitude(v string) *CreateWarehouseRequest {
	s.Longitude = &v
	return s
}

func (s *CreateWarehouseRequest) SetWarehouseArea(v string) *CreateWarehouseRequest {
	s.WarehouseArea = &v
	return s
}

func (s *CreateWarehouseRequest) SetWarehouseHeight(v string) *CreateWarehouseRequest {
	s.WarehouseHeight = &v
	return s
}

func (s *CreateWarehouseRequest) SetWarehouseId(v string) *CreateWarehouseRequest {
	s.WarehouseId = &v
	return s
}

func (s *CreateWarehouseRequest) SetWarehouseName(v string) *CreateWarehouseRequest {
	s.WarehouseName = &v
	return s
}

type CreateWarehouseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 仓库id
	WarehouseId *string `json:"warehouse_id,omitempty" xml:"warehouse_id,omitempty"`
}

func (s CreateWarehouseResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateWarehouseResponse) GoString() string {
	return s.String()
}

func (s *CreateWarehouseResponse) SetReqMsgId(v string) *CreateWarehouseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateWarehouseResponse) SetResultCode(v string) *CreateWarehouseResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateWarehouseResponse) SetResultMsg(v string) *CreateWarehouseResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateWarehouseResponse) SetWarehouseId(v string) *CreateWarehouseResponse {
	s.WarehouseId = &v
	return s
}

type ListLeagueRoleRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 角色类型集合【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
	RoleTypes []*string `json:"role_types,omitempty" xml:"role_types,omitempty" require:"true" type:"Repeated"`
}

func (s ListLeagueRoleRequest) String() string {
	return tea.Prettify(s)
}

func (s ListLeagueRoleRequest) GoString() string {
	return s.String()
}

func (s *ListLeagueRoleRequest) SetAuthToken(v string) *ListLeagueRoleRequest {
	s.AuthToken = &v
	return s
}

func (s *ListLeagueRoleRequest) SetProductInstanceId(v string) *ListLeagueRoleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListLeagueRoleRequest) SetRoleTypes(v []*string) *ListLeagueRoleRequest {
	s.RoleTypes = v
	return s
}

type ListLeagueRoleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 角色列表
	RoleList []*Role `json:"role_list,omitempty" xml:"role_list,omitempty" type:"Repeated"`
}

func (s ListLeagueRoleResponse) String() string {
	return tea.Prettify(s)
}

func (s ListLeagueRoleResponse) GoString() string {
	return s.String()
}

func (s *ListLeagueRoleResponse) SetReqMsgId(v string) *ListLeagueRoleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListLeagueRoleResponse) SetResultCode(v string) *ListLeagueRoleResponse {
	s.ResultCode = &v
	return s
}

func (s *ListLeagueRoleResponse) SetResultMsg(v string) *ListLeagueRoleResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListLeagueRoleResponse) SetRoleList(v []*Role) *ListLeagueRoleResponse {
	s.RoleList = v
	return s
}

type GetWarehouseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 仓库id
	WarehouseId *string `json:"warehouse_id,omitempty" xml:"warehouse_id,omitempty" require:"true"`
}

func (s GetWarehouseRequest) String() string {
	return tea.Prettify(s)
}

func (s GetWarehouseRequest) GoString() string {
	return s.String()
}

func (s *GetWarehouseRequest) SetAuthToken(v string) *GetWarehouseRequest {
	s.AuthToken = &v
	return s
}

func (s *GetWarehouseRequest) SetProductInstanceId(v string) *GetWarehouseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetWarehouseRequest) SetWarehouseId(v string) *GetWarehouseRequest {
	s.WarehouseId = &v
	return s
}

type GetWarehouseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 地址
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 平面图
	BlueprintUrl *string `json:"blueprint_url,omitempty" xml:"blueprint_url,omitempty"`
	// 所在国家
	Country *string `json:"country,omitempty" xml:"country,omitempty"`
	// 设备数量
	DeviceNum *int64 `json:"device_num,omitempty" xml:"device_num,omitempty"`
	// 其他信息
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 纬度
	Latitude *string `json:"latitude,omitempty" xml:"latitude,omitempty"`
	// 经度
	Longitude *string `json:"longitude,omitempty" xml:"longitude,omitempty"`
	// 智能版本
	SmartLevel *string `json:"smart_level,omitempty" xml:"smart_level,omitempty"`
	// 仓位数量
	StockPositionNum *int64 `json:"stock_position_num,omitempty" xml:"stock_position_num,omitempty"`
	// version
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
	// 仓库面积
	WarehouseArea *string `json:"warehouse_area,omitempty" xml:"warehouse_area,omitempty"`
	// 仓库高度
	WarehouseHeight *string `json:"warehouse_height,omitempty" xml:"warehouse_height,omitempty"`
	// 仓库id
	WarehouseId *string `json:"warehouse_id,omitempty" xml:"warehouse_id,omitempty"`
	// 仓库名称
	WarehouseName *string `json:"warehouse_name,omitempty" xml:"warehouse_name,omitempty"`
}

func (s GetWarehouseResponse) String() string {
	return tea.Prettify(s)
}

func (s GetWarehouseResponse) GoString() string {
	return s.String()
}

func (s *GetWarehouseResponse) SetReqMsgId(v string) *GetWarehouseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetWarehouseResponse) SetResultCode(v string) *GetWarehouseResponse {
	s.ResultCode = &v
	return s
}

func (s *GetWarehouseResponse) SetResultMsg(v string) *GetWarehouseResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetWarehouseResponse) SetAddress(v string) *GetWarehouseResponse {
	s.Address = &v
	return s
}

func (s *GetWarehouseResponse) SetBlueprintUrl(v string) *GetWarehouseResponse {
	s.BlueprintUrl = &v
	return s
}

func (s *GetWarehouseResponse) SetCountry(v string) *GetWarehouseResponse {
	s.Country = &v
	return s
}

func (s *GetWarehouseResponse) SetDeviceNum(v int64) *GetWarehouseResponse {
	s.DeviceNum = &v
	return s
}

func (s *GetWarehouseResponse) SetExtraInfo(v string) *GetWarehouseResponse {
	s.ExtraInfo = &v
	return s
}

func (s *GetWarehouseResponse) SetLatitude(v string) *GetWarehouseResponse {
	s.Latitude = &v
	return s
}

func (s *GetWarehouseResponse) SetLongitude(v string) *GetWarehouseResponse {
	s.Longitude = &v
	return s
}

func (s *GetWarehouseResponse) SetSmartLevel(v string) *GetWarehouseResponse {
	s.SmartLevel = &v
	return s
}

func (s *GetWarehouseResponse) SetStockPositionNum(v int64) *GetWarehouseResponse {
	s.StockPositionNum = &v
	return s
}

func (s *GetWarehouseResponse) SetVersion(v string) *GetWarehouseResponse {
	s.Version = &v
	return s
}

func (s *GetWarehouseResponse) SetWarehouseArea(v string) *GetWarehouseResponse {
	s.WarehouseArea = &v
	return s
}

func (s *GetWarehouseResponse) SetWarehouseHeight(v string) *GetWarehouseResponse {
	s.WarehouseHeight = &v
	return s
}

func (s *GetWarehouseResponse) SetWarehouseId(v string) *GetWarehouseResponse {
	s.WarehouseId = &v
	return s
}

func (s *GetWarehouseResponse) SetWarehouseName(v string) *GetWarehouseResponse {
	s.WarehouseName = &v
	return s
}

type UpdateWarehouseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 地址（传原值，不可修改此项）
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true"`
	// 平面图
	BlueprintId *string `json:"blueprint_id,omitempty" xml:"blueprint_id,omitempty"`
	// 所在国家（传原值，不可修改此项）
	Country *string `json:"country,omitempty" xml:"country,omitempty" require:"true"`
	// 其他信息
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 仓库面积
	WarehouseArea *string `json:"warehouse_area,omitempty" xml:"warehouse_area,omitempty" require:"true"`
	// 仓库id
	WarehouseId *string `json:"warehouse_id,omitempty" xml:"warehouse_id,omitempty" require:"true"`
	// 仓库名称（传原值，不可修改此项）
	WarehouseName *string `json:"warehouse_name,omitempty" xml:"warehouse_name,omitempty" require:"true"`
}

func (s UpdateWarehouseRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateWarehouseRequest) GoString() string {
	return s.String()
}

func (s *UpdateWarehouseRequest) SetAuthToken(v string) *UpdateWarehouseRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateWarehouseRequest) SetProductInstanceId(v string) *UpdateWarehouseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateWarehouseRequest) SetAddress(v string) *UpdateWarehouseRequest {
	s.Address = &v
	return s
}

func (s *UpdateWarehouseRequest) SetBlueprintId(v string) *UpdateWarehouseRequest {
	s.BlueprintId = &v
	return s
}

func (s *UpdateWarehouseRequest) SetCountry(v string) *UpdateWarehouseRequest {
	s.Country = &v
	return s
}

func (s *UpdateWarehouseRequest) SetExtraInfo(v string) *UpdateWarehouseRequest {
	s.ExtraInfo = &v
	return s
}

func (s *UpdateWarehouseRequest) SetWarehouseArea(v string) *UpdateWarehouseRequest {
	s.WarehouseArea = &v
	return s
}

func (s *UpdateWarehouseRequest) SetWarehouseId(v string) *UpdateWarehouseRequest {
	s.WarehouseId = &v
	return s
}

func (s *UpdateWarehouseRequest) SetWarehouseName(v string) *UpdateWarehouseRequest {
	s.WarehouseName = &v
	return s
}

type UpdateWarehouseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 地址
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 平面图
	BlueprintId *string `json:"blueprint_id,omitempty" xml:"blueprint_id,omitempty"`
	// 所在国家
	Country *string `json:"country,omitempty" xml:"country,omitempty"`
	// 其他信息
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 经纬度
	Location *string `json:"location,omitempty" xml:"location,omitempty"`
	// 仓库面积
	WarehouseArea *string `json:"warehouse_area,omitempty" xml:"warehouse_area,omitempty"`
	// 仓库id
	WarehouseId *string `json:"warehouse_id,omitempty" xml:"warehouse_id,omitempty"`
	// 仓库名称
	WarehouseName *string `json:"warehouse_name,omitempty" xml:"warehouse_name,omitempty"`
}

func (s UpdateWarehouseResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateWarehouseResponse) GoString() string {
	return s.String()
}

func (s *UpdateWarehouseResponse) SetReqMsgId(v string) *UpdateWarehouseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateWarehouseResponse) SetResultCode(v string) *UpdateWarehouseResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateWarehouseResponse) SetResultMsg(v string) *UpdateWarehouseResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateWarehouseResponse) SetAddress(v string) *UpdateWarehouseResponse {
	s.Address = &v
	return s
}

func (s *UpdateWarehouseResponse) SetBlueprintId(v string) *UpdateWarehouseResponse {
	s.BlueprintId = &v
	return s
}

func (s *UpdateWarehouseResponse) SetCountry(v string) *UpdateWarehouseResponse {
	s.Country = &v
	return s
}

func (s *UpdateWarehouseResponse) SetExtraInfo(v string) *UpdateWarehouseResponse {
	s.ExtraInfo = &v
	return s
}

func (s *UpdateWarehouseResponse) SetLocation(v string) *UpdateWarehouseResponse {
	s.Location = &v
	return s
}

func (s *UpdateWarehouseResponse) SetWarehouseArea(v string) *UpdateWarehouseResponse {
	s.WarehouseArea = &v
	return s
}

func (s *UpdateWarehouseResponse) SetWarehouseId(v string) *UpdateWarehouseResponse {
	s.WarehouseId = &v
	return s
}

func (s *UpdateWarehouseResponse) SetWarehouseName(v string) *UpdateWarehouseResponse {
	s.WarehouseName = &v
	return s
}

type ListWarehouseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true"`
	// 页面大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s ListWarehouseRequest) String() string {
	return tea.Prettify(s)
}

func (s ListWarehouseRequest) GoString() string {
	return s.String()
}

func (s *ListWarehouseRequest) SetAuthToken(v string) *ListWarehouseRequest {
	s.AuthToken = &v
	return s
}

func (s *ListWarehouseRequest) SetProductInstanceId(v string) *ListWarehouseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListWarehouseRequest) SetCurrentPage(v int64) *ListWarehouseRequest {
	s.CurrentPage = &v
	return s
}

func (s *ListWarehouseRequest) SetPageSize(v int64) *ListWarehouseRequest {
	s.PageSize = &v
	return s
}

type ListWarehouseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 仓位总数
	LocationTotal *int64 `json:"location_total,omitempty" xml:"location_total,omitempty"`
	// 总条目
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
	// 仓库信息
	WarehouseList []*WarehouseInfo `json:"warehouse_list,omitempty" xml:"warehouse_list,omitempty" type:"Repeated"`
	// 设备总数
	DeviceTotal *int64 `json:"device_total,omitempty" xml:"device_total,omitempty"`
}

func (s ListWarehouseResponse) String() string {
	return tea.Prettify(s)
}

func (s ListWarehouseResponse) GoString() string {
	return s.String()
}

func (s *ListWarehouseResponse) SetReqMsgId(v string) *ListWarehouseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListWarehouseResponse) SetResultCode(v string) *ListWarehouseResponse {
	s.ResultCode = &v
	return s
}

func (s *ListWarehouseResponse) SetResultMsg(v string) *ListWarehouseResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListWarehouseResponse) SetLocationTotal(v int64) *ListWarehouseResponse {
	s.LocationTotal = &v
	return s
}

func (s *ListWarehouseResponse) SetTotalCount(v int64) *ListWarehouseResponse {
	s.TotalCount = &v
	return s
}

func (s *ListWarehouseResponse) SetTotalPage(v int64) *ListWarehouseResponse {
	s.TotalPage = &v
	return s
}

func (s *ListWarehouseResponse) SetWarehouseList(v []*WarehouseInfo) *ListWarehouseResponse {
	s.WarehouseList = v
	return s
}

func (s *ListWarehouseResponse) SetDeviceTotal(v int64) *ListWarehouseResponse {
	s.DeviceTotal = &v
	return s
}

type ListLeagueRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s ListLeagueRequest) String() string {
	return tea.Prettify(s)
}

func (s ListLeagueRequest) GoString() string {
	return s.String()
}

func (s *ListLeagueRequest) SetAuthToken(v string) *ListLeagueRequest {
	s.AuthToken = &v
	return s
}

func (s *ListLeagueRequest) SetProductInstanceId(v string) *ListLeagueRequest {
	s.ProductInstanceId = &v
	return s
}

type ListLeagueResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 联盟详情列表
	LeagueInfoList []*LeagueInfo `json:"league_info_list,omitempty" xml:"league_info_list,omitempty" type:"Repeated"`
}

func (s ListLeagueResponse) String() string {
	return tea.Prettify(s)
}

func (s ListLeagueResponse) GoString() string {
	return s.String()
}

func (s *ListLeagueResponse) SetReqMsgId(v string) *ListLeagueResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListLeagueResponse) SetResultCode(v string) *ListLeagueResponse {
	s.ResultCode = &v
	return s
}

func (s *ListLeagueResponse) SetResultMsg(v string) *ListLeagueResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListLeagueResponse) SetLeagueInfoList(v []*LeagueInfo) *ListLeagueResponse {
	s.LeagueInfoList = v
	return s
}

type QueryWarehouseDeviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备状态[READY：未启用，STARTED：已启用，LOADING：信息待完善，DELETED：已注销，ALL：全部]
	DeviceFilter *string `json:"device_filter,omitempty" xml:"device_filter,omitempty"`
	// 仓位id
	StorageLocationId *string `json:"storage_location_id,omitempty" xml:"storage_location_id,omitempty"`
	// 仓库id
	WarehouseId *string `json:"warehouse_id,omitempty" xml:"warehouse_id,omitempty" require:"true"`
}

func (s QueryWarehouseDeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryWarehouseDeviceRequest) GoString() string {
	return s.String()
}

func (s *QueryWarehouseDeviceRequest) SetAuthToken(v string) *QueryWarehouseDeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryWarehouseDeviceRequest) SetProductInstanceId(v string) *QueryWarehouseDeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryWarehouseDeviceRequest) SetDeviceFilter(v string) *QueryWarehouseDeviceRequest {
	s.DeviceFilter = &v
	return s
}

func (s *QueryWarehouseDeviceRequest) SetStorageLocationId(v string) *QueryWarehouseDeviceRequest {
	s.StorageLocationId = &v
	return s
}

func (s *QueryWarehouseDeviceRequest) SetWarehouseId(v string) *QueryWarehouseDeviceRequest {
	s.WarehouseId = &v
	return s
}

type QueryWarehouseDeviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 设备信息
	DeviceList []*DeviceInfo `json:"device_list,omitempty" xml:"device_list,omitempty" type:"Repeated"`
}

func (s QueryWarehouseDeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryWarehouseDeviceResponse) GoString() string {
	return s.String()
}

func (s *QueryWarehouseDeviceResponse) SetReqMsgId(v string) *QueryWarehouseDeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryWarehouseDeviceResponse) SetResultCode(v string) *QueryWarehouseDeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryWarehouseDeviceResponse) SetResultMsg(v string) *QueryWarehouseDeviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryWarehouseDeviceResponse) SetDeviceList(v []*DeviceInfo) *QueryWarehouseDeviceResponse {
	s.DeviceList = v
	return s
}

type CreateLeagueApplyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟描述
	LeagueDesc *string `json:"league_desc,omitempty" xml:"league_desc,omitempty"`
	// 联盟名称
	LeagueName *string `json:"league_name,omitempty" xml:"league_name,omitempty" require:"true"`
	// 费率
	Rate *int64 `json:"rate,omitempty" xml:"rate,omitempty"`
	// 角色类型【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
	RoleType *string `json:"role_type,omitempty" xml:"role_type,omitempty" require:"true"`
}

func (s CreateLeagueApplyRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeagueApplyRequest) GoString() string {
	return s.String()
}

func (s *CreateLeagueApplyRequest) SetAuthToken(v string) *CreateLeagueApplyRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeagueApplyRequest) SetProductInstanceId(v string) *CreateLeagueApplyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeagueApplyRequest) SetLeagueDesc(v string) *CreateLeagueApplyRequest {
	s.LeagueDesc = &v
	return s
}

func (s *CreateLeagueApplyRequest) SetLeagueName(v string) *CreateLeagueApplyRequest {
	s.LeagueName = &v
	return s
}

func (s *CreateLeagueApplyRequest) SetRate(v int64) *CreateLeagueApplyRequest {
	s.Rate = &v
	return s
}

func (s *CreateLeagueApplyRequest) SetRoleType(v string) *CreateLeagueApplyRequest {
	s.RoleType = &v
	return s
}

type CreateLeagueApplyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 联盟id
	ApplyId *string `json:"apply_id,omitempty" xml:"apply_id,omitempty"`
}

func (s CreateLeagueApplyResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeagueApplyResponse) GoString() string {
	return s.String()
}

func (s *CreateLeagueApplyResponse) SetReqMsgId(v string) *CreateLeagueApplyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeagueApplyResponse) SetResultCode(v string) *CreateLeagueApplyResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeagueApplyResponse) SetResultMsg(v string) *CreateLeagueApplyResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeagueApplyResponse) SetApplyId(v string) *CreateLeagueApplyResponse {
	s.ApplyId = &v
	return s
}

type CreateLeagueJoinapplyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 备注
	Comment *string `json:"comment,omitempty" xml:"comment,omitempty"`
	// 联盟Id
	LeagueId *string `json:"league_id,omitempty" xml:"league_id,omitempty" require:"true"`
	// 角色【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
	RoleType *string `json:"role_type,omitempty" xml:"role_type,omitempty" require:"true"`
}

func (s CreateLeagueJoinapplyRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeagueJoinapplyRequest) GoString() string {
	return s.String()
}

func (s *CreateLeagueJoinapplyRequest) SetAuthToken(v string) *CreateLeagueJoinapplyRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeagueJoinapplyRequest) SetProductInstanceId(v string) *CreateLeagueJoinapplyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeagueJoinapplyRequest) SetComment(v string) *CreateLeagueJoinapplyRequest {
	s.Comment = &v
	return s
}

func (s *CreateLeagueJoinapplyRequest) SetLeagueId(v string) *CreateLeagueJoinapplyRequest {
	s.LeagueId = &v
	return s
}

func (s *CreateLeagueJoinapplyRequest) SetRoleType(v string) *CreateLeagueJoinapplyRequest {
	s.RoleType = &v
	return s
}

type CreateLeagueJoinapplyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 申请id
	ApplyId *string `json:"apply_id,omitempty" xml:"apply_id,omitempty"`
}

func (s CreateLeagueJoinapplyResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeagueJoinapplyResponse) GoString() string {
	return s.String()
}

func (s *CreateLeagueJoinapplyResponse) SetReqMsgId(v string) *CreateLeagueJoinapplyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeagueJoinapplyResponse) SetResultCode(v string) *CreateLeagueJoinapplyResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeagueJoinapplyResponse) SetResultMsg(v string) *CreateLeagueJoinapplyResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeagueJoinapplyResponse) SetApplyId(v string) *CreateLeagueJoinapplyResponse {
	s.ApplyId = &v
	return s
}

type CancelLeagueApplyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 申请Id
	ApplyId *string `json:"apply_id,omitempty" xml:"apply_id,omitempty" require:"true"`
	// 申请类型【NONE,JOIN,CREATE,ALL】
	ApplyType *string `json:"apply_type,omitempty" xml:"apply_type,omitempty" require:"true"`
	// 备注
	Comment *string `json:"comment,omitempty" xml:"comment,omitempty"`
}

func (s CancelLeagueApplyRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelLeagueApplyRequest) GoString() string {
	return s.String()
}

func (s *CancelLeagueApplyRequest) SetAuthToken(v string) *CancelLeagueApplyRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelLeagueApplyRequest) SetProductInstanceId(v string) *CancelLeagueApplyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelLeagueApplyRequest) SetApplyId(v string) *CancelLeagueApplyRequest {
	s.ApplyId = &v
	return s
}

func (s *CancelLeagueApplyRequest) SetApplyType(v string) *CancelLeagueApplyRequest {
	s.ApplyType = &v
	return s
}

func (s *CancelLeagueApplyRequest) SetComment(v string) *CancelLeagueApplyRequest {
	s.Comment = &v
	return s
}

type CancelLeagueApplyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 申请类型【NONE,JOIN,CREATE,ALL】
	ApplyType *string `json:"apply_type,omitempty" xml:"apply_type,omitempty"`
}

func (s CancelLeagueApplyResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelLeagueApplyResponse) GoString() string {
	return s.String()
}

func (s *CancelLeagueApplyResponse) SetReqMsgId(v string) *CancelLeagueApplyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelLeagueApplyResponse) SetResultCode(v string) *CancelLeagueApplyResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelLeagueApplyResponse) SetResultMsg(v string) *CancelLeagueApplyResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelLeagueApplyResponse) SetApplyType(v string) *CancelLeagueApplyResponse {
	s.ApplyType = &v
	return s
}

type QueryWarehouseStoragelocationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 仓库id
	WarehouseId *string `json:"warehouse_id,omitempty" xml:"warehouse_id,omitempty" require:"true"`
}

func (s QueryWarehouseStoragelocationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryWarehouseStoragelocationRequest) GoString() string {
	return s.String()
}

func (s *QueryWarehouseStoragelocationRequest) SetAuthToken(v string) *QueryWarehouseStoragelocationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryWarehouseStoragelocationRequest) SetProductInstanceId(v string) *QueryWarehouseStoragelocationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryWarehouseStoragelocationRequest) SetWarehouseId(v string) *QueryWarehouseStoragelocationRequest {
	s.WarehouseId = &v
	return s
}

type QueryWarehouseStoragelocationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 库位信息
	StorageLocationList []*StorageLocation `json:"storage_location_list,omitempty" xml:"storage_location_list,omitempty" type:"Repeated"`
}

func (s QueryWarehouseStoragelocationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryWarehouseStoragelocationResponse) GoString() string {
	return s.String()
}

func (s *QueryWarehouseStoragelocationResponse) SetReqMsgId(v string) *QueryWarehouseStoragelocationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryWarehouseStoragelocationResponse) SetResultCode(v string) *QueryWarehouseStoragelocationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryWarehouseStoragelocationResponse) SetResultMsg(v string) *QueryWarehouseStoragelocationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryWarehouseStoragelocationResponse) SetStorageLocationList(v []*StorageLocation) *QueryWarehouseStoragelocationResponse {
	s.StorageLocationList = v
	return s
}

type AuthLeagueApplyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 申请Id
	ApplyId *string `json:"apply_id,omitempty" xml:"apply_id,omitempty" require:"true"`
	// 申请类型【NONE,JOIN,CREATE,ALL】
	ApplyType *string `json:"apply_type,omitempty" xml:"apply_type,omitempty" require:"true"`
	// 备注
	Comment *string `json:"comment,omitempty" xml:"comment,omitempty"`
	// 审核结果
	Pass *bool `json:"pass,omitempty" xml:"pass,omitempty" require:"true"`
}

func (s AuthLeagueApplyRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthLeagueApplyRequest) GoString() string {
	return s.String()
}

func (s *AuthLeagueApplyRequest) SetAuthToken(v string) *AuthLeagueApplyRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthLeagueApplyRequest) SetProductInstanceId(v string) *AuthLeagueApplyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthLeagueApplyRequest) SetApplyId(v string) *AuthLeagueApplyRequest {
	s.ApplyId = &v
	return s
}

func (s *AuthLeagueApplyRequest) SetApplyType(v string) *AuthLeagueApplyRequest {
	s.ApplyType = &v
	return s
}

func (s *AuthLeagueApplyRequest) SetComment(v string) *AuthLeagueApplyRequest {
	s.Comment = &v
	return s
}

func (s *AuthLeagueApplyRequest) SetPass(v bool) *AuthLeagueApplyRequest {
	s.Pass = &v
	return s
}

type AuthLeagueApplyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 申请类型【NONE,JOIN,CREATE,ALL】
	ApplyType *string `json:"apply_type,omitempty" xml:"apply_type,omitempty"`
}

func (s AuthLeagueApplyResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthLeagueApplyResponse) GoString() string {
	return s.String()
}

func (s *AuthLeagueApplyResponse) SetReqMsgId(v string) *AuthLeagueApplyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthLeagueApplyResponse) SetResultCode(v string) *AuthLeagueApplyResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthLeagueApplyResponse) SetResultMsg(v string) *AuthLeagueApplyResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthLeagueApplyResponse) SetApplyType(v string) *AuthLeagueApplyResponse {
	s.ApplyType = &v
	return s
}

type DeleteWarehouseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 仓库id
	WarehouseId *string `json:"warehouse_id,omitempty" xml:"warehouse_id,omitempty" require:"true"`
}

func (s DeleteWarehouseRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteWarehouseRequest) GoString() string {
	return s.String()
}

func (s *DeleteWarehouseRequest) SetAuthToken(v string) *DeleteWarehouseRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteWarehouseRequest) SetProductInstanceId(v string) *DeleteWarehouseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteWarehouseRequest) SetWarehouseId(v string) *DeleteWarehouseRequest {
	s.WarehouseId = &v
	return s
}

type DeleteWarehouseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteWarehouseResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteWarehouseResponse) GoString() string {
	return s.String()
}

func (s *DeleteWarehouseResponse) SetReqMsgId(v string) *DeleteWarehouseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteWarehouseResponse) SetResultCode(v string) *DeleteWarehouseResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteWarehouseResponse) SetResultMsg(v string) *DeleteWarehouseResponse {
	s.ResultMsg = &v
	return s
}

type ListLeagueApplyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 申请类型【NONE,JOIN,CREATE,ALL】
	ApplyType *string `json:"apply_type,omitempty" xml:"apply_type,omitempty" require:"true"`
	// 当前页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 入盟申请状态【NONE,WAITING,AGREED,REJECTED,CANCELED,ALL】
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s ListLeagueApplyRequest) String() string {
	return tea.Prettify(s)
}

func (s ListLeagueApplyRequest) GoString() string {
	return s.String()
}

func (s *ListLeagueApplyRequest) SetAuthToken(v string) *ListLeagueApplyRequest {
	s.AuthToken = &v
	return s
}

func (s *ListLeagueApplyRequest) SetProductInstanceId(v string) *ListLeagueApplyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListLeagueApplyRequest) SetApplyType(v string) *ListLeagueApplyRequest {
	s.ApplyType = &v
	return s
}

func (s *ListLeagueApplyRequest) SetCurrentPage(v int64) *ListLeagueApplyRequest {
	s.CurrentPage = &v
	return s
}

func (s *ListLeagueApplyRequest) SetPageSize(v int64) *ListLeagueApplyRequest {
	s.PageSize = &v
	return s
}

func (s *ListLeagueApplyRequest) SetStatus(v string) *ListLeagueApplyRequest {
	s.Status = &v
	return s
}

type ListLeagueApplyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 申请类型【NONE,JOIN,CREATE,ALL】
	ApplyType *string `json:"apply_type,omitempty" xml:"apply_type,omitempty"`
	// 申请内容
	LeagueApplyInfoList []*LeagueApplyInfo `json:"league_apply_info_list,omitempty" xml:"league_apply_info_list,omitempty" type:"Repeated"`
	// 总条目
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
}

func (s ListLeagueApplyResponse) String() string {
	return tea.Prettify(s)
}

func (s ListLeagueApplyResponse) GoString() string {
	return s.String()
}

func (s *ListLeagueApplyResponse) SetReqMsgId(v string) *ListLeagueApplyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListLeagueApplyResponse) SetResultCode(v string) *ListLeagueApplyResponse {
	s.ResultCode = &v
	return s
}

func (s *ListLeagueApplyResponse) SetResultMsg(v string) *ListLeagueApplyResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListLeagueApplyResponse) SetApplyType(v string) *ListLeagueApplyResponse {
	s.ApplyType = &v
	return s
}

func (s *ListLeagueApplyResponse) SetLeagueApplyInfoList(v []*LeagueApplyInfo) *ListLeagueApplyResponse {
	s.LeagueApplyInfoList = v
	return s
}

func (s *ListLeagueApplyResponse) SetTotalCount(v int64) *ListLeagueApplyResponse {
	s.TotalCount = &v
	return s
}

func (s *ListLeagueApplyResponse) SetTotalPage(v int64) *ListLeagueApplyResponse {
	s.TotalPage = &v
	return s
}

type CreateWarehouseStoraglocationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 是否禁用智能监管
	DisableSurv *bool `json:"disable_surv,omitempty" xml:"disable_surv,omitempty"`
	// 其他信息
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 库位名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 货物类型【DANGER：危险品，NON_DANGER：非危险品，FOOD：食品】
	ProductType *string `json:"product_type,omitempty" xml:"product_type,omitempty" require:"true"`
	// 状态【AVAILABLE：可用，IN_USE：使用中，IN_CONFIG：配置中，DELETED：已删除】
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 仓位面积
	StorageLocationArea *string `json:"storage_location_area,omitempty" xml:"storage_location_area,omitempty" require:"true"`
	// 仓位高度
	StorageLocationHeight *string `json:"storage_location_height,omitempty" xml:"storage_location_height,omitempty" require:"true"`
	// 库位类型【CHILL：冷藏，FREEZE：冷冻，PASSAGE：通道，FLAT：平面， STEREO：立体】
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 仓位虚拟id
	VirtualStorageLocationId *string `json:"virtual_storage_location_id,omitempty" xml:"virtual_storage_location_id,omitempty" require:"true"`
	// 仓库id
	WarehouseId *string `json:"warehouse_id,omitempty" xml:"warehouse_id,omitempty" require:"true"`
}

func (s CreateWarehouseStoraglocationRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateWarehouseStoraglocationRequest) GoString() string {
	return s.String()
}

func (s *CreateWarehouseStoraglocationRequest) SetAuthToken(v string) *CreateWarehouseStoraglocationRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateWarehouseStoraglocationRequest) SetProductInstanceId(v string) *CreateWarehouseStoraglocationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateWarehouseStoraglocationRequest) SetDisableSurv(v bool) *CreateWarehouseStoraglocationRequest {
	s.DisableSurv = &v
	return s
}

func (s *CreateWarehouseStoraglocationRequest) SetExtraInfo(v string) *CreateWarehouseStoraglocationRequest {
	s.ExtraInfo = &v
	return s
}

func (s *CreateWarehouseStoraglocationRequest) SetName(v string) *CreateWarehouseStoraglocationRequest {
	s.Name = &v
	return s
}

func (s *CreateWarehouseStoraglocationRequest) SetProductType(v string) *CreateWarehouseStoraglocationRequest {
	s.ProductType = &v
	return s
}

func (s *CreateWarehouseStoraglocationRequest) SetStatus(v string) *CreateWarehouseStoraglocationRequest {
	s.Status = &v
	return s
}

func (s *CreateWarehouseStoraglocationRequest) SetStorageLocationArea(v string) *CreateWarehouseStoraglocationRequest {
	s.StorageLocationArea = &v
	return s
}

func (s *CreateWarehouseStoraglocationRequest) SetStorageLocationHeight(v string) *CreateWarehouseStoraglocationRequest {
	s.StorageLocationHeight = &v
	return s
}

func (s *CreateWarehouseStoraglocationRequest) SetType(v string) *CreateWarehouseStoraglocationRequest {
	s.Type = &v
	return s
}

func (s *CreateWarehouseStoraglocationRequest) SetVirtualStorageLocationId(v string) *CreateWarehouseStoraglocationRequest {
	s.VirtualStorageLocationId = &v
	return s
}

func (s *CreateWarehouseStoraglocationRequest) SetWarehouseId(v string) *CreateWarehouseStoraglocationRequest {
	s.WarehouseId = &v
	return s
}

type CreateWarehouseStoraglocationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 库位id
	StorageLocationId *string `json:"storage_location_id,omitempty" xml:"storage_location_id,omitempty"`
}

func (s CreateWarehouseStoraglocationResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateWarehouseStoraglocationResponse) GoString() string {
	return s.String()
}

func (s *CreateWarehouseStoraglocationResponse) SetReqMsgId(v string) *CreateWarehouseStoraglocationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateWarehouseStoraglocationResponse) SetResultCode(v string) *CreateWarehouseStoraglocationResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateWarehouseStoraglocationResponse) SetResultMsg(v string) *CreateWarehouseStoraglocationResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateWarehouseStoraglocationResponse) SetStorageLocationId(v string) *CreateWarehouseStoraglocationResponse {
	s.StorageLocationId = &v
	return s
}

type GetWarehouseStoragelocationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 库位id
	LocationId *string `json:"location_id,omitempty" xml:"location_id,omitempty" require:"true"`
}

func (s GetWarehouseStoragelocationRequest) String() string {
	return tea.Prettify(s)
}

func (s GetWarehouseStoragelocationRequest) GoString() string {
	return s.String()
}

func (s *GetWarehouseStoragelocationRequest) SetAuthToken(v string) *GetWarehouseStoragelocationRequest {
	s.AuthToken = &v
	return s
}

func (s *GetWarehouseStoragelocationRequest) SetProductInstanceId(v string) *GetWarehouseStoragelocationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetWarehouseStoragelocationRequest) SetLocationId(v string) *GetWarehouseStoragelocationRequest {
	s.LocationId = &v
	return s
}

type GetWarehouseStoragelocationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 库位信息
	StorageLocation *StorageLocation `json:"storage_location,omitempty" xml:"storage_location,omitempty"`
}

func (s GetWarehouseStoragelocationResponse) String() string {
	return tea.Prettify(s)
}

func (s GetWarehouseStoragelocationResponse) GoString() string {
	return s.String()
}

func (s *GetWarehouseStoragelocationResponse) SetReqMsgId(v string) *GetWarehouseStoragelocationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetWarehouseStoragelocationResponse) SetResultCode(v string) *GetWarehouseStoragelocationResponse {
	s.ResultCode = &v
	return s
}

func (s *GetWarehouseStoragelocationResponse) SetResultMsg(v string) *GetWarehouseStoragelocationResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetWarehouseStoragelocationResponse) SetStorageLocation(v *StorageLocation) *GetWarehouseStoragelocationResponse {
	s.StorageLocation = v
	return s
}

type UpdateWarehouseStoragelocationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 其他信息
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 仓位id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 货物类型【DANGER：危险品，NON_DANGER：非危险品，FOOD：食品】
	ProductType *string `json:"product_type,omitempty" xml:"product_type,omitempty" require:"true"`
	// 状态【AVAILABLE：可用，IN_USE：使用中，IN_CONFIG：配置中，DELETED：已删除】
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 仓位面积
	StorageLocationArea *string `json:"storage_location_area,omitempty" xml:"storage_location_area,omitempty" require:"true"`
	// 仓位高度
	StorageLocationHeight *string `json:"storage_location_height,omitempty" xml:"storage_location_height,omitempty" require:"true"`
	// 库位类型【CHILL：冷藏，FREEZE：冷冻，PASSAGE：通道，FLAT：平面， STEREO：立体】
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s UpdateWarehouseStoragelocationRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateWarehouseStoragelocationRequest) GoString() string {
	return s.String()
}

func (s *UpdateWarehouseStoragelocationRequest) SetAuthToken(v string) *UpdateWarehouseStoragelocationRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateWarehouseStoragelocationRequest) SetProductInstanceId(v string) *UpdateWarehouseStoragelocationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateWarehouseStoragelocationRequest) SetExtraInfo(v string) *UpdateWarehouseStoragelocationRequest {
	s.ExtraInfo = &v
	return s
}

func (s *UpdateWarehouseStoragelocationRequest) SetId(v string) *UpdateWarehouseStoragelocationRequest {
	s.Id = &v
	return s
}

func (s *UpdateWarehouseStoragelocationRequest) SetProductType(v string) *UpdateWarehouseStoragelocationRequest {
	s.ProductType = &v
	return s
}

func (s *UpdateWarehouseStoragelocationRequest) SetStatus(v string) *UpdateWarehouseStoragelocationRequest {
	s.Status = &v
	return s
}

func (s *UpdateWarehouseStoragelocationRequest) SetStorageLocationArea(v string) *UpdateWarehouseStoragelocationRequest {
	s.StorageLocationArea = &v
	return s
}

func (s *UpdateWarehouseStoragelocationRequest) SetStorageLocationHeight(v string) *UpdateWarehouseStoragelocationRequest {
	s.StorageLocationHeight = &v
	return s
}

func (s *UpdateWarehouseStoragelocationRequest) SetType(v string) *UpdateWarehouseStoragelocationRequest {
	s.Type = &v
	return s
}

type UpdateWarehouseStoragelocationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 库位信息
	StorageLocation *StorageLocation `json:"storage_location,omitempty" xml:"storage_location,omitempty"`
}

func (s UpdateWarehouseStoragelocationResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateWarehouseStoragelocationResponse) GoString() string {
	return s.String()
}

func (s *UpdateWarehouseStoragelocationResponse) SetReqMsgId(v string) *UpdateWarehouseStoragelocationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateWarehouseStoragelocationResponse) SetResultCode(v string) *UpdateWarehouseStoragelocationResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateWarehouseStoragelocationResponse) SetResultMsg(v string) *UpdateWarehouseStoragelocationResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateWarehouseStoragelocationResponse) SetStorageLocation(v *StorageLocation) *UpdateWarehouseStoragelocationResponse {
	s.StorageLocation = v
	return s
}

type BatchqueryWarehouseStoragelocationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s BatchqueryWarehouseStoragelocationRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryWarehouseStoragelocationRequest) GoString() string {
	return s.String()
}

func (s *BatchqueryWarehouseStoragelocationRequest) SetAuthToken(v string) *BatchqueryWarehouseStoragelocationRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchqueryWarehouseStoragelocationRequest) SetProductInstanceId(v string) *BatchqueryWarehouseStoragelocationRequest {
	s.ProductInstanceId = &v
	return s
}

type BatchqueryWarehouseStoragelocationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 库位信息
	StorageLocationList []*StorageLocation `json:"storage_location_list,omitempty" xml:"storage_location_list,omitempty" type:"Repeated"`
}

func (s BatchqueryWarehouseStoragelocationResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryWarehouseStoragelocationResponse) GoString() string {
	return s.String()
}

func (s *BatchqueryWarehouseStoragelocationResponse) SetReqMsgId(v string) *BatchqueryWarehouseStoragelocationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchqueryWarehouseStoragelocationResponse) SetResultCode(v string) *BatchqueryWarehouseStoragelocationResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchqueryWarehouseStoragelocationResponse) SetResultMsg(v string) *BatchqueryWarehouseStoragelocationResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchqueryWarehouseStoragelocationResponse) SetStorageLocationList(v []*StorageLocation) *BatchqueryWarehouseStoragelocationResponse {
	s.StorageLocationList = v
	return s
}

type ListWarehouseStoragelocationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 库位状态【AVAILABLE：可用，IN_USE：使用中，IN_CONFIG：配置中，DELETED：已删除】
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 仓库id
	WarehouseId *string `json:"warehouse_id,omitempty" xml:"warehouse_id,omitempty" require:"true"`
}

func (s ListWarehouseStoragelocationRequest) String() string {
	return tea.Prettify(s)
}

func (s ListWarehouseStoragelocationRequest) GoString() string {
	return s.String()
}

func (s *ListWarehouseStoragelocationRequest) SetAuthToken(v string) *ListWarehouseStoragelocationRequest {
	s.AuthToken = &v
	return s
}

func (s *ListWarehouseStoragelocationRequest) SetProductInstanceId(v string) *ListWarehouseStoragelocationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListWarehouseStoragelocationRequest) SetCurrentPage(v int64) *ListWarehouseStoragelocationRequest {
	s.CurrentPage = &v
	return s
}

func (s *ListWarehouseStoragelocationRequest) SetPageSize(v int64) *ListWarehouseStoragelocationRequest {
	s.PageSize = &v
	return s
}

func (s *ListWarehouseStoragelocationRequest) SetStatus(v string) *ListWarehouseStoragelocationRequest {
	s.Status = &v
	return s
}

func (s *ListWarehouseStoragelocationRequest) SetWarehouseId(v string) *ListWarehouseStoragelocationRequest {
	s.WarehouseId = &v
	return s
}

type ListWarehouseStoragelocationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 库位信息
	StorageLocationList []*StorageLocation `json:"storage_location_list,omitempty" xml:"storage_location_list,omitempty" type:"Repeated"`
	// 总条目
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
}

func (s ListWarehouseStoragelocationResponse) String() string {
	return tea.Prettify(s)
}

func (s ListWarehouseStoragelocationResponse) GoString() string {
	return s.String()
}

func (s *ListWarehouseStoragelocationResponse) SetReqMsgId(v string) *ListWarehouseStoragelocationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListWarehouseStoragelocationResponse) SetResultCode(v string) *ListWarehouseStoragelocationResponse {
	s.ResultCode = &v
	return s
}

func (s *ListWarehouseStoragelocationResponse) SetResultMsg(v string) *ListWarehouseStoragelocationResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListWarehouseStoragelocationResponse) SetStorageLocationList(v []*StorageLocation) *ListWarehouseStoragelocationResponse {
	s.StorageLocationList = v
	return s
}

func (s *ListWarehouseStoragelocationResponse) SetTotalCount(v int64) *ListWarehouseStoragelocationResponse {
	s.TotalCount = &v
	return s
}

func (s *ListWarehouseStoragelocationResponse) SetTotalPage(v int64) *ListWarehouseStoragelocationResponse {
	s.TotalPage = &v
	return s
}

type DeleteWarehouseStoragelocationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 仓位id
	LocationId *string `json:"location_id,omitempty" xml:"location_id,omitempty" require:"true"`
	// 仓库id
	WarehouseId *string `json:"warehouse_id,omitempty" xml:"warehouse_id,omitempty" require:"true"`
}

func (s DeleteWarehouseStoragelocationRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteWarehouseStoragelocationRequest) GoString() string {
	return s.String()
}

func (s *DeleteWarehouseStoragelocationRequest) SetAuthToken(v string) *DeleteWarehouseStoragelocationRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteWarehouseStoragelocationRequest) SetProductInstanceId(v string) *DeleteWarehouseStoragelocationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteWarehouseStoragelocationRequest) SetLocationId(v string) *DeleteWarehouseStoragelocationRequest {
	s.LocationId = &v
	return s
}

func (s *DeleteWarehouseStoragelocationRequest) SetWarehouseId(v string) *DeleteWarehouseStoragelocationRequest {
	s.WarehouseId = &v
	return s
}

type DeleteWarehouseStoragelocationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteWarehouseStoragelocationResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteWarehouseStoragelocationResponse) GoString() string {
	return s.String()
}

func (s *DeleteWarehouseStoragelocationResponse) SetReqMsgId(v string) *DeleteWarehouseStoragelocationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteWarehouseStoragelocationResponse) SetResultCode(v string) *DeleteWarehouseStoragelocationResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteWarehouseStoragelocationResponse) SetResultMsg(v string) *DeleteWarehouseStoragelocationResponse {
	s.ResultMsg = &v
	return s
}

type CreateAssettemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 模板类型id
	CategoryId *string `json:"category_id,omitempty" xml:"category_id,omitempty" require:"true"`
	// 模板JSON内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 模板名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s CreateAssettemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAssettemplateRequest) GoString() string {
	return s.String()
}

func (s *CreateAssettemplateRequest) SetAuthToken(v string) *CreateAssettemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAssettemplateRequest) SetProductInstanceId(v string) *CreateAssettemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAssettemplateRequest) SetCategoryId(v string) *CreateAssettemplateRequest {
	s.CategoryId = &v
	return s
}

func (s *CreateAssettemplateRequest) SetContent(v string) *CreateAssettemplateRequest {
	s.Content = &v
	return s
}

func (s *CreateAssettemplateRequest) SetName(v string) *CreateAssettemplateRequest {
	s.Name = &v
	return s
}

type CreateAssettemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据字典id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty"`
}

func (s CreateAssettemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAssettemplateResponse) GoString() string {
	return s.String()
}

func (s *CreateAssettemplateResponse) SetReqMsgId(v string) *CreateAssettemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAssettemplateResponse) SetResultCode(v string) *CreateAssettemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAssettemplateResponse) SetResultMsg(v string) *CreateAssettemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAssettemplateResponse) SetTemplateId(v string) *CreateAssettemplateResponse {
	s.TemplateId = &v
	return s
}

type UpdateAssettemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 模板类型Id
	CategoryId *string `json:"category_id,omitempty" xml:"category_id,omitempty"`
	// 模板JSON内容
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 数据字典id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 名称
	TemplateName *string `json:"template_name,omitempty" xml:"template_name,omitempty"`
}

func (s UpdateAssettemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAssettemplateRequest) GoString() string {
	return s.String()
}

func (s *UpdateAssettemplateRequest) SetAuthToken(v string) *UpdateAssettemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAssettemplateRequest) SetProductInstanceId(v string) *UpdateAssettemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAssettemplateRequest) SetCategoryId(v string) *UpdateAssettemplateRequest {
	s.CategoryId = &v
	return s
}

func (s *UpdateAssettemplateRequest) SetContent(v string) *UpdateAssettemplateRequest {
	s.Content = &v
	return s
}

func (s *UpdateAssettemplateRequest) SetTemplateId(v string) *UpdateAssettemplateRequest {
	s.TemplateId = &v
	return s
}

func (s *UpdateAssettemplateRequest) SetTemplateName(v string) *UpdateAssettemplateRequest {
	s.TemplateName = &v
	return s
}

type UpdateAssettemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAssettemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAssettemplateResponse) GoString() string {
	return s.String()
}

func (s *UpdateAssettemplateResponse) SetReqMsgId(v string) *UpdateAssettemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAssettemplateResponse) SetResultCode(v string) *UpdateAssettemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAssettemplateResponse) SetResultMsg(v string) *UpdateAssettemplateResponse {
	s.ResultMsg = &v
	return s
}

type GetAssettemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据字典id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
}

func (s GetAssettemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAssettemplateRequest) GoString() string {
	return s.String()
}

func (s *GetAssettemplateRequest) SetAuthToken(v string) *GetAssettemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAssettemplateRequest) SetProductInstanceId(v string) *GetAssettemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAssettemplateRequest) SetTemplateId(v string) *GetAssettemplateRequest {
	s.TemplateId = &v
	return s
}

type GetAssettemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据字典信息
	TemplateInfo *AssetTemplate `json:"template_info,omitempty" xml:"template_info,omitempty"`
}

func (s GetAssettemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAssettemplateResponse) GoString() string {
	return s.String()
}

func (s *GetAssettemplateResponse) SetReqMsgId(v string) *GetAssettemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAssettemplateResponse) SetResultCode(v string) *GetAssettemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAssettemplateResponse) SetResultMsg(v string) *GetAssettemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAssettemplateResponse) SetTemplateInfo(v *AssetTemplate) *GetAssettemplateResponse {
	s.TemplateInfo = v
	return s
}

type ListAssettemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 模板状态【ALL：全部，INVALID：无效，VALID：有效】
	TemplateStatus *string `json:"template_status,omitempty" xml:"template_status,omitempty"`
}

func (s ListAssettemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAssettemplateRequest) GoString() string {
	return s.String()
}

func (s *ListAssettemplateRequest) SetAuthToken(v string) *ListAssettemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAssettemplateRequest) SetProductInstanceId(v string) *ListAssettemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListAssettemplateRequest) SetCurrentPage(v int64) *ListAssettemplateRequest {
	s.CurrentPage = &v
	return s
}

func (s *ListAssettemplateRequest) SetPageSize(v int64) *ListAssettemplateRequest {
	s.PageSize = &v
	return s
}

func (s *ListAssettemplateRequest) SetTemplateStatus(v string) *ListAssettemplateRequest {
	s.TemplateStatus = &v
	return s
}

type ListAssettemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据字典信息
	TemplateInfoList []*AssetTemplate `json:"template_info_list,omitempty" xml:"template_info_list,omitempty" type:"Repeated"`
	// 总条目
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
}

func (s ListAssettemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAssettemplateResponse) GoString() string {
	return s.String()
}

func (s *ListAssettemplateResponse) SetReqMsgId(v string) *ListAssettemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAssettemplateResponse) SetResultCode(v string) *ListAssettemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAssettemplateResponse) SetResultMsg(v string) *ListAssettemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAssettemplateResponse) SetTemplateInfoList(v []*AssetTemplate) *ListAssettemplateResponse {
	s.TemplateInfoList = v
	return s
}

func (s *ListAssettemplateResponse) SetTotalCount(v int64) *ListAssettemplateResponse {
	s.TotalCount = &v
	return s
}

func (s *ListAssettemplateResponse) SetTotalPage(v int64) *ListAssettemplateResponse {
	s.TotalPage = &v
	return s
}

type DeleteAssettemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 模板id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
}

func (s DeleteAssettemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteAssettemplateRequest) GoString() string {
	return s.String()
}

func (s *DeleteAssettemplateRequest) SetAuthToken(v string) *DeleteAssettemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteAssettemplateRequest) SetProductInstanceId(v string) *DeleteAssettemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteAssettemplateRequest) SetTemplateId(v string) *DeleteAssettemplateRequest {
	s.TemplateId = &v
	return s
}

type DeleteAssettemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteAssettemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteAssettemplateResponse) GoString() string {
	return s.String()
}

func (s *DeleteAssettemplateResponse) SetReqMsgId(v string) *DeleteAssettemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteAssettemplateResponse) SetResultCode(v string) *DeleteAssettemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteAssettemplateResponse) SetResultMsg(v string) *DeleteAssettemplateResponse {
	s.ResultMsg = &v
	return s
}

type EnableAssettemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 模板id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 是否生效
	Valid *bool `json:"valid,omitempty" xml:"valid,omitempty" require:"true"`
}

func (s EnableAssettemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s EnableAssettemplateRequest) GoString() string {
	return s.String()
}

func (s *EnableAssettemplateRequest) SetAuthToken(v string) *EnableAssettemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *EnableAssettemplateRequest) SetProductInstanceId(v string) *EnableAssettemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *EnableAssettemplateRequest) SetTemplateId(v string) *EnableAssettemplateRequest {
	s.TemplateId = &v
	return s
}

func (s *EnableAssettemplateRequest) SetValid(v bool) *EnableAssettemplateRequest {
	s.Valid = &v
	return s
}

type EnableAssettemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s EnableAssettemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s EnableAssettemplateResponse) GoString() string {
	return s.String()
}

func (s *EnableAssettemplateResponse) SetReqMsgId(v string) *EnableAssettemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *EnableAssettemplateResponse) SetResultCode(v string) *EnableAssettemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *EnableAssettemplateResponse) SetResultMsg(v string) *EnableAssettemplateResponse {
	s.ResultMsg = &v
	return s
}

type UpdateDocumentFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 原文件md5
	FileMd5 *string `json:"file_md5,omitempty" xml:"file_md5,omitempty" require:"true"`
	// 文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 原文件大小
	FileSize *int64 `json:"file_size,omitempty" xml:"file_size,omitempty" require:"true"`
	// 文件类型【CONTRACT 合同, NOTE 票据, DOCUMENT 文件, UNKNOWN 未知】
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// 原文件url
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty" require:"true"`
}

func (s UpdateDocumentFileRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateDocumentFileRequest) GoString() string {
	return s.String()
}

func (s *UpdateDocumentFileRequest) SetAuthToken(v string) *UpdateDocumentFileRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateDocumentFileRequest) SetProductInstanceId(v string) *UpdateDocumentFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateDocumentFileRequest) SetFileMd5(v string) *UpdateDocumentFileRequest {
	s.FileMd5 = &v
	return s
}

func (s *UpdateDocumentFileRequest) SetFileName(v string) *UpdateDocumentFileRequest {
	s.FileName = &v
	return s
}

func (s *UpdateDocumentFileRequest) SetFileSize(v int64) *UpdateDocumentFileRequest {
	s.FileSize = &v
	return s
}

func (s *UpdateDocumentFileRequest) SetFileType(v string) *UpdateDocumentFileRequest {
	s.FileType = &v
	return s
}

func (s *UpdateDocumentFileRequest) SetFileUrl(v string) *UpdateDocumentFileRequest {
	s.FileUrl = &v
	return s
}

type UpdateDocumentFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件信息
	DocumentInfo *DocumentInfo `json:"document_info,omitempty" xml:"document_info,omitempty"`
}

func (s UpdateDocumentFileResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateDocumentFileResponse) GoString() string {
	return s.String()
}

func (s *UpdateDocumentFileResponse) SetReqMsgId(v string) *UpdateDocumentFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateDocumentFileResponse) SetResultCode(v string) *UpdateDocumentFileResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateDocumentFileResponse) SetResultMsg(v string) *UpdateDocumentFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateDocumentFileResponse) SetDocumentInfo(v *DocumentInfo) *UpdateDocumentFileResponse {
	s.DocumentInfo = v
	return s
}

type GetDocumentFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件Id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s GetDocumentFileRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDocumentFileRequest) GoString() string {
	return s.String()
}

func (s *GetDocumentFileRequest) SetAuthToken(v string) *GetDocumentFileRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDocumentFileRequest) SetProductInstanceId(v string) *GetDocumentFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetDocumentFileRequest) SetFileId(v string) *GetDocumentFileRequest {
	s.FileId = &v
	return s
}

type GetDocumentFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文档Id
	DocumentId *string `json:"document_id,omitempty" xml:"document_id,omitempty"`
	// 类型【CONTRACT 合同, NOTE 票据, DOCUMENT 文件, UNKNOWN 未知】
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty"`
	// 文档名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 存证哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 存证时间
	TxTime *int64 `json:"tx_time,omitempty" xml:"tx_time,omitempty"`
	// 文件Url
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s GetDocumentFileResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDocumentFileResponse) GoString() string {
	return s.String()
}

func (s *GetDocumentFileResponse) SetReqMsgId(v string) *GetDocumentFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDocumentFileResponse) SetResultCode(v string) *GetDocumentFileResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDocumentFileResponse) SetResultMsg(v string) *GetDocumentFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDocumentFileResponse) SetDocumentId(v string) *GetDocumentFileResponse {
	s.DocumentId = &v
	return s
}

func (s *GetDocumentFileResponse) SetFileType(v string) *GetDocumentFileResponse {
	s.FileType = &v
	return s
}

func (s *GetDocumentFileResponse) SetName(v string) *GetDocumentFileResponse {
	s.Name = &v
	return s
}

func (s *GetDocumentFileResponse) SetTxHash(v string) *GetDocumentFileResponse {
	s.TxHash = &v
	return s
}

func (s *GetDocumentFileResponse) SetTxTime(v int64) *GetDocumentFileResponse {
	s.TxTime = &v
	return s
}

func (s *GetDocumentFileResponse) SetUrl(v string) *GetDocumentFileResponse {
	s.Url = &v
	return s
}

type CancelUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s CancelUserRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelUserRequest) GoString() string {
	return s.String()
}

func (s *CancelUserRequest) SetAuthToken(v string) *CancelUserRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelUserRequest) SetProductInstanceId(v string) *CancelUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelUserRequest) SetUserId(v string) *CancelUserRequest {
	s.UserId = &v
	return s
}

type CancelUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求时间
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
	// 请求ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s CancelUserResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelUserResponse) GoString() string {
	return s.String()
}

func (s *CancelUserResponse) SetReqMsgId(v string) *CancelUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelUserResponse) SetResultCode(v string) *CancelUserResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelUserResponse) SetResultMsg(v string) *CancelUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelUserResponse) SetDate(v int64) *CancelUserResponse {
	s.Date = &v
	return s
}

func (s *CancelUserResponse) SetRequestId(v string) *CancelUserResponse {
	s.RequestId = &v
	return s
}

type UpdateUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 11位的合法手机号
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty" require:"true"`
}

func (s UpdateUserRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateUserRequest) GoString() string {
	return s.String()
}

func (s *UpdateUserRequest) SetAuthToken(v string) *UpdateUserRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateUserRequest) SetProductInstanceId(v string) *UpdateUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateUserRequest) SetUserId(v string) *UpdateUserRequest {
	s.UserId = &v
	return s
}

func (s *UpdateUserRequest) SetPhone(v string) *UpdateUserRequest {
	s.Phone = &v
	return s
}

type UpdateUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求时间
	Date *int64 `json:"date,omitempty" xml:"date,omitempty"`
	// 请求ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s UpdateUserResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateUserResponse) GoString() string {
	return s.String()
}

func (s *UpdateUserResponse) SetReqMsgId(v string) *UpdateUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateUserResponse) SetResultCode(v string) *UpdateUserResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateUserResponse) SetResultMsg(v string) *UpdateUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateUserResponse) SetDate(v int64) *UpdateUserResponse {
	s.Date = &v
	return s
}

func (s *UpdateUserResponse) SetRequestId(v string) *UpdateUserResponse {
	s.RequestId = &v
	return s
}

type ListUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 手机号
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty" require:"true"`
}

func (s ListUserRequest) String() string {
	return tea.Prettify(s)
}

func (s ListUserRequest) GoString() string {
	return s.String()
}

func (s *ListUserRequest) SetAuthToken(v string) *ListUserRequest {
	s.AuthToken = &v
	return s
}

func (s *ListUserRequest) SetProductInstanceId(v string) *ListUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListUserRequest) SetPhone(v string) *ListUserRequest {
	s.Phone = &v
	return s
}

type ListUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户信息列表
	UserList []*ThirdPartyUser `json:"user_list,omitempty" xml:"user_list,omitempty" type:"Repeated"`
}

func (s ListUserResponse) String() string {
	return tea.Prettify(s)
}

func (s ListUserResponse) GoString() string {
	return s.String()
}

func (s *ListUserResponse) SetReqMsgId(v string) *ListUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListUserResponse) SetResultCode(v string) *ListUserResponse {
	s.ResultCode = &v
	return s
}

func (s *ListUserResponse) SetResultMsg(v string) *ListUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListUserResponse) SetUserList(v []*ThirdPartyUser) *ListUserResponse {
	s.UserList = v
	return s
}

type MountUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 物证平台用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 平台类别
	Platform *string `json:"platform,omitempty" xml:"platform,omitempty" require:"true"`
	// 外部平台id
	OpenId *string `json:"open_id,omitempty" xml:"open_id,omitempty" require:"true"`
}

func (s MountUserRequest) String() string {
	return tea.Prettify(s)
}

func (s MountUserRequest) GoString() string {
	return s.String()
}

func (s *MountUserRequest) SetAuthToken(v string) *MountUserRequest {
	s.AuthToken = &v
	return s
}

func (s *MountUserRequest) SetProductInstanceId(v string) *MountUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *MountUserRequest) SetUserId(v string) *MountUserRequest {
	s.UserId = &v
	return s
}

func (s *MountUserRequest) SetPlatform(v string) *MountUserRequest {
	s.Platform = &v
	return s
}

func (s *MountUserRequest) SetOpenId(v string) *MountUserRequest {
	s.OpenId = &v
	return s
}

type MountUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s MountUserResponse) String() string {
	return tea.Prettify(s)
}

func (s MountUserResponse) GoString() string {
	return s.String()
}

func (s *MountUserResponse) SetReqMsgId(v string) *MountUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *MountUserResponse) SetResultCode(v string) *MountUserResponse {
	s.ResultCode = &v
	return s
}

func (s *MountUserResponse) SetResultMsg(v string) *MountUserResponse {
	s.ResultMsg = &v
	return s
}

type BatchcreateImportassetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 物权信息列表
	Certificates []*CertificateInfo `json:"certificates,omitempty" xml:"certificates,omitempty" require:"true" type:"Repeated"`
}

func (s BatchcreateImportassetRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateImportassetRequest) GoString() string {
	return s.String()
}

func (s *BatchcreateImportassetRequest) SetAuthToken(v string) *BatchcreateImportassetRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchcreateImportassetRequest) SetProductInstanceId(v string) *BatchcreateImportassetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchcreateImportassetRequest) SetUserId(v string) *BatchcreateImportassetRequest {
	s.UserId = &v
	return s
}

func (s *BatchcreateImportassetRequest) SetCertificates(v []*CertificateInfo) *BatchcreateImportassetRequest {
	s.Certificates = v
	return s
}

type BatchcreateImportassetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 物证信息
	Evidences []*EvidenceInfo `json:"evidences,omitempty" xml:"evidences,omitempty" type:"Repeated"`
}

func (s BatchcreateImportassetResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateImportassetResponse) GoString() string {
	return s.String()
}

func (s *BatchcreateImportassetResponse) SetReqMsgId(v string) *BatchcreateImportassetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchcreateImportassetResponse) SetResultCode(v string) *BatchcreateImportassetResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchcreateImportassetResponse) SetResultMsg(v string) *BatchcreateImportassetResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchcreateImportassetResponse) SetEvidences(v []*EvidenceInfo) *BatchcreateImportassetResponse {
	s.Evidences = v
	return s
}

type DescribeImportassetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 物权凭证id
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 信息内容JSON格式
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s DescribeImportassetRequest) String() string {
	return tea.Prettify(s)
}

func (s DescribeImportassetRequest) GoString() string {
	return s.String()
}

func (s *DescribeImportassetRequest) SetAuthToken(v string) *DescribeImportassetRequest {
	s.AuthToken = &v
	return s
}

func (s *DescribeImportassetRequest) SetProductInstanceId(v string) *DescribeImportassetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DescribeImportassetRequest) SetAssetId(v string) *DescribeImportassetRequest {
	s.AssetId = &v
	return s
}

func (s *DescribeImportassetRequest) SetContent(v string) *DescribeImportassetRequest {
	s.Content = &v
	return s
}

func (s *DescribeImportassetRequest) SetUserId(v string) *DescribeImportassetRequest {
	s.UserId = &v
	return s
}

type DescribeImportassetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DescribeImportassetResponse) String() string {
	return tea.Prettify(s)
}

func (s DescribeImportassetResponse) GoString() string {
	return s.String()
}

func (s *DescribeImportassetResponse) SetReqMsgId(v string) *DescribeImportassetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DescribeImportassetResponse) SetResultCode(v string) *DescribeImportassetResponse {
	s.ResultCode = &v
	return s
}

func (s *DescribeImportassetResponse) SetResultMsg(v string) *DescribeImportassetResponse {
	s.ResultMsg = &v
	return s
}

type BatchfreezeImportassetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资产id列表
	AssetIdList []*string `json:"asset_id_list,omitempty" xml:"asset_id_list,omitempty" require:"true" type:"Repeated"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s BatchfreezeImportassetRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchfreezeImportassetRequest) GoString() string {
	return s.String()
}

func (s *BatchfreezeImportassetRequest) SetAuthToken(v string) *BatchfreezeImportassetRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchfreezeImportassetRequest) SetProductInstanceId(v string) *BatchfreezeImportassetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchfreezeImportassetRequest) SetAssetIdList(v []*string) *BatchfreezeImportassetRequest {
	s.AssetIdList = v
	return s
}

func (s *BatchfreezeImportassetRequest) SetUserId(v string) *BatchfreezeImportassetRequest {
	s.UserId = &v
	return s
}

type BatchfreezeImportassetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 批量操作返回信息
	ResultList []*AssetResult `json:"result_list,omitempty" xml:"result_list,omitempty" type:"Repeated"`
}

func (s BatchfreezeImportassetResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchfreezeImportassetResponse) GoString() string {
	return s.String()
}

func (s *BatchfreezeImportassetResponse) SetReqMsgId(v string) *BatchfreezeImportassetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchfreezeImportassetResponse) SetResultCode(v string) *BatchfreezeImportassetResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchfreezeImportassetResponse) SetResultMsg(v string) *BatchfreezeImportassetResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchfreezeImportassetResponse) SetResultList(v []*AssetResult) *BatchfreezeImportassetResponse {
	s.ResultList = v
	return s
}

type BatchunfreezeImportassetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 批量操作信息列表
	AssetIdList []*string `json:"asset_id_list,omitempty" xml:"asset_id_list,omitempty" require:"true" type:"Repeated"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s BatchunfreezeImportassetRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchunfreezeImportassetRequest) GoString() string {
	return s.String()
}

func (s *BatchunfreezeImportassetRequest) SetAuthToken(v string) *BatchunfreezeImportassetRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchunfreezeImportassetRequest) SetProductInstanceId(v string) *BatchunfreezeImportassetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchunfreezeImportassetRequest) SetAssetIdList(v []*string) *BatchunfreezeImportassetRequest {
	s.AssetIdList = v
	return s
}

func (s *BatchunfreezeImportassetRequest) SetUserId(v string) *BatchunfreezeImportassetRequest {
	s.UserId = &v
	return s
}

type BatchunfreezeImportassetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 批量返回信息列表
	ResultList []*AssetResult `json:"result_list,omitempty" xml:"result_list,omitempty" type:"Repeated"`
}

func (s BatchunfreezeImportassetResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchunfreezeImportassetResponse) GoString() string {
	return s.String()
}

func (s *BatchunfreezeImportassetResponse) SetReqMsgId(v string) *BatchunfreezeImportassetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchunfreezeImportassetResponse) SetResultCode(v string) *BatchunfreezeImportassetResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchunfreezeImportassetResponse) SetResultMsg(v string) *BatchunfreezeImportassetResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchunfreezeImportassetResponse) SetResultList(v []*AssetResult) *BatchunfreezeImportassetResponse {
	s.ResultList = v
	return s
}

type BatchcancelImportassetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资产id列表
	AssetIdList []*string `json:"asset_id_list,omitempty" xml:"asset_id_list,omitempty" require:"true" type:"Repeated"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s BatchcancelImportassetRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchcancelImportassetRequest) GoString() string {
	return s.String()
}

func (s *BatchcancelImportassetRequest) SetAuthToken(v string) *BatchcancelImportassetRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchcancelImportassetRequest) SetProductInstanceId(v string) *BatchcancelImportassetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchcancelImportassetRequest) SetAssetIdList(v []*string) *BatchcancelImportassetRequest {
	s.AssetIdList = v
	return s
}

func (s *BatchcancelImportassetRequest) SetUserId(v string) *BatchcancelImportassetRequest {
	s.UserId = &v
	return s
}

type BatchcancelImportassetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 批量返回信息列表
	ResultList []*AssetResult `json:"result_list,omitempty" xml:"result_list,omitempty" type:"Repeated"`
}

func (s BatchcancelImportassetResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchcancelImportassetResponse) GoString() string {
	return s.String()
}

func (s *BatchcancelImportassetResponse) SetReqMsgId(v string) *BatchcancelImportassetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchcancelImportassetResponse) SetResultCode(v string) *BatchcancelImportassetResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchcancelImportassetResponse) SetResultMsg(v string) *BatchcancelImportassetResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchcancelImportassetResponse) SetResultList(v []*AssetResult) *BatchcancelImportassetResponse {
	s.ResultList = v
	return s
}

type BatchcreateTransferRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资产id列表
	AssetIdList []*string `json:"asset_id_list,omitempty" xml:"asset_id_list,omitempty" require:"true" type:"Repeated"`
	// 接收人id
	Transferee *string `json:"transferee,omitempty" xml:"transferee,omitempty" require:"true"`
	// 转让金额
	MonetaryAmount *string `json:"monetary_amount,omitempty" xml:"monetary_amount,omitempty" require:"true"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s BatchcreateTransferRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateTransferRequest) GoString() string {
	return s.String()
}

func (s *BatchcreateTransferRequest) SetAuthToken(v string) *BatchcreateTransferRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchcreateTransferRequest) SetProductInstanceId(v string) *BatchcreateTransferRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchcreateTransferRequest) SetAssetIdList(v []*string) *BatchcreateTransferRequest {
	s.AssetIdList = v
	return s
}

func (s *BatchcreateTransferRequest) SetTransferee(v string) *BatchcreateTransferRequest {
	s.Transferee = &v
	return s
}

func (s *BatchcreateTransferRequest) SetMonetaryAmount(v string) *BatchcreateTransferRequest {
	s.MonetaryAmount = &v
	return s
}

func (s *BatchcreateTransferRequest) SetUserId(v string) *BatchcreateTransferRequest {
	s.UserId = &v
	return s
}

type BatchcreateTransferResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 批量操作返回信息列表
	ResultList []*AssetResult `json:"result_list,omitempty" xml:"result_list,omitempty" type:"Repeated"`
}

func (s BatchcreateTransferResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateTransferResponse) GoString() string {
	return s.String()
}

func (s *BatchcreateTransferResponse) SetReqMsgId(v string) *BatchcreateTransferResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchcreateTransferResponse) SetResultCode(v string) *BatchcreateTransferResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchcreateTransferResponse) SetResultMsg(v string) *BatchcreateTransferResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchcreateTransferResponse) SetResultList(v []*AssetResult) *BatchcreateTransferResponse {
	s.ResultList = v
	return s
}

type CreateCmportProfitrateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 产品编号
	ProductNo *string `json:"product_no,omitempty" xml:"product_no,omitempty" require:"true"`
	// 产品类型
	ProductType *string `json:"product_type,omitempty" xml:"product_type,omitempty" require:"true"`
	// 产品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true"`
	// 金融机构编号
	FinancialNo *string `json:"financial_no,omitempty" xml:"financial_no,omitempty" require:"true"`
	// 金融机构名称
	FinancialName *string `json:"financial_name,omitempty" xml:"financial_name,omitempty" require:"true"`
	// 各方分润比例
	// 对应角色编码类型：
	// 风险承担方：RISK_TAKER
	// 货物监管方：CARGO_SUPERVISION
	// 资金推荐方：CAPITAL_RECOMMEND
	// 融资推荐方：FUNDER_RECOMMEND
	// 运营管理方：MANAGEMENT
	// 技术支持方：TECHNICAL
	RoleRatio []*RoleRatio `json:"role_ratio,omitempty" xml:"role_ratio,omitempty" require:"true" type:"Repeated"`
}

func (s CreateCmportProfitrateRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateCmportProfitrateRequest) GoString() string {
	return s.String()
}

func (s *CreateCmportProfitrateRequest) SetAuthToken(v string) *CreateCmportProfitrateRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateCmportProfitrateRequest) SetProductInstanceId(v string) *CreateCmportProfitrateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateCmportProfitrateRequest) SetProductNo(v string) *CreateCmportProfitrateRequest {
	s.ProductNo = &v
	return s
}

func (s *CreateCmportProfitrateRequest) SetProductType(v string) *CreateCmportProfitrateRequest {
	s.ProductType = &v
	return s
}

func (s *CreateCmportProfitrateRequest) SetProductName(v string) *CreateCmportProfitrateRequest {
	s.ProductName = &v
	return s
}

func (s *CreateCmportProfitrateRequest) SetFinancialNo(v string) *CreateCmportProfitrateRequest {
	s.FinancialNo = &v
	return s
}

func (s *CreateCmportProfitrateRequest) SetFinancialName(v string) *CreateCmportProfitrateRequest {
	s.FinancialName = &v
	return s
}

func (s *CreateCmportProfitrateRequest) SetRoleRatio(v []*RoleRatio) *CreateCmportProfitrateRequest {
	s.RoleRatio = v
	return s
}

type CreateCmportProfitrateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateCmportProfitrateResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateCmportProfitrateResponse) GoString() string {
	return s.String()
}

func (s *CreateCmportProfitrateResponse) SetReqMsgId(v string) *CreateCmportProfitrateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateCmportProfitrateResponse) SetResultCode(v string) *CreateCmportProfitrateResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateCmportProfitrateResponse) SetResultMsg(v string) *CreateCmportProfitrateResponse {
	s.ResultMsg = &v
	return s
}

type ApplyCmportFinanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 来源方
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 融资编号（粮达生成）
	FinancialNo *string `json:"financial_no,omitempty" xml:"financial_no,omitempty" require:"true"`
	// 融资编号（粮达生成）
	MerchantFinancialNo *string `json:"merchant_financial_no,omitempty" xml:"merchant_financial_no,omitempty" require:"true"`
	// 交易编号（粮达生成）
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty" require:"true"`
	// 融资企业名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" require:"true"`
	// 融资企业编码
	CompanyCode *string `json:"company_code,omitempty" xml:"company_code,omitempty" require:"true"`
	// 统一信用代码
	UniCreditCode *string `json:"uni_credit_code,omitempty" xml:"uni_credit_code,omitempty" require:"true"`
	// 法人名称
	LegalPerson *string `json:"legal_person,omitempty" xml:"legal_person,omitempty" require:"true"`
	// 法人身份号码
	LegalPersonIdNo *string `json:"legal_person_id_no,omitempty" xml:"legal_person_id_no,omitempty" require:"true"`
	// 融资企业联系人
	CompanyContactPerson *string `json:"company_contact_person,omitempty" xml:"company_contact_person,omitempty" require:"true"`
	// 融资企业联系号码
	CompanyContactPhone *string `json:"company_contact_phone,omitempty" xml:"company_contact_phone,omitempty" require:"true"`
	// 企业办公地址
	CompanyAddr *string `json:"company_addr,omitempty" xml:"company_addr,omitempty" require:"true"`
	// 对手编号
	BuyerCode *string `json:"buyer_code,omitempty" xml:"buyer_code,omitempty" require:"true"`
	// 对手企业名称
	BuyerName *string `json:"buyer_name,omitempty" xml:"buyer_name,omitempty" require:"true"`
	// 对手统一信用代码
	BuyerUniCreditCode *string `json:"buyer_uni_credit_code,omitempty" xml:"buyer_uni_credit_code,omitempty" require:"true"`
	// 对手法人
	BuyerLegalPerson *string `json:"buyer_legal_person,omitempty" xml:"buyer_legal_person,omitempty"`
	// 对手法人身份证号码
	BuyerLegalPersonIdNo *string `json:"buyer_legal_person_id_no,omitempty" xml:"buyer_legal_person_id_no,omitempty"`
	// 对手联系人
	BuyerContactPerson *string `json:"buyer_contact_person,omitempty" xml:"buyer_contact_person,omitempty"`
	// 对手联系人手机
	BuyerContactPhone *string `json:"buyer_contact_phone,omitempty" xml:"buyer_contact_phone,omitempty"`
	// 融资标的（采购合同关联的货权编号: 多个编号，隔开）
	FinancingTarget *string `json:"financing_target,omitempty" xml:"financing_target,omitempty" require:"true"`
	// 融资金额（分）
	FinancialAmount *int64 `json:"financial_amount,omitempty" xml:"financial_amount,omitempty" require:"true"`
	// 融资周期（天）
	FinancialPeriod *int64 `json:"financial_period,omitempty" xml:"financial_period,omitempty" require:"true"`
	// 融资利率列表
	FinancialRateList []*FinancialRateInfo `json:"financial_rate_list,omitempty" xml:"financial_rate_list,omitempty" require:"true" type:"Repeated"`
	// 罚息利率列表
	PenaltyRateList []*PenaltyRateInfo `json:"penalty_rate_list,omitempty" xml:"penalty_rate_list,omitempty" require:"true" type:"Repeated"`
	// 操作费类型 1->标准收费; 2->阶梯收费
	OpeFeeType *int64 `json:"ope_fee_type,omitempty" xml:"ope_fee_type,omitempty" require:"true"`
	// 操作费单价列表
	OpeUnitPriceList []*OpeUnitPriceInfo `json:"ope_unit_price_list,omitempty" xml:"ope_unit_price_list,omitempty" require:"true" type:"Repeated"`
	// 货物品种
	CargoType *string `json:"cargo_type,omitempty" xml:"cargo_type,omitempty" require:"true"`
	// 货物吨数 (单位 t)
	CargoWeight *string `json:"cargo_weight,omitempty" xml:"cargo_weight,omitempty" require:"true"`
	// 货物单价（分）
	CargoUnitPrice *int64 `json:"cargo_unit_price,omitempty" xml:"cargo_unit_price,omitempty" require:"true"`
	// 货物单价类型
	CargoUnitPriceType *string `json:"cargo_unit_price_type,omitempty" xml:"cargo_unit_price_type,omitempty" require:"true"`
	// 货物总价
	CargoTotalPrice *int64 `json:"cargo_total_price,omitempty" xml:"cargo_total_price,omitempty" require:"true"`
	// 融资申请日期
	ApplyDate *string `json:"apply_date,omitempty" xml:"apply_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 产品编号
	ProductNo *string `json:"product_no,omitempty" xml:"product_no,omitempty" require:"true"`
	// 产品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true"`
	// 产品类别：1->买方保理;2->卖方保理;3->仓单融资
	ProductType *int64 `json:"product_type,omitempty" xml:"product_type,omitempty" require:"true"`
	// 确权方编码
	AuthenticRightCode *string `json:"authentic_right_code,omitempty" xml:"authentic_right_code,omitempty" require:"true"`
	// 确权方名称
	AuthenticRightName *string `json:"authentic_right_name,omitempty" xml:"authentic_right_name,omitempty" require:"true"`
	// 确权状态 1->已确权; 2->未确权。粮达网默认是 1
	AuthenticRightStatus *int64 `json:"authentic_right_status,omitempty" xml:"authentic_right_status,omitempty" require:"true"`
	// 确权时间
	AuthenticRightTime *string `json:"authentic_right_time,omitempty" xml:"authentic_right_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 仓储服务商/物流服务商
	StorageServiceProvider *string `json:"storage_service_provider,omitempty" xml:"storage_service_provider,omitempty" require:"true"`
	// 仓储地址/物流地址
	WarehouseAddr *string `json:"warehouse_addr,omitempty" xml:"warehouse_addr,omitempty" require:"true"`
	// 仓储联系方式/物流联系方式
	StorageContactPhone *string `json:"storage_contact_phone,omitempty" xml:"storage_contact_phone,omitempty" require:"true"`
	// 金融机构编码
	BankInstiCode *string `json:"bank_insti_code,omitempty" xml:"bank_insti_code,omitempty" require:"true"`
	// 金融机构名称
	BankInstiName *string `json:"bank_insti_name,omitempty" xml:"bank_insti_name,omitempty" require:"true"`
	// 是否缴纳保证金 1->缴纳;2->不缴纳
	IsPaySecurityDeposit *int64 `json:"is_pay_security_deposit,omitempty" xml:"is_pay_security_deposit,omitempty" require:"true"`
	// 保证金缴纳金额
	SecurityDepositAmount *int64 `json:"security_deposit_amount,omitempty" xml:"security_deposit_amount,omitempty" require:"true"`
	// 保证金缴纳比例
	SecurityDepositRate *string `json:"security_deposit_rate,omitempty" xml:"security_deposit_rate,omitempty" require:"true"`
	// 融资额度协议编号
	FinancingLimitAgreeNo *string `json:"financing_limit_agree_no,omitempty" xml:"financing_limit_agree_no,omitempty" require:"true"`
	// 电子章认证机构
	ElecCertInsti *string `json:"elec_cert_insti,omitempty" xml:"elec_cert_insti,omitempty" require:"true"`
	// 签署日期
	SignDate *string `json:"sign_date,omitempty" xml:"sign_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 保理协议编号
	FactoringAgreementNo *string `json:"factoring_agreement_no,omitempty" xml:"factoring_agreement_no,omitempty" require:"true"`
	// 卖方保理专户（回款账户）
	SellerFactoringAccount *string `json:"seller_factoring_account,omitempty" xml:"seller_factoring_account,omitempty" require:"true"`
	// 服务类型: 1->应收账款保理
	ServiceType *string `json:"service_type,omitempty" xml:"service_type,omitempty" require:"true"`
	// 业务类型: 1-> 买断循环后收息
	BusinessType *string `json:"business_type,omitempty" xml:"business_type,omitempty" require:"true"`
	// 费用收取方式: 1-> 融资时收取
	FeeCollectType *string `json:"fee_collect_type,omitempty" xml:"fee_collect_type,omitempty" require:"true"`
	// 利息收取方式: 1-> 预扣
	InterestCollectType *string `json:"interest_collect_type,omitempty" xml:"interest_collect_type,omitempty" require:"true"`
	// 电子凭证编号
	ElecCertNo *string `json:"elec_cert_no,omitempty" xml:"elec_cert_no,omitempty" require:"true"`
	// 电子凭证开立日
	ElecCertSetUpDate *string `json:"elec_cert_set_up_date,omitempty" xml:"elec_cert_set_up_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 电子凭证付款到期日
	ElecCertExpireDate *string `json:"elec_cert_expire_date,omitempty" xml:"elec_cert_expire_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 转让电子凭证金额
	ElecCertAmount *int64 `json:"elec_cert_amount,omitempty" xml:"elec_cert_amount,omitempty" require:"true"`
	// 交易合同发票编号
	TradeContractInvoNo *string `json:"trade_contract_invo_no,omitempty" xml:"trade_contract_invo_no,omitempty" require:"true"`
	// 交易合同发票金额
	TradeContractInvoAmount *int64 `json:"trade_contract_invo_amount,omitempty" xml:"trade_contract_invo_amount,omitempty" require:"true"`
	// 交易合同名称
	TradeContractName *string `json:"trade_contract_name,omitempty" xml:"trade_contract_name,omitempty" require:"true"`
	// 交易合同编号
	TradeContractNo *string `json:"trade_contract_no,omitempty" xml:"trade_contract_no,omitempty" require:"true"`
	// 交易合同买方名称
	TradeContractBuyerName *string `json:"trade_contract_buyer_name,omitempty" xml:"trade_contract_buyer_name,omitempty" require:"true"`
	// 磅单凭证（多个的话-分号分割）
	PoundProofs *string `json:"pound_proofs,omitempty" xml:"pound_proofs,omitempty"`
	// 入库凭证（多个的话-分号分割）
	StorageProofs *string `json:"storage_proofs,omitempty" xml:"storage_proofs,omitempty" require:"true"`
	// 借款合同（多个的话-分号分割）
	LoanContract *string `json:"loan_contract,omitempty" xml:"loan_contract,omitempty" require:"true"`
	// 采购合同（多个的话-分号分割）
	PurchaseContract *string `json:"purchase_contract,omitempty" xml:"purchase_contract,omitempty" require:"true"`
	// 销售合同（多个的话-分号分割）
	SellContract *string `json:"sell_contract,omitempty" xml:"sell_contract,omitempty" require:"true"`
	// 寄售合同（多个的话-分号分割）
	ConsignmentContract *string `json:"consignment_contract,omitempty" xml:"consignment_contract,omitempty"`
	// 融资方营业执照
	BussLicense *string `json:"buss_license,omitempty" xml:"buss_license,omitempty"`
	// 法人身份证（正）
	LegalPersonFront *string `json:"legal_person_front,omitempty" xml:"legal_person_front,omitempty"`
	// 法人身份证（反）
	LegalPersonReverse *string `json:"legal_person_reverse,omitempty" xml:"legal_person_reverse,omitempty"`
	// 银行侧融资利率
	BankFinancialRate *string `json:"bank_financial_rate,omitempty" xml:"bank_financial_rate,omitempty" require:"true"`
	// 银行侧罚息
	BankPenaltyRate *string `json:"bank_penalty_rate,omitempty" xml:"bank_penalty_rate,omitempty" require:"true"`
	// 融资状态:
	// 10->待确权;20->待审核;30->待签署;40->待放款;50->待还款;51->还款撤销;52->还款中;60->已还款;70->审核不通过;80->已融资撤销
	FinancialStatus *int64 `json:"financial_status,omitempty" xml:"financial_status,omitempty" require:"true"`
	// 撤销申请日期
	CancelApplyDate *string `json:"cancel_apply_date,omitempty" xml:"cancel_apply_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 撤销申请描述
	CancelApplyDesc *string `json:"cancel_apply_desc,omitempty" xml:"cancel_apply_desc,omitempty"`
	// 审核人
	Auditor *string `json:"auditor,omitempty" xml:"auditor,omitempty"`
	// 审核时间
	AuditDate *string `json:"audit_date,omitempty" xml:"audit_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 审核评论
	AuditComment *string `json:"audit_comment,omitempty" xml:"audit_comment,omitempty"`
	// 确认放款日期
	ConfirmLoanDate *string `json:"confirm_loan_date,omitempty" xml:"confirm_loan_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 确认放款评论
	ConfirmLoanComment *string `json:"confirm_loan_comment,omitempty" xml:"confirm_loan_comment,omitempty"`
	// 流程标记：
	// 1->流程通过;2->流程打回到上一级;3->直接拒绝
	ConfirmLoanFlag *int64 `json:"confirm_loan_flag,omitempty" xml:"confirm_loan_flag,omitempty"`
	// Date
	ContractSignTime *string `json:"contract_sign_time,omitempty" xml:"contract_sign_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 待签署评论
	ContractSignComment *string `json:"contract_sign_comment,omitempty" xml:"contract_sign_comment,omitempty"`
	// 流程标记：
	// 1->流程通过;2->流程打回到上一级;3->直接拒绝
	ContractSignFlag *int64 `json:"contract_sign_flag,omitempty" xml:"contract_sign_flag,omitempty"`
	// 上链账户
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty" require:"true"`
	// 联盟id
	UnionId *int64 `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// Channel 名称
	ChannelName *string `json:"channel_name,omitempty" xml:"channel_name,omitempty" require:"true"`
}

func (s ApplyCmportFinanceRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyCmportFinanceRequest) GoString() string {
	return s.String()
}

func (s *ApplyCmportFinanceRequest) SetAuthToken(v string) *ApplyCmportFinanceRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetProductInstanceId(v string) *ApplyCmportFinanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetSource(v string) *ApplyCmportFinanceRequest {
	s.Source = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetFinancialNo(v string) *ApplyCmportFinanceRequest {
	s.FinancialNo = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetMerchantFinancialNo(v string) *ApplyCmportFinanceRequest {
	s.MerchantFinancialNo = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetTradeNo(v string) *ApplyCmportFinanceRequest {
	s.TradeNo = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetCompanyName(v string) *ApplyCmportFinanceRequest {
	s.CompanyName = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetCompanyCode(v string) *ApplyCmportFinanceRequest {
	s.CompanyCode = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetUniCreditCode(v string) *ApplyCmportFinanceRequest {
	s.UniCreditCode = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetLegalPerson(v string) *ApplyCmportFinanceRequest {
	s.LegalPerson = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetLegalPersonIdNo(v string) *ApplyCmportFinanceRequest {
	s.LegalPersonIdNo = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetCompanyContactPerson(v string) *ApplyCmportFinanceRequest {
	s.CompanyContactPerson = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetCompanyContactPhone(v string) *ApplyCmportFinanceRequest {
	s.CompanyContactPhone = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetCompanyAddr(v string) *ApplyCmportFinanceRequest {
	s.CompanyAddr = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetBuyerCode(v string) *ApplyCmportFinanceRequest {
	s.BuyerCode = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetBuyerName(v string) *ApplyCmportFinanceRequest {
	s.BuyerName = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetBuyerUniCreditCode(v string) *ApplyCmportFinanceRequest {
	s.BuyerUniCreditCode = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetBuyerLegalPerson(v string) *ApplyCmportFinanceRequest {
	s.BuyerLegalPerson = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetBuyerLegalPersonIdNo(v string) *ApplyCmportFinanceRequest {
	s.BuyerLegalPersonIdNo = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetBuyerContactPerson(v string) *ApplyCmportFinanceRequest {
	s.BuyerContactPerson = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetBuyerContactPhone(v string) *ApplyCmportFinanceRequest {
	s.BuyerContactPhone = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetFinancingTarget(v string) *ApplyCmportFinanceRequest {
	s.FinancingTarget = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetFinancialAmount(v int64) *ApplyCmportFinanceRequest {
	s.FinancialAmount = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetFinancialPeriod(v int64) *ApplyCmportFinanceRequest {
	s.FinancialPeriod = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetFinancialRateList(v []*FinancialRateInfo) *ApplyCmportFinanceRequest {
	s.FinancialRateList = v
	return s
}

func (s *ApplyCmportFinanceRequest) SetPenaltyRateList(v []*PenaltyRateInfo) *ApplyCmportFinanceRequest {
	s.PenaltyRateList = v
	return s
}

func (s *ApplyCmportFinanceRequest) SetOpeFeeType(v int64) *ApplyCmportFinanceRequest {
	s.OpeFeeType = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetOpeUnitPriceList(v []*OpeUnitPriceInfo) *ApplyCmportFinanceRequest {
	s.OpeUnitPriceList = v
	return s
}

func (s *ApplyCmportFinanceRequest) SetCargoType(v string) *ApplyCmportFinanceRequest {
	s.CargoType = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetCargoWeight(v string) *ApplyCmportFinanceRequest {
	s.CargoWeight = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetCargoUnitPrice(v int64) *ApplyCmportFinanceRequest {
	s.CargoUnitPrice = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetCargoUnitPriceType(v string) *ApplyCmportFinanceRequest {
	s.CargoUnitPriceType = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetCargoTotalPrice(v int64) *ApplyCmportFinanceRequest {
	s.CargoTotalPrice = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetApplyDate(v string) *ApplyCmportFinanceRequest {
	s.ApplyDate = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetProductNo(v string) *ApplyCmportFinanceRequest {
	s.ProductNo = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetProductName(v string) *ApplyCmportFinanceRequest {
	s.ProductName = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetProductType(v int64) *ApplyCmportFinanceRequest {
	s.ProductType = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetAuthenticRightCode(v string) *ApplyCmportFinanceRequest {
	s.AuthenticRightCode = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetAuthenticRightName(v string) *ApplyCmportFinanceRequest {
	s.AuthenticRightName = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetAuthenticRightStatus(v int64) *ApplyCmportFinanceRequest {
	s.AuthenticRightStatus = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetAuthenticRightTime(v string) *ApplyCmportFinanceRequest {
	s.AuthenticRightTime = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetStorageServiceProvider(v string) *ApplyCmportFinanceRequest {
	s.StorageServiceProvider = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetWarehouseAddr(v string) *ApplyCmportFinanceRequest {
	s.WarehouseAddr = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetStorageContactPhone(v string) *ApplyCmportFinanceRequest {
	s.StorageContactPhone = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetBankInstiCode(v string) *ApplyCmportFinanceRequest {
	s.BankInstiCode = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetBankInstiName(v string) *ApplyCmportFinanceRequest {
	s.BankInstiName = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetIsPaySecurityDeposit(v int64) *ApplyCmportFinanceRequest {
	s.IsPaySecurityDeposit = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetSecurityDepositAmount(v int64) *ApplyCmportFinanceRequest {
	s.SecurityDepositAmount = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetSecurityDepositRate(v string) *ApplyCmportFinanceRequest {
	s.SecurityDepositRate = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetFinancingLimitAgreeNo(v string) *ApplyCmportFinanceRequest {
	s.FinancingLimitAgreeNo = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetElecCertInsti(v string) *ApplyCmportFinanceRequest {
	s.ElecCertInsti = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetSignDate(v string) *ApplyCmportFinanceRequest {
	s.SignDate = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetFactoringAgreementNo(v string) *ApplyCmportFinanceRequest {
	s.FactoringAgreementNo = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetSellerFactoringAccount(v string) *ApplyCmportFinanceRequest {
	s.SellerFactoringAccount = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetServiceType(v string) *ApplyCmportFinanceRequest {
	s.ServiceType = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetBusinessType(v string) *ApplyCmportFinanceRequest {
	s.BusinessType = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetFeeCollectType(v string) *ApplyCmportFinanceRequest {
	s.FeeCollectType = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetInterestCollectType(v string) *ApplyCmportFinanceRequest {
	s.InterestCollectType = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetElecCertNo(v string) *ApplyCmportFinanceRequest {
	s.ElecCertNo = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetElecCertSetUpDate(v string) *ApplyCmportFinanceRequest {
	s.ElecCertSetUpDate = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetElecCertExpireDate(v string) *ApplyCmportFinanceRequest {
	s.ElecCertExpireDate = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetElecCertAmount(v int64) *ApplyCmportFinanceRequest {
	s.ElecCertAmount = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetTradeContractInvoNo(v string) *ApplyCmportFinanceRequest {
	s.TradeContractInvoNo = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetTradeContractInvoAmount(v int64) *ApplyCmportFinanceRequest {
	s.TradeContractInvoAmount = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetTradeContractName(v string) *ApplyCmportFinanceRequest {
	s.TradeContractName = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetTradeContractNo(v string) *ApplyCmportFinanceRequest {
	s.TradeContractNo = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetTradeContractBuyerName(v string) *ApplyCmportFinanceRequest {
	s.TradeContractBuyerName = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetPoundProofs(v string) *ApplyCmportFinanceRequest {
	s.PoundProofs = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetStorageProofs(v string) *ApplyCmportFinanceRequest {
	s.StorageProofs = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetLoanContract(v string) *ApplyCmportFinanceRequest {
	s.LoanContract = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetPurchaseContract(v string) *ApplyCmportFinanceRequest {
	s.PurchaseContract = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetSellContract(v string) *ApplyCmportFinanceRequest {
	s.SellContract = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetConsignmentContract(v string) *ApplyCmportFinanceRequest {
	s.ConsignmentContract = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetBussLicense(v string) *ApplyCmportFinanceRequest {
	s.BussLicense = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetLegalPersonFront(v string) *ApplyCmportFinanceRequest {
	s.LegalPersonFront = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetLegalPersonReverse(v string) *ApplyCmportFinanceRequest {
	s.LegalPersonReverse = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetBankFinancialRate(v string) *ApplyCmportFinanceRequest {
	s.BankFinancialRate = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetBankPenaltyRate(v string) *ApplyCmportFinanceRequest {
	s.BankPenaltyRate = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetFinancialStatus(v int64) *ApplyCmportFinanceRequest {
	s.FinancialStatus = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetCancelApplyDate(v string) *ApplyCmportFinanceRequest {
	s.CancelApplyDate = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetCancelApplyDesc(v string) *ApplyCmportFinanceRequest {
	s.CancelApplyDesc = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetAuditor(v string) *ApplyCmportFinanceRequest {
	s.Auditor = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetAuditDate(v string) *ApplyCmportFinanceRequest {
	s.AuditDate = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetAuditComment(v string) *ApplyCmportFinanceRequest {
	s.AuditComment = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetConfirmLoanDate(v string) *ApplyCmportFinanceRequest {
	s.ConfirmLoanDate = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetConfirmLoanComment(v string) *ApplyCmportFinanceRequest {
	s.ConfirmLoanComment = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetConfirmLoanFlag(v int64) *ApplyCmportFinanceRequest {
	s.ConfirmLoanFlag = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetContractSignTime(v string) *ApplyCmportFinanceRequest {
	s.ContractSignTime = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetContractSignComment(v string) *ApplyCmportFinanceRequest {
	s.ContractSignComment = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetContractSignFlag(v int64) *ApplyCmportFinanceRequest {
	s.ContractSignFlag = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetUserDid(v string) *ApplyCmportFinanceRequest {
	s.UserDid = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetUnionId(v int64) *ApplyCmportFinanceRequest {
	s.UnionId = &v
	return s
}

func (s *ApplyCmportFinanceRequest) SetChannelName(v string) *ApplyCmportFinanceRequest {
	s.ChannelName = &v
	return s
}

type ApplyCmportFinanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ApplyCmportFinanceResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyCmportFinanceResponse) GoString() string {
	return s.String()
}

func (s *ApplyCmportFinanceResponse) SetReqMsgId(v string) *ApplyCmportFinanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyCmportFinanceResponse) SetResultCode(v string) *ApplyCmportFinanceResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyCmportFinanceResponse) SetResultMsg(v string) *ApplyCmportFinanceResponse {
	s.ResultMsg = &v
	return s
}

type ListCmportEnterprisestatementRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// accountingDate
	AccountDate *string `json:"account_date,omitempty" xml:"account_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 页码，从1开始
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 页大小，最大100
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s ListCmportEnterprisestatementRequest) String() string {
	return tea.Prettify(s)
}

func (s ListCmportEnterprisestatementRequest) GoString() string {
	return s.String()
}

func (s *ListCmportEnterprisestatementRequest) SetAuthToken(v string) *ListCmportEnterprisestatementRequest {
	s.AuthToken = &v
	return s
}

func (s *ListCmportEnterprisestatementRequest) SetProductInstanceId(v string) *ListCmportEnterprisestatementRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListCmportEnterprisestatementRequest) SetAccountDate(v string) *ListCmportEnterprisestatementRequest {
	s.AccountDate = &v
	return s
}

func (s *ListCmportEnterprisestatementRequest) SetPageNum(v int64) *ListCmportEnterprisestatementRequest {
	s.PageNum = &v
	return s
}

func (s *ListCmportEnterprisestatementRequest) SetPageSize(v int64) *ListCmportEnterprisestatementRequest {
	s.PageSize = &v
	return s
}

type ListCmportEnterprisestatementResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
	// 总对账单
	TotalStatementList []*TotalStatement `json:"total_statement_list,omitempty" xml:"total_statement_list,omitempty" type:"Repeated"`
}

func (s ListCmportEnterprisestatementResponse) String() string {
	return tea.Prettify(s)
}

func (s ListCmportEnterprisestatementResponse) GoString() string {
	return s.String()
}

func (s *ListCmportEnterprisestatementResponse) SetReqMsgId(v string) *ListCmportEnterprisestatementResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListCmportEnterprisestatementResponse) SetResultCode(v string) *ListCmportEnterprisestatementResponse {
	s.ResultCode = &v
	return s
}

func (s *ListCmportEnterprisestatementResponse) SetResultMsg(v string) *ListCmportEnterprisestatementResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListCmportEnterprisestatementResponse) SetPageNum(v int64) *ListCmportEnterprisestatementResponse {
	s.PageNum = &v
	return s
}

func (s *ListCmportEnterprisestatementResponse) SetPageSize(v int64) *ListCmportEnterprisestatementResponse {
	s.PageSize = &v
	return s
}

func (s *ListCmportEnterprisestatementResponse) SetTotalPage(v int64) *ListCmportEnterprisestatementResponse {
	s.TotalPage = &v
	return s
}

func (s *ListCmportEnterprisestatementResponse) SetTotalStatementList(v []*TotalStatement) *ListCmportEnterprisestatementResponse {
	s.TotalStatementList = v
	return s
}

type ListCmportUserstatementRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 记账日期   yyyy-mm-dd
	AccountingDate *string `json:"accounting_date,omitempty" xml:"accounting_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s ListCmportUserstatementRequest) String() string {
	return tea.Prettify(s)
}

func (s ListCmportUserstatementRequest) GoString() string {
	return s.String()
}

func (s *ListCmportUserstatementRequest) SetAuthToken(v string) *ListCmportUserstatementRequest {
	s.AuthToken = &v
	return s
}

func (s *ListCmportUserstatementRequest) SetProductInstanceId(v string) *ListCmportUserstatementRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListCmportUserstatementRequest) SetPageNum(v int64) *ListCmportUserstatementRequest {
	s.PageNum = &v
	return s
}

func (s *ListCmportUserstatementRequest) SetPageSize(v int64) *ListCmportUserstatementRequest {
	s.PageSize = &v
	return s
}

func (s *ListCmportUserstatementRequest) SetAccountingDate(v string) *ListCmportUserstatementRequest {
	s.AccountingDate = &v
	return s
}

type ListCmportUserstatementResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
	// 用户对账单
	UserStatementList []*UserStatement `json:"user_statement_list,omitempty" xml:"user_statement_list,omitempty" type:"Repeated"`
}

func (s ListCmportUserstatementResponse) String() string {
	return tea.Prettify(s)
}

func (s ListCmportUserstatementResponse) GoString() string {
	return s.String()
}

func (s *ListCmportUserstatementResponse) SetReqMsgId(v string) *ListCmportUserstatementResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListCmportUserstatementResponse) SetResultCode(v string) *ListCmportUserstatementResponse {
	s.ResultCode = &v
	return s
}

func (s *ListCmportUserstatementResponse) SetResultMsg(v string) *ListCmportUserstatementResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListCmportUserstatementResponse) SetPageNum(v int64) *ListCmportUserstatementResponse {
	s.PageNum = &v
	return s
}

func (s *ListCmportUserstatementResponse) SetPageSize(v int64) *ListCmportUserstatementResponse {
	s.PageSize = &v
	return s
}

func (s *ListCmportUserstatementResponse) SetTotalPage(v int64) *ListCmportUserstatementResponse {
	s.TotalPage = &v
	return s
}

func (s *ListCmportUserstatementResponse) SetUserStatementList(v []*UserStatement) *ListCmportUserstatementResponse {
	s.UserStatementList = v
	return s
}

type ListCmportUserprofitRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 记账日期 yyyy-mm-dd
	AccountingDate *string `json:"accounting_date,omitempty" xml:"accounting_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s ListCmportUserprofitRequest) String() string {
	return tea.Prettify(s)
}

func (s ListCmportUserprofitRequest) GoString() string {
	return s.String()
}

func (s *ListCmportUserprofitRequest) SetAuthToken(v string) *ListCmportUserprofitRequest {
	s.AuthToken = &v
	return s
}

func (s *ListCmportUserprofitRequest) SetProductInstanceId(v string) *ListCmportUserprofitRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListCmportUserprofitRequest) SetPageNum(v int64) *ListCmportUserprofitRequest {
	s.PageNum = &v
	return s
}

func (s *ListCmportUserprofitRequest) SetPageSize(v int64) *ListCmportUserprofitRequest {
	s.PageSize = &v
	return s
}

func (s *ListCmportUserprofitRequest) SetAccountingDate(v string) *ListCmportUserprofitRequest {
	s.AccountingDate = &v
	return s
}

type ListCmportUserprofitResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
	// 用户明细清单
	UserBillList []*UserDetail `json:"user_bill_list,omitempty" xml:"user_bill_list,omitempty" type:"Repeated"`
}

func (s ListCmportUserprofitResponse) String() string {
	return tea.Prettify(s)
}

func (s ListCmportUserprofitResponse) GoString() string {
	return s.String()
}

func (s *ListCmportUserprofitResponse) SetReqMsgId(v string) *ListCmportUserprofitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListCmportUserprofitResponse) SetResultCode(v string) *ListCmportUserprofitResponse {
	s.ResultCode = &v
	return s
}

func (s *ListCmportUserprofitResponse) SetResultMsg(v string) *ListCmportUserprofitResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListCmportUserprofitResponse) SetPageNum(v int64) *ListCmportUserprofitResponse {
	s.PageNum = &v
	return s
}

func (s *ListCmportUserprofitResponse) SetPageSize(v int64) *ListCmportUserprofitResponse {
	s.PageSize = &v
	return s
}

func (s *ListCmportUserprofitResponse) SetTotalPage(v int64) *ListCmportUserprofitResponse {
	s.TotalPage = &v
	return s
}

func (s *ListCmportUserprofitResponse) SetUserBillList(v []*UserDetail) *ListCmportUserprofitResponse {
	s.UserBillList = v
	return s
}

type QueryCmportBankfeeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 融资编号
	FinancialNo *string `json:"financial_no,omitempty" xml:"financial_no,omitempty" require:"true"`
	// 记账日期 yyyy-mm-dd
	AccountDate *string `json:"account_date,omitempty" xml:"account_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s QueryCmportBankfeeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCmportBankfeeRequest) GoString() string {
	return s.String()
}

func (s *QueryCmportBankfeeRequest) SetAuthToken(v string) *QueryCmportBankfeeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCmportBankfeeRequest) SetProductInstanceId(v string) *QueryCmportBankfeeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCmportBankfeeRequest) SetFinancialNo(v string) *QueryCmportBankfeeRequest {
	s.FinancialNo = &v
	return s
}

func (s *QueryCmportBankfeeRequest) SetAccountDate(v string) *QueryCmportBankfeeRequest {
	s.AccountDate = &v
	return s
}

type QueryCmportBankfeeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 应付银行本金
	CapitalAmount *int64 `json:"capital_amount,omitempty" xml:"capital_amount,omitempty"`
	// 应付银行利息
	InterestAmount *int64 `json:"interest_amount,omitempty" xml:"interest_amount,omitempty"`
	// 应付总金额
	TotalAmount *int64 `json:"total_amount,omitempty" xml:"total_amount,omitempty"`
}

func (s QueryCmportBankfeeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCmportBankfeeResponse) GoString() string {
	return s.String()
}

func (s *QueryCmportBankfeeResponse) SetReqMsgId(v string) *QueryCmportBankfeeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCmportBankfeeResponse) SetResultCode(v string) *QueryCmportBankfeeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCmportBankfeeResponse) SetResultMsg(v string) *QueryCmportBankfeeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCmportBankfeeResponse) SetCapitalAmount(v int64) *QueryCmportBankfeeResponse {
	s.CapitalAmount = &v
	return s
}

func (s *QueryCmportBankfeeResponse) SetInterestAmount(v int64) *QueryCmportBankfeeResponse {
	s.InterestAmount = &v
	return s
}

func (s *QueryCmportBankfeeResponse) SetTotalAmount(v int64) *QueryCmportBankfeeResponse {
	s.TotalAmount = &v
	return s
}

type CreateCmportProfitpartnerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业编号
	CompanyNo *string `json:"company_no,omitempty" xml:"company_no,omitempty" require:"true"`
	// 企业名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" require:"true"`
	// 组织类别
	OrganizationCategory *string `json:"organization_category,omitempty" xml:"organization_category,omitempty" require:"true"`
	// 角色编号对应组织信息
	// 组织对应角色编码：
	// 风险承担方：RISK_TAKER
	// 货物监管方：CARGO_SUPERVISION
	// 资金推荐方：CAPITAL_RECOMMEND
	// 融资推荐方：FUNDER_RECOMMEND
	// 运营管理方：MANAGEMENT
	// 技术支持方：TECHNICAL
	RoleOrganizationList []*RoleOrganization `json:"role_organization_list,omitempty" xml:"role_organization_list,omitempty" require:"true" type:"Repeated"`
}

func (s CreateCmportProfitpartnerRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateCmportProfitpartnerRequest) GoString() string {
	return s.String()
}

func (s *CreateCmportProfitpartnerRequest) SetAuthToken(v string) *CreateCmportProfitpartnerRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateCmportProfitpartnerRequest) SetProductInstanceId(v string) *CreateCmportProfitpartnerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateCmportProfitpartnerRequest) SetCompanyNo(v string) *CreateCmportProfitpartnerRequest {
	s.CompanyNo = &v
	return s
}

func (s *CreateCmportProfitpartnerRequest) SetCompanyName(v string) *CreateCmportProfitpartnerRequest {
	s.CompanyName = &v
	return s
}

func (s *CreateCmportProfitpartnerRequest) SetOrganizationCategory(v string) *CreateCmportProfitpartnerRequest {
	s.OrganizationCategory = &v
	return s
}

func (s *CreateCmportProfitpartnerRequest) SetRoleOrganizationList(v []*RoleOrganization) *CreateCmportProfitpartnerRequest {
	s.RoleOrganizationList = v
	return s
}

type CreateCmportProfitpartnerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateCmportProfitpartnerResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateCmportProfitpartnerResponse) GoString() string {
	return s.String()
}

func (s *CreateCmportProfitpartnerResponse) SetReqMsgId(v string) *CreateCmportProfitpartnerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateCmportProfitpartnerResponse) SetResultCode(v string) *CreateCmportProfitpartnerResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateCmportProfitpartnerResponse) SetResultMsg(v string) *CreateCmportProfitpartnerResponse {
	s.ResultMsg = &v
	return s
}

type CancelCmportFinanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 平台融资编号
	FinancialNo *string `json:"financial_no,omitempty" xml:"financial_no,omitempty" require:"true"`
	// 融资企业编码
	CompanyCode *string `json:"company_code,omitempty" xml:"company_code,omitempty" require:"true"`
	// 融资企业名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" require:"true"`
	// 撤销申请日期
	CancelApplyDate *string `json:"cancel_apply_date,omitempty" xml:"cancel_apply_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 撤销申请描述
	CancelApplyDesc *string `json:"cancel_apply_desc,omitempty" xml:"cancel_apply_desc,omitempty" require:"true"`
	//  融资状态:
	// 10->待确权;20->待审核;30->待签署;40->待放款;50->待还款;51->还款撤销;52->还款中;60->已还款;70->审核不通过;80->已融资撤销
	FinancialStatus *int64 `json:"financial_status,omitempty" xml:"financial_status,omitempty" require:"true"`
	// 上链账户
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty" require:"true"`
	// 联盟id
	UnionId *int64 `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// Channel 名称
	ChannelName *string `json:"channel_name,omitempty" xml:"channel_name,omitempty" require:"true"`
}

func (s CancelCmportFinanceRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelCmportFinanceRequest) GoString() string {
	return s.String()
}

func (s *CancelCmportFinanceRequest) SetAuthToken(v string) *CancelCmportFinanceRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelCmportFinanceRequest) SetProductInstanceId(v string) *CancelCmportFinanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelCmportFinanceRequest) SetFinancialNo(v string) *CancelCmportFinanceRequest {
	s.FinancialNo = &v
	return s
}

func (s *CancelCmportFinanceRequest) SetCompanyCode(v string) *CancelCmportFinanceRequest {
	s.CompanyCode = &v
	return s
}

func (s *CancelCmportFinanceRequest) SetCompanyName(v string) *CancelCmportFinanceRequest {
	s.CompanyName = &v
	return s
}

func (s *CancelCmportFinanceRequest) SetCancelApplyDate(v string) *CancelCmportFinanceRequest {
	s.CancelApplyDate = &v
	return s
}

func (s *CancelCmportFinanceRequest) SetCancelApplyDesc(v string) *CancelCmportFinanceRequest {
	s.CancelApplyDesc = &v
	return s
}

func (s *CancelCmportFinanceRequest) SetFinancialStatus(v int64) *CancelCmportFinanceRequest {
	s.FinancialStatus = &v
	return s
}

func (s *CancelCmportFinanceRequest) SetUserDid(v string) *CancelCmportFinanceRequest {
	s.UserDid = &v
	return s
}

func (s *CancelCmportFinanceRequest) SetUnionId(v int64) *CancelCmportFinanceRequest {
	s.UnionId = &v
	return s
}

func (s *CancelCmportFinanceRequest) SetChannelName(v string) *CancelCmportFinanceRequest {
	s.ChannelName = &v
	return s
}

type CancelCmportFinanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CancelCmportFinanceResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelCmportFinanceResponse) GoString() string {
	return s.String()
}

func (s *CancelCmportFinanceResponse) SetReqMsgId(v string) *CancelCmportFinanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelCmportFinanceResponse) SetResultCode(v string) *CancelCmportFinanceResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelCmportFinanceResponse) SetResultMsg(v string) *CancelCmportFinanceResponse {
	s.ResultMsg = &v
	return s
}

type NotifyCmportBankRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 平台融资编号
	FinancialNo *string `json:"financial_no,omitempty" xml:"financial_no,omitempty" require:"true"`
	// 审核人
	Auditor *string `json:"auditor,omitempty" xml:"auditor,omitempty" require:"true"`
	// 审核时间
	AuditDate *string `json:"audit_date,omitempty" xml:"audit_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 审核评论
	AuditComment *string `json:"audit_comment,omitempty" xml:"audit_comment,omitempty" require:"true"`
	// 融资状态:
	// 10->待确权;20->待审核;30->待签署;40->待放款;50->待还款;51->还款撤销;52->还款中;60->已还款;70->审核不通过;80->已融资撤销
	FinancialStatus *int64 `json:"financial_status,omitempty" xml:"financial_status,omitempty" require:"true"`
	// 上链账户
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty" require:"true"`
	// 联盟id
	UnionId *int64 `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// Channel 名称
	ChannelName *string `json:"channel_name,omitempty" xml:"channel_name,omitempty" require:"true"`
}

func (s NotifyCmportBankRequest) String() string {
	return tea.Prettify(s)
}

func (s NotifyCmportBankRequest) GoString() string {
	return s.String()
}

func (s *NotifyCmportBankRequest) SetAuthToken(v string) *NotifyCmportBankRequest {
	s.AuthToken = &v
	return s
}

func (s *NotifyCmportBankRequest) SetProductInstanceId(v string) *NotifyCmportBankRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *NotifyCmportBankRequest) SetFinancialNo(v string) *NotifyCmportBankRequest {
	s.FinancialNo = &v
	return s
}

func (s *NotifyCmportBankRequest) SetAuditor(v string) *NotifyCmportBankRequest {
	s.Auditor = &v
	return s
}

func (s *NotifyCmportBankRequest) SetAuditDate(v string) *NotifyCmportBankRequest {
	s.AuditDate = &v
	return s
}

func (s *NotifyCmportBankRequest) SetAuditComment(v string) *NotifyCmportBankRequest {
	s.AuditComment = &v
	return s
}

func (s *NotifyCmportBankRequest) SetFinancialStatus(v int64) *NotifyCmportBankRequest {
	s.FinancialStatus = &v
	return s
}

func (s *NotifyCmportBankRequest) SetUserDid(v string) *NotifyCmportBankRequest {
	s.UserDid = &v
	return s
}

func (s *NotifyCmportBankRequest) SetUnionId(v int64) *NotifyCmportBankRequest {
	s.UnionId = &v
	return s
}

func (s *NotifyCmportBankRequest) SetChannelName(v string) *NotifyCmportBankRequest {
	s.ChannelName = &v
	return s
}

type NotifyCmportBankResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s NotifyCmportBankResponse) String() string {
	return tea.Prettify(s)
}

func (s NotifyCmportBankResponse) GoString() string {
	return s.String()
}

func (s *NotifyCmportBankResponse) SetReqMsgId(v string) *NotifyCmportBankResponse {
	s.ReqMsgId = &v
	return s
}

func (s *NotifyCmportBankResponse) SetResultCode(v string) *NotifyCmportBankResponse {
	s.ResultCode = &v
	return s
}

func (s *NotifyCmportBankResponse) SetResultMsg(v string) *NotifyCmportBankResponse {
	s.ResultMsg = &v
	return s
}

type NotifyCmportLoanRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 平台融资编号
	FinancialNo *string `json:"financial_no,omitempty" xml:"financial_no,omitempty" require:"true"`
	// 确认放款日期
	ConfirmLoanDate *string `json:"confirm_loan_date,omitempty" xml:"confirm_loan_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 放款描述
	ConfirmLoanComment *string `json:"confirm_loan_comment,omitempty" xml:"confirm_loan_comment,omitempty" require:"true"`
	// 流程标记： 1->流程通过;2->流程打回到上一级;3->直接拒绝
	ConfirmLoanFlag *int64 `json:"confirm_loan_flag,omitempty" xml:"confirm_loan_flag,omitempty" require:"true"`
	//  融资状态:
	// 10->待确权;20->待审核;30->待签署;40->待放款;50->待还款;51->还款撤销;52->还款中;60->已还款;70->审核不通过;80->已融资撤销
	FinancialStatus *int64 `json:"financial_status,omitempty" xml:"financial_status,omitempty" require:"true"`
	// 上链账户
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty" require:"true"`
	// 联盟id
	UnionId *int64 `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// Channel 名称
	ChannelName *string `json:"channel_name,omitempty" xml:"channel_name,omitempty" require:"true"`
}

func (s NotifyCmportLoanRequest) String() string {
	return tea.Prettify(s)
}

func (s NotifyCmportLoanRequest) GoString() string {
	return s.String()
}

func (s *NotifyCmportLoanRequest) SetAuthToken(v string) *NotifyCmportLoanRequest {
	s.AuthToken = &v
	return s
}

func (s *NotifyCmportLoanRequest) SetProductInstanceId(v string) *NotifyCmportLoanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *NotifyCmportLoanRequest) SetFinancialNo(v string) *NotifyCmportLoanRequest {
	s.FinancialNo = &v
	return s
}

func (s *NotifyCmportLoanRequest) SetConfirmLoanDate(v string) *NotifyCmportLoanRequest {
	s.ConfirmLoanDate = &v
	return s
}

func (s *NotifyCmportLoanRequest) SetConfirmLoanComment(v string) *NotifyCmportLoanRequest {
	s.ConfirmLoanComment = &v
	return s
}

func (s *NotifyCmportLoanRequest) SetConfirmLoanFlag(v int64) *NotifyCmportLoanRequest {
	s.ConfirmLoanFlag = &v
	return s
}

func (s *NotifyCmportLoanRequest) SetFinancialStatus(v int64) *NotifyCmportLoanRequest {
	s.FinancialStatus = &v
	return s
}

func (s *NotifyCmportLoanRequest) SetUserDid(v string) *NotifyCmportLoanRequest {
	s.UserDid = &v
	return s
}

func (s *NotifyCmportLoanRequest) SetUnionId(v int64) *NotifyCmportLoanRequest {
	s.UnionId = &v
	return s
}

func (s *NotifyCmportLoanRequest) SetChannelName(v string) *NotifyCmportLoanRequest {
	s.ChannelName = &v
	return s
}

type NotifyCmportLoanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s NotifyCmportLoanResponse) String() string {
	return tea.Prettify(s)
}

func (s NotifyCmportLoanResponse) GoString() string {
	return s.String()
}

func (s *NotifyCmportLoanResponse) SetReqMsgId(v string) *NotifyCmportLoanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *NotifyCmportLoanResponse) SetResultCode(v string) *NotifyCmportLoanResponse {
	s.ResultCode = &v
	return s
}

func (s *NotifyCmportLoanResponse) SetResultMsg(v string) *NotifyCmportLoanResponse {
	s.ResultMsg = &v
	return s
}

type NotifyCmportRepayRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 平台融资编号
	FinancialNo *string `json:"financial_no,omitempty" xml:"financial_no,omitempty" require:"true"`
	// 还款编号
	RepayNo *string `json:"repay_no,omitempty" xml:"repay_no,omitempty" require:"true"`
	// 融资企业名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" require:"true"`
	// 融资企业编码
	CompanyCode *string `json:"company_code,omitempty" xml:"company_code,omitempty" require:"true"`
	// 产品编号
	ProductNo *string `json:"product_no,omitempty" xml:"product_no,omitempty" require:"true"`
	// 产品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true"`
	// 还款金额，一期一次性全部还款，加上利息
	TotalAmount *int64 `json:"total_amount,omitempty" xml:"total_amount,omitempty" require:"true"`
	// 还款银行
	RepayBank *string `json:"repay_bank,omitempty" xml:"repay_bank,omitempty" require:"true"`
	// 还款银行账号
	RepayBankAccount *string `json:"repay_bank_account,omitempty" xml:"repay_bank_account,omitempty" require:"true"`
	//  融资状态:
	// 10->待确权;20->待审核;30->待签署;40->待放款;50->待还款;51->还款撤销;52->还款中;60->已还款;70->审核不通过;80->已融资撤销
	FinancialStatus *int64 `json:"financial_status,omitempty" xml:"financial_status,omitempty" require:"true"`
	// 还款日期
	RepayDate *string `json:"repay_date,omitempty" xml:"repay_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 上链账户
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty" require:"true"`
	// 联盟id
	UnionId *int64 `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// Channel 名称
	ChannelName *string `json:"channel_name,omitempty" xml:"channel_name,omitempty" require:"true"`
}

func (s NotifyCmportRepayRequest) String() string {
	return tea.Prettify(s)
}

func (s NotifyCmportRepayRequest) GoString() string {
	return s.String()
}

func (s *NotifyCmportRepayRequest) SetAuthToken(v string) *NotifyCmportRepayRequest {
	s.AuthToken = &v
	return s
}

func (s *NotifyCmportRepayRequest) SetProductInstanceId(v string) *NotifyCmportRepayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *NotifyCmportRepayRequest) SetFinancialNo(v string) *NotifyCmportRepayRequest {
	s.FinancialNo = &v
	return s
}

func (s *NotifyCmportRepayRequest) SetRepayNo(v string) *NotifyCmportRepayRequest {
	s.RepayNo = &v
	return s
}

func (s *NotifyCmportRepayRequest) SetCompanyName(v string) *NotifyCmportRepayRequest {
	s.CompanyName = &v
	return s
}

func (s *NotifyCmportRepayRequest) SetCompanyCode(v string) *NotifyCmportRepayRequest {
	s.CompanyCode = &v
	return s
}

func (s *NotifyCmportRepayRequest) SetProductNo(v string) *NotifyCmportRepayRequest {
	s.ProductNo = &v
	return s
}

func (s *NotifyCmportRepayRequest) SetProductName(v string) *NotifyCmportRepayRequest {
	s.ProductName = &v
	return s
}

func (s *NotifyCmportRepayRequest) SetTotalAmount(v int64) *NotifyCmportRepayRequest {
	s.TotalAmount = &v
	return s
}

func (s *NotifyCmportRepayRequest) SetRepayBank(v string) *NotifyCmportRepayRequest {
	s.RepayBank = &v
	return s
}

func (s *NotifyCmportRepayRequest) SetRepayBankAccount(v string) *NotifyCmportRepayRequest {
	s.RepayBankAccount = &v
	return s
}

func (s *NotifyCmportRepayRequest) SetFinancialStatus(v int64) *NotifyCmportRepayRequest {
	s.FinancialStatus = &v
	return s
}

func (s *NotifyCmportRepayRequest) SetRepayDate(v string) *NotifyCmportRepayRequest {
	s.RepayDate = &v
	return s
}

func (s *NotifyCmportRepayRequest) SetUserDid(v string) *NotifyCmportRepayRequest {
	s.UserDid = &v
	return s
}

func (s *NotifyCmportRepayRequest) SetUnionId(v int64) *NotifyCmportRepayRequest {
	s.UnionId = &v
	return s
}

func (s *NotifyCmportRepayRequest) SetChannelName(v string) *NotifyCmportRepayRequest {
	s.ChannelName = &v
	return s
}

type NotifyCmportRepayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s NotifyCmportRepayResponse) String() string {
	return tea.Prettify(s)
}

func (s NotifyCmportRepayResponse) GoString() string {
	return s.String()
}

func (s *NotifyCmportRepayResponse) SetReqMsgId(v string) *NotifyCmportRepayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *NotifyCmportRepayResponse) SetResultCode(v string) *NotifyCmportRepayResponse {
	s.ResultCode = &v
	return s
}

func (s *NotifyCmportRepayResponse) SetResultMsg(v string) *NotifyCmportRepayResponse {
	s.ResultMsg = &v
	return s
}

type ListCmportBankfeeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// accountingDate
	AccountDate *string `json:"account_date,omitempty" xml:"account_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 页码，从1开始
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 页大小，最大100
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s ListCmportBankfeeRequest) String() string {
	return tea.Prettify(s)
}

func (s ListCmportBankfeeRequest) GoString() string {
	return s.String()
}

func (s *ListCmportBankfeeRequest) SetAuthToken(v string) *ListCmportBankfeeRequest {
	s.AuthToken = &v
	return s
}

func (s *ListCmportBankfeeRequest) SetProductInstanceId(v string) *ListCmportBankfeeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListCmportBankfeeRequest) SetAccountDate(v string) *ListCmportBankfeeRequest {
	s.AccountDate = &v
	return s
}

func (s *ListCmportBankfeeRequest) SetPageNum(v int64) *ListCmportBankfeeRequest {
	s.PageNum = &v
	return s
}

func (s *ListCmportBankfeeRequest) SetPageSize(v int64) *ListCmportBankfeeRequest {
	s.PageSize = &v
	return s
}

type ListCmportBankfeeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
	// 返回还款利息列表
	BankFeeList []*BankFee `json:"bank_fee_list,omitempty" xml:"bank_fee_list,omitempty" type:"Repeated"`
}

func (s ListCmportBankfeeResponse) String() string {
	return tea.Prettify(s)
}

func (s ListCmportBankfeeResponse) GoString() string {
	return s.String()
}

func (s *ListCmportBankfeeResponse) SetReqMsgId(v string) *ListCmportBankfeeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListCmportBankfeeResponse) SetResultCode(v string) *ListCmportBankfeeResponse {
	s.ResultCode = &v
	return s
}

func (s *ListCmportBankfeeResponse) SetResultMsg(v string) *ListCmportBankfeeResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListCmportBankfeeResponse) SetPageNum(v int64) *ListCmportBankfeeResponse {
	s.PageNum = &v
	return s
}

func (s *ListCmportBankfeeResponse) SetPageSize(v int64) *ListCmportBankfeeResponse {
	s.PageSize = &v
	return s
}

func (s *ListCmportBankfeeResponse) SetTotalPage(v int64) *ListCmportBankfeeResponse {
	s.TotalPage = &v
	return s
}

func (s *ListCmportBankfeeResponse) SetBankFeeList(v []*BankFee) *ListCmportBankfeeResponse {
	s.BankFeeList = v
	return s
}

type NotifyCmportLogisticsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 融资编号
	//
	FinancialNo *string `json:"financial_no,omitempty" xml:"financial_no,omitempty" require:"true"`
	// 货权编号
	//
	CargoRightNo *string `json:"cargo_right_no,omitempty" xml:"cargo_right_no,omitempty" require:"true"`
	// 获物品名
	//
	GoodsTypeName *string `json:"goods_type_name,omitempty" xml:"goods_type_name,omitempty" require:"true"`
	// 运输条款
	//
	TransitClause *string `json:"transit_clause,omitempty" xml:"transit_clause,omitempty" require:"true"`
	// 箱子数量
	//
	BoxNum *int64 `json:"box_num,omitempty" xml:"box_num,omitempty" require:"true"`
	// 箱型
	//
	BoxType *string `json:"box_type,omitempty" xml:"box_type,omitempty"`
	// 运单信息详情列表
	OrderInfoList []*OrderInfo `json:"order_info_list,omitempty" xml:"order_info_list,omitempty" require:"true" type:"Repeated"`
	// 上链账户
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty" require:"true"`
	// 联盟id
	UnionId *int64 `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 渠道名称
	ChannelName *string `json:"channel_name,omitempty" xml:"channel_name,omitempty" require:"true"`
}

func (s NotifyCmportLogisticsRequest) String() string {
	return tea.Prettify(s)
}

func (s NotifyCmportLogisticsRequest) GoString() string {
	return s.String()
}

func (s *NotifyCmportLogisticsRequest) SetAuthToken(v string) *NotifyCmportLogisticsRequest {
	s.AuthToken = &v
	return s
}

func (s *NotifyCmportLogisticsRequest) SetProductInstanceId(v string) *NotifyCmportLogisticsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *NotifyCmportLogisticsRequest) SetFinancialNo(v string) *NotifyCmportLogisticsRequest {
	s.FinancialNo = &v
	return s
}

func (s *NotifyCmportLogisticsRequest) SetCargoRightNo(v string) *NotifyCmportLogisticsRequest {
	s.CargoRightNo = &v
	return s
}

func (s *NotifyCmportLogisticsRequest) SetGoodsTypeName(v string) *NotifyCmportLogisticsRequest {
	s.GoodsTypeName = &v
	return s
}

func (s *NotifyCmportLogisticsRequest) SetTransitClause(v string) *NotifyCmportLogisticsRequest {
	s.TransitClause = &v
	return s
}

func (s *NotifyCmportLogisticsRequest) SetBoxNum(v int64) *NotifyCmportLogisticsRequest {
	s.BoxNum = &v
	return s
}

func (s *NotifyCmportLogisticsRequest) SetBoxType(v string) *NotifyCmportLogisticsRequest {
	s.BoxType = &v
	return s
}

func (s *NotifyCmportLogisticsRequest) SetOrderInfoList(v []*OrderInfo) *NotifyCmportLogisticsRequest {
	s.OrderInfoList = v
	return s
}

func (s *NotifyCmportLogisticsRequest) SetUserDid(v string) *NotifyCmportLogisticsRequest {
	s.UserDid = &v
	return s
}

func (s *NotifyCmportLogisticsRequest) SetUnionId(v int64) *NotifyCmportLogisticsRequest {
	s.UnionId = &v
	return s
}

func (s *NotifyCmportLogisticsRequest) SetChannelName(v string) *NotifyCmportLogisticsRequest {
	s.ChannelName = &v
	return s
}

type NotifyCmportLogisticsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s NotifyCmportLogisticsResponse) String() string {
	return tea.Prettify(s)
}

func (s NotifyCmportLogisticsResponse) GoString() string {
	return s.String()
}

func (s *NotifyCmportLogisticsResponse) SetReqMsgId(v string) *NotifyCmportLogisticsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *NotifyCmportLogisticsResponse) SetResultCode(v string) *NotifyCmportLogisticsResponse {
	s.ResultCode = &v
	return s
}

func (s *NotifyCmportLogisticsResponse) SetResultMsg(v string) *NotifyCmportLogisticsResponse {
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
				"sdk_version":      tea.String("1.0.44"),
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
 * Description: 用户注册
 * Summary: 用户注册
 */
func (client *Client) CreateUser(request *CreateUserRequest) (_result *CreateUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateUserResponse{}
	_body, _err := client.CreateUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户注册
 * Summary: 用户注册
 */
func (client *Client) CreateUserEx(request *CreateUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.user.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 物权凭证转让/赠送
 * Summary: 物权凭证转让/赠送
 */
func (client *Client) CreateTransfer(request *CreateTransferRequest) (_result *CreateTransferResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateTransferResponse{}
	_body, _err := client.CreateTransferEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 物权凭证转让/赠送
 * Summary: 物权凭证转让/赠送
 */
func (client *Client) CreateTransferEx(request *CreateTransferRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateTransferResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTransferResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.transfer.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建提取码
 * Summary: 创建提取码
 */
func (client *Client) CreatePickup(request *CreatePickupRequest) (_result *CreatePickupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreatePickupResponse{}
	_body, _err := client.CreatePickupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建提取码
 * Summary: 创建提取码
 */
func (client *Client) CreatePickupEx(request *CreatePickupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreatePickupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreatePickupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.pickup.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 销毁提取码
 * Summary: 销毁提取码
 */
func (client *Client) CancelPickup(request *CancelPickupRequest) (_result *CancelPickupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelPickupResponse{}
	_body, _err := client.CancelPickupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 销毁提取码
 * Summary: 销毁提取码
 */
func (client *Client) CancelPickupEx(request *CancelPickupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelPickupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelPickupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.pickup.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 核销提取码
 * Summary: 核销提取码
 */
func (client *Client) DisablePickup(request *DisablePickupRequest) (_result *DisablePickupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DisablePickupResponse{}
	_body, _err := client.DisablePickupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 核销提取码
 * Summary: 核销提取码
 */
func (client *Client) DisablePickupEx(request *DisablePickupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DisablePickupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DisablePickupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.pickup.disable"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建联盟
 * Summary: 创建联盟
 */
func (client *Client) CreateLeague(request *CreateLeagueRequest) (_result *CreateLeagueResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeagueResponse{}
	_body, _err := client.CreateLeagueEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建联盟
 * Summary: 创建联盟
 */
func (client *Client) CreateLeagueEx(request *CreateLeagueRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeagueResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeagueResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.league.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 加入联盟
 * Summary: 加入联盟
 */
func (client *Client) AddLeague(request *AddLeagueRequest) (_result *AddLeagueResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddLeagueResponse{}
	_body, _err := client.AddLeagueEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 加入联盟
 * Summary: 加入联盟
 */
func (client *Client) AddLeagueEx(request *AddLeagueRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddLeagueResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddLeagueResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.league.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 审核加入联盟
 * Summary: 审核加入联盟
 */
func (client *Client) ConfirmLeague(request *ConfirmLeagueRequest) (_result *ConfirmLeagueResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ConfirmLeagueResponse{}
	_body, _err := client.ConfirmLeagueEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 审核加入联盟
 * Summary: 审核加入联盟
 */
func (client *Client) ConfirmLeagueEx(request *ConfirmLeagueRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ConfirmLeagueResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmLeagueResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.league.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询联盟
 * Summary: 查询联盟
 */
func (client *Client) QueryLeague(request *QueryLeagueRequest) (_result *QueryLeagueResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryLeagueResponse{}
	_body, _err := client.QueryLeagueEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询联盟
 * Summary: 查询联盟
 */
func (client *Client) QueryLeagueEx(request *QueryLeagueRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryLeagueResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryLeagueResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.league.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建资产信息
 * Summary: 创建资产信息
 */
func (client *Client) CreateImportasset(request *CreateImportassetRequest) (_result *CreateImportassetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateImportassetResponse{}
	_body, _err := client.CreateImportassetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建资产信息
 * Summary: 创建资产信息
 */
func (client *Client) CreateImportassetEx(request *CreateImportassetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateImportassetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateImportassetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.importasset.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新物权
 * Summary: 更新物权
 */
func (client *Client) UpdateImportasset(request *UpdateImportassetRequest) (_result *UpdateImportassetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateImportassetResponse{}
	_body, _err := client.UpdateImportassetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新物权
 * Summary: 更新物权
 */
func (client *Client) UpdateImportassetEx(request *UpdateImportassetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateImportassetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateImportassetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.importasset.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 注销物权
 * Summary: 注销物权
 */
func (client *Client) CancelImportasset(request *CancelImportassetRequest) (_result *CancelImportassetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelImportassetResponse{}
	_body, _err := client.CancelImportassetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 注销物权
 * Summary: 注销物权
 */
func (client *Client) CancelImportassetEx(request *CancelImportassetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelImportassetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelImportassetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.importasset.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 冻结物权
 * Summary: 冻结物权
 */
func (client *Client) FreezeImportasset(request *FreezeImportassetRequest) (_result *FreezeImportassetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &FreezeImportassetResponse{}
	_body, _err := client.FreezeImportassetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 冻结物权
 * Summary: 冻结物权
 */
func (client *Client) FreezeImportassetEx(request *FreezeImportassetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *FreezeImportassetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &FreezeImportassetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.importasset.freeze"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 解冻物权
 * Summary: 解冻物权
 */
func (client *Client) UnfreezeImportasset(request *UnfreezeImportassetRequest) (_result *UnfreezeImportassetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UnfreezeImportassetResponse{}
	_body, _err := client.UnfreezeImportassetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 解冻物权
 * Summary: 解冻物权
 */
func (client *Client) UnfreezeImportassetEx(request *UnfreezeImportassetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UnfreezeImportassetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UnfreezeImportassetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.importasset.unfreeze"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询物权
 * Summary: 查询物权
 */
func (client *Client) QueryImportasset(request *QueryImportassetRequest) (_result *QueryImportassetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryImportassetResponse{}
	_body, _err := client.QueryImportassetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询物权
 * Summary: 查询物权
 */
func (client *Client) QueryImportassetEx(request *QueryImportassetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryImportassetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryImportassetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.importasset.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 物权列表
 * Summary: 物权列表
 */
func (client *Client) AllImportasset(request *AllImportassetRequest) (_result *AllImportassetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllImportassetResponse{}
	_body, _err := client.AllImportassetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 物权列表
 * Summary: 物权列表
 */
func (client *Client) AllImportassetEx(request *AllImportassetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllImportassetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllImportassetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.importasset.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 批量查询溯源信息
 * Summary: 批量查询溯源信息
 */
func (client *Client) BatchqueryImportasset(request *BatchqueryImportassetRequest) (_result *BatchqueryImportassetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchqueryImportassetResponse{}
	_body, _err := client.BatchqueryImportassetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 批量查询溯源信息
 * Summary: 批量查询溯源信息
 */
func (client *Client) BatchqueryImportassetEx(request *BatchqueryImportassetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchqueryImportassetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchqueryImportassetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.importasset.batchquery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建数据字典
 * Summary: 创建数据字典
 */
func (client *Client) CreateTemplate(request *CreateTemplateRequest) (_result *CreateTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateTemplateResponse{}
	_body, _err := client.CreateTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建数据字典
 * Summary: 创建数据字典
 */
func (client *Client) CreateTemplateEx(request *CreateTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.template.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新数据字典
 * Summary: 更新数据字典
 */
func (client *Client) UpdateTemplate(request *UpdateTemplateRequest) (_result *UpdateTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateTemplateResponse{}
	_body, _err := client.UpdateTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新数据字典
 * Summary: 更新数据字典
 */
func (client *Client) UpdateTemplateEx(request *UpdateTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.template.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询数据字典
 * Summary: 查询数据字典
 */
func (client *Client) QueryTemplate(request *QueryTemplateRequest) (_result *QueryTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTemplateResponse{}
	_body, _err := client.QueryTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询数据字典
 * Summary: 查询数据字典
 */
func (client *Client) QueryTemplateEx(request *QueryTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.template.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数据字典列表信息
 * Summary: 数据字典列表信息
 */
func (client *Client) AllTemplate(request *AllTemplateRequest) (_result *AllTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllTemplateResponse{}
	_body, _err := client.AllTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数据字典列表信息
 * Summary: 数据字典列表信息
 */
func (client *Client) AllTemplateEx(request *AllTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.template.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建验权码
 * Summary: 创建验权码
 */
func (client *Client) CreateCheckcode(request *CreateCheckcodeRequest) (_result *CreateCheckcodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateCheckcodeResponse{}
	_body, _err := client.CreateCheckcodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建验权码
 * Summary: 创建验权码
 */
func (client *Client) CreateCheckcodeEx(request *CreateCheckcodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateCheckcodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateCheckcodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.checkcode.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 校验验权码
 * Summary: 校验验权码
 */
func (client *Client) CheckCheckcode(request *CheckCheckcodeRequest) (_result *CheckCheckcodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckCheckcodeResponse{}
	_body, _err := client.CheckCheckcodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 校验验权码
 * Summary: 校验验权码
 */
func (client *Client) CheckCheckcodeEx(request *CheckCheckcodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckCheckcodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckCheckcodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.checkcode.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建质押申请
 * Summary: 创建质押申请
 */
func (client *Client) CreateAssetpledge(request *CreateAssetpledgeRequest) (_result *CreateAssetpledgeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAssetpledgeResponse{}
	_body, _err := client.CreateAssetpledgeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建质押申请
 * Summary: 创建质押申请
 */
func (client *Client) CreateAssetpledgeEx(request *CreateAssetpledgeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAssetpledgeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAssetpledgeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.assetpledge.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 质押放款
 * Summary: 质押放款
 */
func (client *Client) ReleaseAssetpledge(request *ReleaseAssetpledgeRequest) (_result *ReleaseAssetpledgeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ReleaseAssetpledgeResponse{}
	_body, _err := client.ReleaseAssetpledgeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 质押放款
 * Summary: 质押放款
 */
func (client *Client) ReleaseAssetpledgeEx(request *ReleaseAssetpledgeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ReleaseAssetpledgeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ReleaseAssetpledgeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.assetpledge.release"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 质押还款
 * Summary: 质押还款
 */
func (client *Client) RepayAssetpledge(request *RepayAssetpledgeRequest) (_result *RepayAssetpledgeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RepayAssetpledgeResponse{}
	_body, _err := client.RepayAssetpledgeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 质押还款
 * Summary: 质押还款
 */
func (client *Client) RepayAssetpledgeEx(request *RepayAssetpledgeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RepayAssetpledgeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RepayAssetpledgeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.assetpledge.repay"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询账户信息
 * Summary: 查询账户信息
 */
func (client *Client) GetLeagueAccountinfo(request *GetLeagueAccountinfoRequest) (_result *GetLeagueAccountinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetLeagueAccountinfoResponse{}
	_body, _err := client.GetLeagueAccountinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询账户信息
 * Summary: 查询账户信息
 */
func (client *Client) GetLeagueAccountinfoEx(request *GetLeagueAccountinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetLeagueAccountinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetLeagueAccountinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.league.accountinfo.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 登记仓库
 * Summary: 登记仓库
 */
func (client *Client) CreateWarehouse(request *CreateWarehouseRequest) (_result *CreateWarehouseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateWarehouseResponse{}
	_body, _err := client.CreateWarehouseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 登记仓库
 * Summary: 登记仓库
 */
func (client *Client) CreateWarehouseEx(request *CreateWarehouseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateWarehouseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateWarehouseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.warehouse.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 例举角色类型
 * Summary: 例举角色类型
 */
func (client *Client) ListLeagueRole(request *ListLeagueRoleRequest) (_result *ListLeagueRoleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListLeagueRoleResponse{}
	_body, _err := client.ListLeagueRoleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 例举角色类型
 * Summary: 例举角色类型
 */
func (client *Client) ListLeagueRoleEx(request *ListLeagueRoleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListLeagueRoleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListLeagueRoleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.league.role.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询仓库详细信息
 * Summary: 查询仓库详细信息
 */
func (client *Client) GetWarehouse(request *GetWarehouseRequest) (_result *GetWarehouseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetWarehouseResponse{}
	_body, _err := client.GetWarehouseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询仓库详细信息
 * Summary: 查询仓库详细信息
 */
func (client *Client) GetWarehouseEx(request *GetWarehouseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetWarehouseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetWarehouseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.warehouse.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新库存信息
 * Summary: 更新库存信息
 */
func (client *Client) UpdateWarehouse(request *UpdateWarehouseRequest) (_result *UpdateWarehouseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateWarehouseResponse{}
	_body, _err := client.UpdateWarehouseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新库存信息
 * Summary: 更新库存信息
 */
func (client *Client) UpdateWarehouseEx(request *UpdateWarehouseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateWarehouseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateWarehouseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.warehouse.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 列举用户仓库列表
 * Summary: 列举用户仓库列表
 */
func (client *Client) ListWarehouse(request *ListWarehouseRequest) (_result *ListWarehouseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListWarehouseResponse{}
	_body, _err := client.ListWarehouseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 列举用户仓库列表
 * Summary: 列举用户仓库列表
 */
func (client *Client) ListWarehouseEx(request *ListWarehouseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListWarehouseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListWarehouseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.warehouse.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 例举联盟
 * Summary: 例举联盟
 */
func (client *Client) ListLeague(request *ListLeagueRequest) (_result *ListLeagueResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListLeagueResponse{}
	_body, _err := client.ListLeagueEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 例举联盟
 * Summary: 例举联盟
 */
func (client *Client) ListLeagueEx(request *ListLeagueRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListLeagueResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListLeagueResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.league.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 列举某个仓库/仓位下的设备信息
 * Summary: 列举某个仓库/仓位下的设备信息
 */
func (client *Client) QueryWarehouseDevice(request *QueryWarehouseDeviceRequest) (_result *QueryWarehouseDeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryWarehouseDeviceResponse{}
	_body, _err := client.QueryWarehouseDeviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 列举某个仓库/仓位下的设备信息
 * Summary: 列举某个仓库/仓位下的设备信息
 */
func (client *Client) QueryWarehouseDeviceEx(request *QueryWarehouseDeviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryWarehouseDeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryWarehouseDeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.warehouse.device.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建联盟申请
 * Summary: 创建联盟申请
 */
func (client *Client) CreateLeagueApply(request *CreateLeagueApplyRequest) (_result *CreateLeagueApplyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeagueApplyResponse{}
	_body, _err := client.CreateLeagueApplyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建联盟申请
 * Summary: 创建联盟申请
 */
func (client *Client) CreateLeagueApplyEx(request *CreateLeagueApplyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeagueApplyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeagueApplyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.league.apply.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交入盟申请
 * Summary: 提交入盟申请
 */
func (client *Client) CreateLeagueJoinapply(request *CreateLeagueJoinapplyRequest) (_result *CreateLeagueJoinapplyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeagueJoinapplyResponse{}
	_body, _err := client.CreateLeagueJoinapplyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交入盟申请
 * Summary: 提交入盟申请
 */
func (client *Client) CreateLeagueJoinapplyEx(request *CreateLeagueJoinapplyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeagueJoinapplyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeagueJoinapplyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.league.joinapply.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 撤销入盟申请
 * Summary: 撤销入盟申请
 */
func (client *Client) CancelLeagueApply(request *CancelLeagueApplyRequest) (_result *CancelLeagueApplyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelLeagueApplyResponse{}
	_body, _err := client.CancelLeagueApplyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 撤销入盟申请
 * Summary: 撤销入盟申请
 */
func (client *Client) CancelLeagueApplyEx(request *CancelLeagueApplyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelLeagueApplyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelLeagueApplyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.league.apply.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 列举仓库下的库位列表
 * Summary: 列举仓库下的库位列表
 */
func (client *Client) QueryWarehouseStoragelocation(request *QueryWarehouseStoragelocationRequest) (_result *QueryWarehouseStoragelocationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryWarehouseStoragelocationResponse{}
	_body, _err := client.QueryWarehouseStoragelocationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 列举仓库下的库位列表
 * Summary: 列举仓库下的库位列表
 */
func (client *Client) QueryWarehouseStoragelocationEx(request *QueryWarehouseStoragelocationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryWarehouseStoragelocationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryWarehouseStoragelocationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.warehouse.storagelocation.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 盟主审核入盟申请
 * Summary: 盟主审核入盟申请
 */
func (client *Client) AuthLeagueApply(request *AuthLeagueApplyRequest) (_result *AuthLeagueApplyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthLeagueApplyResponse{}
	_body, _err := client.AuthLeagueApplyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 盟主审核入盟申请
 * Summary: 盟主审核入盟申请
 */
func (client *Client) AuthLeagueApplyEx(request *AuthLeagueApplyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthLeagueApplyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthLeagueApplyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.league.apply.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除仓库
 * Summary: 删除仓库
 */
func (client *Client) DeleteWarehouse(request *DeleteWarehouseRequest) (_result *DeleteWarehouseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteWarehouseResponse{}
	_body, _err := client.DeleteWarehouseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除仓库
 * Summary: 删除仓库
 */
func (client *Client) DeleteWarehouseEx(request *DeleteWarehouseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteWarehouseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteWarehouseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.warehouse.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 例举入盟申请
 * Summary: 例举入盟申请
 */
func (client *Client) ListLeagueApply(request *ListLeagueApplyRequest) (_result *ListLeagueApplyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListLeagueApplyResponse{}
	_body, _err := client.ListLeagueApplyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 例举入盟申请
 * Summary: 例举入盟申请
 */
func (client *Client) ListLeagueApplyEx(request *ListLeagueApplyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListLeagueApplyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListLeagueApplyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.league.apply.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 登记库位信息
 * Summary: 登记库位信息
 */
func (client *Client) CreateWarehouseStoraglocation(request *CreateWarehouseStoraglocationRequest) (_result *CreateWarehouseStoraglocationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateWarehouseStoraglocationResponse{}
	_body, _err := client.CreateWarehouseStoraglocationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 登记库位信息
 * Summary: 登记库位信息
 */
func (client *Client) CreateWarehouseStoraglocationEx(request *CreateWarehouseStoraglocationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateWarehouseStoraglocationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateWarehouseStoraglocationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.warehouse.storaglocation.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询库位详细信息
 * Summary: 查询库位详细信息
 */
func (client *Client) GetWarehouseStoragelocation(request *GetWarehouseStoragelocationRequest) (_result *GetWarehouseStoragelocationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetWarehouseStoragelocationResponse{}
	_body, _err := client.GetWarehouseStoragelocationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询库位详细信息
 * Summary: 查询库位详细信息
 */
func (client *Client) GetWarehouseStoragelocationEx(request *GetWarehouseStoragelocationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetWarehouseStoragelocationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetWarehouseStoragelocationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.warehouse.storagelocation.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description:  更新库位信息
 * Summary:  更新库位信息
 */
func (client *Client) UpdateWarehouseStoragelocation(request *UpdateWarehouseStoragelocationRequest) (_result *UpdateWarehouseStoragelocationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateWarehouseStoragelocationResponse{}
	_body, _err := client.UpdateWarehouseStoragelocationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description:  更新库位信息
 * Summary:  更新库位信息
 */
func (client *Client) UpdateWarehouseStoragelocationEx(request *UpdateWarehouseStoragelocationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateWarehouseStoragelocationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateWarehouseStoragelocationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.warehouse.storagelocation.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 列举用户库位列表
 * Summary: 列举用户库位列表
 */
func (client *Client) BatchqueryWarehouseStoragelocation(request *BatchqueryWarehouseStoragelocationRequest) (_result *BatchqueryWarehouseStoragelocationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchqueryWarehouseStoragelocationResponse{}
	_body, _err := client.BatchqueryWarehouseStoragelocationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 列举用户库位列表
 * Summary: 列举用户库位列表
 */
func (client *Client) BatchqueryWarehouseStoragelocationEx(request *BatchqueryWarehouseStoragelocationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchqueryWarehouseStoragelocationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchqueryWarehouseStoragelocationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.warehouse.storagelocation.batchquery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 列举仓库下某状态的库位列表
 * Summary: 列举仓库下某状态的库位列表
 */
func (client *Client) ListWarehouseStoragelocation(request *ListWarehouseStoragelocationRequest) (_result *ListWarehouseStoragelocationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListWarehouseStoragelocationResponse{}
	_body, _err := client.ListWarehouseStoragelocationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 列举仓库下某状态的库位列表
 * Summary: 列举仓库下某状态的库位列表
 */
func (client *Client) ListWarehouseStoragelocationEx(request *ListWarehouseStoragelocationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListWarehouseStoragelocationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListWarehouseStoragelocationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.warehouse.storagelocation.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除库位
 * Summary: 删除库位
 */
func (client *Client) DeleteWarehouseStoragelocation(request *DeleteWarehouseStoragelocationRequest) (_result *DeleteWarehouseStoragelocationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteWarehouseStoragelocationResponse{}
	_body, _err := client.DeleteWarehouseStoragelocationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除库位
 * Summary: 删除库位
 */
func (client *Client) DeleteWarehouseStoragelocationEx(request *DeleteWarehouseStoragelocationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteWarehouseStoragelocationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteWarehouseStoragelocationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.warehouse.storagelocation.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建数据字典
 * Summary: 创建数据字典
 */
func (client *Client) CreateAssettemplate(request *CreateAssettemplateRequest) (_result *CreateAssettemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAssettemplateResponse{}
	_body, _err := client.CreateAssettemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建数据字典
 * Summary: 创建数据字典
 */
func (client *Client) CreateAssettemplateEx(request *CreateAssettemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAssettemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAssettemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.assettemplate.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新数据字典
 * Summary: 更新数据字典
 */
func (client *Client) UpdateAssettemplate(request *UpdateAssettemplateRequest) (_result *UpdateAssettemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateAssettemplateResponse{}
	_body, _err := client.UpdateAssettemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新数据字典
 * Summary: 更新数据字典
 */
func (client *Client) UpdateAssettemplateEx(request *UpdateAssettemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateAssettemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAssettemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.assettemplate.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询数据字典
 * Summary: 查询数据字典
 */
func (client *Client) GetAssettemplate(request *GetAssettemplateRequest) (_result *GetAssettemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAssettemplateResponse{}
	_body, _err := client.GetAssettemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询数据字典
 * Summary: 查询数据字典
 */
func (client *Client) GetAssettemplateEx(request *GetAssettemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAssettemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAssettemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.assettemplate.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 列举数据字典
 * Summary: 列举数据字典
 */
func (client *Client) ListAssettemplate(request *ListAssettemplateRequest) (_result *ListAssettemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAssettemplateResponse{}
	_body, _err := client.ListAssettemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 列举数据字典
 * Summary: 列举数据字典
 */
func (client *Client) ListAssettemplateEx(request *ListAssettemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAssettemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAssettemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.assettemplate.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除数据字典
 * Summary: 删除数据字典
 */
func (client *Client) DeleteAssettemplate(request *DeleteAssettemplateRequest) (_result *DeleteAssettemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteAssettemplateResponse{}
	_body, _err := client.DeleteAssettemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除数据字典
 * Summary: 删除数据字典
 */
func (client *Client) DeleteAssettemplateEx(request *DeleteAssettemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteAssettemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteAssettemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.assettemplate.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 生效/失效数据字典
 * Summary: 生效/失效数据字典
 */
func (client *Client) EnableAssettemplate(request *EnableAssettemplateRequest) (_result *EnableAssettemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &EnableAssettemplateResponse{}
	_body, _err := client.EnableAssettemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 生效/失效数据字典
 * Summary: 生效/失效数据字典
 */
func (client *Client) EnableAssettemplateEx(request *EnableAssettemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *EnableAssettemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &EnableAssettemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.assettemplate.enable"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 上传文件
 * Summary: 上传文件
 */
func (client *Client) UpdateDocumentFile(request *UpdateDocumentFileRequest) (_result *UpdateDocumentFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateDocumentFileResponse{}
	_body, _err := client.UpdateDocumentFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上传文件
 * Summary: 上传文件
 */
func (client *Client) UpdateDocumentFileEx(request *UpdateDocumentFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateDocumentFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateDocumentFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.document.file.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据文件id查找文件
 * Summary: 根据文件id查找文件
 */
func (client *Client) GetDocumentFile(request *GetDocumentFileRequest) (_result *GetDocumentFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetDocumentFileResponse{}
	_body, _err := client.GetDocumentFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据文件id查找文件
 * Summary: 根据文件id查找文件
 */
func (client *Client) GetDocumentFileEx(request *GetDocumentFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetDocumentFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDocumentFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.document.file.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户注销
 * Summary: 用户注销
 */
func (client *Client) CancelUser(request *CancelUserRequest) (_result *CancelUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelUserResponse{}
	_body, _err := client.CancelUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户注销
 * Summary: 用户注销
 */
func (client *Client) CancelUserEx(request *CancelUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.user.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新用户信息
 * Summary: 更新用户信息
 */
func (client *Client) UpdateUser(request *UpdateUserRequest) (_result *UpdateUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateUserResponse{}
	_body, _err := client.UpdateUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新用户信息
 * Summary: 更新用户信息
 */
func (client *Client) UpdateUserEx(request *UpdateUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.user.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询用户信息列表
 * Summary: 查询用户信息列表
 */
func (client *Client) ListUser(request *ListUserRequest) (_result *ListUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListUserResponse{}
	_body, _err := client.ListUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询用户信息列表
 * Summary: 查询用户信息列表
 */
func (client *Client) ListUserEx(request *ListUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.user.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 映射用户信息
 * Summary: 映射用户信息
 */
func (client *Client) MountUser(request *MountUserRequest) (_result *MountUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &MountUserResponse{}
	_body, _err := client.MountUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 映射用户信息
 * Summary: 映射用户信息
 */
func (client *Client) MountUserEx(request *MountUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *MountUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &MountUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.user.mount"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 批量创建物权
 * Summary: 批量创建物权
 */
func (client *Client) BatchcreateImportasset(request *BatchcreateImportassetRequest) (_result *BatchcreateImportassetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchcreateImportassetResponse{}
	_body, _err := client.BatchcreateImportassetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 批量创建物权
 * Summary: 批量创建物权
 */
func (client *Client) BatchcreateImportassetEx(request *BatchcreateImportassetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchcreateImportassetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchcreateImportassetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.importasset.batchcreate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 添加物权描述信息
 * Summary: 添加物权描述信息
 */
func (client *Client) DescribeImportasset(request *DescribeImportassetRequest) (_result *DescribeImportassetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DescribeImportassetResponse{}
	_body, _err := client.DescribeImportassetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 添加物权描述信息
 * Summary: 添加物权描述信息
 */
func (client *Client) DescribeImportassetEx(request *DescribeImportassetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DescribeImportassetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DescribeImportassetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.importasset.describe"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 批量冻结
 * Summary: 批量冻结
 */
func (client *Client) BatchfreezeImportasset(request *BatchfreezeImportassetRequest) (_result *BatchfreezeImportassetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchfreezeImportassetResponse{}
	_body, _err := client.BatchfreezeImportassetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 批量冻结
 * Summary: 批量冻结
 */
func (client *Client) BatchfreezeImportassetEx(request *BatchfreezeImportassetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchfreezeImportassetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchfreezeImportassetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.importasset.batchfreeze"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 物权批量解冻
 * Summary: 物权批量解冻
 */
func (client *Client) BatchunfreezeImportasset(request *BatchunfreezeImportassetRequest) (_result *BatchunfreezeImportassetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchunfreezeImportassetResponse{}
	_body, _err := client.BatchunfreezeImportassetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 物权批量解冻
 * Summary: 物权批量解冻
 */
func (client *Client) BatchunfreezeImportassetEx(request *BatchunfreezeImportassetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchunfreezeImportassetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchunfreezeImportassetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.importasset.batchunfreeze"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 物权批量撤销
 * Summary: 物权批量撤销
 */
func (client *Client) BatchcancelImportasset(request *BatchcancelImportassetRequest) (_result *BatchcancelImportassetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchcancelImportassetResponse{}
	_body, _err := client.BatchcancelImportassetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 物权批量撤销
 * Summary: 物权批量撤销
 */
func (client *Client) BatchcancelImportassetEx(request *BatchcancelImportassetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchcancelImportassetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchcancelImportassetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.importasset.batchcancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 批量创建转让申请
 * Summary: 批量创建转让申请
 */
func (client *Client) BatchcreateTransfer(request *BatchcreateTransferRequest) (_result *BatchcreateTransferResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchcreateTransferResponse{}
	_body, _err := client.BatchcreateTransferEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 批量创建转让申请
 * Summary: 批量创建转让申请
 */
func (client *Client) BatchcreateTransferEx(request *BatchcreateTransferRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchcreateTransferResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchcreateTransferResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.transfer.batchcreate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建分润比例配置
 * Summary: 创建分润比例配置
 */
func (client *Client) CreateCmportProfitrate(request *CreateCmportProfitrateRequest) (_result *CreateCmportProfitrateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateCmportProfitrateResponse{}
	_body, _err := client.CreateCmportProfitrateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建分润比例配置
 * Summary: 创建分润比例配置
 */
func (client *Client) CreateCmportProfitrateEx(request *CreateCmportProfitrateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateCmportProfitrateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateCmportProfitrateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.cmport.profitrate.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 粮达网发起融资申请，经过金融平台，然后金融平台再全量同步给区块链应用。
 * Summary: 融资申请信息落地到区块链
 */
func (client *Client) ApplyCmportFinance(request *ApplyCmportFinanceRequest) (_result *ApplyCmportFinanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyCmportFinanceResponse{}
	_body, _err := client.ApplyCmportFinanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 粮达网发起融资申请，经过金融平台，然后金融平台再全量同步给区块链应用。
 * Summary: 融资申请信息落地到区块链
 */
func (client *Client) ApplyCmportFinanceEx(request *ApplyCmportFinanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyCmportFinanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyCmportFinanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.cmport.finance.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分润对账，企业到当前记账日期的累计利润信息
 * Summary: 企业分润对账单
 */
func (client *Client) ListCmportEnterprisestatement(request *ListCmportEnterprisestatementRequest) (_result *ListCmportEnterprisestatementResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListCmportEnterprisestatementResponse{}
	_body, _err := client.ListCmportEnterprisestatementEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分润对账，企业到当前记账日期的累计利润信息
 * Summary: 企业分润对账单
 */
func (client *Client) ListCmportEnterprisestatementEx(request *ListCmportEnterprisestatementRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListCmportEnterprisestatementResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListCmportEnterprisestatementResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.cmport.enterprisestatement.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户对账单
 * Summary: 用户对账单
 */
func (client *Client) ListCmportUserstatement(request *ListCmportUserstatementRequest) (_result *ListCmportUserstatementResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListCmportUserstatementResponse{}
	_body, _err := client.ListCmportUserstatementEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户对账单
 * Summary: 用户对账单
 */
func (client *Client) ListCmportUserstatementEx(request *ListCmportUserstatementRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListCmportUserstatementResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListCmportUserstatementResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.cmport.userstatement.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户明细清单
 * Summary: 用户明细清单
 */
func (client *Client) ListCmportUserprofit(request *ListCmportUserprofitRequest) (_result *ListCmportUserprofitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListCmportUserprofitResponse{}
	_body, _err := client.ListCmportUserprofitEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户明细清单
 * Summary: 用户明细清单
 */
func (client *Client) ListCmportUserprofitEx(request *ListCmportUserprofitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListCmportUserprofitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListCmportUserprofitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.cmport.userprofit.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 还款本息查询
 * Summary: 还款本息查询
 */
func (client *Client) QueryCmportBankfee(request *QueryCmportBankfeeRequest) (_result *QueryCmportBankfeeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCmportBankfeeResponse{}
	_body, _err := client.QueryCmportBankfeeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 还款本息查询
 * Summary: 还款本息查询
 */
func (client *Client) QueryCmportBankfeeEx(request *QueryCmportBankfeeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCmportBankfeeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCmportBankfeeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.cmport.bankfee.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建分润归属配置
 * Summary: 创建分润归属配置
 */
func (client *Client) CreateCmportProfitpartner(request *CreateCmportProfitpartnerRequest) (_result *CreateCmportProfitpartnerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateCmportProfitpartnerResponse{}
	_body, _err := client.CreateCmportProfitpartnerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建分润归属配置
 * Summary: 创建分润归属配置
 */
func (client *Client) CreateCmportProfitpartnerEx(request *CreateCmportProfitpartnerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateCmportProfitpartnerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateCmportProfitpartnerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.cmport.profitpartner.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 监管方（粮达网）撤销融资申请
 * Summary: 撤销融资申请
 */
func (client *Client) CancelCmportFinance(request *CancelCmportFinanceRequest) (_result *CancelCmportFinanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelCmportFinanceResponse{}
	_body, _err := client.CancelCmportFinanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 监管方（粮达网）撤销融资申请
 * Summary: 撤销融资申请
 */
func (client *Client) CancelCmportFinanceEx(request *CancelCmportFinanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelCmportFinanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelCmportFinanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.cmport.finance.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 银行融资审核结果同步
 * Summary: 银行融资审核结果同步
 */
func (client *Client) NotifyCmportBank(request *NotifyCmportBankRequest) (_result *NotifyCmportBankResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &NotifyCmportBankResponse{}
	_body, _err := client.NotifyCmportBankEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 银行融资审核结果同步
 * Summary: 银行融资审核结果同步
 */
func (client *Client) NotifyCmportBankEx(request *NotifyCmportBankRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *NotifyCmportBankResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &NotifyCmportBankResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.cmport.bank.notify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 银行放款结果同步给区块链
 * Summary: 银行放款结果同步给区块链
 */
func (client *Client) NotifyCmportLoan(request *NotifyCmportLoanRequest) (_result *NotifyCmportLoanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &NotifyCmportLoanResponse{}
	_body, _err := client.NotifyCmportLoanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 银行放款结果同步给区块链
 * Summary: 银行放款结果同步给区块链
 */
func (client *Client) NotifyCmportLoanEx(request *NotifyCmportLoanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *NotifyCmportLoanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &NotifyCmportLoanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.cmport.loan.notify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 还款结果同步给区块链
 * Summary: 还款结果同步给区块链
 */
func (client *Client) NotifyCmportRepay(request *NotifyCmportRepayRequest) (_result *NotifyCmportRepayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &NotifyCmportRepayResponse{}
	_body, _err := client.NotifyCmportRepayEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 还款结果同步给区块链
 * Summary: 还款结果同步给区块链
 */
func (client *Client) NotifyCmportRepayEx(request *NotifyCmportRepayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *NotifyCmportRepayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &NotifyCmportRepayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.cmport.repay.notify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 还款本息查询-分页
 * Summary: 还款本息查询-分页
 */
func (client *Client) ListCmportBankfee(request *ListCmportBankfeeRequest) (_result *ListCmportBankfeeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListCmportBankfeeResponse{}
	_body, _err := client.ListCmportBankfeeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 还款本息查询-分页
 * Summary: 还款本息查询-分页
 */
func (client *Client) ListCmportBankfeeEx(request *ListCmportBankfeeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListCmportBankfeeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListCmportBankfeeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.cmport.bankfee.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 物流轨迹同步给区块链
 * Summary: 物流轨迹同步给区块链
 */
func (client *Client) NotifyCmportLogistics(request *NotifyCmportLogisticsRequest) (_result *NotifyCmportLogisticsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &NotifyCmportLogisticsResponse{}
	_body, _err := client.NotifyCmportLogisticsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 物流轨迹同步给区块链
 * Summary: 物流轨迹同步给区块链
 */
func (client *Client) NotifyCmportLogisticsEx(request *NotifyCmportLogisticsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *NotifyCmportLogisticsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &NotifyCmportLogisticsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.propertychain.cmport.logistics.notify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
