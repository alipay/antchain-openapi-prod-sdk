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

// 订单包含的单个商品模型
type OrderGoodsModel struct {
	// 商品 id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty" require:"true" maxLength:"50" minLength:"0"`
	// 商品版本，每个商品的编码+版本 唯一确认一个产品信息，必须为自然数，如"0","1","10"等
	ProductVersion *int64 `json:"product_version,omitempty" xml:"product_version,omitempty" require:"true"`
	// 商品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true" maxLength:"50" minLength:"0"`
	// 商品价格,精确到分，即 1234 表示 12.34 元
	ProductPrice *int64 `json:"product_price,omitempty" xml:"product_price,omitempty" require:"true"`
	// 商品(3C产品)的设备 id
	ProductImeiId *string `json:"product_imei_id,omitempty" xml:"product_imei_id,omitempty" require:"true" maxLength:"200" minLength:"0"`
	// 链上采购供应商租户 id，提供商品方的金融科技租户 id，否则平台自己名称
	SupplierId *string `json:"supplier_id,omitempty" xml:"supplier_id,omitempty" require:"true" maxLength:"50" minLength:"0"`
	// 商品数量，不能为空，且大于 0
	ProductNumber *int64 `json:"product_number,omitempty" xml:"product_number,omitempty" require:"true"`
}

func (s OrderGoodsModel) String() string {
	return tea.Prettify(s)
}

func (s OrderGoodsModel) GoString() string {
	return s.String()
}

func (s *OrderGoodsModel) SetProductId(v string) *OrderGoodsModel {
	s.ProductId = &v
	return s
}

func (s *OrderGoodsModel) SetProductVersion(v int64) *OrderGoodsModel {
	s.ProductVersion = &v
	return s
}

func (s *OrderGoodsModel) SetProductName(v string) *OrderGoodsModel {
	s.ProductName = &v
	return s
}

func (s *OrderGoodsModel) SetProductPrice(v int64) *OrderGoodsModel {
	s.ProductPrice = &v
	return s
}

func (s *OrderGoodsModel) SetProductImeiId(v string) *OrderGoodsModel {
	s.ProductImeiId = &v
	return s
}

func (s *OrderGoodsModel) SetSupplierId(v string) *OrderGoodsModel {
	s.SupplierId = &v
	return s
}

func (s *OrderGoodsModel) SetProductNumber(v int64) *OrderGoodsModel {
	s.ProductNumber = &v
	return s
}

// 订单还款计划
type PromiseInfo struct {
	// 订单 id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 宽限期，精确到 毫秒，产生罚息的延迟时间范围。
	DateLimit *int64 `json:"date_limit,omitempty" xml:"date_limit,omitempty" require:"true" minimum:"0"`
	// 应付租金时间，格式为 2019-08-31 12:00:00
	// yyyy-MM-dd HH:mm:ss
	PayDateList []*string `json:"pay_date_list,omitempty" xml:"pay_date_list,omitempty" require:"true" type:"Repeated"`
	// 租期
	PayPeriod *int64 `json:"pay_period,omitempty" xml:"pay_period,omitempty" require:"true" minimum:"1"`
	// 应付租金，精确到分，即 1234 表示 12.34 元
	PayMoneyList []*int64 `json:"pay_money_list,omitempty" xml:"pay_money_list,omitempty" require:"true" type:"Repeated"`
	// 租赁公司支付宝 UID
	LeaseAlipayUid *string `json:"lease_alipay_uid,omitempty" xml:"lease_alipay_uid,omitempty" require:"true" maxLength:"50" minLength:"1"`
}

func (s PromiseInfo) String() string {
	return tea.Prettify(s)
}

func (s PromiseInfo) GoString() string {
	return s.String()
}

func (s *PromiseInfo) SetOrderId(v string) *PromiseInfo {
	s.OrderId = &v
	return s
}

func (s *PromiseInfo) SetDateLimit(v int64) *PromiseInfo {
	s.DateLimit = &v
	return s
}

func (s *PromiseInfo) SetPayDateList(v []*string) *PromiseInfo {
	s.PayDateList = v
	return s
}

func (s *PromiseInfo) SetPayPeriod(v int64) *PromiseInfo {
	s.PayPeriod = &v
	return s
}

func (s *PromiseInfo) SetPayMoneyList(v []*int64) *PromiseInfo {
	s.PayMoneyList = v
	return s
}

func (s *PromiseInfo) SetLeaseAlipayUid(v string) *PromiseInfo {
	s.LeaseAlipayUid = &v
	return s
}

// 同步订单中的下单人信息
type UserSyncInfo struct {
	// 外部同步的订单 id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 用户登录名，租赁平台会员ID/若支付宝ID必传
	LoginId *string `json:"login_id,omitempty" xml:"login_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 户登录名类型 1.商户会员2.支付宝3.其他
	LoginType *int64 `json:"login_type,omitempty" xml:"login_type,omitempty" require:"true"`
	// 用户登录时间 格式为2019-08-31 12:00:00
	LoginTime *string `json:"login_time,omitempty" xml:"login_time,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 租赁人姓名，这里是用户通过公钥加密后的密文
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true" maxLength:"500" minLength:"1"`
	// 租赁人身份证，这里是用户通过公钥加密后的密文
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true" maxLength:"500" minLength:"1"`
	// 承租人手机号，这里是用户通过公钥加密后的密文
	UserPhoneNumber *string `json:"user_phone_number,omitempty" xml:"user_phone_number,omitempty" require:"true" maxLength:"500" minLength:"1"`
	// 身份认证类型 1支付宝实人，2芝麻实人，3非蚂蚁实人
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty" require:"true" maxLength:"2" minLength:"1"`
	// 支付宝账号信息
	AlipayUid *string `json:"alipay_uid,omitempty" xml:"alipay_uid,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 出租企业名称
	LeaseCorpName *string `json:"lease_corp_name,omitempty" xml:"lease_corp_name,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 出租企业统一社会信用代码
	LeaseCorpId *string `json:"lease_corp_id,omitempty" xml:"lease_corp_id,omitempty" require:"true" maxLength:"50" minLength:"0"`
	// 出租法定代表人姓名
	LeaseCorpOwnerName *string `json:"lease_corp_owner_name,omitempty" xml:"lease_corp_owner_name,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 1.企业用户 2.个人用户
	LesseeType *int64 `json:"lessee_type,omitempty" xml:"lessee_type,omitempty" require:"true"`
	// 营业执照对应的名称
	LeasedEnterprise *string `json:"leased_enterprise,omitempty" xml:"leased_enterprise,omitempty" maxLength:"50" minLength:"1"`
	// 租赁⼈身份证照⽚正⾯地址
	UserImageUrl *string `json:"user_image_url,omitempty" xml:"user_image_url,omitempty" maxLength:"1000" minLength:"0"`
	// 租赁⼈身份证照⽚反⾯地址
	UserBackImageUrl *string `json:"user_back_image_url,omitempty" xml:"user_back_image_url,omitempty" maxLength:"1000" minLength:"0"`
	// 平台注册的电话，这里是用户通过公钥加密后的密文
	RegisteredTelephoneNumber *string `json:"registered_telephone_number,omitempty" xml:"registered_telephone_number,omitempty" maxLength:"500" minLength:"0"`
	// 承租企业实际控制人（股东/法人）身份证号
	ActualControllerId *string `json:"actual_controller_id,omitempty" xml:"actual_controller_id,omitempty" maxLength:"500" minLength:"0"`
	// 承租企业实际控制人（股东/法人）手机号。若为企业类型必填，字段长度：不超过 500
	ActualControllerNumber *string `json:"actual_controller_number,omitempty" xml:"actual_controller_number,omitempty"`
	// 承租企业实际控制人（股东/法人）姓名，若为企业类型必填
	ActualControllerName *string `json:"actual_controller_name,omitempty" xml:"actual_controller_name,omitempty" maxLength:"1000" minLength:"0"`
	// 承租企业实际控制人（股东/法人）身份证正面地址，若为企业类型必填
	ActualControllerImageUrl *string `json:"actual_controller_image_url,omitempty" xml:"actual_controller_image_url,omitempty" maxLength:"50" minLength:"0"`
	// 承租企业实际控制人（股东/法人）身份证反面地址
	ActualControllerBackImageUrl *string `json:"actual_controller_back_image_url,omitempty" xml:"actual_controller_back_image_url,omitempty" maxLength:"1000" minLength:"0"`
	// 承租企业实际控制人（股东/法人）手机号
	ActualControllerTelephoneNumber *string `json:"actual_controller_telephone_number,omitempty" xml:"actual_controller_telephone_number,omitempty" maxLength:"12" minLength:"0"`
	// 承租企业统⼀社会信⽤代码
	BusinessLicenseNumber *string `json:"business_license_number,omitempty" xml:"business_license_number,omitempty" maxLength:"50" minLength:"0"`
	// 承租企业统一社会信用代码
	BusinesslicenseUrl *string `json:"businesslicense_url,omitempty" xml:"businesslicense_url,omitempty"`
	// 承租企业法定代表人姓名
	LegalRepresentative *string `json:"legal_representative,omitempty" xml:"legal_representative,omitempty" maxLength:"20" minLength:"0"`
	//  资方定义的其他额外字段，以json形式传递
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty" maxLength:"2000" minLength:"0"`
}

func (s UserSyncInfo) String() string {
	return tea.Prettify(s)
}

func (s UserSyncInfo) GoString() string {
	return s.String()
}

func (s *UserSyncInfo) SetOrderId(v string) *UserSyncInfo {
	s.OrderId = &v
	return s
}

func (s *UserSyncInfo) SetLoginId(v string) *UserSyncInfo {
	s.LoginId = &v
	return s
}

func (s *UserSyncInfo) SetLoginType(v int64) *UserSyncInfo {
	s.LoginType = &v
	return s
}

func (s *UserSyncInfo) SetLoginTime(v string) *UserSyncInfo {
	s.LoginTime = &v
	return s
}

