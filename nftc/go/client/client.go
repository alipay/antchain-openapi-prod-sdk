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

// 数字人部件素材对象
type AvatarMaterialDTO struct {
	// json配置
	Json *string `json:"json,omitempty" xml:"json,omitempty" require:"true"`
	// 装扮id
	DecoId *string `json:"deco_id,omitempty" xml:"deco_id,omitempty" require:"true"`
	// 装扮名称
	DecoName *string `json:"deco_name,omitempty" xml:"deco_name,omitempty" require:"true"`
	// webGl ab包地址
	WebAbUrl *string `json:"web_ab_url,omitempty" xml:"web_ab_url,omitempty" require:"true"`
	// 贴图文件配置
	TextureUrl *string `json:"texture_url,omitempty" xml:"texture_url,omitempty" require:"true"`
	// 缩略图
	Thumbnail *string `json:"thumbnail,omitempty" xml:"thumbnail,omitempty" require:"true"`
	// json字符串，装扮额外属性信息
	// 如自定义头发颜色，性别等
	AvatarPvJson *string `json:"avatar_pv_json,omitempty" xml:"avatar_pv_json,omitempty" require:"true"`
	// 安卓ab包
	AndroidAbUrl *string `json:"android_ab_url,omitempty" xml:"android_ab_url,omitempty" require:"true"`
	// IOS AB 包
	IosAbUrl *string `json:"ios_ab_url,omitempty" xml:"ios_ab_url,omitempty" require:"true"`
	// 法令贴图文件
	FalingTextureUrl *string `json:"faling_texture_url,omitempty" xml:"faling_texture_url,omitempty" require:"true"`
}

func (s AvatarMaterialDTO) String() string {
	return tea.Prettify(s)
}

func (s AvatarMaterialDTO) GoString() string {
	return s.String()
}

func (s *AvatarMaterialDTO) SetJson(v string) *AvatarMaterialDTO {
	s.Json = &v
	return s
}

func (s *AvatarMaterialDTO) SetDecoId(v string) *AvatarMaterialDTO {
	s.DecoId = &v
	return s
}

func (s *AvatarMaterialDTO) SetDecoName(v string) *AvatarMaterialDTO {
	s.DecoName = &v
	return s
}

func (s *AvatarMaterialDTO) SetWebAbUrl(v string) *AvatarMaterialDTO {
	s.WebAbUrl = &v
	return s
}

func (s *AvatarMaterialDTO) SetTextureUrl(v string) *AvatarMaterialDTO {
	s.TextureUrl = &v
	return s
}

func (s *AvatarMaterialDTO) SetThumbnail(v string) *AvatarMaterialDTO {
	s.Thumbnail = &v
	return s
}

func (s *AvatarMaterialDTO) SetAvatarPvJson(v string) *AvatarMaterialDTO {
	s.AvatarPvJson = &v
	return s
}

func (s *AvatarMaterialDTO) SetAndroidAbUrl(v string) *AvatarMaterialDTO {
	s.AndroidAbUrl = &v
	return s
}

func (s *AvatarMaterialDTO) SetIosAbUrl(v string) *AvatarMaterialDTO {
	s.IosAbUrl = &v
	return s
}

func (s *AvatarMaterialDTO) SetFalingTextureUrl(v string) *AvatarMaterialDTO {
	s.FalingTextureUrl = &v
	return s
}

// 订单商品对象
type ExternalOrderItemDTO struct {
	// 购买的sku id
	SkuId *int64 `json:"sku_id,omitempty" xml:"sku_id,omitempty" require:"true"`
	// 购买后对应发放的藏品nftId，仅当orderStatus为FINISH时返回
	NftId *string `json:"nft_id,omitempty" xml:"nft_id,omitempty" require:"true"`
}

func (s ExternalOrderItemDTO) String() string {
	return tea.Prettify(s)
}

func (s ExternalOrderItemDTO) GoString() string {
	return s.String()
}

func (s *ExternalOrderItemDTO) SetSkuId(v int64) *ExternalOrderItemDTO {
	s.SkuId = &v
	return s
}

func (s *ExternalOrderItemDTO) SetNftId(v string) *ExternalOrderItemDTO {
	s.NftId = &v
	return s
}

// 通用资源差量包信息
type GeneralResourcePatch struct {
	// 差量包文件下载地址
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 差量包的旧版本号
	OldVersion *int64 `json:"old_version,omitempty" xml:"old_version,omitempty" require:"true"`
	// md5摘要值
	Md5 *string `json:"md5,omitempty" xml:"md5,omitempty" require:"true"`
	// 差量包文件大小
	Size *int64 `json:"size,omitempty" xml:"size,omitempty" require:"true"`
}

func (s GeneralResourcePatch) String() string {
	return tea.Prettify(s)
}

func (s GeneralResourcePatch) GoString() string {
	return s.String()
}

func (s *GeneralResourcePatch) SetUrl(v string) *GeneralResourcePatch {
	s.Url = &v
	return s
}

func (s *GeneralResourcePatch) SetOldVersion(v int64) *GeneralResourcePatch {
	s.OldVersion = &v
	return s
}

func (s *GeneralResourcePatch) SetMd5(v string) *GeneralResourcePatch {
	s.Md5 = &v
	return s
}

func (s *GeneralResourcePatch) SetSize(v int64) *GeneralResourcePatch {
	s.Size = &v
	return s
}

// 七麦安卓ASO接入信息
type Data struct {
	// 订单安排日期
	Day *string `json:"day,omitempty" xml:"day,omitempty" require:"true"`
	// 设备信息（oaid）
	Device *string `json:"device,omitempty" xml:"device,omitempty" require:"true"`
	// 关键词
	Keyword *string `json:"keyword,omitempty" xml:"keyword,omitempty" require:"true"`
	// 应用商店id
	// 2:OPPO
	// 3:联想
	// 4:华为
	// 5:小米
	// 6:魅族
	// 7:360
	// 8:应用宝
	// 9:VIVO
	StoreId *string `json:"store_id,omitempty" xml:"store_id,omitempty" require:"true"`
	// 应用商店描述
	StoreDesc *string `json:"store_desc,omitempty" xml:"store_desc,omitempty" require:"true"`
	// 激活时间
	ActiveTime *string `json:"active_time,omitempty" xml:"active_time,omitempty" require:"true"`
	// 任务截图1
	ImgUrl1 *string `json:"img_url_1,omitempty" xml:"img_url_1,omitempty" require:"true"`
	// 任务截图2
	ImgUrl2 *string `json:"img_url_2,omitempty" xml:"img_url_2,omitempty" require:"true"`
}

func (s Data) String() string {
	return tea.Prettify(s)
}

func (s Data) GoString() string {
	return s.String()
}

func (s *Data) SetDay(v string) *Data {
	s.Day = &v
	return s
}

func (s *Data) SetDevice(v string) *Data {
	s.Device = &v
	return s
}

func (s *Data) SetKeyword(v string) *Data {
	s.Keyword = &v
	return s
}

func (s *Data) SetStoreId(v string) *Data {
	s.StoreId = &v
	return s
}

func (s *Data) SetStoreDesc(v string) *Data {
	s.StoreDesc = &v
	return s
}

func (s *Data) SetActiveTime(v string) *Data {
	s.ActiveTime = &v
	return s
}

func (s *Data) SetImgUrl1(v string) *Data {
	s.ImgUrl1 = &v
	return s
}

func (s *Data) SetImgUrl2(v string) *Data {
	s.ImgUrl2 = &v
	return s
}

// 外部订单对象
type ExternalOrderDTO struct {
	// 订单的状态
	// PAID 已支付
	// PENDING 待支付
	// NOT_EXIST 不存在
	OrderStatus *string `json:"order_status,omitempty" xml:"order_status,omitempty" require:"true"`
	// 只有在PAID状态下，此字段才会有值
	// 由于当前一笔订单只会购买一个资产，因此当前list中只会有一个值
	OrderItemList []*ExternalOrderItemDTO `json:"order_item_list,omitempty" xml:"order_item_list,omitempty" type:"Repeated"`
}

func (s ExternalOrderDTO) String() string {
	return tea.Prettify(s)
}

func (s ExternalOrderDTO) GoString() string {
	return s.String()
}

func (s *ExternalOrderDTO) SetOrderStatus(v string) *ExternalOrderDTO {
	s.OrderStatus = &v
	return s
}

func (s *ExternalOrderDTO) SetOrderItemList(v []*ExternalOrderItemDTO) *ExternalOrderDTO {
	s.OrderItemList = v
	return s
}

// 数字人整体形象
type AvatarDTO struct {
	// 数字人基础脸部模型
	AvatarFaceUrl *string `json:"avatar_face_url,omitempty" xml:"avatar_face_url,omitempty" require:"true"`
	// 数字人基础脸部Json配置
	AvatarFaceJson *string `json:"avatar_face_json,omitempty" xml:"avatar_face_json,omitempty" require:"true"`
	// 上衣配置
	Upcloth *AvatarMaterialDTO `json:"upcloth,omitempty" xml:"upcloth,omitempty" require:"true"`
	// 下衣配置
	Downcloth *AvatarMaterialDTO `json:"downcloth,omitempty" xml:"downcloth,omitempty" require:"true"`
	// 鞋子配置
	Shoe *AvatarMaterialDTO `json:"shoe,omitempty" xml:"shoe,omitempty" require:"true"`
	// 套装配置
	Suit *AvatarMaterialDTO `json:"suit,omitempty" xml:"suit,omitempty" require:"true"`
	// 项链配置
	Necklace *AvatarMaterialDTO `json:"necklace,omitempty" xml:"necklace,omitempty" require:"true"`
	// 帽子配置
	Hat *AvatarMaterialDTO `json:"hat,omitempty" xml:"hat,omitempty" require:"true"`
	// 眼镜配置
	Glass *AvatarMaterialDTO `json:"glass,omitempty" xml:"glass,omitempty" require:"true"`
	// 头发配置
	Hair *AvatarMaterialDTO `json:"hair,omitempty" xml:"hair,omitempty" require:"true"`
	// 脸型配置
	Head *AvatarMaterialDTO `json:"head,omitempty" xml:"head,omitempty" require:"true"`
	// 眉毛配置
	Eyebrow *AvatarMaterialDTO `json:"eyebrow,omitempty" xml:"eyebrow,omitempty" require:"true"`
	// 眼睛配置
	Eye *AvatarMaterialDTO `json:"eye,omitempty" xml:"eye,omitempty" require:"true"`
	// 嘴巴配置
	Lip *AvatarMaterialDTO `json:"lip,omitempty" xml:"lip,omitempty" require:"true"`
	// 鼻子配置
	Nose *AvatarMaterialDTO `json:"nose,omitempty" xml:"nose,omitempty" require:"true"`
	// 腮红配置
	Rouge *AvatarMaterialDTO `json:"rouge,omitempty" xml:"rouge,omitempty" require:"true"`
	// 美瞳配置
	Lens *AvatarMaterialDTO `json:"lens,omitempty" xml:"lens,omitempty" require:"true"`
	// 睫毛配置
	Eyelash *AvatarMaterialDTO `json:"eyelash,omitempty" xml:"eyelash,omitempty" require:"true"`
	// 唇妆配置
	Lipstick *AvatarMaterialDTO `json:"lipstick,omitempty" xml:"lipstick,omitempty" require:"true"`
	// 眼线配置
	Eyeliner *AvatarMaterialDTO `json:"eyeliner,omitempty" xml:"eyeliner,omitempty" require:"true"`
	// 眼影配置
	Eyeshadow *AvatarMaterialDTO `json:"eyeshadow,omitempty" xml:"eyeshadow,omitempty" require:"true"`
	// webgl ab包链接
	AvatarWebGlUnityBodyUrl *string `json:"avatar_web_gl_unity_body_url,omitempty" xml:"avatar_web_gl_unity_body_url,omitempty" require:"true"`
	// ios ab包链接
	AvatarIosUnityBodyUrl *string `json:"avatar_ios_unity_body_url,omitempty" xml:"avatar_ios_unity_body_url,omitempty" require:"true"`
	// android ab包链接
	AvatarAndroidUnityBodyUrl *string `json:"avatar_android_unity_body_url,omitempty" xml:"avatar_android_unity_body_url,omitempty" require:"true"`
	// 默认Unity配置
	DefaultUnityConfig *string `json:"default_unity_config,omitempty" xml:"default_unity_config,omitempty" require:"true"`
	// 袜子配置
	Sock *AvatarMaterialDTO `json:"sock,omitempty" xml:"sock,omitempty" require:"true"`
	// 背持配置
	Backpack *AvatarMaterialDTO `json:"backpack,omitempty" xml:"backpack,omitempty" require:"true"`
	// 手部配置
	Hand *AvatarMaterialDTO `json:"hand,omitempty" xml:"hand,omitempty" require:"true"`
	// 耳环配置
	Earring *AvatarMaterialDTO `json:"earring,omitempty" xml:"earring,omitempty" require:"true"`
}

