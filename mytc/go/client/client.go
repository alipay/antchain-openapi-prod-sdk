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

// 码注册信息
type CodeRegisterInfo struct {
	// 溯源码，代表该账户的唯一资源标识
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true" maxLength:"160" minLength:"1"`
	// 状态,客户自定义状态，用于过滤查询使用
	Status *string `json:"status,omitempty" xml:"status,omitempty" maxLength:"32" minLength:"2"`
	// 关联溯源码列表，可以通过接口查询关联溯源码绑定的信息
	RelationCodes []*string `json:"relation_codes,omitempty" xml:"relation_codes,omitempty" type:"Repeated"`
	// 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度128
	BizLabels []*string `json:"biz_labels,omitempty" xml:"biz_labels,omitempty" type:"Repeated"`
	// 注册内容
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 区块链上交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 注册溯源码记录唯一标识
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty"`
}

func (s CodeRegisterInfo) String() string {
	return tea.Prettify(s)
}

func (s CodeRegisterInfo) GoString() string {
	return s.String()
}

func (s *CodeRegisterInfo) SetCode(v string) *CodeRegisterInfo {
	s.Code = &v
	return s
}

func (s *CodeRegisterInfo) SetStatus(v string) *CodeRegisterInfo {
	s.Status = &v
	return s
}

func (s *CodeRegisterInfo) SetRelationCodes(v []*string) *CodeRegisterInfo {
	s.RelationCodes = v
	return s
}

func (s *CodeRegisterInfo) SetBizLabels(v []*string) *CodeRegisterInfo {
	s.BizLabels = v
	return s
}

func (s *CodeRegisterInfo) SetContent(v string) *CodeRegisterInfo {
	s.Content = &v
	return s
}

func (s *CodeRegisterInfo) SetTxHash(v string) *CodeRegisterInfo {
	s.TxHash = &v
	return s
}

func (s *CodeRegisterInfo) SetUniqueId(v string) *CodeRegisterInfo {
	s.UniqueId = &v
	return s
}

// 溯源码关联信息
type CodeRelationInfo struct {
	// 溯源码，代表该账户的唯一资源标识
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 状态,客户自定义状态，用于过滤查询使用，仅支持字母数字构成
	//
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 关联内容
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 区块链上交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度128
	BizLabels []*string `json:"biz_labels,omitempty" xml:"biz_labels,omitempty" type:"Repeated"`
	// 溯源码信息关联记录唯一标识
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty"`
}

func (s CodeRelationInfo) String() string {
	return tea.Prettify(s)
}

func (s CodeRelationInfo) GoString() string {
	return s.String()
}

func (s *CodeRelationInfo) SetCode(v string) *CodeRelationInfo {
	s.Code = &v
	return s
}

func (s *CodeRelationInfo) SetStatus(v string) *CodeRelationInfo {
	s.Status = &v
	return s
}

func (s *CodeRelationInfo) SetContent(v string) *CodeRelationInfo {
	s.Content = &v
	return s
}

func (s *CodeRelationInfo) SetTxHash(v string) *CodeRelationInfo {
	s.TxHash = &v
	return s
}

func (s *CodeRelationInfo) SetBizLabels(v []*string) *CodeRelationInfo {
	s.BizLabels = v
	return s
}

func (s *CodeRelationInfo) SetUniqueId(v string) *CodeRelationInfo {
	s.UniqueId = &v
	return s
}

// 区块链交易信息
type BlockChainTransactionInfo struct {
	// 区块链上交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 区块链标识
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 消耗gas数量
	GasUsed *string `json:"gas_used,omitempty" xml:"gas_used,omitempty" require:"true"`
	// 父区块哈希
	ParentHash *string `json:"parent_hash,omitempty" xml:"parent_hash,omitempty" require:"true"`
	// 收据根
	ReceiptRoot *string `json:"receipt_root,omitempty" xml:"receipt_root,omitempty" require:"true"`
	// 状态树根
	StateRoot *string `json:"state_root,omitempty" xml:"state_root,omitempty" require:"true"`
	// 交易根
	TransactionRoot *string `json:"transaction_root,omitempty" xml:"transaction_root,omitempty" require:"true"`
	// 版本
	Version *string `json:"version,omitempty" xml:"version,omitempty" require:"true"`
	// 区块高度
	Number *int64 `json:"number,omitempty" xml:"number,omitempty" require:"true"`
	// 成块时间
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty" require:"true"`
}

func (s BlockChainTransactionInfo) String() string {
	return tea.Prettify(s)
}

func (s BlockChainTransactionInfo) GoString() string {
	return s.String()
}

func (s *BlockChainTransactionInfo) SetTxHash(v string) *BlockChainTransactionInfo {
	s.TxHash = &v
	return s
}

func (s *BlockChainTransactionInfo) SetBizId(v string) *BlockChainTransactionInfo {
	s.BizId = &v
	return s
}

func (s *BlockChainTransactionInfo) SetGasUsed(v string) *BlockChainTransactionInfo {
	s.GasUsed = &v
	return s
}

func (s *BlockChainTransactionInfo) SetParentHash(v string) *BlockChainTransactionInfo {
	s.ParentHash = &v
	return s
}

func (s *BlockChainTransactionInfo) SetReceiptRoot(v string) *BlockChainTransactionInfo {
	s.ReceiptRoot = &v
	return s
}

func (s *BlockChainTransactionInfo) SetStateRoot(v string) *BlockChainTransactionInfo {
	s.StateRoot = &v
	return s
}

func (s *BlockChainTransactionInfo) SetTransactionRoot(v string) *BlockChainTransactionInfo {
	s.TransactionRoot = &v
	return s
}

func (s *BlockChainTransactionInfo) SetVersion(v string) *BlockChainTransactionInfo {
	s.Version = &v
	return s
}

func (s *BlockChainTransactionInfo) SetNumber(v int64) *BlockChainTransactionInfo {
	s.Number = &v
	return s
}

func (s *BlockChainTransactionInfo) SetTimestamp(v int64) *BlockChainTransactionInfo {
	s.Timestamp = &v
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

type RecognizeAntiQrcodeacRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 上传图片使用的设备类型,用于更精准的识别,非必填。
	DeviceType *string `json:"device_type,omitempty" xml:"device_type,omitempty"`
	// Base64格式的图片数据
	ImageStr *string `json:"image_str,omitempty" xml:"image_str,omitempty"`
	// 图片文件id，通过小程序拍照，上传的二维码图片信息。
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
}

func (s RecognizeAntiQrcodeacRequest) String() string {
	return tea.Prettify(s)
}

func (s RecognizeAntiQrcodeacRequest) GoString() string {
	return s.String()
}

func (s *RecognizeAntiQrcodeacRequest) SetAuthToken(v string) *RecognizeAntiQrcodeacRequest {
	s.AuthToken = &v
	return s
}

func (s *RecognizeAntiQrcodeacRequest) SetProductInstanceId(v string) *RecognizeAntiQrcodeacRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RecognizeAntiQrcodeacRequest) SetDeviceType(v string) *RecognizeAntiQrcodeacRequest {
	s.DeviceType = &v
	return s
}

func (s *RecognizeAntiQrcodeacRequest) SetImageStr(v string) *RecognizeAntiQrcodeacRequest {
	s.ImageStr = &v
	return s
}

func (s *RecognizeAntiQrcodeacRequest) SetFileObject(v io.Reader) *RecognizeAntiQrcodeacRequest {
	s.FileObject = v
	return s
}

func (s *RecognizeAntiQrcodeacRequest) SetFileObjectName(v string) *RecognizeAntiQrcodeacRequest {
	s.FileObjectName = &v
	return s
}

func (s *RecognizeAntiQrcodeacRequest) SetFileId(v string) *RecognizeAntiQrcodeacRequest {
	s.FileId = &v
	return s
}

type RecognizeAntiQrcodeacResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 解码结果,0:失败,1:成功，如果解码成功，可忽略detectState字段返回结果
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 识别状态
	DetectState *string `json:"detect_state,omitempty" xml:"detect_state,omitempty"`
	// 识别状态描述
	DetectDesc *string `json:"detect_desc,omitempty" xml:"detect_desc,omitempty"`
	// 加密数据
	EncryptData *string `json:"encrypt_data,omitempty" xml:"encrypt_data,omitempty"`
}

func (s RecognizeAntiQrcodeacResponse) String() string {
	return tea.Prettify(s)
}

func (s RecognizeAntiQrcodeacResponse) GoString() string {
	return s.String()
}

func (s *RecognizeAntiQrcodeacResponse) SetReqMsgId(v string) *RecognizeAntiQrcodeacResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RecognizeAntiQrcodeacResponse) SetResultCode(v string) *RecognizeAntiQrcodeacResponse {
	s.ResultCode = &v
	return s
}

func (s *RecognizeAntiQrcodeacResponse) SetResultMsg(v string) *RecognizeAntiQrcodeacResponse {
	s.ResultMsg = &v
	return s
}

func (s *RecognizeAntiQrcodeacResponse) SetCode(v string) *RecognizeAntiQrcodeacResponse {
	s.Code = &v
	return s
}

func (s *RecognizeAntiQrcodeacResponse) SetDetectState(v string) *RecognizeAntiQrcodeacResponse {
	s.DetectState = &v
	return s
}

func (s *RecognizeAntiQrcodeacResponse) SetDetectDesc(v string) *RecognizeAntiQrcodeacResponse {
	s.DetectDesc = &v
	return s
}

func (s *RecognizeAntiQrcodeacResponse) SetEncryptData(v string) *RecognizeAntiQrcodeacResponse {
	s.EncryptData = &v
	return s
}

type InitAntiImagesyncRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 防伪码类型标识,由蚂蚁侧分配
	CodeType *string `json:"code_type,omitempty" xml:"code_type,omitempty" require:"true"`
	// 防伪码批次号
	BatchNo *string `json:"batch_no,omitempty" xml:"batch_no,omitempty" require:"true"`
	// 批次下要上传的防伪码总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty" require:"true"`
}

func (s InitAntiImagesyncRequest) String() string {
	return tea.Prettify(s)
}

func (s InitAntiImagesyncRequest) GoString() string {
	return s.String()
}

func (s *InitAntiImagesyncRequest) SetAuthToken(v string) *InitAntiImagesyncRequest {
	s.AuthToken = &v
	return s
}

func (s *InitAntiImagesyncRequest) SetProductInstanceId(v string) *InitAntiImagesyncRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitAntiImagesyncRequest) SetCodeType(v string) *InitAntiImagesyncRequest {
	s.CodeType = &v
	return s
}

func (s *InitAntiImagesyncRequest) SetBatchNo(v string) *InitAntiImagesyncRequest {
	s.BatchNo = &v
	return s
}

func (s *InitAntiImagesyncRequest) SetTotal(v int64) *InitAntiImagesyncRequest {
	s.Total = &v
	return s
}

type InitAntiImagesyncResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 批次号
	BatchNo *string `json:"batch_no,omitempty" xml:"batch_no,omitempty"`
	// 批次下的访问码总数
	Total *string `json:"total,omitempty" xml:"total,omitempty"`
}

func (s InitAntiImagesyncResponse) String() string {
	return tea.Prettify(s)
}

func (s InitAntiImagesyncResponse) GoString() string {
	return s.String()
}

func (s *InitAntiImagesyncResponse) SetReqMsgId(v string) *InitAntiImagesyncResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitAntiImagesyncResponse) SetResultCode(v string) *InitAntiImagesyncResponse {
	s.ResultCode = &v
	return s
}

func (s *InitAntiImagesyncResponse) SetResultMsg(v string) *InitAntiImagesyncResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitAntiImagesyncResponse) SetBatchNo(v string) *InitAntiImagesyncResponse {
	s.BatchNo = &v
	return s
}

func (s *InitAntiImagesyncResponse) SetTotal(v string) *InitAntiImagesyncResponse {
	s.Total = &v
	return s
}

type UploadAntiImagesyncRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 防伪码类型
	CodeType *string `json:"code_type,omitempty" xml:"code_type,omitempty" require:"true"`
	// 防伪码码值
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 批次号码
	BatchNo *string `json:"batch_no,omitempty" xml:"batch_no,omitempty" require:"true"`
	// 文件id
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
}

func (s UploadAntiImagesyncRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadAntiImagesyncRequest) GoString() string {
	return s.String()
}

func (s *UploadAntiImagesyncRequest) SetAuthToken(v string) *UploadAntiImagesyncRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadAntiImagesyncRequest) SetProductInstanceId(v string) *UploadAntiImagesyncRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadAntiImagesyncRequest) SetCodeType(v string) *UploadAntiImagesyncRequest {
	s.CodeType = &v
	return s
}

func (s *UploadAntiImagesyncRequest) SetCode(v string) *UploadAntiImagesyncRequest {
	s.Code = &v
	return s
}

func (s *UploadAntiImagesyncRequest) SetBatchNo(v string) *UploadAntiImagesyncRequest {
	s.BatchNo = &v
	return s
}

func (s *UploadAntiImagesyncRequest) SetFileObject(v io.Reader) *UploadAntiImagesyncRequest {
	s.FileObject = v
	return s
}

func (s *UploadAntiImagesyncRequest) SetFileObjectName(v string) *UploadAntiImagesyncRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadAntiImagesyncRequest) SetFileId(v string) *UploadAntiImagesyncRequest {
	s.FileId = &v
	return s
}

type UploadAntiImagesyncResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 防伪码码值
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
}

func (s UploadAntiImagesyncResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadAntiImagesyncResponse) GoString() string {
	return s.String()
}

func (s *UploadAntiImagesyncResponse) SetReqMsgId(v string) *UploadAntiImagesyncResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadAntiImagesyncResponse) SetResultCode(v string) *UploadAntiImagesyncResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadAntiImagesyncResponse) SetResultMsg(v string) *UploadAntiImagesyncResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadAntiImagesyncResponse) SetCode(v string) *UploadAntiImagesyncResponse {
	s.Code = &v
	return s
}

type FinishAntiImagesyncRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 批次号
	BatchNo *string `json:"batch_no,omitempty" xml:"batch_no,omitempty" require:"true"`
	// 防伪码类型
	CodeType *string `json:"code_type,omitempty" xml:"code_type,omitempty" require:"true"`
}

func (s FinishAntiImagesyncRequest) String() string {
	return tea.Prettify(s)
}

func (s FinishAntiImagesyncRequest) GoString() string {
	return s.String()
}

func (s *FinishAntiImagesyncRequest) SetAuthToken(v string) *FinishAntiImagesyncRequest {
	s.AuthToken = &v
	return s
}

func (s *FinishAntiImagesyncRequest) SetProductInstanceId(v string) *FinishAntiImagesyncRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *FinishAntiImagesyncRequest) SetBatchNo(v string) *FinishAntiImagesyncRequest {
	s.BatchNo = &v
	return s
}

func (s *FinishAntiImagesyncRequest) SetCodeType(v string) *FinishAntiImagesyncRequest {
	s.CodeType = &v
	return s
}

type FinishAntiImagesyncResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 批次号
	BatchNo *string `json:"batch_no,omitempty" xml:"batch_no,omitempty"`
}

func (s FinishAntiImagesyncResponse) String() string {
	return tea.Prettify(s)
}

func (s FinishAntiImagesyncResponse) GoString() string {
	return s.String()
}

func (s *FinishAntiImagesyncResponse) SetReqMsgId(v string) *FinishAntiImagesyncResponse {
	s.ReqMsgId = &v
	return s
}

func (s *FinishAntiImagesyncResponse) SetResultCode(v string) *FinishAntiImagesyncResponse {
	s.ResultCode = &v
	return s
}

func (s *FinishAntiImagesyncResponse) SetResultMsg(v string) *FinishAntiImagesyncResponse {
	s.ResultMsg = &v
	return s
}

func (s *FinishAntiImagesyncResponse) SetBatchNo(v string) *FinishAntiImagesyncResponse {
	s.BatchNo = &v
	return s
}

type CreateAntiQrcodeimageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 要生成图片二维码的字符串信息
	QrCode *string `json:"qr_code,omitempty" xml:"qr_code,omitempty" require:"true"`
}

func (s CreateAntiQrcodeimageRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAntiQrcodeimageRequest) GoString() string {
	return s.String()
}

func (s *CreateAntiQrcodeimageRequest) SetAuthToken(v string) *CreateAntiQrcodeimageRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAntiQrcodeimageRequest) SetProductInstanceId(v string) *CreateAntiQrcodeimageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAntiQrcodeimageRequest) SetQrCode(v string) *CreateAntiQrcodeimageRequest {
	s.QrCode = &v
	return s
}

type CreateAntiQrcodeimageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 生成的二维码图片的oss地址
	QrcodeUrl *string `json:"qrcode_url,omitempty" xml:"qrcode_url,omitempty"`
	// 生成结果码，用于异常场景下细化错误信息
	GenerateCode *string `json:"generate_code,omitempty" xml:"generate_code,omitempty"`
	// 生成结果码含义,用于异常场景下细化错误信息
	GenerateMessage *string `json:"generate_message,omitempty" xml:"generate_message,omitempty"`
	// 生成失败时的解决方案,用于异常场景下细化错误信息
	UnableGenerateSolution *string `json:"unable_generate_solution,omitempty" xml:"unable_generate_solution,omitempty"`
}

func (s CreateAntiQrcodeimageResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAntiQrcodeimageResponse) GoString() string {
	return s.String()
}

func (s *CreateAntiQrcodeimageResponse) SetReqMsgId(v string) *CreateAntiQrcodeimageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAntiQrcodeimageResponse) SetResultCode(v string) *CreateAntiQrcodeimageResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAntiQrcodeimageResponse) SetResultMsg(v string) *CreateAntiQrcodeimageResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAntiQrcodeimageResponse) SetQrcodeUrl(v string) *CreateAntiQrcodeimageResponse {
	s.QrcodeUrl = &v
	return s
}

func (s *CreateAntiQrcodeimageResponse) SetGenerateCode(v string) *CreateAntiQrcodeimageResponse {
	s.GenerateCode = &v
	return s
}

func (s *CreateAntiQrcodeimageResponse) SetGenerateMessage(v string) *CreateAntiQrcodeimageResponse {
	s.GenerateMessage = &v
	return s
}

func (s *CreateAntiQrcodeimageResponse) SetUnableGenerateSolution(v string) *CreateAntiQrcodeimageResponse {
	s.UnableGenerateSolution = &v
	return s
}

type CreateCodeRegistrationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务类型，客户自定义标签，做code数据隔离使用
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 溯源码，代表该账户的唯一资源标识
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true" maxLength:"160" minLength:"1"`
	// 状态,客户自定义状态，用于过滤查询使用。只能由字符+数字构成
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
	BizLabels []*string `json:"biz_labels,omitempty" xml:"biz_labels,omitempty" type:"Repeated"`
	// 注册内容
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 关联溯源码列表。最多200条关联码，关联码格式要求和溯源码要求一致。
	// 可以通过接口查询关联溯源码绑定的信息。
	RelationCodes []*string `json:"relation_codes,omitempty" xml:"relation_codes,omitempty" type:"Repeated"`
	// 关联溯源码递归检查，检查最多5层。默认NO_CHECK。枚举值如下，
	// NO_CHECK:  不做递归检查;
	// TREE_CHECK: 树结构检查;
	// DAG_CHECK: 有向无环图检查;
	RecursionType *string `json:"recursion_type,omitempty" xml:"recursion_type,omitempty" maxLength:"32" minLength:"1"`
	// 是否上链，默认true。
	// 为false时，仅做DB数据保存不上链。
	// 若content数据大小超过要求限制，仅会保存content的hash值上链
	UpChainFlag *bool `json:"up_chain_flag,omitempty" xml:"up_chain_flag,omitempty"`
}

func (s CreateCodeRegistrationRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateCodeRegistrationRequest) GoString() string {
	return s.String()
}

func (s *CreateCodeRegistrationRequest) SetAuthToken(v string) *CreateCodeRegistrationRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateCodeRegistrationRequest) SetProductInstanceId(v string) *CreateCodeRegistrationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateCodeRegistrationRequest) SetBizType(v string) *CreateCodeRegistrationRequest {
	s.BizType = &v
	return s
}

func (s *CreateCodeRegistrationRequest) SetCode(v string) *CreateCodeRegistrationRequest {
	s.Code = &v
	return s
}

func (s *CreateCodeRegistrationRequest) SetStatus(v string) *CreateCodeRegistrationRequest {
	s.Status = &v
	return s
}

func (s *CreateCodeRegistrationRequest) SetBizLabels(v []*string) *CreateCodeRegistrationRequest {
	s.BizLabels = v
	return s
}

func (s *CreateCodeRegistrationRequest) SetContent(v string) *CreateCodeRegistrationRequest {
	s.Content = &v
	return s
}

func (s *CreateCodeRegistrationRequest) SetRelationCodes(v []*string) *CreateCodeRegistrationRequest {
	s.RelationCodes = v
	return s
}

func (s *CreateCodeRegistrationRequest) SetRecursionType(v string) *CreateCodeRegistrationRequest {
	s.RecursionType = &v
	return s
}

func (s *CreateCodeRegistrationRequest) SetUpChainFlag(v bool) *CreateCodeRegistrationRequest {
	s.UpChainFlag = &v
	return s
}

type CreateCodeRegistrationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区块链上交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 注册记录唯一标识
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty"`
}

func (s CreateCodeRegistrationResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateCodeRegistrationResponse) GoString() string {
	return s.String()
}

func (s *CreateCodeRegistrationResponse) SetReqMsgId(v string) *CreateCodeRegistrationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateCodeRegistrationResponse) SetResultCode(v string) *CreateCodeRegistrationResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateCodeRegistrationResponse) SetResultMsg(v string) *CreateCodeRegistrationResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateCodeRegistrationResponse) SetTxHash(v string) *CreateCodeRegistrationResponse {
	s.TxHash = &v
	return s
}

func (s *CreateCodeRegistrationResponse) SetUniqueId(v string) *CreateCodeRegistrationResponse {
	s.UniqueId = &v
	return s
}

type DeleteCodeRegistrationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务类型，客户自定义标签，做code数据隔离使用
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 溯源码，代表该账户的唯一资源标识
	Code *string `json:"code,omitempty" xml:"code,omitempty" maxLength:"160" minLength:"1"`
	// 注册记录唯一标识
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s DeleteCodeRegistrationRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteCodeRegistrationRequest) GoString() string {
	return s.String()
}

func (s *DeleteCodeRegistrationRequest) SetAuthToken(v string) *DeleteCodeRegistrationRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteCodeRegistrationRequest) SetProductInstanceId(v string) *DeleteCodeRegistrationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteCodeRegistrationRequest) SetBizType(v string) *DeleteCodeRegistrationRequest {
	s.BizType = &v
	return s
}

func (s *DeleteCodeRegistrationRequest) SetCode(v string) *DeleteCodeRegistrationRequest {
	s.Code = &v
	return s
}

func (s *DeleteCodeRegistrationRequest) SetUniqueId(v string) *DeleteCodeRegistrationRequest {
	s.UniqueId = &v
	return s
}

type DeleteCodeRegistrationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteCodeRegistrationResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteCodeRegistrationResponse) GoString() string {
	return s.String()
}

func (s *DeleteCodeRegistrationResponse) SetReqMsgId(v string) *DeleteCodeRegistrationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteCodeRegistrationResponse) SetResultCode(v string) *DeleteCodeRegistrationResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteCodeRegistrationResponse) SetResultMsg(v string) *DeleteCodeRegistrationResponse {
	s.ResultMsg = &v
	return s
}

type CreateCodeRelationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务类型，客户自定义标签，做code数据隔离使用
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 溯源码，代表该账户的唯一资源标识
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true" maxLength:"160" minLength:"1"`
	// 状态,客户自定义状态，用于过滤查询使用。只能由字符+数字构成
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
	BizLabels []*string `json:"biz_labels,omitempty" xml:"biz_labels,omitempty" type:"Repeated"`
	// 是否上链，默认true。 为false时，仅做DB数据保存不上链。
	// 若content数据大小超过要求限制，仅会保存content的hash值上链
	UpChainFlag *bool `json:"up_chain_flag,omitempty" xml:"up_chain_flag,omitempty"`
	// 关联内容
	//
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
}

func (s CreateCodeRelationRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateCodeRelationRequest) GoString() string {
	return s.String()
}

func (s *CreateCodeRelationRequest) SetAuthToken(v string) *CreateCodeRelationRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateCodeRelationRequest) SetProductInstanceId(v string) *CreateCodeRelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateCodeRelationRequest) SetBizType(v string) *CreateCodeRelationRequest {
	s.BizType = &v
	return s
}

func (s *CreateCodeRelationRequest) SetCode(v string) *CreateCodeRelationRequest {
	s.Code = &v
	return s
}

func (s *CreateCodeRelationRequest) SetStatus(v string) *CreateCodeRelationRequest {
	s.Status = &v
	return s
}

func (s *CreateCodeRelationRequest) SetBizLabels(v []*string) *CreateCodeRelationRequest {
	s.BizLabels = v
	return s
}

func (s *CreateCodeRelationRequest) SetUpChainFlag(v bool) *CreateCodeRelationRequest {
	s.UpChainFlag = &v
	return s
}

func (s *CreateCodeRelationRequest) SetContent(v string) *CreateCodeRelationRequest {
	s.Content = &v
	return s
}

type CreateCodeRelationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区块链上交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 绑定信息记录唯一标识
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty"`
}

func (s CreateCodeRelationResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateCodeRelationResponse) GoString() string {
	return s.String()
}

func (s *CreateCodeRelationResponse) SetReqMsgId(v string) *CreateCodeRelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateCodeRelationResponse) SetResultCode(v string) *CreateCodeRelationResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateCodeRelationResponse) SetResultMsg(v string) *CreateCodeRelationResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateCodeRelationResponse) SetTxHash(v string) *CreateCodeRelationResponse {
	s.TxHash = &v
	return s
}

func (s *CreateCodeRelationResponse) SetUniqueId(v string) *CreateCodeRelationResponse {
	s.UniqueId = &v
	return s
}

type DeleteCodeRelationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务类型
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 溯源码，代表该账户的唯一资源标识
	Code *string `json:"code,omitempty" xml:"code,omitempty" maxLength:"160" minLength:"1"`
	// 关联信息记录唯一标识
	//
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s DeleteCodeRelationRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteCodeRelationRequest) GoString() string {
	return s.String()
}

func (s *DeleteCodeRelationRequest) SetAuthToken(v string) *DeleteCodeRelationRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteCodeRelationRequest) SetProductInstanceId(v string) *DeleteCodeRelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteCodeRelationRequest) SetBizType(v string) *DeleteCodeRelationRequest {
	s.BizType = &v
	return s
}

func (s *DeleteCodeRelationRequest) SetCode(v string) *DeleteCodeRelationRequest {
	s.Code = &v
	return s
}

func (s *DeleteCodeRelationRequest) SetUniqueId(v string) *DeleteCodeRelationRequest {
	s.UniqueId = &v
	return s
}

type DeleteCodeRelationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteCodeRelationResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteCodeRelationResponse) GoString() string {
	return s.String()
}

func (s *DeleteCodeRelationResponse) SetReqMsgId(v string) *DeleteCodeRelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteCodeRelationResponse) SetResultCode(v string) *DeleteCodeRelationResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteCodeRelationResponse) SetResultMsg(v string) *DeleteCodeRelationResponse {
	s.ResultMsg = &v
	return s
}

type QueryCodeCombineRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务类型，客户自定义标签，做code数据隔离使用
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 溯源码，代表该账户的唯一资源标识
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true" maxLength:"160" minLength:"1"`
	// 页码,当且仅当pageNum=1时返回溯源码最新注册信息
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true" minimum:"1"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true" maximum:"200"`
	// 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
	BizLabels []*string `json:"biz_labels,omitempty" xml:"biz_labels,omitempty" type:"Repeated"`
	// 状态,客户自定义状态，用于过滤查询使用，只能由字符+数字构成，多个可以用"|"分隔
	Status *string `json:"status,omitempty" xml:"status,omitempty" maxLength:"256" minLength:"1"`
	// 是否递归查询，默认false, 最多递归5层
	//
	RecursionFlag *bool `json:"recursion_flag,omitempty" xml:"recursion_flag,omitempty"`
}

func (s QueryCodeCombineRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCodeCombineRequest) GoString() string {
	return s.String()
}

func (s *QueryCodeCombineRequest) SetAuthToken(v string) *QueryCodeCombineRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCodeCombineRequest) SetProductInstanceId(v string) *QueryCodeCombineRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCodeCombineRequest) SetBizType(v string) *QueryCodeCombineRequest {
	s.BizType = &v
	return s
}

func (s *QueryCodeCombineRequest) SetCode(v string) *QueryCodeCombineRequest {
	s.Code = &v
	return s
}

func (s *QueryCodeCombineRequest) SetPageNum(v int64) *QueryCodeCombineRequest {
	s.PageNum = &v
	return s
}

func (s *QueryCodeCombineRequest) SetPageSize(v int64) *QueryCodeCombineRequest {
	s.PageSize = &v
	return s
}

func (s *QueryCodeCombineRequest) SetBizLabels(v []*string) *QueryCodeCombineRequest {
	s.BizLabels = v
	return s
}

func (s *QueryCodeCombineRequest) SetStatus(v string) *QueryCodeCombineRequest {
	s.Status = &v
	return s
}

func (s *QueryCodeCombineRequest) SetRecursionFlag(v bool) *QueryCodeCombineRequest {
	s.RecursionFlag = &v
	return s
}

type QueryCodeCombineResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总数据量
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 注册码信息
	RegisterInfo *CodeRegisterInfo `json:"register_info,omitempty" xml:"register_info,omitempty"`
	// 关联信息
	RelationInfos []*CodeRelationInfo `json:"relation_infos,omitempty" xml:"relation_infos,omitempty" type:"Repeated"`
}

func (s QueryCodeCombineResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCodeCombineResponse) GoString() string {
	return s.String()
}

func (s *QueryCodeCombineResponse) SetReqMsgId(v string) *QueryCodeCombineResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCodeCombineResponse) SetResultCode(v string) *QueryCodeCombineResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCodeCombineResponse) SetResultMsg(v string) *QueryCodeCombineResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCodeCombineResponse) SetTotal(v int64) *QueryCodeCombineResponse {
	s.Total = &v
	return s
}

func (s *QueryCodeCombineResponse) SetRegisterInfo(v *CodeRegisterInfo) *QueryCodeCombineResponse {
	s.RegisterInfo = v
	return s
}

func (s *QueryCodeCombineResponse) SetRelationInfos(v []*CodeRelationInfo) *QueryCodeCombineResponse {
	s.RelationInfos = v
	return s
}

type QueryCodeRegistrationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务类型，客户自定义标签，做code数据隔离使用
	//
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 溯源码，代表该账户的唯一资源标识
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true" maxLength:"160" minLength:"1"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true" minimum:"1"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true" maximum:"200"`
	// 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
	BizLabels []*string `json:"biz_labels,omitempty" xml:"biz_labels,omitempty" type:"Repeated"`
	// 注册记录唯一标识
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty" maxLength:"64" minLength:"1"`
	// 状态,客户自定义状态，用于过滤查询使用。
	// 状态信息只能由字母+数字构成，多个状态可以用"|"分隔
	Status *string `json:"status,omitempty" xml:"status,omitempty" maxLength:"256" minLength:"1"`
	// 仅能取如下值范围：
	// 1. ASC     按注册时间升序
	// 2. DESC   按注册时间降序
	// 默认降序
	SortType *string `json:"sort_type,omitempty" xml:"sort_type,omitempty"`
}

func (s QueryCodeRegistrationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCodeRegistrationRequest) GoString() string {
	return s.String()
}

func (s *QueryCodeRegistrationRequest) SetAuthToken(v string) *QueryCodeRegistrationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCodeRegistrationRequest) SetProductInstanceId(v string) *QueryCodeRegistrationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCodeRegistrationRequest) SetBizType(v string) *QueryCodeRegistrationRequest {
	s.BizType = &v
	return s
}

func (s *QueryCodeRegistrationRequest) SetCode(v string) *QueryCodeRegistrationRequest {
	s.Code = &v
	return s
}

func (s *QueryCodeRegistrationRequest) SetPageNum(v int64) *QueryCodeRegistrationRequest {
	s.PageNum = &v
	return s
}

func (s *QueryCodeRegistrationRequest) SetPageSize(v int64) *QueryCodeRegistrationRequest {
	s.PageSize = &v
	return s
}

func (s *QueryCodeRegistrationRequest) SetBizLabels(v []*string) *QueryCodeRegistrationRequest {
	s.BizLabels = v
	return s
}

func (s *QueryCodeRegistrationRequest) SetUniqueId(v string) *QueryCodeRegistrationRequest {
	s.UniqueId = &v
	return s
}

func (s *QueryCodeRegistrationRequest) SetStatus(v string) *QueryCodeRegistrationRequest {
	s.Status = &v
	return s
}

func (s *QueryCodeRegistrationRequest) SetSortType(v string) *QueryCodeRegistrationRequest {
	s.SortType = &v
	return s
}

type QueryCodeRegistrationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总数据量
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 溯源码历史注册信息
	Data []*CodeRegisterInfo `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryCodeRegistrationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCodeRegistrationResponse) GoString() string {
	return s.String()
}

func (s *QueryCodeRegistrationResponse) SetReqMsgId(v string) *QueryCodeRegistrationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCodeRegistrationResponse) SetResultCode(v string) *QueryCodeRegistrationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCodeRegistrationResponse) SetResultMsg(v string) *QueryCodeRegistrationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCodeRegistrationResponse) SetTotal(v int64) *QueryCodeRegistrationResponse {
	s.Total = &v
	return s
}

func (s *QueryCodeRegistrationResponse) SetData(v []*CodeRegisterInfo) *QueryCodeRegistrationResponse {
	s.Data = v
	return s
}

type QueryCodeRelationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务类型，客户自定义标签，做code数据隔离使用
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 溯源码，代表该账户的唯一资源标识
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true" maxLength:"160" minLength:"1"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true" minimum:"1"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true" maximum:"200"`
	// 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
	BizLabels []*string `json:"biz_labels,omitempty" xml:"biz_labels,omitempty" type:"Repeated"`
	// 绑定信息记录唯一标识
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty" maxLength:"64" minLength:"1"`
	// 状态,客户自定义状态，用于过滤查询使用，只能由字符+数字构成，多个可以用"|"分隔
	Status *string `json:"status,omitempty" xml:"status,omitempty" maxLength:"256" minLength:"1"`
	// 仅能取如下值范围： 1. ASC 按注册时间升序 2. DESC 按注册时间降序 默认降序
	SortType *string `json:"sort_type,omitempty" xml:"sort_type,omitempty"`
}

func (s QueryCodeRelationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCodeRelationRequest) GoString() string {
	return s.String()
}

func (s *QueryCodeRelationRequest) SetAuthToken(v string) *QueryCodeRelationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCodeRelationRequest) SetProductInstanceId(v string) *QueryCodeRelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCodeRelationRequest) SetBizType(v string) *QueryCodeRelationRequest {
	s.BizType = &v
	return s
}

func (s *QueryCodeRelationRequest) SetCode(v string) *QueryCodeRelationRequest {
	s.Code = &v
	return s
}

func (s *QueryCodeRelationRequest) SetPageNum(v int64) *QueryCodeRelationRequest {
	s.PageNum = &v
	return s
}

func (s *QueryCodeRelationRequest) SetPageSize(v int64) *QueryCodeRelationRequest {
	s.PageSize = &v
	return s
}

func (s *QueryCodeRelationRequest) SetBizLabels(v []*string) *QueryCodeRelationRequest {
	s.BizLabels = v
	return s
}

func (s *QueryCodeRelationRequest) SetUniqueId(v string) *QueryCodeRelationRequest {
	s.UniqueId = &v
	return s
}

func (s *QueryCodeRelationRequest) SetStatus(v string) *QueryCodeRelationRequest {
	s.Status = &v
	return s
}

func (s *QueryCodeRelationRequest) SetSortType(v string) *QueryCodeRelationRequest {
	s.SortType = &v
	return s
}

type QueryCodeRelationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总历史记录条数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 溯源码关联信息列表
	Data []*CodeRelationInfo `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryCodeRelationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCodeRelationResponse) GoString() string {
	return s.String()
}

func (s *QueryCodeRelationResponse) SetReqMsgId(v string) *QueryCodeRelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCodeRelationResponse) SetResultCode(v string) *QueryCodeRelationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCodeRelationResponse) SetResultMsg(v string) *QueryCodeRelationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCodeRelationResponse) SetTotal(v int64) *QueryCodeRelationResponse {
	s.Total = &v
	return s
}

func (s *QueryCodeRelationResponse) SetData(v []*CodeRelationInfo) *QueryCodeRelationResponse {
	s.Data = v
	return s
}

type AddCodeDepositRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务类型，客户自定义标签
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 存证内容
	//
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
	BizLabels []*string `json:"biz_labels,omitempty" xml:"biz_labels,omitempty" type:"Repeated"`
}

func (s AddCodeDepositRequest) String() string {
	return tea.Prettify(s)
}

func (s AddCodeDepositRequest) GoString() string {
	return s.String()
}

func (s *AddCodeDepositRequest) SetAuthToken(v string) *AddCodeDepositRequest {
	s.AuthToken = &v
	return s
}

func (s *AddCodeDepositRequest) SetProductInstanceId(v string) *AddCodeDepositRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddCodeDepositRequest) SetBizType(v string) *AddCodeDepositRequest {
	s.BizType = &v
	return s
}

func (s *AddCodeDepositRequest) SetContent(v string) *AddCodeDepositRequest {
	s.Content = &v
	return s
}

func (s *AddCodeDepositRequest) SetBizLabels(v []*string) *AddCodeDepositRequest {
	s.BizLabels = v
	return s
}

type AddCodeDepositResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区块链上交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 注册记录唯一标识
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty"`
}

