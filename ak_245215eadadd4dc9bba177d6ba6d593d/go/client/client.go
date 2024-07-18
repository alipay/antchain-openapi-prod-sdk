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

// 字幕单句配置
type Sentence struct {
	// 字幕单句文本
	Text *string `json:"text,omitempty" xml:"text,omitempty" require:"true"`
	// 字幕单句开始时间
	BeginTime *int64 `json:"begin_time,omitempty" xml:"begin_time,omitempty" require:"true"`
	// 字幕单句结束时间
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true"`
}

func (s Sentence) String() string {
	return tea.Prettify(s)
}

func (s Sentence) GoString() string {
	return s.String()
}

func (s *Sentence) SetText(v string) *Sentence {
	s.Text = &v
	return s
}

func (s *Sentence) SetBeginTime(v int64) *Sentence {
	s.BeginTime = &v
	return s
}

func (s *Sentence) SetEndTime(v int64) *Sentence {
	s.EndTime = &v
	return s
}

// 数字人形象
type AvatarProfile struct {
	// 190087
	AvatarId *string `json:"avatar_id,omitempty" xml:"avatar_id,omitempty" require:"true"`
	// 数字人形象名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// CUSTOM---定制；
	// PRESET---预置
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 位置信息等配置信息
	Conf *string `json:"conf,omitempty" xml:"conf,omitempty"`
	// 数字人形象图片
	PicUrl *string `json:"pic_url,omitempty" xml:"pic_url,omitempty" require:"true"`
	// 背景图片地址
	BgUrl *string `json:"bg_url,omitempty" xml:"bg_url,omitempty"`
	// 形象thumb图Url
	ThumbUrl *string `json:"thumb_url,omitempty" xml:"thumb_url,omitempty"`
}

func (s AvatarProfile) String() string {
	return tea.Prettify(s)
}

func (s AvatarProfile) GoString() string {
	return s.String()
}

func (s *AvatarProfile) SetAvatarId(v string) *AvatarProfile {
	s.AvatarId = &v
	return s
}

func (s *AvatarProfile) SetName(v string) *AvatarProfile {
	s.Name = &v
	return s
}

func (s *AvatarProfile) SetType(v string) *AvatarProfile {
	s.Type = &v
	return s
}

func (s *AvatarProfile) SetConf(v string) *AvatarProfile {
	s.Conf = &v
	return s
}

func (s *AvatarProfile) SetPicUrl(v string) *AvatarProfile {
	s.PicUrl = &v
	return s
}

func (s *AvatarProfile) SetBgUrl(v string) *AvatarProfile {
	s.BgUrl = &v
	return s
}

func (s *AvatarProfile) SetThumbUrl(v string) *AvatarProfile {
	s.ThumbUrl = &v
	return s
}

// 视频贴片信息
type Paster struct {
	//  贴片元素离画面位置x坐标
	X *int64 `json:"x,omitempty" xml:"x,omitempty" require:"true"`
	//  贴片元素离画面位置y坐标
	Y *int64 `json:"y,omitempty" xml:"y,omitempty" require:"true"`
	//  贴片元素 url,支持 gif png jpg等图片格式
	SrcUrl *string `json:"src_url,omitempty" xml:"src_url,omitempty" require:"true"`
	// 贴片元素缩放比例
	Scale *string `json:"scale,omitempty" xml:"scale,omitempty" require:"true"`
}

func (s Paster) String() string {
	return tea.Prettify(s)
}

func (s Paster) GoString() string {
	return s.String()
}

func (s *Paster) SetX(v int64) *Paster {
	s.X = &v
	return s
}

func (s *Paster) SetY(v int64) *Paster {
	s.Y = &v
	return s
}

func (s *Paster) SetSrcUrl(v string) *Paster {
	s.SrcUrl = &v
	return s
}

func (s *Paster) SetScale(v string) *Paster {
	s.Scale = &v
	return s
}

