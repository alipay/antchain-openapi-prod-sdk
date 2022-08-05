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

// AssetUri中多组资源信息
type ResourceBundle struct {
	// 可公开访问的资源地址
	Uri *string `json:"uri,omitempty" xml:"uri,omitempty" require:"true" minLength:"1"`
	// 上传资源时指定的资源类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true" minLength:"1"`
	// 资源描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
}

func (s ResourceBundle) String() string {
	return tea.Prettify(s)
}

func (s ResourceBundle) GoString() string {
	return s.String()
}

func (s *ResourceBundle) SetUri(v string) *ResourceBundle {
	s.Uri = &v
	return s
}

func (s *ResourceBundle) SetType(v string) *ResourceBundle {
	s.Type = &v
	return s
}

func (s *ResourceBundle) SetDescription(v string) *ResourceBundle {
	s.Description = &v
	return s
}

// 发送交易时的账户信息，托管(推荐)和非托管(本地)必选其中一种
type AccountInfo struct {
	// 托管账户的账户名称，也是链上账户名称，交易发起方账户
	Account *string `json:"account,omitempty" xml:"account,omitempty"`
	// 托管账户对应的秘钥ID
	KmsId *string `json:"kms_id,omitempty" xml:"kms_id,omitempty"`
	// 托管账户对应的租户ID，默认为空，如有使用其他租户的托管账户时需指定
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 非托管模式下必须输入，客户端构建交易出的信息，base64编码
	SignData *string `json:"sign_data,omitempty" xml:"sign_data,omitempty"`
}

func (s AccountInfo) String() string {
	return tea.Prettify(s)
}

func (s AccountInfo) GoString() string {
	return s.String()
}

func (s *AccountInfo) SetAccount(v string) *AccountInfo {
	s.Account = &v
	return s
}

func (s *AccountInfo) SetKmsId(v string) *AccountInfo {
	s.KmsId = &v
	return s
}

func (s *AccountInfo) SetTenantId(v string) *AccountInfo {
	s.TenantId = &v
	return s
}

func (s *AccountInfo) SetSignData(v string) *AccountInfo {
	s.SignData = &v
	return s
}

// 查询所有数字权证项目接口结构体
type DigitalProjectList struct {
	// 项目id
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 项目名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 项目描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 项目状态
	ProjectStatus *string `json:"project_status,omitempty" xml:"project_status,omitempty" require:"true"`
	// 创建时间
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty" require:"true"`
	// 合约symbol
	Symbol *string `json:"symbol,omitempty" xml:"symbol,omitempty" require:"true"`
	// 发行数量
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
}

func (s DigitalProjectList) String() string {
	return tea.Prettify(s)
}

func (s DigitalProjectList) GoString() string {
	return s.String()
}

func (s *DigitalProjectList) SetProjectId(v string) *DigitalProjectList {
	s.ProjectId = &v
	return s
}

func (s *DigitalProjectList) SetName(v string) *DigitalProjectList {
	s.Name = &v
	return s
}

func (s *DigitalProjectList) SetDescription(v string) *DigitalProjectList {
	s.Description = &v
	return s
}

func (s *DigitalProjectList) SetProjectStatus(v string) *DigitalProjectList {
	s.ProjectStatus = &v
	return s
}

func (s *DigitalProjectList) SetCreateTime(v string) *DigitalProjectList {
	s.CreateTime = &v
	return s
}

func (s *DigitalProjectList) SetSymbol(v string) *DigitalProjectList {
	s.Symbol = &v
	return s
}

func (s *DigitalProjectList) SetAmount(v int64) *DigitalProjectList {
	s.Amount = &v
	return s
}

// 数字权证项目信息类
type DigitalProject struct {
	// 数字权证项目id
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 模版类型
	BizType *int64 `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 数字权证项目名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 合约symbol
	Symbol *string `json:"symbol,omitempty" xml:"symbol,omitempty" require:"true"`
	// 数字权证项目描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 项目状态：
	// deploy：已部署(可更新)
	// issue：已发布(不可更新)
	ProjectStatus *string `json:"project_status,omitempty" xml:"project_status,omitempty" require:"true"`
	// 项目发行权证的总数
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
	// 权证的uri信息（共享tokenuri模式有该字段）
	AssetUri *string `json:"asset_uri,omitempty" xml:"asset_uri,omitempty"`
	// 项目发行后权证数量是否可增发
	//
	LimitedAmount *bool `json:"limited_amount,omitempty" xml:"limited_amount,omitempty" require:"true"`
	// 项目权证是否可核销
	WriteOffable *bool `json:"write_offable,omitempty" xml:"write_offable,omitempty" require:"true"`
	// 项目权证是否可销毁
	Burnable *bool `json:"burnable,omitempty" xml:"burnable,omitempty" require:"true"`
	// 项目管理员账户地址
	OwnerAccount *string `json:"owner_account,omitempty" xml:"owner_account,omitempty" require:"true"`
	// 项目核销员账户地址列表
	IssuerList []*string `json:"issuer_list,omitempty" xml:"issuer_list,omitempty" type:"Repeated"`
	// 项目核销员账户地址列表
	WriteoffList []*string `json:"writeoff_list,omitempty" xml:"writeoff_list,omitempty" type:"Repeated"`
	// 合约创建时间
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty" require:"true"`
}

func (s DigitalProject) String() string {
	return tea.Prettify(s)
}

func (s DigitalProject) GoString() string {
	return s.String()
}

func (s *DigitalProject) SetProjectId(v string) *DigitalProject {
	s.ProjectId = &v
	return s
}

func (s *DigitalProject) SetBizType(v int64) *DigitalProject {
	s.BizType = &v
	return s
}

func (s *DigitalProject) SetName(v string) *DigitalProject {
	s.Name = &v
	return s
}

func (s *DigitalProject) SetSymbol(v string) *DigitalProject {
	s.Symbol = &v
	return s
}

func (s *DigitalProject) SetDescription(v string) *DigitalProject {
	s.Description = &v
	return s
}

func (s *DigitalProject) SetProjectStatus(v string) *DigitalProject {
	s.ProjectStatus = &v
	return s
}

func (s *DigitalProject) SetAmount(v int64) *DigitalProject {
	s.Amount = &v
	return s
}

func (s *DigitalProject) SetAssetUri(v string) *DigitalProject {
	s.AssetUri = &v
	return s
}

func (s *DigitalProject) SetLimitedAmount(v bool) *DigitalProject {
	s.LimitedAmount = &v
	return s
}

func (s *DigitalProject) SetWriteOffable(v bool) *DigitalProject {
	s.WriteOffable = &v
	return s
}

func (s *DigitalProject) SetBurnable(v bool) *DigitalProject {
	s.Burnable = &v
	return s
}

func (s *DigitalProject) SetOwnerAccount(v string) *DigitalProject {
	s.OwnerAccount = &v
	return s
}

func (s *DigitalProject) SetIssuerList(v []*string) *DigitalProject {
	s.IssuerList = v
	return s
}

func (s *DigitalProject) SetWriteoffList(v []*string) *DigitalProject {
	s.WriteoffList = v
	return s
}

func (s *DigitalProject) SetCreateTime(v int64) *DigitalProject {
	s.CreateTime = &v
	return s
}

// AssetUri定义
type AssetUriDefinition struct {
	// 数字权证名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 数字权证描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 该权证的图片地址
	Image *string `json:"image,omitempty" xml:"image,omitempty" require:"true" minLength:"1"`
	// 资产指向外部的链接
	ExternalUrl *string `json:"external_url,omitempty" xml:"external_url,omitempty"`
	// 背景颜色, 16进制6位Hex
	BackgroundColor *string `json:"background_color,omitempty" xml:"background_color,omitempty"`
	// 动态资源地址，可指向音视频资源，需先上传
	AnimationUrl *string `json:"animation_url,omitempty" xml:"animation_url,omitempty"`
	// 资源集合，可定义多个组合资源，适合有多资源文件的资产
	ResourceBundle []*ResourceBundle `json:"resource_bundle,omitempty" xml:"resource_bundle,omitempty" type:"Repeated"`
	// 自定义的资产属性数组，数组元素需为json格式
	Attributes []*string `json:"attributes,omitempty" xml:"attributes,omitempty" type:"Repeated"`
}

func (s AssetUriDefinition) String() string {
	return tea.Prettify(s)
}

func (s AssetUriDefinition) GoString() string {
	return s.String()
}

func (s *AssetUriDefinition) SetName(v string) *AssetUriDefinition {
	s.Name = &v
	return s
}

func (s *AssetUriDefinition) SetDescription(v string) *AssetUriDefinition {
	s.Description = &v
	return s
}

func (s *AssetUriDefinition) SetImage(v string) *AssetUriDefinition {
	s.Image = &v
	return s
}

func (s *AssetUriDefinition) SetExternalUrl(v string) *AssetUriDefinition {
	s.ExternalUrl = &v
	return s
}

func (s *AssetUriDefinition) SetBackgroundColor(v string) *AssetUriDefinition {
	s.BackgroundColor = &v
	return s
}

func (s *AssetUriDefinition) SetAnimationUrl(v string) *AssetUriDefinition {
	s.AnimationUrl = &v
	return s
}

