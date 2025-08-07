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

// 卡证OCR图片坐标
type OcrLocation struct {
	// 表示定位位置的长方形左上顶点的垂直坐标
	Top *string `json:"top,omitempty" xml:"top,omitempty"`
	// 表示定位位置的长方形左上顶点的水平坐标
	Left *string `json:"left,omitempty" xml:"left,omitempty"`
	// 表示定位位置的长方形的宽度
	Width *string `json:"width,omitempty" xml:"width,omitempty"`
	// 表示定位位置的长方形的高度
	Height *string `json:"height,omitempty" xml:"height,omitempty"`
}

func (s OcrLocation) String() string {
	return tea.Prettify(s)
}

func (s OcrLocation) GoString() string {
	return s.String()
}

func (s *OcrLocation) SetTop(v string) *OcrLocation {
	s.Top = &v
	return s
}

func (s *OcrLocation) SetLeft(v string) *OcrLocation {
	s.Left = &v
	return s
}

func (s *OcrLocation) SetWidth(v string) *OcrLocation {
	s.Width = &v
	return s
}

func (s *OcrLocation) SetHeight(v string) *OcrLocation {
	s.Height = &v
	return s
}

// 卡证OCR图片质量
type CardQuality struct {
	// 1-清晰
	// 0-不清晰
	//
	IsClear *string `json:"is_clear,omitempty" xml:"is_clear,omitempty"`
	// 清晰度取值0-1，值越大表示图像质量越好，默认阈值0.5
	IsClearPropobility *string `json:"is_clear_propobility,omitempty" xml:"is_clear_propobility,omitempty"`
	// 1-边框/四角完整
	// 0-边框/四角不完整
	IsComplete *string `json:"is_complete,omitempty" xml:"is_complete,omitempty"`
	// 取值0-1，值越大表示图像质量越好，默认阈值0.5
	IsCompletePropobility *string `json:"is_complete_propobility,omitempty" xml:"is_complete_propobility,omitempty"`
	// 1-头像、关键字段无遮挡/马赛克
	// 0-头像、关键字段有遮挡/马赛克
	IsNoCover *string `json:"is_no_cover,omitempty" xml:"is_no_cover,omitempty"`
	// 有无遮挡propobility-取值0-1，值越大表示图像质量越好，默认阈值0.3
	IsNoCoverPropobility *string `json:"is_no_cover_propobility,omitempty" xml:"is_no_cover_propobility,omitempty"`
}

func (s CardQuality) String() string {
	return tea.Prettify(s)
}

func (s CardQuality) GoString() string {
	return s.String()
}

func (s *CardQuality) SetIsClear(v string) *CardQuality {
	s.IsClear = &v
	return s
}

func (s *CardQuality) SetIsClearPropobility(v string) *CardQuality {
	s.IsClearPropobility = &v
	return s
}

func (s *CardQuality) SetIsComplete(v string) *CardQuality {
	s.IsComplete = &v
	return s
}

func (s *CardQuality) SetIsCompletePropobility(v string) *CardQuality {
	s.IsCompletePropobility = &v
	return s
}

func (s *CardQuality) SetIsNoCover(v string) *CardQuality {
	s.IsNoCover = &v
	return s
}

func (s *CardQuality) SetIsNoCoverPropobility(v string) *CardQuality {
	s.IsNoCoverPropobility = &v
	return s
}

// 卡证OCR风险结果
type RiskInfo struct {
	// 是否为复印件（仅身份证、银行卡含该字段）。0：否，1：是
	Copy *string `json:"copy,omitempty" xml:"copy,omitempty"`
	// 是否翻拍（仅身份证含该字段）。0：否，1：是
	Reshoot *string `json:"reshoot,omitempty" xml:"reshoot,omitempty"`
	// normal-识别正常
	// non_idcard-上传的图片中不包含身份证
	// blurred-身份证模糊
	// other_type_card-其他类型证照
	// over_exposure-身份证关键字段反光或过曝
	// over_dark-身份证欠曝（亮度过低）
	// unknown-未知状态
	ImageStatus []*string `json:"image_status,omitempty" xml:"image_status,omitempty" type:"Repeated"`
	// 输入参数 risk_info_type=true 时，则返回该字段，判断身份证是否存在风险，返回值：
	// normal-正常身份证；
	// copy-复印件；
	// temporary-临时身份证；
	// screen-翻拍；
	// PS-被PS修改；
	// unknown-其他未知情况
	RiskType []*string `json:"risk_type,omitempty" xml:"risk_type,omitempty" type:"Repeated"`
	// 图片质量
	CardQuality *CardQuality `json:"card_quality,omitempty" xml:"card_quality,omitempty"`
	// 证件一致性
	IdcardNumberType *string `json:"idcard_number_type,omitempty" xml:"idcard_number_type,omitempty"`
}

func (s RiskInfo) String() string {
	return tea.Prettify(s)
}

func (s RiskInfo) GoString() string {
	return s.String()
}

func (s *RiskInfo) SetCopy(v string) *RiskInfo {
	s.Copy = &v
	return s
}

func (s *RiskInfo) SetReshoot(v string) *RiskInfo {
	s.Reshoot = &v
	return s
}

func (s *RiskInfo) SetImageStatus(v []*string) *RiskInfo {
	s.ImageStatus = v
	return s
}

func (s *RiskInfo) SetRiskType(v []*string) *RiskInfo {
	s.RiskType = v
	return s
}

func (s *RiskInfo) SetCardQuality(v *CardQuality) *RiskInfo {
	s.CardQuality = v
	return s
}

func (s *RiskInfo) SetIdcardNumberType(v string) *RiskInfo {
	s.IdcardNumberType = &v
	return s
}

// 音频元数据
type AudioMeta struct {
	// 采样率
	SampleFreq *int64 `json:"sample_freq,omitempty" xml:"sample_freq,omitempty"`
	// 音频道数
	ChannelsNum *int64 `json:"channels_num,omitempty" xml:"channels_num,omitempty"`
	// 音频数据采样点所占位数
	Bits *int64 `json:"bits,omitempty" xml:"bits,omitempty"`
	// 语音信道分离标识
	Channel *int64 `json:"channel,omitempty" xml:"channel,omitempty"`
}

func (s AudioMeta) String() string {
	return tea.Prettify(s)
}

func (s AudioMeta) GoString() string {
	return s.String()
}

func (s *AudioMeta) SetSampleFreq(v int64) *AudioMeta {
	s.SampleFreq = &v
	return s
}

func (s *AudioMeta) SetChannelsNum(v int64) *AudioMeta {
	s.ChannelsNum = &v
	return s
}

func (s *AudioMeta) SetBits(v int64) *AudioMeta {
	s.Bits = &v
	return s
}

func (s *AudioMeta) SetChannel(v int64) *AudioMeta {
	s.Channel = &v
	return s
}

// 音频文件
type Audio struct {
	// 音频文件名称（单次请求保持唯一）
	Token *string `json:"token,omitempty" xml:"token,omitempty"`
	// 待认证的音频文件，base64编码格式
	RawData *string `json:"raw_data,omitempty" xml:"raw_data,omitempty"`
	// 音频文件OSS地址
	AudioUrl *string `json:"audio_url,omitempty" xml:"audio_url,omitempty"`
}

func (s Audio) String() string {
	return tea.Prettify(s)
}

func (s Audio) GoString() string {
	return s.String()
}

func (s *Audio) SetToken(v string) *Audio {
	s.Token = &v
	return s
}

func (s *Audio) SetRawData(v string) *Audio {
	s.RawData = &v
	return s
}

func (s *Audio) SetAudioUrl(v string) *Audio {
	s.AudioUrl = &v
	return s
}

// 卡证OCR识别结果
type OcrInfo struct {
	// 当识别到身份证是人像面时返回FACE，国徽面时返回BACK
	Side *string `json:"side,omitempty" xml:"side,omitempty"`
	// 当请求参数 return_photo = true时返回，头像切图的 base64 编码（无编码头，需自行处理）
	// *当服务降级时，返回null
	Photo *string `json:"photo,omitempty" xml:"photo,omitempty"`
	// {}	当请求参数 return_photo = true时返回，头像的位置信息（坐标0点为左上角）
	// *当服务降级时，返回null
	PhotoLocation *OcrLocation `json:"photo_location,omitempty" xml:"photo_location,omitempty"`
	// 当请求参数 return_card = true时返回，身份证裁剪切图的 base64 编码（无编码头，需自行处理）
	// *当服务降级时，返回null
	CardImage *string `json:"card_image,omitempty" xml:"card_image,omitempty"`
	// 当请求参数 return_card = true时返回，身份证裁剪切图的位置信息（坐标0点为左上角）
	// *当服务降级时，返回null
	CardLocation *OcrLocation `json:"card_location,omitempty" xml:"card_location,omitempty"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 性别
	Sex *string `json:"sex,omitempty" xml:"sex,omitempty"`
	// 民族
	Nationality *string `json:"nationality,omitempty" xml:"nationality,omitempty"`
	// 出生日期（yyyyMMdd格式）
	Birth *string `json:"birth,omitempty" xml:"birth,omitempty"`
	// 住址
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 身份证号
	Num *string `json:"num,omitempty" xml:"num,omitempty"`
	// 发证日期（yyyyMMdd格式）
	StartDate *string `json:"start_date,omitempty" xml:"start_date,omitempty"`
	// 到期日（yyyyMMdd格式）。
	// 如果是长期身份证，该字段内容为“长期”（不含引号）。
	EndDate *string `json:"end_date,omitempty" xml:"end_date,omitempty"`
	// 签发机关
	Issue *string `json:"issue,omitempty" xml:"issue,omitempty"`
	// 银行卡类型（CC（贷记卡），SCC（准贷记卡），DCC（存贷合一卡），DC（储蓄卡），PC（预付卡））
	BankCardType *string `json:"bank_card_type,omitempty" xml:"bank_card_type,omitempty"`
	// 银行名，不能识别时为空
	BankName *string `json:"bank_name,omitempty" xml:"bank_name,omitempty"`
	// 银行卡号
	CardNumber *string `json:"card_number,omitempty" xml:"card_number,omitempty"`
	// 有效期至
	ValidToDate *string `json:"valid_to_date,omitempty" xml:"valid_to_date,omitempty"`
	// 证件类别
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// 有效期限(yyyy.MM.dd-yyyy.MM.dd格式)
	DateOfExpiry *string `json:"date_of_expiry,omitempty" xml:"date_of_expiry,omitempty"`
	// 换证次数
	ChangeNum *string `json:"change_num,omitempty" xml:"change_num,omitempty"`
	// 初次领证日期
	FirstIssue *string `json:"first_issue,omitempty" xml:"first_issue,omitempty"`
	// 准驾车型
	DriverClass *string `json:"driver_class,omitempty" xml:"driver_class,omitempty"`
	// 档案编号
	DocNum *string `json:"doc_num,omitempty" xml:"doc_num,omitempty"`
	// 电子驾驶证生成时间
	IssueTime *string `json:"issue_time,omitempty" xml:"issue_time,omitempty"`
	// 当前时间
	CurrentTime *string `json:"current_time,omitempty" xml:"current_time,omitempty"`
	// 条形码编号
	BarCode *string `json:"bar_code,omitempty" xml:"bar_code,omitempty"`
	// 累计记分
	Points *string `json:"points,omitempty" xml:"points,omitempty"`
	// 记录
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
	// 状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 车辆识别代号
	Vehicle *string `json:"vehicle,omitempty" xml:"vehicle,omitempty"`
	// 品牌型号
	Model *string `json:"model,omitempty" xml:"model,omitempty"`
	// 车辆类型
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 使用性质
	Useage *string `json:"useage,omitempty" xml:"useage,omitempty"`
	// 发动机号码
	EngNum *string `json:"eng_num,omitempty" xml:"eng_num,omitempty"`
	// 车牌号码
	Plate *string `json:"plate,omitempty" xml:"plate,omitempty"`
	// 检验记录
	InspecRecord *string `json:"inspec_record,omitempty" xml:"inspec_record,omitempty"`
	// 核定载质量
	Load *string `json:"load,omitempty" xml:"load,omitempty"`
	// 整备质量
	CurbMass *string `json:"curb_mass,omitempty" xml:"curb_mass,omitempty"`
	// 外廓尺寸
	OverallDimension *string `json:"overall_dimension,omitempty" xml:"overall_dimension,omitempty"`
	// 核定载人数
	Seating *string `json:"seating,omitempty" xml:"seating,omitempty"`
	// 总质量
	GrossMass *string `json:"gross_mass,omitempty" xml:"gross_mass,omitempty"`
	// 燃油类型
	Fuel *string `json:"fuel,omitempty" xml:"fuel,omitempty"`
	// 准牵引总质量
	TractionMass *string `json:"traction_mass,omitempty" xml:"traction_mass,omitempty"`
	// 证芯编号
	ChipNum *string `json:"chip_num,omitempty" xml:"chip_num,omitempty"`
}

func (s OcrInfo) String() string {
	return tea.Prettify(s)
}

func (s OcrInfo) GoString() string {
	return s.String()
}

func (s *OcrInfo) SetSide(v string) *OcrInfo {
	s.Side = &v
	return s
}

func (s *OcrInfo) SetPhoto(v string) *OcrInfo {
	s.Photo = &v
	return s
}

func (s *OcrInfo) SetPhotoLocation(v *OcrLocation) *OcrInfo {
	s.PhotoLocation = v
	return s
}

func (s *OcrInfo) SetCardImage(v string) *OcrInfo {
	s.CardImage = &v
	return s
}

func (s *OcrInfo) SetCardLocation(v *OcrLocation) *OcrInfo {
	s.CardLocation = v
	return s
}

func (s *OcrInfo) SetName(v string) *OcrInfo {
	s.Name = &v
	return s
}

func (s *OcrInfo) SetSex(v string) *OcrInfo {
	s.Sex = &v
	return s
}

func (s *OcrInfo) SetNationality(v string) *OcrInfo {
	s.Nationality = &v
	return s
}

func (s *OcrInfo) SetBirth(v string) *OcrInfo {
	s.Birth = &v
	return s
}

func (s *OcrInfo) SetAddress(v string) *OcrInfo {
	s.Address = &v
	return s
}

func (s *OcrInfo) SetNum(v string) *OcrInfo {
	s.Num = &v
	return s
}

func (s *OcrInfo) SetStartDate(v string) *OcrInfo {
	s.StartDate = &v
	return s
}

func (s *OcrInfo) SetEndDate(v string) *OcrInfo {
	s.EndDate = &v
	return s
}

func (s *OcrInfo) SetIssue(v string) *OcrInfo {
	s.Issue = &v
	return s
}

func (s *OcrInfo) SetBankCardType(v string) *OcrInfo {
	s.BankCardType = &v
	return s
}

func (s *OcrInfo) SetBankName(v string) *OcrInfo {
	s.BankName = &v
	return s
}

func (s *OcrInfo) SetCardNumber(v string) *OcrInfo {
	s.CardNumber = &v
	return s
}

func (s *OcrInfo) SetValidToDate(v string) *OcrInfo {
	s.ValidToDate = &v
	return s
}

func (s *OcrInfo) SetTitle(v string) *OcrInfo {
	s.Title = &v
	return s
}

func (s *OcrInfo) SetDateOfExpiry(v string) *OcrInfo {
	s.DateOfExpiry = &v
	return s
}

func (s *OcrInfo) SetChangeNum(v string) *OcrInfo {
	s.ChangeNum = &v
	return s
}

func (s *OcrInfo) SetFirstIssue(v string) *OcrInfo {
	s.FirstIssue = &v
	return s
}

func (s *OcrInfo) SetDriverClass(v string) *OcrInfo {
	s.DriverClass = &v
	return s
}

func (s *OcrInfo) SetDocNum(v string) *OcrInfo {
	s.DocNum = &v
	return s
}

func (s *OcrInfo) SetIssueTime(v string) *OcrInfo {
	s.IssueTime = &v
	return s
}

func (s *OcrInfo) SetCurrentTime(v string) *OcrInfo {
	s.CurrentTime = &v
	return s
}

func (s *OcrInfo) SetBarCode(v string) *OcrInfo {
	s.BarCode = &v
	return s
}

func (s *OcrInfo) SetPoints(v string) *OcrInfo {
	s.Points = &v
	return s
}

func (s *OcrInfo) SetRemark(v string) *OcrInfo {
	s.Remark = &v
	return s
}

func (s *OcrInfo) SetStatus(v string) *OcrInfo {
	s.Status = &v
	return s
}

func (s *OcrInfo) SetVehicle(v string) *OcrInfo {
	s.Vehicle = &v
	return s
}

func (s *OcrInfo) SetModel(v string) *OcrInfo {
	s.Model = &v
	return s
}

func (s *OcrInfo) SetType(v string) *OcrInfo {
	s.Type = &v
	return s
}

func (s *OcrInfo) SetUseage(v string) *OcrInfo {
	s.Useage = &v
	return s
}

func (s *OcrInfo) SetEngNum(v string) *OcrInfo {
	s.EngNum = &v
	return s
}

func (s *OcrInfo) SetPlate(v string) *OcrInfo {
	s.Plate = &v
	return s
}

func (s *OcrInfo) SetInspecRecord(v string) *OcrInfo {
	s.InspecRecord = &v
	return s
}

func (s *OcrInfo) SetLoad(v string) *OcrInfo {
	s.Load = &v
	return s
}

func (s *OcrInfo) SetCurbMass(v string) *OcrInfo {
	s.CurbMass = &v
	return s
}

func (s *OcrInfo) SetOverallDimension(v string) *OcrInfo {
	s.OverallDimension = &v
	return s
}

func (s *OcrInfo) SetSeating(v string) *OcrInfo {
	s.Seating = &v
	return s
}

func (s *OcrInfo) SetGrossMass(v string) *OcrInfo {
	s.GrossMass = &v
	return s
}

func (s *OcrInfo) SetFuel(v string) *OcrInfo {
	s.Fuel = &v
	return s
}

func (s *OcrInfo) SetTractionMass(v string) *OcrInfo {
	s.TractionMass = &v
	return s
}

func (s *OcrInfo) SetChipNum(v string) *OcrInfo {
	s.ChipNum = &v
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

type QueryFacevrfServerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 实人认证唯一标识
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 认证材料（如人脸图像）的哈希
	MaterialHash *string `json:"material_hash,omitempty" xml:"material_hash,omitempty"`
	// 外部唯一标识。用于定位。
	// 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 场景ID
	SceneId *string `json:"scene_id,omitempty" xml:"scene_id,omitempty" require:"true"`
}

func (s QueryFacevrfServerRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFacevrfServerRequest) GoString() string {
	return s.String()
}

func (s *QueryFacevrfServerRequest) SetAuthToken(v string) *QueryFacevrfServerRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFacevrfServerRequest) SetProductInstanceId(v string) *QueryFacevrfServerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFacevrfServerRequest) SetCertifyId(v string) *QueryFacevrfServerRequest {
	s.CertifyId = &v
	return s
}

func (s *QueryFacevrfServerRequest) SetExternParam(v string) *QueryFacevrfServerRequest {
	s.ExternParam = &v
	return s
}

func (s *QueryFacevrfServerRequest) SetMaterialHash(v string) *QueryFacevrfServerRequest {
	s.MaterialHash = &v
	return s
}

func (s *QueryFacevrfServerRequest) SetOuterOrderNo(v string) *QueryFacevrfServerRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QueryFacevrfServerRequest) SetSceneId(v string) *QueryFacevrfServerRequest {
	s.SceneId = &v
	return s
}

type QueryFacevrfServerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证的主体信息，一般的认证场景返回为空
	IdentityInfo *string `json:"identity_info,omitempty" xml:"identity_info,omitempty"`
	// 认证主体附件信息，一般的认证场景都是返回空
	MaterialInfo *string `json:"material_info,omitempty" xml:"material_info,omitempty"`
	// 认证材料哈希是否匹配
	MaterialMatched *string `json:"material_matched,omitempty" xml:"material_matched,omitempty"`
	// 是否通过，通过为T，不通过为F
	Passed *string `json:"passed,omitempty" xml:"passed,omitempty"`
	// 业务失败原因
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty"`
}

func (s QueryFacevrfServerResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFacevrfServerResponse) GoString() string {
	return s.String()
}

func (s *QueryFacevrfServerResponse) SetReqMsgId(v string) *QueryFacevrfServerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFacevrfServerResponse) SetResultCode(v string) *QueryFacevrfServerResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFacevrfServerResponse) SetResultMsg(v string) *QueryFacevrfServerResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFacevrfServerResponse) SetIdentityInfo(v string) *QueryFacevrfServerResponse {
	s.IdentityInfo = &v
	return s
}

func (s *QueryFacevrfServerResponse) SetMaterialInfo(v string) *QueryFacevrfServerResponse {
	s.MaterialInfo = &v
	return s
}

func (s *QueryFacevrfServerResponse) SetMaterialMatched(v string) *QueryFacevrfServerResponse {
	s.MaterialMatched = &v
	return s
}

func (s *QueryFacevrfServerResponse) SetPassed(v string) *QueryFacevrfServerResponse {
	s.Passed = &v
	return s
}

func (s *QueryFacevrfServerResponse) SetReason(v string) *QueryFacevrfServerResponse {
	s.Reason = &v
	return s
}

type CreateFacevrfServerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 认证模式码
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty" require:"true"`
	// h5认证完成后，服务端回调此地址通知商户认证结果
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 真实姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// cert_name、cert_no两个字段的传入模式。0：明文1：密文
	EncType *string `json:"enc_type,omitempty" xml:"enc_type,omitempty"`
	// 证件类型，如身份证
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty"`
	// 预留扩展参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 自定义比对源人脸图像，base64编码格式
	FacialPictureRef *string `json:"facial_picture_ref,omitempty" xml:"facial_picture_ref,omitempty"`
	// 身份信息来源类型，如证件
	IdentityType *string `json:"identity_type,omitempty" xml:"identity_type,omitempty" require:"true"`
	// metainfo 环境参数，需要通过客户端 SDK 获取
	MetaInfo *string `json:"meta_info,omitempty" xml:"meta_info,omitempty"`
	// 外部唯一标识。用于定位。
	// 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 回跳地址
	ReturnUrl *string `json:"return_url,omitempty" xml:"return_url,omitempty"`
	// 场景ID
	SceneId *string `json:"scene_id,omitempty" xml:"scene_id,omitempty" require:"true"`
	// 商户自定义的用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户的IP
	UserIp *string `json:"user_ip,omitempty" xml:"user_ip,omitempty"`
	// 用户的手机号
	UserMobile *string `json:"user_mobile,omitempty" xml:"user_mobile,omitempty"`
	// callbackUrl回调时是否需要重试，默认false(不需要重试)
	CallbackNeedRetry *bool `json:"callback_need_retry,omitempty" xml:"callback_need_retry,omitempty"`
	// 活体检测的类型
	Model *string `json:"model,omitempty" xml:"model,omitempty"`
}

func (s CreateFacevrfServerRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateFacevrfServerRequest) GoString() string {
	return s.String()
}