func (s AvatarDTO) String() string {
	return tea.Prettify(s)
}

func (s AvatarDTO) GoString() string {
	return s.String()
}

func (s *AvatarDTO) SetAvatarFaceUrl(v string) *AvatarDTO {
	s.AvatarFaceUrl = &v
	return s
}

func (s *AvatarDTO) SetAvatarFaceJson(v string) *AvatarDTO {
	s.AvatarFaceJson = &v
	return s
}

func (s *AvatarDTO) SetUpcloth(v *AvatarMaterialDTO) *AvatarDTO {
	s.Upcloth = v
	return s
}

func (s *AvatarDTO) SetDowncloth(v *AvatarMaterialDTO) *AvatarDTO {
	s.Downcloth = v
	return s
}

func (s *AvatarDTO) SetShoe(v *AvatarMaterialDTO) *AvatarDTO {
	s.Shoe = v
	return s
}

func (s *AvatarDTO) SetSuit(v *AvatarMaterialDTO) *AvatarDTO {
	s.Suit = v
	return s
}

func (s *AvatarDTO) SetNecklace(v *AvatarMaterialDTO) *AvatarDTO {
	s.Necklace = v
	return s
}

func (s *AvatarDTO) SetHat(v *AvatarMaterialDTO) *AvatarDTO {
	s.Hat = v
	return s
}

func (s *AvatarDTO) SetGlass(v *AvatarMaterialDTO) *AvatarDTO {
	s.Glass = v
	return s
}

func (s *AvatarDTO) SetHair(v *AvatarMaterialDTO) *AvatarDTO {
	s.Hair = v
	return s
}

func (s *AvatarDTO) SetHead(v *AvatarMaterialDTO) *AvatarDTO {
	s.Head = v
	return s
}

func (s *AvatarDTO) SetEyebrow(v *AvatarMaterialDTO) *AvatarDTO {
	s.Eyebrow = v
	return s
}

func (s *AvatarDTO) SetEye(v *AvatarMaterialDTO) *AvatarDTO {
	s.Eye = v
	return s
}

func (s *AvatarDTO) SetLip(v *AvatarMaterialDTO) *AvatarDTO {
	s.Lip = v
	return s
}

func (s *AvatarDTO) SetNose(v *AvatarMaterialDTO) *AvatarDTO {
	s.Nose = v
	return s
}

func (s *AvatarDTO) SetRouge(v *AvatarMaterialDTO) *AvatarDTO {
	s.Rouge = v
	return s
}

func (s *AvatarDTO) SetLens(v *AvatarMaterialDTO) *AvatarDTO {
	s.Lens = v
	return s
}

func (s *AvatarDTO) SetEyelash(v *AvatarMaterialDTO) *AvatarDTO {
	s.Eyelash = v
	return s
}

func (s *AvatarDTO) SetLipstick(v *AvatarMaterialDTO) *AvatarDTO {
	s.Lipstick = v
	return s
}

func (s *AvatarDTO) SetEyeliner(v *AvatarMaterialDTO) *AvatarDTO {
	s.Eyeliner = v
	return s
}

func (s *AvatarDTO) SetEyeshadow(v *AvatarMaterialDTO) *AvatarDTO {
	s.Eyeshadow = v
	return s
}

func (s *AvatarDTO) SetAvatarWebGlUnityBodyUrl(v string) *AvatarDTO {
	s.AvatarWebGlUnityBodyUrl = &v
	return s
}

func (s *AvatarDTO) SetAvatarIosUnityBodyUrl(v string) *AvatarDTO {
	s.AvatarIosUnityBodyUrl = &v
	return s
}

func (s *AvatarDTO) SetAvatarAndroidUnityBodyUrl(v string) *AvatarDTO {
	s.AvatarAndroidUnityBodyUrl = &v
	return s
}

func (s *AvatarDTO) SetDefaultUnityConfig(v string) *AvatarDTO {
	s.DefaultUnityConfig = &v
	return s
}

func (s *AvatarDTO) SetSock(v *AvatarMaterialDTO) *AvatarDTO {
	s.Sock = v
	return s
}

func (s *AvatarDTO) SetBackpack(v *AvatarMaterialDTO) *AvatarDTO {
	s.Backpack = v
	return s
}

func (s *AvatarDTO) SetHand(v *AvatarMaterialDTO) *AvatarDTO {
	s.Hand = v
	return s
}

func (s *AvatarDTO) SetEarring(v *AvatarMaterialDTO) *AvatarDTO {
	s.Earring = v
	return s
}

// 用户资产
//
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
	// 缩略图url
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

type QueryAsoDistinctRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// App ID
	Appid *string `json:"appid,omitempty" xml:"appid,omitempty" require:"true"`
	// 苹果设备的 IDFA
	Idfa *string `json:"idfa,omitempty" xml:"idfa,omitempty" require:"true"`
	// 渠道标识(默认 qimai )
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
}

func (s QueryAsoDistinctRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAsoDistinctRequest) GoString() string {
	return s.String()
}

func (s *QueryAsoDistinctRequest) SetAuthToken(v string) *QueryAsoDistinctRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAsoDistinctRequest) SetProductInstanceId(v string) *QueryAsoDistinctRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAsoDistinctRequest) SetAppid(v string) *QueryAsoDistinctRequest {
	s.Appid = &v
	return s
}

func (s *QueryAsoDistinctRequest) SetIdfa(v string) *QueryAsoDistinctRequest {
	s.Idfa = &v
	return s
}

func (s *QueryAsoDistinctRequest) SetSource(v string) *QueryAsoDistinctRequest {
	s.Source = &v
	return s
}

type QueryAsoDistinctResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否激活
	// -1: 失败; 0: 未激活; 1:已激活
	Idfa *string `json:"idfa,omitempty" xml:"idfa,omitempty"`
}

func (s QueryAsoDistinctResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAsoDistinctResponse) GoString() string {
	return s.String()
}

func (s *QueryAsoDistinctResponse) SetReqMsgId(v string) *QueryAsoDistinctResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAsoDistinctResponse) SetResultCode(v string) *QueryAsoDistinctResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAsoDistinctResponse) SetResultMsg(v string) *QueryAsoDistinctResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAsoDistinctResponse) SetIdfa(v string) *QueryAsoDistinctResponse {
	s.Idfa = &v
	return s
}

type SubmitAsoClickRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// App ID
	Appid *string `json:"appid,omitempty" xml:"appid,omitempty" require:"true"`
	// 苹果设备的 IDFA
	Idfa *string `json:"idfa,omitempty" xml:"idfa,omitempty" require:"true"`
	// 用户终端的公网IP地址
	Ip *string `json:"ip,omitempty" xml:"ip,omitempty" require:"true"`
	// 用户代理(User Agent)
	Ua *string `json:"ua,omitempty" xml:"ua,omitempty" require:"true"`
	// 渠道标识(默认 qimai )
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
	// urlencode后的回调地址
	Callback *string `json:"callback,omitempty" xml:"callback,omitempty" require:"true"`
	// 手机型号 iphone10,3
	Model *string `json:"model,omitempty" xml:"model,omitempty"`
}

func (s SubmitAsoClickRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitAsoClickRequest) GoString() string {
	return s.String()
}

func (s *SubmitAsoClickRequest) SetAuthToken(v string) *SubmitAsoClickRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitAsoClickRequest) SetProductInstanceId(v string) *SubmitAsoClickRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitAsoClickRequest) SetAppid(v string) *SubmitAsoClickRequest {
	s.Appid = &v
	return s
}

func (s *SubmitAsoClickRequest) SetIdfa(v string) *SubmitAsoClickRequest {
	s.Idfa = &v
	return s
}

func (s *SubmitAsoClickRequest) SetIp(v string) *SubmitAsoClickRequest {
	s.Ip = &v
	return s
}

func (s *SubmitAsoClickRequest) SetUa(v string) *SubmitAsoClickRequest {
	s.Ua = &v
	return s
}

func (s *SubmitAsoClickRequest) SetSource(v string) *SubmitAsoClickRequest {
	s.Source = &v
	return s
}

func (s *SubmitAsoClickRequest) SetCallback(v string) *SubmitAsoClickRequest {
	s.Callback = &v
	return s
}

func (s *SubmitAsoClickRequest) SetModel(v string) *SubmitAsoClickRequest {
	s.Model = &v
	return s
}

type SubmitAsoClickResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功 0: 失败; 1:成功
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s SubmitAsoClickResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitAsoClickResponse) GoString() string {
	return s.String()
}

func (s *SubmitAsoClickResponse) SetReqMsgId(v string) *SubmitAsoClickResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitAsoClickResponse) SetResultCode(v string) *SubmitAsoClickResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitAsoClickResponse) SetResultMsg(v string) *SubmitAsoClickResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitAsoClickResponse) SetResult(v string) *SubmitAsoClickResponse {
	s.Result = &v
	return s
}

type SubmitAsoAndroidclickRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 提交的批量数据
	DataList []*Data `json:"data_list,omitempty" xml:"data_list,omitempty" require:"true" type:"Repeated"`
	// 数据来源:qimai
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
}

func (s SubmitAsoAndroidclickRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitAsoAndroidclickRequest) GoString() string {
	return s.String()
}

func (s *SubmitAsoAndroidclickRequest) SetAuthToken(v string) *SubmitAsoAndroidclickRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitAsoAndroidclickRequest) SetProductInstanceId(v string) *SubmitAsoAndroidclickRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitAsoAndroidclickRequest) SetDataList(v []*Data) *SubmitAsoAndroidclickRequest {
	s.DataList = v
	return s
}

func (s *SubmitAsoAndroidclickRequest) SetSource(v string) *SubmitAsoAndroidclickRequest {
	s.Source = &v
	return s
}

type SubmitAsoAndroidclickResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s SubmitAsoAndroidclickResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitAsoAndroidclickResponse) GoString() string {
	return s.String()
}

func (s *SubmitAsoAndroidclickResponse) SetReqMsgId(v string) *SubmitAsoAndroidclickResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitAsoAndroidclickResponse) SetResultCode(v string) *SubmitAsoAndroidclickResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitAsoAndroidclickResponse) SetResultMsg(v string) *SubmitAsoAndroidclickResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitAsoAndroidclickResponse) SetResult(v string) *SubmitAsoAndroidclickResponse {
	s.Result = &v
	return s
}

type QueryAvatarProfileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 在antchain.nftc.oauth.token.apply接口内获取到的AccessToken，带过期时间，可唯一确定当前用户
	AccessToken *string `json:"access_token,omitempty" xml:"access_token,omitempty" require:"true"`
}

func (s QueryAvatarProfileRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAvatarProfileRequest) GoString() string {
	return s.String()
}

func (s *QueryAvatarProfileRequest) SetAuthToken(v string) *QueryAvatarProfileRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAvatarProfileRequest) SetProductInstanceId(v string) *QueryAvatarProfileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAvatarProfileRequest) SetAccessToken(v string) *QueryAvatarProfileRequest {
	s.AccessToken = &v
	return s
}

type QueryAvatarProfileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数字人整体形象数据
	AvatarInfo *AvatarDTO `json:"avatar_info,omitempty" xml:"avatar_info,omitempty"`
}

func (s QueryAvatarProfileResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAvatarProfileResponse) GoString() string {
	return s.String()
}

func (s *QueryAvatarProfileResponse) SetReqMsgId(v string) *QueryAvatarProfileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAvatarProfileResponse) SetResultCode(v string) *QueryAvatarProfileResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAvatarProfileResponse) SetResultMsg(v string) *QueryAvatarProfileResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAvatarProfileResponse) SetAvatarInfo(v *AvatarDTO) *QueryAvatarProfileResponse {
	s.AvatarInfo = v
	return s
}

type QueryPromoteActivityRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 助力活动的活动规则编码
	PromoteId *string `json:"promote_id,omitempty" xml:"promote_id,omitempty" require:"true"`
	// 用户授权token
	AccessToken *string `json:"access_token,omitempty" xml:"access_token,omitempty" require:"true"`
}

func (s QueryPromoteActivityRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryPromoteActivityRequest) GoString() string {
	return s.String()
}

func (s *QueryPromoteActivityRequest) SetAuthToken(v string) *QueryPromoteActivityRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryPromoteActivityRequest) SetProductInstanceId(v string) *QueryPromoteActivityRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryPromoteActivityRequest) SetPromoteId(v string) *QueryPromoteActivityRequest {
	s.PromoteId = &v
	return s
}

func (s *QueryPromoteActivityRequest) SetAccessToken(v string) *QueryPromoteActivityRequest {
	s.AccessToken = &v
	return s
}

type QueryPromoteActivityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 助力活动的活动规则编码
	PromoteId *string `json:"promote_id,omitempty" xml:"promote_id,omitempty"`
	// 活动状态：
	// ENABLE（进行中）
	// END（活动结束）
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 助力活动类型
	// ONCE（生命周期内一次）
	// DAILY（每日一次）
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 活动开始时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 活动结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 最大助力人数
	MaxNum *int64 `json:"max_num,omitempty" xml:"max_num,omitempty"`
	// 当前助力成功人数
	CurNum *int64 `json:"cur_num,omitempty" xml:"cur_num,omitempty"`
	// 参与助力的唯一编码，供三方幂等记录并唯一发奖
	PromoteList []*string `json:"promote_list,omitempty" xml:"promote_list,omitempty" type:"Repeated"`
}

func (s QueryPromoteActivityResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryPromoteActivityResponse) GoString() string {
	return s.String()
}

func (s *QueryPromoteActivityResponse) SetReqMsgId(v string) *QueryPromoteActivityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryPromoteActivityResponse) SetResultCode(v string) *QueryPromoteActivityResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryPromoteActivityResponse) SetResultMsg(v string) *QueryPromoteActivityResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryPromoteActivityResponse) SetPromoteId(v string) *QueryPromoteActivityResponse {
	s.PromoteId = &v
	return s
}

func (s *QueryPromoteActivityResponse) SetStatus(v string) *QueryPromoteActivityResponse {
	s.Status = &v
	return s
}

func (s *QueryPromoteActivityResponse) SetType(v string) *QueryPromoteActivityResponse {
	s.Type = &v
	return s
}

func (s *QueryPromoteActivityResponse) SetStartTime(v string) *QueryPromoteActivityResponse {
	s.StartTime = &v
	return s
}

func (s *QueryPromoteActivityResponse) SetEndTime(v string) *QueryPromoteActivityResponse {
	s.EndTime = &v
	return s
}

func (s *QueryPromoteActivityResponse) SetMaxNum(v int64) *QueryPromoteActivityResponse {
	s.MaxNum = &v
	return s
}

func (s *QueryPromoteActivityResponse) SetCurNum(v int64) *QueryPromoteActivityResponse {
	s.CurNum = &v
	return s
}

func (s *QueryPromoteActivityResponse) SetPromoteList(v []*string) *QueryPromoteActivityResponse {
	s.PromoteList = v
	return s
}

type GetPromoteShareurlRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 助力活动的活动规则编码
	PromoteId *string `json:"promote_id,omitempty" xml:"promote_id,omitempty" require:"true"`
	// 用户授权token
	AccessToken *string `json:"access_token,omitempty" xml:"access_token,omitempty" require:"true"`
}

func (s GetPromoteShareurlRequest) String() string {
	return tea.Prettify(s)
}

func (s GetPromoteShareurlRequest) GoString() string {
	return s.String()
}

func (s *GetPromoteShareurlRequest) SetAuthToken(v string) *GetPromoteShareurlRequest {
	s.AuthToken = &v
	return s
}

func (s *GetPromoteShareurlRequest) SetProductInstanceId(v string) *GetPromoteShareurlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetPromoteShareurlRequest) SetPromoteId(v string) *GetPromoteShareurlRequest {
	s.PromoteId = &v
	return s
}

func (s *GetPromoteShareurlRequest) SetAccessToken(v string) *GetPromoteShareurlRequest {
	s.AccessToken = &v
	return s
}

type GetPromoteShareurlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 经处理过的分享落地页面的链接，该落地页面由鲸探实现
	ShareUrl *string `json:"share_url,omitempty" xml:"share_url,omitempty"`
}

func (s GetPromoteShareurlResponse) String() string {
	return tea.Prettify(s)
}

func (s GetPromoteShareurlResponse) GoString() string {
	return s.String()
}

func (s *GetPromoteShareurlResponse) SetReqMsgId(v string) *GetPromoteShareurlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetPromoteShareurlResponse) SetResultCode(v string) *GetPromoteShareurlResponse {
	s.ResultCode = &v
	return s
}

func (s *GetPromoteShareurlResponse) SetResultMsg(v string) *GetPromoteShareurlResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetPromoteShareurlResponse) SetShareUrl(v string) *GetPromoteShareurlResponse {
	s.ShareUrl = &v
	return s
}

type ConfirmTaskRewardRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 鲸探用户唯一标识
	OpenUserId *string `json:"open_user_id,omitempty" xml:"open_user_id,omitempty" require:"true"`
	// 前置通过消息获取的奖励流水唯—id(可用作幂等键，详情看下文的奖励消息通知)
	RewardRecordId *string `json:"reward_record_id,omitempty" xml:"reward_record_id,omitempty" require:"true"`
}

func (s ConfirmTaskRewardRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmTaskRewardRequest) GoString() string {
	return s.String()
}

func (s *ConfirmTaskRewardRequest) SetAuthToken(v string) *ConfirmTaskRewardRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmTaskRewardRequest) SetProductInstanceId(v string) *ConfirmTaskRewardRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ConfirmTaskRewardRequest) SetOpenUserId(v string) *ConfirmTaskRewardRequest {
	s.OpenUserId = &v
	return s
}

func (s *ConfirmTaskRewardRequest) SetRewardRecordId(v string) *ConfirmTaskRewardRequest {
	s.RewardRecordId = &v
	return s
}

type ConfirmTaskRewardResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ConfirmTaskRewardResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmTaskRewardResponse) GoString() string {
	return s.String()
}

func (s *ConfirmTaskRewardResponse) SetReqMsgId(v string) *ConfirmTaskRewardResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmTaskRewardResponse) SetResultCode(v string) *ConfirmTaskRewardResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmTaskRewardResponse) SetResultMsg(v string) *ConfirmTaskRewardResponse {
	s.ResultMsg = &v
	return s
}

type ApplyOauthTokenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授权方式。支持：
	// 1.authorization_code，表示换取使用用户授权码code换取授权令牌access_token。
	// 2.refresh_token，表示使用refresh_token刷新获取新授权令牌。
	// refresh_token本期新增
	GrantType *string `json:"grant_type,omitempty" xml:"grant_type,omitempty" require:"true"`
	// 刷新令牌，上次换取访问令牌时得到。本参数在 grant_type 为 authorization_code 时不填；为 refresh_token 时必填；
	RefreshToken *string `json:"refresh_token,omitempty" xml:"refresh_token,omitempty"`
	// 授权码，用户对应用授权后得到。本参数在 grant_type 为 authorization_code 时必填，为 refresh_token 时不填
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty"`
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

func (s *ApplyOauthTokenRequest) SetRefreshToken(v string) *ApplyOauthTokenRequest {
	s.RefreshToken = &v
	return s
}

func (s *ApplyOauthTokenRequest) SetAuthCode(v string) *ApplyOauthTokenRequest {
	s.AuthCode = &v
	return s
}

type ApplyOauthTokenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 虚拟uid
	OpenUserId *string `json:"open_user_id,omitempty" xml:"open_user_id,omitempty"`
	// 后续调用接口健全的token，有效期30天
	AccessToken *string `json:"access_token,omitempty" xml:"access_token,omitempty"`
	// accessToken到期时间
	ExpireTime *string `json:"expire_time,omitempty" xml:"expire_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 刷新token，有效期90天
	RefreshToken *string `json:"refresh_token,omitempty" xml:"refresh_token,omitempty"`
	// refreshToken到期时间
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

func (s *ApplyOauthTokenResponse) SetOpenUserId(v string) *ApplyOauthTokenResponse {
	s.OpenUserId = &v
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

func (s *ApplyOauthTokenResponse) SetRefreshToken(v string) *ApplyOauthTokenResponse {
	s.RefreshToken = &v
	return s
}

func (s *ApplyOauthTokenResponse) SetRefreshExpireTime(v string) *ApplyOauthTokenResponse {
	s.RefreshExpireTime = &v
	return s
}

type QueryOauthUserinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// accessToken请求
	AccessToken *string `json:"access_token,omitempty" xml:"access_token,omitempty" require:"true"`
	// 查询信息范围,user_base_info-查询头像、昵称
	Scope *string `json:"scope,omitempty" xml:"scope,omitempty"`
}

func (s QueryOauthUserinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryOauthUserinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryOauthUserinfoRequest) SetAuthToken(v string) *QueryOauthUserinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryOauthUserinfoRequest) SetProductInstanceId(v string) *QueryOauthUserinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryOauthUserinfoRequest) SetAccessToken(v string) *QueryOauthUserinfoRequest {
	s.AccessToken = &v
	return s
}

func (s *QueryOauthUserinfoRequest) SetScope(v string) *QueryOauthUserinfoRequest {
	s.Scope = &v
	return s
}

type QueryOauthUserinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 昵称
	NickName *string `json:"nick_name,omitempty" xml:"nick_name,omitempty"`
	// 头像链接
	Avatar *string `json:"avatar,omitempty" xml:"avatar,omitempty"`
	// 用户id
	OpenUserId *string `json:"open_user_id,omitempty" xml:"open_user_id,omitempty"`
	// 租户下用户id
	TenantUid *string `json:"tenant_uid,omitempty" xml:"tenant_uid,omitempty"`
	// 用户手机号
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty"`
	// 0-未实名; 1-已实名
	IsRealNameVerified *int64 `json:"is_real_name_verified,omitempty" xml:"is_real_name_verified,omitempty"`
}

func (s QueryOauthUserinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryOauthUserinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryOauthUserinfoResponse) SetReqMsgId(v string) *QueryOauthUserinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryOauthUserinfoResponse) SetResultCode(v string) *QueryOauthUserinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryOauthUserinfoResponse) SetResultMsg(v string) *QueryOauthUserinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryOauthUserinfoResponse) SetNickName(v string) *QueryOauthUserinfoResponse {
	s.NickName = &v
	return s
}

func (s *QueryOauthUserinfoResponse) SetAvatar(v string) *QueryOauthUserinfoResponse {
	s.Avatar = &v
	return s
}

func (s *QueryOauthUserinfoResponse) SetOpenUserId(v string) *QueryOauthUserinfoResponse {
	s.OpenUserId = &v
	return s
}

func (s *QueryOauthUserinfoResponse) SetTenantUid(v string) *QueryOauthUserinfoResponse {
	s.TenantUid = &v
	return s
}

func (s *QueryOauthUserinfoResponse) SetPhone(v string) *QueryOauthUserinfoResponse {
	s.Phone = &v
	return s
}

func (s *QueryOauthUserinfoResponse) SetIsRealNameVerified(v int64) *QueryOauthUserinfoResponse {
	s.IsRealNameVerified = &v
	return s
}

type ApplyOauthUserinfotokenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// accessToken请求
	AccessToken *string `json:"access_token,omitempty" xml:"access_token,omitempty" require:"true"`
	// 拉起页面的场景
	// nft_details 订单详情页
	// oauth_page 授权登陆页
	PageTokenScene *string `json:"page_token_scene,omitempty" xml:"page_token_scene,omitempty" require:"true"`
}

func (s ApplyOauthUserinfotokenRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyOauthUserinfotokenRequest) GoString() string {
	return s.String()
}

func (s *ApplyOauthUserinfotokenRequest) SetAuthToken(v string) *ApplyOauthUserinfotokenRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyOauthUserinfotokenRequest) SetProductInstanceId(v string) *ApplyOauthUserinfotokenRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyOauthUserinfotokenRequest) SetAccessToken(v string) *ApplyOauthUserinfotokenRequest {
	s.AccessToken = &v
	return s
}

func (s *ApplyOauthUserinfotokenRequest) SetPageTokenScene(v string) *ApplyOauthUserinfotokenRequest {
	s.PageTokenScene = &v
	return s
}

type ApplyOauthUserinfotokenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户token，有效期5分钟
	UserInfoToken *string `json:"user_info_token,omitempty" xml:"user_info_token,omitempty"`
}

func (s ApplyOauthUserinfotokenResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyOauthUserinfotokenResponse) GoString() string {
	return s.String()
}

func (s *ApplyOauthUserinfotokenResponse) SetReqMsgId(v string) *ApplyOauthUserinfotokenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyOauthUserinfotokenResponse) SetResultCode(v string) *ApplyOauthUserinfotokenResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyOauthUserinfotokenResponse) SetResultMsg(v string) *ApplyOauthUserinfotokenResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyOauthUserinfotokenResponse) SetUserInfoToken(v string) *ApplyOauthUserinfotokenResponse {
	s.UserInfoToken = &v
	return s
}

type QueryOauthRealnameinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// token
	AccessToken *string `json:"access_token,omitempty" xml:"access_token,omitempty" require:"true"`
}

func (s QueryOauthRealnameinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryOauthRealnameinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryOauthRealnameinfoRequest) SetAuthToken(v string) *QueryOauthRealnameinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryOauthRealnameinfoRequest) SetProductInstanceId(v string) *QueryOauthRealnameinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryOauthRealnameinfoRequest) SetAccessToken(v string) *QueryOauthRealnameinfoRequest {
	s.AccessToken = &v
	return s
}

type QueryOauthRealnameinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实名
	RealName *string `json:"real_name,omitempty" xml:"real_name,omitempty"`
	// 身份证编号
	IdCard *string `json:"id_card,omitempty" xml:"id_card,omitempty"`
}

func (s QueryOauthRealnameinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryOauthRealnameinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryOauthRealnameinfoResponse) SetReqMsgId(v string) *QueryOauthRealnameinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryOauthRealnameinfoResponse) SetResultCode(v string) *QueryOauthRealnameinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryOauthRealnameinfoResponse) SetResultMsg(v string) *QueryOauthRealnameinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryOauthRealnameinfoResponse) SetRealName(v string) *QueryOauthRealnameinfoResponse {
	s.RealName = &v
	return s
}

func (s *QueryOauthRealnameinfoResponse) SetIdCard(v string) *QueryOauthRealnameinfoResponse {
	s.IdCard = &v
	return s
}

type SendSmsMessageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 短信模版Id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 手机号
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty" require:"true"`
	// 参数键值对
	TemplateArgs *string `json:"template_args,omitempty" xml:"template_args,omitempty" require:"true"`
}

func (s SendSmsMessageRequest) String() string {
	return tea.Prettify(s)
}

func (s SendSmsMessageRequest) GoString() string {
	return s.String()
}

func (s *SendSmsMessageRequest) SetAuthToken(v string) *SendSmsMessageRequest {
	s.AuthToken = &v
	return s
}

func (s *SendSmsMessageRequest) SetProductInstanceId(v string) *SendSmsMessageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendSmsMessageRequest) SetTemplateId(v string) *SendSmsMessageRequest {
	s.TemplateId = &v
	return s
}

func (s *SendSmsMessageRequest) SetPhone(v string) *SendSmsMessageRequest {
	s.Phone = &v
	return s
}

func (s *SendSmsMessageRequest) SetTemplateArgs(v string) *SendSmsMessageRequest {
	s.TemplateArgs = &v
	return s
}

type SendSmsMessageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SendSmsMessageResponse) String() string {
	return tea.Prettify(s)
}

func (s SendSmsMessageResponse) GoString() string {
	return s.String()
}

func (s *SendSmsMessageResponse) SetReqMsgId(v string) *SendSmsMessageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendSmsMessageResponse) SetResultCode(v string) *SendSmsMessageResponse {
	s.ResultCode = &v
	return s
}

func (s *SendSmsMessageResponse) SetResultMsg(v string) *SendSmsMessageResponse {
	s.ResultMsg = &v
	return s
}

type PublishMerchantDiyskuRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务请求id，用来做业务上的幂等。后面查询状态也是此字段
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// 调用渠道
	// PET 宠物
	// MEMBER 会员
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
	// 领取数字藏品的用户ID，支持2088/手机号/1322
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 支付宝2088账号：ALIPAY_UID
	// 手机号：PHONE_NO
	// 鲸探1322账号：FANS_UID
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty" require:"true"`
	// 需要发放的SKUID编码
	SkuId *string `json:"sku_id,omitempty" xml:"sku_id,omitempty" require:"true"`
	// 一期仅支持图片：IMAGE
	SkuType *string `json:"sku_type,omitempty" xml:"sku_type,omitempty" require:"true"`
	// 数字藏品的缩略图地址，可与原图相同也可不同，需要校验长宽比为1:1
	ThumbnailUrl *string `json:"thumbnail_url,omitempty" xml:"thumbnail_url,omitempty" require:"true"`
	// 数字藏品的原图地址，需要校验长宽比为1:1
	OriginalUrl *string `json:"original_url,omitempty" xml:"original_url,omitempty" require:"true"`
}

func (s PublishMerchantDiyskuRequest) String() string {
	return tea.Prettify(s)
}

func (s PublishMerchantDiyskuRequest) GoString() string {
	return s.String()
}

func (s *PublishMerchantDiyskuRequest) SetAuthToken(v string) *PublishMerchantDiyskuRequest {
	s.AuthToken = &v
	return s
}

func (s *PublishMerchantDiyskuRequest) SetProductInstanceId(v string) *PublishMerchantDiyskuRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PublishMerchantDiyskuRequest) SetBizNo(v string) *PublishMerchantDiyskuRequest {
	s.BizNo = &v
	return s
}

func (s *PublishMerchantDiyskuRequest) SetChannel(v string) *PublishMerchantDiyskuRequest {
	s.Channel = &v
	return s
}

func (s *PublishMerchantDiyskuRequest) SetUserId(v string) *PublishMerchantDiyskuRequest {
	s.UserId = &v
	return s
}

func (s *PublishMerchantDiyskuRequest) SetUserType(v string) *PublishMerchantDiyskuRequest {
	s.UserType = &v
	return s
}

