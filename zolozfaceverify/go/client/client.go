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

// 计量详细结果
type MeteringDataDetail struct {
	// 比对通过
	IdentifyPassedPv *int64 `json:"identify_passed_pv,omitempty" xml:"identify_passed_pv,omitempty"`
	// 上传服务端成功
	IdentifySucceedPv *int64 `json:"identify_succeed_pv,omitempty" xml:"identify_succeed_pv,omitempty"`
	// 计量类型
	MeteringType *string `json:"metering_type,omitempty" xml:"metering_type,omitempty"`
	// 产品渲染（SDK唤起）
	ProdStartPv *int64 `json:"prod_start_pv,omitempty" xml:"prod_start_pv,omitempty"`
	// 查询结果通过
	QueryPassedPv *int64 `json:"query_passed_pv,omitempty" xml:"query_passed_pv,omitempty"`
	// 发起查询
	QuerySucceedPv *int64 `json:"query_succeed_pv,omitempty" xml:"query_succeed_pv,omitempty"`
	// 可用性检查通过
	UsablePassedPv *int64 `json:"usable_passed_pv,omitempty" xml:"usable_passed_pv,omitempty"`
	// 可用性检查开始
	UsableStartPv *int64 `json:"usable_start_pv,omitempty" xml:"usable_start_pv,omitempty"`
}

func (s MeteringDataDetail) String() string {
	return tea.Prettify(s)
}

func (s MeteringDataDetail) GoString() string {
	return s.String()
}

func (s *MeteringDataDetail) SetIdentifyPassedPv(v int64) *MeteringDataDetail {
	s.IdentifyPassedPv = &v
	return s
}

func (s *MeteringDataDetail) SetIdentifySucceedPv(v int64) *MeteringDataDetail {
	s.IdentifySucceedPv = &v
	return s
}

func (s *MeteringDataDetail) SetMeteringType(v string) *MeteringDataDetail {
	s.MeteringType = &v
	return s
}

func (s *MeteringDataDetail) SetProdStartPv(v int64) *MeteringDataDetail {
	s.ProdStartPv = &v
	return s
}

func (s *MeteringDataDetail) SetQueryPassedPv(v int64) *MeteringDataDetail {
	s.QueryPassedPv = &v
	return s
}

func (s *MeteringDataDetail) SetQuerySucceedPv(v int64) *MeteringDataDetail {
	s.QuerySucceedPv = &v
	return s
}

func (s *MeteringDataDetail) SetUsablePassedPv(v int64) *MeteringDataDetail {
	s.UsablePassedPv = &v
	return s
}

func (s *MeteringDataDetail) SetUsableStartPv(v int64) *MeteringDataDetail {
	s.UsableStartPv = &v
	return s
}

// 计量结果
type MeteringData struct {
	// endTime
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// metering_data_detail_list
	MeteringDataDetailList []*MeteringDataDetail `json:"metering_data_detail_list,omitempty" xml:"metering_data_detail_list,omitempty" type:"Repeated"`
	// startTime
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s MeteringData) String() string {
	return tea.Prettify(s)
}

func (s MeteringData) GoString() string {
	return s.String()
}

func (s *MeteringData) SetEndTime(v string) *MeteringData {
	s.EndTime = &v
	return s
}

func (s *MeteringData) SetMeteringDataDetailList(v []*MeteringDataDetail) *MeteringData {
	s.MeteringDataDetailList = v
	return s
}

func (s *MeteringData) SetStartTime(v string) *MeteringData {
	s.StartTime = &v
	return s
}

type ExecFaceauthAlgorithmRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 渠道
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
	// base64图片
	ImgStr *string `json:"img_str,omitempty" xml:"img_str,omitempty" require:"true"`
	// Pano类型
	ImgType *string `json:"img_type,omitempty" xml:"img_type,omitempty" require:"true"`
	// 场景
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty"`
}

func (s ExecFaceauthAlgorithmRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecFaceauthAlgorithmRequest) GoString() string {
	return s.String()
}

func (s *ExecFaceauthAlgorithmRequest) SetAuthToken(v string) *ExecFaceauthAlgorithmRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecFaceauthAlgorithmRequest) SetProductInstanceId(v string) *ExecFaceauthAlgorithmRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecFaceauthAlgorithmRequest) SetBizId(v string) *ExecFaceauthAlgorithmRequest {
	s.BizId = &v
	return s
}

func (s *ExecFaceauthAlgorithmRequest) SetChannel(v string) *ExecFaceauthAlgorithmRequest {
	s.Channel = &v
	return s
}

func (s *ExecFaceauthAlgorithmRequest) SetImgStr(v string) *ExecFaceauthAlgorithmRequest {
	s.ImgStr = &v
	return s
}

func (s *ExecFaceauthAlgorithmRequest) SetImgType(v string) *ExecFaceauthAlgorithmRequest {
	s.ImgType = &v
	return s
}

func (s *ExecFaceauthAlgorithmRequest) SetScene(v string) *ExecFaceauthAlgorithmRequest {
	s.Scene = &v
	return s
}

type ExecFaceauthAlgorithmResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 算法结果，json格式
	AlgoResult *string `json:"algo_result,omitempty" xml:"algo_result,omitempty"`
}

func (s ExecFaceauthAlgorithmResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecFaceauthAlgorithmResponse) GoString() string {
	return s.String()
}

func (s *ExecFaceauthAlgorithmResponse) SetReqMsgId(v string) *ExecFaceauthAlgorithmResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecFaceauthAlgorithmResponse) SetResultCode(v string) *ExecFaceauthAlgorithmResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecFaceauthAlgorithmResponse) SetResultMsg(v string) *ExecFaceauthAlgorithmResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecFaceauthAlgorithmResponse) SetAlgoResult(v string) *ExecFaceauthAlgorithmResponse {
	s.AlgoResult = &v
	return s
}

type FaceFaceauthInitializeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 用户身份信息
	IdentityParam *string `json:"identity_param,omitempty" xml:"identity_param,omitempty" require:"true"`
	// metainfo环境参数
	Metainfo *string `json:"metainfo,omitempty" xml:"metainfo,omitempty" require:"true"`
	// 操作类型
	OperationType *string `json:"operation_type,omitempty" xml:"operation_type,omitempty"`
	// 比对源图片
	RefImg *string `json:"ref_img,omitempty" xml:"ref_img,omitempty"`
	// 比对源图片oss中转
	RefImgOssObj *string `json:"ref_img_oss_obj,omitempty" xml:"ref_img_oss_obj,omitempty" require:"true"`
}

func (s FaceFaceauthInitializeRequest) String() string {
	return tea.Prettify(s)
}

func (s FaceFaceauthInitializeRequest) GoString() string {
	return s.String()
}

func (s *FaceFaceauthInitializeRequest) SetAuthToken(v string) *FaceFaceauthInitializeRequest {
	s.AuthToken = &v
	return s
}

func (s *FaceFaceauthInitializeRequest) SetProductInstanceId(v string) *FaceFaceauthInitializeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *FaceFaceauthInitializeRequest) SetBizId(v string) *FaceFaceauthInitializeRequest {
	s.BizId = &v
	return s
}

func (s *FaceFaceauthInitializeRequest) SetExternParam(v string) *FaceFaceauthInitializeRequest {
	s.ExternParam = &v
	return s
}

func (s *FaceFaceauthInitializeRequest) SetIdentityParam(v string) *FaceFaceauthInitializeRequest {
	s.IdentityParam = &v
	return s
}

func (s *FaceFaceauthInitializeRequest) SetMetainfo(v string) *FaceFaceauthInitializeRequest {
	s.Metainfo = &v
	return s
}

func (s *FaceFaceauthInitializeRequest) SetOperationType(v string) *FaceFaceauthInitializeRequest {
	s.OperationType = &v
	return s
}

func (s *FaceFaceauthInitializeRequest) SetRefImg(v string) *FaceFaceauthInitializeRequest {
	s.RefImg = &v
	return s
}

func (s *FaceFaceauthInitializeRequest) SetRefImgOssObj(v string) *FaceFaceauthInitializeRequest {
	s.RefImgOssObj = &v
	return s
}

type FaceFaceauthInitializeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty" require:"true"`
	// 产品结果明细，不影响决策
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty" require:"true"`
	// result_code_sub对应的文案
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty" require:"true"`
	// 实人认证id
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty" require:"true"`
}

func (s FaceFaceauthInitializeResponse) String() string {
	return tea.Prettify(s)
}

func (s FaceFaceauthInitializeResponse) GoString() string {
	return s.String()
}

func (s *FaceFaceauthInitializeResponse) SetReqMsgId(v string) *FaceFaceauthInitializeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *FaceFaceauthInitializeResponse) SetResultCode(v string) *FaceFaceauthInitializeResponse {
	s.ResultCode = &v
	return s
}

func (s *FaceFaceauthInitializeResponse) SetResultMsg(v string) *FaceFaceauthInitializeResponse {
	s.ResultMsg = &v
	return s
}

func (s *FaceFaceauthInitializeResponse) SetExternInfo(v string) *FaceFaceauthInitializeResponse {
	s.ExternInfo = &v
	return s
}

func (s *FaceFaceauthInitializeResponse) SetResultCodeSub(v string) *FaceFaceauthInitializeResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *FaceFaceauthInitializeResponse) SetResultMsgSub(v string) *FaceFaceauthInitializeResponse {
	s.ResultMsgSub = &v
	return s
}

func (s *FaceFaceauthInitializeResponse) SetZimId(v string) *FaceFaceauthInitializeResponse {
	s.ZimId = &v
	return s
}

type FaceFaceauthQueryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务单据号，用于核对和排查
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// zimId，用于查询认证结果
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty" require:"true"`
}

func (s FaceFaceauthQueryRequest) String() string {
	return tea.Prettify(s)
}

func (s FaceFaceauthQueryRequest) GoString() string {
	return s.String()
}

func (s *FaceFaceauthQueryRequest) SetAuthToken(v string) *FaceFaceauthQueryRequest {
	s.AuthToken = &v
	return s
}