func (s *CreateFacevrfServerRequest) SetAuthToken(v string) *CreateFacevrfServerRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetProductInstanceId(v string) *CreateFacevrfServerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetBizCode(v string) *CreateFacevrfServerRequest {
	s.BizCode = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetCallbackUrl(v string) *CreateFacevrfServerRequest {
	s.CallbackUrl = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetCertName(v string) *CreateFacevrfServerRequest {
	s.CertName = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetCertNo(v string) *CreateFacevrfServerRequest {
	s.CertNo = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetEncType(v string) *CreateFacevrfServerRequest {
	s.EncType = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetCertType(v string) *CreateFacevrfServerRequest {
	s.CertType = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetExternParam(v string) *CreateFacevrfServerRequest {
	s.ExternParam = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetFacialPictureRef(v string) *CreateFacevrfServerRequest {
	s.FacialPictureRef = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetIdentityType(v string) *CreateFacevrfServerRequest {
	s.IdentityType = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetMetaInfo(v string) *CreateFacevrfServerRequest {
	s.MetaInfo = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetOuterOrderNo(v string) *CreateFacevrfServerRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetReturnUrl(v string) *CreateFacevrfServerRequest {
	s.ReturnUrl = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetSceneId(v string) *CreateFacevrfServerRequest {
	s.SceneId = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetUserId(v string) *CreateFacevrfServerRequest {
	s.UserId = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetUserIp(v string) *CreateFacevrfServerRequest {
	s.UserIp = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetUserMobile(v string) *CreateFacevrfServerRequest {
	s.UserMobile = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetCallbackNeedRetry(v bool) *CreateFacevrfServerRequest {
	s.CallbackNeedRetry = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetModel(v string) *CreateFacevrfServerRequest {
	s.Model = &v
	return s
}

type CreateFacevrfServerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实人认证唯一标识
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 认证地址。只在特定场景返回。
	CertifyUrl *string `json:"certify_url,omitempty" xml:"certify_url,omitempty"`
}

func (s CreateFacevrfServerResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateFacevrfServerResponse) GoString() string {
	return s.String()
}

func (s *CreateFacevrfServerResponse) SetReqMsgId(v string) *CreateFacevrfServerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateFacevrfServerResponse) SetResultCode(v string) *CreateFacevrfServerResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateFacevrfServerResponse) SetResultMsg(v string) *CreateFacevrfServerResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateFacevrfServerResponse) SetCertifyId(v string) *CreateFacevrfServerResponse {
	s.CertifyId = &v
	return s
}

func (s *CreateFacevrfServerResponse) SetCertifyUrl(v string) *CreateFacevrfServerResponse {
	s.CertifyUrl = &v
	return s
}

type ExecFacevrfServerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 真实姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// cert_name、cert_no两个字段的传入模式0：明文1：密文
	EncType *string `json:"enc_type,omitempty" xml:"enc_type,omitempty"`
	// 证件类型，如身份证
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 预留扩展参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 自定义比对源人脸图像，base64编码格式
	FacialPictureRef *string `json:"facial_picture_ref,omitempty" xml:"facial_picture_ref,omitempty"`
	// 身份信息来源类型，如证件
	IdentityType *string `json:"identity_type,omitempty" xml:"identity_type,omitempty" require:"true"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 场景ID
	SceneId *string `json:"scene_id,omitempty" xml:"scene_id,omitempty" require:"true"`
	// 商户自定义的用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户的IP
	UserIp *string `json:"user_ip,omitempty" xml:"user_ip,omitempty"`
	// 用户的手机号（或其哈希值）
	UserMobile *string `json:"user_mobile,omitempty" xml:"user_mobile,omitempty"`
	// 待认证的人脸图像，base64编码格式
	FacialPictureAuth *string `json:"facial_picture_auth,omitempty" xml:"facial_picture_auth,omitempty" require:"true"`
}

func (s ExecFacevrfServerRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecFacevrfServerRequest) GoString() string {
	return s.String()
}

func (s *ExecFacevrfServerRequest) SetAuthToken(v string) *ExecFacevrfServerRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetProductInstanceId(v string) *ExecFacevrfServerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetCertName(v string) *ExecFacevrfServerRequest {
	s.CertName = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetCertNo(v string) *ExecFacevrfServerRequest {
	s.CertNo = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetEncType(v string) *ExecFacevrfServerRequest {
	s.EncType = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetCertType(v string) *ExecFacevrfServerRequest {
	s.CertType = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetExternParam(v string) *ExecFacevrfServerRequest {
	s.ExternParam = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetFacialPictureRef(v string) *ExecFacevrfServerRequest {
	s.FacialPictureRef = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetIdentityType(v string) *ExecFacevrfServerRequest {
	s.IdentityType = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetOuterOrderNo(v string) *ExecFacevrfServerRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetSceneId(v string) *ExecFacevrfServerRequest {
	s.SceneId = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetUserId(v string) *ExecFacevrfServerRequest {
	s.UserId = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetUserIp(v string) *ExecFacevrfServerRequest {
	s.UserIp = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetUserMobile(v string) *ExecFacevrfServerRequest {
	s.UserMobile = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetFacialPictureAuth(v string) *ExecFacevrfServerRequest {
	s.FacialPictureAuth = &v
	return s
}

type ExecFacevrfServerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证ID
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 是否通过，通过为T，不通过为F
	Passed *string `json:"passed,omitempty" xml:"passed,omitempty"`
	// 业务失败原因
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty"`
	// 认证主体附件信息，包含共计类型等
	MaterialInfo *string `json:"material_info,omitempty" xml:"material_info,omitempty"`
}

func (s ExecFacevrfServerResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecFacevrfServerResponse) GoString() string {
	return s.String()
}

func (s *ExecFacevrfServerResponse) SetReqMsgId(v string) *ExecFacevrfServerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecFacevrfServerResponse) SetResultCode(v string) *ExecFacevrfServerResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecFacevrfServerResponse) SetResultMsg(v string) *ExecFacevrfServerResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecFacevrfServerResponse) SetCertifyId(v string) *ExecFacevrfServerResponse {
	s.CertifyId = &v
	return s
}

func (s *ExecFacevrfServerResponse) SetPassed(v string) *ExecFacevrfServerResponse {
	s.Passed = &v
	return s
}

func (s *ExecFacevrfServerResponse) SetReason(v string) *ExecFacevrfServerResponse {
	s.Reason = &v
	return s
}

func (s *ExecFacevrfServerResponse) SetMaterialInfo(v string) *ExecFacevrfServerResponse {
	s.MaterialInfo = &v
	return s
}

type GetFacevrfEvidenceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 某次刷脸的certifyId
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
}

func (s GetFacevrfEvidenceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetFacevrfEvidenceRequest) GoString() string {
	return s.String()
}

func (s *GetFacevrfEvidenceRequest) SetAuthToken(v string) *GetFacevrfEvidenceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetFacevrfEvidenceRequest) SetProductInstanceId(v string) *GetFacevrfEvidenceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetFacevrfEvidenceRequest) SetCertifyId(v string) *GetFacevrfEvidenceRequest {
	s.CertifyId = &v
	return s
}

type GetFacevrfEvidenceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 刷脸的certifyId，原样返回
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 统一证据ID，非SUCCESS状态为null，可在控制台中持统一证据ID验证pdf文件的正确性，法院方也可用此统一证据ID在司法链控制台进行核验pdf文件的正确性。
	OnchainId *string `json:"onchain_id,omitempty" xml:"onchain_id,omitempty"`
	// 上链状态，`SUCCESS`表示成功、`INIT`表示正在上链
	OnchainStatus *string `json:"onchain_status,omitempty" xml:"onchain_status,omitempty"`
	// pdf存证是否已经过期，不支持超过6个月的存证获取
	PdfExpired *bool `json:"pdf_expired,omitempty" xml:"pdf_expired,omitempty"`
	// 存证pdf文件内容的base64
	PdfContent *string `json:"pdf_content,omitempty" xml:"pdf_content,omitempty"`
}

func (s GetFacevrfEvidenceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetFacevrfEvidenceResponse) GoString() string {
	return s.String()
}

func (s *GetFacevrfEvidenceResponse) SetReqMsgId(v string) *GetFacevrfEvidenceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetFacevrfEvidenceResponse) SetResultCode(v string) *GetFacevrfEvidenceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetFacevrfEvidenceResponse) SetResultMsg(v string) *GetFacevrfEvidenceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetFacevrfEvidenceResponse) SetCertifyId(v string) *GetFacevrfEvidenceResponse {
	s.CertifyId = &v
	return s
}

func (s *GetFacevrfEvidenceResponse) SetOnchainId(v string) *GetFacevrfEvidenceResponse {
	s.OnchainId = &v
	return s
}

func (s *GetFacevrfEvidenceResponse) SetOnchainStatus(v string) *GetFacevrfEvidenceResponse {
	s.OnchainStatus = &v
	return s
}

func (s *GetFacevrfEvidenceResponse) SetPdfExpired(v bool) *GetFacevrfEvidenceResponse {
	s.PdfExpired = &v
	return s
}

func (s *GetFacevrfEvidenceResponse) SetPdfContent(v string) *GetFacevrfEvidenceResponse {
	s.PdfContent = &v
	return s
}

type CheckIndividualidTwometaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 身份证号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// map结果的json数据格式，预留字段
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s CheckIndividualidTwometaRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckIndividualidTwometaRequest) GoString() string {
	return s.String()
}

func (s *CheckIndividualidTwometaRequest) SetAuthToken(v string) *CheckIndividualidTwometaRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckIndividualidTwometaRequest) SetProductInstanceId(v string) *CheckIndividualidTwometaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckIndividualidTwometaRequest) SetOuterOrderNo(v string) *CheckIndividualidTwometaRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CheckIndividualidTwometaRequest) SetCertName(v string) *CheckIndividualidTwometaRequest {
	s.CertName = &v
	return s
}

func (s *CheckIndividualidTwometaRequest) SetCertNo(v string) *CheckIndividualidTwometaRequest {
	s.CertNo = &v
	return s
}

func (s *CheckIndividualidTwometaRequest) SetExternParam(v string) *CheckIndividualidTwometaRequest {
	s.ExternParam = &v
	return s
}

type CheckIndividualidTwometaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// true:匹配成功  false：匹配失败
	Match *string `json:"match,omitempty" xml:"match,omitempty"`
	// 扩展信息，预留字段
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s CheckIndividualidTwometaResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckIndividualidTwometaResponse) GoString() string {
	return s.String()
}

func (s *CheckIndividualidTwometaResponse) SetReqMsgId(v string) *CheckIndividualidTwometaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckIndividualidTwometaResponse) SetResultCode(v string) *CheckIndividualidTwometaResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckIndividualidTwometaResponse) SetResultMsg(v string) *CheckIndividualidTwometaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckIndividualidTwometaResponse) SetMatch(v string) *CheckIndividualidTwometaResponse {
	s.Match = &v
	return s
}

func (s *CheckIndividualidTwometaResponse) SetExternInfo(v string) *CheckIndividualidTwometaResponse {
	s.ExternInfo = &v
	return s
}

type CheckIndividualidThreemetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 身份证号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// map结果的json数据格式，预留字段
	//
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s CheckIndividualidThreemetaRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckIndividualidThreemetaRequest) GoString() string {
	return s.String()
}

func (s *CheckIndividualidThreemetaRequest) SetAuthToken(v string) *CheckIndividualidThreemetaRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckIndividualidThreemetaRequest) SetProductInstanceId(v string) *CheckIndividualidThreemetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckIndividualidThreemetaRequest) SetOuterOrderNo(v string) *CheckIndividualidThreemetaRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CheckIndividualidThreemetaRequest) SetCertName(v string) *CheckIndividualidThreemetaRequest {
	s.CertName = &v
	return s
}

func (s *CheckIndividualidThreemetaRequest) SetCertNo(v string) *CheckIndividualidThreemetaRequest {
	s.CertNo = &v
	return s
}

func (s *CheckIndividualidThreemetaRequest) SetMobile(v string) *CheckIndividualidThreemetaRequest {
	s.Mobile = &v
	return s
}

func (s *CheckIndividualidThreemetaRequest) SetExternParam(v string) *CheckIndividualidThreemetaRequest {
	s.ExternParam = &v
	return s
}

type CheckIndividualidThreemetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// true:匹配成功 false：匹配失败
	Match *string `json:"match,omitempty" xml:"match,omitempty"`
	// 扩展信息，预留字段
	//
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s CheckIndividualidThreemetaResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckIndividualidThreemetaResponse) GoString() string {
	return s.String()
}

func (s *CheckIndividualidThreemetaResponse) SetReqMsgId(v string) *CheckIndividualidThreemetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckIndividualidThreemetaResponse) SetResultCode(v string) *CheckIndividualidThreemetaResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckIndividualidThreemetaResponse) SetResultMsg(v string) *CheckIndividualidThreemetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckIndividualidThreemetaResponse) SetMatch(v string) *CheckIndividualidThreemetaResponse {
	s.Match = &v
	return s
}

func (s *CheckIndividualidThreemetaResponse) SetExternInfo(v string) *CheckIndividualidThreemetaResponse {
	s.ExternInfo = &v
	return s
}

type CheckIndividualidFourmetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 姓名
	//
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 身份证号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 银行卡号
	BankCard *string `json:"bank_card,omitempty" xml:"bank_card,omitempty" require:"true"`
	// map结果的json数据格式，预留字段
	//
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 证件类型： 1：居民身份证（默认值） 2：军官证 3：护照 4：回乡证 5：台胞证 6：警官证 7：士兵证 99：其他
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty"`
}

func (s CheckIndividualidFourmetaRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckIndividualidFourmetaRequest) GoString() string {
	return s.String()
}

func (s *CheckIndividualidFourmetaRequest) SetAuthToken(v string) *CheckIndividualidFourmetaRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckIndividualidFourmetaRequest) SetProductInstanceId(v string) *CheckIndividualidFourmetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckIndividualidFourmetaRequest) SetOuterOrderNo(v string) *CheckIndividualidFourmetaRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CheckIndividualidFourmetaRequest) SetCertName(v string) *CheckIndividualidFourmetaRequest {
	s.CertName = &v
	return s
}

func (s *CheckIndividualidFourmetaRequest) SetCertNo(v string) *CheckIndividualidFourmetaRequest {
	s.CertNo = &v
	return s
}

func (s *CheckIndividualidFourmetaRequest) SetMobile(v string) *CheckIndividualidFourmetaRequest {
	s.Mobile = &v
	return s
}

func (s *CheckIndividualidFourmetaRequest) SetBankCard(v string) *CheckIndividualidFourmetaRequest {
	s.BankCard = &v
	return s
}

func (s *CheckIndividualidFourmetaRequest) SetExternParam(v string) *CheckIndividualidFourmetaRequest {
	s.ExternParam = &v
	return s
}

func (s *CheckIndividualidFourmetaRequest) SetCertType(v string) *CheckIndividualidFourmetaRequest {
	s.CertType = &v
	return s
}

type CheckIndividualidFourmetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// true:匹配成功 false：匹配失败
	//
	Match *string `json:"match,omitempty" xml:"match,omitempty"`
	// 扩展信息，预留字段
	//
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s CheckIndividualidFourmetaResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckIndividualidFourmetaResponse) GoString() string {
	return s.String()
}

func (s *CheckIndividualidFourmetaResponse) SetReqMsgId(v string) *CheckIndividualidFourmetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckIndividualidFourmetaResponse) SetResultCode(v string) *CheckIndividualidFourmetaResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckIndividualidFourmetaResponse) SetResultMsg(v string) *CheckIndividualidFourmetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckIndividualidFourmetaResponse) SetMatch(v string) *CheckIndividualidFourmetaResponse {
	s.Match = &v
	return s
}

func (s *CheckIndividualidFourmetaResponse) SetExternInfo(v string) *CheckIndividualidFourmetaResponse {
	s.ExternInfo = &v
	return s
}

type CheckRouteThreemetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 使用场景
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 三要素的加密方式，NONE/MD5/SHA256
	ReqEncType *string `json:"req_enc_type,omitempty" xml:"req_enc_type,omitempty"`
	// map结果的json数据格式，预留字段
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s CheckRouteThreemetaRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckRouteThreemetaRequest) GoString() string {
	return s.String()
}

func (s *CheckRouteThreemetaRequest) SetAuthToken(v string) *CheckRouteThreemetaRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckRouteThreemetaRequest) SetProductInstanceId(v string) *CheckRouteThreemetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckRouteThreemetaRequest) SetOuterOrderNo(v string) *CheckRouteThreemetaRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CheckRouteThreemetaRequest) SetCertName(v string) *CheckRouteThreemetaRequest {
	s.CertName = &v
	return s
}

func (s *CheckRouteThreemetaRequest) SetCertNo(v string) *CheckRouteThreemetaRequest {
	s.CertNo = &v
	return s
}

func (s *CheckRouteThreemetaRequest) SetMobile(v string) *CheckRouteThreemetaRequest {
	s.Mobile = &v
	return s
}

func (s *CheckRouteThreemetaRequest) SetScene(v string) *CheckRouteThreemetaRequest {
	s.Scene = &v
	return s
}

func (s *CheckRouteThreemetaRequest) SetReqEncType(v string) *CheckRouteThreemetaRequest {
	s.ReqEncType = &v
	return s
}

func (s *CheckRouteThreemetaRequest) SetExternParam(v string) *CheckRouteThreemetaRequest {
	s.ExternParam = &v
	return s
}

type CheckRouteThreemetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// true:匹配成功 false：匹配失败
	Match *string `json:"match,omitempty" xml:"match,omitempty"`
	// CHINA_TELECOM：中国电信
	// CHINA_MOBILE：中国移动
	// CHINA_UNICOM：中国联通
	Carrier *string `json:"carrier,omitempty" xml:"carrier,omitempty"`
	// 扩展信息，预留字段
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s CheckRouteThreemetaResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckRouteThreemetaResponse) GoString() string {
	return s.String()
}

func (s *CheckRouteThreemetaResponse) SetReqMsgId(v string) *CheckRouteThreemetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckRouteThreemetaResponse) SetResultCode(v string) *CheckRouteThreemetaResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckRouteThreemetaResponse) SetResultMsg(v string) *CheckRouteThreemetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckRouteThreemetaResponse) SetMatch(v string) *CheckRouteThreemetaResponse {
	s.Match = &v
	return s
}

func (s *CheckRouteThreemetaResponse) SetCarrier(v string) *CheckRouteThreemetaResponse {
	s.Carrier = &v
	return s
}

func (s *CheckRouteThreemetaResponse) SetExternInfo(v string) *CheckRouteThreemetaResponse {
	s.ExternInfo = &v
	return s
}

type CreateVoiceprintServermodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 商户自定义的用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 音频文件流
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 音频元数据
	AudioMeta *AudioMeta `json:"audio_meta,omitempty" xml:"audio_meta,omitempty" require:"true"`
	// 音频文件集合
	Audios []*Audio `json:"audios,omitempty" xml:"audios,omitempty" require:"true" type:"Repeated"`
	// 预留扩展参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s CreateVoiceprintServermodeRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateVoiceprintServermodeRequest) GoString() string {
	return s.String()
}

func (s *CreateVoiceprintServermodeRequest) SetAuthToken(v string) *CreateVoiceprintServermodeRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateVoiceprintServermodeRequest) SetProductInstanceId(v string) *CreateVoiceprintServermodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateVoiceprintServermodeRequest) SetOuterOrderNo(v string) *CreateVoiceprintServermodeRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CreateVoiceprintServermodeRequest) SetUserId(v string) *CreateVoiceprintServermodeRequest {
	s.UserId = &v
	return s
}

func (s *CreateVoiceprintServermodeRequest) SetFileObject(v io.Reader) *CreateVoiceprintServermodeRequest {
	s.FileObject = v
	return s
}

func (s *CreateVoiceprintServermodeRequest) SetFileObjectName(v string) *CreateVoiceprintServermodeRequest {
	s.FileObjectName = &v
	return s
}

func (s *CreateVoiceprintServermodeRequest) SetFileId(v string) *CreateVoiceprintServermodeRequest {
	s.FileId = &v
	return s
}

func (s *CreateVoiceprintServermodeRequest) SetAudioMeta(v *AudioMeta) *CreateVoiceprintServermodeRequest {
	s.AudioMeta = v
	return s
}

func (s *CreateVoiceprintServermodeRequest) SetAudios(v []*Audio) *CreateVoiceprintServermodeRequest {
	s.Audios = v
	return s
}

func (s *CreateVoiceprintServermodeRequest) SetExternParam(v string) *CreateVoiceprintServermodeRequest {
	s.ExternParam = &v
	return s
}

type CreateVoiceprintServermodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 扩展信息，预留字段
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// 产品结果明细，不影响决策
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// result_code_sub对应的文案
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
}

func (s CreateVoiceprintServermodeResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateVoiceprintServermodeResponse) GoString() string {
	return s.String()
}

func (s *CreateVoiceprintServermodeResponse) SetReqMsgId(v string) *CreateVoiceprintServermodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateVoiceprintServermodeResponse) SetResultCode(v string) *CreateVoiceprintServermodeResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateVoiceprintServermodeResponse) SetResultMsg(v string) *CreateVoiceprintServermodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateVoiceprintServermodeResponse) SetExternInfo(v string) *CreateVoiceprintServermodeResponse {
	s.ExternInfo = &v
	return s
}

func (s *CreateVoiceprintServermodeResponse) SetResultCodeSub(v string) *CreateVoiceprintServermodeResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *CreateVoiceprintServermodeResponse) SetResultMsgSub(v string) *CreateVoiceprintServermodeResponse {
	s.ResultMsgSub = &v
	return s
}

type VerifyVoiceprintServermodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 商户自定义的用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 音频文件，base64编码格式
	//
	AudioAuth *string `json:"audio_auth,omitempty" xml:"audio_auth,omitempty"`
	// 音频文件OSS地址
	AudioUrl *string `json:"audio_url,omitempty" xml:"audio_url,omitempty"`
	// 音频元数据
	AudioMeta *AudioMeta `json:"audio_meta,omitempty" xml:"audio_meta,omitempty" require:"true"`
	// 预留扩展参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s VerifyVoiceprintServermodeRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyVoiceprintServermodeRequest) GoString() string {
	return s.String()
}

func (s *VerifyVoiceprintServermodeRequest) SetAuthToken(v string) *VerifyVoiceprintServermodeRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyVoiceprintServermodeRequest) SetProductInstanceId(v string) *VerifyVoiceprintServermodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyVoiceprintServermodeRequest) SetOuterOrderNo(v string) *VerifyVoiceprintServermodeRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *VerifyVoiceprintServermodeRequest) SetUserId(v string) *VerifyVoiceprintServermodeRequest {
	s.UserId = &v
	return s
}

func (s *VerifyVoiceprintServermodeRequest) SetAudioAuth(v string) *VerifyVoiceprintServermodeRequest {
	s.AudioAuth = &v
	return s
}

func (s *VerifyVoiceprintServermodeRequest) SetAudioUrl(v string) *VerifyVoiceprintServermodeRequest {
	s.AudioUrl = &v
	return s
}

func (s *VerifyVoiceprintServermodeRequest) SetAudioMeta(v *AudioMeta) *VerifyVoiceprintServermodeRequest {
	s.AudioMeta = v
	return s
}

func (s *VerifyVoiceprintServermodeRequest) SetExternParam(v string) *VerifyVoiceprintServermodeRequest {
	s.ExternParam = &v
	return s
}

type VerifyVoiceprintServermodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 声纹认证唯一ID
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 扩展信息，预留字段
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// 产品结果明细，不影响决策
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// result_code_sub对应的文案
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
}

func (s VerifyVoiceprintServermodeResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyVoiceprintServermodeResponse) GoString() string {
	return s.String()
}

func (s *VerifyVoiceprintServermodeResponse) SetReqMsgId(v string) *VerifyVoiceprintServermodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyVoiceprintServermodeResponse) SetResultCode(v string) *VerifyVoiceprintServermodeResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyVoiceprintServermodeResponse) SetResultMsg(v string) *VerifyVoiceprintServermodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyVoiceprintServermodeResponse) SetCertifyId(v string) *VerifyVoiceprintServermodeResponse {
	s.CertifyId = &v
	return s
}

func (s *VerifyVoiceprintServermodeResponse) SetExternInfo(v string) *VerifyVoiceprintServermodeResponse {
	s.ExternInfo = &v
	return s
}

func (s *VerifyVoiceprintServermodeResponse) SetResultCodeSub(v string) *VerifyVoiceprintServermodeResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *VerifyVoiceprintServermodeResponse) SetResultMsgSub(v string) *VerifyVoiceprintServermodeResponse {
	s.ResultMsgSub = &v
	return s
}

type CheckRouteTwometaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 使用场景（不再使用）
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty"`
	// map结果的json数据格式，预留字段
	//
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s CheckRouteTwometaRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckRouteTwometaRequest) GoString() string {
	return s.String()
}

func (s *CheckRouteTwometaRequest) SetAuthToken(v string) *CheckRouteTwometaRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckRouteTwometaRequest) SetProductInstanceId(v string) *CheckRouteTwometaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckRouteTwometaRequest) SetOuterOrderNo(v string) *CheckRouteTwometaRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CheckRouteTwometaRequest) SetCertName(v string) *CheckRouteTwometaRequest {
	s.CertName = &v
	return s
}

func (s *CheckRouteTwometaRequest) SetCertNo(v string) *CheckRouteTwometaRequest {
	s.CertNo = &v
	return s
}

func (s *CheckRouteTwometaRequest) SetScene(v string) *CheckRouteTwometaRequest {
	s.Scene = &v
	return s
}

func (s *CheckRouteTwometaRequest) SetExternParam(v string) *CheckRouteTwometaRequest {
	s.ExternParam = &v
	return s
}

type CheckRouteTwometaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// true:匹配成功 false：匹配失败
	//
	Match *string `json:"match,omitempty" xml:"match,omitempty"`
	// 扩展信息，预留字段
	//
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s CheckRouteTwometaResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckRouteTwometaResponse) GoString() string {
	return s.String()
}

func (s *CheckRouteTwometaResponse) SetReqMsgId(v string) *CheckRouteTwometaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckRouteTwometaResponse) SetResultCode(v string) *CheckRouteTwometaResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckRouteTwometaResponse) SetResultMsg(v string) *CheckRouteTwometaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckRouteTwometaResponse) SetMatch(v string) *CheckRouteTwometaResponse {
	s.Match = &v
	return s
}

func (s *CheckRouteTwometaResponse) SetExternInfo(v string) *CheckRouteTwometaResponse {
	s.ExternInfo = &v
	return s
}

type QueryMobileRiskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 设备身份临时标识
	ApdidToken *string `json:"apdid_token,omitempty" xml:"apdid_token,omitempty" require:"true"`
	// 接口使用场景，不同场景下接口返回字段集合会有差异，可缺省
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty"`
}

func (s QueryMobileRiskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMobileRiskRequest) GoString() string {
	return s.String()
}

func (s *QueryMobileRiskRequest) SetAuthToken(v string) *QueryMobileRiskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMobileRiskRequest) SetProductInstanceId(v string) *QueryMobileRiskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMobileRiskRequest) SetOuterOrderNo(v string) *QueryMobileRiskRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QueryMobileRiskRequest) SetApdidToken(v string) *QueryMobileRiskRequest {
	s.ApdidToken = &v
	return s
}

func (s *QueryMobileRiskRequest) SetScene(v string) *QueryMobileRiskRequest {
	s.Scene = &v
	return s
}

type QueryMobileRiskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 设备相关数据，默认只返回apdid，由Map<String,String>序列化
	DeviceInfo *string `json:"device_info,omitempty" xml:"device_info,omitempty"`
	// 设备风险标签，由Map<String,String>序列化
	RiskInfo *string `json:"risk_info,omitempty" xml:"risk_info,omitempty"`
}

func (s QueryMobileRiskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMobileRiskResponse) GoString() string {
	return s.String()
}

func (s *QueryMobileRiskResponse) SetReqMsgId(v string) *QueryMobileRiskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMobileRiskResponse) SetResultCode(v string) *QueryMobileRiskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMobileRiskResponse) SetResultMsg(v string) *QueryMobileRiskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMobileRiskResponse) SetDeviceInfo(v string) *QueryMobileRiskResponse {
	s.DeviceInfo = &v
	return s
}

func (s *QueryMobileRiskResponse) SetRiskInfo(v string) *QueryMobileRiskResponse {
	s.RiskInfo = &v
	return s
}

type DetailFacevrfServerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 实人认证唯一标识
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s DetailFacevrfServerRequest) String() string {
	return tea.Prettify(s)
}

func (s DetailFacevrfServerRequest) GoString() string {
	return s.String()
}

func (s *DetailFacevrfServerRequest) SetAuthToken(v string) *DetailFacevrfServerRequest {
	s.AuthToken = &v
	return s
}

func (s *DetailFacevrfServerRequest) SetProductInstanceId(v string) *DetailFacevrfServerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DetailFacevrfServerRequest) SetCertifyId(v string) *DetailFacevrfServerRequest {
	s.CertifyId = &v
	return s
}

func (s *DetailFacevrfServerRequest) SetExternParam(v string) *DetailFacevrfServerRequest {
	s.ExternParam = &v
	return s
}

type DetailFacevrfServerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// PASS：认证通过
	// FAIL：认证不通过
	// NO_RECODE：无认证记录
	// PROCESSING：认证中
	State *string `json:"state,omitempty" xml:"state,omitempty"`
	// 认证人信息，包括姓名和身份证号，不加密
	// state为PASS/FAIL/PROCESSING时为JSON字符串，为NO_RECORD时为空
	IdentityInfo *string `json:"identity_info,omitempty" xml:"identity_info,omitempty"`
	// 预留扩展结果
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s DetailFacevrfServerResponse) String() string {
	return tea.Prettify(s)
}

func (s DetailFacevrfServerResponse) GoString() string {
	return s.String()
}

func (s *DetailFacevrfServerResponse) SetReqMsgId(v string) *DetailFacevrfServerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DetailFacevrfServerResponse) SetResultCode(v string) *DetailFacevrfServerResponse {
	s.ResultCode = &v
	return s
}

func (s *DetailFacevrfServerResponse) SetResultMsg(v string) *DetailFacevrfServerResponse {
	s.ResultMsg = &v
	return s
}

func (s *DetailFacevrfServerResponse) SetState(v string) *DetailFacevrfServerResponse {
	s.State = &v
	return s
}