func (s *UserSyncInfo) SetUserName(v string) *UserSyncInfo {
	s.UserName = &v
	return s
}

func (s *UserSyncInfo) SetUserId(v string) *UserSyncInfo {
	s.UserId = &v
	return s
}

func (s *UserSyncInfo) SetUserPhoneNumber(v string) *UserSyncInfo {
	s.UserPhoneNumber = &v
	return s
}

func (s *UserSyncInfo) SetUserType(v string) *UserSyncInfo {
	s.UserType = &v
	return s
}

func (s *UserSyncInfo) SetAlipayUid(v string) *UserSyncInfo {
	s.AlipayUid = &v
	return s
}

func (s *UserSyncInfo) SetLeaseCorpName(v string) *UserSyncInfo {
	s.LeaseCorpName = &v
	return s
}

func (s *UserSyncInfo) SetLeaseCorpId(v string) *UserSyncInfo {
	s.LeaseCorpId = &v
	return s
}

func (s *UserSyncInfo) SetLeaseCorpOwnerName(v string) *UserSyncInfo {
	s.LeaseCorpOwnerName = &v
	return s
}

func (s *UserSyncInfo) SetLesseeType(v int64) *UserSyncInfo {
	s.LesseeType = &v
	return s
}

func (s *UserSyncInfo) SetLeasedEnterprise(v string) *UserSyncInfo {
	s.LeasedEnterprise = &v
	return s
}

func (s *UserSyncInfo) SetUserImageUrl(v string) *UserSyncInfo {
	s.UserImageUrl = &v
	return s
}

func (s *UserSyncInfo) SetUserBackImageUrl(v string) *UserSyncInfo {
	s.UserBackImageUrl = &v
	return s
}

func (s *UserSyncInfo) SetRegisteredTelephoneNumber(v string) *UserSyncInfo {
	s.RegisteredTelephoneNumber = &v
	return s
}

func (s *UserSyncInfo) SetActualControllerId(v string) *UserSyncInfo {
	s.ActualControllerId = &v
	return s
}

func (s *UserSyncInfo) SetActualControllerNumber(v string) *UserSyncInfo {
	s.ActualControllerNumber = &v
	return s
}

func (s *UserSyncInfo) SetActualControllerName(v string) *UserSyncInfo {
	s.ActualControllerName = &v
	return s
}

func (s *UserSyncInfo) SetActualControllerImageUrl(v string) *UserSyncInfo {
	s.ActualControllerImageUrl = &v
	return s
}

func (s *UserSyncInfo) SetActualControllerBackImageUrl(v string) *UserSyncInfo {
	s.ActualControllerBackImageUrl = &v
	return s
}

func (s *UserSyncInfo) SetActualControllerTelephoneNumber(v string) *UserSyncInfo {
	s.ActualControllerTelephoneNumber = &v
	return s
}

func (s *UserSyncInfo) SetBusinessLicenseNumber(v string) *UserSyncInfo {
	s.BusinessLicenseNumber = &v
	return s
}

func (s *UserSyncInfo) SetBusinesslicenseUrl(v string) *UserSyncInfo {
	s.BusinesslicenseUrl = &v
	return s
}

func (s *UserSyncInfo) SetLegalRepresentative(v string) *UserSyncInfo {
	s.LegalRepresentative = &v
	return s
}

func (s *UserSyncInfo) SetExtraInfo(v string) *UserSyncInfo {
	s.ExtraInfo = &v
	return s
}

// 主订单信息
type OrderInfo struct {
	// 订单 id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单创建时间，格式为2019-08-31 12:00:00
	OrderCreateTime *string `json:"order_create_time,omitempty" xml:"order_create_time,omitempty" require:"true"`
	// 订单支付时间，格式为 2019-08-31 12:00:00
	OrderPayTime *string `json:"order_pay_time,omitempty" xml:"order_pay_time,omitempty" require:"true"`
	// 订单支付 id
	OrderPayId *string `json:"order_pay_id,omitempty" xml:"order_pay_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单支付类型；1:预授权，2:信用套餐，3:支付宝代扣，4:其他，5:网商直付通代扣，6:网商委托代扣
	OrderPayType *int64 `json:"order_pay_type,omitempty" xml:"order_pay_type,omitempty" require:"true"`
	// 订单支付主题
	OrderPaySubject *string `json:"order_pay_subject,omitempty" xml:"order_pay_subject,omitempty" require:"true" maxLength:"500" minLength:"1"`
	// 租期，单位：月
	RentTerm *int64 `json:"rent_term,omitempty" xml:"rent_term,omitempty" require:"true" minimum:"1"`
	// 月租金 精确到分，即 1234 表示 12.34 元
	RentPricePerMonth *int64 `json:"rent_price_per_month,omitempty" xml:"rent_price_per_month,omitempty" require:"true"`
	// 到期买断价 精确到分，即 1234 表示 12.34 元
	BuyOutPrice *int64 `json:"buy_out_price,omitempty" xml:"buy_out_price,omitempty" require:"true"`
	// 租赁合同,需要客户自己提供合并的 url
	LeaseContractUrl *string `json:"lease_contract_url,omitempty" xml:"lease_contract_url,omitempty" require:"true" maxLength:"1000" minLength:"1"`
	// 仓库类型；1: 实体仓 2: 虚拟仓
	StoreType *int64 `json:"store_type,omitempty" xml:"store_type,omitempty" require:"true"`
	// 承租人收货地址
	UserAddress *string `json:"user_address,omitempty" xml:"user_address,omitempty" require:"true" maxLength:"100" minLength:"1"`
	// 供应商在金融科技对应的租户 id，若填写此字段，则会走供应商模式
	SupplierIsvAccount *string `json:"supplier_isv_account,omitempty" xml:"supplier_isv_account,omitempty" require:"true" maxLength:"100" minLength:"1"`
	// 省份编码
	ProvinceCode *string `json:"province_code,omitempty" xml:"province_code,omitempty" require:"true"`
	// 城市编码
	CityCode *string `json:"city_code,omitempty" xml:"city_code,omitempty" require:"true"`
	// 地区码
	DistrictCode *string `json:"district_code,omitempty" xml:"district_code,omitempty" require:"true"`
	// 到期形式；1:到期买断 2:到期归还
	DueMode *int64 `json:"due_mode,omitempty" xml:"due_mode,omitempty" require:"true"`
	// 租赁合同 id，可用作幂等
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty" maxLength:"100" minLength:"0"`
	// 租金总额，精确到分，即 1234 表示 12.34 元
	TotalRentMoney *int64 `json:"total_rent_money,omitempty" xml:"total_rent_money,omitempty" require:"true"`
	// 保险单号
	InsuranceNumber *string `json:"insurance_number,omitempty" xml:"insurance_number,omitempty" maxLength:"100" minLength:"0"`
	// 保险地址
	InsuranceUrl *string `json:"insurance_url,omitempty" xml:"insurance_url,omitempty" maxLength:"1000" minLength:"0"`
	// 蚁盾分数
	YidunScore *int64 `json:"yidun_score,omitempty" xml:"yidun_score,omitempty"`
	// 网商直付通模式的代扣协议号，订单类型为网商直付通模式为必填
	AgreementNo *string `json:"agreement_no,omitempty" xml:"agreement_no,omitempty" maxLength:"100" minLength:"0"`
	// 直付通代扣受理订单号，订单类型为网商直付通模式为必填
	AgreementOrderId *string `json:"agreement_order_id,omitempty" xml:"agreement_order_id,omitempty" maxLength:"100" minLength:"0"`
	// 首付款金额, 精确到分，即 1234 表示 12.34 元，订单类型为网商直付通模式为必填
	DownPayment *int64 `json:"down_payment,omitempty" xml:"down_payment,omitempty"`
	// 订单付款内容描述
	OrderPayBody *string `json:"order_pay_body,omitempty" xml:"order_pay_body,omitempty" maxLength:"500" minLength:"0"`
	// 额外信息
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
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

func (s *OrderInfo) SetOrderPayId(v string) *OrderInfo {
	s.OrderPayId = &v
	return s
}

func (s *OrderInfo) SetOrderPayType(v int64) *OrderInfo {
	s.OrderPayType = &v
	return s
}

func (s *OrderInfo) SetOrderPaySubject(v string) *OrderInfo {
	s.OrderPaySubject = &v
	return s
}

func (s *OrderInfo) SetRentTerm(v int64) *OrderInfo {
	s.RentTerm = &v
	return s
}

func (s *OrderInfo) SetRentPricePerMonth(v int64) *OrderInfo {
	s.RentPricePerMonth = &v
	return s
}

func (s *OrderInfo) SetBuyOutPrice(v int64) *OrderInfo {
	s.BuyOutPrice = &v
	return s
}

func (s *OrderInfo) SetLeaseContractUrl(v string) *OrderInfo {
	s.LeaseContractUrl = &v
	return s
}

func (s *OrderInfo) SetStoreType(v int64) *OrderInfo {
	s.StoreType = &v
	return s
}

func (s *OrderInfo) SetUserAddress(v string) *OrderInfo {
	s.UserAddress = &v
	return s
}

func (s *OrderInfo) SetSupplierIsvAccount(v string) *OrderInfo {
	s.SupplierIsvAccount = &v
	return s
}

func (s *OrderInfo) SetProvinceCode(v string) *OrderInfo {
	s.ProvinceCode = &v
	return s
}

func (s *OrderInfo) SetCityCode(v string) *OrderInfo {
	s.CityCode = &v
	return s
}

func (s *OrderInfo) SetDistrictCode(v string) *OrderInfo {
	s.DistrictCode = &v
	return s
}

func (s *OrderInfo) SetDueMode(v int64) *OrderInfo {
	s.DueMode = &v
	return s
}

func (s *OrderInfo) SetContractId(v string) *OrderInfo {
	s.ContractId = &v
	return s
}

func (s *OrderInfo) SetTotalRentMoney(v int64) *OrderInfo {
	s.TotalRentMoney = &v
	return s
}

func (s *OrderInfo) SetInsuranceNumber(v string) *OrderInfo {
	s.InsuranceNumber = &v
	return s
}

func (s *OrderInfo) SetInsuranceUrl(v string) *OrderInfo {
	s.InsuranceUrl = &v
	return s
}

func (s *OrderInfo) SetYidunScore(v int64) *OrderInfo {
	s.YidunScore = &v
	return s
}

func (s *OrderInfo) SetAgreementNo(v string) *OrderInfo {
	s.AgreementNo = &v
	return s
}

func (s *OrderInfo) SetAgreementOrderId(v string) *OrderInfo {
	s.AgreementOrderId = &v
	return s
}

func (s *OrderInfo) SetDownPayment(v int64) *OrderInfo {
	s.DownPayment = &v
	return s
}

func (s *OrderInfo) SetOrderPayBody(v string) *OrderInfo {
	s.OrderPayBody = &v
	return s
}

func (s *OrderInfo) SetExtraInfo(v string) *OrderInfo {
	s.ExtraInfo = &v
	return s
}

// 订单商品信息
type GoodsInfo struct {
	// 订单 id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 租赁机构自己的金融科技租户 id，如果是代理模式此处需要为被代理机构的金融科技租户 id
	LeaseId *string `json:"lease_id,omitempty" xml:"lease_id,omitempty" maxLength:"50" minLength:"0"`
	// 订单包含的商品信息列表
	GoodsList []*OrderGoodsModel `json:"goods_list,omitempty" xml:"goods_list,omitempty" require:"true" type:"Repeated"`
}

func (s GoodsInfo) String() string {
	return tea.Prettify(s)
}

func (s GoodsInfo) GoString() string {
	return s.String()
}

func (s *GoodsInfo) SetOrderId(v string) *GoodsInfo {
	s.OrderId = &v
	return s
}

func (s *GoodsInfo) SetLeaseId(v string) *GoodsInfo {
	s.LeaseId = &v
	return s
}

func (s *GoodsInfo) SetGoodsList(v []*OrderGoodsModel) *GoodsInfo {
	s.GoodsList = v
	return s
}

type SyncAntchainAtoTradeRequest struct {
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

func (s SyncAntchainAtoTradeRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoTradeRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoTradeRequest) SetAuthToken(v string) *SyncAntchainAtoTradeRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainAtoTradeRequest) SetProductInstanceId(v string) *SyncAntchainAtoTradeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainAtoTradeRequest) SetBizContent(v string) *SyncAntchainAtoTradeRequest {
	s.BizContent = &v
	return s
}