// 脚本语音配置
type ScriptVoiceConfig struct {
	// 音色id，合成驱动选择text时必填
	VoiceId *string `json:"voice_id,omitempty" xml:"voice_id,omitempty"`
	// 话术脚本内容，合成驱动选择text时必填
	Text *string `json:"text,omitempty" xml:"text,omitempty"`
	// 0.5～2，语速，合成驱动选择text时必填
	Speed *string `json:"speed,omitempty" xml:"speed,omitempty"`
	// 音频URL，合成驱动选择audio时必填
	AudioUrl *string `json:"audio_url,omitempty" xml:"audio_url,omitempty"`
}

func (s ScriptVoiceConfig) String() string {
	return tea.Prettify(s)
}

func (s ScriptVoiceConfig) GoString() string {
	return s.String()
}

func (s *ScriptVoiceConfig) SetVoiceId(v string) *ScriptVoiceConfig {
	s.VoiceId = &v
	return s
}

func (s *ScriptVoiceConfig) SetText(v string) *ScriptVoiceConfig {
	s.Text = &v
	return s
}

func (s *ScriptVoiceConfig) SetSpeed(v string) *ScriptVoiceConfig {
	s.Speed = &v
	return s
}

func (s *ScriptVoiceConfig) SetAudioUrl(v string) *ScriptVoiceConfig {
	s.AudioUrl = &v
	return s
}

// 数字人音色
type AvatarVoice struct {
	// 音色名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 音色代码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// CLONE--克隆音色；
	// PRESET--预置；
	// CUSTOM--自定义，暂时不采用。
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 音色形象url
	PicUrl *string `json:"pic_url,omitempty" xml:"pic_url,omitempty" require:"true"`
	// 试听音频片段
	DemoUrl *string `json:"demo_url,omitempty" xml:"demo_url,omitempty" require:"true"`
}

func (s AvatarVoice) String() string {
	return tea.Prettify(s)
}

func (s AvatarVoice) GoString() string {
	return s.String()
}

func (s *AvatarVoice) SetName(v string) *AvatarVoice {
	s.Name = &v
	return s
}

func (s *AvatarVoice) SetCode(v string) *AvatarVoice {
	s.Code = &v
	return s
}

func (s *AvatarVoice) SetType(v string) *AvatarVoice {
	s.Type = &v
	return s
}

func (s *AvatarVoice) SetPicUrl(v string) *AvatarVoice {
	s.PicUrl = &v
	return s
}

func (s *AvatarVoice) SetDemoUrl(v string) *AvatarVoice {
	s.DemoUrl = &v
	return s
}

// 字幕信息
type CaptionsInfo struct {
	// 字幕画面位置x坐标，距左侧
	X *int64 `json:"x,omitempty" xml:"x,omitempty" require:"true"`
	// 字幕画面位置y坐标，距上侧
	Y *int64 `json:"y,omitempty" xml:"y,omitempty" require:"true"`
	// 字幕框宽度
	W *int64 `json:"w,omitempty" xml:"w,omitempty" require:"true"`
	// 字幕框高度
	H *int64 `json:"h,omitempty" xml:"h,omitempty" require:"true"`
	// 字幕id
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 字幕句子时间节点信息
	Sentences []*Sentence `json:"sentences,omitempty" xml:"sentences,omitempty" require:"true" type:"Repeated"`
}

func (s CaptionsInfo) String() string {
	return tea.Prettify(s)
}

func (s CaptionsInfo) GoString() string {
	return s.String()
}

func (s *CaptionsInfo) SetX(v int64) *CaptionsInfo {
	s.X = &v
	return s
}

func (s *CaptionsInfo) SetY(v int64) *CaptionsInfo {
	s.Y = &v
	return s
}

func (s *CaptionsInfo) SetW(v int64) *CaptionsInfo {
	s.W = &v
	return s
}

func (s *CaptionsInfo) SetH(v int64) *CaptionsInfo {
	s.H = &v
	return s
}

func (s *CaptionsInfo) SetId(v string) *CaptionsInfo {
	s.Id = &v
	return s
}

