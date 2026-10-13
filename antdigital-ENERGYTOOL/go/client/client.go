// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/v2/service"
	"github.com/alibabacloud-go/tea/tea"
	antchainutil "github.com/antchain-openapi-sdk-go/antchain-util/service"
)

// Description:
//
// Model for initing client
type Config struct {
	// accesskey id
	AccessKeyId *string `json:"accessKeyId,omitempty" xml:"accessKeyId,omitempty"`
	// accesskey secret
	AccessKeySecret *string `json:"accessKeySecret,omitempty" xml:"accessKeySecret,omitempty"`
	// security token
	SecurityToken *string `json:"securityToken,omitempty" xml:"securityToken,omitempty"`
	// http protocol
	//
	// example:
	//
	// http
	Protocol *string `json:"protocol,omitempty" xml:"protocol,omitempty"`
	// read timeout
	//
	// example:
	//
	// 10
	ReadTimeout *int `json:"readTimeout,omitempty" xml:"readTimeout,omitempty"`
	// connect timeout
	//
	// example:
	//
	// 10
	ConnectTimeout *int `json:"connectTimeout,omitempty" xml:"connectTimeout,omitempty"`
	// http proxy
	//
	// example:
	//
	// http://localhost
	HttpProxy *string `json:"httpProxy,omitempty" xml:"httpProxy,omitempty"`
	// https proxy
	//
	// example:
	//
	// https://localhost
	HttpsProxy *string `json:"httpsProxy,omitempty" xml:"httpsProxy,omitempty"`
	// endpoint
	//
	// example:
	//
	// cs.aliyuncs.com
	Endpoint *string `json:"endpoint,omitempty" xml:"endpoint,omitempty"`
	// proxy white list
	//
	// example:
	//
	// http://localhost
	NoProxy *string `json:"noProxy,omitempty" xml:"noProxy,omitempty"`
	// max idle conns
	//
	// example:
	//
	// 3
	MaxIdleConns *int `json:"maxIdleConns,omitempty" xml:"maxIdleConns,omitempty"`
	// user agent
	//
	// example:
	//
	// Alibabacloud/1
	UserAgent *string `json:"userAgent,omitempty" xml:"userAgent,omitempty"`
	// socks5 proxy
	Socks5Proxy *string `json:"socks5Proxy,omitempty" xml:"socks5Proxy,omitempty"`
	// socks5 network
	//
	// example:
	//
	// TCP
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

// 文档切片信息
type DocumentChunkDTO struct {
	// 切片内容
	// example:
	//
	// content
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s DocumentChunkDTO) String() string {
	return tea.Prettify(s)
}

func (s DocumentChunkDTO) GoString() string {
	return s.String()
}

func (s *DocumentChunkDTO) SetContent(v string) *DocumentChunkDTO {
	s.Content = &v
	return s
}

// 文档段落信息
type DocumentParagraphDTO struct {
	// 段落标题
	// example:
	//
	// title
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
	// 段落内容
	// example:
	//
	// content
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 切片列表
	// example:
	//
	// undefined
	Chunks []*DocumentChunkDTO `json:"chunks,omitempty" xml:"chunks,omitempty" require:"true" type:"Repeated"`
}

func (s DocumentParagraphDTO) String() string {
	return tea.Prettify(s)
}

func (s DocumentParagraphDTO) GoString() string {
	return s.String()
}

func (s *DocumentParagraphDTO) SetTitle(v string) *DocumentParagraphDTO {
	s.Title = &v
	return s
}

func (s *DocumentParagraphDTO) SetContent(v string) *DocumentParagraphDTO {
	s.Content = &v
	return s
}

func (s *DocumentParagraphDTO) SetChunks(v []*DocumentChunkDTO) *DocumentParagraphDTO {
	s.Chunks = v
	return s
}

// 相似特征数据
type SimilarFeatureData struct {
	// 时间点位
	// example:
	//
	// 时间点位
	Period *string `json:"period,omitempty" xml:"period,omitempty" require:"true"`
	// 运行日日前电价
	// example:
	//
	// 10.0
	RunDayAheadPrice *string `json:"run_day_ahead_price,omitempty" xml:"run_day_ahead_price,omitempty"`
	// 相似日日前电价
	// example:
	//
	// 10.0
	SimilarDayAheadPrice *string `json:"similar_day_ahead_price,omitempty" xml:"similar_day_ahead_price,omitempty"`
	// 相似日实际电价
	// example:
	//
	// 10.0
	SimilarRealtimePrice *string `json:"similar_realtime_price,omitempty" xml:"similar_realtime_price,omitempty"`
	// 运行日预出清数据值
	// example:
	//
	// 10.0
	RunPreclearingData *string `json:"run_preclearing_data,omitempty" xml:"run_preclearing_data,omitempty"`
	// 相似日预出清数据值
	// example:
	//
	// 10.0
	SimilarPreclearingData *string `json:"similar_preclearing_data,omitempty" xml:"similar_preclearing_data,omitempty"`
	// 相似日实际数据值
	// example:
	//
	// 10.0
	SimilarRealtimeData *string `json:"similar_realtime_data,omitempty" xml:"similar_realtime_data,omitempty"`
	// 预出清数据偏差值, =运行日预出清数据值-相似日预出清数据值
	// example:
	//
	// 0.0
	DeviationData *string `json:"deviation_data,omitempty" xml:"deviation_data,omitempty"`
}

func (s SimilarFeatureData) String() string {
	return tea.Prettify(s)
}

func (s SimilarFeatureData) GoString() string {
	return s.String()
}

func (s *SimilarFeatureData) SetPeriod(v string) *SimilarFeatureData {
	s.Period = &v
	return s
}

func (s *SimilarFeatureData) SetRunDayAheadPrice(v string) *SimilarFeatureData {
	s.RunDayAheadPrice = &v
	return s
}

func (s *SimilarFeatureData) SetSimilarDayAheadPrice(v string) *SimilarFeatureData {
	s.SimilarDayAheadPrice = &v
	return s
}

func (s *SimilarFeatureData) SetSimilarRealtimePrice(v string) *SimilarFeatureData {
	s.SimilarRealtimePrice = &v
	return s
}

func (s *SimilarFeatureData) SetRunPreclearingData(v string) *SimilarFeatureData {
	s.RunPreclearingData = &v
	return s
}

func (s *SimilarFeatureData) SetSimilarPreclearingData(v string) *SimilarFeatureData {
	s.SimilarPreclearingData = &v
	return s
}

func (s *SimilarFeatureData) SetSimilarRealtimeData(v string) *SimilarFeatureData {
	s.SimilarRealtimeData = &v
	return s
}

func (s *SimilarFeatureData) SetDeviationData(v string) *SimilarFeatureData {
	s.DeviationData = &v
	return s
}

// 现货电价预测
type PricePredictionItem struct {
	// 时间点位
	// example:
	//
	// 01:00
	Period *string `json:"period,omitempty" xml:"period,omitempty" require:"true"`
	// 预测电价，单位：元/mwh
	// example:
	//
	// 0.7
	PredictedPrice *string `json:"predicted_price,omitempty" xml:"predicted_price,omitempty" require:"true"`
	// 实际电价，单位：元/mwh
	// example:
	//
	// 10.0
	ActualPrice *string `json:"actual_price,omitempty" xml:"actual_price,omitempty"`
}

func (s PricePredictionItem) String() string {
	return tea.Prettify(s)
}

func (s PricePredictionItem) GoString() string {
	return s.String()
}

func (s *PricePredictionItem) SetPeriod(v string) *PricePredictionItem {
	s.Period = &v
	return s
}

func (s *PricePredictionItem) SetPredictedPrice(v string) *PricePredictionItem {
	s.PredictedPrice = &v
	return s
}

func (s *PricePredictionItem) SetActualPrice(v string) *PricePredictionItem {
	s.ActualPrice = &v
	return s
}

// 相似日分析结果
type SimilarDayAnalysisData struct {
	// 综合相似度，单位%
	// example:
	//
	// 10.0
	ComSimilarValue *string `json:"com_similar_value,omitempty" xml:"com_similar_value,omitempty" require:"true"`
	// 特征相似度，单位%
	// example:
	//
	// 10.0
	FeatureSimilarValue *string `json:"feature_similar_value,omitempty" xml:"feature_similar_value,omitempty" require:"true"`
	// 特征数据列表
	SimilarFeatureData []*SimilarFeatureData `json:"similar_feature_data,omitempty" xml:"similar_feature_data,omitempty" require:"true" type:"Repeated"`
}

func (s SimilarDayAnalysisData) String() string {
	return tea.Prettify(s)
}

func (s SimilarDayAnalysisData) GoString() string {
	return s.String()
}

func (s *SimilarDayAnalysisData) SetComSimilarValue(v string) *SimilarDayAnalysisData {
	s.ComSimilarValue = &v
	return s
}

func (s *SimilarDayAnalysisData) SetFeatureSimilarValue(v string) *SimilarDayAnalysisData {
	s.FeatureSimilarValue = &v
	return s
}

func (s *SimilarDayAnalysisData) SetSimilarFeatureData(v []*SimilarFeatureData) *SimilarDayAnalysisData {
	s.SimilarFeatureData = v
	return s
}

// 天气预警信息数据
type WeatherWarningData struct {
	// 区县名
	// example:
	//
	// 宜兴市
	District *string `json:"district,omitempty" xml:"district,omitempty" require:"true"`
	// 预警级别
	// example:
	//
	// 2
	Level *string `json:"level,omitempty" xml:"level,omitempty"`
	// 预警等级
	// example:
	//
	// Yellow
	SeverityColor *string `json:"severity_color,omitempty" xml:"severity_color,omitempty"`
	// 预警类型
	// example:
	//
	// other
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 发布时间
	// example:
	//
	// 2026-01-01T01:54:00.000+00:00
	PubTime *string `json:"pub_time,omitempty" xml:"pub_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 预警开始时间
	// example:
	//
	// 2026-01-01T01:54:00.000+00:00
	WarningStartTime *string `json:"warning_start_time,omitempty" xml:"warning_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 预警结束时间
	// example:
	//
	// 2026-01-01T01:54:00.000+00:00
	WarningEndTime *string `json:"warning_end_time,omitempty" xml:"warning_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 标题
	// example:
	//
	// 如东县气象台发布海区大风黄色预警
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
	// 预警内容
	// example:
	//
	// 受较强冷空气影响，预计1日夜里到2日白天我县海区将出现9级左右的偏北大风
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
}

func (s WeatherWarningData) String() string {
	return tea.Prettify(s)
}

func (s WeatherWarningData) GoString() string {
	return s.String()
}

func (s *WeatherWarningData) SetDistrict(v string) *WeatherWarningData {
	s.District = &v
	return s
}

func (s *WeatherWarningData) SetLevel(v string) *WeatherWarningData {
	s.Level = &v
	return s
}

func (s *WeatherWarningData) SetSeverityColor(v string) *WeatherWarningData {
	s.SeverityColor = &v
	return s
}

func (s *WeatherWarningData) SetType(v string) *WeatherWarningData {
	s.Type = &v
	return s
}

func (s *WeatherWarningData) SetPubTime(v string) *WeatherWarningData {
	s.PubTime = &v
	return s
}

func (s *WeatherWarningData) SetWarningStartTime(v string) *WeatherWarningData {
	s.WarningStartTime = &v
	return s
}

func (s *WeatherWarningData) SetWarningEndTime(v string) *WeatherWarningData {
	s.WarningEndTime = &v
	return s
}

func (s *WeatherWarningData) SetTitle(v string) *WeatherWarningData {
	s.Title = &v
	return s
}

func (s *WeatherWarningData) SetContent(v string) *WeatherWarningData {
	s.Content = &v
	return s
}

// 市场价格
type MarketPrice struct {
	// 市场码
	// example:
	//
	// JS
	MarketCode *string `json:"market_code,omitempty" xml:"market_code,omitempty" require:"true"`
	// 目标日期,格式 yyyy-MM-dd
	// example:
	//
	// 2026-07-12
	TargetDate *string `json:"target_date,omitempty" xml:"target_date,omitempty" require:"true"`
	// 查询类型:DAY_AHEAD/REALTIME
	// example:
	//
	// DAY_AHEAD
	QueryType *string `json:"query_type,omitempty" xml:"query_type,omitempty" require:"true"`
	// 价格类型
	// example:
	//
	// CLEARING
	PriceType *string `json:"price_type,omitempty" xml:"price_type,omitempty" require:"true"`
	// 时点编号,1~96 整数
	// example:
	//
	// 1
	Period *string `json:"period,omitempty" xml:"period,omitempty" require:"true"`
	// 价格值,单位 元/MWh
	// example:
	//
	// 100.50
	PriceValue *string `json:"price_value,omitempty" xml:"price_value,omitempty" require:"true"`
	// 数据源更新时间,ISO8601 格式
	// example:
	//
	// 2026-07-12T08:00:00Z
	SourceUpdatedAt *string `json:"source_updated_at,omitempty" xml:"source_updated_at,omitempty" require:"true"`
}

func (s MarketPrice) String() string {
	return tea.Prettify(s)
}

func (s MarketPrice) GoString() string {
	return s.String()
}

func (s *MarketPrice) SetMarketCode(v string) *MarketPrice {
	s.MarketCode = &v
	return s
}

func (s *MarketPrice) SetTargetDate(v string) *MarketPrice {
	s.TargetDate = &v
	return s
}

func (s *MarketPrice) SetQueryType(v string) *MarketPrice {
	s.QueryType = &v
	return s
}

func (s *MarketPrice) SetPriceType(v string) *MarketPrice {
	s.PriceType = &v
	return s
}

func (s *MarketPrice) SetPeriod(v string) *MarketPrice {
	s.Period = &v
	return s
}

func (s *MarketPrice) SetPriceValue(v string) *MarketPrice {
	s.PriceValue = &v
	return s
}

func (s *MarketPrice) SetSourceUpdatedAt(v string) *MarketPrice {
	s.SourceUpdatedAt = &v
	return s
}

// 文档基础信息
type DocumentInfoDTO struct {
	// 文档id
	// example:
	//
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 文档名称
	// example:
	//
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 文件大小
	// example:
	//
	// file_size
	FileSize *int64 `json:"file_size,omitempty" xml:"file_size,omitempty" require:"true"`
	// 文件类型
	// example:
	//
	// file_type
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// oss下载地址
	// example:
	//
	// oss_url
	OssUrl *string `json:"oss_url,omitempty" xml:"oss_url,omitempty" require:"true"`
	// 文件md5
	// example:
	//
	// md5
	Md5 *string `json:"md5,omitempty" xml:"md5,omitempty" require:"true"`
	// 文档来源
	// example:
	//
	// source
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 文档提供方的附加信息
	// example:
	//
	// source_ext
	SourceExt *string `json:"source_ext,omitempty" xml:"source_ext,omitempty" require:"true"`
}

func (s DocumentInfoDTO) String() string {
	return tea.Prettify(s)
}

func (s DocumentInfoDTO) GoString() string {
	return s.String()
}

func (s *DocumentInfoDTO) SetId(v string) *DocumentInfoDTO {
	s.Id = &v
	return s
}

func (s *DocumentInfoDTO) SetName(v string) *DocumentInfoDTO {
	s.Name = &v
	return s
}

func (s *DocumentInfoDTO) SetFileSize(v int64) *DocumentInfoDTO {
	s.FileSize = &v
	return s
}

func (s *DocumentInfoDTO) SetFileType(v string) *DocumentInfoDTO {
	s.FileType = &v
	return s
}

func (s *DocumentInfoDTO) SetOssUrl(v string) *DocumentInfoDTO {
	s.OssUrl = &v
	return s
}

func (s *DocumentInfoDTO) SetMd5(v string) *DocumentInfoDTO {
	s.Md5 = &v
	return s
}

func (s *DocumentInfoDTO) SetSource(v string) *DocumentInfoDTO {
	s.Source = &v
	return s
}

func (s *DocumentInfoDTO) SetSourceExt(v string) *DocumentInfoDTO {
	s.SourceExt = &v
	return s
}

// 日前与实时价差预测数据
type AheadRealtimePriceDiffPredictionData struct {
	// 时间点位
	// example:
	//
	// 01:00
	Period *string `json:"period,omitempty" xml:"period,omitempty" require:"true"`
	// 实际价差方向
	// example:
	//
	// 10.0
	RealDirection *string `json:"real_direction,omitempty" xml:"real_direction,omitempty"`
	// 预测价差方向
	// example:
	//
	// 10.0
	PreDirection *string `json:"pre_direction,omitempty" xml:"pre_direction,omitempty"`
	// 实际日前实时价差
	// example:
	//
	// 10.0
	RealDayAheadDiff *string `json:"real_day_ahead_diff,omitempty" xml:"real_day_ahead_diff,omitempty"`
	// 预测日前实时价差
	// example:
	//
	// 10.0
	PreDayAheadDiff *string `json:"pre_day_ahead_diff,omitempty" xml:"pre_day_ahead_diff,omitempty"`
}

func (s AheadRealtimePriceDiffPredictionData) String() string {
	return tea.Prettify(s)
}

func (s AheadRealtimePriceDiffPredictionData) GoString() string {
	return s.String()
}

func (s *AheadRealtimePriceDiffPredictionData) SetPeriod(v string) *AheadRealtimePriceDiffPredictionData {
	s.Period = &v
	return s
}

func (s *AheadRealtimePriceDiffPredictionData) SetRealDirection(v string) *AheadRealtimePriceDiffPredictionData {
	s.RealDirection = &v
	return s
}

func (s *AheadRealtimePriceDiffPredictionData) SetPreDirection(v string) *AheadRealtimePriceDiffPredictionData {
	s.PreDirection = &v
	return s
}

func (s *AheadRealtimePriceDiffPredictionData) SetRealDayAheadDiff(v string) *AheadRealtimePriceDiffPredictionData {
	s.RealDayAheadDiff = &v
	return s
}

func (s *AheadRealtimePriceDiffPredictionData) SetPreDayAheadDiff(v string) *AheadRealtimePriceDiffPredictionData {
	s.PreDayAheadDiff = &v
	return s
}

// 附件详情
type EpiAdmEnergyPolicyAttachment struct {
	// 文件名称
	// example:
	//
	// 文件名称.pdf
	Filename *string `json:"filename,omitempty" xml:"filename,omitempty"`
	// 文件下载地址
	// example:
	//
	// https://www.oss.com/download
	Fileurl *string `json:"fileurl,omitempty" xml:"fileurl,omitempty"`
}

func (s EpiAdmEnergyPolicyAttachment) String() string {
	return tea.Prettify(s)
}

func (s EpiAdmEnergyPolicyAttachment) GoString() string {
	return s.String()
}

func (s *EpiAdmEnergyPolicyAttachment) SetFilename(v string) *EpiAdmEnergyPolicyAttachment {
	s.Filename = &v
	return s
}

func (s *EpiAdmEnergyPolicyAttachment) SetFileurl(v string) *EpiAdmEnergyPolicyAttachment {
	s.Fileurl = &v
	return s
}

// 竞价空间分析数据
type BiddingAnalysisData struct {
	// 时间点位
	// example:
	//
	// 01:00
	Period *string `json:"period,omitempty" xml:"period,omitempty" require:"true"`
	// 实时数据
	// example:
	//
	// 10.0
	RealtimeData *string `json:"realtime_data,omitempty" xml:"realtime_data,omitempty"`
	// 日前数据
	// example:
	//
	// 10.0
	DayAheadData *string `json:"day_ahead_data,omitempty" xml:"day_ahead_data,omitempty"`
	// 预出清数据
	// example:
	//
	// 10.0
	PreclearingData *string `json:"preclearing_data,omitempty" xml:"preclearing_data,omitempty"`
	// 实际数据
	// example:
	//
	// 10.0
	ActualData *string `json:"actual_data,omitempty" xml:"actual_data,omitempty"`
	// 实时预测数据
	// example:
	//
	// 10.0
	RealtimePredictionData *string `json:"realtime_prediction_data,omitempty" xml:"realtime_prediction_data,omitempty"`
	// 日前预测数据
	// example:
	//
	// 10.0
	DayAheadPredictionData *string `json:"day_ahead_prediction_data,omitempty" xml:"day_ahead_prediction_data,omitempty"`
	// 偏差值
	// example:
	//
	// 10.0
	DeviationData *string `json:"deviation_data,omitempty" xml:"deviation_data,omitempty"`
}

func (s BiddingAnalysisData) String() string {
	return tea.Prettify(s)
}

func (s BiddingAnalysisData) GoString() string {
	return s.String()
}

func (s *BiddingAnalysisData) SetPeriod(v string) *BiddingAnalysisData {
	s.Period = &v
	return s
}

func (s *BiddingAnalysisData) SetRealtimeData(v string) *BiddingAnalysisData {
	s.RealtimeData = &v
	return s
}

func (s *BiddingAnalysisData) SetDayAheadData(v string) *BiddingAnalysisData {
	s.DayAheadData = &v
	return s
}

func (s *BiddingAnalysisData) SetPreclearingData(v string) *BiddingAnalysisData {
	s.PreclearingData = &v
	return s
}

func (s *BiddingAnalysisData) SetActualData(v string) *BiddingAnalysisData {
	s.ActualData = &v
	return s
}

func (s *BiddingAnalysisData) SetRealtimePredictionData(v string) *BiddingAnalysisData {
	s.RealtimePredictionData = &v
	return s
}

func (s *BiddingAnalysisData) SetDayAheadPredictionData(v string) *BiddingAnalysisData {
	s.DayAheadPredictionData = &v
	return s
}

func (s *BiddingAnalysisData) SetDeviationData(v string) *BiddingAnalysisData {
	s.DeviationData = &v
	return s
}

// 文档加工数据
type DocumentProcessingDataDTO struct {
	// 段落列表
	// example:
	//
	// undefined
	Paragraphs []*DocumentParagraphDTO `json:"paragraphs,omitempty" xml:"paragraphs,omitempty" require:"true" type:"Repeated"`
	// 文档标题
	// example:
	//
	// title
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
	// 原文内容
	// example:
	//
	// content
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s DocumentProcessingDataDTO) String() string {
	return tea.Prettify(s)
}

func (s DocumentProcessingDataDTO) GoString() string {
	return s.String()
}

func (s *DocumentProcessingDataDTO) SetParagraphs(v []*DocumentParagraphDTO) *DocumentProcessingDataDTO {
	s.Paragraphs = v
	return s
}

func (s *DocumentProcessingDataDTO) SetTitle(v string) *DocumentProcessingDataDTO {
	s.Title = &v
	return s
}

func (s *DocumentProcessingDataDTO) SetContent(v string) *DocumentProcessingDataDTO {
	s.Content = &v
	return s
}

// 日前实时电价对比信息
type AheadRealtimePriceCompareData struct {
	// 时间点位
	// example:
	//
	// 01:00
	Period *string `json:"period,omitempty" xml:"period,omitempty" require:"true"`
	// 日前大于实时占比
	// example:
	//
	// 10.0
	RealtimeRate *string `json:"realtime_rate,omitempty" xml:"realtime_rate,omitempty"`
	// 日前等于实时占比
	// example:
	//
	// 10.0
	DayaheadRate *string `json:"dayahead_rate,omitempty" xml:"dayahead_rate,omitempty"`
	// 日前小于实时占比
	// example:
	//
	// 10.0
	EqualRate *string `json:"equal_rate,omitempty" xml:"equal_rate,omitempty"`
	// 偏差值
	// example:
	//
	// 10.0
	DeviationData *string `json:"deviation_data,omitempty" xml:"deviation_data,omitempty"`
	// 实时电价均值
	// example:
	//
	// 10.0
	RealtimeAvg *string `json:"realtime_avg,omitempty" xml:"realtime_avg,omitempty"`
	// 日前电价均值
	// example:
	//
	// 10.0
	DayAheadAvg *string `json:"day_ahead_avg,omitempty" xml:"day_ahead_avg,omitempty"`
	// 偏差均值
	// example:
	//
	// 10.0
	DeviationAvg *string `json:"deviation_avg,omitempty" xml:"deviation_avg,omitempty"`
	// 差价数值
	// example:
	//
	// 10.0
	PriceDiff *string `json:"price_diff,omitempty" xml:"price_diff,omitempty"`
	// 价差均值
	// example:
	//
	// 10.0
	PriceDiffAvg *string `json:"price_diff_avg,omitempty" xml:"price_diff_avg,omitempty"`
}

func (s AheadRealtimePriceCompareData) String() string {
	return tea.Prettify(s)
}

func (s AheadRealtimePriceCompareData) GoString() string {
	return s.String()
}

func (s *AheadRealtimePriceCompareData) SetPeriod(v string) *AheadRealtimePriceCompareData {
	s.Period = &v
	return s
}

func (s *AheadRealtimePriceCompareData) SetRealtimeRate(v string) *AheadRealtimePriceCompareData {
	s.RealtimeRate = &v
	return s
}

func (s *AheadRealtimePriceCompareData) SetDayaheadRate(v string) *AheadRealtimePriceCompareData {
	s.DayaheadRate = &v
	return s
}

func (s *AheadRealtimePriceCompareData) SetEqualRate(v string) *AheadRealtimePriceCompareData {
	s.EqualRate = &v
	return s
}

func (s *AheadRealtimePriceCompareData) SetDeviationData(v string) *AheadRealtimePriceCompareData {
	s.DeviationData = &v
	return s
}

func (s *AheadRealtimePriceCompareData) SetRealtimeAvg(v string) *AheadRealtimePriceCompareData {
	s.RealtimeAvg = &v
	return s
}

func (s *AheadRealtimePriceCompareData) SetDayAheadAvg(v string) *AheadRealtimePriceCompareData {
	s.DayAheadAvg = &v
	return s
}

func (s *AheadRealtimePriceCompareData) SetDeviationAvg(v string) *AheadRealtimePriceCompareData {
	s.DeviationAvg = &v
	return s
}

func (s *AheadRealtimePriceCompareData) SetPriceDiff(v string) *AheadRealtimePriceCompareData {
	s.PriceDiff = &v
	return s
}

func (s *AheadRealtimePriceCompareData) SetPriceDiffAvg(v string) *AheadRealtimePriceCompareData {
	s.PriceDiffAvg = &v
	return s
}

// 中长期预测单时刻数据，6 小时间隔。字段按网关要求使用下划线命名，描述注明对应 WeatherLongRangeVariableDTO 属性；未请求或缺失的要素可为空。
type WeatherLongRangeVariable struct {
	// 预测数据时刻，格式 yyyy-MM-dd HH:mm:ss，对应 variableDate。
	// example:
	//
	// 2026-10-07 00:00:00
	VariableDate *string `json:"variable_date,omitempty" xml:"variable_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 预测数据批次时间，格式 yyyy-MM-dd HH:mm:ss，对应 forecastBatchTime。
	// example:
	//
	// 2026-09-21 08:00:00
	ForecastBatchTime *string `json:"forecast_batch_time,omitempty" xml:"forecast_batch_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 2 米气温，单位 ℃；对应 temperature2m。
	// example:
	//
	// 25.3
	Temperature2m *string `json:"temperature_2m,omitempty" xml:"temperature_2m,omitempty"`
	// 2 米露点温度，单位 ℃；对应 dewPoint2m。
	// example:
	//
	// 18.2
	DewPoint2m *string `json:"dew_point_2m,omitempty" xml:"dew_point_2m,omitempty"`
	// 体感温度，单位 ℃；对应 apparentTemperature。
	// example:
	//
	// 27.1
	ApparentTemperature *string `json:"apparent_temperature,omitempty" xml:"apparent_temperature,omitempty"`
	// 2 米相对湿度，单位 %；对应 relativeHumidity2m。
	// example:
	//
	// 65
	RelativeHumidity2m *string `json:"relative_humidity_2m,omitempty" xml:"relative_humidity_2m,omitempty"`
	// 海平面气压，单位 hPa；对应 pressureMsl。
	// example:
	//
	// 1013.2
	PressureMsl *string `json:"pressure_msl,omitempty" xml:"pressure_msl,omitempty"`
	// 地表气压，单位 hPa；对应 surfacePressure。
	// example:
	//
	// 1008.6
	SurfacePressure *string `json:"surface_pressure,omitempty" xml:"surface_pressure,omitempty"`
	// 平台天气编码，由源天气编码转换；对应 weatherCode。
	// example:
	//
	// 3
	WeatherCode *string `json:"weather_code,omitempty" xml:"weather_code,omitempty"`
	// 降水量，单位 mm；对应 precipitation。
	// example:
	//
	// 0.3
	Precipitation *string `json:"precipitation,omitempty" xml:"precipitation,omitempty"`
	// 云量，单位 %；对应 cloudCover。
	// example:
	//
	// 60
	CloudCover *string `json:"cloud_cover,omitempty" xml:"cloud_cover,omitempty"`
	// 10 米风速，单位 m/s；对应 windSpeed10m。
	// example:
	//
	// 3.2
	WindSpeed10m *string `json:"wind_speed_10m,omitempty" xml:"wind_speed_10m,omitempty"`
	// 100 米风速，单位 m/s；对应 windSpeed100m。
	// example:
	//
	// 5.6
	WindSpeed100m *string `json:"wind_speed_100m,omitempty" xml:"wind_speed_100m,omitempty"`
	// 200 米风速，单位 m/s；对应 windSpeed200m。
	// example:
	//
	// 7.0
	WindSpeed200m *string `json:"wind_speed_200m,omitempty" xml:"wind_speed_200m,omitempty"`
	// 10 米风向，单位 °；对应 windDirection10m。
	// example:
	//
	// 180
	WindDirection10m *string `json:"wind_direction_10m,omitempty" xml:"wind_direction_10m,omitempty"`
	// 100 米风向，单位 °；对应 windDirection100m。
	// example:
	//
	// 185
	WindDirection100m *string `json:"wind_direction_100m,omitempty" xml:"wind_direction_100m,omitempty"`
	// 200 米风向，单位 °；对应 windDirection200m。
	// example:
	//
	// 190
	WindDirection200m *string `json:"wind_direction_200m,omitempty" xml:"wind_direction_200m,omitempty"`
	// 瞬时短波辐射，单位 W/m²；对应 shortwaveRadiationInstant。
	// example:
	//
	// 600
	ShortwaveRadiationInstant *string `json:"shortwave_radiation_instant,omitempty" xml:"shortwave_radiation_instant,omitempty"`
	// 瞬时直接辐射，单位 W/m²；对应 directRadiationInstant。
	// example:
	//
	// 450
	DirectRadiationInstant *string `json:"direct_radiation_instant,omitempty" xml:"direct_radiation_instant,omitempty"`
	// 瞬时散射辐射，单位 W/m²；对应 diffuseRadiationInstant。
	// example:
	//
	// 150
	DiffuseRadiationInstant *string `json:"diffuse_radiation_instant,omitempty" xml:"diffuse_radiation_instant,omitempty"`
	// 短波辐射，单位 W/m²；对应 shortwaveRadiation。
	// example:
	//
	// 550
	ShortwaveRadiation *string `json:"shortwave_radiation,omitempty" xml:"shortwave_radiation,omitempty"`
	// 直接辐射，单位 W/m²；对应 directRadiation。
	// example:
	//
	// 400
	DirectRadiation *string `json:"direct_radiation,omitempty" xml:"direct_radiation,omitempty"`
	// 散射辐射，单位 W/m²；对应 diffuseRadiation。
	// example:
	//
	// 150
	DiffuseRadiation *string `json:"diffuse_radiation,omitempty" xml:"diffuse_radiation,omitempty"`
	// 10 米阵风风速，单位 m/s；对应 windGusts10m。
	// example:
	//
	// 6.2
	WindGusts10m *string `json:"wind_gusts_10m,omitempty" xml:"wind_gusts_10m,omitempty"`
	// 2 米最高气温，单位 ℃；对应 temperatureMax2m。
	// example:
	//
	// 30.2
	Temperature2mMax *string `json:"temperature_2m_max,omitempty" xml:"temperature_2m_max,omitempty"`
	// 2 米最低气温，单位 ℃；对应 temperatureMin2m。
	// example:
	//
	// 19.1
	Temperature2mMin *string `json:"temperature_2m_min,omitempty" xml:"temperature_2m_min,omitempty"`
}

func (s WeatherLongRangeVariable) String() string {
	return tea.Prettify(s)
}

func (s WeatherLongRangeVariable) GoString() string {
	return s.String()
}

func (s *WeatherLongRangeVariable) SetVariableDate(v string) *WeatherLongRangeVariable {
	s.VariableDate = &v
	return s
}

func (s *WeatherLongRangeVariable) SetForecastBatchTime(v string) *WeatherLongRangeVariable {
	s.ForecastBatchTime = &v
	return s
}

func (s *WeatherLongRangeVariable) SetTemperature2m(v string) *WeatherLongRangeVariable {
	s.Temperature2m = &v
	return s
}

func (s *WeatherLongRangeVariable) SetDewPoint2m(v string) *WeatherLongRangeVariable {
	s.DewPoint2m = &v
	return s
}

func (s *WeatherLongRangeVariable) SetApparentTemperature(v string) *WeatherLongRangeVariable {
	s.ApparentTemperature = &v
	return s
}

func (s *WeatherLongRangeVariable) SetRelativeHumidity2m(v string) *WeatherLongRangeVariable {
	s.RelativeHumidity2m = &v
	return s
}

func (s *WeatherLongRangeVariable) SetPressureMsl(v string) *WeatherLongRangeVariable {
	s.PressureMsl = &v
	return s
}

func (s *WeatherLongRangeVariable) SetSurfacePressure(v string) *WeatherLongRangeVariable {
	s.SurfacePressure = &v
	return s
}

func (s *WeatherLongRangeVariable) SetWeatherCode(v string) *WeatherLongRangeVariable {
	s.WeatherCode = &v
	return s
}

func (s *WeatherLongRangeVariable) SetPrecipitation(v string) *WeatherLongRangeVariable {
	s.Precipitation = &v
	return s
}

func (s *WeatherLongRangeVariable) SetCloudCover(v string) *WeatherLongRangeVariable {
	s.CloudCover = &v
	return s
}

func (s *WeatherLongRangeVariable) SetWindSpeed10m(v string) *WeatherLongRangeVariable {
	s.WindSpeed10m = &v
	return s
}

func (s *WeatherLongRangeVariable) SetWindSpeed100m(v string) *WeatherLongRangeVariable {
	s.WindSpeed100m = &v
	return s
}

func (s *WeatherLongRangeVariable) SetWindSpeed200m(v string) *WeatherLongRangeVariable {
	s.WindSpeed200m = &v
	return s
}

func (s *WeatherLongRangeVariable) SetWindDirection10m(v string) *WeatherLongRangeVariable {
	s.WindDirection10m = &v
	return s
}

func (s *WeatherLongRangeVariable) SetWindDirection100m(v string) *WeatherLongRangeVariable {
	s.WindDirection100m = &v
	return s
}

func (s *WeatherLongRangeVariable) SetWindDirection200m(v string) *WeatherLongRangeVariable {
	s.WindDirection200m = &v
	return s
}

func (s *WeatherLongRangeVariable) SetShortwaveRadiationInstant(v string) *WeatherLongRangeVariable {
	s.ShortwaveRadiationInstant = &v
	return s
}

func (s *WeatherLongRangeVariable) SetDirectRadiationInstant(v string) *WeatherLongRangeVariable {
	s.DirectRadiationInstant = &v
	return s
}

func (s *WeatherLongRangeVariable) SetDiffuseRadiationInstant(v string) *WeatherLongRangeVariable {
	s.DiffuseRadiationInstant = &v
	return s
}

func (s *WeatherLongRangeVariable) SetShortwaveRadiation(v string) *WeatherLongRangeVariable {
	s.ShortwaveRadiation = &v
	return s
}

func (s *WeatherLongRangeVariable) SetDirectRadiation(v string) *WeatherLongRangeVariable {
	s.DirectRadiation = &v
	return s
}

func (s *WeatherLongRangeVariable) SetDiffuseRadiation(v string) *WeatherLongRangeVariable {
	s.DiffuseRadiation = &v
	return s
}

func (s *WeatherLongRangeVariable) SetWindGusts10m(v string) *WeatherLongRangeVariable {
	s.WindGusts10m = &v
	return s
}

func (s *WeatherLongRangeVariable) SetTemperature2mMax(v string) *WeatherLongRangeVariable {
	s.Temperature2mMax = &v
	return s
}

func (s *WeatherLongRangeVariable) SetTemperature2mMin(v string) *WeatherLongRangeVariable {
	s.Temperature2mMin = &v
	return s
}

// 快照文档详情
type SnapshotDocumentItem struct {
	// 节点ID
	// example:
	//
	// node_id
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty" require:"true"`
	// 文档ID
	// example:
	//
	// document_id
	DocumentId *string `json:"document_id,omitempty" xml:"document_id,omitempty" require:"true"`
	// 文档名称
	// example:
	//
	// document_name
	DocumentName *string `json:"document_name,omitempty" xml:"document_name,omitempty" require:"true"`
	// 文件类型
	// example:
	//
	// file_type
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// 下载原文的链接
	// example:
	//
	// oss_url
	OssUrl *string `json:"oss_url,omitempty" xml:"oss_url,omitempty" require:"true"`
	// 原文的md5
	// example:
	//
	// md5
	Md5 *string `json:"md5,omitempty" xml:"md5,omitempty"`
	// 向量文档ID
	// example:
	//
	// vector_store_map_id
	VectorStoreMapId *string `json:"vector_store_map_id,omitempty" xml:"vector_store_map_id,omitempty" require:"true"`
	// 文档来源
	// example:
	//
	// source
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 文档来源附带的额外信息
	// example:
	//
	// source_ext
	SourceExt *string `json:"source_ext,omitempty" xml:"source_ext,omitempty" require:"true"`
	// 标签
	// example:
	//
	// tags
	Tags []*string `json:"tags,omitempty" xml:"tags,omitempty" require:"true" type:"Repeated"`
}

func (s SnapshotDocumentItem) String() string {
	return tea.Prettify(s)
}

func (s SnapshotDocumentItem) GoString() string {
	return s.String()
}

func (s *SnapshotDocumentItem) SetNodeId(v string) *SnapshotDocumentItem {
	s.NodeId = &v
	return s
}

func (s *SnapshotDocumentItem) SetDocumentId(v string) *SnapshotDocumentItem {
	s.DocumentId = &v
	return s
}

func (s *SnapshotDocumentItem) SetDocumentName(v string) *SnapshotDocumentItem {
	s.DocumentName = &v
	return s
}

func (s *SnapshotDocumentItem) SetFileType(v string) *SnapshotDocumentItem {
	s.FileType = &v
	return s
}

func (s *SnapshotDocumentItem) SetOssUrl(v string) *SnapshotDocumentItem {
	s.OssUrl = &v
	return s
}

func (s *SnapshotDocumentItem) SetMd5(v string) *SnapshotDocumentItem {
	s.Md5 = &v
	return s
}

func (s *SnapshotDocumentItem) SetVectorStoreMapId(v string) *SnapshotDocumentItem {
	s.VectorStoreMapId = &v
	return s
}

func (s *SnapshotDocumentItem) SetSource(v string) *SnapshotDocumentItem {
	s.Source = &v
	return s
}

func (s *SnapshotDocumentItem) SetSourceExt(v string) *SnapshotDocumentItem {
	s.SourceExt = &v
	return s
}

func (s *SnapshotDocumentItem) SetTags(v []*string) *SnapshotDocumentItem {
	s.Tags = v
	return s
}

// 单个时间点的天气数据，对应 WeatherVariableDTO；气象要素值为字符串，按请求要素及数据可用性返回。
type WeatherVariable struct {
	// 气象数据对应的时间点，Java 类型 Date。
	// example:
	//
	// 2026-09-20 09:00:00
	VariableDate *string `json:"variable_date,omitempty" xml:"variable_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 该条气象数据的预测批次时间，Java 类型 Date，可能为空。
	// example:
	//
	// 2026-09-20 08:00:00
	ForecastBatchTime *string `json:"forecast_batch_time,omitempty" xml:"forecast_batch_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 地面 2 米处空气温度，单位 °C。
	// example:
	//
	// 25.3
	Temperature2m *string `json:"temperature_2m,omitempty" xml:"temperature_2m,omitempty"`
	// 地面 2 米处相对空气湿度，单位 %。
	// example:
	//
	// 65
	RelativeHumidity2m *string `json:"relative_humidity_2m,omitempty" xml:"relative_humidity_2m,omitempty"`
	// 地面 2 米处露点温度，单位 °C。
	// example:
	//
	// 18.2
	DewPoint2m *string `json:"dew_point_2m,omitempty" xml:"dew_point_2m,omitempty"`
	// 海平面大气压，单位 hPa。
	// example:
	//
	// 1013.2
	PressureMsl *string `json:"pressure_msl,omitempty" xml:"pressure_msl,omitempty"`
	// 地表大气压，单位 hPa。
	// example:
	//
	// 1008.6
	SurfacePressure *string `json:"surface_pressure,omitempty" xml:"surface_pressure,omitempty"`
	// 未来一小时降水量大于 0.1mm 的概率，单位 %。
	// example:
	//
	// 40
	PrecipitationProbability *string `json:"precipitation_probability,omitempty" xml:"precipitation_probability,omitempty"`
	// 总云量，单位 %。
	// example:
	//
	// 60
	CloudCover *string `json:"cloud_cover,omitempty" xml:"cloud_cover,omitempty"`
	// 低云量，单位 %。
	// example:
	//
	// 20
	CloudCoverLow *string `json:"cloud_cover_low,omitempty" xml:"cloud_cover_low,omitempty"`
	// 中云量，单位 %。
	// example:
	//
	// 30
	CloudCoverMid *string `json:"cloud_cover_mid,omitempty" xml:"cloud_cover_mid,omitempty"`
	// 高云量，单位 %。
	// example:
	//
	// 10
	CloudCoverHigh *string `json:"cloud_cover_high,omitempty" xml:"cloud_cover_high,omitempty"`
	// 短波辐照，未来一小时平均，单位 W/m²。
	// example:
	//
	// 500
	ShortwaveRadiation *string `json:"shortwave_radiation,omitempty" xml:"shortwave_radiation,omitempty"`
	// 直接辐照，代码注释定义为未来一小时累计，单位 W/m²。
	// example:
	//
	// 350
	DirectRadiation *string `json:"direct_radiation,omitempty" xml:"direct_radiation,omitempty"`
	// 直接法向辐照，未来一小时平均，单位 W/m²。
	// example:
	//
	// 420
	DirectNormalIrradiance *string `json:"direct_normal_irradiance,omitempty" xml:"direct_normal_irradiance,omitempty"`
	// 散射辐照，未来一小时平均，单位 W/m²。
	// example:
	//
	// 150
	DiffuseRadiation *string `json:"diffuse_radiation,omitempty" xml:"diffuse_radiation,omitempty"`
	// 地面 10 米处风速，单位 m/s。
	// example:
	//
	// 3.2
	WindSpeed10m *string `json:"wind_speed_10m,omitempty" xml:"wind_speed_10m,omitempty"`
	// 地面 80 米处风速，单位 m/s。
	// example:
	//
	// 5.6
	WindSpeed80m *string `json:"wind_speed_80m,omitempty" xml:"wind_speed_80m,omitempty"`
	// 地面 120 米处风速，单位 m/s。
	// example:
	//
	// 6.1
	WindSpeed120m *string `json:"wind_speed_120m,omitempty" xml:"wind_speed_120m,omitempty"`
	// 地面 10 米处风向，单位 °。
	// example:
	//
	// 180
	WindDirection10m *string `json:"wind_direction_10m,omitempty" xml:"wind_direction_10m,omitempty"`
	// 地面 80 米处风向，单位 °。
	// example:
	//
	// 185
	WindDirection80m *string `json:"wind_direction_80m,omitempty" xml:"wind_direction_80m,omitempty"`
	// 地面 120 米处风向，单位 °。
	// example:
	//
	// 190
	WindDirection120m *string `json:"wind_direction_120m,omitempty" xml:"wind_direction_120m,omitempty"`
	// 天气代码，采用 WMO 天气编码。
	// example:
	//
	// 3
	WeatherCode *string `json:"weather_code,omitempty" xml:"weather_code,omitempty"`
	// 体感温度，单位 °C。
	// example:
	//
	// 27.1
	ApparentTemperature *string `json:"apparent_temperature,omitempty" xml:"apparent_temperature,omitempty"`
	// 降雨量，单位 mm。
	// example:
	//
	// 0.2
	Rain *string `json:"rain,omitempty" xml:"rain,omitempty"`
	// 降水量，包含所有降水形式，单位 mm。
	// example:
	//
	// 0.3
	Precipitation *string `json:"precipitation,omitempty" xml:"precipitation,omitempty"`
	// 降雪量，单位 cm。
	// example:
	//
	// 0
	Snowfall *string `json:"snowfall,omitempty" xml:"snowfall,omitempty"`
	// 短波辐照瞬时值，单位 W/m²。
	// example:
	//
	// 510
	ShortwaveRadiationInstant *string `json:"shortwave_radiation_instant,omitempty" xml:"shortwave_radiation_instant,omitempty"`
	// 直接辐照瞬时值，单位 W/m²。
	// example:
	//
	// 360
	DirectRadiationInstant *string `json:"direct_radiation_instant,omitempty" xml:"direct_radiation_instant,omitempty"`
	// 散射辐照瞬时值，单位 W/m²。
	// example:
	//
	// 150
	DiffuseRadiationInstant *string `json:"diffuse_radiation_instant,omitempty" xml:"diffuse_radiation_instant,omitempty"`
	// 直接法向辐照瞬时值，单位 W/m²。
	// example:
	//
	// 430
	DirectNormalIrradianceInstant *string `json:"direct_normal_irradiance_instant,omitempty" xml:"direct_normal_irradiance_instant,omitempty"`
	// 地面 180 米处风速，单位 m/s。
	// example:
	//
	// 7.0
	WindSpeed180m *string `json:"wind_speed_180m,omitempty" xml:"wind_speed_180m,omitempty"`
	// 地面 180 米处风向，单位 °。
	// example:
	//
	// 195
	WindDirection180m *string `json:"wind_direction_180m,omitempty" xml:"wind_direction_180m,omitempty"`
	// DTO 保留的短时降雨量字段，单位 mm。本 queryWeather 接口拒绝查询 short_term_rain，须调用独立 queryShortTermRain 接口。
	// example:
	//
	// 0
	ShortTermRain *string `json:"short_term_rain,omitempty" xml:"short_term_rain,omitempty"`
}

func (s WeatherVariable) String() string {
	return tea.Prettify(s)
}

func (s WeatherVariable) GoString() string {
	return s.String()
}

func (s *WeatherVariable) SetVariableDate(v string) *WeatherVariable {
	s.VariableDate = &v
	return s
}

func (s *WeatherVariable) SetForecastBatchTime(v string) *WeatherVariable {
	s.ForecastBatchTime = &v
	return s
}

func (s *WeatherVariable) SetTemperature2m(v string) *WeatherVariable {
	s.Temperature2m = &v
	return s
}

func (s *WeatherVariable) SetRelativeHumidity2m(v string) *WeatherVariable {
	s.RelativeHumidity2m = &v
	return s
}

func (s *WeatherVariable) SetDewPoint2m(v string) *WeatherVariable {
	s.DewPoint2m = &v
	return s
}

func (s *WeatherVariable) SetPressureMsl(v string) *WeatherVariable {
	s.PressureMsl = &v
	return s
}

func (s *WeatherVariable) SetSurfacePressure(v string) *WeatherVariable {
	s.SurfacePressure = &v
	return s
}

func (s *WeatherVariable) SetPrecipitationProbability(v string) *WeatherVariable {
	s.PrecipitationProbability = &v
	return s
}

func (s *WeatherVariable) SetCloudCover(v string) *WeatherVariable {
	s.CloudCover = &v
	return s
}

func (s *WeatherVariable) SetCloudCoverLow(v string) *WeatherVariable {
	s.CloudCoverLow = &v
	return s
}

func (s *WeatherVariable) SetCloudCoverMid(v string) *WeatherVariable {
	s.CloudCoverMid = &v
	return s
}

func (s *WeatherVariable) SetCloudCoverHigh(v string) *WeatherVariable {
	s.CloudCoverHigh = &v
	return s
}

func (s *WeatherVariable) SetShortwaveRadiation(v string) *WeatherVariable {
	s.ShortwaveRadiation = &v
	return s
}

func (s *WeatherVariable) SetDirectRadiation(v string) *WeatherVariable {
	s.DirectRadiation = &v
	return s
}

func (s *WeatherVariable) SetDirectNormalIrradiance(v string) *WeatherVariable {
	s.DirectNormalIrradiance = &v
	return s
}

func (s *WeatherVariable) SetDiffuseRadiation(v string) *WeatherVariable {
	s.DiffuseRadiation = &v
	return s
}

func (s *WeatherVariable) SetWindSpeed10m(v string) *WeatherVariable {
	s.WindSpeed10m = &v
	return s
}

func (s *WeatherVariable) SetWindSpeed80m(v string) *WeatherVariable {
	s.WindSpeed80m = &v
	return s
}

func (s *WeatherVariable) SetWindSpeed120m(v string) *WeatherVariable {
	s.WindSpeed120m = &v
	return s
}

func (s *WeatherVariable) SetWindDirection10m(v string) *WeatherVariable {
	s.WindDirection10m = &v
	return s
}

func (s *WeatherVariable) SetWindDirection80m(v string) *WeatherVariable {
	s.WindDirection80m = &v
	return s
}

func (s *WeatherVariable) SetWindDirection120m(v string) *WeatherVariable {
	s.WindDirection120m = &v
	return s
}

func (s *WeatherVariable) SetWeatherCode(v string) *WeatherVariable {
	s.WeatherCode = &v
	return s
}

func (s *WeatherVariable) SetApparentTemperature(v string) *WeatherVariable {
	s.ApparentTemperature = &v
	return s
}

func (s *WeatherVariable) SetRain(v string) *WeatherVariable {
	s.Rain = &v
	return s
}

func (s *WeatherVariable) SetPrecipitation(v string) *WeatherVariable {
	s.Precipitation = &v
	return s
}

func (s *WeatherVariable) SetSnowfall(v string) *WeatherVariable {
	s.Snowfall = &v
	return s
}

func (s *WeatherVariable) SetShortwaveRadiationInstant(v string) *WeatherVariable {
	s.ShortwaveRadiationInstant = &v
	return s
}

func (s *WeatherVariable) SetDirectRadiationInstant(v string) *WeatherVariable {
	s.DirectRadiationInstant = &v
	return s
}

func (s *WeatherVariable) SetDiffuseRadiationInstant(v string) *WeatherVariable {
	s.DiffuseRadiationInstant = &v
	return s
}

func (s *WeatherVariable) SetDirectNormalIrradianceInstant(v string) *WeatherVariable {
	s.DirectNormalIrradianceInstant = &v
	return s
}

func (s *WeatherVariable) SetWindSpeed180m(v string) *WeatherVariable {
	s.WindSpeed180m = &v
	return s
}

func (s *WeatherVariable) SetWindDirection180m(v string) *WeatherVariable {
	s.WindDirection180m = &v
	return s
}

func (s *WeatherVariable) SetShortTermRain(v string) *WeatherVariable {
	s.ShortTermRain = &v
	return s
}

type QueryRealtimePriceforecastRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 运行日期，yyyy-mm-dd
	RunDate *string `json:"run_date,omitempty" xml:"run_date,omitempty" require:"true"`
	// 业务类型 枚举： REAL_TIME - 实时 DAY_AHEAD - 日前
	//
	BusiType *string `json:"busi_type,omitempty" xml:"busi_type,omitempty" require:"true"`
	// 省地区编码，目前仅支持江苏省
	//
	Province *string `json:"province,omitempty" xml:"province,omitempty" require:"true"`
}

func (s QueryRealtimePriceforecastRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRealtimePriceforecastRequest) GoString() string {
	return s.String()
}

func (s *QueryRealtimePriceforecastRequest) SetAuthToken(v string) *QueryRealtimePriceforecastRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRealtimePriceforecastRequest) SetRunDate(v string) *QueryRealtimePriceforecastRequest {
	s.RunDate = &v
	return s
}

func (s *QueryRealtimePriceforecastRequest) SetBusiType(v string) *QueryRealtimePriceforecastRequest {
	s.BusiType = &v
	return s
}

func (s *QueryRealtimePriceforecastRequest) SetProvince(v string) *QueryRealtimePriceforecastRequest {
	s.Province = &v
	return s
}

type QueryRealtimePriceforecastResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 电价预测结果
	//
	Result []*PricePredictionItem `json:"result,omitempty" xml:"result,omitempty" type:"Repeated"`
}

func (s QueryRealtimePriceforecastResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRealtimePriceforecastResponse) GoString() string {
	return s.String()
}

func (s *QueryRealtimePriceforecastResponse) SetReqMsgId(v string) *QueryRealtimePriceforecastResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRealtimePriceforecastResponse) SetResultCode(v string) *QueryRealtimePriceforecastResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRealtimePriceforecastResponse) SetResultMsg(v string) *QueryRealtimePriceforecastResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRealtimePriceforecastResponse) SetResult(v []*PricePredictionItem) *QueryRealtimePriceforecastResponse {
	s.Result = v
	return s
}

type QueryBiddingspaceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 运行日期，yyyy-mm-dd
	QueryDate *string `json:"query_date,omitempty" xml:"query_date,omitempty" require:"true"`
	// 业务类型枚举，枚举范围如下
	// BIDDING_SPACE: 竞价空间
	//
	BusiType *string `json:"busi_type,omitempty" xml:"busi_type,omitempty" require:"true"`
	// 业务偏差类型枚举，枚举范围：
	// DAY_AHEAD_ACTUAL: 日前-实际
	// DAY_AHEAD_FORECAST: 日前-预测
	// PRE_CLEARING_ACTUAL: 预出清-实际
	// PRE_CLEARING_FORECAST: 预出清-预测
	// ACTUAL_FORECAST: 实际-预测
	// PRE_CLEARING: 预出清
	// DAY_AHEAD: 日前
	// REAL_TIME: 实时
	// ACTUAL: 实际
	DeviationType *string `json:"deviation_type,omitempty" xml:"deviation_type,omitempty" require:"true"`
	// 省地区编码，目前仅支持江苏省
	Province *string `json:"province,omitempty" xml:"province,omitempty" require:"true"`
}

func (s QueryBiddingspaceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBiddingspaceRequest) GoString() string {
	return s.String()
}

func (s *QueryBiddingspaceRequest) SetAuthToken(v string) *QueryBiddingspaceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBiddingspaceRequest) SetQueryDate(v string) *QueryBiddingspaceRequest {
	s.QueryDate = &v
	return s
}

