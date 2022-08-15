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

// 123
type InfoSecHitDetectItem struct {
	// 123
	DetectTypeCode *string `json:"detect_type_code,omitempty" xml:"detect_type_code,omitempty"`
	// 123
	HitDetectResource *string `json:"hit_detect_resource,omitempty" xml:"hit_detect_resource,omitempty"`
	// 123
	HitContent *string `json:"hit_content,omitempty" xml:"hit_content,omitempty"`
	// 123
	DetectResourceLevel *string `json:"detect_resource_level,omitempty" xml:"detect_resource_level,omitempty"`
}

func (s InfoSecHitDetectItem) String() string {
	return tea.Prettify(s)
}

func (s InfoSecHitDetectItem) GoString() string {
	return s.String()
}

func (s *InfoSecHitDetectItem) SetDetectTypeCode(v string) *InfoSecHitDetectItem {
	s.DetectTypeCode = &v
	return s
}

func (s *InfoSecHitDetectItem) SetHitDetectResource(v string) *InfoSecHitDetectItem {
	s.HitDetectResource = &v
	return s
}

func (s *InfoSecHitDetectItem) SetHitContent(v string) *InfoSecHitDetectItem {
	s.HitContent = &v
	return s
}

func (s *InfoSecHitDetectItem) SetDetectResourceLevel(v string) *InfoSecHitDetectItem {
	s.DetectResourceLevel = &v
	return s
}

// 内容检测接口查询返回结构
type SecurityRiskContentResultGetResponse struct {
	// 命中次数
	HitDetectItems []*InfoSecHitDetectItem `json:"hit_detect_items,omitempty" xml:"hit_detect_items,omitempty" type:"Repeated"`
	// 返回结果
	ResultAction *string `json:"result_action,omitempty" xml:"result_action,omitempty"`
}

func (s SecurityRiskContentResultGetResponse) String() string {
	return tea.Prettify(s)
}

func (s SecurityRiskContentResultGetResponse) GoString() string {
	return s.String()
}

func (s *SecurityRiskContentResultGetResponse) SetHitDetectItems(v []*InfoSecHitDetectItem) *SecurityRiskContentResultGetResponse {
	s.HitDetectItems = v
	return s
}

func (s *SecurityRiskContentResultGetResponse) SetResultAction(v string) *SecurityRiskContentResultGetResponse {
	s.ResultAction = &v
	return s
}

// 键值对，兼容map用
type NameValuePair struct {
	// 键名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 键值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s NameValuePair) String() string {
	return tea.Prettify(s)
}

func (s NameValuePair) GoString() string {
	return s.String()
}

func (s *NameValuePair) SetName(v string) *NameValuePair {
	s.Name = &v
	return s
}

func (s *NameValuePair) SetValue(v string) *NameValuePair {
	s.Value = &v
	return s
}

// 核身产品
type GwValidateProduct struct {
	// 核审产品码，支持多种核身产品。
	// ZK_FACE_VERIFY：人脸识别
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 产品渲染方式：H5、NATIVE 或 PC
	Group *string `json:"group,omitempty" xml:"group,omitempty" require:"true"`
	// 核身产品参数，因网关限制，暂只支持Map<String,String>
	ProductParams []*NameValuePair `json:"product_params,omitempty" xml:"product_params,omitempty" type:"Repeated"`
}

func (s GwValidateProduct) String() string {
	return tea.Prettify(s)
}

func (s GwValidateProduct) GoString() string {
	return s.String()
}

func (s *GwValidateProduct) SetProductCode(v string) *GwValidateProduct {
	s.ProductCode = &v
	return s
}

func (s *GwValidateProduct) SetGroup(v string) *GwValidateProduct {
	s.Group = &v
	return s
}

func (s *GwValidateProduct) SetProductParams(v []*NameValuePair) *GwValidateProduct {
	s.ProductParams = v
	return s
}

// 大安全接口返回
type InfoSecContentQueryResult struct {
	// 检测来源等级
	DetectResourceLevel *string `json:"detect_resource_level,omitempty" xml:"detect_resource_level,omitempty"`
	// 检测结果类型
	DetectTypeCode *string `json:"detect_type_code,omitempty" xml:"detect_type_code,omitempty"`
	// 命中内容
	HitContent *string `json:"hit_content,omitempty" xml:"hit_content,omitempty"`
	// 检测命中来源
	HitDetectResource *string `json:"hit_detect_resource,omitempty" xml:"hit_detect_resource,omitempty"`
}

func (s InfoSecContentQueryResult) String() string {
	return tea.Prettify(s)
}

func (s InfoSecContentQueryResult) GoString() string {
	return s.String()
}

func (s *InfoSecContentQueryResult) SetDetectResourceLevel(v string) *InfoSecContentQueryResult {
	s.DetectResourceLevel = &v
	return s
}

func (s *InfoSecContentQueryResult) SetDetectTypeCode(v string) *InfoSecContentQueryResult {
	s.DetectTypeCode = &v
	return s
}

func (s *InfoSecContentQueryResult) SetHitContent(v string) *InfoSecContentQueryResult {
	s.HitContent = &v
	return s
}

func (s *InfoSecContentQueryResult) SetHitDetectResource(v string) *InfoSecContentQueryResult {
	s.HitDetectResource = &v
	return s
}

// 内容安全查询接口返回结构
type ContentQueryResultModel struct {
	// 返回结果码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 返回错误码
	ErrMsg *string `json:"err_msg,omitempty" xml:"err_msg,omitempty"`
	// 返回结果
	Model *SecurityRiskContentResultGetResponse `json:"model,omitempty" xml:"model,omitempty"`
}

func (s ContentQueryResultModel) String() string {
	return tea.Prettify(s)
}

func (s ContentQueryResultModel) GoString() string {
	return s.String()
}

func (s *ContentQueryResultModel) SetCode(v int64) *ContentQueryResultModel {
	s.Code = &v
	return s
}

func (s *ContentQueryResultModel) SetErrMsg(v string) *ContentQueryResultModel {
	s.ErrMsg = &v
	return s
}

func (s *ContentQueryResultModel) SetModel(v *SecurityRiskContentResultGetResponse) *ContentQueryResultModel {
	s.Model = v
	return s
}

// 客户认证结果
type CustomerAuthResult struct {
	// 账户ID
	AccId *string `json:"acc_id,omitempty" xml:"acc_id,omitempty"`
	// 返回code 0:核验成功 1:企业信息有误 2:企业非正常营业
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 客户ID
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty"`
	// 客户did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 验证状态
	EnterpriseStatus *string `json:"enterprise_status,omitempty" xml:"enterprise_status,omitempty"`
	// 开业时间
	OpenTime *string `json:"open_time,omitempty" xml:"open_time,omitempty" require:"true"`
	// 认证结果，是否通过
	Pass *bool `json:"pass,omitempty" xml:"pass,omitempty" require:"true"`
	// 业务ID
	DisReqMsgId *string `json:"dis_req_msg_id,omitempty" xml:"dis_req_msg_id,omitempty"`
}

func (s CustomerAuthResult) String() string {
	return tea.Prettify(s)
}

func (s CustomerAuthResult) GoString() string {
	return s.String()
}

func (s *CustomerAuthResult) SetAccId(v string) *CustomerAuthResult {
	s.AccId = &v
	return s
}

func (s *CustomerAuthResult) SetCode(v string) *CustomerAuthResult {
	s.Code = &v
	return s
}

func (s *CustomerAuthResult) SetCustomerId(v string) *CustomerAuthResult {
	s.CustomerId = &v
	return s
}

func (s *CustomerAuthResult) SetDid(v string) *CustomerAuthResult {
	s.Did = &v
	return s
}

