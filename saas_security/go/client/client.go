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

// 大安全结构体
type ContentAddress struct {
	// 123
	IsDjangoUrl *bool `json:"is_django_url,omitempty" xml:"is_django_url,omitempty"`
	// 213
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 123
	HttpUrl *string `json:"http_url,omitempty" xml:"http_url,omitempty"`
	// 123
	AudioType *string `json:"audio_type,omitempty" xml:"audio_type,omitempty"`
}

func (s ContentAddress) String() string {
	return tea.Prettify(s)
}

func (s ContentAddress) GoString() string {
	return s.String()
}

func (s *ContentAddress) SetIsDjangoUrl(v bool) *ContentAddress {
	s.IsDjangoUrl = &v
	return s
}

func (s *ContentAddress) SetAddress(v string) *ContentAddress {
	s.Address = &v
	return s
}

func (s *ContentAddress) SetHttpUrl(v string) *ContentAddress {
	s.HttpUrl = &v
	return s
}

func (s *ContentAddress) SetAudioType(v string) *ContentAddress {
	s.AudioType = &v
	return s
}

// 内容检测接口返回值
type SecurityRiskContentAnalyzeResponse struct {
	// 场景id
	AppSceneDataId *string `json:"app_scene_data_id,omitempty" xml:"app_scene_data_id,omitempty"`
	// 返回事件码，用于异步查询
	EventId *string `json:"event_id,omitempty" xml:"event_id,omitempty"`
	// 是否需要异步查询
	NeedQuery *string `json:"need_query,omitempty" xml:"need_query,omitempty"`
	// 返回结果
	ResultAction *string `json:"result_action,omitempty" xml:"result_action,omitempty"`
	// 命中场景
	HitDetectItems []*InfoSecHitDetectItem `json:"hit_detect_items,omitempty" xml:"hit_detect_items,omitempty" type:"Repeated"`
	// 描述被命中的风险标签
	RiskLabels *string `json:"risk_labels,omitempty" xml:"risk_labels,omitempty" require:"true"`
}

func (s SecurityRiskContentAnalyzeResponse) String() string {
	return tea.Prettify(s)
}

func (s SecurityRiskContentAnalyzeResponse) GoString() string {
	return s.String()
}

func (s *SecurityRiskContentAnalyzeResponse) SetAppSceneDataId(v string) *SecurityRiskContentAnalyzeResponse {
	s.AppSceneDataId = &v
	return s
}

func (s *SecurityRiskContentAnalyzeResponse) SetEventId(v string) *SecurityRiskContentAnalyzeResponse {
	s.EventId = &v
	return s
}

func (s *SecurityRiskContentAnalyzeResponse) SetNeedQuery(v string) *SecurityRiskContentAnalyzeResponse {
	s.NeedQuery = &v
	return s
}

func (s *SecurityRiskContentAnalyzeResponse) SetResultAction(v string) *SecurityRiskContentAnalyzeResponse {
	s.ResultAction = &v
	return s
}

func (s *SecurityRiskContentAnalyzeResponse) SetHitDetectItems(v []*InfoSecHitDetectItem) *SecurityRiskContentAnalyzeResponse {
	s.HitDetectItems = v
	return s
}

func (s *SecurityRiskContentAnalyzeResponse) SetRiskLabels(v string) *SecurityRiskContentAnalyzeResponse {
	s.RiskLabels = &v
	return s
}

// 大安全结构体
type ContentProperty struct {
	// 123
	Text *string `json:"text,omitempty" xml:"text,omitempty"`
	// 213
	TextList []*string `json:"text_list,omitempty" xml:"text_list,omitempty" type:"Repeated"`
	// 123
	Urls []*string `json:"urls,omitempty" xml:"urls,omitempty" type:"Repeated"`
	// 123
	Pictures []*ContentAddress `json:"pictures,omitempty" xml:"pictures,omitempty" type:"Repeated"`
	// 123
	Videos []*ContentAddress `json:"videos,omitempty" xml:"videos,omitempty" type:"Repeated"`
	// 123
	Audios []*ContentAddress `json:"audios,omitempty" xml:"audios,omitempty" type:"Repeated"`
}

func (s ContentProperty) String() string {
	return tea.Prettify(s)
}

