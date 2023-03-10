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

// 提交AI鉴定时鉴定点信息
type IdentifyPointReq struct {
	// 鉴定点名称
	IdentifyPointName *string `json:"identify_point_name,omitempty" xml:"identify_point_name,omitempty" require:"true"`
	// 鉴定点编号
	IdentifyPointCode *string `json:"identify_point_code,omitempty" xml:"identify_point_code,omitempty" require:"true"`
	// 鉴定商品此鉴定点的图片
	IdentifyPointImg *string `json:"identify_point_img,omitempty" xml:"identify_point_img,omitempty" require:"true"`
}

func (s IdentifyPointReq) String() string {
	return tea.Prettify(s)
}

func (s IdentifyPointReq) GoString() string {
	return s.String()
}

func (s *IdentifyPointReq) SetIdentifyPointName(v string) *IdentifyPointReq {
	s.IdentifyPointName = &v
	return s
}

func (s *IdentifyPointReq) SetIdentifyPointCode(v string) *IdentifyPointReq {
	s.IdentifyPointCode = &v
	return s
}

func (s *IdentifyPointReq) SetIdentifyPointImg(v string) *IdentifyPointReq {
	s.IdentifyPointImg = &v
	return s
}

// 鉴定点信息
type IdentifyPointResp struct {
	// 鉴定点名称
	IdentifyPointName *string `json:"identify_point_name,omitempty" xml:"identify_point_name,omitempty" require:"true"`
	// 鉴定点序号
	Order *int64 `json:"order,omitempty" xml:"order,omitempty" require:"true"`
	// 鉴定点编号
	IdentifyPointCode *string `json:"identify_point_code,omitempty" xml:"identify_point_code,omitempty" require:"true"`
	// 标签图片oss链接
	LabelImg *string `json:"label_img,omitempty" xml:"label_img,omitempty" require:"true"`
	// 示例图片oss链接
	ExampleImg *string `json:"example_img,omitempty" xml:"example_img,omitempty" require:"true"`
	// 是否必传鉴定点
	IsRequired *bool `json:"is_required,omitempty" xml:"is_required,omitempty" require:"true"`
}

func (s IdentifyPointResp) String() string {
	return tea.Prettify(s)
}

func (s IdentifyPointResp) GoString() string {
	return s.String()
}

func (s *IdentifyPointResp) SetIdentifyPointName(v string) *IdentifyPointResp {
	s.IdentifyPointName = &v
	return s
}

func (s *IdentifyPointResp) SetOrder(v int64) *IdentifyPointResp {
	s.Order = &v
	return s
}

func (s *IdentifyPointResp) SetIdentifyPointCode(v string) *IdentifyPointResp {
	s.IdentifyPointCode = &v
	return s
}

func (s *IdentifyPointResp) SetLabelImg(v string) *IdentifyPointResp {
	s.LabelImg = &v
	return s
}

func (s *IdentifyPointResp) SetExampleImg(v string) *IdentifyPointResp {
	s.ExampleImg = &v
	return s
}

func (s *IdentifyPointResp) SetIsRequired(v bool) *IdentifyPointResp {
	s.IsRequired = &v
	return s
}

// 鉴定点结果
type IdentifyPointResultResp struct {
	// 234
	IdentifyPointName *string `json:"identify_point_name,omitempty" xml:"identify_point_name,omitempty" require:"true"`
	// 鉴定点唯一编号
	IdentifyPointCode *string `json:"identify_point_code,omitempty" xml:"identify_point_code,omitempty" require:"true"`
	// 鉴定点图片
	IdentifyPointImg *string `json:"identify_point_img,omitempty" xml:"identify_point_img,omitempty" require:"true"`
	// 鉴定点的鉴定结果
	// SUCCESS：符合鉴定标准
	// FAILED：不符合鉴定标准
	// NOT_IDENTIFY：无法鉴定
	IdentifyPointResult *string `json:"identify_point_result,omitempty" xml:"identify_point_result,omitempty" require:"true"`
}

func (s IdentifyPointResultResp) String() string {
	return tea.Prettify(s)
}

func (s IdentifyPointResultResp) GoString() string {
	return s.String()
}