func (s *AssetUriDefinition) SetResourceBundle(v []*ResourceBundle) *AssetUriDefinition {
	s.ResourceBundle = v
	return s
}

func (s *AssetUriDefinition) SetAttributes(v []*string) *AssetUriDefinition {
	s.Attributes = v
	return s
}

type CheckAccountRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true" minLength:"1"`
	// 账户名称
	Account *string `json:"account,omitempty" xml:"account,omitempty" require:"true" minLength:"1"`
}

func (s CheckAccountRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckAccountRequest) GoString() string {
	return s.String()
}

func (s *CheckAccountRequest) SetAuthToken(v string) *CheckAccountRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckAccountRequest) SetProductInstanceId(v string) *CheckAccountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckAccountRequest) SetBizid(v string) *CheckAccountRequest {
	s.Bizid = &v
	return s
}

func (s *CheckAccountRequest) SetAccount(v string) *CheckAccountRequest {
	s.Account = &v
	return s
}

type CheckAccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 账户存在且状态正常
	Status *bool `json:"status,omitempty" xml:"status,omitempty"`
}

func (s CheckAccountResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckAccountResponse) GoString() string {
	return s.String()
}

func (s *CheckAccountResponse) SetReqMsgId(v string) *CheckAccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckAccountResponse) SetResultCode(v string) *CheckAccountResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckAccountResponse) SetResultMsg(v string) *CheckAccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckAccountResponse) SetStatus(v bool) *CheckAccountResponse {
	s.Status = &v
	return s
}

type CreateAccountKmsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链id
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true" minLength:"1"`
	// 链账户名称，支持长度100以内的，大小写字母、数字、下划线、横线、@、点
	Account *string `json:"account,omitempty" xml:"account,omitempty" require:"true" minLength:"1"`
	// 托管账户所在的租户，默认为调用者的租户
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s CreateAccountKmsRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAccountKmsRequest) GoString() string {
	return s.String()
}

func (s *CreateAccountKmsRequest) SetAuthToken(v string) *CreateAccountKmsRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAccountKmsRequest) SetProductInstanceId(v string) *CreateAccountKmsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAccountKmsRequest) SetBizid(v string) *CreateAccountKmsRequest {
	s.Bizid = &v
	return s
}

func (s *CreateAccountKmsRequest) SetAccount(v string) *CreateAccountKmsRequest {
	s.Account = &v
	return s
}

func (s *CreateAccountKmsRequest) SetTenantId(v string) *CreateAccountKmsRequest {
	s.TenantId = &v
	return s
}

type CreateAccountKmsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 账户公钥
	PubKey *string `json:"pub_key,omitempty" xml:"pub_key,omitempty"`
	// 托管秘钥ID
	MyKmsId *string `json:"my_kms_id,omitempty" xml:"my_kms_id,omitempty"`
}

func (s CreateAccountKmsResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAccountKmsResponse) GoString() string {
	return s.String()
}

func (s *CreateAccountKmsResponse) SetReqMsgId(v string) *CreateAccountKmsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAccountKmsResponse) SetResultCode(v string) *CreateAccountKmsResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAccountKmsResponse) SetResultMsg(v string) *CreateAccountKmsResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAccountKmsResponse) SetPubKey(v string) *CreateAccountKmsResponse {
	s.PubKey = &v
	return s
}

func (s *CreateAccountKmsResponse) SetMyKmsId(v string) *CreateAccountKmsResponse {
	s.MyKmsId = &v
	return s
}

type CreateResourcePolicyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true" minLength:"1"`
	// 上传文件名，实际服务端文件名称会使用随机字符串，这里需上传指定后缀的文件
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true" minLength:"1"`
}

func (s CreateResourcePolicyRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateResourcePolicyRequest) GoString() string {
	return s.String()
}

func (s *CreateResourcePolicyRequest) SetAuthToken(v string) *CreateResourcePolicyRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateResourcePolicyRequest) SetProductInstanceId(v string) *CreateResourcePolicyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateResourcePolicyRequest) SetBizid(v string) *CreateResourcePolicyRequest {
	s.Bizid = &v
	return s
}

func (s *CreateResourcePolicyRequest) SetFileName(v string) *CreateResourcePolicyRequest {
	s.FileName = &v
	return s
}

type CreateResourcePolicyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 最终上传至服务端的实际文件名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 用户请求的AccessKey ID
	Accessid *string `json:"accessid,omitempty" xml:"accessid,omitempty"`
	// 用户发送上传请求的域名。
	Host *string `json:"host,omitempty" xml:"host,omitempty"`
	// 用户表单上传的策略（Policy），Policy为经过Ba...
	Policy *string `json:"policy,omitempty" xml:"policy,omitempty"`
	// 对Policy签名后的字符串
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty"`
	// 由服务器端指定的Policy过期时间，格式为Unix时间戳
	Expire *string `json:"expire,omitempty" xml:"expire,omitempty"`
	// 文件类型
	MimeType *string `json:"mime_type,omitempty" xml:"mime_type,omitempty"`
	//
	// 限制上传的文件名称
	Dir *string `json:"dir,omitempty" xml:"dir,omitempty"`
}

func (s CreateResourcePolicyResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateResourcePolicyResponse) GoString() string {
	return s.String()
}

func (s *CreateResourcePolicyResponse) SetReqMsgId(v string) *CreateResourcePolicyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateResourcePolicyResponse) SetResultCode(v string) *CreateResourcePolicyResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateResourcePolicyResponse) SetResultMsg(v string) *CreateResourcePolicyResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateResourcePolicyResponse) SetName(v string) *CreateResourcePolicyResponse {
	s.Name = &v
	return s
}

func (s *CreateResourcePolicyResponse) SetAccessid(v string) *CreateResourcePolicyResponse {
	s.Accessid = &v
	return s
}

func (s *CreateResourcePolicyResponse) SetHost(v string) *CreateResourcePolicyResponse {
	s.Host = &v
	return s
}

func (s *CreateResourcePolicyResponse) SetPolicy(v string) *CreateResourcePolicyResponse {
	s.Policy = &v
	return s
}

func (s *CreateResourcePolicyResponse) SetSignature(v string) *CreateResourcePolicyResponse {
	s.Signature = &v
	return s
}

func (s *CreateResourcePolicyResponse) SetExpire(v string) *CreateResourcePolicyResponse {
	s.Expire = &v
	return s
}

func (s *CreateResourcePolicyResponse) SetMimeType(v string) *CreateResourcePolicyResponse {
	s.MimeType = &v
	return s
}

func (s *CreateResourcePolicyResponse) SetDir(v string) *CreateResourcePolicyResponse {
	s.Dir = &v
	return s
}

type CheckResourceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true" minLength:"1"`
	// 创建资源上传规则url时生成的服务端文件名称
	RealName *string `json:"real_name,omitempty" xml:"real_name,omitempty" require:"true" minLength:"1"`
}

func (s CheckResourceRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckResourceRequest) GoString() string {
	return s.String()
}

func (s *CheckResourceRequest) SetAuthToken(v string) *CheckResourceRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckResourceRequest) SetProductInstanceId(v string) *CheckResourceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckResourceRequest) SetBizid(v string) *CheckResourceRequest {
	s.Bizid = &v
	return s
}

func (s *CheckResourceRequest) SetRealName(v string) *CheckResourceRequest {
	s.RealName = &v
	return s
}

type CheckResourceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 可公开访问的资源地址。为空则表示暂时无法访问
	AccessUrl *string `json:"access_url,omitempty" xml:"access_url,omitempty"`
	// upload：文件已上传
	// check：内容检测中
	// invalid：图片不可访问
	// pass：可公开访问
	// publish：已绑定至某个项目
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s CheckResourceResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckResourceResponse) GoString() string {
	return s.String()
}

func (s *CheckResourceResponse) SetReqMsgId(v string) *CheckResourceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckResourceResponse) SetResultCode(v string) *CheckResourceResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckResourceResponse) SetResultMsg(v string) *CheckResourceResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckResourceResponse) SetAccessUrl(v string) *CheckResourceResponse {
	s.AccessUrl = &v
	return s
}

func (s *CheckResourceResponse) SetStatus(v string) *CheckResourceResponse {
	s.Status = &v
	return s
}

type CreateAsseturiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true" minLength:"1"`
	// 数字权证asset uri定义
	AssetUriDefinition *AssetUriDefinition `json:"asset_uri_definition,omitempty" xml:"asset_uri_definition,omitempty" require:"true"`
}

func (s CreateAsseturiRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAsseturiRequest) GoString() string {
	return s.String()
}

func (s *CreateAsseturiRequest) SetAuthToken(v string) *CreateAsseturiRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAsseturiRequest) SetProductInstanceId(v string) *CreateAsseturiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAsseturiRequest) SetBizid(v string) *CreateAsseturiRequest {
	s.Bizid = &v
	return s
}

func (s *CreateAsseturiRequest) SetAssetUriDefinition(v *AssetUriDefinition) *CreateAsseturiRequest {
	s.AssetUriDefinition = v
	return s
}

type CreateAsseturiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 可公开访问的asseturi地址。
	AccessUri *string `json:"access_uri,omitempty" xml:"access_uri,omitempty"`
	// assetUri文件内容
	JsonInfo *string `json:"json_info,omitempty" xml:"json_info,omitempty"`
}

func (s CreateAsseturiResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAsseturiResponse) GoString() string {
	return s.String()
}

func (s *CreateAsseturiResponse) SetReqMsgId(v string) *CreateAsseturiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAsseturiResponse) SetResultCode(v string) *CreateAsseturiResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAsseturiResponse) SetResultMsg(v string) *CreateAsseturiResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAsseturiResponse) SetAccessUri(v string) *CreateAsseturiResponse {
	s.AccessUri = &v
	return s
}

func (s *CreateAsseturiResponse) SetJsonInfo(v string) *CreateAsseturiResponse {
	s.JsonInfo = &v
	return s
}

type QueryProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 数字权证项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
}

func (s QueryProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryProjectRequest) GoString() string {
	return s.String()
}

func (s *QueryProjectRequest) SetAuthToken(v string) *QueryProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryProjectRequest) SetProductInstanceId(v string) *QueryProjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryProjectRequest) SetBizid(v string) *QueryProjectRequest {
	s.Bizid = &v
	return s
}

func (s *QueryProjectRequest) SetProjectId(v string) *QueryProjectRequest {
	s.ProjectId = &v
	return s
}

type QueryProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询单一数字权证项目返回信息
	Result *DigitalProject `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryProjectResponse) GoString() string {
	return s.String()
}

func (s *QueryProjectResponse) SetReqMsgId(v string) *QueryProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryProjectResponse) SetResultCode(v string) *QueryProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryProjectResponse) SetResultMsg(v string) *QueryProjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryProjectResponse) SetResult(v *DigitalProject) *QueryProjectResponse {
	s.Result = v
	return s
}

type CreateProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 项目名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"100" minLength:"1"`
	// 数字合约symbol
	Symbol *string `json:"symbol,omitempty" xml:"symbol,omitempty" require:"true"`
	// 数字权证项目描述信息
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 模版类型
	BizType *int64 `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 项目发行权证数量上限
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty" require:"true" minimum:"1"`
	// 数字权证链接，共享时必须传入
	AssetUri *string `json:"asset_uri,omitempty" xml:"asset_uri,omitempty"`
	// 是否可增发
	LimitedAmount *bool `json:"limited_amount,omitempty" xml:"limited_amount,omitempty" require:"true"`
	// 是否可核销
	WriteOffable *bool `json:"write_offable,omitempty" xml:"write_offable,omitempty" require:"true"`
	// 是否可销毁
	Burnable *bool `json:"burnable,omitempty" xml:"burnable,omitempty" require:"true"`
	// 项目管理者，必须是链上已存在的账户，只有管理者可以修改项目信息
	OwnerAccount *string `json:"owner_account,omitempty" xml:"owner_account,omitempty" require:"true"`
	// 发行者列表，必须是链上已经存在的账户，只有发行者具备权证发行权限。
	IssuerList []*string `json:"issuer_list,omitempty" xml:"issuer_list,omitempty" require:"true" type:"Repeated"`
	// 核销者列表，必须是链上已经存在的账户，只有核销者才可以核销权证
	WriteoffList []*string `json:"writeoff_list,omitempty" xml:"writeoff_list,omitempty" type:"Repeated"`
}

func (s CreateProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateProjectRequest) GoString() string {
	return s.String()
}

func (s *CreateProjectRequest) SetAuthToken(v string) *CreateProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateProjectRequest) SetProductInstanceId(v string) *CreateProjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateProjectRequest) SetBizid(v string) *CreateProjectRequest {
	s.Bizid = &v
	return s
}

func (s *CreateProjectRequest) SetName(v string) *CreateProjectRequest {
	s.Name = &v
	return s
}

func (s *CreateProjectRequest) SetSymbol(v string) *CreateProjectRequest {
	s.Symbol = &v
	return s
}

func (s *CreateProjectRequest) SetDescription(v string) *CreateProjectRequest {
	s.Description = &v
	return s
}

func (s *CreateProjectRequest) SetBizType(v int64) *CreateProjectRequest {
	s.BizType = &v
	return s
}

func (s *CreateProjectRequest) SetAmount(v int64) *CreateProjectRequest {
	s.Amount = &v
	return s
}

func (s *CreateProjectRequest) SetAssetUri(v string) *CreateProjectRequest {
	s.AssetUri = &v
	return s
}

func (s *CreateProjectRequest) SetLimitedAmount(v bool) *CreateProjectRequest {
	s.LimitedAmount = &v
	return s
}

func (s *CreateProjectRequest) SetWriteOffable(v bool) *CreateProjectRequest {
	s.WriteOffable = &v
	return s
}

func (s *CreateProjectRequest) SetBurnable(v bool) *CreateProjectRequest {
	s.Burnable = &v
	return s
}

func (s *CreateProjectRequest) SetOwnerAccount(v string) *CreateProjectRequest {
	s.OwnerAccount = &v
	return s
}

func (s *CreateProjectRequest) SetIssuerList(v []*string) *CreateProjectRequest {
	s.IssuerList = v
	return s
}

func (s *CreateProjectRequest) SetWriteoffList(v []*string) *CreateProjectRequest {
	s.WriteoffList = v
	return s
}

type CreateProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 项目id
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty"`
	// 部署该项目到区块链的hash值
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
}

func (s CreateProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateProjectResponse) GoString() string {
	return s.String()
}

func (s *CreateProjectResponse) SetReqMsgId(v string) *CreateProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateProjectResponse) SetResultCode(v string) *CreateProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateProjectResponse) SetResultMsg(v string) *CreateProjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateProjectResponse) SetProjectId(v string) *CreateProjectResponse {
	s.ProjectId = &v
	return s
}

func (s *CreateProjectResponse) SetHash(v string) *CreateProjectResponse {
	s.Hash = &v
	return s
}

type UpdateProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 数字权证项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 项目发行权证的总数上限。如果设置为可增发，则可以使用增发接口提高总数量上限
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty" minimum:"1"`
	// 项目发行后权证数量是否可增发。
	// true:可增发
	// false:不可增发
	LimitedAmount *bool `json:"limited_amount,omitempty" xml:"limited_amount,omitempty"`
	// 项目权证是否可核销。false:不可核销；true:可核销
	WriteOffable *bool `json:"write_offable,omitempty" xml:"write_offable,omitempty"`
	// 项目权证是否可销毁。false:不可销毁；true:可销毁
	Burnable *bool `json:"burnable,omitempty" xml:"burnable,omitempty"`
	// 托管账户信息(推荐)，托管和非拖管必选一种
	AccountInfo *AccountInfo `json:"account_info,omitempty" xml:"account_info,omitempty" require:"true"`
}

func (s UpdateProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateProjectRequest) GoString() string {
	return s.String()
}

func (s *UpdateProjectRequest) SetAuthToken(v string) *UpdateProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateProjectRequest) SetProductInstanceId(v string) *UpdateProjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateProjectRequest) SetBizid(v string) *UpdateProjectRequest {
	s.Bizid = &v
	return s
}

func (s *UpdateProjectRequest) SetProjectId(v string) *UpdateProjectRequest {
	s.ProjectId = &v
	return s
}

func (s *UpdateProjectRequest) SetAmount(v int64) *UpdateProjectRequest {
	s.Amount = &v
	return s
}

func (s *UpdateProjectRequest) SetLimitedAmount(v bool) *UpdateProjectRequest {
	s.LimitedAmount = &v
	return s
}

func (s *UpdateProjectRequest) SetWriteOffable(v bool) *UpdateProjectRequest {
	s.WriteOffable = &v
	return s
}

func (s *UpdateProjectRequest) SetBurnable(v bool) *UpdateProjectRequest {
	s.Burnable = &v
	return s
}

func (s *UpdateProjectRequest) SetAccountInfo(v *AccountInfo) *UpdateProjectRequest {
	s.AccountInfo = v
	return s
}

type UpdateProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否更新成功
	Result *bool `json:"result,omitempty" xml:"result,omitempty"`
}

func (s UpdateProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateProjectResponse) GoString() string {
	return s.String()
}

func (s *UpdateProjectResponse) SetReqMsgId(v string) *UpdateProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateProjectResponse) SetResultCode(v string) *UpdateProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateProjectResponse) SetResultMsg(v string) *UpdateProjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateProjectResponse) SetResult(v bool) *UpdateProjectResponse {
	s.Result = &v
	return s
}

type ExecContractIssueRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 数字权证项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 业务方请求唯一标识，用于异步查询交易情况
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// 权证ID，线下生成，保证唯一
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 数字权证标准URI协议文件，权证信息
	AssetUri *string `json:"asset_uri,omitempty" xml:"asset_uri,omitempty" require:"true"`
	// 权证发行的目标账户
	ToAccout *string `json:"to_accout,omitempty" xml:"to_accout,omitempty" require:"true"`
	// 托管账户信息(推荐)，托管和非拖管必选一种
	AccountInfo *AccountInfo `json:"account_info,omitempty" xml:"account_info,omitempty" require:"true"`
}