func (s AddCodeDepositResponse) String() string {
	return tea.Prettify(s)
}

func (s AddCodeDepositResponse) GoString() string {
	return s.String()
}

func (s *AddCodeDepositResponse) SetReqMsgId(v string) *AddCodeDepositResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddCodeDepositResponse) SetResultCode(v string) *AddCodeDepositResponse {
	s.ResultCode = &v
	return s
}

func (s *AddCodeDepositResponse) SetResultMsg(v string) *AddCodeDepositResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddCodeDepositResponse) SetTxHash(v string) *AddCodeDepositResponse {
	s.TxHash = &v
	return s
}

func (s *AddCodeDepositResponse) SetUniqueId(v string) *AddCodeDepositResponse {
	s.UniqueId = &v
	return s
}

type QueryCodeCertRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务类型，客户自定义标签，做code数据隔离使用
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 区块链上交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 是否展示交易具体内容，默认false
	ContentFlag *bool `json:"content_flag,omitempty" xml:"content_flag,omitempty"`
}

func (s QueryCodeCertRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCodeCertRequest) GoString() string {
	return s.String()
}

func (s *QueryCodeCertRequest) SetAuthToken(v string) *QueryCodeCertRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCodeCertRequest) SetProductInstanceId(v string) *QueryCodeCertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCodeCertRequest) SetBizType(v string) *QueryCodeCertRequest {
	s.BizType = &v
	return s
}

func (s *QueryCodeCertRequest) SetTxHash(v string) *QueryCodeCertRequest {
	s.TxHash = &v
	return s
}

func (s *QueryCodeCertRequest) SetContentFlag(v bool) *QueryCodeCertRequest {
	s.ContentFlag = &v
	return s
}

type QueryCodeCertResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证内容。
	// 在注册溯源码、溯源码关联信息等接口调用情况下，上链内容会包装加密后上链。
	// 因此返回内容不可读，需要按照指定要求解密读取。
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 链交易信息
	ChainTransactionInfo *BlockChainTransactionInfo `json:"chain_transaction_info,omitempty" xml:"chain_transaction_info,omitempty"`
}

func (s QueryCodeCertResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCodeCertResponse) GoString() string {
	return s.String()
}

func (s *QueryCodeCertResponse) SetReqMsgId(v string) *QueryCodeCertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCodeCertResponse) SetResultCode(v string) *QueryCodeCertResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCodeCertResponse) SetResultMsg(v string) *QueryCodeCertResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCodeCertResponse) SetContent(v string) *QueryCodeCertResponse {
	s.Content = &v
	return s
}

func (s *QueryCodeCertResponse) SetChainTransactionInfo(v *BlockChainTransactionInfo) *QueryCodeCertResponse {
	s.ChainTransactionInfo = v
	return s
}

type QueryCodeStatRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务类型，客户自定义标签
	//
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 开始时间
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 截止时间
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 支持以下查询维度：
	// REGISTRATION  注册码统计
	// RELATION  关联码信息统计
	// DEPOSIT    存证信息统计
	CodeType *string `json:"code_type,omitempty" xml:"code_type,omitempty" maxLength:"32" minLength:"1"`
	// 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
	BizLabels []*string `json:"biz_labels,omitempty" xml:"biz_labels,omitempty" type:"Repeated"`
}

func (s QueryCodeStatRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCodeStatRequest) GoString() string {
	return s.String()
}

func (s *QueryCodeStatRequest) SetAuthToken(v string) *QueryCodeStatRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCodeStatRequest) SetProductInstanceId(v string) *QueryCodeStatRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCodeStatRequest) SetBizType(v string) *QueryCodeStatRequest {
	s.BizType = &v
	return s
}

func (s *QueryCodeStatRequest) SetStartTime(v int64) *QueryCodeStatRequest {
	s.StartTime = &v
	return s
}

func (s *QueryCodeStatRequest) SetEndTime(v int64) *QueryCodeStatRequest {
	s.EndTime = &v
	return s
}

func (s *QueryCodeStatRequest) SetCodeType(v string) *QueryCodeStatRequest {
	s.CodeType = &v
	return s
}

func (s *QueryCodeStatRequest) SetBizLabels(v []*string) *QueryCodeStatRequest {
	s.BizLabels = v
	return s
}

type QueryCodeStatResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 上链交易量
	TransactionSize *int64 `json:"transaction_size,omitempty" xml:"transaction_size,omitempty"`
	// 上链总数据存储容量占用
	ChainCapacity *int64 `json:"chain_capacity,omitempty" xml:"chain_capacity,omitempty"`
	// 记录条数，包括上链和未上链的总数据条数
	RecordSize *int64 `json:"record_size,omitempty" xml:"record_size,omitempty"`
	// 对重复操作仅做一次记录的数据统计量。eg: 实际溯源码注册量，实际绑定信息的数据量。
	ValidSize *int64 `json:"valid_size,omitempty" xml:"valid_size,omitempty"`
}

func (s QueryCodeStatResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCodeStatResponse) GoString() string {
	return s.String()
}

func (s *QueryCodeStatResponse) SetReqMsgId(v string) *QueryCodeStatResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCodeStatResponse) SetResultCode(v string) *QueryCodeStatResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCodeStatResponse) SetResultMsg(v string) *QueryCodeStatResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCodeStatResponse) SetTransactionSize(v int64) *QueryCodeStatResponse {
	s.TransactionSize = &v
	return s
}

func (s *QueryCodeStatResponse) SetChainCapacity(v int64) *QueryCodeStatResponse {
	s.ChainCapacity = &v
	return s
}

func (s *QueryCodeStatResponse) SetRecordSize(v int64) *QueryCodeStatResponse {
	s.RecordSize = &v
	return s
}

func (s *QueryCodeStatResponse) SetValidSize(v int64) *QueryCodeStatResponse {
	s.ValidSize = &v
	return s
}

type AddCodeRegistrationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务类型，客户自定义标签，做code数据隔离使用
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 溯源码，代表该账户的唯一资源标识
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true" maxLength:"160" minLength:"1"`
	// 状态,客户自定义状态，用于过滤查询使用。只能由字符+数字构成
	//
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
	BizLabels []*string `json:"biz_labels,omitempty" xml:"biz_labels,omitempty" type:"Repeated"`
	// 注册内容
	//
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 关联溯源码列表。最多200条关联码，关联码格式要求和溯源码要求一致。 可以通过接口查询关联溯源码绑定的信息。
	RelationCodes []*string `json:"relation_codes,omitempty" xml:"relation_codes,omitempty" type:"Repeated"`
	// 关联溯源码递归检查，检查最多5层。默认NO_CHECK。枚举值如下，
	// NO_CHECK: 不做递归检查;
	// TREE_CHECK: 树结构检查;
	// DAG_CHECK: 有向无环图检查;
	RecursionType *string `json:"recursion_type,omitempty" xml:"recursion_type,omitempty" maxLength:"32" minLength:"1"`
	// 是否上链，默认true。 为false时，仅做DB数据保存不上链。 若content数据大小超过要求限制，仅会保存content的hash值上链
	UpChainFlag *bool `json:"up_chain_flag,omitempty" xml:"up_chain_flag,omitempty"`
}

func (s AddCodeRegistrationRequest) String() string {
	return tea.Prettify(s)
}

func (s AddCodeRegistrationRequest) GoString() string {
	return s.String()
}

func (s *AddCodeRegistrationRequest) SetAuthToken(v string) *AddCodeRegistrationRequest {
	s.AuthToken = &v
	return s
}

func (s *AddCodeRegistrationRequest) SetProductInstanceId(v string) *AddCodeRegistrationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddCodeRegistrationRequest) SetBizType(v string) *AddCodeRegistrationRequest {
	s.BizType = &v
	return s
}

func (s *AddCodeRegistrationRequest) SetCode(v string) *AddCodeRegistrationRequest {
	s.Code = &v
	return s
}

func (s *AddCodeRegistrationRequest) SetStatus(v string) *AddCodeRegistrationRequest {
	s.Status = &v
	return s
}

func (s *AddCodeRegistrationRequest) SetBizLabels(v []*string) *AddCodeRegistrationRequest {
	s.BizLabels = v
	return s
}

func (s *AddCodeRegistrationRequest) SetContent(v string) *AddCodeRegistrationRequest {
	s.Content = &v
	return s
}

func (s *AddCodeRegistrationRequest) SetRelationCodes(v []*string) *AddCodeRegistrationRequest {
	s.RelationCodes = v
	return s
}

func (s *AddCodeRegistrationRequest) SetRecursionType(v string) *AddCodeRegistrationRequest {
	s.RecursionType = &v
	return s
}

func (s *AddCodeRegistrationRequest) SetUpChainFlag(v bool) *AddCodeRegistrationRequest {
	s.UpChainFlag = &v
	return s
}

type AddCodeRegistrationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区块链上交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 注册记录唯一标识
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty"`
}

func (s AddCodeRegistrationResponse) String() string {
	return tea.Prettify(s)
}