func (s *CaptionsInfo) SetSentences(v []*Sentence) *CaptionsInfo {
	s.Sentences = v
	return s
}

// 数字人形象集合
type AvatarProfileResult struct {
	// 数字人形象数量
	Total *int64 `json:"total,omitempty" xml:"total,omitempty" require:"true"`
	// 查询页面索引，不分页无
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty"`
	// 数字人形象列表
	ItemList []*AvatarProfile `json:"item_list,omitempty" xml:"item_list,omitempty" require:"true" type:"Repeated"`
}

func (s AvatarProfileResult) String() string {
	return tea.Prettify(s)
}

func (s AvatarProfileResult) GoString() string {
	return s.String()
}

func (s *AvatarProfileResult) SetTotal(v int64) *AvatarProfileResult {
	s.Total = &v
	return s
}

func (s *AvatarProfileResult) SetPageIndex(v int64) *AvatarProfileResult {
	s.PageIndex = &v
	return s
}

func (s *AvatarProfileResult) SetItemList(v []*AvatarProfile) *AvatarProfileResult {
	s.ItemList = v
	return s
}

// 数字人形象设置
type ProfileInfo struct {
	// 数字人离画面位置坐标,可以为负数或者出画
	//  数字人在视频生成中的位置
	X *int64 `json:"x,omitempty" xml:"x,omitempty" require:"true"`
	// 数字人离画面位置坐标,可以为负数或者出画
	//  数字人在视频生成中的位置
	Y *int64 `json:"y,omitempty" xml:"y,omitempty" require:"true"`
	// 数字人视频大小,初始大小为训练素材整体大小非数字人在框选大小
	W *int64 `json:"w,omitempty" xml:"w,omitempty" require:"true"`
	// 数字人视频大小,初始大小为训练素材整体大小非数字人在框选大小
	H *int64 `json:"h,omitempty" xml:"h,omitempty" require:"true"`
	// 数字人视频大小缩放,实际大小为  scale*w   scale*h
	Scale *string `json:"scale,omitempty" xml:"scale,omitempty"`
}

func (s ProfileInfo) String() string {
	return tea.Prettify(s)
}

func (s ProfileInfo) GoString() string {
	return s.String()
}

func (s *ProfileInfo) SetX(v int64) *ProfileInfo {
	s.X = &v
	return s
}

func (s *ProfileInfo) SetY(v int64) *ProfileInfo {
	s.Y = &v
	return s
}

func (s *ProfileInfo) SetW(v int64) *ProfileInfo {
	s.W = &v
	return s
}

func (s *ProfileInfo) SetH(v int64) *ProfileInfo {
	s.H = &v
	return s
}

func (s *ProfileInfo) SetScale(v string) *ProfileInfo {
	s.Scale = &v
	return s
}

// 合成任务
type VideoTask struct {
	// RUNNING, COMPLETE,FAIL
	State *string `json:"state,omitempty" xml:"state,omitempty" require:"true"`
	// 完成状态，会返回视频地址
	VideoUrl *string `json:"video_url,omitempty" xml:"video_url,omitempty"`
}

func (s VideoTask) String() string {
	return tea.Prettify(s)
}

func (s VideoTask) GoString() string {
	return s.String()
}

func (s *VideoTask) SetState(v string) *VideoTask {
	s.State = &v
	return s
}

func (s *VideoTask) SetVideoUrl(v string) *VideoTask {
	s.VideoUrl = &v
	return s
}

// 背景设置
//
type Background struct {
	// 背景元素，支持 gif png jpg mp4等格式
	SrcUrl *string `json:"src_url,omitempty" xml:"src_url,omitempty" require:"true"`
	// 背景缩放比例
	Scale *string `json:"scale,omitempty" xml:"scale,omitempty" require:"true"`
	// 背景图片x坐标位置，距左侧
	X *int64 `json:"x,omitempty" xml:"x,omitempty" require:"true"`
	// 背景图片y坐标位置，距上侧
	Y *int64 `json:"y,omitempty" xml:"y,omitempty" require:"true"`
}