func (s *SyncAntchainAtoTradeRequest) SetType(v string) *SyncAntchainAtoTradeRequest {
	s.Type = &v
	return s
}

type SyncAntchainAtoTradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// resp信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncAntchainAtoTradeResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoTradeResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoTradeResponse) SetReqMsgId(v string) *SyncAntchainAtoTradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainAtoTradeResponse) SetResultCode(v string) *SyncAntchainAtoTradeResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainAtoTradeResponse) SetResultMsg(v string) *SyncAntchainAtoTradeResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAntchainAtoTradeResponse) SetResponseData(v string) *SyncAntchainAtoTradeResponse {
	s.ResponseData = &v
	return s
}

type GetAntchainAtoTradeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询信息，必须遵循json字符串格式
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 接口类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s GetAntchainAtoTradeRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoTradeRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoTradeRequest) SetAuthToken(v string) *GetAntchainAtoTradeRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainAtoTradeRequest) SetProductInstanceId(v string) *GetAntchainAtoTradeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainAtoTradeRequest) SetBizContent(v string) *GetAntchainAtoTradeRequest {
	s.BizContent = &v
	return s
}

func (s *GetAntchainAtoTradeRequest) SetType(v string) *GetAntchainAtoTradeRequest {
	s.Type = &v
	return s
}

type GetAntchainAtoTradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回的查询值
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetAntchainAtoTradeResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoTradeResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoTradeResponse) SetReqMsgId(v string) *GetAntchainAtoTradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainAtoTradeResponse) SetResultCode(v string) *GetAntchainAtoTradeResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainAtoTradeResponse) SetResultMsg(v string) *GetAntchainAtoTradeResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainAtoTradeResponse) SetResponseData(v string) *GetAntchainAtoTradeResponse {
	s.ResponseData = &v
	return s
}

type CreateAntchainAtoRealpersonFacevrfRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 真实姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 身份信息来源类型，当前仅支持证件（CERT_INFO）
	IdentityType *string `json:"identity_type,omitempty" xml:"identity_type,omitempty" require:"true"`
	// 证件类型，当前仅支持身份证（IDENTITY_CARD）
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 商户请求的唯一标识。
	//
	// 值为 32 位长度的字母数字组合。其中，前面几位字符是商户自定义的简称，中间几位可以使用一段时间，后段可以使用一个随机或递增序列。该值也可以使用 UUID。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 认证结束回跳地址
	ReturnUrl *string `json:"return_url,omitempty" xml:"return_url,omitempty" require:"true"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s CreateAntchainAtoRealpersonFacevrfRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainAtoRealpersonFacevrfRequest) GoString() string {
	return s.String()
}

func (s *CreateAntchainAtoRealpersonFacevrfRequest) SetAuthToken(v string) *CreateAntchainAtoRealpersonFacevrfRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfRequest) SetProductInstanceId(v string) *CreateAntchainAtoRealpersonFacevrfRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfRequest) SetCertName(v string) *CreateAntchainAtoRealpersonFacevrfRequest {
	s.CertName = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfRequest) SetCertNo(v string) *CreateAntchainAtoRealpersonFacevrfRequest {
	s.CertNo = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfRequest) SetIdentityType(v string) *CreateAntchainAtoRealpersonFacevrfRequest {
	s.IdentityType = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfRequest) SetCertType(v string) *CreateAntchainAtoRealpersonFacevrfRequest {
	s.CertType = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfRequest) SetOuterOrderNo(v string) *CreateAntchainAtoRealpersonFacevrfRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfRequest) SetReturnUrl(v string) *CreateAntchainAtoRealpersonFacevrfRequest {
	s.ReturnUrl = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfRequest) SetOrderId(v string) *CreateAntchainAtoRealpersonFacevrfRequest {
	s.OrderId = &v
	return s
}

type CreateAntchainAtoRealpersonFacevrfResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务返回字段，JSON格式
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateAntchainAtoRealpersonFacevrfResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainAtoRealpersonFacevrfResponse) GoString() string {
	return s.String()
}

func (s *CreateAntchainAtoRealpersonFacevrfResponse) SetReqMsgId(v string) *CreateAntchainAtoRealpersonFacevrfResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfResponse) SetResultCode(v string) *CreateAntchainAtoRealpersonFacevrfResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfResponse) SetResultMsg(v string) *CreateAntchainAtoRealpersonFacevrfResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfResponse) SetData(v string) *CreateAntchainAtoRealpersonFacevrfResponse {
	s.Data = &v
	return s
}

type QueryAntchainAtoRealpersonFacevrfRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 可信实人认证的唯一标识
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
	// 商户请求的唯一标识。
	//
	// 值为 32 位长度的字母数字组合。其中，前面几位字符是商户自定义的简称，中间几位可以使用一段时间，后段可以使用一个随机或递增序列。该值也可以使用 UUID。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s QueryAntchainAtoRealpersonFacevrfRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoRealpersonFacevrfRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoRealpersonFacevrfRequest) SetAuthToken(v string) *QueryAntchainAtoRealpersonFacevrfRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainAtoRealpersonFacevrfRequest) SetProductInstanceId(v string) *QueryAntchainAtoRealpersonFacevrfRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainAtoRealpersonFacevrfRequest) SetCertifyId(v string) *QueryAntchainAtoRealpersonFacevrfRequest {
	s.CertifyId = &v
	return s
}

func (s *QueryAntchainAtoRealpersonFacevrfRequest) SetOuterOrderNo(v string) *QueryAntchainAtoRealpersonFacevrfRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QueryAntchainAtoRealpersonFacevrfRequest) SetOrderId(v string) *QueryAntchainAtoRealpersonFacevrfRequest {
	s.OrderId = &v
	return s
}

type QueryAntchainAtoRealpersonFacevrfResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务返回字段，JSON格式
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryAntchainAtoRealpersonFacevrfResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoRealpersonFacevrfResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoRealpersonFacevrfResponse) SetReqMsgId(v string) *QueryAntchainAtoRealpersonFacevrfResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainAtoRealpersonFacevrfResponse) SetResultCode(v string) *QueryAntchainAtoRealpersonFacevrfResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainAtoRealpersonFacevrfResponse) SetResultMsg(v string) *QueryAntchainAtoRealpersonFacevrfResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainAtoRealpersonFacevrfResponse) SetData(v string) *QueryAntchainAtoRealpersonFacevrfResponse {
	s.Data = &v
	return s
}

type AllAntchainAtoSignTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s AllAntchainAtoSignTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s AllAntchainAtoSignTemplateRequest) GoString() string {
	return s.String()
}

func (s *AllAntchainAtoSignTemplateRequest) SetAuthToken(v string) *AllAntchainAtoSignTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *AllAntchainAtoSignTemplateRequest) SetProductInstanceId(v string) *AllAntchainAtoSignTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

type AllAntchainAtoSignTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// List<Object>格式，详细参考：
	// [
	//         {
	//             "templateCode": "TEST_001",
	//             "tenantId": "BIPCCOQY",
	//             "agreementType": "SERVICE_LEASE",
	//             "fileName": "测试模板之协议签署证明",
	//             "templateId": "f28038577d664015bfc1034c4a125121",
	//             "fieldArgs": "{\"sceneName\":\"测试协议合同签署\",\"title\":\"这是一份证明协议\"}",
	//             "userPos": "[{\"required\":true,\"posPage\":\"1\",\"posX\":\"162.44\",\"posY\":\"425\"}]",
	//             "orgPos": "[{\"required\":true,\"posPage\":\"1\",\"posX\":\"449.99\",\"posY\":\"420.03\"}]"
	//         }
	//     ]
	TemplateList *string `json:"template_list,omitempty" xml:"template_list,omitempty"`
}

func (s AllAntchainAtoSignTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s AllAntchainAtoSignTemplateResponse) GoString() string {
	return s.String()
}

func (s *AllAntchainAtoSignTemplateResponse) SetReqMsgId(v string) *AllAntchainAtoSignTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllAntchainAtoSignTemplateResponse) SetResultCode(v string) *AllAntchainAtoSignTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *AllAntchainAtoSignTemplateResponse) SetResultMsg(v string) *AllAntchainAtoSignTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllAntchainAtoSignTemplateResponse) SetTemplateList(v string) *AllAntchainAtoSignTemplateResponse {
	s.TemplateList = &v
	return s
}

type SubmitAntchainAtoSignFlowRequest struct {
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
	// 签署的电子合同模板信息，List<Object>的JSON格式，Object如下：
	// {
	// templateId:__, // String格式
	// templateArgs: {
	//     "模板参数key":"模板参数值", // 必须为String
	//   }
	// }
	TemplateList *string `json:"template_list,omitempty" xml:"template_list,omitempty" require:"true"`
	// 用户的支付宝uid
	AlipayUserId *string `json:"alipay_user_id,omitempty" xml:"alipay_user_id,omitempty" require:"true" maxLength:"20" minLength:"12"`
	// 公司名称
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty" require:"true" maxLength:"256" minLength:"2"`
	// 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
	MerchantTag *string `json:"merchant_tag,omitempty" xml:"merchant_tag,omitempty" maxLength:"32" minLength:"0"`
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
	// 多方签署的其他参与方的签署信息，json的array格式，参考：[{"tag":"zf_a","orgName":"上海网络科技有限公司","orgIdType":"CRED_ORG_REGCODE","orgIdNumber":"12098760923","orgLegalName":"王大浪","orgLegalIdNumber":"107120196708289012"}]，其中：orgIdNumber、orgLegalName、orgLegalIdNumber需要加密传输。
	ThirdSigner *string `json:"third_signer,omitempty" xml:"third_signer,omitempty" maxLength:"2000" minLength:"0"`
}

func (s SubmitAntchainAtoSignFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitAntchainAtoSignFlowRequest) GoString() string {
	return s.String()
}

func (s *SubmitAntchainAtoSignFlowRequest) SetAuthToken(v string) *SubmitAntchainAtoSignFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetProductInstanceId(v string) *SubmitAntchainAtoSignFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetOrderId(v string) *SubmitAntchainAtoSignFlowRequest {
	s.OrderId = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetUserIdType(v string) *SubmitAntchainAtoSignFlowRequest {
	s.UserIdType = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetUserIdNumber(v string) *SubmitAntchainAtoSignFlowRequest {
	s.UserIdNumber = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetUserName(v string) *SubmitAntchainAtoSignFlowRequest {
	s.UserName = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetUserMobile(v string) *SubmitAntchainAtoSignFlowRequest {
	s.UserMobile = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetUserEmail(v string) *SubmitAntchainAtoSignFlowRequest {
	s.UserEmail = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetSignValidity(v string) *SubmitAntchainAtoSignFlowRequest {
	s.SignValidity = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetFlowNotifyType(v string) *SubmitAntchainAtoSignFlowRequest {
	s.FlowNotifyType = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetBusinessScene(v string) *SubmitAntchainAtoSignFlowRequest {
	s.BusinessScene = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetSignedRedirectUrl(v string) *SubmitAntchainAtoSignFlowRequest {
	s.SignedRedirectUrl = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetTemplateList(v string) *SubmitAntchainAtoSignFlowRequest {
	s.TemplateList = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetAlipayUserId(v string) *SubmitAntchainAtoSignFlowRequest {
	s.AlipayUserId = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetMerchantName(v string) *SubmitAntchainAtoSignFlowRequest {
	s.MerchantName = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetMerchantTag(v string) *SubmitAntchainAtoSignFlowRequest {
	s.MerchantTag = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetMerchantSignOrder(v int64) *SubmitAntchainAtoSignFlowRequest {
	s.MerchantSignOrder = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetMerchantIdType(v string) *SubmitAntchainAtoSignFlowRequest {
	s.MerchantIdType = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetMerchantIdNumber(v string) *SubmitAntchainAtoSignFlowRequest {
	s.MerchantIdNumber = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetMerchantLegalName(v string) *SubmitAntchainAtoSignFlowRequest {
	s.MerchantLegalName = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetMerchantLegalIdNumber(v string) *SubmitAntchainAtoSignFlowRequest {
	s.MerchantLegalIdNumber = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetThirdSigner(v string) *SubmitAntchainAtoSignFlowRequest {
	s.ThirdSigner = &v
	return s
}

type SubmitAntchainAtoSignFlowResponse struct {
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
}

func (s SubmitAntchainAtoSignFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitAntchainAtoSignFlowResponse) GoString() string {
	return s.String()
}

func (s *SubmitAntchainAtoSignFlowResponse) SetReqMsgId(v string) *SubmitAntchainAtoSignFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowResponse) SetResultCode(v string) *SubmitAntchainAtoSignFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowResponse) SetResultMsg(v string) *SubmitAntchainAtoSignFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowResponse) SetSignNo(v string) *SubmitAntchainAtoSignFlowResponse {
	s.SignNo = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowResponse) SetFlowId(v string) *SubmitAntchainAtoSignFlowResponse {
	s.FlowId = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowResponse) SetAccountId(v string) *SubmitAntchainAtoSignFlowResponse {
	s.AccountId = &v
	return s
}

type GetAntchainAtoSignFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署合同单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true"`
}

func (s GetAntchainAtoSignFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoSignFlowRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoSignFlowRequest) SetAuthToken(v string) *GetAntchainAtoSignFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainAtoSignFlowRequest) SetProductInstanceId(v string) *GetAntchainAtoSignFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainAtoSignFlowRequest) SetSignNo(v string) *GetAntchainAtoSignFlowRequest {
	s.SignNo = &v
	return s
}

type GetAntchainAtoSignFlowResponse struct {
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
}

func (s GetAntchainAtoSignFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoSignFlowResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoSignFlowResponse) SetReqMsgId(v string) *GetAntchainAtoSignFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetResultCode(v string) *GetAntchainAtoSignFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetResultMsg(v string) *GetAntchainAtoSignFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetSignNo(v string) *GetAntchainAtoSignFlowResponse {
	s.SignNo = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetOrderId(v string) *GetAntchainAtoSignFlowResponse {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetAccountId(v string) *GetAntchainAtoSignFlowResponse {
	s.AccountId = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetStatus(v string) *GetAntchainAtoSignFlowResponse {
	s.Status = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetFlowId(v string) *GetAntchainAtoSignFlowResponse {
	s.FlowId = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetDocList(v string) *GetAntchainAtoSignFlowResponse {
	s.DocList = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetBusinessScene(v string) *GetAntchainAtoSignFlowResponse {
	s.BusinessScene = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetAlipayUserId(v string) *GetAntchainAtoSignFlowResponse {
	s.AlipayUserId = &v
	return s
}

type SyncAntchainAtoFundSplittingRequest struct {
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

func (s SyncAntchainAtoFundSplittingRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundSplittingRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundSplittingRequest) SetAuthToken(v string) *SyncAntchainAtoFundSplittingRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainAtoFundSplittingRequest) SetProductInstanceId(v string) *SyncAntchainAtoFundSplittingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainAtoFundSplittingRequest) SetFundNo(v string) *SyncAntchainAtoFundSplittingRequest {
	s.FundNo = &v
	return s
}

func (s *SyncAntchainAtoFundSplittingRequest) SetOrderId(v string) *SyncAntchainAtoFundSplittingRequest {
	s.OrderId = &v
	return s
}

func (s *SyncAntchainAtoFundSplittingRequest) SetMerchantTenantId(v string) *SyncAntchainAtoFundSplittingRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *SyncAntchainAtoFundSplittingRequest) SetTermNum(v int64) *SyncAntchainAtoFundSplittingRequest {
	s.TermNum = &v
	return s
}

func (s *SyncAntchainAtoFundSplittingRequest) SetDeductionTime(v string) *SyncAntchainAtoFundSplittingRequest {
	s.DeductionTime = &v
	return s
}

func (s *SyncAntchainAtoFundSplittingRequest) SetDeductionAmount(v int64) *SyncAntchainAtoFundSplittingRequest {
	s.DeductionAmount = &v
	return s
}

func (s *SyncAntchainAtoFundSplittingRequest) SetMerchantSplitAmount(v int64) *SyncAntchainAtoFundSplittingRequest {
	s.MerchantSplitAmount = &v
	return s
}

func (s *SyncAntchainAtoFundSplittingRequest) SetFundSplitAmount(v int64) *SyncAntchainAtoFundSplittingRequest {
	s.FundSplitAmount = &v
	return s
}

func (s *SyncAntchainAtoFundSplittingRequest) SetOtherSplitInfo(v string) *SyncAntchainAtoFundSplittingRequest {
	s.OtherSplitInfo = &v
	return s
}

type SyncAntchainAtoFundSplittingResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 流水同步描述信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncAntchainAtoFundSplittingResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundSplittingResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundSplittingResponse) SetReqMsgId(v string) *SyncAntchainAtoFundSplittingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainAtoFundSplittingResponse) SetResultCode(v string) *SyncAntchainAtoFundSplittingResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainAtoFundSplittingResponse) SetResultMsg(v string) *SyncAntchainAtoFundSplittingResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAntchainAtoFundSplittingResponse) SetResponseData(v string) *SyncAntchainAtoFundSplittingResponse {
	s.ResponseData = &v
	return s
}

type SyncAntchainAtoFundOrderfinancialRequest struct {
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

func (s SyncAntchainAtoFundOrderfinancialRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundOrderfinancialRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundOrderfinancialRequest) SetAuthToken(v string) *SyncAntchainAtoFundOrderfinancialRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialRequest) SetProductInstanceId(v string) *SyncAntchainAtoFundOrderfinancialRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialRequest) SetOrderId(v string) *SyncAntchainAtoFundOrderfinancialRequest {
	s.OrderId = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialRequest) SetMerchantTenantId(v string) *SyncAntchainAtoFundOrderfinancialRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialRequest) SetApplicationId(v string) *SyncAntchainAtoFundOrderfinancialRequest {
	s.ApplicationId = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialRequest) SetStatus(v int64) *SyncAntchainAtoFundOrderfinancialRequest {
	s.Status = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialRequest) SetReason(v string) *SyncAntchainAtoFundOrderfinancialRequest {
	s.Reason = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialRequest) SetExtras(v string) *SyncAntchainAtoFundOrderfinancialRequest {
	s.Extras = &v
	return s
}

type SyncAntchainAtoFundOrderfinancialResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果描述信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncAntchainAtoFundOrderfinancialResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundOrderfinancialResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundOrderfinancialResponse) SetReqMsgId(v string) *SyncAntchainAtoFundOrderfinancialResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialResponse) SetResultCode(v string) *SyncAntchainAtoFundOrderfinancialResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialResponse) SetResultMsg(v string) *SyncAntchainAtoFundOrderfinancialResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialResponse) SetResponseData(v string) *SyncAntchainAtoFundOrderfinancialResponse {
	s.ResponseData = &v
	return s
}

type GetAntchainAtoFundRepaymentplanRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id，不可为空
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 商户在数科注册的tenantId，不可为空
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 用户的支付宝uid
	AlipayUid *string `json:"alipay_uid,omitempty" xml:"alipay_uid,omitempty" require:"true" maxLength:"50" minLength:"1"`
}

func (s GetAntchainAtoFundRepaymentplanRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundRepaymentplanRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundRepaymentplanRequest) SetAuthToken(v string) *GetAntchainAtoFundRepaymentplanRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainAtoFundRepaymentplanRequest) SetProductInstanceId(v string) *GetAntchainAtoFundRepaymentplanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainAtoFundRepaymentplanRequest) SetOrderId(v string) *GetAntchainAtoFundRepaymentplanRequest {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoFundRepaymentplanRequest) SetMerchantTenantId(v string) *GetAntchainAtoFundRepaymentplanRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *GetAntchainAtoFundRepaymentplanRequest) SetAlipayUid(v string) *GetAntchainAtoFundRepaymentplanRequest {
	s.AlipayUid = &v
	return s
}

type GetAntchainAtoFundRepaymentplanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 租赁公司支付宝UID
	LeaseAlipayUid *string `json:"lease_alipay_uid,omitempty" xml:"lease_alipay_uid,omitempty"`
	// 宽限期，天
	GracePeriodDays *int64 `json:"grace_period_days,omitempty" xml:"grace_period_days,omitempty"`
	// 还款策略列表
	RepayStrategyList *string `json:"repay_strategy_list,omitempty" xml:"repay_strategy_list,omitempty"`
	// 处罚策略
	//  NONE : 没有处罚
	//  PENALTY_FEE： 罚息
	PunishmentType *string `json:"punishment_type,omitempty" xml:"punishment_type,omitempty"`
	// 租期
	PayPeriod *int64 `json:"pay_period,omitempty" xml:"pay_period,omitempty"`
}

func (s GetAntchainAtoFundRepaymentplanResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundRepaymentplanResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundRepaymentplanResponse) SetReqMsgId(v string) *GetAntchainAtoFundRepaymentplanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainAtoFundRepaymentplanResponse) SetResultCode(v string) *GetAntchainAtoFundRepaymentplanResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainAtoFundRepaymentplanResponse) SetResultMsg(v string) *GetAntchainAtoFundRepaymentplanResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainAtoFundRepaymentplanResponse) SetOrderId(v string) *GetAntchainAtoFundRepaymentplanResponse {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoFundRepaymentplanResponse) SetLeaseAlipayUid(v string) *GetAntchainAtoFundRepaymentplanResponse {
	s.LeaseAlipayUid = &v
	return s
}