func (s AddCodeRegistrationResponse) GoString() string {
	return s.String()
}

func (s *AddCodeRegistrationResponse) SetReqMsgId(v string) *AddCodeRegistrationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddCodeRegistrationResponse) SetResultCode(v string) *AddCodeRegistrationResponse {
	s.ResultCode = &v
	return s
}

func (s *AddCodeRegistrationResponse) SetResultMsg(v string) *AddCodeRegistrationResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddCodeRegistrationResponse) SetTxHash(v string) *AddCodeRegistrationResponse {
	s.TxHash = &v
	return s
}

func (s *AddCodeRegistrationResponse) SetUniqueId(v string) *AddCodeRegistrationResponse {
	s.UniqueId = &v
	return s
}

type UpdateCodeRegistrationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务类型，客户自定义标签，做code数据隔离使用
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 溯源码，代表该账户的唯一资源标识。该字段不更新，仅做过滤使用。
	Code *string `json:"code,omitempty" xml:"code,omitempty" maxLength:"160" minLength:"1"`
	// 注册记录唯一标识
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 状态,客户自定义状态，用于过滤查询使用。只能由字符+数字构成
	Status *string `json:"status,omitempty" xml:"status,omitempty" maxLength:"32" minLength:"1"`
	// 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64。
	// 若已上链，则不可更新该信息。
	BizLabels []*string `json:"biz_labels,omitempty" xml:"biz_labels,omitempty" type:"Repeated"`
	// 注册内容。若已上链，则不可更新该信息。
	//
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 关联溯源码列表。最多200条关联码，关联码格式要求和溯源码要求一致。 可以通过接口查询关联溯源码绑定的信息。若已上链，则不可更新该信息。
	RelationCodes []*string `json:"relation_codes,omitempty" xml:"relation_codes,omitempty" type:"Repeated"`
	// 关联溯源码递归检查，检查最多5层。默认NO_CHECK。枚举值如下，
	// NO_CHECK: 不做递归检查;
	// TREE_CHECK: 树结构检查;
	// DAG_CHECK: 有向无环图检查;
	RecursionType *string `json:"recursion_type,omitempty" xml:"recursion_type,omitempty" maxLength:"32" minLength:"1"`
	// 是否上链，默认true。 为false时，仅做DB数据保存不上链。 若content数据大小超过要求限制，仅会保存content的hash值上链
	UpChainFlag *bool `json:"up_chain_flag,omitempty" xml:"up_chain_flag,omitempty"`
}

func (s UpdateCodeRegistrationRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateCodeRegistrationRequest) GoString() string {
	return s.String()
}

func (s *UpdateCodeRegistrationRequest) SetAuthToken(v string) *UpdateCodeRegistrationRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateCodeRegistrationRequest) SetProductInstanceId(v string) *UpdateCodeRegistrationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateCodeRegistrationRequest) SetBizType(v string) *UpdateCodeRegistrationRequest {
	s.BizType = &v
	return s
}

func (s *UpdateCodeRegistrationRequest) SetCode(v string) *UpdateCodeRegistrationRequest {
	s.Code = &v
	return s
}

func (s *UpdateCodeRegistrationRequest) SetUniqueId(v string) *UpdateCodeRegistrationRequest {
	s.UniqueId = &v
	return s
}

func (s *UpdateCodeRegistrationRequest) SetStatus(v string) *UpdateCodeRegistrationRequest {
	s.Status = &v
	return s
}

func (s *UpdateCodeRegistrationRequest) SetBizLabels(v []*string) *UpdateCodeRegistrationRequest {
	s.BizLabels = v
	return s
}

func (s *UpdateCodeRegistrationRequest) SetContent(v string) *UpdateCodeRegistrationRequest {
	s.Content = &v
	return s
}

func (s *UpdateCodeRegistrationRequest) SetRelationCodes(v []*string) *UpdateCodeRegistrationRequest {
	s.RelationCodes = v
	return s
}

func (s *UpdateCodeRegistrationRequest) SetRecursionType(v string) *UpdateCodeRegistrationRequest {
	s.RecursionType = &v
	return s
}

func (s *UpdateCodeRegistrationRequest) SetUpChainFlag(v bool) *UpdateCodeRegistrationRequest {
	s.UpChainFlag = &v
	return s
}

type UpdateCodeRegistrationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区块链上交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s UpdateCodeRegistrationResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateCodeRegistrationResponse) GoString() string {
	return s.String()
}

func (s *UpdateCodeRegistrationResponse) SetReqMsgId(v string) *UpdateCodeRegistrationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateCodeRegistrationResponse) SetResultCode(v string) *UpdateCodeRegistrationResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateCodeRegistrationResponse) SetResultMsg(v string) *UpdateCodeRegistrationResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateCodeRegistrationResponse) SetTxHash(v string) *UpdateCodeRegistrationResponse {
	s.TxHash = &v
	return s
}

type AddCodeRelationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务类型，客户自定义标签，做code数据隔离使用
	//
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 溯源码，代表该账户的唯一资源标识
	//
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true" maxLength:"160" minLength:"1"`
	// 状态,客户自定义状态，用于过滤查询使用。只能由字符+数字构成
	//
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
	BizLabels []*string `json:"biz_labels,omitempty" xml:"biz_labels,omitempty" type:"Repeated"`
	// 是否上链，默认true。 为false时，仅做DB数据保存不上链。 若content数据大小超过要求限制，仅会保存content的hash值上链
	UpChainFlag *bool `json:"up_chain_flag,omitempty" xml:"up_chain_flag,omitempty"`
	// 关联内容
	//
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
}

func (s AddCodeRelationRequest) String() string {
	return tea.Prettify(s)
}

func (s AddCodeRelationRequest) GoString() string {
	return s.String()
}

func (s *AddCodeRelationRequest) SetAuthToken(v string) *AddCodeRelationRequest {
	s.AuthToken = &v
	return s
}

func (s *AddCodeRelationRequest) SetProductInstanceId(v string) *AddCodeRelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddCodeRelationRequest) SetBizType(v string) *AddCodeRelationRequest {
	s.BizType = &v
	return s
}

func (s *AddCodeRelationRequest) SetCode(v string) *AddCodeRelationRequest {
	s.Code = &v
	return s
}

func (s *AddCodeRelationRequest) SetStatus(v string) *AddCodeRelationRequest {
	s.Status = &v
	return s
}

func (s *AddCodeRelationRequest) SetBizLabels(v []*string) *AddCodeRelationRequest {
	s.BizLabels = v
	return s
}

func (s *AddCodeRelationRequest) SetUpChainFlag(v bool) *AddCodeRelationRequest {
	s.UpChainFlag = &v
	return s
}

func (s *AddCodeRelationRequest) SetContent(v string) *AddCodeRelationRequest {
	s.Content = &v
	return s
}

type AddCodeRelationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区块链上交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 绑定信息记录唯一标识
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty"`
}

func (s AddCodeRelationResponse) String() string {
	return tea.Prettify(s)
}

func (s AddCodeRelationResponse) GoString() string {
	return s.String()
}

func (s *AddCodeRelationResponse) SetReqMsgId(v string) *AddCodeRelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddCodeRelationResponse) SetResultCode(v string) *AddCodeRelationResponse {
	s.ResultCode = &v
	return s
}

func (s *AddCodeRelationResponse) SetResultMsg(v string) *AddCodeRelationResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddCodeRelationResponse) SetTxHash(v string) *AddCodeRelationResponse {
	s.TxHash = &v
	return s
}

func (s *AddCodeRelationResponse) SetUniqueId(v string) *AddCodeRelationResponse {
	s.UniqueId = &v
	return s
}

type UpdateCodeRelationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务类型，客户自定义标签，做code数据隔离使用
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 溯源码，代表该账户的唯一资源标识
	//
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true" maxLength:"160" minLength:"1"`
	// 绑定信息记录唯一标识
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 状态,客户自定义状态，用于过滤查询使用。只能由字符+数字构成
	Status *string `json:"status,omitempty" xml:"status,omitempty" maxLength:"32" minLength:"1"`
	// 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64。若已上链，则不可更新该信息。
	BizLabels []*string `json:"biz_labels,omitempty" xml:"biz_labels,omitempty" type:"Repeated"`
	// 是否上链，默认true。 为false时，仅做DB数据保存不上链。 若content数据大小超过要求限制，仅会保存content的hash值上链
	UpChainFlag *bool `json:"up_chain_flag,omitempty" xml:"up_chain_flag,omitempty"`
	// 关联信息内容。若已上链，则不可更新该信息。
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
}

func (s UpdateCodeRelationRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateCodeRelationRequest) GoString() string {
	return s.String()
}

func (s *UpdateCodeRelationRequest) SetAuthToken(v string) *UpdateCodeRelationRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateCodeRelationRequest) SetProductInstanceId(v string) *UpdateCodeRelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateCodeRelationRequest) SetBizType(v string) *UpdateCodeRelationRequest {
	s.BizType = &v
	return s
}

func (s *UpdateCodeRelationRequest) SetCode(v string) *UpdateCodeRelationRequest {
	s.Code = &v
	return s
}

func (s *UpdateCodeRelationRequest) SetUniqueId(v string) *UpdateCodeRelationRequest {
	s.UniqueId = &v
	return s
}

func (s *UpdateCodeRelationRequest) SetStatus(v string) *UpdateCodeRelationRequest {
	s.Status = &v
	return s
}

func (s *UpdateCodeRelationRequest) SetBizLabels(v []*string) *UpdateCodeRelationRequest {
	s.BizLabels = v
	return s
}