func (s Background) String() string {
	return tea.Prettify(s)
}

func (s Background) GoString() string {
	return s.String()
}

func (s *Background) SetSrcUrl(v string) *Background {
	s.SrcUrl = &v
	return s
}

func (s *Background) SetScale(v string) *Background {
	s.Scale = &v
	return s
}

func (s *Background) SetX(v int64) *Background {
	s.X = &v
	return s
}

func (s *Background) SetY(v int64) *Background {
	s.Y = &v
	return s
}

type ListUniversalsaasDigitalhumanVideoVoiceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s ListUniversalsaasDigitalhumanVideoVoiceRequest) String() string {
	return tea.Prettify(s)
}

func (s ListUniversalsaasDigitalhumanVideoVoiceRequest) GoString() string {
	return s.String()
}

func (s *ListUniversalsaasDigitalhumanVideoVoiceRequest) SetAuthToken(v string) *ListUniversalsaasDigitalhumanVideoVoiceRequest {
	s.AuthToken = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanVideoVoiceRequest) SetProductInstanceId(v string) *ListUniversalsaasDigitalhumanVideoVoiceRequest {
	s.ProductInstanceId = &v
	return s
}

type ListUniversalsaasDigitalhumanVideoVoiceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果状态
	Status *bool `json:"status,omitempty" xml:"status,omitempty"`
	// 音色列表
	Data []*AvatarVoice `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s ListUniversalsaasDigitalhumanVideoVoiceResponse) String() string {
	return tea.Prettify(s)
}

func (s ListUniversalsaasDigitalhumanVideoVoiceResponse) GoString() string {
	return s.String()
}

func (s *ListUniversalsaasDigitalhumanVideoVoiceResponse) SetReqMsgId(v string) *ListUniversalsaasDigitalhumanVideoVoiceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanVideoVoiceResponse) SetResultCode(v string) *ListUniversalsaasDigitalhumanVideoVoiceResponse {
	s.ResultCode = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanVideoVoiceResponse) SetResultMsg(v string) *ListUniversalsaasDigitalhumanVideoVoiceResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanVideoVoiceResponse) SetStatus(v bool) *ListUniversalsaasDigitalhumanVideoVoiceResponse {
	s.Status = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanVideoVoiceResponse) SetData(v []*AvatarVoice) *ListUniversalsaasDigitalhumanVideoVoiceResponse {
	s.Data = v
	return s
}

type ListUniversalsaasDigitalhumanVideoProfileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 2D_PRESET---2d预置；
	// 3D_PRESET---3d预置；
	// 2D_CUSTOM--2d定制；
	// 3D_CUSTOM--3d定制；
	//
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 分页查询页面索引，传值为空不分页
	// 索引从0开始。
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty"`
	// 分页页面大小，默认10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s ListUniversalsaasDigitalhumanVideoProfileRequest) String() string {
	return tea.Prettify(s)
}

func (s ListUniversalsaasDigitalhumanVideoProfileRequest) GoString() string {
	return s.String()
}

func (s *ListUniversalsaasDigitalhumanVideoProfileRequest) SetAuthToken(v string) *ListUniversalsaasDigitalhumanVideoProfileRequest {
	s.AuthToken = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanVideoProfileRequest) SetProductInstanceId(v string) *ListUniversalsaasDigitalhumanVideoProfileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanVideoProfileRequest) SetType(v string) *ListUniversalsaasDigitalhumanVideoProfileRequest {
	s.Type = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanVideoProfileRequest) SetPageIndex(v int64) *ListUniversalsaasDigitalhumanVideoProfileRequest {
	s.PageIndex = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanVideoProfileRequest) SetPageSize(v int64) *ListUniversalsaasDigitalhumanVideoProfileRequest {
	s.PageSize = &v
	return s
}

type ListUniversalsaasDigitalhumanVideoProfileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询结果状态
	Status *bool `json:"status,omitempty" xml:"status,omitempty"`
	// 数字人形象集合
	Data *AvatarProfileResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListUniversalsaasDigitalhumanVideoProfileResponse) String() string {
	return tea.Prettify(s)
}