func (s *CustomerAuthResult) SetEnterpriseStatus(v string) *CustomerAuthResult {
	s.EnterpriseStatus = &v
	return s
}

func (s *CustomerAuthResult) SetOpenTime(v string) *CustomerAuthResult {
	s.OpenTime = &v
	return s
}

func (s *CustomerAuthResult) SetPass(v bool) *CustomerAuthResult {
	s.Pass = &v
	return s
}

func (s *CustomerAuthResult) SetDisReqMsgId(v string) *CustomerAuthResult {
	s.DisReqMsgId = &v
	return s
}

// 大安全内容安全接口返回值
type HoloxCheckResult struct {
	// 是否成功
	Sucess *bool `json:"sucess,omitempty" xml:"sucess,omitempty"`
	// 本次调用id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 结果码
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 错误码
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 结果信息
	ResultMessage *string `json:"result_message,omitempty" xml:"result_message,omitempty"`
	// 213
	WarnAction *string `json:"warn_action,omitempty" xml:"warn_action,omitempty"`
	// 123
	ContentPropertyOutputResultMap *string `json:"content_property_output_result_map,omitempty" xml:"content_property_output_result_map,omitempty" require:"true"`
	// 213
	HitResultItems *string `json:"hit_result_items,omitempty" xml:"hit_result_items,omitempty"`
}

func (s HoloxCheckResult) String() string {
	return tea.Prettify(s)
}

func (s HoloxCheckResult) GoString() string {
	return s.String()
}

func (s *HoloxCheckResult) SetSucess(v bool) *HoloxCheckResult {
	s.Sucess = &v
	return s
}

func (s *HoloxCheckResult) SetId(v string) *HoloxCheckResult {
	s.Id = &v
	return s
}

func (s *HoloxCheckResult) SetSceneCode(v string) *HoloxCheckResult {
	s.SceneCode = &v
	return s
}

func (s *HoloxCheckResult) SetResultCode(v string) *HoloxCheckResult {
	s.ResultCode = &v
	return s
}

func (s *HoloxCheckResult) SetErrorCode(v string) *HoloxCheckResult {
	s.ErrorCode = &v
	return s
}

func (s *HoloxCheckResult) SetResultMessage(v string) *HoloxCheckResult {
	s.ResultMessage = &v
	return s
}

func (s *HoloxCheckResult) SetWarnAction(v string) *HoloxCheckResult {
	s.WarnAction = &v
	return s
}

func (s *HoloxCheckResult) SetContentPropertyOutputResultMap(v string) *HoloxCheckResult {
	s.ContentPropertyOutputResultMap = &v
	return s
}

func (s *HoloxCheckResult) SetHitResultItems(v string) *HoloxCheckResult {
	s.HitResultItems = &v
	return s
}

// 大安全接口参数
type InfoSecContentQuery struct {
	// 123
	AppScene *string `json:"app_scene,omitempty" xml:"app_scene,omitempty"`
	// 123
	AppSceneDataId *string `json:"app_scene_data_id,omitempty" xml:"app_scene_data_id,omitempty"`
	// 123
	EventId *string `json:"event_id,omitempty" xml:"event_id,omitempty"`
}

func (s InfoSecContentQuery) String() string {
	return tea.Prettify(s)
}

func (s InfoSecContentQuery) GoString() string {
	return s.String()
}

func (s *InfoSecContentQuery) SetAppScene(v string) *InfoSecContentQuery {
	s.AppScene = &v
	return s
}

func (s *InfoSecContentQuery) SetAppSceneDataId(v string) *InfoSecContentQuery {
	s.AppSceneDataId = &v
	return s
}

func (s *InfoSecContentQuery) SetEventId(v string) *InfoSecContentQuery {
	s.EventId = &v
	return s
}

// 大安全接口入参
type RdsAnalyzeRequest struct {
	// 123
	Appid *string `json:"appid,omitempty" xml:"appid,omitempty" require:"true"`
	// 123
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 213
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty"`
	// 123
	Token *string `json:"token,omitempty" xml:"token,omitempty"`
	// 123
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 123
	Extra *string `json:"extra,omitempty" xml:"extra,omitempty"`
}

func (s RdsAnalyzeRequest) String() string {
	return tea.Prettify(s)
}

func (s RdsAnalyzeRequest) GoString() string {
	return s.String()
}

func (s *RdsAnalyzeRequest) SetAppid(v string) *RdsAnalyzeRequest {
	s.Appid = &v
	return s
}

func (s *RdsAnalyzeRequest) SetBizNo(v string) *RdsAnalyzeRequest {
	s.BizNo = &v
	return s
}

func (s *RdsAnalyzeRequest) SetScene(v string) *RdsAnalyzeRequest {
	s.Scene = &v
	return s
}

func (s *RdsAnalyzeRequest) SetToken(v string) *RdsAnalyzeRequest {
	s.Token = &v
	return s
}

func (s *RdsAnalyzeRequest) SetData(v string) *RdsAnalyzeRequest {
	s.Data = &v
	return s
}

func (s *RdsAnalyzeRequest) SetExtra(v string) *RdsAnalyzeRequest {
	s.Extra = &v
	return s
}

// 大安全接口入参
type SecurityUniformRequest struct {
	// 123
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
	// 123
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 132
	Params *string `json:"params,omitempty" xml:"params,omitempty" require:"true"`
}

func (s SecurityUniformRequest) String() string {
	return tea.Prettify(s)
}

func (s SecurityUniformRequest) GoString() string {
	return s.String()
}

func (s *SecurityUniformRequest) SetToken(v string) *SecurityUniformRequest {
	s.Token = &v
	return s
}

func (s *SecurityUniformRequest) SetBizId(v string) *SecurityUniformRequest {
	s.BizId = &v
	return s
}

func (s *SecurityUniformRequest) SetParams(v string) *SecurityUniformRequest {
	s.Params = &v
	return s
}

// 键值对，兼容map用
type KeyValuePair struct {
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// value
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s KeyValuePair) String() string {
	return tea.Prettify(s)
}

func (s KeyValuePair) GoString() string {
	return s.String()
}

func (s *KeyValuePair) SetKey(v string) *KeyValuePair {
	s.Key = &v
	return s
}

func (s *KeyValuePair) SetValue(v string) *KeyValuePair {
	s.Value = &v
	return s
}

// 大安全人机识别相应
type RdslibAntcaptchaservice struct {
	// 是否请求成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 相应信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 返回数据
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s RdslibAntcaptchaservice) String() string {
	return tea.Prettify(s)
}

func (s RdslibAntcaptchaservice) GoString() string {
	return s.String()
}

func (s *RdslibAntcaptchaservice) SetSuccess(v bool) *RdslibAntcaptchaservice {
	s.Success = &v
	return s
}

func (s *RdslibAntcaptchaservice) SetMessage(v string) *RdslibAntcaptchaservice {
	s.Message = &v
	return s
}

func (s *RdslibAntcaptchaservice) SetData(v string) *RdslibAntcaptchaservice {
	s.Data = &v
	return s
}

// 大安全接口返回
type SecurityUniformResponse struct {
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 123
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 123
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 123
	Token *string `json:"token,omitempty" xml:"token,omitempty"`
	// 123
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 123
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s SecurityUniformResponse) String() string {
	return tea.Prettify(s)
}

func (s SecurityUniformResponse) GoString() string {
	return s.String()
}

func (s *SecurityUniformResponse) SetSuccess(v bool) *SecurityUniformResponse {
	s.Success = &v
	return s
}

func (s *SecurityUniformResponse) SetCode(v string) *SecurityUniformResponse {
	s.Code = &v
	return s
}

func (s *SecurityUniformResponse) SetMessage(v string) *SecurityUniformResponse {
	s.Message = &v
	return s
}

