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

// 规则明细
type RuleDetail struct {
	// 项目类别
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 领域
	FieId *string `json:"fie_id,omitempty" xml:"fie_id,omitempty" require:"true"`
	// 级别
	Level *string `json:"level,omitempty" xml:"level,omitempty" require:"true"`
	// 资质
	Qualifications *string `json:"qualifications,omitempty" xml:"qualifications,omitempty" require:"true"`
	// 保定报价
	PriceBd *int64 `json:"price_bd,omitempty" xml:"price_bd,omitempty" require:"true"`
	// 离岸价格
	FobPrice *int64 `json:"fob_price,omitempty" xml:"fob_price,omitempty" require:"true"`
	// 离岸价格
	PriceTj *int64 `json:"price_tj,omitempty" xml:"price_tj,omitempty" require:"true"`
	// 北京报价
	PriceBj *int64 `json:"price_bj,omitempty" xml:"price_bj,omitempty" require:"true"`
	// 最少提供人数
	Numpeople *int64 `json:"numpeople,omitempty" xml:"numpeople,omitempty" require:"true"`
}

func (s RuleDetail) String() string {
	return tea.Prettify(s)
}

func (s RuleDetail) GoString() string {
	return s.String()
}

func (s *RuleDetail) SetType(v string) *RuleDetail {
	s.Type = &v
	return s
}

func (s *RuleDetail) SetFieId(v string) *RuleDetail {
	s.FieId = &v
	return s
}

func (s *RuleDetail) SetLevel(v string) *RuleDetail {
	s.Level = &v
	return s
}

func (s *RuleDetail) SetQualifications(v string) *RuleDetail {
	s.Qualifications = &v
	return s
}

func (s *RuleDetail) SetPriceBd(v int64) *RuleDetail {
	s.PriceBd = &v
	return s
}

func (s *RuleDetail) SetFobPrice(v int64) *RuleDetail {
	s.FobPrice = &v
	return s
}

func (s *RuleDetail) SetPriceTj(v int64) *RuleDetail {
	s.PriceTj = &v
	return s
}

func (s *RuleDetail) SetPriceBj(v int64) *RuleDetail {
	s.PriceBj = &v
	return s
}

func (s *RuleDetail) SetNumpeople(v int64) *RuleDetail {
	s.Numpeople = &v
	return s
}

// 对账单
type Reconciliation struct {
	// 供应商
	SupCode *string `json:"sup_code,omitempty" xml:"sup_code,omitempty" require:"true"`
	// 供应商名称
	SupName *string `json:"sup_name,omitempty" xml:"sup_name,omitempty" require:"true"`
	// 结算金额(单位分)
	SettlementAmount *int64 `json:"settlement_amount,omitempty" xml:"settlement_amount,omitempty" require:"true"`
	// 长城确认时间
	ConfirmDateGw *string `json:"confirm_date_gw,omitempty" xml:"confirm_date_gw,omitempty" require:"true"`
	// 长城方确认人
	ConfirmerGw *string `json:"confirmer_gw,omitempty" xml:"confirmer_gw,omitempty" require:"true"`
	// 长城确认状态
	ConfirmStateGw *string `json:"confirm_state_gw,omitempty" xml:"confirm_state_gw,omitempty" require:"true"`
	// 服务方确认时间
	ConfirmDateSup *string `json:"confirm_date_sup,omitempty" xml:"confirm_date_sup,omitempty" require:"true"`
	// 服务方确认人
	ConfirmerSup *string `json:"confirmer_sup,omitempty" xml:"confirmer_sup,omitempty" require:"true"`
	// 服务方确认状态
	ConfirmStateSup *string `json:"confirm_state_sup,omitempty" xml:"confirm_state_sup,omitempty" require:"true"`
	// 计算时间
	SocreDate *string `json:"socre_date,omitempty" xml:"socre_date,omitempty" require:"true"`
}

func (s Reconciliation) String() string {
	return tea.Prettify(s)
}

