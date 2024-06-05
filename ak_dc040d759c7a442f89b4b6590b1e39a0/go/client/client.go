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

// ekyt响应头
type ResponseHead struct {
	// 请求唯一标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
}

func (s ResponseHead) String() string {
	return tea.Prettify(s)
}

func (s ResponseHead) GoString() string {
	return s.String()
}

func (s *ResponseHead) SetRequestId(v string) *ResponseHead {
	s.RequestId = &v
	return s
}

// eKYT请求头
type RequestHead struct {
	// 请求唯一标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 客户身份标识ID
	SecretId *string `json:"secret_id,omitempty" xml:"secret_id,omitempty" require:"true"`
	// 客户签约产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// response输出类型，默认json
	FormatType *string `json:"format_type,omitempty" xml:"format_type,omitempty"`
	// false
	OnlineFlag *bool `json:"online_flag,omitempty" xml:"online_flag,omitempty"`
}

func (s RequestHead) String() string {
	return tea.Prettify(s)
}

func (s RequestHead) GoString() string {
	return s.String()
}

func (s *RequestHead) SetRequestId(v string) *RequestHead {
	s.RequestId = &v
	return s
}

func (s *RequestHead) SetSecretId(v string) *RequestHead {
	s.SecretId = &v
	return s
}

func (s *RequestHead) SetProductCode(v string) *RequestHead {
	s.ProductCode = &v
	return s
}

func (s *RequestHead) SetFormatType(v string) *RequestHead {
	s.FormatType = &v
	return s
}

func (s *RequestHead) SetOnlineFlag(v bool) *RequestHead {
	s.OnlineFlag = &v
	return s
}

// 数据上链成功结果数据
type DeviceCollectResult struct {
	// 上链数据采集ID
	CollectId *string `json:"collect_id,omitempty" xml:"collect_id,omitempty" require:"true"`
	// 上链id
	AntchainId *string `json:"antchain_id,omitempty" xml:"antchain_id,omitempty"`
}

func (s DeviceCollectResult) String() string {
	return tea.Prettify(s)
}

func (s DeviceCollectResult) GoString() string {
	return s.String()
}

func (s *DeviceCollectResult) SetCollectId(v string) *DeviceCollectResult {
	s.CollectId = &v
	return s
}

func (s *DeviceCollectResult) SetAntchainId(v string) *DeviceCollectResult {
	s.AntchainId = &v
	return s
}

// eKYT业务响应结果
type IifaaEkytResponse struct {
	// 响应头
	Head *ResponseHead `json:"head,omitempty" xml:"head,omitempty" require:"true"`
	// 业务响应结果
	BizRes *string `json:"biz_res,omitempty" xml:"biz_res,omitempty" require:"true"`
}

func (s IifaaEkytResponse) String() string {
	return tea.Prettify(s)
}

func (s IifaaEkytResponse) GoString() string {
	return s.String()
}

func (s *IifaaEkytResponse) SetHead(v *ResponseHead) *IifaaEkytResponse {
	s.Head = v
	return s
}

func (s *IifaaEkytResponse) SetBizRes(v string) *IifaaEkytResponse {
	s.BizRes = &v
	return s
}

// 上链数据结果集
type ChainModelResult struct {
	// 所属业务
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
	// 资产类型
	DataScene *string `json:"data_scene,omitempty" xml:"data_scene,omitempty" require:"true"`
	// 资产id
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 资产数据内容json
	AssetData *string `json:"asset_data,omitempty" xml:"asset_data,omitempty" require:"true"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 上链时间
	TxTime *string `json:"tx_time,omitempty" xml:"tx_time,omitempty" require:"true"`
	// 业务ID
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty" require:"true"`
	// 上链id
	AntchainId *string `json:"antchain_id,omitempty" xml:"antchain_id,omitempty" require:"true"`
}

func (s ChainModelResult) String() string {
	return tea.Prettify(s)
}

func (s ChainModelResult) GoString() string {
	return s.String()
}

func (s *ChainModelResult) SetBizScene(v string) *ChainModelResult {
	s.BizScene = &v
	return s
}

func (s *ChainModelResult) SetDataScene(v string) *ChainModelResult {
	s.DataScene = &v
	return s
}

func (s *ChainModelResult) SetAssetId(v string) *ChainModelResult {
	s.AssetId = &v
	return s
}

func (s *ChainModelResult) SetAssetData(v string) *ChainModelResult {
	s.AssetData = &v
	return s
}

func (s *ChainModelResult) SetTenantId(v string) *ChainModelResult {
	s.TenantId = &v
	return s
}

func (s *ChainModelResult) SetTxTime(v string) *ChainModelResult {
	s.TxTime = &v
	return s
}

func (s *ChainModelResult) SetBusinessId(v string) *ChainModelResult {
	s.BusinessId = &v
	return s
}

func (s *ChainModelResult) SetAntchainId(v string) *ChainModelResult {
	s.AntchainId = &v
	return s
}

// 数据上链失败结果
type DeviceCollectFail struct {
	// 上链数据采集ID
	CollectId *string `json:"collect_id,omitempty" xml:"collect_id,omitempty" require:"true"`
	// 错误码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 错误信息
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
}

func (s DeviceCollectFail) String() string {
	return tea.Prettify(s)
}

func (s DeviceCollectFail) GoString() string {
	return s.String()
}

func (s *DeviceCollectFail) SetCollectId(v string) *DeviceCollectFail {
	s.CollectId = &v
	return s
}

func (s *DeviceCollectFail) SetCode(v string) *DeviceCollectFail {
	s.Code = &v
	return s
}

func (s *DeviceCollectFail) SetMessage(v string) *DeviceCollectFail {
	s.Message = &v
	return s
}

// 上链数据
type CollectInfo struct {
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 数据资产类型
	DataScene *string `json:"data_scene,omitempty" xml:"data_scene,omitempty" require:"true"`
	// 资产数据内容，业务要上链的数据JSON格式
	AssetData *string `json:"asset_data,omitempty" xml:"asset_data,omitempty" require:"true"`
	// 上链数据采集id
	CollectId *string `json:"collect_id,omitempty" xml:"collect_id,omitempty" require:"true"`
}

func (s CollectInfo) String() string {
	return tea.Prettify(s)
}

func (s CollectInfo) GoString() string {
	return s.String()
}

func (s *CollectInfo) SetAssetId(v string) *CollectInfo {
	s.AssetId = &v
	return s
}

func (s *CollectInfo) SetDataScene(v string) *CollectInfo {
	s.DataScene = &v
	return s
}

func (s *CollectInfo) SetAssetData(v string) *CollectInfo {
	s.AssetData = &v
	return s
}

func (s *CollectInfo) SetCollectId(v string) *CollectInfo {
	s.CollectId = &v
	return s
}

type OperateBlockchainBotIotbasicDevicecollectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 数据资产类型
	DataScene *string `json:"data_scene,omitempty" xml:"data_scene,omitempty" require:"true"`
	// 所属业务
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
	// 资产数据内容，业务要上链的数据JSON格式
	AssetData *string `json:"asset_data,omitempty" xml:"asset_data,omitempty" require:"true"`
}

func (s OperateBlockchainBotIotbasicDevicecollectRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateBlockchainBotIotbasicDevicecollectRequest) GoString() string {
	return s.String()
}

func (s *OperateBlockchainBotIotbasicDevicecollectRequest) SetAuthToken(v string) *OperateBlockchainBotIotbasicDevicecollectRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateBlockchainBotIotbasicDevicecollectRequest) SetProductInstanceId(v string) *OperateBlockchainBotIotbasicDevicecollectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateBlockchainBotIotbasicDevicecollectRequest) SetTenantId(v string) *OperateBlockchainBotIotbasicDevicecollectRequest {
	s.TenantId = &v
	return s
}

func (s *OperateBlockchainBotIotbasicDevicecollectRequest) SetAssetId(v string) *OperateBlockchainBotIotbasicDevicecollectRequest {
	s.AssetId = &v
	return s
}

func (s *OperateBlockchainBotIotbasicDevicecollectRequest) SetDataScene(v string) *OperateBlockchainBotIotbasicDevicecollectRequest {
	s.DataScene = &v
	return s
}

func (s *OperateBlockchainBotIotbasicDevicecollectRequest) SetBizScene(v string) *OperateBlockchainBotIotbasicDevicecollectRequest {
	s.BizScene = &v
	return s
}

func (s *OperateBlockchainBotIotbasicDevicecollectRequest) SetAssetData(v string) *OperateBlockchainBotIotbasicDevicecollectRequest {
	s.AssetData = &v
	return s
}

type OperateBlockchainBotIotbasicDevicecollectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 上链id
	AntchainId *string `json:"antchain_id,omitempty" xml:"antchain_id,omitempty"`
}

func (s OperateBlockchainBotIotbasicDevicecollectResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateBlockchainBotIotbasicDevicecollectResponse) GoString() string {
	return s.String()
}