func (s ContentProperty) GoString() string {
	return s.String()
}

func (s *ContentProperty) SetText(v string) *ContentProperty {
	s.Text = &v
	return s
}

func (s *ContentProperty) SetTextList(v []*string) *ContentProperty {
	s.TextList = v
	return s
}

func (s *ContentProperty) SetUrls(v []*string) *ContentProperty {
	s.Urls = v
	return s
}

func (s *ContentProperty) SetPictures(v []*ContentAddress) *ContentProperty {
	s.Pictures = v
	return s
}

func (s *ContentProperty) SetVideos(v []*ContentAddress) *ContentProperty {
	s.Videos = v
	return s
}

func (s *ContentProperty) SetAudios(v []*ContentAddress) *ContentProperty {
	s.Audios = v
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

// 键值对
type KeyContentPropertyPair struct {
	// 123
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// 123
	Value *ContentProperty `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s KeyContentPropertyPair) String() string {
	return tea.Prettify(s)
}

func (s KeyContentPropertyPair) GoString() string {
	return s.String()
}

func (s *KeyContentPropertyPair) SetKey(v string) *KeyContentPropertyPair {
	s.Key = &v
	return s
}

func (s *KeyContentPropertyPair) SetValue(v *ContentProperty) *KeyContentPropertyPair {
	s.Value = v
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

// 大安全接口返回值
type RdsAnalyzeResponse struct {
	// 请求是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 返回信息
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
	// 返回数据
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s RdsAnalyzeResponse) String() string {
	return tea.Prettify(s)
}

func (s RdsAnalyzeResponse) GoString() string {
	return s.String()
}

func (s *RdsAnalyzeResponse) SetSuccess(v bool) *RdsAnalyzeResponse {
	s.Success = &v
	return s
}

func (s *RdsAnalyzeResponse) SetMessage(v string) *RdsAnalyzeResponse {
	s.Message = &v
	return s
}

func (s *RdsAnalyzeResponse) SetData(v string) *RdsAnalyzeResponse {
	s.Data = &v
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

// 大安全内容检测接口返回参数
type ResultModel struct {
	// 返回结果
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 返回错误信息
	ErrMsg *string `json:"err_msg,omitempty" xml:"err_msg,omitempty"`
	// 返回具体结果
	Model *SecurityRiskContentAnalyzeResponse `json:"model,omitempty" xml:"model,omitempty"`
}

func (s ResultModel) String() string {
	return tea.Prettify(s)
}

func (s ResultModel) GoString() string {
	return s.String()
}

func (s *ResultModel) SetCode(v int64) *ResultModel {
	s.Code = &v
	return s
}

func (s *ResultModel) SetErrMsg(v string) *ResultModel {
	s.ErrMsg = &v
	return s
}

func (s *ResultModel) SetModel(v *SecurityRiskContentAnalyzeResponse) *ResultModel {
	s.Model = v
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

// 键值对
type KeyValuePair struct {
	// 23
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// 123
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

type CheckInfosecHoloxcontentcheckserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 123
	HoloxCheckEvent *HoloxCheckEvent `json:"holox_check_event,omitempty" xml:"holox_check_event,omitempty"`
	// 123
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
}

func (s CheckInfosecHoloxcontentcheckserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckInfosecHoloxcontentcheckserviceRequest) GoString() string {
	return s.String()
}

func (s *CheckInfosecHoloxcontentcheckserviceRequest) SetAuthToken(v string) *CheckInfosecHoloxcontentcheckserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckInfosecHoloxcontentcheckserviceRequest) SetProductInstanceId(v string) *CheckInfosecHoloxcontentcheckserviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckInfosecHoloxcontentcheckserviceRequest) SetHoloxCheckEvent(v *HoloxCheckEvent) *CheckInfosecHoloxcontentcheckserviceRequest {
	s.HoloxCheckEvent = v
	return s
}

func (s *CheckInfosecHoloxcontentcheckserviceRequest) SetServiceVersion(v string) *CheckInfosecHoloxcontentcheckserviceRequest {
	s.ServiceVersion = &v
	return s
}

type CheckInfosecHoloxcontentcheckserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 大安全风控接口返回结果
	Data *HoloxCheckResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CheckInfosecHoloxcontentcheckserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckInfosecHoloxcontentcheckserviceResponse) GoString() string {
	return s.String()
}

func (s *CheckInfosecHoloxcontentcheckserviceResponse) SetReqMsgId(v string) *CheckInfosecHoloxcontentcheckserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckInfosecHoloxcontentcheckserviceResponse) SetResultCode(v string) *CheckInfosecHoloxcontentcheckserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckInfosecHoloxcontentcheckserviceResponse) SetResultMsg(v string) *CheckInfosecHoloxcontentcheckserviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckInfosecHoloxcontentcheckserviceResponse) SetData(v *HoloxCheckResult) *CheckInfosecHoloxcontentcheckserviceResponse {
	s.Data = v
	return s
}

type QuerySecuritycoreSecurityuniformserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 123
	SecurityUniformRequest *SecurityUniformRequest `json:"security_uniform_request,omitempty" xml:"security_uniform_request,omitempty" require:"true"`
	// 123
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
}

func (s QuerySecuritycoreSecurityuniformserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySecuritycoreSecurityuniformserviceRequest) GoString() string {
	return s.String()
}

func (s *QuerySecuritycoreSecurityuniformserviceRequest) SetAuthToken(v string) *QuerySecuritycoreSecurityuniformserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySecuritycoreSecurityuniformserviceRequest) SetProductInstanceId(v string) *QuerySecuritycoreSecurityuniformserviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySecuritycoreSecurityuniformserviceRequest) SetSecurityUniformRequest(v *SecurityUniformRequest) *QuerySecuritycoreSecurityuniformserviceRequest {
	s.SecurityUniformRequest = v
	return s
}

func (s *QuerySecuritycoreSecurityuniformserviceRequest) SetServiceVersion(v string) *QuerySecuritycoreSecurityuniformserviceRequest {
	s.ServiceVersion = &v
	return s
}

type QuerySecuritycoreSecurityuniformserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Data *SecurityUniformResponse `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QuerySecuritycoreSecurityuniformserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySecuritycoreSecurityuniformserviceResponse) GoString() string {
	return s.String()
}

func (s *QuerySecuritycoreSecurityuniformserviceResponse) SetReqMsgId(v string) *QuerySecuritycoreSecurityuniformserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySecuritycoreSecurityuniformserviceResponse) SetResultCode(v string) *QuerySecuritycoreSecurityuniformserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySecuritycoreSecurityuniformserviceResponse) SetResultMsg(v string) *QuerySecuritycoreSecurityuniformserviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySecuritycoreSecurityuniformserviceResponse) SetData(v *SecurityUniformResponse) *QuerySecuritycoreSecurityuniformserviceResponse {
	s.Data = v
	return s
}

type CheckRdsRdsserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 123
	RdsServiceCheckRequest *string `json:"rds_service_check_request,omitempty" xml:"rds_service_check_request,omitempty" require:"true"`
	// 服务版本
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
}

func (s CheckRdsRdsserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckRdsRdsserviceRequest) GoString() string {
	return s.String()
}

func (s *CheckRdsRdsserviceRequest) SetAuthToken(v string) *CheckRdsRdsserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckRdsRdsserviceRequest) SetProductInstanceId(v string) *CheckRdsRdsserviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckRdsRdsserviceRequest) SetRdsServiceCheckRequest(v string) *CheckRdsRdsserviceRequest {
	s.RdsServiceCheckRequest = &v
	return s
}

func (s *CheckRdsRdsserviceRequest) SetServiceVersion(v string) *CheckRdsRdsserviceRequest {
	s.ServiceVersion = &v
	return s
}

type CheckRdsRdsserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否是机器
	Data *int64 `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CheckRdsRdsserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckRdsRdsserviceResponse) GoString() string {
	return s.String()
}

func (s *CheckRdsRdsserviceResponse) SetReqMsgId(v string) *CheckRdsRdsserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckRdsRdsserviceResponse) SetResultCode(v string) *CheckRdsRdsserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckRdsRdsserviceResponse) SetResultMsg(v string) *CheckRdsRdsserviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckRdsRdsserviceResponse) SetData(v int64) *CheckRdsRdsserviceResponse {
	s.Data = &v
	return s
}

type QueryInfosecHoloxcontentcheckqueryserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 123
	InfosecContentQuery *InfoSecContentQuery `json:"infosec_content_query,omitempty" xml:"infosec_content_query,omitempty" require:"true"`
	// 123
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
}

func (s QueryInfosecHoloxcontentcheckqueryserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInfosecHoloxcontentcheckqueryserviceRequest) GoString() string {
	return s.String()
}

func (s *QueryInfosecHoloxcontentcheckqueryserviceRequest) SetAuthToken(v string) *QueryInfosecHoloxcontentcheckqueryserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInfosecHoloxcontentcheckqueryserviceRequest) SetProductInstanceId(v string) *QueryInfosecHoloxcontentcheckqueryserviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInfosecHoloxcontentcheckqueryserviceRequest) SetInfosecContentQuery(v *InfoSecContentQuery) *QueryInfosecHoloxcontentcheckqueryserviceRequest {
	s.InfosecContentQuery = v
	return s
}

func (s *QueryInfosecHoloxcontentcheckqueryserviceRequest) SetServiceVersion(v string) *QueryInfosecHoloxcontentcheckqueryserviceRequest {
	s.ServiceVersion = &v
	return s
}

type QueryInfosecHoloxcontentcheckqueryserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回回调结果
	Data *InfoSecContentQueryResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryInfosecHoloxcontentcheckqueryserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInfosecHoloxcontentcheckqueryserviceResponse) GoString() string {
	return s.String()
}

func (s *QueryInfosecHoloxcontentcheckqueryserviceResponse) SetReqMsgId(v string) *QueryInfosecHoloxcontentcheckqueryserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInfosecHoloxcontentcheckqueryserviceResponse) SetResultCode(v string) *QueryInfosecHoloxcontentcheckqueryserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInfosecHoloxcontentcheckqueryserviceResponse) SetResultMsg(v string) *QueryInfosecHoloxcontentcheckqueryserviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInfosecHoloxcontentcheckqueryserviceResponse) SetData(v *InfoSecContentQueryResult) *QueryInfosecHoloxcontentcheckqueryserviceResponse {
	s.Data = v
	return s
}

type VerifyRdslibAntcaptchaserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 123
	RdsAnalyzeRequest *RdsAnalyzeRequest `json:"rds_analyze_request,omitempty" xml:"rds_analyze_request,omitempty" require:"true"`
	// 服务版本
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
}

func (s VerifyRdslibAntcaptchaserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyRdslibAntcaptchaserviceRequest) GoString() string {
	return s.String()
}

func (s *VerifyRdslibAntcaptchaserviceRequest) SetAuthToken(v string) *VerifyRdslibAntcaptchaserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyRdslibAntcaptchaserviceRequest) SetProductInstanceId(v string) *VerifyRdslibAntcaptchaserviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyRdslibAntcaptchaserviceRequest) SetRdsAnalyzeRequest(v *RdsAnalyzeRequest) *VerifyRdslibAntcaptchaserviceRequest {
	s.RdsAnalyzeRequest = v
	return s
}

func (s *VerifyRdslibAntcaptchaserviceRequest) SetServiceVersion(v string) *VerifyRdslibAntcaptchaserviceRequest {
	s.ServiceVersion = &v
	return s
}

type VerifyRdslibAntcaptchaserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否是机器人
	Data *RdslibAntcaptchaservice `json:"data,omitempty" xml:"data,omitempty"`
}

func (s VerifyRdslibAntcaptchaserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyRdslibAntcaptchaserviceResponse) GoString() string {
	return s.String()
}

func (s *VerifyRdslibAntcaptchaserviceResponse) SetReqMsgId(v string) *VerifyRdslibAntcaptchaserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyRdslibAntcaptchaserviceResponse) SetResultCode(v string) *VerifyRdslibAntcaptchaserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyRdslibAntcaptchaserviceResponse) SetResultMsg(v string) *VerifyRdslibAntcaptchaserviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyRdslibAntcaptchaserviceResponse) SetData(v *RdslibAntcaptchaservice) *VerifyRdslibAntcaptchaserviceResponse {
	s.Data = v
	return s
}

type QueryTscenterUmidqueryserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户token id
	TokenId *string `json:"token_id,omitempty" xml:"token_id,omitempty" require:"true"`
	// 服务版本
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
}

func (s QueryTscenterUmidqueryserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTscenterUmidqueryserviceRequest) GoString() string {
	return s.String()
}

func (s *QueryTscenterUmidqueryserviceRequest) SetAuthToken(v string) *QueryTscenterUmidqueryserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTscenterUmidqueryserviceRequest) SetProductInstanceId(v string) *QueryTscenterUmidqueryserviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTscenterUmidqueryserviceRequest) SetTokenId(v string) *QueryTscenterUmidqueryserviceRequest {
	s.TokenId = &v
	return s
}

func (s *QueryTscenterUmidqueryserviceRequest) SetServiceVersion(v string) *QueryTscenterUmidqueryserviceRequest {
	s.ServiceVersion = &v
	return s
}

type QueryTscenterUmidqueryserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回的umid
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryTscenterUmidqueryserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTscenterUmidqueryserviceResponse) GoString() string {
	return s.String()
}

func (s *QueryTscenterUmidqueryserviceResponse) SetReqMsgId(v string) *QueryTscenterUmidqueryserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTscenterUmidqueryserviceResponse) SetResultCode(v string) *QueryTscenterUmidqueryserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTscenterUmidqueryserviceResponse) SetResultMsg(v string) *QueryTscenterUmidqueryserviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTscenterUmidqueryserviceResponse) SetData(v string) *QueryTscenterUmidqueryserviceResponse {
	s.Data = &v
	return s
}

type CheckInfosecOpencheckservicecheckRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 以json格式输入想要检测的内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 服务版本
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
}

func (s CheckInfosecOpencheckservicecheckRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckInfosecOpencheckservicecheckRequest) GoString() string {
	return s.String()
}

func (s *CheckInfosecOpencheckservicecheckRequest) SetAuthToken(v string) *CheckInfosecOpencheckservicecheckRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckInfosecOpencheckservicecheckRequest) SetProductInstanceId(v string) *CheckInfosecOpencheckservicecheckRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckInfosecOpencheckservicecheckRequest) SetContent(v string) *CheckInfosecOpencheckservicecheckRequest {
	s.Content = &v
	return s
}

func (s *CheckInfosecOpencheckservicecheckRequest) SetServiceVersion(v string) *CheckInfosecOpencheckservicecheckRequest {
	s.ServiceVersion = &v
	return s
}

type CheckInfosecOpencheckservicecheckResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 大安全内容检测接口返回参数
	Data *ResultModel `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CheckInfosecOpencheckservicecheckResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckInfosecOpencheckservicecheckResponse) GoString() string {
	return s.String()
}