func (s ExecContractIssueRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecContractIssueRequest) GoString() string {
	return s.String()
}

func (s *ExecContractIssueRequest) SetAuthToken(v string) *ExecContractIssueRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecContractIssueRequest) SetProductInstanceId(v string) *ExecContractIssueRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecContractIssueRequest) SetBizid(v string) *ExecContractIssueRequest {
	s.Bizid = &v
	return s
}

func (s *ExecContractIssueRequest) SetProjectId(v string) *ExecContractIssueRequest {
	s.ProjectId = &v
	return s
}

func (s *ExecContractIssueRequest) SetTraceId(v string) *ExecContractIssueRequest {
	s.TraceId = &v
	return s
}

func (s *ExecContractIssueRequest) SetAssetId(v string) *ExecContractIssueRequest {
	s.AssetId = &v
	return s
}

func (s *ExecContractIssueRequest) SetAssetUri(v string) *ExecContractIssueRequest {
	s.AssetUri = &v
	return s
}

func (s *ExecContractIssueRequest) SetToAccout(v string) *ExecContractIssueRequest {
	s.ToAccout = &v
	return s
}

func (s *ExecContractIssueRequest) SetAccountInfo(v *AccountInfo) *ExecContractIssueRequest {
	s.AccountInfo = v
	return s
}

type ExecContractIssueResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 客户端传入的请求唯一标识
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// 交易hash，可通过hash查询上链结果
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
}

func (s ExecContractIssueResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecContractIssueResponse) GoString() string {
	return s.String()
}

func (s *ExecContractIssueResponse) SetReqMsgId(v string) *ExecContractIssueResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecContractIssueResponse) SetResultCode(v string) *ExecContractIssueResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecContractIssueResponse) SetResultMsg(v string) *ExecContractIssueResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecContractIssueResponse) SetTraceId(v string) *ExecContractIssueResponse {
	s.TraceId = &v
	return s
}

func (s *ExecContractIssueResponse) SetHash(v string) *ExecContractIssueResponse {
	s.Hash = &v
	return s
}

type ListProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链id
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
}

func (s ListProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s ListProjectRequest) GoString() string {
	return s.String()
}

func (s *ListProjectRequest) SetAuthToken(v string) *ListProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *ListProjectRequest) SetProductInstanceId(v string) *ListProjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListProjectRequest) SetBizid(v string) *ListProjectRequest {
	s.Bizid = &v
	return s
}

type ListProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 项目ID列表
	IdList []*string `json:"id_list,omitempty" xml:"id_list,omitempty" type:"Repeated"`
	// 链上项目总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s ListProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s ListProjectResponse) GoString() string {
	return s.String()
}

func (s *ListProjectResponse) SetReqMsgId(v string) *ListProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListProjectResponse) SetResultCode(v string) *ListProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *ListProjectResponse) SetResultMsg(v string) *ListProjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListProjectResponse) SetIdList(v []*string) *ListProjectResponse {
	s.IdList = v
	return s
}

func (s *ListProjectResponse) SetTotal(v int64) *ListProjectResponse {
	s.Total = &v
	return s
}

type QueryContractTransactionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链id
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 业务方请求唯一标识，用于异步查询交易情况。
	// trace_id 和hash至少选择一种，都输入时，使用trace_id查询
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// 租户id，默认为空
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 查询的交易hash
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
}

func (s QueryContractTransactionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryContractTransactionRequest) GoString() string {
	return s.String()
}

func (s *QueryContractTransactionRequest) SetAuthToken(v string) *QueryContractTransactionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryContractTransactionRequest) SetProductInstanceId(v string) *QueryContractTransactionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryContractTransactionRequest) SetBizid(v string) *QueryContractTransactionRequest {
	s.Bizid = &v
	return s
}

func (s *QueryContractTransactionRequest) SetTraceId(v string) *QueryContractTransactionRequest {
	s.TraceId = &v
	return s
}

func (s *QueryContractTransactionRequest) SetTenantId(v string) *QueryContractTransactionRequest {
	s.TenantId = &v
	return s
}

func (s *QueryContractTransactionRequest) SetHash(v string) *QueryContractTransactionRequest {
	s.Hash = &v
	return s
}

type QueryContractTransactionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易所在区块高度
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 交易hash
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
	// 该笔交易输入参数(base64编码)
	Input *string `json:"input,omitempty" xml:"input,omitempty"`
	// 交易时间戳
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
}

func (s QueryContractTransactionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryContractTransactionResponse) GoString() string {
	return s.String()
}

func (s *QueryContractTransactionResponse) SetReqMsgId(v string) *QueryContractTransactionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryContractTransactionResponse) SetResultCode(v string) *QueryContractTransactionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryContractTransactionResponse) SetResultMsg(v string) *QueryContractTransactionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryContractTransactionResponse) SetBlockNumber(v int64) *QueryContractTransactionResponse {
	s.BlockNumber = &v
	return s
}

func (s *QueryContractTransactionResponse) SetHash(v string) *QueryContractTransactionResponse {
	s.Hash = &v
	return s
}

func (s *QueryContractTransactionResponse) SetInput(v string) *QueryContractTransactionResponse {
	s.Input = &v
	return s
}

func (s *QueryContractTransactionResponse) SetTimestamp(v int64) *QueryContractTransactionResponse {
	s.Timestamp = &v
	return s
}

type QueryContractReceiptRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链id
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 业务方请求唯一标识，用于异步查询交易情况。 trace_id 和hash至少选择一种，都输入时，使用trace_id查询
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 查询的交易hash
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
}

func (s QueryContractReceiptRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryContractReceiptRequest) GoString() string {
	return s.String()
}

func (s *QueryContractReceiptRequest) SetAuthToken(v string) *QueryContractReceiptRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryContractReceiptRequest) SetProductInstanceId(v string) *QueryContractReceiptRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryContractReceiptRequest) SetBizid(v string) *QueryContractReceiptRequest {
	s.Bizid = &v
	return s
}

func (s *QueryContractReceiptRequest) SetTraceId(v string) *QueryContractReceiptRequest {
	s.TraceId = &v
	return s
}

func (s *QueryContractReceiptRequest) SetTenantId(v string) *QueryContractReceiptRequest {
	s.TenantId = &v
	return s
}

func (s *QueryContractReceiptRequest) SetHash(v string) *QueryContractReceiptRequest {
	s.Hash = &v
	return s
}

type QueryContractReceiptResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果执行结果code，一般为0则表示交易执行成功，非0则表示交易执行过程中发送了异常
	Result *int64 `json:"result,omitempty" xml:"result,omitempty"`
	// 交易所在区块高度
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 交易hash
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
	// 该笔交易执行的返回值(base64编码)，一般为合约方法中return的值
	Output *string `json:"output,omitempty" xml:"output,omitempty"`
}

func (s QueryContractReceiptResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryContractReceiptResponse) GoString() string {
	return s.String()
}

func (s *QueryContractReceiptResponse) SetReqMsgId(v string) *QueryContractReceiptResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryContractReceiptResponse) SetResultCode(v string) *QueryContractReceiptResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryContractReceiptResponse) SetResultMsg(v string) *QueryContractReceiptResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryContractReceiptResponse) SetResult(v int64) *QueryContractReceiptResponse {
	s.Result = &v
	return s
}

func (s *QueryContractReceiptResponse) SetBlockNumber(v int64) *QueryContractReceiptResponse {
	s.BlockNumber = &v
	return s
}

func (s *QueryContractReceiptResponse) SetHash(v string) *QueryContractReceiptResponse {
	s.Hash = &v
	return s
}

func (s *QueryContractReceiptResponse) SetOutput(v string) *QueryContractReceiptResponse {
	s.Output = &v
	return s
}

type ExecContractAddsupplyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 数字权证项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 业务方请求唯一标识，用于异步查询交易情况
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// 增发数值，非零
	Increase *int64 `json:"increase,omitempty" xml:"increase,omitempty" require:"true" minimum:"1"`
	// 托管账户信息(推荐)，托管和非拖管必选一种
	AccountInfo *AccountInfo `json:"account_info,omitempty" xml:"account_info,omitempty" require:"true"`
}

func (s ExecContractAddsupplyRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecContractAddsupplyRequest) GoString() string {
	return s.String()
}

func (s *ExecContractAddsupplyRequest) SetAuthToken(v string) *ExecContractAddsupplyRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecContractAddsupplyRequest) SetProductInstanceId(v string) *ExecContractAddsupplyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecContractAddsupplyRequest) SetBizid(v string) *ExecContractAddsupplyRequest {
	s.Bizid = &v
	return s
}

func (s *ExecContractAddsupplyRequest) SetProjectId(v string) *ExecContractAddsupplyRequest {
	s.ProjectId = &v
	return s
}

func (s *ExecContractAddsupplyRequest) SetTraceId(v string) *ExecContractAddsupplyRequest {
	s.TraceId = &v
	return s
}

func (s *ExecContractAddsupplyRequest) SetIncrease(v int64) *ExecContractAddsupplyRequest {
	s.Increase = &v
	return s
}