func (s *DetailFacevrfServerResponse) SetIdentityInfo(v string) *DetailFacevrfServerResponse {
	s.IdentityInfo = &v
	return s
}

func (s *DetailFacevrfServerResponse) SetExternInfo(v string) *DetailFacevrfServerResponse {
	s.ExternInfo = &v
	return s
}

type CheckAnticheatPersonalRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部请求id
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 主体姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 主体身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 受雇企业
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" require:"true"`
	// 组织机构代码
	CompanyNo *string `json:"company_no,omitempty" xml:"company_no,omitempty"`
	// 扩展字段，json格式
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s CheckAnticheatPersonalRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckAnticheatPersonalRequest) GoString() string {
	return s.String()
}

func (s *CheckAnticheatPersonalRequest) SetAuthToken(v string) *CheckAnticheatPersonalRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckAnticheatPersonalRequest) SetProductInstanceId(v string) *CheckAnticheatPersonalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckAnticheatPersonalRequest) SetOuterOrderNo(v string) *CheckAnticheatPersonalRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CheckAnticheatPersonalRequest) SetCertName(v string) *CheckAnticheatPersonalRequest {
	s.CertName = &v
	return s
}

func (s *CheckAnticheatPersonalRequest) SetCertNo(v string) *CheckAnticheatPersonalRequest {
	s.CertNo = &v
	return s
}

func (s *CheckAnticheatPersonalRequest) SetCompanyName(v string) *CheckAnticheatPersonalRequest {
	s.CompanyName = &v
	return s
}

func (s *CheckAnticheatPersonalRequest) SetCompanyNo(v string) *CheckAnticheatPersonalRequest {
	s.CompanyNo = &v
	return s
}

func (s *CheckAnticheatPersonalRequest) SetExternParam(v string) *CheckAnticheatPersonalRequest {
	s.ExternParam = &v
	return s
}

type CheckAnticheatPersonalResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险等级
	RiskLevel *string `json:"risk_level,omitempty" xml:"risk_level,omitempty"`
	// 风险等级文字描述
	RiskLevelDesc *string `json:"risk_level_desc,omitempty" xml:"risk_level_desc,omitempty"`
	// 扩展信息
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s CheckAnticheatPersonalResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckAnticheatPersonalResponse) GoString() string {
	return s.String()
}

func (s *CheckAnticheatPersonalResponse) SetReqMsgId(v string) *CheckAnticheatPersonalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckAnticheatPersonalResponse) SetResultCode(v string) *CheckAnticheatPersonalResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckAnticheatPersonalResponse) SetResultMsg(v string) *CheckAnticheatPersonalResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckAnticheatPersonalResponse) SetRiskLevel(v string) *CheckAnticheatPersonalResponse {
	s.RiskLevel = &v
	return s
}

func (s *CheckAnticheatPersonalResponse) SetRiskLevelDesc(v string) *CheckAnticheatPersonalResponse {
	s.RiskLevelDesc = &v
	return s
}

func (s *CheckAnticheatPersonalResponse) SetExternInfo(v string) *CheckAnticheatPersonalResponse {
	s.ExternInfo = &v
	return s
}

type CheckTwometaHashRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// hash后的身份证号，不区分大小写，使用的hash算法参考hash_type字段
	CertNoHash *string `json:"cert_no_hash,omitempty" xml:"cert_no_hash,omitempty" require:"true"`
	// hash后的姓名，不区分大小写，使用的hash类型参考hash_type
	CertNameHash *string `json:"cert_name_hash,omitempty" xml:"cert_name_hash,omitempty" require:"true"`
	// 本次核验id
	OuterOrderId *string `json:"outer_order_id,omitempty" xml:"outer_order_id,omitempty" require:"true"`
	// 支持的hash类型
	HashType *string `json:"hash_type,omitempty" xml:"hash_type,omitempty" require:"true"`
	// json格式的扩展字段
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s CheckTwometaHashRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckTwometaHashRequest) GoString() string {
	return s.String()
}

func (s *CheckTwometaHashRequest) SetAuthToken(v string) *CheckTwometaHashRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckTwometaHashRequest) SetProductInstanceId(v string) *CheckTwometaHashRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckTwometaHashRequest) SetCertNoHash(v string) *CheckTwometaHashRequest {
	s.CertNoHash = &v
	return s
}

func (s *CheckTwometaHashRequest) SetCertNameHash(v string) *CheckTwometaHashRequest {
	s.CertNameHash = &v
	return s
}

func (s *CheckTwometaHashRequest) SetOuterOrderId(v string) *CheckTwometaHashRequest {
	s.OuterOrderId = &v
	return s
}

func (s *CheckTwometaHashRequest) SetHashType(v string) *CheckTwometaHashRequest {
	s.HashType = &v
	return s
}

func (s *CheckTwometaHashRequest) SetExternInfo(v string) *CheckTwometaHashRequest {
	s.ExternInfo = &v
	return s
}

type CheckTwometaHashResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CheckTwometaHashResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckTwometaHashResponse) GoString() string {
	return s.String()
}

func (s *CheckTwometaHashResponse) SetReqMsgId(v string) *CheckTwometaHashResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckTwometaHashResponse) SetResultCode(v string) *CheckTwometaHashResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckTwometaHashResponse) SetResultMsg(v string) *CheckTwometaHashResponse {
	s.ResultMsg = &v
	return s
}

type QueryThreemetaOnlinetimeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部请求id
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 手机号码
	PhoneNo *string `json:"phone_no,omitempty" xml:"phone_no,omitempty" require:"true"`
	// 是否区分运营商
	DivCarrier *bool `json:"div_carrier,omitempty" xml:"div_carrier,omitempty"`
	// 运营商类型
	Carrier *string `json:"carrier,omitempty" xml:"carrier,omitempty"`
	// 加密类型，填写时「支持加密」字段需要对应加密后赋值。默认使用明文模式
	// 0：明文
	// 1：MD5
	EncryptType *string `json:"encrypt_type,omitempty" xml:"encrypt_type,omitempty"`
	// 扩展参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s QueryThreemetaOnlinetimeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryThreemetaOnlinetimeRequest) GoString() string {
	return s.String()
}

func (s *QueryThreemetaOnlinetimeRequest) SetAuthToken(v string) *QueryThreemetaOnlinetimeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryThreemetaOnlinetimeRequest) SetProductInstanceId(v string) *QueryThreemetaOnlinetimeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryThreemetaOnlinetimeRequest) SetOuterOrderNo(v string) *QueryThreemetaOnlinetimeRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QueryThreemetaOnlinetimeRequest) SetCertName(v string) *QueryThreemetaOnlinetimeRequest {
	s.CertName = &v
	return s
}

func (s *QueryThreemetaOnlinetimeRequest) SetCertNo(v string) *QueryThreemetaOnlinetimeRequest {
	s.CertNo = &v
	return s
}

func (s *QueryThreemetaOnlinetimeRequest) SetPhoneNo(v string) *QueryThreemetaOnlinetimeRequest {
	s.PhoneNo = &v
	return s
}

func (s *QueryThreemetaOnlinetimeRequest) SetDivCarrier(v bool) *QueryThreemetaOnlinetimeRequest {
	s.DivCarrier = &v
	return s
}

func (s *QueryThreemetaOnlinetimeRequest) SetCarrier(v string) *QueryThreemetaOnlinetimeRequest {
	s.Carrier = &v
	return s
}

func (s *QueryThreemetaOnlinetimeRequest) SetEncryptType(v string) *QueryThreemetaOnlinetimeRequest {
	s.EncryptType = &v
	return s
}

func (s *QueryThreemetaOnlinetimeRequest) SetExternParam(v string) *QueryThreemetaOnlinetimeRequest {
	s.ExternParam = &v
	return s
}

type QueryThreemetaOnlinetimeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 在网时长标准码，规则：
	// 1: [0,3)表示在⽹时⻓是 0~3 个⽉
	// 2: [3,6)表示在⽹时⻓是 3~6 个⽉
	// 3: [6,12)表示在⽹时⻓是 6~12 个⽉
	// 4: [12,24)表示在⽹时⻓是 12~24 ⽉
	// 5: [24,+)表示在⽹时⻓是 24个⽉及以上
	LengthCode *string `json:"length_code,omitempty" xml:"length_code,omitempty"`
	// CHINA_TELECOM：中国电信
	// CHINA_MOBILE：中国移动
	// CHINA_UNICOM：中国联通
	Carrier *string `json:"carrier,omitempty" xml:"carrier,omitempty"`
	// 扩展信息，json格式
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s QueryThreemetaOnlinetimeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryThreemetaOnlinetimeResponse) GoString() string {
	return s.String()
}

func (s *QueryThreemetaOnlinetimeResponse) SetReqMsgId(v string) *QueryThreemetaOnlinetimeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryThreemetaOnlinetimeResponse) SetResultCode(v string) *QueryThreemetaOnlinetimeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryThreemetaOnlinetimeResponse) SetResultMsg(v string) *QueryThreemetaOnlinetimeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryThreemetaOnlinetimeResponse) SetLengthCode(v string) *QueryThreemetaOnlinetimeResponse {
	s.LengthCode = &v
	return s
}

func (s *QueryThreemetaOnlinetimeResponse) SetCarrier(v string) *QueryThreemetaOnlinetimeResponse {
	s.Carrier = &v
	return s
}

func (s *QueryThreemetaOnlinetimeResponse) SetExternInfo(v string) *QueryThreemetaOnlinetimeResponse {
	s.ExternInfo = &v
	return s
}

type InitFacevrfZimRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务参数
	BizData *string `json:"biz_data,omitempty" xml:"biz_data,omitempty"`
	// 渠道
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty"`
	// 商户
	Merchant *string `json:"merchant,omitempty" xml:"merchant,omitempty"`
	// 环境参数
	MetaInfo *string `json:"meta_info,omitempty" xml:"meta_info,omitempty" require:"true"`
	// 产品节点
	ProduceNode *string `json:"produce_node,omitempty" xml:"produce_node,omitempty"`
	// 产品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty"`
	// 实人认证id
	//
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty" require:"true"`
	// 身份信息参数
	//
	ZimPrincipal *string `json:"zim_principal,omitempty" xml:"zim_principal,omitempty"`
}

func (s InitFacevrfZimRequest) String() string {
	return tea.Prettify(s)
}

func (s InitFacevrfZimRequest) GoString() string {
	return s.String()
}

func (s *InitFacevrfZimRequest) SetAuthToken(v string) *InitFacevrfZimRequest {
	s.AuthToken = &v
	return s
}

func (s *InitFacevrfZimRequest) SetProductInstanceId(v string) *InitFacevrfZimRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitFacevrfZimRequest) SetBizData(v string) *InitFacevrfZimRequest {
	s.BizData = &v
	return s
}

func (s *InitFacevrfZimRequest) SetChannel(v string) *InitFacevrfZimRequest {
	s.Channel = &v
	return s
}

func (s *InitFacevrfZimRequest) SetMerchant(v string) *InitFacevrfZimRequest {
	s.Merchant = &v
	return s
}

func (s *InitFacevrfZimRequest) SetMetaInfo(v string) *InitFacevrfZimRequest {
	s.MetaInfo = &v
	return s
}

func (s *InitFacevrfZimRequest) SetProduceNode(v string) *InitFacevrfZimRequest {
	s.ProduceNode = &v
	return s
}

func (s *InitFacevrfZimRequest) SetProductName(v string) *InitFacevrfZimRequest {
	s.ProductName = &v
	return s
}

func (s *InitFacevrfZimRequest) SetZimId(v string) *InitFacevrfZimRequest {
	s.ZimId = &v
	return s
}

func (s *InitFacevrfZimRequest) SetZimPrincipal(v string) *InitFacevrfZimRequest {
	s.ZimPrincipal = &v
	return s
}

type InitFacevrfZimResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
	//
	ExtParams *string `json:"ext_params,omitempty" xml:"ext_params,omitempty"`
	// 描述
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 协议
	Protocol *string `json:"protocol,omitempty" xml:"protocol,omitempty"`
	// 返回码
	RetCode *string `json:"ret_code,omitempty" xml:"ret_code,omitempty"`
	// 明细返回码
	RetCodeSub *string `json:"ret_code_sub,omitempty" xml:"ret_code_sub,omitempty"`
	// 明细返回码对应的文案
	RetMessageSub *string `json:"ret_message_sub,omitempty" xml:"ret_message_sub,omitempty"`
	// 实人认证id
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty"`
}

func (s InitFacevrfZimResponse) String() string {
	return tea.Prettify(s)
}

func (s InitFacevrfZimResponse) GoString() string {
	return s.String()
}

func (s *InitFacevrfZimResponse) SetReqMsgId(v string) *InitFacevrfZimResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitFacevrfZimResponse) SetResultCode(v string) *InitFacevrfZimResponse {
	s.ResultCode = &v
	return s
}

func (s *InitFacevrfZimResponse) SetResultMsg(v string) *InitFacevrfZimResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitFacevrfZimResponse) SetExtParams(v string) *InitFacevrfZimResponse {
	s.ExtParams = &v
	return s
}

func (s *InitFacevrfZimResponse) SetMessage(v string) *InitFacevrfZimResponse {
	s.Message = &v
	return s
}

func (s *InitFacevrfZimResponse) SetProtocol(v string) *InitFacevrfZimResponse {
	s.Protocol = &v
	return s
}

func (s *InitFacevrfZimResponse) SetRetCode(v string) *InitFacevrfZimResponse {
	s.RetCode = &v
	return s
}

func (s *InitFacevrfZimResponse) SetRetCodeSub(v string) *InitFacevrfZimResponse {
	s.RetCodeSub = &v
	return s
}

func (s *InitFacevrfZimResponse) SetRetMessageSub(v string) *InitFacevrfZimResponse {
	s.RetMessageSub = &v
	return s
}

func (s *InitFacevrfZimResponse) SetZimId(v string) *InitFacevrfZimResponse {
	s.ZimId = &v
	return s
}

type VerifyFacevrfZimRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 扩展信息,Map的json格式
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 人脸业务参数
	ZimData *string `json:"zim_data,omitempty" xml:"zim_data,omitempty" require:"true"`
	// 7501f6c2dd57e06fe0d4202d3aaab58e
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty" require:"true"`
}

func (s VerifyFacevrfZimRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyFacevrfZimRequest) GoString() string {
	return s.String()
}

func (s *VerifyFacevrfZimRequest) SetAuthToken(v string) *VerifyFacevrfZimRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyFacevrfZimRequest) SetProductInstanceId(v string) *VerifyFacevrfZimRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyFacevrfZimRequest) SetExternParam(v string) *VerifyFacevrfZimRequest {
	s.ExternParam = &v
	return s
}

func (s *VerifyFacevrfZimRequest) SetZimData(v string) *VerifyFacevrfZimRequest {
	s.ZimData = &v
	return s
}

func (s *VerifyFacevrfZimRequest) SetZimId(v string) *VerifyFacevrfZimRequest {
	s.ZimId = &v
	return s
}

type VerifyFacevrfZimResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
	ExtParams *string `json:"ext_params,omitempty" xml:"ext_params,omitempty"`
	// ""
	HasNext *string `json:"has_next,omitempty" xml:"has_next,omitempty"`
	// ""
	NextProtocol *string `json:"next_protocol,omitempty" xml:"next_protocol,omitempty"`
	// 产品返回明细码
	ProductRetCode *string `json:"product_ret_code,omitempty" xml:"product_ret_code,omitempty"`
	// 明细返回码
	RetCodeSub *string `json:"ret_code_sub,omitempty" xml:"ret_code_sub,omitempty"`
	// 明细返回码对应的文案
	RetMessageSub *string `json:"ret_message_sub,omitempty" xml:"ret_message_sub,omitempty"`
	// 验证返回明细码
	ValidationRetCode *string `json:"validation_ret_code,omitempty" xml:"validation_ret_code,omitempty"`
}

func (s VerifyFacevrfZimResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyFacevrfZimResponse) GoString() string {
	return s.String()
}

func (s *VerifyFacevrfZimResponse) SetReqMsgId(v string) *VerifyFacevrfZimResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyFacevrfZimResponse) SetResultCode(v string) *VerifyFacevrfZimResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyFacevrfZimResponse) SetResultMsg(v string) *VerifyFacevrfZimResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyFacevrfZimResponse) SetExtParams(v string) *VerifyFacevrfZimResponse {
	s.ExtParams = &v
	return s
}

func (s *VerifyFacevrfZimResponse) SetHasNext(v string) *VerifyFacevrfZimResponse {
	s.HasNext = &v
	return s
}

func (s *VerifyFacevrfZimResponse) SetNextProtocol(v string) *VerifyFacevrfZimResponse {
	s.NextProtocol = &v
	return s
}

func (s *VerifyFacevrfZimResponse) SetProductRetCode(v string) *VerifyFacevrfZimResponse {
	s.ProductRetCode = &v
	return s
}

func (s *VerifyFacevrfZimResponse) SetRetCodeSub(v string) *VerifyFacevrfZimResponse {
	s.RetCodeSub = &v
	return s
}

func (s *VerifyFacevrfZimResponse) SetRetMessageSub(v string) *VerifyFacevrfZimResponse {
	s.RetMessageSub = &v
	return s
}

func (s *VerifyFacevrfZimResponse) SetValidationRetCode(v string) *VerifyFacevrfZimResponse {
	s.ValidationRetCode = &v
	return s
}

type RecognizeDocIndividualcardRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 长度不超过32位的0-9A-Za-z字符串。
	// 外部请求ID，由调用方自行生成并自行保证唯一，以便问题定位。
	OutOrderNo *string `json:"out_order_no,omitempty" xml:"out_order_no,omitempty" require:"true"`
	// 待识别的卡类型。取值约束：ID_CARD（身份证）;EEP_TO_ML_CARD（港澳来往大陆通行证）;BANK_CARD（银行卡）
	OcrType *string `json:"ocr_type,omitempty" xml:"ocr_type,omitempty" require:"true"`
	// 传入的图片是base64编码的图片还是图片的URL。取值约束：BASE64（类型为base64）；FILE(文件)、URL（暂不支持）
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty" require:"true"`
	// 传入的图片的具体内容，需要与data_type的选择保持一致。
	DataContent *string `json:"data_content,omitempty" xml:"data_content,omitempty"`
	// 证件图片
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 入参data_content是否经AES加密。不填默认不加密。取值约束：0（不加密）；1（加密）
	ReqEncType *string `json:"req_enc_type,omitempty" xml:"req_enc_type,omitempty"`
	// 出参ocr_info是否经AES加密。不填默认不加密。取值约束：0（不加密）；1（加密）
	RespEncType *string `json:"resp_enc_type,omitempty" xml:"resp_enc_type,omitempty"`
	// 经过公钥RSA加密的AES密钥，用于对出参ocr_info加密。当req_enc_type = 1或resp_enc_type = 1时必填。
	EncToken *string `json:"enc_token,omitempty" xml:"enc_token,omitempty"`
	// 是否启用防伪检测，如果启用，出参会输出riskInfo字段。不填默认不启用防伪。取值约束：0（不启用）；1（启用）
	RiskInfoType *string `json:"risk_info_type,omitempty" xml:"risk_info_type,omitempty"`
	// 是否返回身份证头像照片
	// 0：否
	// 1：是
	// 不填默认不返回。
	ReturnPhoto *string `json:"return_photo,omitempty" xml:"return_photo,omitempty"`
	// 是否返回身份证图片
	// 0：否
	// 1：是
	// 不填默认不返回。
	ReturnImage *string `json:"return_image,omitempty" xml:"return_image,omitempty"`
	// 扩展信息JSON串。
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s RecognizeDocIndividualcardRequest) String() string {
	return tea.Prettify(s)
}

func (s RecognizeDocIndividualcardRequest) GoString() string {
	return s.String()
}

func (s *RecognizeDocIndividualcardRequest) SetAuthToken(v string) *RecognizeDocIndividualcardRequest {
	s.AuthToken = &v
	return s
}

func (s *RecognizeDocIndividualcardRequest) SetProductInstanceId(v string) *RecognizeDocIndividualcardRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RecognizeDocIndividualcardRequest) SetOutOrderNo(v string) *RecognizeDocIndividualcardRequest {
	s.OutOrderNo = &v
	return s
}

func (s *RecognizeDocIndividualcardRequest) SetOcrType(v string) *RecognizeDocIndividualcardRequest {
	s.OcrType = &v
	return s
}

func (s *RecognizeDocIndividualcardRequest) SetDataType(v string) *RecognizeDocIndividualcardRequest {
	s.DataType = &v
	return s
}

func (s *RecognizeDocIndividualcardRequest) SetDataContent(v string) *RecognizeDocIndividualcardRequest {
	s.DataContent = &v
	return s
}

func (s *RecognizeDocIndividualcardRequest) SetFileObject(v io.Reader) *RecognizeDocIndividualcardRequest {
	s.FileObject = v
	return s
}

func (s *RecognizeDocIndividualcardRequest) SetFileObjectName(v string) *RecognizeDocIndividualcardRequest {
	s.FileObjectName = &v
	return s
}

func (s *RecognizeDocIndividualcardRequest) SetFileId(v string) *RecognizeDocIndividualcardRequest {
	s.FileId = &v
	return s
}

func (s *RecognizeDocIndividualcardRequest) SetReqEncType(v string) *RecognizeDocIndividualcardRequest {
	s.ReqEncType = &v
	return s
}

func (s *RecognizeDocIndividualcardRequest) SetRespEncType(v string) *RecognizeDocIndividualcardRequest {
	s.RespEncType = &v
	return s
}

func (s *RecognizeDocIndividualcardRequest) SetEncToken(v string) *RecognizeDocIndividualcardRequest {
	s.EncToken = &v
	return s
}

func (s *RecognizeDocIndividualcardRequest) SetRiskInfoType(v string) *RecognizeDocIndividualcardRequest {
	s.RiskInfoType = &v
	return s
}

func (s *RecognizeDocIndividualcardRequest) SetReturnPhoto(v string) *RecognizeDocIndividualcardRequest {
	s.ReturnPhoto = &v
	return s
}

func (s *RecognizeDocIndividualcardRequest) SetReturnImage(v string) *RecognizeDocIndividualcardRequest {
	s.ReturnImage = &v
	return s
}

func (s *RecognizeDocIndividualcardRequest) SetExternParam(v string) *RecognizeDocIndividualcardRequest {
	s.ExternParam = &v
	return s
}

type RecognizeDocIndividualcardResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果码
	RetCode *string `json:"ret_code,omitempty" xml:"ret_code,omitempty"`
	// 错误码
	RetCodeSub *string `json:"ret_code_sub,omitempty" xml:"ret_code_sub,omitempty"`
	// 错误信息
	RetMessageSub *string `json:"ret_message_sub,omitempty" xml:"ret_message_sub,omitempty"`
	// 识别结果，为JSON串。如果入参resp_enc_type=1则是经过AES加密后的JSON串。
	OcrInfo *string `json:"ocr_info,omitempty" xml:"ocr_info,omitempty"`
	// 防伪结果，为JSON串。如果入参resp_enc_type=1则是经过AES加密后的JSON串。
	// 如果不启用防伪，则不返回该字段。
	RiskInfo *string `json:"risk_info,omitempty" xml:"risk_info,omitempty"`
	// 扩展信息JSON串。
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s RecognizeDocIndividualcardResponse) String() string {
	return tea.Prettify(s)
}

func (s RecognizeDocIndividualcardResponse) GoString() string {
	return s.String()
}

func (s *RecognizeDocIndividualcardResponse) SetReqMsgId(v string) *RecognizeDocIndividualcardResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RecognizeDocIndividualcardResponse) SetResultCode(v string) *RecognizeDocIndividualcardResponse {
	s.ResultCode = &v
	return s
}

func (s *RecognizeDocIndividualcardResponse) SetResultMsg(v string) *RecognizeDocIndividualcardResponse {
	s.ResultMsg = &v
	return s
}

func (s *RecognizeDocIndividualcardResponse) SetRetCode(v string) *RecognizeDocIndividualcardResponse {
	s.RetCode = &v
	return s
}

func (s *RecognizeDocIndividualcardResponse) SetRetCodeSub(v string) *RecognizeDocIndividualcardResponse {
	s.RetCodeSub = &v
	return s
}

func (s *RecognizeDocIndividualcardResponse) SetRetMessageSub(v string) *RecognizeDocIndividualcardResponse {
	s.RetMessageSub = &v
	return s
}

func (s *RecognizeDocIndividualcardResponse) SetOcrInfo(v string) *RecognizeDocIndividualcardResponse {
	s.OcrInfo = &v
	return s
}

func (s *RecognizeDocIndividualcardResponse) SetRiskInfo(v string) *RecognizeDocIndividualcardResponse {
	s.RiskInfo = &v
	return s
}

func (s *RecognizeDocIndividualcardResponse) SetExtInfo(v string) *RecognizeDocIndividualcardResponse {
	s.ExtInfo = &v
	return s
}

type CheckThreemetaBankcardRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部请求ID，由调用方自行生成并自行保证唯一，以便问题定位。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 要素入参模式： 1：银行卡号+姓名+证件号 2：银行卡号+姓名+手机号 3：银行卡号+证件号+手机号，默认为1
	MetaMode *string `json:"meta_mode,omitempty" xml:"meta_mode,omitempty"`
	// 银行卡号
	BankCard *string `json:"bank_card,omitempty" xml:"bank_card,omitempty" require:"true"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 证件类型： 1：居民身份证（默认值） 2：军官证 3：护照 4：回乡证 5：台胞证 6：警官证 7：士兵证 99：其他
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty"`
	// 手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 扩展信息，Map的json格式
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s CheckThreemetaBankcardRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckThreemetaBankcardRequest) GoString() string {
	return s.String()
}

func (s *CheckThreemetaBankcardRequest) SetAuthToken(v string) *CheckThreemetaBankcardRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckThreemetaBankcardRequest) SetProductInstanceId(v string) *CheckThreemetaBankcardRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckThreemetaBankcardRequest) SetOuterOrderNo(v string) *CheckThreemetaBankcardRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CheckThreemetaBankcardRequest) SetMetaMode(v string) *CheckThreemetaBankcardRequest {
	s.MetaMode = &v
	return s
}

func (s *CheckThreemetaBankcardRequest) SetBankCard(v string) *CheckThreemetaBankcardRequest {
	s.BankCard = &v
	return s
}

func (s *CheckThreemetaBankcardRequest) SetCertName(v string) *CheckThreemetaBankcardRequest {
	s.CertName = &v
	return s
}

func (s *CheckThreemetaBankcardRequest) SetCertNo(v string) *CheckThreemetaBankcardRequest {
	s.CertNo = &v
	return s
}

func (s *CheckThreemetaBankcardRequest) SetCertType(v string) *CheckThreemetaBankcardRequest {
	s.CertType = &v
	return s
}

