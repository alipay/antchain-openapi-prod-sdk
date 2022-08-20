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

// nft发行的文件
type File struct {
	// 原文件的可访问路径
	OriginalFilePath *string `json:"original_file_path,omitempty" xml:"original_file_path,omitempty" require:"true"`
	// 缩略图的可访问路径
	MiniImagePath *string `json:"mini_image_path,omitempty" xml:"mini_image_path,omitempty" require:"true"`
	// 文件名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	//     IMAGE("IMAGE", "图片"),
	//     VIDEO("VIDEO", "视频"),
	//     AUDIO("AUDIO","音频"),
	//     THREE_DIMENSIONS("THREE_DIMENSIONS","3D模型")
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s File) String() string {
	return tea.Prettify(s)
}

func (s File) GoString() string {
	return s.String()
}

func (s *File) SetOriginalFilePath(v string) *File {
	s.OriginalFilePath = &v
	return s
}

func (s *File) SetMiniImagePath(v string) *File {
	s.MiniImagePath = &v
	return s
}

func (s *File) SetName(v string) *File {
	s.Name = &v
	return s
}

func (s *File) SetType(v string) *File {
	s.Type = &v
	return s
}

// 用户资产
type UserAsset struct {
	// NFT商品的商品编码
	SkuId *int64 `json:"sku_id,omitempty" xml:"sku_id,omitempty" require:"true"`
	// NFT资产的唯一编码
	NftId *string `json:"nft_id,omitempty" xml:"nft_id,omitempty" require:"true"`
	// NFT商品的名称
	SkuName *string `json:"sku_name,omitempty" xml:"sku_name,omitempty" require:"true"`
	// NFT的创作者名称
	AuthorName *string `json:"author_name,omitempty" xml:"author_name,omitempty" require:"true"`
	// NFT的发行方名称
	IssuerName *string `json:"issuer_name,omitempty" xml:"issuer_name,omitempty" require:"true"`
	// 缩略图url，带5分钟鉴权
	MiniImagePath *string `json:"mini_image_path,omitempty" xml:"mini_image_path,omitempty" require:"true"`
}

func (s UserAsset) String() string {
	return tea.Prettify(s)
}

func (s UserAsset) GoString() string {
	return s.String()
}

func (s *UserAsset) SetSkuId(v int64) *UserAsset {
	s.SkuId = &v
	return s
}

func (s *UserAsset) SetNftId(v string) *UserAsset {
	s.NftId = &v
	return s
}

func (s *UserAsset) SetSkuName(v string) *UserAsset {
	s.SkuName = &v
	return s
}

func (s *UserAsset) SetAuthorName(v string) *UserAsset {
	s.AuthorName = &v
	return s
}

func (s *UserAsset) SetIssuerName(v string) *UserAsset {
	s.IssuerName = &v
	return s
}

func (s *UserAsset) SetMiniImagePath(v string) *UserAsset {
	s.MiniImagePath = &v
	return s
}

type ImportNftCreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 对端自己的项目id；用作幂等字段
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// NFT艺术品的名称
	SkuName *string `json:"sku_name,omitempty" xml:"sku_name,omitempty" require:"true"`
	// IMAGE("IMAGE","图片"),
	// VIDEO("VIDEO","视频"),
	// ;
	SkuType *string `json:"sku_type,omitempty" xml:"sku_type,omitempty" require:"true"`
	// 发行数量
	Quantity *int64 `json:"quantity,omitempty" xml:"quantity,omitempty" require:"true"`
	// 艺术品作者
	Author *string `json:"author,omitempty" xml:"author,omitempty" require:"true"`
	// 艺术品拥有者
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty" require:"true"`
	// 艺术品创作时间
	CreationTime *string `json:"creation_time,omitempty" xml:"creation_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 用于标识NFT资产来自特定的产品，用作特殊的交互跳转需求，非必填字段
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// nft简介信息
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 跳转链接
	JumpUrl *string `json:"jump_url,omitempty" xml:"jump_url,omitempty"`
	// nft发行的艺术品文件
	Files []*File `json:"files,omitempty" xml:"files,omitempty" require:"true" type:"Repeated"`
}

func (s ImportNftCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportNftCreateRequest) GoString() string {
	return s.String()
}

func (s *ImportNftCreateRequest) SetAuthToken(v string) *ImportNftCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportNftCreateRequest) SetProductInstanceId(v string) *ImportNftCreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportNftCreateRequest) SetProjectId(v string) *ImportNftCreateRequest {
	s.ProjectId = &v
	return s
}

func (s *ImportNftCreateRequest) SetSkuName(v string) *ImportNftCreateRequest {
	s.SkuName = &v
	return s
}

func (s *ImportNftCreateRequest) SetSkuType(v string) *ImportNftCreateRequest {
	s.SkuType = &v
	return s
}

func (s *ImportNftCreateRequest) SetQuantity(v int64) *ImportNftCreateRequest {
	s.Quantity = &v
	return s
}

func (s *ImportNftCreateRequest) SetAuthor(v string) *ImportNftCreateRequest {
	s.Author = &v
	return s
}

func (s *ImportNftCreateRequest) SetOwner(v string) *ImportNftCreateRequest {
	s.Owner = &v
	return s
}

func (s *ImportNftCreateRequest) SetCreationTime(v string) *ImportNftCreateRequest {
	s.CreationTime = &v
	return s
}

func (s *ImportNftCreateRequest) SetBizType(v string) *ImportNftCreateRequest {
	s.BizType = &v
	return s
}

func (s *ImportNftCreateRequest) SetDescription(v string) *ImportNftCreateRequest {
	s.Description = &v
	return s
}

func (s *ImportNftCreateRequest) SetJumpUrl(v string) *ImportNftCreateRequest {
	s.JumpUrl = &v
	return s
}

func (s *ImportNftCreateRequest) SetFiles(v []*File) *ImportNftCreateRequest {
	s.Files = v
	return s
}

type ImportNftCreateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// NFT发行成功的商品id
	SkuId *int64 `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
}

func (s ImportNftCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportNftCreateResponse) GoString() string {
	return s.String()
}

func (s *ImportNftCreateResponse) SetReqMsgId(v string) *ImportNftCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportNftCreateResponse) SetResultCode(v string) *ImportNftCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportNftCreateResponse) SetResultMsg(v string) *ImportNftCreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportNftCreateResponse) SetSkuId(v int64) *ImportNftCreateResponse {
	s.SkuId = &v
	return s
}

type QueryNftCreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 对端自己的项目id；NFT发行时用作幂等字段
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// NFT发行成功的商品id，传入sku_id时以此为准做查询
	SkuId *int64 `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
}

func (s QueryNftCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryNftCreateRequest) GoString() string {
	return s.String()
}

func (s *QueryNftCreateRequest) SetAuthToken(v string) *QueryNftCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryNftCreateRequest) SetProductInstanceId(v string) *QueryNftCreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryNftCreateRequest) SetProjectId(v string) *QueryNftCreateRequest {
	s.ProjectId = &v
	return s
}

func (s *QueryNftCreateRequest) SetSkuId(v int64) *QueryNftCreateRequest {
	s.SkuId = &v
	return s
}

type QueryNftCreateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// NFT发行成功的商品id
	SkuId *int64 `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
	// INIT("INIT", "初始化"),
	// PROCESSING("PROCESSING", "资产创建中"),
	// FINISH("FINISH", "资产初始化完毕"),
	// ;
	SkuStatus *string `json:"sku_status,omitempty" xml:"sku_status,omitempty"`
	// NFT商品的名称
	SkuName *string `json:"sku_name,omitempty" xml:"sku_name,omitempty"`
	// 作者的名称
	AuthorName *string `json:"author_name,omitempty" xml:"author_name,omitempty"`
	// 发行方的名称
	IssuerName *string `json:"issuer_name,omitempty" xml:"issuer_name,omitempty"`
	// 缩略图展示路径
	MiniImagePath *string `json:"mini_image_path,omitempty" xml:"mini_image_path,omitempty"`
}