func (s ListUniversalsaasDigitalhumanVideoProfileResponse) GoString() string {
	return s.String()
}

func (s *ListUniversalsaasDigitalhumanVideoProfileResponse) SetReqMsgId(v string) *ListUniversalsaasDigitalhumanVideoProfileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanVideoProfileResponse) SetResultCode(v string) *ListUniversalsaasDigitalhumanVideoProfileResponse {
	s.ResultCode = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanVideoProfileResponse) SetResultMsg(v string) *ListUniversalsaasDigitalhumanVideoProfileResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanVideoProfileResponse) SetStatus(v bool) *ListUniversalsaasDigitalhumanVideoProfileResponse {
	s.Status = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanVideoProfileResponse) SetData(v *AvatarProfileResult) *ListUniversalsaasDigitalhumanVideoProfileResponse {
	s.Data = v
	return s
}

type CreateUniversalsaasDigitalhumanVideoTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数字人id
	AvatarId *string `json:"avatar_id,omitempty" xml:"avatar_id,omitempty" require:"true"`
	// text/audio, 合成驱动--文本/音频
	DriverType *string `json:"driver_type,omitempty" xml:"driver_type,omitempty" require:"true"`
	// 形象设置
	ProfileInfo *ProfileInfo `json:"profile_info,omitempty" xml:"profile_info,omitempty"`
	// 话术脚本语音配置
	ScriptVoiceConfig *ScriptVoiceConfig `json:"script_voice_config,omitempty" xml:"script_voice_config,omitempty" require:"true"`
	// 是否开启字幕
	OpenCaptions *bool `json:"open_captions,omitempty" xml:"open_captions,omitempty" require:"true"`
	// 字幕配置
	CaptionsInfo *CaptionsInfo `json:"captions_info,omitempty" xml:"captions_info,omitempty"`
	// 是否替换字幕敏感词
	ReplaceSensitive *bool `json:"replace_sensitive,omitempty" xml:"replace_sensitive,omitempty"`
	// 背景信息
	Background *Background `json:"background,omitempty" xml:"background,omitempty"`
	// 贴片元素信息
	Pasters []*Paster `json:"pasters,omitempty" xml:"pasters,omitempty" type:"Repeated"`
	// 数字人视频生成格式，默认不填
	Format *string `json:"format,omitempty" xml:"format,omitempty"`
}

func (s CreateUniversalsaasDigitalhumanVideoTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateUniversalsaasDigitalhumanVideoTaskRequest) GoString() string {
	return s.String()
}

func (s *CreateUniversalsaasDigitalhumanVideoTaskRequest) SetAuthToken(v string) *CreateUniversalsaasDigitalhumanVideoTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateUniversalsaasDigitalhumanVideoTaskRequest) SetProductInstanceId(v string) *CreateUniversalsaasDigitalhumanVideoTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateUniversalsaasDigitalhumanVideoTaskRequest) SetAvatarId(v string) *CreateUniversalsaasDigitalhumanVideoTaskRequest {
	s.AvatarId = &v
	return s
}

func (s *CreateUniversalsaasDigitalhumanVideoTaskRequest) SetDriverType(v string) *CreateUniversalsaasDigitalhumanVideoTaskRequest {
	s.DriverType = &v
	return s
}

func (s *CreateUniversalsaasDigitalhumanVideoTaskRequest) SetProfileInfo(v *ProfileInfo) *CreateUniversalsaasDigitalhumanVideoTaskRequest {
	s.ProfileInfo = v
	return s
}

func (s *CreateUniversalsaasDigitalhumanVideoTaskRequest) SetScriptVoiceConfig(v *ScriptVoiceConfig) *CreateUniversalsaasDigitalhumanVideoTaskRequest {
	s.ScriptVoiceConfig = v
	return s
}