func (s *CheckInfosecOpencheckservicecheckResponse) SetReqMsgId(v string) *CheckInfosecOpencheckservicecheckResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckInfosecOpencheckservicecheckResponse) SetResultCode(v string) *CheckInfosecOpencheckservicecheckResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckInfosecOpencheckservicecheckResponse) SetResultMsg(v string) *CheckInfosecOpencheckservicecheckResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckInfosecOpencheckservicecheckResponse) SetData(v *ResultModel) *CheckInfosecOpencheckservicecheckResponse {
	s.Data = v
	return s
}

type QueryInfosecOpencheckservicequeryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询参数
	Event *string `json:"event,omitempty" xml:"event,omitempty" require:"true"`
	// 服务版本
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
}

func (s QueryInfosecOpencheckservicequeryRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInfosecOpencheckservicequeryRequest) GoString() string {
	return s.String()
}

func (s *QueryInfosecOpencheckservicequeryRequest) SetAuthToken(v string) *QueryInfosecOpencheckservicequeryRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInfosecOpencheckservicequeryRequest) SetProductInstanceId(v string) *QueryInfosecOpencheckservicequeryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInfosecOpencheckservicequeryRequest) SetEvent(v string) *QueryInfosecOpencheckservicequeryRequest {
	s.Event = &v
	return s
}