func (s *FaceFaceauthQueryRequest) SetProductInstanceId(v string) *FaceFaceauthQueryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *FaceFaceauthQueryRequest) SetBizId(v string) *FaceFaceauthQueryRequest {
	s.BizId = &v
	return s
}

func (s *FaceFaceauthQueryRequest) SetExternParam(v string) *FaceFaceauthQueryRequest {
	s.ExternParam = &v
	return s
}

func (s *FaceFaceauthQueryRequest) SetZimId(v string) *FaceFaceauthQueryRequest {
	s.ZimId = &v
	return s
}

type FaceFaceauthQueryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty" require:"true"`
	// 产品结果明细，不影响决策
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty" require:"true"`
	// result_code_sub对应的文案
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty" require:"true"`
}

func (s FaceFaceauthQueryResponse) String() string {
	return tea.Prettify(s)
}

func (s FaceFaceauthQueryResponse) GoString() string {
	return s.String()
}

func (s *FaceFaceauthQueryResponse) SetReqMsgId(v string) *FaceFaceauthQueryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *FaceFaceauthQueryResponse) SetResultCode(v string) *FaceFaceauthQueryResponse {
	s.ResultCode = &v
	return s
}

func (s *FaceFaceauthQueryResponse) SetResultMsg(v string) *FaceFaceauthQueryResponse {
	s.ResultMsg = &v
	return s
}

func (s *FaceFaceauthQueryResponse) SetExternInfo(v string) *FaceFaceauthQueryResponse {
	s.ExternInfo = &v
	return s
}

func (s *FaceFaceauthQueryResponse) SetResultCodeSub(v string) *FaceFaceauthQueryResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *FaceFaceauthQueryResponse) SetResultMsgSub(v string) *FaceFaceauthQueryResponse {
	s.ResultMsgSub = &v
	return s
}

type IdentityFaceauthServermodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 活体照片，base64编码
	AuthImg *string `json:"auth_img,omitempty" xml:"auth_img,omitempty"`
	// BLOB：使用客户端透传的BLOB数据
	// IMAGE：正常图片模式
	AuthImgType *string `json:"auth_img_type,omitempty" xml:"auth_img_type,omitempty"`
	// 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 用户身份信息
	IdentityParam *string `json:"identity_param,omitempty" xml:"identity_param,omitempty"`
	// 操作类型，NORMAL正常模式，CUSTOM用户自定义比对源
	OperationType *string `json:"operation_type,omitempty" xml:"operation_type,omitempty"`
	// 比对源照片，base64编码
	RefImg *string `json:"ref_img,omitempty" xml:"ref_img,omitempty"`
	// 活体照片oss中转方式上传
	AuthImgOssObj *string `json:"auth_img_oss_obj,omitempty" xml:"auth_img_oss_obj,omitempty"`
	// 比对源照片oss中转方式上传
	RefImgOssObj *string `json:"ref_img_oss_obj,omitempty" xml:"ref_img_oss_obj,omitempty"`
}

func (s IdentityFaceauthServermodeRequest) String() string {
	return tea.Prettify(s)
}

func (s IdentityFaceauthServermodeRequest) GoString() string {
	return s.String()
}

func (s *IdentityFaceauthServermodeRequest) SetAuthToken(v string) *IdentityFaceauthServermodeRequest {
	s.AuthToken = &v
	return s
}

func (s *IdentityFaceauthServermodeRequest) SetProductInstanceId(v string) *IdentityFaceauthServermodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *IdentityFaceauthServermodeRequest) SetAuthImg(v string) *IdentityFaceauthServermodeRequest {
	s.AuthImg = &v
	return s
}

func (s *IdentityFaceauthServermodeRequest) SetAuthImgType(v string) *IdentityFaceauthServermodeRequest {
	s.AuthImgType = &v
	return s
}

func (s *IdentityFaceauthServermodeRequest) SetBizId(v string) *IdentityFaceauthServermodeRequest {
	s.BizId = &v
	return s
}

func (s *IdentityFaceauthServermodeRequest) SetExternParam(v string) *IdentityFaceauthServermodeRequest {
	s.ExternParam = &v
	return s
}

func (s *IdentityFaceauthServermodeRequest) SetIdentityParam(v string) *IdentityFaceauthServermodeRequest {
	s.IdentityParam = &v
	return s
}

func (s *IdentityFaceauthServermodeRequest) SetOperationType(v string) *IdentityFaceauthServermodeRequest {
	s.OperationType = &v
	return s
}

func (s *IdentityFaceauthServermodeRequest) SetRefImg(v string) *IdentityFaceauthServermodeRequest {
	s.RefImg = &v
	return s
}

func (s *IdentityFaceauthServermodeRequest) SetAuthImgOssObj(v string) *IdentityFaceauthServermodeRequest {
	s.AuthImgOssObj = &v
	return s
}

func (s *IdentityFaceauthServermodeRequest) SetRefImgOssObj(v string) *IdentityFaceauthServermodeRequest {
	s.RefImgOssObj = &v
	return s
}

type IdentityFaceauthServermodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// 产品结果明细，不影响决策
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// 明细返回码对应的文案
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
}

func (s IdentityFaceauthServermodeResponse) String() string {
	return tea.Prettify(s)
}

func (s IdentityFaceauthServermodeResponse) GoString() string {
	return s.String()
}

func (s *IdentityFaceauthServermodeResponse) SetReqMsgId(v string) *IdentityFaceauthServermodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *IdentityFaceauthServermodeResponse) SetResultCode(v string) *IdentityFaceauthServermodeResponse {
	s.ResultCode = &v
	return s
}

func (s *IdentityFaceauthServermodeResponse) SetResultMsg(v string) *IdentityFaceauthServermodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *IdentityFaceauthServermodeResponse) SetExternInfo(v string) *IdentityFaceauthServermodeResponse {
	s.ExternInfo = &v
	return s
}

func (s *IdentityFaceauthServermodeResponse) SetResultCodeSub(v string) *IdentityFaceauthServermodeResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *IdentityFaceauthServermodeResponse) SetResultMsgSub(v string) *IdentityFaceauthServermodeResponse {
	s.ResultMsgSub = &v
	return s
}

type InitializeFaceauthWebRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 用户身份信息
	IdentityParam *string `json:"identity_param,omitempty" xml:"identity_param,omitempty"`
	// metainfo环境参数
	Metainfo *string `json:"metainfo,omitempty" xml:"metainfo,omitempty"`
	// 操作类型
	OperationType *string `json:"operation_type,omitempty" xml:"operation_type,omitempty"`
	// 比对源图片
	RefImg *string `json:"ref_img,omitempty" xml:"ref_img,omitempty"`
}

func (s InitializeFaceauthWebRequest) String() string {
	return tea.Prettify(s)
}

func (s InitializeFaceauthWebRequest) GoString() string {
	return s.String()
}

func (s *InitializeFaceauthWebRequest) SetAuthToken(v string) *InitializeFaceauthWebRequest {
	s.AuthToken = &v
	return s
}

func (s *InitializeFaceauthWebRequest) SetProductInstanceId(v string) *InitializeFaceauthWebRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitializeFaceauthWebRequest) SetBizId(v string) *InitializeFaceauthWebRequest {
	s.BizId = &v
	return s
}

func (s *InitializeFaceauthWebRequest) SetExternParam(v string) *InitializeFaceauthWebRequest {
	s.ExternParam = &v
	return s
}

func (s *InitializeFaceauthWebRequest) SetIdentityParam(v string) *InitializeFaceauthWebRequest {
	s.IdentityParam = &v
	return s
}

func (s *InitializeFaceauthWebRequest) SetMetainfo(v string) *InitializeFaceauthWebRequest {
	s.Metainfo = &v
	return s
}

func (s *InitializeFaceauthWebRequest) SetOperationType(v string) *InitializeFaceauthWebRequest {
	s.OperationType = &v
	return s
}

func (s *InitializeFaceauthWebRequest) SetRefImg(v string) *InitializeFaceauthWebRequest {
	s.RefImg = &v
	return s
}

type InitializeFaceauthWebResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// 产品结果明细，不影响决策
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// result_code_sub对应的文案
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
	// 实人认证id
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty"`
}

func (s InitializeFaceauthWebResponse) String() string {
	return tea.Prettify(s)
}

func (s InitializeFaceauthWebResponse) GoString() string {
	return s.String()
}

func (s *InitializeFaceauthWebResponse) SetReqMsgId(v string) *InitializeFaceauthWebResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitializeFaceauthWebResponse) SetResultCode(v string) *InitializeFaceauthWebResponse {
	s.ResultCode = &v
	return s
}

func (s *InitializeFaceauthWebResponse) SetResultMsg(v string) *InitializeFaceauthWebResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitializeFaceauthWebResponse) SetExternInfo(v string) *InitializeFaceauthWebResponse {
	s.ExternInfo = &v
	return s
}

func (s *InitializeFaceauthWebResponse) SetResultCodeSub(v string) *InitializeFaceauthWebResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *InitializeFaceauthWebResponse) SetResultMsgSub(v string) *InitializeFaceauthWebResponse {
	s.ResultMsgSub = &v
	return s
}

func (s *InitializeFaceauthWebResponse) SetZimId(v string) *InitializeFaceauthWebResponse {
	s.ZimId = &v
	return s
}

type QueryFaceauthWebRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务单据号，用于核对和排查问题
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// zimId，用于查询认证结果
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty" require:"true"`
}

func (s QueryFaceauthWebRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceauthWebRequest) GoString() string {
	return s.String()
}

func (s *QueryFaceauthWebRequest) SetAuthToken(v string) *QueryFaceauthWebRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFaceauthWebRequest) SetProductInstanceId(v string) *QueryFaceauthWebRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFaceauthWebRequest) SetBizId(v string) *QueryFaceauthWebRequest {
	s.BizId = &v
	return s
}

func (s *QueryFaceauthWebRequest) SetExternParam(v string) *QueryFaceauthWebRequest {
	s.ExternParam = &v
	return s
}

func (s *QueryFaceauthWebRequest) SetZimId(v string) *QueryFaceauthWebRequest {
	s.ZimId = &v
	return s
}

type QueryFaceauthWebResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// 产品结果明细，不影响决策
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// result_code_sub对应的文案
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
}

func (s QueryFaceauthWebResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceauthWebResponse) GoString() string {
	return s.String()
}

func (s *QueryFaceauthWebResponse) SetReqMsgId(v string) *QueryFaceauthWebResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFaceauthWebResponse) SetResultCode(v string) *QueryFaceauthWebResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFaceauthWebResponse) SetResultMsg(v string) *QueryFaceauthWebResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFaceauthWebResponse) SetExternInfo(v string) *QueryFaceauthWebResponse {
	s.ExternInfo = &v
	return s
}

func (s *QueryFaceauthWebResponse) SetResultCodeSub(v string) *QueryFaceauthWebResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *QueryFaceauthWebResponse) SetResultMsgSub(v string) *QueryFaceauthWebResponse {
	s.ResultMsgSub = &v
	return s
}

type QueryFaceauthMeteringRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务流水号
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 截止时间（整小时）
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 初始化接口传入的二级商户id
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// 需要查询的计量类型
	// 实名新用户:realNameNewUser
	// 实名老用户:realNameOldUser
	// 匿名注册:anonymousEnroll
	// 匿名比对:anonymousAuth
	//
	MeteringType *string `json:"metering_type,omitempty" xml:"metering_type,omitempty"`
	// 起始时间（整小时）
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s QueryFaceauthMeteringRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceauthMeteringRequest) GoString() string {
	return s.String()
}

func (s *QueryFaceauthMeteringRequest) SetAuthToken(v string) *QueryFaceauthMeteringRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFaceauthMeteringRequest) SetProductInstanceId(v string) *QueryFaceauthMeteringRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFaceauthMeteringRequest) SetBizId(v string) *QueryFaceauthMeteringRequest {
	s.BizId = &v
	return s
}

func (s *QueryFaceauthMeteringRequest) SetEndTime(v string) *QueryFaceauthMeteringRequest {
	s.EndTime = &v
	return s
}

func (s *QueryFaceauthMeteringRequest) SetMerchantId(v string) *QueryFaceauthMeteringRequest {
	s.MerchantId = &v
	return s
}

func (s *QueryFaceauthMeteringRequest) SetMeteringType(v string) *QueryFaceauthMeteringRequest {
	s.MeteringType = &v
	return s
}

func (s *QueryFaceauthMeteringRequest) SetStartTime(v string) *QueryFaceauthMeteringRequest {
	s.StartTime = &v
	return s
}

type QueryFaceauthMeteringResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 计量数据
	MeteringData *MeteringData `json:"metering_data,omitempty" xml:"metering_data,omitempty"`
}

func (s QueryFaceauthMeteringResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceauthMeteringResponse) GoString() string {
	return s.String()
}

func (s *QueryFaceauthMeteringResponse) SetReqMsgId(v string) *QueryFaceauthMeteringResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFaceauthMeteringResponse) SetResultCode(v string) *QueryFaceauthMeteringResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFaceauthMeteringResponse) SetResultMsg(v string) *QueryFaceauthMeteringResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFaceauthMeteringResponse) SetMeteringData(v *MeteringData) *QueryFaceauthMeteringResponse {
	s.MeteringData = v
	return s
}

type InitFaceauthFaceLiteRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 用户身份信息
	IdentityParam *string `json:"identity_param,omitempty" xml:"identity_param,omitempty" require:"true"`
	// metainfo环境参数
	Metainfo *string `json:"metainfo,omitempty" xml:"metainfo,omitempty" require:"true"`
	// 操作类型
	OperationType *string `json:"operation_type,omitempty" xml:"operation_type,omitempty"`
	// 比对源图片
	RefImg *string `json:"ref_img,omitempty" xml:"ref_img,omitempty"`
}

func (s InitFaceauthFaceLiteRequest) String() string {
	return tea.Prettify(s)
}

func (s InitFaceauthFaceLiteRequest) GoString() string {
	return s.String()
}

func (s *InitFaceauthFaceLiteRequest) SetAuthToken(v string) *InitFaceauthFaceLiteRequest {
	s.AuthToken = &v
	return s
}

func (s *InitFaceauthFaceLiteRequest) SetProductInstanceId(v string) *InitFaceauthFaceLiteRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitFaceauthFaceLiteRequest) SetBizId(v string) *InitFaceauthFaceLiteRequest {
	s.BizId = &v
	return s
}

func (s *InitFaceauthFaceLiteRequest) SetExternParam(v string) *InitFaceauthFaceLiteRequest {
	s.ExternParam = &v
	return s
}

func (s *InitFaceauthFaceLiteRequest) SetIdentityParam(v string) *InitFaceauthFaceLiteRequest {
	s.IdentityParam = &v
	return s
}

func (s *InitFaceauthFaceLiteRequest) SetMetainfo(v string) *InitFaceauthFaceLiteRequest {
	s.Metainfo = &v
	return s
}

func (s *InitFaceauthFaceLiteRequest) SetOperationType(v string) *InitFaceauthFaceLiteRequest {
	s.OperationType = &v
	return s
}

func (s *InitFaceauthFaceLiteRequest) SetRefImg(v string) *InitFaceauthFaceLiteRequest {
	s.RefImg = &v
	return s
}

type InitFaceauthFaceLiteResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 扩展结果
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// 人脸协议
	Protocol *string `json:"protocol,omitempty" xml:"protocol,omitempty"`
	// 产品结果明细，不影响决策
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// 明细返回码对应的文案
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
	// 刷脸认证唯一标识。如果初始化失败则为空，可通过返回码分析具体原因
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty"`
}

func (s InitFaceauthFaceLiteResponse) String() string {
	return tea.Prettify(s)
}

func (s InitFaceauthFaceLiteResponse) GoString() string {
	return s.String()
}

func (s *InitFaceauthFaceLiteResponse) SetReqMsgId(v string) *InitFaceauthFaceLiteResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitFaceauthFaceLiteResponse) SetResultCode(v string) *InitFaceauthFaceLiteResponse {
	s.ResultCode = &v
	return s
}

func (s *InitFaceauthFaceLiteResponse) SetResultMsg(v string) *InitFaceauthFaceLiteResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitFaceauthFaceLiteResponse) SetExternInfo(v string) *InitFaceauthFaceLiteResponse {
	s.ExternInfo = &v
	return s
}

func (s *InitFaceauthFaceLiteResponse) SetProtocol(v string) *InitFaceauthFaceLiteResponse {
	s.Protocol = &v
	return s
}

func (s *InitFaceauthFaceLiteResponse) SetResultCodeSub(v string) *InitFaceauthFaceLiteResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *InitFaceauthFaceLiteResponse) SetResultMsgSub(v string) *InitFaceauthFaceLiteResponse {
	s.ResultMsgSub = &v
	return s
}

func (s *InitFaceauthFaceLiteResponse) SetZimId(v string) *InitFaceauthFaceLiteResponse {
	s.ZimId = &v
	return s
}

type QueryFaceauthDataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 数据地址
	DataUrl *string `json:"data_url,omitempty" xml:"data_url,omitempty" require:"true"`
}

func (s QueryFaceauthDataRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceauthDataRequest) GoString() string {
	return s.String()
}

func (s *QueryFaceauthDataRequest) SetAuthToken(v string) *QueryFaceauthDataRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFaceauthDataRequest) SetProductInstanceId(v string) *QueryFaceauthDataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFaceauthDataRequest) SetBizId(v string) *QueryFaceauthDataRequest {
	s.BizId = &v
	return s
}

func (s *QueryFaceauthDataRequest) SetDataUrl(v string) *QueryFaceauthDataRequest {
	s.DataUrl = &v
	return s
}

type QueryFaceauthDataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询结果详情
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryFaceauthDataResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceauthDataResponse) GoString() string {
	return s.String()
}

func (s *QueryFaceauthDataResponse) SetReqMsgId(v string) *QueryFaceauthDataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFaceauthDataResponse) SetResultCode(v string) *QueryFaceauthDataResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFaceauthDataResponse) SetResultMsg(v string) *QueryFaceauthDataResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFaceauthDataResponse) SetData(v string) *QueryFaceauthDataResponse {
	s.Data = &v
	return s
}

type ExecAuthenticationCustomerFaceabilityRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// extract(提取特征)、sex(检测性别)、rect(人脸矩形框识别)
	Ability *string `json:"ability,omitempty" xml:"ability,omitempty" require:"true"`
	// 算法版本
	AlgVer *string `json:"alg_ver,omitempty" xml:"alg_ver,omitempty" require:"true"`
	// 图片encode base64 String
	AuthImg *string `json:"auth_img,omitempty" xml:"auth_img,omitempty" require:"true"`
	// 业务接入方生成，唯一ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
}

func (s ExecAuthenticationCustomerFaceabilityRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAuthenticationCustomerFaceabilityRequest) GoString() string {
	return s.String()
}

func (s *ExecAuthenticationCustomerFaceabilityRequest) SetAuthToken(v string) *ExecAuthenticationCustomerFaceabilityRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAuthenticationCustomerFaceabilityRequest) SetProductInstanceId(v string) *ExecAuthenticationCustomerFaceabilityRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAuthenticationCustomerFaceabilityRequest) SetAbility(v string) *ExecAuthenticationCustomerFaceabilityRequest {
	s.Ability = &v
	return s
}

func (s *ExecAuthenticationCustomerFaceabilityRequest) SetAlgVer(v string) *ExecAuthenticationCustomerFaceabilityRequest {
	s.AlgVer = &v
	return s
}

func (s *ExecAuthenticationCustomerFaceabilityRequest) SetAuthImg(v string) *ExecAuthenticationCustomerFaceabilityRequest {
	s.AuthImg = &v
	return s
}

func (s *ExecAuthenticationCustomerFaceabilityRequest) SetBizId(v string) *ExecAuthenticationCustomerFaceabilityRequest {
	s.BizId = &v
	return s
}

