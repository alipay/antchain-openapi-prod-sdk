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

// 商品规格选项
type ProductSpecOption struct {
	// 规格key
	SpecKey *string `json:"spec_key,omitempty" xml:"spec_key,omitempty"`
	// 规格名称
	DisplayName *string `json:"display_name,omitempty" xml:"display_name,omitempty"`
	// 规格值
	SpecValue *string `json:"spec_value,omitempty" xml:"spec_value,omitempty"`
}

func (s ProductSpecOption) String() string {
	return tea.Prettify(s)
}

func (s ProductSpecOption) GoString() string {
	return s.String()
}

func (s *ProductSpecOption) SetSpecKey(v string) *ProductSpecOption {
	s.SpecKey = &v
	return s
}

func (s *ProductSpecOption) SetDisplayName(v string) *ProductSpecOption {
	s.DisplayName = &v
	return s
}

func (s *ProductSpecOption) SetSpecValue(v string) *ProductSpecOption {
	s.SpecValue = &v
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

// 付款项目
type PaymentItem struct {
	// 付款金额，单位分
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty"`
	// 付款项目类型
	PaymentType *string `json:"payment_type,omitempty" xml:"payment_type,omitempty"`
}

func (s PaymentItem) String() string {
	return tea.Prettify(s)
}

func (s PaymentItem) GoString() string {
	return s.String()
}

func (s *PaymentItem) SetAmount(v int64) *PaymentItem {
	s.Amount = &v
	return s
}

func (s *PaymentItem) SetPaymentType(v string) *PaymentItem {
	s.PaymentType = &v
	return s
}

// 随时享-商品规格值对象
type ProductSpecValue struct {
	// 规格值
	SpecValue *string `json:"spec_value,omitempty" xml:"spec_value,omitempty"`
	// 规格图片key
	ImageFileKey *string `json:"image_file_key,omitempty" xml:"image_file_key,omitempty"`
	// 规格图片http链接
	LargeImageFileKey *string `json:"large_image_file_key,omitempty" xml:"large_image_file_key,omitempty"`
}

func (s ProductSpecValue) String() string {
	return tea.Prettify(s)
}

func (s ProductSpecValue) GoString() string {
	return s.String()
}

func (s *ProductSpecValue) SetSpecValue(v string) *ProductSpecValue {
	s.SpecValue = &v
	return s
}

func (s *ProductSpecValue) SetImageFileKey(v string) *ProductSpecValue {
	s.ImageFileKey = &v
	return s
}

func (s *ProductSpecValue) SetLargeImageFileKey(v string) *ProductSpecValue {
	s.LargeImageFileKey = &v
	return s
}

// 商品租赁价格规格
type LeasePriceProp struct {
	// 商户商品skuId
	MerchantSkuId *string `json:"merchant_sku_id,omitempty" xml:"merchant_sku_id,omitempty"`
	// 商品规格列表
	ProductSpecOptionList []*ProductSpecOption `json:"product_spec_option_list,omitempty" xml:"product_spec_option_list,omitempty" type:"Repeated"`
	// 规格图片
	SpecImageFileKey *string `json:"spec_image_file_key,omitempty" xml:"spec_image_file_key,omitempty"`
	// 规格图片
	LargeSpecImageFileKey *string `json:"large_spec_image_file_key,omitempty" xml:"large_spec_image_file_key,omitempty"`
	// 原订单总金额（单位分）
	OriginTotalRentMoney *int64 `json:"origin_total_rent_money,omitempty" xml:"origin_total_rent_money,omitempty"`
	// 现订单总金额（单位分）
	TotalRentMoney *int64 `json:"total_rent_money,omitempty" xml:"total_rent_money,omitempty"`
	// 原日租金（单位分）
	OriginDailyRentMoney *int64 `json:"origin_daily_rent_money,omitempty" xml:"origin_daily_rent_money,omitempty"`
	// 现日租金（单位分）
	DailyRentMoney *int64 `json:"daily_rent_money,omitempty" xml:"daily_rent_money,omitempty"`
	// 库存
	StockQuantity *int64 `json:"stock_quantity,omitempty" xml:"stock_quantity,omitempty"`
	// 续租价（单位分）
	RenewPrice *int64 `json:"renew_price,omitempty" xml:"renew_price,omitempty"`
	// 买断价（单位分）
	BuyoutPrice *int64 `json:"buyout_price,omitempty" xml:"buyout_price,omitempty"`
	// 是否可售卖
	ForSale *bool `json:"for_sale,omitempty" xml:"for_sale,omitempty"`
}

func (s LeasePriceProp) String() string {
	return tea.Prettify(s)
}

func (s LeasePriceProp) GoString() string {
	return s.String()
}

func (s *LeasePriceProp) SetMerchantSkuId(v string) *LeasePriceProp {
	s.MerchantSkuId = &v
	return s
}

func (s *LeasePriceProp) SetProductSpecOptionList(v []*ProductSpecOption) *LeasePriceProp {
	s.ProductSpecOptionList = v
	return s
}

func (s *LeasePriceProp) SetSpecImageFileKey(v string) *LeasePriceProp {
	s.SpecImageFileKey = &v
	return s
}

func (s *LeasePriceProp) SetLargeSpecImageFileKey(v string) *LeasePriceProp {
	s.LargeSpecImageFileKey = &v
	return s
}

func (s *LeasePriceProp) SetOriginTotalRentMoney(v int64) *LeasePriceProp {
	s.OriginTotalRentMoney = &v
	return s
}

func (s *LeasePriceProp) SetTotalRentMoney(v int64) *LeasePriceProp {
	s.TotalRentMoney = &v
	return s
}

func (s *LeasePriceProp) SetOriginDailyRentMoney(v int64) *LeasePriceProp {
	s.OriginDailyRentMoney = &v
	return s
}

func (s *LeasePriceProp) SetDailyRentMoney(v int64) *LeasePriceProp {
	s.DailyRentMoney = &v
	return s
}

func (s *LeasePriceProp) SetStockQuantity(v int64) *LeasePriceProp {
	s.StockQuantity = &v
	return s
}

func (s *LeasePriceProp) SetRenewPrice(v int64) *LeasePriceProp {
	s.RenewPrice = &v
	return s
}

func (s *LeasePriceProp) SetBuyoutPrice(v int64) *LeasePriceProp {
	s.BuyoutPrice = &v
	return s
}

func (s *LeasePriceProp) SetForSale(v bool) *LeasePriceProp {
	s.ForSale = &v
	return s
}

// 赎回结果信息
type MerchantPerformanceRedeemResultInfo struct {
	// 回购支付方式
	// ONLINE-线上
	// OFFLINE-线下
	RedeemWay *string `json:"redeem_way,omitempty" xml:"redeem_way,omitempty"`
	// 回购时间
	RedeemTime *string `json:"redeem_time,omitempty" xml:"redeem_time,omitempty"`
	// 回购原因
	// ACTIVE_REDEEM("ACTIVE_REDEEM", "自主赎回"),
	// RENTING_OUT_REDEEM("RENTING_OUT_REDEEM",
	//                                                                           "退租赎回"),
	// RENTING_AND_RESALE_REDEEM("RENTING_AND_RESALE_REDEEM",
	//                                                                                  "租转售赎回");
	RedeemReason *string `json:"redeem_reason,omitempty" xml:"redeem_reason,omitempty"`
	// 回购类型
	// TRANSFER，转账代偿
	// WITHHOLD，代扣代偿
	RedeemType *string `json:"redeem_type,omitempty" xml:"redeem_type,omitempty"`
	// 回购金额（分）
	RedeemAmount *int64 `json:"redeem_amount,omitempty" xml:"redeem_amount,omitempty"`
	// 回购状态
	// PAYING 回购中
	// SUCCESS 成功
	// FAILED 失败
	RedeemStatus *string `json:"redeem_status,omitempty" xml:"redeem_status,omitempty"`
}

func (s MerchantPerformanceRedeemResultInfo) String() string {
	return tea.Prettify(s)
}

func (s MerchantPerformanceRedeemResultInfo) GoString() string {
	return s.String()
}

func (s *MerchantPerformanceRedeemResultInfo) SetRedeemWay(v string) *MerchantPerformanceRedeemResultInfo {
	s.RedeemWay = &v
	return s
}

func (s *MerchantPerformanceRedeemResultInfo) SetRedeemTime(v string) *MerchantPerformanceRedeemResultInfo {
	s.RedeemTime = &v
	return s
}

func (s *MerchantPerformanceRedeemResultInfo) SetRedeemReason(v string) *MerchantPerformanceRedeemResultInfo {
	s.RedeemReason = &v
	return s
}

func (s *MerchantPerformanceRedeemResultInfo) SetRedeemType(v string) *MerchantPerformanceRedeemResultInfo {
	s.RedeemType = &v
	return s
}

func (s *MerchantPerformanceRedeemResultInfo) SetRedeemAmount(v int64) *MerchantPerformanceRedeemResultInfo {
	s.RedeemAmount = &v
	return s
}

func (s *MerchantPerformanceRedeemResultInfo) SetRedeemStatus(v string) *MerchantPerformanceRedeemResultInfo {
	s.RedeemStatus = &v
	return s
}

// 单期明细
type SingleTermDetail struct {
	// 期数
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" require:"true" minimum:"1"`
	// 支付金额
	PayAmount *int64 `json:"pay_amount,omitempty" xml:"pay_amount,omitempty" require:"true" minimum:"1"`
}

func (s SingleTermDetail) String() string {
	return tea.Prettify(s)
}

func (s SingleTermDetail) GoString() string {
	return s.String()
}

func (s *SingleTermDetail) SetPeriodNum(v int64) *SingleTermDetail {
	s.PeriodNum = &v
	return s
}

func (s *SingleTermDetail) SetPayAmount(v int64) *SingleTermDetail {
	s.PayAmount = &v
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

// 租赁价格方案
type LeasePricePlan struct {
	// 租赁方案
	RentalPlan *string `json:"rental_plan,omitempty" xml:"rental_plan,omitempty"`
	// 租赁周期
	RentalPeriod *int64 `json:"rental_period,omitempty" xml:"rental_period,omitempty"`
	// 租赁价格属性列表
	LeasePricePropList []*LeasePriceProp `json:"lease_price_prop_list,omitempty" xml:"lease_price_prop_list,omitempty" type:"Repeated"`
}

func (s LeasePricePlan) String() string {
	return tea.Prettify(s)
}

func (s LeasePricePlan) GoString() string {
	return s.String()
}

func (s *LeasePricePlan) SetRentalPlan(v string) *LeasePricePlan {
	s.RentalPlan = &v
	return s
}

func (s *LeasePricePlan) SetRentalPeriod(v int64) *LeasePricePlan {
	s.RentalPeriod = &v
	return s
}

func (s *LeasePricePlan) SetLeasePricePropList(v []*LeasePriceProp) *LeasePricePlan {
	s.LeasePricePropList = v
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

// 随时享-服务商平台报名商家信息对象
type SignProductMerchant struct {
	// 商户商品spuId
	MerchantProductId *string `json:"merchant_product_id,omitempty" xml:"merchant_product_id,omitempty"`
	// 商户品牌
	MerchantBrand *string `json:"merchant_brand,omitempty" xml:"merchant_brand,omitempty"`
	// 商户logo
	MerchantLogo *string `json:"merchant_logo,omitempty" xml:"merchant_logo,omitempty"`
	// 商户logo
	LargeMerchantLogo *string `json:"large_merchant_logo,omitempty" xml:"large_merchant_logo,omitempty"`
	// 是否置灰
	Grayed *bool `json:"grayed,omitempty" xml:"grayed,omitempty"`
}

func (s SignProductMerchant) String() string {
	return tea.Prettify(s)
}

func (s SignProductMerchant) GoString() string {
	return s.String()
}

func (s *SignProductMerchant) SetMerchantProductId(v string) *SignProductMerchant {
	s.MerchantProductId = &v
	return s
}

func (s *SignProductMerchant) SetMerchantBrand(v string) *SignProductMerchant {
	s.MerchantBrand = &v
	return s
}

func (s *SignProductMerchant) SetMerchantLogo(v string) *SignProductMerchant {
	s.MerchantLogo = &v
	return s
}

func (s *SignProductMerchant) SetLargeMerchantLogo(v string) *SignProductMerchant {
	s.LargeMerchantLogo = &v
	return s
}

func (s *SignProductMerchant) SetGrayed(v bool) *SignProductMerchant {
	s.Grayed = &v
	return s
}

// 产品规格定义
type ProductSpecConfig struct {
	// 规格名称
	SpecKey *string `json:"spec_key,omitempty" xml:"spec_key,omitempty"`
	// 规格名称
	DisplayName *string `json:"display_name,omitempty" xml:"display_name,omitempty"`
	// 允许值列表
	SpecValueList []*ProductSpecValue `json:"spec_value_list,omitempty" xml:"spec_value_list,omitempty" type:"Repeated"`
}

func (s ProductSpecConfig) String() string {
	return tea.Prettify(s)
}

func (s ProductSpecConfig) GoString() string {
	return s.String()
}

func (s *ProductSpecConfig) SetSpecKey(v string) *ProductSpecConfig {
	s.SpecKey = &v
	return s
}

func (s *ProductSpecConfig) SetDisplayName(v string) *ProductSpecConfig {
	s.DisplayName = &v
	return s
}

func (s *ProductSpecConfig) SetSpecValueList(v []*ProductSpecValue) *ProductSpecConfig {
	s.SpecValueList = v
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
	// 付款项目列表
	PaymentItemList []*PaymentItem `json:"payment_item_list,omitempty" xml:"payment_item_list,omitempty" type:"Repeated"`
	// 是否无需履约
	NoPerformance *string `json:"no_performance,omitempty" xml:"no_performance,omitempty"`
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

func (s *OrderRepayStrategy) SetPaymentItemList(v []*PaymentItem) *OrderRepayStrategy {
	s.PaymentItemList = v
	return s
}

func (s *OrderRepayStrategy) SetNoPerformance(v string) *OrderRepayStrategy {
	s.NoPerformance = &v
	return s
}

// 进件流程信息
type ExpandProcessInfo struct {
	// TENANT_INDIRECT_MAINCLASS(间联类目)
	// TENANT_ENDPOINT（回调地址）
	// CUSTOM_SERVICE_INFO（客服信息）
	// AGENTCUSTOMERPESONINFO（间联客诉人员）
	// MERCHANT_EXPAND（商户进件）
	ProcessNode *string `json:"process_node,omitempty" xml:"process_node,omitempty"`
	// 是否已提交
	IsSubmitted *bool `json:"is_submitted,omitempty" xml:"is_submitted,omitempty"`
	// 审核通过
	AuditStatus *string `json:"audit_status,omitempty" xml:"audit_status,omitempty"`
}

func (s ExpandProcessInfo) String() string {
	return tea.Prettify(s)
}

func (s ExpandProcessInfo) GoString() string {
	return s.String()
}

func (s *ExpandProcessInfo) SetProcessNode(v string) *ExpandProcessInfo {
	s.ProcessNode = &v
	return s
}

func (s *ExpandProcessInfo) SetIsSubmitted(v bool) *ExpandProcessInfo {
	s.IsSubmitted = &v
	return s
}

func (s *ExpandProcessInfo) SetAuditStatus(v string) *ExpandProcessInfo {
	s.AuditStatus = &v
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

// 模板详情
type TemplateInfo struct {
	// 模板id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 模板版本，不传取最新模板
	TemplateVersion *int64 `json:"template_version,omitempty" xml:"template_version,omitempty"`
	// 模板参数，JSON格式，其中key对应模板中的名称，value对应其要渲染的值
	TemplateArgs *string `json:"template_args,omitempty" xml:"template_args,omitempty"`
	// 模板所属商户id
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
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

func (s *TemplateInfo) SetTemplateVersion(v int64) *TemplateInfo {
	s.TemplateVersion = &v
	return s
}

func (s *TemplateInfo) SetTemplateArgs(v string) *TemplateInfo {
	s.TemplateArgs = &v
	return s
}

func (s *TemplateInfo) SetMerchantId(v string) *TemplateInfo {
	s.MerchantId = &v
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
	// 商户统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// 商户名称
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty"`
	// 订单开始履约期数
	DivideStartTermIndex *int64 `json:"divide_start_term_index,omitempty" xml:"divide_start_term_index,omitempty"`
	// 订单关联的营销id
	PromotionId *string `json:"promotion_id,omitempty" xml:"promotion_id,omitempty"`
	// 融资类型
	// SUPPLY_CHAIN_FINANCE
	FundMode *string `json:"fund_mode,omitempty" xml:"fund_mode,omitempty"`
	// 订单支付渠道
	// ALIPAY
	// JDPAY
	PayChannel *string `json:"pay_channel,omitempty" xml:"pay_channel,omitempty"`
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

func (s *OrderInfo) SetMerchantId(v string) *OrderInfo {
	s.MerchantId = &v
	return s
}

func (s *OrderInfo) SetMerchantName(v string) *OrderInfo {
	s.MerchantName = &v
	return s
}

func (s *OrderInfo) SetDivideStartTermIndex(v int64) *OrderInfo {
	s.DivideStartTermIndex = &v
	return s
}

func (s *OrderInfo) SetPromotionId(v string) *OrderInfo {
	s.PromotionId = &v
	return s
}

func (s *OrderInfo) SetFundMode(v string) *OrderInfo {
	s.FundMode = &v
	return s
}

func (s *OrderInfo) SetPayChannel(v string) *OrderInfo {
	s.PayChannel = &v
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

// 资产包履约计划
type AssetPackagePromisePlan struct {
	// 账期
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty"`
	// 还款时间yyyy-MM-dd
	PayDay *string `json:"pay_day,omitempty" xml:"pay_day,omitempty"`
	// 计划还款总额，单位为分
	TotalAmount *int64 `json:"total_amount,omitempty" xml:"total_amount,omitempty"`
	// 本金，单位为分
	PrincipalAmount *int64 `json:"principal_amount,omitempty" xml:"principal_amount,omitempty"`
	// 利息，单位为分
	InterestAmount *int64 `json:"interest_amount,omitempty" xml:"interest_amount,omitempty"`
	// 构成订单数
	OrderCount *int64 `json:"order_count,omitempty" xml:"order_count,omitempty"`
}

func (s AssetPackagePromisePlan) String() string {
	return tea.Prettify(s)
}

func (s AssetPackagePromisePlan) GoString() string {
	return s.String()
}

func (s *AssetPackagePromisePlan) SetPeriodNum(v int64) *AssetPackagePromisePlan {
	s.PeriodNum = &v
	return s
}

func (s *AssetPackagePromisePlan) SetPayDay(v string) *AssetPackagePromisePlan {
	s.PayDay = &v
	return s
}

func (s *AssetPackagePromisePlan) SetTotalAmount(v int64) *AssetPackagePromisePlan {
	s.TotalAmount = &v
	return s
}

func (s *AssetPackagePromisePlan) SetPrincipalAmount(v int64) *AssetPackagePromisePlan {
	s.PrincipalAmount = &v
	return s
}

func (s *AssetPackagePromisePlan) SetInterestAmount(v int64) *AssetPackagePromisePlan {
	s.InterestAmount = &v
	return s
}

func (s *AssetPackagePromisePlan) SetOrderCount(v int64) *AssetPackagePromisePlan {
	s.OrderCount = &v
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
	// 支付渠道
	// ALIPAY
	// JDPAY
	PayChannel *string `json:"pay_channel,omitempty" xml:"pay_channel,omitempty"`
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

func (s *RelationPage) SetPayChannel(v string) *RelationPage {
	s.PayChannel = &v
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

// 分销渠道
type SalesChannel struct {
	// 渠道码
	ChannelCode *string `json:"channel_code,omitempty" xml:"channel_code,omitempty" require:"true"`
	// 渠道名称
	ChannelName *string `json:"channel_name,omitempty" xml:"channel_name,omitempty" require:"true"`
	// 渠道级别，从小到大代表级别由高到低
	ChannelLevel *int64 `json:"channel_level,omitempty" xml:"channel_level,omitempty" require:"true"`
}

func (s SalesChannel) String() string {
	return tea.Prettify(s)
}

func (s SalesChannel) GoString() string {
	return s.String()
}

func (s *SalesChannel) SetChannelCode(v string) *SalesChannel {
	s.ChannelCode = &v
	return s
}

func (s *SalesChannel) SetChannelName(v string) *SalesChannel {
	s.ChannelName = &v
	return s
}

func (s *SalesChannel) SetChannelLevel(v int64) *SalesChannel {
	s.ChannelLevel = &v
	return s
}

// 商家履约信息
type MerchantOrderFulfillmentInfo struct {
	// 还款期数
	TermIndex *int64 `json:"term_index,omitempty" xml:"term_index,omitempty"`
	// 订单用户租期编号
	LeaseTermIndex *int64 `json:"lease_term_index,omitempty" xml:"lease_term_index,omitempty"`
	// 租期归还状态
	RentalReturnState *string `json:"rental_return_state,omitempty" xml:"rental_return_state,omitempty"`
	// 还款方式
	ReturnWay *string `json:"return_way,omitempty" xml:"return_way,omitempty"`
	// 支付类型
	PayType *string `json:"pay_type,omitempty" xml:"pay_type,omitempty"`
	// 实际到账金额
	TotalMoney *int64 `json:"total_money,omitempty" xml:"total_money,omitempty"`
	// 实际还款时间(yyyy-MM-dd HH:mm:ss)
	ReturnTime *string `json:"return_time,omitempty" xml:"return_time,omitempty"`
	// 外部交易流水号
	ReturnVoucherSerial *string `json:"return_voucher_serial,omitempty" xml:"return_voucher_serial,omitempty"`
	// 支付宝交易流水号
	AlipayTradeNo *string `json:"alipay_trade_no,omitempty" xml:"alipay_trade_no,omitempty"`
	// 资方公司名称
	FundCompanyName *string `json:"fund_company_name,omitempty" xml:"fund_company_name,omitempty"`
	// 支付描述
	PaymentDescription *string `json:"payment_description,omitempty" xml:"payment_description,omitempty"`
}

func (s MerchantOrderFulfillmentInfo) String() string {
	return tea.Prettify(s)
}

func (s MerchantOrderFulfillmentInfo) GoString() string {
	return s.String()
}

func (s *MerchantOrderFulfillmentInfo) SetTermIndex(v int64) *MerchantOrderFulfillmentInfo {
	s.TermIndex = &v
	return s
}

func (s *MerchantOrderFulfillmentInfo) SetLeaseTermIndex(v int64) *MerchantOrderFulfillmentInfo {
	s.LeaseTermIndex = &v
	return s
}

func (s *MerchantOrderFulfillmentInfo) SetRentalReturnState(v string) *MerchantOrderFulfillmentInfo {
	s.RentalReturnState = &v
	return s
}

func (s *MerchantOrderFulfillmentInfo) SetReturnWay(v string) *MerchantOrderFulfillmentInfo {
	s.ReturnWay = &v
	return s
}

func (s *MerchantOrderFulfillmentInfo) SetPayType(v string) *MerchantOrderFulfillmentInfo {
	s.PayType = &v
	return s
}

func (s *MerchantOrderFulfillmentInfo) SetTotalMoney(v int64) *MerchantOrderFulfillmentInfo {
	s.TotalMoney = &v
	return s
}

func (s *MerchantOrderFulfillmentInfo) SetReturnTime(v string) *MerchantOrderFulfillmentInfo {
	s.ReturnTime = &v
	return s
}

func (s *MerchantOrderFulfillmentInfo) SetReturnVoucherSerial(v string) *MerchantOrderFulfillmentInfo {
	s.ReturnVoucherSerial = &v
	return s
}

func (s *MerchantOrderFulfillmentInfo) SetAlipayTradeNo(v string) *MerchantOrderFulfillmentInfo {
	s.AlipayTradeNo = &v
	return s
}

func (s *MerchantOrderFulfillmentInfo) SetFundCompanyName(v string) *MerchantOrderFulfillmentInfo {
	s.FundCompanyName = &v
	return s
}

func (s *MerchantOrderFulfillmentInfo) SetPaymentDescription(v string) *MerchantOrderFulfillmentInfo {
	s.PaymentDescription = &v
	return s
}

// 用户解约申请材料
type TerminateApplyEvidence struct {
	// 用户申请解约问题类型
	TerminateApplyReason *string `json:"terminate_apply_reason,omitempty" xml:"terminate_apply_reason,omitempty"`
	// 用户申请解约问题描述
	TerminateApplyRefer *string `json:"terminate_apply_refer,omitempty" xml:"terminate_apply_refer,omitempty"`
	// 用户联系电话
	UserPhoneNum *string `json:"user_phone_num,omitempty" xml:"user_phone_num,omitempty"`
	// 用户申请解约证据（图片、视频）
	TerminateApplyEvidences []*string `json:"terminate_apply_evidences,omitempty" xml:"terminate_apply_evidences,omitempty" type:"Repeated"`
	// 用户申请提交材料时间
	TerminateOperateTime *string `json:"terminate_operate_time,omitempty" xml:"terminate_operate_time,omitempty"`
}

func (s TerminateApplyEvidence) String() string {
	return tea.Prettify(s)
}

func (s TerminateApplyEvidence) GoString() string {
	return s.String()
}

func (s *TerminateApplyEvidence) SetTerminateApplyReason(v string) *TerminateApplyEvidence {
	s.TerminateApplyReason = &v
	return s
}

func (s *TerminateApplyEvidence) SetTerminateApplyRefer(v string) *TerminateApplyEvidence {
	s.TerminateApplyRefer = &v
	return s
}

func (s *TerminateApplyEvidence) SetUserPhoneNum(v string) *TerminateApplyEvidence {
	s.UserPhoneNum = &v
	return s
}

func (s *TerminateApplyEvidence) SetTerminateApplyEvidences(v []*string) *TerminateApplyEvidence {
	s.TerminateApplyEvidences = v
	return s
}

func (s *TerminateApplyEvidence) SetTerminateOperateTime(v string) *TerminateApplyEvidence {
	s.TerminateOperateTime = &v
	return s
}

// 订单物流信息
type OrderLogisticInfo struct {
	// 物流单号
	LogisticOrderId *string `json:"logistic_order_id,omitempty" xml:"logistic_order_id,omitempty"`
	// 物流状态
	LogisticStatus *string `json:"logistic_status,omitempty" xml:"logistic_status,omitempty"`
}

func (s OrderLogisticInfo) String() string {
	return tea.Prettify(s)
}

func (s OrderLogisticInfo) GoString() string {
	return s.String()
}

func (s *OrderLogisticInfo) SetLogisticOrderId(v string) *OrderLogisticInfo {
	s.LogisticOrderId = &v
	return s
}

func (s *OrderLogisticInfo) SetLogisticStatus(v string) *OrderLogisticInfo {
	s.LogisticStatus = &v
	return s
}

// 商户控股信息（京东商户进件）
type MerchantHoldingInfo struct {
	// 控股类型名称
	// 企业股东:ENTERPRISE_SHAREHOLDER
	// 个人股东:PERSONAL_SHAREHOLDER
	HoldingTypeName *string `json:"holding_type_name,omitempty" xml:"holding_type_name,omitempty" require:"true"`
	// 控股公司名称
	HoldingCompany *string `json:"holding_company,omitempty" xml:"holding_company,omitempty" require:"true"`
	// 证件号码
	CertificateNumber *string `json:"certificate_number,omitempty" xml:"certificate_number,omitempty" require:"true"`
	// 证件是否长期有效
	// 长期true，
	// 否则false
	LongDate *bool `json:"long_date,omitempty" xml:"long_date,omitempty" require:"true"`
	// 失效时间
	// 商户控股信息longdate为true 时，可为空 ，格式YYYY-MM-DD
	ExpireDate *string `json:"expire_date,omitempty" xml:"expire_date,omitempty"`
}

func (s MerchantHoldingInfo) String() string {
	return tea.Prettify(s)
}

func (s MerchantHoldingInfo) GoString() string {
	return s.String()
}

func (s *MerchantHoldingInfo) SetHoldingTypeName(v string) *MerchantHoldingInfo {
	s.HoldingTypeName = &v
	return s
}

func (s *MerchantHoldingInfo) SetHoldingCompany(v string) *MerchantHoldingInfo {
	s.HoldingCompany = &v
	return s
}

func (s *MerchantHoldingInfo) SetCertificateNumber(v string) *MerchantHoldingInfo {
	s.CertificateNumber = &v
	return s
}

func (s *MerchantHoldingInfo) SetLongDate(v bool) *MerchantHoldingInfo {
	s.LongDate = &v
	return s
}

func (s *MerchantHoldingInfo) SetExpireDate(v string) *MerchantHoldingInfo {
	s.ExpireDate = &v
	return s
}

// 资产包履约计划分配明细
type AssetPackagePlanAllocateDetail struct {
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 商户租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 类型
	// PERFORMANCE 履约
	// ASSET_PACKAGE_EXCESS 资产包超额
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 用户还款期数
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty"`
	// 用户还款时间yyyy-MM-dd
	PayDay *string `json:"pay_day,omitempty" xml:"pay_day,omitempty"`
	// 用户还款金额，单位为分
	PayAmount *int64 `json:"pay_amount,omitempty" xml:"pay_amount,omitempty"`
	// 分账比例(不存储实时计算)，保留两位小数，比例统一类型。
	DivideRatio *string `json:"divide_ratio,omitempty" xml:"divide_ratio,omitempty"`
	// 商户履约分账金额
	DivideAmount *int64 `json:"divide_amount,omitempty" xml:"divide_amount,omitempty"`
}

func (s AssetPackagePlanAllocateDetail) String() string {
	return tea.Prettify(s)
}

func (s AssetPackagePlanAllocateDetail) GoString() string {
	return s.String()
}

func (s *AssetPackagePlanAllocateDetail) SetOrderId(v string) *AssetPackagePlanAllocateDetail {
	s.OrderId = &v
	return s
}

func (s *AssetPackagePlanAllocateDetail) SetTenantId(v string) *AssetPackagePlanAllocateDetail {
	s.TenantId = &v
	return s
}

func (s *AssetPackagePlanAllocateDetail) SetType(v string) *AssetPackagePlanAllocateDetail {
	s.Type = &v
	return s
}

func (s *AssetPackagePlanAllocateDetail) SetPeriodNum(v int64) *AssetPackagePlanAllocateDetail {
	s.PeriodNum = &v
	return s
}

func (s *AssetPackagePlanAllocateDetail) SetPayDay(v string) *AssetPackagePlanAllocateDetail {
	s.PayDay = &v
	return s
}

func (s *AssetPackagePlanAllocateDetail) SetPayAmount(v int64) *AssetPackagePlanAllocateDetail {
	s.PayAmount = &v
	return s
}

func (s *AssetPackagePlanAllocateDetail) SetDivideRatio(v string) *AssetPackagePlanAllocateDetail {
	s.DivideRatio = &v
	return s
}

func (s *AssetPackagePlanAllocateDetail) SetDivideAmount(v int64) *AssetPackagePlanAllocateDetail {
	s.DivideAmount = &v
	return s
}

// 应用信息
type ApplicationInfo struct {
	// 应用场景（payChannel =JDPAY仅支持MINI_APP）
	// MINI_APP 小程序
	// APP 自有app
	// ALL 两种都有
	ApplicationScene *string `json:"application_scene,omitempty" xml:"application_scene,omitempty"`
	// 小程序id
	TinyAppId *string `json:"tiny_app_id,omitempty" xml:"tiny_app_id,omitempty"`
	// 小程序名称
	SiteName *string `json:"site_name,omitempty" xml:"site_name,omitempty"`
	// 网站地址（pay_channel=ALIPAY必填）
	SitUrl *string `json:"sit_url,omitempty" xml:"sit_url,omitempty"`
	// 商户名称。（pay_channel=ALIPAY必填）
	// 修改后的商户名称，将同步支付宝代扣签约页面字段展示
	//
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty"`
	// 商户服务名称。（pay_channel=ALIPAY必填）
	// 修改后的商户服务名称，将同步支付宝代扣签约页面字段展示
	MerchantServiceName *string `json:"merchant_service_name,omitempty" xml:"merchant_service_name,omitempty"`
	// 商户服务描述。（pay_channel=ALIPAY必填）
	// 修改后的商户服务描述，将同步支付宝代扣签约页面字段展示
	MerchantServiceDesc *string `json:"merchant_service_desc,omitempty" xml:"merchant_service_desc,omitempty"`
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
	// 拒量模型捞回分
	MobThreeScore *string `json:"mob_three_score,omitempty" xml:"mob_three_score,omitempty"`
	// 拒量模型首逾分
	FpdThirtyScore *string `json:"fpd_thirty_score,omitempty" xml:"fpd_thirty_score,omitempty"`
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

func (s *RiskModel) SetMobThreeScore(v string) *RiskModel {
	s.MobThreeScore = &v
	return s
}

func (s *RiskModel) SetFpdThirtyScore(v string) *RiskModel {
	s.FpdThirtyScore = &v
	return s
}

// 随时享-服务商平台场景商品列表resp
type SceneProductInfoResp struct {
	// 平台商品id
	PlatformProductId *string `json:"platform_product_id,omitempty" xml:"platform_product_id,omitempty"`
	// 商品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty"`
	// 封面首图url链接
	FirstCoverImageUrl *string `json:"first_cover_image_url,omitempty" xml:"first_cover_image_url,omitempty"`
	// 封面首图url链接
	LargeFirstCoverImageUrl *string `json:"large_first_cover_image_url,omitempty" xml:"large_first_cover_image_url,omitempty"`
	// 产品规格列表
	SpecConfigList []*ProductSpecConfig `json:"spec_config_list,omitempty" xml:"spec_config_list,omitempty" type:"Repeated"`
	// 租赁方案
	RentalPlan []*string `json:"rental_plan,omitempty" xml:"rental_plan,omitempty" type:"Repeated"`
	// 租赁周期
	RentalPeriod []*int64 `json:"rental_period,omitempty" xml:"rental_period,omitempty" type:"Repeated"`
	// 可续租
	SupportRenew *bool `json:"support_renew,omitempty" xml:"support_renew,omitempty"`
	// 可买断
	SupportBuyout *bool `json:"support_buyout,omitempty" xml:"support_buyout,omitempty"`
	// 最低日租金
	LowestDailyRentMoney *int64 `json:"lowest_daily_rent_money,omitempty" xml:"lowest_daily_rent_money,omitempty"`
	// 最低日租金
	LowestDailyRentMoneyYuan *string `json:"lowest_daily_rent_money_yuan,omitempty" xml:"lowest_daily_rent_money_yuan,omitempty"`
	// 最高日租金
	HighestDailyRentMoney *int64 `json:"highest_daily_rent_money,omitempty" xml:"highest_daily_rent_money,omitempty"`
	// 最高日租金
	HighestDailyRentMoneyYuan *string `json:"highest_daily_rent_money_yuan,omitempty" xml:"highest_daily_rent_money_yuan,omitempty"`
	// 添加标志
	AddedFlag *bool `json:"added_flag,omitempty" xml:"added_flag,omitempty"`
	// 报名商家列表
	SignProductMerchantList []*SignProductMerchant `json:"sign_product_merchant_list,omitempty" xml:"sign_product_merchant_list,omitempty" type:"Repeated"`
	// 报名商家数量
	SignProductMerchantCount *int64 `json:"sign_product_merchant_count,omitempty" xml:"sign_product_merchant_count,omitempty"`
	// 适用商家列表
	ApplyProductMerchantList []*SignProductMerchant `json:"apply_product_merchant_list,omitempty" xml:"apply_product_merchant_list,omitempty" type:"Repeated"`
	// 适用商家数量
	ApplyProductMerchantCount *int64 `json:"apply_product_merchant_count,omitempty" xml:"apply_product_merchant_count,omitempty"`
	// 场景商品上下架状态
	DisplayStatus *string `json:"display_status,omitempty" xml:"display_status,omitempty"`
	// 推广方式
	DeliveryMode *string `json:"delivery_mode,omitempty" xml:"delivery_mode,omitempty"`
}

func (s SceneProductInfoResp) String() string {
	return tea.Prettify(s)
}

func (s SceneProductInfoResp) GoString() string {
	return s.String()
}

func (s *SceneProductInfoResp) SetPlatformProductId(v string) *SceneProductInfoResp {
	s.PlatformProductId = &v
	return s
}

func (s *SceneProductInfoResp) SetProductName(v string) *SceneProductInfoResp {
	s.ProductName = &v
	return s
}

func (s *SceneProductInfoResp) SetFirstCoverImageUrl(v string) *SceneProductInfoResp {
	s.FirstCoverImageUrl = &v
	return s
}

func (s *SceneProductInfoResp) SetLargeFirstCoverImageUrl(v string) *SceneProductInfoResp {
	s.LargeFirstCoverImageUrl = &v
	return s
}

func (s *SceneProductInfoResp) SetSpecConfigList(v []*ProductSpecConfig) *SceneProductInfoResp {
	s.SpecConfigList = v
	return s
}

func (s *SceneProductInfoResp) SetRentalPlan(v []*string) *SceneProductInfoResp {
	s.RentalPlan = v
	return s
}

func (s *SceneProductInfoResp) SetRentalPeriod(v []*int64) *SceneProductInfoResp {
	s.RentalPeriod = v
	return s
}

func (s *SceneProductInfoResp) SetSupportRenew(v bool) *SceneProductInfoResp {
	s.SupportRenew = &v
	return s
}

func (s *SceneProductInfoResp) SetSupportBuyout(v bool) *SceneProductInfoResp {
	s.SupportBuyout = &v
	return s
}

func (s *SceneProductInfoResp) SetLowestDailyRentMoney(v int64) *SceneProductInfoResp {
	s.LowestDailyRentMoney = &v
	return s
}

func (s *SceneProductInfoResp) SetLowestDailyRentMoneyYuan(v string) *SceneProductInfoResp {
	s.LowestDailyRentMoneyYuan = &v
	return s
}

func (s *SceneProductInfoResp) SetHighestDailyRentMoney(v int64) *SceneProductInfoResp {
	s.HighestDailyRentMoney = &v
	return s
}

func (s *SceneProductInfoResp) SetHighestDailyRentMoneyYuan(v string) *SceneProductInfoResp {
	s.HighestDailyRentMoneyYuan = &v
	return s
}

func (s *SceneProductInfoResp) SetAddedFlag(v bool) *SceneProductInfoResp {
	s.AddedFlag = &v
	return s
}

func (s *SceneProductInfoResp) SetSignProductMerchantList(v []*SignProductMerchant) *SceneProductInfoResp {
	s.SignProductMerchantList = v
	return s
}

func (s *SceneProductInfoResp) SetSignProductMerchantCount(v int64) *SceneProductInfoResp {
	s.SignProductMerchantCount = &v
	return s
}

func (s *SceneProductInfoResp) SetApplyProductMerchantList(v []*SignProductMerchant) *SceneProductInfoResp {
	s.ApplyProductMerchantList = v
	return s
}

func (s *SceneProductInfoResp) SetApplyProductMerchantCount(v int64) *SceneProductInfoResp {
	s.ApplyProductMerchantCount = &v
	return s
}

func (s *SceneProductInfoResp) SetDisplayStatus(v string) *SceneProductInfoResp {
	s.DisplayStatus = &v
	return s
}

func (s *SceneProductInfoResp) SetDeliveryMode(v string) *SceneProductInfoResp {
	s.DeliveryMode = &v
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
	// 证件是否长期有效
	// true：长期，false：非长期
	// payChannel =JDPAY必填
	BusinessLicenseCertExpireFlag *bool `json:"business_license_cert_expire_flag,omitempty" xml:"business_license_cert_expire_flag,omitempty"`
	// 证件有效期开始日期(payChannel =JDPAY)
	// 1.certExpireFlag=false时必填，时间格式:yyyy-MM-dd
	// 2. 商户为企业个体户时，无论certExpireFlag是否长期，该字段均必填
	BusinessLicenseCertEffectDate *string `json:"business_license_cert_effect_date,omitempty" xml:"business_license_cert_effect_date,omitempty"`
	// 证件有效期结束日期（payChannel =JDPAY选填参数）
	// certExpireFlag为false必填，时间格式：yyyy-MM-dd
	BusinessLicenseCertExpireDate *string `json:"business_license_cert_expire_date,omitempty" xml:"business_license_cert_expire_date,omitempty"`
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
	CompanyMobile *string `json:"company_mobile,omitempty" xml:"company_mobile,omitempty"`
	// 公司联系地址
	CompanyAddress *string `json:"company_address,omitempty" xml:"company_address,omitempty"`
	// 联系人姓名
	ContactName *string `json:"contact_name,omitempty" xml:"contact_name,omitempty" require:"true"`
	// 联系人手机号码
	ContactMobile *string `json:"contact_mobile,omitempty" xml:"contact_mobile,omitempty" require:"true"`
	// 联系地址-省份code(payChannel =JDPAY必填)
	ContactAddressProvinceCode *string `json:"contact_address_province_code,omitempty" xml:"contact_address_province_code,omitempty"`
	// 联系地址-省份名称（payChannel =JDPAY必填）
	ContactAddressProvinceName *string `json:"contact_address_province_name,omitempty" xml:"contact_address_province_name,omitempty"`
	// 联系地址-市code（payChannel =JDPAY必填）
	//
	ContactAddressCityCode *string `json:"contact_address_city_code,omitempty" xml:"contact_address_city_code,omitempty"`
	// 联系人地址-市名称（payChannel =JDPAY必填）
	ContactAddressCityName *string `json:"contact_address_city_name,omitempty" xml:"contact_address_city_name,omitempty"`
	// 联系人详细地址（payChannel =JDPAY必填）
	ContactAddressDetail *string `json:"contact_address_detail,omitempty" xml:"contact_address_detail,omitempty"`
	// 联系人邮箱（pay_channel=JDPAY必填）
	ContactEmail *string `json:"contact_email,omitempty" xml:"contact_email,omitempty"`
	// 绑定企业支付宝账号（pay_channel=ALIPAY必填）
	BindAlipayNo *string `json:"bind_alipay_no,omitempty" xml:"bind_alipay_no,omitempty"`
	// 结算企业支付宝账号（pay_channel=ALIPAY必填）
	SettleAlipayNo *string `json:"settle_alipay_no,omitempty" xml:"settle_alipay_no,omitempty"`
	// 绑定支付宝uid（pay_channel=ALIPAY必填）
	BindAlipayUid *string `json:"bind_alipay_uid,omitempty" xml:"bind_alipay_uid,omitempty"`
	// 经营范围
	// payChannel =JDPAY必填
	BusinessScope *string `json:"business_scope,omitempty" xml:"business_scope,omitempty"`
	// 开户许可证（payChannel =JDPAY必填）
	//
	BankOpeningLicenseFile *FileInfo `json:"bank_opening_license_file,omitempty" xml:"bank_opening_license_file,omitempty"`
	// 商户和租赁平台合作协议图片（pay_channel=JDPAY必填）
	//
	CooperationAgreementFile *FileInfo `json:"cooperation_agreement_file,omitempty" xml:"cooperation_agreement_file,omitempty"`
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

func (s *CompanyInfo) SetBusinessLicenseCertExpireFlag(v bool) *CompanyInfo {
	s.BusinessLicenseCertExpireFlag = &v
	return s
}

func (s *CompanyInfo) SetBusinessLicenseCertEffectDate(v string) *CompanyInfo {
	s.BusinessLicenseCertEffectDate = &v
	return s
}

func (s *CompanyInfo) SetBusinessLicenseCertExpireDate(v string) *CompanyInfo {
	s.BusinessLicenseCertExpireDate = &v
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

func (s *CompanyInfo) SetContactAddressProvinceCode(v string) *CompanyInfo {
	s.ContactAddressProvinceCode = &v
	return s
}

func (s *CompanyInfo) SetContactAddressProvinceName(v string) *CompanyInfo {
	s.ContactAddressProvinceName = &v
	return s
}

func (s *CompanyInfo) SetContactAddressCityCode(v string) *CompanyInfo {
	s.ContactAddressCityCode = &v
	return s
}

func (s *CompanyInfo) SetContactAddressCityName(v string) *CompanyInfo {
	s.ContactAddressCityName = &v
	return s
}

func (s *CompanyInfo) SetContactAddressDetail(v string) *CompanyInfo {
	s.ContactAddressDetail = &v
	return s
}

func (s *CompanyInfo) SetContactEmail(v string) *CompanyInfo {
	s.ContactEmail = &v
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

func (s *CompanyInfo) SetBusinessScope(v string) *CompanyInfo {
	s.BusinessScope = &v
	return s
}

func (s *CompanyInfo) SetBankOpeningLicenseFile(v *FileInfo) *CompanyInfo {
	s.BankOpeningLicenseFile = v
	return s
}

func (s *CompanyInfo) SetCooperationAgreementFile(v *FileInfo) *CompanyInfo {
	s.CooperationAgreementFile = v
	return s
}

// 商户进件记录分页对象
type MerchantExpandSummaryPage struct {
	// 进件id
	PayExpandId *string `json:"pay_expand_id,omitempty" xml:"pay_expand_id,omitempty" require:"true"`
	// 支付渠道
	// JDPAY
	// ALIPAY
	PayChannel *string `json:"pay_channel,omitempty" xml:"pay_channel,omitempty" require:"true"`
	// 进件审核状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 创建时间
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty" require:"true"`
	// 最后修改时间
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty" require:"true"`
}

func (s MerchantExpandSummaryPage) String() string {
	return tea.Prettify(s)
}

func (s MerchantExpandSummaryPage) GoString() string {
	return s.String()
}

func (s *MerchantExpandSummaryPage) SetPayExpandId(v string) *MerchantExpandSummaryPage {
	s.PayExpandId = &v
	return s
}

func (s *MerchantExpandSummaryPage) SetPayChannel(v string) *MerchantExpandSummaryPage {
	s.PayChannel = &v
	return s
}

func (s *MerchantExpandSummaryPage) SetStatus(v string) *MerchantExpandSummaryPage {
	s.Status = &v
	return s
}

func (s *MerchantExpandSummaryPage) SetCreateTime(v string) *MerchantExpandSummaryPage {
	s.CreateTime = &v
	return s
}

func (s *MerchantExpandSummaryPage) SetUpdateTime(v string) *MerchantExpandSummaryPage {
	s.UpdateTime = &v
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

// 签署链接结果
type SignUrlResult struct {
	// 签署（长）链接
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 签署短链接
	ShortUrl *string `json:"short_url,omitempty" xml:"short_url,omitempty"`
	// 签署链接提示信息
	SignMsg *string `json:"sign_msg,omitempty" xml:"sign_msg,omitempty"`
}

func (s SignUrlResult) String() string {
	return tea.Prettify(s)
}

func (s SignUrlResult) GoString() string {
	return s.String()
}

func (s *SignUrlResult) SetUrl(v string) *SignUrlResult {
	s.Url = &v
	return s
}

func (s *SignUrlResult) SetShortUrl(v string) *SignUrlResult {
	s.ShortUrl = &v
	return s
}

func (s *SignUrlResult) SetSignMsg(v string) *SignUrlResult {
	s.SignMsg = &v
	return s
}

// 数据下载信息
type DataDownloadInfo struct {
	// 商户社会统一信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// 流水号
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	//  状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// TRADE_PROMISE_BILL: 交易履约账单
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 筛选开始时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 筛选结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 任务创建时间
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 下载结果
	ResultInfo *string `json:"result_info,omitempty" xml:"result_info,omitempty"`
	// 融资类型
	FundMode *string `json:"fund_mode,omitempty" xml:"fund_mode,omitempty"`
	// 放款渠道
	LoanChannel *string `json:"loan_channel,omitempty" xml:"loan_channel,omitempty"`
	// 资方社会统一信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty"`
	// 公司名称
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty"`
	// 资方公司名称
	FundName *string `json:"fund_name,omitempty" xml:"fund_name,omitempty"`
}

func (s DataDownloadInfo) String() string {
	return tea.Prettify(s)
}

func (s DataDownloadInfo) GoString() string {
	return s.String()
}

func (s *DataDownloadInfo) SetMerchantId(v string) *DataDownloadInfo {
	s.MerchantId = &v
	return s
}

func (s *DataDownloadInfo) SetBizNo(v string) *DataDownloadInfo {
	s.BizNo = &v
	return s
}

func (s *DataDownloadInfo) SetStatus(v string) *DataDownloadInfo {
	s.Status = &v
	return s
}

func (s *DataDownloadInfo) SetType(v string) *DataDownloadInfo {
	s.Type = &v
	return s
}

func (s *DataDownloadInfo) SetStartTime(v string) *DataDownloadInfo {
	s.StartTime = &v
	return s
}

func (s *DataDownloadInfo) SetEndTime(v string) *DataDownloadInfo {
	s.EndTime = &v
	return s
}

func (s *DataDownloadInfo) SetCreateTime(v string) *DataDownloadInfo {
	s.CreateTime = &v
	return s
}

func (s *DataDownloadInfo) SetResultInfo(v string) *DataDownloadInfo {
	s.ResultInfo = &v
	return s
}

func (s *DataDownloadInfo) SetFundMode(v string) *DataDownloadInfo {
	s.FundMode = &v
	return s
}

func (s *DataDownloadInfo) SetLoanChannel(v string) *DataDownloadInfo {
	s.LoanChannel = &v
	return s
}

func (s *DataDownloadInfo) SetFundId(v string) *DataDownloadInfo {
	s.FundId = &v
	return s
}

func (s *DataDownloadInfo) SetMerchantName(v string) *DataDownloadInfo {
	s.MerchantName = &v
	return s
}

func (s *DataDownloadInfo) SetFundName(v string) *DataDownloadInfo {
	s.FundName = &v
	return s
}

// 客诉处理人员信息
type CustomerPersonInfo struct {
	// 客诉处理员支付宝账号
	AlipayLogonId *string `json:"alipay_logon_id,omitempty" xml:"alipay_logon_id,omitempty" require:"true"`
	// 客诉处理员支付宝绑定手机号
	AlipayBindMobile *string `json:"alipay_bind_mobile,omitempty" xml:"alipay_bind_mobile,omitempty" require:"true"`
	// 客服人员名称
	CustomerServiceName *string `json:"customer_service_name,omitempty" xml:"customer_service_name,omitempty" require:"true"`
}

func (s CustomerPersonInfo) String() string {
	return tea.Prettify(s)
}

func (s CustomerPersonInfo) GoString() string {
	return s.String()
}

func (s *CustomerPersonInfo) SetAlipayLogonId(v string) *CustomerPersonInfo {
	s.AlipayLogonId = &v
	return s
}

func (s *CustomerPersonInfo) SetAlipayBindMobile(v string) *CustomerPersonInfo {
	s.AlipayBindMobile = &v
	return s
}

func (s *CustomerPersonInfo) SetCustomerServiceName(v string) *CustomerPersonInfo {
	s.CustomerServiceName = &v
	return s
}

// 随时享-服务商平台适用商家选择配置信息
type ApplySceneProductMerchantInfo struct {
	// 商户商品spuId
	MerchantProductId *string `json:"merchant_product_id,omitempty" xml:"merchant_product_id,omitempty"`
	// 商户品牌
	MerchantBrand *string `json:"merchant_brand,omitempty" xml:"merchant_brand,omitempty"`
	// logo
	MerchantLogo *string `json:"merchant_logo,omitempty" xml:"merchant_logo,omitempty"`
	// logo
	LargeMerchantLogo *string `json:"large_merchant_logo,omitempty" xml:"large_merchant_logo,omitempty"`
	// 是否置灰
	Grayed *bool `json:"grayed,omitempty" xml:"grayed,omitempty"`
	// 是否勾选
	Choosed *bool `json:"choosed,omitempty" xml:"choosed,omitempty"`
}

func (s ApplySceneProductMerchantInfo) String() string {
	return tea.Prettify(s)
}

func (s ApplySceneProductMerchantInfo) GoString() string {
	return s.String()
}

func (s *ApplySceneProductMerchantInfo) SetMerchantProductId(v string) *ApplySceneProductMerchantInfo {
	s.MerchantProductId = &v
	return s
}

func (s *ApplySceneProductMerchantInfo) SetMerchantBrand(v string) *ApplySceneProductMerchantInfo {
	s.MerchantBrand = &v
	return s
}

func (s *ApplySceneProductMerchantInfo) SetMerchantLogo(v string) *ApplySceneProductMerchantInfo {
	s.MerchantLogo = &v
	return s
}

func (s *ApplySceneProductMerchantInfo) SetLargeMerchantLogo(v string) *ApplySceneProductMerchantInfo {
	s.LargeMerchantLogo = &v
	return s
}

func (s *ApplySceneProductMerchantInfo) SetGrayed(v bool) *ApplySceneProductMerchantInfo {
	s.Grayed = &v
	return s
}

func (s *ApplySceneProductMerchantInfo) SetChoosed(v bool) *ApplySceneProductMerchantInfo {
	s.Choosed = &v
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
	// 站点信息
	SiteInfo []*SiteInfo `json:"site_info,omitempty" xml:"site_info,omitempty" type:"Repeated"`
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

func (s *ApplicationInfoUpdate) SetSiteInfo(v []*SiteInfo) *ApplicationInfoUpdate {
	s.SiteInfo = v
	return s
}

// 资产包资金方案内容
type AssetPackageFinancePlan struct {
	// 版本号，从1开始
	Version *int64 `json:"version,omitempty" xml:"version,omitempty"`
	// 状态，ENABLE：启用，不启用时默认null
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 放款比例
	// 0~100，保留小数2位
	LoanRate *string `json:"loan_rate,omitempty" xml:"loan_rate,omitempty"`
	// 放款金额，单位分
	LoanMoney *int64 `json:"loan_money,omitempty" xml:"loan_money,omitempty"`
	// 放款金额，单位元
	LoanMoneyYuan *string `json:"loan_money_yuan,omitempty" xml:"loan_money_yuan,omitempty"`
	// 计息方式，枚举：
	// ● 年化利率：APR
	// ● 固定金额：FIXED_AMOUNT
	// ● 固定比例：FIXED_RATE
	InterestAccrualMethod *string `json:"interest_accrual_method,omitempty" xml:"interest_accrual_method,omitempty"`
	// 年计息天数
	DayCountConvention *int64 `json:"day_count_convention,omitempty" xml:"day_count_convention,omitempty"`
	// 息费率
	AllinFinancingCostRate *string `json:"allin_financing_cost_rate,omitempty" xml:"allin_financing_cost_rate,omitempty"`
	// 还款方式，枚举：
	// ● 等额本息：EQUAL_INSTALLMENT_METHOD
	RepaymentMethod *string `json:"repayment_method,omitempty" xml:"repayment_method,omitempty"`
	// 还款频率，枚举：
	// ● 按月：MONTH
	RepaymentFrequency *string `json:"repayment_frequency,omitempty" xml:"repayment_frequency,omitempty"`
	// 融资期数，范围0~36
	FinanceNum *int64 `json:"finance_num,omitempty" xml:"finance_num,omitempty"`
	// 计划还款日期，范围1～28
	PayDay *int64 `json:"pay_day,omitempty" xml:"pay_day,omitempty"`
	// 触发商家代偿时间，单位天
	MerchantCompensationDay *int64 `json:"merchant_compensation_day,omitempty" xml:"merchant_compensation_day,omitempty"`
	// 订单未还款总金额，单位分
	UnreleasedAmount *int64 `json:"unreleased_amount,omitempty" xml:"unreleased_amount,omitempty"`
}

func (s AssetPackageFinancePlan) String() string {
	return tea.Prettify(s)
}

func (s AssetPackageFinancePlan) GoString() string {
	return s.String()
}

func (s *AssetPackageFinancePlan) SetVersion(v int64) *AssetPackageFinancePlan {
	s.Version = &v
	return s
}

func (s *AssetPackageFinancePlan) SetStatus(v string) *AssetPackageFinancePlan {
	s.Status = &v
	return s
}

func (s *AssetPackageFinancePlan) SetLoanRate(v string) *AssetPackageFinancePlan {
	s.LoanRate = &v
	return s
}

func (s *AssetPackageFinancePlan) SetLoanMoney(v int64) *AssetPackageFinancePlan {
	s.LoanMoney = &v
	return s
}

func (s *AssetPackageFinancePlan) SetLoanMoneyYuan(v string) *AssetPackageFinancePlan {
	s.LoanMoneyYuan = &v
	return s
}

func (s *AssetPackageFinancePlan) SetInterestAccrualMethod(v string) *AssetPackageFinancePlan {
	s.InterestAccrualMethod = &v
	return s
}

func (s *AssetPackageFinancePlan) SetDayCountConvention(v int64) *AssetPackageFinancePlan {
	s.DayCountConvention = &v
	return s
}

func (s *AssetPackageFinancePlan) SetAllinFinancingCostRate(v string) *AssetPackageFinancePlan {
	s.AllinFinancingCostRate = &v
	return s
}

func (s *AssetPackageFinancePlan) SetRepaymentMethod(v string) *AssetPackageFinancePlan {
	s.RepaymentMethod = &v
	return s
}

func (s *AssetPackageFinancePlan) SetRepaymentFrequency(v string) *AssetPackageFinancePlan {
	s.RepaymentFrequency = &v
	return s
}

func (s *AssetPackageFinancePlan) SetFinanceNum(v int64) *AssetPackageFinancePlan {
	s.FinanceNum = &v
	return s
}

func (s *AssetPackageFinancePlan) SetPayDay(v int64) *AssetPackageFinancePlan {
	s.PayDay = &v
	return s
}

func (s *AssetPackageFinancePlan) SetMerchantCompensationDay(v int64) *AssetPackageFinancePlan {
	s.MerchantCompensationDay = &v
	return s
}

func (s *AssetPackageFinancePlan) SetUnreleasedAmount(v int64) *AssetPackageFinancePlan {
	s.UnreleasedAmount = &v
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

// 随时享-平台商品信息
type PlatformProductInfoResp struct {
	// 申请单状态
	ApplyStatus *string `json:"apply_status,omitempty" xml:"apply_status,omitempty"`
	// 审核原因
	RefuseReason *string `json:"refuse_reason,omitempty" xml:"refuse_reason,omitempty"`
	// 平台商品id
	PlatformProductId *string `json:"platform_product_id,omitempty" xml:"platform_product_id,omitempty"`
	// 商家商品id
	MerchantProductId *string `json:"merchant_product_id,omitempty" xml:"merchant_product_id,omitempty"`
	// 商品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty"`
	// 封面首图url链接
	FirstCoverImageUrl *string `json:"first_cover_image_url,omitempty" xml:"first_cover_image_url,omitempty"`
	// 封面首图url链接
	LargeFirstCoverImageUrl *string `json:"large_first_cover_image_url,omitempty" xml:"large_first_cover_image_url,omitempty"`
	// 商品上架状态
	DisplayStatus *string `json:"display_status,omitempty" xml:"display_status,omitempty"`
	// 产品规格列表
	SpecConfigList []*ProductSpecConfig `json:"spec_config_list,omitempty" xml:"spec_config_list,omitempty" type:"Repeated"`
	// 租赁方案
	RentalPlan []*string `json:"rental_plan,omitempty" xml:"rental_plan,omitempty" type:"Repeated"`
	// 租赁周期
	RentalPeriod []*int64 `json:"rental_period,omitempty" xml:"rental_period,omitempty" type:"Repeated"`
	// 可续租
	SupportRenew *bool `json:"support_renew,omitempty" xml:"support_renew,omitempty"`
	// 可买断
	SupportBuyout *bool `json:"support_buyout,omitempty" xml:"support_buyout,omitempty"`
	// 最低日租金(单位分)
	LowestDailyRentMoney *int64 `json:"lowest_daily_rent_money,omitempty" xml:"lowest_daily_rent_money,omitempty"`
	// 最低日租金(单位元)
	LowestDailyRentMoneyYuan *string `json:"lowest_daily_rent_money_yuan,omitempty" xml:"lowest_daily_rent_money_yuan,omitempty"`
	// 最高日租金(单位分)
	HighestDailyRentMoney *int64 `json:"highest_daily_rent_money,omitempty" xml:"highest_daily_rent_money,omitempty"`
	// 最高日租金(单位元)
	HighestDailyRentMoneyYuan *string `json:"highest_daily_rent_money_yuan,omitempty" xml:"highest_daily_rent_money_yuan,omitempty"`
}

func (s PlatformProductInfoResp) String() string {
	return tea.Prettify(s)
}

func (s PlatformProductInfoResp) GoString() string {
	return s.String()
}

func (s *PlatformProductInfoResp) SetApplyStatus(v string) *PlatformProductInfoResp {
	s.ApplyStatus = &v
	return s
}

func (s *PlatformProductInfoResp) SetRefuseReason(v string) *PlatformProductInfoResp {
	s.RefuseReason = &v
	return s
}

func (s *PlatformProductInfoResp) SetPlatformProductId(v string) *PlatformProductInfoResp {
	s.PlatformProductId = &v
	return s
}

func (s *PlatformProductInfoResp) SetMerchantProductId(v string) *PlatformProductInfoResp {
	s.MerchantProductId = &v
	return s
}

func (s *PlatformProductInfoResp) SetProductName(v string) *PlatformProductInfoResp {
	s.ProductName = &v
	return s
}

func (s *PlatformProductInfoResp) SetFirstCoverImageUrl(v string) *PlatformProductInfoResp {
	s.FirstCoverImageUrl = &v
	return s
}

func (s *PlatformProductInfoResp) SetLargeFirstCoverImageUrl(v string) *PlatformProductInfoResp {
	s.LargeFirstCoverImageUrl = &v
	return s
}

func (s *PlatformProductInfoResp) SetDisplayStatus(v string) *PlatformProductInfoResp {
	s.DisplayStatus = &v
	return s
}

func (s *PlatformProductInfoResp) SetSpecConfigList(v []*ProductSpecConfig) *PlatformProductInfoResp {
	s.SpecConfigList = v
	return s
}

func (s *PlatformProductInfoResp) SetRentalPlan(v []*string) *PlatformProductInfoResp {
	s.RentalPlan = v
	return s
}

func (s *PlatformProductInfoResp) SetRentalPeriod(v []*int64) *PlatformProductInfoResp {
	s.RentalPeriod = v
	return s
}

func (s *PlatformProductInfoResp) SetSupportRenew(v bool) *PlatformProductInfoResp {
	s.SupportRenew = &v
	return s
}

func (s *PlatformProductInfoResp) SetSupportBuyout(v bool) *PlatformProductInfoResp {
	s.SupportBuyout = &v
	return s
}

func (s *PlatformProductInfoResp) SetLowestDailyRentMoney(v int64) *PlatformProductInfoResp {
	s.LowestDailyRentMoney = &v
	return s
}

func (s *PlatformProductInfoResp) SetLowestDailyRentMoneyYuan(v string) *PlatformProductInfoResp {
	s.LowestDailyRentMoneyYuan = &v
	return s
}

func (s *PlatformProductInfoResp) SetHighestDailyRentMoney(v int64) *PlatformProductInfoResp {
	s.HighestDailyRentMoney = &v
	return s
}

func (s *PlatformProductInfoResp) SetHighestDailyRentMoneyYuan(v string) *PlatformProductInfoResp {
	s.HighestDailyRentMoneyYuan = &v
	return s
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

// 用户线索根据-平台订单、派发和备注返回结果信息
type PlatformOrderLeadResultInfo struct {
	// 场景名称
	SceneName *string `json:"scene_name,omitempty" xml:"scene_name,omitempty"`
	// 平台订单号
	PlatformOrderId *string `json:"platform_order_id,omitempty" xml:"platform_order_id,omitempty"`
	// 平台订单派发id
	DeliveryId *string `json:"delivery_id,omitempty" xml:"delivery_id,omitempty"`
	// 商品名称
	ProductTitle *string `json:"product_title,omitempty" xml:"product_title,omitempty"`
	// 订单提交时间
	OrderCreateTime *string `json:"order_create_time,omitempty" xml:"order_create_time,omitempty"`
	// 用户姓名（脱敏）
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
	// 用户手机号（脱敏）
	UserPhone *string `json:"user_phone,omitempty" xml:"user_phone,omitempty"`
	// 商家品牌名称
	MerchantBrandName *string `json:"merchant_brand_name,omitempty" xml:"merchant_brand_name,omitempty"`
	// 商家品牌logoUrl
	MerchantBrandLogoUrl *string `json:"merchant_brand_logo_url,omitempty" xml:"merchant_brand_logo_url,omitempty"`
	// 审核状态
	ApprovalStatus *string `json:"approval_status,omitempty" xml:"approval_status,omitempty"`
	// 备注
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
}

func (s PlatformOrderLeadResultInfo) String() string {
	return tea.Prettify(s)
}

func (s PlatformOrderLeadResultInfo) GoString() string {
	return s.String()
}

func (s *PlatformOrderLeadResultInfo) SetSceneName(v string) *PlatformOrderLeadResultInfo {
	s.SceneName = &v
	return s
}

func (s *PlatformOrderLeadResultInfo) SetPlatformOrderId(v string) *PlatformOrderLeadResultInfo {
	s.PlatformOrderId = &v
	return s
}

func (s *PlatformOrderLeadResultInfo) SetDeliveryId(v string) *PlatformOrderLeadResultInfo {
	s.DeliveryId = &v
	return s
}

func (s *PlatformOrderLeadResultInfo) SetProductTitle(v string) *PlatformOrderLeadResultInfo {
	s.ProductTitle = &v
	return s
}

func (s *PlatformOrderLeadResultInfo) SetOrderCreateTime(v string) *PlatformOrderLeadResultInfo {
	s.OrderCreateTime = &v
	return s
}

func (s *PlatformOrderLeadResultInfo) SetUserName(v string) *PlatformOrderLeadResultInfo {
	s.UserName = &v
	return s
}

func (s *PlatformOrderLeadResultInfo) SetUserPhone(v string) *PlatformOrderLeadResultInfo {
	s.UserPhone = &v
	return s
}

func (s *PlatformOrderLeadResultInfo) SetMerchantBrandName(v string) *PlatformOrderLeadResultInfo {
	s.MerchantBrandName = &v
	return s
}

func (s *PlatformOrderLeadResultInfo) SetMerchantBrandLogoUrl(v string) *PlatformOrderLeadResultInfo {
	s.MerchantBrandLogoUrl = &v
	return s
}

func (s *PlatformOrderLeadResultInfo) SetApprovalStatus(v string) *PlatformOrderLeadResultInfo {
	s.ApprovalStatus = &v
	return s
}

func (s *PlatformOrderLeadResultInfo) SetRemark(v string) *PlatformOrderLeadResultInfo {
	s.Remark = &v
	return s
}

// 批量放款结果数据
type BatchLoanResultData struct {
	// 流水号
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// FUND_BATCH_LOAN: 批量放款
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 任务创建时间
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	//  同意放款数据
	AgreeLoanCount *int64 `json:"agree_loan_count,omitempty" xml:"agree_loan_count,omitempty"`
	// 拒绝放款数量
	RejectLoanCount *int64 `json:"reject_loan_count,omitempty" xml:"reject_loan_count,omitempty"`
	// 放款失败数量
	LoanFailCount *int64 `json:"loan_fail_count,omitempty" xml:"loan_fail_count,omitempty"`
	// 放款失败结果文件
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty"`
}

func (s BatchLoanResultData) String() string {
	return tea.Prettify(s)
}

func (s BatchLoanResultData) GoString() string {
	return s.String()
}

func (s *BatchLoanResultData) SetBizNo(v string) *BatchLoanResultData {
	s.BizNo = &v
	return s
}

func (s *BatchLoanResultData) SetStatus(v string) *BatchLoanResultData {
	s.Status = &v
	return s
}

func (s *BatchLoanResultData) SetType(v string) *BatchLoanResultData {
	s.Type = &v
	return s
}

func (s *BatchLoanResultData) SetCreateTime(v string) *BatchLoanResultData {
	s.CreateTime = &v
	return s
}

func (s *BatchLoanResultData) SetAgreeLoanCount(v int64) *BatchLoanResultData {
	s.AgreeLoanCount = &v
	return s
}

func (s *BatchLoanResultData) SetRejectLoanCount(v int64) *BatchLoanResultData {
	s.RejectLoanCount = &v
	return s
}

func (s *BatchLoanResultData) SetLoanFailCount(v int64) *BatchLoanResultData {
	s.LoanFailCount = &v
	return s
}

func (s *BatchLoanResultData) SetFileUrl(v string) *BatchLoanResultData {
	s.FileUrl = &v
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

// 文本域（组件）
type TemplateTextAreaComponent struct {
	// 模板编码
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 模版版本号
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
	MultiName *string `json:"multi_name,omitempty" xml:"multi_name,omitempty" require:"true"`
	// 前端传入的文本域映射字段
	PreElementCode *string `json:"pre_element_code,omitempty" xml:"pre_element_code,omitempty" require:"true"`
}

func (s TemplateTextAreaComponent) String() string {
	return tea.Prettify(s)
}

func (s TemplateTextAreaComponent) GoString() string {
	return s.String()
}

func (s *TemplateTextAreaComponent) SetTemplateCode(v string) *TemplateTextAreaComponent {
	s.TemplateCode = &v
	return s
}

func (s *TemplateTextAreaComponent) SetTemplateVersion(v string) *TemplateTextAreaComponent {
	s.TemplateVersion = &v
	return s
}

func (s *TemplateTextAreaComponent) SetComponentType(v string) *TemplateTextAreaComponent {
	s.ComponentType = &v
	return s
}

func (s *TemplateTextAreaComponent) SetComponentName(v string) *TemplateTextAreaComponent {
	s.ComponentName = &v
	return s
}

func (s *TemplateTextAreaComponent) SetRequired(v bool) *TemplateTextAreaComponent {
	s.Required = &v
	return s
}

func (s *TemplateTextAreaComponent) SetLine(v int64) *TemplateTextAreaComponent {
	s.Line = &v
	return s
}

func (s *TemplateTextAreaComponent) SetMultiName(v string) *TemplateTextAreaComponent {
	s.MultiName = &v
	return s
}

func (s *TemplateTextAreaComponent) SetPreElementCode(v string) *TemplateTextAreaComponent {
	s.PreElementCode = &v
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

// 订单商品信息
type GoodsInfo struct {
}

func (s GoodsInfo) String() string {
	return tea.Prettify(s)
}

func (s GoodsInfo) GoString() string {
	return s.String()
}

// (异步)解约申请信息对象
type AgreementTerminateApplyInfo struct {
	// 订单ID
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 解约申请号
	TerminateApplyId *string `json:"terminate_apply_id,omitempty" xml:"terminate_apply_id,omitempty"`
	// 订单创建时间
	OrderGmtCreate *string `json:"order_gmt_create,omitempty" xml:"order_gmt_create,omitempty"`
	// 解约申请时间
	GmtTerminateApply *string `json:"gmt_terminate_apply,omitempty" xml:"gmt_terminate_apply,omitempty"`
	// 处理状态
	HandleStatus *string `json:"handle_status,omitempty" xml:"handle_status,omitempty"`
	// 商家处理超时时长
	MerchantHandleDuration *string `json:"merchant_handle_duration,omitempty" xml:"merchant_handle_duration,omitempty"`
	// 商家处理超时时长
	MerchantHandleDurationType *string `json:"merchant_handle_duration_type,omitempty" xml:"merchant_handle_duration_type,omitempty"`
}

func (s AgreementTerminateApplyInfo) String() string {
	return tea.Prettify(s)
}

func (s AgreementTerminateApplyInfo) GoString() string {
	return s.String()
}

func (s *AgreementTerminateApplyInfo) SetOrderId(v string) *AgreementTerminateApplyInfo {
	s.OrderId = &v
	return s
}

func (s *AgreementTerminateApplyInfo) SetTerminateApplyId(v string) *AgreementTerminateApplyInfo {
	s.TerminateApplyId = &v
	return s
}

func (s *AgreementTerminateApplyInfo) SetOrderGmtCreate(v string) *AgreementTerminateApplyInfo {
	s.OrderGmtCreate = &v
	return s
}

func (s *AgreementTerminateApplyInfo) SetGmtTerminateApply(v string) *AgreementTerminateApplyInfo {
	s.GmtTerminateApply = &v
	return s
}

func (s *AgreementTerminateApplyInfo) SetHandleStatus(v string) *AgreementTerminateApplyInfo {
	s.HandleStatus = &v
	return s
}

func (s *AgreementTerminateApplyInfo) SetMerchantHandleDuration(v string) *AgreementTerminateApplyInfo {
	s.MerchantHandleDuration = &v
	return s
}

func (s *AgreementTerminateApplyInfo) SetMerchantHandleDurationType(v string) *AgreementTerminateApplyInfo {
	s.MerchantHandleDurationType = &v
	return s
}

// 法人信息
type LegalInfo struct {
	// 法人名称
	LegalName *string `json:"legal_name,omitempty" xml:"legal_name,omitempty" require:"true"`
	// 法人证件号
	LegalCertNo *string `json:"legal_cert_no,omitempty" xml:"legal_cert_no,omitempty" require:"true"`
	// 法人证件正面（人像面）
	LegalCertFrontFile *FileInfo `json:"legal_cert_front_file,omitempty" xml:"legal_cert_front_file,omitempty" require:"true"`
	// 法人证件反面
	LegalCertBackFile *FileInfo `json:"legal_cert_back_file,omitempty" xml:"legal_cert_back_file,omitempty" require:"true"`
	// 法人证件是否长期有效（payChannel =JDPAY必填）
	// true：长期，false：非长期
	//
	LegalCertExpireFlag *bool `json:"legal_cert_expire_flag,omitempty" xml:"legal_cert_expire_flag,omitempty"`
	// 法人手机号（payChannel =JDPAY必填）
	LegalMobile *string `json:"legal_mobile,omitempty" xml:"legal_mobile,omitempty"`
	// 证件有效期开始日期（payChannel =JDPAY必填）
	// legalCertExpireFlag=false/true时都必填，时间格式:yyyy-MM-dd
	LegalEffectDate *string `json:"legal_effect_date,omitempty" xml:"legal_effect_date,omitempty"`
	// 证件有效期结束（payChannel =JDPAY选填）
	// legalCertExpireFlag=false时必填，时间格式:yyyy-MM-dd
	LegalExpireDate *string `json:"legal_expire_date,omitempty" xml:"legal_expire_date,omitempty"`
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

func (s *LegalInfo) SetLegalCertExpireFlag(v bool) *LegalInfo {
	s.LegalCertExpireFlag = &v
	return s
}

func (s *LegalInfo) SetLegalMobile(v string) *LegalInfo {
	s.LegalMobile = &v
	return s
}

func (s *LegalInfo) SetLegalEffectDate(v string) *LegalInfo {
	s.LegalEffectDate = &v
	return s
}

func (s *LegalInfo) SetLegalExpireDate(v string) *LegalInfo {
	s.LegalExpireDate = &v
	return s
}

// 订单融资信息
type OrderFinanceInfo struct {
	// 放款金额
	TotalMoney *int64 `json:"total_money,omitempty" xml:"total_money,omitempty"`
	// 放款状态
	ApplyStatus *string `json:"apply_status,omitempty" xml:"apply_status,omitempty"`
	// 融资申请时间(yyyy-MM-dd HH:mm:ss)
	LoanApplyDate *string `json:"loan_apply_date,omitempty" xml:"loan_apply_date,omitempty"`
	// 放款时间(yyyy-MM-dd HH:mm:ss)
	LoanTime *string `json:"loan_time,omitempty" xml:"loan_time,omitempty"`
	// 放款交易流水号
	LoanSerialNumber *string `json:"loan_serial_number,omitempty" xml:"loan_serial_number,omitempty"`
	// 资方分账户登录号
	FundDivideAlipayLogonId *string `json:"fund_divide_alipay_logon_id,omitempty" xml:"fund_divide_alipay_logon_id,omitempty"`
	// 资方分账户uid
	FundDivideAlipayUid *string `json:"fund_divide_alipay_uid,omitempty" xml:"fund_divide_alipay_uid,omitempty"`
	// 资方代扣户登录号
	FundWithholdAlipayLogonId *string `json:"fund_withhold_alipay_logon_id,omitempty" xml:"fund_withhold_alipay_logon_id,omitempty"`
	// 资方代扣户uid
	FundWithholdAlipayUid *string `json:"fund_withhold_alipay_uid,omitempty" xml:"fund_withhold_alipay_uid,omitempty"`
	// 手续费支付方
	FeePaidRole *string `json:"fee_paid_role,omitempty" xml:"fee_paid_role,omitempty"`
	// 放款渠道
	LoanChannel *string `json:"loan_channel,omitempty" xml:"loan_channel,omitempty"`
	// 放款账户
	LoanPayeeAccount *string `json:"loan_payee_account,omitempty" xml:"loan_payee_account,omitempty"`
	// 付款公司统一社会信用代码
	PaidCompanyId *string `json:"paid_company_id,omitempty" xml:"paid_company_id,omitempty"`
	// 银行名称
	BankName *string `json:"bank_name,omitempty" xml:"bank_name,omitempty"`
	// 融资状态
	FinanceStatus *string `json:"finance_status,omitempty" xml:"finance_status,omitempty"`
	// 收款项目列表
	PaymentItemList []*string `json:"payment_item_list,omitempty" xml:"payment_item_list,omitempty" type:"Repeated"`
	// 转账代偿收款类型
	TransferCompensateInAccountType *string `json:"transfer_compensate_in_account_type,omitempty" xml:"transfer_compensate_in_account_type,omitempty"`
}

func (s OrderFinanceInfo) String() string {
	return tea.Prettify(s)
}

func (s OrderFinanceInfo) GoString() string {
	return s.String()
}

func (s *OrderFinanceInfo) SetTotalMoney(v int64) *OrderFinanceInfo {
	s.TotalMoney = &v
	return s
}

func (s *OrderFinanceInfo) SetApplyStatus(v string) *OrderFinanceInfo {
	s.ApplyStatus = &v
	return s
}

func (s *OrderFinanceInfo) SetLoanApplyDate(v string) *OrderFinanceInfo {
	s.LoanApplyDate = &v
	return s
}

func (s *OrderFinanceInfo) SetLoanTime(v string) *OrderFinanceInfo {
	s.LoanTime = &v
	return s
}

func (s *OrderFinanceInfo) SetLoanSerialNumber(v string) *OrderFinanceInfo {
	s.LoanSerialNumber = &v
	return s
}

func (s *OrderFinanceInfo) SetFundDivideAlipayLogonId(v string) *OrderFinanceInfo {
	s.FundDivideAlipayLogonId = &v
	return s
}

func (s *OrderFinanceInfo) SetFundDivideAlipayUid(v string) *OrderFinanceInfo {
	s.FundDivideAlipayUid = &v
	return s
}

func (s *OrderFinanceInfo) SetFundWithholdAlipayLogonId(v string) *OrderFinanceInfo {
	s.FundWithholdAlipayLogonId = &v
	return s
}

func (s *OrderFinanceInfo) SetFundWithholdAlipayUid(v string) *OrderFinanceInfo {
	s.FundWithholdAlipayUid = &v
	return s
}

func (s *OrderFinanceInfo) SetFeePaidRole(v string) *OrderFinanceInfo {
	s.FeePaidRole = &v
	return s
}

func (s *OrderFinanceInfo) SetLoanChannel(v string) *OrderFinanceInfo {
	s.LoanChannel = &v
	return s
}

func (s *OrderFinanceInfo) SetLoanPayeeAccount(v string) *OrderFinanceInfo {
	s.LoanPayeeAccount = &v
	return s
}

func (s *OrderFinanceInfo) SetPaidCompanyId(v string) *OrderFinanceInfo {
	s.PaidCompanyId = &v
	return s
}

func (s *OrderFinanceInfo) SetBankName(v string) *OrderFinanceInfo {
	s.BankName = &v
	return s
}

func (s *OrderFinanceInfo) SetFinanceStatus(v string) *OrderFinanceInfo {
	s.FinanceStatus = &v
	return s
}

func (s *OrderFinanceInfo) SetPaymentItemList(v []*string) *OrderFinanceInfo {
	s.PaymentItemList = v
	return s
}

func (s *OrderFinanceInfo) SetTransferCompensateInAccountType(v string) *OrderFinanceInfo {
	s.TransferCompensateInAccountType = &v
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

// 订单代扣协议信息
type OrderWithholdContractInfo struct {
	// 支付宝外部代扣协议号
	WithholdingContractId *string `json:"withholding_contract_id,omitempty" xml:"withholding_contract_id,omitempty"`
	// 用户代扣协议状态
	ContractStatus *string `json:"contract_status,omitempty" xml:"contract_status,omitempty"`
}

func (s OrderWithholdContractInfo) String() string {
	return tea.Prettify(s)
}

func (s OrderWithholdContractInfo) GoString() string {
	return s.String()
}

func (s *OrderWithholdContractInfo) SetWithholdingContractId(v string) *OrderWithholdContractInfo {
	s.WithholdingContractId = &v
	return s
}

func (s *OrderWithholdContractInfo) SetContractStatus(v string) *OrderWithholdContractInfo {
	s.ContractStatus = &v
	return s
}

// 商户还款策略
type MerchantOrderRepayStrategy struct {
	// 分账期数(关联商户履约)
	TermIndex *int64 `json:"term_index,omitempty" xml:"term_index,omitempty"`
	// 还款期数(关联用户还款承诺)
	LeaseTermIndex *int64 `json:"lease_term_index,omitempty" xml:"lease_term_index,omitempty"`
	// 分账金额
	PayMoney *int64 `json:"pay_money,omitempty" xml:"pay_money,omitempty"`
	// 转代偿时间，yyyy-MM-dd
	ToCompensateDate *string `json:"to_compensate_date,omitempty" xml:"to_compensate_date,omitempty"`
	// 资方社会统一信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty"`
	// 资方公司名称
	FundCompanyName *string `json:"fund_company_name,omitempty" xml:"fund_company_name,omitempty"`
}

func (s MerchantOrderRepayStrategy) String() string {
	return tea.Prettify(s)
}

func (s MerchantOrderRepayStrategy) GoString() string {
	return s.String()
}

func (s *MerchantOrderRepayStrategy) SetTermIndex(v int64) *MerchantOrderRepayStrategy {
	s.TermIndex = &v
	return s
}

func (s *MerchantOrderRepayStrategy) SetLeaseTermIndex(v int64) *MerchantOrderRepayStrategy {
	s.LeaseTermIndex = &v
	return s
}

func (s *MerchantOrderRepayStrategy) SetPayMoney(v int64) *MerchantOrderRepayStrategy {
	s.PayMoney = &v
	return s
}

func (s *MerchantOrderRepayStrategy) SetToCompensateDate(v string) *MerchantOrderRepayStrategy {
	s.ToCompensateDate = &v
	return s
}

func (s *MerchantOrderRepayStrategy) SetFundId(v string) *MerchantOrderRepayStrategy {
	s.FundId = &v
	return s
}

func (s *MerchantOrderRepayStrategy) SetFundCompanyName(v string) *MerchantOrderRepayStrategy {
	s.FundCompanyName = &v
	return s
}

// 商户已进件支付渠道信息
type MerchantPayChannelInfo struct {
	// ALIPAY 支付宝
	// JDPAY京东支付
	PayChannel *string `json:"pay_channel,omitempty" xml:"pay_channel,omitempty" require:"true"`
	// 绑定企业支付宝账号
	BindAlipayNo *string `json:"bind_alipay_no,omitempty" xml:"bind_alipay_no,omitempty"`
	// 结算企业支付宝账号
	SettleAlipayNo *string `json:"settle_alipay_no,omitempty" xml:"settle_alipay_no,omitempty"`
	// 绑定支付宝uid
	BindAlipayUid *string `json:"bind_alipay_uid,omitempty" xml:"bind_alipay_uid,omitempty"`
	// 结算银行卡账号
	BankNum *string `json:"bank_num,omitempty" xml:"bank_num,omitempty"`
	// 联行号
	BankCnap *string `json:"bank_cnap,omitempty" xml:"bank_cnap,omitempty"`
	// 结算账户类型
	// merchant_type=01企业时：ENTERPRISE
	// 03:民办非企业：ENTERPRISE
	// 07个体工商户时：PERSON或 ENTERPRISE
	BankAccountType *string `json:"bank_account_type,omitempty" xml:"bank_account_type,omitempty"`
	// 二级商户id
	SubMerchantId *string `json:"sub_merchant_id,omitempty" xml:"sub_merchant_id,omitempty"`
	// 进件流水号
	PayExpandId *string `json:"pay_expand_id,omitempty" xml:"pay_expand_id,omitempty"`
}

func (s MerchantPayChannelInfo) String() string {
	return tea.Prettify(s)
}

func (s MerchantPayChannelInfo) GoString() string {
	return s.String()
}

func (s *MerchantPayChannelInfo) SetPayChannel(v string) *MerchantPayChannelInfo {
	s.PayChannel = &v
	return s
}

func (s *MerchantPayChannelInfo) SetBindAlipayNo(v string) *MerchantPayChannelInfo {
	s.BindAlipayNo = &v
	return s
}

func (s *MerchantPayChannelInfo) SetSettleAlipayNo(v string) *MerchantPayChannelInfo {
	s.SettleAlipayNo = &v
	return s
}

func (s *MerchantPayChannelInfo) SetBindAlipayUid(v string) *MerchantPayChannelInfo {
	s.BindAlipayUid = &v
	return s
}

func (s *MerchantPayChannelInfo) SetBankNum(v string) *MerchantPayChannelInfo {
	s.BankNum = &v
	return s
}

func (s *MerchantPayChannelInfo) SetBankCnap(v string) *MerchantPayChannelInfo {
	s.BankCnap = &v
	return s
}

func (s *MerchantPayChannelInfo) SetBankAccountType(v string) *MerchantPayChannelInfo {
	s.BankAccountType = &v
	return s
}

func (s *MerchantPayChannelInfo) SetSubMerchantId(v string) *MerchantPayChannelInfo {
	s.SubMerchantId = &v
	return s
}

func (s *MerchantPayChannelInfo) SetPayExpandId(v string) *MerchantPayChannelInfo {
	s.PayExpandId = &v
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

// 随时享-服务商平台场景商品租赁配置详情信息
type SignMerchantLeaseConfig struct {
	// 商户商品spuId
	MerchantProductId *string `json:"merchant_product_id,omitempty" xml:"merchant_product_id,omitempty"`
	// 商户品牌
	MerchantBrand *string `json:"merchant_brand,omitempty" xml:"merchant_brand,omitempty"`
	// logo
	MerchantLogo *string `json:"merchant_logo,omitempty" xml:"merchant_logo,omitempty"`
	// logo
	LargeMerchantLogo *string `json:"large_merchant_logo,omitempty" xml:"large_merchant_logo,omitempty"`
	// 是否置灰
	Grayed *bool `json:"grayed,omitempty" xml:"grayed,omitempty"`
	// 租赁方案
	RentalPlan []*string `json:"rental_plan,omitempty" xml:"rental_plan,omitempty" type:"Repeated"`
	// 租赁方案说明
	RentalPlanIntro *string `json:"rental_plan_intro,omitempty" xml:"rental_plan_intro,omitempty"`
	// 租赁周期
	RentalPeriod []*int64 `json:"rental_period,omitempty" xml:"rental_period,omitempty" type:"Repeated"`
	// 可续租
	SupportRenew *bool `json:"support_renew,omitempty" xml:"support_renew,omitempty"`
	// 可买断
	SupportBuyout *bool `json:"support_buyout,omitempty" xml:"support_buyout,omitempty"`
	// 租赁价格方案列表
	LeasePricePlanList []*LeasePricePlan `json:"lease_price_plan_list,omitempty" xml:"lease_price_plan_list,omitempty" type:"Repeated"`
	// 寄出是否包邮
	FreeShippingOut *bool `json:"free_shipping_out,omitempty" xml:"free_shipping_out,omitempty"`
	// 寄回是否包邮
	FreeShippingBack *bool `json:"free_shipping_back,omitempty" xml:"free_shipping_back,omitempty"`
	// 发货时效
	ShippingDurationType *string `json:"shipping_duration_type,omitempty" xml:"shipping_duration_type,omitempty"`
	// 增值服务介绍
	ValueAddedServiceIntro *string `json:"value_added_service_intro,omitempty" xml:"value_added_service_intro,omitempty"`
	// 详情页介绍
	DetailPageIntro *string `json:"detail_page_intro,omitempty" xml:"detail_page_intro,omitempty"`
	// 服务承诺
	ServicePromiseIntro []*string `json:"service_promise_intro,omitempty" xml:"service_promise_intro,omitempty" type:"Repeated"`
}

func (s SignMerchantLeaseConfig) String() string {
	return tea.Prettify(s)
}

func (s SignMerchantLeaseConfig) GoString() string {
	return s.String()
}

func (s *SignMerchantLeaseConfig) SetMerchantProductId(v string) *SignMerchantLeaseConfig {
	s.MerchantProductId = &v
	return s
}

func (s *SignMerchantLeaseConfig) SetMerchantBrand(v string) *SignMerchantLeaseConfig {
	s.MerchantBrand = &v
	return s
}

func (s *SignMerchantLeaseConfig) SetMerchantLogo(v string) *SignMerchantLeaseConfig {
	s.MerchantLogo = &v
	return s
}

func (s *SignMerchantLeaseConfig) SetLargeMerchantLogo(v string) *SignMerchantLeaseConfig {
	s.LargeMerchantLogo = &v
	return s
}

func (s *SignMerchantLeaseConfig) SetGrayed(v bool) *SignMerchantLeaseConfig {
	s.Grayed = &v
	return s
}

func (s *SignMerchantLeaseConfig) SetRentalPlan(v []*string) *SignMerchantLeaseConfig {
	s.RentalPlan = v
	return s
}

func (s *SignMerchantLeaseConfig) SetRentalPlanIntro(v string) *SignMerchantLeaseConfig {
	s.RentalPlanIntro = &v
	return s
}

func (s *SignMerchantLeaseConfig) SetRentalPeriod(v []*int64) *SignMerchantLeaseConfig {
	s.RentalPeriod = v
	return s
}

func (s *SignMerchantLeaseConfig) SetSupportRenew(v bool) *SignMerchantLeaseConfig {
	s.SupportRenew = &v
	return s
}

func (s *SignMerchantLeaseConfig) SetSupportBuyout(v bool) *SignMerchantLeaseConfig {
	s.SupportBuyout = &v
	return s
}

func (s *SignMerchantLeaseConfig) SetLeasePricePlanList(v []*LeasePricePlan) *SignMerchantLeaseConfig {
	s.LeasePricePlanList = v
	return s
}

func (s *SignMerchantLeaseConfig) SetFreeShippingOut(v bool) *SignMerchantLeaseConfig {
	s.FreeShippingOut = &v
	return s
}

func (s *SignMerchantLeaseConfig) SetFreeShippingBack(v bool) *SignMerchantLeaseConfig {
	s.FreeShippingBack = &v
	return s
}

func (s *SignMerchantLeaseConfig) SetShippingDurationType(v string) *SignMerchantLeaseConfig {
	s.ShippingDurationType = &v
	return s
}

func (s *SignMerchantLeaseConfig) SetValueAddedServiceIntro(v string) *SignMerchantLeaseConfig {
	s.ValueAddedServiceIntro = &v
	return s
}

func (s *SignMerchantLeaseConfig) SetDetailPageIntro(v string) *SignMerchantLeaseConfig {
	s.DetailPageIntro = &v
	return s
}

func (s *SignMerchantLeaseConfig) SetServicePromiseIntro(v []*string) *SignMerchantLeaseConfig {
	s.ServicePromiseIntro = v
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

// 内部使用接口资产凭证信息
type InnerCreditInfo struct {
	// 凭证内容id
	ContentId *string `json:"content_id,omitempty" xml:"content_id,omitempty"`
	// 资产凭证的类型，可支持：FILE(文件)、TEXT(文本)、JSON_TEXT(JSON文本)
	ContentType *string `json:"content_type,omitempty" xml:"content_type,omitempty"`
	// 资产凭证名称
	CreditName *string `json:"credit_name,omitempty" xml:"credit_name,omitempty"`
	// 凭证文件下载链接
	CreditFileUrl *string `json:"credit_file_url,omitempty" xml:"credit_file_url,omitempty"`
	// 上传的文本内容
	CreditContent *string `json:"credit_content,omitempty" xml:"credit_content,omitempty"`
	// 凭证创建时间(yyyy-MM-dd HH:mm:ss)
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
}

func (s InnerCreditInfo) String() string {
	return tea.Prettify(s)
}

func (s InnerCreditInfo) GoString() string {
	return s.String()
}

func (s *InnerCreditInfo) SetContentId(v string) *InnerCreditInfo {
	s.ContentId = &v
	return s
}

func (s *InnerCreditInfo) SetContentType(v string) *InnerCreditInfo {
	s.ContentType = &v
	return s
}

func (s *InnerCreditInfo) SetCreditName(v string) *InnerCreditInfo {
	s.CreditName = &v
	return s
}

func (s *InnerCreditInfo) SetCreditFileUrl(v string) *InnerCreditInfo {
	s.CreditFileUrl = &v
	return s
}

func (s *InnerCreditInfo) SetCreditContent(v string) *InnerCreditInfo {
	s.CreditContent = &v
	return s
}

func (s *InnerCreditInfo) SetCreateTime(v string) *InnerCreditInfo {
	s.CreateTime = &v
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
	// Y期的订单的账单金额
	TotalBillAmountYPeriod *int64 `json:"total_bill_amount_y_period,omitempty" xml:"total_bill_amount_y_period,omitempty" require:"true"`
	// 已到Y期订单中Y期平均期限(y期订单的平均期限)
	AverageTermYPeriod *string `json:"average_term_y_period,omitempty" xml:"average_term_y_period,omitempty" require:"true"`
	// Y期的订单中状态为取消的账单金额
	CancelledBillAmountYPeriod *int64 `json:"cancelled_bill_amount_y_period,omitempty" xml:"cancelled_bill_amount_y_period,omitempty" require:"true"`
	// 状态为逾期1天及以上的账单金额
	BillAmountOverdueBy1dayOrMore *string `json:"bill_amount_overdue_by1day_or_more,omitempty" xml:"bill_amount_overdue_by1day_or_more,omitempty" require:"true"`
	// Y期的订单中状态为逾期1天及以上的账单金额
	BillAmountOverdueBy1dayOrMoreYPeriod *string `json:"bill_amount_overdue_by1day_or_more_y_period,omitempty" xml:"bill_amount_overdue_by1day_or_more_y_period,omitempty" require:"true"`
	// 状态为逾期30天及以上的账单金额
	BillAmountOverdueBy30DaysOrMore *string `json:"bill_amount_overdue_by30_days_or_more,omitempty" xml:"bill_amount_overdue_by30_days_or_more,omitempty" require:"true"`
	// Y期的订单中状态为逾期30天及以上的账单金额
	BillAmountOverdueBy30DaysOrMoreYPeriod *string `json:"bill_amount_overdue_by30_days_or_more_y_period,omitempty" xml:"bill_amount_overdue_by30_days_or_more_y_period,omitempty" require:"true"`
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

func (s *FundAssertReport) SetBillAmountOverdueBy1dayOrMore(v string) *FundAssertReport {
	s.BillAmountOverdueBy1dayOrMore = &v
	return s
}

func (s *FundAssertReport) SetBillAmountOverdueBy1dayOrMoreYPeriod(v string) *FundAssertReport {
	s.BillAmountOverdueBy1dayOrMoreYPeriod = &v
	return s
}

func (s *FundAssertReport) SetBillAmountOverdueBy30DaysOrMore(v string) *FundAssertReport {
	s.BillAmountOverdueBy30DaysOrMore = &v
	return s
}

func (s *FundAssertReport) SetBillAmountOverdueBy30DaysOrMoreYPeriod(v string) *FundAssertReport {
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

// 智能体二期-用户基础信息
type MerchantBaseInfo struct {
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 品牌名称
	BrandName *string `json:"brand_name,omitempty" xml:"brand_name,omitempty"`
	// 品牌logo
	BrandLogo *string `json:"brand_logo,omitempty" xml:"brand_logo,omitempty"`
	// 商家小程序链接
	MerchantAppLink *string `json:"merchant_app_link,omitempty" xml:"merchant_app_link,omitempty"`
	// 商家更新电话
	MerchantPhone *string `json:"merchant_phone,omitempty" xml:"merchant_phone,omitempty"`
	// 提交时间
	SubmitTime *string `json:"submit_time,omitempty" xml:"submit_time,omitempty"`
	// 审核状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 品牌名称-审核中
	BrandNameSnapshot *string `json:"brand_name_snapshot,omitempty" xml:"brand_name_snapshot,omitempty"`
	// 品牌logo-审核中
	BrandLogoSnapshot *string `json:"brand_logo_snapshot,omitempty" xml:"brand_logo_snapshot,omitempty"`
	// 商家小程序链接_审核中
	MerchantAppLinkSnapshot *string `json:"merchant_app_link_snapshot,omitempty" xml:"merchant_app_link_snapshot,omitempty"`
	// 商家电话_审核中
	MerchantPhoneSnapshot *string `json:"merchant_phone_snapshot,omitempty" xml:"merchant_phone_snapshot,omitempty"`
	// 更新时间_审核中
	SubmitTimeSnapshot *string `json:"submit_time_snapshot,omitempty" xml:"submit_time_snapshot,omitempty"`
	// 驳回原因_审核中
	RefuseReasonSnapshot *string `json:"refuse_reason_snapshot,omitempty" xml:"refuse_reason_snapshot,omitempty"`
}

func (s MerchantBaseInfo) String() string {
	return tea.Prettify(s)
}

func (s MerchantBaseInfo) GoString() string {
	return s.String()
}

func (s *MerchantBaseInfo) SetTenantId(v string) *MerchantBaseInfo {
	s.TenantId = &v
	return s
}

func (s *MerchantBaseInfo) SetBrandName(v string) *MerchantBaseInfo {
	s.BrandName = &v
	return s
}

func (s *MerchantBaseInfo) SetBrandLogo(v string) *MerchantBaseInfo {
	s.BrandLogo = &v
	return s
}

func (s *MerchantBaseInfo) SetMerchantAppLink(v string) *MerchantBaseInfo {
	s.MerchantAppLink = &v
	return s
}

func (s *MerchantBaseInfo) SetMerchantPhone(v string) *MerchantBaseInfo {
	s.MerchantPhone = &v
	return s
}

func (s *MerchantBaseInfo) SetSubmitTime(v string) *MerchantBaseInfo {
	s.SubmitTime = &v
	return s
}

func (s *MerchantBaseInfo) SetStatus(v string) *MerchantBaseInfo {
	s.Status = &v
	return s
}

func (s *MerchantBaseInfo) SetBrandNameSnapshot(v string) *MerchantBaseInfo {
	s.BrandNameSnapshot = &v
	return s
}

func (s *MerchantBaseInfo) SetBrandLogoSnapshot(v string) *MerchantBaseInfo {
	s.BrandLogoSnapshot = &v
	return s
}

func (s *MerchantBaseInfo) SetMerchantAppLinkSnapshot(v string) *MerchantBaseInfo {
	s.MerchantAppLinkSnapshot = &v
	return s
}

func (s *MerchantBaseInfo) SetMerchantPhoneSnapshot(v string) *MerchantBaseInfo {
	s.MerchantPhoneSnapshot = &v
	return s
}

func (s *MerchantBaseInfo) SetSubmitTimeSnapshot(v string) *MerchantBaseInfo {
	s.SubmitTimeSnapshot = &v
	return s
}

func (s *MerchantBaseInfo) SetRefuseReasonSnapshot(v string) *MerchantBaseInfo {
	s.RefuseReasonSnapshot = &v
	return s
}

// 资产订单信息
type AssetPackageOrderInfo struct {
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 订单状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 出包原因
	OutReason *string `json:"out_reason,omitempty" xml:"out_reason,omitempty"`
	// 订单用信额度
	OrderCreditLine *int64 `json:"order_credit_line,omitempty" xml:"order_credit_line,omitempty"`
	// 商户应还款金额
	OrderMerchantRepaymentMoney *int64 `json:"order_merchant_repayment_money,omitempty" xml:"order_merchant_repayment_money,omitempty"`
	// 订单分账起始账期
	DivideStartTermIndex *int64 `json:"divide_start_term_index,omitempty" xml:"divide_start_term_index,omitempty"`
}

func (s AssetPackageOrderInfo) String() string {
	return tea.Prettify(s)
}

func (s AssetPackageOrderInfo) GoString() string {
	return s.String()
}

func (s *AssetPackageOrderInfo) SetOrderId(v string) *AssetPackageOrderInfo {
	s.OrderId = &v
	return s
}

func (s *AssetPackageOrderInfo) SetStatus(v string) *AssetPackageOrderInfo {
	s.Status = &v
	return s
}

func (s *AssetPackageOrderInfo) SetOutReason(v string) *AssetPackageOrderInfo {
	s.OutReason = &v
	return s
}

func (s *AssetPackageOrderInfo) SetOrderCreditLine(v int64) *AssetPackageOrderInfo {
	s.OrderCreditLine = &v
	return s
}

func (s *AssetPackageOrderInfo) SetOrderMerchantRepaymentMoney(v int64) *AssetPackageOrderInfo {
	s.OrderMerchantRepaymentMoney = &v
	return s
}

func (s *AssetPackageOrderInfo) SetDivideStartTermIndex(v int64) *AssetPackageOrderInfo {
	s.DivideStartTermIndex = &v
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
	// 周期性代扣
	ReturnWay *string `json:"return_way,omitempty" xml:"return_way,omitempty"`
	// 还款流水号
	ReturnVoucherSerial *string `json:"return_voucher_serial,omitempty" xml:"return_voucher_serial,omitempty"`
	// 支付宝协议号
	AlipayTradeNo *string `json:"alipay_trade_no,omitempty" xml:"alipay_trade_no,omitempty"`
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

func (s *OrderFulfillmentInfo) SetReturnWay(v string) *OrderFulfillmentInfo {
	s.ReturnWay = &v
	return s
}

func (s *OrderFulfillmentInfo) SetReturnVoucherSerial(v string) *OrderFulfillmentInfo {
	s.ReturnVoucherSerial = &v
	return s
}

func (s *OrderFulfillmentInfo) SetAlipayTradeNo(v string) *OrderFulfillmentInfo {
	s.AlipayTradeNo = &v
	return s
}

// 公司概要信息
type CompanySummaryInfo struct {
	// 社会统一信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// 公司名称
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty"`
}

func (s CompanySummaryInfo) String() string {
	return tea.Prettify(s)
}

func (s CompanySummaryInfo) GoString() string {
	return s.String()
}

func (s *CompanySummaryInfo) SetMerchantId(v string) *CompanySummaryInfo {
	s.MerchantId = &v
	return s
}

func (s *CompanySummaryInfo) SetMerchantName(v string) *CompanySummaryInfo {
	s.MerchantName = &v
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

// 营销场景
type PromotionScene struct {
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty"`
	// 场景名称
	SceneName *string `json:"scene_name,omitempty" xml:"scene_name,omitempty"`
	// 场景备注
	SceneRemark *string `json:"scene_remark,omitempty" xml:"scene_remark,omitempty"`
	// 场景商品数量
	SceneProductAmount *int64 `json:"scene_product_amount,omitempty" xml:"scene_product_amount,omitempty"`
	// 已上线场景商品数量
	OnlineSceneProductAmount *int64 `json:"online_scene_product_amount,omitempty" xml:"online_scene_product_amount,omitempty"`
}

func (s PromotionScene) String() string {
	return tea.Prettify(s)
}

func (s PromotionScene) GoString() string {
	return s.String()
}

func (s *PromotionScene) SetTenantId(v string) *PromotionScene {
	s.TenantId = &v
	return s
}

func (s *PromotionScene) SetSceneCode(v string) *PromotionScene {
	s.SceneCode = &v
	return s
}

func (s *PromotionScene) SetSceneName(v string) *PromotionScene {
	s.SceneName = &v
	return s
}

func (s *PromotionScene) SetSceneRemark(v string) *PromotionScene {
	s.SceneRemark = &v
	return s
}

func (s *PromotionScene) SetSceneProductAmount(v int64) *PromotionScene {
	s.SceneProductAmount = &v
	return s
}

func (s *PromotionScene) SetOnlineSceneProductAmount(v int64) *PromotionScene {
	s.OnlineSceneProductAmount = &v
	return s
}

// 商户履约订单其他还款支持信息
type MerchantPerformanceRepaySupportInfo struct {
	// 是否支持还款取消
	SupportRepay *bool `json:"support_repay,omitempty" xml:"support_repay,omitempty"`
	// 商户履约期数
	TermIndex *int64 `json:"term_index,omitempty" xml:"term_index,omitempty"`
}

func (s MerchantPerformanceRepaySupportInfo) String() string {
	return tea.Prettify(s)
}

func (s MerchantPerformanceRepaySupportInfo) GoString() string {
	return s.String()
}

func (s *MerchantPerformanceRepaySupportInfo) SetSupportRepay(v bool) *MerchantPerformanceRepaySupportInfo {
	s.SupportRepay = &v
	return s
}

func (s *MerchantPerformanceRepaySupportInfo) SetTermIndex(v int64) *MerchantPerformanceRepaySupportInfo {
	s.TermIndex = &v
	return s
}

// 用信查询订单履约信息结构体
type OrderPromiseExcelInfo struct {
	// 文件下载地址
	DownloadUrl *string `json:"download_url,omitempty" xml:"download_url,omitempty"`
	// 文件类型,订单明细表:ORDER_DETAIL 还款记录表:ORDER_FULFILLMENT
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// 任务状态
	// ● RUNNING:生成中
	// ● SUCCESS:已生成
	// ● FAILED:失败
	TaskStatus *string `json:"task_status,omitempty" xml:"task_status,omitempty" require:"true"`
}

func (s OrderPromiseExcelInfo) String() string {
	return tea.Prettify(s)
}

func (s OrderPromiseExcelInfo) GoString() string {
	return s.String()
}

func (s *OrderPromiseExcelInfo) SetDownloadUrl(v string) *OrderPromiseExcelInfo {
	s.DownloadUrl = &v
	return s
}

func (s *OrderPromiseExcelInfo) SetFileType(v string) *OrderPromiseExcelInfo {
	s.FileType = &v
	return s
}

func (s *OrderPromiseExcelInfo) SetTaskStatus(v string) *OrderPromiseExcelInfo {
	s.TaskStatus = &v
	return s
}

// 资产包创建履约计划参数
type AssetPackageCreatePromisePlanParams struct {
	// 账期
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty"`
	// 还款时间yyyy-MM-dd
	PayDay *string `json:"pay_day,omitempty" xml:"pay_day,omitempty"`
	// 计划还款总额，单位为分
	TotalAmount *int64 `json:"total_amount,omitempty" xml:"total_amount,omitempty"`
	// 本金，单位为分
	PrincipalAmount *int64 `json:"principal_amount,omitempty" xml:"principal_amount,omitempty"`
	// 利息，单位为分
	InterestAmount *int64 `json:"interest_amount,omitempty" xml:"interest_amount,omitempty"`
}

func (s AssetPackageCreatePromisePlanParams) String() string {
	return tea.Prettify(s)
}

func (s AssetPackageCreatePromisePlanParams) GoString() string {
	return s.String()
}

func (s *AssetPackageCreatePromisePlanParams) SetPeriodNum(v int64) *AssetPackageCreatePromisePlanParams {
	s.PeriodNum = &v
	return s
}

func (s *AssetPackageCreatePromisePlanParams) SetPayDay(v string) *AssetPackageCreatePromisePlanParams {
	s.PayDay = &v
	return s
}

func (s *AssetPackageCreatePromisePlanParams) SetTotalAmount(v int64) *AssetPackageCreatePromisePlanParams {
	s.TotalAmount = &v
	return s
}

func (s *AssetPackageCreatePromisePlanParams) SetPrincipalAmount(v int64) *AssetPackageCreatePromisePlanParams {
	s.PrincipalAmount = &v
	return s
}

func (s *AssetPackageCreatePromisePlanParams) SetInterestAmount(v int64) *AssetPackageCreatePromisePlanParams {
	s.InterestAmount = &v
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

// 京东进件商家结算信息
type MerchantSettleInfo struct {
	// 结算银行卡账号
	BankNum *string `json:"bank_num,omitempty" xml:"bank_num,omitempty" require:"true"`
	// 联行号
	BankCnap *string `json:"bank_cnap,omitempty" xml:"bank_cnap,omitempty" require:"true"`
	// 结算账户类型
	// merchant_type=01企业时：ENTERPRISE
	// 03:民办非企业：ENTERPRISE
	// 07个体工商户时：PERSON或 ENTERPRISE
	BankAccountType *string `json:"bank_account_type,omitempty" xml:"bank_account_type,omitempty" require:"true"`
	// 支行名称
	BankBranchName *string `json:"bank_branch_name,omitempty" xml:"bank_branch_name,omitempty"`
	// 银行名称
	BankName *string `json:"bank_name,omitempty" xml:"bank_name,omitempty"`
}

func (s MerchantSettleInfo) String() string {
	return tea.Prettify(s)
}

func (s MerchantSettleInfo) GoString() string {
	return s.String()
}

func (s *MerchantSettleInfo) SetBankNum(v string) *MerchantSettleInfo {
	s.BankNum = &v
	return s
}

func (s *MerchantSettleInfo) SetBankCnap(v string) *MerchantSettleInfo {
	s.BankCnap = &v
	return s
}

func (s *MerchantSettleInfo) SetBankAccountType(v string) *MerchantSettleInfo {
	s.BankAccountType = &v
	return s
}

func (s *MerchantSettleInfo) SetBankBranchName(v string) *MerchantSettleInfo {
	s.BankBranchName = &v
	return s
}

func (s *MerchantSettleInfo) SetBankName(v string) *MerchantSettleInfo {
	s.BankName = &v
	return s
}

// 智能体二期-知识点信息
type KnowledgeInfo struct {
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 主键id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 类型
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 问题
	Question *string `json:"question,omitempty" xml:"question,omitempty"`
	// 答案
	Answer *string `json:"answer,omitempty" xml:"answer,omitempty"`
	// 是否选择订单
	HasOrder *bool `json:"has_order,omitempty" xml:"has_order,omitempty"`
	// 是否带小程序链接
	HasAppLink *bool `json:"has_app_link,omitempty" xml:"has_app_link,omitempty"`
	// 是否转人工
	HasManual *bool `json:"has_manual,omitempty" xml:"has_manual,omitempty"`
	// 状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 驳回原因
	RefuseReason *string `json:"refuse_reason,omitempty" xml:"refuse_reason,omitempty"`
}

func (s KnowledgeInfo) String() string {
	return tea.Prettify(s)
}

func (s KnowledgeInfo) GoString() string {
	return s.String()
}

func (s *KnowledgeInfo) SetTenantId(v string) *KnowledgeInfo {
	s.TenantId = &v
	return s
}

func (s *KnowledgeInfo) SetId(v int64) *KnowledgeInfo {
	s.Id = &v
	return s
}

func (s *KnowledgeInfo) SetType(v string) *KnowledgeInfo {
	s.Type = &v
	return s
}

func (s *KnowledgeInfo) SetQuestion(v string) *KnowledgeInfo {
	s.Question = &v
	return s
}

func (s *KnowledgeInfo) SetAnswer(v string) *KnowledgeInfo {
	s.Answer = &v
	return s
}

func (s *KnowledgeInfo) SetHasOrder(v bool) *KnowledgeInfo {
	s.HasOrder = &v
	return s
}

func (s *KnowledgeInfo) SetHasAppLink(v bool) *KnowledgeInfo {
	s.HasAppLink = &v
	return s
}

func (s *KnowledgeInfo) SetHasManual(v bool) *KnowledgeInfo {
	s.HasManual = &v
	return s
}

func (s *KnowledgeInfo) SetStatus(v string) *KnowledgeInfo {
	s.Status = &v
	return s
}

func (s *KnowledgeInfo) SetRefuseReason(v string) *KnowledgeInfo {
	s.RefuseReason = &v
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

// 商家举证材料
type MerchantSupportEvidence struct {
	// 商家操作(拒绝)时间
	MerchantOperateTime *string `json:"merchant_operate_time,omitempty" xml:"merchant_operate_time,omitempty"`
	// 商家拒绝原因
	MerchantRefuseReason *string `json:"merchant_refuse_reason,omitempty" xml:"merchant_refuse_reason,omitempty"`
	// 商家拒绝举证材料
	MerchantRefuseEvidences []*string `json:"merchant_refuse_evidences,omitempty" xml:"merchant_refuse_evidences,omitempty" type:"Repeated"`
}

func (s MerchantSupportEvidence) String() string {
	return tea.Prettify(s)
}

func (s MerchantSupportEvidence) GoString() string {
	return s.String()
}

func (s *MerchantSupportEvidence) SetMerchantOperateTime(v string) *MerchantSupportEvidence {
	s.MerchantOperateTime = &v
	return s
}

func (s *MerchantSupportEvidence) SetMerchantRefuseReason(v string) *MerchantSupportEvidence {
	s.MerchantRefuseReason = &v
	return s
}

func (s *MerchantSupportEvidence) SetMerchantRefuseEvidences(v []*string) *MerchantSupportEvidence {
	s.MerchantRefuseEvidences = v
	return s
}

// 订单电子合同信息对象
type OrderContractInfo struct {
	// 电子合同签署单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty"`
	// 签署时间
	SignTime *string `json:"sign_time,omitempty" xml:"sign_time,omitempty"`
	// 合同签署类型
	ContractType *string `json:"contract_type,omitempty" xml:"contract_type,omitempty"`
	// 文件合同类型
	AgreementType *string `json:"agreement_type,omitempty" xml:"agreement_type,omitempty"`
	// 模板ID
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty"`
	// 模板文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// 合同文件下载地址
	DownloadUrl *string `json:"download_url,omitempty" xml:"download_url,omitempty"`
}

func (s OrderContractInfo) String() string {
	return tea.Prettify(s)
}

func (s OrderContractInfo) GoString() string {
	return s.String()
}

func (s *OrderContractInfo) SetSignNo(v string) *OrderContractInfo {
	s.SignNo = &v
	return s
}

func (s *OrderContractInfo) SetSignTime(v string) *OrderContractInfo {
	s.SignTime = &v
	return s
}

func (s *OrderContractInfo) SetContractType(v string) *OrderContractInfo {
	s.ContractType = &v
	return s
}

func (s *OrderContractInfo) SetAgreementType(v string) *OrderContractInfo {
	s.AgreementType = &v
	return s
}

func (s *OrderContractInfo) SetTemplateId(v string) *OrderContractInfo {
	s.TemplateId = &v
	return s
}

func (s *OrderContractInfo) SetFileName(v string) *OrderContractInfo {
	s.FileName = &v
	return s
}

func (s *OrderContractInfo) SetDownloadUrl(v string) *OrderContractInfo {
	s.DownloadUrl = &v
	return s
}

// 商户履约赎回信息
type MerchantPerformanceRedeemInfo struct {
	// 是否展示“剩余账期提前回购”
	SupportRedeem *bool `json:"support_redeem,omitempty" xml:"support_redeem,omitempty"`
	// 可选回购类型
	// TRANSFER("TRANSFER", "转账代偿"),
	// WITHHOLD("WITHHOLD", "代扣代偿"),
	SupportRedeemTypeList []*string `json:"support_redeem_type_list,omitempty" xml:"support_redeem_type_list,omitempty" type:"Repeated"`
	// 商户履约赎回结果信息
	MerchantPerformanceRedeemResultInfo *MerchantPerformanceRedeemResultInfo `json:"merchant_performance_redeem_result_info,omitempty" xml:"merchant_performance_redeem_result_info,omitempty"`
}

func (s MerchantPerformanceRedeemInfo) String() string {
	return tea.Prettify(s)
}

func (s MerchantPerformanceRedeemInfo) GoString() string {
	return s.String()
}

func (s *MerchantPerformanceRedeemInfo) SetSupportRedeem(v bool) *MerchantPerformanceRedeemInfo {
	s.SupportRedeem = &v
	return s
}

func (s *MerchantPerformanceRedeemInfo) SetSupportRedeemTypeList(v []*string) *MerchantPerformanceRedeemInfo {
	s.SupportRedeemTypeList = v
	return s
}

func (s *MerchantPerformanceRedeemInfo) SetMerchantPerformanceRedeemResultInfo(v *MerchantPerformanceRedeemResultInfo) *MerchantPerformanceRedeemInfo {
	s.MerchantPerformanceRedeemResultInfo = v
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
	// 待办类型
	// text
	// link
	ContentType *string `json:"content_type,omitempty" xml:"content_type,omitempty"`
	// 待办详情，
	// content_type=text，是富文本
	// content_type=link，是fileKey,通过antchain.ato.inner.file.download获取文件访问链接
	ContentDetails *string `json:"content_details,omitempty" xml:"content_details,omitempty"`
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

func (s *PendingEventInfo) SetContentType(v string) *PendingEventInfo {
	s.ContentType = &v
	return s
}

func (s *PendingEventInfo) SetContentDetails(v string) *PendingEventInfo {
	s.ContentDetails = &v
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

// 资方后台融资结果
type FundMngLoanApplyResult struct {
	// 放款状态
	LoanApplyStatus *string `json:"loan_apply_status,omitempty" xml:"loan_apply_status,omitempty"`
	// 融资申请失败原因
	LoanFailReason *string `json:"loan_fail_reason,omitempty" xml:"loan_fail_reason,omitempty"`
}

func (s FundMngLoanApplyResult) String() string {
	return tea.Prettify(s)
}

func (s FundMngLoanApplyResult) GoString() string {
	return s.String()
}

func (s *FundMngLoanApplyResult) SetLoanApplyStatus(v string) *FundMngLoanApplyResult {
	s.LoanApplyStatus = &v
	return s
}

func (s *FundMngLoanApplyResult) SetLoanFailReason(v string) *FundMngLoanApplyResult {
	s.LoanFailReason = &v
	return s
}

// 签署人账户
type SignAccount struct {
	// 公司统一社会信用代码（userType=ORGANIZATION必传）
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty"`
	// 公司角色（userType=ORGANIZATION必传） MERCHANT=商户;FINANCIER=资方
	CompanyRole *string `json:"company_role,omitempty" xml:"company_role,omitempty"`
	// 用户姓名（userType=PERSON必传，需要RSA加密）
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
	// 用户身份证号（userType=PERSON必传，需要RSA加密）
	UserIdNumber *string `json:"user_id_number,omitempty" xml:"user_id_number,omitempty"`
	// 签署人类型，PERSON=个人;ORGANIZATION=机构
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty" require:"true"`
	// 用户邮箱（userType=PERSON必传，需要RSA加密）
	UserEmail *string `json:"user_email,omitempty" xml:"user_email,omitempty"`
	// 用户手机号（userType=PERSON必传，需要RSA加密）
	UserMobile *string `json:"user_mobile,omitempty" xml:"user_mobile,omitempty"`
	// 签署标签（对应模版配置中的tag）
	Tag *string `json:"tag,omitempty" xml:"tag,omitempty" require:"true"`
	// 是否获取签署链接
	GetSignUrl *bool `json:"get_sign_url,omitempty" xml:"get_sign_url,omitempty"`
}

func (s SignAccount) String() string {
	return tea.Prettify(s)
}

func (s SignAccount) GoString() string {
	return s.String()
}

func (s *SignAccount) SetCompanyId(v string) *SignAccount {
	s.CompanyId = &v
	return s
}

func (s *SignAccount) SetCompanyRole(v string) *SignAccount {
	s.CompanyRole = &v
	return s
}

func (s *SignAccount) SetUserName(v string) *SignAccount {
	s.UserName = &v
	return s
}

func (s *SignAccount) SetUserIdNumber(v string) *SignAccount {
	s.UserIdNumber = &v
	return s
}

func (s *SignAccount) SetUserType(v string) *SignAccount {
	s.UserType = &v
	return s
}

func (s *SignAccount) SetUserEmail(v string) *SignAccount {
	s.UserEmail = &v
	return s
}

func (s *SignAccount) SetUserMobile(v string) *SignAccount {
	s.UserMobile = &v
	return s
}

func (s *SignAccount) SetTag(v string) *SignAccount {
	s.Tag = &v
	return s
}

func (s *SignAccount) SetGetSignUrl(v bool) *SignAccount {
	s.GetSignUrl = &v
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
	// 支付单据创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 多期合并支付明细
	MultiPayDetail []*SingleTermDetail `json:"multi_pay_detail,omitempty" xml:"multi_pay_detail,omitempty" type:"Repeated"`
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

func (s *ActivePayOrder) SetGmtCreate(v string) *ActivePayOrder {
	s.GmtCreate = &v
	return s
}

func (s *ActivePayOrder) SetMultiPayDetail(v []*SingleTermDetail) *ActivePayOrder {
	s.MultiPayDetail = v
	return s
}

// 拒量模型
type RejectRiskModel struct {
	//  拒量模型捞回分
	MobThreeScore *string `json:"mob_three_score,omitempty" xml:"mob_three_score,omitempty" require:"true"`
	// 拒量模型首逾分
	FpdThirtyScore *string `json:"fpd_thirty_score,omitempty" xml:"fpd_thirty_score,omitempty" require:"true"`
}

func (s RejectRiskModel) String() string {
	return tea.Prettify(s)
}

func (s RejectRiskModel) GoString() string {
	return s.String()
}

func (s *RejectRiskModel) SetMobThreeScore(v string) *RejectRiskModel {
	s.MobThreeScore = &v
	return s
}

func (s *RejectRiskModel) SetFpdThirtyScore(v string) *RejectRiskModel {
	s.FpdThirtyScore = &v
	return s
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

// 合同签署模板和渲染参数
type TemplateArgs struct {
	// 模板id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 模板版本
	TemplateVersion *string `json:"template_version,omitempty" xml:"template_version,omitempty"`
	// 模板参数，JSON格式，其中key对应模板中的名称，value对应其要渲染的值
	TemplateArgs *string `json:"template_args,omitempty" xml:"template_args,omitempty"`
}

func (s TemplateArgs) String() string {
	return tea.Prettify(s)
}

func (s TemplateArgs) GoString() string {
	return s.String()
}

func (s *TemplateArgs) SetTemplateId(v string) *TemplateArgs {
	s.TemplateId = &v
	return s
}

func (s *TemplateArgs) SetTemplateVersion(v string) *TemplateArgs {
	s.TemplateVersion = &v
	return s
}

func (s *TemplateArgs) SetTemplateArgs(v string) *TemplateArgs {
	s.TemplateArgs = &v
	return s
}

type QueryAntchainAtoPromotionUserunvisitedappidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 支付宝用户uid
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 订阅的appid列表，不支持的appid会自动忽略
	AppIdList []*string `json:"app_id_list,omitempty" xml:"app_id_list,omitempty" require:"true" type:"Repeated"`
	// 默认appid，无法判断推荐结果时返回此默认值
	DefaultAppId *string `json:"default_app_id,omitempty" xml:"default_app_id,omitempty" require:"true"`
}

func (s QueryAntchainAtoPromotionUserunvisitedappidRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoPromotionUserunvisitedappidRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoPromotionUserunvisitedappidRequest) SetAuthToken(v string) *QueryAntchainAtoPromotionUserunvisitedappidRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainAtoPromotionUserunvisitedappidRequest) SetProductInstanceId(v string) *QueryAntchainAtoPromotionUserunvisitedappidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainAtoPromotionUserunvisitedappidRequest) SetUserId(v string) *QueryAntchainAtoPromotionUserunvisitedappidRequest {
	s.UserId = &v
	return s
}

func (s *QueryAntchainAtoPromotionUserunvisitedappidRequest) SetAppIdList(v []*string) *QueryAntchainAtoPromotionUserunvisitedappidRequest {
	s.AppIdList = v
	return s
}

func (s *QueryAntchainAtoPromotionUserunvisitedappidRequest) SetDefaultAppId(v string) *QueryAntchainAtoPromotionUserunvisitedappidRequest {
	s.DefaultAppId = &v
	return s
}

type QueryAntchainAtoPromotionUserunvisitedappidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 推荐的appid
	RecommendAppId *string `json:"recommend_app_id,omitempty" xml:"recommend_app_id,omitempty"`
}

func (s QueryAntchainAtoPromotionUserunvisitedappidResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoPromotionUserunvisitedappidResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoPromotionUserunvisitedappidResponse) SetReqMsgId(v string) *QueryAntchainAtoPromotionUserunvisitedappidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainAtoPromotionUserunvisitedappidResponse) SetResultCode(v string) *QueryAntchainAtoPromotionUserunvisitedappidResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainAtoPromotionUserunvisitedappidResponse) SetResultMsg(v string) *QueryAntchainAtoPromotionUserunvisitedappidResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainAtoPromotionUserunvisitedappidResponse) SetRecommendAppId(v string) *QueryAntchainAtoPromotionUserunvisitedappidResponse {
	s.RecommendAppId = &v
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
				"sdk_version":      tea.String("1.0.0"),
				"_prod_code":       tea.String("SMARTPROMOTION"),
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
 * Description: 智能营销，查询用户未访问过的appid
 * Summary: 智能营销，查询用户未访问过的appid
 */
func (client *Client) QueryAntchainAtoPromotionUserunvisitedappid(request *QueryAntchainAtoPromotionUserunvisitedappidRequest) (_result *QueryAntchainAtoPromotionUserunvisitedappidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainAtoPromotionUserunvisitedappidResponse{}
	_body, _err := client.QueryAntchainAtoPromotionUserunvisitedappidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 智能营销，查询用户未访问过的appid
 * Summary: 智能营销，查询用户未访问过的appid
 */
func (client *Client) QueryAntchainAtoPromotionUserunvisitedappidEx(request *QueryAntchainAtoPromotionUserunvisitedappidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainAtoPromotionUserunvisitedappidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainAtoPromotionUserunvisitedappidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.promotion.userunvisitedappid.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