func (s *SecurityUniformResponse) SetToken(v string) *SecurityUniformResponse {
	s.Token = &v
	return s
}

func (s *SecurityUniformResponse) SetBizId(v string) *SecurityUniformResponse {
	s.BizId = &v
	return s
}

func (s *SecurityUniformResponse) SetData(v string) *SecurityUniformResponse {
	s.Data = &v
	return s
}

// 大安全接口结构体
type HoloxCheckEvent struct {
	// 是否成功
	Sucess *bool `json:"sucess,omitempty" xml:"sucess,omitempty" require:"true"`
	// 123
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 12
	AppCode *string `json:"app_code,omitempty" xml:"app_code,omitempty" require:"true"`
	// 123
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 12
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
	// 123
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
	// 123
	AppSceneDataId *string `json:"app_scene_data_id,omitempty" xml:"app_scene_data_id,omitempty"`
	// 123
	AccountType *string `json:"account_type,omitempty" xml:"account_type,omitempty"`
	// 123
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 123
	RecieverId *string `json:"reciever_id,omitempty" xml:"reciever_id,omitempty" require:"true"`
	// 123
	PublishDate *string `json:"publish_date,omitempty" xml:"publish_date,omitempty" require:"true"`
	// 123
	IsTest *bool `json:"is_test,omitempty" xml:"is_test,omitempty" require:"true"`
	// 123
	IsLoadTest *bool `json:"is_load_test,omitempty" xml:"is_load_test,omitempty" require:"true"`
	// 123
	IsFusing *bool `json:"is_fusing,omitempty" xml:"is_fusing,omitempty" require:"true"`
	// 123
	SceneType *string `json:"scene_type,omitempty" xml:"scene_type,omitempty" require:"true"`
	// 123
	ContentData *string `json:"content_data,omitempty" xml:"content_data,omitempty" require:"true"`
	// 123
	EventData *string `json:"event_data,omitempty" xml:"event_data,omitempty" require:"true"`
}

func (s HoloxCheckEvent) String() string {
	return tea.Prettify(s)
}

func (s HoloxCheckEvent) GoString() string {
	return s.String()
}

func (s *HoloxCheckEvent) SetSucess(v bool) *HoloxCheckEvent {
	s.Sucess = &v
	return s
}

func (s *HoloxCheckEvent) SetId(v string) *HoloxCheckEvent {
	s.Id = &v
	return s
}

func (s *HoloxCheckEvent) SetAppCode(v string) *HoloxCheckEvent {
	s.AppCode = &v
	return s
}

func (s *HoloxCheckEvent) SetSceneCode(v string) *HoloxCheckEvent {
	s.SceneCode = &v
	return s
}

func (s *HoloxCheckEvent) SetProductCode(v string) *HoloxCheckEvent {
	s.ProductCode = &v
	return s
}

func (s *HoloxCheckEvent) SetChannel(v string) *HoloxCheckEvent {
	s.Channel = &v
	return s
}

func (s *HoloxCheckEvent) SetAppSceneDataId(v string) *HoloxCheckEvent {
	s.AppSceneDataId = &v
	return s
}

func (s *HoloxCheckEvent) SetAccountType(v string) *HoloxCheckEvent {
	s.AccountType = &v
	return s
}

func (s *HoloxCheckEvent) SetUserId(v string) *HoloxCheckEvent {
	s.UserId = &v
	return s
}

func (s *HoloxCheckEvent) SetRecieverId(v string) *HoloxCheckEvent {
	s.RecieverId = &v
	return s
}

func (s *HoloxCheckEvent) SetPublishDate(v string) *HoloxCheckEvent {
	s.PublishDate = &v
	return s
}

func (s *HoloxCheckEvent) SetIsTest(v bool) *HoloxCheckEvent {
	s.IsTest = &v
	return s
}

func (s *HoloxCheckEvent) SetIsLoadTest(v bool) *HoloxCheckEvent {
	s.IsLoadTest = &v
	return s
}

func (s *HoloxCheckEvent) SetIsFusing(v bool) *HoloxCheckEvent {
	s.IsFusing = &v
	return s
}

func (s *HoloxCheckEvent) SetSceneType(v string) *HoloxCheckEvent {
	s.SceneType = &v
	return s
}

func (s *HoloxCheckEvent) SetContentData(v string) *HoloxCheckEvent {
	s.ContentData = &v
	return s
}

func (s *HoloxCheckEvent) SetEventData(v string) *HoloxCheckEvent {
	s.EventData = &v
	return s
}

// 核身渲染结果
type GwVerifyViewResult struct {
	// 核身上下文id
	VerifyId *string `json:"verify_id,omitempty" xml:"verify_id,omitempty" require:"true"`
	// 核审产品码，支持多种核身产品。 ZK_FACE_VERIFY：人脸识别
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 核身分组
	Group *string `json:"group,omitempty" xml:"group,omitempty" require:"true"`
	// 返回结果
	ResponseParams []*NameValuePair `json:"response_params,omitempty" xml:"response_params,omitempty" require:"true" type:"Repeated"`
	// 核身渲染是否调用成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 返回码
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 返回信息
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s GwVerifyViewResult) String() string {
	return tea.Prettify(s)
}

func (s GwVerifyViewResult) GoString() string {
	return s.String()
}

func (s *GwVerifyViewResult) SetVerifyId(v string) *GwVerifyViewResult {
	s.VerifyId = &v
	return s
}

func (s *GwVerifyViewResult) SetProductCode(v string) *GwVerifyViewResult {
	s.ProductCode = &v
	return s
}

func (s *GwVerifyViewResult) SetGroup(v string) *GwVerifyViewResult {
	s.Group = &v
	return s
}

func (s *GwVerifyViewResult) SetResponseParams(v []*NameValuePair) *GwVerifyViewResult {
	s.ResponseParams = v
	return s
}

func (s *GwVerifyViewResult) SetSuccess(v bool) *GwVerifyViewResult {
	s.Success = &v
	return s
}

func (s *GwVerifyViewResult) SetResultCode(v string) *GwVerifyViewResult {
	s.ResultCode = &v
	return s
}

func (s *GwVerifyViewResult) SetResultMsg(v string) *GwVerifyViewResult {
	s.ResultMsg = &v
	return s
}

// 核审场景
type GwVerifyScene struct {
	// 调用方系统名
	SystemName *string `json:"system_name,omitempty" xml:"system_name,omitempty" require:"true"`
	// 业务方产品
	BizProduct *string `json:"biz_product,omitempty" xml:"biz_product,omitempty" require:"true"`
	// 业务产品节点
	BizProdNode *string `json:"biz_prod_node,omitempty" xml:"biz_prod_node,omitempty" require:"true"`
	// 业务接入渠道
	AccessChannel *string `json:"access_channel,omitempty" xml:"access_channel,omitempty" require:"true"`
	// 业务调用场景的语言版本、CHINESE("中文", "chi")、ENG("英文", "en")
	Language *string `json:"language,omitempty" xml:"language,omitempty" require:"true"`
}

func (s GwVerifyScene) String() string {
	return tea.Prettify(s)
}

func (s GwVerifyScene) GoString() string {
	return s.String()
}

func (s *GwVerifyScene) SetSystemName(v string) *GwVerifyScene {
	s.SystemName = &v
	return s
}

func (s *GwVerifyScene) SetBizProduct(v string) *GwVerifyScene {
	s.BizProduct = &v
	return s
}

func (s *GwVerifyScene) SetBizProdNode(v string) *GwVerifyScene {
	s.BizProdNode = &v
	return s
}

func (s *GwVerifyScene) SetAccessChannel(v string) *GwVerifyScene {
	s.AccessChannel = &v
	return s
}

func (s *GwVerifyScene) SetLanguage(v string) *GwVerifyScene {
	s.Language = &v
	return s
}

type InitAntchainBbpVerifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 接入场景（主要由接入系统、接入产品、产品节点三部分组成）
	VerifyScene *GwVerifyScene `json:"verify_scene,omitempty" xml:"verify_scene,omitempty" require:"true"`
	// 调用方传入，唯一标识一笔业务，核身平台将bizId与核身token进行绑定，用作防串改校验
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 调用方传入，存放业务扩展参数（callback参数也写入此）
	ExternParams []*NameValuePair `json:"extern_params,omitempty" xml:"extern_params,omitempty" type:"Repeated"`
	// 调用方传入，指定核身完成后的回调类型
	CallbackEnum *string `json:"callback_enum,omitempty" xml:"callback_enum,omitempty"`
	// 核身产品列表
	ValidateFlows []*GwValidateProduct `json:"validate_flows,omitempty" xml:"validate_flows,omitempty" require:"true" type:"Repeated"`
}

func (s InitAntchainBbpVerifyRequest) String() string {
	return tea.Prettify(s)
}

func (s InitAntchainBbpVerifyRequest) GoString() string {
	return s.String()
}

func (s *InitAntchainBbpVerifyRequest) SetAuthToken(v string) *InitAntchainBbpVerifyRequest {
	s.AuthToken = &v
	return s
}

func (s *InitAntchainBbpVerifyRequest) SetProductInstanceId(v string) *InitAntchainBbpVerifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitAntchainBbpVerifyRequest) SetVerifyScene(v *GwVerifyScene) *InitAntchainBbpVerifyRequest {
	s.VerifyScene = v
	return s
}

func (s *InitAntchainBbpVerifyRequest) SetBizId(v string) *InitAntchainBbpVerifyRequest {
	s.BizId = &v
	return s
}

func (s *InitAntchainBbpVerifyRequest) SetExternParams(v []*NameValuePair) *InitAntchainBbpVerifyRequest {
	s.ExternParams = v
	return s
}

func (s *InitAntchainBbpVerifyRequest) SetCallbackEnum(v string) *InitAntchainBbpVerifyRequest {
	s.CallbackEnum = &v
	return s
}

func (s *InitAntchainBbpVerifyRequest) SetValidateFlows(v []*GwValidateProduct) *InitAntchainBbpVerifyRequest {
	s.ValidateFlows = v
	return s
}

type InitAntchainBbpVerifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 核身id
	VerifyId *string `json:"verify_id,omitempty" xml:"verify_id,omitempty"`
	// 核身请求地址url
	VerifyUrl *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
	// 核身处理状态:INITIAL、PROCESSING、SUCCESS、EXPIRED、FAIL
	VerifyStatus *string `json:"verify_status,omitempty" xml:"verify_status,omitempty"`
	// 可用产品集合
	ValidProd []*GwValidateProduct `json:"valid_prod,omitempty" xml:"valid_prod,omitempty" type:"Repeated"`
}

func (s InitAntchainBbpVerifyResponse) String() string {
	return tea.Prettify(s)
}

func (s InitAntchainBbpVerifyResponse) GoString() string {
	return s.String()
}

func (s *InitAntchainBbpVerifyResponse) SetReqMsgId(v string) *InitAntchainBbpVerifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitAntchainBbpVerifyResponse) SetResultCode(v string) *InitAntchainBbpVerifyResponse {
	s.ResultCode = &v
	return s
}

func (s *InitAntchainBbpVerifyResponse) SetResultMsg(v string) *InitAntchainBbpVerifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitAntchainBbpVerifyResponse) SetVerifyId(v string) *InitAntchainBbpVerifyResponse {
	s.VerifyId = &v
	return s
}

func (s *InitAntchainBbpVerifyResponse) SetVerifyUrl(v string) *InitAntchainBbpVerifyResponse {
	s.VerifyUrl = &v
	return s
}

func (s *InitAntchainBbpVerifyResponse) SetVerifyStatus(v string) *InitAntchainBbpVerifyResponse {
	s.VerifyStatus = &v
	return s
}

func (s *InitAntchainBbpVerifyResponse) SetValidProd(v []*GwValidateProduct) *InitAntchainBbpVerifyResponse {
	s.ValidProd = v
	return s
}

type StartAntchainBbpVerifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 核身上下文id
	VerifyId *string `json:"verify_id,omitempty" xml:"verify_id,omitempty" require:"true"`
	// 核身模块分组
	Group *string `json:"group,omitempty" xml:"group,omitempty" require:"true"`
	// 核身动作：view-渲染，verify-校验，repeat-重新发送
	ProductAction *string `json:"product_action,omitempty" xml:"product_action,omitempty" require:"true"`
	// 业务id
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
}

func (s StartAntchainBbpVerifyRequest) String() string {
	return tea.Prettify(s)
}

func (s StartAntchainBbpVerifyRequest) GoString() string {
	return s.String()
}

func (s *StartAntchainBbpVerifyRequest) SetAuthToken(v string) *StartAntchainBbpVerifyRequest {
	s.AuthToken = &v
	return s
}

func (s *StartAntchainBbpVerifyRequest) SetProductInstanceId(v string) *StartAntchainBbpVerifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartAntchainBbpVerifyRequest) SetVerifyId(v string) *StartAntchainBbpVerifyRequest {
	s.VerifyId = &v
	return s
}

func (s *StartAntchainBbpVerifyRequest) SetGroup(v string) *StartAntchainBbpVerifyRequest {
	s.Group = &v
	return s
}

func (s *StartAntchainBbpVerifyRequest) SetProductAction(v string) *StartAntchainBbpVerifyRequest {
	s.ProductAction = &v
	return s
}

func (s *StartAntchainBbpVerifyRequest) SetBizId(v string) *StartAntchainBbpVerifyRequest {
	s.BizId = &v
	return s
}

type StartAntchainBbpVerifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 核身渲染结果
	Result []*GwVerifyViewResult `json:"result,omitempty" xml:"result,omitempty" type:"Repeated"`
}

func (s StartAntchainBbpVerifyResponse) String() string {
	return tea.Prettify(s)
}

func (s StartAntchainBbpVerifyResponse) GoString() string {
	return s.String()
}

func (s *StartAntchainBbpVerifyResponse) SetReqMsgId(v string) *StartAntchainBbpVerifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartAntchainBbpVerifyResponse) SetResultCode(v string) *StartAntchainBbpVerifyResponse {
	s.ResultCode = &v
	return s
}

func (s *StartAntchainBbpVerifyResponse) SetResultMsg(v string) *StartAntchainBbpVerifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartAntchainBbpVerifyResponse) SetResult(v []*GwVerifyViewResult) *StartAntchainBbpVerifyResponse {
	s.Result = v
	return s
}

type CheckAntchainBbpVerifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 核身上下文id
	VerifyId *string `json:"verify_id,omitempty" xml:"verify_id,omitempty" require:"true"`
	// 核身模块分组
	Group *string `json:"group,omitempty" xml:"group,omitempty" require:"true"`
	// 核身动作：view-渲染，verify-校验，repeat-重新发送
	ProductAction *string `json:"product_action,omitempty" xml:"product_action,omitempty" require:"true"`
	// 业务id
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 核身产品码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
}

func (s CheckAntchainBbpVerifyRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckAntchainBbpVerifyRequest) GoString() string {
	return s.String()
}

func (s *CheckAntchainBbpVerifyRequest) SetAuthToken(v string) *CheckAntchainBbpVerifyRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckAntchainBbpVerifyRequest) SetProductInstanceId(v string) *CheckAntchainBbpVerifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckAntchainBbpVerifyRequest) SetVerifyId(v string) *CheckAntchainBbpVerifyRequest {
	s.VerifyId = &v
	return s
}

