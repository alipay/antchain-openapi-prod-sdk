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
				"sdk_version":      tea.String("1.0.5"),
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