func (s *OperateBlockchainBotIotbasicDevicecollectResponse) SetReqMsgId(v string) *OperateBlockchainBotIotbasicDevicecollectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateBlockchainBotIotbasicDevicecollectResponse) SetResultCode(v string) *OperateBlockchainBotIotbasicDevicecollectResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateBlockchainBotIotbasicDevicecollectResponse) SetResultMsg(v string) *OperateBlockchainBotIotbasicDevicecollectResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateBlockchainBotIotbasicDevicecollectResponse) SetSuccess(v bool) *OperateBlockchainBotIotbasicDevicecollectResponse {
	s.Success = &v
	return s
}

func (s *OperateBlockchainBotIotbasicDevicecollectResponse) SetAntchainId(v string) *OperateBlockchainBotIotbasicDevicecollectResponse {
	s.AntchainId = &v
	return s
}

type OperateBlockchainBotIotbasicBatchcollectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 所属业务
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 上链数据列表
	CollectInfoList []*CollectInfo `json:"collect_info_list,omitempty" xml:"collect_info_list,omitempty" require:"true" type:"Repeated"`
}

func (s OperateBlockchainBotIotbasicBatchcollectRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateBlockchainBotIotbasicBatchcollectRequest) GoString() string {
	return s.String()
}

func (s *OperateBlockchainBotIotbasicBatchcollectRequest) SetAuthToken(v string) *OperateBlockchainBotIotbasicBatchcollectRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateBlockchainBotIotbasicBatchcollectRequest) SetProductInstanceId(v string) *OperateBlockchainBotIotbasicBatchcollectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateBlockchainBotIotbasicBatchcollectRequest) SetBizScene(v string) *OperateBlockchainBotIotbasicBatchcollectRequest {
	s.BizScene = &v
	return s
}

func (s *OperateBlockchainBotIotbasicBatchcollectRequest) SetTenantId(v string) *OperateBlockchainBotIotbasicBatchcollectRequest {
	s.TenantId = &v
	return s
}

func (s *OperateBlockchainBotIotbasicBatchcollectRequest) SetCollectInfoList(v []*CollectInfo) *OperateBlockchainBotIotbasicBatchcollectRequest {
	s.CollectInfoList = v
	return s
}

type OperateBlockchainBotIotbasicBatchcollectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 上链成功列表
	SuccessList []*DeviceCollectResult `json:"success_list,omitempty" xml:"success_list,omitempty" type:"Repeated"`
	// 上链失败列表
	FailList []*DeviceCollectFail `json:"fail_list,omitempty" xml:"fail_list,omitempty" type:"Repeated"`
}

func (s OperateBlockchainBotIotbasicBatchcollectResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateBlockchainBotIotbasicBatchcollectResponse) GoString() string {
	return s.String()
}

func (s *OperateBlockchainBotIotbasicBatchcollectResponse) SetReqMsgId(v string) *OperateBlockchainBotIotbasicBatchcollectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateBlockchainBotIotbasicBatchcollectResponse) SetResultCode(v string) *OperateBlockchainBotIotbasicBatchcollectResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateBlockchainBotIotbasicBatchcollectResponse) SetResultMsg(v string) *OperateBlockchainBotIotbasicBatchcollectResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateBlockchainBotIotbasicBatchcollectResponse) SetSuccess(v bool) *OperateBlockchainBotIotbasicBatchcollectResponse {
	s.Success = &v
	return s
}

func (s *OperateBlockchainBotIotbasicBatchcollectResponse) SetSuccessList(v []*DeviceCollectResult) *OperateBlockchainBotIotbasicBatchcollectResponse {
	s.SuccessList = v
	return s
}

func (s *OperateBlockchainBotIotbasicBatchcollectResponse) SetFailList(v []*DeviceCollectFail) *OperateBlockchainBotIotbasicBatchcollectResponse {
	s.FailList = v
	return s
}

type QueryBlockchainBotIotbasicDevicecollectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 资产类型
	DataScene *string `json:"data_scene,omitempty" xml:"data_scene,omitempty" require:"true"`
	// 所属业务
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 上链hash
	AntchainId *string `json:"antchain_id,omitempty" xml:"antchain_id,omitempty"`
	// 上链数据内容 json
	AssetData *string `json:"asset_data,omitempty" xml:"asset_data,omitempty"`
	// 每页数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true" maximum:"100" minimum:"1"`
	// 当前页码
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true"`
	// 业务id
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
	// 查询开始时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty"`
}

func (s QueryBlockchainBotIotbasicDevicecollectRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainBotIotbasicDevicecollectRequest) GoString() string {
	return s.String()
}

func (s *QueryBlockchainBotIotbasicDevicecollectRequest) SetAuthToken(v string) *QueryBlockchainBotIotbasicDevicecollectRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBlockchainBotIotbasicDevicecollectRequest) SetProductInstanceId(v string) *QueryBlockchainBotIotbasicDevicecollectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBlockchainBotIotbasicDevicecollectRequest) SetEndTime(v string) *QueryBlockchainBotIotbasicDevicecollectRequest {
	s.EndTime = &v
	return s
}

func (s *QueryBlockchainBotIotbasicDevicecollectRequest) SetDataScene(v string) *QueryBlockchainBotIotbasicDevicecollectRequest {
	s.DataScene = &v
	return s
}

func (s *QueryBlockchainBotIotbasicDevicecollectRequest) SetBizScene(v string) *QueryBlockchainBotIotbasicDevicecollectRequest {
	s.BizScene = &v
	return s
}

func (s *QueryBlockchainBotIotbasicDevicecollectRequest) SetTenantId(v string) *QueryBlockchainBotIotbasicDevicecollectRequest {
	s.TenantId = &v
	return s
}

func (s *QueryBlockchainBotIotbasicDevicecollectRequest) SetAntchainId(v string) *QueryBlockchainBotIotbasicDevicecollectRequest {
	s.AntchainId = &v
	return s
}

func (s *QueryBlockchainBotIotbasicDevicecollectRequest) SetAssetData(v string) *QueryBlockchainBotIotbasicDevicecollectRequest {
	s.AssetData = &v
	return s
}

func (s *QueryBlockchainBotIotbasicDevicecollectRequest) SetPageSize(v int64) *QueryBlockchainBotIotbasicDevicecollectRequest {
	s.PageSize = &v
	return s
}

func (s *QueryBlockchainBotIotbasicDevicecollectRequest) SetCurrentPage(v int64) *QueryBlockchainBotIotbasicDevicecollectRequest {
	s.CurrentPage = &v
	return s
}

func (s *QueryBlockchainBotIotbasicDevicecollectRequest) SetBusinessId(v string) *QueryBlockchainBotIotbasicDevicecollectRequest {
	s.BusinessId = &v
	return s
}

func (s *QueryBlockchainBotIotbasicDevicecollectRequest) SetStartTime(v string) *QueryBlockchainBotIotbasicDevicecollectRequest {
	s.StartTime = &v
	return s
}

type QueryBlockchainBotIotbasicDevicecollectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前页码
	Current *int64 `json:"current,omitempty" xml:"current,omitempty"`
	// 每页数据大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 数据总条数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
	// 查询结果
	Data []*ChainModelResult `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryBlockchainBotIotbasicDevicecollectResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainBotIotbasicDevicecollectResponse) GoString() string {
	return s.String()
}

func (s *QueryBlockchainBotIotbasicDevicecollectResponse) SetReqMsgId(v string) *QueryBlockchainBotIotbasicDevicecollectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBlockchainBotIotbasicDevicecollectResponse) SetResultCode(v string) *QueryBlockchainBotIotbasicDevicecollectResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBlockchainBotIotbasicDevicecollectResponse) SetResultMsg(v string) *QueryBlockchainBotIotbasicDevicecollectResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBlockchainBotIotbasicDevicecollectResponse) SetCurrent(v int64) *QueryBlockchainBotIotbasicDevicecollectResponse {
	s.Current = &v
	return s
}

func (s *QueryBlockchainBotIotbasicDevicecollectResponse) SetPageSize(v int64) *QueryBlockchainBotIotbasicDevicecollectResponse {
	s.PageSize = &v
	return s
}

func (s *QueryBlockchainBotIotbasicDevicecollectResponse) SetTotal(v int64) *QueryBlockchainBotIotbasicDevicecollectResponse {
	s.Total = &v
	return s
}

func (s *QueryBlockchainBotIotbasicDevicecollectResponse) SetTotalPage(v int64) *QueryBlockchainBotIotbasicDevicecollectResponse {
	s.TotalPage = &v
	return s
}

func (s *QueryBlockchainBotIotbasicDevicecollectResponse) SetData(v []*ChainModelResult) *QueryBlockchainBotIotbasicDevicecollectResponse {
	s.Data = v
	return s
}

type QueryAntsecuritytechGatewayEkytDriverRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 接口请求head
	Head *RequestHead `json:"head,omitempty" xml:"head,omitempty" require:"true"`
	// 请求业务参数，加密之后的密文信息
	Request *string `json:"request,omitempty" xml:"request,omitempty" require:"true"`
	// 请求数据签名值
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
}

func (s QueryAntsecuritytechGatewayEkytDriverRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntsecuritytechGatewayEkytDriverRequest) GoString() string {
	return s.String()
}

func (s *QueryAntsecuritytechGatewayEkytDriverRequest) SetAuthToken(v string) *QueryAntsecuritytechGatewayEkytDriverRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntsecuritytechGatewayEkytDriverRequest) SetProductInstanceId(v string) *QueryAntsecuritytechGatewayEkytDriverRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntsecuritytechGatewayEkytDriverRequest) SetHead(v *RequestHead) *QueryAntsecuritytechGatewayEkytDriverRequest {
	s.Head = v
	return s
}

func (s *QueryAntsecuritytechGatewayEkytDriverRequest) SetRequest(v string) *QueryAntsecuritytechGatewayEkytDriverRequest {
	s.Request = &v
	return s
}

func (s *QueryAntsecuritytechGatewayEkytDriverRequest) SetSignature(v string) *QueryAntsecuritytechGatewayEkytDriverRequest {
	s.Signature = &v
	return s
}

type QueryAntsecuritytechGatewayEkytDriverResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 接口响应结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 接口响应描述
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 接口响应数据
	Data *IifaaEkytResponse `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryAntsecuritytechGatewayEkytDriverResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntsecuritytechGatewayEkytDriverResponse) GoString() string {
	return s.String()
}