func (s QueryNftCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryNftCreateResponse) GoString() string {
	return s.String()
}

func (s *QueryNftCreateResponse) SetReqMsgId(v string) *QueryNftCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryNftCreateResponse) SetResultCode(v string) *QueryNftCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryNftCreateResponse) SetResultMsg(v string) *QueryNftCreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryNftCreateResponse) SetSkuId(v int64) *QueryNftCreateResponse {
	s.SkuId = &v
	return s
}

func (s *QueryNftCreateResponse) SetSkuStatus(v string) *QueryNftCreateResponse {
	s.SkuStatus = &v
	return s
}

func (s *QueryNftCreateResponse) SetSkuName(v string) *QueryNftCreateResponse {
	s.SkuName = &v
	return s
}

func (s *QueryNftCreateResponse) SetAuthorName(v string) *QueryNftCreateResponse {
	s.AuthorName = &v
	return s
}

func (s *QueryNftCreateResponse) SetIssuerName(v string) *QueryNftCreateResponse {
	s.IssuerName = &v
	return s
}

func (s *QueryNftCreateResponse) SetMiniImagePath(v string) *QueryNftCreateResponse {
	s.MiniImagePath = &v
	return s
}

type ExecNftTransferRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// NFT发行成功的商品id
	SkuId *int64 `json:"sku_id,omitempty" xml:"sku_id,omitempty" require:"true"`
	// C端用户的支付宝uid
	ToIdNo *string `json:"to_id_no,omitempty" xml:"to_id_no,omitempty" require:"true"`
	// C端用户的支付宝账号类型
	ToIdType *string `json:"to_id_type,omitempty" xml:"to_id_type,omitempty" require:"true"`
	// 用户在商户购买的订单号，用作幂等字段
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 用户购买订单的时间
	OrderTime *string `json:"order_time,omitempty" xml:"order_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 用户购买订单的价格，可以为0；用户的购买历史记录会展示
	PriceCent *int64 `json:"price_cent,omitempty" xml:"price_cent,omitempty"`
}

func (s ExecNftTransferRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecNftTransferRequest) GoString() string {
	return s.String()
}

func (s *ExecNftTransferRequest) SetAuthToken(v string) *ExecNftTransferRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecNftTransferRequest) SetProductInstanceId(v string) *ExecNftTransferRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecNftTransferRequest) SetSkuId(v int64) *ExecNftTransferRequest {
	s.SkuId = &v
	return s
}

func (s *ExecNftTransferRequest) SetToIdNo(v string) *ExecNftTransferRequest {
	s.ToIdNo = &v
	return s
}

func (s *ExecNftTransferRequest) SetToIdType(v string) *ExecNftTransferRequest {
	s.ToIdType = &v
	return s
}

func (s *ExecNftTransferRequest) SetOrderNo(v string) *ExecNftTransferRequest {
	s.OrderNo = &v
	return s
}

func (s *ExecNftTransferRequest) SetOrderTime(v string) *ExecNftTransferRequest {
	s.OrderTime = &v
	return s
}

func (s *ExecNftTransferRequest) SetPriceCent(v int64) *ExecNftTransferRequest {
	s.PriceCent = &v
	return s
}

type ExecNftTransferResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// NFT发行成功的商品id
	SkuId *int64 `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
	// NFT发行成功的商品，其中转给C端用户的特定一个token
	NftId *string `json:"nft_id,omitempty" xml:"nft_id,omitempty"`
}

func (s ExecNftTransferResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecNftTransferResponse) GoString() string {
	return s.String()
}

func (s *ExecNftTransferResponse) SetReqMsgId(v string) *ExecNftTransferResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecNftTransferResponse) SetResultCode(v string) *ExecNftTransferResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecNftTransferResponse) SetResultMsg(v string) *ExecNftTransferResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecNftTransferResponse) SetSkuId(v int64) *ExecNftTransferResponse {
	s.SkuId = &v
	return s
}

func (s *ExecNftTransferResponse) SetNftId(v string) *ExecNftTransferResponse {
	s.NftId = &v
	return s
}

type SendNftTransferRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// NFT租户下唯一的项目编号
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 支付宝2088开头账号
	ToIdNo *string `json:"to_id_no,omitempty" xml:"to_id_no,omitempty" require:"true"`
	// 账号类型，当前只支持支付宝账号
	ToIdType *string `json:"to_id_type,omitempty" xml:"to_id_type,omitempty" require:"true"`
	// 交易NFT时租户的唯一订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 用户购买订单时间
	OrderTime *string `json:"order_time,omitempty" xml:"order_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 购买NFT的金额，单位分
	PriceCent *int64 `json:"price_cent,omitempty" xml:"price_cent,omitempty"`
}

func (s SendNftTransferRequest) String() string {
	return tea.Prettify(s)
}

func (s SendNftTransferRequest) GoString() string {
	return s.String()
}

func (s *SendNftTransferRequest) SetAuthToken(v string) *SendNftTransferRequest {
	s.AuthToken = &v
	return s
}

func (s *SendNftTransferRequest) SetProductInstanceId(v string) *SendNftTransferRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendNftTransferRequest) SetProjectId(v string) *SendNftTransferRequest {
	s.ProjectId = &v
	return s
}

func (s *SendNftTransferRequest) SetToIdNo(v string) *SendNftTransferRequest {
	s.ToIdNo = &v
	return s
}

func (s *SendNftTransferRequest) SetToIdType(v string) *SendNftTransferRequest {
	s.ToIdType = &v
	return s
}

func (s *SendNftTransferRequest) SetOrderNo(v string) *SendNftTransferRequest {
	s.OrderNo = &v
	return s
}

func (s *SendNftTransferRequest) SetOrderTime(v string) *SendNftTransferRequest {
	s.OrderTime = &v
	return s
}

func (s *SendNftTransferRequest) SetPriceCent(v int64) *SendNftTransferRequest {
	s.PriceCent = &v
	return s
}

type SendNftTransferResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// NFT商品编码
	SkuId *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
	// 发放的NFT编码
	NftId *string `json:"nft_id,omitempty" xml:"nft_id,omitempty"`
}

func (s SendNftTransferResponse) String() string {
	return tea.Prettify(s)
}

func (s SendNftTransferResponse) GoString() string {
	return s.String()
}

func (s *SendNftTransferResponse) SetReqMsgId(v string) *SendNftTransferResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendNftTransferResponse) SetResultCode(v string) *SendNftTransferResponse {
	s.ResultCode = &v
	return s
}

func (s *SendNftTransferResponse) SetResultMsg(v string) *SendNftTransferResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendNftTransferResponse) SetSkuId(v string) *SendNftTransferResponse {
	s.SkuId = &v
	return s
}

func (s *SendNftTransferResponse) SetNftId(v string) *SendNftTransferResponse {
	s.NftId = &v
	return s
}

type QueryNftCustomerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户支付宝2088账号编码，16位
	IdNo *string `json:"id_no,omitempty" xml:"id_no,omitempty" require:"true"`
	// 用户的账户类型
	IdType *string `json:"id_type,omitempty" xml:"id_type,omitempty" require:"true"`
	// NFT资产唯一编码
	NftId *string `json:"nft_id,omitempty" xml:"nft_id,omitempty" require:"true"`
}

func (s QueryNftCustomerRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryNftCustomerRequest) GoString() string {
	return s.String()
}

func (s *QueryNftCustomerRequest) SetAuthToken(v string) *QueryNftCustomerRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryNftCustomerRequest) SetProductInstanceId(v string) *QueryNftCustomerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryNftCustomerRequest) SetIdNo(v string) *QueryNftCustomerRequest {
	s.IdNo = &v
	return s
}

func (s *QueryNftCustomerRequest) SetIdType(v string) *QueryNftCustomerRequest {
	s.IdType = &v
	return s
}

func (s *QueryNftCustomerRequest) SetNftId(v string) *QueryNftCustomerRequest {
	s.NftId = &v
	return s
}

type QueryNftCustomerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// NFT商品的商品编码
	SkuId *int64 `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
	// NFT资产的唯一编码
	NftId *string `json:"nft_id,omitempty" xml:"nft_id,omitempty"`
	// NFT商品的名称
	SkuName *string `json:"sku_name,omitempty" xml:"sku_name,omitempty"`
	// NFT的创作者名称
	AuthorName *string `json:"author_name,omitempty" xml:"author_name,omitempty"`
	// NFT的发行方名称
	IssuerName *string `json:"issuer_name,omitempty" xml:"issuer_name,omitempty"`
	// 缩略图url，带5分钟鉴权
	MiniImagePath *string `json:"mini_image_path,omitempty" xml:"mini_image_path,omitempty"`
}

