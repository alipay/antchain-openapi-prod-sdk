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

// 文件信息
type FileInfo struct {
	// 文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 文件key
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty" require:"true"`
}

func (s FileInfo) String() string {
	return tea.Prettify(s)
}

func (s FileInfo) GoString() string {
	return s.String()
}

func (s *FileInfo) SetFileName(v string) *FileInfo {
	s.FileName = &v
	return s
}

func (s *FileInfo) SetFileKey(v string) *FileInfo {
	s.FileKey = &v
	return s
}

// 订单所有商品信息模型
type ScalperQueryOrderItem struct {
	// 订单商品名称
	OrderItemsName *string `json:"order_items_name,omitempty" xml:"order_items_name,omitempty" maxLength:"256" minLength:"1"`
	// 订单商品数量
	OrderItemsQuantity *int64 `json:"order_items_quantity,omitempty" xml:"order_items_quantity,omitempty" maximum:"100000" minimum:"1"`
	// 订单商品价格，单位：分
	OrderItemsPrice *int64 `json:"order_items_price,omitempty" xml:"order_items_price,omitempty" maximum:"10000000" minimum:"1"`
}

func (s ScalperQueryOrderItem) String() string {
	return tea.Prettify(s)
}

func (s ScalperQueryOrderItem) GoString() string {
	return s.String()
}

func (s *ScalperQueryOrderItem) SetOrderItemsName(v string) *ScalperQueryOrderItem {
	s.OrderItemsName = &v
	return s
}

func (s *ScalperQueryOrderItem) SetOrderItemsQuantity(v int64) *ScalperQueryOrderItem {
	s.OrderItemsQuantity = &v
	return s
}

func (s *ScalperQueryOrderItem) SetOrderItemsPrice(v int64) *ScalperQueryOrderItem {
	s.OrderItemsPrice = &v
	return s
}

// 经营分账收入方详情信息(商户控制台订单详情用)
type OperationDivideTransInDetailInfo struct {
	// 分账收入方名称
	TransInName *string `json:"trans_in_name,omitempty" xml:"trans_in_name,omitempty"`
	// 分账收入方支付宝用户id, 支付宝2088id
	TransInUserId *string `json:"trans_in_user_id,omitempty" xml:"trans_in_user_id,omitempty"`
	// 分账金额，单位为分
	DivideAmount *int64 `json:"divide_amount,omitempty" xml:"divide_amount,omitempty"`
	// 分账描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
	// INIT("INIT", "初始化"),
	// PROCESSING("PROCESSING", "处理中"),
	// FAILED("FAILED", "失败"),
	// SUCCESS("SUCCESS", "分账成功");
	DivideStatus *string `json:"divide_status,omitempty" xml:"divide_status,omitempty"`
}

func (s OperationDivideTransInDetailInfo) String() string {
	return tea.Prettify(s)
}

func (s OperationDivideTransInDetailInfo) GoString() string {
	return s.String()
}

func (s *OperationDivideTransInDetailInfo) SetTransInName(v string) *OperationDivideTransInDetailInfo {
	s.TransInName = &v
	return s
}

func (s *OperationDivideTransInDetailInfo) SetTransInUserId(v string) *OperationDivideTransInDetailInfo {
	s.TransInUserId = &v
	return s
}

func (s *OperationDivideTransInDetailInfo) SetDivideAmount(v int64) *OperationDivideTransInDetailInfo {
	s.DivideAmount = &v
	return s
}

func (s *OperationDivideTransInDetailInfo) SetDesc(v string) *OperationDivideTransInDetailInfo {
	s.Desc = &v
	return s
}

func (s *OperationDivideTransInDetailInfo) SetDivideStatus(v string) *OperationDivideTransInDetailInfo {
	s.DivideStatus = &v
	return s
}

// 智租风控-子风险项
type SubRentRiskItem struct {
	// 风险名称。枚举值：BASE_PERFORMANCE - 基础履约风险；OVERDUE - 逾期风险；MULTI_RENT - 共租风险。
	RiskName *string `json:"risk_name,omitempty" xml:"risk_name,omitempty" require:"true"`
	// 风险等级。枚举值：RANK0-无法判断；RANK1-极低风险；RANK2-低风险；RANK3-中风险；RANK4-高风险；RANK5-极高风险。
	RiskRank *string `json:"risk_rank,omitempty" xml:"risk_rank,omitempty" require:"true"`
	// 风险描述
	RiskDesc *string `json:"risk_desc,omitempty" xml:"risk_desc,omitempty" require:"true"`
}

func (s SubRentRiskItem) String() string {
	return tea.Prettify(s)
}

func (s SubRentRiskItem) GoString() string {
	return s.String()
}

func (s *SubRentRiskItem) SetRiskName(v string) *SubRentRiskItem {
	s.RiskName = &v
	return s
}

func (s *SubRentRiskItem) SetRiskRank(v string) *SubRentRiskItem {
	s.RiskRank = &v
	return s
}

func (s *SubRentRiskItem) SetRiskDesc(v string) *SubRentRiskItem {
	s.RiskDesc = &v
	return s
}

// 订单还款策略
type OrderRepayStrategy struct {
	// 还款期数
	TermIndex *int64 `json:"term_index,omitempty" xml:"term_index,omitempty"`
	// 每期应还租金(分)
	RentalMoney *int64 `json:"rental_money,omitempty" xml:"rental_money,omitempty"`
	// 每期应付时间
	PayDay *string `json:"pay_day,omitempty" xml:"pay_day,omitempty"`
}

func (s OrderRepayStrategy) String() string {
	return tea.Prettify(s)
}

func (s OrderRepayStrategy) GoString() string {
	return s.String()
}

func (s *OrderRepayStrategy) SetTermIndex(v int64) *OrderRepayStrategy {
	s.TermIndex = &v
	return s
}

func (s *OrderRepayStrategy) SetRentalMoney(v int64) *OrderRepayStrategy {
	s.RentalMoney = &v
	return s
}

func (s *OrderRepayStrategy) SetPayDay(v string) *OrderRepayStrategy {
	s.PayDay = &v
	return s
}

// 静态数据模块详情
type StaticDataModuleDetail struct {
	// 描述
	PropertyText *string `json:"property_text,omitempty" xml:"property_text,omitempty" require:"true"`
	// 商户类型
	PropertyValue *string `json:"property_value,omitempty" xml:"property_value,omitempty" require:"true"`
	// 图标
	Icon *string `json:"icon,omitempty" xml:"icon,omitempty"`
	// 置灰图标
	GreyIcon *string `json:"grey_icon,omitempty" xml:"grey_icon,omitempty"`
	// 叶子结点，目前存的一级类目下的二级类目
	ChildrenDetailList *string `json:"children_detail_list,omitempty" xml:"children_detail_list,omitempty"`
	// 是否有叶子结点
	HasChildren *bool `json:"has_children,omitempty" xml:"has_children,omitempty"`
}

func (s StaticDataModuleDetail) String() string {
	return tea.Prettify(s)
}

func (s StaticDataModuleDetail) GoString() string {
	return s.String()
}

func (s *StaticDataModuleDetail) SetPropertyText(v string) *StaticDataModuleDetail {
	s.PropertyText = &v
	return s
}

func (s *StaticDataModuleDetail) SetPropertyValue(v string) *StaticDataModuleDetail {
	s.PropertyValue = &v
	return s
}

func (s *StaticDataModuleDetail) SetIcon(v string) *StaticDataModuleDetail {
	s.Icon = &v
	return s
}

func (s *StaticDataModuleDetail) SetGreyIcon(v string) *StaticDataModuleDetail {
	s.GreyIcon = &v
	return s
}

func (s *StaticDataModuleDetail) SetChildrenDetailList(v string) *StaticDataModuleDetail {
	s.ChildrenDetailList = &v
	return s
}

func (s *StaticDataModuleDetail) SetHasChildren(v bool) *StaticDataModuleDetail {
	s.HasChildren = &v
	return s
}

// 站点信息
type SiteInfo struct {
	// 小程序id
	TinyAppId *string `json:"tiny_app_id,omitempty" xml:"tiny_app_id,omitempty"`
	// 站点名称
	SiteName *string `json:"site_name,omitempty" xml:"site_name,omitempty"`
	//
	// 截图照片
	ScreenshotFile *FileInfo `json:"screenshot_file,omitempty" xml:"screenshot_file,omitempty"`
	// 站点地址
	SiteUrl *string `json:"site_url,omitempty" xml:"site_url,omitempty"`
	// 站点类型
	// 网站: 01
	// APP: 02
	// 服务窗: 03
	// 公众号: 04
	// 其他: 05
	// 支付宝小程序: 06
	// 手机网站/H5: 07
	SiteType *string `json:"site_type,omitempty" xml:"site_type,omitempty"`
}

func (s SiteInfo) String() string {
	return tea.Prettify(s)
}

func (s SiteInfo) GoString() string {
	return s.String()
}

func (s *SiteInfo) SetTinyAppId(v string) *SiteInfo {
	s.TinyAppId = &v
	return s
}

func (s *SiteInfo) SetSiteName(v string) *SiteInfo {
	s.SiteName = &v
	return s
}

func (s *SiteInfo) SetScreenshotFile(v *FileInfo) *SiteInfo {
	s.ScreenshotFile = v
	return s
}

func (s *SiteInfo) SetSiteUrl(v string) *SiteInfo {
	s.SiteUrl = &v
	return s
}

func (s *SiteInfo) SetSiteType(v string) *SiteInfo {
	s.SiteType = &v
	return s
}

// 智租风控模型结构体
type AppletRiskModel struct {
	// 智租风控调用结果码，10000 表示调用成功。
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 风险咨询事件ID
	RecordId *string `json:"record_id,omitempty" xml:"record_id,omitempty" require:"true"`
	// 风险等级。枚举值：RANK0-无法判断；RANK1-极低风险；RANK2-低风险；RANK3-中风险；RANK4-高风险；RANK5-极高风险
	RiskRank *string `json:"risk_rank,omitempty" xml:"risk_rank,omitempty" require:"true"`
	// 风险名称
	RiskName *string `json:"risk_name,omitempty" xml:"risk_name,omitempty" require:"true"`
	// 风险等级中文描述
	RiskDesc *string `json:"risk_desc,omitempty" xml:"risk_desc,omitempty" require:"true"`
	// 流程id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	// 子风险结果列表
	SubRiskResultList []*SubRentRiskItem `json:"sub_risk_result_list,omitempty" xml:"sub_risk_result_list,omitempty" type:"Repeated"`
	// 调用失败错误提示信息，仅调用失败时返回该字段信息。
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
}

func (s AppletRiskModel) String() string {
	return tea.Prettify(s)
}

func (s AppletRiskModel) GoString() string {
	return s.String()
}

func (s *AppletRiskModel) SetCode(v string) *AppletRiskModel {
	s.Code = &v
	return s
}

func (s *AppletRiskModel) SetRecordId(v string) *AppletRiskModel {
	s.RecordId = &v
	return s
}

func (s *AppletRiskModel) SetRiskRank(v string) *AppletRiskModel {
	s.RiskRank = &v
	return s
}

func (s *AppletRiskModel) SetRiskName(v string) *AppletRiskModel {
	s.RiskName = &v
	return s
}

func (s *AppletRiskModel) SetRiskDesc(v string) *AppletRiskModel {
	s.RiskDesc = &v
	return s
}

func (s *AppletRiskModel) SetFlowId(v string) *AppletRiskModel {
	s.FlowId = &v
	return s
}

func (s *AppletRiskModel) SetSubRiskResultList(v []*SubRentRiskItem) *AppletRiskModel {
	s.SubRiskResultList = v
	return s
}

func (s *AppletRiskModel) SetErrorMsg(v string) *AppletRiskModel {
	s.ErrorMsg = &v
	return s
}

// 分账关系绑定收入方信息
type DivideBindingTransInInfo struct {
	// 分账方支付宝pid
	AlipayPid *string `json:"alipay_pid,omitempty" xml:"alipay_pid,omitempty" require:"true"`
}

func (s DivideBindingTransInInfo) String() string {
	return tea.Prettify(s)
}

func (s DivideBindingTransInInfo) GoString() string {
	return s.String()
}

func (s *DivideBindingTransInInfo) SetAlipayPid(v string) *DivideBindingTransInInfo {
	s.AlipayPid = &v
	return s
}

// 投保商品信息
type InsureProductInfo struct {
	// 商品库id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty" require:"true" maxLength:"128"`
	// 商品设备编号
	ProductImeiId *string `json:"product_imei_id,omitempty" xml:"product_imei_id,omitempty" require:"true" maxLength:"256"`
	// 商品采购价，单位：分
	PurchaseAmount *int64 `json:"purchase_amount,omitempty" xml:"purchase_amount,omitempty" require:"true" maximum:"100000000"`
}

func (s InsureProductInfo) String() string {
	return tea.Prettify(s)
}

func (s InsureProductInfo) GoString() string {
	return s.String()
}

func (s *InsureProductInfo) SetProductId(v string) *InsureProductInfo {
	s.ProductId = &v
	return s
}

func (s *InsureProductInfo) SetProductImeiId(v string) *InsureProductInfo {
	s.ProductImeiId = &v
	return s
}

func (s *InsureProductInfo) SetPurchaseAmount(v int64) *InsureProductInfo {
	s.PurchaseAmount = &v
	return s
}

// 模板组件（文本域）
type TemplateComponent struct {
	// 模板编码
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 组件（文本域）id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 组件（文本域）名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 组件（文本域）的唯一标识
	Uk *string `json:"uk,omitempty" xml:"uk,omitempty"`
	// 占位符，组件（文本域）的展示样式值
	Placeholder *string `json:"placeholder,omitempty" xml:"placeholder,omitempty"`
	// 组件（文本域）是否可以编辑。取值：Y/N
	EnableEdit *string `json:"enable_edit,omitempty" xml:"enable_edit,omitempty"`
	// 是否必填，取值：Y/N
	Required *string `json:"required,omitempty" xml:"required,omitempty"`
	// 组件（文本域）类型，INPUT:单行文本 TEXTAREA:多行文本
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 组件（文本域）值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s TemplateComponent) String() string {
	return tea.Prettify(s)
}

func (s TemplateComponent) GoString() string {
	return s.String()
}

func (s *TemplateComponent) SetTemplateCode(v string) *TemplateComponent {
	s.TemplateCode = &v
	return s
}

func (s *TemplateComponent) SetId(v string) *TemplateComponent {
	s.Id = &v
	return s
}

func (s *TemplateComponent) SetName(v string) *TemplateComponent {
	s.Name = &v
	return s
}

func (s *TemplateComponent) SetUk(v string) *TemplateComponent {
	s.Uk = &v
	return s
}

func (s *TemplateComponent) SetPlaceholder(v string) *TemplateComponent {
	s.Placeholder = &v
	return s
}

func (s *TemplateComponent) SetEnableEdit(v string) *TemplateComponent {
	s.EnableEdit = &v
	return s
}

func (s *TemplateComponent) SetRequired(v string) *TemplateComponent {
	s.Required = &v
	return s
}

func (s *TemplateComponent) SetType(v string) *TemplateComponent {
	s.Type = &v
	return s
}

func (s *TemplateComponent) SetValue(v string) *TemplateComponent {
	s.Value = &v
	return s
}

// 静态数据
type StaticData struct {
	// 商户类型
	ModuleName *string `json:"module_name,omitempty" xml:"module_name,omitempty" require:"true"`
	// 静态数据详情
	ModuleDetailList []*StaticDataModuleDetail `json:"module_detail_list,omitempty" xml:"module_detail_list,omitempty" require:"true" type:"Repeated"`
}

func (s StaticData) String() string {
	return tea.Prettify(s)
}

func (s StaticData) GoString() string {
	return s.String()
}

func (s *StaticData) SetModuleName(v string) *StaticData {
	s.ModuleName = &v
	return s
}

func (s *StaticData) SetModuleDetailList(v []*StaticDataModuleDetail) *StaticData {
	s.ModuleDetailList = v
	return s
}

// 进件分页对象
type MerchantAgentPage struct {
	// 进件id
	PayExpandId *string `json:"pay_expand_id,omitempty" xml:"pay_expand_id,omitempty" require:"true"`
	//
	// 代理企业名称
	AgentName *string `json:"agent_name,omitempty" xml:"agent_name,omitempty" require:"true"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 业务类型
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 进件审核状态 枚举
	PayExpandStatus *string `json:"pay_expand_status,omitempty" xml:"pay_expand_status,omitempty" require:"true"`
}

func (s MerchantAgentPage) String() string {
	return tea.Prettify(s)
}

func (s MerchantAgentPage) GoString() string {
	return s.String()
}

func (s *MerchantAgentPage) SetPayExpandId(v string) *MerchantAgentPage {
	s.PayExpandId = &v
	return s
}

func (s *MerchantAgentPage) SetAgentName(v string) *MerchantAgentPage {
	s.AgentName = &v
	return s
}

func (s *MerchantAgentPage) SetTenantId(v string) *MerchantAgentPage {
	s.TenantId = &v
	return s
}

func (s *MerchantAgentPage) SetBizType(v string) *MerchantAgentPage {
	s.BizType = &v
	return s
}

func (s *MerchantAgentPage) SetPayExpandStatus(v string) *MerchantAgentPage {
	s.PayExpandStatus = &v
	return s
}

// 主订单信息
type OrderInfo struct {
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 订单创建时间
	OrderCreateTime *string `json:"order_create_time,omitempty" xml:"order_create_time,omitempty"`
	// 订单支付时间
	OrderPayTime *string `json:"order_pay_time,omitempty" xml:"order_pay_time,omitempty"`
	// 租金总额(分)
	TotalRentMoney *int64 `json:"total_rent_money,omitempty" xml:"total_rent_money,omitempty"`
	// 租期
	RentTerm *int64 `json:"rent_term,omitempty" xml:"rent_term,omitempty"`
	// 租期单位
	RentUnit *string `json:"rent_unit,omitempty" xml:"rent_unit,omitempty"`
	// 订单状态
	OrderStatus *string `json:"order_status,omitempty" xml:"order_status,omitempty"`
	// 订单子状态
	OrderSubStatus *string `json:"order_sub_status,omitempty" xml:"order_sub_status,omitempty"`
	// 免押金额（分）
	DepositPrice *int64 `json:"deposit_price,omitempty" xml:"deposit_price,omitempty"`
	// 到期买断价(分)
	BuyOutPrice *int64 `json:"buy_out_price,omitempty" xml:"buy_out_price,omitempty"`
	// 物流方案
	LogisticType *string `json:"logistic_type,omitempty" xml:"logistic_type,omitempty"`
	// 到期形式
	// NA(0, "无意义"),
	// BUYOUT(1, "到期买断或归还"),
	// FREE_ON_RENT(2, "租满即送"),
	// RENEW_LEASE(3, "续租"),;
	DueMode *int64 `json:"due_mode,omitempty" xml:"due_mode,omitempty"`
	// 首付款金额(分)
	DownPayment *int64 `json:"down_payment,omitempty" xml:"down_payment,omitempty"`
}

func (s OrderInfo) String() string {
	return tea.Prettify(s)
}

func (s OrderInfo) GoString() string {
	return s.String()
}

func (s *OrderInfo) SetOrderId(v string) *OrderInfo {
	s.OrderId = &v
	return s
}

func (s *OrderInfo) SetOrderCreateTime(v string) *OrderInfo {
	s.OrderCreateTime = &v
	return s
}

func (s *OrderInfo) SetOrderPayTime(v string) *OrderInfo {
	s.OrderPayTime = &v
	return s
}

func (s *OrderInfo) SetTotalRentMoney(v int64) *OrderInfo {
	s.TotalRentMoney = &v
	return s
}

func (s *OrderInfo) SetRentTerm(v int64) *OrderInfo {
	s.RentTerm = &v
	return s
}

func (s *OrderInfo) SetRentUnit(v string) *OrderInfo {
	s.RentUnit = &v
	return s
}

func (s *OrderInfo) SetOrderStatus(v string) *OrderInfo {
	s.OrderStatus = &v
	return s
}

func (s *OrderInfo) SetOrderSubStatus(v string) *OrderInfo {
	s.OrderSubStatus = &v
	return s
}

func (s *OrderInfo) SetDepositPrice(v int64) *OrderInfo {
	s.DepositPrice = &v
	return s
}

func (s *OrderInfo) SetBuyOutPrice(v int64) *OrderInfo {
	s.BuyOutPrice = &v
	return s
}

func (s *OrderInfo) SetLogisticType(v string) *OrderInfo {
	s.LogisticType = &v
	return s
}

func (s *OrderInfo) SetDueMode(v int64) *OrderInfo {
	s.DueMode = &v
	return s
}

func (s *OrderInfo) SetDownPayment(v int64) *OrderInfo {
	s.DownPayment = &v
	return s
}

// 订单还款承诺
type OrderPromiseInfo struct {
	// 订单还款策略
	RepayStrategyList []*OrderRepayStrategy `json:"repay_strategy_list,omitempty" xml:"repay_strategy_list,omitempty" type:"Repeated"`
}

func (s OrderPromiseInfo) String() string {
	return tea.Prettify(s)
}

func (s OrderPromiseInfo) GoString() string {
	return s.String()
}

func (s *OrderPromiseInfo) SetRepayStrategyList(v []*OrderRepayStrategy) *OrderPromiseInfo {
	s.RepayStrategyList = v
	return s
}

// 通知信息
type NoticeInfo struct {
	// 通知id
	NoticeId *int64 `json:"notice_id,omitempty" xml:"notice_id,omitempty"`
	// 通知标题
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// 通知创建时间
	NoticeCreateTime *string `json:"notice_create_time,omitempty" xml:"notice_create_time,omitempty"`
	// 是否未读
	Unread *bool `json:"unread,omitempty" xml:"unread,omitempty"`
}

func (s NoticeInfo) String() string {
	return tea.Prettify(s)
}

func (s NoticeInfo) GoString() string {
	return s.String()
}

func (s *NoticeInfo) SetNoticeId(v int64) *NoticeInfo {
	s.NoticeId = &v
	return s
}

func (s *NoticeInfo) SetTitle(v string) *NoticeInfo {
	s.Title = &v
	return s
}

func (s *NoticeInfo) SetNoticeCreateTime(v string) *NoticeInfo {
	s.NoticeCreateTime = &v
	return s
}

func (s *NoticeInfo) SetUnread(v bool) *NoticeInfo {
	s.Unread = &v
	return s
}

// 审核信息
type AuditInfo struct {
	// 审核步骤
	Stage *string `json:"stage,omitempty" xml:"stage,omitempty" require:"true"`
	// 审核主体
	AuditSubject *string `json:"audit_subject,omitempty" xml:"audit_subject,omitempty" require:"true"`
	// 审核状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 审核时间
	ApplyDateStr *string `json:"apply_date_str,omitempty" xml:"apply_date_str,omitempty" require:"true"`
	// 审核失败描述
	FailReason *string `json:"fail_reason,omitempty" xml:"fail_reason,omitempty" require:"true"`
}

func (s AuditInfo) String() string {
	return tea.Prettify(s)
}

func (s AuditInfo) GoString() string {
	return s.String()
}

func (s *AuditInfo) SetStage(v string) *AuditInfo {
	s.Stage = &v
	return s
}

func (s *AuditInfo) SetAuditSubject(v string) *AuditInfo {
	s.AuditSubject = &v
	return s
}

func (s *AuditInfo) SetStatus(v string) *AuditInfo {
	s.Status = &v
	return s
}

func (s *AuditInfo) SetApplyDateStr(v string) *AuditInfo {
	s.ApplyDateStr = &v
	return s
}

func (s *AuditInfo) SetFailReason(v string) *AuditInfo {
	s.FailReason = &v
	return s
}

// 商品信息
type ProductInfo struct {
	// 商家社会统一信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// 商品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty"`
	// 商品id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
	// 商品规格
	ProductModel *string `json:"product_model,omitempty" xml:"product_model,omitempty"`
	// 商品版本
	ProductVersion *string `json:"product_version,omitempty" xml:"product_version,omitempty"`
	// 指导价(单位分)
	ProductPrice *int64 `json:"product_price,omitempty" xml:"product_price,omitempty"`
	// 一级类目
	MainClass *string `json:"main_class,omitempty" xml:"main_class,omitempty"`
	// 二级类目
	SubClass *string `json:"sub_class,omitempty" xml:"sub_class,omitempty"`
	// 品牌
	ProductBrand *string `json:"product_brand,omitempty" xml:"product_brand,omitempty"`
}

func (s ProductInfo) String() string {
	return tea.Prettify(s)
}

func (s ProductInfo) GoString() string {
	return s.String()
}

func (s *ProductInfo) SetMerchantId(v string) *ProductInfo {
	s.MerchantId = &v
	return s
}

func (s *ProductInfo) SetProductName(v string) *ProductInfo {
	s.ProductName = &v
	return s
}

func (s *ProductInfo) SetProductId(v string) *ProductInfo {
	s.ProductId = &v
	return s
}

func (s *ProductInfo) SetProductModel(v string) *ProductInfo {
	s.ProductModel = &v
	return s
}

func (s *ProductInfo) SetProductVersion(v string) *ProductInfo {
	s.ProductVersion = &v
	return s
}

func (s *ProductInfo) SetProductPrice(v int64) *ProductInfo {
	s.ProductPrice = &v
	return s
}

func (s *ProductInfo) SetMainClass(v string) *ProductInfo {
	s.MainClass = &v
	return s
}

func (s *ProductInfo) SetSubClass(v string) *ProductInfo {
	s.SubClass = &v
	return s
}

func (s *ProductInfo) SetProductBrand(v string) *ProductInfo {
	s.ProductBrand = &v
	return s
}

// 法人信息修改
type LegalInfoUpdate struct {
	// 法人名称
	LegalName *string `json:"legal_name,omitempty" xml:"legal_name,omitempty"`
	// 法人证件号
	LegalCertNo *string `json:"legal_cert_no,omitempty" xml:"legal_cert_no,omitempty"`
	// 法人证件正面
	LegalCertFrontFile *FileInfo `json:"legal_cert_front_file,omitempty" xml:"legal_cert_front_file,omitempty"`
	// 法人证件反面
	LegalCertBackFile *FileInfo `json:"legal_cert_back_file,omitempty" xml:"legal_cert_back_file,omitempty"`
}

func (s LegalInfoUpdate) String() string {
	return tea.Prettify(s)
}

func (s LegalInfoUpdate) GoString() string {
	return s.String()
}

func (s *LegalInfoUpdate) SetLegalName(v string) *LegalInfoUpdate {
	s.LegalName = &v
	return s
}

func (s *LegalInfoUpdate) SetLegalCertNo(v string) *LegalInfoUpdate {
	s.LegalCertNo = &v
	return s
}

func (s *LegalInfoUpdate) SetLegalCertFrontFile(v *FileInfo) *LegalInfoUpdate {
	s.LegalCertFrontFile = v
	return s
}

func (s *LegalInfoUpdate) SetLegalCertBackFile(v *FileInfo) *LegalInfoUpdate {
	s.LegalCertBackFile = v
	return s
}

// 订单还款计划
type PromiseInfo struct {
}

func (s PromiseInfo) String() string {
	return tea.Prettify(s)
}

func (s PromiseInfo) GoString() string {
	return s.String()
}

// 资产报告详情
type FundAssertReport struct {
	// 投放月份 (整月)
	DeliveryMonth *string `json:"delivery_month,omitempty" xml:"delivery_month,omitempty" require:"true"`
	// 账单金额
	TotalBillAmount *int64 `json:"total_bill_amount,omitempty" xml:"total_bill_amount,omitempty" require:"true"`
	// 平均期限
	AverageTerm *string `json:"average_term,omitempty" xml:"average_term,omitempty" require:"true"`
	// 状态为取消的账单金额
	CancelledBillAmount *int64 `json:"cancelled_bill_amount,omitempty" xml:"cancelled_bill_amount,omitempty" require:"true"`
	// 状态为逾期1天及以上的账单金额
	BillAmountOverdueBy1dayOrMore *int64 `json:"bill_amount_overdue_by_1day_or_more,omitempty" xml:"bill_amount_overdue_by_1day_or_more,omitempty" require:"true"`
	// 状态为逾期30天及以上的账单金额
	BillAmountOverdueBy30DaysOrMore *int64 `json:"bill_amount_overdue_by_30_days_or_more,omitempty" xml:"bill_amount_overdue_by_30_days_or_more,omitempty" require:"true"`
	// Y期的订单的账单金额
	TotalBillAmountYPeriod *int64 `json:"total_bill_amount_y_period,omitempty" xml:"total_bill_amount_y_period,omitempty" require:"true"`
	// 已到Y期订单中Y期平均期限(y期订单的平均期限)
	AverageTermYPeriod *string `json:"average_term_y_period,omitempty" xml:"average_term_y_period,omitempty" require:"true"`
	// Y期的订单中状态为取消的账单金额
	CancelledBillAmountYPeriod *int64 `json:"cancelled_bill_amount_y_period,omitempty" xml:"cancelled_bill_amount_y_period,omitempty" require:"true"`
	// Y期的订单中状态为逾期1天及以上的账单金额
	BillAmountOverdueBy1dayOrMoreYPeriod *int64 `json:"bill_amount_overdue_by_1day_or_more_y_period,omitempty" xml:"bill_amount_overdue_by_1day_or_more_y_period,omitempty" require:"true"`
	// Y期的订单中状态为逾期30天及以上的账单金额
	BillAmountOverdueBy30DaysOrMoreYPeriod *int64 `json:"bill_amount_overdue_by_30_days_or_more_y_period,omitempty" xml:"bill_amount_overdue_by_30_days_or_more_y_period,omitempty" require:"true"`
}

func (s FundAssertReport) String() string {
	return tea.Prettify(s)
}

func (s FundAssertReport) GoString() string {
	return s.String()
}

func (s *FundAssertReport) SetDeliveryMonth(v string) *FundAssertReport {
	s.DeliveryMonth = &v
	return s
}

func (s *FundAssertReport) SetTotalBillAmount(v int64) *FundAssertReport {
	s.TotalBillAmount = &v
	return s
}

func (s *FundAssertReport) SetAverageTerm(v string) *FundAssertReport {
	s.AverageTerm = &v
	return s
}

func (s *FundAssertReport) SetCancelledBillAmount(v int64) *FundAssertReport {
	s.CancelledBillAmount = &v
	return s
}

func (s *FundAssertReport) SetBillAmountOverdueBy1dayOrMore(v int64) *FundAssertReport {
	s.BillAmountOverdueBy1dayOrMore = &v
	return s
}

func (s *FundAssertReport) SetBillAmountOverdueBy30DaysOrMore(v int64) *FundAssertReport {
	s.BillAmountOverdueBy30DaysOrMore = &v
	return s
}

func (s *FundAssertReport) SetTotalBillAmountYPeriod(v int64) *FundAssertReport {
	s.TotalBillAmountYPeriod = &v
	return s
}

func (s *FundAssertReport) SetAverageTermYPeriod(v string) *FundAssertReport {
	s.AverageTermYPeriod = &v
	return s
}

func (s *FundAssertReport) SetCancelledBillAmountYPeriod(v int64) *FundAssertReport {
	s.CancelledBillAmountYPeriod = &v
	return s
}

func (s *FundAssertReport) SetBillAmountOverdueBy1dayOrMoreYPeriod(v int64) *FundAssertReport {
	s.BillAmountOverdueBy1dayOrMoreYPeriod = &v
	return s
}

func (s *FundAssertReport) SetBillAmountOverdueBy30DaysOrMoreYPeriod(v int64) *FundAssertReport {
	s.BillAmountOverdueBy30DaysOrMoreYPeriod = &v
	return s
}

// 客服信息
type CustomerServiceInfo struct {
	// 公司社会统一信息代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// 公司名称
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty"`
	// 处理类型:
	// MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
	// PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
	ProcessType *string `json:"process_type,omitempty" xml:"process_type,omitempty"`
}

func (s CustomerServiceInfo) String() string {
	return tea.Prettify(s)
}

func (s CustomerServiceInfo) GoString() string {
	return s.String()
}

func (s *CustomerServiceInfo) SetMerchantId(v string) *CustomerServiceInfo {
	s.MerchantId = &v
	return s
}

func (s *CustomerServiceInfo) SetMerchantName(v string) *CustomerServiceInfo {
	s.MerchantName = &v
	return s
}

func (s *CustomerServiceInfo) SetProcessType(v string) *CustomerServiceInfo {
	s.ProcessType = &v
	return s
}

// 经营分账收入模型
type OperationDivideTransInModel struct {
	// 分账收入方支付宝用户id, 支付宝2088id
	TransInUserId *string `json:"trans_in_user_id,omitempty" xml:"trans_in_user_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 分账金额，单位为分
	//
	DivideAmount *int64 `json:"divide_amount,omitempty" xml:"divide_amount,omitempty" require:"true" minimum:"1"`
	// 分账描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" maxLength:"64" minLength:"1"`
}

func (s OperationDivideTransInModel) String() string {
	return tea.Prettify(s)
}

func (s OperationDivideTransInModel) GoString() string {
	return s.String()
}

func (s *OperationDivideTransInModel) SetTransInUserId(v string) *OperationDivideTransInModel {
	s.TransInUserId = &v
	return s
}

func (s *OperationDivideTransInModel) SetDivideAmount(v int64) *OperationDivideTransInModel {
	s.DivideAmount = &v
	return s
}

func (s *OperationDivideTransInModel) SetDesc(v string) *OperationDivideTransInModel {
	s.Desc = &v
	return s
}

// 营销抢购风险识别入参模型
type PurchaseQueryModel struct {
	// 支付宝外部交易号
	OutOrderNo *string `json:"out_order_no,omitempty" xml:"out_order_no,omitempty" maxLength:"128" minLength:"1"`
	// 支付宝内部生成的交易号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" maxLength:"50" minLength:"1"`
	// 银行卡号
	BankCardNo *string `json:"bank_card_no,omitempty" xml:"bank_card_no,omitempty" maxLength:"52" minLength:"1"`
	// 公司名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" maxLength:"50" minLength:"1"`
	// 金额，用户购买或使用服务时产生的具体金额，单位：分
	SalesAmount *int64 `json:"sales_amount,omitempty" xml:"sales_amount,omitempty" maximum:"10000000" minimum:"1"`
}

func (s PurchaseQueryModel) String() string {
	return tea.Prettify(s)
}

func (s PurchaseQueryModel) GoString() string {
	return s.String()
}

func (s *PurchaseQueryModel) SetOutOrderNo(v string) *PurchaseQueryModel {
	s.OutOrderNo = &v
	return s
}

func (s *PurchaseQueryModel) SetOrderNo(v string) *PurchaseQueryModel {
	s.OrderNo = &v
	return s
}

func (s *PurchaseQueryModel) SetBankCardNo(v string) *PurchaseQueryModel {
	s.BankCardNo = &v
	return s
}

func (s *PurchaseQueryModel) SetCompanyName(v string) *PurchaseQueryModel {
	s.CompanyName = &v
	return s
}

func (s *PurchaseQueryModel) SetSalesAmount(v int64) *PurchaseQueryModel {
	s.SalesAmount = &v
	return s
}

// 经营分账信息
type OperateDivideInfo struct {
	// 当前用户履约的租期编号
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty"`
	// 经营分账收入方结果信息
	OperationDivideTransInList []*OperationDivideTransInDetailInfo `json:"operation_divide_trans_in_list,omitempty" xml:"operation_divide_trans_in_list,omitempty" type:"Repeated"`
}

func (s OperateDivideInfo) String() string {
	return tea.Prettify(s)
}

func (s OperateDivideInfo) GoString() string {
	return s.String()
}

func (s *OperateDivideInfo) SetPeriodNum(v int64) *OperateDivideInfo {
	s.PeriodNum = &v
	return s
}

func (s *OperateDivideInfo) SetOperationDivideTransInList(v []*OperationDivideTransInDetailInfo) *OperateDivideInfo {
	s.OperationDivideTransInList = v
	return s
}

// 订单履约
type OrderFulfillmentInfo struct {
	// 租期编号
	LeaseTermIndex *int64 `json:"lease_term_index,omitempty" xml:"lease_term_index,omitempty"`
	// 租期归还状态
	RentalReturnState *string `json:"rental_return_state,omitempty" xml:"rental_return_state,omitempty"`
	// 实际还款金额(分)
	RealRepayMoney *int64 `json:"real_repay_money,omitempty" xml:"real_repay_money,omitempty"`
	// 租金(分)
	RentalMoney *int64 `json:"rental_money,omitempty" xml:"rental_money,omitempty"`
	// 每期实付时间
	ReturnTime *string `json:"return_time,omitempty" xml:"return_time,omitempty"`
}

func (s OrderFulfillmentInfo) String() string {
	return tea.Prettify(s)
}

func (s OrderFulfillmentInfo) GoString() string {
	return s.String()
}

func (s *OrderFulfillmentInfo) SetLeaseTermIndex(v int64) *OrderFulfillmentInfo {
	s.LeaseTermIndex = &v
	return s
}

func (s *OrderFulfillmentInfo) SetRentalReturnState(v string) *OrderFulfillmentInfo {
	s.RentalReturnState = &v
	return s
}

func (s *OrderFulfillmentInfo) SetRealRepayMoney(v int64) *OrderFulfillmentInfo {
	s.RealRepayMoney = &v
	return s
}

func (s *OrderFulfillmentInfo) SetRentalMoney(v int64) *OrderFulfillmentInfo {
	s.RentalMoney = &v
	return s
}

func (s *OrderFulfillmentInfo) SetReturnTime(v string) *OrderFulfillmentInfo {
	s.ReturnTime = &v
	return s
}

// 风险场景的决策结果
type RiskScene struct {
	// 风险场景编码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 该场景的风险决策结果
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty" require:"true"`
}

func (s RiskScene) String() string {
	return tea.Prettify(s)
}

func (s RiskScene) GoString() string {
	return s.String()
}

func (s *RiskScene) SetSceneCode(v string) *RiskScene {
	s.SceneCode = &v
	return s
}

func (s *RiskScene) SetDecision(v string) *RiskScene {
	s.Decision = &v
	return s
}

// 分账关系页对象
type RelationPage struct {
	// 分账关系id
	RelationId *string `json:"relation_id,omitempty" xml:"relation_id,omitempty" require:"true"`
	// 分账公司名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" require:"true"`
	// 分账公司名称统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 审核状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 商户公司统一社会信用代码
	SubjectMerchantId *string `json:"subject_merchant_id,omitempty" xml:"subject_merchant_id,omitempty" require:"true"`
	// 商户公司名称
	SubjectCompanyName *string `json:"subject_company_name,omitempty" xml:"subject_company_name,omitempty" require:"true"`
}

func (s RelationPage) String() string {
	return tea.Prettify(s)
}

func (s RelationPage) GoString() string {
	return s.String()
}

func (s *RelationPage) SetRelationId(v string) *RelationPage {
	s.RelationId = &v
	return s
}

func (s *RelationPage) SetCompanyName(v string) *RelationPage {
	s.CompanyName = &v
	return s
}

func (s *RelationPage) SetMerchantId(v string) *RelationPage {
	s.MerchantId = &v
	return s
}

func (s *RelationPage) SetStatus(v string) *RelationPage {
	s.Status = &v
	return s
}

func (s *RelationPage) SetSubjectMerchantId(v string) *RelationPage {
	s.SubjectMerchantId = &v
	return s
}

func (s *RelationPage) SetSubjectCompanyName(v string) *RelationPage {
	s.SubjectCompanyName = &v
	return s
}

// 行业履约风险识别入参模型
type BaddebtQueryModel struct {
	// 服务分类，服务二级分类
	ServiceCategory *string `json:"service_category,omitempty" xml:"service_category,omitempty" maxLength:"128" minLength:"1"`
	// 总金额，用户购买或使用服务时产生的具体金额
	TotalAmount *int64 `json:"total_amount,omitempty" xml:"total_amount,omitempty" maximum:"10000000" minimum:"1"`
	// 商品数量，用户购买或使用服务时产生的具体商品数量
	TotalQuantity *int64 `json:"total_quantity,omitempty" xml:"total_quantity,omitempty" maximum:"10000" minimum:"1"`
	// 用户姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" maxLength:"128" minLength:"1"`
	// 服务商 pid
	IsvPid *string `json:"isv_pid,omitempty" xml:"isv_pid,omitempty" maxLength:"128" minLength:"1"`
	// 终端唯一标识
	Apdid *string `json:"apdid,omitempty" xml:"apdid,omitempty" maxLength:"128" minLength:"1"`
}

func (s BaddebtQueryModel) String() string {
	return tea.Prettify(s)
}

func (s BaddebtQueryModel) GoString() string {
	return s.String()
}

func (s *BaddebtQueryModel) SetServiceCategory(v string) *BaddebtQueryModel {
	s.ServiceCategory = &v
	return s
}

func (s *BaddebtQueryModel) SetTotalAmount(v int64) *BaddebtQueryModel {
	s.TotalAmount = &v
	return s
}

func (s *BaddebtQueryModel) SetTotalQuantity(v int64) *BaddebtQueryModel {
	s.TotalQuantity = &v
	return s
}

func (s *BaddebtQueryModel) SetUserName(v string) *BaddebtQueryModel {
	s.UserName = &v
	return s
}

func (s *BaddebtQueryModel) SetIsvPid(v string) *BaddebtQueryModel {
	s.IsvPid = &v
	return s
}

func (s *BaddebtQueryModel) SetApdid(v string) *BaddebtQueryModel {
	s.Apdid = &v
	return s
}

//  公司信息修改
type CompanyInfoUpdate struct {
	// 营业执照文件信息
	BusinessLicenseFile *FileInfo `json:"business_license_file,omitempty" xml:"business_license_file,omitempty"`
	// 业务类型 枚举
	ProductMainClass *string `json:"product_main_class,omitempty" xml:"product_main_class,omitempty"`
	// 公司名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty"`
	// 公司别名
	CompanyAliasName *string `json:"company_alias_name,omitempty" xml:"company_alias_name,omitempty"`
	// 公司数科租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 公司联系电话
	CompanyMobile *string `json:"company_mobile,omitempty" xml:"company_mobile,omitempty"`
	// 公司联系地址
	CompanyAddress *string `json:"company_address,omitempty" xml:"company_address,omitempty"`
	// 联系人姓名
	ContactName *string `json:"contact_name,omitempty" xml:"contact_name,omitempty"`
	// 联系人手机号码
	ContactMobile *string `json:"contact_mobile,omitempty" xml:"contact_mobile,omitempty"`
	// 商户类型： 01：企业；07：个体工商户 默认不填为01
	MerchantType *string `json:"merchant_type,omitempty" xml:"merchant_type,omitempty"`
}

func (s CompanyInfoUpdate) String() string {
	return tea.Prettify(s)
}

func (s CompanyInfoUpdate) GoString() string {
	return s.String()
}

func (s *CompanyInfoUpdate) SetBusinessLicenseFile(v *FileInfo) *CompanyInfoUpdate {
	s.BusinessLicenseFile = v
	return s
}

func (s *CompanyInfoUpdate) SetProductMainClass(v string) *CompanyInfoUpdate {
	s.ProductMainClass = &v
	return s
}

func (s *CompanyInfoUpdate) SetCompanyName(v string) *CompanyInfoUpdate {
	s.CompanyName = &v
	return s
}

func (s *CompanyInfoUpdate) SetCompanyAliasName(v string) *CompanyInfoUpdate {
	s.CompanyAliasName = &v
	return s
}

func (s *CompanyInfoUpdate) SetTenantId(v string) *CompanyInfoUpdate {
	s.TenantId = &v
	return s
}

func (s *CompanyInfoUpdate) SetCompanyMobile(v string) *CompanyInfoUpdate {
	s.CompanyMobile = &v
	return s
}

func (s *CompanyInfoUpdate) SetCompanyAddress(v string) *CompanyInfoUpdate {
	s.CompanyAddress = &v
	return s
}

func (s *CompanyInfoUpdate) SetContactName(v string) *CompanyInfoUpdate {
	s.ContactName = &v
	return s
}

func (s *CompanyInfoUpdate) SetContactMobile(v string) *CompanyInfoUpdate {
	s.ContactMobile = &v
	return s
}

func (s *CompanyInfoUpdate) SetMerchantType(v string) *CompanyInfoUpdate {
	s.MerchantType = &v
	return s
}

// 订单搜索信息
type OrderSearchInfo struct {
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 支付宝代扣协议号
	AgreementNo *string `json:"agreement_no,omitempty" xml:"agreement_no,omitempty"`
	// 订单创建时间
	OrderCreateTime *string `json:"order_create_time,omitempty" xml:"order_create_time,omitempty"`
	// 租金总额（单位分）
	TotalRentMoney *int64 `json:"total_rent_money,omitempty" xml:"total_rent_money,omitempty"`
	// 租期
	RentTerm *int64 `json:"rent_term,omitempty" xml:"rent_term,omitempty"`
	// 租期单位
	RentUnit *string `json:"rent_unit,omitempty" xml:"rent_unit,omitempty"`
	// 订单状态
	OrderStatus *string `json:"order_status,omitempty" xml:"order_status,omitempty"`
	// 承租人名称
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
	// 承租人手机号
	UserPhoneNumber *string `json:"user_phone_number,omitempty" xml:"user_phone_number,omitempty"`
}

func (s OrderSearchInfo) String() string {
	return tea.Prettify(s)
}

func (s OrderSearchInfo) GoString() string {
	return s.String()
}

func (s *OrderSearchInfo) SetOrderId(v string) *OrderSearchInfo {
	s.OrderId = &v
	return s
}

func (s *OrderSearchInfo) SetAgreementNo(v string) *OrderSearchInfo {
	s.AgreementNo = &v
	return s
}

func (s *OrderSearchInfo) SetOrderCreateTime(v string) *OrderSearchInfo {
	s.OrderCreateTime = &v
	return s
}

func (s *OrderSearchInfo) SetTotalRentMoney(v int64) *OrderSearchInfo {
	s.TotalRentMoney = &v
	return s
}

func (s *OrderSearchInfo) SetRentTerm(v int64) *OrderSearchInfo {
	s.RentTerm = &v
	return s
}

func (s *OrderSearchInfo) SetRentUnit(v string) *OrderSearchInfo {
	s.RentUnit = &v
	return s
}

func (s *OrderSearchInfo) SetOrderStatus(v string) *OrderSearchInfo {
	s.OrderStatus = &v
	return s
}

func (s *OrderSearchInfo) SetUserName(v string) *OrderSearchInfo {
	s.UserName = &v
	return s
}

func (s *OrderSearchInfo) SetUserPhoneNumber(v string) *OrderSearchInfo {
	s.UserPhoneNumber = &v
	return s
}

// 应用信息
type ApplicationInfo struct {
	// 应用场景
	// MINI_APP 小程序
	// APP 自有app
	// ALL 两种都有
	ApplicationScene *string `json:"application_scene,omitempty" xml:"application_scene,omitempty" require:"true"`
	// 小程序id
	TinyAppId *string `json:"tiny_app_id,omitempty" xml:"tiny_app_id,omitempty" require:"true"`
	// 小程序名称
	SiteName *string `json:"site_name,omitempty" xml:"site_name,omitempty" require:"true"`
	// 网站地址
	SitUrl *string `json:"sit_url,omitempty" xml:"sit_url,omitempty" require:"true"`
	// 商户名称。
	// 修改后的商户名称，将同步支付宝代扣签约页面字段展示
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty" require:"true"`
	// 商户服务名称。
	// 修改后的商户服务名称，将同步支付宝代扣签约页面字段展示
	MerchantServiceName *string `json:"merchant_service_name,omitempty" xml:"merchant_service_name,omitempty" require:"true"`
	// 商户服务描述。
	// 修改后的商户服务描述，将同步支付宝代扣签约页面字段展示
	MerchantServiceDesc *string `json:"merchant_service_desc,omitempty" xml:"merchant_service_desc,omitempty" require:"true"`
	// 站点信息
	SiteInfo []*SiteInfo `json:"site_info,omitempty" xml:"site_info,omitempty" type:"Repeated"`
}

func (s ApplicationInfo) String() string {
	return tea.Prettify(s)
}

func (s ApplicationInfo) GoString() string {
	return s.String()
}

func (s *ApplicationInfo) SetApplicationScene(v string) *ApplicationInfo {
	s.ApplicationScene = &v
	return s
}

func (s *ApplicationInfo) SetTinyAppId(v string) *ApplicationInfo {
	s.TinyAppId = &v
	return s
}

func (s *ApplicationInfo) SetSiteName(v string) *ApplicationInfo {
	s.SiteName = &v
	return s
}

func (s *ApplicationInfo) SetSitUrl(v string) *ApplicationInfo {
	s.SitUrl = &v
	return s
}

func (s *ApplicationInfo) SetMerchantName(v string) *ApplicationInfo {
	s.MerchantName = &v
	return s
}

func (s *ApplicationInfo) SetMerchantServiceName(v string) *ApplicationInfo {
	s.MerchantServiceName = &v
	return s
}

func (s *ApplicationInfo) SetMerchantServiceDesc(v string) *ApplicationInfo {
	s.MerchantServiceDesc = &v
	return s
}

func (s *ApplicationInfo) SetSiteInfo(v []*SiteInfo) *ApplicationInfo {
	s.SiteInfo = v
	return s
}

// 智租风控-商品详情
type ItemDetail struct {
	// 租赁商品类目，可选类型：
	// RENT_PHONE - 手机租赁；RENT_COMPUTER - 电脑/平板租赁；RENT_CAMERA - 数码摄像租赁；RENT_DIGITAL - 数码其他租赁；RENT_STATIONERY - 电子词典/电纸书/文化用品租赁；RENT_CLOTHING - 服装租赁
	GoodsCategory *string `json:"goods_category,omitempty" xml:"goods_category,omitempty" maxLength:"30"`
	// 租赁商品名称
	ItemName *string `json:"item_name,omitempty" xml:"item_name,omitempty" maxLength:"128"`
	// 租赁商品数量
	Quantity *int64 `json:"quantity,omitempty" xml:"quantity,omitempty" maximum:"10000"`
}

func (s ItemDetail) String() string {
	return tea.Prettify(s)
}

func (s ItemDetail) GoString() string {
	return s.String()
}

func (s *ItemDetail) SetGoodsCategory(v string) *ItemDetail {
	s.GoodsCategory = &v
	return s
}

func (s *ItemDetail) SetItemName(v string) *ItemDetail {
	s.ItemName = &v
	return s
}

func (s *ItemDetail) SetQuantity(v int64) *ItemDetail {
	s.Quantity = &v
	return s
}

// 云 api 风控查询响应
type RiskGoModel struct {
	// 风险类型。
	// 枚举值：MARKETING_PURCHASE_COMMON 营销抢购风险识别；INDUSTRY_SCALPER_COMMON 行业黄牛风险识别；MARKETING_AWARDING_COMMON 营销发奖风险识别；INDUSTRY_FARMING_COMMON 行业刷单风险识别；INDUSTRY_BADDEBT_COMMON 履约坏账风险识别
	RiskType *string `json:"risk_type,omitempty" xml:"risk_type,omitempty" require:"true"`
	// 风险等级。
	// 枚举：rank0 无法判断；rank1 极低风险；rank2 较低风险；rank3 中风险；rank4 高风险；rank5 极高风险
	RiskValue *string `json:"risk_value,omitempty" xml:"risk_value,omitempty" require:"true"`
	// 风险描述
	RiskDesc *string `json:"risk_desc,omitempty" xml:"risk_desc,omitempty" require:"true"`
	// 风险标签
	InfoCode *string `json:"info_code,omitempty" xml:"info_code,omitempty"`
}

func (s RiskGoModel) String() string {
	return tea.Prettify(s)
}

func (s RiskGoModel) GoString() string {
	return s.String()
}

func (s *RiskGoModel) SetRiskType(v string) *RiskGoModel {
	s.RiskType = &v
	return s
}

func (s *RiskGoModel) SetRiskValue(v string) *RiskGoModel {
	s.RiskValue = &v
	return s
}

func (s *RiskGoModel) SetRiskDesc(v string) *RiskGoModel {
	s.RiskDesc = &v
	return s
}

func (s *RiskGoModel) SetInfoCode(v string) *RiskGoModel {
	s.InfoCode = &v
	return s
}

// 单期取消模型
type SingleCancelModel struct {
	// 第几期
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" require:"true" minimum:"1"`
	// 其他方式还款的时间
	GmtPay *string `json:"gmt_pay,omitempty" xml:"gmt_pay,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 取消订单某一期代扣计划中以其他方式还款金额，单位为分
	PayOffAmount *int64 `json:"pay_off_amount,omitempty" xml:"pay_off_amount,omitempty" require:"true" minimum:"0"`
	// 变更其他方式还款WECHAT:微信; BANK:银行
	// ALIPAY:支付宝
	// CASH:现金
	PayOffType *string `json:"pay_off_type,omitempty" xml:"pay_off_type,omitempty" maxLength:"64"`
	// 通过其他方式还款单号;例如银行流水号或微信流水号
	PayOffNo *string `json:"pay_off_no,omitempty" xml:"pay_off_no,omitempty" maxLength:"64"`
	// 其他方式还款银行名称，还款方式为银行时必填
	PayOffBankName *string `json:"pay_off_bank_name,omitempty" xml:"pay_off_bank_name,omitempty" maxLength:"64"`
}

func (s SingleCancelModel) String() string {
	return tea.Prettify(s)
}

func (s SingleCancelModel) GoString() string {
	return s.String()
}

func (s *SingleCancelModel) SetPeriodNum(v int64) *SingleCancelModel {
	s.PeriodNum = &v
	return s
}

func (s *SingleCancelModel) SetGmtPay(v string) *SingleCancelModel {
	s.GmtPay = &v
	return s
}

func (s *SingleCancelModel) SetPayOffAmount(v int64) *SingleCancelModel {
	s.PayOffAmount = &v
	return s
}

func (s *SingleCancelModel) SetPayOffType(v string) *SingleCancelModel {
	s.PayOffType = &v
	return s
}

func (s *SingleCancelModel) SetPayOffNo(v string) *SingleCancelModel {
	s.PayOffNo = &v
	return s
}

func (s *SingleCancelModel) SetPayOffBankName(v string) *SingleCancelModel {
	s.PayOffBankName = &v
	return s
}

// 模型结果详情
type RiskModel struct {
	// 风险场景编码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 该风险场景的风险分值
	Score *string `json:"score,omitempty" xml:"score,omitempty" require:"true"`
	// 逾期率
	DelinquencyRate *string `json:"delinquency_rate,omitempty" xml:"delinquency_rate,omitempty"`
	// 风险建议
	RiskAdvice *string `json:"risk_advice,omitempty" xml:"risk_advice,omitempty"`
	// 风险等级
	RiskRank *string `json:"risk_rank,omitempty" xml:"risk_rank,omitempty"`
	// 流程id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
}

func (s RiskModel) String() string {
	return tea.Prettify(s)
}

func (s RiskModel) GoString() string {
	return s.String()
}

func (s *RiskModel) SetSceneCode(v string) *RiskModel {
	s.SceneCode = &v
	return s
}

func (s *RiskModel) SetScore(v string) *RiskModel {
	s.Score = &v
	return s
}

func (s *RiskModel) SetDelinquencyRate(v string) *RiskModel {
	s.DelinquencyRate = &v
	return s
}

func (s *RiskModel) SetRiskAdvice(v string) *RiskModel {
	s.RiskAdvice = &v
	return s
}

func (s *RiskModel) SetRiskRank(v string) *RiskModel {
	s.RiskRank = &v
	return s
}

func (s *RiskModel) SetFlowId(v string) *RiskModel {
	s.FlowId = &v
	return s
}

// 行业黄牛风险识别入参模型
type ScalperQueryModel struct {
	// 注册手机号，填写咨询对象所关联的注册手机号
	RegistrationPhone *string `json:"registration_phone,omitempty" xml:"registration_phone,omitempty" maxLength:"20" minLength:"1"`
	// 认证时间，填写风险咨询对象所关联的账号的真实身份认证时间
	CertificateDate *string `json:"certificate_date,omitempty" xml:"certificate_date,omitempty" maxLength:"20" minLength:"1"`
	// 登录手机号，填写风险咨询对象关联账号的登录手机号
	LoginPhone *string `json:"login_phone,omitempty" xml:"login_phone,omitempty" maxLength:"20" minLength:"1"`
	// 注册账号身份证，填写风险咨询对象所关联账号的注册身份证信息
	RegistrationCert *string `json:"registration_cert,omitempty" xml:"registration_cert,omitempty" maxLength:"30" minLength:"1"`
	// 登录账号身份证，登录账号的身份证号码
	LoginCert *string `json:"login_cert,omitempty" xml:"login_cert,omitempty" maxLength:"30" minLength:"1"`
	// 注册时间，填写风险咨询对象所关联的账号的注册时间
	RegistrationDate *string `json:"registration_date,omitempty" xml:"registration_date,omitempty" maxLength:"20" minLength:"1"`
	// 证件类型；枚举值：1 - 身份证；2 - 护照
	CertType *int64 `json:"cert_type,omitempty" xml:"cert_type,omitempty" maximum:"2" minimum:"1"`
	// 银行卡号
	BankCardNo *string `json:"bank_card_no,omitempty" xml:"bank_card_no,omitempty" maxLength:"50" minLength:"1"`
	// 用户邮箱
	EmailAddress *string `json:"email_address,omitempty" xml:"email_address,omitempty" maxLength:"35" minLength:"1"`
	// 手机序列号
	Imei *string `json:"imei,omitempty" xml:"imei,omitempty" maxLength:"100" minLength:"1"`
	// 国际移动用户识别码
	Imsi *string `json:"imsi,omitempty" xml:"imsi,omitempty" maxLength:"100" minLength:"1"`
	// mac 地址或设备唯一标识
	MacAddress *string `json:"mac_address,omitempty" xml:"mac_address,omitempty" maxLength:"30" minLength:"1"`
	// 设备号，设备唯一号码
	Apdid *string `json:"apdid,omitempty" xml:"apdid,omitempty" maxLength:"128" minLength:"1"`
	// 支付宝外部交易号
	OutOrderNo *string `json:"out_order_no,omitempty" xml:"out_order_no,omitempty" maxLength:"128" minLength:"1"`
	// 所咨询的唯一支付宝交易号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" maxLength:"128" minLength:"1"`
	// 用户购买或使用服务时产生的具体金额总数，单位：分
	SalesAmount *int64 `json:"sales_amount,omitempty" xml:"sales_amount,omitempty" maximum:"1000000" minimum:"1"`
	// 用户姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" maxLength:"50" minLength:"1"`
	// 收货手机号，用于区分 mobile_no 所填的手机号
	MailingPhone *string `json:"mailing_phone,omitempty" xml:"mailing_phone,omitempty" maxLength:"20" minLength:"1"`
	// 收货地址
	MailingAddress *string `json:"mailing_address,omitempty" xml:"mailing_address,omitempty" maxLength:"128" minLength:"1"`
	// 是否为员工账号，枚举值：1 - 是
	IsEmployee *string `json:"is_employee,omitempty" xml:"is_employee,omitempty" maxLength:"10" minLength:"1"`
	// 渠道，枚举值：alipay - 支付宝；app - 自有app；pc - 电脑端
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" maxLength:"10" minLength:"1"`
	// 服务商 pid
	IsvPid *string `json:"isv_pid,omitempty" xml:"isv_pid,omitempty" maxLength:"128" minLength:"1"`
	// 门店行业类目，枚举值：CATERING - 餐饮；LEISURE - 休闲；MEDICAL - 医疗
	StoreMccDesc *string `json:"store_mcc_desc,omitempty" xml:"store_mcc_desc,omitempty" maxLength:"20" minLength:"1"`
	// 消费者 id，外部会员账号
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty" maxLength:"128" minLength:"1"`
	// 订单所有商品信息列表
	OrderItemsInfoList []*ScalperQueryOrderItem `json:"order_items_info_list,omitempty" xml:"order_items_info_list,omitempty" type:"Repeated"`
}

func (s ScalperQueryModel) String() string {
	return tea.Prettify(s)
}

func (s ScalperQueryModel) GoString() string {
	return s.String()
}

func (s *ScalperQueryModel) SetRegistrationPhone(v string) *ScalperQueryModel {
	s.RegistrationPhone = &v
	return s
}

func (s *ScalperQueryModel) SetCertificateDate(v string) *ScalperQueryModel {
	s.CertificateDate = &v
	return s
}

func (s *ScalperQueryModel) SetLoginPhone(v string) *ScalperQueryModel {
	s.LoginPhone = &v
	return s
}

func (s *ScalperQueryModel) SetRegistrationCert(v string) *ScalperQueryModel {
	s.RegistrationCert = &v
	return s
}

func (s *ScalperQueryModel) SetLoginCert(v string) *ScalperQueryModel {
	s.LoginCert = &v
	return s
}

func (s *ScalperQueryModel) SetRegistrationDate(v string) *ScalperQueryModel {
	s.RegistrationDate = &v
	return s
}

func (s *ScalperQueryModel) SetCertType(v int64) *ScalperQueryModel {
	s.CertType = &v
	return s
}

func (s *ScalperQueryModel) SetBankCardNo(v string) *ScalperQueryModel {
	s.BankCardNo = &v
	return s
}

func (s *ScalperQueryModel) SetEmailAddress(v string) *ScalperQueryModel {
	s.EmailAddress = &v
	return s
}

func (s *ScalperQueryModel) SetImei(v string) *ScalperQueryModel {
	s.Imei = &v
	return s
}

func (s *ScalperQueryModel) SetImsi(v string) *ScalperQueryModel {
	s.Imsi = &v
	return s
}

func (s *ScalperQueryModel) SetMacAddress(v string) *ScalperQueryModel {
	s.MacAddress = &v
	return s
}

func (s *ScalperQueryModel) SetApdid(v string) *ScalperQueryModel {
	s.Apdid = &v
	return s
}

func (s *ScalperQueryModel) SetOutOrderNo(v string) *ScalperQueryModel {
	s.OutOrderNo = &v
	return s
}

func (s *ScalperQueryModel) SetOrderNo(v string) *ScalperQueryModel {
	s.OrderNo = &v
	return s
}

func (s *ScalperQueryModel) SetSalesAmount(v int64) *ScalperQueryModel {
	s.SalesAmount = &v
	return s
}

func (s *ScalperQueryModel) SetUserName(v string) *ScalperQueryModel {
	s.UserName = &v
	return s
}

func (s *ScalperQueryModel) SetMailingPhone(v string) *ScalperQueryModel {
	s.MailingPhone = &v
	return s
}

func (s *ScalperQueryModel) SetMailingAddress(v string) *ScalperQueryModel {
	s.MailingAddress = &v
	return s
}

func (s *ScalperQueryModel) SetIsEmployee(v string) *ScalperQueryModel {
	s.IsEmployee = &v
	return s
}

func (s *ScalperQueryModel) SetChannel(v string) *ScalperQueryModel {
	s.Channel = &v
	return s
}

func (s *ScalperQueryModel) SetIsvPid(v string) *ScalperQueryModel {
	s.IsvPid = &v
	return s
}

func (s *ScalperQueryModel) SetStoreMccDesc(v string) *ScalperQueryModel {
	s.StoreMccDesc = &v
	return s
}

func (s *ScalperQueryModel) SetCustomerId(v string) *ScalperQueryModel {
	s.CustomerId = &v
	return s
}

func (s *ScalperQueryModel) SetOrderItemsInfoList(v []*ScalperQueryOrderItem) *ScalperQueryModel {
	s.OrderItemsInfoList = v
	return s
}

// 同步订单中的下单人信息
type UserSyncInfo struct {
}

func (s UserSyncInfo) String() string {
	return tea.Prettify(s)
}

func (s UserSyncInfo) GoString() string {
	return s.String()
}

// 公司信息
type CompanyInfo struct {
	// 营业执照文件信息
	BusinessLicenseFile *FileInfo `json:"business_license_file,omitempty" xml:"business_license_file,omitempty" require:"true"`
	// 业务类型 枚举
	ProductMainClass *string `json:"product_main_class,omitempty" xml:"product_main_class,omitempty" require:"true"`
	// 公司名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" require:"true"`
	// 公司别名
	CompanyAliasName *string `json:"company_alias_name,omitempty" xml:"company_alias_name,omitempty" require:"true"`
	// 公司数科租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 商户类型： 01：企业；07：个体工商户
	// 默认不填为01
	MerchantType *string `json:"merchant_type,omitempty" xml:"merchant_type,omitempty"`
	// 公司联系电话
	CompanyMobile *string `json:"company_mobile,omitempty" xml:"company_mobile,omitempty" require:"true"`
	// 公司联系地址
	CompanyAddress *string `json:"company_address,omitempty" xml:"company_address,omitempty" require:"true"`
	// 联系人姓名
	ContactName *string `json:"contact_name,omitempty" xml:"contact_name,omitempty" require:"true"`
	// 联系人手机号码
	ContactMobile *string `json:"contact_mobile,omitempty" xml:"contact_mobile,omitempty" require:"true"`
	// 绑定企业支付宝账号
	BindAlipayNo *string `json:"bind_alipay_no,omitempty" xml:"bind_alipay_no,omitempty" require:"true"`
	// 结算企业支付宝账号
	SettleAlipayNo *string `json:"settle_alipay_no,omitempty" xml:"settle_alipay_no,omitempty" require:"true"`
	// 绑定支付宝uid
	BindAlipayUid *string `json:"bind_alipay_uid,omitempty" xml:"bind_alipay_uid,omitempty" require:"true"`
}

func (s CompanyInfo) String() string {
	return tea.Prettify(s)
}

func (s CompanyInfo) GoString() string {
	return s.String()
}

func (s *CompanyInfo) SetBusinessLicenseFile(v *FileInfo) *CompanyInfo {
	s.BusinessLicenseFile = v
	return s
}

func (s *CompanyInfo) SetProductMainClass(v string) *CompanyInfo {
	s.ProductMainClass = &v
	return s
}

func (s *CompanyInfo) SetCompanyName(v string) *CompanyInfo {
	s.CompanyName = &v
	return s
}

func (s *CompanyInfo) SetCompanyAliasName(v string) *CompanyInfo {
	s.CompanyAliasName = &v
	return s
}

func (s *CompanyInfo) SetTenantId(v string) *CompanyInfo {
	s.TenantId = &v
	return s
}

func (s *CompanyInfo) SetMerchantId(v string) *CompanyInfo {
	s.MerchantId = &v
	return s
}

func (s *CompanyInfo) SetMerchantType(v string) *CompanyInfo {
	s.MerchantType = &v
	return s
}

func (s *CompanyInfo) SetCompanyMobile(v string) *CompanyInfo {
	s.CompanyMobile = &v
	return s
}

func (s *CompanyInfo) SetCompanyAddress(v string) *CompanyInfo {
	s.CompanyAddress = &v
	return s
}

func (s *CompanyInfo) SetContactName(v string) *CompanyInfo {
	s.ContactName = &v
	return s
}

func (s *CompanyInfo) SetContactMobile(v string) *CompanyInfo {
	s.ContactMobile = &v
	return s
}

func (s *CompanyInfo) SetBindAlipayNo(v string) *CompanyInfo {
	s.BindAlipayNo = &v
	return s
}

func (s *CompanyInfo) SetSettleAlipayNo(v string) *CompanyInfo {
	s.SettleAlipayNo = &v
	return s
}

func (s *CompanyInfo) SetBindAlipayUid(v string) *CompanyInfo {
	s.BindAlipayUid = &v
	return s
}

// 用户履约信息
type UserPerformanceInfo struct {
	// 履约期数
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" require:"true"`
	// 履约时间，格式 yyyy-MM-dd
	// 针对签收日作为起租日模式,未签收时：以签收日开始计算
	PayDate *string `json:"pay_date,omitempty" xml:"pay_date,omitempty" require:"true"`
	// 履约金额，单位为分
	PayMoney *int64 `json:"pay_money,omitempty" xml:"pay_money,omitempty" require:"true"`
}

func (s UserPerformanceInfo) String() string {
	return tea.Prettify(s)
}

func (s UserPerformanceInfo) GoString() string {
	return s.String()
}

func (s *UserPerformanceInfo) SetPeriodNum(v int64) *UserPerformanceInfo {
	s.PeriodNum = &v
	return s
}

func (s *UserPerformanceInfo) SetPayDate(v string) *UserPerformanceInfo {
	s.PayDate = &v
	return s
}

func (s *UserPerformanceInfo) SetPayMoney(v int64) *UserPerformanceInfo {
	s.PayMoney = &v
	return s
}

// 营销分查询对象
type MarketingScoreQueryInfo struct {
	// 手机号码
	PhoneNum *string `json:"phone_num,omitempty" xml:"phone_num,omitempty"`
}

func (s MarketingScoreQueryInfo) String() string {
	return tea.Prettify(s)
}

func (s MarketingScoreQueryInfo) GoString() string {
	return s.String()
}

func (s *MarketingScoreQueryInfo) SetPhoneNum(v string) *MarketingScoreQueryInfo {
	s.PhoneNum = &v
	return s
}

// 策略结果详情
type RiskStrategy struct {
	// 策略ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 策略名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 策略决策结果
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty" require:"true"`
	// 风险场景编码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
}

func (s RiskStrategy) String() string {
	return tea.Prettify(s)
}

func (s RiskStrategy) GoString() string {
	return s.String()
}

func (s *RiskStrategy) SetId(v string) *RiskStrategy {
	s.Id = &v
	return s
}

func (s *RiskStrategy) SetName(v string) *RiskStrategy {
	s.Name = &v
	return s
}

func (s *RiskStrategy) SetDecision(v string) *RiskStrategy {
	s.Decision = &v
	return s
}

func (s *RiskStrategy) SetSceneCode(v string) *RiskStrategy {
	s.SceneCode = &v
	return s
}

// 保单信息
type InsureOrderInfo struct {
	// 商家订单ID
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 投保编号（承保id）
	InsureId *string `json:"insure_id,omitempty" xml:"insure_id,omitempty"`
	// 商品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty"`
	// 保险开始时间
	InsureStartTime *string `json:"insure_start_time,omitempty" xml:"insure_start_time,omitempty"`
	// 保险终止时间
	InsureEndTime *string `json:"insure_end_time,omitempty" xml:"insure_end_time,omitempty"`
	// 投保金额（保额），单位分 100代表1元
	InsureAmount *int64 `json:"insure_amount,omitempty" xml:"insure_amount,omitempty"`
	// 投保费用（保费），单位分 100代表1元
	InsurePremium *int64 `json:"insure_premium,omitempty" xml:"insure_premium,omitempty"`
	// 投保状态枚举
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 电子保单下载链接
	PolicyUrl *string `json:"policy_url,omitempty" xml:"policy_url,omitempty"`
	// 验真码
	ValidateCode *string `json:"validate_code,omitempty" xml:"validate_code,omitempty"`
}

func (s InsureOrderInfo) String() string {
	return tea.Prettify(s)
}

func (s InsureOrderInfo) GoString() string {
	return s.String()
}

func (s *InsureOrderInfo) SetOrderId(v string) *InsureOrderInfo {
	s.OrderId = &v
	return s
}

func (s *InsureOrderInfo) SetInsureId(v string) *InsureOrderInfo {
	s.InsureId = &v
	return s
}

func (s *InsureOrderInfo) SetProductName(v string) *InsureOrderInfo {
	s.ProductName = &v
	return s
}

func (s *InsureOrderInfo) SetInsureStartTime(v string) *InsureOrderInfo {
	s.InsureStartTime = &v
	return s
}

func (s *InsureOrderInfo) SetInsureEndTime(v string) *InsureOrderInfo {
	s.InsureEndTime = &v
	return s
}

func (s *InsureOrderInfo) SetInsureAmount(v int64) *InsureOrderInfo {
	s.InsureAmount = &v
	return s
}

func (s *InsureOrderInfo) SetInsurePremium(v int64) *InsureOrderInfo {
	s.InsurePremium = &v
	return s
}

func (s *InsureOrderInfo) SetStatus(v string) *InsureOrderInfo {
	s.Status = &v
	return s
}

func (s *InsureOrderInfo) SetPolicyUrl(v string) *InsureOrderInfo {
	s.PolicyUrl = &v
	return s
}

func (s *InsureOrderInfo) SetValidateCode(v string) *InsureOrderInfo {
	s.ValidateCode = &v
	return s
}

// 营销分对象
type MarketingScoreInfo struct {
	// 手机号
	PhoneNum *string `json:"phone_num,omitempty" xml:"phone_num,omitempty"`
	// 营销分
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
}

func (s MarketingScoreInfo) String() string {
	return tea.Prettify(s)
}

func (s MarketingScoreInfo) GoString() string {
	return s.String()
}

func (s *MarketingScoreInfo) SetPhoneNum(v string) *MarketingScoreInfo {
	s.PhoneNum = &v
	return s
}

func (s *MarketingScoreInfo) SetScore(v string) *MarketingScoreInfo {
	s.Score = &v
	return s
}

// 待办信息
type PendingEventInfo struct {
	// 事件id
	EventId *string `json:"event_id,omitempty" xml:"event_id,omitempty"`
	// 通知:NOTIFICATION
	// 确认函:CONFIRMATION
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// ("PENDING","待办中"),  ("CONFIRMED","确认"),
	// ("REJECTED","已拒绝")
	// ("FAILED","失败"),("EXPIRED","已过期");
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 待办内容主题
	ContentSubject *string `json:"content_subject,omitempty" xml:"content_subject,omitempty"`
	// 事件有效期开始
	EffectiveStartTime *string `json:"effective_start_time,omitempty" xml:"effective_start_time,omitempty"`
	// 事件有效期结束
	EffectiveEndTime *string `json:"effective_end_time,omitempty" xml:"effective_end_time,omitempty"`
}

func (s PendingEventInfo) String() string {
	return tea.Prettify(s)
}

func (s PendingEventInfo) GoString() string {
	return s.String()
}

func (s *PendingEventInfo) SetEventId(v string) *PendingEventInfo {
	s.EventId = &v
	return s
}

func (s *PendingEventInfo) SetType(v string) *PendingEventInfo {
	s.Type = &v
	return s
}

func (s *PendingEventInfo) SetStatus(v string) *PendingEventInfo {
	s.Status = &v
	return s
}

func (s *PendingEventInfo) SetContentSubject(v string) *PendingEventInfo {
	s.ContentSubject = &v
	return s
}

func (s *PendingEventInfo) SetEffectiveStartTime(v string) *PendingEventInfo {
	s.EffectiveStartTime = &v
	return s
}

func (s *PendingEventInfo) SetEffectiveEndTime(v string) *PendingEventInfo {
	s.EffectiveEndTime = &v
	return s
}

// 智租风控-商品价格
type PriceDetail struct {
	// 商品租赁期数
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" require:"true" maximum:"1000"`
	// 押金，单位：分。
	DepositPrice *int64 `json:"deposit_price,omitempty" xml:"deposit_price,omitempty" require:"true" maximum:"10000000"`
	// 买断价格，单位：分
	BuyoutPrice *int64 `json:"buyout_price,omitempty" xml:"buyout_price,omitempty" require:"true" maximum:"10000000"`
	// 首期租金，单位：分
	InitialRentPrice *int64 `json:"initial_rent_price,omitempty" xml:"initial_rent_price,omitempty" require:"true" maximum:"10000000"`
}

func (s PriceDetail) String() string {
	return tea.Prettify(s)
}

func (s PriceDetail) GoString() string {
	return s.String()
}

func (s *PriceDetail) SetPeriodNum(v int64) *PriceDetail {
	s.PeriodNum = &v
	return s
}

func (s *PriceDetail) SetDepositPrice(v int64) *PriceDetail {
	s.DepositPrice = &v
	return s
}

func (s *PriceDetail) SetBuyoutPrice(v int64) *PriceDetail {
	s.BuyoutPrice = &v
	return s
}

func (s *PriceDetail) SetInitialRentPrice(v int64) *PriceDetail {
	s.InitialRentPrice = &v
	return s
}

// 订单消息结构体
type OrderMsgInfo struct {
	// 订单id
	//
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 消息ID
	//
	MsgId *string `json:"msg_id,omitempty" xml:"msg_id,omitempty" require:"true"`
	// 消息类型
	//
	MsgPublishType *string `json:"msg_publish_type,omitempty" xml:"msg_publish_type,omitempty" require:"true"`
	// 消息创建时间
	//
	MsgCreateTime *string `json:"msg_create_time,omitempty" xml:"msg_create_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 消息投递状态 SUCCESS 成功 FAIL 失败 WAIT 等待投递重试
	MsgStatus *string `json:"msg_status,omitempty" xml:"msg_status,omitempty" require:"true"`
	// 消息重投次数
	//
	MsgRetryTime *int64 `json:"msg_retry_time,omitempty" xml:"msg_retry_time,omitempty" require:"true"`
	// 消息体内容
	MsgContent *string `json:"msg_content,omitempty" xml:"msg_content,omitempty" require:"true"`
	// 消息回调地址
	MsgCallbackUrl *string `json:"msg_callback_url,omitempty" xml:"msg_callback_url,omitempty" require:"true"`
	// 新回调地址
	NewMsgCallbackUrl *string `json:"new_msg_callback_url,omitempty" xml:"new_msg_callback_url,omitempty" require:"true"`
}

func (s OrderMsgInfo) String() string {
	return tea.Prettify(s)
}

func (s OrderMsgInfo) GoString() string {
	return s.String()
}

func (s *OrderMsgInfo) SetOrderId(v string) *OrderMsgInfo {
	s.OrderId = &v
	return s
}

func (s *OrderMsgInfo) SetMsgId(v string) *OrderMsgInfo {
	s.MsgId = &v
	return s
}

func (s *OrderMsgInfo) SetMsgPublishType(v string) *OrderMsgInfo {
	s.MsgPublishType = &v
	return s
}

func (s *OrderMsgInfo) SetMsgCreateTime(v string) *OrderMsgInfo {
	s.MsgCreateTime = &v
	return s
}

func (s *OrderMsgInfo) SetMsgStatus(v string) *OrderMsgInfo {
	s.MsgStatus = &v
	return s
}

func (s *OrderMsgInfo) SetMsgRetryTime(v int64) *OrderMsgInfo {
	s.MsgRetryTime = &v
	return s
}

func (s *OrderMsgInfo) SetMsgContent(v string) *OrderMsgInfo {
	s.MsgContent = &v
	return s
}

func (s *OrderMsgInfo) SetMsgCallbackUrl(v string) *OrderMsgInfo {
	s.MsgCallbackUrl = &v
	return s
}

func (s *OrderMsgInfo) SetNewMsgCallbackUrl(v string) *OrderMsgInfo {
	s.NewMsgCallbackUrl = &v
	return s
}

// 营销发奖风险识别入参模型
type AwardingQueryModel struct {
	// 对方支付宝账户 uid，用于表示两个账户在业务交互中的对方账户，如人传人活动用户A会拉用户B来注册领奖，其中用户B为对方账户
	OpposingUserid *string `json:"opposing_userid,omitempty" xml:"opposing_userid,omitempty" maxLength:"128" minLength:"1"`
	// 对方支付宝账户openid，营销发奖风险识别场景，userid 与 open_id 至少传入一个
	OpposingOpenId *string `json:"opposing_open_id,omitempty" xml:"opposing_open_id,omitempty" maxLength:"128" minLength:"1"`
	// 服务二级分类
	ServiceCategory *string `json:"service_category,omitempty" xml:"service_category,omitempty" maxLength:"128" minLength:"1"`
	// 服务商 pid
	IsvPid *string `json:"isv_pid,omitempty" xml:"isv_pid,omitempty" maxLength:"128" minLength:"1"`
	// 银行卡号
	BankCardNo *string `json:"bank_card_no,omitempty" xml:"bank_card_no,omitempty" maxLength:"128" minLength:"1"`
	// 手机序列号
	Imei *string `json:"imei,omitempty" xml:"imei,omitempty" maxLength:"128" minLength:"1"`
	// 国际移动用户识别码
	Imsi *string `json:"imsi,omitempty" xml:"imsi,omitempty" maxLength:"128" minLength:"1"`
	// 金额，用户购买或使用服务时产生的具体金额，单位：分
	SalesAmount *int64 `json:"sales_amount,omitempty" xml:"sales_amount,omitempty" maximum:"10000000" minimum:"1"`
	// 用户姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" maxLength:"128" minLength:"1"`
	// 门店行业类目，枚举值：CATERING - 餐饮；LEISURE - 休闲；MEDICAL - 医疗
	StoreMccDesc *string `json:"store_mcc_desc,omitempty" xml:"store_mcc_desc,omitempty" maxLength:"30" minLength:"1"`
	// 消费者 id，外部会员账号
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 填入想要咨询风控的二维码值，需为唯一值
	QrCode *string `json:"qr_code,omitempty" xml:"qr_code,omitempty" maxLength:"256" minLength:"1"`
}

func (s AwardingQueryModel) String() string {
	return tea.Prettify(s)
}

func (s AwardingQueryModel) GoString() string {
	return s.String()
}

func (s *AwardingQueryModel) SetOpposingUserid(v string) *AwardingQueryModel {
	s.OpposingUserid = &v
	return s
}

func (s *AwardingQueryModel) SetOpposingOpenId(v string) *AwardingQueryModel {
	s.OpposingOpenId = &v
	return s
}

func (s *AwardingQueryModel) SetServiceCategory(v string) *AwardingQueryModel {
	s.ServiceCategory = &v
	return s
}

func (s *AwardingQueryModel) SetIsvPid(v string) *AwardingQueryModel {
	s.IsvPid = &v
	return s
}

func (s *AwardingQueryModel) SetBankCardNo(v string) *AwardingQueryModel {
	s.BankCardNo = &v
	return s
}

func (s *AwardingQueryModel) SetImei(v string) *AwardingQueryModel {
	s.Imei = &v
	return s
}

func (s *AwardingQueryModel) SetImsi(v string) *AwardingQueryModel {
	s.Imsi = &v
	return s
}

func (s *AwardingQueryModel) SetSalesAmount(v int64) *AwardingQueryModel {
	s.SalesAmount = &v
	return s
}

func (s *AwardingQueryModel) SetUserName(v string) *AwardingQueryModel {
	s.UserName = &v
	return s
}

func (s *AwardingQueryModel) SetStoreMccDesc(v string) *AwardingQueryModel {
	s.StoreMccDesc = &v
	return s
}

func (s *AwardingQueryModel) SetCustomerId(v string) *AwardingQueryModel {
	s.CustomerId = &v
	return s
}

func (s *AwardingQueryModel) SetQrCode(v string) *AwardingQueryModel {
	s.QrCode = &v
	return s
}

// 用信查询订单履约信息结构体
type OrderPrimiseExcelInfo struct {
	// 文件下载地址
	DownloadUrl *string `json:"download_url,omitempty" xml:"download_url,omitempty"`
	// 文件类型,订单明细表:ORDER_DETAIL 还款记录表:ORDER_FULFILLMENT
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	//  生成中, 已生成,无效
	TaskStatus *string `json:"task_status,omitempty" xml:"task_status,omitempty" require:"true"`
}

func (s OrderPrimiseExcelInfo) String() string {
	return tea.Prettify(s)
}

func (s OrderPrimiseExcelInfo) GoString() string {
	return s.String()
}

func (s *OrderPrimiseExcelInfo) SetDownloadUrl(v string) *OrderPrimiseExcelInfo {
	s.DownloadUrl = &v
	return s
}

func (s *OrderPrimiseExcelInfo) SetFileType(v string) *OrderPrimiseExcelInfo {
	s.FileType = &v
	return s
}

func (s *OrderPrimiseExcelInfo) SetTaskStatus(v string) *OrderPrimiseExcelInfo {
	s.TaskStatus = &v
	return s
}

// 应用信息修改
type ApplicationInfoUpdate struct {
	// 应用场景 MINI_APP 小程序 APP 自有app ALL 两种都有
	ApplicationScene *string `json:"application_scene,omitempty" xml:"application_scene,omitempty"`
	// 小程序id
	TinyAppId *string `json:"tiny_app_id,omitempty" xml:"tiny_app_id,omitempty"`
	// 小程序名称
	SiteName *string `json:"site_name,omitempty" xml:"site_name,omitempty"`
	// http://asdasas.com
	SitUrl *string `json:"sit_url,omitempty" xml:"sit_url,omitempty"`
	// 商户名称。 修改后的商户名称，将同步支付宝代扣签约页面字段展示
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty"`
	// 商户服务名称。 修改后的商户服务名称，将同步支付宝代扣签约页面字段展示
	MerchantServiceName *string `json:"merchant_service_name,omitempty" xml:"merchant_service_name,omitempty"`
	// 商户服务描述。 修改后的商户服务描述，将同步支付宝代扣签约页面字段展示
	MerchantServiceDesc *string `json:"merchant_service_desc,omitempty" xml:"merchant_service_desc,omitempty"`
}

func (s ApplicationInfoUpdate) String() string {
	return tea.Prettify(s)
}

func (s ApplicationInfoUpdate) GoString() string {
	return s.String()
}

func (s *ApplicationInfoUpdate) SetApplicationScene(v string) *ApplicationInfoUpdate {
	s.ApplicationScene = &v
	return s
}

func (s *ApplicationInfoUpdate) SetTinyAppId(v string) *ApplicationInfoUpdate {
	s.TinyAppId = &v
	return s
}

func (s *ApplicationInfoUpdate) SetSiteName(v string) *ApplicationInfoUpdate {
	s.SiteName = &v
	return s
}

func (s *ApplicationInfoUpdate) SetSitUrl(v string) *ApplicationInfoUpdate {
	s.SitUrl = &v
	return s
}

func (s *ApplicationInfoUpdate) SetMerchantName(v string) *ApplicationInfoUpdate {
	s.MerchantName = &v
	return s
}

func (s *ApplicationInfoUpdate) SetMerchantServiceName(v string) *ApplicationInfoUpdate {
	s.MerchantServiceName = &v
	return s
}

func (s *ApplicationInfoUpdate) SetMerchantServiceDesc(v string) *ApplicationInfoUpdate {
	s.MerchantServiceDesc = &v
	return s
}

// 订单用户信息
type OrderUserInfo struct {
	// 承租人名称
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
	// 承租人手机号
	UserPhoneNumber *string `json:"user_phone_number,omitempty" xml:"user_phone_number,omitempty"`
	// 地址
	UserAddress *string `json:"user_address,omitempty" xml:"user_address,omitempty"`
	// 支付宝账号
	AlipayUid *string `json:"alipay_uid,omitempty" xml:"alipay_uid,omitempty"`
	// 租赁类别
	// 1:个人用户
	// 2:企业用户
	LesseeType *int64 `json:"lessee_type,omitempty" xml:"lessee_type,omitempty"`
	// 承租人身份证
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s OrderUserInfo) String() string {
	return tea.Prettify(s)
}

func (s OrderUserInfo) GoString() string {
	return s.String()
}

func (s *OrderUserInfo) SetUserName(v string) *OrderUserInfo {
	s.UserName = &v
	return s
}

func (s *OrderUserInfo) SetUserPhoneNumber(v string) *OrderUserInfo {
	s.UserPhoneNumber = &v
	return s
}

func (s *OrderUserInfo) SetUserAddress(v string) *OrderUserInfo {
	s.UserAddress = &v
	return s
}

func (s *OrderUserInfo) SetAlipayUid(v string) *OrderUserInfo {
	s.AlipayUid = &v
	return s
}

func (s *OrderUserInfo) SetLesseeType(v int64) *OrderUserInfo {
	s.LesseeType = &v
	return s
}

func (s *OrderUserInfo) SetUserId(v string) *OrderUserInfo {
	s.UserId = &v
	return s
}

// 订单包含的单个商品模型
type OrderGoodsModel struct {
}

func (s OrderGoodsModel) String() string {
	return tea.Prettify(s)
}

func (s OrderGoodsModel) GoString() string {
	return s.String()
}

// 智租风控-物流信息
type DeliveryDetail struct {
	// 收件人姓名
	ReceiverName *string `json:"receiver_name,omitempty" xml:"receiver_name,omitempty" maxLength:"32"`
	// 收件人手机号
	ReceiverMobile *string `json:"receiver_mobile,omitempty" xml:"receiver_mobile,omitempty" maxLength:"32"`
	// 收件人地址
	ReceiverAddress *string `json:"receiver_address,omitempty" xml:"receiver_address,omitempty" maxLength:"256"`
}

func (s DeliveryDetail) String() string {
	return tea.Prettify(s)
}

func (s DeliveryDetail) GoString() string {
	return s.String()
}

func (s *DeliveryDetail) SetReceiverName(v string) *DeliveryDetail {
	s.ReceiverName = &v
	return s
}

func (s *DeliveryDetail) SetReceiverMobile(v string) *DeliveryDetail {
	s.ReceiverMobile = &v
	return s
}

func (s *DeliveryDetail) SetReceiverAddress(v string) *DeliveryDetail {
	s.ReceiverAddress = &v
	return s
}

// 租户协议分页对象
type AgreementPage struct {
	// 协议id
	AgreementId *string `json:"agreement_id,omitempty" xml:"agreement_id,omitempty" require:"true"`
	// 代理企业名称
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty" require:"true"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 业务类型 枚举
	ProductMainClass *string `json:"product_main_class,omitempty" xml:"product_main_class,omitempty" require:"true"`
	// 协议类型 枚举
	AgreementType *string `json:"agreement_type,omitempty" xml:"agreement_type,omitempty" require:"true"`
	// 租户签约状态 枚举
	SignStatus *string `json:"sign_status,omitempty" xml:"sign_status,omitempty" require:"true"`
}

func (s AgreementPage) String() string {
	return tea.Prettify(s)
}

func (s AgreementPage) GoString() string {
	return s.String()
}

func (s *AgreementPage) SetAgreementId(v string) *AgreementPage {
	s.AgreementId = &v
	return s
}

func (s *AgreementPage) SetMerchantName(v string) *AgreementPage {
	s.MerchantName = &v
	return s
}

func (s *AgreementPage) SetTenantId(v string) *AgreementPage {
	s.TenantId = &v
	return s
}

func (s *AgreementPage) SetProductMainClass(v string) *AgreementPage {
	s.ProductMainClass = &v
	return s
}

func (s *AgreementPage) SetAgreementType(v string) *AgreementPage {
	s.AgreementType = &v
	return s
}

func (s *AgreementPage) SetSignStatus(v string) *AgreementPage {
	s.SignStatus = &v
	return s
}

// 行业刷单风险识别入参模型
type FarmingQueryModel struct {
	// 支付宝外部交易号
	OutOrderNo *string `json:"out_order_no,omitempty" xml:"out_order_no,omitempty" maxLength:"128" minLength:"1"`
	// 支付宝内部交易号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" maxLength:"128" minLength:"1"`
	// 金额，用户购买或使用服务时产生的具体金额，单位：分
	SalesAmount *int64 `json:"sales_amount,omitempty" xml:"sales_amount,omitempty" maximum:"10000000" minimum:"1"`
	// 银行卡号
	BankCardNo *string `json:"bank_card_no,omitempty" xml:"bank_card_no,omitempty" maxLength:"128" minLength:"1"`
	// 服务商 pid
	IsvPid *string `json:"isv_pid,omitempty" xml:"isv_pid,omitempty" maxLength:"128" minLength:"1"`
	// 门店行业类目，枚举值：CATERING - 餐饮；LEISURE - 休闲；MEDICAL - 医疗
	StoreMccDesc *string `json:"store_mcc_desc,omitempty" xml:"store_mcc_desc,omitempty" maxLength:"30" minLength:"1"`
	// 门店地址；不需要传城市和行政区
	OutletAddress *string `json:"outlet_address,omitempty" xml:"outlet_address,omitempty" maxLength:"128" minLength:"1"`
	// 公司名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" maxLength:"128" minLength:"1"`
	// 店铺名称
	StoreName *string `json:"store_name,omitempty" xml:"store_name,omitempty" maxLength:"128" minLength:"1"`
}

func (s FarmingQueryModel) String() string {
	return tea.Prettify(s)
}

func (s FarmingQueryModel) GoString() string {
	return s.String()
}

func (s *FarmingQueryModel) SetOutOrderNo(v string) *FarmingQueryModel {
	s.OutOrderNo = &v
	return s
}

func (s *FarmingQueryModel) SetOrderNo(v string) *FarmingQueryModel {
	s.OrderNo = &v
	return s
}

func (s *FarmingQueryModel) SetSalesAmount(v int64) *FarmingQueryModel {
	s.SalesAmount = &v
	return s
}

func (s *FarmingQueryModel) SetBankCardNo(v string) *FarmingQueryModel {
	s.BankCardNo = &v
	return s
}

func (s *FarmingQueryModel) SetIsvPid(v string) *FarmingQueryModel {
	s.IsvPid = &v
	return s
}

func (s *FarmingQueryModel) SetStoreMccDesc(v string) *FarmingQueryModel {
	s.StoreMccDesc = &v
	return s
}

func (s *FarmingQueryModel) SetOutletAddress(v string) *FarmingQueryModel {
	s.OutletAddress = &v
	return s
}

func (s *FarmingQueryModel) SetCompanyName(v string) *FarmingQueryModel {
	s.CompanyName = &v
	return s
}

func (s *FarmingQueryModel) SetStoreName(v string) *FarmingQueryModel {
	s.StoreName = &v
	return s
}

// 订单商品
type OrderProductInfo struct {
	// 商品编码
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
	// 商品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty"`
	// 商品数量
	ProductNumber *int64 `json:"product_number,omitempty" xml:"product_number,omitempty"`
}

func (s OrderProductInfo) String() string {
	return tea.Prettify(s)
}

func (s OrderProductInfo) GoString() string {
	return s.String()
}

func (s *OrderProductInfo) SetProductId(v string) *OrderProductInfo {
	s.ProductId = &v
	return s
}

func (s *OrderProductInfo) SetProductName(v string) *OrderProductInfo {
	s.ProductName = &v
	return s
}

func (s *OrderProductInfo) SetProductNumber(v int64) *OrderProductInfo {
	s.ProductNumber = &v
	return s
}

// 用信订单信息
type CreditUtilizationOrder struct {
	// 123
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"6"`
	// 订单用信额度，单位为分
	OrderCreditLine *int64 `json:"order_credit_line,omitempty" xml:"order_credit_line,omitempty" require:"true" minimum:"1"`
	// 订单商户应还金额，单位为分
	OrderMerchantRepaymentMoney *int64 `json:"order_merchant_repayment_money,omitempty" xml:"order_merchant_repayment_money,omitempty" require:"true" minimum:"1"`
	// 分账起始日期
	DivideStartTermIndex *int64 `json:"divide_start_term_index,omitempty" xml:"divide_start_term_index,omitempty" require:"true" minimum:"1"`
}

func (s CreditUtilizationOrder) String() string {
	return tea.Prettify(s)
}

func (s CreditUtilizationOrder) GoString() string {
	return s.String()
}

func (s *CreditUtilizationOrder) SetOrderId(v string) *CreditUtilizationOrder {
	s.OrderId = &v
	return s
}

func (s *CreditUtilizationOrder) SetOrderCreditLine(v int64) *CreditUtilizationOrder {
	s.OrderCreditLine = &v
	return s
}

func (s *CreditUtilizationOrder) SetOrderMerchantRepaymentMoney(v int64) *CreditUtilizationOrder {
	s.OrderMerchantRepaymentMoney = &v
	return s
}

func (s *CreditUtilizationOrder) SetDivideStartTermIndex(v int64) *CreditUtilizationOrder {
	s.DivideStartTermIndex = &v
	return s
}

// 主动支付单据
type ActivePayOrder struct {
	// 支付宝支付订单号，用于拉起主动支付页面
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 状态
	// INIT：交易创建
	// FAILED：付款失败
	// SUCCESS：付款成功
	TradeStatus *string `json:"trade_status,omitempty" xml:"trade_status,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 状态原因码
	StatusReasonCode *string `json:"status_reason_code,omitempty" xml:"status_reason_code,omitempty" minLength:"1"`
	// 超时关闭
	StatusReasonMsg *string `json:"status_reason_msg,omitempty" xml:"status_reason_msg,omitempty" minLength:"1"`
	// 本次交易支付的订单金额，单位为分
	// 付款成功或付款成功之后的状态必填
	TotalAmount *int64 `json:"total_amount,omitempty" xml:"total_amount,omitempty" minimum:"1"`
	// 用户在交易中支付的金额，单位为分
	// 付款成功的状态必填
	PaidAmount *int64 `json:"paid_amount,omitempty" xml:"paid_amount,omitempty" minimum:"1"`
	// 商家在交易中实际收到的款项，单位为分
	// 付款成功的状态必填
	ReceiptAmount *int64 `json:"receipt_amount,omitempty" xml:"receipt_amount,omitempty" minimum:"1"`
	// 交易支付时间
	// 付款成功的状态必填
	GmtPay *string `json:"gmt_pay,omitempty" xml:"gmt_pay,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s ActivePayOrder) String() string {
	return tea.Prettify(s)
}

func (s ActivePayOrder) GoString() string {
	return s.String()
}

func (s *ActivePayOrder) SetTradeNo(v string) *ActivePayOrder {
	s.TradeNo = &v
	return s
}

func (s *ActivePayOrder) SetTradeStatus(v string) *ActivePayOrder {
	s.TradeStatus = &v
	return s
}

func (s *ActivePayOrder) SetStatusReasonCode(v string) *ActivePayOrder {
	s.StatusReasonCode = &v
	return s
}

func (s *ActivePayOrder) SetStatusReasonMsg(v string) *ActivePayOrder {
	s.StatusReasonMsg = &v
	return s
}

func (s *ActivePayOrder) SetTotalAmount(v int64) *ActivePayOrder {
	s.TotalAmount = &v
	return s
}

func (s *ActivePayOrder) SetPaidAmount(v int64) *ActivePayOrder {
	s.PaidAmount = &v
	return s
}

func (s *ActivePayOrder) SetReceiptAmount(v int64) *ActivePayOrder {
	s.ReceiptAmount = &v
	return s
}

func (s *ActivePayOrder) SetGmtPay(v string) *ActivePayOrder {
	s.GmtPay = &v
	return s
}

// 订单商品信息
type GoodsInfo struct {
}

func (s GoodsInfo) String() string {
	return tea.Prettify(s)
}

func (s GoodsInfo) GoString() string {
	return s.String()
}

// 分页查询对象
type PageQuery struct {
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 当前页
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
}

func (s PageQuery) String() string {
	return tea.Prettify(s)
}

func (s PageQuery) GoString() string {
	return s.String()
}

func (s *PageQuery) SetPageSize(v int64) *PageQuery {
	s.PageSize = &v
	return s
}

func (s *PageQuery) SetPageIndex(v int64) *PageQuery {
	s.PageIndex = &v
	return s
}

// 法人信息
type LegalInfo struct {
	// 法人名称
	LegalName *string `json:"legal_name,omitempty" xml:"legal_name,omitempty" require:"true"`
	// 法人证件号
	LegalCertNo *string `json:"legal_cert_no,omitempty" xml:"legal_cert_no,omitempty" require:"true"`
	// 法人证件正面
	LegalCertFrontFile *FileInfo `json:"legal_cert_front_file,omitempty" xml:"legal_cert_front_file,omitempty" require:"true"`
	// 法人证件反面
	LegalCertBackFile *FileInfo `json:"legal_cert_back_file,omitempty" xml:"legal_cert_back_file,omitempty" require:"true"`
}

func (s LegalInfo) String() string {
	return tea.Prettify(s)
}

func (s LegalInfo) GoString() string {
	return s.String()
}

func (s *LegalInfo) SetLegalName(v string) *LegalInfo {
	s.LegalName = &v
	return s
}

func (s *LegalInfo) SetLegalCertNo(v string) *LegalInfo {
	s.LegalCertNo = &v
	return s
}

func (s *LegalInfo) SetLegalCertFrontFile(v *FileInfo) *LegalInfo {
	s.LegalCertFrontFile = v
	return s
}

func (s *LegalInfo) SetLegalCertBackFile(v *FileInfo) *LegalInfo {
	s.LegalCertBackFile = v
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

type SyncFundSplittingRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资方订单号
	FundNo *string `json:"fund_no,omitempty" xml:"fund_no,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 商户的数科租户ID
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 第几期，例如：2表示第二期
	TermNum *int64 `json:"term_num,omitempty" xml:"term_num,omitempty" require:"true"`
	// 扣款时间， yyyy-MM-dd HH:mm:ss 格式
	DeductionTime *string `json:"deduction_time,omitempty" xml:"deduction_time,omitempty" require:"true"`
	// 扣款金额，单位精确到分， 例如：12462300为124623.00元
	DeductionAmount *int64 `json:"deduction_amount,omitempty" xml:"deduction_amount,omitempty" require:"true"`
	// 商户分账金额，单位精确到分，比如：666601 = 6666.01元
	MerchantSplitAmount *int64 `json:"merchant_split_amount,omitempty" xml:"merchant_split_amount,omitempty" require:"true"`
	// 资方分账金额，单位精确到分。比如：666610 = 6666.10元
	FundSplitAmount *int64 `json:"fund_split_amount,omitempty" xml:"fund_split_amount,omitempty" require:"true"`
	// 其他参与方分账信息，JSON格式的数组，样例：
	// [{"participants":"参与方A","amount":666600,"accountNo":"777223","accountType":"ICBC"}]
	OtherSplitInfo *string `json:"other_split_info,omitempty" xml:"other_split_info,omitempty"`
}

func (s SyncFundSplittingRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncFundSplittingRequest) GoString() string {
	return s.String()
}

func (s *SyncFundSplittingRequest) SetAuthToken(v string) *SyncFundSplittingRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncFundSplittingRequest) SetProductInstanceId(v string) *SyncFundSplittingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncFundSplittingRequest) SetFundNo(v string) *SyncFundSplittingRequest {
	s.FundNo = &v
	return s
}

func (s *SyncFundSplittingRequest) SetOrderId(v string) *SyncFundSplittingRequest {
	s.OrderId = &v
	return s
}

func (s *SyncFundSplittingRequest) SetMerchantTenantId(v string) *SyncFundSplittingRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *SyncFundSplittingRequest) SetTermNum(v int64) *SyncFundSplittingRequest {
	s.TermNum = &v
	return s
}

func (s *SyncFundSplittingRequest) SetDeductionTime(v string) *SyncFundSplittingRequest {
	s.DeductionTime = &v
	return s
}

func (s *SyncFundSplittingRequest) SetDeductionAmount(v int64) *SyncFundSplittingRequest {
	s.DeductionAmount = &v
	return s
}

func (s *SyncFundSplittingRequest) SetMerchantSplitAmount(v int64) *SyncFundSplittingRequest {
	s.MerchantSplitAmount = &v
	return s
}

func (s *SyncFundSplittingRequest) SetFundSplitAmount(v int64) *SyncFundSplittingRequest {
	s.FundSplitAmount = &v
	return s
}

func (s *SyncFundSplittingRequest) SetOtherSplitInfo(v string) *SyncFundSplittingRequest {
	s.OtherSplitInfo = &v
	return s
}

type SyncFundSplittingResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 流水同步描述信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncFundSplittingResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncFundSplittingResponse) GoString() string {
	return s.String()
}

func (s *SyncFundSplittingResponse) SetReqMsgId(v string) *SyncFundSplittingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncFundSplittingResponse) SetResultCode(v string) *SyncFundSplittingResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncFundSplittingResponse) SetResultMsg(v string) *SyncFundSplittingResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncFundSplittingResponse) SetResponseData(v string) *SyncFundSplittingResponse {
	s.ResponseData = &v
	return s
}

type SyncFundOrderfinancialRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 商户在数科的租户ID
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单融资唯一标识
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 订单融资状态：1-成功；2-失败
	Status *int64 `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 融资结果描述，长度不超过64
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty" maxLength:"64"`
	// 额外信息
	Extras *string `json:"extras,omitempty" xml:"extras,omitempty"`
}

func (s SyncFundOrderfinancialRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncFundOrderfinancialRequest) GoString() string {
	return s.String()
}

func (s *SyncFundOrderfinancialRequest) SetAuthToken(v string) *SyncFundOrderfinancialRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncFundOrderfinancialRequest) SetProductInstanceId(v string) *SyncFundOrderfinancialRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncFundOrderfinancialRequest) SetOrderId(v string) *SyncFundOrderfinancialRequest {
	s.OrderId = &v
	return s
}

func (s *SyncFundOrderfinancialRequest) SetMerchantTenantId(v string) *SyncFundOrderfinancialRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *SyncFundOrderfinancialRequest) SetApplicationId(v string) *SyncFundOrderfinancialRequest {
	s.ApplicationId = &v
	return s
}

func (s *SyncFundOrderfinancialRequest) SetStatus(v int64) *SyncFundOrderfinancialRequest {
	s.Status = &v
	return s
}

func (s *SyncFundOrderfinancialRequest) SetReason(v string) *SyncFundOrderfinancialRequest {
	s.Reason = &v
	return s
}

func (s *SyncFundOrderfinancialRequest) SetExtras(v string) *SyncFundOrderfinancialRequest {
	s.Extras = &v
	return s
}

type SyncFundOrderfinancialResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果描述信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncFundOrderfinancialResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncFundOrderfinancialResponse) GoString() string {
	return s.String()
}

func (s *SyncFundOrderfinancialResponse) SetReqMsgId(v string) *SyncFundOrderfinancialResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncFundOrderfinancialResponse) SetResultCode(v string) *SyncFundOrderfinancialResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncFundOrderfinancialResponse) SetResultMsg(v string) *SyncFundOrderfinancialResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncFundOrderfinancialResponse) SetResponseData(v string) *SyncFundOrderfinancialResponse {
	s.ResponseData = &v
	return s
}

type SyncFundWithholdingcontractRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 商家在数科注册的租户id
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 代扣协议号
	WithholdingContractId *string `json:"withholding_contract_id,omitempty" xml:"withholding_contract_id,omitempty" require:"true" maxLength:"100" minLength:"1"`
	// json的字符串，存储额外信息
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 签署状态：
	// - ACCEPT : 接受
	// - REFUSE : 拒绝
	// - TIMEOUT : 超时
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s SyncFundWithholdingcontractRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncFundWithholdingcontractRequest) GoString() string {
	return s.String()
}

func (s *SyncFundWithholdingcontractRequest) SetAuthToken(v string) *SyncFundWithholdingcontractRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncFundWithholdingcontractRequest) SetProductInstanceId(v string) *SyncFundWithholdingcontractRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncFundWithholdingcontractRequest) SetOrderId(v string) *SyncFundWithholdingcontractRequest {
	s.OrderId = &v
	return s
}

func (s *SyncFundWithholdingcontractRequest) SetMerchantTenantId(v string) *SyncFundWithholdingcontractRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *SyncFundWithholdingcontractRequest) SetWithholdingContractId(v string) *SyncFundWithholdingcontractRequest {
	s.WithholdingContractId = &v
	return s
}

func (s *SyncFundWithholdingcontractRequest) SetExtraInfo(v string) *SyncFundWithholdingcontractRequest {
	s.ExtraInfo = &v
	return s
}

func (s *SyncFundWithholdingcontractRequest) SetStatus(v string) *SyncFundWithholdingcontractRequest {
	s.Status = &v
	return s
}

type SyncFundWithholdingcontractResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存储成功
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncFundWithholdingcontractResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncFundWithholdingcontractResponse) GoString() string {
	return s.String()
}

func (s *SyncFundWithholdingcontractResponse) SetReqMsgId(v string) *SyncFundWithholdingcontractResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncFundWithholdingcontractResponse) SetResultCode(v string) *SyncFundWithholdingcontractResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncFundWithholdingcontractResponse) SetResultMsg(v string) *SyncFundWithholdingcontractResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncFundWithholdingcontractResponse) SetResponseData(v string) *SyncFundWithholdingcontractResponse {
	s.ResponseData = &v
	return s
}

type SyncFundOrderfulfillmentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户id
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"49" minLength:"1"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"49" minLength:"1"`
	// 租期编号
	LeaseTermIndex *int64 `json:"lease_term_index,omitempty" xml:"lease_term_index,omitempty" require:"true"`
	// 剩余归还期数
	RemainTerm *int64 `json:"remain_term,omitempty" xml:"remain_term,omitempty" require:"true"`
	// 总期数
	TotalTerm *int64 `json:"total_term,omitempty" xml:"total_term,omitempty" require:"true"`
	// 租金归还状态，
	// RETURN_FULL : 足额归还 【终态】
	// NOT_RETURN : 未归还
	// CANCEL : 取消 【终态】
	RentalReturnState *string `json:"rental_return_state,omitempty" xml:"rental_return_state,omitempty" require:"true"`
	// 租金归还金额,精确到分，即1234表示12.34元
	RentalMoney *int64 `json:"rental_money,omitempty" xml:"rental_money,omitempty" require:"true"`
	// 罚息金额，分，1234表示12.34元
	PenaltyFeeMoney *int64 `json:"penalty_fee_money,omitempty" xml:"penalty_fee_money,omitempty" require:"true"`
	// 总金额，单位分
	TotalMoney *int64 `json:"total_money,omitempty" xml:"total_money,omitempty" require:"true"`
	// 归还时间，格式为"2019-07-31 12:00:00"
	ReturnTime *string `json:"return_time,omitempty" xml:"return_time,omitempty"`
	// 归还方式，
	// ANTDIGITAL： 数科代扣
	// FUND : 资方代扣
	// BANK : 银行转账
	// WECHAT : 微信支付
	ReturnWay *string `json:"return_way,omitempty" xml:"return_way,omitempty"`
	// 还款凭证编号
	ReturnVoucherSerial *string `json:"return_voucher_serial,omitempty" xml:"return_voucher_serial,omitempty" maxLength:"127" minLength:"1"`
	// 银行名字
	BankName *string `json:"bank_name,omitempty" xml:"bank_name,omitempty" maxLength:"127"`
}

func (s SyncFundOrderfulfillmentRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncFundOrderfulfillmentRequest) GoString() string {
	return s.String()
}

func (s *SyncFundOrderfulfillmentRequest) SetAuthToken(v string) *SyncFundOrderfulfillmentRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetProductInstanceId(v string) *SyncFundOrderfulfillmentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetMerchantTenantId(v string) *SyncFundOrderfulfillmentRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetOrderId(v string) *SyncFundOrderfulfillmentRequest {
	s.OrderId = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetLeaseTermIndex(v int64) *SyncFundOrderfulfillmentRequest {
	s.LeaseTermIndex = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetRemainTerm(v int64) *SyncFundOrderfulfillmentRequest {
	s.RemainTerm = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetTotalTerm(v int64) *SyncFundOrderfulfillmentRequest {
	s.TotalTerm = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetRentalReturnState(v string) *SyncFundOrderfulfillmentRequest {
	s.RentalReturnState = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetRentalMoney(v int64) *SyncFundOrderfulfillmentRequest {
	s.RentalMoney = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetPenaltyFeeMoney(v int64) *SyncFundOrderfulfillmentRequest {
	s.PenaltyFeeMoney = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetTotalMoney(v int64) *SyncFundOrderfulfillmentRequest {
	s.TotalMoney = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetReturnTime(v string) *SyncFundOrderfulfillmentRequest {
	s.ReturnTime = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetReturnWay(v string) *SyncFundOrderfulfillmentRequest {
	s.ReturnWay = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetReturnVoucherSerial(v string) *SyncFundOrderfulfillmentRequest {
	s.ReturnVoucherSerial = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetBankName(v string) *SyncFundOrderfulfillmentRequest {
	s.BankName = &v
	return s
}

type SyncFundOrderfulfillmentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 添加成功
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncFundOrderfulfillmentResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncFundOrderfulfillmentResponse) GoString() string {
	return s.String()
}

func (s *SyncFundOrderfulfillmentResponse) SetReqMsgId(v string) *SyncFundOrderfulfillmentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncFundOrderfulfillmentResponse) SetResultCode(v string) *SyncFundOrderfulfillmentResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncFundOrderfulfillmentResponse) SetResultMsg(v string) *SyncFundOrderfulfillmentResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncFundOrderfulfillmentResponse) SetResponseData(v string) *SyncFundOrderfulfillmentResponse {
	s.ResponseData = &v
	return s
}

type GetFundOrderfulfillmentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"49" minLength:"1"`
	// 租赁订单所属商家租户id
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"49" minLength:"1"`
	// 期数
	// 如果填入，获取term_idx下的履约记录
	// 如果不填入，获取order_id下的所有履约记录
	TermIdx *int64 `json:"term_idx,omitempty" xml:"term_idx,omitempty"`
}

func (s GetFundOrderfulfillmentRequest) String() string {
	return tea.Prettify(s)
}

func (s GetFundOrderfulfillmentRequest) GoString() string {
	return s.String()
}

func (s *GetFundOrderfulfillmentRequest) SetAuthToken(v string) *GetFundOrderfulfillmentRequest {
	s.AuthToken = &v
	return s
}

func (s *GetFundOrderfulfillmentRequest) SetProductInstanceId(v string) *GetFundOrderfulfillmentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetFundOrderfulfillmentRequest) SetOrderId(v string) *GetFundOrderfulfillmentRequest {
	s.OrderId = &v
	return s
}

func (s *GetFundOrderfulfillmentRequest) SetMerchantTenantId(v string) *GetFundOrderfulfillmentRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *GetFundOrderfulfillmentRequest) SetTermIdx(v int64) *GetFundOrderfulfillmentRequest {
	s.TermIdx = &v
	return s
}

type GetFundOrderfulfillmentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单履约信息的列表数组
	// List<OrderFulfillment> 的jsonArray.toString
	OrderFulfillmentDataList *string `json:"order_fulfillment_data_list,omitempty" xml:"order_fulfillment_data_list,omitempty"`
}

func (s GetFundOrderfulfillmentResponse) String() string {
	return tea.Prettify(s)
}

func (s GetFundOrderfulfillmentResponse) GoString() string {
	return s.String()
}

func (s *GetFundOrderfulfillmentResponse) SetReqMsgId(v string) *GetFundOrderfulfillmentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetFundOrderfulfillmentResponse) SetResultCode(v string) *GetFundOrderfulfillmentResponse {
	s.ResultCode = &v
	return s
}

func (s *GetFundOrderfulfillmentResponse) SetResultMsg(v string) *GetFundOrderfulfillmentResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetFundOrderfulfillmentResponse) SetOrderFulfillmentDataList(v string) *GetFundOrderfulfillmentResponse {
	s.OrderFulfillmentDataList = &v
	return s
}

type UploadFundFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单所属商户的统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 签署合同单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true"`
	// 返回的文件fileItemNo编号
	FileItemNo *string `json:"file_item_no,omitempty" xml:"file_item_no,omitempty" require:"true"`
	// 上传的pdf文件，需要以.pdf后缀结尾
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 资方统一社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty"`
}

func (s UploadFundFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadFundFlowRequest) GoString() string {
	return s.String()
}

func (s *UploadFundFlowRequest) SetAuthToken(v string) *UploadFundFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadFundFlowRequest) SetProductInstanceId(v string) *UploadFundFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadFundFlowRequest) SetMerchantId(v string) *UploadFundFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *UploadFundFlowRequest) SetOrderId(v string) *UploadFundFlowRequest {
	s.OrderId = &v
	return s
}

func (s *UploadFundFlowRequest) SetSignNo(v string) *UploadFundFlowRequest {
	s.SignNo = &v
	return s
}

func (s *UploadFundFlowRequest) SetFileItemNo(v string) *UploadFundFlowRequest {
	s.FileItemNo = &v
	return s
}

func (s *UploadFundFlowRequest) SetFileObject(v io.Reader) *UploadFundFlowRequest {
	s.FileObject = v
	return s
}

func (s *UploadFundFlowRequest) SetFileObjectName(v string) *UploadFundFlowRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadFundFlowRequest) SetFileId(v string) *UploadFundFlowRequest {
	s.FileId = &v
	return s
}

func (s *UploadFundFlowRequest) SetFundId(v string) *UploadFundFlowRequest {
	s.FundId = &v
	return s
}

type UploadFundFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UploadFundFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadFundFlowResponse) GoString() string {
	return s.String()
}

func (s *UploadFundFlowResponse) SetReqMsgId(v string) *UploadFundFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadFundFlowResponse) SetResultCode(v string) *UploadFundFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadFundFlowResponse) SetResultMsg(v string) *UploadFundFlowResponse {
	s.ResultMsg = &v
	return s
}

type GetFundFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单所属商户的统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 合同类型
	ContractType *string `json:"contract_type,omitempty" xml:"contract_type,omitempty"`
	// 资方统一社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty"`
}

func (s GetFundFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s GetFundFlowRequest) GoString() string {
	return s.String()
}

func (s *GetFundFlowRequest) SetAuthToken(v string) *GetFundFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *GetFundFlowRequest) SetProductInstanceId(v string) *GetFundFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetFundFlowRequest) SetMerchantId(v string) *GetFundFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *GetFundFlowRequest) SetOrderId(v string) *GetFundFlowRequest {
	s.OrderId = &v
	return s
}

func (s *GetFundFlowRequest) SetContractType(v string) *GetFundFlowRequest {
	s.ContractType = &v
	return s
}

func (s *GetFundFlowRequest) SetFundId(v string) *GetFundFlowRequest {
	s.FundId = &v
	return s
}

type GetFundFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 需要落章的合同列表，需要status状态为FINISH可以落章
	ContractList *string `json:"contract_list,omitempty" xml:"contract_list,omitempty"`
}

func (s GetFundFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s GetFundFlowResponse) GoString() string {
	return s.String()
}

func (s *GetFundFlowResponse) SetReqMsgId(v string) *GetFundFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetFundFlowResponse) SetResultCode(v string) *GetFundFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *GetFundFlowResponse) SetResultMsg(v string) *GetFundFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetFundFlowResponse) SetOrderId(v string) *GetFundFlowResponse {
	s.OrderId = &v
	return s
}

func (s *GetFundFlowResponse) SetContractList(v string) *GetFundFlowResponse {
	s.ContractList = &v
	return s
}

type RefuseFundFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单所属商户的统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 签署合同单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true"`
	// 填写拒绝落章原因，如果同意则不用填写
	SignReason *string `json:"sign_reason,omitempty" xml:"sign_reason,omitempty"`
	// 资方统一社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty"`
}

func (s RefuseFundFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s RefuseFundFlowRequest) GoString() string {
	return s.String()
}

func (s *RefuseFundFlowRequest) SetAuthToken(v string) *RefuseFundFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *RefuseFundFlowRequest) SetProductInstanceId(v string) *RefuseFundFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RefuseFundFlowRequest) SetMerchantId(v string) *RefuseFundFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *RefuseFundFlowRequest) SetOrderId(v string) *RefuseFundFlowRequest {
	s.OrderId = &v
	return s
}

func (s *RefuseFundFlowRequest) SetSignNo(v string) *RefuseFundFlowRequest {
	s.SignNo = &v
	return s
}

func (s *RefuseFundFlowRequest) SetSignReason(v string) *RefuseFundFlowRequest {
	s.SignReason = &v
	return s
}

func (s *RefuseFundFlowRequest) SetFundId(v string) *RefuseFundFlowRequest {
	s.FundId = &v
	return s
}

type RefuseFundFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RefuseFundFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s RefuseFundFlowResponse) GoString() string {
	return s.String()
}

func (s *RefuseFundFlowResponse) SetReqMsgId(v string) *RefuseFundFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RefuseFundFlowResponse) SetResultCode(v string) *RefuseFundFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *RefuseFundFlowResponse) SetResultMsg(v string) *RefuseFundFlowResponse {
	s.ResultMsg = &v
	return s
}

type AuthFundFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单所属商户的统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 签署的电子合同ID
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true"`
	// 签署区域的tag，和发起签署流程的机构的tag对应
	Tag *string `json:"tag,omitempty" xml:"tag,omitempty" require:"true"`
}

func (s AuthFundFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthFundFlowRequest) GoString() string {
	return s.String()
}

func (s *AuthFundFlowRequest) SetAuthToken(v string) *AuthFundFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthFundFlowRequest) SetProductInstanceId(v string) *AuthFundFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthFundFlowRequest) SetMerchantId(v string) *AuthFundFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *AuthFundFlowRequest) SetOrderId(v string) *AuthFundFlowRequest {
	s.OrderId = &v
	return s
}

func (s *AuthFundFlowRequest) SetSignNo(v string) *AuthFundFlowRequest {
	s.SignNo = &v
	return s
}

func (s *AuthFundFlowRequest) SetTag(v string) *AuthFundFlowRequest {
	s.Tag = &v
	return s
}

type AuthFundFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署最后落签的签署区域id列表
	SignFieldIds *string `json:"sign_field_ids,omitempty" xml:"sign_field_ids,omitempty"`
}

func (s AuthFundFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthFundFlowResponse) GoString() string {
	return s.String()
}

func (s *AuthFundFlowResponse) SetReqMsgId(v string) *AuthFundFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthFundFlowResponse) SetResultCode(v string) *AuthFundFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthFundFlowResponse) SetResultMsg(v string) *AuthFundFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthFundFlowResponse) SetSignFieldIds(v string) *AuthFundFlowResponse {
	s.SignFieldIds = &v
	return s
}

type CancelFundPlanRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 取消原因
	// ACTIVE_REDEEM:自主赎回
	// RENTING_OUT_REDEEM:退租赎回
	// RENTING_AND_RESALE_REDEEM:租转售赎回
	CancelReason *string `json:"cancel_reason,omitempty" xml:"cancel_reason,omitempty" require:"true"`
	// 融资单的资方社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" maxLength:"64"`
	// 操作
	Operation *string `json:"operation,omitempty" xml:"operation,omitempty" maxLength:"64"`
	// 赎回金额,单位为分,取消并赎回时必填
	RedeemAmount *int64 `json:"redeem_amount,omitempty" xml:"redeem_amount,omitempty" minimum:"10"`
}

func (s CancelFundPlanRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelFundPlanRequest) GoString() string {
	return s.String()
}

func (s *CancelFundPlanRequest) SetAuthToken(v string) *CancelFundPlanRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelFundPlanRequest) SetProductInstanceId(v string) *CancelFundPlanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelFundPlanRequest) SetOrderId(v string) *CancelFundPlanRequest {
	s.OrderId = &v
	return s
}

func (s *CancelFundPlanRequest) SetMerchantId(v string) *CancelFundPlanRequest {
	s.MerchantId = &v
	return s
}

func (s *CancelFundPlanRequest) SetCancelReason(v string) *CancelFundPlanRequest {
	s.CancelReason = &v
	return s
}

func (s *CancelFundPlanRequest) SetFundId(v string) *CancelFundPlanRequest {
	s.FundId = &v
	return s
}

func (s *CancelFundPlanRequest) SetOperation(v string) *CancelFundPlanRequest {
	s.Operation = &v
	return s
}

func (s *CancelFundPlanRequest) SetRedeemAmount(v int64) *CancelFundPlanRequest {
	s.RedeemAmount = &v
	return s
}

type CancelFundPlanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CancelFundPlanResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelFundPlanResponse) GoString() string {
	return s.String()
}

func (s *CancelFundPlanResponse) SetReqMsgId(v string) *CancelFundPlanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelFundPlanResponse) SetResultCode(v string) *CancelFundPlanResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelFundPlanResponse) SetResultMsg(v string) *CancelFundPlanResponse {
	s.ResultMsg = &v
	return s
}

type CallbackFundNotifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// ASYNC_UNSIGN_APPLY
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 数据
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s CallbackFundNotifyRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackFundNotifyRequest) GoString() string {
	return s.String()
}

func (s *CallbackFundNotifyRequest) SetAuthToken(v string) *CallbackFundNotifyRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackFundNotifyRequest) SetProductInstanceId(v string) *CallbackFundNotifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackFundNotifyRequest) SetType(v string) *CallbackFundNotifyRequest {
	s.Type = &v
	return s
}

func (s *CallbackFundNotifyRequest) SetData(v string) *CallbackFundNotifyRequest {
	s.Data = &v
	return s
}

type CallbackFundNotifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CallbackFundNotifyResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackFundNotifyResponse) GoString() string {
	return s.String()
}

func (s *CallbackFundNotifyResponse) SetReqMsgId(v string) *CallbackFundNotifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackFundNotifyResponse) SetResultCode(v string) *CallbackFundNotifyResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackFundNotifyResponse) SetResultMsg(v string) *CallbackFundNotifyResponse {
	s.ResultMsg = &v
	return s
}

type SyncFundMerchantpromiseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// json字符串,填入「MerchantPromiseReq」的json字符串
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true" minLength:"1"`
	// 资方公司社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" maxLength:"64"`
}

func (s SyncFundMerchantpromiseRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncFundMerchantpromiseRequest) GoString() string {
	return s.String()
}

func (s *SyncFundMerchantpromiseRequest) SetAuthToken(v string) *SyncFundMerchantpromiseRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncFundMerchantpromiseRequest) SetProductInstanceId(v string) *SyncFundMerchantpromiseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncFundMerchantpromiseRequest) SetOrderId(v string) *SyncFundMerchantpromiseRequest {
	s.OrderId = &v
	return s
}

func (s *SyncFundMerchantpromiseRequest) SetMerchantId(v string) *SyncFundMerchantpromiseRequest {
	s.MerchantId = &v
	return s
}

func (s *SyncFundMerchantpromiseRequest) SetBizContent(v string) *SyncFundMerchantpromiseRequest {
	s.BizContent = &v
	return s
}

func (s *SyncFundMerchantpromiseRequest) SetFundId(v string) *SyncFundMerchantpromiseRequest {
	s.FundId = &v
	return s
}

type SyncFundMerchantpromiseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 订单所属商家社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
}

func (s SyncFundMerchantpromiseResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncFundMerchantpromiseResponse) GoString() string {
	return s.String()
}

func (s *SyncFundMerchantpromiseResponse) SetReqMsgId(v string) *SyncFundMerchantpromiseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncFundMerchantpromiseResponse) SetResultCode(v string) *SyncFundMerchantpromiseResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncFundMerchantpromiseResponse) SetResultMsg(v string) *SyncFundMerchantpromiseResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncFundMerchantpromiseResponse) SetOrderId(v string) *SyncFundMerchantpromiseResponse {
	s.OrderId = &v
	return s
}

func (s *SyncFundMerchantpromiseResponse) SetMerchantId(v string) *SyncFundMerchantpromiseResponse {
	s.MerchantId = &v
	return s
}

type SyncFundFinanceloanresultsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 商家的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"200" minLength:"1"`
	// json字符串,填入「FinanceLoanResultsReq」的json字符串
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true" minLength:"1"`
	// 资方的社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" maxLength:"64"`
}

func (s SyncFundFinanceloanresultsRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncFundFinanceloanresultsRequest) GoString() string {
	return s.String()
}

func (s *SyncFundFinanceloanresultsRequest) SetAuthToken(v string) *SyncFundFinanceloanresultsRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncFundFinanceloanresultsRequest) SetProductInstanceId(v string) *SyncFundFinanceloanresultsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncFundFinanceloanresultsRequest) SetOrderId(v string) *SyncFundFinanceloanresultsRequest {
	s.OrderId = &v
	return s
}

func (s *SyncFundFinanceloanresultsRequest) SetMerchantId(v string) *SyncFundFinanceloanresultsRequest {
	s.MerchantId = &v
	return s
}

func (s *SyncFundFinanceloanresultsRequest) SetBizContent(v string) *SyncFundFinanceloanresultsRequest {
	s.BizContent = &v
	return s
}

func (s *SyncFundFinanceloanresultsRequest) SetFundId(v string) *SyncFundFinanceloanresultsRequest {
	s.FundId = &v
	return s
}

type SyncFundFinanceloanresultsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// "ERROR": 放款同步异常
	// “SUCCESS":放款同步成功
	LoanResult *string `json:"loan_result,omitempty" xml:"loan_result,omitempty"`
}

func (s SyncFundFinanceloanresultsResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncFundFinanceloanresultsResponse) GoString() string {
	return s.String()
}

func (s *SyncFundFinanceloanresultsResponse) SetReqMsgId(v string) *SyncFundFinanceloanresultsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncFundFinanceloanresultsResponse) SetResultCode(v string) *SyncFundFinanceloanresultsResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncFundFinanceloanresultsResponse) SetResultMsg(v string) *SyncFundFinanceloanresultsResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncFundFinanceloanresultsResponse) SetOrderId(v string) *SyncFundFinanceloanresultsResponse {
	s.OrderId = &v
	return s
}

func (s *SyncFundFinanceloanresultsResponse) SetMerchantId(v string) *SyncFundFinanceloanresultsResponse {
	s.MerchantId = &v
	return s
}

func (s *SyncFundFinanceloanresultsResponse) SetLoanResult(v string) *SyncFundFinanceloanresultsResponse {
	s.LoanResult = &v
	return s
}

type GetFundUserpromiseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"200" minLength:"1"`
	// 资方的社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" maxLength:"64"`
}

func (s GetFundUserpromiseRequest) String() string {
	return tea.Prettify(s)
}

func (s GetFundUserpromiseRequest) GoString() string {
	return s.String()
}

func (s *GetFundUserpromiseRequest) SetAuthToken(v string) *GetFundUserpromiseRequest {
	s.AuthToken = &v
	return s
}

func (s *GetFundUserpromiseRequest) SetProductInstanceId(v string) *GetFundUserpromiseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetFundUserpromiseRequest) SetOrderId(v string) *GetFundUserpromiseRequest {
	s.OrderId = &v
	return s
}

func (s *GetFundUserpromiseRequest) SetMerchantId(v string) *GetFundUserpromiseRequest {
	s.MerchantId = &v
	return s
}

func (s *GetFundUserpromiseRequest) SetFundId(v string) *GetFundUserpromiseRequest {
	s.FundId = &v
	return s
}

type GetFundUserpromiseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回值为「OrderPromise」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetFundUserpromiseResponse) String() string {
	return tea.Prettify(s)
}

func (s GetFundUserpromiseResponse) GoString() string {
	return s.String()
}

func (s *GetFundUserpromiseResponse) SetReqMsgId(v string) *GetFundUserpromiseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetFundUserpromiseResponse) SetResultCode(v string) *GetFundUserpromiseResponse {
	s.ResultCode = &v
	return s
}

func (s *GetFundUserpromiseResponse) SetResultMsg(v string) *GetFundUserpromiseResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetFundUserpromiseResponse) SetResponseData(v string) *GetFundUserpromiseResponse {
	s.ResponseData = &v
	return s
}

type GetFundUserperformanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 订单所属融资公司的社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s GetFundUserperformanceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetFundUserperformanceRequest) GoString() string {
	return s.String()
}

func (s *GetFundUserperformanceRequest) SetAuthToken(v string) *GetFundUserperformanceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetFundUserperformanceRequest) SetProductInstanceId(v string) *GetFundUserperformanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetFundUserperformanceRequest) SetOrderId(v string) *GetFundUserperformanceRequest {
	s.OrderId = &v
	return s
}

func (s *GetFundUserperformanceRequest) SetMerchantId(v string) *GetFundUserperformanceRequest {
	s.MerchantId = &v
	return s
}

func (s *GetFundUserperformanceRequest) SetFundId(v string) *GetFundUserperformanceRequest {
	s.FundId = &v
	return s
}

type GetFundUserperformanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 「UserPerformanceInfo」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetFundUserperformanceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetFundUserperformanceResponse) GoString() string {
	return s.String()
}

func (s *GetFundUserperformanceResponse) SetReqMsgId(v string) *GetFundUserperformanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetFundUserperformanceResponse) SetResultCode(v string) *GetFundUserperformanceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetFundUserperformanceResponse) SetResultMsg(v string) *GetFundUserperformanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetFundUserperformanceResponse) SetResponseData(v string) *GetFundUserperformanceResponse {
	s.ResponseData = &v
	return s
}

type GetFundMerchantperformanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 订单所属融资方的社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s GetFundMerchantperformanceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetFundMerchantperformanceRequest) GoString() string {
	return s.String()
}

func (s *GetFundMerchantperformanceRequest) SetAuthToken(v string) *GetFundMerchantperformanceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetFundMerchantperformanceRequest) SetProductInstanceId(v string) *GetFundMerchantperformanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetFundMerchantperformanceRequest) SetOrderId(v string) *GetFundMerchantperformanceRequest {
	s.OrderId = &v
	return s
}

func (s *GetFundMerchantperformanceRequest) SetMerchantId(v string) *GetFundMerchantperformanceRequest {
	s.MerchantId = &v
	return s
}

func (s *GetFundMerchantperformanceRequest) SetFundId(v string) *GetFundMerchantperformanceRequest {
	s.FundId = &v
	return s
}

type GetFundMerchantperformanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 「MerchantPerformanceInfo」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetFundMerchantperformanceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetFundMerchantperformanceResponse) GoString() string {
	return s.String()
}

func (s *GetFundMerchantperformanceResponse) SetReqMsgId(v string) *GetFundMerchantperformanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetFundMerchantperformanceResponse) SetResultCode(v string) *GetFundMerchantperformanceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetFundMerchantperformanceResponse) SetResultMsg(v string) *GetFundMerchantperformanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetFundMerchantperformanceResponse) SetResponseData(v string) *GetFundMerchantperformanceResponse {
	s.ResponseData = &v
	return s
}

type GetFundOrderfullinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单Id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 订单所属商户的社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s GetFundOrderfullinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s GetFundOrderfullinfoRequest) GoString() string {
	return s.String()
}

func (s *GetFundOrderfullinfoRequest) SetAuthToken(v string) *GetFundOrderfullinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *GetFundOrderfullinfoRequest) SetProductInstanceId(v string) *GetFundOrderfullinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetFundOrderfullinfoRequest) SetOrderId(v string) *GetFundOrderfullinfoRequest {
	s.OrderId = &v
	return s
}

func (s *GetFundOrderfullinfoRequest) SetMerchantId(v string) *GetFundOrderfullinfoRequest {
	s.MerchantId = &v
	return s
}

func (s *GetFundOrderfullinfoRequest) SetFundId(v string) *GetFundOrderfullinfoRequest {
	s.FundId = &v
	return s
}

type GetFundOrderfullinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// OrderFullInfoResp的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetFundOrderfullinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s GetFundOrderfullinfoResponse) GoString() string {
	return s.String()
}

func (s *GetFundOrderfullinfoResponse) SetReqMsgId(v string) *GetFundOrderfullinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetFundOrderfullinfoResponse) SetResultCode(v string) *GetFundOrderfullinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *GetFundOrderfullinfoResponse) SetResultMsg(v string) *GetFundOrderfullinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetFundOrderfullinfoResponse) SetResponseData(v string) *GetFundOrderfullinfoResponse {
	s.ResponseData = &v
	return s
}

type NotifyFundFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单所属商户的统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 签署合同单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true"`
	// 返回的文件fileItemNo编号
	FileItemNo *string `json:"file_item_no,omitempty" xml:"file_item_no,omitempty" require:"true"`
	// 资方统一社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty"`
}

func (s NotifyFundFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s NotifyFundFlowRequest) GoString() string {
	return s.String()
}

func (s *NotifyFundFlowRequest) SetAuthToken(v string) *NotifyFundFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *NotifyFundFlowRequest) SetProductInstanceId(v string) *NotifyFundFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *NotifyFundFlowRequest) SetMerchantId(v string) *NotifyFundFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *NotifyFundFlowRequest) SetOrderId(v string) *NotifyFundFlowRequest {
	s.OrderId = &v
	return s
}

func (s *NotifyFundFlowRequest) SetSignNo(v string) *NotifyFundFlowRequest {
	s.SignNo = &v
	return s
}

func (s *NotifyFundFlowRequest) SetFileItemNo(v string) *NotifyFundFlowRequest {
	s.FileItemNo = &v
	return s
}

func (s *NotifyFundFlowRequest) SetFundId(v string) *NotifyFundFlowRequest {
	s.FundId = &v
	return s
}

type NotifyFundFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s NotifyFundFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s NotifyFundFlowResponse) GoString() string {
	return s.String()
}

func (s *NotifyFundFlowResponse) SetReqMsgId(v string) *NotifyFundFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *NotifyFundFlowResponse) SetResultCode(v string) *NotifyFundFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *NotifyFundFlowResponse) SetResultMsg(v string) *NotifyFundFlowResponse {
	s.ResultMsg = &v
	return s
}

type UploadFundCreditRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号类型
	OrderNoType *string `json:"order_no_type,omitempty" xml:"order_no_type,omitempty" require:"true"`
	// 订单号，或资产包号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 资方统一社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true"`
	// 凭证类型
	CreditType *string `json:"credit_type,omitempty" xml:"credit_type,omitempty" require:"true"`
	// 凭证名称
	CreditName *string `json:"credit_name,omitempty" xml:"credit_name,omitempty"`
	// 文本类型
	ContentType *string `json:"content_type,omitempty" xml:"content_type,omitempty" require:"true"`
	// 文本下载链接，如果类型是FILE则必填
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty"`
	// 内容数据，格式为JSON类型文本，如果类型是JSON_TEXT则必填
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 商户统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
}

func (s UploadFundCreditRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadFundCreditRequest) GoString() string {
	return s.String()
}

func (s *UploadFundCreditRequest) SetAuthToken(v string) *UploadFundCreditRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadFundCreditRequest) SetProductInstanceId(v string) *UploadFundCreditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadFundCreditRequest) SetOrderNoType(v string) *UploadFundCreditRequest {
	s.OrderNoType = &v
	return s
}

func (s *UploadFundCreditRequest) SetOrderNo(v string) *UploadFundCreditRequest {
	s.OrderNo = &v
	return s
}

func (s *UploadFundCreditRequest) SetFundId(v string) *UploadFundCreditRequest {
	s.FundId = &v
	return s
}

func (s *UploadFundCreditRequest) SetCreditType(v string) *UploadFundCreditRequest {
	s.CreditType = &v
	return s
}

func (s *UploadFundCreditRequest) SetCreditName(v string) *UploadFundCreditRequest {
	s.CreditName = &v
	return s
}

func (s *UploadFundCreditRequest) SetContentType(v string) *UploadFundCreditRequest {
	s.ContentType = &v
	return s
}

func (s *UploadFundCreditRequest) SetFileUrl(v string) *UploadFundCreditRequest {
	s.FileUrl = &v
	return s
}

func (s *UploadFundCreditRequest) SetContent(v string) *UploadFundCreditRequest {
	s.Content = &v
	return s
}

func (s *UploadFundCreditRequest) SetMerchantId(v string) *UploadFundCreditRequest {
	s.MerchantId = &v
	return s
}

type UploadFundCreditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 凭证内容id
	ContentId *string `json:"content_id,omitempty" xml:"content_id,omitempty"`
}

func (s UploadFundCreditResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadFundCreditResponse) GoString() string {
	return s.String()
}

func (s *UploadFundCreditResponse) SetReqMsgId(v string) *UploadFundCreditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadFundCreditResponse) SetResultCode(v string) *UploadFundCreditResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadFundCreditResponse) SetResultMsg(v string) *UploadFundCreditResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadFundCreditResponse) SetContentId(v string) *UploadFundCreditResponse {
	s.ContentId = &v
	return s
}

type QueryFundCreditRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号类型
	OrderNoType *string `json:"order_no_type,omitempty" xml:"order_no_type,omitempty" require:"true"`
	// 订单号，或资产包号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 资方统一社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true"`
	// 商户统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
}

func (s QueryFundCreditRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFundCreditRequest) GoString() string {
	return s.String()
}

func (s *QueryFundCreditRequest) SetAuthToken(v string) *QueryFundCreditRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFundCreditRequest) SetProductInstanceId(v string) *QueryFundCreditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFundCreditRequest) SetOrderNoType(v string) *QueryFundCreditRequest {
	s.OrderNoType = &v
	return s
}

func (s *QueryFundCreditRequest) SetOrderNo(v string) *QueryFundCreditRequest {
	s.OrderNo = &v
	return s
}

func (s *QueryFundCreditRequest) SetFundId(v string) *QueryFundCreditRequest {
	s.FundId = &v
	return s
}

func (s *QueryFundCreditRequest) SetMerchantId(v string) *QueryFundCreditRequest {
	s.MerchantId = &v
	return s
}

type QueryFundCreditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 内容信息
	ContentInfo *string `json:"content_info,omitempty" xml:"content_info,omitempty"`
}

func (s QueryFundCreditResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFundCreditResponse) GoString() string {
	return s.String()
}

func (s *QueryFundCreditResponse) SetReqMsgId(v string) *QueryFundCreditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFundCreditResponse) SetResultCode(v string) *QueryFundCreditResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFundCreditResponse) SetResultMsg(v string) *QueryFundCreditResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFundCreditResponse) SetContentInfo(v string) *QueryFundCreditResponse {
	s.ContentInfo = &v
	return s
}

type SyncFundFinanceprecheckresultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" minLength:"6"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" minLength:"1"`
	// 资方的社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true" minLength:"1"`
	// 预审结果
	// ● APPROVAL ： 通过
	// ● REFUSE ：拒绝
	Result *string `json:"result,omitempty" xml:"result,omitempty" require:"true" minLength:"1"`
	// 拒绝原因
	RefuseReason *string `json:"refuse_reason,omitempty" xml:"refuse_reason,omitempty" maxLength:"100"`
}

func (s SyncFundFinanceprecheckresultRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncFundFinanceprecheckresultRequest) GoString() string {
	return s.String()
}

func (s *SyncFundFinanceprecheckresultRequest) SetAuthToken(v string) *SyncFundFinanceprecheckresultRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncFundFinanceprecheckresultRequest) SetProductInstanceId(v string) *SyncFundFinanceprecheckresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncFundFinanceprecheckresultRequest) SetOrderId(v string) *SyncFundFinanceprecheckresultRequest {
	s.OrderId = &v
	return s
}

func (s *SyncFundFinanceprecheckresultRequest) SetMerchantId(v string) *SyncFundFinanceprecheckresultRequest {
	s.MerchantId = &v
	return s
}

func (s *SyncFundFinanceprecheckresultRequest) SetFundId(v string) *SyncFundFinanceprecheckresultRequest {
	s.FundId = &v
	return s
}

func (s *SyncFundFinanceprecheckresultRequest) SetResult(v string) *SyncFundFinanceprecheckresultRequest {
	s.Result = &v
	return s
}

func (s *SyncFundFinanceprecheckresultRequest) SetRefuseReason(v string) *SyncFundFinanceprecheckresultRequest {
	s.RefuseReason = &v
	return s
}

type SyncFundFinanceprecheckresultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SyncFundFinanceprecheckresultResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncFundFinanceprecheckresultResponse) GoString() string {
	return s.String()
}

func (s *SyncFundFinanceprecheckresultResponse) SetReqMsgId(v string) *SyncFundFinanceprecheckresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncFundFinanceprecheckresultResponse) SetResultCode(v string) *SyncFundFinanceprecheckresultResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncFundFinanceprecheckresultResponse) SetResultMsg(v string) *SyncFundFinanceprecheckresultResponse {
	s.ResultMsg = &v
	return s
}

type QueryFundCompensateaccountRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资方社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 商户社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 商户租户id
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s QueryFundCompensateaccountRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFundCompensateaccountRequest) GoString() string {
	return s.String()
}

func (s *QueryFundCompensateaccountRequest) SetAuthToken(v string) *QueryFundCompensateaccountRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFundCompensateaccountRequest) SetProductInstanceId(v string) *QueryFundCompensateaccountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFundCompensateaccountRequest) SetFundId(v string) *QueryFundCompensateaccountRequest {
	s.FundId = &v
	return s
}

func (s *QueryFundCompensateaccountRequest) SetMerchantId(v string) *QueryFundCompensateaccountRequest {
	s.MerchantId = &v
	return s
}

func (s *QueryFundCompensateaccountRequest) SetMerchantTenantId(v string) *QueryFundCompensateaccountRequest {
	s.MerchantTenantId = &v
	return s
}

type QueryFundCompensateaccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 可用余额，单位为分
	AvailableAmount *int64 `json:"available_amount,omitempty" xml:"available_amount,omitempty"`
}

func (s QueryFundCompensateaccountResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFundCompensateaccountResponse) GoString() string {
	return s.String()
}

func (s *QueryFundCompensateaccountResponse) SetReqMsgId(v string) *QueryFundCompensateaccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFundCompensateaccountResponse) SetResultCode(v string) *QueryFundCompensateaccountResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFundCompensateaccountResponse) SetResultMsg(v string) *QueryFundCompensateaccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFundCompensateaccountResponse) SetAvailableAmount(v int64) *QueryFundCompensateaccountResponse {
	s.AvailableAmount = &v
	return s
}

type GetFundOrderfinanceinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// order_id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" minLength:"1"`
	// merchant_id
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" minLength:"1"`
	// fund_id
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true" minLength:"1"`
}

func (s GetFundOrderfinanceinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s GetFundOrderfinanceinfoRequest) GoString() string {
	return s.String()
}

func (s *GetFundOrderfinanceinfoRequest) SetAuthToken(v string) *GetFundOrderfinanceinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *GetFundOrderfinanceinfoRequest) SetProductInstanceId(v string) *GetFundOrderfinanceinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetFundOrderfinanceinfoRequest) SetOrderId(v string) *GetFundOrderfinanceinfoRequest {
	s.OrderId = &v
	return s
}

func (s *GetFundOrderfinanceinfoRequest) SetMerchantId(v string) *GetFundOrderfinanceinfoRequest {
	s.MerchantId = &v
	return s
}

func (s *GetFundOrderfinanceinfoRequest) SetFundId(v string) *GetFundOrderfinanceinfoRequest {
	s.FundId = &v
	return s
}

type GetFundOrderfinanceinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// {}
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetFundOrderfinanceinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s GetFundOrderfinanceinfoResponse) GoString() string {
	return s.String()
}

func (s *GetFundOrderfinanceinfoResponse) SetReqMsgId(v string) *GetFundOrderfinanceinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetFundOrderfinanceinfoResponse) SetResultCode(v string) *GetFundOrderfinanceinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *GetFundOrderfinanceinfoResponse) SetResultMsg(v string) *GetFundOrderfinanceinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetFundOrderfinanceinfoResponse) SetResponseData(v string) *GetFundOrderfinanceinfoResponse {
	s.ResponseData = &v
	return s
}

type AddFundDividerelationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 被分账方社会统一信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 分账方信息，最多支持10组
	DivideBindingTransInInfoList []*DivideBindingTransInInfo `json:"divide_binding_trans_in_info_list,omitempty" xml:"divide_binding_trans_in_info_list,omitempty" require:"true" type:"Repeated"`
	// 分账比例上限
	DivideRadio *string `json:"divide_radio,omitempty" xml:"divide_radio,omitempty"`
}

func (s AddFundDividerelationRequest) String() string {
	return tea.Prettify(s)
}

func (s AddFundDividerelationRequest) GoString() string {
	return s.String()
}

func (s *AddFundDividerelationRequest) SetAuthToken(v string) *AddFundDividerelationRequest {
	s.AuthToken = &v
	return s
}

func (s *AddFundDividerelationRequest) SetProductInstanceId(v string) *AddFundDividerelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddFundDividerelationRequest) SetMerchantId(v string) *AddFundDividerelationRequest {
	s.MerchantId = &v
	return s
}

func (s *AddFundDividerelationRequest) SetDivideBindingTransInInfoList(v []*DivideBindingTransInInfo) *AddFundDividerelationRequest {
	s.DivideBindingTransInInfoList = v
	return s
}

func (s *AddFundDividerelationRequest) SetDivideRadio(v string) *AddFundDividerelationRequest {
	s.DivideRadio = &v
	return s
}

type AddFundDividerelationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AddFundDividerelationResponse) String() string {
	return tea.Prettify(s)
}

func (s AddFundDividerelationResponse) GoString() string {
	return s.String()
}

func (s *AddFundDividerelationResponse) SetReqMsgId(v string) *AddFundDividerelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddFundDividerelationResponse) SetResultCode(v string) *AddFundDividerelationResponse {
	s.ResultCode = &v
	return s
}

func (s *AddFundDividerelationResponse) SetResultMsg(v string) *AddFundDividerelationResponse {
	s.ResultMsg = &v
	return s
}

type QueryFundDividerelationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 被分账方社会统一信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
}

func (s QueryFundDividerelationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFundDividerelationRequest) GoString() string {
	return s.String()
}

func (s *QueryFundDividerelationRequest) SetAuthToken(v string) *QueryFundDividerelationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFundDividerelationRequest) SetProductInstanceId(v string) *QueryFundDividerelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFundDividerelationRequest) SetMerchantId(v string) *QueryFundDividerelationRequest {
	s.MerchantId = &v
	return s
}

type QueryFundDividerelationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分账绑定关系支付宝pid
	AlipayPidList []*string `json:"alipay_pid_list,omitempty" xml:"alipay_pid_list,omitempty" type:"Repeated"`
	// 分账比例上限
	DivideRadio *string `json:"divide_radio,omitempty" xml:"divide_radio,omitempty"`
}

func (s QueryFundDividerelationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFundDividerelationResponse) GoString() string {
	return s.String()
}

func (s *QueryFundDividerelationResponse) SetReqMsgId(v string) *QueryFundDividerelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFundDividerelationResponse) SetResultCode(v string) *QueryFundDividerelationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFundDividerelationResponse) SetResultMsg(v string) *QueryFundDividerelationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFundDividerelationResponse) SetAlipayPidList(v []*string) *QueryFundDividerelationResponse {
	s.AlipayPidList = v
	return s
}

func (s *QueryFundDividerelationResponse) SetDivideRadio(v string) *QueryFundDividerelationResponse {
	s.DivideRadio = &v
	return s
}

type ApplyFundCreditutilizationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单列表
	OrderList []*CreditUtilizationOrder `json:"order_list,omitempty" xml:"order_list,omitempty" require:"true" type:"Repeated"`
	// 商户租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true" maxLength:"20" minLength:"1"`
	// 商户统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"200" minLength:"1"`
	// 资方统一社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true" maxLength:"200" minLength:"1"`
	// 授信Id
	GrantingId *string `json:"granting_id,omitempty" xml:"granting_id,omitempty" require:"true" maxLength:"20" minLength:"10"`
	// 用信授权id
	UtilizationAuthId *string `json:"utilization_auth_id,omitempty" xml:"utilization_auth_id,omitempty" require:"true" maxLength:"20" minLength:"10"`
	// 用信id, 需保证唯一性
	UtilizationId *string `json:"utilization_id,omitempty" xml:"utilization_id,omitempty" require:"true" maxLength:"20" minLength:"10"`
}

func (s ApplyFundCreditutilizationRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyFundCreditutilizationRequest) GoString() string {
	return s.String()
}

func (s *ApplyFundCreditutilizationRequest) SetAuthToken(v string) *ApplyFundCreditutilizationRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyFundCreditutilizationRequest) SetProductInstanceId(v string) *ApplyFundCreditutilizationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyFundCreditutilizationRequest) SetOrderList(v []*CreditUtilizationOrder) *ApplyFundCreditutilizationRequest {
	s.OrderList = v
	return s
}

func (s *ApplyFundCreditutilizationRequest) SetTenantId(v string) *ApplyFundCreditutilizationRequest {
	s.TenantId = &v
	return s
}

func (s *ApplyFundCreditutilizationRequest) SetMerchantId(v string) *ApplyFundCreditutilizationRequest {
	s.MerchantId = &v
	return s
}

func (s *ApplyFundCreditutilizationRequest) SetFundId(v string) *ApplyFundCreditutilizationRequest {
	s.FundId = &v
	return s
}

func (s *ApplyFundCreditutilizationRequest) SetGrantingId(v string) *ApplyFundCreditutilizationRequest {
	s.GrantingId = &v
	return s
}

func (s *ApplyFundCreditutilizationRequest) SetUtilizationAuthId(v string) *ApplyFundCreditutilizationRequest {
	s.UtilizationAuthId = &v
	return s
}

func (s *ApplyFundCreditutilizationRequest) SetUtilizationId(v string) *ApplyFundCreditutilizationRequest {
	s.UtilizationId = &v
	return s
}

type ApplyFundCreditutilizationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用信Id
	UtilizationId *string `json:"utilization_id,omitempty" xml:"utilization_id,omitempty"`
	// 用信授权id
	UtilizationAuthId *string `json:"utilization_auth_id,omitempty" xml:"utilization_auth_id,omitempty"`
	// 资产包id
	AssetPackageId *string `json:"asset_package_id,omitempty" xml:"asset_package_id,omitempty"`
	// 商户授权链接
	MerchantAuthUrl *string `json:"merchant_auth_url,omitempty" xml:"merchant_auth_url,omitempty"`
}

func (s ApplyFundCreditutilizationResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyFundCreditutilizationResponse) GoString() string {
	return s.String()
}

func (s *ApplyFundCreditutilizationResponse) SetReqMsgId(v string) *ApplyFundCreditutilizationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyFundCreditutilizationResponse) SetResultCode(v string) *ApplyFundCreditutilizationResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyFundCreditutilizationResponse) SetResultMsg(v string) *ApplyFundCreditutilizationResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyFundCreditutilizationResponse) SetUtilizationId(v string) *ApplyFundCreditutilizationResponse {
	s.UtilizationId = &v
	return s
}

func (s *ApplyFundCreditutilizationResponse) SetUtilizationAuthId(v string) *ApplyFundCreditutilizationResponse {
	s.UtilizationAuthId = &v
	return s
}

func (s *ApplyFundCreditutilizationResponse) SetAssetPackageId(v string) *ApplyFundCreditutilizationResponse {
	s.AssetPackageId = &v
	return s
}

func (s *ApplyFundCreditutilizationResponse) SetMerchantAuthUrl(v string) *ApplyFundCreditutilizationResponse {
	s.MerchantAuthUrl = &v
	return s
}

type ApplyFundAssertorderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授权id
	AuthId *string `json:"auth_id,omitempty" xml:"auth_id,omitempty" require:"true"`
	// 资方统一社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true"`
	// 商户的租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 商家统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 异步生成文件任务流水号
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// 查询开始时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true"`
	// 查询结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true"`
	// 是否过滤被其他资方标记的订单（融资申请中+融资申请通过），默认值false
	FilterFinancingStatus *bool `json:"filter_financing_status,omitempty" xml:"filter_financing_status,omitempty"`
	// 是否过滤已取消订单 （无剩余应还期数），默认值false
	FilterCance *bool `json:"filter_cance,omitempty" xml:"filter_cance,omitempty"`
	// 是否过滤提前结清订单,默认值false
	FilterEarlySettlement *bool `json:"filter_early_settlement,omitempty" xml:"filter_early_settlement,omitempty"`
	// 是否过滤某一期已逾期的订单,默认值false
	FilterOverdue *bool `json:"filter_overdue,omitempty" xml:"filter_overdue,omitempty"`
	// 是否过滤最新一期晚于计划扣款日的重试中订单 ,默认值false
	FilterRetry *bool `json:"filter_retry,omitempty" xml:"filter_retry,omitempty"`
	// 是否过滤付款日为当日（查询日）的订单 （当日需执行扣款的）,默认值false
	FilterTodayPay *bool `json:"filter_today_pay,omitempty" xml:"filter_today_pay,omitempty"`
}

func (s ApplyFundAssertorderRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyFundAssertorderRequest) GoString() string {
	return s.String()
}

func (s *ApplyFundAssertorderRequest) SetAuthToken(v string) *ApplyFundAssertorderRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyFundAssertorderRequest) SetProductInstanceId(v string) *ApplyFundAssertorderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyFundAssertorderRequest) SetAuthId(v string) *ApplyFundAssertorderRequest {
	s.AuthId = &v
	return s
}

func (s *ApplyFundAssertorderRequest) SetFundId(v string) *ApplyFundAssertorderRequest {
	s.FundId = &v
	return s
}

func (s *ApplyFundAssertorderRequest) SetTenantId(v string) *ApplyFundAssertorderRequest {
	s.TenantId = &v
	return s
}

func (s *ApplyFundAssertorderRequest) SetMerchantId(v string) *ApplyFundAssertorderRequest {
	s.MerchantId = &v
	return s
}

func (s *ApplyFundAssertorderRequest) SetBizNo(v string) *ApplyFundAssertorderRequest {
	s.BizNo = &v
	return s
}

func (s *ApplyFundAssertorderRequest) SetStartTime(v string) *ApplyFundAssertorderRequest {
	s.StartTime = &v
	return s
}

func (s *ApplyFundAssertorderRequest) SetEndTime(v string) *ApplyFundAssertorderRequest {
	s.EndTime = &v
	return s
}

func (s *ApplyFundAssertorderRequest) SetFilterFinancingStatus(v bool) *ApplyFundAssertorderRequest {
	s.FilterFinancingStatus = &v
	return s
}

func (s *ApplyFundAssertorderRequest) SetFilterCance(v bool) *ApplyFundAssertorderRequest {
	s.FilterCance = &v
	return s
}

func (s *ApplyFundAssertorderRequest) SetFilterEarlySettlement(v bool) *ApplyFundAssertorderRequest {
	s.FilterEarlySettlement = &v
	return s
}

func (s *ApplyFundAssertorderRequest) SetFilterOverdue(v bool) *ApplyFundAssertorderRequest {
	s.FilterOverdue = &v
	return s
}

func (s *ApplyFundAssertorderRequest) SetFilterRetry(v bool) *ApplyFundAssertorderRequest {
	s.FilterRetry = &v
	return s
}

func (s *ApplyFundAssertorderRequest) SetFilterTodayPay(v bool) *ApplyFundAssertorderRequest {
	s.FilterTodayPay = &v
	return s
}

type ApplyFundAssertorderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 生成中: TODO、已生成,:FINISH、无效:FAILURE
	TaskStatus *string `json:"task_status,omitempty" xml:"task_status,omitempty"`
}

func (s ApplyFundAssertorderResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyFundAssertorderResponse) GoString() string {
	return s.String()
}

func (s *ApplyFundAssertorderResponse) SetReqMsgId(v string) *ApplyFundAssertorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyFundAssertorderResponse) SetResultCode(v string) *ApplyFundAssertorderResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyFundAssertorderResponse) SetResultMsg(v string) *ApplyFundAssertorderResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyFundAssertorderResponse) SetTaskStatus(v string) *ApplyFundAssertorderResponse {
	s.TaskStatus = &v
	return s
}

type QueryFundAssertorderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授权id
	AuthId *string `json:"auth_id,omitempty" xml:"auth_id,omitempty" require:"true"`
	// 资方统一社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true"`
	// 商户的租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 商家统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 异步生成文件任务流水号
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
}

func (s QueryFundAssertorderRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFundAssertorderRequest) GoString() string {
	return s.String()
}

func (s *QueryFundAssertorderRequest) SetAuthToken(v string) *QueryFundAssertorderRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFundAssertorderRequest) SetProductInstanceId(v string) *QueryFundAssertorderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFundAssertorderRequest) SetAuthId(v string) *QueryFundAssertorderRequest {
	s.AuthId = &v
	return s
}

func (s *QueryFundAssertorderRequest) SetFundId(v string) *QueryFundAssertorderRequest {
	s.FundId = &v
	return s
}

func (s *QueryFundAssertorderRequest) SetTenantId(v string) *QueryFundAssertorderRequest {
	s.TenantId = &v
	return s
}

func (s *QueryFundAssertorderRequest) SetMerchantId(v string) *QueryFundAssertorderRequest {
	s.MerchantId = &v
	return s
}

func (s *QueryFundAssertorderRequest) SetBizNo(v string) *QueryFundAssertorderRequest {
	s.BizNo = &v
	return s
}

type QueryFundAssertorderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用信订单履约信息
	Data []*OrderPrimiseExcelInfo `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryFundAssertorderResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFundAssertorderResponse) GoString() string {
	return s.String()
}

func (s *QueryFundAssertorderResponse) SetReqMsgId(v string) *QueryFundAssertorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFundAssertorderResponse) SetResultCode(v string) *QueryFundAssertorderResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFundAssertorderResponse) SetResultMsg(v string) *QueryFundAssertorderResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFundAssertorderResponse) SetData(v []*OrderPrimiseExcelInfo) *QueryFundAssertorderResponse {
	s.Data = v
	return s
}

type SyncFundCreditgrantingRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授信id
	GrantingId *string `json:"granting_id,omitempty" xml:"granting_id,omitempty" require:"true" maxLength:"20" minLength:"10"`
	// 授信授权id
	AuthId *string `json:"auth_id,omitempty" xml:"auth_id,omitempty" require:"true" maxLength:"20" minLength:"10"`
	// 资方社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 商户社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 商户租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 授权额度，单位为分
	GrantingLine *int64 `json:"granting_line,omitempty" xml:"granting_line,omitempty" require:"true" minimum:"1"`
	// 授信有效期开始时间(yyyy-MM-dd HH:mm:ss)
	EffectStartTime *string `json:"effect_start_time,omitempty" xml:"effect_start_time,omitempty" require:"true" maxLength:"20" minLength:"10"`
	// 授信有效期结束时间(yyyy-MM-dd HH:mm:ss)
	EffectEndTime *string `json:"effect_end_time,omitempty" xml:"effect_end_time,omitempty" require:"true" maxLength:"20" minLength:"10"`
}

func (s SyncFundCreditgrantingRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncFundCreditgrantingRequest) GoString() string {
	return s.String()
}

func (s *SyncFundCreditgrantingRequest) SetAuthToken(v string) *SyncFundCreditgrantingRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncFundCreditgrantingRequest) SetProductInstanceId(v string) *SyncFundCreditgrantingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncFundCreditgrantingRequest) SetGrantingId(v string) *SyncFundCreditgrantingRequest {
	s.GrantingId = &v
	return s
}

func (s *SyncFundCreditgrantingRequest) SetAuthId(v string) *SyncFundCreditgrantingRequest {
	s.AuthId = &v
	return s
}

func (s *SyncFundCreditgrantingRequest) SetFundId(v string) *SyncFundCreditgrantingRequest {
	s.FundId = &v
	return s
}

func (s *SyncFundCreditgrantingRequest) SetMerchantId(v string) *SyncFundCreditgrantingRequest {
	s.MerchantId = &v
	return s
}

func (s *SyncFundCreditgrantingRequest) SetTenantId(v string) *SyncFundCreditgrantingRequest {
	s.TenantId = &v
	return s
}

func (s *SyncFundCreditgrantingRequest) SetGrantingLine(v int64) *SyncFundCreditgrantingRequest {
	s.GrantingLine = &v
	return s
}

func (s *SyncFundCreditgrantingRequest) SetEffectStartTime(v string) *SyncFundCreditgrantingRequest {
	s.EffectStartTime = &v
	return s
}

func (s *SyncFundCreditgrantingRequest) SetEffectEndTime(v string) *SyncFundCreditgrantingRequest {
	s.EffectEndTime = &v
	return s
}

type SyncFundCreditgrantingResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SyncFundCreditgrantingResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncFundCreditgrantingResponse) GoString() string {
	return s.String()
}

func (s *SyncFundCreditgrantingResponse) SetReqMsgId(v string) *SyncFundCreditgrantingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncFundCreditgrantingResponse) SetResultCode(v string) *SyncFundCreditgrantingResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncFundCreditgrantingResponse) SetResultMsg(v string) *SyncFundCreditgrantingResponse {
	s.ResultMsg = &v
	return s
}

type AuthFundCreditgrantingRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 商户统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 资方统一社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true"`
	// 授权id
	AuthId *string `json:"auth_id,omitempty" xml:"auth_id,omitempty" require:"true"`
	// 授权开始时间，格式为yyyy-MM-dd
	AuthBeginTime *string `json:"auth_begin_time,omitempty" xml:"auth_begin_time,omitempty" require:"true"`
	// 授权结束时间，格式为yyyy-MM-dd
	AuthEndTime *string `json:"auth_end_time,omitempty" xml:"auth_end_time,omitempty" require:"true"`
	// 订单查询开始时间，格式为yyyy-MM-dd HH:mm:ss，需要在auth_begin_time之后。
	OrderQueryBegin *string `json:"order_query_begin,omitempty" xml:"order_query_begin,omitempty" require:"true"`
	// 订单查询结束时间，格式为yyyy-MM-dd HH:mm:ss，需要在auth_end_time之前
	OrderQueryEnd *string `json:"order_query_end,omitempty" xml:"order_query_end,omitempty"`
}

func (s AuthFundCreditgrantingRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthFundCreditgrantingRequest) GoString() string {
	return s.String()
}

func (s *AuthFundCreditgrantingRequest) SetAuthToken(v string) *AuthFundCreditgrantingRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthFundCreditgrantingRequest) SetProductInstanceId(v string) *AuthFundCreditgrantingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthFundCreditgrantingRequest) SetTenantId(v string) *AuthFundCreditgrantingRequest {
	s.TenantId = &v
	return s
}

func (s *AuthFundCreditgrantingRequest) SetMerchantId(v string) *AuthFundCreditgrantingRequest {
	s.MerchantId = &v
	return s
}

func (s *AuthFundCreditgrantingRequest) SetFundId(v string) *AuthFundCreditgrantingRequest {
	s.FundId = &v
	return s
}

func (s *AuthFundCreditgrantingRequest) SetAuthId(v string) *AuthFundCreditgrantingRequest {
	s.AuthId = &v
	return s
}

func (s *AuthFundCreditgrantingRequest) SetAuthBeginTime(v string) *AuthFundCreditgrantingRequest {
	s.AuthBeginTime = &v
	return s
}

func (s *AuthFundCreditgrantingRequest) SetAuthEndTime(v string) *AuthFundCreditgrantingRequest {
	s.AuthEndTime = &v
	return s
}

func (s *AuthFundCreditgrantingRequest) SetOrderQueryBegin(v string) *AuthFundCreditgrantingRequest {
	s.OrderQueryBegin = &v
	return s
}

func (s *AuthFundCreditgrantingRequest) SetOrderQueryEnd(v string) *AuthFundCreditgrantingRequest {
	s.OrderQueryEnd = &v
	return s
}

type AuthFundCreditgrantingResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商家授权链接
	MerchantAuthUrl *string `json:"merchant_auth_url,omitempty" xml:"merchant_auth_url,omitempty"`
}

func (s AuthFundCreditgrantingResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthFundCreditgrantingResponse) GoString() string {
	return s.String()
}

func (s *AuthFundCreditgrantingResponse) SetReqMsgId(v string) *AuthFundCreditgrantingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthFundCreditgrantingResponse) SetResultCode(v string) *AuthFundCreditgrantingResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthFundCreditgrantingResponse) SetResultMsg(v string) *AuthFundCreditgrantingResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthFundCreditgrantingResponse) SetMerchantAuthUrl(v string) *AuthFundCreditgrantingResponse {
	s.MerchantAuthUrl = &v
	return s
}

type QueryFundAssertreportRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授权id
	AuthId *string `json:"auth_id,omitempty" xml:"auth_id,omitempty" require:"true"`
	// 资方统一社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true"`
	// 商户的租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 商家统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
}

func (s QueryFundAssertreportRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFundAssertreportRequest) GoString() string {
	return s.String()
}

func (s *QueryFundAssertreportRequest) SetAuthToken(v string) *QueryFundAssertreportRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFundAssertreportRequest) SetProductInstanceId(v string) *QueryFundAssertreportRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFundAssertreportRequest) SetAuthId(v string) *QueryFundAssertreportRequest {
	s.AuthId = &v
	return s
}

func (s *QueryFundAssertreportRequest) SetFundId(v string) *QueryFundAssertreportRequest {
	s.FundId = &v
	return s
}

func (s *QueryFundAssertreportRequest) SetTenantId(v string) *QueryFundAssertreportRequest {
	s.TenantId = &v
	return s
}

func (s *QueryFundAssertreportRequest) SetMerchantId(v string) *QueryFundAssertreportRequest {
	s.MerchantId = &v
	return s
}

type QueryFundAssertreportResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 资产报告详情
	Data []*FundAssertReport `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryFundAssertreportResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFundAssertreportResponse) GoString() string {
	return s.String()
}

func (s *QueryFundAssertreportResponse) SetReqMsgId(v string) *QueryFundAssertreportResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFundAssertreportResponse) SetResultCode(v string) *QueryFundAssertreportResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFundAssertreportResponse) SetResultMsg(v string) *QueryFundAssertreportResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFundAssertreportResponse) SetData(v []*FundAssertReport) *QueryFundAssertreportResponse {
	s.Data = v
	return s
}

type GetInnerProductRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户在数科的租户id
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 商户统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"199" minLength:"1"`
	// 商品id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 商品版本
	ProductVersion *string `json:"product_version,omitempty" xml:"product_version,omitempty" require:"true" maxLength:"10" minLength:"1"`
}

func (s GetInnerProductRequest) String() string {
	return tea.Prettify(s)
}

func (s GetInnerProductRequest) GoString() string {
	return s.String()
}

func (s *GetInnerProductRequest) SetAuthToken(v string) *GetInnerProductRequest {
	s.AuthToken = &v
	return s
}

func (s *GetInnerProductRequest) SetProductInstanceId(v string) *GetInnerProductRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetInnerProductRequest) SetMerchantTenantId(v string) *GetInnerProductRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *GetInnerProductRequest) SetMerchantId(v string) *GetInnerProductRequest {
	s.MerchantId = &v
	return s
}

func (s *GetInnerProductRequest) SetProductId(v string) *GetInnerProductRequest {
	s.ProductId = &v
	return s
}

func (s *GetInnerProductRequest) SetProductVersion(v string) *GetInnerProductRequest {
	s.ProductVersion = &v
	return s
}

type GetInnerProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// {}json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetInnerProductResponse) String() string {
	return tea.Prettify(s)
}

func (s GetInnerProductResponse) GoString() string {
	return s.String()
}

func (s *GetInnerProductResponse) SetReqMsgId(v string) *GetInnerProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetInnerProductResponse) SetResultCode(v string) *GetInnerProductResponse {
	s.ResultCode = &v
	return s
}

func (s *GetInnerProductResponse) SetResultMsg(v string) *GetInnerProductResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetInnerProductResponse) SetResponseData(v string) *GetInnerProductResponse {
	s.ResponseData = &v
	return s
}

type GetInnerTenantRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户在数科的租户id
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"32" minLength:"1"`
}

func (s GetInnerTenantRequest) String() string {
	return tea.Prettify(s)
}

func (s GetInnerTenantRequest) GoString() string {
	return s.String()
}

func (s *GetInnerTenantRequest) SetAuthToken(v string) *GetInnerTenantRequest {
	s.AuthToken = &v
	return s
}

func (s *GetInnerTenantRequest) SetProductInstanceId(v string) *GetInnerTenantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetInnerTenantRequest) SetMerchantTenantId(v string) *GetInnerTenantRequest {
	s.MerchantTenantId = &v
	return s
}

type GetInnerTenantResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// {}租户信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetInnerTenantResponse) String() string {
	return tea.Prettify(s)
}

func (s GetInnerTenantResponse) GoString() string {
	return s.String()
}

func (s *GetInnerTenantResponse) SetReqMsgId(v string) *GetInnerTenantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetInnerTenantResponse) SetResultCode(v string) *GetInnerTenantResponse {
	s.ResultCode = &v
	return s
}

func (s *GetInnerTenantResponse) SetResultMsg(v string) *GetInnerTenantResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetInnerTenantResponse) SetResponseData(v string) *GetInnerTenantResponse {
	s.ResponseData = &v
	return s
}

type SyncInnerMeterforwholeorderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户租户id
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 商户统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"199" minLength:"1"`
	// 商户购买的产品code
	MeterProductCode *string `json:"meter_product_code,omitempty" xml:"meter_product_code,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"49" minLength:"1"`
	// 订单总租期
	OrderRentTerm *int64 `json:"order_rent_term,omitempty" xml:"order_rent_term,omitempty" require:"true"`
	// 订单总租金，单位为分
	OrderTotalMoney *int64 `json:"order_total_money,omitempty" xml:"order_total_money,omitempty" require:"true"`
	// 系统名称
	SysName *string `json:"sys_name,omitempty" xml:"sys_name,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 订单产品的二级类目
	OrderProductSubclass *string `json:"order_product_subclass,omitempty" xml:"order_product_subclass,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s SyncInnerMeterforwholeorderRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncInnerMeterforwholeorderRequest) GoString() string {
	return s.String()
}

func (s *SyncInnerMeterforwholeorderRequest) SetAuthToken(v string) *SyncInnerMeterforwholeorderRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncInnerMeterforwholeorderRequest) SetProductInstanceId(v string) *SyncInnerMeterforwholeorderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncInnerMeterforwholeorderRequest) SetMerchantTenantId(v string) *SyncInnerMeterforwholeorderRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *SyncInnerMeterforwholeorderRequest) SetMerchantId(v string) *SyncInnerMeterforwholeorderRequest {
	s.MerchantId = &v
	return s
}

func (s *SyncInnerMeterforwholeorderRequest) SetMeterProductCode(v string) *SyncInnerMeterforwholeorderRequest {
	s.MeterProductCode = &v
	return s
}

func (s *SyncInnerMeterforwholeorderRequest) SetOrderId(v string) *SyncInnerMeterforwholeorderRequest {
	s.OrderId = &v
	return s
}

func (s *SyncInnerMeterforwholeorderRequest) SetOrderRentTerm(v int64) *SyncInnerMeterforwholeorderRequest {
	s.OrderRentTerm = &v
	return s
}

func (s *SyncInnerMeterforwholeorderRequest) SetOrderTotalMoney(v int64) *SyncInnerMeterforwholeorderRequest {
	s.OrderTotalMoney = &v
	return s
}

func (s *SyncInnerMeterforwholeorderRequest) SetSysName(v string) *SyncInnerMeterforwholeorderRequest {
	s.SysName = &v
	return s
}

func (s *SyncInnerMeterforwholeorderRequest) SetOrderProductSubclass(v string) *SyncInnerMeterforwholeorderRequest {
	s.OrderProductSubclass = &v
	return s
}

type SyncInnerMeterforwholeorderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SyncInnerMeterforwholeorderResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncInnerMeterforwholeorderResponse) GoString() string {
	return s.String()
}

func (s *SyncInnerMeterforwholeorderResponse) SetReqMsgId(v string) *SyncInnerMeterforwholeorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncInnerMeterforwholeorderResponse) SetResultCode(v string) *SyncInnerMeterforwholeorderResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncInnerMeterforwholeorderResponse) SetResultMsg(v string) *SyncInnerMeterforwholeorderResponse {
	s.ResultMsg = &v
	return s
}

type SyncInnerMeterforagsignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户租户id
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 商户社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"199" minLength:"1"`
	// 计量上报Code
	MeterProductCode *string `json:"meter_product_code,omitempty" xml:"meter_product_code,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 系统名字
	SysName *string `json:"sys_name,omitempty" xml:"sys_name,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"49" minLength:"1"`
	// 合同编号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s SyncInnerMeterforagsignRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncInnerMeterforagsignRequest) GoString() string {
	return s.String()
}

func (s *SyncInnerMeterforagsignRequest) SetAuthToken(v string) *SyncInnerMeterforagsignRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncInnerMeterforagsignRequest) SetProductInstanceId(v string) *SyncInnerMeterforagsignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncInnerMeterforagsignRequest) SetMerchantTenantId(v string) *SyncInnerMeterforagsignRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *SyncInnerMeterforagsignRequest) SetMerchantId(v string) *SyncInnerMeterforagsignRequest {
	s.MerchantId = &v
	return s
}

func (s *SyncInnerMeterforagsignRequest) SetMeterProductCode(v string) *SyncInnerMeterforagsignRequest {
	s.MeterProductCode = &v
	return s
}

func (s *SyncInnerMeterforagsignRequest) SetSysName(v string) *SyncInnerMeterforagsignRequest {
	s.SysName = &v
	return s
}

func (s *SyncInnerMeterforagsignRequest) SetOrderId(v string) *SyncInnerMeterforagsignRequest {
	s.OrderId = &v
	return s
}

func (s *SyncInnerMeterforagsignRequest) SetSignNo(v string) *SyncInnerMeterforagsignRequest {
	s.SignNo = &v
	return s
}

type SyncInnerMeterforagsignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SyncInnerMeterforagsignResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncInnerMeterforagsignResponse) GoString() string {
	return s.String()
}

func (s *SyncInnerMeterforagsignResponse) SetReqMsgId(v string) *SyncInnerMeterforagsignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncInnerMeterforagsignResponse) SetResultCode(v string) *SyncInnerMeterforagsignResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncInnerMeterforagsignResponse) SetResultMsg(v string) *SyncInnerMeterforagsignResponse {
	s.ResultMsg = &v
	return s
}

type AllInnerTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 分页查询结构体
	PageInfo *PageQuery `json:"page_info,omitempty" xml:"page_info,omitempty" require:"true"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 魔法库模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty"`
	// 魔法库模板文件名称
	TemplateName *string `json:"template_name,omitempty" xml:"template_name,omitempty"`
	// 线上模板ID
	TemplateCodeProd *string `json:"template_code_prod,omitempty" xml:"template_code_prod,omitempty"`
}

func (s AllInnerTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s AllInnerTemplateRequest) GoString() string {
	return s.String()
}

func (s *AllInnerTemplateRequest) SetAuthToken(v string) *AllInnerTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *AllInnerTemplateRequest) SetProductInstanceId(v string) *AllInnerTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllInnerTemplateRequest) SetPageInfo(v *PageQuery) *AllInnerTemplateRequest {
	s.PageInfo = v
	return s
}

func (s *AllInnerTemplateRequest) SetTenantId(v string) *AllInnerTemplateRequest {
	s.TenantId = &v
	return s
}

func (s *AllInnerTemplateRequest) SetTemplateCode(v string) *AllInnerTemplateRequest {
	s.TemplateCode = &v
	return s
}

func (s *AllInnerTemplateRequest) SetTemplateName(v string) *AllInnerTemplateRequest {
	s.TemplateName = &v
	return s
}

func (s *AllInnerTemplateRequest) SetTemplateCodeProd(v string) *AllInnerTemplateRequest {
	s.TemplateCodeProd = &v
	return s
}

type AllInnerTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模板列表数据
	TemplateList *string `json:"template_list,omitempty" xml:"template_list,omitempty"`
}

func (s AllInnerTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s AllInnerTemplateResponse) GoString() string {
	return s.String()
}

func (s *AllInnerTemplateResponse) SetReqMsgId(v string) *AllInnerTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllInnerTemplateResponse) SetResultCode(v string) *AllInnerTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *AllInnerTemplateResponse) SetResultMsg(v string) *AllInnerTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllInnerTemplateResponse) SetTemplateList(v string) *AllInnerTemplateResponse {
	s.TemplateList = &v
	return s
}

type ListInnerTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 分页查询
	PageInfo *PageQuery `json:"page_info,omitempty" xml:"page_info,omitempty" require:"true"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 魔法库模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
}

func (s ListInnerTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s ListInnerTemplateRequest) GoString() string {
	return s.String()
}

func (s *ListInnerTemplateRequest) SetAuthToken(v string) *ListInnerTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *ListInnerTemplateRequest) SetProductInstanceId(v string) *ListInnerTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListInnerTemplateRequest) SetPageInfo(v *PageQuery) *ListInnerTemplateRequest {
	s.PageInfo = v
	return s
}

func (s *ListInnerTemplateRequest) SetTenantId(v string) *ListInnerTemplateRequest {
	s.TenantId = &v
	return s
}

func (s *ListInnerTemplateRequest) SetTemplateCode(v string) *ListInnerTemplateRequest {
	s.TemplateCode = &v
	return s
}

type ListInnerTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模板列表数据
	TemplateList *string `json:"template_list,omitempty" xml:"template_list,omitempty"`
}

func (s ListInnerTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s ListInnerTemplateResponse) GoString() string {
	return s.String()
}

func (s *ListInnerTemplateResponse) SetReqMsgId(v string) *ListInnerTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListInnerTemplateResponse) SetResultCode(v string) *ListInnerTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *ListInnerTemplateResponse) SetResultMsg(v string) *ListInnerTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListInnerTemplateResponse) SetTemplateList(v string) *ListInnerTemplateResponse {
	s.TemplateList = &v
	return s
}

type DetailInnerTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 魔法库模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 魔法库模板版本
	TemplateVersion *string `json:"template_version,omitempty" xml:"template_version,omitempty" require:"true"`
}

func (s DetailInnerTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s DetailInnerTemplateRequest) GoString() string {
	return s.String()
}

func (s *DetailInnerTemplateRequest) SetAuthToken(v string) *DetailInnerTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *DetailInnerTemplateRequest) SetProductInstanceId(v string) *DetailInnerTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DetailInnerTemplateRequest) SetTenantId(v string) *DetailInnerTemplateRequest {
	s.TenantId = &v
	return s
}

func (s *DetailInnerTemplateRequest) SetTemplateCode(v string) *DetailInnerTemplateRequest {
	s.TemplateCode = &v
	return s
}

func (s *DetailInnerTemplateRequest) SetTemplateVersion(v string) *DetailInnerTemplateRequest {
	s.TemplateVersion = &v
	return s
}

type DetailInnerTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模板详情信息
	TemplateInfo *string `json:"template_info,omitempty" xml:"template_info,omitempty"`
}

func (s DetailInnerTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s DetailInnerTemplateResponse) GoString() string {
	return s.String()
}

func (s *DetailInnerTemplateResponse) SetReqMsgId(v string) *DetailInnerTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DetailInnerTemplateResponse) SetResultCode(v string) *DetailInnerTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *DetailInnerTemplateResponse) SetResultMsg(v string) *DetailInnerTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *DetailInnerTemplateResponse) SetTemplateInfo(v string) *DetailInnerTemplateResponse {
	s.TemplateInfo = &v
	return s
}

type CreateInnerTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 创建的模板名称
	TemplateName *string `json:"template_name,omitempty" xml:"template_name,omitempty" require:"true" maxLength:"32"`
	// 文件oss存储的key
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty"`
	// 模板文件的名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
}

func (s CreateInnerTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateInnerTemplateRequest) GoString() string {
	return s.String()
}

func (s *CreateInnerTemplateRequest) SetAuthToken(v string) *CreateInnerTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateInnerTemplateRequest) SetProductInstanceId(v string) *CreateInnerTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateInnerTemplateRequest) SetTenantId(v string) *CreateInnerTemplateRequest {
	s.TenantId = &v
	return s
}

func (s *CreateInnerTemplateRequest) SetTemplateName(v string) *CreateInnerTemplateRequest {
	s.TemplateName = &v
	return s
}

func (s *CreateInnerTemplateRequest) SetFileKey(v string) *CreateInnerTemplateRequest {
	s.FileKey = &v
	return s
}

func (s *CreateInnerTemplateRequest) SetFileName(v string) *CreateInnerTemplateRequest {
	s.FileName = &v
	return s
}

type CreateInnerTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 魔法库模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty"`
}

func (s CreateInnerTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateInnerTemplateResponse) GoString() string {
	return s.String()
}

func (s *CreateInnerTemplateResponse) SetReqMsgId(v string) *CreateInnerTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateInnerTemplateResponse) SetResultCode(v string) *CreateInnerTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateInnerTemplateResponse) SetResultMsg(v string) *CreateInnerTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateInnerTemplateResponse) SetTemplateCode(v string) *CreateInnerTemplateResponse {
	s.TemplateCode = &v
	return s
}

type SaveInnerTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 魔法库模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 魔法库模板版本
	TemplateVersion *string `json:"template_version,omitempty" xml:"template_version,omitempty" require:"true"`
	// 文件预览地址
	PreviewAddress *string `json:"preview_address,omitempty" xml:"preview_address,omitempty" require:"true"`
	// 创建模板的元素列表
	TemplateElementList *string `json:"template_element_list,omitempty" xml:"template_element_list,omitempty"`
	// 文件oss存储的key
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty" require:"true"`
	// 是否确认保存。点击”保存“按钮传false、点击”下一步“按钮传true
	Confirm *bool `json:"confirm,omitempty" xml:"confirm,omitempty" require:"true"`
}

func (s SaveInnerTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveInnerTemplateRequest) GoString() string {
	return s.String()
}

func (s *SaveInnerTemplateRequest) SetAuthToken(v string) *SaveInnerTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveInnerTemplateRequest) SetProductInstanceId(v string) *SaveInnerTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveInnerTemplateRequest) SetTenantId(v string) *SaveInnerTemplateRequest {
	s.TenantId = &v
	return s
}

func (s *SaveInnerTemplateRequest) SetTemplateCode(v string) *SaveInnerTemplateRequest {
	s.TemplateCode = &v
	return s
}

func (s *SaveInnerTemplateRequest) SetTemplateVersion(v string) *SaveInnerTemplateRequest {
	s.TemplateVersion = &v
	return s
}

func (s *SaveInnerTemplateRequest) SetPreviewAddress(v string) *SaveInnerTemplateRequest {
	s.PreviewAddress = &v
	return s
}

func (s *SaveInnerTemplateRequest) SetTemplateElementList(v string) *SaveInnerTemplateRequest {
	s.TemplateElementList = &v
	return s
}

func (s *SaveInnerTemplateRequest) SetFileKey(v string) *SaveInnerTemplateRequest {
	s.FileKey = &v
	return s
}

func (s *SaveInnerTemplateRequest) SetConfirm(v bool) *SaveInnerTemplateRequest {
	s.Confirm = &v
	return s
}

type SaveInnerTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SaveInnerTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveInnerTemplateResponse) GoString() string {
	return s.String()
}

func (s *SaveInnerTemplateResponse) SetReqMsgId(v string) *SaveInnerTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveInnerTemplateResponse) SetResultCode(v string) *SaveInnerTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveInnerTemplateResponse) SetResultMsg(v string) *SaveInnerTemplateResponse {
	s.ResultMsg = &v
	return s
}

type SaveInnerSignfieldsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 魔法库模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 魔法库模板版本
	TemplateVersion *string `json:"template_version,omitempty" xml:"template_version,omitempty" require:"true"`
	// 模板签署区列表
	SignFieldList *string `json:"sign_field_list,omitempty" xml:"sign_field_list,omitempty" require:"true"`
}

func (s SaveInnerSignfieldsRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveInnerSignfieldsRequest) GoString() string {
	return s.String()
}

func (s *SaveInnerSignfieldsRequest) SetAuthToken(v string) *SaveInnerSignfieldsRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveInnerSignfieldsRequest) SetProductInstanceId(v string) *SaveInnerSignfieldsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveInnerSignfieldsRequest) SetTenantId(v string) *SaveInnerSignfieldsRequest {
	s.TenantId = &v
	return s
}

func (s *SaveInnerSignfieldsRequest) SetTemplateCode(v string) *SaveInnerSignfieldsRequest {
	s.TemplateCode = &v
	return s
}

func (s *SaveInnerSignfieldsRequest) SetTemplateVersion(v string) *SaveInnerSignfieldsRequest {
	s.TemplateVersion = &v
	return s
}

func (s *SaveInnerSignfieldsRequest) SetSignFieldList(v string) *SaveInnerSignfieldsRequest {
	s.SignFieldList = &v
	return s
}

type SaveInnerSignfieldsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SaveInnerSignfieldsResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveInnerSignfieldsResponse) GoString() string {
	return s.String()
}

func (s *SaveInnerSignfieldsResponse) SetReqMsgId(v string) *SaveInnerSignfieldsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveInnerSignfieldsResponse) SetResultCode(v string) *SaveInnerSignfieldsResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveInnerSignfieldsResponse) SetResultMsg(v string) *SaveInnerSignfieldsResponse {
	s.ResultMsg = &v
	return s
}

type PublishInnerTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 魔法库模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 魔法库版本id
	TemplateVersionId *string `json:"template_version_id,omitempty" xml:"template_version_id,omitempty" require:"true"`
	// 合同模板制作版本id
	TemplateVersion *string `json:"template_version,omitempty" xml:"template_version,omitempty"`
}

func (s PublishInnerTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s PublishInnerTemplateRequest) GoString() string {
	return s.String()
}

func (s *PublishInnerTemplateRequest) SetAuthToken(v string) *PublishInnerTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *PublishInnerTemplateRequest) SetProductInstanceId(v string) *PublishInnerTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PublishInnerTemplateRequest) SetTenantId(v string) *PublishInnerTemplateRequest {
	s.TenantId = &v
	return s
}

func (s *PublishInnerTemplateRequest) SetTemplateCode(v string) *PublishInnerTemplateRequest {
	s.TemplateCode = &v
	return s
}

func (s *PublishInnerTemplateRequest) SetTemplateVersionId(v string) *PublishInnerTemplateRequest {
	s.TemplateVersionId = &v
	return s
}

func (s *PublishInnerTemplateRequest) SetTemplateVersion(v string) *PublishInnerTemplateRequest {
	s.TemplateVersion = &v
	return s
}

type PublishInnerTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s PublishInnerTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s PublishInnerTemplateResponse) GoString() string {
	return s.String()
}

func (s *PublishInnerTemplateResponse) SetReqMsgId(v string) *PublishInnerTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PublishInnerTemplateResponse) SetResultCode(v string) *PublishInnerTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *PublishInnerTemplateResponse) SetResultMsg(v string) *PublishInnerTemplateResponse {
	s.ResultMsg = &v
	return s
}

type PreviewInnerTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 文件oss存储的key
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty" require:"true"`
}

func (s PreviewInnerTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s PreviewInnerTemplateRequest) GoString() string {
	return s.String()
}

func (s *PreviewInnerTemplateRequest) SetAuthToken(v string) *PreviewInnerTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *PreviewInnerTemplateRequest) SetProductInstanceId(v string) *PreviewInnerTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PreviewInnerTemplateRequest) SetTenantId(v string) *PreviewInnerTemplateRequest {
	s.TenantId = &v
	return s
}

func (s *PreviewInnerTemplateRequest) SetFileKey(v string) *PreviewInnerTemplateRequest {
	s.FileKey = &v
	return s
}

type PreviewInnerTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预览接口返回
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PreviewInnerTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s PreviewInnerTemplateResponse) GoString() string {
	return s.String()
}

func (s *PreviewInnerTemplateResponse) SetReqMsgId(v string) *PreviewInnerTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PreviewInnerTemplateResponse) SetResultCode(v string) *PreviewInnerTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *PreviewInnerTemplateResponse) SetResultMsg(v string) *PreviewInnerTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *PreviewInnerTemplateResponse) SetData(v string) *PreviewInnerTemplateResponse {
	s.Data = &v
	return s
}

type DeleteInnerTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 魔法库模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 魔法库模板版本
	TemplateVersion *string `json:"template_version,omitempty" xml:"template_version,omitempty" require:"true"`
	// 魔法库模板版本id
	TemplateVersionId *string `json:"template_version_id,omitempty" xml:"template_version_id,omitempty" require:"true"`
}

func (s DeleteInnerTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteInnerTemplateRequest) GoString() string {
	return s.String()
}

func (s *DeleteInnerTemplateRequest) SetAuthToken(v string) *DeleteInnerTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteInnerTemplateRequest) SetProductInstanceId(v string) *DeleteInnerTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteInnerTemplateRequest) SetTenantId(v string) *DeleteInnerTemplateRequest {
	s.TenantId = &v
	return s
}

func (s *DeleteInnerTemplateRequest) SetTemplateCode(v string) *DeleteInnerTemplateRequest {
	s.TemplateCode = &v
	return s
}

func (s *DeleteInnerTemplateRequest) SetTemplateVersion(v string) *DeleteInnerTemplateRequest {
	s.TemplateVersion = &v
	return s
}

func (s *DeleteInnerTemplateRequest) SetTemplateVersionId(v string) *DeleteInnerTemplateRequest {
	s.TemplateVersionId = &v
	return s
}

type DeleteInnerTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteInnerTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteInnerTemplateResponse) GoString() string {
	return s.String()
}

func (s *DeleteInnerTemplateResponse) SetReqMsgId(v string) *DeleteInnerTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteInnerTemplateResponse) SetResultCode(v string) *DeleteInnerTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteInnerTemplateResponse) SetResultMsg(v string) *DeleteInnerTemplateResponse {
	s.ResultMsg = &v
	return s
}

type CloneInnerTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 魔法库对应模板的模板复制id
	VoucherId *string `json:"voucher_id,omitempty" xml:"voucher_id,omitempty" require:"true"`
}

func (s CloneInnerTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s CloneInnerTemplateRequest) GoString() string {
	return s.String()
}

func (s *CloneInnerTemplateRequest) SetAuthToken(v string) *CloneInnerTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *CloneInnerTemplateRequest) SetProductInstanceId(v string) *CloneInnerTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CloneInnerTemplateRequest) SetTenantId(v string) *CloneInnerTemplateRequest {
	s.TenantId = &v
	return s
}

func (s *CloneInnerTemplateRequest) SetTemplateCode(v string) *CloneInnerTemplateRequest {
	s.TemplateCode = &v
	return s
}

func (s *CloneInnerTemplateRequest) SetVoucherId(v string) *CloneInnerTemplateRequest {
	s.VoucherId = &v
	return s
}

type CloneInnerTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CloneInnerTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s CloneInnerTemplateResponse) GoString() string {
	return s.String()
}

func (s *CloneInnerTemplateResponse) SetReqMsgId(v string) *CloneInnerTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CloneInnerTemplateResponse) SetResultCode(v string) *CloneInnerTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *CloneInnerTemplateResponse) SetResultMsg(v string) *CloneInnerTemplateResponse {
	s.ResultMsg = &v
	return s
}

type UploadInnerFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// ● BUSINESS_LICENSE 营业执照
	// ● CARD_FRONT 身份证正面
	// ● CARD_BACK 身份证反面
	// ● SPLITTING 分账
	// ● CONTRACT_TEMPLATE 合同模板
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
}

func (s UploadInnerFileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadInnerFileRequest) GoString() string {
	return s.String()
}

func (s *UploadInnerFileRequest) SetAuthToken(v string) *UploadInnerFileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadInnerFileRequest) SetProductInstanceId(v string) *UploadInnerFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadInnerFileRequest) SetTenantId(v string) *UploadInnerFileRequest {
	s.TenantId = &v
	return s
}

func (s *UploadInnerFileRequest) SetFileName(v string) *UploadInnerFileRequest {
	s.FileName = &v
	return s
}

func (s *UploadInnerFileRequest) SetBizScene(v string) *UploadInnerFileRequest {
	s.BizScene = &v
	return s
}

type UploadInnerFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 临时上传地址
	UploadUrl *string `json:"upload_url,omitempty" xml:"upload_url,omitempty"`
	// 文件key
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty"`
}

func (s UploadInnerFileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadInnerFileResponse) GoString() string {
	return s.String()
}

func (s *UploadInnerFileResponse) SetReqMsgId(v string) *UploadInnerFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadInnerFileResponse) SetResultCode(v string) *UploadInnerFileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadInnerFileResponse) SetResultMsg(v string) *UploadInnerFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadInnerFileResponse) SetUploadUrl(v string) *UploadInnerFileResponse {
	s.UploadUrl = &v
	return s
}

func (s *UploadInnerFileResponse) SetFileKey(v string) *UploadInnerFileResponse {
	s.FileKey = &v
	return s
}

type DownloadInnerFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 文件key
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty" require:"true"`
}

func (s DownloadInnerFileRequest) String() string {
	return tea.Prettify(s)
}

func (s DownloadInnerFileRequest) GoString() string {
	return s.String()
}

func (s *DownloadInnerFileRequest) SetAuthToken(v string) *DownloadInnerFileRequest {
	s.AuthToken = &v
	return s
}

func (s *DownloadInnerFileRequest) SetProductInstanceId(v string) *DownloadInnerFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DownloadInnerFileRequest) SetTenantId(v string) *DownloadInnerFileRequest {
	s.TenantId = &v
	return s
}

func (s *DownloadInnerFileRequest) SetFileKey(v string) *DownloadInnerFileRequest {
	s.FileKey = &v
	return s
}

type DownloadInnerFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件临时下载地址
	DownloadUrl *string `json:"download_url,omitempty" xml:"download_url,omitempty"`
}

func (s DownloadInnerFileResponse) String() string {
	return tea.Prettify(s)
}

func (s DownloadInnerFileResponse) GoString() string {
	return s.String()
}

func (s *DownloadInnerFileResponse) SetReqMsgId(v string) *DownloadInnerFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DownloadInnerFileResponse) SetResultCode(v string) *DownloadInnerFileResponse {
	s.ResultCode = &v
	return s
}

func (s *DownloadInnerFileResponse) SetResultMsg(v string) *DownloadInnerFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *DownloadInnerFileResponse) SetDownloadUrl(v string) *DownloadInnerFileResponse {
	s.DownloadUrl = &v
	return s
}

type GetInnerTemplateofficeurlRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 魔法库模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 魔法库模板版本
	TemplateVersion *string `json:"template_version,omitempty" xml:"template_version,omitempty" require:"true"`
}

func (s GetInnerTemplateofficeurlRequest) String() string {
	return tea.Prettify(s)
}

func (s GetInnerTemplateofficeurlRequest) GoString() string {
	return s.String()
}

func (s *GetInnerTemplateofficeurlRequest) SetAuthToken(v string) *GetInnerTemplateofficeurlRequest {
	s.AuthToken = &v
	return s
}

func (s *GetInnerTemplateofficeurlRequest) SetProductInstanceId(v string) *GetInnerTemplateofficeurlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetInnerTemplateofficeurlRequest) SetTenantId(v string) *GetInnerTemplateofficeurlRequest {
	s.TenantId = &v
	return s
}

func (s *GetInnerTemplateofficeurlRequest) SetTemplateCode(v string) *GetInnerTemplateofficeurlRequest {
	s.TemplateCode = &v
	return s
}

func (s *GetInnerTemplateofficeurlRequest) SetTemplateVersion(v string) *GetInnerTemplateofficeurlRequest {
	s.TemplateVersion = &v
	return s
}

type GetInnerTemplateofficeurlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回值
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetInnerTemplateofficeurlResponse) String() string {
	return tea.Prettify(s)
}

func (s GetInnerTemplateofficeurlResponse) GoString() string {
	return s.String()
}

func (s *GetInnerTemplateofficeurlResponse) SetReqMsgId(v string) *GetInnerTemplateofficeurlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetInnerTemplateofficeurlResponse) SetResultCode(v string) *GetInnerTemplateofficeurlResponse {
	s.ResultCode = &v
	return s
}

func (s *GetInnerTemplateofficeurlResponse) SetResultMsg(v string) *GetInnerTemplateofficeurlResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetInnerTemplateofficeurlResponse) SetData(v string) *GetInnerTemplateofficeurlResponse {
	s.Data = &v
	return s
}

type RefreshInnerTemplatetokenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// accessToken
	AccessToken *string `json:"access_token,omitempty" xml:"access_token,omitempty" require:"true"`
	// refreshToekn
	RefreshToken *string `json:"refresh_token,omitempty" xml:"refresh_token,omitempty" require:"true"`
}

func (s RefreshInnerTemplatetokenRequest) String() string {
	return tea.Prettify(s)
}

func (s RefreshInnerTemplatetokenRequest) GoString() string {
	return s.String()
}

func (s *RefreshInnerTemplatetokenRequest) SetAuthToken(v string) *RefreshInnerTemplatetokenRequest {
	s.AuthToken = &v
	return s
}

func (s *RefreshInnerTemplatetokenRequest) SetProductInstanceId(v string) *RefreshInnerTemplatetokenRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RefreshInnerTemplatetokenRequest) SetTenantId(v string) *RefreshInnerTemplatetokenRequest {
	s.TenantId = &v
	return s
}

func (s *RefreshInnerTemplatetokenRequest) SetAccessToken(v string) *RefreshInnerTemplatetokenRequest {
	s.AccessToken = &v
	return s
}

func (s *RefreshInnerTemplatetokenRequest) SetRefreshToken(v string) *RefreshInnerTemplatetokenRequest {
	s.RefreshToken = &v
	return s
}

type RefreshInnerTemplatetokenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回值
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s RefreshInnerTemplatetokenResponse) String() string {
	return tea.Prettify(s)
}

func (s RefreshInnerTemplatetokenResponse) GoString() string {
	return s.String()
}

func (s *RefreshInnerTemplatetokenResponse) SetReqMsgId(v string) *RefreshInnerTemplatetokenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RefreshInnerTemplatetokenResponse) SetResultCode(v string) *RefreshInnerTemplatetokenResponse {
	s.ResultCode = &v
	return s
}

func (s *RefreshInnerTemplatetokenResponse) SetResultMsg(v string) *RefreshInnerTemplatetokenResponse {
	s.ResultMsg = &v
	return s
}

func (s *RefreshInnerTemplatetokenResponse) SetData(v string) *RefreshInnerTemplatetokenResponse {
	s.Data = &v
	return s
}

type CreateInnerTemplatetextareaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 模板编码
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 模板版本号
	TemplateVersion *string `json:"template_version,omitempty" xml:"template_version,omitempty" require:"true"`
	// 组件类型，INPUT:单行文本 TEXTAREA:多行文本
	ComponentType *string `json:"component_type,omitempty" xml:"component_type,omitempty" require:"true"`
	// 组件名称（占位符）
	ComponentName *string `json:"component_name,omitempty" xml:"component_name,omitempty" require:"true"`
	// 是否必填
	Required *bool `json:"required,omitempty" xml:"required,omitempty" require:"true"`
	// 预估文本行数
	Line *int64 `json:"line,omitempty" xml:"line,omitempty"`
	// 多行文本域名称
	MultiName *string `json:"multi_name,omitempty" xml:"multi_name,omitempty"`
}

func (s CreateInnerTemplatetextareaRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateInnerTemplatetextareaRequest) GoString() string {
	return s.String()
}

func (s *CreateInnerTemplatetextareaRequest) SetAuthToken(v string) *CreateInnerTemplatetextareaRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateInnerTemplatetextareaRequest) SetProductInstanceId(v string) *CreateInnerTemplatetextareaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateInnerTemplatetextareaRequest) SetTenantId(v string) *CreateInnerTemplatetextareaRequest {
	s.TenantId = &v
	return s
}

func (s *CreateInnerTemplatetextareaRequest) SetTemplateCode(v string) *CreateInnerTemplatetextareaRequest {
	s.TemplateCode = &v
	return s
}

func (s *CreateInnerTemplatetextareaRequest) SetTemplateVersion(v string) *CreateInnerTemplatetextareaRequest {
	s.TemplateVersion = &v
	return s
}

func (s *CreateInnerTemplatetextareaRequest) SetComponentType(v string) *CreateInnerTemplatetextareaRequest {
	s.ComponentType = &v
	return s
}

func (s *CreateInnerTemplatetextareaRequest) SetComponentName(v string) *CreateInnerTemplatetextareaRequest {
	s.ComponentName = &v
	return s
}

func (s *CreateInnerTemplatetextareaRequest) SetRequired(v bool) *CreateInnerTemplatetextareaRequest {
	s.Required = &v
	return s
}

func (s *CreateInnerTemplatetextareaRequest) SetLine(v int64) *CreateInnerTemplatetextareaRequest {
	s.Line = &v
	return s
}

func (s *CreateInnerTemplatetextareaRequest) SetMultiName(v string) *CreateInnerTemplatetextareaRequest {
	s.MultiName = &v
	return s
}

type CreateInnerTemplatetextareaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 创建成功的文本域组件信息
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateInnerTemplatetextareaResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateInnerTemplatetextareaResponse) GoString() string {
	return s.String()
}

func (s *CreateInnerTemplatetextareaResponse) SetReqMsgId(v string) *CreateInnerTemplatetextareaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateInnerTemplatetextareaResponse) SetResultCode(v string) *CreateInnerTemplatetextareaResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateInnerTemplatetextareaResponse) SetResultMsg(v string) *CreateInnerTemplatetextareaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateInnerTemplatetextareaResponse) SetData(v string) *CreateInnerTemplatetextareaResponse {
	s.Data = &v
	return s
}

type QueryInnerTemplateimageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 分页查询结构体
	PageInfo *PageQuery `json:"page_info,omitempty" xml:"page_info,omitempty" require:"true"`
	// 魔法库模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 魔法库模板版本
	TemplateVersion *string `json:"template_version,omitempty" xml:"template_version,omitempty" require:"true"`
}

func (s QueryInnerTemplateimageRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerTemplateimageRequest) GoString() string {
	return s.String()
}

func (s *QueryInnerTemplateimageRequest) SetAuthToken(v string) *QueryInnerTemplateimageRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInnerTemplateimageRequest) SetProductInstanceId(v string) *QueryInnerTemplateimageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInnerTemplateimageRequest) SetTenantId(v string) *QueryInnerTemplateimageRequest {
	s.TenantId = &v
	return s
}

func (s *QueryInnerTemplateimageRequest) SetPageInfo(v *PageQuery) *QueryInnerTemplateimageRequest {
	s.PageInfo = v
	return s
}

func (s *QueryInnerTemplateimageRequest) SetTemplateCode(v string) *QueryInnerTemplateimageRequest {
	s.TemplateCode = &v
	return s
}

func (s *QueryInnerTemplateimageRequest) SetTemplateVersion(v string) *QueryInnerTemplateimageRequest {
	s.TemplateVersion = &v
	return s
}

type QueryInnerTemplateimageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模板图片列表
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryInnerTemplateimageResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerTemplateimageResponse) GoString() string {
	return s.String()
}

func (s *QueryInnerTemplateimageResponse) SetReqMsgId(v string) *QueryInnerTemplateimageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInnerTemplateimageResponse) SetResultCode(v string) *QueryInnerTemplateimageResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInnerTemplateimageResponse) SetResultMsg(v string) *QueryInnerTemplateimageResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInnerTemplateimageResponse) SetData(v string) *QueryInnerTemplateimageResponse {
	s.Data = &v
	return s
}

type CreateInnerFunddividerelationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 第一次暂存或提交可以不传，由后端生成
	RelationId *string `json:"relation_id,omitempty" xml:"relation_id,omitempty"`
	// 分账公司名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty"`
	// 分账公司社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// 分账合同或协议
	ContractFiles []*FileInfo `json:"contract_files,omitempty" xml:"contract_files,omitempty" type:"Repeated"`
	// 分账关系说明
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
	// 分账方企业pid
	AlipayPid *string `json:"alipay_pid,omitempty" xml:"alipay_pid,omitempty"`
	// 分账方企业支付宝账号
	AlipayAccount *string `json:"alipay_account,omitempty" xml:"alipay_account,omitempty"`
	// 是否直接提交
	// SUBMITTED 直接提交
	// STAGE 暂存
	Submit *string `json:"submit,omitempty" xml:"submit,omitempty" require:"true"`
	// 操作人名称
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 商户公司社会统一信用代码,
	// 如果expandMode=AGENT, 非空，长度不超过32位
	SubjectMerchantId *string `json:"subject_merchant_id,omitempty" xml:"subject_merchant_id,omitempty"`
	// 进件模式	:DIRECT(直连进件) ,AGENT(代理进件)
	// 默认值：DIRECT
	ExpandMode *string `json:"expand_mode,omitempty" xml:"expand_mode,omitempty"`
}

func (s CreateInnerFunddividerelationRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateInnerFunddividerelationRequest) GoString() string {
	return s.String()
}

func (s *CreateInnerFunddividerelationRequest) SetAuthToken(v string) *CreateInnerFunddividerelationRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateInnerFunddividerelationRequest) SetProductInstanceId(v string) *CreateInnerFunddividerelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateInnerFunddividerelationRequest) SetTenantId(v string) *CreateInnerFunddividerelationRequest {
	s.TenantId = &v
	return s
}

func (s *CreateInnerFunddividerelationRequest) SetRelationId(v string) *CreateInnerFunddividerelationRequest {
	s.RelationId = &v
	return s
}

func (s *CreateInnerFunddividerelationRequest) SetCompanyName(v string) *CreateInnerFunddividerelationRequest {
	s.CompanyName = &v
	return s
}

func (s *CreateInnerFunddividerelationRequest) SetMerchantId(v string) *CreateInnerFunddividerelationRequest {
	s.MerchantId = &v
	return s
}

func (s *CreateInnerFunddividerelationRequest) SetContractFiles(v []*FileInfo) *CreateInnerFunddividerelationRequest {
	s.ContractFiles = v
	return s
}

func (s *CreateInnerFunddividerelationRequest) SetDesc(v string) *CreateInnerFunddividerelationRequest {
	s.Desc = &v
	return s
}

func (s *CreateInnerFunddividerelationRequest) SetAlipayPid(v string) *CreateInnerFunddividerelationRequest {
	s.AlipayPid = &v
	return s
}

func (s *CreateInnerFunddividerelationRequest) SetAlipayAccount(v string) *CreateInnerFunddividerelationRequest {
	s.AlipayAccount = &v
	return s
}

func (s *CreateInnerFunddividerelationRequest) SetSubmit(v string) *CreateInnerFunddividerelationRequest {
	s.Submit = &v
	return s
}

func (s *CreateInnerFunddividerelationRequest) SetUserName(v string) *CreateInnerFunddividerelationRequest {
	s.UserName = &v
	return s
}

func (s *CreateInnerFunddividerelationRequest) SetSubjectMerchantId(v string) *CreateInnerFunddividerelationRequest {
	s.SubjectMerchantId = &v
	return s
}

func (s *CreateInnerFunddividerelationRequest) SetExpandMode(v string) *CreateInnerFunddividerelationRequest {
	s.ExpandMode = &v
	return s
}

type CreateInnerFunddividerelationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分账关系id
	RelationId *string `json:"relation_id,omitempty" xml:"relation_id,omitempty"`
}

func (s CreateInnerFunddividerelationResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateInnerFunddividerelationResponse) GoString() string {
	return s.String()
}

func (s *CreateInnerFunddividerelationResponse) SetReqMsgId(v string) *CreateInnerFunddividerelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateInnerFunddividerelationResponse) SetResultCode(v string) *CreateInnerFunddividerelationResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateInnerFunddividerelationResponse) SetResultMsg(v string) *CreateInnerFunddividerelationResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateInnerFunddividerelationResponse) SetRelationId(v string) *CreateInnerFunddividerelationResponse {
	s.RelationId = &v
	return s
}

type SubmitInnerFunddividerelationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 分账关系id
	RelationId *string `json:"relation_id,omitempty" xml:"relation_id,omitempty" require:"true"`
	// 操作人名称
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
}

func (s SubmitInnerFunddividerelationRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitInnerFunddividerelationRequest) GoString() string {
	return s.String()
}

func (s *SubmitInnerFunddividerelationRequest) SetAuthToken(v string) *SubmitInnerFunddividerelationRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitInnerFunddividerelationRequest) SetProductInstanceId(v string) *SubmitInnerFunddividerelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitInnerFunddividerelationRequest) SetTenantId(v string) *SubmitInnerFunddividerelationRequest {
	s.TenantId = &v
	return s
}

func (s *SubmitInnerFunddividerelationRequest) SetRelationId(v string) *SubmitInnerFunddividerelationRequest {
	s.RelationId = &v
	return s
}

func (s *SubmitInnerFunddividerelationRequest) SetUserName(v string) *SubmitInnerFunddividerelationRequest {
	s.UserName = &v
	return s
}

type SubmitInnerFunddividerelationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SubmitInnerFunddividerelationResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitInnerFunddividerelationResponse) GoString() string {
	return s.String()
}

func (s *SubmitInnerFunddividerelationResponse) SetReqMsgId(v string) *SubmitInnerFunddividerelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitInnerFunddividerelationResponse) SetResultCode(v string) *SubmitInnerFunddividerelationResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitInnerFunddividerelationResponse) SetResultMsg(v string) *SubmitInnerFunddividerelationResponse {
	s.ResultMsg = &v
	return s
}

type QueryInnerFunddividerelationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 分账关系id
	RelationId *string `json:"relation_id,omitempty" xml:"relation_id,omitempty" require:"true"`
}

func (s QueryInnerFunddividerelationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerFunddividerelationRequest) GoString() string {
	return s.String()
}

func (s *QueryInnerFunddividerelationRequest) SetAuthToken(v string) *QueryInnerFunddividerelationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInnerFunddividerelationRequest) SetProductInstanceId(v string) *QueryInnerFunddividerelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInnerFunddividerelationRequest) SetTenantId(v string) *QueryInnerFunddividerelationRequest {
	s.TenantId = &v
	return s
}

func (s *QueryInnerFunddividerelationRequest) SetRelationId(v string) *QueryInnerFunddividerelationRequest {
	s.RelationId = &v
	return s
}

type QueryInnerFunddividerelationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分账公司名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty"`
	// 分账主体企业统一社会信用代码
	SubjectMerchantId *string `json:"subject_merchant_id,omitempty" xml:"subject_merchant_id,omitempty"`
	// 分账主体公司名称
	SubjectCompanyName *string `json:"subject_company_name,omitempty" xml:"subject_company_name,omitempty"`
	// 分账对象统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// 分账合同或协议
	ContractFiles []*FileInfo `json:"contract_files,omitempty" xml:"contract_files,omitempty" type:"Repeated"`
	// 分账关系说明
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
	// 分账方企业pid
	AlipayPid *string `json:"alipay_pid,omitempty" xml:"alipay_pid,omitempty"`
	// 分账方企业支付宝账号
	AlipayAccount *string `json:"alipay_account,omitempty" xml:"alipay_account,omitempty"`
	// 审核列表
	AuditInfos []*AuditInfo `json:"audit_infos,omitempty" xml:"audit_infos,omitempty" type:"Repeated"`
	// INIT:待提交 AUDIT:审批中 AUDIT_PASSED:审批通过 AUDIT_NOT_PASSED:审批不通过
	RelationStatus *string `json:"relation_status,omitempty" xml:"relation_status,omitempty"`
	// 分账关系绑定失败原因
	RelationFailReason *string `json:"relation_fail_reason,omitempty" xml:"relation_fail_reason,omitempty"`
}

func (s QueryInnerFunddividerelationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerFunddividerelationResponse) GoString() string {
	return s.String()
}

func (s *QueryInnerFunddividerelationResponse) SetReqMsgId(v string) *QueryInnerFunddividerelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInnerFunddividerelationResponse) SetResultCode(v string) *QueryInnerFunddividerelationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInnerFunddividerelationResponse) SetResultMsg(v string) *QueryInnerFunddividerelationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInnerFunddividerelationResponse) SetCompanyName(v string) *QueryInnerFunddividerelationResponse {
	s.CompanyName = &v
	return s
}

func (s *QueryInnerFunddividerelationResponse) SetSubjectMerchantId(v string) *QueryInnerFunddividerelationResponse {
	s.SubjectMerchantId = &v
	return s
}

func (s *QueryInnerFunddividerelationResponse) SetSubjectCompanyName(v string) *QueryInnerFunddividerelationResponse {
	s.SubjectCompanyName = &v
	return s
}

func (s *QueryInnerFunddividerelationResponse) SetMerchantId(v string) *QueryInnerFunddividerelationResponse {
	s.MerchantId = &v
	return s
}

func (s *QueryInnerFunddividerelationResponse) SetContractFiles(v []*FileInfo) *QueryInnerFunddividerelationResponse {
	s.ContractFiles = v
	return s
}

func (s *QueryInnerFunddividerelationResponse) SetDesc(v string) *QueryInnerFunddividerelationResponse {
	s.Desc = &v
	return s
}

func (s *QueryInnerFunddividerelationResponse) SetAlipayPid(v string) *QueryInnerFunddividerelationResponse {
	s.AlipayPid = &v
	return s
}

func (s *QueryInnerFunddividerelationResponse) SetAlipayAccount(v string) *QueryInnerFunddividerelationResponse {
	s.AlipayAccount = &v
	return s
}

func (s *QueryInnerFunddividerelationResponse) SetAuditInfos(v []*AuditInfo) *QueryInnerFunddividerelationResponse {
	s.AuditInfos = v
	return s
}

func (s *QueryInnerFunddividerelationResponse) SetRelationStatus(v string) *QueryInnerFunddividerelationResponse {
	s.RelationStatus = &v
	return s
}

func (s *QueryInnerFunddividerelationResponse) SetRelationFailReason(v string) *QueryInnerFunddividerelationResponse {
	s.RelationFailReason = &v
	return s
}

type PagequeryInnerFunddividerelationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 分页查询对象
	PageInfo *PageQuery `json:"page_info,omitempty" xml:"page_info,omitempty" require:"true"`
	// 商户公司社会统一信用代码
	SubjectMerchantId *string `json:"subject_merchant_id,omitempty" xml:"subject_merchant_id,omitempty"`
	// 商户公司名称
	SubjectCompanyName *string `json:"subject_company_name,omitempty" xml:"subject_company_name,omitempty"`
	// 状态
	// NIT:待提交
	// AUDIT:审批中 AUDIT_PASSED:审批通过
	// AUDIT_NOT_PASSED:审批不通过
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s PagequeryInnerFunddividerelationRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerFunddividerelationRequest) GoString() string {
	return s.String()
}

func (s *PagequeryInnerFunddividerelationRequest) SetAuthToken(v string) *PagequeryInnerFunddividerelationRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryInnerFunddividerelationRequest) SetProductInstanceId(v string) *PagequeryInnerFunddividerelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryInnerFunddividerelationRequest) SetTenantId(v string) *PagequeryInnerFunddividerelationRequest {
	s.TenantId = &v
	return s
}

func (s *PagequeryInnerFunddividerelationRequest) SetPageInfo(v *PageQuery) *PagequeryInnerFunddividerelationRequest {
	s.PageInfo = v
	return s
}

func (s *PagequeryInnerFunddividerelationRequest) SetSubjectMerchantId(v string) *PagequeryInnerFunddividerelationRequest {
	s.SubjectMerchantId = &v
	return s
}

func (s *PagequeryInnerFunddividerelationRequest) SetSubjectCompanyName(v string) *PagequeryInnerFunddividerelationRequest {
	s.SubjectCompanyName = &v
	return s
}

func (s *PagequeryInnerFunddividerelationRequest) SetStatus(v string) *PagequeryInnerFunddividerelationRequest {
	s.Status = &v
	return s
}

type PagequeryInnerFunddividerelationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据总量
	TotalSize *int64 `json:"total_size,omitempty" xml:"total_size,omitempty"`
	// 分账关系页对象列表
	Relations []*RelationPage `json:"relations,omitempty" xml:"relations,omitempty" type:"Repeated"`
}

func (s PagequeryInnerFunddividerelationResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerFunddividerelationResponse) GoString() string {
	return s.String()
}

func (s *PagequeryInnerFunddividerelationResponse) SetReqMsgId(v string) *PagequeryInnerFunddividerelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryInnerFunddividerelationResponse) SetResultCode(v string) *PagequeryInnerFunddividerelationResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryInnerFunddividerelationResponse) SetResultMsg(v string) *PagequeryInnerFunddividerelationResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryInnerFunddividerelationResponse) SetTotalSize(v int64) *PagequeryInnerFunddividerelationResponse {
	s.TotalSize = &v
	return s
}

func (s *PagequeryInnerFunddividerelationResponse) SetRelations(v []*RelationPage) *PagequeryInnerFunddividerelationResponse {
	s.Relations = v
	return s
}

type CreateInnerMerchantagreementRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 协议编号
	AgreementId *string `json:"agreement_id,omitempty" xml:"agreement_id,omitempty" require:"true"`
	// 签署动作
	SignAction *string `json:"sign_action,omitempty" xml:"sign_action,omitempty" require:"true"`
	// 操作人名称
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
}

func (s CreateInnerMerchantagreementRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateInnerMerchantagreementRequest) GoString() string {
	return s.String()
}

func (s *CreateInnerMerchantagreementRequest) SetAuthToken(v string) *CreateInnerMerchantagreementRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateInnerMerchantagreementRequest) SetProductInstanceId(v string) *CreateInnerMerchantagreementRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateInnerMerchantagreementRequest) SetTenantId(v string) *CreateInnerMerchantagreementRequest {
	s.TenantId = &v
	return s
}

func (s *CreateInnerMerchantagreementRequest) SetAgreementId(v string) *CreateInnerMerchantagreementRequest {
	s.AgreementId = &v
	return s
}

func (s *CreateInnerMerchantagreementRequest) SetSignAction(v string) *CreateInnerMerchantagreementRequest {
	s.SignAction = &v
	return s
}

func (s *CreateInnerMerchantagreementRequest) SetUserName(v string) *CreateInnerMerchantagreementRequest {
	s.UserName = &v
	return s
}

type CreateInnerMerchantagreementResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateInnerMerchantagreementResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateInnerMerchantagreementResponse) GoString() string {
	return s.String()
}

func (s *CreateInnerMerchantagreementResponse) SetReqMsgId(v string) *CreateInnerMerchantagreementResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateInnerMerchantagreementResponse) SetResultCode(v string) *CreateInnerMerchantagreementResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateInnerMerchantagreementResponse) SetResultMsg(v string) *CreateInnerMerchantagreementResponse {
	s.ResultMsg = &v
	return s
}

type QueryInnerMerchantagreementRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 协议id
	AgreementId *string `json:"agreement_id,omitempty" xml:"agreement_id,omitempty" require:"true"`
	// 租户账号
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
}

func (s QueryInnerMerchantagreementRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerMerchantagreementRequest) GoString() string {
	return s.String()
}

func (s *QueryInnerMerchantagreementRequest) SetAuthToken(v string) *QueryInnerMerchantagreementRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInnerMerchantagreementRequest) SetProductInstanceId(v string) *QueryInnerMerchantagreementRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInnerMerchantagreementRequest) SetTenantId(v string) *QueryInnerMerchantagreementRequest {
	s.TenantId = &v
	return s
}

func (s *QueryInnerMerchantagreementRequest) SetAgreementId(v string) *QueryInnerMerchantagreementRequest {
	s.AgreementId = &v
	return s
}

func (s *QueryInnerMerchantagreementRequest) SetUserName(v string) *QueryInnerMerchantagreementRequest {
	s.UserName = &v
	return s
}

type QueryInnerMerchantagreementResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签约状态 枚举
	// TOBE 待签
	// FAIL 签约失败
	// SUCCESS 签约成功
	SignStatus *string `json:"sign_status,omitempty" xml:"sign_status,omitempty"`
	// 签约时间
	SignDateStr *string `json:"sign_date_str,omitempty" xml:"sign_date_str,omitempty"`
	// 协议内容 富文本
	AgreementContent *string `json:"agreement_content,omitempty" xml:"agreement_content,omitempty"`
}

func (s QueryInnerMerchantagreementResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerMerchantagreementResponse) GoString() string {
	return s.String()
}

func (s *QueryInnerMerchantagreementResponse) SetReqMsgId(v string) *QueryInnerMerchantagreementResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInnerMerchantagreementResponse) SetResultCode(v string) *QueryInnerMerchantagreementResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInnerMerchantagreementResponse) SetResultMsg(v string) *QueryInnerMerchantagreementResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInnerMerchantagreementResponse) SetSignStatus(v string) *QueryInnerMerchantagreementResponse {
	s.SignStatus = &v
	return s
}

func (s *QueryInnerMerchantagreementResponse) SetSignDateStr(v string) *QueryInnerMerchantagreementResponse {
	s.SignDateStr = &v
	return s
}

func (s *QueryInnerMerchantagreementResponse) SetAgreementContent(v string) *QueryInnerMerchantagreementResponse {
	s.AgreementContent = &v
	return s
}

type PagequeryInnerMerchantagreementRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 分页对象
	PageInfo *PageQuery `json:"page_info,omitempty" xml:"page_info,omitempty" require:"true"`
	// 租户账号
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
}

func (s PagequeryInnerMerchantagreementRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerMerchantagreementRequest) GoString() string {
	return s.String()
}

func (s *PagequeryInnerMerchantagreementRequest) SetAuthToken(v string) *PagequeryInnerMerchantagreementRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryInnerMerchantagreementRequest) SetProductInstanceId(v string) *PagequeryInnerMerchantagreementRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryInnerMerchantagreementRequest) SetTenantId(v string) *PagequeryInnerMerchantagreementRequest {
	s.TenantId = &v
	return s
}

func (s *PagequeryInnerMerchantagreementRequest) SetPageInfo(v *PageQuery) *PagequeryInnerMerchantagreementRequest {
	s.PageInfo = v
	return s
}

func (s *PagequeryInnerMerchantagreementRequest) SetUserName(v string) *PagequeryInnerMerchantagreementRequest {
	s.UserName = &v
	return s
}

type PagequeryInnerMerchantagreementResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据总量
	TotalSize *int64 `json:"total_size,omitempty" xml:"total_size,omitempty"`
	// 协议分页对象
	AgreementPage []*AgreementPage `json:"agreement_page,omitempty" xml:"agreement_page,omitempty" type:"Repeated"`
}

func (s PagequeryInnerMerchantagreementResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerMerchantagreementResponse) GoString() string {
	return s.String()
}

func (s *PagequeryInnerMerchantagreementResponse) SetReqMsgId(v string) *PagequeryInnerMerchantagreementResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryInnerMerchantagreementResponse) SetResultCode(v string) *PagequeryInnerMerchantagreementResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryInnerMerchantagreementResponse) SetResultMsg(v string) *PagequeryInnerMerchantagreementResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryInnerMerchantagreementResponse) SetTotalSize(v int64) *PagequeryInnerMerchantagreementResponse {
	s.TotalSize = &v
	return s
}

func (s *PagequeryInnerMerchantagreementResponse) SetAgreementPage(v []*AgreementPage) *PagequeryInnerMerchantagreementResponse {
	s.AgreementPage = v
	return s
}

type CreateInnerMerchantpayexpandRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 公司信息
	CompanyInfo *CompanyInfo `json:"company_info,omitempty" xml:"company_info,omitempty" require:"true"`
	// 法人信息
	LegalInfo *LegalInfo `json:"legal_info,omitempty" xml:"legal_info,omitempty" require:"true"`
	// 应用信息
	ApplicationInfo *ApplicationInfo `json:"application_info,omitempty" xml:"application_info,omitempty" require:"true"`
	// 是否直接提交
	// SUBMITTED 直接提交
	// STAGE 暂存
	Submit *string `json:"submit,omitempty" xml:"submit,omitempty" require:"true"`
	// 进件模式
	// DIRECT(直连进件)
	// AGENT(代理进件)
	ExpandMode *string `json:"expand_mode,omitempty" xml:"expand_mode,omitempty" require:"true"`
	// expand_mode=_AGENT_ 必填
	SubTenantId *string `json:"sub_tenant_id,omitempty" xml:"sub_tenant_id,omitempty"`
	// 操作人名称
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 第一次暂存或保存可以不传，后端直接生成
	PayExpandId *string `json:"pay_expand_id,omitempty" xml:"pay_expand_id,omitempty"`
	// true允许重复进件，false不允许重复进件
	AllowDuplicate *bool `json:"allow_duplicate,omitempty" xml:"allow_duplicate,omitempty"`
}

func (s CreateInnerMerchantpayexpandRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateInnerMerchantpayexpandRequest) GoString() string {
	return s.String()
}

func (s *CreateInnerMerchantpayexpandRequest) SetAuthToken(v string) *CreateInnerMerchantpayexpandRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateInnerMerchantpayexpandRequest) SetProductInstanceId(v string) *CreateInnerMerchantpayexpandRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateInnerMerchantpayexpandRequest) SetTenantId(v string) *CreateInnerMerchantpayexpandRequest {
	s.TenantId = &v
	return s
}

func (s *CreateInnerMerchantpayexpandRequest) SetCompanyInfo(v *CompanyInfo) *CreateInnerMerchantpayexpandRequest {
	s.CompanyInfo = v
	return s
}

func (s *CreateInnerMerchantpayexpandRequest) SetLegalInfo(v *LegalInfo) *CreateInnerMerchantpayexpandRequest {
	s.LegalInfo = v
	return s
}

func (s *CreateInnerMerchantpayexpandRequest) SetApplicationInfo(v *ApplicationInfo) *CreateInnerMerchantpayexpandRequest {
	s.ApplicationInfo = v
	return s
}

func (s *CreateInnerMerchantpayexpandRequest) SetSubmit(v string) *CreateInnerMerchantpayexpandRequest {
	s.Submit = &v
	return s
}

func (s *CreateInnerMerchantpayexpandRequest) SetExpandMode(v string) *CreateInnerMerchantpayexpandRequest {
	s.ExpandMode = &v
	return s
}

func (s *CreateInnerMerchantpayexpandRequest) SetSubTenantId(v string) *CreateInnerMerchantpayexpandRequest {
	s.SubTenantId = &v
	return s
}

func (s *CreateInnerMerchantpayexpandRequest) SetUserName(v string) *CreateInnerMerchantpayexpandRequest {
	s.UserName = &v
	return s
}

func (s *CreateInnerMerchantpayexpandRequest) SetPayExpandId(v string) *CreateInnerMerchantpayexpandRequest {
	s.PayExpandId = &v
	return s
}

func (s *CreateInnerMerchantpayexpandRequest) SetAllowDuplicate(v bool) *CreateInnerMerchantpayexpandRequest {
	s.AllowDuplicate = &v
	return s
}

type CreateInnerMerchantpayexpandResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 进件流水号
	PayExpandId *string `json:"pay_expand_id,omitempty" xml:"pay_expand_id,omitempty"`
}

func (s CreateInnerMerchantpayexpandResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateInnerMerchantpayexpandResponse) GoString() string {
	return s.String()
}

func (s *CreateInnerMerchantpayexpandResponse) SetReqMsgId(v string) *CreateInnerMerchantpayexpandResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateInnerMerchantpayexpandResponse) SetResultCode(v string) *CreateInnerMerchantpayexpandResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateInnerMerchantpayexpandResponse) SetResultMsg(v string) *CreateInnerMerchantpayexpandResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateInnerMerchantpayexpandResponse) SetPayExpandId(v string) *CreateInnerMerchantpayexpandResponse {
	s.PayExpandId = &v
	return s
}

type SubmitInnerMerchantpayexpandRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 进件id
	PayExpandId *string `json:"pay_expand_id,omitempty" xml:"pay_expand_id,omitempty" require:"true"`
	// 操作人名称
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
}

func (s SubmitInnerMerchantpayexpandRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitInnerMerchantpayexpandRequest) GoString() string {
	return s.String()
}

func (s *SubmitInnerMerchantpayexpandRequest) SetAuthToken(v string) *SubmitInnerMerchantpayexpandRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitInnerMerchantpayexpandRequest) SetProductInstanceId(v string) *SubmitInnerMerchantpayexpandRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitInnerMerchantpayexpandRequest) SetTenantId(v string) *SubmitInnerMerchantpayexpandRequest {
	s.TenantId = &v
	return s
}

func (s *SubmitInnerMerchantpayexpandRequest) SetPayExpandId(v string) *SubmitInnerMerchantpayexpandRequest {
	s.PayExpandId = &v
	return s
}

func (s *SubmitInnerMerchantpayexpandRequest) SetUserName(v string) *SubmitInnerMerchantpayexpandRequest {
	s.UserName = &v
	return s
}

type SubmitInnerMerchantpayexpandResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SubmitInnerMerchantpayexpandResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitInnerMerchantpayexpandResponse) GoString() string {
	return s.String()
}

func (s *SubmitInnerMerchantpayexpandResponse) SetReqMsgId(v string) *SubmitInnerMerchantpayexpandResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitInnerMerchantpayexpandResponse) SetResultCode(v string) *SubmitInnerMerchantpayexpandResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitInnerMerchantpayexpandResponse) SetResultMsg(v string) *SubmitInnerMerchantpayexpandResponse {
	s.ResultMsg = &v
	return s
}

type QueryInnerMerchantpayexpandRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 进件id expand_mode=AGENT 必填 DIRECT可以根据tenant_id推断
	PayExpandId *string `json:"pay_expand_id,omitempty" xml:"pay_expand_id,omitempty"`
	// 进件模式 DIRECT(直连进件) AGENT(代理进件)
	ExpandMode *string `json:"expand_mode,omitempty" xml:"expand_mode,omitempty" require:"true"`
}

func (s QueryInnerMerchantpayexpandRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerMerchantpayexpandRequest) GoString() string {
	return s.String()
}

func (s *QueryInnerMerchantpayexpandRequest) SetAuthToken(v string) *QueryInnerMerchantpayexpandRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInnerMerchantpayexpandRequest) SetProductInstanceId(v string) *QueryInnerMerchantpayexpandRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInnerMerchantpayexpandRequest) SetTenantId(v string) *QueryInnerMerchantpayexpandRequest {
	s.TenantId = &v
	return s
}

func (s *QueryInnerMerchantpayexpandRequest) SetPayExpandId(v string) *QueryInnerMerchantpayexpandRequest {
	s.PayExpandId = &v
	return s
}

func (s *QueryInnerMerchantpayexpandRequest) SetExpandMode(v string) *QueryInnerMerchantpayexpandRequest {
	s.ExpandMode = &v
	return s
}

type QueryInnerMerchantpayexpandResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 公司信息
	CompanyInfo *CompanyInfo `json:"company_info,omitempty" xml:"company_info,omitempty"`
	// 法人信息
	LegalInfo *LegalInfo `json:"legal_info,omitempty" xml:"legal_info,omitempty"`
	// 应用信息
	ApplicationInfo *ApplicationInfo `json:"application_info,omitempty" xml:"application_info,omitempty"`
	// 审核列表
	AuditInfos []*AuditInfo `json:"audit_infos,omitempty" xml:"audit_infos,omitempty" type:"Repeated"`
	// 进件流水号
	PayExpandId *string `json:"pay_expand_id,omitempty" xml:"pay_expand_id,omitempty"`
	// 进件模式 DIRECT(直连进件) AGENT(代理进件)
	ExpandMode *string `json:"expand_mode,omitempty" xml:"expand_mode,omitempty"`
	// INIT:草稿态 SUB_MERCHANT_CREDIT:二级户商户签约中 AUDIT:审核中 AUDIT_PASSED:进件成功 AUDIT_NOT_PASSED:进件失败 MERCHANT_CONFIRM:待商户确认
	ExpandStatus *string `json:"expand_status,omitempty" xml:"expand_status,omitempty"`
	// 进件失败描述
	ExpandFailReason *string `json:"expand_fail_reason,omitempty" xml:"expand_fail_reason,omitempty"`
	// 是否展示客服信息登记入口
	ShowCustomerServiceBanner *bool `json:"show_customer_service_banner,omitempty" xml:"show_customer_service_banner,omitempty"`
}

func (s QueryInnerMerchantpayexpandResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerMerchantpayexpandResponse) GoString() string {
	return s.String()
}

func (s *QueryInnerMerchantpayexpandResponse) SetReqMsgId(v string) *QueryInnerMerchantpayexpandResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInnerMerchantpayexpandResponse) SetResultCode(v string) *QueryInnerMerchantpayexpandResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInnerMerchantpayexpandResponse) SetResultMsg(v string) *QueryInnerMerchantpayexpandResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInnerMerchantpayexpandResponse) SetCompanyInfo(v *CompanyInfo) *QueryInnerMerchantpayexpandResponse {
	s.CompanyInfo = v
	return s
}

func (s *QueryInnerMerchantpayexpandResponse) SetLegalInfo(v *LegalInfo) *QueryInnerMerchantpayexpandResponse {
	s.LegalInfo = v
	return s
}

func (s *QueryInnerMerchantpayexpandResponse) SetApplicationInfo(v *ApplicationInfo) *QueryInnerMerchantpayexpandResponse {
	s.ApplicationInfo = v
	return s
}

func (s *QueryInnerMerchantpayexpandResponse) SetAuditInfos(v []*AuditInfo) *QueryInnerMerchantpayexpandResponse {
	s.AuditInfos = v
	return s
}

func (s *QueryInnerMerchantpayexpandResponse) SetPayExpandId(v string) *QueryInnerMerchantpayexpandResponse {
	s.PayExpandId = &v
	return s
}

func (s *QueryInnerMerchantpayexpandResponse) SetExpandMode(v string) *QueryInnerMerchantpayexpandResponse {
	s.ExpandMode = &v
	return s
}

func (s *QueryInnerMerchantpayexpandResponse) SetExpandStatus(v string) *QueryInnerMerchantpayexpandResponse {
	s.ExpandStatus = &v
	return s
}

func (s *QueryInnerMerchantpayexpandResponse) SetExpandFailReason(v string) *QueryInnerMerchantpayexpandResponse {
	s.ExpandFailReason = &v
	return s
}

func (s *QueryInnerMerchantpayexpandResponse) SetShowCustomerServiceBanner(v bool) *QueryInnerMerchantpayexpandResponse {
	s.ShowCustomerServiceBanner = &v
	return s
}

type PagequeryInnerMerchantagentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 代理商户名称
	AgentName *string `json:"agent_name,omitempty" xml:"agent_name,omitempty"`
	// 进件状态
	PayExpandStatus *string `json:"pay_expand_status,omitempty" xml:"pay_expand_status,omitempty"`
	// 分页对象
	PageInfo *PageQuery `json:"page_info,omitempty" xml:"page_info,omitempty" require:"true"`
}

func (s PagequeryInnerMerchantagentRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerMerchantagentRequest) GoString() string {
	return s.String()
}

func (s *PagequeryInnerMerchantagentRequest) SetAuthToken(v string) *PagequeryInnerMerchantagentRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryInnerMerchantagentRequest) SetProductInstanceId(v string) *PagequeryInnerMerchantagentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryInnerMerchantagentRequest) SetTenantId(v string) *PagequeryInnerMerchantagentRequest {
	s.TenantId = &v
	return s
}

func (s *PagequeryInnerMerchantagentRequest) SetAgentName(v string) *PagequeryInnerMerchantagentRequest {
	s.AgentName = &v
	return s
}

func (s *PagequeryInnerMerchantagentRequest) SetPayExpandStatus(v string) *PagequeryInnerMerchantagentRequest {
	s.PayExpandStatus = &v
	return s
}

func (s *PagequeryInnerMerchantagentRequest) SetPageInfo(v *PageQuery) *PagequeryInnerMerchantagentRequest {
	s.PageInfo = v
	return s
}

type PagequeryInnerMerchantagentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据总量
	TotalSize *int64 `json:"total_size,omitempty" xml:"total_size,omitempty"`
	// 代理租户分页对象
	MerchantAgentPage []*MerchantAgentPage `json:"merchant_agent_page,omitempty" xml:"merchant_agent_page,omitempty" type:"Repeated"`
}

func (s PagequeryInnerMerchantagentResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerMerchantagentResponse) GoString() string {
	return s.String()
}

func (s *PagequeryInnerMerchantagentResponse) SetReqMsgId(v string) *PagequeryInnerMerchantagentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryInnerMerchantagentResponse) SetResultCode(v string) *PagequeryInnerMerchantagentResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryInnerMerchantagentResponse) SetResultMsg(v string) *PagequeryInnerMerchantagentResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryInnerMerchantagentResponse) SetTotalSize(v int64) *PagequeryInnerMerchantagentResponse {
	s.TotalSize = &v
	return s
}

func (s *PagequeryInnerMerchantagentResponse) SetMerchantAgentPage(v []*MerchantAgentPage) *PagequeryInnerMerchantagentResponse {
	s.MerchantAgentPage = v
	return s
}

type CloneInnerTemplatefileaddressRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 模板编码
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 文件key
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty" require:"true"`
}

func (s CloneInnerTemplatefileaddressRequest) String() string {
	return tea.Prettify(s)
}

func (s CloneInnerTemplatefileaddressRequest) GoString() string {
	return s.String()
}

func (s *CloneInnerTemplatefileaddressRequest) SetAuthToken(v string) *CloneInnerTemplatefileaddressRequest {
	s.AuthToken = &v
	return s
}

func (s *CloneInnerTemplatefileaddressRequest) SetProductInstanceId(v string) *CloneInnerTemplatefileaddressRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CloneInnerTemplatefileaddressRequest) SetTenantId(v string) *CloneInnerTemplatefileaddressRequest {
	s.TenantId = &v
	return s
}

func (s *CloneInnerTemplatefileaddressRequest) SetTemplateCode(v string) *CloneInnerTemplatefileaddressRequest {
	s.TemplateCode = &v
	return s
}

func (s *CloneInnerTemplatefileaddressRequest) SetFileKey(v string) *CloneInnerTemplatefileaddressRequest {
	s.FileKey = &v
	return s
}

type CloneInnerTemplatefileaddressResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 拷贝后的文件key
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty"`
}

func (s CloneInnerTemplatefileaddressResponse) String() string {
	return tea.Prettify(s)
}

func (s CloneInnerTemplatefileaddressResponse) GoString() string {
	return s.String()
}

func (s *CloneInnerTemplatefileaddressResponse) SetReqMsgId(v string) *CloneInnerTemplatefileaddressResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CloneInnerTemplatefileaddressResponse) SetResultCode(v string) *CloneInnerTemplatefileaddressResponse {
	s.ResultCode = &v
	return s
}

func (s *CloneInnerTemplatefileaddressResponse) SetResultMsg(v string) *CloneInnerTemplatefileaddressResponse {
	s.ResultMsg = &v
	return s
}

func (s *CloneInnerTemplatefileaddressResponse) SetFileKey(v string) *CloneInnerTemplatefileaddressResponse {
	s.FileKey = &v
	return s
}

type QueryInnerSignfieldsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 魔法库模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 魔法库模板版本
	TemplateVersion *string `json:"template_version,omitempty" xml:"template_version,omitempty" require:"true"`
}

func (s QueryInnerSignfieldsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerSignfieldsRequest) GoString() string {
	return s.String()
}

func (s *QueryInnerSignfieldsRequest) SetAuthToken(v string) *QueryInnerSignfieldsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInnerSignfieldsRequest) SetProductInstanceId(v string) *QueryInnerSignfieldsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInnerSignfieldsRequest) SetTenantId(v string) *QueryInnerSignfieldsRequest {
	s.TenantId = &v
	return s
}

func (s *QueryInnerSignfieldsRequest) SetTemplateCode(v string) *QueryInnerSignfieldsRequest {
	s.TemplateCode = &v
	return s
}

func (s *QueryInnerSignfieldsRequest) SetTemplateVersion(v string) *QueryInnerSignfieldsRequest {
	s.TemplateVersion = &v
	return s
}

type QueryInnerSignfieldsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署区列表
	SignFieldList *string `json:"sign_field_list,omitempty" xml:"sign_field_list,omitempty"`
}

func (s QueryInnerSignfieldsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerSignfieldsResponse) GoString() string {
	return s.String()
}

func (s *QueryInnerSignfieldsResponse) SetReqMsgId(v string) *QueryInnerSignfieldsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInnerSignfieldsResponse) SetResultCode(v string) *QueryInnerSignfieldsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInnerSignfieldsResponse) SetResultMsg(v string) *QueryInnerSignfieldsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInnerSignfieldsResponse) SetSignFieldList(v string) *QueryInnerSignfieldsResponse {
	s.SignFieldList = &v
	return s
}

type SyncInnerTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 来源魔法库模板code
	SourceTemplateCode *string `json:"source_template_code,omitempty" xml:"source_template_code,omitempty" require:"true"`
	// 目标魔法库模板名称
	TargetTemplateName *string `json:"target_template_name,omitempty" xml:"target_template_name,omitempty"`
	// 模板同步的场景，值参考：CREATE_TEMPLATE、SYNC_PROD
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 魔法库来源模板版本
	SourceTemplateVersion *string `json:"source_template_version,omitempty" xml:"source_template_version,omitempty" require:"true"`
}

func (s SyncInnerTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncInnerTemplateRequest) GoString() string {
	return s.String()
}

func (s *SyncInnerTemplateRequest) SetAuthToken(v string) *SyncInnerTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncInnerTemplateRequest) SetProductInstanceId(v string) *SyncInnerTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncInnerTemplateRequest) SetTenantId(v string) *SyncInnerTemplateRequest {
	s.TenantId = &v
	return s
}

func (s *SyncInnerTemplateRequest) SetSourceTemplateCode(v string) *SyncInnerTemplateRequest {
	s.SourceTemplateCode = &v
	return s
}

func (s *SyncInnerTemplateRequest) SetTargetTemplateName(v string) *SyncInnerTemplateRequest {
	s.TargetTemplateName = &v
	return s
}

func (s *SyncInnerTemplateRequest) SetScene(v string) *SyncInnerTemplateRequest {
	s.Scene = &v
	return s
}

func (s *SyncInnerTemplateRequest) SetSourceTemplateVersion(v string) *SyncInnerTemplateRequest {
	s.SourceTemplateVersion = &v
	return s
}

type SyncInnerTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 同步后的新模板code
	TargetTemplateCode *string `json:"target_template_code,omitempty" xml:"target_template_code,omitempty"`
	// 模板同步上线时(强管控字段)校验结果
	ValidResult *bool `json:"valid_result,omitempty" xml:"valid_result,omitempty"`
	// 校验结果明细JSONStr
	ValidFieldDetail *string `json:"valid_field_detail,omitempty" xml:"valid_field_detail,omitempty"`
}

func (s SyncInnerTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncInnerTemplateResponse) GoString() string {
	return s.String()
}

func (s *SyncInnerTemplateResponse) SetReqMsgId(v string) *SyncInnerTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncInnerTemplateResponse) SetResultCode(v string) *SyncInnerTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncInnerTemplateResponse) SetResultMsg(v string) *SyncInnerTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncInnerTemplateResponse) SetTargetTemplateCode(v string) *SyncInnerTemplateResponse {
	s.TargetTemplateCode = &v
	return s
}

func (s *SyncInnerTemplateResponse) SetValidResult(v bool) *SyncInnerTemplateResponse {
	s.ValidResult = &v
	return s
}

func (s *SyncInnerTemplateResponse) SetValidFieldDetail(v string) *SyncInnerTemplateResponse {
	s.ValidFieldDetail = &v
	return s
}

type UpdateInnerTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 模板名称
	TemplateName *string `json:"template_name,omitempty" xml:"template_name,omitempty" require:"true"`
	// 模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
}

func (s UpdateInnerTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateInnerTemplateRequest) GoString() string {
	return s.String()
}

func (s *UpdateInnerTemplateRequest) SetAuthToken(v string) *UpdateInnerTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateInnerTemplateRequest) SetProductInstanceId(v string) *UpdateInnerTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateInnerTemplateRequest) SetTenantId(v string) *UpdateInnerTemplateRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateInnerTemplateRequest) SetTemplateName(v string) *UpdateInnerTemplateRequest {
	s.TemplateName = &v
	return s
}

func (s *UpdateInnerTemplateRequest) SetTemplateCode(v string) *UpdateInnerTemplateRequest {
	s.TemplateCode = &v
	return s
}

type UpdateInnerTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateInnerTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateInnerTemplateResponse) GoString() string {
	return s.String()
}

func (s *UpdateInnerTemplateResponse) SetReqMsgId(v string) *UpdateInnerTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateInnerTemplateResponse) SetResultCode(v string) *UpdateInnerTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateInnerTemplateResponse) SetResultMsg(v string) *UpdateInnerTemplateResponse {
	s.ResultMsg = &v
	return s
}

type QueryInnerTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
}

func (s QueryInnerTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerTemplateRequest) GoString() string {
	return s.String()
}

func (s *QueryInnerTemplateRequest) SetAuthToken(v string) *QueryInnerTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInnerTemplateRequest) SetProductInstanceId(v string) *QueryInnerTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInnerTemplateRequest) SetTemplateCode(v string) *QueryInnerTemplateRequest {
	s.TemplateCode = &v
	return s
}

func (s *QueryInnerTemplateRequest) SetTenantId(v string) *QueryInnerTemplateRequest {
	s.TenantId = &v
	return s
}

type QueryInnerTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模板的基本信息，json格式
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryInnerTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerTemplateResponse) GoString() string {
	return s.String()
}

func (s *QueryInnerTemplateResponse) SetReqMsgId(v string) *QueryInnerTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInnerTemplateResponse) SetResultCode(v string) *QueryInnerTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInnerTemplateResponse) SetResultMsg(v string) *QueryInnerTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInnerTemplateResponse) SetData(v string) *QueryInnerTemplateResponse {
	s.Data = &v
	return s
}

type QueryInnerTemplateelementlinkRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 模板版本
	TemplateVersion *string `json:"template_version,omitempty" xml:"template_version,omitempty" require:"true"`
}

func (s QueryInnerTemplateelementlinkRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerTemplateelementlinkRequest) GoString() string {
	return s.String()
}

func (s *QueryInnerTemplateelementlinkRequest) SetAuthToken(v string) *QueryInnerTemplateelementlinkRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInnerTemplateelementlinkRequest) SetProductInstanceId(v string) *QueryInnerTemplateelementlinkRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInnerTemplateelementlinkRequest) SetTenantId(v string) *QueryInnerTemplateelementlinkRequest {
	s.TenantId = &v
	return s
}

func (s *QueryInnerTemplateelementlinkRequest) SetTemplateCode(v string) *QueryInnerTemplateelementlinkRequest {
	s.TemplateCode = &v
	return s
}

func (s *QueryInnerTemplateelementlinkRequest) SetTemplateVersion(v string) *QueryInnerTemplateelementlinkRequest {
	s.TemplateVersion = &v
	return s
}

type QueryInnerTemplateelementlinkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模板元素列表，json格式
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryInnerTemplateelementlinkResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerTemplateelementlinkResponse) GoString() string {
	return s.String()
}

func (s *QueryInnerTemplateelementlinkResponse) SetReqMsgId(v string) *QueryInnerTemplateelementlinkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInnerTemplateelementlinkResponse) SetResultCode(v string) *QueryInnerTemplateelementlinkResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInnerTemplateelementlinkResponse) SetResultMsg(v string) *QueryInnerTemplateelementlinkResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInnerTemplateelementlinkResponse) SetData(v string) *QueryInnerTemplateelementlinkResponse {
	s.Data = &v
	return s
}

type QueryInnerTemplateversionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 模板编码
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 模板的版本号，示例：1、2、3等
	TemplateVersion *string `json:"template_version,omitempty" xml:"template_version,omitempty" require:"true"`
}

func (s QueryInnerTemplateversionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerTemplateversionRequest) GoString() string {
	return s.String()
}

func (s *QueryInnerTemplateversionRequest) SetAuthToken(v string) *QueryInnerTemplateversionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInnerTemplateversionRequest) SetProductInstanceId(v string) *QueryInnerTemplateversionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInnerTemplateversionRequest) SetTenantId(v string) *QueryInnerTemplateversionRequest {
	s.TenantId = &v
	return s
}

func (s *QueryInnerTemplateversionRequest) SetTemplateCode(v string) *QueryInnerTemplateversionRequest {
	s.TemplateCode = &v
	return s
}

func (s *QueryInnerTemplateversionRequest) SetTemplateVersion(v string) *QueryInnerTemplateversionRequest {
	s.TemplateVersion = &v
	return s
}

type QueryInnerTemplateversionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模板的版本详情信息
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryInnerTemplateversionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerTemplateversionResponse) GoString() string {
	return s.String()
}

func (s *QueryInnerTemplateversionResponse) SetReqMsgId(v string) *QueryInnerTemplateversionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInnerTemplateversionResponse) SetResultCode(v string) *QueryInnerTemplateversionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInnerTemplateversionResponse) SetResultMsg(v string) *QueryInnerTemplateversionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInnerTemplateversionResponse) SetData(v string) *QueryInnerTemplateversionResponse {
	s.Data = &v
	return s
}

type PagequeryInnerOrdermsgRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	//
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 订单ID
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 消息类型
	MsgPublishType *string `json:"msg_publish_type,omitempty" xml:"msg_publish_type,omitempty"`
	// 消息创建时间起始
	MsgCreateTimeFrom *string `json:"msg_create_time_from,omitempty" xml:"msg_create_time_from,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 消息创建时间结束
	MsgCreateTimeTo *string `json:"msg_create_time_to,omitempty" xml:"msg_create_time_to,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// SANDBOX 沙箱 ；PROD 生产
	Env *string `json:"env,omitempty" xml:"env,omitempty" require:"true"`
	// 分页查询对象
	PageInfo *PageQuery `json:"page_info,omitempty" xml:"page_info,omitempty" require:"true"`
}

func (s PagequeryInnerOrdermsgRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerOrdermsgRequest) GoString() string {
	return s.String()
}

func (s *PagequeryInnerOrdermsgRequest) SetAuthToken(v string) *PagequeryInnerOrdermsgRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryInnerOrdermsgRequest) SetProductInstanceId(v string) *PagequeryInnerOrdermsgRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryInnerOrdermsgRequest) SetTenantId(v string) *PagequeryInnerOrdermsgRequest {
	s.TenantId = &v
	return s
}

func (s *PagequeryInnerOrdermsgRequest) SetOrderId(v string) *PagequeryInnerOrdermsgRequest {
	s.OrderId = &v
	return s
}

func (s *PagequeryInnerOrdermsgRequest) SetMsgPublishType(v string) *PagequeryInnerOrdermsgRequest {
	s.MsgPublishType = &v
	return s
}

func (s *PagequeryInnerOrdermsgRequest) SetMsgCreateTimeFrom(v string) *PagequeryInnerOrdermsgRequest {
	s.MsgCreateTimeFrom = &v
	return s
}

func (s *PagequeryInnerOrdermsgRequest) SetMsgCreateTimeTo(v string) *PagequeryInnerOrdermsgRequest {
	s.MsgCreateTimeTo = &v
	return s
}

func (s *PagequeryInnerOrdermsgRequest) SetEnv(v string) *PagequeryInnerOrdermsgRequest {
	s.Env = &v
	return s
}

func (s *PagequeryInnerOrdermsgRequest) SetPageInfo(v *PageQuery) *PagequeryInnerOrdermsgRequest {
	s.PageInfo = v
	return s
}

type PagequeryInnerOrdermsgResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据总量
	TotalSize *int64 `json:"total_size,omitempty" xml:"total_size,omitempty"`
	// 消息内容列表
	OrderMsgInfos []*OrderMsgInfo `json:"order_msg_infos,omitempty" xml:"order_msg_infos,omitempty" type:"Repeated"`
}

func (s PagequeryInnerOrdermsgResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerOrdermsgResponse) GoString() string {
	return s.String()
}

func (s *PagequeryInnerOrdermsgResponse) SetReqMsgId(v string) *PagequeryInnerOrdermsgResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryInnerOrdermsgResponse) SetResultCode(v string) *PagequeryInnerOrdermsgResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryInnerOrdermsgResponse) SetResultMsg(v string) *PagequeryInnerOrdermsgResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryInnerOrdermsgResponse) SetTotalSize(v int64) *PagequeryInnerOrdermsgResponse {
	s.TotalSize = &v
	return s
}

func (s *PagequeryInnerOrdermsgResponse) SetOrderMsgInfos(v []*OrderMsgInfo) *PagequeryInnerOrdermsgResponse {
	s.OrderMsgInfos = v
	return s
}

type RetryInnerOrdermsgRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// SANDBOX 沙箱 PROD 生产
	Env *string `json:"env,omitempty" xml:"env,omitempty" require:"true"`
	// 订单id
	//
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 消息ID
	//
	MsgId *string `json:"msg_id,omitempty" xml:"msg_id,omitempty" require:"true"`
	// 使用租户新回调地址
	UsingNewCallbackUrl *bool `json:"using_new_callback_url,omitempty" xml:"using_new_callback_url,omitempty" require:"true"`
}

func (s RetryInnerOrdermsgRequest) String() string {
	return tea.Prettify(s)
}

func (s RetryInnerOrdermsgRequest) GoString() string {
	return s.String()
}

func (s *RetryInnerOrdermsgRequest) SetAuthToken(v string) *RetryInnerOrdermsgRequest {
	s.AuthToken = &v
	return s
}

func (s *RetryInnerOrdermsgRequest) SetProductInstanceId(v string) *RetryInnerOrdermsgRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RetryInnerOrdermsgRequest) SetTenantId(v string) *RetryInnerOrdermsgRequest {
	s.TenantId = &v
	return s
}

func (s *RetryInnerOrdermsgRequest) SetEnv(v string) *RetryInnerOrdermsgRequest {
	s.Env = &v
	return s
}

func (s *RetryInnerOrdermsgRequest) SetOrderId(v string) *RetryInnerOrdermsgRequest {
	s.OrderId = &v
	return s
}

func (s *RetryInnerOrdermsgRequest) SetMsgId(v string) *RetryInnerOrdermsgRequest {
	s.MsgId = &v
	return s
}

func (s *RetryInnerOrdermsgRequest) SetUsingNewCallbackUrl(v bool) *RetryInnerOrdermsgRequest {
	s.UsingNewCallbackUrl = &v
	return s
}

type RetryInnerOrdermsgResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 消息重试结果
	RetryResult *string `json:"retry_result,omitempty" xml:"retry_result,omitempty"`
}

func (s RetryInnerOrdermsgResponse) String() string {
	return tea.Prettify(s)
}

func (s RetryInnerOrdermsgResponse) GoString() string {
	return s.String()
}

func (s *RetryInnerOrdermsgResponse) SetReqMsgId(v string) *RetryInnerOrdermsgResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RetryInnerOrdermsgResponse) SetResultCode(v string) *RetryInnerOrdermsgResponse {
	s.ResultCode = &v
	return s
}

func (s *RetryInnerOrdermsgResponse) SetResultMsg(v string) *RetryInnerOrdermsgResponse {
	s.ResultMsg = &v
	return s
}

func (s *RetryInnerOrdermsgResponse) SetRetryResult(v string) *RetryInnerOrdermsgResponse {
	s.RetryResult = &v
	return s
}

type QueryInnerAuthorizationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署合同的流程id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true" maxLength:"64"`
}

func (s QueryInnerAuthorizationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerAuthorizationRequest) GoString() string {
	return s.String()
}

func (s *QueryInnerAuthorizationRequest) SetAuthToken(v string) *QueryInnerAuthorizationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInnerAuthorizationRequest) SetProductInstanceId(v string) *QueryInnerAuthorizationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInnerAuthorizationRequest) SetFlowId(v string) *QueryInnerAuthorizationRequest {
	s.FlowId = &v
	return s
}

type QueryInnerAuthorizationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// true代表需要进行授权询问
	// false代表不需要进行授权询问
	IsNeedAskAuth *bool `json:"is_need_ask_auth,omitempty" xml:"is_need_ask_auth,omitempty"`
}

func (s QueryInnerAuthorizationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerAuthorizationResponse) GoString() string {
	return s.String()
}

func (s *QueryInnerAuthorizationResponse) SetReqMsgId(v string) *QueryInnerAuthorizationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInnerAuthorizationResponse) SetResultCode(v string) *QueryInnerAuthorizationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInnerAuthorizationResponse) SetResultMsg(v string) *QueryInnerAuthorizationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInnerAuthorizationResponse) SetIsNeedAskAuth(v bool) *QueryInnerAuthorizationResponse {
	s.IsNeedAskAuth = &v
	return s
}

type SignInnerAuthorizationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署合同的流程id
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true" maxLength:"64"`
	// true代表用户同意授权，
	// false代表不同意
	AuthResult *bool `json:"auth_result,omitempty" xml:"auth_result,omitempty" require:"true"`
}

func (s SignInnerAuthorizationRequest) String() string {
	return tea.Prettify(s)
}

func (s SignInnerAuthorizationRequest) GoString() string {
	return s.String()
}

func (s *SignInnerAuthorizationRequest) SetAuthToken(v string) *SignInnerAuthorizationRequest {
	s.AuthToken = &v
	return s
}

func (s *SignInnerAuthorizationRequest) SetProductInstanceId(v string) *SignInnerAuthorizationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SignInnerAuthorizationRequest) SetFlowId(v string) *SignInnerAuthorizationRequest {
	s.FlowId = &v
	return s
}

func (s *SignInnerAuthorizationRequest) SetAuthResult(v bool) *SignInnerAuthorizationRequest {
	s.AuthResult = &v
	return s
}

type SignInnerAuthorizationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SignInnerAuthorizationResponse) String() string {
	return tea.Prettify(s)
}

func (s SignInnerAuthorizationResponse) GoString() string {
	return s.String()
}

func (s *SignInnerAuthorizationResponse) SetReqMsgId(v string) *SignInnerAuthorizationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SignInnerAuthorizationResponse) SetResultCode(v string) *SignInnerAuthorizationResponse {
	s.ResultCode = &v
	return s
}

func (s *SignInnerAuthorizationResponse) SetResultMsg(v string) *SignInnerAuthorizationResponse {
	s.ResultMsg = &v
	return s
}

type QueryInnerSupplementalRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true" maxLength:"64"`
}

func (s QueryInnerSupplementalRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerSupplementalRequest) GoString() string {
	return s.String()
}

func (s *QueryInnerSupplementalRequest) SetAuthToken(v string) *QueryInnerSupplementalRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInnerSupplementalRequest) SetProductInstanceId(v string) *QueryInnerSupplementalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInnerSupplementalRequest) SetTenantId(v string) *QueryInnerSupplementalRequest {
	s.TenantId = &v
	return s
}

type QueryInnerSupplementalResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// true代表需要进行授权询问
	// false代表不需要进行授权询问
	IsNeedAskAuth *bool `json:"is_need_ask_auth,omitempty" xml:"is_need_ask_auth,omitempty"`
}

func (s QueryInnerSupplementalResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerSupplementalResponse) GoString() string {
	return s.String()
}

func (s *QueryInnerSupplementalResponse) SetReqMsgId(v string) *QueryInnerSupplementalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInnerSupplementalResponse) SetResultCode(v string) *QueryInnerSupplementalResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInnerSupplementalResponse) SetResultMsg(v string) *QueryInnerSupplementalResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInnerSupplementalResponse) SetIsNeedAskAuth(v bool) *QueryInnerSupplementalResponse {
	s.IsNeedAskAuth = &v
	return s
}

type SignInnerSupplementalRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true" maxLength:"64"`
	// 同意接受用户补充接口，目前取值只能为true
	AuthResult *bool `json:"auth_result,omitempty" xml:"auth_result,omitempty" require:"true"`
}

func (s SignInnerSupplementalRequest) String() string {
	return tea.Prettify(s)
}

func (s SignInnerSupplementalRequest) GoString() string {
	return s.String()
}

func (s *SignInnerSupplementalRequest) SetAuthToken(v string) *SignInnerSupplementalRequest {
	s.AuthToken = &v
	return s
}

func (s *SignInnerSupplementalRequest) SetProductInstanceId(v string) *SignInnerSupplementalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SignInnerSupplementalRequest) SetTenantId(v string) *SignInnerSupplementalRequest {
	s.TenantId = &v
	return s
}

func (s *SignInnerSupplementalRequest) SetAuthResult(v bool) *SignInnerSupplementalRequest {
	s.AuthResult = &v
	return s
}

type SignInnerSupplementalResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SignInnerSupplementalResponse) String() string {
	return tea.Prettify(s)
}

func (s SignInnerSupplementalResponse) GoString() string {
	return s.String()
}

func (s *SignInnerSupplementalResponse) SetReqMsgId(v string) *SignInnerSupplementalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SignInnerSupplementalResponse) SetResultCode(v string) *SignInnerSupplementalResponse {
	s.ResultCode = &v
	return s
}

func (s *SignInnerSupplementalResponse) SetResultMsg(v string) *SignInnerSupplementalResponse {
	s.ResultMsg = &v
	return s
}

type QueryInnerWithholdplanRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户租户id
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"64"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
}

func (s QueryInnerWithholdplanRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerWithholdplanRequest) GoString() string {
	return s.String()
}

func (s *QueryInnerWithholdplanRequest) SetAuthToken(v string) *QueryInnerWithholdplanRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInnerWithholdplanRequest) SetProductInstanceId(v string) *QueryInnerWithholdplanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInnerWithholdplanRequest) SetMerchantTenantId(v string) *QueryInnerWithholdplanRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *QueryInnerWithholdplanRequest) SetOrderId(v string) *QueryInnerWithholdplanRequest {
	s.OrderId = &v
	return s
}

type QueryInnerWithholdplanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总金额，单位为分
	TotalMoney *int64 `json:"total_money,omitempty" xml:"total_money,omitempty"`
	// 总期数
	TotalTerm *int64 `json:"total_term,omitempty" xml:"total_term,omitempty"`
	// 用户履约信息列表
	PayInfo []*UserPerformanceInfo `json:"pay_info,omitempty" xml:"pay_info,omitempty" type:"Repeated"`
}

func (s QueryInnerWithholdplanResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerWithholdplanResponse) GoString() string {
	return s.String()
}

func (s *QueryInnerWithholdplanResponse) SetReqMsgId(v string) *QueryInnerWithholdplanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInnerWithholdplanResponse) SetResultCode(v string) *QueryInnerWithholdplanResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInnerWithholdplanResponse) SetResultMsg(v string) *QueryInnerWithholdplanResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInnerWithholdplanResponse) SetTotalMoney(v int64) *QueryInnerWithholdplanResponse {
	s.TotalMoney = &v
	return s
}

func (s *QueryInnerWithholdplanResponse) SetTotalTerm(v int64) *QueryInnerWithholdplanResponse {
	s.TotalTerm = &v
	return s
}

func (s *QueryInnerWithholdplanResponse) SetPayInfo(v []*UserPerformanceInfo) *QueryInnerWithholdplanResponse {
	s.PayInfo = v
	return s
}

type CreateInnerWithholdsignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户租户id
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"64"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
	// 用户支付宝2088uid
	AlipayUserId *string `json:"alipay_user_id,omitempty" xml:"alipay_user_id,omitempty" maxLength:"64"`
}

func (s CreateInnerWithholdsignRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateInnerWithholdsignRequest) GoString() string {
	return s.String()
}

func (s *CreateInnerWithholdsignRequest) SetAuthToken(v string) *CreateInnerWithholdsignRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateInnerWithholdsignRequest) SetProductInstanceId(v string) *CreateInnerWithholdsignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateInnerWithholdsignRequest) SetMerchantTenantId(v string) *CreateInnerWithholdsignRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *CreateInnerWithholdsignRequest) SetOrderId(v string) *CreateInnerWithholdsignRequest {
	s.OrderId = &v
	return s
}

func (s *CreateInnerWithholdsignRequest) SetAlipayUserId(v string) *CreateInnerWithholdsignRequest {
	s.AlipayUserId = &v
	return s
}

type CreateInnerWithholdsignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 代扣签约串
	SignStr *string `json:"sign_str,omitempty" xml:"sign_str,omitempty"`
}

func (s CreateInnerWithholdsignResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateInnerWithholdsignResponse) GoString() string {
	return s.String()
}

func (s *CreateInnerWithholdsignResponse) SetReqMsgId(v string) *CreateInnerWithholdsignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateInnerWithholdsignResponse) SetResultCode(v string) *CreateInnerWithholdsignResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateInnerWithholdsignResponse) SetResultMsg(v string) *CreateInnerWithholdsignResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateInnerWithholdsignResponse) SetSignStr(v string) *CreateInnerWithholdsignResponse {
	s.SignStr = &v
	return s
}

type QueryInnerWithholdsignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户租户id
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"64"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
}

func (s QueryInnerWithholdsignRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerWithholdsignRequest) GoString() string {
	return s.String()
}

func (s *QueryInnerWithholdsignRequest) SetAuthToken(v string) *QueryInnerWithholdsignRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInnerWithholdsignRequest) SetProductInstanceId(v string) *QueryInnerWithholdsignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInnerWithholdsignRequest) SetMerchantTenantId(v string) *QueryInnerWithholdsignRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *QueryInnerWithholdsignRequest) SetOrderId(v string) *QueryInnerWithholdsignRequest {
	s.OrderId = &v
	return s
}

type QueryInnerWithholdsignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 协议当前状态
	// 1. UNSIGNED：未签约
	// 2. SIGNED：已签约；
	// 3.APPLY_TERMINATE:申请解约
	// 4. TERMINATED：已解约
	// 5.TIMEOUT_CLOSE:超时关闭
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 支付宝代扣协议号
	AgreementNo *string `json:"agreement_no,omitempty" xml:"agreement_no,omitempty"`
	// 协议签署时间
	// yyyy-MM-dd HH:mm:ss 格式
	SignTime *string `json:"sign_time,omitempty" xml:"sign_time,omitempty"`
	// 协议生效时间
	// yyyy-MM-dd HH:mm:ss 格式
	ValidTime *string `json:"valid_time,omitempty" xml:"valid_time,omitempty"`
	// 协议失效时间
	// yyyy-MM-dd HH:mm:ss 格式
	InvalidTime *string `json:"invalid_time,omitempty" xml:"invalid_time,omitempty"`
}

func (s QueryInnerWithholdsignResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerWithholdsignResponse) GoString() string {
	return s.String()
}

func (s *QueryInnerWithholdsignResponse) SetReqMsgId(v string) *QueryInnerWithholdsignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInnerWithholdsignResponse) SetResultCode(v string) *QueryInnerWithholdsignResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInnerWithholdsignResponse) SetResultMsg(v string) *QueryInnerWithholdsignResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInnerWithholdsignResponse) SetStatus(v string) *QueryInnerWithholdsignResponse {
	s.Status = &v
	return s
}

func (s *QueryInnerWithholdsignResponse) SetAgreementNo(v string) *QueryInnerWithholdsignResponse {
	s.AgreementNo = &v
	return s
}

func (s *QueryInnerWithholdsignResponse) SetSignTime(v string) *QueryInnerWithholdsignResponse {
	s.SignTime = &v
	return s
}

func (s *QueryInnerWithholdsignResponse) SetValidTime(v string) *QueryInnerWithholdsignResponse {
	s.ValidTime = &v
	return s
}

func (s *QueryInnerWithholdsignResponse) SetInvalidTime(v string) *QueryInnerWithholdsignResponse {
	s.InvalidTime = &v
	return s
}

type GetInnerMerchantstaticdataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
}

func (s GetInnerMerchantstaticdataRequest) String() string {
	return tea.Prettify(s)
}

func (s GetInnerMerchantstaticdataRequest) GoString() string {
	return s.String()
}

func (s *GetInnerMerchantstaticdataRequest) SetAuthToken(v string) *GetInnerMerchantstaticdataRequest {
	s.AuthToken = &v
	return s
}

func (s *GetInnerMerchantstaticdataRequest) SetProductInstanceId(v string) *GetInnerMerchantstaticdataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetInnerMerchantstaticdataRequest) SetTenantId(v string) *GetInnerMerchantstaticdataRequest {
	s.TenantId = &v
	return s
}

type GetInnerMerchantstaticdataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商户入驻静态数据
	StaticDataList []*StaticData `json:"static_data_list,omitempty" xml:"static_data_list,omitempty" type:"Repeated"`
}

func (s GetInnerMerchantstaticdataResponse) String() string {
	return tea.Prettify(s)
}

func (s GetInnerMerchantstaticdataResponse) GoString() string {
	return s.String()
}

func (s *GetInnerMerchantstaticdataResponse) SetReqMsgId(v string) *GetInnerMerchantstaticdataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetInnerMerchantstaticdataResponse) SetResultCode(v string) *GetInnerMerchantstaticdataResponse {
	s.ResultCode = &v
	return s
}

func (s *GetInnerMerchantstaticdataResponse) SetResultMsg(v string) *GetInnerMerchantstaticdataResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetInnerMerchantstaticdataResponse) SetStaticDataList(v []*StaticData) *GetInnerMerchantstaticdataResponse {
	s.StaticDataList = v
	return s
}

type GetInnerFunddividemerchantRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
}

func (s GetInnerFunddividemerchantRequest) String() string {
	return tea.Prettify(s)
}

func (s GetInnerFunddividemerchantRequest) GoString() string {
	return s.String()
}

func (s *GetInnerFunddividemerchantRequest) SetAuthToken(v string) *GetInnerFunddividemerchantRequest {
	s.AuthToken = &v
	return s
}

func (s *GetInnerFunddividemerchantRequest) SetProductInstanceId(v string) *GetInnerFunddividemerchantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetInnerFunddividemerchantRequest) SetTenantId(v string) *GetInnerFunddividemerchantRequest {
	s.TenantId = &v
	return s
}

type GetInnerFunddividemerchantResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分账方公司名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty"`
	// 分账方公司统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
}

func (s GetInnerFunddividemerchantResponse) String() string {
	return tea.Prettify(s)
}

func (s GetInnerFunddividemerchantResponse) GoString() string {
	return s.String()
}

func (s *GetInnerFunddividemerchantResponse) SetReqMsgId(v string) *GetInnerFunddividemerchantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetInnerFunddividemerchantResponse) SetResultCode(v string) *GetInnerFunddividemerchantResponse {
	s.ResultCode = &v
	return s
}

func (s *GetInnerFunddividemerchantResponse) SetResultMsg(v string) *GetInnerFunddividemerchantResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetInnerFunddividemerchantResponse) SetCompanyName(v string) *GetInnerFunddividemerchantResponse {
	s.CompanyName = &v
	return s
}

func (s *GetInnerFunddividemerchantResponse) SetMerchantId(v string) *GetInnerFunddividemerchantResponse {
	s.MerchantId = &v
	return s
}

type QueryInnerInsuresignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户租户id
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true"`
	// 保司社会统一信用代码
	InsureMerchantId *string `json:"insure_merchant_id,omitempty" xml:"insure_merchant_id,omitempty" require:"true"`
}

func (s QueryInnerInsuresignRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerInsuresignRequest) GoString() string {
	return s.String()
}

func (s *QueryInnerInsuresignRequest) SetAuthToken(v string) *QueryInnerInsuresignRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInnerInsuresignRequest) SetProductInstanceId(v string) *QueryInnerInsuresignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInnerInsuresignRequest) SetMerchantTenantId(v string) *QueryInnerInsuresignRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *QueryInnerInsuresignRequest) SetInsureMerchantId(v string) *QueryInnerInsuresignRequest {
	s.InsureMerchantId = &v
	return s
}

type QueryInnerInsuresignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商户社会统一信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// 保司社会统一信用代码
	InsureMerchantId *string `json:"insure_merchant_id,omitempty" xml:"insure_merchant_id,omitempty"`
	// 外部代扣协议号
	ExternalAgreementNo *string `json:"external_agreement_no,omitempty" xml:"external_agreement_no,omitempty"`
	// 合同未签署：CONTRACT_UN_SIGNED
	// 合同已签署：CONTRACT_SIGNED
	// 代扣已签署：WITHHOLD_SIGNED
	// 代扣已解约：WITHHOLD_UN_SIGNED
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s QueryInnerInsuresignResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerInsuresignResponse) GoString() string {
	return s.String()
}

func (s *QueryInnerInsuresignResponse) SetReqMsgId(v string) *QueryInnerInsuresignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInnerInsuresignResponse) SetResultCode(v string) *QueryInnerInsuresignResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInnerInsuresignResponse) SetResultMsg(v string) *QueryInnerInsuresignResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInnerInsuresignResponse) SetMerchantId(v string) *QueryInnerInsuresignResponse {
	s.MerchantId = &v
	return s
}

func (s *QueryInnerInsuresignResponse) SetInsureMerchantId(v string) *QueryInnerInsuresignResponse {
	s.InsureMerchantId = &v
	return s
}

func (s *QueryInnerInsuresignResponse) SetExternalAgreementNo(v string) *QueryInnerInsuresignResponse {
	s.ExternalAgreementNo = &v
	return s
}

func (s *QueryInnerInsuresignResponse) SetStatus(v string) *QueryInnerInsuresignResponse {
	s.Status = &v
	return s
}

type CreateInnerInsuresignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户租户id
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true"`
	// 外部代扣协议号
	ExternalAgreementNo *string `json:"external_agreement_no,omitempty" xml:"external_agreement_no,omitempty" require:"true"`
}

func (s CreateInnerInsuresignRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateInnerInsuresignRequest) GoString() string {
	return s.String()
}

func (s *CreateInnerInsuresignRequest) SetAuthToken(v string) *CreateInnerInsuresignRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateInnerInsuresignRequest) SetProductInstanceId(v string) *CreateInnerInsuresignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateInnerInsuresignRequest) SetMerchantTenantId(v string) *CreateInnerInsuresignRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *CreateInnerInsuresignRequest) SetExternalAgreementNo(v string) *CreateInnerInsuresignRequest {
	s.ExternalAgreementNo = &v
	return s
}

type CreateInnerInsuresignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签约链接
	SignStr *string `json:"sign_str,omitempty" xml:"sign_str,omitempty"`
}

func (s CreateInnerInsuresignResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateInnerInsuresignResponse) GoString() string {
	return s.String()
}

func (s *CreateInnerInsuresignResponse) SetReqMsgId(v string) *CreateInnerInsuresignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateInnerInsuresignResponse) SetResultCode(v string) *CreateInnerInsuresignResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateInnerInsuresignResponse) SetResultMsg(v string) *CreateInnerInsuresignResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateInnerInsuresignResponse) SetSignStr(v string) *CreateInnerInsuresignResponse {
	s.SignStr = &v
	return s
}

type PagequeryInnerInsureorderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	// (商家后台接口特有)
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 商家订单ID
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 分页查询对象
	PageInfo *PageQuery `json:"page_info,omitempty" xml:"page_info,omitempty" require:"true"`
	// 保司信息merchant_id
	InsureMerchantId *string `json:"insure_merchant_id,omitempty" xml:"insure_merchant_id,omitempty" require:"true"`
	// 投保状态枚举
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s PagequeryInnerInsureorderRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerInsureorderRequest) GoString() string {
	return s.String()
}

func (s *PagequeryInnerInsureorderRequest) SetAuthToken(v string) *PagequeryInnerInsureorderRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryInnerInsureorderRequest) SetProductInstanceId(v string) *PagequeryInnerInsureorderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryInnerInsureorderRequest) SetTenantId(v string) *PagequeryInnerInsureorderRequest {
	s.TenantId = &v
	return s
}

func (s *PagequeryInnerInsureorderRequest) SetOrderId(v string) *PagequeryInnerInsureorderRequest {
	s.OrderId = &v
	return s
}

func (s *PagequeryInnerInsureorderRequest) SetPageInfo(v *PageQuery) *PagequeryInnerInsureorderRequest {
	s.PageInfo = v
	return s
}

func (s *PagequeryInnerInsureorderRequest) SetInsureMerchantId(v string) *PagequeryInnerInsureorderRequest {
	s.InsureMerchantId = &v
	return s
}

func (s *PagequeryInnerInsureorderRequest) SetStatus(v string) *PagequeryInnerInsureorderRequest {
	s.Status = &v
	return s
}

type PagequeryInnerInsureorderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据总量
	TotalSize *int64 `json:"total_size,omitempty" xml:"total_size,omitempty"`
	// 保单信息
	InusreOrderInfos []*InsureOrderInfo `json:"inusre_order_infos,omitempty" xml:"inusre_order_infos,omitempty" type:"Repeated"`
}

func (s PagequeryInnerInsureorderResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerInsureorderResponse) GoString() string {
	return s.String()
}

func (s *PagequeryInnerInsureorderResponse) SetReqMsgId(v string) *PagequeryInnerInsureorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryInnerInsureorderResponse) SetResultCode(v string) *PagequeryInnerInsureorderResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryInnerInsureorderResponse) SetResultMsg(v string) *PagequeryInnerInsureorderResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryInnerInsureorderResponse) SetTotalSize(v int64) *PagequeryInnerInsureorderResponse {
	s.TotalSize = &v
	return s
}

func (s *PagequeryInnerInsureorderResponse) SetInusreOrderInfos(v []*InsureOrderInfo) *PagequeryInnerInsureorderResponse {
	s.InusreOrderInfos = v
	return s
}

type PagequeryInnerProductRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 商品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty"`
	// 商品id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
	// 一级类目
	MainClass *string `json:"main_class,omitempty" xml:"main_class,omitempty"`
	// 二级类目
	SubClass *string `json:"sub_class,omitempty" xml:"sub_class,omitempty"`
	// 品牌
	ProductBrand *string `json:"product_brand,omitempty" xml:"product_brand,omitempty"`
	// 分页
	PageInfo *PageQuery `json:"page_info,omitempty" xml:"page_info,omitempty" require:"true"`
}

func (s PagequeryInnerProductRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerProductRequest) GoString() string {
	return s.String()
}

func (s *PagequeryInnerProductRequest) SetAuthToken(v string) *PagequeryInnerProductRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryInnerProductRequest) SetProductInstanceId(v string) *PagequeryInnerProductRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryInnerProductRequest) SetTenantId(v string) *PagequeryInnerProductRequest {
	s.TenantId = &v
	return s
}

func (s *PagequeryInnerProductRequest) SetProductName(v string) *PagequeryInnerProductRequest {
	s.ProductName = &v
	return s
}

func (s *PagequeryInnerProductRequest) SetProductId(v string) *PagequeryInnerProductRequest {
	s.ProductId = &v
	return s
}

func (s *PagequeryInnerProductRequest) SetMainClass(v string) *PagequeryInnerProductRequest {
	s.MainClass = &v
	return s
}

func (s *PagequeryInnerProductRequest) SetSubClass(v string) *PagequeryInnerProductRequest {
	s.SubClass = &v
	return s
}

func (s *PagequeryInnerProductRequest) SetProductBrand(v string) *PagequeryInnerProductRequest {
	s.ProductBrand = &v
	return s
}

func (s *PagequeryInnerProductRequest) SetPageInfo(v *PageQuery) *PagequeryInnerProductRequest {
	s.PageInfo = v
	return s
}

type PagequeryInnerProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总量
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 商品列表
	ProductInfoList []*ProductInfo `json:"product_info_list,omitempty" xml:"product_info_list,omitempty" type:"Repeated"`
}

func (s PagequeryInnerProductResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerProductResponse) GoString() string {
	return s.String()
}

func (s *PagequeryInnerProductResponse) SetReqMsgId(v string) *PagequeryInnerProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryInnerProductResponse) SetResultCode(v string) *PagequeryInnerProductResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryInnerProductResponse) SetResultMsg(v string) *PagequeryInnerProductResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryInnerProductResponse) SetTotal(v int64) *PagequeryInnerProductResponse {
	s.Total = &v
	return s
}

func (s *PagequeryInnerProductResponse) SetProductInfoList(v []*ProductInfo) *PagequeryInnerProductResponse {
	s.ProductInfoList = v
	return s
}

type GetInnerHomepagenoticeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
}

func (s GetInnerHomepagenoticeRequest) String() string {
	return tea.Prettify(s)
}

func (s GetInnerHomepagenoticeRequest) GoString() string {
	return s.String()
}

func (s *GetInnerHomepagenoticeRequest) SetAuthToken(v string) *GetInnerHomepagenoticeRequest {
	s.AuthToken = &v
	return s
}

func (s *GetInnerHomepagenoticeRequest) SetProductInstanceId(v string) *GetInnerHomepagenoticeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetInnerHomepagenoticeRequest) SetTenantId(v string) *GetInnerHomepagenoticeRequest {
	s.TenantId = &v
	return s
}

type GetInnerHomepagenoticeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 通知id
	NoticeId *int64 `json:"notice_id,omitempty" xml:"notice_id,omitempty"`
	// 通知标题
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// 未读数量
	UnreadCount *int64 `json:"unread_count,omitempty" xml:"unread_count,omitempty"`
	// 是否未读
	Unread *bool `json:"unread,omitempty" xml:"unread,omitempty"`
}

func (s GetInnerHomepagenoticeResponse) String() string {
	return tea.Prettify(s)
}

func (s GetInnerHomepagenoticeResponse) GoString() string {
	return s.String()
}

func (s *GetInnerHomepagenoticeResponse) SetReqMsgId(v string) *GetInnerHomepagenoticeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetInnerHomepagenoticeResponse) SetResultCode(v string) *GetInnerHomepagenoticeResponse {
	s.ResultCode = &v
	return s
}

func (s *GetInnerHomepagenoticeResponse) SetResultMsg(v string) *GetInnerHomepagenoticeResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetInnerHomepagenoticeResponse) SetNoticeId(v int64) *GetInnerHomepagenoticeResponse {
	s.NoticeId = &v
	return s
}

func (s *GetInnerHomepagenoticeResponse) SetTitle(v string) *GetInnerHomepagenoticeResponse {
	s.Title = &v
	return s
}

func (s *GetInnerHomepagenoticeResponse) SetUnreadCount(v int64) *GetInnerHomepagenoticeResponse {
	s.UnreadCount = &v
	return s
}

func (s *GetInnerHomepagenoticeResponse) SetUnread(v bool) *GetInnerHomepagenoticeResponse {
	s.Unread = &v
	return s
}

type PagequeryInnerNoticeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 分页
	PageInfo *PageQuery `json:"page_info,omitempty" xml:"page_info,omitempty" require:"true"`
	// 是否未读
	Unread *bool `json:"unread,omitempty" xml:"unread,omitempty"`
}

func (s PagequeryInnerNoticeRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerNoticeRequest) GoString() string {
	return s.String()
}

func (s *PagequeryInnerNoticeRequest) SetAuthToken(v string) *PagequeryInnerNoticeRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryInnerNoticeRequest) SetProductInstanceId(v string) *PagequeryInnerNoticeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryInnerNoticeRequest) SetTenantId(v string) *PagequeryInnerNoticeRequest {
	s.TenantId = &v
	return s
}

func (s *PagequeryInnerNoticeRequest) SetPageInfo(v *PageQuery) *PagequeryInnerNoticeRequest {
	s.PageInfo = v
	return s
}

func (s *PagequeryInnerNoticeRequest) SetUnread(v bool) *PagequeryInnerNoticeRequest {
	s.Unread = &v
	return s
}

type PagequeryInnerNoticeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总量
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 商户通知信息
	NoticeInfoList []*NoticeInfo `json:"notice_info_list,omitempty" xml:"notice_info_list,omitempty" type:"Repeated"`
}

func (s PagequeryInnerNoticeResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerNoticeResponse) GoString() string {
	return s.String()
}

func (s *PagequeryInnerNoticeResponse) SetReqMsgId(v string) *PagequeryInnerNoticeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryInnerNoticeResponse) SetResultCode(v string) *PagequeryInnerNoticeResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryInnerNoticeResponse) SetResultMsg(v string) *PagequeryInnerNoticeResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryInnerNoticeResponse) SetTotal(v int64) *PagequeryInnerNoticeResponse {
	s.Total = &v
	return s
}

func (s *PagequeryInnerNoticeResponse) SetNoticeInfoList(v []*NoticeInfo) *PagequeryInnerNoticeResponse {
	s.NoticeInfoList = v
	return s
}

type DetailInnerNoticeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 通知id
	NoticeId *int64 `json:"notice_id,omitempty" xml:"notice_id,omitempty" require:"true"`
	// 是否未读
	Unread *bool `json:"unread,omitempty" xml:"unread,omitempty" require:"true"`
}

func (s DetailInnerNoticeRequest) String() string {
	return tea.Prettify(s)
}

func (s DetailInnerNoticeRequest) GoString() string {
	return s.String()
}

func (s *DetailInnerNoticeRequest) SetAuthToken(v string) *DetailInnerNoticeRequest {
	s.AuthToken = &v
	return s
}

func (s *DetailInnerNoticeRequest) SetProductInstanceId(v string) *DetailInnerNoticeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DetailInnerNoticeRequest) SetTenantId(v string) *DetailInnerNoticeRequest {
	s.TenantId = &v
	return s
}

func (s *DetailInnerNoticeRequest) SetNoticeId(v int64) *DetailInnerNoticeRequest {
	s.NoticeId = &v
	return s
}

func (s *DetailInnerNoticeRequest) SetUnread(v bool) *DetailInnerNoticeRequest {
	s.Unread = &v
	return s
}

type DetailInnerNoticeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 通知标题
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// 通知内容
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 通知创建时间
	NoticeCreateTime *string `json:"notice_create_time,omitempty" xml:"notice_create_time,omitempty"`
}

func (s DetailInnerNoticeResponse) String() string {
	return tea.Prettify(s)
}

func (s DetailInnerNoticeResponse) GoString() string {
	return s.String()
}

func (s *DetailInnerNoticeResponse) SetReqMsgId(v string) *DetailInnerNoticeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DetailInnerNoticeResponse) SetResultCode(v string) *DetailInnerNoticeResponse {
	s.ResultCode = &v
	return s
}

func (s *DetailInnerNoticeResponse) SetResultMsg(v string) *DetailInnerNoticeResponse {
	s.ResultMsg = &v
	return s
}

func (s *DetailInnerNoticeResponse) SetTitle(v string) *DetailInnerNoticeResponse {
	s.Title = &v
	return s
}

func (s *DetailInnerNoticeResponse) SetContent(v string) *DetailInnerNoticeResponse {
	s.Content = &v
	return s
}

func (s *DetailInnerNoticeResponse) SetNoticeCreateTime(v string) *DetailInnerNoticeResponse {
	s.NoticeCreateTime = &v
	return s
}

type PagequeryInnerOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 支付宝代扣协议号
	AgreementNo *string `json:"agreement_no,omitempty" xml:"agreement_no,omitempty"`
	// 订单创建时间开始
	OrderCreateTimeStart *string `json:"order_create_time_start,omitempty" xml:"order_create_time_start,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 订单创建时间结束
	OrderCreateTimeEnd *string `json:"order_create_time_end,omitempty" xml:"order_create_time_end,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 订单状态
	OrderStatus *string `json:"order_status,omitempty" xml:"order_status,omitempty"`
	// 分页
	PageInfo *PageQuery `json:"page_info,omitempty" xml:"page_info,omitempty" require:"true"`
}

func (s PagequeryInnerOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerOrderRequest) GoString() string {
	return s.String()
}

func (s *PagequeryInnerOrderRequest) SetAuthToken(v string) *PagequeryInnerOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryInnerOrderRequest) SetProductInstanceId(v string) *PagequeryInnerOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryInnerOrderRequest) SetTenantId(v string) *PagequeryInnerOrderRequest {
	s.TenantId = &v
	return s
}

func (s *PagequeryInnerOrderRequest) SetOrderId(v string) *PagequeryInnerOrderRequest {
	s.OrderId = &v
	return s
}

func (s *PagequeryInnerOrderRequest) SetAgreementNo(v string) *PagequeryInnerOrderRequest {
	s.AgreementNo = &v
	return s
}

func (s *PagequeryInnerOrderRequest) SetOrderCreateTimeStart(v string) *PagequeryInnerOrderRequest {
	s.OrderCreateTimeStart = &v
	return s
}

func (s *PagequeryInnerOrderRequest) SetOrderCreateTimeEnd(v string) *PagequeryInnerOrderRequest {
	s.OrderCreateTimeEnd = &v
	return s
}

func (s *PagequeryInnerOrderRequest) SetOrderStatus(v string) *PagequeryInnerOrderRequest {
	s.OrderStatus = &v
	return s
}

func (s *PagequeryInnerOrderRequest) SetPageInfo(v *PageQuery) *PagequeryInnerOrderRequest {
	s.PageInfo = v
	return s
}

type PagequeryInnerOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单列表信息
	OrderInfoList []*OrderSearchInfo `json:"order_info_list,omitempty" xml:"order_info_list,omitempty" type:"Repeated"`
	// 总量
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s PagequeryInnerOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerOrderResponse) GoString() string {
	return s.String()
}

func (s *PagequeryInnerOrderResponse) SetReqMsgId(v string) *PagequeryInnerOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryInnerOrderResponse) SetResultCode(v string) *PagequeryInnerOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryInnerOrderResponse) SetResultMsg(v string) *PagequeryInnerOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryInnerOrderResponse) SetOrderInfoList(v []*OrderSearchInfo) *PagequeryInnerOrderResponse {
	s.OrderInfoList = v
	return s
}

func (s *PagequeryInnerOrderResponse) SetTotal(v int64) *PagequeryInnerOrderResponse {
	s.Total = &v
	return s
}

type DetailInnerOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s DetailInnerOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s DetailInnerOrderRequest) GoString() string {
	return s.String()
}

func (s *DetailInnerOrderRequest) SetAuthToken(v string) *DetailInnerOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *DetailInnerOrderRequest) SetProductInstanceId(v string) *DetailInnerOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DetailInnerOrderRequest) SetTenantId(v string) *DetailInnerOrderRequest {
	s.TenantId = &v
	return s
}

func (s *DetailInnerOrderRequest) SetOrderId(v string) *DetailInnerOrderRequest {
	s.OrderId = &v
	return s
}

type DetailInnerOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 支付宝代扣协议号
	AgreementNo *string `json:"agreement_no,omitempty" xml:"agreement_no,omitempty"`
	// 商品总数量
	ProductTotalCount *int64 `json:"product_total_count,omitempty" xml:"product_total_count,omitempty"`
	// 订单基础信息
	OrderInfo *OrderInfo `json:"order_info,omitempty" xml:"order_info,omitempty"`
	// 用户信息
	OrderUserInfo *OrderUserInfo `json:"order_user_info,omitempty" xml:"order_user_info,omitempty"`
	// 订单履约
	OrderFulfillmentInfoList []*OrderFulfillmentInfo `json:"order_fulfillment_info_list,omitempty" xml:"order_fulfillment_info_list,omitempty" type:"Repeated"`
	// 订单还款承诺
	OrderPromiseInfo *OrderPromiseInfo `json:"order_promise_info,omitempty" xml:"order_promise_info,omitempty"`
	// 订单商品信息
	OrderProductInfoList []*OrderProductInfo `json:"order_product_info_list,omitempty" xml:"order_product_info_list,omitempty" type:"Repeated"`
	// 经营分账信息
	OperateDivideInfoList []*OperateDivideInfo `json:"operate_divide_info_list,omitempty" xml:"operate_divide_info_list,omitempty" type:"Repeated"`
}

func (s DetailInnerOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s DetailInnerOrderResponse) GoString() string {
	return s.String()
}

func (s *DetailInnerOrderResponse) SetReqMsgId(v string) *DetailInnerOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DetailInnerOrderResponse) SetResultCode(v string) *DetailInnerOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *DetailInnerOrderResponse) SetResultMsg(v string) *DetailInnerOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *DetailInnerOrderResponse) SetOrderId(v string) *DetailInnerOrderResponse {
	s.OrderId = &v
	return s
}

func (s *DetailInnerOrderResponse) SetAgreementNo(v string) *DetailInnerOrderResponse {
	s.AgreementNo = &v
	return s
}

func (s *DetailInnerOrderResponse) SetProductTotalCount(v int64) *DetailInnerOrderResponse {
	s.ProductTotalCount = &v
	return s
}

func (s *DetailInnerOrderResponse) SetOrderInfo(v *OrderInfo) *DetailInnerOrderResponse {
	s.OrderInfo = v
	return s
}

func (s *DetailInnerOrderResponse) SetOrderUserInfo(v *OrderUserInfo) *DetailInnerOrderResponse {
	s.OrderUserInfo = v
	return s
}

func (s *DetailInnerOrderResponse) SetOrderFulfillmentInfoList(v []*OrderFulfillmentInfo) *DetailInnerOrderResponse {
	s.OrderFulfillmentInfoList = v
	return s
}

func (s *DetailInnerOrderResponse) SetOrderPromiseInfo(v *OrderPromiseInfo) *DetailInnerOrderResponse {
	s.OrderPromiseInfo = v
	return s
}

func (s *DetailInnerOrderResponse) SetOrderProductInfoList(v []*OrderProductInfo) *DetailInnerOrderResponse {
	s.OrderProductInfoList = v
	return s
}

func (s *DetailInnerOrderResponse) SetOperateDivideInfoList(v []*OperateDivideInfo) *DetailInnerOrderResponse {
	s.OperateDivideInfoList = v
	return s
}

type RenderInnerTemplateinstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 模板编码集，数组
	TemplateCodes []*string `json:"template_codes,omitempty" xml:"template_codes,omitempty" require:"true" type:"Repeated"`
	// 幂等值
	Idempotent *string `json:"idempotent,omitempty" xml:"idempotent,omitempty" require:"true"`
	// 业务方id，唯一
	BizBusinessId *string `json:"biz_business_id,omitempty" xml:"biz_business_id,omitempty" require:"true"`
	// 组件（文本域）的实际值
	ComponentInstDtos []*TemplateComponent `json:"component_inst_dtos,omitempty" xml:"component_inst_dtos,omitempty" require:"true" type:"Repeated"`
}

func (s RenderInnerTemplateinstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s RenderInnerTemplateinstanceRequest) GoString() string {
	return s.String()
}

func (s *RenderInnerTemplateinstanceRequest) SetAuthToken(v string) *RenderInnerTemplateinstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *RenderInnerTemplateinstanceRequest) SetProductInstanceId(v string) *RenderInnerTemplateinstanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RenderInnerTemplateinstanceRequest) SetTenantId(v string) *RenderInnerTemplateinstanceRequest {
	s.TenantId = &v
	return s
}

func (s *RenderInnerTemplateinstanceRequest) SetTemplateCodes(v []*string) *RenderInnerTemplateinstanceRequest {
	s.TemplateCodes = v
	return s
}

func (s *RenderInnerTemplateinstanceRequest) SetIdempotent(v string) *RenderInnerTemplateinstanceRequest {
	s.Idempotent = &v
	return s
}

func (s *RenderInnerTemplateinstanceRequest) SetBizBusinessId(v string) *RenderInnerTemplateinstanceRequest {
	s.BizBusinessId = &v
	return s
}

func (s *RenderInnerTemplateinstanceRequest) SetComponentInstDtos(v []*TemplateComponent) *RenderInnerTemplateinstanceRequest {
	s.ComponentInstDtos = v
	return s
}

type RenderInnerTemplateinstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实例化成功时返回唯一业务id
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
}

func (s RenderInnerTemplateinstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s RenderInnerTemplateinstanceResponse) GoString() string {
	return s.String()
}

func (s *RenderInnerTemplateinstanceResponse) SetReqMsgId(v string) *RenderInnerTemplateinstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RenderInnerTemplateinstanceResponse) SetResultCode(v string) *RenderInnerTemplateinstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *RenderInnerTemplateinstanceResponse) SetResultMsg(v string) *RenderInnerTemplateinstanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *RenderInnerTemplateinstanceResponse) SetBusinessId(v string) *RenderInnerTemplateinstanceResponse {
	s.BusinessId = &v
	return s
}

type BatchqueryInnerMarketingscoreRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 营销分查询对象
	MarketingScoreQueryInfos []*MarketingScoreQueryInfo `json:"marketing_score_query_infos,omitempty" xml:"marketing_score_query_infos,omitempty" require:"true" type:"Repeated"`
}

func (s BatchqueryInnerMarketingscoreRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryInnerMarketingscoreRequest) GoString() string {
	return s.String()
}

func (s *BatchqueryInnerMarketingscoreRequest) SetAuthToken(v string) *BatchqueryInnerMarketingscoreRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchqueryInnerMarketingscoreRequest) SetProductInstanceId(v string) *BatchqueryInnerMarketingscoreRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchqueryInnerMarketingscoreRequest) SetMarketingScoreQueryInfos(v []*MarketingScoreQueryInfo) *BatchqueryInnerMarketingscoreRequest {
	s.MarketingScoreQueryInfos = v
	return s
}

type BatchqueryInnerMarketingscoreResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 营销分返回对象
	MarketingScoreInfo []*MarketingScoreInfo `json:"marketing_score_info,omitempty" xml:"marketing_score_info,omitempty" type:"Repeated"`
}

func (s BatchqueryInnerMarketingscoreResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryInnerMarketingscoreResponse) GoString() string {
	return s.String()
}

func (s *BatchqueryInnerMarketingscoreResponse) SetReqMsgId(v string) *BatchqueryInnerMarketingscoreResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchqueryInnerMarketingscoreResponse) SetResultCode(v string) *BatchqueryInnerMarketingscoreResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchqueryInnerMarketingscoreResponse) SetResultMsg(v string) *BatchqueryInnerMarketingscoreResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchqueryInnerMarketingscoreResponse) SetMarketingScoreInfo(v []*MarketingScoreInfo) *BatchqueryInnerMarketingscoreResponse {
	s.MarketingScoreInfo = v
	return s
}

type CreateInnerCustomerserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 公司社会统一信息代码,间联模式必传
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// 公司名称
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty"`
	// 处理类型:
	// MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
	// PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
	ProcessType *string `json:"process_type,omitempty" xml:"process_type,omitempty" require:"true"`
	// 服务商名称
	ServiceProviderName *string `json:"service_provider_name,omitempty" xml:"service_provider_name,omitempty"`
	// 客诉处理员支付宝绑定手机号
	AlipayBindMobile *string `json:"alipay_bind_mobile,omitempty" xml:"alipay_bind_mobile,omitempty" require:"true"`
	// 客诉处理员支付宝账号
	AlipayLogonId *string `json:"alipay_logon_id,omitempty" xml:"alipay_logon_id,omitempty" require:"true"`
	// 客服电话
	CustomerServicePhone *string `json:"customer_service_phone,omitempty" xml:"customer_service_phone,omitempty" require:"true"`
	// 客服人员名称
	CustomerServiceName *string `json:"customer_service_name,omitempty" xml:"customer_service_name,omitempty" require:"true"`
	// 在线客服网址
	OnlineSupportSiteUrl *string `json:"online_support_site_url,omitempty" xml:"online_support_site_url,omitempty"`
	// 投诉问题
	CustomerComplaintIssues *string `json:"customer_complaint_issues,omitempty" xml:"customer_complaint_issues,omitempty" require:"true"`
	// 进件类型
	// DIRECT("DIRECT", "直连进件模式"),
	// AGENT("AGENT", "代理商进件模式"),
	ExpandMode *string `json:"expand_mode,omitempty" xml:"expand_mode,omitempty" require:"true"`
}

func (s CreateInnerCustomerserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateInnerCustomerserviceRequest) GoString() string {
	return s.String()
}

func (s *CreateInnerCustomerserviceRequest) SetAuthToken(v string) *CreateInnerCustomerserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateInnerCustomerserviceRequest) SetProductInstanceId(v string) *CreateInnerCustomerserviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateInnerCustomerserviceRequest) SetTenantId(v string) *CreateInnerCustomerserviceRequest {
	s.TenantId = &v
	return s
}

func (s *CreateInnerCustomerserviceRequest) SetMerchantId(v string) *CreateInnerCustomerserviceRequest {
	s.MerchantId = &v
	return s
}

func (s *CreateInnerCustomerserviceRequest) SetMerchantName(v string) *CreateInnerCustomerserviceRequest {
	s.MerchantName = &v
	return s
}

func (s *CreateInnerCustomerserviceRequest) SetProcessType(v string) *CreateInnerCustomerserviceRequest {
	s.ProcessType = &v
	return s
}

func (s *CreateInnerCustomerserviceRequest) SetServiceProviderName(v string) *CreateInnerCustomerserviceRequest {
	s.ServiceProviderName = &v
	return s
}

func (s *CreateInnerCustomerserviceRequest) SetAlipayBindMobile(v string) *CreateInnerCustomerserviceRequest {
	s.AlipayBindMobile = &v
	return s
}

func (s *CreateInnerCustomerserviceRequest) SetAlipayLogonId(v string) *CreateInnerCustomerserviceRequest {
	s.AlipayLogonId = &v
	return s
}

func (s *CreateInnerCustomerserviceRequest) SetCustomerServicePhone(v string) *CreateInnerCustomerserviceRequest {
	s.CustomerServicePhone = &v
	return s
}

func (s *CreateInnerCustomerserviceRequest) SetCustomerServiceName(v string) *CreateInnerCustomerserviceRequest {
	s.CustomerServiceName = &v
	return s
}

func (s *CreateInnerCustomerserviceRequest) SetOnlineSupportSiteUrl(v string) *CreateInnerCustomerserviceRequest {
	s.OnlineSupportSiteUrl = &v
	return s
}

func (s *CreateInnerCustomerserviceRequest) SetCustomerComplaintIssues(v string) *CreateInnerCustomerserviceRequest {
	s.CustomerComplaintIssues = &v
	return s
}

func (s *CreateInnerCustomerserviceRequest) SetExpandMode(v string) *CreateInnerCustomerserviceRequest {
	s.ExpandMode = &v
	return s
}

type CreateInnerCustomerserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateInnerCustomerserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateInnerCustomerserviceResponse) GoString() string {
	return s.String()
}

func (s *CreateInnerCustomerserviceResponse) SetReqMsgId(v string) *CreateInnerCustomerserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateInnerCustomerserviceResponse) SetResultCode(v string) *CreateInnerCustomerserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateInnerCustomerserviceResponse) SetResultMsg(v string) *CreateInnerCustomerserviceResponse {
	s.ResultMsg = &v
	return s
}

type UpdateInnerCustomerserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 商家社会统一信用代码，间联模式必传
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// 公司名称
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty" require:"true"`
	// 处理类型:
	// MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
	// PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
	ProcessType *string `json:"process_type,omitempty" xml:"process_type,omitempty" require:"true"`
	// 服务商名称
	ServiceProviderName *string `json:"service_provider_name,omitempty" xml:"service_provider_name,omitempty"`
	// 客诉处理员支付宝绑定手机号
	AlipayBindMobile *string `json:"alipay_bind_mobile,omitempty" xml:"alipay_bind_mobile,omitempty" require:"true"`
	// 客诉处理员支付宝账号
	AlipayLogonId *string `json:"alipay_logon_id,omitempty" xml:"alipay_logon_id,omitempty" require:"true"`
	// 客服电话
	CustomerServicePhone *string `json:"customer_service_phone,omitempty" xml:"customer_service_phone,omitempty" require:"true"`
	// 客服人员名称
	CustomerServiceName *string `json:"customer_service_name,omitempty" xml:"customer_service_name,omitempty" require:"true"`
	// 在线客服网址
	OnlineSupportSiteUrl *string `json:"online_support_site_url,omitempty" xml:"online_support_site_url,omitempty"`
	// 投诉问题
	CustomerComplaintIssues *string `json:"customer_complaint_issues,omitempty" xml:"customer_complaint_issues,omitempty" require:"true"`
	// 进件类型
	// DIRECT("DIRECT", "直连进件模式"), AGENT("AGENT", "代理商进件模式"),
	ExpandMode *string `json:"expand_mode,omitempty" xml:"expand_mode,omitempty" require:"true"`
}

func (s UpdateInnerCustomerserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateInnerCustomerserviceRequest) GoString() string {
	return s.String()
}

func (s *UpdateInnerCustomerserviceRequest) SetAuthToken(v string) *UpdateInnerCustomerserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateInnerCustomerserviceRequest) SetProductInstanceId(v string) *UpdateInnerCustomerserviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateInnerCustomerserviceRequest) SetTenantId(v string) *UpdateInnerCustomerserviceRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateInnerCustomerserviceRequest) SetMerchantId(v string) *UpdateInnerCustomerserviceRequest {
	s.MerchantId = &v
	return s
}

func (s *UpdateInnerCustomerserviceRequest) SetMerchantName(v string) *UpdateInnerCustomerserviceRequest {
	s.MerchantName = &v
	return s
}

func (s *UpdateInnerCustomerserviceRequest) SetProcessType(v string) *UpdateInnerCustomerserviceRequest {
	s.ProcessType = &v
	return s
}

func (s *UpdateInnerCustomerserviceRequest) SetServiceProviderName(v string) *UpdateInnerCustomerserviceRequest {
	s.ServiceProviderName = &v
	return s
}

func (s *UpdateInnerCustomerserviceRequest) SetAlipayBindMobile(v string) *UpdateInnerCustomerserviceRequest {
	s.AlipayBindMobile = &v
	return s
}

func (s *UpdateInnerCustomerserviceRequest) SetAlipayLogonId(v string) *UpdateInnerCustomerserviceRequest {
	s.AlipayLogonId = &v
	return s
}

func (s *UpdateInnerCustomerserviceRequest) SetCustomerServicePhone(v string) *UpdateInnerCustomerserviceRequest {
	s.CustomerServicePhone = &v
	return s
}

func (s *UpdateInnerCustomerserviceRequest) SetCustomerServiceName(v string) *UpdateInnerCustomerserviceRequest {
	s.CustomerServiceName = &v
	return s
}

func (s *UpdateInnerCustomerserviceRequest) SetOnlineSupportSiteUrl(v string) *UpdateInnerCustomerserviceRequest {
	s.OnlineSupportSiteUrl = &v
	return s
}

func (s *UpdateInnerCustomerserviceRequest) SetCustomerComplaintIssues(v string) *UpdateInnerCustomerserviceRequest {
	s.CustomerComplaintIssues = &v
	return s
}

func (s *UpdateInnerCustomerserviceRequest) SetExpandMode(v string) *UpdateInnerCustomerserviceRequest {
	s.ExpandMode = &v
	return s
}

type UpdateInnerCustomerserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateInnerCustomerserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateInnerCustomerserviceResponse) GoString() string {
	return s.String()
}

func (s *UpdateInnerCustomerserviceResponse) SetReqMsgId(v string) *UpdateInnerCustomerserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateInnerCustomerserviceResponse) SetResultCode(v string) *UpdateInnerCustomerserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateInnerCustomerserviceResponse) SetResultMsg(v string) *UpdateInnerCustomerserviceResponse {
	s.ResultMsg = &v
	return s
}

type PagequeryInnerCustomerserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 分页信息
	PageInfo *PageQuery `json:"page_info,omitempty" xml:"page_info,omitempty" require:"true"`
	// 处理类型:
	// MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
	// PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
	ProcessType *string `json:"process_type,omitempty" xml:"process_type,omitempty"`
	// 公司社会统一信息代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// 公司名称
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty"`
}

func (s PagequeryInnerCustomerserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerCustomerserviceRequest) GoString() string {
	return s.String()
}

func (s *PagequeryInnerCustomerserviceRequest) SetAuthToken(v string) *PagequeryInnerCustomerserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryInnerCustomerserviceRequest) SetProductInstanceId(v string) *PagequeryInnerCustomerserviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryInnerCustomerserviceRequest) SetTenantId(v string) *PagequeryInnerCustomerserviceRequest {
	s.TenantId = &v
	return s
}

func (s *PagequeryInnerCustomerserviceRequest) SetPageInfo(v *PageQuery) *PagequeryInnerCustomerserviceRequest {
	s.PageInfo = v
	return s
}

func (s *PagequeryInnerCustomerserviceRequest) SetProcessType(v string) *PagequeryInnerCustomerserviceRequest {
	s.ProcessType = &v
	return s
}

func (s *PagequeryInnerCustomerserviceRequest) SetMerchantId(v string) *PagequeryInnerCustomerserviceRequest {
	s.MerchantId = &v
	return s
}

func (s *PagequeryInnerCustomerserviceRequest) SetMerchantName(v string) *PagequeryInnerCustomerserviceRequest {
	s.MerchantName = &v
	return s
}

type PagequeryInnerCustomerserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 客服信息
	CustomerServiceInfoList []*CustomerServiceInfo `json:"customer_service_info_list,omitempty" xml:"customer_service_info_list,omitempty" type:"Repeated"`
}

func (s PagequeryInnerCustomerserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerCustomerserviceResponse) GoString() string {
	return s.String()
}

func (s *PagequeryInnerCustomerserviceResponse) SetReqMsgId(v string) *PagequeryInnerCustomerserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryInnerCustomerserviceResponse) SetResultCode(v string) *PagequeryInnerCustomerserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryInnerCustomerserviceResponse) SetResultMsg(v string) *PagequeryInnerCustomerserviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryInnerCustomerserviceResponse) SetTotal(v int64) *PagequeryInnerCustomerserviceResponse {
	s.Total = &v
	return s
}

func (s *PagequeryInnerCustomerserviceResponse) SetCustomerServiceInfoList(v []*CustomerServiceInfo) *PagequeryInnerCustomerserviceResponse {
	s.CustomerServiceInfoList = v
	return s
}

type DetailInnerCustomerserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 公司社会统一信息代码，间联模式必传
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// 进件类型
	// DIRECT("DIRECT", "直连进件模式"),
	// AGENT("AGENT", "代理商进件模式"),
	ExpandMode *string `json:"expand_mode,omitempty" xml:"expand_mode,omitempty" require:"true"`
}

func (s DetailInnerCustomerserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s DetailInnerCustomerserviceRequest) GoString() string {
	return s.String()
}

func (s *DetailInnerCustomerserviceRequest) SetAuthToken(v string) *DetailInnerCustomerserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *DetailInnerCustomerserviceRequest) SetProductInstanceId(v string) *DetailInnerCustomerserviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DetailInnerCustomerserviceRequest) SetTenantId(v string) *DetailInnerCustomerserviceRequest {
	s.TenantId = &v
	return s
}

func (s *DetailInnerCustomerserviceRequest) SetMerchantId(v string) *DetailInnerCustomerserviceRequest {
	s.MerchantId = &v
	return s
}

func (s *DetailInnerCustomerserviceRequest) SetExpandMode(v string) *DetailInnerCustomerserviceRequest {
	s.ExpandMode = &v
	return s
}

type DetailInnerCustomerserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 公司社会统一信息代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// 公司名称
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty"`
	// 处理类型:
	// MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
	// PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
	ProcessType *string `json:"process_type,omitempty" xml:"process_type,omitempty"`
	// 服务商名称
	ServiceProviderName *string `json:"service_provider_name,omitempty" xml:"service_provider_name,omitempty"`
	// 客诉处理员支付宝绑定手机号
	AlipayBindMobile *string `json:"alipay_bind_mobile,omitempty" xml:"alipay_bind_mobile,omitempty"`
	// 客诉处理员支付宝账号
	AlipayLogonId *string `json:"alipay_logon_id,omitempty" xml:"alipay_logon_id,omitempty"`
	// 客服电话
	CustomerServicePhone *string `json:"customer_service_phone,omitempty" xml:"customer_service_phone,omitempty"`
	// 客服人员名称
	CustomerServiceName *string `json:"customer_service_name,omitempty" xml:"customer_service_name,omitempty"`
	// 在线客服网址
	OnlineSupportSiteUrl *string `json:"online_support_site_url,omitempty" xml:"online_support_site_url,omitempty"`
	// 投诉问题
	CustomerComplaintIssues *string `json:"customer_complaint_issues,omitempty" xml:"customer_complaint_issues,omitempty"`
}

func (s DetailInnerCustomerserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s DetailInnerCustomerserviceResponse) GoString() string {
	return s.String()
}

func (s *DetailInnerCustomerserviceResponse) SetReqMsgId(v string) *DetailInnerCustomerserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DetailInnerCustomerserviceResponse) SetResultCode(v string) *DetailInnerCustomerserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *DetailInnerCustomerserviceResponse) SetResultMsg(v string) *DetailInnerCustomerserviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *DetailInnerCustomerserviceResponse) SetMerchantId(v string) *DetailInnerCustomerserviceResponse {
	s.MerchantId = &v
	return s
}

func (s *DetailInnerCustomerserviceResponse) SetMerchantName(v string) *DetailInnerCustomerserviceResponse {
	s.MerchantName = &v
	return s
}

func (s *DetailInnerCustomerserviceResponse) SetProcessType(v string) *DetailInnerCustomerserviceResponse {
	s.ProcessType = &v
	return s
}

func (s *DetailInnerCustomerserviceResponse) SetServiceProviderName(v string) *DetailInnerCustomerserviceResponse {
	s.ServiceProviderName = &v
	return s
}

func (s *DetailInnerCustomerserviceResponse) SetAlipayBindMobile(v string) *DetailInnerCustomerserviceResponse {
	s.AlipayBindMobile = &v
	return s
}

func (s *DetailInnerCustomerserviceResponse) SetAlipayLogonId(v string) *DetailInnerCustomerserviceResponse {
	s.AlipayLogonId = &v
	return s
}

func (s *DetailInnerCustomerserviceResponse) SetCustomerServicePhone(v string) *DetailInnerCustomerserviceResponse {
	s.CustomerServicePhone = &v
	return s
}

func (s *DetailInnerCustomerserviceResponse) SetCustomerServiceName(v string) *DetailInnerCustomerserviceResponse {
	s.CustomerServiceName = &v
	return s
}

func (s *DetailInnerCustomerserviceResponse) SetOnlineSupportSiteUrl(v string) *DetailInnerCustomerserviceResponse {
	s.OnlineSupportSiteUrl = &v
	return s
}

func (s *DetailInnerCustomerserviceResponse) SetCustomerComplaintIssues(v string) *DetailInnerCustomerserviceResponse {
	s.CustomerComplaintIssues = &v
	return s
}

type GetInnerCustomerservicetemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 进件类型
	// DIRECT("DIRECT", "直连进件模式")
	// AGENT("AGENT", "代理商进件模式")
	ExpandMode *string `json:"expand_mode,omitempty" xml:"expand_mode,omitempty" require:"true"`
	// 处理类型:
	// MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
	// PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
	ProcessType *string `json:"process_type,omitempty" xml:"process_type,omitempty" require:"true"`
}

func (s GetInnerCustomerservicetemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s GetInnerCustomerservicetemplateRequest) GoString() string {
	return s.String()
}

func (s *GetInnerCustomerservicetemplateRequest) SetAuthToken(v string) *GetInnerCustomerservicetemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *GetInnerCustomerservicetemplateRequest) SetProductInstanceId(v string) *GetInnerCustomerservicetemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetInnerCustomerservicetemplateRequest) SetTenantId(v string) *GetInnerCustomerservicetemplateRequest {
	s.TenantId = &v
	return s
}

func (s *GetInnerCustomerservicetemplateRequest) SetExpandMode(v string) *GetInnerCustomerservicetemplateRequest {
	s.ExpandMode = &v
	return s
}

func (s *GetInnerCustomerservicetemplateRequest) SetProcessType(v string) *GetInnerCustomerservicetemplateRequest {
	s.ProcessType = &v
	return s
}

type GetInnerCustomerservicetemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 服务商名称
	ServiceProviderName *string `json:"service_provider_name,omitempty" xml:"service_provider_name,omitempty"`
	// 客诉处理员支付宝绑定手机号
	AlipayBindMobile *string `json:"alipay_bind_mobile,omitempty" xml:"alipay_bind_mobile,omitempty"`
	// 客诉处理员支付宝账号
	AlipayLogonId *string `json:"alipay_logon_id,omitempty" xml:"alipay_logon_id,omitempty"`
	// 客服电话
	CustomerServicePhone *string `json:"customer_service_phone,omitempty" xml:"customer_service_phone,omitempty"`
	// 客服人员名称
	CustomerServiceName *string `json:"customer_service_name,omitempty" xml:"customer_service_name,omitempty"`
	// 在线客服网址
	OnlineSupportSiteUrl *string `json:"online_support_site_url,omitempty" xml:"online_support_site_url,omitempty"`
	// 投诉问题
	CustomerComplaintIssues *string `json:"customer_complaint_issues,omitempty" xml:"customer_complaint_issues,omitempty"`
}

func (s GetInnerCustomerservicetemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s GetInnerCustomerservicetemplateResponse) GoString() string {
	return s.String()
}

func (s *GetInnerCustomerservicetemplateResponse) SetReqMsgId(v string) *GetInnerCustomerservicetemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetInnerCustomerservicetemplateResponse) SetResultCode(v string) *GetInnerCustomerservicetemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *GetInnerCustomerservicetemplateResponse) SetResultMsg(v string) *GetInnerCustomerservicetemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetInnerCustomerservicetemplateResponse) SetServiceProviderName(v string) *GetInnerCustomerservicetemplateResponse {
	s.ServiceProviderName = &v
	return s
}

func (s *GetInnerCustomerservicetemplateResponse) SetAlipayBindMobile(v string) *GetInnerCustomerservicetemplateResponse {
	s.AlipayBindMobile = &v
	return s
}

func (s *GetInnerCustomerservicetemplateResponse) SetAlipayLogonId(v string) *GetInnerCustomerservicetemplateResponse {
	s.AlipayLogonId = &v
	return s
}

func (s *GetInnerCustomerservicetemplateResponse) SetCustomerServicePhone(v string) *GetInnerCustomerservicetemplateResponse {
	s.CustomerServicePhone = &v
	return s
}

func (s *GetInnerCustomerservicetemplateResponse) SetCustomerServiceName(v string) *GetInnerCustomerservicetemplateResponse {
	s.CustomerServiceName = &v
	return s
}

func (s *GetInnerCustomerservicetemplateResponse) SetOnlineSupportSiteUrl(v string) *GetInnerCustomerservicetemplateResponse {
	s.OnlineSupportSiteUrl = &v
	return s
}

func (s *GetInnerCustomerservicetemplateResponse) SetCustomerComplaintIssues(v string) *GetInnerCustomerservicetemplateResponse {
	s.CustomerComplaintIssues = &v
	return s
}

type QueryInnerTemplateinstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 业务唯一实例id（模板实例化时的业务id）
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty" require:"true"`
	// 实例化文件是否需要pdf格式
	NeedPdfFile *bool `json:"need_pdf_file,omitempty" xml:"need_pdf_file,omitempty" require:"true"`
}

func (s QueryInnerTemplateinstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerTemplateinstanceRequest) GoString() string {
	return s.String()
}

func (s *QueryInnerTemplateinstanceRequest) SetAuthToken(v string) *QueryInnerTemplateinstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInnerTemplateinstanceRequest) SetProductInstanceId(v string) *QueryInnerTemplateinstanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInnerTemplateinstanceRequest) SetTenantId(v string) *QueryInnerTemplateinstanceRequest {
	s.TenantId = &v
	return s
}

func (s *QueryInnerTemplateinstanceRequest) SetTemplateCode(v string) *QueryInnerTemplateinstanceRequest {
	s.TemplateCode = &v
	return s
}

func (s *QueryInnerTemplateinstanceRequest) SetBusinessId(v string) *QueryInnerTemplateinstanceRequest {
	s.BusinessId = &v
	return s
}

func (s *QueryInnerTemplateinstanceRequest) SetNeedPdfFile(v bool) *QueryInnerTemplateinstanceRequest {
	s.NeedPdfFile = &v
	return s
}

type QueryInnerTemplateinstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模板实例化后的信息
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryInnerTemplateinstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerTemplateinstanceResponse) GoString() string {
	return s.String()
}

func (s *QueryInnerTemplateinstanceResponse) SetReqMsgId(v string) *QueryInnerTemplateinstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInnerTemplateinstanceResponse) SetResultCode(v string) *QueryInnerTemplateinstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInnerTemplateinstanceResponse) SetResultMsg(v string) *QueryInnerTemplateinstanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInnerTemplateinstanceResponse) SetData(v string) *QueryInnerTemplateinstanceResponse {
	s.Data = &v
	return s
}

type QueryInnerTenantindirectmainclassRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
}

func (s QueryInnerTenantindirectmainclassRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerTenantindirectmainclassRequest) GoString() string {
	return s.String()
}

func (s *QueryInnerTenantindirectmainclassRequest) SetAuthToken(v string) *QueryInnerTenantindirectmainclassRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInnerTenantindirectmainclassRequest) SetProductInstanceId(v string) *QueryInnerTenantindirectmainclassRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInnerTenantindirectmainclassRequest) SetTenantId(v string) *QueryInnerTenantindirectmainclassRequest {
	s.TenantId = &v
	return s
}

type QueryInnerTenantindirectmainclassResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前开通类目
	CurrentIndirectMainClassList []*string `json:"current_indirect_main_class_list,omitempty" xml:"current_indirect_main_class_list,omitempty" type:"Repeated"`
	// 开通说明
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
	// 状态
	// INIT:初始化
	// AUDIT:审批中
	// AUDIT_PASSED:审批通过
	// AUDIT_NOT_PASSED:审批不通过
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 审核拒绝原因
	FailReason *string `json:"fail_reason,omitempty" xml:"fail_reason,omitempty"`
	// 申请开通的类目
	ChangingIndirectMainClassList []*string `json:"changing_indirect_main_class_list,omitempty" xml:"changing_indirect_main_class_list,omitempty" type:"Repeated"`
}

func (s QueryInnerTenantindirectmainclassResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerTenantindirectmainclassResponse) GoString() string {
	return s.String()
}

func (s *QueryInnerTenantindirectmainclassResponse) SetReqMsgId(v string) *QueryInnerTenantindirectmainclassResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInnerTenantindirectmainclassResponse) SetResultCode(v string) *QueryInnerTenantindirectmainclassResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInnerTenantindirectmainclassResponse) SetResultMsg(v string) *QueryInnerTenantindirectmainclassResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInnerTenantindirectmainclassResponse) SetCurrentIndirectMainClassList(v []*string) *QueryInnerTenantindirectmainclassResponse {
	s.CurrentIndirectMainClassList = v
	return s
}

func (s *QueryInnerTenantindirectmainclassResponse) SetDesc(v string) *QueryInnerTenantindirectmainclassResponse {
	s.Desc = &v
	return s
}

func (s *QueryInnerTenantindirectmainclassResponse) SetStatus(v string) *QueryInnerTenantindirectmainclassResponse {
	s.Status = &v
	return s
}

func (s *QueryInnerTenantindirectmainclassResponse) SetFailReason(v string) *QueryInnerTenantindirectmainclassResponse {
	s.FailReason = &v
	return s
}

func (s *QueryInnerTenantindirectmainclassResponse) SetChangingIndirectMainClassList(v []*string) *QueryInnerTenantindirectmainclassResponse {
	s.ChangingIndirectMainClassList = v
	return s
}

type UpdateInnerTenantindirectmainclassRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 开通类目
	IndirectMainClassList []*string `json:"indirect_main_class_list,omitempty" xml:"indirect_main_class_list,omitempty" require:"true" type:"Repeated"`
	// 开通说明
	//
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
}

func (s UpdateInnerTenantindirectmainclassRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateInnerTenantindirectmainclassRequest) GoString() string {
	return s.String()
}

func (s *UpdateInnerTenantindirectmainclassRequest) SetAuthToken(v string) *UpdateInnerTenantindirectmainclassRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateInnerTenantindirectmainclassRequest) SetProductInstanceId(v string) *UpdateInnerTenantindirectmainclassRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateInnerTenantindirectmainclassRequest) SetTenantId(v string) *UpdateInnerTenantindirectmainclassRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateInnerTenantindirectmainclassRequest) SetIndirectMainClassList(v []*string) *UpdateInnerTenantindirectmainclassRequest {
	s.IndirectMainClassList = v
	return s
}

func (s *UpdateInnerTenantindirectmainclassRequest) SetDesc(v string) *UpdateInnerTenantindirectmainclassRequest {
	s.Desc = &v
	return s
}

type UpdateInnerTenantindirectmainclassResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateInnerTenantindirectmainclassResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateInnerTenantindirectmainclassResponse) GoString() string {
	return s.String()
}

func (s *UpdateInnerTenantindirectmainclassResponse) SetReqMsgId(v string) *UpdateInnerTenantindirectmainclassResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateInnerTenantindirectmainclassResponse) SetResultCode(v string) *UpdateInnerTenantindirectmainclassResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateInnerTenantindirectmainclassResponse) SetResultMsg(v string) *UpdateInnerTenantindirectmainclassResponse {
	s.ResultMsg = &v
	return s
}

type SubmitInnerTemplatesyncreviewRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 来源魔法库模板code
	SourceTemplateCode *string `json:"source_template_code,omitempty" xml:"source_template_code,omitempty" require:"true"`
	// 目标魔法库模板名称
	TargetTemplateName *string `json:"target_template_name,omitempty" xml:"target_template_name,omitempty" require:"true"`
	// 魔法库来源模板版本
	SourceTemplateVersion *string `json:"source_template_version,omitempty" xml:"source_template_version,omitempty" require:"true"`
}

func (s SubmitInnerTemplatesyncreviewRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitInnerTemplatesyncreviewRequest) GoString() string {
	return s.String()
}

func (s *SubmitInnerTemplatesyncreviewRequest) SetAuthToken(v string) *SubmitInnerTemplatesyncreviewRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitInnerTemplatesyncreviewRequest) SetProductInstanceId(v string) *SubmitInnerTemplatesyncreviewRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitInnerTemplatesyncreviewRequest) SetTenantId(v string) *SubmitInnerTemplatesyncreviewRequest {
	s.TenantId = &v
	return s
}

func (s *SubmitInnerTemplatesyncreviewRequest) SetSourceTemplateCode(v string) *SubmitInnerTemplatesyncreviewRequest {
	s.SourceTemplateCode = &v
	return s
}

func (s *SubmitInnerTemplatesyncreviewRequest) SetTargetTemplateName(v string) *SubmitInnerTemplatesyncreviewRequest {
	s.TargetTemplateName = &v
	return s
}

func (s *SubmitInnerTemplatesyncreviewRequest) SetSourceTemplateVersion(v string) *SubmitInnerTemplatesyncreviewRequest {
	s.SourceTemplateVersion = &v
	return s
}

type SubmitInnerTemplatesyncreviewResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 提交同步上线审核的模板code
	SourceTemplateCode *string `json:"source_template_code,omitempty" xml:"source_template_code,omitempty"`
}

func (s SubmitInnerTemplatesyncreviewResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitInnerTemplatesyncreviewResponse) GoString() string {
	return s.String()
}

func (s *SubmitInnerTemplatesyncreviewResponse) SetReqMsgId(v string) *SubmitInnerTemplatesyncreviewResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitInnerTemplatesyncreviewResponse) SetResultCode(v string) *SubmitInnerTemplatesyncreviewResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitInnerTemplatesyncreviewResponse) SetResultMsg(v string) *SubmitInnerTemplatesyncreviewResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitInnerTemplatesyncreviewResponse) SetSourceTemplateCode(v string) *SubmitInnerTemplatesyncreviewResponse {
	s.SourceTemplateCode = &v
	return s
}

type SubmitInnerPendingeventRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 待办事件id
	EventId *string `json:"event_id,omitempty" xml:"event_id,omitempty" require:"true"`
	// 商家处理动作
	// REJECT拒绝，APPROVE 同意
	Action *string `json:"action,omitempty" xml:"action,omitempty" require:"true"`
	// 操作人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
}

func (s SubmitInnerPendingeventRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitInnerPendingeventRequest) GoString() string {
	return s.String()
}

func (s *SubmitInnerPendingeventRequest) SetAuthToken(v string) *SubmitInnerPendingeventRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitInnerPendingeventRequest) SetProductInstanceId(v string) *SubmitInnerPendingeventRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitInnerPendingeventRequest) SetTenantId(v string) *SubmitInnerPendingeventRequest {
	s.TenantId = &v
	return s
}

func (s *SubmitInnerPendingeventRequest) SetEventId(v string) *SubmitInnerPendingeventRequest {
	s.EventId = &v
	return s
}

func (s *SubmitInnerPendingeventRequest) SetAction(v string) *SubmitInnerPendingeventRequest {
	s.Action = &v
	return s
}

func (s *SubmitInnerPendingeventRequest) SetOperator(v string) *SubmitInnerPendingeventRequest {
	s.Operator = &v
	return s
}

type SubmitInnerPendingeventResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SubmitInnerPendingeventResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitInnerPendingeventResponse) GoString() string {
	return s.String()
}

func (s *SubmitInnerPendingeventResponse) SetReqMsgId(v string) *SubmitInnerPendingeventResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitInnerPendingeventResponse) SetResultCode(v string) *SubmitInnerPendingeventResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitInnerPendingeventResponse) SetResultMsg(v string) *SubmitInnerPendingeventResponse {
	s.ResultMsg = &v
	return s
}

type DetailInnerPendingeventRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 事件id
	EventId *string `json:"event_id,omitempty" xml:"event_id,omitempty" require:"true"`
}

func (s DetailInnerPendingeventRequest) String() string {
	return tea.Prettify(s)
}

func (s DetailInnerPendingeventRequest) GoString() string {
	return s.String()
}

func (s *DetailInnerPendingeventRequest) SetAuthToken(v string) *DetailInnerPendingeventRequest {
	s.AuthToken = &v
	return s
}

func (s *DetailInnerPendingeventRequest) SetProductInstanceId(v string) *DetailInnerPendingeventRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DetailInnerPendingeventRequest) SetTenantId(v string) *DetailInnerPendingeventRequest {
	s.TenantId = &v
	return s
}

func (s *DetailInnerPendingeventRequest) SetEventId(v string) *DetailInnerPendingeventRequest {
	s.EventId = &v
	return s
}

type DetailInnerPendingeventResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 事件id
	EventId *string `json:"event_id,omitempty" xml:"event_id,omitempty"`
	// 通知:NOTIFICATION
	// 确认函:CONFIRMATION
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// ("PENDING","待办中"), ("CONFIRMED","确认"), ("REJECTED","已拒绝") ("FAILED","失败"),("EXPIRED","已过期");
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 待办内容主题
	ContentSubject *string `json:"content_subject,omitempty" xml:"content_subject,omitempty"`
	// 待办内容详情
	ContentDetails *string `json:"content_details,omitempty" xml:"content_details,omitempty"`
	// 待办处理页面操作按钮
	// ACKNOWLEDGE 我已知晓
	//  CONFIRM 确认
	//  RETURN 返回
	// REJECT 拒绝
	ActionOptionsConfig *string `json:"action_options_config,omitempty" xml:"action_options_config,omitempty"`
	// 事件有效期开始
	EffectiveStartTime *string `json:"effective_start_time,omitempty" xml:"effective_start_time,omitempty"`
	// 事件有效期结束
	EffectiveEndTime *string `json:"effective_end_time,omitempty" xml:"effective_end_time,omitempty"`
}

func (s DetailInnerPendingeventResponse) String() string {
	return tea.Prettify(s)
}

func (s DetailInnerPendingeventResponse) GoString() string {
	return s.String()
}

func (s *DetailInnerPendingeventResponse) SetReqMsgId(v string) *DetailInnerPendingeventResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DetailInnerPendingeventResponse) SetResultCode(v string) *DetailInnerPendingeventResponse {
	s.ResultCode = &v
	return s
}

func (s *DetailInnerPendingeventResponse) SetResultMsg(v string) *DetailInnerPendingeventResponse {
	s.ResultMsg = &v
	return s
}

func (s *DetailInnerPendingeventResponse) SetEventId(v string) *DetailInnerPendingeventResponse {
	s.EventId = &v
	return s
}

func (s *DetailInnerPendingeventResponse) SetType(v string) *DetailInnerPendingeventResponse {
	s.Type = &v
	return s
}

func (s *DetailInnerPendingeventResponse) SetStatus(v string) *DetailInnerPendingeventResponse {
	s.Status = &v
	return s
}

func (s *DetailInnerPendingeventResponse) SetContentSubject(v string) *DetailInnerPendingeventResponse {
	s.ContentSubject = &v
	return s
}

func (s *DetailInnerPendingeventResponse) SetContentDetails(v string) *DetailInnerPendingeventResponse {
	s.ContentDetails = &v
	return s
}

func (s *DetailInnerPendingeventResponse) SetActionOptionsConfig(v string) *DetailInnerPendingeventResponse {
	s.ActionOptionsConfig = &v
	return s
}

func (s *DetailInnerPendingeventResponse) SetEffectiveStartTime(v string) *DetailInnerPendingeventResponse {
	s.EffectiveStartTime = &v
	return s
}

func (s *DetailInnerPendingeventResponse) SetEffectiveEndTime(v string) *DetailInnerPendingeventResponse {
	s.EffectiveEndTime = &v
	return s
}

type AddInnerTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 合同模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
}

func (s AddInnerTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s AddInnerTemplateRequest) GoString() string {
	return s.String()
}

func (s *AddInnerTemplateRequest) SetAuthToken(v string) *AddInnerTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *AddInnerTemplateRequest) SetProductInstanceId(v string) *AddInnerTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddInnerTemplateRequest) SetTenantId(v string) *AddInnerTemplateRequest {
	s.TenantId = &v
	return s
}

func (s *AddInnerTemplateRequest) SetTemplateCode(v string) *AddInnerTemplateRequest {
	s.TemplateCode = &v
	return s
}

type AddInnerTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AddInnerTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s AddInnerTemplateResponse) GoString() string {
	return s.String()
}

func (s *AddInnerTemplateResponse) SetReqMsgId(v string) *AddInnerTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddInnerTemplateResponse) SetResultCode(v string) *AddInnerTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *AddInnerTemplateResponse) SetResultMsg(v string) *AddInnerTemplateResponse {
	s.ResultMsg = &v
	return s
}

type PagequeryInnerPendingeventRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 待办状态
	StatusList []*string `json:"status_list,omitempty" xml:"status_list,omitempty" type:"Repeated"`
	// 事件类型
	// 通知:NOTIFICATION
	// 确认函:CONFIRMATION
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 分页
	PageInfo *PageQuery `json:"page_info,omitempty" xml:"page_info,omitempty" require:"true"`
}

func (s PagequeryInnerPendingeventRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerPendingeventRequest) GoString() string {
	return s.String()
}

func (s *PagequeryInnerPendingeventRequest) SetAuthToken(v string) *PagequeryInnerPendingeventRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryInnerPendingeventRequest) SetProductInstanceId(v string) *PagequeryInnerPendingeventRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryInnerPendingeventRequest) SetTenantId(v string) *PagequeryInnerPendingeventRequest {
	s.TenantId = &v
	return s
}

func (s *PagequeryInnerPendingeventRequest) SetStatusList(v []*string) *PagequeryInnerPendingeventRequest {
	s.StatusList = v
	return s
}

func (s *PagequeryInnerPendingeventRequest) SetType(v string) *PagequeryInnerPendingeventRequest {
	s.Type = &v
	return s
}

func (s *PagequeryInnerPendingeventRequest) SetPageInfo(v *PageQuery) *PagequeryInnerPendingeventRequest {
	s.PageInfo = v
	return s
}

type PagequeryInnerPendingeventResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总量
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 待办列表信息
	PendingEventInfoList []*PendingEventInfo `json:"pending_event_info_list,omitempty" xml:"pending_event_info_list,omitempty" type:"Repeated"`
}

func (s PagequeryInnerPendingeventResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerPendingeventResponse) GoString() string {
	return s.String()
}

func (s *PagequeryInnerPendingeventResponse) SetReqMsgId(v string) *PagequeryInnerPendingeventResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryInnerPendingeventResponse) SetResultCode(v string) *PagequeryInnerPendingeventResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryInnerPendingeventResponse) SetResultMsg(v string) *PagequeryInnerPendingeventResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryInnerPendingeventResponse) SetTotal(v int64) *PagequeryInnerPendingeventResponse {
	s.Total = &v
	return s
}

func (s *PagequeryInnerPendingeventResponse) SetPendingEventInfoList(v []*PendingEventInfo) *PagequeryInnerPendingeventResponse {
	s.PendingEventInfoList = v
	return s
}

type CreateInsureRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户的订单号，后续用作和保单结果交互
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 风控业务流水号
	RiskFlowId *string `json:"risk_flow_id,omitempty" xml:"risk_flow_id,omitempty" require:"true"`
	// 保险公司枚举，PA：平安保险
	InsureCompanyType *string `json:"insure_company_type,omitempty" xml:"insure_company_type,omitempty" require:"true"`
	// 保险类型枚举，PERFORMANCE：履约
	InsureProductType *string `json:"insure_product_type,omitempty" xml:"insure_product_type,omitempty" require:"true"`
	// 投保商品信息列表
	ProductInfoList []*InsureProductInfo `json:"product_info_list,omitempty" xml:"product_info_list,omitempty" require:"true" type:"Repeated"`
	// 发货方式枚举，可选值：
	// EXPRESS-物流发货
	// OFFLINE-线下交易
	DeliveryType *string `json:"delivery_type,omitempty" xml:"delivery_type,omitempty" require:"true" maxLength:"64"`
	// 公司联系人姓名，RSA 加密传输
	ContactName *string `json:"contact_name,omitempty" xml:"contact_name,omitempty" require:"true" maxLength:"2000"`
	// 公司联系人手机号，RSA 加密传输
	ContactMobile *string `json:"contact_mobile,omitempty" xml:"contact_mobile,omitempty" require:"true" maxLength:"2000"`
	// 实人认证业务流水号
	FacevrfFlowId *string `json:"facevrf_flow_id,omitempty" xml:"facevrf_flow_id,omitempty"`
	// 物流单号，非必填参数。如果选择的物流发货方式为 EXPRESS（物流发货），则该字段必填。
	LogisticsNumber *string `json:"logistics_number,omitempty" xml:"logistics_number,omitempty" maxLength:"64"`
	// 交易时间，非必填参数。如果发货方式为 OFFLINE（线下交易），则该字段必填。
	TradeTime *string `json:"trade_time,omitempty" xml:"trade_time,omitempty"`
	// 公司地址信息，此处填写的地址信息为投保时最高优先级地址，其次为公司进件时填写的地址信息。如果取不到明确地址信息，投保会失败。
	Address *string `json:"address,omitempty" xml:"address,omitempty" maxLength:"512" minLength:"1"`
	// 保险投保期数
	Period *int64 `json:"period,omitempty" xml:"period,omitempty" maximum:"120" minimum:"1"`
}

func (s CreateInsureRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateInsureRequest) GoString() string {
	return s.String()
}

func (s *CreateInsureRequest) SetAuthToken(v string) *CreateInsureRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateInsureRequest) SetProductInstanceId(v string) *CreateInsureRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateInsureRequest) SetOrderId(v string) *CreateInsureRequest {
	s.OrderId = &v
	return s
}

func (s *CreateInsureRequest) SetRiskFlowId(v string) *CreateInsureRequest {
	s.RiskFlowId = &v
	return s
}

func (s *CreateInsureRequest) SetInsureCompanyType(v string) *CreateInsureRequest {
	s.InsureCompanyType = &v
	return s
}

func (s *CreateInsureRequest) SetInsureProductType(v string) *CreateInsureRequest {
	s.InsureProductType = &v
	return s
}

func (s *CreateInsureRequest) SetProductInfoList(v []*InsureProductInfo) *CreateInsureRequest {
	s.ProductInfoList = v
	return s
}

func (s *CreateInsureRequest) SetDeliveryType(v string) *CreateInsureRequest {
	s.DeliveryType = &v
	return s
}

func (s *CreateInsureRequest) SetContactName(v string) *CreateInsureRequest {
	s.ContactName = &v
	return s
}

func (s *CreateInsureRequest) SetContactMobile(v string) *CreateInsureRequest {
	s.ContactMobile = &v
	return s
}

func (s *CreateInsureRequest) SetFacevrfFlowId(v string) *CreateInsureRequest {
	s.FacevrfFlowId = &v
	return s
}

func (s *CreateInsureRequest) SetLogisticsNumber(v string) *CreateInsureRequest {
	s.LogisticsNumber = &v
	return s
}

func (s *CreateInsureRequest) SetTradeTime(v string) *CreateInsureRequest {
	s.TradeTime = &v
	return s
}

func (s *CreateInsureRequest) SetAddress(v string) *CreateInsureRequest {
	s.Address = &v
	return s
}

func (s *CreateInsureRequest) SetPeriod(v int64) *CreateInsureRequest {
	s.Period = &v
	return s
}

type CreateInsureResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateInsureResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateInsureResponse) GoString() string {
	return s.String()
}

func (s *CreateInsureResponse) SetReqMsgId(v string) *CreateInsureResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateInsureResponse) SetResultCode(v string) *CreateInsureResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateInsureResponse) SetResultMsg(v string) *CreateInsureResponse {
	s.ResultMsg = &v
	return s
}

type QueryInsureRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 保险类型枚举，PERFORMANCE：履约
	InsureProductType *string `json:"insure_product_type,omitempty" xml:"insure_product_type,omitempty" require:"true"`
	// 保险公司枚举，PA：平安保险
	InsureCompanyType *string `json:"insure_company_type,omitempty" xml:"insure_company_type,omitempty" require:"true"`
}

func (s QueryInsureRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInsureRequest) GoString() string {
	return s.String()
}

func (s *QueryInsureRequest) SetAuthToken(v string) *QueryInsureRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInsureRequest) SetProductInstanceId(v string) *QueryInsureRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInsureRequest) SetOrderId(v string) *QueryInsureRequest {
	s.OrderId = &v
	return s
}

func (s *QueryInsureRequest) SetInsureProductType(v string) *QueryInsureRequest {
	s.InsureProductType = &v
	return s
}

func (s *QueryInsureRequest) SetInsureCompanyType(v string) *QueryInsureRequest {
	s.InsureCompanyType = &v
	return s
}

type QueryInsureResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 保单号
	InsureId *string `json:"insure_id,omitempty" xml:"insure_id,omitempty"`
	// 保险订单状态。TOBE_INSURE：待发起投保 ；INSUR_PRE_SUCC：投保成功。WITHHOLD_DEDUCTING：代扣中；WITHHOLD_SUCC：代扣成功。WITHHOLD_FAIL：代扣失败。INSUR_SUCC：承保成功
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 商品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty"`
	// 2024-09-24 20:04:35
	InsureStartTime *string `json:"insure_start_time,omitempty" xml:"insure_start_time,omitempty"`
	// 2024-12-24 20:04:35
	InsureEndTime *string `json:"insure_end_time,omitempty" xml:"insure_end_time,omitempty"`
	// 投保金额（保额），单位分。100代表1元
	InsureAmount *string `json:"insure_amount,omitempty" xml:"insure_amount,omitempty"`
	// 投保费用（保费），单位分。100代表1元
	InsurePremium *string `json:"insure_premium,omitempty" xml:"insure_premium,omitempty"`
	// 电子保单下载链接
	PolicyUrl *string `json:"policy_url,omitempty" xml:"policy_url,omitempty"`
	// 验真码
	ValidateCode *string `json:"validate_code,omitempty" xml:"validate_code,omitempty"`
}

func (s QueryInsureResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInsureResponse) GoString() string {
	return s.String()
}

func (s *QueryInsureResponse) SetReqMsgId(v string) *QueryInsureResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInsureResponse) SetResultCode(v string) *QueryInsureResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInsureResponse) SetResultMsg(v string) *QueryInsureResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInsureResponse) SetOrderId(v string) *QueryInsureResponse {
	s.OrderId = &v
	return s
}

func (s *QueryInsureResponse) SetInsureId(v string) *QueryInsureResponse {
	s.InsureId = &v
	return s
}

func (s *QueryInsureResponse) SetStatus(v string) *QueryInsureResponse {
	s.Status = &v
	return s
}

func (s *QueryInsureResponse) SetProductName(v string) *QueryInsureResponse {
	s.ProductName = &v
	return s
}

func (s *QueryInsureResponse) SetInsureStartTime(v string) *QueryInsureResponse {
	s.InsureStartTime = &v
	return s
}

func (s *QueryInsureResponse) SetInsureEndTime(v string) *QueryInsureResponse {
	s.InsureEndTime = &v
	return s
}

func (s *QueryInsureResponse) SetInsureAmount(v string) *QueryInsureResponse {
	s.InsureAmount = &v
	return s
}

func (s *QueryInsureResponse) SetInsurePremium(v string) *QueryInsureResponse {
	s.InsurePremium = &v
	return s
}

func (s *QueryInsureResponse) SetPolicyUrl(v string) *QueryInsureResponse {
	s.PolicyUrl = &v
	return s
}

func (s *QueryInsureResponse) SetValidateCode(v string) *QueryInsureResponse {
	s.ValidateCode = &v
	return s
}

type RetryInsurePayRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户的订单号，后续用作和保单结果交互
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"0"`
	// 保险公司产品（险种）类型
	InsureProductType *string `json:"insure_product_type,omitempty" xml:"insure_product_type,omitempty" require:"true" maxLength:"64" minLength:"0"`
}

func (s RetryInsurePayRequest) String() string {
	return tea.Prettify(s)
}

func (s RetryInsurePayRequest) GoString() string {
	return s.String()
}

func (s *RetryInsurePayRequest) SetAuthToken(v string) *RetryInsurePayRequest {
	s.AuthToken = &v
	return s
}

func (s *RetryInsurePayRequest) SetProductInstanceId(v string) *RetryInsurePayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RetryInsurePayRequest) SetOrderId(v string) *RetryInsurePayRequest {
	s.OrderId = &v
	return s
}

func (s *RetryInsurePayRequest) SetInsureProductType(v string) *RetryInsurePayRequest {
	s.InsureProductType = &v
	return s
}

type RetryInsurePayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RetryInsurePayResponse) String() string {
	return tea.Prettify(s)
}

func (s RetryInsurePayResponse) GoString() string {
	return s.String()
}

func (s *RetryInsurePayResponse) SetReqMsgId(v string) *RetryInsurePayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RetryInsurePayResponse) SetResultCode(v string) *RetryInsurePayResponse {
	s.ResultCode = &v
	return s
}

func (s *RetryInsurePayResponse) SetResultMsg(v string) *RetryInsurePayResponse {
	s.ResultMsg = &v
	return s
}

type RegisterMerchantexpandMerchantRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 公司信息
	CompanyInfo *CompanyInfo `json:"company_info,omitempty" xml:"company_info,omitempty" require:"true"`
	// 法人信息
	LegalInfo *LegalInfo `json:"legal_info,omitempty" xml:"legal_info,omitempty" require:"true"`
	// 应用信息
	ApplicationInfo *ApplicationInfo `json:"application_info,omitempty" xml:"application_info,omitempty" require:"true"`
	// 进件模式 DIRECT(直连进件) AGENT(代理进件)
	ExpandMode *string `json:"expand_mode,omitempty" xml:"expand_mode,omitempty" require:"true"`
	// expand_mode=_AGENT_ 必填
	SubTenantId *string `json:"sub_tenant_id,omitempty" xml:"sub_tenant_id,omitempty"`
}

func (s RegisterMerchantexpandMerchantRequest) String() string {
	return tea.Prettify(s)
}

func (s RegisterMerchantexpandMerchantRequest) GoString() string {
	return s.String()
}

func (s *RegisterMerchantexpandMerchantRequest) SetAuthToken(v string) *RegisterMerchantexpandMerchantRequest {
	s.AuthToken = &v
	return s
}

func (s *RegisterMerchantexpandMerchantRequest) SetProductInstanceId(v string) *RegisterMerchantexpandMerchantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RegisterMerchantexpandMerchantRequest) SetCompanyInfo(v *CompanyInfo) *RegisterMerchantexpandMerchantRequest {
	s.CompanyInfo = v
	return s
}

func (s *RegisterMerchantexpandMerchantRequest) SetLegalInfo(v *LegalInfo) *RegisterMerchantexpandMerchantRequest {
	s.LegalInfo = v
	return s
}

func (s *RegisterMerchantexpandMerchantRequest) SetApplicationInfo(v *ApplicationInfo) *RegisterMerchantexpandMerchantRequest {
	s.ApplicationInfo = v
	return s
}

func (s *RegisterMerchantexpandMerchantRequest) SetExpandMode(v string) *RegisterMerchantexpandMerchantRequest {
	s.ExpandMode = &v
	return s
}

func (s *RegisterMerchantexpandMerchantRequest) SetSubTenantId(v string) *RegisterMerchantexpandMerchantRequest {
	s.SubTenantId = &v
	return s
}

type RegisterMerchantexpandMerchantResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 进件流水号
	PayExpandId *string `json:"pay_expand_id,omitempty" xml:"pay_expand_id,omitempty"`
}

func (s RegisterMerchantexpandMerchantResponse) String() string {
	return tea.Prettify(s)
}

func (s RegisterMerchantexpandMerchantResponse) GoString() string {
	return s.String()
}

func (s *RegisterMerchantexpandMerchantResponse) SetReqMsgId(v string) *RegisterMerchantexpandMerchantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RegisterMerchantexpandMerchantResponse) SetResultCode(v string) *RegisterMerchantexpandMerchantResponse {
	s.ResultCode = &v
	return s
}

func (s *RegisterMerchantexpandMerchantResponse) SetResultMsg(v string) *RegisterMerchantexpandMerchantResponse {
	s.ResultMsg = &v
	return s
}

func (s *RegisterMerchantexpandMerchantResponse) SetPayExpandId(v string) *RegisterMerchantexpandMerchantResponse {
	s.PayExpandId = &v
	return s
}

type UploadMerchantexpandFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件名称 包含后缀
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// ● BUSINESS_LICENSE 营业执照 ● CARD_FRONT 身份证正面 ● CARD_BACK 身份证反面 ● SPLITTING 分账
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
}

func (s UploadMerchantexpandFileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadMerchantexpandFileRequest) GoString() string {
	return s.String()
}

func (s *UploadMerchantexpandFileRequest) SetAuthToken(v string) *UploadMerchantexpandFileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadMerchantexpandFileRequest) SetProductInstanceId(v string) *UploadMerchantexpandFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadMerchantexpandFileRequest) SetFileName(v string) *UploadMerchantexpandFileRequest {
	s.FileName = &v
	return s
}

func (s *UploadMerchantexpandFileRequest) SetBizScene(v string) *UploadMerchantexpandFileRequest {
	s.BizScene = &v
	return s
}

type UploadMerchantexpandFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 临时上传文件地址
	UploadUrl *string `json:"upload_url,omitempty" xml:"upload_url,omitempty"`
	// 文件key
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty"`
}

func (s UploadMerchantexpandFileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadMerchantexpandFileResponse) GoString() string {
	return s.String()
}

func (s *UploadMerchantexpandFileResponse) SetReqMsgId(v string) *UploadMerchantexpandFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadMerchantexpandFileResponse) SetResultCode(v string) *UploadMerchantexpandFileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadMerchantexpandFileResponse) SetResultMsg(v string) *UploadMerchantexpandFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadMerchantexpandFileResponse) SetUploadUrl(v string) *UploadMerchantexpandFileResponse {
	s.UploadUrl = &v
	return s
}

func (s *UploadMerchantexpandFileResponse) SetFileKey(v string) *UploadMerchantexpandFileResponse {
	s.FileKey = &v
	return s
}

type QueryMerchantexpandMerchantRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户入驻返回的进件编号 expand_mode=AGENT必填
	PayExpandId *string `json:"pay_expand_id,omitempty" xml:"pay_expand_id,omitempty" require:"true"`
}

func (s QueryMerchantexpandMerchantRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMerchantexpandMerchantRequest) GoString() string {
	return s.String()
}

func (s *QueryMerchantexpandMerchantRequest) SetAuthToken(v string) *QueryMerchantexpandMerchantRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMerchantexpandMerchantRequest) SetProductInstanceId(v string) *QueryMerchantexpandMerchantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMerchantexpandMerchantRequest) SetPayExpandId(v string) *QueryMerchantexpandMerchantRequest {
	s.PayExpandId = &v
	return s
}

type QueryMerchantexpandMerchantResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商户入驻状态
	// INIT 入驻中
	// SUCCESS 入驻成功
	// FAIL 入驻失败
	// MERCHANT_CONFIRM 待商户B站确认
	// SUB_MERCHANT_CREDIT 二级户商户签约中
	EnrollmentStatus *string `json:"enrollment_status,omitempty" xml:"enrollment_status,omitempty"`
	// 入驻失败原因
	FailReason *string `json:"fail_reason,omitempty" xml:"fail_reason,omitempty"`
	// 商户进件流程待办事件跳转链接
	PendingEventLink *string `json:"pending_event_link,omitempty" xml:"pending_event_link,omitempty"`
}

func (s QueryMerchantexpandMerchantResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMerchantexpandMerchantResponse) GoString() string {
	return s.String()
}

func (s *QueryMerchantexpandMerchantResponse) SetReqMsgId(v string) *QueryMerchantexpandMerchantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMerchantexpandMerchantResponse) SetResultCode(v string) *QueryMerchantexpandMerchantResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMerchantexpandMerchantResponse) SetResultMsg(v string) *QueryMerchantexpandMerchantResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMerchantexpandMerchantResponse) SetEnrollmentStatus(v string) *QueryMerchantexpandMerchantResponse {
	s.EnrollmentStatus = &v
	return s
}

func (s *QueryMerchantexpandMerchantResponse) SetFailReason(v string) *QueryMerchantexpandMerchantResponse {
	s.FailReason = &v
	return s
}

func (s *QueryMerchantexpandMerchantResponse) SetPendingEventLink(v string) *QueryMerchantexpandMerchantResponse {
	s.PendingEventLink = &v
	return s
}

type UpdateMerchantexpandMerchantRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 公司信息
	CompanyInfo *CompanyInfoUpdate `json:"company_info,omitempty" xml:"company_info,omitempty" require:"true"`
	// 法人信息
	LegalInfo *LegalInfoUpdate `json:"legal_info,omitempty" xml:"legal_info,omitempty" require:"true"`
	// 应用信息
	ApplicationInfo *ApplicationInfoUpdate `json:"application_info,omitempty" xml:"application_info,omitempty" require:"true"`
	// 进件流水号
	PayExpandId *string `json:"pay_expand_id,omitempty" xml:"pay_expand_id,omitempty" require:"true"`
	// 社会统一信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
}

func (s UpdateMerchantexpandMerchantRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateMerchantexpandMerchantRequest) GoString() string {
	return s.String()
}

func (s *UpdateMerchantexpandMerchantRequest) SetAuthToken(v string) *UpdateMerchantexpandMerchantRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateMerchantexpandMerchantRequest) SetProductInstanceId(v string) *UpdateMerchantexpandMerchantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateMerchantexpandMerchantRequest) SetCompanyInfo(v *CompanyInfoUpdate) *UpdateMerchantexpandMerchantRequest {
	s.CompanyInfo = v
	return s
}

func (s *UpdateMerchantexpandMerchantRequest) SetLegalInfo(v *LegalInfoUpdate) *UpdateMerchantexpandMerchantRequest {
	s.LegalInfo = v
	return s
}

func (s *UpdateMerchantexpandMerchantRequest) SetApplicationInfo(v *ApplicationInfoUpdate) *UpdateMerchantexpandMerchantRequest {
	s.ApplicationInfo = v
	return s
}

func (s *UpdateMerchantexpandMerchantRequest) SetPayExpandId(v string) *UpdateMerchantexpandMerchantRequest {
	s.PayExpandId = &v
	return s
}

func (s *UpdateMerchantexpandMerchantRequest) SetMerchantId(v string) *UpdateMerchantexpandMerchantRequest {
	s.MerchantId = &v
	return s
}

type UpdateMerchantexpandMerchantResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 进件流水号
	PayExpandId *string `json:"pay_expand_id,omitempty" xml:"pay_expand_id,omitempty"`
}

func (s UpdateMerchantexpandMerchantResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateMerchantexpandMerchantResponse) GoString() string {
	return s.String()
}

func (s *UpdateMerchantexpandMerchantResponse) SetReqMsgId(v string) *UpdateMerchantexpandMerchantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateMerchantexpandMerchantResponse) SetResultCode(v string) *UpdateMerchantexpandMerchantResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateMerchantexpandMerchantResponse) SetResultMsg(v string) *UpdateMerchantexpandMerchantResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateMerchantexpandMerchantResponse) SetPayExpandId(v string) *UpdateMerchantexpandMerchantResponse {
	s.PayExpandId = &v
	return s
}

type AddMerchantexpandDividerelationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 被分账方社会统一信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 分账方信息，最多支持10组
	DivideBindingTransInInfoList []*DivideBindingTransInInfo `json:"divide_binding_trans_in_info_list,omitempty" xml:"divide_binding_trans_in_info_list,omitempty" require:"true" type:"Repeated"`
	// 分账比例上限
	DivideRadio *string `json:"divide_radio,omitempty" xml:"divide_radio,omitempty"`
}

func (s AddMerchantexpandDividerelationRequest) String() string {
	return tea.Prettify(s)
}

func (s AddMerchantexpandDividerelationRequest) GoString() string {
	return s.String()
}

func (s *AddMerchantexpandDividerelationRequest) SetAuthToken(v string) *AddMerchantexpandDividerelationRequest {
	s.AuthToken = &v
	return s
}

func (s *AddMerchantexpandDividerelationRequest) SetProductInstanceId(v string) *AddMerchantexpandDividerelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddMerchantexpandDividerelationRequest) SetMerchantId(v string) *AddMerchantexpandDividerelationRequest {
	s.MerchantId = &v
	return s
}

func (s *AddMerchantexpandDividerelationRequest) SetDivideBindingTransInInfoList(v []*DivideBindingTransInInfo) *AddMerchantexpandDividerelationRequest {
	s.DivideBindingTransInInfoList = v
	return s
}

func (s *AddMerchantexpandDividerelationRequest) SetDivideRadio(v string) *AddMerchantexpandDividerelationRequest {
	s.DivideRadio = &v
	return s
}

type AddMerchantexpandDividerelationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AddMerchantexpandDividerelationResponse) String() string {
	return tea.Prettify(s)
}

func (s AddMerchantexpandDividerelationResponse) GoString() string {
	return s.String()
}

func (s *AddMerchantexpandDividerelationResponse) SetReqMsgId(v string) *AddMerchantexpandDividerelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddMerchantexpandDividerelationResponse) SetResultCode(v string) *AddMerchantexpandDividerelationResponse {
	s.ResultCode = &v
	return s
}

func (s *AddMerchantexpandDividerelationResponse) SetResultMsg(v string) *AddMerchantexpandDividerelationResponse {
	s.ResultMsg = &v
	return s
}

type QueryMerchantexpandDividerelationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 被分账方社会统一信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
}

func (s QueryMerchantexpandDividerelationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMerchantexpandDividerelationRequest) GoString() string {
	return s.String()
}

func (s *QueryMerchantexpandDividerelationRequest) SetAuthToken(v string) *QueryMerchantexpandDividerelationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMerchantexpandDividerelationRequest) SetProductInstanceId(v string) *QueryMerchantexpandDividerelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMerchantexpandDividerelationRequest) SetMerchantId(v string) *QueryMerchantexpandDividerelationRequest {
	s.MerchantId = &v
	return s
}

type QueryMerchantexpandDividerelationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分账绑定关系支付宝pid
	AlipayPidList []*string `json:"alipay_pid_list,omitempty" xml:"alipay_pid_list,omitempty" type:"Repeated"`
	// 分账比例上限
	DivideRadio *string `json:"divide_radio,omitempty" xml:"divide_radio,omitempty"`
}

func (s QueryMerchantexpandDividerelationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMerchantexpandDividerelationResponse) GoString() string {
	return s.String()
}

func (s *QueryMerchantexpandDividerelationResponse) SetReqMsgId(v string) *QueryMerchantexpandDividerelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMerchantexpandDividerelationResponse) SetResultCode(v string) *QueryMerchantexpandDividerelationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMerchantexpandDividerelationResponse) SetResultMsg(v string) *QueryMerchantexpandDividerelationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMerchantexpandDividerelationResponse) SetAlipayPidList(v []*string) *QueryMerchantexpandDividerelationResponse {
	s.AlipayPidList = v
	return s
}

func (s *QueryMerchantexpandDividerelationResponse) SetDivideRadio(v string) *QueryMerchantexpandDividerelationResponse {
	s.DivideRadio = &v
	return s
}

type CreateRealpersonFacevrfRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 实人认证方案枚举
	// APP（客户端android/ios方案）
	// H5（网页）
	// ZFB（支付宝客户端H5方案）
	SolutionType *string `json:"solution_type,omitempty" xml:"solution_type,omitempty" require:"true"`
	// 真实姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 身份信息来源类型
	// IDENTITY_CARD（身份证）
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 【solution_type=ZFB使用】
	// reserve（保存活体人脸 默认值）
	// never（不保存活体人脸）
	FaceReserveStrategy *string `json:"face_reserve_strategy,omitempty" xml:"face_reserve_strategy,omitempty"`
	// 【solution_type=ZFB使用】
	// 认证成功后需要跳转的地址
	ReturnUrl *string `json:"return_url,omitempty" xml:"return_url,omitempty"`
}

func (s CreateRealpersonFacevrfRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRealpersonFacevrfRequest) GoString() string {
	return s.String()
}

func (s *CreateRealpersonFacevrfRequest) SetAuthToken(v string) *CreateRealpersonFacevrfRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRealpersonFacevrfRequest) SetProductInstanceId(v string) *CreateRealpersonFacevrfRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateRealpersonFacevrfRequest) SetSolutionType(v string) *CreateRealpersonFacevrfRequest {
	s.SolutionType = &v
	return s
}

func (s *CreateRealpersonFacevrfRequest) SetCertName(v string) *CreateRealpersonFacevrfRequest {
	s.CertName = &v
	return s
}

func (s *CreateRealpersonFacevrfRequest) SetCertNo(v string) *CreateRealpersonFacevrfRequest {
	s.CertNo = &v
	return s
}

func (s *CreateRealpersonFacevrfRequest) SetCertType(v string) *CreateRealpersonFacevrfRequest {
	s.CertType = &v
	return s
}

func (s *CreateRealpersonFacevrfRequest) SetFaceReserveStrategy(v string) *CreateRealpersonFacevrfRequest {
	s.FaceReserveStrategy = &v
	return s
}

func (s *CreateRealpersonFacevrfRequest) SetReturnUrl(v string) *CreateRealpersonFacevrfRequest {
	s.ReturnUrl = &v
	return s
}

type CreateRealpersonFacevrfResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求唯一ID标识，为空则是异常
	RealPersonVerificationCode *string `json:"real_person_verification_code,omitempty" xml:"real_person_verification_code,omitempty"`
	// 【solution_type=H5 | ZFB返回】
	// 人脸核身url地址
	WebUrl *string `json:"web_url,omitempty" xml:"web_url,omitempty"`
}

func (s CreateRealpersonFacevrfResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRealpersonFacevrfResponse) GoString() string {
	return s.String()
}

func (s *CreateRealpersonFacevrfResponse) SetReqMsgId(v string) *CreateRealpersonFacevrfResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRealpersonFacevrfResponse) SetResultCode(v string) *CreateRealpersonFacevrfResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRealpersonFacevrfResponse) SetResultMsg(v string) *CreateRealpersonFacevrfResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateRealpersonFacevrfResponse) SetRealPersonVerificationCode(v string) *CreateRealpersonFacevrfResponse {
	s.RealPersonVerificationCode = &v
	return s
}

func (s *CreateRealpersonFacevrfResponse) SetWebUrl(v string) *CreateRealpersonFacevrfResponse {
	s.WebUrl = &v
	return s
}

type QueryRealpersonFacevrfRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 可信实人认证的唯一标识
	RealPersonVerificationCode *string `json:"real_person_verification_code,omitempty" xml:"real_person_verification_code,omitempty" require:"true"`
}

func (s QueryRealpersonFacevrfRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRealpersonFacevrfRequest) GoString() string {
	return s.String()
}

func (s *QueryRealpersonFacevrfRequest) SetAuthToken(v string) *QueryRealpersonFacevrfRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRealpersonFacevrfRequest) SetProductInstanceId(v string) *QueryRealpersonFacevrfRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRealpersonFacevrfRequest) SetRealPersonVerificationCode(v string) *QueryRealpersonFacevrfRequest {
	s.RealPersonVerificationCode = &v
	return s
}

type QueryRealpersonFacevrfResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实人认证结果
	// PROCESSING（初始化）
	// SUCCESS（认证通过）FAIL（认证不通过）
	CertifyState *string `json:"certify_state,omitempty" xml:"certify_state,omitempty"`
	// 【solution_type=H5 | APP 返回】
	// 本次认证是否存在安全风险
	// true(检测到安全风险)
	// false(未检测到安全风险)
	AttackFlag *string `json:"attack_flag,omitempty" xml:"attack_flag,omitempty"`
	// 【solution_type=H5 | APP 返回】
	// base64过后的二值化图片
	AlivePhoto *string `json:"alive_photo,omitempty" xml:"alive_photo,omitempty"`
}

func (s QueryRealpersonFacevrfResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRealpersonFacevrfResponse) GoString() string {
	return s.String()
}

func (s *QueryRealpersonFacevrfResponse) SetReqMsgId(v string) *QueryRealpersonFacevrfResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRealpersonFacevrfResponse) SetResultCode(v string) *QueryRealpersonFacevrfResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRealpersonFacevrfResponse) SetResultMsg(v string) *QueryRealpersonFacevrfResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRealpersonFacevrfResponse) SetCertifyState(v string) *QueryRealpersonFacevrfResponse {
	s.CertifyState = &v
	return s
}

func (s *QueryRealpersonFacevrfResponse) SetAttackFlag(v string) *QueryRealpersonFacevrfResponse {
	s.AttackFlag = &v
	return s
}

func (s *QueryRealpersonFacevrfResponse) SetAlivePhoto(v string) *QueryRealpersonFacevrfResponse {
	s.AlivePhoto = &v
	return s
}

type QueryRiskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 枚举值：蚁盾版、智租版、旗舰版，蚁盾版代表仅调用蚁盾风控，智租版代表仅调用小程序云风控，旗舰版代表调用蚁盾+旗舰版风控接口
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true"`
	// 用户姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true" maxLength:"2000"`
	// 用户证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 用户手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 支付宝账户 UserId，智租版可选
	AlipayUserId *string `json:"alipay_user_id,omitempty" xml:"alipay_user_id,omitempty" maxLength:"20"`
	// 下单渠道，智租版必选。枚举值：支付宝-ALIPAY；微信-WECHAT；独立APP-APP；抖音-DOUYIN；美团-MEITUAN；其他:-OTHER
	Source *string `json:"source,omitempty" xml:"source,omitempty" maxLength:"10"`
	// 风险业务场景，智租版选填。默认值：PRE_RENT。
	// PRE_RENT - 3c租赁；PRE_RENT_3C - 3c租赁定制；PRE_RENT_PET - 宠物；PRE_RENT_EDU - 教培；PRE_RENT_BEAUTY - 美业；
	RiskBizScene *string `json:"risk_biz_scene,omitempty" xml:"risk_biz_scene,omitempty" maxLength:"100" minLength:"1"`
	// 商品详情，智租版可选
	ItemDetail *ItemDetail `json:"item_detail,omitempty" xml:"item_detail,omitempty"`
	// 价格详情，智租版可选
	PriceDetail *PriceDetail `json:"price_detail,omitempty" xml:"price_detail,omitempty"`
	// 物流信息，智租版可选
	DeliveryDetail *DeliveryDetail `json:"delivery_detail,omitempty" xml:"delivery_detail,omitempty"`
}

func (s QueryRiskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRiskRequest) GoString() string {
	return s.String()
}

func (s *QueryRiskRequest) SetAuthToken(v string) *QueryRiskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRiskRequest) SetProductInstanceId(v string) *QueryRiskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRiskRequest) SetProductName(v string) *QueryRiskRequest {
	s.ProductName = &v
	return s
}

func (s *QueryRiskRequest) SetUserName(v string) *QueryRiskRequest {
	s.UserName = &v
	return s
}

func (s *QueryRiskRequest) SetCertNo(v string) *QueryRiskRequest {
	s.CertNo = &v
	return s
}

func (s *QueryRiskRequest) SetMobile(v string) *QueryRiskRequest {
	s.Mobile = &v
	return s
}

func (s *QueryRiskRequest) SetAlipayUserId(v string) *QueryRiskRequest {
	s.AlipayUserId = &v
	return s
}

func (s *QueryRiskRequest) SetSource(v string) *QueryRiskRequest {
	s.Source = &v
	return s
}

func (s *QueryRiskRequest) SetRiskBizScene(v string) *QueryRiskRequest {
	s.RiskBizScene = &v
	return s
}

func (s *QueryRiskRequest) SetItemDetail(v *ItemDetail) *QueryRiskRequest {
	s.ItemDetail = v
	return s
}

func (s *QueryRiskRequest) SetPriceDetail(v *PriceDetail) *QueryRiskRequest {
	s.PriceDetail = v
	return s
}

func (s *QueryRiskRequest) SetDeliveryDetail(v *DeliveryDetail) *QueryRiskRequest {
	s.DeliveryDetail = v
	return s
}

type QueryRiskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模型结果详情
	Models []*RiskModel `json:"models,omitempty" xml:"models,omitempty" type:"Repeated"`
	// 智租风控-风控模型结果
	AppletModel *AppletRiskModel `json:"applet_model,omitempty" xml:"applet_model,omitempty"`
}

func (s QueryRiskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRiskResponse) GoString() string {
	return s.String()
}

func (s *QueryRiskResponse) SetReqMsgId(v string) *QueryRiskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRiskResponse) SetResultCode(v string) *QueryRiskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRiskResponse) SetResultMsg(v string) *QueryRiskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRiskResponse) SetModels(v []*RiskModel) *QueryRiskResponse {
	s.Models = v
	return s
}

func (s *QueryRiskResponse) SetAppletModel(v *AppletRiskModel) *QueryRiskResponse {
	s.AppletModel = v
	return s
}

type QueryRiskGoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 风险类型。枚举值：MARKETING_PURCHASE_COMMON 营销抢购风险识别；INDUSTRY_SCALPER_COMMON 行业黄牛风险识别；MARKETING_AWARDING_COMMON 营销发奖风险识别；INDUSTRY_FARMING_COMMON 行业刷单风险识别；INDUSTRY_BADDEBT_COMMON 履约坏账风险识别
	RiskType *string `json:"risk_type,omitempty" xml:"risk_type,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 单次请求流水号，需要保证唯一
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true" maxLength:"32" minLength:"10"`
	// 调用行业，枚举值：
	// insurance 保险；retail 零售；finance 金融行业；logistics 物流行业；city_services 城市服务；medical 医疗服务；digital_media 数媒行业；recycle 回收行业；payment 缴费行业；vehicle 汽车；travel 旅游；air_travel 航旅行业；FMCG 快消零售；education 教育行业；fashion_retail 时尚零售；game_industry 文体行业；rental 租赁；advertisement 广告行业；restaurants 餐饮行业；ticket 票务行业；complexes 综合体行业
	BusinessCode *string `json:"business_code,omitempty" xml:"business_code,omitempty" require:"true" maxLength:"30" minLength:"1"`
	// 风险咨询对应的自身业务场景/环节，枚举值：
	// register 注册；order 下单；payment 支付；login 登录；offline_query 离线查询；inquery 查询；reserve 预约；invitation 邀请；other 其他
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 支付宝用户 2088 账号
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" maxLength:"50" minLength:"1"`
	// 支付宝用户 open_id 账号。需要注意，user_id 和 open_id 不可同时为空，同时传入时，以 user_id 为准
	OpenId *string `json:"open_id,omitempty" xml:"open_id,omitempty" maxLength:"128" minLength:"1"`
	// 支付宝商家 pid，如果风险咨询对象是支付宝商家，则填写pid
	MerPid *string `json:"mer_pid,omitempty" xml:"mer_pid,omitempty" maxLength:"50" minLength:"1"`
	// 手机号码，用于直接输入风险咨询对象的手机号码
	MobileNo *string `json:"mobile_no,omitempty" xml:"mobile_no,omitempty" maxLength:"50" minLength:"1"`
	// 身份证号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" maxLength:"50" minLength:"1"`
	// 账户登录 ip
	Ip *string `json:"ip,omitempty" xml:"ip,omitempty" maxLength:"32" minLength:"1"`
	// 地理位置，用于输入用户产生交易时的地理位置信息
	Lbs *string `json:"lbs,omitempty" xml:"lbs,omitempty" maxLength:"50" minLength:"1"`
	// 咨询方类型，填写风险咨询中对应的商户或服务商对于蚂蚁的类型。枚举值：direct_isv 直连服务商；indirect_isv 间连服务商；unconn_isv 无关服务商；direct_mer 直连商户；indirect_mer 间连商户；unconn_mer 无关联商户；unknown 其他
	Role *string `json:"role,omitempty" xml:"role,omitempty" maxLength:"128" minLength:"1"`
	// 可填入活动id唯一值，或其他活动信息
	ActivityInfo *string `json:"activity_info,omitempty" xml:"activity_info,omitempty" maxLength:"100" minLength:"1"`
	// 营销抢购风险识别入参模型
	PurchaseQueryModel *PurchaseQueryModel `json:"purchase_query_model,omitempty" xml:"purchase_query_model,omitempty"`
	// 行业黄牛风险识别入参模型
	ScalperQueryModel *ScalperQueryModel `json:"scalper_query_model,omitempty" xml:"scalper_query_model,omitempty"`
	// 营销发奖风险识别入参模型
	AwardingQueryModel *AwardingQueryModel `json:"awarding_query_model,omitempty" xml:"awarding_query_model,omitempty"`
	// 行业刷单风险识别入参模型
	FarmingQueryModel *FarmingQueryModel `json:"farming_query_model,omitempty" xml:"farming_query_model,omitempty"`
	// 行业履约风险识别入参模型
	BaddebtQueryModel *BaddebtQueryModel `json:"baddebt_query_model,omitempty" xml:"baddebt_query_model,omitempty"`
	// 商户appId,当openId不为空时必填
	MerchantAppId *string `json:"merchant_app_id,omitempty" xml:"merchant_app_id,omitempty" minLength:"1"`
}

func (s QueryRiskGoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRiskGoRequest) GoString() string {
	return s.String()
}

func (s *QueryRiskGoRequest) SetAuthToken(v string) *QueryRiskGoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRiskGoRequest) SetProductInstanceId(v string) *QueryRiskGoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRiskGoRequest) SetRiskType(v string) *QueryRiskGoRequest {
	s.RiskType = &v
	return s
}

func (s *QueryRiskGoRequest) SetFlowId(v string) *QueryRiskGoRequest {
	s.FlowId = &v
	return s
}

func (s *QueryRiskGoRequest) SetBusinessCode(v string) *QueryRiskGoRequest {
	s.BusinessCode = &v
	return s
}

func (s *QueryRiskGoRequest) SetScene(v string) *QueryRiskGoRequest {
	s.Scene = &v
	return s
}

func (s *QueryRiskGoRequest) SetUserId(v string) *QueryRiskGoRequest {
	s.UserId = &v
	return s
}

func (s *QueryRiskGoRequest) SetOpenId(v string) *QueryRiskGoRequest {
	s.OpenId = &v
	return s
}

func (s *QueryRiskGoRequest) SetMerPid(v string) *QueryRiskGoRequest {
	s.MerPid = &v
	return s
}

func (s *QueryRiskGoRequest) SetMobileNo(v string) *QueryRiskGoRequest {
	s.MobileNo = &v
	return s
}

func (s *QueryRiskGoRequest) SetCertNo(v string) *QueryRiskGoRequest {
	s.CertNo = &v
	return s
}

func (s *QueryRiskGoRequest) SetIp(v string) *QueryRiskGoRequest {
	s.Ip = &v
	return s
}

func (s *QueryRiskGoRequest) SetLbs(v string) *QueryRiskGoRequest {
	s.Lbs = &v
	return s
}

func (s *QueryRiskGoRequest) SetRole(v string) *QueryRiskGoRequest {
	s.Role = &v
	return s
}

func (s *QueryRiskGoRequest) SetActivityInfo(v string) *QueryRiskGoRequest {
	s.ActivityInfo = &v
	return s
}

func (s *QueryRiskGoRequest) SetPurchaseQueryModel(v *PurchaseQueryModel) *QueryRiskGoRequest {
	s.PurchaseQueryModel = v
	return s
}

func (s *QueryRiskGoRequest) SetScalperQueryModel(v *ScalperQueryModel) *QueryRiskGoRequest {
	s.ScalperQueryModel = v
	return s
}

func (s *QueryRiskGoRequest) SetAwardingQueryModel(v *AwardingQueryModel) *QueryRiskGoRequest {
	s.AwardingQueryModel = v
	return s
}

func (s *QueryRiskGoRequest) SetFarmingQueryModel(v *FarmingQueryModel) *QueryRiskGoRequest {
	s.FarmingQueryModel = v
	return s
}

func (s *QueryRiskGoRequest) SetBaddebtQueryModel(v *BaddebtQueryModel) *QueryRiskGoRequest {
	s.BaddebtQueryModel = v
	return s
}

func (s *QueryRiskGoRequest) SetMerchantAppId(v string) *QueryRiskGoRequest {
	s.MerchantAppId = &v
	return s
}

type QueryRiskGoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险查询结果
	Model *RiskGoModel `json:"model,omitempty" xml:"model,omitempty"`
}

func (s QueryRiskGoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRiskGoResponse) GoString() string {
	return s.String()
}

func (s *QueryRiskGoResponse) SetReqMsgId(v string) *QueryRiskGoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRiskGoResponse) SetResultCode(v string) *QueryRiskGoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRiskGoResponse) SetResultMsg(v string) *QueryRiskGoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRiskGoResponse) SetModel(v *RiskGoModel) *QueryRiskGoResponse {
	s.Model = v
	return s
}

type UploadInnerRiskcallRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 幂等id
	IdempotentId *string `json:"idempotent_id,omitempty" xml:"idempotent_id,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 商户的支付宝唯一id
	Pid *string `json:"pid,omitempty" xml:"pid,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 计量值
	ServiceAmount *int64 `json:"service_amount,omitempty" xml:"service_amount,omitempty" require:"true" minimum:"1"`
	// 上报的数据开始时间，格式 yyyy-MM-dd HH:mm:ss
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 上报的数据结束时间，格式 yyyy-MM-dd HH:mm:ss
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 支付宝开放平台购买的实例 id
	AlipayInstanceId *string `json:"alipay_instance_id,omitempty" xml:"alipay_instance_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 扩展参数
	// jsonString
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty" minLength:"1"`
}

func (s UploadInnerRiskcallRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadInnerRiskcallRequest) GoString() string {
	return s.String()
}

func (s *UploadInnerRiskcallRequest) SetAuthToken(v string) *UploadInnerRiskcallRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadInnerRiskcallRequest) SetProductInstanceId(v string) *UploadInnerRiskcallRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadInnerRiskcallRequest) SetIdempotentId(v string) *UploadInnerRiskcallRequest {
	s.IdempotentId = &v
	return s
}

func (s *UploadInnerRiskcallRequest) SetPid(v string) *UploadInnerRiskcallRequest {
	s.Pid = &v
	return s
}

func (s *UploadInnerRiskcallRequest) SetServiceAmount(v int64) *UploadInnerRiskcallRequest {
	s.ServiceAmount = &v
	return s
}

func (s *UploadInnerRiskcallRequest) SetStartTime(v string) *UploadInnerRiskcallRequest {
	s.StartTime = &v
	return s
}

func (s *UploadInnerRiskcallRequest) SetEndTime(v string) *UploadInnerRiskcallRequest {
	s.EndTime = &v
	return s
}

func (s *UploadInnerRiskcallRequest) SetAlipayInstanceId(v string) *UploadInnerRiskcallRequest {
	s.AlipayInstanceId = &v
	return s
}

func (s *UploadInnerRiskcallRequest) SetExtInfo(v string) *UploadInnerRiskcallRequest {
	s.ExtInfo = &v
	return s
}

type UploadInnerRiskcallResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 上报成功返回 true，否则返回 false
	Result *bool `json:"result,omitempty" xml:"result,omitempty"`
}

func (s UploadInnerRiskcallResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadInnerRiskcallResponse) GoString() string {
	return s.String()
}

func (s *UploadInnerRiskcallResponse) SetReqMsgId(v string) *UploadInnerRiskcallResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadInnerRiskcallResponse) SetResultCode(v string) *UploadInnerRiskcallResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadInnerRiskcallResponse) SetResultMsg(v string) *UploadInnerRiskcallResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadInnerRiskcallResponse) SetResult(v bool) *UploadInnerRiskcallResponse {
	s.Result = &v
	return s
}

type AllSignTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合同类型，如果不传则返回所有
	ContractType *string `json:"contract_type,omitempty" xml:"contract_type,omitempty"`
	// 商户统一社会信用代码，SIT环境，非融必填
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" maxLength:"42"`
	// 查询融资类型时，需要传入资方统一社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty"`
	// -FINANCE 融资
	// -NON_FINANCE 非融资
	FundType *string `json:"fund_type,omitempty" xml:"fund_type,omitempty"`
	// 模板id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty"`
}

func (s AllSignTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s AllSignTemplateRequest) GoString() string {
	return s.String()
}

func (s *AllSignTemplateRequest) SetAuthToken(v string) *AllSignTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *AllSignTemplateRequest) SetProductInstanceId(v string) *AllSignTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllSignTemplateRequest) SetContractType(v string) *AllSignTemplateRequest {
	s.ContractType = &v
	return s
}

func (s *AllSignTemplateRequest) SetMerchantId(v string) *AllSignTemplateRequest {
	s.MerchantId = &v
	return s
}

func (s *AllSignTemplateRequest) SetFundId(v string) *AllSignTemplateRequest {
	s.FundId = &v
	return s
}

func (s *AllSignTemplateRequest) SetFundType(v string) *AllSignTemplateRequest {
	s.FundType = &v
	return s
}

func (s *AllSignTemplateRequest) SetTemplateId(v string) *AllSignTemplateRequest {
	s.TemplateId = &v
	return s
}

type AllSignTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// List<JSONObject>格式内容
	TemplateList *string `json:"template_list,omitempty" xml:"template_list,omitempty"`
}

func (s AllSignTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s AllSignTemplateResponse) GoString() string {
	return s.String()
}

func (s *AllSignTemplateResponse) SetReqMsgId(v string) *AllSignTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllSignTemplateResponse) SetResultCode(v string) *AllSignTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *AllSignTemplateResponse) SetResultMsg(v string) *AllSignTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllSignTemplateResponse) SetTemplateList(v string) *AllSignTemplateResponse {
	s.TemplateList = &v
	return s
}

type SubmitSignFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// CRED_PSN_CH_IDCARD： 大陆身份证
	// CRED_PSN_CH_TWCARD：台湾来往大陆通行证
	// CRED_PSN_CH_MACAO"：澳门来往大陆通行证
	// CRED_PSN_CH_HONGKONG：香港来往大陆通行证
	// CRED_PSN_PASSPORT：护照
	UserIdType *string `json:"user_id_type,omitempty" xml:"user_id_type,omitempty" require:"true"`
	// 用户证件号，需要采用RSA加密传输
	UserIdNumber *string `json:"user_id_number,omitempty" xml:"user_id_number,omitempty" require:"true"`
	// 姓名，需要采用RSA加密传输
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 用户手机号，可不传；传的话需要采用RSA加密传输
	UserMobile *string `json:"user_mobile,omitempty" xml:"user_mobile,omitempty"`
	// 用户的电子邮箱，可不传；传的话需要采用RSA加密传输
	UserEmail *string `json:"user_email,omitempty" xml:"user_email,omitempty"`
	// 签署有效期，时间戳，例如：new Date().getTime()
	SignValidity *string `json:"sign_validity,omitempty" xml:"sign_validity,omitempty"`
	// 1-短信；2-邮件
	FlowNotifyType *string `json:"flow_notify_type,omitempty" xml:"flow_notify_type,omitempty"`
	// 业务场景，电子合同签署协议的时候的标题
	BusinessScene *string `json:"business_scene,omitempty" xml:"business_scene,omitempty" require:"true"`
	// 签署完成跳转链接
	SignedRedirectUrl *string `json:"signed_redirect_url,omitempty" xml:"signed_redirect_url,omitempty"`
	// 签署的电子合同模板信息，JSONArray格式，可以传入多个templateId和templateArgs。注意templateArgs的格式为key-value，其中key为模板文件中表单域的名称，value为需要填充的值。
	TemplateList *string `json:"template_list,omitempty" xml:"template_list,omitempty" require:"true"`
	// 用户的支付宝uid
	AlipayUserId *string `json:"alipay_user_id,omitempty" xml:"alipay_user_id,omitempty" maxLength:"20" minLength:"12"`
	// 公司名称
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty" require:"true" maxLength:"256" minLength:"2"`
	// 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
	MerchantTag *string `json:"merchant_tag,omitempty" xml:"merchant_tag,omitempty" maxLength:"32" minLength:"0"`
	// 商户需要盖的印章ID
	MerchantSealId *string `json:"merchant_seal_id,omitempty" xml:"merchant_seal_id,omitempty"`
	// 电子合同签署顺序，如果只有1方企业签署，传入1即可。如果是多方，并且需要设置签署顺序，则需要将这个值以及thirdSigner中的signOrder做一个签署顺序。
	MerchantSignOrder *int64 `json:"merchant_sign_order,omitempty" xml:"merchant_sign_order,omitempty" maximum:"10000" minimum:"1"`
	// CRED_ORG_USCC：统一社会信用代码，CRED_ORG_REGCODE：工商注册号，只支持这两个值
	MerchantIdType *string `json:"merchant_id_type,omitempty" xml:"merchant_id_type,omitempty" require:"true" maxLength:"20" minLength:"6"`
	// 商户证件号，需要采用RSA加密传输
	MerchantIdNumber *string `json:"merchant_id_number,omitempty" xml:"merchant_id_number,omitempty" require:"true" maxLength:"1000" minLength:"4"`
	// 法人姓名，需要RSA加密传输
	MerchantLegalName *string `json:"merchant_legal_name,omitempty" xml:"merchant_legal_name,omitempty"`
	// 法人证件号，需要采用RSA加密传输
	MerchantLegalIdNumber *string `json:"merchant_legal_id_number,omitempty" xml:"merchant_legal_id_number,omitempty"`
	// 除商户以外的第三方签署信息，需要通过此字段传入，需要使用JSONArray格式。注意其中orgIdNumber、orgLegalName、orgLegalIdNumber需要RSA加密。
	ThirdSigner *string `json:"third_signer,omitempty" xml:"third_signer,omitempty" minLength:"0"`
	// 支付宝用户 open_id
	UserOpenId *string `json:"user_open_id,omitempty" xml:"user_open_id,omitempty" maxLength:"64" minLength:"16"`
	// 商户支付宝应用 id
	MerchantAppId *string `json:"merchant_app_id,omitempty" xml:"merchant_app_id,omitempty" maxLength:"32"`
	// 用户类型，个人或企业，默认是个人
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty"`
	// (企业作为消费者时)公司名称
	UserOrgName *string `json:"user_org_name,omitempty" xml:"user_org_name,omitempty"`
	// (企业作为消费者时)公司证件类型
	UserOrgIdType *string `json:"user_org_id_type,omitempty" xml:"user_org_id_type,omitempty"`
	// (企业作为消费者时)公司证件号，无需加密
	UserOrgIdNumber *string `json:"user_org_id_number,omitempty" xml:"user_org_id_number,omitempty"`
	// 合并签署是否开启人脸识别（默认true-开启）,非合并签署无需设值
	NeedFace *bool `json:"need_face,omitempty" xml:"need_face,omitempty"`
}

func (s SubmitSignFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitSignFlowRequest) GoString() string {
	return s.String()
}

func (s *SubmitSignFlowRequest) SetAuthToken(v string) *SubmitSignFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitSignFlowRequest) SetProductInstanceId(v string) *SubmitSignFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitSignFlowRequest) SetOrderId(v string) *SubmitSignFlowRequest {
	s.OrderId = &v
	return s
}

func (s *SubmitSignFlowRequest) SetUserIdType(v string) *SubmitSignFlowRequest {
	s.UserIdType = &v
	return s
}

func (s *SubmitSignFlowRequest) SetUserIdNumber(v string) *SubmitSignFlowRequest {
	s.UserIdNumber = &v
	return s
}

func (s *SubmitSignFlowRequest) SetUserName(v string) *SubmitSignFlowRequest {
	s.UserName = &v
	return s
}

func (s *SubmitSignFlowRequest) SetUserMobile(v string) *SubmitSignFlowRequest {
	s.UserMobile = &v
	return s
}

func (s *SubmitSignFlowRequest) SetUserEmail(v string) *SubmitSignFlowRequest {
	s.UserEmail = &v
	return s
}

func (s *SubmitSignFlowRequest) SetSignValidity(v string) *SubmitSignFlowRequest {
	s.SignValidity = &v
	return s
}

func (s *SubmitSignFlowRequest) SetFlowNotifyType(v string) *SubmitSignFlowRequest {
	s.FlowNotifyType = &v
	return s
}

func (s *SubmitSignFlowRequest) SetBusinessScene(v string) *SubmitSignFlowRequest {
	s.BusinessScene = &v
	return s
}

func (s *SubmitSignFlowRequest) SetSignedRedirectUrl(v string) *SubmitSignFlowRequest {
	s.SignedRedirectUrl = &v
	return s
}

func (s *SubmitSignFlowRequest) SetTemplateList(v string) *SubmitSignFlowRequest {
	s.TemplateList = &v
	return s
}

func (s *SubmitSignFlowRequest) SetAlipayUserId(v string) *SubmitSignFlowRequest {
	s.AlipayUserId = &v
	return s
}

func (s *SubmitSignFlowRequest) SetMerchantName(v string) *SubmitSignFlowRequest {
	s.MerchantName = &v
	return s
}

func (s *SubmitSignFlowRequest) SetMerchantTag(v string) *SubmitSignFlowRequest {
	s.MerchantTag = &v
	return s
}

func (s *SubmitSignFlowRequest) SetMerchantSealId(v string) *SubmitSignFlowRequest {
	s.MerchantSealId = &v
	return s
}

func (s *SubmitSignFlowRequest) SetMerchantSignOrder(v int64) *SubmitSignFlowRequest {
	s.MerchantSignOrder = &v
	return s
}

func (s *SubmitSignFlowRequest) SetMerchantIdType(v string) *SubmitSignFlowRequest {
	s.MerchantIdType = &v
	return s
}

func (s *SubmitSignFlowRequest) SetMerchantIdNumber(v string) *SubmitSignFlowRequest {
	s.MerchantIdNumber = &v
	return s
}

func (s *SubmitSignFlowRequest) SetMerchantLegalName(v string) *SubmitSignFlowRequest {
	s.MerchantLegalName = &v
	return s
}

func (s *SubmitSignFlowRequest) SetMerchantLegalIdNumber(v string) *SubmitSignFlowRequest {
	s.MerchantLegalIdNumber = &v
	return s
}

func (s *SubmitSignFlowRequest) SetThirdSigner(v string) *SubmitSignFlowRequest {
	s.ThirdSigner = &v
	return s
}

func (s *SubmitSignFlowRequest) SetUserOpenId(v string) *SubmitSignFlowRequest {
	s.UserOpenId = &v
	return s
}

func (s *SubmitSignFlowRequest) SetMerchantAppId(v string) *SubmitSignFlowRequest {
	s.MerchantAppId = &v
	return s
}

func (s *SubmitSignFlowRequest) SetUserType(v string) *SubmitSignFlowRequest {
	s.UserType = &v
	return s
}

func (s *SubmitSignFlowRequest) SetUserOrgName(v string) *SubmitSignFlowRequest {
	s.UserOrgName = &v
	return s
}

func (s *SubmitSignFlowRequest) SetUserOrgIdType(v string) *SubmitSignFlowRequest {
	s.UserOrgIdType = &v
	return s
}

func (s *SubmitSignFlowRequest) SetUserOrgIdNumber(v string) *SubmitSignFlowRequest {
	s.UserOrgIdNumber = &v
	return s
}

func (s *SubmitSignFlowRequest) SetNeedFace(v bool) *SubmitSignFlowRequest {
	s.NeedFace = &v
	return s
}

type SubmitSignFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署合同单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty"`
	// 电子签署流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 签署用户ID
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 签署信息，包括短链接、长链接、小程序链接等。
	SignInfo *string `json:"sign_info,omitempty" xml:"sign_info,omitempty"`
}

func (s SubmitSignFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitSignFlowResponse) GoString() string {
	return s.String()
}

func (s *SubmitSignFlowResponse) SetReqMsgId(v string) *SubmitSignFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitSignFlowResponse) SetResultCode(v string) *SubmitSignFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitSignFlowResponse) SetResultMsg(v string) *SubmitSignFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitSignFlowResponse) SetSignNo(v string) *SubmitSignFlowResponse {
	s.SignNo = &v
	return s
}

func (s *SubmitSignFlowResponse) SetFlowId(v string) *SubmitSignFlowResponse {
	s.FlowId = &v
	return s
}

func (s *SubmitSignFlowResponse) SetAccountId(v string) *SubmitSignFlowResponse {
	s.AccountId = &v
	return s
}

func (s *SubmitSignFlowResponse) SetSignInfo(v string) *SubmitSignFlowResponse {
	s.SignInfo = &v
	return s
}

type GetSignFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署合同单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true"`
}

func (s GetSignFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s GetSignFlowRequest) GoString() string {
	return s.String()
}

func (s *GetSignFlowRequest) SetAuthToken(v string) *GetSignFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *GetSignFlowRequest) SetProductInstanceId(v string) *GetSignFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetSignFlowRequest) SetSignNo(v string) *GetSignFlowRequest {
	s.SignNo = &v
	return s
}

type GetSignFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署合同单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty"`
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 签署用户ID
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 状态：DRAFT - 草稿； SIGNING - 签署中； FINISH - 签署完成；UNDO - 撤销； TERMINATE - 终止； EXPIRE - 过期； REJECTED - 拒签； CANCELLED - 解约
	//
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 签署流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 签署文件列表，参考：
	// _[{"fileItemNo":"10090801000001699892007791144960","agreementType":"COMMON","fileName":"xxx合同","fileSize":228530,"signAccountId":"fe2eb3814c4e49edba2bc012f790771f","fileId":"2c7684461a0f4d33bc02f6d77f7b3937","downloadUrl":"https://dev.oss-cn-shanghai.aliyuncs.com/ag/ord/xxx/16939683744483057_%E6%B5%8B%E8%AF%95%E6%A8%A1%E6%9D%BF%E4%B9%8B%E5%8D%8F%E8%AE%AE%E7%AD%BE%E7%BD%B2%E8%AF%81%E6%98%8E.pdf?Expires=1693971989&OSSAccessKeyId=LTAI5tR3hHiaXPAh8YsY9Dce&Signature=i%2FfAgDem33guI%2F0KjIFj24XZNCc%3D"}]_
	DocList *string `json:"doc_list,omitempty" xml:"doc_list,omitempty"`
	// 业务场景，主要用于签署合同的标题描述
	BusinessScene *string `json:"business_scene,omitempty" xml:"business_scene,omitempty"`
	// 签署合同中的订单的uid。
	AlipayUserId *string `json:"alipay_user_id,omitempty" xml:"alipay_user_id,omitempty"`
	// 签署扩展信息，用于获取签署链接等。JSON格式字符串。
	SignInfo *string `json:"sign_info,omitempty" xml:"sign_info,omitempty"`
	// 发起人账户id
	InitiatorAccountId *string `json:"initiator_account_id,omitempty" xml:"initiator_account_id,omitempty"`
}

func (s GetSignFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s GetSignFlowResponse) GoString() string {
	return s.String()
}

func (s *GetSignFlowResponse) SetReqMsgId(v string) *GetSignFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetSignFlowResponse) SetResultCode(v string) *GetSignFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *GetSignFlowResponse) SetResultMsg(v string) *GetSignFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetSignFlowResponse) SetSignNo(v string) *GetSignFlowResponse {
	s.SignNo = &v
	return s
}

func (s *GetSignFlowResponse) SetOrderId(v string) *GetSignFlowResponse {
	s.OrderId = &v
	return s
}

func (s *GetSignFlowResponse) SetAccountId(v string) *GetSignFlowResponse {
	s.AccountId = &v
	return s
}

func (s *GetSignFlowResponse) SetStatus(v string) *GetSignFlowResponse {
	s.Status = &v
	return s
}

func (s *GetSignFlowResponse) SetFlowId(v string) *GetSignFlowResponse {
	s.FlowId = &v
	return s
}

func (s *GetSignFlowResponse) SetDocList(v string) *GetSignFlowResponse {
	s.DocList = &v
	return s
}

func (s *GetSignFlowResponse) SetBusinessScene(v string) *GetSignFlowResponse {
	s.BusinessScene = &v
	return s
}

func (s *GetSignFlowResponse) SetAlipayUserId(v string) *GetSignFlowResponse {
	s.AlipayUserId = &v
	return s
}

func (s *GetSignFlowResponse) SetSignInfo(v string) *GetSignFlowResponse {
	s.SignInfo = &v
	return s
}

func (s *GetSignFlowResponse) SetInitiatorAccountId(v string) *GetSignFlowResponse {
	s.InitiatorAccountId = &v
	return s
}

type AuthSignFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署的电子合同ID
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true" maxLength:"64" minLength:"6"`
	// 签署区域的tag，和发起签署流程的机构的tag对应。
	Tag *string `json:"tag,omitempty" xml:"tag,omitempty" maxLength:"32" minLength:"2"`
	// 电子合同签署服务返回的biz_flow_id
	BizFlowId *string `json:"biz_flow_id,omitempty" xml:"biz_flow_id,omitempty" maxLength:"64" minLength:"4"`
	// 电子合同签署服务的返回的account_id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" maxLength:"64" minLength:"4"`
}

func (s AuthSignFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthSignFlowRequest) GoString() string {
	return s.String()
}

func (s *AuthSignFlowRequest) SetAuthToken(v string) *AuthSignFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthSignFlowRequest) SetProductInstanceId(v string) *AuthSignFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthSignFlowRequest) SetSignNo(v string) *AuthSignFlowRequest {
	s.SignNo = &v
	return s
}

func (s *AuthSignFlowRequest) SetTag(v string) *AuthSignFlowRequest {
	s.Tag = &v
	return s
}

func (s *AuthSignFlowRequest) SetBizFlowId(v string) *AuthSignFlowRequest {
	s.BizFlowId = &v
	return s
}

func (s *AuthSignFlowRequest) SetAccountId(v string) *AuthSignFlowRequest {
	s.AccountId = &v
	return s
}

type AuthSignFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署最后落签的签署区域id列表
	SignFieldIds *string `json:"sign_field_ids,omitempty" xml:"sign_field_ids,omitempty"`
}

func (s AuthSignFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthSignFlowResponse) GoString() string {
	return s.String()
}

func (s *AuthSignFlowResponse) SetReqMsgId(v string) *AuthSignFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthSignFlowResponse) SetResultCode(v string) *AuthSignFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthSignFlowResponse) SetResultMsg(v string) *AuthSignFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthSignFlowResponse) SetSignFieldIds(v string) *AuthSignFlowResponse {
	s.SignFieldIds = &v
	return s
}

type SubmitFrontSignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"64" minLength:"4"`
	// CRED_PSN_CH_IDCARD： 大陆身份证
	// CRED_PSN_CH_TWCARD：台湾来往大陆通行证
	// CRED_PSN_CH_MACAO"：澳门来往大陆通行证
	// CRED_PSN_CH_HONGKONG：香港来往大陆通行证
	// CRED_PSN_PASSPORT：护照
	UserIdType *string `json:"user_id_type,omitempty" xml:"user_id_type,omitempty" require:"true" maxLength:"40" minLength:"4"`
	// 用户证件号，需要采用RSA加密传输
	UserIdNumber *string `json:"user_id_number,omitempty" xml:"user_id_number,omitempty" require:"true"`
	// 姓名，需要采用RSA加密传输
	//
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 用户手机号，可不传；传的话需要采用RSA加密传输
	//
	UserMobile *string `json:"user_mobile,omitempty" xml:"user_mobile,omitempty"`
	// 用户的电子邮箱，可不传；传的话需要采用RSA加密传输
	//
	UserEmail *string `json:"user_email,omitempty" xml:"user_email,omitempty"`
	// 签署有效期，时间戳，例如：new Date().getTime()
	SignValidity *string `json:"sign_validity,omitempty" xml:"sign_validity,omitempty"`
	// 1-短信；2-邮件
	FlowNotifyType *string `json:"flow_notify_type,omitempty" xml:"flow_notify_type,omitempty"`
	// 业务场景，电子合同签署协议的时候的标题
	//
	BusinessScene *string `json:"business_scene,omitempty" xml:"business_scene,omitempty" require:"true" maxLength:"200" minLength:"2"`
	// 签署完成跳转链接
	//
	SignedRedirectUrl *string `json:"signed_redirect_url,omitempty" xml:"signed_redirect_url,omitempty"`
	// 签署的电子合同模板信息，JSONArray格式，可以传入多个templateId和templateArgs。注意templateArgs的格式为key-value，其中key为模板文件中表单域的名称，value为需要填充的值。
	TemplateList *string `json:"template_list,omitempty" xml:"template_list,omitempty" require:"true"`
	// 用户的支付宝uid
	AlipayUserId *string `json:"alipay_user_id,omitempty" xml:"alipay_user_id,omitempty" maxLength:"24" minLength:"4"`
	// 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty" require:"true"`
	// 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
	MerchantTag *string `json:"merchant_tag,omitempty" xml:"merchant_tag,omitempty" maxLength:"32" minLength:"2"`
	// 电子合同签署顺序，如果只有1方企业签署，传入1即可。如果是多方，并且需要设置签署顺序，则需要将这个值以及thirdSigner中的signOrder做一个签署顺序。
	MerchantSignOrder *int64 `json:"merchant_sign_order,omitempty" xml:"merchant_sign_order,omitempty"`
	// 商户需要盖的印章ID
	MerchantSealId *string `json:"merchant_seal_id,omitempty" xml:"merchant_seal_id,omitempty"`
	// CRED_ORG_USCC：统一社会信用代码，
	// CRED_ORG_REGCODE：工商注册号，
	// 只支持这两个值
	MerchantIdType *string `json:"merchant_id_type,omitempty" xml:"merchant_id_type,omitempty" require:"true" maxLength:"32" minLength:"4"`
	// 商户证件号，需要采用RSA加密传输
	MerchantIdNumber *string `json:"merchant_id_number,omitempty" xml:"merchant_id_number,omitempty" require:"true"`
	// 法人姓名，需要RSA加密传输
	//
	MerchantLegalName *string `json:"merchant_legal_name,omitempty" xml:"merchant_legal_name,omitempty"`
	// 法人证件号，需要采用RSA加密传输
	//
	MerchantLegalIdNumber *string `json:"merchant_legal_id_number,omitempty" xml:"merchant_legal_id_number,omitempty"`
	// 除商户以外的第三方签署信息，需要通过此字段传入，需要使用JSONArray格式。注意其中orgIdNumber、orgLegalName、orgLegalIdNumber需要RSA加密。
	ThirdSigner *string `json:"third_signer,omitempty" xml:"third_signer,omitempty"`
	// 用户在支付宝开放平台下应用的 open_id
	UserOpenId *string `json:"user_open_id,omitempty" xml:"user_open_id,omitempty" maxLength:"64" minLength:"16"`
	// 商户支付宝应用 id
	MerchantAppId *string `json:"merchant_app_id,omitempty" xml:"merchant_app_id,omitempty" maxLength:"32"`
	// 用户类型，个人或企业，默认是个人
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty"`
	// (企业作为消费者时)公司证件号，无需加密
	UserOrgIdNumber *string `json:"user_org_id_number,omitempty" xml:"user_org_id_number,omitempty"`
	// (企业作为消费者时)公司证件类型
	UserOrgIdType *string `json:"user_org_id_type,omitempty" xml:"user_org_id_type,omitempty"`
	// (企业作为消费者时)公司名称
	UserOrgName *string `json:"user_org_name,omitempty" xml:"user_org_name,omitempty"`
	// 合并签署是否开启人脸识别（默认true-开启）,非合并签署无需设值
	NeedFace *bool `json:"need_face,omitempty" xml:"need_face,omitempty"`
}

func (s SubmitFrontSignRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitFrontSignRequest) GoString() string {
	return s.String()
}

func (s *SubmitFrontSignRequest) SetAuthToken(v string) *SubmitFrontSignRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitFrontSignRequest) SetProductInstanceId(v string) *SubmitFrontSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitFrontSignRequest) SetOrderId(v string) *SubmitFrontSignRequest {
	s.OrderId = &v
	return s
}

func (s *SubmitFrontSignRequest) SetUserIdType(v string) *SubmitFrontSignRequest {
	s.UserIdType = &v
	return s
}

func (s *SubmitFrontSignRequest) SetUserIdNumber(v string) *SubmitFrontSignRequest {
	s.UserIdNumber = &v
	return s
}

func (s *SubmitFrontSignRequest) SetUserName(v string) *SubmitFrontSignRequest {
	s.UserName = &v
	return s
}

func (s *SubmitFrontSignRequest) SetUserMobile(v string) *SubmitFrontSignRequest {
	s.UserMobile = &v
	return s
}

func (s *SubmitFrontSignRequest) SetUserEmail(v string) *SubmitFrontSignRequest {
	s.UserEmail = &v
	return s
}

func (s *SubmitFrontSignRequest) SetSignValidity(v string) *SubmitFrontSignRequest {
	s.SignValidity = &v
	return s
}

func (s *SubmitFrontSignRequest) SetFlowNotifyType(v string) *SubmitFrontSignRequest {
	s.FlowNotifyType = &v
	return s
}

func (s *SubmitFrontSignRequest) SetBusinessScene(v string) *SubmitFrontSignRequest {
	s.BusinessScene = &v
	return s
}

func (s *SubmitFrontSignRequest) SetSignedRedirectUrl(v string) *SubmitFrontSignRequest {
	s.SignedRedirectUrl = &v
	return s
}

func (s *SubmitFrontSignRequest) SetTemplateList(v string) *SubmitFrontSignRequest {
	s.TemplateList = &v
	return s
}

func (s *SubmitFrontSignRequest) SetAlipayUserId(v string) *SubmitFrontSignRequest {
	s.AlipayUserId = &v
	return s
}

func (s *SubmitFrontSignRequest) SetMerchantName(v string) *SubmitFrontSignRequest {
	s.MerchantName = &v
	return s
}

func (s *SubmitFrontSignRequest) SetMerchantTag(v string) *SubmitFrontSignRequest {
	s.MerchantTag = &v
	return s
}

func (s *SubmitFrontSignRequest) SetMerchantSignOrder(v int64) *SubmitFrontSignRequest {
	s.MerchantSignOrder = &v
	return s
}

func (s *SubmitFrontSignRequest) SetMerchantSealId(v string) *SubmitFrontSignRequest {
	s.MerchantSealId = &v
	return s
}

func (s *SubmitFrontSignRequest) SetMerchantIdType(v string) *SubmitFrontSignRequest {
	s.MerchantIdType = &v
	return s
}

func (s *SubmitFrontSignRequest) SetMerchantIdNumber(v string) *SubmitFrontSignRequest {
	s.MerchantIdNumber = &v
	return s
}

func (s *SubmitFrontSignRequest) SetMerchantLegalName(v string) *SubmitFrontSignRequest {
	s.MerchantLegalName = &v
	return s
}

func (s *SubmitFrontSignRequest) SetMerchantLegalIdNumber(v string) *SubmitFrontSignRequest {
	s.MerchantLegalIdNumber = &v
	return s
}

func (s *SubmitFrontSignRequest) SetThirdSigner(v string) *SubmitFrontSignRequest {
	s.ThirdSigner = &v
	return s
}

func (s *SubmitFrontSignRequest) SetUserOpenId(v string) *SubmitFrontSignRequest {
	s.UserOpenId = &v
	return s
}

func (s *SubmitFrontSignRequest) SetMerchantAppId(v string) *SubmitFrontSignRequest {
	s.MerchantAppId = &v
	return s
}

func (s *SubmitFrontSignRequest) SetUserType(v string) *SubmitFrontSignRequest {
	s.UserType = &v
	return s
}

func (s *SubmitFrontSignRequest) SetUserOrgIdNumber(v string) *SubmitFrontSignRequest {
	s.UserOrgIdNumber = &v
	return s
}

func (s *SubmitFrontSignRequest) SetUserOrgIdType(v string) *SubmitFrontSignRequest {
	s.UserOrgIdType = &v
	return s
}

func (s *SubmitFrontSignRequest) SetUserOrgName(v string) *SubmitFrontSignRequest {
	s.UserOrgName = &v
	return s
}

func (s *SubmitFrontSignRequest) SetNeedFace(v bool) *SubmitFrontSignRequest {
	s.NeedFace = &v
	return s
}

type SubmitFrontSignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署合同单号
	//
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty"`
	// 电子签署流程ID
	//
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 签署用户ID
	//
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 签署信息，包括短链接、长链接、小程序链接等。
	SignInfo *string `json:"sign_info,omitempty" xml:"sign_info,omitempty"`
}

func (s SubmitFrontSignResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitFrontSignResponse) GoString() string {
	return s.String()
}

func (s *SubmitFrontSignResponse) SetReqMsgId(v string) *SubmitFrontSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitFrontSignResponse) SetResultCode(v string) *SubmitFrontSignResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitFrontSignResponse) SetResultMsg(v string) *SubmitFrontSignResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitFrontSignResponse) SetSignNo(v string) *SubmitFrontSignResponse {
	s.SignNo = &v
	return s
}

func (s *SubmitFrontSignResponse) SetFlowId(v string) *SubmitFrontSignResponse {
	s.FlowId = &v
	return s
}

func (s *SubmitFrontSignResponse) SetAccountId(v string) *SubmitFrontSignResponse {
	s.AccountId = &v
	return s
}

func (s *SubmitFrontSignResponse) SetSignInfo(v string) *SubmitFrontSignResponse {
	s.SignInfo = &v
	return s
}

type UploadSignFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	// 订单所属商户的统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	//
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 签署合同单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true"`
	// 模板id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 合同签署时间，格式为yyyy-MM-dd HH:mm:ss
	SignTime *string `json:"sign_time,omitempty" xml:"sign_time,omitempty" require:"true"`
	// 上传的pdf文件，需要以.pdf后缀结尾
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s UploadSignFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadSignFlowRequest) GoString() string {
	return s.String()
}

func (s *UploadSignFlowRequest) SetAuthToken(v string) *UploadSignFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadSignFlowRequest) SetProductInstanceId(v string) *UploadSignFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadSignFlowRequest) SetMerchantId(v string) *UploadSignFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *UploadSignFlowRequest) SetOrderId(v string) *UploadSignFlowRequest {
	s.OrderId = &v
	return s
}

func (s *UploadSignFlowRequest) SetSignNo(v string) *UploadSignFlowRequest {
	s.SignNo = &v
	return s
}

func (s *UploadSignFlowRequest) SetTemplateId(v string) *UploadSignFlowRequest {
	s.TemplateId = &v
	return s
}

func (s *UploadSignFlowRequest) SetSignTime(v string) *UploadSignFlowRequest {
	s.SignTime = &v
	return s
}

func (s *UploadSignFlowRequest) SetFileObject(v io.Reader) *UploadSignFlowRequest {
	s.FileObject = v
	return s
}

func (s *UploadSignFlowRequest) SetFileObjectName(v string) *UploadSignFlowRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadSignFlowRequest) SetFileId(v string) *UploadSignFlowRequest {
	s.FileId = &v
	return s
}

type UploadSignFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件编号
	FileItemNo *string `json:"file_item_no,omitempty" xml:"file_item_no,omitempty"`
}

func (s UploadSignFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadSignFlowResponse) GoString() string {
	return s.String()
}

func (s *UploadSignFlowResponse) SetReqMsgId(v string) *UploadSignFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadSignFlowResponse) SetResultCode(v string) *UploadSignFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadSignFlowResponse) SetResultMsg(v string) *UploadSignFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadSignFlowResponse) SetFileItemNo(v string) *UploadSignFlowResponse {
	s.FileItemNo = &v
	return s
}

type UploadSignTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单所属商户的统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 合同类型
	ContractType *string `json:"contract_type,omitempty" xml:"contract_type,omitempty" require:"true"`
	// 模板类型
	AgreementType *string `json:"agreement_type,omitempty" xml:"agreement_type,omitempty" require:"true"`
	// 签署区坐标配置
	PosConf *string `json:"pos_conf,omitempty" xml:"pos_conf,omitempty" require:"true"`
	// 模板参数
	TemplateArgs *string `json:"template_args,omitempty" xml:"template_args,omitempty"`
	// 上传的pdf文件，需要以.pdf后缀结尾
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s UploadSignTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadSignTemplateRequest) GoString() string {
	return s.String()
}

func (s *UploadSignTemplateRequest) SetAuthToken(v string) *UploadSignTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadSignTemplateRequest) SetProductInstanceId(v string) *UploadSignTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadSignTemplateRequest) SetMerchantId(v string) *UploadSignTemplateRequest {
	s.MerchantId = &v
	return s
}

func (s *UploadSignTemplateRequest) SetContractType(v string) *UploadSignTemplateRequest {
	s.ContractType = &v
	return s
}

func (s *UploadSignTemplateRequest) SetAgreementType(v string) *UploadSignTemplateRequest {
	s.AgreementType = &v
	return s
}

func (s *UploadSignTemplateRequest) SetPosConf(v string) *UploadSignTemplateRequest {
	s.PosConf = &v
	return s
}

func (s *UploadSignTemplateRequest) SetTemplateArgs(v string) *UploadSignTemplateRequest {
	s.TemplateArgs = &v
	return s
}

func (s *UploadSignTemplateRequest) SetFileObject(v io.Reader) *UploadSignTemplateRequest {
	s.FileObject = v
	return s
}

func (s *UploadSignTemplateRequest) SetFileObjectName(v string) *UploadSignTemplateRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadSignTemplateRequest) SetFileId(v string) *UploadSignTemplateRequest {
	s.FileId = &v
	return s
}

type UploadSignTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 上传模板后返回的模板id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty"`
}

func (s UploadSignTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadSignTemplateResponse) GoString() string {
	return s.String()
}

func (s *UploadSignTemplateResponse) SetReqMsgId(v string) *UploadSignTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadSignTemplateResponse) SetResultCode(v string) *UploadSignTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadSignTemplateResponse) SetResultMsg(v string) *UploadSignTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadSignTemplateResponse) SetTemplateId(v string) *UploadSignTemplateResponse {
	s.TemplateId = &v
	return s
}

type UploadSignCreditRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号类型
	OrderNoType *string `json:"order_no_type,omitempty" xml:"order_no_type,omitempty" require:"true"`
	// 订单号，或资产包号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 凭证合同类型
	CreditType *string `json:"credit_type,omitempty" xml:"credit_type,omitempty" require:"true"`
	// 凭证名称
	CreditName *string `json:"credit_name,omitempty" xml:"credit_name,omitempty"`
	// 文本类型
	ContentType *string `json:"content_type,omitempty" xml:"content_type,omitempty" require:"true"`
	// 文本下载链接，如果类型是FILE则必填
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty"`
	// 内容数据，格式为JSON类型文本，如果类型是JSON_TEXT则必填
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 商户统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
}

func (s UploadSignCreditRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadSignCreditRequest) GoString() string {
	return s.String()
}

func (s *UploadSignCreditRequest) SetAuthToken(v string) *UploadSignCreditRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadSignCreditRequest) SetProductInstanceId(v string) *UploadSignCreditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadSignCreditRequest) SetOrderNoType(v string) *UploadSignCreditRequest {
	s.OrderNoType = &v
	return s
}

func (s *UploadSignCreditRequest) SetOrderNo(v string) *UploadSignCreditRequest {
	s.OrderNo = &v
	return s
}

func (s *UploadSignCreditRequest) SetCreditType(v string) *UploadSignCreditRequest {
	s.CreditType = &v
	return s
}

func (s *UploadSignCreditRequest) SetCreditName(v string) *UploadSignCreditRequest {
	s.CreditName = &v
	return s
}

func (s *UploadSignCreditRequest) SetContentType(v string) *UploadSignCreditRequest {
	s.ContentType = &v
	return s
}

func (s *UploadSignCreditRequest) SetFileUrl(v string) *UploadSignCreditRequest {
	s.FileUrl = &v
	return s
}

func (s *UploadSignCreditRequest) SetContent(v string) *UploadSignCreditRequest {
	s.Content = &v
	return s
}

func (s *UploadSignCreditRequest) SetMerchantId(v string) *UploadSignCreditRequest {
	s.MerchantId = &v
	return s
}

type UploadSignCreditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 凭证内容id
	ContentId *string `json:"content_id,omitempty" xml:"content_id,omitempty"`
}

func (s UploadSignCreditResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadSignCreditResponse) GoString() string {
	return s.String()
}

func (s *UploadSignCreditResponse) SetReqMsgId(v string) *UploadSignCreditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadSignCreditResponse) SetResultCode(v string) *UploadSignCreditResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadSignCreditResponse) SetResultMsg(v string) *UploadSignCreditResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadSignCreditResponse) SetContentId(v string) *UploadSignCreditResponse {
	s.ContentId = &v
	return s
}

type QuerySignCreditRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号类型
	OrderNoType *string `json:"order_no_type,omitempty" xml:"order_no_type,omitempty" require:"true"`
	// 订单号，或资产包号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 商户统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
}

func (s QuerySignCreditRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySignCreditRequest) GoString() string {
	return s.String()
}

func (s *QuerySignCreditRequest) SetAuthToken(v string) *QuerySignCreditRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySignCreditRequest) SetProductInstanceId(v string) *QuerySignCreditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySignCreditRequest) SetOrderNoType(v string) *QuerySignCreditRequest {
	s.OrderNoType = &v
	return s
}

func (s *QuerySignCreditRequest) SetOrderNo(v string) *QuerySignCreditRequest {
	s.OrderNo = &v
	return s
}

func (s *QuerySignCreditRequest) SetMerchantId(v string) *QuerySignCreditRequest {
	s.MerchantId = &v
	return s
}

type QuerySignCreditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 内容信息
	ContentInfo *string `json:"content_info,omitempty" xml:"content_info,omitempty"`
}

func (s QuerySignCreditResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySignCreditResponse) GoString() string {
	return s.String()
}

func (s *QuerySignCreditResponse) SetReqMsgId(v string) *QuerySignCreditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySignCreditResponse) SetResultCode(v string) *QuerySignCreditResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySignCreditResponse) SetResultMsg(v string) *QuerySignCreditResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySignCreditResponse) SetContentInfo(v string) *QuerySignCreditResponse {
	s.ContentInfo = &v
	return s
}

type CancelSignFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署合同单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true"`
	// 默认:“撤销”，最大长度50
	RevokeReason *string `json:"revoke_reason,omitempty" xml:"revoke_reason,omitempty"`
	// 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty"`
}

func (s CancelSignFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelSignFlowRequest) GoString() string {
	return s.String()
}

func (s *CancelSignFlowRequest) SetAuthToken(v string) *CancelSignFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelSignFlowRequest) SetProductInstanceId(v string) *CancelSignFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelSignFlowRequest) SetSignNo(v string) *CancelSignFlowRequest {
	s.SignNo = &v
	return s
}

func (s *CancelSignFlowRequest) SetRevokeReason(v string) *CancelSignFlowRequest {
	s.RevokeReason = &v
	return s
}

func (s *CancelSignFlowRequest) SetOperatorId(v string) *CancelSignFlowRequest {
	s.OperatorId = &v
	return s
}

type CancelSignFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CancelSignFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelSignFlowResponse) GoString() string {
	return s.String()
}

func (s *CancelSignFlowResponse) SetReqMsgId(v string) *CancelSignFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelSignFlowResponse) SetResultCode(v string) *CancelSignFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelSignFlowResponse) SetResultMsg(v string) *CancelSignFlowResponse {
	s.ResultMsg = &v
	return s
}

type GetSignContractcertificateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 流程id
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true"`
}

func (s GetSignContractcertificateRequest) String() string {
	return tea.Prettify(s)
}

func (s GetSignContractcertificateRequest) GoString() string {
	return s.String()
}

func (s *GetSignContractcertificateRequest) SetAuthToken(v string) *GetSignContractcertificateRequest {
	s.AuthToken = &v
	return s
}

func (s *GetSignContractcertificateRequest) SetProductInstanceId(v string) *GetSignContractcertificateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetSignContractcertificateRequest) SetSignNo(v string) *GetSignContractcertificateRequest {
	s.SignNo = &v
	return s
}

type GetSignContractcertificateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 下载文件地址(一小时内有效)
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s GetSignContractcertificateResponse) String() string {
	return tea.Prettify(s)
}

func (s GetSignContractcertificateResponse) GoString() string {
	return s.String()
}

func (s *GetSignContractcertificateResponse) SetReqMsgId(v string) *GetSignContractcertificateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetSignContractcertificateResponse) SetResultCode(v string) *GetSignContractcertificateResponse {
	s.ResultCode = &v
	return s
}

func (s *GetSignContractcertificateResponse) SetResultMsg(v string) *GetSignContractcertificateResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetSignContractcertificateResponse) SetUrl(v string) *GetSignContractcertificateResponse {
	s.Url = &v
	return s
}

type SyncTradeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务字段，具体传入信息需参考文档
	// 传入格式需为json字符串
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 接口执行类型
	//
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s SyncTradeRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncTradeRequest) GoString() string {
	return s.String()
}

func (s *SyncTradeRequest) SetAuthToken(v string) *SyncTradeRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncTradeRequest) SetProductInstanceId(v string) *SyncTradeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncTradeRequest) SetBizContent(v string) *SyncTradeRequest {
	s.BizContent = &v
	return s
}

func (s *SyncTradeRequest) SetType(v string) *SyncTradeRequest {
	s.Type = &v
	return s
}

type SyncTradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// resp信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncTradeResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncTradeResponse) GoString() string {
	return s.String()
}

func (s *SyncTradeResponse) SetReqMsgId(v string) *SyncTradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncTradeResponse) SetResultCode(v string) *SyncTradeResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncTradeResponse) SetResultMsg(v string) *SyncTradeResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncTradeResponse) SetResponseData(v string) *SyncTradeResponse {
	s.ResponseData = &v
	return s
}

type GetTradeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询信息，必须遵循json字符串格式
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 接口类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s GetTradeRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTradeRequest) GoString() string {
	return s.String()
}

func (s *GetTradeRequest) SetAuthToken(v string) *GetTradeRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTradeRequest) SetProductInstanceId(v string) *GetTradeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTradeRequest) SetBizContent(v string) *GetTradeRequest {
	s.BizContent = &v
	return s
}

func (s *GetTradeRequest) SetType(v string) *GetTradeRequest {
	s.Type = &v
	return s
}

type GetTradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回的查询值
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetTradeResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTradeResponse) GoString() string {
	return s.String()
}

func (s *GetTradeResponse) SetReqMsgId(v string) *GetTradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTradeResponse) SetResultCode(v string) *GetTradeResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTradeResponse) SetResultMsg(v string) *GetTradeResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTradeResponse) SetResponseData(v string) *GetTradeResponse {
	s.ResponseData = &v
	return s
}

type SyncFrontTradeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 类型
	// 1. orderFullInfo ， 订单所有信息同步
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// json.toString
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s SyncFrontTradeRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncFrontTradeRequest) GoString() string {
	return s.String()
}

func (s *SyncFrontTradeRequest) SetAuthToken(v string) *SyncFrontTradeRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncFrontTradeRequest) SetProductInstanceId(v string) *SyncFrontTradeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncFrontTradeRequest) SetType(v string) *SyncFrontTradeRequest {
	s.Type = &v
	return s
}

func (s *SyncFrontTradeRequest) SetBizContent(v string) *SyncFrontTradeRequest {
	s.BizContent = &v
	return s
}

type SyncFrontTradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncFrontTradeResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncFrontTradeResponse) GoString() string {
	return s.String()
}

func (s *SyncFrontTradeResponse) SetReqMsgId(v string) *SyncFrontTradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncFrontTradeResponse) SetResultCode(v string) *SyncFrontTradeResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncFrontTradeResponse) SetResultMsg(v string) *SyncFrontTradeResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncFrontTradeResponse) SetResponseData(v string) *SyncFrontTradeResponse {
	s.ResponseData = &v
	return s
}

type SyncTradeFinanceloanapplyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" maxLength:"50" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 融资放款申请接口
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty" require:"true"`
	// 资方的社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" maxLength:"64"`
	// 类型
	// ● 默认为：ORDER, 单订单申请
	// ● PACKAGE_ORDER , 资产包订单模式
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 资产包id
	// type = PACKAGE_ORDER ， 必填
	AssetPackageId *string `json:"asset_package_id,omitempty" xml:"asset_package_id,omitempty" maxLength:"50" minLength:"6"`
	// type = PACKAGE_ORDER ， 必填
	//
	// ● APPEND: 追加订单列表
	// ● FINIISH : 结束
	Stage *string `json:"stage,omitempty" xml:"stage,omitempty"`
	// 订单id列表的jsonArray
	OrderIdList *string `json:"order_id_list,omitempty" xml:"order_id_list,omitempty"`
}

func (s SyncTradeFinanceloanapplyRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncTradeFinanceloanapplyRequest) GoString() string {
	return s.String()
}

func (s *SyncTradeFinanceloanapplyRequest) SetAuthToken(v string) *SyncTradeFinanceloanapplyRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncTradeFinanceloanapplyRequest) SetProductInstanceId(v string) *SyncTradeFinanceloanapplyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncTradeFinanceloanapplyRequest) SetOrderId(v string) *SyncTradeFinanceloanapplyRequest {
	s.OrderId = &v
	return s
}

func (s *SyncTradeFinanceloanapplyRequest) SetMerchantId(v string) *SyncTradeFinanceloanapplyRequest {
	s.MerchantId = &v
	return s
}

func (s *SyncTradeFinanceloanapplyRequest) SetMerchantName(v string) *SyncTradeFinanceloanapplyRequest {
	s.MerchantName = &v
	return s
}

func (s *SyncTradeFinanceloanapplyRequest) SetFundId(v string) *SyncTradeFinanceloanapplyRequest {
	s.FundId = &v
	return s
}

func (s *SyncTradeFinanceloanapplyRequest) SetType(v string) *SyncTradeFinanceloanapplyRequest {
	s.Type = &v
	return s
}

func (s *SyncTradeFinanceloanapplyRequest) SetAssetPackageId(v string) *SyncTradeFinanceloanapplyRequest {
	s.AssetPackageId = &v
	return s
}

func (s *SyncTradeFinanceloanapplyRequest) SetStage(v string) *SyncTradeFinanceloanapplyRequest {
	s.Stage = &v
	return s
}

func (s *SyncTradeFinanceloanapplyRequest) SetOrderIdList(v string) *SyncTradeFinanceloanapplyRequest {
	s.OrderIdList = &v
	return s
}

type SyncTradeFinanceloanapplyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
}

func (s SyncTradeFinanceloanapplyResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncTradeFinanceloanapplyResponse) GoString() string {
	return s.String()
}

func (s *SyncTradeFinanceloanapplyResponse) SetReqMsgId(v string) *SyncTradeFinanceloanapplyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncTradeFinanceloanapplyResponse) SetResultCode(v string) *SyncTradeFinanceloanapplyResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncTradeFinanceloanapplyResponse) SetResultMsg(v string) *SyncTradeFinanceloanapplyResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncTradeFinanceloanapplyResponse) SetOrderId(v string) *SyncTradeFinanceloanapplyResponse {
	s.OrderId = &v
	return s
}

func (s *SyncTradeFinanceloanapplyResponse) SetMerchantId(v string) *SyncTradeFinanceloanapplyResponse {
	s.MerchantId = &v
	return s
}

type GetTradeMerchantfulfillmentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 履约期数，不填返回为所有履约期的履约信息
	// - 如果有填写，返回当前期数的履约信息，列表长度为1
	TermIdx *int64 `json:"term_idx,omitempty" xml:"term_idx,omitempty"`
}

func (s GetTradeMerchantfulfillmentRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTradeMerchantfulfillmentRequest) GoString() string {
	return s.String()
}

func (s *GetTradeMerchantfulfillmentRequest) SetAuthToken(v string) *GetTradeMerchantfulfillmentRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTradeMerchantfulfillmentRequest) SetProductInstanceId(v string) *GetTradeMerchantfulfillmentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTradeMerchantfulfillmentRequest) SetOrderId(v string) *GetTradeMerchantfulfillmentRequest {
	s.OrderId = &v
	return s
}

func (s *GetTradeMerchantfulfillmentRequest) SetMerchantId(v string) *GetTradeMerchantfulfillmentRequest {
	s.MerchantId = &v
	return s
}

func (s *GetTradeMerchantfulfillmentRequest) SetTermIdx(v int64) *GetTradeMerchantfulfillmentRequest {
	s.TermIdx = &v
	return s
}

type GetTradeMerchantfulfillmentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回值为 「MerchantFulfillmentResp」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetTradeMerchantfulfillmentResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTradeMerchantfulfillmentResponse) GoString() string {
	return s.String()
}

func (s *GetTradeMerchantfulfillmentResponse) SetReqMsgId(v string) *GetTradeMerchantfulfillmentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTradeMerchantfulfillmentResponse) SetResultCode(v string) *GetTradeMerchantfulfillmentResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTradeMerchantfulfillmentResponse) SetResultMsg(v string) *GetTradeMerchantfulfillmentResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTradeMerchantfulfillmentResponse) SetResponseData(v string) *GetTradeMerchantfulfillmentResponse {
	s.ResponseData = &v
	return s
}

type GetTradeUserperformanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 商家公司社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s GetTradeUserperformanceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTradeUserperformanceRequest) GoString() string {
	return s.String()
}

func (s *GetTradeUserperformanceRequest) SetAuthToken(v string) *GetTradeUserperformanceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTradeUserperformanceRequest) SetProductInstanceId(v string) *GetTradeUserperformanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTradeUserperformanceRequest) SetOrderId(v string) *GetTradeUserperformanceRequest {
	s.OrderId = &v
	return s
}

func (s *GetTradeUserperformanceRequest) SetMerchantId(v string) *GetTradeUserperformanceRequest {
	s.MerchantId = &v
	return s
}

type GetTradeUserperformanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 「UserPerformanceInfo」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetTradeUserperformanceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTradeUserperformanceResponse) GoString() string {
	return s.String()
}

func (s *GetTradeUserperformanceResponse) SetReqMsgId(v string) *GetTradeUserperformanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTradeUserperformanceResponse) SetResultCode(v string) *GetTradeUserperformanceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTradeUserperformanceResponse) SetResultMsg(v string) *GetTradeUserperformanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTradeUserperformanceResponse) SetResponseData(v string) *GetTradeUserperformanceResponse {
	s.ResponseData = &v
	return s
}

type GetTradeMerchantperformanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s GetTradeMerchantperformanceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTradeMerchantperformanceRequest) GoString() string {
	return s.String()
}

func (s *GetTradeMerchantperformanceRequest) SetAuthToken(v string) *GetTradeMerchantperformanceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTradeMerchantperformanceRequest) SetProductInstanceId(v string) *GetTradeMerchantperformanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTradeMerchantperformanceRequest) SetOrderId(v string) *GetTradeMerchantperformanceRequest {
	s.OrderId = &v
	return s
}

func (s *GetTradeMerchantperformanceRequest) SetMerchantId(v string) *GetTradeMerchantperformanceRequest {
	s.MerchantId = &v
	return s
}

type GetTradeMerchantperformanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 「MerchantPerformanceInfo」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetTradeMerchantperformanceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTradeMerchantperformanceResponse) GoString() string {
	return s.String()
}

func (s *GetTradeMerchantperformanceResponse) SetReqMsgId(v string) *GetTradeMerchantperformanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTradeMerchantperformanceResponse) SetResultCode(v string) *GetTradeMerchantperformanceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTradeMerchantperformanceResponse) SetResultMsg(v string) *GetTradeMerchantperformanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTradeMerchantperformanceResponse) SetResponseData(v string) *GetTradeMerchantperformanceResponse {
	s.ResponseData = &v
	return s
}

type UpdateTradeUserpromiseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"49" minLength:"6"`
	// 商家社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"199" minLength:"1"`
	// 修改的用户履约期数
	TermIdx *int64 `json:"term_idx,omitempty" xml:"term_idx,omitempty" require:"true"`
	// 更新后的租金，单位为分
	// 1234=12.34元
	UpdatedRentalMoney *int64 `json:"updated_rental_money,omitempty" xml:"updated_rental_money,omitempty" require:"true"`
	// 调整原因，枚举
	// ● A01 : 违章罚金
	// ● A02 : 水电煤费用
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty" require:"true" maxLength:"10" minLength:"1"`
	// 调整说明，本说明同步到支付宝账户备注中，需准确填写
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s UpdateTradeUserpromiseRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateTradeUserpromiseRequest) GoString() string {
	return s.String()
}

func (s *UpdateTradeUserpromiseRequest) SetAuthToken(v string) *UpdateTradeUserpromiseRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateTradeUserpromiseRequest) SetProductInstanceId(v string) *UpdateTradeUserpromiseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateTradeUserpromiseRequest) SetOrderId(v string) *UpdateTradeUserpromiseRequest {
	s.OrderId = &v
	return s
}

func (s *UpdateTradeUserpromiseRequest) SetMerchantId(v string) *UpdateTradeUserpromiseRequest {
	s.MerchantId = &v
	return s
}

func (s *UpdateTradeUserpromiseRequest) SetTermIdx(v int64) *UpdateTradeUserpromiseRequest {
	s.TermIdx = &v
	return s
}

func (s *UpdateTradeUserpromiseRequest) SetUpdatedRentalMoney(v int64) *UpdateTradeUserpromiseRequest {
	s.UpdatedRentalMoney = &v
	return s
}

func (s *UpdateTradeUserpromiseRequest) SetReason(v string) *UpdateTradeUserpromiseRequest {
	s.Reason = &v
	return s
}

func (s *UpdateTradeUserpromiseRequest) SetDesc(v string) *UpdateTradeUserpromiseRequest {
	s.Desc = &v
	return s
}

type UpdateTradeUserpromiseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateTradeUserpromiseResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateTradeUserpromiseResponse) GoString() string {
	return s.String()
}

func (s *UpdateTradeUserpromiseResponse) SetReqMsgId(v string) *UpdateTradeUserpromiseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateTradeUserpromiseResponse) SetResultCode(v string) *UpdateTradeUserpromiseResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateTradeUserpromiseResponse) SetResultMsg(v string) *UpdateTradeUserpromiseResponse {
	s.ResultMsg = &v
	return s
}

type SyncFrontIndirectorderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务参数,json.toString
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true" minLength:"1"`
}

func (s SyncFrontIndirectorderRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncFrontIndirectorderRequest) GoString() string {
	return s.String()
}

func (s *SyncFrontIndirectorderRequest) SetAuthToken(v string) *SyncFrontIndirectorderRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncFrontIndirectorderRequest) SetProductInstanceId(v string) *SyncFrontIndirectorderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncFrontIndirectorderRequest) SetBizContent(v string) *SyncFrontIndirectorderRequest {
	s.BizContent = &v
	return s
}

type SyncFrontIndirectorderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回值，json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncFrontIndirectorderResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncFrontIndirectorderResponse) GoString() string {
	return s.String()
}

func (s *SyncFrontIndirectorderResponse) SetReqMsgId(v string) *SyncFrontIndirectorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncFrontIndirectorderResponse) SetResultCode(v string) *SyncFrontIndirectorderResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncFrontIndirectorderResponse) SetResultMsg(v string) *SyncFrontIndirectorderResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncFrontIndirectorderResponse) SetResponseData(v string) *SyncFrontIndirectorderResponse {
	s.ResponseData = &v
	return s
}

type SyncTradeIndirectorderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务参数,json.toString
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true" minLength:"1"`
}

func (s SyncTradeIndirectorderRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncTradeIndirectorderRequest) GoString() string {
	return s.String()
}

func (s *SyncTradeIndirectorderRequest) SetAuthToken(v string) *SyncTradeIndirectorderRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncTradeIndirectorderRequest) SetProductInstanceId(v string) *SyncTradeIndirectorderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncTradeIndirectorderRequest) SetBizContent(v string) *SyncTradeIndirectorderRequest {
	s.BizContent = &v
	return s
}

type SyncTradeIndirectorderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回业务参数，json.toString
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncTradeIndirectorderResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncTradeIndirectorderResponse) GoString() string {
	return s.String()
}

func (s *SyncTradeIndirectorderResponse) SetReqMsgId(v string) *SyncTradeIndirectorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncTradeIndirectorderResponse) SetResultCode(v string) *SyncTradeIndirectorderResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncTradeIndirectorderResponse) SetResultMsg(v string) *SyncTradeIndirectorderResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncTradeIndirectorderResponse) SetResponseData(v string) *SyncTradeIndirectorderResponse {
	s.ResponseData = &v
	return s
}

type ReplaceTradeUserpromiseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// json字符串
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// order_id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"6"`
	// 订单所属商户社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"200" minLength:"0"`
}

func (s ReplaceTradeUserpromiseRequest) String() string {
	return tea.Prettify(s)
}

func (s ReplaceTradeUserpromiseRequest) GoString() string {
	return s.String()
}

func (s *ReplaceTradeUserpromiseRequest) SetAuthToken(v string) *ReplaceTradeUserpromiseRequest {
	s.AuthToken = &v
	return s
}

func (s *ReplaceTradeUserpromiseRequest) SetProductInstanceId(v string) *ReplaceTradeUserpromiseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ReplaceTradeUserpromiseRequest) SetBizContent(v string) *ReplaceTradeUserpromiseRequest {
	s.BizContent = &v
	return s
}

func (s *ReplaceTradeUserpromiseRequest) SetOrderId(v string) *ReplaceTradeUserpromiseRequest {
	s.OrderId = &v
	return s
}

func (s *ReplaceTradeUserpromiseRequest) SetMerchantId(v string) *ReplaceTradeUserpromiseRequest {
	s.MerchantId = &v
	return s
}

type ReplaceTradeUserpromiseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ReplaceTradeUserpromiseResponse) String() string {
	return tea.Prettify(s)
}

func (s ReplaceTradeUserpromiseResponse) GoString() string {
	return s.String()
}

func (s *ReplaceTradeUserpromiseResponse) SetReqMsgId(v string) *ReplaceTradeUserpromiseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ReplaceTradeUserpromiseResponse) SetResultCode(v string) *ReplaceTradeUserpromiseResponse {
	s.ResultCode = &v
	return s
}

func (s *ReplaceTradeUserpromiseResponse) SetResultMsg(v string) *ReplaceTradeUserpromiseResponse {
	s.ResultMsg = &v
	return s
}

type ApplyTradeFinanceprecheckRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度大于6，小于50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" minLength:"6"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" minLength:"1"`
	// 提交预审的资方的社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true" minLength:"1"`
	// 透传到资方，不做格式限制
	TransparentInfo *string `json:"transparent_info,omitempty" xml:"transparent_info,omitempty" maxLength:"1000"`
}

func (s ApplyTradeFinanceprecheckRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyTradeFinanceprecheckRequest) GoString() string {
	return s.String()
}

func (s *ApplyTradeFinanceprecheckRequest) SetAuthToken(v string) *ApplyTradeFinanceprecheckRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyTradeFinanceprecheckRequest) SetProductInstanceId(v string) *ApplyTradeFinanceprecheckRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyTradeFinanceprecheckRequest) SetOrderId(v string) *ApplyTradeFinanceprecheckRequest {
	s.OrderId = &v
	return s
}

func (s *ApplyTradeFinanceprecheckRequest) SetMerchantId(v string) *ApplyTradeFinanceprecheckRequest {
	s.MerchantId = &v
	return s
}

func (s *ApplyTradeFinanceprecheckRequest) SetFundId(v string) *ApplyTradeFinanceprecheckRequest {
	s.FundId = &v
	return s
}

func (s *ApplyTradeFinanceprecheckRequest) SetTransparentInfo(v string) *ApplyTradeFinanceprecheckRequest {
	s.TransparentInfo = &v
	return s
}

type ApplyTradeFinanceprecheckResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// ● EXEMPTION ： 资方免预审
	// ● SUBMIT_SUCCESS: 异步预审提交成功
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
	// order_id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// merchant_id
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
}

func (s ApplyTradeFinanceprecheckResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyTradeFinanceprecheckResponse) GoString() string {
	return s.String()
}

func (s *ApplyTradeFinanceprecheckResponse) SetReqMsgId(v string) *ApplyTradeFinanceprecheckResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyTradeFinanceprecheckResponse) SetResultCode(v string) *ApplyTradeFinanceprecheckResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyTradeFinanceprecheckResponse) SetResultMsg(v string) *ApplyTradeFinanceprecheckResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyTradeFinanceprecheckResponse) SetResponseData(v string) *ApplyTradeFinanceprecheckResponse {
	s.ResponseData = &v
	return s
}

func (s *ApplyTradeFinanceprecheckResponse) SetOrderId(v string) *ApplyTradeFinanceprecheckResponse {
	s.OrderId = &v
	return s
}

func (s *ApplyTradeFinanceprecheckResponse) SetMerchantId(v string) *ApplyTradeFinanceprecheckResponse {
	s.MerchantId = &v
	return s
}

type TransferTradeFinanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" minLength:"1"`
	// 公司社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" minLength:"1"`
	// 待预审资方列表
	FundIdList []*string `json:"fund_id_list,omitempty" xml:"fund_id_list,omitempty" require:"true" type:"Repeated"`
	// 融资签署模式
	FundSignMode *string `json:"fund_sign_mode,omitempty" xml:"fund_sign_mode,omitempty" require:"true" minLength:"1"`
	// 商户分账起始期数
	DivideStartTermIndex *int64 `json:"divide_start_term_index,omitempty" xml:"divide_start_term_index,omitempty" require:"true" minimum:"1"`
}

func (s TransferTradeFinanceRequest) String() string {
	return tea.Prettify(s)
}

func (s TransferTradeFinanceRequest) GoString() string {
	return s.String()
}

func (s *TransferTradeFinanceRequest) SetAuthToken(v string) *TransferTradeFinanceRequest {
	s.AuthToken = &v
	return s
}

func (s *TransferTradeFinanceRequest) SetProductInstanceId(v string) *TransferTradeFinanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *TransferTradeFinanceRequest) SetOrderId(v string) *TransferTradeFinanceRequest {
	s.OrderId = &v
	return s
}

func (s *TransferTradeFinanceRequest) SetMerchantId(v string) *TransferTradeFinanceRequest {
	s.MerchantId = &v
	return s
}

func (s *TransferTradeFinanceRequest) SetFundIdList(v []*string) *TransferTradeFinanceRequest {
	s.FundIdList = v
	return s
}

func (s *TransferTradeFinanceRequest) SetFundSignMode(v string) *TransferTradeFinanceRequest {
	s.FundSignMode = &v
	return s
}

func (s *TransferTradeFinanceRequest) SetDivideStartTermIndex(v int64) *TransferTradeFinanceRequest {
	s.DivideStartTermIndex = &v
	return s
}

type TransferTradeFinanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// order_id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// merchant_id
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// jsonArray.toString
	FundCandidates *string `json:"fund_candidates,omitempty" xml:"fund_candidates,omitempty"`
	// 转融资结果
	TransferResult *string `json:"transfer_result,omitempty" xml:"transfer_result,omitempty"`
}

func (s TransferTradeFinanceResponse) String() string {
	return tea.Prettify(s)
}

func (s TransferTradeFinanceResponse) GoString() string {
	return s.String()
}

func (s *TransferTradeFinanceResponse) SetReqMsgId(v string) *TransferTradeFinanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *TransferTradeFinanceResponse) SetResultCode(v string) *TransferTradeFinanceResponse {
	s.ResultCode = &v
	return s
}

func (s *TransferTradeFinanceResponse) SetResultMsg(v string) *TransferTradeFinanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *TransferTradeFinanceResponse) SetOrderId(v string) *TransferTradeFinanceResponse {
	s.OrderId = &v
	return s
}

func (s *TransferTradeFinanceResponse) SetMerchantId(v string) *TransferTradeFinanceResponse {
	s.MerchantId = &v
	return s
}

func (s *TransferTradeFinanceResponse) SetFundCandidates(v string) *TransferTradeFinanceResponse {
	s.FundCandidates = &v
	return s
}

func (s *TransferTradeFinanceResponse) SetTransferResult(v string) *TransferTradeFinanceResponse {
	s.TransferResult = &v
	return s
}

type UpdateTradeOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// order_id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" minLength:"1"`
	// merchant_id
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" minLength:"1"`
	// json字符串
	UpdateOrderInfo *string `json:"update_order_info,omitempty" xml:"update_order_info,omitempty" require:"true" minLength:"1"`
}

func (s UpdateTradeOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateTradeOrderRequest) GoString() string {
	return s.String()
}

func (s *UpdateTradeOrderRequest) SetAuthToken(v string) *UpdateTradeOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateTradeOrderRequest) SetProductInstanceId(v string) *UpdateTradeOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateTradeOrderRequest) SetOrderId(v string) *UpdateTradeOrderRequest {
	s.OrderId = &v
	return s
}

func (s *UpdateTradeOrderRequest) SetMerchantId(v string) *UpdateTradeOrderRequest {
	s.MerchantId = &v
	return s
}

func (s *UpdateTradeOrderRequest) SetUpdateOrderInfo(v string) *UpdateTradeOrderRequest {
	s.UpdateOrderInfo = &v
	return s
}

type UpdateTradeOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// order_id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// merchant_id
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
}

func (s UpdateTradeOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateTradeOrderResponse) GoString() string {
	return s.String()
}

func (s *UpdateTradeOrderResponse) SetReqMsgId(v string) *UpdateTradeOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateTradeOrderResponse) SetResultCode(v string) *UpdateTradeOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateTradeOrderResponse) SetResultMsg(v string) *UpdateTradeOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateTradeOrderResponse) SetOrderId(v string) *UpdateTradeOrderResponse {
	s.OrderId = &v
	return s
}

func (s *UpdateTradeOrderResponse) SetMerchantId(v string) *UpdateTradeOrderResponse {
	s.MerchantId = &v
	return s
}

type AddTradeFinanceprecheckRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// order_id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" minLength:"1"`
	// merchant_id
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" minLength:"1"`
	// ["1","2"]
	FundIdList []*string `json:"fund_id_list,omitempty" xml:"fund_id_list,omitempty" require:"true" type:"Repeated"`
}

func (s AddTradeFinanceprecheckRequest) String() string {
	return tea.Prettify(s)
}

func (s AddTradeFinanceprecheckRequest) GoString() string {
	return s.String()
}

func (s *AddTradeFinanceprecheckRequest) SetAuthToken(v string) *AddTradeFinanceprecheckRequest {
	s.AuthToken = &v
	return s
}

func (s *AddTradeFinanceprecheckRequest) SetProductInstanceId(v string) *AddTradeFinanceprecheckRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddTradeFinanceprecheckRequest) SetOrderId(v string) *AddTradeFinanceprecheckRequest {
	s.OrderId = &v
	return s
}

func (s *AddTradeFinanceprecheckRequest) SetMerchantId(v string) *AddTradeFinanceprecheckRequest {
	s.MerchantId = &v
	return s
}

func (s *AddTradeFinanceprecheckRequest) SetFundIdList(v []*string) *AddTradeFinanceprecheckRequest {
	s.FundIdList = v
	return s
}

type AddTradeFinanceprecheckResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// merchant_id
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// order_id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// fund_candidates
	// List<FundCompanyInfo> 的jsonArray.toString
	FundCandidates *string `json:"fund_candidates,omitempty" xml:"fund_candidates,omitempty"`
}

func (s AddTradeFinanceprecheckResponse) String() string {
	return tea.Prettify(s)
}

func (s AddTradeFinanceprecheckResponse) GoString() string {
	return s.String()
}

func (s *AddTradeFinanceprecheckResponse) SetReqMsgId(v string) *AddTradeFinanceprecheckResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddTradeFinanceprecheckResponse) SetResultCode(v string) *AddTradeFinanceprecheckResponse {
	s.ResultCode = &v
	return s
}

func (s *AddTradeFinanceprecheckResponse) SetResultMsg(v string) *AddTradeFinanceprecheckResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddTradeFinanceprecheckResponse) SetMerchantId(v string) *AddTradeFinanceprecheckResponse {
	s.MerchantId = &v
	return s
}

func (s *AddTradeFinanceprecheckResponse) SetOrderId(v string) *AddTradeFinanceprecheckResponse {
	s.OrderId = &v
	return s
}

func (s *AddTradeFinanceprecheckResponse) SetFundCandidates(v string) *AddTradeFinanceprecheckResponse {
	s.FundCandidates = &v
	return s
}

type GetTradeOrderfinanceinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单Id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" minLength:"1"`
	// 商户社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" minLength:"1"`
}

func (s GetTradeOrderfinanceinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTradeOrderfinanceinfoRequest) GoString() string {
	return s.String()
}

func (s *GetTradeOrderfinanceinfoRequest) SetAuthToken(v string) *GetTradeOrderfinanceinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTradeOrderfinanceinfoRequest) SetProductInstanceId(v string) *GetTradeOrderfinanceinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTradeOrderfinanceinfoRequest) SetOrderId(v string) *GetTradeOrderfinanceinfoRequest {
	s.OrderId = &v
	return s
}

func (s *GetTradeOrderfinanceinfoRequest) SetMerchantId(v string) *GetTradeOrderfinanceinfoRequest {
	s.MerchantId = &v
	return s
}

type GetTradeOrderfinanceinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单融资信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetTradeOrderfinanceinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTradeOrderfinanceinfoResponse) GoString() string {
	return s.String()
}

func (s *GetTradeOrderfinanceinfoResponse) SetReqMsgId(v string) *GetTradeOrderfinanceinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTradeOrderfinanceinfoResponse) SetResultCode(v string) *GetTradeOrderfinanceinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTradeOrderfinanceinfoResponse) SetResultMsg(v string) *GetTradeOrderfinanceinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTradeOrderfinanceinfoResponse) SetResponseData(v string) *GetTradeOrderfinanceinfoResponse {
	s.ResponseData = &v
	return s
}

type SyncTradeUserpromisedelayRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// order_id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" minLength:"1"`
	// merchant_id
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" minLength:"1"`
	// 1
	DelayStartPeriod *int64 `json:"delay_start_period,omitempty" xml:"delay_start_period,omitempty" require:"true" minimum:"1"`
	// 延期时间单位
	DelayTimeUnit *string `json:"delay_time_unit,omitempty" xml:"delay_time_unit,omitempty" require:"true" minLength:"1"`
	// 延期时间数值
	DelayTimeValue *int64 `json:"delay_time_value,omitempty" xml:"delay_time_value,omitempty" require:"true" minimum:"1"`
	// 原因描述
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty" require:"true" minLength:"1"`
}

func (s SyncTradeUserpromisedelayRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncTradeUserpromisedelayRequest) GoString() string {
	return s.String()
}

func (s *SyncTradeUserpromisedelayRequest) SetAuthToken(v string) *SyncTradeUserpromisedelayRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncTradeUserpromisedelayRequest) SetProductInstanceId(v string) *SyncTradeUserpromisedelayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncTradeUserpromisedelayRequest) SetOrderId(v string) *SyncTradeUserpromisedelayRequest {
	s.OrderId = &v
	return s
}

func (s *SyncTradeUserpromisedelayRequest) SetMerchantId(v string) *SyncTradeUserpromisedelayRequest {
	s.MerchantId = &v
	return s
}

func (s *SyncTradeUserpromisedelayRequest) SetDelayStartPeriod(v int64) *SyncTradeUserpromisedelayRequest {
	s.DelayStartPeriod = &v
	return s
}

func (s *SyncTradeUserpromisedelayRequest) SetDelayTimeUnit(v string) *SyncTradeUserpromisedelayRequest {
	s.DelayTimeUnit = &v
	return s
}

func (s *SyncTradeUserpromisedelayRequest) SetDelayTimeValue(v int64) *SyncTradeUserpromisedelayRequest {
	s.DelayTimeValue = &v
	return s
}

func (s *SyncTradeUserpromisedelayRequest) SetReason(v string) *SyncTradeUserpromisedelayRequest {
	s.Reason = &v
	return s
}

type SyncTradeUserpromisedelayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SyncTradeUserpromisedelayResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncTradeUserpromisedelayResponse) GoString() string {
	return s.String()
}

func (s *SyncTradeUserpromisedelayResponse) SetReqMsgId(v string) *SyncTradeUserpromisedelayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncTradeUserpromisedelayResponse) SetResultCode(v string) *SyncTradeUserpromisedelayResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncTradeUserpromisedelayResponse) SetResultMsg(v string) *SyncTradeUserpromisedelayResponse {
	s.ResultMsg = &v
	return s
}

type PauseTradeUserpromiseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" minLength:"1"`
	// 社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" minLength:"1"`
	// 理由
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty" require:"true" minLength:"1"`
}

func (s PauseTradeUserpromiseRequest) String() string {
	return tea.Prettify(s)
}

func (s PauseTradeUserpromiseRequest) GoString() string {
	return s.String()
}

func (s *PauseTradeUserpromiseRequest) SetAuthToken(v string) *PauseTradeUserpromiseRequest {
	s.AuthToken = &v
	return s
}

func (s *PauseTradeUserpromiseRequest) SetProductInstanceId(v string) *PauseTradeUserpromiseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PauseTradeUserpromiseRequest) SetOrderId(v string) *PauseTradeUserpromiseRequest {
	s.OrderId = &v
	return s
}

func (s *PauseTradeUserpromiseRequest) SetMerchantId(v string) *PauseTradeUserpromiseRequest {
	s.MerchantId = &v
	return s
}

func (s *PauseTradeUserpromiseRequest) SetReason(v string) *PauseTradeUserpromiseRequest {
	s.Reason = &v
	return s
}

type PauseTradeUserpromiseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 暂停后自动重启时间
	AutoResumeDay *string `json:"auto_resume_day,omitempty" xml:"auto_resume_day,omitempty"`
	// 暂停后自动执行代扣时间，为autoResumeDay的第二天重新开始执行代扣计划
	AutoWithholdRestartDay *string `json:"auto_withhold_restart_day,omitempty" xml:"auto_withhold_restart_day,omitempty"`
}

func (s PauseTradeUserpromiseResponse) String() string {
	return tea.Prettify(s)
}

func (s PauseTradeUserpromiseResponse) GoString() string {
	return s.String()
}

func (s *PauseTradeUserpromiseResponse) SetReqMsgId(v string) *PauseTradeUserpromiseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PauseTradeUserpromiseResponse) SetResultCode(v string) *PauseTradeUserpromiseResponse {
	s.ResultCode = &v
	return s
}

func (s *PauseTradeUserpromiseResponse) SetResultMsg(v string) *PauseTradeUserpromiseResponse {
	s.ResultMsg = &v
	return s
}

func (s *PauseTradeUserpromiseResponse) SetAutoResumeDay(v string) *PauseTradeUserpromiseResponse {
	s.AutoResumeDay = &v
	return s
}

func (s *PauseTradeUserpromiseResponse) SetAutoWithholdRestartDay(v string) *PauseTradeUserpromiseResponse {
	s.AutoWithholdRestartDay = &v
	return s
}

type ResumeTradeUserpromiseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// order_id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" minLength:"1"`
	// merchant_id
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" minLength:"1"`
}

func (s ResumeTradeUserpromiseRequest) String() string {
	return tea.Prettify(s)
}

func (s ResumeTradeUserpromiseRequest) GoString() string {
	return s.String()
}

func (s *ResumeTradeUserpromiseRequest) SetAuthToken(v string) *ResumeTradeUserpromiseRequest {
	s.AuthToken = &v
	return s
}

func (s *ResumeTradeUserpromiseRequest) SetProductInstanceId(v string) *ResumeTradeUserpromiseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ResumeTradeUserpromiseRequest) SetOrderId(v string) *ResumeTradeUserpromiseRequest {
	s.OrderId = &v
	return s
}

func (s *ResumeTradeUserpromiseRequest) SetMerchantId(v string) *ResumeTradeUserpromiseRequest {
	s.MerchantId = &v
	return s
}

type ResumeTradeUserpromiseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单重启时间
	ResumeDay *string `json:"resume_day,omitempty" xml:"resume_day,omitempty"`
	// withhold_restart_day
	WithholdRestartDay *string `json:"withhold_restart_day,omitempty" xml:"withhold_restart_day,omitempty"`
}

func (s ResumeTradeUserpromiseResponse) String() string {
	return tea.Prettify(s)
}

func (s ResumeTradeUserpromiseResponse) GoString() string {
	return s.String()
}

func (s *ResumeTradeUserpromiseResponse) SetReqMsgId(v string) *ResumeTradeUserpromiseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ResumeTradeUserpromiseResponse) SetResultCode(v string) *ResumeTradeUserpromiseResponse {
	s.ResultCode = &v
	return s
}

func (s *ResumeTradeUserpromiseResponse) SetResultMsg(v string) *ResumeTradeUserpromiseResponse {
	s.ResultMsg = &v
	return s
}

func (s *ResumeTradeUserpromiseResponse) SetResumeDay(v string) *ResumeTradeUserpromiseResponse {
	s.ResumeDay = &v
	return s
}

func (s *ResumeTradeUserpromiseResponse) SetWithholdRestartDay(v string) *ResumeTradeUserpromiseResponse {
	s.WithholdRestartDay = &v
	return s
}

type CreateWithholdSignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
	// 支付宝商户id，使用签约能力前时候进行向平台申请
	AlipayMerchantId *string `json:"alipay_merchant_id,omitempty" xml:"alipay_merchant_id,omitempty" maxLength:"20"`
	// 支付宝商户名称，会展示在支付并签约界面
	AlipayMerchantName *string `json:"alipay_merchant_name,omitempty" xml:"alipay_merchant_name,omitempty" maxLength:"50"`
	// 支付宝商户服务名称，会展示在支付并签约界面
	AlipayMerchantServiceName *string `json:"alipay_merchant_service_name,omitempty" xml:"alipay_merchant_service_name,omitempty" maxLength:"50"`
	// 支付宝商户服务描述，会展示在支付并签约界面
	AlipayMerchantServiceDescription *string `json:"alipay_merchant_service_description,omitempty" xml:"alipay_merchant_service_description,omitempty" maxLength:"150"`
	// 支付宝uid，非必填
	AlipayUserId *string `json:"alipay_user_id,omitempty" xml:"alipay_user_id,omitempty" maxLength:"128"`
	// 签约完成后的跳转地址，注意只有在h5跳转场景下才有意义其他场景通过方法回调处理业务；无需使用此字段。
	ReturnUrl *string `json:"return_url,omitempty" xml:"return_url,omitempty" maxLength:"256"`
	// 支付宝用户 open_id，非必填
	UserOpenId *string `json:"user_open_id,omitempty" xml:"user_open_id,omitempty" maxLength:"128" minLength:"16"`
	// 商户支付宝应用 id
	MerchantAppId *string `json:"merchant_app_id,omitempty" xml:"merchant_app_id,omitempty" maxLength:"32"`
}

func (s CreateWithholdSignRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateWithholdSignRequest) GoString() string {
	return s.String()
}

func (s *CreateWithholdSignRequest) SetAuthToken(v string) *CreateWithholdSignRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateWithholdSignRequest) SetProductInstanceId(v string) *CreateWithholdSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateWithholdSignRequest) SetOrderId(v string) *CreateWithholdSignRequest {
	s.OrderId = &v
	return s
}

func (s *CreateWithholdSignRequest) SetAlipayMerchantId(v string) *CreateWithholdSignRequest {
	s.AlipayMerchantId = &v
	return s
}

func (s *CreateWithholdSignRequest) SetAlipayMerchantName(v string) *CreateWithholdSignRequest {
	s.AlipayMerchantName = &v
	return s
}

func (s *CreateWithholdSignRequest) SetAlipayMerchantServiceName(v string) *CreateWithholdSignRequest {
	s.AlipayMerchantServiceName = &v
	return s
}

func (s *CreateWithholdSignRequest) SetAlipayMerchantServiceDescription(v string) *CreateWithholdSignRequest {
	s.AlipayMerchantServiceDescription = &v
	return s
}

func (s *CreateWithholdSignRequest) SetAlipayUserId(v string) *CreateWithholdSignRequest {
	s.AlipayUserId = &v
	return s
}

func (s *CreateWithholdSignRequest) SetReturnUrl(v string) *CreateWithholdSignRequest {
	s.ReturnUrl = &v
	return s
}

func (s *CreateWithholdSignRequest) SetUserOpenId(v string) *CreateWithholdSignRequest {
	s.UserOpenId = &v
	return s
}

func (s *CreateWithholdSignRequest) SetMerchantAppId(v string) *CreateWithholdSignRequest {
	s.MerchantAppId = &v
	return s
}

type CreateWithholdSignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签约字符串
	SignStr *string `json:"sign_str,omitempty" xml:"sign_str,omitempty"`
	// 签约字符串类型。SIGN_ONLY:仅签约;PAY_SIGN:支付并签约
	SignStrType *string `json:"sign_str_type,omitempty" xml:"sign_str_type,omitempty"`
}

func (s CreateWithholdSignResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateWithholdSignResponse) GoString() string {
	return s.String()
}

func (s *CreateWithholdSignResponse) SetReqMsgId(v string) *CreateWithholdSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateWithholdSignResponse) SetResultCode(v string) *CreateWithholdSignResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateWithholdSignResponse) SetResultMsg(v string) *CreateWithholdSignResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateWithholdSignResponse) SetSignStr(v string) *CreateWithholdSignResponse {
	s.SignStr = &v
	return s
}

func (s *CreateWithholdSignResponse) SetSignStrType(v string) *CreateWithholdSignResponse {
	s.SignStrType = &v
	return s
}

type QueryWithholdSignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
}

func (s QueryWithholdSignRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryWithholdSignRequest) GoString() string {
	return s.String()
}

func (s *QueryWithholdSignRequest) SetAuthToken(v string) *QueryWithholdSignRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryWithholdSignRequest) SetProductInstanceId(v string) *QueryWithholdSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryWithholdSignRequest) SetOrderId(v string) *QueryWithholdSignRequest {
	s.OrderId = &v
	return s
}

type QueryWithholdSignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 协议当前状态
	// 1. UNSIGNED：未签约
	// 2. SIGNED：已签约；
	// 3. TERMINATED：已解约
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 协议签署时间
	SignTime *string `json:"sign_time,omitempty" xml:"sign_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 协议生效时间
	ValidTime *string `json:"valid_time,omitempty" xml:"valid_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 协议失效时间
	InvalidTime *string `json:"invalid_time,omitempty" xml:"invalid_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 代扣协议号
	AgreementNo *string `json:"agreement_no,omitempty" xml:"agreement_no,omitempty"`
}

func (s QueryWithholdSignResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryWithholdSignResponse) GoString() string {
	return s.String()
}

func (s *QueryWithholdSignResponse) SetReqMsgId(v string) *QueryWithholdSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryWithholdSignResponse) SetResultCode(v string) *QueryWithholdSignResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryWithholdSignResponse) SetResultMsg(v string) *QueryWithholdSignResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryWithholdSignResponse) SetStatus(v string) *QueryWithholdSignResponse {
	s.Status = &v
	return s
}

func (s *QueryWithholdSignResponse) SetSignTime(v string) *QueryWithholdSignResponse {
	s.SignTime = &v
	return s
}

func (s *QueryWithholdSignResponse) SetValidTime(v string) *QueryWithholdSignResponse {
	s.ValidTime = &v
	return s
}

func (s *QueryWithholdSignResponse) SetInvalidTime(v string) *QueryWithholdSignResponse {
	s.InvalidTime = &v
	return s
}

func (s *QueryWithholdSignResponse) SetAgreementNo(v string) *QueryWithholdSignResponse {
	s.AgreementNo = &v
	return s
}

type UnbindWithholdSignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
}

func (s UnbindWithholdSignRequest) String() string {
	return tea.Prettify(s)
}

func (s UnbindWithholdSignRequest) GoString() string {
	return s.String()
}

func (s *UnbindWithholdSignRequest) SetAuthToken(v string) *UnbindWithholdSignRequest {
	s.AuthToken = &v
	return s
}

func (s *UnbindWithholdSignRequest) SetProductInstanceId(v string) *UnbindWithholdSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UnbindWithholdSignRequest) SetOrderId(v string) *UnbindWithholdSignRequest {
	s.OrderId = &v
	return s
}

type UnbindWithholdSignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UnbindWithholdSignResponse) String() string {
	return tea.Prettify(s)
}

func (s UnbindWithholdSignResponse) GoString() string {
	return s.String()
}

func (s *UnbindWithholdSignResponse) SetReqMsgId(v string) *UnbindWithholdSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UnbindWithholdSignResponse) SetResultCode(v string) *UnbindWithholdSignResponse {
	s.ResultCode = &v
	return s
}

func (s *UnbindWithholdSignResponse) SetResultMsg(v string) *UnbindWithholdSignResponse {
	s.ResultMsg = &v
	return s
}

type CancelWithholdPlanRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当发现跨天继续提交
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
	// 取消原因
	// RENTING_OUT:退租
	// RENTING_AND_RESALE:租转售
	//
	//
	CancelReason *string `json:"cancel_reason,omitempty" xml:"cancel_reason,omitempty" require:"true" maxLength:"64"`
}

func (s CancelWithholdPlanRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelWithholdPlanRequest) GoString() string {
	return s.String()
}

func (s *CancelWithholdPlanRequest) SetAuthToken(v string) *CancelWithholdPlanRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelWithholdPlanRequest) SetProductInstanceId(v string) *CancelWithholdPlanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelWithholdPlanRequest) SetOrderId(v string) *CancelWithholdPlanRequest {
	s.OrderId = &v
	return s
}

func (s *CancelWithholdPlanRequest) SetCancelReason(v string) *CancelWithholdPlanRequest {
	s.CancelReason = &v
	return s
}

type CancelWithholdPlanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CancelWithholdPlanResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelWithholdPlanResponse) GoString() string {
	return s.String()
}

func (s *CancelWithholdPlanResponse) SetReqMsgId(v string) *CancelWithholdPlanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelWithholdPlanResponse) SetResultCode(v string) *CancelWithholdPlanResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelWithholdPlanResponse) SetResultMsg(v string) *CancelWithholdPlanResponse {
	s.ResultMsg = &v
	return s
}

type RepayWithholdPlanRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
	// 第几期，单期取消必填
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" minimum:"1"`
	// 取消订单某一期代扣计划中以其他方式还款金额，单位为分，单期取消必填
	GmtPay *string `json:"gmt_pay,omitempty" xml:"gmt_pay,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 取消订单某一期代扣计划中以其他方式还款金额，单位为分
	PayOffAmount *int64 `json:"pay_off_amount,omitempty" xml:"pay_off_amount,omitempty" minimum:"0"`
	// 变更其他方式还款
	// WECHAT:微信;
	// BANK:银行
	// ALIPAY:支付宝
	PayOffType *string `json:"pay_off_type,omitempty" xml:"pay_off_type,omitempty" maxLength:"64"`
	// 通过其他方式还款单号;例如银行流水号或微信流水号
	PayOffNo *string `json:"pay_off_no,omitempty" xml:"pay_off_no,omitempty" maxLength:"64"`
	// 其他方式还款银行名称，还款方式为银行时必填
	PayOffBankName *string `json:"pay_off_bank_name,omitempty" xml:"pay_off_bank_name,omitempty" maxLength:"64"`
	// 操作，默认为单期取消；
	// 多期取消：MULTI_CANCEL
	// 单期取消：SINGLE_CANCEL
	Operation *string `json:"operation,omitempty" xml:"operation,omitempty" maxLength:"64" minLength:"0"`
	// 取消列表，多期取消必填
	CancelList []*SingleCancelModel `json:"cancel_list,omitempty" xml:"cancel_list,omitempty" type:"Repeated"`
}

func (s RepayWithholdPlanRequest) String() string {
	return tea.Prettify(s)
}

func (s RepayWithholdPlanRequest) GoString() string {
	return s.String()
}

func (s *RepayWithholdPlanRequest) SetAuthToken(v string) *RepayWithholdPlanRequest {
	s.AuthToken = &v
	return s
}

func (s *RepayWithholdPlanRequest) SetProductInstanceId(v string) *RepayWithholdPlanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RepayWithholdPlanRequest) SetOrderId(v string) *RepayWithholdPlanRequest {
	s.OrderId = &v
	return s
}

func (s *RepayWithholdPlanRequest) SetPeriodNum(v int64) *RepayWithholdPlanRequest {
	s.PeriodNum = &v
	return s
}

func (s *RepayWithholdPlanRequest) SetGmtPay(v string) *RepayWithholdPlanRequest {
	s.GmtPay = &v
	return s
}

func (s *RepayWithholdPlanRequest) SetPayOffAmount(v int64) *RepayWithholdPlanRequest {
	s.PayOffAmount = &v
	return s
}

func (s *RepayWithholdPlanRequest) SetPayOffType(v string) *RepayWithholdPlanRequest {
	s.PayOffType = &v
	return s
}

func (s *RepayWithholdPlanRequest) SetPayOffNo(v string) *RepayWithholdPlanRequest {
	s.PayOffNo = &v
	return s
}

func (s *RepayWithholdPlanRequest) SetPayOffBankName(v string) *RepayWithholdPlanRequest {
	s.PayOffBankName = &v
	return s
}

func (s *RepayWithholdPlanRequest) SetOperation(v string) *RepayWithholdPlanRequest {
	s.Operation = &v
	return s
}

func (s *RepayWithholdPlanRequest) SetCancelList(v []*SingleCancelModel) *RepayWithholdPlanRequest {
	s.CancelList = v
	return s
}

type RepayWithholdPlanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RepayWithholdPlanResponse) String() string {
	return tea.Prettify(s)
}

func (s RepayWithholdPlanResponse) GoString() string {
	return s.String()
}

func (s *RepayWithholdPlanResponse) SetReqMsgId(v string) *RepayWithholdPlanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RepayWithholdPlanResponse) SetResultCode(v string) *RepayWithholdPlanResponse {
	s.ResultCode = &v
	return s
}

func (s *RepayWithholdPlanResponse) SetResultMsg(v string) *RepayWithholdPlanResponse {
	s.ResultMsg = &v
	return s
}

type RetryWithholdPlanRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
	// 第几期
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" require:"true" minimum:"1"`
}

func (s RetryWithholdPlanRequest) String() string {
	return tea.Prettify(s)
}

func (s RetryWithholdPlanRequest) GoString() string {
	return s.String()
}

func (s *RetryWithholdPlanRequest) SetAuthToken(v string) *RetryWithholdPlanRequest {
	s.AuthToken = &v
	return s
}

func (s *RetryWithholdPlanRequest) SetProductInstanceId(v string) *RetryWithholdPlanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RetryWithholdPlanRequest) SetOrderId(v string) *RetryWithholdPlanRequest {
	s.OrderId = &v
	return s
}

func (s *RetryWithholdPlanRequest) SetPeriodNum(v int64) *RetryWithholdPlanRequest {
	s.PeriodNum = &v
	return s
}

type RetryWithholdPlanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RetryWithholdPlanResponse) String() string {
	return tea.Prettify(s)
}

func (s RetryWithholdPlanResponse) GoString() string {
	return s.String()
}

func (s *RetryWithholdPlanResponse) SetReqMsgId(v string) *RetryWithholdPlanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RetryWithholdPlanResponse) SetResultCode(v string) *RetryWithholdPlanResponse {
	s.ResultCode = &v
	return s
}

func (s *RetryWithholdPlanResponse) SetResultMsg(v string) *RetryWithholdPlanResponse {
	s.ResultMsg = &v
	return s
}

type ConfirmWithholdSignasyncunsignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 操作动作
	// 同意：AGREE
	// 拒绝：REFUSE
	Operate *string `json:"operate,omitempty" xml:"operate,omitempty" require:"true" maxLength:"16" minLength:"1"`
	// 拒绝原因码,商户拒绝时必填。
	// USER_OWE_MONEY：用户账户存在欠费订单
	// USER_IN_SERVICE：用户有进行的订单
	RefuseReasonCode *string `json:"refuse_reason_code,omitempty" xml:"refuse_reason_code,omitempty" maxLength:"16" minLength:"1"`
	// 用户欠款金额，单位为分
	// refuse_reason_code=USER_OWE_MONEY时必填
	UserOweMoney *int64 `json:"user_owe_money,omitempty" xml:"user_owe_money,omitempty" minimum:"1"`
	// 用户进行中的服务
	// refuse_reason_code=USER_IN_SERVICE时必填
	UserInService *string `json:"user_in_service,omitempty" xml:"user_in_service,omitempty" maxLength:"128" minLength:"1"`
}

func (s ConfirmWithholdSignasyncunsignRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmWithholdSignasyncunsignRequest) GoString() string {
	return s.String()
}

func (s *ConfirmWithholdSignasyncunsignRequest) SetAuthToken(v string) *ConfirmWithholdSignasyncunsignRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmWithholdSignasyncunsignRequest) SetProductInstanceId(v string) *ConfirmWithholdSignasyncunsignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ConfirmWithholdSignasyncunsignRequest) SetOrderId(v string) *ConfirmWithholdSignasyncunsignRequest {
	s.OrderId = &v
	return s
}

func (s *ConfirmWithholdSignasyncunsignRequest) SetOperate(v string) *ConfirmWithholdSignasyncunsignRequest {
	s.Operate = &v
	return s
}

func (s *ConfirmWithholdSignasyncunsignRequest) SetRefuseReasonCode(v string) *ConfirmWithholdSignasyncunsignRequest {
	s.RefuseReasonCode = &v
	return s
}

func (s *ConfirmWithholdSignasyncunsignRequest) SetUserOweMoney(v int64) *ConfirmWithholdSignasyncunsignRequest {
	s.UserOweMoney = &v
	return s
}

func (s *ConfirmWithholdSignasyncunsignRequest) SetUserInService(v string) *ConfirmWithholdSignasyncunsignRequest {
	s.UserInService = &v
	return s
}

type ConfirmWithholdSignasyncunsignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ConfirmWithholdSignasyncunsignResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmWithholdSignasyncunsignResponse) GoString() string {
	return s.String()
}

func (s *ConfirmWithholdSignasyncunsignResponse) SetReqMsgId(v string) *ConfirmWithholdSignasyncunsignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmWithholdSignasyncunsignResponse) SetResultCode(v string) *ConfirmWithholdSignasyncunsignResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmWithholdSignasyncunsignResponse) SetResultMsg(v string) *ConfirmWithholdSignasyncunsignResponse {
	s.ResultMsg = &v
	return s
}

type CreateWithholdActivepayRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
	// 第几期,当支付类型为PERFORMANCE或为空必填
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" minimum:"1"`
	// 支付类型
	PayType *string `json:"pay_type,omitempty" xml:"pay_type,omitempty" maxLength:"64" minLength:"1"`
	// 支付渠道，非必填。可选值：JSAPI-JSAPI支付，APP-APP支付。默认值：JSAPI
	PayChannel *string `json:"pay_channel,omitempty" xml:"pay_channel,omitempty" maxLength:"64" minLength:"1"`
	// 支付金额，单位为分
	PayAmount *int64 `json:"pay_amount,omitempty" xml:"pay_amount,omitempty" minimum:"1"`
	// 经营分账标识Y/N
	// 当pay_type=BUYOUT、PENALTY必填。
	OperationDivideFlag *string `json:"operation_divide_flag,omitempty" xml:"operation_divide_flag,omitempty" maxLength:"1" minLength:"1"`
	// 当operation_divide_flag=Y 必填
	// 经营分账收入列表，最多10条，分账比例与正常限制一致。
	OperationDivideTransInList []*OperationDivideTransInModel `json:"operation_divide_trans_in_list,omitempty" xml:"operation_divide_trans_in_list,omitempty" type:"Repeated"`
}

func (s CreateWithholdActivepayRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateWithholdActivepayRequest) GoString() string {
	return s.String()
}

func (s *CreateWithholdActivepayRequest) SetAuthToken(v string) *CreateWithholdActivepayRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateWithholdActivepayRequest) SetProductInstanceId(v string) *CreateWithholdActivepayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateWithholdActivepayRequest) SetOrderId(v string) *CreateWithholdActivepayRequest {
	s.OrderId = &v
	return s
}

func (s *CreateWithholdActivepayRequest) SetPeriodNum(v int64) *CreateWithholdActivepayRequest {
	s.PeriodNum = &v
	return s
}

func (s *CreateWithholdActivepayRequest) SetPayType(v string) *CreateWithholdActivepayRequest {
	s.PayType = &v
	return s
}

func (s *CreateWithholdActivepayRequest) SetPayChannel(v string) *CreateWithholdActivepayRequest {
	s.PayChannel = &v
	return s
}

func (s *CreateWithholdActivepayRequest) SetPayAmount(v int64) *CreateWithholdActivepayRequest {
	s.PayAmount = &v
	return s
}

func (s *CreateWithholdActivepayRequest) SetOperationDivideFlag(v string) *CreateWithholdActivepayRequest {
	s.OperationDivideFlag = &v
	return s
}

func (s *CreateWithholdActivepayRequest) SetOperationDivideTransInList(v []*OperationDivideTransInModel) *CreateWithholdActivepayRequest {
	s.OperationDivideTransInList = v
	return s
}

type CreateWithholdActivepayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 支付宝支付订单号，用于拉起主动支付页面
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
	// 签名字符串，用于APP支付场景，客户端唤起支付宝收银台使用。
	OrderStr *string `json:"order_str,omitempty" xml:"order_str,omitempty"`
}

func (s CreateWithholdActivepayResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateWithholdActivepayResponse) GoString() string {
	return s.String()
}

func (s *CreateWithholdActivepayResponse) SetReqMsgId(v string) *CreateWithholdActivepayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateWithholdActivepayResponse) SetResultCode(v string) *CreateWithholdActivepayResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateWithholdActivepayResponse) SetResultMsg(v string) *CreateWithholdActivepayResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateWithholdActivepayResponse) SetTradeNo(v string) *CreateWithholdActivepayResponse {
	s.TradeNo = &v
	return s
}

func (s *CreateWithholdActivepayResponse) SetOrderStr(v string) *CreateWithholdActivepayResponse {
	s.OrderStr = &v
	return s
}

type QueryWithholdActivepayRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 第几期,当支付类型为PERFORMANCE或为空必填
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" minimum:"1"`
	// 支付宝支付订单号，当传递此单号时，只会返回当前单据
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty" maxLength:"64"`
	// 支付类型
	PayType *string `json:"pay_type,omitempty" xml:"pay_type,omitempty" maxLength:"64" minLength:"1"`
	// 支付渠道，非必填。可选值：JSAPI-JSAPI支付，APP-APP支付。默认值：JSAPI
	PayChannel *string `json:"pay_channel,omitempty" xml:"pay_channel,omitempty" maxLength:"64"`
}

func (s QueryWithholdActivepayRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryWithholdActivepayRequest) GoString() string {
	return s.String()
}

func (s *QueryWithholdActivepayRequest) SetAuthToken(v string) *QueryWithholdActivepayRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryWithholdActivepayRequest) SetProductInstanceId(v string) *QueryWithholdActivepayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryWithholdActivepayRequest) SetOrderId(v string) *QueryWithholdActivepayRequest {
	s.OrderId = &v
	return s
}

func (s *QueryWithholdActivepayRequest) SetPeriodNum(v int64) *QueryWithholdActivepayRequest {
	s.PeriodNum = &v
	return s
}

func (s *QueryWithholdActivepayRequest) SetTradeNo(v string) *QueryWithholdActivepayRequest {
	s.TradeNo = &v
	return s
}

func (s *QueryWithholdActivepayRequest) SetPayType(v string) *QueryWithholdActivepayRequest {
	s.PayType = &v
	return s
}

func (s *QueryWithholdActivepayRequest) SetPayChannel(v string) *QueryWithholdActivepayRequest {
	s.PayChannel = &v
	return s
}

type QueryWithholdActivepayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前支付单
	CurrentOrder *ActivePayOrder `json:"current_order,omitempty" xml:"current_order,omitempty"`
	// 主动支付单列表，当不通过trade_no查询时有值
	Orders []*ActivePayOrder `json:"orders,omitempty" xml:"orders,omitempty" type:"Repeated"`
}

func (s QueryWithholdActivepayResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryWithholdActivepayResponse) GoString() string {
	return s.String()
}

func (s *QueryWithholdActivepayResponse) SetReqMsgId(v string) *QueryWithholdActivepayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryWithholdActivepayResponse) SetResultCode(v string) *QueryWithholdActivepayResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryWithholdActivepayResponse) SetResultMsg(v string) *QueryWithholdActivepayResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryWithholdActivepayResponse) SetCurrentOrder(v *ActivePayOrder) *QueryWithholdActivepayResponse {
	s.CurrentOrder = v
	return s
}

func (s *QueryWithholdActivepayResponse) SetOrders(v []*ActivePayOrder) *QueryWithholdActivepayResponse {
	s.Orders = v
	return s
}

type CancelWithholdActivepayRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 第几期
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" require:"true"`
	// 支付宝支付订单号，当传递此单号时，只会取消指定单据号，不传递时取消当前代扣
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
}

func (s CancelWithholdActivepayRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelWithholdActivepayRequest) GoString() string {
	return s.String()
}

func (s *CancelWithholdActivepayRequest) SetAuthToken(v string) *CancelWithholdActivepayRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelWithholdActivepayRequest) SetProductInstanceId(v string) *CancelWithholdActivepayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelWithholdActivepayRequest) SetOrderId(v string) *CancelWithholdActivepayRequest {
	s.OrderId = &v
	return s
}

func (s *CancelWithholdActivepayRequest) SetPeriodNum(v int64) *CancelWithholdActivepayRequest {
	s.PeriodNum = &v
	return s
}

func (s *CancelWithholdActivepayRequest) SetTradeNo(v string) *CancelWithholdActivepayRequest {
	s.TradeNo = &v
	return s
}

type CancelWithholdActivepayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 取消的单号
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
}

func (s CancelWithholdActivepayResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelWithholdActivepayResponse) GoString() string {
	return s.String()
}

func (s *CancelWithholdActivepayResponse) SetReqMsgId(v string) *CancelWithholdActivepayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelWithholdActivepayResponse) SetResultCode(v string) *CancelWithholdActivepayResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelWithholdActivepayResponse) SetResultMsg(v string) *CancelWithholdActivepayResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelWithholdActivepayResponse) SetTradeNo(v string) *CancelWithholdActivepayResponse {
	s.TradeNo = &v
	return s
}

type CreateWithholdRefundRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 第几期
	// 针对用户履约的第几期进行退款申请
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" minimum:"1"`
	// 外部系统传入的退款请求号
	RefundRequestNo *string `json:"refund_request_no,omitempty" xml:"refund_request_no,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 本次请求的退款金额，单位为分
	// 1234=12.34元
	RefundMoney *int64 `json:"refund_money,omitempty" xml:"refund_money,omitempty" require:"true" minimum:"1"`
	// 退款原因
	RefundReason *string `json:"refund_reason,omitempty" xml:"refund_reason,omitempty" maxLength:"200"`
	// 支付类型
	// ORDER_BUYOUT:买断金
	// ORDER_PENALTY:违约金
	// PERFORMANCE:正常履约（默认）
	PayType *string `json:"pay_type,omitempty" xml:"pay_type,omitempty" maxLength:"64"`
}

func (s CreateWithholdRefundRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateWithholdRefundRequest) GoString() string {
	return s.String()
}

func (s *CreateWithholdRefundRequest) SetAuthToken(v string) *CreateWithholdRefundRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateWithholdRefundRequest) SetProductInstanceId(v string) *CreateWithholdRefundRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateWithholdRefundRequest) SetOrderId(v string) *CreateWithholdRefundRequest {
	s.OrderId = &v
	return s
}

func (s *CreateWithholdRefundRequest) SetPeriodNum(v int64) *CreateWithholdRefundRequest {
	s.PeriodNum = &v
	return s
}

func (s *CreateWithholdRefundRequest) SetRefundRequestNo(v string) *CreateWithholdRefundRequest {
	s.RefundRequestNo = &v
	return s
}

func (s *CreateWithholdRefundRequest) SetRefundMoney(v int64) *CreateWithholdRefundRequest {
	s.RefundMoney = &v
	return s
}

func (s *CreateWithholdRefundRequest) SetRefundReason(v string) *CreateWithholdRefundRequest {
	s.RefundReason = &v
	return s
}

func (s *CreateWithholdRefundRequest) SetPayType(v string) *CreateWithholdRefundRequest {
	s.PayType = &v
	return s
}

type CreateWithholdRefundResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 外部系统传入的退款请求号
	RefundRequestNo *string `json:"refund_request_no,omitempty" xml:"refund_request_no,omitempty"`
	// ACCEPT : 受理成功
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 请求支付宝的退款单据号
	RefundOrderNo *string `json:"refund_order_no,omitempty" xml:"refund_order_no,omitempty"`
}

func (s CreateWithholdRefundResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateWithholdRefundResponse) GoString() string {
	return s.String()
}

func (s *CreateWithholdRefundResponse) SetReqMsgId(v string) *CreateWithholdRefundResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateWithholdRefundResponse) SetResultCode(v string) *CreateWithholdRefundResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateWithholdRefundResponse) SetResultMsg(v string) *CreateWithholdRefundResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateWithholdRefundResponse) SetRefundRequestNo(v string) *CreateWithholdRefundResponse {
	s.RefundRequestNo = &v
	return s
}

func (s *CreateWithholdRefundResponse) SetStatus(v string) *CreateWithholdRefundResponse {
	s.Status = &v
	return s
}

func (s *CreateWithholdRefundResponse) SetRefundOrderNo(v string) *CreateWithholdRefundResponse {
	s.RefundOrderNo = &v
	return s
}

type QueryWithholdRefundRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 几期
	// 针对用户履约的第几期进行退款申请
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" minimum:"1"`
	// 外部系统传入的退款请求号
	RefundRequestNo *string `json:"refund_request_no,omitempty" xml:"refund_request_no,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 支付类型
	// ORDER_BUYOUT:买断金
	// ORDER_PENALTY:违约金
	// PERFORMANCE:正常履约（默认）
	PayType *string `json:"pay_type,omitempty" xml:"pay_type,omitempty" maxLength:"64"`
}

func (s QueryWithholdRefundRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryWithholdRefundRequest) GoString() string {
	return s.String()
}

func (s *QueryWithholdRefundRequest) SetAuthToken(v string) *QueryWithholdRefundRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryWithholdRefundRequest) SetProductInstanceId(v string) *QueryWithholdRefundRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryWithholdRefundRequest) SetOrderId(v string) *QueryWithholdRefundRequest {
	s.OrderId = &v
	return s
}

func (s *QueryWithholdRefundRequest) SetPeriodNum(v int64) *QueryWithholdRefundRequest {
	s.PeriodNum = &v
	return s
}

func (s *QueryWithholdRefundRequest) SetRefundRequestNo(v string) *QueryWithholdRefundRequest {
	s.RefundRequestNo = &v
	return s
}

func (s *QueryWithholdRefundRequest) SetPayType(v string) *QueryWithholdRefundRequest {
	s.PayType = &v
	return s
}

type QueryWithholdRefundResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 外部系统传入的退款请求号
	RefundRequestNo *string `json:"refund_request_no,omitempty" xml:"refund_request_no,omitempty"`
	// 请求支付宝的退款单据号
	RefundOrderNo *string `json:"refund_order_no,omitempty" xml:"refund_order_no,omitempty"`
	// 退款请求状态
	// ● ACCEPT: 受理成功
	// ● PENDING: 需人工介入
	// ● SUCCESS: 成功
	// ● FAILED : 失败
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 退款失败原因
	RefundErrorMsg *string `json:"refund_error_msg,omitempty" xml:"refund_error_msg,omitempty"`
	// 本笔交易总退款金额，单位为分
	// 12300=123元
	TotalRefundAmount *int64 `json:"total_refund_amount,omitempty" xml:"total_refund_amount,omitempty"`
	// 本次退款申请的实际退款金额，单位为分
	// 12300=123元
	SendBackAmount *int64 `json:"send_back_amount,omitempty" xml:"send_back_amount,omitempty"`
	// 实际退款时间,13位时间戳（毫秒）
	GmtRefundPay *int64 `json:"gmt_refund_pay,omitempty" xml:"gmt_refund_pay,omitempty"`
}

func (s QueryWithholdRefundResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryWithholdRefundResponse) GoString() string {
	return s.String()
}

func (s *QueryWithholdRefundResponse) SetReqMsgId(v string) *QueryWithholdRefundResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetResultCode(v string) *QueryWithholdRefundResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetResultMsg(v string) *QueryWithholdRefundResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetRefundRequestNo(v string) *QueryWithholdRefundResponse {
	s.RefundRequestNo = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetRefundOrderNo(v string) *QueryWithholdRefundResponse {
	s.RefundOrderNo = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetStatus(v string) *QueryWithholdRefundResponse {
	s.Status = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetRefundErrorMsg(v string) *QueryWithholdRefundResponse {
	s.RefundErrorMsg = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetTotalRefundAmount(v int64) *QueryWithholdRefundResponse {
	s.TotalRefundAmount = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetSendBackAmount(v int64) *QueryWithholdRefundResponse {
	s.SendBackAmount = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetGmtRefundPay(v int64) *QueryWithholdRefundResponse {
	s.GmtRefundPay = &v
	return s
}

type QueryWithholdCompensateaccountRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 资方社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 资方租户id
	FundTenantId *string `json:"fund_tenant_id,omitempty" xml:"fund_tenant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s QueryWithholdCompensateaccountRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryWithholdCompensateaccountRequest) GoString() string {
	return s.String()
}

func (s *QueryWithholdCompensateaccountRequest) SetAuthToken(v string) *QueryWithholdCompensateaccountRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryWithholdCompensateaccountRequest) SetProductInstanceId(v string) *QueryWithholdCompensateaccountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryWithholdCompensateaccountRequest) SetMerchantId(v string) *QueryWithholdCompensateaccountRequest {
	s.MerchantId = &v
	return s
}

func (s *QueryWithholdCompensateaccountRequest) SetFundId(v string) *QueryWithholdCompensateaccountRequest {
	s.FundId = &v
	return s
}

func (s *QueryWithholdCompensateaccountRequest) SetFundTenantId(v string) *QueryWithholdCompensateaccountRequest {
	s.FundTenantId = &v
	return s
}

type QueryWithholdCompensateaccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 代偿卡号
	CardNo *string `json:"card_no,omitempty" xml:"card_no,omitempty"`
	// 可用余额，单位为分
	AvailableAmount *int64 `json:"available_amount,omitempty" xml:"available_amount,omitempty"`
}

func (s QueryWithholdCompensateaccountResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryWithholdCompensateaccountResponse) GoString() string {
	return s.String()
}

func (s *QueryWithholdCompensateaccountResponse) SetReqMsgId(v string) *QueryWithholdCompensateaccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryWithholdCompensateaccountResponse) SetResultCode(v string) *QueryWithholdCompensateaccountResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryWithholdCompensateaccountResponse) SetResultMsg(v string) *QueryWithholdCompensateaccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryWithholdCompensateaccountResponse) SetCardNo(v string) *QueryWithholdCompensateaccountResponse {
	s.CardNo = &v
	return s
}

func (s *QueryWithholdCompensateaccountResponse) SetAvailableAmount(v int64) *QueryWithholdCompensateaccountResponse {
	s.AvailableAmount = &v
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
				"sdk_version":      tea.String("1.14.4"),
				"_prod_code":       tea.String("ATO"),
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
 * Description: 分账流水同步
 * Summary: 【仅测试环境生效】分账流水同步
 */
func (client *Client) SyncFundSplitting(request *SyncFundSplittingRequest) (_result *SyncFundSplittingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncFundSplittingResponse{}
	_body, _err := client.SyncFundSplittingEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分账流水同步
 * Summary: 【仅测试环境生效】分账流水同步
 */
func (client *Client) SyncFundSplittingEx(request *SyncFundSplittingRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncFundSplittingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncFundSplittingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.splitting.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提供给融资资金方，用以订单融资结果同步
 * Summary: 【废弃】订单融资结果同步
 */
func (client *Client) SyncFundOrderfinancial(request *SyncFundOrderfinancialRequest) (_result *SyncFundOrderfinancialResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncFundOrderfinancialResponse{}
	_body, _err := client.SyncFundOrderfinancialEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提供给融资资金方，用以订单融资结果同步
 * Summary: 【废弃】订单融资结果同步
 */
func (client *Client) SyncFundOrderfinancialEx(request *SyncFundOrderfinancialRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncFundOrderfinancialResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncFundOrderfinancialResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.orderfinancial.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 同步租赁订单的代扣协议
 * Summary: 【仅测试环境生效】同步租赁订单的代扣协议
 */
func (client *Client) SyncFundWithholdingcontract(request *SyncFundWithholdingcontractRequest) (_result *SyncFundWithholdingcontractResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncFundWithholdingcontractResponse{}
	_body, _err := client.SyncFundWithholdingcontractEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 同步租赁订单的代扣协议
 * Summary: 【仅测试环境生效】同步租赁订单的代扣协议
 */
func (client *Client) SyncFundWithholdingcontractEx(request *SyncFundWithholdingcontractRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncFundWithholdingcontractResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncFundWithholdingcontractResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.withholdingcontract.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资方回传一条订单还款履约信息
 * Summary: 【仅测试环境生效】同步订单还款履约信息
 */
func (client *Client) SyncFundOrderfulfillment(request *SyncFundOrderfulfillmentRequest) (_result *SyncFundOrderfulfillmentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncFundOrderfulfillmentResponse{}
	_body, _err := client.SyncFundOrderfulfillmentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资方回传一条订单还款履约信息
 * Summary: 【仅测试环境生效】同步订单还款履约信息
 */
func (client *Client) SyncFundOrderfulfillmentEx(request *SyncFundOrderfulfillmentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncFundOrderfulfillmentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncFundOrderfulfillmentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.orderfulfillment.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取订单的履约信息
 * Summary: 【仅测试环境生效】获取订单的履约信息
 */
func (client *Client) GetFundOrderfulfillment(request *GetFundOrderfulfillmentRequest) (_result *GetFundOrderfulfillmentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetFundOrderfulfillmentResponse{}
	_body, _err := client.GetFundOrderfulfillmentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取订单的履约信息
 * Summary: 【仅测试环境生效】获取订单的履约信息
 */
func (client *Client) GetFundOrderfulfillmentEx(request *GetFundOrderfulfillmentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetFundOrderfulfillmentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetFundOrderfulfillmentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.orderfulfillment.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于资方将盖章后的合同文件上传
 * Summary: 资方合同文件上传接口
 */
func (client *Client) UploadFundFlow(request *UploadFundFlowRequest) (_result *UploadFundFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadFundFlowResponse{}
	_body, _err := client.UploadFundFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于资方将盖章后的合同文件上传
 * Summary: 资方合同文件上传接口
 */
func (client *Client) UploadFundFlowEx(request *UploadFundFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadFundFlowResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.ato.fund.flow.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadFundFlowResponse := &UploadFundFlowResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadFundFlowResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
		request.FileObject = nil
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadFundFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.flow.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取商户签署后的合同文件，用于资方签署落章
 * Summary: 资方合同文件获取接口
 */
func (client *Client) GetFundFlow(request *GetFundFlowRequest) (_result *GetFundFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetFundFlowResponse{}
	_body, _err := client.GetFundFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取商户签署后的合同文件，用于资方签署落章
 * Summary: 资方合同文件获取接口
 */
func (client *Client) GetFundFlowEx(request *GetFundFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetFundFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetFundFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.flow.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
 * Summary: 资方合同签署状态通知
 */
func (client *Client) RefuseFundFlow(request *RefuseFundFlowRequest) (_result *RefuseFundFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RefuseFundFlowResponse{}
	_body, _err := client.RefuseFundFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
 * Summary: 资方合同签署状态通知
 */
func (client *Client) RefuseFundFlowEx(request *RefuseFundFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RefuseFundFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RefuseFundFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.flow.refuse"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资方调用，授权通过e签宝进行落签
 * Summary: 资方e签宝落签接口
 */
func (client *Client) AuthFundFlow(request *AuthFundFlowRequest) (_result *AuthFundFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthFundFlowResponse{}
	_body, _err := client.AuthFundFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资方调用，授权通过e签宝进行落签
 * Summary: 资方e签宝落签接口
 */
func (client *Client) AuthFundFlowEx(request *AuthFundFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthFundFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthFundFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.flow.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资方调用，取消商户履约计划
 * Summary: 商户履约计划取消
 */
func (client *Client) CancelFundPlan(request *CancelFundPlanRequest) (_result *CancelFundPlanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelFundPlanResponse{}
	_body, _err := client.CancelFundPlanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资方调用，取消商户履约计划
 * Summary: 商户履约计划取消
 */
func (client *Client) CancelFundPlanEx(request *CancelFundPlanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelFundPlanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelFundPlanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.plan.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通知回调
 * Summary: 通知回调
 */
func (client *Client) CallbackFundNotify(request *CallbackFundNotifyRequest) (_result *CallbackFundNotifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackFundNotifyResponse{}
	_body, _err := client.CallbackFundNotifyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通知回调
 * Summary: 通知回调
 */
func (client *Client) CallbackFundNotifyEx(request *CallbackFundNotifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackFundNotifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackFundNotifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.notify.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户还款承诺同步
 * Summary: 商户还款承诺同步
 */
func (client *Client) SyncFundMerchantpromise(request *SyncFundMerchantpromiseRequest) (_result *SyncFundMerchantpromiseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncFundMerchantpromiseResponse{}
	_body, _err := client.SyncFundMerchantpromiseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户还款承诺同步
 * Summary: 商户还款承诺同步
 */
func (client *Client) SyncFundMerchantpromiseEx(request *SyncFundMerchantpromiseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncFundMerchantpromiseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncFundMerchantpromiseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.merchantpromise.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 融资放款结果同步
 * Summary: 融资放款结果同步
 */
func (client *Client) SyncFundFinanceloanresults(request *SyncFundFinanceloanresultsRequest) (_result *SyncFundFinanceloanresultsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncFundFinanceloanresultsResponse{}
	_body, _err := client.SyncFundFinanceloanresultsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 融资放款结果同步
 * Summary: 融资放款结果同步
 */
func (client *Client) SyncFundFinanceloanresultsEx(request *SyncFundFinanceloanresultsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncFundFinanceloanresultsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncFundFinanceloanresultsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.financeloanresults.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询用户承诺
 * Summary: 查询用户承诺
 */
func (client *Client) GetFundUserpromise(request *GetFundUserpromiseRequest) (_result *GetFundUserpromiseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetFundUserpromiseResponse{}
	_body, _err := client.GetFundUserpromiseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询用户承诺
 * Summary: 查询用户承诺
 */
func (client *Client) GetFundUserpromiseEx(request *GetFundUserpromiseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetFundUserpromiseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetFundUserpromiseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.userpromise.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户履约信息查询（履约承诺+履约记录）
 * Summary: 用户履约信息查询（履约承诺+履约记录）
 */
func (client *Client) GetFundUserperformance(request *GetFundUserperformanceRequest) (_result *GetFundUserperformanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetFundUserperformanceResponse{}
	_body, _err := client.GetFundUserperformanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户履约信息查询（履约承诺+履约记录）
 * Summary: 用户履约信息查询（履约承诺+履约记录）
 */
func (client *Client) GetFundUserperformanceEx(request *GetFundUserperformanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetFundUserperformanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetFundUserperformanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.userperformance.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户履约信息查询（履约承诺+履约记录）
 * Summary: 商户履约信息查询（履约承诺+履约记录）
 */
func (client *Client) GetFundMerchantperformance(request *GetFundMerchantperformanceRequest) (_result *GetFundMerchantperformanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetFundMerchantperformanceResponse{}
	_body, _err := client.GetFundMerchantperformanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户履约信息查询（履约承诺+履约记录）
 * Summary: 商户履约信息查询（履约承诺+履约记录）
 */
func (client *Client) GetFundMerchantperformanceEx(request *GetFundMerchantperformanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetFundMerchantperformanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetFundMerchantperformanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.merchantperformance.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资方查询订单详情
 * Summary: 资方查询订单详情
 */
func (client *Client) GetFundOrderfullinfo(request *GetFundOrderfullinfoRequest) (_result *GetFundOrderfullinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetFundOrderfullinfoResponse{}
	_body, _err := client.GetFundOrderfullinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资方查询订单详情
 * Summary: 资方查询订单详情
 */
func (client *Client) GetFundOrderfullinfoEx(request *GetFundOrderfullinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetFundOrderfullinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetFundOrderfullinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.orderfullinfo.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
 * Summary: 资方合同文件已上传确认接口
 */
func (client *Client) NotifyFundFlow(request *NotifyFundFlowRequest) (_result *NotifyFundFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &NotifyFundFlowResponse{}
	_body, _err := client.NotifyFundFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
 * Summary: 资方合同文件已上传确认接口
 */
func (client *Client) NotifyFundFlowEx(request *NotifyFundFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *NotifyFundFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &NotifyFundFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.flow.notify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资方资产凭证上传，可以是文本或文件
 * Summary: 资方资产凭证上传
 */
func (client *Client) UploadFundCredit(request *UploadFundCreditRequest) (_result *UploadFundCreditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadFundCreditResponse{}
	_body, _err := client.UploadFundCreditEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资方资产凭证上传，可以是文本或文件
 * Summary: 资方资产凭证上传
 */
func (client *Client) UploadFundCreditEx(request *UploadFundCreditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadFundCreditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadFundCreditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.credit.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资方资产凭证查询，需要提供订单号或资产包号
 * Summary: 资方资产凭证查询
 */
func (client *Client) QueryFundCredit(request *QueryFundCreditRequest) (_result *QueryFundCreditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFundCreditResponse{}
	_body, _err := client.QueryFundCreditEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资方资产凭证查询，需要提供订单号或资产包号
 * Summary: 资方资产凭证查询
 */
func (client *Client) QueryFundCreditEx(request *QueryFundCreditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFundCreditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFundCreditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.credit.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 融资预审结果同步
 * Summary: 融资预审结果同步
 */
func (client *Client) SyncFundFinanceprecheckresult(request *SyncFundFinanceprecheckresultRequest) (_result *SyncFundFinanceprecheckresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncFundFinanceprecheckresultResponse{}
	_body, _err := client.SyncFundFinanceprecheckresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 融资预审结果同步
 * Summary: 融资预审结果同步
 */
func (client *Client) SyncFundFinanceprecheckresultEx(request *SyncFundFinanceprecheckresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncFundFinanceprecheckresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncFundFinanceprecheckresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.financeprecheckresult.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资方查询代偿户余额
 * Summary: 代偿户查询
 */
func (client *Client) QueryFundCompensateaccount(request *QueryFundCompensateaccountRequest) (_result *QueryFundCompensateaccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFundCompensateaccountResponse{}
	_body, _err := client.QueryFundCompensateaccountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资方查询代偿户余额
 * Summary: 代偿户查询
 */
func (client *Client) QueryFundCompensateaccountEx(request *QueryFundCompensateaccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFundCompensateaccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFundCompensateaccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.compensateaccount.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资方查询订单融资信息
 * Summary: 资方查询订单融资信息
 */
func (client *Client) GetFundOrderfinanceinfo(request *GetFundOrderfinanceinfoRequest) (_result *GetFundOrderfinanceinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetFundOrderfinanceinfoResponse{}
	_body, _err := client.GetFundOrderfinanceinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资方查询订单融资信息
 * Summary: 资方查询订单融资信息
 */
func (client *Client) GetFundOrderfinanceinfoEx(request *GetFundOrderfinanceinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetFundOrderfinanceinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetFundOrderfinanceinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.orderfinanceinfo.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 添加分账绑定关系
 * Summary: 添加分账绑定关系
 */
func (client *Client) AddFundDividerelation(request *AddFundDividerelationRequest) (_result *AddFundDividerelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddFundDividerelationResponse{}
	_body, _err := client.AddFundDividerelationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 添加分账绑定关系
 * Summary: 添加分账绑定关系
 */
func (client *Client) AddFundDividerelationEx(request *AddFundDividerelationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddFundDividerelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddFundDividerelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.dividerelation.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分账绑定关系查询
 * Summary: 分账绑定关系查询
 */
func (client *Client) QueryFundDividerelation(request *QueryFundDividerelationRequest) (_result *QueryFundDividerelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFundDividerelationResponse{}
	_body, _err := client.QueryFundDividerelationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分账绑定关系查询
 * Summary: 分账绑定关系查询
 */
func (client *Client) QueryFundDividerelationEx(request *QueryFundDividerelationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFundDividerelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFundDividerelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.dividerelation.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: ● 本接口获取用信授权
● 本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
 * Summary: 用信申请接口
*/
func (client *Client) ApplyFundCreditutilization(request *ApplyFundCreditutilizationRequest) (_result *ApplyFundCreditutilizationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyFundCreditutilizationResponse{}
	_body, _err := client.ApplyFundCreditutilizationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: ● 本接口获取用信授权
● 本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
 * Summary: 用信申请接口
*/
func (client *Client) ApplyFundCreditutilizationEx(request *ApplyFundCreditutilizationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyFundCreditutilizationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyFundCreditutilizationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.creditutilization.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 小贷融资用信申请订单履约信息
 * Summary: 用信申请订单履约信息
 */
func (client *Client) ApplyFundAssertorder(request *ApplyFundAssertorderRequest) (_result *ApplyFundAssertorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyFundAssertorderResponse{}
	_body, _err := client.ApplyFundAssertorderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 小贷融资用信申请订单履约信息
 * Summary: 用信申请订单履约信息
 */
func (client *Client) ApplyFundAssertorderEx(request *ApplyFundAssertorderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyFundAssertorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyFundAssertorderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.assertorder.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用信查询订单履约信息
 * Summary: 用信查询订单履约信息
 */
func (client *Client) QueryFundAssertorder(request *QueryFundAssertorderRequest) (_result *QueryFundAssertorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFundAssertorderResponse{}
	_body, _err := client.QueryFundAssertorderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用信查询订单履约信息
 * Summary: 用信查询订单履约信息
 */
func (client *Client) QueryFundAssertorderEx(request *QueryFundAssertorderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFundAssertorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFundAssertorderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.assertorder.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 调用说明：
● 本接口用于授信额度试算完成后同步授信结果。
 * Summary: 授信结果同步接口
*/
func (client *Client) SyncFundCreditgranting(request *SyncFundCreditgrantingRequest) (_result *SyncFundCreditgrantingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncFundCreditgrantingResponse{}
	_body, _err := client.SyncFundCreditgrantingEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 调用说明：
● 本接口用于授信额度试算完成后同步授信结果。
 * Summary: 授信结果同步接口
*/
func (client *Client) SyncFundCreditgrantingEx(request *SyncFundCreditgrantingRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncFundCreditgrantingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncFundCreditgrantingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.creditgranting.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 本接口用于授信授权。本接口返回成功后，代表授权申请已发起。如果授权通过，会发送异步通知。
 * Summary: 授信授权申请接口
 */
func (client *Client) AuthFundCreditgranting(request *AuthFundCreditgrantingRequest) (_result *AuthFundCreditgrantingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthFundCreditgrantingResponse{}
	_body, _err := client.AuthFundCreditgrantingEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 本接口用于授信授权。本接口返回成功后，代表授权申请已发起。如果授权通过，会发送异步通知。
 * Summary: 授信授权申请接口
 */
func (client *Client) AuthFundCreditgrantingEx(request *AuthFundCreditgrantingRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthFundCreditgrantingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthFundCreditgrantingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.creditgranting.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 小贷融资查询资产报告
 * Summary: 查询资产报告
 */
func (client *Client) QueryFundAssertreport(request *QueryFundAssertreportRequest) (_result *QueryFundAssertreportResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFundAssertreportResponse{}
	_body, _err := client.QueryFundAssertreportEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 小贷融资查询资产报告
 * Summary: 查询资产报告
 */
func (client *Client) QueryFundAssertreportEx(request *QueryFundAssertreportRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFundAssertreportResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFundAssertreportResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.assertreport.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部调用,商品信息获取
 * Summary: 商品信息获取
 */
func (client *Client) GetInnerProduct(request *GetInnerProductRequest) (_result *GetInnerProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetInnerProductResponse{}
	_body, _err := client.GetInnerProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部调用,商品信息获取
 * Summary: 商品信息获取
 */
func (client *Client) GetInnerProductEx(request *GetInnerProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetInnerProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetInnerProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.product.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: ato内部服务，客户系统不可访问；租户信息获取
 * Summary: 租户信息获取
 */
func (client *Client) GetInnerTenant(request *GetInnerTenantRequest) (_result *GetInnerTenantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetInnerTenantResponse{}
	_body, _err := client.GetInnerTenantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: ato内部服务，客户系统不可访问；租户信息获取
 * Summary: 租户信息获取
 */
func (client *Client) GetInnerTenantEx(request *GetInnerTenantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetInnerTenantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetInnerTenantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.tenant.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部接口，客户系统不能调用。上报整单结算计量信息
 * Summary: 上报整单结算计量信息
 */
func (client *Client) SyncInnerMeterforwholeorder(request *SyncInnerMeterforwholeorderRequest) (_result *SyncInnerMeterforwholeorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncInnerMeterforwholeorderResponse{}
	_body, _err := client.SyncInnerMeterforwholeorderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部接口，客户系统不能调用。上报整单结算计量信息
 * Summary: 上报整单结算计量信息
 */
func (client *Client) SyncInnerMeterforwholeorderEx(request *SyncInnerMeterforwholeorderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncInnerMeterforwholeorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncInnerMeterforwholeorderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.meterforwholeorder.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部调用，合同签署计量上报接口
 * Summary: 合同签署计量上报同步接口
 */
func (client *Client) SyncInnerMeterforagsign(request *SyncInnerMeterforagsignRequest) (_result *SyncInnerMeterforagsignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncInnerMeterforagsignResponse{}
	_body, _err := client.SyncInnerMeterforagsignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部调用，合同签署计量上报接口
 * Summary: 合同签署计量上报同步接口
 */
func (client *Client) SyncInnerMeterforagsignEx(request *SyncInnerMeterforagsignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncInnerMeterforagsignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncInnerMeterforagsignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.meterforagsign.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部接口，根据租户查询合同模板列表
 * Summary: 查询模板列表
 */
func (client *Client) AllInnerTemplate(request *AllInnerTemplateRequest) (_result *AllInnerTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllInnerTemplateResponse{}
	_body, _err := client.AllInnerTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部接口，根据租户查询合同模板列表
 * Summary: 查询模板列表
 */
func (client *Client) AllInnerTemplateEx(request *AllInnerTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllInnerTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllInnerTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.template.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部接口，根据模板code查询合同模板版本列表
 * Summary: 查询魔法库某一模板版本列表
 */
func (client *Client) ListInnerTemplate(request *ListInnerTemplateRequest) (_result *ListInnerTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListInnerTemplateResponse{}
	_body, _err := client.ListInnerTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部接口，根据模板code查询合同模板版本列表
 * Summary: 查询魔法库某一模板版本列表
 */
func (client *Client) ListInnerTemplateEx(request *ListInnerTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListInnerTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListInnerTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.template.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部接口，根据模板code查询指定版本的模板详情
 * Summary: 查询魔法库模板详情
 */
func (client *Client) DetailInnerTemplate(request *DetailInnerTemplateRequest) (_result *DetailInnerTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DetailInnerTemplateResponse{}
	_body, _err := client.DetailInnerTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部接口，根据模板code查询指定版本的模板详情
 * Summary: 查询魔法库模板详情
 */
func (client *Client) DetailInnerTemplateEx(request *DetailInnerTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DetailInnerTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DetailInnerTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.template.detail"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部接口，创建魔法库模板
 * Summary: 创建模板
 */
func (client *Client) CreateInnerTemplate(request *CreateInnerTemplateRequest) (_result *CreateInnerTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateInnerTemplateResponse{}
	_body, _err := client.CreateInnerTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部接口，创建魔法库模板
 * Summary: 创建模板
 */
func (client *Client) CreateInnerTemplateEx(request *CreateInnerTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateInnerTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateInnerTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.template.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部接口，保存魔法库模板
 * Summary: 保存魔法库模板
 */
func (client *Client) SaveInnerTemplate(request *SaveInnerTemplateRequest) (_result *SaveInnerTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveInnerTemplateResponse{}
	_body, _err := client.SaveInnerTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部接口，保存魔法库模板
 * Summary: 保存魔法库模板
 */
func (client *Client) SaveInnerTemplateEx(request *SaveInnerTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveInnerTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveInnerTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.template.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部接口，保存魔法库模板签署区
 * Summary: 保存魔法库模板签署区
 */
func (client *Client) SaveInnerSignfields(request *SaveInnerSignfieldsRequest) (_result *SaveInnerSignfieldsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveInnerSignfieldsResponse{}
	_body, _err := client.SaveInnerSignfieldsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部接口，保存魔法库模板签署区
 * Summary: 保存魔法库模板签署区
 */
func (client *Client) SaveInnerSignfieldsEx(request *SaveInnerSignfieldsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveInnerSignfieldsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveInnerSignfieldsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.signfields.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部接口，发布魔法库模板
 * Summary: 发布魔法库模板
 */
func (client *Client) PublishInnerTemplate(request *PublishInnerTemplateRequest) (_result *PublishInnerTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PublishInnerTemplateResponse{}
	_body, _err := client.PublishInnerTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部接口，发布魔法库模板
 * Summary: 发布魔法库模板
 */
func (client *Client) PublishInnerTemplateEx(request *PublishInnerTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PublishInnerTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PublishInnerTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.template.publish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部接口，根据code预览对应魔法库模板
 * Summary: 预览魔法库模板
 */
func (client *Client) PreviewInnerTemplate(request *PreviewInnerTemplateRequest) (_result *PreviewInnerTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PreviewInnerTemplateResponse{}
	_body, _err := client.PreviewInnerTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部接口，根据code预览对应魔法库模板
 * Summary: 预览魔法库模板
 */
func (client *Client) PreviewInnerTemplateEx(request *PreviewInnerTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PreviewInnerTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PreviewInnerTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.template.preview"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部接口，根据code删除对应魔法库模板
 * Summary: 删除魔法库模板
 */
func (client *Client) DeleteInnerTemplate(request *DeleteInnerTemplateRequest) (_result *DeleteInnerTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteInnerTemplateResponse{}
	_body, _err := client.DeleteInnerTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部接口，根据code删除对应魔法库模板
 * Summary: 删除魔法库模板
 */
func (client *Client) DeleteInnerTemplateEx(request *DeleteInnerTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteInnerTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteInnerTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.template.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部接口，复制一个魔法库模板
 * Summary: 复制魔法库模板
 */
func (client *Client) CloneInnerTemplate(request *CloneInnerTemplateRequest) (_result *CloneInnerTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CloneInnerTemplateResponse{}
	_body, _err := client.CloneInnerTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部接口，复制一个魔法库模板
 * Summary: 复制魔法库模板
 */
func (client *Client) CloneInnerTemplateEx(request *CloneInnerTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CloneInnerTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CloneInnerTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.template.clone"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: ato文件上传
 * Summary: ato文件上传
 */
func (client *Client) UploadInnerFile(request *UploadInnerFileRequest) (_result *UploadInnerFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadInnerFileResponse{}
	_body, _err := client.UploadInnerFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: ato文件上传
 * Summary: ato文件上传
 */
func (client *Client) UploadInnerFileEx(request *UploadInnerFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadInnerFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadInnerFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.file.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: ato文件下载
 * Summary: ato文件下载
 */
func (client *Client) DownloadInnerFile(request *DownloadInnerFileRequest) (_result *DownloadInnerFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DownloadInnerFileResponse{}
	_body, _err := client.DownloadInnerFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: ato文件下载
 * Summary: ato文件下载
 */
func (client *Client) DownloadInnerFileEx(request *DownloadInnerFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DownloadInnerFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DownloadInnerFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.file.download"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取 webofficeURL（透传）
 * Summary: 获取 webofficeURL
 */
func (client *Client) GetInnerTemplateofficeurl(request *GetInnerTemplateofficeurlRequest) (_result *GetInnerTemplateofficeurlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetInnerTemplateofficeurlResponse{}
	_body, _err := client.GetInnerTemplateofficeurlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取 webofficeURL（透传）
 * Summary: 获取 webofficeURL
 */
func (client *Client) GetInnerTemplateofficeurlEx(request *GetInnerTemplateofficeurlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetInnerTemplateofficeurlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetInnerTemplateofficeurlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.templateofficeurl.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 魔法库控制台刷新token
 * Summary: 刷新token
 */
func (client *Client) RefreshInnerTemplatetoken(request *RefreshInnerTemplatetokenRequest) (_result *RefreshInnerTemplatetokenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RefreshInnerTemplatetokenResponse{}
	_body, _err := client.RefreshInnerTemplatetokenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 魔法库控制台刷新token
 * Summary: 刷新token
 */
func (client *Client) RefreshInnerTemplatetokenEx(request *RefreshInnerTemplatetokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RefreshInnerTemplatetokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RefreshInnerTemplatetokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.templatetoken.refresh"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建文本域（组件）
 * Summary: 创建文本域
 */
func (client *Client) CreateInnerTemplatetextarea(request *CreateInnerTemplatetextareaRequest) (_result *CreateInnerTemplatetextareaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateInnerTemplatetextareaResponse{}
	_body, _err := client.CreateInnerTemplatetextareaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建文本域（组件）
 * Summary: 创建文本域
 */
func (client *Client) CreateInnerTemplatetextareaEx(request *CreateInnerTemplatetextareaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateInnerTemplatetextareaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateInnerTemplatetextareaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.templatetextarea.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取模板的图片列表
 * Summary: 获取模板的图片列表
 */
func (client *Client) QueryInnerTemplateimage(request *QueryInnerTemplateimageRequest) (_result *QueryInnerTemplateimageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInnerTemplateimageResponse{}
	_body, _err := client.QueryInnerTemplateimageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取模板的图片列表
 * Summary: 获取模板的图片列表
 */
func (client *Client) QueryInnerTemplateimageEx(request *QueryInnerTemplateimageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInnerTemplateimageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInnerTemplateimageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.templateimage.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保存/编辑分账关系信息
 * Summary: 保存/编辑分账关系信息
 */
func (client *Client) CreateInnerFunddividerelation(request *CreateInnerFunddividerelationRequest) (_result *CreateInnerFunddividerelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateInnerFunddividerelationResponse{}
	_body, _err := client.CreateInnerFunddividerelationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保存/编辑分账关系信息
 * Summary: 保存/编辑分账关系信息
 */
func (client *Client) CreateInnerFunddividerelationEx(request *CreateInnerFunddividerelationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateInnerFunddividerelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateInnerFunddividerelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.funddividerelation.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交分账关系信息
 * Summary: 提交分账关系信息
 */
func (client *Client) SubmitInnerFunddividerelation(request *SubmitInnerFunddividerelationRequest) (_result *SubmitInnerFunddividerelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitInnerFunddividerelationResponse{}
	_body, _err := client.SubmitInnerFunddividerelationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交分账关系信息
 * Summary: 提交分账关系信息
 */
func (client *Client) SubmitInnerFunddividerelationEx(request *SubmitInnerFunddividerelationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitInnerFunddividerelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitInnerFunddividerelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.funddividerelation.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询分账关系信息
 * Summary: 查询分账关系信息
 */
func (client *Client) QueryInnerFunddividerelation(request *QueryInnerFunddividerelationRequest) (_result *QueryInnerFunddividerelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInnerFunddividerelationResponse{}
	_body, _err := client.QueryInnerFunddividerelationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询分账关系信息
 * Summary: 查询分账关系信息
 */
func (client *Client) QueryInnerFunddividerelationEx(request *QueryInnerFunddividerelationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInnerFunddividerelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInnerFunddividerelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.funddividerelation.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询分账关系分页列表
 * Summary: 查询分账关系分页列表
 */
func (client *Client) PagequeryInnerFunddividerelation(request *PagequeryInnerFunddividerelationRequest) (_result *PagequeryInnerFunddividerelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryInnerFunddividerelationResponse{}
	_body, _err := client.PagequeryInnerFunddividerelationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询分账关系分页列表
 * Summary: 查询分账关系分页列表
 */
func (client *Client) PagequeryInnerFunddividerelationEx(request *PagequeryInnerFunddividerelationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryInnerFunddividerelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryInnerFunddividerelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.funddividerelation.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保存租户签约信息
 * Summary: 保存租户签约信息
 */
func (client *Client) CreateInnerMerchantagreement(request *CreateInnerMerchantagreementRequest) (_result *CreateInnerMerchantagreementResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateInnerMerchantagreementResponse{}
	_body, _err := client.CreateInnerMerchantagreementEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保存租户签约信息
 * Summary: 保存租户签约信息
 */
func (client *Client) CreateInnerMerchantagreementEx(request *CreateInnerMerchantagreementRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateInnerMerchantagreementResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateInnerMerchantagreementResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.merchantagreement.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询租户签约信息
 * Summary: 查询租户签约信息
 */
func (client *Client) QueryInnerMerchantagreement(request *QueryInnerMerchantagreementRequest) (_result *QueryInnerMerchantagreementResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInnerMerchantagreementResponse{}
	_body, _err := client.QueryInnerMerchantagreementEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询租户签约信息
 * Summary: 查询租户签约信息
 */
func (client *Client) QueryInnerMerchantagreementEx(request *QueryInnerMerchantagreementRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInnerMerchantagreementResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInnerMerchantagreementResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.merchantagreement.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询租户签约协议分页列表
 * Summary: 查询租户签约协议分页列表
 */
func (client *Client) PagequeryInnerMerchantagreement(request *PagequeryInnerMerchantagreementRequest) (_result *PagequeryInnerMerchantagreementResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryInnerMerchantagreementResponse{}
	_body, _err := client.PagequeryInnerMerchantagreementEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询租户签约协议分页列表
 * Summary: 查询租户签约协议分页列表
 */
func (client *Client) PagequeryInnerMerchantagreementEx(request *PagequeryInnerMerchantagreementRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryInnerMerchantagreementResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryInnerMerchantagreementResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.merchantagreement.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保存/编辑进件信息
 * Summary: 保存/编辑进件信息
 */
func (client *Client) CreateInnerMerchantpayexpand(request *CreateInnerMerchantpayexpandRequest) (_result *CreateInnerMerchantpayexpandResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateInnerMerchantpayexpandResponse{}
	_body, _err := client.CreateInnerMerchantpayexpandEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保存/编辑进件信息
 * Summary: 保存/编辑进件信息
 */
func (client *Client) CreateInnerMerchantpayexpandEx(request *CreateInnerMerchantpayexpandRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateInnerMerchantpayexpandResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateInnerMerchantpayexpandResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.merchantpayexpand.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交进件信息
 * Summary: 提交进件信息
 */
func (client *Client) SubmitInnerMerchantpayexpand(request *SubmitInnerMerchantpayexpandRequest) (_result *SubmitInnerMerchantpayexpandResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitInnerMerchantpayexpandResponse{}
	_body, _err := client.SubmitInnerMerchantpayexpandEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交进件信息
 * Summary: 提交进件信息
 */
func (client *Client) SubmitInnerMerchantpayexpandEx(request *SubmitInnerMerchantpayexpandRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitInnerMerchantpayexpandResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitInnerMerchantpayexpandResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.merchantpayexpand.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询进件信息
 * Summary: 查询进件信息
 */
func (client *Client) QueryInnerMerchantpayexpand(request *QueryInnerMerchantpayexpandRequest) (_result *QueryInnerMerchantpayexpandResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInnerMerchantpayexpandResponse{}
	_body, _err := client.QueryInnerMerchantpayexpandEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询进件信息
 * Summary: 查询进件信息
 */
func (client *Client) QueryInnerMerchantpayexpandEx(request *QueryInnerMerchantpayexpandRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInnerMerchantpayexpandResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInnerMerchantpayexpandResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.merchantpayexpand.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询代理商户分页列表-间连商户使用
 * Summary: 查询代理商户分页列表-间连商户使用
 */
func (client *Client) PagequeryInnerMerchantagent(request *PagequeryInnerMerchantagentRequest) (_result *PagequeryInnerMerchantagentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryInnerMerchantagentResponse{}
	_body, _err := client.PagequeryInnerMerchantagentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询代理商户分页列表-间连商户使用
 * Summary: 查询代理商户分页列表-间连商户使用
 */
func (client *Client) PagequeryInnerMerchantagentEx(request *PagequeryInnerMerchantagentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryInnerMerchantagentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryInnerMerchantagentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.merchantagent.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 拷贝模板文件，可用于保存模板的入参
 * Summary: 拷贝模板文件
 */
func (client *Client) CloneInnerTemplatefileaddress(request *CloneInnerTemplatefileaddressRequest) (_result *CloneInnerTemplatefileaddressResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CloneInnerTemplatefileaddressResponse{}
	_body, _err := client.CloneInnerTemplatefileaddressEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 拷贝模板文件，可用于保存模板的入参
 * Summary: 拷贝模板文件
 */
func (client *Client) CloneInnerTemplatefileaddressEx(request *CloneInnerTemplatefileaddressRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CloneInnerTemplatefileaddressResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CloneInnerTemplatefileaddressResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.templatefileaddress.clone"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询签署区
 * Summary: 查询签署区
 */
func (client *Client) QueryInnerSignfields(request *QueryInnerSignfieldsRequest) (_result *QueryInnerSignfieldsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInnerSignfieldsResponse{}
	_body, _err := client.QueryInnerSignfieldsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询签署区
 * Summary: 查询签署区
 */
func (client *Client) QueryInnerSignfieldsEx(request *QueryInnerSignfieldsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInnerSignfieldsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInnerSignfieldsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.signfields.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 同步已发布的模板
 * Summary: 同步已发布的模板
 */
func (client *Client) SyncInnerTemplate(request *SyncInnerTemplateRequest) (_result *SyncInnerTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncInnerTemplateResponse{}
	_body, _err := client.SyncInnerTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 同步已发布的模板
 * Summary: 同步已发布的模板
 */
func (client *Client) SyncInnerTemplateEx(request *SyncInnerTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncInnerTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncInnerTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.template.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新魔法库模板基本信息
 * Summary: 更新魔法库模板基本信息
 */
func (client *Client) UpdateInnerTemplate(request *UpdateInnerTemplateRequest) (_result *UpdateInnerTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateInnerTemplateResponse{}
	_body, _err := client.UpdateInnerTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新魔法库模板基本信息
 * Summary: 更新魔法库模板基本信息
 */
func (client *Client) UpdateInnerTemplateEx(request *UpdateInnerTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateInnerTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateInnerTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.template.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过模板code更新模板的基本信息，比如模板名称等
 * Summary: 查询模板的基本信息
 */
func (client *Client) QueryInnerTemplate(request *QueryInnerTemplateRequest) (_result *QueryInnerTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInnerTemplateResponse{}
	_body, _err := client.QueryInnerTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过模板code更新模板的基本信息，比如模板名称等
 * Summary: 查询模板的基本信息
 */
func (client *Client) QueryInnerTemplateEx(request *QueryInnerTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInnerTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInnerTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.template.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取模板关联的元素列表信息，包括组件信息
 * Summary: 获取模板关联的元素列表信息
 */
func (client *Client) QueryInnerTemplateelementlink(request *QueryInnerTemplateelementlinkRequest) (_result *QueryInnerTemplateelementlinkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInnerTemplateelementlinkResponse{}
	_body, _err := client.QueryInnerTemplateelementlinkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取模板关联的元素列表信息，包括组件信息
 * Summary: 获取模板关联的元素列表信息
 */
func (client *Client) QueryInnerTemplateelementlinkEx(request *QueryInnerTemplateelementlinkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInnerTemplateelementlinkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInnerTemplateelementlinkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.templateelementlink.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
 * Summary: 查询模板的版本详情
 */
func (client *Client) QueryInnerTemplateversion(request *QueryInnerTemplateversionRequest) (_result *QueryInnerTemplateversionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInnerTemplateversionResponse{}
	_body, _err := client.QueryInnerTemplateversionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
 * Summary: 查询模板的版本详情
 */
func (client *Client) QueryInnerTemplateversionEx(request *QueryInnerTemplateversionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInnerTemplateversionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInnerTemplateversionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.templateversion.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 订单消息查询
 * Summary: 订单消息查询
 */
func (client *Client) PagequeryInnerOrdermsg(request *PagequeryInnerOrdermsgRequest) (_result *PagequeryInnerOrdermsgResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryInnerOrdermsgResponse{}
	_body, _err := client.PagequeryInnerOrdermsgEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 订单消息查询
 * Summary: 订单消息查询
 */
func (client *Client) PagequeryInnerOrdermsgEx(request *PagequeryInnerOrdermsgRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryInnerOrdermsgResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryInnerOrdermsgResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.ordermsg.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 订单消息重试
 * Summary: 订单消息重试
 */
func (client *Client) RetryInnerOrdermsg(request *RetryInnerOrdermsgRequest) (_result *RetryInnerOrdermsgResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RetryInnerOrdermsgResponse{}
	_body, _err := client.RetryInnerOrdermsgEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 订单消息重试
 * Summary: 订单消息重试
 */
func (client *Client) RetryInnerOrdermsgEx(request *RetryInnerOrdermsgRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RetryInnerOrdermsgResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RetryInnerOrdermsgResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.ordermsg.retry"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 法务协议授权-  签署合同代扣前置授权查询接口
 * Summary: 签署合同代扣前置授权查询接口
 */
func (client *Client) QueryInnerAuthorization(request *QueryInnerAuthorizationRequest) (_result *QueryInnerAuthorizationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInnerAuthorizationResponse{}
	_body, _err := client.QueryInnerAuthorizationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 法务协议授权-  签署合同代扣前置授权查询接口
 * Summary: 签署合同代扣前置授权查询接口
 */
func (client *Client) QueryInnerAuthorizationEx(request *QueryInnerAuthorizationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInnerAuthorizationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInnerAuthorizationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.authorization.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 法务协议授权 - 签署合同代扣前置同意授权接口
 * Summary: 签署合同代扣前置同意授权接口
 */
func (client *Client) SignInnerAuthorization(request *SignInnerAuthorizationRequest) (_result *SignInnerAuthorizationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SignInnerAuthorizationResponse{}
	_body, _err := client.SignInnerAuthorizationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 法务协议授权 - 签署合同代扣前置同意授权接口
 * Summary: 签署合同代扣前置同意授权接口
 */
func (client *Client) SignInnerAuthorizationEx(request *SignInnerAuthorizationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SignInnerAuthorizationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SignInnerAuthorizationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.authorization.sign"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 小程序法务授权 - 商户补充协议状态查询接口
 * Summary: 商户补充协议状态查询接口
 */
func (client *Client) QueryInnerSupplemental(request *QueryInnerSupplementalRequest) (_result *QueryInnerSupplementalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInnerSupplementalResponse{}
	_body, _err := client.QueryInnerSupplementalEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 小程序法务授权 - 商户补充协议状态查询接口
 * Summary: 商户补充协议状态查询接口
 */
func (client *Client) QueryInnerSupplementalEx(request *QueryInnerSupplementalRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInnerSupplementalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInnerSupplementalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.supplemental.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 法务协议授权 - 商户补充协议状态同意接口
 * Summary: 商户补充协议状态同意接口
 */
func (client *Client) SignInnerSupplemental(request *SignInnerSupplementalRequest) (_result *SignInnerSupplementalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SignInnerSupplementalResponse{}
	_body, _err := client.SignInnerSupplementalEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 法务协议授权 - 商户补充协议状态同意接口
 * Summary: 商户补充协议状态同意接口
 */
func (client *Client) SignInnerSupplementalEx(request *SignInnerSupplementalRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SignInnerSupplementalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SignInnerSupplementalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.supplemental.sign"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询代扣计划
 * Summary: 代扣计划查询
 */
func (client *Client) QueryInnerWithholdplan(request *QueryInnerWithholdplanRequest) (_result *QueryInnerWithholdplanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInnerWithholdplanResponse{}
	_body, _err := client.QueryInnerWithholdplanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询代扣计划
 * Summary: 代扣计划查询
 */
func (client *Client) QueryInnerWithholdplanEx(request *QueryInnerWithholdplanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInnerWithholdplanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInnerWithholdplanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.withholdplan.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建代扣协议
 * Summary: 创建代扣协议
 */
func (client *Client) CreateInnerWithholdsign(request *CreateInnerWithholdsignRequest) (_result *CreateInnerWithholdsignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateInnerWithholdsignResponse{}
	_body, _err := client.CreateInnerWithholdsignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建代扣协议
 * Summary: 创建代扣协议
 */
func (client *Client) CreateInnerWithholdsignEx(request *CreateInnerWithholdsignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateInnerWithholdsignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateInnerWithholdsignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.withholdsign.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣签约查询
 * Summary: 代扣签约查询
 */
func (client *Client) QueryInnerWithholdsign(request *QueryInnerWithholdsignRequest) (_result *QueryInnerWithholdsignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInnerWithholdsignResponse{}
	_body, _err := client.QueryInnerWithholdsignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣签约查询
 * Summary: 代扣签约查询
 */
func (client *Client) QueryInnerWithholdsignEx(request *QueryInnerWithholdsignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInnerWithholdsignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInnerWithholdsignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.withholdsign.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取商户进件静态枚举数据
 * Summary: 获取商户进件静态枚举数据
 */
func (client *Client) GetInnerMerchantstaticdata(request *GetInnerMerchantstaticdataRequest) (_result *GetInnerMerchantstaticdataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetInnerMerchantstaticdataResponse{}
	_body, _err := client.GetInnerMerchantstaticdataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取商户进件静态枚举数据
 * Summary: 获取商户进件静态枚举数据
 */
func (client *Client) GetInnerMerchantstaticdataEx(request *GetInnerMerchantstaticdataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetInnerMerchantstaticdataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetInnerMerchantstaticdataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.merchantstaticdata.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询已有绑定关系分账方数据
包括分账方名称，社会统一信用代码
 * Summary: 间连查询已有绑定关系分账方数据
*/
func (client *Client) GetInnerFunddividemerchant(request *GetInnerFunddividemerchantRequest) (_result *GetInnerFunddividemerchantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetInnerFunddividemerchantResponse{}
	_body, _err := client.GetInnerFunddividemerchantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询已有绑定关系分账方数据
包括分账方名称，社会统一信用代码
 * Summary: 间连查询已有绑定关系分账方数据
*/
func (client *Client) GetInnerFunddividemerchantEx(request *GetInnerFunddividemerchantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetInnerFunddividemerchantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetInnerFunddividemerchantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.funddividemerchant.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询商户和保司协议签署信息
 * Summary: 查询商户和保司协议签署信息
 */
func (client *Client) QueryInnerInsuresign(request *QueryInnerInsuresignRequest) (_result *QueryInnerInsuresignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInnerInsuresignResponse{}
	_body, _err := client.QueryInnerInsuresignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询商户和保司协议签署信息
 * Summary: 查询商户和保司协议签署信息
 */
func (client *Client) QueryInnerInsuresignEx(request *QueryInnerInsuresignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInnerInsuresignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInnerInsuresignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.insuresign.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 生成商户和保司签约链接
 * Summary: 生成商户和保司签约链接
 */
func (client *Client) CreateInnerInsuresign(request *CreateInnerInsuresignRequest) (_result *CreateInnerInsuresignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateInnerInsuresignResponse{}
	_body, _err := client.CreateInnerInsuresignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 生成商户和保司签约链接
 * Summary: 生成商户和保司签约链接
 */
func (client *Client) CreateInnerInsuresignEx(request *CreateInnerInsuresignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateInnerInsuresignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateInnerInsuresignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.insuresign.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询保单信息
 * Summary: 查询保单信息
 */
func (client *Client) PagequeryInnerInsureorder(request *PagequeryInnerInsureorderRequest) (_result *PagequeryInnerInsureorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryInnerInsureorderResponse{}
	_body, _err := client.PagequeryInnerInsureorderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询保单信息
 * Summary: 查询保单信息
 */
func (client *Client) PagequeryInnerInsureorderEx(request *PagequeryInnerInsureorderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryInnerInsureorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryInnerInsureorderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.insureorder.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户控制台商品列表
 * Summary: 商品列表
 */
func (client *Client) PagequeryInnerProduct(request *PagequeryInnerProductRequest) (_result *PagequeryInnerProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryInnerProductResponse{}
	_body, _err := client.PagequeryInnerProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户控制台商品列表
 * Summary: 商品列表
 */
func (client *Client) PagequeryInnerProductEx(request *PagequeryInnerProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryInnerProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryInnerProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.product.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户控制台首页通知栏
 * Summary: 首页通知栏
 */
func (client *Client) GetInnerHomepagenotice(request *GetInnerHomepagenoticeRequest) (_result *GetInnerHomepagenoticeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetInnerHomepagenoticeResponse{}
	_body, _err := client.GetInnerHomepagenoticeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户控制台首页通知栏
 * Summary: 首页通知栏
 */
func (client *Client) GetInnerHomepagenoticeEx(request *GetInnerHomepagenoticeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetInnerHomepagenoticeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetInnerHomepagenoticeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.homepagenotice.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户控制台通知列表
 * Summary: 通知列表
 */
func (client *Client) PagequeryInnerNotice(request *PagequeryInnerNoticeRequest) (_result *PagequeryInnerNoticeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryInnerNoticeResponse{}
	_body, _err := client.PagequeryInnerNoticeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户控制台通知列表
 * Summary: 通知列表
 */
func (client *Client) PagequeryInnerNoticeEx(request *PagequeryInnerNoticeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryInnerNoticeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryInnerNoticeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.notice.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户控制台通知详情
 * Summary: 通知详情
 */
func (client *Client) DetailInnerNotice(request *DetailInnerNoticeRequest) (_result *DetailInnerNoticeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DetailInnerNoticeResponse{}
	_body, _err := client.DetailInnerNoticeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户控制台通知详情
 * Summary: 通知详情
 */
func (client *Client) DetailInnerNoticeEx(request *DetailInnerNoticeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DetailInnerNoticeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DetailInnerNoticeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.notice.detail"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户控制台订单列表
 * Summary: 订单列表
 */
func (client *Client) PagequeryInnerOrder(request *PagequeryInnerOrderRequest) (_result *PagequeryInnerOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryInnerOrderResponse{}
	_body, _err := client.PagequeryInnerOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户控制台订单列表
 * Summary: 订单列表
 */
func (client *Client) PagequeryInnerOrderEx(request *PagequeryInnerOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryInnerOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryInnerOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.order.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 订单详情
 * Summary: 订单详情
 */
func (client *Client) DetailInnerOrder(request *DetailInnerOrderRequest) (_result *DetailInnerOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DetailInnerOrderResponse{}
	_body, _err := client.DetailInnerOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 订单详情
 * Summary: 订单详情
 */
func (client *Client) DetailInnerOrderEx(request *DetailInnerOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DetailInnerOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DetailInnerOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.order.detail"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 合同模板实例化渲染，文本域赋值
 * Summary: 合同模板实例化渲染
 */
func (client *Client) RenderInnerTemplateinstance(request *RenderInnerTemplateinstanceRequest) (_result *RenderInnerTemplateinstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RenderInnerTemplateinstanceResponse{}
	_body, _err := client.RenderInnerTemplateinstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 合同模板实例化渲染，文本域赋值
 * Summary: 合同模板实例化渲染
 */
func (client *Client) RenderInnerTemplateinstanceEx(request *RenderInnerTemplateinstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RenderInnerTemplateinstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RenderInnerTemplateinstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.templateinstance.render"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 批量查询营销分
 * Summary: 批量查询营销分
 */
func (client *Client) BatchqueryInnerMarketingscore(request *BatchqueryInnerMarketingscoreRequest) (_result *BatchqueryInnerMarketingscoreResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchqueryInnerMarketingscoreResponse{}
	_body, _err := client.BatchqueryInnerMarketingscoreEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 批量查询营销分
 * Summary: 批量查询营销分
 */
func (client *Client) BatchqueryInnerMarketingscoreEx(request *BatchqueryInnerMarketingscoreRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchqueryInnerMarketingscoreResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchqueryInnerMarketingscoreResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.marketingscore.batchquery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建客服信息
 * Summary: 创建客服信息
 */
func (client *Client) CreateInnerCustomerservice(request *CreateInnerCustomerserviceRequest) (_result *CreateInnerCustomerserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateInnerCustomerserviceResponse{}
	_body, _err := client.CreateInnerCustomerserviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建客服信息
 * Summary: 创建客服信息
 */
func (client *Client) CreateInnerCustomerserviceEx(request *CreateInnerCustomerserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateInnerCustomerserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateInnerCustomerserviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.customerservice.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新客服信息
 * Summary: 更新客服信息
 */
func (client *Client) UpdateInnerCustomerservice(request *UpdateInnerCustomerserviceRequest) (_result *UpdateInnerCustomerserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateInnerCustomerserviceResponse{}
	_body, _err := client.UpdateInnerCustomerserviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新客服信息
 * Summary: 更新客服信息
 */
func (client *Client) UpdateInnerCustomerserviceEx(request *UpdateInnerCustomerserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateInnerCustomerserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateInnerCustomerserviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.customerservice.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询客服信息
 * Summary:  分页查询客服信息
 */
func (client *Client) PagequeryInnerCustomerservice(request *PagequeryInnerCustomerserviceRequest) (_result *PagequeryInnerCustomerserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryInnerCustomerserviceResponse{}
	_body, _err := client.PagequeryInnerCustomerserviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询客服信息
 * Summary:  分页查询客服信息
 */
func (client *Client) PagequeryInnerCustomerserviceEx(request *PagequeryInnerCustomerserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryInnerCustomerserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryInnerCustomerserviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.customerservice.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取客服信息详情
 * Summary: 获取客服信息详情
 */
func (client *Client) DetailInnerCustomerservice(request *DetailInnerCustomerserviceRequest) (_result *DetailInnerCustomerserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DetailInnerCustomerserviceResponse{}
	_body, _err := client.DetailInnerCustomerserviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取客服信息详情
 * Summary: 获取客服信息详情
 */
func (client *Client) DetailInnerCustomerserviceEx(request *DetailInnerCustomerserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DetailInnerCustomerserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DetailInnerCustomerserviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.customerservice.detail"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取代理商客服信息模版
 * Summary: 获取代理商客服信息模版
 */
func (client *Client) GetInnerCustomerservicetemplate(request *GetInnerCustomerservicetemplateRequest) (_result *GetInnerCustomerservicetemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetInnerCustomerservicetemplateResponse{}
	_body, _err := client.GetInnerCustomerservicetemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取代理商客服信息模版
 * Summary: 获取代理商客服信息模版
 */
func (client *Client) GetInnerCustomerservicetemplateEx(request *GetInnerCustomerservicetemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetInnerCustomerservicetemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetInnerCustomerservicetemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.customerservicetemplate.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取模板实例化后的模板信息，包括pdf下载链接
 * Summary: 获取模板实例化后的模板信息
 */
func (client *Client) QueryInnerTemplateinstance(request *QueryInnerTemplateinstanceRequest) (_result *QueryInnerTemplateinstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInnerTemplateinstanceResponse{}
	_body, _err := client.QueryInnerTemplateinstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取模板实例化后的模板信息，包括pdf下载链接
 * Summary: 获取模板实例化后的模板信息
 */
func (client *Client) QueryInnerTemplateinstanceEx(request *QueryInnerTemplateinstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInnerTemplateinstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInnerTemplateinstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.templateinstance.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询租户类目信息详情
 * Summary: 查询租户类目信息详情
 */
func (client *Client) QueryInnerTenantindirectmainclass(request *QueryInnerTenantindirectmainclassRequest) (_result *QueryInnerTenantindirectmainclassResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInnerTenantindirectmainclassResponse{}
	_body, _err := client.QueryInnerTenantindirectmainclassEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询租户类目信息详情
 * Summary: 查询租户类目信息详情
 */
func (client *Client) QueryInnerTenantindirectmainclassEx(request *QueryInnerTenantindirectmainclassRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInnerTenantindirectmainclassResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInnerTenantindirectmainclassResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.tenantindirectmainclass.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 修改租户间联类目类目信息
 * Summary: 修改租户间联类目类目信息
 */
func (client *Client) UpdateInnerTenantindirectmainclass(request *UpdateInnerTenantindirectmainclassRequest) (_result *UpdateInnerTenantindirectmainclassResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateInnerTenantindirectmainclassResponse{}
	_body, _err := client.UpdateInnerTenantindirectmainclassEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 修改租户间联类目类目信息
 * Summary: 修改租户间联类目类目信息
 */
func (client *Client) UpdateInnerTenantindirectmainclassEx(request *UpdateInnerTenantindirectmainclassRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateInnerTenantindirectmainclassResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateInnerTenantindirectmainclassResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.tenantindirectmainclass.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 模板同步上线时强管控字段校验未通过提交后台审核
 * Summary: 模板同步上线审核提交
 */
func (client *Client) SubmitInnerTemplatesyncreview(request *SubmitInnerTemplatesyncreviewRequest) (_result *SubmitInnerTemplatesyncreviewResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitInnerTemplatesyncreviewResponse{}
	_body, _err := client.SubmitInnerTemplatesyncreviewEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 模板同步上线时强管控字段校验未通过提交后台审核
 * Summary: 模板同步上线审核提交
 */
func (client *Client) SubmitInnerTemplatesyncreviewEx(request *SubmitInnerTemplatesyncreviewRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitInnerTemplatesyncreviewResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitInnerTemplatesyncreviewResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.templatesyncreview.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 待办事件处理
 * Summary: 待办事件处理
 */
func (client *Client) SubmitInnerPendingevent(request *SubmitInnerPendingeventRequest) (_result *SubmitInnerPendingeventResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitInnerPendingeventResponse{}
	_body, _err := client.SubmitInnerPendingeventEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 待办事件处理
 * Summary: 待办事件处理
 */
func (client *Client) SubmitInnerPendingeventEx(request *SubmitInnerPendingeventRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitInnerPendingeventResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitInnerPendingeventResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.pendingevent.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 待办事件详情查询
 * Summary: 待办事件详情查询
 */
func (client *Client) DetailInnerPendingevent(request *DetailInnerPendingeventRequest) (_result *DetailInnerPendingeventResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DetailInnerPendingeventResponse{}
	_body, _err := client.DetailInnerPendingeventEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 待办事件详情查询
 * Summary: 待办事件详情查询
 */
func (client *Client) DetailInnerPendingeventEx(request *DetailInnerPendingeventRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DetailInnerPendingeventResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DetailInnerPendingeventResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.pendingevent.detail"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 合同模板制作根据已有模板新增合同模板文件
 * Summary: 根据已有模板新增合同模板文件
 */
func (client *Client) AddInnerTemplate(request *AddInnerTemplateRequest) (_result *AddInnerTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddInnerTemplateResponse{}
	_body, _err := client.AddInnerTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 合同模板制作根据已有模板新增合同模板文件
 * Summary: 根据已有模板新增合同模板文件
 */
func (client *Client) AddInnerTemplateEx(request *AddInnerTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddInnerTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddInnerTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.template.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询待办列表
 * Summary: 查询待办列表
 */
func (client *Client) PagequeryInnerPendingevent(request *PagequeryInnerPendingeventRequest) (_result *PagequeryInnerPendingeventResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryInnerPendingeventResponse{}
	_body, _err := client.PagequeryInnerPendingeventEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询待办列表
 * Summary: 查询待办列表
 */
func (client *Client) PagequeryInnerPendingeventEx(request *PagequeryInnerPendingeventRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryInnerPendingeventResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryInnerPendingeventResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.pendingevent.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 一键投保
 * Summary: 投保
 */
func (client *Client) CreateInsure(request *CreateInsureRequest) (_result *CreateInsureResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateInsureResponse{}
	_body, _err := client.CreateInsureEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 一键投保
 * Summary: 投保
 */
func (client *Client) CreateInsureEx(request *CreateInsureRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateInsureResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateInsureResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.insure.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保单查询
 * Summary: 保单查询
 */
func (client *Client) QueryInsure(request *QueryInsureRequest) (_result *QueryInsureResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInsureResponse{}
	_body, _err := client.QueryInsureEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保单查询
 * Summary: 保单查询
 */
func (client *Client) QueryInsureEx(request *QueryInsureRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInsureResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInsureResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.insure.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保险代扣重试
 * Summary: 保险代扣重试
 */
func (client *Client) RetryInsurePay(request *RetryInsurePayRequest) (_result *RetryInsurePayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RetryInsurePayResponse{}
	_body, _err := client.RetryInsurePayEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保险代扣重试
 * Summary: 保险代扣重试
 */
func (client *Client) RetryInsurePayEx(request *RetryInsurePayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RetryInsurePayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RetryInsurePayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.insure.pay.retry"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户入驻
 * Summary: 商户入驻
 */
func (client *Client) RegisterMerchantexpandMerchant(request *RegisterMerchantexpandMerchantRequest) (_result *RegisterMerchantexpandMerchantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RegisterMerchantexpandMerchantResponse{}
	_body, _err := client.RegisterMerchantexpandMerchantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户入驻
 * Summary: 商户入驻
 */
func (client *Client) RegisterMerchantexpandMerchantEx(request *RegisterMerchantexpandMerchantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RegisterMerchantexpandMerchantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RegisterMerchantexpandMerchantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.merchantexpand.merchant.register"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取临时上传文件链接
 * Summary: 获取临时上传文件链接
 */
func (client *Client) UploadMerchantexpandFile(request *UploadMerchantexpandFileRequest) (_result *UploadMerchantexpandFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadMerchantexpandFileResponse{}
	_body, _err := client.UploadMerchantexpandFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取临时上传文件链接
 * Summary: 获取临时上传文件链接
 */
func (client *Client) UploadMerchantexpandFileEx(request *UploadMerchantexpandFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadMerchantexpandFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadMerchantexpandFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.merchantexpand.file.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户入驻查询
 * Summary: 商户入驻查询
 */
func (client *Client) QueryMerchantexpandMerchant(request *QueryMerchantexpandMerchantRequest) (_result *QueryMerchantexpandMerchantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMerchantexpandMerchantResponse{}
	_body, _err := client.QueryMerchantexpandMerchantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户入驻查询
 * Summary: 商户入驻查询
 */
func (client *Client) QueryMerchantexpandMerchantEx(request *QueryMerchantexpandMerchantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMerchantexpandMerchantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMerchantexpandMerchantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.merchantexpand.merchant.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商家信息修改
 * Summary: 商家信息修改
 */
func (client *Client) UpdateMerchantexpandMerchant(request *UpdateMerchantexpandMerchantRequest) (_result *UpdateMerchantexpandMerchantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateMerchantexpandMerchantResponse{}
	_body, _err := client.UpdateMerchantexpandMerchantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商家信息修改
 * Summary: 商家信息修改
 */
func (client *Client) UpdateMerchantexpandMerchantEx(request *UpdateMerchantexpandMerchantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateMerchantexpandMerchantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateMerchantexpandMerchantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.merchantexpand.merchant.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 添加分账绑定关系
 * Summary: 添加分账绑定关系
 */
func (client *Client) AddMerchantexpandDividerelation(request *AddMerchantexpandDividerelationRequest) (_result *AddMerchantexpandDividerelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddMerchantexpandDividerelationResponse{}
	_body, _err := client.AddMerchantexpandDividerelationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 添加分账绑定关系
 * Summary: 添加分账绑定关系
 */
func (client *Client) AddMerchantexpandDividerelationEx(request *AddMerchantexpandDividerelationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddMerchantexpandDividerelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddMerchantexpandDividerelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.merchantexpand.dividerelation.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分账绑定关系查询
 * Summary: 分账绑定关系查询
 */
func (client *Client) QueryMerchantexpandDividerelation(request *QueryMerchantexpandDividerelationRequest) (_result *QueryMerchantexpandDividerelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMerchantexpandDividerelationResponse{}
	_body, _err := client.QueryMerchantexpandDividerelationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分账绑定关系查询
 * Summary: 分账绑定关系查询
 */
func (client *Client) QueryMerchantexpandDividerelationEx(request *QueryMerchantexpandDividerelationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMerchantexpandDividerelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMerchantexpandDividerelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.merchantexpand.dividerelation.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 可信身份认证，创建认证
 * Summary: 创建认证
 */
func (client *Client) CreateRealpersonFacevrf(request *CreateRealpersonFacevrfRequest) (_result *CreateRealpersonFacevrfResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRealpersonFacevrfResponse{}
	_body, _err := client.CreateRealpersonFacevrfEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 可信身份认证，创建认证
 * Summary: 创建认证
 */
func (client *Client) CreateRealpersonFacevrfEx(request *CreateRealpersonFacevrfRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRealpersonFacevrfResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRealpersonFacevrfResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.realperson.facevrf.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询认证的结果和相关信息
 * Summary: 查询认证结果
 */
func (client *Client) QueryRealpersonFacevrf(request *QueryRealpersonFacevrfRequest) (_result *QueryRealpersonFacevrfResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRealpersonFacevrfResponse{}
	_body, _err := client.QueryRealpersonFacevrfEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询认证的结果和相关信息
 * Summary: 查询认证结果
 */
func (client *Client) QueryRealpersonFacevrfEx(request *QueryRealpersonFacevrfRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRealpersonFacevrfResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRealpersonFacevrfResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.realperson.facevrf.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发起风控分析，获取风险分
 * Summary: 发起风控分析，获取风险分
 */
func (client *Client) QueryRisk(request *QueryRiskRequest) (_result *QueryRiskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRiskResponse{}
	_body, _err := client.QueryRiskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发起风控分析，获取风险分
 * Summary: 发起风控分析，获取风险分
 */
func (client *Client) QueryRiskEx(request *QueryRiskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRiskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRiskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.risk.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 云 api 发起风控分析，获取风险评估
 * Summary: 云 api 发起风控分析，获取风险评估
 */
func (client *Client) QueryRiskGo(request *QueryRiskGoRequest) (_result *QueryRiskGoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRiskGoResponse{}
	_body, _err := client.QueryRiskGoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 云 api 发起风控分析，获取风险评估
 * Summary: 云 api 发起风控分析，获取风险评估
 */
func (client *Client) QueryRiskGoEx(request *QueryRiskGoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRiskGoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRiskGoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.risk.go.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 小程序云调用，上报计量信息
 * Summary: 小程序云调用，上报计量信息
 */
func (client *Client) UploadInnerRiskcall(request *UploadInnerRiskcallRequest) (_result *UploadInnerRiskcallResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadInnerRiskcallResponse{}
	_body, _err := client.UploadInnerRiskcallEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 小程序云调用，上报计量信息
 * Summary: 小程序云调用，上报计量信息
 */
func (client *Client) UploadInnerRiskcallEx(request *UploadInnerRiskcallRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadInnerRiskcallResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadInnerRiskcallResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.riskcall.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 电子合同签署的合同模板查询服务
 * Summary: 电子合同签署的合同模板查询服务
 */
func (client *Client) AllSignTemplate(request *AllSignTemplateRequest) (_result *AllSignTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllSignTemplateResponse{}
	_body, _err := client.AllSignTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 电子合同签署的合同模板查询服务
 * Summary: 电子合同签署的合同模板查询服务
 */
func (client *Client) AllSignTemplateEx(request *AllSignTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllSignTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllSignTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.template.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交电子合同的签署流程(后置签署模式)
 * Summary: 提交电子合同的签署流程（后置签署模式）
 */
func (client *Client) SubmitSignFlow(request *SubmitSignFlowRequest) (_result *SubmitSignFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitSignFlowResponse{}
	_body, _err := client.SubmitSignFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交电子合同的签署流程(后置签署模式)
 * Summary: 提交电子合同的签署流程（后置签署模式）
 */
func (client *Client) SubmitSignFlowEx(request *SubmitSignFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitSignFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitSignFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.flow.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询签署流程详情
 * Summary: 查询签署流程详情
 */
func (client *Client) GetSignFlow(request *GetSignFlowRequest) (_result *GetSignFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetSignFlowResponse{}
	_body, _err := client.GetSignFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询签署流程详情
 * Summary: 查询签署流程详情
 */
func (client *Client) GetSignFlowEx(request *GetSignFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetSignFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetSignFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.flow.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
 * Summary: 电子合同签署流程落签操作
 */
func (client *Client) AuthSignFlow(request *AuthSignFlowRequest) (_result *AuthSignFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthSignFlowResponse{}
	_body, _err := client.AuthSignFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
 * Summary: 电子合同签署流程落签操作
 */
func (client *Client) AuthSignFlowEx(request *AuthSignFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthSignFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthSignFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.flow.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交前置签署的电子合同签署流程（前置签署模式）
 * Summary: 提交签署的电子合同签署流程（前置签署）
 */
func (client *Client) SubmitFrontSign(request *SubmitFrontSignRequest) (_result *SubmitFrontSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitFrontSignResponse{}
	_body, _err := client.SubmitFrontSignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交前置签署的电子合同签署流程（前置签署模式）
 * Summary: 提交签署的电子合同签署流程（前置签署）
 */
func (client *Client) SubmitFrontSignEx(request *SubmitFrontSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitFrontSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitFrontSignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.front.sign.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 调用该接口，追加上传无法在原有链路上签署的合同
 * Summary: 商户调用合同追加接口
 */
func (client *Client) UploadSignFlow(request *UploadSignFlowRequest) (_result *UploadSignFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadSignFlowResponse{}
	_body, _err := client.UploadSignFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 调用该接口，追加上传无法在原有链路上签署的合同
 * Summary: 商户调用合同追加接口
 */
func (client *Client) UploadSignFlowEx(request *UploadSignFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadSignFlowResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.ato.sign.flow.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadSignFlowResponse := &UploadSignFlowResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadSignFlowResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
		request.FileObject = nil
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadSignFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.flow.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户合同模板上传接口
 * Summary: 商户合同模板上传
 */
func (client *Client) UploadSignTemplate(request *UploadSignTemplateRequest) (_result *UploadSignTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadSignTemplateResponse{}
	_body, _err := client.UploadSignTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户合同模板上传接口
 * Summary: 商户合同模板上传
 */
func (client *Client) UploadSignTemplateEx(request *UploadSignTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadSignTemplateResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.ato.sign.template.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadSignTemplateResponse := &UploadSignTemplateResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadSignTemplateResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
		request.FileObject = nil
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadSignTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.template.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户资产凭证上传，可以是文本或文件
 * Summary: 商户资产凭证上传
 */
func (client *Client) UploadSignCredit(request *UploadSignCreditRequest) (_result *UploadSignCreditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadSignCreditResponse{}
	_body, _err := client.UploadSignCreditEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户资产凭证上传，可以是文本或文件
 * Summary: 商户资产凭证上传
 */
func (client *Client) UploadSignCreditEx(request *UploadSignCreditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadSignCreditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadSignCreditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.credit.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户资产凭证查询，需要提供订单号或资产包号
 * Summary: 商户资产凭证查询
 */
func (client *Client) QuerySignCredit(request *QuerySignCreditRequest) (_result *QuerySignCreditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySignCreditResponse{}
	_body, _err := client.QuerySignCreditEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户资产凭证查询，需要提供订单号或资产包号
 * Summary: 商户资产凭证查询
 */
func (client *Client) QuerySignCreditEx(request *QuerySignCreditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySignCreditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySignCreditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.credit.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 撤销签署流程
 * Summary: 撤销签署流程
 */
func (client *Client) CancelSignFlow(request *CancelSignFlowRequest) (_result *CancelSignFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelSignFlowResponse{}
	_body, _err := client.CancelSignFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 撤销签署流程
 * Summary: 撤销签署流程
 */
func (client *Client) CancelSignFlowEx(request *CancelSignFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelSignFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelSignFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.flow.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取合同存证证明
 * Summary: 获取合同存证证明
 */
func (client *Client) GetSignContractcertificate(request *GetSignContractcertificateRequest) (_result *GetSignContractcertificateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetSignContractcertificateResponse{}
	_body, _err := client.GetSignContractcertificateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取合同存证证明
 * Summary: 获取合同存证证明
 */
func (client *Client) GetSignContractcertificateEx(request *GetSignContractcertificateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetSignContractcertificateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetSignContractcertificateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.contractcertificate.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 对账saas交易信息同步接口
 * Summary: 对账saas交易信息同步接口
 */
func (client *Client) SyncTrade(request *SyncTradeRequest) (_result *SyncTradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncTradeResponse{}
	_body, _err := client.SyncTradeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 对账saas交易信息同步接口
 * Summary: 对账saas交易信息同步接口
 */
func (client *Client) SyncTradeEx(request *SyncTradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncTradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncTradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取详情
 * Summary: 获取详情
 */
func (client *Client) GetTrade(request *GetTradeRequest) (_result *GetTradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTradeResponse{}
	_body, _err := client.GetTradeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取详情
 * Summary: 获取详情
 */
func (client *Client) GetTradeEx(request *GetTradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 订单创建，前置签署
 * Summary: 前置签署订单创建
 */
func (client *Client) SyncFrontTrade(request *SyncFrontTradeRequest) (_result *SyncFrontTradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncFrontTradeResponse{}
	_body, _err := client.SyncFrontTradeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 订单创建，前置签署
 * Summary: 前置签署订单创建
 */
func (client *Client) SyncFrontTradeEx(request *SyncFrontTradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncFrontTradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncFrontTradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.front.trade.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 融资放款申请接口
 * Summary: 融资放款申请接口
 */
func (client *Client) SyncTradeFinanceloanapply(request *SyncTradeFinanceloanapplyRequest) (_result *SyncTradeFinanceloanapplyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncTradeFinanceloanapplyResponse{}
	_body, _err := client.SyncTradeFinanceloanapplyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 融资放款申请接口
 * Summary: 融资放款申请接口
 */
func (client *Client) SyncTradeFinanceloanapplyEx(request *SyncTradeFinanceloanapplyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncTradeFinanceloanapplyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncTradeFinanceloanapplyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.financeloanapply.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户履约查询
 * Summary: 商户履约查询
 */
func (client *Client) GetTradeMerchantfulfillment(request *GetTradeMerchantfulfillmentRequest) (_result *GetTradeMerchantfulfillmentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTradeMerchantfulfillmentResponse{}
	_body, _err := client.GetTradeMerchantfulfillmentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户履约查询
 * Summary: 商户履约查询
 */
func (client *Client) GetTradeMerchantfulfillmentEx(request *GetTradeMerchantfulfillmentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTradeMerchantfulfillmentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTradeMerchantfulfillmentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.merchantfulfillment.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户履约信息查询（履约承诺+记录）
 * Summary: 用户履约信息查询（履约承诺+记录）
 */
func (client *Client) GetTradeUserperformance(request *GetTradeUserperformanceRequest) (_result *GetTradeUserperformanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTradeUserperformanceResponse{}
	_body, _err := client.GetTradeUserperformanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户履约信息查询（履约承诺+记录）
 * Summary: 用户履约信息查询（履约承诺+记录）
 */
func (client *Client) GetTradeUserperformanceEx(request *GetTradeUserperformanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTradeUserperformanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTradeUserperformanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.userperformance.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户履约信息查询（履约承诺+履约记录）
 * Summary: 商户履约信息查询（履约承诺+履约记录）
 */
func (client *Client) GetTradeMerchantperformance(request *GetTradeMerchantperformanceRequest) (_result *GetTradeMerchantperformanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTradeMerchantperformanceResponse{}
	_body, _err := client.GetTradeMerchantperformanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户履约信息查询（履约承诺+履约记录）
 * Summary: 商户履约信息查询（履约承诺+履约记录）
 */
func (client *Client) GetTradeMerchantperformanceEx(request *GetTradeMerchantperformanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTradeMerchantperformanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTradeMerchantperformanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.merchantperformance.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户调用，修改订单的用户还款承诺
 * Summary: 用户还款承诺信息修改
 */
func (client *Client) UpdateTradeUserpromise(request *UpdateTradeUserpromiseRequest) (_result *UpdateTradeUserpromiseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateTradeUserpromiseResponse{}
	_body, _err := client.UpdateTradeUserpromiseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户调用，修改订单的用户还款承诺
 * Summary: 用户还款承诺信息修改
 */
func (client *Client) UpdateTradeUserpromiseEx(request *UpdateTradeUserpromiseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateTradeUserpromiseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateTradeUserpromiseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.userpromise.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 前置签署间联模式订单进件
 * Summary: 前置签署间联模式订单进件
 */
func (client *Client) SyncFrontIndirectorder(request *SyncFrontIndirectorderRequest) (_result *SyncFrontIndirectorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncFrontIndirectorderResponse{}
	_body, _err := client.SyncFrontIndirectorderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 前置签署间联模式订单进件
 * Summary: 前置签署间联模式订单进件
 */
func (client *Client) SyncFrontIndirectorderEx(request *SyncFrontIndirectorderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncFrontIndirectorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncFrontIndirectorderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.front.indirectorder.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 间联模式-后置模式订单进件
 * Summary: 间联模式-后置模式订单进件
 */
func (client *Client) SyncTradeIndirectorder(request *SyncTradeIndirectorderRequest) (_result *SyncTradeIndirectorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncTradeIndirectorderResponse{}
	_body, _err := client.SyncTradeIndirectorderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 间联模式-后置模式订单进件
 * Summary: 间联模式-后置模式订单进件
 */
func (client *Client) SyncTradeIndirectorderEx(request *SyncTradeIndirectorderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncTradeIndirectorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncTradeIndirectorderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.indirectorder.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户履约承诺替换更新
 * Summary: 用户履约承诺替换更新
 */
func (client *Client) ReplaceTradeUserpromise(request *ReplaceTradeUserpromiseRequest) (_result *ReplaceTradeUserpromiseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ReplaceTradeUserpromiseResponse{}
	_body, _err := client.ReplaceTradeUserpromiseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户履约承诺替换更新
 * Summary: 用户履约承诺替换更新
 */
func (client *Client) ReplaceTradeUserpromiseEx(request *ReplaceTradeUserpromiseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ReplaceTradeUserpromiseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ReplaceTradeUserpromiseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.userpromise.replace"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 订单融资预审申请接口
 * Summary: 订单融资预审申请接口
 */
func (client *Client) ApplyTradeFinanceprecheck(request *ApplyTradeFinanceprecheckRequest) (_result *ApplyTradeFinanceprecheckResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyTradeFinanceprecheckResponse{}
	_body, _err := client.ApplyTradeFinanceprecheckEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 订单融资预审申请接口
 * Summary: 订单融资预审申请接口
 */
func (client *Client) ApplyTradeFinanceprecheckEx(request *ApplyTradeFinanceprecheckRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyTradeFinanceprecheckResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyTradeFinanceprecheckResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.financeprecheck.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 非融转融资
 * Summary: 非融转融资
 */
func (client *Client) TransferTradeFinance(request *TransferTradeFinanceRequest) (_result *TransferTradeFinanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &TransferTradeFinanceResponse{}
	_body, _err := client.TransferTradeFinanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 非融转融资
 * Summary: 非融转融资
 */
func (client *Client) TransferTradeFinanceEx(request *TransferTradeFinanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *TransferTradeFinanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &TransferTradeFinanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.finance.transfer"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新订单信息
 * Summary: 更新订单信息
 */
func (client *Client) UpdateTradeOrder(request *UpdateTradeOrderRequest) (_result *UpdateTradeOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateTradeOrderResponse{}
	_body, _err := client.UpdateTradeOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新订单信息
 * Summary: 更新订单信息
 */
func (client *Client) UpdateTradeOrderEx(request *UpdateTradeOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateTradeOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateTradeOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.order.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 融资订单追加预审资金方
 * Summary: 融资订单追加预审资金方
 */
func (client *Client) AddTradeFinanceprecheck(request *AddTradeFinanceprecheckRequest) (_result *AddTradeFinanceprecheckResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddTradeFinanceprecheckResponse{}
	_body, _err := client.AddTradeFinanceprecheckEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 融资订单追加预审资金方
 * Summary: 融资订单追加预审资金方
 */
func (client *Client) AddTradeFinanceprecheckEx(request *AddTradeFinanceprecheckRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddTradeFinanceprecheckResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddTradeFinanceprecheckResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.financeprecheck.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 订单融资信息查询接口
 * Summary: 订单融资信息查询接口
 */
func (client *Client) GetTradeOrderfinanceinfo(request *GetTradeOrderfinanceinfoRequest) (_result *GetTradeOrderfinanceinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTradeOrderfinanceinfoResponse{}
	_body, _err := client.GetTradeOrderfinanceinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 订单融资信息查询接口
 * Summary: 订单融资信息查询接口
 */
func (client *Client) GetTradeOrderfinanceinfoEx(request *GetTradeOrderfinanceinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTradeOrderfinanceinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTradeOrderfinanceinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.orderfinanceinfo.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 订单代扣计划延期
 * Summary: 订单代扣计划延期
 */
func (client *Client) SyncTradeUserpromisedelay(request *SyncTradeUserpromisedelayRequest) (_result *SyncTradeUserpromisedelayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncTradeUserpromisedelayResponse{}
	_body, _err := client.SyncTradeUserpromisedelayEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 订单代扣计划延期
 * Summary: 订单代扣计划延期
 */
func (client *Client) SyncTradeUserpromisedelayEx(request *SyncTradeUserpromisedelayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncTradeUserpromisedelayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncTradeUserpromisedelayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.userpromisedelay.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 订单代扣计划暂停
 * Summary: 订单代扣计划暂停
 */
func (client *Client) PauseTradeUserpromise(request *PauseTradeUserpromiseRequest) (_result *PauseTradeUserpromiseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PauseTradeUserpromiseResponse{}
	_body, _err := client.PauseTradeUserpromiseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 订单代扣计划暂停
 * Summary: 订单代扣计划暂停
 */
func (client *Client) PauseTradeUserpromiseEx(request *PauseTradeUserpromiseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PauseTradeUserpromiseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PauseTradeUserpromiseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.userpromise.pause"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣计划重启
 * Summary: 代扣计划重启
 */
func (client *Client) ResumeTradeUserpromise(request *ResumeTradeUserpromiseRequest) (_result *ResumeTradeUserpromiseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ResumeTradeUserpromiseResponse{}
	_body, _err := client.ResumeTradeUserpromiseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣计划重启
 * Summary: 代扣计划重启
 */
func (client *Client) ResumeTradeUserpromiseEx(request *ResumeTradeUserpromiseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ResumeTradeUserpromiseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResumeTradeUserpromiseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.userpromise.resume"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣签约创建
 * Summary: 代扣签约
 */
func (client *Client) CreateWithholdSign(request *CreateWithholdSignRequest) (_result *CreateWithholdSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateWithholdSignResponse{}
	_body, _err := client.CreateWithholdSignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣签约创建
 * Summary: 代扣签约
 */
func (client *Client) CreateWithholdSignEx(request *CreateWithholdSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateWithholdSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateWithholdSignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.sign.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣签约查询
 * Summary: 代扣签约查询
 */
func (client *Client) QueryWithholdSign(request *QueryWithholdSignRequest) (_result *QueryWithholdSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryWithholdSignResponse{}
	_body, _err := client.QueryWithholdSignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣签约查询
 * Summary: 代扣签约查询
 */
func (client *Client) QueryWithholdSignEx(request *QueryWithholdSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryWithholdSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryWithholdSignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.sign.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 订单关闭后,可以通过此接口解绑签约
 * Summary: 代扣签约解绑
 */
func (client *Client) UnbindWithholdSign(request *UnbindWithholdSignRequest) (_result *UnbindWithholdSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UnbindWithholdSignResponse{}
	_body, _err := client.UnbindWithholdSignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 订单关闭后,可以通过此接口解绑签约
 * Summary: 代扣签约解绑
 */
func (client *Client) UnbindWithholdSignEx(request *UnbindWithholdSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UnbindWithholdSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UnbindWithholdSignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.sign.unbind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
 * Summary: 取消代扣计划
 */
func (client *Client) CancelWithholdPlan(request *CancelWithholdPlanRequest) (_result *CancelWithholdPlanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelWithholdPlanResponse{}
	_body, _err := client.CancelWithholdPlanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
 * Summary: 取消代扣计划
 */
func (client *Client) CancelWithholdPlanEx(request *CancelWithholdPlanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelWithholdPlanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelWithholdPlanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.plan.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
* Description: 重要说明：
   1. 这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
   2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
* Summary: 单期多期代扣取消
*/
func (client *Client) RepayWithholdPlan(request *RepayWithholdPlanRequest) (_result *RepayWithholdPlanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RepayWithholdPlanResponse{}
	_body, _err := client.RepayWithholdPlanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
* Description: 重要说明：
   1. 这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
   2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
* Summary: 单期多期代扣取消
*/
func (client *Client) RepayWithholdPlanEx(request *RepayWithholdPlanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RepayWithholdPlanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RepayWithholdPlanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.plan.repay"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
 * Summary: 扣款计划重试
 */
func (client *Client) RetryWithholdPlan(request *RetryWithholdPlanRequest) (_result *RetryWithholdPlanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RetryWithholdPlanResponse{}
	_body, _err := client.RetryWithholdPlanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
 * Summary: 扣款计划重试
 */
func (client *Client) RetryWithholdPlanEx(request *RetryWithholdPlanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RetryWithholdPlanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RetryWithholdPlanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.plan.retry"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
 * Summary: 代扣签约的异步解约确认
 */
func (client *Client) ConfirmWithholdSignasyncunsign(request *ConfirmWithholdSignasyncunsignRequest) (_result *ConfirmWithholdSignasyncunsignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ConfirmWithholdSignasyncunsignResponse{}
	_body, _err := client.ConfirmWithholdSignasyncunsignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
 * Summary: 代扣签约的异步解约确认
 */
func (client *Client) ConfirmWithholdSignasyncunsignEx(request *ConfirmWithholdSignasyncunsignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ConfirmWithholdSignasyncunsignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmWithholdSignasyncunsignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.signasyncunsign.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣主动支付创建
 * Summary: 代扣主动支付创建
 */
func (client *Client) CreateWithholdActivepay(request *CreateWithholdActivepayRequest) (_result *CreateWithholdActivepayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateWithholdActivepayResponse{}
	_body, _err := client.CreateWithholdActivepayEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣主动支付创建
 * Summary: 代扣主动支付创建
 */
func (client *Client) CreateWithholdActivepayEx(request *CreateWithholdActivepayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateWithholdActivepayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateWithholdActivepayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.activepay.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣主动支付查询
 * Summary: 代扣主动支付查询
 */
func (client *Client) QueryWithholdActivepay(request *QueryWithholdActivepayRequest) (_result *QueryWithholdActivepayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryWithholdActivepayResponse{}
	_body, _err := client.QueryWithholdActivepayEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣主动支付查询
 * Summary: 代扣主动支付查询
 */
func (client *Client) QueryWithholdActivepayEx(request *QueryWithholdActivepayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryWithholdActivepayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryWithholdActivepayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.activepay.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣主动支付取消
 * Summary: 代扣主动支付取消
 */
func (client *Client) CancelWithholdActivepay(request *CancelWithholdActivepayRequest) (_result *CancelWithholdActivepayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelWithholdActivepayResponse{}
	_body, _err := client.CancelWithholdActivepayEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣主动支付取消
 * Summary: 代扣主动支付取消
 */
func (client *Client) CancelWithholdActivepayEx(request *CancelWithholdActivepayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelWithholdActivepayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelWithholdActivepayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.activepay.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建退款请求
 * Summary: 创建退款申请
 */
func (client *Client) CreateWithholdRefund(request *CreateWithholdRefundRequest) (_result *CreateWithholdRefundResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateWithholdRefundResponse{}
	_body, _err := client.CreateWithholdRefundEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建退款请求
 * Summary: 创建退款申请
 */
func (client *Client) CreateWithholdRefundEx(request *CreateWithholdRefundRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateWithholdRefundResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateWithholdRefundResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.refund.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 退款申请结果查询
 * Summary: 退款申请结果查询
 */
func (client *Client) QueryWithholdRefund(request *QueryWithholdRefundRequest) (_result *QueryWithholdRefundResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryWithholdRefundResponse{}
	_body, _err := client.QueryWithholdRefundEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 退款申请结果查询
 * Summary: 退款申请结果查询
 */
func (client *Client) QueryWithholdRefundEx(request *QueryWithholdRefundRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryWithholdRefundResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryWithholdRefundResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.refund.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代偿户账户查询
 * Summary: 代偿户账户查询
 */
func (client *Client) QueryWithholdCompensateaccount(request *QueryWithholdCompensateaccountRequest) (_result *QueryWithholdCompensateaccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryWithholdCompensateaccountResponse{}
	_body, _err := client.QueryWithholdCompensateaccountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代偿户账户查询
 * Summary: 代偿户账户查询
 */
func (client *Client) QueryWithholdCompensateaccountEx(request *QueryWithholdCompensateaccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryWithholdCompensateaccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryWithholdCompensateaccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.compensateaccount.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