func (s *CheckThreemetaBankcardRequest) SetMobile(v string) *CheckThreemetaBankcardRequest {
	s.Mobile = &v
	return s
}

func (s *CheckThreemetaBankcardRequest) SetExternParam(v string) *CheckThreemetaBankcardRequest {
	s.ExternParam = &v
	return s
}

type CheckThreemetaBankcardResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// true:匹配成功 false：匹配失败
	Match *string `json:"match,omitempty" xml:"match,omitempty"`
	// 扩展信息，Map的json格式。
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s CheckThreemetaBankcardResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckThreemetaBankcardResponse) GoString() string {
	return s.String()
}

func (s *CheckThreemetaBankcardResponse) SetReqMsgId(v string) *CheckThreemetaBankcardResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckThreemetaBankcardResponse) SetResultCode(v string) *CheckThreemetaBankcardResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckThreemetaBankcardResponse) SetResultMsg(v string) *CheckThreemetaBankcardResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckThreemetaBankcardResponse) SetMatch(v string) *CheckThreemetaBankcardResponse {
	s.Match = &v
	return s
}

func (s *CheckThreemetaBankcardResponse) SetExternInfo(v string) *CheckThreemetaBankcardResponse {
	s.ExternInfo = &v
	return s
}

type QueryDeepsecRiskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 区分不同应用
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// app_key
	AppKey *string `json:"app_key,omitempty" xml:"app_key,omitempty"`
	// 业务数据集合，包括业务数据如zimId，Map<String,String>
	BizData *string `json:"biz_data,omitempty" xml:"biz_data,omitempty" require:"true"`
	// 风险数据集合，包括加密的R风险数据、设备染色数据，Map<String, String>
	RiskData *string `json:"risk_data,omitempty" xml:"risk_data,omitempty" require:"true"`
}

func (s QueryDeepsecRiskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDeepsecRiskRequest) GoString() string {
	return s.String()
}

func (s *QueryDeepsecRiskRequest) SetAuthToken(v string) *QueryDeepsecRiskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDeepsecRiskRequest) SetProductInstanceId(v string) *QueryDeepsecRiskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDeepsecRiskRequest) SetAppName(v string) *QueryDeepsecRiskRequest {
	s.AppName = &v
	return s
}

func (s *QueryDeepsecRiskRequest) SetAppKey(v string) *QueryDeepsecRiskRequest {
	s.AppKey = &v
	return s
}

func (s *QueryDeepsecRiskRequest) SetBizData(v string) *QueryDeepsecRiskRequest {
	s.BizData = &v
	return s
}

func (s *QueryDeepsecRiskRequest) SetRiskData(v string) *QueryDeepsecRiskRequest {
	s.RiskData = &v
	return s
}

type QueryDeepsecRiskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否调用成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 业务返回码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// message	返回信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 设备风险标签
	RiskInfo *string `json:"risk_info,omitempty" xml:"risk_info,omitempty"`
	// 设备染色风险标签
	DcRisk *string `json:"dc_risk,omitempty" xml:"dc_risk,omitempty"`
	// 业务风险标签
	BizRisk *string `json:"biz_risk,omitempty" xml:"biz_risk,omitempty"`
	// 设备元数据
	DeviceInfo *string `json:"device_info,omitempty" xml:"device_info,omitempty"`
}

func (s QueryDeepsecRiskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDeepsecRiskResponse) GoString() string {
	return s.String()
}

func (s *QueryDeepsecRiskResponse) SetReqMsgId(v string) *QueryDeepsecRiskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDeepsecRiskResponse) SetResultCode(v string) *QueryDeepsecRiskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDeepsecRiskResponse) SetResultMsg(v string) *QueryDeepsecRiskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDeepsecRiskResponse) SetSuccess(v bool) *QueryDeepsecRiskResponse {
	s.Success = &v
	return s
}

func (s *QueryDeepsecRiskResponse) SetCode(v string) *QueryDeepsecRiskResponse {
	s.Code = &v
	return s
}

func (s *QueryDeepsecRiskResponse) SetMessage(v string) *QueryDeepsecRiskResponse {
	s.Message = &v
	return s
}

func (s *QueryDeepsecRiskResponse) SetRiskInfo(v string) *QueryDeepsecRiskResponse {
	s.RiskInfo = &v
	return s
}

func (s *QueryDeepsecRiskResponse) SetDcRisk(v string) *QueryDeepsecRiskResponse {
	s.DcRisk = &v
	return s
}

func (s *QueryDeepsecRiskResponse) SetBizRisk(v string) *QueryDeepsecRiskResponse {
	s.BizRisk = &v
	return s
}

func (s *QueryDeepsecRiskResponse) SetDeviceInfo(v string) *QueryDeepsecRiskResponse {
	s.DeviceInfo = &v
	return s
}

type QueryDeepsecTsbmrqRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用来源
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty"`
	// request id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 租户
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 商户id
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 应用来源名称, 也被用作渠道名称
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// 是否测试流量, 测试流量会在处理过程中有特殊处理
	TestFlow *bool `json:"test_flow,omitempty" xml:"test_flow,omitempty"`
	// apdidToken
	ApdidToken *string `json:"apdid_token,omitempty" xml:"apdid_token,omitempty" require:"true"`
}

func (s QueryDeepsecTsbmrqRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDeepsecTsbmrqRequest) GoString() string {
	return s.String()
}

func (s *QueryDeepsecTsbmrqRequest) SetAuthToken(v string) *QueryDeepsecTsbmrqRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDeepsecTsbmrqRequest) SetProductInstanceId(v string) *QueryDeepsecTsbmrqRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDeepsecTsbmrqRequest) SetAppId(v string) *QueryDeepsecTsbmrqRequest {
	s.AppId = &v
	return s
}

func (s *QueryDeepsecTsbmrqRequest) SetEnvId(v string) *QueryDeepsecTsbmrqRequest {
	s.EnvId = &v
	return s
}

func (s *QueryDeepsecTsbmrqRequest) SetRequestId(v string) *QueryDeepsecTsbmrqRequest {
	s.RequestId = &v
	return s
}

func (s *QueryDeepsecTsbmrqRequest) SetTenantId(v string) *QueryDeepsecTsbmrqRequest {
	s.TenantId = &v
	return s
}

func (s *QueryDeepsecTsbmrqRequest) SetMerchantId(v string) *QueryDeepsecTsbmrqRequest {
	s.MerchantId = &v
	return s
}

func (s *QueryDeepsecTsbmrqRequest) SetAppName(v string) *QueryDeepsecTsbmrqRequest {
	s.AppName = &v
	return s
}

func (s *QueryDeepsecTsbmrqRequest) SetTestFlow(v bool) *QueryDeepsecTsbmrqRequest {
	s.TestFlow = &v
	return s
}

func (s *QueryDeepsecTsbmrqRequest) SetApdidToken(v string) *QueryDeepsecTsbmrqRequest {
	s.ApdidToken = &v
	return s
}

type QueryDeepsecTsbmrqResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 设备信息
	DeviceInfo *string `json:"device_info,omitempty" xml:"device_info,omitempty"`
	// 风险信息标签
	RiskInfo *string `json:"risk_info,omitempty" xml:"risk_info,omitempty"`
	// 业务message
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s QueryDeepsecTsbmrqResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDeepsecTsbmrqResponse) GoString() string {
	return s.String()
}

func (s *QueryDeepsecTsbmrqResponse) SetReqMsgId(v string) *QueryDeepsecTsbmrqResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDeepsecTsbmrqResponse) SetResultCode(v string) *QueryDeepsecTsbmrqResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDeepsecTsbmrqResponse) SetResultMsg(v string) *QueryDeepsecTsbmrqResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDeepsecTsbmrqResponse) SetDeviceInfo(v string) *QueryDeepsecTsbmrqResponse {
	s.DeviceInfo = &v
	return s
}

func (s *QueryDeepsecTsbmrqResponse) SetRiskInfo(v string) *QueryDeepsecTsbmrqResponse {
	s.RiskInfo = &v
	return s
}

func (s *QueryDeepsecTsbmrqResponse) SetMessage(v string) *QueryDeepsecTsbmrqResponse {
	s.Message = &v
	return s
}

type QueryThreemetaPhonereuseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部请求ID，由调用方自行生成并自行保证唯一，以便问题定位。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 手机号「支持加密」
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 日期
	Date *string `json:"date,omitempty" xml:"date,omitempty" require:"true"`
	// 运营商类型
	Carrier *string `json:"carrier,omitempty" xml:"carrier,omitempty"`
	// 加密类型，填写时「支持加密」字段需要对应加密后赋值。默认使用明文模式 0：明文 1：MD5
	EncryptType *string `json:"encrypt_type,omitempty" xml:"encrypt_type,omitempty"`
	// 扩展参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s QueryThreemetaPhonereuseRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryThreemetaPhonereuseRequest) GoString() string {
	return s.String()
}

func (s *QueryThreemetaPhonereuseRequest) SetAuthToken(v string) *QueryThreemetaPhonereuseRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryThreemetaPhonereuseRequest) SetProductInstanceId(v string) *QueryThreemetaPhonereuseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryThreemetaPhonereuseRequest) SetOuterOrderNo(v string) *QueryThreemetaPhonereuseRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QueryThreemetaPhonereuseRequest) SetMobile(v string) *QueryThreemetaPhonereuseRequest {
	s.Mobile = &v
	return s
}

func (s *QueryThreemetaPhonereuseRequest) SetDate(v string) *QueryThreemetaPhonereuseRequest {
	s.Date = &v
	return s
}

func (s *QueryThreemetaPhonereuseRequest) SetCarrier(v string) *QueryThreemetaPhonereuseRequest {
	s.Carrier = &v
	return s
}

func (s *QueryThreemetaPhonereuseRequest) SetEncryptType(v string) *QueryThreemetaPhonereuseRequest {
	s.EncryptType = &v
	return s
}

func (s *QueryThreemetaPhonereuseRequest) SetExternParam(v string) *QueryThreemetaPhonereuseRequest {
	s.ExternParam = &v
	return s
}

type QueryThreemetaPhonereuseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否二次放号
	PhoneReuse *string `json:"phone_reuse,omitempty" xml:"phone_reuse,omitempty"`
	// CHINA_TELECOM：中国电信
	// CHINA_MOBILE：中国移动
	// CHINA_UNICOM：中国联通
	Carrier *string `json:"carrier,omitempty" xml:"carrier,omitempty"`
	// 扩展参数
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s QueryThreemetaPhonereuseResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryThreemetaPhonereuseResponse) GoString() string {
	return s.String()
}

func (s *QueryThreemetaPhonereuseResponse) SetReqMsgId(v string) *QueryThreemetaPhonereuseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryThreemetaPhonereuseResponse) SetResultCode(v string) *QueryThreemetaPhonereuseResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryThreemetaPhonereuseResponse) SetResultMsg(v string) *QueryThreemetaPhonereuseResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryThreemetaPhonereuseResponse) SetPhoneReuse(v string) *QueryThreemetaPhonereuseResponse {
	s.PhoneReuse = &v
	return s
}

func (s *QueryThreemetaPhonereuseResponse) SetCarrier(v string) *QueryThreemetaPhonereuseResponse {
	s.Carrier = &v
	return s
}

func (s *QueryThreemetaPhonereuseResponse) SetExternInfo(v string) *QueryThreemetaPhonereuseResponse {
	s.ExternInfo = &v
	return s
}

type QueryTscenterDeviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备token
	ApdidToken *string `json:"apdid_token,omitempty" xml:"apdid_token,omitempty"`
	// appname
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// app key client
	AppKeyClient *string `json:"app_key_client,omitempty" xml:"app_key_client,omitempty"`
	// app key server
	AppKeyServer *string `json:"app_key_server,omitempty" xml:"app_key_server,omitempty"`
}

func (s QueryTscenterDeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTscenterDeviceRequest) GoString() string {
	return s.String()
}

func (s *QueryTscenterDeviceRequest) SetAuthToken(v string) *QueryTscenterDeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTscenterDeviceRequest) SetProductInstanceId(v string) *QueryTscenterDeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTscenterDeviceRequest) SetApdidToken(v string) *QueryTscenterDeviceRequest {
	s.ApdidToken = &v
	return s
}

func (s *QueryTscenterDeviceRequest) SetAppName(v string) *QueryTscenterDeviceRequest {
	s.AppName = &v
	return s
}

func (s *QueryTscenterDeviceRequest) SetAppKeyClient(v string) *QueryTscenterDeviceRequest {
	s.AppKeyClient = &v
	return s
}

func (s *QueryTscenterDeviceRequest) SetAppKeyServer(v string) *QueryTscenterDeviceRequest {
	s.AppKeyServer = &v
	return s
}

type QueryTscenterDeviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 设备信息字符串
	DeviceInfo *string `json:"device_info,omitempty" xml:"device_info,omitempty"`
}

func (s QueryTscenterDeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTscenterDeviceResponse) GoString() string {
	return s.String()
}

func (s *QueryTscenterDeviceResponse) SetReqMsgId(v string) *QueryTscenterDeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTscenterDeviceResponse) SetResultCode(v string) *QueryTscenterDeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTscenterDeviceResponse) SetResultMsg(v string) *QueryTscenterDeviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTscenterDeviceResponse) SetDeviceInfo(v string) *QueryTscenterDeviceResponse {
	s.DeviceInfo = &v
	return s
}

type QueryEducationInfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 用户是否授权
	Authorized *bool `json:"authorized,omitempty" xml:"authorized,omitempty" require:"true"`
	// 扩展信息，预留字段
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s QueryEducationInfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEducationInfoRequest) GoString() string {
	return s.String()
}

func (s *QueryEducationInfoRequest) SetAuthToken(v string) *QueryEducationInfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEducationInfoRequest) SetProductInstanceId(v string) *QueryEducationInfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEducationInfoRequest) SetOuterOrderNo(v string) *QueryEducationInfoRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QueryEducationInfoRequest) SetCertNo(v string) *QueryEducationInfoRequest {
	s.CertNo = &v
	return s
}

func (s *QueryEducationInfoRequest) SetCertName(v string) *QueryEducationInfoRequest {
	s.CertName = &v
	return s
}

func (s *QueryEducationInfoRequest) SetAuthorized(v bool) *QueryEducationInfoRequest {
	s.Authorized = &v
	return s
}

func (s *QueryEducationInfoRequest) SetExternParam(v string) *QueryEducationInfoRequest {
	s.ExternParam = &v
	return s
}

type QueryEducationInfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 学历信息
	EducationInfo *string `json:"education_info,omitempty" xml:"education_info,omitempty"`
	// 扩展信息，预留字段
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s QueryEducationInfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEducationInfoResponse) GoString() string {
	return s.String()
}

func (s *QueryEducationInfoResponse) SetReqMsgId(v string) *QueryEducationInfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEducationInfoResponse) SetResultCode(v string) *QueryEducationInfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEducationInfoResponse) SetResultMsg(v string) *QueryEducationInfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEducationInfoResponse) SetEducationInfo(v string) *QueryEducationInfoResponse {
	s.EducationInfo = &v
	return s
}

func (s *QueryEducationInfoResponse) SetExternInfo(v string) *QueryEducationInfoResponse {
	s.ExternInfo = &v
	return s
}

type QueryDemoInfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// token
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
}

func (s QueryDemoInfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoInfoRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoInfoRequest) SetAuthToken(v string) *QueryDemoInfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoInfoRequest) SetProductInstanceId(v string) *QueryDemoInfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDemoInfoRequest) SetToken(v string) *QueryDemoInfoRequest {
	s.Token = &v
	return s
}

type QueryDemoInfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// record json
	Record *string `json:"record,omitempty" xml:"record,omitempty"`
}

func (s QueryDemoInfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoInfoResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoInfoResponse) SetReqMsgId(v string) *QueryDemoInfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoInfoResponse) SetResultCode(v string) *QueryDemoInfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoInfoResponse) SetResultMsg(v string) *QueryDemoInfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDemoInfoResponse) SetRecord(v string) *QueryDemoInfoResponse {
	s.Record = &v
	return s
}

type CheckBankcardTwometaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 	外部请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 要素入参模式： 1：银行卡号+姓名 2：银行卡号+证件号 3：银行卡号+手机号
	MetaMode *string `json:"meta_mode,omitempty" xml:"meta_mode,omitempty" require:"true"`
	// 证件类型： 1：居民身份证（默认值） 2：军官证 3：护照 4：回乡证 5：台胞证 6：警官证 7：士兵证 99：其他
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty"`
	// 银行卡号
	BankCard *string `json:"bank_card,omitempty" xml:"bank_card,omitempty" require:"true"`
	// 手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 证件号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 扩展信息，预留字段
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s CheckBankcardTwometaRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckBankcardTwometaRequest) GoString() string {
	return s.String()
}

func (s *CheckBankcardTwometaRequest) SetAuthToken(v string) *CheckBankcardTwometaRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckBankcardTwometaRequest) SetProductInstanceId(v string) *CheckBankcardTwometaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckBankcardTwometaRequest) SetOuterOrderNo(v string) *CheckBankcardTwometaRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CheckBankcardTwometaRequest) SetMetaMode(v string) *CheckBankcardTwometaRequest {
	s.MetaMode = &v
	return s
}

func (s *CheckBankcardTwometaRequest) SetCertType(v string) *CheckBankcardTwometaRequest {
	s.CertType = &v
	return s
}

func (s *CheckBankcardTwometaRequest) SetBankCard(v string) *CheckBankcardTwometaRequest {
	s.BankCard = &v
	return s
}

func (s *CheckBankcardTwometaRequest) SetMobile(v string) *CheckBankcardTwometaRequest {
	s.Mobile = &v
	return s
}

func (s *CheckBankcardTwometaRequest) SetCertName(v string) *CheckBankcardTwometaRequest {
	s.CertName = &v
	return s
}

func (s *CheckBankcardTwometaRequest) SetCertNo(v string) *CheckBankcardTwometaRequest {
	s.CertNo = &v
	return s
}

func (s *CheckBankcardTwometaRequest) SetExternParam(v string) *CheckBankcardTwometaRequest {
	s.ExternParam = &v
	return s
}

type CheckBankcardTwometaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 扩展信息，为JSONObject。
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s CheckBankcardTwometaResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckBankcardTwometaResponse) GoString() string {
	return s.String()
}

func (s *CheckBankcardTwometaResponse) SetReqMsgId(v string) *CheckBankcardTwometaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckBankcardTwometaResponse) SetResultCode(v string) *CheckBankcardTwometaResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckBankcardTwometaResponse) SetResultMsg(v string) *CheckBankcardTwometaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckBankcardTwometaResponse) SetExternInfo(v string) *CheckBankcardTwometaResponse {
	s.ExternInfo = &v
	return s
}

type CheckCarrierTwometaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 加密类型，填写时「支持加密」字段需要对应加密后赋值。默认使用明文模式
	// 0：明文
	// 1：MD5
	EncryptType *string `json:"encrypt_type,omitempty" xml:"encrypt_type,omitempty"`
	// 要素入参模式：
	// 1：手机号+姓名
	// 2：手机号+身份证号
	MetaMode *string `json:"meta_mode,omitempty" xml:"meta_mode,omitempty" require:"true"`
	// 手机号码「支持加密」
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 姓名「支持加密」
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 身份证号「支持加密」
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 运营商类型：
	// CHINA_TELECOM；
	// CHINA_MOBILE；
	// CHINA_UNICOM
	Carrier *string `json:"carrier,omitempty" xml:"carrier,omitempty"`
	// 扩展信息，预留字段
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s CheckCarrierTwometaRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckCarrierTwometaRequest) GoString() string {
	return s.String()
}

func (s *CheckCarrierTwometaRequest) SetAuthToken(v string) *CheckCarrierTwometaRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckCarrierTwometaRequest) SetProductInstanceId(v string) *CheckCarrierTwometaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckCarrierTwometaRequest) SetOuterOrderNo(v string) *CheckCarrierTwometaRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CheckCarrierTwometaRequest) SetEncryptType(v string) *CheckCarrierTwometaRequest {
	s.EncryptType = &v
	return s
}

func (s *CheckCarrierTwometaRequest) SetMetaMode(v string) *CheckCarrierTwometaRequest {
	s.MetaMode = &v
	return s
}

func (s *CheckCarrierTwometaRequest) SetMobile(v string) *CheckCarrierTwometaRequest {
	s.Mobile = &v
	return s
}

func (s *CheckCarrierTwometaRequest) SetCertName(v string) *CheckCarrierTwometaRequest {
	s.CertName = &v
	return s
}

func (s *CheckCarrierTwometaRequest) SetCertNo(v string) *CheckCarrierTwometaRequest {
	s.CertNo = &v
	return s
}

func (s *CheckCarrierTwometaRequest) SetCarrier(v string) *CheckCarrierTwometaRequest {
	s.Carrier = &v
	return s
}

func (s *CheckCarrierTwometaRequest) SetExternParam(v string) *CheckCarrierTwometaRequest {
	s.ExternParam = &v
	return s
}

type CheckCarrierTwometaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 扩展信息，为JSONObject。
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// 运营商类型： CHINA_TELECOM； CHINA_MOBILE； CHINA_UNICOM
	Carrier *string `json:"carrier,omitempty" xml:"carrier,omitempty"`
}

func (s CheckCarrierTwometaResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckCarrierTwometaResponse) GoString() string {
	return s.String()
}

func (s *CheckCarrierTwometaResponse) SetReqMsgId(v string) *CheckCarrierTwometaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckCarrierTwometaResponse) SetResultCode(v string) *CheckCarrierTwometaResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckCarrierTwometaResponse) SetResultMsg(v string) *CheckCarrierTwometaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckCarrierTwometaResponse) SetExternInfo(v string) *CheckCarrierTwometaResponse {
	s.ExternInfo = &v
	return s
}

func (s *CheckCarrierTwometaResponse) SetCarrier(v string) *CheckCarrierTwometaResponse {
	s.Carrier = &v
	return s
}

type CreateNfcServerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 证件类型，ID_CARD，PASSPORT
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 证件姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 出生日期
	Birthday *string `json:"birthday,omitempty" xml:"birthday,omitempty"`
	// 证件有效期
	ValidateDate *string `json:"validate_date,omitempty" xml:"validate_date,omitempty"`
	// 护照要素录入模式 NONE MANUAL TRANS
	Mode *string `json:"mode,omitempty" xml:"mode,omitempty"`
	// 扩展参数
	// {"syntheticEdoc":"Y"     是否合成证件图"}
	// {"obtainDocPhoto":"Y"    是否获取高清人像"}
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// metainfo 环境参数，需要通过客户端 SDK 获取
	MetaInfo *string `json:"meta_info,omitempty" xml:"meta_info,omitempty" require:"true"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面...
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 场景ID
	SceneId *string `json:"scene_id,omitempty" xml:"scene_id,omitempty" require:"true"`
	// 商户自定义的用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s CreateNfcServerRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateNfcServerRequest) GoString() string {
	return s.String()
}

func (s *CreateNfcServerRequest) SetAuthToken(v string) *CreateNfcServerRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateNfcServerRequest) SetProductInstanceId(v string) *CreateNfcServerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateNfcServerRequest) SetCertType(v string) *CreateNfcServerRequest {
	s.CertType = &v
	return s
}

func (s *CreateNfcServerRequest) SetCertNo(v string) *CreateNfcServerRequest {
	s.CertNo = &v
	return s
}

func (s *CreateNfcServerRequest) SetCertName(v string) *CreateNfcServerRequest {
	s.CertName = &v
	return s
}

func (s *CreateNfcServerRequest) SetBirthday(v string) *CreateNfcServerRequest {
	s.Birthday = &v
	return s
}

func (s *CreateNfcServerRequest) SetValidateDate(v string) *CreateNfcServerRequest {
	s.ValidateDate = &v
	return s
}

func (s *CreateNfcServerRequest) SetMode(v string) *CreateNfcServerRequest {
	s.Mode = &v
	return s
}

func (s *CreateNfcServerRequest) SetExternParam(v string) *CreateNfcServerRequest {
	s.ExternParam = &v
	return s
}

func (s *CreateNfcServerRequest) SetMetaInfo(v string) *CreateNfcServerRequest {
	s.MetaInfo = &v
	return s
}

func (s *CreateNfcServerRequest) SetOuterOrderNo(v string) *CreateNfcServerRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CreateNfcServerRequest) SetSceneId(v string) *CreateNfcServerRequest {
	s.SceneId = &v
	return s
}

func (s *CreateNfcServerRequest) SetUserId(v string) *CreateNfcServerRequest {
	s.UserId = &v
	return s
}

type CreateNfcServerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实人认证唯一标识
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
}

func (s CreateNfcServerResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateNfcServerResponse) GoString() string {
	return s.String()
}

func (s *CreateNfcServerResponse) SetReqMsgId(v string) *CreateNfcServerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateNfcServerResponse) SetResultCode(v string) *CreateNfcServerResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateNfcServerResponse) SetResultMsg(v string) *CreateNfcServerResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateNfcServerResponse) SetCertifyId(v string) *CreateNfcServerResponse {
	s.CertifyId = &v
	return s
}

type QueryNfcServerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 实人认证唯一标识
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面...
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 场景ID
	SceneId *string `json:"scene_id,omitempty" xml:"scene_id,omitempty" require:"true"`
}

func (s QueryNfcServerRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryNfcServerRequest) GoString() string {
	return s.String()
}

func (s *QueryNfcServerRequest) SetAuthToken(v string) *QueryNfcServerRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryNfcServerRequest) SetProductInstanceId(v string) *QueryNfcServerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryNfcServerRequest) SetCertifyId(v string) *QueryNfcServerRequest {
	s.CertifyId = &v
	return s
}

func (s *QueryNfcServerRequest) SetExternParam(v string) *QueryNfcServerRequest {
	s.ExternParam = &v
	return s
}

func (s *QueryNfcServerRequest) SetOuterOrderNo(v string) *QueryNfcServerRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QueryNfcServerRequest) SetSceneId(v string) *QueryNfcServerRequest {
	s.SceneId = &v
	return s
}

type QueryNfcServerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否通过，通过为T，不通过为F
	Passed *string `json:"passed,omitempty" xml:"passed,omitempty"`
	// 业务失败原因
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty"`
	// 认证主体附件信息，一般的认证场景都是返回空
	MaterialInfo *string `json:"material_info,omitempty" xml:"material_info,omitempty"`
}

func (s QueryNfcServerResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryNfcServerResponse) GoString() string {
	return s.String()
}

func (s *QueryNfcServerResponse) SetReqMsgId(v string) *QueryNfcServerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryNfcServerResponse) SetResultCode(v string) *QueryNfcServerResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryNfcServerResponse) SetResultMsg(v string) *QueryNfcServerResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryNfcServerResponse) SetPassed(v string) *QueryNfcServerResponse {
	s.Passed = &v
	return s
}