func (s QueryNftCustomerResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryNftCustomerResponse) GoString() string {
	return s.String()
}

func (s *QueryNftCustomerResponse) SetReqMsgId(v string) *QueryNftCustomerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryNftCustomerResponse) SetResultCode(v string) *QueryNftCustomerResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryNftCustomerResponse) SetResultMsg(v string) *QueryNftCustomerResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryNftCustomerResponse) SetSkuId(v int64) *QueryNftCustomerResponse {
	s.SkuId = &v
	return s
}

func (s *QueryNftCustomerResponse) SetNftId(v string) *QueryNftCustomerResponse {
	s.NftId = &v
	return s
}

func (s *QueryNftCustomerResponse) SetSkuName(v string) *QueryNftCustomerResponse {
	s.SkuName = &v
	return s
}

func (s *QueryNftCustomerResponse) SetAuthorName(v string) *QueryNftCustomerResponse {
	s.AuthorName = &v
	return s
}

func (s *QueryNftCustomerResponse) SetIssuerName(v string) *QueryNftCustomerResponse {
	s.IssuerName = &v
	return s
}

func (s *QueryNftCustomerResponse) SetMiniImagePath(v string) *QueryNftCustomerResponse {
	s.MiniImagePath = &v
	return s
}

type QueryNftOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 支付宝的2088账号
	IdNo *string `json:"id_no,omitempty" xml:"id_no,omitempty" require:"true"`
	// 支付账号类型，该版本仅支持支付宝账号
	IdType *string `json:"id_type,omitempty" xml:"id_type,omitempty" require:"true"`
	// 租户的唯一映射订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
}

func (s QueryNftOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryNftOrderRequest) GoString() string {
	return s.String()
}

func (s *QueryNftOrderRequest) SetAuthToken(v string) *QueryNftOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryNftOrderRequest) SetProductInstanceId(v string) *QueryNftOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryNftOrderRequest) SetIdNo(v string) *QueryNftOrderRequest {
	s.IdNo = &v
	return s
}

func (s *QueryNftOrderRequest) SetIdType(v string) *QueryNftOrderRequest {
	s.IdType = &v
	return s
}

func (s *QueryNftOrderRequest) SetOrderNo(v string) *QueryNftOrderRequest {
	s.OrderNo = &v
	return s
}

type QueryNftOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// NFT商品编码
	SkuId *int64 `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
	// NFT资产的唯一id
	NftId *string `json:"nft_id,omitempty" xml:"nft_id,omitempty"`
}

func (s QueryNftOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryNftOrderResponse) GoString() string {
	return s.String()
}

func (s *QueryNftOrderResponse) SetReqMsgId(v string) *QueryNftOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryNftOrderResponse) SetResultCode(v string) *QueryNftOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryNftOrderResponse) SetResultMsg(v string) *QueryNftOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryNftOrderResponse) SetSkuId(v int64) *QueryNftOrderResponse {
	s.SkuId = &v
	return s
}

func (s *QueryNftOrderResponse) SetNftId(v string) *QueryNftOrderResponse {
	s.NftId = &v
	return s
}

type CreateNftIssuerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户发行NFT的唯一编号
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// NFT商品的名称
	SkuName *string `json:"sku_name,omitempty" xml:"sku_name,omitempty" require:"true"`
	// NFT资产类型, 含IMAGE、VIDEO、FILE、AUDIO、THREE_DIMENSIONS等
	SkuType *string `json:"sku_type,omitempty" xml:"sku_type,omitempty" require:"true"`
	// 铸造数量，100起
	Quantity *int64 `json:"quantity,omitempty" xml:"quantity,omitempty" require:"true"`
	// NFT创作者
	Author *string `json:"author,omitempty" xml:"author,omitempty" require:"true"`
	// 发行方名称
	IssuerName *string `json:"issuer_name,omitempty" xml:"issuer_name,omitempty" require:"true"`
	// NFT商品的描述
	SkuDescrption *string `json:"sku_descrption,omitempty" xml:"sku_descrption,omitempty" require:"true"`
	// 跳转链接
	JumpUrl *string `json:"jump_url,omitempty" xml:"jump_url,omitempty"`
	// 业务类型：PAY_CODE，DEFAULT，EUROPEAN_CUP，TAOBAO_AUCTION，NFT_CUSTOMIZE（NFT定制）
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 素材文件结构
	Files []*File `json:"files,omitempty" xml:"files,omitempty" require:"true" type:"Repeated"`
}

func (s CreateNftIssuerRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateNftIssuerRequest) GoString() string {
	return s.String()
}

func (s *CreateNftIssuerRequest) SetAuthToken(v string) *CreateNftIssuerRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateNftIssuerRequest) SetProductInstanceId(v string) *CreateNftIssuerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateNftIssuerRequest) SetProjectId(v string) *CreateNftIssuerRequest {
	s.ProjectId = &v
	return s
}

func (s *CreateNftIssuerRequest) SetSkuName(v string) *CreateNftIssuerRequest {
	s.SkuName = &v
	return s
}

func (s *CreateNftIssuerRequest) SetSkuType(v string) *CreateNftIssuerRequest {
	s.SkuType = &v
	return s
}

func (s *CreateNftIssuerRequest) SetQuantity(v int64) *CreateNftIssuerRequest {
	s.Quantity = &v
	return s
}

func (s *CreateNftIssuerRequest) SetAuthor(v string) *CreateNftIssuerRequest {
	s.Author = &v
	return s
}

func (s *CreateNftIssuerRequest) SetIssuerName(v string) *CreateNftIssuerRequest {
	s.IssuerName = &v
	return s
}

func (s *CreateNftIssuerRequest) SetSkuDescrption(v string) *CreateNftIssuerRequest {
	s.SkuDescrption = &v
	return s
}

func (s *CreateNftIssuerRequest) SetJumpUrl(v string) *CreateNftIssuerRequest {
	s.JumpUrl = &v
	return s
}

func (s *CreateNftIssuerRequest) SetBizType(v string) *CreateNftIssuerRequest {
	s.BizType = &v
	return s
}

func (s *CreateNftIssuerRequest) SetFiles(v []*File) *CreateNftIssuerRequest {
	s.Files = v
	return s
}

type CreateNftIssuerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发行任务编号
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 业务方发行NFT对应的唯一项目编号
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty"`
}

func (s CreateNftIssuerResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateNftIssuerResponse) GoString() string {
	return s.String()
}

func (s *CreateNftIssuerResponse) SetReqMsgId(v string) *CreateNftIssuerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateNftIssuerResponse) SetResultCode(v string) *CreateNftIssuerResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateNftIssuerResponse) SetResultMsg(v string) *CreateNftIssuerResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateNftIssuerResponse) SetTaskId(v string) *CreateNftIssuerResponse {
	s.TaskId = &v
	return s
}

