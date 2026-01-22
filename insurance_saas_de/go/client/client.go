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

// 货物明细
type CargoDetails struct {
	// 货物序号
	CargoSequenceNo *string `json:"cargo_sequence_no,omitempty" xml:"cargo_sequence_no,omitempty" require:"true" maxLength:"10"`
	// 货物名称
	CargoName *string `json:"cargo_name,omitempty" xml:"cargo_name,omitempty" require:"true" maxLength:"50"`
	// 货物规格
	CargoSpecification *string `json:"cargo_specification,omitempty" xml:"cargo_specification,omitempty" require:"true" maxLength:"50"`
	// 货物数量
	CargoQuantity *string `json:"cargo_quantity,omitempty" xml:"cargo_quantity,omitempty" require:"true" maxLength:"100"`
	// 货物单价，小数位只支持2位
	CargoUnitPrice *string `json:"cargo_unit_price,omitempty" xml:"cargo_unit_price,omitempty" require:"true" maxLength:"20"`
}

func (s CargoDetails) String() string {
	return tea.Prettify(s)
}

func (s CargoDetails) GoString() string {
	return s.String()
}

func (s *CargoDetails) SetCargoSequenceNo(v string) *CargoDetails {
	s.CargoSequenceNo = &v
	return s
}

func (s *CargoDetails) SetCargoName(v string) *CargoDetails {
	s.CargoName = &v
	return s
}

func (s *CargoDetails) SetCargoSpecification(v string) *CargoDetails {
	s.CargoSpecification = &v
	return s
}

func (s *CargoDetails) SetCargoQuantity(v string) *CargoDetails {
	s.CargoQuantity = &v
	return s
}

func (s *CargoDetails) SetCargoUnitPrice(v string) *CargoDetails {
	s.CargoUnitPrice = &v
	return s
}

type ApplyInsurglobifyprodOspiinsureRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 调用方生成的唯一编码，系统会根据该流水号做防重、幂等判断逻辑。当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty" require:"true" maxLength:"50"`
	// 保司编码
	ExternalChannelCode *string `json:"external_channel_code,omitempty" xml:"external_channel_code,omitempty" require:"true" maxLength:"10"`
	// 险种编码
	ExternalProductCode *string `json:"external_product_code,omitempty" xml:"external_product_code,omitempty" require:"true" maxLength:"10"`
	// 保险方案名
	ChSchemeName *string `json:"ch_scheme_name,omitempty" xml:"ch_scheme_name,omitempty" require:"true" maxLength:"20"`
	// 保险项目名
	ChProjectName *string `json:"ch_project_name,omitempty" xml:"ch_project_name,omitempty" require:"true" maxLength:"20"`
	// 总保额，小数位只支持2位
	InsuredAmount *string `json:"insured_amount,omitempty" xml:"insured_amount,omitempty" require:"true" maxLength:"20"`
	// 保费，小数位只支持2位
	Premium *string `json:"premium,omitempty" xml:"premium,omitempty" require:"true" maxLength:"20"`
	// 总保费，小数位只支持2位
	TotalPremium *string `json:"total_premium,omitempty" xml:"total_premium,omitempty" require:"true" maxLength:"20"`
	// 币种，使用ISO 4217代码；
	// CNY：人民币
	// USD：美元
	// EUR：欧元
	// GBP：英镑
	// JPY：日元
	// CHF：瑞士法郎
	// SGD：新加坡元
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty" require:"true" maxLength:"3"`
	// 关联的大保单编号
	BigPolNo *string `json:"big_pol_no,omitempty" xml:"big_pol_no,omitempty" require:"true" maxLength:"200"`
	// 保险起期(ISO 8601格式，2026-01-11T14:30:00+02:00)
	InsureStart *string `json:"insure_start,omitempty" xml:"insure_start,omitempty" require:"true" maxLength:"50"`
	// 时区
	// Asia/Shanghai
	// Europe/Berlin
	// America/New_York
	// Pacific/Auckland
	// Europe/Berlin
	TimeZone *string `json:"time_zone,omitempty" xml:"time_zone,omitempty" require:"true" maxLength:"20"`
	// 投保人名称
	TbrName *string `json:"tbr_name,omitempty" xml:"tbr_name,omitempty" require:"true" maxLength:"100"`
	// 投保人证件类型
	// // 个人
	// // 护照
	// PASSPORT
	// // 国民身份证
	// NATIONAL_ID
	// // 居留许可
	// RESIDENCE_PERMIT
	// // 个人税号
	// TAX_ID
	// // 企业
	// // 公司注册号（最常用）
	// COMPANY_REGISTRATION
	// // 增值税号
	// VAT_NUMBER
	// // 企业税号
	// TAX_ID
	TbrIdType *string `json:"tbr_id_type,omitempty" xml:"tbr_id_type,omitempty" require:"true" maxLength:"20"`
	// 投保人证件号
	TbrIdNo *string `json:"tbr_id_no,omitempty" xml:"tbr_id_no,omitempty" require:"true" maxLength:"100"`
	// 被保人名称
	BbrName *string `json:"bbr_name,omitempty" xml:"bbr_name,omitempty" require:"true" maxLength:"100"`
	// 被保人证件类型
	// // 个人
	// // 护照
	// PASSPORT
	// // 国民身份证
	// NATIONAL_ID
	// // 居留许可
	// RESIDENCE_PERMIT
	// // 个人税号
	// TAX_ID
	// // 企业
	// // 公司注册号（最常用）
	// COMPANY_REGISTRATION
	// // 增值税号
	// VAT_NUMBER
	// // 企业税号
	// TAX_ID
	BbrIdType *string `json:"bbr_id_type,omitempty" xml:"bbr_id_type,omitempty" require:"true" maxLength:"20"`
	// 被保人证件号
	BbrIdNo *string `json:"bbr_id_no,omitempty" xml:"bbr_id_no,omitempty" require:"true" maxLength:"100"`
	// 订单号
	RelaOrderNo *string `json:"rela_order_no,omitempty" xml:"rela_order_no,omitempty" require:"true" maxLength:"100"`
	// 寄件时间(ISO 8601格式，2026-01-11T14:30:00+02:00)
	PickUpTime *string `json:"pick_up_time,omitempty" xml:"pick_up_time,omitempty" require:"true" maxLength:"50"`
	// 快递公司名称
	CourierCompany *string `json:"courier_company,omitempty" xml:"courier_company,omitempty" require:"true" maxLength:"100"`
	// 快递单号
	CourierNumber *string `json:"courier_number,omitempty" xml:"courier_number,omitempty" require:"true" maxLength:"100"`
	// 货物大类
	CargoType *string `json:"cargo_type,omitempty" xml:"cargo_type,omitempty" require:"true" maxLength:"256"`
	// 货物总数量（件）
	CargoTotalQuantity *string `json:"cargo_total_quantity,omitempty" xml:"cargo_total_quantity,omitempty" require:"true" maxLength:"100"`
	// 货物总重量
	CargoTotalWeight *string `json:"cargo_total_weight,omitempty" xml:"cargo_total_weight,omitempty" require:"true" maxLength:"200"`
	// 货物总价值，小数位只支持2位
	CargoTotalWorth *string `json:"cargo_total_worth,omitempty" xml:"cargo_total_worth,omitempty" require:"true" maxLength:"20"`
	// 卖家脱敏唯一标识
	SellId *string `json:"sell_id,omitempty" xml:"sell_id,omitempty" require:"true" maxLength:"100"`
	// 卖家NAIC代码
	SellNaicCode *string `json:"sell_naic_code,omitempty" xml:"sell_naic_code,omitempty" require:"true" maxLength:"50"`
	// 出发地ISO国别
	StartPlaceIsoCountry *string `json:"start_place_iso_country,omitempty" xml:"start_place_iso_country,omitempty" require:"true" maxLength:"10"`
	// 出发地省市
	StartPlaceProvinceCity *string `json:"start_place_province_city,omitempty" xml:"start_place_province_city,omitempty" require:"true" maxLength:"50"`
	// 出发地详细地址
	StartPlace *string `json:"start_place,omitempty" xml:"start_place,omitempty" require:"true" maxLength:"500"`
	// 出发地邮编
	StartPlacePostcode *string `json:"start_place_postcode,omitempty" xml:"start_place_postcode,omitempty" require:"true" maxLength:"50"`
	// 买家脱敏唯一标识
	BuyId *string `json:"buy_id,omitempty" xml:"buy_id,omitempty" require:"true" maxLength:"100"`
	// 目的地ISO国别
	IsoCountry *string `json:"iso_country,omitempty" xml:"iso_country,omitempty" require:"true" maxLength:"10"`
	// 湖南省长沙市
	DestinationProvinceCity *string `json:"destination_province_city,omitempty" xml:"destination_province_city,omitempty" require:"true" maxLength:"50"`
	// 目的地详细地址
	Destination *string `json:"destination,omitempty" xml:"destination,omitempty" require:"true" maxLength:"500"`
	// 货物明细
	CargoDetails *CargoDetails `json:"cargo_details,omitempty" xml:"cargo_details,omitempty" require:"true"`
}