func (s *QueryNfcServerResponse) SetReason(v string) *QueryNfcServerResponse {
	s.Reason = &v
	return s
}

func (s *QueryNfcServerResponse) SetMaterialInfo(v string) *QueryNfcServerResponse {
	s.MaterialInfo = &v
	return s
}

type QuerySocialriskDetailRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权抽查。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 入参加密模式：
	// NONE：不加密；
	// RSA：RSA加密；
	// SM2：SM2加密。
	EncType *string `json:"enc_type,omitempty" xml:"enc_type,omitempty" require:"true"`
	// 姓名（根据enc_type决定加密方式）
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 身份证号（根据enc_type决定加密方式）
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 扩展信息，预留字段
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	//
	// 场景编号
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty"`
}

func (s QuerySocialriskDetailRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySocialriskDetailRequest) GoString() string {
	return s.String()
}

func (s *QuerySocialriskDetailRequest) SetAuthToken(v string) *QuerySocialriskDetailRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySocialriskDetailRequest) SetProductInstanceId(v string) *QuerySocialriskDetailRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySocialriskDetailRequest) SetOuterOrderNo(v string) *QuerySocialriskDetailRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QuerySocialriskDetailRequest) SetEncType(v string) *QuerySocialriskDetailRequest {
	s.EncType = &v
	return s
}

func (s *QuerySocialriskDetailRequest) SetCertName(v string) *QuerySocialriskDetailRequest {
	s.CertName = &v
	return s
}

func (s *QuerySocialriskDetailRequest) SetCertNo(v string) *QuerySocialriskDetailRequest {
	s.CertNo = &v
	return s
}

func (s *QuerySocialriskDetailRequest) SetExternParam(v string) *QuerySocialriskDetailRequest {
	s.ExternParam = &v
	return s
}

func (s *QuerySocialriskDetailRequest) SetScene(v string) *QuerySocialriskDetailRequest {
	s.Scene = &v
	return s
}

type QuerySocialriskDetailResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险信息，为JSONObject.
	RiskInfo *string `json:"risk_info,omitempty" xml:"risk_info,omitempty"`
	// 扩展信息，预留字段。
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s QuerySocialriskDetailResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySocialriskDetailResponse) GoString() string {
	return s.String()
}

func (s *QuerySocialriskDetailResponse) SetReqMsgId(v string) *QuerySocialriskDetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySocialriskDetailResponse) SetResultCode(v string) *QuerySocialriskDetailResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySocialriskDetailResponse) SetResultMsg(v string) *QuerySocialriskDetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySocialriskDetailResponse) SetRiskInfo(v string) *QuerySocialriskDetailResponse {
	s.RiskInfo = &v
	return s
}

func (s *QuerySocialriskDetailResponse) SetExternInfo(v string) *QuerySocialriskDetailResponse {
	s.ExternInfo = &v
	return s
}

type QueryCarrierNetstatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 手机号码「支持加密」
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 运营商类型： CHINA_TELECOM； CHINA_MOBILE； CHINA_UNICOM
	Carrier *string `json:"carrier,omitempty" xml:"carrier,omitempty"`
	// 加密类型，填写时「支持加密」字段需要对应加密后赋值。默认使用明文模式
	// 0：明文
	// 1：MD5
	EncryptType *string `json:"encrypt_type,omitempty" xml:"encrypt_type,omitempty"`
	// 扩展信息，预留字段
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s QueryCarrierNetstatusRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCarrierNetstatusRequest) GoString() string {
	return s.String()
}

func (s *QueryCarrierNetstatusRequest) SetAuthToken(v string) *QueryCarrierNetstatusRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCarrierNetstatusRequest) SetProductInstanceId(v string) *QueryCarrierNetstatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCarrierNetstatusRequest) SetOuterOrderNo(v string) *QueryCarrierNetstatusRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QueryCarrierNetstatusRequest) SetMobile(v string) *QueryCarrierNetstatusRequest {
	s.Mobile = &v
	return s
}

func (s *QueryCarrierNetstatusRequest) SetCarrier(v string) *QueryCarrierNetstatusRequest {
	s.Carrier = &v
	return s
}

func (s *QueryCarrierNetstatusRequest) SetEncryptType(v string) *QueryCarrierNetstatusRequest {
	s.EncryptType = &v
	return s
}

func (s *QueryCarrierNetstatusRequest) SetExternParam(v string) *QueryCarrierNetstatusRequest {
	s.ExternParam = &v
	return s
}

type QueryCarrierNetstatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 在网状态结果值
	TelNetworkStatus *string `json:"tel_network_status,omitempty" xml:"tel_network_status,omitempty"`
	// 运营商类型： CHINA_TELECOM； CHINA_MOBILE； CHINA_UNICOM
	Carrier *string `json:"carrier,omitempty" xml:"carrier,omitempty"`
	// 扩展信息，为JSONObject。
	// 包含携号转网状态，字段名telNumberTransStatus，字段类型为字符串，字段值示例"1"，描述：1-携号转网 0-未携号转网 2-未知
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s QueryCarrierNetstatusResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCarrierNetstatusResponse) GoString() string {
	return s.String()
}

func (s *QueryCarrierNetstatusResponse) SetReqMsgId(v string) *QueryCarrierNetstatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCarrierNetstatusResponse) SetResultCode(v string) *QueryCarrierNetstatusResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCarrierNetstatusResponse) SetResultMsg(v string) *QueryCarrierNetstatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCarrierNetstatusResponse) SetTelNetworkStatus(v string) *QueryCarrierNetstatusResponse {
	s.TelNetworkStatus = &v
	return s
}

func (s *QueryCarrierNetstatusResponse) SetCarrier(v string) *QueryCarrierNetstatusResponse {
	s.Carrier = &v
	return s
}

func (s *QueryCarrierNetstatusResponse) SetExternInfo(v string) *QueryCarrierNetstatusResponse {
	s.ExternInfo = &v
	return s
}

type QuerySocialriskBriefRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权抽查。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 场景编号
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty"`
	// 入参加密模式： NONE：不加密； RSA：RSA加密； SM2：SM2加密。
	EncType *string `json:"enc_type,omitempty" xml:"enc_type,omitempty" require:"true"`
	//
	// 姓名（根据enc_type决定加密方式）
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 身份证号（根据enc_type决定加密方式）
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 扩展信息，预留字段
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s QuerySocialriskBriefRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySocialriskBriefRequest) GoString() string {
	return s.String()
}

func (s *QuerySocialriskBriefRequest) SetAuthToken(v string) *QuerySocialriskBriefRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySocialriskBriefRequest) SetProductInstanceId(v string) *QuerySocialriskBriefRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySocialriskBriefRequest) SetOuterOrderNo(v string) *QuerySocialriskBriefRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QuerySocialriskBriefRequest) SetScene(v string) *QuerySocialriskBriefRequest {
	s.Scene = &v
	return s
}

func (s *QuerySocialriskBriefRequest) SetEncType(v string) *QuerySocialriskBriefRequest {
	s.EncType = &v
	return s
}

func (s *QuerySocialriskBriefRequest) SetCertName(v string) *QuerySocialriskBriefRequest {
	s.CertName = &v
	return s
}

func (s *QuerySocialriskBriefRequest) SetCertNo(v string) *QuerySocialriskBriefRequest {
	s.CertNo = &v
	return s
}

func (s *QuerySocialriskBriefRequest) SetExternParam(v string) *QuerySocialriskBriefRequest {
	s.ExternParam = &v
	return s
}

type QuerySocialriskBriefResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险信息
	RiskInfo *string `json:"risk_info,omitempty" xml:"risk_info,omitempty"`
	// 扩展信息，预留字段。
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s QuerySocialriskBriefResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySocialriskBriefResponse) GoString() string {
	return s.String()
}

func (s *QuerySocialriskBriefResponse) SetReqMsgId(v string) *QuerySocialriskBriefResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySocialriskBriefResponse) SetResultCode(v string) *QuerySocialriskBriefResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySocialriskBriefResponse) SetResultMsg(v string) *QuerySocialriskBriefResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySocialriskBriefResponse) SetRiskInfo(v string) *QuerySocialriskBriefResponse {
	s.RiskInfo = &v
	return s
}

func (s *QuerySocialriskBriefResponse) SetExternInfo(v string) *QuerySocialriskBriefResponse {
	s.ExternInfo = &v
	return s
}

type QuerySocialriskTobriskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权抽查。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 入参加密模式：
	// NONE：不加密；
	// RSA：RSA加密，请使用在示例代码中提供的公钥；
	// SM2：SM2加密，请使用在示例代码中提供的公钥。
	EncType *string `json:"enc_type,omitempty" xml:"enc_type,omitempty" require:"true"`
	// 身份证号（根据enc_type决定加密方式）
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 扩展信息，预留字段
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s QuerySocialriskTobriskRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySocialriskTobriskRequest) GoString() string {
	return s.String()
}

func (s *QuerySocialriskTobriskRequest) SetAuthToken(v string) *QuerySocialriskTobriskRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySocialriskTobriskRequest) SetProductInstanceId(v string) *QuerySocialriskTobriskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySocialriskTobriskRequest) SetOuterOrderNo(v string) *QuerySocialriskTobriskRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QuerySocialriskTobriskRequest) SetEncType(v string) *QuerySocialriskTobriskRequest {
	s.EncType = &v
	return s
}

func (s *QuerySocialriskTobriskRequest) SetCertNo(v string) *QuerySocialriskTobriskRequest {
	s.CertNo = &v
	return s
}

func (s *QuerySocialriskTobriskRequest) SetExternParam(v string) *QuerySocialriskTobriskRequest {
	s.ExternParam = &v
	return s
}

type QuerySocialriskTobriskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险信息，为JSONObject
	RiskInfo *string `json:"risk_info,omitempty" xml:"risk_info,omitempty"`
	// STRING	扩展信息，预留字段。
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s QuerySocialriskTobriskResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySocialriskTobriskResponse) GoString() string {
	return s.String()
}

func (s *QuerySocialriskTobriskResponse) SetReqMsgId(v string) *QuerySocialriskTobriskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySocialriskTobriskResponse) SetResultCode(v string) *QuerySocialriskTobriskResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySocialriskTobriskResponse) SetResultMsg(v string) *QuerySocialriskTobriskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySocialriskTobriskResponse) SetRiskInfo(v string) *QuerySocialriskTobriskResponse {
	s.RiskInfo = &v
	return s
}

func (s *QuerySocialriskTobriskResponse) SetExternInfo(v string) *QuerySocialriskTobriskResponse {
	s.ExternInfo = &v
	return s
}

type ExecFacevrfServermodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 真实姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// cert_name、cert_no两个字段的传入模式0：明文1：密文
	EncType *string `json:"enc_type,omitempty" xml:"enc_type,omitempty"`
	// 证件类型，如身份证
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty"`
	// 预留扩展参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 自定义比对源人脸图像，base64编码格式
	FacialPictureRef *string `json:"facial_picture_ref,omitempty" xml:"facial_picture_ref,omitempty"`
	// 身份信息来源类型，如证件
	IdentityType *string `json:"identity_type,omitempty" xml:"identity_type,omitempty" require:"true"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 场景ID
	SceneId *string `json:"scene_id,omitempty" xml:"scene_id,omitempty" require:"true"`
	// 商户自定义的用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户的IP
	UserIp *string `json:"user_ip,omitempty" xml:"user_ip,omitempty"`
	// 用户的手机号（或其哈希值）
	UserMobile *string `json:"user_mobile,omitempty" xml:"user_mobile,omitempty"`
	// 待认证的人脸图像，base64编码格式
	FacialPictureAuth *string `json:"facial_picture_auth,omitempty" xml:"facial_picture_auth,omitempty"`
	// 视频文件
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
}

func (s ExecFacevrfServermodeRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecFacevrfServermodeRequest) GoString() string {
	return s.String()
}

func (s *ExecFacevrfServermodeRequest) SetAuthToken(v string) *ExecFacevrfServermodeRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecFacevrfServermodeRequest) SetProductInstanceId(v string) *ExecFacevrfServermodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecFacevrfServermodeRequest) SetCertName(v string) *ExecFacevrfServermodeRequest {
	s.CertName = &v
	return s
}

func (s *ExecFacevrfServermodeRequest) SetCertNo(v string) *ExecFacevrfServermodeRequest {
	s.CertNo = &v
	return s
}

func (s *ExecFacevrfServermodeRequest) SetEncType(v string) *ExecFacevrfServermodeRequest {
	s.EncType = &v
	return s
}

func (s *ExecFacevrfServermodeRequest) SetCertType(v string) *ExecFacevrfServermodeRequest {
	s.CertType = &v
	return s
}

func (s *ExecFacevrfServermodeRequest) SetExternParam(v string) *ExecFacevrfServermodeRequest {
	s.ExternParam = &v
	return s
}

func (s *ExecFacevrfServermodeRequest) SetFacialPictureRef(v string) *ExecFacevrfServermodeRequest {
	s.FacialPictureRef = &v
	return s
}

func (s *ExecFacevrfServermodeRequest) SetIdentityType(v string) *ExecFacevrfServermodeRequest {
	s.IdentityType = &v
	return s
}

func (s *ExecFacevrfServermodeRequest) SetOuterOrderNo(v string) *ExecFacevrfServermodeRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *ExecFacevrfServermodeRequest) SetSceneId(v string) *ExecFacevrfServermodeRequest {
	s.SceneId = &v
	return s
}

func (s *ExecFacevrfServermodeRequest) SetUserId(v string) *ExecFacevrfServermodeRequest {
	s.UserId = &v
	return s
}

func (s *ExecFacevrfServermodeRequest) SetUserIp(v string) *ExecFacevrfServermodeRequest {
	s.UserIp = &v
	return s
}

func (s *ExecFacevrfServermodeRequest) SetUserMobile(v string) *ExecFacevrfServermodeRequest {
	s.UserMobile = &v
	return s
}

func (s *ExecFacevrfServermodeRequest) SetFacialPictureAuth(v string) *ExecFacevrfServermodeRequest {
	s.FacialPictureAuth = &v
	return s
}

func (s *ExecFacevrfServermodeRequest) SetFileObject(v io.Reader) *ExecFacevrfServermodeRequest {
	s.FileObject = v
	return s
}

func (s *ExecFacevrfServermodeRequest) SetFileObjectName(v string) *ExecFacevrfServermodeRequest {
	s.FileObjectName = &v
	return s
}

func (s *ExecFacevrfServermodeRequest) SetFileId(v string) *ExecFacevrfServermodeRequest {
	s.FileId = &v
	return s
}

type ExecFacevrfServermodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证ID
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 是否通过，通过为T，不通过为F
	Passed *string `json:"passed,omitempty" xml:"passed,omitempty"`
	// 业务失败原因
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty"`
	// 认证主体附件信息，包含共计类型等
	MaterialInfo *string `json:"material_info,omitempty" xml:"material_info,omitempty"`
}

func (s ExecFacevrfServermodeResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecFacevrfServermodeResponse) GoString() string {
	return s.String()
}

func (s *ExecFacevrfServermodeResponse) SetReqMsgId(v string) *ExecFacevrfServermodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecFacevrfServermodeResponse) SetResultCode(v string) *ExecFacevrfServermodeResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecFacevrfServermodeResponse) SetResultMsg(v string) *ExecFacevrfServermodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecFacevrfServermodeResponse) SetCertifyId(v string) *ExecFacevrfServermodeResponse {
	s.CertifyId = &v
	return s
}

func (s *ExecFacevrfServermodeResponse) SetPassed(v string) *ExecFacevrfServermodeResponse {
	s.Passed = &v
	return s
}

func (s *ExecFacevrfServermodeResponse) SetReason(v string) *ExecFacevrfServermodeResponse {
	s.Reason = &v
	return s
}

func (s *ExecFacevrfServermodeResponse) SetMaterialInfo(v string) *ExecFacevrfServermodeResponse {
	s.MaterialInfo = &v
	return s
}

type QueryBankLivenessRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求ID
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 加密方式
	EncryptType *string `json:"encrypt_type,omitempty" xml:"encrypt_type,omitempty" require:"true"`
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 银行编码
	BankCode *string `json:"bank_code,omitempty" xml:"bank_code,omitempty" require:"true"`
	// 1=借记卡+贷记卡（默认）；2=借记卡
	BankCardType *string `json:"bank_card_type,omitempty" xml:"bank_card_type,omitempty"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 扩展信息，预留字段
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s QueryBankLivenessRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBankLivenessRequest) GoString() string {
	return s.String()
}

func (s *QueryBankLivenessRequest) SetAuthToken(v string) *QueryBankLivenessRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBankLivenessRequest) SetProductInstanceId(v string) *QueryBankLivenessRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBankLivenessRequest) SetOuterOrderNo(v string) *QueryBankLivenessRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QueryBankLivenessRequest) SetEncryptType(v string) *QueryBankLivenessRequest {
	s.EncryptType = &v
	return s
}

func (s *QueryBankLivenessRequest) SetCertNo(v string) *QueryBankLivenessRequest {
	s.CertNo = &v
	return s
}

func (s *QueryBankLivenessRequest) SetBankCode(v string) *QueryBankLivenessRequest {
	s.BankCode = &v
	return s
}

func (s *QueryBankLivenessRequest) SetBankCardType(v string) *QueryBankLivenessRequest {
	s.BankCardType = &v
	return s
}

func (s *QueryBankLivenessRequest) SetCertName(v string) *QueryBankLivenessRequest {
	s.CertName = &v
	return s
}

func (s *QueryBankLivenessRequest) SetMobile(v string) *QueryBankLivenessRequest {
	s.Mobile = &v
	return s
}

func (s *QueryBankLivenessRequest) SetExternParam(v string) *QueryBankLivenessRequest {
	s.ExternParam = &v
	return s
}

type QueryBankLivenessResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 银行活跃度详情，可解析为JSONArray。
	LivenessInfo *string `json:"liveness_info,omitempty" xml:"liveness_info,omitempty"`
	// 扩展信息，预留字段
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s QueryBankLivenessResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBankLivenessResponse) GoString() string {
	return s.String()
}

func (s *QueryBankLivenessResponse) SetReqMsgId(v string) *QueryBankLivenessResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBankLivenessResponse) SetResultCode(v string) *QueryBankLivenessResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBankLivenessResponse) SetResultMsg(v string) *QueryBankLivenessResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBankLivenessResponse) SetLivenessInfo(v string) *QueryBankLivenessResponse {
	s.LivenessInfo = &v
	return s
}

func (s *QueryBankLivenessResponse) SetExternInfo(v string) *QueryBankLivenessResponse {
	s.ExternInfo = &v
	return s
}

type CreateConsoleDomainRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景id
	SceneId *string `json:"scene_id,omitempty" xml:"scene_id,omitempty" require:"true"`
	// 用于排查问题
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 客户填自己需要绑定的小程序名称
	MiniProgramName *string `json:"mini_program_name,omitempty" xml:"mini_program_name,omitempty" require:"true"`
	// 所属平台，微信、支付宝
	Platform *string `json:"platform,omitempty" xml:"platform,omitempty" require:"true"`
	// 校验文件的名称
	CheckFileName *string `json:"check_file_name,omitempty" xml:"check_file_name,omitempty" require:"true"`
	// 填校验文件里面的内容
	CheckFileBody *string `json:"check_file_body,omitempty" xml:"check_file_body,omitempty" require:"true"`
}

func (s CreateConsoleDomainRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateConsoleDomainRequest) GoString() string {
	return s.String()
}

func (s *CreateConsoleDomainRequest) SetAuthToken(v string) *CreateConsoleDomainRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateConsoleDomainRequest) SetProductInstanceId(v string) *CreateConsoleDomainRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateConsoleDomainRequest) SetSceneId(v string) *CreateConsoleDomainRequest {
	s.SceneId = &v
	return s
}

func (s *CreateConsoleDomainRequest) SetBizId(v string) *CreateConsoleDomainRequest {
	s.BizId = &v
	return s
}

func (s *CreateConsoleDomainRequest) SetMiniProgramName(v string) *CreateConsoleDomainRequest {
	s.MiniProgramName = &v
	return s
}

func (s *CreateConsoleDomainRequest) SetPlatform(v string) *CreateConsoleDomainRequest {
	s.Platform = &v
	return s
}

func (s *CreateConsoleDomainRequest) SetCheckFileName(v string) *CreateConsoleDomainRequest {
	s.CheckFileName = &v
	return s
}

func (s *CreateConsoleDomainRequest) SetCheckFileBody(v string) *CreateConsoleDomainRequest {
	s.CheckFileBody = &v
	return s
}

type CreateConsoleDomainResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回绑定的域名
	Domain *string `json:"domain,omitempty" xml:"domain,omitempty"`
}

func (s CreateConsoleDomainResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateConsoleDomainResponse) GoString() string {
	return s.String()
}

func (s *CreateConsoleDomainResponse) SetReqMsgId(v string) *CreateConsoleDomainResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateConsoleDomainResponse) SetResultCode(v string) *CreateConsoleDomainResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateConsoleDomainResponse) SetResultMsg(v string) *CreateConsoleDomainResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateConsoleDomainResponse) SetDomain(v string) *CreateConsoleDomainResponse {
	s.Domain = &v
	return s
}

type DeleteConsoleDomainRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 控制台场景id
	SceneId *string `json:"scene_id,omitempty" xml:"scene_id,omitempty" require:"true"`
}

func (s DeleteConsoleDomainRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteConsoleDomainRequest) GoString() string {
	return s.String()
}

func (s *DeleteConsoleDomainRequest) SetAuthToken(v string) *DeleteConsoleDomainRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteConsoleDomainRequest) SetProductInstanceId(v string) *DeleteConsoleDomainRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteConsoleDomainRequest) SetSceneId(v string) *DeleteConsoleDomainRequest {
	s.SceneId = &v
	return s
}

type DeleteConsoleDomainResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteConsoleDomainResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteConsoleDomainResponse) GoString() string {
	return s.String()
}

func (s *DeleteConsoleDomainResponse) SetReqMsgId(v string) *DeleteConsoleDomainResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteConsoleDomainResponse) SetResultCode(v string) *DeleteConsoleDomainResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteConsoleDomainResponse) SetResultMsg(v string) *DeleteConsoleDomainResponse {
	s.ResultMsg = &v
	return s
}

type InitCarrierRepairmobileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 流程ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，用于流程串联。
	ProcessId *string `json:"process_id,omitempty" xml:"process_id,omitempty" require:"true"`
	// 运营商类型，取值如下：
	// CHINA_TELECOM：中国电信
	// CHINA_MOBILE：中国移动
	// CHINA_UNICOM：中国联通
	Carrier *string `json:"carrier,omitempty" xml:"carrier,omitempty" require:"true"`
	// 入参加密模式：
	// "0"（默认值）：不加密；
	// "2"：身份证号、曾用手机号字段都需填写SHA256加密后的字符串。
	// 默认未"0"
	EncryptType *string `json:"encrypt_type,omitempty" xml:"encrypt_type,omitempty"`
	// 失联修复身份证号，使用入参加密模式加密
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 用户姓名，明文
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 曾用手机号码，使用入参加密模式加密
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
}

func (s InitCarrierRepairmobileRequest) String() string {
	return tea.Prettify(s)
}

func (s InitCarrierRepairmobileRequest) GoString() string {
	return s.String()
}

func (s *InitCarrierRepairmobileRequest) SetAuthToken(v string) *InitCarrierRepairmobileRequest {
	s.AuthToken = &v
	return s
}

func (s *InitCarrierRepairmobileRequest) SetProductInstanceId(v string) *InitCarrierRepairmobileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitCarrierRepairmobileRequest) SetOuterOrderNo(v string) *InitCarrierRepairmobileRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *InitCarrierRepairmobileRequest) SetProcessId(v string) *InitCarrierRepairmobileRequest {
	s.ProcessId = &v
	return s
}

func (s *InitCarrierRepairmobileRequest) SetCarrier(v string) *InitCarrierRepairmobileRequest {
	s.Carrier = &v
	return s
}

func (s *InitCarrierRepairmobileRequest) SetEncryptType(v string) *InitCarrierRepairmobileRequest {
	s.EncryptType = &v
	return s
}

func (s *InitCarrierRepairmobileRequest) SetCertNo(v string) *InitCarrierRepairmobileRequest {
	s.CertNo = &v
	return s
}

func (s *InitCarrierRepairmobileRequest) SetName(v string) *InitCarrierRepairmobileRequest {
	s.Name = &v
	return s
}

func (s *InitCarrierRepairmobileRequest) SetMobile(v string) *InitCarrierRepairmobileRequest {
	s.Mobile = &v
	return s
}

type InitCarrierRepairmobileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 流程ID，和客户入参的process_id一致
	ProcessId *string `json:"process_id,omitempty" xml:"process_id,omitempty"`
}

func (s InitCarrierRepairmobileResponse) String() string {
	return tea.Prettify(s)
}

func (s InitCarrierRepairmobileResponse) GoString() string {
	return s.String()
}

func (s *InitCarrierRepairmobileResponse) SetReqMsgId(v string) *InitCarrierRepairmobileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitCarrierRepairmobileResponse) SetResultCode(v string) *InitCarrierRepairmobileResponse {
	s.ResultCode = &v
	return s
}

func (s *InitCarrierRepairmobileResponse) SetResultMsg(v string) *InitCarrierRepairmobileResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitCarrierRepairmobileResponse) SetProcessId(v string) *InitCarrierRepairmobileResponse {
	s.ProcessId = &v
	return s
}

type QueryCarrierRepairmobileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 失联修复初始化的流程ID
	ProcessId *string `json:"process_id,omitempty" xml:"process_id,omitempty" require:"true"`
}

func (s QueryCarrierRepairmobileRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCarrierRepairmobileRequest) GoString() string {
	return s.String()
}

func (s *QueryCarrierRepairmobileRequest) SetAuthToken(v string) *QueryCarrierRepairmobileRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCarrierRepairmobileRequest) SetProductInstanceId(v string) *QueryCarrierRepairmobileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCarrierRepairmobileRequest) SetOuterOrderNo(v string) *QueryCarrierRepairmobileRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QueryCarrierRepairmobileRequest) SetProcessId(v string) *QueryCarrierRepairmobileRequest {
	s.ProcessId = &v
	return s
}

type QueryCarrierRepairmobileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 失联人手机号修复数量
	Count *string `json:"count,omitempty" xml:"count,omitempty"`
}

func (s QueryCarrierRepairmobileResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCarrierRepairmobileResponse) GoString() string {
	return s.String()
}

func (s *QueryCarrierRepairmobileResponse) SetReqMsgId(v string) *QueryCarrierRepairmobileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCarrierRepairmobileResponse) SetResultCode(v string) *QueryCarrierRepairmobileResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCarrierRepairmobileResponse) SetResultMsg(v string) *QueryCarrierRepairmobileResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCarrierRepairmobileResponse) SetCount(v string) *QueryCarrierRepairmobileResponse {
	s.Count = &v
	return s
}

type BindCarrierRepairmobileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 失联修复初始化的流程ID
	ProcessId *string `json:"process_id,omitempty" xml:"process_id,omitempty" require:"true"`
	// 身份证号，和失联修复初始化接口身份证号加密方式保持一致
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 修复的手机号排序，例如绑定第一个修复手机号填入1
	MobileNum *string `json:"mobile_num,omitempty" xml:"mobile_num,omitempty" require:"true"`
	// 主叫号码
	MobileA *string `json:"mobile_a,omitempty" xml:"mobile_a,omitempty" require:"true"`
	// 主叫类型1-手机号码 2-固话
	// 默认为1
	MobileType *string `json:"mobile_type,omitempty" xml:"mobile_type,omitempty"`
}

func (s BindCarrierRepairmobileRequest) String() string {
	return tea.Prettify(s)
}

func (s BindCarrierRepairmobileRequest) GoString() string {
	return s.String()
}

func (s *BindCarrierRepairmobileRequest) SetAuthToken(v string) *BindCarrierRepairmobileRequest {
	s.AuthToken = &v
	return s
}

func (s *BindCarrierRepairmobileRequest) SetProductInstanceId(v string) *BindCarrierRepairmobileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BindCarrierRepairmobileRequest) SetOuterOrderNo(v string) *BindCarrierRepairmobileRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *BindCarrierRepairmobileRequest) SetProcessId(v string) *BindCarrierRepairmobileRequest {
	s.ProcessId = &v
	return s
}

func (s *BindCarrierRepairmobileRequest) SetCertNo(v string) *BindCarrierRepairmobileRequest {
	s.CertNo = &v
	return s
}

func (s *BindCarrierRepairmobileRequest) SetMobileNum(v string) *BindCarrierRepairmobileRequest {
	s.MobileNum = &v
	return s
}

func (s *BindCarrierRepairmobileRequest) SetMobileA(v string) *BindCarrierRepairmobileRequest {
	s.MobileA = &v
	return s
}

func (s *BindCarrierRepairmobileRequest) SetMobileType(v string) *BindCarrierRepairmobileRequest {
	s.MobileType = &v
	return s
}

type BindCarrierRepairmobileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 小号（实际拨打返回的虚拟小号）
	MobileX *string `json:"mobile_x,omitempty" xml:"mobile_x,omitempty"`
}

func (s BindCarrierRepairmobileResponse) String() string {
	return tea.Prettify(s)
}

func (s BindCarrierRepairmobileResponse) GoString() string {
	return s.String()
}

func (s *BindCarrierRepairmobileResponse) SetReqMsgId(v string) *BindCarrierRepairmobileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindCarrierRepairmobileResponse) SetResultCode(v string) *BindCarrierRepairmobileResponse {
	s.ResultCode = &v
	return s
}

func (s *BindCarrierRepairmobileResponse) SetResultMsg(v string) *BindCarrierRepairmobileResponse {
	s.ResultMsg = &v
	return s
}

func (s *BindCarrierRepairmobileResponse) SetMobileX(v string) *BindCarrierRepairmobileResponse {
	s.MobileX = &v
	return s
}

type ApplyExtOrgdataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 是	入参加密模式：
	// "0"（默认值）：不加密；
	// "4"：RSA加密
	EncryptType *string `json:"encrypt_type,omitempty" xml:"encrypt_type,omitempty" require:"true"`
	// 星火保
	OrgName *string `json:"org_name,omitempty" xml:"org_name,omitempty" require:"true"`
	// 外部机构数据类型，取值如下： AXINSUR_BANK_LIVENESS：星火保蚂蚁推荐卡
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty" require:"true"`
	// 机构上报数据，json数组
	DataContent *string `json:"data_content,omitempty" xml:"data_content,omitempty" require:"true"`
}