func (s *CreateNftIssuerResponse) SetProjectId(v string) *CreateNftIssuerResponse {
	s.ProjectId = &v
	return s
}

type PagequeryNftCustomerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前页码
	Page *int64 `json:"page,omitempty" xml:"page,omitempty" require:"true"`
	// 页长
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 用户手机号或支付宝UID
	IdNo *string `json:"id_no,omitempty" xml:"id_no,omitempty" require:"true"`
	// 用户ID类型，和id_no对应
	IdType *string `json:"id_type,omitempty" xml:"id_type,omitempty" require:"true"`
}

func (s PagequeryNftCustomerRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryNftCustomerRequest) GoString() string {
	return s.String()
}

func (s *PagequeryNftCustomerRequest) SetAuthToken(v string) *PagequeryNftCustomerRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryNftCustomerRequest) SetProductInstanceId(v string) *PagequeryNftCustomerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryNftCustomerRequest) SetPage(v int64) *PagequeryNftCustomerRequest {
	s.Page = &v
	return s
}

func (s *PagequeryNftCustomerRequest) SetPageSize(v int64) *PagequeryNftCustomerRequest {
	s.PageSize = &v
	return s
}

func (s *PagequeryNftCustomerRequest) SetIdNo(v string) *PagequeryNftCustomerRequest {
	s.IdNo = &v
	return s
}

func (s *PagequeryNftCustomerRequest) SetIdType(v string) *PagequeryNftCustomerRequest {
	s.IdType = &v
	return s
}

type PagequeryNftCustomerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 页码，查询时传入
	Page *int64 `json:"page,omitempty" xml:"page,omitempty"`
	// 页长，查询时传入
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 列表总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// fans uid
	Uid *string `json:"uid,omitempty" xml:"uid,omitempty"`
	// 用户资产列表
	AssetList []*UserAsset `json:"asset_list,omitempty" xml:"asset_list,omitempty" type:"Repeated"`
}

func (s PagequeryNftCustomerResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryNftCustomerResponse) GoString() string {
	return s.String()
}

func (s *PagequeryNftCustomerResponse) SetReqMsgId(v string) *PagequeryNftCustomerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryNftCustomerResponse) SetResultCode(v string) *PagequeryNftCustomerResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryNftCustomerResponse) SetResultMsg(v string) *PagequeryNftCustomerResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryNftCustomerResponse) SetPage(v int64) *PagequeryNftCustomerResponse {
	s.Page = &v
	return s
}

func (s *PagequeryNftCustomerResponse) SetPageSize(v int64) *PagequeryNftCustomerResponse {
	s.PageSize = &v
	return s
}

func (s *PagequeryNftCustomerResponse) SetTotalCount(v int64) *PagequeryNftCustomerResponse {
	s.TotalCount = &v
	return s
}

func (s *PagequeryNftCustomerResponse) SetUid(v string) *PagequeryNftCustomerResponse {
	s.Uid = &v
	return s
}

func (s *PagequeryNftCustomerResponse) SetAssetList(v []*UserAsset) *PagequeryNftCustomerResponse {
	s.AssetList = v
	return s
}

type CreateNftPublishRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户发行NFT的唯一编号
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// NFT商品的名称
	SkuName *string `json:"sku_name,omitempty" xml:"sku_name,omitempty" require:"true"`
	// NFT资产类型, 含IMAGE(图片)、VIDEO(视频)、AUDIO(音频)、THREE_DIMENSIONS(3D模型)等
	SkuType *string `json:"sku_type,omitempty" xml:"sku_type,omitempty" require:"true"`
	// 铸造数量，至少为1
	Quantity *int64 `json:"quantity,omitempty" xml:"quantity,omitempty" require:"true"`
	// NFT创作者。中文或手机号和author_type对应
	Author *string `json:"author,omitempty" xml:"author,omitempty" require:"true"`
	// 创作者类型。手机号或中文类型，和author对应
	AuthorType *string `json:"author_type,omitempty" xml:"author_type,omitempty" require:"true"`
	// 发行方名称
	IssuerName *string `json:"issuer_name,omitempty" xml:"issuer_name,omitempty" require:"true"`
	// NFT商品的描述
	SkuDescrption *string `json:"sku_descrption,omitempty" xml:"sku_descrption,omitempty" require:"true"`
	// 监制方。中文名或手机号，和producer_type对应
	Producer *string `json:"producer,omitempty" xml:"producer,omitempty" require:"true"`
	// 监制方类型。手机号或中文类型，和producer对应
	ProducerType *string `json:"producer_type,omitempty" xml:"producer_type,omitempty" require:"true"`
	// 跳转链接
	JumpUrl *string `json:"jump_url,omitempty" xml:"jump_url,omitempty"`
	// 业务类型：PAY_CODE，DEFAULT，EUROPEAN_CUP，TAOBAO_AUCTION，
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 渠道租户
	ChannelTenant *string `json:"channel_tenant,omitempty" xml:"channel_tenant,omitempty" require:"true"`
	// 素材文件结构
	Files []*File `json:"files,omitempty" xml:"files,omitempty" require:"true" type:"Repeated"`
	// 备注信息
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
}

func (s CreateNftPublishRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateNftPublishRequest) GoString() string {
	return s.String()
}

func (s *CreateNftPublishRequest) SetAuthToken(v string) *CreateNftPublishRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateNftPublishRequest) SetProductInstanceId(v string) *CreateNftPublishRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateNftPublishRequest) SetProjectId(v string) *CreateNftPublishRequest {
	s.ProjectId = &v
	return s
}

func (s *CreateNftPublishRequest) SetSkuName(v string) *CreateNftPublishRequest {
	s.SkuName = &v
	return s
}

func (s *CreateNftPublishRequest) SetSkuType(v string) *CreateNftPublishRequest {
	s.SkuType = &v
	return s
}

func (s *CreateNftPublishRequest) SetQuantity(v int64) *CreateNftPublishRequest {
	s.Quantity = &v
	return s
}

func (s *CreateNftPublishRequest) SetAuthor(v string) *CreateNftPublishRequest {
	s.Author = &v
	return s
}

func (s *CreateNftPublishRequest) SetAuthorType(v string) *CreateNftPublishRequest {
	s.AuthorType = &v
	return s
}

func (s *CreateNftPublishRequest) SetIssuerName(v string) *CreateNftPublishRequest {
	s.IssuerName = &v
	return s
}

func (s *CreateNftPublishRequest) SetSkuDescrption(v string) *CreateNftPublishRequest {
	s.SkuDescrption = &v
	return s
}

func (s *CreateNftPublishRequest) SetProducer(v string) *CreateNftPublishRequest {
	s.Producer = &v
	return s
}

func (s *CreateNftPublishRequest) SetProducerType(v string) *CreateNftPublishRequest {
	s.ProducerType = &v
	return s
}

func (s *CreateNftPublishRequest) SetJumpUrl(v string) *CreateNftPublishRequest {
	s.JumpUrl = &v
	return s
}

func (s *CreateNftPublishRequest) SetBizType(v string) *CreateNftPublishRequest {
	s.BizType = &v
	return s
}

func (s *CreateNftPublishRequest) SetChannelTenant(v string) *CreateNftPublishRequest {
	s.ChannelTenant = &v
	return s
}

func (s *CreateNftPublishRequest) SetFiles(v []*File) *CreateNftPublishRequest {
	s.Files = v
	return s
}

func (s *CreateNftPublishRequest) SetMemo(v string) *CreateNftPublishRequest {
	s.Memo = &v
	return s
}

type CreateNftPublishResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发行任务编号
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 业务方发行NFT对应的唯一项目编号
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty"`
}

