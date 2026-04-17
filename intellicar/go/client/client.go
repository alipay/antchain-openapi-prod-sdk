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

// 高德潜客uv指数
type GdCustomerUv struct {
	// uv指数数量
	Total *int64 `json:"total,omitempty" xml:"total,omitempty" require:"true"`
	// uv指数数量
	Count *int64 `json:"count,omitempty" xml:"count,omitempty" require:"true"`
	// uv指数排序
	//
	Sort *int64 `json:"sort,omitempty" xml:"sort,omitempty" require:"true"`
}

func (s GdCustomerUv) String() string {
	return tea.Prettify(s)
}

func (s GdCustomerUv) GoString() string {
	return s.String()
}

func (s *GdCustomerUv) SetTotal(v int64) *GdCustomerUv {
	s.Total = &v
	return s
}

func (s *GdCustomerUv) SetCount(v int64) *GdCustomerUv {
	s.Count = &v
	return s
}

func (s *GdCustomerUv) SetSort(v int64) *GdCustomerUv {
	s.Sort = &v
	return s
}

// 高德潜客record重叠指数pv指数
type GdCustomerPv struct {
	// 重叠指数pv历史指数数量（时间类型为季度、半年、年时，不展示）
	Total *int64 `json:"total,omitempty" xml:"total,omitempty" require:"true"`
	// 重叠指数pv指数数量
	Count *int64 `json:"count,omitempty" xml:"count,omitempty" require:"true"`
	// 重叠指数pv指数排序
	Sort *int64 `json:"sort,omitempty" xml:"sort,omitempty" require:"true"`
}

func (s GdCustomerPv) String() string {
	return tea.Prettify(s)
}

func (s GdCustomerPv) GoString() string {
	return s.String()
}

func (s *GdCustomerPv) SetTotal(v int64) *GdCustomerPv {
	s.Total = &v
	return s
}

func (s *GdCustomerPv) SetCount(v int64) *GdCustomerPv {
	s.Count = &v
	return s
}

func (s *GdCustomerPv) SetSort(v int64) *GdCustomerPv {
	s.Sort = &v
	return s
}

// 高德流出指数
type GdDest struct {
	// 流出指数uv指数
	Uv *GdCustomerUv `json:"uv,omitempty" xml:"uv,omitempty" require:"true"`
	// 流出指数pv指数
	Pv *GdCustomerPv `json:"pv,omitempty" xml:"pv,omitempty" require:"true"`
	// 流出品牌id
	BrandId *string `json:"brand_id,omitempty" xml:"brand_id,omitempty" require:"true"`
	// 流出店铺id，数据类型为店铺时返回该属性与值
	ShopId *string `json:"shop_id,omitempty" xml:"shop_id,omitempty"`
	// 城市编码，数据类型为店铺或者城市时返回该属性与值
	Citycode *string `json:"citycode,omitempty" xml:"citycode,omitempty"`
	// 省份编码，数据类型为省份时返回该属性与值
	Pcode *string `json:"pcode,omitempty" xml:"pcode,omitempty"`
	// 数据类型为全国时返回该属性与值
	Countrycode *string `json:"countrycode,omitempty" xml:"countrycode,omitempty"`
}

func (s GdDest) String() string {
	return tea.Prettify(s)
}

func (s GdDest) GoString() string {
	return s.String()
}

func (s *GdDest) SetUv(v *GdCustomerUv) *GdDest {
	s.Uv = v
	return s
}

func (s *GdDest) SetPv(v *GdCustomerPv) *GdDest {
	s.Pv = v
	return s
}

func (s *GdDest) SetBrandId(v string) *GdDest {
	s.BrandId = &v
	return s
}

func (s *GdDest) SetShopId(v string) *GdDest {
	s.ShopId = &v
	return s
}

func (s *GdDest) SetCitycode(v string) *GdDest {
	s.Citycode = &v
	return s
}

func (s *GdDest) SetPcode(v string) *GdDest {
	s.Pcode = &v
	return s
}

func (s *GdDest) SetCountrycode(v string) *GdDest {
	s.Countrycode = &v
	return s
}

// 高德潜客record流入指数
type GdSrc struct {
	// 流入指数uv指数
	Uv *GdCustomerUv `json:"uv,omitempty" xml:"uv,omitempty" require:"true"`
	// 流入指数pv指数
	Pv *GdCustomerPv `json:"pv,omitempty" xml:"pv,omitempty" require:"true"`
	// 流入品牌id
	BrandId *string `json:"brand_id,omitempty" xml:"brand_id,omitempty" require:"true"`
	// 流入店铺id，数据类型为店铺时返回该属性与值
	ShopId *string `json:"shop_id,omitempty" xml:"shop_id,omitempty"`
	// 流入城市编码，数据类型为店铺或者城市时返回该属性与值
	Citycode *string `json:"citycode,omitempty" xml:"citycode,omitempty"`
	// 省份编码，数据类型为省份时返回该属性与值
	Pcode *string `json:"pcode,omitempty" xml:"pcode,omitempty"`
	// 数据类型为全国时返回该属性与值
	Countrycode *string `json:"countrycode,omitempty" xml:"countrycode,omitempty"`
}

func (s GdSrc) String() string {
	return tea.Prettify(s)
}

func (s GdSrc) GoString() string {
	return s.String()
}

func (s *GdSrc) SetUv(v *GdCustomerUv) *GdSrc {
	s.Uv = v
	return s
}

func (s *GdSrc) SetPv(v *GdCustomerPv) *GdSrc {
	s.Pv = v
	return s
}

func (s *GdSrc) SetBrandId(v string) *GdSrc {
	s.BrandId = &v
	return s
}

func (s *GdSrc) SetShopId(v string) *GdSrc {
	s.ShopId = &v
	return s
}

func (s *GdSrc) SetCitycode(v string) *GdSrc {
	s.Citycode = &v
	return s
}

func (s *GdSrc) SetPcode(v string) *GdSrc {
	s.Pcode = &v
	return s
}

func (s *GdSrc) SetCountrycode(v string) *GdSrc {
	s.Countrycode = &v
	return s
}

// 高德潜客record重叠指数
type Overlap struct {
	// 重叠指数uv指数
	Uv *GdCustomerUv `json:"uv,omitempty" xml:"uv,omitempty" require:"true"`
	// 重叠指数pv指数
	Pv *GdCustomerPv `json:"pv,omitempty" xml:"pv,omitempty" require:"true"`
	// 重叠品牌id
	BrandId *string `json:"brand_id,omitempty" xml:"brand_id,omitempty" require:"true"`
	// 重叠店铺id，数据类型为店铺时返回该属性与值
	ShopId *string `json:"shop_id,omitempty" xml:"shop_id,omitempty"`
	// 重叠城市编码，数据类型为城市时返回该属性与值
	Citycode *string `json:"citycode,omitempty" xml:"citycode,omitempty"`
	// 重叠省份编码，数据类型为省份时返回该属性与值
	Pcode *string `json:"pcode,omitempty" xml:"pcode,omitempty"`
	// 数据类型为全国时返回该属性与值
	Countrycode *string `json:"countrycode,omitempty" xml:"countrycode,omitempty"`
}

func (s Overlap) String() string {
	return tea.Prettify(s)
}

func (s Overlap) GoString() string {
	return s.String()
}

func (s *Overlap) SetUv(v *GdCustomerUv) *Overlap {
	s.Uv = v
	return s
}

func (s *Overlap) SetPv(v *GdCustomerPv) *Overlap {
	s.Pv = v
	return s
}

func (s *Overlap) SetBrandId(v string) *Overlap {
	s.BrandId = &v
	return s
}

func (s *Overlap) SetShopId(v string) *Overlap {
	s.ShopId = &v
	return s
}

func (s *Overlap) SetCitycode(v string) *Overlap {
	s.Citycode = &v
	return s
}

func (s *Overlap) SetPcode(v string) *Overlap {
	s.Pcode = &v
	return s
}

func (s *Overlap) SetCountrycode(v string) *Overlap {
	s.Countrycode = &v
	return s
}

// 品牌信息
type LetterInfo struct {
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
}

func (s LetterInfo) String() string {
	return tea.Prettify(s)
}

func (s LetterInfo) GoString() string {
	return s.String()
}

func (s *LetterInfo) SetName(v string) *LetterInfo {
	s.Name = &v
	return s
}

func (s *LetterInfo) SetId(v string) *LetterInfo {
	s.Id = &v
	return s
}

// 用户信息
type CarUserInfo struct {
	// 唯一标识用户的id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 手机号
	PhoneNum *string `json:"phone_num,omitempty" xml:"phone_num,omitempty" require:"true"`
	// 城市编码
	CityCode *string `json:"city_code,omitempty" xml:"city_code,omitempty" require:"true"`
	// 姓名
	UserCertName *string `json:"user_cert_name,omitempty" xml:"user_cert_name,omitempty"`
	// 证件号码
	UserCertNo *string `json:"user_cert_no,omitempty" xml:"user_cert_no,omitempty"`
	// 性别
	UserGender *string `json:"user_gender,omitempty" xml:"user_gender,omitempty"`
	// 昵称
	Nick *string `json:"nick,omitempty" xml:"nick,omitempty"`
}

func (s CarUserInfo) String() string {
	return tea.Prettify(s)
}

func (s CarUserInfo) GoString() string {
	return s.String()
}

func (s *CarUserInfo) SetUserId(v string) *CarUserInfo {
	s.UserId = &v
	return s
}

func (s *CarUserInfo) SetPhoneNum(v string) *CarUserInfo {
	s.PhoneNum = &v
	return s
}

func (s *CarUserInfo) SetCityCode(v string) *CarUserInfo {
	s.CityCode = &v
	return s
}

func (s *CarUserInfo) SetUserCertName(v string) *CarUserInfo {
	s.UserCertName = &v
	return s
}

func (s *CarUserInfo) SetUserCertNo(v string) *CarUserInfo {
	s.UserCertNo = &v
	return s
}

func (s *CarUserInfo) SetUserGender(v string) *CarUserInfo {
	s.UserGender = &v
	return s
}

func (s *CarUserInfo) SetNick(v string) *CarUserInfo {
	s.Nick = &v
	return s
}

// 城市列表
type SpecList struct {
	// 品牌Id
	BrandId *string `json:"brand_id,omitempty" xml:"brand_id,omitempty" require:"true"`
	// 品牌名称
	BrandName *string `json:"brand_name,omitempty" xml:"brand_name,omitempty" require:"true"`
	// 厂商id
	FactoryId *string `json:"factory_id,omitempty" xml:"factory_id,omitempty" require:"true"`
	// 厂商名称
	FactoryName *string `json:"factory_name,omitempty" xml:"factory_name,omitempty" require:"true"`
	// 车系id
	SeriesId *string `json:"series_id,omitempty" xml:"series_id,omitempty" require:"true"`
	// 车系名称
	SeriesName *string `json:"series_name,omitempty" xml:"series_name,omitempty" require:"true"`
	// 车型Id
	SpecId *string `json:"spec_id,omitempty" xml:"spec_id,omitempty" require:"true"`
	// 车型名称
	SpecName *string `json:"spec_name,omitempty" xml:"spec_name,omitempty" require:"true"`
}

func (s SpecList) String() string {
	return tea.Prettify(s)
}

func (s SpecList) GoString() string {
	return s.String()
}

func (s *SpecList) SetBrandId(v string) *SpecList {
	s.BrandId = &v
	return s
}

func (s *SpecList) SetBrandName(v string) *SpecList {
	s.BrandName = &v
	return s
}

func (s *SpecList) SetFactoryId(v string) *SpecList {
	s.FactoryId = &v
	return s
}

func (s *SpecList) SetFactoryName(v string) *SpecList {
	s.FactoryName = &v
	return s
}

func (s *SpecList) SetSeriesId(v string) *SpecList {
	s.SeriesId = &v
	return s
}

func (s *SpecList) SetSeriesName(v string) *SpecList {
	s.SeriesName = &v
	return s
}

func (s *SpecList) SetSpecId(v string) *SpecList {
	s.SpecId = &v
	return s
}

func (s *SpecList) SetSpecName(v string) *SpecList {
	s.SpecName = &v
	return s
}

// 高德店铺基本系返回record
type GdStoreRecord struct {
	// 店铺ID
	ShopId *string `json:"shop_id,omitempty" xml:"shop_id,omitempty" require:"true"`
	// 店铺名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 店铺地址
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true"`
	// 店铺所在省份
	Pname *string `json:"pname,omitempty" xml:"pname,omitempty" require:"true"`
	// 店铺所在城市
	Cityname *string `json:"cityname,omitempty" xml:"cityname,omitempty" require:"true"`
	// 品牌id
	BrandId *string `json:"brand_id,omitempty" xml:"brand_id,omitempty" require:"true"`
	// 品牌名称
	BrandName *string `json:"brand_name,omitempty" xml:"brand_name,omitempty" require:"true"`
	// 经销商代码
	OfficeCode *string `json:"office_code,omitempty" xml:"office_code,omitempty" require:"true"`
	// 经度
	Lon *string `json:"lon,omitempty" xml:"lon,omitempty" require:"true"`
	// 纬度
	Lat *string `json:"lat,omitempty" xml:"lat,omitempty" require:"true"`
	// 店铺数据版本集合
	VersionList []*string `json:"version_list,omitempty" xml:"version_list,omitempty" require:"true" type:"Repeated"`
}

func (s GdStoreRecord) String() string {
	return tea.Prettify(s)
}

func (s GdStoreRecord) GoString() string {
	return s.String()
}

func (s *GdStoreRecord) SetShopId(v string) *GdStoreRecord {
	s.ShopId = &v
	return s
}

func (s *GdStoreRecord) SetName(v string) *GdStoreRecord {
	s.Name = &v
	return s
}

func (s *GdStoreRecord) SetAddress(v string) *GdStoreRecord {
	s.Address = &v
	return s
}

func (s *GdStoreRecord) SetPname(v string) *GdStoreRecord {
	s.Pname = &v
	return s
}

func (s *GdStoreRecord) SetCityname(v string) *GdStoreRecord {
	s.Cityname = &v
	return s
}

func (s *GdStoreRecord) SetBrandId(v string) *GdStoreRecord {
	s.BrandId = &v
	return s
}

func (s *GdStoreRecord) SetBrandName(v string) *GdStoreRecord {
	s.BrandName = &v
	return s
}

func (s *GdStoreRecord) SetOfficeCode(v string) *GdStoreRecord {
	s.OfficeCode = &v
	return s
}

func (s *GdStoreRecord) SetLon(v string) *GdStoreRecord {
	s.Lon = &v
	return s
}

func (s *GdStoreRecord) SetLat(v string) *GdStoreRecord {
	s.Lat = &v
	return s
}

func (s *GdStoreRecord) SetVersionList(v []*string) *GdStoreRecord {
	s.VersionList = v
	return s
}

// 高德潜客指数record
type GdPotentialCustomerRecord struct {
	// uv指数
	Uv *GdCustomerUv `json:"uv,omitempty" xml:"uv,omitempty" require:"true"`
	// 城市编码，数据类型为店铺或者城市时返回该属性与值
	Citycode *string `json:"citycode,omitempty" xml:"citycode,omitempty"`
	// pv指数
	Pv *GdCustomerPv `json:"pv,omitempty" xml:"pv,omitempty" require:"true"`
	// 店铺id，数据类型为店铺时返回该属性与值
	ShopId *string `json:"shop_id,omitempty" xml:"shop_id,omitempty"`
	// 品牌id
	BrandId *string `json:"brand_id,omitempty" xml:"brand_id,omitempty" require:"true"`
	// 店铺数量（dataType!=SHOP时返回该字段）
	ShopNum *int64 `json:"shop_num,omitempty" xml:"shop_num,omitempty"`
	// 时间（时间类型为天时：yyyyMMdd；时间类型为周时：yyyyWW；时间类型为月时：yyyyMM）
	Time *string `json:"time,omitempty" xml:"time,omitempty" require:"true"`
	// 省份编码，数据类型为省份时返回该属性与值
	Pcode *string `json:"pcode,omitempty" xml:"pcode,omitempty"`
	// 数据类型为全国时返回该属性与值
	Countrycode *string `json:"countrycode,omitempty" xml:"countrycode,omitempty"`
}

func (s GdPotentialCustomerRecord) String() string {
	return tea.Prettify(s)
}

func (s GdPotentialCustomerRecord) GoString() string {
	return s.String()
}

func (s *GdPotentialCustomerRecord) SetUv(v *GdCustomerUv) *GdPotentialCustomerRecord {
	s.Uv = v
	return s
}

func (s *GdPotentialCustomerRecord) SetCitycode(v string) *GdPotentialCustomerRecord {
	s.Citycode = &v
	return s
}

func (s *GdPotentialCustomerRecord) SetPv(v *GdCustomerPv) *GdPotentialCustomerRecord {
	s.Pv = v
	return s
}

func (s *GdPotentialCustomerRecord) SetShopId(v string) *GdPotentialCustomerRecord {
	s.ShopId = &v
	return s
}

func (s *GdPotentialCustomerRecord) SetBrandId(v string) *GdPotentialCustomerRecord {
	s.BrandId = &v
	return s
}

func (s *GdPotentialCustomerRecord) SetShopNum(v int64) *GdPotentialCustomerRecord {
	s.ShopNum = &v
	return s
}

func (s *GdPotentialCustomerRecord) SetTime(v string) *GdPotentialCustomerRecord {
	s.Time = &v
	return s
}

func (s *GdPotentialCustomerRecord) SetPcode(v string) *GdPotentialCustomerRecord {
	s.Pcode = &v
	return s
}

func (s *GdPotentialCustomerRecord) SetCountrycode(v string) *GdPotentialCustomerRecord {
	s.Countrycode = &v
	return s
}