func (s ApplyExtOrgdataRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyExtOrgdataRequest) GoString() string {
	return s.String()
}

func (s *ApplyExtOrgdataRequest) SetAuthToken(v string) *ApplyExtOrgdataRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyExtOrgdataRequest) SetProductInstanceId(v string) *ApplyExtOrgdataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyExtOrgdataRequest) SetOuterOrderNo(v string) *ApplyExtOrgdataRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *ApplyExtOrgdataRequest) SetEncryptType(v string) *ApplyExtOrgdataRequest {
	s.EncryptType = &v
	return s
}

func (s *ApplyExtOrgdataRequest) SetOrgName(v string) *ApplyExtOrgdataRequest {
	s.OrgName = &v
	return s
}

func (s *ApplyExtOrgdataRequest) SetDataType(v string) *ApplyExtOrgdataRequest {
	s.DataType = &v
	return s
}

func (s *ApplyExtOrgdataRequest) SetDataContent(v string) *ApplyExtOrgdataRequest {
	s.DataContent = &v
	return s
}

type ApplyExtOrgdataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 上报结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s ApplyExtOrgdataResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyExtOrgdataResponse) GoString() string {
	return s.String()
}

func (s *ApplyExtOrgdataResponse) SetReqMsgId(v string) *ApplyExtOrgdataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyExtOrgdataResponse) SetResultCode(v string) *ApplyExtOrgdataResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyExtOrgdataResponse) SetResultMsg(v string) *ApplyExtOrgdataResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyExtOrgdataResponse) SetResult(v string) *ApplyExtOrgdataResponse {
	s.Result = &v
	return s
}

type CreateFaceverifyServerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 认证模式码
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty" require:"true"`
	// 场景ID
	SceneId *string `json:"scene_id,omitempty" xml:"scene_id,omitempty" require:"true"`
	// 身份信息来源类型，如证件
	IdentityType *string `json:"identity_type,omitempty" xml:"identity_type,omitempty" require:"true"`
	// 证件类型，如身份证
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 真实姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// h5认证完成后，服务端回调此地址通知商户认证结果
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// cert_name、cert_no两个字段的传入模式。0：明文1：密文
	EncType *string `json:"enc_type,omitempty" xml:"enc_type,omitempty"`
	// 预留扩展参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 自定义比对源人脸图像，base64编码格式
	FacialPictureRef *string `json:"facial_picture_ref,omitempty" xml:"facial_picture_ref,omitempty"`
	// metainfo 环境参数，需要通过客户端 SDK 获取
	MetaInfo *string `json:"meta_info,omitempty" xml:"meta_info,omitempty"`
	// 回跳地址
	ReturnUrl *string `json:"return_url,omitempty" xml:"return_url,omitempty"`
	// 商户自定义的用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户的IP
	UserIp *string `json:"user_ip,omitempty" xml:"user_ip,omitempty"`
	// 用户的手机号
	UserMobile *string `json:"user_mobile,omitempty" xml:"user_mobile,omitempty"`
	// callbackUrl回调时是否需要重试，默认false(不需要重试)
	CallbackNeedRetry *string `json:"callback_need_retry,omitempty" xml:"callback_need_retry,omitempty"`
	// 活体检测的类型
	Model *string `json:"model,omitempty" xml:"model,omitempty"`
	// 图片文件
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
}

func (s CreateFaceverifyServerRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateFaceverifyServerRequest) GoString() string {
	return s.String()
}

func (s *CreateFaceverifyServerRequest) SetAuthToken(v string) *CreateFaceverifyServerRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateFaceverifyServerRequest) SetProductInstanceId(v string) *CreateFaceverifyServerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateFaceverifyServerRequest) SetOuterOrderNo(v string) *CreateFaceverifyServerRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CreateFaceverifyServerRequest) SetBizCode(v string) *CreateFaceverifyServerRequest {
	s.BizCode = &v
	return s
}

func (s *CreateFaceverifyServerRequest) SetSceneId(v string) *CreateFaceverifyServerRequest {
	s.SceneId = &v
	return s
}

func (s *CreateFaceverifyServerRequest) SetIdentityType(v string) *CreateFaceverifyServerRequest {
	s.IdentityType = &v
	return s
}

func (s *CreateFaceverifyServerRequest) SetCertType(v string) *CreateFaceverifyServerRequest {
	s.CertType = &v
	return s
}

func (s *CreateFaceverifyServerRequest) SetCertName(v string) *CreateFaceverifyServerRequest {
	s.CertName = &v
	return s
}

func (s *CreateFaceverifyServerRequest) SetCertNo(v string) *CreateFaceverifyServerRequest {
	s.CertNo = &v
	return s
}

func (s *CreateFaceverifyServerRequest) SetCallbackUrl(v string) *CreateFaceverifyServerRequest {
	s.CallbackUrl = &v
	return s
}

func (s *CreateFaceverifyServerRequest) SetEncType(v string) *CreateFaceverifyServerRequest {
	s.EncType = &v
	return s
}

func (s *CreateFaceverifyServerRequest) SetExternParam(v string) *CreateFaceverifyServerRequest {
	s.ExternParam = &v
	return s
}

func (s *CreateFaceverifyServerRequest) SetFacialPictureRef(v string) *CreateFaceverifyServerRequest {
	s.FacialPictureRef = &v
	return s
}

func (s *CreateFaceverifyServerRequest) SetMetaInfo(v string) *CreateFaceverifyServerRequest {
	s.MetaInfo = &v
	return s
}

func (s *CreateFaceverifyServerRequest) SetReturnUrl(v string) *CreateFaceverifyServerRequest {
	s.ReturnUrl = &v
	return s
}

func (s *CreateFaceverifyServerRequest) SetUserId(v string) *CreateFaceverifyServerRequest {
	s.UserId = &v
	return s
}

func (s *CreateFaceverifyServerRequest) SetUserIp(v string) *CreateFaceverifyServerRequest {
	s.UserIp = &v
	return s
}

func (s *CreateFaceverifyServerRequest) SetUserMobile(v string) *CreateFaceverifyServerRequest {
	s.UserMobile = &v
	return s
}

func (s *CreateFaceverifyServerRequest) SetCallbackNeedRetry(v string) *CreateFaceverifyServerRequest {
	s.CallbackNeedRetry = &v
	return s
}

func (s *CreateFaceverifyServerRequest) SetModel(v string) *CreateFaceverifyServerRequest {
	s.Model = &v
	return s
}

func (s *CreateFaceverifyServerRequest) SetFileObject(v io.Reader) *CreateFaceverifyServerRequest {
	s.FileObject = v
	return s
}

func (s *CreateFaceverifyServerRequest) SetFileObjectName(v string) *CreateFaceverifyServerRequest {
	s.FileObjectName = &v
	return s
}

func (s *CreateFaceverifyServerRequest) SetFileId(v string) *CreateFaceverifyServerRequest {
	s.FileId = &v
	return s
}

type CreateFaceverifyServerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实人认证唯一标识
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 认证地址。只在特定场景返回。
	CertifyUrl *string `json:"certify_url,omitempty" xml:"certify_url,omitempty"`
}

func (s CreateFaceverifyServerResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateFaceverifyServerResponse) GoString() string {
	return s.String()
}

func (s *CreateFaceverifyServerResponse) SetReqMsgId(v string) *CreateFaceverifyServerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateFaceverifyServerResponse) SetResultCode(v string) *CreateFaceverifyServerResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateFaceverifyServerResponse) SetResultMsg(v string) *CreateFaceverifyServerResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateFaceverifyServerResponse) SetCertifyId(v string) *CreateFaceverifyServerResponse {
	s.CertifyId = &v
	return s
}

func (s *CreateFaceverifyServerResponse) SetCertifyUrl(v string) *CreateFaceverifyServerResponse {
	s.CertifyUrl = &v
	return s
}

type QueryFaceverifyServerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 实人认证唯一标识
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 场景ID
	SceneId *string `json:"scene_id,omitempty" xml:"scene_id,omitempty" require:"true"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 认证材料（如人脸图像）的哈希
	MaterialHash *string `json:"material_hash,omitempty" xml:"material_hash,omitempty"`
}

func (s QueryFaceverifyServerRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceverifyServerRequest) GoString() string {
	return s.String()
}

func (s *QueryFaceverifyServerRequest) SetAuthToken(v string) *QueryFaceverifyServerRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFaceverifyServerRequest) SetProductInstanceId(v string) *QueryFaceverifyServerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFaceverifyServerRequest) SetCertifyId(v string) *QueryFaceverifyServerRequest {
	s.CertifyId = &v
	return s
}

func (s *QueryFaceverifyServerRequest) SetOuterOrderNo(v string) *QueryFaceverifyServerRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QueryFaceverifyServerRequest) SetSceneId(v string) *QueryFaceverifyServerRequest {
	s.SceneId = &v
	return s
}

func (s *QueryFaceverifyServerRequest) SetExternParam(v string) *QueryFaceverifyServerRequest {
	s.ExternParam = &v
	return s
}

func (s *QueryFaceverifyServerRequest) SetMaterialHash(v string) *QueryFaceverifyServerRequest {
	s.MaterialHash = &v
	return s
}

type QueryFaceverifyServerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证的主体信息，一般的认证场景返回为空
	IdentityInfo *string `json:"identity_info,omitempty" xml:"identity_info,omitempty"`
	// 认证主体附件信息，一般的认证场景都是返回空
	MaterialInfo *string `json:"material_info,omitempty" xml:"material_info,omitempty"`
	// 认证材料哈希是否匹配
	MaterialMatched *string `json:"material_matched,omitempty" xml:"material_matched,omitempty"`
	// 是否通过，通过为T，不通过为F
	Passed *string `json:"passed,omitempty" xml:"passed,omitempty"`
	// 业务失败原因
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty"`
}

func (s QueryFaceverifyServerResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceverifyServerResponse) GoString() string {
	return s.String()
}

func (s *QueryFaceverifyServerResponse) SetReqMsgId(v string) *QueryFaceverifyServerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFaceverifyServerResponse) SetResultCode(v string) *QueryFaceverifyServerResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFaceverifyServerResponse) SetResultMsg(v string) *QueryFaceverifyServerResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFaceverifyServerResponse) SetIdentityInfo(v string) *QueryFaceverifyServerResponse {
	s.IdentityInfo = &v
	return s
}

func (s *QueryFaceverifyServerResponse) SetMaterialInfo(v string) *QueryFaceverifyServerResponse {
	s.MaterialInfo = &v
	return s
}

func (s *QueryFaceverifyServerResponse) SetMaterialMatched(v string) *QueryFaceverifyServerResponse {
	s.MaterialMatched = &v
	return s
}

func (s *QueryFaceverifyServerResponse) SetPassed(v string) *QueryFaceverifyServerResponse {
	s.Passed = &v
	return s
}

func (s *QueryFaceverifyServerResponse) SetReason(v string) *QueryFaceverifyServerResponse {
	s.Reason = &v
	return s
}

type QueryBankLivenessplusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求ID
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 加密方式
	EncryptType *string `json:"encrypt_type,omitempty" xml:"encrypt_type,omitempty" require:"true"`
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 银行编码
	BankCode *string `json:"bank_code,omitempty" xml:"bank_code,omitempty" require:"true"`
	// 1=借记卡+贷记卡（默认）；2=借记卡
	BankCardType *string `json:"bank_card_type,omitempty" xml:"bank_card_type,omitempty"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 扩展信息，预留字段
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s QueryBankLivenessplusRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBankLivenessplusRequest) GoString() string {
	return s.String()
}

func (s *QueryBankLivenessplusRequest) SetAuthToken(v string) *QueryBankLivenessplusRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBankLivenessplusRequest) SetProductInstanceId(v string) *QueryBankLivenessplusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBankLivenessplusRequest) SetOuterOrderNo(v string) *QueryBankLivenessplusRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QueryBankLivenessplusRequest) SetEncryptType(v string) *QueryBankLivenessplusRequest {
	s.EncryptType = &v
	return s
}

func (s *QueryBankLivenessplusRequest) SetCertNo(v string) *QueryBankLivenessplusRequest {
	s.CertNo = &v
	return s
}

func (s *QueryBankLivenessplusRequest) SetBankCode(v string) *QueryBankLivenessplusRequest {
	s.BankCode = &v
	return s
}

func (s *QueryBankLivenessplusRequest) SetBankCardType(v string) *QueryBankLivenessplusRequest {
	s.BankCardType = &v
	return s
}

func (s *QueryBankLivenessplusRequest) SetCertName(v string) *QueryBankLivenessplusRequest {
	s.CertName = &v
	return s
}

func (s *QueryBankLivenessplusRequest) SetMobile(v string) *QueryBankLivenessplusRequest {
	s.Mobile = &v
	return s
}

func (s *QueryBankLivenessplusRequest) SetExternParam(v string) *QueryBankLivenessplusRequest {
	s.ExternParam = &v
	return s
}

type QueryBankLivenessplusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 银行活跃度详情，可解析为JSONArray。
	LivenessInfo *string `json:"liveness_info,omitempty" xml:"liveness_info,omitempty"`
	// 扩展信息，预留字段
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s QueryBankLivenessplusResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBankLivenessplusResponse) GoString() string {
	return s.String()
}

func (s *QueryBankLivenessplusResponse) SetReqMsgId(v string) *QueryBankLivenessplusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBankLivenessplusResponse) SetResultCode(v string) *QueryBankLivenessplusResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBankLivenessplusResponse) SetResultMsg(v string) *QueryBankLivenessplusResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBankLivenessplusResponse) SetLivenessInfo(v string) *QueryBankLivenessplusResponse {
	s.LivenessInfo = &v
	return s
}

func (s *QueryBankLivenessplusResponse) SetExternInfo(v string) *QueryBankLivenessplusResponse {
	s.ExternInfo = &v
	return s
}

type ExecFaceverifyServermodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 真实姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// cert_name、cert_no两个字段的传入模式0：明文 1：密文
	EncType *string `json:"enc_type,omitempty" xml:"enc_type,omitempty"`
	// 证件类型，如身份证
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty"`
	// 预留扩展参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 自定义比对源人脸图像，base64编码格式
	FacialPictureRef *string `json:"facial_picture_ref,omitempty" xml:"facial_picture_ref,omitempty"`
	// 身份信息来源类型，如证件
	IdentityType *string `json:"identity_type,omitempty" xml:"identity_type,omitempty" require:"true"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 场景ID
	SceneId *string `json:"scene_id,omitempty" xml:"scene_id,omitempty" require:"true"`
	// 商户自定义的用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户的IP
	UserIp *string `json:"user_ip,omitempty" xml:"user_ip,omitempty"`
	// 用户的手机号（或其哈希值）
	UserMobile *string `json:"user_mobile,omitempty" xml:"user_mobile,omitempty"`
	// 待认证的人脸图像，base64编码格式
	FacialPictureAuth *string `json:"facial_picture_auth,omitempty" xml:"facial_picture_auth,omitempty"`
	// 视频文件
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
}

func (s ExecFaceverifyServermodeRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecFaceverifyServermodeRequest) GoString() string {
	return s.String()
}

func (s *ExecFaceverifyServermodeRequest) SetAuthToken(v string) *ExecFaceverifyServermodeRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecFaceverifyServermodeRequest) SetProductInstanceId(v string) *ExecFaceverifyServermodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecFaceverifyServermodeRequest) SetCertName(v string) *ExecFaceverifyServermodeRequest {
	s.CertName = &v
	return s
}

func (s *ExecFaceverifyServermodeRequest) SetCertNo(v string) *ExecFaceverifyServermodeRequest {
	s.CertNo = &v
	return s
}

func (s *ExecFaceverifyServermodeRequest) SetEncType(v string) *ExecFaceverifyServermodeRequest {
	s.EncType = &v
	return s
}

func (s *ExecFaceverifyServermodeRequest) SetCertType(v string) *ExecFaceverifyServermodeRequest {
	s.CertType = &v
	return s
}

func (s *ExecFaceverifyServermodeRequest) SetExternParam(v string) *ExecFaceverifyServermodeRequest {
	s.ExternParam = &v
	return s
}

func (s *ExecFaceverifyServermodeRequest) SetFacialPictureRef(v string) *ExecFaceverifyServermodeRequest {
	s.FacialPictureRef = &v
	return s
}

func (s *ExecFaceverifyServermodeRequest) SetIdentityType(v string) *ExecFaceverifyServermodeRequest {
	s.IdentityType = &v
	return s
}

func (s *ExecFaceverifyServermodeRequest) SetOuterOrderNo(v string) *ExecFaceverifyServermodeRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *ExecFaceverifyServermodeRequest) SetSceneId(v string) *ExecFaceverifyServermodeRequest {
	s.SceneId = &v
	return s
}

func (s *ExecFaceverifyServermodeRequest) SetUserId(v string) *ExecFaceverifyServermodeRequest {
	s.UserId = &v
	return s
}

func (s *ExecFaceverifyServermodeRequest) SetUserIp(v string) *ExecFaceverifyServermodeRequest {
	s.UserIp = &v
	return s
}

func (s *ExecFaceverifyServermodeRequest) SetUserMobile(v string) *ExecFaceverifyServermodeRequest {
	s.UserMobile = &v
	return s
}

func (s *ExecFaceverifyServermodeRequest) SetFacialPictureAuth(v string) *ExecFaceverifyServermodeRequest {
	s.FacialPictureAuth = &v
	return s
}

func (s *ExecFaceverifyServermodeRequest) SetFileObject(v io.Reader) *ExecFaceverifyServermodeRequest {
	s.FileObject = v
	return s
}

func (s *ExecFaceverifyServermodeRequest) SetFileObjectName(v string) *ExecFaceverifyServermodeRequest {
	s.FileObjectName = &v
	return s
}

func (s *ExecFaceverifyServermodeRequest) SetFileId(v string) *ExecFaceverifyServermodeRequest {
	s.FileId = &v
	return s
}

type ExecFaceverifyServermodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证ID
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 是否通过，通过为T，不通过为F
	Passed *string `json:"passed,omitempty" xml:"passed,omitempty"`
	// 业务失败原因
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty"`
	// 认证主体附件信息，包含共计类型等
	MaterialInfo *string `json:"material_info,omitempty" xml:"material_info,omitempty"`
}

func (s ExecFaceverifyServermodeResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecFaceverifyServermodeResponse) GoString() string {
	return s.String()
}

func (s *ExecFaceverifyServermodeResponse) SetReqMsgId(v string) *ExecFaceverifyServermodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecFaceverifyServermodeResponse) SetResultCode(v string) *ExecFaceverifyServermodeResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecFaceverifyServermodeResponse) SetResultMsg(v string) *ExecFaceverifyServermodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecFaceverifyServermodeResponse) SetCertifyId(v string) *ExecFaceverifyServermodeResponse {
	s.CertifyId = &v
	return s
}

func (s *ExecFaceverifyServermodeResponse) SetPassed(v string) *ExecFaceverifyServermodeResponse {
	s.Passed = &v
	return s
}

func (s *ExecFaceverifyServermodeResponse) SetReason(v string) *ExecFaceverifyServermodeResponse {
	s.Reason = &v
	return s
}

func (s *ExecFaceverifyServermodeResponse) SetMaterialInfo(v string) *ExecFaceverifyServermodeResponse {
	s.MaterialInfo = &v
	return s
}

type CreateAlipayverifyServerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 认证模式码
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty" require:"true"`
	// 场景ID
	SceneId *string `json:"scene_id,omitempty" xml:"scene_id,omitempty" require:"true"`
	// 身份信息来源类型，如证件
	IdentityType *string `json:"identity_type,omitempty" xml:"identity_type,omitempty" require:"true"`
	// 证件类型，如身份证
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 真实姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// h5认证完成后，服务端回调此地址通知商户认证结果
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// cert_name、cert_no两个字段的传入模式。0：明文1：密文
	EncType *string `json:"enc_type,omitempty" xml:"enc_type,omitempty"`
	// 预留扩展参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 自定义比对源人脸图像，base64编码格式
	FacialPictureRef *string `json:"facial_picture_ref,omitempty" xml:"facial_picture_ref,omitempty"`
	// metainfo 环境参数，需要通过客户端 SDK 获取
	MetaInfo *string `json:"meta_info,omitempty" xml:"meta_info,omitempty"`
	// 回跳地址
	ReturnUrl *string `json:"return_url,omitempty" xml:"return_url,omitempty"`
	// 商户自定义的用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户的IP
	UserIp *string `json:"user_ip,omitempty" xml:"user_ip,omitempty"`
	// 用户的手机号
	UserMobile *string `json:"user_mobile,omitempty" xml:"user_mobile,omitempty"`
	// callbackUrl回调时是否需要重试，默认false(不需要重试)
	CallbackNeedRetry *string `json:"callback_need_retry,omitempty" xml:"callback_need_retry,omitempty"`
	// 活体检测的类型
	Model *string `json:"model,omitempty" xml:"model,omitempty"`
}

func (s CreateAlipayverifyServerRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAlipayverifyServerRequest) GoString() string {
	return s.String()
}

func (s *CreateAlipayverifyServerRequest) SetAuthToken(v string) *CreateAlipayverifyServerRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAlipayverifyServerRequest) SetProductInstanceId(v string) *CreateAlipayverifyServerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAlipayverifyServerRequest) SetOuterOrderNo(v string) *CreateAlipayverifyServerRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CreateAlipayverifyServerRequest) SetBizCode(v string) *CreateAlipayverifyServerRequest {
	s.BizCode = &v
	return s
}

func (s *CreateAlipayverifyServerRequest) SetSceneId(v string) *CreateAlipayverifyServerRequest {
	s.SceneId = &v
	return s
}

func (s *CreateAlipayverifyServerRequest) SetIdentityType(v string) *CreateAlipayverifyServerRequest {
	s.IdentityType = &v
	return s
}

func (s *CreateAlipayverifyServerRequest) SetCertType(v string) *CreateAlipayverifyServerRequest {
	s.CertType = &v
	return s
}

func (s *CreateAlipayverifyServerRequest) SetCertName(v string) *CreateAlipayverifyServerRequest {
	s.CertName = &v
	return s
}

func (s *CreateAlipayverifyServerRequest) SetCertNo(v string) *CreateAlipayverifyServerRequest {
	s.CertNo = &v
	return s
}

func (s *CreateAlipayverifyServerRequest) SetCallbackUrl(v string) *CreateAlipayverifyServerRequest {
	s.CallbackUrl = &v
	return s
}

func (s *CreateAlipayverifyServerRequest) SetEncType(v string) *CreateAlipayverifyServerRequest {
	s.EncType = &v
	return s
}

func (s *CreateAlipayverifyServerRequest) SetExternParam(v string) *CreateAlipayverifyServerRequest {
	s.ExternParam = &v
	return s
}