func (s CreateNftPublishResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateNftPublishResponse) GoString() string {
	return s.String()
}

func (s *CreateNftPublishResponse) SetReqMsgId(v string) *CreateNftPublishResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateNftPublishResponse) SetResultCode(v string) *CreateNftPublishResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateNftPublishResponse) SetResultMsg(v string) *CreateNftPublishResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateNftPublishResponse) SetTaskId(v string) *CreateNftPublishResponse {
	s.TaskId = &v
	return s
}

func (s *CreateNftPublishResponse) SetProjectId(v string) *CreateNftPublishResponse {
	s.ProjectId = &v
	return s
}

type RunNftTransferRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// NFT租户下唯一的项目编号
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 支付宝2088开头账号
	ToIdNo *string `json:"to_id_no,omitempty" xml:"to_id_no,omitempty" require:"true"`
	// 账号类型，当前只支持支付宝账号
	ToIdType *string `json:"to_id_type,omitempty" xml:"to_id_type,omitempty" require:"true"`
	// 交易NFT时租户的唯一订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 购买NFT的金额，单位分
	PriceCent *int64 `json:"price_cent,omitempty" xml:"price_cent,omitempty"`
	// 渠道租户
	ChannelTenant *string `json:"channel_tenant,omitempty" xml:"channel_tenant,omitempty" require:"true"`
}

func (s RunNftTransferRequest) String() string {
	return tea.Prettify(s)
}

func (s RunNftTransferRequest) GoString() string {
	return s.String()
}

func (s *RunNftTransferRequest) SetAuthToken(v string) *RunNftTransferRequest {
	s.AuthToken = &v
	return s
}

func (s *RunNftTransferRequest) SetProductInstanceId(v string) *RunNftTransferRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RunNftTransferRequest) SetProjectId(v string) *RunNftTransferRequest {
	s.ProjectId = &v
	return s
}

func (s *RunNftTransferRequest) SetToIdNo(v string) *RunNftTransferRequest {
	s.ToIdNo = &v
	return s
}

func (s *RunNftTransferRequest) SetToIdType(v string) *RunNftTransferRequest {
	s.ToIdType = &v
	return s
}

func (s *RunNftTransferRequest) SetOrderNo(v string) *RunNftTransferRequest {
	s.OrderNo = &v
	return s
}

func (s *RunNftTransferRequest) SetPriceCent(v int64) *RunNftTransferRequest {
	s.PriceCent = &v
	return s
}

func (s *RunNftTransferRequest) SetChannelTenant(v string) *RunNftTransferRequest {
	s.ChannelTenant = &v
	return s
}

type RunNftTransferResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// NFT商品编码
	SkuId *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
	// 发放的NFT编码
	NftId *string `json:"nft_id,omitempty" xml:"nft_id,omitempty"`
}

func (s RunNftTransferResponse) String() string {
	return tea.Prettify(s)
}

func (s RunNftTransferResponse) GoString() string {
	return s.String()
}

func (s *RunNftTransferResponse) SetReqMsgId(v string) *RunNftTransferResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RunNftTransferResponse) SetResultCode(v string) *RunNftTransferResponse {
	s.ResultCode = &v
	return s
}

func (s *RunNftTransferResponse) SetResultMsg(v string) *RunNftTransferResponse {
	s.ResultMsg = &v
	return s
}

func (s *RunNftTransferResponse) SetSkuId(v string) *RunNftTransferResponse {
	s.SkuId = &v
	return s
}

func (s *RunNftTransferResponse) SetNftId(v string) *RunNftTransferResponse {
	s.NftId = &v
	return s
}

type ApplyNftTransferRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// NFT发行成功的商品id
	SkuId *int64 `json:"sku_id,omitempty" xml:"sku_id,omitempty" require:"true"`
	// C端用户的支付宝uid
	ToIdNo *string `json:"to_id_no,omitempty" xml:"to_id_no,omitempty" require:"true"`
	// 仅支持 支付宝账号类型
	ToIdType *string `json:"to_id_type,omitempty" xml:"to_id_type,omitempty" require:"true"`
	// 用户在商户购买的订单号，用作幂等字段
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 用户购买订单的价格，单位为分，可以为0；
	PriceCent *int64 `json:"price_cent,omitempty" xml:"price_cent,omitempty"`
	// 渠道租户
	ChannelTenant *string `json:"channel_tenant,omitempty" xml:"channel_tenant,omitempty" require:"true"`
}

func (s ApplyNftTransferRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyNftTransferRequest) GoString() string {
	return s.String()
}

func (s *ApplyNftTransferRequest) SetAuthToken(v string) *ApplyNftTransferRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyNftTransferRequest) SetProductInstanceId(v string) *ApplyNftTransferRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyNftTransferRequest) SetSkuId(v int64) *ApplyNftTransferRequest {
	s.SkuId = &v
	return s
}

func (s *ApplyNftTransferRequest) SetToIdNo(v string) *ApplyNftTransferRequest {
	s.ToIdNo = &v
	return s
}

func (s *ApplyNftTransferRequest) SetToIdType(v string) *ApplyNftTransferRequest {
	s.ToIdType = &v
	return s
}

func (s *ApplyNftTransferRequest) SetOrderNo(v string) *ApplyNftTransferRequest {
	s.OrderNo = &v
	return s
}

func (s *ApplyNftTransferRequest) SetPriceCent(v int64) *ApplyNftTransferRequest {
	s.PriceCent = &v
	return s
}

func (s *ApplyNftTransferRequest) SetChannelTenant(v string) *ApplyNftTransferRequest {
	s.ChannelTenant = &v
	return s
}

type ApplyNftTransferResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// NFT发行成功的商品id
	SkuId *int64 `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
	// NFT发行成功的商品，其中转给C端用户的特定一个token
	NftId *string `json:"nft_id,omitempty" xml:"nft_id,omitempty"`
	// fans uid
	Uid *string `json:"uid,omitempty" xml:"uid,omitempty"`
}

func (s ApplyNftTransferResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyNftTransferResponse) GoString() string {
	return s.String()
}

func (s *ApplyNftTransferResponse) SetReqMsgId(v string) *ApplyNftTransferResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyNftTransferResponse) SetResultCode(v string) *ApplyNftTransferResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyNftTransferResponse) SetResultMsg(v string) *ApplyNftTransferResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyNftTransferResponse) SetSkuId(v int64) *ApplyNftTransferResponse {
	s.SkuId = &v
	return s
}

func (s *ApplyNftTransferResponse) SetNftId(v string) *ApplyNftTransferResponse {
	s.NftId = &v
	return s
}

func (s *ApplyNftTransferResponse) SetUid(v string) *ApplyNftTransferResponse {
	s.Uid = &v
	return s
}

type ApplyNftTransferbyprojectwithchanneltenantRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// NFT租户下唯一的项目编号
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 支付宝2088开头账号
	ToIdNo *string `json:"to_id_no,omitempty" xml:"to_id_no,omitempty" require:"true"`
	// 账号类型，当前只支持支付宝账号
	ToIdType *string `json:"to_id_type,omitempty" xml:"to_id_type,omitempty" require:"true"`
	// 交易NFT时租户的唯一订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 购买NFT的金额，单位分
	PriceCent *int64 `json:"price_cent,omitempty" xml:"price_cent,omitempty"`
	// 渠道租户
	ChannelTenant *string `json:"channel_tenant,omitempty" xml:"channel_tenant,omitempty" require:"true"`
}

func (s ApplyNftTransferbyprojectwithchanneltenantRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyNftTransferbyprojectwithchanneltenantRequest) GoString() string {
	return s.String()
}

func (s *ApplyNftTransferbyprojectwithchanneltenantRequest) SetAuthToken(v string) *ApplyNftTransferbyprojectwithchanneltenantRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyNftTransferbyprojectwithchanneltenantRequest) SetProductInstanceId(v string) *ApplyNftTransferbyprojectwithchanneltenantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyNftTransferbyprojectwithchanneltenantRequest) SetProjectId(v string) *ApplyNftTransferbyprojectwithchanneltenantRequest {
	s.ProjectId = &v
	return s
}

func (s *ApplyNftTransferbyprojectwithchanneltenantRequest) SetToIdNo(v string) *ApplyNftTransferbyprojectwithchanneltenantRequest {
	s.ToIdNo = &v
	return s
}

func (s *ApplyNftTransferbyprojectwithchanneltenantRequest) SetToIdType(v string) *ApplyNftTransferbyprojectwithchanneltenantRequest {
	s.ToIdType = &v
	return s
}

func (s *ApplyNftTransferbyprojectwithchanneltenantRequest) SetOrderNo(v string) *ApplyNftTransferbyprojectwithchanneltenantRequest {
	s.OrderNo = &v
	return s
}

func (s *ApplyNftTransferbyprojectwithchanneltenantRequest) SetPriceCent(v int64) *ApplyNftTransferbyprojectwithchanneltenantRequest {
	s.PriceCent = &v
	return s
}

func (s *ApplyNftTransferbyprojectwithchanneltenantRequest) SetChannelTenant(v string) *ApplyNftTransferbyprojectwithchanneltenantRequest {
	s.ChannelTenant = &v
	return s
}

type ApplyNftTransferbyprojectwithchanneltenantResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// NFT商品编码
	SkuId *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
	// 发放的NFT编码
	NftId *string `json:"nft_id,omitempty" xml:"nft_id,omitempty"`
}

func (s ApplyNftTransferbyprojectwithchanneltenantResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyNftTransferbyprojectwithchanneltenantResponse) GoString() string {
	return s.String()
}

func (s *ApplyNftTransferbyprojectwithchanneltenantResponse) SetReqMsgId(v string) *ApplyNftTransferbyprojectwithchanneltenantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyNftTransferbyprojectwithchanneltenantResponse) SetResultCode(v string) *ApplyNftTransferbyprojectwithchanneltenantResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyNftTransferbyprojectwithchanneltenantResponse) SetResultMsg(v string) *ApplyNftTransferbyprojectwithchanneltenantResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyNftTransferbyprojectwithchanneltenantResponse) SetSkuId(v string) *ApplyNftTransferbyprojectwithchanneltenantResponse {
	s.SkuId = &v
	return s
}

func (s *ApplyNftTransferbyprojectwithchanneltenantResponse) SetNftId(v string) *ApplyNftTransferbyprojectwithchanneltenantResponse {
	s.NftId = &v
	return s
}

type QueryNftAssetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 基于租户Id生成的对应访问服务端的accessToken
	AccessToken *string `json:"access_token,omitempty" xml:"access_token,omitempty" require:"true"`
	// 对应此藏品的nftId
	NftId *string `json:"nft_id,omitempty" xml:"nft_id,omitempty" require:"true"`
}

func (s QueryNftAssetRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryNftAssetRequest) GoString() string {
	return s.String()
}

func (s *QueryNftAssetRequest) SetAuthToken(v string) *QueryNftAssetRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryNftAssetRequest) SetProductInstanceId(v string) *QueryNftAssetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryNftAssetRequest) SetAccessToken(v string) *QueryNftAssetRequest {
	s.AccessToken = &v
	return s
}

func (s *QueryNftAssetRequest) SetNftId(v string) *QueryNftAssetRequest {
	s.NftId = &v
	return s
}

type QueryNftAssetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 藏品ID
	NftId *string `json:"nft_id,omitempty" xml:"nft_id,omitempty"`
	// 藏品名称
	SkuName *string `json:"sku_name,omitempty" xml:"sku_name,omitempty"`
	// 藏品SKU ID
	SkuId *int64 `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
	// 此藏品对应的uniHash值
	UniHash *string `json:"uni_hash,omitempty" xml:"uni_hash,omitempty"`
	// 藏品铸造时间
	CreationTime *string `json:"creation_time,omitempty" xml:"creation_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s QueryNftAssetResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryNftAssetResponse) GoString() string {
	return s.String()
}

func (s *QueryNftAssetResponse) SetReqMsgId(v string) *QueryNftAssetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryNftAssetResponse) SetResultCode(v string) *QueryNftAssetResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryNftAssetResponse) SetResultMsg(v string) *QueryNftAssetResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryNftAssetResponse) SetNftId(v string) *QueryNftAssetResponse {
	s.NftId = &v
	return s
}

func (s *QueryNftAssetResponse) SetSkuName(v string) *QueryNftAssetResponse {
	s.SkuName = &v
	return s
}

func (s *QueryNftAssetResponse) SetSkuId(v int64) *QueryNftAssetResponse {
	s.SkuId = &v
	return s
}

func (s *QueryNftAssetResponse) SetUniHash(v string) *QueryNftAssetResponse {
	s.UniHash = &v
	return s
}

func (s *QueryNftAssetResponse) SetCreationTime(v string) *QueryNftAssetResponse {
	s.CreationTime = &v
	return s
}

type PayOrderDataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 接入方测订单号，保证全局唯一
	ExternalOrderNo *string `json:"external_order_no,omitempty" xml:"external_order_no,omitempty" require:"true"`
	// 订单金额，单位为分
	AmountCent *int64 `json:"amount_cent,omitempty" xml:"amount_cent,omitempty" require:"true"`
	// ALIPAY 表示小程序支付，ALIPAY_APP表示App支付, ALIPAY_WAP表示手机网站支付
	PayChannel *string `json:"pay_channel,omitempty" xml:"pay_channel,omitempty" require:"true"`
	// 订单标题，支付宝账单会展示
	Subject *string `json:"subject,omitempty" xml:"subject,omitempty" require:"true"`
	// 订单超时时间，秒级
	TimeoutExpireSecond *int64 `json:"timeout_expire_second,omitempty" xml:"timeout_expire_second,omitempty" require:"true"`
	// 接入方存储的accessToken
	AccessToken *string `json:"access_token,omitempty" xml:"access_token,omitempty" require:"true"`
}

func (s PayOrderDataRequest) String() string {
	return tea.Prettify(s)
}

func (s PayOrderDataRequest) GoString() string {
	return s.String()
}

func (s *PayOrderDataRequest) SetAuthToken(v string) *PayOrderDataRequest {
	s.AuthToken = &v
	return s
}

func (s *PayOrderDataRequest) SetProductInstanceId(v string) *PayOrderDataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PayOrderDataRequest) SetExternalOrderNo(v string) *PayOrderDataRequest {
	s.ExternalOrderNo = &v
	return s
}

func (s *PayOrderDataRequest) SetAmountCent(v int64) *PayOrderDataRequest {
	s.AmountCent = &v
	return s
}

func (s *PayOrderDataRequest) SetPayChannel(v string) *PayOrderDataRequest {
	s.PayChannel = &v
	return s
}

func (s *PayOrderDataRequest) SetSubject(v string) *PayOrderDataRequest {
	s.Subject = &v
	return s
}

func (s *PayOrderDataRequest) SetTimeoutExpireSecond(v int64) *PayOrderDataRequest {
	s.TimeoutExpireSecond = &v
	return s
}

func (s *PayOrderDataRequest) SetAccessToken(v string) *PayOrderDataRequest {
	s.AccessToken = &v
	return s
}

type PayOrderDataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 鲸探开放平台内部订单号
	OpenOrderNo *string `json:"open_order_no,omitempty" xml:"open_order_no,omitempty"`
	// json字符串
	PayParams *string `json:"pay_params,omitempty" xml:"pay_params,omitempty"`
}

func (s PayOrderDataResponse) String() string {
	return tea.Prettify(s)
}

func (s PayOrderDataResponse) GoString() string {
	return s.String()
}

func (s *PayOrderDataResponse) SetReqMsgId(v string) *PayOrderDataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PayOrderDataResponse) SetResultCode(v string) *PayOrderDataResponse {
	s.ResultCode = &v
	return s
}

func (s *PayOrderDataResponse) SetResultMsg(v string) *PayOrderDataResponse {
	s.ResultMsg = &v
	return s
}

func (s *PayOrderDataResponse) SetOpenOrderNo(v string) *PayOrderDataResponse {
	s.OpenOrderNo = &v
	return s
}

func (s *PayOrderDataResponse) SetPayParams(v string) *PayOrderDataResponse {
	s.PayParams = &v
	return s
}

type SyncOrderDataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 接入方的订单号
	ExternalOrderNo *string `json:"external_order_no,omitempty" xml:"external_order_no,omitempty" require:"true"`
	// 目前支持两种状态 PAID、PAY_CANCEL
	ExternalOrderStatus *string `json:"external_order_status,omitempty" xml:"external_order_status,omitempty" require:"true"`
	// 鲸探开放平台订单号
	OpenOrderNo *string `json:"open_order_no,omitempty" xml:"open_order_no,omitempty" require:"true"`
	// 鲸探授权的用户加密的uid
	OpenUserId *string `json:"open_user_id,omitempty" xml:"open_user_id,omitempty" require:"true"`
	// 同步改状态时的事件时间
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s SyncOrderDataRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncOrderDataRequest) GoString() string {
	return s.String()
}

func (s *SyncOrderDataRequest) SetAuthToken(v string) *SyncOrderDataRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncOrderDataRequest) SetProductInstanceId(v string) *SyncOrderDataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncOrderDataRequest) SetExternalOrderNo(v string) *SyncOrderDataRequest {
	s.ExternalOrderNo = &v
	return s
}

func (s *SyncOrderDataRequest) SetExternalOrderStatus(v string) *SyncOrderDataRequest {
	s.ExternalOrderStatus = &v
	return s
}

func (s *SyncOrderDataRequest) SetOpenOrderNo(v string) *SyncOrderDataRequest {
	s.OpenOrderNo = &v
	return s
}

func (s *SyncOrderDataRequest) SetOpenUserId(v string) *SyncOrderDataRequest {
	s.OpenUserId = &v
	return s
}

func (s *SyncOrderDataRequest) SetUpdateTime(v string) *SyncOrderDataRequest {
	s.UpdateTime = &v
	return s
}

type SyncOrderDataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SyncOrderDataResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncOrderDataResponse) GoString() string {
	return s.String()
}

func (s *SyncOrderDataResponse) SetReqMsgId(v string) *SyncOrderDataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncOrderDataResponse) SetResultCode(v string) *SyncOrderDataResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncOrderDataResponse) SetResultMsg(v string) *SyncOrderDataResponse {
	s.ResultMsg = &v
	return s
}

type ApplyOauthTokenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 1.authorization_code，表示换取使用用户授权码code换取授权令牌access_token。
	// 2.refresh_token，表示使用refresh_token刷新获取新授权令牌。
	// 本期只支持authorization_code
	GrantType *string `json:"grant_type,omitempty" xml:"grant_type,omitempty" require:"true"`
	// 授权码，用户对应用授权后得到。
	// 本参数在 grant_type 为 authorization_code 时必填；为 refresh_token 时不填。
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty"`
	// 刷新令牌，上次换取访问令牌时得到。本参数在 grant_type 为 authorization_code 时不填；为 refresh_token 时必填
	RefreshToken *string `json:"refresh_token,omitempty" xml:"refresh_token,omitempty"`
}