func (s *ExecAuthenticationCustomerFaceabilityRequest) SetSceneCode(v string) *ExecAuthenticationCustomerFaceabilityRequest {
	s.SceneCode = &v
	return s
}

type ExecAuthenticationCustomerFaceabilityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecAuthenticationCustomerFaceabilityResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAuthenticationCustomerFaceabilityResponse) GoString() string {
	return s.String()
}

func (s *ExecAuthenticationCustomerFaceabilityResponse) SetReqMsgId(v string) *ExecAuthenticationCustomerFaceabilityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAuthenticationCustomerFaceabilityResponse) SetResultCode(v string) *ExecAuthenticationCustomerFaceabilityResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAuthenticationCustomerFaceabilityResponse) SetResultMsg(v string) *ExecAuthenticationCustomerFaceabilityResponse {
	s.ResultMsg = &v
	return s
}

type InitFaceauthZimRequest struct {
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
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty" require:"true"`
	// 身份信息参数
	ZimPrincipal *string `json:"zim_principal,omitempty" xml:"zim_principal,omitempty"`
}

func (s InitFaceauthZimRequest) String() string {
	return tea.Prettify(s)
}

func (s InitFaceauthZimRequest) GoString() string {
	return s.String()
}

func (s *InitFaceauthZimRequest) SetAuthToken(v string) *InitFaceauthZimRequest {
	s.AuthToken = &v
	return s
}

func (s *InitFaceauthZimRequest) SetProductInstanceId(v string) *InitFaceauthZimRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitFaceauthZimRequest) SetBizData(v string) *InitFaceauthZimRequest {
	s.BizData = &v
	return s
}

func (s *InitFaceauthZimRequest) SetChannel(v string) *InitFaceauthZimRequest {
	s.Channel = &v
	return s
}

func (s *InitFaceauthZimRequest) SetMerchant(v string) *InitFaceauthZimRequest {
	s.Merchant = &v
	return s
}

func (s *InitFaceauthZimRequest) SetMetaInfo(v string) *InitFaceauthZimRequest {
	s.MetaInfo = &v
	return s
}

func (s *InitFaceauthZimRequest) SetProduceNode(v string) *InitFaceauthZimRequest {
	s.ProduceNode = &v
	return s
}

func (s *InitFaceauthZimRequest) SetProductName(v string) *InitFaceauthZimRequest {
	s.ProductName = &v
	return s
}

func (s *InitFaceauthZimRequest) SetZimId(v string) *InitFaceauthZimRequest {
	s.ZimId = &v
	return s
}

func (s *InitFaceauthZimRequest) SetZimPrincipal(v string) *InitFaceauthZimRequest {
	s.ZimPrincipal = &v
	return s
}

type InitFaceauthZimResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
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
	ZimiId *string `json:"zimi_id,omitempty" xml:"zimi_id,omitempty"`
}

func (s InitFaceauthZimResponse) String() string {
	return tea.Prettify(s)
}

func (s InitFaceauthZimResponse) GoString() string {
	return s.String()
}

func (s *InitFaceauthZimResponse) SetReqMsgId(v string) *InitFaceauthZimResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitFaceauthZimResponse) SetResultCode(v string) *InitFaceauthZimResponse {
	s.ResultCode = &v
	return s
}

func (s *InitFaceauthZimResponse) SetResultMsg(v string) *InitFaceauthZimResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitFaceauthZimResponse) SetExtParams(v string) *InitFaceauthZimResponse {
	s.ExtParams = &v
	return s
}

func (s *InitFaceauthZimResponse) SetMessage(v string) *InitFaceauthZimResponse {
	s.Message = &v
	return s
}

func (s *InitFaceauthZimResponse) SetProtocol(v string) *InitFaceauthZimResponse {
	s.Protocol = &v
	return s
}

func (s *InitFaceauthZimResponse) SetRetCode(v string) *InitFaceauthZimResponse {
	s.RetCode = &v
	return s
}

func (s *InitFaceauthZimResponse) SetRetCodeSub(v string) *InitFaceauthZimResponse {
	s.RetCodeSub = &v
	return s
}

func (s *InitFaceauthZimResponse) SetRetMessageSub(v string) *InitFaceauthZimResponse {
	s.RetMessageSub = &v
	return s
}

func (s *InitFaceauthZimResponse) SetZimiId(v string) *InitFaceauthZimResponse {
	s.ZimiId = &v
	return s
}

type VerifyFaceauthZimRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 扩展信息,Map的json格式
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 人脸业务参数
	ZimData *string `json:"zim_data,omitempty" xml:"zim_data,omitempty" require:"true"`
	// 实人认证id
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty" require:"true"`
	// zim_data可通过oss方式中转
	ZimDataOssObj *string `json:"zim_data_oss_obj,omitempty" xml:"zim_data_oss_obj,omitempty"`
}

func (s VerifyFaceauthZimRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyFaceauthZimRequest) GoString() string {
	return s.String()
}

func (s *VerifyFaceauthZimRequest) SetAuthToken(v string) *VerifyFaceauthZimRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyFaceauthZimRequest) SetProductInstanceId(v string) *VerifyFaceauthZimRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyFaceauthZimRequest) SetExternParam(v string) *VerifyFaceauthZimRequest {
	s.ExternParam = &v
	return s
}

func (s *VerifyFaceauthZimRequest) SetZimData(v string) *VerifyFaceauthZimRequest {
	s.ZimData = &v
	return s
}

func (s *VerifyFaceauthZimRequest) SetZimId(v string) *VerifyFaceauthZimRequest {
	s.ZimId = &v
	return s
}

func (s *VerifyFaceauthZimRequest) SetZimDataOssObj(v string) *VerifyFaceauthZimRequest {
	s.ZimDataOssObj = &v
	return s
}

type VerifyFaceauthZimResponse struct {
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
	// 返回的身份信息
	IdentityInfo *string `json:"identity_info,omitempty" xml:"identity_info,omitempty"`
}

func (s VerifyFaceauthZimResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyFaceauthZimResponse) GoString() string {
	return s.String()
}

func (s *VerifyFaceauthZimResponse) SetReqMsgId(v string) *VerifyFaceauthZimResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyFaceauthZimResponse) SetResultCode(v string) *VerifyFaceauthZimResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyFaceauthZimResponse) SetResultMsg(v string) *VerifyFaceauthZimResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyFaceauthZimResponse) SetExtParams(v string) *VerifyFaceauthZimResponse {
	s.ExtParams = &v
	return s
}

func (s *VerifyFaceauthZimResponse) SetHasNext(v string) *VerifyFaceauthZimResponse {
	s.HasNext = &v
	return s
}

func (s *VerifyFaceauthZimResponse) SetNextProtocol(v string) *VerifyFaceauthZimResponse {
	s.NextProtocol = &v
	return s
}

func (s *VerifyFaceauthZimResponse) SetProductRetCode(v string) *VerifyFaceauthZimResponse {
	s.ProductRetCode = &v
	return s
}

func (s *VerifyFaceauthZimResponse) SetRetCodeSub(v string) *VerifyFaceauthZimResponse {
	s.RetCodeSub = &v
	return s
}

func (s *VerifyFaceauthZimResponse) SetRetMessageSub(v string) *VerifyFaceauthZimResponse {
	s.RetMessageSub = &v
	return s
}

func (s *VerifyFaceauthZimResponse) SetValidationRetCode(v string) *VerifyFaceauthZimResponse {
	s.ValidationRetCode = &v
	return s
}

func (s *VerifyFaceauthZimResponse) SetIdentityInfo(v string) *VerifyFaceauthZimResponse {
	s.IdentityInfo = &v
	return s
}

type RecognizeFaceauthOcrRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据内容
	DataContext *string `json:"data_context,omitempty" xml:"data_context,omitempty" require:"true"`
	// 数据类型：OSS_ADDR/BASE64_JPG
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty" require:"true"`
	// 扩展字段
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// face: 身份证正面 back: 身份证反面 缺省值是：face
	//
	Side *string `json:"side,omitempty" xml:"side,omitempty" require:"true"`
	// zimid
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty" require:"true"`
}

func (s RecognizeFaceauthOcrRequest) String() string {
	return tea.Prettify(s)
}

func (s RecognizeFaceauthOcrRequest) GoString() string {
	return s.String()
}

func (s *RecognizeFaceauthOcrRequest) SetAuthToken(v string) *RecognizeFaceauthOcrRequest {
	s.AuthToken = &v
	return s
}

func (s *RecognizeFaceauthOcrRequest) SetProductInstanceId(v string) *RecognizeFaceauthOcrRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RecognizeFaceauthOcrRequest) SetDataContext(v string) *RecognizeFaceauthOcrRequest {
	s.DataContext = &v
	return s
}

func (s *RecognizeFaceauthOcrRequest) SetDataType(v string) *RecognizeFaceauthOcrRequest {
	s.DataType = &v
	return s
}

func (s *RecognizeFaceauthOcrRequest) SetExternParam(v string) *RecognizeFaceauthOcrRequest {
	s.ExternParam = &v
	return s
}

func (s *RecognizeFaceauthOcrRequest) SetSide(v string) *RecognizeFaceauthOcrRequest {
	s.Side = &v
	return s
}

func (s *RecognizeFaceauthOcrRequest) SetZimId(v string) *RecognizeFaceauthOcrRequest {
	s.ZimId = &v
	return s
}

type RecognizeFaceauthOcrResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// Map的json格式,预留
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// Map的json格式：里面存储ocr识别的结果：
	//
	// name:姓名
	//
	// sex：性别
	//
	// num：身份证号码
	//
	// birth：出生年月日
	//
	// address：地址
	//
	// nationality：名族
	//
	// start_date：身份证有效期开始时间
	//
	// end_date：身份证有效期截止时间
	//
	// issue：备案公安局
	OcrInfo *string `json:"ocr_info,omitempty" xml:"ocr_info,omitempty"`
	// 返回码
	RetCode *string `json:"ret_code,omitempty" xml:"ret_code,omitempty"`
	// 业务返回码
	//
	RetCodeSub *string `json:"ret_code_sub,omitempty" xml:"ret_code_sub,omitempty"`
	// 业务返回码描述
	//
	RetMessageSub *string `json:"ret_message_sub,omitempty" xml:"ret_message_sub,omitempty"`
	// face: 身份证正面 back: 身份证反面 缺省值是：face
	//
	Side *string `json:"side,omitempty" xml:"side,omitempty"`
	// zimid
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty"`
}