func (s *PublishMerchantDiyskuRequest) SetSkuId(v string) *PublishMerchantDiyskuRequest {
	s.SkuId = &v
	return s
}

func (s *PublishMerchantDiyskuRequest) SetSkuType(v string) *PublishMerchantDiyskuRequest {
	s.SkuType = &v
	return s
}

func (s *PublishMerchantDiyskuRequest) SetThumbnailUrl(v string) *PublishMerchantDiyskuRequest {
	s.ThumbnailUrl = &v
	return s
}

func (s *PublishMerchantDiyskuRequest) SetOriginalUrl(v string) *PublishMerchantDiyskuRequest {
	s.OriginalUrl = &v
	return s
}

type PublishMerchantDiyskuResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 生成的nftid结果
	NftId *string `json:"nft_id,omitempty" xml:"nft_id,omitempty"`
	// 获得时间
	ReceiveTime *string `json:"receive_time,omitempty" xml:"receive_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 发放状态
	// AUDIT_SUBMIT("审核中"),
	// AUDIT_SUCCESS("审核通过"),
	// AUDIT_FAIL("审核未通过"),
	// TRANSFER_UNKNOWN("发放结果未知"),
	// TRANSFER_SUCCESS("发放成功"),
	// TRANSFER_FAILED("发放失败"),
	// SHIELD("屏蔽"),
	// RECYCLE("回收"),
	SendStatus *string `json:"send_status,omitempty" xml:"send_status,omitempty"`
}

func (s PublishMerchantDiyskuResponse) String() string {
	return tea.Prettify(s)
}

func (s PublishMerchantDiyskuResponse) GoString() string {
	return s.String()
}

func (s *PublishMerchantDiyskuResponse) SetReqMsgId(v string) *PublishMerchantDiyskuResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PublishMerchantDiyskuResponse) SetResultCode(v string) *PublishMerchantDiyskuResponse {
	s.ResultCode = &v
	return s
}

func (s *PublishMerchantDiyskuResponse) SetResultMsg(v string) *PublishMerchantDiyskuResponse {
	s.ResultMsg = &v
	return s
}

func (s *PublishMerchantDiyskuResponse) SetNftId(v string) *PublishMerchantDiyskuResponse {
	s.NftId = &v
	return s
}

func (s *PublishMerchantDiyskuResponse) SetReceiveTime(v string) *PublishMerchantDiyskuResponse {
	s.ReceiveTime = &v
	return s
}

func (s *PublishMerchantDiyskuResponse) SetSendStatus(v string) *PublishMerchantDiyskuResponse {
	s.SendStatus = &v
	return s
}

type QueryMerchantDiyskuRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务请求id，用来做业务上的幂等
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// 领取数字藏品的用户ID，支持2088/手机号/1322
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s QueryMerchantDiyskuRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMerchantDiyskuRequest) GoString() string {
	return s.String()
}

func (s *QueryMerchantDiyskuRequest) SetAuthToken(v string) *QueryMerchantDiyskuRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMerchantDiyskuRequest) SetProductInstanceId(v string) *QueryMerchantDiyskuRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMerchantDiyskuRequest) SetBizNo(v string) *QueryMerchantDiyskuRequest {
	s.BizNo = &v
	return s
}

func (s *QueryMerchantDiyskuRequest) SetUserId(v string) *QueryMerchantDiyskuRequest {
	s.UserId = &v
	return s
}

type QueryMerchantDiyskuResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 生成的nftid结果
	NftId *string `json:"nft_id,omitempty" xml:"nft_id,omitempty"`
	// 获得时间
	ReceiveTime *string `json:"receive_time,omitempty" xml:"receive_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 发放状态
	// AUDIT_SUBMIT("审核中"),
	// AUDIT_SUCCESS("审核通过"),
	// AUDIT_FAIL("审核未通过"),
	// TRANSFER_UNKNOWN("发放结果未知"),
	// TRANSFER_SUCCESS("发放成功"),
	// TRANSFER_FAILED("发放失败"),
	// SHIELD("屏蔽"),
	// RECYCLE("回收"),
	SendStatus *string `json:"send_status,omitempty" xml:"send_status,omitempty"`
}

func (s QueryMerchantDiyskuResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMerchantDiyskuResponse) GoString() string {
	return s.String()
}

func (s *QueryMerchantDiyskuResponse) SetReqMsgId(v string) *QueryMerchantDiyskuResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMerchantDiyskuResponse) SetResultCode(v string) *QueryMerchantDiyskuResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMerchantDiyskuResponse) SetResultMsg(v string) *QueryMerchantDiyskuResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMerchantDiyskuResponse) SetNftId(v string) *QueryMerchantDiyskuResponse {
	s.NftId = &v
	return s
}

func (s *QueryMerchantDiyskuResponse) SetReceiveTime(v string) *QueryMerchantDiyskuResponse {
	s.ReceiveTime = &v
	return s
}

func (s *QueryMerchantDiyskuResponse) SetSendStatus(v string) *QueryMerchantDiyskuResponse {
	s.SendStatus = &v
	return s
}

type QueryMerchantUgcimagesRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// ugc资产铸造记录id列表
	RecordIdList []*string `json:"record_id_list,omitempty" xml:"record_id_list,omitempty" require:"true" type:"Repeated"`
	// 场景
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
}

func (s QueryMerchantUgcimagesRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMerchantUgcimagesRequest) GoString() string {
	return s.String()
}

func (s *QueryMerchantUgcimagesRequest) SetAuthToken(v string) *QueryMerchantUgcimagesRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMerchantUgcimagesRequest) SetProductInstanceId(v string) *QueryMerchantUgcimagesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMerchantUgcimagesRequest) SetRecordIdList(v []*string) *QueryMerchantUgcimagesRequest {
	s.RecordIdList = v
	return s
}

func (s *QueryMerchantUgcimagesRequest) SetBizScene(v string) *QueryMerchantUgcimagesRequest {
	s.BizScene = &v
	return s
}

type QueryMerchantUgcimagesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 入参中id对应的图片列表
	ImgList []*string `json:"img_list,omitempty" xml:"img_list,omitempty" type:"Repeated"`
}

func (s QueryMerchantUgcimagesResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMerchantUgcimagesResponse) GoString() string {
	return s.String()
}

func (s *QueryMerchantUgcimagesResponse) SetReqMsgId(v string) *QueryMerchantUgcimagesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMerchantUgcimagesResponse) SetResultCode(v string) *QueryMerchantUgcimagesResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMerchantUgcimagesResponse) SetResultMsg(v string) *QueryMerchantUgcimagesResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMerchantUgcimagesResponse) SetImgList(v []*string) *QueryMerchantUgcimagesResponse {
	s.ImgList = v
	return s
}

type ApplyNftTransferRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 藏品标识sku
	SkuId *int64 `json:"sku_id,omitempty" xml:"sku_id,omitempty" require:"true"`
	// 被转入用户的支付宝uid和手机号
	ToIdNo *string `json:"to_id_no,omitempty" xml:"to_id_no,omitempty" require:"true"`
	// 参照idType枚举
	ToIdType *string `json:"to_id_type,omitempty" xml:"to_id_type,omitempty" require:"true"`
	// 用户购买价格，可以为0，单位分
	PriceCent *int64 `json:"price_cent,omitempty" xml:"price_cent,omitempty" require:"true"`
	// 用户在商户购买的订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 调用方渠道租户，传租户id即可
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

func (s *ApplyNftTransferRequest) SetPriceCent(v int64) *ApplyNftTransferRequest {
	s.PriceCent = &v
	return s
}