// 电池报告返回数据详情
type BatteryReportData struct {
	// VIN码
	VinCode *string `json:"vin_code,omitempty" xml:"vin_code,omitempty" require:"true"`
	// 评估时间，报告生成时间 yyyy-MM-dd HH:mm:ss
	EvaluateTime *string `json:"evaluate_time,omitempty" xml:"evaluate_time,omitempty" require:"true"`
	// 当前 SOH（%），数值 0-100
	CurrentSoh *string `json:"current_soh,omitempty" xml:"current_soh,omitempty" require:"true"`
	// SOH 评级：优秀 100-95 良好 95-90 中等 90-85 较差 85-80 差 80 以下
	SohLvStr *string `json:"soh_lv_str,omitempty" xml:"soh_lv_str,omitempty" require:"true"`
	// 电池衰退水平值
	VolumeScoreRecession *string `json:"volume_score_recession,omitempty" xml:"volume_score_recession,omitempty" require:"true"`
	// 安全风险水平：低 较低 较高 高
	VolumeScoreRecessionLvStr *string `json:"volume_score_recession_lv_str,omitempty" xml:"volume_score_recession_lv_str,omitempty" require:"true"`
	// 安全风险水平解读文案
	VolumeScoreRecessionNarrate *string `json:"volume_score_recession_narrate,omitempty" xml:"volume_score_recession_narrate,omitempty" require:"true"`
	// 保障状态 0：未保障 1：保障中 2：保障结束
	SafeguardStatus *int64 `json:"safeguard_status,omitempty" xml:"safeguard_status,omitempty" require:"true"`
	// 保障截止期 yyyy-MM-dd HH:mm:ss
	SafeguardEndTime *string `json:"safeguard_end_time,omitempty" xml:"safeguard_end_time,omitempty" require:"true"`
	// 本轮首检 SOH（%）数值 0-100
	InitialSoh *string `json:"initial_soh,omitempty" xml:"initial_soh,omitempty" require:"true"`
	// 本轮首检 评估时间 yyyy-MM-dd HH:mm:ss
	InitialSohEvaluateTime *string `json:"initial_soh_evaluate_time,omitempty" xml:"initial_soh_evaluate_time,omitempty" require:"true"`
	// 本轮首检 充电单号
	InitialChargeSeq *string `json:"initial_charge_seq,omitempty" xml:"initial_charge_seq,omitempty" require:"true"`
	// 触发赔付 SOH（%），数值 0-100
	SageguardMaxSubSoh *string `json:"sageguard_max_sub_soh,omitempty" xml:"sageguard_max_sub_soh,omitempty" require:"true"`
	// 是否触发赔付，当前 SOH≤触发赔付 SOH 时为 true
	CompensationTriggered *bool `json:"compensation_triggered,omitempty" xml:"compensation_triggered,omitempty" require:"true"`
	// SOH 衰退预测-X 轴标题（年）
	YearSohTitle []*string `json:"year_soh_title,omitempty" xml:"year_soh_title,omitempty" require:"true" type:"Repeated"`
	// 本车电池衰退预测，逐年 SOH（%）
	CurEstimateYearSoh []*string `json:"cur_estimate_year_soh,omitempty" xml:"cur_estimate_year_soh,omitempty" require:"true" type:"Repeated"`
	// 同类型车电池衰退预测，逐年 SOH（%）
	PeerEstimateYearSoh []*string `json:"peer_estimate_year_soh,omitempty" xml:"peer_estimate_year_soh,omitempty" require:"true" type:"Repeated"`
	// 电池厂商
	BatteryManufacturer *string `json:"battery_manufacturer,omitempty" xml:"battery_manufacturer,omitempty" require:"true"`
	// 标称能量，单位 kWh
	NominalEnergy *string `json:"nominal_energy,omitempty" xml:"nominal_energy,omitempty" require:"true"`
	// 标称容量，单位 Ah
	RateCapacity *string `json:"rate_capacity,omitempty" xml:"rate_capacity,omitempty" require:"true"`
	// 电池类型
	BatteryType *string `json:"battery_type,omitempty" xml:"battery_type,omitempty" require:"true"`
	// 车辆生产年份
	ManufacturerDate *string `json:"manufacturer_date,omitempty" xml:"manufacturer_date,omitempty" require:"true"`
	// 权益说明文案
	RightsDesc *string `json:"rights_desc,omitempty" xml:"rights_desc,omitempty" require:"true"`
	// 权益说明-状态
	RightStatus *string `json:"right_status,omitempty" xml:"right_status,omitempty" require:"true"`
	// 电池健康度-建议
	SohSuggest []*string `json:"soh_suggest,omitempty" xml:"soh_suggest,omitempty" require:"true" type:"Repeated"`
}

func (s BatteryReportData) String() string {
	return tea.Prettify(s)
}

func (s BatteryReportData) GoString() string {
	return s.String()
}

func (s *BatteryReportData) SetVinCode(v string) *BatteryReportData {
	s.VinCode = &v
	return s
}

func (s *BatteryReportData) SetEvaluateTime(v string) *BatteryReportData {
	s.EvaluateTime = &v
	return s
}

func (s *BatteryReportData) SetCurrentSoh(v string) *BatteryReportData {
	s.CurrentSoh = &v
	return s
}

func (s *BatteryReportData) SetSohLvStr(v string) *BatteryReportData {
	s.SohLvStr = &v
	return s
}

func (s *BatteryReportData) SetVolumeScoreRecession(v string) *BatteryReportData {
	s.VolumeScoreRecession = &v
	return s
}

func (s *BatteryReportData) SetVolumeScoreRecessionLvStr(v string) *BatteryReportData {
	s.VolumeScoreRecessionLvStr = &v
	return s
}

func (s *BatteryReportData) SetVolumeScoreRecessionNarrate(v string) *BatteryReportData {
	s.VolumeScoreRecessionNarrate = &v
	return s
}

func (s *BatteryReportData) SetSafeguardStatus(v int64) *BatteryReportData {
	s.SafeguardStatus = &v
	return s
}

func (s *BatteryReportData) SetSafeguardEndTime(v string) *BatteryReportData {
	s.SafeguardEndTime = &v
	return s
}

func (s *BatteryReportData) SetInitialSoh(v string) *BatteryReportData {
	s.InitialSoh = &v
	return s
}

func (s *BatteryReportData) SetInitialSohEvaluateTime(v string) *BatteryReportData {
	s.InitialSohEvaluateTime = &v
	return s
}

func (s *BatteryReportData) SetInitialChargeSeq(v string) *BatteryReportData {
	s.InitialChargeSeq = &v
	return s
}

func (s *BatteryReportData) SetSageguardMaxSubSoh(v string) *BatteryReportData {
	s.SageguardMaxSubSoh = &v
	return s
}

func (s *BatteryReportData) SetCompensationTriggered(v bool) *BatteryReportData {
	s.CompensationTriggered = &v
	return s
}

func (s *BatteryReportData) SetYearSohTitle(v []*string) *BatteryReportData {
	s.YearSohTitle = v
	return s
}

func (s *BatteryReportData) SetCurEstimateYearSoh(v []*string) *BatteryReportData {
	s.CurEstimateYearSoh = v
	return s
}

func (s *BatteryReportData) SetPeerEstimateYearSoh(v []*string) *BatteryReportData {
	s.PeerEstimateYearSoh = v
	return s
}

func (s *BatteryReportData) SetBatteryManufacturer(v string) *BatteryReportData {
	s.BatteryManufacturer = &v
	return s
}

func (s *BatteryReportData) SetNominalEnergy(v string) *BatteryReportData {
	s.NominalEnergy = &v
	return s
}

func (s *BatteryReportData) SetRateCapacity(v string) *BatteryReportData {
	s.RateCapacity = &v
	return s
}

func (s *BatteryReportData) SetBatteryType(v string) *BatteryReportData {
	s.BatteryType = &v
	return s
}

func (s *BatteryReportData) SetManufacturerDate(v string) *BatteryReportData {
	s.ManufacturerDate = &v
	return s
}

func (s *BatteryReportData) SetRightsDesc(v string) *BatteryReportData {
	s.RightsDesc = &v
	return s
}

func (s *BatteryReportData) SetRightStatus(v string) *BatteryReportData {
	s.RightStatus = &v
	return s
}

func (s *BatteryReportData) SetSohSuggest(v []*string) *BatteryReportData {
	s.SohSuggest = v
	return s
}

// 高德数据集合内record
type GdCustomersRecord struct {
	// 城市编码，数据类型为店铺或者城市时返回该属性与值
	Citycode *string `json:"citycode,omitempty" xml:"citycode,omitempty" require:"true"`
	// 品牌id
	BrandId *string `json:"brand_id,omitempty" xml:"brand_id,omitempty" require:"true"`
	// 店铺id，数据类型为店铺或者店铺品牌时返回该属性与值
	ShopId *string `json:"shop_id,omitempty" xml:"shop_id,omitempty" require:"true"`
	// 时间（时间类型为天时：yyyyMMdd；时间类型为周时：yyyyWW；时间类型为月时：yyyyMM）
	Time *string `json:"time,omitempty" xml:"time,omitempty" require:"true"`
	// 重叠指数集合
	OverlapList []*Overlap `json:"overlap_list,omitempty" xml:"overlap_list,omitempty" require:"true" type:"Repeated"`
	// 重叠指数集合条数
	OverlapListNum *string `json:"overlap_list_num,omitempty" xml:"overlap_list_num,omitempty" require:"true"`
	// 流入指数集合
	SrcList []*GdSrc `json:"src_list,omitempty" xml:"src_list,omitempty" require:"true" type:"Repeated"`
	// 流入指数条数
	SrcListNum *string `json:"src_list_num,omitempty" xml:"src_list_num,omitempty" require:"true"`
	// 流出指数集合
	DestList []*GdDest `json:"dest_list,omitempty" xml:"dest_list,omitempty" require:"true" type:"Repeated"`
	// 流出指数条数
	DestListNum *string `json:"dest_list_num,omitempty" xml:"dest_list_num,omitempty" require:"true"`
}

func (s GdCustomersRecord) String() string {
	return tea.Prettify(s)
}

func (s GdCustomersRecord) GoString() string {
	return s.String()
}

func (s *GdCustomersRecord) SetCitycode(v string) *GdCustomersRecord {
	s.Citycode = &v
	return s
}

func (s *GdCustomersRecord) SetBrandId(v string) *GdCustomersRecord {
	s.BrandId = &v
	return s
}

func (s *GdCustomersRecord) SetShopId(v string) *GdCustomersRecord {
	s.ShopId = &v
	return s
}

func (s *GdCustomersRecord) SetTime(v string) *GdCustomersRecord {
	s.Time = &v
	return s
}

func (s *GdCustomersRecord) SetOverlapList(v []*Overlap) *GdCustomersRecord {
	s.OverlapList = v
	return s
}

func (s *GdCustomersRecord) SetOverlapListNum(v string) *GdCustomersRecord {
	s.OverlapListNum = &v
	return s
}

func (s *GdCustomersRecord) SetSrcList(v []*GdSrc) *GdCustomersRecord {
	s.SrcList = v
	return s
}

func (s *GdCustomersRecord) SetSrcListNum(v string) *GdCustomersRecord {
	s.SrcListNum = &v
	return s
}

func (s *GdCustomersRecord) SetDestList(v []*GdDest) *GdCustomersRecord {
	s.DestList = v
	return s
}

func (s *GdCustomersRecord) SetDestListNum(v string) *GdCustomersRecord {
	s.DestListNum = &v
	return s
}

// 新车线索集合
type NewCarInfo struct {
	// 车系
	CarSeries *string `json:"car_series,omitempty" xml:"car_series,omitempty" require:"true"`
	// 金融方案
	FinaicalPlan *string `json:"finaical_plan,omitempty" xml:"finaical_plan,omitempty"`
	// 车系id
	CarSeriesId *string `json:"car_series_id,omitempty" xml:"car_series_id,omitempty"`
	// 请求提交唯一id
	SubmitId *string `json:"submit_id,omitempty" xml:"submit_id,omitempty"`
	// 预计购买时间
	PurcharseTime *string `json:"purcharse_time,omitempty" xml:"purcharse_time,omitempty"`
	// 用户信息
	UserInfo *CarUserInfo `json:"user_info,omitempty" xml:"user_info,omitempty" require:"true"`
	// 懂车帝或者汽车之家
	MatchSource *string `json:"match_source,omitempty" xml:"match_source,omitempty"`
	// 汽车之家车型id
	QcCarSeriesId *string `json:"qc_car_series_id,omitempty" xml:"qc_car_series_id,omitempty"`
}

func (s NewCarInfo) String() string {
	return tea.Prettify(s)
}

func (s NewCarInfo) GoString() string {
	return s.String()
}

func (s *NewCarInfo) SetCarSeries(v string) *NewCarInfo {
	s.CarSeries = &v
	return s
}

func (s *NewCarInfo) SetFinaicalPlan(v string) *NewCarInfo {
	s.FinaicalPlan = &v
	return s
}

func (s *NewCarInfo) SetCarSeriesId(v string) *NewCarInfo {
	s.CarSeriesId = &v
	return s
}

func (s *NewCarInfo) SetSubmitId(v string) *NewCarInfo {
	s.SubmitId = &v
	return s
}

func (s *NewCarInfo) SetPurcharseTime(v string) *NewCarInfo {
	s.PurcharseTime = &v
	return s
}

func (s *NewCarInfo) SetUserInfo(v *CarUserInfo) *NewCarInfo {
	s.UserInfo = v
	return s
}

func (s *NewCarInfo) SetMatchSource(v string) *NewCarInfo {
	s.MatchSource = &v
	return s
}

func (s *NewCarInfo) SetQcCarSeriesId(v string) *NewCarInfo {
	s.QcCarSeriesId = &v
	return s
}

// 电池衰退报告结果
type BatteryReportResult struct {
	// 订单号 (可使用该 ID 将报告转图片)
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 保障码，VIN 在 7 天内首次检测时生成，每轮保障采用同一保障码
	GuaranteeCode *string `json:"guarantee_code,omitempty" xml:"guarantee_code,omitempty" require:"true"`
	// 当前充电单号
	CurrentStartChargeSeq *string `json:"current_start_charge_seq,omitempty" xml:"current_start_charge_seq,omitempty" require:"true"`
	// 是否计费
	Charge *bool `json:"charge,omitempty" xml:"charge,omitempty" require:"true"`
	// 检测类型 6601：首检 6602：复核
	CheckType *int64 `json:"check_type,omitempty" xml:"check_type,omitempty" require:"true"`
	// 报告数据
	ReportData *BatteryReportData `json:"report_data,omitempty" xml:"report_data,omitempty" require:"true"`
}

func (s BatteryReportResult) String() string {
	return tea.Prettify(s)
}

func (s BatteryReportResult) GoString() string {
	return s.String()
}

func (s *BatteryReportResult) SetOrderId(v string) *BatteryReportResult {
	s.OrderId = &v
	return s
}

func (s *BatteryReportResult) SetGuaranteeCode(v string) *BatteryReportResult {
	s.GuaranteeCode = &v
	return s
}

func (s *BatteryReportResult) SetCurrentStartChargeSeq(v string) *BatteryReportResult {
	s.CurrentStartChargeSeq = &v
	return s
}

func (s *BatteryReportResult) SetCharge(v bool) *BatteryReportResult {
	s.Charge = &v
	return s
}

func (s *BatteryReportResult) SetCheckType(v int64) *BatteryReportResult {
	s.CheckType = &v
	return s
}

func (s *BatteryReportResult) SetReportData(v *BatteryReportData) *BatteryReportResult {
	s.ReportData = v
	return s
}

// 车信息
type BasicCarInfo struct {
	// 车牌号
	LicenseNo *string `json:"license_no,omitempty" xml:"license_no,omitempty" require:"true"`
	// 车架号
	Vin *string `json:"vin,omitempty" xml:"vin,omitempty" require:"true"`
	// 发动机号
	EngineNo *string `json:"engine_no,omitempty" xml:"engine_no,omitempty" require:"true"`
	// 初登日期
	RegisterDate *string `json:"register_date,omitempty" xml:"register_date,omitempty" require:"true"`
	// 车辆型号
	ModelCode *string `json:"model_code,omitempty" xml:"model_code,omitempty" require:"true"`
	// 营运性质
	UseNatureCode *string `json:"use_nature_code,omitempty" xml:"use_nature_code,omitempty" require:"true"`
	// 是否抵押
	Mortgage *bool `json:"mortgage,omitempty" xml:"mortgage,omitempty"`
}

func (s BasicCarInfo) String() string {
	return tea.Prettify(s)
}

func (s BasicCarInfo) GoString() string {
	return s.String()
}

func (s *BasicCarInfo) SetLicenseNo(v string) *BasicCarInfo {
	s.LicenseNo = &v
	return s
}

func (s *BasicCarInfo) SetVin(v string) *BasicCarInfo {
	s.Vin = &v
	return s
}

func (s *BasicCarInfo) SetEngineNo(v string) *BasicCarInfo {
	s.EngineNo = &v
	return s
}

func (s *BasicCarInfo) SetRegisterDate(v string) *BasicCarInfo {
	s.RegisterDate = &v
	return s
}

func (s *BasicCarInfo) SetModelCode(v string) *BasicCarInfo {
	s.ModelCode = &v
	return s
}

func (s *BasicCarInfo) SetUseNatureCode(v string) *BasicCarInfo {
	s.UseNatureCode = &v
	return s
}

func (s *BasicCarInfo) SetMortgage(v bool) *BasicCarInfo {
	s.Mortgage = &v
	return s
}