func (s *QueryAntsecuritytechGatewayEkytDriverResponse) SetReqMsgId(v string) *QueryAntsecuritytechGatewayEkytDriverResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntsecuritytechGatewayEkytDriverResponse) SetResultCode(v string) *QueryAntsecuritytechGatewayEkytDriverResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntsecuritytechGatewayEkytDriverResponse) SetResultMsg(v string) *QueryAntsecuritytechGatewayEkytDriverResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntsecuritytechGatewayEkytDriverResponse) SetSuccess(v bool) *QueryAntsecuritytechGatewayEkytDriverResponse {
	s.Success = &v
	return s
}

func (s *QueryAntsecuritytechGatewayEkytDriverResponse) SetMessage(v string) *QueryAntsecuritytechGatewayEkytDriverResponse {
	s.Message = &v
	return s
}

func (s *QueryAntsecuritytechGatewayEkytDriverResponse) SetData(v *IifaaEkytResponse) *QueryAntsecuritytechGatewayEkytDriverResponse {
	s.Data = v
	return s
}

type ApplyAntsecuritytechGatewayIifaaDevicekeyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求头
	Head *RequestHead `json:"head,omitempty" xml:"head,omitempty" require:"true"`
	// 业务参数
	Request *string `json:"request,omitempty" xml:"request,omitempty" require:"true"`
	// 签名
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
}

func (s ApplyAntsecuritytechGatewayIifaaDevicekeyRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyAntsecuritytechGatewayIifaaDevicekeyRequest) GoString() string {
	return s.String()
}

func (s *ApplyAntsecuritytechGatewayIifaaDevicekeyRequest) SetAuthToken(v string) *ApplyAntsecuritytechGatewayIifaaDevicekeyRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyAntsecuritytechGatewayIifaaDevicekeyRequest) SetProductInstanceId(v string) *ApplyAntsecuritytechGatewayIifaaDevicekeyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyAntsecuritytechGatewayIifaaDevicekeyRequest) SetHead(v *RequestHead) *ApplyAntsecuritytechGatewayIifaaDevicekeyRequest {
	s.Head = v
	return s
}

func (s *ApplyAntsecuritytechGatewayIifaaDevicekeyRequest) SetRequest(v string) *ApplyAntsecuritytechGatewayIifaaDevicekeyRequest {
	s.Request = &v
	return s
}

func (s *ApplyAntsecuritytechGatewayIifaaDevicekeyRequest) SetSignature(v string) *ApplyAntsecuritytechGatewayIifaaDevicekeyRequest {
	s.Signature = &v
	return s
}