func (s *QueryBiddingspaceRequest) SetBusiType(v string) *QueryBiddingspaceRequest {
	s.BusiType = &v
	return s
}

func (s *QueryBiddingspaceRequest) SetDeviationType(v string) *QueryBiddingspaceRequest {
	s.DeviationType = &v
	return s
}

func (s *QueryBiddingspaceRequest) SetProvince(v string) *QueryBiddingspaceRequest {
	s.Province = &v
	return s
}

type QueryBiddingspaceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 竞价空间分析
	BiddingAnalysis []*BiddingAnalysisData `json:"bidding_analysis,omitempty" xml:"bidding_analysis,omitempty" type:"Repeated"`
}

func (s QueryBiddingspaceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBiddingspaceResponse) GoString() string {
	return s.String()
}

func (s *QueryBiddingspaceResponse) SetReqMsgId(v string) *QueryBiddingspaceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBiddingspaceResponse) SetResultCode(v string) *QueryBiddingspaceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBiddingspaceResponse) SetResultMsg(v string) *QueryBiddingspaceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBiddingspaceResponse) SetBiddingAnalysis(v []*BiddingAnalysisData) *QueryBiddingspaceResponse {
	s.BiddingAnalysis = v
	return s
}

type QuerySimilardayRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 运行日，格式：yyyy-mm-dd
	RunDate *string `json:"run_date,omitempty" xml:"run_date,omitempty" require:"true"`
	// 相似日范围开始日，格式：yyyy-mm-dd
	SimilarStartDate *string `json:"similar_start_date,omitempty" xml:"similar_start_date,omitempty" require:"true"`
	// 相似日范围结束日，yyyy-MM-dd
	SimilarEndDate *string `json:"similar_end_date,omitempty" xml:"similar_end_date,omitempty" require:"true"`
	// 相似特征类型枚举，枚举范围
	// BIDDING_SPACE: 竞价空间
	// PROVINCIAL_DISPATCH_LOAD: 省调负荷
	// NEW_ENERGY_OUTPUT: 新能源出力
	// INTERCONNECTION_PLAN: 联络线计划
	SimilarFeatureType *string `json:"similar_feature_type,omitempty" xml:"similar_feature_type,omitempty" require:"true"`
	// 省地区编码，目前仅支持江苏省
	Province *string `json:"province,omitempty" xml:"province,omitempty" require:"true"`
}