func (s *CheckAntchainBbpVerifyRequest) SetGroup(v string) *CheckAntchainBbpVerifyRequest {
	s.Group = &v
	return s
}

func (s *CheckAntchainBbpVerifyRequest) SetProductAction(v string) *CheckAntchainBbpVerifyRequest {
	s.ProductAction = &v
	return s
}

func (s *CheckAntchainBbpVerifyRequest) SetBizId(v string) *CheckAntchainBbpVerifyRequest {
	s.BizId = &v
	return s
}

func (s *CheckAntchainBbpVerifyRequest) SetProductCode(v string) *CheckAntchainBbpVerifyRequest {
	s.ProductCode = &v
	return s
}

type CheckAntchainBbpVerifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 核身结果枚举：PASS-核身成功，INITIAL-初始化，PROCESS-处理中，FAIL-失败
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s CheckAntchainBbpVerifyResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckAntchainBbpVerifyResponse) GoString() string {
	return s.String()
}

func (s *CheckAntchainBbpVerifyResponse) SetReqMsgId(v string) *CheckAntchainBbpVerifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckAntchainBbpVerifyResponse) SetResultCode(v string) *CheckAntchainBbpVerifyResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckAntchainBbpVerifyResponse) SetResultMsg(v string) *CheckAntchainBbpVerifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckAntchainBbpVerifyResponse) SetStatus(v string) *CheckAntchainBbpVerifyResponse {
	s.Status = &v
	return s
}

type RunAntchainSaasMarketServiceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务方传入，幂等用。
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// saas产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 服务code
	ServiceCode *string `json:"service_code,omitempty" xml:"service_code,omitempty" require:"true"`
	// 子服务code
	SubServiceCode *string `json:"sub_service_code,omitempty" xml:"sub_service_code,omitempty"`
	// 服务版本
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
	// 业务参数，map格式
	Params []*KeyValuePair `json:"params,omitempty" xml:"params,omitempty" type:"Repeated"`
}

func (s RunAntchainSaasMarketServiceRequest) String() string {
	return tea.Prettify(s)
}

func (s RunAntchainSaasMarketServiceRequest) GoString() string {
	return s.String()
}

func (s *RunAntchainSaasMarketServiceRequest) SetAuthToken(v string) *RunAntchainSaasMarketServiceRequest {
	s.AuthToken = &v
	return s
}

func (s *RunAntchainSaasMarketServiceRequest) SetProductInstanceId(v string) *RunAntchainSaasMarketServiceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RunAntchainSaasMarketServiceRequest) SetBizId(v string) *RunAntchainSaasMarketServiceRequest {
	s.BizId = &v
	return s
}

func (s *RunAntchainSaasMarketServiceRequest) SetProductCode(v string) *RunAntchainSaasMarketServiceRequest {
	s.ProductCode = &v
	return s
}

func (s *RunAntchainSaasMarketServiceRequest) SetServiceCode(v string) *RunAntchainSaasMarketServiceRequest {
	s.ServiceCode = &v
	return s
}

func (s *RunAntchainSaasMarketServiceRequest) SetSubServiceCode(v string) *RunAntchainSaasMarketServiceRequest {
	s.SubServiceCode = &v
	return s
}

func (s *RunAntchainSaasMarketServiceRequest) SetServiceVersion(v string) *RunAntchainSaasMarketServiceRequest {
	s.ServiceVersion = &v
	return s
}

func (s *RunAntchainSaasMarketServiceRequest) SetParams(v []*KeyValuePair) *RunAntchainSaasMarketServiceRequest {
	s.Params = v
	return s
}

type RunAntchainSaasMarketServiceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 服务调用结果
	ResultData []*KeyValuePair `json:"result_data,omitempty" xml:"result_data,omitempty" type:"Repeated"`
}

func (s RunAntchainSaasMarketServiceResponse) String() string {
	return tea.Prettify(s)
}

func (s RunAntchainSaasMarketServiceResponse) GoString() string {
	return s.String()
}

func (s *RunAntchainSaasMarketServiceResponse) SetReqMsgId(v string) *RunAntchainSaasMarketServiceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RunAntchainSaasMarketServiceResponse) SetResultCode(v string) *RunAntchainSaasMarketServiceResponse {
	s.ResultCode = &v
	return s
}

func (s *RunAntchainSaasMarketServiceResponse) SetResultMsg(v string) *RunAntchainSaasMarketServiceResponse {
	s.ResultMsg = &v
	return s
}

func (s *RunAntchainSaasMarketServiceResponse) SetResultData(v []*KeyValuePair) *RunAntchainSaasMarketServiceResponse {
	s.ResultData = v
	return s
}

type QueryAntchainSaasMarketSolutionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 解决方案code
	SolutionCode *string `json:"solution_code,omitempty" xml:"solution_code,omitempty" require:"true"`
}

func (s QueryAntchainSaasMarketSolutionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainSaasMarketSolutionRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainSaasMarketSolutionRequest) SetAuthToken(v string) *QueryAntchainSaasMarketSolutionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainSaasMarketSolutionRequest) SetProductInstanceId(v string) *QueryAntchainSaasMarketSolutionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainSaasMarketSolutionRequest) SetSolutionCode(v string) *QueryAntchainSaasMarketSolutionRequest {
	s.SolutionCode = &v
	return s
}

type QueryAntchainSaasMarketSolutionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询结果
	ResultData []*KeyValuePair `json:"result_data,omitempty" xml:"result_data,omitempty" type:"Repeated"`
}

func (s QueryAntchainSaasMarketSolutionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainSaasMarketSolutionResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainSaasMarketSolutionResponse) SetReqMsgId(v string) *QueryAntchainSaasMarketSolutionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainSaasMarketSolutionResponse) SetResultCode(v string) *QueryAntchainSaasMarketSolutionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainSaasMarketSolutionResponse) SetResultMsg(v string) *QueryAntchainSaasMarketSolutionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainSaasMarketSolutionResponse) SetResultData(v []*KeyValuePair) *QueryAntchainSaasMarketSolutionResponse {
	s.ResultData = v
	return s
}

type VerifyAntchainBbpMetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 预留业务code
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty" require:"true"`
	// 企业证件号码
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
	// 企业证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
	EpCertNoType *string `json:"ep_cert_no_type,omitempty" xml:"ep_cert_no_type,omitempty" require:"true"`
	// 法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
	// 法人证件号码
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
	// 法人证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
	LegalPersonCertNoType *string `json:"legal_person_cert_no_type,omitempty" xml:"legal_person_cert_no_type,omitempty"`
	// 系统名称
	OwnerName *string `json:"owner_name,omitempty" xml:"owner_name,omitempty"`
	// 系统租户ID
	OwnerUid *string `json:"owner_uid,omitempty" xml:"owner_uid,omitempty"`
	// 业务唯一ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 业务渠道，需提前申请产品码
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
	// 认证类型：ENTERPRISE-企业, PERSON-个人
	CertifyEnum *string `json:"certify_enum,omitempty" xml:"certify_enum,omitempty" require:"true"`
	// 客户支付宝ID
	AlipayUid *string `json:"alipay_uid,omitempty" xml:"alipay_uid,omitempty"`
	// 个人姓名，用于个人认证
	PersonName *string `json:"person_name,omitempty" xml:"person_name,omitempty"`
	// 个人证件号码
	PersonCertNo *string `json:"person_cert_no,omitempty" xml:"person_cert_no,omitempty"`
	// 个人证件类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
	PersonCertType *string `json:"person_cert_type,omitempty" xml:"person_cert_type,omitempty"`
	// 扩展信息
	ExtensionInfo *NameValuePair `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
}

func (s VerifyAntchainBbpMetaRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyAntchainBbpMetaRequest) GoString() string {
	return s.String()
}

func (s *VerifyAntchainBbpMetaRequest) SetAuthToken(v string) *VerifyAntchainBbpMetaRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetProductInstanceId(v string) *VerifyAntchainBbpMetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetBizCode(v string) *VerifyAntchainBbpMetaRequest {
	s.BizCode = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetEpCertName(v string) *VerifyAntchainBbpMetaRequest {
	s.EpCertName = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetEpCertNo(v string) *VerifyAntchainBbpMetaRequest {
	s.EpCertNo = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetEpCertNoType(v string) *VerifyAntchainBbpMetaRequest {
	s.EpCertNoType = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetLegalPersonCertName(v string) *VerifyAntchainBbpMetaRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetLegalPersonCertNo(v string) *VerifyAntchainBbpMetaRequest {
	s.LegalPersonCertNo = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetLegalPersonCertNoType(v string) *VerifyAntchainBbpMetaRequest {
	s.LegalPersonCertNoType = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetOwnerName(v string) *VerifyAntchainBbpMetaRequest {
	s.OwnerName = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetOwnerUid(v string) *VerifyAntchainBbpMetaRequest {
	s.OwnerUid = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetBizId(v string) *VerifyAntchainBbpMetaRequest {
	s.BizId = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetChannel(v string) *VerifyAntchainBbpMetaRequest {
	s.Channel = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetCertifyEnum(v string) *VerifyAntchainBbpMetaRequest {
	s.CertifyEnum = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetAlipayUid(v string) *VerifyAntchainBbpMetaRequest {
	s.AlipayUid = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetPersonName(v string) *VerifyAntchainBbpMetaRequest {
	s.PersonName = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetPersonCertNo(v string) *VerifyAntchainBbpMetaRequest {
	s.PersonCertNo = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetPersonCertType(v string) *VerifyAntchainBbpMetaRequest {
	s.PersonCertType = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetExtensionInfo(v *NameValuePair) *VerifyAntchainBbpMetaRequest {
	s.ExtensionInfo = v
	return s
}

type VerifyAntchainBbpMetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 要素认证结果
	Result *CustomerAuthResult `json:"result,omitempty" xml:"result,omitempty"`
}

func (s VerifyAntchainBbpMetaResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyAntchainBbpMetaResponse) GoString() string {
	return s.String()
}

func (s *VerifyAntchainBbpMetaResponse) SetReqMsgId(v string) *VerifyAntchainBbpMetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyAntchainBbpMetaResponse) SetResultCode(v string) *VerifyAntchainBbpMetaResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyAntchainBbpMetaResponse) SetResultMsg(v string) *VerifyAntchainBbpMetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyAntchainBbpMetaResponse) SetResult(v *CustomerAuthResult) *VerifyAntchainBbpMetaResponse {
	s.Result = v
	return s
}

type CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 123
	HoloxCheckEvent *HoloxCheckEvent `json:"holox_check_event,omitempty" xml:"holox_check_event,omitempty"`
	// 123
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
}

func (s CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest) GoString() string {
	return s.String()
}

func (s *CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest) SetAuthToken(v string) *CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest) SetProductInstanceId(v string) *CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest) SetHoloxCheckEvent(v *HoloxCheckEvent) *CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest {
	s.HoloxCheckEvent = v
	return s
}

func (s *CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest) SetServiceVersion(v string) *CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest {
	s.ServiceVersion = &v
	return s
}

type CheckSaasSecurityInfosecHoloxcontentcheckserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 大安全风控接口返回结果
	Data *HoloxCheckResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CheckSaasSecurityInfosecHoloxcontentcheckserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckSaasSecurityInfosecHoloxcontentcheckserviceResponse) GoString() string {
	return s.String()
}

func (s *CheckSaasSecurityInfosecHoloxcontentcheckserviceResponse) SetReqMsgId(v string) *CheckSaasSecurityInfosecHoloxcontentcheckserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckSaasSecurityInfosecHoloxcontentcheckserviceResponse) SetResultCode(v string) *CheckSaasSecurityInfosecHoloxcontentcheckserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckSaasSecurityInfosecHoloxcontentcheckserviceResponse) SetResultMsg(v string) *CheckSaasSecurityInfosecHoloxcontentcheckserviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckSaasSecurityInfosecHoloxcontentcheckserviceResponse) SetData(v *HoloxCheckResult) *CheckSaasSecurityInfosecHoloxcontentcheckserviceResponse {
	s.Data = v
	return s
}

type QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 123
	SecurityUniformRequest *SecurityUniformRequest `json:"security_uniform_request,omitempty" xml:"security_uniform_request,omitempty" require:"true"`
	// 123
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
}

func (s QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest) GoString() string {
	return s.String()
}

func (s *QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest) SetAuthToken(v string) *QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest) SetProductInstanceId(v string) *QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest) SetSecurityUniformRequest(v *SecurityUniformRequest) *QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest {
	s.SecurityUniformRequest = v
	return s
}

func (s *QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest) SetServiceVersion(v string) *QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest {
	s.ServiceVersion = &v
	return s
}

type QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Data *SecurityUniformResponse `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse) GoString() string {
	return s.String()
}

func (s *QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse) SetReqMsgId(v string) *QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse) SetResultCode(v string) *QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse) SetResultMsg(v string) *QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse) SetData(v *SecurityUniformResponse) *QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse {
	s.Data = v
	return s
}

type CheckSaasSecurityRdsRdsserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 123
	RdsServiceCheckRequest *string `json:"rds_service_check_request,omitempty" xml:"rds_service_check_request,omitempty" require:"true"`
	// 服务版本
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
}

func (s CheckSaasSecurityRdsRdsserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckSaasSecurityRdsRdsserviceRequest) GoString() string {
	return s.String()
}

func (s *CheckSaasSecurityRdsRdsserviceRequest) SetAuthToken(v string) *CheckSaasSecurityRdsRdsserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckSaasSecurityRdsRdsserviceRequest) SetProductInstanceId(v string) *CheckSaasSecurityRdsRdsserviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckSaasSecurityRdsRdsserviceRequest) SetRdsServiceCheckRequest(v string) *CheckSaasSecurityRdsRdsserviceRequest {
	s.RdsServiceCheckRequest = &v
	return s
}

func (s *CheckSaasSecurityRdsRdsserviceRequest) SetServiceVersion(v string) *CheckSaasSecurityRdsRdsserviceRequest {
	s.ServiceVersion = &v
	return s
}

type CheckSaasSecurityRdsRdsserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否是机器
	Data *int64 `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CheckSaasSecurityRdsRdsserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckSaasSecurityRdsRdsserviceResponse) GoString() string {
	return s.String()
}

func (s *CheckSaasSecurityRdsRdsserviceResponse) SetReqMsgId(v string) *CheckSaasSecurityRdsRdsserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckSaasSecurityRdsRdsserviceResponse) SetResultCode(v string) *CheckSaasSecurityRdsRdsserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckSaasSecurityRdsRdsserviceResponse) SetResultMsg(v string) *CheckSaasSecurityRdsRdsserviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckSaasSecurityRdsRdsserviceResponse) SetData(v int64) *CheckSaasSecurityRdsRdsserviceResponse {
	s.Data = &v
	return s
}

type QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 123
	InfosecContentQuery *InfoSecContentQuery `json:"infosec_content_query,omitempty" xml:"infosec_content_query,omitempty" require:"true"`
	// 123
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
}

func (s QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest) GoString() string {
	return s.String()
}

func (s *QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest) SetAuthToken(v string) *QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest) SetProductInstanceId(v string) *QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest) SetInfosecContentQuery(v *InfoSecContentQuery) *QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest {
	s.InfosecContentQuery = v
	return s
}

func (s *QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest) SetServiceVersion(v string) *QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest {
	s.ServiceVersion = &v
	return s
}

type QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回回调结果
	Data *InfoSecContentQueryResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceResponse) GoString() string {
	return s.String()
}

func (s *QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceResponse) SetReqMsgId(v string) *QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceResponse) SetResultCode(v string) *QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceResponse) SetResultMsg(v string) *QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceResponse) SetData(v *InfoSecContentQueryResult) *QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceResponse {
	s.Data = v
	return s
}

type VerifySaasSecurityRdslibAntcaptchaserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 123
	RdsAnalyzeRequest *RdsAnalyzeRequest `json:"rds_analyze_request,omitempty" xml:"rds_analyze_request,omitempty" require:"true"`
	// 服务版本
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
}

func (s VerifySaasSecurityRdslibAntcaptchaserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifySaasSecurityRdslibAntcaptchaserviceRequest) GoString() string {
	return s.String()
}

func (s *VerifySaasSecurityRdslibAntcaptchaserviceRequest) SetAuthToken(v string) *VerifySaasSecurityRdslibAntcaptchaserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifySaasSecurityRdslibAntcaptchaserviceRequest) SetProductInstanceId(v string) *VerifySaasSecurityRdslibAntcaptchaserviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifySaasSecurityRdslibAntcaptchaserviceRequest) SetRdsAnalyzeRequest(v *RdsAnalyzeRequest) *VerifySaasSecurityRdslibAntcaptchaserviceRequest {
	s.RdsAnalyzeRequest = v
	return s
}

func (s *VerifySaasSecurityRdslibAntcaptchaserviceRequest) SetServiceVersion(v string) *VerifySaasSecurityRdslibAntcaptchaserviceRequest {
	s.ServiceVersion = &v
	return s
}

type VerifySaasSecurityRdslibAntcaptchaserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否是机器人
	Data *RdslibAntcaptchaservice `json:"data,omitempty" xml:"data,omitempty"`
}

func (s VerifySaasSecurityRdslibAntcaptchaserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifySaasSecurityRdslibAntcaptchaserviceResponse) GoString() string {
	return s.String()
}

func (s *VerifySaasSecurityRdslibAntcaptchaserviceResponse) SetReqMsgId(v string) *VerifySaasSecurityRdslibAntcaptchaserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifySaasSecurityRdslibAntcaptchaserviceResponse) SetResultCode(v string) *VerifySaasSecurityRdslibAntcaptchaserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifySaasSecurityRdslibAntcaptchaserviceResponse) SetResultMsg(v string) *VerifySaasSecurityRdslibAntcaptchaserviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifySaasSecurityRdslibAntcaptchaserviceResponse) SetData(v *RdslibAntcaptchaservice) *VerifySaasSecurityRdslibAntcaptchaserviceResponse {
	s.Data = v
	return s
}

type QuerySaasSecurityTscenterUmidqueryserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户token id
	TokenId *string `json:"token_id,omitempty" xml:"token_id,omitempty" require:"true"`
	// 服务版本
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
}

func (s QuerySaasSecurityTscenterUmidqueryserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySaasSecurityTscenterUmidqueryserviceRequest) GoString() string {
	return s.String()
}

func (s *QuerySaasSecurityTscenterUmidqueryserviceRequest) SetAuthToken(v string) *QuerySaasSecurityTscenterUmidqueryserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySaasSecurityTscenterUmidqueryserviceRequest) SetProductInstanceId(v string) *QuerySaasSecurityTscenterUmidqueryserviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySaasSecurityTscenterUmidqueryserviceRequest) SetTokenId(v string) *QuerySaasSecurityTscenterUmidqueryserviceRequest {
	s.TokenId = &v
	return s
}

func (s *QuerySaasSecurityTscenterUmidqueryserviceRequest) SetServiceVersion(v string) *QuerySaasSecurityTscenterUmidqueryserviceRequest {
	s.ServiceVersion = &v
	return s
}

type QuerySaasSecurityTscenterUmidqueryserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回的umid
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QuerySaasSecurityTscenterUmidqueryserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySaasSecurityTscenterUmidqueryserviceResponse) GoString() string {
	return s.String()
}

func (s *QuerySaasSecurityTscenterUmidqueryserviceResponse) SetReqMsgId(v string) *QuerySaasSecurityTscenterUmidqueryserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySaasSecurityTscenterUmidqueryserviceResponse) SetResultCode(v string) *QuerySaasSecurityTscenterUmidqueryserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySaasSecurityTscenterUmidqueryserviceResponse) SetResultMsg(v string) *QuerySaasSecurityTscenterUmidqueryserviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySaasSecurityTscenterUmidqueryserviceResponse) SetData(v string) *QuerySaasSecurityTscenterUmidqueryserviceResponse {
	s.Data = &v
	return s
}

type QuerySaasSecurityInfosecOpencheckservicequeryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询参数
	Event *string `json:"event,omitempty" xml:"event,omitempty" require:"true"`
	// 服务版本
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
}

func (s QuerySaasSecurityInfosecOpencheckservicequeryRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySaasSecurityInfosecOpencheckservicequeryRequest) GoString() string {
	return s.String()
}

func (s *QuerySaasSecurityInfosecOpencheckservicequeryRequest) SetAuthToken(v string) *QuerySaasSecurityInfosecOpencheckservicequeryRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySaasSecurityInfosecOpencheckservicequeryRequest) SetProductInstanceId(v string) *QuerySaasSecurityInfosecOpencheckservicequeryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySaasSecurityInfosecOpencheckservicequeryRequest) SetEvent(v string) *QuerySaasSecurityInfosecOpencheckservicequeryRequest {
	s.Event = &v
	return s
}

func (s *QuerySaasSecurityInfosecOpencheckservicequeryRequest) SetServiceVersion(v string) *QuerySaasSecurityInfosecOpencheckservicequeryRequest {
	s.ServiceVersion = &v
	return s
}

type QuerySaasSecurityInfosecOpencheckservicequeryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 大安全内容检测接口返回结果
	Data *ContentQueryResultModel `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QuerySaasSecurityInfosecOpencheckservicequeryResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySaasSecurityInfosecOpencheckservicequeryResponse) GoString() string {
	return s.String()
}

