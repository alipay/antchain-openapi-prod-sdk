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

// 多币种金额
type MultiCurrencyMoney struct {
	// 金额，以分为单位
	Cent *string `json:"cent,omitempty" xml:"cent,omitempty" require:"true"`
	// 币种编码
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty" require:"true"`
	// 金额，以元为单位，保留2位小数
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
}

func (s MultiCurrencyMoney) String() string {
	return tea.Prettify(s)
}

func (s MultiCurrencyMoney) GoString() string {
	return s.String()
}

func (s *MultiCurrencyMoney) SetCent(v string) *MultiCurrencyMoney {
	s.Cent = &v
	return s
}

func (s *MultiCurrencyMoney) SetCurrency(v string) *MultiCurrencyMoney {
	s.Currency = &v
	return s
}

func (s *MultiCurrencyMoney) SetAmount(v string) *MultiCurrencyMoney {
	s.Amount = &v
	return s
}

// 内部投资者报表数据(资产包维度)
type InvestmentReportByPackageInner struct {
	// 预期收益
	EstimatedAnnualized *MultiCurrencyMoney `json:"estimated_annualized,omitempty" xml:"estimated_annualized,omitempty" require:"true"`
	// 实际收益率(Annual Yield)
	ActualAnnualizedYield *string `json:"actual_annualized_yield,omitempty" xml:"actual_annualized_yield,omitempty" require:"true"`
	// 预期收益率（Expect Yield）
	EstimatedAnnualizedYield *string `json:"estimated_annualized_yield,omitempty" xml:"estimated_annualized_yield,omitempty" require:"true"`
	// 毛利吻合率（Gross Profit Conformity）
	MatchRate *string `json:"match_rate,omitempty" xml:"match_rate,omitempty" require:"true"`
	// 投资金额（Investment Allocation）
	InvestmentAmount *MultiCurrencyMoney `json:"investment_amount,omitempty" xml:"investment_amount,omitempty" require:"true"`
	// 实际收益
	ActualAnnualized *MultiCurrencyMoney `json:"actual_annualized,omitempty" xml:"actual_annualized,omitempty" require:"true"`
	// 资产抵押率（Collateral Ratio）
	CollateralRate *string `json:"collateral_rate,omitempty" xml:"collateral_rate,omitempty" require:"true"`
	// 数据日期
	Dt *string `json:"dt,omitempty" xml:"dt,omitempty" require:"true"`
	// 现金流覆盖季度还款金额比例
	CashFlowCoverageQuarterlyRepaymentAmountRatio *string `json:"cash_flow_coverage_quarterly_repayment_amount_ratio,omitempty" xml:"cash_flow_coverage_quarterly_repayment_amount_ratio,omitempty" require:"true"`
	// 现金流
	CashFlow *MultiCurrencyMoney `json:"cash_flow,omitempty" xml:"cash_flow,omitempty" require:"true"`
	// 抵押物总值
	CollateralTotalValue *MultiCurrencyMoney `json:"collateral_total_value,omitempty" xml:"collateral_total_value,omitempty" require:"true"`
}

func (s InvestmentReportByPackageInner) String() string {
	return tea.Prettify(s)
}

func (s InvestmentReportByPackageInner) GoString() string {
	return s.String()
}

func (s *InvestmentReportByPackageInner) SetEstimatedAnnualized(v *MultiCurrencyMoney) *InvestmentReportByPackageInner {
	s.EstimatedAnnualized = v
	return s
}

func (s *InvestmentReportByPackageInner) SetActualAnnualizedYield(v string) *InvestmentReportByPackageInner {
	s.ActualAnnualizedYield = &v
	return s
}

func (s *InvestmentReportByPackageInner) SetEstimatedAnnualizedYield(v string) *InvestmentReportByPackageInner {
	s.EstimatedAnnualizedYield = &v
	return s
}

func (s *InvestmentReportByPackageInner) SetMatchRate(v string) *InvestmentReportByPackageInner {
	s.MatchRate = &v
	return s
}

func (s *InvestmentReportByPackageInner) SetInvestmentAmount(v *MultiCurrencyMoney) *InvestmentReportByPackageInner {
	s.InvestmentAmount = v
	return s
}

func (s *InvestmentReportByPackageInner) SetActualAnnualized(v *MultiCurrencyMoney) *InvestmentReportByPackageInner {
	s.ActualAnnualized = v
	return s
}

func (s *InvestmentReportByPackageInner) SetCollateralRate(v string) *InvestmentReportByPackageInner {
	s.CollateralRate = &v
	return s
}

func (s *InvestmentReportByPackageInner) SetDt(v string) *InvestmentReportByPackageInner {
	s.Dt = &v
	return s
}

func (s *InvestmentReportByPackageInner) SetCashFlowCoverageQuarterlyRepaymentAmountRatio(v string) *InvestmentReportByPackageInner {
	s.CashFlowCoverageQuarterlyRepaymentAmountRatio = &v
	return s
}