func (s RecognizeFaceauthOcrResponse) String() string {
	return tea.Prettify(s)
}

func (s RecognizeFaceauthOcrResponse) GoString() string {
	return s.String()
}

func (s *RecognizeFaceauthOcrResponse) SetReqMsgId(v string) *RecognizeFaceauthOcrResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RecognizeFaceauthOcrResponse) SetResultCode(v string) *RecognizeFaceauthOcrResponse {
	s.ResultCode = &v
	return s
}

func (s *RecognizeFaceauthOcrResponse) SetResultMsg(v string) *RecognizeFaceauthOcrResponse {
	s.ResultMsg = &v
	return s
}

func (s *RecognizeFaceauthOcrResponse) SetExternInfo(v string) *RecognizeFaceauthOcrResponse {
	s.ExternInfo = &v
	return s
}

func (s *RecognizeFaceauthOcrResponse) SetOcrInfo(v string) *RecognizeFaceauthOcrResponse {
	s.OcrInfo = &v
	return s
}

func (s *RecognizeFaceauthOcrResponse) SetRetCode(v string) *RecognizeFaceauthOcrResponse {
	s.RetCode = &v
	return s
}

func (s *RecognizeFaceauthOcrResponse) SetRetCodeSub(v string) *RecognizeFaceauthOcrResponse {
	s.RetCodeSub = &v
	return s
}

func (s *RecognizeFaceauthOcrResponse) SetRetMessageSub(v string) *RecognizeFaceauthOcrResponse {
	s.RetMessageSub = &v
	return s
}

func (s *RecognizeFaceauthOcrResponse) SetSide(v string) *RecognizeFaceauthOcrResponse {
	s.Side = &v
	return s
}

func (s *RecognizeFaceauthOcrResponse) SetZimId(v string) *RecognizeFaceauthOcrResponse {
	s.ZimId = &v
	return s
}

type InitFaceauthWebsdkRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 用户身份信息
	IdentityParam *string `json:"identity_param,omitempty" xml:"identity_param,omitempty"`
	// metainfo环境参数
	Metainfo *string `json:"metainfo,omitempty" xml:"metainfo,omitempty"`
	// 操作类型
	OperationType *string `json:"operation_type,omitempty" xml:"operation_type,omitempty"`
	// 比对源图片
	RefImg *string `json:"ref_img,omitempty" xml:"ref_img,omitempty"`
	// 比对源照片oss方式中转
	RefImgOssObj *string `json:"ref_img_oss_obj,omitempty" xml:"ref_img_oss_obj,omitempty"`
}

func (s InitFaceauthWebsdkRequest) String() string {
	return tea.Prettify(s)
}

func (s InitFaceauthWebsdkRequest) GoString() string {
	return s.String()
}

func (s *InitFaceauthWebsdkRequest) SetAuthToken(v string) *InitFaceauthWebsdkRequest {
	s.AuthToken = &v
	return s
}

func (s *InitFaceauthWebsdkRequest) SetProductInstanceId(v string) *InitFaceauthWebsdkRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitFaceauthWebsdkRequest) SetBizId(v string) *InitFaceauthWebsdkRequest {
	s.BizId = &v
	return s
}

func (s *InitFaceauthWebsdkRequest) SetExternParam(v string) *InitFaceauthWebsdkRequest {
	s.ExternParam = &v
	return s
}

func (s *InitFaceauthWebsdkRequest) SetIdentityParam(v string) *InitFaceauthWebsdkRequest {
	s.IdentityParam = &v
	return s
}

func (s *InitFaceauthWebsdkRequest) SetMetainfo(v string) *InitFaceauthWebsdkRequest {
	s.Metainfo = &v
	return s
}

func (s *InitFaceauthWebsdkRequest) SetOperationType(v string) *InitFaceauthWebsdkRequest {
	s.OperationType = &v
	return s
}

func (s *InitFaceauthWebsdkRequest) SetRefImg(v string) *InitFaceauthWebsdkRequest {
	s.RefImg = &v
	return s
}

func (s *InitFaceauthWebsdkRequest) SetRefImgOssObj(v string) *InitFaceauthWebsdkRequest {
	s.RefImgOssObj = &v
	return s
}

type InitFaceauthWebsdkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// 产品结果明细，不影响决策
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// result_code_sub对应的文案
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
	// 实人认证id
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty"`
}

func (s InitFaceauthWebsdkResponse) String() string {
	return tea.Prettify(s)
}

func (s InitFaceauthWebsdkResponse) GoString() string {
	return s.String()
}

func (s *InitFaceauthWebsdkResponse) SetReqMsgId(v string) *InitFaceauthWebsdkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitFaceauthWebsdkResponse) SetResultCode(v string) *InitFaceauthWebsdkResponse {
	s.ResultCode = &v
	return s
}

func (s *InitFaceauthWebsdkResponse) SetResultMsg(v string) *InitFaceauthWebsdkResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitFaceauthWebsdkResponse) SetExternInfo(v string) *InitFaceauthWebsdkResponse {
	s.ExternInfo = &v
	return s
}

func (s *InitFaceauthWebsdkResponse) SetResultCodeSub(v string) *InitFaceauthWebsdkResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *InitFaceauthWebsdkResponse) SetResultMsgSub(v string) *InitFaceauthWebsdkResponse {
	s.ResultMsgSub = &v
	return s
}

func (s *InitFaceauthWebsdkResponse) SetZimId(v string) *InitFaceauthWebsdkResponse {
	s.ZimId = &v
	return s
}

type QueryFaceauthWebsdkRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务单据号，用于核对和排查问题
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// zimId，用于查询认证结果
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty" require:"true"`
}

func (s QueryFaceauthWebsdkRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceauthWebsdkRequest) GoString() string {
	return s.String()
}

func (s *QueryFaceauthWebsdkRequest) SetAuthToken(v string) *QueryFaceauthWebsdkRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFaceauthWebsdkRequest) SetProductInstanceId(v string) *QueryFaceauthWebsdkRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFaceauthWebsdkRequest) SetBizId(v string) *QueryFaceauthWebsdkRequest {
	s.BizId = &v
	return s
}

func (s *QueryFaceauthWebsdkRequest) SetExternParam(v string) *QueryFaceauthWebsdkRequest {
	s.ExternParam = &v
	return s
}

func (s *QueryFaceauthWebsdkRequest) SetZimId(v string) *QueryFaceauthWebsdkRequest {
	s.ZimId = &v
	return s
}

type QueryFaceauthWebsdkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// 产品结果明细，不影响决策
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// result_code_sub对应的文案
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
}

func (s QueryFaceauthWebsdkResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceauthWebsdkResponse) GoString() string {
	return s.String()
}

func (s *QueryFaceauthWebsdkResponse) SetReqMsgId(v string) *QueryFaceauthWebsdkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFaceauthWebsdkResponse) SetResultCode(v string) *QueryFaceauthWebsdkResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFaceauthWebsdkResponse) SetResultMsg(v string) *QueryFaceauthWebsdkResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFaceauthWebsdkResponse) SetExternInfo(v string) *QueryFaceauthWebsdkResponse {
	s.ExternInfo = &v
	return s
}

func (s *QueryFaceauthWebsdkResponse) SetResultCodeSub(v string) *QueryFaceauthWebsdkResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *QueryFaceauthWebsdkResponse) SetResultMsgSub(v string) *QueryFaceauthWebsdkResponse {
	s.ResultMsgSub = &v
	return s
}

type QueryFaceauthFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// zoloz认证会话主键
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty" require:"true"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s QueryFaceauthFileRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceauthFileRequest) GoString() string {
	return s.String()
}

func (s *QueryFaceauthFileRequest) SetAuthToken(v string) *QueryFaceauthFileRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFaceauthFileRequest) SetProductInstanceId(v string) *QueryFaceauthFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFaceauthFileRequest) SetZimId(v string) *QueryFaceauthFileRequest {
	s.ZimId = &v
	return s
}

func (s *QueryFaceauthFileRequest) SetExternParam(v string) *QueryFaceauthFileRequest {
	s.ExternParam = &v
	return s
}

type QueryFaceauthFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// 结果码
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// result_code_sub对应的文案
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
}

func (s QueryFaceauthFileResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceauthFileResponse) GoString() string {
	return s.String()
}

func (s *QueryFaceauthFileResponse) SetReqMsgId(v string) *QueryFaceauthFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFaceauthFileResponse) SetResultCode(v string) *QueryFaceauthFileResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFaceauthFileResponse) SetResultMsg(v string) *QueryFaceauthFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFaceauthFileResponse) SetExternInfo(v string) *QueryFaceauthFileResponse {
	s.ExternInfo = &v
	return s
}

func (s *QueryFaceauthFileResponse) SetResultCodeSub(v string) *QueryFaceauthFileResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *QueryFaceauthFileResponse) SetResultMsgSub(v string) *QueryFaceauthFileResponse {
	s.ResultMsgSub = &v
	return s
}

type InitFaceauthFaceplusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务唯一单号
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 身份，需要公钥加密
	IdentityParam *string `json:"identity_param,omitempty" xml:"identity_param,omitempty" require:"true"`
	// 客户端采集
	Metainfo *string `json:"metainfo,omitempty" xml:"metainfo,omitempty" require:"true"`
	// 外部参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 操作类型
	OperationType *string `json:"operation_type,omitempty" xml:"operation_type,omitempty"`
	// 比对源图片
	RefImg *string `json:"ref_img,omitempty" xml:"ref_img,omitempty"`
}

func (s InitFaceauthFaceplusRequest) String() string {
	return tea.Prettify(s)
}

func (s InitFaceauthFaceplusRequest) GoString() string {
	return s.String()
}