// 车辆业务价格
type CarBusinessPrice struct {
	// 品牌id
	BrandId *string `json:"brand_id,omitempty" xml:"brand_id,omitempty"`
	// 品牌名称
	BrandName *string `json:"brand_name,omitempty" xml:"brand_name,omitempty"`
	// 车系id
	CarSeriesId *string `json:"car_series_id,omitempty" xml:"car_series_id,omitempty"`
	// 车系名称
	CarSeries *string `json:"car_series,omitempty" xml:"car_series,omitempty"`
	// 车型id
	CarId *string `json:"car_id,omitempty" xml:"car_id,omitempty"`
	// 车型名称
	CarName *string `json:"car_name,omitempty" xml:"car_name,omitempty"`
	// 年款
	CarYear *string `json:"car_year,omitempty" xml:"car_year,omitempty"`
	// 城市code
	CityCode *string `json:"city_code,omitempty" xml:"city_code,omitempty"`
	// 城市名称
	CityName *string `json:"city_name,omitempty" xml:"city_name,omitempty"`
	// 车系指导价（范围值） 单位到分
	SeriesGuidePrice *string `json:"series_guide_price,omitempty" xml:"series_guide_price,omitempty"`
	// 车型指导价（具体值）单位到分
	OfficialPrice *int64 `json:"official_price,omitempty" xml:"official_price,omitempty"`
	// 车主成交价（具体值）单位到分
	FullPrice *int64 `json:"full_price,omitempty" xml:"full_price,omitempty"`
	// 车主裸车价（具体值）单位到分
	NakedPrice *int64 `json:"naked_price,omitempty" xml:"naked_price,omitempty"`
	// 购置税（具体值）单位到分
	PurchaseTax *int64 `json:"purchase_tax,omitempty" xml:"purchase_tax,omitempty"`
	// 车船税（具体值）单位到分
	VehicleVesselTax *int64 `json:"vehicle_vessel_tax,omitempty" xml:"vehicle_vessel_tax,omitempty"`
	// 商业险（具体值）单位到分
	BusinessInsurance *int64 `json:"business_insurance,omitempty" xml:"business_insurance,omitempty"`
	// json 扩展字段
	ExtraContent *string `json:"extra_content,omitempty" xml:"extra_content,omitempty"`
}

func (s CarBusinessPrice) String() string {
	return tea.Prettify(s)
}

func (s CarBusinessPrice) GoString() string {
	return s.String()
}

func (s *CarBusinessPrice) SetBrandId(v string) *CarBusinessPrice {
	s.BrandId = &v
	return s
}

func (s *CarBusinessPrice) SetBrandName(v string) *CarBusinessPrice {
	s.BrandName = &v
	return s
}

func (s *CarBusinessPrice) SetCarSeriesId(v string) *CarBusinessPrice {
	s.CarSeriesId = &v
	return s
}

func (s *CarBusinessPrice) SetCarSeries(v string) *CarBusinessPrice {
	s.CarSeries = &v
	return s
}

func (s *CarBusinessPrice) SetCarId(v string) *CarBusinessPrice {
	s.CarId = &v
	return s
}

func (s *CarBusinessPrice) SetCarName(v string) *CarBusinessPrice {
	s.CarName = &v
	return s
}

func (s *CarBusinessPrice) SetCarYear(v string) *CarBusinessPrice {
	s.CarYear = &v
	return s
}

func (s *CarBusinessPrice) SetCityCode(v string) *CarBusinessPrice {
	s.CityCode = &v
	return s
}

func (s *CarBusinessPrice) SetCityName(v string) *CarBusinessPrice {
	s.CityName = &v
	return s
}

func (s *CarBusinessPrice) SetSeriesGuidePrice(v string) *CarBusinessPrice {
	s.SeriesGuidePrice = &v
	return s
}

func (s *CarBusinessPrice) SetOfficialPrice(v int64) *CarBusinessPrice {
	s.OfficialPrice = &v
	return s
}

func (s *CarBusinessPrice) SetFullPrice(v int64) *CarBusinessPrice {
	s.FullPrice = &v
	return s
}

func (s *CarBusinessPrice) SetNakedPrice(v int64) *CarBusinessPrice {
	s.NakedPrice = &v
	return s
}

func (s *CarBusinessPrice) SetPurchaseTax(v int64) *CarBusinessPrice {
	s.PurchaseTax = &v
	return s
}

func (s *CarBusinessPrice) SetVehicleVesselTax(v int64) *CarBusinessPrice {
	s.VehicleVesselTax = &v
	return s
}

func (s *CarBusinessPrice) SetBusinessInsurance(v int64) *CarBusinessPrice {
	s.BusinessInsurance = &v
	return s
}

func (s *CarBusinessPrice) SetExtraContent(v string) *CarBusinessPrice {
	s.ExtraContent = &v
	return s
}

// 批量提交结果
type BatchSubmitCarResult struct {
	// 提交线索唯一请求id
	SubmitId *string `json:"submit_id,omitempty" xml:"submit_id,omitempty" require:"true"`
	// 是否成功
	IsSuccess *bool `json:"is_success,omitempty" xml:"is_success,omitempty" require:"true"`
	// OK NO_DEMAND 无线索需求，需要重试 INVALID 无效，不要重试
	PushResultCode *string `json:"push_result_code,omitempty" xml:"push_result_code,omitempty" require:"true"`
}

func (s BatchSubmitCarResult) String() string {
	return tea.Prettify(s)
}

func (s BatchSubmitCarResult) GoString() string {
	return s.String()
}

func (s *BatchSubmitCarResult) SetSubmitId(v string) *BatchSubmitCarResult {
	s.SubmitId = &v
	return s
}

func (s *BatchSubmitCarResult) SetIsSuccess(v bool) *BatchSubmitCarResult {
	s.IsSuccess = &v
	return s
}

func (s *BatchSubmitCarResult) SetPushResultCode(v string) *BatchSubmitCarResult {
	s.PushResultCode = &v
	return s
}

// 车辆信息
type CarInfo struct {
	// 车牌号
	LicenseNo *string `json:"license_no,omitempty" xml:"license_no,omitempty" require:"true"`
	// 车架号
	Vin *string `json:"vin,omitempty" xml:"vin,omitempty" require:"true"`
	// 发动机号
	EngineNo *string `json:"engine_no,omitempty" xml:"engine_no,omitempty" require:"true"`
	// 注册日期
	RegisterDate *string `json:"register_date,omitempty" xml:"register_date,omitempty" require:"true"`
	// 车型
	ModelCode *string `json:"model_code,omitempty" xml:"model_code,omitempty" require:"true"`
}

func (s CarInfo) String() string {
	return tea.Prettify(s)
}

func (s CarInfo) GoString() string {
	return s.String()
}

func (s *CarInfo) SetLicenseNo(v string) *CarInfo {
	s.LicenseNo = &v
	return s
}

func (s *CarInfo) SetVin(v string) *CarInfo {
	s.Vin = &v
	return s
}

func (s *CarInfo) SetEngineNo(v string) *CarInfo {
	s.EngineNo = &v
	return s
}

func (s *CarInfo) SetRegisterDate(v string) *CarInfo {
	s.RegisterDate = &v
	return s
}

func (s *CarInfo) SetModelCode(v string) *CarInfo {
	s.ModelCode = &v
	return s
}

// 省份集合
type Province struct {
	// 省份id
	Pid *string `json:"pid,omitempty" xml:"pid,omitempty" require:"true"`
	// 省份名
	Pname *string `json:"pname,omitempty" xml:"pname,omitempty" require:"true"`
}

func (s Province) String() string {
	return tea.Prettify(s)
}

func (s Province) GoString() string {
	return s.String()
}

func (s *Province) SetPid(v string) *Province {
	s.Pid = &v
	return s
}

func (s *Province) SetPname(v string) *Province {
	s.Pname = &v
	return s
}

// 城市集合
type City struct {
	// 省份id
	Pid *string `json:"pid,omitempty" xml:"pid,omitempty" require:"true"`
	// 城市id
	Cid *string `json:"cid,omitempty" xml:"cid,omitempty" require:"true"`
	// 城市名
	Cname *string `json:"cname,omitempty" xml:"cname,omitempty" require:"true"`
}

func (s City) String() string {
	return tea.Prettify(s)
}

func (s City) GoString() string {
	return s.String()
}

func (s *City) SetPid(v string) *City {
	s.Pid = &v
	return s
}

func (s *City) SetCid(v string) *City {
	s.Cid = &v
	return s
}

func (s *City) SetCname(v string) *City {
	s.Cname = &v
	return s
}

// 高德潜客流向数据返回数据对象
type GdCustomerInfo struct {
	// 时间范围（查询年度数据时，返回该字段）
	TimeRange *string `json:"time_range,omitempty" xml:"time_range,omitempty"`
	// 数据总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty" require:"true"`
	// 当前展示页
	Current *int64 `json:"current,omitempty" xml:"current,omitempty" require:"true"`
	// 数据总页数
	Pages *int64 `json:"pages,omitempty" xml:"pages,omitempty" require:"true"`
	// 每页显示数据条数
	Size *int64 `json:"size,omitempty" xml:"size,omitempty" require:"true"`
	// 数据集合
	Records []*GdCustomersRecord `json:"records,omitempty" xml:"records,omitempty" require:"true" type:"Repeated"`
}

func (s GdCustomerInfo) String() string {
	return tea.Prettify(s)
}

func (s GdCustomerInfo) GoString() string {
	return s.String()
}

func (s *GdCustomerInfo) SetTimeRange(v string) *GdCustomerInfo {
	s.TimeRange = &v
	return s
}

func (s *GdCustomerInfo) SetTotal(v int64) *GdCustomerInfo {
	s.Total = &v
	return s
}

func (s *GdCustomerInfo) SetCurrent(v int64) *GdCustomerInfo {
	s.Current = &v
	return s
}

func (s *GdCustomerInfo) SetPages(v int64) *GdCustomerInfo {
	s.Pages = &v
	return s
}

func (s *GdCustomerInfo) SetSize(v int64) *GdCustomerInfo {
	s.Size = &v
	return s
}

func (s *GdCustomerInfo) SetRecords(v []*GdCustomersRecord) *GdCustomerInfo {
	s.Records = v
	return s
}

// 高德潜客请求req
type GdCustomerFlow struct {
	// 当前页面
	Current *int64 `json:"current,omitempty" xml:"current,omitempty" require:"true"`
	// 数据类型（SHOP：店铺；CITY：城市；PROVINCE：省份；COUNTRY：全国；SHOP_BRAND：店铺品牌(仅限竞品)）
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty"`
	// 时间类型（DAY：天；WEEK：周；MONTH：月；仅针对城市和店铺品牌的竞品数据支持的时间类型为，季度：QUARTER；半年：HALF；年：YEAR）
	TimeType *string `json:"time_type,omitempty" xml:"time_type,omitempty"`
	// 主品牌id
	MainBrand *string `json:"main_brand,omitempty" xml:"main_brand,omitempty"`
	// 时间（时间类型为天时：yyyyMMdd；时间类型为周时：yyyyWW；时间类型为月时：yyyyMM；时间类型为季度时：yyyyQQ；时间类型为半年时：yyyyBB；时间类型为年时：yyyy；）
	Time *string `json:"time,omitempty" xml:"time,omitempty"`
	// 品牌id，以”,”分隔
	BrandLimit *string `json:"brand_limit,omitempty" xml:"brand_limit,omitempty"`
	// 数据指数类型（pv、uv中选择，多个以”,”分隔）
	DataLimit *string `json:"data_limit,omitempty" xml:"data_limit,omitempty"`
	// 数据统计逻辑（0：默认值，基于本品或竞品获取；1：基于本品获取）
	BaseSelf *int64 `json:"base_self,omitempty" xml:"base_self,omitempty"`
}

func (s GdCustomerFlow) String() string {
	return tea.Prettify(s)
}

func (s GdCustomerFlow) GoString() string {
	return s.String()
}

func (s *GdCustomerFlow) SetCurrent(v int64) *GdCustomerFlow {
	s.Current = &v
	return s
}

func (s *GdCustomerFlow) SetDataType(v string) *GdCustomerFlow {
	s.DataType = &v
	return s
}

func (s *GdCustomerFlow) SetTimeType(v string) *GdCustomerFlow {
	s.TimeType = &v
	return s
}

func (s *GdCustomerFlow) SetMainBrand(v string) *GdCustomerFlow {
	s.MainBrand = &v
	return s
}

func (s *GdCustomerFlow) SetTime(v string) *GdCustomerFlow {
	s.Time = &v
	return s
}

func (s *GdCustomerFlow) SetBrandLimit(v string) *GdCustomerFlow {
	s.BrandLimit = &v
	return s
}

func (s *GdCustomerFlow) SetDataLimit(v string) *GdCustomerFlow {
	s.DataLimit = &v
	return s
}

func (s *GdCustomerFlow) SetBaseSelf(v int64) *GdCustomerFlow {
	s.BaseSelf = &v
	return s
}