func (s *GetAntchainAtoFundRepaymentplanResponse) SetGracePeriodDays(v int64) *GetAntchainAtoFundRepaymentplanResponse {
	s.GracePeriodDays = &v
	return s
}

func (s *GetAntchainAtoFundRepaymentplanResponse) SetRepayStrategyList(v string) *GetAntchainAtoFundRepaymentplanResponse {
	s.RepayStrategyList = &v
	return s
}

func (s *GetAntchainAtoFundRepaymentplanResponse) SetPunishmentType(v string) *GetAntchainAtoFundRepaymentplanResponse {
	s.PunishmentType = &v
	return s
}

func (s *GetAntchainAtoFundRepaymentplanResponse) SetPayPeriod(v int64) *GetAntchainAtoFundRepaymentplanResponse {
	s.PayPeriod = &v
	return s
}

type SyncAntchainAtoFundWithholdingcontractRequest struct {
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

func (s SyncAntchainAtoFundWithholdingcontractRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundWithholdingcontractRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundWithholdingcontractRequest) SetAuthToken(v string) *SyncAntchainAtoFundWithholdingcontractRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainAtoFundWithholdingcontractRequest) SetProductInstanceId(v string) *SyncAntchainAtoFundWithholdingcontractRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainAtoFundWithholdingcontractRequest) SetOrderId(v string) *SyncAntchainAtoFundWithholdingcontractRequest {
	s.OrderId = &v
	return s
}

func (s *SyncAntchainAtoFundWithholdingcontractRequest) SetMerchantTenantId(v string) *SyncAntchainAtoFundWithholdingcontractRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *SyncAntchainAtoFundWithholdingcontractRequest) SetWithholdingContractId(v string) *SyncAntchainAtoFundWithholdingcontractRequest {
	s.WithholdingContractId = &v
	return s
}

func (s *SyncAntchainAtoFundWithholdingcontractRequest) SetExtraInfo(v string) *SyncAntchainAtoFundWithholdingcontractRequest {
	s.ExtraInfo = &v
	return s
}

func (s *SyncAntchainAtoFundWithholdingcontractRequest) SetStatus(v string) *SyncAntchainAtoFundWithholdingcontractRequest {
	s.Status = &v
	return s
}

type SyncAntchainAtoFundWithholdingcontractResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存储成功
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncAntchainAtoFundWithholdingcontractResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundWithholdingcontractResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundWithholdingcontractResponse) SetReqMsgId(v string) *SyncAntchainAtoFundWithholdingcontractResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainAtoFundWithholdingcontractResponse) SetResultCode(v string) *SyncAntchainAtoFundWithholdingcontractResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainAtoFundWithholdingcontractResponse) SetResultMsg(v string) *SyncAntchainAtoFundWithholdingcontractResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAntchainAtoFundWithholdingcontractResponse) SetResponseData(v string) *SyncAntchainAtoFundWithholdingcontractResponse {
	s.ResponseData = &v
	return s
}

type SyncAntchainAtoFundOrderfulfillmentRequest struct {
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

func (s SyncAntchainAtoFundOrderfulfillmentRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundOrderfulfillmentRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetAuthToken(v string) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetProductInstanceId(v string) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetMerchantTenantId(v string) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetOrderId(v string) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.OrderId = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetLeaseTermIndex(v int64) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.LeaseTermIndex = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetRemainTerm(v int64) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.RemainTerm = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetTotalTerm(v int64) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.TotalTerm = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetRentalReturnState(v string) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.RentalReturnState = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetRentalMoney(v int64) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.RentalMoney = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetPenaltyFeeMoney(v int64) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.PenaltyFeeMoney = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetTotalMoney(v int64) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.TotalMoney = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetReturnTime(v string) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.ReturnTime = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetReturnWay(v string) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.ReturnWay = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetReturnVoucherSerial(v string) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.ReturnVoucherSerial = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetBankName(v string) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.BankName = &v
	return s
}

type SyncAntchainAtoFundOrderfulfillmentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 添加成功
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncAntchainAtoFundOrderfulfillmentResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundOrderfulfillmentResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundOrderfulfillmentResponse) SetReqMsgId(v string) *SyncAntchainAtoFundOrderfulfillmentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentResponse) SetResultCode(v string) *SyncAntchainAtoFundOrderfulfillmentResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentResponse) SetResultMsg(v string) *SyncAntchainAtoFundOrderfulfillmentResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentResponse) SetResponseData(v string) *SyncAntchainAtoFundOrderfulfillmentResponse {
	s.ResponseData = &v
	return s
}

type GetAntchainAtoFundOrderfulfillmentRequest struct {
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

func (s GetAntchainAtoFundOrderfulfillmentRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundOrderfulfillmentRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundOrderfulfillmentRequest) SetAuthToken(v string) *GetAntchainAtoFundOrderfulfillmentRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainAtoFundOrderfulfillmentRequest) SetProductInstanceId(v string) *GetAntchainAtoFundOrderfulfillmentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainAtoFundOrderfulfillmentRequest) SetOrderId(v string) *GetAntchainAtoFundOrderfulfillmentRequest {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoFundOrderfulfillmentRequest) SetMerchantTenantId(v string) *GetAntchainAtoFundOrderfulfillmentRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *GetAntchainAtoFundOrderfulfillmentRequest) SetTermIdx(v int64) *GetAntchainAtoFundOrderfulfillmentRequest {
	s.TermIdx = &v
	return s
}