type ApplyAntsecuritytechGatewayIifaaDevicekeyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 响应结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 结果描述
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 业务响应结果
	Data *IifaaEkytResponse `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ApplyAntsecuritytechGatewayIifaaDevicekeyResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyAntsecuritytechGatewayIifaaDevicekeyResponse) GoString() string {
	return s.String()
}

func (s *ApplyAntsecuritytechGatewayIifaaDevicekeyResponse) SetReqMsgId(v string) *ApplyAntsecuritytechGatewayIifaaDevicekeyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyAntsecuritytechGatewayIifaaDevicekeyResponse) SetResultCode(v string) *ApplyAntsecuritytechGatewayIifaaDevicekeyResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyAntsecuritytechGatewayIifaaDevicekeyResponse) SetResultMsg(v string) *ApplyAntsecuritytechGatewayIifaaDevicekeyResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyAntsecuritytechGatewayIifaaDevicekeyResponse) SetSuccess(v bool) *ApplyAntsecuritytechGatewayIifaaDevicekeyResponse {
	s.Success = &v
	return s
}

func (s *ApplyAntsecuritytechGatewayIifaaDevicekeyResponse) SetMessage(v string) *ApplyAntsecuritytechGatewayIifaaDevicekeyResponse {
	s.Message = &v
	return s
}

func (s *ApplyAntsecuritytechGatewayIifaaDevicekeyResponse) SetData(v *IifaaEkytResponse) *ApplyAntsecuritytechGatewayIifaaDevicekeyResponse {
	s.Data = v
	return s
}

type CreateBlockchainBotDevicecorpThingmodelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 新增的功能定义详情
	ThingModelJson *string `json:"thing_model_json,omitempty" xml:"thing_model_json,omitempty" require:"true"`
	// 品类code
	CategoryCode *string `json:"category_code,omitempty" xml:"category_code,omitempty" require:"true"`
}

func (s CreateBlockchainBotDevicecorpThingmodelRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBlockchainBotDevicecorpThingmodelRequest) GoString() string {
	return s.String()
}

func (s *CreateBlockchainBotDevicecorpThingmodelRequest) SetAuthToken(v string) *CreateBlockchainBotDevicecorpThingmodelRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBlockchainBotDevicecorpThingmodelRequest) SetProductInstanceId(v string) *CreateBlockchainBotDevicecorpThingmodelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBlockchainBotDevicecorpThingmodelRequest) SetThingModelJson(v string) *CreateBlockchainBotDevicecorpThingmodelRequest {
	s.ThingModelJson = &v
	return s
}

func (s *CreateBlockchainBotDevicecorpThingmodelRequest) SetCategoryCode(v string) *CreateBlockchainBotDevicecorpThingmodelRequest {
	s.CategoryCode = &v
	return s
}

type CreateBlockchainBotDevicecorpThingmodelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s CreateBlockchainBotDevicecorpThingmodelResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBlockchainBotDevicecorpThingmodelResponse) GoString() string {
	return s.String()
}

func (s *CreateBlockchainBotDevicecorpThingmodelResponse) SetReqMsgId(v string) *CreateBlockchainBotDevicecorpThingmodelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBlockchainBotDevicecorpThingmodelResponse) SetResultCode(v string) *CreateBlockchainBotDevicecorpThingmodelResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBlockchainBotDevicecorpThingmodelResponse) SetResultMsg(v string) *CreateBlockchainBotDevicecorpThingmodelResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBlockchainBotDevicecorpThingmodelResponse) SetSuccess(v bool) *CreateBlockchainBotDevicecorpThingmodelResponse {
	s.Success = &v
	return s
}

type DeleteBlockchainBotDevicecorpThingmodelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 需要删除的属性标识符列表
	PropertyIdentifier []*string `json:"property_identifier,omitempty" xml:"property_identifier,omitempty" type:"Repeated"`
	// 需要删除的服务标识符列表
	ServiceIdentifier []*string `json:"service_identifier,omitempty" xml:"service_identifier,omitempty" type:"Repeated"`
	// 需要删除的事件标识符列表
	EventIdentifier []*string `json:"event_identifier,omitempty" xml:"event_identifier,omitempty" type:"Repeated"`
	// 品类code
	CategoryCode *string `json:"category_code,omitempty" xml:"category_code,omitempty" require:"true"`
}

func (s DeleteBlockchainBotDevicecorpThingmodelRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteBlockchainBotDevicecorpThingmodelRequest) GoString() string {
	return s.String()
}

func (s *DeleteBlockchainBotDevicecorpThingmodelRequest) SetAuthToken(v string) *DeleteBlockchainBotDevicecorpThingmodelRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteBlockchainBotDevicecorpThingmodelRequest) SetProductInstanceId(v string) *DeleteBlockchainBotDevicecorpThingmodelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteBlockchainBotDevicecorpThingmodelRequest) SetPropertyIdentifier(v []*string) *DeleteBlockchainBotDevicecorpThingmodelRequest {
	s.PropertyIdentifier = v
	return s
}

func (s *DeleteBlockchainBotDevicecorpThingmodelRequest) SetServiceIdentifier(v []*string) *DeleteBlockchainBotDevicecorpThingmodelRequest {
	s.ServiceIdentifier = v
	return s
}

func (s *DeleteBlockchainBotDevicecorpThingmodelRequest) SetEventIdentifier(v []*string) *DeleteBlockchainBotDevicecorpThingmodelRequest {
	s.EventIdentifier = v
	return s
}

func (s *DeleteBlockchainBotDevicecorpThingmodelRequest) SetCategoryCode(v string) *DeleteBlockchainBotDevicecorpThingmodelRequest {
	s.CategoryCode = &v
	return s
}

type DeleteBlockchainBotDevicecorpThingmodelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s DeleteBlockchainBotDevicecorpThingmodelResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteBlockchainBotDevicecorpThingmodelResponse) GoString() string {
	return s.String()
}

func (s *DeleteBlockchainBotDevicecorpThingmodelResponse) SetReqMsgId(v string) *DeleteBlockchainBotDevicecorpThingmodelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteBlockchainBotDevicecorpThingmodelResponse) SetResultCode(v string) *DeleteBlockchainBotDevicecorpThingmodelResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteBlockchainBotDevicecorpThingmodelResponse) SetResultMsg(v string) *DeleteBlockchainBotDevicecorpThingmodelResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteBlockchainBotDevicecorpThingmodelResponse) SetSuccess(v bool) *DeleteBlockchainBotDevicecorpThingmodelResponse {
	s.Success = &v
	return s
}

type PublishBlockchainBotDevicecorpThingmodelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 品类code
	CategoryCode *string `json:"category_code,omitempty" xml:"category_code,omitempty" require:"true"`
}

func (s PublishBlockchainBotDevicecorpThingmodelRequest) String() string {
	return tea.Prettify(s)
}

func (s PublishBlockchainBotDevicecorpThingmodelRequest) GoString() string {
	return s.String()
}

func (s *PublishBlockchainBotDevicecorpThingmodelRequest) SetAuthToken(v string) *PublishBlockchainBotDevicecorpThingmodelRequest {
	s.AuthToken = &v
	return s
}

func (s *PublishBlockchainBotDevicecorpThingmodelRequest) SetProductInstanceId(v string) *PublishBlockchainBotDevicecorpThingmodelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PublishBlockchainBotDevicecorpThingmodelRequest) SetCategoryCode(v string) *PublishBlockchainBotDevicecorpThingmodelRequest {
	s.CategoryCode = &v
	return s
}

type PublishBlockchainBotDevicecorpThingmodelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s PublishBlockchainBotDevicecorpThingmodelResponse) String() string {
	return tea.Prettify(s)
}

func (s PublishBlockchainBotDevicecorpThingmodelResponse) GoString() string {
	return s.String()
}

func (s *PublishBlockchainBotDevicecorpThingmodelResponse) SetReqMsgId(v string) *PublishBlockchainBotDevicecorpThingmodelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PublishBlockchainBotDevicecorpThingmodelResponse) SetResultCode(v string) *PublishBlockchainBotDevicecorpThingmodelResponse {
	s.ResultCode = &v
	return s
}

func (s *PublishBlockchainBotDevicecorpThingmodelResponse) SetResultMsg(v string) *PublishBlockchainBotDevicecorpThingmodelResponse {
	s.ResultMsg = &v
	return s
}

func (s *PublishBlockchainBotDevicecorpThingmodelResponse) SetSuccess(v bool) *PublishBlockchainBotDevicecorpThingmodelResponse {
	s.Success = &v
	return s
}

type SignBlockchainBotDigitalkeyWithholdRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 个人签约产品码
	PersonalProductCode *string `json:"personal_product_code,omitempty" xml:"personal_product_code,omitempty" require:"true"`
	// 销售产品码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 请按当前接入的方式进行填充，且输入值必须为文档中的参数取值范围。 扫码或者短信页面签约需要拼装http的请求地址访问中间页面，钱包h5页面签约可直接拼接scheme的请求地址
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
	// 支付宝App主动回跳商户App里指定的页面 http/https 路径。建议商户使用 https。
	ReturnUrl *string `json:"return_url,omitempty" xml:"return_url,omitempty" require:"true"`
	// 用户在商户网站的登录账号，用于在签约页面展示
	ExternalLogonId *string `json:"external_logon_id,omitempty" xml:"external_logon_id,omitempty" require:"true"`
	// 支付宝用户ID
	AlipayUserId *string `json:"alipay_user_id,omitempty" xml:"alipay_user_id,omitempty"`
	// 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）。 格式规则：支持大写小写字母和数字，最长32位。 商户系统按需自定义传入，如果同一用户在同一产品码、同一签约场景下，签订了多份代扣协议，那么需要指定并传入该值
	SignScene *string `json:"sign_scene,omitempty" xml:"sign_scene,omitempty" require:"true"`
	// 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）。 格式规则：支持大写小写字母和数字，最长32位。 商户系统按需自定义传入，如果同一用户在同一产品码、同一签约场景下，签订了多份代扣协议，那么需要指定并传入该值
	ExternalAgreementNo *string `json:"external_agreement_no,omitempty" xml:"external_agreement_no,omitempty" require:"true"`
	// 当前用户签约请求的协议有效周期。 整形数字加上时间单位的协议有效期，从发起签约请求的时间开始算起。 目前支持的时间单位： 1. d：天 2. m：月 如果未传入，默认为长期有效。
	SignValidityPeriod *string `json:"sign_validity_period,omitempty" xml:"sign_validity_period,omitempty"`
	// 签约有效时间限制，单位是秒，有效范围是0-86400，商户传入此字段会用商户传入的值否则使用支付宝侧默认值，在有效时间外进行签约，会进行安全拦截；（备注：此字段适用于需要开通安全防控的商户，且依赖商户传入生成签约时的时间戳字段timestamp）
	EffectTime *int64 `json:"effect_time,omitempty" xml:"effect_time,omitempty"`
}

func (s SignBlockchainBotDigitalkeyWithholdRequest) String() string {
	return tea.Prettify(s)
}

func (s SignBlockchainBotDigitalkeyWithholdRequest) GoString() string {
	return s.String()
}

func (s *SignBlockchainBotDigitalkeyWithholdRequest) SetAuthToken(v string) *SignBlockchainBotDigitalkeyWithholdRequest {
	s.AuthToken = &v
	return s
}

func (s *SignBlockchainBotDigitalkeyWithholdRequest) SetProductInstanceId(v string) *SignBlockchainBotDigitalkeyWithholdRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SignBlockchainBotDigitalkeyWithholdRequest) SetPersonalProductCode(v string) *SignBlockchainBotDigitalkeyWithholdRequest {
	s.PersonalProductCode = &v
	return s
}

func (s *SignBlockchainBotDigitalkeyWithholdRequest) SetProductCode(v string) *SignBlockchainBotDigitalkeyWithholdRequest {
	s.ProductCode = &v
	return s
}

func (s *SignBlockchainBotDigitalkeyWithholdRequest) SetChannel(v string) *SignBlockchainBotDigitalkeyWithholdRequest {
	s.Channel = &v
	return s
}

func (s *SignBlockchainBotDigitalkeyWithholdRequest) SetReturnUrl(v string) *SignBlockchainBotDigitalkeyWithholdRequest {
	s.ReturnUrl = &v
	return s
}

func (s *SignBlockchainBotDigitalkeyWithholdRequest) SetExternalLogonId(v string) *SignBlockchainBotDigitalkeyWithholdRequest {
	s.ExternalLogonId = &v
	return s
}

func (s *SignBlockchainBotDigitalkeyWithholdRequest) SetAlipayUserId(v string) *SignBlockchainBotDigitalkeyWithholdRequest {
	s.AlipayUserId = &v
	return s
}

func (s *SignBlockchainBotDigitalkeyWithholdRequest) SetSignScene(v string) *SignBlockchainBotDigitalkeyWithholdRequest {
	s.SignScene = &v
	return s
}

func (s *SignBlockchainBotDigitalkeyWithholdRequest) SetExternalAgreementNo(v string) *SignBlockchainBotDigitalkeyWithholdRequest {
	s.ExternalAgreementNo = &v
	return s
}

func (s *SignBlockchainBotDigitalkeyWithholdRequest) SetSignValidityPeriod(v string) *SignBlockchainBotDigitalkeyWithholdRequest {
	s.SignValidityPeriod = &v
	return s
}

func (s *SignBlockchainBotDigitalkeyWithholdRequest) SetEffectTime(v int64) *SignBlockchainBotDigitalkeyWithholdRequest {
	s.EffectTime = &v
	return s
}

type SignBlockchainBotDigitalkeyWithholdResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 明细返回码
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 明细返回码描述
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
	// 生成的签约链接地址
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s SignBlockchainBotDigitalkeyWithholdResponse) String() string {
	return tea.Prettify(s)
}

func (s SignBlockchainBotDigitalkeyWithholdResponse) GoString() string {
	return s.String()
}

func (s *SignBlockchainBotDigitalkeyWithholdResponse) SetReqMsgId(v string) *SignBlockchainBotDigitalkeyWithholdResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SignBlockchainBotDigitalkeyWithholdResponse) SetResultCode(v string) *SignBlockchainBotDigitalkeyWithholdResponse {
	s.ResultCode = &v
	return s
}

func (s *SignBlockchainBotDigitalkeyWithholdResponse) SetResultMsg(v string) *SignBlockchainBotDigitalkeyWithholdResponse {
	s.ResultMsg = &v
	return s
}

func (s *SignBlockchainBotDigitalkeyWithholdResponse) SetSubCode(v string) *SignBlockchainBotDigitalkeyWithholdResponse {
	s.SubCode = &v
	return s
}

func (s *SignBlockchainBotDigitalkeyWithholdResponse) SetSubMsg(v string) *SignBlockchainBotDigitalkeyWithholdResponse {
	s.SubMsg = &v
	return s
}

func (s *SignBlockchainBotDigitalkeyWithholdResponse) SetData(v string) *SignBlockchainBotDigitalkeyWithholdResponse {
	s.Data = &v
	return s
}

type UnbindBlockchainBotDigitalkeyWithholdRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户的支付宝账号对应的支付宝唯一用户号，以 2088 开头的 16 位纯数字组成。
	AlipayUserId *string `json:"alipay_user_id,omitempty" xml:"alipay_user_id,omitempty" require:"true"`
	// 协议产品码，商户和支付宝签约时确定，不同业务场景对应不同的签约产品码，解约时传入签约时的产品码，销售产品码，商户代扣场景固定为 GENERAL_WITHHOLDING_P。
	PersonalProductCode *string `json:"personal_product_code,omitempty" xml:"personal_product_code,omitempty" require:"true"`
	// 签约协议场景，商户和支付宝签约时确定，解约时，传入签约指定的场景信息。
	SignScene *string `json:"sign_scene,omitempty" xml:"sign_scene,omitempty" require:"true"`
	// 代扣协议中标示用户的唯一签约号(确保在商户系统中唯一)，传入签约时传入的签约号。
	ExternalAgreementNo *string `json:"external_agreement_no,omitempty" xml:"external_agreement_no,omitempty" require:"true"`
}

func (s UnbindBlockchainBotDigitalkeyWithholdRequest) String() string {
	return tea.Prettify(s)
}

func (s UnbindBlockchainBotDigitalkeyWithholdRequest) GoString() string {
	return s.String()
}

func (s *UnbindBlockchainBotDigitalkeyWithholdRequest) SetAuthToken(v string) *UnbindBlockchainBotDigitalkeyWithholdRequest {
	s.AuthToken = &v
	return s
}

func (s *UnbindBlockchainBotDigitalkeyWithholdRequest) SetProductInstanceId(v string) *UnbindBlockchainBotDigitalkeyWithholdRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UnbindBlockchainBotDigitalkeyWithholdRequest) SetAlipayUserId(v string) *UnbindBlockchainBotDigitalkeyWithholdRequest {
	s.AlipayUserId = &v
	return s
}

func (s *UnbindBlockchainBotDigitalkeyWithholdRequest) SetPersonalProductCode(v string) *UnbindBlockchainBotDigitalkeyWithholdRequest {
	s.PersonalProductCode = &v
	return s
}

func (s *UnbindBlockchainBotDigitalkeyWithholdRequest) SetSignScene(v string) *UnbindBlockchainBotDigitalkeyWithholdRequest {
	s.SignScene = &v
	return s
}

func (s *UnbindBlockchainBotDigitalkeyWithholdRequest) SetExternalAgreementNo(v string) *UnbindBlockchainBotDigitalkeyWithholdRequest {
	s.ExternalAgreementNo = &v
	return s
}

type UnbindBlockchainBotDigitalkeyWithholdResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 明细返回码
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 明细返回码描述
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
}

func (s UnbindBlockchainBotDigitalkeyWithholdResponse) String() string {
	return tea.Prettify(s)
}

func (s UnbindBlockchainBotDigitalkeyWithholdResponse) GoString() string {
	return s.String()
}

func (s *UnbindBlockchainBotDigitalkeyWithholdResponse) SetReqMsgId(v string) *UnbindBlockchainBotDigitalkeyWithholdResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UnbindBlockchainBotDigitalkeyWithholdResponse) SetResultCode(v string) *UnbindBlockchainBotDigitalkeyWithholdResponse {
	s.ResultCode = &v
	return s
}

func (s *UnbindBlockchainBotDigitalkeyWithholdResponse) SetResultMsg(v string) *UnbindBlockchainBotDigitalkeyWithholdResponse {
	s.ResultMsg = &v
	return s
}

func (s *UnbindBlockchainBotDigitalkeyWithholdResponse) SetSubCode(v string) *UnbindBlockchainBotDigitalkeyWithholdResponse {
	s.SubCode = &v
	return s
}

func (s *UnbindBlockchainBotDigitalkeyWithholdResponse) SetSubMsg(v string) *UnbindBlockchainBotDigitalkeyWithholdResponse {
	s.SubMsg = &v
	return s
}

type PayBlockchainBotDigitalkeyWithholdRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户订单号，需要保证不重复
	OutTradeNo *string `json:"out_trade_no,omitempty" xml:"out_trade_no,omitempty" require:"true"`
	// 订单标题
	Subject *string `json:"subject,omitempty" xml:"subject,omitempty" require:"true"`
	// 签约时支付宝返回的用户ID
	AlipayUserId *string `json:"alipay_user_id,omitempty" xml:"alipay_user_id,omitempty" require:"true"`
	// 销售产品码，商户代扣场景固定为GENERAL_WITHHOLDING
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	TotalAmount *int64 `json:"total_amount,omitempty" xml:"total_amount,omitempty" require:"true"`
	// 商户代扣扣款许可
	DeductPermission *string `json:"deduct_permission,omitempty" xml:"deduct_permission,omitempty"`
	// 代扣协议号, 对应于签约时，支付宝返回的协议
	AgreementNo *string `json:"agreement_no,omitempty" xml:"agreement_no,omitempty" require:"true"`
	// 该笔订单允许的最晚付款时间，逾期将关闭交易，超时关闭交易无法继续付款。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天 该参数数值不接受小数点， 如：1.5 h，可转换为 90m。
	TimeoutExpress *string `json:"timeout_express,omitempty" xml:"timeout_express,omitempty"`
	// 异步支付类型
	AsyncType *string `json:"async_type,omitempty" xml:"async_type,omitempty" require:"true"`
}

func (s PayBlockchainBotDigitalkeyWithholdRequest) String() string {
	return tea.Prettify(s)
}

func (s PayBlockchainBotDigitalkeyWithholdRequest) GoString() string {
	return s.String()
}

func (s *PayBlockchainBotDigitalkeyWithholdRequest) SetAuthToken(v string) *PayBlockchainBotDigitalkeyWithholdRequest {
	s.AuthToken = &v
	return s
}

func (s *PayBlockchainBotDigitalkeyWithholdRequest) SetProductInstanceId(v string) *PayBlockchainBotDigitalkeyWithholdRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PayBlockchainBotDigitalkeyWithholdRequest) SetOutTradeNo(v string) *PayBlockchainBotDigitalkeyWithholdRequest {
	s.OutTradeNo = &v
	return s
}

func (s *PayBlockchainBotDigitalkeyWithholdRequest) SetSubject(v string) *PayBlockchainBotDigitalkeyWithholdRequest {
	s.Subject = &v
	return s
}

func (s *PayBlockchainBotDigitalkeyWithholdRequest) SetAlipayUserId(v string) *PayBlockchainBotDigitalkeyWithholdRequest {
	s.AlipayUserId = &v
	return s
}

func (s *PayBlockchainBotDigitalkeyWithholdRequest) SetProductCode(v string) *PayBlockchainBotDigitalkeyWithholdRequest {
	s.ProductCode = &v
	return s
}

func (s *PayBlockchainBotDigitalkeyWithholdRequest) SetTotalAmount(v int64) *PayBlockchainBotDigitalkeyWithholdRequest {
	s.TotalAmount = &v
	return s
}

func (s *PayBlockchainBotDigitalkeyWithholdRequest) SetDeductPermission(v string) *PayBlockchainBotDigitalkeyWithholdRequest {
	s.DeductPermission = &v
	return s
}

func (s *PayBlockchainBotDigitalkeyWithholdRequest) SetAgreementNo(v string) *PayBlockchainBotDigitalkeyWithholdRequest {
	s.AgreementNo = &v
	return s
}

func (s *PayBlockchainBotDigitalkeyWithholdRequest) SetTimeoutExpress(v string) *PayBlockchainBotDigitalkeyWithholdRequest {
	s.TimeoutExpress = &v
	return s
}

func (s *PayBlockchainBotDigitalkeyWithholdRequest) SetAsyncType(v string) *PayBlockchainBotDigitalkeyWithholdRequest {
	s.AsyncType = &v
	return s
}

type PayBlockchainBotDigitalkeyWithholdResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 明细返回码描述
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
	// 明细返回码
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
}

func (s PayBlockchainBotDigitalkeyWithholdResponse) String() string {
	return tea.Prettify(s)
}

func (s PayBlockchainBotDigitalkeyWithholdResponse) GoString() string {
	return s.String()
}

func (s *PayBlockchainBotDigitalkeyWithholdResponse) SetReqMsgId(v string) *PayBlockchainBotDigitalkeyWithholdResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PayBlockchainBotDigitalkeyWithholdResponse) SetResultCode(v string) *PayBlockchainBotDigitalkeyWithholdResponse {
	s.ResultCode = &v
	return s
}

func (s *PayBlockchainBotDigitalkeyWithholdResponse) SetResultMsg(v string) *PayBlockchainBotDigitalkeyWithholdResponse {
	s.ResultMsg = &v
	return s
}

func (s *PayBlockchainBotDigitalkeyWithholdResponse) SetSubMsg(v string) *PayBlockchainBotDigitalkeyWithholdResponse {
	s.SubMsg = &v
	return s
}

func (s *PayBlockchainBotDigitalkeyWithholdResponse) SetSubCode(v string) *PayBlockchainBotDigitalkeyWithholdResponse {
	s.SubCode = &v
	return s
}

type RefuseBlockchainBotDigitalkeyWithholdRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单支付时传入的商户订单号,不能和 trade_no同时为空。
	OutTradeNo *string `json:"out_trade_no,omitempty" xml:"out_trade_no,omitempty" require:"true"`
	// 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
	RefundAmount *int64 `json:"refund_amount,omitempty" xml:"refund_amount,omitempty" require:"true"`
	// 标识一次退款请求，同一笔交易多次退款需要保证唯一。
	OutRequestNo *string `json:"out_request_no,omitempty" xml:"out_request_no,omitempty" require:"true"`
}

func (s RefuseBlockchainBotDigitalkeyWithholdRequest) String() string {
	return tea.Prettify(s)
}

func (s RefuseBlockchainBotDigitalkeyWithholdRequest) GoString() string {
	return s.String()
}

func (s *RefuseBlockchainBotDigitalkeyWithholdRequest) SetAuthToken(v string) *RefuseBlockchainBotDigitalkeyWithholdRequest {
	s.AuthToken = &v
	return s
}

func (s *RefuseBlockchainBotDigitalkeyWithholdRequest) SetProductInstanceId(v string) *RefuseBlockchainBotDigitalkeyWithholdRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RefuseBlockchainBotDigitalkeyWithholdRequest) SetOutTradeNo(v string) *RefuseBlockchainBotDigitalkeyWithholdRequest {
	s.OutTradeNo = &v
	return s
}

func (s *RefuseBlockchainBotDigitalkeyWithholdRequest) SetRefundAmount(v int64) *RefuseBlockchainBotDigitalkeyWithholdRequest {
	s.RefundAmount = &v
	return s
}

func (s *RefuseBlockchainBotDigitalkeyWithholdRequest) SetOutRequestNo(v string) *RefuseBlockchainBotDigitalkeyWithholdRequest {
	s.OutRequestNo = &v
	return s
}

type RefuseBlockchainBotDigitalkeyWithholdResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 明细返回码
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 明细返回码描述
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
	// 退款返回信息
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s RefuseBlockchainBotDigitalkeyWithholdResponse) String() string {
	return tea.Prettify(s)
}

func (s RefuseBlockchainBotDigitalkeyWithholdResponse) GoString() string {
	return s.String()
}

func (s *RefuseBlockchainBotDigitalkeyWithholdResponse) SetReqMsgId(v string) *RefuseBlockchainBotDigitalkeyWithholdResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RefuseBlockchainBotDigitalkeyWithholdResponse) SetResultCode(v string) *RefuseBlockchainBotDigitalkeyWithholdResponse {
	s.ResultCode = &v
	return s
}

func (s *RefuseBlockchainBotDigitalkeyWithholdResponse) SetResultMsg(v string) *RefuseBlockchainBotDigitalkeyWithholdResponse {
	s.ResultMsg = &v
	return s
}

func (s *RefuseBlockchainBotDigitalkeyWithholdResponse) SetSubCode(v string) *RefuseBlockchainBotDigitalkeyWithholdResponse {
	s.SubCode = &v
	return s
}

func (s *RefuseBlockchainBotDigitalkeyWithholdResponse) SetSubMsg(v string) *RefuseBlockchainBotDigitalkeyWithholdResponse {
	s.SubMsg = &v
	return s
}

func (s *RefuseBlockchainBotDigitalkeyWithholdResponse) SetData(v string) *RefuseBlockchainBotDigitalkeyWithholdResponse {
	s.Data = &v
	return s
}

type QueryBlockchainBotDigitalkeyWithholdRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户的支付宝账号对应的支付宝唯一用户号，以 2088 开头的 16 位纯数字组成。
	AlipayUserId *string `json:"alipay_user_id,omitempty" xml:"alipay_user_id,omitempty" require:"true"`
	// 协议产品码，商户和支付宝签约时确定，不同业务场景对应不同的签约产品码，解约时传入签约时的产品码，销售产品码，商户代扣场景固定为 GENERAL_WITHHOLDING_P。
	PersonalProductCode *string `json:"personal_product_code,omitempty" xml:"personal_product_code,omitempty" require:"true"`
	// 签约协议场景，商户和支付宝签约时确定，解约时，传入签约指定的场景信息。
	SignScene *string `json:"sign_scene,omitempty" xml:"sign_scene,omitempty" require:"true"`
	// 代扣协议中标示用户的唯一签约号(确保在商户系统中唯一)，传入签约时传入的签约号。
	ExternalAgreementNo *string `json:"external_agreement_no,omitempty" xml:"external_agreement_no,omitempty" require:"true"`
}

func (s QueryBlockchainBotDigitalkeyWithholdRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainBotDigitalkeyWithholdRequest) GoString() string {
	return s.String()
}

func (s *QueryBlockchainBotDigitalkeyWithholdRequest) SetAuthToken(v string) *QueryBlockchainBotDigitalkeyWithholdRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBlockchainBotDigitalkeyWithholdRequest) SetProductInstanceId(v string) *QueryBlockchainBotDigitalkeyWithholdRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBlockchainBotDigitalkeyWithholdRequest) SetAlipayUserId(v string) *QueryBlockchainBotDigitalkeyWithholdRequest {
	s.AlipayUserId = &v
	return s
}

func (s *QueryBlockchainBotDigitalkeyWithholdRequest) SetPersonalProductCode(v string) *QueryBlockchainBotDigitalkeyWithholdRequest {
	s.PersonalProductCode = &v
	return s
}

func (s *QueryBlockchainBotDigitalkeyWithholdRequest) SetSignScene(v string) *QueryBlockchainBotDigitalkeyWithholdRequest {
	s.SignScene = &v
	return s
}

func (s *QueryBlockchainBotDigitalkeyWithholdRequest) SetExternalAgreementNo(v string) *QueryBlockchainBotDigitalkeyWithholdRequest {
	s.ExternalAgreementNo = &v
	return s
}

type QueryBlockchainBotDigitalkeyWithholdResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 明细返回码
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 明细返回码描述
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
	// 协议查询返回信息
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryBlockchainBotDigitalkeyWithholdResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainBotDigitalkeyWithholdResponse) GoString() string {
	return s.String()
}

func (s *QueryBlockchainBotDigitalkeyWithholdResponse) SetReqMsgId(v string) *QueryBlockchainBotDigitalkeyWithholdResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBlockchainBotDigitalkeyWithholdResponse) SetResultCode(v string) *QueryBlockchainBotDigitalkeyWithholdResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBlockchainBotDigitalkeyWithholdResponse) SetResultMsg(v string) *QueryBlockchainBotDigitalkeyWithholdResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBlockchainBotDigitalkeyWithholdResponse) SetSubCode(v string) *QueryBlockchainBotDigitalkeyWithholdResponse {
	s.SubCode = &v
	return s
}

func (s *QueryBlockchainBotDigitalkeyWithholdResponse) SetSubMsg(v string) *QueryBlockchainBotDigitalkeyWithholdResponse {
	s.SubMsg = &v
	return s
}

func (s *QueryBlockchainBotDigitalkeyWithholdResponse) SetData(v string) *QueryBlockchainBotDigitalkeyWithholdResponse {
	s.Data = &v
	return s
}

type CancelBlockchainBotDigitalkeyWithholdRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户传入外部交易订单号
	OutTradeNo *string `json:"out_trade_no,omitempty" xml:"out_trade_no,omitempty" require:"true"`
}

func (s CancelBlockchainBotDigitalkeyWithholdRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelBlockchainBotDigitalkeyWithholdRequest) GoString() string {
	return s.String()
}

func (s *CancelBlockchainBotDigitalkeyWithholdRequest) SetAuthToken(v string) *CancelBlockchainBotDigitalkeyWithholdRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelBlockchainBotDigitalkeyWithholdRequest) SetProductInstanceId(v string) *CancelBlockchainBotDigitalkeyWithholdRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelBlockchainBotDigitalkeyWithholdRequest) SetOutTradeNo(v string) *CancelBlockchainBotDigitalkeyWithholdRequest {
	s.OutTradeNo = &v
	return s
}

type CancelBlockchainBotDigitalkeyWithholdResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 明细返回码
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 明细返回码描述
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
	// 撤销返回信息
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CancelBlockchainBotDigitalkeyWithholdResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelBlockchainBotDigitalkeyWithholdResponse) GoString() string {
	return s.String()
}

func (s *CancelBlockchainBotDigitalkeyWithholdResponse) SetReqMsgId(v string) *CancelBlockchainBotDigitalkeyWithholdResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelBlockchainBotDigitalkeyWithholdResponse) SetResultCode(v string) *CancelBlockchainBotDigitalkeyWithholdResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelBlockchainBotDigitalkeyWithholdResponse) SetResultMsg(v string) *CancelBlockchainBotDigitalkeyWithholdResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelBlockchainBotDigitalkeyWithholdResponse) SetSubCode(v string) *CancelBlockchainBotDigitalkeyWithholdResponse {
	s.SubCode = &v
	return s
}

func (s *CancelBlockchainBotDigitalkeyWithholdResponse) SetSubMsg(v string) *CancelBlockchainBotDigitalkeyWithholdResponse {
	s.SubMsg = &v
	return s
}

func (s *CancelBlockchainBotDigitalkeyWithholdResponse) SetData(v string) *CancelBlockchainBotDigitalkeyWithholdResponse {
	s.Data = &v
	return s
}

type NotifyBlockchainBotDigitalkeyWithholdRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户请求号。 由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复
	OutRequestNo *string `json:"out_request_no,omitempty" xml:"out_request_no,omitempty" require:"true"`
	// 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	TotalAmount *int64 `json:"total_amount,omitempty" xml:"total_amount,omitempty" require:"true"`
	// 代扣协议号, 对应于签约时，支付宝返回的协议
	AgreementNo *string `json:"agreement_no,omitempty" xml:"agreement_no,omitempty" require:"true"`
}

func (s NotifyBlockchainBotDigitalkeyWithholdRequest) String() string {
	return tea.Prettify(s)
}

func (s NotifyBlockchainBotDigitalkeyWithholdRequest) GoString() string {
	return s.String()
}

func (s *NotifyBlockchainBotDigitalkeyWithholdRequest) SetAuthToken(v string) *NotifyBlockchainBotDigitalkeyWithholdRequest {
	s.AuthToken = &v
	return s
}

func (s *NotifyBlockchainBotDigitalkeyWithholdRequest) SetProductInstanceId(v string) *NotifyBlockchainBotDigitalkeyWithholdRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *NotifyBlockchainBotDigitalkeyWithholdRequest) SetOutRequestNo(v string) *NotifyBlockchainBotDigitalkeyWithholdRequest {
	s.OutRequestNo = &v
	return s
}

func (s *NotifyBlockchainBotDigitalkeyWithholdRequest) SetTotalAmount(v int64) *NotifyBlockchainBotDigitalkeyWithholdRequest {
	s.TotalAmount = &v
	return s
}

func (s *NotifyBlockchainBotDigitalkeyWithholdRequest) SetAgreementNo(v string) *NotifyBlockchainBotDigitalkeyWithholdRequest {
	s.AgreementNo = &v
	return s
}

type NotifyBlockchainBotDigitalkeyWithholdResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 明细返回码
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 明细返回码描述
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
	// 预通知返回内容
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s NotifyBlockchainBotDigitalkeyWithholdResponse) String() string {
	return tea.Prettify(s)
}

func (s NotifyBlockchainBotDigitalkeyWithholdResponse) GoString() string {
	return s.String()
}

func (s *NotifyBlockchainBotDigitalkeyWithholdResponse) SetReqMsgId(v string) *NotifyBlockchainBotDigitalkeyWithholdResponse {
	s.ReqMsgId = &v
	return s
}

func (s *NotifyBlockchainBotDigitalkeyWithholdResponse) SetResultCode(v string) *NotifyBlockchainBotDigitalkeyWithholdResponse {
	s.ResultCode = &v
	return s
}

func (s *NotifyBlockchainBotDigitalkeyWithholdResponse) SetResultMsg(v string) *NotifyBlockchainBotDigitalkeyWithholdResponse {
	s.ResultMsg = &v
	return s
}

func (s *NotifyBlockchainBotDigitalkeyWithholdResponse) SetSubCode(v string) *NotifyBlockchainBotDigitalkeyWithholdResponse {
	s.SubCode = &v
	return s
}

func (s *NotifyBlockchainBotDigitalkeyWithholdResponse) SetSubMsg(v string) *NotifyBlockchainBotDigitalkeyWithholdResponse {
	s.SubMsg = &v
	return s
}

func (s *NotifyBlockchainBotDigitalkeyWithholdResponse) SetData(v string) *NotifyBlockchainBotDigitalkeyWithholdResponse {
	s.Data = &v
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
				"_prod_code":       tea.String("ak_dc040d759c7a442f89b4b6590b1e39a0"),
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
 * Description: IoT设备平台-设备上链
 * Summary: IoT设备平台-设备上链
 */
func (client *Client) OperateBlockchainBotIotbasicDevicecollect(request *OperateBlockchainBotIotbasicDevicecollectRequest) (_result *OperateBlockchainBotIotbasicDevicecollectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateBlockchainBotIotbasicDevicecollectResponse{}
	_body, _err := client.OperateBlockchainBotIotbasicDevicecollectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: IoT设备平台-设备上链
 * Summary: IoT设备平台-设备上链
 */
func (client *Client) OperateBlockchainBotIotbasicDevicecollectEx(request *OperateBlockchainBotIotbasicDevicecollectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateBlockchainBotIotbasicDevicecollectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateBlockchainBotIotbasicDevicecollectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.devicecollect.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: IoT设备平台-批量数据上链
 * Summary: IoT设备平台-批量数据上链
 */
func (client *Client) OperateBlockchainBotIotbasicBatchcollect(request *OperateBlockchainBotIotbasicBatchcollectRequest) (_result *OperateBlockchainBotIotbasicBatchcollectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateBlockchainBotIotbasicBatchcollectResponse{}
	_body, _err := client.OperateBlockchainBotIotbasicBatchcollectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: IoT设备平台-批量数据上链
 * Summary: IoT设备平台-批量数据上链
 */
func (client *Client) OperateBlockchainBotIotbasicBatchcollectEx(request *OperateBlockchainBotIotbasicBatchcollectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateBlockchainBotIotbasicBatchcollectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateBlockchainBotIotbasicBatchcollectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.batchcollect.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 上链数据分页查询
 * Summary: 上链数据分页查询
 */
func (client *Client) QueryBlockchainBotIotbasicDevicecollect(request *QueryBlockchainBotIotbasicDevicecollectRequest) (_result *QueryBlockchainBotIotbasicDevicecollectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBlockchainBotIotbasicDevicecollectResponse{}
	_body, _err := client.QueryBlockchainBotIotbasicDevicecollectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上链数据分页查询
 * Summary: 上链数据分页查询
 */
func (client *Client) QueryBlockchainBotIotbasicDevicecollectEx(request *QueryBlockchainBotIotbasicDevicecollectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBlockchainBotIotbasicDevicecollectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBlockchainBotIotbasicDevicecollectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.iotbasic.devicecollect.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: eKYT风险评估服务-出行场景司机
 * Summary: eKYT风险评估服务-出行场景司机
 */
func (client *Client) QueryAntsecuritytechGatewayEkytDriver(request *QueryAntsecuritytechGatewayEkytDriverRequest) (_result *QueryAntsecuritytechGatewayEkytDriverResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntsecuritytechGatewayEkytDriverResponse{}
	_body, _err := client.QueryAntsecuritytechGatewayEkytDriverEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: eKYT风险评估服务-出行场景司机
 * Summary: eKYT风险评估服务-出行场景司机
 */
func (client *Client) QueryAntsecuritytechGatewayEkytDriverEx(request *QueryAntsecuritytechGatewayEkytDriverRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntsecuritytechGatewayEkytDriverResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntsecuritytechGatewayEkytDriverResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.ekyt.driver.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 申请设备设备密钥
 * Summary: 申请设备设备密钥
 */
func (client *Client) ApplyAntsecuritytechGatewayIifaaDevicekey(request *ApplyAntsecuritytechGatewayIifaaDevicekeyRequest) (_result *ApplyAntsecuritytechGatewayIifaaDevicekeyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyAntsecuritytechGatewayIifaaDevicekeyResponse{}
	_body, _err := client.ApplyAntsecuritytechGatewayIifaaDevicekeyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 申请设备设备密钥
 * Summary: 申请设备设备密钥
 */
func (client *Client) ApplyAntsecuritytechGatewayIifaaDevicekeyEx(request *ApplyAntsecuritytechGatewayIifaaDevicekeyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyAntsecuritytechGatewayIifaaDevicekeyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyAntsecuritytechGatewayIifaaDevicekeyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.iifaa.devicekey.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: iotbasic-设备厂商创建物模型
 * Summary: iotbasic-设备厂商创建物模型
 */
func (client *Client) CreateBlockchainBotDevicecorpThingmodel(request *CreateBlockchainBotDevicecorpThingmodelRequest) (_result *CreateBlockchainBotDevicecorpThingmodelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBlockchainBotDevicecorpThingmodelResponse{}
	_body, _err := client.CreateBlockchainBotDevicecorpThingmodelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: iotbasic-设备厂商创建物模型
 * Summary: iotbasic-设备厂商创建物模型
 */
func (client *Client) CreateBlockchainBotDevicecorpThingmodelEx(request *CreateBlockchainBotDevicecorpThingmodelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBlockchainBotDevicecorpThingmodelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBlockchainBotDevicecorpThingmodelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.devicecorp.thingmodel.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: iotbasic-设备厂商删除物模型
 * Summary: iotbasic-设备厂商删除物模型
 */
func (client *Client) DeleteBlockchainBotDevicecorpThingmodel(request *DeleteBlockchainBotDevicecorpThingmodelRequest) (_result *DeleteBlockchainBotDevicecorpThingmodelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteBlockchainBotDevicecorpThingmodelResponse{}
	_body, _err := client.DeleteBlockchainBotDevicecorpThingmodelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: iotbasic-设备厂商删除物模型
 * Summary: iotbasic-设备厂商删除物模型
 */
func (client *Client) DeleteBlockchainBotDevicecorpThingmodelEx(request *DeleteBlockchainBotDevicecorpThingmodelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteBlockchainBotDevicecorpThingmodelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteBlockchainBotDevicecorpThingmodelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.devicecorp.thingmodel.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: iotbasic-设备厂商发布物模型
 * Summary: iotbasic-设备厂商发布物模型
 */
func (client *Client) PublishBlockchainBotDevicecorpThingmodel(request *PublishBlockchainBotDevicecorpThingmodelRequest) (_result *PublishBlockchainBotDevicecorpThingmodelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PublishBlockchainBotDevicecorpThingmodelResponse{}
	_body, _err := client.PublishBlockchainBotDevicecorpThingmodelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: iotbasic-设备厂商发布物模型
 * Summary: iotbasic-设备厂商发布物模型
 */
func (client *Client) PublishBlockchainBotDevicecorpThingmodelEx(request *PublishBlockchainBotDevicecorpThingmodelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PublishBlockchainBotDevicecorpThingmodelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PublishBlockchainBotDevicecorpThingmodelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.devicecorp.thingmodel.publish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣签约链接获取
 * Summary: 代扣签约链接获取
 */
func (client *Client) SignBlockchainBotDigitalkeyWithhold(request *SignBlockchainBotDigitalkeyWithholdRequest) (_result *SignBlockchainBotDigitalkeyWithholdResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SignBlockchainBotDigitalkeyWithholdResponse{}
	_body, _err := client.SignBlockchainBotDigitalkeyWithholdEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣签约链接获取
 * Summary: 代扣签约链接获取
 */
func (client *Client) SignBlockchainBotDigitalkeyWithholdEx(request *SignBlockchainBotDigitalkeyWithholdRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SignBlockchainBotDigitalkeyWithholdResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SignBlockchainBotDigitalkeyWithholdResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.digitalkey.withhold.sign"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣签约解除
 * Summary: 代扣签约解除
 */
func (client *Client) UnbindBlockchainBotDigitalkeyWithhold(request *UnbindBlockchainBotDigitalkeyWithholdRequest) (_result *UnbindBlockchainBotDigitalkeyWithholdResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UnbindBlockchainBotDigitalkeyWithholdResponse{}
	_body, _err := client.UnbindBlockchainBotDigitalkeyWithholdEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣签约解除
 * Summary: 代扣签约解除
 */
func (client *Client) UnbindBlockchainBotDigitalkeyWithholdEx(request *UnbindBlockchainBotDigitalkeyWithholdRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UnbindBlockchainBotDigitalkeyWithholdResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UnbindBlockchainBotDigitalkeyWithholdResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.digitalkey.withhold.unbind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣支付
 * Summary: 代扣支付
 */
func (client *Client) PayBlockchainBotDigitalkeyWithhold(request *PayBlockchainBotDigitalkeyWithholdRequest) (_result *PayBlockchainBotDigitalkeyWithholdResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PayBlockchainBotDigitalkeyWithholdResponse{}
	_body, _err := client.PayBlockchainBotDigitalkeyWithholdEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣支付
 * Summary: 代扣支付
 */
func (client *Client) PayBlockchainBotDigitalkeyWithholdEx(request *PayBlockchainBotDigitalkeyWithholdRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PayBlockchainBotDigitalkeyWithholdResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PayBlockchainBotDigitalkeyWithholdResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.digitalkey.withhold.pay"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣支付退款
 * Summary: 代扣支付退款
 */
func (client *Client) RefuseBlockchainBotDigitalkeyWithhold(request *RefuseBlockchainBotDigitalkeyWithholdRequest) (_result *RefuseBlockchainBotDigitalkeyWithholdResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RefuseBlockchainBotDigitalkeyWithholdResponse{}
	_body, _err := client.RefuseBlockchainBotDigitalkeyWithholdEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣支付退款
 * Summary: 代扣支付退款
 */
func (client *Client) RefuseBlockchainBotDigitalkeyWithholdEx(request *RefuseBlockchainBotDigitalkeyWithholdRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RefuseBlockchainBotDigitalkeyWithholdResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RefuseBlockchainBotDigitalkeyWithholdResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.digitalkey.withhold.refuse"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣协议查询
 * Summary: 代扣协议查询
 */
func (client *Client) QueryBlockchainBotDigitalkeyWithhold(request *QueryBlockchainBotDigitalkeyWithholdRequest) (_result *QueryBlockchainBotDigitalkeyWithholdResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBlockchainBotDigitalkeyWithholdResponse{}
	_body, _err := client.QueryBlockchainBotDigitalkeyWithholdEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣协议查询
 * Summary: 代扣协议查询
 */
func (client *Client) QueryBlockchainBotDigitalkeyWithholdEx(request *QueryBlockchainBotDigitalkeyWithholdRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBlockchainBotDigitalkeyWithholdResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBlockchainBotDigitalkeyWithholdResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.digitalkey.withhold.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣撤销
 * Summary: 代扣撤销
 */
func (client *Client) CancelBlockchainBotDigitalkeyWithhold(request *CancelBlockchainBotDigitalkeyWithholdRequest) (_result *CancelBlockchainBotDigitalkeyWithholdResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelBlockchainBotDigitalkeyWithholdResponse{}
	_body, _err := client.CancelBlockchainBotDigitalkeyWithholdEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣撤销
 * Summary: 代扣撤销
 */
func (client *Client) CancelBlockchainBotDigitalkeyWithholdEx(request *CancelBlockchainBotDigitalkeyWithholdRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelBlockchainBotDigitalkeyWithholdResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelBlockchainBotDigitalkeyWithholdResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.digitalkey.withhold.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣扣款前预通知
 * Summary: 代扣扣款前预通知
 */
func (client *Client) NotifyBlockchainBotDigitalkeyWithhold(request *NotifyBlockchainBotDigitalkeyWithholdRequest) (_result *NotifyBlockchainBotDigitalkeyWithholdResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &NotifyBlockchainBotDigitalkeyWithholdResponse{}
	_body, _err := client.NotifyBlockchainBotDigitalkeyWithholdEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣扣款前预通知
 * Summary: 代扣扣款前预通知
 */
func (client *Client) NotifyBlockchainBotDigitalkeyWithholdEx(request *NotifyBlockchainBotDigitalkeyWithholdRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *NotifyBlockchainBotDigitalkeyWithholdResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &NotifyBlockchainBotDigitalkeyWithholdResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bot.digitalkey.withhold.notify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