func (s *CreateUniversalsaasDigitalhumanVideoTaskRequest) SetOpenCaptions(v bool) *CreateUniversalsaasDigitalhumanVideoTaskRequest {
	s.OpenCaptions = &v
	return s
}

func (s *CreateUniversalsaasDigitalhumanVideoTaskRequest) SetCaptionsInfo(v *CaptionsInfo) *CreateUniversalsaasDigitalhumanVideoTaskRequest {
	s.CaptionsInfo = v
	return s
}

func (s *CreateUniversalsaasDigitalhumanVideoTaskRequest) SetReplaceSensitive(v bool) *CreateUniversalsaasDigitalhumanVideoTaskRequest {
	s.ReplaceSensitive = &v
	return s
}

func (s *CreateUniversalsaasDigitalhumanVideoTaskRequest) SetBackground(v *Background) *CreateUniversalsaasDigitalhumanVideoTaskRequest {
	s.Background = v
	return s
}

func (s *CreateUniversalsaasDigitalhumanVideoTaskRequest) SetPasters(v []*Paster) *CreateUniversalsaasDigitalhumanVideoTaskRequest {
	s.Pasters = v
	return s
}

func (s *CreateUniversalsaasDigitalhumanVideoTaskRequest) SetFormat(v string) *CreateUniversalsaasDigitalhumanVideoTaskRequest {
	s.Format = &v
	return s
}

type CreateUniversalsaasDigitalhumanVideoTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果状态
	Status *bool `json:"status,omitempty" xml:"status,omitempty"`
	// taskId
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateUniversalsaasDigitalhumanVideoTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateUniversalsaasDigitalhumanVideoTaskResponse) GoString() string {
	return s.String()
}

func (s *CreateUniversalsaasDigitalhumanVideoTaskResponse) SetReqMsgId(v string) *CreateUniversalsaasDigitalhumanVideoTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateUniversalsaasDigitalhumanVideoTaskResponse) SetResultCode(v string) *CreateUniversalsaasDigitalhumanVideoTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateUniversalsaasDigitalhumanVideoTaskResponse) SetResultMsg(v string) *CreateUniversalsaasDigitalhumanVideoTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateUniversalsaasDigitalhumanVideoTaskResponse) SetStatus(v bool) *CreateUniversalsaasDigitalhumanVideoTaskResponse {
	s.Status = &v
	return s
}

func (s *CreateUniversalsaasDigitalhumanVideoTaskResponse) SetData(v string) *CreateUniversalsaasDigitalhumanVideoTaskResponse {
	s.Data = &v
	return s
}

type QueryUniversalsaasDigitalhumanVideoTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 视频合成任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryUniversalsaasDigitalhumanVideoTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryUniversalsaasDigitalhumanVideoTaskRequest) GoString() string {
	return s.String()
}

func (s *QueryUniversalsaasDigitalhumanVideoTaskRequest) SetAuthToken(v string) *QueryUniversalsaasDigitalhumanVideoTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryUniversalsaasDigitalhumanVideoTaskRequest) SetProductInstanceId(v string) *QueryUniversalsaasDigitalhumanVideoTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryUniversalsaasDigitalhumanVideoTaskRequest) SetTaskId(v string) *QueryUniversalsaasDigitalhumanVideoTaskRequest {
	s.TaskId = &v
	return s
}

