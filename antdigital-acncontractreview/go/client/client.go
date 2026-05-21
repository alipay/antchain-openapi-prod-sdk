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

// 文件合同信息
type ContractFile struct {
	// 文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// 文件下载地址
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty"`
	// 文件类型，如 docx、pdf
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty"`
}

func (s ContractFile) String() string {
	return tea.Prettify(s)
}

func (s ContractFile) GoString() string {
	return s.String()
}

func (s *ContractFile) SetFileName(v string) *ContractFile {
	s.FileName = &v
	return s
}

func (s *ContractFile) SetFileUrl(v string) *ContractFile {
	s.FileUrl = &v
	return s
}

func (s *ContractFile) SetFileType(v string) *ContractFile {
	s.FileType = &v
	return s
}

// 审核记录
type AuditRecordItem struct {
	// 审核id
	AuditId *string `json:"audit_id,omitempty" xml:"audit_id,omitempty" require:"true"`
	// 状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 合同名称
	ContractFileName *string `json:"contract_file_name,omitempty" xml:"contract_file_name,omitempty" require:"true"`
	// 创建人id
	CreatorWorkNo *string `json:"creator_work_no,omitempty" xml:"creator_work_no,omitempty" require:"true"`
	// 创建人名称
	CreatorName *string `json:"creator_name,omitempty" xml:"creator_name,omitempty" require:"true"`
	// 基准线库名称
	BaselineLibraryName *string `json:"baseline_library_name,omitempty" xml:"baseline_library_name,omitempty" require:"true"`
	// 基准线id
	BuId *string `json:"bu_id,omitempty" xml:"bu_id,omitempty" require:"true"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 原始文件
	OriginalFile *ContractFile `json:"original_file,omitempty" xml:"original_file,omitempty"`
	// 当前编辑文件（定稿文件）
	FinalFile *ContractFile `json:"final_file,omitempty" xml:"final_file,omitempty"`
}

func (s AuditRecordItem) String() string {
	return tea.Prettify(s)
}

func (s AuditRecordItem) GoString() string {
	return s.String()
}

func (s *AuditRecordItem) SetAuditId(v string) *AuditRecordItem {
	s.AuditId = &v
	return s
}

func (s *AuditRecordItem) SetStatus(v string) *AuditRecordItem {
	s.Status = &v
	return s
}

func (s *AuditRecordItem) SetContractFileName(v string) *AuditRecordItem {
	s.ContractFileName = &v
	return s
}

func (s *AuditRecordItem) SetCreatorWorkNo(v string) *AuditRecordItem {
	s.CreatorWorkNo = &v
	return s
}

func (s *AuditRecordItem) SetCreatorName(v string) *AuditRecordItem {
	s.CreatorName = &v
	return s
}

func (s *AuditRecordItem) SetBaselineLibraryName(v string) *AuditRecordItem {
	s.BaselineLibraryName = &v
	return s
}

func (s *AuditRecordItem) SetBuId(v string) *AuditRecordItem {
	s.BuId = &v
	return s
}

func (s *AuditRecordItem) SetGmtCreate(v string) *AuditRecordItem {
	s.GmtCreate = &v
	return s
}

func (s *AuditRecordItem) SetGmtModified(v string) *AuditRecordItem {
	s.GmtModified = &v
	return s
}

func (s *AuditRecordItem) SetOriginalFile(v *ContractFile) *AuditRecordItem {
	s.OriginalFile = v
	return s
}

func (s *AuditRecordItem) SetFinalFile(v *ContractFile) *AuditRecordItem {
	s.FinalFile = v
	return s
}

type QueryAntcloudContractaiAuditRecordRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 当前页
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" require:"true"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 合同名称
	ContractFileName *string `json:"contract_file_name,omitempty" xml:"contract_file_name,omitempty"`
	// 开始时间
	CreateStartTime *string `json:"create_start_time,omitempty" xml:"create_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 结束时间
	CreateEndTime *string `json:"create_end_time,omitempty" xml:"create_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// PROCESSING：合同审核任务已提交，正在异步处理中
	// SUCCESS：合同审核已完成，结果可查询
	// FAIL：合同审核过程中发生错误，审核失败
	// FINALIZED：合同已完成定稿操作，生成最终版本
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 创建人id
	CreatorWorkNo *string `json:"creator_work_no,omitempty" xml:"creator_work_no,omitempty"`
	// 创建人名称
	CreatorName *string `json:"creator_name,omitempty" xml:"creator_name,omitempty"`
	// 基准线库名称
	BaselineLibraryName *string `json:"baseline_library_name,omitempty" xml:"baseline_library_name,omitempty"`
	// 终端客户id
	EndCustomerId *string `json:"end_customer_id,omitempty" xml:"end_customer_id,omitempty"`
}

func (s QueryAntcloudContractaiAuditRecordRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntcloudContractaiAuditRecordRequest) GoString() string {
	return s.String()
}

func (s *QueryAntcloudContractaiAuditRecordRequest) SetAuthToken(v string) *QueryAntcloudContractaiAuditRecordRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntcloudContractaiAuditRecordRequest) SetPageNo(v int64) *QueryAntcloudContractaiAuditRecordRequest {
	s.PageNo = &v
	return s
}

func (s *QueryAntcloudContractaiAuditRecordRequest) SetPageSize(v int64) *QueryAntcloudContractaiAuditRecordRequest {
	s.PageSize = &v
	return s
}

func (s *QueryAntcloudContractaiAuditRecordRequest) SetContractFileName(v string) *QueryAntcloudContractaiAuditRecordRequest {
	s.ContractFileName = &v
	return s
}

func (s *QueryAntcloudContractaiAuditRecordRequest) SetCreateStartTime(v string) *QueryAntcloudContractaiAuditRecordRequest {
	s.CreateStartTime = &v
	return s
}

func (s *QueryAntcloudContractaiAuditRecordRequest) SetCreateEndTime(v string) *QueryAntcloudContractaiAuditRecordRequest {
	s.CreateEndTime = &v
	return s
}

func (s *QueryAntcloudContractaiAuditRecordRequest) SetStatus(v string) *QueryAntcloudContractaiAuditRecordRequest {
	s.Status = &v
	return s
}

func (s *QueryAntcloudContractaiAuditRecordRequest) SetCreatorWorkNo(v string) *QueryAntcloudContractaiAuditRecordRequest {
	s.CreatorWorkNo = &v
	return s
}

func (s *QueryAntcloudContractaiAuditRecordRequest) SetCreatorName(v string) *QueryAntcloudContractaiAuditRecordRequest {
	s.CreatorName = &v
	return s
}

func (s *QueryAntcloudContractaiAuditRecordRequest) SetBaselineLibraryName(v string) *QueryAntcloudContractaiAuditRecordRequest {
	s.BaselineLibraryName = &v
	return s
}

func (s *QueryAntcloudContractaiAuditRecordRequest) SetEndCustomerId(v string) *QueryAntcloudContractaiAuditRecordRequest {
	s.EndCustomerId = &v
	return s
}

type QueryAntcloudContractaiAuditRecordResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前页
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总记录数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 审核记录
	Records []*AuditRecordItem `json:"records,omitempty" xml:"records,omitempty" type:"Repeated"`
}

func (s QueryAntcloudContractaiAuditRecordResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntcloudContractaiAuditRecordResponse) GoString() string {
	return s.String()
}

func (s *QueryAntcloudContractaiAuditRecordResponse) SetReqMsgId(v string) *QueryAntcloudContractaiAuditRecordResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntcloudContractaiAuditRecordResponse) SetResultCode(v string) *QueryAntcloudContractaiAuditRecordResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntcloudContractaiAuditRecordResponse) SetResultMsg(v string) *QueryAntcloudContractaiAuditRecordResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntcloudContractaiAuditRecordResponse) SetPageNo(v int64) *QueryAntcloudContractaiAuditRecordResponse {
	s.PageNo = &v
	return s
}

func (s *QueryAntcloudContractaiAuditRecordResponse) SetPageSize(v int64) *QueryAntcloudContractaiAuditRecordResponse {
	s.PageSize = &v
	return s
}

func (s *QueryAntcloudContractaiAuditRecordResponse) SetTotalCount(v int64) *QueryAntcloudContractaiAuditRecordResponse {
	s.TotalCount = &v
	return s
}

func (s *QueryAntcloudContractaiAuditRecordResponse) SetRecords(v []*AuditRecordItem) *QueryAntcloudContractaiAuditRecordResponse {
	s.Records = v
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
				"sdk_version":      tea.String("1.0.2"),
				"_prod_code":       tea.String("ACNCONTRACTREVIEW"),
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
 * Description: 合同审核记录查询
 * Summary: 合同审核记录查询
 */
func (client *Client) QueryAntcloudContractaiAuditRecord(request *QueryAntcloudContractaiAuditRecordRequest) (_result *QueryAntcloudContractaiAuditRecordResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntcloudContractaiAuditRecordResponse{}
	_body, _err := client.QueryAntcloudContractaiAuditRecordEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 合同审核记录查询
 * Summary: 合同审核记录查询
 */
func (client *Client) QueryAntcloudContractaiAuditRecordEx(request *QueryAntcloudContractaiAuditRecordRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntcloudContractaiAuditRecordResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntcloudContractaiAuditRecordResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.contractai.audit.record.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