func (s *IdentifyPointResultResp) SetIdentifyPointName(v string) *IdentifyPointResultResp {
	s.IdentifyPointName = &v
	return s
}

func (s *IdentifyPointResultResp) SetIdentifyPointCode(v string) *IdentifyPointResultResp {
	s.IdentifyPointCode = &v
	return s
}

func (s *IdentifyPointResultResp) SetIdentifyPointImg(v string) *IdentifyPointResultResp {
	s.IdentifyPointImg = &v
	return s
}

func (s *IdentifyPointResultResp) SetIdentifyPointResult(v string) *IdentifyPointResultResp {
	s.IdentifyPointResult = &v
	return s
}

type QueryIdentifypointRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 品类名称
	CategoryName *string `json:"category_name,omitempty" xml:"category_name,omitempty" require:"true"`
	// 品牌名称
	BrandName *string `json:"brand_name,omitempty" xml:"brand_name,omitempty" require:"true"`
	// 款式名称
	StyleName *string `json:"style_name,omitempty" xml:"style_name,omitempty" require:"true"`
}

func (s QueryIdentifypointRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIdentifypointRequest) GoString() string {
	return s.String()
}

func (s *QueryIdentifypointRequest) SetAuthToken(v string) *QueryIdentifypointRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIdentifypointRequest) SetProductInstanceId(v string) *QueryIdentifypointRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIdentifypointRequest) SetCategoryName(v string) *QueryIdentifypointRequest {
	s.CategoryName = &v
	return s
}

func (s *QueryIdentifypointRequest) SetBrandName(v string) *QueryIdentifypointRequest {
	s.BrandName = &v
	return s
}

func (s *QueryIdentifypointRequest) SetStyleName(v string) *QueryIdentifypointRequest {
	s.StyleName = &v
	return s
}

type QueryIdentifypointResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 品类名称
	CategoryName *string `json:"category_name,omitempty" xml:"category_name,omitempty"`
	// 品牌名称
	BrandName *string `json:"brand_name,omitempty" xml:"brand_name,omitempty"`
	// 款式名称
	StyleName *string `json:"style_name,omitempty" xml:"style_name,omitempty"`
	// 款式编号
	StyleCode *string `json:"style_code,omitempty" xml:"style_code,omitempty"`
	// 至少上传鉴定点数量
	AtLeastNum *int64 `json:"at_least_num,omitempty" xml:"at_least_num,omitempty"`
	// 鉴定点信息列表
	IdentifyPointList []*IdentifyPointResp `json:"identify_point_list,omitempty" xml:"identify_point_list,omitempty" type:"Repeated"`
}

func (s QueryIdentifypointResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIdentifypointResponse) GoString() string {
	return s.String()
}

func (s *QueryIdentifypointResponse) SetReqMsgId(v string) *QueryIdentifypointResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIdentifypointResponse) SetResultCode(v string) *QueryIdentifypointResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIdentifypointResponse) SetResultMsg(v string) *QueryIdentifypointResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIdentifypointResponse) SetCategoryName(v string) *QueryIdentifypointResponse {
	s.CategoryName = &v
	return s
}

func (s *QueryIdentifypointResponse) SetBrandName(v string) *QueryIdentifypointResponse {
	s.BrandName = &v
	return s
}

func (s *QueryIdentifypointResponse) SetStyleName(v string) *QueryIdentifypointResponse {
	s.StyleName = &v
	return s
}

func (s *QueryIdentifypointResponse) SetStyleCode(v string) *QueryIdentifypointResponse {
	s.StyleCode = &v
	return s
}

func (s *QueryIdentifypointResponse) SetAtLeastNum(v int64) *QueryIdentifypointResponse {
	s.AtLeastNum = &v
	return s
}

func (s *QueryIdentifypointResponse) SetIdentifyPointList(v []*IdentifyPointResp) *QueryIdentifypointResponse {
	s.IdentifyPointList = v
	return s
}

type OperateIdentifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 品类名称
	CategoryName *string `json:"category_name,omitempty" xml:"category_name,omitempty" require:"true"`
	// 品牌名称
	BrandName *string `json:"brand_name,omitempty" xml:"brand_name,omitempty" require:"true"`
	// 款式名称
	StyleName *string `json:"style_name,omitempty" xml:"style_name,omitempty" require:"true"`
	// 款式编号
	StyleCode *string `json:"style_code,omitempty" xml:"style_code,omitempty"`
	// 鉴定点信息列表
	IdentifyPointList []*IdentifyPointReq `json:"identify_point_list,omitempty" xml:"identify_point_list,omitempty" type:"Repeated"`
	// 鉴定点图片列表，当不能提供完整鉴定点信息列表时，可根据鉴定点查询接口出参中order字段将图片直接放入列表中
	IdentifyPointImgList []*string `json:"identify_point_img_list,omitempty" xml:"identify_point_img_list,omitempty" type:"Repeated"`
}

func (s OperateIdentifyRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateIdentifyRequest) GoString() string {
	return s.String()
}

func (s *OperateIdentifyRequest) SetAuthToken(v string) *OperateIdentifyRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateIdentifyRequest) SetProductInstanceId(v string) *OperateIdentifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateIdentifyRequest) SetCategoryName(v string) *OperateIdentifyRequest {
	s.CategoryName = &v
	return s
}

func (s *OperateIdentifyRequest) SetBrandName(v string) *OperateIdentifyRequest {
	s.BrandName = &v
	return s
}

func (s *OperateIdentifyRequest) SetStyleName(v string) *OperateIdentifyRequest {
	s.StyleName = &v
	return s
}

func (s *OperateIdentifyRequest) SetStyleCode(v string) *OperateIdentifyRequest {
	s.StyleCode = &v
	return s
}

func (s *OperateIdentifyRequest) SetIdentifyPointList(v []*IdentifyPointReq) *OperateIdentifyRequest {
	s.IdentifyPointList = v
	return s
}

func (s *OperateIdentifyRequest) SetIdentifyPointImgList(v []*string) *OperateIdentifyRequest {
	s.IdentifyPointImgList = v
	return s
}

type OperateIdentifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 鉴定单编号
	IdentifyNumber *string `json:"identify_number,omitempty" xml:"identify_number,omitempty"`
	// 品类名称
	CategoryName *string `json:"category_name,omitempty" xml:"category_name,omitempty"`
	// 品牌名称
	BrandName *string `json:"brand_name,omitempty" xml:"brand_name,omitempty"`
	// 款式名称
	StyleName *string `json:"style_name,omitempty" xml:"style_name,omitempty"`
	//  整体鉴定结果
	// SUCCESS：符合鉴定标准
	// FAILED：不符合鉴定标准
	// NOT_IDENTIFY：无法鉴定
	IdentifyResult *string `json:"identify_result,omitempty" xml:"identify_result,omitempty"`
	// 鉴定描述
	IdentifyDesc *string `json:"identify_desc,omitempty" xml:"identify_desc,omitempty"`
	// 鉴定点结果列表
	IdentifyPointResultList []*IdentifyPointResultResp `json:"identify_point_result_list,omitempty" xml:"identify_point_result_list,omitempty" type:"Repeated"`
}

func (s OperateIdentifyResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateIdentifyResponse) GoString() string {
	return s.String()
}

func (s *OperateIdentifyResponse) SetReqMsgId(v string) *OperateIdentifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateIdentifyResponse) SetResultCode(v string) *OperateIdentifyResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateIdentifyResponse) SetResultMsg(v string) *OperateIdentifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateIdentifyResponse) SetIdentifyNumber(v string) *OperateIdentifyResponse {
	s.IdentifyNumber = &v
	return s
}

func (s *OperateIdentifyResponse) SetCategoryName(v string) *OperateIdentifyResponse {
	s.CategoryName = &v
	return s
}

func (s *OperateIdentifyResponse) SetBrandName(v string) *OperateIdentifyResponse {
	s.BrandName = &v
	return s
}

func (s *OperateIdentifyResponse) SetStyleName(v string) *OperateIdentifyResponse {
	s.StyleName = &v
	return s
}

func (s *OperateIdentifyResponse) SetIdentifyResult(v string) *OperateIdentifyResponse {
	s.IdentifyResult = &v
	return s
}

