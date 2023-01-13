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

// 上传者信息
type UploaderInfo struct {
	// 上传者证书hash
	CertHash *string `json:"cert_hash,omitempty" xml:"cert_hash,omitempty" require:"true"`
	// 上传者身份证明
	Uploader *string `json:"uploader,omitempty" xml:"uploader,omitempty" require:"true"`
	// 上传时间
	UploadTime *int64 `json:"upload_time,omitempty" xml:"upload_time,omitempty" require:"true"`
	// 经度
	Longitude *string `json:"longitude,omitempty" xml:"longitude,omitempty"`
	// 纬度
	Latitude *string `json:"latitude,omitempty" xml:"latitude,omitempty"`
}

func (s UploaderInfo) String() string {
	return tea.Prettify(s)
}

func (s UploaderInfo) GoString() string {
	return s.String()
}

func (s *UploaderInfo) SetCertHash(v string) *UploaderInfo {
	s.CertHash = &v
	return s
}

func (s *UploaderInfo) SetUploader(v string) *UploaderInfo {
	s.Uploader = &v
	return s
}

func (s *UploaderInfo) SetUploadTime(v int64) *UploaderInfo {
	s.UploadTime = &v
	return s
}

func (s *UploaderInfo) SetLongitude(v string) *UploaderInfo {
	s.Longitude = &v
	return s
}

func (s *UploaderInfo) SetLatitude(v string) *UploaderInfo {
	s.Latitude = &v
	return s
}

// 环节项
type PhaseItem struct {
	// 标题
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
	// 类型
	// TEXT: 文本，
	// IMAGE： 图片,
	// VIDEO:  视频,
	// LONGTEXT: 长文本,
	// MAP: 地图,
	// BANNER: 广告位,
	// PDF: pdf文件,
	// CERTIFICATE: 认证信息
	// NESTED： 嵌套类型
	// CUSTOMIZE： 自定义类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
	// 扩展信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty" require:"true"`
}

func (s PhaseItem) String() string {
	return tea.Prettify(s)
}

func (s PhaseItem) GoString() string {
	return s.String()
}

func (s *PhaseItem) SetTitle(v string) *PhaseItem {
	s.Title = &v
	return s
}

func (s *PhaseItem) SetType(v string) *PhaseItem {
	s.Type = &v
	return s
}

func (s *PhaseItem) SetValue(v string) *PhaseItem {
	s.Value = &v
	return s
}

func (s *PhaseItem) SetExtInfo(v string) *PhaseItem {
	s.ExtInfo = &v
	return s
}

// 区块信息
type BlockInfo struct {
	// 块高度
	BlockHeight *int64 `json:"block_height,omitempty" xml:"block_height,omitempty" require:"true"`
	// 成块时间戳
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty" require:"true"`
	// 交易摘要
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
}

func (s BlockInfo) String() string {
	return tea.Prettify(s)
}

func (s BlockInfo) GoString() string {
	return s.String()
}

func (s *BlockInfo) SetBlockHeight(v int64) *BlockInfo {
	s.BlockHeight = &v
	return s
}

func (s *BlockInfo) SetTimestamp(v int64) *BlockInfo {
	s.Timestamp = &v
	return s
}

func (s *BlockInfo) SetTxHash(v string) *BlockInfo {
	s.TxHash = &v
	return s
}