func (s *ExecContractAddsupplyRequest) SetAccountInfo(v *AccountInfo) *ExecContractAddsupplyRequest {
	s.AccountInfo = v
	return s
}

type ExecContractAddsupplyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 客户端传入的请求唯一标识
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// 交易hash，可通过hash查询上链结果
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
}

func (s ExecContractAddsupplyResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecContractAddsupplyResponse) GoString() string {
	return s.String()
}

func (s *ExecContractAddsupplyResponse) SetReqMsgId(v string) *ExecContractAddsupplyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecContractAddsupplyResponse) SetResultCode(v string) *ExecContractAddsupplyResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecContractAddsupplyResponse) SetResultMsg(v string) *ExecContractAddsupplyResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecContractAddsupplyResponse) SetTraceId(v string) *ExecContractAddsupplyResponse {
	s.TraceId = &v
	return s
}

func (s *ExecContractAddsupplyResponse) SetHash(v string) *ExecContractAddsupplyResponse {
	s.Hash = &v
	return s
}

type ExecContractTransferRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 数字权证项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 业务方请求唯一标识，用于异步查询交易情况
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// 权证所有者账户
	From *string `json:"from,omitempty" xml:"from,omitempty" require:"true"`
	// 转移的目标账户
	To *string `json:"to,omitempty" xml:"to,omitempty" require:"true"`
	// 转移的目标权证
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 托管账户信息(推荐)，托管和非拖管必选一种
	AccountInfo *AccountInfo `json:"account_info,omitempty" xml:"account_info,omitempty" require:"true"`
}

func (s ExecContractTransferRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecContractTransferRequest) GoString() string {
	return s.String()
}

func (s *ExecContractTransferRequest) SetAuthToken(v string) *ExecContractTransferRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecContractTransferRequest) SetProductInstanceId(v string) *ExecContractTransferRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecContractTransferRequest) SetBizid(v string) *ExecContractTransferRequest {
	s.Bizid = &v
	return s
}

func (s *ExecContractTransferRequest) SetProjectId(v string) *ExecContractTransferRequest {
	s.ProjectId = &v
	return s
}

func (s *ExecContractTransferRequest) SetTraceId(v string) *ExecContractTransferRequest {
	s.TraceId = &v
	return s
}

func (s *ExecContractTransferRequest) SetFrom(v string) *ExecContractTransferRequest {
	s.From = &v
	return s
}

func (s *ExecContractTransferRequest) SetTo(v string) *ExecContractTransferRequest {
	s.To = &v
	return s
}

func (s *ExecContractTransferRequest) SetAssetId(v string) *ExecContractTransferRequest {
	s.AssetId = &v
	return s
}

func (s *ExecContractTransferRequest) SetAccountInfo(v *AccountInfo) *ExecContractTransferRequest {
	s.AccountInfo = v
	return s
}

type ExecContractTransferResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 客户端传入的请求唯一标识
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// 交易hash，可通过hash查询上链结果
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
}

func (s ExecContractTransferResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecContractTransferResponse) GoString() string {
	return s.String()
}

func (s *ExecContractTransferResponse) SetReqMsgId(v string) *ExecContractTransferResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecContractTransferResponse) SetResultCode(v string) *ExecContractTransferResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecContractTransferResponse) SetResultMsg(v string) *ExecContractTransferResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecContractTransferResponse) SetTraceId(v string) *ExecContractTransferResponse {
	s.TraceId = &v
	return s
}

func (s *ExecContractTransferResponse) SetHash(v string) *ExecContractTransferResponse {
	s.Hash = &v
	return s
}

type ExecContractWriteoffRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 数字权证项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 业务方请求唯一标识，用于异步查询交易情况
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// 被核销的目标权证
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 托管账户信息(推荐)，托管和非拖管必选一种
	AccountInfo *AccountInfo `json:"account_info,omitempty" xml:"account_info,omitempty" require:"true"`
}

func (s ExecContractWriteoffRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecContractWriteoffRequest) GoString() string {
	return s.String()
}

func (s *ExecContractWriteoffRequest) SetAuthToken(v string) *ExecContractWriteoffRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecContractWriteoffRequest) SetProductInstanceId(v string) *ExecContractWriteoffRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecContractWriteoffRequest) SetBizid(v string) *ExecContractWriteoffRequest {
	s.Bizid = &v
	return s
}

func (s *ExecContractWriteoffRequest) SetProjectId(v string) *ExecContractWriteoffRequest {
	s.ProjectId = &v
	return s
}

func (s *ExecContractWriteoffRequest) SetTraceId(v string) *ExecContractWriteoffRequest {
	s.TraceId = &v
	return s
}

func (s *ExecContractWriteoffRequest) SetAssetId(v string) *ExecContractWriteoffRequest {
	s.AssetId = &v
	return s
}

func (s *ExecContractWriteoffRequest) SetAccountInfo(v *AccountInfo) *ExecContractWriteoffRequest {
	s.AccountInfo = v
	return s
}

type ExecContractWriteoffResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 客户端传入的请求唯一标识
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// 交易hash，可通过hash查询上链结果
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
}

func (s ExecContractWriteoffResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecContractWriteoffResponse) GoString() string {
	return s.String()
}

func (s *ExecContractWriteoffResponse) SetReqMsgId(v string) *ExecContractWriteoffResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecContractWriteoffResponse) SetResultCode(v string) *ExecContractWriteoffResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecContractWriteoffResponse) SetResultMsg(v string) *ExecContractWriteoffResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecContractWriteoffResponse) SetTraceId(v string) *ExecContractWriteoffResponse {
	s.TraceId = &v
	return s
}

func (s *ExecContractWriteoffResponse) SetHash(v string) *ExecContractWriteoffResponse {
	s.Hash = &v
	return s
}

type ExecContractBurnoffRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 数字权证项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 业务方请求唯一标识，用于异步查询交易情况
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// 被销毁的目标权证
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 托管账户信息(推荐)，托管和非拖管必选一种
	AccountInfo *AccountInfo `json:"account_info,omitempty" xml:"account_info,omitempty" require:"true"`
}

func (s ExecContractBurnoffRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecContractBurnoffRequest) GoString() string {
	return s.String()
}

func (s *ExecContractBurnoffRequest) SetAuthToken(v string) *ExecContractBurnoffRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecContractBurnoffRequest) SetProductInstanceId(v string) *ExecContractBurnoffRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecContractBurnoffRequest) SetBizid(v string) *ExecContractBurnoffRequest {
	s.Bizid = &v
	return s
}

func (s *ExecContractBurnoffRequest) SetProjectId(v string) *ExecContractBurnoffRequest {
	s.ProjectId = &v
	return s
}

func (s *ExecContractBurnoffRequest) SetTraceId(v string) *ExecContractBurnoffRequest {
	s.TraceId = &v
	return s
}

func (s *ExecContractBurnoffRequest) SetAssetId(v string) *ExecContractBurnoffRequest {
	s.AssetId = &v
	return s
}

func (s *ExecContractBurnoffRequest) SetAccountInfo(v *AccountInfo) *ExecContractBurnoffRequest {
	s.AccountInfo = v
	return s
}

type ExecContractBurnoffResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 客户端传入的请求唯一标识
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// 交易hash，可通过hash查询上链结果
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
}

func (s ExecContractBurnoffResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecContractBurnoffResponse) GoString() string {
	return s.String()
}

func (s *ExecContractBurnoffResponse) SetReqMsgId(v string) *ExecContractBurnoffResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecContractBurnoffResponse) SetResultCode(v string) *ExecContractBurnoffResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecContractBurnoffResponse) SetResultMsg(v string) *ExecContractBurnoffResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecContractBurnoffResponse) SetTraceId(v string) *ExecContractBurnoffResponse {
	s.TraceId = &v
	return s
}

func (s *ExecContractBurnoffResponse) SetHash(v string) *ExecContractBurnoffResponse {
	s.Hash = &v
	return s
}

type QueryContractAssetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 数字权证项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 业务方请求唯一标识，用于异步查询交易情况
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// 查询的目标账户
	Account *string `json:"account,omitempty" xml:"account,omitempty" require:"true"`
	// 托管账户信息(推荐)，托管和非拖管必选一种
	AccountInfo *AccountInfo `json:"account_info,omitempty" xml:"account_info,omitempty" require:"true"`
}

func (s QueryContractAssetRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryContractAssetRequest) GoString() string {
	return s.String()
}

func (s *QueryContractAssetRequest) SetAuthToken(v string) *QueryContractAssetRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryContractAssetRequest) SetProductInstanceId(v string) *QueryContractAssetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryContractAssetRequest) SetBizid(v string) *QueryContractAssetRequest {
	s.Bizid = &v
	return s
}

func (s *QueryContractAssetRequest) SetProjectId(v string) *QueryContractAssetRequest {
	s.ProjectId = &v
	return s
}

func (s *QueryContractAssetRequest) SetTraceId(v string) *QueryContractAssetRequest {
	s.TraceId = &v
	return s
}

func (s *QueryContractAssetRequest) SetAccount(v string) *QueryContractAssetRequest {
	s.Account = &v
	return s
}