func (s *InitFaceauthFaceplusRequest) SetAuthToken(v string) *InitFaceauthFaceplusRequest {
	s.AuthToken = &v
	return s
}

func (s *InitFaceauthFaceplusRequest) SetProductInstanceId(v string) *InitFaceauthFaceplusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitFaceauthFaceplusRequest) SetBizId(v string) *InitFaceauthFaceplusRequest {
	s.BizId = &v
	return s
}

func (s *InitFaceauthFaceplusRequest) SetIdentityParam(v string) *InitFaceauthFaceplusRequest {
	s.IdentityParam = &v
	return s
}

func (s *InitFaceauthFaceplusRequest) SetMetainfo(v string) *InitFaceauthFaceplusRequest {
	s.Metainfo = &v
	return s
}

func (s *InitFaceauthFaceplusRequest) SetExternParam(v string) *InitFaceauthFaceplusRequest {
	s.ExternParam = &v
	return s
}

func (s *InitFaceauthFaceplusRequest) SetOperationType(v string) *InitFaceauthFaceplusRequest {
	s.OperationType = &v
	return s
}

func (s *InitFaceauthFaceplusRequest) SetRefImg(v string) *InitFaceauthFaceplusRequest {
	s.RefImg = &v
	return s
}

type InitFaceauthFaceplusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证会话唯一标识
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty"`
	// 结果码
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// 结果信息
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
	// 外部参数
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s InitFaceauthFaceplusResponse) String() string {
	return tea.Prettify(s)
}

func (s InitFaceauthFaceplusResponse) GoString() string {
	return s.String()
}

func (s *InitFaceauthFaceplusResponse) SetReqMsgId(v string) *InitFaceauthFaceplusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitFaceauthFaceplusResponse) SetResultCode(v string) *InitFaceauthFaceplusResponse {
	s.ResultCode = &v
	return s
}

func (s *InitFaceauthFaceplusResponse) SetResultMsg(v string) *InitFaceauthFaceplusResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitFaceauthFaceplusResponse) SetZimId(v string) *InitFaceauthFaceplusResponse {
	s.ZimId = &v
	return s
}

func (s *InitFaceauthFaceplusResponse) SetResultCodeSub(v string) *InitFaceauthFaceplusResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *InitFaceauthFaceplusResponse) SetResultMsgSub(v string) *InitFaceauthFaceplusResponse {
	s.ResultMsgSub = &v
	return s
}

func (s *InitFaceauthFaceplusResponse) SetExternInfo(v string) *InitFaceauthFaceplusResponse {
	s.ExternInfo = &v
	return s
}

type QueryFaceauthFaceplusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 认证会话唯一标识
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty" require:"true"`
	// 唯一单号
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 外部参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s QueryFaceauthFaceplusRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceauthFaceplusRequest) GoString() string {
	return s.String()
}

func (s *QueryFaceauthFaceplusRequest) SetAuthToken(v string) *QueryFaceauthFaceplusRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFaceauthFaceplusRequest) SetProductInstanceId(v string) *QueryFaceauthFaceplusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFaceauthFaceplusRequest) SetZimId(v string) *QueryFaceauthFaceplusRequest {
	s.ZimId = &v
	return s
}

func (s *QueryFaceauthFaceplusRequest) SetBizId(v string) *QueryFaceauthFaceplusRequest {
	s.BizId = &v
	return s
}

func (s *QueryFaceauthFaceplusRequest) SetExternParam(v string) *QueryFaceauthFaceplusRequest {
	s.ExternParam = &v
	return s
}

type QueryFaceauthFaceplusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果码
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// 结果信息
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
	// 外部参数
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s QueryFaceauthFaceplusResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceauthFaceplusResponse) GoString() string {
	return s.String()
}

func (s *QueryFaceauthFaceplusResponse) SetReqMsgId(v string) *QueryFaceauthFaceplusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFaceauthFaceplusResponse) SetResultCode(v string) *QueryFaceauthFaceplusResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFaceauthFaceplusResponse) SetResultMsg(v string) *QueryFaceauthFaceplusResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFaceauthFaceplusResponse) SetResultCodeSub(v string) *QueryFaceauthFaceplusResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *QueryFaceauthFaceplusResponse) SetResultMsgSub(v string) *QueryFaceauthFaceplusResponse {
	s.ResultMsgSub = &v
	return s
}

func (s *QueryFaceauthFaceplusResponse) SetExternInfo(v string) *QueryFaceauthFaceplusResponse {
	s.ExternInfo = &v
	return s
}

type InitFaceauthFaceWishRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 身份，需要公钥加密
	IdentityParam *string `json:"identity_param,omitempty" xml:"identity_param,omitempty" require:"true"`
	// 客户端采集
	Metainfo *string `json:"metainfo,omitempty" xml:"metainfo,omitempty" require:"true"`
	// 外部参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 操作类型
	OperationType *string `json:"operation_type,omitempty" xml:"operation_type,omitempty"`
	// 比对源图片oss中转
	RefImgOssObj *string `json:"ref_img_oss_obj,omitempty" xml:"ref_img_oss_obj,omitempty"`
}

func (s InitFaceauthFaceWishRequest) String() string {
	return tea.Prettify(s)
}

func (s InitFaceauthFaceWishRequest) GoString() string {
	return s.String()
}

func (s *InitFaceauthFaceWishRequest) SetAuthToken(v string) *InitFaceauthFaceWishRequest {
	s.AuthToken = &v
	return s
}

func (s *InitFaceauthFaceWishRequest) SetProductInstanceId(v string) *InitFaceauthFaceWishRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitFaceauthFaceWishRequest) SetBizId(v string) *InitFaceauthFaceWishRequest {
	s.BizId = &v
	return s
}

func (s *InitFaceauthFaceWishRequest) SetIdentityParam(v string) *InitFaceauthFaceWishRequest {
	s.IdentityParam = &v
	return s
}

func (s *InitFaceauthFaceWishRequest) SetMetainfo(v string) *InitFaceauthFaceWishRequest {
	s.Metainfo = &v
	return s
}

func (s *InitFaceauthFaceWishRequest) SetExternParam(v string) *InitFaceauthFaceWishRequest {
	s.ExternParam = &v
	return s
}

func (s *InitFaceauthFaceWishRequest) SetOperationType(v string) *InitFaceauthFaceWishRequest {
	s.OperationType = &v
	return s
}

func (s *InitFaceauthFaceWishRequest) SetRefImgOssObj(v string) *InitFaceauthFaceWishRequest {
	s.RefImgOssObj = &v
	return s
}

type InitFaceauthFaceWishResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实人认证id
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty"`
	// 预留扩展结果
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// 结果码
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// 结果信息
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
}

func (s InitFaceauthFaceWishResponse) String() string {
	return tea.Prettify(s)
}

func (s InitFaceauthFaceWishResponse) GoString() string {
	return s.String()
}

func (s *InitFaceauthFaceWishResponse) SetReqMsgId(v string) *InitFaceauthFaceWishResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitFaceauthFaceWishResponse) SetResultCode(v string) *InitFaceauthFaceWishResponse {
	s.ResultCode = &v
	return s
}

func (s *InitFaceauthFaceWishResponse) SetResultMsg(v string) *InitFaceauthFaceWishResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitFaceauthFaceWishResponse) SetZimId(v string) *InitFaceauthFaceWishResponse {
	s.ZimId = &v
	return s
}

func (s *InitFaceauthFaceWishResponse) SetExternInfo(v string) *InitFaceauthFaceWishResponse {
	s.ExternInfo = &v
	return s
}

func (s *InitFaceauthFaceWishResponse) SetResultCodeSub(v string) *InitFaceauthFaceWishResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *InitFaceauthFaceWishResponse) SetResultMsgSub(v string) *InitFaceauthFaceWishResponse {
	s.ResultMsgSub = &v
	return s
}

type VerifyFaceauthVideoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 活体照片，base64编码
	AuthImg *string `json:"auth_img,omitempty" xml:"auth_img,omitempty"`
	// BLOB：使用客户端透传的BLOB数据 IMAGE：正常图片模式
	AuthImgType *string `json:"auth_img_type,omitempty" xml:"auth_img_type,omitempty"`
	// 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 用户身份信息
	IdentityParam *string `json:"identity_param,omitempty" xml:"identity_param,omitempty"`
	// 操作类型，NORMAL正常模式，CUSTOM用户自定义比对源
	OperationType *string `json:"operation_type,omitempty" xml:"operation_type,omitempty"`
	// 比对源照片，base64编码
	RefImg *string `json:"ref_img,omitempty" xml:"ref_img,omitempty"`
	// 活体照片oss中转方式上传
	AuthImgOssObj *string `json:"auth_img_oss_obj,omitempty" xml:"auth_img_oss_obj,omitempty"`
	// 比对源照片oss中转方式上传
	RefImgOssObj *string `json:"ref_img_oss_obj,omitempty" xml:"ref_img_oss_obj,omitempty"`
}

func (s VerifyFaceauthVideoRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyFaceauthVideoRequest) GoString() string {
	return s.String()
}

func (s *VerifyFaceauthVideoRequest) SetAuthToken(v string) *VerifyFaceauthVideoRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyFaceauthVideoRequest) SetProductInstanceId(v string) *VerifyFaceauthVideoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyFaceauthVideoRequest) SetAuthImg(v string) *VerifyFaceauthVideoRequest {
	s.AuthImg = &v
	return s
}

func (s *VerifyFaceauthVideoRequest) SetAuthImgType(v string) *VerifyFaceauthVideoRequest {
	s.AuthImgType = &v
	return s
}

func (s *VerifyFaceauthVideoRequest) SetBizId(v string) *VerifyFaceauthVideoRequest {
	s.BizId = &v
	return s
}

func (s *VerifyFaceauthVideoRequest) SetExternParam(v string) *VerifyFaceauthVideoRequest {
	s.ExternParam = &v
	return s
}

func (s *VerifyFaceauthVideoRequest) SetIdentityParam(v string) *VerifyFaceauthVideoRequest {
	s.IdentityParam = &v
	return s
}