type GetAntchainAtoFundOrderfulfillmentResponse struct {
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

func (s GetAntchainAtoFundOrderfulfillmentResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundOrderfulfillmentResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundOrderfulfillmentResponse) SetReqMsgId(v string) *GetAntchainAtoFundOrderfulfillmentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainAtoFundOrderfulfillmentResponse) SetResultCode(v string) *GetAntchainAtoFundOrderfulfillmentResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainAtoFundOrderfulfillmentResponse) SetResultMsg(v string) *GetAntchainAtoFundOrderfulfillmentResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainAtoFundOrderfulfillmentResponse) SetOrderFulfillmentDataList(v string) *GetAntchainAtoFundOrderfulfillmentResponse {
	s.OrderFulfillmentDataList = &v
	return s
}

type CreateAntchainAtoWithholdSignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
	// 支付宝商户id，使用签约能力前时候进行向平台申请
	AlipayMerchantId *string `json:"alipay_merchant_id,omitempty" xml:"alipay_merchant_id,omitempty" require:"true" maxLength:"20"`
	// 支付宝商户名称，会展示在支付并签约界面
	AlipayMerchantName *string `json:"alipay_merchant_name,omitempty" xml:"alipay_merchant_name,omitempty" require:"true" maxLength:"50"`
	// 支付宝商户服务名称，会展示在支付并签约界面
	AlipayMerchantServiceName *string `json:"alipay_merchant_service_name,omitempty" xml:"alipay_merchant_service_name,omitempty" require:"true" maxLength:"50"`
	// 支付宝商户服务描述，会展示在支付并签约界面
	AlipayMerchantServiceDescription *string `json:"alipay_merchant_service_description,omitempty" xml:"alipay_merchant_service_description,omitempty" require:"true" maxLength:"150"`
}

func (s CreateAntchainAtoWithholdSignRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainAtoWithholdSignRequest) GoString() string {
	return s.String()
}

func (s *CreateAntchainAtoWithholdSignRequest) SetAuthToken(v string) *CreateAntchainAtoWithholdSignRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignRequest) SetProductInstanceId(v string) *CreateAntchainAtoWithholdSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignRequest) SetOrderId(v string) *CreateAntchainAtoWithholdSignRequest {
	s.OrderId = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignRequest) SetAlipayMerchantId(v string) *CreateAntchainAtoWithholdSignRequest {
	s.AlipayMerchantId = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignRequest) SetAlipayMerchantName(v string) *CreateAntchainAtoWithholdSignRequest {
	s.AlipayMerchantName = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignRequest) SetAlipayMerchantServiceName(v string) *CreateAntchainAtoWithholdSignRequest {
	s.AlipayMerchantServiceName = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignRequest) SetAlipayMerchantServiceDescription(v string) *CreateAntchainAtoWithholdSignRequest {
	s.AlipayMerchantServiceDescription = &v
	return s
}

type CreateAntchainAtoWithholdSignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签约字符串
	SignStr *string `json:"sign_str,omitempty" xml:"sign_str,omitempty"`
}

func (s CreateAntchainAtoWithholdSignResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainAtoWithholdSignResponse) GoString() string {
	return s.String()
}

func (s *CreateAntchainAtoWithholdSignResponse) SetReqMsgId(v string) *CreateAntchainAtoWithholdSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignResponse) SetResultCode(v string) *CreateAntchainAtoWithholdSignResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignResponse) SetResultMsg(v string) *CreateAntchainAtoWithholdSignResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignResponse) SetSignStr(v string) *CreateAntchainAtoWithholdSignResponse {
	s.SignStr = &v
	return s
}

type QueryAntchainAtoWithholdSignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
}

func (s QueryAntchainAtoWithholdSignRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoWithholdSignRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoWithholdSignRequest) SetAuthToken(v string) *QueryAntchainAtoWithholdSignRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainAtoWithholdSignRequest) SetProductInstanceId(v string) *QueryAntchainAtoWithholdSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainAtoWithholdSignRequest) SetOrderId(v string) *QueryAntchainAtoWithholdSignRequest {
	s.OrderId = &v
	return s
}

type QueryAntchainAtoWithholdSignResponse struct {
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
}

func (s QueryAntchainAtoWithholdSignResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoWithholdSignResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoWithholdSignResponse) SetReqMsgId(v string) *QueryAntchainAtoWithholdSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainAtoWithholdSignResponse) SetResultCode(v string) *QueryAntchainAtoWithholdSignResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainAtoWithholdSignResponse) SetResultMsg(v string) *QueryAntchainAtoWithholdSignResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainAtoWithholdSignResponse) SetStatus(v string) *QueryAntchainAtoWithholdSignResponse {
	s.Status = &v
	return s
}

func (s *QueryAntchainAtoWithholdSignResponse) SetSignTime(v string) *QueryAntchainAtoWithholdSignResponse {
	s.SignTime = &v
	return s
}

func (s *QueryAntchainAtoWithholdSignResponse) SetValidTime(v string) *QueryAntchainAtoWithholdSignResponse {
	s.ValidTime = &v
	return s
}

func (s *QueryAntchainAtoWithholdSignResponse) SetInvalidTime(v string) *QueryAntchainAtoWithholdSignResponse {
	s.InvalidTime = &v
	return s
}

type SyncAntchainAtoTradeFullRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 购买用户信息
	UserInfo *UserSyncInfo `json:"user_info,omitempty" xml:"user_info,omitempty" require:"true"`
	// 主订单信息
	OrderInfo *OrderInfo `json:"order_info,omitempty" xml:"order_info,omitempty" require:"true"`
	// 订单包含的商品信息列表
	GoodsInfo *GoodsInfo `json:"goods_info,omitempty" xml:"goods_info,omitempty" require:"true"`
	// 订单还款计划
	PromiseInfo *PromiseInfo `json:"promise_info,omitempty" xml:"promise_info,omitempty" require:"true"`
}

func (s SyncAntchainAtoTradeFullRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoTradeFullRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoTradeFullRequest) SetAuthToken(v string) *SyncAntchainAtoTradeFullRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainAtoTradeFullRequest) SetProductInstanceId(v string) *SyncAntchainAtoTradeFullRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainAtoTradeFullRequest) SetUserInfo(v *UserSyncInfo) *SyncAntchainAtoTradeFullRequest {
	s.UserInfo = v
	return s
}

func (s *SyncAntchainAtoTradeFullRequest) SetOrderInfo(v *OrderInfo) *SyncAntchainAtoTradeFullRequest {
	s.OrderInfo = v
	return s
}

func (s *SyncAntchainAtoTradeFullRequest) SetGoodsInfo(v *GoodsInfo) *SyncAntchainAtoTradeFullRequest {
	s.GoodsInfo = v
	return s
}

func (s *SyncAntchainAtoTradeFullRequest) SetPromiseInfo(v *PromiseInfo) *SyncAntchainAtoTradeFullRequest {
	s.PromiseInfo = v
	return s
}

type SyncAntchainAtoTradeFullResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 同步成功
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncAntchainAtoTradeFullResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoTradeFullResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoTradeFullResponse) SetReqMsgId(v string) *SyncAntchainAtoTradeFullResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainAtoTradeFullResponse) SetResultCode(v string) *SyncAntchainAtoTradeFullResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainAtoTradeFullResponse) SetResultMsg(v string) *SyncAntchainAtoTradeFullResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAntchainAtoTradeFullResponse) SetResponseData(v string) *SyncAntchainAtoTradeFullResponse {
	s.ResponseData = &v
	return s
}

type AuthAntchainAtoSignFlowRequest struct {
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

func (s AuthAntchainAtoSignFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthAntchainAtoSignFlowRequest) GoString() string {
	return s.String()
}

func (s *AuthAntchainAtoSignFlowRequest) SetAuthToken(v string) *AuthAntchainAtoSignFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthAntchainAtoSignFlowRequest) SetProductInstanceId(v string) *AuthAntchainAtoSignFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthAntchainAtoSignFlowRequest) SetSignNo(v string) *AuthAntchainAtoSignFlowRequest {
	s.SignNo = &v
	return s
}

func (s *AuthAntchainAtoSignFlowRequest) SetTag(v string) *AuthAntchainAtoSignFlowRequest {
	s.Tag = &v
	return s
}

func (s *AuthAntchainAtoSignFlowRequest) SetBizFlowId(v string) *AuthAntchainAtoSignFlowRequest {
	s.BizFlowId = &v
	return s
}

func (s *AuthAntchainAtoSignFlowRequest) SetAccountId(v string) *AuthAntchainAtoSignFlowRequest {
	s.AccountId = &v
	return s
}

type AuthAntchainAtoSignFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署最后落签的签署区域id列表
	SignFieldIds *string `json:"sign_field_ids,omitempty" xml:"sign_field_ids,omitempty"`
}

func (s AuthAntchainAtoSignFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthAntchainAtoSignFlowResponse) GoString() string {
	return s.String()
}

func (s *AuthAntchainAtoSignFlowResponse) SetReqMsgId(v string) *AuthAntchainAtoSignFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthAntchainAtoSignFlowResponse) SetResultCode(v string) *AuthAntchainAtoSignFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthAntchainAtoSignFlowResponse) SetResultMsg(v string) *AuthAntchainAtoSignFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthAntchainAtoSignFlowResponse) SetSignFieldIds(v string) *AuthAntchainAtoSignFlowResponse {
	s.SignFieldIds = &v
	return s
}

type UnbindAntchainAtoWithholdSignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
}

func (s UnbindAntchainAtoWithholdSignRequest) String() string {
	return tea.Prettify(s)
}

func (s UnbindAntchainAtoWithholdSignRequest) GoString() string {
	return s.String()
}

func (s *UnbindAntchainAtoWithholdSignRequest) SetAuthToken(v string) *UnbindAntchainAtoWithholdSignRequest {
	s.AuthToken = &v
	return s
}