// 用户扫码信息
type ScanUserInfo struct {
	// 用户昵称
	Nick *string `json:"nick,omitempty" xml:"nick,omitempty" require:"true"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 经度
	Longitude *int64 `json:"longitude,omitempty" xml:"longitude,omitempty" require:"true"`
	// 纬度
	Latitude *int64 `json:"latitude,omitempty" xml:"latitude,omitempty" require:"true"`
	// 用户来源
	SrcType *string `json:"src_type,omitempty" xml:"src_type,omitempty" require:"true"`
	// 扫码时间
	ScanTime *int64 `json:"scan_time,omitempty" xml:"scan_time,omitempty"`
}

func (s ScanUserInfo) String() string {
	return tea.Prettify(s)
}

func (s ScanUserInfo) GoString() string {
	return s.String()
}

func (s *ScanUserInfo) SetNick(v string) *ScanUserInfo {
	s.Nick = &v
	return s
}

func (s *ScanUserInfo) SetUserId(v string) *ScanUserInfo {
	s.UserId = &v
	return s
}

func (s *ScanUserInfo) SetLongitude(v int64) *ScanUserInfo {
	s.Longitude = &v
	return s
}

func (s *ScanUserInfo) SetLatitude(v int64) *ScanUserInfo {
	s.Latitude = &v
	return s
}

func (s *ScanUserInfo) SetSrcType(v string) *ScanUserInfo {
	s.SrcType = &v
	return s
}

func (s *ScanUserInfo) SetScanTime(v int64) *ScanUserInfo {
	s.ScanTime = &v
	return s
}

// 首次扫描信息
type ScanHeadInfo struct {
	// 扫描时间
	ScanTime *int64 `json:"scan_time,omitempty" xml:"scan_time,omitempty" require:"true"`
	// 扫码次数
	ScanCount *int64 `json:"scan_count,omitempty" xml:"scan_count,omitempty" require:"true"`
	// 扫码地址
	ScanAddr *string `json:"scan_addr,omitempty" xml:"scan_addr,omitempty" require:"true"`
}

func (s ScanHeadInfo) String() string {
	return tea.Prettify(s)
}

func (s ScanHeadInfo) GoString() string {
	return s.String()
}

func (s *ScanHeadInfo) SetScanTime(v int64) *ScanHeadInfo {
	s.ScanTime = &v
	return s
}

func (s *ScanHeadInfo) SetScanCount(v int64) *ScanHeadInfo {
	s.ScanCount = &v
	return s
}

func (s *ScanHeadInfo) SetScanAddr(v string) *ScanHeadInfo {
	s.ScanAddr = &v
	return s
}

// 环节信息
type PhaseInfo struct {
	// 环节名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 环节项
	Items []*PhaseItem `json:"items,omitempty" xml:"items,omitempty" require:"true" type:"Repeated"`
	// 上传者信息
	UploadInfo *UploaderInfo `json:"upload_info,omitempty" xml:"upload_info,omitempty" require:"true"`
	// 区块信息
	BlockInfo *BlockInfo `json:"block_info,omitempty" xml:"block_info,omitempty" require:"true"`
}

func (s PhaseInfo) String() string {
	return tea.Prettify(s)
}

func (s PhaseInfo) GoString() string {
	return s.String()
}

func (s *PhaseInfo) SetName(v string) *PhaseInfo {
	s.Name = &v
	return s
}

func (s *PhaseInfo) SetItems(v []*PhaseItem) *PhaseInfo {
	s.Items = v
	return s
}

func (s *PhaseInfo) SetUploadInfo(v *UploaderInfo) *PhaseInfo {
	s.UploadInfo = v
	return s
}

func (s *PhaseInfo) SetBlockInfo(v *BlockInfo) *PhaseInfo {
	s.BlockInfo = v
	return s
}

type QueryAntchainMytcMiniCertRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 溯源码信息
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true" maxLength:"160"`
	// 交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true" maxLength:"64"`
}

func (s QueryAntchainMytcMiniCertRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainMytcMiniCertRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainMytcMiniCertRequest) SetAuthToken(v string) *QueryAntchainMytcMiniCertRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainMytcMiniCertRequest) SetProductInstanceId(v string) *QueryAntchainMytcMiniCertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainMytcMiniCertRequest) SetCode(v string) *QueryAntchainMytcMiniCertRequest {
	s.Code = &v
	return s
}

func (s *QueryAntchainMytcMiniCertRequest) SetTxHash(v string) *QueryAntchainMytcMiniCertRequest {
	s.TxHash = &v
	return s
}

type QueryAntchainMytcMiniCertResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区块信息
	BlockInfo *BlockInfo `json:"block_info,omitempty" xml:"block_info,omitempty"`
	// 上传者信息
	UploadInfo *UploaderInfo `json:"upload_info,omitempty" xml:"upload_info,omitempty"`
}

func (s QueryAntchainMytcMiniCertResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainMytcMiniCertResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainMytcMiniCertResponse) SetReqMsgId(v string) *QueryAntchainMytcMiniCertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainMytcMiniCertResponse) SetResultCode(v string) *QueryAntchainMytcMiniCertResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainMytcMiniCertResponse) SetResultMsg(v string) *QueryAntchainMytcMiniCertResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainMytcMiniCertResponse) SetBlockInfo(v *BlockInfo) *QueryAntchainMytcMiniCertResponse {
	s.BlockInfo = v
	return s
}

func (s *QueryAntchainMytcMiniCertResponse) SetUploadInfo(v *UploaderInfo) *QueryAntchainMytcMiniCertResponse {
	s.UploadInfo = v
	return s
}

type QueryAntchainMytcMiniCodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 溯源码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true" maxLength:"160"`
	// 用户信息
	UserInfo *ScanUserInfo `json:"user_info,omitempty" xml:"user_info,omitempty"`
}

func (s QueryAntchainMytcMiniCodeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainMytcMiniCodeRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainMytcMiniCodeRequest) SetAuthToken(v string) *QueryAntchainMytcMiniCodeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainMytcMiniCodeRequest) SetProductInstanceId(v string) *QueryAntchainMytcMiniCodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainMytcMiniCodeRequest) SetCode(v string) *QueryAntchainMytcMiniCodeRequest {
	s.Code = &v
	return s
}

func (s *QueryAntchainMytcMiniCodeRequest) SetUserInfo(v *ScanUserInfo) *QueryAntchainMytcMiniCodeRequest {
	s.UserInfo = v
	return s
}

type QueryAntchainMytcMiniCodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 首次扫描信息
	ScanInfo *ScanHeadInfo `json:"scan_info,omitempty" xml:"scan_info,omitempty"`
	// 溯源环节信息列表
	PhaseInfos []*PhaseInfo `json:"phase_infos,omitempty" xml:"phase_infos,omitempty" type:"Repeated"`
}

func (s QueryAntchainMytcMiniCodeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainMytcMiniCodeResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainMytcMiniCodeResponse) SetReqMsgId(v string) *QueryAntchainMytcMiniCodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainMytcMiniCodeResponse) SetResultCode(v string) *QueryAntchainMytcMiniCodeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainMytcMiniCodeResponse) SetResultMsg(v string) *QueryAntchainMytcMiniCodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainMytcMiniCodeResponse) SetScanInfo(v *ScanHeadInfo) *QueryAntchainMytcMiniCodeResponse {
	s.ScanInfo = v
	return s
}

func (s *QueryAntchainMytcMiniCodeResponse) SetPhaseInfos(v []*PhaseInfo) *QueryAntchainMytcMiniCodeResponse {
	s.PhaseInfos = v
	return s
}

type VerifyAntchainMytcMiniNfcRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 动态秘钥字符串信息
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true" maxLength:"160"`
	// NFC UID
	Uid *string `json:"uid,omitempty" xml:"uid,omitempty"`
}

func (s VerifyAntchainMytcMiniNfcRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyAntchainMytcMiniNfcRequest) GoString() string {
	return s.String()
}

func (s *VerifyAntchainMytcMiniNfcRequest) SetAuthToken(v string) *VerifyAntchainMytcMiniNfcRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyAntchainMytcMiniNfcRequest) SetProductInstanceId(v string) *VerifyAntchainMytcMiniNfcRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyAntchainMytcMiniNfcRequest) SetCode(v string) *VerifyAntchainMytcMiniNfcRequest {
	s.Code = &v
	return s
}

func (s *VerifyAntchainMytcMiniNfcRequest) SetUid(v string) *VerifyAntchainMytcMiniNfcRequest {
	s.Uid = &v
	return s
}

type VerifyAntchainMytcMiniNfcResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 校验结果
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 校验信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 校验解析溯源码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// NFC UID
	Uid *string `json:"uid,omitempty" xml:"uid,omitempty"`
}

func (s VerifyAntchainMytcMiniNfcResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyAntchainMytcMiniNfcResponse) GoString() string {
	return s.String()
}

func (s *VerifyAntchainMytcMiniNfcResponse) SetReqMsgId(v string) *VerifyAntchainMytcMiniNfcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyAntchainMytcMiniNfcResponse) SetResultCode(v string) *VerifyAntchainMytcMiniNfcResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyAntchainMytcMiniNfcResponse) SetResultMsg(v string) *VerifyAntchainMytcMiniNfcResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyAntchainMytcMiniNfcResponse) SetStatus(v string) *VerifyAntchainMytcMiniNfcResponse {
	s.Status = &v
	return s
}

func (s *VerifyAntchainMytcMiniNfcResponse) SetMessage(v string) *VerifyAntchainMytcMiniNfcResponse {
	s.Message = &v
	return s
}

func (s *VerifyAntchainMytcMiniNfcResponse) SetCode(v string) *VerifyAntchainMytcMiniNfcResponse {
	s.Code = &v
	return s
}

func (s *VerifyAntchainMytcMiniNfcResponse) SetUid(v string) *VerifyAntchainMytcMiniNfcResponse {
	s.Uid = &v
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
				"sdk_version":      tea.String("1.0.0"),
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
 * Description: 溯源证书查询
 * Summary: 溯源证书查询
 */
func (client *Client) QueryAntchainMytcMiniCert(request *QueryAntchainMytcMiniCertRequest) (_result *QueryAntchainMytcMiniCertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainMytcMiniCertResponse{}
	_body, _err := client.QueryAntchainMytcMiniCertEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 溯源证书查询
 * Summary: 溯源证书查询
 */
func (client *Client) QueryAntchainMytcMiniCertEx(request *QueryAntchainMytcMiniCertRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainMytcMiniCertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainMytcMiniCertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mytc.mini.cert.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 溯源码详情查询
 * Summary: 溯源码详情查询
 */
func (client *Client) QueryAntchainMytcMiniCode(request *QueryAntchainMytcMiniCodeRequest) (_result *QueryAntchainMytcMiniCodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainMytcMiniCodeResponse{}
	_body, _err := client.QueryAntchainMytcMiniCodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 溯源码详情查询
 * Summary: 溯源码详情查询
 */
func (client *Client) QueryAntchainMytcMiniCodeEx(request *QueryAntchainMytcMiniCodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainMytcMiniCodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainMytcMiniCodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mytc.mini.code.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 动态秘钥NFC二维码校验
 * Summary: 动态秘钥NFC二维码校验
 */
func (client *Client) VerifyAntchainMytcMiniNfc(request *VerifyAntchainMytcMiniNfcRequest) (_result *VerifyAntchainMytcMiniNfcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyAntchainMytcMiniNfcResponse{}
	_body, _err := client.VerifyAntchainMytcMiniNfcEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 动态秘钥NFC二维码校验
 * Summary: 动态秘钥NFC二维码校验
 */
func (client *Client) VerifyAntchainMytcMiniNfcEx(request *VerifyAntchainMytcMiniNfcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyAntchainMytcMiniNfcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyAntchainMytcMiniNfcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mytc.mini.nfc.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