func (s *QueryContractAssetRequest) SetAccountInfo(v *AccountInfo) *QueryContractAssetRequest {
	s.AccountInfo = v
	return s
}

type QueryContractAssetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 客户端传入的请求唯一标识
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// 客户端传入的查询账户
	Account *string `json:"account,omitempty" xml:"account,omitempty"`
	// 目标账户拥有的权证列表
	AssetIdList []*string `json:"asset_id_list,omitempty" xml:"asset_id_list,omitempty" type:"Repeated"`
}

func (s QueryContractAssetResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryContractAssetResponse) GoString() string {
	return s.String()
}

func (s *QueryContractAssetResponse) SetReqMsgId(v string) *QueryContractAssetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryContractAssetResponse) SetResultCode(v string) *QueryContractAssetResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryContractAssetResponse) SetResultMsg(v string) *QueryContractAssetResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryContractAssetResponse) SetTraceId(v string) *QueryContractAssetResponse {
	s.TraceId = &v
	return s
}

func (s *QueryContractAssetResponse) SetAccount(v string) *QueryContractAssetResponse {
	s.Account = &v
	return s
}

func (s *QueryContractAssetResponse) SetAssetIdList(v []*string) *QueryContractAssetResponse {
	s.AssetIdList = v
	return s
}

type QueryContractAsseturiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 数字权证项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 业务方请求唯一标识，用于异步查询交易情况
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// 查询的权证ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 托管账户信息(推荐)，托管和非拖管必选一种
	AccountInfo *AccountInfo `json:"account_info,omitempty" xml:"account_info,omitempty" require:"true"`
}

func (s QueryContractAsseturiRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryContractAsseturiRequest) GoString() string {
	return s.String()
}

func (s *QueryContractAsseturiRequest) SetAuthToken(v string) *QueryContractAsseturiRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryContractAsseturiRequest) SetProductInstanceId(v string) *QueryContractAsseturiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryContractAsseturiRequest) SetBizid(v string) *QueryContractAsseturiRequest {
	s.Bizid = &v
	return s
}

func (s *QueryContractAsseturiRequest) SetProjectId(v string) *QueryContractAsseturiRequest {
	s.ProjectId = &v
	return s
}

func (s *QueryContractAsseturiRequest) SetTraceId(v string) *QueryContractAsseturiRequest {
	s.TraceId = &v
	return s
}

func (s *QueryContractAsseturiRequest) SetAssetId(v string) *QueryContractAsseturiRequest {
	s.AssetId = &v
	return s
}

func (s *QueryContractAsseturiRequest) SetAccountInfo(v *AccountInfo) *QueryContractAsseturiRequest {
	s.AccountInfo = v
	return s
}

type QueryContractAsseturiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 客户端传入的请求唯一标识
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// 客户端传入的权证id
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 数字权证绑定的标准URI协议文件，权证信息
	AssetUri *string `json:"asset_uri,omitempty" xml:"asset_uri,omitempty"`
}

func (s QueryContractAsseturiResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryContractAsseturiResponse) GoString() string {
	return s.String()
}

func (s *QueryContractAsseturiResponse) SetReqMsgId(v string) *QueryContractAsseturiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryContractAsseturiResponse) SetResultCode(v string) *QueryContractAsseturiResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryContractAsseturiResponse) SetResultMsg(v string) *QueryContractAsseturiResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryContractAsseturiResponse) SetTraceId(v string) *QueryContractAsseturiResponse {
	s.TraceId = &v
	return s
}

func (s *QueryContractAsseturiResponse) SetAssetId(v string) *QueryContractAsseturiResponse {
	s.AssetId = &v
	return s
}

func (s *QueryContractAsseturiResponse) SetAssetUri(v string) *QueryContractAsseturiResponse {
	s.AssetUri = &v
	return s
}

type ExecContractApproveRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 数字权证项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 业务方请求唯一标识，用于异步查询交易情况
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// 被授权的目标权证
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 被授权的目标账户
	ToAccount *string `json:"to_account,omitempty" xml:"to_account,omitempty" require:"true"`
	// 托管账户信息(推荐)，托管和非拖管必选一种
	AccountInfo *AccountInfo `json:"account_info,omitempty" xml:"account_info,omitempty" require:"true"`
}

func (s ExecContractApproveRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecContractApproveRequest) GoString() string {
	return s.String()
}

func (s *ExecContractApproveRequest) SetAuthToken(v string) *ExecContractApproveRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecContractApproveRequest) SetProductInstanceId(v string) *ExecContractApproveRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecContractApproveRequest) SetBizid(v string) *ExecContractApproveRequest {
	s.Bizid = &v
	return s
}

func (s *ExecContractApproveRequest) SetProjectId(v string) *ExecContractApproveRequest {
	s.ProjectId = &v
	return s
}

func (s *ExecContractApproveRequest) SetTraceId(v string) *ExecContractApproveRequest {
	s.TraceId = &v
	return s
}

func (s *ExecContractApproveRequest) SetAssetId(v string) *ExecContractApproveRequest {
	s.AssetId = &v
	return s
}

func (s *ExecContractApproveRequest) SetToAccount(v string) *ExecContractApproveRequest {
	s.ToAccount = &v
	return s
}

func (s *ExecContractApproveRequest) SetAccountInfo(v *AccountInfo) *ExecContractApproveRequest {
	s.AccountInfo = v
	return s
}

type ExecContractApproveResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 客户端传入的请求唯一标识
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// 交易hash，可通过hash查询上链结果
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
}

func (s ExecContractApproveResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecContractApproveResponse) GoString() string {
	return s.String()
}

func (s *ExecContractApproveResponse) SetReqMsgId(v string) *ExecContractApproveResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecContractApproveResponse) SetResultCode(v string) *ExecContractApproveResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecContractApproveResponse) SetResultMsg(v string) *ExecContractApproveResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecContractApproveResponse) SetTraceId(v string) *ExecContractApproveResponse {
	s.TraceId = &v
	return s
}

func (s *ExecContractApproveResponse) SetHash(v string) *ExecContractApproveResponse {
	s.Hash = &v
	return s
}

type CancelContractApproveRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 数字权证项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 业务方请求唯一标识，用于异步查询交易情况
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// 取消授权的目标账户
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 托管账户信息(推荐)，托管和非拖管必选一种
	AccountInfo *AccountInfo `json:"account_info,omitempty" xml:"account_info,omitempty" require:"true"`
}

func (s CancelContractApproveRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelContractApproveRequest) GoString() string {
	return s.String()
}

func (s *CancelContractApproveRequest) SetAuthToken(v string) *CancelContractApproveRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelContractApproveRequest) SetProductInstanceId(v string) *CancelContractApproveRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelContractApproveRequest) SetBizid(v string) *CancelContractApproveRequest {
	s.Bizid = &v
	return s
}

func (s *CancelContractApproveRequest) SetProjectId(v string) *CancelContractApproveRequest {
	s.ProjectId = &v
	return s
}

func (s *CancelContractApproveRequest) SetTraceId(v string) *CancelContractApproveRequest {
	s.TraceId = &v
	return s
}

func (s *CancelContractApproveRequest) SetAssetId(v string) *CancelContractApproveRequest {
	s.AssetId = &v
	return s
}

func (s *CancelContractApproveRequest) SetAccountInfo(v *AccountInfo) *CancelContractApproveRequest {
	s.AccountInfo = v
	return s
}

type CancelContractApproveResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 客户端传入的请求唯一标识
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// 交易hash，可通过hash查询上链结果
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
}

func (s CancelContractApproveResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelContractApproveResponse) GoString() string {
	return s.String()
}

func (s *CancelContractApproveResponse) SetReqMsgId(v string) *CancelContractApproveResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelContractApproveResponse) SetResultCode(v string) *CancelContractApproveResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelContractApproveResponse) SetResultMsg(v string) *CancelContractApproveResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelContractApproveResponse) SetTraceId(v string) *CancelContractApproveResponse {
	s.TraceId = &v
	return s
}

func (s *CancelContractApproveResponse) SetHash(v string) *CancelContractApproveResponse {
	s.Hash = &v
	return s
}

type SetContractRoleRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 数字权证项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 业务方请求唯一标识，用于异步查询交易情况
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// 授权的目标账户
	Account *string `json:"account,omitempty" xml:"account,omitempty" require:"true"`
	// 项目中的权证管理角色，目前支持两种：
	// 1.【issuer】发行者角色
	// 2.【writeoff】核销者
	// 输入不区分大小写
	Role *string `json:"role,omitempty" xml:"role,omitempty" require:"true"`
	// 托管账户信息(推荐)，托管和非拖管必选一种
	AccountInfo *AccountInfo `json:"account_info,omitempty" xml:"account_info,omitempty" require:"true"`
}

func (s SetContractRoleRequest) String() string {
	return tea.Prettify(s)
}

func (s SetContractRoleRequest) GoString() string {
	return s.String()
}

func (s *SetContractRoleRequest) SetAuthToken(v string) *SetContractRoleRequest {
	s.AuthToken = &v
	return s
}

func (s *SetContractRoleRequest) SetProductInstanceId(v string) *SetContractRoleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SetContractRoleRequest) SetBizid(v string) *SetContractRoleRequest {
	s.Bizid = &v
	return s
}