func (s ApplyOauthTokenRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyOauthTokenRequest) GoString() string {
	return s.String()
}

func (s *ApplyOauthTokenRequest) SetAuthToken(v string) *ApplyOauthTokenRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyOauthTokenRequest) SetProductInstanceId(v string) *ApplyOauthTokenRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyOauthTokenRequest) SetGrantType(v string) *ApplyOauthTokenRequest {
	s.GrantType = &v
	return s
}

func (s *ApplyOauthTokenRequest) SetAuthCode(v string) *ApplyOauthTokenRequest {
	s.AuthCode = &v
	return s
}

func (s *ApplyOauthTokenRequest) SetRefreshToken(v string) *ApplyOauthTokenRequest {
	s.RefreshToken = &v
	return s
}

type ApplyOauthTokenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 后续调用接口鉴权的token
	AccessToken *string `json:"access_token,omitempty" xml:"access_token,omitempty"`
	// 到期时间
	ExpireTime *string `json:"expire_time,omitempty" xml:"expire_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// openuid
	OpenUserId *string `json:"open_user_id,omitempty" xml:"open_user_id,omitempty"`
	// 预留字段，本期不使用
	RefreshToken *string `json:"refresh_token,omitempty" xml:"refresh_token,omitempty"`
	// 预留字段，本期不使用
	RefreshExpireTime *string `json:"refresh_expire_time,omitempty" xml:"refresh_expire_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s ApplyOauthTokenResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyOauthTokenResponse) GoString() string {
	return s.String()
}

func (s *ApplyOauthTokenResponse) SetReqMsgId(v string) *ApplyOauthTokenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyOauthTokenResponse) SetResultCode(v string) *ApplyOauthTokenResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyOauthTokenResponse) SetResultMsg(v string) *ApplyOauthTokenResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyOauthTokenResponse) SetAccessToken(v string) *ApplyOauthTokenResponse {
	s.AccessToken = &v
	return s
}

func (s *ApplyOauthTokenResponse) SetExpireTime(v string) *ApplyOauthTokenResponse {
	s.ExpireTime = &v
	return s
}

func (s *ApplyOauthTokenResponse) SetOpenUserId(v string) *ApplyOauthTokenResponse {
	s.OpenUserId = &v
	return s
}

func (s *ApplyOauthTokenResponse) SetRefreshToken(v string) *ApplyOauthTokenResponse {
	s.RefreshToken = &v
	return s
}