// 二手车估价信息
type UsedCarValuation struct {
	// 评估金额(万)
	Referenceprice *string `json:"referenceprice,omitempty" xml:"referenceprice,omitempty" require:"true"`
	// 官方报价(参考)(万)
	Newcarprice *string `json:"newcarprice,omitempty" xml:"newcarprice,omitempty" require:"true"`
	// 车型图片(参考)
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 车况好(万)(三个价格用"-"分隔,第一个是较小值第二个是...
	Conditiona *string `json:"conditiona,omitempty" xml:"conditiona,omitempty" require:"true"`
	// 车况正常(万)
	Conditionb *string `json:"conditionb,omitempty" xml:"conditionb,omitempty" require:"true"`
	// 车况差(万)
	Conditionc *string `json:"conditionc,omitempty" xml:"conditionc,omitempty" require:"true"`
}

func (s UsedCarValuation) String() string {
	return tea.Prettify(s)
}

func (s UsedCarValuation) GoString() string {
	return s.String()
}

func (s *UsedCarValuation) SetReferenceprice(v string) *UsedCarValuation {
	s.Referenceprice = &v
	return s
}

func (s *UsedCarValuation) SetNewcarprice(v string) *UsedCarValuation {
	s.Newcarprice = &v
	return s
}

func (s *UsedCarValuation) SetUrl(v string) *UsedCarValuation {
	s.Url = &v
	return s
}

func (s *UsedCarValuation) SetConditiona(v string) *UsedCarValuation {
	s.Conditiona = &v
	return s
}

func (s *UsedCarValuation) SetConditionb(v string) *UsedCarValuation {
	s.Conditionb = &v
	return s
}

func (s *UsedCarValuation) SetConditionc(v string) *UsedCarValuation {
	s.Conditionc = &v
	return s
}

// 高德潜客指数返回数据对象
type GdPotentialCustomerInfo struct {
	// 时间范围（查询月度或年度数据时，返回该字段）
	TimeRange *string `json:"time_range,omitempty" xml:"time_range,omitempty"`
	// 数据总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty" require:"true"`
	// 当前展示页
	Current *int64 `json:"current,omitempty" xml:"current,omitempty" require:"true"`
	// 数据总页数
	Pages *int64 `json:"pages,omitempty" xml:"pages,omitempty" require:"true"`
	// 每页显示数据条数
	Size *int64 `json:"size,omitempty" xml:"size,omitempty" require:"true"`
	// 数据集合
	Records []*GdPotentialCustomerRecord `json:"records,omitempty" xml:"records,omitempty" require:"true" type:"Repeated"`
}

func (s GdPotentialCustomerInfo) String() string {
	return tea.Prettify(s)
}

func (s GdPotentialCustomerInfo) GoString() string {
	return s.String()
}

func (s *GdPotentialCustomerInfo) SetTimeRange(v string) *GdPotentialCustomerInfo {
	s.TimeRange = &v
	return s
}

func (s *GdPotentialCustomerInfo) SetTotal(v int64) *GdPotentialCustomerInfo {
	s.Total = &v
	return s
}

func (s *GdPotentialCustomerInfo) SetCurrent(v int64) *GdPotentialCustomerInfo {
	s.Current = &v
	return s
}

func (s *GdPotentialCustomerInfo) SetPages(v int64) *GdPotentialCustomerInfo {
	s.Pages = &v
	return s
}

func (s *GdPotentialCustomerInfo) SetSize(v int64) *GdPotentialCustomerInfo {
	s.Size = &v
	return s
}

func (s *GdPotentialCustomerInfo) SetRecords(v []*GdPotentialCustomerRecord) *GdPotentialCustomerInfo {
	s.Records = v
	return s
}

// 车型信息
type ProductInfo struct {
	// 能源类型
	Fueltype *string `json:"fueltype,omitempty" xml:"fueltype,omitempty" require:"true"`
	// 车型名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 车型id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
}

func (s ProductInfo) String() string {
	return tea.Prettify(s)
}

func (s ProductInfo) GoString() string {
	return s.String()
}

func (s *ProductInfo) SetFueltype(v string) *ProductInfo {
	s.Fueltype = &v
	return s
}

func (s *ProductInfo) SetName(v string) *ProductInfo {
	s.Name = &v
	return s
}

func (s *ProductInfo) SetId(v string) *ProductInfo {
	s.Id = &v
	return s
}

// 设备信息
type DeviceBean struct {
	// 选填其中一个：imeiMd5、macMd5、adid、adidMd5、did、idfa、idfaMd5、caid、caidMd5、oaid、oaidMd5、aaid、aaidMd5、gtcid、mb、pnSha256、cid、gid
	DeviceIdType *string `json:"device_id_type,omitempty" xml:"device_id_type,omitempty" require:"true"`
	// 设备ID列表（最多200个，不要重复）
	DeviceIdList []*string `json:"device_id_list,omitempty" xml:"device_id_list,omitempty" require:"true" type:"Repeated"`
}

func (s DeviceBean) String() string {
	return tea.Prettify(s)
}

func (s DeviceBean) GoString() string {
	return s.String()
}

func (s *DeviceBean) SetDeviceIdType(v string) *DeviceBean {
	s.DeviceIdType = &v
	return s
}

func (s *DeviceBean) SetDeviceIdList(v []*string) *DeviceBean {
	s.DeviceIdList = v
	return s
}

// 汽车之家城市信息
type CityResult struct {
	// 城市Id
	CityId *string `json:"city_id,omitempty" xml:"city_id,omitempty" require:"true"`
	// 城市名称
	CityName *string `json:"city_name,omitempty" xml:"city_name,omitempty" require:"true"`
}

func (s CityResult) String() string {
	return tea.Prettify(s)
}

func (s CityResult) GoString() string {
	return s.String()
}

func (s *CityResult) SetCityId(v string) *CityResult {
	s.CityId = &v
	return s
}

func (s *CityResult) SetCityName(v string) *CityResult {
	s.CityName = &v
	return s
}

// 标签配置信息返回结果
type TagBeanRecords struct {
}

func (s TagBeanRecords) String() string {
	return tea.Prettify(s)
}

func (s TagBeanRecords) GoString() string {
	return s.String()
}

// 用户基本信息
type CarOwnerUserInfo struct {
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 手机号
	PhoneNum *string `json:"phone_num,omitempty" xml:"phone_num,omitempty" require:"true"`
}

func (s CarOwnerUserInfo) String() string {
	return tea.Prettify(s)
}

func (s CarOwnerUserInfo) GoString() string {
	return s.String()
}

func (s *CarOwnerUserInfo) SetUserId(v string) *CarOwnerUserInfo {
	s.UserId = &v
	return s
}

func (s *CarOwnerUserInfo) SetPhoneNum(v string) *CarOwnerUserInfo {
	s.PhoneNum = &v
	return s
}

// 长安画像标签
type TagBean struct {
	// 标签编码
	Tid *string `json:"tid,omitempty" xml:"tid,omitempty"`
	// 标签类目
	Category *string `json:"category,omitempty" xml:"category,omitempty"`
	// 标签名称
	Tname *string `json:"tname,omitempty" xml:"tname,omitempty"`
	// 标签值名称
	Tvname *string `json:"tvname,omitempty" xml:"tvname,omitempty"`
}

func (s TagBean) String() string {
	return tea.Prettify(s)
}

func (s TagBean) GoString() string {
	return s.String()
}

func (s *TagBean) SetTid(v string) *TagBean {
	s.Tid = &v
	return s
}

func (s *TagBean) SetCategory(v string) *TagBean {
	s.Category = &v
	return s
}

func (s *TagBean) SetTname(v string) *TagBean {
	s.Tname = &v
	return s
}

func (s *TagBean) SetTvname(v string) *TagBean {
	s.Tvname = &v
	return s
}

// 高德店铺基本信息
type GdStoreInfo struct {
	// 数据总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty" require:"true"`
	// 当前展示页
	Current *int64 `json:"current,omitempty" xml:"current,omitempty" require:"true"`
	// 数据总页数
	Pages *int64 `json:"pages,omitempty" xml:"pages,omitempty" require:"true"`
	// 每页显示数据条数
	Size *int64 `json:"size,omitempty" xml:"size,omitempty" require:"true"`
	// 数据集合
	Records []*GdStoreRecord `json:"records,omitempty" xml:"records,omitempty" require:"true" type:"Repeated"`
}

func (s GdStoreInfo) String() string {
	return tea.Prettify(s)
}

func (s GdStoreInfo) GoString() string {
	return s.String()
}

func (s *GdStoreInfo) SetTotal(v int64) *GdStoreInfo {
	s.Total = &v
	return s
}

func (s *GdStoreInfo) SetCurrent(v int64) *GdStoreInfo {
	s.Current = &v
	return s
}

func (s *GdStoreInfo) SetPages(v int64) *GdStoreInfo {
	s.Pages = &v
	return s
}

func (s *GdStoreInfo) SetSize(v int64) *GdStoreInfo {
	s.Size = &v
	return s
}

func (s *GdStoreInfo) SetRecords(v []*GdStoreRecord) *GdStoreInfo {
	s.Records = v
	return s
}

// 二手车
type UsedCarInfo struct {
	// 渠道方线索业务id
	LeadId *string `json:"lead_id,omitempty" xml:"lead_id,omitempty" require:"true"`
	// 城市名称
	CityName *string `json:"city_name,omitempty" xml:"city_name,omitempty" require:"true"`
	// 城市id
	Cid *string `json:"cid,omitempty" xml:"cid,omitempty" require:"true"`
	// 品牌名称
	BrandName *string `json:"brand_name,omitempty" xml:"brand_name,omitempty"`
	// 车系名称
	SeriesName *string `json:"series_name,omitempty" xml:"series_name,omitempty"`
	// 车型名称
	SpecName *string `json:"spec_name,omitempty" xml:"spec_name,omitempty"`
	// 首次上牌时间格式 yyyy/MM/dd
	FirstRegTime *string `json:"first_reg_time,omitempty" xml:"first_reg_time,omitempty" require:"true"`
	// 行驶公里数(km)
	Mileage *string `json:"mileage,omitempty" xml:"mileage,omitempty" require:"true"`
	// 省份id
	Pid *string `json:"pid,omitempty" xml:"pid,omitempty" require:"true"`
	// 汽车之家车型id
	Specid *string `json:"specid,omitempty" xml:"specid,omitempty" require:"true"`
}

func (s UsedCarInfo) String() string {
	return tea.Prettify(s)
}

func (s UsedCarInfo) GoString() string {
	return s.String()
}

func (s *UsedCarInfo) SetLeadId(v string) *UsedCarInfo {
	s.LeadId = &v
	return s
}

func (s *UsedCarInfo) SetCityName(v string) *UsedCarInfo {
	s.CityName = &v
	return s
}

func (s *UsedCarInfo) SetCid(v string) *UsedCarInfo {
	s.Cid = &v
	return s
}

func (s *UsedCarInfo) SetBrandName(v string) *UsedCarInfo {
	s.BrandName = &v
	return s
}

func (s *UsedCarInfo) SetSeriesName(v string) *UsedCarInfo {
	s.SeriesName = &v
	return s
}

func (s *UsedCarInfo) SetSpecName(v string) *UsedCarInfo {
	s.SpecName = &v
	return s
}

func (s *UsedCarInfo) SetFirstRegTime(v string) *UsedCarInfo {
	s.FirstRegTime = &v
	return s
}

func (s *UsedCarInfo) SetMileage(v string) *UsedCarInfo {
	s.Mileage = &v
	return s
}

func (s *UsedCarInfo) SetPid(v string) *UsedCarInfo {
	s.Pid = &v
	return s
}

func (s *UsedCarInfo) SetSpecid(v string) *UsedCarInfo {
	s.Specid = &v
	return s
}

// 品牌列表
type Brandlist struct {
	// 首字母
	Letter *string `json:"letter,omitempty" xml:"letter,omitempty" require:"true"`
	// 品牌信息列表
	List []*LetterInfo `json:"list,omitempty" xml:"list,omitempty" require:"true" type:"Repeated"`
}

func (s Brandlist) String() string {
	return tea.Prettify(s)
}

func (s Brandlist) GoString() string {
	return s.String()
}

func (s *Brandlist) SetLetter(v string) *Brandlist {
	s.Letter = &v
	return s
}

func (s *Brandlist) SetList(v []*LetterInfo) *Brandlist {
	s.List = v
	return s
}

// 线索状态信息
type LeadInfo struct {
	// 线索信息
	LeadId *string `json:"lead_id,omitempty" xml:"lead_id,omitempty" require:"true"`
	// 状态值
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s LeadInfo) String() string {
	return tea.Prettify(s)
}

func (s LeadInfo) GoString() string {
	return s.String()
}

func (s *LeadInfo) SetLeadId(v string) *LeadInfo {
	s.LeadId = &v
	return s
}

func (s *LeadInfo) SetStatus(v string) *LeadInfo {
	s.Status = &v
	return s
}

// 区县集合
type County struct {
	// 城市id
	Cid *string `json:"cid,omitempty" xml:"cid,omitempty" require:"true"`
	// 区县id
	Countyid *string `json:"countyid,omitempty" xml:"countyid,omitempty" require:"true"`
	// 区县名
	Countyname *string `json:"countyname,omitempty" xml:"countyname,omitempty" require:"true"`
}

func (s County) String() string {
	return tea.Prettify(s)
}

func (s County) GoString() string {
	return s.String()
}

func (s *County) SetCid(v string) *County {
	s.Cid = &v
	return s
}

func (s *County) SetCountyid(v string) *County {
	s.Countyid = &v
	return s
}

func (s *County) SetCountyname(v string) *County {
	s.Countyname = &v
	return s
}

// 常岳用户结构体
type CyUserInfo struct {
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 用户名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
	// 证件号
	IdCard *string `json:"id_card,omitempty" xml:"id_card,omitempty"`
	// 手机号
	PhoneNum *string `json:"phone_num,omitempty" xml:"phone_num,omitempty" require:"true"`
}

func (s CyUserInfo) String() string {
	return tea.Prettify(s)
}

func (s CyUserInfo) GoString() string {
	return s.String()
}

func (s *CyUserInfo) SetUserId(v string) *CyUserInfo {
	s.UserId = &v
	return s
}

func (s *CyUserInfo) SetUserName(v string) *CyUserInfo {
	s.UserName = &v
	return s
}

func (s *CyUserInfo) SetIdCard(v string) *CyUserInfo {
	s.IdCard = &v
	return s
}

func (s *CyUserInfo) SetPhoneNum(v string) *CyUserInfo {
	s.PhoneNum = &v
	return s
}

// 1
type SpecResult struct {
	// 下一页数据拉取传递的值
	AfterSpecId *string `json:"after_spec_id,omitempty" xml:"after_spec_id,omitempty" require:"true"`
	// 车型Id列表
	SpecList []*SpecList `json:"spec_list,omitempty" xml:"spec_list,omitempty" require:"true" type:"Repeated"`
}

func (s SpecResult) String() string {
	return tea.Prettify(s)
}

func (s SpecResult) GoString() string {
	return s.String()
}

func (s *SpecResult) SetAfterSpecId(v string) *SpecResult {
	s.AfterSpecId = &v
	return s
}

func (s *SpecResult) SetSpecList(v []*SpecList) *SpecResult {
	s.SpecList = v
	return s
}

// 充电报告查询
type BatteryReport struct {
	// 充电单号，最大长度/规则：32
	StartChargeSeq *string `json:"start_charge_seq,omitempty" xml:"start_charge_seq,omitempty" require:"true"`
	// VIN，最大长度/规则：17位
	VinCode *string `json:"vin_code,omitempty" xml:"vin_code,omitempty" require:"true"`
	// 公告号，最大长度/规则36
	PublicationNo *string `json:"publication_no,omitempty" xml:"publication_no,omitempty"`
	// 本次累积充电量，单位kWh；最大长度/规则：整数位<=10,小数位<=2
	TotalPower *string `json:"total_power,omitempty" xml:"total_power,omitempty"`
	// 本次累积充入SOC（%）；最大长度/规则：0-100,小数位<=2
	TotalChargeSoc *string `json:"total_charge_soc,omitempty" xml:"total_charge_soc,omitempty"`
	// 本次充电开始SOC(%)；最大长度/规则：0-100,小数位<=2
	StartSoc *string `json:"start_soc,omitempty" xml:"start_soc,omitempty"`
	// 本次充电截止SOC(%)；最大长度/规则：0-100,小数位<=2
	EndSoc *string `json:"end_soc,omitempty" xml:"end_soc,omitempty"`
	// 标称能量，单位kWh；最大长度/规则：0-1000,小数位<=2
	NominalEnergy *string `json:"nominal_energy,omitempty" xml:"nominal_energy,omitempty"`
	// 充电城市ID；最大长度/规则：30
	CityId *string `json:"city_id,omitempty" xml:"city_id,omitempty"`
	// 注册日期；最大长度/规则：yyyy-MM-dd
	RegisterDate *string `json:"register_date,omitempty" xml:"register_date,omitempty"`
}

func (s BatteryReport) String() string {
	return tea.Prettify(s)
}

func (s BatteryReport) GoString() string {
	return s.String()
}

func (s *BatteryReport) SetStartChargeSeq(v string) *BatteryReport {
	s.StartChargeSeq = &v
	return s
}

func (s *BatteryReport) SetVinCode(v string) *BatteryReport {
	s.VinCode = &v
	return s
}

func (s *BatteryReport) SetPublicationNo(v string) *BatteryReport {
	s.PublicationNo = &v
	return s
}

func (s *BatteryReport) SetTotalPower(v string) *BatteryReport {
	s.TotalPower = &v
	return s
}

func (s *BatteryReport) SetTotalChargeSoc(v string) *BatteryReport {
	s.TotalChargeSoc = &v
	return s
}

func (s *BatteryReport) SetStartSoc(v string) *BatteryReport {
	s.StartSoc = &v
	return s
}

func (s *BatteryReport) SetEndSoc(v string) *BatteryReport {
	s.EndSoc = &v
	return s
}

func (s *BatteryReport) SetNominalEnergy(v string) *BatteryReport {
	s.NominalEnergy = &v
	return s
}

func (s *BatteryReport) SetCityId(v string) *BatteryReport {
	s.CityId = &v
	return s
}

func (s *BatteryReport) SetRegisterDate(v string) *BatteryReport {
	s.RegisterDate = &v
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

type PushCarloanRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 车信息
	BasicCarInfo *BasicCarInfo `json:"basic_car_info,omitempty" xml:"basic_car_info,omitempty" require:"true"`
	// 用户信息
	UserInfo *CarUserInfo `json:"user_info,omitempty" xml:"user_info,omitempty" require:"true"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
}

func (s PushCarloanRequest) String() string {
	return tea.Prettify(s)
}

func (s PushCarloanRequest) GoString() string {
	return s.String()
}

func (s *PushCarloanRequest) SetAuthToken(v string) *PushCarloanRequest {
	s.AuthToken = &v
	return s
}

func (s *PushCarloanRequest) SetProductInstanceId(v string) *PushCarloanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushCarloanRequest) SetBasicCarInfo(v *BasicCarInfo) *PushCarloanRequest {
	s.BasicCarInfo = v
	return s
}

func (s *PushCarloanRequest) SetUserInfo(v *CarUserInfo) *PushCarloanRequest {
	s.UserInfo = v
	return s
}

func (s *PushCarloanRequest) SetSceneCode(v string) *PushCarloanRequest {
	s.SceneCode = &v
	return s
}

type PushCarloanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否推送成功
	PushSuccess *bool `json:"push_success,omitempty" xml:"push_success,omitempty"`
}

func (s PushCarloanResponse) String() string {
	return tea.Prettify(s)
}

func (s PushCarloanResponse) GoString() string {
	return s.String()
}

func (s *PushCarloanResponse) SetReqMsgId(v string) *PushCarloanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushCarloanResponse) SetResultCode(v string) *PushCarloanResponse {
	s.ResultCode = &v
	return s
}

func (s *PushCarloanResponse) SetResultMsg(v string) *PushCarloanResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushCarloanResponse) SetPushSuccess(v bool) *PushCarloanResponse {
	s.PushSuccess = &v
	return s
}

type RegisterCarownerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 唯一场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 用户基本信息
	UserInfo *CarOwnerUserInfo `json:"user_info,omitempty" xml:"user_info,omitempty" require:"true"`
	// 车辆信息
	CarInfo *CarInfo `json:"car_info,omitempty" xml:"car_info,omitempty" require:"true"`
}

func (s RegisterCarownerRequest) String() string {
	return tea.Prettify(s)
}

func (s RegisterCarownerRequest) GoString() string {
	return s.String()
}

func (s *RegisterCarownerRequest) SetAuthToken(v string) *RegisterCarownerRequest {
	s.AuthToken = &v
	return s
}

func (s *RegisterCarownerRequest) SetProductInstanceId(v string) *RegisterCarownerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RegisterCarownerRequest) SetSceneCode(v string) *RegisterCarownerRequest {
	s.SceneCode = &v
	return s
}

func (s *RegisterCarownerRequest) SetUserInfo(v *CarOwnerUserInfo) *RegisterCarownerRequest {
	s.UserInfo = v
	return s
}

func (s *RegisterCarownerRequest) SetCarInfo(v *CarInfo) *RegisterCarownerRequest {
	s.CarInfo = v
	return s
}

type RegisterCarownerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	PushSuccess *bool `json:"push_success,omitempty" xml:"push_success,omitempty"`
	// token
	Token *string `json:"token,omitempty" xml:"token,omitempty"`
}

func (s RegisterCarownerResponse) String() string {
	return tea.Prettify(s)
}

func (s RegisterCarownerResponse) GoString() string {
	return s.String()
}

func (s *RegisterCarownerResponse) SetReqMsgId(v string) *RegisterCarownerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RegisterCarownerResponse) SetResultCode(v string) *RegisterCarownerResponse {
	s.ResultCode = &v
	return s
}

func (s *RegisterCarownerResponse) SetResultMsg(v string) *RegisterCarownerResponse {
	s.ResultMsg = &v
	return s
}

func (s *RegisterCarownerResponse) SetPushSuccess(v bool) *RegisterCarownerResponse {
	s.PushSuccess = &v
	return s
}

func (s *RegisterCarownerResponse) SetToken(v string) *RegisterCarownerResponse {
	s.Token = &v
	return s
}

type BatchcreateNewcarRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// testchannleCode
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 新车线索集合
	NewCarInfo []*NewCarInfo `json:"new_car_info,omitempty" xml:"new_car_info,omitempty" require:"true" type:"Repeated"`
}

func (s BatchcreateNewcarRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateNewcarRequest) GoString() string {
	return s.String()
}

func (s *BatchcreateNewcarRequest) SetAuthToken(v string) *BatchcreateNewcarRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchcreateNewcarRequest) SetProductInstanceId(v string) *BatchcreateNewcarRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchcreateNewcarRequest) SetSceneCode(v string) *BatchcreateNewcarRequest {
	s.SceneCode = &v
	return s
}

func (s *BatchcreateNewcarRequest) SetNewCarInfo(v []*NewCarInfo) *BatchcreateNewcarRequest {
	s.NewCarInfo = v
	return s
}

type BatchcreateNewcarResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 批量提交结果
	BatchSubmitCarResult []*BatchSubmitCarResult `json:"batch_submit_car_result,omitempty" xml:"batch_submit_car_result,omitempty" type:"Repeated"`
}

func (s BatchcreateNewcarResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateNewcarResponse) GoString() string {
	return s.String()
}

func (s *BatchcreateNewcarResponse) SetReqMsgId(v string) *BatchcreateNewcarResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchcreateNewcarResponse) SetResultCode(v string) *BatchcreateNewcarResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchcreateNewcarResponse) SetResultMsg(v string) *BatchcreateNewcarResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchcreateNewcarResponse) SetBatchSubmitCarResult(v []*BatchSubmitCarResult) *BatchcreateNewcarResponse {
	s.BatchSubmitCarResult = v
	return s
}

type SubmitNewcarRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 用户信息
	UserInfo *CarUserInfo `json:"user_info,omitempty" xml:"user_info,omitempty" require:"true"`
	// 车系
	CarSeries *string `json:"car_series,omitempty" xml:"car_series,omitempty" require:"true"`
	// 金融方案
	FinaicalPlan *string `json:"finaical_plan,omitempty" xml:"finaical_plan,omitempty"`
	//
	// 预计购买时间
	PurcharseTime *string `json:"purcharse_time,omitempty" xml:"purcharse_time,omitempty"`
	// xxxx
	CarSeriesId *string `json:"car_series_id,omitempty" xml:"car_series_id,omitempty"`
	// 提交线索的唯一id
	SubmitId *string `json:"submit_id,omitempty" xml:"submit_id,omitempty"`
	// 汽车之家车系id
	QcCarSeriesId *string `json:"qc_car_series_id,omitempty" xml:"qc_car_series_id,omitempty"`
	// 匹配源
	MatchSource *string `json:"match_source,omitempty" xml:"match_source,omitempty"`
}

func (s SubmitNewcarRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitNewcarRequest) GoString() string {
	return s.String()
}

func (s *SubmitNewcarRequest) SetAuthToken(v string) *SubmitNewcarRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitNewcarRequest) SetProductInstanceId(v string) *SubmitNewcarRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitNewcarRequest) SetSceneCode(v string) *SubmitNewcarRequest {
	s.SceneCode = &v
	return s
}

func (s *SubmitNewcarRequest) SetUserInfo(v *CarUserInfo) *SubmitNewcarRequest {
	s.UserInfo = v
	return s
}

func (s *SubmitNewcarRequest) SetCarSeries(v string) *SubmitNewcarRequest {
	s.CarSeries = &v
	return s
}

func (s *SubmitNewcarRequest) SetFinaicalPlan(v string) *SubmitNewcarRequest {
	s.FinaicalPlan = &v
	return s
}

func (s *SubmitNewcarRequest) SetPurcharseTime(v string) *SubmitNewcarRequest {
	s.PurcharseTime = &v
	return s
}

func (s *SubmitNewcarRequest) SetCarSeriesId(v string) *SubmitNewcarRequest {
	s.CarSeriesId = &v
	return s
}

func (s *SubmitNewcarRequest) SetSubmitId(v string) *SubmitNewcarRequest {
	s.SubmitId = &v
	return s
}

func (s *SubmitNewcarRequest) SetQcCarSeriesId(v string) *SubmitNewcarRequest {
	s.QcCarSeriesId = &v
	return s
}

func (s *SubmitNewcarRequest) SetMatchSource(v string) *SubmitNewcarRequest {
	s.MatchSource = &v
	return s
}

type SubmitNewcarResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// OK NO_DEMAND 无线索需求，需要重试 INVALID 无效，不要重试
	PushResultCode *string `json:"push_result_code,omitempty" xml:"push_result_code,omitempty"`
}

func (s SubmitNewcarResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitNewcarResponse) GoString() string {
	return s.String()
}

func (s *SubmitNewcarResponse) SetReqMsgId(v string) *SubmitNewcarResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitNewcarResponse) SetResultCode(v string) *SubmitNewcarResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitNewcarResponse) SetResultMsg(v string) *SubmitNewcarResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitNewcarResponse) SetPushResultCode(v string) *SubmitNewcarResponse {
	s.PushResultCode = &v
	return s
}

type RegisterCarownerCyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 唯一场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 用户基本信息
	UserInfo *CyUserInfo `json:"user_info,omitempty" xml:"user_info,omitempty" require:"true"`
	// 车辆信息
	CarInfo *CarInfo `json:"car_info,omitempty" xml:"car_info,omitempty" require:"true"`
}

func (s RegisterCarownerCyRequest) String() string {
	return tea.Prettify(s)
}

func (s RegisterCarownerCyRequest) GoString() string {
	return s.String()
}

func (s *RegisterCarownerCyRequest) SetAuthToken(v string) *RegisterCarownerCyRequest {
	s.AuthToken = &v
	return s
}

func (s *RegisterCarownerCyRequest) SetProductInstanceId(v string) *RegisterCarownerCyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RegisterCarownerCyRequest) SetSceneCode(v string) *RegisterCarownerCyRequest {
	s.SceneCode = &v
	return s
}

func (s *RegisterCarownerCyRequest) SetUserInfo(v *CyUserInfo) *RegisterCarownerCyRequest {
	s.UserInfo = v
	return s
}

func (s *RegisterCarownerCyRequest) SetCarInfo(v *CarInfo) *RegisterCarownerCyRequest {
	s.CarInfo = v
	return s
}

type RegisterCarownerCyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	PushSuccess *bool `json:"push_success,omitempty" xml:"push_success,omitempty"`
}

func (s RegisterCarownerCyResponse) String() string {
	return tea.Prettify(s)
}

func (s RegisterCarownerCyResponse) GoString() string {
	return s.String()
}

func (s *RegisterCarownerCyResponse) SetReqMsgId(v string) *RegisterCarownerCyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RegisterCarownerCyResponse) SetResultCode(v string) *RegisterCarownerCyResponse {
	s.ResultCode = &v
	return s
}

func (s *RegisterCarownerCyResponse) SetResultMsg(v string) *RegisterCarownerCyResponse {
	s.ResultMsg = &v
	return s
}

func (s *RegisterCarownerCyResponse) SetPushSuccess(v bool) *RegisterCarownerCyResponse {
	s.PushSuccess = &v
	return s
}

type QueryCarPriceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 车型id
	CarId *string `json:"car_id,omitempty" xml:"car_id,omitempty"`
	// 车系id
	SeriesId *string `json:"series_id,omitempty" xml:"series_id,omitempty"`
	// 城市code
	CityCode *string `json:"city_code,omitempty" xml:"city_code,omitempty"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 每页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// QC或者DCD的id查询价格
	IdType *string `json:"id_type,omitempty" xml:"id_type,omitempty"`
}

func (s QueryCarPriceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCarPriceRequest) GoString() string {
	return s.String()
}

func (s *QueryCarPriceRequest) SetAuthToken(v string) *QueryCarPriceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCarPriceRequest) SetProductInstanceId(v string) *QueryCarPriceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCarPriceRequest) SetCarId(v string) *QueryCarPriceRequest {
	s.CarId = &v
	return s
}