func (s *VerifyFaceauthVideoRequest) SetOperationType(v string) *VerifyFaceauthVideoRequest {
	s.OperationType = &v
	return s
}

func (s *VerifyFaceauthVideoRequest) SetRefImg(v string) *VerifyFaceauthVideoRequest {
	s.RefImg = &v
	return s
}

func (s *VerifyFaceauthVideoRequest) SetAuthImgOssObj(v string) *VerifyFaceauthVideoRequest {
	s.AuthImgOssObj = &v
	return s
}

func (s *VerifyFaceauthVideoRequest) SetRefImgOssObj(v string) *VerifyFaceauthVideoRequest {
	s.RefImgOssObj = &v
	return s
}

type VerifyFaceauthVideoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// 产品结果明细，不影响决策
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// 明细返回码对应的文案
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
}

func (s VerifyFaceauthVideoResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyFaceauthVideoResponse) GoString() string {
	return s.String()
}

func (s *VerifyFaceauthVideoResponse) SetReqMsgId(v string) *VerifyFaceauthVideoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyFaceauthVideoResponse) SetResultCode(v string) *VerifyFaceauthVideoResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyFaceauthVideoResponse) SetResultMsg(v string) *VerifyFaceauthVideoResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyFaceauthVideoResponse) SetExternInfo(v string) *VerifyFaceauthVideoResponse {
	s.ExternInfo = &v
	return s
}

func (s *VerifyFaceauthVideoResponse) SetResultCodeSub(v string) *VerifyFaceauthVideoResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *VerifyFaceauthVideoResponse) SetResultMsgSub(v string) *VerifyFaceauthVideoResponse {
	s.ResultMsgSub = &v
	return s
}

type InitFaceauthNfcRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 身份，需要公钥加密
	IdentityParam *string `json:"identity_param,omitempty" xml:"identity_param,omitempty" require:"true"`
	// 客户端采集
	Metainfo *string `json:"metainfo,omitempty" xml:"metainfo,omitempty" require:"true"`
	// 外部参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 操作类型
	OperationType *string `json:"operation_type,omitempty" xml:"operation_type,omitempty"`
}

func (s InitFaceauthNfcRequest) String() string {
	return tea.Prettify(s)
}

func (s InitFaceauthNfcRequest) GoString() string {
	return s.String()
}

func (s *InitFaceauthNfcRequest) SetAuthToken(v string) *InitFaceauthNfcRequest {
	s.AuthToken = &v
	return s
}

func (s *InitFaceauthNfcRequest) SetProductInstanceId(v string) *InitFaceauthNfcRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitFaceauthNfcRequest) SetBizId(v string) *InitFaceauthNfcRequest {
	s.BizId = &v
	return s
}

func (s *InitFaceauthNfcRequest) SetIdentityParam(v string) *InitFaceauthNfcRequest {
	s.IdentityParam = &v
	return s
}

func (s *InitFaceauthNfcRequest) SetMetainfo(v string) *InitFaceauthNfcRequest {
	s.Metainfo = &v
	return s
}

func (s *InitFaceauthNfcRequest) SetExternParam(v string) *InitFaceauthNfcRequest {
	s.ExternParam = &v
	return s
}

func (s *InitFaceauthNfcRequest) SetOperationType(v string) *InitFaceauthNfcRequest {
	s.OperationType = &v
	return s
}

type InitFaceauthNfcResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// z-abcd
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty"`
	// 预留扩展结果
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// 结果码
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// 结果信息
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
}

func (s InitFaceauthNfcResponse) String() string {
	return tea.Prettify(s)
}

func (s InitFaceauthNfcResponse) GoString() string {
	return s.String()
}

func (s *InitFaceauthNfcResponse) SetReqMsgId(v string) *InitFaceauthNfcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitFaceauthNfcResponse) SetResultCode(v string) *InitFaceauthNfcResponse {
	s.ResultCode = &v
	return s
}

func (s *InitFaceauthNfcResponse) SetResultMsg(v string) *InitFaceauthNfcResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitFaceauthNfcResponse) SetZimId(v string) *InitFaceauthNfcResponse {
	s.ZimId = &v
	return s
}

func (s *InitFaceauthNfcResponse) SetExternInfo(v string) *InitFaceauthNfcResponse {
	s.ExternInfo = &v
	return s
}

func (s *InitFaceauthNfcResponse) SetResultCodeSub(v string) *InitFaceauthNfcResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *InitFaceauthNfcResponse) SetResultMsgSub(v string) *InitFaceauthNfcResponse {
	s.ResultMsgSub = &v
	return s
}

type CreateConsoleSceneDomainRequest struct {
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

func (s CreateConsoleSceneDomainRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateConsoleSceneDomainRequest) GoString() string {
	return s.String()
}

func (s *CreateConsoleSceneDomainRequest) SetAuthToken(v string) *CreateConsoleSceneDomainRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateConsoleSceneDomainRequest) SetProductInstanceId(v string) *CreateConsoleSceneDomainRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateConsoleSceneDomainRequest) SetSceneId(v string) *CreateConsoleSceneDomainRequest {
	s.SceneId = &v
	return s
}

func (s *CreateConsoleSceneDomainRequest) SetBizId(v string) *CreateConsoleSceneDomainRequest {
	s.BizId = &v
	return s
}

func (s *CreateConsoleSceneDomainRequest) SetMiniProgramName(v string) *CreateConsoleSceneDomainRequest {
	s.MiniProgramName = &v
	return s
}

func (s *CreateConsoleSceneDomainRequest) SetPlatform(v string) *CreateConsoleSceneDomainRequest {
	s.Platform = &v
	return s
}

func (s *CreateConsoleSceneDomainRequest) SetCheckFileName(v string) *CreateConsoleSceneDomainRequest {
	s.CheckFileName = &v
	return s
}

func (s *CreateConsoleSceneDomainRequest) SetCheckFileBody(v string) *CreateConsoleSceneDomainRequest {
	s.CheckFileBody = &v
	return s
}

type CreateConsoleSceneDomainResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回绑定的域名
	Domain *string `json:"domain,omitempty" xml:"domain,omitempty"`
}

func (s CreateConsoleSceneDomainResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateConsoleSceneDomainResponse) GoString() string {
	return s.String()
}