func (s *ApplyOauthTokenResponse) SetRefreshExpireTime(v string) *ApplyOauthTokenResponse {
	s.RefreshExpireTime = &v
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
				"sdk_version":      tea.String("1.6.3"),
				"_prod_code":       tea.String("NFTX"),
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
 * Description: B端商户的NFT发行以及铸造
 * Summary: B端商户的NFT铸造 (废弃)
 */
func (client *Client) ImportNftCreate(request *ImportNftCreateRequest) (_result *ImportNftCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportNftCreateResponse{}
	_body, _err := client.ImportNftCreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: B端商户的NFT发行以及铸造
 * Summary: B端商户的NFT铸造 (废弃)
 */
func (client *Client) ImportNftCreateEx(request *ImportNftCreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportNftCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportNftCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftx.nft.create.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: B端商户的NFT发行后查询，包含状态、NFT商品的概要信息
 * Summary: B端商户的NFT发行铸造后查询
 */
func (client *Client) QueryNftCreate(request *QueryNftCreateRequest) (_result *QueryNftCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryNftCreateResponse{}
	_body, _err := client.QueryNftCreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: B端商户的NFT发行后查询，包含状态、NFT商品的概要信息
 * Summary: B端商户的NFT发行铸造后查询
 */
func (client *Client) QueryNftCreateEx(request *QueryNftCreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryNftCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryNftCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftx.nft.create.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 按商品编码（skuid）B2C发放NFT
 * Summary: 按商品编码B2C发放NFT
 */
func (client *Client) ExecNftTransfer(request *ExecNftTransferRequest) (_result *ExecNftTransferResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecNftTransferResponse{}
	_body, _err := client.ExecNftTransferEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 按商品编码（skuid）B2C发放NFT
 * Summary: 按商品编码B2C发放NFT
 */
func (client *Client) ExecNftTransferEx(request *ExecNftTransferRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecNftTransferResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecNftTransferResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftx.nft.transfer.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 按项目表编码B2C发放NFT
 * Summary: 按项目表编码B2C发放NFT
 */
func (client *Client) SendNftTransfer(request *SendNftTransferRequest) (_result *SendNftTransferResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendNftTransferResponse{}
	_body, _err := client.SendNftTransferEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 按项目表编码B2C发放NFT
 * Summary: 按项目表编码B2C发放NFT
 */
func (client *Client) SendNftTransferEx(request *SendNftTransferRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendNftTransferResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendNftTransferResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftx.nft.transfer.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据nftId查询客户NFT资产
 * Summary: 根据nftId查询客户NFT资产
 */
func (client *Client) QueryNftCustomer(request *QueryNftCustomerRequest) (_result *QueryNftCustomerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryNftCustomerResponse{}
	_body, _err := client.QueryNftCustomerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据nftId查询客户NFT资产
 * Summary: 根据nftId查询客户NFT资产
 */
func (client *Client) QueryNftCustomerEx(request *QueryNftCustomerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryNftCustomerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryNftCustomerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftx.nft.customer.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据外部订单号查询该订单的NFT流水记录
 * Summary: 根据外部订单号查询该订单的NFT流水记录
 */
func (client *Client) QueryNftOrder(request *QueryNftOrderRequest) (_result *QueryNftOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryNftOrderResponse{}
	_body, _err := client.QueryNftOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据外部订单号查询该订单的NFT流水记录
 * Summary: 根据外部订单号查询该订单的NFT流水记录
 */
func (client *Client) QueryNftOrderEx(request *QueryNftOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryNftOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryNftOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftx.nft.order.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: NFT发行审核&铸造
 * Summary: NFT发行审核&铸造
 */
func (client *Client) CreateNftIssuer(request *CreateNftIssuerRequest) (_result *CreateNftIssuerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateNftIssuerResponse{}
	_body, _err := client.CreateNftIssuerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: NFT发行审核&铸造
 * Summary: NFT发行审核&铸造
 */
func (client *Client) CreateNftIssuerEx(request *CreateNftIssuerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateNftIssuerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateNftIssuerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftx.nft.issuer.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: B端用户资产列表查询
 * Summary: 用户资产列表查询
 */
func (client *Client) PagequeryNftCustomer(request *PagequeryNftCustomerRequest) (_result *PagequeryNftCustomerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryNftCustomerResponse{}
	_body, _err := client.PagequeryNftCustomerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: B端用户资产列表查询
 * Summary: 用户资产列表查询
 */
func (client *Client) PagequeryNftCustomerEx(request *PagequeryNftCustomerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryNftCustomerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryNftCustomerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftx.nft.customer.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: NFT铸造, 带监制方和渠道租户
 * Summary: NFT铸造, 带监制方和渠道租户
 */
func (client *Client) CreateNftPublish(request *CreateNftPublishRequest) (_result *CreateNftPublishResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateNftPublishResponse{}
	_body, _err := client.CreateNftPublishEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: NFT铸造, 带监制方和渠道租户
 * Summary: NFT铸造, 带监制方和渠道租户
 */
func (client *Client) CreateNftPublishEx(request *CreateNftPublishRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateNftPublishResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateNftPublishResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftx.nft.publish.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 按项目表编码B2C发放NFT,带渠道租户
 * Summary: 按项目表编码B2C发放NFT, (废弃)
 */
func (client *Client) RunNftTransfer(request *RunNftTransferRequest) (_result *RunNftTransferResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RunNftTransferResponse{}
	_body, _err := client.RunNftTransferEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 按项目表编码B2C发放NFT,带渠道租户
 * Summary: 按项目表编码B2C发放NFT, (废弃)
 */
func (client *Client) RunNftTransferEx(request *RunNftTransferRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RunNftTransferResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RunNftTransferResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftx.nft.transfer.run"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 按商品编码B2C发放NFT 带渠道租户
 * Summary: 按商品编码B2C发放NFT 带渠道租户
 */
func (client *Client) ApplyNftTransfer(request *ApplyNftTransferRequest) (_result *ApplyNftTransferResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyNftTransferResponse{}
	_body, _err := client.ApplyNftTransferEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 按商品编码B2C发放NFT 带渠道租户
 * Summary: 按商品编码B2C发放NFT 带渠道租户
 */
func (client *Client) ApplyNftTransferEx(request *ApplyNftTransferRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyNftTransferResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyNftTransferResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftx.nft.transfer.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 按项目表编码B2C发放NFT,带渠道租户
 * Summary: 按项目表编码B2C发放NFT,带渠道租户
 */
func (client *Client) ApplyNftTransferbyprojectwithchanneltenant(request *ApplyNftTransferbyprojectwithchanneltenantRequest) (_result *ApplyNftTransferbyprojectwithchanneltenantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyNftTransferbyprojectwithchanneltenantResponse{}
	_body, _err := client.ApplyNftTransferbyprojectwithchanneltenantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 按项目表编码B2C发放NFT,带渠道租户
 * Summary: 按项目表编码B2C发放NFT,带渠道租户
 */
func (client *Client) ApplyNftTransferbyprojectwithchanneltenantEx(request *ApplyNftTransferbyprojectwithchanneltenantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyNftTransferbyprojectwithchanneltenantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyNftTransferbyprojectwithchanneltenantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftx.nft.transferbyprojectwithchanneltenant.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 第三方通过accessToken和nftId校验藏品归属及查询相应藏品信息
 * Summary: 校验藏品归属及查询相应藏品信息
 */
func (client *Client) QueryNftAsset(request *QueryNftAssetRequest) (_result *QueryNftAssetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryNftAssetResponse{}
	_body, _err := client.QueryNftAssetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 第三方通过accessToken和nftId校验藏品归属及查询相应藏品信息
 * Summary: 校验藏品归属及查询相应藏品信息
 */
func (client *Client) QueryNftAssetEx(request *QueryNftAssetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryNftAssetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryNftAssetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftx.nft.asset.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 基于直付通模式的开放订单支付接口
 * Summary: 开放订单支付接口
 */
func (client *Client) PayOrderData(request *PayOrderDataRequest) (_result *PayOrderDataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PayOrderDataResponse{}
	_body, _err := client.PayOrderDataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 基于直付通模式的开放订单支付接口
 * Summary: 开放订单支付接口
 */
func (client *Client) PayOrderDataEx(request *PayOrderDataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PayOrderDataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PayOrderDataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftx.order.data.pay"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 外部订单数据同步，包括取消、完成，未来会扩展额外数据
 * Summary: 外部订单数据同步
 */
func (client *Client) SyncOrderData(request *SyncOrderDataRequest) (_result *SyncOrderDataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncOrderDataResponse{}
	_body, _err := client.SyncOrderDataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 外部订单数据同步，包括取消、完成，未来会扩展额外数据
 * Summary: 外部订单数据同步
 */
func (client *Client) SyncOrderDataEx(request *SyncOrderDataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncOrderDataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncOrderDataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftx.order.data.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 拿authcode换token
 * Summary: 拿authcode换token
 */
func (client *Client) ApplyOauthToken(request *ApplyOauthTokenRequest) (_result *ApplyOauthTokenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyOauthTokenResponse{}
	_body, _err := client.ApplyOauthTokenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 拿authcode换token
 * Summary: 拿authcode换token
 */
func (client *Client) ApplyOauthTokenEx(request *ApplyOauthTokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyOauthTokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyOauthTokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftx.oauth.token.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