func (s *QueryInfosecOpencheckservicequeryRequest) SetServiceVersion(v string) *QueryInfosecOpencheckservicequeryRequest {
	s.ServiceVersion = &v
	return s
}

type QueryInfosecOpencheckservicequeryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 大安全内容检测接口返回结果
	Data *ContentQueryResultModel `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryInfosecOpencheckservicequeryResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInfosecOpencheckservicequeryResponse) GoString() string {
	return s.String()
}

func (s *QueryInfosecOpencheckservicequeryResponse) SetReqMsgId(v string) *QueryInfosecOpencheckservicequeryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInfosecOpencheckservicequeryResponse) SetResultCode(v string) *QueryInfosecOpencheckservicequeryResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInfosecOpencheckservicequeryResponse) SetResultMsg(v string) *QueryInfosecOpencheckservicequeryResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInfosecOpencheckservicequeryResponse) SetData(v *ContentQueryResultModel) *QueryInfosecOpencheckservicequeryResponse {
	s.Data = v
	return s
}

type QueryDemoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 测试数据
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s QueryDemoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoRequest) SetAuthToken(v string) *QueryDemoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoRequest) SetProductInstanceId(v string) *QueryDemoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDemoRequest) SetData(v string) *QueryDemoRequest {
	s.Data = &v
	return s
}

type QueryDemoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryDemoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoResponse) SetReqMsgId(v string) *QueryDemoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoResponse) SetResultCode(v string) *QueryDemoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoResponse) SetResultMsg(v string) *QueryDemoResponse {
	s.ResultMsg = &v
	return s
}

type QueryGuardAskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 会话ID，用于匹配多轮对话上下文
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true" maxLength:"128" minLength:"0"`
	// 数据唯一标识，能够根据该值定位到该条数据
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true" maxLength:"64" minLength:"0"`
	// 大模型提问护栏服务, 用于区分提供的服务类别，当前支持：TJ_QUESTION_BASIC、TJ_ANSWER_BASIC 两种
	ServiceName *string `json:"service_name,omitempty" xml:"service_name,omitempty" require:"true" maxLength:"128" minLength:"0"`
	// 当前提问内容，最大长度10000个字符。
	Question *string `json:"question,omitempty" xml:"question,omitempty" require:"true" maxLength:"10000" minLength:"1"`
	// 用户ID，用于主体风险判断，如果是2088开头的阿里体系用户，请传入2088开头的用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true" maxLength:"32" minLength:"0"`
	// 提问内容类型，纯文本: PLAINTEXT，图片url: PICTURE_URL
	QuestionFormat *string `json:"question_format,omitempty" xml:"question_format,omitempty" maxLength:"32" minLength:"0"`
	// 大模型ID，表示大模型版本
	ModelCode *string `json:"model_code,omitempty" xml:"model_code,omitempty" maxLength:"128" minLength:"0"`
	// 扩展属性Map，key限定为：aigcType、serviceScene、triggerSource、bizOwner，对应的value取值为： aigcType： ● 文生文：text_text ● 文生图：text_pic ● 图生文：pic_text ● 图生图：pic_pic serviceScene: 根据业务使用的不同情况支持自定义入参做策略个性化配置，私域或者公域，以及不同的业务应用 比如领域： serviceScene = insurance 表示保险 serviceScene = medical 表示医疗 serviceScene = government 表示政务 比如业务活动应用： serviceScene = xiacu 表示夏促 serviceScene = qixi 表示七夕 triggerSource: 不同的来源，比如移动端、web端、API
	BusinessProperties *KeyValuePair `json:"business_properties,omitempty" xml:"business_properties,omitempty"`
}