func (s *CreateAlipayverifyServerRequest) SetFacialPictureRef(v string) *CreateAlipayverifyServerRequest {
	s.FacialPictureRef = &v
	return s
}

func (s *CreateAlipayverifyServerRequest) SetMetaInfo(v string) *CreateAlipayverifyServerRequest {
	s.MetaInfo = &v
	return s
}

func (s *CreateAlipayverifyServerRequest) SetReturnUrl(v string) *CreateAlipayverifyServerRequest {
	s.ReturnUrl = &v
	return s
}

func (s *CreateAlipayverifyServerRequest) SetUserId(v string) *CreateAlipayverifyServerRequest {
	s.UserId = &v
	return s
}

func (s *CreateAlipayverifyServerRequest) SetUserIp(v string) *CreateAlipayverifyServerRequest {
	s.UserIp = &v
	return s
}

func (s *CreateAlipayverifyServerRequest) SetUserMobile(v string) *CreateAlipayverifyServerRequest {
	s.UserMobile = &v
	return s
}

func (s *CreateAlipayverifyServerRequest) SetCallbackNeedRetry(v string) *CreateAlipayverifyServerRequest {
	s.CallbackNeedRetry = &v
	return s
}

func (s *CreateAlipayverifyServerRequest) SetModel(v string) *CreateAlipayverifyServerRequest {
	s.Model = &v
	return s
}

type CreateAlipayverifyServerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实人认证唯一标识
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 认证地址。只在特定场景返回。
	CertifyUrl *string `json:"certify_url,omitempty" xml:"certify_url,omitempty"`
}

func (s CreateAlipayverifyServerResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAlipayverifyServerResponse) GoString() string {
	return s.String()
}

func (s *CreateAlipayverifyServerResponse) SetReqMsgId(v string) *CreateAlipayverifyServerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAlipayverifyServerResponse) SetResultCode(v string) *CreateAlipayverifyServerResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAlipayverifyServerResponse) SetResultMsg(v string) *CreateAlipayverifyServerResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAlipayverifyServerResponse) SetCertifyId(v string) *CreateAlipayverifyServerResponse {
	s.CertifyId = &v
	return s
}

func (s *CreateAlipayverifyServerResponse) SetCertifyUrl(v string) *CreateAlipayverifyServerResponse {
	s.CertifyUrl = &v
	return s
}

type QueryAlipayverifyServerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 实人认证唯一标识
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 场景ID
	SceneId *string `json:"scene_id,omitempty" xml:"scene_id,omitempty" require:"true"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 认证材料（如人脸图像）的哈希
	MaterialHash *string `json:"material_hash,omitempty" xml:"material_hash,omitempty"`
}

func (s QueryAlipayverifyServerRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAlipayverifyServerRequest) GoString() string {
	return s.String()
}

func (s *QueryAlipayverifyServerRequest) SetAuthToken(v string) *QueryAlipayverifyServerRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAlipayverifyServerRequest) SetProductInstanceId(v string) *QueryAlipayverifyServerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAlipayverifyServerRequest) SetCertifyId(v string) *QueryAlipayverifyServerRequest {
	s.CertifyId = &v
	return s
}

func (s *QueryAlipayverifyServerRequest) SetOuterOrderNo(v string) *QueryAlipayverifyServerRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QueryAlipayverifyServerRequest) SetSceneId(v string) *QueryAlipayverifyServerRequest {
	s.SceneId = &v
	return s
}

func (s *QueryAlipayverifyServerRequest) SetExternParam(v string) *QueryAlipayverifyServerRequest {
	s.ExternParam = &v
	return s
}

func (s *QueryAlipayverifyServerRequest) SetMaterialHash(v string) *QueryAlipayverifyServerRequest {
	s.MaterialHash = &v
	return s
}

type QueryAlipayverifyServerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证的主体信息，一般的认证场景返回为空
	IdentityInfo *string `json:"identity_info,omitempty" xml:"identity_info,omitempty"`
	// 认证主体附件信息，一般的认证场景都是返回空
	MaterialInfo *string `json:"material_info,omitempty" xml:"material_info,omitempty"`
	// 是否通过，通过为T，不通过为F
	MaterialMatched *string `json:"material_matched,omitempty" xml:"material_matched,omitempty"`
	// 是否通过，通过为T，不通过为F
	Passed *string `json:"passed,omitempty" xml:"passed,omitempty"`
	// 业务失败原因
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty"`
}

func (s QueryAlipayverifyServerResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAlipayverifyServerResponse) GoString() string {
	return s.String()
}

func (s *QueryAlipayverifyServerResponse) SetReqMsgId(v string) *QueryAlipayverifyServerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAlipayverifyServerResponse) SetResultCode(v string) *QueryAlipayverifyServerResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAlipayverifyServerResponse) SetResultMsg(v string) *QueryAlipayverifyServerResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAlipayverifyServerResponse) SetIdentityInfo(v string) *QueryAlipayverifyServerResponse {
	s.IdentityInfo = &v
	return s
}

func (s *QueryAlipayverifyServerResponse) SetMaterialInfo(v string) *QueryAlipayverifyServerResponse {
	s.MaterialInfo = &v
	return s
}

func (s *QueryAlipayverifyServerResponse) SetMaterialMatched(v string) *QueryAlipayverifyServerResponse {
	s.MaterialMatched = &v
	return s
}

func (s *QueryAlipayverifyServerResponse) SetPassed(v string) *QueryAlipayverifyServerResponse {
	s.Passed = &v
	return s
}

func (s *QueryAlipayverifyServerResponse) SetReason(v string) *QueryAlipayverifyServerResponse {
	s.Reason = &v
	return s
}

type CheckCarTwometaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 入参加密模式：
	// "0"：不加密；
	EncryptType *string `json:"encrypt_type,omitempty" xml:"encrypt_type,omitempty" require:"true"`
	// 车牌号
	LicensePlate *string `json:"license_plate,omitempty" xml:"license_plate,omitempty" require:"true"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 扩展信息，预留字段
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s CheckCarTwometaRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckCarTwometaRequest) GoString() string {
	return s.String()
}

func (s *CheckCarTwometaRequest) SetAuthToken(v string) *CheckCarTwometaRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckCarTwometaRequest) SetProductInstanceId(v string) *CheckCarTwometaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckCarTwometaRequest) SetOuterOrderNo(v string) *CheckCarTwometaRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CheckCarTwometaRequest) SetEncryptType(v string) *CheckCarTwometaRequest {
	s.EncryptType = &v
	return s
}

func (s *CheckCarTwometaRequest) SetLicensePlate(v string) *CheckCarTwometaRequest {
	s.LicensePlate = &v
	return s
}

func (s *CheckCarTwometaRequest) SetCertName(v string) *CheckCarTwometaRequest {
	s.CertName = &v
	return s
}

func (s *CheckCarTwometaRequest) SetExternParam(v string) *CheckCarTwometaRequest {
	s.ExternParam = &v
	return s
}

type CheckCarTwometaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 扩展信息，为JSONObject。
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s CheckCarTwometaResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckCarTwometaResponse) GoString() string {
	return s.String()
}

func (s *CheckCarTwometaResponse) SetReqMsgId(v string) *CheckCarTwometaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckCarTwometaResponse) SetResultCode(v string) *CheckCarTwometaResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckCarTwometaResponse) SetResultMsg(v string) *CheckCarTwometaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckCarTwometaResponse) SetExternInfo(v string) *CheckCarTwometaResponse {
	s.ExternInfo = &v
	return s
}

type QueryEducationBackgroundRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 入参加密模式：
	// "0"：不加密；
	EncryptType *string `json:"encrypt_type,omitempty" xml:"encrypt_type,omitempty" require:"true"`
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 扩展信息，预留字段
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s QueryEducationBackgroundRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEducationBackgroundRequest) GoString() string {
	return s.String()
}

func (s *QueryEducationBackgroundRequest) SetAuthToken(v string) *QueryEducationBackgroundRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEducationBackgroundRequest) SetProductInstanceId(v string) *QueryEducationBackgroundRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEducationBackgroundRequest) SetOuterOrderNo(v string) *QueryEducationBackgroundRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QueryEducationBackgroundRequest) SetEncryptType(v string) *QueryEducationBackgroundRequest {
	s.EncryptType = &v
	return s
}

func (s *QueryEducationBackgroundRequest) SetCertNo(v string) *QueryEducationBackgroundRequest {
	s.CertNo = &v
	return s
}

func (s *QueryEducationBackgroundRequest) SetMobile(v string) *QueryEducationBackgroundRequest {
	s.Mobile = &v
	return s
}

func (s *QueryEducationBackgroundRequest) SetCertName(v string) *QueryEducationBackgroundRequest {
	s.CertName = &v
	return s
}

func (s *QueryEducationBackgroundRequest) SetExternParam(v string) *QueryEducationBackgroundRequest {
	s.ExternParam = &v
	return s
}

type QueryEducationBackgroundResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 学历信息，仅当结果码为OK时返回。学历信息字段为一JSONArray。
	EducationInfo *string `json:"education_info,omitempty" xml:"education_info,omitempty"`
	// 扩展信息，预留字段。
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s QueryEducationBackgroundResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEducationBackgroundResponse) GoString() string {
	return s.String()
}

func (s *QueryEducationBackgroundResponse) SetReqMsgId(v string) *QueryEducationBackgroundResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEducationBackgroundResponse) SetResultCode(v string) *QueryEducationBackgroundResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEducationBackgroundResponse) SetResultMsg(v string) *QueryEducationBackgroundResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEducationBackgroundResponse) SetEducationInfo(v string) *QueryEducationBackgroundResponse {
	s.EducationInfo = &v
	return s
}

func (s *QueryEducationBackgroundResponse) SetExternInfo(v string) *QueryEducationBackgroundResponse {
	s.ExternInfo = &v
	return s
}

type QueryBankLivenessfourRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求ID
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 加密方式
	EncryptType *string `json:"encrypt_type,omitempty" xml:"encrypt_type,omitempty" require:"true"`
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 银行编码
	BankCode *string `json:"bank_code,omitempty" xml:"bank_code,omitempty" require:"true"`
	// bank_card_type
	// 1：借记卡+贷记卡（默认）；
	// 2：借记卡
	// 3：贷记卡
	BankCardType *string `json:"bank_card_type,omitempty" xml:"bank_card_type,omitempty"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 扩展信息，预留字段
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s QueryBankLivenessfourRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBankLivenessfourRequest) GoString() string {
	return s.String()
}

func (s *QueryBankLivenessfourRequest) SetAuthToken(v string) *QueryBankLivenessfourRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBankLivenessfourRequest) SetProductInstanceId(v string) *QueryBankLivenessfourRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBankLivenessfourRequest) SetOuterOrderNo(v string) *QueryBankLivenessfourRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QueryBankLivenessfourRequest) SetEncryptType(v string) *QueryBankLivenessfourRequest {
	s.EncryptType = &v
	return s
}

func (s *QueryBankLivenessfourRequest) SetCertNo(v string) *QueryBankLivenessfourRequest {
	s.CertNo = &v
	return s
}

func (s *QueryBankLivenessfourRequest) SetBankCode(v string) *QueryBankLivenessfourRequest {
	s.BankCode = &v
	return s
}

func (s *QueryBankLivenessfourRequest) SetBankCardType(v string) *QueryBankLivenessfourRequest {
	s.BankCardType = &v
	return s
}

func (s *QueryBankLivenessfourRequest) SetCertName(v string) *QueryBankLivenessfourRequest {
	s.CertName = &v
	return s
}

func (s *QueryBankLivenessfourRequest) SetMobile(v string) *QueryBankLivenessfourRequest {
	s.Mobile = &v
	return s
}

func (s *QueryBankLivenessfourRequest) SetExternParam(v string) *QueryBankLivenessfourRequest {
	s.ExternParam = &v
	return s
}

type QueryBankLivenessfourResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 银行活跃度详情，可解析为JSONArray。
	LivenessInfo *string `json:"liveness_info,omitempty" xml:"liveness_info,omitempty"`
	// 扩展信息，预留字段
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s QueryBankLivenessfourResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBankLivenessfourResponse) GoString() string {
	return s.String()
}

func (s *QueryBankLivenessfourResponse) SetReqMsgId(v string) *QueryBankLivenessfourResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBankLivenessfourResponse) SetResultCode(v string) *QueryBankLivenessfourResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBankLivenessfourResponse) SetResultMsg(v string) *QueryBankLivenessfourResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBankLivenessfourResponse) SetLivenessInfo(v string) *QueryBankLivenessfourResponse {
	s.LivenessInfo = &v
	return s
}

func (s *QueryBankLivenessfourResponse) SetExternInfo(v string) *QueryBankLivenessfourResponse {
	s.ExternInfo = &v
	return s
}

type QueryFaceverifyServermaterialRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 实人认证唯一标识
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 场景ID
	SceneId *string `json:"scene_id,omitempty" xml:"scene_id,omitempty" require:"true"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s QueryFaceverifyServermaterialRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceverifyServermaterialRequest) GoString() string {
	return s.String()
}

func (s *QueryFaceverifyServermaterialRequest) SetAuthToken(v string) *QueryFaceverifyServermaterialRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFaceverifyServermaterialRequest) SetProductInstanceId(v string) *QueryFaceverifyServermaterialRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFaceverifyServermaterialRequest) SetCertifyId(v string) *QueryFaceverifyServermaterialRequest {
	s.CertifyId = &v
	return s
}

func (s *QueryFaceverifyServermaterialRequest) SetOuterOrderNo(v string) *QueryFaceverifyServermaterialRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QueryFaceverifyServermaterialRequest) SetSceneId(v string) *QueryFaceverifyServermaterialRequest {
	s.SceneId = &v
	return s
}

func (s *QueryFaceverifyServermaterialRequest) SetExternParam(v string) *QueryFaceverifyServermaterialRequest {
	s.ExternParam = &v
	return s
}

type QueryFaceverifyServermaterialResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证主体附件信息
	MaterialInfo *string `json:"material_info,omitempty" xml:"material_info,omitempty"`
}

func (s QueryFaceverifyServermaterialResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceverifyServermaterialResponse) GoString() string {
	return s.String()
}

func (s *QueryFaceverifyServermaterialResponse) SetReqMsgId(v string) *QueryFaceverifyServermaterialResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFaceverifyServermaterialResponse) SetResultCode(v string) *QueryFaceverifyServermaterialResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFaceverifyServermaterialResponse) SetResultMsg(v string) *QueryFaceverifyServermaterialResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFaceverifyServermaterialResponse) SetMaterialInfo(v string) *QueryFaceverifyServermaterialResponse {
	s.MaterialInfo = &v
	return s
}

type ScaleinImageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 图片
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s ScaleinImageRequest) String() string {
	return tea.Prettify(s)
}

func (s ScaleinImageRequest) GoString() string {
	return s.String()
}

func (s *ScaleinImageRequest) SetAuthToken(v string) *ScaleinImageRequest {
	s.AuthToken = &v
	return s
}

func (s *ScaleinImageRequest) SetProductInstanceId(v string) *ScaleinImageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ScaleinImageRequest) SetFileObject(v io.Reader) *ScaleinImageRequest {
	s.FileObject = v
	return s
}

func (s *ScaleinImageRequest) SetFileObjectName(v string) *ScaleinImageRequest {
	s.FileObjectName = &v
	return s
}

func (s *ScaleinImageRequest) SetFileId(v string) *ScaleinImageRequest {
	s.FileId = &v
	return s
}

type ScaleinImageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 压缩后的图片base64
	Base64 *string `json:"base64,omitempty" xml:"base64,omitempty"`
}

func (s ScaleinImageResponse) String() string {
	return tea.Prettify(s)
}

func (s ScaleinImageResponse) GoString() string {
	return s.String()
}

func (s *ScaleinImageResponse) SetReqMsgId(v string) *ScaleinImageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ScaleinImageResponse) SetResultCode(v string) *ScaleinImageResponse {
	s.ResultCode = &v
	return s
}

func (s *ScaleinImageResponse) SetResultMsg(v string) *ScaleinImageResponse {
	s.ResultMsg = &v
	return s
}

func (s *ScaleinImageResponse) SetBase64(v string) *ScaleinImageResponse {
	s.Base64 = &v
	return s
}

type RecognizeOcrIndividualcardRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 长度不超过32位的0-9A-Za-z字符串。 外部请求ID，由调用方自行生成并自行保证唯一，以便问题定位。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 待识别的卡类型。取值约束：ID_CARD（身份证）;EEP_TO_ML_CARD（港澳来往大陆通行证）;BANK_CARD（银行卡）
	OcrType *string `json:"ocr_type,omitempty" xml:"ocr_type,omitempty" require:"true"`
	// 传入的图片是base64编码的图片还是图片的URL。取值约束：BASE64（类型为base64）；FILE(文件)、URL（暂不支持）
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty" require:"true"`
	// 传入的图片的具体内容，需要与data_type的选择保持一致。
	//
	DataContent *string `json:"data_content,omitempty" xml:"data_content,omitempty"`
	// 证件图片
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 入参data_content是否经AES加密。不填默认不加密。取值约束：0（不加密）；1（加密）
	ReqEncType *string `json:"req_enc_type,omitempty" xml:"req_enc_type,omitempty"`
	// 出参ocr_info是否经AES加密。不填默认不加密。取值约束：0（不加密）；1（加密）
	RespEncType *string `json:"resp_enc_type,omitempty" xml:"resp_enc_type,omitempty"`
	// 经过公钥RSA加密的AES密钥，用于对出参ocr_info加密。当req_enc_type = 1或resp_enc_type = 1时必填。
	EncToken *string `json:"enc_token,omitempty" xml:"enc_token,omitempty"`
	// 是否启用防伪检测，如果启用，出参会输出riskInfo字段。不填默认不启用防伪。取值约束：0（不启用）；1（启用）
	RiskInfoType *string `json:"risk_info_type,omitempty" xml:"risk_info_type,omitempty"`
	// 是否返回身份证头像照片 0：否 1：是 不填默认不返回。
	ReturnPhoto *string `json:"return_photo,omitempty" xml:"return_photo,omitempty"`
	// 是否返回身份证图片 0：否 1：是 不填默认不返回。
	ReturnImage *string `json:"return_image,omitempty" xml:"return_image,omitempty"`
	// 扩展信息JSON串。
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s RecognizeOcrIndividualcardRequest) String() string {
	return tea.Prettify(s)
}

func (s RecognizeOcrIndividualcardRequest) GoString() string {
	return s.String()
}

func (s *RecognizeOcrIndividualcardRequest) SetAuthToken(v string) *RecognizeOcrIndividualcardRequest {
	s.AuthToken = &v
	return s
}

func (s *RecognizeOcrIndividualcardRequest) SetProductInstanceId(v string) *RecognizeOcrIndividualcardRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RecognizeOcrIndividualcardRequest) SetOuterOrderNo(v string) *RecognizeOcrIndividualcardRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *RecognizeOcrIndividualcardRequest) SetOcrType(v string) *RecognizeOcrIndividualcardRequest {
	s.OcrType = &v
	return s
}

func (s *RecognizeOcrIndividualcardRequest) SetDataType(v string) *RecognizeOcrIndividualcardRequest {
	s.DataType = &v
	return s
}

func (s *RecognizeOcrIndividualcardRequest) SetDataContent(v string) *RecognizeOcrIndividualcardRequest {
	s.DataContent = &v
	return s
}

func (s *RecognizeOcrIndividualcardRequest) SetFileObject(v io.Reader) *RecognizeOcrIndividualcardRequest {
	s.FileObject = v
	return s
}

func (s *RecognizeOcrIndividualcardRequest) SetFileObjectName(v string) *RecognizeOcrIndividualcardRequest {
	s.FileObjectName = &v
	return s
}

func (s *RecognizeOcrIndividualcardRequest) SetFileId(v string) *RecognizeOcrIndividualcardRequest {
	s.FileId = &v
	return s
}

func (s *RecognizeOcrIndividualcardRequest) SetReqEncType(v string) *RecognizeOcrIndividualcardRequest {
	s.ReqEncType = &v
	return s
}

func (s *RecognizeOcrIndividualcardRequest) SetRespEncType(v string) *RecognizeOcrIndividualcardRequest {
	s.RespEncType = &v
	return s
}

func (s *RecognizeOcrIndividualcardRequest) SetEncToken(v string) *RecognizeOcrIndividualcardRequest {
	s.EncToken = &v
	return s
}

func (s *RecognizeOcrIndividualcardRequest) SetRiskInfoType(v string) *RecognizeOcrIndividualcardRequest {
	s.RiskInfoType = &v
	return s
}

func (s *RecognizeOcrIndividualcardRequest) SetReturnPhoto(v string) *RecognizeOcrIndividualcardRequest {
	s.ReturnPhoto = &v
	return s
}

func (s *RecognizeOcrIndividualcardRequest) SetReturnImage(v string) *RecognizeOcrIndividualcardRequest {
	s.ReturnImage = &v
	return s
}

func (s *RecognizeOcrIndividualcardRequest) SetExternParam(v string) *RecognizeOcrIndividualcardRequest {
	s.ExternParam = &v
	return s
}

type RecognizeOcrIndividualcardResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 识别结果，为JSON串。如果入参resp_enc_type=1则是经过AES加密后的JSON串。
	OcrInfo *OcrInfo `json:"ocr_info,omitempty" xml:"ocr_info,omitempty"`
	// 防伪结果，为JSON串。如果入参resp_enc_type=1则是经过AES加密后的JSON串。 如果不启用防伪，则不返回该字段。
	RiskInfo *RiskInfo `json:"risk_info,omitempty" xml:"risk_info,omitempty"`
	// 扩展信息JSON串。
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	// 加密后的识别结果
	OcrInfoEncrypt *string `json:"ocr_info_encrypt,omitempty" xml:"ocr_info_encrypt,omitempty"`
}

func (s RecognizeOcrIndividualcardResponse) String() string {
	return tea.Prettify(s)
}

func (s RecognizeOcrIndividualcardResponse) GoString() string {
	return s.String()
}

func (s *RecognizeOcrIndividualcardResponse) SetReqMsgId(v string) *RecognizeOcrIndividualcardResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RecognizeOcrIndividualcardResponse) SetResultCode(v string) *RecognizeOcrIndividualcardResponse {
	s.ResultCode = &v
	return s
}

func (s *RecognizeOcrIndividualcardResponse) SetResultMsg(v string) *RecognizeOcrIndividualcardResponse {
	s.ResultMsg = &v
	return s
}

func (s *RecognizeOcrIndividualcardResponse) SetOcrInfo(v *OcrInfo) *RecognizeOcrIndividualcardResponse {
	s.OcrInfo = v
	return s
}

func (s *RecognizeOcrIndividualcardResponse) SetRiskInfo(v *RiskInfo) *RecognizeOcrIndividualcardResponse {
	s.RiskInfo = v
	return s
}

func (s *RecognizeOcrIndividualcardResponse) SetExtInfo(v string) *RecognizeOcrIndividualcardResponse {
	s.ExtInfo = &v
	return s
}