func (s *InvestmentReportByPackageInner) SetCashFlow(v *MultiCurrencyMoney) *InvestmentReportByPackageInner {
	s.CashFlow = v
	return s
}

func (s *InvestmentReportByPackageInner) SetCollateralTotalValue(v *MultiCurrencyMoney) *InvestmentReportByPackageInner {
	s.CollateralTotalValue = v
	return s
}

//   内部投资者报表数据
type InvestmentReportInner struct {
	// 预期收益
	//
	EstimatedAnnualized *MultiCurrencyMoney `json:"estimated_annualized,omitempty" xml:"estimated_annualized,omitempty" require:"true"`
	// 实际收益率（Annual Yield）
	//
	ActualAnnualizedYield *string `json:"actual_annualized_yield,omitempty" xml:"actual_annualized_yield,omitempty" require:"true"`
	// 预期收益率（Expect Yield）
	EstimatedAnnualizedYield *string `json:"estimated_annualized_yield,omitempty" xml:"estimated_annualized_yield,omitempty" require:"true"`
	// 毛利吻合率（Gross Profit Conformity）
	MatchRate *string `json:"match_rate,omitempty" xml:"match_rate,omitempty" require:"true"`
	// 投资金额（Investment Allocation）
	InvestmentAmount *MultiCurrencyMoney `json:"investment_amount,omitempty" xml:"investment_amount,omitempty" require:"true"`
	// 实际收益
	ActualAnnualized *MultiCurrencyMoney `json:"actual_annualized,omitempty" xml:"actual_annualized,omitempty" require:"true"`
	// 资产抵押率（Collateral Ratio）
	CollateralRate *string `json:"collateral_rate,omitempty" xml:"collateral_rate,omitempty" require:"true"`
	// 数据日期
	Dt *string `json:"dt,omitempty" xml:"dt,omitempty" require:"true"`
	// 现金流覆盖季度还款金额比例
	CashFlowCoverageQuarterlyRepaymentAmountRatio *string `json:"cash_flow_coverage_quarterly_repayment_amount_ratio,omitempty" xml:"cash_flow_coverage_quarterly_repayment_amount_ratio,omitempty" require:"true"`
	// 现金流
	CashFlow *MultiCurrencyMoney `json:"cash_flow,omitempty" xml:"cash_flow,omitempty" require:"true"`
	// 初始资产总值
	InitialAssetTotalValue *MultiCurrencyMoney `json:"initial_asset_total_value,omitempty" xml:"initial_asset_total_value,omitempty" require:"true"`
}

func (s InvestmentReportInner) String() string {
	return tea.Prettify(s)
}

func (s InvestmentReportInner) GoString() string {
	return s.String()
}

func (s *InvestmentReportInner) SetEstimatedAnnualized(v *MultiCurrencyMoney) *InvestmentReportInner {
	s.EstimatedAnnualized = v
	return s
}

func (s *InvestmentReportInner) SetActualAnnualizedYield(v string) *InvestmentReportInner {
	s.ActualAnnualizedYield = &v
	return s
}

func (s *InvestmentReportInner) SetEstimatedAnnualizedYield(v string) *InvestmentReportInner {
	s.EstimatedAnnualizedYield = &v
	return s
}

func (s *InvestmentReportInner) SetMatchRate(v string) *InvestmentReportInner {
	s.MatchRate = &v
	return s
}

func (s *InvestmentReportInner) SetInvestmentAmount(v *MultiCurrencyMoney) *InvestmentReportInner {
	s.InvestmentAmount = v
	return s
}

func (s *InvestmentReportInner) SetActualAnnualized(v *MultiCurrencyMoney) *InvestmentReportInner {
	s.ActualAnnualized = v
	return s
}

func (s *InvestmentReportInner) SetCollateralRate(v string) *InvestmentReportInner {
	s.CollateralRate = &v
	return s
}

func (s *InvestmentReportInner) SetDt(v string) *InvestmentReportInner {
	s.Dt = &v
	return s
}

func (s *InvestmentReportInner) SetCashFlowCoverageQuarterlyRepaymentAmountRatio(v string) *InvestmentReportInner {
	s.CashFlowCoverageQuarterlyRepaymentAmountRatio = &v
	return s
}

func (s *InvestmentReportInner) SetCashFlow(v *MultiCurrencyMoney) *InvestmentReportInner {
	s.CashFlow = v
	return s
}

func (s *InvestmentReportInner) SetInitialAssetTotalValue(v *MultiCurrencyMoney) *InvestmentReportInner {
	s.InitialAssetTotalValue = v
	return s
}

type QueryPlatformInvestmentreportRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 可信产业资产项目批次id
	ProjectExternalId *string `json:"project_external_id,omitempty" xml:"project_external_id,omitempty" require:"true"`
}

func (s QueryPlatformInvestmentreportRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryPlatformInvestmentreportRequest) GoString() string {
	return s.String()
}