func (s QueryGuardAskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGuardAskRequest) GoString() string {
	return s.String()
}

func (s *QueryGuardAskRequest) SetAuthToken(v string) *QueryGuardAskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGuardAskRequest) SetProductInstanceId(v string) *QueryGuardAskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGuardAskRequest) SetSessionId(v string) *QueryGuardAskRequest {
	s.SessionId = &v
	return s
}

func (s *QueryGuardAskRequest) SetRequestId(v string) *QueryGuardAskRequest {
	s.RequestId = &v
	return s
}

func (s *QueryGuardAskRequest) SetServiceName(v string) *QueryGuardAskRequest {
	s.ServiceName = &v
	return s
}

func (s *QueryGuardAskRequest) SetQuestion(v string) *QueryGuardAskRequest {
	s.Question = &v
	return s
}

func (s *QueryGuardAskRequest) SetUserId(v string) *QueryGuardAskRequest {
	s.UserId = &v
	return s
}

func (s *QueryGuardAskRequest) SetQuestionFormat(v string) *QueryGuardAskRequest {
	s.QuestionFormat = &v
	return s
}

func (s *QueryGuardAskRequest) SetModelCode(v string) *QueryGuardAskRequest {
	s.ModelCode = &v
	return s
}

func (s *QueryGuardAskRequest) SetBusinessProperties(v *KeyValuePair) *QueryGuardAskRequest {
	s.BusinessProperties = v
	return s
}

type QueryGuardAskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 检测数据ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 是否安全无风险，true: 安全无风险，false: 有风险
	Safe *bool `json:"safe,omitempty" xml:"safe,omitempty"`
	// 安全动作，拦截: BLOCK，安全代答: SECURITY_ANSWER，红色GPT安全代答: REDGPT_ANSWER，安全提示增强: SECURITY_PROMPT
	ActionCode *string `json:"action_code,omitempty" xml:"action_code,omitempty"`
	// 安全动作相关文案
	ActionMsg *string `json:"action_msg,omitempty" xml:"action_msg,omitempty"`
	// 会话动作，终止会话: END_SESSION，撤回提问: RECALL_QUERY
	SessionAction *string `json:"session_action,omitempty" xml:"session_action,omitempty"`
}

func (s QueryGuardAskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGuardAskResponse) GoString() string {
	return s.String()
}

func (s *QueryGuardAskResponse) SetReqMsgId(v string) *QueryGuardAskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGuardAskResponse) SetResultCode(v string) *QueryGuardAskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGuardAskResponse) SetResultMsg(v string) *QueryGuardAskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGuardAskResponse) SetRequestId(v string) *QueryGuardAskResponse {
	s.RequestId = &v
	return s
}

func (s *QueryGuardAskResponse) SetSafe(v bool) *QueryGuardAskResponse {
	s.Safe = &v
	return s
}

func (s *QueryGuardAskResponse) SetActionCode(v string) *QueryGuardAskResponse {
	s.ActionCode = &v
	return s
}

func (s *QueryGuardAskResponse) SetActionMsg(v string) *QueryGuardAskResponse {
	s.ActionMsg = &v
	return s
}