func (s *RecognizeOcrIndividualcardResponse) SetOcrInfoEncrypt(v string) *RecognizeOcrIndividualcardResponse {
	s.OcrInfoEncrypt = &v
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
				"sdk_version":      tea.String("1.21.20"),
				"_prod_code":       tea.String("REALPERSON"),
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
 * Description: 查询认证的结果和相关信息
 * Summary: 认证查询
 */
func (client *Client) QueryFacevrfServer(request *QueryFacevrfServerRequest) (_result *QueryFacevrfServerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFacevrfServerResponse{}
	_body, _err := client.QueryFacevrfServerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询认证的结果和相关信息
 * Summary: 认证查询
 */
func (client *Client) QueryFacevrfServerEx(request *QueryFacevrfServerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFacevrfServerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFacevrfServerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.facevrf.server.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
 * Summary: 认证创建
 */
func (client *Client) CreateFacevrfServer(request *CreateFacevrfServerRequest) (_result *CreateFacevrfServerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateFacevrfServerResponse{}
	_body, _err := client.CreateFacevrfServerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
 * Summary: 认证创建
 */
func (client *Client) CreateFacevrfServerEx(request *CreateFacevrfServerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateFacevrfServerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateFacevrfServerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.facevrf.server.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
 * Summary: 纯服务端比对
 */
func (client *Client) ExecFacevrfServer(request *ExecFacevrfServerRequest) (_result *ExecFacevrfServerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecFacevrfServerResponse{}
	_body, _err := client.ExecFacevrfServerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
 * Summary: 纯服务端比对
 */
func (client *Client) ExecFacevrfServerEx(request *ExecFacevrfServerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecFacevrfServerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecFacevrfServerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.facevrf.server.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
 * Summary: 商户获取司法链上刷脸存证和统一证据ID
 */
func (client *Client) GetFacevrfEvidence(request *GetFacevrfEvidenceRequest) (_result *GetFacevrfEvidenceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetFacevrfEvidenceResponse{}
	_body, _err := client.GetFacevrfEvidenceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
 * Summary: 商户获取司法链上刷脸存证和统一证据ID
 */
func (client *Client) GetFacevrfEvidenceEx(request *GetFacevrfEvidenceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetFacevrfEvidenceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetFacevrfEvidenceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.facevrf.evidence.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人二要素认证
 * Summary: 个人二要素认证
 */
func (client *Client) CheckIndividualidTwometa(request *CheckIndividualidTwometaRequest) (_result *CheckIndividualidTwometaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckIndividualidTwometaResponse{}
	_body, _err := client.CheckIndividualidTwometaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人二要素认证
 * Summary: 个人二要素认证
 */
func (client *Client) CheckIndividualidTwometaEx(request *CheckIndividualidTwometaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckIndividualidTwometaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckIndividualidTwometaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.individualid.twometa.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人三要素认证
 * Summary: 个人三要素认证
 */
func (client *Client) CheckIndividualidThreemeta(request *CheckIndividualidThreemetaRequest) (_result *CheckIndividualidThreemetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckIndividualidThreemetaResponse{}
	_body, _err := client.CheckIndividualidThreemetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人三要素认证
 * Summary: 个人三要素认证
 */
func (client *Client) CheckIndividualidThreemetaEx(request *CheckIndividualidThreemetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckIndividualidThreemetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckIndividualidThreemetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.individualid.threemeta.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人四要素认证
 * Summary: 个人四要素认证
 */
func (client *Client) CheckIndividualidFourmeta(request *CheckIndividualidFourmetaRequest) (_result *CheckIndividualidFourmetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckIndividualidFourmetaResponse{}
	_body, _err := client.CheckIndividualidFourmetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人四要素认证
 * Summary: 个人四要素认证
 */
func (client *Client) CheckIndividualidFourmetaEx(request *CheckIndividualidFourmetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckIndividualidFourmetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckIndividualidFourmetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.individualid.fourmeta.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人三要素认证（场景路由）
 * Summary: 个人三要素认证（场景路由）
 */
func (client *Client) CheckRouteThreemeta(request *CheckRouteThreemetaRequest) (_result *CheckRouteThreemetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckRouteThreemetaResponse{}
	_body, _err := client.CheckRouteThreemetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人三要素认证（场景路由）
 * Summary: 个人三要素认证（场景路由）
 */
func (client *Client) CheckRouteThreemetaEx(request *CheckRouteThreemetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckRouteThreemetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckRouteThreemetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.route.threemeta.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 纯服务端声纹注册
 * Summary: 纯服务端声纹注册
 */
func (client *Client) CreateVoiceprintServermode(request *CreateVoiceprintServermodeRequest) (_result *CreateVoiceprintServermodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateVoiceprintServermodeResponse{}
	_body, _err := client.CreateVoiceprintServermodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 纯服务端声纹注册
 * Summary: 纯服务端声纹注册
 */
func (client *Client) CreateVoiceprintServermodeEx(request *CreateVoiceprintServermodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateVoiceprintServermodeResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("di.realperson.voiceprint.servermode.create"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			createVoiceprintServermodeResponse := &CreateVoiceprintServermodeResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = createVoiceprintServermodeResponse
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
	_result = &CreateVoiceprintServermodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.voiceprint.servermode.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 纯服务端声纹比对
 * Summary: 纯服务端声纹比对
 */
func (client *Client) VerifyVoiceprintServermode(request *VerifyVoiceprintServermodeRequest) (_result *VerifyVoiceprintServermodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyVoiceprintServermodeResponse{}
	_body, _err := client.VerifyVoiceprintServermodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 纯服务端声纹比对
 * Summary: 纯服务端声纹比对
 */
func (client *Client) VerifyVoiceprintServermodeEx(request *VerifyVoiceprintServermodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyVoiceprintServermodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyVoiceprintServermodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.voiceprint.servermode.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人二要素认证（场景路由）
 * Summary: 个人二要素认证（场景路由）
 */
func (client *Client) CheckRouteTwometa(request *CheckRouteTwometaRequest) (_result *CheckRouteTwometaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckRouteTwometaResponse{}
	_body, _err := client.CheckRouteTwometaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人二要素认证（场景路由）
 * Summary: 个人二要素认证（场景路由）
 */
func (client *Client) CheckRouteTwometaEx(request *CheckRouteTwometaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckRouteTwometaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckRouteTwometaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.route.twometa.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过移动设备身份临时标识查询该设备相关的设备风险信息的服务
 * Summary: 移动风险设备查询
 */
func (client *Client) QueryMobileRisk(request *QueryMobileRiskRequest) (_result *QueryMobileRiskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMobileRiskResponse{}
	_body, _err := client.QueryMobileRiskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过移动设备身份临时标识查询该设备相关的设备风险信息的服务
 * Summary: 移动风险设备查询
 */
func (client *Client) QueryMobileRiskEx(request *QueryMobileRiskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMobileRiskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMobileRiskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.mobile.risk.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过认证ID查询认证人、认证时间等相关信息，供智科内部使用
 * Summary: 查询认证人、认证时间等相关信息
 */
func (client *Client) DetailFacevrfServer(request *DetailFacevrfServerRequest) (_result *DetailFacevrfServerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DetailFacevrfServerResponse{}
	_body, _err := client.DetailFacevrfServerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过认证ID查询认证人、认证时间等相关信息，供智科内部使用
 * Summary: 查询认证人、认证时间等相关信息
 */
func (client *Client) DetailFacevrfServerEx(request *DetailFacevrfServerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DetailFacevrfServerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DetailFacevrfServerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.facevrf.server.detail"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 临工场景等场景下，通过主体的社保缴纳情况进行的反欺诈校验
 * Summary: 个人反欺诈风险校验
 */
func (client *Client) CheckAnticheatPersonal(request *CheckAnticheatPersonalRequest) (_result *CheckAnticheatPersonalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckAnticheatPersonalResponse{}
	_body, _err := client.CheckAnticheatPersonalEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 临工场景等场景下，通过主体的社保缴纳情况进行的反欺诈校验
 * Summary: 个人反欺诈风险校验
 */
func (client *Client) CheckAnticheatPersonalEx(request *CheckAnticheatPersonalRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckAnticheatPersonalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckAnticheatPersonalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.anticheat.personal.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 二要素支持hash主体信息
 * Summary: 个人二要素核验支持hash的主体信息
 */
func (client *Client) CheckTwometaHash(request *CheckTwometaHashRequest) (_result *CheckTwometaHashResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckTwometaHashResponse{}
	_body, _err := client.CheckTwometaHashEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 二要素支持hash主体信息
 * Summary: 个人二要素核验支持hash的主体信息
 */
func (client *Client) CheckTwometaHashEx(request *CheckTwometaHashRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckTwometaHashResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckTwometaHashResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.twometa.hash.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 对接运营商等数据源查询手机号码的在网时长
 * Summary: 三要素在网时长查询接口
 */
func (client *Client) QueryThreemetaOnlinetime(request *QueryThreemetaOnlinetimeRequest) (_result *QueryThreemetaOnlinetimeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryThreemetaOnlinetimeResponse{}
	_body, _err := client.QueryThreemetaOnlinetimeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 对接运营商等数据源查询手机号码的在网时长
 * Summary: 三要素在网时长查询接口
 */
func (client *Client) QueryThreemetaOnlinetimeEx(request *QueryThreemetaOnlinetimeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryThreemetaOnlinetimeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryThreemetaOnlinetimeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.threemeta.onlinetime.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 客户端初始化认证(OEM专用)
 * Summary: 客户端初始化认证(OEM专用)
 */
func (client *Client) InitFacevrfZim(request *InitFacevrfZimRequest) (_result *InitFacevrfZimResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitFacevrfZimResponse{}
	_body, _err := client.InitFacevrfZimEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 客户端初始化认证(OEM专用)
 * Summary: 客户端初始化认证(OEM专用)
 */
func (client *Client) InitFacevrfZimEx(request *InitFacevrfZimRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitFacevrfZimResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitFacevrfZimResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.facevrf.zim.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 客户端人脸验证(OEM专用)
 * Summary: 客户端人脸验证(OEM专用)
 */
func (client *Client) VerifyFacevrfZim(request *VerifyFacevrfZimRequest) (_result *VerifyFacevrfZimResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyFacevrfZimResponse{}
	_body, _err := client.VerifyFacevrfZimEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 客户端人脸验证(OEM专用)
 * Summary: 客户端人脸验证(OEM专用)
 */
func (client *Client) VerifyFacevrfZimEx(request *VerifyFacevrfZimRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyFacevrfZimResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyFacevrfZimResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.facevrf.zim.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 卡证OCR
 * Summary: 卡证OCR
 */
func (client *Client) RecognizeDocIndividualcard(request *RecognizeDocIndividualcardRequest) (_result *RecognizeDocIndividualcardResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RecognizeDocIndividualcardResponse{}
	_body, _err := client.RecognizeDocIndividualcardEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 卡证OCR
 * Summary: 卡证OCR
 */
func (client *Client) RecognizeDocIndividualcardEx(request *RecognizeDocIndividualcardRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RecognizeDocIndividualcardResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("di.realperson.doc.individualcard.recognize"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			recognizeDocIndividualcardResponse := &RecognizeDocIndividualcardResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = recognizeDocIndividualcardResponse
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
	_result = &RecognizeDocIndividualcardResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.doc.individualcard.recognize"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人银行卡三要素
 * Summary: 个人银行卡三要素
 */
func (client *Client) CheckThreemetaBankcard(request *CheckThreemetaBankcardRequest) (_result *CheckThreemetaBankcardResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckThreemetaBankcardResponse{}
	_body, _err := client.CheckThreemetaBankcardEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人银行卡三要素
 * Summary: 个人银行卡三要素
 */
func (client *Client) CheckThreemetaBankcardEx(request *CheckThreemetaBankcardRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckThreemetaBankcardResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckThreemetaBankcardResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.threemeta.bankcard.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: deepsec终端安全风险标签查询
 * Summary: deepsec终端安全风险标签查询
 */
func (client *Client) QueryDeepsecRisk(request *QueryDeepsecRiskRequest) (_result *QueryDeepsecRiskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDeepsecRiskResponse{}
	_body, _err := client.QueryDeepsecRiskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: deepsec终端安全风险标签查询
 * Summary: deepsec终端安全风险标签查询
 */
func (client *Client) QueryDeepsecRiskEx(request *QueryDeepsecRiskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDeepsecRiskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDeepsecRiskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.deepsec.risk.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: deepsec终端安全api，用于apdid查询
 * Summary: tsbmrq设备id查询入口
 */
func (client *Client) QueryDeepsecTsbmrq(request *QueryDeepsecTsbmrqRequest) (_result *QueryDeepsecTsbmrqResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDeepsecTsbmrqResponse{}
	_body, _err := client.QueryDeepsecTsbmrqEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: deepsec终端安全api，用于apdid查询
 * Summary: tsbmrq设备id查询入口
 */
func (client *Client) QueryDeepsecTsbmrqEx(request *QueryDeepsecTsbmrqRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDeepsecTsbmrqResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDeepsecTsbmrqResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.deepsec.tsbmrq.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人运营商二次放号
 * Summary: 个人运营商二次放号
 */
func (client *Client) QueryThreemetaPhonereuse(request *QueryThreemetaPhonereuseRequest) (_result *QueryThreemetaPhonereuseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryThreemetaPhonereuseResponse{}
	_body, _err := client.QueryThreemetaPhonereuseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人运营商二次放号
 * Summary: 个人运营商二次放号
 */
func (client *Client) QueryThreemetaPhonereuseEx(request *QueryThreemetaPhonereuseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryThreemetaPhonereuseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryThreemetaPhonereuseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.threemeta.phonereuse.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询设备信息
 * Summary: 设备信息查询for蚁盾
 */
func (client *Client) QueryTscenterDevice(request *QueryTscenterDeviceRequest) (_result *QueryTscenterDeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTscenterDeviceResponse{}
	_body, _err := client.QueryTscenterDeviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询设备信息
 * Summary: 设备信息查询for蚁盾
 */
func (client *Client) QueryTscenterDeviceEx(request *QueryTscenterDeviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTscenterDeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTscenterDeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.tscenter.device.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 学历验证
 * Summary: 学历验证
 */
func (client *Client) QueryEducationInfo(request *QueryEducationInfoRequest) (_result *QueryEducationInfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEducationInfoResponse{}
	_body, _err := client.QueryEducationInfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 学历验证
 * Summary: 学历验证
 */
func (client *Client) QueryEducationInfoEx(request *QueryEducationInfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEducationInfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEducationInfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.education.info.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: demo用记录查询
 * Summary: demo用记录查询
 */
func (client *Client) QueryDemoInfo(request *QueryDemoInfoRequest) (_result *QueryDemoInfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoInfoResponse{}
	_body, _err := client.QueryDemoInfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: demo用记录查询
 * Summary: demo用记录查询
 */
func (client *Client) QueryDemoInfoEx(request *QueryDemoInfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoInfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoInfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.demo.info.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人银行卡二要素
 * Summary: 个人银行卡二要素
 */
func (client *Client) CheckBankcardTwometa(request *CheckBankcardTwometaRequest) (_result *CheckBankcardTwometaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckBankcardTwometaResponse{}
	_body, _err := client.CheckBankcardTwometaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人银行卡二要素
 * Summary: 个人银行卡二要素
 */
func (client *Client) CheckBankcardTwometaEx(request *CheckBankcardTwometaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckBankcardTwometaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckBankcardTwometaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.bankcard.twometa.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人运营商二要素
 * Summary: 个人运营商二要素
 */
func (client *Client) CheckCarrierTwometa(request *CheckCarrierTwometaRequest) (_result *CheckCarrierTwometaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckCarrierTwometaResponse{}
	_body, _err := client.CheckCarrierTwometaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人运营商二要素
 * Summary: 个人运营商二要素
 */
func (client *Client) CheckCarrierTwometaEx(request *CheckCarrierTwometaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckCarrierTwometaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckCarrierTwometaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.carrier.twometa.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: NFC实证
 * Summary: NFC实证
 */
func (client *Client) CreateNfcServer(request *CreateNfcServerRequest) (_result *CreateNfcServerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateNfcServerResponse{}
	_body, _err := client.CreateNfcServerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: NFC实证
 * Summary: NFC实证
 */
func (client *Client) CreateNfcServerEx(request *CreateNfcServerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateNfcServerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateNfcServerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.nfc.server.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: NFC实证
 * Summary: NFC实证
 */
func (client *Client) QueryNfcServer(request *QueryNfcServerRequest) (_result *QueryNfcServerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryNfcServerResponse{}
	_body, _err := client.QueryNfcServerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: NFC实证
 * Summary: NFC实证
 */
func (client *Client) QueryNfcServerEx(request *QueryNfcServerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryNfcServerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryNfcServerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.nfc.server.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 社会安全风险
 * Summary: 社会安全风险
 */
func (client *Client) QuerySocialriskDetail(request *QuerySocialriskDetailRequest) (_result *QuerySocialriskDetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySocialriskDetailResponse{}
	_body, _err := client.QuerySocialriskDetailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 社会安全风险
 * Summary: 社会安全风险
 */
func (client *Client) QuerySocialriskDetailEx(request *QuerySocialriskDetailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySocialriskDetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySocialriskDetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.socialrisk.detail.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 运营商在网状态查询
 * Summary: 运营商在网状态查询
 */
func (client *Client) QueryCarrierNetstatus(request *QueryCarrierNetstatusRequest) (_result *QueryCarrierNetstatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCarrierNetstatusResponse{}
	_body, _err := client.QueryCarrierNetstatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 运营商在网状态查询
 * Summary: 运营商在网状态查询
 */
func (client *Client) QueryCarrierNetstatusEx(request *QueryCarrierNetstatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCarrierNetstatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCarrierNetstatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.carrier.netstatus.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 社会安全风险（简版）
 * Summary: 社会安全风险（简版）
 */
func (client *Client) QuerySocialriskBrief(request *QuerySocialriskBriefRequest) (_result *QuerySocialriskBriefResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySocialriskBriefResponse{}
	_body, _err := client.QuerySocialriskBriefEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 社会安全风险（简版）
 * Summary: 社会安全风险（简版）
 */
func (client *Client) QuerySocialriskBriefEx(request *QuerySocialriskBriefRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySocialriskBriefResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySocialriskBriefResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.socialrisk.brief.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 社会安全风险（tob风控版）
 * Summary: 社会安全风险（tob风控版）
 */
func (client *Client) QuerySocialriskTobrisk(request *QuerySocialriskTobriskRequest) (_result *QuerySocialriskTobriskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySocialriskTobriskResponse{}
	_body, _err := client.QuerySocialriskTobriskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 社会安全风险（tob风控版）
 * Summary: 社会安全风险（tob风控版）
 */
func (client *Client) QuerySocialriskTobriskEx(request *QuerySocialriskTobriskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySocialriskTobriskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySocialriskTobriskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.socialrisk.tobrisk.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
 * Summary: 纯服务端比对V2版本
 */
func (client *Client) ExecFacevrfServermode(request *ExecFacevrfServermodeRequest) (_result *ExecFacevrfServermodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecFacevrfServermodeResponse{}
	_body, _err := client.ExecFacevrfServermodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
 * Summary: 纯服务端比对V2版本
 */
func (client *Client) ExecFacevrfServermodeEx(request *ExecFacevrfServermodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecFacevrfServermodeResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("di.realperson.facevrf.servermode.exec"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			execFacevrfServermodeResponse := &ExecFacevrfServermodeResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = execFacevrfServermodeResponse
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
	_result = &ExecFacevrfServermodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.facevrf.servermode.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 银行活跃度
 * Summary: 银行活跃度
 */
func (client *Client) QueryBankLiveness(request *QueryBankLivenessRequest) (_result *QueryBankLivenessResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBankLivenessResponse{}
	_body, _err := client.QueryBankLivenessEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 银行活跃度
 * Summary: 银行活跃度
 */
func (client *Client) QueryBankLivenessEx(request *QueryBankLivenessRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBankLivenessResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBankLivenessResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.bank.liveness.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于阿里云渠道小程序域名的绑定
 * Summary: 新增场景与域名映射
 */
func (client *Client) CreateConsoleDomain(request *CreateConsoleDomainRequest) (_result *CreateConsoleDomainResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateConsoleDomainResponse{}
	_body, _err := client.CreateConsoleDomainEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于阿里云渠道小程序域名的绑定
 * Summary: 新增场景与域名映射
 */
func (client *Client) CreateConsoleDomainEx(request *CreateConsoleDomainRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateConsoleDomainResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateConsoleDomainResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.console.domain.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 阿里云控制台删除场景与域名映射
 * Summary: 删除场景与域名映射
 */
func (client *Client) DeleteConsoleDomain(request *DeleteConsoleDomainRequest) (_result *DeleteConsoleDomainResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteConsoleDomainResponse{}
	_body, _err := client.DeleteConsoleDomainEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 阿里云控制台删除场景与域名映射
 * Summary: 删除场景与域名映射
 */
func (client *Client) DeleteConsoleDomainEx(request *DeleteConsoleDomainRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteConsoleDomainResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteConsoleDomainResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.console.domain.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 失联修复初始化
 * Summary: 失联修复初始化
 */
func (client *Client) InitCarrierRepairmobile(request *InitCarrierRepairmobileRequest) (_result *InitCarrierRepairmobileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitCarrierRepairmobileResponse{}
	_body, _err := client.InitCarrierRepairmobileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 失联修复初始化
 * Summary: 失联修复初始化
 */
func (client *Client) InitCarrierRepairmobileEx(request *InitCarrierRepairmobileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitCarrierRepairmobileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitCarrierRepairmobileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.carrier.repairmobile.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 失联修复查询修复结果
 * Summary: 失联修复查询修复结果
 */
func (client *Client) QueryCarrierRepairmobile(request *QueryCarrierRepairmobileRequest) (_result *QueryCarrierRepairmobileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCarrierRepairmobileResponse{}
	_body, _err := client.QueryCarrierRepairmobileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 失联修复查询修复结果
 * Summary: 失联修复查询修复结果
 */
func (client *Client) QueryCarrierRepairmobileEx(request *QueryCarrierRepairmobileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCarrierRepairmobileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCarrierRepairmobileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.carrier.repairmobile.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 失联修复小号绑定
 * Summary: 失联修复小号绑定
 */
func (client *Client) BindCarrierRepairmobile(request *BindCarrierRepairmobileRequest) (_result *BindCarrierRepairmobileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindCarrierRepairmobileResponse{}
	_body, _err := client.BindCarrierRepairmobileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 失联修复小号绑定
 * Summary: 失联修复小号绑定
 */
func (client *Client) BindCarrierRepairmobileEx(request *BindCarrierRepairmobileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindCarrierRepairmobileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindCarrierRepairmobileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.carrier.repairmobile.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 外部机构数据上报
 * Summary: 外部机构数据上报
 */
func (client *Client) ApplyExtOrgdata(request *ApplyExtOrgdataRequest) (_result *ApplyExtOrgdataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyExtOrgdataResponse{}
	_body, _err := client.ApplyExtOrgdataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 外部机构数据上报
 * Summary: 外部机构数据上报
 */
func (client *Client) ApplyExtOrgdataEx(request *ApplyExtOrgdataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyExtOrgdataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyExtOrgdataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.ext.orgdata.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数科刷脸服务端初始化接口
 * Summary: 数科刷脸服务端初始化接口
 */
func (client *Client) CreateFaceverifyServer(request *CreateFaceverifyServerRequest) (_result *CreateFaceverifyServerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateFaceverifyServerResponse{}
	_body, _err := client.CreateFaceverifyServerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数科刷脸服务端初始化接口
 * Summary: 数科刷脸服务端初始化接口
 */
func (client *Client) CreateFaceverifyServerEx(request *CreateFaceverifyServerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateFaceverifyServerResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("di.realperson.faceverify.server.create"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			createFaceverifyServerResponse := &CreateFaceverifyServerResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = createFaceverifyServerResponse
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
	_result = &CreateFaceverifyServerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.faceverify.server.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询认证的结果和相关信息
 * Summary: 认证查询
 */
func (client *Client) QueryFaceverifyServer(request *QueryFaceverifyServerRequest) (_result *QueryFaceverifyServerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFaceverifyServerResponse{}
	_body, _err := client.QueryFaceverifyServerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询认证的结果和相关信息
 * Summary: 认证查询
 */
func (client *Client) QueryFaceverifyServerEx(request *QueryFaceverifyServerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFaceverifyServerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFaceverifyServerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.faceverify.server.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人银行卡状态增强版
 * Summary: 个人银行卡状态增强版
 */
func (client *Client) QueryBankLivenessplus(request *QueryBankLivenessplusRequest) (_result *QueryBankLivenessplusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBankLivenessplusResponse{}
	_body, _err := client.QueryBankLivenessplusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人银行卡状态增强版
 * Summary: 个人银行卡状态增强版
 */
func (client *Client) QueryBankLivenessplusEx(request *QueryBankLivenessplusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBankLivenessplusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBankLivenessplusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.bank.livenessplus.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 纯服务端比对基础版本，直接输入待比对的图片，返回比对结果
 * Summary: 纯服务端比对基础版
 */
func (client *Client) ExecFaceverifyServermode(request *ExecFaceverifyServermodeRequest) (_result *ExecFaceverifyServermodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecFaceverifyServermodeResponse{}
	_body, _err := client.ExecFaceverifyServermodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 纯服务端比对基础版本，直接输入待比对的图片，返回比对结果
 * Summary: 纯服务端比对基础版
 */
func (client *Client) ExecFaceverifyServermodeEx(request *ExecFaceverifyServermodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecFaceverifyServermodeResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("di.realperson.faceverify.servermode.exec"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			execFaceverifyServermodeResponse := &ExecFaceverifyServermodeResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = execFaceverifyServermodeResponse
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
	_result = &ExecFaceverifyServermodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.faceverify.servermode.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 支付宝实人认证初始化接口
 * Summary: 支付宝实人认证初始化接口
 */
func (client *Client) CreateAlipayverifyServer(request *CreateAlipayverifyServerRequest) (_result *CreateAlipayverifyServerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAlipayverifyServerResponse{}
	_body, _err := client.CreateAlipayverifyServerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 支付宝实人认证初始化接口
 * Summary: 支付宝实人认证初始化接口
 */
func (client *Client) CreateAlipayverifyServerEx(request *CreateAlipayverifyServerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAlipayverifyServerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAlipayverifyServerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.alipayverify.server.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 支付宝实人认证查询接口
 * Summary: 支付宝实人认证查询接口
 */
func (client *Client) QueryAlipayverifyServer(request *QueryAlipayverifyServerRequest) (_result *QueryAlipayverifyServerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAlipayverifyServerResponse{}
	_body, _err := client.QueryAlipayverifyServerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 支付宝实人认证查询接口
 * Summary: 支付宝实人认证查询接口
 */
func (client *Client) QueryAlipayverifyServerEx(request *QueryAlipayverifyServerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAlipayverifyServerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAlipayverifyServerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.alipayverify.server.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 车辆资产验证
 * Summary: 车辆资产验证
 */
func (client *Client) CheckCarTwometa(request *CheckCarTwometaRequest) (_result *CheckCarTwometaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckCarTwometaResponse{}
	_body, _err := client.CheckCarTwometaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 车辆资产验证
 * Summary: 车辆资产验证
 */
func (client *Client) CheckCarTwometaEx(request *CheckCarTwometaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckCarTwometaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckCarTwometaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.car.twometa.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 学历验证
 * Summary: 学历验证
 */
func (client *Client) QueryEducationBackground(request *QueryEducationBackgroundRequest) (_result *QueryEducationBackgroundResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEducationBackgroundResponse{}
	_body, _err := client.QueryEducationBackgroundEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 学历验证
 * Summary: 学历验证
 */
func (client *Client) QueryEducationBackgroundEx(request *QueryEducationBackgroundRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEducationBackgroundResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEducationBackgroundResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.education.background.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人银行卡状态验证 V4.0
 * Summary: 个人银行卡状态验证 V4.0
 */
func (client *Client) QueryBankLivenessfour(request *QueryBankLivenessfourRequest) (_result *QueryBankLivenessfourResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBankLivenessfourResponse{}
	_body, _err := client.QueryBankLivenessfourEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人银行卡状态验证 V4.0
 * Summary: 个人银行卡状态验证 V4.0
 */
func (client *Client) QueryBankLivenessfourEx(request *QueryBankLivenessfourRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBankLivenessfourResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBankLivenessfourResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.bank.livenessfour.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询认证的材料信息
 * Summary: 认证材料查询
 */
func (client *Client) QueryFaceverifyServermaterial(request *QueryFaceverifyServermaterialRequest) (_result *QueryFaceverifyServermaterialResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFaceverifyServermaterialResponse{}
	_body, _err := client.QueryFaceverifyServermaterialEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询认证的材料信息
 * Summary: 认证材料查询
 */
func (client *Client) QueryFaceverifyServermaterialEx(request *QueryFaceverifyServermaterialRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFaceverifyServermaterialResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFaceverifyServermaterialResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.faceverify.servermaterial.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 图片压缩接口
 * Summary: 图片压缩接口
 */
func (client *Client) ScaleinImage(request *ScaleinImageRequest) (_result *ScaleinImageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ScaleinImageResponse{}
	_body, _err := client.ScaleinImageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 图片压缩接口
 * Summary: 图片压缩接口
 */
func (client *Client) ScaleinImageEx(request *ScaleinImageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ScaleinImageResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("di.realperson.image.scalein"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			scaleinImageResponse := &ScaleinImageResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = scaleinImageResponse
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
	_result = &ScaleinImageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.image.scalein"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 要素卡证OCR
 * Summary: 要素卡证OCR
 */
func (client *Client) RecognizeOcrIndividualcard(request *RecognizeOcrIndividualcardRequest) (_result *RecognizeOcrIndividualcardResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RecognizeOcrIndividualcardResponse{}
	_body, _err := client.RecognizeOcrIndividualcardEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 要素卡证OCR
 * Summary: 要素卡证OCR
 */
func (client *Client) RecognizeOcrIndividualcardEx(request *RecognizeOcrIndividualcardRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RecognizeOcrIndividualcardResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("di.realperson.ocr.individualcard.recognize"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			recognizeOcrIndividualcardResponse := &RecognizeOcrIndividualcardResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = recognizeOcrIndividualcardResponse
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
	_result = &RecognizeOcrIndividualcardResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.ocr.individualcard.recognize"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