func (s *OperateIdentifyResponse) SetIdentifyDesc(v string) *OperateIdentifyResponse {
	s.IdentifyDesc = &v
	return s
}

func (s *OperateIdentifyResponse) SetIdentifyPointResultList(v []*IdentifyPointResultResp) *OperateIdentifyResponse {
	s.IdentifyPointResultList = v
	return s
}

type OperateFileuploadGetsignedurlRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s OperateFileuploadGetsignedurlRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateFileuploadGetsignedurlRequest) GoString() string {
	return s.String()
}

func (s *OperateFileuploadGetsignedurlRequest) SetAuthToken(v string) *OperateFileuploadGetsignedurlRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateFileuploadGetsignedurlRequest) SetProductInstanceId(v string) *OperateFileuploadGetsignedurlRequest {
	s.ProductInstanceId = &v
	return s
}

type OperateFileuploadGetsignedurlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件ID(用于 提交数据进行AI鉴定 时图片对应的属性值)
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// oss上传文件链接
	OssUrl *string `json:"oss_url,omitempty" xml:"oss_url,omitempty"`
	// oss上传文件时的ossKey值
	OssKey *string `json:"oss_key,omitempty" xml:"oss_key,omitempty"`
}

func (s OperateFileuploadGetsignedurlResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateFileuploadGetsignedurlResponse) GoString() string {
	return s.String()
}

func (s *OperateFileuploadGetsignedurlResponse) SetReqMsgId(v string) *OperateFileuploadGetsignedurlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateFileuploadGetsignedurlResponse) SetResultCode(v string) *OperateFileuploadGetsignedurlResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateFileuploadGetsignedurlResponse) SetResultMsg(v string) *OperateFileuploadGetsignedurlResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateFileuploadGetsignedurlResponse) SetFileId(v string) *OperateFileuploadGetsignedurlResponse {
	s.FileId = &v
	return s
}

func (s *OperateFileuploadGetsignedurlResponse) SetOssUrl(v string) *OperateFileuploadGetsignedurlResponse {
	s.OssUrl = &v
	return s
}

func (s *OperateFileuploadGetsignedurlResponse) SetOssKey(v string) *OperateFileuploadGetsignedurlResponse {
	s.OssKey = &v
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
				"sdk_version":      tea.String("1.0.4"),
				"_prod_code":       tea.String("AIIDENTIFY"),
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
 * Description: 查询AI鉴定点
 * Summary: 查询AI鉴定点
 */
func (client *Client) QueryIdentifypoint(request *QueryIdentifypointRequest) (_result *QueryIdentifypointResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIdentifypointResponse{}
	_body, _err := client.QueryIdentifypointEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询AI鉴定点
 * Summary: 查询AI鉴定点
 */
func (client *Client) QueryIdentifypointEx(request *QueryIdentifypointRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIdentifypointResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIdentifypointResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.aiidentify.identifypoint.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交数据进行AI鉴定
 * Summary: 提交数据进行AI鉴定
 */
func (client *Client) OperateIdentify(request *OperateIdentifyRequest) (_result *OperateIdentifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateIdentifyResponse{}
	_body, _err := client.OperateIdentifyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交数据进行AI鉴定
 * Summary: 提交数据进行AI鉴定
 */
func (client *Client) OperateIdentifyEx(request *OperateIdentifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateIdentifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateIdentifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.aiidentify.identify.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取oss文件上传签名URL，可通过此url跟oss交互上传文件
 * Summary: 获取oss文件上传签名URL
 */
func (client *Client) OperateFileuploadGetsignedurl(request *OperateFileuploadGetsignedurlRequest) (_result *OperateFileuploadGetsignedurlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateFileuploadGetsignedurlResponse{}
	_body, _err := client.OperateFileuploadGetsignedurlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取oss文件上传签名URL，可通过此url跟oss交互上传文件
 * Summary: 获取oss文件上传签名URL
 */
func (client *Client) OperateFileuploadGetsignedurlEx(request *OperateFileuploadGetsignedurlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateFileuploadGetsignedurlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateFileuploadGetsignedurlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.aiidentify.fileupload.getsignedurl.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