func (s ApplyInsurglobifyprodOspiinsureRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyInsurglobifyprodOspiinsureRequest) GoString() string {
	return s.String()
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetAuthToken(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetProductInstanceId(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetTradeNo(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.TradeNo = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetExternalChannelCode(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.ExternalChannelCode = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetExternalProductCode(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.ExternalProductCode = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetChSchemeName(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.ChSchemeName = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetChProjectName(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.ChProjectName = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetInsuredAmount(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.InsuredAmount = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetPremium(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.Premium = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetTotalPremium(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.TotalPremium = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetCurrency(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.Currency = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetBigPolNo(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.BigPolNo = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetInsureStart(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.InsureStart = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetTimeZone(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.TimeZone = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetTbrName(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.TbrName = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetTbrIdType(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.TbrIdType = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetTbrIdNo(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.TbrIdNo = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetBbrName(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.BbrName = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetBbrIdType(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.BbrIdType = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetBbrIdNo(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.BbrIdNo = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetRelaOrderNo(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.RelaOrderNo = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetPickUpTime(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.PickUpTime = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetCourierCompany(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.CourierCompany = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetCourierNumber(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.CourierNumber = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetCargoType(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.CargoType = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetCargoTotalQuantity(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.CargoTotalQuantity = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetCargoTotalWeight(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.CargoTotalWeight = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetCargoTotalWorth(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.CargoTotalWorth = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetSellId(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.SellId = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetSellNaicCode(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.SellNaicCode = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetStartPlaceIsoCountry(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.StartPlaceIsoCountry = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetStartPlaceProvinceCity(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.StartPlaceProvinceCity = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetStartPlace(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.StartPlace = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetStartPlacePostcode(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.StartPlacePostcode = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetBuyId(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.BuyId = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetIsoCountry(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.IsoCountry = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetDestinationProvinceCity(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.DestinationProvinceCity = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetDestination(v string) *ApplyInsurglobifyprodOspiinsureRequest {
	s.Destination = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureRequest) SetCargoDetails(v *CargoDetails) *ApplyInsurglobifyprodOspiinsureRequest {
	s.CargoDetails = v
	return s
}

type ApplyInsurglobifyprodOspiinsureResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易流水号
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
}

func (s ApplyInsurglobifyprodOspiinsureResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyInsurglobifyprodOspiinsureResponse) GoString() string {
	return s.String()
}

func (s *ApplyInsurglobifyprodOspiinsureResponse) SetReqMsgId(v string) *ApplyInsurglobifyprodOspiinsureResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureResponse) SetResultCode(v string) *ApplyInsurglobifyprodOspiinsureResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureResponse) SetResultMsg(v string) *ApplyInsurglobifyprodOspiinsureResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiinsureResponse) SetTradeNo(v string) *ApplyInsurglobifyprodOspiinsureResponse {
	s.TradeNo = &v
	return s
}

type ApplyInsurglobifyprodOspiclaimRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 调用方生成的唯一编码，系统会根据该流水号做防重、幂等判断逻辑。当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty" require:"true" maxLength:"50"`
	// 保司编码
	ExternalChannelCode *string `json:"external_channel_code,omitempty" xml:"external_channel_code,omitempty" require:"true" maxLength:"10"`
	// 险种编码
	ExternalProductCode *string `json:"external_product_code,omitempty" xml:"external_product_code,omitempty" require:"true" maxLength:"10"`
	// 大保单号
	BigPolNo *string `json:"big_pol_no,omitempty" xml:"big_pol_no,omitempty" require:"true" maxLength:"100"`
	// 投保订单号
	RelaOrderNo *string `json:"rela_order_no,omitempty" xml:"rela_order_no,omitempty" require:"true" maxLength:"100"`
	// 受损货物名称
	DamagedCargoName *string `json:"damaged_cargo_name,omitempty" xml:"damaged_cargo_name,omitempty" require:"true" maxLength:"100"`
	// 出险原因
	IncidentCause *string `json:"incident_cause,omitempty" xml:"incident_cause,omitempty" require:"true" maxLength:"50"`
	// 出险日期(ISO 8601格式，2026-01-11T14:30:00+02:00)
	AccidentTime *string `json:"accident_time,omitempty" xml:"accident_time,omitempty" require:"true" maxLength:"50"`
	// 销售日期(ISO 8601格式，2026-01-11T14:30:00+02:00)
	SaleDate *string `json:"sale_date,omitempty" xml:"sale_date,omitempty" require:"true" maxLength:"50"`
	// 时区
	// Asia/Shanghai
	// Europe/Berlin
	// America/New_York
	// Pacific/Auckland
	// Europe/Berlin
	TimeZone *string `json:"time_zone,omitempty" xml:"time_zone,omitempty" require:"true" maxLength:"20"`
	// 索赔状态（Open / Under Review / In Payment Process / Closed / Rejected / Cancelled）
	ClaimStatus *string `json:"claim_status,omitempty" xml:"claim_status,omitempty" require:"true" maxLength:"20"`
	// 货物大类
	CargoType *string `json:"cargo_type,omitempty" xml:"cargo_type,omitempty" require:"true" maxLength:"256"`
	// 平台赔付日期(ISO 8601格式，2026-01-11T14:30:00+02:00)
	ClaimPaidTime *string `json:"claim_paid_time,omitempty" xml:"claim_paid_time,omitempty" require:"true" maxLength:"50"`
	// 索赔类别(Valid / Fraudulent / Invalid
	ClaimCategory *string `json:"claim_category,omitempty" xml:"claim_category,omitempty" require:"true" maxLength:"20"`
	// 索赔被拒原因
	ClaimPaidDesc *string `json:"claim_paid_desc,omitempty" xml:"claim_paid_desc,omitempty" require:"true" maxLength:"256"`
	// 索赔总金额，小数位只支持2位
	ClaimPaidAmount *string `json:"claim_paid_amount,omitempty" xml:"claim_paid_amount,omitempty" require:"true" maxLength:"20"`
	// 币种，使用ISO 4217代码；
	// CNY：人民币
	// USD：美元
	// EUR：欧元
	// GBP：英镑
	// JPY：日元
	// CHF：瑞士法郎
	// SGD：新加坡元
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty" require:"true" minLength:"3"`
	// 索赔事件类型(Loss / Theft / Breakage / Non-Delivery）
	ClaimIncidentType *string `json:"claim_incident_type,omitempty" xml:"claim_incident_type,omitempty" require:"true" maxLength:"20"`
	// 索赔事件详情情况
	ClaimVerdictDesc *string `json:"claim_verdict_desc,omitempty" xml:"claim_verdict_desc,omitempty" require:"true" maxLength:"526"`
}

func (s ApplyInsurglobifyprodOspiclaimRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyInsurglobifyprodOspiclaimRequest) GoString() string {
	return s.String()
}

func (s *ApplyInsurglobifyprodOspiclaimRequest) SetAuthToken(v string) *ApplyInsurglobifyprodOspiclaimRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiclaimRequest) SetProductInstanceId(v string) *ApplyInsurglobifyprodOspiclaimRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiclaimRequest) SetTradeNo(v string) *ApplyInsurglobifyprodOspiclaimRequest {
	s.TradeNo = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiclaimRequest) SetExternalChannelCode(v string) *ApplyInsurglobifyprodOspiclaimRequest {
	s.ExternalChannelCode = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiclaimRequest) SetExternalProductCode(v string) *ApplyInsurglobifyprodOspiclaimRequest {
	s.ExternalProductCode = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiclaimRequest) SetBigPolNo(v string) *ApplyInsurglobifyprodOspiclaimRequest {
	s.BigPolNo = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiclaimRequest) SetRelaOrderNo(v string) *ApplyInsurglobifyprodOspiclaimRequest {
	s.RelaOrderNo = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiclaimRequest) SetDamagedCargoName(v string) *ApplyInsurglobifyprodOspiclaimRequest {
	s.DamagedCargoName = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiclaimRequest) SetIncidentCause(v string) *ApplyInsurglobifyprodOspiclaimRequest {
	s.IncidentCause = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiclaimRequest) SetAccidentTime(v string) *ApplyInsurglobifyprodOspiclaimRequest {
	s.AccidentTime = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiclaimRequest) SetSaleDate(v string) *ApplyInsurglobifyprodOspiclaimRequest {
	s.SaleDate = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiclaimRequest) SetTimeZone(v string) *ApplyInsurglobifyprodOspiclaimRequest {
	s.TimeZone = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiclaimRequest) SetClaimStatus(v string) *ApplyInsurglobifyprodOspiclaimRequest {
	s.ClaimStatus = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiclaimRequest) SetCargoType(v string) *ApplyInsurglobifyprodOspiclaimRequest {
	s.CargoType = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiclaimRequest) SetClaimPaidTime(v string) *ApplyInsurglobifyprodOspiclaimRequest {
	s.ClaimPaidTime = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiclaimRequest) SetClaimCategory(v string) *ApplyInsurglobifyprodOspiclaimRequest {
	s.ClaimCategory = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiclaimRequest) SetClaimPaidDesc(v string) *ApplyInsurglobifyprodOspiclaimRequest {
	s.ClaimPaidDesc = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiclaimRequest) SetClaimPaidAmount(v string) *ApplyInsurglobifyprodOspiclaimRequest {
	s.ClaimPaidAmount = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiclaimRequest) SetCurrency(v string) *ApplyInsurglobifyprodOspiclaimRequest {
	s.Currency = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiclaimRequest) SetClaimIncidentType(v string) *ApplyInsurglobifyprodOspiclaimRequest {
	s.ClaimIncidentType = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiclaimRequest) SetClaimVerdictDesc(v string) *ApplyInsurglobifyprodOspiclaimRequest {
	s.ClaimVerdictDesc = &v
	return s
}

type ApplyInsurglobifyprodOspiclaimResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易流水号
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
}

func (s ApplyInsurglobifyprodOspiclaimResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyInsurglobifyprodOspiclaimResponse) GoString() string {
	return s.String()
}

func (s *ApplyInsurglobifyprodOspiclaimResponse) SetReqMsgId(v string) *ApplyInsurglobifyprodOspiclaimResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiclaimResponse) SetResultCode(v string) *ApplyInsurglobifyprodOspiclaimResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiclaimResponse) SetResultMsg(v string) *ApplyInsurglobifyprodOspiclaimResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyInsurglobifyprodOspiclaimResponse) SetTradeNo(v string) *ApplyInsurglobifyprodOspiclaimResponse {
	s.TradeNo = &v
	return s
}

type UploadInsurglobifyprodMonthlypremiumbillRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 调用方生成的唯一编码，系统会根据该流水号做防重、幂等判断逻辑。当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty" require:"true" maxLength:"50"`
	// 保司编码
	ExternalChannelCode *string `json:"external_channel_code,omitempty" xml:"external_channel_code,omitempty" require:"true" maxLength:"10"`
	// 险种编码
	ExternalProductCode *string `json:"external_product_code,omitempty" xml:"external_product_code,omitempty" require:"true" maxLength:"10"`
	// 保险方案名
	ChSchemeName *string `json:"ch_scheme_name,omitempty" xml:"ch_scheme_name,omitempty" require:"true" maxLength:"20"`
	// 关联的大保单号
	BigPolNo *string `json:"big_pol_no,omitempty" xml:"big_pol_no,omitempty" require:"true" maxLength:"100"`
	// 账单年度
	BillingYear *string `json:"billing_year,omitempty" xml:"billing_year,omitempty" require:"true" maxLength:"4"`
	// 账单月份
	BillingMonth *string `json:"billing_month,omitempty" xml:"billing_month,omitempty" require:"true" maxLength:"2"`
	// 包裹总数
	PackageCount *string `json:"package_count,omitempty" xml:"package_count,omitempty" require:"true" maxLength:"256"`
	// 净保费，小数位只支持2位
	Premium *string `json:"premium,omitempty" xml:"premium,omitempty" require:"true" maxLength:"20"`
	// 税费，小数位只支持2位
	TaxaAmount *string `json:"taxa_amount,omitempty" xml:"taxa_amount,omitempty" require:"true" maxLength:"20"`
	// 总保费（含税费），小数位只支持2位
	TotalPremium *string `json:"total_premium,omitempty" xml:"total_premium,omitempty" require:"true" maxLength:"20"`
	// 币种，使用ISO 4217代码；
	// CNY：人民币
	// USD：美元
	// EUR：欧元
	// GBP：英镑
	// JPY：日元
	// CHF：瑞士法郎
	// SGD：新加坡元
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty" require:"true" maxLength:"3"`
}

func (s UploadInsurglobifyprodMonthlypremiumbillRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadInsurglobifyprodMonthlypremiumbillRequest) GoString() string {
	return s.String()
}

func (s *UploadInsurglobifyprodMonthlypremiumbillRequest) SetAuthToken(v string) *UploadInsurglobifyprodMonthlypremiumbillRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadInsurglobifyprodMonthlypremiumbillRequest) SetProductInstanceId(v string) *UploadInsurglobifyprodMonthlypremiumbillRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadInsurglobifyprodMonthlypremiumbillRequest) SetTradeNo(v string) *UploadInsurglobifyprodMonthlypremiumbillRequest {
	s.TradeNo = &v
	return s
}

func (s *UploadInsurglobifyprodMonthlypremiumbillRequest) SetExternalChannelCode(v string) *UploadInsurglobifyprodMonthlypremiumbillRequest {
	s.ExternalChannelCode = &v
	return s
}

func (s *UploadInsurglobifyprodMonthlypremiumbillRequest) SetExternalProductCode(v string) *UploadInsurglobifyprodMonthlypremiumbillRequest {
	s.ExternalProductCode = &v
	return s
}

func (s *UploadInsurglobifyprodMonthlypremiumbillRequest) SetChSchemeName(v string) *UploadInsurglobifyprodMonthlypremiumbillRequest {
	s.ChSchemeName = &v
	return s
}

func (s *UploadInsurglobifyprodMonthlypremiumbillRequest) SetBigPolNo(v string) *UploadInsurglobifyprodMonthlypremiumbillRequest {
	s.BigPolNo = &v
	return s
}

func (s *UploadInsurglobifyprodMonthlypremiumbillRequest) SetBillingYear(v string) *UploadInsurglobifyprodMonthlypremiumbillRequest {
	s.BillingYear = &v
	return s
}

func (s *UploadInsurglobifyprodMonthlypremiumbillRequest) SetBillingMonth(v string) *UploadInsurglobifyprodMonthlypremiumbillRequest {
	s.BillingMonth = &v
	return s
}

func (s *UploadInsurglobifyprodMonthlypremiumbillRequest) SetPackageCount(v string) *UploadInsurglobifyprodMonthlypremiumbillRequest {
	s.PackageCount = &v
	return s
}

func (s *UploadInsurglobifyprodMonthlypremiumbillRequest) SetPremium(v string) *UploadInsurglobifyprodMonthlypremiumbillRequest {
	s.Premium = &v
	return s
}

func (s *UploadInsurglobifyprodMonthlypremiumbillRequest) SetTaxaAmount(v string) *UploadInsurglobifyprodMonthlypremiumbillRequest {
	s.TaxaAmount = &v
	return s
}

func (s *UploadInsurglobifyprodMonthlypremiumbillRequest) SetTotalPremium(v string) *UploadInsurglobifyprodMonthlypremiumbillRequest {
	s.TotalPremium = &v
	return s
}

func (s *UploadInsurglobifyprodMonthlypremiumbillRequest) SetCurrency(v string) *UploadInsurglobifyprodMonthlypremiumbillRequest {
	s.Currency = &v
	return s
}

type UploadInsurglobifyprodMonthlypremiumbillResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易流水号
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
}

func (s UploadInsurglobifyprodMonthlypremiumbillResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadInsurglobifyprodMonthlypremiumbillResponse) GoString() string {
	return s.String()
}

func (s *UploadInsurglobifyprodMonthlypremiumbillResponse) SetReqMsgId(v string) *UploadInsurglobifyprodMonthlypremiumbillResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadInsurglobifyprodMonthlypremiumbillResponse) SetResultCode(v string) *UploadInsurglobifyprodMonthlypremiumbillResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadInsurglobifyprodMonthlypremiumbillResponse) SetResultMsg(v string) *UploadInsurglobifyprodMonthlypremiumbillResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadInsurglobifyprodMonthlypremiumbillResponse) SetTradeNo(v string) *UploadInsurglobifyprodMonthlypremiumbillResponse {
	s.TradeNo = &v
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
				"sdk_version":      tea.String("1.0.4"),
				"_prod_code":       tea.String("INSURANCE_SAAS_DE"),
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

/**
 * Description: 海外邮包险投保
 * Summary: 海外邮包险投保
 */
func (client *Client) ApplyInsurglobifyprodOspiinsure(request *ApplyInsurglobifyprodOspiinsureRequest) (_result *ApplyInsurglobifyprodOspiinsureResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyInsurglobifyprodOspiinsureResponse{}
	_body, _err := client.ApplyInsurglobifyprodOspiinsureEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 海外邮包险投保
 * Summary: 海外邮包险投保
 */
func (client *Client) ApplyInsurglobifyprodOspiinsureEx(request *ApplyInsurglobifyprodOspiinsureRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyInsurglobifyprodOspiinsureResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyInsurglobifyprodOspiinsureResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.insurancesaasde.insurglobifyprod.ospiinsure.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 海外邮包险理赔
 * Summary: 海外邮包险理赔
 */
func (client *Client) ApplyInsurglobifyprodOspiclaim(request *ApplyInsurglobifyprodOspiclaimRequest) (_result *ApplyInsurglobifyprodOspiclaimResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyInsurglobifyprodOspiclaimResponse{}
	_body, _err := client.ApplyInsurglobifyprodOspiclaimEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 海外邮包险理赔
 * Summary: 海外邮包险理赔
 */
func (client *Client) ApplyInsurglobifyprodOspiclaimEx(request *ApplyInsurglobifyprodOspiclaimRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyInsurglobifyprodOspiclaimResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyInsurglobifyprodOspiclaimResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.insurancesaasde.insurglobifyprod.ospiclaim.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 月度保费账单上传
 * Summary: 月度保费账单上传
 */
func (client *Client) UploadInsurglobifyprodMonthlypremiumbill(request *UploadInsurglobifyprodMonthlypremiumbillRequest) (_result *UploadInsurglobifyprodMonthlypremiumbillResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadInsurglobifyprodMonthlypremiumbillResponse{}
	_body, _err := client.UploadInsurglobifyprodMonthlypremiumbillEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 月度保费账单上传
 * Summary: 月度保费账单上传
 */
func (client *Client) UploadInsurglobifyprodMonthlypremiumbillEx(request *UploadInsurglobifyprodMonthlypremiumbillRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadInsurglobifyprodMonthlypremiumbillResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadInsurglobifyprodMonthlypremiumbillResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.insurancesaasde.insurglobifyprod.monthlypremiumbill.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