func (s *UnbindAntchainAtoWithholdSignRequest) SetProductInstanceId(v string) *UnbindAntchainAtoWithholdSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UnbindAntchainAtoWithholdSignRequest) SetOrderId(v string) *UnbindAntchainAtoWithholdSignRequest {
	s.OrderId = &v
	return s
}

type UnbindAntchainAtoWithholdSignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UnbindAntchainAtoWithholdSignResponse) String() string {
	return tea.Prettify(s)
}

func (s UnbindAntchainAtoWithholdSignResponse) GoString() string {
	return s.String()
}

func (s *UnbindAntchainAtoWithholdSignResponse) SetReqMsgId(v string) *UnbindAntchainAtoWithholdSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UnbindAntchainAtoWithholdSignResponse) SetResultCode(v string) *UnbindAntchainAtoWithholdSignResponse {
	s.ResultCode = &v
	return s
}

func (s *UnbindAntchainAtoWithholdSignResponse) SetResultMsg(v string) *UnbindAntchainAtoWithholdSignResponse {
	s.ResultMsg = &v
	return s
}

type CancelAntchainAtoWithholdPlanRequest struct {
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

func (s CancelAntchainAtoWithholdPlanRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelAntchainAtoWithholdPlanRequest) GoString() string {
	return s.String()
}

func (s *CancelAntchainAtoWithholdPlanRequest) SetAuthToken(v string) *CancelAntchainAtoWithholdPlanRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelAntchainAtoWithholdPlanRequest) SetProductInstanceId(v string) *CancelAntchainAtoWithholdPlanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelAntchainAtoWithholdPlanRequest) SetOrderId(v string) *CancelAntchainAtoWithholdPlanRequest {
	s.OrderId = &v
	return s
}

func (s *CancelAntchainAtoWithholdPlanRequest) SetCancelReason(v string) *CancelAntchainAtoWithholdPlanRequest {
	s.CancelReason = &v
	return s
}

type CancelAntchainAtoWithholdPlanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CancelAntchainAtoWithholdPlanResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelAntchainAtoWithholdPlanResponse) GoString() string {
	return s.String()
}

func (s *CancelAntchainAtoWithholdPlanResponse) SetReqMsgId(v string) *CancelAntchainAtoWithholdPlanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelAntchainAtoWithholdPlanResponse) SetResultCode(v string) *CancelAntchainAtoWithholdPlanResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelAntchainAtoWithholdPlanResponse) SetResultMsg(v string) *CancelAntchainAtoWithholdPlanResponse {
	s.ResultMsg = &v
	return s
}

type RepayAntchainAtoWithholdPlanRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
	// 第几期
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" require:"true" minimum:"1"`
	// 扣款时间
	GmtPay *string `json:"gmt_pay,omitempty" xml:"gmt_pay,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 清偿清欠金额，单位为分
	PayOffAmount *int64 `json:"pay_off_amount,omitempty" xml:"pay_off_amount,omitempty" require:"true" minimum:"0"`
	// 清偿清欠方式
	// WECHAT:微信;
	// BANK:银行
	PayOffType *string `json:"pay_off_type,omitempty" xml:"pay_off_type,omitempty" require:"true" maxLength:"64"`
	// 清偿清欠单号,通过其他方式清偿的第三方单号;例如银行流水号或微信流水号
	PayOffNo *string `json:"pay_off_no,omitempty" xml:"pay_off_no,omitempty" require:"true" maxLength:"64"`
	// 清偿清欠银行名称,方式为银行时必填
	PayOffBankName *string `json:"pay_off_bank_name,omitempty" xml:"pay_off_bank_name,omitempty" maxLength:"64"`
}

func (s RepayAntchainAtoWithholdPlanRequest) String() string {
	return tea.Prettify(s)
}

func (s RepayAntchainAtoWithholdPlanRequest) GoString() string {
	return s.String()
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetAuthToken(v string) *RepayAntchainAtoWithholdPlanRequest {
	s.AuthToken = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetProductInstanceId(v string) *RepayAntchainAtoWithholdPlanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetOrderId(v string) *RepayAntchainAtoWithholdPlanRequest {
	s.OrderId = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetPeriodNum(v int64) *RepayAntchainAtoWithholdPlanRequest {
	s.PeriodNum = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetGmtPay(v string) *RepayAntchainAtoWithholdPlanRequest {
	s.GmtPay = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetPayOffAmount(v int64) *RepayAntchainAtoWithholdPlanRequest {
	s.PayOffAmount = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetPayOffType(v string) *RepayAntchainAtoWithholdPlanRequest {
	s.PayOffType = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetPayOffNo(v string) *RepayAntchainAtoWithholdPlanRequest {
	s.PayOffNo = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetPayOffBankName(v string) *RepayAntchainAtoWithholdPlanRequest {
	s.PayOffBankName = &v
	return s
}

type RepayAntchainAtoWithholdPlanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RepayAntchainAtoWithholdPlanResponse) String() string {
	return tea.Prettify(s)
}

func (s RepayAntchainAtoWithholdPlanResponse) GoString() string {
	return s.String()
}

func (s *RepayAntchainAtoWithholdPlanResponse) SetReqMsgId(v string) *RepayAntchainAtoWithholdPlanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanResponse) SetResultCode(v string) *RepayAntchainAtoWithholdPlanResponse {
	s.ResultCode = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanResponse) SetResultMsg(v string) *RepayAntchainAtoWithholdPlanResponse {
	s.ResultMsg = &v
	return s
}

type RetryAntchainAtoWithholdPlanRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
	// 第几期
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" require:"true" minimum:"1"`
}

func (s RetryAntchainAtoWithholdPlanRequest) String() string {
	return tea.Prettify(s)
}

func (s RetryAntchainAtoWithholdPlanRequest) GoString() string {
	return s.String()
}

func (s *RetryAntchainAtoWithholdPlanRequest) SetAuthToken(v string) *RetryAntchainAtoWithholdPlanRequest {
	s.AuthToken = &v
	return s
}

func (s *RetryAntchainAtoWithholdPlanRequest) SetProductInstanceId(v string) *RetryAntchainAtoWithholdPlanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RetryAntchainAtoWithholdPlanRequest) SetOrderId(v string) *RetryAntchainAtoWithholdPlanRequest {
	s.OrderId = &v
	return s
}

func (s *RetryAntchainAtoWithholdPlanRequest) SetPeriodNum(v int64) *RetryAntchainAtoWithholdPlanRequest {
	s.PeriodNum = &v
	return s
}

type RetryAntchainAtoWithholdPlanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RetryAntchainAtoWithholdPlanResponse) String() string {
	return tea.Prettify(s)
}

func (s RetryAntchainAtoWithholdPlanResponse) GoString() string {
	return s.String()
}

func (s *RetryAntchainAtoWithholdPlanResponse) SetReqMsgId(v string) *RetryAntchainAtoWithholdPlanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RetryAntchainAtoWithholdPlanResponse) SetResultCode(v string) *RetryAntchainAtoWithholdPlanResponse {
	s.ResultCode = &v
	return s
}