func (s *QuerySaasSecurityInfosecOpencheckservicequeryResponse) SetReqMsgId(v string) *QuerySaasSecurityInfosecOpencheckservicequeryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySaasSecurityInfosecOpencheckservicequeryResponse) SetResultCode(v string) *QuerySaasSecurityInfosecOpencheckservicequeryResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySaasSecurityInfosecOpencheckservicequeryResponse) SetResultMsg(v string) *QuerySaasSecurityInfosecOpencheckservicequeryResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySaasSecurityInfosecOpencheckservicequeryResponse) SetData(v *ContentQueryResultModel) *QuerySaasSecurityInfosecOpencheckservicequeryResponse {
	s.Data = v
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
				"sdk_version":      tea.String("1.0.7"),
				"_prod_code":       tea.String("ak_5bb1b66c4aab4cc998c05a36078e45c1"),
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
 * Description: 核身初始化接口
 * Summary: 核身初始化接口
 */
func (client *Client) InitAntchainBbpVerify(request *InitAntchainBbpVerifyRequest) (_result *InitAntchainBbpVerifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitAntchainBbpVerifyResponse{}
	_body, _err := client.InitAntchainBbpVerifyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 核身初始化接口
 * Summary: 核身初始化接口
 */
func (client *Client) InitAntchainBbpVerifyEx(request *InitAntchainBbpVerifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitAntchainBbpVerifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitAntchainBbpVerifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.verify.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 核身产品渲染接口
 * Summary: 核身产品渲染接口
 */
func (client *Client) StartAntchainBbpVerify(request *StartAntchainBbpVerifyRequest) (_result *StartAntchainBbpVerifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartAntchainBbpVerifyResponse{}
	_body, _err := client.StartAntchainBbpVerifyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 核身产品渲染接口
 * Summary: 核身产品渲染接口
 */
func (client *Client) StartAntchainBbpVerifyEx(request *StartAntchainBbpVerifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartAntchainBbpVerifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartAntchainBbpVerifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.verify.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 核身结果查询
 * Summary: 核身结果查询
 */
func (client *Client) CheckAntchainBbpVerify(request *CheckAntchainBbpVerifyRequest) (_result *CheckAntchainBbpVerifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckAntchainBbpVerifyResponse{}
	_body, _err := client.CheckAntchainBbpVerifyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 核身结果查询
 * Summary: 核身结果查询
 */
func (client *Client) CheckAntchainBbpVerifyEx(request *CheckAntchainBbpVerifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckAntchainBbpVerifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckAntchainBbpVerifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.verify.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: SaaS服务调用
 * Summary: SaaS服务调用
 */
func (client *Client) RunAntchainSaasMarketService(request *RunAntchainSaasMarketServiceRequest) (_result *RunAntchainSaasMarketServiceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RunAntchainSaasMarketServiceResponse{}
	_body, _err := client.RunAntchainSaasMarketServiceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: SaaS服务调用
 * Summary: SaaS服务调用
 */
func (client *Client) RunAntchainSaasMarketServiceEx(request *RunAntchainSaasMarketServiceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RunAntchainSaasMarketServiceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RunAntchainSaasMarketServiceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.saas.market.service.run"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询解决方案，包括能力列表
 * Summary: 查询解决方案，包括能力列表
 */
func (client *Client) QueryAntchainSaasMarketSolution(request *QueryAntchainSaasMarketSolutionRequest) (_result *QueryAntchainSaasMarketSolutionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainSaasMarketSolutionResponse{}
	_body, _err := client.QueryAntchainSaasMarketSolutionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询解决方案，包括能力列表
 * Summary: 查询解决方案，包括能力列表
 */
func (client *Client) QueryAntchainSaasMarketSolutionEx(request *QueryAntchainSaasMarketSolutionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainSaasMarketSolutionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainSaasMarketSolutionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.saas.market.solution.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 对企业身份进行认证
 * Summary: 企业四要素认证
 */
func (client *Client) VerifyAntchainBbpMeta(request *VerifyAntchainBbpMetaRequest) (_result *VerifyAntchainBbpMetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyAntchainBbpMetaResponse{}
	_body, _err := client.VerifyAntchainBbpMetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 对企业身份进行认证
 * Summary: 企业四要素认证
 */
func (client *Client) VerifyAntchainBbpMetaEx(request *VerifyAntchainBbpMetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyAntchainBbpMetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyAntchainBbpMetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.meta.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 大安全接口
 * Summary: 大安全接口
 */
func (client *Client) CheckSaasSecurityInfosecHoloxcontentcheckservice(request *CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest) (_result *CheckSaasSecurityInfosecHoloxcontentcheckserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckSaasSecurityInfosecHoloxcontentcheckserviceResponse{}
	_body, _err := client.CheckSaasSecurityInfosecHoloxcontentcheckserviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 大安全接口
 * Summary: 大安全接口
 */
func (client *Client) CheckSaasSecurityInfosecHoloxcontentcheckserviceEx(request *CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckSaasSecurityInfosecHoloxcontentcheckserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckSaasSecurityInfosecHoloxcontentcheckserviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("saas.security.infosec.holoxcontentcheckservice.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 大安全接口
 * Summary: 大安全接口
 */
func (client *Client) QuerySaasSecuritySecuritycoreSecurityuniformservice(request *QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest) (_result *QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse{}
	_body, _err := client.QuerySaasSecuritySecuritycoreSecurityuniformserviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 大安全接口
 * Summary: 大安全接口
 */
func (client *Client) QuerySaasSecuritySecuritycoreSecurityuniformserviceEx(request *QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("saas.security.securitycore.securityuniformservice.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 大安全接口
 * Summary: 大安全接口
 */
func (client *Client) CheckSaasSecurityRdsRdsservice(request *CheckSaasSecurityRdsRdsserviceRequest) (_result *CheckSaasSecurityRdsRdsserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckSaasSecurityRdsRdsserviceResponse{}
	_body, _err := client.CheckSaasSecurityRdsRdsserviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 大安全接口
 * Summary: 大安全接口
 */
func (client *Client) CheckSaasSecurityRdsRdsserviceEx(request *CheckSaasSecurityRdsRdsserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckSaasSecurityRdsRdsserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckSaasSecurityRdsRdsserviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("saas.security.rds.rdsservice.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 123
 * Summary: 大安全接口
 */
func (client *Client) QuerySaasSecurityInfosecHoloxcontentcheckqueryservice(request *QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest) (_result *QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceResponse{}
	_body, _err := client.QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 123
 * Summary: 大安全接口
 */
func (client *Client) QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceEx(request *QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("saas.security.infosec.holoxcontentcheckqueryservice.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 大安全接口
 * Summary: 大安全接口
 */
func (client *Client) VerifySaasSecurityRdslibAntcaptchaservice(request *VerifySaasSecurityRdslibAntcaptchaserviceRequest) (_result *VerifySaasSecurityRdslibAntcaptchaserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifySaasSecurityRdslibAntcaptchaserviceResponse{}
	_body, _err := client.VerifySaasSecurityRdslibAntcaptchaserviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 大安全接口
 * Summary: 大安全接口
 */
func (client *Client) VerifySaasSecurityRdslibAntcaptchaserviceEx(request *VerifySaasSecurityRdslibAntcaptchaserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifySaasSecurityRdslibAntcaptchaserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifySaasSecurityRdslibAntcaptchaserviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("saas.security.rdslib.antcaptchaservice.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 大安全接口
 * Summary: 大安全接口
 */
func (client *Client) QuerySaasSecurityTscenterUmidqueryservice(request *QuerySaasSecurityTscenterUmidqueryserviceRequest) (_result *QuerySaasSecurityTscenterUmidqueryserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySaasSecurityTscenterUmidqueryserviceResponse{}
	_body, _err := client.QuerySaasSecurityTscenterUmidqueryserviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 大安全接口
 * Summary: 大安全接口
 */
func (client *Client) QuerySaasSecurityTscenterUmidqueryserviceEx(request *QuerySaasSecurityTscenterUmidqueryserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySaasSecurityTscenterUmidqueryserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySaasSecurityTscenterUmidqueryserviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("saas.security.tscenter.umidqueryservice.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 大安全内容检测结果查询接口
 * Summary: 大安全内容检测结果查询接口
 */
func (client *Client) QuerySaasSecurityInfosecOpencheckservicequery(request *QuerySaasSecurityInfosecOpencheckservicequeryRequest) (_result *QuerySaasSecurityInfosecOpencheckservicequeryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySaasSecurityInfosecOpencheckservicequeryResponse{}
	_body, _err := client.QuerySaasSecurityInfosecOpencheckservicequeryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 大安全内容检测结果查询接口
 * Summary: 大安全内容检测结果查询接口
 */
func (client *Client) QuerySaasSecurityInfosecOpencheckservicequeryEx(request *QuerySaasSecurityInfosecOpencheckservicequeryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySaasSecurityInfosecOpencheckservicequeryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySaasSecurityInfosecOpencheckservicequeryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("saas.security.infosec.opencheckservicequery.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