func (s QuerySimilardayRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySimilardayRequest) GoString() string {
	return s.String()
}

func (s *QuerySimilardayRequest) SetAuthToken(v string) *QuerySimilardayRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySimilardayRequest) SetRunDate(v string) *QuerySimilardayRequest {
	s.RunDate = &v
	return s
}

func (s *QuerySimilardayRequest) SetSimilarStartDate(v string) *QuerySimilardayRequest {
	s.SimilarStartDate = &v
	return s
}

func (s *QuerySimilardayRequest) SetSimilarEndDate(v string) *QuerySimilardayRequest {
	s.SimilarEndDate = &v
	return s
}

func (s *QuerySimilardayRequest) SetSimilarFeatureType(v string) *QuerySimilardayRequest {
	s.SimilarFeatureType = &v
	return s
}

func (s *QuerySimilardayRequest) SetProvince(v string) *QuerySimilardayRequest {
	s.Province = &v
	return s
}

type QuerySimilardayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询范围内容的最接近相似日，格式：yyyy-MM-dd
	SimilarDay *string `json:"similar_day,omitempty" xml:"similar_day,omitempty"`
	// 相似日分析结果
	AnalysisResult []*SimilarDayAnalysisData `json:"analysis_result,omitempty" xml:"analysis_result,omitempty" type:"Repeated"`
}

func (s QuerySimilardayResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySimilardayResponse) GoString() string {
	return s.String()
}

func (s *QuerySimilardayResponse) SetReqMsgId(v string) *QuerySimilardayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySimilardayResponse) SetResultCode(v string) *QuerySimilardayResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySimilardayResponse) SetResultMsg(v string) *QuerySimilardayResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySimilardayResponse) SetSimilarDay(v string) *QuerySimilardayResponse {
	s.SimilarDay = &v
	return s
}

func (s *QuerySimilardayResponse) SetAnalysisResult(v []*SimilarDayAnalysisData) *QuerySimilardayResponse {
	s.AnalysisResult = v
	return s
}

type QueryAheadrealtimePricecompareRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 运行日，格式：yyyy-mm-dd
	RunDate *string `json:"run_date,omitempty" xml:"run_date,omitempty" require:"true"`
	// 省地区编码，目前仅支持江苏省
	Province *string `json:"province,omitempty" xml:"province,omitempty" require:"true"`
}

func (s QueryAheadrealtimePricecompareRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAheadrealtimePricecompareRequest) GoString() string {
	return s.String()
}

func (s *QueryAheadrealtimePricecompareRequest) SetAuthToken(v string) *QueryAheadrealtimePricecompareRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAheadrealtimePricecompareRequest) SetRunDate(v string) *QueryAheadrealtimePricecompareRequest {
	s.RunDate = &v
	return s
}

func (s *QueryAheadrealtimePricecompareRequest) SetProvince(v string) *QueryAheadrealtimePricecompareRequest {
	s.Province = &v
	return s
}

type QueryAheadrealtimePricecompareResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 电价对比点位
	PriceCompare []*AheadRealtimePriceCompareData `json:"price_compare,omitempty" xml:"price_compare,omitempty" type:"Repeated"`
}

func (s QueryAheadrealtimePricecompareResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAheadrealtimePricecompareResponse) GoString() string {
	return s.String()
}

func (s *QueryAheadrealtimePricecompareResponse) SetReqMsgId(v string) *QueryAheadrealtimePricecompareResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAheadrealtimePricecompareResponse) SetResultCode(v string) *QueryAheadrealtimePricecompareResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAheadrealtimePricecompareResponse) SetResultMsg(v string) *QueryAheadrealtimePricecompareResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAheadrealtimePricecompareResponse) SetPriceCompare(v []*AheadRealtimePriceCompareData) *QueryAheadrealtimePricecompareResponse {
	s.PriceCompare = v
	return s
}

type QueryAheadrealtimePricediffpredictionRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 运行日，格式：yyyy-mm-dd
	RunDate *string `json:"run_date,omitempty" xml:"run_date,omitempty" require:"true"`
	// 省份行政编码，目前仅支持江苏省
	Province *string `json:"province,omitempty" xml:"province,omitempty" require:"true"`
}

func (s QueryAheadrealtimePricediffpredictionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAheadrealtimePricediffpredictionRequest) GoString() string {
	return s.String()
}

func (s *QueryAheadrealtimePricediffpredictionRequest) SetAuthToken(v string) *QueryAheadrealtimePricediffpredictionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAheadrealtimePricediffpredictionRequest) SetRunDate(v string) *QueryAheadrealtimePricediffpredictionRequest {
	s.RunDate = &v
	return s
}

func (s *QueryAheadrealtimePricediffpredictionRequest) SetProvince(v string) *QueryAheadrealtimePricediffpredictionRequest {
	s.Province = &v
	return s
}

type QueryAheadrealtimePricediffpredictionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 全天价差方向预测准确率
	PreAccuracy *string `json:"pre_accuracy,omitempty" xml:"pre_accuracy,omitempty"`
	// 光伏价差方向预测准确率
	PvPreAccuracy *string `json:"pv_pre_accuracy,omitempty" xml:"pv_pre_accuracy,omitempty"`
	// 价差预测列表
	PriceDiffPredictionList []*AheadRealtimePriceDiffPredictionData `json:"price_diff_prediction_list,omitempty" xml:"price_diff_prediction_list,omitempty" type:"Repeated"`
}

func (s QueryAheadrealtimePricediffpredictionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAheadrealtimePricediffpredictionResponse) GoString() string {
	return s.String()
}

func (s *QueryAheadrealtimePricediffpredictionResponse) SetReqMsgId(v string) *QueryAheadrealtimePricediffpredictionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAheadrealtimePricediffpredictionResponse) SetResultCode(v string) *QueryAheadrealtimePricediffpredictionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAheadrealtimePricediffpredictionResponse) SetResultMsg(v string) *QueryAheadrealtimePricediffpredictionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAheadrealtimePricediffpredictionResponse) SetPreAccuracy(v string) *QueryAheadrealtimePricediffpredictionResponse {
	s.PreAccuracy = &v
	return s
}

func (s *QueryAheadrealtimePricediffpredictionResponse) SetPvPreAccuracy(v string) *QueryAheadrealtimePricediffpredictionResponse {
	s.PvPreAccuracy = &v
	return s
}

func (s *QueryAheadrealtimePricediffpredictionResponse) SetPriceDiffPredictionList(v []*AheadRealtimePriceDiffPredictionData) *QueryAheadrealtimePricediffpredictionResponse {
	s.PriceDiffPredictionList = v
	return s
}

type QueryWeatherWarningRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 省份行政编码
	Province *string `json:"province,omitempty" xml:"province,omitempty" require:"true"`
	// 查询日期，格式：yyyy-MM-dd
	QueryDate *string `json:"query_date,omitempty" xml:"query_date,omitempty"`
	// 城市行政编码
	City *string `json:"city,omitempty" xml:"city,omitempty" require:"true"`
}

func (s QueryWeatherWarningRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryWeatherWarningRequest) GoString() string {
	return s.String()
}

func (s *QueryWeatherWarningRequest) SetAuthToken(v string) *QueryWeatherWarningRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryWeatherWarningRequest) SetProvince(v string) *QueryWeatherWarningRequest {
	s.Province = &v
	return s
}

func (s *QueryWeatherWarningRequest) SetQueryDate(v string) *QueryWeatherWarningRequest {
	s.QueryDate = &v
	return s
}

func (s *QueryWeatherWarningRequest) SetCity(v string) *QueryWeatherWarningRequest {
	s.City = &v
	return s
}

type QueryWeatherWarningResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 气象预警信息
	WarningInfo []*WeatherWarningData `json:"warning_info,omitempty" xml:"warning_info,omitempty" type:"Repeated"`
}

func (s QueryWeatherWarningResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryWeatherWarningResponse) GoString() string {
	return s.String()
}

func (s *QueryWeatherWarningResponse) SetReqMsgId(v string) *QueryWeatherWarningResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryWeatherWarningResponse) SetResultCode(v string) *QueryWeatherWarningResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryWeatherWarningResponse) SetResultMsg(v string) *QueryWeatherWarningResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryWeatherWarningResponse) SetWarningInfo(v []*WeatherWarningData) *QueryWeatherWarningResponse {
	s.WarningInfo = v
	return s
}

type QueryKmVersionRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 树ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty" require:"true"`
}

func (s QueryKmVersionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryKmVersionRequest) GoString() string {
	return s.String()
}

func (s *QueryKmVersionRequest) SetAuthToken(v string) *QueryKmVersionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryKmVersionRequest) SetTreeId(v string) *QueryKmVersionRequest {
	s.TreeId = &v
	return s
}

type QueryKmVersionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 树ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty"`
	// 版本
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
}

func (s QueryKmVersionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryKmVersionResponse) GoString() string {
	return s.String()
}

func (s *QueryKmVersionResponse) SetReqMsgId(v string) *QueryKmVersionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryKmVersionResponse) SetResultCode(v string) *QueryKmVersionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryKmVersionResponse) SetResultMsg(v string) *QueryKmVersionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryKmVersionResponse) SetTreeId(v string) *QueryKmVersionResponse {
	s.TreeId = &v
	return s
}

func (s *QueryKmVersionResponse) SetVersion(v string) *QueryKmVersionResponse {
	s.Version = &v
	return s
}

func (s *QueryKmVersionResponse) SetDescription(v string) *QueryKmVersionResponse {
	s.Description = &v
	return s
}

type SyncKmVersionRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 树ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty" require:"true"`
	// 版本号
	TreeVersion *string `json:"tree_version,omitempty" xml:"tree_version,omitempty" require:"true"`
}

func (s SyncKmVersionRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncKmVersionRequest) GoString() string {
	return s.String()
}

func (s *SyncKmVersionRequest) SetAuthToken(v string) *SyncKmVersionRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncKmVersionRequest) SetTreeId(v string) *SyncKmVersionRequest {
	s.TreeId = &v
	return s
}

func (s *SyncKmVersionRequest) SetTreeVersion(v string) *SyncKmVersionRequest {
	s.TreeVersion = &v
	return s
}

type SyncKmVersionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 树ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty"`
	// 版本
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
	// 快照原文
	Snapshot *string `json:"snapshot,omitempty" xml:"snapshot,omitempty"`
	// 版本关联的文档详情列表
	Documents []*SnapshotDocumentItem `json:"documents,omitempty" xml:"documents,omitempty" type:"Repeated"`
}

func (s SyncKmVersionResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncKmVersionResponse) GoString() string {
	return s.String()
}

func (s *SyncKmVersionResponse) SetReqMsgId(v string) *SyncKmVersionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncKmVersionResponse) SetResultCode(v string) *SyncKmVersionResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncKmVersionResponse) SetResultMsg(v string) *SyncKmVersionResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncKmVersionResponse) SetTreeId(v string) *SyncKmVersionResponse {
	s.TreeId = &v
	return s
}

func (s *SyncKmVersionResponse) SetVersion(v string) *SyncKmVersionResponse {
	s.Version = &v
	return s
}

func (s *SyncKmVersionResponse) SetSnapshot(v string) *SyncKmVersionResponse {
	s.Snapshot = &v
	return s
}

func (s *SyncKmVersionResponse) SetDocuments(v []*SnapshotDocumentItem) *SyncKmVersionResponse {
	s.Documents = v
	return s
}

type SyncKmDocumentRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 树ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty" require:"true"`
	// 节点ID
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty" require:"true"`
	// 向量文档ID
	DocMapId *string `json:"doc_map_id,omitempty" xml:"doc_map_id,omitempty" require:"true"`
}

func (s SyncKmDocumentRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncKmDocumentRequest) GoString() string {
	return s.String()
}

func (s *SyncKmDocumentRequest) SetAuthToken(v string) *SyncKmDocumentRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncKmDocumentRequest) SetTreeId(v string) *SyncKmDocumentRequest {
	s.TreeId = &v
	return s
}

func (s *SyncKmDocumentRequest) SetNodeId(v string) *SyncKmDocumentRequest {
	s.NodeId = &v
	return s
}

func (s *SyncKmDocumentRequest) SetDocMapId(v string) *SyncKmDocumentRequest {
	s.DocMapId = &v
	return s
}

type SyncKmDocumentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文档基础信息
	DocumentInfo *DocumentInfoDTO `json:"document_info,omitempty" xml:"document_info,omitempty"`
	// 向量文档id
	DocMapId *string `json:"doc_map_id,omitempty" xml:"doc_map_id,omitempty"`
	// 加工后的文档数据
	ProcessedData *DocumentProcessingDataDTO `json:"processed_data,omitempty" xml:"processed_data,omitempty"`
	// oss预览地址
	OssPreviewUrl *string `json:"oss_preview_url,omitempty" xml:"oss_preview_url,omitempty"`
}

func (s SyncKmDocumentResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncKmDocumentResponse) GoString() string {
	return s.String()
}

func (s *SyncKmDocumentResponse) SetReqMsgId(v string) *SyncKmDocumentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncKmDocumentResponse) SetResultCode(v string) *SyncKmDocumentResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncKmDocumentResponse) SetResultMsg(v string) *SyncKmDocumentResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncKmDocumentResponse) SetDocumentInfo(v *DocumentInfoDTO) *SyncKmDocumentResponse {
	s.DocumentInfo = v
	return s
}

func (s *SyncKmDocumentResponse) SetDocMapId(v string) *SyncKmDocumentResponse {
	s.DocMapId = &v
	return s
}

func (s *SyncKmDocumentResponse) SetProcessedData(v *DocumentProcessingDataDTO) *SyncKmDocumentResponse {
	s.ProcessedData = v
	return s
}

func (s *SyncKmDocumentResponse) SetOssPreviewUrl(v string) *SyncKmDocumentResponse {
	s.OssPreviewUrl = &v
	return s
}

type QueryKmRagRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 用户问题
	Query *string `json:"query,omitempty" xml:"query,omitempty" require:"true"`
	// 子范围标识（目录树），用于缩小召回范围；不传则不限范围
	KnowledgeBaseIds []*string `json:"knowledge_base_ids,omitempty" xml:"knowledge_base_ids,omitempty" type:"Repeated"`
	// 召回条数
	Topk *int64 `json:"topk,omitempty" xml:"topk,omitempty"`
	// 是否包含引用来源
	IncludeReferences *bool `json:"include_references,omitempty" xml:"include_references,omitempty"`
}

func (s QueryKmRagRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryKmRagRequest) GoString() string {
	return s.String()
}

func (s *QueryKmRagRequest) SetAuthToken(v string) *QueryKmRagRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryKmRagRequest) SetQuery(v string) *QueryKmRagRequest {
	s.Query = &v
	return s
}

func (s *QueryKmRagRequest) SetKnowledgeBaseIds(v []*string) *QueryKmRagRequest {
	s.KnowledgeBaseIds = v
	return s
}

func (s *QueryKmRagRequest) SetTopk(v int64) *QueryKmRagRequest {
	s.Topk = &v
	return s
}

func (s *QueryKmRagRequest) SetIncludeReferences(v bool) *QueryKmRagRequest {
	s.IncludeReferences = &v
	return s
}

type QueryKmRagResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 答案
	Answer *string `json:"answer,omitempty" xml:"answer,omitempty"`
	// 置信度
	Confidence *int64 `json:"confidence,omitempty" xml:"confidence,omitempty"`
	// 引用来源
	References []*string `json:"references,omitempty" xml:"references,omitempty" type:"Repeated"`
}

func (s QueryKmRagResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryKmRagResponse) GoString() string {
	return s.String()
}

func (s *QueryKmRagResponse) SetReqMsgId(v string) *QueryKmRagResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryKmRagResponse) SetResultCode(v string) *QueryKmRagResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryKmRagResponse) SetResultMsg(v string) *QueryKmRagResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryKmRagResponse) SetAnswer(v string) *QueryKmRagResponse {
	s.Answer = &v
	return s
}

func (s *QueryKmRagResponse) SetConfidence(v int64) *QueryKmRagResponse {
	s.Confidence = &v
	return s
}

func (s *QueryKmRagResponse) SetReferences(v []*string) *QueryKmRagResponse {
	s.References = v
	return s
}

type QueryWeatherForecastRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求 ID，由调用方生成，用于请求追踪，不可为空。
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 纬度，十进制度数；Java 类型 BigDecimal。查询位置须符合产品合约的站点授权范围。
	Latitude *string `json:"latitude,omitempty" xml:"latitude,omitempty" require:"true"`
	// 经度，十进制度数；Java 类型 BigDecimal。查询位置须符合产品合约的站点授权范围。
	Longitude *string `json:"longitude,omitempty" xml:"longitude,omitempty" require:"true"`
	// 需要预测的天数；未传 past_days 时必须大于等于 1；当前产品面向 15 天以内预测。注意：当输入为1时表示预测今天的数据，输入2时表示预测明天数据，以此推类。
	ForecastDays *int64 `json:"forecast_days,omitempty" xml:"forecast_days,omitempty" require:"true"`
	// 此前预测的天数，可选且不能为负数。内部数据查询未传时按 0 处理，查询起点为当天减去 past_days。
	PastDays *int64 `json:"past_days,omitempty" xml:"past_days,omitempty"`
	// 气象要素编码列表，不可为空，数量不得超过合约许可。示例包含温度、湿度、天气代码、10米风速、降水量和总云量；short_term_rain 须使用独立短临降水接口。
	WeatherVariables []*string `json:"weather_variables,omitempty" xml:"weather_variables,omitempty" require:"true" type:"Repeated"`
}

func (s QueryWeatherForecastRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryWeatherForecastRequest) GoString() string {
	return s.String()
}

func (s *QueryWeatherForecastRequest) SetAuthToken(v string) *QueryWeatherForecastRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryWeatherForecastRequest) SetRequestId(v string) *QueryWeatherForecastRequest {
	s.RequestId = &v
	return s
}

func (s *QueryWeatherForecastRequest) SetLatitude(v string) *QueryWeatherForecastRequest {
	s.Latitude = &v
	return s
}

func (s *QueryWeatherForecastRequest) SetLongitude(v string) *QueryWeatherForecastRequest {
	s.Longitude = &v
	return s
}

func (s *QueryWeatherForecastRequest) SetForecastDays(v int64) *QueryWeatherForecastRequest {
	s.ForecastDays = &v
	return s
}

func (s *QueryWeatherForecastRequest) SetPastDays(v int64) *QueryWeatherForecastRequest {
	s.PastDays = &v
	return s
}

func (s *QueryWeatherForecastRequest) SetWeatherVariables(v []*string) *QueryWeatherForecastRequest {
	s.WeatherVariables = v
	return s
}

type QueryWeatherForecastResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 本次查询消耗的额度，Java 类型 BigDecimal；内部数据链路成功查询固定消耗 1，MAYA 链路取下游返回值，可能为空。
	QuotaCost *string `json:"quota_cost,omitempty" xml:"quota_cost,omitempty"`
	// 实际返回的气象预测数据批次时间，Java 类型 Date；数据链路未提供批次时可能为空。
	ForecastBatchTime *string `json:"forecast_batch_time,omitempty" xml:"forecast_batch_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 气象数据列表，每个元素为 WeatherVariableDTO，包含时间、预测批次及各气象要素。要素值在 Java DTO 中为 String，未返回或缺测时可能为空。
	WeatherVariablesList []*WeatherVariable `json:"weather_variables_list,omitempty" xml:"weather_variables_list,omitempty" type:"Repeated"`
	// 本次请求 ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s QueryWeatherForecastResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryWeatherForecastResponse) GoString() string {
	return s.String()
}

func (s *QueryWeatherForecastResponse) SetReqMsgId(v string) *QueryWeatherForecastResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryWeatherForecastResponse) SetResultCode(v string) *QueryWeatherForecastResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryWeatherForecastResponse) SetResultMsg(v string) *QueryWeatherForecastResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryWeatherForecastResponse) SetQuotaCost(v string) *QueryWeatherForecastResponse {
	s.QuotaCost = &v
	return s
}

func (s *QueryWeatherForecastResponse) SetForecastBatchTime(v string) *QueryWeatherForecastResponse {
	s.ForecastBatchTime = &v
	return s
}

func (s *QueryWeatherForecastResponse) SetWeatherVariablesList(v []*WeatherVariable) *QueryWeatherForecastResponse {
	s.WeatherVariablesList = v
	return s
}

func (s *QueryWeatherForecastResponse) SetRequestId(v string) *QueryWeatherForecastResponse {
	s.RequestId = &v
	return s
}

type QueryWeatherLongrangeRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求唯一标识，用于请求追踪和问题定位。
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 查询地点纬度，取值范围 -90～90。
	Latitude *string `json:"latitude,omitempty" xml:"latitude,omitempty" require:"true"`
	// 查询地点经度，取值范围 -180～180。
	Longitude *string `json:"longitude,omitempty" xml:"longitude,omitempty" require:"true"`
	// 预测截止天数，整数 16～45。返回未来第 16 天至第 forecast_days 天（含）的预测数据，每 6 小时一个数据点；
	ForecastDays *int64 `json:"forecast_days,omitempty" xml:"forecast_days,omitempty" require:"true"`
	// 气象要素编码列表，至少一项，使用代码定义的驼峰编码，如 temperature2m、windSpeed10m；仅返回指定要素。
	WeatherVariables []*string `json:"weather_variables,omitempty" xml:"weather_variables,omitempty" require:"true" type:"Repeated"`
}

func (s QueryWeatherLongrangeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryWeatherLongrangeRequest) GoString() string {
	return s.String()
}

func (s *QueryWeatherLongrangeRequest) SetAuthToken(v string) *QueryWeatherLongrangeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryWeatherLongrangeRequest) SetRequestId(v string) *QueryWeatherLongrangeRequest {
	s.RequestId = &v
	return s
}

func (s *QueryWeatherLongrangeRequest) SetLatitude(v string) *QueryWeatherLongrangeRequest {
	s.Latitude = &v
	return s
}

func (s *QueryWeatherLongrangeRequest) SetLongitude(v string) *QueryWeatherLongrangeRequest {
	s.Longitude = &v
	return s
}

func (s *QueryWeatherLongrangeRequest) SetForecastDays(v int64) *QueryWeatherLongrangeRequest {
	s.ForecastDays = &v
	return s
}

func (s *QueryWeatherLongrangeRequest) SetWeatherVariables(v []*string) *QueryWeatherLongrangeRequest {
	s.WeatherVariables = v
	return s
}

type QueryWeatherLongrangeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求唯一标识，与入参一致；对应 Java requestId。
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 本次查询配额消耗，对应 quotaCost，成功查询固定为 1。
	QuotaCost *string `json:"quota_cost,omitempty" xml:"quota_cost,omitempty"`
	// 预测数据批次时间，格式 yyyy-MM-dd HH:mm:ss。
	ForecastBatchTime *string `json:"forecast_batch_time,omitempty" xml:"forecast_batch_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 中长期气象预测数据列表，未来第 16 天至指定截止天，每 6 小时一个数据点。仅返回请求指定的气象要素；网关字段需映射至 WeatherLongRangeVariableDTO 对应 Java 属性。
	WeatherVariablesList []*WeatherLongRangeVariable `json:"weather_variables_list,omitempty" xml:"weather_variables_list,omitempty" type:"Repeated"`
}

func (s QueryWeatherLongrangeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryWeatherLongrangeResponse) GoString() string {
	return s.String()
}

func (s *QueryWeatherLongrangeResponse) SetReqMsgId(v string) *QueryWeatherLongrangeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryWeatherLongrangeResponse) SetResultCode(v string) *QueryWeatherLongrangeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryWeatherLongrangeResponse) SetResultMsg(v string) *QueryWeatherLongrangeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryWeatherLongrangeResponse) SetRequestId(v string) *QueryWeatherLongrangeResponse {
	s.RequestId = &v
	return s
}

func (s *QueryWeatherLongrangeResponse) SetQuotaCost(v string) *QueryWeatherLongrangeResponse {
	s.QuotaCost = &v
	return s
}

func (s *QueryWeatherLongrangeResponse) SetForecastBatchTime(v string) *QueryWeatherLongrangeResponse {
	s.ForecastBatchTime = &v
	return s
}

func (s *QueryWeatherLongrangeResponse) SetWeatherVariablesList(v []*WeatherLongRangeVariable) *QueryWeatherLongrangeResponse {
	s.WeatherVariablesList = v
	return s
}

type QueryPanoraindexPolicyRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 根据标题模糊搜搜
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// 根据标题或地区模糊搜索
	Titleorregionlike *string `json:"titleorregionlike,omitempty" xml:"titleorregionlike,omitempty"`
	// 一页数据量，最大100
	Pagesize *int64 `json:"pagesize,omitempty" xml:"pagesize,omitempty"`
	// 排序字段
	Orderby *string `json:"orderby,omitempty" xml:"orderby,omitempty"`
	// 排序方向（ASC/DESC，默认为DESC）
	Orderdirection *string `json:"orderdirection,omitempty" xml:"orderdirection,omitempty"`
	// 最小id，用于游标翻页
	Minid *int64 `json:"minid,omitempty" xml:"minid,omitempty"`
	// 页号
	Pagenum *int64 `json:"pagenum,omitempty" xml:"pagenum,omitempty"`
	// 来源网站code码，可批量查询最多填15个
	Websitecode []*string `json:"websitecode,omitempty" xml:"websitecode,omitempty" type:"Repeated"`
}

func (s QueryPanoraindexPolicyRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryPanoraindexPolicyRequest) GoString() string {
	return s.String()
}

func (s *QueryPanoraindexPolicyRequest) SetAuthToken(v string) *QueryPanoraindexPolicyRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryPanoraindexPolicyRequest) SetTitle(v string) *QueryPanoraindexPolicyRequest {
	s.Title = &v
	return s
}

func (s *QueryPanoraindexPolicyRequest) SetTitleorregionlike(v string) *QueryPanoraindexPolicyRequest {
	s.Titleorregionlike = &v
	return s
}

func (s *QueryPanoraindexPolicyRequest) SetPagesize(v int64) *QueryPanoraindexPolicyRequest {
	s.Pagesize = &v
	return s
}

func (s *QueryPanoraindexPolicyRequest) SetOrderby(v string) *QueryPanoraindexPolicyRequest {
	s.Orderby = &v
	return s
}

func (s *QueryPanoraindexPolicyRequest) SetOrderdirection(v string) *QueryPanoraindexPolicyRequest {
	s.Orderdirection = &v
	return s
}

func (s *QueryPanoraindexPolicyRequest) SetMinid(v int64) *QueryPanoraindexPolicyRequest {
	s.Minid = &v
	return s
}

func (s *QueryPanoraindexPolicyRequest) SetPagenum(v int64) *QueryPanoraindexPolicyRequest {
	s.Pagenum = &v
	return s
}

func (s *QueryPanoraindexPolicyRequest) SetWebsitecode(v []*string) *QueryPanoraindexPolicyRequest {
	s.Websitecode = v
	return s
}

type QueryPanoraindexPolicyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 唯一主键
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 标题
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// 政策正文内容
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 附件list详情
	Attachmentdatalist []*EpiAdmEnergyPolicyAttachment `json:"attachmentdatalist,omitempty" xml:"attachmentdatalist,omitempty" type:"Repeated"`
	// 原文链接
	Sourceurl *string `json:"sourceurl,omitempty" xml:"sourceurl,omitempty"`
	// 政策发布日期
	Releasedate *string `json:"releasedate,omitempty" xml:"releasedate,omitempty"`
	// 披露主体
	Issuingbody *string `json:"issuingbody,omitempty" xml:"issuingbody,omitempty"`
	// 政策对应的区域
	Region *string `json:"region,omitempty" xml:"region,omitempty"`
	// 政策分类
	Category *string `json:"category,omitempty" xml:"category,omitempty"`
	// 政策文号
	Policynumber *string `json:"policynumber,omitempty" xml:"policynumber,omitempty"`
	// 来源网站Code码
	Websitecode *string `json:"websitecode,omitempty" xml:"websitecode,omitempty"`
	// 来源网站名称
	Websitename *string `json:"websitename,omitempty" xml:"websitename,omitempty"`
}

func (s QueryPanoraindexPolicyResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryPanoraindexPolicyResponse) GoString() string {
	return s.String()
}

func (s *QueryPanoraindexPolicyResponse) SetReqMsgId(v string) *QueryPanoraindexPolicyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryPanoraindexPolicyResponse) SetResultCode(v string) *QueryPanoraindexPolicyResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryPanoraindexPolicyResponse) SetResultMsg(v string) *QueryPanoraindexPolicyResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryPanoraindexPolicyResponse) SetId(v int64) *QueryPanoraindexPolicyResponse {
	s.Id = &v
	return s
}

func (s *QueryPanoraindexPolicyResponse) SetTitle(v string) *QueryPanoraindexPolicyResponse {
	s.Title = &v
	return s
}

func (s *QueryPanoraindexPolicyResponse) SetContent(v string) *QueryPanoraindexPolicyResponse {
	s.Content = &v
	return s
}

func (s *QueryPanoraindexPolicyResponse) SetAttachmentdatalist(v []*EpiAdmEnergyPolicyAttachment) *QueryPanoraindexPolicyResponse {
	s.Attachmentdatalist = v
	return s
}

func (s *QueryPanoraindexPolicyResponse) SetSourceurl(v string) *QueryPanoraindexPolicyResponse {
	s.Sourceurl = &v
	return s
}

func (s *QueryPanoraindexPolicyResponse) SetReleasedate(v string) *QueryPanoraindexPolicyResponse {
	s.Releasedate = &v
	return s
}

func (s *QueryPanoraindexPolicyResponse) SetIssuingbody(v string) *QueryPanoraindexPolicyResponse {
	s.Issuingbody = &v
	return s
}

func (s *QueryPanoraindexPolicyResponse) SetRegion(v string) *QueryPanoraindexPolicyResponse {
	s.Region = &v
	return s
}

func (s *QueryPanoraindexPolicyResponse) SetCategory(v string) *QueryPanoraindexPolicyResponse {
	s.Category = &v
	return s
}

func (s *QueryPanoraindexPolicyResponse) SetPolicynumber(v string) *QueryPanoraindexPolicyResponse {
	s.Policynumber = &v
	return s
}

func (s *QueryPanoraindexPolicyResponse) SetWebsitecode(v string) *QueryPanoraindexPolicyResponse {
	s.Websitecode = &v
	return s
}

func (s *QueryPanoraindexPolicyResponse) SetWebsitename(v string) *QueryPanoraindexPolicyResponse {
	s.Websitename = &v
	return s
}

type QueryTraderesultRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s QueryTraderesultRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTraderesultRequest) GoString() string {
	return s.String()
}

func (s *QueryTraderesultRequest) SetAuthToken(v string) *QueryTraderesultRequest {
	s.AuthToken = &v
	return s
}

type QueryTraderesultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryTraderesultResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTraderesultResponse) GoString() string {
	return s.String()
}

func (s *QueryTraderesultResponse) SetReqMsgId(v string) *QueryTraderesultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTraderesultResponse) SetResultCode(v string) *QueryTraderesultResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTraderesultResponse) SetResultMsg(v string) *QueryTraderesultResponse {
	s.ResultMsg = &v
	return s
}

type QueryElectricMarketpriceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 市场码
	MarketCode *string `json:"market_code,omitempty" xml:"market_code,omitempty" require:"true"`
	// 查询类型:DAY_AHEAD 日前预测 / REALTIME 实时,可单传或都传
	QueryTypeList []*string `json:"query_type_list,omitempty" xml:"query_type_list,omitempty" require:"true" type:"Repeated"`
	// 查询日期起始,格式 yyyy-MM-dd,与 query_date_end 配套闭区间,最多7天,与 query_date_list 二选一
	QueryDateStart *string `json:"query_date_start,omitempty" xml:"query_date_start,omitempty"`
	// 查询日期结束,格式 yyyy-MM-dd,与 query_date_start 配套闭区间,最多7天,与 query_date_list 二选一
	QueryDateEnd *string `json:"query_date_end,omitempty" xml:"query_date_end,omitempty"`
	// 查询日期列表,格式 yyyy-MM-dd,与 start/end 二选一,最多7个
	QueryDateList []*string `json:"query_date_list,omitempty" xml:"query_date_list,omitempty" type:"Repeated"`
	// 时点起始,1~96 整数,不传默认1
	PeriodStart *int64 `json:"period_start,omitempty" xml:"period_start,omitempty"`
	// 时点结束,1~96 整数,不传默认96
	PeriodEnd *int64 `json:"period_end,omitempty" xml:"period_end,omitempty"`
}

func (s QueryElectricMarketpriceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryElectricMarketpriceRequest) GoString() string {
	return s.String()
}

func (s *QueryElectricMarketpriceRequest) SetAuthToken(v string) *QueryElectricMarketpriceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryElectricMarketpriceRequest) SetMarketCode(v string) *QueryElectricMarketpriceRequest {
	s.MarketCode = &v
	return s
}

func (s *QueryElectricMarketpriceRequest) SetQueryTypeList(v []*string) *QueryElectricMarketpriceRequest {
	s.QueryTypeList = v
	return s
}

func (s *QueryElectricMarketpriceRequest) SetQueryDateStart(v string) *QueryElectricMarketpriceRequest {
	s.QueryDateStart = &v
	return s
}

func (s *QueryElectricMarketpriceRequest) SetQueryDateEnd(v string) *QueryElectricMarketpriceRequest {
	s.QueryDateEnd = &v
	return s
}

func (s *QueryElectricMarketpriceRequest) SetQueryDateList(v []*string) *QueryElectricMarketpriceRequest {
	s.QueryDateList = v
	return s
}

func (s *QueryElectricMarketpriceRequest) SetPeriodStart(v int64) *QueryElectricMarketpriceRequest {
	s.PeriodStart = &v
	return s
}

func (s *QueryElectricMarketpriceRequest) SetPeriodEnd(v int64) *QueryElectricMarketpriceRequest {
	s.PeriodEnd = &v
	return s
}

type QueryElectricMarketpriceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回记录总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 市场价格列表
	Data []*MarketPrice `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryElectricMarketpriceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryElectricMarketpriceResponse) GoString() string {
	return s.String()
}

func (s *QueryElectricMarketpriceResponse) SetReqMsgId(v string) *QueryElectricMarketpriceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryElectricMarketpriceResponse) SetResultCode(v string) *QueryElectricMarketpriceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryElectricMarketpriceResponse) SetResultMsg(v string) *QueryElectricMarketpriceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryElectricMarketpriceResponse) SetTotalCount(v int64) *QueryElectricMarketpriceResponse {
	s.TotalCount = &v
	return s
}

func (s *QueryElectricMarketpriceResponse) SetData(v []*MarketPrice) *QueryElectricMarketpriceResponse {
	s.Data = v
	return s
}

type QueryElectricCommondataRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 主数据实体稳定编码
	EntityCode *string `json:"entity_code,omitempty" xml:"entity_code,omitempty" require:"true"`
	// 实体结构版本
	SchemaVersion *string `json:"schema_version,omitempty" xml:"schema_version,omitempty" require:"true"`
	// JSON 查询条件；无条件时传 {}
	QueryJson *string `json:"query_json,omitempty" xml:"query_json,omitempty" require:"true"`
	// 页码，默认1，最小1
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty"`
	// 每页数量，默认200，最大1000
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s QueryElectricCommondataRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryElectricCommondataRequest) GoString() string {
	return s.String()
}

func (s *QueryElectricCommondataRequest) SetAuthToken(v string) *QueryElectricCommondataRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryElectricCommondataRequest) SetEntityCode(v string) *QueryElectricCommondataRequest {
	s.EntityCode = &v
	return s
}

func (s *QueryElectricCommondataRequest) SetSchemaVersion(v string) *QueryElectricCommondataRequest {
	s.SchemaVersion = &v
	return s
}

func (s *QueryElectricCommondataRequest) SetQueryJson(v string) *QueryElectricCommondataRequest {
	s.QueryJson = &v
	return s
}

func (s *QueryElectricCommondataRequest) SetPageNo(v int64) *QueryElectricCommondataRequest {
	s.PageNo = &v
	return s
}

func (s *QueryElectricCommondataRequest) SetPageSize(v int64) *QueryElectricCommondataRequest {
	s.PageSize = &v
	return s
}

type QueryElectricCommondataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实际返回的实体编码
	EntityCode *string `json:"entity_code,omitempty" xml:"entity_code,omitempty"`
	// 实际返回的实体结构版本
	SchemaVersion *string `json:"schema_version,omitempty" xml:"schema_version,omitempty"`
	// JSON数组字符串；成功但无数据时为 []
	DataJson *string `json:"data_json,omitempty" xml:"data_json,omitempty"`
	// 完整性、覆盖范围和来源等元数据
	MetaJson *string `json:"meta_json,omitempty" xml:"meta_json,omitempty"`
	// 符合条件的总记录数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 当前页码
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty"`
	// 当前分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s QueryElectricCommondataResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryElectricCommondataResponse) GoString() string {
	return s.String()
}

func (s *QueryElectricCommondataResponse) SetReqMsgId(v string) *QueryElectricCommondataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryElectricCommondataResponse) SetResultCode(v string) *QueryElectricCommondataResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryElectricCommondataResponse) SetResultMsg(v string) *QueryElectricCommondataResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryElectricCommondataResponse) SetEntityCode(v string) *QueryElectricCommondataResponse {
	s.EntityCode = &v
	return s
}

func (s *QueryElectricCommondataResponse) SetSchemaVersion(v string) *QueryElectricCommondataResponse {
	s.SchemaVersion = &v
	return s
}

func (s *QueryElectricCommondataResponse) SetDataJson(v string) *QueryElectricCommondataResponse {
	s.DataJson = &v
	return s
}

func (s *QueryElectricCommondataResponse) SetMetaJson(v string) *QueryElectricCommondataResponse {
	s.MetaJson = &v
	return s
}

func (s *QueryElectricCommondataResponse) SetTotalCount(v int64) *QueryElectricCommondataResponse {
	s.TotalCount = &v
	return s
}

func (s *QueryElectricCommondataResponse) SetPageNo(v int64) *QueryElectricCommondataResponse {
	s.PageNo = &v
	return s
}

func (s *QueryElectricCommondataResponse) SetPageSize(v int64) *QueryElectricCommondataResponse {
	s.PageSize = &v
	return s
}

type QueryAppmarketCommondataRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 实体编码：WeatherData、WeatherWarning、BiddingSpace
	EntityCode *string `json:"entity_code,omitempty" xml:"entity_code,omitempty" require:"true"`
	// 实体数据结构版本
	SchemaVersion *string `json:"schema_version,omitempty" xml:"schema_version,omitempty" require:"true"`
	// JSON 对象字符串，放实体自身的查询条件
	QueryJson *string `json:"query_json,omitempty" xml:"query_json,omitempty" require:"true"`
	// 页码，默认 1
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty"`
	// 每页条数，默认 200，最大建议 1000
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s QueryAppmarketCommondataRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAppmarketCommondataRequest) GoString() string {
	return s.String()
}

func (s *QueryAppmarketCommondataRequest) SetAuthToken(v string) *QueryAppmarketCommondataRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAppmarketCommondataRequest) SetEntityCode(v string) *QueryAppmarketCommondataRequest {
	s.EntityCode = &v
	return s
}

func (s *QueryAppmarketCommondataRequest) SetSchemaVersion(v string) *QueryAppmarketCommondataRequest {
	s.SchemaVersion = &v
	return s
}

func (s *QueryAppmarketCommondataRequest) SetQueryJson(v string) *QueryAppmarketCommondataRequest {
	s.QueryJson = &v
	return s
}

func (s *QueryAppmarketCommondataRequest) SetPageNo(v int64) *QueryAppmarketCommondataRequest {
	s.PageNo = &v
	return s
}

func (s *QueryAppmarketCommondataRequest) SetPageSize(v int64) *QueryAppmarketCommondataRequest {
	s.PageSize = &v
	return s
}

type QueryAppmarketCommondataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实际返回的实体编码
	EntityCode *string `json:"entity_code,omitempty" xml:"entity_code,omitempty"`
	// 实际返回的结构版本
	SchemaVersion *string `json:"schema_version,omitempty" xml:"schema_version,omitempty"`
	// JSON 数组字符串；即使无数据也返回 []，不要配置成 ARRAY / OBJECT
	DataJson *string `json:"data_json,omitempty" xml:"data_json,omitempty"`
	// JSON 对象字符串，放数据范围、口径、溯源等元信息
	MetaJson *string `json:"meta_json,omitempty" xml:"meta_json,omitempty"`
	// 满足条件的总记录数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 实际页码
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty"`
	// 实际每页条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s QueryAppmarketCommondataResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAppmarketCommondataResponse) GoString() string {
	return s.String()
}

func (s *QueryAppmarketCommondataResponse) SetReqMsgId(v string) *QueryAppmarketCommondataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAppmarketCommondataResponse) SetResultCode(v string) *QueryAppmarketCommondataResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAppmarketCommondataResponse) SetResultMsg(v string) *QueryAppmarketCommondataResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAppmarketCommondataResponse) SetEntityCode(v string) *QueryAppmarketCommondataResponse {
	s.EntityCode = &v
	return s
}

func (s *QueryAppmarketCommondataResponse) SetSchemaVersion(v string) *QueryAppmarketCommondataResponse {
	s.SchemaVersion = &v
	return s
}

func (s *QueryAppmarketCommondataResponse) SetDataJson(v string) *QueryAppmarketCommondataResponse {
	s.DataJson = &v
	return s
}

func (s *QueryAppmarketCommondataResponse) SetMetaJson(v string) *QueryAppmarketCommondataResponse {
	s.MetaJson = &v
	return s
}

func (s *QueryAppmarketCommondataResponse) SetTotalCount(v int64) *QueryAppmarketCommondataResponse {
	s.TotalCount = &v
	return s
}

func (s *QueryAppmarketCommondataResponse) SetPageNo(v int64) *QueryAppmarketCommondataResponse {
	s.PageNo = &v
	return s
}

func (s *QueryAppmarketCommondataResponse) SetPageSize(v int64) *QueryAppmarketCommondataResponse {
	s.PageSize = &v
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

// Description:
//
// # Init client with Config
//
// @param config - config contains the necessary information to create a client
func NewClient(config *Config) (*Client, error) {
	client := new(Client)
	err := client.Init(config)
	return client, err
}

func (client *Client) Init(config *Config) (_err error) {
	if tea.BoolValue(util.IsUnset(config)) {
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

// Description:
//
// # Encapsulate the request and invoke the network
//
// @param action - api name
//
// @param protocol - http or https
//
// @param method - e.g. GET
//
// @param pathname - pathname of every api
//
// @param request - which contains request params
//
// @param runtime - which controls some details of call api, such as retry times
//
// @return the response
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
				"sdk_version":      tea.String("1.2.0"),
				"_prod_code":       tea.String("ENERGYTOOL"),
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

// Description:
//
// Description: 电力交易实时电价预测服务
//
// Summary: 电力交易实时电价预测服务
func (client *Client) QueryRealtimePriceforecast(request *QueryRealtimePriceforecastRequest) (_result *QueryRealtimePriceforecastResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRealtimePriceforecastResponse{}
	_body, _err := client.QueryRealtimePriceforecastEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 电力交易实时电价预测服务
//
// Summary: 电力交易实时电价预测服务
func (client *Client) QueryRealtimePriceforecastEx(request *QueryRealtimePriceforecastRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRealtimePriceforecastResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRealtimePriceforecastResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.energytool.realtime.priceforecast.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 电力交易竞价空间分析
//
// Summary: 电力交易竞价空间分析
func (client *Client) QueryBiddingspace(request *QueryBiddingspaceRequest) (_result *QueryBiddingspaceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBiddingspaceResponse{}
	_body, _err := client.QueryBiddingspaceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 电力交易竞价空间分析
//
// Summary: 电力交易竞价空间分析
func (client *Client) QueryBiddingspaceEx(request *QueryBiddingspaceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBiddingspaceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBiddingspaceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.energytool.biddingspace.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 电力交易相似日竞价空间分析
//
// Summary: 电力交易相似日竞价空间分析
func (client *Client) QuerySimilarday(request *QuerySimilardayRequest) (_result *QuerySimilardayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySimilardayResponse{}
	_body, _err := client.QuerySimilardayEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 电力交易相似日竞价空间分析
//
// Summary: 电力交易相似日竞价空间分析
func (client *Client) QuerySimilardayEx(request *QuerySimilardayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySimilardayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySimilardayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.energytool.similarday.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 电力交易日前实时电价对比分析
//
// Summary: 电力交易日前实时电价对比分析
func (client *Client) QueryAheadrealtimePricecompare(request *QueryAheadrealtimePricecompareRequest) (_result *QueryAheadrealtimePricecompareResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAheadrealtimePricecompareResponse{}
	_body, _err := client.QueryAheadrealtimePricecompareEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 电力交易日前实时电价对比分析
//
// Summary: 电力交易日前实时电价对比分析
func (client *Client) QueryAheadrealtimePricecompareEx(request *QueryAheadrealtimePricecompareRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAheadrealtimePricecompareResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAheadrealtimePricecompareResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.energytool.aheadrealtime.pricecompare.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 电力交易日前与实时价差预测
//
// Summary: 电力交易日前与实时价差预测
func (client *Client) QueryAheadrealtimePricediffprediction(request *QueryAheadrealtimePricediffpredictionRequest) (_result *QueryAheadrealtimePricediffpredictionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAheadrealtimePricediffpredictionResponse{}
	_body, _err := client.QueryAheadrealtimePricediffpredictionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 电力交易日前与实时价差预测
//
// Summary: 电力交易日前与实时价差预测
func (client *Client) QueryAheadrealtimePricediffpredictionEx(request *QueryAheadrealtimePricediffpredictionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAheadrealtimePricediffpredictionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAheadrealtimePricediffpredictionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.energytool.aheadrealtime.pricediffprediction.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 气象预警信息查询
//
// Summary: 气象预警信息查询
func (client *Client) QueryWeatherWarning(request *QueryWeatherWarningRequest) (_result *QueryWeatherWarningResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryWeatherWarningResponse{}
	_body, _err := client.QueryWeatherWarningEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 气象预警信息查询
//
// Summary: 气象预警信息查询
func (client *Client) QueryWeatherWarningEx(request *QueryWeatherWarningRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryWeatherWarningResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryWeatherWarningResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.energytool.weather.warning.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 知识版本查询
//
// Summary: 知识版本查询
func (client *Client) QueryKmVersion(request *QueryKmVersionRequest) (_result *QueryKmVersionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryKmVersionResponse{}
	_body, _err := client.QueryKmVersionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 知识版本查询
//
// Summary: 知识版本查询
func (client *Client) QueryKmVersionEx(request *QueryKmVersionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryKmVersionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryKmVersionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.energytool.km.version.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 同步版本内容详情
//
// Summary: 同步版本内容详情
func (client *Client) SyncKmVersion(request *SyncKmVersionRequest) (_result *SyncKmVersionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncKmVersionResponse{}
	_body, _err := client.SyncKmVersionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 同步版本内容详情
//
// Summary: 同步版本内容详情
func (client *Client) SyncKmVersionEx(request *SyncKmVersionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncKmVersionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncKmVersionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.energytool.km.version.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 获取文档详情
//
// Summary: 获取文档详情
func (client *Client) SyncKmDocument(request *SyncKmDocumentRequest) (_result *SyncKmDocumentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncKmDocumentResponse{}
	_body, _err := client.SyncKmDocumentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 获取文档详情
//
// Summary: 获取文档详情
func (client *Client) SyncKmDocumentEx(request *SyncKmDocumentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncKmDocumentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncKmDocumentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.energytool.km.document.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 知识图谱对外开放rag检索
//
// Summary: 知识图谱对外开放rag检索
func (client *Client) QueryKmRag(request *QueryKmRagRequest) (_result *QueryKmRagResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryKmRagResponse{}
	_body, _err := client.QueryKmRagEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 知识图谱对外开放rag检索
//
// Summary: 知识图谱对外开放rag检索
func (client *Client) QueryKmRagEx(request *QueryKmRagRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryKmRagResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryKmRagResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.energytool.km.rag.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 天气中短期预测服务，支持15天以内的天气数据查询
//
// Summary: 天气中短期预测服务，支持15天以内的天气数据查询
func (client *Client) QueryWeatherForecast(request *QueryWeatherForecastRequest) (_result *QueryWeatherForecastResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryWeatherForecastResponse{}
	_body, _err := client.QueryWeatherForecastEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 天气中短期预测服务，支持15天以内的天气数据查询
//
// Summary: 天气中短期预测服务，支持15天以内的天气数据查询
func (client *Client) QueryWeatherForecastEx(request *QueryWeatherForecastRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryWeatherForecastResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryWeatherForecastResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.energytool.weather.forecast.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 天气中长期预测服务，支持未来第 16～45 天的天气数据查询
//
// Summary: 天气中长期预测服务，支持未来第 16～45 天的天气数据查询
func (client *Client) QueryWeatherLongrange(request *QueryWeatherLongrangeRequest) (_result *QueryWeatherLongrangeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryWeatherLongrangeResponse{}
	_body, _err := client.QueryWeatherLongrangeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 天气中长期预测服务，支持未来第 16～45 天的天气数据查询
//
// Summary: 天气中长期预测服务，支持未来第 16～45 天的天气数据查询
func (client *Client) QueryWeatherLongrangeEx(request *QueryWeatherLongrangeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryWeatherLongrangeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryWeatherLongrangeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.energytool.weather.longrange.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 能源数采对外开放api
//
// Summary: 能源数采对外开放api
func (client *Client) QueryPanoraindexPolicy(request *QueryPanoraindexPolicyRequest) (_result *QueryPanoraindexPolicyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryPanoraindexPolicyResponse{}
	_body, _err := client.QueryPanoraindexPolicyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 能源数采对外开放api
//
// Summary: 能源数采对外开放api
func (client *Client) QueryPanoraindexPolicyEx(request *QueryPanoraindexPolicyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryPanoraindexPolicyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryPanoraindexPolicyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.energytool.panoraindex.policy.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 虚拟交易团队接入appaccesscenter
//
// Summary: 虚拟交易团队接入appaccesscenter
func (client *Client) QueryTraderesult(request *QueryTraderesultRequest) (_result *QueryTraderesultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTraderesultResponse{}
	_body, _err := client.QueryTraderesultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 虚拟交易团队接入appaccesscenter
//
// Summary: 虚拟交易团队接入appaccesscenter
func (client *Client) QueryTraderesultEx(request *QueryTraderesultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTraderesultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTraderesultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.energytool.traderesult.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 电力行情主数据接口
//
// Summary: 电力行情主数据接口
func (client *Client) QueryElectricMarketprice(request *QueryElectricMarketpriceRequest) (_result *QueryElectricMarketpriceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryElectricMarketpriceResponse{}
	_body, _err := client.QueryElectricMarketpriceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 电力行情主数据接口
//
// Summary: 电力行情主数据接口
func (client *Client) QueryElectricMarketpriceEx(request *QueryElectricMarketpriceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryElectricMarketpriceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryElectricMarketpriceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.energytool.electric.marketprice.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 电力行情主数据查询接口
//
// Summary: 电力行情主数据查询接口
func (client *Client) QueryElectricCommondata(request *QueryElectricCommondataRequest) (_result *QueryElectricCommondataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryElectricCommondataResponse{}
	_body, _err := client.QueryElectricCommondataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 电力行情主数据查询接口
//
// Summary: 电力行情主数据查询接口
func (client *Client) QueryElectricCommondataEx(request *QueryElectricCommondataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryElectricCommondataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryElectricCommondataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.energytool.electric.commondata.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 电力行情主数据通用开放接口
//
// Summary: 电力行情主数据通用开放接口
func (client *Client) QueryAppmarketCommondata(request *QueryAppmarketCommondataRequest) (_result *QueryAppmarketCommondataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAppmarketCommondataResponse{}
	_body, _err := client.QueryAppmarketCommondataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 电力行情主数据通用开放接口
//
// Summary: 电力行情主数据通用开放接口
func (client *Client) QueryAppmarketCommondataEx(request *QueryAppmarketCommondataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAppmarketCommondataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAppmarketCommondataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.energytool.appmarket.commondata.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