func (s *QueryPlatformInvestmentreportRequest) SetAuthToken(v string) *QueryPlatformInvestmentreportRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryPlatformInvestmentreportRequest) SetProductInstanceId(v string) *QueryPlatformInvestmentreportRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryPlatformInvestmentreportRequest) SetProjectExternalId(v string) *QueryPlatformInvestmentreportRequest {
	s.ProjectExternalId = &v
	return s
}

type QueryPlatformInvestmentreportResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 内部投资者报表数据
	Data *InvestmentReportInner `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryPlatformInvestmentreportResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryPlatformInvestmentreportResponse) GoString() string {
	return s.String()
}

func (s *QueryPlatformInvestmentreportResponse) SetReqMsgId(v string) *QueryPlatformInvestmentreportResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryPlatformInvestmentreportResponse) SetResultCode(v string) *QueryPlatformInvestmentreportResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryPlatformInvestmentreportResponse) SetResultMsg(v string) *QueryPlatformInvestmentreportResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryPlatformInvestmentreportResponse) SetData(v *InvestmentReportInner) *QueryPlatformInvestmentreportResponse {
	s.Data = v
	return s
}

type QueryPlatformInvestmentreportbypackageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 可信产业资产项目批次id
	ProjectExternalId *string `json:"project_external_id,omitempty" xml:"project_external_id,omitempty" require:"true"`
	// 资产包id
	AssetPackageId *string `json:"asset_package_id,omitempty" xml:"asset_package_id,omitempty" require:"true"`
}

func (s QueryPlatformInvestmentreportbypackageRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryPlatformInvestmentreportbypackageRequest) GoString() string {
	return s.String()
}

func (s *QueryPlatformInvestmentreportbypackageRequest) SetAuthToken(v string) *QueryPlatformInvestmentreportbypackageRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryPlatformInvestmentreportbypackageRequest) SetProductInstanceId(v string) *QueryPlatformInvestmentreportbypackageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryPlatformInvestmentreportbypackageRequest) SetProjectExternalId(v string) *QueryPlatformInvestmentreportbypackageRequest {
	s.ProjectExternalId = &v
	return s
}

func (s *QueryPlatformInvestmentreportbypackageRequest) SetAssetPackageId(v string) *QueryPlatformInvestmentreportbypackageRequest {
	s.AssetPackageId = &v
	return s
}

type QueryPlatformInvestmentreportbypackageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 内部投资者报表数据(资产包维度)
	Data *InvestmentReportByPackageInner `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryPlatformInvestmentreportbypackageResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryPlatformInvestmentreportbypackageResponse) GoString() string {
	return s.String()
}

func (s *QueryPlatformInvestmentreportbypackageResponse) SetReqMsgId(v string) *QueryPlatformInvestmentreportbypackageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryPlatformInvestmentreportbypackageResponse) SetResultCode(v string) *QueryPlatformInvestmentreportbypackageResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryPlatformInvestmentreportbypackageResponse) SetResultMsg(v string) *QueryPlatformInvestmentreportbypackageResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryPlatformInvestmentreportbypackageResponse) SetData(v *InvestmentReportByPackageInner) *QueryPlatformInvestmentreportbypackageResponse {
	s.Data = v
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
				"sdk_version":      tea.String("1.0.6"),
				"_prod_code":       tea.String("WEBTRWATRADE_INNER"),
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

/**
 * Description: 投资者报表查询
 * Summary: 投资者报表查询
 */
func (client *Client) QueryPlatformInvestmentreport(request *QueryPlatformInvestmentreportRequest) (_result *QueryPlatformInvestmentreportResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryPlatformInvestmentreportResponse{}
	_body, _err := client.QueryPlatformInvestmentreportEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 投资者报表查询
 * Summary: 投资者报表查询
 */
func (client *Client) QueryPlatformInvestmentreportEx(request *QueryPlatformInvestmentreportRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryPlatformInvestmentreportResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryPlatformInvestmentreportResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatradeinner.platform.investmentreport.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 投资者报表查询(资产包维度)
 * Summary: 投资者报表查询(资产包维度)
 */
func (client *Client) QueryPlatformInvestmentreportbypackage(request *QueryPlatformInvestmentreportbypackageRequest) (_result *QueryPlatformInvestmentreportbypackageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryPlatformInvestmentreportbypackageResponse{}
	_body, _err := client.QueryPlatformInvestmentreportbypackageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 投资者报表查询(资产包维度)
 * Summary: 投资者报表查询(资产包维度)
 */
func (client *Client) QueryPlatformInvestmentreportbypackageEx(request *QueryPlatformInvestmentreportbypackageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryPlatformInvestmentreportbypackageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryPlatformInvestmentreportbypackageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatradeinner.platform.investmentreportbypackage.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