func (s *QueryCarPriceRequest) SetSeriesId(v string) *QueryCarPriceRequest {
	s.SeriesId = &v
	return s
}

func (s *QueryCarPriceRequest) SetCityCode(v string) *QueryCarPriceRequest {
	s.CityCode = &v
	return s
}

func (s *QueryCarPriceRequest) SetPageNum(v int64) *QueryCarPriceRequest {
	s.PageNum = &v
	return s
}

func (s *QueryCarPriceRequest) SetPageSize(v int64) *QueryCarPriceRequest {
	s.PageSize = &v
	return s
}

func (s *QueryCarPriceRequest) SetIdType(v string) *QueryCarPriceRequest {
	s.IdType = &v
	return s
}

type QueryCarPriceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总页数
	TotalPages *int64 `json:"total_pages,omitempty" xml:"total_pages,omitempty"`
	// 当前页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	//
	// 车辆业务价格
	Data []*CarBusinessPrice `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryCarPriceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCarPriceResponse) GoString() string {
	return s.String()
}

func (s *QueryCarPriceResponse) SetReqMsgId(v string) *QueryCarPriceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCarPriceResponse) SetResultCode(v string) *QueryCarPriceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCarPriceResponse) SetResultMsg(v string) *QueryCarPriceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCarPriceResponse) SetTotalPages(v int64) *QueryCarPriceResponse {
	s.TotalPages = &v
	return s
}

func (s *QueryCarPriceResponse) SetPageNum(v int64) *QueryCarPriceResponse {
	s.PageNum = &v
	return s
}

func (s *QueryCarPriceResponse) SetData(v []*CarBusinessPrice) *QueryCarPriceResponse {
	s.Data = v
	return s
}

type ImportCarFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// xx
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s ImportCarFileRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportCarFileRequest) GoString() string {
	return s.String()
}

func (s *ImportCarFileRequest) SetAuthToken(v string) *ImportCarFileRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportCarFileRequest) SetProductInstanceId(v string) *ImportCarFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportCarFileRequest) SetFileObject(v io.Reader) *ImportCarFileRequest {
	s.FileObject = v
	return s
}

func (s *ImportCarFileRequest) SetFileObjectName(v string) *ImportCarFileRequest {
	s.FileObjectName = &v
	return s
}

func (s *ImportCarFileRequest) SetFileId(v string) *ImportCarFileRequest {
	s.FileId = &v
	return s
}

type ImportCarFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// xx
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
}

func (s ImportCarFileResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportCarFileResponse) GoString() string {
	return s.String()
}

func (s *ImportCarFileResponse) SetReqMsgId(v string) *ImportCarFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportCarFileResponse) SetResultCode(v string) *ImportCarFileResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportCarFileResponse) SetResultMsg(v string) *ImportCarFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportCarFileResponse) SetCode(v string) *ImportCarFileResponse {
	s.Code = &v
	return s
}

type QueryUsedcarRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 二手车信息
	UsedCarInfo *UsedCarInfo `json:"used_car_info,omitempty" xml:"used_car_info,omitempty" require:"true"`
	// 用户基本信息
	UserInfo *CarOwnerUserInfo `json:"user_info,omitempty" xml:"user_info,omitempty" require:"true"`
}

func (s QueryUsedcarRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryUsedcarRequest) GoString() string {
	return s.String()
}

func (s *QueryUsedcarRequest) SetAuthToken(v string) *QueryUsedcarRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryUsedcarRequest) SetProductInstanceId(v string) *QueryUsedcarRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryUsedcarRequest) SetSceneCode(v string) *QueryUsedcarRequest {
	s.SceneCode = &v
	return s
}

func (s *QueryUsedcarRequest) SetUsedCarInfo(v *UsedCarInfo) *QueryUsedcarRequest {
	s.UsedCarInfo = v
	return s
}

func (s *QueryUsedcarRequest) SetUserInfo(v *CarOwnerUserInfo) *QueryUsedcarRequest {
	s.UserInfo = v
	return s
}

type QueryUsedcarResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 二手车估值信息
	UsedCarValuation *UsedCarValuation `json:"used_car_valuation,omitempty" xml:"used_car_valuation,omitempty"`
	// 响应结果
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s QueryUsedcarResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryUsedcarResponse) GoString() string {
	return s.String()
}

func (s *QueryUsedcarResponse) SetReqMsgId(v string) *QueryUsedcarResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryUsedcarResponse) SetResultCode(v string) *QueryUsedcarResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryUsedcarResponse) SetResultMsg(v string) *QueryUsedcarResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryUsedcarResponse) SetUsedCarValuation(v *UsedCarValuation) *QueryUsedcarResponse {
	s.UsedCarValuation = v
	return s
}

func (s *QueryUsedcarResponse) SetStatus(v string) *QueryUsedcarResponse {
	s.Status = &v
	return s
}

type SubmitIonchiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 线索唯一标识
	SubmitId *string `json:"submit_id,omitempty" xml:"submit_id,omitempty" require:"true"`
	// 手机号md5
	MobileMd5 *string `json:"mobile_md5,omitempty" xml:"mobile_md5,omitempty" require:"true"`
}

func (s SubmitIonchiRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitIonchiRequest) GoString() string {
	return s.String()
}

func (s *SubmitIonchiRequest) SetAuthToken(v string) *SubmitIonchiRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitIonchiRequest) SetProductInstanceId(v string) *SubmitIonchiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitIonchiRequest) SetSubmitId(v string) *SubmitIonchiRequest {
	s.SubmitId = &v
	return s
}

func (s *SubmitIonchiRequest) SetMobileMd5(v string) *SubmitIonchiRequest {
	s.MobileMd5 = &v
	return s
}

type SubmitIonchiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 推送数科客户成功
	PushSuccess *bool `json:"push_success,omitempty" xml:"push_success,omitempty"`
}

func (s SubmitIonchiResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitIonchiResponse) GoString() string {
	return s.String()
}

func (s *SubmitIonchiResponse) SetReqMsgId(v string) *SubmitIonchiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitIonchiResponse) SetResultCode(v string) *SubmitIonchiResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitIonchiResponse) SetResultMsg(v string) *SubmitIonchiResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitIonchiResponse) SetPushSuccess(v bool) *SubmitIonchiResponse {
	s.PushSuccess = &v
	return s
}

type QueryGdFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户ID
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 实际请求体
	GdCustomerFlow *GdCustomerFlow `json:"gd_customer_flow,omitempty" xml:"gd_customer_flow,omitempty" require:"true"`
}

func (s QueryGdFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGdFlowRequest) GoString() string {
	return s.String()
}

func (s *QueryGdFlowRequest) SetAuthToken(v string) *QueryGdFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGdFlowRequest) SetProductInstanceId(v string) *QueryGdFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGdFlowRequest) SetSceneCode(v string) *QueryGdFlowRequest {
	s.SceneCode = &v
	return s
}

func (s *QueryGdFlowRequest) SetGdCustomerFlow(v *GdCustomerFlow) *QueryGdFlowRequest {
	s.GdCustomerFlow = v
	return s
}

type QueryGdFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回消息
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 返回编码，值为10000表示成功，其余值表示失败
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 随机返回id
	RequestLinkId *string `json:"request_link_id,omitempty" xml:"request_link_id,omitempty"`
	// 返回数据
	Data *GdCustomerInfo `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryGdFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGdFlowResponse) GoString() string {
	return s.String()
}

func (s *QueryGdFlowResponse) SetReqMsgId(v string) *QueryGdFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGdFlowResponse) SetResultCode(v string) *QueryGdFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGdFlowResponse) SetResultMsg(v string) *QueryGdFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGdFlowResponse) SetMsg(v string) *QueryGdFlowResponse {
	s.Msg = &v
	return s
}

func (s *QueryGdFlowResponse) SetCode(v int64) *QueryGdFlowResponse {
	s.Code = &v
	return s
}

func (s *QueryGdFlowResponse) SetRequestLinkId(v string) *QueryGdFlowResponse {
	s.RequestLinkId = &v
	return s
}

func (s *QueryGdFlowResponse) SetData(v *GdCustomerInfo) *QueryGdFlowResponse {
	s.Data = v
	return s
}

type QueryBatteryReportRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 充电报告
	BatteryReport *BatteryReport `json:"battery_report,omitempty" xml:"battery_report,omitempty" require:"true"`
	// 桩所属运营平台
	OperatorPlatform *string `json:"operator_platform,omitempty" xml:"operator_platform,omitempty" require:"true"`
	// 场站名称
	StationName *string `json:"station_name,omitempty" xml:"station_name,omitempty" require:"true"`
	// 场站ID
	StationId *string `json:"station_id,omitempty" xml:"station_id,omitempty" require:"true"`
	// 桩ID
	PileId *string `json:"pile_id,omitempty" xml:"pile_id,omitempty" require:"true"`
	// 枪序号（充电端口号）
	GunNo *int64 `json:"gun_no,omitempty" xml:"gun_no,omitempty" require:"true"`
	// 充电订单号
	ChargeOrderNo *string `json:"charge_order_no,omitempty" xml:"charge_order_no,omitempty" require:"true"`
	// 充电量，单位kWh
	ChargePower *string `json:"charge_power,omitempty" xml:"charge_power,omitempty" require:"true"`
	// 服务费，单位元
	ServiceFee *string `json:"service_fee,omitempty" xml:"service_fee,omitempty" require:"true"`
	// 电费，单位元
	ElectricityFee *string `json:"electricity_fee,omitempty" xml:"electricity_fee,omitempty" require:"true"`
	// 充电开始时间
	ChargeStartTime *string `json:"charge_start_time,omitempty" xml:"charge_start_time,omitempty" require:"true"`
	// 充电结束时间
	ChargeEndTime *string `json:"charge_end_time,omitempty" xml:"charge_end_time,omitempty" require:"true"`
	// 租户场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
}