type QueryUniversalsaasDigitalhumanVideoTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果状态
	Status *bool `json:"status,omitempty" xml:"status,omitempty"`
	// 合成结果
	Data *VideoTask `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryUniversalsaasDigitalhumanVideoTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryUniversalsaasDigitalhumanVideoTaskResponse) GoString() string {
	return s.String()
}

func (s *QueryUniversalsaasDigitalhumanVideoTaskResponse) SetReqMsgId(v string) *QueryUniversalsaasDigitalhumanVideoTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryUniversalsaasDigitalhumanVideoTaskResponse) SetResultCode(v string) *QueryUniversalsaasDigitalhumanVideoTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryUniversalsaasDigitalhumanVideoTaskResponse) SetResultMsg(v string) *QueryUniversalsaasDigitalhumanVideoTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryUniversalsaasDigitalhumanVideoTaskResponse) SetStatus(v bool) *QueryUniversalsaasDigitalhumanVideoTaskResponse {
	s.Status = &v
	return s
}

func (s *QueryUniversalsaasDigitalhumanVideoTaskResponse) SetData(v *VideoTask) *QueryUniversalsaasDigitalhumanVideoTaskResponse {
	s.Data = v
	return s
}

type CreateUniversalsaasDigitalhumanVoiceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 需要转语音的文字
	Text *string `json:"text,omitempty" xml:"text,omitempty" require:"true"`
	// 语速，[0.5,2.0]，默认1.0
	Speed *string `json:"speed,omitempty" xml:"speed,omitempty"`
	// 音调，[0.1,3.0]，默认1.0
	Pitch *string `json:"pitch,omitempty" xml:"pitch,omitempty"`
	// 音量，[0.1,3.0]，默认1.0
	Volume *string `json:"volume,omitempty" xml:"volume,omitempty"`
	// 音色id
	Voice *string `json:"voice,omitempty" xml:"voice,omitempty" require:"true"`
}

func (s CreateUniversalsaasDigitalhumanVoiceRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateUniversalsaasDigitalhumanVoiceRequest) GoString() string {
	return s.String()
}

func (s *CreateUniversalsaasDigitalhumanVoiceRequest) SetAuthToken(v string) *CreateUniversalsaasDigitalhumanVoiceRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateUniversalsaasDigitalhumanVoiceRequest) SetProductInstanceId(v string) *CreateUniversalsaasDigitalhumanVoiceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateUniversalsaasDigitalhumanVoiceRequest) SetText(v string) *CreateUniversalsaasDigitalhumanVoiceRequest {
	s.Text = &v
	return s
}

func (s *CreateUniversalsaasDigitalhumanVoiceRequest) SetSpeed(v string) *CreateUniversalsaasDigitalhumanVoiceRequest {
	s.Speed = &v
	return s
}

func (s *CreateUniversalsaasDigitalhumanVoiceRequest) SetPitch(v string) *CreateUniversalsaasDigitalhumanVoiceRequest {
	s.Pitch = &v
	return s
}

func (s *CreateUniversalsaasDigitalhumanVoiceRequest) SetVolume(v string) *CreateUniversalsaasDigitalhumanVoiceRequest {
	s.Volume = &v
	return s
}

func (s *CreateUniversalsaasDigitalhumanVoiceRequest) SetVoice(v string) *CreateUniversalsaasDigitalhumanVoiceRequest {
	s.Voice = &v
	return s
}

type CreateUniversalsaasDigitalhumanVoiceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 音频url
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 结果状态
	Status *bool `json:"status,omitempty" xml:"status,omitempty"`
}

func (s CreateUniversalsaasDigitalhumanVoiceResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateUniversalsaasDigitalhumanVoiceResponse) GoString() string {
	return s.String()
}

func (s *CreateUniversalsaasDigitalhumanVoiceResponse) SetReqMsgId(v string) *CreateUniversalsaasDigitalhumanVoiceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateUniversalsaasDigitalhumanVoiceResponse) SetResultCode(v string) *CreateUniversalsaasDigitalhumanVoiceResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateUniversalsaasDigitalhumanVoiceResponse) SetResultMsg(v string) *CreateUniversalsaasDigitalhumanVoiceResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateUniversalsaasDigitalhumanVoiceResponse) SetData(v string) *CreateUniversalsaasDigitalhumanVoiceResponse {
	s.Data = &v
	return s
}

func (s *CreateUniversalsaasDigitalhumanVoiceResponse) SetStatus(v bool) *CreateUniversalsaasDigitalhumanVoiceResponse {
	s.Status = &v
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
				"sdk_version":      tea.String("1.1.0"),
				"_prod_code":       tea.String("ak_245215eadadd4dc9bba177d6ba6d593d"),
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
 * Description: 数字人音色列表
 * Summary: 数字人音色列表
 */
func (client *Client) ListUniversalsaasDigitalhumanVideoVoice(request *ListUniversalsaasDigitalhumanVideoVoiceRequest) (_result *ListUniversalsaasDigitalhumanVideoVoiceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListUniversalsaasDigitalhumanVideoVoiceResponse{}
	_body, _err := client.ListUniversalsaasDigitalhumanVideoVoiceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数字人音色列表
 * Summary: 数字人音色列表
 */
func (client *Client) ListUniversalsaasDigitalhumanVideoVoiceEx(request *ListUniversalsaasDigitalhumanVideoVoiceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListUniversalsaasDigitalhumanVideoVoiceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListUniversalsaasDigitalhumanVideoVoiceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.digitalhuman.video.voice.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数字人短视频形象列表
 * Summary: 数字人短视频形象列表
 */
func (client *Client) ListUniversalsaasDigitalhumanVideoProfile(request *ListUniversalsaasDigitalhumanVideoProfileRequest) (_result *ListUniversalsaasDigitalhumanVideoProfileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListUniversalsaasDigitalhumanVideoProfileResponse{}
	_body, _err := client.ListUniversalsaasDigitalhumanVideoProfileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数字人短视频形象列表
 * Summary: 数字人短视频形象列表
 */
func (client *Client) ListUniversalsaasDigitalhumanVideoProfileEx(request *ListUniversalsaasDigitalhumanVideoProfileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListUniversalsaasDigitalhumanVideoProfileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListUniversalsaasDigitalhumanVideoProfileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.digitalhuman.video.profile.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 视频合成任务生成
 * Summary: 视频合成任务生成
 */
func (client *Client) CreateUniversalsaasDigitalhumanVideoTask(request *CreateUniversalsaasDigitalhumanVideoTaskRequest) (_result *CreateUniversalsaasDigitalhumanVideoTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateUniversalsaasDigitalhumanVideoTaskResponse{}
	_body, _err := client.CreateUniversalsaasDigitalhumanVideoTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 视频合成任务生成
 * Summary: 视频合成任务生成
 */
func (client *Client) CreateUniversalsaasDigitalhumanVideoTaskEx(request *CreateUniversalsaasDigitalhumanVideoTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateUniversalsaasDigitalhumanVideoTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateUniversalsaasDigitalhumanVideoTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.digitalhuman.video.task.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 视频合成任务查询
 * Summary: 视频合成任务查询
 */
func (client *Client) QueryUniversalsaasDigitalhumanVideoTask(request *QueryUniversalsaasDigitalhumanVideoTaskRequest) (_result *QueryUniversalsaasDigitalhumanVideoTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryUniversalsaasDigitalhumanVideoTaskResponse{}
	_body, _err := client.QueryUniversalsaasDigitalhumanVideoTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 视频合成任务查询
 * Summary: 视频合成任务查询
 */
func (client *Client) QueryUniversalsaasDigitalhumanVideoTaskEx(request *QueryUniversalsaasDigitalhumanVideoTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryUniversalsaasDigitalhumanVideoTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryUniversalsaasDigitalhumanVideoTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.digitalhuman.video.task.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数字人tts接口
 * Summary: 数字人tts接口
 */
func (client *Client) CreateUniversalsaasDigitalhumanVoice(request *CreateUniversalsaasDigitalhumanVoiceRequest) (_result *CreateUniversalsaasDigitalhumanVoiceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateUniversalsaasDigitalhumanVoiceResponse{}
	_body, _err := client.CreateUniversalsaasDigitalhumanVoiceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数字人tts接口
 * Summary: 数字人tts接口
 */
func (client *Client) CreateUniversalsaasDigitalhumanVoiceEx(request *CreateUniversalsaasDigitalhumanVoiceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateUniversalsaasDigitalhumanVoiceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateUniversalsaasDigitalhumanVoiceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.digitalhuman.voice.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