func (s *SetContractRoleRequest) SetProjectId(v string) *SetContractRoleRequest {
	s.ProjectId = &v
	return s
}

func (s *SetContractRoleRequest) SetTraceId(v string) *SetContractRoleRequest {
	s.TraceId = &v
	return s
}

func (s *SetContractRoleRequest) SetAccount(v string) *SetContractRoleRequest {
	s.Account = &v
	return s
}

func (s *SetContractRoleRequest) SetRole(v string) *SetContractRoleRequest {
	s.Role = &v
	return s
}

func (s *SetContractRoleRequest) SetAccountInfo(v *AccountInfo) *SetContractRoleRequest {
	s.AccountInfo = v
	return s
}

type SetContractRoleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 客户端传入的请求唯一标识
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// 交易hash，可通过hash查询上链结果
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
}

func (s SetContractRoleResponse) String() string {
	return tea.Prettify(s)
}

func (s SetContractRoleResponse) GoString() string {
	return s.String()
}

func (s *SetContractRoleResponse) SetReqMsgId(v string) *SetContractRoleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SetContractRoleResponse) SetResultCode(v string) *SetContractRoleResponse {
	s.ResultCode = &v
	return s
}

func (s *SetContractRoleResponse) SetResultMsg(v string) *SetContractRoleResponse {
	s.ResultMsg = &v
	return s
}

func (s *SetContractRoleResponse) SetTraceId(v string) *SetContractRoleResponse {
	s.TraceId = &v
	return s
}

func (s *SetContractRoleResponse) SetHash(v string) *SetContractRoleResponse {
	s.Hash = &v
	return s
}

type CancelContractRoleRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 数字权证项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 业务方请求唯一标识，用于异步查询交易情况
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// 被取消的目标账户
	Account *string `json:"account,omitempty" xml:"account,omitempty" require:"true"`
	// 被取消的角色，目前支持两种：
	// 1.【issuer】发行者角色
	// 2.【writeoff】核销者
	// 输入不区分大小写
	Role *string `json:"role,omitempty" xml:"role,omitempty" require:"true"`
	// 托管账户信息(推荐)，托管和非拖管必选一种
	AccountInfo *AccountInfo `json:"account_info,omitempty" xml:"account_info,omitempty" require:"true"`
}

func (s CancelContractRoleRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelContractRoleRequest) GoString() string {
	return s.String()
}

func (s *CancelContractRoleRequest) SetAuthToken(v string) *CancelContractRoleRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelContractRoleRequest) SetProductInstanceId(v string) *CancelContractRoleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelContractRoleRequest) SetBizid(v string) *CancelContractRoleRequest {
	s.Bizid = &v
	return s
}

func (s *CancelContractRoleRequest) SetProjectId(v string) *CancelContractRoleRequest {
	s.ProjectId = &v
	return s
}

func (s *CancelContractRoleRequest) SetTraceId(v string) *CancelContractRoleRequest {
	s.TraceId = &v
	return s
}

func (s *CancelContractRoleRequest) SetAccount(v string) *CancelContractRoleRequest {
	s.Account = &v
	return s
}

func (s *CancelContractRoleRequest) SetRole(v string) *CancelContractRoleRequest {
	s.Role = &v
	return s
}

func (s *CancelContractRoleRequest) SetAccountInfo(v *AccountInfo) *CancelContractRoleRequest {
	s.AccountInfo = v
	return s
}

type CancelContractRoleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 客户端传入的请求唯一标识
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// 交易hash，可通过hash查询上链结果
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
}

func (s CancelContractRoleResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelContractRoleResponse) GoString() string {
	return s.String()
}

func (s *CancelContractRoleResponse) SetReqMsgId(v string) *CancelContractRoleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelContractRoleResponse) SetResultCode(v string) *CancelContractRoleResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelContractRoleResponse) SetResultMsg(v string) *CancelContractRoleResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelContractRoleResponse) SetTraceId(v string) *CancelContractRoleResponse {
	s.TraceId = &v
	return s
}

func (s *CancelContractRoleResponse) SetHash(v string) *CancelContractRoleResponse {
	s.Hash = &v
	return s
}

type ExecContractBatchissueRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 数字权证项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 业务方请求唯一标识，用于异步查询交易情况
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// 权证发行的目标账户
	ToAccout *string `json:"to_accout,omitempty" xml:"to_accout,omitempty" require:"true"`
	// 批量发行个数，建议多次分批执行
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty" require:"true" minimum:"1"`
	// 托管账户信息(推荐)，托管和非拖管必选一种
	AccountInfo *AccountInfo `json:"account_info,omitempty" xml:"account_info,omitempty" require:"true"`
}

func (s ExecContractBatchissueRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecContractBatchissueRequest) GoString() string {
	return s.String()
}

func (s *ExecContractBatchissueRequest) SetAuthToken(v string) *ExecContractBatchissueRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecContractBatchissueRequest) SetProductInstanceId(v string) *ExecContractBatchissueRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecContractBatchissueRequest) SetBizid(v string) *ExecContractBatchissueRequest {
	s.Bizid = &v
	return s
}

func (s *ExecContractBatchissueRequest) SetProjectId(v string) *ExecContractBatchissueRequest {
	s.ProjectId = &v
	return s
}

func (s *ExecContractBatchissueRequest) SetTraceId(v string) *ExecContractBatchissueRequest {
	s.TraceId = &v
	return s
}

func (s *ExecContractBatchissueRequest) SetToAccout(v string) *ExecContractBatchissueRequest {
	s.ToAccout = &v
	return s
}

func (s *ExecContractBatchissueRequest) SetAmount(v int64) *ExecContractBatchissueRequest {
	s.Amount = &v
	return s
}

func (s *ExecContractBatchissueRequest) SetAccountInfo(v *AccountInfo) *ExecContractBatchissueRequest {
	s.AccountInfo = v
	return s
}

type ExecContractBatchissueResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 客户端传入的请求唯一标识
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// 交易hash，可通过hash查询上链结果
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
}

func (s ExecContractBatchissueResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecContractBatchissueResponse) GoString() string {
	return s.String()
}

func (s *ExecContractBatchissueResponse) SetReqMsgId(v string) *ExecContractBatchissueResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecContractBatchissueResponse) SetResultCode(v string) *ExecContractBatchissueResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecContractBatchissueResponse) SetResultMsg(v string) *ExecContractBatchissueResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecContractBatchissueResponse) SetTraceId(v string) *ExecContractBatchissueResponse {
	s.TraceId = &v
	return s
}