func (s *UpdateCodeRelationRequest) SetUpChainFlag(v bool) *UpdateCodeRelationRequest {
	s.UpChainFlag = &v
	return s
}

func (s *UpdateCodeRelationRequest) SetContent(v string) *UpdateCodeRelationRequest {
	s.Content = &v
	return s
}

type UpdateCodeRelationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateCodeRelationResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateCodeRelationResponse) GoString() string {
	return s.String()
}

func (s *UpdateCodeRelationResponse) SetReqMsgId(v string) *UpdateCodeRelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateCodeRelationResponse) SetResultCode(v string) *UpdateCodeRelationResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateCodeRelationResponse) SetResultMsg(v string) *UpdateCodeRelationResponse {
	s.ResultMsg = &v
	return s
}

type QueryMiniCodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 溯源码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true" maxLength:"160"`
	// 用户信息
	UserInfo *ScanUserInfo `json:"user_info,omitempty" xml:"user_info,omitempty"`
}

func (s QueryMiniCodeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMiniCodeRequest) GoString() string {
	return s.String()
}

func (s *QueryMiniCodeRequest) SetAuthToken(v string) *QueryMiniCodeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMiniCodeRequest) SetProductInstanceId(v string) *QueryMiniCodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMiniCodeRequest) SetCode(v string) *QueryMiniCodeRequest {
	s.Code = &v
	return s
}

func (s *QueryMiniCodeRequest) SetUserInfo(v *ScanUserInfo) *QueryMiniCodeRequest {
	s.UserInfo = v
	return s
}

type QueryMiniCodeResponse struct {
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

func (s QueryMiniCodeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMiniCodeResponse) GoString() string {
	return s.String()
}

func (s *QueryMiniCodeResponse) SetReqMsgId(v string) *QueryMiniCodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMiniCodeResponse) SetResultCode(v string) *QueryMiniCodeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMiniCodeResponse) SetResultMsg(v string) *QueryMiniCodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMiniCodeResponse) SetScanInfo(v *ScanHeadInfo) *QueryMiniCodeResponse {
	s.ScanInfo = v
	return s
}

func (s *QueryMiniCodeResponse) SetPhaseInfos(v []*PhaseInfo) *QueryMiniCodeResponse {
	s.PhaseInfos = v
	return s
}

type QueryMiniCertRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 溯源码信息
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true" maxLength:"160"`
	// 交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true" maxLength:"64"`
}

func (s QueryMiniCertRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMiniCertRequest) GoString() string {
	return s.String()
}

func (s *QueryMiniCertRequest) SetAuthToken(v string) *QueryMiniCertRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMiniCertRequest) SetProductInstanceId(v string) *QueryMiniCertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMiniCertRequest) SetCode(v string) *QueryMiniCertRequest {
	s.Code = &v
	return s
}

func (s *QueryMiniCertRequest) SetTxHash(v string) *QueryMiniCertRequest {
	s.TxHash = &v
	return s
}

type QueryMiniCertResponse struct {
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

func (s QueryMiniCertResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMiniCertResponse) GoString() string {
	return s.String()
}

func (s *QueryMiniCertResponse) SetReqMsgId(v string) *QueryMiniCertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMiniCertResponse) SetResultCode(v string) *QueryMiniCertResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMiniCertResponse) SetResultMsg(v string) *QueryMiniCertResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMiniCertResponse) SetBlockInfo(v *BlockInfo) *QueryMiniCertResponse {
	s.BlockInfo = v
	return s
}

func (s *QueryMiniCertResponse) SetUploadInfo(v *UploaderInfo) *QueryMiniCertResponse {
	s.UploadInfo = v
	return s
}

type VerifyMiniNfcRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 动态秘钥字符串信息
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true" maxLength:"160"`
	// NFC UID
	Uid *string `json:"uid,omitempty" xml:"uid,omitempty"`
}

func (s VerifyMiniNfcRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyMiniNfcRequest) GoString() string {
	return s.String()
}

func (s *VerifyMiniNfcRequest) SetAuthToken(v string) *VerifyMiniNfcRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyMiniNfcRequest) SetProductInstanceId(v string) *VerifyMiniNfcRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyMiniNfcRequest) SetCode(v string) *VerifyMiniNfcRequest {
	s.Code = &v
	return s
}

func (s *VerifyMiniNfcRequest) SetUid(v string) *VerifyMiniNfcRequest {
	s.Uid = &v
	return s
}

type VerifyMiniNfcResponse struct {
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

func (s VerifyMiniNfcResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyMiniNfcResponse) GoString() string {
	return s.String()
}

func (s *VerifyMiniNfcResponse) SetReqMsgId(v string) *VerifyMiniNfcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyMiniNfcResponse) SetResultCode(v string) *VerifyMiniNfcResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyMiniNfcResponse) SetResultMsg(v string) *VerifyMiniNfcResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyMiniNfcResponse) SetStatus(v string) *VerifyMiniNfcResponse {
	s.Status = &v
	return s
}

func (s *VerifyMiniNfcResponse) SetMessage(v string) *VerifyMiniNfcResponse {
	s.Message = &v
	return s
}

func (s *VerifyMiniNfcResponse) SetCode(v string) *VerifyMiniNfcResponse {
	s.Code = &v
	return s
}