func (s Reconciliation) GoString() string {
	return s.String()
}

func (s *Reconciliation) SetSupCode(v string) *Reconciliation {
	s.SupCode = &v
	return s
}

func (s *Reconciliation) SetSupName(v string) *Reconciliation {
	s.SupName = &v
	return s
}

func (s *Reconciliation) SetSettlementAmount(v int64) *Reconciliation {
	s.SettlementAmount = &v
	return s
}

func (s *Reconciliation) SetConfirmDateGw(v string) *Reconciliation {
	s.ConfirmDateGw = &v
	return s
}

func (s *Reconciliation) SetConfirmerGw(v string) *Reconciliation {
	s.ConfirmerGw = &v
	return s
}

func (s *Reconciliation) SetConfirmStateGw(v string) *Reconciliation {
	s.ConfirmStateGw = &v
	return s
}

func (s *Reconciliation) SetConfirmDateSup(v string) *Reconciliation {
	s.ConfirmDateSup = &v
	return s
}

func (s *Reconciliation) SetConfirmerSup(v string) *Reconciliation {
	s.ConfirmerSup = &v
	return s
}

func (s *Reconciliation) SetConfirmStateSup(v string) *Reconciliation {
	s.ConfirmStateSup = &v
	return s
}

func (s *Reconciliation) SetSocreDate(v string) *Reconciliation {
	s.SocreDate = &v
	return s
}

// 供应商
type SpProvider struct {
	// 供应商编号
	SupCode *string `json:"sup_code,omitempty" xml:"sup_code,omitempty" require:"true"`
	// 供应商名称
	SupName *string `json:"sup_name,omitempty" xml:"sup_name,omitempty" require:"true"`
	// 文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 文件code
	FileCode *string `json:"file_code,omitempty" xml:"file_code,omitempty" require:"true"`
	// hash的值
	HashCode *string `json:"hash_code,omitempty" xml:"hash_code,omitempty" require:"true"`
	// 开始时间
	StartDate *string `json:"start_date,omitempty" xml:"start_date,omitempty" require:"true"`
	// 结束日期
	ClosingDate *string `json:"closing_date,omitempty" xml:"closing_date,omitempty" require:"true"`
	// 文件路径
	FilePath *string `json:"file_path,omitempty" xml:"file_path,omitempty" require:"true"`
	// 2021-03-04 11:16:23
	CreateDate *string `json:"create_date,omitempty" xml:"create_date,omitempty" require:"true"`
	// 创建者
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty" require:"true"`
}

func (s SpProvider) String() string {
	return tea.Prettify(s)
}

func (s SpProvider) GoString() string {
	return s.String()
}

func (s *SpProvider) SetSupCode(v string) *SpProvider {
	s.SupCode = &v
	return s
}

func (s *SpProvider) SetSupName(v string) *SpProvider {
	s.SupName = &v
	return s
}

func (s *SpProvider) SetFileName(v string) *SpProvider {
	s.FileName = &v
	return s
}

func (s *SpProvider) SetFileCode(v string) *SpProvider {
	s.FileCode = &v
	return s
}

func (s *SpProvider) SetHashCode(v string) *SpProvider {
	s.HashCode = &v
	return s
}

func (s *SpProvider) SetStartDate(v string) *SpProvider {
	s.StartDate = &v
	return s
}

func (s *SpProvider) SetClosingDate(v string) *SpProvider {
	s.ClosingDate = &v
	return s
}

func (s *SpProvider) SetFilePath(v string) *SpProvider {
	s.FilePath = &v
	return s
}

func (s *SpProvider) SetCreateDate(v string) *SpProvider {
	s.CreateDate = &v
	return s
}

func (s *SpProvider) SetCreator(v string) *SpProvider {
	s.Creator = &v
	return s
}

type ApplyAntchainBbpContractRuleRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 服务提供商
	SpProvider *SpProvider `json:"sp_provider,omitempty" xml:"sp_provider,omitempty" require:"true"`
	// 明细
	RuleDetails []*RuleDetail `json:"rule_details,omitempty" xml:"rule_details,omitempty" require:"true" type:"Repeated"`
	// confirmer
	Confirmer *string `json:"confirmer,omitempty" xml:"confirmer,omitempty" require:"true"`
	// 确认时间
	ConfirmDate *string `json:"confirm_date,omitempty" xml:"confirm_date,omitempty" require:"true"`
	// confirm_status
	ConfirmStatus *string `json:"confirm_status,omitempty" xml:"confirm_status,omitempty" require:"true"`
}

func (s ApplyAntchainBbpContractRuleRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyAntchainBbpContractRuleRequest) GoString() string {
	return s.String()
}

func (s *ApplyAntchainBbpContractRuleRequest) SetAuthToken(v string) *ApplyAntchainBbpContractRuleRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyAntchainBbpContractRuleRequest) SetProductInstanceId(v string) *ApplyAntchainBbpContractRuleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyAntchainBbpContractRuleRequest) SetSpProvider(v *SpProvider) *ApplyAntchainBbpContractRuleRequest {
	s.SpProvider = v
	return s
}

func (s *ApplyAntchainBbpContractRuleRequest) SetRuleDetails(v []*RuleDetail) *ApplyAntchainBbpContractRuleRequest {
	s.RuleDetails = v
	return s
}

func (s *ApplyAntchainBbpContractRuleRequest) SetConfirmer(v string) *ApplyAntchainBbpContractRuleRequest {
	s.Confirmer = &v
	return s
}

func (s *ApplyAntchainBbpContractRuleRequest) SetConfirmDate(v string) *ApplyAntchainBbpContractRuleRequest {
	s.ConfirmDate = &v
	return s
}

func (s *ApplyAntchainBbpContractRuleRequest) SetConfirmStatus(v string) *ApplyAntchainBbpContractRuleRequest {
	s.ConfirmStatus = &v
	return s
}

type ApplyAntchainBbpContractRuleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ApplyAntchainBbpContractRuleResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyAntchainBbpContractRuleResponse) GoString() string {
	return s.String()
}

func (s *ApplyAntchainBbpContractRuleResponse) SetReqMsgId(v string) *ApplyAntchainBbpContractRuleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyAntchainBbpContractRuleResponse) SetResultCode(v string) *ApplyAntchainBbpContractRuleResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyAntchainBbpContractRuleResponse) SetResultMsg(v string) *ApplyAntchainBbpContractRuleResponse {
	s.ResultMsg = &v
	return s
}

type QueryAntchainBbpContractReconciliationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 供应商code
	SupCode *string `json:"sup_code,omitempty" xml:"sup_code,omitempty" require:"true"`
	// 月份
	ScoreDates []*string `json:"score_dates,omitempty" xml:"score_dates,omitempty" require:"true" type:"Repeated"`
}

func (s QueryAntchainBbpContractReconciliationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainBbpContractReconciliationRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainBbpContractReconciliationRequest) SetAuthToken(v string) *QueryAntchainBbpContractReconciliationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainBbpContractReconciliationRequest) SetProductInstanceId(v string) *QueryAntchainBbpContractReconciliationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainBbpContractReconciliationRequest) SetSupCode(v string) *QueryAntchainBbpContractReconciliationRequest {
	s.SupCode = &v
	return s
}

func (s *QueryAntchainBbpContractReconciliationRequest) SetScoreDates(v []*string) *QueryAntchainBbpContractReconciliationRequest {
	s.ScoreDates = v
	return s
}

type QueryAntchainBbpContractReconciliationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结算单
	Reconciliations []*Reconciliation `json:"reconciliations,omitempty" xml:"reconciliations,omitempty" type:"Repeated"`
}

func (s QueryAntchainBbpContractReconciliationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainBbpContractReconciliationResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainBbpContractReconciliationResponse) SetReqMsgId(v string) *QueryAntchainBbpContractReconciliationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainBbpContractReconciliationResponse) SetResultCode(v string) *QueryAntchainBbpContractReconciliationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainBbpContractReconciliationResponse) SetResultMsg(v string) *QueryAntchainBbpContractReconciliationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainBbpContractReconciliationResponse) SetReconciliations(v []*Reconciliation) *QueryAntchainBbpContractReconciliationResponse {
	s.Reconciliations = v
	return s
}

type QueryDemoSaasTestTestaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 张三
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 12
	Age *int64 `json:"age,omitempty" xml:"age,omitempty" require:"true"`
}

func (s QueryDemoSaasTestTestaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoSaasTestTestaRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoSaasTestTestaRequest) SetAuthToken(v string) *QueryDemoSaasTestTestaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoSaasTestTestaRequest) SetProductInstanceId(v string) *QueryDemoSaasTestTestaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDemoSaasTestTestaRequest) SetName(v string) *QueryDemoSaasTestTestaRequest {
	s.Name = &v
	return s
}

func (s *QueryDemoSaasTestTestaRequest) SetAge(v int64) *QueryDemoSaasTestTestaRequest {
	s.Age = &v
	return s
}

type QueryDemoSaasTestTestaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 男
	Sex *string `json:"sex,omitempty" xml:"sex,omitempty"`
}

func (s QueryDemoSaasTestTestaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoSaasTestTestaResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoSaasTestTestaResponse) SetReqMsgId(v string) *QueryDemoSaasTestTestaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoSaasTestTestaResponse) SetResultCode(v string) *QueryDemoSaasTestTestaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoSaasTestTestaResponse) SetResultMsg(v string) *QueryDemoSaasTestTestaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDemoSaasTestTestaResponse) SetSex(v string) *QueryDemoSaasTestTestaResponse {
	s.Sex = &v
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
				"sdk_version":      tea.String("1.0.1"),
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
 * Description: 定义外包的薪资方案接口,以【服务商、项目类别、领域、角色、资质】为unique
 * Summary: 外包薪资规则合约发布接口
 */
func (client *Client) ApplyAntchainBbpContractRule(request *ApplyAntchainBbpContractRuleRequest) (_result *ApplyAntchainBbpContractRuleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyAntchainBbpContractRuleResponse{}
	_body, _err := client.ApplyAntchainBbpContractRuleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 定义外包的薪资方案接口,以【服务商、项目类别、领域、角色、资质】为unique
 * Summary: 外包薪资规则合约发布接口
 */
func (client *Client) ApplyAntchainBbpContractRuleEx(request *ApplyAntchainBbpContractRuleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyAntchainBbpContractRuleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyAntchainBbpContractRuleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.contract.rule.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询结算单
 * Summary: 查询结算单
 */
func (client *Client) QueryAntchainBbpContractReconciliation(request *QueryAntchainBbpContractReconciliationRequest) (_result *QueryAntchainBbpContractReconciliationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainBbpContractReconciliationResponse{}
	_body, _err := client.QueryAntchainBbpContractReconciliationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询结算单
 * Summary: 查询结算单
 */
func (client *Client) QueryAntchainBbpContractReconciliationEx(request *QueryAntchainBbpContractReconciliationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainBbpContractReconciliationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainBbpContractReconciliationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.contract.reconciliation.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: testa
 * Summary: 测试用api
 */
func (client *Client) QueryDemoSaasTestTesta(request *QueryDemoSaasTestTestaRequest) (_result *QueryDemoSaasTestTestaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoSaasTestTestaResponse{}
	_body, _err := client.QueryDemoSaasTestTestaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: testa
 * Summary: 测试用api
 */
func (client *Client) QueryDemoSaasTestTestaEx(request *QueryDemoSaasTestTestaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoSaasTestTestaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoSaasTestTestaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.saas.test.testa.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