func (s *ApplyNftTransferRequest) SetOrderNo(v string) *ApplyNftTransferRequest {
	s.OrderNo = &v
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
	// 标识一类NFT
	SkuId *int64 `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
	// 流转的nftId
	NftId *string `json:"nft_id,omitempty" xml:"nft_id,omitempty"`
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

type PagequeryNftCustomerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 页码
	Page *int64 `json:"page,omitempty" xml:"page,omitempty" require:"true"`
	// 分页大小-上限10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 用户标识
	IdNo *string `json:"id_no,omitempty" xml:"id_no,omitempty" require:"true"`
	// 用户id类型
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

func (s *PagequeryNftCustomerResponse) SetAssetList(v []*UserAsset) *PagequeryNftCustomerResponse {
	s.AssetList = v
	return s
}

type QueryNftOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务方侧唯一业务单号
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
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

func (s *QueryNftOrderRequest) SetBizNo(v string) *QueryNftOrderRequest {
	s.BizNo = &v
	return s
}

type QueryNftOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单状态
	ExternalOrder *ExternalOrderDTO `json:"external_order,omitempty" xml:"external_order,omitempty"`
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

func (s *QueryNftOrderResponse) SetExternalOrder(v *ExternalOrderDTO) *QueryNftOrderResponse {
	s.ExternalOrder = v
	return s
}

type QueryNftAssetbyskuRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 具体用户Id标识，支持不同类型的id标识，根据toIdType不同而不同
	IdNo *string `json:"id_no,omitempty" xml:"id_no,omitempty" require:"true"`
	// 参照idType枚举，支持手机号/openUserId
	IdType *string `json:"id_type,omitempty" xml:"id_type,omitempty" require:"true"`
	// 数字藏品类标识ID
	SkuId *string `json:"sku_id,omitempty" xml:"sku_id,omitempty" require:"true"`
	// 页码，从1开始
	Page *int64 `json:"page,omitempty" xml:"page,omitempty" require:"true"`
	// 分页大小-上限10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s QueryNftAssetbyskuRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryNftAssetbyskuRequest) GoString() string {
	return s.String()
}

func (s *QueryNftAssetbyskuRequest) SetAuthToken(v string) *QueryNftAssetbyskuRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryNftAssetbyskuRequest) SetProductInstanceId(v string) *QueryNftAssetbyskuRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryNftAssetbyskuRequest) SetIdNo(v string) *QueryNftAssetbyskuRequest {
	s.IdNo = &v
	return s
}

func (s *QueryNftAssetbyskuRequest) SetIdType(v string) *QueryNftAssetbyskuRequest {
	s.IdType = &v
	return s
}

func (s *QueryNftAssetbyskuRequest) SetSkuId(v string) *QueryNftAssetbyskuRequest {
	s.SkuId = &v
	return s
}

func (s *QueryNftAssetbyskuRequest) SetPage(v int64) *QueryNftAssetbyskuRequest {
	s.Page = &v
	return s
}

func (s *QueryNftAssetbyskuRequest) SetPageSize(v int64) *QueryNftAssetbyskuRequest {
	s.PageSize = &v
	return s
}

type QueryNftAssetbyskuResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户资产列表
	AssetList []*UserAsset `json:"asset_list,omitempty" xml:"asset_list,omitempty" type:"Repeated"`
	// 总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s QueryNftAssetbyskuResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryNftAssetbyskuResponse) GoString() string {
	return s.String()
}

func (s *QueryNftAssetbyskuResponse) SetReqMsgId(v string) *QueryNftAssetbyskuResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryNftAssetbyskuResponse) SetResultCode(v string) *QueryNftAssetbyskuResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryNftAssetbyskuResponse) SetResultMsg(v string) *QueryNftAssetbyskuResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryNftAssetbyskuResponse) SetAssetList(v []*UserAsset) *QueryNftAssetbyskuResponse {
	s.AssetList = v
	return s
}

func (s *QueryNftAssetbyskuResponse) SetTotalCount(v int64) *QueryNftAssetbyskuResponse {
	s.TotalCount = &v
	return s
}

type CheckNftAssetbyskuRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 鲸探用户ID标识，OpenApi场景使用的加密格式
	OpenUserId *string `json:"open_user_id,omitempty" xml:"open_user_id,omitempty" require:"true"`
	// 数字藏品类标识ID
	SkuId *int64 `json:"sku_id,omitempty" xml:"sku_id,omitempty" require:"true"`
}

func (s CheckNftAssetbyskuRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckNftAssetbyskuRequest) GoString() string {
	return s.String()
}

func (s *CheckNftAssetbyskuRequest) SetAuthToken(v string) *CheckNftAssetbyskuRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckNftAssetbyskuRequest) SetProductInstanceId(v string) *CheckNftAssetbyskuRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckNftAssetbyskuRequest) SetOpenUserId(v string) *CheckNftAssetbyskuRequest {
	s.OpenUserId = &v
	return s
}

func (s *CheckNftAssetbyskuRequest) SetSkuId(v int64) *CheckNftAssetbyskuRequest {
	s.SkuId = &v
	return s
}

type CheckNftAssetbyskuResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否已拥有对应sku的nft
	HasOwn *bool `json:"has_own,omitempty" xml:"has_own,omitempty"`
}

func (s CheckNftAssetbyskuResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckNftAssetbyskuResponse) GoString() string {
	return s.String()
}

func (s *CheckNftAssetbyskuResponse) SetReqMsgId(v string) *CheckNftAssetbyskuResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckNftAssetbyskuResponse) SetResultCode(v string) *CheckNftAssetbyskuResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckNftAssetbyskuResponse) SetResultMsg(v string) *CheckNftAssetbyskuResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckNftAssetbyskuResponse) SetHasOwn(v bool) *CheckNftAssetbyskuResponse {
	s.HasOwn = &v
	return s
}

type SendPromoPrizeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 鲸探用户唯一标识
	OpenUserId *string `json:"open_user_id,omitempty" xml:"open_user_id,omitempty" require:"true"`
	// 海豚活动ID，鲸探运营在海豚创建的活动ID
	CampId *string `json:"camp_id,omitempty" xml:"camp_id,omitempty" require:"true"`
	// 海豚奖品ID，鲸探运营在海豚创建的奖品ID
	PrizeId *string `json:"prize_id,omitempty" xml:"prize_id,omitempty" require:"true"`
	// 调用方唯一幂等号
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
}

func (s SendPromoPrizeRequest) String() string {
	return tea.Prettify(s)
}

func (s SendPromoPrizeRequest) GoString() string {
	return s.String()
}

func (s *SendPromoPrizeRequest) SetAuthToken(v string) *SendPromoPrizeRequest {
	s.AuthToken = &v
	return s
}

func (s *SendPromoPrizeRequest) SetProductInstanceId(v string) *SendPromoPrizeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendPromoPrizeRequest) SetOpenUserId(v string) *SendPromoPrizeRequest {
	s.OpenUserId = &v
	return s
}

func (s *SendPromoPrizeRequest) SetCampId(v string) *SendPromoPrizeRequest {
	s.CampId = &v
	return s
}

func (s *SendPromoPrizeRequest) SetPrizeId(v string) *SendPromoPrizeRequest {
	s.PrizeId = &v
	return s
}

func (s *SendPromoPrizeRequest) SetBizNo(v string) *SendPromoPrizeRequest {
	s.BizNo = &v
	return s
}

type SendPromoPrizeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SendPromoPrizeResponse) String() string {
	return tea.Prettify(s)
}

func (s SendPromoPrizeResponse) GoString() string {
	return s.String()
}

func (s *SendPromoPrizeResponse) SetReqMsgId(v string) *SendPromoPrizeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendPromoPrizeResponse) SetResultCode(v string) *SendPromoPrizeResponse {
	s.ResultCode = &v
	return s
}

func (s *SendPromoPrizeResponse) SetResultMsg(v string) *SendPromoPrizeResponse {
	s.ResultMsg = &v
	return s
}

type CreateResourceGeneralresourceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 小程序的APP ID
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 业务幂等ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 是否需要生成差量包
	NeedPatch *bool `json:"need_patch,omitempty" xml:"need_patch,omitempty" require:"true"`
}

func (s CreateResourceGeneralresourceRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateResourceGeneralresourceRequest) GoString() string {
	return s.String()
}

func (s *CreateResourceGeneralresourceRequest) SetAuthToken(v string) *CreateResourceGeneralresourceRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateResourceGeneralresourceRequest) SetProductInstanceId(v string) *CreateResourceGeneralresourceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateResourceGeneralresourceRequest) SetAppId(v string) *CreateResourceGeneralresourceRequest {
	s.AppId = &v
	return s
}

func (s *CreateResourceGeneralresourceRequest) SetBizId(v string) *CreateResourceGeneralresourceRequest {
	s.BizId = &v
	return s
}

func (s *CreateResourceGeneralresourceRequest) SetNeedPatch(v bool) *CreateResourceGeneralresourceRequest {
	s.NeedPatch = &v
	return s
}

type CreateResourceGeneralresourceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 资源ID
	ResourceId *string `json:"resource_id,omitempty" xml:"resource_id,omitempty"`
	// 文件上传地址
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 资源上传的授权token，上传文件时需要将该值放入header中进行鉴权
	MaasToken *string `json:"maas_token,omitempty" xml:"maas_token,omitempty"`
}

func (s CreateResourceGeneralresourceResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateResourceGeneralresourceResponse) GoString() string {
	return s.String()
}

func (s *CreateResourceGeneralresourceResponse) SetReqMsgId(v string) *CreateResourceGeneralresourceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateResourceGeneralresourceResponse) SetResultCode(v string) *CreateResourceGeneralresourceResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateResourceGeneralresourceResponse) SetResultMsg(v string) *CreateResourceGeneralresourceResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateResourceGeneralresourceResponse) SetResourceId(v string) *CreateResourceGeneralresourceResponse {
	s.ResourceId = &v
	return s
}

func (s *CreateResourceGeneralresourceResponse) SetUrl(v string) *CreateResourceGeneralresourceResponse {
	s.Url = &v
	return s
}

func (s *CreateResourceGeneralresourceResponse) SetMaasToken(v string) *CreateResourceGeneralresourceResponse {
	s.MaasToken = &v
	return s
}

type BindResourceGeneralresourcefileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 小程序的APP ID
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 资源ID
	ResourceId *string `json:"resource_id,omitempty" xml:"resource_id,omitempty" require:"true"`
	// 文件ID
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 文件状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 业务自定义的文本版本号
	BizVersion *string `json:"biz_version,omitempty" xml:"biz_version,omitempty"`
}

func (s BindResourceGeneralresourcefileRequest) String() string {
	return tea.Prettify(s)
}

func (s BindResourceGeneralresourcefileRequest) GoString() string {
	return s.String()
}

func (s *BindResourceGeneralresourcefileRequest) SetAuthToken(v string) *BindResourceGeneralresourcefileRequest {
	s.AuthToken = &v
	return s
}

func (s *BindResourceGeneralresourcefileRequest) SetProductInstanceId(v string) *BindResourceGeneralresourcefileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BindResourceGeneralresourcefileRequest) SetAppId(v string) *BindResourceGeneralresourcefileRequest {
	s.AppId = &v
	return s
}

func (s *BindResourceGeneralresourcefileRequest) SetResourceId(v string) *BindResourceGeneralresourcefileRequest {
	s.ResourceId = &v
	return s
}

func (s *BindResourceGeneralresourcefileRequest) SetFileId(v string) *BindResourceGeneralresourcefileRequest {
	s.FileId = &v
	return s
}

func (s *BindResourceGeneralresourcefileRequest) SetStatus(v string) *BindResourceGeneralresourcefileRequest {
	s.Status = &v
	return s
}

func (s *BindResourceGeneralresourcefileRequest) SetBizVersion(v string) *BindResourceGeneralresourcefileRequest {
	s.BizVersion = &v
	return s
}

type BindResourceGeneralresourcefileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 版本号
	Version *int64 `json:"version,omitempty" xml:"version,omitempty"`
	// 文件下载地址
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// md5摘要值
	Md5 *string `json:"md5,omitempty" xml:"md5,omitempty"`
	// 文件大小
	Size *int64 `json:"size,omitempty" xml:"size,omitempty"`
}

func (s BindResourceGeneralresourcefileResponse) String() string {
	return tea.Prettify(s)
}

func (s BindResourceGeneralresourcefileResponse) GoString() string {
	return s.String()
}

func (s *BindResourceGeneralresourcefileResponse) SetReqMsgId(v string) *BindResourceGeneralresourcefileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindResourceGeneralresourcefileResponse) SetResultCode(v string) *BindResourceGeneralresourcefileResponse {
	s.ResultCode = &v
	return s
}

func (s *BindResourceGeneralresourcefileResponse) SetResultMsg(v string) *BindResourceGeneralresourcefileResponse {
	s.ResultMsg = &v
	return s
}

func (s *BindResourceGeneralresourcefileResponse) SetVersion(v int64) *BindResourceGeneralresourcefileResponse {
	s.Version = &v
	return s
}

func (s *BindResourceGeneralresourcefileResponse) SetUrl(v string) *BindResourceGeneralresourcefileResponse {
	s.Url = &v
	return s
}

func (s *BindResourceGeneralresourcefileResponse) SetMd5(v string) *BindResourceGeneralresourcefileResponse {
	s.Md5 = &v
	return s
}

func (s *BindResourceGeneralresourcefileResponse) SetSize(v int64) *BindResourceGeneralresourcefileResponse {
	s.Size = &v
	return s
}

type PublishResourceGeneralresourcefileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 小程序的APP ID
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 业务幂等ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 资源ID
	ResourceId *string `json:"resource_id,omitempty" xml:"resource_id,omitempty" require:"true"`
	// 版本号
	FileVersion *int64 `json:"file_version,omitempty" xml:"file_version,omitempty" require:"true"`
}

func (s PublishResourceGeneralresourcefileRequest) String() string {
	return tea.Prettify(s)
}

func (s PublishResourceGeneralresourcefileRequest) GoString() string {
	return s.String()
}

func (s *PublishResourceGeneralresourcefileRequest) SetAuthToken(v string) *PublishResourceGeneralresourcefileRequest {
	s.AuthToken = &v
	return s
}

func (s *PublishResourceGeneralresourcefileRequest) SetProductInstanceId(v string) *PublishResourceGeneralresourcefileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PublishResourceGeneralresourcefileRequest) SetAppId(v string) *PublishResourceGeneralresourcefileRequest {
	s.AppId = &v
	return s
}

func (s *PublishResourceGeneralresourcefileRequest) SetBizId(v string) *PublishResourceGeneralresourcefileRequest {
	s.BizId = &v
	return s
}

func (s *PublishResourceGeneralresourcefileRequest) SetResourceId(v string) *PublishResourceGeneralresourcefileRequest {
	s.ResourceId = &v
	return s
}

func (s *PublishResourceGeneralresourcefileRequest) SetFileVersion(v int64) *PublishResourceGeneralresourcefileRequest {
	s.FileVersion = &v
	return s
}

type PublishResourceGeneralresourcefileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 版本号
	Version *int64 `json:"version,omitempty" xml:"version,omitempty"`
	// 资源文件下载地址
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// md5摘要值
	Md5 *string `json:"md5,omitempty" xml:"md5,omitempty"`
	// 文件大小
	Size *int64 `json:"size,omitempty" xml:"size,omitempty"`
}

func (s PublishResourceGeneralresourcefileResponse) String() string {
	return tea.Prettify(s)
}

func (s PublishResourceGeneralresourcefileResponse) GoString() string {
	return s.String()
}

func (s *PublishResourceGeneralresourcefileResponse) SetReqMsgId(v string) *PublishResourceGeneralresourcefileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PublishResourceGeneralresourcefileResponse) SetResultCode(v string) *PublishResourceGeneralresourcefileResponse {
	s.ResultCode = &v
	return s
}

func (s *PublishResourceGeneralresourcefileResponse) SetResultMsg(v string) *PublishResourceGeneralresourcefileResponse {
	s.ResultMsg = &v
	return s
}

func (s *PublishResourceGeneralresourcefileResponse) SetVersion(v int64) *PublishResourceGeneralresourcefileResponse {
	s.Version = &v
	return s
}

func (s *PublishResourceGeneralresourcefileResponse) SetUrl(v string) *PublishResourceGeneralresourcefileResponse {
	s.Url = &v
	return s
}

func (s *PublishResourceGeneralresourcefileResponse) SetMd5(v string) *PublishResourceGeneralresourcefileResponse {
	s.Md5 = &v
	return s
}

func (s *PublishResourceGeneralresourcefileResponse) SetSize(v int64) *PublishResourceGeneralresourcefileResponse {
	s.Size = &v
	return s
}

type QueryResourcePatchlistRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 小程序的APP ID
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 资源ID
	ResourceId *string `json:"resource_id,omitempty" xml:"resource_id,omitempty" require:"true"`
	// 版本号
	FileVersion *int64 `json:"file_version,omitempty" xml:"file_version,omitempty" require:"true"`
}

func (s QueryResourcePatchlistRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryResourcePatchlistRequest) GoString() string {
	return s.String()
}

func (s *QueryResourcePatchlistRequest) SetAuthToken(v string) *QueryResourcePatchlistRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryResourcePatchlistRequest) SetProductInstanceId(v string) *QueryResourcePatchlistRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryResourcePatchlistRequest) SetAppId(v string) *QueryResourcePatchlistRequest {
	s.AppId = &v
	return s
}

func (s *QueryResourcePatchlistRequest) SetResourceId(v string) *QueryResourcePatchlistRequest {
	s.ResourceId = &v
	return s
}

func (s *QueryResourcePatchlistRequest) SetFileVersion(v int64) *QueryResourcePatchlistRequest {
	s.FileVersion = &v
	return s
}

type QueryResourcePatchlistResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 差量包生成状态，包括PATCHING（生成中）和FINISHED（生成完成）
	PatchStatus *string `json:"patch_status,omitempty" xml:"patch_status,omitempty"`
	// 全量包下载地址
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 资源ID
	ResourceId *string `json:"resource_id,omitempty" xml:"resource_id,omitempty"`
	// 全量包版本号
	Version *int64 `json:"version,omitempty" xml:"version,omitempty"`
	// 全量包md5摘要值
	Md5 *string `json:"md5,omitempty" xml:"md5,omitempty"`
	// 全量包文件大小
	Size *int64 `json:"size,omitempty" xml:"size,omitempty"`
	// 差量包文件信息列表
	PatchList []*GeneralResourcePatch `json:"patch_list,omitempty" xml:"patch_list,omitempty" type:"Repeated"`
}

func (s QueryResourcePatchlistResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryResourcePatchlistResponse) GoString() string {
	return s.String()
}

func (s *QueryResourcePatchlistResponse) SetReqMsgId(v string) *QueryResourcePatchlistResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryResourcePatchlistResponse) SetResultCode(v string) *QueryResourcePatchlistResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryResourcePatchlistResponse) SetResultMsg(v string) *QueryResourcePatchlistResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryResourcePatchlistResponse) SetPatchStatus(v string) *QueryResourcePatchlistResponse {
	s.PatchStatus = &v
	return s
}

func (s *QueryResourcePatchlistResponse) SetUrl(v string) *QueryResourcePatchlistResponse {
	s.Url = &v
	return s
}

func (s *QueryResourcePatchlistResponse) SetResourceId(v string) *QueryResourcePatchlistResponse {
	s.ResourceId = &v
	return s
}

func (s *QueryResourcePatchlistResponse) SetVersion(v int64) *QueryResourcePatchlistResponse {
	s.Version = &v
	return s
}

func (s *QueryResourcePatchlistResponse) SetMd5(v string) *QueryResourcePatchlistResponse {
	s.Md5 = &v
	return s
}

func (s *QueryResourcePatchlistResponse) SetSize(v int64) *QueryResourcePatchlistResponse {
	s.Size = &v
	return s
}

func (s *QueryResourcePatchlistResponse) SetPatchList(v []*GeneralResourcePatch) *QueryResourcePatchlistResponse {
	s.PatchList = v
	return s
}

type ApplyResourceFiletokenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// Token类型
	TokenType *string `json:"token_type,omitempty" xml:"token_type,omitempty" require:"true"`
}

func (s ApplyResourceFiletokenRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyResourceFiletokenRequest) GoString() string {
	return s.String()
}

func (s *ApplyResourceFiletokenRequest) SetAuthToken(v string) *ApplyResourceFiletokenRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyResourceFiletokenRequest) SetProductInstanceId(v string) *ApplyResourceFiletokenRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyResourceFiletokenRequest) SetTokenType(v string) *ApplyResourceFiletokenRequest {
	s.TokenType = &v
	return s
}

type ApplyResourceFiletokenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 临时token信息
	MassToken *string `json:"mass_token,omitempty" xml:"mass_token,omitempty"`
	// 上传地址
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// afts-appid
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty"`
	// afts-bizkey
	BizKey *string `json:"biz_key,omitempty" xml:"biz_key,omitempty"`
}

func (s ApplyResourceFiletokenResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyResourceFiletokenResponse) GoString() string {
	return s.String()
}

func (s *ApplyResourceFiletokenResponse) SetReqMsgId(v string) *ApplyResourceFiletokenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyResourceFiletokenResponse) SetResultCode(v string) *ApplyResourceFiletokenResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyResourceFiletokenResponse) SetResultMsg(v string) *ApplyResourceFiletokenResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyResourceFiletokenResponse) SetMassToken(v string) *ApplyResourceFiletokenResponse {
	s.MassToken = &v
	return s
}

func (s *ApplyResourceFiletokenResponse) SetUrl(v string) *ApplyResourceFiletokenResponse {
	s.Url = &v
	return s
}

func (s *ApplyResourceFiletokenResponse) SetAppId(v string) *ApplyResourceFiletokenResponse {
	s.AppId = &v
	return s
}

func (s *ApplyResourceFiletokenResponse) SetBizKey(v string) *ApplyResourceFiletokenResponse {
	s.BizKey = &v
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
				"sdk_version":      tea.String("1.0.35"),
				"_prod_code":       tea.String("NFTC"),
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
 * Description: ASO排重
 * Summary: ASO排重
 */
func (client *Client) QueryAsoDistinct(request *QueryAsoDistinctRequest) (_result *QueryAsoDistinctResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAsoDistinctResponse{}
	_body, _err := client.QueryAsoDistinctEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: ASO排重
 * Summary: ASO排重
 */
func (client *Client) QueryAsoDistinctEx(request *QueryAsoDistinctRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAsoDistinctResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAsoDistinctResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftc.aso.distinct.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: ASO点击数据上报
 * Summary: ASO点击
 */
func (client *Client) SubmitAsoClick(request *SubmitAsoClickRequest) (_result *SubmitAsoClickResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitAsoClickResponse{}
	_body, _err := client.SubmitAsoClickEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: ASO点击数据上报
 * Summary: ASO点击
 */
func (client *Client) SubmitAsoClickEx(request *SubmitAsoClickRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitAsoClickResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitAsoClickResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftc.aso.click.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 七麦安卓ASO接入
 * Summary: 七麦安卓ASO接入
 */
func (client *Client) SubmitAsoAndroidclick(request *SubmitAsoAndroidclickRequest) (_result *SubmitAsoAndroidclickResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitAsoAndroidclickResponse{}
	_body, _err := client.SubmitAsoAndroidclickEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 七麦安卓ASO接入
 * Summary: 七麦安卓ASO接入
 */
func (client *Client) SubmitAsoAndroidclickEx(request *SubmitAsoAndroidclickRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitAsoAndroidclickResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitAsoAndroidclickResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftc.aso.androidclick.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取当前用户的数字人形象，进而在NBA空间内进行渲染
 * Summary: 查询当前数字人形象
 */
func (client *Client) QueryAvatarProfile(request *QueryAvatarProfileRequest) (_result *QueryAvatarProfileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAvatarProfileResponse{}
	_body, _err := client.QueryAvatarProfileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取当前用户的数字人形象，进而在NBA空间内进行渲染
 * Summary: 查询当前数字人形象
 */
func (client *Client) QueryAvatarProfileEx(request *QueryAvatarProfileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAvatarProfileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAvatarProfileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftc.avatar.profile.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据活动编码以及用户的openUid查询用户当前助力活动的状态以及进度
 * Summary: 查询用户助力活动信息
 */
func (client *Client) QueryPromoteActivity(request *QueryPromoteActivityRequest) (_result *QueryPromoteActivityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryPromoteActivityResponse{}
	_body, _err := client.QueryPromoteActivityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据活动编码以及用户的openUid查询用户当前助力活动的状态以及进度
 * Summary: 查询用户助力活动信息
 */
func (client *Client) QueryPromoteActivityEx(request *QueryPromoteActivityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryPromoteActivityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryPromoteActivityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftc.promote.activity.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据活动编码以及用户的openUid发起助力，获取分享的url链接
 * Summary: 发起助力分享
 */
func (client *Client) GetPromoteShareurl(request *GetPromoteShareurlRequest) (_result *GetPromoteShareurlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetPromoteShareurlResponse{}
	_body, _err := client.GetPromoteShareurlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据活动编码以及用户的openUid发起助力，获取分享的url链接
 * Summary: 发起助力分享
 */
func (client *Client) GetPromoteShareurlEx(request *GetPromoteShareurlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetPromoteShareurlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetPromoteShareurlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftc.promote.shareurl.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 确认奖励到账
 * Summary: 确认奖励到账
 */
func (client *Client) ConfirmTaskReward(request *ConfirmTaskRewardRequest) (_result *ConfirmTaskRewardResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ConfirmTaskRewardResponse{}
	_body, _err := client.ConfirmTaskRewardEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 确认奖励到账
 * Summary: 确认奖励到账
 */
func (client *Client) ConfirmTaskRewardEx(request *ConfirmTaskRewardRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ConfirmTaskRewardResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmTaskRewardResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftc.task.reward.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: authcode换取token
 * Summary: authcode换取token
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
 * Description: authcode换取token
 * Summary: authcode换取token
 */
func (client *Client) ApplyOauthTokenEx(request *ApplyOauthTokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyOauthTokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyOauthTokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftc.oauth.token.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: token获取头像/昵称
 * Summary: token获取头像/昵称
 */
func (client *Client) QueryOauthUserinfo(request *QueryOauthUserinfoRequest) (_result *QueryOauthUserinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryOauthUserinfoResponse{}
	_body, _err := client.QueryOauthUserinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: token获取头像/昵称
 * Summary: token获取头像/昵称
 */
func (client *Client) QueryOauthUserinfoEx(request *QueryOauthUserinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryOauthUserinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryOauthUserinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftc.oauth.userinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取用户Token
 * Summary: 获取用户Token
 */
func (client *Client) ApplyOauthUserinfotoken(request *ApplyOauthUserinfotokenRequest) (_result *ApplyOauthUserinfotokenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyOauthUserinfotokenResponse{}
	_body, _err := client.ApplyOauthUserinfotokenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取用户Token
 * Summary: 获取用户Token
 */
func (client *Client) ApplyOauthUserinfotokenEx(request *ApplyOauthUserinfotokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyOauthUserinfotokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyOauthUserinfotokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftc.oauth.userinfotoken.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: token获取实名信息
 * Summary: token获取实名认证信息
 */
func (client *Client) QueryOauthRealnameinfo(request *QueryOauthRealnameinfoRequest) (_result *QueryOauthRealnameinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryOauthRealnameinfoResponse{}
	_body, _err := client.QueryOauthRealnameinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: token获取实名信息
 * Summary: token获取实名认证信息
 */
func (client *Client) QueryOauthRealnameinfoEx(request *QueryOauthRealnameinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryOauthRealnameinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryOauthRealnameinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftc.oauth.realnameinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 短信发送
 * Summary: 短信发送
 */
func (client *Client) SendSmsMessage(request *SendSmsMessageRequest) (_result *SendSmsMessageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendSmsMessageResponse{}
	_body, _err := client.SendSmsMessageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 短信发送
 * Summary: 短信发送
 */
func (client *Client) SendSmsMessageEx(request *SendSmsMessageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendSmsMessageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendSmsMessageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftc.sms.message.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: DIY藏品发放
 * Summary: DIY藏品发放
 */
func (client *Client) PublishMerchantDiysku(request *PublishMerchantDiyskuRequest) (_result *PublishMerchantDiyskuResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PublishMerchantDiyskuResponse{}
	_body, _err := client.PublishMerchantDiyskuEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: DIY藏品发放
 * Summary: DIY藏品发放
 */
func (client *Client) PublishMerchantDiyskuEx(request *PublishMerchantDiyskuRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PublishMerchantDiyskuResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PublishMerchantDiyskuResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftc.merchant.diysku.publish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: DIY藏品发放查询
 * Summary: DIY藏品发放查询
 */
func (client *Client) QueryMerchantDiysku(request *QueryMerchantDiyskuRequest) (_result *QueryMerchantDiyskuResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMerchantDiyskuResponse{}
	_body, _err := client.QueryMerchantDiyskuEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: DIY藏品发放查询
 * Summary: DIY藏品发放查询
 */
func (client *Client) QueryMerchantDiyskuEx(request *QueryMerchantDiyskuRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMerchantDiyskuResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMerchantDiyskuResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftc.merchant.diysku.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提供ISV  ugc铸造图片查询的openapi服务
 * Summary: ugc铸造图片查询的openapi接口
 */
func (client *Client) QueryMerchantUgcimages(request *QueryMerchantUgcimagesRequest) (_result *QueryMerchantUgcimagesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMerchantUgcimagesResponse{}
	_body, _err := client.QueryMerchantUgcimagesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提供ISV  ugc铸造图片查询的openapi服务
 * Summary: ugc铸造图片查询的openapi接口
 */
func (client *Client) QueryMerchantUgcimagesEx(request *QueryMerchantUgcimagesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMerchantUgcimagesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMerchantUgcimagesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftc.merchant.ugcimages.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 租户根据sku给用户发放藏品
 * Summary: 发放藏品
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
 * Description: 租户根据sku给用户发放藏品
 * Summary: 发放藏品
 */
func (client *Client) ApplyNftTransferEx(request *ApplyNftTransferRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyNftTransferResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyNftTransferResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftc.nft.transfer.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 调用租户分页查询用户该租户发行的sku的资产
 * Summary: 查询藏品
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
 * Description: 调用租户分页查询用户该租户发行的sku的资产
 * Summary: 查询藏品
 */
func (client *Client) PagequeryNftCustomerEx(request *PagequeryNftCustomerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryNftCustomerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryNftCustomerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftc.nft.customer.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询支付结果
 * Summary: 查询支付结果
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
 * Description: 查询支付结果
 * Summary: 查询支付结果
 */
func (client *Client) QueryNftOrderEx(request *QueryNftOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryNftOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryNftOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftc.nft.order.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据skuId维度查询藏品
 * Summary: 根据skuId维度查询藏品
 */
func (client *Client) QueryNftAssetbysku(request *QueryNftAssetbyskuRequest) (_result *QueryNftAssetbyskuResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryNftAssetbyskuResponse{}
	_body, _err := client.QueryNftAssetbyskuEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据skuId维度查询藏品
 * Summary: 根据skuId维度查询藏品
 */
func (client *Client) QueryNftAssetbyskuEx(request *QueryNftAssetbyskuRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryNftAssetbyskuResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryNftAssetbyskuResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftc.nft.assetbysku.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据skuId维度校验藏品是否已拥有
 * Summary: 根据skuId维度校验藏品是否已拥有
 */
func (client *Client) CheckNftAssetbysku(request *CheckNftAssetbyskuRequest) (_result *CheckNftAssetbyskuResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckNftAssetbyskuResponse{}
	_body, _err := client.CheckNftAssetbyskuEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据skuId维度校验藏品是否已拥有
 * Summary: 根据skuId维度校验藏品是否已拥有
 */
func (client *Client) CheckNftAssetbyskuEx(request *CheckNftAssetbyskuRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckNftAssetbyskuResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckNftAssetbyskuResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftc.nft.assetbysku.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 支付宝海豚优惠券发放
 * Summary: 支付宝海豚优惠券发放
 */
func (client *Client) SendPromoPrize(request *SendPromoPrizeRequest) (_result *SendPromoPrizeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendPromoPrizeResponse{}
	_body, _err := client.SendPromoPrizeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 支付宝海豚优惠券发放
 * Summary: 支付宝海豚优惠券发放
 */
func (client *Client) SendPromoPrizeEx(request *SendPromoPrizeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendPromoPrizeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendPromoPrizeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftc.promo.prize.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建通用资源
 * Summary: 创建通用资源
 */
func (client *Client) CreateResourceGeneralresource(request *CreateResourceGeneralresourceRequest) (_result *CreateResourceGeneralresourceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateResourceGeneralresourceResponse{}
	_body, _err := client.CreateResourceGeneralresourceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建通用资源
 * Summary: 创建通用资源
 */
func (client *Client) CreateResourceGeneralresourceEx(request *CreateResourceGeneralresourceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateResourceGeneralresourceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateResourceGeneralresourceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftc.resource.generalresource.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 绑定文件到通用资源ID
 * Summary: 绑定文件到通用资源ID
 */
func (client *Client) BindResourceGeneralresourcefile(request *BindResourceGeneralresourcefileRequest) (_result *BindResourceGeneralresourcefileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindResourceGeneralresourcefileResponse{}
	_body, _err := client.BindResourceGeneralresourcefileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 绑定文件到通用资源ID
 * Summary: 绑定文件到通用资源ID
 */
func (client *Client) BindResourceGeneralresourcefileEx(request *BindResourceGeneralresourcefileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindResourceGeneralresourcefileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindResourceGeneralresourcefileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftc.resource.generalresourcefile.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发布通用资源文件
 * Summary: 发布通用资源文件
 */
func (client *Client) PublishResourceGeneralresourcefile(request *PublishResourceGeneralresourcefileRequest) (_result *PublishResourceGeneralresourcefileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PublishResourceGeneralresourcefileResponse{}
	_body, _err := client.PublishResourceGeneralresourcefileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发布通用资源文件
 * Summary: 发布通用资源文件
 */
func (client *Client) PublishResourceGeneralresourcefileEx(request *PublishResourceGeneralresourcefileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PublishResourceGeneralresourcefileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PublishResourceGeneralresourcefileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftc.resource.generalresourcefile.publish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询资源文件差量包列表
 * Summary: 查询资源文件差量包列表
 */
func (client *Client) QueryResourcePatchlist(request *QueryResourcePatchlistRequest) (_result *QueryResourcePatchlistResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryResourcePatchlistResponse{}
	_body, _err := client.QueryResourcePatchlistEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询资源文件差量包列表
 * Summary: 查询资源文件差量包列表
 */
func (client *Client) QueryResourcePatchlistEx(request *QueryResourcePatchlistRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryResourcePatchlistResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryResourcePatchlistResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftc.resource.patchlist.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资源管理平台-申请文件上传token
 * Summary: 资源管理平台-申请文件上传token
 */
func (client *Client) ApplyResourceFiletoken(request *ApplyResourceFiletokenRequest) (_result *ApplyResourceFiletokenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyResourceFiletokenResponse{}
	_body, _err := client.ApplyResourceFiletokenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资源管理平台-申请文件上传token
 * Summary: 资源管理平台-申请文件上传token
 */
func (client *Client) ApplyResourceFiletokenEx(request *ApplyResourceFiletokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyResourceFiletokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyResourceFiletokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftc.resource.filetoken.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