func (s QueryBatteryReportRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBatteryReportRequest) GoString() string {
	return s.String()
}

func (s *QueryBatteryReportRequest) SetAuthToken(v string) *QueryBatteryReportRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBatteryReportRequest) SetProductInstanceId(v string) *QueryBatteryReportRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBatteryReportRequest) SetBatteryReport(v *BatteryReport) *QueryBatteryReportRequest {
	s.BatteryReport = v
	return s
}

func (s *QueryBatteryReportRequest) SetOperatorPlatform(v string) *QueryBatteryReportRequest {
	s.OperatorPlatform = &v
	return s
}

func (s *QueryBatteryReportRequest) SetStationName(v string) *QueryBatteryReportRequest {
	s.StationName = &v
	return s
}

func (s *QueryBatteryReportRequest) SetStationId(v string) *QueryBatteryReportRequest {
	s.StationId = &v
	return s
}

func (s *QueryBatteryReportRequest) SetPileId(v string) *QueryBatteryReportRequest {
	s.PileId = &v
	return s
}

func (s *QueryBatteryReportRequest) SetGunNo(v int64) *QueryBatteryReportRequest {
	s.GunNo = &v
	return s
}

func (s *QueryBatteryReportRequest) SetChargeOrderNo(v string) *QueryBatteryReportRequest {
	s.ChargeOrderNo = &v
	return s
}

func (s *QueryBatteryReportRequest) SetChargePower(v string) *QueryBatteryReportRequest {
	s.ChargePower = &v
	return s
}

func (s *QueryBatteryReportRequest) SetServiceFee(v string) *QueryBatteryReportRequest {
	s.ServiceFee = &v
	return s
}

func (s *QueryBatteryReportRequest) SetElectricityFee(v string) *QueryBatteryReportRequest {
	s.ElectricityFee = &v
	return s
}

func (s *QueryBatteryReportRequest) SetChargeStartTime(v string) *QueryBatteryReportRequest {
	s.ChargeStartTime = &v
	return s
}

func (s *QueryBatteryReportRequest) SetChargeEndTime(v string) *QueryBatteryReportRequest {
	s.ChargeEndTime = &v
	return s
}

func (s *QueryBatteryReportRequest) SetSceneCode(v string) *QueryBatteryReportRequest {
	s.SceneCode = &v
	return s
}

type QueryBatteryReportResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 成功或失败的编码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 成功或失败的提示语
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 返回数据（code=100时返回）
	Result *BatteryReportResult `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryBatteryReportResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBatteryReportResponse) GoString() string {
	return s.String()
}

func (s *QueryBatteryReportResponse) SetReqMsgId(v string) *QueryBatteryReportResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBatteryReportResponse) SetResultCode(v string) *QueryBatteryReportResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBatteryReportResponse) SetResultMsg(v string) *QueryBatteryReportResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBatteryReportResponse) SetCode(v string) *QueryBatteryReportResponse {
	s.Code = &v
	return s
}

func (s *QueryBatteryReportResponse) SetMsg(v string) *QueryBatteryReportResponse {
	s.Msg = &v
	return s
}

func (s *QueryBatteryReportResponse) SetResult(v *BatteryReportResult) *QueryBatteryReportResponse {
	s.Result = v
	return s
}

type QueryNewcarQczjRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询类型
	QueryType *string `json:"query_type,omitempty" xml:"query_type,omitempty" require:"true"`
	// 批量拉取数据时，上一次返回的afterSpecId
	AfterSpecId *string `json:"after_spec_id,omitempty" xml:"after_spec_id,omitempty"`
}

func (s QueryNewcarQczjRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryNewcarQczjRequest) GoString() string {
	return s.String()
}

func (s *QueryNewcarQczjRequest) SetAuthToken(v string) *QueryNewcarQczjRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryNewcarQczjRequest) SetProductInstanceId(v string) *QueryNewcarQczjRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryNewcarQczjRequest) SetQueryType(v string) *QueryNewcarQczjRequest {
	s.QueryType = &v
	return s
}

func (s *QueryNewcarQczjRequest) SetAfterSpecId(v string) *QueryNewcarQczjRequest {
	s.AfterSpecId = &v
	return s
}

type QueryNewcarQczjResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 0代表成功，其余代表失败
	Returncode *string `json:"returncode,omitempty" xml:"returncode,omitempty"`
	// 失败时错误消息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 城市结果结构体
	CityResult []*CityResult `json:"city_result,omitempty" xml:"city_result,omitempty" type:"Repeated"`
	// 车型结果结构体
	SpecResult *SpecResult `json:"spec_result,omitempty" xml:"spec_result,omitempty"`
}

func (s QueryNewcarQczjResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryNewcarQczjResponse) GoString() string {
	return s.String()
}

func (s *QueryNewcarQczjResponse) SetReqMsgId(v string) *QueryNewcarQczjResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryNewcarQczjResponse) SetResultCode(v string) *QueryNewcarQczjResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryNewcarQczjResponse) SetResultMsg(v string) *QueryNewcarQczjResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryNewcarQczjResponse) SetReturncode(v string) *QueryNewcarQczjResponse {
	s.Returncode = &v
	return s
}

func (s *QueryNewcarQczjResponse) SetMessage(v string) *QueryNewcarQczjResponse {
	s.Message = &v
	return s
}

func (s *QueryNewcarQczjResponse) SetCityResult(v []*CityResult) *QueryNewcarQczjResponse {
	s.CityResult = v
	return s
}

func (s *QueryNewcarQczjResponse) SetSpecResult(v *SpecResult) *QueryNewcarQczjResponse {
	s.SpecResult = v
	return s
}

type QueryGdStoreRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 查询店铺基本信息请求体
	GdCustomerFlow *GdCustomerFlow `json:"gd_customer_flow,omitempty" xml:"gd_customer_flow,omitempty" require:"true"`
}

func (s QueryGdStoreRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGdStoreRequest) GoString() string {
	return s.String()
}

func (s *QueryGdStoreRequest) SetAuthToken(v string) *QueryGdStoreRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGdStoreRequest) SetProductInstanceId(v string) *QueryGdStoreRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGdStoreRequest) SetSceneCode(v string) *QueryGdStoreRequest {
	s.SceneCode = &v
	return s
}

func (s *QueryGdStoreRequest) SetGdCustomerFlow(v *GdCustomerFlow) *QueryGdStoreRequest {
	s.GdCustomerFlow = v
	return s
}

type QueryGdStoreResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回消息
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 返回编码，值为10000表示成功，其余值表示失败
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 随即返回ID
	RequestLinkId *string `json:"request_link_id,omitempty" xml:"request_link_id,omitempty"`
	// 返回数据
	Data *GdStoreInfo `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryGdStoreResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGdStoreResponse) GoString() string {
	return s.String()
}

func (s *QueryGdStoreResponse) SetReqMsgId(v string) *QueryGdStoreResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGdStoreResponse) SetResultCode(v string) *QueryGdStoreResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGdStoreResponse) SetResultMsg(v string) *QueryGdStoreResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGdStoreResponse) SetMsg(v string) *QueryGdStoreResponse {
	s.Msg = &v
	return s
}

func (s *QueryGdStoreResponse) SetCode(v string) *QueryGdStoreResponse {
	s.Code = &v
	return s
}

func (s *QueryGdStoreResponse) SetRequestLinkId(v string) *QueryGdStoreResponse {
	s.RequestLinkId = &v
	return s
}

func (s *QueryGdStoreResponse) SetData(v *GdStoreInfo) *QueryGdStoreResponse {
	s.Data = v
	return s
}

type QueryGdPoentialRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 潜客指数接口请求体
	GdCustomerFlow *GdCustomerFlow `json:"gd_customer_flow,omitempty" xml:"gd_customer_flow,omitempty" require:"true"`
}

func (s QueryGdPoentialRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGdPoentialRequest) GoString() string {
	return s.String()
}

func (s *QueryGdPoentialRequest) SetAuthToken(v string) *QueryGdPoentialRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGdPoentialRequest) SetProductInstanceId(v string) *QueryGdPoentialRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGdPoentialRequest) SetSceneCode(v string) *QueryGdPoentialRequest {
	s.SceneCode = &v
	return s
}

func (s *QueryGdPoentialRequest) SetGdCustomerFlow(v *GdCustomerFlow) *QueryGdPoentialRequest {
	s.GdCustomerFlow = v
	return s
}

type QueryGdPoentialResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回消息
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 返回编码，值为10000表示成功，其余值表示失败
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 随机返回id
	RequestLinkId *string `json:"request_link_id,omitempty" xml:"request_link_id,omitempty"`
	// 返回数据
	Data *GdPotentialCustomerInfo `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryGdPoentialResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGdPoentialResponse) GoString() string {
	return s.String()
}

func (s *QueryGdPoentialResponse) SetReqMsgId(v string) *QueryGdPoentialResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGdPoentialResponse) SetResultCode(v string) *QueryGdPoentialResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGdPoentialResponse) SetResultMsg(v string) *QueryGdPoentialResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGdPoentialResponse) SetMsg(v string) *QueryGdPoentialResponse {
	s.Msg = &v
	return s
}

func (s *QueryGdPoentialResponse) SetCode(v int64) *QueryGdPoentialResponse {
	s.Code = &v
	return s
}

func (s *QueryGdPoentialResponse) SetRequestLinkId(v string) *QueryGdPoentialResponse {
	s.RequestLinkId = &v
	return s
}

func (s *QueryGdPoentialResponse) SetData(v *GdPotentialCustomerInfo) *QueryGdPoentialResponse {
	s.Data = v
	return s
}

type RegisterCdsqScratchesRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 平台名称
	PartnerCode *string `json:"partner_code,omitempty" xml:"partner_code,omitempty" require:"true"`
	// 交易流水号
	TransactionNo *string `json:"transaction_no,omitempty" xml:"transaction_no,omitempty" require:"true"`
	// 用户ID
	Userid *string `json:"userid,omitempty" xml:"userid,omitempty"`
	// 购买时间
	Buytime *string `json:"buytime,omitempty" xml:"buytime,omitempty"`
	// 车牌号
	CarNo *string `json:"car_no,omitempty" xml:"car_no,omitempty" require:"true"`
	// 停车地址
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
}

func (s RegisterCdsqScratchesRequest) String() string {
	return tea.Prettify(s)
}

func (s RegisterCdsqScratchesRequest) GoString() string {
	return s.String()
}

func (s *RegisterCdsqScratchesRequest) SetAuthToken(v string) *RegisterCdsqScratchesRequest {
	s.AuthToken = &v
	return s
}

func (s *RegisterCdsqScratchesRequest) SetProductInstanceId(v string) *RegisterCdsqScratchesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RegisterCdsqScratchesRequest) SetPartnerCode(v string) *RegisterCdsqScratchesRequest {
	s.PartnerCode = &v
	return s
}

func (s *RegisterCdsqScratchesRequest) SetTransactionNo(v string) *RegisterCdsqScratchesRequest {
	s.TransactionNo = &v
	return s
}

func (s *RegisterCdsqScratchesRequest) SetUserid(v string) *RegisterCdsqScratchesRequest {
	s.Userid = &v
	return s
}

func (s *RegisterCdsqScratchesRequest) SetBuytime(v string) *RegisterCdsqScratchesRequest {
	s.Buytime = &v
	return s
}

func (s *RegisterCdsqScratchesRequest) SetCarNo(v string) *RegisterCdsqScratchesRequest {
	s.CarNo = &v
	return s
}

func (s *RegisterCdsqScratchesRequest) SetAddress(v string) *RegisterCdsqScratchesRequest {
	s.Address = &v
	return s
}

func (s *RegisterCdsqScratchesRequest) SetSceneCode(v string) *RegisterCdsqScratchesRequest {
	s.SceneCode = &v
	return s
}

type RegisterCdsqScratchesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果码，999999 表示成功
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 错误信息，成功时为空
	ResponseMsg *string `json:"response_msg,omitempty" xml:"response_msg,omitempty"`
	// 保单服务号
	PolicyNo *string `json:"policy_no,omitempty" xml:"policy_no,omitempty"`
	// 保险起期，格式：yyyy-MM-dd HH:mm:ss
	PolicyStart *string `json:"policy_start,omitempty" xml:"policy_start,omitempty"`
	// 保险止期，格式：yyyy-MM-dd HH:mm:ss
	PolicyEnd *string `json:"policy_end,omitempty" xml:"policy_end,omitempty"`
}

func (s RegisterCdsqScratchesResponse) String() string {
	return tea.Prettify(s)
}

func (s RegisterCdsqScratchesResponse) GoString() string {
	return s.String()
}

func (s *RegisterCdsqScratchesResponse) SetReqMsgId(v string) *RegisterCdsqScratchesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RegisterCdsqScratchesResponse) SetResultCode(v string) *RegisterCdsqScratchesResponse {
	s.ResultCode = &v
	return s
}

func (s *RegisterCdsqScratchesResponse) SetResultMsg(v string) *RegisterCdsqScratchesResponse {
	s.ResultMsg = &v
	return s
}

func (s *RegisterCdsqScratchesResponse) SetResponseCode(v string) *RegisterCdsqScratchesResponse {
	s.ResponseCode = &v
	return s
}

func (s *RegisterCdsqScratchesResponse) SetResponseMsg(v string) *RegisterCdsqScratchesResponse {
	s.ResponseMsg = &v
	return s
}

func (s *RegisterCdsqScratchesResponse) SetPolicyNo(v string) *RegisterCdsqScratchesResponse {
	s.PolicyNo = &v
	return s
}

func (s *RegisterCdsqScratchesResponse) SetPolicyStart(v string) *RegisterCdsqScratchesResponse {
	s.PolicyStart = &v
	return s
}

func (s *RegisterCdsqScratchesResponse) SetPolicyEnd(v string) *RegisterCdsqScratchesResponse {
	s.PolicyEnd = &v
	return s
}

type QueryCdsqScratchesRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 平台名称
	PartnerCode *string `json:"partner_code,omitempty" xml:"partner_code,omitempty" require:"true"`
	// 交易流水号
	TransactionNo *string `json:"transaction_no,omitempty" xml:"transaction_no,omitempty" require:"true"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
}

func (s QueryCdsqScratchesRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCdsqScratchesRequest) GoString() string {
	return s.String()
}

func (s *QueryCdsqScratchesRequest) SetAuthToken(v string) *QueryCdsqScratchesRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCdsqScratchesRequest) SetProductInstanceId(v string) *QueryCdsqScratchesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCdsqScratchesRequest) SetPartnerCode(v string) *QueryCdsqScratchesRequest {
	s.PartnerCode = &v
	return s
}

func (s *QueryCdsqScratchesRequest) SetTransactionNo(v string) *QueryCdsqScratchesRequest {
	s.TransactionNo = &v
	return s
}

func (s *QueryCdsqScratchesRequest) SetSceneCode(v string) *QueryCdsqScratchesRequest {
	s.SceneCode = &v
	return s
}

type QueryCdsqScratchesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果码，999999 表示成功
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 错误信息，成功时为空
	ResponseMsg *string `json:"response_msg,omitempty" xml:"response_msg,omitempty"`
	// 电子保单 url 地址
	ReturnPdfValue *string `json:"return_pdf_value,omitempty" xml:"return_pdf_value,omitempty"`
	// 保单服务号
	PolicyNo *string `json:"policy_no,omitempty" xml:"policy_no,omitempty"`
	// 保单生效时间，格式：yyyy-MM-dd HH:mm:ss
	BeginTime *string `json:"begin_time,omitempty" xml:"begin_time,omitempty"`
	// 保单失效时间，格式：yyyy-MM-dd HH:mm:ss
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty"`
}

func (s QueryCdsqScratchesResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCdsqScratchesResponse) GoString() string {
	return s.String()
}

func (s *QueryCdsqScratchesResponse) SetReqMsgId(v string) *QueryCdsqScratchesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCdsqScratchesResponse) SetResultCode(v string) *QueryCdsqScratchesResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCdsqScratchesResponse) SetResultMsg(v string) *QueryCdsqScratchesResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCdsqScratchesResponse) SetResponseCode(v string) *QueryCdsqScratchesResponse {
	s.ResponseCode = &v
	return s
}

func (s *QueryCdsqScratchesResponse) SetResponseMsg(v string) *QueryCdsqScratchesResponse {
	s.ResponseMsg = &v
	return s
}

func (s *QueryCdsqScratchesResponse) SetReturnPdfValue(v string) *QueryCdsqScratchesResponse {
	s.ReturnPdfValue = &v
	return s
}

func (s *QueryCdsqScratchesResponse) SetPolicyNo(v string) *QueryCdsqScratchesResponse {
	s.PolicyNo = &v
	return s
}

func (s *QueryCdsqScratchesResponse) SetBeginTime(v string) *QueryCdsqScratchesResponse {
	s.BeginTime = &v
	return s
}

func (s *QueryCdsqScratchesResponse) SetEndTime(v string) *QueryCdsqScratchesResponse {
	s.EndTime = &v
	return s
}

type DeleteCdsqScratchesRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 平台名称
	PartnerCode *string `json:"partner_code,omitempty" xml:"partner_code,omitempty" require:"true"`
	// 交易流水号
	TransactionNo *string `json:"transaction_no,omitempty" xml:"transaction_no,omitempty" require:"true"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
}

func (s DeleteCdsqScratchesRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteCdsqScratchesRequest) GoString() string {
	return s.String()
}

func (s *DeleteCdsqScratchesRequest) SetAuthToken(v string) *DeleteCdsqScratchesRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteCdsqScratchesRequest) SetProductInstanceId(v string) *DeleteCdsqScratchesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteCdsqScratchesRequest) SetPartnerCode(v string) *DeleteCdsqScratchesRequest {
	s.PartnerCode = &v
	return s
}

func (s *DeleteCdsqScratchesRequest) SetTransactionNo(v string) *DeleteCdsqScratchesRequest {
	s.TransactionNo = &v
	return s
}

func (s *DeleteCdsqScratchesRequest) SetSceneCode(v string) *DeleteCdsqScratchesRequest {
	s.SceneCode = &v
	return s
}

type DeleteCdsqScratchesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果码，999999 表示成功
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 错误信息，成功时为空
	ResponseMsg *string `json:"response_msg,omitempty" xml:"response_msg,omitempty"`
}

func (s DeleteCdsqScratchesResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteCdsqScratchesResponse) GoString() string {
	return s.String()
}

func (s *DeleteCdsqScratchesResponse) SetReqMsgId(v string) *DeleteCdsqScratchesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteCdsqScratchesResponse) SetResultCode(v string) *DeleteCdsqScratchesResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteCdsqScratchesResponse) SetResultMsg(v string) *DeleteCdsqScratchesResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteCdsqScratchesResponse) SetResponseCode(v string) *DeleteCdsqScratchesResponse {
	s.ResponseCode = &v
	return s
}

func (s *DeleteCdsqScratchesResponse) SetResponseMsg(v string) *DeleteCdsqScratchesResponse {
	s.ResponseMsg = &v
	return s
}

type CallbackCdsqScratchesRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 交易流水号
	TransactionNo *string `json:"transaction_no,omitempty" xml:"transaction_no,omitempty" require:"true"`
}

func (s CallbackCdsqScratchesRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackCdsqScratchesRequest) GoString() string {
	return s.String()
}

func (s *CallbackCdsqScratchesRequest) SetAuthToken(v string) *CallbackCdsqScratchesRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackCdsqScratchesRequest) SetProductInstanceId(v string) *CallbackCdsqScratchesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackCdsqScratchesRequest) SetTransactionNo(v string) *CallbackCdsqScratchesRequest {
	s.TransactionNo = &v
	return s
}

type CallbackCdsqScratchesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果码，999999 表示成功
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 错误信息，成功时为空
	ResponseMsg *string `json:"response_msg,omitempty" xml:"response_msg,omitempty"`
}

func (s CallbackCdsqScratchesResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackCdsqScratchesResponse) GoString() string {
	return s.String()
}

func (s *CallbackCdsqScratchesResponse) SetReqMsgId(v string) *CallbackCdsqScratchesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackCdsqScratchesResponse) SetResultCode(v string) *CallbackCdsqScratchesResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackCdsqScratchesResponse) SetResultMsg(v string) *CallbackCdsqScratchesResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackCdsqScratchesResponse) SetResponseCode(v string) *CallbackCdsqScratchesResponse {
	s.ResponseCode = &v
	return s
}

func (s *CallbackCdsqScratchesResponse) SetResponseMsg(v string) *CallbackCdsqScratchesResponse {
	s.ResponseMsg = &v
	return s
}

type SaveCdsqScratchesRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 平台名称
	PartnerCode *string `json:"partner_code,omitempty" xml:"partner_code,omitempty" require:"true"`
	// 交易流水号
	TransactionNo *string `json:"transaction_no,omitempty" xml:"transaction_no,omitempty" require:"true"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
}

func (s SaveCdsqScratchesRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveCdsqScratchesRequest) GoString() string {
	return s.String()
}

func (s *SaveCdsqScratchesRequest) SetAuthToken(v string) *SaveCdsqScratchesRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveCdsqScratchesRequest) SetProductInstanceId(v string) *SaveCdsqScratchesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveCdsqScratchesRequest) SetPartnerCode(v string) *SaveCdsqScratchesRequest {
	s.PartnerCode = &v
	return s
}

func (s *SaveCdsqScratchesRequest) SetTransactionNo(v string) *SaveCdsqScratchesRequest {
	s.TransactionNo = &v
	return s
}

func (s *SaveCdsqScratchesRequest) SetSceneCode(v string) *SaveCdsqScratchesRequest {
	s.SceneCode = &v
	return s
}

type SaveCdsqScratchesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果码，999999 表示成功
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 错误信息，成功时为空
	ResponseMsg *string `json:"response_msg,omitempty" xml:"response_msg,omitempty"`
	// 保单状态：1-投保，2-退保
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s SaveCdsqScratchesResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveCdsqScratchesResponse) GoString() string {
	return s.String()
}

func (s *SaveCdsqScratchesResponse) SetReqMsgId(v string) *SaveCdsqScratchesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveCdsqScratchesResponse) SetResultCode(v string) *SaveCdsqScratchesResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveCdsqScratchesResponse) SetResultMsg(v string) *SaveCdsqScratchesResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveCdsqScratchesResponse) SetResponseCode(v string) *SaveCdsqScratchesResponse {
	s.ResponseCode = &v
	return s
}

func (s *SaveCdsqScratchesResponse) SetResponseMsg(v string) *SaveCdsqScratchesResponse {
	s.ResponseMsg = &v
	return s
}

func (s *SaveCdsqScratchesResponse) SetStatus(v string) *SaveCdsqScratchesResponse {
	s.Status = &v
	return s
}

type QueryCarVinRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 车架号
	VinCode *string `json:"vin_code,omitempty" xml:"vin_code,omitempty" require:"true"`
}

func (s QueryCarVinRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCarVinRequest) GoString() string {
	return s.String()
}

func (s *QueryCarVinRequest) SetAuthToken(v string) *QueryCarVinRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCarVinRequest) SetProductInstanceId(v string) *QueryCarVinRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCarVinRequest) SetSceneCode(v string) *QueryCarVinRequest {
	s.SceneCode = &v
	return s
}

func (s *QueryCarVinRequest) SetVinCode(v string) *QueryCarVinRequest {
	s.VinCode = &v
	return s
}

type QueryCarVinResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 响应码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 响应消息
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 0:同意，1:拒绝，-1:校验失败
	Data *int64 `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryCarVinResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCarVinResponse) GoString() string {
	return s.String()
}

func (s *QueryCarVinResponse) SetReqMsgId(v string) *QueryCarVinResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCarVinResponse) SetResultCode(v string) *QueryCarVinResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCarVinResponse) SetResultMsg(v string) *QueryCarVinResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCarVinResponse) SetCode(v int64) *QueryCarVinResponse {
	s.Code = &v
	return s
}

func (s *QueryCarVinResponse) SetMsg(v string) *QueryCarVinResponse {
	s.Msg = &v
	return s
}

func (s *QueryCarVinResponse) SetData(v int64) *QueryCarVinResponse {
	s.Data = &v
	return s
}

type RegisterTagChanganRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授权码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
}

func (s RegisterTagChanganRequest) String() string {
	return tea.Prettify(s)
}

func (s RegisterTagChanganRequest) GoString() string {
	return s.String()
}

func (s *RegisterTagChanganRequest) SetAuthToken(v string) *RegisterTagChanganRequest {
	s.AuthToken = &v
	return s
}

func (s *RegisterTagChanganRequest) SetProductInstanceId(v string) *RegisterTagChanganRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RegisterTagChanganRequest) SetSceneCode(v string) *RegisterTagChanganRequest {
	s.SceneCode = &v
	return s
}

type RegisterTagChanganResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权码
	AccessToken *string `json:"access_token,omitempty" xml:"access_token,omitempty"`
	// 授权码过期时间，单位s，默认2小时（7200s）
	ExpiresIn *int64 `json:"expires_in,omitempty" xml:"expires_in,omitempty"`
}

func (s RegisterTagChanganResponse) String() string {
	return tea.Prettify(s)
}

func (s RegisterTagChanganResponse) GoString() string {
	return s.String()
}

func (s *RegisterTagChanganResponse) SetReqMsgId(v string) *RegisterTagChanganResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RegisterTagChanganResponse) SetResultCode(v string) *RegisterTagChanganResponse {
	s.ResultCode = &v
	return s
}

func (s *RegisterTagChanganResponse) SetResultMsg(v string) *RegisterTagChanganResponse {
	s.ResultMsg = &v
	return s
}

func (s *RegisterTagChanganResponse) SetAccessToken(v string) *RegisterTagChanganResponse {
	s.AccessToken = &v
	return s
}

func (s *RegisterTagChanganResponse) SetExpiresIn(v int64) *RegisterTagChanganResponse {
	s.ExpiresIn = &v
	return s
}

type QueryTagChanganRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 授权token
	AccessToken *string `json:"access_token,omitempty" xml:"access_token,omitempty" require:"true"`
	// 请求唯一ID（UUID生成即可）
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 系统
	Os *string `json:"os,omitempty" xml:"os,omitempty"`
	// 标签库组合：
	// 1表示基础标签
	// 2表示行业标签
	// 3表示基础标签+行业标签
	// 8表示自定义标签
	// 9表示基础标签+自定义标签
	// 10表示行业标签+自定义标签
	// 11表示基础标签+行业标签+自定义标签
	Type *int64 `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 设备信息
	DeviceInfoList *DeviceBean `json:"device_info_list,omitempty" xml:"device_info_list,omitempty" require:"true"`
	// 基础标签动态参数（对外编码）
	BaseTags []*string `json:"base_tags,omitempty" xml:"base_tags,omitempty" type:"Repeated"`
	// 行业标签动态参数（对外编码）
	IndustyTags []*string `json:"industy_tags,omitempty" xml:"industy_tags,omitempty" type:"Repeated"`
	// 规则标签动态参数（对外编码）
	BusinessTags []*string `json:"business_tags,omitempty" xml:"business_tags,omitempty" type:"Repeated"`
}

func (s QueryTagChanganRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTagChanganRequest) GoString() string {
	return s.String()
}

func (s *QueryTagChanganRequest) SetAuthToken(v string) *QueryTagChanganRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTagChanganRequest) SetProductInstanceId(v string) *QueryTagChanganRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTagChanganRequest) SetSceneCode(v string) *QueryTagChanganRequest {
	s.SceneCode = &v
	return s
}

func (s *QueryTagChanganRequest) SetAccessToken(v string) *QueryTagChanganRequest {
	s.AccessToken = &v
	return s
}

func (s *QueryTagChanganRequest) SetRequestId(v string) *QueryTagChanganRequest {
	s.RequestId = &v
	return s
}

func (s *QueryTagChanganRequest) SetOs(v string) *QueryTagChanganRequest {
	s.Os = &v
	return s
}

func (s *QueryTagChanganRequest) SetType(v int64) *QueryTagChanganRequest {
	s.Type = &v
	return s
}

func (s *QueryTagChanganRequest) SetDeviceInfoList(v *DeviceBean) *QueryTagChanganRequest {
	s.DeviceInfoList = v
	return s
}

func (s *QueryTagChanganRequest) SetBaseTags(v []*string) *QueryTagChanganRequest {
	s.BaseTags = v
	return s
}

func (s *QueryTagChanganRequest) SetIndustyTags(v []*string) *QueryTagChanganRequest {
	s.IndustyTags = v
	return s
}

func (s *QueryTagChanganRequest) SetBusinessTags(v []*string) *QueryTagChanganRequest {
	s.BusinessTags = v
	return s
}

type QueryTagChanganResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回数据，JSON格式字符串
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryTagChanganResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTagChanganResponse) GoString() string {
	return s.String()
}

func (s *QueryTagChanganResponse) SetReqMsgId(v string) *QueryTagChanganResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTagChanganResponse) SetResultCode(v string) *QueryTagChanganResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTagChanganResponse) SetResultMsg(v string) *QueryTagChanganResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTagChanganResponse) SetData(v string) *QueryTagChanganResponse {
	s.Data = &v
	return s
}

type QueryUsedcarAreaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
}

func (s QueryUsedcarAreaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryUsedcarAreaRequest) GoString() string {
	return s.String()
}

func (s *QueryUsedcarAreaRequest) SetAuthToken(v string) *QueryUsedcarAreaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryUsedcarAreaRequest) SetProductInstanceId(v string) *QueryUsedcarAreaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryUsedcarAreaRequest) SetSceneCode(v string) *QueryUsedcarAreaRequest {
	s.SceneCode = &v
	return s
}

type QueryUsedcarAreaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 响应码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 响应信息
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 省份集合
	Province []*Province `json:"province,omitempty" xml:"province,omitempty" type:"Repeated"`
	// 城市集合
	City []*City `json:"city,omitempty" xml:"city,omitempty" type:"Repeated"`
	// 区县集合
	County []*County `json:"county,omitempty" xml:"county,omitempty" type:"Repeated"`
}

func (s QueryUsedcarAreaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryUsedcarAreaResponse) GoString() string {
	return s.String()
}

func (s *QueryUsedcarAreaResponse) SetReqMsgId(v string) *QueryUsedcarAreaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryUsedcarAreaResponse) SetResultCode(v string) *QueryUsedcarAreaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryUsedcarAreaResponse) SetResultMsg(v string) *QueryUsedcarAreaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryUsedcarAreaResponse) SetCode(v string) *QueryUsedcarAreaResponse {
	s.Code = &v
	return s
}

func (s *QueryUsedcarAreaResponse) SetMsg(v string) *QueryUsedcarAreaResponse {
	s.Msg = &v
	return s
}

func (s *QueryUsedcarAreaResponse) SetProvince(v []*Province) *QueryUsedcarAreaResponse {
	s.Province = v
	return s
}

func (s *QueryUsedcarAreaResponse) SetCity(v []*City) *QueryUsedcarAreaResponse {
	s.City = v
	return s
}

func (s *QueryUsedcarAreaResponse) SetCounty(v []*County) *QueryUsedcarAreaResponse {
	s.County = v
	return s
}

type QueryUsedcarBrandsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
}

func (s QueryUsedcarBrandsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryUsedcarBrandsRequest) GoString() string {
	return s.String()
}

func (s *QueryUsedcarBrandsRequest) SetAuthToken(v string) *QueryUsedcarBrandsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryUsedcarBrandsRequest) SetProductInstanceId(v string) *QueryUsedcarBrandsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryUsedcarBrandsRequest) SetSceneCode(v string) *QueryUsedcarBrandsRequest {
	s.SceneCode = &v
	return s
}

type QueryUsedcarBrandsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// xxx
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// xxx
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 123
	Brandlist []*Brandlist `json:"brandlist,omitempty" xml:"brandlist,omitempty" type:"Repeated"`
}

func (s QueryUsedcarBrandsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryUsedcarBrandsResponse) GoString() string {
	return s.String()
}

func (s *QueryUsedcarBrandsResponse) SetReqMsgId(v string) *QueryUsedcarBrandsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryUsedcarBrandsResponse) SetResultCode(v string) *QueryUsedcarBrandsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryUsedcarBrandsResponse) SetResultMsg(v string) *QueryUsedcarBrandsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryUsedcarBrandsResponse) SetCode(v string) *QueryUsedcarBrandsResponse {
	s.Code = &v
	return s
}

func (s *QueryUsedcarBrandsResponse) SetMsg(v string) *QueryUsedcarBrandsResponse {
	s.Msg = &v
	return s
}

func (s *QueryUsedcarBrandsResponse) SetBrandlist(v []*Brandlist) *QueryUsedcarBrandsResponse {
	s.Brandlist = v
	return s
}

type QueryUsedcarSeriesRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 品牌id
	BrandId *string `json:"brand_id,omitempty" xml:"brand_id,omitempty" require:"true"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
}

func (s QueryUsedcarSeriesRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryUsedcarSeriesRequest) GoString() string {
	return s.String()
}

func (s *QueryUsedcarSeriesRequest) SetAuthToken(v string) *QueryUsedcarSeriesRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryUsedcarSeriesRequest) SetProductInstanceId(v string) *QueryUsedcarSeriesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryUsedcarSeriesRequest) SetBrandId(v string) *QueryUsedcarSeriesRequest {
	s.BrandId = &v
	return s
}

func (s *QueryUsedcarSeriesRequest) SetSceneCode(v string) *QueryUsedcarSeriesRequest {
	s.SceneCode = &v
	return s
}

type QueryUsedcarSeriesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 品牌id
	Brandid *string `json:"brandid,omitempty" xml:"brandid,omitempty"`
	// 车系信息
	Serieslist []*LetterInfo `json:"serieslist,omitempty" xml:"serieslist,omitempty" type:"Repeated"`
	// 品牌名称
	Brandname *string `json:"brandname,omitempty" xml:"brandname,omitempty"`
	// 状态码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 响应结果
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryUsedcarSeriesResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryUsedcarSeriesResponse) GoString() string {
	return s.String()
}

func (s *QueryUsedcarSeriesResponse) SetReqMsgId(v string) *QueryUsedcarSeriesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryUsedcarSeriesResponse) SetResultCode(v string) *QueryUsedcarSeriesResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryUsedcarSeriesResponse) SetResultMsg(v string) *QueryUsedcarSeriesResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryUsedcarSeriesResponse) SetBrandid(v string) *QueryUsedcarSeriesResponse {
	s.Brandid = &v
	return s
}

func (s *QueryUsedcarSeriesResponse) SetSerieslist(v []*LetterInfo) *QueryUsedcarSeriesResponse {
	s.Serieslist = v
	return s
}

func (s *QueryUsedcarSeriesResponse) SetBrandname(v string) *QueryUsedcarSeriesResponse {
	s.Brandname = &v
	return s
}

func (s *QueryUsedcarSeriesResponse) SetCode(v string) *QueryUsedcarSeriesResponse {
	s.Code = &v
	return s
}

func (s *QueryUsedcarSeriesResponse) SetMsg(v string) *QueryUsedcarSeriesResponse {
	s.Msg = &v
	return s
}

type QueryUsedcarProductsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 车系id
	SeriesId *string `json:"series_id,omitempty" xml:"series_id,omitempty" require:"true"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
}