func (s *ExecContractBatchissueResponse) SetHash(v string) *ExecContractBatchissueResponse {
	s.Hash = &v
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
				"sdk_version":      tea.String("1.0.34"),
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
 * Description: 检测账户名称是否已经在区块链注册
 * Summary: 检测账户名称是否已经在区块链注册
 */
func (client *Client) CheckAccount(request *CheckAccountRequest) (_result *CheckAccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckAccountResponse{}
	_body, _err := client.CheckAccountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 检测账户名称是否已经在区块链注册
 * Summary: 检测账户名称是否已经在区块链注册
 */
func (client *Client) CheckAccountEx(request *CheckAccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckAccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckAccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdigital.account.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建MyChain托管账户
 * Summary: 创建MyChain托管账户
 */
func (client *Client) CreateAccountKms(request *CreateAccountKmsRequest) (_result *CreateAccountKmsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAccountKmsResponse{}
	_body, _err := client.CreateAccountKmsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建MyChain托管账户
 * Summary: 创建MyChain托管账户
 */
func (client *Client) CreateAccountKmsEx(request *CreateAccountKmsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAccountKmsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAccountKmsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdigital.account.kms.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建oss上传policy，客户端使用http方式自主上传文件
 * Summary: 创建资源上传规则url
 */
func (client *Client) CreateResourcePolicy(request *CreateResourcePolicyRequest) (_result *CreateResourcePolicyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateResourcePolicyResponse{}
	_body, _err := client.CreateResourcePolicyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建oss上传policy，客户端使用http方式自主上传文件
 * Summary: 创建资源上传规则url
 */
func (client *Client) CreateResourcePolicyEx(request *CreateResourcePolicyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateResourcePolicyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateResourcePolicyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdigital.resource.policy.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 上传文件状态检测
 * Summary: 上传文件状态检测
 */
func (client *Client) CheckResource(request *CheckResourceRequest) (_result *CheckResourceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckResourceResponse{}
	_body, _err := client.CheckResourceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上传文件状态检测
 * Summary: 上传文件状态检测
 */
func (client *Client) CheckResourceEx(request *CheckResourceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckResourceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckResourceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdigital.resource.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 定义数字权证AssetUri，包括权证所需各种属性
 * Summary: 定义数字权证AssetUri
 */
func (client *Client) CreateAsseturi(request *CreateAsseturiRequest) (_result *CreateAsseturiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAsseturiResponse{}
	_body, _err := client.CreateAsseturiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 定义数字权证AssetUri，包括权证所需各种属性
 * Summary: 定义数字权证AssetUri
 */
func (client *Client) CreateAsseturiEx(request *CreateAsseturiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAsseturiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAsseturiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdigital.asseturi.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询项目信息
 * Summary: 查询项目初始信息
 */
func (client *Client) QueryProject(request *QueryProjectRequest) (_result *QueryProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryProjectResponse{}
	_body, _err := client.QueryProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询项目信息
 * Summary: 查询项目初始信息
 */
func (client *Client) QueryProjectEx(request *QueryProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdigital.project.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建数字权证项目
 * Summary: 创建数字权证项目
 */
func (client *Client) CreateProject(request *CreateProjectRequest) (_result *CreateProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateProjectResponse{}
	_body, _err := client.CreateProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建数字权证项目
 * Summary: 创建数字权证项目
 */
func (client *Client) CreateProjectEx(request *CreateProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdigital.project.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新数字权证项目信息
 * Summary: 更新数字权证项目信息
 */
func (client *Client) UpdateProject(request *UpdateProjectRequest) (_result *UpdateProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateProjectResponse{}
	_body, _err := client.UpdateProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新数字权证项目信息
 * Summary: 更新数字权证项目信息
 */
func (client *Client) UpdateProjectEx(request *UpdateProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdigital.project.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数字权证签发(异步)
 * Summary: 数字权证签发(异步)
 */
func (client *Client) ExecContractIssue(request *ExecContractIssueRequest) (_result *ExecContractIssueResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecContractIssueResponse{}
	_body, _err := client.ExecContractIssueEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数字权证签发(异步)
 * Summary: 数字权证签发(异步)
 */
func (client *Client) ExecContractIssueEx(request *ExecContractIssueRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecContractIssueResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecContractIssueResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdigital.contract.issue.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询所有项目ID列表
 * Summary: 查询所有项目ID列表
 */
func (client *Client) ListProject(request *ListProjectRequest) (_result *ListProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListProjectResponse{}
	_body, _err := client.ListProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询所有项目ID列表
 * Summary: 查询所有项目ID列表
 */
func (client *Client) ListProjectEx(request *ListProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdigital.project.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询发送到链上的交易内容
 * Summary: 查询交易
 */
func (client *Client) QueryContractTransaction(request *QueryContractTransactionRequest) (_result *QueryContractTransactionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryContractTransactionResponse{}
	_body, _err := client.QueryContractTransactionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询发送到链上的交易内容
 * Summary: 查询交易
 */
func (client *Client) QueryContractTransactionEx(request *QueryContractTransactionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryContractTransactionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryContractTransactionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdigital.contract.transaction.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询发送到链上的交易执行的结果
 * Summary: 查询交易执行回执
 */
func (client *Client) QueryContractReceipt(request *QueryContractReceiptRequest) (_result *QueryContractReceiptResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryContractReceiptResponse{}
	_body, _err := client.QueryContractReceiptEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询发送到链上的交易执行的结果
 * Summary: 查询交易执行回执
 */
func (client *Client) QueryContractReceiptEx(request *QueryContractReceiptRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryContractReceiptResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryContractReceiptResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdigital.contract.receipt.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数字权证增发(异步)
 * Summary: 数字权证增发(异步)
 */
func (client *Client) ExecContractAddsupply(request *ExecContractAddsupplyRequest) (_result *ExecContractAddsupplyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecContractAddsupplyResponse{}
	_body, _err := client.ExecContractAddsupplyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数字权证增发(异步)
 * Summary: 数字权证增发(异步)
 */
func (client *Client) ExecContractAddsupplyEx(request *ExecContractAddsupplyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecContractAddsupplyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecContractAddsupplyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdigital.contract.addsupply.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数字权证转移(异步)
 * Summary: 数字权证转移(异步)
 */
func (client *Client) ExecContractTransfer(request *ExecContractTransferRequest) (_result *ExecContractTransferResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecContractTransferResponse{}
	_body, _err := client.ExecContractTransferEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数字权证转移(异步)
 * Summary: 数字权证转移(异步)
 */
func (client *Client) ExecContractTransferEx(request *ExecContractTransferRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecContractTransferResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecContractTransferResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdigital.contract.transfer.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数字权证核销(异步)
 * Summary: 数字权证核销(异步)
 */
func (client *Client) ExecContractWriteoff(request *ExecContractWriteoffRequest) (_result *ExecContractWriteoffResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecContractWriteoffResponse{}
	_body, _err := client.ExecContractWriteoffEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数字权证核销(异步)
 * Summary: 数字权证核销(异步)
 */
func (client *Client) ExecContractWriteoffEx(request *ExecContractWriteoffRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecContractWriteoffResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecContractWriteoffResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdigital.contract.writeoff.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数字权证销毁(异步)
 * Summary: 数字权证销毁(异步)
 */
func (client *Client) ExecContractBurnoff(request *ExecContractBurnoffRequest) (_result *ExecContractBurnoffResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecContractBurnoffResponse{}
	_body, _err := client.ExecContractBurnoffEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数字权证销毁(异步)
 * Summary: 数字权证销毁(异步)
 */
func (client *Client) ExecContractBurnoffEx(request *ExecContractBurnoffRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecContractBurnoffResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecContractBurnoffResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdigital.contract.burnoff.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询特定账户下的权证信息
 * Summary: 查询特定账户下的权证信息
 */
func (client *Client) QueryContractAsset(request *QueryContractAssetRequest) (_result *QueryContractAssetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryContractAssetResponse{}
	_body, _err := client.QueryContractAssetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询特定账户下的权证信息
 * Summary: 查询特定账户下的权证信息
 */
func (client *Client) QueryContractAssetEx(request *QueryContractAssetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryContractAssetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryContractAssetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdigital.contract.asset.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询特定权证的uri meta信息
 * Summary: 查询特定权证的uri meta信息
 */
func (client *Client) QueryContractAsseturi(request *QueryContractAsseturiRequest) (_result *QueryContractAsseturiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryContractAsseturiResponse{}
	_body, _err := client.QueryContractAsseturiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询特定权证的uri meta信息
 * Summary: 查询特定权证的uri meta信息
 */
func (client *Client) QueryContractAsseturiEx(request *QueryContractAsseturiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryContractAsseturiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryContractAsseturiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdigital.contract.asseturi.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 授权权证给某个账户
 * Summary: 数字权证授权(异步)
 */
func (client *Client) ExecContractApprove(request *ExecContractApproveRequest) (_result *ExecContractApproveResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecContractApproveResponse{}
	_body, _err := client.ExecContractApproveEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 授权权证给某个账户
 * Summary: 数字权证授权(异步)
 */
func (client *Client) ExecContractApproveEx(request *ExecContractApproveRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecContractApproveResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecContractApproveResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdigital.contract.approve.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 取消数字权证授权
 * Summary: 取消数字权证授权(异步)
 */
func (client *Client) CancelContractApprove(request *CancelContractApproveRequest) (_result *CancelContractApproveResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelContractApproveResponse{}
	_body, _err := client.CancelContractApproveEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 取消数字权证授权
 * Summary: 取消数字权证授权(异步)
 */
func (client *Client) CancelContractApproveEx(request *CancelContractApproveRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelContractApproveResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelContractApproveResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdigital.contract.approve.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 为某个账户授权权证管理角色，目前支持设置【发行者】，【核销者】两种。
同一个账户可具备多个角色，同一个角色可有多个账户。
 * Summary: 授权项目权证管理角色(异步)
*/
func (client *Client) SetContractRole(request *SetContractRoleRequest) (_result *SetContractRoleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SetContractRoleResponse{}
	_body, _err := client.SetContractRoleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 为某个账户授权权证管理角色，目前支持设置【发行者】，【核销者】两种。
同一个账户可具备多个角色，同一个角色可有多个账户。
 * Summary: 授权项目权证管理角色(异步)
*/
func (client *Client) SetContractRoleEx(request *SetContractRoleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SetContractRoleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SetContractRoleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdigital.contract.role.set"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 取消某个账户已经拥有的管理角色，目前支持设置【发行者】，【核销者】两种。
 * Summary: 取消项目管理角色(异步)
 */
func (client *Client) CancelContractRole(request *CancelContractRoleRequest) (_result *CancelContractRoleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelContractRoleResponse{}
	_body, _err := client.CancelContractRoleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 取消某个账户已经拥有的管理角色，目前支持设置【发行者】，【核销者】两种。
 * Summary: 取消项目管理角色(异步)
 */
func (client *Client) CancelContractRoleEx(request *CancelContractRoleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelContractRoleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelContractRoleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdigital.contract.role.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 共享型项目批量发行权证到指定账户，非共享型项目无法使用此接口
 * Summary: 批量发行权证到指定账户(异步)
 */
func (client *Client) ExecContractBatchissue(request *ExecContractBatchissueRequest) (_result *ExecContractBatchissueResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecContractBatchissueResponse{}
	_body, _err := client.ExecContractBatchissueEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 共享型项目批量发行权证到指定账户，非共享型项目无法使用此接口
 * Summary: 批量发行权证到指定账户(异步)
 */
func (client *Client) ExecContractBatchissueEx(request *ExecContractBatchissueRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecContractBatchissueResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecContractBatchissueResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.baasdigital.contract.batchissue.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