func (s *QueryGuardAskResponse) SetSessionAction(v string) *QueryGuardAskResponse {
	s.SessionAction = &v
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
				"sdk_version":      tea.String("1.0.28"),
				"_prod_code":       tea.String("SAAS_SECURITY"),
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
 * Description: 大安全接口
 * Summary: 大安全接口
 */
func (client *Client) CheckInfosecHoloxcontentcheckservice(request *CheckInfosecHoloxcontentcheckserviceRequest) (_result *CheckInfosecHoloxcontentcheckserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckInfosecHoloxcontentcheckserviceResponse{}
	_body, _err := client.CheckInfosecHoloxcontentcheckserviceEx(request, headers, runtime)
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
func (client *Client) CheckInfosecHoloxcontentcheckserviceEx(request *CheckInfosecHoloxcontentcheckserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckInfosecHoloxcontentcheckserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckInfosecHoloxcontentcheckserviceResponse{}
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
func (client *Client) QuerySecuritycoreSecurityuniformservice(request *QuerySecuritycoreSecurityuniformserviceRequest) (_result *QuerySecuritycoreSecurityuniformserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySecuritycoreSecurityuniformserviceResponse{}
	_body, _err := client.QuerySecuritycoreSecurityuniformserviceEx(request, headers, runtime)
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
func (client *Client) QuerySecuritycoreSecurityuniformserviceEx(request *QuerySecuritycoreSecurityuniformserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySecuritycoreSecurityuniformserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySecuritycoreSecurityuniformserviceResponse{}
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
func (client *Client) CheckRdsRdsservice(request *CheckRdsRdsserviceRequest) (_result *CheckRdsRdsserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckRdsRdsserviceResponse{}
	_body, _err := client.CheckRdsRdsserviceEx(request, headers, runtime)
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
func (client *Client) CheckRdsRdsserviceEx(request *CheckRdsRdsserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckRdsRdsserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckRdsRdsserviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("saas.security.rds.rdsservice.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 123
 * Summary: 大安全内容风控接口
 */
func (client *Client) QueryInfosecHoloxcontentcheckqueryservice(request *QueryInfosecHoloxcontentcheckqueryserviceRequest) (_result *QueryInfosecHoloxcontentcheckqueryserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInfosecHoloxcontentcheckqueryserviceResponse{}
	_body, _err := client.QueryInfosecHoloxcontentcheckqueryserviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 123
 * Summary: 大安全内容风控接口
 */
func (client *Client) QueryInfosecHoloxcontentcheckqueryserviceEx(request *QueryInfosecHoloxcontentcheckqueryserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInfosecHoloxcontentcheckqueryserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInfosecHoloxcontentcheckqueryserviceResponse{}
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
func (client *Client) VerifyRdslibAntcaptchaservice(request *VerifyRdslibAntcaptchaserviceRequest) (_result *VerifyRdslibAntcaptchaserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyRdslibAntcaptchaserviceResponse{}
	_body, _err := client.VerifyRdslibAntcaptchaserviceEx(request, headers, runtime)
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
func (client *Client) VerifyRdslibAntcaptchaserviceEx(request *VerifyRdslibAntcaptchaserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyRdslibAntcaptchaserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyRdslibAntcaptchaserviceResponse{}
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
func (client *Client) QueryTscenterUmidqueryservice(request *QueryTscenterUmidqueryserviceRequest) (_result *QueryTscenterUmidqueryserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTscenterUmidqueryserviceResponse{}
	_body, _err := client.QueryTscenterUmidqueryserviceEx(request, headers, runtime)
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
func (client *Client) QueryTscenterUmidqueryserviceEx(request *QueryTscenterUmidqueryserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTscenterUmidqueryserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTscenterUmidqueryserviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("saas.security.tscenter.umidqueryservice.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 大安全检验内容安全接口
 * Summary: 大安全检验内容安全接口
 */
func (client *Client) CheckInfosecOpencheckservicecheck(request *CheckInfosecOpencheckservicecheckRequest) (_result *CheckInfosecOpencheckservicecheckResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckInfosecOpencheckservicecheckResponse{}
	_body, _err := client.CheckInfosecOpencheckservicecheckEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 大安全检验内容安全接口
 * Summary: 大安全检验内容安全接口
 */
func (client *Client) CheckInfosecOpencheckservicecheckEx(request *CheckInfosecOpencheckservicecheckRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckInfosecOpencheckservicecheckResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckInfosecOpencheckservicecheckResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("saas.security.infosec.opencheckservicecheck.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryInfosecOpencheckservicequery(request *QueryInfosecOpencheckservicequeryRequest) (_result *QueryInfosecOpencheckservicequeryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInfosecOpencheckservicequeryResponse{}
	_body, _err := client.QueryInfosecOpencheckservicequeryEx(request, headers, runtime)
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
func (client *Client) QueryInfosecOpencheckservicequeryEx(request *QueryInfosecOpencheckservicequeryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInfosecOpencheckservicequeryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInfosecOpencheckservicequeryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("saas.security.infosec.opencheckservicequery.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试接口
 * Summary: 测试接口
 */
func (client *Client) QueryDemo(request *QueryDemoRequest) (_result *QueryDemoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoResponse{}
	_body, _err := client.QueryDemoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试接口
 * Summary: 测试接口
 */
func (client *Client) QueryDemoEx(request *QueryDemoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("saas.security.demo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天鉴ask接口
 * Summary: 天鉴ask接口
 */
func (client *Client) QueryGuardAsk(request *QueryGuardAskRequest) (_result *QueryGuardAskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGuardAskResponse{}
	_body, _err := client.QueryGuardAskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天鉴ask接口
 * Summary: 天鉴ask接口
 */
func (client *Client) QueryGuardAskEx(request *QueryGuardAskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGuardAskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGuardAskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("saas.security.guard.ask.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