func (s QueryUsedcarProductsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryUsedcarProductsRequest) GoString() string {
	return s.String()
}

func (s *QueryUsedcarProductsRequest) SetAuthToken(v string) *QueryUsedcarProductsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryUsedcarProductsRequest) SetProductInstanceId(v string) *QueryUsedcarProductsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryUsedcarProductsRequest) SetSeriesId(v string) *QueryUsedcarProductsRequest {
	s.SeriesId = &v
	return s
}

func (s *QueryUsedcarProductsRequest) SetSceneCode(v string) *QueryUsedcarProductsRequest {
	s.SceneCode = &v
	return s
}

type QueryUsedcarProductsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 状态信息
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 车系名
	Seriesname *string `json:"seriesname,omitempty" xml:"seriesname,omitempty"`
	// 车系id
	Seriesid *string `json:"seriesid,omitempty" xml:"seriesid,omitempty"`
	// 车型信息
	Productlist []*ProductInfo `json:"productlist,omitempty" xml:"productlist,omitempty" type:"Repeated"`
}

func (s QueryUsedcarProductsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryUsedcarProductsResponse) GoString() string {
	return s.String()
}

func (s *QueryUsedcarProductsResponse) SetReqMsgId(v string) *QueryUsedcarProductsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryUsedcarProductsResponse) SetResultCode(v string) *QueryUsedcarProductsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryUsedcarProductsResponse) SetResultMsg(v string) *QueryUsedcarProductsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryUsedcarProductsResponse) SetCode(v string) *QueryUsedcarProductsResponse {
	s.Code = &v
	return s
}

func (s *QueryUsedcarProductsResponse) SetMsg(v string) *QueryUsedcarProductsResponse {
	s.Msg = &v
	return s
}

func (s *QueryUsedcarProductsResponse) SetSeriesname(v string) *QueryUsedcarProductsResponse {
	s.Seriesname = &v
	return s
}

func (s *QueryUsedcarProductsResponse) SetSeriesid(v string) *QueryUsedcarProductsResponse {
	s.Seriesid = &v
	return s
}

func (s *QueryUsedcarProductsResponse) SetProductlist(v []*ProductInfo) *QueryUsedcarProductsResponse {
	s.Productlist = v
	return s
}

type SyncUsedcarRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 线索状态列表
	LeadIdList []*string `json:"lead_id_list,omitempty" xml:"lead_id_list,omitempty" require:"true" type:"Repeated"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
}

func (s SyncUsedcarRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncUsedcarRequest) GoString() string {
	return s.String()
}

func (s *SyncUsedcarRequest) SetAuthToken(v string) *SyncUsedcarRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncUsedcarRequest) SetProductInstanceId(v string) *SyncUsedcarRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncUsedcarRequest) SetLeadIdList(v []*string) *SyncUsedcarRequest {
	s.LeadIdList = v
	return s
}

func (s *SyncUsedcarRequest) SetSceneCode(v string) *SyncUsedcarRequest {
	s.SceneCode = &v
	return s
}

type SyncUsedcarResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 响应值
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 响应信息
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 线索状态信息列表
	Data []*LeadInfo `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s SyncUsedcarResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncUsedcarResponse) GoString() string {
	return s.String()
}

func (s *SyncUsedcarResponse) SetReqMsgId(v string) *SyncUsedcarResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncUsedcarResponse) SetResultCode(v string) *SyncUsedcarResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncUsedcarResponse) SetResultMsg(v string) *SyncUsedcarResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncUsedcarResponse) SetCode(v string) *SyncUsedcarResponse {
	s.Code = &v
	return s
}

func (s *SyncUsedcarResponse) SetMsg(v string) *SyncUsedcarResponse {
	s.Msg = &v
	return s
}

func (s *SyncUsedcarResponse) SetData(v []*LeadInfo) *SyncUsedcarResponse {
	s.Data = v
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
				"sdk_version":      tea.String("1.0.34"),
				"_prod_code":       tea.String("INTELLICAR"),
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
 * Description: 推送星贷车信息
 * Summary: 推送星贷车信息
 */
func (client *Client) PushCarloan(request *PushCarloanRequest) (_result *PushCarloanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushCarloanResponse{}
	_body, _err := client.PushCarloanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 推送星贷车信息
 * Summary: 推送星贷车信息
 */
func (client *Client) PushCarloanEx(request *PushCarloanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushCarloanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushCarloanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.carloan.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 车主信息提交
 * Summary:  车主信息提交
 */
func (client *Client) RegisterCarowner(request *RegisterCarownerRequest) (_result *RegisterCarownerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RegisterCarownerResponse{}
	_body, _err := client.RegisterCarownerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 车主信息提交
 * Summary:  车主信息提交
 */
func (client *Client) RegisterCarownerEx(request *RegisterCarownerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RegisterCarownerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RegisterCarownerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.carowner.register"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新车线索批量提交
 * Summary: 新车线索批量提交
 */
func (client *Client) BatchcreateNewcar(request *BatchcreateNewcarRequest) (_result *BatchcreateNewcarResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchcreateNewcarResponse{}
	_body, _err := client.BatchcreateNewcarEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新车线索批量提交
 * Summary: 新车线索批量提交
 */
func (client *Client) BatchcreateNewcarEx(request *BatchcreateNewcarRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchcreateNewcarResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchcreateNewcarResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.newcar.batchcreate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交新车线索
 * Summary:  提交新车线索
 */
func (client *Client) SubmitNewcar(request *SubmitNewcarRequest) (_result *SubmitNewcarResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitNewcarResponse{}
	_body, _err := client.SubmitNewcarEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交新车线索
 * Summary:  提交新车线索
 */
func (client *Client) SubmitNewcarEx(request *SubmitNewcarRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitNewcarResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitNewcarResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.newcar.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 常岳线索推送接口
 * Summary: 常岳线索推送
 */
func (client *Client) RegisterCarownerCy(request *RegisterCarownerCyRequest) (_result *RegisterCarownerCyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RegisterCarownerCyResponse{}
	_body, _err := client.RegisterCarownerCyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 常岳线索推送接口
 * Summary: 常岳线索推送
 */
func (client *Client) RegisterCarownerCyEx(request *RegisterCarownerCyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RegisterCarownerCyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RegisterCarownerCyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.carowner.cy.register"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 车辆价格查询
 * Summary: 车辆价格查询
 */
func (client *Client) QueryCarPrice(request *QueryCarPriceRequest) (_result *QueryCarPriceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCarPriceResponse{}
	_body, _err := client.QueryCarPriceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 车辆价格查询
 * Summary: 车辆价格查询
 */
func (client *Client) QueryCarPriceEx(request *QueryCarPriceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCarPriceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCarPriceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.car.price.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 文件引入
 * Summary: 文件引入
 */
func (client *Client) ImportCarFile(request *ImportCarFileRequest) (_result *ImportCarFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportCarFileResponse{}
	_body, _err := client.ImportCarFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 文件引入
 * Summary: 文件引入
 */
func (client *Client) ImportCarFileEx(request *ImportCarFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportCarFileResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antdigital.intellicar.car.file.import"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			importCarFileResponse := &ImportCarFileResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = importCarFileResponse
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
	_result = &ImportCarFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.car.file.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 汽车之家区域接口
 * Summary: 汽车之家区域接口
 */
func (client *Client) QueryUsedcar(request *QueryUsedcarRequest) (_result *QueryUsedcarResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryUsedcarResponse{}
	_body, _err := client.QueryUsedcarEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 汽车之家区域接口
 * Summary: 汽车之家区域接口
 */
func (client *Client) QueryUsedcarEx(request *QueryUsedcarRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryUsedcarResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryUsedcarResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.usedcar.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 逸安启回调接口
 * Summary: 逸安启回调接口
 */
func (client *Client) SubmitIonchi(request *SubmitIonchiRequest) (_result *SubmitIonchiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitIonchiResponse{}
	_body, _err := client.SubmitIonchiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 逸安启回调接口
 * Summary: 逸安启回调接口
 */
func (client *Client) SubmitIonchiEx(request *SubmitIonchiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitIonchiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitIonchiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.ionchi.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 对接高德，查询潜客流向以及重叠的数据
 * Summary: 【高德】流向与重叠数据
 */
func (client *Client) QueryGdFlow(request *QueryGdFlowRequest) (_result *QueryGdFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGdFlowResponse{}
	_body, _err := client.QueryGdFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 对接高德，查询潜客流向以及重叠的数据
 * Summary: 【高德】流向与重叠数据
 */
func (client *Client) QueryGdFlowEx(request *QueryGdFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGdFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGdFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.gd.flow.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 电池衰退权益报告查询接口
 * Summary: 电池衰退权益报告查询接口
 */
func (client *Client) QueryBatteryReport(request *QueryBatteryReportRequest) (_result *QueryBatteryReportResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBatteryReportResponse{}
	_body, _err := client.QueryBatteryReportEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 电池衰退权益报告查询接口
 * Summary: 电池衰退权益报告查询接口
 */
func (client *Client) QueryBatteryReportEx(request *QueryBatteryReportRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBatteryReportResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBatteryReportResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.battery.report.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用来查询汽车之家车型和城市列表
 * Summary: 用来查询汽车之家车型和城市列表
 */
func (client *Client) QueryNewcarQczj(request *QueryNewcarQczjRequest) (_result *QueryNewcarQczjResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryNewcarQczjResponse{}
	_body, _err := client.QueryNewcarQczjEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用来查询汽车之家车型和城市列表
 * Summary: 用来查询汽车之家车型和城市列表
 */
func (client *Client) QueryNewcarQczjEx(request *QueryNewcarQczjRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryNewcarQczjResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryNewcarQczjResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.newcar.qczj.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 【高德】查询店铺基本信息
 * Summary: 【高德】查询店铺基本信息
 */
func (client *Client) QueryGdStore(request *QueryGdStoreRequest) (_result *QueryGdStoreResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGdStoreResponse{}
	_body, _err := client.QueryGdStoreEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 【高德】查询店铺基本信息
 * Summary: 【高德】查询店铺基本信息
 */
func (client *Client) QueryGdStoreEx(request *QueryGdStoreRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGdStoreResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGdStoreResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.gd.store.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 【高德】潜客指数数据
 * Summary: 【高德】潜客指数数据
 */
func (client *Client) QueryGdPoential(request *QueryGdPoentialRequest) (_result *QueryGdPoentialResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGdPoentialResponse{}
	_body, _err := client.QueryGdPoentialEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 【高德】潜客指数数据
 * Summary: 【高德】潜客指数数据
 */
func (client *Client) QueryGdPoentialEx(request *QueryGdPoentialRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGdPoentialResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGdPoentialResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.gd.poential.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 对接车道山前擦碰无忧接口
 * Summary: 对接车道山前擦碰无忧接口
 */
func (client *Client) RegisterCdsqScratches(request *RegisterCdsqScratchesRequest) (_result *RegisterCdsqScratchesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RegisterCdsqScratchesResponse{}
	_body, _err := client.RegisterCdsqScratchesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 对接车道山前擦碰无忧接口
 * Summary: 对接车道山前擦碰无忧接口
 */
func (client *Client) RegisterCdsqScratchesEx(request *RegisterCdsqScratchesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RegisterCdsqScratchesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RegisterCdsqScratchesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.cdsq.scratches.register"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 车到山前查询权益接口
 * Summary: 车到山前查询权益接口
 */
func (client *Client) QueryCdsqScratches(request *QueryCdsqScratchesRequest) (_result *QueryCdsqScratchesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCdsqScratchesResponse{}
	_body, _err := client.QueryCdsqScratchesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 车到山前查询权益接口
 * Summary: 车到山前查询权益接口
 */
func (client *Client) QueryCdsqScratchesEx(request *QueryCdsqScratchesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCdsqScratchesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCdsqScratchesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.cdsq.scratches.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 车到山前权益退保接口
 * Summary: 车到山前权益退保接口
 */
func (client *Client) DeleteCdsqScratches(request *DeleteCdsqScratchesRequest) (_result *DeleteCdsqScratchesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteCdsqScratchesResponse{}
	_body, _err := client.DeleteCdsqScratchesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 车到山前权益退保接口
 * Summary: 车到山前权益退保接口
 */
func (client *Client) DeleteCdsqScratchesEx(request *DeleteCdsqScratchesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteCdsqScratchesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteCdsqScratchesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.cdsq.scratches.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 车到山前权益退保回调接口
 * Summary: 车到山前权益退保回调接口
 */
func (client *Client) CallbackCdsqScratches(request *CallbackCdsqScratchesRequest) (_result *CallbackCdsqScratchesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackCdsqScratchesResponse{}
	_body, _err := client.CallbackCdsqScratchesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 车到山前权益退保回调接口
 * Summary: 车到山前权益退保回调接口
 */
func (client *Client) CallbackCdsqScratchesEx(request *CallbackCdsqScratchesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackCdsqScratchesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackCdsqScratchesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.cdsq.scratches.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 车到山前权益状态查询
 * Summary: 车到山前权益状态查询
 */
func (client *Client) SaveCdsqScratches(request *SaveCdsqScratchesRequest) (_result *SaveCdsqScratchesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveCdsqScratchesResponse{}
	_body, _err := client.SaveCdsqScratchesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 车到山前权益状态查询
 * Summary: 车到山前权益状态查询
 */
func (client *Client) SaveCdsqScratchesEx(request *SaveCdsqScratchesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveCdsqScratchesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveCdsqScratchesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.cdsq.scratches.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 常岳车贷线索预判接口
 * Summary: 常岳车贷线索预判接口
 */
func (client *Client) QueryCarVin(request *QueryCarVinRequest) (_result *QueryCarVinResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCarVinResponse{}
	_body, _err := client.QueryCarVinEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 常岳车贷线索预判接口
 * Summary: 常岳车贷线索预判接口
 */
func (client *Client) QueryCarVinEx(request *QueryCarVinRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCarVinResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCarVinResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.car.vin.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 长安画像标签授权接口
 * Summary: 长安画像标签授权接口
 */
func (client *Client) RegisterTagChangan(request *RegisterTagChanganRequest) (_result *RegisterTagChanganResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RegisterTagChanganResponse{}
	_body, _err := client.RegisterTagChanganEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 长安画像标签授权接口
 * Summary: 长安画像标签授权接口
 */
func (client *Client) RegisterTagChanganEx(request *RegisterTagChanganRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RegisterTagChanganResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RegisterTagChanganResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.tag.changan.register"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 长安画像标签用户id标签查询1
 * Summary: 长安画像标签用户id标签查询1
 */
func (client *Client) QueryTagChangan(request *QueryTagChanganRequest) (_result *QueryTagChanganResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTagChanganResponse{}
	_body, _err := client.QueryTagChanganEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 长安画像标签用户id标签查询1
 * Summary: 长安画像标签用户id标签查询1
 */
func (client *Client) QueryTagChanganEx(request *QueryTagChanganRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTagChanganResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTagChanganResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.tag.changan.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 汽车之家区域接口
 * Summary: 汽车之家区域接口
 */
func (client *Client) QueryUsedcarArea(request *QueryUsedcarAreaRequest) (_result *QueryUsedcarAreaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryUsedcarAreaResponse{}
	_body, _err := client.QueryUsedcarAreaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 汽车之家区域接口
 * Summary: 汽车之家区域接口
 */
func (client *Client) QueryUsedcarAreaEx(request *QueryUsedcarAreaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryUsedcarAreaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryUsedcarAreaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.usedcar.area.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取汽车之家品牌信息
 * Summary: 获取汽车之家品牌信息
 */
func (client *Client) QueryUsedcarBrands(request *QueryUsedcarBrandsRequest) (_result *QueryUsedcarBrandsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryUsedcarBrandsResponse{}
	_body, _err := client.QueryUsedcarBrandsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取汽车之家品牌信息
 * Summary: 获取汽车之家品牌信息
 */
func (client *Client) QueryUsedcarBrandsEx(request *QueryUsedcarBrandsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryUsedcarBrandsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryUsedcarBrandsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.usedcar.brands.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 汽车之家车系接口
 * Summary: 汽车之家车系接口
 */
func (client *Client) QueryUsedcarSeries(request *QueryUsedcarSeriesRequest) (_result *QueryUsedcarSeriesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryUsedcarSeriesResponse{}
	_body, _err := client.QueryUsedcarSeriesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 汽车之家车系接口
 * Summary: 汽车之家车系接口
 */
func (client *Client) QueryUsedcarSeriesEx(request *QueryUsedcarSeriesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryUsedcarSeriesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryUsedcarSeriesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.usedcar.series.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 汽车之家车型接口
 * Summary: 汽车之家车型接口
 */
func (client *Client) QueryUsedcarProducts(request *QueryUsedcarProductsRequest) (_result *QueryUsedcarProductsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryUsedcarProductsResponse{}
	_body, _err := client.QueryUsedcarProductsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 汽车之家车型接口
 * Summary: 汽车之家车型接口
 */
func (client *Client) QueryUsedcarProductsEx(request *QueryUsedcarProductsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryUsedcarProductsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryUsedcarProductsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.usedcar.products.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取二手车线索状态
 * Summary: 获取二手车线索状态
 */
func (client *Client) SyncUsedcar(request *SyncUsedcarRequest) (_result *SyncUsedcarResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncUsedcarResponse{}
	_body, _err := client.SyncUsedcarEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取二手车线索状态
 * Summary: 获取二手车线索状态
 */
func (client *Client) SyncUsedcarEx(request *SyncUsedcarRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncUsedcarResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncUsedcarResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.intellicar.usedcar.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