func (s *VerifyMiniNfcResponse) SetUid(v string) *VerifyMiniNfcResponse {
	s.Uid = &v
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
				"sdk_version":      tea.String("1.2.5"),
				"_prod_code":       tea.String("MYTC"),
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
 * Description: 主要用于二维码防伪识别，内部集成安创的二维码验真能力。
 * Summary: 二维码防伪识别
 */
func (client *Client) RecognizeAntiQrcodeac(request *RecognizeAntiQrcodeacRequest) (_result *RecognizeAntiQrcodeacResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RecognizeAntiQrcodeacResponse{}
	_body, _err := client.RecognizeAntiQrcodeacEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 主要用于二维码防伪识别，内部集成安创的二维码验真能力。
 * Summary: 二维码防伪识别
 */
func (client *Client) RecognizeAntiQrcodeacEx(request *RecognizeAntiQrcodeacRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RecognizeAntiQrcodeacResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.mytc.anti.qrcodeac.recognize"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			recognizeAntiQrcodeacResponse := &RecognizeAntiQrcodeacResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = recognizeAntiQrcodeacResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RecognizeAntiQrcodeacResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mytc.anti.qrcodeac.recognize"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 防伪码平台防伪底图上传，初始化上传记录
 * Summary: 防伪码平台防伪底图上传初始化
 */
func (client *Client) InitAntiImagesync(request *InitAntiImagesyncRequest) (_result *InitAntiImagesyncResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitAntiImagesyncResponse{}
	_body, _err := client.InitAntiImagesyncEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 防伪码平台防伪底图上传，初始化上传记录
 * Summary: 防伪码平台防伪底图上传初始化
 */
func (client *Client) InitAntiImagesyncEx(request *InitAntiImagesyncRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitAntiImagesyncResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitAntiImagesyncResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mytc.anti.imagesync.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 防伪码图片上传
 * Summary: 防伪码平台防伪码图片上传
 */
func (client *Client) UploadAntiImagesync(request *UploadAntiImagesyncRequest) (_result *UploadAntiImagesyncResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadAntiImagesyncResponse{}
	_body, _err := client.UploadAntiImagesyncEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 防伪码图片上传
 * Summary: 防伪码平台防伪码图片上传
 */
func (client *Client) UploadAntiImagesyncEx(request *UploadAntiImagesyncRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadAntiImagesyncResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.mytc.anti.imagesync.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadAntiImagesyncResponse := &UploadAntiImagesyncResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadAntiImagesyncResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadAntiImagesyncResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mytc.anti.imagesync.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 防伪码平台防伪底图上传完成
 * Summary: 防伪码平台防伪底图上传完成
 */
func (client *Client) FinishAntiImagesync(request *FinishAntiImagesyncRequest) (_result *FinishAntiImagesyncResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &FinishAntiImagesyncResponse{}
	_body, _err := client.FinishAntiImagesyncEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 防伪码平台防伪底图上传完成
 * Summary: 防伪码平台防伪底图上传完成
 */
func (client *Client) FinishAntiImagesyncEx(request *FinishAntiImagesyncRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *FinishAntiImagesyncResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &FinishAntiImagesyncResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mytc.anti.imagesync.finish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 自研二维码生成
 * Summary: 二维码防伪图片生成
 */
func (client *Client) CreateAntiQrcodeimage(request *CreateAntiQrcodeimageRequest) (_result *CreateAntiQrcodeimageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAntiQrcodeimageResponse{}
	_body, _err := client.CreateAntiQrcodeimageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 自研二维码生成
 * Summary: 二维码防伪图片生成
 */
func (client *Client) CreateAntiQrcodeimageEx(request *CreateAntiQrcodeimageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAntiQrcodeimageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAntiQrcodeimageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mytc.anti.qrcodeimage.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 溯源码注册, 会根据bizType+code确定唯一一条记录信息。
主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
 * Summary: 溯源码注册
*/
func (client *Client) CreateCodeRegistration(request *CreateCodeRegistrationRequest) (_result *CreateCodeRegistrationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateCodeRegistrationResponse{}
	_body, _err := client.CreateCodeRegistrationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 溯源码注册, 会根据bizType+code确定唯一一条记录信息。
主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
 * Summary: 溯源码注册
*/
func (client *Client) CreateCodeRegistrationEx(request *CreateCodeRegistrationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateCodeRegistrationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateCodeRegistrationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mytc.code.registration.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 若溯源码注册的最新记录未上链，则可以被删除。若删除后，通过antchain.mytc.code.combine.query接口不能查询到相关码注册记录
 * Summary: 溯源码注册记录删除
 */
func (client *Client) DeleteCodeRegistration(request *DeleteCodeRegistrationRequest) (_result *DeleteCodeRegistrationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteCodeRegistrationResponse{}
	_body, _err := client.DeleteCodeRegistrationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 若溯源码注册的最新记录未上链，则可以被删除。若删除后，通过antchain.mytc.code.combine.query接口不能查询到相关码注册记录
 * Summary: 溯源码注册记录删除
 */
func (client *Client) DeleteCodeRegistrationEx(request *DeleteCodeRegistrationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteCodeRegistrationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteCodeRegistrationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mytc.code.registration.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 将关联信息绑定到溯源码上。
该接口调用存在以下业务维度限制：
1. code + bizLables + bizType做唯一性判断。


 * Summary: 溯源码关联信息
*/
func (client *Client) CreateCodeRelation(request *CreateCodeRelationRequest) (_result *CreateCodeRelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateCodeRelationResponse{}
	_body, _err := client.CreateCodeRelationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 将关联信息绑定到溯源码上。
该接口调用存在以下业务维度限制：
1. code + bizLables + bizType做唯一性判断。


 * Summary: 溯源码关联信息
*/
func (client *Client) CreateCodeRelationEx(request *CreateCodeRelationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateCodeRelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateCodeRelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mytc.code.relation.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 仅未上链的码关联信息可以被删除。仅删除code,bizType,bizSub1,bizSub2,bizSub3全部匹配的未上链的关联信息。
若删除后，通过antchain.mytc.code.combine.query接口不能查询到该码关联记录。
 * Summary: 溯源码关联信息删除
*/
func (client *Client) DeleteCodeRelation(request *DeleteCodeRelationRequest) (_result *DeleteCodeRelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteCodeRelationResponse{}
	_body, _err := client.DeleteCodeRelationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 仅未上链的码关联信息可以被删除。仅删除code,bizType,bizSub1,bizSub2,bizSub3全部匹配的未上链的关联信息。
若删除后，通过antchain.mytc.code.combine.query接口不能查询到该码关联记录。
 * Summary: 溯源码关联信息删除
*/
func (client *Client) DeleteCodeRelationEx(request *DeleteCodeRelationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteCodeRelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteCodeRelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mytc.code.relation.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询当前账户下的溯源码信息。
会查询最新的溯源码注册信息，以及各个业务维度的最新关联信息列表。

 * Summary: 溯源码查询
*/
func (client *Client) QueryCodeCombine(request *QueryCodeCombineRequest) (_result *QueryCodeCombineResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCodeCombineResponse{}
	_body, _err := client.QueryCodeCombineEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询当前账户下的溯源码信息。
会查询最新的溯源码注册信息，以及各个业务维度的最新关联信息列表。

 * Summary: 溯源码查询
*/
func (client *Client) QueryCodeCombineEx(request *QueryCodeCombineRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCodeCombineResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCodeCombineResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mytc.code.combine.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 溯源码注册历史查询
 * Summary: 溯源码注册历史查询
 */
func (client *Client) QueryCodeRegistration(request *QueryCodeRegistrationRequest) (_result *QueryCodeRegistrationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCodeRegistrationResponse{}
	_body, _err := client.QueryCodeRegistrationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 溯源码注册历史查询
 * Summary: 溯源码注册历史查询
 */
func (client *Client) QueryCodeRegistrationEx(request *QueryCodeRegistrationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCodeRegistrationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCodeRegistrationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mytc.code.registration.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 溯源码关联历史信息查询
 * Summary: 溯源码关联历史信息查询
 */
func (client *Client) QueryCodeRelation(request *QueryCodeRelationRequest) (_result *QueryCodeRelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCodeRelationResponse{}
	_body, _err := client.QueryCodeRelationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 溯源码关联历史信息查询
 * Summary: 溯源码关联历史信息查询
 */
func (client *Client) QueryCodeRelationEx(request *QueryCodeRelationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCodeRelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCodeRelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mytc.code.relation.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 1. 原生存证，交易内容上链存证，返回链上唯一交易哈希。
2. 存证内容超过链上限制仅会将存证内容hash值上链。
 * Summary: 原生存证
*/
func (client *Client) AddCodeDeposit(request *AddCodeDepositRequest) (_result *AddCodeDepositResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddCodeDepositResponse{}
	_body, _err := client.AddCodeDepositEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 1. 原生存证，交易内容上链存证，返回链上唯一交易哈希。
2. 存证内容超过链上限制仅会将存证内容hash值上链。
 * Summary: 原生存证
*/
func (client *Client) AddCodeDepositEx(request *AddCodeDepositRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddCodeDepositResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddCodeDepositResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mytc.code.deposit.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 链上交易详情查询
 * Summary: 链上交易证书查询
 */
func (client *Client) QueryCodeCert(request *QueryCodeCertRequest) (_result *QueryCodeCertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCodeCertResponse{}
	_body, _err := client.QueryCodeCertEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 链上交易详情查询
 * Summary: 链上交易证书查询
 */
func (client *Client) QueryCodeCertEx(request *QueryCodeCertRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCodeCertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCodeCertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mytc.code.cert.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 溯源统计信息查询，不填写starTime和endTime会查询全量注册信息。
若填写starTime和endTime，统计时间范围不能超过7天。
 * Summary: 溯源统计信息查询
*/
func (client *Client) QueryCodeStat(request *QueryCodeStatRequest) (_result *QueryCodeStatResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCodeStatResponse{}
	_body, _err := client.QueryCodeStatEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 溯源统计信息查询，不填写starTime和endTime会查询全量注册信息。
若填写starTime和endTime，统计时间范围不能超过7天。
 * Summary: 溯源统计信息查询
*/
func (client *Client) QueryCodeStatEx(request *QueryCodeStatRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCodeStatResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCodeStatResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mytc.code.stat.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 溯源码注册，可重复注册。 主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
 * Summary: 溯源码(可重复)注册
 */
func (client *Client) AddCodeRegistration(request *AddCodeRegistrationRequest) (_result *AddCodeRegistrationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddCodeRegistrationResponse{}
	_body, _err := client.AddCodeRegistrationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 溯源码注册，可重复注册。 主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
 * Summary: 溯源码(可重复)注册
 */
func (client *Client) AddCodeRegistrationEx(request *AddCodeRegistrationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddCodeRegistrationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddCodeRegistrationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mytc.code.registration.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新已注册的溯源信息
 * Summary: 溯源注册信息更新
 */
func (client *Client) UpdateCodeRegistration(request *UpdateCodeRegistrationRequest) (_result *UpdateCodeRegistrationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateCodeRegistrationResponse{}
	_body, _err := client.UpdateCodeRegistrationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新已注册的溯源信息
 * Summary: 溯源注册信息更新
 */
func (client *Client) UpdateCodeRegistrationEx(request *UpdateCodeRegistrationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateCodeRegistrationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateCodeRegistrationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mytc.code.registration.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 将关联信息绑定到溯源码上，可重复注册。 该接口调用存在以下业务维度限制： 1. code + bizLables + bizType做唯一性判断。
 * Summary: 溯源码(可重复)关联信息
 */
func (client *Client) AddCodeRelation(request *AddCodeRelationRequest) (_result *AddCodeRelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddCodeRelationResponse{}
	_body, _err := client.AddCodeRelationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 将关联信息绑定到溯源码上，可重复注册。 该接口调用存在以下业务维度限制： 1. code + bizLables + bizType做唯一性判断。
 * Summary: 溯源码(可重复)关联信息
 */
func (client *Client) AddCodeRelationEx(request *AddCodeRelationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddCodeRelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddCodeRelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mytc.code.relation.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新绑定到溯源码上的关联信息。
 * Summary: 溯源码关联信息更新
 */
func (client *Client) UpdateCodeRelation(request *UpdateCodeRelationRequest) (_result *UpdateCodeRelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateCodeRelationResponse{}
	_body, _err := client.UpdateCodeRelationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新绑定到溯源码上的关联信息。
 * Summary: 溯源码关联信息更新
 */
func (client *Client) UpdateCodeRelationEx(request *UpdateCodeRelationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateCodeRelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateCodeRelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mytc.code.relation.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryMiniCode(request *QueryMiniCodeRequest) (_result *QueryMiniCodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMiniCodeResponse{}
	_body, _err := client.QueryMiniCodeEx(request, headers, runtime)
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
func (client *Client) QueryMiniCodeEx(request *QueryMiniCodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMiniCodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMiniCodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mytc.mini.code.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 溯源证书查询
 * Summary: 溯源证书查询
 */
func (client *Client) QueryMiniCert(request *QueryMiniCertRequest) (_result *QueryMiniCertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMiniCertResponse{}
	_body, _err := client.QueryMiniCertEx(request, headers, runtime)
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
func (client *Client) QueryMiniCertEx(request *QueryMiniCertRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMiniCertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMiniCertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mytc.mini.cert.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) VerifyMiniNfc(request *VerifyMiniNfcRequest) (_result *VerifyMiniNfcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyMiniNfcResponse{}
	_body, _err := client.VerifyMiniNfcEx(request, headers, runtime)
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
func (client *Client) VerifyMiniNfcEx(request *VerifyMiniNfcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyMiniNfcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyMiniNfcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.mytc.mini.nfc.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