func (s *RetryAntchainAtoWithholdPlanResponse) SetResultMsg(v string) *RetryAntchainAtoWithholdPlanResponse {
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
				"_prod_code":       tea.String("ak_2abe765c32934341bd9bb6cc1c8ff589"),
				"_prod_channel":    tea.String("saas"),
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
 * Description: 对账saas交易信息同步接口
 * Summary: 对账saas交易信息同步接口
 */
func (client *Client) SyncAntchainAtoTrade(request *SyncAntchainAtoTradeRequest) (_result *SyncAntchainAtoTradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainAtoTradeResponse{}
	_body, _err := client.SyncAntchainAtoTradeEx(request, headers, runtime)
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
func (client *Client) SyncAntchainAtoTradeEx(request *SyncAntchainAtoTradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainAtoTradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainAtoTradeResponse{}
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
func (client *Client) GetAntchainAtoTrade(request *GetAntchainAtoTradeRequest) (_result *GetAntchainAtoTradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainAtoTradeResponse{}
	_body, _err := client.GetAntchainAtoTradeEx(request, headers, runtime)
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
func (client *Client) GetAntchainAtoTradeEx(request *GetAntchainAtoTradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainAtoTradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainAtoTradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) CreateAntchainAtoRealpersonFacevrf(request *CreateAntchainAtoRealpersonFacevrfRequest) (_result *CreateAntchainAtoRealpersonFacevrfResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAntchainAtoRealpersonFacevrfResponse{}
	_body, _err := client.CreateAntchainAtoRealpersonFacevrfEx(request, headers, runtime)
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
func (client *Client) CreateAntchainAtoRealpersonFacevrfEx(request *CreateAntchainAtoRealpersonFacevrfRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAntchainAtoRealpersonFacevrfResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAntchainAtoRealpersonFacevrfResponse{}
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
func (client *Client) QueryAntchainAtoRealpersonFacevrf(request *QueryAntchainAtoRealpersonFacevrfRequest) (_result *QueryAntchainAtoRealpersonFacevrfResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainAtoRealpersonFacevrfResponse{}
	_body, _err := client.QueryAntchainAtoRealpersonFacevrfEx(request, headers, runtime)
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
func (client *Client) QueryAntchainAtoRealpersonFacevrfEx(request *QueryAntchainAtoRealpersonFacevrfRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainAtoRealpersonFacevrfResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainAtoRealpersonFacevrfResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.realperson.facevrf.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) AllAntchainAtoSignTemplate(request *AllAntchainAtoSignTemplateRequest) (_result *AllAntchainAtoSignTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllAntchainAtoSignTemplateResponse{}
	_body, _err := client.AllAntchainAtoSignTemplateEx(request, headers, runtime)
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
func (client *Client) AllAntchainAtoSignTemplateEx(request *AllAntchainAtoSignTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllAntchainAtoSignTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllAntchainAtoSignTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.template.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交电子合同的签署流程
 * Summary: 提交电子合同的签署流程
 */
func (client *Client) SubmitAntchainAtoSignFlow(request *SubmitAntchainAtoSignFlowRequest) (_result *SubmitAntchainAtoSignFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitAntchainAtoSignFlowResponse{}
	_body, _err := client.SubmitAntchainAtoSignFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交电子合同的签署流程
 * Summary: 提交电子合同的签署流程
 */
func (client *Client) SubmitAntchainAtoSignFlowEx(request *SubmitAntchainAtoSignFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitAntchainAtoSignFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitAntchainAtoSignFlowResponse{}
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
func (client *Client) GetAntchainAtoSignFlow(request *GetAntchainAtoSignFlowRequest) (_result *GetAntchainAtoSignFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainAtoSignFlowResponse{}
	_body, _err := client.GetAntchainAtoSignFlowEx(request, headers, runtime)
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
func (client *Client) GetAntchainAtoSignFlowEx(request *GetAntchainAtoSignFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainAtoSignFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainAtoSignFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.flow.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分账流水同步
 * Summary: 分账流水同步
 */
func (client *Client) SyncAntchainAtoFundSplitting(request *SyncAntchainAtoFundSplittingRequest) (_result *SyncAntchainAtoFundSplittingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainAtoFundSplittingResponse{}
	_body, _err := client.SyncAntchainAtoFundSplittingEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分账流水同步
 * Summary: 分账流水同步
 */
func (client *Client) SyncAntchainAtoFundSplittingEx(request *SyncAntchainAtoFundSplittingRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainAtoFundSplittingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainAtoFundSplittingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.splitting.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提供给融资资金方，用以订单融资结果同步
 * Summary: 订单融资结果同步
 */
func (client *Client) SyncAntchainAtoFundOrderfinancial(request *SyncAntchainAtoFundOrderfinancialRequest) (_result *SyncAntchainAtoFundOrderfinancialResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainAtoFundOrderfinancialResponse{}
	_body, _err := client.SyncAntchainAtoFundOrderfinancialEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提供给融资资金方，用以订单融资结果同步
 * Summary: 订单融资结果同步
 */
func (client *Client) SyncAntchainAtoFundOrderfinancialEx(request *SyncAntchainAtoFundOrderfinancialRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainAtoFundOrderfinancialResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainAtoFundOrderfinancialResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.orderfinancial.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 将返回订单实人认证通过后的、商家同步的还款计划
 * Summary: 获取商家同步的还款计划
 */
func (client *Client) GetAntchainAtoFundRepaymentplan(request *GetAntchainAtoFundRepaymentplanRequest) (_result *GetAntchainAtoFundRepaymentplanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainAtoFundRepaymentplanResponse{}
	_body, _err := client.GetAntchainAtoFundRepaymentplanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 将返回订单实人认证通过后的、商家同步的还款计划
 * Summary: 获取商家同步的还款计划
 */
func (client *Client) GetAntchainAtoFundRepaymentplanEx(request *GetAntchainAtoFundRepaymentplanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainAtoFundRepaymentplanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainAtoFundRepaymentplanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.repaymentplan.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 同步租赁订单的代扣协议
 * Summary: 同步租赁订单的代扣协议
 */
func (client *Client) SyncAntchainAtoFundWithholdingcontract(request *SyncAntchainAtoFundWithholdingcontractRequest) (_result *SyncAntchainAtoFundWithholdingcontractResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainAtoFundWithholdingcontractResponse{}
	_body, _err := client.SyncAntchainAtoFundWithholdingcontractEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 同步租赁订单的代扣协议
 * Summary: 同步租赁订单的代扣协议
 */
func (client *Client) SyncAntchainAtoFundWithholdingcontractEx(request *SyncAntchainAtoFundWithholdingcontractRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainAtoFundWithholdingcontractResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainAtoFundWithholdingcontractResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.withholdingcontract.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资方回传一条订单还款履约信息
 * Summary: 同步订单还款履约信息
 */
func (client *Client) SyncAntchainAtoFundOrderfulfillment(request *SyncAntchainAtoFundOrderfulfillmentRequest) (_result *SyncAntchainAtoFundOrderfulfillmentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainAtoFundOrderfulfillmentResponse{}
	_body, _err := client.SyncAntchainAtoFundOrderfulfillmentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资方回传一条订单还款履约信息
 * Summary: 同步订单还款履约信息
 */
func (client *Client) SyncAntchainAtoFundOrderfulfillmentEx(request *SyncAntchainAtoFundOrderfulfillmentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainAtoFundOrderfulfillmentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainAtoFundOrderfulfillmentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.orderfulfillment.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取订单的履约信息
 * Summary: 获取订单的履约信息
 */
func (client *Client) GetAntchainAtoFundOrderfulfillment(request *GetAntchainAtoFundOrderfulfillmentRequest) (_result *GetAntchainAtoFundOrderfulfillmentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainAtoFundOrderfulfillmentResponse{}
	_body, _err := client.GetAntchainAtoFundOrderfulfillmentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取订单的履约信息
 * Summary: 获取订单的履约信息
 */
func (client *Client) GetAntchainAtoFundOrderfulfillmentEx(request *GetAntchainAtoFundOrderfulfillmentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainAtoFundOrderfulfillmentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainAtoFundOrderfulfillmentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.orderfulfillment.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣签约
 * Summary: 代扣签约
 */
func (client *Client) CreateAntchainAtoWithholdSign(request *CreateAntchainAtoWithholdSignRequest) (_result *CreateAntchainAtoWithholdSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAntchainAtoWithholdSignResponse{}
	_body, _err := client.CreateAntchainAtoWithholdSignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣签约
 * Summary: 代扣签约
 */
func (client *Client) CreateAntchainAtoWithholdSignEx(request *CreateAntchainAtoWithholdSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAntchainAtoWithholdSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAntchainAtoWithholdSignResponse{}
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
func (client *Client) QueryAntchainAtoWithholdSign(request *QueryAntchainAtoWithholdSignRequest) (_result *QueryAntchainAtoWithholdSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainAtoWithholdSignResponse{}
	_body, _err := client.QueryAntchainAtoWithholdSignEx(request, headers, runtime)
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
func (client *Client) QueryAntchainAtoWithholdSignEx(request *QueryAntchainAtoWithholdSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainAtoWithholdSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainAtoWithholdSignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.sign.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 同步商家的订单信息，包含下单人信息、订单信息、订单关联的商品信息以及订单绑定的还款计划。
 * Summary: 同步商家的订单信息
 */
func (client *Client) SyncAntchainAtoTradeFull(request *SyncAntchainAtoTradeFullRequest) (_result *SyncAntchainAtoTradeFullResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainAtoTradeFullResponse{}
	_body, _err := client.SyncAntchainAtoTradeFullEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 同步商家的订单信息，包含下单人信息、订单信息、订单关联的商品信息以及订单绑定的还款计划。
 * Summary: 同步商家的订单信息
 */
func (client *Client) SyncAntchainAtoTradeFullEx(request *SyncAntchainAtoTradeFullRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainAtoTradeFullResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainAtoTradeFullResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.full.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) AuthAntchainAtoSignFlow(request *AuthAntchainAtoSignFlowRequest) (_result *AuthAntchainAtoSignFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthAntchainAtoSignFlowResponse{}
	_body, _err := client.AuthAntchainAtoSignFlowEx(request, headers, runtime)
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
func (client *Client) AuthAntchainAtoSignFlowEx(request *AuthAntchainAtoSignFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthAntchainAtoSignFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthAntchainAtoSignFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.flow.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) UnbindAntchainAtoWithholdSign(request *UnbindAntchainAtoWithholdSignRequest) (_result *UnbindAntchainAtoWithholdSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UnbindAntchainAtoWithholdSignResponse{}
	_body, _err := client.UnbindAntchainAtoWithholdSignEx(request, headers, runtime)
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
func (client *Client) UnbindAntchainAtoWithholdSignEx(request *UnbindAntchainAtoWithholdSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UnbindAntchainAtoWithholdSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UnbindAntchainAtoWithholdSignResponse{}
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
func (client *Client) CancelAntchainAtoWithholdPlan(request *CancelAntchainAtoWithholdPlanRequest) (_result *CancelAntchainAtoWithholdPlanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelAntchainAtoWithholdPlanResponse{}
	_body, _err := client.CancelAntchainAtoWithholdPlanEx(request, headers, runtime)
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
func (client *Client) CancelAntchainAtoWithholdPlanEx(request *CancelAntchainAtoWithholdPlanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelAntchainAtoWithholdPlanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelAntchainAtoWithholdPlanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.plan.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
 * Summary: 代扣计划清偿/清欠
 */
func (client *Client) RepayAntchainAtoWithholdPlan(request *RepayAntchainAtoWithholdPlanRequest) (_result *RepayAntchainAtoWithholdPlanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RepayAntchainAtoWithholdPlanResponse{}
	_body, _err := client.RepayAntchainAtoWithholdPlanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
 * Summary: 代扣计划清偿/清欠
 */
func (client *Client) RepayAntchainAtoWithholdPlanEx(request *RepayAntchainAtoWithholdPlanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RepayAntchainAtoWithholdPlanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RepayAntchainAtoWithholdPlanResponse{}
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
func (client *Client) RetryAntchainAtoWithholdPlan(request *RetryAntchainAtoWithholdPlanRequest) (_result *RetryAntchainAtoWithholdPlanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RetryAntchainAtoWithholdPlanResponse{}
	_body, _err := client.RetryAntchainAtoWithholdPlanEx(request, headers, runtime)
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
func (client *Client) RetryAntchainAtoWithholdPlanEx(request *RetryAntchainAtoWithholdPlanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RetryAntchainAtoWithholdPlanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RetryAntchainAtoWithholdPlanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.plan.retry"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