func (s *CreateConsoleSceneDomainResponse) SetReqMsgId(v string) *CreateConsoleSceneDomainResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateConsoleSceneDomainResponse) SetResultCode(v string) *CreateConsoleSceneDomainResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateConsoleSceneDomainResponse) SetResultMsg(v string) *CreateConsoleSceneDomainResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateConsoleSceneDomainResponse) SetDomain(v string) *CreateConsoleSceneDomainResponse {
	s.Domain = &v
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
				"sdk_version":      tea.String("1.6.2"),
				"_prod_code":       tea.String("ZOLOZFACEVERIFY"),
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
 * Description: 金融云计算能力输出给主站使用
 * Summary: 金融云计算能力输出给主站使用
 */
func (client *Client) ExecFaceauthAlgorithm(request *ExecFaceauthAlgorithmRequest) (_result *ExecFaceauthAlgorithmResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecFaceauthAlgorithmResponse{}
	_body, _err := client.ExecFaceauthAlgorithmEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 金融云计算能力输出给主站使用
 * Summary: 金融云计算能力输出给主站使用
 */
func (client *Client) ExecFaceauthAlgorithmEx(request *ExecFaceauthAlgorithmRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecFaceauthAlgorithmResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecFaceauthAlgorithmResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("faceverifyzoloz.faceauth.algorithm.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
 * Summary: 实人认证初始化
 */
func (client *Client) FaceFaceauthInitialize(request *FaceFaceauthInitializeRequest) (_result *FaceFaceauthInitializeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &FaceFaceauthInitializeResponse{}
	_body, _err := client.FaceFaceauthInitializeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
 * Summary: 实人认证初始化
 */
func (client *Client) FaceFaceauthInitializeEx(request *FaceFaceauthInitializeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *FaceFaceauthInitializeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &FaceFaceauthInitializeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("faceverifyzoloz.faceauth.initialize.face"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
 * Summary: 实人认证查询
 */
func (client *Client) FaceFaceauthQuery(request *FaceFaceauthQueryRequest) (_result *FaceFaceauthQueryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &FaceFaceauthQueryResponse{}
	_body, _err := client.FaceFaceauthQueryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
 * Summary: 实人认证查询
 */
func (client *Client) FaceFaceauthQueryEx(request *FaceFaceauthQueryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *FaceFaceauthQueryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &FaceFaceauthQueryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("faceverifyzoloz.faceauth.query.face"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 人脸纯服务端模式比对
 * Summary: 人脸纯服务端模式比对
 */
func (client *Client) IdentityFaceauthServermode(request *IdentityFaceauthServermodeRequest) (_result *IdentityFaceauthServermodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &IdentityFaceauthServermodeResponse{}
	_body, _err := client.IdentityFaceauthServermodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 人脸纯服务端模式比对
 * Summary: 人脸纯服务端模式比对
 */
func (client *Client) IdentityFaceauthServermodeEx(request *IdentityFaceauthServermodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *IdentityFaceauthServermodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &IdentityFaceauthServermodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("faceverifyzoloz.faceauth.servermode.identity"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 调用“H5实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
 * Summary: H5实人认证初始化
 */
func (client *Client) InitializeFaceauthWeb(request *InitializeFaceauthWebRequest) (_result *InitializeFaceauthWebResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitializeFaceauthWebResponse{}
	_body, _err := client.InitializeFaceauthWebEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 调用“H5实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
 * Summary: H5实人认证初始化
 */
func (client *Client) InitializeFaceauthWebEx(request *InitializeFaceauthWebRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitializeFaceauthWebResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitializeFaceauthWebResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("faceverifyzoloz.faceauth.web.initialize"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: H5实人认证查询
 * Summary: H5实人认证查询
 */
func (client *Client) QueryFaceauthWeb(request *QueryFaceauthWebRequest) (_result *QueryFaceauthWebResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFaceauthWebResponse{}
	_body, _err := client.QueryFaceauthWebEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: H5实人认证查询
 * Summary: H5实人认证查询
 */
func (client *Client) QueryFaceauthWebEx(request *QueryFaceauthWebRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFaceauthWebResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFaceauthWebResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("faceverifyzoloz.faceauth.web.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提供给业务方刷脸认证计量查询接口
 * Summary: 提供给业务方刷脸认证计量查询接口
 */
func (client *Client) QueryFaceauthMetering(request *QueryFaceauthMeteringRequest) (_result *QueryFaceauthMeteringResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFaceauthMeteringResponse{}
	_body, _err := client.QueryFaceauthMeteringEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提供给业务方刷脸认证计量查询接口
 * Summary: 提供给业务方刷脸认证计量查询接口
 */
func (client *Client) QueryFaceauthMeteringEx(request *QueryFaceauthMeteringRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFaceauthMeteringResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFaceauthMeteringResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("faceverifyzoloz.faceauth.metering.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 极简模式初始化接口，返回zimId和协议
 * Summary: 极简模式初始化接口
 */
func (client *Client) InitFaceauthFaceLite(request *InitFaceauthFaceLiteRequest) (_result *InitFaceauthFaceLiteResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitFaceauthFaceLiteResponse{}
	_body, _err := client.InitFaceauthFaceLiteEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 极简模式初始化接口，返回zimId和协议
 * Summary: 极简模式初始化接口
 */
func (client *Client) InitFaceauthFaceLiteEx(request *InitFaceauthFaceLiteRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitFaceauthFaceLiteResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitFaceauthFaceLiteResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("faceverifyzoloz.faceauth.face.lite.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数据查询，排查case
 * Summary: 数据查询，排查case
 */
func (client *Client) QueryFaceauthData(request *QueryFaceauthDataRequest) (_result *QueryFaceauthDataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFaceauthDataResponse{}
	_body, _err := client.QueryFaceauthDataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数据查询，排查case
 * Summary: 数据查询，排查case
 */
func (client *Client) QueryFaceauthDataEx(request *QueryFaceauthDataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFaceauthDataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFaceauthDataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("faceverifyzoloz.faceauth.data.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提供人脸特征提取、人脸区域识别等能力接口
 * Summary: 提供人脸特征提取、人脸区域识别等能力接口
 */
func (client *Client) ExecAuthenticationCustomerFaceability(request *ExecAuthenticationCustomerFaceabilityRequest) (_result *ExecAuthenticationCustomerFaceabilityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecAuthenticationCustomerFaceabilityResponse{}
	_body, _err := client.ExecAuthenticationCustomerFaceabilityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提供人脸特征提取、人脸区域识别等能力接口
 * Summary: 提供人脸特征提取、人脸区域识别等能力接口
 */
func (client *Client) ExecAuthenticationCustomerFaceabilityEx(request *ExecAuthenticationCustomerFaceabilityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecAuthenticationCustomerFaceabilityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAuthenticationCustomerFaceabilityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("faceverifyzoloz.authentication.customer.faceability.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 客户端接口初始化认证
 * Summary: 客户端初始化
 */
func (client *Client) InitFaceauthZim(request *InitFaceauthZimRequest) (_result *InitFaceauthZimResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitFaceauthZimResponse{}
	_body, _err := client.InitFaceauthZimEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 客户端接口初始化认证
 * Summary: 客户端初始化
 */
func (client *Client) InitFaceauthZimEx(request *InitFaceauthZimRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitFaceauthZimResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitFaceauthZimResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("faceverifyzoloz.faceauth.zim.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提供客户端活体检测与人脸比对服务
 * Summary: 客户端人脸验证
 */
func (client *Client) VerifyFaceauthZim(request *VerifyFaceauthZimRequest) (_result *VerifyFaceauthZimResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyFaceauthZimResponse{}
	_body, _err := client.VerifyFaceauthZimEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提供客户端活体检测与人脸比对服务
 * Summary: 客户端人脸验证
 */
func (client *Client) VerifyFaceauthZimEx(request *VerifyFaceauthZimRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyFaceauthZimResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyFaceauthZimResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("faceverifyzoloz.faceauth.zim.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: OCR识别接口，开放给阿里云场景
 * Summary: OCR识别接口
 */
func (client *Client) RecognizeFaceauthOcr(request *RecognizeFaceauthOcrRequest) (_result *RecognizeFaceauthOcrResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RecognizeFaceauthOcrResponse{}
	_body, _err := client.RecognizeFaceauthOcrEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: OCR识别接口，开放给阿里云场景
 * Summary: OCR识别接口
 */
func (client *Client) RecognizeFaceauthOcrEx(request *RecognizeFaceauthOcrRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RecognizeFaceauthOcrResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RecognizeFaceauthOcrResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("faceverifyzoloz.faceauth.ocr.recognize"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: Web实人认证初始化
 * Summary: Web实人认证初始化
 */
func (client *Client) InitFaceauthWebsdk(request *InitFaceauthWebsdkRequest) (_result *InitFaceauthWebsdkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitFaceauthWebsdkResponse{}
	_body, _err := client.InitFaceauthWebsdkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: Web实人认证初始化
 * Summary: Web实人认证初始化
 */
func (client *Client) InitFaceauthWebsdkEx(request *InitFaceauthWebsdkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitFaceauthWebsdkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitFaceauthWebsdkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("faceverifyzoloz.faceauth.websdk.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: Web实人认证查询
 * Summary: Web实人认证查询
 */
func (client *Client) QueryFaceauthWebsdk(request *QueryFaceauthWebsdkRequest) (_result *QueryFaceauthWebsdkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFaceauthWebsdkResponse{}
	_body, _err := client.QueryFaceauthWebsdkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: Web实人认证查询
 * Summary: Web实人认证查询
 */
func (client *Client) QueryFaceauthWebsdkEx(request *QueryFaceauthWebsdkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFaceauthWebsdkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFaceauthWebsdkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("faceverifyzoloz.faceauth.websdk.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: zoloz提供具备权限控制的人脸图片获取接口，提供于支付宝会员等上游，控制数据风险
 * Summary: 获取认证资料
 */
func (client *Client) QueryFaceauthFile(request *QueryFaceauthFileRequest) (_result *QueryFaceauthFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFaceauthFileResponse{}
	_body, _err := client.QueryFaceauthFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: zoloz提供具备权限控制的人脸图片获取接口，提供于支付宝会员等上游，控制数据风险
 * Summary: 获取认证资料
 */
func (client *Client) QueryFaceauthFileEx(request *QueryFaceauthFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFaceauthFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFaceauthFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("faceverifyzoloz.faceauth.file.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 人脸双因子认证服务端初始化
 * Summary: 人脸双因子认证服务端初始化
 */
func (client *Client) InitFaceauthFaceplus(request *InitFaceauthFaceplusRequest) (_result *InitFaceauthFaceplusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitFaceauthFaceplusResponse{}
	_body, _err := client.InitFaceauthFaceplusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 人脸双因子认证服务端初始化
 * Summary: 人脸双因子认证服务端初始化
 */
func (client *Client) InitFaceauthFaceplusEx(request *InitFaceauthFaceplusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitFaceauthFaceplusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitFaceauthFaceplusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("faceverifyzoloz.faceauth.faceplus.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 人脸双因子认证服务端查询
 * Summary: 人脸双因子认证服务端查询
 */
func (client *Client) QueryFaceauthFaceplus(request *QueryFaceauthFaceplusRequest) (_result *QueryFaceauthFaceplusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFaceauthFaceplusResponse{}
	_body, _err := client.QueryFaceauthFaceplusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 人脸双因子认证服务端查询
 * Summary: 人脸双因子认证服务端查询
 */
func (client *Client) QueryFaceauthFaceplusEx(request *QueryFaceauthFaceplusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFaceauthFaceplusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFaceauthFaceplusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("faceverifyzoloz.faceauth.faceplus.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 意愿核身认证服务端初始化
 * Summary: 意愿核身认证服务端初始化
 */
func (client *Client) InitFaceauthFaceWish(request *InitFaceauthFaceWishRequest) (_result *InitFaceauthFaceWishResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitFaceauthFaceWishResponse{}
	_body, _err := client.InitFaceauthFaceWishEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 意愿核身认证服务端初始化
 * Summary: 意愿核身认证服务端初始化
 */
func (client *Client) InitFaceauthFaceWishEx(request *InitFaceauthFaceWishRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitFaceauthFaceWishResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitFaceauthFaceWishResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("faceverifyzoloz.faceauth.face.wish.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 人脸视频认证
 * Summary: 人脸视频认证
 */
func (client *Client) VerifyFaceauthVideo(request *VerifyFaceauthVideoRequest) (_result *VerifyFaceauthVideoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyFaceauthVideoResponse{}
	_body, _err := client.VerifyFaceauthVideoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 人脸视频认证
 * Summary: 人脸视频认证
 */
func (client *Client) VerifyFaceauthVideoEx(request *VerifyFaceauthVideoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyFaceauthVideoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyFaceauthVideoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("faceverifyzoloz.faceauth.video.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 实证NFC服务端初始化
 * Summary: 实证NFC服务端初始化
 */
func (client *Client) InitFaceauthNfc(request *InitFaceauthNfcRequest) (_result *InitFaceauthNfcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitFaceauthNfcResponse{}
	_body, _err := client.InitFaceauthNfcEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 实证NFC服务端初始化
 * Summary: 实证NFC服务端初始化
 */
func (client *Client) InitFaceauthNfcEx(request *InitFaceauthNfcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitFaceauthNfcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitFaceauthNfcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("faceverifyzoloz.faceauth.nfc.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) CreateConsoleSceneDomain(request *CreateConsoleSceneDomainRequest) (_result *CreateConsoleSceneDomainResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateConsoleSceneDomainResponse{}
	_body, _err := client.CreateConsoleSceneDomainEx(request, headers, runtime)
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
func (client *Client) CreateConsoleSceneDomainEx(request *CreateConsoleSceneDomainRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateConsoleSceneDomainResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateConsoleSceneDomainResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("faceverifyzoloz.console.scene.domain.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
